/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muselightswitch;

import oscP5.*;

/**
 * The <code>MuseOscServer</code> handles the data output given by the Muse
 * device.
 *
 * @author Christopher Wells <cwellsny@nycap.rr.com>
 */
public class MuseOscServer {

    private final int port;
    private final OscP5 museServer;
    private final LightSwitch lightSwitch;

    private boolean done;

    /**
     * Instantiates a <code>MuseOscServer</code> object that uses the given port
     * for receiving the data from the Muse device.
     *
     * @param p The port number.
     */
    public MuseOscServer(int p) {
        this.port = p;
        this.museServer = new OscP5(this, p);
        this.lightSwitch = new LightSwitch(false);
        this.done = true;
    }

    /**
     * Toggles the LightSwitch when the user of the Muse device clenches their
     * jaw.
     *
     * @param msg The data that is received from the Muse device.
     */
    public void oscEvent(OscMessage msg) {
        if (msg.checkAddress("/muse/elements/jaw_clench")) {
            if (msg.get(0).booleanValue()) {
                if (this.done) {
                    this.lightSwitch.toggleState();
                    this.done = false;
                }
            } else {
                this.done = true;
            }
        }
    }

}
