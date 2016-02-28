/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muselightswitch;

/**
 * The <code>LightSwitch</code> represents a physical light switch, which can be
 * turned on and off.
 *
 * @author Christopher Wells <cwellsny@nycap.rr.com>
 */
public class LightSwitch {

    private boolean state;

    /**
     * Initializes a <code>LightSwitch</code> object with the given initial
     * state.
     *
     * @param i The initial state of the LightSwitch.
     */
    public LightSwitch(boolean i) {
        this.state = i;
    }

    /**
     * Turns the LightSwitch off.
     */
    public void turnOff() {
        this.state = false;
    }

    /**
     * Turns the LightSwitch on.
     */
    public void turnOn() {
        this.state = true;
    }

    /**
     * Toggles the state of the LightSwitch.
     */
    public void toggleState() {
        this.state = !this.state;
    }

}
