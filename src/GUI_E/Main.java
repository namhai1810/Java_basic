/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_E;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentListener;

/**
 *
 * @author namhai18
 */
public class Main extends JFrame implements DocumentListener{
    private JTextField t1, t2;
    private JLabel lb1;
    private JButton bt1,bt2;
    private void initComponent(){
        setTitle("chuong trinh dau tien");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setLayout(new GridLayout(4,2));
        add(new JLabel("So thu 1:"));
        t1 = new JTextField();
        add(t1);
        add(new JLabel("So thu 2:"));
        t2 = new JTextField();
        add(t2);
        add(new JLabel("Tong: "));
        lb1 = new JLabel();
        add(lb1); 
        bt1 = new JButton("Lam lai");
        bt2 = new JButton("Tinh tong");
        add(bt1);
        add(bt2);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
                t1.requestFocus(); // chay ve t1 cho nguoi dung go
            }
        });
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1,n2;
                try{
                    n1 = Double.parseDouble(t1.getText());
                    n2 = Double.parseDouble(t2.getText());
                    lb1.setForeground(Color.blue);
                    lb1.setText("" + (n1+n2));
                }catch(NumberFormatException ex){
                    lb1.setForeground(Color.red);
                    lb1.setText("Nhap so!");
                }
            }
        });
        t1.getDocument().addDocumentListener(this);
        t1.getDocument().addDocumentListener(this);


    }
    public Main(){
        initComponent();
        bt1.setEnabled(false);
        bt2.setEnabled(false);
    }
    public static void main(String[] args) {
        Main k = new Main();
        k.setVisible(true);
    }
    private void check(){
        String re = "\\d+";
        String n1 = t1.getText();
        String n2 = t2.getText();
        if(!n1.matches(re) || !n2.matches(re)){
            bt1.setEnabled(true);
            lb1.setForeground(Color.red);
            lb1.setText("Nhap so");
        }else{
            bt2.setEnabled(true);
            lb1.setText("");
        }
        if(n1.isEmpty() && n2.isEmpty()){
            bt1.setEnabled(false);
        }
    }
    @Override
    public void insertUpdate(DocumentEvent e) {
        check();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        check();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
