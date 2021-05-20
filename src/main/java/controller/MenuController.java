package controller;

import view.ViewSale;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController implements ActionListener {

    private ViewSale v;

    public MenuController(ViewSale v) {
        this.v = v;
        this.v.jbEnter.addActionListener(this);
        this.v.jbLogo.addActionListener(this);
        this.v.jbCart.addActionListener(this);
        this.v.jbAccount.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equalsIgnoreCase("entra")) {
            this.v.panelEnter.setVisible(true);
            this.v.panelLogSign.setVisible(false);
            this.v.panelTop.setVisible(false);
            this.v.panelHome.setVisible(false);
        }else if (actionEvent.getActionCommand().equalsIgnoreCase("logo")){
            this.v.panelEnter.setVisible(false);
            this.v.panelLogSign.setVisible(false);
            this.v.panelTop.setVisible(false);
            this.v.panelHome.setVisible(true);
        }else if (actionEvent.getActionCommand().equalsIgnoreCase("compte")){
            this.v.panelEnter.setVisible(false);
            this.v.panelLogSign.setVisible(false);
            this.v.panelTop.setVisible(false);
            this.v.panelHome.setVisible(true);
        }else if (actionEvent.getActionCommand().equalsIgnoreCase("cistella")){
            this.v.panelEnter.setVisible(false);
            this.v.panelLogSign.setVisible(false);
            this.v.panelTop.setVisible(false);
            this.v.panelHome.setVisible(true);
        }
    }
}
