package com.company;
import java.awt.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class GuiCalc extends JFrame {
    GuiCalcProg app1=new GuiCalcProg();
    Integer a,b;
    boolean add,div,sub,mult,pow=false;
    private JButton button = new JButton("=");
    private JTextField input = new JTextField();
    JPanel buttonPanel = new JPanel(new GridLayout(5,3));
    private JButton but0 = new JButton("0");
    private JButton but1 = new JButton("1");
    private JButton but2 = new JButton("2");
    private JButton but3 = new JButton("3");
    private JButton but4 = new JButton("4");
    private JButton but5 = new JButton("5");
    private JButton but6 = new JButton("6");
    private JButton but7 = new JButton("7");
    private JButton but8 = new JButton("8");
    private JButton but9 = new JButton("9");
    private JButton butdiv = new JButton("/");
    private JButton butmult = new JButton("*");
    private JButton butadd = new JButton("+");
    private JButton butsub = new JButton("-");
    private JButton butpow = new JButton("^");
    private JButton butsqrt = new JButton("√");
    private JButton butProgCalc = new JButton("⇒");
    private JButton clear = new JButton("C");

    public GuiCalc() {

        super("Calculator");
        this.setBounds(300, 300, 300, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(input,BorderLayout.NORTH);
        add(buttonPanel,BorderLayout.CENTER);
        add(button,BorderLayout.SOUTH);
        input.setPreferredSize(new Dimension(10,45));
        button.addActionListener(new ButtonEventListener());
        button.setPreferredSize(new Dimension(10,45));

        but0.addActionListener(new ButtonEventListener());
        buttonPanel.add(but0);

        but1.addActionListener(new ButtonEventListener());
        buttonPanel.add(but1);

        but2.addActionListener(new ButtonEventListener());
        buttonPanel.add(but2);

        but3.addActionListener(new ButtonEventListener());
        buttonPanel.add(but3);

        but4.addActionListener(new ButtonEventListener());
        buttonPanel.add(but4);

        but5.addActionListener(new ButtonEventListener());
        buttonPanel.add(but5);

        but6.addActionListener(new ButtonEventListener());
        buttonPanel.add(but6);

        but7.addActionListener(new ButtonEventListener());
        buttonPanel.add(but7);

        but8.addActionListener(new ButtonEventListener());
        buttonPanel.add(but8);

        but9.addActionListener(new ButtonEventListener());
        buttonPanel.add(but9);

        butdiv.addActionListener(new ButtonEventListener());
        buttonPanel.add(butdiv);

        butmult.addActionListener(new ButtonEventListener());
        buttonPanel.add(butmult);

        butadd.addActionListener(new ButtonEventListener());
        buttonPanel.add(butadd);

        butsub.addActionListener(new ButtonEventListener());
        buttonPanel.add(butsub);

        clear.addActionListener(new ButtonEventListener());
        buttonPanel.add(clear);

        butpow.addActionListener(new ButtonEventListener());
        buttonPanel.add(butpow);

        butsqrt.addActionListener(new ButtonEventListener());
        buttonPanel.add(butsqrt);

        butProgCalc.addActionListener(new ButtonEventListener());
        buttonPanel.add(butProgCalc);

    }

    class ButtonEventListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {   //input.setText(e.getActionCommand());

            if (e.getSource()==butProgCalc) {
                app1.setVisible(true);
                dispose();
            }

            if (e.getSource()==but0) {
                input.setText(input.getText() + "0");
            }
            if (e.getSource()==but1) {
                input.setText(input.getText() + "1");
            }
            if (e.getSource()==but2) {
                input.setText(input.getText() + "2");
            }
            if (e.getSource()==but3) {
                input.setText(input.getText() + "3");
            }
            if (e.getSource()==but4) {
                input.setText(input.getText() + "4");
            }
            if (e.getSource()==but5) {
                input.setText(input.getText() + "5");
            }
            if (e.getSource()==but6) {
                input.setText(input.getText() + "6");
            }
            if (e.getSource()==but7) {
                input.setText(input.getText() + "7");
            }
            if (e.getSource()==but8) {
                input.setText(input.getText() + "8");
            }
            if (e.getSource()==but9) {
                input.setText(input.getText() + "9");
            }
            if (e.getSource()==clear) {
                String temp = input.getText();
                input.setText(temp.substring(0, temp.length() - 1));
                a=0;b=0;add=false;div=false;mult=false;sub=false;
            }
            if (e.getSource()==butadd) {
                a=Integer.valueOf(input.getText());
                input.setText("");
                add=true;

                if (e.getSource()==clear) {
                    String temp = input.getText();
                    input.setText(temp.substring(0, temp.length() - 1));
                }


            }
            if (e.getSource()==butmult) {
                a=Integer.valueOf(input.getText());
                input.setText("");
                mult=true;

                if (e.getSource()==clear) {
                    String temp = input.getText();
                    input.setText(temp.substring(0, temp.length() - 1));
                }

            }
            if (e.getSource()==butdiv) {
                a=Integer.valueOf(input.getText());
                input.setText("");
                div=true;

                if (e.getSource()==clear) {
                    String temp = input.getText();
                    input.setText(temp.substring(0, temp.length() - 1));
                }

            }
            if (e.getSource()==butsub) {
                a=Integer.valueOf(input.getText());
                input.setText("");
                sub=true;

                if (e.getSource()==clear) {
                    String temp = input.getText();
                    input.setText(temp.substring(0, temp.length() - 1));
                }

            }
            if (e.getSource()==butpow) {
                a=Integer.valueOf(input.getText());
                input.setText("");
                pow=true;

                if (e.getSource()==clear) {
                    String temp = input.getText();
                    input.setText(temp.substring(0, temp.length() - 1));
                }

            }
            if (e.getSource()==butsqrt) {
                a=Integer.valueOf(input.getText());
                 double sqr=a;
                input.setText(String.valueOf(Math.sqrt(sqr)));
                a=0; b=0;
                if (e.getSource()==clear) {
                    String temp = input.getText();
                    input.setText(temp.substring(0, temp.length() - 1));
                    a=0;b=0;add=false;div=false;mult=false;sub=false;
                }

            }
            if (e.getSource()==button) {

                b=Integer.valueOf(input.getText());

                if (add==true) {
                    input.setText(String.valueOf((a+b)));
                   /* a=0;*/ b=0;
                }
                if (sub==true) {
                    input.setText(String.valueOf((a-b)));
                    /* a=0;*/ b=0;
                }
                if (mult==true) {
                    input.setText(String.valueOf((a*b)));
                    /* a=0;*/ b=0;
                }
                if (pow==true) {
                    input.setText(String.valueOf(Math.pow(a, b)));
                    /* a=0;*/ b=0;
                }
                if (div==true) {

                    if (a%b!=0) {

                        float z = (float) a / (float) b;
                        input.setText(String.valueOf(z));
                        a = 0;
                        b = 0;
                        a = Math.round(a);
                        b = Math.round(b);
                    } else {
                        Integer z=a/b;
                        input.setText(String.valueOf(z));
                        a = 0;
                        b = 0;
                    }
                }
            }
        }


    }
    }

