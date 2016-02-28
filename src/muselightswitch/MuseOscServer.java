/*
 * The MIT License
 *
 * Copyright 2016 Christopher Wells <cwellsny@nycap.rr.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
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
            if (msg.get(0).intValue() == 1) {
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
