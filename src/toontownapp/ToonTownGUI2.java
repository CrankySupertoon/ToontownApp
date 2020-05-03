package toontownapp;

import javax.swing.*;
import java.awt.*;

//this is how *I* would write the GUI (at least, what I've learned to do)
public class ToonTownGUI2 extends JFrame {

    JFrame frame = new JFrame();
    Container content = new Container();

//    JPanel bb = new JPanel();
//    JPanel lb = new JPanel();
//    JPanel cb = new JPanel();
//    JPanel sb = new JPanel();

    JPanel bigpan = new JPanel(new FlowLayout());
    JPanel panel1 = new JPanel(new GridBagLayout());
    JPanel panel2 = new JPanel(new GridBagLayout());

    JLabel bossbot = new JLabel("Bossbot");
    JLabel lawbot = new JLabel("Lawbot");
    JLabel cashbot = new JLabel("Cashbot");
    JLabel sellbot = new JLabel("Sellbot");
    JButton btnRefresh = new JButton("Refresh");

    JLabel enteranum = new JLabel("Enter a number: ");
    JTextField numtxt = new JTextField(6);

    JLabel selectcogtype = new JLabel("Select a Cog Type: ");
    String[] cogtypes = new String[] {"Bossbot", "Lawbot", "Cashbot", "Sellbot"};
    JComboBox<String> cogtypedrop = new JComboBox<String>(cogtypes);

    JLabel selectcog = new JLabel("Select a Cog: ");
    String[] cogs = new String[] {"flunky","pencil pusher","yesman","micromanager","downsizer","head hunter","corporate raider","the big cheese",
        "bottom feeder", "bloodsucker", "double talker", "ambulance chaser","back stabber","spin doctor","legal eagle","big wig",
         "short change","penny pincher","tightwad","bean counter","number cruncher","money bags","loan shark","robber baron",
         "cold caller","telemarketer","name dropper","glad hander","mover & shaker","two-face", "the mingler","mr. hollywood"};
    JComboBox<String> cogdrop = new JComboBox<String>(cogs);

    JLabel enteralvl = new JLabel("Enter a Level: ");
    JTextField lvltxt = new JTextField(2);

    JButton enter = new JButton("Enter");

    /*
    Container content = this.getContentPane();
    Font nameFont = new Font("comic-sans", Font.BOLD, 36);
    Font outFont = new Font("comic-sans", Font.PLAIN, 30);

    @Override
    public ComponentOrientation getComponentOrientation() {
        return super.getComponentOrientation();
    }

    JFrame header = new JFrame("THE NUMBER CRUNCHER PROJECT");

    JLabel lblBossbot = new JLabel("Bossbot");
    public void setBossbot() {
        lblBossbot.setOpaque(true);
        lblBossbot.setFont(new Font("Courier New",Font.BOLD, 18));
        lblBossbot.setBackground(new Color(159,149,137)); // Bossbot color: 159, 149, 137
        lblBossbot.setForeground(new Color(95,49,15));
}
    JLabel lblLawbot = new JLabel("Lawbot");
    JLabel lblCashbot = new JLabel("Cashbot");
    JLabel lblSellbot = new JLabel("Sellbot");

    JButton btnRefresh = new JButton("Refresh");

    JPanel inpn = new JPanel();
    JPanel outpn = new JPanel();
    JPanel bbpnl = new JPanel();

    //JLabel[]  lblBoard = new JLabel[5];

    public ToonTownGUI2() {

        content.setLayout(new GridLayout(5, 2));
        BoxLayout column = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
        setLayout(column);
        setBossbot();
        inpn.add(lblBossbot);
        inpn.add(lblLawbot);
        inpn.add(lblCashbot);
        inpn.add(lblSellbot);

        //content.add(header);
        content.add(btnRefresh);
        content.add(inpn, BorderLayout.WEST);
        content.add(outpn, BorderLayout.EAST);


        this.setVisible(true);
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("The Number Cruncher Project");
    }
*/

//    public void panel1(){        //set up panel1
//        JPanel panel1 = new JPanel(new GridBagLayout());
//        GridBagConstraints constraints1 = new GridBagConstraints();
//        constraints1.anchor = GridBagConstraints.WEST;
//        constraints1.insets = new Insets(10,10,10,10);
//
//        //add panel components
//
//        //"Enter a number: "
//        constraints1.gridx= 0;
//        constraints1.gridy = 0;
//        panel1.add(enteralvl, constraints1);
//
//        //num enter field
//        constraints1.gridx= 1;
//        panel1.add(numtxt, constraints1);
//
//        //"Select Cog Type: "
//        constraints1.gridx= 0;
//        constraints1.gridy = 1;
//        panel1.add(selectcogtype, constraints1);
//
//        //cog type dropdown menu
//        constraints1.gridx= 1;
//        panel1.add(cogtypedrop, constraints1);
//
//        //enter panel1 button
//        constraints1.gridx= 0;
//        constraints1.gridy = 3;
//        constraints1.gridwidth = 2;
//        constraints1.anchor = GridBagConstraints.CENTER;
//        panel1.add(enter, constraints1);
//
//        panel1.setBorder(BorderFactory.createTitledBorder(
//                BorderFactory.createEtchedBorder(), "Calculate by number"));
//        System.out.println("end panel1()");
//    }

//    public void panel2(){
//        //set up panel2 with GridBagLayout
//        JPanel panel2 = new JPanel(new GridBagLayout());
//        GridBagConstraints constraints2 = new GridBagConstraints();
//        constraints2.anchor = GridBagConstraints.WEST;
//        constraints2.insets = new Insets(10,10,10,10);
//
//        //add components to the panel
//
//        //"Select Cog Type: "
//        constraints2.gridx= 0;
//        constraints2.gridy = 0;
//        panel2.add(selectcogtype, constraints2);
//
//        //cog type dropdown menu
//        constraints2.gridx= 1;
//        panel2.add(cogtypedrop, constraints2);
//
//        //"Select Cog: "
//        constraints2.gridx= 0;
//        constraints2.gridy = 1;
//        panel2.add(selectcog, constraints2);
//
//        //cog dropdown menu
//        constraints2.gridx = 1;
//        panel2.add(cogdrop, constraints2);
//
//        //"Enter a level: "
//        constraints2.gridx= 0;
//        constraints2.gridy = 2;
//        panel2.add(enteralvl, constraints2);
//
//        //lvl enter text
//        constraints2.gridx= 1;
//        panel2.add(lvltxt, constraints2);
//
//        //enter panel2 button
//        constraints2.gridx= 0;
//        constraints2.gridy = 3;
//        constraints2.gridwidth = 2;
//        constraints2.anchor = GridBagConstraints.CENTER;
//        panel2.add(enter, constraints2);
//
//        //create border for panel2
//        panel2.setBorder(BorderFactory.createTitledBorder(
//                BorderFactory.createEtchedBorder(), "Calculate by suit"));
//        System.out.println("end panel2()");
//    }

    public ToonTownGUI2(){
        super("The Number Cruncher Project");
        //setLayout(new FlowLayout());

        //panel1();
        JPanel panel1 = new JPanel(new GridBagLayout());
        GridBagConstraints constraints1 = new GridBagConstraints();
        constraints1.anchor = GridBagConstraints.WEST;
        constraints1.insets = new Insets(10,10,10,10);

        //add panel components

        //"Enter a number: "
        constraints1.gridx= 0;
        constraints1.gridy = 0;
        panel1.add(enteralvl, constraints1);

        //num enter field
        constraints1.gridx= 1;
        panel1.add(numtxt, constraints1);

        //"Select Cog Type: "
        constraints1.gridx= 0;
        constraints1.gridy = 1;
        panel1.add(selectcogtype, constraints1);

        //cog type dropdown menu
        constraints1.gridx= 1;
        panel1.add(cogtypedrop, constraints1);

        //enter panel1 button
        constraints1.gridx= 0;
        constraints1.gridy = 2;
        constraints1.gridwidth = 2;
        constraints1.anchor = GridBagConstraints.CENTER;
        panel1.add(enter, constraints1);

        panel1.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Calculate by number"));
        System.out.println("end panel1()");


        //panel2();
        //set up panel2 with GridBagLayout
        JPanel panel2 = new JPanel(new GridBagLayout());
        GridBagConstraints constraints2 = new GridBagConstraints();
        constraints2.anchor = GridBagConstraints.WEST;
        constraints2.insets = new Insets(10,10,10,10);

        //add components to the panel

        //"Select Cog Type: "
        constraints2.gridx= 0;
        constraints2.gridy = 0;
        panel2.add(selectcogtype, constraints2);

        //cog type dropdown menu
        constraints2.gridx= 1;
        panel2.add(cogtypedrop, constraints2);

        //"Select Cog: "
        constraints2.gridx= 0;
        constraints2.gridy = 1;
        panel2.add(selectcog, constraints2);

        //cog dropdown menu
        constraints2.gridx = 1;
        panel2.add(cogdrop, constraints2);

        //"Enter a level: "
        constraints2.gridx= 0;
        constraints2.gridy = 2;
        panel2.add(enteralvl, constraints2);

        //lvl enter text
        constraints2.gridx= 1;
        panel2.add(lvltxt, constraints2);

        //enter panel2 button
        constraints2.gridx= 0;
        constraints2.gridy = 3;
        constraints2.gridwidth = 2;
        constraints2.anchor = GridBagConstraints.CENTER;
        panel2.add(enter, constraints2);

        //create border for panel2
        panel2.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Calculate by suit"));
        System.out.println("end panel2()");

        bigpan.add(panel1);
        bigpan.add(panel2);
        //frame.add(bigpan);
        this.add(bigpan);
        //this.pack();

        this.setSize(1000, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args){

//        try{
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//
//        SwingUtilities.invokeLater(new Runnable() {
//           @Override
//           public void run() {
//               new ToonTownGUI2().setVisible(true);
//           }
//        });
        ToonTownGUI2 gui = new ToonTownGUI2();
        gui.setVisible(true);
    }
}
