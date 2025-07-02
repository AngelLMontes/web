import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


     public class Estudios implements ActionListener{
               

    private Estudio Elecciones;
    private Estudio2 Eleccion2;
    private Estudio3 Eleccion3;
    private Estudio4 Eleccion4;
    private Estudio5 Eleccion5;
    private Estudio6 Eleccion6;
    private Estudio7 Eleccion7;
    private Estudio8 Eleccion8;
    private Estudio9 Eleccion9;
    private Estudio10 Eleccion10;
    private Estudio11 Eleccion11;
    private Estudio12 Eleccion12;
    private Estudio13 Eleccion13;
    
            public Estudios() {

        Elecciones = new Estudio();

        Elecciones.crearInterfaz();
        Elecciones.setBounds(0, 0, 830, 560);
        Elecciones.setVisible(true);
        Elecciones.setResizable(true);
        Elecciones.setLocationRelativeTo(null);
        Elecciones.miDiagnostico.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    
                    String nombrePaciente = Elecciones.txtNombrePaciente.getText().toString();
                    String Sexo = Elecciones.comboSexo.getSelectedItem().toString();
                    String EdadMasculino = Elecciones.comboEdadMasculino.getSelectedItem().toString();
                    String EstaturaMasculino = Elecciones.comboEstaturaMasculino.getSelectedItem().toString();
                    String Enfermedad = Elecciones.comboEnfermedad.getSelectedItem().toString();
                if (((String)Elecciones.comboSexo.getSelectedItem()).equals("Masculino")){
                
                    if (Elecciones.txtNombrePaciente.getText().equals("")
                            || Elecciones.comboSexo.getSelectedItem().equals("")
                            || Elecciones.comboEdadMasculino.getSelectedItem().equals("")
                            || Elecciones.comboEstaturaMasculino.getSelectedItem().equals("")
                            || Elecciones.comboEnfermedad.getSelectedItem().equals("")) {

                        JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");

                    } else {
                        
                      
                       
                        if (!Elecciones.txtNombrePaciente.getText().isEmpty() &&
                            !((String) Elecciones.comboSexo.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEdadMasculino.getSelectedItem()).equals("Infancia = 0-9 años") &&
                                !((String) Elecciones.comboEstaturaMasculino.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEnfermedad.getSelectedItem()).isEmpty()) {
                            Eleccion2 = new Estudio2(nombrePaciente, Sexo, EdadMasculino, EstaturaMasculino, Enfermedad);
                            
                         
                        } 
                        if (!Elecciones.txtNombrePaciente.getText().isEmpty() &&
                                !((String) Elecciones.comboSexo.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEdadMasculino.getSelectedItem()).equals("Adolescencia = 10-21 años") && 
                                !((String) Elecciones.comboEstaturaMasculino.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEnfermedad.getSelectedItem()).isEmpty()) {
                                                             
                            
                            Eleccion3 = new Estudio3(nombrePaciente, Sexo, EdadMasculino, EstaturaMasculino, Enfermedad);
                            
                            
                        }
                        if (!Elecciones.txtNombrePaciente.getText().isEmpty() &&
                            !((String) Elecciones.comboSexo.getSelectedItem()).isEmpty() &&
                            !((String) Elecciones.comboEdadMasculino.getSelectedItem()).isEmpty() && 
                            !((String) Elecciones.comboEstaturaMasculino.getSelectedItem()).isEmpty() &&
                            !((String) Elecciones.comboEnfermedad.getSelectedItem()).isEmpty()){
                            Eleccion4 = new Estudio4(nombrePaciente, Sexo, EdadMasculino, EstaturaMasculino, Enfermedad);
                            
                            
                        }
                        if (!Elecciones.txtNombrePaciente.getText().isEmpty() &&
                                !((String) Elecciones.comboSexo.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEdadMasculino.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEstaturaMasculino.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEnfermedad.getSelectedItem()).isEmpty()) {
                            Eleccion5 = new Estudio5(nombrePaciente, Sexo, EdadMasculino, EstaturaMasculino, Enfermedad);
                            
                            
                        }
                        if (!Elecciones.txtNombrePaciente.getText().isEmpty() &&
                                !((String) Elecciones.comboSexo.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEdadMasculino.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEstaturaMasculino.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEnfermedad.getSelectedItem()).isEmpty()) {
                            Eleccion6 = new Estudio6(nombrePaciente, Sexo, EdadMasculino, EstaturaMasculino, Enfermedad);
                            
                            
                        } 
                        if (!Elecciones.txtNombrePaciente.getText().isEmpty() &&
                                !((String) Elecciones.comboSexo.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEdadMasculino.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEstaturaMasculino.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEnfermedad.getSelectedItem()).isEmpty()) {
                            Eleccion7 = new Estudio7(nombrePaciente, Sexo, EdadMasculino, EstaturaMasculino, Enfermedad);
                            Elecciones.dispose();
                            
                        }
                        
                    } 
                }       
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Ocurrió un error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        Elecciones.miDiagnostico.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
             
                String nombrePaciente = Elecciones.txtNombrePaciente.getText().toString();
                String Sexo = Elecciones.comboSexo.getSelectedItem().toString();
                String EdadFemenino = Elecciones.comboEdadFemenino.getSelectedItem().toString();
                String EstaturaFemenino = Elecciones.comboEstaturaFemenino.getSelectedItem().toString();
                String Enfermedad = Elecciones.comboEnfermedad.getSelectedItem().toString();
                
                if (((String)Elecciones.comboSexo.getSelectedItem()).equals("Femenino")){
                    
                if (Elecciones.txtNombrePaciente.getText().equals("")
                            || Elecciones.comboSexo.getSelectedItem().equals("")
                            || Elecciones.comboEdadFemenino.getSelectedItem().equals("")
                            || Elecciones.comboEstaturaFemenino.getSelectedItem().equals("")
                            || Elecciones.comboEnfermedad.getSelectedItem().equals("")) {

                        JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");

                    } else {    
                    
                if (!Elecciones.txtNombrePaciente.getText().isEmpty() &&
                    !((String) Elecciones.comboSexo.getSelectedItem()).isEmpty() &&
                    !((String) Elecciones.comboEdadFemenino.getSelectedItem()).isEmpty() &&
                    !((String) Elecciones.comboEstaturaFemenino.getSelectedItem()).isEmpty() &&
                    !((String) Elecciones.comboEnfermedad.getSelectedItem()).isEmpty()) {
                     Eleccion8 = new Estudio8(nombrePaciente, Sexo, EdadFemenino, EstaturaFemenino, Enfermedad);
                    
                 
                }
                if (!Elecciones.txtNombrePaciente.getText().isEmpty() &&
                                !((String) Elecciones.comboSexo.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEdadFemenino.getSelectedItem()).equals("Adolescencia = 10-21 años") && 
                                !((String) Elecciones.comboEstaturaFemenino.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEnfermedad.getSelectedItem()).isEmpty()) {
                                                             
                            
                            Eleccion9 = new Estudio9(nombrePaciente, Sexo, EdadFemenino, EstaturaFemenino, Enfermedad);
                            
                            
                        }
                        if (!Elecciones.txtNombrePaciente.getText().isEmpty() &&
                            !((String) Elecciones.comboSexo.getSelectedItem()).isEmpty() &&
                            !((String) Elecciones.comboEdadFemenino.getSelectedItem()).isEmpty() && 
                            !((String) Elecciones.comboEstaturaFemenino.getSelectedItem()).isEmpty() &&
                            !((String) Elecciones.comboEnfermedad.getSelectedItem()).isEmpty()){
                            Eleccion10 = new Estudio10(nombrePaciente, Sexo, EdadFemenino, EstaturaFemenino, Enfermedad);
                            
        
                        }
                        if (!Elecciones.txtNombrePaciente.getText().isEmpty() &&
                                !((String) Elecciones.comboSexo.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEdadFemenino.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEstaturaFemenino.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEnfermedad.getSelectedItem()).isEmpty()) {
                            Eleccion11 = new Estudio11(nombrePaciente, Sexo, EdadFemenino, EstaturaFemenino, Enfermedad);
                            
                            
                        }
                        if (!Elecciones.txtNombrePaciente.getText().isEmpty() &&
                                !((String) Elecciones.comboSexo.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEdadFemenino.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEstaturaFemenino.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEnfermedad.getSelectedItem()).isEmpty()) {
                            Eleccion12 = new Estudio12(nombrePaciente, Sexo, EdadFemenino, EstaturaFemenino, Enfermedad);
                            
                            
                        } 
                        if (!Elecciones.txtNombrePaciente.getText().isEmpty() &&
                                !((String) Elecciones.comboSexo.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEdadFemenino.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEstaturaFemenino.getSelectedItem()).isEmpty() &&
                                !((String) Elecciones.comboEnfermedad.getSelectedItem()).isEmpty()) {
                            Eleccion13 = new Estudio13(nombrePaciente, Sexo, EdadFemenino, EstaturaFemenino, Enfermedad);
                            Elecciones.dispose();
                            
                        }
                
              }
             }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }

    public static void main(String args[]) {
        new Estudios();
    }
}