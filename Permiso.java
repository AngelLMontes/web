import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Permiso extends JFrame implements ActionListener, ChangeListener{
  
  private JLabel label1, label2;
  private JCheckBox check1;
  private JButton boton1, boton2;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;
  String nombre = "";

  public Permiso(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Permiso para el uso del sistema");
    setIconImage(new ImageIcon(getClass().getResource("images/Portadax.png")).getImage());
    Portada ventanaPortada = new Portada();
    nombre = ventanaPortada.texto;
   
  
    label1 = new JLabel("PERMISO PARA EL USO DEL SISTEMA");
    label1.setBounds(50,5,420,30);
    label1.setFont(new Font("Times New Roman",1, 22));
    label1.setForeground(new Color(0,0,0));
    add(label1);

    textarea1 = new JTextArea();
    textarea1.setEditable(false);
    textarea1.setFont(new Font("Arial", 0, 12));
    textarea1.setText("\n\n               PERMISO PARA EL USO DEL SISTEMA; " +
                    "\n\n                 MI VIDA ES UN SISTEMA DESARROLLADO POR ANGEL L MONTES." +
                    "\n         PARA MONITOREAR E INFORMAR LA SALUD DE LAS PERSONAS MEDIANTE UN ALGORITMO DE ESTUDIO." +
                    "\n         SIMPLE PARA LLEGAR A UNA POSIBLE CONCLUSION LOGICA PREDETERMINADA POR EL SISTEMA." +
                    "\n\n       AL CONTINUAR, ACEPTAS QUE EL USO DE LA INFORMACION PUBLICA Y GRATUITA QUE TE PROPORCIONA." +
                    "\n          MI VIDA ES SOLO TU RESPONZABILIDAD Y EN TI DECAE Y DEPENDE CUALQUIER DESICION " +
                    "\n         SOBRE TU SALUD SIN COMPROMETER DE FORMA ALGUNA LA INFLUENCIA DEL SISTEMA  MI VIDA." +
                    "\n         A MENOS QUE SEA PARA FINES DE PROMOTORIA ASERTIVA HACIA EL SISTEMA Y SIN FINES DE LUCRO." + 
                    "\n\n       DA CLICK EN EL ICONO DE (ACEPTO) SI ESTAS DE ACUERDO CON TODO LO ANTERIOR Y PRESIONA CONTINUAR," + 
                    "\n         PARA MAS CONTENIDO SIMILAR VISITA Amazon.mx la maquina perfecta y biologia nuclear ,libros de Angel L Montes");
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(10,40,660,250);
    add(scrollpane1);

    check1 = new JCheckBox(" Yo " + nombre + " Acepto");
    check1.setBounds(10,290,300,30);
    check1.addChangeListener(this);
    add(check1);

    boton1 = new JButton("Continuar");
    boton1.setBounds(10,330,100,30);
    boton1.addActionListener(this);
    boton1.setEnabled(false);
    add(boton1);

    boton2 = new JButton("No acepto");
    boton2.setBounds(120,330,100,30);
    boton2.addActionListener(this);
    boton2.setEnabled(true);
    add(boton2);

    ImageIcon imagen = new ImageIcon("images/mvida1.jpg");
    label2 = new JLabel(imagen);
    label2.setBounds( 0, 0,694,372);
    add(label2);
 }

 public void stateChanged(ChangeEvent e){
   if(check1.isSelected() == true){
   boton1.setEnabled(true);
   boton2.setEnabled(false);
   } else {
      boton1.setEnabled(false);
      boton2.setEnabled(true);
  }
      
 }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton1){
       Estudios ventanaEstudios = new Estudios();
        this.setVisible(false);
        
    } else if(e.getSource() == boton2){
        Portada ventanaportada = new Portada();
        ventanaportada.setBounds(0,0,350,450);
        ventanaportada.setVisible(true);
        ventanaportada.setResizable(false);
        ventanaportada.setLocationRelativeTo(null);
        this.setVisible(false);

    }
   
   }
 
  public static void main(String args[]){
    Permiso ventanapermiso = new Permiso();
    ventanapermiso.setBounds(0,0,700,400);
    ventanapermiso.setVisible(true);
    ventanapermiso.setResizable(false);
    ventanapermiso.setLocationRelativeTo(null);

  }

}