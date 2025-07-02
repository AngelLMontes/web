import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Estudio6 implements ActionListener{
    
  
         private final JLabel label1;
         private JScrollPane scrollpane1;
         private JTextArea textarea1;
         private JFrame frame;
         private final String edadEsperada = "Adultez Mayor = 60 - 74 a�os";
         private String edadRecibida;
         
        public Estudio6(String nombrePaciente, String Sexo, String EdadMasculino,
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
                 if(EdadMasculino.equals("Adultez Mayor = 60 - 74 a�os")){
                     if(EstaturaMasculino.equals("0.90-1.35 m")){
                              if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de     " +
                                                  "\n tama�o regular) para prevenir la deshidrataci�n y ayudar a aliviar los s�ntomas. Tambi�n se recomienda el consumo  " +
                                                  "\n de caldos claros y bebidas con electrolitos para mantener el equilibrio de l�quidos. EJERCICIO: Se sugiere reposo  " +
                                                  "\n mientras persistan los s�ntomas, evitando actividades de esfuerzo intenso. Una vez que la fiebre disminuya, se         " +
                                                  "\n pueden realizar caminatas suaves de 10 a 20 minutos al d�a para favorecer la recuperaci�n sin comprometer el sistema   " +
                                                  "\n respiratorio. POSIBLE TRATAMIENTO: Se pueden utilizar antivirales como oseltamivir, baloxavir y zanamivir para reducir " +
                                                  "\n la duraci�n y gravedad de la infecci�n. Algunas marcas reconocidas de oseltamivir incluyen Tamiflu y Antiflu; de       " +
                                                  "\n baloxavir, Xofluza; y de zanamivir, Relenza. Tambi�n se recomienda el uso de analg�sicos y antipir�ticos como          " +
                                                  "\n paracetamol y ibuprofeno para aliviar la fiebre y el malestar general. ALIMENTACI�N: Se recomienda el consumo de       " +
                                                  "\n frutas y verduras ricas en vitaminas y antioxidantes para fortalecer el sistema inmunol�gico, como naranjas (1 unidad,   " +
                                                  "\n 130 g) que contienen 70 mg de vitamina C (78% de la ingesta diaria recomendada), 3 g de fibra y 237 mg de potasio;       " +
                                                  "\n fresas (100 g) con 59 mg de vitamina C (98% de la ingesta diaria recomendada), 2 g de fibra y antioxidantes flavonoides  " +
                                                  "\n y polifenoles; pl�tanos (100 g) ricos en potasio (358 mg, 10% de la ingesta diaria recomendada), �til para mantener el   " +
                                                  "\n equilibrio de electrolitos; y kiwi (100 g) con 92 mg de vitamina C (153% de la ingesta diaria recomendada), 40 mcg de    " +
                                                  "\n vitamina K (33% de la ingesta diaria recomendada) y 312 mg de potasio. Este es solo un Diagn�stico predeterminado l�gico, " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas" +
                                                  "\n est�n correctas. Para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el     " +
                                                  "\n tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del Diagn�stico no le satisface del todo, se   " +
                                                  "\n le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o   " +
                                                  "\n regular) para mantener la hidrataci�n y facilitar la expulsi�n de secreciones bronquiales. Se sugiere tambi�n    " +
                                                  "\n infusiones de hierbas, caldos de pollo y jugos naturales sin az�car para reforzar la hidrataci�n. EJERCICIO:     " +
                                                  "\n Se aconsejan ejercicios de respiraci�n profunda y t�cnicas de expansi�n pulmonar para mejorar la capacidad       " +
                                                  "\n respiratoria. Caminatas suaves de 10 a 15 minutos pueden ser beneficiosas si no hay fatiga excesiva. POSIBLE     " +
                                                  "\n TRATAMIENTO: En el caso de neumon�a bacteriana, el tratamiento suele incluir antibi�ticos como amoxicilina,      " +
                                                  "\n azitromicina y ceftriaxona. Algunas marcas reconocidas de amoxicilina incluyen Amoxil y Trimox; de azitromicina,      " +
                                                  "\n Zitromax y Azitrocin; y de ceftriaxona, Rocephin y Cefaxone. ALIMENTACI�N: Se recomienda el consumo de alimentos      " +
                                                  "\n ricos en vitaminas y antioxidantes para fortalecer el sistema inmunol�gico y reducir la inflamaci�n pulmonar, como    " +
                                                  "\n zanahorias (100 g) que contienen aproximadamente 334% de la ingesta diaria recomendada de vitamina A, 2.8 g de fibra    " +
                                                  "\n y antioxidantes beta-carotenos; naranjas (1 unidad, 130 g) con 70 mg de vitamina C (78% de la ingesta diaria recomendada)," +
                                                  "\n 3 g de fibra y 237 mg de potasio; espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta diaria recomendada), 79 mg    " +
                                                  "\n de magnesio (20% de la ingesta diaria recomendada) y 483 mcg de vitamina K (402% de la ingesta diaria recomendada);       " +
                                                  "\n y almendras (28 g, aproximadamente 23 unidades) que aportan vitamina E (7.3 mg, 49% de la ingesta diaria recomendada),    " +
                                                  "\n magnesio (76 mg, 18% de la ingesta diaria recomendada) y fibra (3.5 g). Este es solo un Diagn�stico predeterminado l�gico," +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas" +
                                                  "\n est�n correctas. Para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el     " +
                                                  "\n tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del Diagn�stico no le satisface del todo, se   " +
                                                  "\n le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o      " +
                                                  "\n regular) para mantener un adecuado nivel de hidrataci�n y ayudar a regular los niveles de glucosa en sangre.        " +
                                                  "\n Se sugiere tambi�n el consumo de agua con lim�n, infusiones sin az�car y jugos naturales con bajo �ndice gluc�mico.  " +
                                                  "\n EJERCICIO: Se recomienda realizar actividad f�sica moderada como caminatas de 20 a 30 minutos al d�a, entrenamiento  " +
                                                  "\n de resistencia y ejercicios aer�bicos, que contribuyen a mejorar la sensibilidad a la insulina. POSIBLE TRATAMIENTO: " +
                                                  "\n El tratamiento suele incluir medicamentos como metformina, que ayuda a reducir la producci�n de glucosa en el h�gado," +
                                                  "\n y en algunos casos, insulina para controlar los niveles elevados. Algunas marcas reconocidas de metformina incluyen  " +
                                                  "\n Glucophage y Dianben; de insulina, Lantus y Humalog. Tambi�n es importante un monitoreo constante de la glucosa en   " +
                                                  "\n sangre y ajustes en la dieta. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en fibra y bajos en carbohidratos " +
                                                  "\n refinados para estabilizar los niveles de glucosa, como avena (100 g) que aporta 4 g de fibra, 138 mg de magnesio (33% de " +
                                                  "\n la ingesta diaria recomendada) y 2.3 mg de zinc (21% de la ingesta diaria recomendada); almendras (28 g, aproximadamente  " +
                                                  "\n 23 unidades) con 7.3 mg de vitamina E (49% de la ingesta diaria recomendada), 76 mg de magnesio (18% de la ingesta diaria " +
                                                  "\n recomendada) y 3.5 g de fibra; espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta diaria recomendada), 79 mg de    " +
                                                  "\n magnesio (20% de la ingesta diaria recomendada) y 483 mcg de vitamina K (402% de la ingesta diaria recomendada); fresas   " +
                                                  "\n (100 g) con 59 mg de vitamina C (98% de la ingesta diaria recomendada), 2 g de fibra y antioxidantes flavonoides y polifenoles." +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad" +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas. Para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida  " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del    " +
                                                  "\n Diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita   " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o regular)   " +
                                                  "\n para mantener las v�as respiratorias hidratadas y reducir la viscosidad del moco, facilitando la respiraci�n. Tambi�n se pueden  " +
                                                  "\n incluir infusiones de hierbas con propiedades antiinflamatorias y caldos claros para reforzar la hidrataci�n. EJERCICIO: La      " +
                                                  "\n actividad f�sica debe ser controlada y adaptada a la condici�n del paciente, evitando desencadenantes como el aire fr�o o la     " +
                                                  "\n contaminaci�n. Se recomienda ejercicios de respiraci�n profunda y caminatas suaves de 20 a 30 minutos al d�a. POSIBLE TRATAMIENTO:   " +
                                                  "\n El tratamiento para el asma en adultos mayores suele incluir broncodilatadores de alivio r�pido, como el salbutamol y                " +
                                                  "\n corticosteroides inhalados como la fluticasona. Algunas marcas reconocidas de salbutamol incluyen Ventolin y Aerolin; de fluticasona," +
                                                  "\n Flixotide y Pulmicort. ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antiinflamatorias y antioxidantes, como   " +
                                                  "\n pescado graso, que aporta �cidos grasos Omega-3, beneficiosos para la salud pulmonar; zanahorias (100 g) que contienen 334% de la    " +
                                                  "\n ingesta diaria recomendada de vitamina A, 2.8 g de fibra y antioxidantes beta-carotenos; c�rcuma, con curcumina, que posee           " +
                                                  "\n propiedades antiinflamatorias; y kiwi (100 g) con 92 mg de vitamina C (153% de la ingesta diaria recomendada), 40 mcg de             " +
                                                  "\n vitamina K (33% de la ingesta diaria recomendada) y 312 mg de potasio. Este es solo un Diagn�stico predeterminado l�gico,            " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas           " +
                                                  "\n est�n correctas. Para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el                " +
                                                  "\n tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del Diagn�stico no le satisface del todo, se le           " +
                                                  "\n recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o   " +
                                                  "\n regular) para mantener una adecuada hidrataci�n y apoyar la funci�n renal, especialmente en pacientes que toman         " +
                                                  "\n medicamentos antirretrovirales. EJERCICIO: Se sugiere realizar actividad f�sica moderada, como caminatas de 30 a 45     " +
                                                  "\n minutos al d�a y ejercicios de resistencia, lo que contribuye a fortalecer el sistema inmunol�gico y mejorar la calidad " +
                                                  "\n de vida. POSIBLE TRATAMIENTO: El tratamiento para el VIH/SIDA consiste en la terapia antirretroviral (TAR), que incluye " +
                                                  "\n combinaciones de medicamentos como tenofovir, emtricitabina, dolutegravir y efavirenz. Algunas marcas reconocidas de    " +
                                                  "\n tenofovir incluyen Viread y Tenofovir Disoproxil; de emtricitabina, Emtriva y Truvada; de dolutegravir, Tivicay y Dovato;" +
                                                  "\n de efavirenz, Sustiva y Atripla. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico, como aguacate, que aporta grasas saludables y vitamina E, clave para " +
                                                  "\n la protecci�n celular; frutos rojos (100 g) ricos en antioxidantes y vitamina C, que ayudan a reducir el estr�s oxidativo" +
                                                  "\n con 59 mg de vitamina C (98% de la ingesta diaria recomendada); espinacas (100 g) con alto contenido de hierro (2.7 mg,  " +
                                                  "\n 15% de la ingesta diaria recomendada) y magnesio (79 mg, 20% de la ingesta diaria recomendada); y almendras (28 g,       " +
                                                  "\n aproximadamente 23 unidades) que contienen vitamina E (7.3 mg, 49% de la ingesta diaria recomendada) y �cidos grasos     " +
                                                  "\n saludables, beneficiosos para la salud celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado    " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas. " +
                                                  "\n Para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado" +
                                                  "\n de su paciente. Adem�s, por su salud, si la respuesta del Diagn�stico no le satisface del todo, se le recomienda mucho   " +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de " +
                                                  "\n tama�o regular) para ayudar a eliminar toxinas y mantener una adecuada funci�n renal. EJERCICIO: Se sugiere    " +
                                                  "\n actividad f�sica moderada, como caminatas de 30 a 45 minutos al d�a, evitando esfuerzos excesivos mientras     " +
                                                  "\n persistan los s�ntomas. POSIBLE TRATAMIENTO: El tratamiento para la gonorrea en adultos mayores suele incluir  " +
                                                  "\n antibi�ticos como ceftriaxona y azitromicina. Algunas marcas reconocidas de ceftriaxona incluyen Rocephin y      " +
                                                  "\n Cefaxone; de azitromicina, Zitromax y Azitrocin. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en    " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, como ajo, que posee propiedades   " +
                                                  "\n antimicrobianas naturales; espinacas (100 g) ricas en hierro (2.7 mg, 15% de la ingesta diaria recomendada) y    " +
                                                  "\n vitamina C (79 mg, 20% de la ingesta diaria recomendada), esenciales para la recuperaci�n; jengibre, con efectos " +
                                                  "\n antiinflamatorios y antibacterianos; y c�tricos como naranjas (1 unidad, 130 g) que aportan 70 mg de vitamina C    " +
                                                  "\n (78% de la ingesta diaria recomendada) y ayudan a reforzar las defensas del organismo. Este es solo un Diagn�stico " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello   " +
                                                  "\n la enfermedad y sus respuestas est�n correctas. Para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para  " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del      " +
                                                  "\n Diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita" +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de           " +
                                                  "\n tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la inflamaci�n. Tambi�n se pueden incluir      " +
                                                  "\n infusiones de hierbas con propiedades antivirales y caldos claros para reforzar la hidrataci�n. EJERCICIO: Se sugiere    " +
                                                  "\n actividad f�sica moderada, evitando el sobreesfuerzo y el estr�s, ya que estos pueden desencadenar brotes recurrentes.   " +
                                                  "\n Se recomienda ejercicios de relajaci�n y caminatas suaves de 20 a 30 minutos al d�a. POSIBLE TRATAMIENTO: El tratamiento " +
                                                  "\n para el herpes genital en adultos mayores suele incluir antivirales como aciclovir, famciclovir y valaciclovir. Algunas   " +
                                                  "\n marcas reconocidas de aciclovir incluyen Zovirax y Acivir; de famciclovir, Famvir y Famciclovir; de valaciclovir, Valtrex " +
                                                  "\n y Valaciclovir. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en lisina, un amino�cido que puede ayudar a     " +
                                                  "\n reducir la frecuencia de los brotes, como yogur, que aporta prote�nas y probi�ticos beneficiosos; pescado, rico en �cidos " +
                                                  "\n grasos Omega-3 con propiedades antiinflamatorias; frutos secos como almendras (28 g, aproximadamente 23 unidades) que     " +
                                                  "\n contienen 7.3 mg de vitamina E (49% de la ingesta diaria recomendada) y antioxidantes; y vegetales de hoja verde como     " +
                                                  "\n espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta diaria recomendada) y 79 mg de magnesio (20% de la ingesta      " +
                                                  "\n diaria recomendada), esenciales para la regeneraci�n celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo  " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n  " +
                                                  "\n correctas. Para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento" +
                                                  "\n adecuado de su paciente. Adem�s, por su salud, si la respuesta del Diagn�stico no le satisface del todo, se le recomienda  " +
                                                  "\n mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o regular)   " +
                                                  "\n para mantener una adecuada hidrataci�n y ayudar a reducir la fiebre y la inflamaci�n. Tambi�n se recomienda el   " +
                                                  "\n consumo de caldos claros y bebidas con electrolitos para evitar la deshidrataci�n. EJERCICIO: Se sugiere         " +
                                                  "\n actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. En caso de fiebre,        " +
                                                  "\n se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: El     " +
                                                  "\n tratamiento para la s�filis en adultos mayores suele incluir antibi�ticos como penicilina G benzatina, ceftriaxona   " +
                                                  "\n y doxiciclina. Algunas marcas reconocidas de penicilina G benzatina incluyen Benzetacil y Pfizerpen; de ceftriaxona, " +
                                                  "\n Rocephin y Cefaxone; de doxiciclina, Vibramicina y Doxipar. ALIMENTACI�N: Se recomienda el consumo de alimentos      " +
                                                  "\n ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, como frutos rojos (100 g)    " +
                                                  "\n ricos en antioxidantes y vitamina C, que ayudan a reducir el estr�s oxidativo con 59 mg de vitamina C (98% de la      " +
                                                  "\n ingesta diaria recomendada); espinacas (100 g) con alto contenido de hierro (2.7 mg, 15% de la ingesta diaria           " +
                                                  "\n recomendada) y magnesio (79 mg, 20% de la ingesta diaria recomendada); aguacate, que aporta grasas saludables y         " +
                                                  "\n vitamina E, clave para la protecci�n celular; y almendras (28 g, aproximadamente 23 unidades) que contienen vitamina E  " +
                                                  "\n (7.3 mg, 49% de la ingesta diaria recomendada) y �cidos grasos saludables, beneficiosos para la salud celular. Este es  " +
                                                  "\n solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas. Para ello se recomienda hacer m�s de un Diagn�stico de    " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta " +
                                                  "\n del Diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita" +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 3 a 3.5 litros de agua (entre 12 y 14 vasos      " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a fluidificar las secreciones pulmonares,     " +
                                                  "\n facilitando la respiraci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del       " +
                                                  "\n paciente, evitando esfuerzos excesivos. Se recomienda caminatas suaves de 20 a 30 minutos al d�a, siempre que    " +
                                                  "\n no haya dificultad respiratoria, y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE       " +
                                                  "\n TRATAMIENTO: El tratamiento para la tuberculosis en adultos mayores suele incluir antibi�ticos como isoniazida,  " +
                                                  "\n rifampicina y etambutol. Algunas marcas reconocidas de isoniazida incluyen Nydrazid y Laniazid; de rifampicina,  " +
                                                  "\n Rifadin y Rimactane; de etambutol, Myambutol y Etibi. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos  " +
                                                  "\n en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico y reducir la inflamaci�n pulmonar," +
                                                  "\n como zanahorias (100 g) que contienen aproximadamente 334% de la ingesta diaria recomendada de vitamina A, 2.8 g   " +
                                                  "\n de fibra y antioxidantes beta-carotenos; naranjas (1 unidad, 130 g) con 70 mg de vitamina C (78% de la ingesta     " +
                                                  "\n diaria recomendada), 3 g de fibra y 237 mg de potasio; espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta   " +
                                                  "\n diaria recomendada), 79 mg de magnesio (20% de la ingesta diaria recomendada) y 483 mcg de vitamina K (402% de la  " +
                                                  "\n ingesta diaria recomendada); y almendras (28 g, aproximadamente 23 unidades) que aportan vitamina E (7.3 mg, 49%   " +
                                                  "\n de la ingesta diaria recomendada), magnesio (76 mg, 18% de la ingesta diaria recomendada) y fibra (3.5 g). Este es " +
                                                  "\n solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa       " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas. Para ello se recomienda hacer m�s de     " +
                                                  "\n un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Adem�s, por   " +
                                                  "\n su salud, si la respuesta del Diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico,  " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de       " +
                                                  "\n tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la inflamaci�n en las articulaciones.      " +
                                                  "\n Tambi�n se pueden incluir infusiones de hierbas con propiedades antiinflamatorias y caldos claros para reforzar      " +
                                                  "\n la hidrataci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente, evitando    " +
                                                  "\n movimientos bruscos. Se recomienda ejercicios de bajo impacto como nataci�n, yoga o caminatas suaves de 20 a 30      " +
                                                  "\n minutos al d�a para mejorar la movilidad sin generar estr�s en las articulaciones. POSIBLE TRATAMIENTO: El tratamiento  " +
                                                  "\n para la artritis en adultos mayores suele incluir antiinflamatorios no esteroides (AINE) como el ibuprofeno y el        " +
                                                  "\n naproxeno, as� como f�rmacos antirreum�ticos modificadores de la enfermedad (FAME) como el metotrexato. Algunas marcas  " +
                                                  "\n reconocidas de ibuprofeno incluyen Advil y Motrin; de naproxeno, Aleve y Naprosyn; de metotrexato, Trexall y Rheumatrex." +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antiinflamatorias y antioxidantes, como pescado     " +
                                                  "\n graso, que aporta �cidos grasos Omega-3, beneficiosos para la salud articular; c�rcuma, con curcumina, que posee        " +
                                                  "\n propiedades antiinflamatorias; frutos secos como almendras (28 g, aproximadamente 23 unidades) que contienen vitamina E " +
                                                  "\n y antioxidantes; y vegetales de hoja verde como espinacas (100 g) con hierro y magnesio, esenciales para la regeneraci�n " +
                                                  "\n celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga" +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas. Para ello se recomienda hacer m�s de un    " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud,  " +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico, Angel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos    " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la inflamaci�n en las v�as        " +
                                                  "\n respiratorias. Tambi�n se recomienda el consumo de caldos claros y bebidas con electrolitos para evitar la     " +
                                                  "\n deshidrataci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente,       " +
                                                  "\n evitando esfuerzos excesivos. Se recomienda ejercicios de respiraci�n profunda y caminatas suaves de 15 a 20   " +
                                                  "\n minutos al d�a para mejorar la capacidad pulmonar. POSIBLE TRATAMIENTO: El tratamiento para la tosferina en    " +
                                                  "\n adultos mayores suele incluir antibi�ticos como azitromicina, claritromicina y eritromicina. Algunas marcas    " +
                                                  "\n reconocidas de azitromicina incluyen Zitromax y Azitrocin; de claritromicina, Biaxin y Claritromicina Genfar;     " +
                                                  "\n de eritromicina, Erythrocin y Ilosone. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes " +
                                                  "\n y nutrientes esenciales para fortalecer el sistema inmunol�gico y reducir la inflamaci�n pulmonar, como zanahorias" +
                                                  "\n con vitamina A, naranjas con vitamina C, espinacas con hierro y magnesio, y almendras con vitamina E y fibra.     " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga  " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas. Para ello se recomienda hacer m�s   " +
                                                  "\n de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Adem�s,   " +
                                                  "\n por su salud, si la respuesta del Diagn�stico no le satisface del todo, se le recomienda mucho consultar a su     " +
                                                  "\n m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos   " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la fiebre y la inflamaci�n.      " +
                                                  "\n Tambi�n se recomienda el consumo de caldos claros y bebidas con electrolitos para evitar la deshidrataci�n.   " +
                                                  "\n EJERCICIO: Se sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas." +
                                                  "\n En caso de fiebre, se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n.         " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para las paperas, pero se pueden aliviar los s�ntomas    " +
                                                  "\n con analg�sicos y antipir�ticos como paracetamol e ibuprofeno. Algunas marcas reconocidas de paracetamol incluyen " +
                                                  "\n Tylenol y Panadol; de ibuprofeno, Advil y Motrin. Tambi�n se recomienda el uso de compresas fr�as en la zona      " +
                                                  "\n inflamada para reducir el dolor. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y        " +
                                                  "\n nutrientes esenciales para fortalecer el sistema inmunol�gico, como naranjas con vitamina C, fresas con flavonoides  " +
                                                  "\n y polifenoles, espinacas con hierro y magnesio, y almendras con vitamina E y fibra. Este es solo un Diagn�stico      " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello   " +
                                                  "\n la enfermedad y sus respuestas est�n correctas. Para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para  " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del      " +
                                                  "\n Diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu       " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 3 a 3.5 litros de agua (entre 12 y 14 vasos de tama�o  " +
                                                  "\n regular) para prevenir la deshidrataci�n causada por la fiebre y ayudar a aliviar los s�ntomas. Tambi�n se pueden      " +
                                                  "\n incluir infusiones de hierbas con propiedades antiinflamatorias y caldos claros para mantener el equilibrio de         " +
                                                  "\n electrolitos. EJERCICIO: Se sugiere actividad f�sica moderada, evitando el sobreesfuerzo y el estr�s, ya que estos     " +
                                                  "\n pueden agravar los s�ntomas. En caso de fiebre, se recomienda reposo y ejercicios de estiramiento suaves para evitar   " +
                                                  "\n la fatiga muscular. POSIBLE TRATAMIENTO: No existen medicamentos espec�ficos para tratar el zika, pero se pueden aliviar   " +
                                                  "\n los s�ntomas con reposo, hidrataci�n y analg�sicos como acetaminof�n. Algunas marcas reconocidas de acetaminof�n incluyen  " +
                                                  "\n Tylenol y Tempra. Se recomienda evitar el uso de aspirina y otros antiinflamatorios no esteroides hasta descartar la       " +
                                                  "\n posibilidad de dengue. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales  " +
                                                  "\n para fortalecer el sistema inmunol�gico, como frutos rojos ricos en vitamina C, espinacas con alto contenido de hierro y   " +
                                                  "\n magnesio, aguacate que aporta grasas saludables y vitamina E, y almendras con vitamina E y �cidos grasos saludables.       " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa       " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas. Para ello se recomienda hacer m�s de un          " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud,    " +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico, Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 3 a 3.5 litros de agua (entre 12 y 14 vasos de tama�o regular)       " +
                                                  "\n para prevenir la deshidrataci�n causada por la diarrea y la fiebre. Tambi�n se recomienda el consumo de              " +
                                                  "\n soluciones de rehidrataci�n oral para reponer los minerales perdidos. EJERCICIO: Se sugiere actividad f�sica         " +
                                                  "\n moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. En caso de fiebre y diarrea, se recomienda      " +
                                                  "\n reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: No existe un tratamiento  " +
                                                  "\n espec�fico para la infecci�n por rotavirus, pero se recomienda el consumo de l�quidos de rehidrataci�n oral y en casos  " +
                                                  "\n graves, la administraci�n de l�quidos intravenosos. ALIMENTACI�N: Se recomienda el consumo de alimentos blandos y f�ciles" +
                                                  "\n de digerir, como pl�tanos ricos en potasio, arroz que ayuda a reducir la diarrea, zanahorias con antioxidantes           " +
                                                  "\n beta-carotenos, y yogur que aporta probi�ticos beneficiosos para la recuperaci�n. Este es solo un Diagn�stico            " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la    " +
                                                  "\n enfermedad y sus respuestas est�n correctas. Para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer" +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del Diagn�stico no le     " +
                                                  "\n satisface del todo, se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida)     " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos       " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar al cuerpo a combatir la infecci�n. En casos    " +
                                                  "\n de fiebre, se recomienda aumentar la ingesta de l�quidos y consumir caldos claros para evitar la deshidrataci�n.  " +
                                                  "\n EJERCICIO: Se sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas.    " +
                                                  "\n En casos graves, se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n.           " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la listeriosis en adultos mayores suele incluir antibi�ticos como ampicilina " +
                                                  "\n y gentamicina. Algunas marcas reconocidas de ampicilina incluyen Ampicil y Principen; de gentamicina, Garamycin y     " +
                                                  "\n Gentak. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para       " +
                                                  "\n fortalecer el sistema inmunol�gico, como ajo con propiedades antimicrobianas naturales, espinacas ricas en hierro     " +
                                                  "\n y vitamina C, jengibre con efectos antiinflamatorios y antibacterianos, y c�tricos como naranjas que aportan vitamina C  " +
                                                  "\n y ayudan a reforzar las defensas del organismo. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado    " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas. " +
                                                  "\n Para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado" +
                                                  "\n de su paciente. Adem�s, por su salud, si la respuesta del Diagn�stico no le satisface del todo, se le recomienda mucho   " +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 3 a 3.5 litros de agua (entre 12 y 14 vasos    " +
                                                  "\n de tama�o regular) para prevenir la deshidrataci�n causada por la diarrea y la fiebre. Tambi�n se recomienda   " +
                                                  "\n el consumo de soluciones de rehidrataci�n oral para reponer los minerales perdidos. EJERCICIO: Se sugiere      " +
                                                  "\n actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. En caso de fiebre     " +
                                                  "\n y diarrea, se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n. POSIBLE      " +
                                                  "\n TRATAMIENTO: El tratamiento para la shigelosis en adultos mayores suele incluir antibi�ticos como ciprofloxacina, " +
                                                  "\n azitromicina y ceftriaxona, especialmente en casos graves o en pacientes con sistemas inmunol�gicos debilitados.  " +
                                                  "\n Tambi�n se recomienda el reemplazo de l�quidos y sales para evitar la deshidrataci�n. ALIMENTACI�N: Se recomienda " +
                                                  "\n el consumo de alimentos blandos y f�ciles de digerir, como pl�tanos ricos en potasio, arroz que ayuda a reducir   " +
                                                  "\n la diarrea, zanahorias con antioxidantes beta-carotenos, y yogur que aporta probi�ticos beneficiosos para la      " +
                                                  "\n recuperaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el   " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas. Para ello se         " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado      " +
                                                  "\n de su paciente. Adem�s, por su salud, si la respuesta del Diagn�stico no le satisface del todo, se le recomienda  " +
                                                  "\n mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
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
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la EPOC en adultos mayores suele incluir broncodilatadores como        " +
                                                  "\n salbutamol y tiotropio, corticosteroides inhalados como fluticasona, oxigenoterapia en casos avanzados y        " +
                                                  "\n rehabilitaci�n pulmonar para mejorar la calidad de vida. ALIMENTACI�N: Se recomienda el consumo de alimentos    " +
                                                  "\n ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico y reducir la inflamaci�n " +
                                                  "\n pulmonar, como zanahorias con vitamina A, naranjas con vitamina C, espinacas con hierro y magnesio, y almendras    " +
                                                  "\n con vitamina E y fibra. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas. Para ello se   " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de    " +
                                                  "\n su paciente. Adem�s, por su salud, si la respuesta del Diagn�stico no le satisface del todo, se le recomienda mucho" +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o   " +
                                                  "\n regular) para mantener una adecuada hidrataci�n y ayudar al cuerpo a eliminar la infecci�n. Adem�s, se pueden incluir   " +
                                                  "\n infusiones de hierbas con propiedades antimicrobianas y caldos claros para reforzar la hidrataci�n. EJERCICIO: Se       " +
                                                  "\n sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. Se recomienda caminatas  " +
                                                  "\n suaves de 30 minutos al d�a y ejercicios de movilidad para mejorar la circulaci�n y el bienestar general. POSIBLE         " +
                                                  "\n TRATAMIENTO: El tratamiento para la clamidia en adultos mayores suele incluir antibi�ticos como azitromicina y doxiciclina." +
                                                  "\n Algunas marcas reconocidas de azitromicina incluyen Zitromax y Azitrocin; de doxiciclina, Vibramicina y Doxipar.          " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer        " +
                                                  "\n el sistema inmunol�gico, como ajo con propiedades antimicrobianas naturales, espinacas ricas en hierro y vitamina C,      " +
                                                  "\n jengibre con efectos antiinflamatorios y antibacterianos, y c�tricos como naranjas que aportan vitamina C y ayudan a      " +
                                                  "\n reforzar las defensas del organismo. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza   " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas. Para ello     " +
                                                  "\n se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su     " +
                                                  "\n paciente. Adem�s, por su salud, si la respuesta del Diagn�stico no le satisface del todo, se le recomienda mucho consultar" +
                                                  "\n a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos     " +
                                                  "\n de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la fiebre y la inflamaci�n.        " +
                                                  "\n Tambi�n se recomienda el consumo de caldos claros y bebidas con electrolitos para evitar la deshidrataci�n.     " +
                                                  "\n EJERCICIO: Se sugiere actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas.  " +
                                                  "\n En caso de fiebre, se recomienda reposo y ejercicios de respiraci�n profunda para mejorar la oxigenaci�n.       " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la meningitis bacteriana en adultos mayores suele incluir antibi�ticos   " +
                                                  "\n intravenosos como ceftriaxona o ampicilina, dependiendo del agente causal. Tambi�n se pueden recetar corticoides  " +
                                                  "\n para reducir la inflamaci�n cerebral y medicamentos para controlar las convulsiones en casos graves. ALIMENTACI�N:" +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema   " +
                                                  "\n inmunol�gico, como frutos rojos ricos en vitamina C, espinacas con alto contenido de hierro y magnesio, aguacate  " +
                                                  "\n que aporta grasas saludables y vitamina E, y almendras con vitamina E y �cidos grasos saludables. Este es solo un " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y " +
                                                  "\n que por ello la enfermedad y sus respuestas est�n correctas. Para ello se recomienda hacer m�s de un Diagn�stico  " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico, Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tama�o regular) " +
                                                  "\n para mantener una adecuada hidrataci�n y ayudar al cuerpo a eliminar toxinas. Tambi�n se recomienda el consumo de infusiones   " +
                                                  "\n antioxidantes y caldos ricos en minerales para reforzar la hidrataci�n. EJERCICIO: Se sugiere actividad f�sica moderada,       " +
                                                  "\n adaptada a la condici�n del paciente, como caminatas suaves de 30 minutos al d�a y ejercicios de respiraci�n profunda para     " +
                                                  "\n mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: El tratamiento para el c�ncer en adultos mayores depende del tipo y estadio de    " +
                                                  "\n la enfermedad, pero puede incluir cirug�a, quimioterapia con medicamentos como paclitaxel y cisplatino, radioterapia y terapias" +
                                                  "\n dirigidas. En algunos casos, se puede optar por tratamientos paliativos para mejorar la calidad de vida. ALIMENTACI�N: Se      " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico y    " +
                                                  "\n reducir la inflamaci�n celular, como zanahorias con vitamina A, naranjas con vitamina C, espinacas con hierro y magnesio, y    " +
                                                  "\n almendras con vitamina E y fibra. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%   " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas. Para ello se recomienda    " +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Adem�s,      " +
                                                  "\n por su salud, si la respuesta del Diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico,          " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            
                        }
                        if(EstaturaMasculino.equals("1.45-1.70 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N: En adultos mayores, la gripe puede provocar una mayor p�rdida de l�quidos debido a fiebre, sudoraci�n      " +
                                                  "\n y disminuci�n del consumo de agua. Se recomienda un consumo diario de 2.5 a 3 litros de l�quidos, incluyendo agua,      " +
                                                  "\n caldos y t�s sin cafe�na, para prevenir la deshidrataci�n y ayudar a mantener la funci�n inmunol�gica. La hidrataci�n     " +
                                                  "\n adecuada tambi�n contribuye a mantener las mucosas h�medas, lo que facilita la expulsi�n del virus y reduce la irritaci�n " +
                                                  "\n en la garganta. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente, recomend�ndose   " +
                                                  "\n ejercicios de bajo impacto como caminatas suaves de 30 a 45 minutos al d�a, siempre evitando el esfuerzo excesivo para    " +
                                                  "\n no comprometer la recuperaci�n. POSIBLE TRATAMIENTO: Para la gripe en adultos mayores, se recomienda el uso de antivirales  " +
                                                  "\n como el oseltamivir (Tamiflu) para reducir la duraci�n y gravedad de los s�ntomas, adem�s de medicamentos para aliviar la   " +
                                                  "\n fiebre y el malestar como el paracetamol (Tempra) o el ibuprofeno (Advil). Tambi�n es esencial la vacunaci�n anual contra   " +
                                                  "\n la influenza para prevenir complicaciones graves. En cuanto a la alimentaci�n, se recomienda el consumo de frutas y verduras" +
                                                  "\n ricas en vitaminas y antioxidantes para fortalecer el sistema inmune, tales como: Naranjas y kiwis: ricos en vitamina C, que  " +
                                                  "\n ayuda a reducir la duraci�n de los s�ntomas. Espinacas y br�coli: contienen antioxidantes y vitamina E, esenciales para la    " +
                                                  "\n recuperaci�n. Jengibre y c�rcuma: poseen propiedades antiinflamatorias que pueden aliviar la congesti�n y el malestar general." +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida   " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico  " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida)     " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N: En adultos mayores, la neumon�a puede provocar fiebre alta y sudoraci�n excesiva, lo que aumenta   " +
                                                  "\n el riesgo de deshidrataci�n. Se recomienda un consumo diario de 2.5 a 3 litros de l�quidos, incluyendo agua,    " +
                                                  "\n caldos y t�s sin cafe�na, para mantener la hidrataci�n y ayudar a la recuperaci�n. La hidrataci�n adecuada      " +
                                                  "\n tambi�n contribuye a mantener las secreciones pulmonares m�s fluidas, facilitando la expectoraci�n. EJERCICIO:    " +
                                                  "\n La actividad f�sica debe ser m�nima durante la fase aguda de la enfermedad, pero una vez en recuperaci�n, se      " +
                                                  "\n recomienda caminar 20 a 30 minutos al d�a para mejorar la capacidad pulmonar y evitar la p�rdida de masa muscular. " +
                                                  "\n POSIBLE TRATAMIENTO: Para la neumon�a en adultos mayores, el tratamiento suele incluir antibi�ticos como la        " +
                                                  "\n amoxicilina o la azitromicina, dependiendo del tipo de infecci�n. Tambi�n se pueden administrar medicamentos para  " +
                                                  "\n reducir la fiebre y aliviar el malestar, como el paracetamol (Tempra) o el ibuprofeno (Advil). En casos graves,    " +
                                                  "\n puede ser necesario el uso de ox�geno suplementario. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos     " +
                                                  "\n en vitaminas y antioxidantes para fortalecer el sistema inmune, tales como: Naranjas y kiwis: ricos en vitamina C,   " +
                                                  "\n que ayuda a reducir la duraci�n de los s�ntomas. Espinacas y br�coli: contienen antioxidantes y vitamina E,          " +
                                                  "\n esenciales para la recuperaci�n. Jengibre y c�rcuma: poseen propiedades antiinflamatorias que pueden aliviar la      " +
                                                  "\n congesti�n y el malestar general. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello " +
                                                  "\n se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su " +
                                                  "\n paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar" +
                                                  "\n a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACI�N: En adultos mayores con diabetes, la hidrataci�n es clave para mantener niveles adecuados de glucosa  " +
                                                  "\n en sangre y prevenir complicaciones renales. Se recomienda un consumo diario de 2 a 2.5 litros de agua, evitando  " +
                                                  "\n bebidas azucaradas y con cafe�na, ya que pueden afectar el control de la glucosa. EJERCICIO: La actividad f�sica  " +
                                                  "\n debe ser moderada y adaptada a la condici�n del paciente, recomend�ndose ejercicios de bajo impacto como caminatas  " +
                                                  "\n suaves de 30 a 45 minutos al d�a, lo que ayuda a mejorar la sensibilidad a la insulina y controlar el peso. POSIBLE " +
                                                  "\n TRATAMIENTO: Para la diabetes en adultos mayores, el tratamiento suele incluir medicamentos como la metformina para " +
                                                  "\n mejorar la sensibilidad a la insulina, adem�s de insulina en algunos casos. Tambi�n se recomienda el monitoreo      " +
                                                  "\n constante de la glucosa y ajustes en la dieta. ALIMENTACI�N: Se recomienda el consumo de alimentos con bajo �ndice  " +
                                                  "\n gluc�mico y ricos en fibra para estabilizar los niveles de az�car en sangre, tales como: Avena y legumbres: ayudan  " +
                                                  "\n a regular la glucosa y mejorar la digesti�n. Frutas como manzanas y peras: contienen fibra y antioxidantes sin elevar" +
                                                  "\n bruscamente la glucosa. Verduras de hoja verde como espinacas y acelgas: ricas en magnesio, que ayuda a mejorar la   " +
                                                  "\n sensibilidad a la insulina. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al    " +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello   " +
                                                  "\n se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de   " +
                                                  "\n su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho     " +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: En adultos mayores con asma, la hidrataci�n es fundamental para mantener las v�as respiratorias h�medas y  " +
                                                  "\n reducir la irritaci�n. Se recomienda un consumo diario de 2 a 2.5 litros de agua, adem�s de infusiones sin cafe�na que  " +
                                                  "\n ayuden a despejar las v�as respiratorias. EJERCICIO: La actividad f�sica debe ser controlada y adaptada a la capacidad  " +
                                                  "\n del paciente, recomend�ndose ejercicios de bajo impacto como caminatas suaves de 30 a 40 minutos al d�a, evitando       " +
                                                  "\n ambientes fr�os o contaminados que puedan desencadenar s�ntomas. POSIBLE TRATAMIENTO: Para el asma en adultos mayores,  " +
                                                  "\n el tratamiento suele incluir broncodilatadores de alivio r�pido como el salbutamol (Ventolin), corticosteroides inhalados" +
                                                  "\n como la fluticasona (Flixotide) y en algunos casos, modificadores de leucotrienos como el montelukast (Singulair).       " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antiinflamatorias y antioxidantes para mejorar       " +
                                                  "\n la funci�n pulmonar, tales como: Pescados grasos como salm�n y at�n: ricos en Omega-3, que ayudan a reducir la inflamaci�n" +
                                                  "\n de las v�as respiratorias. Frutas y verduras de colores vivos como ar�ndanos y espinacas: ricas en antioxidantes y       " +
                                                  "\n vitamina C, que fortalecen el sistema inmune. Jengibre y c�rcuma: contienen compuestos con efectos antiinflamatorios     " +
                                                  "\n que pueden ser beneficiosos para las v�as respiratorias. Este es solo un Diagn�stico predeterminado l�gico, haberlo      " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas       " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en       " +
                                                  "\n el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo     " +
                                                  "\n se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: En adultos mayores con VIH/SIDA, la hidrataci�n es fundamental para mantener la funci�n renal y reducir   " +
                                                  "\n los efectos secundarios de los medicamentos antirretrovirales. Se recomienda un consumo diario de 2 a 3 litros de agua," +
                                                  "\n adem�s de infusiones sin cafe�na y caldos ligeros para mejorar la absorci�n de nutrientes y evitar la deshidrataci�n   " +
                                                  "\n causada por fiebre o diarrea. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente, " +
                                                  "\n recomend�ndose ejercicios de bajo impacto como caminatas suaves de 30 a 45 minutos al d�a, lo que ayuda a fortalecer el" +
                                                  "\n sistema inmunol�gico y mejorar la salud cardiovascular. POSIBLE TRATAMIENTO: Para el VIH/SIDA en adultos mayores, el   " +
                                                  "\n tratamiento incluye terapia antirretroviral (TAR) con combinaciones de medicamentos como tenofovir, emtricitabina y    " +
                                                  "\n dolutegravir, que ayudan a mantener el virus bajo control y mejorar la calidad de vida. Es crucial el monitoreo constante " +
                                                  "\n de la carga viral y el estado inmunol�gico. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y  " +
                                                  "\n prote�nas para fortalecer el sistema inmune, tales como: Frutas c�tricas como naranjas y kiwis: ricas en vitamina C, que  " +
                                                  "\n ayuda a reducir el estr�s oxidativo. Pescados grasos como salm�n y at�n: ricos en Omega-3, que contribuyen a la salud     " +
                                                  "\n cardiovascular. Legumbres y frutos secos: fuentes de prote�nas y zinc, esenciales para la regeneraci�n celular. Este es   " +
                                                  "\n solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad   " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de     " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta    " +
                                                  "\n del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita  " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: En adultos mayores con gonorrea, la hidrataci�n es clave para ayudar a eliminar la bacteria y    " +
                                                  "\n reducir la inflamaci�n del tracto urinario. Se recomienda un consumo diario de 2 a 2.5 litros de agua, adem�s " +
                                                  "\n de jugos naturales sin az�car y caldos ligeros para mejorar la funci�n renal y reducir molestias urinarias.   " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente, recomend�ndose       " +
                                                  "\n ejercicios de bajo impacto como caminatas suaves de 30 a 40 minutos al d�a, evitando esfuerzos excesivos      " +
                                                  "\n que puedan agravar los s�ntomas. POSIBLE TRATAMIENTO: Para la gonorrea en adultos mayores, el tratamiento     " +
                                                  "\n recomendado es una dosis �nica de ceftriaxona 500 mg administrada por v�a intramuscular, acompa�ada de        " +
                                                  "\n doxiciclina en caso de coinfecci�n con clamidia. Es fundamental completar el tratamiento y evitar relaciones  " +
                                                  "\n sexuales hasta la recuperaci�n total. ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades     " +
                                                  "\n antibacterianas y antiinflamatorias para mejorar la recuperaci�n, tales como: Ajo y cebolla: contienen compuestos" +
                                                  "\n con efectos antimicrobianos naturales. Yogur natural: fuente de probi�ticos que ayudan a restaurar la flora   " +
                                                  "\n intestinal afectada por los antibi�ticos. Frutas y verduras ricas en vitamina C como fresas y pimientos:      " +
                                                  "\n fortalecen el sistema inmune y aceleran la recuperaci�n. Este es solo un Diagn�stico predeterminado l�gico,   " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y   " +
                                                  "\n sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer" +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico" +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: En adultos mayores con herpes genital, la hidrataci�n es esencial para reducir la inflamaci�n y mejorar " +
                                                  "\n la cicatrizaci�n de las lesiones. Se recomienda un consumo diario de 2 a 2.5 litros de agua, adem�s de infusiones de " +
                                                  "\n manzanilla y caldos ligeros para aliviar molestias y fortalecer el sistema inmunol�gico. EJERCICIO: La actividad     " +
                                                  "\n f�sica debe ser moderada y adaptada a la condici�n del paciente, recomend�ndose ejercicios de bajo impacto como      " +
                                                  "\n caminatas suaves de 30 a 40 minutos al d�a, evitando el estr�s excesivo que pueda desencadenar brotes. POSIBLE       " +
                                                  "\n TRATAMIENTO: Para el herpes genital en adultos mayores, el tratamiento suele incluir antivirales como aciclovir,     " +
                                                  "\n valaciclovir o famciclovir, que ayudan a reducir la duraci�n y gravedad de los brotes. Tambi�n se recomienda el      " +
                                                  "\n uso de cremas t�picas para aliviar el dolor y la inflamaci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos    " +
                                                  "\n con propiedades antivirales y antiinflamatorias para mejorar la recuperaci�n, tales como: Frutas ricas en            " +
                                                  "\n antioxidantes como ar�ndanos y moras: ayudan a reducir el estr�s oxidativo. Jengibre y c�rcuma: poseen propiedades   " +
                                                  "\n antiinflamatorias que pueden aliviar los s�ntomas. Pescados grasos como salm�n y sardinas: ricos en Omega-3, que     " +
                                                  "\n contribuyen a la salud celular y la cicatrizaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo        " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas   " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en   " +
                                                  "\n el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo " +
                                                  "\n se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: En adultos mayores con s�filis, la hidrataci�n es clave para ayudar al cuerpo a eliminar toxinas   " +
                                                  "\n y mantener la funci�n renal. Se recomienda un consumo diario de 2 a 2.5 litros de agua, adem�s de infusiones    " +
                                                  "\n sin cafe�na y caldos ligeros para mejorar la circulaci�n y reducir la fatiga. EJERCICIO: La actividad f�sica    " +
                                                  "\n debe ser moderada y adaptada a la condici�n del paciente, recomend�ndose ejercicios de bajo impacto como        " +
                                                  "\n caminatas suaves de 30 a 40 minutos al d�a, lo que ayuda a mejorar la circulaci�n y fortalecer el sistema       " +
                                                  "\n inmunol�gico. POSIBLE TRATAMIENTO: Para la s�filis en adultos mayores, el tratamiento est�ndar es penicilina    " +
                                                  "\n benzatina, administrada en una dosis �nica o en varias dosis dependiendo del estadio de la enfermedad. En casos " +
                                                  "\n de alergia a la penicilina, se pueden usar alternativas como la doxiciclina o la ceftriaxona. ALIMENTACI�N: Se  " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema    " + 
                                                  "\n inmune, tales como: Frutas c�tricas como naranjas y kiwis: ricas en vitamina C, que ayuda a reducir el estr�s   " +
                                                  "\n oxidativo. Pescados grasos como salm�n y at�n: ricos en Omega-3, que contribuyen a la salud cardiovascular.     " +
                                                  "\n Legumbres y frutos secos: fuentes de prote�nas y zinc, esenciales para la regeneraci�n celular. Este es solo un " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico" +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACI�N: En adultos mayores con tuberculosis, la hidrataci�n es fundamental para mantener la funci�n     " +
                                                  "\n pulmonar y reducir la viscosidad de las secreciones. Se recomienda un consumo diario de 2.5 a 3 litros de    " +
                                                  "\n agua, adem�s de caldos y jugos naturales sin az�car para mejorar la absorci�n de nutrientes y evitar la      " +
                                                  "\n deshidrataci�n causada por fiebre y sudoraci�n. EJERCICIO: La actividad f�sica debe ser m�nima durante la    " +
                                                  "\n fase aguda de la enfermedad, pero una vez en recuperaci�n, se recomienda caminar 20 a 30 minutos al d�a para     " +
                                                  "\n mejorar la capacidad pulmonar y evitar la p�rdida de masa muscular. POSIBLE TRATAMIENTO: Para la tuberculosis    " +
                                                  "\n en adultos mayores, el tratamiento est�ndar incluye una combinaci�n de antibi�ticos como isoniazida, rifampicina," +
                                                  "\n etambutol y pirazinamida, administrados durante un per�odo de 6 meses. Es crucial completar el tratamiento para  " +
                                                  "\n evitar reca�das y resistencia bacteriana. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en vitaminas " +
                                                  "\n y antioxidantes para fortalecer el sistema inmune, tales como: Frutas c�tricas como naranjas y kiwis: ricas en   " +
                                                  "\n vitamina C, que ayuda a reducir la duraci�n de los s�ntomas. Espinacas y br�coli: contienen antioxidantes y      " +
                                                  "\n vitamina E, esenciales para la recuperaci�n. Jengibre y c�rcuma: poseen propiedades antiinflamatorias que pueden    " +
                                                  "\n aliviar la congesti�n y el malestar general. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n       " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el     " +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo   " +
                                                  "\n se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N: En adultos mayores con artritis, la hidrataci�n es clave para mantener la lubricaci�n de las    " +
                                                  "\n articulaciones y reducir la inflamaci�n. Se recomienda un consumo diario de 2 a 2.5 litros de agua, adem�s   " +
                                                  "\n de infusiones de jengibre y c�rcuma para aliviar el dolor articular. EJERCICIO: La actividad f�sica debe     " +
                                                  "\n ser moderada y adaptada a la condici�n del paciente, recomend�ndose ejercicios de bajo impacto como caminatas   " +
                                                  "\n suaves de 30 a 45 minutos al d�a, adem�s de ejercicios de movilidad articular como yoga o tai chi. POSIBLE      " +
                                                  "\n TRATAMIENTO: Para la artritis en adultos mayores, el tratamiento suele incluir antiinflamatorios no esteroides  " +
                                                  "\n (AINEs) como ibuprofeno o naproxeno, adem�s de suplementos de glucosamina y condroitina para mejorar la salud   " +
                                                  "\n articular. En casos m�s severos, se pueden usar corticosteroides o terapia biol�gica. ALIMENTACI�N: Se recomienda  " +
                                                  "\n el consumo de alimentos con propiedades antiinflamatorias y antioxidantes para mejorar la funci�n articular,       " +
                                                  "\n tales como: Pescados grasos como salm�n y at�n: ricos en Omega-3, que ayudan a reducir la inflamaci�n de las       " +
                                                  "\n articulaciones. Frutas y verduras de colores vivos como ar�ndanos y espinacas: ricas en antioxidantes y vitamina C,  " +
                                                  "\n que fortalecen el sistema inmune. Jengibre y c�rcuma: contienen compuestos con efectos antiinflamatorios que pueden  " +
                                                  "\n ser beneficiosos para las articulaciones. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no   " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas," +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento     " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda" +
                                                  "\n mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: En adultos mayores con tosferina, la hidrataci�n es fundamental para aliviar la irritaci�n de   " +
                                                  "\n las v�as respiratorias y reducir la viscosidad de las secreciones. Se recomienda un consumo diario de 2.5 a  " +
                                                  "\n 3 litros de agua, distribuidos en peque�as cantidades a lo largo del d�a para evitar la fatiga respiratoria. " +
                                                  "\n Adem�s, se pueden incluir caldos tibios y t�s sin cafe�na para ayudar a calmar la garganta y reducir la      " +
                                                  "\n inflamaci�n. EJERCICIO: La actividad f�sica debe ser m�nima durante la fase aguda de la enfermedad, pero una  " +
                                                  "\n vez en recuperaci�n, se recomienda caminar 20 a 30 minutos al d�a para mejorar la capacidad pulmonar y evitar " +
                                                  "\n la p�rdida de masa muscular. POSIBLE TRATAMIENTO: Para la tosferina en adultos mayores, el tratamiento suele  " +
                                                  "\n incluir antibi�ticos como azitromicina, claritromicina o eritromicina, administrados en los primeros d�as de  " +
                                                  "\n la enfermedad para reducir la severidad de los s�ntomas. Tambi�n se recomienda el uso de broncodilatadores en " +
                                                  "\n casos de dificultad respiratoria severa. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en         " +
                                                  "\n antioxidantes y propiedades antiinflamatorias para fortalecer el sistema inmune, tales como: Frutas c�tricas  " +
                                                  "\n como naranjas y kiwis: ricas en vitamina C, que ayuda a reducir la inflamaci�n de las v�as respiratorias.     " +
                                                  "\n Jengibre y c�rcuma: poseen propiedades antiinflamatorias que pueden aliviar la congesti�n y el malestar general. " +
                                                  "\n Miel y prop�leo: ayudan a calmar la garganta y reducir la irritaci�n. Este es solo un Diagn�stico predeterminado " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad" +
                                                  "\n y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico   " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la    " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: En adultos mayores con paperas, la hidrataci�n es clave para reducir la fiebre y aliviar la    " +
                                                  "\n inflamaci�n de las gl�ndulas salivales. Se recomienda un consumo diario de 2 a 2.5 litros de agua, adem�s   " +
                                                  "\n de caldos ligeros y jugos naturales sin az�car para mejorar la absorci�n de nutrientes y evitar la          " +
                                                  "\n deshidrataci�n causada por fiebre. EJERCICIO: La actividad f�sica debe ser m�nima durante la fase aguda     " +
                                                  "\n de la enfermedad, pero una vez en recuperaci�n, se recomienda caminar 20 a 30 minutos al d�a para mejorar     " +
                                                  "\n la circulaci�n y evitar la p�rdida de masa muscular. POSIBLE TRATAMIENTO: Para las paperas en adultos mayores," +
                                                  "\n el tratamiento suele incluir analg�sicos como paracetamol o ibuprofeno para reducir el dolor y la fiebre.     " +
                                                  "\n Tambi�n se recomienda el uso de compresas fr�as en la zona inflamada para aliviar la hinchaz�n. ALIMENTACI�N:   " +
                                                  "\n Se recomienda el consumo de alimentos suaves y ricos en vitaminas para facilitar la recuperaci�n, tales como:   " +
                                                  "\n Yogur natural: fuente de probi�ticos que ayudan a restaurar la flora intestinal afectada por la fiebre. Frutas  " +
                                                  "\n ricas en vitamina C como fresas y pimientos: fortalecen el sistema inmune y aceleran la recuperaci�n. Sopas y   " +
                                                  "\n pur�s: f�ciles de consumir y ayudan a mantener la hidrataci�n. Este es solo un Diagn�stico predeterminado l�gico," +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus  " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le   " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app      " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N: En adultos mayores con Zika, la hidrataci�n es esencial para reducir la fiebre y prevenir la deshidrataci�n  " +
                                                  "\n causada por sudoraci�n excesiva. Se recomienda un consumo diario de 2.5 a 3 litros de agua, adem�s de infusiones de       " +
                                                  "\n manzanilla y caldos ligeros para aliviar molestias y fortalecer el sistema inmunol�gico. EJERCICIO: La actividad f�sica   " +
                                                  "\n debe ser m�nima durante la fase aguda de la enfermedad, pero una vez en recuperaci�n, se recomienda caminar 20 a 30       " +
                                                  "\n minutos al d�a para mejorar la circulaci�n y evitar la fatiga. POSIBLE TRATAMIENTO: Para el Zika en adultos mayores,      " +
                                                  "\n no existe un tratamiento espec�fico, pero se recomienda reposo, hidrataci�n y el uso de analg�sicos como paracetamol      " +
                                                  "\n para aliviar los s�ntomas. Se debe evitar el uso de aspirina y otros AINEs hasta descartar dengue para reducir el riesgo  " +
                                                  "\n de sangrado. ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antivirales y antioxidantes para mejorar " +
                                                  "\n la recuperaci�n, tales como: Frutas ricas en antioxidantes como ar�ndanos y moras: ayudan a reducir el estr�s oxidativo.  " +
                                                  "\n Jengibre y c�rcuma: poseen propiedades antiinflamatorias que pueden aliviar los s�ntomas. Pescados grasos como salm�n y   " +
                                                  "\n sardinas: ricos en Omega-3, que contribuyen a la salud celular y la cicatrizaci�n. Este es solo un Diagn�stico            " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la     " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer" +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le     " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida)    " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N: En adultos mayores con rotavirus, la hidrataci�n es esencial para prevenir la deshidrataci�n  " +
                                                  "\n severa causada por diarrea y v�mitos. Se recomienda un consumo diario de 3 a 3.5 litros de l�quidos,       " +
                                                  "\n incluyendo agua, sueros de rehidrataci�n oral y caldos ligeros. Es importante beber en peque�as cantidades " +
                                                  "\n y de manera frecuente para evitar la fatiga gastrointestinal. EJERCICIO: Durante la fase aguda de la       " +
                                                  "\n enfermedad, se recomienda reposo absoluto. Una vez en recuperaci�n, se pueden realizar caminatas suaves de " +
                                                  "\n 20 a 30 minutos al d�a para mejorar la circulaci�n y evitar la p�rdida de masa muscular. POSIBLE           " +
                                                  "\n TRATAMIENTO: No existe un tratamiento espec�fico para el rotavirus, pero se recomienda reposo, hidrataci�n " +
                                                  "\n y el uso de medicamentos como paracetamol para aliviar la fiebre y el malestar. En casos graves, puede ser " +
                                                  "\n necesaria la administraci�n de l�quidos intravenosos. ALIMENTACI�N: Se recomienda el consumo de alimentos  " +
                                                  "\n suaves y ricos en electrolitos para facilitar la recuperaci�n, tales como: Pl�tanos: ricos en potasio,     " +
                                                  "\n ayudan a reponer electrolitos perdidos. Arroz y pan tostado: f�ciles de digerir y ayudan a estabilizar el  " +
                                                  "\n sistema digestivo. Yogur natural: fuente de probi�ticos que ayudan a restaurar la flora intestinal. Este   " +
                                                  "\n es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente      " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se           " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento        " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo      " +
                                                  "\n se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida)         " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N: En adultos mayores con listeriosis, la hidrataci�n es clave para ayudar al cuerpo a eliminar    " +
                                                  "\n la bacteria y reducir la fiebre. Se recomienda un consumo diario de 2.5 a 3 litros de agua, adem�s de caldos " +
                                                  "\n ligeros y jugos naturales sin az�car para mejorar la absorci�n de nutrientes. EJERCICIO: La actividad f�sica " +
                                                  "\n debe ser m�nima durante la fase aguda de la enfermedad, pero una vez en recuperaci�n, se recomienda caminar  " +
                                                  "\n 20 a 30 minutos al d�a para mejorar la circulaci�n y fortalecer el sistema inmunol�gico. POSIBLE TRATAMIENTO:" +
                                                  "\n Para la listeriosis en adultos mayores, el tratamiento est�ndar es antibi�ticos como ampicilina o gentamicina," +
                                                  "\n administrados por v�a oral o intravenosa dependiendo de la gravedad del caso. ALIMENTACI�N: Se recomienda el  " +
                                                  "\n consumo de alimentos ricos en antioxidantes y propiedades antibacterianas para fortalecer el sistema inmune,  " +
                                                  "\n tales como: Ajo y cebolla: contienen compuestos con efectos antimicrobianos naturales. Frutas c�tricas como   " +
                                                  "\n naranjas y kiwis: ricas en vitamina C, que ayuda a reducir la inflamaci�n. Yogur natural: fuente de probi�ticos " +
                                                  "\n que ayudan a restaurar la flora intestinal afectada por los antibi�ticos. Este es solo un Diagn�stico           " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por   " +
                                                  "\n ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de     " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la    " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L        " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: En adultos mayores con shigelosis, la hidrataci�n es fundamental para prevenir la deshidrataci�n  " +
                                                  "\n causada por diarrea severa. Se recomienda un consumo diario de 3 a 3.5 litros de l�quidos, incluyendo agua,    " +
                                                  "\n sueros de rehidrataci�n oral y caldos ligeros. Es importante evitar bebidas con cafe�na y alcohol, ya que      " +
                                                  "\n pueden agravar la deshidrataci�n. EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo      " +
                                                  "\n absoluto. Una vez en recuperaci�n, se pueden realizar caminatas suaves de 20 a 30 minutos al d�a para mejorar  " +
                                                  "\n la circulaci�n y evitar la fatiga. POSIBLE TRATAMIENTO: Para la shigelosis en adultos mayores, el tratamiento  " +
                                                  "\n suele incluir antibi�ticos como ciprofloxacino o azitromicina, administrados por v�a oral para reducir la      " +
                                                  "\n duraci�n de los s�ntomas. Tambi�n se recomienda evitar el uso de medicamentos antidiarreicos, ya que pueden    " +
                                                  "\n empeorar la infecci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos suaves y ricos en electrolitos para " +
                                                  "\n facilitar la recuperaci�n, tales como: Pl�tanos: ricos en potasio, ayudan a reponer electrolitos perdidos.     " +
                                                  "\n Arroz y pan tostado: f�ciles de digerir y ayudan a estabilizar el sistema digestivo. Yogur natural: fuente     " +
                                                  "\n de probi�ticos que ayudan a restaurar la flora intestinal. Este es solo un Diagn�stico predeterminado l�gico,  " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor" +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le  " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app     " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: En adultos mayores con EPOC, la hidrataci�n es fundamental para mantener las v�as respiratorias  " +
                                                  "\n h�medas y facilitar la expulsi�n de mucosidad. Se recomienda un consumo diario de 2.5 a 3 litros de agua,     " +
                                                  "\n distribuidos en peque�as cantidades a lo largo del d�a para evitar la fatiga respiratoria. Tambi�n se pueden  " +
                                                  "\n incluir infusiones sin cafe�na y caldos tibios para mejorar la hidrataci�n sin irritar las v�as respiratorias." +
                                                  "\n EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la capacidad del paciente, recomend�ndose       " +
                                                  "\n ejercicios de bajo impacto como caminatas suaves de 30 a 45 minutos al d�a, adem�s de ejercicios de respiraci�n     " +
                                                  "\n profunda para mejorar la funci�n pulmonar. POSIBLE TRATAMIENTO: Para el EPOC en adultos mayores, el tratamiento     " +
                                                  "\n suele incluir broncodilatadores de acci�n prolongada como el tiotropio (Spiriva) y el salmeterol, corticosteroides  " +
                                                  "\n inhalados como la fluticasona (Flixotide), y en algunos casos, oxigenoterapia para mejorar la respiraci�n.          " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antioxidantes y antiinflamatorias para mejorar  " +
                                                  "\n la funci�n pulmonar, tales como: Pescados grasos como salm�n y at�n: ricos en Omega-3, que ayudan a reducir la      " +
                                                  "\n inflamaci�n de las v�as respiratorias. Frutas y verduras de colores vivos como ar�ndanos y espinacas: ricas en      " +
                                                  "\n antioxidantes y vitamina C, que fortalecen el sistema inmune. Jengibre y c�rcuma: contienen compuestos con efectos  " +
                                                  "\n antiinflamatorios que pueden ser beneficiosos para las v�as respiratorias. Este es solo un Diagn�stico predeterminado " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad   " +
                                                  "\n y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer    " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no   " +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app      " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: En adultos mayores con clamidia, la hidrataci�n es clave para ayudar al cuerpo a eliminar la bacteria  " +
                                                  "\n y reducir la inflamaci�n del tracto urinario. Se recomienda un consumo diario de 2 a 2.5 litros de agua, adem�s de  " +
                                                  "\n jugos naturales sin az�car y caldos ligeros para mejorar la funci�n renal y reducir molestias urinarias. EJERCICIO: " +
                                                  "\n La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente, recomend�ndose ejercicios de bajo     " +
                                                  "\n impacto como caminatas suaves de 30 a 40 minutos al d�a, evitando esfuerzos excesivos que puedan agravar los s�ntomas." +
                                                  "\n POSIBLE TRATAMIENTO: Para la clamidia en adultos mayores, el tratamiento recomendado es antibi�ticos como la          " +
                                                  "\n azitromicina en dosis �nica o la doxiciclina durante 7 d�as, asegurando la eliminaci�n completa de la bacteria.       " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antibacterianas y antiinflamatorias para mejorar  " +
                                                  "\n la recuperaci�n, tales como: Ajo y cebolla: contienen compuestos con efectos antimicrobianos naturales. Yogur natural:   " +
                                                  "\n fuente de probi�ticos que ayudan a restaurar la flora intestinal afectada por los antibi�ticos. Frutas y verduras ricas  " +
                                                  "\n en vitamina C como fresas y pimientos: fortalecen el sistema inmune y aceleran la recuperaci�n. Este es solo un          " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que    " +
                                                  "\n por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida  " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del       " +
                                                  "\n Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita     " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: En adultos mayores con meningitis bacteriana, la hidrataci�n es esencial para reducir la fiebre  " +
                                                  "\n y prevenir la deshidrataci�n causada por sudoraci�n excesiva. Se recomienda un consumo diario de 3 a 3.5      " +
                                                  "\n litros de agua, adem�s de infusiones de manzanilla y caldos ligeros para aliviar molestias y fortalecer el    " +
                                                  "\n sistema inmunol�gico. EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo absoluto. Una      " +
                                                  "\n vez en recuperaci�n, se pueden realizar caminatas suaves de 20 a 30 minutos al d�a para mejorar la circulaci�n   " + 
                                                  "\n y evitar la fatiga. POSIBLE TRATAMIENTO: Para la meningitis bacteriana en adultos mayores, el tratamiento suele  " +
                                                  "\n incluir antibi�ticos intravenosos como ceftriaxona o vancomicina, adem�s de corticosteroides para reducir la     " +
                                                  "\n inflamaci�n cerebral. ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antivirales y          " +
                                                  "\n antioxidantes para mejorar la recuperaci�n, tales como: Frutas ricas en antioxidantes como ar�ndanos y moras:    " +
                                                  "\n ayudan a reducir el estr�s oxidativo. Jengibre y c�rcuma: poseen propiedades antiinflamatorias que pueden aliviar  " +
                                                  "\n los s�ntomas. Pescados grasos como salm�n y sardinas: ricos en Omega-3, que contribuyen a la salud celular y la    " +
                                                  "\n cicatrizaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el   " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda " +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente,    " +
                                                  "\n adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su   " +
                                                  "\n m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: En adultos mayores con c�ncer, la hidrataci�n es fundamental para mantener la funci�n renal, reducir los efectos   " +
                                                  "\n secundarios de los tratamientos y mejorar la recuperaci�n. Se recomienda un consumo diario de 2.5 a 3.5 litros de agua, adem�s  " +
                                                  "\n de caldos ligeros, jugos naturales sin az�car y t�s sin cafe�na para mejorar la absorci�n de nutrientes y evitar la             " +
                                                  "\n deshidrataci�n causada por efectos secundarios como v�mitos o diarrea. EJERCICIO: La actividad f�sica debe ser adaptada a la    " +
                                                  "\n condici�n del paciente y el tipo de c�ncer, recomend�ndose ejercicios de bajo impacto como caminatas suaves de 30 a 45 minutos  " +
                                                  "\n al d�a, adem�s de ejercicios de movilidad para mejorar la circulaci�n y reducir la fatiga. POSIBLE TRATAMIENTO: Para el c�ncer  " +
                                                  "\n en adultos mayores, el tratamiento depende del tipo y estadio de la enfermedad. Puede incluir quimioterapia, radioterapia,      " +
                                                  "\n inmunoterapia o cirug�a, dependiendo de la evaluaci�n m�dica. En algunos casos, se recomienda tratamiento paliativo para mejorar" +
                                                  "\n la calidad de vida. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y propiedades antiinflamatorias  " +
                                                  "\n para fortalecer el sistema inmune y mejorar la recuperaci�n, tales como: Frutas c�tricas como naranjas y kiwis: ricas en        " +
                                                  "\n vitamina C, que ayuda a reducir el estr�s oxidativo. Pescados grasos como salm�n y at�n: ricos en Omega-3, que contribuyen      " +
                                                  "\n a la salud celular y la cicatrizaci�n. Verduras de hoja verde como espinacas y br�coli: contienen antioxidantes y vitamina E,   " +
                                                  "\n esenciales para la recuperaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%     " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda     " +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por    " +
                                                  "\n su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        
                        if(EstaturaMasculino.equals("1.65-1.80 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N: En adultos mayores, la gripe puede provocar una mayor p�rdida de l�quidos debido a fiebre, sudoraci�n    " +
                                                  "\n y disminuci�n del consumo de agua. Se recomienda un consumo diario de 2.5 a 3 litros de l�quidos, incluyendo agua,    " +
                                                  "\n caldos y t�s sin cafe�na, para prevenir la deshidrataci�n y ayudar a mantener la funci�n inmunol�gica. La hidrataci�n " +
                                                  "\n adecuada tambi�n contribuye a mantener las mucosas h�medas, lo que facilita la expulsi�n del virus y reduce la        " +
                                                  "\n irritaci�n en la garganta. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente,   " +
                                                  "\n recomend�ndose ejercicios de bajo impacto como caminatas suaves de 30 a 45 minutos al d�a, siempre evitando el        " +
                                                  "\n esfuerzo excesivo para no comprometer la recuperaci�n. POSIBLE TRATAMIENTO: Para la gripe en adultos mayores, se      " +
                                                  "\n recomienda el uso de antivirales como el oseltamivir (Tamiflu) para reducir la duraci�n y gravedad de los s�ntomas,   " +
                                                  "\n adem�s de medicamentos para aliviar la fiebre y el malestar como el paracetamol (Tempra) o el ibuprofeno (Advil).     " +
                                                  "\n Tambi�n es esencial la vacunaci�n anual contra la influenza para prevenir complicaciones graves. ALIMENTACI�N: Se     " +
                                                  "\n recomienda el consumo de frutas y verduras ricas en vitaminas y antioxidantes para fortalecer el sistema inmune,      " +
                                                  "\n tales como: Naranjas y kiwis: ricos en vitamina C, que ayuda a reducir la duraci�n de los s�ntomas. Espinacas y       " +
                                                  "\n br�coli: contienen antioxidantes y vitamina E, esenciales para la recuperaci�n. Jengibre y c�rcuma: poseen            " +
                                                  "\n propiedades antiinflamatorias que pueden aliviar la congesti�n y el malestar general. Este es solo un Diagn�stico     " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello    " +
                                                  "\n la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para" +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del     " +
                                                  "\n Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu     " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N: En adultos mayores con neumon�a, la fiebre alta y sudoraci�n excesiva pueden aumentar el riesgo    " +
                                                  "\n de deshidrataci�n. Se recomienda un consumo diario de 2.5 a 3 litros de agua, adem�s de caldos tibios y jugos   " +
                                                  "\n naturales sin az�car para mejorar la absorci�n de nutrientes y mantener las secreciones pulmonares m�s fluidas. " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser m�nima durante la fase aguda de la enfermedad, pero una vez en              " +
                                                  "\n recuperaci�n, se recomienda caminar 20 a 30 minutos al d�a para mejorar la capacidad pulmonar y evitar la p�rdida   " +
                                                  "\n de masa muscular. POSIBLE TRATAMIENTO: Para la neumon�a en adultos mayores, el tratamiento suele incluir            " +
                                                  "\n antibi�ticos como la amoxicilina o la azitromicina, dependiendo del tipo de infecci�n. Tambi�n se pueden administrar" +
                                                  "\n medicamentos para reducir la fiebre y aliviar el malestar, como el paracetamol (Tempra) o el ibuprofeno (Advil).    " +
                                                  "\n En casos graves, puede ser necesario el uso de ox�geno suplementario. ALIMENTACI�N: Se recomienda el consumo de     " +
                                                  "\n alimentos ricos en vitaminas y antioxidantes para fortalecer el sistema inmune, tales como: Naranjas y kiwis: ricos " +
                                                  "\n en vitamina C, que ayuda a reducir la duraci�n de los s�ntomas. Espinacas y br�coli: contienen antioxidantes y      " +
                                                  "\n vitamina E, esenciales para la recuperaci�n. Jengibre y c�rcuma: poseen propiedades antiinflamatorias que pueden    " +
                                                  "\n aliviar la congesti�n y el malestar general. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n       " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el     " +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo   " +
                                                  "\n se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACI�N: En adultos mayores con diabetes, la hidrataci�n es clave para mantener niveles adecuados de glucosa  " +
                                                  "\n en sangre y prevenir complicaciones renales. Se recomienda un consumo diario de 2 a 2.5 litros de agua, evitando  " +
                                                  "\n bebidas azucaradas y con cafe�na, ya que pueden afectar el control de la glucosa. EJERCICIO: La actividad f�sica  " +
                                                  "\n debe ser moderada y adaptada a la condici�n del paciente, recomend�ndose ejercicios de bajo impacto como caminatas" +
                                                  "\n suaves de 30 a 45 minutos al d�a, lo que ayuda a mejorar la sensibilidad a la insulina y controlar el peso.       " +
                                                  "\n POSIBLE TRATAMIENTO: Para la diabetes en adultos mayores, el tratamiento suele incluir medicamentos como la       " +
                                                  "\n metformina para mejorar la sensibilidad a la insulina, adem�s de insulina en algunos casos. Tambi�n se recomienda    " +
                                                  "\n el monitoreo constante de la glucosa y ajustes en la dieta. ALIMENTACI�N: Se recomienda el consumo de alimentos      " +
                                                  "\n con bajo �ndice gluc�mico y ricos en fibra para estabilizar los niveles de az�car en sangre, tales como: Avena y     " +
                                                  "\n legumbres: ayudan a regular la glucosa y mejorar la digesti�n. Frutas como manzanas y peras: contienen fibra y       " +
                                                  "\n antioxidantes sin elevar bruscamente la glucosa. Verduras de hoja verde como espinacas y acelgas: ricas en magnesio, " +
                                                  "\n que ayuda a mejorar la sensibilidad a la insulina. Este es solo un Diagn�stico predeterminado l�gico, haberlo        " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas   " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en   " +
                                                  "\n el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo " +
                                                  "\n se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: En adultos mayores con asma, la hidrataci�n es fundamental para mantener las v�as respiratorias h�medas    " +
                                                  "\n y reducir la irritaci�n. Se recomienda un consumo diario de 2 a 2.5 litros de agua, adem�s de infusiones sin cafe�na    " +
                                                  "\n que ayuden a despejar las v�as respiratorias. Tambi�n es importante evitar bebidas con cafe�na y alcohol, ya que pueden " +
                                                  "\n aumentar la inflamaci�n y la producci�n de moco. EJERCICIO: La actividad f�sica debe ser controlada y adaptada a la     " +
                                                  "\n capacidad del paciente, recomend�ndose ejercicios de bajo impacto como caminatas suaves de 30 a 40 minutos al d�a,      " +
                                                  "\n evitando ambientes fr�os o contaminados que puedan desencadenar s�ntomas. POSIBLE TRATAMIENTO: Para el asma en adultos  " +
                                                  "\n mayores, el tratamiento suele incluir broncodilatadores de alivio r�pido como el salbutamol (Ventolin), corticosteroides" +
                                                  "\n inhalados como la fluticasona (Flixotide) y en algunos casos, modificadores de leucotrienos como el montelukast         " +
                                                  "\n (Singulair). ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antiinflamatorias y antioxidantes para " +
                                                  "\n mejorar la funci�n pulmonar, tales como: Pescados grasos como salm�n y at�n: ricos en Omega-3, que ayudan a reducir la  " +
                                                  "\n inflamaci�n de las v�as respiratorias. Frutas y verduras de colores vivos como ar�ndanos y espinacas: ricas en          " +
                                                  "\n antioxidantes y vitamina C, que fortalecen el sistema inmune. Jengibre y c�rcuma: contienen compuestos con efectos      " +
                                                  "\n antiinflamatorios que pueden ser beneficiosos para las v�as respiratorias. Este es solo un Diagn�stico predeterminado   " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y     " +
                                                  "\n sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor    " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: En adultos mayores con VIH/SIDA, la hidrataci�n es fundamental para mantener la funci�n renal    " +
                                                  "\n y reducir los efectos secundarios de los medicamentos antirretrovirales. Se recomienda un consumo diario de   " +
                                                  "\n 2.5 a 3 litros de agua, adem�s de infusiones sin cafe�na y caldos ligeros para mejorar la absorci�n de        " +
                                                  "\n nutrientes y evitar la deshidrataci�n causada por fiebre o diarrea. Tambi�n es importante consumir l�quidos   " +
                                                  "\n ricos en electrolitos para mantener el equilibrio mineral del cuerpo. EJERCICIO: La actividad f�sica debe ser " +
                                                  "\n moderada y adaptada a la condici�n del paciente, recomend�ndose ejercicios de bajo impacto como caminatas     " +
                                                  "\n suaves de 30 a 45 minutos al d�a, lo que ayuda a fortalecer el sistema inmunol�gico y mejorar la salud        " +
                                                  "\n cardiovascular. POSIBLE TRATAMIENTO: Para el VIH/SIDA en adultos mayores, el tratamiento incluye terapia      " +
                                                  "\n antirretroviral (TAR) con combinaciones de medicamentos como tenofovir, emtricitabina y dolutegravir, que     " +
                                                  "\n ayudan a mantener el virus bajo control y mejorar la calidad de vida. Es crucial el monitoreo constante de    " +
                                                  "\n la carga viral y el estado inmunol�gico. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en              " +
                                                  "\n antioxidantes y prote�nas para fortalecer el sistema inmune, tales como: Frutas c�tricas como naranjas y kiwis:    " +
                                                  "\n ricas en vitamina C, que ayuda a reducir el estr�s oxidativo. Pescados grasos como salm�n y at�n: ricos en Omega-3,  " +
                                                  "\n que contribuyen a la salud cardiovascular. Legumbres y frutos secos: fuentes de prote�nas y zinc, esenciales para    " +
                                                  "\n la regeneraci�n celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%  " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se     " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su   " +
                                                  "\n paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho        " +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: En adultos mayores con gonorrea, la hidrataci�n es clave para ayudar a eliminar la bacteria y    " +
                                                  "\n reducir la inflamaci�n del tracto urinario. Se recomienda un consumo diario de 2 a 2.5 litros de agua, adem�s " +
                                                  "\n de jugos naturales sin az�car y caldos ligeros para mejorar la funci�n renal y reducir molestias urinarias.   " +
                                                  "\n Tambi�n es importante evitar bebidas con cafe�na y alcohol, ya que pueden irritar el tracto urinario.         " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente, recomend�ndose       " +
                                                  "\n ejercicios de bajo impacto como caminatas suaves de 30 a 40 minutos al d�a, evitando esfuerzos excesivos      " +
                                                  "\n que puedan agravar los s�ntomas. POSIBLE TRATAMIENTO: Para la gonorrea en adultos mayores, el tratamiento     " +
                                                  "\n recomendado es una dosis �nica de ceftriaxona 500 mg administrada por v�a intramuscular, acompa�ada de        " +
                                                  "\n doxiciclina en caso de coinfecci�n con clamidia. Es fundamental completar el tratamiento y evitar relaciones  " +
                                                  "\n sexuales hasta la recuperaci�n total. ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades     " +
                                                  "\n antibacterianas y antiinflamatorias para mejorar la recuperaci�n, tales como: Ajo y cebolla: contienen compuestos  " +
                                                  "\n con efectos antimicrobianos naturales. Yogur natural: fuente de probi�ticos que ayudan a restaurar la flora        " +
                                                  "\n intestinal afectada por los antibi�ticos. Frutas y verduras ricas en vitamina C como fresas y pimientos: fortalecen" +
                                                  "\n el sistema inmune y aceleran la recuperaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n      " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el    " +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo  " +
                                                  "\n se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: En adultos mayores con herpes genital, la hidrataci�n es esencial para reducir la inflamaci�n y mejorar  " +
                                                  "\n la cicatrizaci�n de las lesiones. Se recomienda un consumo diario de 2 a 2.5 litros de agua, adem�s de infusiones de  " +
                                                  "\n manzanilla y caldos ligeros para aliviar molestias y fortalecer el sistema inmunol�gico. Tambi�n es importante evitar " +
                                                  "\n bebidas con cafe�na y alcohol, ya que pueden irritar la piel y prolongar los brotes. EJERCICIO: La actividad f�sica   " +
                                                  "\n debe ser moderada y adaptada a la condici�n del paciente, recomend�ndose ejercicios de bajo impacto como caminatas    " +
                                                  "\n suaves de 30 a 40 minutos al d�a, evitando el estr�s excesivo que pueda desencadenar brotes. POSIBLE TRATAMIENTO:     " +
                                                  "\n Para el herpes genital en adultos mayores, el tratamiento suele incluir antivirales como aciclovir, valaciclovir      " +
                                                  "\n o famciclovir, que ayudan a reducir la duraci�n y gravedad de los brotes. Tambi�n se recomienda el uso de cremas      " +
                                                  "\n t�picas para aliviar el dolor y la inflamaci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades   " +
                                                  "\n antivirales y antiinflamatorias para mejorar la recuperaci�n, tales como: Frutas ricas en antioxidantes como ar�ndanos" +
                                                  "\n y moras: ayudan a reducir el estr�s oxidativo. Jengibre y c�rcuma: poseen propiedades antiinflamatorias que pueden    " +
                                                  "\n aliviar los s�ntomas. Pescados grasos como salm�n y sardinas: ricos en Omega-3, que contribuyen a la salud celular    " +
                                                  "\n y la cicatrizaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que    " +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda" +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente,     " +
                                                  "\n adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su    " +
                                                  "\n m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: En adultos mayores con s�filis, la hidrataci�n es clave para ayudar al cuerpo a eliminar toxinas  " +
                                                  "\n y mantener la funci�n renal. Se recomienda un consumo diario de 2 a 2.5 litros de agua, adem�s de infusiones   " +
                                                  "\n sin cafe�na y caldos ligeros para mejorar la circulaci�n y reducir la fatiga. Tambi�n es importante consumir   " +
                                                  "\n l�quidos ricos en electrolitos para mantener el equilibrio mineral del cuerpo. EJERCICIO: La actividad f�sica  " +
                                                  "\n debe ser moderada y adaptada a la condici�n del paciente, recomend�ndose ejercicios de bajo impacto como       " +
                                                  "\n caminatas suaves de 30 a 40 minutos al d�a, lo que ayuda a mejorar la circulaci�n y fortalecer el sistema        " +
                                                  "\n inmunol�gico. POSIBLE TRATAMIENTO: Para la s�filis en adultos mayores, el tratamiento est�ndar es penicilina     " +
                                                  "\n benzatina, administrada en una dosis �nica o en varias dosis dependiendo del estadio de la enfermedad. En casos  " +
                                                  "\n de alergia a la penicilina, se pueden usar alternativas como la doxiciclina o la ceftriaxona. ALIMENTACI�N: Se   " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema     " +
                                                  "\n inmune, tales como: Frutas c�tricas como naranjas y kiwis: ricas en vitamina C, que ayuda a reducir el estr�s    " +
                                                  "\n oxidativo. Pescados grasos como salm�n y at�n: ricos en Omega-3, que contribuyen a la salud cardiovascular.      " +
                                                  "\n Legumbres y frutos secos: fuentes de prote�nas y zinc, esenciales para la regeneraci�n celular. Este es solo     " +
                                                  "\n un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad" +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico" +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la   " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACI�N: En adultos mayores con tuberculosis, la hidrataci�n es fundamental para mantener la funci�n     " +
                                                  "\n pulmonar y reducir la viscosidad de las secreciones. Se recomienda un consumo diario de 2.5 a 3 litros de    " +
                                                  "\n agua, adem�s de caldos y jugos naturales sin az�car para mejorar la absorci�n de nutrientes y evitar la      " +
                                                  "\n deshidrataci�n causada por fiebre y sudoraci�n. Tambi�n es importante evitar bebidas con cafe�na y alcohol,     " +
                                                  "\n ya que pueden irritar las v�as respiratorias. EJERCICIO: La actividad f�sica debe ser m�nima durante la fase    " +
                                                  "\n aguda de la enfermedad, pero una vez en recuperaci�n, se recomienda caminar 20 a 30 minutos al d�a para mejorar " +
                                                  "\n la capacidad pulmonar y evitar la p�rdida de masa muscular. POSIBLE TRATAMIENTO: Para la tuberculosis en adultos" +
                                                  "\n mayores, el tratamiento est�ndar incluye una combinaci�n de antibi�ticos como isoniazida, rifampicina, etambutol" +
                                                  "\n y pirazinamida, administrados durante un per�odo de 6 meses. Es crucial completar el tratamiento para evitar    " +
                                                  "\n reca�das y resistencia bacteriana. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en vitaminas y     " +
                                                  "\n antioxidantes para fortalecer el sistema inmune, tales como: Frutas c�tricas como naranjas y kiwis: ricas en    " +
                                                  "\n vitamina C, que ayuda a reducir la duraci�n de los s�ntomas. Espinacas y br�coli: contienen antioxidantes y     " +
                                                  "\n vitamina E, esenciales para la recuperaci�n. Jengibre y c�rcuma: poseen propiedades antiinflamatorias que pueden   " +
                                                  "\n aliviar la congesti�n y el malestar general. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n      " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el    " +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo  " +
                                                  "\n se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N: En adultos mayores con artritis, la hidrataci�n es clave para mantener la lubricaci�n de las     " +
                                                  "\n articulaciones y reducir la inflamaci�n. Se recomienda un consumo diario de 2 a 2.5 litros de agua, adem�s    " +
                                                  "\n de infusiones de jengibre y c�rcuma para aliviar el dolor articular. Tambi�n es importante consumir l�quidos  " +
                                                  "\n ricos en electrolitos para mantener el equilibrio mineral del cuerpo. EJERCICIO: La actividad f�sica debe ser    " +
                                                  "\n moderada y adaptada a la condici�n del paciente, recomend�ndose ejercicios de bajo impacto como caminatas suaves " +
                                                  "\n de 30 a 45 minutos al d�a, adem�s de ejercicios de movilidad articular como yoga o tai chi. POSIBLE TRATAMIENTO: " +
                                                  "\n Para la artritis en adultos mayores, el tratamiento suele incluir antiinflamatorios no esteroides (AINEs) como   " +
                                                  "\n ibuprofeno o naproxeno, adem�s de suplementos de glucosamina y condroitina para mejorar la salud articular. En   " +
                                                  "\n casos m�s severos, se pueden usar corticosteroides o terapia biol�gica. ALIMENTACI�N: Se recomienda el consumo   " +
                                                  "\n de alimentos con propiedades antiinflamatorias y antioxidantes para mejorar la funci�n articular, tales como:    " +
                                                  "\n Pescados grasos como salm�n y at�n: ricos en Omega-3, que ayudan a reducir la inflamaci�n de las articulaciones. " +
                                                  "\n Frutas y verduras de colores vivos como ar�ndanos y espinacas: ricas en antioxidantes y vitamina C, que fortalecen " +
                                                  "\n el sistema inmune. Jengibre y c�rcuma: contienen compuestos con efectos antiinflamatorios que pueden ser           " +
                                                  "\n beneficiosos para las articulaciones. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no     " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n         " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el    " +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo  " +
                                                  "\n se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: En adultos mayores con tosferina, la hidrataci�n es fundamental para aliviar la irritaci�n de     " +
                                                  "\n las v�as respiratorias y reducir la viscosidad de las secreciones. Se recomienda un consumo diario de 2.5 a    " +
                                                  "\n 3 litros de agua, distribuidos en peque�as cantidades a lo largo del d�a para evitar la fatiga respiratoria.   " +
                                                  "\n Adem�s, se pueden incluir caldos tibios y t�s sin cafe�na para ayudar a calmar la garganta y reducir la        " +
                                                  "\n inflamaci�n. EJERCICIO: La actividad f�sica debe ser m�nima durante la fase aguda de la enfermedad, pero una   " +
                                                  "\n vez en recuperaci�n, se recomienda caminar 20 a 30 minutos al d�a para mejorar la capacidad pulmonar y evitar  " +
                                                  "\n la p�rdida de masa muscular. POSIBLE TRATAMIENTO: Para la tosferina en adultos mayores, el tratamiento suele   " +
                                                  "\n incluir antibi�ticos como azitromicina, claritromicina o eritromicina, administrados en los primeros d�as de   " +
                                                  "\n la enfermedad para reducir la severidad de los s�ntomas. Tambi�n se recomienda el uso de broncodilatadores en  " +
                                                  "\n casos de dificultad respiratoria severa. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes" +
                                                  "\n y propiedades antiinflamatorias para fortalecer el sistema inmune, tales como: Frutas c�tricas como naranjas      " +
                                                  "\n y kiwis: ricas en vitamina C, que ayuda a reducir la inflamaci�n de las v�as respiratorias. Jengibre y c�rcuma:   " +
                                                  "\n poseen propiedades antiinflamatorias que pueden aliviar la congesti�n y el malestar general. Miel y prop�leo:     " +
                                                  "\n ayudan a calmar la garganta y reducir la irritaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo   " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas" +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad   " +
                                                  "\n en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del" +
                                                  "\n todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: En adultos mayores con paperas, la hidrataci�n es clave para reducir la fiebre y aliviar la inflamaci�n " +
                                                  "\n de las gl�ndulas salivales. Se recomienda un consumo diario de 2 a 2.5 litros de agua, adem�s de caldos ligeros y    " +
                                                  "\n jugos naturales sin az�car para mejorar la absorci�n de nutrientes y evitar la deshidrataci�n causada por fiebre.    " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser m�nima durante la fase aguda de la enfermedad, pero una vez en recuperaci�n, " +
                                                  "\n se recomienda caminar 20 a 30 minutos al d�a para mejorar la circulaci�n y evitar la p�rdida de masa muscular.       " +
                                                  "\n POSIBLE TRATAMIENTO: Para las paperas en adultos mayores, el tratamiento suele incluir analg�sicos como paracetamol  " +
                                                  "\n o ibuprofeno para reducir el dolor y la fiebre. Tambi�n se recomienda el uso de compresas fr�as en la zona inflamada " +
                                                  "\n para aliviar la hinchaz�n. ALIMENTACI�N: Se recomienda el consumo de alimentos suaves y ricos en vitaminas para      " +
                                                  "\n facilitar la recuperaci�n, tales como: Yogur natural: fuente de probi�ticos que ayudan a restaurar la flora intestinal " +
                                                  "\n afectada por la fiebre. Frutas ricas en vitamina C como fresas y pimientos: fortalecen el sistema inmune y aceleran la " +
                                                  "\n recuperaci�n. Sopas y pur�s: f�ciles de consumir y ayudan a mantener la hidrataci�n. Este es solo un Diagn�stico       " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello     " +
                                                  "\n la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para    " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del     " +
                                                  "\n Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu     " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N: En adultos mayores con Zika, la hidrataci�n es esencial para reducir la fiebre y prevenir la deshidrataci�n  " +
                                                  "\n causada por sudoraci�n excesiva. Se recomienda un consumo diario de 2.5 a 3 litros de agua, adem�s de infusiones de       " +
                                                  "\n manzanilla y caldos ligeros para aliviar molestias y fortalecer el sistema inmunol�gico. Tambi�n es importante evitar     " +
                                                  "\n bebidas con cafe�na y alcohol, ya que pueden irritar el sistema digestivo y empeorar los s�ntomas. EJERCICIO: La actividad" +
                                                  "\n f�sica debe ser m�nima durante la fase aguda de la enfermedad, pero una vez en recuperaci�n, se recomienda caminar 20 a 30" +
                                                  "\n minutos al d�a para mejorar la circulaci�n y evitar la fatiga. POSIBLE TRATAMIENTO: Para el Zika en adultos mayores, no   " +
                                                  "\n existe un tratamiento espec�fico, pero se recomienda reposo, hidrataci�n y el uso de analg�sicos como paracetamol para    " +
                                                  "\n aliviar los s�ntomas. Se debe evitar el uso de aspirina y otros AINEs hasta descartar dengue para reducir el riesgo de    " +
                                                  "\n sangrado. ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antivirales y antioxidantes para mejorar    " +
                                                  "\n la recuperaci�n, tales como: Frutas ricas en antioxidantes como ar�ndanos y moras: ayudan a reducir el estr�s oxidativo.  " +
                                                  "\n Jengibre y c�rcuma: poseen propiedades antiinflamatorias que pueden aliviar los s�ntomas. Pescados grasos como salm�n y   " +
                                                  "\n sardinas: ricos en Omega-3, que contribuyen a la salud celular y la cicatrizaci�n. Este es solo un Diagn�stico            " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la     " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para          " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida)" +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N: En adultos mayores con rotavirus, la hidrataci�n es esencial para prevenir la deshidrataci�n   " +
                                                  "\n severa causada por diarrea y v�mitos. Se recomienda un consumo diario de 3 a 3.5 litros de l�quidos,        " +
                                                  "\n incluyendo agua, sueros de rehidrataci�n oral y caldos ligeros. Es importante beber en peque�as cantidades  " +
                                                  "\n y de manera frecuente para evitar la fatiga gastrointestinal. EJERCICIO: Durante la fase aguda de la        " +
                                                  "\n enfermedad, se recomienda reposo absoluto. Una vez en recuperaci�n, se pueden realizar caminatas suaves de  " +
                                                  "\n 20 a 30 minutos al d�a para mejorar la circulaci�n y evitar la p�rdida de masa muscular. POSIBLE TRATAMIENTO:" +
                                                  "\n No existe un tratamiento espec�fico para el rotavirus, pero se recomienda reposo, hidrataci�n y el uso de    " +
                                                  "\n medicamentos como paracetamol para aliviar la fiebre y el malestar. En casos graves, puede ser necesaria la " +
                                                  "\n administraci�n de l�quidos intravenosos. ALIMENTACI�N: Se recomienda el consumo de alimentos suaves y ricos " +
                                                  "\n en electrolitos para facilitar la recuperaci�n, tales como: Pl�tanos: ricos en potasio, ayudan a reponer    " +
                                                  "\n electrolitos perdidos. Arroz y pan tostado: f�ciles de digerir y ayudan a estabilizar el sistema digestivo. " +
                                                  "\n Yogur natural: fuente de probi�ticos que ayudan a restaurar la flora intestinal. Este es solo un Diagn�stico  " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por " +
                                                  "\n ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de   " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la  " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N: En adultos mayores con listeriosis, la hidrataci�n es clave para ayudar al cuerpo a eliminar la  " +
                                                  "\n bacteria y reducir la fiebre. Se recomienda un consumo diario de 2.5 a 3 litros de agua, adem�s de caldos     " +
                                                  "\n ligeros y jugos naturales sin az�car para mejorar la absorci�n de nutrientes. EJERCICIO: La actividad f�sica  " +
                                                  "\n debe ser m�nima durante la fase aguda de la enfermedad, pero una vez en recuperaci�n, se recomienda caminar   " +
                                                  "\n 20 a 30 minutos al d�a para mejorar la circulaci�n y fortalecer el sistema inmunol�gico. POSIBLE TRATAMIENTO: " +
                                                  "\n Para la listeriosis en adultos mayores, el tratamiento est�ndar es antibi�ticos como ampicilina o gentamicina," +
                                                  "\n administrados por v�a oral o intravenosa dependiendo de la gravedad del caso. ALIMENTACI�N: Se recomienda el  " +
                                                  "\n consumo de alimentos ricos en antioxidantes y propiedades antibacterianas para fortalecer el sistema inmune,  " +
                                                  "\n tales como: Ajo y cebolla: contienen compuestos con efectos antimicrobianos naturales. Frutas c�tricas como   " +
                                                  "\n naranjas y kiwis: ricas en vitamina C, que ayuda a reducir la inflamaci�n. Yogur natural: fuente de probi�ticos" +
                                                  "\n que ayudan a restaurar la flora intestinal afectada por los antibi�ticos. Este es solo un Diagn�stico         " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por " +
                                                  "\n ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de   " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la  " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes" +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: En adultos mayores con shigelosis, la hidrataci�n es fundamental para prevenir la deshidrataci�n  " +
                                                  "\n causada por diarrea severa. Se recomienda un consumo diario de 3 a 3.5 litros de l�quidos, incluyendo agua,    " +
                                                  "\n sueros de rehidrataci�n oral y caldos ligeros. Es importante evitar bebidas con cafe�na y alcohol, ya que      " +
                                                  "\n pueden agravar la deshidrataci�n. EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo      " +
                                                  "\n absoluto. Una vez en recuperaci�n, se pueden realizar caminatas suaves de 20 a 30 minutos al d�a para mejorar  " +
                                                  "\n la circulaci�n y evitar la fatiga. POSIBLE TRATAMIENTO: Para la shigelosis en adultos mayores, el tratamiento  " +
                                                  "\n suele incluir antibi�ticos como ciprofloxacino o azitromicina, administrados por v�a oral para reducir la duraci�n " +
                                                  "\n de los s�ntomas. Tambi�n se recomienda evitar el uso de medicamentos antidiarreicos, ya que pueden empeorar la     " + 
                                                  "\n infecci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos suaves y ricos en electrolitos para facilitar la    " +
                                                  "\n recuperaci�n, tales como: Pl�tanos: ricos en potasio, ayudan a reponer electrolitos perdidos. Arroz y pan tostado: " +
                                                  "\n f�ciles de digerir y ayudan a estabilizar el sistema digestivo. Yogur natural: fuente de probi�ticos que ayudan a  " +
                                                  "\n restaurar la flora intestinal. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza  " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para   " +
                                                  "\n ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento   " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le   " +
                                                  "\n recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: En adultos mayores con EPOC, la hidrataci�n es fundamental para mantener las v�as respiratorias h�medas   " +
                                                  "\n y facilitar la expulsi�n de mucosidad. Se recomienda un consumo diario de 2.5 a 3 litros de agua, distribuidos en      " +
                                                  "\n peque�as cantidades a lo largo del d�a para evitar la fatiga respiratoria. Tambi�n se pueden incluir infusiones sin    " +
                                                  "\n cafe�na y caldos tibios para mejorar la hidrataci�n sin irritar las v�as respiratorias. EJERCICIO: La actividad f�sica    " +
                                                  "\n debe ser moderada y adaptada a la capacidad del paciente, recomend�ndose ejercicios de bajo impacto como caminatas suaves " +
                                                  "\n de 30 a 45 minutos al d�a, adem�s de ejercicios de respiraci�n profunda para mejorar la funci�n pulmonar. POSIBLE         " +
                                                  "\n TRATAMIENTO: Para el EPOC en adultos mayores, el tratamiento suele incluir broncodilatadores de acci�n prolongada como    " +
                                                  "\n el tiotropio (Spiriva) y el salmeterol, corticosteroides inhalados como la fluticasona (Flixotide), y en algunos casos,   " +
                                                  "\n oxigenoterapia para mejorar la respiraci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades           " +
                                                  "\n antioxidantes y antiinflamatorias para mejorar la funci�n pulmonar, tales como: Pescados grasos como salm�n y at�n: ricos " +
                                                  "\n en Omega-3, que ayudan a reducir la inflamaci�n de las v�as respiratorias. Frutas y verduras de colores vivos como         " +
                                                  "\n ar�ndanos y espinacas: ricas en antioxidantes y vitamina C, que fortalecen el sistema inmune. Jengibre y c�rcuma: contienen" +
                                                  "\n compuestos con efectos antiinflamatorios que pueden ser beneficiosos para las v�as respiratorias. Este es solo un         " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por " +
                                                  "\n ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para  " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida)" +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: En adultos mayores con clamidia, la hidrataci�n es clave para ayudar al cuerpo a eliminar la bacteria y    " +
                                                  "\n reducir la inflamaci�n del tracto urinario. Se recomienda un consumo diario de 2 a 2.5 litros de agua, adem�s de jugos  " +
                                                  "\n naturales sin az�car y caldos ligeros para mejorar la funci�n renal y reducir molestias urinarias. Tambi�n es importante " +
                                                  "\n evitar bebidas con cafe�na y alcohol, ya que pueden irritar el tracto urinario. EJERCICIO: La actividad f�sica debe ser  " +
                                                  "\n moderada y adaptada a la condici�n del paciente, recomend�ndose ejercicios de bajo impacto como caminatas suaves de 30   " +
                                                  "\n a 40 minutos al d�a, evitando esfuerzos excesivos que puedan agravar los s�ntomas. POSIBLE TRATAMIENTO: Para la clamidia " +
                                                  "\n en adultos mayores, el tratamiento recomendado es antibi�ticos como la azitromicina en dosis �nica o la doxiciclina durante " +
                                                  "\n 7 d�as, asegurando la eliminaci�n completa de la bacteria. ALIMENTACI�N: Se recomienda el consumo de alimentos con          " +
                                                  "\n propiedades antibacterianas y antiinflamatorias para mejorar la recuperaci�n, tales como: Ajo y cebolla: contienen compuestos" +
                                                  "\n con efectos antimicrobianos naturales. Yogur natural: fuente de probi�ticos que ayudan a restaurar la flora intestinal      " +
                                                  "\n afectada por los antibi�ticos. Frutas y verduras ricas en vitamina C como fresas y pimientos: fortalecen el sistema inmune  " +
                                                  "\n y aceleran la recuperaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que  " +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer " +
                                                  "\n m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su     " +
                                                  "\n salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: En adultos mayores con meningitis bacteriana, la hidrataci�n es esencial para reducir la fiebre    " +
                                                  "\n y prevenir la deshidrataci�n causada por sudoraci�n excesiva. Se recomienda un consumo diario de 3 a 3.5 litros " +
                                                  "\n de agua, adem�s de infusiones de manzanilla y caldos ligeros para aliviar molestias y fortalecer el sistema     " +
                                                  "\n inmunol�gico. Tambi�n es importante consumir l�quidos ricos en electrolitos para mantener el equilibrio mineral " +
                                                  "\n del cuerpo. EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo absoluto. Una vez en        " +
                                                  "\n recuperaci�n, se pueden realizar caminatas suaves de 20 a 30 minutos al d�a para mejorar la circulaci�n y evitar" +
                                                  "\n la fatiga. POSIBLE TRATAMIENTO: Para la meningitis bacteriana en adultos mayores, el tratamiento suele incluir  " +
                                                  "\n antibi�ticos intravenosos como ceftriaxona o vancomicina, adem�s de corticosteroides para reducir la inflamaci�n" +
                                                  "\n cerebral. ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antivirales y antioxidantes para  " +
                                                  "\n mejorar la recuperaci�n, tales como: Frutas ricas en antioxidantes como ar�ndanos y moras: ayudan a reducir el  " +
                                                  "\n estr�s oxidativo. Jengibre y c�rcuma: poseen propiedades antiinflamatorias que pueden aliviar los s�ntomas.     " +
                                                  "\n Pescados grasos como salm�n y sardinas: ricos en Omega-3, que contribuyen a la salud celular y la cicatrizaci�n." +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga" +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s " +
                                                  "\n de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s  " +
                                                  "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su     " +
                                                  "\n m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: En adultos mayores con c�ncer, la hidrataci�n es fundamental para mantener la funci�n renal, reducir los efectos  " +
                                                  "\n secundarios de los tratamientos y mejorar la recuperaci�n. Se recomienda un consumo diario de 2.5 a 3.5 litros de agua, adem�s " +
                                                  "\n de caldos ligeros, jugos naturales sin az�car y t�s sin cafe�na para mejorar la absorci�n de nutrientes y evitar la            " +
                                                  "\n deshidrataci�n causada por efectos secundarios como v�mitos o diarrea. EJERCICIO: La actividad f�sica debe ser adaptada a la   " +
                                                  "\n condici�n del paciente y el tipo de c�ncer, recomend�ndose ejercicios de bajo impacto como caminatas suaves de 30 a 45 minutos " +
                                                  "\n al d�a, adem�s de ejercicios de movilidad para mejorar la circulaci�n y reducir la fatiga. POSIBLE TRATAMIENTO: Para el c�ncer " +
                                                  "\n en adultos mayores, el tratamiento depende del tipo y estadio de la enfermedad. Puede incluir quimioterapia, radioterapia,   " +
                                                  "\n inmunoterapia o cirug�a, dependiendo de la evaluaci�n m�dica. En algunos casos, se recomienda tratamiento paliativo para     " +
                                                  "\n mejorar la calidad de vida. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y propiedades         " +
                                                  "\n antiinflamatorias para fortalecer el sistema inmune y mejorar la recuperaci�n, tales como: Frutas c�tricas como naranjas     " +
                                                  "\n y kiwis: ricas en vitamina C, que ayuda a reducir el estr�s oxidativo. Pescados grasos como salm�n y at�n: ricos en Omega-3, " +
                                                  "\n que contribuyen a la salud celular y la cicatrizaci�n. Verduras de hoja verde como espinacas y br�coli: contienen            " +
                                                  "\n antioxidantes y vitamina E, esenciales para la recuperaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo      " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n     " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento  " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho " +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        if(EstaturaMasculino.equals("1.55-1.70 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N: En adultos mayores, la gripe puede provocar una mayor p�rdida de l�quidos debido a fiebre, sudoraci�n     " +
                                                  "\n y disminuci�n del consumo de agua. Se recomienda un consumo diario de 2.5 a 3 litros de l�quidos, incluyendo agua,     " +
                                                  "\n caldos y t�s sin cafe�na, para prevenir la deshidrataci�n y ayudar a mantener la funci�n inmunol�gica. La hidrataci�n     " +
                                                  "\n adecuada tambi�n contribuye a mantener las mucosas h�medas, lo que facilita la expulsi�n del virus y reduce la irritaci�n " +
                                                  "\n en la garganta. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente, recomend�ndose   " +
                                                  "\n ejercicios de bajo impacto como caminatas suaves de 30 a 45 minutos al d�a, siempre evitando el esfuerzo excesivo para no " +
                                                  "\n comprometer la recuperaci�n. POSIBLE TRATAMIENTO: Para la gripe en adultos mayores, se recomienda el uso de antivirales   " +
                                                  "\n como el oseltamivir (Tamiflu) para reducir la duraci�n y gravedad de los s�ntomas, adem�s de medicamentos para aliviar la " +
                                                  "\n fiebre y el malestar como el paracetamol (Tempra) o el ibuprofeno (Advil). Tambi�n es esencial la vacunaci�n anual contra " +
                                                  "\n la influenza para prevenir complicaciones graves. ALIMENTACI�N: Se recomienda el consumo de frutas y verduras ricas en    " +
                                                  "\n vitaminas y antioxidantes para fortalecer el sistema inmune, tales como: Naranjas y kiwis: ricos en vitamina C, que ayuda " +
                                                  "\n a reducir la duraci�n de los s�ntomas. Espinacas y br�coli: contienen antioxidantes y vitamina E, esenciales para la      " +
                                                  "\n recuperaci�n. Jengibre y c�rcuma: poseen propiedades antiinflamatorias que pueden aliviar la congesti�n y el malestar     " +
                                                  "\n general. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un     " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si  " +
                                                  "\n la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico. Angel L Montes agradece" +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N: En adultos mayores con neumon�a, la fiebre alta y sudoraci�n excesiva pueden aumentar el riesgo       " +
                                                  "\n de deshidrataci�n. Se recomienda un consumo diario de 2.5 a 3 litros de agua, adem�s de caldos tibios y jugos      " +
                                                  "\n naturales sin az�car para mejorar la absorci�n de nutrientes y mantener las secreciones pulmonares m�s fluidas.       " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser m�nima durante la fase aguda de la enfermedad, pero una vez en recuperaci�n,  " +
                                                  "\n se recomienda caminar 20 a 30 minutos al d�a para mejorar la capacidad pulmonar y evitar la p�rdida de masa muscular. " +
                                                  "\n POSIBLE TRATAMIENTO: Para la neumon�a en adultos mayores, el tratamiento suele incluir antibi�ticos como la           " +
                                                  "\n amoxicilina o la azitromicina, dependiendo del tipo de infecci�n. Tambi�n se pueden administrar medicamentos para     " +
                                                  "\n reducir la fiebre y aliviar el malestar, como el paracetamol (Tempra) o el ibuprofeno (Advil). En casos graves,       " +
                                                  "\n puede ser necesario el uso de ox�geno suplementario. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en     " +
                                                  "\n vitaminas y antioxidantes para fortalecer el sistema inmune, tales como: Naranjas y kiwis: ricos en vitamina C, que   " +
                                                  "\n ayuda a reducir la duraci�n de los s�ntomas. Espinacas y br�coli: contienen antioxidantes y vitamina E, esenciales    " +
                                                  "\n para la recuperaci�n. Jengibre y c�rcuma: poseen propiedades antiinflamatorias que pueden aliviar la congesti�n y el  " +
                                                  "\n malestar general. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el   " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda  " +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente,     " +
                                                  "\n adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su    " +
                                                  "\n m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACI�N: En adultos mayores con diabetes, la hidrataci�n es clave para mantener niveles adecuados de    " +
                                                  "\n glucosa en sangre y prevenir complicaciones renales. Se recomienda un consumo diario de 2 a 2.5 litros de   " +
                                                  "\n agua, evitando bebidas azucaradas y con cafe�na, ya que pueden afectar el control de la glucosa. EJERCICIO: " +
                                                  "\n La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente, recomend�ndose ejercicios de  " +
                                                  "\n bajo impacto como caminatas suaves de 30 a 45 minutos al d�a, lo que ayuda a mejorar la sensibilidad a la      " +
                                                  "\n insulina y controlar el peso. POSIBLE TRATAMIENTO: Para la diabetes en adultos mayores, el tratamiento suele   " +
                                                  "\n incluir medicamentos como la metformina para mejorar la sensibilidad a la insulina, adem�s de insulina en      " +
                                                  "\n algunos casos. Tambi�n se recomienda el monitoreo constante de la glucosa y ajustes en la dieta. ALIMENTACI�N: " +
                                                  "\n Se recomienda el consumo de alimentos con bajo �ndice gluc�mico y ricos en fibra para estabilizar los niveles  " +
                                                  "\n de az�car en sangre, tales como: Avena y legumbres: ayudan a regular la glucosa y mejorar la digesti�n. Frutas    " +
                                                  "\n como manzanas y peras: contienen fibra y antioxidantes sin elevar bruscamente la glucosa. Verduras de hoja verde  " +
                                                  "\n como espinacas y acelgas: ricas en magnesio, que ayuda a mejorar la sensibilidad a la insulina. Este es solo un   " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad   " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico" +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la   " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico. Angel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: En adultos mayores con asma, la hidrataci�n es fundamental para mantener las v�as respiratorias h�medas   " +
                                                  "\n y reducir la irritaci�n. Se recomienda un consumo diario de 2 a 2.5 litros de agua, adem�s de infusiones sin cafe�na   " +
                                                  "\n que ayuden a despejar las v�as respiratorias. Tambi�n es importante evitar bebidas con cafe�na y alcohol, ya que       " +
                                                  "\n pueden aumentar la inflamaci�n y la producci�n de moco. EJERCICIO: La actividad f�sica debe ser controlada y adaptada  " +
                                                  "\n a la capacidad del paciente, recomend�ndose ejercicios de bajo impacto como caminatas suaves de 30 a 40 minutos al d�a,  " +
                                                  "\n evitando ambientes fr�os o contaminados que puedan desencadenar s�ntomas. POSIBLE TRATAMIENTO: Para el asma en adultos   " +
                                                  "\n mayores, el tratamiento suele incluir broncodilatadores de alivio r�pido como el salbutamol (Ventolin), corticosteroides " +
                                                  "\n inhalados como la fluticasona (Flixotide) y en algunos casos, modificadores de leucotrienos como el montelukast (Singulair)." +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antiinflamatorias y antioxidantes para mejorar la       " +
                                                  "\n funci�n pulmonar, tales como: Pescados grasos como salm�n y at�n: ricos en Omega-3, que ayudan a reducir la inflamaci�n     " +
                                                  "\n de las v�as respiratorias. Frutas y verduras de colores vivos como ar�ndanos y espinacas: ricas en antioxidantes y          " +
                                                  "\n vitamina C, que fortalecen el sistema inmune. Jengibre y c�rcuma: contienen compuestos con efectos antiinflamatorios        " +
                                                  "\n que pueden ser beneficiosos para las v�as respiratorias. Este es solo un Diagn�stico predeterminado l�gico, haberlo         " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas          " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el       " +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le     " +
                                                  "\n recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: En adultos mayores con VIH/SIDA, la hidrataci�n es fundamental para mantener la funci�n renal y   " +
                                                  "\n reducir los efectos secundarios de los medicamentos antirretrovirales. Se recomienda un consumo diario de 2.5  " +
                                                  "\n a 3 litros de agua, adem�s de infusiones sin cafe�na y caldos ligeros para mejorar la absorci�n de nutrientes  " +
                                                  "\n y evitar la deshidrataci�n causada por fiebre o diarrea. Tambi�n es importante consumir l�quidos ricos en      " +
                                                  "\n electrolitos para mantener el equilibrio mineral del cuerpo. EJERCICIO: La actividad f�sica debe ser moderada  " +
                                                  "\n y adaptada a la condici�n del paciente, recomend�ndose ejercicios de bajo impacto como caminatas suaves de 30  " +
                                                  "\n a 45 minutos al d�a, lo que ayuda a fortalecer el sistema inmunol�gico y mejorar la salud cardiovascular.      " +
                                                  "\n POSIBLE TRATAMIENTO: Para el VIH/SIDA en adultos mayores, el tratamiento incluye terapia antirretroviral (TAR) " +
                                                  "\n con combinaciones de medicamentos como tenofovir, emtricitabina y dolutegravir, que ayudan a mantener el virus " +
                                                  "\n bajo control y mejorar la calidad de vida. Es crucial el monitoreo constante de la carga viral y el estado     " +
                                                  "\n inmunol�gico. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y prote�nas para        " +
                                                  "\n fortalecer el sistema inmune, tales como: Frutas c�tricas como naranjas y kiwis: ricas en vitamina C, que ayuda  " +
                                                  "\n a reducir el estr�s oxidativo. Pescados grasos como salm�n y at�n: ricos en Omega-3, que contribuyen a la salud  " +
                                                  "\n cardiovascular. Legumbres y frutos secos: fuentes de prote�nas y zinc, esenciales para la regeneraci�n celular.  " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s  " +
                                                  "\n de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s   " +
                                                  "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico." +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: En adultos mayores con gonorrea, la hidrataci�n es clave para ayudar a eliminar la bacteria   " +
                                                  "\n y reducir la inflamaci�n del tracto urinario. Se recomienda un consumo diario de 2 a 2.5 litros de agua,   " +
                                                  "\n adem�s de jugos naturales sin az�car y caldos ligeros para mejorar la funci�n renal y reducir molestias    " +
                                                  "\n urinarias. Tambi�n es importante evitar bebidas con cafe�na y alcohol, ya que pueden irritar el tracto     " +
                                                  "\n urinario. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente,         " +
                                                  "\n recomend�ndose ejercicios de bajo impacto como caminatas suaves de 30 a 40 minutos al d�a, evitando        " +
                                                  "\n esfuerzos excesivos que puedan agravar los s�ntomas. POSIBLE TRATAMIENTO: Para la gonorrea en adultos      " +
                                                  "\n mayores, el tratamiento recomendado es una dosis �nica de ceftriaxona 500 mg administrada por v�a intramuscular," +
                                                  "\n acompa�ada de doxiciclina en caso de coinfecci�n con clamidia. Es fundamental completar el tratamiento y evitar " +
                                                  "\n relaciones sexuales hasta la recuperaci�n total. ALIMENTACI�N: Se recomienda el consumo de alimentos con    " +
                                                  "\n propiedades antibacterianas y antiinflamatorias para mejorar la recuperaci�n, tales como: Ajo y cebolla:    " +
                                                  "\n contienen compuestos con efectos antimicrobianos naturales. Yogur natural: fuente de probi�ticos que ayudan " +
                                                  "\n a restaurar la flora intestinal afectada por los antibi�ticos. Frutas y verduras ricas en vitamina C como   " +
                                                  "\n fresas y pimientos: fortalecen el sistema inmune y aceleran la recuperaci�n. Este es solo un Diagn�stico    " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que   " +
                                                  "\n por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico" +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si" +
                                                  "\n la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: En adultos mayores con herpes genital, la hidrataci�n es esencial para reducir la inflamaci�n      " +
                                                  "\n y mejorar la cicatrizaci�n de las lesiones. Se recomienda un consumo diario de 2 a 2.5 litros de agua, adem�s   " +
                                                  "\n de infusiones de manzanilla y caldos ligeros para aliviar molestias y fortalecer el sistema inmunol�gico.          " +
                                                  "\n Tambi�n es importante evitar bebidas con cafe�na y alcohol, ya que pueden irritar la piel y prolongar los brotes.  " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente, recomend�ndose ejercicios " +
                                                  "\n de bajo impacto como caminatas suaves de 30 a 40 minutos al d�a, evitando el estr�s excesivo que pueda desencadenar  " +
                                                  "\n brotes. POSIBLE TRATAMIENTO: Para el herpes genital en adultos mayores, el tratamiento suele incluir antivirales     " +
                                                  "\n como aciclovir, valaciclovir o famciclovir, que ayudan a reducir la duraci�n y gravedad de los brotes. Tambi�n se    " +
                                                  "\n recomienda el uso de cremas t�picas para aliviar el dolor y la inflamaci�n. ALIMENTACI�N: Se recomienda el consumo   " +
                                                  "\n de alimentos con propiedades antivirales y antiinflamatorias para mejorar la recuperaci�n, tales como: Frutas ricas  " +
                                                  "\n en antioxidantes como ar�ndanos y moras: ayudan a reducir el estr�s oxidativo. Jengibre y c�rcuma: poseen propiedades" +
                                                  "\n antiinflamatorias que pueden aliviar los s�ntomas. Pescados grasos como salm�n y sardinas: ricos en Omega-3, que     " +
                                                  "\n contribuyen a la salud celular y la cicatrizaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, " +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado" +
                                                  "\n de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho " +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: En adultos mayores con s�filis, la hidrataci�n es clave para ayudar al cuerpo a eliminar toxinas  " +
                                                  "\n y mantener la funci�n renal. Se recomienda un consumo diario de 2 a 2.5 litros de agua, adem�s de infusiones   " +
                                                  "\n sin cafe�na y caldos ligeros para mejorar la circulaci�n y reducir la fatiga. Tambi�n es importante consumir   " +
                                                  "\n l�quidos ricos en electrolitos para mantener el equilibrio mineral del cuerpo. EJERCICIO: La actividad f�sica  " +
                                                  "\n debe ser moderada y adaptada a la condici�n del paciente, recomend�ndose ejercicios de bajo impacto como       " +
                                                  "\n caminatas suaves de 30 a 40 minutos al d�a, lo que ayuda a mejorar la circulaci�n y fortalecer el sistema      " +
                                                  "\n inmunol�gico. POSIBLE TRATAMIENTO: Para la s�filis en adultos mayores, el tratamiento est�ndar es penicilina   " +
                                                  "\n benzatina, administrada en una dosis �nica o en varias dosis dependiendo del estadio de la enfermedad. En casos" +
                                                  "\n de alergia a la penicilina, se pueden usar alternativas como la doxiciclina o la ceftriaxona. ALIMENTACI�N: Se " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema   " +
                                                  "\n inmune, tales como: Frutas c�tricas como naranjas y kiwis: ricas en vitamina C, que ayuda a reducir el estr�s  " +
                                                  "\n oxidativo. Pescados grasos como salm�n y at�n: ricos en Omega-3, que contribuyen a la salud cardiovascular.    " +
                                                  "\n Legumbres y frutos secos: fuentes de prote�nas y zinc, esenciales para la regeneraci�n celular. Este es solo   " +
                                                  "\n un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa        " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de " +
                                                  "\n un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por" +
                                                  "\n su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico," +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACI�N: En adultos mayores con tuberculosis, la hidrataci�n es fundamental para mantener la funci�n pulmonar " +
                                                  "\n y reducir la viscosidad de las secreciones. Se recomienda un consumo diario de 2.5 a 3 litros de agua, adem�s de  " +
                                                  "\n caldos y jugos naturales sin az�car para mejorar la absorci�n de nutrientes y evitar la deshidrataci�n causada    " +
                                                  "\n por fiebre y sudoraci�n. Tambi�n es importante evitar bebidas con cafe�na y alcohol, ya que pueden irritar las    " +
                                                  "\n v�as respiratorias. EJERCICIO: La actividad f�sica debe ser m�nima durante la fase aguda de la enfermedad, pero   " +
                                                  "\n una vez en recuperaci�n, se recomienda caminar 20 a 30 minutos al d�a para mejorar la capacidad pulmonar y evitar " +
                                                  "\n la p�rdida de masa muscular. POSIBLE TRATAMIENTO: Para la tuberculosis en adultos mayores, el tratamiento est�ndar" +
                                                  "\n incluye una combinaci�n de antibi�ticos como isoniazida, rifampicina, etambutol y pirazinamida, administrados     " +
                                                  "\n durante un per�odo de 6 meses. Es crucial completar el tratamiento para evitar reca�das y resistencia bacteriana. " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en vitaminas y antioxidantes para fortalecer el sistema " +
                                                  "\n inmune, tales como: Frutas c�tricas como naranjas y kiwis: ricas en vitamina C, que ayuda a reducir la duraci�n   " +
                                                  "\n de los s�ntomas. Espinacas y br�coli: contienen antioxidantes y vitamina E, esenciales para la recuperaci�n.      " +
                                                  "\n Jengibre y c�rcuma: poseen propiedades antiinflamatorias que pueden aliviar la congesti�n y el malestar general.  " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga  " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s   " +
                                                  "\n de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s    " +
                                                  "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico," +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: En adultos mayores con herpes genital, la hidrataci�n es esencial para reducir la inflamaci�n y mejorar  " +
                                                  "\n la cicatrizaci�n de las lesiones. Se recomienda un consumo diario de 2 a 2.5 litros de agua, adem�s de infusiones de  " +
                                                  "\n manzanilla y caldos ligeros para aliviar molestias y fortalecer el sistema inmunol�gico. Tambi�n es importante evitar " +
                                                  "\n bebidas con cafe�na y alcohol, ya que pueden irritar la piel y prolongar los brotes. EJERCICIO: La actividad f�sica   " +
                                                  "\n debe ser moderada y adaptada a la condici�n del paciente, recomend�ndose ejercicios de bajo impacto como caminatas    " +
                                                  "\n suaves de 30 a 40 minutos al d�a, evitando el estr�s excesivo que pueda desencadenar brotes. POSIBLE TRATAMIENTO:     " +
                                                  "\n Para el herpes genital en adultos mayores, el tratamiento suele incluir antivirales como aciclovir, valaciclovir o    " +
                                                  "\n famciclovir, que ayudan a reducir la duraci�n y gravedad de los brotes. Tambi�n se recomienda el uso de cremas t�picas  " +
                                                  "\n para aliviar el dolor y la inflamaci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antivirales " +
                                                  "\n y antiinflamatorias para mejorar la recuperaci�n, tales como: Frutas ricas en antioxidantes como ar�ndanos y moras:     " +
                                                  "\n ayudan a reducir el estr�s oxidativo. Jengibre y c�rcuma: poseen propiedades antiinflamatorias que pueden aliviar los   " +
                                                  "\n s�ntomas. Pescados grasos como salm�n y sardinas: ricos en Omega-3, que contribuyen a la salud celular y la cicatrizaci�n." +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa   " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un      " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud  " +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: En adultos mayores con s�filis, la hidrataci�n es clave para ayudar al cuerpo a eliminar toxinas " +
                                                  "\n y mantener la funci�n renal. Se recomienda un consumo diario de 2 a 2.5 litros de agua, adem�s de infusiones  " +
                                                  "\n sin cafe�na y caldos ligeros para mejorar la circulaci�n y reducir la fatiga. Tambi�n es importante consumir  " +
                                                  "\n l�quidos ricos en electrolitos para mantener el equilibrio mineral del cuerpo. EJERCICIO: La actividad f�sica " +
                                                  "\n debe ser moderada y adaptada a la condici�n del paciente, recomend�ndose ejercicios de bajo impacto como      " +
                                                  "\n caminatas suaves de 30 a 40 minutos al d�a, lo que ayuda a mejorar la circulaci�n y fortalecer el sistema     " +
                                                  "\n inmunol�gico. POSIBLE TRATAMIENTO: Para la s�filis en adultos mayores, el tratamiento est�ndar es penicilina  " +
                                                  "\n benzatina, administrada en una dosis �nica o en varias dosis dependiendo del estadio de la enfermedad. En casos  " +
                                                  "\n de alergia a la penicilina, se pueden usar alternativas como la doxiciclina o la ceftriaxona. ALIMENTACI�N: Se   " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema     " +
                                                  "\n inmune, tales como: Frutas c�tricas como naranjas y kiwis: ricas en vitamina C, que ayuda a reducir el estr�s    " +
                                                  "\n oxidativo. Pescados grasos como salm�n y at�n: ricos en Omega-3, que contribuyen a la salud cardiovascular.      " +
                                                  "\n Legumbres y frutos secos: fuentes de prote�nas y zinc, esenciales para la regeneraci�n celular. Este es solo     " +
                                                  "\n un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la    " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes    " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACI�N: En adultos mayores con tuberculosis, la hidrataci�n es fundamental para mantener la funci�n pulmonar   " +
                                                  "\n y reducir la viscosidad de las secreciones. Se recomienda un consumo diario de 2.5 a 3 litros de agua, adem�s de    " +
                                                  "\n caldos y jugos naturales sin az�car para mejorar la absorci�n de nutrientes y evitar la deshidrataci�n causada por  " +
                                                  "\n fiebre y sudoraci�n. Tambi�n es importante evitar bebidas con cafe�na y alcohol, ya que pueden irritar las v�as     " +
                                                  "\n respiratorias. EJERCICIO: La actividad f�sica debe ser m�nima durante la fase aguda de la enfermedad, pero una vez     " +
                                                  "\n en recuperaci�n, se recomienda caminar 20 a 30 minutos al d�a para mejorar la capacidad pulmonar y evitar la p�rdida   " +
                                                  "\n de masa muscular. POSIBLE TRATAMIENTO: Para la tuberculosis en adultos mayores, el tratamiento est�ndar incluye una    " +
                                                  "\n combinaci�n de antibi�ticos como isoniazida, rifampicina, etambutol y pirazinamida, administrados durante un per�odo   " +
                                                  "\n de 6 meses. Es crucial completar el tratamiento para evitar reca�das y resistencia bacteriana. ALIMENTACI�N: Se        " +
                                                  "\n recomienda el consumo de alimentos ricos en vitaminas y antioxidantes para fortalecer el sistema inmune, tales como:   " +
                                                  "\n Frutas c�tricas como naranjas y kiwis: ricas en vitamina C, que ayuda a reducir la duraci�n de los s�ntomas. Espinacas " +
                                                  "\n y br�coli: contienen antioxidantes y vitamina E, esenciales para la recuperaci�n. Jengibre y c�rcuma: poseen propiedades" +
                                                  "\n antiinflamatorias que pueden aliviar la congesti�n y el malestar general. Este es solo un Diagn�stico predeterminado    " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y     " +
                                                  "\n sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor    " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que" +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N: En adultos mayores con Zika, la hidrataci�n es esencial para reducir la fiebre y prevenir la deshidrataci�n " +
                                                  "\n causada por sudoraci�n excesiva. Se recomienda un consumo diario de 2.5 a 3 litros de agua, adem�s de infusiones de      " +
                                                  "\n manzanilla y caldos ligeros para aliviar molestias y fortalecer el sistema inmunol�gico. EJERCICIO: La actividad f�sica  " +
                                                  "\n debe ser m�nima durante la fase aguda de la enfermedad, pero una vez en recuperaci�n, se recomienda caminar 20 a 30      " +
                                                  "\n minutos al d�a para mejorar la circulaci�n y evitar la fatiga. POSIBLE TRATAMIENTO: Para el Zika en adultos mayores,     " +
                                                  "\n no existe un tratamiento espec�fico, pero se recomienda reposo, hidrataci�n y el uso de analg�sicos como paracetamol     " +
                                                  "\n para aliviar los s�ntomas. Se debe evitar el uso de aspirina y otros AINEs hasta descartar dengue para reducir el riesgo " +
                                                  "\n de sangrado. ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antivirales y antioxidantes para mejorar" +
                                                  "\n la recuperaci�n, tales como: Frutas ricas en antioxidantes como ar�ndanos y moras: contienen vitamina C (24% del         " +
                                                  "\n requerimiento diario por cada 100 g) y antocianinas, que ayudan a reducir el estr�s oxidativo. Jengibre y c�rcuma: poseen" +
                                                  "\n propiedades antiinflamatorias y contienen magnesio (11% del requerimiento diario por cada 100 g), que puede aliviar los  " +
                                                  "\n s�ntomas. Pescados grasos como salm�n y sardinas: ricos en Omega-3 (EPA y DHA, 90% del requerimiento diario por cada     " +
                                                  "\n 100 g), que contribuyen a la salud celular y la cicatrizaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo" +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n " +
                                                  "\n correctas. Para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el          " +
                                                  "\n tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del Diagn�stico no le satisface del todo, se  " +
                                                  "\n le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N: En adultos mayores con rotavirus, la hidrataci�n es esencial para prevenir la deshidrataci�n       " +
                                                  "\n severa causada por diarrea y v�mitos. Se recomienda un consumo diario de 3 a 3.5 litros de l�quidos, incluyendo " +
                                                  "\n agua, sueros de rehidrataci�n oral y caldos ligeros. EJERCICIO: Durante la fase aguda de la enfermedad, se      " +
                                                  "\n recomienda reposo absoluto. Una vez en recuperaci�n, se pueden realizar caminatas suaves de 20 a 30 minutos al  " +
                                                  "\n d�a para mejorar la circulaci�n y evitar la p�rdida de masa muscular. POSIBLE TRATAMIENTO: No existe un         " +
                                                  "\n tratamiento espec�fico para el rotavirus, pero se recomienda reposo, hidrataci�n y el uso de medicamentos como  " +
                                                  "\n paracetamol para aliviar la fiebre y el malestar. En casos graves, puede ser necesaria la administraci�n de     " +
                                                  "\n l�quidos intravenosos. ALIMENTACI�N: Se recomienda el consumo de alimentos suaves y ricos en electrolitos para  " +
                                                  "\n facilitar la recuperaci�n, tales como: Pl�tanos: ricos en potasio (12% del requerimiento diario por cada 100 g)," +
                                                  "\n ayudan a reponer electrolitos perdidos. Arroz y pan tostado: contienen carbohidratos complejos (80% del         " +
                                                  "\n requerimiento diario por cada 100 g), que ayudan a estabilizar el sistema digestivo. Yogur natural: fuente de   " +
                                                  "\n probi�ticos y calcio (30% del requerimiento diario por cada 100 g), que ayudan a restaurar la flora intestinal. " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga" +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas. Para ello se recomienda hacer m�s " +
                                                  "\n de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Adem�s, " +
                                                  "\n por su salud, si la respuesta del Diagn�stico no le satisface del todo, se le recomienda mucho consultar a su   " +
                                                  "\n m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N: En adultos mayores con listeriosis, la hidrataci�n es clave para ayudar al cuerpo a eliminar    " +
                                                  "\n la bacteria y reducir la fiebre. Se recomienda un consumo diario de 2.5 a 3 litros de agua, adem�s de caldos " +
                                                  "\n ligeros y jugos naturales sin az�car. EJERCICIO: La actividad f�sica debe ser m�nima durante la fase aguda de" +
                                                  "\n la enfermedad, pero una vez en recuperaci�n, se recomienda caminar 20 a 30 minutos al d�a para mejorar la      " +
                                                  "\n circulaci�n y fortalecer el sistema inmunol�gico. POSIBLE TRATAMIENTO: Para la listeriosis en adultos mayores, " +
                                                  "\n el tratamiento est�ndar es antibi�ticos como ampicilina o gentamicina, administrados por v�a oral o intravenosa" +
                                                  "\n dependiendo de la gravedad del caso. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes" +
                                                  "\n y propiedades antibacterianas para fortalecer el sistema inmune, tales como: Ajo y cebolla: contienen alicina y" +
                                                  "\n quercetina, con efectos antimicrobianos naturales. Frutas c�tricas como naranjas y kiwis: ricas en vitamina C  " +
                                                  "\n (80% del requerimiento diario por cada 100 g), que ayuda a reducir la inflamaci�n. Yogur natural: fuente de       " +
                                                  "\n probi�ticos y calcio (30% del requerimiento diario por cada 100 g), que ayudan a restaurar la flora intestinal    " +
                                                  "\n afectada por los antibi�ticos. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas. Para  " +
                                                  "\n ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado " +
                                                  "\n de su paciente. Adem�s, por su salud, si la respuesta del Diagn�stico no le satisface del todo, se le recomienda   " +
                                                  "\n mucho consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: En adultos mayores con shigelosis, la hidrataci�n es fundamental para prevenir la deshidrataci�n " +
                                                  "\n causada por diarrea severa. Se recomienda un consumo diario de 3 a 3.5 litros de l�quidos, incluyendo agua,   " +
                                                  "\n sueros de rehidrataci�n oral y caldos ligeros. Es importante evitar bebidas con cafe�na y alcohol, ya que     " +
                                                  "\n pueden agravar la deshidrataci�n. EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo     " +
                                                  "\n absoluto. Una vez en recuperaci�n, se pueden realizar caminatas suaves de 20 a 30 minutos al d�a para mejorar " +
                                                  "\n la circulaci�n y evitar la fatiga. POSIBLE TRATAMIENTO: Para la shigelosis en adultos mayores, el tratamiento " +
                                                  "\n suele incluir antibi�ticos como ciprofloxacino o azitromicina, administrados por v�a oral para reducir la     " +
                                                  "\n duraci�n de los s�ntomas. Tambi�n se recomienda evitar el uso de medicamentos antidiarreicos, ya que pueden   " +
                                                  "\n empeorar la infecci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos suaves y ricos en electrolitos para   " +
                                                  "\n facilitar la recuperaci�n, tales como: Pl�tanos: ricos en potasio (12% del requerimiento diario por cada 100 g), " +
                                                  "\n ayudan a reponer electrolitos perdidos. Arroz y pan tostado: contienen carbohidratos complejos (80% del          " +
                                                  "\n requerimiento diario por cada 100 g), que ayudan a estabilizar el sistema digestivo. Yogur natural: fuente de    " +
                                                  "\n probi�ticos y calcio (30% del requerimiento diario por cada 100 g), que ayudan a restaurar la flora intestinal.  " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas. Para ello se recomienda hacer m�s  " +
                                                  "\n de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Adem�s,  " +
                                                  "\n por su salud, si la respuesta del Diagn�stico no le satisface del todo, se le recomienda mucho consultar a su    " +
                                                  "\n m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: En adultos mayores con EPOC, la hidrataci�n es fundamental para mantener las v�as respiratorias  " +
                                                  "\n h�medas y facilitar la expulsi�n de mucosidad. Se recomienda un consumo diario de 2.5 a 3 litros de agua,     " +
                                                  "\n distribuidos en peque�as cantidades a lo largo del d�a para evitar la fatiga respiratoria. Tambi�n se pueden  " +
                                                  "\n incluir infusiones sin cafe�na y caldos tibios para mejorar la hidrataci�n sin irritar las v�as respiratorias.   " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la capacidad del paciente, recomend�ndose          " +
                                                  "\n ejercicios de bajo impacto como caminatas suaves de 30 a 45 minutos al d�a, adem�s de ejercicios de respiraci�n  " +
                                                  "\n profunda para mejorar la funci�n pulmonar. POSIBLE TRATAMIENTO: Para el EPOC en adultos mayores, el tratamiento  " +
                                                  "\n suele incluir broncodilatadores de acci�n prolongada como el tiotropio (Spiriva) y el salmeterol, corticosteroides  " +
                                                  "\n inhalados como la fluticasona (Flixotide), y en algunos casos, oxigenoterapia para mejorar la respiraci�n.          " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antioxidantes y antiinflamatorias para mejorar  " +
                                                  "\n la funci�n pulmonar, tales como: Pescados grasos como salm�n y at�n: ricos en Omega-3 (EPA y DHA, 90% del              " +
                                                  "\n requerimiento diario por cada 100 g), que ayudan a reducir la inflamaci�n de las v�as respiratorias. Frutas y verduras " +
                                                  "\n de colores vivos como ar�ndanos y espinacas: ricas en antioxidantes y vitamina C (80% del requerimiento diario por cada" +
                                                  "\n 100 g), que fortalecen el sistema inmune. Jengibre y c�rcuma: contienen compuestos con efectos antiinflamatorios y     " +
                                                  "\n magnesio (11% del requerimiento diario por cada 100 g), que pueden ser beneficiosos para las v�as respiratorias.       " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa   " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas. Para ello se recomienda hacer m�s de un      " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud," +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: En adultos mayores con clamidia, la hidrataci�n es clave para ayudar al cuerpo a eliminar la bacteria  " +
                                                  "\n y reducir la inflamaci�n del tracto urinario. Se recomienda un consumo diario de 2 a 2.5 litros de agua, adem�s de  " +
                                                  "\n jugos naturales sin az�car y caldos ligeros para mejorar la funci�n renal y reducir molestias urinarias. Tambi�n es " +
                                                  "\n importante evitar bebidas con cafe�na y alcohol, ya que pueden irritar el tracto urinario. EJERCICIO: La actividad  " +
                                                  "\n f�sica debe ser moderada y adaptada a la condici�n del paciente, recomend�ndose ejercicios de bajo impacto como    " +
                                                  "\n caminatas suaves de 30 a 40 minutos al d�a, evitando esfuerzos excesivos que puedan agravar los s�ntomas. POSIBLE  " +
                                                  "\n TRATAMIENTO: Para la clamidia en adultos mayores, el tratamiento recomendado es antibi�ticos como la azitromicina  " +
                                                  "\n en dosis �nica o la doxiciclina durante 7 d�as, asegurando la eliminaci�n completa de la bacteria. ALIMENTACI�N:   " +
                                                  "\n Se recomienda el consumo de alimentos con propiedades antibacterianas y antiinflamatorias para mejorar la recuperaci�n, " +
                                                  "\n tales como: Ajo y cebolla: contienen alicina y quercetina, con efectos antimicrobianos naturales. Yogur natural: fuente " +
                                                  "\n de probi�ticos y calcio (30% del requerimiento diario por cada 100 g), que ayudan a restaurar la flora intestinal       " +
                                                  "\n afectada por los antibi�ticos. Frutas y verduras ricas en vitamina C como fresas y pimientos: contienen vitamina C      " +
                                                  "\n (80% del requerimiento diario por cada 100 g), que fortalecen el sistema inmune y aceleran la recuperaci�n. Este es     " +
                                                  "\n solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas. Para ello se recomienda hacer m�s de un Diagn�stico   " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la    " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: En adultos mayores con meningitis bacteriana, la hidrataci�n es esencial para reducir la fiebre  " +
                                                  "\n y prevenir la deshidrataci�n causada por sudoraci�n excesiva. Se recomienda un consumo diario de 3 a 3.5      " +
                                                  "\n litros de agua, adem�s de infusiones de manzanilla y caldos ligeros para aliviar molestias y fortalecer el    " +
                                                  "\n sistema inmunol�gico. EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo absoluto. Sin   " +
                                                  "\n embargo, una vez en recuperaci�n, es importante realizar ejercicios progresivos para mejorar la movilidad y   " +
                                                  "\n reducir la fatiga. Se recomienda comenzar con ejercicios de estiramiento suaves para relajar los m�sculos y   " +
                                                  "\n mejorar la circulaci�n. Posteriormente, se pueden incluir ejercicios de resistencia ligera, como el uso de    " +
                                                  "\n bandas el�sticas o la presi�n de objetos en las manos, para recuperar la fuerza muscular. Tambi�n es recomendable " +
                                                  "\n realizar caminatas cortas de 20 a 30 minutos al d�a, aumentando gradualmente la duraci�n seg�n la tolerancia del  " +
                                                  "\n paciente. Estos ejercicios ayudan a mejorar la postura, reducir la rigidez muscular y fortalecer el sistema       " +
                                                  "\n cardiovascular. POSIBLE TRATAMIENTO: Para la meningitis bacteriana en adultos mayores, el tratamiento suele incluir " +
                                                  "\n antibi�ticos intravenosos como ceftriaxona o vancomicina, adem�s de corticosteroides para reducir la inflamaci�n    " +
                                                  "\n cerebral. ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antivirales y antioxidantes para      " +
                                                  "\n mejorar la recuperaci�n, tales como: Frutas ricas en antioxidantes como ar�ndanos y moras: contienen vitamina C     " +
                                                  "\n (24% del requerimiento diario por cada 100 g) y antocianinas, que ayudan a reducir el estr�s oxidativo. Jengibre y  " +
                                                  "\n c�rcuma: poseen propiedades antiinflamatorias y contienen magnesio (11% del requerimiento diario por cada 100 g),   " +
                                                  "\n que puede aliviar los s�ntomas. Pescados grasos como salm�n y sardinas: ricos en Omega-3 (EPA y DHA, 90% del      " +
                                                  "\n requerimiento diario por cada 100 g), que contribuyen a la salud celular y la cicatrizaci�n. Este es solo un      " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y " +
                                                  "\n que por ello la enfermedad y sus respuestas est�n correctas. Para ello se recomienda hacer m�s de un Diagn�stico  " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: En adultos mayores con c�ncer, la hidrataci�n es fundamental para mantener la funci�n renal, reducir los efectos  " +
                                                  "\n secundarios de los tratamientos y mejorar la recuperaci�n. Se recomienda un consumo diario de 2.5 a 3.5 litros de agua, adem�s " +
                                                  "\n de caldos ligeros, jugos naturales sin az�car y t�s sin cafe�na para mejorar la absorci�n de nutrientes y evitar la            " +
                                                  "\n deshidrataci�n causada por efectos secundarios como v�mitos o diarrea. EJERCICIO: La actividad f�sica debe ser adaptada a la   " +
                                                  "\n condici�n del paciente y el tipo de c�ncer. Se recomienda comenzar con ejercicios de movilidad y estiramiento, como yoga o     " +
                                                  "\n tai chi, para mejorar la flexibilidad y reducir la rigidez muscular. Posteriormente, se pueden incluir ejercicios de resistencia" +
                                                  "\n moderada, como levantamiento de pesas ligeras o el uso de bandas el�sticas, para fortalecer los m�sculos y mejorar la densidad " +
                                                  "\n �sea. Tambi�n es recomendable realizar caminatas de 30 a 45 minutos al d�a, lo que ayuda a mejorar la circulaci�n, reducir la  " +
                                                  "\n fatiga y fortalecer el sistema inmunol�gico. En algunos casos, se pueden incluir ejercicios aer�bicos de bajo impacto, como    " +
                                                  "\n nataci�n o ciclismo suave, para mejorar la capacidad pulmonar y cardiovascular. POSIBLE TRATAMIENTO: Para el c�ncer en adultos " +
                                                  "\n mayores, el tratamiento depende del tipo y estadio de la enfermedad. Puede incluir quimioterapia, radioterapia, inmunoterapia  " +
                                                  "\n o cirug�a, dependiendo de la evaluaci�n m�dica. En algunos casos, se recomienda tratamiento paliativo para mejorar la calidad  " +
                                                  "\n de vida. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y propiedades antiinflamatorias para       " +
                                                  "\n fortalecer el sistema inmune y mejorar la recuperaci�n, tales como: Frutas c�tricas como naranjas y kiwis: ricas en vitamina C " +
                                                  "\n (80% del requerimiento diario por cada 100 g), que ayuda a reducir el estr�s oxidativo. Pescados grasos como salm�n y at�n:    " +
                                                  "\n ricos en Omega-3 (EPA y DHA, 90% del requerimiento diario por cada 100 g), que contribuyen a la salud celular y la cicatrizaci�n." +
                                                  "\n Verduras de hoja verde como espinacas y br�coli: contienen antioxidantes y vitamina E (70% del requerimiento diario por cada  " +
                                                  "\n 100 g), esenciales para la recuperaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza   " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas. Para ello se      " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente.  " +
                                                  "\n Adem�s, por su salud, si la respuesta del Diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        if(EstaturaMasculino.equals("1.45-1.60 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N: En adultos mayores con influenza, la hidrataci�n es esencial para reducir la fiebre y prevenir    " +
                                                  "\n la deshidrataci�n causada por sudoraci�n excesiva. Se recomienda un consumo diario de 2.5 a 3 litros de agua,  " +
                                                  "\n adem�s de caldos tibios y t�s sin cafe�na para aliviar molestias y fortalecer el sistema inmunol�gico.         " +
                                                  "\n EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo absoluto. Una vez en recuperaci�n,        " +
                                                  "\n se pueden realizar caminatas suaves de 20 a 30 minutos al d�a, evitando el fr�o extremo y ambientes contaminados. " +
                                                  "\n Tambi�n se recomienda ejercicios de respiraci�n profunda para mejorar la funci�n pulmonar y reducir la congesti�n. " +
                                                  "\n POSIBLE TRATAMIENTO: Para la influenza en adultos mayores, se recomienda el uso de antivirales como oseltamivir    " +
                                                  "\n (Tamiflu) para reducir la duraci�n y gravedad de los s�ntomas, adem�s de medicamentos para aliviar la fiebre y el  " +
                                                  "\n malestar como paracetamol o ibuprofeno. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en vitaminas y   " +
                                                  "\n antioxidantes para fortalecer el sistema inmune, tales como: Frutas c�tricas como naranjas y kiwis: contienen      " +
                                                  "\n vitamina C (80% del requerimiento diario por cada 100 g), que ayuda a reducir la duraci�n de los s�ntomas.           " +
                                                  "\n Espinacas y br�coli: contienen antioxidantes y vitamina E (70% del requerimiento diario por cada 100 g), esenciales  " +
                                                  "\n para la recuperaci�n. Jengibre y c�rcuma: poseen propiedades antiinflamatorias y magnesio (11% del requerimiento     " +
                                                  "\n diario por cada 100 g), que pueden aliviar la congesti�n y el malestar general. Este es solo un Diagn�stico          " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello   " +
                                                  "\n la enfermedad y sus respuestas est�n correctas. Para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para  " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del    " +
                                                  "\n Diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu     " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N: En adultos mayores con neumon�a, la fiebre alta y sudoraci�n excesiva pueden aumentar el riesgo   " +
                                                  "\n de deshidrataci�n. Se recomienda un consumo diario de 2.5 a 3 litros de agua, adem�s de caldos tibios y jugos  " +
                                                  "\n naturales sin az�car para mejorar la absorci�n de nutrientes y mantener las secreciones pulmonares m�s fluidas." +
                                                  "\n EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo absoluto. Una vez en recuperaci�n, se  " +
                                                  "\n recomienda caminatas cortas de 15 a 25 minutos al d�a, aumentando gradualmente la duraci�n seg�n la tolerancia " +
                                                  "\n del paciente. Tambi�n se pueden realizar ejercicios de expansi�n tor�cica, como inhalaciones profundas y       " +
                                                  "\n exhalaciones controladas, para mejorar la capacidad pulmonar. POSIBLE TRATAMIENTO: Para la neumon�a en adultos " +
                                                  "\n mayores, el tratamiento suele incluir antibi�ticos como amoxicilina o azitromicina, dependiendo del tipo de    " +
                                                  "\n infecci�n. Tambi�n se pueden administrar medicamentos para reducir la fiebre y aliviar el malestar, como       " +
                                                  "\n paracetamol o ibuprofeno. En casos graves, puede ser necesario el uso de ox�geno suplementario. ALIMENTACI�N:  " +
                                                  "\n Se recomienda el consumo de alimentos ricos en vitaminas y antioxidantes para fortalecer el sistema inmune, tales " +
                                                  "\n como: Frutas c�tricas como naranjas y kiwis: contienen vitamina C (80% del requerimiento diario por cada 100 g),  " +
                                                  "\n que ayuda a reducir la duraci�n de los s�ntomas. Espinacas y br�coli: contienen antioxidantes y vitamina E (70%   " +
                                                  "\n del requerimiento diario por cada 100 g), esenciales para la recuperaci�n. Jengibre y c�rcuma: poseen propiedades " +
                                                  "\n antiinflamatorias y magnesio (11% del requerimiento diario por cada 100 g), que pueden aliviar la congesti�n y el " +
                                                  "\n malestar general. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que  " +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas. Para ello se      " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su" +
                                                  "\n paciente. Adem�s, por su salud, si la respuesta del Diagn�stico no le satisface del todo, se le recomienda mucho  " +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACI�N: En adultos mayores con diabetes, la hidrataci�n es clave para mantener niveles adecuados de    " +
                                                  "\n glucosa en sangre y prevenir complicaciones renales. Se recomienda un consumo diario de 2 a 2.5 litros de   " +
                                                  "\n agua, evitando bebidas azucaradas y con cafe�na, ya que pueden afectar el control de la glucosa. EJERCICIO: " +
                                                  "\n La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente. Se recomienda caminatas de 30 " +
                                                  "\n a 45 minutos al d�a, lo que ayuda a mejorar la sensibilidad a la insulina y controlar el peso. Tambi�n se   " +
                                                  "\n pueden realizar ejercicios de resistencia moderada, como levantamiento de pesas ligeras o el uso de bandas  " +
                                                  "\n el�sticas, para fortalecer los m�sculos y mejorar la densidad �sea. POSIBLE TRATAMIENTO: Para la diabetes en  " +
                                                  "\n adultos mayores, el tratamiento suele incluir medicamentos como la metformina para mejorar la sensibilidad a  " +
                                                  "\n la insulina, adem�s de insulina en algunos casos. Tambi�n se recomienda el monitoreo constante de la glucosa  " +
                                                  "\n y ajustes en la dieta. ALIMENTACI�N: Se recomienda el consumo de alimentos con bajo �ndice gluc�mico y ricos  " +
                                                  "\n en fibra para estabilizar los niveles de az�car en sangre, tales como: Avena y legumbres: contienen fibra     " +
                                                  "\n soluble (60% del requerimiento diario por cada 100 g), que ayuda a regular la glucosa y mejorar la digesti�n. " +
                                                  "\n Frutas como manzanas y peras: contienen antioxidantes y fibra (50% del requerimiento diario por cada 100 g)   " +
                                                  "\n sin elevar bruscamente la glucosa. Verduras de hoja verde como espinacas y acelgas: contienen magnesio (40% del " +
                                                  "\n requerimiento diario por cada 100 g), que ayuda a mejorar la sensibilidad a la insulina. Este es solo un        " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas. Para ello se recomienda hacer m�s de un Diagn�stico" +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: En adultos mayores con asma, la hidrataci�n es fundamental para mantener las v�as respiratorias h�medas     " +
                                                  "\n y reducir la irritaci�n. Se recomienda un consumo diario de 2 a 2.5 litros de agua, distribuidos en peque�as cantidades  " +
                                                  "\n a lo largo del d�a para evitar la fatiga respiratoria. Adem�s, se recomienda el consumo de infusiones sin cafe�na, como  " +
                                                  "\n t� de jengibre o manzanilla, que pueden ayudar a reducir la inflamaci�n de las v�as respiratorias. Tambi�n es importante " +
                                                  "\n evitar bebidas con cafe�na y alcohol, ya que pueden aumentar la inflamaci�n y la producci�n de moco. Se recomienda el uso " +
                                                  "\n de humidificadores en el hogar para mantener el aire h�medo y evitar la sequedad en las v�as respiratorias. EJERCICIO:    " +
                                                  "\n La actividad f�sica debe ser controlada y adaptada a la capacidad del paciente, recomend�ndose ejercicios de bajo impacto " +
                                                  "\n como caminatas suaves de 30 a 40 minutos al d�a, evitando ambientes fr�os o contaminados que puedan desencadenar s�ntomas.  " +
                                                  "\n Tambi�n se recomienda la pr�ctica de ejercicios de respiraci�n profunda, como la t�cnica de respiraci�n diafragm�tica,      " +
                                                  "\n para mejorar la capacidad pulmonar y reducir la sensaci�n de falta de aire. POSIBLE TRATAMIENTO: Para el asma en adultos    " +
                                                  "\n mayores, el tratamiento suele incluir broncodilatadores de alivio r�pido como el salbutamol (Ventolin), corticosteroides    " +
                                                  "\n inhalados como la fluticasona (Flixotide) y en algunos casos, modificadores de leucotrienos como el montelukast             " +
                                                  "\n (Singulair). ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antiinflamatorias y antioxidantes para     " +
                                                  "\n mejorar la funci�n pulmonar, tales como: Pescados grasos como salm�n y at�n: ricos en Omega-3 (EPA y DHA, 90% del           " +
                                                  "\n requerimiento diario por cada 100 g), que ayudan a reducir la inflamaci�n de las v�as respiratorias. Frutas y verduras      " +
                                                  "\n de colores vivos como ar�ndanos y espinacas: ricas en antioxidantes y vitamina C (80% del requerimiento diario por cada     " +
                                                  "\n 100 g), que fortalecen el sistema inmune. Jengibre y c�rcuma: contienen compuestos con efectos antiinflamatorios y magnesio " +
                                                  "\n (11% del requerimiento diario por cada 100 g), que pueden ser beneficiosos para las v�as respiratorias. Este es solo un     " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por   " +
                                                  "\n ello la enfermedad y sus respuestas est�n correctas. Para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para    " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del Diagn�stico " +
                                                  "\n no le satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita a la app          " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: En adultos mayores con VIH/SIDA, la hidrataci�n es fundamental para mantener la funci�n renal   " +
                                                  "\n y reducir los efectos secundarios de los medicamentos antirretrovirales. Se recomienda un consumo diario     " +
                                                  "\n de 2.5 a 3 litros de agua, distribuidos en peque�as cantidades a lo largo del d�a para evitar la fatiga y    " +
                                                  "\n mejorar la absorci�n de nutrientes. Tambi�n se recomienda el consumo de bebidas ricas en electrolitos, como  " +
                                                  "\n agua de coco o sueros de rehidrataci�n, para mantener el equilibrio mineral del cuerpo. Es importante evitar " +
                                                  "\n bebidas azucaradas y con cafe�na, ya que pueden afectar la funci�n hep�tica y renal. Se recomienda el consumo" +
                                                  "\n de jugos naturales sin az�car, como jugo de naranja o zanahoria, que aportan vitaminas esenciales para       " +
                                                  "\n fortalecer el sistema inmunol�gico. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n   " +
                                                  "\n del paciente, recomend�ndose ejercicios de bajo impacto como caminatas suaves de 30 a 45 minutos al d�a, lo que  " +
                                                  "\n ayuda a fortalecer el sistema inmunol�gico y mejorar la salud cardiovascular. Tambi�n se recomienda la pr�ctica  " +
                                                  "\n de ejercicios de resistencia moderada, como levantamiento de pesas ligeras o el uso de bandas el�sticas, para    " +
                                                  "\n fortalecer los m�sculos y mejorar la densidad �sea. POSIBLE TRATAMIENTO: Para el VIH/SIDA en adultos mayores,    " +
                                                  "\n el tratamiento incluye terapia antirretroviral (TAR) con combinaciones de medicamentos como tenofovir,           " +
                                                  "\n emtricitabina y dolutegravir, que ayudan a mantener el virus bajo control y mejorar la calidad de vida. Es       " +
                                                  "\n crucial el monitoreo constante de la carga viral y el estado inmunol�gico. ALIMENTACI�N: Se recomienda el consumo" +
                                                  "\n de alimentos ricos en antioxidantes y prote�nas para fortalecer el sistema inmune, tales como: Frutas c�tricas   " +
                                                  "\n como naranjas y kiwis: contienen vitamina C (80% del requerimiento diario por cada 100 g), que ayuda a reducir   " +
                                                  "\n el estr�s oxidativo. Pescados grasos como salm�n y at�n: ricos en Omega-3 (EPA y DHA, 90% del requerimiento diario " +
                                                  "\n por cada 100 g), que contribuyen a la salud cardiovascular. Legumbres y frutos secos: fuentes de prote�nas y zinc  " +
                                                  "\n (50% del requerimiento diario por cada 100 g), esenciales para la regeneraci�n celular. Este es solo un Diagn�stico" +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello " +
                                                  "\n la enfermedad y sus respuestas est�n correctas. Para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para" +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del   " +
                                                  "\n Diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu    " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: En adultos mayores con gonorrea, la hidrataci�n es clave para ayudar a eliminar la bacteria y  " +
                                                  "\n reducir la inflamaci�n del tracto urinario. Se recomienda un consumo diario de 2 a 2.5 litros de agua,      " +
                                                  "\n distribuidos en peque�as cantidades a lo largo del d�a para mejorar la funci�n renal y reducir molestias    " +
                                                  "\n urinarias. Tambi�n se recomienda el consumo de jugos naturales sin az�car, como jugo de ar�ndano, que puede " +
                                                  "\n ayudar a prevenir infecciones urinarias recurrentes. Es importante evitar bebidas con cafe�na y alcohol, ya " +
                                                  "\n que pueden irritar el tracto urinario y prolongar los s�ntomas. Se recomienda el consumo de infusiones de   " +
                                                  "\n hierbas, como t� de manzanilla o diente de le�n, que tienen propiedades antibacterianas y pueden ayudar a   " +
                                                  "\n aliviar la inflamaci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del      " +
                                                  "\n paciente, recomend�ndose ejercicios de bajo impacto como caminatas suaves de 30 a 40 minutos al d�a, evitando " +
                                                  "\n esfuerzos excesivos que puedan agravar los s�ntomas. Tambi�n se recomienda la pr�ctica de ejercicios de       " +
                                                  "\n movilidad, como estiramientos suaves, para mejorar la circulaci�n y reducir la fatiga. POSIBLE TRATAMIENTO:   " +
                                                  "\n Para la gonorrea en adultos mayores, el tratamiento recomendado es una dosis �nica de ceftriaxona 500 mg      " +
                                                  "\n administrada por v�a intramuscular, acompa�ada de doxiciclina en caso de coinfecci�n con clamidia. Es         " +
                                                  "\n fundamental completar el tratamiento y evitar relaciones sexuales hasta la recuperaci�n total. ALIMENTACI�N:  " +
                                                  "\n Se recomienda el consumo de alimentos con propiedades antibacterianas y antiinflamatorias para mejorar la     " +
                                                  "\n recuperaci�n, tales como: Ajo y cebolla: contienen alicina y quercetina, con efectos antimicrobianos naturales." +
                                                  "\n Yogur natural: fuente de probi�ticos y calcio (30% del requerimiento diario por cada 100 g), que ayudan a      " +
                                                  "\n restaurar la flora intestinal afectada por los antibi�ticos. Frutas y verduras ricas en vitamina C como fresas " +
                                                  "\n y pimientos: contienen vitamina C (80% del requerimiento diario por cada 100 g), que fortalecen el sistema     " +
                                                  "\n inmune y aceleran la recuperaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no    " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n     " +
                                                  "\n correctas. Para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad      " +
                                                  "\n en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del Diagn�stico no le satisface" +
                                                  "\n del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida)    " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: En adultos mayores con herpes genital, la hidrataci�n es esencial para reducir la inflamaci�n y      " +
                                                  "\n mejorar la cicatrizaci�n de las lesiones. Se recomienda un consumo diario de 2 a 2.5 litros de agua,              " +
                                                  "\n distribuidos en peque�as cantidades a lo largo del d�a para evitar la fatiga y mejorar la absorci�n de nutrientes.   " +
                                                  "\n Tambi�n se recomienda el consumo de infusiones de manzanilla y caldos ligeros, que pueden ayudar a aliviar molestias " +
                                                  "\n y fortalecer el sistema inmunol�gico. Es importante evitar bebidas con cafe�na y alcohol, ya que pueden irritar la   " +
                                                  "\n piel y prolongar los brotes. Se recomienda el uso de agua tibia para la higiene �ntima, evitando jabones agresivos   " + 
                                                  "\n que puedan empeorar la irritaci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la condici�n del    " +
                                                  "\n paciente, recomend�ndose ejercicios de bajo impacto como caminatas suaves de 30 a 40 minutos al d�a, evitando el     " +
                                                  "\n estr�s excesivo que pueda desencadenar brotes. Tambi�n se recomienda la pr�ctica de ejercicios de relajaci�n, como   " +
                                                  "\n yoga o meditaci�n, para reducir el estr�s y fortalecer el sistema inmunol�gico. POSIBLE TRATAMIENTO: Para el herpes  " +
                                                  "\n genital en adultos mayores, el tratamiento suele incluir antivirales como aciclovir, valaciclovir o famciclovir,     " +
                                                  "\n que ayudan a reducir la duraci�n y gravedad de los brotes. Tambi�n se recomienda el uso de cremas t�picas para aliviar " +
                                                  "\n el dolor y la inflamaci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antivirales y           " +
                                                  "\n antiinflamatorias para mejorar la recuperaci�n, tales como: Frutas ricas en antioxidantes como ar�ndanos y moras:      " +
                                                  "\n contienen vitamina C (24% del requerimiento diario por cada 100 g) y antocianinas, que ayudan a reducir el estr�s      " +
                                                  "\n oxidativo. Jengibre y c�rcuma: poseen propiedades antiinflamatorias y contienen magnesio (11% del requerimiento diario " +
                                                  "\n por cada 100 g), que puede aliviar los s�ntomas. Pescados grasos como salm�n y sardinas: ricos en Omega-3 (EPA y DHA,  " +
                                                  "\n 90% del requerimiento diario por cada 100 g), que contribuyen a la salud celular y la cicatrizaci�n. Este es solo un   " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que  " +
                                                  "\n por ello la enfermedad y sus respuestas est�n correctas. Para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida" +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del  " + 
                                                  "\n Diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: En adultos mayores con s�filis, la hidrataci�n es clave para ayudar al cuerpo a eliminar toxinas         " +
                                                  "\n y mantener la funci�n renal. Se recomienda un consumo diario de 2 a 2.5 litros de agua, distribuidos en peque�as      " +
                                                  "\n cantidades a lo largo del d�a para mejorar la circulaci�n y reducir la fatiga. Tambi�n se recomienda el consumo       " +
                                                  "\n de bebidas ricas en electrolitos, como agua de coco o sueros de rehidrataci�n, para mantener el equilibrio mineral    " +
                                                  "\n del cuerpo. Es importante evitar bebidas azucaradas y con cafe�na, ya que pueden afectar la funci�n hep�tica y renal. " +
                                                  "\n Se recomienda el consumo de jugos naturales sin az�car, como jugo de naranja o zanahoria, que aportan vitaminas       " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la  " +
                                                  "\n condici�n del paciente, recomend�ndose ejercicios de bajo impacto como caminatas suaves de 30 a 40 minutos al d�a, lo " +
                                                  "\n que ayuda a mejorar la circulaci�n y fortalecer el sistema inmunol�gico. Tambi�n se recomienda la pr�ctica de ejercicios    " +
                                                  "\n de movilidad, como estiramientos suaves, para mejorar la flexibilidad y reducir la rigidez muscular. POSIBLE TRATAMIENTO:   " +
                                                  "\n Para la s�filis en adultos mayores, el tratamiento est�ndar es penicilina benzatina, administrada en una dosis �nica o      " +
                                                  "\n en varias dosis dependiendo del estadio de la enfermedad. En casos de alergia a la penicilina, se pueden usar alternativas  " +
                                                  "\n como la doxiciclina o la ceftriaxona. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes " +
                                                  "\n esenciales para fortalecer el sistema inmune, tales como: Frutas c�tricas como naranjas y kiwis: contienen vitamina C (80%  " +
                                                  "\n del requerimiento diario por cada 100 g), que ayuda a reducir el estr�s oxidativo. Pescados grasos como salm�n y at�n:      " +
                                                  "\n ricos en Omega-3 (EPA y DHA, 90% del requerimiento diario por cada 100 g), que contribuyen a la salud cardiovascular.       " +
                                                  "\n Legumbres y frutos secos: fuentes de prote�nas y zinc (50% del requerimiento diario por cada 100 g), esenciales para la     " +
                                                  "\n regeneraci�n celular. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el     " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas. Para ello se recomienda hacer  " +
                                                  "\n m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su  " +
                                                  "\n salud, si la respuesta del Diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes" +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB). " +
                                                  "\n HIDRATACI�N: En adultos mayores con tuberculosis, la hidrataci�n es fundamental para mantener la funci�n pulmonar   " +
                                                  "\n y reducir la viscosidad de las secreciones. Se recomienda un consumo diario de 2.5 a 3 litros de agua, distribuidos " +
                                                  "\n en peque�as cantidades a lo largo del d�a para evitar la fatiga y mejorar la absorci�n de nutrientes. Tambi�n se    " +
                                                  "\n recomienda el consumo de caldos tibios y jugos naturales sin az�car, que pueden ayudar a mejorar la absorci�n de    " +
                                                  "\n nutrientes y evitar la deshidrataci�n causada por fiebre y sudoraci�n. Es importante evitar bebidas con cafe�na y   " +
                                                  "\n alcohol, ya que pueden irritar las v�as respiratorias. Se recomienda el uso de humidificadores en el hogar para     " +
                                                  "\n mantener el aire h�medo y evitar la sequedad en las v�as respiratorias. EJERCICIO: La actividad f�sica debe ser     " +
                                                  "\n m�nima durante la fase aguda de la enfermedad, pero una vez en recuperaci�n, se recomienda caminatas cortas de 15   " +
                                                  "\n a 25 minutos al d�a, aumentando gradualmente la duraci�n seg�n la tolerancia del paciente. Tambi�n se pueden realizar   " +
                                                  "\n ejercicios de expansi�n tor�cica, como inhalaciones profundas y exhalaciones controladas, para mejorar la capacidad     " +
                                                  "\n pulmonar. POSIBLE TRATAMIENTO: Para la tuberculosis en adultos mayores, el tratamiento est�ndar incluye una combinaci�n " +
                                                  "\n de antibi�ticos como isoniazida, rifampicina, etambutol y pirazinamida, administrados durante un per�odo de 6 meses.    " +
                                                  "\n Es crucial completar el tratamiento para evitar reca�das y resistencia bacteriana. ALIMENTACI�N: Se recomienda el       " +
                                                  "\n consumo de alimentos ricos en vitaminas y antioxidantes para fortalecer el sistema inmune, tales como: Frutas c�tricas  " +
                                                  "\n como naranjas y kiwis: contienen vitamina C (80% del requerimiento diario por cada 100 g), que ayuda a reducir la       " +
                                                  "\n duraci�n de los s�ntomas. Espinacas y br�coli: contienen antioxidantes y vitamina E (70% del requerimiento diario por   " +
                                                  "\n cada 100 g), esenciales para la recuperaci�n. Jengibre y c�rcuma: poseen propiedades antiinflamatorias y magnesio       " +
                                                  "\n (11% del requerimiento diario por cada 100 g), que pueden aliviar la congesti�n y el malestar general. Este es solo un  " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que   " +
                                                  "\n por ello la enfermedad y sus respuestas est�n correctas. Para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del  " +
                                                  "\n Diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N: Mantener una hidrataci�n adecuada ayuda a lubricar las articulaciones y reducir la inflamaci�n, se     " +
                                                  "\n recomienda consumir 2.5 a 3 litros de agua al d�a, adem�s de infusiones de jengibre y c�rcuma con propiedades       " +
                                                  "\n antiinflamatorias, evitando bebidas con cafe�na y alcohol que pueden aumentar la rigidez articular, tambi�n es      " +
                                                  "\n recomendable el consumo de caldos ricos en col�geno para fortalecer los cart�lagos y reducir el desgaste articular. " +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada con ejercicios de bajo impacto como caminatas suaves de 30 a 45  " +
                                                  "\n minutos al d�a, adem�s de movilidad articular con yoga o tai chi y fortalecimiento muscular con bandas el�sticas para  " +
                                                  "\n mejorar la estabilidad de las articulaciones y reducir el dolor. POSIBLE TRATAMIENTO: Incluye antiinflamatorios no     " +
                                                  "\n esteroides (AINEs) como ibuprofeno o naproxeno, adem�s de suplementos de glucosamina y condroitina para mejorar la     " +
                                                  "\n salud articular, en casos m�s severos se pueden usar corticosteroides o terapia biol�gica. ALIMENTACI�N: Se recomienda " +
                                                  "\n el consumo de pescados grasos como salm�n y at�n ricos en Omega-3 (EPA y DHA, 90% del requerimiento diario por cada    " +
                                                  "\n 100 g) que ayudan a reducir la inflamaci�n de las articulaciones, frutas y verduras de colores vivos como ar�ndanos    " +
                                                  "\n y espinacas ricas en antioxidantes y vitamina C (80% del requerimiento diario por cada 100 g) que fortalecen el sistema" +
                                                  "\n inmune, jengibre y c�rcuma con compuestos antiinflamatorios y magnesio (11% del requerimiento diario por cada 100 g)   " +
                                                  "\n beneficiosos para las articulaciones. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente," +
                                                  "\n adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico.  " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: Es clave para aliviar la irritaci�n de las v�as respiratorias y reducir la viscosidad de las         " +
                                                  "\n secreciones, se recomienda consumir 2.5 a 3 litros de agua al d�a, adem�s de caldos tibios y t�s sin cafe�na      " +
                                                  "\n como miel con lim�n para calmar la garganta, evitando bebidas fr�as y con gas que pueden aumentar la irritaci�n,  " +
                                                  "\n tambi�n es �til el uso de humidificadores para mantener el aire h�medo y evitar la sequedad en las v�as             " +
                                                  "\n respiratorias. EJERCICIO: Durante la fase aguda se recomienda reposo absoluto, en recuperaci�n se pueden realizar   " +
                                                  "\n caminatas cortas de 15 a 25 minutos al d�a, aumentando gradualmente la duraci�n seg�n la tolerancia del paciente,   " +
                                                  "\n adem�s de ejercicios de expansi�n tor�cica como inhalaciones profundas y exhalaciones controladas para mejorar la   " +
                                                  "\n capacidad pulmonar. POSIBLE TRATAMIENTO: Incluye antibi�ticos como azitromicina, claritromicina o eritromicina,     " +
                                                  "\n administrados en los primeros d�as de la enfermedad para reducir la severidad de los s�ntomas, tambi�n se recomienda" +
                                                  "\n el uso de broncodilatadores en casos de dificultad respiratoria severa. ALIMENTACI�N: Se recomienda el consumo de   " +
                                                  "\n frutas c�tricas como naranjas y kiwis ricas en vitamina C (80% del requerimiento diario por cada 100 g) que ayuda   " +
                                                  "\n a reducir la inflamaci�n de las v�as respiratorias, jengibre y c�rcuma con propiedades antiinflamatorias y magnesio    " +
                                                  "\n (11% del requerimiento diario por cada 100 g) que pueden aliviar la congesti�n y el malestar general, miel y prop�leo  " +
                                                  "\n que ayudan a calmar la garganta y reducir la irritaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el          " +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se     " +
                                                  "\n le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: Es esencial para reducir la fiebre y aliviar la inflamaci�n de las gl�ndulas salivales, se recomienda  " +
                                                  "\n consumir 2 a 2.5 litros de agua al d�a, adem�s de jugos naturales sin az�car como jugo de zanahoria o manzana para  " +
                                                  "\n fortalecer el sistema inmunol�gico, evitando bebidas �cidas y con gas que pueden aumentar la irritaci�n de las      " +
                                                  "\n gl�ndulas salivales, tambi�n es recomendable consumir sopas y pur�s que son f�ciles de ingerir y ayudan a mantener  " +
                                                  "\n la hidrataci�n. EJERCICIO: Durante la fase aguda se recomienda reposo absoluto, en recuperaci�n se pueden realizar  " +
                                                  "\n caminatas cortas de 15 a 25 minutos al d�a, aumentando gradualmente la duraci�n seg�n la tolerancia del paciente,   " +
                                                  "\n adem�s de ejercicios de movilidad como estiramientos suaves para mejorar la circulaci�n y reducir la fatiga.        " +
                                                  "\n POSIBLE TRATAMIENTO: Incluye analg�sicos como paracetamol o ibuprofeno para reducir el dolor y la fiebre, tambi�n   " +
                                                  "\n se recomienda el uso de compresas fr�as en la zona inflamada para aliviar la hinchaz�n. ALIMENTACI�N: Se recomienda " +
                                                  "\n el consumo de yogur natural fuente de probi�ticos y calcio (30% del requerimiento diario por cada 100 g) que ayudan " +
                                                  "\n a restaurar la flora intestinal afectada por la fiebre, frutas ricas en vitamina C como fresas y pimientos que      " +
                                                  "\n contienen vitamina C (80% del requerimiento diario por cada 100 g) fortaleciendo el sistema inmune y acelerando la  " +
                                                  "\n recuperaci�n, sopas y pur�s f�ciles de consumir que ayudan a mantener la hidrataci�n. Este es solo un Diagn�stico   " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello  " +
                                                  "\n la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del       " +
                                                  "\n Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita" +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N: Es fundamental para reducir la fiebre y prevenir la deshidrataci�n causada por sudoraci�n excesiva, se  " +
                                                  "\n recomienda consumir 2.5 a 3 litros de agua al d�a, adem�s de infusiones de manzanilla y caldos ligeros para aliviar  " +
                                                  "\n molestias y fortalecer el sistema inmunol�gico, evitando bebidas con cafe�na y alcohol que pueden irritar el sistema " +
                                                  "\n digestivo, tambi�n es recomendable el consumo de jugos naturales sin az�car como jugo de naranja o zanahoria para    " +
                                                  "\n aportar vitaminas esenciales. EJERCICIO: Durante la fase aguda se recomienda reposo absoluto, en recuperaci�n se     " + 
                                                  "\n pueden realizar caminatas cortas de 15 a 25 minutos al d�a, aumentando gradualmente la duraci�n seg�n la tolerancia  " +
                                                  "\n del paciente, adem�s de ejercicios de movilidad como estiramientos suaves para mejorar la circulaci�n y reducir la   " +
                                                  "\n fatiga. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico, pero se recomienda reposo, hidrataci�n y el uso de " +
                                                  "\n analg�sicos como paracetamol para aliviar los s�ntomas, evitando el uso de aspirina y otros AINEs hasta descartar    " +
                                                  "\n dengue para reducir el riesgo de sangrado. ALIMENTACI�N: Se recomienda el consumo de frutas ricas en antioxidantes   " +
                                                  "\n como ar�ndanos y moras que contienen vitamina C (24% del requerimiento diario por cada 100 g) y antocianinas que     " +
                                                  "\n ayudan a reducir el estr�s oxidativo, jengibre y c�rcuma con propiedades antiinflamatorias y magnesio (11% del       " +
                                                  "\n requerimiento diario por cada 100 g) que pueden aliviar los s�ntomas, pescados grasos como salm�n y sardinas ricos   " +
                                                  "\n en Omega-3 (EPA y DHA, 90% del requerimiento diario por cada 100 g) que contribuyen a la salud celular y la cicatrizaci�n." +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un    " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud" +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico. Angel L Montes" +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N: Es esencial para prevenir la deshidrataci�n severa causada por diarrea y v�mitos, se recomienda        " +
                                                  "\n consumir 3 a 3.5 litros de l�quidos al d�a, incluyendo agua, sueros de rehidrataci�n oral y caldos ligeros,         " +
                                                  "\n evitando bebidas azucaradas y con cafe�na que pueden afectar la funci�n digestiva, tambi�n es recomendable el       " +
                                                  "\n consumo de jugos naturales sin az�car como jugo de manzana para mejorar la absorci�n de nutrientes. EJERCICIO:      " +
                                                  "\n Durante la fase aguda se recomienda reposo absoluto, en recuperaci�n se pueden realizar caminatas cortas de 15      " +
                                                  "\n a 25 minutos al d�a, aumentando gradualmente la duraci�n seg�n la tolerancia del paciente, adem�s de ejercicios     " +
                                                  "\n de movilidad como estiramientos suaves para mejorar la circulaci�n y reducir la fatiga. POSIBLE TRATAMIENTO: No     " +
                                                  "\n existe un tratamiento espec�fico, pero se recomienda reposo, hidrataci�n y el uso de medicamentos como paracetamol  " +
                                                  "\n para aliviar la fiebre y el malestar, en casos graves puede ser necesaria la administraci�n de l�quidos intravenosos.    " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de pl�tanos ricos en potasio (12% del requerimiento diario por cada 100 g) que    " +
                                                  "\n ayudan a reponer electrolitos perdidos, arroz y pan tostado que contienen carbohidratos complejos (80% del requerimiento " +
                                                  "\n diario por cada 100 g) que ayudan a estabilizar el sistema digestivo, yogur natural fuente de probi�ticos y calcio (30%  " +
                                                  "\n del requerimiento diario por cada 100 g) que ayudan a restaurar la flora intestinal. Este es solo un Diagn�stico         " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la    " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer" +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida)" +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N: Es clave para ayudar al cuerpo a eliminar la bacteria y reducir la fiebre, se recomienda consumir         " +
                                                  "\n 2.5 a 3 litros de agua al d�a, adem�s de caldos ligeros y jugos naturales sin az�car, evitando bebidas con cafe�na     " +
                                                  "\n y alcohol que pueden irritar el sistema digestivo, tambi�n es recomendable el consumo de infusiones de hierbas como    " +
                                                  "\n t� de manzanilla o diente de le�n con propiedades antibacterianas. EJERCICIO: Durante la fase aguda se recomienda      " +
                                                  "\n reposo absoluto, en recuperaci�n se pueden realizar caminatas cortas de 15 a 25 minutos al d�a, aumentando gradualmente" +
                                                  "\n la duraci�n seg�n la tolerancia del paciente, adem�s de ejercicios de movilidad como estiramientos suaves para mejorar " +
                                                  "\n la circulaci�n y reducir la fatiga. POSIBLE TRATAMIENTO: Incluye antibi�ticos como ampicilina o gentamicina,           " +
                                                  "\n administrados por v�a oral o intravenosa dependiendo de la gravedad del caso. ALIMENTACI�N: Se recomienda el consumo de   " +
                                                  "\n ajo y cebolla que contienen alicina y quercetina con efectos antimicrobianos naturales, frutas c�tricas como naranjas y   " +
                                                  "\n kiwis ricas en vitamina C (80% del requerimiento diario por cada 100 g) que ayudan a reducir la inflamaci�n, yogur natural" +
                                                  "\n fuente de probi�ticos y calcio (30% del requerimiento diario por cada 100 g) que ayudan a restaurar la flora intestinal   " +
                                                  "\n afectada por los antibi�ticos. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda" +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s " +
                                                  "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: Es esencial para prevenir la deshidrataci�n causada por diarrea severa, se recomienda consumir      " +
                                                  "\n 3 a 3.5 litros de l�quidos al d�a, incluyendo agua, sueros de rehidrataci�n oral y caldos ligeros, evitando      " +
                                                  "\n bebidas con cafe�na y alcohol que pueden agravar la deshidrataci�n, tambi�n es recomendable el consumo de jugos  " +
                                                  "\n naturales sin az�car como jugo de manzana para mejorar la absorci�n de nutrientes. EJERCICIO: Durante la fase    " +
                                                  "\n aguda se recomienda reposo absoluto, en recuperaci�n se pueden realizar caminatas cortas de 15 a 25 minutos al   " +
                                                  "\n d�a, aumentando gradualmente la duraci�n seg�n la tolerancia del paciente, adem�s de ejercicios de movilidad como  " +
                                                  "\n estiramientos suaves para mejorar la circulaci�n y reducir la fatiga. POSIBLE TRATAMIENTO: Incluye antibi�ticos    " +
                                                  "\n como ciprofloxacino o azitromicina, administrados por v�a oral para reducir la duraci�n de los s�ntomas, evitando  " +
                                                  "\n el uso de medicamentos antidiarreicos que pueden empeorar la infecci�n. ALIMENTACI�N: Se recomienda el consumo de  " +
                                                  "\n pl�tanos ricos en potasio (12% del requerimiento diario por cada 100 g) que ayudan a reponer electrolitos perdidos," +
                                                  "\n arroz y pan tostado que contienen carbohidratos complejos (80% del requerimiento diario por cada 100 g) que ayudan " +
                                                  "\n a estabilizar el sistema digestivo, yogur natural fuente de probi�ticos y calcio (30% del requerimiento diario por " +
                                                  "\n cada 100 g) que ayudan a restaurar la flora intestinal. Este es solo un Diagn�stico predeterminado l�gico, haberlo " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en " +
                                                  "\n el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo " +
                                                  "\n se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: Es fundamental para mantener las v�as respiratorias h�medas y facilitar la expulsi�n de mucosidad, se          " +
                                                  "\n recomienda consumir 2.5 a 3 litros de agua al d�a, distribuidos en peque�as cantidades para evitar la fatiga respiratoria,  " +
                                                  "\n adem�s de infusiones sin cafe�na y caldos tibios para mejorar la hidrataci�n sin irritar las v�as respiratorias, evitando   " +
                                                  "\n bebidas con cafe�na y alcohol que pueden aumentar la inflamaci�n pulmonar. EJERCICIO: Se recomienda actividad f�sica           " +
                                                  "\n moderada con ejercicios de bajo impacto como caminatas suaves de 30 a 45 minutos al d�a, adem�s de ejercicios de respiraci�n   " +
                                                  "\n profunda para mejorar la funci�n pulmonar y reducir la sensaci�n de falta de aire. POSIBLE TRATAMIENTO: Incluye broncodilatadores" +
                                                  "\n de acci�n prolongada como el tiotropio (Spiriva) y el salmeterol, corticosteroides inhalados como la fluticasona (Flixotide)     " +
                                                  "\n y en algunos casos oxigenoterapia para mejorar la respiraci�n. ALIMENTACI�N: Se recomienda el consumo de pescados grasos como    " +
                                                  "\n salm�n y at�n ricos en Omega-3 (EPA y DHA, 90% del requerimiento diario por cada 100 g) que ayudan a reducir la inflamaci�n      " +
                                                  "\n de las v�as respiratorias, frutas y verduras de colores vivos como ar�ndanos y espinacas ricas en antioxidantes y vitamina C     " +
                                                  "\n (80% del requerimiento diario por cada 100 g) que fortalecen el sistema inmune, jengibre y c�rcuma con compuestos antiinflamatorios" +
                                                  "\n y magnesio (11% del requerimiento diario por cada 100 g) beneficiosos para las v�as respiratorias. Este es solo un Diagn�stico  " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la           " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer     " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface  " +
                                                  "\n del todo se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: Es clave para ayudar al cuerpo a eliminar la bacteria y reducir la inflamaci�n del tracto urinario, se   " +
                                                  "\n recomienda consumir 2 a 2.5 litros de agua al d�a, adem�s de jugos naturales sin az�car como jugo de ar�ndano que     " +
                                                  "\n puede ayudar a prevenir infecciones urinarias recurrentes, evitando bebidas con cafe�na y alcohol que pueden irritar  " +
                                                  "\n el tracto urinario y prolongar los s�ntomas, tambi�n es recomendable el consumo de infusiones de hierbas como t� de   " +
                                                  "\n manzanilla o diente de le�n con propiedades antibacterianas. EJERCICIO: Se recomienda actividad f�sica moderada con   " +
                                                  "\n ejercicios de bajo impacto como caminatas suaves de 30 a 40 minutos al d�a, evitando esfuerzos excesivos que puedan   " +
                                                  "\n agravar los s�ntomas, adem�s de ejercicios de movilidad como estiramientos suaves para mejorar la circulaci�n y reducir  " +
                                                  "\n la fatiga. POSIBLE TRATAMIENTO: Incluye antibi�ticos como la azitromicina en dosis �nica o la doxiciclina durante 7 d�as," +
                                                  "\n asegurando la eliminaci�n completa de la bacteria. ALIMENTACI�N: Se recomienda el consumo de ajo y cebolla que contienen " +
                                                  "\n alicina y quercetina con efectos antimicrobianos naturales, yogur natural fuente de probi�ticos y calcio (30% del        " +
                                                  "\n requerimiento diario por cada 100 g) que ayudan a restaurar la flora intestinal afectada por los antibi�ticos, frutas y  " +
                                                  "\n verduras ricas en vitamina C como fresas y pimientos que contienen vitamina C (80% del requerimiento diario por cada     " +
                                                  "\n 100 g) fortaleciendo el sistema inmune y acelerando la recuperaci�n. Este es solo un Diagn�stico predeterminado l�gico,  " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el      " +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le    " +
                                                  "\n recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: Es fundamental para reducir la fiebre y prevenir la deshidrataci�n causada por sudoraci�n excesiva,  " +
                                                  "\n se recomienda consumir 3 a 3.5 litros de agua al d�a, adem�s de infusiones de manzanilla y caldos ligeros para    " +
                                                  "\n aliviar molestias y fortalecer el sistema inmunol�gico, evitando bebidas con cafe�na y alcohol que pueden irritar " +
                                                  "\n el sistema digestivo, tambi�n es recomendable el consumo de jugos naturales sin az�car como jugo de naranja o     " +
                                                  "\n zanahoria para aportar vitaminas esenciales. EJERCICIO: Durante la fase aguda se recomienda reposo absoluto, en   " +
                                                  "\n recuperaci�n se pueden realizar caminatas cortas de 15 a 25 minutos al d�a, aumentando gradualmente la duraci�n   " +
                                                  "\n seg�n la tolerancia del paciente, adem�s de ejercicios de movilidad como estiramientos suaves para mejorar la     " +
                                                  "\n circulaci�n y reducir la fatiga. POSIBLE TRATAMIENTO: Incluye antibi�ticos intravenosos como ceftriaxona o        " +
                                                  "\n vancomicina, adem�s de corticosteroides para reducir la inflamaci�n cerebral. ALIMENTACI�N: Se recomienda el consumo  " +
                                                  "\n de frutas ricas en antioxidantes como ar�ndanos y moras que contienen vitamina C (24% del requerimiento diario por    " +
                                                  "\n cada 100 g) y antocianinas que ayudan a reducir el estr�s oxidativo, jengibre y c�rcuma con propiedades antiinflamatorias" +
                                                  "\n y magnesio (11% del requerimiento diario por cada 100 g) que pueden aliviar los s�ntomas, pescados grasos como salm�n  " +
                                                  "\n y sardinas ricos en Omega-3 (EPA y DHA, 90% del requerimiento diario por cada 100 g) que contribuyen a la salud    " +
                                                  "\n celular y la cicatrizaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al  " +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello " +
                                                  "\n se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de " +
                                                  "\n su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho   " +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: Es fundamental para mantener la funci�n renal, reducir los efectos secundarios de los tratamientos y mejorar la  " +
                                                  "\n recuperaci�n, se recomienda consumir 2.5 a 3.5 litros de agua al d�a, adem�s de caldos ligeros, jugos naturales sin az�car y  " +
                                                  "\n t�s sin cafe�na para mejorar la absorci�n de nutrientes y evitar la deshidrataci�n causada por efectos secundarios como       " +
                                                  "\n v�mitos o diarrea, evitando bebidas con cafe�na y alcohol que pueden afectar la funci�n hep�tica y renal. EJERCICIO: Se       " +
                                                  "\n recomienda actividad f�sica adaptada a la condici�n del paciente y el tipo de c�ncer, incluyendo caminatas suaves de 30 a 45  " +
                                                  "\n minutos al d�a, adem�s de ejercicios de movilidad para mejorar la circulaci�n y reducir la fatiga, en algunos casos se pueden " +
                                                  "\n incluir ejercicios aer�bicos de bajo impacto como nataci�n o ciclismo suave para mejorar la capacidad pulmonar y cardiovascular." +
                                                  "\n POSIBLE TRATAMIENTO: Depende del tipo y estadio de la enfermedad, puede incluir quimioterapia, radioterapia, inmunoterapia    " +
                                                  "\n o cirug�a, dependiendo de la evaluaci�n m�dica, en algunos casos se recomienda tratamiento paliativo para mejorar la calidad  " +
                                                  "\n de vida. ALIMENTACI�N: Se recomienda el consumo de frutas c�tricas como naranjas y kiwis ricas en vitamina C (80% del         " +
                                                  "\n requerimiento diario por cada 100 g) que ayuda a reducir el estr�s oxidativo, pescados grasos como salm�n y at�n ricos        " +
                                                  "\n en Omega-3 (EPA y DHA, 90% del requerimiento diario por cada 100 g) que contribuyen a la salud celular y la cicatrizaci�n,    " +
                                                  "\n verduras de hoja verde como espinacas y br�coli que contienen antioxidantes y vitamina E (70% del requerimiento diario por    " +
                                                  "\n cada 100 g) esenciales para la recuperaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no      " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para " +
                                                  "\n ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su " +
                                                  "\n paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a  " +
                                                  "\n su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        
                        }
                }
            }
        if (EdadMasculino.equals("Adultez Mayor = 60 - 74 a�os")) {
            frame.setVisible(true);
        } else {
            frame.setVisible(false);
        }
        }
        
    public Estudio6()  {
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
        Estudio6 ventanaEstudio6 = new Estudio6();
        ventanaEstudio6.crearInterfaz();
    }
}