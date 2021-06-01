package controller;

import view.ViewSale;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController implements ActionListener {

    private ViewSale v;

    public MenuController(ViewSale v) {
        this.v = v;
        this.v.jbEnter.addActionListener(this);
        this.v.jbHome.addActionListener(this);
        this.v.jbCart.addActionListener(this);
        this.v.jbAccount.addActionListener(this);
        this.v.jbProduct.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equalsIgnoreCase("entra")) {
            this.v.panelEnter.setVisible(false);
            this.v.panelAccount.setVisible(false);
            this.v.panelTop.setVisible(true);
            this.v.panelHome.setVisible(true);
            this.v.panelCart.setVisible(false);
            this.v.panelProduct.setVisible(false);
        } else if (actionEvent.getActionCommand().equalsIgnoreCase("inici")) {
            this.v.panelEnter.setVisible(false);
            this.v.panelAccount.setVisible(false);
            this.v.panelTop.setVisible(true);
            this.v.panelHome.setVisible(true);
            this.v.panelCart.setVisible(false);
            this.v.panelProduct.setVisible(false);
        } else if (actionEvent.getActionCommand().equalsIgnoreCase("producte")) {
            this.v.panelEnter.setVisible(false);
            this.v.panelAccount.setVisible(false);
            this.v.panelTop.setVisible(true);
            this.v.panelHome.setVisible(false);
            this.v.panelCart.setVisible(false);
            this.v.panelProduct.setVisible(true);
        } else if (actionEvent.getActionCommand().equalsIgnoreCase("compte")) {
            this.v.panelEnter.setVisible(false);
            this.v.panelAccount.setVisible(true);
            this.v.panelTop.setVisible(true);
            this.v.panelHome.setVisible(false);
            this.v.panelCart.setVisible(false);
            this.v.panelProduct.setVisible(false);
        } else if (actionEvent.getActionCommand().equalsIgnoreCase("cistella")) {
            this.v.panelEnter.setVisible(false);
            this.v.panelAccount.setVisible(false);
            this.v.panelTop.setVisible(true);
            this.v.panelHome.setVisible(false);
            this.v.panelCart.setVisible(true);
            this.v.panelProduct.setVisible(false);
        }
    }
}
