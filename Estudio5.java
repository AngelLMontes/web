import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Estudio5 implements ActionListener{
    
  
         private final JLabel label1;
         private JScrollPane scrollpane1;
         private JTextArea textarea1;
         private JFrame frame;
         private final String edadEsperada = "Adultez = 30 - 59 a�os";
         private String edadRecibida;
         
         
        public Estudio5(String nombrePaciente, String Sexo, String EdadMasculino,
        String EstaturaMasculino, String Enfermedad) {
        
        this.frame = new JFrame(); 
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Resultado Final Del Diagnostico del Paciente");
        frame.setIconImage(new ImageIcon(getClass().getResource("images/Portadax.png")).getImage());
        
        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setBackground(new Color(224, 224, 224));
        textarea1.setForeground(new Color(0, 0, 0));
        textarea1.setText("Este es el resultado de tu diagnostico.");
        textarea1.setFont(new Font("Arial", 0, 12));
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10, 40, 780, 470);
        frame.add(scrollpane1);
        
        label1 = new JLabel("RESULTADO DEL DIAGNOSTICO DEL PACIENTE");
        label1.setBounds(50, 5, 400, 30);
        label1.setFont(new Font("Times New Roman", 1, 14));
        label1.setForeground(new Color(0, 0, 0));
        frame.add(label1);
    
        frame.setBounds(0 , 0, 850, 600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        this.edadRecibida = EdadMasculino;

         
        if(Sexo.equals("Masculino")){
                  if(EdadMasculino.equals("Adultez = 30 - 59 a�os")){
                      
                        if(EstaturaMasculino.equals("0.90-1.35 m")){
                              if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N: Para un adulto masculino de entre 30 y 59 a�os con una estatura de 0.90-1.35 m, se recomienda el consumo   " +
                                                  "\n diario de aproximadamente 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos de tama�o regular) para mantener una       " +
                                                  "\n adecuada hidrataci�n y ayudar al cuerpo a combatir la infecci�n. EJERCICIO: Se sugiere realizar actividad f�sica        " +
                                                  "\n moderada, como caminatas de 30 a 45 minutos al d�a, evitando esfuerzos excesivos mientras persistan los s�ntomas,       " +
                                                  "\n ya que el descanso es clave para la recuperaci�n. POSIBLE TRATAMIENTO: El tratamiento para la influenza en adultos      " +
                                                  "\n suele incluir antivirales como el oseltamivir (Tamiflu) y zanamivir (Relenza), los cuales pueden ayudar a reducir       " +
                                                  "\n la duraci�n y gravedad de la enfermedad si se administran dentro de las primeras 48 horas de s�ntomas. Tambi�n se       " +
                                                  "\n recomienda el uso de analg�sicos y antipir�ticos como el paracetamol (Tempra) o el ibuprofeno (Advil) para aliviar      " +
                                                  "\n fiebre y malestar general. Adem�s, es importante el descanso adecuado y el consumo de l�quidos para evitar la           " +
                                                  "\n deshidrataci�n. ALIMENTACI�N: Se recomienda el consumo de frutas y verduras ricas en vitaminas y antioxidantes para     " +
                                                  "\n fortalecer el sistema inmunol�gico, tales como naranjas, que contienen aproximadamente 53 mg de vitamina C por cada     " +
                                                  "\n 100 gramos, lo que representa cerca del 88% de la ingesta diaria recomendada para un adulto; fresas, con 59 mg de       " +
                                                  "\n vitamina C por cada 100 gramos, cubriendo el 98% de la ingesta diaria recomendada; pl�tanos, ricos en potasio, �til     " +
                                                  "\n para mantener el equilibrio de electrolitos; y kiwi, con 92 mg de vitamina C por cada 100 gramos, lo que equivale al    " +
                                                  "\n 153% de la ingesta diaria recomendada. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza" +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello   " +
                                                  "\n se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su   " +
                                                  "\n paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar " +
                                                  "\n a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos de tama�o   " +
                                                  "\n regular) para mantener una adecuada hidrataci�n y ayudar a fluidificar las secreciones pulmonares, facilitando la respiraci�n. " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente, evitando esfuerzos excesivos. Se      " +
                                                  "\n recomienda caminatas suaves de 20 a 30 minutos al d�a, siempre que no haya dificultad respiratoria, y ejercicios de respiraci�n " +
                                                  "\n profunda para mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: El tratamiento para la neumon�a en adultos depende del agente causal." +
                                                  "\n En casos bacterianos, se suelen recetar antibi�ticos como la amoxicilina o la azitromicina, marcas comunes en M�xico: Amoxil y  " +
                                                  "\n Zithromax. En neumon�as virales, el tratamiento se centra en el alivio de s�ntomas con antipir�ticos como el paracetamol (Tempra)" +
                                                  "\n y antiinflamatorios como el ibuprofeno (Advil). En casos graves, puede requerirse hospitalizaci�n con oxigenoterapia y, en       " +
                                                  "\n situaciones cr�ticas, soporte respiratorio. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en vitaminas y antioxidantes" +
                                                  "\n para fortalecer el sistema inmunol�gico y reducir la inflamaci�n pulmonar. Algunos ejemplos incluyen zanahorias, que contienen   " +
                                                  "\n aproximadamente 334% de la ingesta diaria recomendada de vitamina A por cada 100 gramos, esencial para la salud pulmonar;       " +
                                                  "\n naranjas, con 53 mg de vitamina C por cada 100 gramos, lo que representa cerca del 88% de la ingesta diaria recomendada;       " +
                                                  "\n espinacas, ricas en hierro y antioxidantes que favorecen la oxigenaci�n celular; y almendras, que aportan vitamina E, clave    " +
                                                  "\n para la protecci�n de las c�lulas pulmonares. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no         " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para     " +
                                                  "\n ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su     " +
                                                  "\n paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a      " +
                                                  "\n su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes. " +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua al d�a para mantener una adecuada    " +
                                                  "\n hidrataci�n y ayudar a regular los niveles de glucosa en sangre. EJERCICIO: Se sugiere realizar actividad f�sica moderada,  " +
                                                  "\n como caminatas de 30 a 45 minutos al d�a, ejercicios de resistencia y entrenamiento aer�bico, lo que contribuye a mejorar   " +
                                                  "\n la sensibilidad a la insulina y el control de la glucosa. POSIBLE TRATAMIENTO: El tratamiento para la diabetes tipo 2 suele " +
                                                  "\n incluir medicamentos como la metformina (Glucophage, Dianben), que ayuda a reducir la producci�n de glucosa en el h�gado, y " +
                                                  "\n en algunos casos, insulina para el control de niveles elevados. Tambi�n se recomienda el monitoreo constante de la glucosa  " +
                                                  "\n en sangre y ajustes en la dieta. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en fibra y bajos en carbohidratos" +
                                                  "\n refinados, como avena, que aporta aproximadamente 4 gramos de fibra por cada 100 gramos, ayudando a estabilizar los niveles " +
                                                  "\n de glucosa; almendras, que contienen grasas saludables y vitamina E, beneficiosas para la salud cardiovascular; espinacas,  " +
                                                  "\n ricas en magnesio, esencial para la regulaci�n de la glucosa; y fresas, con 59 mg de vitamina C por cada 100 gramos, lo que " +
                                                  "\n representa cerca del 98% de la ingesta diaria recomendada y contribuye a la protecci�n celular. Este es solo un Diagn�stico " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la       " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le        " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida)       " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 2 litros de agua al d�a para mantener las v�as respiratorias hidratadas    " +
                                                  "\n y reducir la viscosidad del moco. EJERCICIO: La actividad f�sica debe ser controlada y adaptada a la condici�n del paciente,     " +
                                                  "\n evitando desencadenantes como el aire fr�o o la contaminaci�n. Se recomienda ejercicios de respiraci�n profunda y caminatas      " +
                                                  "\n suaves de 30 minutos al d�a. POSIBLE TRATAMIENTO: El tratamiento para el asma en adultos suele incluir broncodilatadores de      " +
                                                  "\n alivio r�pido, como el salbutamol (Ventolin, Aerolin), y corticosteroides inhalados, como la fluticasona (Flixotide, Pulmicort), " +
                                                  "\n para el control a largo plazo. En algunos casos, se pueden utilizar modificadores de leucotrienos como el montelukast (Singulair)." +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antiinflamatorias y antioxidantes, como pescado graso, que   " +
                                                  "\n aporta �cidos grasos Omega-3, beneficiosos para la salud pulmonar; zanahorias, con 334% de la ingesta diaria recomendada de      " +
                                                  "\n vitamina A por cada 100 gramos, esencial para la funci�n pulmonar; c�rcuma, con curcumina, que posee propiedades antiinflamatorias;" +
                                                  "\n y kiwi, con 92 mg de vitamina C por cada 100 gramos, lo que equivale al 153% de la ingesta diaria recomendada y fortalece el     " +
                                                  "\n sistema inmunol�gico. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un      " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la      " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu      " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA. " +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 3 litros de agua al d�a para mantener una adecuada hidrataci�n y apoyar      " +
                                                  "\n la funci�n renal, especialmente en pacientes que toman medicamentos antirretrovirales. EJERCICIO: Se sugiere realizar actividad  " +
                                                  "\n f�sica moderada, como caminatas de 30 a 45 minutos al d�a y ejercicios de resistencia, lo que contribuye a fortalecer el sistema " +
                                                  "\n inmunol�gico y mejorar la calidad de vida. POSIBLE TRATAMIENTO: El tratamiento para el VIH/SIDA consiste en la terapia           " +
                                                  "\n antirretroviral (TAR), que incluye combinaciones de medicamentos como el tenofovir (Viread), emtricitabina (Emtriva),            " +
                                                  "\n dolutegravir (Tivicay) y efavirenz (Sustiva), los cuales ayudan a reducir la carga viral y mejorar la funci�n inmunol�gica.      " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema    " +
                                                  "\n inmunol�gico, como aguacate, que aporta grasas saludables y vitamina E, clave para la protecci�n celular; frutos rojos, ricos    " +
                                                  "\n en antioxidantes y vitamina C, que ayudan a reducir el estr�s oxidativo; espinacas, con alto contenido de hierro y magnesio,     " +
                                                  "\n esenciales para la producci�n de energ�a; y almendras, que contienen vitamina E y �cidos grasos saludables, beneficiosos para    " +
                                                  "\n la salud celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente     " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un      " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la      " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu      " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua al d�a para ayudar a eliminar toxinas    " +
                                                  "\n y mantener una adecuada funci�n renal. EJERCICIO: Se sugiere actividad f�sica moderada, como caminatas de 30 a 45 minutos al    " +
                                                  "\n d�a, evitando esfuerzos excesivos mientras persistan los s�ntomas. POSIBLE TRATAMIENTO: El tratamiento para la gonorrea en      " +
                                                  "\n adultos suele incluir antibi�ticos como la ceftriaxona (Rocephin, Cefaxone) y la azitromicina (Zithromax, Azitrocin), los       " +
                                                  "\n cuales ayudan a eliminar la bacteria responsable de la infecci�n. Es fundamental completar el tratamiento indicado por el       " +
                                                  "\n m�dico para evitar resistencia bacteriana. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y         " +
                                                  "\n nutrientes esenciales para fortalecer el sistema inmunol�gico, como ajo, que posee propiedades antimicrobianas naturales;       " +
                                                  "\n espinacas, ricas en hierro y vitamina C, esenciales para la recuperaci�n; jengibre, con efectos antiinflamatorios y             " +
                                                  "\n antibacterianos; y c�tricos como naranjas y limones, que aportan vitamina C y ayudan a reforzar las defensas del organismo.     " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida   " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico  " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y   " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 3 litros de agua al d�a para mantener una adecuada hidrataci�n y ayudar   " +
                                                  "\n a reducir la inflamaci�n. EJERCICIO: Se sugiere actividad f�sica moderada, evitando el sobreesfuerzo y el estr�s, ya que estos" +
                                                  "\n pueden desencadenar brotes recurrentes. POSIBLE TRATAMIENTO: El tratamiento para el herpes genital en adultos suele incluir   " +
                                                  "\n antivirales como el aciclovir (Zovirax, Acivir), el valaciclovir (Valtrex, Valacivir) y el famciclovir (Famvir), los cuales   " +
                                                  "\n ayudan a reducir la duraci�n y gravedad de los brotes. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en lisina,   " +
                                                  "\n un amino�cido que puede ayudar a reducir la frecuencia de los brotes, como yogur, que aporta prote�nas y probi�ticos          " +
                                                  "\n beneficiosos; pescado, rico en �cidos grasos Omega-3 con propiedades antiinflamatorias; frutos secos como almendras,          " +
                                                  "\n que contienen vitamina E y antioxidantes; y vegetales de hoja verde, que aportan vitaminas esenciales para la regeneraci�n    " +
                                                  "\n celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente           " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s         " +
                                                  "\n de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su         " +
                                                  "\n salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L          " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua al d�a para mantener una adecuada hidrataci�n y   " +
                                                  "\n apoyar la eliminaci�n de toxinas. EJERCICIO: Se sugiere actividad f�sica moderada, como caminatas de 30 a 45 minutos al  " +
                                                  "\n d�a, evitando esfuerzos excesivos mientras persistan los s�ntomas. POSIBLE TRATAMIENTO: El tratamiento para la s�filis   " +
                                                  "\n en adultos suele incluir antibi�ticos como la penicilina G benzatina (Benzetacil) y la doxiciclina (Doxilin, Vibramycin)," +
                                                  "\n los cuales ayudan a eliminar la bacteria Treponema pallidum. Es fundamental seguir el tratamiento indicado por el m�dico " +
                                                  "\n para evitar complicaciones. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes      " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico, como zanahorias, que contienen aproximadamente 334% de la ingesta    " +
                                                  "\n diaria recomendada de vitamina A por cada 100 gramos, esencial para la salud celular; espinacas, ricas en hierro y       " +
                                                  "\n antioxidantes que favorecen la oxigenaci�n celular; frutos rojos, con alto contenido de vitamina C y flavonoides que     " +
                                                  "\n ayudan a reducir la inflamaci�n; y c�rcuma, con curcumina, que posee propiedades antimicrobianas y antiinflamatorias.    " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa     " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un        " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud    " +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes    " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua al d�a para mantener una adecuada  " +
                                                  "\n hidrataci�n y ayudar a fluidificar las secreciones pulmonares, facilitando la respiraci�n. EJERCICIO: La actividad f�sica " +
                                                  "\n debe ser moderada y adaptada a la condici�n del paciente, evitando esfuerzos excesivos. Se recomienda caminatas suaves de " +
                                                  "\n 20 a 30 minutos al d�a, siempre que no haya dificultad respiratoria, y ejercicios de respiraci�n profunda para mejorar la " +
                                                  "\n oxigenaci�n. POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis en adultos suele incluir antibi�ticos como la       " +
                                                  "\n isoniazida (Nydrazid, Laniazid), rifampicina (Rifadin, Rimactane) y etambutol (Myambutol), los cuales ayudan a eliminar   " +
                                                  "\n la bacteria Mycobacterium tuberculosis. Es fundamental seguir el tratamiento indicado por el m�dico para evitar           " +
                                                  "\n resistencia bacteriana. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes           " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico y reducir la inflamaci�n pulmonar. Algunos ejemplos incluyen           " +
                                                  "\n zanahorias, que contienen aproximadamente 334% de la ingesta diaria recomendada de vitamina A por cada 100 gramos,        " +
                                                  "\n esencial para la salud pulmonar; naranjas, con 53 mg de vitamina C por cada 100 gramos, lo que representa cerca del       " +
                                                  "\n 88% de la ingesta diaria recomendada; espinacas, ricas en hierro y antioxidantes que favorecen la oxigenaci�n celular;    " +
                                                  "\n y almendras, que aportan vitamina E, clave para la protecci�n de las c�lulas pulmonares. Este es solo un Diagn�stico      " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la     " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para          " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del             " +
                                                  "\n Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu             " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2 a 2.5 litros de agua al d�a para mantener una adecuada  " +
                                                  "\n hidrataci�n y ayudar a reducir la inflamaci�n en las articulaciones. EJERCICIO: La actividad f�sica debe ser moderada     " +
                                                  "\n y adaptada a la condici�n del paciente, evitando movimientos bruscos. Se recomienda ejercicios de bajo impacto como       " +
                                                  "\n nataci�n, yoga o caminatas suaves de 30 minutos al d�a. POSIBLE TRATAMIENTO: El tratamiento para la artritis en adultos   " +
                                                  "\n suele incluir antiinflamatorios no esteroides como el ibuprofeno (Advil, Motrin) y el naproxeno (Aleve), as� como f�rmacos" +
                                                  "\n antirreum�ticos modificadores de la enfermedad como el metotrexato (Rheumatrex, Trexall). ALIMENTACI�N: Se recomienda el  " +
                                                  "\n consumo de alimentos con propiedades antiinflamatorias y antioxidantes, como pescado graso, que aporta �cidos grasos      " +
                                                  "\n Omega-3, beneficiosos para la salud articular; c�rcuma, con curcumina, que posee propiedades antiinflamatorias; frutos    " +
                                                  "\n secos como almendras, que contienen vitamina E y antioxidantes; y vegetales de hoja verde, que aportan vitaminas esenciales" +
                                                  "\n para la regeneraci�n celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%  " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda" +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s  " +
                                                  "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico,       " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 3 litros de agua al d�a para mantener una adecuada hidrataci�n    " +
                                                  "\n y ayudar a reducir la inflamaci�n en las v�as respiratorias. EJERCICIO: La actividad f�sica debe ser moderada y       " +
                                                  "\n adaptada a la condici�n del paciente, evitando esfuerzos excesivos. Se recomienda ejercicios de respiraci�n profunda  " +
                                                  "\n y caminatas suaves de 20 a 30 minutos al d�a. POSIBLE TRATAMIENTO: El tratamiento para la tosferina en adultos suele  " +
                                                  "\n incluir antibi�ticos como la azitromicina (Zithromax), claritromicina (Biaxin) y eritromicina (Erythrocin), los cuales" +
                                                  "\n ayudan a eliminar la bacteria Bordetella pertussis. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en      " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico y reducir la inflamaci�n pulmonar.      " +
                                                  "\n Algunos ejemplos incluyen zanahorias, que contienen aproximadamente 334% de la ingesta diaria recomendada de vitamina A" +
                                                  "\n por cada 100 gramos, esencial para la salud pulmonar; naranjas, con 53 mg de vitamina C por cada 100 gramos, lo que   " +
                                                  "\n representa cerca del 88% de la ingesta diaria recomendada; espinacas, ricas en hierro y antioxidantes que favorecen   " +
                                                  "\n la oxigenaci�n celular; y almendras, que aportan vitamina E, clave para la protecci�n de las c�lulas pulmonares.      " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa  " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un     " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud " +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos de   " +
                                                  "\n tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la fiebre y la inflamaci�n. Adem�s, se pueden " +
                                                  "\n incluir caldos claros y bebidas con electrolitos para evitar la deshidrataci�n causada por la fiebre. EJERCICIO: Se     " +
                                                  "\n sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. En caso de fiebre,     " +
                                                  "\n se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: No existe   " +
                                                  "\n un tratamiento espec�fico para las paperas, pero se pueden aliviar los s�ntomas con analg�sicos y antipir�ticos como    " +
                                                  "\n el paracetamol (Tempra, Panadol) y el ibuprofeno (Advil, Motrin). Tambi�n se recomienda el uso de compresas fr�as en    " +  
                                                  "\n la zona inflamada para reducir el dolor. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y   " +
                                                  "\n nutrientes esenciales para fortalecer el sistema inmunol�gico, como naranjas, que contienen aproximadamente 53 mg de    " +
                                                  "\n vitamina C por cada 100 gramos, lo que representa cerca del 88% de la ingesta diaria recomendada; fresas, con 59 mg de  " +
                                                  "\n vitamina C por cada 100 gramos, cubriendo el 98% de la ingesta diaria recomendada; espinacas, ricas en hierro y         " +
                                                  "\n antioxidantes que favorecen la recuperaci�n; y almendras, que aportan vitamina E, clave para la protecci�n celular.     " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa    " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un       " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud   " +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos de tama�o regular) para    " +
                                                  "\n prevenir la deshidrataci�n causada por la fiebre y ayudar a aliviar los s�ntomas. Tambi�n se pueden incluir infusiones de     " +
                                                  "\n hierbas con propiedades antiinflamatorias y caldos claros para mantener el equilibrio de electrolitos. EJERCICIO: Se sugiere  " +
                                                  "\n actividad f�sica moderada, evitando el sobreesfuerzo y el estr�s, ya que estos pueden agravar los s�ntomas. En caso de fiebre," +
                                                  "\n se recomienda reposo y ejercicios de estiramiento suaves para evitar la fatiga muscular. POSIBLE TRATAMIENTO: No existen      " +
                                                  "\n medicamentos espec�ficos para tratar el zika, pero se pueden aliviar los s�ntomas con reposo, hidrataci�n y analg�sicos       " +
                                                  "\n como el acetaminof�n (Tylenol) para reducir la fiebre y el dolor. Se recomienda evitar el uso de aspirina y otros        " +
                                                  "\n antiinflamatorios no esteroides hasta descartar la posibilidad de dengue. ALIMENTACI�N: Se recomienda el consumo de      " +
                                                  "\n alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, como frutos rojos,     " +
                                                  "\n ricos en antioxidantes y vitamina C, que ayudan a reducir el estr�s oxidativo; espinacas, con alto contenido de hierro   " +
                                                  "\n y magnesio, esenciales para la producci�n de energ�a; aguacate, que aporta grasas saludables y vitamina E, clave para    " +
                                                  "\n la protecci�n celular; y almendras, que contienen vitamina E y �cidos grasos saludables, beneficiosos para la salud      " +
                                                  "\n celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente      " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s    " +
                                                  "\n de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su    " +
                                                  "\n salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L     " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 3 a 3.5 litros de agua al d�a (entre 12 y 14 vasos de tama�o regular)    " +
                                                  "\n para prevenir la deshidrataci�n causada por la diarrea y la fiebre. Tambi�n se recomienda el consumo de soluciones de    " +
                                                  "\n rehidrataci�n oral como Pedialyte o Enfalyte para reponer los minerales perdidos. EJERCICIO: Se sugiere actividad f�sica " +
                                                  "\n moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. En caso de fiebre y diarrea, se recomienda reposo" +
                                                  "\n y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico" +
                                                  "\n para la infecci�n por rotavirus, pero se recomienda el consumo de l�quidos de rehidrataci�n oral y en casos graves, la    " +
                                                  "\n administraci�n de l�quidos intravenosos. ALIMENTACI�N: Se recomienda el consumo de alimentos blandos y f�ciles de digerir," +
                                                  "\n como pl�tanos, que contienen potasio, �til para mantener el equilibrio de electrolitos; arroz, que ayuda a reducir la     " +
                                                  "\n diarrea; zanahorias, con 334% de la ingesta diaria recomendada de vitamina A por cada 100 gramos, esencial para la salud  " +
                                                  "\n intestinal; y yogur, que aporta probi�ticos beneficiosos para la recuperaci�n. Este es solo un Diagn�stico predeterminado " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus   " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad" +
                                                  "\n en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se" +
                                                  "\n le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua al d�a (entre 10 y 12 " +
                                                  "\n vasos de tama�o regular) para mantener una adecuada hidrataci�n y ayudar al cuerpo a combatir la infecci�n.  " +
                                                  "\n En casos de fiebre, se recomienda aumentar la ingesta de l�quidos y consumir caldos claros para evitar la    " +
                                                  "\n deshidrataci�n. EJERCICIO: Se sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras       " +
                                                  "\n persistan los s�ntomas. En casos graves, se recomienda reposo y ejercicios de respiraci�n profunda para      " +
                                                  "\n mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: El tratamiento para la listeriosis en adultos suele incluir     " +
                                                  "\n antibi�ticos como la ampicilina (Ampicilina, Principen) y la gentamicina (Garamycin), los cuales ayudan a    " +
                                                  "\n eliminar la bacteria Listeria monocytogenes. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en    " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, como ajo, que posee propiedades" +
                                                  "\n antimicrobianas naturales; espinacas, ricas en hierro y vitamina C, esenciales para la recuperaci�n; jengibre," +
                                                  "\n con efectos antiinflamatorios y antibacterianos; y c�tricos como naranjas y limones, que aportan vitamina C y " +
                                                  "\n ayudan a reforzar las defensas del organismo. Este es solo un Diagn�stico predeterminado l�gico, haberlo      " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus       " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer    " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico" +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a    " +
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos de tama�o  " +
                                                  "\n regular) para prevenir la deshidrataci�n causada por la diarrea y la fiebre. Tambi�n se recomienda el consumo " +
                                                  "\n de soluciones de rehidrataci�n oral para reponer los minerales perdidos. EJERCICIO: Se sugiere actividad f�sica" +
                                                  "\n moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. En caso de fiebre y diarrea, se       " +
                                                  "\n recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: El   " +
                                                  "\n tratamiento para la shigelosis en adultos suele incluir antibi�ticos como la ciprofloxacina (Cipro), la       " +
                                                  "\n azitromicina (Zithromax) y la ceftriaxona (Rocephin), los cuales ayudan a eliminar la bacteria Shigella.      " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos blandos y f�ciles de digerir, como pl�tanos, que          " +
                                                  "\n contienen potasio, �til para mantener el equilibrio de electrolitos; arroz, que ayuda a reducir la diarrea;   " +
                                                  "\n zanahorias, con 334% de la ingesta diaria recomendada de vitamina A por cada 100 gramos, esencial para la     " +
                                                  "\n salud intestinal; y yogur, que aporta probi�ticos beneficiosos para la recuperaci�n. Este es solo un          " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa          " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer       " +
                                                  "\n m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente,   " +
                                                  "\n adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho           " +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos de tama�o    " +
                                                  "\n regular) para mantener una adecuada hidrataci�n y ayudar a fluidificar las secreciones pulmonares, facilitando  " +
                                                  "\n la respiraci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente,        " +
                                                  "\n evitando esfuerzos excesivos. Se recomienda caminatas suaves de 20 a 30 minutos al d�a, siempre que no haya     " +
                                                  "\n dificultad respiratoria, y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: " +
                                                  "\n El tratamiento para la EPOC en adultos suele incluir broncodilatadores como el salbutamol (Ventolin, Aerolin)   " +
                                                  "\n y corticosteroides inhalados como la fluticasona (Flixotide, Pulmicort), los cuales ayudan a reducir la         " +
                                                  "\n inflamaci�n y mejorar la funci�n pulmonar. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en         " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico y reducir la inflamaci�n pulmonar." +
                                                  "\n Algunos ejemplos incluyen zanahorias, que contienen aproximadamente 334% de la ingesta diaria recomendada de    " +
                                                  "\n vitamina A por cada 100 gramos, esencial para la salud pulmonar; naranjas, con 53 mg de vitamina C por cada     " +
                                                  "\n 100 gramos, lo que representa cerca del 88% de la ingesta diaria recomendada; espinacas, ricas en hierro y      " +
                                                  "\n antioxidantes que favorecen la oxigenaci�n celular; y almendras, que aportan vitamina E, clave para la protecci�n" +
                                                  "\n de las c�lulas pulmonares. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al" +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para   " +
                                                  "\n ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento     " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le     " +
                                                  "\n recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar al cuerpo a eliminar la infecci�n. Adem�s, se   " +
                                                  "\n pueden incluir infusiones de hierbas con propiedades antimicrobianas y caldos claros para reforzar la hidrataci�n. " +
                                                  "\n EJERCICIO: Se sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas.     " +
                                                  "\n Se recomienda caminatas suaves de 30 minutos al d�a y ejercicios de movilidad para mejorar la circulaci�n y el     " +
                                                  "\n bienestar general. POSIBLE TRATAMIENTO: El tratamiento para la clamidia en adultos suele incluir antibi�ticos      " +
                                                  "\n como la azitromicina (Zithromax, Azitrocin) y la doxiciclina (Doxilin, Vibramycin), los cuales ayudan a eliminar   " +
                                                  "\n la bacteria Chlamydia trachomatis. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y    " +
                                                  "\n nutrientes esenciales para fortalecer el sistema inmunol�gico, como ajo, que posee propiedades antimicrobianas     " +
                                                  "\n naturales; espinacas, ricas en hierro y vitamina C, esenciales para la recuperaci�n; jengibre, con efectos         " +
                                                  "\n antiinflamatorios y antibacterianos; y c�tricos como naranjas y limones, que aportan vitamina C y ayudan a         " +
                                                  "\n reforzar las defensas del organismo. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado         " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n      " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en       " +
                                                  "\n el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface        " +
                                                  "\n del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida)        " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos de tama�o   " +
                                                  "\n regular) para mantener una adecuada hidrataci�n y ayudar a reducir la fiebre y la inflamaci�n. Tambi�n se      " +
                                                  "\n recomienda el consumo de caldos claros y bebidas con electrolitos para evitar la deshidrataci�n. EJERCICIO:    " +
                                                  "\n Se sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. En caso    " +
                                                  "\n de fiebre, se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n.              " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la meningitis bacteriana en adultos suele incluir antibi�ticos como   " +
                                                  "\n la ceftriaxona (Rocephin) y la ampicilina (Principen), los cuales ayudan a eliminar la infecci�n.              " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para        " +
                                                  "\n fortalecer el sistema inmunol�gico, como frutos rojos, ricos en antioxidantes y vitamina C, que ayudan a reducir   " +
                                                  "\n el estr�s oxidativo; espinacas, con alto contenido de hierro y magnesio, esenciales para la producci�n de energ�a; " +
                                                  "\n aguacate, que aporta grasas saludables y vitamina E, clave para la protecci�n celular; y almendras, que contienen  " +
                                                  "\n vitamina E y �cidos grasos saludables, beneficiosos para la salud celular. Este es solo un Diagn�stico             " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que          " +
                                                  "\n por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico       " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si       " +
                                                  "\n la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L        " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos de tama�o     " +
                                                  "\n regular) para mantener una adecuada hidrataci�n y ayudar al cuerpo a eliminar toxinas. Tambi�n se recomienda     " +
                                                  "\n el consumo de infusiones antioxidantes y caldos ricos en minerales para reforzar la hidrataci�n. EJERCICIO:      " +
                                                  "\n Se sugiere actividad f�sica moderada, adaptada a la condici�n del paciente, como caminatas suaves de 30 minutos  " +
                                                  "\n al d�a y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: El tratamiento     " +
                                                  "\n para el c�ncer en adultos depende del tipo y estadio de la enfermedad, pero puede incluir cirug�a, quimioterapia " +
                                                  "\n con medicamentos como el paclitaxel (Taxol) y el cisplatino (Platinol), radioterapia y terapias dirigidas.       " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer" +
                                                  "\n el sistema inmunol�gico y reducir la inflamaci�n celular. Algunos ejemplos incluyen zanahorias, que contienen     " +
                                                  "\n aproximadamente 334% de la ingesta diaria recomendada de vitamina A por cada 100 gramos, esencial para la salud   " +
                                                  "\n celular; naranjas, con 53 mg de vitamina C por cada 100 gramos, lo que representa cerca del 88% de la ingesta     " +
                                                  "\n diaria recomendada; espinacas, ricas en hierro y antioxidantes que favorecen la oxigenaci�n celular; y almendras, " +
                                                  "\n que aportan vitamina E, clave para la protecci�n de las c�lulas. Este es solo un Diagn�stico predeterminado l�gico," +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus    " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor   " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le     " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app        " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            
                        }
                        if(EstaturaMasculino.equals("1.45-1.70 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de " +
                                                  "\n aproximadamente 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos de tama�o regular) para mantener una adecuada  " +
                                                  "\n hidrataci�n y ayudar a reducir la fiebre y la inflamaci�n. Tambi�n se recomienda el consumo de caldos claros y    " +
                                                  "\n bebidas con electrolitos para evitar la deshidrataci�n. EJERCICIO: Se sugiere actividad f�sica moderada, evitando " +
                                                  "\n esfuerzos excesivos mientras persistan los s�ntomas. En caso de fiebre, se recomienda reposo y ejercicios de      " +
                                                  "\n respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: El tratamiento para la influenza en adultos" +
                                                  "\n suele incluir antivirales como el oseltamivir (Tamiflu), baloxavir (Xofluza) y zanamivir (Relenza), los cuales    " +
                                                  "\n pueden ayudar a reducir la duraci�n y gravedad de la enfermedad. Tambi�n se recomienda el uso de analg�sicos y    " +
                                                  "\n antipir�ticos como el paracetamol (Tempra) o el ibuprofeno (Advil) para aliviar fiebre y malestar general.        " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de frutas y verduras ricas en vitaminas y antioxidantes para fortalecer el " +
                                                  "\n sistema inmunol�gico, tales como naranjas, que contienen aproximadamente 53 mg de vitamina C por cada 100 gramos, " +
                                                  "\n lo que representa cerca del 88% de la ingesta diaria recomendada; fresas, con 59 mg de vitamina C por cada 100    " +
                                                  "\n gramos, cubriendo el 98% de la ingesta diaria recomendada; pl�tanos, ricos en potasio, �til para mantener el      " +
                                                  "\n equilibrio de electrolitos; y kiwi, con 92 mg de vitamina C por cada 100 gramos, lo que equivale al 153% de la    " +
                                                  "\n ingesta diaria recomendada. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza    " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para  " +
                                                  "\n ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento       " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le       " +
                                                  "\n recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua al d�a (entre 10         " +
                                                  "\n y 12 vasos de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a fluidificar las secreciones     " +
                                                  "\n pulmonares, facilitando la respiraci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la        " +
                                                  "\n condici�n del paciente, evitando esfuerzos excesivos. Se recomienda caminatas suaves de 20 a 30 minutos al      " +
                                                  "\n d�a, siempre que no haya dificultad respiratoria, y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n." +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la neumon�a en adultos suele incluir antibi�ticos como la amoxicilina, " +
                                                  "\n azitromicina y ceftriaxona, los cuales ayudan a eliminar la infecci�n. En neumon�as virales, el tratamiento se  " +
                                                  "\n centra en el alivio de s�ntomas con antipir�ticos como el paracetamol (Tempra) y antiinflamatorios como el      " +
                                                  "\n ibuprofeno (Advil). ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en vitaminas y antioxidantes      " +
                                                  "\n para fortalecer el sistema inmunol�gico y reducir la inflamaci�n pulmonar. Algunos ejemplos incluyen zanahorias," +
                                                  "\n que contienen aproximadamente 334% de la ingesta diaria recomendada de vitamina A por cada 100 gramos, esencial " +
                                                  "\n para la salud pulmonar; naranjas, con 53 mg de vitamina C por cada 100 gramos, lo que representa cerca del 88%  " +
                                                  "\n de la ingesta diaria recomendada; espinacas, ricas en hierro y antioxidantes que favorecen la oxigenaci�n celular;" +
                                                  "\n y almendras, que aportan vitamina E, clave para la protecci�n de las c�lulas pulmonares. Este es solo un         " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad  " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico" +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la   " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua al d�a (entre 10  " +
                                                  "\n y 12 vasos de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a regular los niveles de   " +
                                                  "\n glucosa en sangre. EJERCICIO: Se sugiere realizar actividad f�sica moderada, como caminatas de 30 a 45   " +
                                                  "\n minutos al d�a, ejercicios de resistencia y entrenamiento aer�bico, lo que contribuye a mejorar la       " +
                                                  "\n sensibilidad a la insulina y el control de la glucosa. POSIBLE TRATAMIENTO: El tratamiento para la       " +
                                                  "\n diabetes tipo 2 suele incluir medicamentos como la metformina (Glucophage, Dianben), que ayuda a         " +
                                                  "\n reducir la producci�n de glucosa en el h�gado, y en algunos casos, insulina para el control de niveles   " +
                                                  "\n elevados. Tambi�n se recomienda el monitoreo constante de la glucosa en sangre y ajustes en la dieta.    " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en fibra y bajos en carbohidratos refinados,   " +
                                                  "\n como avena, que aporta aproximadamente 4 gramos de fibra por cada 100 gramos, ayudando a estabilizar     " +
                                                  "\n los niveles de glucosa; almendras, que contienen grasas saludables y vitamina E, beneficiosas para la    " +
                                                  "\n salud cardiovascular; espinacas, ricas en magnesio, esencial para la regulaci�n de la glucosa; y fresas, " +
                                                  "\n con 59 mg de vitamina C por cada 100 gramos, lo que representa cerca del 98% de la ingesta diaria        " +
                                                  "\n recomendada y contribuye a la protecci�n celular. Este es solo un Diagn�stico predeterminado l�gico,     " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad" +
                                                  "\n y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para    " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta" +
                                                  "\n del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes    " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos de  " +
                                                  "\n tama�o regular) para mantener las v�as respiratorias hidratadas y reducir la viscosidad del moco, facilitando la       " +
                                                  "\n respiraci�n. Tambi�n se pueden incluir infusiones de hierbas con propiedades antiinflamatorias y caldos claros para    " +
                                                  "\n reforzar la hidrataci�n. EJERCICIO: La actividad f�sica debe ser controlada y adaptada a la condici�n del paciente,    " +
                                                  "\n evitando desencadenantes como el aire fr�o o la contaminaci�n. Se recomienda ejercicios de respiraci�n profunda y      " +
                                                  "\n caminatas suaves de 30 minutos al d�a. POSIBLE TRATAMIENTO: El tratamiento para el asma en adultos suele incluir       " +
                                                  "\n broncodilatadores de alivio r�pido, como el salbutamol (Ventolin, Aerolin), y corticosteroides inhalados, como la      " +
                                                  "\n fluticasona (Flixotide, Pulmicort), para el control a largo plazo. En algunos casos, se pueden utilizar modificadores  " +
                                                  "\n de leucotrienos como el montelukast (Singulair). ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades   " +
                                                  "\n antiinflamatorias y antioxidantes, como pescado graso, que aporta �cidos grasos Omega-3, beneficiosos para la salud    " +
                                                  "\n pulmonar; zanahorias, con 334% de la ingesta diaria recomendada de vitamina A por cada 100 gramos, esencial para la    " +
                                                  "\n funci�n pulmonar; c�rcuma, con curcumina, que posee propiedades antiinflamatorias; y kiwi, con 92 mg de vitamina C     " +
                                                  "\n por cada 100 gramos, lo que equivale al 153% de la ingesta diaria recomendada y fortalece el sistema inmunol�gico.     " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa   " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un      " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud  " +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos de tama�o regular)  " +
                                                  "\n para mantener una adecuada hidrataci�n y apoyar la funci�n renal, especialmente en pacientes que toman medicamentos    " +
                                                  "\n antirretrovirales. EJERCICIO: Se sugiere realizar actividad f�sica moderada, como caminatas de 30 a 45 minutos al d�a  " +
                                                  "\n y ejercicios de resistencia, lo que contribuye a fortalecer el sistema inmunol�gico y mejorar la calidad de vida.      " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para el VIH/SIDA consiste en la terapia antirretroviral (TAR), que incluye         " +
                                                  "\n combinaciones de medicamentos como el tenofovir (Viread), emtricitabina (Emtriva), dolutegravir (Tivicay) y efavirenz  " +
                                                  "\n (Sustiva), los cuales ayudan a reducir la carga viral y mejorar la funci�n inmunol�gica. ALIMENTACI�N: Se recomienda   " +
                                                  "\n el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, como   " +
                                                  "\n aguacate, que aporta grasas saludables y vitamina E, clave para la protecci�n celular; frutos rojos, ricos en          " +
                                                  "\n antioxidantes y vitamina C, que ayudan a reducir el estr�s oxidativo; espinacas, con alto contenido de hierro y        " +
                                                  "\n magnesio, esenciales para la producci�n de energ�a; y almendras, que contienen vitamina E y �cidos grasos saludables,  " +
                                                  "\n beneficiosos para la salud celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello  " +
                                                  "\n se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su  " +
                                                  "\n paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar" +
                                                  "\n a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos    " +
                                                  "\n de tama�o regular) para ayudar a eliminar toxinas y mantener una adecuada funci�n renal. EJERCICIO: Se sugiere        " +
                                                  "\n actividad f�sica moderada, como caminatas de 30 a 45 minutos al d�a, evitando esfuerzos excesivos mientras persistan  " +
                                                  "\n los s�ntomas. POSIBLE TRATAMIENTO: El tratamiento para la gonorrea en adultos suele incluir antibi�ticos como la      " +
                                                  "\n ceftriaxona (Rocephin, Cefaxone) y la azitromicina (Zithromax, Azitrocin), los cuales ayudan a eliminar la bacteria   " +
                                                  "\n responsable de la infecci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes  " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico, como ajo, que posee propiedades antimicrobianas naturales;        " +
                                                  "\n espinacas, ricas en hierro y vitamina C, esenciales para la recuperaci�n; jengibre, con efectos antiinflamatorios     " +
                                                  "\n y antibacterianos; y c�tricos como naranjas y limones, que aportan vitamina C y ayudan a reforzar las defensas del    " +
                                                  "\n organismo. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s " +
                                                  "\n de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su " +
                                                  "\n salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L  " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos  " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la inflamaci�n. Tambi�n se pueden      " +
                                                  "\n incluir infusiones de hierbas con propiedades antivirales y caldos claros para reforzar la hidrataci�n.             " +
                                                  "\n EJERCICIO: Se sugiere actividad f�sica moderada, evitando el sobreesfuerzo y el estr�s, ya que estos pueden         " +
                                                  "\n desencadenar brotes recurrentes. Se recomienda ejercicios de relajaci�n y caminatas suaves de 30 minutos al d�a.    " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para el herpes genital en adultos suele incluir antivirales como el aciclovir   " +
                                                  "\n (Zovirax, Acivir), el valaciclovir (Valtrex, Valacivir) y el famciclovir (Famvir), los cuales ayudan a reducir la   " +
                                                  "\n duraci�n y gravedad de los brotes. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en lisina, un          " +
                                                  "\n amino�cido que puede ayudar a reducir la frecuencia de los brotes, como yogur, que aporta prote�nas y probi�ticos   " +
                                                  "\n beneficiosos; pescado, rico en �cidos grasos Omega-3 con propiedades antiinflamatorias; frutos secos como almendras," +
                                                  "\n que contienen vitamina E y antioxidantes; y vegetales de hoja verde, que aportan vitaminas esenciales para la       " +
                                                  "\n regeneraci�n celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%    " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se    " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su  " +
                                                  "\n paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar" +
                                                  "\n a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos de tama�o  " +
                                                  "\n regular) para mantener una adecuada hidrataci�n y ayudar a reducir la fiebre y la inflamaci�n. Tambi�n se     " +
                                                  "\n recomienda el consumo de caldos claros y bebidas con electrolitos para evitar la deshidrataci�n. EJERCICIO:   " +
                                                  "\n Se sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. En caso   " +
                                                  "\n de fiebre, se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n.             " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la s�filis en adultos suele incluir antibi�ticos como la penicilina G" +
                                                  "\n benzatina (Benzetacil), la ceftriaxona y la doxiciclina, los cuales ayudan a eliminar la bacteria Treponema   " +
                                                  "\n pallidum. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales  " +
                                                  "\n para fortalecer el sistema inmunol�gico, como frutos rojos, ricos en antioxidantes y vitamina C, que ayudan   " +
                                                  "\n a reducir el estr�s oxidativo; espinacas, con alto contenido de hierro y magnesio, esenciales para la         " +
                                                  "\n producci�n de energ�a; aguacate, que aporta grasas saludables y vitamina E, clave para la protecci�n celular; " +
                                                  "\n y almendras, que contienen vitamina E y �cidos grasos saludables, beneficiosos para la salud celular. Este es " +
                                                  "\n solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa  " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s   " +
                                                  "\n de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s" +
                                                  "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su   " +
                                                  "\n m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua al d�a (entre 10 y       " +
                                                  "\n 12 vasos de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a fluidificar las secreciones       " +
                                                  "\n pulmonares, facilitando la respiraci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la        " +
                                                  "\n condici�n del paciente, evitando esfuerzos excesivos. Se recomienda caminatas suaves de 20 a 30 minutos         " +
                                                  "\n al d�a, siempre que no haya dificultad respiratoria, y ejercicios de respiraci�n profunda para mejorar          " +
                                                  "\n la oxigenaci�n. POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis en adultos suele incluir antibi�ticos  " +
                                                  "\n como la isoniazida, rifampicina y etambutol, los cuales ayudan a eliminar la bacteria Mycobacterium tuberculosis." +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer" +
                                                  "\n el sistema inmunol�gico y reducir la inflamaci�n pulmonar. Algunos ejemplos incluyen zanahorias, que contienen    " +
                                                  "\n aproximadamente 334% de la ingesta diaria recomendada de vitamina A por cada 100 gramos, esencial para la salud   " +
                                                  "\n pulmonar; naranjas, con 53 mg de vitamina C por cada 100 gramos, lo que representa cerca del 88% de la ingesta    " +
                                                  "\n diaria recomendada; espinacas, ricas en hierro y antioxidantes que favorecen la oxigenaci�n celular; y almendras, " +
                                                  "\n que aportan vitamina E, clave para la protecci�n de las c�lulas pulmonares. Este es solo un Diagn�stico predeterminado" +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y   " +
                                                  "\n sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor  " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le        " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app           " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos    " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la inflamaci�n en las articulaciones.    " +
                                                  "\n Tambi�n se pueden incluir infusiones de hierbas con propiedades antiinflamatorias y caldos claros para reforzar la    " +
                                                  "\n hidrataci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente, evitando        " +
                                                  "\n movimientos bruscos. Se recomienda ejercicios de bajo impacto como nataci�n, yoga o caminatas suaves de 30 minutos    " +
                                                  "\n al d�a. POSIBLE TRATAMIENTO: El tratamiento para la artritis en adultos suele incluir antiinflamatorios no esteroides " +
                                                  "\n como el ibuprofeno (Advil, Motrin) y el naproxeno (Aleve), as� como f�rmacos antirreum�ticos modificadores de la      " +
                                                  "\n enfermedad como el metotrexato (Rheumatrex, Trexall). ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades" + 
                                                  "\n antiinflamatorias y antioxidantes, como pescado graso, que aporta �cidos grasos Omega-3, beneficiosos para la salud    " +
                                                  "\n articular; c�rcuma, con curcumina, que posee propiedades antiinflamatorias; frutos secos como almendras, que contienen " +
                                                  "\n vitamina E y antioxidantes; y vegetales de hoja verde, que aportan vitaminas esenciales para la regeneraci�n celular.  " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa   " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un      " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud  " +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos de tama�o   " +
                                                  "\n regular) para mantener una adecuada hidrataci�n y ayudar a reducir la inflamaci�n en las v�as respiratorias.   " +
                                                  "\n Tambi�n se recomienda el consumo de caldos claros y bebidas con electrolitos para evitar la deshidrataci�n.    " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente, evitando esfuerzos    " +
                                                  "\n excesivos. Se recomienda ejercicios de respiraci�n profunda y caminatas suaves de 20 a 30 minutos al d�a.      " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la tosferina en adultos suele incluir antibi�ticos como la azitromicina" +
                                                  "\n (Zithromax), claritromicina (Biaxin) y eritromicina (Erythrocin), los cuales ayudan a eliminar la bacteria     " +
                                                  "\n Bordetella pertussis. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes  " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico y reducir la inflamaci�n pulmonar. Algunos ejemplos incluyen" +
                                                  "\n zanahorias, que contienen aproximadamente 334% de la ingesta diaria recomendada de vitamina A por cada 100 gramos, " + 
                                                  "\n esencial para la salud pulmonar; naranjas, con 53 mg de vitamina C por cada 100 gramos, lo que representa cerca    " +
                                                  "\n del 88% de la ingesta diaria recomendada; espinacas, ricas en hierro y antioxidantes que favorecen la oxigenaci�n  " +
                                                  "\n celular; y almendras, que aportan vitamina E, clave para la protecci�n de las c�lulas pulmonares. Este es solo un  " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y  " +
                                                  "\n que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico   " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la    " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes    " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos  " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la fiebre y la inflamaci�n. Tambi�n    " +
                                                  "\n se recomienda el consumo de caldos claros y bebidas con electrolitos para evitar la deshidrataci�n. EJERCICIO: Se   " +
                                                  "\n sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. En caso de fiebre, " +
                                                  "\n se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: No existe " +
                                                  "\n un tratamiento espec�fico para las paperas, pero se pueden aliviar los s�ntomas con analg�sicos y antipir�ticos como  " +
                                                  "\n el paracetamol (Tempra, Panadol) y el ibuprofeno (Advil, Motrin). Tambi�n se recomienda el uso de compresas fr�as en  " +
                                                  "\n la zona inflamada para reducir el dolor. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y " +
                                                  "\n nutrientes esenciales para fortalecer el sistema inmunol�gico, como naranjas, que contienen aproximadamente 53 mg de  " +
                                                  "\n vitamina C por cada 100 gramos, lo que representa cerca del 88% de la ingesta diaria recomendada; fresas, con 59 mg   " +
                                                  "\n de vitamina C por cada 100 gramos, cubriendo el 98% de la ingesta diaria recomendada; espinacas, ricas en hierro y    " +
                                                  "\n antioxidantes que favorecen la recuperaci�n; y almendras, que aportan vitamina E, clave para la protecci�n celular.   " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa  " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un     " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud " +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos de    " +
                                                  "\n tama�o regular) para prevenir la deshidrataci�n causada por la fiebre y ayudar a aliviar los s�ntomas. Tambi�n se pueden " +
                                                  "\n incluir infusiones de hierbas con propiedades antiinflamatorias y caldos claros para mantener el equilibrio de           " +
                                                  "\n electrolitos. EJERCICIO: Se sugiere actividad f�sica moderada, evitando el sobreesfuerzo y el estr�s, ya que estos pueden" +
                                                  "\n agravar los s�ntomas. En caso de fiebre, se recomienda reposo y ejercicios de estiramiento suaves para evitar la fatiga  " +
                                                  "\n muscular. POSIBLE TRATAMIENTO: No existen medicamentos espec�ficos para tratar el zika, pero se pueden aliviar los s�ntomas  " +
                                                  "\n con reposo, hidrataci�n y analg�sicos como el acetaminof�n (Tylenol) para reducir la fiebre y el dolor. Se recomienda evitar " +
                                                  "\n el uso de aspirina y otros antiinflamatorios no esteroides hasta descartar la posibilidad de dengue. ALIMENTACI�N: Se        " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico,   " +
                                                  "\n como frutos rojos, ricos en antioxidantes y vitamina C, que ayudan a reducir el estr�s oxidativo; espinacas, con alto        " +
                                                  "\n contenido de hierro y magnesio, esenciales para la producci�n de energ�a; aguacate, que aporta grasas saludables y           " +
                                                  "\n vitamina E, clave para la protecci�n celular; y almendras, que contienen vitamina E y �cidos grasos saludables,              " +
                                                  "\n beneficiosos para la salud celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza       " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello        " +
                                                  "\n se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su        " +
                                                  "\n paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar      " +
                                                  "\n a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 3 a 3.5 litros de agua al d�a (entre 12 y 14 vasos de      " +
                                                  "\n tama�o regular) para prevenir la deshidrataci�n causada por la diarrea y la fiebre. Tambi�n se recomienda  " +
                                                  "\n el consumo de soluciones de rehidrataci�n oral como Pedialyte o Enfalyte para reponer los minerales        " +
                                                  "\n perdidos. EJERCICIO: Se sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan " +
                                                  "\n los s�ntomas. En caso de fiebre y diarrea, se recomienda reposo y ejercicios de respiraci�n profunda para  " +
                                                  "\n mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para la infecci�n por     " +
                                                  "\n rotavirus, pero se recomienda el consumo de l�quidos de rehidrataci�n oral y en casos graves, la administraci�n" +
                                                  "\n de l�quidos intravenosos. ALIMENTACI�N: Se recomienda el consumo de alimentos blandos y f�ciles de digerir,    " +
                                                  "\n como pl�tanos, que contienen potasio, �til para mantener el equilibrio de electrolitos; arroz, que ayuda a     " +
                                                  "\n reducir la diarrea; zanahorias, con 334% de la ingesta diaria recomendada de vitamina A por cada 100 gramos,   " +
                                                  "\n esencial para la salud intestinal; y yogur, que aporta probi�ticos beneficiosos para la recuperaci�n. Este     " +
                                                  "\n es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga    " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer    " +
                                                  "\n m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente,    " +
                                                  "\n adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar  " +
                                                  "\n a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos   " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar al cuerpo a combatir la infecci�n. En casos de    " +
                                                  "\n fiebre, se recomienda aumentar la ingesta de l�quidos y consumir caldos claros para evitar la deshidrataci�n.        " +
                                                  "\n EJERCICIO: Se sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas.       " +
                                                  "\n En casos graves, se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE      " +
                                                  "\n TRATAMIENTO: El tratamiento para la listeriosis en adultos suele incluir antibi�ticos como la ampicilina (Ampicilina," +
                                                  "\n Principen) y la gentamicina (Garamycin), los cuales ayudan a eliminar la bacteria Listeria monocytogenes.            " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el" +
                                                  "\n sistema inmunol�gico, como ajo, que posee propiedades antimicrobianas naturales; espinacas, ricas en hierro y        " +
                                                  "\n vitamina C, esenciales para la recuperaci�n; jengibre, con efectos antiinflamatorios y antibacterianos; y c�tricos   " +
                                                  "\n como naranjas y limones, que aportan vitamina C y ayudan a reforzar las defensas del organismo. Este es solo un      " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y    " +
                                                  "\n que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de  " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta" +
                                                  "\n del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu   " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 3 a 3.5 litros de agua al d�a (entre 12 y 14 vasos   " +
                                                  "\n de tama�o regular) para prevenir la deshidrataci�n causada por la diarrea y la fiebre. Tambi�n se recomienda el      " +
                                                  "\n consumo de soluciones de rehidrataci�n oral para reponer los minerales perdidos. EJERCICIO: Se sugiere actividad     " +
                                                  "\n f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. En caso de fiebre y diarrea, se       " +
                                                  "\n recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: El          " +
                                                  "\n tratamiento para la shigelosis en adultos suele incluir antibi�ticos como la ciprofloxacina, la azitromicina y la    " +
                                                  "\n ceftriaxona, los cuales ayudan a eliminar la bacteria Shigella. ALIMENTACI�N: Se recomienda el consumo de alimentos  " +
                                                  "\n blandos y f�ciles de digerir, como pl�tanos, que contienen potasio, �til para mantener el equilibrio de electrolitos;" +
                                                  "\n arroz, que ayuda a reducir la diarrea; zanahorias, con 334% de la ingesta diaria recomendada de vitamina A por cada  " +
                                                  "\n 100 gramos, esencial para la salud intestinal; y yogur, que aporta probi�ticos beneficiosos para la recuperaci�n.    " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga     " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de   " +
                                                  "\n un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su   " +
                                                  "\n salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel   " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos   " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a fluidificar las secreciones pulmonares,         " +
                                                  "\n facilitando la respiraci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente, " +
                                                  "\n evitando esfuerzos excesivos. Se recomienda caminatas suaves de 20 a 30 minutos al d�a, siempre que no haya dificultad " +
                                                  "\n respiratoria, y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: El tratamiento    " +
                                                  "\n para la EPOC en adultos suele incluir broncodilatadores como el salbutamol y corticosteroides inhalados como la        " +
                                                  "\n fluticasona, los cuales ayudan a reducir la inflamaci�n y mejorar la funci�n pulmonar. ALIMENTACI�N: Se recomienda     " +
                                                  "\n el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico y       " +
                                                  "\n reducir la inflamaci�n pulmonar. Algunos ejemplos incluyen zanahorias, que contienen aproximadamente 334% de la        " +
                                                  "\n ingesta diaria recomendada de vitamina A por cada 100 gramos, esencial para la salud pulmonar; naranjas, con 53 mg     " +
                                                  "\n de vitamina C por cada 100 gramos, lo que representa cerca del 88% de la ingesta diaria recomendada; espinacas, ricas  " +
                                                  "\n en hierro y antioxidantes que favorecen la oxigenaci�n celular; y almendras, que aportan vitamina E, clave para la     " +
                                                  "\n protecci�n de las c�lulas pulmonares. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza" +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello   " +
                                                  "\n se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su   " +
                                                  "\n paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar " +
                                                  "\n a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos  " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar al cuerpo a eliminar la infecci�n. Adem�s, se    " +
                                                  "\n pueden incluir infusiones de hierbas con propiedades antimicrobianas y caldos claros para reforzar la hidrataci�n.  " +
                                                  "\n EJERCICIO: Se sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas.      " +
                                                  "\n Se recomienda caminatas suaves de 30 minutos al d�a y ejercicios de movilidad para mejorar la circulaci�n y el      " +
                                                  "\n bienestar general. POSIBLE TRATAMIENTO: El tratamiento para la clamidia en adultos suele incluir antibi�ticos       " +
                                                  "\n como la azitromicina y la doxiciclina, los cuales ayudan a eliminar la bacteria Chlamydia trachomatis. ALIMENTACI�N:" +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema     " +
                                                  "\n inmunol�gico, como ajo, que posee propiedades antimicrobianas naturales; espinacas, ricas en hierro y vitamina C,   " +
                                                  "\n esenciales para la recuperaci�n; jengibre, con efectos antiinflamatorios y antibacterianos; y c�tricos como naranjas" +
                                                  "\n y limones, que aportan vitamina C y ayudan a reforzar las defensas del organismo. Este es solo un Diagn�stico       " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello  " +
                                                  "\n la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del       " +
                                                  "\n Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita" +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana. " +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos  " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la fiebre y la inflamaci�n. Tambi�n    " +
                                                  "\n se recomienda el consumo de caldos claros y bebidas con electrolitos para evitar la deshidrataci�n. EJERCICIO: Se   " +
                                                  "\n sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. En caso de fiebre, " +
                                                  "\n se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: El      " +
                                                  "\n tratamiento para la meningitis bacteriana en adultos suele incluir antibi�ticos administrados por v�a intravenosa,  " +
                                                  "\n como la ceftriaxona y la ampicilina, los cuales ayudan a eliminar la infecci�n. Tambi�n se pueden recetar corticoides" +
                                                  "\n para reducir la inflamaci�n cerebral y medicamentos para controlar las convulsiones en casos graves. ALIMENTACI�N:  " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema     " +
                                                  "\n inmunol�gico, como frutos rojos, ricos en antioxidantes y vitamina C, que ayudan a reducir el estr�s oxidativo;     " +
                                                  "\n espinacas, con alto contenido de hierro y magnesio, esenciales para la producci�n de energ�a; aguacate, que aporta  " +
                                                  "\n grasas saludables y vitamina E, clave para la protecci�n celular; y almendras, que contienen vitamina E y �cidos    " +
                                                  "\n grasos saludables, beneficiosos para la salud celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo   " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas  " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en  " +
                                                  "\n el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo" +
                                                  "\n se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua al d�a (entre 10 y 12 vasos de tama�o " +
                                                  "\n regular) para mantener una adecuada hidrataci�n y ayudar al cuerpo a eliminar toxinas. Tambi�n se recomienda el consumo de   " +
                                                  "\n infusiones antioxidantes y caldos ricos en minerales para reforzar la hidrataci�n. EJERCICIO: Se sugiere actividad f�sica    " +
                                                  "\n moderada, adaptada a la condici�n del paciente, como caminatas suaves de 30 minutos al d�a y ejercicios de respiraci�n       " +
                                                  "\n profunda para mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: El tratamiento para el c�ncer en adultos depende del tipo y       " +
                                                  "\n estadio de la enfermedad, pero puede incluir cirug�a, quimioterapia con medicamentos como el paclitaxel y el cisplatino,     " +
                                                  "\n radioterapia y terapias dirigidas. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes   " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico y reducir la inflamaci�n celular. Algunos ejemplos incluyen zanahorias,   " +
                                                  "\n que contienen aproximadamente 334% de la ingesta diaria recomendada de vitamina A por cada 100 gramos, esencial para la      " +
                                                  "\n salud celular; naranjas, con 53 mg de vitamina C por cada 100 gramos, lo que representa cerca del 88% de la ingesta diaria   " +
                                                  "\n recomendada; espinacas, ricas en hierro y antioxidantes que favorecen la oxigenaci�n celular; y almendras, que aportan       " +
                                                  "\n vitamina E, clave para la protecci�n de las c�lulas. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado   " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas,     " +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado    " +
                                                  "\n de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho          " +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        
                        if(EstaturaMasculino.equals("1.65-1.80 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 3 a 3.5 litros de agua (entre 12 y 14 vasos de tama�o regular) para      " +
                                                  "\n compensar la p�rdida de l�quidos causada por la fiebre y mantener una adecuada hidrataci�n. Se sugiere incluir caldos    " +
                                                  "\n claros, infusiones de hierbas y bebidas con electrolitos para evitar la deshidrataci�n. EJERCICIO: Se recomienda reposo  " +
                                                  "\n mientras persista la fiebre, evitando actividades de esfuerzo intenso. Una vez que los s�ntomas comiencen a mejorar, se  " +
                                                  "\n pueden realizar caminatas suaves de 15 a 30 minutos al d�a para ayudar en la recuperaci�n sin comprometer el sistema     " +
                                                  "\n respiratorio. POSIBLE TRATAMIENTO: Se pueden utilizar antivirales como oseltamivir (Tamiflu), baloxavir (Xofluza) y      " +
                                                  "\n zanamivir (Relenza) para reducir la duraci�n y gravedad de la infecci�n. Para aliviar s�ntomas como fiebre y malestar,   " +
                                                  "\n se recomienda el uso de paracetamol (Tempra) o ibuprofeno (Advil). ALIMENTACI�N: Se recomienda el consumo de alimentos   " +
                                                  "\n ricos en vitamina C y antioxidantes para fortalecer el sistema inmunol�gico, como naranjas (1 unidad, 130 g) que         " +
                                                  "\n contienen 70 mg de vitamina C (78% de la ingesta diaria recomendada), 3 g de fibra y 237 mg de potasio; fresas (100 g)   " +
                                                  "\n con 59 mg de vitamina C (98% de la ingesta diaria recomendada), 2 g de fibra y antioxidantes flavonoides y polifenoles;  " +
                                                  "\n kiwi (100 g) con 92 mg de vitamina C (153% de la ingesta diaria recomendada), 40 mcg de vitamina K (33% de la ingesta    " +
                                                  "\n diaria recomendada) y 312 mg de potasio. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no        " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas,    " +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado" +
                                                  "\n de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho      " +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 3 a 3.5 litros de agua (entre 12 y 14 vasos de tama�o regular) para    " +
                                                  "\n mantener la hidrataci�n y facilitar la expulsi�n de secreciones bronquiales. Se sugiere tambi�n infusiones de   " +
                                                  "\n hierbas, caldos de pollo y jugos naturales sin az�car para reforzar la hidrataci�n. EJERCICIO: Se aconsejan     " +
                                                  "\n ejercicios de respiraci�n profunda y t�cnicas de expansi�n pulmonar para mejorar la capacidad respiratoria.     " +
                                                  "\n Caminatas suaves de 10 a 20 minutos pueden ser beneficiosas si no hay fatiga excesiva. POSIBLE TRATAMIENTO:     " +
                                                  "\n En el caso de neumon�a bacteriana, el tratamiento suele incluir antibi�ticos como amoxicilina, azitromicina     " +
                                                  "\n y ceftriaxona. Para neumon�a viral, se recomienda el manejo de los s�ntomas con antipir�ticos como paracetamol  " +
                                                  "\n (Tempra) y antiinflamatorios como ibuprofeno (Advil). ALIMENTACI�N: Se recomienda el consumo de alimentos ricos " +
                                                  "\n en vitaminas y antioxidantes para fortalecer el sistema inmunol�gico y reducir la inflamaci�n pulmonar, como    " +
                                                  "\n zanahorias (100 g) que contienen 334% de la ingesta diaria recomendada de vitamina A, 2.8 g de fibra y antioxidantes" +
                                                  "\n beta-carotenos; naranjas (1 unidad, 130 g) con 70 mg de vitamina C (78% de la ingesta diaria recomendada), 3 g     " +
                                                  "\n de fibra y 237 mg de potasio; espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta diaria recomendada),       " +
                                                  "\n 79 mg de magnesio (20% de la ingesta diaria recomendada) y 483 mcg de vitamina K (402% de la ingesta diaria        " +
                                                  "\n recomendada); almendras (28 g, aproximadamente 23 unidades) con 7.3 mg de vitamina E (49% de la ingesta diaria     " +
                                                  "\n recomendada), 76 mg de magnesio (18% de la ingesta diaria recomendada) y 3.5 g de fibra. Este es solo un Diagn�stico" +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello  " +
                                                  "\n la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del       " +
                                                  "\n Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu       " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o regular) para     " +
                                                  "\n mantener un adecuado nivel de hidrataci�n y ayudar a regular los niveles de glucosa en sangre. Se sugiere        " +
                                                  "\n tambi�n el consumo de agua con lim�n, infusiones sin az�car y jugos naturales con bajo �ndice gluc�mico.         " +
                                                  "\n EJERCICIO: Se recomienda realizar actividad f�sica moderada como caminatas de 30 a 45 minutos al d�a,            " +
                                                  "\n entrenamiento de resistencia y ejercicios aer�bicos, que contribuyen a mejorar la sensibilidad a la insulina.    " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento suele incluir medicamentos como metformina (Glucophage, Dianben), que ayuda  " +
                                                  "\n a reducir la producci�n de glucosa en el h�gado, y en algunos casos, insulina para controlar los niveles elevados." +
                                                  "\n Tambi�n es importante un monitoreo constante de la glucosa en sangre y ajustes en la dieta. ALIMENTACI�N: Se      " +
                                                  "\n recomienda el consumo de alimentos ricos en fibra y bajos en carbohidratos refinados para estabilizar los niveles " +
                                                  "\n de glucosa, como avena (100 g) que aporta 4 g de fibra, 138 mg de magnesio (33% de la ingesta diaria recomendada) " +
                                                  "\n y 2.3 mg de zinc (21% de la ingesta diaria recomendada); almendras (28 g, aproximadamente 23 unidades) con 7.3 mg " +
                                                  "\n de vitamina E (49% de la ingesta diaria recomendada), 76 mg de magnesio (18% de la ingesta diaria recomendada)    " +
                                                  "\n y 3.5 g de fibra; espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta diaria recomendada), 79 mg de magnesio" +
                                                  "\n (20% de la ingesta diaria recomendada) y 483 mcg de vitamina K (402% de la ingesta diaria recomendada); fresas (100 g)  " +
                                                  "\n con 59 mg de vitamina C (98% de la ingesta diaria recomendada), 2 g de fibra y antioxidantes flavonoides y polifenoles. " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa    " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un       " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud   " +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o regular) para   " +
                                                  "\n mantener las v�as respiratorias hidratadas y reducir la viscosidad del moco, facilitando la respiraci�n. Tambi�n se   " +
                                                  "\n pueden incluir infusiones de hierbas con propiedades antiinflamatorias y caldos claros para reforzar la hidrataci�n.  " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser controlada y adaptada a la condici�n del paciente, evitando desencadenantes   " +
                                                  "\n como el aire fr�o o la contaminaci�n. Se recomienda ejercicios de respiraci�n profunda y caminatas suaves de 30       " +
                                                  "\n minutos al d�a. POSIBLE TRATAMIENTO: El tratamiento para el asma en adultos suele incluir broncodilatadores de alivio " +
                                                  "\n r�pido, como el salbutamol (Ventolin, Aerolin), y corticosteroides inhalados, como la fluticasona (Flixotide, Pulmicort)," +
                                                  "\n para el control a largo plazo. En algunos casos, se pueden utilizar modificadores de leucotrienos como el montelukast    " +
                                                  "\n (Singulair). ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antiinflamatorias y antioxidantes,      " +
                                                  "\n como pescado graso, que aporta �cidos grasos Omega-3, beneficiosos para la salud pulmonar; zanahorias (100 g) que        " +
                                                  "\n contienen 334% de la ingesta diaria recomendada de vitamina A, 2.8 g de fibra y antioxidantes beta-carotenos; c�rcuma,   " +
                                                  "\n con curcumina, que posee propiedades antiinflamatorias; y kiwi (100 g) con 92 mg de vitamina C (153% de la ingesta       " +
                                                  "\n diaria recomendada), 40 mcg de vitamina K (33% de la ingesta diaria recomendada) y 312 mg de potasio. Este es solo un    " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que    " +
                                                  "\n por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida  " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del       " +
                                                  "\n Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita     " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o regular) para " +
                                                  "\n mantener una adecuada hidrataci�n y apoyar la funci�n renal, especialmente en pacientes que toman medicamentos      " +
                                                  "\n antirretrovirales. EJERCICIO: Se sugiere realizar actividad f�sica moderada, como caminatas de 30 a 45 minutos      " +
                                                  "\n al d�a y ejercicios de resistencia, lo que contribuye a fortalecer el sistema inmunol�gico y mejorar la calidad     " +
                                                  "\n de vida. POSIBLE TRATAMIENTO: El tratamiento para el VIH/SIDA consiste en la terapia antirretroviral (TAR), que     " +
                                                  "\n incluye combinaciones de medicamentos como el tenofovir (Viread), emtricitabina (Emtriva), dolutegravir (Tivicay)   " +
                                                  "\n y efavirenz (Sustiva), los cuales ayudan a reducir la carga viral y mejorar la funci�n inmunol�gica. ALIMENTACI�N:  " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema     " +
                                                  "\n inmunol�gico, como aguacate, que aporta grasas saludables y vitamina E, clave para la protecci�n celular; frutos    " +
                                                  "\n rojos (100 g) ricos en antioxidantes y vitamina C, que ayudan a reducir el estr�s oxidativo con 59 mg de vitamina C " +
                                                  "\n (98% de la ingesta diaria recomendada); espinacas (100 g) con alto contenido de hierro (2.7 mg, 15% de la ingesta   " +
                                                  "\n diaria recomendada) y magnesio (79 mg, 20% de la ingesta diaria recomendada); y almendras (28 g, aproximadamente    " +
                                                  "\n 23 unidades) que contienen vitamina E (7.3 mg, 49% de la ingesta diaria recomendada) y �cidos grasos saludables,    " +
                                                  "\n beneficiosos para la salud celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza" +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello " +
                                                  "\n se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su " +
                                                  "\n paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar" +
                                                  "\n a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de  " +
                                                  "\n tama�o regular) para ayudar a eliminar toxinas y mantener una adecuada funci�n renal. EJERCICIO: Se sugiere     " +
                                                  "\n actividad f�sica moderada, como caminatas de 30 a 45 minutos al d�a, evitando esfuerzos excesivos mientras      " +
                                                  "\n persistan los s�ntomas. POSIBLE TRATAMIENTO: El tratamiento para la gonorrea en adultos suele incluir           " +
                                                  "\n antibi�ticos como la ceftriaxona (Rocephin, Cefaxone) y la azitromicina (Zithromax, Azitrocin), los cuales      " +
                                                  "\n ayudan a eliminar la bacteria responsable de la infecci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos  " +
                                                  "\n ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, como ajo, que posee     " +
                                                  "\n propiedades antimicrobianas naturales; espinacas (100 g) ricas en hierro (2.7 mg, 15% de la ingesta diaria      " +
                                                  "\n recomendada) y vitamina C (79 mg, 20% de la ingesta diaria recomendada), esenciales para la recuperaci�n;       " +
                                                  "\n jengibre, con efectos antiinflamatorios y antibacterianos; y c�tricos como naranjas (1 unidad, 130 g) que       " +
                                                  "\n aportan 70 mg de vitamina C (78% de la ingesta diaria recomendada) y ayudan a reforzar las defensas del organismo." +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga  " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s   " +
                                                  "\n de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s    " +
                                                  "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico," +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de  " +
                                                  "\n tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la inflamaci�n. Tambi�n se pueden     " +
                                                  "\n incluir infusiones de hierbas con propiedades antivirales y caldos claros para reforzar la hidrataci�n.         " +
                                                  "\n EJERCICIO: Se sugiere actividad f�sica moderada, evitando el sobreesfuerzo y el estr�s, ya que estos pueden     " +
                                                  "\n desencadenar brotes recurrentes. Se recomienda ejercicios de relajaci�n y caminatas suaves de 30 minutos al d�a." +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para el herpes genital en adultos suele incluir antivirales como aciclovir, " +
                                                  "\n valaciclovir y famciclovir, los cuales ayudan a reducir la duraci�n y gravedad de los brotes. ALIMENTACI�N: Se  " +
                                                  "\n recomienda el consumo de alimentos ricos en lisina, un amino�cido que puede ayudar a reducir la frecuencia de   " +
                                                  "\n los brotes, como yogur, que aporta prote�nas y probi�ticos beneficiosos; pescado, rico en �cidos grasos Omega-3 " +
                                                  "\n con propiedades antiinflamatorias; frutos secos como almendras (28 g, aproximadamente 23 unidades) que contienen" +
                                                  "\n 7.3 mg de vitamina E (49% de la ingesta diaria recomendada) y antioxidantes; y vegetales de hoja verde como     " +
                                                  "\n espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta diaria recomendada) y 79 mg de magnesio (20% de la    " +
                                                  "\n ingesta diaria recomendada), esenciales para la regeneraci�n celular. Este es solo un Diagn�stico predeterminado" +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad" +
                                                  "\n y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no" +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app   " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o regular)  " +
                                                  "\n para mantener una adecuada hidrataci�n y ayudar a reducir la fiebre y la inflamaci�n. Tambi�n se recomienda el  " +
                                                  "\n consumo de caldos claros y bebidas con electrolitos para evitar la deshidrataci�n. EJERCICIO: Se sugiere        " +
                                                  "\n actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. En caso de fiebre, se  " +
                                                  "\n recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: El     " +
                                                  "\n tratamiento para la s�filis en adultos suele incluir antibi�ticos como la penicilina G benzatina, la ceftriaxona" +
                                                  "\n y la doxiciclina, los cuales ayudan a eliminar la bacteria Treponema pallidum. ALIMENTACI�N: Se recomienda el   " +
                                                  "\n consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, como  " +
                                                  "\n frutos rojos (100 g) ricos en antioxidantes y vitamina C, que ayudan a reducir el estr�s oxidativo con 59 mg de    " +
                                                  "\n vitamina C (98% de la ingesta diaria recomendada); espinacas (100 g) con alto contenido de hierro (2.7 mg, 15% de  " +
                                                  "\n la ingesta diaria recomendada) y magnesio (79 mg, 20% de la ingesta diaria recomendada); aguacate, que aporta      " +
                                                  "\n grasas saludables y vitamina E, clave para la protecci�n celular; y almendras (28 g, aproximadamente 23 unidades)  " +
                                                  "\n que contienen vitamina E (7.3 mg, 49% de la ingesta diaria recomendada) y �cidos grasos saludables, beneficiosos   " +
                                                  "\n para la salud celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%  " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se   " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de    " +
                                                  "\n su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho   " +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 3 a 3.5 litros de agua (entre 12 y 14 vasos  " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a fluidificar las secreciones pulmonares, " +
                                                  "\n facilitando la respiraci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del   " +
                                                  "\n paciente, evitando esfuerzos excesivos. Se recomienda caminatas suaves de 20 a 30 minutos al d�a, siempre    " +
                                                  "\n que no haya dificultad respiratoria, y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n.       " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis en adultos suele incluir antibi�ticos como la       " +
                                                  "\n isoniazida, rifampicina y etambutol, los cuales ayudan a eliminar la bacteria Mycobacterium tuberculosis.    " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para      " +
                                                  "\n fortalecer el sistema inmunol�gico y reducir la inflamaci�n pulmonar, como zanahorias (100 g) que contienen  " +
                                                  "\n aproximadamente 334% de la ingesta diaria recomendada de vitamina A, 2.8 g de fibra y antioxidantes          " +
                                                  "\n beta-carotenos; naranjas (1 unidad, 130 g) con 70 mg de vitamina C (78% de la ingesta diaria recomendada),   " +
                                                  "\n 3 g de fibra y 237 mg de potasio; espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta diaria recomendada)," +
                                                  "\n 79 mg de magnesio (20% de la ingesta diaria recomendada) y 483 mcg de vitamina K (402% de la ingesta diaria     " +
                                                  "\n recomendada); y almendras (28 g, aproximadamente 23 unidades) que aportan vitamina E (7.3 mg, 49% de la ingesta " +
                                                  "\n diaria recomendada), magnesio (76 mg, 18% de la ingesta diaria recomendada) y fibra (3.5 g). Este es solo un    " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un          " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s        " +
                                                  "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a        " +
                                                  "\n su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de      " +
                                                  "\n tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la inflamaci�n en las articulaciones.     " +
                                                  "\n Tambi�n se pueden incluir infusiones de hierbas con propiedades antiinflamatorias y caldos claros para reforzar     " +
                                                  "\n la hidrataci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente, evitando   " +
                                                  "\n movimientos bruscos. Se recomienda ejercicios de bajo impacto como nataci�n, yoga o caminatas suaves de 30 minutos  " +
                                                  "\n al d�a. POSIBLE TRATAMIENTO: El tratamiento para la artritis en adultos suele incluir antiinflamatorios no esteroides" +
                                                  "\n como el ibuprofeno y el naproxeno, as� como f�rmacos antirreum�ticos modificadores de la enfermedad como el metotrexato.    " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antiinflamatorias y antioxidantes, como pescado graso,  " +
                                                  "\n que aporta �cidos grasos Omega-3, beneficiosos para la salud articular; c�rcuma, con curcumina, que posee propiedades       " +
                                                  "\n antiinflamatorias; frutos secos como almendras (28 g, aproximadamente 23 unidades) que contienen 7.3 mg de vitamina E       " +
                                                  "\n (49% de la ingesta diaria recomendada) y antioxidantes; y vegetales de hoja verde como espinacas (100 g) con 2.7 mg de      " +
                                                  "\n hierro (15% de la ingesta diaria recomendada) y 79 mg de magnesio (20% de la ingesta diaria recomendada), esenciales        " +
                                                  "\n para la regeneraci�n celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%    " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda " +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s    " +
                                                  "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico,         " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la inflamaci�n en las v�as     " +
                                                  "\n respiratorias. Tambi�n se recomienda el consumo de caldos claros y bebidas con electrolitos para evitar     " +
                                                  "\n la deshidrataci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente, " +
                                                  "\n evitando esfuerzos excesivos. Se recomienda ejercicios de respiraci�n profunda y caminatas suaves de 20     " +
                                                  "\n a 30 minutos al d�a. POSIBLE TRATAMIENTO: El tratamiento para la tosferina en adultos suele incluir         " +
                                                  "\n antibi�ticos como la azitromicina, claritromicina y eritromicina, los cuales ayudan a eliminar la bacteria  " +
                                                  "\n Bordetella pertussis. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y          " +
                                                  "\n nutrientes esenciales para fortalecer el sistema inmunol�gico y reducir la inflamaci�n pulmonar, como       " +
                                                  "\n zanahorias (100 g) que contienen aproximadamente 334% de la ingesta diaria recomendada de vitamina A,       " +
                                                  "\n 2.8 g de fibra y antioxidantes beta-carotenos; naranjas (1 unidad, 130 g) con 70 mg de vitamina C (78% de   " +
                                                  "\n la ingesta diaria recomendada), 3 g de fibra y 237 mg de potasio; espinacas (100 g) con 2.7 mg de hierro    " +
                                                  "\n (15% de la ingesta diaria recomendada), 79 mg de magnesio (20% de la ingesta diaria recomendada) y 483 mcg  " +
                                                  "\n de vitamina K (402% de la ingesta diaria recomendada); y almendras (28 g, aproximadamente 23 unidades) que  " +
                                                  "\n aportan vitamina E (7.3 mg, 49% de la ingesta diaria recomendada), magnesio (76 mg, 18% de la ingesta diaria     " +
                                                  "\n recomendada) y fibra (3.5 g). Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para " +
                                                  "\n ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento   " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le   " +
                                                  "\n recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos    " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la fiebre y la inflamaci�n.       " +
                                                  "\n Tambi�n se recomienda el consumo de caldos claros y bebidas con electrolitos para evitar la deshidrataci�n.    " +
                                                  "\n EJERCICIO: Se sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. " +
                                                  "\n En caso de fiebre, se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n.      " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para las paperas, pero se pueden aliviar los s�ntomas " +
                                                  "\n con analg�sicos y antipir�ticos como el paracetamol y el ibuprofeno. Tambi�n se recomienda el uso de compresas " +
                                                  "\n fr�as en la zona inflamada para reducir el dolor. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, como naranjas (1 unidad, 130 g) " +
                                                  "\n que contienen 70 mg de vitamina C (78% de la ingesta diaria recomendada), 3 g de fibra y 237 mg de potasio;    " +
                                                  "\n fresas (100 g) con 59 mg de vitamina C (98% de la ingesta diaria recomendada), 2 g de fibra y antioxidantes    " +
                                                  "\n flavonoides y polifenoles; espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta diaria recomendada), 79 mg" +
                                                  "\n de magnesio (20% de la ingesta diaria recomendada) y 483 mcg de vitamina K (402% de la ingesta diaria recomendada);    " +
                                                  "\n y almendras (28 g, aproximadamente 23 unidades) que aportan vitamina E (7.3 mg, 49% de la ingesta diaria recomendada), " +
                                                  "\n magnesio (76 mg, 18% de la ingesta diaria recomendada) y fibra (3.5 g). Este es solo un Diagn�stico predeterminado     " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad      " +
                                                  "\n y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer       " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no      " +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app         " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 3 a 3.5 litros de agua (entre 12 y 14 vasos     " +
                                                  "\n de tama�o regular) para prevenir la deshidrataci�n causada por la fiebre y ayudar a aliviar los s�ntomas.       " +
                                                  "\n Tambi�n se pueden incluir infusiones de hierbas con propiedades antiinflamatorias y caldos claros para          " +
                                                  "\n mantener el equilibrio de electrolitos. EJERCICIO: Se sugiere actividad f�sica moderada, evitando el            " +
                                                  "\n sobreesfuerzo y el estr�s, ya que estos pueden agravar los s�ntomas. En caso de fiebre, se recomienda           " +
                                                  "\n reposo y ejercicios de estiramiento suaves para evitar la fatiga muscular. POSIBLE TRATAMIENTO: No existen      " +
                                                  "\n medicamentos espec�ficos para tratar el zika, pero se pueden aliviar los s�ntomas con reposo, hidrataci�n       " +
                                                  "\n y analg�sicos como el acetaminof�n para reducir la fiebre y el dolor. Se recomienda evitar el uso de aspirina   " +
                                                  "\n y otros antiinflamatorios no esteroides hasta descartar la posibilidad de dengue. ALIMENTACI�N: Se recomienda   " +
                                                  "\n el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, " +
                                                  "\n como frutos rojos (100 g) ricos en antioxidantes y vitamina C, que ayudan a reducir el estr�s oxidativo con     " +
                                                  "\n 59 mg de vitamina C (98% de la ingesta diaria recomendada); espinacas (100 g) con alto contenido de hierro      " +
                                                  "\n (2.7 mg, 15% de la ingesta diaria recomendada) y magnesio (79 mg, 20% de la ingesta diaria recomendada); aguacate,   " +
                                                  "\n que aporta grasas saludables y vitamina E, clave para la protecci�n celular; y almendras (28 g, aproximadamente      " +
                                                  "\n 23 unidades) que contienen vitamina E (7.3 mg, 49% de la ingesta diaria recomendada) y �cidos grasos saludables,     " +
                                                  "\n beneficiosos para la salud celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no         " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas," +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento     " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le          " +
                                                  "\n recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 3 a 3.5 litros de agua (entre 12 y 14 vasos de tama�o regular)  " +
                                                  "\n para prevenir la deshidrataci�n causada por la diarrea y la fiebre. Tambi�n se recomienda el consumo de         " +
                                                  "\n soluciones de rehidrataci�n oral como Pedialyte para reponer los minerales perdidos. EJERCICIO: Se sugiere      " +
                                                  "\n actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. En caso de fiebre      " +
                                                  "\n y diarrea, se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n.               " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para la infecci�n por rotavirus, pero se recomienda    " +
                                                  "\n el consumo de l�quidos de rehidrataci�n oral y en casos graves, la administraci�n de l�quidos intravenosos.     " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos blandos y f�ciles de digerir, como pl�tanos (100 g) que     " +
                                                  "\n contienen potasio (358 mg, 10% de la ingesta diaria recomendada), �til para mantener el equilibrio de electrolitos;" +
                                                  "\n arroz, que ayuda a reducir la diarrea; zanahorias (100 g) con 334% de la ingesta diaria recomendada de vitamina A, " +
                                                  "\n 2.8 g de fibra y antioxidantes beta-carotenos; y yogur, que aporta probi�ticos beneficiosos para la recuperaci�n.  " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente         " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda        " +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su            " +
                                                  "\n paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda            " +
                                                  "\n mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos  " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar al cuerpo a combatir la infecci�n. En     " +
                                                  "\n casos de fiebre, se recomienda aumentar la ingesta de l�quidos y consumir caldos claros para evitar la       " +
                                                  "\n deshidrataci�n. EJERCICIO: Se sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras       " +
                                                  "\n persistan los s�ntomas. En casos graves, se recomienda reposo y ejercicios de respiraci�n profunda para      " +
                                                  "\n mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: El tratamiento para la listeriosis en adultos suele incluir     " +
                                                  "\n antibi�ticos como la ampicilina y la gentamicina, los cuales ayudan a eliminar la bacteria Listeria          " +
                                                  "\n monocytogenes. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes       " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico, como ajo, que posee propiedades antimicrobianas naturales;" +
                                                  "\n espinacas (100 g) ricas en hierro (2.7 mg, 15% de la ingesta diaria recomendada) y vitamina C (79 mg, 20% de    " +
                                                  "\n la ingesta diaria recomendada), esenciales para la recuperaci�n; jengibre, con efectos antiinflamatorios y      " +
                                                  "\n antibacterianos; y c�tricos como naranjas (1 unidad, 130 g) que aportan 70 mg de vitamina C (78% de la ingesta  " +
                                                  "\n diaria recomendada) y ayudan a reforzar las defensas del organismo. Este es solo un Diagn�stico predeterminado  " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad" +
                                                  "\n y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico   " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app" +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 3 a 3.5 litros de agua (entre 12 y 14 vasos    " +
                                                  "\n de tama�o regular) para prevenir la deshidrataci�n causada por la diarrea y la fiebre. Tambi�n se recomienda   " +
                                                  "\n el consumo de soluciones de rehidrataci�n oral para reponer los minerales perdidos. EJERCICIO: Se sugiere      " +
                                                  "\n actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. En caso de fiebre     " +
                                                  "\n y diarrea, se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n.              " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la shigelosis en adultos suele incluir antibi�ticos como la ciprofloxacina," +
                                                  "\n la azitromicina y la ceftriaxona, los cuales ayudan a eliminar la bacteria Shigella. ALIMENTACI�N: Se recomienda    " +
                                                  "\n el consumo de alimentos blandos y f�ciles de digerir, como pl�tanos (100 g) que contienen potasio (358 mg, 10%      " +
                                                  "\n de la ingesta diaria recomendada), �til para mantener el equilibrio de electrolitos; arroz, que ayuda a reducir     " +
                                                  "\n la diarrea; zanahorias (100 g) con 334% de la ingesta diaria recomendada de vitamina A, 2.8 g de fibra y            " +
                                                  "\n antioxidantes beta-carotenos; y yogur, que aporta probi�ticos beneficiosos para la recuperaci�n. Este es solo un    " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y   " +
                                                  "\n que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico    " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la     " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos   " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a fluidificar las secreciones pulmonares,  " +
                                                  "\n facilitando la respiraci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del    " +
                                                  "\n paciente, evitando esfuerzos excesivos. Se recomienda caminatas suaves de 20 a 30 minutos al d�a, siempre que " +
                                                  "\n no haya dificultad respiratoria, y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE    " +
                                                  "\n TRATAMIENTO: El tratamiento para la EPOC en adultos suele incluir broncodilatadores como el salbutamol y      " +
                                                  "\n corticosteroides inhalados como la fluticasona, los cuales ayudan a reducir la inflamaci�n y mejorar la       " +
                                                  "\n funci�n pulmonar. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes     " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico y reducir la inflamaci�n pulmonar, como zanahorias (100 g) " +
                                                  "\n que contienen aproximadamente 334% de la ingesta diaria recomendada de vitamina A, 2.8 g de fibra y antioxidantes " +
                                                  "\n beta-carotenos; naranjas (1 unidad, 130 g) con 70 mg de vitamina C (78% de la ingesta diaria recomendada), 3 g de " +
                                                  "\n fibra y 237 mg de potasio; espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta diaria recomendada), 79 mg   " +
                                                  "\n de magnesio (20% de la ingesta diaria recomendada) y 483 mcg de vitamina K (402% de la ingesta diaria recomendada);   " +
                                                  "\n y almendras (28 g, aproximadamente 23 unidades) que aportan vitamina E (7.3 mg, 49% de la ingesta diaria recomendada)," +
                                                  "\n magnesio (76 mg, 18% de la ingesta diaria recomendada) y fibra (3.5 g). Este es solo un Diagn�stico predeterminado    " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad " +
                                                  "\n y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer  " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no " +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app    " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o " +
                                                  "\n regular) para mantener una adecuada hidrataci�n y ayudar al cuerpo a eliminar la infecci�n. Adem�s, se pueden incluir " +
                                                  "\n infusiones de hierbas con propiedades antimicrobianas y caldos claros para reforzar la hidrataci�n. EJERCICIO: Se     " +
                                                  "\n sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. Se recomienda caminatas" +
                                                  "\n suaves de 30 minutos al d�a y ejercicios de movilidad para mejorar la circulaci�n y el bienestar general.               " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la clamidia en adultos suele incluir antibi�ticos como la azitromicina y la    " +
                                                  "\n doxiciclina, los cuales ayudan a eliminar la bacteria Chlamydia trachomatis. ALIMENTACI�N: Se recomienda el consumo de  " +
                                                  "\n alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, como ajo, que posee   " +
                                                  "\n propiedades antimicrobianas naturales; espinacas (100 g) ricas en hierro (2.7 mg, 15% de la ingesta diaria recomendada) " +
                                                  "\n y vitamina C (79 mg, 20% de la ingesta diaria recomendada), esenciales para la recuperaci�n; jengibre, con efectos      " +
                                                  "\n antiinflamatorios y antibacterianos; y c�tricos como naranjas (1 unidad, 130 g) que aportan 70 mg de vitamina C (78% de " +
                                                  "\n la ingesta diaria recomendada) y ayudan a reforzar las defensas del organismo. Este es solo un Diagn�stico predeterminado" +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus  " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad" +
                                                  "\n en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se" +
                                                  "\n le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos    " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la fiebre y la inflamaci�n.       " +
                                                  "\n Tambi�n se recomienda el consumo de caldos claros y bebidas con electrolitos para evitar la deshidrataci�n.    " +
                                                  "\n EJERCICIO: Se sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. " +
                                                  "\n En caso de fiebre, se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n.      " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la meningitis bacteriana en adultos suele incluir antibi�ticos administrados    " +
                                                  "\n por v�a intravenosa, como la ceftriaxona y la ampicilina, los cuales ayudan a eliminar la infecci�n. Tambi�n se pueden   " +
                                                  "\n recetar corticoides para reducir la inflamaci�n cerebral y medicamentos para controlar las convulsiones en casos graves. " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el    " +
                                                  "\n sistema inmunol�gico, como frutos rojos (100 g) ricos en antioxidantes y vitamina C, que ayudan a reducir el estr�s      " +
                                                  "\n oxidativo con 59 mg de vitamina C (98% de la ingesta diaria recomendada); espinacas (100 g) con alto contenido de hierro " +
                                                  "\n (2.7 mg, 15% de la ingesta diaria recomendada) y magnesio (79 mg, 20% de la ingesta diaria recomendada); aguacate, que   " +
                                                  "\n aporta grasas saludables y vitamina E, clave para la protecci�n celular; y almendras (28 g, aproximadamente 23 unidades) " +
                                                  "\n que contienen vitamina E (7.3 mg, 49% de la ingesta diaria recomendada) y �cidos grasos saludables, beneficiosos para la " +
                                                  "\n salud celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente" +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de " +
                                                  "\n un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud " +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes    " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o regular)" +
                                                  "\n para mantener una adecuada hidrataci�n y ayudar al cuerpo a eliminar toxinas. Tambi�n se recomienda el consumo de infusiones  " +
                                                  "\n antioxidantes y caldos ricos en minerales para reforzar la hidrataci�n. EJERCICIO: Se sugiere actividad f�sica moderada,      " +
                                                  "\n adaptada a la condici�n del paciente, como caminatas suaves de 30 minutos al d�a y ejercicios de respiraci�n profunda para    " +
                                                  "\n mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: El tratamiento para el c�ncer en adultos depende del tipo y estadio de la        " +
                                                  "\n enfermedad, pero puede incluir cirug�a, quimioterapia con medicamentos como el paclitaxel y el cisplatino, radioterapia y     " +
                                                  "\n terapias dirigidas. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para   " +
                                                  "\n fortalecer el sistema inmunol�gico y reducir la inflamaci�n celular, como zanahorias (100 g) que contienen aproximadamente    " +
                                                  "\n 334% de la ingesta diaria recomendada de vitamina A, 2.8 g de fibra y antioxidantes beta-carotenos; naranjas (1 unidad, 130 g)" +
                                                  "\n con 70 mg de vitamina C (78% de la ingesta diaria recomendada), 3 g de fibra y 237 mg de potasio; espinacas (100 g) con 2.7 mg" +
                                                  "\n de hierro (15% de la ingesta diaria recomendada), 79 mg de magnesio (20% de la ingesta diaria recomendada) y 483 mcg de       " +
                                                  "\n vitamina K (402% de la ingesta diaria recomendada); y almendras (28 g, aproximadamente 23 unidades) que aportan vitamina E    " +
                                                  "\n (7.3 mg, 49% de la ingesta diaria recomendada), magnesio (76 mg, 18% de la ingesta diaria recomendada) y fibra (3.5 g).       " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa          " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del " +
                                                  "\n Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a        " +
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        if(EstaturaMasculino.equals("1.55-1.70 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de  " +
                                                  "\n tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la fiebre y la inflamaci�n. Tambi�n   " +
                                                  "\n se recomienda el consumo de caldos claros y bebidas con electrolitos para evitar la deshidrataci�n. EJERCICIO:  " +
                                                  "\n Se recomienda reposo mientras persista la fiebre, evitando actividades de esfuerzo intenso. Una vez que los     " +
                                                  "\n s�ntomas comiencen a mejorar, se pueden realizar caminatas suaves de 15 a 30 minutos al d�a para ayudar en la   " +
                                                  "\n recuperaci�n sin comprometer el sistema respiratorio. POSIBLE TRATAMIENTO: Se pueden utilizar antivirales como  " +
                                                  "\n oseltamivir, baloxavir y zanamivir para reducir la duraci�n y gravedad de la infecci�n. Para aliviar s�ntomas   " +
                                                  "\n como fiebre y malestar, se recomienda el uso de paracetamol o ibuprofeno. ALIMENTACI�N: Se recomienda el consumo" +
                                                  "\n de frutas y verduras ricas en vitaminas y antioxidantes para fortalecer el sistema inmunol�gico, como naranjas  " +
                                                  "\n (1 unidad, 130 g) que contienen 70 mg de vitamina C (78% de la ingesta diaria recomendada), 3 g de fibra y 237 mg  " +
                                                  "\n de potasio; fresas (100 g) con 59 mg de vitamina C (98% de la ingesta diaria recomendada), 2 g de fibra y          " +
                                                  "\n antioxidantes flavonoides y polifenoles; pl�tanos (100 g) ricos en potasio (358 mg, 10% de la ingesta diaria       " +
                                                  "\n recomendada), �til para mantener el equilibrio de electrolitos; y kiwi (100 g) con 92 mg de vitamina C (153% de la " +
                                                  "\n ingesta diaria recomendada), 40 mcg de vitamina K (33% de la ingesta diaria recomendada) y 312 mg de potasio.      " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga   " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de " +
                                                  "\n un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por    " +
                                                  "\n su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico,    " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o      " +
                                                  "\n regular) para mantener la hidrataci�n y facilitar la expulsi�n de secreciones bronquiales. Se sugiere tambi�n       " +
                                                  "\n infusiones de hierbas, caldos de pollo y jugos naturales sin az�car para reforzar la hidrataci�n. EJERCICIO: Se     " +
                                                  "\n aconsejan ejercicios de respiraci�n profunda y t�cnicas de expansi�n pulmonar para mejorar la capacidad respiratoria. " +
                                                  "\n Caminatas suaves de 10 a 20 minutos pueden ser beneficiosas si no hay fatiga excesiva. POSIBLE TRATAMIENTO: En        " +
                                                  "\n el caso de neumon�a bacteriana, el tratamiento suele incluir antibi�ticos como amoxicilina, azitromicina y ceftriaxona." +
                                                  "\n Para neumon�a viral, se recomienda el manejo de los s�ntomas con antipir�ticos como paracetamol y antiinflamatorios    " +
                                                  "\n como ibuprofeno. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en vitaminas y antioxidantes para fortalecer" +
                                                  "\n el sistema inmunol�gico y reducir la inflamaci�n pulmonar, como zanahorias (100 g) que contienen aproximadamente 334%  " +
                                                  "\n de la ingesta diaria recomendada de vitamina A, 2.8 g de fibra y antioxidantes beta-carotenos; naranjas (1 unidad, 130 g)" +
                                                  "\n con 70 mg de vitamina C (78% de la ingesta diaria recomendada), 3 g de fibra y 237 mg de potasio; espinacas (100 g)      " +
                                                  "\n con 2.7 mg de hierro (15% de la ingesta diaria recomendada), 79 mg de magnesio (20% de la ingesta diaria recomendada)    " +
                                                  "\n y 483 mcg de vitamina K (402% de la ingesta diaria recomendada); y almendras (28 g, aproximadamente 23 unidades) que     " +
                                                  "\n aportan vitamina E (7.3 mg, 49% de la ingesta diaria recomendada), magnesio (76 mg, 18% de la ingesta diaria recomendada)" +
                                                  "\n y fibra (3.5 g). Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el       " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda     " +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s " +
                                                  "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico,      " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes. " +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o      " +
                                                  "\n regular) para mantener un adecuado nivel de hidrataci�n y ayudar a regular los niveles de glucosa en sangre.        " +
                                                  "\n Se sugiere tambi�n el consumo de agua con lim�n, infusiones sin az�car y jugos naturales con bajo �ndice gluc�mico. " +
                                                  "\n EJERCICIO: Se recomienda realizar actividad f�sica moderada como caminatas de 30 a 45 minutos al d�a, entrenamiento " +
                                                  "\n de resistencia y ejercicios aer�bicos, que contribuyen a mejorar la sensibilidad a la insulina. POSIBLE TRATAMIENTO:" +
                                                  "\n El tratamiento suele incluir medicamentos como metformina, que ayuda a reducir la producci�n de glucosa en el h�gado," +
                                                  "\n y en algunos casos, insulina para controlar los niveles elevados. Tambi�n es importante un monitoreo constante de la " +
                                                  "\n glucosa en sangre y ajustes en la dieta. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en fibra y bajos  " +
                                                  "\n en carbohidratos refinados para estabilizar los niveles de glucosa, como avena (100 g) que aporta 4 g de fibra,      " +
                                                  "\n 138 mg de magnesio (33% de la ingesta diaria recomendada) y 2.3 mg de zinc (21% de la ingesta diaria recomendada);   " +
                                                  "\n almendras (28 g, aproximadamente 23 unidades) con 7.3 mg de vitamina E (49% de la ingesta diaria recomendada),       " +
                                                  "\n 76 mg de magnesio (18% de la ingesta diaria recomendada) y 3.5 g de fibra; espinacas (100 g) con 2.7 mg de hierro    " +
                                                  "\n (15% de la ingesta diaria recomendada), 79 mg de magnesio (20% de la ingesta diaria recomendada) y 483 mcg de        " +
                                                  "\n vitamina K (402% de la ingesta diaria recomendada); fresas (100 g) con 59 mg de vitamina C (98% de la ingesta diaria " +
                                                  "\n recomendada), 2 g de fibra y antioxidantes flavonoides y polifenoles. Este es solo un Diagn�stico predeterminado l�gico," +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus         " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor        " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le          " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app             " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o  " +
                                                  "\n regular) para mantener las v�as respiratorias hidratadas y reducir la viscosidad del moco, facilitando la respiraci�n. " +
                                                  "\n Tambi�n se pueden incluir infusiones de hierbas con propiedades antiinflamatorias y caldos claros para reforzar la     " +
                                                  "\n hidrataci�n. EJERCICIO: La actividad f�sica debe ser controlada y adaptada a la condici�n del paciente, evitando       " +
                                                  "\n desencadenantes como el aire fr�o o la contaminaci�n. Se recomienda ejercicios de respiraci�n profunda y caminatas     " +
                                                  "\n suaves de 30 minutos al d�a. POSIBLE TRATAMIENTO: El tratamiento para el asma en adultos suele incluir broncodilatadores  " +
                                                  "\n de alivio r�pido, como el salbutamol y corticosteroides inhalados como la fluticasona, los cuales ayudan a reducir la     " +
                                                  "\n inflamaci�n y mejorar la funci�n pulmonar. ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades            " +
                                                  "\n antiinflamatorias y antioxidantes, como pescado graso, que aporta �cidos grasos Omega-3, beneficiosos para la salud pulmonar;" +
                                                  "\n zanahorias (100 g) que contienen 334% de la ingesta diaria recomendada de vitamina A, 2.8 g de fibra y antioxidantes         " +
                                                  "\n beta-carotenos; c�rcuma, con curcumina, que posee propiedades antiinflamatorias; y kiwi (100 g) con 92 mg de vitamina C      " +
                                                  "\n (153% de la ingesta diaria recomendada), 40 mcg de vitamina K (33% de la ingesta diaria recomendada) y 312 mg de potasio.    " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa         " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un            " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud        " +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes        " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de          " +
                                                  "\n tama�o regular) para mantener una adecuada hidrataci�n y apoyar la funci�n renal, especialmente en pacientes que        " +
                                                  "\n toman medicamentos antirretrovirales. EJERCICIO: Se sugiere realizar actividad f�sica moderada, como caminatas de       " +
                                                  "\n 30 a 45 minutos al d�a y ejercicios de resistencia, lo que contribuye a fortalecer el sistema inmunol�gico y mejorar    " +
                                                  "\n la calidad de vida. POSIBLE TRATAMIENTO: El tratamiento para el VIH/SIDA consiste en la terapia antirretroviral (TAR),  " +
                                                  "\n que incluye combinaciones de medicamentos como el tenofovir, emtricitabina, dolutegravir y efavirenz, los cuales ayudan " +
                                                  "\n a reducir la carga viral y mejorar la funci�n inmunol�gica. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos   " +
                                                  "\n en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, como aguacate, que aporta grasas saludables " +
                                                  "\n y vitamina E, clave para la protecci�n celular; frutos rojos (100 g) ricos en antioxidantes y vitamina C, que ayudan a        " +
                                                  "\n reducir el estr�s oxidativo con 59 mg de vitamina C (98% de la ingesta diaria recomendada); espinacas (100 g) con alto        " +
                                                  "\n contenido de hierro (2.7 mg, 15% de la ingesta diaria recomendada) y magnesio (79 mg, 20% de la ingesta diaria recomendada);  " +
                                                  "\n y almendras (28 g, aproximadamente 23 unidades) que contienen vitamina E (7.3 mg, 49% de la ingesta diaria recomendada)       " +
                                                  "\n y �cidos grasos saludables, beneficiosos para la salud celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n      " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento   " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho  " +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos        " +
                                                  "\n de tama�o regular) para ayudar a eliminar toxinas y mantener una adecuada funci�n renal. EJERCICIO: Se sugiere     " +
                                                  "\n actividad f�sica moderada, como caminatas de 30 a 45 minutos al d�a, evitando esfuerzos excesivos mientras         " +
                                                  "\n persistan los s�ntomas. POSIBLE TRATAMIENTO: El tratamiento para la gonorrea en adultos suele incluir antibi�ticos " +
                                                  "\n como la ceftriaxona y la azitromicina, los cuales ayudan a eliminar la bacteria responsable de la infecci�n.       " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer " +
                                                  "\n el sistema inmunol�gico, como ajo, que posee propiedades antimicrobianas naturales; espinacas (100 g) ricas en     " +
                                                  "\n hierro (2.7 mg, 15% de la ingesta diaria recomendada) y vitamina C (79 mg, 20% de la ingesta diaria recomendada),  " +
                                                  "\n esenciales para la recuperaci�n; jengibre, con efectos antiinflamatorios y antibacterianos; y c�tricos como naranjas" +
                                                  "\n (1 unidad, 130 g) que aportan 70 mg de vitamina C (78% de la ingesta diaria recomendada) y ayudan a reforzar las    " +
                                                  "\n defensas del organismo. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%  " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se    " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su  " +
                                                  "\n paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar" +
                                                  "\n a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos    " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la inflamaci�n. Tambi�n se pueden " +
                                                  "\n incluir infusiones de hierbas con propiedades antivirales y caldos claros para reforzar la hidrataci�n.        " +
                                                  "\n EJERCICIO: Se sugiere actividad f�sica moderada, evitando el sobreesfuerzo y el estr�s, ya que estos pueden    " +
                                                  "\n desencadenar brotes recurrentes. Se recomienda ejercicios de relajaci�n y caminatas suaves de 30 minutos al d�a." +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para el herpes genital en adultos suele incluir antivirales como aciclovir, " +
                                                  "\n valaciclovir y famciclovir, los cuales ayudan a reducir la duraci�n y gravedad de los brotes. ALIMENTACI�N: Se  " +
                                                  "\n recomienda el consumo de alimentos ricos en lisina, un amino�cido que puede ayudar a reducir la frecuencia de   " +
                                                  "\n los brotes, como yogur, que aporta prote�nas y probi�ticos beneficiosos; pescado, rico en �cidos grasos Omega-3 " +
                                                  "\n con propiedades antiinflamatorias; frutos secos como almendras (28 g, aproximadamente 23 unidades) que contienen" +
                                                  "\n 7.3 mg de vitamina E (49% de la ingesta diaria recomendada) y antioxidantes; y vegetales de hoja verde como     " +
                                                  "\n espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta diaria recomendada) y 79 mg de magnesio (20% de la    " +
                                                  "\n ingesta diaria recomendada), esenciales para la regeneraci�n celular. Este es solo un Diagn�stico predeterminado" +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad" +
                                                  "\n y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no" +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app   " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o regular)     " +
                                                  "\n para mantener una adecuada hidrataci�n y ayudar a reducir la fiebre y la inflamaci�n. Tambi�n se recomienda el     " +
                                                  "\n consumo de caldos claros y bebidas con electrolitos para evitar la deshidrataci�n. EJERCICIO: Se sugiere actividad " +
                                                  "\n f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. En caso de fiebre, se recomienda    " +
                                                  "\n reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: El tratamiento para  " +
                                                  "\n la s�filis en adultos suele incluir antibi�ticos como la penicilina G benzatina, la ceftriaxona y la doxiciclina,  " +
                                                  "\n los cuales ayudan a eliminar la bacteria Treponema pallidum. ALIMENTACI�N: Se recomienda el consumo de alimentos   " +
                                                  "\n ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, como frutos rojos (100 g)  " +
                                                  "\n ricos en antioxidantes y vitamina C, que ayudan a reducir el estr�s oxidativo con 59 mg de vitamina C (98% de la   " +
                                                  "\n ingesta diaria recomendada); espinacas (100 g) con alto contenido de hierro (2.7 mg, 15% de la ingesta diaria      " +
                                                  "\n recomendada) y magnesio (79 mg, 20% de la ingesta diaria recomendada); aguacate, que aporta grasas saludables y    " +
                                                  "\n vitamina E, clave para la protecci�n celular; y almendras (28 g, aproximadamente 23 unidades) que contienen        " +
                                                  "\n vitamina E (7.3 mg, 49% de la ingesta diaria recomendada) y �cidos grasos saludables, beneficiosos para la salud   " +
                                                  "\n celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente" +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer  " +
                                                  "\n m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s " +
                                                  "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico," +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 3 a 3.5 litros de agua (entre 12 y 14 vasos      " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a fluidificar las secreciones pulmonares,     " +
                                                  "\n facilitando la respiraci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del       " +
                                                  "\n paciente, evitando esfuerzos excesivos. Se recomienda caminatas suaves de 20 a 30 minutos al d�a, siempre        " +
                                                  "\n que no haya dificultad respiratoria, y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n.           " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis en adultos suele incluir antibi�ticos como la isoniazida," +
                                                  "\n rifampicina y etambutol, los cuales ayudan a eliminar la bacteria Mycobacterium tuberculosis. ALIMENTACI�N:      " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema  " +
                                                  "\n inmunol�gico y reducir la inflamaci�n pulmonar, como zanahorias (100 g) que contienen aproximadamente 334% de la " +
                                                  "\n ingesta diaria recomendada de vitamina A, 2.8 g de fibra y antioxidantes beta-carotenos; naranjas (1 unidad, 130 g)  " +
                                                  "\n con 70 mg de vitamina C (78% de la ingesta diaria recomendada), 3 g de fibra y 237 mg de potasio; espinacas (100 g)  " +
                                                  "\n con 2.7 mg de hierro (15% de la ingesta diaria recomendada), 79 mg de magnesio (20% de la ingesta diaria recomendada)" +
                                                  "\n y 483 mcg de vitamina K (402% de la ingesta diaria recomendada); y almendras (28 g, aproximadamente 23 unidades) que " +
                                                  "\n aportan vitamina E (7.3 mg, 49% de la ingesta diaria recomendada), magnesio (76 mg, 18% de la ingesta diaria recomendada)" +
                                                  "\n y fibra (3.5 g). Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el       " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda     " +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente,        " +
                                                  "\n adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su       " +
                                                  "\n m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos         " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la inflamaci�n en las articulaciones.  " +
                                                  "\n Tambi�n se pueden incluir infusiones de hierbas con propiedades antiinflamatorias y caldos claros para reforzar la  " +
                                                  "\n hidrataci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente, evitando      " +
                                                  "\n movimientos bruscos. Se recomienda ejercicios de bajo impacto como nataci�n, yoga o caminatas suaves de 30 minutos  " +
                                                  "\n al d�a. POSIBLE TRATAMIENTO: El tratamiento para la artritis en adultos suele incluir antiinflamatorios no esteroides    " +
                                                  "\n como el ibuprofeno y el naproxeno, as� como f�rmacos antirreum�ticos modificadores de la enfermedad como el metotrexato. " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antiinflamatorias y antioxidantes, como pescado      " +
                                                  "\n graso, que aporta �cidos grasos Omega-3, beneficiosos para la salud articular; c�rcuma, con curcumina, que posee         " +
                                                  "\n propiedades antiinflamatorias; frutos secos como almendras (28 g, aproximadamente 23 unidades) que contienen 7.3 mg      " +
                                                  "\n de vitamina E (49% de la ingesta diaria recomendada) y antioxidantes; y vegetales de hoja verde como espinacas (100 g)   " +
                                                  "\n con 2.7 mg de hierro (15% de la ingesta diaria recomendada) y 79 mg de magnesio (20% de la ingesta diaria recomendada),  " +
                                                  "\n esenciales para la regeneraci�n celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no        " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas,    " +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado" +
                                                  "\n de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho      " +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos   " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la inflamaci�n en las v�as       " +
                                                  "\n respiratorias. Tambi�n se recomienda el consumo de caldos claros y bebidas con electrolitos para evitar la    " +
                                                  "\n deshidrataci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente,      " +
                                                  "\n evitando esfuerzos excesivos. Se recomienda ejercicios de respiraci�n profunda y caminatas suaves de 20 a     " +
                                                  "\n 30 minutos al d�a. POSIBLE TRATAMIENTO: El tratamiento para la tosferina en adultos suele incluir antibi�ticos" +
                                                  "\n como la azitromicina, claritromicina y eritromicina, los cuales ayudan a eliminar la bacteria Bordetella      " +
                                                  "\n pertussis. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales " +
                                                  "\n para fortalecer el sistema inmunol�gico y reducir la inflamaci�n pulmonar, como zanahorias (100 g) que contienen     " +
                                                  "\n aproximadamente 334% de la ingesta diaria recomendada de vitamina A, 2.8 g de fibra y antioxidantes beta-carotenos;  " +
                                                  "\n naranjas (1 unidad, 130 g) con 70 mg de vitamina C (78% de la ingesta diaria recomendada), 3 g de fibra y 237 mg     " +
                                                  "\n de potasio; espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta diaria recomendada), 79 mg de magnesio (20%    " +
                                                  "\n de la ingesta diaria recomendada) y 483 mcg de vitamina K (402% de la ingesta diaria recomendada); y almendras       " +
                                                  "\n (28 g, aproximadamente 23 unidades) que aportan vitamina E (7.3 mg, 49% de la ingesta diaria recomendada), magnesio  " +
                                                  "\n (76 mg, 18% de la ingesta diaria recomendada) y fibra (3.5 g). Este es solo un Diagn�stico predeterminado l�gico,    " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus      " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor     " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le       " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida)" +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos   " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la fiebre y la inflamaci�n.      " +
                                                  "\n Tambi�n se recomienda el consumo de caldos claros y bebidas con electrolitos para evitar la deshidrataci�n.   " +
                                                  "\n EJERCICIO: Se sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas.   " +
                                                  "\n En caso de fiebre, se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n.        " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para las paperas, pero se pueden aliviar los s�ntomas   " +
                                                  "\n con analg�sicos y antipir�ticos como el paracetamol y el ibuprofeno. Tambi�n se recomienda el uso de compresas   " +
                                                  "\n fr�as en la zona inflamada para reducir el dolor. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en   " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, como naranjas (1 unidad, 130 g)   " +
                                                  "\n que contienen 70 mg de vitamina C (78% de la ingesta diaria recomendada), 3 g de fibra y 237 mg de potasio;      " +
                                                  "\n fresas (100 g) con 59 mg de vitamina C (98% de la ingesta diaria recomendada), 2 g de fibra y antioxidantes      " +
                                                  "\n flavonoides y polifenoles; espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta diaria recomendada), 79 mg  " +
                                                  "\n de magnesio (20% de la ingesta diaria recomendada) y 483 mcg de vitamina K (402% de la ingesta diaria recomendada);      " +
                                                  "\n y almendras (28 g, aproximadamente 23 unidades) que aportan vitamina E (7.3 mg, 49% de la ingesta diaria recomendada),   " +
                                                  "\n magnesio (76 mg, 18% de la ingesta diaria recomendada) y fibra (3.5 g). Este es solo un Diagn�stico predeterminado       " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y      " +
                                                  "\n sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor     " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface " +
                                                  "\n del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 3 a 3.5 litros de agua (entre 12 y 14 vasos de    " +
                                                  "\n tama�o regular) para prevenir la deshidrataci�n causada por la fiebre y ayudar a aliviar los s�ntomas. Tambi�n    " +
                                                  "\n se pueden incluir infusiones de hierbas con propiedades antiinflamatorias y caldos claros para mantener el        " +
                                                  "\n equilibrio de electrolitos. EJERCICIO: Se sugiere actividad f�sica moderada, evitando el sobreesfuerzo y el       " +
                                                  "\n estr�s, ya que estos pueden agravar los s�ntomas. En caso de fiebre, se recomienda reposo y ejercicios de         " +
                                                  "\n estiramiento suaves para evitar la fatiga muscular. POSIBLE TRATAMIENTO: No existen medicamentos espec�ficos      " +
                                                  "\n para tratar el zika, pero se pueden aliviar los s�ntomas con reposo, hidrataci�n y analg�sicos como el acetaminof�n    " +
                                                  "\n para reducir la fiebre y el dolor. Se recomienda evitar el uso de aspirina y otros antiinflamatorios no esteroides     " +
                                                  "\n hasta descartar la posibilidad de dengue. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes   " +
                                                  "\n y nutrientes esenciales para fortalecer el sistema inmunol�gico, como frutos rojos (100 g) ricos en antioxidantes y    " +
                                                  "\n vitamina C, que ayudan a reducir el estr�s oxidativo con 59 mg de vitamina C (98% de la ingesta diaria recomendada);   " +
                                                  "\n espinacas (100 g) con alto contenido de hierro (2.7 mg, 15% de la ingesta diaria recomendada) y magnesio (79 mg, 20%   " +
                                                  "\n de la ingesta diaria recomendada); aguacate, que aporta grasas saludables y vitamina E, clave para la protecci�n       " +
                                                  "\n celular; y almendras (28 g, aproximadamente 23 unidades) que contienen vitamina E (7.3 mg, 49% de la ingesta diaria    " +
                                                  "\n recomendada) y �cidos grasos saludables, beneficiosos para la salud celular. Este es solo un Diagn�stico predeterminado  " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus  " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad" +
                                                  "\n en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se" +
                                                  "\n le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 3 a 3.5 litros de agua (entre 12 y 14 vasos de tama�o regular)      " +
                                                  "\n para prevenir la deshidrataci�n causada por la diarrea y la fiebre. Tambi�n se recomienda el consumo de soluciones  " +
                                                  "\n de rehidrataci�n oral como Pedialyte para reponer los minerales perdidos. EJERCICIO: Se sugiere actividad f�sica    " +
                                                  "\n moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. En caso de fiebre y diarrea, se recomienda  " +
                                                  "\n reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: No existe un          " +
                                                  "\n tratamiento espec�fico para la infecci�n por rotavirus, pero se recomienda el consumo de l�quidos de rehidrataci�n  " +
                                                  "\n oral y en casos graves, la administraci�n de l�quidos intravenosos. ALIMENTACI�N: Se recomienda el consumo de       " +
                                                  "\n alimentos blandos y f�ciles de digerir, como pl�tanos (100 g) que contienen potasio (358 mg, 10% de la ingesta      " +
                                                  "\n diaria recomendada), �til para mantener el equilibrio de electrolitos; arroz, que ayuda a reducir la diarrea;       " +
                                                  "\n zanahorias (100 g) con 334% de la ingesta diaria recomendada de vitamina A, 2.8 g de fibra y antioxidantes          " +
                                                  "\n beta-carotenos; y yogur, que aporta probi�ticos beneficiosos para la recuperaci�n. Este es solo un Diagn�stico      " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por       " +
                                                  "\n ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del  " +
                                                  "\n Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece          " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis). " +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de    " +
                                                  "\n tama�o regular) para mantener una adecuada hidrataci�n y ayudar al cuerpo a combatir la infecci�n. En casos de    " +
                                                  "\n fiebre, se recomienda aumentar la ingesta de l�quidos y consumir caldos claros para evitar la deshidrataci�n.     " +
                                                  "\n EJERCICIO: Se sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas.    " +
                                                  "\n En casos graves, se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n.           " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la listeriosis en adultos suele incluir antibi�ticos como la ampicilina  " +
                                                  "\n y la gentamicina, los cuales ayudan a eliminar la bacteria Listeria monocytogenes. ALIMENTACI�N: Se recomienda el " +
                                                  "\n consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, como " +
                                                  "\n ajo, que posee propiedades antimicrobianas naturales; espinacas (100 g) ricas en hierro (2.7 mg, 15% de la ingesta" +
                                                  "\n diaria recomendada) y vitamina C (79 mg, 20% de la ingesta diaria recomendada), esenciales para la recuperaci�n;  " +
                                                  "\n jengibre, con efectos antiinflamatorios y antibacterianos; y c�tricos como naranjas (1 unidad, 130 g) que aportan " +
                                                  "\n 70 mg de vitamina C (78% de la ingesta diaria recomendada) y ayudan a reforzar las defensas del organismo. Este es" +
                                                  "\n solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa      " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su   " +
                                                  "\n salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel" +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                                                  
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 3 a 3.5 litros de agua (entre 12 y 14 vasos     " +
                                                  "\n de tama�o regular) para prevenir la deshidrataci�n causada por la diarrea y la fiebre. Tambi�n se recomienda    " +
                                                  "\n el consumo de soluciones de rehidrataci�n oral para reponer los minerales perdidos. EJERCICIO: Se sugiere       " +
                                                  "\n actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. En caso de fiebre y    " +
                                                  "\n diarrea, se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: " +
                                                  "\n El tratamiento para la shigelosis en adultos suele incluir antibi�ticos como la ciprofloxacina, la azitromicina      " +
                                                  "\n y la ceftriaxona. Algunas marcas reconocidas de ciprofloxacina incluyen Ciprobay y Ciproflox; de azitromicina,       " +
                                                  "\n Zitromax y Azitrocin; y de ceftriaxona, Rocephin y Cefaxone. ALIMENTACI�N: Se recomienda el consumo de alimentos     " +
                                                  "\n blandos y f�ciles de digerir, como pl�tanos (100 g) que contienen potasio (358 mg, 10% de la ingesta diaria          " +
                                                  "\n recomendada), �til para mantener el equilibrio de electrolitos; arroz, que ayuda a reducir la diarrea; zanahorias    " +
                                                  "\n (100 g) con 334% de la ingesta diaria recomendada de vitamina A, 2.8 g de fibra y antioxidantes beta-carotenos; y    " +
                                                  "\n yogur, que aporta probi�ticos beneficiosos para la recuperaci�n. Este es solo un Diagn�stico predeterminado l�gico,  " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus      " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor     " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface " +
                                                  "\n del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y        " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos     " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a fluidificar las secreciones pulmonares,    " +
                                                  "\n facilitando la respiraci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del      " +
                                                  "\n paciente, evitando esfuerzos excesivos. Se recomienda caminatas suaves de 20 a 30 minutos al d�a, siempre que   " +
                                                  "\n no haya dificultad respiratoria, y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE      " +
                                                  "\n TRATAMIENTO: El tratamiento para la EPOC en adultos suele incluir broncodilatadores como el salbutamol y        " +
                                                  "\n corticosteroides inhalados como la fluticasona. Algunas marcas reconocidas de salbutamol incluyen Ventolin      " +
                                                  "\n y Aerolin; de fluticasona, Flixotide y Pulmicort. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos     " +
                                                  "\n en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico y reducir la inflamaci�n pulmonar," +
                                                  "\n como zanahorias (100 g) que contienen aproximadamente 334% de la ingesta diaria recomendada de vitamina A, 2.8 g   " +
                                                  "\n de fibra y antioxidantes beta-carotenos; naranjas (1 unidad, 130 g) con 70 mg de vitamina C (78% de la ingesta     " +
                                                  "\n diaria recomendada), 3 g de fibra y 237 mg de potasio; espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta   " +
                                                  "\n diaria recomendada), 79 mg de magnesio (20% de la ingesta diaria recomendada) y 483 mcg de vitamina K (402% de la  " +
                                                  "\n ingesta diaria recomendada); y almendras (28 g, aproximadamente 23 unidades) que aportan vitamina E (7.3 mg, 49%   " +
                                                  "\n de la ingesta diaria recomendada), magnesio (76 mg, 18% de la ingesta diaria recomendada) y fibra (3.5 g). Este es " +
                                                  "\n solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad" +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico     " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la        " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o     " +
                                                  "\n regular) para mantener una adecuada hidrataci�n y ayudar al cuerpo a eliminar la infecci�n. Adem�s, se pueden incluir     " +
                                                  "\n infusiones de hierbas con propiedades antimicrobianas y caldos claros para reforzar la hidrataci�n. EJERCICIO: Se sugiere " +
                                                  "\n actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. Se recomienda caminatas suaves   " +
                                                  "\n de 30 minutos al d�a y ejercicios de movilidad para mejorar la circulaci�n y el bienestar general. POSIBLE TRATAMIENTO:   " +
                                                  "\n El tratamiento para la clamidia en adultos suele incluir antibi�ticos como la azitromicina y la doxiciclina. Algunas marcas   " +
                                                  "\n reconocidas de azitromicina incluyen Zitromax y Azitrocin; de doxiciclina, Vibramicina y Doxipar. ALIMENTACI�N: Se recomienda " +
                                                  "\n el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, como ajo, que " +
                                                  "\n posee propiedades antimicrobianas naturales; espinacas (100 g) ricas en hierro (2.7 mg, 15% de la ingesta diaria recomendada) " +
                                                  "\n y vitamina C (79 mg, 20% de la ingesta diaria recomendada), esenciales para la recuperaci�n; jengibre, con efectos            " +
                                                  "\n antiinflamatorios y antibacterianos; y c�tricos como naranjas (1 unidad, 130 g) que aportan 70 mg de vitamina C (78% de la ingesta " +
                                                  "\n diaria recomendada) y ayudan a reforzar las defensas del organismo. Este es solo un Diagn�stico predeterminado l�gico, haberlo     " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n           " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento        " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho       " +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de    " +
                                                  "\n tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la fiebre y la inflamaci�n. Tambi�n     " +
                                                  "\n se recomienda el consumo de caldos claros y bebidas con electrolitos para evitar la deshidrataci�n. EJERCICIO:    " +
                                                  "\n Se sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. En caso de    " +
                                                  "\n fiebre, se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE TRATAMIENTO:   " +
                                                  "\n El tratamiento para la meningitis bacteriana en adultos suele incluir antibi�ticos administrados por v�a intravenosa, " +
                                                  "\n como la ceftriaxona y la ampicilina. Algunas marcas reconocidas de ceftriaxona incluyen Rocephin y Cefaxone; de       " +
                                                  "\n ampicilina, Ampicil y Principen. Tambi�n se pueden recetar corticoides para reducir la inflamaci�n cerebral y         " +
                                                  "\n medicamentos para controlar las convulsiones en casos graves. ALIMENTACI�N: Se recomienda el consumo de alimentos     " +
                                                  "\n ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, como frutos rojos (100 g)     " +
                                                  "\n ricos en antioxidantes y vitamina C, que ayudan a reducir el estr�s oxidativo con 59 mg de vitamina C (98% de la      " +
                                                  "\n ingesta diaria recomendada); espinacas (100 g) con alto contenido de hierro (2.7 mg, 15% de la ingesta diaria recomendada)  " +
                                                  "\n y magnesio (79 mg, 20% de la ingesta diaria recomendada); aguacate, que aporta grasas saludables y vitamina E, clave para   " +
                                                  "\n la protecci�n celular; y almendras (28 g, aproximadamente 23 unidades) que contienen vitamina E (7.3 mg, 49% de la ingesta  " +
                                                  "\n diaria recomendada) y �cidos grasos saludables, beneficiosos para la salud celular. Este es solo un Diagn�stico             " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la       " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface " +
                                                  "\n del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o regular)  " +
                                                  "\n para mantener una adecuada hidrataci�n y ayudar al cuerpo a eliminar toxinas. Tambi�n se recomienda el consumo de infusiones    " +
                                                  "\n antioxidantes y caldos ricos en minerales para reforzar la hidrataci�n. EJERCICIO: Se sugiere actividad f�sica moderada,        " +
                                                  "\n adaptada a la condici�n del paciente, como caminatas suaves de 30 minutos al d�a y ejercicios de respiraci�n profunda para      " +
                                                  "\n mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: El tratamiento para el c�ncer en adultos depende del tipo y estadio de la          " +
                                                  "\n enfermedad, pero puede incluir cirug�a, quimioterapia con medicamentos como el paclitaxel y el cisplatino, radioterapia y       " +
                                                  "\n terapias dirigidas. Algunas marcas reconocidas de paclitaxel incluyen Taxol y Abraxane; de cisplatino, Platinol y Cisplat.      " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema   " +
                                                  "\n inmunol�gico y reducir la inflamaci�n celular, como zanahorias (100 g) que contienen aproximadamente 334% de la ingesta diaria  " +
                                                  "\n recomendada de vitamina A, 2.8 g de fibra y antioxidantes beta-carotenos; naranjas (1 unidad, 130 g) con 70 mg de vitamina C    " +
                                                  "\n (78% de la ingesta diaria recomendada), 3 g de fibra y 237 mg de potasio; espinacas (100 g) con 2.7 mg de hierro (15% de la     " +
                                                  "\n ingesta diaria recomendada), 79 mg de magnesio (20% de la ingesta diaria recomendada) y 483 mcg de vitamina K (402% de la       " +
                                                  "\n ingesta diaria recomendada); y almendras (28 g, aproximadamente 23 unidades) que aportan vitamina E (7.3 mg, 49% de la ingesta  " +
                                                  "\n diaria recomendada), magnesio (76 mg, 18% de la ingesta diaria recomendada) y fibra (3.5 g). Este es solo un Diagn�stico        " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad" +
                                                  "\n y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad" +
                                                  "\n en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le   " +
                                                  "\n recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        if(EstaturaMasculino.equals("1.45-1.60 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos    " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la fiebre y la inflamaci�n.       " +
                                                  "\n Tambi�n se recomienda el consumo de caldos claros y bebidas con electrolitos para evitar la deshidrataci�n.    " +
                                                  "\n EJERCICIO: Se recomienda reposo mientras persista la fiebre, evitando actividades de esfuerzo intenso.         " +
                                                  "\n Una vez que los s�ntomas comiencen a mejorar, se pueden realizar caminatas suaves de 15 a 30 minutos al d�a    " +
                                                  "\n para ayudar en la recuperaci�n sin comprometer el sistema respiratorio. POSIBLE TRATAMIENTO: Se pueden utilizar  " +
                                                  "\n antivirales como oseltamivir, baloxavir y zanamivir para reducir la duraci�n y gravedad de la infecci�n. Algunas " +
                                                  "\n marcas reconocidas de oseltamivir incluyen Tamiflu y Antiflu; de baloxavir, Xofluza; y de zanamivir, Relenza.    " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de frutas y verduras ricas en vitaminas y antioxidantes para fortalecer   " +
                                                  "\n el sistema inmunol�gico, como naranjas (1 unidad, 130 g) que contienen 70 mg de vitamina C (78% de la ingesta    " +
                                                  "\n diaria recomendada), 3 g de fibra y 237 mg de potasio; fresas (100 g) con 59 mg de vitamina C (98% de la ingesta " +
                                                  "\n diaria recomendada), 2 g de fibra y antioxidantes flavonoides y polifenoles; pl�tanos (100 g) ricos en potasio   " +
                                                  "\n (358 mg, 10% de la ingesta diaria recomendada), �til para mantener el equilibrio de electrolitos; y kiwi (100 g) " +
                                                  "\n con 92 mg de vitamina C (153% de la ingesta diaria recomendada), 40 mcg de vitamina K (33% de la ingesta diaria  " +
                                                  "\n recomendada) y 312 mg de potasio. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no       " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n       " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el  " +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del     " +
                                                  "\n todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de         " +
                                                  "\n tama�o regular) para mantener la hidrataci�n y facilitar la expulsi�n de secreciones bronquiales. Se sugiere    " +
                                                  "\n tambi�n infusiones de hierbas, caldos de pollo y jugos naturales sin az�car para reforzar la hidrataci�n.       " +
                                                  "\n EJERCICIO: Se aconsejan ejercicios de respiraci�n profunda y t�cnicas de expansi�n pulmonar para mejorar la     " +
                                                  "\n capacidad respiratoria. Caminatas suaves de 10 a 20 minutos pueden ser beneficiosas si no hay fatiga excesiva.  " +
                                                  "\n POSIBLE TRATAMIENTO: En el caso de neumon�a bacteriana, el tratamiento suele incluir antibi�ticos como amoxicilina,  " +
                                                  "\n azitromicina y ceftriaxona. Algunas marcas reconocidas de amoxicilina incluyen Amoxil y Trimox; de azitromicina,     " +
                                                  "\n Zitromax y Azitrocin; y de ceftriaxona, Rocephin y Cefaxone. ALIMENTACI�N: Se recomienda el consumo de alimentos     " +
                                                  "\n ricos en vitaminas y antioxidantes para fortalecer el sistema inmunol�gico y reducir la inflamaci�n pulmonar, como   " +
                                                  "\n zanahorias (100 g) que contienen aproximadamente 334% de la ingesta diaria recomendada de vitamina A, 2.8 g de fibra " +
                                                  "\n y antioxidantes beta-carotenos; naranjas (1 unidad, 130 g) con 70 mg de vitamina C (78% de la ingesta diaria         " +
                                                  "\n recomendada), 3 g de fibra y 237 mg de potasio; espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta diaria     " +
                                                  "\n recomendada), 79 mg de magnesio (20% de la ingesta diaria recomendada) y 483 mcg de vitamina K (402% de la ingesta   " +
                                                  "\n diaria recomendada); y almendras (28 g, aproximadamente 23 unidades) que aportan vitamina E (7.3 mg, 49% de la ingesta" +
                                                  "\n diaria recomendada), magnesio (76 mg, 18% de la ingesta diaria recomendada) y fibra (3.5 g). Este es solo un          " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad       " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico    " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la       " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o  " +
                                                  "\n regular) para mantener un adecuado nivel de hidrataci�n y ayudar a regular los niveles de glucosa en sangre.    " +
                                                  "\n Se sugiere tambi�n el consumo de agua con lim�n, infusiones sin az�car y jugos naturales con bajo �ndice        " +
                                                  "\n gluc�mico. EJERCICIO: Se recomienda realizar actividad f�sica moderada como caminatas de 30 a 45 minutos al d�a," +
                                                  "\n entrenamiento de resistencia y ejercicios aer�bicos, que contribuyen a mejorar la sensibilidad a la insulina.   " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento suele incluir medicamentos como metformina, que ayuda a reducir la producci�n " +
                                                  "\n de glucosa en el h�gado, y en algunos casos, insulina para controlar los niveles elevados. Algunas marcas         " +
                                                  "\n reconocidas de metformina incluyen Glucophage y Dianben; de insulina, Lantus y Humalog. Tambi�n es importante     " +
                                                  "\n un monitoreo constante de la glucosa en sangre y ajustes en la dieta. ALIMENTACI�N: Se recomienda el consumo de   " +
                                                  "\n alimentos ricos en fibra y bajos en carbohidratos refinados para estabilizar los niveles de glucosa, como avena   " +
                                                  "\n (100 g) que aporta 4 g de fibra, 138 mg de magnesio (33% de la ingesta diaria recomendada) y 2.3 mg de zinc (21%  " +
                                                  "\n de la ingesta diaria recomendada); almendras (28 g, aproximadamente 23 unidades) con 7.3 mg de vitamina E (49%    " +
                                                  "\n de la ingesta diaria recomendada), 76 mg de magnesio (18% de la ingesta diaria recomendada) y 3.5 g de fibra;     " +
                                                  "\n espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta diaria recomendada), 79 mg de magnesio (20% de la       " +
                                                  "\n ingesta diaria recomendada) y 483 mcg de vitamina K (402% de la ingesta diaria recomendada); fresas (100 g) con   " +
                                                  "\n 59 mg de vitamina C (98% de la ingesta diaria recomendada), 2 g de fibra y antioxidantes flavonoides y polifenoles." +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga   " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s    " +
                                                  "\n de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s     " +
                                                  "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su        " +
                                                  "\n m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o  " +
                                                  "\n regular) para mantener las v�as respiratorias hidratadas y reducir la viscosidad del moco, facilitando la respiraci�n. " +
                                                  "\n Tambi�n se pueden incluir infusiones de hierbas con propiedades antiinflamatorias y caldos claros para reforzar la     " +
                                                  "\n hidrataci�n. EJERCICIO: La actividad f�sica debe ser controlada y adaptada a la condici�n del paciente, evitando       " +
                                                  "\n desencadenantes como el aire fr�o o la contaminaci�n. Se recomienda ejercicios de respiraci�n profunda y caminatas     " +
                                                  "\n suaves de 30 minutos al d�a. POSIBLE TRATAMIENTO: El tratamiento para el asma en adultos suele incluir broncodilatadores" +
                                                  "\n de alivio r�pido, como el salbutamol y corticosteroides inhalados como la fluticasona. Algunas marcas reconocidas de    " +
                                                  "\n salbutamol incluyen Ventolin y Aerolin; de fluticasona, Flixotide y Pulmicort. ALIMENTACI�N: Se recomienda el consumo   " +
                                                  "\n de alimentos con propiedades antiinflamatorias y antioxidantes, como pescado graso, que aporta �cidos grasos Omega-3,   " +
                                                  "\n beneficiosos para la salud pulmonar; zanahorias (100 g) que contienen 334% de la ingesta diaria recomendada de vitamina A, " +
                                                  "\n 2.8 g de fibra y antioxidantes beta-carotenos; c�rcuma, con curcumina, que posee propiedades antiinflamatorias; y kiwi     " +
                                                  "\n (100 g) con 92 mg de vitamina C (153% de la ingesta diaria recomendada), 40 mcg de vitamina K (33% de la ingesta diaria    " +
                                                  "\n recomendada) y 312 mg de potasio. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al    " +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se      " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente," +
                                                  "\n adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico,  " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o  " +
                                                  "\n regular) para mantener una adecuada hidrataci�n y apoyar la funci�n renal, especialmente en pacientes que toman        " +
                                                  "\n medicamentos antirretrovirales. EJERCICIO: Se sugiere realizar actividad f�sica moderada, como caminatas de 30 a 45    " +
                                                  "\n minutos al d�a y ejercicios de resistencia, lo que contribuye a fortalecer el sistema inmunol�gico y mejorar la calidad " +
                                                  "\n de vida. POSIBLE TRATAMIENTO: El tratamiento para el VIH/SIDA consiste en la terapia antirretroviral (TAR), que incluye " +
                                                  "\n combinaciones de medicamentos como el tenofovir, emtricitabina, dolutegravir y efavirenz. Algunas marcas reconocidas de " +
                                                  "\n tenofovir incluyen Viread y Tenofovir Disoproxil; de emtricitabina, Emtriva y Truvada; de dolutegravir, Tivicay y Dovato;" +
                                                  "\n de efavirenz, Sustiva y Atripla. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico, como aguacate, que aporta grasas saludables y vitamina E, clave para " +
                                                  "\n la protecci�n celular; frutos rojos (100 g) ricos en antioxidantes y vitamina C, que ayudan a reducir el estr�s oxidativo" +
                                                  "\n con 59 mg de vitamina C (98% de la ingesta diaria recomendada); espinacas (100 g) con alto contenido de hierro (2.7 mg,  " +
                                                  "\n 15% de la ingesta diaria recomendada) y magnesio (79 mg, 20% de la ingesta diaria recomendada); y almendras (28 g,       " +
                                                  "\n aproximadamente 23 unidades) que contienen vitamina E (7.3 mg, 49% de la ingesta diaria recomendada) y �cidos grasos     " +
                                                  "\n saludables, beneficiosos para la salud celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado    " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, " +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado" +
                                                  "\n de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho      " +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de     " +
                                                  "\n tama�o regular) para ayudar a eliminar toxinas y mantener una adecuada funci�n renal. EJERCICIO: Se sugiere        " +
                                                  "\n actividad f�sica moderada, como caminatas de 30 a 45 minutos al d�a, evitando esfuerzos excesivos mientras         " +
                                                  "\n persistan los s�ntomas. POSIBLE TRATAMIENTO: El tratamiento para la gonorrea en adultos suele incluir antibi�ticos " +
                                                  "\n como la ceftriaxona y la azitromicina. Algunas marcas reconocidas de ceftriaxona incluyen Rocephin y Cefaxone; de  " +
                                                  "\n azitromicina, Zitromax y Azitrocin. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y   " +
                                                  "\n nutrientes esenciales para fortalecer el sistema inmunol�gico, como ajo, que posee propiedades antimicrobianas     " +
                                                  "\n naturales; espinacas (100 g) ricas en hierro (2.7 mg, 15% de la ingesta diaria recomendada) y vitamina C (79 mg,   " +
                                                  "\n 20% de la ingesta diaria recomendada), esenciales para la recuperaci�n; jengibre, con efectos antiinflamatorios y  " +
                                                  "\n antibacterianos; y c�tricos como naranjas (1 unidad, 130 g) que aportan 70 mg de vitamina C (78% de la ingesta     " +
                                                  "\n diaria recomendada) y ayudan a reforzar las defensas del organismo. Este es solo un Diagn�stico predeterminado     " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad  " +
                                                  "\n y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer   " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no  " +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app     " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de        " +
                                                  "\n tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la inflamaci�n. Tambi�n se pueden incluir   " +
                                                  "\n infusiones de hierbas con propiedades antivirales y caldos claros para reforzar la hidrataci�n. EJERCICIO: Se sugiere " +
                                                  "\n actividad f�sica moderada, evitando el sobreesfuerzo y el estr�s, ya que estos pueden desencadenar brotes recurrentes." +
                                                  "\n Se recomienda ejercicios de relajaci�n y caminatas suaves de 30 minutos al d�a. POSIBLE TRATAMIENTO: El tratamiento   " +
                                                  "\n para el herpes genital en adultos suele incluir antivirales como aciclovir, famciclovir y valaciclovir. Algunas marcas" +
                                                  "\n reconocidas de aciclovir incluyen Zovirax y Acivir; de famciclovir, Famvir y Famciclovir; de valaciclovir, Valtrex y  " +
                                                  "\n Valaciclovir. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en lisina, un amino�cido que puede ayudar a   " +
                                                  "\n reducir la frecuencia de los brotes, como yogur, que aporta prote�nas y probi�ticos beneficiosos; pescado, rico en       " +
                                                  "\n �cidos grasos Omega-3 con propiedades antiinflamatorias; frutos secos como almendras (28 g, aproximadamente 23 unidades) " +
                                                  "\n que contienen 7.3 mg de vitamina E (49% de la ingesta diaria recomendada) y antioxidantes; y vegetales de hoja verde como" +
                                                  "\n espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta diaria recomendada) y 79 mg de magnesio (20% de la ingesta     " +
                                                  "\n diaria recomendada), esenciales para la regeneraci�n celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho" +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o regular)    " +
                                                  "\n para mantener una adecuada hidrataci�n y ayudar a reducir la fiebre y la inflamaci�n. Tambi�n se recomienda el    " +
                                                  "\n consumo de caldos claros y bebidas con electrolitos para evitar la deshidrataci�n. EJERCICIO: Se sugiere actividad" +
                                                  "\n f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. En caso de fiebre, se recomienda   " +
                                                  "\n reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: El tratamiento para " +
                                                  "\n la s�filis en adultos suele incluir antibi�ticos como la penicilina G benzatina, la ceftriaxona y la doxiciclina. " +
                                                  "\n Algunas marcas reconocidas de penicilina G benzatina incluyen Benzetacil y Pfizerpen; de ceftriaxona, Rocephin y  " +
                                                  "\n Cefaxone; de doxiciclina, Vibramicina y Doxipar. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en     " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, como frutos rojos (100 g) ricos en " +
                                                  "\n antioxidantes y vitamina C, que ayudan a reducir el estr�s oxidativo con 59 mg de vitamina C (98% de la ingesta   " +
                                                  "\n diaria recomendada); espinacas (100 g) con alto contenido de hierro (2.7 mg, 15% de la ingesta diaria recomendada)" +
                                                  "\n y magnesio (79 mg, 20% de la ingesta diaria recomendada); aguacate, que aporta grasas saludables y vitamina E, clave" +
                                                  "\n para la protecci�n celular; y almendras (28 g, aproximadamente 23 unidades) que contienen vitamina E (7.3 mg, 49%   " +
                                                  "\n de la ingesta diaria recomendada) y �cidos grasos saludables, beneficiosos para la salud celular. Este es solo un   " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y   " +
                                                  "\n que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico    " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la     " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 3 a 3.5 litros de agua (entre 12 y 14 vasos   " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a fluidificar las secreciones pulmonares,  " +
                                                  "\n facilitando la respiraci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del    " +
                                                  "\n paciente, evitando esfuerzos excesivos. Se recomienda caminatas suaves de 20 a 30 minutos al d�a, siempre     " +
                                                  "\n que no haya dificultad respiratoria, y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n.        " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis en adultos suele incluir antibi�ticos como la        " +
                                                  "\n isoniazida, rifampicina y etambutol. Algunas marcas reconocidas de isoniazida incluyen Nydrazid y Laniazid;   " +
                                                  "\n de rifampicina, Rifadin y Rimactane; de etambutol, Myambutol y Etibi. ALIMENTACI�N: Se recomienda el consumo  " +
                                                  "\n de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico y reducir " +
                                                  "\n la inflamaci�n pulmonar, como zanahorias (100 g) que contienen aproximadamente 334% de la ingesta diaria      " +
                                                  "\n recomendada de vitamina A, 2.8 g de fibra y antioxidantes beta-carotenos; naranjas (1 unidad, 130 g) con 70 mg   " +
                                                  "\n de vitamina C (78% de la ingesta diaria recomendada), 3 g de fibra y 237 mg de potasio; espinacas (100 g) con    " +
                                                  "\n 2.7 mg de hierro (15% de la ingesta diaria recomendada), 79 mg de magnesio (20% de la ingesta diaria recomendada)" +
                                                  "\n y 483 mcg de vitamina K (402% de la ingesta diaria recomendada); y almendras (28 g, aproximadamente 23 unidades) " +
                                                  "\n que aportan vitamina E (7.3 mg, 49% de la ingesta diaria recomendada), magnesio (76 mg, 18% de la ingesta diaria " +
                                                  "\n recomendada) y fibra (3.5 g). Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para " +
                                                  "\n ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento      " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le      " +
                                                  "\n recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de    " +
                                                  "\n tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la inflamaci�n en las articulaciones.   " +
                                                  "\n Tambi�n se pueden incluir infusiones de hierbas con propiedades antiinflamatorias y caldos claros para reforzar   " +
                                                  "\n la hidrataci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente, evitando " +
                                                  "\n movimientos bruscos. Se recomienda ejercicios de bajo impacto como nataci�n, yoga o caminatas suaves de 30 minutos      " +
                                                  "\n al d�a. POSIBLE TRATAMIENTO: El tratamiento para la artritis en adultos suele incluir antiinflamatorios no esteroides   " +
                                                  "\n como el ibuprofeno y el naproxeno, as� como f�rmacos antirreum�ticos modificadores de la enfermedad como el metotrexato." +
                                                  "\n Algunas marcas reconocidas de ibuprofeno incluyen Advil y Motrin; de naproxeno, Aleve y Naprosyn; de metotrexato,       " +
                                                  "\n Trexall y Rheumatrex. ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antiinflamatorias y           " +
                                                  "\n antioxidantes, como pescado graso, que aporta �cidos grasos Omega-3, beneficiosos para la salud articular; c�rcuma,     " +
                                                  "\n con curcumina, que posee propiedades antiinflamatorias; frutos secos como almendras (28 g, aproximadamente 23 unidades) " +
                                                  "\n que contienen 7.3 mg de vitamina E (49% de la ingesta diaria recomendada) y antioxidantes; y vegetales de hoja verde    " +
                                                  "\n como espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta diaria recomendada) y 79 mg de magnesio (20% de la       " +
                                                  "\n ingesta diaria recomendada), esenciales para la regeneraci�n celular. Este es solo un Diagn�stico predeterminado        " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad       " +
                                                  "\n y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer        " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no       " +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app          " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de        " +
                                                  "\n tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la inflamaci�n en las v�as respiratorias.   " +
                                                  "\n Tambi�n se recomienda el consumo de caldos claros y bebidas con electrolitos para evitar la deshidrataci�n. EJERCICIO:" +
                                                  "\n La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente, evitando esfuerzos excesivos.           " +
                                                  "\n Se recomienda ejercicios de respiraci�n profunda y caminatas suaves de 20 a 30 minutos al d�a. POSIBLE TRATAMIENTO:   " +
                                                  "\n El tratamiento para la tosferina en adultos suele incluir antibi�ticos como la azitromicina, claritromicina y         " +
                                                  "\n eritromicina. Algunas marcas reconocidas de azitromicina incluyen Zitromax y Azitrocin; de claritromicina, Biaxin     " +
                                                  "\n y Claritromicina Genfar; de eritromicina, Erythrocin y Ilosone. ALIMENTACI�N: Se recomienda el consumo de alimentos   " +
                                                  "\n ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico y reducir la inflamaci�n       " +
                                                  "\n pulmonar, como zanahorias (100 g) que contienen aproximadamente 334% de la ingesta diaria recomendada de vitamina A,  " +
                                                  "\n 2.8 g de fibra y antioxidantes beta-carotenos; naranjas (1 unidad, 130 g) con 70 mg de vitamina C (78% de la ingesta    " +
                                                  "\n diaria recomendada), 3 g de fibra y 237 mg de potasio; espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta diaria " +
                                                  "\n recomendada), 79 mg de magnesio (20% de la ingesta diaria recomendada) y 483 mcg de vitamina K (402% de la ingesta      " +
                                                  "\n diaria recomendada); y almendras (28 g, aproximadamente 23 unidades) que aportan vitamina E (7.3 mg, 49% de la ingesta  " +
                                                  "\n diaria recomendada), magnesio (76 mg, 18% de la ingesta diaria recomendada) y fibra (3.5 g). Este es solo un Diagn�stico" +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la   " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para        " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico" +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app       " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de    " +
                                                  "\n tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la fiebre y la inflamaci�n. Tambi�n     " +
                                                  "\n se recomienda el consumo de caldos claros y bebidas con electrolitos para evitar la deshidrataci�n. EJERCICIO:    " +
                                                  "\n Se sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. En caso de    " +
                                                  "\n fiebre, se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: " +
                                                  "\n No existe un tratamiento espec�fico para las paperas, pero se pueden aliviar los s�ntomas con analg�sicos y         " +
                                                  "\n antipir�ticos como el paracetamol y el ibuprofeno. Algunas marcas reconocidas de paracetamol incluyen Tylenol y     " +
                                                  "\n Panadol; de ibuprofeno, Advil y Motrin. Tambi�n se recomienda el uso de compresas fr�as en la zona inflamada para   " +
                                                  "\n reducir el dolor. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales" +
                                                  "\n para fortalecer el sistema inmunol�gico, como naranjas (1 unidad, 130 g) que contienen 70 mg de vitamina C (78% de  " +
                                                  "\n la ingesta diaria recomendada), 3 g de fibra y 237 mg de potasio; fresas (100 g) con 59 mg de vitamina C (98% de la " +
                                                  "\n ingesta diaria recomendada), 2 g de fibra y antioxidantes flavonoides y polifenoles; espinacas (100 g) con 2.7 mg de" +
                                                  "\n hierro (15% de la ingesta diaria recomendada), 79 mg de magnesio (20% de la ingesta diaria recomendada) y 483 mcg de" +
                                                  "\n vitamina K (402% de la ingesta diaria recomendada); y almendras (28 g, aproximadamente 23 unidades) que aportan     " +
                                                  "\n vitamina E (7.3 mg, 49% de la ingesta diaria recomendada), magnesio (76 mg, 18% de la ingesta diaria recomendada)   " +
                                                  "\n y fibra (3.5 g). Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el  " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda" +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente,   " +
                                                  "\n adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su  " +
                                                  "\n m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 3 a 3.5 litros de agua (entre 12 y 14 vasos de    " +
                                                  "\n tama�o regular) para prevenir la deshidrataci�n causada por la fiebre y ayudar a aliviar los s�ntomas. Tambi�n    " +
                                                  "\n se pueden incluir infusiones de hierbas con propiedades antiinflamatorias y caldos claros para mantener el        " +
                                                  "\n equilibrio de electrolitos. EJERCICIO: Se sugiere actividad f�sica moderada, evitando el sobreesfuerzo y el estr�s,   " +
                                                  "\n ya que estos pueden agravar los s�ntomas. En caso de fiebre, se recomienda reposo y ejercicios de estiramiento suaves " +
                                                  "\n para evitar la fatiga muscular. POSIBLE TRATAMIENTO: No existen medicamentos espec�ficos para tratar el zika, pero se " +
                                                  "\n pueden aliviar los s�ntomas con reposo, hidrataci�n y analg�sicos como el acetaminof�n. Algunas marcas reconocidas de " +
                                                  "\n acetaminof�n incluyen Tylenol y Tempra. Se recomienda evitar el uso de aspirina y otros antiinflamatorios no esteroides " +
                                                  "\n hasta descartar la posibilidad de dengue. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y  " +
                                                  "\n nutrientes esenciales para fortalecer el sistema inmunol�gico, como frutos rojos (100 g) ricos en antioxidantes y       " +
                                                  "\n vitamina C, que ayudan a reducir el estr�s oxidativo con 59 mg de vitamina C (98% de la ingesta diaria recomendada);    " +
                                                  "\n espinacas (100 g) con alto contenido de hierro (2.7 mg, 15% de la ingesta diaria recomendada) y magnesio (79 mg, 20%    " +
                                                  "\n de la ingesta diaria recomendada); aguacate, que aporta grasas saludables y vitamina E, clave para la protecci�n        " +
                                                  "\n celular; y almendras (28 g, aproximadamente 23 unidades) que contienen vitamina E (7.3 mg, 49% de la ingesta diaria     " +
                                                  "\n recomendada) y �cidos grasos saludables, beneficiosos para la salud celular. Este es solo un Diagn�stico predeterminado " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor        " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que" +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 3 a 3.5 litros de agua (entre 12 y 14 vasos de tama�o regular)" +
                                                  "\n para prevenir la deshidrataci�n causada por la diarrea y la fiebre. Tambi�n se recomienda el consumo de       " +
                                                  "\n soluciones de rehidrataci�n oral como Pedialyte para reponer los minerales perdidos. EJERCICIO: Se sugiere    " +
                                                  "\n actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. En caso de fiebre    " +
                                                  "\n y diarrea, se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE     " +
                                                  "\n TRATAMIENTO: No existe un tratamiento espec�fico para la infecci�n por rotavirus, pero se recomienda el       " +
                                                  "\n consumo de l�quidos de rehidrataci�n oral y en casos graves, la administraci�n de l�quidos intravenosos.  " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos blandos y f�ciles de digerir, como pl�tanos (100 g)   " +
                                                  "\n que contienen potasio (358 mg, 10% de la ingesta diaria recomendada), �til para mantener el equilibrio    " +
                                                  "\n de electrolitos; arroz, que ayuda a reducir la diarrea; zanahorias (100 g) con 334% de la ingesta diaria  " +
                                                  "\n recomendada de vitamina A, 2.8 g de fibra y antioxidantes beta-carotenos; y yogur, que aporta probi�ticos " +
                                                  "\n beneficiosos para la recuperaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas   " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor     " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico  " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita  " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos      " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar al cuerpo a combatir la infecci�n. En casos   " +
                                                  "\n de fiebre, se recomienda aumentar la ingesta de l�quidos y consumir caldos claros para evitar la deshidrataci�n. " +
                                                  "\n EJERCICIO: Se sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas.   " +
                                                  "\n En casos graves, se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE  " +
                                                  "\n TRATAMIENTO: El tratamiento para la listeriosis en adultos suele incluir antibi�ticos como la ampicilina y la    " +
                                                  "\n gentamicina. Algunas marcas reconocidas de ampicilina incluyen Ampicil y Principen; de gentamicina, Garamycin    " +
                                                  "\n y Gentak. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales     " +
                                                  "\n para fortalecer el sistema inmunol�gico, como ajo, que posee propiedades antimicrobianas naturales; espinacas    " +
                                                  "\n (100 g) ricas en hierro (2.7 mg, 15% de la ingesta diaria recomendada) y vitamina C (79 mg, 20% de la ingesta    " +
                                                  "\n diaria recomendada), esenciales para la recuperaci�n; jengibre, con efectos antiinflamatorios y antibacterianos; " +
                                                  "\n y c�tricos como naranjas (1 unidad, 130 g) que aportan 70 mg de vitamina C (78% de la ingesta diaria recomendada)" +
                                                  "\n y ayudan a reforzar las defensas del organismo. Este es solo un Diagn�stico predeterminado l�gico, haberlo       " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas" +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en" +
                                                  "\n el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del   " +
                                                  "\n todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 3 a 3.5 litros de agua (entre 12 y 14 vasos   " +
                                                  "\n de tama�o regular) para prevenir la deshidrataci�n causada por la diarrea y la fiebre. Tambi�n se recomienda  " +
                                                  "\n el consumo de soluciones de rehidrataci�n oral para reponer los minerales perdidos. EJERCICIO: Se sugiere     " +
                                                  "\n actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. En caso de fiebre    " +
                                                  "\n y diarrea, se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE     " +
                                                  "\n TRATAMIENTO: El tratamiento para la shigelosis en adultos suele incluir antibi�ticos como la ciprofloxacina,  " +
                                                  "\n la azitromicina y la ceftriaxona. Algunas marcas reconocidas de ciprofloxacina incluyen Ciprobay y Ciproflox; " +
                                                  "\n de azitromicina, Zitromax y Azitrocin; de ceftriaxona, Rocephin y Cefaxone. ALIMENTACI�N: Se recomienda el    " +
                                                  "\n consumo de alimentos blandos y f�ciles de digerir, como pl�tanos (100 g) que contienen potasio (358 mg, 10%   " +
                                                  "\n de la ingesta diaria recomendada), �til para mantener el equilibrio de electrolitos; arroz, que ayuda a reducir " +
                                                  "\n la diarrea; zanahorias (100 g) con 334% de la ingesta diaria recomendada de vitamina A, 2.8 g de fibra y        " +
                                                  "\n antioxidantes beta-carotenos; y yogur, que aporta probi�ticos beneficiosos para la recuperaci�n. Este es solo   " +
                                                  "\n un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad  " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico  " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la     " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de  " +
                                                  "\n tama�o regular) para mantener una adecuada hidrataci�n y ayudar a fluidificar las secreciones pulmonares,       " +
                                                  "\n facilitando la respiraci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del      " +
                                                  "\n paciente, evitando esfuerzos excesivos. Se recomienda caminatas suaves de 20 a 30 minutos al d�a, siempre       " +
                                                  "\n que no haya dificultad respiratoria, y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n.          " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la EPOC en adultos suele incluir broncodilatadores como el salbutamol  " +
                                                  "\n y corticosteroides inhalados como la fluticasona. Algunas marcas reconocidas de salbutamol incluyen Ventolin    " +
                                                  "\n y Aerolin; de fluticasona, Flixotide y Pulmicort. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en  " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico y reducir la inflamaci�n pulmonar,   " +
                                                  "\n como zanahorias (100 g) que contienen aproximadamente 334% de la ingesta diaria recomendada de vitamina A, 2.8 g   " +
                                                  "\n de fibra y antioxidantes beta-carotenos; naranjas (1 unidad, 130 g) con 70 mg de vitamina C (78% de la ingesta     " +
                                                  "\n diaria recomendada), 3 g de fibra y 237 mg de potasio; espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta   " +
                                                  "\n diaria recomendada), 79 mg de magnesio (20% de la ingesta diaria recomendada) y 483 mcg de vitamina K (402% de la  " +
                                                  "\n ingesta diaria recomendada); y almendras (28 g, aproximadamente 23 unidades) que aportan vitamina E (7.3 mg, 49%   " +
                                                  "\n de la ingesta diaria recomendada), magnesio (76 mg, 18% de la ingesta diaria recomendada) y fibra (3.5 g). Este    " +
                                                  "\n es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa    " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de     " +
                                                  "\n un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por    " +
                                                  "\n su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico,    " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de    " +
                                                  "\n tama�o regular) para mantener una adecuada hidrataci�n y ayudar al cuerpo a eliminar la infecci�n. Adem�s, se     " +
                                                  "\n pueden incluir infusiones de hierbas con propiedades antimicrobianas y caldos claros para reforzar la hidrataci�n." +
                                                  "\n EJERCICIO: Se sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas.    " +
                                                  "\n Se recomienda caminatas suaves de 30 minutos al d�a y ejercicios de movilidad para mejorar la circulaci�n y el    " +
                                                  "\n bienestar general. POSIBLE TRATAMIENTO: El tratamiento para la clamidia en adultos suele incluir antibi�ticos     " +
                                                  "\n como la azitromicina y la doxiciclina. Algunas marcas reconocidas de azitromicina incluyen Zitromax y Azitrocin;  " +
                                                  "\n de doxiciclina, Vibramicina y Doxipar. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes " +
                                                  "\n y nutrientes esenciales para fortalecer el sistema inmunol�gico, como ajo, que posee propiedades antimicrobianas  " +
                                                  "\n naturales; espinacas (100 g) ricas en hierro (2.7 mg, 15% de la ingesta diaria recomendada) y vitamina C (79 mg,  " +
                                                  "\n 20% de la ingesta diaria recomendada), esenciales para la recuperaci�n; jengibre, con efectos antiinflamatorios   " +
                                                  "\n y antibacterianos; y c�tricos como naranjas (1 unidad, 130 g) que aportan 70 mg de vitamina C (78% de la ingesta  " +
                                                  "\n diaria recomendada) y ayudan a reforzar las defensas del organismo. Este es solo un Diagn�stico predeterminado    " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad " +
                                                  "\n y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer  " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no " +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app    " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos  " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la fiebre y la inflamaci�n.     " +
                                                  "\n Tambi�n se recomienda el consumo de caldos claros y bebidas con electrolitos para evitar la deshidrataci�n.  " +
                                                  "\n EJERCICIO: Se sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas." +
                                                  "\n En caso de fiebre, se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n.   " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la meningitis bacteriana en adultos suele incluir antibi�ticos     " +
                                                  "\n administrados por v�a intravenosa, como la ceftriaxona y la ampicilina. Algunas marcas reconocidas de       " +
                                                  "\n ceftriaxona incluyen Rocephin y Cefaxone; de ampicilina, Ampicil y Principen. Tambi�n se pueden recetar     " +
                                                  "\n corticoides para reducir la inflamaci�n cerebral y medicamentos para controlar las convulsiones en casos    " +
                                                  "\n graves. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales  " +
                                                  "\n para fortalecer el sistema inmunol�gico, como frutos rojos (100 g) ricos en antioxidantes y vitamina C, que " +
                                                  "\n ayudan a reducir el estr�s oxidativo con 59 mg de vitamina C (98% de la ingesta diaria recomendada); espinacas" +
                                                  "\n (100 g) con alto contenido de hierro (2.7 mg, 15% de la ingesta diaria recomendada) y magnesio (79 mg, 20%    " +
                                                  "\n de la ingesta diaria recomendada); aguacate, que aporta grasas saludables y vitamina E, clave para la         " +
                                                  "\n protecci�n celular; y almendras (28 g, aproximadamente 23 unidades) que contienen vitamina E (7.3 mg, 49%     " +
                                                  "\n de la ingesta diaria recomendada) y �cidos grasos saludables, beneficiosos para la salud celular. Este es     " +
                                                  "\n solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga      " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer   " +
                                                  "\n m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente,   " +
                                                  "\n adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar " +
                                                  "\n a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o regular) " +
                                                  "\n para mantener una adecuada hidrataci�n y ayudar al cuerpo a eliminar toxinas. Tambi�n se recomienda el consumo de infusiones   " +
                                                  "\n antioxidantes y caldos ricos en minerales para reforzar la hidrataci�n. EJERCICIO: Se sugiere actividad f�sica moderada,       " +
                                                  "\n adaptada a la condici�n del paciente, como caminatas suaves de 30 minutos al d�a y ejercicios de respiraci�n profunda para     " +
                                                  "\n mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: El tratamiento para el c�ncer en adultos depende del tipo y estadio de la         " +
                                                  "\n enfermedad, pero puede incluir cirug�a, quimioterapia con medicamentos como el paclitaxel y el cisplatino, radioterapia        " +
                                                  "\n y terapias dirigidas. Algunas marcas reconocidas de paclitaxel incluyen Taxol y Abraxane; de cisplatino, Platinol y Cisplat.   " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema  " +
                                                  "\n inmunol�gico y reducir la inflamaci�n celular, como zanahorias (100 g) que contienen aproximadamente 334% de la ingesta diaria " +
                                                  "\n recomendada de vitamina A, 2.8 g de fibra y antioxidantes beta-carotenos; naranjas (1 unidad, 130 g) con 70 mg de vitamina C   " +
                                                  "\n (78% de la ingesta diaria recomendada), 3 g de fibra y 237 mg de potasio; espinacas (100 g) con 2.7 mg de hierro (15% de la    " +
                                                  "\n ingesta diaria recomendada), 79 mg de magnesio (20% de la ingesta diaria recomendada) y 483 mcg de vitamina K (402% de la      " +
                                                  "\n ingesta diaria recomendada); y almendras (28 g, aproximadamente 23 unidades) que aportan vitamina E (7.3 mg, 49% de la ingesta " +
                                                  "\n diaria recomendada), magnesio (76 mg, 18% de la ingesta diaria recomendada) y fibra (3.5 g). Este es solo un Diagn�stico       " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la          " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer    " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le           " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida)          " +
                                                  "\n y espera que te mejores.");
                            }
                        }
                    }
                }
        if (EdadMasculino.equals("Adultez = 30 - 59 a�os")) {
            frame.setVisible(true);
        } else {
            frame.setVisible(false);
        }
        }
        public Estudio5() {
        this("", "", "", "", "");   
        }
        
        public void crearInterfaz(){
         
        scrollpane1.setSize(700,550);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
       
      }
        @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hola");
    }
        
        public static void main(String args[]) {
        Estudio5 ventanaEstudio5 = new Estudio5();
        ventanaEstudio5.crearInterfaz();
    }
}