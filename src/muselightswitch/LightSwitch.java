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
     * Changes the state of the physical light whenever the state of the
     * LightSwitch is changed.
     */
    private void onStateChange() {
        // TODO: Implement code to change the actual physical state of the light
    }

    /**
     * Turns the LightSwitch off.
     */
    public void turnOff() {
        this.state = false;
        this.onStateChange();
    }

    /**
     * Turns the LightSwitch on.
     */
    public void turnOn() {
        this.state = true;
        this.onStateChange();
    }

    /**
     * Toggles the state of the LightSwitch.
     */
    public void toggleState() {
        this.state = !this.state;
        this.onStateChange();
    }

    /**
     * Returns the state of the LightSwitch.
     *
     * @return The state of the LightSwitch.
     */
    public boolean getState() {
        return this.state;
    }

}
