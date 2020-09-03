/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnara.java.main;

import tecnara.java.ifaces.IMusicable;
import tecnara.java.tombola.Tombola;

/**
 *
 * @author marco
 */
public class CochesMain {

    public static void main(String[] args) {

        Tombola tombola = new Tombola();

        IMusicable musicable;
        for (int i = 0; i < 15; i++) {
            musicable = tombola.sortearElemento();
            musicable.iniciarReproduccion();
        }

    }
}
