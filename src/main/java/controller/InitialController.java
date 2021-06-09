package controller;

import model.Client;
import MyLib.Functions;
import view.View;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InitialController implements KeyListener {
    public View vista;
    public Client admin;

    public InitialController(View vista, Client admin) {
        this.vista = vista;
        this.admin = admin;
        this.vista.jtfUser.addKeyListener(this);
        this.vista.jtfPass.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (Functions.iniciar(admin, vista)){
            vista.jbEnter.setEnabled(true);
        }else{
            vista.jbEnter.setEnabled(false);
        }
    }
}