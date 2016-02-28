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
