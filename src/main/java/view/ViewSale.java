package view;

import javax.swing.*;
import java.awt.*;

public class ViewSale extends JFrame {

    public JPanel panelEnter, panelTop, panelHome, panelLogSign;
    public JButton jbEnter, jbLogo, jbAccount, jbCart;

    public JLabel jlShopName;
    //public JTextField ;

    //public DefaultTableModel dtn;
    public JTable jtClients;

    public ViewSale() {
        setTitle("Digital license sale");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(2000, 1000);
        setVisible(true);
        setLayout(null);
        placePanel();
        placeEnterButton();
        placeMenuButtons();
        //posarFormulariRegistre();
        //posarTaulaClients();
    }

    private void placePanel() {
        //PANELL PRINCIPAL DE REGISTRE
        panelEnter = new JPanel();
        jlShopName = new JLabel("GCODES", SwingConstants.CENTER);
        jlShopName.setBounds(125, 20, 540, 50);
        panelEnter.setBounds(0, 0, 800, 600);
        panelEnter.setOpaque(true);
        panelEnter.setBackground(Color.BLUE);
        panelEnter.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 100));
        panelEnter.setVisible(true);
        add(jlShopName);
        add(panelEnter);

        //PANELL SUPERIOR
        panelTop = new JPanel();
        panelTop.setBounds(0, 0, 800, 150);
        panelTop.setOpaque(true);
        panelTop.setBackground(Color.MAGENTA);
        panelTop.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 100));
        panelTop.setVisible(false);
        add(panelTop);

        //PANELL BENVINGUDA PÀGINA
        panelHome = new JPanel();
        panelHome.setBounds(0, 150, 800, 450);
        panelHome.setOpaque(true);
        panelHome.setBackground(Color.YELLOW);
        panelHome.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 100));
        panelHome.setVisible(false);
        add(panelHome);

        //PANELL INICI/REGISTRE
        panelLogSign = new JPanel();
        panelLogSign.setBounds(0, 150, 800, 450);
        panelLogSign.setOpaque(true);
        panelLogSign.setBackground(Color.RED);
        panelLogSign.setLayout(new GridLayout(5, 2, 10, 50));
        panelLogSign.setVisible(false);
        add(panelLogSign);

        /*
        //PANELL RESERVA
        panellReserva = new JPanel();
        panellReserva.setBounds(0, 150, 800, 450);
        panellReserva.setOpaque(true);
        panellReserva.setBackground(Color.BLACK);
        panellReserva.setLayout(new FlowLayout());
        panellReserva.setVisible(false);
        add(panellReserva);

        //PANELL RESERVA
        panellHabitacio = new JPanel();
        panellHabitacio.setBounds(0, 150, 800, 450);
        panellHabitacio.setOpaque(true);
        panellHabitacio.setBackground(Color.BLACK);
        panellHabitacio.setLayout(new FlowLayout());
        panellHabitacio.setVisible(false);
        add(panellHabitacio);

         */
    }
    private void placeEnterButton(){
        jbEnter = new JButton("Entra");
        jbEnter.setActionCommand("entra");
        panelEnter.add(jbEnter);
    }

    private void placeMenuButtons() {
        jbLogo = new JButton("Logo (Imatge)");
        jbLogo.setActionCommand("logo");
        jbAccount = new JButton("Compte");
        jbAccount.setActionCommand("compte");
        jbCart = new JButton("Cistella (Imatge)");
        jbCart.setActionCommand("cistella");
        //jbHabitacio = new JButton("Habitacio");
        //jbHabitacio.setActionCommand("habitacio");
        panelTop.add(jbLogo);
        panelTop.add(jbAccount);
        panelTop.add(jbCart);
        //panelTop.add(jbHabitacio);
    }
}
