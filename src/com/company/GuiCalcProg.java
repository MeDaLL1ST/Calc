package com.company;
import java.awt.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.math.BigInteger;
import javax.swing.*;


public class GuiCalcProg extends JFrame {

    Integer a,b,c;
    private JButton button = new JButton("=");
    private JTextField output = new JTextField();
    private JTextField input1 = new JTextField();
    private JTextField input2 = new JTextField();
    private JTextField input3 = new JTextField();
    private JLabel inputCh = new JLabel("Enter number:");
    private JLabel inputSy = new JLabel("Enter its number system:");
    private JLabel inputSys = new JLabel("Enter the transfer to which one:");
    private JLabel output1 = new JLabel("Output:");
    private JButton clear = new JButton("C");
    private JButton butCalc = new JButton("⇐");

    JPanel buttonPanel = new JPanel(new GridLayout(1,3));
    JPanel FieldPanel = new JPanel(new GridLayout(3,1));
    JPanel FieldPanelOut = new JPanel();


    public GuiCalcProg() {

        super("ProGCalculator");
        this.setBounds(300, 300, 540, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(FieldPanelOut,BorderLayout.EAST);
        add(FieldPanel,BorderLayout.CENTER);
        add(buttonPanel,BorderLayout.SOUTH);
        output.setPreferredSize(new Dimension(100,45));
        input1.setPreferredSize(new Dimension(100,5));
        input2.setPreferredSize(new Dimension(100,5));
        input3.setPreferredSize(new Dimension(100,5));
        buttonPanel.setPreferredSize(new Dimension(100,60));
        FieldPanelOut.add(output1);
        FieldPanelOut.add(output);
        FieldPanel.add(inputCh);
        FieldPanel.add(input1);
        FieldPanel.add(inputSy);
        FieldPanel.add(input2);
        FieldPanel.add(inputSys);
        FieldPanel.add(input3);

        butCalc.addActionListener(new GuiCalcProg.ButtonEventListener());
        buttonPanel.add(butCalc);

        clear.addActionListener(new GuiCalcProg.ButtonEventListener());
        buttonPanel.add(clear);

        button.addActionListener(new GuiCalcProg.ButtonEventListener());
        buttonPanel.add(button);


    }

    class ButtonEventListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {   //input.setText(e.getActionCommand());

            if (e.getSource()==butCalc) {

                GuiCalc app=new GuiCalc();
                app.setVisible(true);
                dispose();
            }
            if (e.getSource()==clear) {

                a=0;b=0;c=0;
                input1.setText("");
                input2.setText("");
                input3.setText("");
                output.setText("");

            }

           if (e.getSource()==button) {

               b=Integer.valueOf(input2.getText());

               if (b==16) {

                   Component result= null;
                   JOptionPane.showMessageDialog(result,"If the number CONTAINS LETTERS, the function of converting 16 of the numeral system to any other one will not be possible");

               }
               a=Integer.valueOf(input1.getText());
               c=Integer.valueOf(input3.getText());

               if (c==16) {
                   BigInteger it11 =new BigInteger(new BigInteger(String.valueOf(a), b).toString(10));
                   output.setText(Integer.toHexString(Integer.parseInt(String.valueOf(it11))));
               }

               }

               BigInteger it11 =new BigInteger(new BigInteger(String.valueOf(a), b).toString(c));
               output.setText(String.valueOf(it11));

           }
        }


}




