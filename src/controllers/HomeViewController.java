
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import views.HomeView;
import views.RRView;
import views.SRTFView;


public class HomeViewController implements ActionListener {

    private HomeView homeView;

    public HomeViewController(HomeView homeView) {
        
        System.out.println("HomeViewController Inicializado");
        this.homeView = homeView;

        //Inicializamos los listeners para el HomeView
        homeView.getRrButton().addActionListener(this);
        homeView.getSrtfButton().addActionListener(this);
        homeView.getExitButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (homeView.getSrtfButton() == e.getSource()) {
            System.out.println("Button SRTF");
            homeView.setVisible(false);
            SRTFView srtfView = new SRTFView();
            srtfView.setLocationRelativeTo(null);
            srtfView.setVisible(true);
            
            //Inicializamos el controlador de SRTF
            SRTFViewController srtfViewController = new SRTFViewController(srtfView, this);
        }
        if (homeView.getRrButton() == e.getSource()) {
            System.out.println("Button RR");
            homeView.setVisible(false);
            RRView rrView = new RRView();
            rrView.setLocationRelativeTo(null);
            rrView.setVisible(true);
            
            //Inicializamos el controlador de RRView
            RRViewController rrViewController = new RRViewController(rrView, this);
        }
        if(homeView.getExitButton() == e.getSource()){
           System.out.println("Exit Button");
           System.exit(0);
        }

    }

    public HomeView getHomeView() {
        return homeView;
    }

    
    
}
