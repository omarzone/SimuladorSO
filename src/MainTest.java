
import controllers.HomeViewController;
import javax.swing.JFrame;
import views.HomeView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Inicializamos vista y controlador principal
        HomeView homeView = new HomeView();
        homeView.setLocationRelativeTo(null);
        homeView.setVisible(true);
        HomeViewController homeViewController = new HomeViewController(homeView);
    }
    
}
