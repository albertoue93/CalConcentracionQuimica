/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calconcentracionquimica;

import Controller.ControllerMuestra;
import View.FrameMain;
import javax.swing.JFrame;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.SubstanceButtonBorder;

/**
 *
 * @author Priscilla Moraga
 */
public class CalConcentracionQuimica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessBlueSteelSkin"); //BusinessBlueSteelSkin
        SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceBottleGreenTheme");
        SubstanceLookAndFeel.setCurrentButtonShaper("org.jvnet.substance.button.StandardButtonShaper");
        
        FrameMain fm = new FrameMain();
        
        ControllerMuestra cm = new ControllerMuestra(fm);
    }
    
}
