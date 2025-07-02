import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Estudio6 implements ActionListener{
    
  
         private final JLabel label1;
         private JScrollPane scrollpane1;
         private JTextArea textarea1;
         private JFrame frame;
         private final String edadEsperada = "Adultez Mayor = 60 - 74 años";
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
                 if(EdadMasculino.equals("Adultez Mayor = 60 - 74 años")){
                     if(EstaturaMasculino.equals("0.90-1.35 m")){
                              if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de     " +
                                                  "\n tamaño regular) para prevenir la deshidratación y ayudar a aliviar los síntomas. También se recomienda el consumo  " +
                                                  "\n de caldos claros y bebidas con electrolitos para mantener el equilibrio de líquidos. EJERCICIO: Se sugiere reposo  " +
                                                  "\n mientras persistan los síntomas, evitando actividades de esfuerzo intenso. Una vez que la fiebre disminuya, se         " +
                                                  "\n pueden realizar caminatas suaves de 10 a 20 minutos al día para favorecer la recuperación sin comprometer el sistema   " +
                                                  "\n respiratorio. POSIBLE TRATAMIENTO: Se pueden utilizar antivirales como oseltamivir, baloxavir y zanamivir para reducir " +
                                                  "\n la duración y gravedad de la infección. Algunas marcas reconocidas de oseltamivir incluyen Tamiflu y Antiflu; de       " +
                                                  "\n baloxavir, Xofluza; y de zanamivir, Relenza. También se recomienda el uso de analgésicos y antipiréticos como          " +
                                                  "\n paracetamol y ibuprofeno para aliviar la fiebre y el malestar general. ALIMENTACIÓN: Se recomienda el consumo de       " +
                                                  "\n frutas y verduras ricas en vitaminas y antioxidantes para fortalecer el sistema inmunológico, como naranjas (1 unidad,   " +
                                                  "\n 130 g) que contienen 70 mg de vitamina C (78% de la ingesta diaria recomendada), 3 g de fibra y 237 mg de potasio;       " +
                                                  "\n fresas (100 g) con 59 mg de vitamina C (98% de la ingesta diaria recomendada), 2 g de fibra y antioxidantes flavonoides  " +
                                                  "\n y polifenoles; plátanos (100 g) ricos en potasio (358 mg, 10% de la ingesta diaria recomendada), útil para mantener el   " +
                                                  "\n equilibrio de electrolitos; y kiwi (100 g) con 92 mg de vitamina C (153% de la ingesta diaria recomendada), 40 mcg de    " +
                                                  "\n vitamina K (33% de la ingesta diaria recomendada) y 312 mg de potasio. Este es solo un Diagnóstico predeterminado lógico, " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas" +
                                                  "\n estén correctas. Para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el     " +
                                                  "\n tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del Diagnóstico no le satisface del todo, se   " +
                                                  "\n le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tamaño   " +
                                                  "\n regular) para mantener la hidratación y facilitar la expulsión de secreciones bronquiales. Se sugiere también    " +
                                                  "\n infusiones de hierbas, caldos de pollo y jugos naturales sin azúcar para reforzar la hidratación. EJERCICIO:     " +
                                                  "\n Se aconsejan ejercicios de respiración profunda y técnicas de expansión pulmonar para mejorar la capacidad       " +
                                                  "\n respiratoria. Caminatas suaves de 10 a 15 minutos pueden ser beneficiosas si no hay fatiga excesiva. POSIBLE     " +
                                                  "\n TRATAMIENTO: En el caso de neumonía bacteriana, el tratamiento suele incluir antibióticos como amoxicilina,      " +
                                                  "\n azitromicina y ceftriaxona. Algunas marcas reconocidas de amoxicilina incluyen Amoxil y Trimox; de azitromicina,      " +
                                                  "\n Zitromax y Azitrocin; y de ceftriaxona, Rocephin y Cefaxone. ALIMENTACIÓN: Se recomienda el consumo de alimentos      " +
                                                  "\n ricos en vitaminas y antioxidantes para fortalecer el sistema inmunológico y reducir la inflamación pulmonar, como    " +
                                                  "\n zanahorias (100 g) que contienen aproximadamente 334% de la ingesta diaria recomendada de vitamina A, 2.8 g de fibra    " +
                                                  "\n y antioxidantes beta-carotenos; naranjas (1 unidad, 130 g) con 70 mg de vitamina C (78% de la ingesta diaria recomendada)," +
                                                  "\n 3 g de fibra y 237 mg de potasio; espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta diaria recomendada), 79 mg    " +
                                                  "\n de magnesio (20% de la ingesta diaria recomendada) y 483 mcg de vitamina K (402% de la ingesta diaria recomendada);       " +
                                                  "\n y almendras (28 g, aproximadamente 23 unidades) que aportan vitamina E (7.3 mg, 49% de la ingesta diaria recomendada),    " +
                                                  "\n magnesio (76 mg, 18% de la ingesta diaria recomendada) y fibra (3.5 g). Este es solo un Diagnóstico predeterminado lógico," +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas" +
                                                  "\n estén correctas. Para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el     " +
                                                  "\n tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del Diagnóstico no le satisface del todo, se   " +
                                                  "\n le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tamaño      " +
                                                  "\n regular) para mantener un adecuado nivel de hidratación y ayudar a regular los niveles de glucosa en sangre.        " +
                                                  "\n Se sugiere también el consumo de agua con limón, infusiones sin azúcar y jugos naturales con bajo índice glucémico.  " +
                                                  "\n EJERCICIO: Se recomienda realizar actividad física moderada como caminatas de 20 a 30 minutos al día, entrenamiento  " +
                                                  "\n de resistencia y ejercicios aeróbicos, que contribuyen a mejorar la sensibilidad a la insulina. POSIBLE TRATAMIENTO: " +
                                                  "\n El tratamiento suele incluir medicamentos como metformina, que ayuda a reducir la producción de glucosa en el hígado," +
                                                  "\n y en algunos casos, insulina para controlar los niveles elevados. Algunas marcas reconocidas de metformina incluyen  " +
                                                  "\n Glucophage y Dianben; de insulina, Lantus y Humalog. También es importante un monitoreo constante de la glucosa en   " +
                                                  "\n sangre y ajustes en la dieta. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en fibra y bajos en carbohidratos " +
                                                  "\n refinados para estabilizar los niveles de glucosa, como avena (100 g) que aporta 4 g de fibra, 138 mg de magnesio (33% de " +
                                                  "\n la ingesta diaria recomendada) y 2.3 mg de zinc (21% de la ingesta diaria recomendada); almendras (28 g, aproximadamente  " +
                                                  "\n 23 unidades) con 7.3 mg de vitamina E (49% de la ingesta diaria recomendada), 76 mg de magnesio (18% de la ingesta diaria " +
                                                  "\n recomendada) y 3.5 g de fibra; espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta diaria recomendada), 79 mg de    " +
                                                  "\n magnesio (20% de la ingesta diaria recomendada) y 483 mcg de vitamina K (402% de la ingesta diaria recomendada); fresas   " +
                                                  "\n (100 g) con 59 mg de vitamina C (98% de la ingesta diaria recomendada), 2 g de fibra y antioxidantes flavonoides y polifenoles." +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad" +
                                                  "\n y que por ello la enfermedad y sus respuestas estén correctas. Para ello se recomienda hacer más de un Diagnóstico de Mi Vida  " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del    " +
                                                  "\n Diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita   " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tamaño regular)   " +
                                                  "\n para mantener las vías respiratorias hidratadas y reducir la viscosidad del moco, facilitando la respiración. También se pueden  " +
                                                  "\n incluir infusiones de hierbas con propiedades antiinflamatorias y caldos claros para reforzar la hidratación. EJERCICIO: La      " +
                                                  "\n actividad física debe ser controlada y adaptada a la condición del paciente, evitando desencadenantes como el aire frío o la     " +
                                                  "\n contaminación. Se recomienda ejercicios de respiración profunda y caminatas suaves de 20 a 30 minutos al día. POSIBLE TRATAMIENTO:   " +
                                                  "\n El tratamiento para el asma en adultos mayores suele incluir broncodilatadores de alivio rápido, como el salbutamol y                " +
                                                  "\n corticosteroides inhalados como la fluticasona. Algunas marcas reconocidas de salbutamol incluyen Ventolin y Aerolin; de fluticasona," +
                                                  "\n Flixotide y Pulmicort. ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades antiinflamatorias y antioxidantes, como   " +
                                                  "\n pescado graso, que aporta ácidos grasos Omega-3, beneficiosos para la salud pulmonar; zanahorias (100 g) que contienen 334% de la    " +
                                                  "\n ingesta diaria recomendada de vitamina A, 2.8 g de fibra y antioxidantes beta-carotenos; cúrcuma, con curcumina, que posee           " +
                                                  "\n propiedades antiinflamatorias; y kiwi (100 g) con 92 mg de vitamina C (153% de la ingesta diaria recomendada), 40 mcg de             " +
                                                  "\n vitamina K (33% de la ingesta diaria recomendada) y 312 mg de potasio. Este es solo un Diagnóstico predeterminado lógico,            " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas           " +
                                                  "\n estén correctas. Para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el                " +
                                                  "\n tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del Diagnóstico no le satisface del todo, se le           " +
                                                  "\n recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tamaño   " +
                                                  "\n regular) para mantener una adecuada hidratación y apoyar la función renal, especialmente en pacientes que toman         " +
                                                  "\n medicamentos antirretrovirales. EJERCICIO: Se sugiere realizar actividad física moderada, como caminatas de 30 a 45     " +
                                                  "\n minutos al día y ejercicios de resistencia, lo que contribuye a fortalecer el sistema inmunológico y mejorar la calidad " +
                                                  "\n de vida. POSIBLE TRATAMIENTO: El tratamiento para el VIH/SIDA consiste en la terapia antirretroviral (TAR), que incluye " +
                                                  "\n combinaciones de medicamentos como tenofovir, emtricitabina, dolutegravir y efavirenz. Algunas marcas reconocidas de    " +
                                                  "\n tenofovir incluyen Viread y Tenofovir Disoproxil; de emtricitabina, Emtriva y Truvada; de dolutegravir, Tivicay y Dovato;" +
                                                  "\n de efavirenz, Sustiva y Atripla. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes " +
                                                  "\n esenciales para fortalecer el sistema inmunológico, como aguacate, que aporta grasas saludables y vitamina E, clave para " +
                                                  "\n la protección celular; frutos rojos (100 g) ricos en antioxidantes y vitamina C, que ayudan a reducir el estrés oxidativo" +
                                                  "\n con 59 mg de vitamina C (98% de la ingesta diaria recomendada); espinacas (100 g) con alto contenido de hierro (2.7 mg,  " +
                                                  "\n 15% de la ingesta diaria recomendada) y magnesio (79 mg, 20% de la ingesta diaria recomendada); y almendras (28 g,       " +
                                                  "\n aproximadamente 23 unidades) que contienen vitamina E (7.3 mg, 49% de la ingesta diaria recomendada) y ácidos grasos     " +
                                                  "\n saludables, beneficiosos para la salud celular. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado    " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas. " +
                                                  "\n Para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado" +
                                                  "\n de su paciente. Además, por su salud, si la respuesta del Diagnóstico no le satisface del todo, se le recomienda mucho   " +
                                                  "\n consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de " +
                                                  "\n tamaño regular) para ayudar a eliminar toxinas y mantener una adecuada función renal. EJERCICIO: Se sugiere    " +
                                                  "\n actividad física moderada, como caminatas de 30 a 45 minutos al día, evitando esfuerzos excesivos mientras     " +
                                                  "\n persistan los síntomas. POSIBLE TRATAMIENTO: El tratamiento para la gonorrea en adultos mayores suele incluir  " +
                                                  "\n antibióticos como ceftriaxona y azitromicina. Algunas marcas reconocidas de ceftriaxona incluyen Rocephin y      " +
                                                  "\n Cefaxone; de azitromicina, Zitromax y Azitrocin. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en    " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico, como ajo, que posee propiedades   " +
                                                  "\n antimicrobianas naturales; espinacas (100 g) ricas en hierro (2.7 mg, 15% de la ingesta diaria recomendada) y    " +
                                                  "\n vitamina C (79 mg, 20% de la ingesta diaria recomendada), esenciales para la recuperación; jengibre, con efectos " +
                                                  "\n antiinflamatorios y antibacterianos; y cítricos como naranjas (1 unidad, 130 g) que aportan 70 mg de vitamina C    " +
                                                  "\n (78% de la ingesta diaria recomendada) y ayudan a reforzar las defensas del organismo. Este es solo un Diagnóstico " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello   " +
                                                  "\n la enfermedad y sus respuestas estén correctas. Para ello se recomienda hacer más de un Diagnóstico de Mi Vida para  " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del      " +
                                                  "\n Diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita" +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de           " +
                                                  "\n tamaño regular) para mantener una adecuada hidratación y ayudar a reducir la inflamación. También se pueden incluir      " +
                                                  "\n infusiones de hierbas con propiedades antivirales y caldos claros para reforzar la hidratación. EJERCICIO: Se sugiere    " +
                                                  "\n actividad física moderada, evitando el sobreesfuerzo y el estrés, ya que estos pueden desencadenar brotes recurrentes.   " +
                                                  "\n Se recomienda ejercicios de relajación y caminatas suaves de 20 a 30 minutos al día. POSIBLE TRATAMIENTO: El tratamiento " +
                                                  "\n para el herpes genital en adultos mayores suele incluir antivirales como aciclovir, famciclovir y valaciclovir. Algunas   " +
                                                  "\n marcas reconocidas de aciclovir incluyen Zovirax y Acivir; de famciclovir, Famvir y Famciclovir; de valaciclovir, Valtrex " +
                                                  "\n y Valaciclovir. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en lisina, un aminoácido que puede ayudar a     " +
                                                  "\n reducir la frecuencia de los brotes, como yogur, que aporta proteínas y probióticos beneficiosos; pescado, rico en ácidos " +
                                                  "\n grasos Omega-3 con propiedades antiinflamatorias; frutos secos como almendras (28 g, aproximadamente 23 unidades) que     " +
                                                  "\n contienen 7.3 mg de vitamina E (49% de la ingesta diaria recomendada) y antioxidantes; y vegetales de hoja verde como     " +
                                                  "\n espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta diaria recomendada) y 79 mg de magnesio (20% de la ingesta      " +
                                                  "\n diaria recomendada), esenciales para la regeneración celular. Este es solo un Diagnóstico predeterminado lógico, haberlo  " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén  " +
                                                  "\n correctas. Para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento" +
                                                  "\n adecuado de su paciente. Además, por su salud, si la respuesta del Diagnóstico no le satisface del todo, se le recomienda  " +
                                                  "\n mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2.5 a 3 litros de agua (entre 10 y 12 vasos de tamaño regular)   " +
                                                  "\n para mantener una adecuada hidratación y ayudar a reducir la fiebre y la inflamación. También se recomienda el   " +
                                                  "\n consumo de caldos claros y bebidas con electrolitos para evitar la deshidratación. EJERCICIO: Se sugiere         " +
                                                  "\n actividad física moderada, evitando esfuerzos excesivos mientras persistan los síntomas. En caso de fiebre,        " +
                                                  "\n se recomienda reposo y ejercicios de respiración profunda para mejorar la oxigenación. POSIBLE TRATAMIENTO: El     " +
                                                  "\n tratamiento para la sífilis en adultos mayores suele incluir antibióticos como penicilina G benzatina, ceftriaxona   " +
                                                  "\n y doxiciclina. Algunas marcas reconocidas de penicilina G benzatina incluyen Benzetacil y Pfizerpen; de ceftriaxona, " +
                                                  "\n Rocephin y Cefaxone; de doxiciclina, Vibramicina y Doxipar. ALIMENTACIÓN: Se recomienda el consumo de alimentos      " +
                                                  "\n ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico, como frutos rojos (100 g)    " +
                                                  "\n ricos en antioxidantes y vitamina C, que ayudan a reducir el estrés oxidativo con 59 mg de vitamina C (98% de la      " +
                                                  "\n ingesta diaria recomendada); espinacas (100 g) con alto contenido de hierro (2.7 mg, 15% de la ingesta diaria           " +
                                                  "\n recomendada) y magnesio (79 mg, 20% de la ingesta diaria recomendada); aguacate, que aporta grasas saludables y         " +
                                                  "\n vitamina E, clave para la protección celular; y almendras (28 g, aproximadamente 23 unidades) que contienen vitamina E  " +
                                                  "\n (7.3 mg, 49% de la ingesta diaria recomendada) y ácidos grasos saludables, beneficiosos para la salud celular. Este es  " +
                                                  "\n solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad " +
                                                  "\n y que por ello la enfermedad y sus respuestas estén correctas. Para ello se recomienda hacer más de un Diagnóstico de    " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta " +
                                                  "\n del Diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita" +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de aproximadamente 3 a 3.5 litros de agua (entre 12 y 14 vasos      " +
                                                  "\n de tamaño regular) para mantener una adecuada hidratación y ayudar a fluidificar las secreciones pulmonares,     " +
                                                  "\n facilitando la respiración. EJERCICIO: La actividad física debe ser moderada y adaptada a la condición del       " +
                                                  "\n paciente, evitando esfuerzos excesivos. Se recomienda caminatas suaves de 20 a 30 minutos al día, siempre que    " +
                                                  "\n no haya dificultad respiratoria, y ejercicios de respiración profunda para mejorar la oxigenación. POSIBLE       " +
                                                  "\n TRATAMIENTO: El tratamiento para la tuberculosis en adultos mayores suele incluir antibióticos como isoniazida,  " +
                                                  "\n rifampicina y etambutol. Algunas marcas reconocidas de isoniazida incluyen Nydrazid y Laniazid; de rifampicina,  " +
                                                  "\n Rifadin y Rimactane; de etambutol, Myambutol y Etibi. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos  " +
                                                  "\n en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico y reducir la inflamación pulmonar," +
                                                  "\n como zanahorias (100 g) que contienen aproximadamente 334% de la ingesta diaria recomendada de vitamina A, 2.8 g   " +
                                                  "\n de fibra y antioxidantes beta-carotenos; naranjas (1 unidad, 130 g) con 70 mg de vitamina C (78% de la ingesta     " +
                                                  "\n diaria recomendada), 3 g de fibra y 237 mg de potasio; espinacas (100 g) con 2.7 mg de hierro (15% de la ingesta   " +
                                                  "\n diaria recomendada), 79 mg de magnesio (20% de la ingesta diaria recomendada) y 483 mcg de vitamina K (402% de la  " +
                                                  "\n ingesta diaria recomendada); y almendras (28 g, aproximadamente 23 unidades) que aportan vitamina E (7.3 mg, 49%   " +
                                                  "\n de la ingesta diaria recomendada), magnesio (76 mg, 18% de la ingesta diaria recomendada) y fibra (3.5 g). Este es " +
                                                  "\n solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa       " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas. Para ello se recomienda hacer más de     " +
                                                  "\n un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Además, por   " +
                                                  "\n su salud, si la respuesta del Diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico,  " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de       " +
                                                  "\n tamaño regular) para mantener una adecuada hidratación y ayudar a reducir la inflamación en las articulaciones.      " +
                                                  "\n También se pueden incluir infusiones de hierbas con propiedades antiinflamatorias y caldos claros para reforzar      " +
                                                  "\n la hidratación. EJERCICIO: La actividad física debe ser moderada y adaptada a la condición del paciente, evitando    " +
                                                  "\n movimientos bruscos. Se recomienda ejercicios de bajo impacto como natación, yoga o caminatas suaves de 20 a 30      " +
                                                  "\n minutos al día para mejorar la movilidad sin generar estrés en las articulaciones. POSIBLE TRATAMIENTO: El tratamiento  " +
                                                  "\n para la artritis en adultos mayores suele incluir antiinflamatorios no esteroides (AINE) como el ibuprofeno y el        " +
                                                  "\n naproxeno, así como fármacos antirreumáticos modificadores de la enfermedad (FAME) como el metotrexato. Algunas marcas  " +
                                                  "\n reconocidas de ibuprofeno incluyen Advil y Motrin; de naproxeno, Aleve y Naprosyn; de metotrexato, Trexall y Rheumatrex." +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades antiinflamatorias y antioxidantes, como pescado     " +
                                                  "\n graso, que aporta ácidos grasos Omega-3, beneficiosos para la salud articular; cúrcuma, con curcumina, que posee        " +
                                                  "\n propiedades antiinflamatorias; frutos secos como almendras (28 g, aproximadamente 23 unidades) que contienen vitamina E " +
                                                  "\n y antioxidantes; y vegetales de hoja verde como espinacas (100 g) con hierro y magnesio, esenciales para la regeneración " +
                                                  "\n celular. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga" +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas. Para ello se recomienda hacer más de un    " +
                                                  "\n Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Además, por su salud,  " +
                                                  "\n si la respuesta del Diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico, Angel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos    " +
                                                  "\n de tamaño regular) para mantener una adecuada hidratación y ayudar a reducir la inflamación en las vías        " +
                                                  "\n respiratorias. También se recomienda el consumo de caldos claros y bebidas con electrolitos para evitar la     " +
                                                  "\n deshidratación. EJERCICIO: La actividad física debe ser moderada y adaptada a la condición del paciente,       " +
                                                  "\n evitando esfuerzos excesivos. Se recomienda ejercicios de respiración profunda y caminatas suaves de 15 a 20   " +
                                                  "\n minutos al día para mejorar la capacidad pulmonar. POSIBLE TRATAMIENTO: El tratamiento para la tosferina en    " +
                                                  "\n adultos mayores suele incluir antibióticos como azitromicina, claritromicina y eritromicina. Algunas marcas    " +
                                                  "\n reconocidas de azitromicina incluyen Zitromax y Azitrocin; de claritromicina, Biaxin y Claritromicina Genfar;     " +
                                                  "\n de eritromicina, Erythrocin y Ilosone. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes " +
                                                  "\n y nutrientes esenciales para fortalecer el sistema inmunológico y reducir la inflamación pulmonar, como zanahorias" +
                                                  "\n con vitamina A, naranjas con vitamina C, espinacas con hierro y magnesio, y almendras con vitamina E y fibra.     " +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga  " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas. Para ello se recomienda hacer más   " +
                                                  "\n de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Además,   " +
                                                  "\n por su salud, si la respuesta del Diagnóstico no le satisface del todo, se le recomienda mucho consultar a su     " +
                                                  "\n médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos   " +
                                                  "\n de tamaño regular) para mantener una adecuada hidratación y ayudar a reducir la fiebre y la inflamación.      " +
                                                  "\n También se recomienda el consumo de caldos claros y bebidas con electrolitos para evitar la deshidratación.   " +
                                                  "\n EJERCICIO: Se sugiere actividad física moderada, evitando esfuerzos excesivos mientras persistan los síntomas." +
                                                  "\n En caso de fiebre, se recomienda reposo y ejercicios de respiración profunda para mejorar la oxigenación.         " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento específico para las paperas, pero se pueden aliviar los síntomas    " +
                                                  "\n con analgésicos y antipiréticos como paracetamol e ibuprofeno. Algunas marcas reconocidas de paracetamol incluyen " +
                                                  "\n Tylenol y Panadol; de ibuprofeno, Advil y Motrin. También se recomienda el uso de compresas frías en la zona      " +
                                                  "\n inflamada para reducir el dolor. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y        " +
                                                  "\n nutrientes esenciales para fortalecer el sistema inmunológico, como naranjas con vitamina C, fresas con flavonoides  " +
                                                  "\n y polifenoles, espinacas con hierro y magnesio, y almendras con vitamina E y fibra. Este es solo un Diagnóstico      " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello   " +
                                                  "\n la enfermedad y sus respuestas estén correctas. Para ello se recomienda hacer más de un Diagnóstico de Mi Vida para  " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del      " +
                                                  "\n Diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico, Angel L Montes agradece tu       " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de aproximadamente 3 a 3.5 litros de agua (entre 12 y 14 vasos de tamaño  " +
                                                  "\n regular) para prevenir la deshidratación causada por la fiebre y ayudar a aliviar los síntomas. También se pueden      " +
                                                  "\n incluir infusiones de hierbas con propiedades antiinflamatorias y caldos claros para mantener el equilibrio de         " +
                                                  "\n electrolitos. EJERCICIO: Se sugiere actividad física moderada, evitando el sobreesfuerzo y el estrés, ya que estos     " +
                                                  "\n pueden agravar los síntomas. En caso de fiebre, se recomienda reposo y ejercicios de estiramiento suaves para evitar   " +
                                                  "\n la fatiga muscular. POSIBLE TRATAMIENTO: No existen medicamentos específicos para tratar el zika, pero se pueden aliviar   " +
                                                  "\n los síntomas con reposo, hidratación y analgésicos como acetaminofén. Algunas marcas reconocidas de acetaminofén incluyen  " +
                                                  "\n Tylenol y Tempra. Se recomienda evitar el uso de aspirina y otros antiinflamatorios no esteroides hasta descartar la       " +
                                                  "\n posibilidad de dengue. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales  " +
                                                  "\n para fortalecer el sistema inmunológico, como frutos rojos ricos en vitamina C, espinacas con alto contenido de hierro y   " +
                                                  "\n magnesio, aguacate que aporta grasas saludables y vitamina E, y almendras con vitamina E y ácidos grasos saludables.       " +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa       " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas. Para ello se recomienda hacer más de un          " +
                                                  "\n Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Además, por su salud,    " +
                                                  "\n si la respuesta del Diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico, Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 3 a 3.5 litros de agua (entre 12 y 14 vasos de tamaño regular)       " +
                                                  "\n para prevenir la deshidratación causada por la diarrea y la fiebre. También se recomienda el consumo de              " +
                                                  "\n soluciones de rehidratación oral para reponer los minerales perdidos. EJERCICIO: Se sugiere actividad física         " +
                                                  "\n moderada, evitando esfuerzos excesivos mientras persistan los síntomas. En caso de fiebre y diarrea, se recomienda      " +
                                                  "\n reposo y ejercicios de respiración profunda para mejorar la oxigenación. POSIBLE TRATAMIENTO: No existe un tratamiento  " +
                                                  "\n específico para la infección por rotavirus, pero se recomienda el consumo de líquidos de rehidratación oral y en casos  " +
                                                  "\n graves, la administración de líquidos intravenosos. ALIMENTACIÓN: Se recomienda el consumo de alimentos blandos y fáciles" +
                                                  "\n de digerir, como plátanos ricos en potasio, arroz que ayuda a reducir la diarrea, zanahorias con antioxidantes           " +
                                                  "\n beta-carotenos, y yogur que aporta probióticos beneficiosos para la recuperación. Este es solo un Diagnóstico            " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la    " +
                                                  "\n enfermedad y sus respuestas estén correctas. Para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer" +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del Diagnóstico no le     " +
                                                  "\n satisface del todo, se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida)     " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos       " +
                                                  "\n de tamaño regular) para mantener una adecuada hidratación y ayudar al cuerpo a combatir la infección. En casos    " +
                                                  "\n de fiebre, se recomienda aumentar la ingesta de líquidos y consumir caldos claros para evitar la deshidratación.  " +
                                                  "\n EJERCICIO: Se sugiere actividad física moderada, evitando esfuerzos excesivos mientras persistan los síntomas.    " +
                                                  "\n En casos graves, se recomienda reposo y ejercicios de respiración profunda para mejorar la oxigenación.           " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la listeriosis en adultos mayores suele incluir antibióticos como ampicilina " +
                                                  "\n y gentamicina. Algunas marcas reconocidas de ampicilina incluyen Ampicil y Principen; de gentamicina, Garamycin y     " +
                                                  "\n Gentak. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para       " +
                                                  "\n fortalecer el sistema inmunológico, como ajo con propiedades antimicrobianas naturales, espinacas ricas en hierro     " +
                                                  "\n y vitamina C, jengibre con efectos antiinflamatorios y antibacterianos, y cítricos como naranjas que aportan vitamina C  " +
                                                  "\n y ayudan a reforzar las defensas del organismo. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado    " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas. " +
                                                  "\n Para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado" +
                                                  "\n de su paciente. Además, por su salud, si la respuesta del Diagnóstico no le satisface del todo, se le recomienda mucho   " +
                                                  "\n consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de aproximadamente 3 a 3.5 litros de agua (entre 12 y 14 vasos    " +
                                                  "\n de tamaño regular) para prevenir la deshidratación causada por la diarrea y la fiebre. También se recomienda   " +
                                                  "\n el consumo de soluciones de rehidratación oral para reponer los minerales perdidos. EJERCICIO: Se sugiere      " +
                                                  "\n actividad física moderada, evitando esfuerzos excesivos mientras persistan los síntomas. En caso de fiebre     " +
                                                  "\n y diarrea, se recomienda reposo y ejercicios de respiración profunda para mejorar la oxigenación. POSIBLE      " +
                                                  "\n TRATAMIENTO: El tratamiento para la shigelosis en adultos mayores suele incluir antibióticos como ciprofloxacina, " +
                                                  "\n azitromicina y ceftriaxona, especialmente en casos graves o en pacientes con sistemas inmunológicos debilitados.  " +
                                                  "\n También se recomienda el reemplazo de líquidos y sales para evitar la deshidratación. ALIMENTACIÓN: Se recomienda " +
                                                  "\n el consumo de alimentos blandos y fáciles de digerir, como plátanos ricos en potasio, arroz que ayuda a reducir   " +
                                                  "\n la diarrea, zanahorias con antioxidantes beta-carotenos, y yogur que aporta probióticos beneficiosos para la      " +
                                                  "\n recuperación. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el   " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas. Para ello se         " +
                                                  "\n recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado      " +
                                                  "\n de su paciente. Además, por su salud, si la respuesta del Diagnóstico no le satisface del todo, se le recomienda  " +
                                                  "\n mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de  " +
                                                  "\n tamaño regular) para mantener una adecuada hidratación y ayudar a fluidificar las secreciones pulmonares,       " +
                                                  "\n facilitando la respiración. EJERCICIO: La actividad física debe ser moderada y adaptada a la condición del      " +
                                                  "\n paciente, evitando esfuerzos excesivos. Se recomienda caminatas suaves de 20 a 30 minutos al día, siempre       " +
                                                  "\n que no haya dificultad respiratoria, y ejercicios de respiración profunda para mejorar la oxigenación.          " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la EPOC en adultos mayores suele incluir broncodilatadores como        " +
                                                  "\n salbutamol y tiotropio, corticosteroides inhalados como fluticasona, oxigenoterapia en casos avanzados y        " +
                                                  "\n rehabilitación pulmonar para mejorar la calidad de vida. ALIMENTACIÓN: Se recomienda el consumo de alimentos    " +
                                                  "\n ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico y reducir la inflamación " +
                                                  "\n pulmonar, como zanahorias con vitamina A, naranjas con vitamina C, espinacas con hierro y magnesio, y almendras    " +
                                                  "\n con vitamina E y fibra. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas. Para ello se   " +
                                                  "\n recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de    " +
                                                  "\n su paciente. Además, por su salud, si la respuesta del Diagnóstico no le satisface del todo, se le recomienda mucho" +
                                                  "\n consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tamaño   " +
                                                  "\n regular) para mantener una adecuada hidratación y ayudar al cuerpo a eliminar la infección. Además, se pueden incluir   " +
                                                  "\n infusiones de hierbas con propiedades antimicrobianas y caldos claros para reforzar la hidratación. EJERCICIO: Se       " +
                                                  "\n sugiere actividad física moderada, evitando esfuerzos excesivos mientras persistan los síntomas. Se recomienda caminatas  " +
                                                  "\n suaves de 30 minutos al día y ejercicios de movilidad para mejorar la circulación y el bienestar general. POSIBLE         " +
                                                  "\n TRATAMIENTO: El tratamiento para la clamidia en adultos mayores suele incluir antibióticos como azitromicina y doxiciclina." +
                                                  "\n Algunas marcas reconocidas de azitromicina incluyen Zitromax y Azitrocin; de doxiciclina, Vibramicina y Doxipar.          " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer        " +
                                                  "\n el sistema inmunológico, como ajo con propiedades antimicrobianas naturales, espinacas ricas en hierro y vitamina C,      " +
                                                  "\n jengibre con efectos antiinflamatorios y antibacterianos, y cítricos como naranjas que aportan vitamina C y ayudan a      " +
                                                  "\n reforzar las defensas del organismo. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza   " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas. Para ello     " +
                                                  "\n se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su     " +
                                                  "\n paciente. Además, por su salud, si la respuesta del Diagnóstico no le satisface del todo, se le recomienda mucho consultar" +
                                                  "\n a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos     " +
                                                  "\n de tamaño regular) para mantener una adecuada hidratación y ayudar a reducir la fiebre y la inflamación.        " +
                                                  "\n También se recomienda el consumo de caldos claros y bebidas con electrolitos para evitar la deshidratación.     " +
                                                  "\n EJERCICIO: Se sugiere actividad física moderada, evitando esfuerzos excesivos mientras persistan los síntomas.  " +
                                                  "\n En caso de fiebre, se recomienda reposo y ejercicios de respiración profunda para mejorar la oxigenación.       " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la meningitis bacteriana en adultos mayores suele incluir antibióticos   " +
                                                  "\n intravenosos como ceftriaxona o ampicilina, dependiendo del agente causal. También se pueden recetar corticoides  " +
                                                  "\n para reducir la inflamación cerebral y medicamentos para controlar las convulsiones en casos graves. ALIMENTACIÓN:" +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema   " +
                                                  "\n inmunológico, como frutos rojos ricos en vitamina C, espinacas con alto contenido de hierro y magnesio, aguacate  " +
                                                  "\n que aporta grasas saludables y vitamina E, y almendras con vitamina E y ácidos grasos saludables. Este es solo un " +
                                                  "\n Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y " +
                                                  "\n que por ello la enfermedad y sus respuestas estén correctas. Para ello se recomienda hacer más de un Diagnóstico  " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la " +
                                                  "\n respuesta del Diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico, Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de aproximadamente 2.5 a 3 litros de agua (entre 10 y 12 vasos de tamaño regular) " +
                                                  "\n para mantener una adecuada hidratación y ayudar al cuerpo a eliminar toxinas. También se recomienda el consumo de infusiones   " +
                                                  "\n antioxidantes y caldos ricos en minerales para reforzar la hidratación. EJERCICIO: Se sugiere actividad física moderada,       " +
                                                  "\n adaptada a la condición del paciente, como caminatas suaves de 30 minutos al día y ejercicios de respiración profunda para     " +
                                                  "\n mejorar la oxigenación. POSIBLE TRATAMIENTO: El tratamiento para el cáncer en adultos mayores depende del tipo y estadio de    " +
                                                  "\n la enfermedad, pero puede incluir cirugía, quimioterapia con medicamentos como paclitaxel y cisplatino, radioterapia y terapias" +
                                                  "\n dirigidas. En algunos casos, se puede optar por tratamientos paliativos para mejorar la calidad de vida. ALIMENTACIÓN: Se      " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico y    " +
                                                  "\n reducir la inflamación celular, como zanahorias con vitamina A, naranjas con vitamina C, espinacas con hierro y magnesio, y    " +
                                                  "\n almendras con vitamina E y fibra. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%   " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas. Para ello se recomienda    " +
                                                  "\n hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Además,      " +
                                                  "\n por su salud, si la respuesta del Diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico,          " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            
                        }
                        if(EstaturaMasculino.equals("1.45-1.70 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACIÓN: En adultos mayores, la gripe puede provocar una mayor pérdida de líquidos debido a fiebre, sudoración      " +
                                                  "\n y disminución del consumo de agua. Se recomienda un consumo diario de 2.5 a 3 litros de líquidos, incluyendo agua,      " +
                                                  "\n caldos y tés sin cafeína, para prevenir la deshidratación y ayudar a mantener la función inmunológica. La hidratación     " +
                                                  "\n adecuada también contribuye a mantener las mucosas húmedas, lo que facilita la expulsión del virus y reduce la irritación " +
                                                  "\n en la garganta. EJERCICIO: La actividad física debe ser moderada y adaptada a la condición del paciente, recomendándose   " +
                                                  "\n ejercicios de bajo impacto como caminatas suaves de 30 a 45 minutos al día, siempre evitando el esfuerzo excesivo para    " +
                                                  "\n no comprometer la recuperación. POSIBLE TRATAMIENTO: Para la gripe en adultos mayores, se recomienda el uso de antivirales  " +
                                                  "\n como el oseltamivir (Tamiflu) para reducir la duración y gravedad de los síntomas, además de medicamentos para aliviar la   " +
                                                  "\n fiebre y el malestar como el paracetamol (Tempra) o el ibuprofeno (Advil). También es esencial la vacunación anual contra   " +
                                                  "\n la influenza para prevenir complicaciones graves. En cuanto a la alimentación, se recomienda el consumo de frutas y verduras" +
                                                  "\n ricas en vitaminas y antioxidantes para fortalecer el sistema inmune, tales como: Naranjas y kiwis: ricos en vitamina C, que  " +
                                                  "\n ayuda a reducir la duración de los síntomas. Espinacas y brócoli: contienen antioxidantes y vitamina E, esenciales para la    " +
                                                  "\n recuperación. Jengibre y cúrcuma: poseen propiedades antiinflamatorias que pueden aliviar la congestión y el malestar general." +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad " +
                                                  "\n y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida   " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico  " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida)     " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n HIDRATACIÓN: En adultos mayores, la neumonía puede provocar fiebre alta y sudoración excesiva, lo que aumenta   " +
                                                  "\n el riesgo de deshidratación. Se recomienda un consumo diario de 2.5 a 3 litros de líquidos, incluyendo agua,    " +
                                                  "\n caldos y tés sin cafeína, para mantener la hidratación y ayudar a la recuperación. La hidratación adecuada      " +
                                                  "\n también contribuye a mantener las secreciones pulmonares más fluidas, facilitando la expectoración. EJERCICIO:    " +
                                                  "\n La actividad física debe ser mínima durante la fase aguda de la enfermedad, pero una vez en recuperación, se      " +
                                                  "\n recomienda caminar 20 a 30 minutos al día para mejorar la capacidad pulmonar y evitar la pérdida de masa muscular. " +
                                                  "\n POSIBLE TRATAMIENTO: Para la neumonía en adultos mayores, el tratamiento suele incluir antibióticos como la        " +
                                                  "\n amoxicilina o la azitromicina, dependiendo del tipo de infección. También se pueden administrar medicamentos para  " +
                                                  "\n reducir la fiebre y aliviar el malestar, como el paracetamol (Tempra) o el ibuprofeno (Advil). En casos graves,    " +
                                                  "\n puede ser necesario el uso de oxígeno suplementario. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos     " +
                                                  "\n en vitaminas y antioxidantes para fortalecer el sistema inmune, tales como: Naranjas y kiwis: ricos en vitamina C,   " +
                                                  "\n que ayuda a reducir la duración de los síntomas. Espinacas y brócoli: contienen antioxidantes y vitamina E,          " +
                                                  "\n esenciales para la recuperación. Jengibre y cúrcuma: poseen propiedades antiinflamatorias que pueden aliviar la      " +
                                                  "\n congestión y el malestar general. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello " +
                                                  "\n se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su " +
                                                  "\n paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar" +
                                                  "\n a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACIÓN: En adultos mayores con diabetes, la hidratación es clave para mantener niveles adecuados de glucosa  " +
                                                  "\n en sangre y prevenir complicaciones renales. Se recomienda un consumo diario de 2 a 2.5 litros de agua, evitando  " +
                                                  "\n bebidas azucaradas y con cafeína, ya que pueden afectar el control de la glucosa. EJERCICIO: La actividad física  " +
                                                  "\n debe ser moderada y adaptada a la condición del paciente, recomendándose ejercicios de bajo impacto como caminatas  " +
                                                  "\n suaves de 30 a 45 minutos al día, lo que ayuda a mejorar la sensibilidad a la insulina y controlar el peso. POSIBLE " +
                                                  "\n TRATAMIENTO: Para la diabetes en adultos mayores, el tratamiento suele incluir medicamentos como la metformina para " +
                                                  "\n mejorar la sensibilidad a la insulina, además de insulina en algunos casos. También se recomienda el monitoreo      " +
                                                  "\n constante de la glucosa y ajustes en la dieta. ALIMENTACIÓN: Se recomienda el consumo de alimentos con bajo índice  " +
                                                  "\n glucémico y ricos en fibra para estabilizar los niveles de azúcar en sangre, tales como: Avena y legumbres: ayudan  " +
                                                  "\n a regular la glucosa y mejorar la digestión. Frutas como manzanas y peras: contienen fibra y antioxidantes sin elevar" +
                                                  "\n bruscamente la glucosa. Verduras de hoja verde como espinacas y acelgas: ricas en magnesio, que ayuda a mejorar la   " +
                                                  "\n sensibilidad a la insulina. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al    " +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello   " +
                                                  "\n se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de   " +
                                                  "\n su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho     " +
                                                  "\n consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN: En adultos mayores con asma, la hidratación es fundamental para mantener las vías respiratorias húmedas y  " +
                                                  "\n reducir la irritación. Se recomienda un consumo diario de 2 a 2.5 litros de agua, además de infusiones sin cafeína que  " +
                                                  "\n ayuden a despejar las vías respiratorias. EJERCICIO: La actividad física debe ser controlada y adaptada a la capacidad  " +
                                                  "\n del paciente, recomendándose ejercicios de bajo impacto como caminatas suaves de 30 a 40 minutos al día, evitando       " +
                                                  "\n ambientes fríos o contaminados que puedan desencadenar síntomas. POSIBLE TRATAMIENTO: Para el asma en adultos mayores,  " +
                                                  "\n el tratamiento suele incluir broncodilatadores de alivio rápido como el salbutamol (Ventolin), corticosteroides inhalados" +
                                                  "\n como la fluticasona (Flixotide) y en algunos casos, modificadores de leucotrienos como el montelukast (Singulair).       " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades antiinflamatorias y antioxidantes para mejorar       " +
                                                  "\n la función pulmonar, tales como: Pescados grasos como salmón y atún: ricos en Omega-3, que ayudan a reducir la inflamación" +
                                                  "\n de las vías respiratorias. Frutas y verduras de colores vivos como arándanos y espinacas: ricas en antioxidantes y       " +
                                                  "\n vitamina C, que fortalecen el sistema inmune. Jengibre y cúrcuma: contienen compuestos con efectos antiinflamatorios     " +
                                                  "\n que pueden ser beneficiosos para las vías respiratorias. Este es solo un Diagnóstico predeterminado lógico, haberlo      " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas       " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en       " +
                                                  "\n el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo     " +
                                                  "\n se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN: En adultos mayores con VIH/SIDA, la hidratación es fundamental para mantener la función renal y reducir   " +
                                                  "\n los efectos secundarios de los medicamentos antirretrovirales. Se recomienda un consumo diario de 2 a 3 litros de agua," +
                                                  "\n además de infusiones sin cafeína y caldos ligeros para mejorar la absorción de nutrientes y evitar la deshidratación   " +
                                                  "\n causada por fiebre o diarrea. EJERCICIO: La actividad física debe ser moderada y adaptada a la condición del paciente, " +
                                                  "\n recomendándose ejercicios de bajo impacto como caminatas suaves de 30 a 45 minutos al día, lo que ayuda a fortalecer el" +
                                                  "\n sistema inmunológico y mejorar la salud cardiovascular. POSIBLE TRATAMIENTO: Para el VIH/SIDA en adultos mayores, el   " +
                                                  "\n tratamiento incluye terapia antirretroviral (TAR) con combinaciones de medicamentos como tenofovir, emtricitabina y    " +
                                                  "\n dolutegravir, que ayudan a mantener el virus bajo control y mejorar la calidad de vida. Es crucial el monitoreo constante " +
                                                  "\n de la carga viral y el estado inmunológico. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y  " +
                                                  "\n proteínas para fortalecer el sistema inmune, tales como: Frutas cítricas como naranjas y kiwis: ricas en vitamina C, que  " +
                                                  "\n ayuda a reducir el estrés oxidativo. Pescados grasos como salmón y atún: ricos en Omega-3, que contribuyen a la salud     " +
                                                  "\n cardiovascular. Legumbres y frutos secos: fuentes de proteínas y zinc, esenciales para la regeneración celular. Este es   " +
                                                  "\n solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad   " +
                                                  "\n y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de     " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta    " +
                                                  "\n del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita  " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN: En adultos mayores con gonorrea, la hidratación es clave para ayudar a eliminar la bacteria y    " +
                                                  "\n reducir la inflamación del tracto urinario. Se recomienda un consumo diario de 2 a 2.5 litros de agua, además " +
                                                  "\n de jugos naturales sin azúcar y caldos ligeros para mejorar la función renal y reducir molestias urinarias.   " +
                                                  "\n EJERCICIO: La actividad física debe ser moderada y adaptada a la condición del paciente, recomendándose       " +
                                                  "\n ejercicios de bajo impacto como caminatas suaves de 30 a 40 minutos al día, evitando esfuerzos excesivos      " +
                                                  "\n que puedan agravar los síntomas. POSIBLE TRATAMIENTO: Para la gonorrea en adultos mayores, el tratamiento     " +
                                                  "\n recomendado es una dosis única de ceftriaxona 500 mg administrada por vía intramuscular, acompañada de        " +
                                                  "\n doxiciclina en caso de coinfección con clamidia. Es fundamental completar el tratamiento y evitar relaciones  " +
                                                  "\n sexuales hasta la recuperación total. ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades     " +
                                                  "\n antibacterianas y antiinflamatorias para mejorar la recuperación, tales como: Ajo y cebolla: contienen compuestos" +
                                                  "\n con efectos antimicrobianos naturales. Yogur natural: fuente de probióticos que ayudan a restaurar la flora   " +
                                                  "\n intestinal afectada por los antibióticos. Frutas y verduras ricas en vitamina C como fresas y pimientos:      " +
                                                  "\n fortalecen el sistema inmune y aceleran la recuperación. Este es solo un Diagnóstico predeterminado lógico,   " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y   " +
                                                  "\n sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer" +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico" +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACIÓN: En adultos mayores con herpes genital, la hidratación es esencial para reducir la inflamación y mejorar " +
                                                  "\n la cicatrización de las lesiones. Se recomienda un consumo diario de 2 a 2.5 litros de agua, además de infusiones de " +
                                                  "\n manzanilla y caldos ligeros para aliviar molestias y fortalecer el sistema inmunológico. EJERCICIO: La actividad     " +
                                                  "\n física debe ser moderada y adaptada a la condición del paciente, recomendándose ejercicios de bajo impacto como      " +
                                                  "\n caminatas suaves de 30 a 40 minutos al día, evitando el estrés excesivo que pueda desencadenar brotes. POSIBLE       " +
                                                  "\n TRATAMIENTO: Para el herpes genital en adultos mayores, el tratamiento suele incluir antivirales como aciclovir,     " +
                                                  "\n valaciclovir o famciclovir, que ayudan a reducir la duración y gravedad de los brotes. También se recomienda el      " +
                                                  "\n uso de cremas tópicas para aliviar el dolor y la inflamación. ALIMENTACIÓN: Se recomienda el consumo de alimentos    " +
                                                  "\n con propiedades antivirales y antiinflamatorias para mejorar la recuperación, tales como: Frutas ricas en            " +
                                                  "\n antioxidantes como arándanos y moras: ayudan a reducir el estrés oxidativo. Jengibre y cúrcuma: poseen propiedades   " +
                                                  "\n antiinflamatorias que pueden aliviar los síntomas. Pescados grasos como salmón y sardinas: ricos en Omega-3, que     " +
                                                  "\n contribuyen a la salud celular y la cicatrización. Este es solo un Diagnóstico predeterminado lógico, haberlo        " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas   " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en   " +
                                                  "\n el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo " +
                                                  "\n se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN: En adultos mayores con sífilis, la hidratación es clave para ayudar al cuerpo a eliminar toxinas   " +
                                                  "\n y mantener la función renal. Se recomienda un consumo diario de 2 a 2.5 litros de agua, además de infusiones    " +
                                                  "\n sin cafeína y caldos ligeros para mejorar la circulación y reducir la fatiga. EJERCICIO: La actividad física    " +
                                                  "\n debe ser moderada y adaptada a la condición del paciente, recomendándose ejercicios de bajo impacto como        " +
                                                  "\n caminatas suaves de 30 a 40 minutos al día, lo que ayuda a mejorar la circulación y fortalecer el sistema       " +
                                                  "\n inmunológico. POSIBLE TRATAMIENTO: Para la sífilis en adultos mayores, el tratamiento estándar es penicilina    " +
                                                  "\n benzatina, administrada en una dosis única o en varias dosis dependiendo del estadio de la enfermedad. En casos " +
                                                  "\n de alergia a la penicilina, se pueden usar alternativas como la doxiciclina o la ceftriaxona. ALIMENTACIÓN: Se  " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema    " + 
                                                  "\n inmune, tales como: Frutas cítricas como naranjas y kiwis: ricas en vitamina C, que ayuda a reducir el estrés   " +
                                                  "\n oxidativo. Pescados grasos como salmón y atún: ricos en Omega-3, que contribuyen a la salud cardiovascular.     " +
                                                  "\n Legumbres y frutos secos: fuentes de proteínas y zinc, esenciales para la regeneración celular. Este es solo un " +
                                                  "\n Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad " +
                                                  "\n y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico" +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la " +
                                                  "\n respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACIÓN: En adultos mayores con tuberculosis, la hidratación es fundamental para mantener la función     " +
                                                  "\n pulmonar y reducir la viscosidad de las secreciones. Se recomienda un consumo diario de 2.5 a 3 litros de    " +
                                                  "\n agua, además de caldos y jugos naturales sin azúcar para mejorar la absorción de nutrientes y evitar la      " +
                                                  "\n deshidratación causada por fiebre y sudoración. EJERCICIO: La actividad física debe ser mínima durante la    " +
                                                  "\n fase aguda de la enfermedad, pero una vez en recuperación, se recomienda caminar 20 a 30 minutos al día para     " +
                                                  "\n mejorar la capacidad pulmonar y evitar la pérdida de masa muscular. POSIBLE TRATAMIENTO: Para la tuberculosis    " +
                                                  "\n en adultos mayores, el tratamiento estándar incluye una combinación de antibióticos como isoniazida, rifampicina," +
                                                  "\n etambutol y pirazinamida, administrados durante un período de 6 meses. Es crucial completar el tratamiento para  " +
                                                  "\n evitar recaídas y resistencia bacteriana. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en vitaminas " +
                                                  "\n y antioxidantes para fortalecer el sistema inmune, tales como: Frutas cítricas como naranjas y kiwis: ricas en   " +
                                                  "\n vitamina C, que ayuda a reducir la duración de los síntomas. Espinacas y brócoli: contienen antioxidantes y      " +
                                                  "\n vitamina E, esenciales para la recuperación. Jengibre y cúrcuma: poseen propiedades antiinflamatorias que pueden    " +
                                                  "\n aliviar la congestión y el malestar general. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén       " +
                                                  "\n correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el     " +
                                                  "\n tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo   " +
                                                  "\n se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACIÓN: En adultos mayores con artritis, la hidratación es clave para mantener la lubricación de las    " +
                                                  "\n articulaciones y reducir la inflamación. Se recomienda un consumo diario de 2 a 2.5 litros de agua, además   " +
                                                  "\n de infusiones de jengibre y cúrcuma para aliviar el dolor articular. EJERCICIO: La actividad física debe     " +
                                                  "\n ser moderada y adaptada a la condición del paciente, recomendándose ejercicios de bajo impacto como caminatas   " +
                                                  "\n suaves de 30 a 45 minutos al día, además de ejercicios de movilidad articular como yoga o tai chi. POSIBLE      " +
                                                  "\n TRATAMIENTO: Para la artritis en adultos mayores, el tratamiento suele incluir antiinflamatorios no esteroides  " +
                                                  "\n (AINEs) como ibuprofeno o naproxeno, además de suplementos de glucosamina y condroitina para mejorar la salud   " +
                                                  "\n articular. En casos más severos, se pueden usar corticosteroides o terapia biológica. ALIMENTACIÓN: Se recomienda  " +
                                                  "\n el consumo de alimentos con propiedades antiinflamatorias y antioxidantes para mejorar la función articular,       " +
                                                  "\n tales como: Pescados grasos como salmón y atún: ricos en Omega-3, que ayudan a reducir la inflamación de las       " +
                                                  "\n articulaciones. Frutas y verduras de colores vivos como arándanos y espinacas: ricas en antioxidantes y vitamina C,  " +
                                                  "\n que fortalecen el sistema inmune. Jengibre y cúrcuma: contienen compuestos con efectos antiinflamatorios que pueden  " +
                                                  "\n ser beneficiosos para las articulaciones. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no   " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas," +
                                                  "\n para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento     " +
                                                  "\n adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda" +
                                                  "\n mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACIÓN: En adultos mayores con tosferina, la hidratación es fundamental para aliviar la irritación de   " +
                                                  "\n las vías respiratorias y reducir la viscosidad de las secreciones. Se recomienda un consumo diario de 2.5 a  " +
                                                  "\n 3 litros de agua, distribuidos en pequeñas cantidades a lo largo del día para evitar la fatiga respiratoria. " +
                                                  "\n Además, se pueden incluir caldos tibios y tés sin cafeína para ayudar a calmar la garganta y reducir la      " +
                                                  "\n inflamación. EJERCICIO: La actividad física debe ser mínima durante la fase aguda de la enfermedad, pero una  " +
                                                  "\n vez en recuperación, se recomienda caminar 20 a 30 minutos al día para mejorar la capacidad pulmonar y evitar " +
                                                  "\n la pérdida de masa muscular. POSIBLE TRATAMIENTO: Para la tosferina en adultos mayores, el tratamiento suele  " +
                                                  "\n incluir antibióticos como azitromicina, claritromicina o eritromicina, administrados en los primeros días de  " +
                                                  "\n la enfermedad para reducir la severidad de los síntomas. También se recomienda el uso de broncodilatadores en " +
                                                  "\n casos de dificultad respiratoria severa. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en         " +
                                                  "\n antioxidantes y propiedades antiinflamatorias para fortalecer el sistema inmune, tales como: Frutas cítricas  " +
                                                  "\n como naranjas y kiwis: ricas en vitamina C, que ayuda a reducir la inflamación de las vías respiratorias.     " +
                                                  "\n Jengibre y cúrcuma: poseen propiedades antiinflamatorias que pueden aliviar la congestión y el malestar general. " +
                                                  "\n Miel y propóleo: ayudan a calmar la garganta y reducir la irritación. Este es solo un Diagnóstico predeterminado " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad" +
                                                  "\n y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico   " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la    " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACIÓN: En adultos mayores con paperas, la hidratación es clave para reducir la fiebre y aliviar la    " +
                                                  "\n inflamación de las glándulas salivales. Se recomienda un consumo diario de 2 a 2.5 litros de agua, además   " +
                                                  "\n de caldos ligeros y jugos naturales sin azúcar para mejorar la absorción de nutrientes y evitar la          " +
                                                  "\n deshidratación causada por fiebre. EJERCICIO: La actividad física debe ser mínima durante la fase aguda     " +
                                                  "\n de la enfermedad, pero una vez en recuperación, se recomienda caminar 20 a 30 minutos al día para mejorar     " +
                                                  "\n la circulación y evitar la pérdida de masa muscular. POSIBLE TRATAMIENTO: Para las paperas en adultos mayores," +
                                                  "\n el tratamiento suele incluir analgésicos como paracetamol o ibuprofeno para reducir el dolor y la fiebre.     " +
                                                  "\n También se recomienda el uso de compresas frías en la zona inflamada para aliviar la hinchazón. ALIMENTACIÓN:   " +
                                                  "\n Se recomienda el consumo de alimentos suaves y ricos en vitaminas para facilitar la recuperación, tales como:   " +
                                                  "\n Yogur natural: fuente de probióticos que ayudan a restaurar la flora intestinal afectada por la fiebre. Frutas  " +
                                                  "\n ricas en vitamina C como fresas y pimientos: fortalecen el sistema inmune y aceleran la recuperación. Sopas y   " +
                                                  "\n purés: fáciles de consumir y ayudan a mantener la hidratación. Este es solo un Diagnóstico predeterminado lógico," +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus  " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le   " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app      " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACIÓN: En adultos mayores con Zika, la hidratación es esencial para reducir la fiebre y prevenir la deshidratación  " +
                                                  "\n causada por sudoración excesiva. Se recomienda un consumo diario de 2.5 a 3 litros de agua, además de infusiones de       " +
                                                  "\n manzanilla y caldos ligeros para aliviar molestias y fortalecer el sistema inmunológico. EJERCICIO: La actividad física   " +
                                                  "\n debe ser mínima durante la fase aguda de la enfermedad, pero una vez en recuperación, se recomienda caminar 20 a 30       " +
                                                  "\n minutos al día para mejorar la circulación y evitar la fatiga. POSIBLE TRATAMIENTO: Para el Zika en adultos mayores,      " +
                                                  "\n no existe un tratamiento específico, pero se recomienda reposo, hidratación y el uso de analgésicos como paracetamol      " +
                                                  "\n para aliviar los síntomas. Se debe evitar el uso de aspirina y otros AINEs hasta descartar dengue para reducir el riesgo  " +
                                                  "\n de sangrado. ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades antivirales y antioxidantes para mejorar " +
                                                  "\n la recuperación, tales como: Frutas ricas en antioxidantes como arándanos y moras: ayudan a reducir el estrés oxidativo.  " +
                                                  "\n Jengibre y cúrcuma: poseen propiedades antiinflamatorias que pueden aliviar los síntomas. Pescados grasos como salmón y   " +
                                                  "\n sardinas: ricos en Omega-3, que contribuyen a la salud celular y la cicatrización. Este es solo un Diagnóstico            " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la     " +
                                                  "\n enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer" +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le     " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida)    " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACIÓN: En adultos mayores con rotavirus, la hidratación es esencial para prevenir la deshidratación  " +
                                                  "\n severa causada por diarrea y vómitos. Se recomienda un consumo diario de 3 a 3.5 litros de líquidos,       " +
                                                  "\n incluyendo agua, sueros de rehidratación oral y caldos ligeros. Es importante beber en pequeñas cantidades " +
                                                  "\n y de manera frecuente para evitar la fatiga gastrointestinal. EJERCICIO: Durante la fase aguda de la       " +
                                                  "\n enfermedad, se recomienda reposo absoluto. Una vez en recuperación, se pueden realizar caminatas suaves de " +
                                                  "\n 20 a 30 minutos al día para mejorar la circulación y evitar la pérdida de masa muscular. POSIBLE           " +
                                                  "\n TRATAMIENTO: No existe un tratamiento específico para el rotavirus, pero se recomienda reposo, hidratación " +
                                                  "\n y el uso de medicamentos como paracetamol para aliviar la fiebre y el malestar. En casos graves, puede ser " +
                                                  "\n necesaria la administración de líquidos intravenosos. ALIMENTACIÓN: Se recomienda el consumo de alimentos  " +
                                                  "\n suaves y ricos en electrolitos para facilitar la recuperación, tales como: Plátanos: ricos en potasio,     " +
                                                  "\n ayudan a reponer electrolitos perdidos. Arroz y pan tostado: fáciles de digerir y ayudan a estabilizar el  " +
                                                  "\n sistema digestivo. Yogur natural: fuente de probióticos que ayudan a restaurar la flora intestinal. Este   " +
                                                  "\n es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente      " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se           " +
                                                  "\n recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento        " +
                                                  "\n adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo      " +
                                                  "\n se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida)         " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACIÓN: En adultos mayores con listeriosis, la hidratación es clave para ayudar al cuerpo a eliminar    " +
                                                  "\n la bacteria y reducir la fiebre. Se recomienda un consumo diario de 2.5 a 3 litros de agua, además de caldos " +
                                                  "\n ligeros y jugos naturales sin azúcar para mejorar la absorción de nutrientes. EJERCICIO: La actividad física " +
                                                  "\n debe ser mínima durante la fase aguda de la enfermedad, pero una vez en recuperación, se recomienda caminar  " +
                                                  "\n 20 a 30 minutos al día para mejorar la circulación y fortalecer el sistema inmunológico. POSIBLE TRATAMIENTO:" +
                                                  "\n Para la listeriosis en adultos mayores, el tratamiento estándar es antibióticos como ampicilina o gentamicina," +
                                                  "\n administrados por vía oral o intravenosa dependiendo de la gravedad del caso. ALIMENTACIÓN: Se recomienda el  " +
                                                  "\n consumo de alimentos ricos en antioxidantes y propiedades antibacterianas para fortalecer el sistema inmune,  " +
                                                  "\n tales como: Ajo y cebolla: contienen compuestos con efectos antimicrobianos naturales. Frutas cítricas como   " +
                                                  "\n naranjas y kiwis: ricas en vitamina C, que ayuda a reducir la inflamación. Yogur natural: fuente de probióticos " +
                                                  "\n que ayudan a restaurar la flora intestinal afectada por los antibióticos. Este es solo un Diagnóstico           " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por   " +
                                                  "\n ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de     " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la    " +
                                                  "\n respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L        " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACIÓN: En adultos mayores con shigelosis, la hidratación es fundamental para prevenir la deshidratación  " +
                                                  "\n causada por diarrea severa. Se recomienda un consumo diario de 3 a 3.5 litros de líquidos, incluyendo agua,    " +
                                                  "\n sueros de rehidratación oral y caldos ligeros. Es importante evitar bebidas con cafeína y alcohol, ya que      " +
                                                  "\n pueden agravar la deshidratación. EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo      " +
                                                  "\n absoluto. Una vez en recuperación, se pueden realizar caminatas suaves de 20 a 30 minutos al día para mejorar  " +
                                                  "\n la circulación y evitar la fatiga. POSIBLE TRATAMIENTO: Para la shigelosis en adultos mayores, el tratamiento  " +
                                                  "\n suele incluir antibióticos como ciprofloxacino o azitromicina, administrados por vía oral para reducir la      " +
                                                  "\n duración de los síntomas. También se recomienda evitar el uso de medicamentos antidiarreicos, ya que pueden    " +
                                                  "\n empeorar la infección. ALIMENTACIÓN: Se recomienda el consumo de alimentos suaves y ricos en electrolitos para " +
                                                  "\n facilitar la recuperación, tales como: Plátanos: ricos en potasio, ayudan a reponer electrolitos perdidos.     " +
                                                  "\n Arroz y pan tostado: fáciles de digerir y ayudan a estabilizar el sistema digestivo. Yogur natural: fuente     " +
                                                  "\n de probióticos que ayudan a restaurar la flora intestinal. Este es solo un Diagnóstico predeterminado lógico,  " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor" +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le  " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app     " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n HIDRATACIÓN: En adultos mayores con EPOC, la hidratación es fundamental para mantener las vías respiratorias  " +
                                                  "\n húmedas y facilitar la expulsión de mucosidad. Se recomienda un consumo diario de 2.5 a 3 litros de agua,     " +
                                                  "\n distribuidos en pequeñas cantidades a lo largo del día para evitar la fatiga respiratoria. También se pueden  " +
                                                  "\n incluir infusiones sin cafeína y caldos tibios para mejorar la hidratación sin irritar las vías respiratorias." +
                                                  "\n EJERCICIO: La actividad física debe ser moderada y adaptada a la capacidad del paciente, recomendándose       " +
                                                  "\n ejercicios de bajo impacto como caminatas suaves de 30 a 45 minutos al día, además de ejercicios de respiración     " +
                                                  "\n profunda para mejorar la función pulmonar. POSIBLE TRATAMIENTO: Para el EPOC en adultos mayores, el tratamiento     " +
                                                  "\n suele incluir broncodilatadores de acción prolongada como el tiotropio (Spiriva) y el salmeterol, corticosteroides  " +
                                                  "\n inhalados como la fluticasona (Flixotide), y en algunos casos, oxigenoterapia para mejorar la respiración.          " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades antioxidantes y antiinflamatorias para mejorar  " +
                                                  "\n la función pulmonar, tales como: Pescados grasos como salmón y atún: ricos en Omega-3, que ayudan a reducir la      " +
                                                  "\n inflamación de las vías respiratorias. Frutas y verduras de colores vivos como arándanos y espinacas: ricas en      " +
                                                  "\n antioxidantes y vitamina C, que fortalecen el sistema inmune. Jengibre y cúrcuma: contienen compuestos con efectos  " +
                                                  "\n antiinflamatorios que pueden ser beneficiosos para las vías respiratorias. Este es solo un Diagnóstico predeterminado " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad   " +
                                                  "\n y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer    " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no   " +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app      " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACIÓN: En adultos mayores con clamidia, la hidratación es clave para ayudar al cuerpo a eliminar la bacteria  " +
                                                  "\n y reducir la inflamación del tracto urinario. Se recomienda un consumo diario de 2 a 2.5 litros de agua, además de  " +
                                                  "\n jugos naturales sin azúcar y caldos ligeros para mejorar la función renal y reducir molestias urinarias. EJERCICIO: " +
                                                  "\n La actividad física debe ser moderada y adaptada a la condición del paciente, recomendándose ejercicios de bajo     " +
                                                  "\n impacto como caminatas suaves de 30 a 40 minutos al día, evitando esfuerzos excesivos que puedan agravar los síntomas." +
                                                  "\n POSIBLE TRATAMIENTO: Para la clamidia en adultos mayores, el tratamiento recomendado es antibióticos como la          " +
                                                  "\n azitromicina en dosis única o la doxiciclina durante 7 días, asegurando la eliminación completa de la bacteria.       " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades antibacterianas y antiinflamatorias para mejorar  " +
                                                  "\n la recuperación, tales como: Ajo y cebolla: contienen compuestos con efectos antimicrobianos naturales. Yogur natural:   " +
                                                  "\n fuente de probióticos que ayudan a restaurar la flora intestinal afectada por los antibióticos. Frutas y verduras ricas  " +
                                                  "\n en vitamina C como fresas y pimientos: fortalecen el sistema inmune y aceleran la recuperación. Este es solo un          " +
                                                  "\n Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que    " +
                                                  "\n por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida  " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del       " +
                                                  "\n Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita     " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN: En adultos mayores con meningitis bacteriana, la hidratación es esencial para reducir la fiebre  " +
                                                  "\n y prevenir la deshidratación causada por sudoración excesiva. Se recomienda un consumo diario de 3 a 3.5      " +
                                                  "\n litros de agua, además de infusiones de manzanilla y caldos ligeros para aliviar molestias y fortalecer el    " +
                                                  "\n sistema inmunológico. EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo absoluto. Una      " +
                                                  "\n vez en recuperación, se pueden realizar caminatas suaves de 20 a 30 minutos al día para mejorar la circulación   " + 
                                                  "\n y evitar la fatiga. POSIBLE TRATAMIENTO: Para la meningitis bacteriana en adultos mayores, el tratamiento suele  " +
                                                  "\n incluir antibióticos intravenosos como ceftriaxona o vancomicina, además de corticosteroides para reducir la     " +
                                                  "\n inflamación cerebral. ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades antivirales y          " +
                                                  "\n antioxidantes para mejorar la recuperación, tales como: Frutas ricas en antioxidantes como arándanos y moras:    " +
                                                  "\n ayudan a reducir el estrés oxidativo. Jengibre y cúrcuma: poseen propiedades antiinflamatorias que pueden aliviar  " +
                                                  "\n los síntomas. Pescados grasos como salmón y sardinas: ricos en Omega-3, que contribuyen a la salud celular y la    " +
                                                  "\n cicatrización. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el   " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda " +
                                                  "\n hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente,    " +
                                                  "\n además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su   " +
                                                  "\n médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN: En adultos mayores con cáncer, la hidratación es fundamental para mantener la función renal, reducir los efectos   " +
                                                  "\n secundarios de los tratamientos y mejorar la recuperación. Se recomienda un consumo diario de 2.5 a 3.5 litros de agua, además  " +
                                                  "\n de caldos ligeros, jugos naturales sin azúcar y tés sin cafeína para mejorar la absorción de nutrientes y evitar la             " +
                                                  "\n deshidratación causada por efectos secundarios como vómitos o diarrea. EJERCICIO: La actividad física debe ser adaptada a la    " +
                                                  "\n condición del paciente y el tipo de cáncer, recomendándose ejercicios de bajo impacto como caminatas suaves de 30 a 45 minutos  " +
                                                  "\n al día, además de ejercicios de movilidad para mejorar la circulación y reducir la fatiga. POSIBLE TRATAMIENTO: Para el cáncer  " +
                                                  "\n en adultos mayores, el tratamiento depende del tipo y estadio de la enfermedad. Puede incluir quimioterapia, radioterapia,      " +
                                                  "\n inmunoterapia o cirugía, dependiendo de la evaluación médica. En algunos casos, se recomienda tratamiento paliativo para mejorar" +
                                                  "\n la calidad de vida. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y propiedades antiinflamatorias  " +
                                                  "\n para fortalecer el sistema inmune y mejorar la recuperación, tales como: Frutas cítricas como naranjas y kiwis: ricas en        " +
                                                  "\n vitamina C, que ayuda a reducir el estrés oxidativo. Pescados grasos como salmón y atún: ricos en Omega-3, que contribuyen      " +
                                                  "\n a la salud celular y la cicatrización. Verduras de hoja verde como espinacas y brócoli: contienen antioxidantes y vitamina E,   " +
                                                  "\n esenciales para la recuperación. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%     " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda     " +
                                                  "\n hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por    " +
                                                  "\n su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        
                        if(EstaturaMasculino.equals("1.65-1.80 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACIÓN: En adultos mayores, la gripe puede provocar una mayor pérdida de líquidos debido a fiebre, sudoración    " +
                                                  "\n y disminución del consumo de agua. Se recomienda un consumo diario de 2.5 a 3 litros de líquidos, incluyendo agua,    " +
                                                  "\n caldos y tés sin cafeína, para prevenir la deshidratación y ayudar a mantener la función inmunológica. La hidratación " +
                                                  "\n adecuada también contribuye a mantener las mucosas húmedas, lo que facilita la expulsión del virus y reduce la        " +
                                                  "\n irritación en la garganta. EJERCICIO: La actividad física debe ser moderada y adaptada a la condición del paciente,   " +
                                                  "\n recomendándose ejercicios de bajo impacto como caminatas suaves de 30 a 45 minutos al día, siempre evitando el        " +
                                                  "\n esfuerzo excesivo para no comprometer la recuperación. POSIBLE TRATAMIENTO: Para la gripe en adultos mayores, se      " +
                                                  "\n recomienda el uso de antivirales como el oseltamivir (Tamiflu) para reducir la duración y gravedad de los síntomas,   " +
                                                  "\n además de medicamentos para aliviar la fiebre y el malestar como el paracetamol (Tempra) o el ibuprofeno (Advil).     " +
                                                  "\n También es esencial la vacunación anual contra la influenza para prevenir complicaciones graves. ALIMENTACIÓN: Se     " +
                                                  "\n recomienda el consumo de frutas y verduras ricas en vitaminas y antioxidantes para fortalecer el sistema inmune,      " +
                                                  "\n tales como: Naranjas y kiwis: ricos en vitamina C, que ayuda a reducir la duración de los síntomas. Espinacas y       " +
                                                  "\n brócoli: contienen antioxidantes y vitamina E, esenciales para la recuperación. Jengibre y cúrcuma: poseen            " +
                                                  "\n propiedades antiinflamatorias que pueden aliviar la congestión y el malestar general. Este es solo un Diagnóstico     " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello    " +
                                                  "\n la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para" +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del     " +
                                                  "\n Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu     " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n HIDRATACIÓN: En adultos mayores con neumonía, la fiebre alta y sudoración excesiva pueden aumentar el riesgo    " +
                                                  "\n de deshidratación. Se recomienda un consumo diario de 2.5 a 3 litros de agua, además de caldos tibios y jugos   " +
                                                  "\n naturales sin azúcar para mejorar la absorción de nutrientes y mantener las secreciones pulmonares más fluidas. " +
                                                  "\n EJERCICIO: La actividad física debe ser mínima durante la fase aguda de la enfermedad, pero una vez en              " +
                                                  "\n recuperación, se recomienda caminar 20 a 30 minutos al día para mejorar la capacidad pulmonar y evitar la pérdida   " +
                                                  "\n de masa muscular. POSIBLE TRATAMIENTO: Para la neumonía en adultos mayores, el tratamiento suele incluir            " +
                                                  "\n antibióticos como la amoxicilina o la azitromicina, dependiendo del tipo de infección. También se pueden administrar" +
                                                  "\n medicamentos para reducir la fiebre y aliviar el malestar, como el paracetamol (Tempra) o el ibuprofeno (Advil).    " +
                                                  "\n En casos graves, puede ser necesario el uso de oxígeno suplementario. ALIMENTACIÓN: Se recomienda el consumo de     " +
                                                  "\n alimentos ricos en vitaminas y antioxidantes para fortalecer el sistema inmune, tales como: Naranjas y kiwis: ricos " +
                                                  "\n en vitamina C, que ayuda a reducir la duración de los síntomas. Espinacas y brócoli: contienen antioxidantes y      " +
                                                  "\n vitamina E, esenciales para la recuperación. Jengibre y cúrcuma: poseen propiedades antiinflamatorias que pueden    " +
                                                  "\n aliviar la congestión y el malestar general. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén       " +
                                                  "\n correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el     " +
                                                  "\n tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo   " +
                                                  "\n se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACIÓN: En adultos mayores con diabetes, la hidratación es clave para mantener niveles adecuados de glucosa  " +
                                                  "\n en sangre y prevenir complicaciones renales. Se recomienda un consumo diario de 2 a 2.5 litros de agua, evitando  " +
                                                  "\n bebidas azucaradas y con cafeína, ya que pueden afectar el control de la glucosa. EJERCICIO: La actividad física  " +
                                                  "\n debe ser moderada y adaptada a la condición del paciente, recomendándose ejercicios de bajo impacto como caminatas" +
                                                  "\n suaves de 30 a 45 minutos al día, lo que ayuda a mejorar la sensibilidad a la insulina y controlar el peso.       " +
                                                  "\n POSIBLE TRATAMIENTO: Para la diabetes en adultos mayores, el tratamiento suele incluir medicamentos como la       " +
                                                  "\n metformina para mejorar la sensibilidad a la insulina, además de insulina en algunos casos. También se recomienda    " +
                                                  "\n el monitoreo constante de la glucosa y ajustes en la dieta. ALIMENTACIÓN: Se recomienda el consumo de alimentos      " +
                                                  "\n con bajo índice glucémico y ricos en fibra para estabilizar los niveles de azúcar en sangre, tales como: Avena y     " +
                                                  "\n legumbres: ayudan a regular la glucosa y mejorar la digestión. Frutas como manzanas y peras: contienen fibra y       " +
                                                  "\n antioxidantes sin elevar bruscamente la glucosa. Verduras de hoja verde como espinacas y acelgas: ricas en magnesio, " +
                                                  "\n que ayuda a mejorar la sensibilidad a la insulina. Este es solo un Diagnóstico predeterminado lógico, haberlo        " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas   " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en   " +
                                                  "\n el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo " +
                                                  "\n se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN: En adultos mayores con asma, la hidratación es fundamental para mantener las vías respiratorias húmedas    " +
                                                  "\n y reducir la irritación. Se recomienda un consumo diario de 2 a 2.5 litros de agua, además de infusiones sin cafeína    " +
                                                  "\n que ayuden a despejar las vías respiratorias. También es importante evitar bebidas con cafeína y alcohol, ya que pueden " +
                                                  "\n aumentar la inflamación y la producción de moco. EJERCICIO: La actividad física debe ser controlada y adaptada a la     " +
                                                  "\n capacidad del paciente, recomendándose ejercicios de bajo impacto como caminatas suaves de 30 a 40 minutos al día,      " +
                                                  "\n evitando ambientes fríos o contaminados que puedan desencadenar síntomas. POSIBLE TRATAMIENTO: Para el asma en adultos  " +
                                                  "\n mayores, el tratamiento suele incluir broncodilatadores de alivio rápido como el salbutamol (Ventolin), corticosteroides" +
                                                  "\n inhalados como la fluticasona (Flixotide) y en algunos casos, modificadores de leucotrienos como el montelukast         " +
                                                  "\n (Singulair). ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades antiinflamatorias y antioxidantes para " +
                                                  "\n mejorar la función pulmonar, tales como: Pescados grasos como salmón y atún: ricos en Omega-3, que ayudan a reducir la  " +
                                                  "\n inflamación de las vías respiratorias. Frutas y verduras de colores vivos como arándanos y espinacas: ricas en          " +
                                                  "\n antioxidantes y vitamina C, que fortalecen el sistema inmune. Jengibre y cúrcuma: contienen compuestos con efectos      " +
                                                  "\n antiinflamatorios que pueden ser beneficiosos para las vías respiratorias. Este es solo un Diagnóstico predeterminado   " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y     " +
                                                  "\n sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor    " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN: En adultos mayores con VIH/SIDA, la hidratación es fundamental para mantener la función renal    " +
                                                  "\n y reducir los efectos secundarios de los medicamentos antirretrovirales. Se recomienda un consumo diario de   " +
                                                  "\n 2.5 a 3 litros de agua, además de infusiones sin cafeína y caldos ligeros para mejorar la absorción de        " +
                                                  "\n nutrientes y evitar la deshidratación causada por fiebre o diarrea. También es importante consumir líquidos   " +
                                                  "\n ricos en electrolitos para mantener el equilibrio mineral del cuerpo. EJERCICIO: La actividad física debe ser " +
                                                  "\n moderada y adaptada a la condición del paciente, recomendándose ejercicios de bajo impacto como caminatas     " +
                                                  "\n suaves de 30 a 45 minutos al día, lo que ayuda a fortalecer el sistema inmunológico y mejorar la salud        " +
                                                  "\n cardiovascular. POSIBLE TRATAMIENTO: Para el VIH/SIDA en adultos mayores, el tratamiento incluye terapia      " +
                                                  "\n antirretroviral (TAR) con combinaciones de medicamentos como tenofovir, emtricitabina y dolutegravir, que     " +
                                                  "\n ayudan a mantener el virus bajo control y mejorar la calidad de vida. Es crucial el monitoreo constante de    " +
                                                  "\n la carga viral y el estado inmunológico. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en              " +
                                                  "\n antioxidantes y proteínas para fortalecer el sistema inmune, tales como: Frutas cítricas como naranjas y kiwis:    " +
                                                  "\n ricas en vitamina C, que ayuda a reducir el estrés oxidativo. Pescados grasos como salmón y atún: ricos en Omega-3,  " +
                                                  "\n que contribuyen a la salud cardiovascular. Legumbres y frutos secos: fuentes de proteínas y zinc, esenciales para    " +
                                                  "\n la regeneración celular. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%  " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se     " +
                                                  "\n recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su   " +
                                                  "\n paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho        " +
                                                  "\n consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN: En adultos mayores con gonorrea, la hidratación es clave para ayudar a eliminar la bacteria y    " +
                                                  "\n reducir la inflamación del tracto urinario. Se recomienda un consumo diario de 2 a 2.5 litros de agua, además " +
                                                  "\n de jugos naturales sin azúcar y caldos ligeros para mejorar la función renal y reducir molestias urinarias.   " +
                                                  "\n También es importante evitar bebidas con cafeína y alcohol, ya que pueden irritar el tracto urinario.         " +
                                                  "\n EJERCICIO: La actividad física debe ser moderada y adaptada a la condición del paciente, recomendándose       " +
                                                  "\n ejercicios de bajo impacto como caminatas suaves de 30 a 40 minutos al día, evitando esfuerzos excesivos      " +
                                                  "\n que puedan agravar los síntomas. POSIBLE TRATAMIENTO: Para la gonorrea en adultos mayores, el tratamiento     " +
                                                  "\n recomendado es una dosis única de ceftriaxona 500 mg administrada por vía intramuscular, acompañada de        " +
                                                  "\n doxiciclina en caso de coinfección con clamidia. Es fundamental completar el tratamiento y evitar relaciones  " +
                                                  "\n sexuales hasta la recuperación total. ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades     " +
                                                  "\n antibacterianas y antiinflamatorias para mejorar la recuperación, tales como: Ajo y cebolla: contienen compuestos  " +
                                                  "\n con efectos antimicrobianos naturales. Yogur natural: fuente de probióticos que ayudan a restaurar la flora        " +
                                                  "\n intestinal afectada por los antibióticos. Frutas y verduras ricas en vitamina C como fresas y pimientos: fortalecen" +
                                                  "\n el sistema inmune y aceleran la recuperación. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén      " +
                                                  "\n correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el    " +
                                                  "\n tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo  " +
                                                  "\n se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACIÓN: En adultos mayores con herpes genital, la hidratación es esencial para reducir la inflamación y mejorar  " +
                                                  "\n la cicatrización de las lesiones. Se recomienda un consumo diario de 2 a 2.5 litros de agua, además de infusiones de  " +
                                                  "\n manzanilla y caldos ligeros para aliviar molestias y fortalecer el sistema inmunológico. También es importante evitar " +
                                                  "\n bebidas con cafeína y alcohol, ya que pueden irritar la piel y prolongar los brotes. EJERCICIO: La actividad física   " +
                                                  "\n debe ser moderada y adaptada a la condición del paciente, recomendándose ejercicios de bajo impacto como caminatas    " +
                                                  "\n suaves de 30 a 40 minutos al día, evitando el estrés excesivo que pueda desencadenar brotes. POSIBLE TRATAMIENTO:     " +
                                                  "\n Para el herpes genital en adultos mayores, el tratamiento suele incluir antivirales como aciclovir, valaciclovir      " +
                                                  "\n o famciclovir, que ayudan a reducir la duración y gravedad de los brotes. También se recomienda el uso de cremas      " +
                                                  "\n tópicas para aliviar el dolor y la inflamación. ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades   " +
                                                  "\n antivirales y antiinflamatorias para mejorar la recuperación, tales como: Frutas ricas en antioxidantes como arándanos" +
                                                  "\n y moras: ayudan a reducir el estrés oxidativo. Jengibre y cúrcuma: poseen propiedades antiinflamatorias que pueden    " +
                                                  "\n aliviar los síntomas. Pescados grasos como salmón y sardinas: ricos en Omega-3, que contribuyen a la salud celular    " +
                                                  "\n y la cicatrización. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que    " +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda" +
                                                  "\n hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente,     " +
                                                  "\n además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su    " +
                                                  "\n médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN: En adultos mayores con sífilis, la hidratación es clave para ayudar al cuerpo a eliminar toxinas  " +
                                                  "\n y mantener la función renal. Se recomienda un consumo diario de 2 a 2.5 litros de agua, además de infusiones   " +
                                                  "\n sin cafeína y caldos ligeros para mejorar la circulación y reducir la fatiga. También es importante consumir   " +
                                                  "\n líquidos ricos en electrolitos para mantener el equilibrio mineral del cuerpo. EJERCICIO: La actividad física  " +
                                                  "\n debe ser moderada y adaptada a la condición del paciente, recomendándose ejercicios de bajo impacto como       " +
                                                  "\n caminatas suaves de 30 a 40 minutos al día, lo que ayuda a mejorar la circulación y fortalecer el sistema        " +
                                                  "\n inmunológico. POSIBLE TRATAMIENTO: Para la sífilis en adultos mayores, el tratamiento estándar es penicilina     " +
                                                  "\n benzatina, administrada en una dosis única o en varias dosis dependiendo del estadio de la enfermedad. En casos  " +
                                                  "\n de alergia a la penicilina, se pueden usar alternativas como la doxiciclina o la ceftriaxona. ALIMENTACIÓN: Se   " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema     " +
                                                  "\n inmune, tales como: Frutas cítricas como naranjas y kiwis: ricas en vitamina C, que ayuda a reducir el estrés    " +
                                                  "\n oxidativo. Pescados grasos como salmón y atún: ricos en Omega-3, que contribuyen a la salud cardiovascular.      " +
                                                  "\n Legumbres y frutos secos: fuentes de proteínas y zinc, esenciales para la regeneración celular. Este es solo     " +
                                                  "\n un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad" +
                                                  "\n y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico" +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la   " +
                                                  "\n respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACIÓN: En adultos mayores con tuberculosis, la hidratación es fundamental para mantener la función     " +
                                                  "\n pulmonar y reducir la viscosidad de las secreciones. Se recomienda un consumo diario de 2.5 a 3 litros de    " +
                                                  "\n agua, además de caldos y jugos naturales sin azúcar para mejorar la absorción de nutrientes y evitar la      " +
                                                  "\n deshidratación causada por fiebre y sudoración. También es importante evitar bebidas con cafeína y alcohol,     " +
                                                  "\n ya que pueden irritar las vías respiratorias. EJERCICIO: La actividad física debe ser mínima durante la fase    " +
                                                  "\n aguda de la enfermedad, pero una vez en recuperación, se recomienda caminar 20 a 30 minutos al día para mejorar " +
                                                  "\n la capacidad pulmonar y evitar la pérdida de masa muscular. POSIBLE TRATAMIENTO: Para la tuberculosis en adultos" +
                                                  "\n mayores, el tratamiento estándar incluye una combinación de antibióticos como isoniazida, rifampicina, etambutol" +
                                                  "\n y pirazinamida, administrados durante un período de 6 meses. Es crucial completar el tratamiento para evitar    " +
                                                  "\n recaídas y resistencia bacteriana. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en vitaminas y     " +
                                                  "\n antioxidantes para fortalecer el sistema inmune, tales como: Frutas cítricas como naranjas y kiwis: ricas en    " +
                                                  "\n vitamina C, que ayuda a reducir la duración de los síntomas. Espinacas y brócoli: contienen antioxidantes y     " +
                                                  "\n vitamina E, esenciales para la recuperación. Jengibre y cúrcuma: poseen propiedades antiinflamatorias que pueden   " +
                                                  "\n aliviar la congestión y el malestar general. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén      " +
                                                  "\n correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el    " +
                                                  "\n tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo  " +
                                                  "\n se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACIÓN: En adultos mayores con artritis, la hidratación es clave para mantener la lubricación de las     " +
                                                  "\n articulaciones y reducir la inflamación. Se recomienda un consumo diario de 2 a 2.5 litros de agua, además    " +
                                                  "\n de infusiones de jengibre y cúrcuma para aliviar el dolor articular. También es importante consumir líquidos  " +
                                                  "\n ricos en electrolitos para mantener el equilibrio mineral del cuerpo. EJERCICIO: La actividad física debe ser    " +
                                                  "\n moderada y adaptada a la condición del paciente, recomendándose ejercicios de bajo impacto como caminatas suaves " +
                                                  "\n de 30 a 45 minutos al día, además de ejercicios de movilidad articular como yoga o tai chi. POSIBLE TRATAMIENTO: " +
                                                  "\n Para la artritis en adultos mayores, el tratamiento suele incluir antiinflamatorios no esteroides (AINEs) como   " +
                                                  "\n ibuprofeno o naproxeno, además de suplementos de glucosamina y condroitina para mejorar la salud articular. En   " +
                                                  "\n casos más severos, se pueden usar corticosteroides o terapia biológica. ALIMENTACIÓN: Se recomienda el consumo   " +
                                                  "\n de alimentos con propiedades antiinflamatorias y antioxidantes para mejorar la función articular, tales como:    " +
                                                  "\n Pescados grasos como salmón y atún: ricos en Omega-3, que ayudan a reducir la inflamación de las articulaciones. " +
                                                  "\n Frutas y verduras de colores vivos como arándanos y espinacas: ricas en antioxidantes y vitamina C, que fortalecen " +
                                                  "\n el sistema inmune. Jengibre y cúrcuma: contienen compuestos con efectos antiinflamatorios que pueden ser           " +
                                                  "\n beneficiosos para las articulaciones. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no     " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén         " +
                                                  "\n correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el    " +
                                                  "\n tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo  " +
                                                  "\n se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACIÓN: En adultos mayores con tosferina, la hidratación es fundamental para aliviar la irritación de     " +
                                                  "\n las vías respiratorias y reducir la viscosidad de las secreciones. Se recomienda un consumo diario de 2.5 a    " +
                                                  "\n 3 litros de agua, distribuidos en pequeñas cantidades a lo largo del día para evitar la fatiga respiratoria.   " +
                                                  "\n Además, se pueden incluir caldos tibios y tés sin cafeína para ayudar a calmar la garganta y reducir la        " +
                                                  "\n inflamación. EJERCICIO: La actividad física debe ser mínima durante la fase aguda de la enfermedad, pero una   " +
                                                  "\n vez en recuperación, se recomienda caminar 20 a 30 minutos al día para mejorar la capacidad pulmonar y evitar  " +
                                                  "\n la pérdida de masa muscular. POSIBLE TRATAMIENTO: Para la tosferina en adultos mayores, el tratamiento suele   " +
                                                  "\n incluir antibióticos como azitromicina, claritromicina o eritromicina, administrados en los primeros días de   " +
                                                  "\n la enfermedad para reducir la severidad de los síntomas. También se recomienda el uso de broncodilatadores en  " +
                                                  "\n casos de dificultad respiratoria severa. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes" +
                                                  "\n y propiedades antiinflamatorias para fortalecer el sistema inmune, tales como: Frutas cítricas como naranjas      " +
                                                  "\n y kiwis: ricas en vitamina C, que ayuda a reducir la inflamación de las vías respiratorias. Jengibre y cúrcuma:   " +
                                                  "\n poseen propiedades antiinflamatorias que pueden aliviar la congestión y el malestar general. Miel y propóleo:     " +
                                                  "\n ayudan a calmar la garganta y reducir la irritación. Este es solo un Diagnóstico predeterminado lógico, haberlo   " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas" +
                                                  "\n estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad   " +
                                                  "\n en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del" +
                                                  "\n todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACIÓN: En adultos mayores con paperas, la hidratación es clave para reducir la fiebre y aliviar la inflamación " +
                                                  "\n de las glándulas salivales. Se recomienda un consumo diario de 2 a 2.5 litros de agua, además de caldos ligeros y    " +
                                                  "\n jugos naturales sin azúcar para mejorar la absorción de nutrientes y evitar la deshidratación causada por fiebre.    " +
                                                  "\n EJERCICIO: La actividad física debe ser mínima durante la fase aguda de la enfermedad, pero una vez en recuperación, " +
                                                  "\n se recomienda caminar 20 a 30 minutos al día para mejorar la circulación y evitar la pérdida de masa muscular.       " +
                                                  "\n POSIBLE TRATAMIENTO: Para las paperas en adultos mayores, el tratamiento suele incluir analgésicos como paracetamol  " +
                                                  "\n o ibuprofeno para reducir el dolor y la fiebre. También se recomienda el uso de compresas frías en la zona inflamada " +
                                                  "\n para aliviar la hinchazón. ALIMENTACIÓN: Se recomienda el consumo de alimentos suaves y ricos en vitaminas para      " +
                                                  "\n facilitar la recuperación, tales como: Yogur natural: fuente de probióticos que ayudan a restaurar la flora intestinal " +
                                                  "\n afectada por la fiebre. Frutas ricas en vitamina C como fresas y pimientos: fortalecen el sistema inmune y aceleran la " +
                                                  "\n recuperación. Sopas y purés: fáciles de consumir y ayudan a mantener la hidratación. Este es solo un Diagnóstico       " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello     " +
                                                  "\n la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para    " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del     " +
                                                  "\n Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu     " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACIÓN: En adultos mayores con Zika, la hidratación es esencial para reducir la fiebre y prevenir la deshidratación  " +
                                                  "\n causada por sudoración excesiva. Se recomienda un consumo diario de 2.5 a 3 litros de agua, además de infusiones de       " +
                                                  "\n manzanilla y caldos ligeros para aliviar molestias y fortalecer el sistema inmunológico. También es importante evitar     " +
                                                  "\n bebidas con cafeína y alcohol, ya que pueden irritar el sistema digestivo y empeorar los síntomas. EJERCICIO: La actividad" +
                                                  "\n física debe ser mínima durante la fase aguda de la enfermedad, pero una vez en recuperación, se recomienda caminar 20 a 30" +
                                                  "\n minutos al día para mejorar la circulación y evitar la fatiga. POSIBLE TRATAMIENTO: Para el Zika en adultos mayores, no   " +
                                                  "\n existe un tratamiento específico, pero se recomienda reposo, hidratación y el uso de analgésicos como paracetamol para    " +
                                                  "\n aliviar los síntomas. Se debe evitar el uso de aspirina y otros AINEs hasta descartar dengue para reducir el riesgo de    " +
                                                  "\n sangrado. ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades antivirales y antioxidantes para mejorar    " +
                                                  "\n la recuperación, tales como: Frutas ricas en antioxidantes como arándanos y moras: ayudan a reducir el estrés oxidativo.  " +
                                                  "\n Jengibre y cúrcuma: poseen propiedades antiinflamatorias que pueden aliviar los síntomas. Pescados grasos como salmón y   " +
                                                  "\n sardinas: ricos en Omega-3, que contribuyen a la salud celular y la cicatrización. Este es solo un Diagnóstico            " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la     " +
                                                  "\n enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para          " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida)" +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACIÓN: En adultos mayores con rotavirus, la hidratación es esencial para prevenir la deshidratación   " +
                                                  "\n severa causada por diarrea y vómitos. Se recomienda un consumo diario de 3 a 3.5 litros de líquidos,        " +
                                                  "\n incluyendo agua, sueros de rehidratación oral y caldos ligeros. Es importante beber en pequeñas cantidades  " +
                                                  "\n y de manera frecuente para evitar la fatiga gastrointestinal. EJERCICIO: Durante la fase aguda de la        " +
                                                  "\n enfermedad, se recomienda reposo absoluto. Una vez en recuperación, se pueden realizar caminatas suaves de  " +
                                                  "\n 20 a 30 minutos al día para mejorar la circulación y evitar la pérdida de masa muscular. POSIBLE TRATAMIENTO:" +
                                                  "\n No existe un tratamiento específico para el rotavirus, pero se recomienda reposo, hidratación y el uso de    " +
                                                  "\n medicamentos como paracetamol para aliviar la fiebre y el malestar. En casos graves, puede ser necesaria la " +
                                                  "\n administración de líquidos intravenosos. ALIMENTACIÓN: Se recomienda el consumo de alimentos suaves y ricos " +
                                                  "\n en electrolitos para facilitar la recuperación, tales como: Plátanos: ricos en potasio, ayudan a reponer    " +
                                                  "\n electrolitos perdidos. Arroz y pan tostado: fáciles de digerir y ayudan a estabilizar el sistema digestivo. " +
                                                  "\n Yogur natural: fuente de probióticos que ayudan a restaurar la flora intestinal. Este es solo un Diagnóstico  " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por " +
                                                  "\n ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de   " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la  " +
                                                  "\n respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACIÓN: En adultos mayores con listeriosis, la hidratación es clave para ayudar al cuerpo a eliminar la  " +
                                                  "\n bacteria y reducir la fiebre. Se recomienda un consumo diario de 2.5 a 3 litros de agua, además de caldos     " +
                                                  "\n ligeros y jugos naturales sin azúcar para mejorar la absorción de nutrientes. EJERCICIO: La actividad física  " +
                                                  "\n debe ser mínima durante la fase aguda de la enfermedad, pero una vez en recuperación, se recomienda caminar   " +
                                                  "\n 20 a 30 minutos al día para mejorar la circulación y fortalecer el sistema inmunológico. POSIBLE TRATAMIENTO: " +
                                                  "\n Para la listeriosis en adultos mayores, el tratamiento estándar es antibióticos como ampicilina o gentamicina," +
                                                  "\n administrados por vía oral o intravenosa dependiendo de la gravedad del caso. ALIMENTACIÓN: Se recomienda el  " +
                                                  "\n consumo de alimentos ricos en antioxidantes y propiedades antibacterianas para fortalecer el sistema inmune,  " +
                                                  "\n tales como: Ajo y cebolla: contienen compuestos con efectos antimicrobianos naturales. Frutas cítricas como   " +
                                                  "\n naranjas y kiwis: ricas en vitamina C, que ayuda a reducir la inflamación. Yogur natural: fuente de probióticos" +
                                                  "\n que ayudan a restaurar la flora intestinal afectada por los antibióticos. Este es solo un Diagnóstico         " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por " +
                                                  "\n ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de   " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la  " +
                                                  "\n respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes" +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACIÓN: En adultos mayores con shigelosis, la hidratación es fundamental para prevenir la deshidratación  " +
                                                  "\n causada por diarrea severa. Se recomienda un consumo diario de 3 a 3.5 litros de líquidos, incluyendo agua,    " +
                                                  "\n sueros de rehidratación oral y caldos ligeros. Es importante evitar bebidas con cafeína y alcohol, ya que      " +
                                                  "\n pueden agravar la deshidratación. EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo      " +
                                                  "\n absoluto. Una vez en recuperación, se pueden realizar caminatas suaves de 20 a 30 minutos al día para mejorar  " +
                                                  "\n la circulación y evitar la fatiga. POSIBLE TRATAMIENTO: Para la shigelosis en adultos mayores, el tratamiento  " +
                                                  "\n suele incluir antibióticos como ciprofloxacino o azitromicina, administrados por vía oral para reducir la duración " +
                                                  "\n de los síntomas. También se recomienda evitar el uso de medicamentos antidiarreicos, ya que pueden empeorar la     " + 
                                                  "\n infección. ALIMENTACIÓN: Se recomienda el consumo de alimentos suaves y ricos en electrolitos para facilitar la    " +
                                                  "\n recuperación, tales como: Plátanos: ricos en potasio, ayudan a reponer electrolitos perdidos. Arroz y pan tostado: " +
                                                  "\n fáciles de digerir y ayudan a estabilizar el sistema digestivo. Yogur natural: fuente de probióticos que ayudan a  " +
                                                  "\n restaurar la flora intestinal. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza  " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para   " +
                                                  "\n ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento   " +
                                                  "\n adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le   " +
                                                  "\n recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n HIDRATACIÓN: En adultos mayores con EPOC, la hidratación es fundamental para mantener las vías respiratorias húmedas   " +
                                                  "\n y facilitar la expulsión de mucosidad. Se recomienda un consumo diario de 2.5 a 3 litros de agua, distribuidos en      " +
                                                  "\n pequeñas cantidades a lo largo del día para evitar la fatiga respiratoria. También se pueden incluir infusiones sin    " +
                                                  "\n cafeína y caldos tibios para mejorar la hidratación sin irritar las vías respiratorias. EJERCICIO: La actividad física    " +
                                                  "\n debe ser moderada y adaptada a la capacidad del paciente, recomendándose ejercicios de bajo impacto como caminatas suaves " +
                                                  "\n de 30 a 45 minutos al día, además de ejercicios de respiración profunda para mejorar la función pulmonar. POSIBLE         " +
                                                  "\n TRATAMIENTO: Para el EPOC en adultos mayores, el tratamiento suele incluir broncodilatadores de acción prolongada como    " +
                                                  "\n el tiotropio (Spiriva) y el salmeterol, corticosteroides inhalados como la fluticasona (Flixotide), y en algunos casos,   " +
                                                  "\n oxigenoterapia para mejorar la respiración. ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades           " +
                                                  "\n antioxidantes y antiinflamatorias para mejorar la función pulmonar, tales como: Pescados grasos como salmón y atún: ricos " +
                                                  "\n en Omega-3, que ayudan a reducir la inflamación de las vías respiratorias. Frutas y verduras de colores vivos como         " +
                                                  "\n arándanos y espinacas: ricas en antioxidantes y vitamina C, que fortalecen el sistema inmune. Jengibre y cúrcuma: contienen" +
                                                  "\n compuestos con efectos antiinflamatorios que pueden ser beneficiosos para las vías respiratorias. Este es solo un         " +
                                                  "\n Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por " +
                                                  "\n ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para  " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida)" +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACIÓN: En adultos mayores con clamidia, la hidratación es clave para ayudar al cuerpo a eliminar la bacteria y    " +
                                                  "\n reducir la inflamación del tracto urinario. Se recomienda un consumo diario de 2 a 2.5 litros de agua, además de jugos  " +
                                                  "\n naturales sin azúcar y caldos ligeros para mejorar la función renal y reducir molestias urinarias. También es importante " +
                                                  "\n evitar bebidas con cafeína y alcohol, ya que pueden irritar el tracto urinario. EJERCICIO: La actividad física debe ser  " +
                                                  "\n moderada y adaptada a la condición del paciente, recomendándose ejercicios de bajo impacto como caminatas suaves de 30   " +
                                                  "\n a 40 minutos al día, evitando esfuerzos excesivos que puedan agravar los síntomas. POSIBLE TRATAMIENTO: Para la clamidia " +
                                                  "\n en adultos mayores, el tratamiento recomendado es antibióticos como la azitromicina en dosis única o la doxiciclina durante " +
                                                  "\n 7 días, asegurando la eliminación completa de la bacteria. ALIMENTACIÓN: Se recomienda el consumo de alimentos con          " +
                                                  "\n propiedades antibacterianas y antiinflamatorias para mejorar la recuperación, tales como: Ajo y cebolla: contienen compuestos" +
                                                  "\n con efectos antimicrobianos naturales. Yogur natural: fuente de probióticos que ayudan a restaurar la flora intestinal      " +
                                                  "\n afectada por los antibióticos. Frutas y verduras ricas en vitamina C como fresas y pimientos: fortalecen el sistema inmune  " +
                                                  "\n y aceleran la recuperación. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que  " +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer " +
                                                  "\n más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su     " +
                                                  "\n salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN: En adultos mayores con meningitis bacteriana, la hidratación es esencial para reducir la fiebre    " +
                                                  "\n y prevenir la deshidratación causada por sudoración excesiva. Se recomienda un consumo diario de 3 a 3.5 litros " +
                                                  "\n de agua, además de infusiones de manzanilla y caldos ligeros para aliviar molestias y fortalecer el sistema     " +
                                                  "\n inmunológico. También es importante consumir líquidos ricos en electrolitos para mantener el equilibrio mineral " +
                                                  "\n del cuerpo. EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo absoluto. Una vez en        " +
                                                  "\n recuperación, se pueden realizar caminatas suaves de 20 a 30 minutos al día para mejorar la circulación y evitar" +
                                                  "\n la fatiga. POSIBLE TRATAMIENTO: Para la meningitis bacteriana en adultos mayores, el tratamiento suele incluir  " +
                                                  "\n antibióticos intravenosos como ceftriaxona o vancomicina, además de corticosteroides para reducir la inflamación" +
                                                  "\n cerebral. ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades antivirales y antioxidantes para  " +
                                                  "\n mejorar la recuperación, tales como: Frutas ricas en antioxidantes como arándanos y moras: ayudan a reducir el  " +
                                                  "\n estrés oxidativo. Jengibre y cúrcuma: poseen propiedades antiinflamatorias que pueden aliviar los síntomas.     " +
                                                  "\n Pescados grasos como salmón y sardinas: ricos en Omega-3, que contribuyen a la salud celular y la cicatrización." +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga" +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más " +
                                                  "\n de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además  " +
                                                  "\n por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su     " +
                                                  "\n médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN: En adultos mayores con cáncer, la hidratación es fundamental para mantener la función renal, reducir los efectos  " +
                                                  "\n secundarios de los tratamientos y mejorar la recuperación. Se recomienda un consumo diario de 2.5 a 3.5 litros de agua, además " +
                                                  "\n de caldos ligeros, jugos naturales sin azúcar y tés sin cafeína para mejorar la absorción de nutrientes y evitar la            " +
                                                  "\n deshidratación causada por efectos secundarios como vómitos o diarrea. EJERCICIO: La actividad física debe ser adaptada a la   " +
                                                  "\n condición del paciente y el tipo de cáncer, recomendándose ejercicios de bajo impacto como caminatas suaves de 30 a 45 minutos " +
                                                  "\n al día, además de ejercicios de movilidad para mejorar la circulación y reducir la fatiga. POSIBLE TRATAMIENTO: Para el cáncer " +
                                                  "\n en adultos mayores, el tratamiento depende del tipo y estadio de la enfermedad. Puede incluir quimioterapia, radioterapia,   " +
                                                  "\n inmunoterapia o cirugía, dependiendo de la evaluación médica. En algunos casos, se recomienda tratamiento paliativo para     " +
                                                  "\n mejorar la calidad de vida. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y propiedades         " +
                                                  "\n antiinflamatorias para fortalecer el sistema inmune y mejorar la recuperación, tales como: Frutas cítricas como naranjas     " +
                                                  "\n y kiwis: ricas en vitamina C, que ayuda a reducir el estrés oxidativo. Pescados grasos como salmón y atún: ricos en Omega-3, " +
                                                  "\n que contribuyen a la salud celular y la cicatrización. Verduras de hoja verde como espinacas y brócoli: contienen            " +
                                                  "\n antioxidantes y vitamina E, esenciales para la recuperación. Este es solo un Diagnóstico predeterminado lógico, haberlo      " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén     " +
                                                  "\n correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento  " +
                                                  "\n adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho " +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        if(EstaturaMasculino.equals("1.55-1.70 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACIÓN: En adultos mayores, la gripe puede provocar una mayor pérdida de líquidos debido a fiebre, sudoración     " +
                                                  "\n y disminución del consumo de agua. Se recomienda un consumo diario de 2.5 a 3 litros de líquidos, incluyendo agua,     " +
                                                  "\n caldos y tés sin cafeína, para prevenir la deshidratación y ayudar a mantener la función inmunológica. La hidratación     " +
                                                  "\n adecuada también contribuye a mantener las mucosas húmedas, lo que facilita la expulsión del virus y reduce la irritación " +
                                                  "\n en la garganta. EJERCICIO: La actividad física debe ser moderada y adaptada a la condición del paciente, recomendándose   " +
                                                  "\n ejercicios de bajo impacto como caminatas suaves de 30 a 45 minutos al día, siempre evitando el esfuerzo excesivo para no " +
                                                  "\n comprometer la recuperación. POSIBLE TRATAMIENTO: Para la gripe en adultos mayores, se recomienda el uso de antivirales   " +
                                                  "\n como el oseltamivir (Tamiflu) para reducir la duración y gravedad de los síntomas, además de medicamentos para aliviar la " +
                                                  "\n fiebre y el malestar como el paracetamol (Tempra) o el ibuprofeno (Advil). También es esencial la vacunación anual contra " +
                                                  "\n la influenza para prevenir complicaciones graves. ALIMENTACIÓN: Se recomienda el consumo de frutas y verduras ricas en    " +
                                                  "\n vitaminas y antioxidantes para fortalecer el sistema inmune, tales como: Naranjas y kiwis: ricos en vitamina C, que ayuda " +
                                                  "\n a reducir la duración de los síntomas. Espinacas y brócoli: contienen antioxidantes y vitamina E, esenciales para la      " +
                                                  "\n recuperación. Jengibre y cúrcuma: poseen propiedades antiinflamatorias que pueden aliviar la congestión y el malestar     " +
                                                  "\n general. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un     " +
                                                  "\n Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si  " +
                                                  "\n la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico. Angel L Montes agradece" +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n HIDRATACIÓN: En adultos mayores con neumonía, la fiebre alta y sudoración excesiva pueden aumentar el riesgo       " +
                                                  "\n de deshidratación. Se recomienda un consumo diario de 2.5 a 3 litros de agua, además de caldos tibios y jugos      " +
                                                  "\n naturales sin azúcar para mejorar la absorción de nutrientes y mantener las secreciones pulmonares más fluidas.       " +
                                                  "\n EJERCICIO: La actividad física debe ser mínima durante la fase aguda de la enfermedad, pero una vez en recuperación,  " +
                                                  "\n se recomienda caminar 20 a 30 minutos al día para mejorar la capacidad pulmonar y evitar la pérdida de masa muscular. " +
                                                  "\n POSIBLE TRATAMIENTO: Para la neumonía en adultos mayores, el tratamiento suele incluir antibióticos como la           " +
                                                  "\n amoxicilina o la azitromicina, dependiendo del tipo de infección. También se pueden administrar medicamentos para     " +
                                                  "\n reducir la fiebre y aliviar el malestar, como el paracetamol (Tempra) o el ibuprofeno (Advil). En casos graves,       " +
                                                  "\n puede ser necesario el uso de oxígeno suplementario. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en     " +
                                                  "\n vitaminas y antioxidantes para fortalecer el sistema inmune, tales como: Naranjas y kiwis: ricos en vitamina C, que   " +
                                                  "\n ayuda a reducir la duración de los síntomas. Espinacas y brócoli: contienen antioxidantes y vitamina E, esenciales    " +
                                                  "\n para la recuperación. Jengibre y cúrcuma: poseen propiedades antiinflamatorias que pueden aliviar la congestión y el  " +
                                                  "\n malestar general. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el   " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda  " +
                                                  "\n hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente,     " +
                                                  "\n además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su    " +
                                                  "\n médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACIÓN: En adultos mayores con diabetes, la hidratación es clave para mantener niveles adecuados de    " +
                                                  "\n glucosa en sangre y prevenir complicaciones renales. Se recomienda un consumo diario de 2 a 2.5 litros de   " +
                                                  "\n agua, evitando bebidas azucaradas y con cafeína, ya que pueden afectar el control de la glucosa. EJERCICIO: " +
                                                  "\n La actividad física debe ser moderada y adaptada a la condición del paciente, recomendándose ejercicios de  " +
                                                  "\n bajo impacto como caminatas suaves de 30 a 45 minutos al día, lo que ayuda a mejorar la sensibilidad a la      " +
                                                  "\n insulina y controlar el peso. POSIBLE TRATAMIENTO: Para la diabetes en adultos mayores, el tratamiento suele   " +
                                                  "\n incluir medicamentos como la metformina para mejorar la sensibilidad a la insulina, además de insulina en      " +
                                                  "\n algunos casos. También se recomienda el monitoreo constante de la glucosa y ajustes en la dieta. ALIMENTACIÓN: " +
                                                  "\n Se recomienda el consumo de alimentos con bajo índice glucémico y ricos en fibra para estabilizar los niveles  " +
                                                  "\n de azúcar en sangre, tales como: Avena y legumbres: ayudan a regular la glucosa y mejorar la digestión. Frutas    " +
                                                  "\n como manzanas y peras: contienen fibra y antioxidantes sin elevar bruscamente la glucosa. Verduras de hoja verde  " +
                                                  "\n como espinacas y acelgas: ricas en magnesio, que ayuda a mejorar la sensibilidad a la insulina. Este es solo un   " +
                                                  "\n Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad   " +
                                                  "\n y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico" +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la   " +
                                                  "\n respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico. Angel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN: En adultos mayores con asma, la hidratación es fundamental para mantener las vías respiratorias húmedas   " +
                                                  "\n y reducir la irritación. Se recomienda un consumo diario de 2 a 2.5 litros de agua, además de infusiones sin cafeína   " +
                                                  "\n que ayuden a despejar las vías respiratorias. También es importante evitar bebidas con cafeína y alcohol, ya que       " +
                                                  "\n pueden aumentar la inflamación y la producción de moco. EJERCICIO: La actividad física debe ser controlada y adaptada  " +
                                                  "\n a la capacidad del paciente, recomendándose ejercicios de bajo impacto como caminatas suaves de 30 a 40 minutos al día,  " +
                                                  "\n evitando ambientes fríos o contaminados que puedan desencadenar síntomas. POSIBLE TRATAMIENTO: Para el asma en adultos   " +
                                                  "\n mayores, el tratamiento suele incluir broncodilatadores de alivio rápido como el salbutamol (Ventolin), corticosteroides " +
                                                  "\n inhalados como la fluticasona (Flixotide) y en algunos casos, modificadores de leucotrienos como el montelukast (Singulair)." +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades antiinflamatorias y antioxidantes para mejorar la       " +
                                                  "\n función pulmonar, tales como: Pescados grasos como salmón y atún: ricos en Omega-3, que ayudan a reducir la inflamación     " +
                                                  "\n de las vías respiratorias. Frutas y verduras de colores vivos como arándanos y espinacas: ricas en antioxidantes y          " +
                                                  "\n vitamina C, que fortalecen el sistema inmune. Jengibre y cúrcuma: contienen compuestos con efectos antiinflamatorios        " +
                                                  "\n que pueden ser beneficiosos para las vías respiratorias. Este es solo un Diagnóstico predeterminado lógico, haberlo         " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas          " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el       " +
                                                  "\n tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le     " +
                                                  "\n recomienda mucho consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN: En adultos mayores con VIH/SIDA, la hidratación es fundamental para mantener la función renal y   " +
                                                  "\n reducir los efectos secundarios de los medicamentos antirretrovirales. Se recomienda un consumo diario de 2.5  " +
                                                  "\n a 3 litros de agua, además de infusiones sin cafeína y caldos ligeros para mejorar la absorción de nutrientes  " +
                                                  "\n y evitar la deshidratación causada por fiebre o diarrea. También es importante consumir líquidos ricos en      " +
                                                  "\n electrolitos para mantener el equilibrio mineral del cuerpo. EJERCICIO: La actividad física debe ser moderada  " +
                                                  "\n y adaptada a la condición del paciente, recomendándose ejercicios de bajo impacto como caminatas suaves de 30  " +
                                                  "\n a 45 minutos al día, lo que ayuda a fortalecer el sistema inmunológico y mejorar la salud cardiovascular.      " +
                                                  "\n POSIBLE TRATAMIENTO: Para el VIH/SIDA en adultos mayores, el tratamiento incluye terapia antirretroviral (TAR) " +
                                                  "\n con combinaciones de medicamentos como tenofovir, emtricitabina y dolutegravir, que ayudan a mantener el virus " +
                                                  "\n bajo control y mejorar la calidad de vida. Es crucial el monitoreo constante de la carga viral y el estado     " +
                                                  "\n inmunológico. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y proteínas para        " +
                                                  "\n fortalecer el sistema inmune, tales como: Frutas cítricas como naranjas y kiwis: ricas en vitamina C, que ayuda  " +
                                                  "\n a reducir el estrés oxidativo. Pescados grasos como salmón y atún: ricos en Omega-3, que contribuyen a la salud  " +
                                                  "\n cardiovascular. Legumbres y frutos secos: fuentes de proteínas y zinc, esenciales para la regeneración celular.  " +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más  " +
                                                  "\n de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además   " +
                                                  "\n por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico." +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN: En adultos mayores con gonorrea, la hidratación es clave para ayudar a eliminar la bacteria   " +
                                                  "\n y reducir la inflamación del tracto urinario. Se recomienda un consumo diario de 2 a 2.5 litros de agua,   " +
                                                  "\n además de jugos naturales sin azúcar y caldos ligeros para mejorar la función renal y reducir molestias    " +
                                                  "\n urinarias. También es importante evitar bebidas con cafeína y alcohol, ya que pueden irritar el tracto     " +
                                                  "\n urinario. EJERCICIO: La actividad física debe ser moderada y adaptada a la condición del paciente,         " +
                                                  "\n recomendándose ejercicios de bajo impacto como caminatas suaves de 30 a 40 minutos al día, evitando        " +
                                                  "\n esfuerzos excesivos que puedan agravar los síntomas. POSIBLE TRATAMIENTO: Para la gonorrea en adultos      " +
                                                  "\n mayores, el tratamiento recomendado es una dosis única de ceftriaxona 500 mg administrada por vía intramuscular," +
                                                  "\n acompañada de doxiciclina en caso de coinfección con clamidia. Es fundamental completar el tratamiento y evitar " +
                                                  "\n relaciones sexuales hasta la recuperación total. ALIMENTACIÓN: Se recomienda el consumo de alimentos con    " +
                                                  "\n propiedades antibacterianas y antiinflamatorias para mejorar la recuperación, tales como: Ajo y cebolla:    " +
                                                  "\n contienen compuestos con efectos antimicrobianos naturales. Yogur natural: fuente de probióticos que ayudan " +
                                                  "\n a restaurar la flora intestinal afectada por los antibióticos. Frutas y verduras ricas en vitamina C como   " +
                                                  "\n fresas y pimientos: fortalecen el sistema inmune y aceleran la recuperación. Este es solo un Diagnóstico    " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que   " +
                                                  "\n por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico" +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si" +
                                                  "\n la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACIÓN: En adultos mayores con herpes genital, la hidratación es esencial para reducir la inflamación      " +
                                                  "\n y mejorar la cicatrización de las lesiones. Se recomienda un consumo diario de 2 a 2.5 litros de agua, además   " +
                                                  "\n de infusiones de manzanilla y caldos ligeros para aliviar molestias y fortalecer el sistema inmunológico.          " +
                                                  "\n También es importante evitar bebidas con cafeína y alcohol, ya que pueden irritar la piel y prolongar los brotes.  " +
                                                  "\n EJERCICIO: La actividad física debe ser moderada y adaptada a la condición del paciente, recomendándose ejercicios " +
                                                  "\n de bajo impacto como caminatas suaves de 30 a 40 minutos al día, evitando el estrés excesivo que pueda desencadenar  " +
                                                  "\n brotes. POSIBLE TRATAMIENTO: Para el herpes genital en adultos mayores, el tratamiento suele incluir antivirales     " +
                                                  "\n como aciclovir, valaciclovir o famciclovir, que ayudan a reducir la duración y gravedad de los brotes. También se    " +
                                                  "\n recomienda el uso de cremas tópicas para aliviar el dolor y la inflamación. ALIMENTACIÓN: Se recomienda el consumo   " +
                                                  "\n de alimentos con propiedades antivirales y antiinflamatorias para mejorar la recuperación, tales como: Frutas ricas  " +
                                                  "\n en antioxidantes como arándanos y moras: ayudan a reducir el estrés oxidativo. Jengibre y cúrcuma: poseen propiedades" +
                                                  "\n antiinflamatorias que pueden aliviar los síntomas. Pescados grasos como salmón y sardinas: ricos en Omega-3, que     " +
                                                  "\n contribuyen a la salud celular y la cicatrización. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, " +
                                                  "\n para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado" +
                                                  "\n de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho " +
                                                  "\n consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN: En adultos mayores con sífilis, la hidratación es clave para ayudar al cuerpo a eliminar toxinas  " +
                                                  "\n y mantener la función renal. Se recomienda un consumo diario de 2 a 2.5 litros de agua, además de infusiones   " +
                                                  "\n sin cafeína y caldos ligeros para mejorar la circulación y reducir la fatiga. También es importante consumir   " +
                                                  "\n líquidos ricos en electrolitos para mantener el equilibrio mineral del cuerpo. EJERCICIO: La actividad física  " +
                                                  "\n debe ser moderada y adaptada a la condición del paciente, recomendándose ejercicios de bajo impacto como       " +
                                                  "\n caminatas suaves de 30 a 40 minutos al día, lo que ayuda a mejorar la circulación y fortalecer el sistema      " +
                                                  "\n inmunológico. POSIBLE TRATAMIENTO: Para la sífilis en adultos mayores, el tratamiento estándar es penicilina   " +
                                                  "\n benzatina, administrada en una dosis única o en varias dosis dependiendo del estadio de la enfermedad. En casos" +
                                                  "\n de alergia a la penicilina, se pueden usar alternativas como la doxiciclina o la ceftriaxona. ALIMENTACIÓN: Se " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema   " +
                                                  "\n inmune, tales como: Frutas cítricas como naranjas y kiwis: ricas en vitamina C, que ayuda a reducir el estrés  " +
                                                  "\n oxidativo. Pescados grasos como salmón y atún: ricos en Omega-3, que contribuyen a la salud cardiovascular.    " +
                                                  "\n Legumbres y frutos secos: fuentes de proteínas y zinc, esenciales para la regeneración celular. Este es solo   " +
                                                  "\n un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa        " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de " +
                                                  "\n un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por" +
                                                  "\n su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico," +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACIÓN: En adultos mayores con tuberculosis, la hidratación es fundamental para mantener la función pulmonar " +
                                                  "\n y reducir la viscosidad de las secreciones. Se recomienda un consumo diario de 2.5 a 3 litros de agua, además de  " +
                                                  "\n caldos y jugos naturales sin azúcar para mejorar la absorción de nutrientes y evitar la deshidratación causada    " +
                                                  "\n por fiebre y sudoración. También es importante evitar bebidas con cafeína y alcohol, ya que pueden irritar las    " +
                                                  "\n vías respiratorias. EJERCICIO: La actividad física debe ser mínima durante la fase aguda de la enfermedad, pero   " +
                                                  "\n una vez en recuperación, se recomienda caminar 20 a 30 minutos al día para mejorar la capacidad pulmonar y evitar " +
                                                  "\n la pérdida de masa muscular. POSIBLE TRATAMIENTO: Para la tuberculosis en adultos mayores, el tratamiento estándar" +
                                                  "\n incluye una combinación de antibióticos como isoniazida, rifampicina, etambutol y pirazinamida, administrados     " +
                                                  "\n durante un período de 6 meses. Es crucial completar el tratamiento para evitar recaídas y resistencia bacteriana. " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en vitaminas y antioxidantes para fortalecer el sistema " +
                                                  "\n inmune, tales como: Frutas cítricas como naranjas y kiwis: ricas en vitamina C, que ayuda a reducir la duración   " +
                                                  "\n de los síntomas. Espinacas y brócoli: contienen antioxidantes y vitamina E, esenciales para la recuperación.      " +
                                                  "\n Jengibre y cúrcuma: poseen propiedades antiinflamatorias que pueden aliviar la congestión y el malestar general.  " +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga  " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más   " +
                                                  "\n de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además    " +
                                                  "\n por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico," +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACIÓN: En adultos mayores con herpes genital, la hidratación es esencial para reducir la inflamación y mejorar  " +
                                                  "\n la cicatrización de las lesiones. Se recomienda un consumo diario de 2 a 2.5 litros de agua, además de infusiones de  " +
                                                  "\n manzanilla y caldos ligeros para aliviar molestias y fortalecer el sistema inmunológico. También es importante evitar " +
                                                  "\n bebidas con cafeína y alcohol, ya que pueden irritar la piel y prolongar los brotes. EJERCICIO: La actividad física   " +
                                                  "\n debe ser moderada y adaptada a la condición del paciente, recomendándose ejercicios de bajo impacto como caminatas    " +
                                                  "\n suaves de 30 a 40 minutos al día, evitando el estrés excesivo que pueda desencadenar brotes. POSIBLE TRATAMIENTO:     " +
                                                  "\n Para el herpes genital en adultos mayores, el tratamiento suele incluir antivirales como aciclovir, valaciclovir o    " +
                                                  "\n famciclovir, que ayudan a reducir la duración y gravedad de los brotes. También se recomienda el uso de cremas tópicas  " +
                                                  "\n para aliviar el dolor y la inflamación. ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades antivirales " +
                                                  "\n y antiinflamatorias para mejorar la recuperación, tales como: Frutas ricas en antioxidantes como arándanos y moras:     " +
                                                  "\n ayudan a reducir el estrés oxidativo. Jengibre y cúrcuma: poseen propiedades antiinflamatorias que pueden aliviar los   " +
                                                  "\n síntomas. Pescados grasos como salmón y sardinas: ricos en Omega-3, que contribuyen a la salud celular y la cicatrización." +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa   " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un      " +
                                                  "\n Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud  " +
                                                  "\n si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN: En adultos mayores con sífilis, la hidratación es clave para ayudar al cuerpo a eliminar toxinas " +
                                                  "\n y mantener la función renal. Se recomienda un consumo diario de 2 a 2.5 litros de agua, además de infusiones  " +
                                                  "\n sin cafeína y caldos ligeros para mejorar la circulación y reducir la fatiga. También es importante consumir  " +
                                                  "\n líquidos ricos en electrolitos para mantener el equilibrio mineral del cuerpo. EJERCICIO: La actividad física " +
                                                  "\n debe ser moderada y adaptada a la condición del paciente, recomendándose ejercicios de bajo impacto como      " +
                                                  "\n caminatas suaves de 30 a 40 minutos al día, lo que ayuda a mejorar la circulación y fortalecer el sistema     " +
                                                  "\n inmunológico. POSIBLE TRATAMIENTO: Para la sífilis en adultos mayores, el tratamiento estándar es penicilina  " +
                                                  "\n benzatina, administrada en una dosis única o en varias dosis dependiendo del estadio de la enfermedad. En casos  " +
                                                  "\n de alergia a la penicilina, se pueden usar alternativas como la doxiciclina o la ceftriaxona. ALIMENTACIÓN: Se   " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema     " +
                                                  "\n inmune, tales como: Frutas cítricas como naranjas y kiwis: ricas en vitamina C, que ayuda a reducir el estrés    " +
                                                  "\n oxidativo. Pescados grasos como salmón y atún: ricos en Omega-3, que contribuyen a la salud cardiovascular.      " +
                                                  "\n Legumbres y frutos secos: fuentes de proteínas y zinc, esenciales para la regeneración celular. Este es solo     " +
                                                  "\n un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad " +
                                                  "\n y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la    " +
                                                  "\n respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes    " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACIÓN: En adultos mayores con tuberculosis, la hidratación es fundamental para mantener la función pulmonar   " +
                                                  "\n y reducir la viscosidad de las secreciones. Se recomienda un consumo diario de 2.5 a 3 litros de agua, además de    " +
                                                  "\n caldos y jugos naturales sin azúcar para mejorar la absorción de nutrientes y evitar la deshidratación causada por  " +
                                                  "\n fiebre y sudoración. También es importante evitar bebidas con cafeína y alcohol, ya que pueden irritar las vías     " +
                                                  "\n respiratorias. EJERCICIO: La actividad física debe ser mínima durante la fase aguda de la enfermedad, pero una vez     " +
                                                  "\n en recuperación, se recomienda caminar 20 a 30 minutos al día para mejorar la capacidad pulmonar y evitar la pérdida   " +
                                                  "\n de masa muscular. POSIBLE TRATAMIENTO: Para la tuberculosis en adultos mayores, el tratamiento estándar incluye una    " +
                                                  "\n combinación de antibióticos como isoniazida, rifampicina, etambutol y pirazinamida, administrados durante un período   " +
                                                  "\n de 6 meses. Es crucial completar el tratamiento para evitar recaídas y resistencia bacteriana. ALIMENTACIÓN: Se        " +
                                                  "\n recomienda el consumo de alimentos ricos en vitaminas y antioxidantes para fortalecer el sistema inmune, tales como:   " +
                                                  "\n Frutas cítricas como naranjas y kiwis: ricas en vitamina C, que ayuda a reducir la duración de los síntomas. Espinacas " +
                                                  "\n y brócoli: contienen antioxidantes y vitamina E, esenciales para la recuperación. Jengibre y cúrcuma: poseen propiedades" +
                                                  "\n antiinflamatorias que pueden aliviar la congestión y el malestar general. Este es solo un Diagnóstico predeterminado    " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y     " +
                                                  "\n sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor    " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que" +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACIÓN: En adultos mayores con Zika, la hidratación es esencial para reducir la fiebre y prevenir la deshidratación " +
                                                  "\n causada por sudoración excesiva. Se recomienda un consumo diario de 2.5 a 3 litros de agua, además de infusiones de      " +
                                                  "\n manzanilla y caldos ligeros para aliviar molestias y fortalecer el sistema inmunológico. EJERCICIO: La actividad física  " +
                                                  "\n debe ser mínima durante la fase aguda de la enfermedad, pero una vez en recuperación, se recomienda caminar 20 a 30      " +
                                                  "\n minutos al día para mejorar la circulación y evitar la fatiga. POSIBLE TRATAMIENTO: Para el Zika en adultos mayores,     " +
                                                  "\n no existe un tratamiento específico, pero se recomienda reposo, hidratación y el uso de analgésicos como paracetamol     " +
                                                  "\n para aliviar los síntomas. Se debe evitar el uso de aspirina y otros AINEs hasta descartar dengue para reducir el riesgo " +
                                                  "\n de sangrado. ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades antivirales y antioxidantes para mejorar" +
                                                  "\n la recuperación, tales como: Frutas ricas en antioxidantes como arándanos y moras: contienen vitamina C (24% del         " +
                                                  "\n requerimiento diario por cada 100 g) y antocianinas, que ayudan a reducir el estrés oxidativo. Jengibre y cúrcuma: poseen" +
                                                  "\n propiedades antiinflamatorias y contienen magnesio (11% del requerimiento diario por cada 100 g), que puede aliviar los  " +
                                                  "\n síntomas. Pescados grasos como salmón y sardinas: ricos en Omega-3 (EPA y DHA, 90% del requerimiento diario por cada     " +
                                                  "\n 100 g), que contribuyen a la salud celular y la cicatrización. Este es solo un Diagnóstico predeterminado lógico, haberlo" +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén " +
                                                  "\n correctas. Para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el          " +
                                                  "\n tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del Diagnóstico no le satisface del todo, se  " +
                                                  "\n le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACIÓN: En adultos mayores con rotavirus, la hidratación es esencial para prevenir la deshidratación       " +
                                                  "\n severa causada por diarrea y vómitos. Se recomienda un consumo diario de 3 a 3.5 litros de líquidos, incluyendo " +
                                                  "\n agua, sueros de rehidratación oral y caldos ligeros. EJERCICIO: Durante la fase aguda de la enfermedad, se      " +
                                                  "\n recomienda reposo absoluto. Una vez en recuperación, se pueden realizar caminatas suaves de 20 a 30 minutos al  " +
                                                  "\n día para mejorar la circulación y evitar la pérdida de masa muscular. POSIBLE TRATAMIENTO: No existe un         " +
                                                  "\n tratamiento específico para el rotavirus, pero se recomienda reposo, hidratación y el uso de medicamentos como  " +
                                                  "\n paracetamol para aliviar la fiebre y el malestar. En casos graves, puede ser necesaria la administración de     " +
                                                  "\n líquidos intravenosos. ALIMENTACIÓN: Se recomienda el consumo de alimentos suaves y ricos en electrolitos para  " +
                                                  "\n facilitar la recuperación, tales como: Plátanos: ricos en potasio (12% del requerimiento diario por cada 100 g)," +
                                                  "\n ayudan a reponer electrolitos perdidos. Arroz y pan tostado: contienen carbohidratos complejos (80% del         " +
                                                  "\n requerimiento diario por cada 100 g), que ayudan a estabilizar el sistema digestivo. Yogur natural: fuente de   " +
                                                  "\n probióticos y calcio (30% del requerimiento diario por cada 100 g), que ayudan a restaurar la flora intestinal. " +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga" +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas. Para ello se recomienda hacer más " +
                                                  "\n de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Además, " +
                                                  "\n por su salud, si la respuesta del Diagnóstico no le satisface del todo, se le recomienda mucho consultar a su   " +
                                                  "\n médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACIÓN: En adultos mayores con listeriosis, la hidratación es clave para ayudar al cuerpo a eliminar    " +
                                                  "\n la bacteria y reducir la fiebre. Se recomienda un consumo diario de 2.5 a 3 litros de agua, además de caldos " +
                                                  "\n ligeros y jugos naturales sin azúcar. EJERCICIO: La actividad física debe ser mínima durante la fase aguda de" +
                                                  "\n la enfermedad, pero una vez en recuperación, se recomienda caminar 20 a 30 minutos al día para mejorar la      " +
                                                  "\n circulación y fortalecer el sistema inmunológico. POSIBLE TRATAMIENTO: Para la listeriosis en adultos mayores, " +
                                                  "\n el tratamiento estándar es antibióticos como ampicilina o gentamicina, administrados por vía oral o intravenosa" +
                                                  "\n dependiendo de la gravedad del caso. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes" +
                                                  "\n y propiedades antibacterianas para fortalecer el sistema inmune, tales como: Ajo y cebolla: contienen alicina y" +
                                                  "\n quercetina, con efectos antimicrobianos naturales. Frutas cítricas como naranjas y kiwis: ricas en vitamina C  " +
                                                  "\n (80% del requerimiento diario por cada 100 g), que ayuda a reducir la inflamación. Yogur natural: fuente de       " +
                                                  "\n probióticos y calcio (30% del requerimiento diario por cada 100 g), que ayudan a restaurar la flora intestinal    " +
                                                  "\n afectada por los antibióticos. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas. Para  " +
                                                  "\n ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado " +
                                                  "\n de su paciente. Además, por su salud, si la respuesta del Diagnóstico no le satisface del todo, se le recomienda   " +
                                                  "\n mucho consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACIÓN: En adultos mayores con shigelosis, la hidratación es fundamental para prevenir la deshidratación " +
                                                  "\n causada por diarrea severa. Se recomienda un consumo diario de 3 a 3.5 litros de líquidos, incluyendo agua,   " +
                                                  "\n sueros de rehidratación oral y caldos ligeros. Es importante evitar bebidas con cafeína y alcohol, ya que     " +
                                                  "\n pueden agravar la deshidratación. EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo     " +
                                                  "\n absoluto. Una vez en recuperación, se pueden realizar caminatas suaves de 20 a 30 minutos al día para mejorar " +
                                                  "\n la circulación y evitar la fatiga. POSIBLE TRATAMIENTO: Para la shigelosis en adultos mayores, el tratamiento " +
                                                  "\n suele incluir antibióticos como ciprofloxacino o azitromicina, administrados por vía oral para reducir la     " +
                                                  "\n duración de los síntomas. También se recomienda evitar el uso de medicamentos antidiarreicos, ya que pueden   " +
                                                  "\n empeorar la infección. ALIMENTACIÓN: Se recomienda el consumo de alimentos suaves y ricos en electrolitos para   " +
                                                  "\n facilitar la recuperación, tales como: Plátanos: ricos en potasio (12% del requerimiento diario por cada 100 g), " +
                                                  "\n ayudan a reponer electrolitos perdidos. Arroz y pan tostado: contienen carbohidratos complejos (80% del          " +
                                                  "\n requerimiento diario por cada 100 g), que ayudan a estabilizar el sistema digestivo. Yogur natural: fuente de    " +
                                                  "\n probióticos y calcio (30% del requerimiento diario por cada 100 g), que ayudan a restaurar la flora intestinal.  " +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas. Para ello se recomienda hacer más  " +
                                                  "\n de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Además,  " +
                                                  "\n por su salud, si la respuesta del Diagnóstico no le satisface del todo, se le recomienda mucho consultar a su    " +
                                                  "\n médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n HIDRATACIÓN: En adultos mayores con EPOC, la hidratación es fundamental para mantener las vías respiratorias  " +
                                                  "\n húmedas y facilitar la expulsión de mucosidad. Se recomienda un consumo diario de 2.5 a 3 litros de agua,     " +
                                                  "\n distribuidos en pequeñas cantidades a lo largo del día para evitar la fatiga respiratoria. También se pueden  " +
                                                  "\n incluir infusiones sin cafeína y caldos tibios para mejorar la hidratación sin irritar las vías respiratorias.   " +
                                                  "\n EJERCICIO: La actividad física debe ser moderada y adaptada a la capacidad del paciente, recomendándose          " +
                                                  "\n ejercicios de bajo impacto como caminatas suaves de 30 a 45 minutos al día, además de ejercicios de respiración  " +
                                                  "\n profunda para mejorar la función pulmonar. POSIBLE TRATAMIENTO: Para el EPOC en adultos mayores, el tratamiento  " +
                                                  "\n suele incluir broncodilatadores de acción prolongada como el tiotropio (Spiriva) y el salmeterol, corticosteroides  " +
                                                  "\n inhalados como la fluticasona (Flixotide), y en algunos casos, oxigenoterapia para mejorar la respiración.          " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades antioxidantes y antiinflamatorias para mejorar  " +
                                                  "\n la función pulmonar, tales como: Pescados grasos como salmón y atún: ricos en Omega-3 (EPA y DHA, 90% del              " +
                                                  "\n requerimiento diario por cada 100 g), que ayudan a reducir la inflamación de las vías respiratorias. Frutas y verduras " +
                                                  "\n de colores vivos como arándanos y espinacas: ricas en antioxidantes y vitamina C (80% del requerimiento diario por cada" +
                                                  "\n 100 g), que fortalecen el sistema inmune. Jengibre y cúrcuma: contienen compuestos con efectos antiinflamatorios y     " +
                                                  "\n magnesio (11% del requerimiento diario por cada 100 g), que pueden ser beneficiosos para las vías respiratorias.       " +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa   " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas. Para ello se recomienda hacer más de un      " +
                                                  "\n Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Además, por su salud," +
                                                  "\n si la respuesta del Diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico. Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACIÓN: En adultos mayores con clamidia, la hidratación es clave para ayudar al cuerpo a eliminar la bacteria  " +
                                                  "\n y reducir la inflamación del tracto urinario. Se recomienda un consumo diario de 2 a 2.5 litros de agua, además de  " +
                                                  "\n jugos naturales sin azúcar y caldos ligeros para mejorar la función renal y reducir molestias urinarias. También es " +
                                                  "\n importante evitar bebidas con cafeína y alcohol, ya que pueden irritar el tracto urinario. EJERCICIO: La actividad  " +
                                                  "\n física debe ser moderada y adaptada a la condición del paciente, recomendándose ejercicios de bajo impacto como    " +
                                                  "\n caminatas suaves de 30 a 40 minutos al día, evitando esfuerzos excesivos que puedan agravar los síntomas. POSIBLE  " +
                                                  "\n TRATAMIENTO: Para la clamidia en adultos mayores, el tratamiento recomendado es antibióticos como la azitromicina  " +
                                                  "\n en dosis única o la doxiciclina durante 7 días, asegurando la eliminación completa de la bacteria. ALIMENTACIÓN:   " +
                                                  "\n Se recomienda el consumo de alimentos con propiedades antibacterianas y antiinflamatorias para mejorar la recuperación, " +
                                                  "\n tales como: Ajo y cebolla: contienen alicina y quercetina, con efectos antimicrobianos naturales. Yogur natural: fuente " +
                                                  "\n de probióticos y calcio (30% del requerimiento diario por cada 100 g), que ayudan a restaurar la flora intestinal       " +
                                                  "\n afectada por los antibióticos. Frutas y verduras ricas en vitamina C como fresas y pimientos: contienen vitamina C      " +
                                                  "\n (80% del requerimiento diario por cada 100 g), que fortalecen el sistema inmune y aceleran la recuperación. Este es     " +
                                                  "\n solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad " +
                                                  "\n y que por ello la enfermedad y sus respuestas estén correctas. Para ello se recomienda hacer más de un Diagnóstico   " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la    " +
                                                  "\n respuesta del Diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico. Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN: En adultos mayores con meningitis bacteriana, la hidratación es esencial para reducir la fiebre  " +
                                                  "\n y prevenir la deshidratación causada por sudoración excesiva. Se recomienda un consumo diario de 3 a 3.5      " +
                                                  "\n litros de agua, además de infusiones de manzanilla y caldos ligeros para aliviar molestias y fortalecer el    " +
                                                  "\n sistema inmunológico. EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo absoluto. Sin   " +
                                                  "\n embargo, una vez en recuperación, es importante realizar ejercicios progresivos para mejorar la movilidad y   " +
                                                  "\n reducir la fatiga. Se recomienda comenzar con ejercicios de estiramiento suaves para relajar los músculos y   " +
                                                  "\n mejorar la circulación. Posteriormente, se pueden incluir ejercicios de resistencia ligera, como el uso de    " +
                                                  "\n bandas elásticas o la presión de objetos en las manos, para recuperar la fuerza muscular. También es recomendable " +
                                                  "\n realizar caminatas cortas de 20 a 30 minutos al día, aumentando gradualmente la duración según la tolerancia del  " +
                                                  "\n paciente. Estos ejercicios ayudan a mejorar la postura, reducir la rigidez muscular y fortalecer el sistema       " +
                                                  "\n cardiovascular. POSIBLE TRATAMIENTO: Para la meningitis bacteriana en adultos mayores, el tratamiento suele incluir " +
                                                  "\n antibióticos intravenosos como ceftriaxona o vancomicina, además de corticosteroides para reducir la inflamación    " +
                                                  "\n cerebral. ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades antivirales y antioxidantes para      " +
                                                  "\n mejorar la recuperación, tales como: Frutas ricas en antioxidantes como arándanos y moras: contienen vitamina C     " +
                                                  "\n (24% del requerimiento diario por cada 100 g) y antocianinas, que ayudan a reducir el estrés oxidativo. Jengibre y  " +
                                                  "\n cúrcuma: poseen propiedades antiinflamatorias y contienen magnesio (11% del requerimiento diario por cada 100 g),   " +
                                                  "\n que puede aliviar los síntomas. Pescados grasos como salmón y sardinas: ricos en Omega-3 (EPA y DHA, 90% del      " +
                                                  "\n requerimiento diario por cada 100 g), que contribuyen a la salud celular y la cicatrización. Este es solo un      " +
                                                  "\n Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y " +
                                                  "\n que por ello la enfermedad y sus respuestas estén correctas. Para ello se recomienda hacer más de un Diagnóstico  " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la " +
                                                  "\n respuesta del Diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico. Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN: En adultos mayores con cáncer, la hidratación es fundamental para mantener la función renal, reducir los efectos  " +
                                                  "\n secundarios de los tratamientos y mejorar la recuperación. Se recomienda un consumo diario de 2.5 a 3.5 litros de agua, además " +
                                                  "\n de caldos ligeros, jugos naturales sin azúcar y tés sin cafeína para mejorar la absorción de nutrientes y evitar la            " +
                                                  "\n deshidratación causada por efectos secundarios como vómitos o diarrea. EJERCICIO: La actividad física debe ser adaptada a la   " +
                                                  "\n condición del paciente y el tipo de cáncer. Se recomienda comenzar con ejercicios de movilidad y estiramiento, como yoga o     " +
                                                  "\n tai chi, para mejorar la flexibilidad y reducir la rigidez muscular. Posteriormente, se pueden incluir ejercicios de resistencia" +
                                                  "\n moderada, como levantamiento de pesas ligeras o el uso de bandas elásticas, para fortalecer los músculos y mejorar la densidad " +
                                                  "\n ósea. También es recomendable realizar caminatas de 30 a 45 minutos al día, lo que ayuda a mejorar la circulación, reducir la  " +
                                                  "\n fatiga y fortalecer el sistema inmunológico. En algunos casos, se pueden incluir ejercicios aeróbicos de bajo impacto, como    " +
                                                  "\n natación o ciclismo suave, para mejorar la capacidad pulmonar y cardiovascular. POSIBLE TRATAMIENTO: Para el cáncer en adultos " +
                                                  "\n mayores, el tratamiento depende del tipo y estadio de la enfermedad. Puede incluir quimioterapia, radioterapia, inmunoterapia  " +
                                                  "\n o cirugía, dependiendo de la evaluación médica. En algunos casos, se recomienda tratamiento paliativo para mejorar la calidad  " +
                                                  "\n de vida. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y propiedades antiinflamatorias para       " +
                                                  "\n fortalecer el sistema inmune y mejorar la recuperación, tales como: Frutas cítricas como naranjas y kiwis: ricas en vitamina C " +
                                                  "\n (80% del requerimiento diario por cada 100 g), que ayuda a reducir el estrés oxidativo. Pescados grasos como salmón y atún:    " +
                                                  "\n ricos en Omega-3 (EPA y DHA, 90% del requerimiento diario por cada 100 g), que contribuyen a la salud celular y la cicatrización." +
                                                  "\n Verduras de hoja verde como espinacas y brócoli: contienen antioxidantes y vitamina E (70% del requerimiento diario por cada  " +
                                                  "\n 100 g), esenciales para la recuperación. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza   " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas. Para ello se      " +
                                                  "\n recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente.  " +
                                                  "\n Además, por su salud, si la respuesta del Diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        if(EstaturaMasculino.equals("1.45-1.60 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACIÓN: En adultos mayores con influenza, la hidratación es esencial para reducir la fiebre y prevenir    " +
                                                  "\n la deshidratación causada por sudoración excesiva. Se recomienda un consumo diario de 2.5 a 3 litros de agua,  " +
                                                  "\n además de caldos tibios y tés sin cafeína para aliviar molestias y fortalecer el sistema inmunológico.         " +
                                                  "\n EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo absoluto. Una vez en recuperación,        " +
                                                  "\n se pueden realizar caminatas suaves de 20 a 30 minutos al día, evitando el frío extremo y ambientes contaminados. " +
                                                  "\n También se recomienda ejercicios de respiración profunda para mejorar la función pulmonar y reducir la congestión. " +
                                                  "\n POSIBLE TRATAMIENTO: Para la influenza en adultos mayores, se recomienda el uso de antivirales como oseltamivir    " +
                                                  "\n (Tamiflu) para reducir la duración y gravedad de los síntomas, además de medicamentos para aliviar la fiebre y el  " +
                                                  "\n malestar como paracetamol o ibuprofeno. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en vitaminas y   " +
                                                  "\n antioxidantes para fortalecer el sistema inmune, tales como: Frutas cítricas como naranjas y kiwis: contienen      " +
                                                  "\n vitamina C (80% del requerimiento diario por cada 100 g), que ayuda a reducir la duración de los síntomas.           " +
                                                  "\n Espinacas y brócoli: contienen antioxidantes y vitamina E (70% del requerimiento diario por cada 100 g), esenciales  " +
                                                  "\n para la recuperación. Jengibre y cúrcuma: poseen propiedades antiinflamatorias y magnesio (11% del requerimiento     " +
                                                  "\n diario por cada 100 g), que pueden aliviar la congestión y el malestar general. Este es solo un Diagnóstico          " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello   " +
                                                  "\n la enfermedad y sus respuestas estén correctas. Para ello se recomienda hacer más de un Diagnóstico de Mi Vida para  " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del    " +
                                                  "\n Diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico. Angel L Montes agradece tu     " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n HIDRATACIÓN: En adultos mayores con neumonía, la fiebre alta y sudoración excesiva pueden aumentar el riesgo   " +
                                                  "\n de deshidratación. Se recomienda un consumo diario de 2.5 a 3 litros de agua, además de caldos tibios y jugos  " +
                                                  "\n naturales sin azúcar para mejorar la absorción de nutrientes y mantener las secreciones pulmonares más fluidas." +
                                                  "\n EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo absoluto. Una vez en recuperación, se  " +
                                                  "\n recomienda caminatas cortas de 15 a 25 minutos al día, aumentando gradualmente la duración según la tolerancia " +
                                                  "\n del paciente. También se pueden realizar ejercicios de expansión torácica, como inhalaciones profundas y       " +
                                                  "\n exhalaciones controladas, para mejorar la capacidad pulmonar. POSIBLE TRATAMIENTO: Para la neumonía en adultos " +
                                                  "\n mayores, el tratamiento suele incluir antibióticos como amoxicilina o azitromicina, dependiendo del tipo de    " +
                                                  "\n infección. También se pueden administrar medicamentos para reducir la fiebre y aliviar el malestar, como       " +
                                                  "\n paracetamol o ibuprofeno. En casos graves, puede ser necesario el uso de oxígeno suplementario. ALIMENTACIÓN:  " +
                                                  "\n Se recomienda el consumo de alimentos ricos en vitaminas y antioxidantes para fortalecer el sistema inmune, tales " +
                                                  "\n como: Frutas cítricas como naranjas y kiwis: contienen vitamina C (80% del requerimiento diario por cada 100 g),  " +
                                                  "\n que ayuda a reducir la duración de los síntomas. Espinacas y brócoli: contienen antioxidantes y vitamina E (70%   " +
                                                  "\n del requerimiento diario por cada 100 g), esenciales para la recuperación. Jengibre y cúrcuma: poseen propiedades " +
                                                  "\n antiinflamatorias y magnesio (11% del requerimiento diario por cada 100 g), que pueden aliviar la congestión y el " +
                                                  "\n malestar general. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que  " +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas. Para ello se      " +
                                                  "\n recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su" +
                                                  "\n paciente. Además, por su salud, si la respuesta del Diagnóstico no le satisface del todo, se le recomienda mucho  " +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACIÓN: En adultos mayores con diabetes, la hidratación es clave para mantener niveles adecuados de    " +
                                                  "\n glucosa en sangre y prevenir complicaciones renales. Se recomienda un consumo diario de 2 a 2.5 litros de   " +
                                                  "\n agua, evitando bebidas azucaradas y con cafeína, ya que pueden afectar el control de la glucosa. EJERCICIO: " +
                                                  "\n La actividad física debe ser moderada y adaptada a la condición del paciente. Se recomienda caminatas de 30 " +
                                                  "\n a 45 minutos al día, lo que ayuda a mejorar la sensibilidad a la insulina y controlar el peso. También se   " +
                                                  "\n pueden realizar ejercicios de resistencia moderada, como levantamiento de pesas ligeras o el uso de bandas  " +
                                                  "\n elásticas, para fortalecer los músculos y mejorar la densidad ósea. POSIBLE TRATAMIENTO: Para la diabetes en  " +
                                                  "\n adultos mayores, el tratamiento suele incluir medicamentos como la metformina para mejorar la sensibilidad a  " +
                                                  "\n la insulina, además de insulina en algunos casos. También se recomienda el monitoreo constante de la glucosa  " +
                                                  "\n y ajustes en la dieta. ALIMENTACIÓN: Se recomienda el consumo de alimentos con bajo índice glucémico y ricos  " +
                                                  "\n en fibra para estabilizar los niveles de azúcar en sangre, tales como: Avena y legumbres: contienen fibra     " +
                                                  "\n soluble (60% del requerimiento diario por cada 100 g), que ayuda a regular la glucosa y mejorar la digestión. " +
                                                  "\n Frutas como manzanas y peras: contienen antioxidantes y fibra (50% del requerimiento diario por cada 100 g)   " +
                                                  "\n sin elevar bruscamente la glucosa. Verduras de hoja verde como espinacas y acelgas: contienen magnesio (40% del " +
                                                  "\n requerimiento diario por cada 100 g), que ayuda a mejorar la sensibilidad a la insulina. Este es solo un        " +
                                                  "\n Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad " +
                                                  "\n y que por ello la enfermedad y sus respuestas estén correctas. Para ello se recomienda hacer más de un Diagnóstico" +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la " +
                                                  "\n respuesta del Diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico. Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN: En adultos mayores con asma, la hidratación es fundamental para mantener las vías respiratorias húmedas     " +
                                                  "\n y reducir la irritación. Se recomienda un consumo diario de 2 a 2.5 litros de agua, distribuidos en pequeñas cantidades  " +
                                                  "\n a lo largo del día para evitar la fatiga respiratoria. Además, se recomienda el consumo de infusiones sin cafeína, como  " +
                                                  "\n té de jengibre o manzanilla, que pueden ayudar a reducir la inflamación de las vías respiratorias. También es importante " +
                                                  "\n evitar bebidas con cafeína y alcohol, ya que pueden aumentar la inflamación y la producción de moco. Se recomienda el uso " +
                                                  "\n de humidificadores en el hogar para mantener el aire húmedo y evitar la sequedad en las vías respiratorias. EJERCICIO:    " +
                                                  "\n La actividad física debe ser controlada y adaptada a la capacidad del paciente, recomendándose ejercicios de bajo impacto " +
                                                  "\n como caminatas suaves de 30 a 40 minutos al día, evitando ambientes fríos o contaminados que puedan desencadenar síntomas.  " +
                                                  "\n También se recomienda la práctica de ejercicios de respiración profunda, como la técnica de respiración diafragmática,      " +
                                                  "\n para mejorar la capacidad pulmonar y reducir la sensación de falta de aire. POSIBLE TRATAMIENTO: Para el asma en adultos    " +
                                                  "\n mayores, el tratamiento suele incluir broncodilatadores de alivio rápido como el salbutamol (Ventolin), corticosteroides    " +
                                                  "\n inhalados como la fluticasona (Flixotide) y en algunos casos, modificadores de leucotrienos como el montelukast             " +
                                                  "\n (Singulair). ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades antiinflamatorias y antioxidantes para     " +
                                                  "\n mejorar la función pulmonar, tales como: Pescados grasos como salmón y atún: ricos en Omega-3 (EPA y DHA, 90% del           " +
                                                  "\n requerimiento diario por cada 100 g), que ayudan a reducir la inflamación de las vías respiratorias. Frutas y verduras      " +
                                                  "\n de colores vivos como arándanos y espinacas: ricas en antioxidantes y vitamina C (80% del requerimiento diario por cada     " +
                                                  "\n 100 g), que fortalecen el sistema inmune. Jengibre y cúrcuma: contienen compuestos con efectos antiinflamatorios y magnesio " +
                                                  "\n (11% del requerimiento diario por cada 100 g), que pueden ser beneficiosos para las vías respiratorias. Este es solo un     " +
                                                  "\n Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por   " +
                                                  "\n ello la enfermedad y sus respuestas estén correctas. Para ello se recomienda hacer más de un Diagnóstico de Mi Vida para    " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del Diagnóstico " +
                                                  "\n no le satisface del todo, se le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita a la app          " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN: En adultos mayores con VIH/SIDA, la hidratación es fundamental para mantener la función renal   " +
                                                  "\n y reducir los efectos secundarios de los medicamentos antirretrovirales. Se recomienda un consumo diario     " +
                                                  "\n de 2.5 a 3 litros de agua, distribuidos en pequeñas cantidades a lo largo del día para evitar la fatiga y    " +
                                                  "\n mejorar la absorción de nutrientes. También se recomienda el consumo de bebidas ricas en electrolitos, como  " +
                                                  "\n agua de coco o sueros de rehidratación, para mantener el equilibrio mineral del cuerpo. Es importante evitar " +
                                                  "\n bebidas azucaradas y con cafeína, ya que pueden afectar la función hepática y renal. Se recomienda el consumo" +
                                                  "\n de jugos naturales sin azúcar, como jugo de naranja o zanahoria, que aportan vitaminas esenciales para       " +
                                                  "\n fortalecer el sistema inmunológico. EJERCICIO: La actividad física debe ser moderada y adaptada a la condición   " +
                                                  "\n del paciente, recomendándose ejercicios de bajo impacto como caminatas suaves de 30 a 45 minutos al día, lo que  " +
                                                  "\n ayuda a fortalecer el sistema inmunológico y mejorar la salud cardiovascular. También se recomienda la práctica  " +
                                                  "\n de ejercicios de resistencia moderada, como levantamiento de pesas ligeras o el uso de bandas elásticas, para    " +
                                                  "\n fortalecer los músculos y mejorar la densidad ósea. POSIBLE TRATAMIENTO: Para el VIH/SIDA en adultos mayores,    " +
                                                  "\n el tratamiento incluye terapia antirretroviral (TAR) con combinaciones de medicamentos como tenofovir,           " +
                                                  "\n emtricitabina y dolutegravir, que ayudan a mantener el virus bajo control y mejorar la calidad de vida. Es       " +
                                                  "\n crucial el monitoreo constante de la carga viral y el estado inmunológico. ALIMENTACIÓN: Se recomienda el consumo" +
                                                  "\n de alimentos ricos en antioxidantes y proteínas para fortalecer el sistema inmune, tales como: Frutas cítricas   " +
                                                  "\n como naranjas y kiwis: contienen vitamina C (80% del requerimiento diario por cada 100 g), que ayuda a reducir   " +
                                                  "\n el estrés oxidativo. Pescados grasos como salmón y atún: ricos en Omega-3 (EPA y DHA, 90% del requerimiento diario " +
                                                  "\n por cada 100 g), que contribuyen a la salud cardiovascular. Legumbres y frutos secos: fuentes de proteínas y zinc  " +
                                                  "\n (50% del requerimiento diario por cada 100 g), esenciales para la regeneración celular. Este es solo un Diagnóstico" +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello " +
                                                  "\n la enfermedad y sus respuestas estén correctas. Para ello se recomienda hacer más de un Diagnóstico de Mi Vida para" +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del   " +
                                                  "\n Diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico. Angel L Montes agradece tu    " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN: En adultos mayores con gonorrea, la hidratación es clave para ayudar a eliminar la bacteria y  " +
                                                  "\n reducir la inflamación del tracto urinario. Se recomienda un consumo diario de 2 a 2.5 litros de agua,      " +
                                                  "\n distribuidos en pequeñas cantidades a lo largo del día para mejorar la función renal y reducir molestias    " +
                                                  "\n urinarias. También se recomienda el consumo de jugos naturales sin azúcar, como jugo de arándano, que puede " +
                                                  "\n ayudar a prevenir infecciones urinarias recurrentes. Es importante evitar bebidas con cafeína y alcohol, ya " +
                                                  "\n que pueden irritar el tracto urinario y prolongar los síntomas. Se recomienda el consumo de infusiones de   " +
                                                  "\n hierbas, como té de manzanilla o diente de león, que tienen propiedades antibacterianas y pueden ayudar a   " +
                                                  "\n aliviar la inflamación. EJERCICIO: La actividad física debe ser moderada y adaptada a la condición del      " +
                                                  "\n paciente, recomendándose ejercicios de bajo impacto como caminatas suaves de 30 a 40 minutos al día, evitando " +
                                                  "\n esfuerzos excesivos que puedan agravar los síntomas. También se recomienda la práctica de ejercicios de       " +
                                                  "\n movilidad, como estiramientos suaves, para mejorar la circulación y reducir la fatiga. POSIBLE TRATAMIENTO:   " +
                                                  "\n Para la gonorrea en adultos mayores, el tratamiento recomendado es una dosis única de ceftriaxona 500 mg      " +
                                                  "\n administrada por vía intramuscular, acompañada de doxiciclina en caso de coinfección con clamidia. Es         " +
                                                  "\n fundamental completar el tratamiento y evitar relaciones sexuales hasta la recuperación total. ALIMENTACIÓN:  " +
                                                  "\n Se recomienda el consumo de alimentos con propiedades antibacterianas y antiinflamatorias para mejorar la     " +
                                                  "\n recuperación, tales como: Ajo y cebolla: contienen alicina y quercetina, con efectos antimicrobianos naturales." +
                                                  "\n Yogur natural: fuente de probióticos y calcio (30% del requerimiento diario por cada 100 g), que ayudan a      " +
                                                  "\n restaurar la flora intestinal afectada por los antibióticos. Frutas y verduras ricas en vitamina C como fresas " +
                                                  "\n y pimientos: contienen vitamina C (80% del requerimiento diario por cada 100 g), que fortalecen el sistema     " +
                                                  "\n inmune y aceleran la recuperación. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no    " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén     " +
                                                  "\n correctas. Para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad      " +
                                                  "\n en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del Diagnóstico no le satisface" +
                                                  "\n del todo, se le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida)    " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACIÓN: En adultos mayores con herpes genital, la hidratación es esencial para reducir la inflamación y      " +
                                                  "\n mejorar la cicatrización de las lesiones. Se recomienda un consumo diario de 2 a 2.5 litros de agua,              " +
                                                  "\n distribuidos en pequeñas cantidades a lo largo del día para evitar la fatiga y mejorar la absorción de nutrientes.   " +
                                                  "\n También se recomienda el consumo de infusiones de manzanilla y caldos ligeros, que pueden ayudar a aliviar molestias " +
                                                  "\n y fortalecer el sistema inmunológico. Es importante evitar bebidas con cafeína y alcohol, ya que pueden irritar la   " +
                                                  "\n piel y prolongar los brotes. Se recomienda el uso de agua tibia para la higiene íntima, evitando jabones agresivos   " + 
                                                  "\n que puedan empeorar la irritación. EJERCICIO: La actividad física debe ser moderada y adaptada a la condición del    " +
                                                  "\n paciente, recomendándose ejercicios de bajo impacto como caminatas suaves de 30 a 40 minutos al día, evitando el     " +
                                                  "\n estrés excesivo que pueda desencadenar brotes. También se recomienda la práctica de ejercicios de relajación, como   " +
                                                  "\n yoga o meditación, para reducir el estrés y fortalecer el sistema inmunológico. POSIBLE TRATAMIENTO: Para el herpes  " +
                                                  "\n genital en adultos mayores, el tratamiento suele incluir antivirales como aciclovir, valaciclovir o famciclovir,     " +
                                                  "\n que ayudan a reducir la duración y gravedad de los brotes. También se recomienda el uso de cremas tópicas para aliviar " +
                                                  "\n el dolor y la inflamación. ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades antivirales y           " +
                                                  "\n antiinflamatorias para mejorar la recuperación, tales como: Frutas ricas en antioxidantes como arándanos y moras:      " +
                                                  "\n contienen vitamina C (24% del requerimiento diario por cada 100 g) y antocianinas, que ayudan a reducir el estrés      " +
                                                  "\n oxidativo. Jengibre y cúrcuma: poseen propiedades antiinflamatorias y contienen magnesio (11% del requerimiento diario " +
                                                  "\n por cada 100 g), que puede aliviar los síntomas. Pescados grasos como salmón y sardinas: ricos en Omega-3 (EPA y DHA,  " +
                                                  "\n 90% del requerimiento diario por cada 100 g), que contribuyen a la salud celular y la cicatrización. Este es solo un   " +
                                                  "\n Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que  " +
                                                  "\n por ello la enfermedad y sus respuestas estén correctas. Para ello se recomienda hacer más de un Diagnóstico de Mi Vida" +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del  " + 
                                                  "\n Diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN: En adultos mayores con sífilis, la hidratación es clave para ayudar al cuerpo a eliminar toxinas         " +
                                                  "\n y mantener la función renal. Se recomienda un consumo diario de 2 a 2.5 litros de agua, distribuidos en pequeñas      " +
                                                  "\n cantidades a lo largo del día para mejorar la circulación y reducir la fatiga. También se recomienda el consumo       " +
                                                  "\n de bebidas ricas en electrolitos, como agua de coco o sueros de rehidratación, para mantener el equilibrio mineral    " +
                                                  "\n del cuerpo. Es importante evitar bebidas azucaradas y con cafeína, ya que pueden afectar la función hepática y renal. " +
                                                  "\n Se recomienda el consumo de jugos naturales sin azúcar, como jugo de naranja o zanahoria, que aportan vitaminas       " +
                                                  "\n esenciales para fortalecer el sistema inmunológico. EJERCICIO: La actividad física debe ser moderada y adaptada a la  " +
                                                  "\n condición del paciente, recomendándose ejercicios de bajo impacto como caminatas suaves de 30 a 40 minutos al día, lo " +
                                                  "\n que ayuda a mejorar la circulación y fortalecer el sistema inmunológico. También se recomienda la práctica de ejercicios    " +
                                                  "\n de movilidad, como estiramientos suaves, para mejorar la flexibilidad y reducir la rigidez muscular. POSIBLE TRATAMIENTO:   " +
                                                  "\n Para la sífilis en adultos mayores, el tratamiento estándar es penicilina benzatina, administrada en una dosis única o      " +
                                                  "\n en varias dosis dependiendo del estadio de la enfermedad. En casos de alergia a la penicilina, se pueden usar alternativas  " +
                                                  "\n como la doxiciclina o la ceftriaxona. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes " +
                                                  "\n esenciales para fortalecer el sistema inmune, tales como: Frutas cítricas como naranjas y kiwis: contienen vitamina C (80%  " +
                                                  "\n del requerimiento diario por cada 100 g), que ayuda a reducir el estrés oxidativo. Pescados grasos como salmón y atún:      " +
                                                  "\n ricos en Omega-3 (EPA y DHA, 90% del requerimiento diario por cada 100 g), que contribuyen a la salud cardiovascular.       " +
                                                  "\n Legumbres y frutos secos: fuentes de proteínas y zinc (50% del requerimiento diario por cada 100 g), esenciales para la     " +
                                                  "\n regeneración celular. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el     " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas. Para ello se recomienda hacer  " +
                                                  "\n más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente. Además, por su  " +
                                                  "\n salud, si la respuesta del Diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico. Angel L Montes" +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB). " +
                                                  "\n HIDRATACIÓN: En adultos mayores con tuberculosis, la hidratación es fundamental para mantener la función pulmonar   " +
                                                  "\n y reducir la viscosidad de las secreciones. Se recomienda un consumo diario de 2.5 a 3 litros de agua, distribuidos " +
                                                  "\n en pequeñas cantidades a lo largo del día para evitar la fatiga y mejorar la absorción de nutrientes. También se    " +
                                                  "\n recomienda el consumo de caldos tibios y jugos naturales sin azúcar, que pueden ayudar a mejorar la absorción de    " +
                                                  "\n nutrientes y evitar la deshidratación causada por fiebre y sudoración. Es importante evitar bebidas con cafeína y   " +
                                                  "\n alcohol, ya que pueden irritar las vías respiratorias. Se recomienda el uso de humidificadores en el hogar para     " +
                                                  "\n mantener el aire húmedo y evitar la sequedad en las vías respiratorias. EJERCICIO: La actividad física debe ser     " +
                                                  "\n mínima durante la fase aguda de la enfermedad, pero una vez en recuperación, se recomienda caminatas cortas de 15   " +
                                                  "\n a 25 minutos al día, aumentando gradualmente la duración según la tolerancia del paciente. También se pueden realizar   " +
                                                  "\n ejercicios de expansión torácica, como inhalaciones profundas y exhalaciones controladas, para mejorar la capacidad     " +
                                                  "\n pulmonar. POSIBLE TRATAMIENTO: Para la tuberculosis en adultos mayores, el tratamiento estándar incluye una combinación " +
                                                  "\n de antibióticos como isoniazida, rifampicina, etambutol y pirazinamida, administrados durante un período de 6 meses.    " +
                                                  "\n Es crucial completar el tratamiento para evitar recaídas y resistencia bacteriana. ALIMENTACIÓN: Se recomienda el       " +
                                                  "\n consumo de alimentos ricos en vitaminas y antioxidantes para fortalecer el sistema inmune, tales como: Frutas cítricas  " +
                                                  "\n como naranjas y kiwis: contienen vitamina C (80% del requerimiento diario por cada 100 g), que ayuda a reducir la       " +
                                                  "\n duración de los síntomas. Espinacas y brócoli: contienen antioxidantes y vitamina E (70% del requerimiento diario por   " +
                                                  "\n cada 100 g), esenciales para la recuperación. Jengibre y cúrcuma: poseen propiedades antiinflamatorias y magnesio       " +
                                                  "\n (11% del requerimiento diario por cada 100 g), que pueden aliviar la congestión y el malestar general. Este es solo un  " +
                                                  "\n Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que   " +
                                                  "\n por ello la enfermedad y sus respuestas estén correctas. Para ello se recomienda hacer más de un Diagnóstico de Mi Vida " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del  " +
                                                  "\n Diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACIÓN: Mantener una hidratación adecuada ayuda a lubricar las articulaciones y reducir la inflamación, se     " +
                                                  "\n recomienda consumir 2.5 a 3 litros de agua al día, además de infusiones de jengibre y cúrcuma con propiedades       " +
                                                  "\n antiinflamatorias, evitando bebidas con cafeína y alcohol que pueden aumentar la rigidez articular, también es      " +
                                                  "\n recomendable el consumo de caldos ricos en colágeno para fortalecer los cartílagos y reducir el desgaste articular. " +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada con ejercicios de bajo impacto como caminatas suaves de 30 a 45  " +
                                                  "\n minutos al día, además de movilidad articular con yoga o tai chi y fortalecimiento muscular con bandas elásticas para  " +
                                                  "\n mejorar la estabilidad de las articulaciones y reducir el dolor. POSIBLE TRATAMIENTO: Incluye antiinflamatorios no     " +
                                                  "\n esteroides (AINEs) como ibuprofeno o naproxeno, además de suplementos de glucosamina y condroitina para mejorar la     " +
                                                  "\n salud articular, en casos más severos se pueden usar corticosteroides o terapia biológica. ALIMENTACIÓN: Se recomienda " +
                                                  "\n el consumo de pescados grasos como salmón y atún ricos en Omega-3 (EPA y DHA, 90% del requerimiento diario por cada    " +
                                                  "\n 100 g) que ayudan a reducir la inflamación de las articulaciones, frutas y verduras de colores vivos como arándanos    " +
                                                  "\n y espinacas ricas en antioxidantes y vitamina C (80% del requerimiento diario por cada 100 g) que fortalecen el sistema" +
                                                  "\n inmune, jengibre y cúrcuma con compuestos antiinflamatorios y magnesio (11% del requerimiento diario por cada 100 g)   " +
                                                  "\n beneficiosos para las articulaciones. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se " +
                                                  "\n recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente," +
                                                  "\n además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico.  " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACIÓN: Es clave para aliviar la irritación de las vías respiratorias y reducir la viscosidad de las         " +
                                                  "\n secreciones, se recomienda consumir 2.5 a 3 litros de agua al día, además de caldos tibios y tés sin cafeína      " +
                                                  "\n como miel con limón para calmar la garganta, evitando bebidas frías y con gas que pueden aumentar la irritación,  " +
                                                  "\n también es útil el uso de humidificadores para mantener el aire húmedo y evitar la sequedad en las vías             " +
                                                  "\n respiratorias. EJERCICIO: Durante la fase aguda se recomienda reposo absoluto, en recuperación se pueden realizar   " +
                                                  "\n caminatas cortas de 15 a 25 minutos al día, aumentando gradualmente la duración según la tolerancia del paciente,   " +
                                                  "\n además de ejercicios de expansión torácica como inhalaciones profundas y exhalaciones controladas para mejorar la   " +
                                                  "\n capacidad pulmonar. POSIBLE TRATAMIENTO: Incluye antibióticos como azitromicina, claritromicina o eritromicina,     " +
                                                  "\n administrados en los primeros días de la enfermedad para reducir la severidad de los síntomas, también se recomienda" +
                                                  "\n el uso de broncodilatadores en casos de dificultad respiratoria severa. ALIMENTACIÓN: Se recomienda el consumo de   " +
                                                  "\n frutas cítricas como naranjas y kiwis ricas en vitamina C (80% del requerimiento diario por cada 100 g) que ayuda   " +
                                                  "\n a reducir la inflamación de las vías respiratorias, jengibre y cúrcuma con propiedades antiinflamatorias y magnesio    " +
                                                  "\n (11% del requerimiento diario por cada 100 g) que pueden aliviar la congestión y el malestar general, miel y propóleo  " +
                                                  "\n que ayudan a calmar la garganta y reducir la irritación. Este es solo un Diagnóstico predeterminado lógico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén " +
                                                  "\n correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el          " +
                                                  "\n tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se     " +
                                                  "\n le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACIÓN: Es esencial para reducir la fiebre y aliviar la inflamación de las glándulas salivales, se recomienda  " +
                                                  "\n consumir 2 a 2.5 litros de agua al día, además de jugos naturales sin azúcar como jugo de zanahoria o manzana para  " +
                                                  "\n fortalecer el sistema inmunológico, evitando bebidas ácidas y con gas que pueden aumentar la irritación de las      " +
                                                  "\n glándulas salivales, también es recomendable consumir sopas y purés que son fáciles de ingerir y ayudan a mantener  " +
                                                  "\n la hidratación. EJERCICIO: Durante la fase aguda se recomienda reposo absoluto, en recuperación se pueden realizar  " +
                                                  "\n caminatas cortas de 15 a 25 minutos al día, aumentando gradualmente la duración según la tolerancia del paciente,   " +
                                                  "\n además de ejercicios de movilidad como estiramientos suaves para mejorar la circulación y reducir la fatiga.        " +
                                                  "\n POSIBLE TRATAMIENTO: Incluye analgésicos como paracetamol o ibuprofeno para reducir el dolor y la fiebre, también   " +
                                                  "\n se recomienda el uso de compresas frías en la zona inflamada para aliviar la hinchazón. ALIMENTACIÓN: Se recomienda " +
                                                  "\n el consumo de yogur natural fuente de probióticos y calcio (30% del requerimiento diario por cada 100 g) que ayudan " +
                                                  "\n a restaurar la flora intestinal afectada por la fiebre, frutas ricas en vitamina C como fresas y pimientos que      " +
                                                  "\n contienen vitamina C (80% del requerimiento diario por cada 100 g) fortaleciendo el sistema inmune y acelerando la  " +
                                                  "\n recuperación, sopas y purés fáciles de consumir que ayudan a mantener la hidratación. Este es solo un Diagnóstico   " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello  " +
                                                  "\n la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del       " +
                                                  "\n Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita" +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACIÓN: Es fundamental para reducir la fiebre y prevenir la deshidratación causada por sudoración excesiva, se  " +
                                                  "\n recomienda consumir 2.5 a 3 litros de agua al día, además de infusiones de manzanilla y caldos ligeros para aliviar  " +
                                                  "\n molestias y fortalecer el sistema inmunológico, evitando bebidas con cafeína y alcohol que pueden irritar el sistema " +
                                                  "\n digestivo, también es recomendable el consumo de jugos naturales sin azúcar como jugo de naranja o zanahoria para    " +
                                                  "\n aportar vitaminas esenciales. EJERCICIO: Durante la fase aguda se recomienda reposo absoluto, en recuperación se     " + 
                                                  "\n pueden realizar caminatas cortas de 15 a 25 minutos al día, aumentando gradualmente la duración según la tolerancia  " +
                                                  "\n del paciente, además de ejercicios de movilidad como estiramientos suaves para mejorar la circulación y reducir la   " +
                                                  "\n fatiga. POSIBLE TRATAMIENTO: No existe un tratamiento específico, pero se recomienda reposo, hidratación y el uso de " +
                                                  "\n analgésicos como paracetamol para aliviar los síntomas, evitando el uso de aspirina y otros AINEs hasta descartar    " +
                                                  "\n dengue para reducir el riesgo de sangrado. ALIMENTACIÓN: Se recomienda el consumo de frutas ricas en antioxidantes   " +
                                                  "\n como arándanos y moras que contienen vitamina C (24% del requerimiento diario por cada 100 g) y antocianinas que     " +
                                                  "\n ayudan a reducir el estrés oxidativo, jengibre y cúrcuma con propiedades antiinflamatorias y magnesio (11% del       " +
                                                  "\n requerimiento diario por cada 100 g) que pueden aliviar los síntomas, pescados grasos como salmón y sardinas ricos   " +
                                                  "\n en Omega-3 (EPA y DHA, 90% del requerimiento diario por cada 100 g) que contribuyen a la salud celular y la cicatrización." +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un    " +
                                                  "\n Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud" +
                                                  "\n si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico. Angel L Montes" +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACIÓN: Es esencial para prevenir la deshidratación severa causada por diarrea y vómitos, se recomienda        " +
                                                  "\n consumir 3 a 3.5 litros de líquidos al día, incluyendo agua, sueros de rehidratación oral y caldos ligeros,         " +
                                                  "\n evitando bebidas azucaradas y con cafeína que pueden afectar la función digestiva, también es recomendable el       " +
                                                  "\n consumo de jugos naturales sin azúcar como jugo de manzana para mejorar la absorción de nutrientes. EJERCICIO:      " +
                                                  "\n Durante la fase aguda se recomienda reposo absoluto, en recuperación se pueden realizar caminatas cortas de 15      " +
                                                  "\n a 25 minutos al día, aumentando gradualmente la duración según la tolerancia del paciente, además de ejercicios     " +
                                                  "\n de movilidad como estiramientos suaves para mejorar la circulación y reducir la fatiga. POSIBLE TRATAMIENTO: No     " +
                                                  "\n existe un tratamiento específico, pero se recomienda reposo, hidratación y el uso de medicamentos como paracetamol  " +
                                                  "\n para aliviar la fiebre y el malestar, en casos graves puede ser necesaria la administración de líquidos intravenosos.    " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de plátanos ricos en potasio (12% del requerimiento diario por cada 100 g) que    " +
                                                  "\n ayudan a reponer electrolitos perdidos, arroz y pan tostado que contienen carbohidratos complejos (80% del requerimiento " +
                                                  "\n diario por cada 100 g) que ayudan a estabilizar el sistema digestivo, yogur natural fuente de probióticos y calcio (30%  " +
                                                  "\n del requerimiento diario por cada 100 g) que ayudan a restaurar la flora intestinal. Este es solo un Diagnóstico         " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la    " +
                                                  "\n enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer" +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida)" +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACIÓN: Es clave para ayudar al cuerpo a eliminar la bacteria y reducir la fiebre, se recomienda consumir         " +
                                                  "\n 2.5 a 3 litros de agua al día, además de caldos ligeros y jugos naturales sin azúcar, evitando bebidas con cafeína     " +
                                                  "\n y alcohol que pueden irritar el sistema digestivo, también es recomendable el consumo de infusiones de hierbas como    " +
                                                  "\n té de manzanilla o diente de león con propiedades antibacterianas. EJERCICIO: Durante la fase aguda se recomienda      " +
                                                  "\n reposo absoluto, en recuperación se pueden realizar caminatas cortas de 15 a 25 minutos al día, aumentando gradualmente" +
                                                  "\n la duración según la tolerancia del paciente, además de ejercicios de movilidad como estiramientos suaves para mejorar " +
                                                  "\n la circulación y reducir la fatiga. POSIBLE TRATAMIENTO: Incluye antibióticos como ampicilina o gentamicina,           " +
                                                  "\n administrados por vía oral o intravenosa dependiendo de la gravedad del caso. ALIMENTACIÓN: Se recomienda el consumo de   " +
                                                  "\n ajo y cebolla que contienen alicina y quercetina con efectos antimicrobianos naturales, frutas cítricas como naranjas y   " +
                                                  "\n kiwis ricas en vitamina C (80% del requerimiento diario por cada 100 g) que ayudan a reducir la inflamación, yogur natural" +
                                                  "\n fuente de probióticos y calcio (30% del requerimiento diario por cada 100 g) que ayudan a restaurar la flora intestinal   " +
                                                  "\n afectada por los antibióticos. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda" +
                                                  "\n hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además " +
                                                  "\n por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACIÓN: Es esencial para prevenir la deshidratación causada por diarrea severa, se recomienda consumir      " +
                                                  "\n 3 a 3.5 litros de líquidos al día, incluyendo agua, sueros de rehidratación oral y caldos ligeros, evitando      " +
                                                  "\n bebidas con cafeína y alcohol que pueden agravar la deshidratación, también es recomendable el consumo de jugos  " +
                                                  "\n naturales sin azúcar como jugo de manzana para mejorar la absorción de nutrientes. EJERCICIO: Durante la fase    " +
                                                  "\n aguda se recomienda reposo absoluto, en recuperación se pueden realizar caminatas cortas de 15 a 25 minutos al   " +
                                                  "\n día, aumentando gradualmente la duración según la tolerancia del paciente, además de ejercicios de movilidad como  " +
                                                  "\n estiramientos suaves para mejorar la circulación y reducir la fatiga. POSIBLE TRATAMIENTO: Incluye antibióticos    " +
                                                  "\n como ciprofloxacino o azitromicina, administrados por vía oral para reducir la duración de los síntomas, evitando  " +
                                                  "\n el uso de medicamentos antidiarreicos que pueden empeorar la infección. ALIMENTACIÓN: Se recomienda el consumo de  " +
                                                  "\n plátanos ricos en potasio (12% del requerimiento diario por cada 100 g) que ayudan a reponer electrolitos perdidos," +
                                                  "\n arroz y pan tostado que contienen carbohidratos complejos (80% del requerimiento diario por cada 100 g) que ayudan " +
                                                  "\n a estabilizar el sistema digestivo, yogur natural fuente de probióticos y calcio (30% del requerimiento diario por " +
                                                  "\n cada 100 g) que ayudan a restaurar la flora intestinal. Este es solo un Diagnóstico predeterminado lógico, haberlo " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en " +
                                                  "\n el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo " +
                                                  "\n se le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n HIDRATACIÓN: Es fundamental para mantener las vías respiratorias húmedas y facilitar la expulsión de mucosidad, se          " +
                                                  "\n recomienda consumir 2.5 a 3 litros de agua al día, distribuidos en pequeñas cantidades para evitar la fatiga respiratoria,  " +
                                                  "\n además de infusiones sin cafeína y caldos tibios para mejorar la hidratación sin irritar las vías respiratorias, evitando   " +
                                                  "\n bebidas con cafeína y alcohol que pueden aumentar la inflamación pulmonar. EJERCICIO: Se recomienda actividad física           " +
                                                  "\n moderada con ejercicios de bajo impacto como caminatas suaves de 30 a 45 minutos al día, además de ejercicios de respiración   " +
                                                  "\n profunda para mejorar la función pulmonar y reducir la sensación de falta de aire. POSIBLE TRATAMIENTO: Incluye broncodilatadores" +
                                                  "\n de acción prolongada como el tiotropio (Spiriva) y el salmeterol, corticosteroides inhalados como la fluticasona (Flixotide)     " +
                                                  "\n y en algunos casos oxigenoterapia para mejorar la respiración. ALIMENTACIÓN: Se recomienda el consumo de pescados grasos como    " +
                                                  "\n salmón y atún ricos en Omega-3 (EPA y DHA, 90% del requerimiento diario por cada 100 g) que ayudan a reducir la inflamación      " +
                                                  "\n de las vías respiratorias, frutas y verduras de colores vivos como arándanos y espinacas ricas en antioxidantes y vitamina C     " +
                                                  "\n (80% del requerimiento diario por cada 100 g) que fortalecen el sistema inmune, jengibre y cúrcuma con compuestos antiinflamatorios" +
                                                  "\n y magnesio (11% del requerimiento diario por cada 100 g) beneficiosos para las vías respiratorias. Este es solo un Diagnóstico  " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la           " +
                                                  "\n enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer     " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface  " +
                                                  "\n del todo se le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACIÓN: Es clave para ayudar al cuerpo a eliminar la bacteria y reducir la inflamación del tracto urinario, se   " +
                                                  "\n recomienda consumir 2 a 2.5 litros de agua al día, además de jugos naturales sin azúcar como jugo de arándano que     " +
                                                  "\n puede ayudar a prevenir infecciones urinarias recurrentes, evitando bebidas con cafeína y alcohol que pueden irritar  " +
                                                  "\n el tracto urinario y prolongar los síntomas, también es recomendable el consumo de infusiones de hierbas como té de   " +
                                                  "\n manzanilla o diente de león con propiedades antibacterianas. EJERCICIO: Se recomienda actividad física moderada con   " +
                                                  "\n ejercicios de bajo impacto como caminatas suaves de 30 a 40 minutos al día, evitando esfuerzos excesivos que puedan   " +
                                                  "\n agravar los síntomas, además de ejercicios de movilidad como estiramientos suaves para mejorar la circulación y reducir  " +
                                                  "\n la fatiga. POSIBLE TRATAMIENTO: Incluye antibióticos como la azitromicina en dosis única o la doxiciclina durante 7 días," +
                                                  "\n asegurando la eliminación completa de la bacteria. ALIMENTACIÓN: Se recomienda el consumo de ajo y cebolla que contienen " +
                                                  "\n alicina y quercetina con efectos antimicrobianos naturales, yogur natural fuente de probióticos y calcio (30% del        " +
                                                  "\n requerimiento diario por cada 100 g) que ayudan a restaurar la flora intestinal afectada por los antibióticos, frutas y  " +
                                                  "\n verduras ricas en vitamina C como fresas y pimientos que contienen vitamina C (80% del requerimiento diario por cada     " +
                                                  "\n 100 g) fortaleciendo el sistema inmune y acelerando la recuperación. Este es solo un Diagnóstico predeterminado lógico,  " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el      " +
                                                  "\n tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le    " +
                                                  "\n recomienda mucho consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN: Es fundamental para reducir la fiebre y prevenir la deshidratación causada por sudoración excesiva,  " +
                                                  "\n se recomienda consumir 3 a 3.5 litros de agua al día, además de infusiones de manzanilla y caldos ligeros para    " +
                                                  "\n aliviar molestias y fortalecer el sistema inmunológico, evitando bebidas con cafeína y alcohol que pueden irritar " +
                                                  "\n el sistema digestivo, también es recomendable el consumo de jugos naturales sin azúcar como jugo de naranja o     " +
                                                  "\n zanahoria para aportar vitaminas esenciales. EJERCICIO: Durante la fase aguda se recomienda reposo absoluto, en   " +
                                                  "\n recuperación se pueden realizar caminatas cortas de 15 a 25 minutos al día, aumentando gradualmente la duración   " +
                                                  "\n según la tolerancia del paciente, además de ejercicios de movilidad como estiramientos suaves para mejorar la     " +
                                                  "\n circulación y reducir la fatiga. POSIBLE TRATAMIENTO: Incluye antibióticos intravenosos como ceftriaxona o        " +
                                                  "\n vancomicina, además de corticosteroides para reducir la inflamación cerebral. ALIMENTACIÓN: Se recomienda el consumo  " +
                                                  "\n de frutas ricas en antioxidantes como arándanos y moras que contienen vitamina C (24% del requerimiento diario por    " +
                                                  "\n cada 100 g) y antocianinas que ayudan a reducir el estrés oxidativo, jengibre y cúrcuma con propiedades antiinflamatorias" +
                                                  "\n y magnesio (11% del requerimiento diario por cada 100 g) que pueden aliviar los síntomas, pescados grasos como salmón  " +
                                                  "\n y sardinas ricos en Omega-3 (EPA y DHA, 90% del requerimiento diario por cada 100 g) que contribuyen a la salud    " +
                                                  "\n celular y la cicatrización. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al  " +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello " +
                                                  "\n se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de " +
                                                  "\n su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho   " +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN: Es fundamental para mantener la función renal, reducir los efectos secundarios de los tratamientos y mejorar la  " +
                                                  "\n recuperación, se recomienda consumir 2.5 a 3.5 litros de agua al día, además de caldos ligeros, jugos naturales sin azúcar y  " +
                                                  "\n tés sin cafeína para mejorar la absorción de nutrientes y evitar la deshidratación causada por efectos secundarios como       " +
                                                  "\n vómitos o diarrea, evitando bebidas con cafeína y alcohol que pueden afectar la función hepática y renal. EJERCICIO: Se       " +
                                                  "\n recomienda actividad física adaptada a la condición del paciente y el tipo de cáncer, incluyendo caminatas suaves de 30 a 45  " +
                                                  "\n minutos al día, además de ejercicios de movilidad para mejorar la circulación y reducir la fatiga, en algunos casos se pueden " +
                                                  "\n incluir ejercicios aeróbicos de bajo impacto como natación o ciclismo suave para mejorar la capacidad pulmonar y cardiovascular." +
                                                  "\n POSIBLE TRATAMIENTO: Depende del tipo y estadio de la enfermedad, puede incluir quimioterapia, radioterapia, inmunoterapia    " +
                                                  "\n o cirugía, dependiendo de la evaluación médica, en algunos casos se recomienda tratamiento paliativo para mejorar la calidad  " +
                                                  "\n de vida. ALIMENTACIÓN: Se recomienda el consumo de frutas cítricas como naranjas y kiwis ricas en vitamina C (80% del         " +
                                                  "\n requerimiento diario por cada 100 g) que ayuda a reducir el estrés oxidativo, pescados grasos como salmón y atún ricos        " +
                                                  "\n en Omega-3 (EPA y DHA, 90% del requerimiento diario por cada 100 g) que contribuyen a la salud celular y la cicatrización,    " +
                                                  "\n verduras de hoja verde como espinacas y brócoli que contienen antioxidantes y vitamina E (70% del requerimiento diario por    " +
                                                  "\n cada 100 g) esenciales para la recuperación. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no      " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para " +
                                                  "\n ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su " +
                                                  "\n paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a  " +
                                                  "\n su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        
                        }
                }
            }
        if (EdadMasculino.equals("Adultez Mayor = 60 - 74 años")) {
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