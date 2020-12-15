package delta;
import java.awt.*;
import java.awt.event.*;
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
        gbc_for_container.weighty = 1;
        gbc_for_container.weightx = 1;

        c.add(panelMenu,gbc_for_container);
        gbc_for_container.gridx = 1;
        gbc_for_container.ipadx = (screenSize.width - (screenSize.width/8));
        gbc_for_container.ipady = screenSize.height - screenSize.height/11;
        c.add(panelNew,gbc_for_container);
        
        JButton newButton = new JButton("NEW");
        JButton testButton = new JButton("TEST");
        JButton readyButton = new JButton("READY");
        JPanel newPanel = new JPanel();
        JPanel testPanel = new JPanel();
        JPanel readyPanel = new JPanel();
        panelMenu.setLayout(new GridBagLayout());
        GridBagConstraints gbc_for_menu_panel = new GridBagConstraints(); 
        gbc_for_menu_panel.insets = new Insets(5,1,5,1);
        gbc_for_menu_panel.gridx = 0;
        gbc_for_menu_panel.gridy = 0;

        gbc_for_menu_panel.weighty = 1;
        gbc_for_menu_panel.ipadx = screenSize.width/6;
        gbc_for_menu_panel.ipady = screenSize.height/10;


        panelMenu.add(newPanel,gbc_for_menu_panel);
        gbc_for_menu_panel.gridy = 1;
        panelMenu.add(testPanel,gbc_for_menu_panel);
        gbc_for_menu_panel.gridy = 2;
        panelMenu.add(readyPanel,gbc_for_menu_panel);
        
        newPanel.add(newButton,BorderLayout.CENTER);
        testPanel.add(testButton,BorderLayout.CENTER);
        readyPanel.add(readyButton,BorderLayout.CENTER);

        newButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                panelNew.setBackground(Color.red);
            }
        });
        
        testButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                panelNew.setBackground(Color.green);
            }
        });
        
        readyButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                panelNew.setBackground(Color.orange);
            }
        });
        
        appFrame.setVisible(true);
    }
    
}
