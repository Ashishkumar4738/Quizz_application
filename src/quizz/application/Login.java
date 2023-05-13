package quizz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel image;
    JButton rules;
    JButton back;
    JTextArea tfname;
    Login(){
        setLayout(null);
        setTitle("Quizz Test");
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/quiz.jpg"));
        image=new JLabel(i1);
        image.setBounds(0,0,500,480);
        add(image);

        JLabel heading=new JLabel("B.B.D.N.I.I.T");
        heading.setBounds(680,50,200,50);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(Color.yellow);
        add(heading);

        JLabel name=new JLabel("Enter your name here");
        name.setBounds(690,150,200,100);
        name.setFont(new Font("Mangolian Baiti",Font.BOLD,18));
        name.setForeground(Color.yellow);
        add(name);


        tfname=new JTextArea();
        tfname.setBounds(725,300,200,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,16));
        add(tfname);


        rules=new JButton("Rules");
        rules.setBounds(650,400,100,25);
        rules.setBackground(Color.yellow);
        rules.setForeground(Color.black);
        add(rules);
        rules.addActionListener(this);

        back=new JButton("Exit");
        back.setBounds(800,400,100,25);
        back.setBackground(Color.yellow);
        back.setForeground(Color.black);
        add(back);
        back.addActionListener(this);

        setSize(1000,500);
        setLocation(200,120);





        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==rules)
        {
            String name= tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()==back){
            setVisible(false);
        }
    }


    public static void main (String args[])
    {
        new Login();
    }


}

