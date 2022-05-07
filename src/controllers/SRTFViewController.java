/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import views.HomeView;
import views.SRTFView;
import views.outputView;

/**
 *
 * @author PC
 */
public class SRTFViewController implements ActionListener {

    private int processCount;
    private SRTFView srtfView;
    private HomeViewController homeViewController;

    public SRTFViewController(SRTFView srtfView, HomeViewController homeViewController) {
        System.out.println("SRTFViewController Inicializado");
        this.srtfView = srtfView;
        processCount = 1;
        this.homeViewController = homeViewController;
        srtfView.getAddProcessButton().addActionListener(this);
        srtfView.getBackToMenuButton().addActionListener(this);
        srtfView.getExecuteButton().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (srtfView.getAddProcessButton() == e.getSource()) {
            if (validateInput()) {
                addProcess();
            } else {
                showMessageDialog(null, "Existen datos incorrectos");
            }
        }
        if (srtfView.getExecuteButton() == e.getSource()) {
            DefaultTableModel model = (DefaultTableModel) srtfView.getProcessTableSRTF().getModel();

            //Se valida que la tabla de procesos no se ecuentre vacia
            if (model.getRowCount() >= 1) {
                outputView outputView = new outputView();
                srtfView.setVisible(false);
                outputView.setLocationRelativeTo(null);
                outputView.setVisible(true);
            } else {
                showMessageDialog(null, "Debe ingresar procesos, antes de ejecutar el algoritmo");
            }
        }

        if (srtfView.getBackToMenuButton() == e.getSource()) {
            srtfView.setVisible(false);
            homeViewController.getHomeView().setVisible(true);
        }
    }

    //Funcion para agregar un proceso en la tabla
    private void addProcess() {
        System.out.println("Proceso agregado a la tabla de manera exitosa");
        String data0 = "P" + processCount;
        String data1 = srtfView.getTxtTR().getText();
        String data2 = srtfView.getTxtTL().getText();
        //String data3 = rrView.getTxtQuantum().getText();

        Object[] row = {data0, data1, data2};

        DefaultTableModel model = (DefaultTableModel) srtfView.getProcessTableSRTF().getModel();

        model.addRow(row);

        processCount++;
        srtfView.getTxtTL().setText(null);
        srtfView.getTxtTR().setText(null);

    }

    //Funcion que valida el tiempo de rafaga, tiempo de llegada y quantum. Antes de agregarlas a la tabla
    private boolean validateInput() {
        if (isNumeric(srtfView.getTxtTR().getText()) && isNumeric(srtfView.getTxtTL().getText())) {
            //System.out.println("Validacion correcta");

            //Despues de validar que son numeros, se verifica que sean mayores que 0
            if (Integer.parseInt(srtfView.getTxtTR().getText()) > 0 && Integer.parseInt(srtfView.getTxtTL().getText()) > 0) {
                System.out.println("Validacion correcta");
                return true;
            } else {
                System.out.println("Validacion incorrecta");
                return false;
            }
        } else {
            System.out.println("Validacion incorrecta");
            return false;
        }
    }

    //Funcion para validar si una entrada es numerica
    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

}
