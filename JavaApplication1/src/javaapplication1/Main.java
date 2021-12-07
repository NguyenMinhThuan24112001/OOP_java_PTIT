/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet.FontAttribute;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import java.awt.image.ImageObserver;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
public class Main extends JFrame implements ActionListener,DocumentListener {

	private JPanel contentPane;
	private JLabel lbln1,lbln2,lblkq;//nhan
	private JTextField txtn1,txtn2;//nhập liệu
	private JButton bt1,bt2,bt3;//Nút
	public Main() {
		initGUI();
	}

	private void initGUI() {
		// TODO Auto-generated method stub
		setTitle("Tinh Toan");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//an no lai cac thuoc tinh cua Jframe
		setLocationRelativeTo(this);
		setLayout(null);
		
		//khởi tạo
		lbln1 = new JLabel("Nhap so 1: ");
		lbln2 = new JLabel("Nhap so 2: ");
		lblkq = new JLabel("ket qua: ");
		lbln1.setBounds(50,50,120,20);
		lbln2.setBounds(50,100,120,20);
		lblkq.setBounds(80,150,200,20);
		add(lbln1);
		add(lbln2);
		add(lblkq);
		txtn1=new JTextField();
		txtn2=new JTextField();
		txtn1.setBounds(200,50,150,20);
		txtn2.setBounds(200,100,150,20);
		add(txtn1);
		add(txtn2);
		bt1=new JButton("Nhap Lai: ");
                bt1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    }
                });
		bt2=new JButton("Tinh");
                bt3=new JButton("Dong");
                bt3.setBounds(200, 240, 150, 20);
                add(bt3);
                bt3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //hrow new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    }
                });
		bt1.setBounds(100,200,150,20);
		bt2.setBounds(300,200,150,20);
                
		add(bt1);
		add(bt2);
		//Font f=new Font("Arial",Font.PLAIN,20);
               // bt1.set
               bt1.setEnabled(false);
               bt2.setEnabled(false);
                bt1.addActionListener(this);//lắng nghe sự kiện, this là ActionListener
		bt2.addActionListener(this);
                txtn1.getDocument().addDocumentListener(this);
                txtn2.getDocument().addDocumentListener(this);

		
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.setVisible(true);//kich hoat 1 cai cua so JFrame
	}

   // @Override
    public void check() { 
        String s1=txtn1.getText();
        String s2=txtn2.getText();
        if(s1.isEmpty() && s2.isEmpty())
            bt1.setEnabled(false);// nút nhập lại mờ đi
        if(!s1.isEmpty() || !s2.isEmpty())
            bt1.setEnabled(true);
        String reg ="\\d+";
        if(s1.matches(reg)&&s2.matches(reg))
            bt2.setEnabled(true);
        else
            bt2.setEnabled(false);
        //return super.checkImage(image, observer); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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
    
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt1){
            txtn1.setText("");
            txtn2.setText("");
        }
        if(e.getSource()==bt2){
            int n1=Integer.parseInt(txtn1.getText());
            int n2=Integer.parseInt(txtn2.getText());
            lblkq.setText("Tong : " + (n1+n2));
        }
        if(e.getSource()==bt3){
            if(JOptionPane.showConfirmDialog(this,"Co thoat khong","Thoat", JOptionPane.YES_NO_OPTION)
                    ==JOptionPane.YES_OPTION){
                System.exit(0);
            }
        }
    }
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Main1 frame = new Main1();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
//	public Main1() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		contentPane.setLayout(new BorderLayout(0, 0));
//		setContentPane(contentPane);
//	}

}

