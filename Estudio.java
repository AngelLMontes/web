import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Estudio extends JFrame implements ActionListener{
  
    
    
    protected JMenuBar mb;
    protected JMenu menuOpciones,menuDiagnosticar,menuAcercaDe,menuColorFondo;
    protected JMenuItem miDiagnostico,miRojo,miNegro,miMorado,miAzulClaro,miAmarillo,miVerde,miRosa,miElCreador,miSalir,miNuevo;
    protected JLabel labelLogo,labelBienvenido,labelTitle,labelNombre,labelSexo,labelEdadMasculino,
                   labelEstaturaMasculino,labelEdadFemenino,labelEstaturaFemenino,labelEnfermedad,labelResultado,labelfooter;
    protected JTextField txtNombrePaciente,txtAPaternoPaciente,txtAMaternoPaciente;
    protected JComboBox comboSexo,comboEdadMasculino,comboEstaturaMasculino,comboEdadFemenino,comboEstaturaFemenino,comboEnfermedad;
    protected JScrollPane scrollpane1, scrollpane2; 
    protected JTextArea textarea1;
    public Estudio Eleccion2;
    String nombreAdministrador = "";
    protected Object menuDiagnostico;

    


    public Estudio() {
            
      setLayout(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setTitle("Cuestionario para la Salud");
      getContentPane().setBackground(new Color(173,216,230));
      setIconImage(new ImageIcon(getClass().getResource("images/practicas.jpg")).getImage());
      Portada ventanaPortada = new Portada();
      nombreAdministrador = ventanaPortada.texto;

      mb = new JMenuBar();
      mb.setBackground(new Color(255, 192, 203));
      setJMenuBar(mb);

      menuOpciones = new JMenu("Opciones");
      menuOpciones.setBackground(new Color(255, 192, 203));
      menuOpciones.setFont(new Font("Times New Roman", 1, 14));
      menuOpciones.setForeground(new Color(0, 0, 0));
      mb.add(menuOpciones);
 
      menuDiagnosticar = new JMenu("Diagnosticar");
      menuDiagnosticar.setBackground(new Color(255, 0, 0));
      menuDiagnosticar.setFont(new Font("Times New Roman", 1, 14));
      menuDiagnosticar.setForeground(new Color(0, 0, 0));
      mb.add(menuDiagnosticar);

     
      menuAcercaDe = new JMenu("Acerca de");
      menuAcercaDe.setBackground(new Color(255, 0, 0));
      menuAcercaDe.setFont(new Font("Times New Roman", 1, 14));
      menuAcercaDe.setForeground(new Color(0, 0, 0));
      mb.add(menuAcercaDe);

      menuColorFondo = new JMenu("Color de fondo");
      menuColorFondo.setFont(new Font("Times New Roman", 1, 14));
      menuColorFondo.setForeground(new Color( 0, 0, 0));
      menuOpciones.add(menuColorFondo);

      miDiagnostico = new JMenuItem("Enfermedades");
      miDiagnostico.setFont(new Font("Times New Roman", 1, 14));
      miDiagnostico.setForeground(new Color( 0, 0, 0));
      menuDiagnosticar.add(miDiagnostico);
      miDiagnostico.addActionListener(this);

      
      miRojo = new JMenuItem("Rojo");
      miRojo.setFont(new Font("Times New Roman", 1, 14));
      miRojo.setForeground(new Color( 0, 0, 0));
      menuColorFondo.add(miRojo);
      miRojo.addActionListener(this);

      miNegro = new JMenuItem("Negro");
      miNegro.setFont(new Font("Times New Roman", 1, 14));
      miNegro.setForeground(new Color( 0, 0, 0));
      menuColorFondo.add(miNegro);
      miNegro.addActionListener(this);

      miMorado = new JMenuItem("Morado");
      miMorado.setFont(new Font("Times New Roman", 1, 14));
      miMorado.setForeground(new Color( 0, 0, 0));
      menuColorFondo.add(miMorado);
      miMorado.addActionListener(this);

      miAzulClaro = new JMenuItem("AzulClaro");
      miAzulClaro.setFont(new Font("Times New Roman", 1, 14));
      miAzulClaro.setForeground(new Color( 0, 0, 0));
      menuColorFondo.add(miAzulClaro);
      miAzulClaro.addActionListener(this);

      miAmarillo = new JMenuItem("Amarillo");
      miAmarillo.setFont(new Font("Times New Roman", 1, 14));
      miAmarillo.setForeground(new Color( 0, 0, 0));
      menuColorFondo.add(miAmarillo);
      miAmarillo.addActionListener(this);

      miVerde = new JMenuItem("Verde");
      miVerde.setFont(new Font("Times New Roman", 1, 14));
      miVerde.setForeground(new Color( 0, 0, 0));
      menuColorFondo.add(miVerde);
      miVerde.addActionListener(this);

      miRosa = new JMenuItem("Rosa");
      miRosa.setFont(new Font("Times New Roman", 1, 14));
      miRosa.setForeground(new Color( 0, 0, 0));
      menuColorFondo.add(miRosa);
      miRosa.addActionListener(this);

      miNuevo = new JMenuItem("Nuevo");
      miNuevo.setFont(new Font("Times New Roman", 1, 14));
      miNuevo.setForeground(new Color( 0, 0, 0));
      menuOpciones.add(miNuevo);
      miNuevo.addActionListener(this);

      miElCreador = new JMenuItem("El creador");
      miElCreador.setFont(new Font("Times New Roman", 1, 14));
      miElCreador.setForeground(new Color( 0, 0, 0));
      menuAcercaDe.add(miElCreador);
      miElCreador.addActionListener(this);

      miSalir = new JMenuItem("Salir");
      miSalir.setFont(new Font("Times New Roman", 1, 14));
      miSalir.setForeground(new Color( 0, 0, 0));
      menuOpciones.add(miSalir);
      miSalir.addActionListener(this);

      ImageIcon imagen = new ImageIcon("images/mvida2.jpg");
      Image imagenEscalada = imagen.getImage().getScaledInstance(255, 400, Image.SCALE_SMOOTH); 
      ImageIcon imagenFinal = new ImageIcon(imagenEscalada);
      labelLogo = new JLabel(imagenFinal);  
      labelLogo.setBounds(0,3,300,130);
      add(labelLogo);


      labelBienvenido = new JLabel("Bienvenido " + nombreAdministrador);  
      labelBienvenido.setBounds(280,30,600,50);
      labelBienvenido.setFont(new Font("Times New Roman", 1, 32));
      labelBienvenido.setForeground(new Color(0, 0, 0));
      int fontSize = Math.min(32, 600 / (nombreAdministrador.length() + 12));
      labelBienvenido.setFont(new Font("Times New Roman", Font.BOLD, fontSize));
      add(labelBienvenido);

      labelTitle = new JLabel("Descripción del paciente para el Diagnóstico");
      labelTitle.setBounds(45,140,900,25);
      labelTitle.setFont(new Font("Times New Roman", 0, 24));
      labelTitle.setForeground(new Color(0, 0, 0));
      add(labelTitle);

      labelNombre = new JLabel("Nombre completo:");
      labelNombre.setBounds(25,188,180,25);
      labelNombre.setFont(new Font("Times New Roman", 1, 12));
      labelNombre.setForeground(new Color(0, 0, 0));
      add(labelNombre);

      txtNombrePaciente = new JTextField();
      txtNombrePaciente.setBounds(25,213,180,25);
      txtNombrePaciente.setBackground(new java.awt.Color(224, 224, 224));
      txtNombrePaciente.setFont(new java.awt.Font("Times New Roman", 1, 14));
      txtNombrePaciente.setForeground(new java.awt.Color( 0, 0, 0));
      add(txtNombrePaciente);

      labelSexo = new JLabel("Indica tu Sexo:");
      labelSexo.setBounds(25,248,180,25);
      labelSexo.setFont(new Font("Times New Roman", 1, 12));
      labelSexo.setForeground(new Color(0, 0, 0));
      add(labelSexo);

      comboSexo = new JComboBox<>(new String[]{"", "Masculino", "Femenino"});
      comboSexo.setBounds(25,273,180,25);
      comboSexo.setBackground(new java.awt.Color(224, 224, 224));
      comboSexo.setFont(new java.awt.Font("Times New Roman", 1, 12));
      comboSexo.setForeground(new java.awt.Color(0, 0, 0));
      add(comboSexo);
      comboSexo.addActionListener(this);
      
      labelEdadMasculino = new JLabel("Indica tu Edad:");
      labelEdadMasculino.setBounds(220,188,180,25);
      labelEdadMasculino.setFont(new Font("Times New Roman", 1, 12));
      labelEdadMasculino.setForeground(new Color(0, 0, 0));
      add(labelEdadMasculino);

      comboEdadMasculino = new JComboBox();
      comboEdadMasculino.setBounds(220,213,220,25);
      comboEdadMasculino.setBackground(new java.awt.Color(224, 224, 224));
      comboEdadMasculino.setFont(new java.awt.Font("Times New Roman", 1, 14));
      comboEdadMasculino.setForeground(new java.awt.Color(0, 0, 0));
      add(comboEdadMasculino);
      comboEdadMasculino.addItem("");
      comboEdadMasculino.addItem("Infancia = 0-9 años");
      comboEdadMasculino.addItem("Adolescencia = 10-21 años");
      comboEdadMasculino.addItem("Juventud = 22-29 años");
      comboEdadMasculino.addItem("Adultez = 30 - 59 años");
      comboEdadMasculino.addItem("Adultez Mayor = 60 - 74 años");
      comboEdadMasculino.addItem("Ancianidad = 75 años o mas");
      comboEdadMasculino.addActionListener(this);

      labelEstaturaMasculino = new JLabel("Selecciona tu Estatura:");
      labelEstaturaMasculino.setBounds(220,248,180,25);
      labelEstaturaMasculino.setFont(new Font("Times New Roman", 1, 12));
      labelEstaturaMasculino.setForeground(new Color(0, 0, 0));
      add(labelEstaturaMasculino);

      comboEstaturaMasculino = new JComboBox();
      comboEstaturaMasculino.setBounds(220,273,220,25);
      comboEstaturaMasculino.setBackground(new java.awt.Color(224, 224, 224));
      comboEstaturaMasculino.setFont(new java.awt.Font("Times New Roman", 1, 14));
      comboEstaturaMasculino.setForeground(new java.awt.Color(0, 0, 0));
      add(comboEstaturaMasculino);
      comboEstaturaMasculino.addItem("");
      comboEstaturaMasculino.addItem("0.90-1.35 m");
      comboEstaturaMasculino.addItem("1.45-1.70 m");
      comboEstaturaMasculino.addItem("1.65-1.80 m");
      comboEstaturaMasculino.addItem("1.55-1.70 m");
      comboEstaturaMasculino.addItem("1.45-1.60 m");
      comboEstaturaMasculino.addActionListener(this);

    
      labelEdadFemenino = new JLabel("Indica tu Edad:");
      labelEdadFemenino.setBounds(220,188,180,25);
      labelEdadFemenino.setFont(new Font("Times New Roman", 1, 12));
      labelEdadFemenino.setForeground(new Color(0, 0, 0));
      add(labelEdadFemenino);

      comboEdadFemenino = new JComboBox();
      comboEdadFemenino.setBounds(220,213,220,25);
      comboEdadFemenino.setBackground(new java.awt.Color(224, 224, 224));
      comboEdadFemenino.setFont(new java.awt.Font("Times New Roman", 1, 14));
      comboEdadFemenino.setForeground(new java.awt.Color(0, 0, 0));
      add(comboEdadFemenino);
      comboEdadFemenino.addItem("");
      comboEdadFemenino.addItem("Infancia = 0-9 años");
      comboEdadFemenino.addItem("Adolescencia = 10-21 años");
      comboEdadFemenino.addItem("Juventud = 22-29 años");
      comboEdadFemenino.addItem("Adultez = 30 - 59 años");
      comboEdadFemenino.addItem("Adultez Mayor = 60 - 74 años");
      comboEdadFemenino.addItem("Ancianidad = 75 años o mas");
      comboEdadFemenino.addActionListener(this);

      labelEstaturaFemenino = new JLabel("Selecciona tu Estatura:");
      labelEstaturaFemenino.setBounds(220,248,180,25);
      labelEstaturaFemenino.setFont(new Font("Times New Roman", 1, 12));
      labelEstaturaFemenino.setForeground(new Color(0, 0, 0));
      add(labelEstaturaFemenino);

      comboEstaturaFemenino = new JComboBox();
      comboEstaturaFemenino.setBounds(220,273,220,25);
      comboEstaturaFemenino.setBackground(new java.awt.Color(224, 224, 224));
      comboEstaturaFemenino.setFont(new java.awt.Font("Times New Roman", 1, 14));
      comboEstaturaFemenino.setForeground(new java.awt.Color(0, 0, 0));
      add(comboEstaturaFemenino);
      comboEstaturaFemenino.addItem("");
      comboEstaturaFemenino.addItem("0.80-1.35 m");
      comboEstaturaFemenino.addItem("1.35-1.60 m");
      comboEstaturaFemenino.addItem("1.50-1.75 m");
      comboEstaturaFemenino.addItem("1.40-1.65 m");
      comboEstaturaFemenino.addItem("1.30-1.60 m");
      comboEstaturaFemenino.addActionListener(this);
      
      labelEnfermedad = new JLabel("Selecciona los sintomas que experimentas:");
      labelEnfermedad.setBounds(460,188,300,25);
      labelEnfermedad.setFont(new Font("Times New Roman", 1, 12));
      labelEnfermedad.setForeground(new Color(0, 0, 0));
      add(labelEnfermedad);

      comboEnfermedad = new JComboBox();
      comboEnfermedad.setBounds(460,213,320,25);
      comboEnfermedad.setBackground(new java.awt.Color(224, 224, 224));
      comboEnfermedad.setFont(new java.awt.Font("Times New Roman", 1, 14));
      comboEnfermedad.setForeground(new java.awt.Color(0, 0, 0));
      add(comboEnfermedad);
      comboEnfermedad.addItem("");
      comboEnfermedad.addItem("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.");
      comboEnfermedad.addItem("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.");
      comboEnfermedad.addItem("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.");
      comboEnfermedad.addItem("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.");
      comboEnfermedad.addItem("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).");
      comboEnfermedad.addItem("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.");
      comboEnfermedad.addItem("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.");
      comboEnfermedad.addItem("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.");
      comboEnfermedad.addItem("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).");
      comboEnfermedad.addItem("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.");
      comboEnfermedad.addItem("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.");
      comboEnfermedad.addItem("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.");
      comboEnfermedad.addItem("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.");
      comboEnfermedad.addItem("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.");
      comboEnfermedad.addItem("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.");
      comboEnfermedad.addItem("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.");
      comboEnfermedad.addItem("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.");
      comboEnfermedad.addItem("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.");
      comboEnfermedad.addItem("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.");
      comboEnfermedad.addItem("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.");
      comboEnfermedad.addActionListener(this);
      scrollpane2 = new JScrollPane(comboEnfermedad);
      scrollpane2.setBounds(460,213,320,60);
      add(scrollpane2);
    
      labelfooter = new JLabel("©2025 Dimension X | Todos los derechos reservados");
      labelfooter.setBounds(250,445,750,30);
      labelfooter.setFont(new java.awt.Font("Times New Roman", 1, 16));
      labelfooter.setForeground(new java.awt.Color(0, 0, 0));
      add(labelfooter);
    
     }
     public void actionPerformed(ActionEvent e){
       
         if (e.getSource() == miDiagnostico) {
           
           
           
                if(comboSexo.getSelectedItem().equals("")){
               JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
           }
           
            
            
         
       }
       
       if (e.getSource() == miRojo) {
        getContentPane().setBackground(new Color(255,0,0));
        }
        if (e.getSource() == miNegro) {
           getContentPane().setBackground(new Color(0,0,0));
        }
        if (e.getSource() == miMorado) {
           getContentPane().setBackground(new Color(128,0,128));
        }
        if (e.getSource() == miAzulClaro) {
           getContentPane().setBackground(new Color(173,216,230));
        }
        if (e.getSource() == miAmarillo) {
           getContentPane().setBackground(new Color(255,255,0));
        }
        if (e.getSource() == miVerde) {
           getContentPane().setBackground(new Color(0,255,0));
        }
        if (e.getSource() == miRosa) {
           getContentPane().setBackground(new Color(255,192,203));
        }
        if (e.getSource() == miNuevo) {
          
          txtNombrePaciente.setText(""); 
          comboSexo.setSelectedIndex(0);
          comboEdadMasculino.setSelectedIndex(0);
          comboEstaturaMasculino.setSelectedIndex(0);
          comboEdadFemenino.setSelectedIndex(0);
          comboEstaturaFemenino.setSelectedIndex(0);
          comboEnfermedad.setSelectedIndex(0);
          textarea1.setText("\n    Aqui aparece el Diagnostico del paciente.");
          
        }
        if (e.getSource() == miSalir) {
           Portada ventanaportada = new Portada();
           ventanaportada.setBounds(0,0,350,450);
           ventanaportada.setVisible(true);
           ventanaportada.setResizable(false);
           ventanaportada.setLocationRelativeTo(null);
           this.setVisible(false);
        }
        if (e.getSource() == miElCreador) {
        
            JOptionPane.showMessageDialog(null,"Desarrollado por Dimension X | Angel L Montes\n"+
                                                             "     Amazon.mx-La Maquina Perfecta El Castillo");
        }
           if (e.getSource() == comboSexo) {
                    String sexoSeleccionado = (String) comboSexo.getSelectedItem();
         
              
      
            remove(labelEdadMasculino);
            remove(comboEdadMasculino);
            remove(labelEstaturaMasculino);
            remove(comboEstaturaMasculino);
        
        
            remove(labelEdadFemenino);
            remove(comboEdadFemenino);
            remove(labelEstaturaFemenino);
            remove(comboEstaturaFemenino);
        
            revalidate();
            repaint();
        
      
         
        
      if ("Femenino".equals(sexoSeleccionado)) {
        add(labelEdadFemenino);
        add(comboEdadFemenino);
        add(labelEstaturaFemenino);
        add(comboEstaturaFemenino);
    } else if ("Masculino".equals(sexoSeleccionado)) {
        add(labelEdadMasculino);
        add(comboEdadMasculino);
        add(labelEstaturaMasculino);
        add(comboEstaturaMasculino);
    }

    revalidate();
    repaint();
        }
      }
       public void elegirCondicion(){
            
       }


       private void actualizarDatos() {
       }
         // Actualiza el contenedor después de modificar la visibilidad
      public void crearInterfaz(){
          
      }    
      
    
     
    
    public static void main(String args[]) {
        Estudio ventanaEstudio = new Estudio();
        ventanaEstudio.setBounds(0,0,850,600);
        ventanaEstudio.setVisible(true);
        ventanaEstudio.setResizable(true);
        ventanaEstudio.setLocationRelativeTo(null);
    
    } 
    public void elegirCondicion(String nombrePaciente, String Sexo, String EdadMasculino, String EstaturaMasculino,
               String EdadFemenino, String EstaturaFemenino, String Enfermedad){
           
       }            

  }