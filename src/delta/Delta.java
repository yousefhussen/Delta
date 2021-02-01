package delta;

import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Delta {

    static JList newList;
    BufferedWriter bw;
    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public static void main(String[] args) {
//        try{
//            FileWriter newFW = new FileWriter("New Materials.txt");
//            FileWriter testFW = new FileWriter("Test Materials.txt");
//            FileWriter readyFW = new FileWriter("Ready Materials.txt");
//            
//            BufferedWriter bw = new BufferedWriter(newFW);
//            
//            
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
        JFrame appFrame = new JFrame("Hello");

        DefaultListModel newMat = new DefaultListModel();

        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        JPanel panelMain = new JPanel();
        JPanel panelTest = new JPanel();
        JPanel panelReady = new JPanel();
        JPanel panelMenu = new JPanel();
        panelMain.setBackground(Color.white);
        panelTest.setBackground(Color.yellow);
        panelReady.setBackground(Color.blue);
        panelMenu.setBackground(Color.BLACK);
        Container c = appFrame.getContentPane();
        c.setLayout(new GridBagLayout());
        GridBagConstraints gbc_for_container = new GridBagConstraints();
        gbc_for_container.insets = new Insets(5, 5, 5, 5);
        gbc_for_container.gridx = 0;
        gbc_for_container.gridy = 0;
        gbc_for_container.ipadx = screenSize.width / 10;
        gbc_for_container.ipady = screenSize.height - screenSize.height / 11;
        gbc_for_container.weighty = 1;
        gbc_for_container.weightx = 1;

        c.add(panelMenu, gbc_for_container);
        gbc_for_container.gridx = 1;
        gbc_for_container.ipadx = (screenSize.width - (screenSize.width / 8));
        gbc_for_container.ipady = screenSize.height - screenSize.height / 11;
        c.add(panelMain, gbc_for_container);
        JButton newButton = new JButton("NEW");
        JButton testButton = new JButton("TEST");
        JButton readyButton = new JButton("READY");
        JPanel newPanel = new JPanel();
        JPanel testPanel = new JPanel();
        JPanel readyPanel = new JPanel();
        newPanel.setBackground(Color.black);
        testPanel.setBackground(Color.black);
        readyPanel.setBackground(Color.black);
        panelMenu.setLayout(new GridBagLayout());
        panelMain.setLayout(new BorderLayout());
        GridBagConstraints gbc_for_menu_panel = new GridBagConstraints();
        gbc_for_menu_panel.insets = new Insets(5, 1, 5, 1);
        gbc_for_menu_panel.gridx = 0;
        gbc_for_menu_panel.gridy = 0;

        gbc_for_menu_panel.weighty = 1;
        gbc_for_menu_panel.ipadx = screenSize.width / 6;
        gbc_for_menu_panel.ipady = screenSize.height / 10;

        panelMenu.add(newPanel, gbc_for_menu_panel);
        gbc_for_menu_panel.gridy = 1;
        panelMenu.add(testPanel, gbc_for_menu_panel);
        gbc_for_menu_panel.gridy = 2;
        panelMenu.add(readyPanel, gbc_for_menu_panel);

        newPanel.add(newButton, BorderLayout.CENTER);
        testPanel.add(testButton, BorderLayout.CENTER);
        readyPanel.add(readyButton, BorderLayout.CENTER);
        
// old JList Code(T be Discarded)
//        newList = new JList(newMat);
//        newList.setModel(newMat);
//        newList = new JList(newMat);
//        newList.setModel(newMat);
        newButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelMain.setBackground(Color.red);
            }
        });

        testButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelMain.setBackground(Color.green);
            }
        });

        readyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelMain.setBackground(Color.orange);
            }
        });


        JPanel ListArea = new JPanel();
        ListArea.setLayout(new GridBagLayout());
        GridBagConstraints cc = new GridBagConstraints();

        cc.gridwidth = 0;
        cc.gridheight = 1;


        JScrollPane scrollableTextArea = new JScrollPane(ListArea);
        scrollableTextArea.getVerticalScrollBar().setUnitIncrement(26);
        panelMain.add(scrollableTextArea);
        cc.ipady = 50;

        Product p = new Product();

        JButton addNew = new JButton("Add");
        JButton deleteNew = new JButton("Delete");
        addNew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Product pp = new Product("Test", 25, new JButton("Test"), "C:\\Users\\20101\\Pictures\\Screenshots\\ScreenshotTest.png");

                if (ListArea.getComponentCount() == 0) {
                    ListArea.add(pp, cc);
                    
                    cc.ipadx = scrollableTextArea.getWidth() - 190;
                    ListArea.removeAll();
                }
                ListArea.add(pp, cc);
                panelMain.revalidate();
                panelMain.repaint();

            }
        });
        deleteNew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int a = JOptionPane.showConfirmDialog(appFrame, "Are you sure?");
                if (a == JOptionPane.YES_OPTION) {
                    int index_to_delete = newList.getSelectedIndex();
                    newMat.removeElementAt(index_to_delete);
                }

            }
        });
        panelMain.add(addNew, BorderLayout.NORTH);
        panelMain.add(deleteNew, BorderLayout.SOUTH);
        appFrame.setVisible(true);
    }

}
