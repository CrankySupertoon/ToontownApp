package toontownapp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToonTownGUI extends JFrame{
    private JTextField textField1;
    private JPanel Panel1;
    private JTextArea inputArea;
    private JPanel userInteraction;
    private JButton startButton;
    private JTextArea textArea1;

    public ToonTownGUI(){
        startButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                //JOptionPane.showConfirmDialog(null,"Hello World");

            }
        });
    }

    private void createUIComponents(){
        // TODO: place custom component creation code here
        setContentPane(Panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550,470);
        inputArea.append("1 - Bossbot\n" + "2 - Lawbot\n" + "3 - Cashbot\n" + "4 - Sellbot\n" + "5 - Exit\n");
        inputArea.setLineWrap(true);
        setVisible(true);
    }

//    public static void main(String[] args){
//        ToonTownGUI test = new ToonTownGUI();
//        test.createUIComponents();
//    }
}
