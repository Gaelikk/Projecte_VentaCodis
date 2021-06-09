package controller;

import MyLib.Functions;
import model.Client;
import model.VentaCodis;
import model.file.FileManagement;
import view.View;

import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class ProfileChangesController implements ActionListener, KeyListener {
    private View v;
    private VentaCodis vc;
    private Client c;
    private FileManagement fm;

    public ProfileChangesController(View v, VentaCodis vc, Client c, FileManagement fm) {
        this.v = v;
        this.v.jbSaveInfo.addActionListener(this);
        this.v.jbClearInfo.addActionListener(this);
        this.v.jbProduct.addActionListener(this);
        this.v.jbHome.addActionListener(this);
        this.v.jbCart.addActionListener(this);
        this.v.jbAccount.addActionListener(this);
        this.v.jtfNameUser.addKeyListener(this);
        this.v.jtfEmail.addKeyListener(this);
        this.v.jtfTelNum.addKeyListener(this);
        this.c = c;
        this.fm = fm;
    }

    boolean correctUsername = false;
    boolean correctEmail = false;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("guardar")) {

            c.setUsername(v.jtfNameUser.getText());
            c.setEmail(v.jtfEmail.getText());
            c.setNumTel(v.jtfTelNum.getText());

            fm.writeClientList(c);

        } else if (e.getActionCommand().equalsIgnoreCase("esborra")) {
            this.v.jbSaveInfo.setEnabled(false);
            v.jtfNameUser.setText("");
            v.jtfEmail.setText("");
            v.jtfTelNum.setText("");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (this.v.jtfNameUser.getText().isEmpty()) {
            this.v.jtfNameUser.setBorder(new LineBorder(Color.GREEN, 0, true));
            correctUsername = false;
        } else if (Functions.checkUserName(this.v.jtfNameUser.getText())) {
            this.v.jtfNameUser.setBorder(new LineBorder(Color.GREEN, 2, true));
            correctUsername = true;
        } else {
            this.v.jtfNameUser.setBorder(new LineBorder(Color.RED, 2, true));
            correctUsername = false;
        }
        if (Functions.checkEmail(this.v.jtfEmail.getText())) {
            this.v.jtfEmail.setBorder(new LineBorder(Color.GREEN, 2, true));
            correctEmail = true;
        } else if (this.v.jtfEmail.getText().isEmpty()) {
            this.v.jtfEmail.setBorder(new LineBorder(Color.GREEN, 0, true));
            correctEmail = false;
        } else {
            this.v.jtfEmail.setBorder(new LineBorder(Color.RED, 2, true));
            correctEmail = false;
        }
        if (correctUsername && correctEmail) {
            this.v.jbSaveInfo.setEnabled(true);
        } else {
            this.v.jbSaveInfo.setEnabled(false);
        }
    }
}