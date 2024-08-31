package entities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela extends JFrame implements ActionListener {
    private JLabel label1;
    private JLabel label2;
    private  JTextField text1;
    private  JTextField text2;
    private JButton somabtn;
    private JLabel resultado;

    public Tela() {
        setLabel1();
        setText1();
        setLabel2();
        setText2();
        setSomabtn();
        setResultado();
        configurarTela();

    }

    //metodo para configurar a tela
    public void configurarTela(){
        // setar o titulo
        setTitle("Calculadora");
        //setar o tamanho da tela
        setSize(500,500);
        //centralizar a tela
        setLocationRelativeTo(null);
        //Desabilitar do usuario alterar o tamanho da tela
        setResizable(false);
        //Alterar o background
        getContentPane().setBackground(new Color(0xF805EC));
        // Usar o X para fechar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        //Deixar visivel a tela
        setVisible(true);
    }

    public void setLabel1(){
        this.label1 = new JLabel();
        this.label1.setText("Número 1:");
        this.label1.setBounds(10,10,150,25);
        this.label1.setFont(new Font("Times New Roman",Font.ITALIC,15));
        this.label1.setForeground(Color.WHITE);
        this.label1.setOpaque(true);
        this.label1.setBackground(Color.BLACK);
        add(this.label1);
    }
    public void setText1(){
        this.text1 = new JTextField();
        this.text1.setBounds(200,10,150,25);
        this.text1.setFont(new Font("Arial",Font.PLAIN,15));
        this.text1.setForeground(Color.cyan);
        this.text1.setBackground(Color.GRAY);
        add(this.text1);
    }
    public void setLabel2(){
        this.label2 = new JLabel();
        this.label2.setText("Número 2:");
        this.label2.setBounds(10,50,150,25);
        this.label2.setFont(new Font("Times New Roman",Font.ITALIC,15));
        this.label2.setForeground(Color.WHITE);
        this.label2.setOpaque(true);
        this.label2.setBackground(Color.BLACK);
        add(this.label2);
    }
    public void setText2(){
        this.text2 = new JTextField();
        this.text2.setBounds(200,50,150,25);
        this.text2.setFont(new Font("Arial",Font.PLAIN,15));
        this.text2.setForeground(Color.cyan);
        this.text2.setBackground(Color.GRAY);
        add(this.text2);
    }

    public void setSomabtn(){
        this.somabtn = new JButton();
        this.somabtn.setText("+");
        this.somabtn.setBounds(250,80,50,50);
        this.somabtn.setFont(new Font("Inter",Font.BOLD,25));
        this.somabtn.setBackground(Color.red);
        this.somabtn.setForeground(Color.WHITE);
        this.somabtn.addActionListener(this::actionPerformed);
        add(this.somabtn);
    }

    public void setResultado(){
        this.resultado = new JLabel();
        this.resultado.setText("");
        this.resultado.setBounds(250,150,50,50);
        this.resultado.setFont(new Font("Arial",Font.BOLD,15));
        this.resultado.setForeground(Color.WHITE);
        this.resultado.setOpaque(true);
        this.resultado.setBackground(Color.BLACK);
        add(resultado);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == somabtn){
            int x = Integer.parseInt(this.text1.getText());
            int y = Integer.parseInt(this.text2.getText());

            int soma = x + y;

            this.resultado.setText("" + soma);
            // para retornar uma outra tela
            //new Ola();
        }
    }
}
