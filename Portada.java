import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Portada extends JFrame implements ActionListener{

  private JTextField textfield1;
  private JLabel label1, label2, label3, label4;
  private JButton boton1, boton2, boton3;
  public static String texto = "";

  public Portada(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Bienvenido");
    getContentPane().setBackground(new Color(150,225,230));
    setIconImage(new ImageIcon(getClass().getResource("images/practicas.jpg")).getImage());


    label2 = new JLabel("Mi Vida");
    label2.setBounds(125,150,350,30);
    label2.setFont(new Font("Times New Roman", 1, 25));
    label2.setForeground(new Color(0, 0, 0));
    add(label2);

    label3 = new JLabel("Ingrese su nombre");
    label3.setBounds(45,212,200,30);
    label3.setFont(new Font("Times New Roman", 1, 22));
    label3.setForeground(new Color(0,0,0));
    add(label3);

    label4 = new JLabel("©2025 Dimension X");
    label4.setBounds(85,375,300,30);
    label4.setFont(new Font("Times New Roman", 1, 18));
    label4.setForeground(new Color( 0, 0, 0));
    add(label4);

    textfield1 = new JTextField ();
    textfield1.setBounds(45,240,255,25);
    textfield1.setBackground(new Color(224,224,224));
    textfield1.setFont(new Font("New Times Roman", 1, 14));
    textfield1.setForeground(new Color(0,0,0));
    add(textfield1);

   boton1 = new JButton("Ingresar");
   boton1.setBounds(125,280,100,30);
   boton1.setBackground(new Color(225,255,255));
   boton1.setFont(new Font("Times New Roman", 1, 14));
   boton1.setForeground(new Color(0,0,0));
   boton1.addActionListener(this);
   add(boton1);


   boton2 = new JButton("Donativos");
   boton2.setBounds(20,280,100,30);
   boton2.setBackground(new Color(225,255,255));
   boton2.setFont(new Font("Times New Roman", 1, 14));
   boton2.setForeground(new Color(0,0,0));
   boton2.addActionListener(this);
   add(boton2);
   
   boton3 = new JButton("Gracias");
   boton3.setBounds(230,280,100,30);
   boton3.setBackground(new Color(225,255,255));
   boton3.setFont(new Font("Times New Roman", 1, 14));
   boton3.setForeground(new Color(50,0,0));
   boton3.addActionListener(this);
   add(boton3);
   
   ImageIcon imagen = new ImageIcon("images/portada.jpg");
    label1 = new JLabel(imagen);
    label1.setBounds(0, 0,344,422);
    add(label1);

  }

   public void actionPerformed(ActionEvent e){
       
       if(e.getSource() == boton2){
           JOptionPane.showMessageDialog(null, " Si te gusta la app, y gustas apoyar a Dimension X | Angel L Montes \n"+
                                               "puedes apoyar al número de cuenta - 4152 3142 8299 1440 -  ");
       }
       if(e.getSource() == boton3){
           JOptionPane.showMessageDialog(null, "Angel L Montes agradece a Luis Goytia Santillan. Por su\n"+
                                               " contribución al proyecto - Mi Vida -");
       }
       
       
       
     if(e.getSource() == boton1){
      texto = textfield1.getText().trim();
      if(texto.equals("")){
         JOptionPane.showMessageDialog(null, "Ingresa tu nombre.");
      } else {
         Permiso ventanapermiso = new Permiso();
         ventanapermiso.setBounds(0,0,700,400);
         ventanapermiso.setVisible(true);
         ventanapermiso.setResizable(false);
         ventanapermiso.setLocationRelativeTo(null);
         this.setVisible(false);
      }
     } 
    }

   public static void main(String args[]){
     Portada ventanaportada = new Portada();
     ventanaportada.setBounds(0,0,350,450);
     ventanaportada.setVisible(true);
     ventanaportada.setResizable(false);
     ventanaportada.setLocationRelativeTo(null);
  }
}