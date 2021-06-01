package view;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewSale extends JFrame {

    public JPanel panelEnter, panelTop, panelHome, panelAccount, panelCart, panelProduct;
    public JButton jbEnter, jbHome, jbAccount, jbCart, jbProduct, jbSearchProduct, jbSaveInfo, jbClearInfo;
    public ImageIcon icon = new ImageIcon("src/main/java/img/GCODES.png");

    public JLabel jlImg, jlUser, jlPass, jlWelcome, jlProfile, jlNameUser, jlEmail, jlTelNum;
    public JTextField jtfTextValor, jtfUser, jtfPass, jtfNameUser, jtfEmail, jtfTelNum;
    public JTable jtProducts;
    public DefaultTableModel tableProduct;
    //public JComboBox jcbFilter;

    public ViewSale() {
        setTitle("Digital License Sale");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
        setLayout(null);
        placePanels();
        placeButtons();
        placeProductPanelContent();
    }

    private void placePanels() {
        //PANELL PRINCIPAL D'INICI
        panelEnter = new JPanel();
        panelEnter.setBounds(0, 0, 800, 600);
        panelEnter.setOpaque(true);
        panelEnter.setBackground(Color.BLUE);
        panelEnter.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 100));
        panelEnter.setVisible(true);
        jlImg = new JLabel(icon);
        jlImg.setBounds(365, 5, 70, 80);
        ImageIcon imgReduced = new ImageIcon(icon.getImage().getScaledInstance(jlImg.getWidth(), jlImg.getHeight(), Image.SCALE_SMOOTH));
        jlImg.setIcon(imgReduced);

        //PANELL BENVINGUDA PÀGINA
        panelHome = new JPanel();
        panelHome.setBounds(0, 150, 800, 450);
        panelHome.setOpaque(true);
        panelHome.setBackground(Color.CYAN);
        panelHome.setVisible(false);
        jlWelcome = new JLabel("BENVINGUT");
        jlWelcome.setBounds(0, 0, 800,200);
        jlWelcome.setOpaque(false);
        jlWelcome.setFont(new Font("arial", Font.BOLD, 70));
        panelHome.add(jlWelcome);
        add(panelHome);

        //COMPROVACIÓ ENTRADA USUARI
        jlUser = new JLabel("Username :");
        jlUser.setBounds(250, 195, 200, 40);
        jlUser.setFont(new Font("arial", Font.BOLD, 20));
        jlUser.setForeground(Color.WHITE);
        jtfUser = new JTextField();
        jtfUser.setBounds(380, 195, 200, 40);
        panelEnter.add(jlUser);
        panelEnter.add(jtfUser);

        jlPass = new JLabel("Password :");
        jlPass.setBounds(250, 280, 200, 40);
        jlPass.setFont(new Font("arial", Font.BOLD, 20));
        jlPass.setForeground(Color.WHITE);
        jtfPass = new JTextField();
        jtfPass.setBounds(380, 280, 200, 40);
        panelEnter.add(jlPass);
        panelEnter.add(jtfPass);

        jbEnter = new JButton("Entra");
        jbEnter.setActionCommand("entra");
        jbEnter.setEnabled(false);
        jbEnter.setBounds(365, 370, 75, 50);
        panelEnter.setLayout(null);
        panelEnter.add(jbEnter);
        add(jlImg);
        add(panelEnter);

        //PANELL SUPERIOR
        panelTop = new JPanel();
        panelTop.setBounds(0, 0, 800, 150);
        panelTop.setOpaque(true);
        panelTop.setBackground(Color.BLUE);
        panelTop.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 100));
        panelTop.setVisible(false);
        add(panelTop);

        //PANELL COMPTE
        panelAccount = new JPanel();
        panelAccount.setBounds(0, 150, 800, 450);
        panelAccount.setOpaque(true);
        panelAccount.setBackground(Color.CYAN);
        panelAccount.setLayout(null);
        panelAccount.setVisible(false);
        jlProfile = new JLabel("PERFIL");
        jlProfile.setBounds(30, 0, 200,50);
        jlProfile.setOpaque(false);
        jlProfile.setFont(new Font("arial", Font.BOLD, 20));
        jlProfile.setLayout(null);

        jlNameUser = new JLabel("NOM USUARI*");
        jlNameUser.setBounds(40, 30, 200,50);
        jlNameUser.setOpaque(false);
        jlNameUser.setFont(new Font("arial", Font.BOLD, 15));
        jlNameUser.setLayout(null);
        jtfNameUser = new JTextField("nom");
        jtfNameUser.setBounds(40, 70, 200, 40);

        jlEmail = new JLabel("EMAIL*");
        jlEmail.setBounds(40, 120, 200,50);
        jlEmail.setOpaque(false);
        jlEmail.setFont(new Font("arial", Font.BOLD, 15));
        jlEmail.setLayout(null);
        jtfEmail = new JTextField("email");
        jtfEmail.setBounds(40, 160, 200, 40);

        jlTelNum = new JLabel("NUM. TELF.");
        jlTelNum.setBounds(40, 210, 200,50);
        jlTelNum.setOpaque(false);
        jlTelNum.setFont(new Font("arial", Font.BOLD, 15));
        jlTelNum.setLayout(null);
        jtfTelNum = new JTextField("número de telèfon");
        jtfTelNum.setBounds(40, 250, 200, 40);

        jbSaveInfo = new JButton("Guardar Canvis");
        jbSaveInfo.setActionCommand("guardar");
        jbSaveInfo.setBounds(200,400,150,40);

        jbClearInfo = new JButton("Esborrar Tot");
        jbClearInfo.setActionCommand("esborra");
        jbClearInfo.setBounds(400,400,150,40);

        panelAccount.add(jbSaveInfo);
        panelAccount.add(jbClearInfo);
        panelAccount.add(jtfNameUser);
        panelAccount.add(jtfEmail);
        panelAccount.add(jtfTelNum);
        panelAccount.add(jlTelNum);
        panelAccount.add(jlEmail);
        panelAccount.add(jlProfile);
        panelAccount.add(jlNameUser);
        add(panelAccount);


        //PANELL CISTELLA
        panelCart = new JPanel();
        panelCart.setBounds(0, 150, 800, 450);
        panelCart.setOpaque(true);
        panelCart.setBackground(Color.CYAN);
        panelCart.setLayout(new FlowLayout());
        panelCart.setVisible(false);
        add(panelCart);

        //PANELL BUSCAR PRODUCTES
        panelProduct = new JPanel();
        panelProduct.setBounds(0, 150, 800, 450);
        panelProduct.setOpaque(true);
        panelProduct.setBackground(Color.CYAN);
        panelProduct.setLayout(null);
        panelProduct.setVisible(false);
        add(panelProduct);
    }

    private void placeButtons() {
        jbHome = new JButton("Inici");
        jbHome.setActionCommand("inici");
        jbProduct = new JButton("Producte");
        jbProduct.setActionCommand("producte");
        jbAccount = new JButton("Compte");
        jbAccount.setActionCommand("compte");
        jbCart = new JButton("Cistella (Imatge)");
        jbCart.setActionCommand("cistella");
        panelTop.add(jbHome);
        panelTop.add(jbProduct);
        panelTop.add(jbAccount);
        panelTop.add(jbCart);
    }

    private void placeProductPanelContent() {
        //TEXTFIELD I BOTÓ DE CERCA DE PRODUCTES
        jtfTextValor = new JTextField();
        jtfTextValor.setBounds(200, 5, 200, 20);
        panelProduct.add(jtfTextValor);
        jbSearchProduct = new JButton("Buscar");
        jbSearchProduct.setActionCommand("buscar");
        jbSearchProduct.setBounds(400, 5, 90, 20);
        panelProduct.add(jbSearchProduct);

        //TAULA ON ES MOSTREN ELS PRODUCTES
        String[] columnTitle = new String[]{"NOM", "IDIOMA DISPONIBLE", "IMATGE", "DISPONIBLES", "PREU", ""};
        tableProduct = new DefaultTableModel(null, columnTitle);
        jtProducts = new JTable(tableProduct);
        jtProducts.setBounds(0, 0, 1000, 800);
        jtProducts.setEnabled(true);
        panelProduct.add(jtProducts);

        JScrollPane jsp = new JScrollPane(jtProducts, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panelProduct.add(jsp);

    }
}
