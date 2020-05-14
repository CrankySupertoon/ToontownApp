package toontownapp.GUI;

//import toontownapp.ToontownApp;
import toontownapp.cogbuilder.*;
import toontownapp.cogfacilities.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Tester extends JFrame{
    private JButton calculateButton;
    private JTextArea outputArea;
    private JTextArea systemOut;
    private JTextField inputArea;
    private JPanel MainPanel;
    private JLabel titleInput;
    private JScrollPane scrollPane;

    private int input;
    private static boolean read;

    private CogName cogname;
    private CogType cogtype;
    private int coglvl;
    private CogIF cog;

    public static void main(String[]args){
        Tester test = new Tester();
        test.createUIComponents();
    }

    public Tester(){
        calculateButton.addActionListener(new ActionListener(){
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

    private void menu() {
        outputArea.setText("");
        outputArea.append("1 - Bossbot\n");
        outputArea.append("2 - Lawbot\n");
        outputArea.append("3 - Cashbot\n");
        outputArea.append("4 - Sellbot\n");
        outputArea.append("5 - Exit\n");
        outputArea.append("Enter input: ");
        outputArea.setLineWrap(true);
        reading();
        outputArea.setText("");

        switch (input) {
            case 1:
                systemOut.append("Cog Type Selected: Bossbot\n");
                cogtype = CogType.BOSSBOT;
                Bossbot();
                break;
            case 2:
                systemOut.append("Cog Type Selected: Lawbot\n");
                cogtype = CogType.LAWBOT;
                Lawbot();
                break;
            case 3:
                systemOut.append("Cog Type Selected: Cashbot\n");
                cogtype = CogType.CASHBOT;
                Cashbot();
                break;
            case 4:
                systemOut.append("Cog Type Selected: Sellbot\n");
                cogtype = CogType.SELLBOT;
                Sellbot();
                break;
            default:
                inputArea.setText("Invalid input");
                break;
            case 5:
                System.exit(0);
        }
        this.callbuildCog();
        this.findCogSuit();
        outputArea.setText("");
        outputArea.append("Would you like to enter another cog?\n");
        outputArea.append("1 - Yes\n");
        outputArea.append("2 - No\n");
        outputArea.append("Enter a number: ");
        switch(reading()) {
            case 1:
                systemOut.setText("");
                menu();
                break;
            default:
                System.exit(0);
        }
    }

    public void callbuildCog(){
        CogDirector cogDirector = new CogDirector();
        cog = cogDirector.buildCog(cogtype, coglvl, cogname);
    }

    public int reading(){
        read = false;
        inputArea.setEditable(true);
        outputArea.setCaretPosition(outputArea.getDocument().getLength());
        while (!read) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return input;
    }

    public void Bossbot () {
        outputArea.append("1 -- Flunky\n");
        outputArea.append("2 -- Pencil Pusher\n");
        outputArea.append("3 -- Yesman\n");
        outputArea.append("4 -- Micromanager\n");
        outputArea.append("5 -- Downsizer\n");
        outputArea.append("6 -- Head Hunter\n");
        outputArea.append("7 -- Corporate Raider\n");
        outputArea.append("8 -- The Big Cheese\n");
        outputArea.append("Select Bossbot: ");
        cogname = findBossbot(reading());
        systemOut.append("Cog Selected: "+cogname);

        outputArea.setText("");
        outputArea.append("What level are you? ");
        coglvl = reading();
        systemOut.append("\nLevel Selected: "+coglvl);

        //BUILD COG WITH BUILDER HERE
        //SEND COG COGFACILITY

    }

    public void Lawbot(){
        outputArea.append("1 -- Bottom Feeder\n");
        outputArea.append("2 -- Bloodsucker\n");
        outputArea.append("3 -- Double Talker\n");
        outputArea.append("4 -- Ambulance Chaser\n");
        outputArea.append("5 -- Back Stabber\n");
        outputArea.append("6 -- Spin Doctor\n");
        outputArea.append("7 -- Legal Eagle\n");
        outputArea.append("8 -- Big Wig\n");
        outputArea.append("Select Lawbot: ");
        cogname = findLawbot(reading());
        systemOut.append("Cog Selected: "+cogname);

        outputArea.setText("");
        outputArea.append("What level are you? ");
        coglvl = reading();
        systemOut.append("\nLevel: "+coglvl);

        //BUILD COG WITH BUILDER HERE
        //SEND COG COGFACILITY
    }

    public void Cashbot(){
        outputArea.append("1 -- Short Change\n");
        outputArea.append("2 -- Penny Pincher\n");
        outputArea.append("3 -- Tightwad\n");
        outputArea.append("4 -- Bean Counter\n");
        outputArea.append("5 -- Number Cruncher\n");
        outputArea.append("6 -- Money Bags\n");
        outputArea.append("7 -- Loan Shark\n");
        outputArea.append("8 -- Robber Baron\n");
        outputArea.append("Select Cashbot: ");
        cogname = findCashbot(reading());
        systemOut.append("Cog Selected: "+cogname);

        outputArea.setText("");
        outputArea.append("What level are you? ");
        coglvl = reading();
        systemOut.append("\nLevel: "+coglvl);
        //BUILD COG WITH BUILDER HERE
        //SEND COG COGFACILITY
    }

    public void Sellbot(){
        outputArea.append("1 -- Cold Caller\n");
        outputArea.append("2 -- Telemarketer\n");
        outputArea.append("3 -- Name Dropper\n");
        outputArea.append("4 -- Glad Hander\n");
        outputArea.append("5 -- Mover & Shaker\n");
        outputArea.append("6 -- Two-Face\n");
        outputArea.append("7 -- The Mingler\n");
        outputArea.append("8 -- Mr. Hollywood\n");
        outputArea.append("Select Sellbot: ");
        cogname = findSellbot(reading());
        systemOut.append("Cog Selected: "+cogname);

        outputArea.setText("");
        outputArea.append("What level are you? ");
        coglvl = reading();
        systemOut.append("\nLevel: "+coglvl);
    }

    public CogName findBossbot(int num){
        switch (num) {
            case 1: return CogName.FLUNKY;
            case 2: return CogName.PENCIL_PUSHER;
            case 3: return CogName.YESMAN;
            case 4: return CogName.MICROMANAGER;
            case 5: return CogName.DOWNSIZER;
            case 6: return CogName.HEADHUNTER;
            case 7: return CogName.CORPORATE_RAIDER;
            case 8: return CogName.THE_BIG_CHEESE;
            default: System.out.println("Error: Invalid num: "+num); return CogName.FLUNKY;
        }
    }

    public CogName findLawbot(int num){
        switch (num) {
            case 1: return CogName.BOTTOM_FEEDER;
            case 2: return CogName.BLOODSUCKER;
            case 3: return CogName.DOUBLE_TALKER;
            case 4: return CogName.AMBULANCE_CHASER;
            case 5: return CogName.BACK_STABBER;
            case 6: return CogName.SPIN_DOCTOR;
            case 7: return CogName.LEGAL_EAGLE;
            case 8: return CogName.BIG_WIG;
            default: System.out.println("Error: Invalid num: "+num); return CogName.BOTTOM_FEEDER;
        }
    }

    public CogName findCashbot(int num){
        switch (num) {
            case 1: return CogName.SHORT_CHANGE;
            case 2: return CogName.PENNY_PINCHER;
            case 3: return CogName.TIGHTWAD;
            case 4: return CogName.BEAN_COUNTER;
            case 5: return CogName.NUMBER_CRUNCHER;
            case 6: return CogName.MONEY_BAGS;
            case 7: return CogName.LOAN_SHARK;
            case 8: return CogName.ROBBER_BARON;
            default: System.out.println("Error: Invalid num: "+num); return CogName.SHORT_CHANGE;
        }
    }

    public CogName findSellbot(int num){
        switch (num) {
            case 1: return CogName.COLD_CALLER;
            case 2: return CogName.TELEMARKETER;
            case 3: return CogName.NAME_DROPPER;
            case 4: return CogName.GLAD_HANDER;
            case 5: return CogName.MOVER_AND_SHAKER;
            case 6: return CogName.TWO_FACE;
            case 7: return CogName.THE_MINGLER;
            case 8: return CogName.MR_HOLLYWOOD;
            default:
                System.out.println("Error: Invalid num: "+num);
                return CogName.COLD_CALLER;
        }
    }

    public void findCogSuit(){

        CogFacility_IF cogFacility_if = null;

        switch (cog.getCogtype()) {
            case BOSSBOT: cogFacility_if = new BossbotGolfCourses();
                break;
            case LAWBOT: cogFacility_if = new LawbotDAOffices();
                break;
            case CASHBOT: cogFacility_if = new CashbotMint();
                break;
            case SELLBOT: cogFacility_if = new SellbotFactory();
                break;
            default: System.out.println("Error: invalid choice; ending program");
                System.exit(0);
                break;
        }
        systemOut.append("\n\n"+cogFacility_if.returnStats(cog)+"\n");
    }
}
