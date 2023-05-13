package quizz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Rules extends JFrame implements ActionListener{

    String name;
    JButton back2;
    JButton enter;
    public Rules(String name) {
        this.name=name;
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/luck.jpg"));
        JLabel image=new JLabel(i1);
        add(image);
        image.setBounds(420,65,300,290);
        setSize(800,500);
        setLocation(300,120);
        getContentPane().setBackground(Color.white);

        JLabel heading=new JLabel("hello "+name+" best of luck");
        heading.setBounds(200,50,600,25);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(new Color(178, 232, 79));
        add(heading);

        JLabel rules=new JLabel();
        rules.setBounds(50,70,350,300);
        rules.setBackground(Color.yellow);
        rules.setForeground(Color.black);
        rules.setText("<html>" +
                "1.  You have 10 questions in this quiz."
                + "<br><br>" +
                "2.  You have 15 second on each question. " +
                "<br><br>" +
                "3.  You can use 50-50 button for your help." +
                "<br><br>" +
                "4.  After attempting all questions you can submit." +
                "<br><br>" +
                "5.  Thank You for choosing this application." +
                "<br><br>" +
                "</html>");
        rules.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(rules);


        back2=new JButton("Back");
        back2.setBounds(100,350,100,25);
        back2.setBackground(Color.yellow);
        back2.setForeground(Color.black);
        add(back2);
        back2.addActionListener(this);


        enter=new JButton("Start");
        enter.setBounds(600,350,100,25);
        enter.setBackground(Color.yellow);
        enter.setForeground(Color.black);
        add(enter);
        enter.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back2){
            new Login();
            setVisible(false);
        }
        else if(ae.getSource()==enter){
            setVisible(false);
            new Quiz(name);
        }

    }
    public static void main(String[] args) {
        new Rules("user");
    }
}

