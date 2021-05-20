package controller;

import model.Sale;
import view.ViewSale;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SaleController implements MouseListener {

    private ViewSale v;
    private Sale s;

    public SaleController(ViewSale v, Sale s) {
        this.v = v;
        this.s = s;
        v.jtClients.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 2) {
            System.out.println(mouseEvent.getSource());
            mouseEvent.getID();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
