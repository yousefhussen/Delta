package delta;
import java.awt.*;
import javax.swing.*;

public class Delta {
static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static void main(String[] args) {
        
        JFrame appFrame = new JFrame("Hello");
        
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
        Container c = appFrame.getContentPane();
        c.setLayout(new GridBagLayout());
        GridBagConstraints gbc_for_container = new GridBagConstraints(); 
        gbc_for_container.insets = new Insets(5,5,5,5);
        gbc_for_container.gridx = 0;
        gbc_for_container.gridy = 0;
        gbc_for_container.ipadx = screenSize.width/10;
        gbc_for_container.ipady = screenSize.height - screenSize.height/11;
        c.add(panelMenu,gbc_for_container);
        gbc_for_container.gridx = 1;
        gbc_for_container.ipadx = (screenSize.width - (screenSize.width/8));
        gbc_for_container.ipady = screenSize.height - screenSize.height/11;
        c.add(panelNew,gbc_for_container);
        FlowLayout menu_buttons_layout = new FlowLayout();
        panelMenu.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        
        JButton newButton = new JButton("NEW");
        panelMenu.setLayout(menu_buttons_layout);
        panelMenu.add(newButton);
        
        
        
        appFrame.setVisible(true);
    }
    
}
