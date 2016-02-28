/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muselightswitch;

/**
 * The class that handles the main functionality of the program.
 *
 * @author Christopher Wells <cwellsny@nycap.rr.com>
 */
public class Main {

    /**
     * Runs the main functionality of the program.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        int port = 5000;
        MuseOscServer museServer = new MuseOscServer(port);
    }

}
