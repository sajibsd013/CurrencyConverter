package currencyconverter;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Java_Project extends JFrame {

    JFrame frame;
    JTextField jf;
    JTextArea ja;
    JButton k1, k2, k3, k4, k5, k6, k7;
    JLabel l1, l2;
    JPanel f, f1;
    
      JFrame f2;
    JTextField tf;
    JLabel jb;
    JButton btn;
    Font t;
    JTextArea ta;

    Java_Project() {
        Components();
    }

    public void Components() {

        // JFrame Section
        this.setSize(600, 450);
        this.setLocation(470, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Converter");

        JTabbedPane tb = new JTabbedPane();
        this.add(tb);

        f = new JPanel();
        f.setLayout(null);
        tb.add("Time Converter", f);

        f1 = new JPanel();
        f1.setLayout(null);
        tb.add("Multiplication Table", f1);

        jf = new JTextField();
        jf.setBackground(Color.WHITE);
        jf.setBounds(100, 70, 200, 50);

        ja = new JTextArea();
        ja.setBackground(Color.WHITE);
        ja.setBounds(350, 70, 200, 50);

        l2 = new JLabel("NUMBER");
        l2.setFont(new Font(l2.getFont().getName(), l2.getFont().getStyle(), 20));
        l2.setBounds(0, 70, 100, 50);

        l1 = new JLabel("CONVERTER", JLabel.CENTER);
        l1.setFont(new Font(l1.getFont().getName(), l1.getFont().getStyle(), 30));
        l1.setForeground(Color.black);
        l1.setBorder(new LineBorder(Color.red));
        l1.setBounds(40, 30, 200, 40);

        k1 = new JButton("MINUTE TO HOUR");
        k1.setBackground(Color.MAGENTA);
        k1.setBounds(100, 130, 150, 50);

        k2 = new JButton("HOUR TO MINUTE");
        k2.setBackground(Color.MAGENTA);
        k2.setBounds(270, 130, 150, 50);

        k3 = new JButton("SECOND TO MINUTE");
        k3.setBackground(Color.MAGENTA);
        k3.setBounds(100, 200, 150, 50);

        k4 = new JButton("MINUTE TO SECOND");
        k4.setBackground(Color.MAGENTA);
        k4.setBounds(270, 200, 150, 50);

        k5 = new JButton("DAYS TO HOUR");
        k5.setBackground(Color.MAGENTA);
        k5.setBounds(100, 270, 150, 50);

        k6 = new JButton(" HOUR TO DAYS");
        k6.setBackground(Color.MAGENTA);
        k6.setBounds(270, 270, 150, 50);

        k7 = new JButton("CLEAR");
        k7.setBounds(200, 320, 150, 50);
        k7.setBackground(Color.gray);

        ActionListener a = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String data = jf.getText();

                try {
                    float a = Float.parseFloat(data);

                    float c;
                    c = a / 60;
                    ja.setText("" + c);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }

            }

        };

        ActionListener b = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String data = jf.getText();

                try {
                    float a = Float.parseFloat(data);

                    float c1;
                    c1 = a * 60;
                    ja.setText("" + c1);
                } catch (Exception ex) {
                    System.out.println("");
                }
            }
        };
        ActionListener c = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String data = jf.getText();

                try {
                    float a = Float.parseFloat(data);

                    float c1;
                    c1 = a / 60;
                    ja.setText("" + c1);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        };
        ActionListener d = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String data = jf.getText();

                try {
                    float a = Float.parseFloat(data);

                    float c1;
                    c1 = a * 60;
                    ja.setText("" + c1);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        };
        ActionListener e = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String data = jf.getText();

                try {
                    float a = Float.parseFloat(data);

                    float c1;
                    c1 = a * 24;
                    ja.setText("" + c1);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        };
        ActionListener h = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String data = jf.getText();

                try {
                    float a = Float.parseFloat(data);

                    float c1;
                    c1 = a / 24;
                    ja.setText("" + c1);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }

        };
        ActionListener g = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ja.setText("");
                jf.setText("");
            }
        };

        k1.addActionListener(a);
        k2.addActionListener(b);
        k3.addActionListener(c);
        k4.addActionListener(d);
        k5.addActionListener(e);
        k6.addActionListener(h);
        k7.addActionListener(g);

        f.add(jf);
        f.add(ja);
        f.add(l1);
        f.add(l2);
        f.add(k1);
        f.add(k2);
        f.add(k3);
        f.add(k4);
        f.add(k5);
        f.add(k6);
        f.add(k7);
        
        
        
        t = new Font("Tahoma", Font.BOLD, 17);
        
        jb = new JLabel("Enter any number");
        jb.setForeground(Color.BLUE);
        jb.setBounds(20, 25, 200, 50);
        jb.setFont(t);
        
        tf = new JTextField();
        tf.setBounds(180, 35, 80, 30);
        tf.setBackground(Color.PINK);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setFont(t);
        
        btn = new JButton("Clear");
        btn.setBounds(180, 90, 80, 50);
        btn.setBackground(Color.PINK);
        btn.setHorizontalAlignment(JButton.CENTER);
        btn.setFont(t);
        
        ta = new JTextArea();
        ta.setBounds(20, 70, 150, 250);
        ta.setBackground(Color.LIGHT_GRAY);
        
        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ta.setText("");
                int number = Integer.parseInt(tf.getText());
                for (int i = 1; i <= 10; i++) {
                    int result = number * i;
                    String r = String.valueOf(result);
                    String n = String.valueOf(number);
                    String increment = String.valueOf(i);
                    
                    ta.append(n + "*" + increment + "=" + r + "\n");
                }
            }
            
        });
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ta.setText("");
                
            }
            
        });
        
        f1.add(jb);
        
        f1.add(tf);
        
        f1.add(btn);
        
        f1.add(ta);

        this.setVisible(true);
        this.validate();
    }

    public static void main(String[] args) {

        Java_Project frame = new Java_Project();

    }

}
