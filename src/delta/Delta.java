package delta;
import java.awt.*;
import javax.swing.*;

public class Delta {
static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static void main(String[] args) {
        
        JFrame appFrame = new JFrame("Hello");
        GridBagLayout gridLayout = new GridBagLayout();
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        JPanel panelNew = new JPanel();
        JPanel panelTest = new JPanel();
        JPanel panelReady = new JPanel();
        JPanel panelMenu = new JPanel();
        panelNew.setBackground(Color.red);
        panelTest.setBackground(Color.yellow);
        panelReady.setBackground(Color.blue);
        panelMenu.setBackground(Color.BLACK);
        //panelMenu.setSize(50, screenSize.height);
        
        appFrame.setLayout(gridLayout);
        appFrame.add(panelMenu);
       // appFrame.add(panelNew);
        
        
        
        appFrame.setVisible(true);
    }
    
}
