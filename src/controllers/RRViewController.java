package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import views.HomeView;
import views.RRView;
import views.outputView;

public class RRViewController implements ActionListener {

    private int processCount;
    private RRView rrView;
    private HomeViewController homeViewController;

    public RRViewController(RRView rrView, HomeViewController homeViewController) {
        System.out.println("RRViewController Inicializado");
        this.rrView = rrView;
        processCount = 1;
        this.homeViewController = homeViewController;
        rrView.getAddProcessButton().addActionListener(this);
        rrView.getBackToMenuButton().addActionListener(this);
        rrView.getExecuteButton().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (rrView.getAddProcessButton() == e.getSource()) {
            if (validateInput()) {
                addProcess();
            } else {
                showMessageDialog(null, "Existen datos incorrectos");
            }

        }
        if (rrView.getExecuteButton() == e.getSource()) {
            DefaultTableModel model = (DefaultTableModel) rrView.getProcessTableRR().getModel();
            
            //Se valida que la tabla de procesos no se ecuentre vacia
            if(model.getRowCount() >= 1){
                outputView outputView = new outputView();
            rrView.setVisible(false);
            outputView.setLocationRelativeTo(null);
            outputView.setVisible(true);
            }else{
                showMessageDialog(null, "Debe ingresar procesos, antes de ejecutar el algoritmo");
            }
            
        }

        if (rrView.getBackToMenuButton() == e.getSource()) {
            rrView.setVisible(false);
            homeViewController.getHomeView().setVisible(true);
        }
    }

    //Funcion para agregar un proceso en la tabla
    private void addProcess() {
        System.out.println("Proceso agregado a la tabla de manera exitosa");
        String data0 = "P" + processCount;
        String data1 = rrView.getTxtTR().getText();
        String data2 = rrView.getTxtTL().getText();
        //String data3 = rrView.getTxtQuantum().getText();

        Object[] row = {data0, data1, data2};

        DefaultTableModel model = (DefaultTableModel) rrView.getProcessTableRR().getModel();

        //Cuando se agregue un elemento, entonces el txtQuantum se desactiva para evitar modificaciones
        if (model.getRowCount() == 0) {
            rrView.getTxtQuantum().setEditable(false);

        }
        model.addRow(row);

        processCount++;
        rrView.getTxtTL().setText(null);
        rrView.getTxtTR().setText(null);

    }

    //Funcion que valida el tiempo de rafaga, tiempo de llegada y quantum. Antes de agregarlas a la tabla
    private boolean validateInput() {
        if (isNumeric(rrView.getTxtTR().getText()) && isNumeric(rrView.getTxtTL().getText()) && isNumeric(rrView.getTxtQuantum().getText())) {
            //System.out.println("Validacion correcta");
            
            //Despues de validar que son numeros, se verifica que sean mayores que 0
            if (Integer.parseInt(rrView.getTxtTR().getText()) > 0 && Integer.parseInt(rrView.getTxtTL().getText()) > 0 && Integer.parseInt(rrView.getTxtQuantum().getText()) > 0) {
                System.out.println("Validacion correcta");
                return true;
            }else{
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
