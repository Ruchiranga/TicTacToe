/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tictactoe;

import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        try {
//            //UIManager.setLookAndFeel(new SyntheticaBlackStarLookAndFeel());
            WelcomeScreen menu = new WelcomeScreen();
            menu.setLocationRelativeTo(null);
            menu.setVisible(true);
//            SinglePlayer tic = new SinglePlayer(null, true);
//            tic.setVisible(true);
//        } catch (UnsupportedLookAndFeelException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }  catch (ParseException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

}
