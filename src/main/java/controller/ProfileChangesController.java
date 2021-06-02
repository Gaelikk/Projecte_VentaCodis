package controller;

import model.Client;
import model.VentaCodis;
import view.ViewSale;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ProfileChangesController implements ActionListener {
    private ViewSale v;
    private VentaCodis vc;

    public ProfileChangesController(ViewSale v) {
        this.v = v;
        this.v.jbSaveInfo.addActionListener(this);
        this.v.jbClearInfo.addActionListener(this);
        this.v.jbProduct.addActionListener(this);
        this.v.jbHome.addActionListener(this);
        this.v.jbCart.addActionListener(this);
        this.v.jbAccount.addActionListener(this);
        this.v.jtfNameUser.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("guardar")) {
            Client updateClient = new Client(v.jtfNameUser.getText(),
                    v.jtfEmail.getText(),
                    v.jtfTelNum.getText());
            vc.addClient(updateClient);

            for (Client c : vc.getClientList()) {
                String[] dades = new String[3];
                dades[0] = c.getUsername();
                dades[1] = c.getPassword();
                dades[2] = c.getNumTel();

                this.v.jbClearInfo.setVisible(false);
                this.v.jbSaveInfo.setVisible(true);
                v.jtfNameUser.setText(dades[0]);
                v.jtfEmail.setText(dades[1]);
                v.jtfTelNum.setText(dades[2]);
            }

        } else if (e.getActionCommand().equalsIgnoreCase("esborra")) {
            this.v.jbSaveInfo.setEnabled(false);
            this.v.jbClearInfo.setVisible(true);
            this.v.jbHome.setEnabled(false);
            this.v.jbCart.setEnabled(false);
            this.v.jbProduct.setEnabled(false);
            this.v.jbAccount.setEnabled(false);

            v.jtfNameUser.setText("");
            v.jtfEmail.setText("");
            v.jtfTelNum.setText("");
        } else if (e.getActionCommand().equalsIgnoreCase("nom")){
            this.v.jbSaveInfo.setEnabled(true);
            this.v.jbHome.setEnabled(true);
            this.v.jbCart.setEnabled(true);
            this.v.jbProduct.setEnabled(true);
            this.v.jbAccount.setEnabled(true);
        }
    }
}
