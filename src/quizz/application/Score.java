package quizz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Score extends JFrame implements ActionListener{

    JButton back2;
    Score(String name,int score){
        setLayout(null);
        setBounds(275,100,800,500);
        getContentPane().setBackground(Color.white);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/score.png"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,150,400,126);
        add(image);


        JLabel heading=new JLabel("Thankyou "+name+" ");
        heading.setBounds(420,100,380,25);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(new Color(178, 232, 79));
        add(heading);

        JLabel lblscore=new JLabel("Your score is "+score);
        lblscore.setBounds(450,250,380,25);
        lblscore.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        lblscore.setForeground(new Color(178, 232, 79));
        add(lblscore);

        back2=new JButton("Play again");
        back2.setBounds(500,350,100,25);
        back2.setBackground(Color.yellow);
        back2.setForeground(Color.black);
        add(back2);
        back2.addActionListener(this);



        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back2){
            setVisible(false);
            new Login();
        }
    }

    public static void main(String args[])
    {
        new Score("user",0);
    }
}
