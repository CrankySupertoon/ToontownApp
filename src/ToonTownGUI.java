import toontownapp.ToontownApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import toontownapp.ToontownApp;

import static javax.swing.JTextField.*;

public class ToonTownGUI extends JFrame{
    private JTextField textField1;
    private JPanel Panel1;
    private JButton startButton;
    private JTextArea Input;

    public ToonTownGUI() {
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showConfirmDialog(null,"Hello World");
                ToontownApp app = new ToontownApp();
                app.menu();
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        setContentPane(new ToonTownGUI().Panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550,400);
        setVisible(true);
    }

    public static void main(String[] args){
        ToonTownGUI test = new ToonTownGUI();
        test.createUIComponents();
    }
}
