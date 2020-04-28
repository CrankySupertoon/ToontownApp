import toontownapp.ToontownApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import toontownapp.ToontownApp;

import static javax.swing.JTextField.*;

public class ToonTownGUI extends JFrame{
    private JTextField textField1;
    private JPanel Panel1;
    private JTextArea inputArea;
    private JPanel userInteraction;
    private JTextArea textArea1;
    private JPanel systemOutput;
    private JButton startButton;

    public ToonTownGUI(){
        startButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                //JOptionPane.showConfirmDialog(null,"Hello World");
                ToontownApp app = new ToontownApp();
                app.menu();
            }
        });
    }

    private void createUIComponents(){
        // TODO: place custom component creation code here
        setContentPane(new ToonTownGUI().Panel1);
        //Panel1.add(userInteraction);
        //Panel1.add(systemOutput);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550,400);
        setVisible(true);
    }

    public static void main(String[] args){
        ToonTownGUI test = new ToonTownGUI();
        test.createUIComponents();
    }
}
