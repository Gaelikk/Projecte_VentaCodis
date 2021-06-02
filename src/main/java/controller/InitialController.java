package controller;

import model.Client;
import MyLib.Functions;
import view.ViewSale;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InitialController implements KeyListener {
    public ViewSale vista;
    public Client client;

    public InitialController(ViewSale vista, Client client) {
        this.vista = vista;
        this.client = client;
        this.vista.jtfUser.addKeyListener(this);
        this.vista.jtfPass.addKeyListener(this);
        //this.vista.jbEnter;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (Functions.iniciar(client, vista)){
            vista.jbEnter.setEnabled(true);
        }else{
            vista.jbEnter.setEnabled(true);
        }
    }
}