/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delta;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author 20101
 */
public class Product extends JPanel {

    private String Name;
    private int quantity;
    private Image image;
    private JLabel NameLabel;
    private JLabel quantityLabel;
    private JButton button;
    public static ArrayList<Product> Products;

    @Override
    public String getName() {
        return Name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }


    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public Product(String Name, int quantity, JButton button, String image) {
        this.Name = Name;
        Toolkit t = Toolkit.getDefaultToolkit();
        this.image = t.getImage(image);
        this.button = button;
        this.button.setSize(100, 100);
        this.quantity = quantity;
        NameLabel = new JLabel(this.Name);
        Integer temp = this.quantity;
        quantityLabel = new JLabel(temp.toString());
        Products.add(this);

        setLayout(new GridLayout(1, 0, 5, 0));
        add(this.button);
        add(NameLabel);
        add(quantityLabel);
       

    }

    public Product() {
        Products = new ArrayList<Product>();
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void setName(String Name) {
        this.Name = Name;
    }


    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.drawImage(this.image, 1, 0, this.getWidth(),this.getHeight(), null);
          this.revalidate();
                this.repaint();
    }

}
