import toontownapp.ToontownApp;
import toontownapp.cogbuilder.CogName;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Tester extends JFrame{
    private JButton calculateButton;
    private JTextArea outputArea;
    private JTextField inputArea;
    private JPanel MainPanel;
    private JLabel titleInput;
    private JScrollBar scrollBar1;
    private int input;
    private static boolean read;

    public static void main(String[]args){
        Tester test = new Tester();
        test.createUIComponents();
    }

    public Tester(){
        calculateButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                //JOptionPane.showConfirmDialog(null,"Hello World");
                try{
                    input = Integer.parseInt(inputArea.getText());
                    outputArea.append(input+"\n");
                    inputArea.setText("");
                    inputArea.setEditable(false);
                    read = true;
                }catch (Exception ex){
                    System.out.println("Error with inputArea");
                }
                System.out.println(input);
            }
        });
    }

    private void createUIComponents(){
        // TODO: place custom component creation code here
        setContentPane(MainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550,470);
        inputArea.setEditable(false);
        setVisible(true);
        menu();
    }

    int choice;

    private void menu() {
        outputArea.append("1 - Bossbot\n");
        outputArea.append("2 - Lawbot\n");
        outputArea.append("3 - Cashbot\n");
        outputArea.append("4 - Sellbot\n");
        outputArea.append("5 - Exit\n");
        outputArea.append("Enter input: ");
        outputArea.setLineWrap(true);
        choice = reading();

        switch (input) {
            case 1:
                Bossbot();
                break;
            case 2:
                Lawbot();
                break;
            case 3:
                Cashbot();
                break;
            case 4:
                Sellbot();
                break;
            default:
                inputArea.setText("Invalid input");
                break;
            case 5:
                System.exit(0);
        }
    }

    public int reading(){
        read = false;
        inputArea.setEditable(true);
        while (!read) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return input;
    }

    int choice1, choice2;

    public void Bossbot () {
        outputArea.append("\n1 -- Flunky\n");
        outputArea.append("2 -- Pencil Pusher\n");
        outputArea.append("3 -- Yesman\n");
        outputArea.append("4 -- Micromanager\n");
        outputArea.append("5 -- Downsizer\n");
        outputArea.append("6 -- Head Hunter\n");
        outputArea.append("7 -- Corporate Raider\n");
        outputArea.append("8 -- The Big Cheese\n");
        outputArea.append("Select Bossbot: ");
        choice1 = reading();

        outputArea.append("\nWhat level are you? ");
        choice2 = reading();

        //BUILD COG WITH BUILDER HERE
        //SEND COG COGFACILITY

    }

    public void Lawbot(){
        outputArea.append("\n1 -- Bottom Feeder\n");
        outputArea.append("2 -- Bloodsucker\n");
        outputArea.append("3 -- Double Talker\n");
        outputArea.append("4 -- Ambulance Chaser\n");
        outputArea.append("5 -- Back Stabber\n");
        outputArea.append("6 -- Spin Doctor\n");
        outputArea.append("7 -- Legal Eagle\n");
        outputArea.append("8 -- Big Wig\n");
        outputArea.append("Select Lawbot: ");
        choice1 = reading();;

        outputArea.append("\nWhat level are you? ");
        choice2 = reading();;

        //BUILD COG WITH BUILDER HERE
        //SEND COG COGFACILITY
    }

    public void Cashbot(){
        outputArea.append("\n1 -- Short Change\n");
        outputArea.append("2 -- Penny Pincher\n");
        outputArea.append("3 -- Tightwad\n");
        outputArea.append("4 -- Bean Counter\n");
        outputArea.append("5 -- Number Cruncher\n");
        outputArea.append("6 -- Money Bags\n");
        outputArea.append("7 -- Loan Shark\n");
        outputArea.append("8 -- Robber Baron\n");
        outputArea.append("Select Cashbot: ");
        choice1 = reading();;

        outputArea.append("\nWhat level are you? ");
        choice2 = reading();;

        //BUILD COG WITH BUILDER HERE
        //SEND COG COGFACILITY
    }

    public void Sellbot(){
        outputArea.append("\n1 -- Cold Caller\n");
        outputArea.append("2 -- Telemarketer\n");
        outputArea.append("3 -- Name Dropper\n");
        outputArea.append("4 -- Glad Hander\n");
        outputArea.append("5 -- Mover & Shaker\n");
        outputArea.append("6 -- Two-Face\n");
        outputArea.append("7 -- The Mingler\n");
        outputArea.append("8 -- Mr. Hollywood\n");
        outputArea.append("Select Sellbot: ");
        choice1 = reading();

        outputArea.append("\nWhat level are you? ");
        choice2 = reading();

        //BUILD COG WITH BUILDER HERE
        //SEND COG COGFACILITY
    }

    public CogName findBossbot(int num){
        switch (num) {
            case 1:
                return CogName.FLUNKY;
            case 2:
                return CogName.PENCIL_PUSHER;
            case 3:
                return CogName.YESMAN;
            case 4:
                return CogName.MICROMANAGER;
            case 5:
                return CogName.DOWNSIZER;
            case 6:
                return CogName.HEADHUNTER;
            case 7:
                return CogName.CORPORATE_RAIDER;
            case 8:
                return CogName.THE_BIG_CHEESE;
            default: System.out.println("Error: Invalid num: "+num); return CogName.FLUNKY;
        }
    }

    public CogName findLawbot(int num){
        switch (num) {
            case 1:
                return CogName.BOTTOM_FEEDER;
            case 2:
                return CogName.BLOODSUCKER;
            case 3:
                return CogName.DOUBLE_TALKER;
            case 4:
                return CogName.AMBULANCE_CHASER;
            case 5:
                return CogName.BACK_STABBER;
            case 6:
                return CogName.SPIN_DOCTOR;
            case 7:
                return CogName.LEGAL_EAGLE;
            case 8:
                return CogName.BIG_WIG;
            default: System.out.println("Error: Invalid num: "+num); return CogName.BOTTOM_FEEDER;
        }
    }

    public CogName findCashbot(int num){
        switch (num) {
            case 1:
                return CogName.SHORT_CHANGE;
            case 2:
                return CogName.PENNY_PINCHER;
            case 3:
                return CogName.TIGHTWAD;
            case 4:
                return CogName.BEAN_COUNTER;
            case 5:
                return CogName.NUMBER_CRUNCHER;
            case 6:
                return CogName.MONEY_BAGS;
            case 7:
                return CogName.LOAN_SHARK;
            case 8: return CogName.ROBBER_BARON;

            default: System.out.println("Error: Invalid num: "+num); return CogName.SHORT_CHANGE;
        }
    }

    public CogName findSellbot(int num){
        switch (num) {
            case 1:
                return CogName.COLD_CALLER;
            case 2:
                return CogName.TELEMARKETER;
            case 3:
                return CogName.NAME_DROPPER;
            case 4:
                return CogName.GLAD_HANDER;
            case 5:
                return CogName.MOVER_AND_SHAKER;
            case 6:
                return CogName.TWO_FACE;
            case 7:
                return CogName.THE_MINGLER;
            case 8:
                return CogName.MR_HOLLYWOOD;
            default:
                System.out.println("Error: Invalid num: "+num);
                return CogName.COLD_CALLER;
        }
    }
}
