package toontownapp;

import javax.swing.BoxLayout;
import javax.swing.*;
import java.awt.*;

//this is how *I* would write the GUI (at least, what I've learned to do)
public class ToonTownGUI2 extends JFrame {

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

    public static void main(String[] args){
        ToonTownGUI2 gui = new ToonTownGUI2();
    }

}
