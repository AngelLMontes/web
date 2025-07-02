import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Estudio4 implements ActionListener{
    
  
         private final JLabel label1;
         private JScrollPane scrollpane1;
         private JTextArea textarea1;
         private JFrame frame;
         private final String edadEsperada = "Juventud = 22-29 años";
         private String edadRecibida;
         
        public Estudio4(String nombrePaciente, String Sexo, String EdadMasculino,
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
                 if(EdadMasculino.equals("Juventud = 22-29 años")){
                        if(EstaturaMasculino.equals("0.90-1.35 m")){
                              if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza (gripe)." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos de tamaño regular,   " +
                                                  "\n para prevenir la deshidratación causada por fiebre y sudoración. También se recomienda el consumo de infusiones calientes" +
                                                  "\n como té de jengibre y agua con miel, que ayudan a aliviar la irritación de la garganta y fortalecen el sistema inmunológico." +
                                                  "\n EJERCICIO: La actividad física debe ser mínima mientras persistan los síntomas, priorizando el descanso absoluto y evitando " +
                                                  "\n esfuerzos que puedan agravar la fatiga. POSIBLE TRATAMIENTO: Se recomienda el uso de antivirales como oseltamivir y baloxavir," +
                                                  "\n que pueden reducir la duración y gravedad de la enfermedad si se administran en las primeras 48 horas. Marcas reconocidas     " +
                                                  "\n incluyen Tamiflu y Xofluza. En casos graves se pueden administrar antipiréticos como paracetamol para controlar la fiebre     " +
                                                  "\n y mejorar el bienestar del paciente. ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, " +
                                                  "\n esenciales para fortalecer el sistema inmunológico. Naranjas (por cada 100 gramos aproximadamente 53 mg de vitamina C, cubriendo" +
                                                  "\n el 59% de la ingesta diaria recomendada) y fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de " +
                                                  "\n la ingesta diaria recomendada). También se sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y ayuda a    " +
                                                  "\n aliviar el malestar general. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el  " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda" +
                                                  "\n hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Además, por su " +
                                                  "\n salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu " +
                                                  "\n visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos de tamaño regular,   " +
                                                  "\n para prevenir la deshidratación causada por fiebre intensa y dificultad respiratoria. También se recomienda el consumo de    " +
                                                  "\n infusiones calientes como té de eucalipto, que ayuda a despejar las vías respiratorias y mejorar la oxigenación.             " +
                                                  "\n EJERCICIO: La actividad física debe ser mínima mientras persistan los síntomas, priorizando el descanso absoluto y evitando  " +
                                                  "\n esfuerzos que puedan agravar la fatiga respiratoria. POSIBLE TRATAMIENTO: El tratamiento de la Neumonía se basa en el uso de " +
                                                  "\n antibióticos, siendo la amoxicilina y la azitromicina opciones altamente eficaces para eliminar la infección y reducir la    " +
                                                  "\n inflamación pulmonar. Marcas reconocidas incluyen Amoxil y Zithromax. En casos graves se pueden administrar terapias de      " +
                                                  "\n oxígeno para mejorar la oxigenación del paciente. ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes " +
                                                  "\n y vitamina C, esenciales para fortalecer el sistema inmunológico. Naranjas (por cada 100 gramos aproximadamente 53 mg de     " +
                                                  "\n vitamina C, cubriendo el 59% de la ingesta diaria recomendada) y fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C," +
                                                  "\n cubriendo el 65% de la ingesta diaria recomendada). También se sugiere el consumo de jengibre, que posee propiedades         " +
                                                  "\n antiinflamatorias y ayuda a aliviar la congestión pulmonar. Este es solo un diagnóstico predeterminado lógico, haberlo       " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean      " +
                                                  "\n completamente correctas. Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad      " +
                                                  "\n en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo,   " +
                                                  "\n se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos de tamaño regular,   " +
                                                  "\n para ayudar a mantener el equilibrio de glucosa en sangre y prevenir la deshidratación causada por la micción frecuente.     " +
                                                  "\n También se recomienda el consumo de infusiones sin azúcar y agua con limón, que contribuyen a la regulación metabólica.      " +
                                                  "\n EJERCICIO: La actividad física debe ser moderada y adaptada a la capacidad del paciente, priorizando ejercicios aeróbicos    " +
                                                  "\n como caminatas, ciclismo y natación durante al menos 30 a 60 minutos al día, lo que ayuda a mejorar la sensibilidad a la     " +
                                                  "\n insulina y controlar los niveles de glucosa. POSIBLE TRATAMIENTO: El tratamiento de la Diabetes varía según el tipo, pero    " +
                                                  "\n puede incluir insulina en el caso de diabetes tipo 1 y medicamentos orales como la metformina en el caso de diabetes tipo 2. " +
                                                  "\n Marcas reconocidas incluyen Humalog, Lantus y Glucophage. En algunos casos se pueden administrar inhibidores de SGLT2 para   " +
                                                  "\n mejorar la eliminación de glucosa a través de la orina. ALIMENTACION: Se recomienda el consumo de alimentos ricos en fibra   " +
                                                  "\n y proteínas, esenciales para estabilizar los niveles de glucosa en sangre. Avena (por cada 100 gramos aproximadamente 10     " +
                                                  "\n gramos de fibra, cubriendo el 40% de la ingesta diaria recomendada) y almendras (por cada 100 gramos aproximadamente 25 mg   " +
                                                  "\n de vitamina E, cubriendo el 166% de la ingesta diaria recomendada). También se sugiere el consumo de yogur natural, que      " +
                                                  "\n aporta probióticos beneficiosos para la salud intestinal y la regulación metabólica. Este es solo un diagnóstico predeterminado" +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus      " +
                                                  "\n respuestas sean completamente correctas. Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer      " +
                                                  "\n mayor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del diagnóstico no le       " +
                                                  "\n satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos de tamaño regular,      " +
                                                  "\n para ayudar a mantener la función pulmonar y reducir la inflamación. También se recomienda el consumo de líquidos con           " +
                                                  "\n propiedades antioxidantes como té verde y agua con limón, que pueden mejorar la salud respiratoria. EJERCICIO: La actividad     " +
                                                  "\n física debe ser moderada y adaptada a la capacidad pulmonar, priorizando ejercicios de bajo impacto como caminatas, natación    " +
                                                  "\n y ejercicios de respiración, que fortalecen los músculos respiratorios y mejoran la oxigenación. POSIBLE TRATAMIENTO: El        " +
                                                  "\n tratamiento del Asma se basa en el uso de broncodilatadores y corticosteroides inhalados, siendo el salbutamol y la fluticasona " +
                                                  "\n opciones altamente eficaces para mejorar la respiración y reducir la inflamación. Marcas reconocidas incluyen Ventolin y        " +
                                                  "\n Flixotide. En casos avanzados se pueden administrar terapias de oxígeno para mejorar la calidad de vida del paciente.           " +
                                                  "\n ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes y ácidos grasos Omega-3, esenciales para reducir     " +
                                                  "\n la inflamación pulmonar. Salmón (por cada 100 gramos aproximadamente 2.2 gramos de Omega-3) y espinacas (por cada 100 gramos    " +
                                                  "\n aproximadamente 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada). También se sugiere el consumo de cúrcuma," +
                                                  "\n que posee propiedades antiinflamatorias y ayuda a mejorar la función pulmonar. Este es solo un diagnóstico predeterminado lógico, " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean   " +
                                                  "\n completamente correctas. Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el     " +
                                                  "\n tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda" +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos de tamaño regular,   " +
                                                  "\n para ayudar a mantener la función inmunológica y prevenir la deshidratación causada por fiebre y efectos secundarios     " +
                                                  "\n del tratamiento. También se recomienda el consumo de líquidos con propiedades antioxidantes como té verde y agua con     " +
                                                  "\n limón, que fortalecen el sistema inmunológico. EJERCICIO: La actividad física debe ser moderada y adaptada a la capacidad" +
                                                  "\n del paciente, priorizando ejercicios de bajo impacto como caminatas, yoga y ejercicios de respiración, que mejoran la    " +
                                                  "\n circulación y reducen la fatiga. POSIBLE TRATAMIENTO: El tratamiento del VIH/SIDA se basa en el uso de antirretrovirales," +
                                                  "\n siendo el tenofovir, emtricitabina y dolutegravir opciones altamente eficaces para controlar la replicación del virus y  " +
                                                  "\n mejorar la calidad de vida. Marcas reconocidas incluyen Truvada, Tivicay y Biktarvy. En algunos casos se pueden administrar" +
                                                  "\n terapias inmunomoduladoras para mejorar la respuesta del organismo. ALIMENTACION: Se recomienda el consumo de alimentos    " +
                                                  "\n ricos en antioxidantes y proteínas, esenciales para fortalecer el sistema inmunológico y mantener la energía. Espinacas    " +
                                                  "\n (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada) y zanahorias  " +
                                                  "\n (por cada 100 gramos aproximadamente 835 µg de vitamina A, cubriendo el 93% de la ingesta diaria recomendada). También se  " +
                                                  "\n sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la salud intestinal y la recuperación. Este  " +
                                                  "\n es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad " +
                                                  "\n y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer más de un diagnóstico" +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta" +
                                                  "\n del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la      " +
                                                  "\n app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos de tamaño regular, " +
                                                  "\n para ayudar a la eliminación de toxinas y prevenir molestias urinarias. También se recomienda el consumo de líquidos con " +
                                                  "\n propiedades antimicrobianas como agua con limón y infusiones de jengibre, que fortalecen el sistema inmunológico.        " +
                                                  "\n EJERCICIO: La actividad física debe ser moderada y adaptada a su estado de salud, priorizando ejercicios aeróbicos de bajo" +
                                                  "\n impacto como caminatas o yoga durante al menos 30 a 60 minutos al día, lo que ayuda a fortalecer el sistema inmunológico  " +
                                                  "\n sin generar estrés excesivo en el cuerpo. POSIBLE TRATAMIENTO: El tratamiento de la Gonorrea se basa en el uso de antibióticos," +
                                                  "\n siendo la ceftriaxona y la azitromicina opciones altamente eficaces para eliminar la bacteria. La ceftriaxona se administra en " +
                                                  "\n una dosis única mientras que la azitromicina complementa el tratamiento para evitar resistencia bacteriana. Marcas reconocidas " +
                                                  "\n incluyen Rocephin y Zithromax. ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C,        " +
                                                  "\n esenciales para fortalecer el sistema inmunológico. Fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo " +
                                                  "\n el 65% de la ingesta diaria recomendada) y kiwis (por cada 100 gramos aproximadamente 92 mg de vitamina C, cubriendo el 102% de" +
                                                  "\n la ingesta diaria recomendada). También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la salud" +
                                                  "\n intestinal y la recuperación. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el  " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda" +
                                                  "\n hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Además, por su " +
                                                  "\n salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu " +
                                                  "\n visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes Genital." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos de tamaño regular,    " +
                                                  "\n para ayudar a mantener la función inmunológica y reducir la inflamación. También se recomienda el consumo de líquidos con     " +
                                                  "\n propiedades antivirales como té verde y agua con limón, que fortalecen el sistema inmunológico. EJERCICIO: La actividad       " +
                                                  "\n física debe ser moderada y adaptada a la capacidad del paciente, priorizando ejercicios de bajo impacto como caminatas,       " +
                                                  "\n yoga y ejercicios de respiración, que mejoran la circulación y reducen el estrés. POSIBLE TRATAMIENTO: El tratamiento         " +
                                                  "\n del Herpes Genital se basa en el uso de antivirales, siendo el aciclovir, valaciclovir y famciclovir opciones altamente       " +
                                                  "\n eficaces para reducir la duración y gravedad de los brotes. Marcas reconocidas incluyen Zovirax, Valtrex y Famvir.            " +
                                                  "\n En algunos casos se pueden administrar terapias inmunomoduladoras para mejorar la respuesta del organismo. ALIMENTACION:      " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunológico." +
                                                  "\n Fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada) y kiwis   " +
                                                  "\n (por cada 100 gramos aproximadamente 92 mg de vitamina C, cubriendo el 102% de la ingesta diaria recomendada). También se     " +
                                                  "\n sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la salud intestinal y la recuperación.          " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa          " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer          " +
                                                  "\n más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Además,           " +
                                                  "\n por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L          " +
                                                  "\n Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos de tamaño regular,    " +
                                                  "\n para ayudar a la eliminación de toxinas y prevenir complicaciones derivadas de la infección. También se recomienda el       " +
                                                  "\n consumo de líquidos con propiedades antimicrobianas como agua con limón y infusiones de jengibre, que fortalecen el         " +
                                                  "\n sistema inmunológico. EJERCICIO: La actividad física debe ser moderada y adaptada a su estado de salud, priorizando         " +
                                                  "\n ejercicios aeróbicos de bajo impacto como caminatas o yoga durante al menos 30 a 60 minutos al día, lo que ayuda a          " +
                                                  "\n fortalecer el sistema inmunológico sin generar estrés excesivo en el cuerpo. POSIBLE TRATAMIENTO: El tratamiento de         " +
                                                  "\n la Sífilis se basa en el uso de antibióticos, siendo la penicilina benzatina la opción más eficaz para eliminar la          " +
                                                  "\n bacteria. En casos de alergia a la penicilina se pueden utilizar alternativas como doxiciclina o azitromicina. Marcas       " +
                                                  "\n reconocidas incluyen Bicillin L-A y Doryx. ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes       " +
                                                  "\n y vitamina C, esenciales para fortalecer el sistema inmunológico. Fresas (por cada 100 gramos aproximadamente 59 mg de      " +
                                                  "\n vitamina C, cubriendo el 65% de la ingesta diaria recomendada) y kiwis (por cada 100 gramos aproximadamente 92 mg de        " +
                                                  "\n vitamina C, cubriendo el 102% de la ingesta diaria recomendada). También se sugiere el consumo de yogur natural, que        " +
                                                  "\n aporta probióticos beneficiosos para la salud intestinal y la recuperación. Este es solo un diagnóstico predeterminado      " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus     " +
                                                  "\n respuestas sean completamente correctas. Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer     " +
                                                  "\n mayor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del diagnóstico no le      " +
                                                  "\n satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos de tamaño regular,       " +
                                                  "\n para prevenir la deshidratación causada por fiebre intensa y dificultad respiratoria. También se recomienda el consumo de        " +
                                                  "\n infusiones calientes como té de eucalipto, que ayuda a despejar las vías respiratorias y mejorar la oxigenación. EJERCICIO:      " +
                                                  "\n La actividad física debe ser mínima mientras persistan los síntomas, priorizando el descanso absoluto y evitando esfuerzos       " +
                                                  "\n que puedan agravar la fatiga respiratoria. POSIBLE TRATAMIENTO: El tratamiento de la Tuberculosis se basa en el uso de antibióticos" +
                                                  "\n de primera línea, siendo la isoniazida, rifampicina, pirazinamida y etambutol opciones altamente eficaces para eliminar la       " +
                                                  "\n infección y reducir la inflamación pulmonar. Marcas reconocidas incluyen Rifadin y Myambutol. En casos graves se pueden          " +
                                                  "\n administrar terapias de oxígeno para mejorar la oxigenación del paciente. ALIMENTACION: Se recomienda el consumo de alimentos    " +
                                                  "\n ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunológico. Naranjas (por cada 100 gramos           " +
                                                  "\n aproximadamente 53 mg de vitamina C, cubriendo el 59% de la ingesta diaria recomendada) y fresas (por cada 100 gramos            " +
                                                  "\n aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada). También se sugiere el consumo           " +
                                                  "\n de jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar la congestión pulmonar. Este es solo un diagnóstico       " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la            " +
                                                  "\n enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer más de un diagnóstico de Mi Vida         " +
                                                  "\n para establecer mayor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del diagnóstico " +
                                                  "\n no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera       " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos de tamaño regular,   " +
                                                  "\n para ayudar a reducir la inflamación y mantener la movilidad articular. También se recomienda el consumo de líquidos con     " +
                                                  "\n propiedades antiinflamatorias como té verde y agua con cúrcuma, que fortalecen el sistema inmunológico. EJERCICIO: La        " +
                                                  "\n actividad física debe ser moderada y adaptada a la capacidad del paciente, priorizando ejercicios de bajo impacto como       " +
                                                  "\n natación, yoga y ejercicios de movilidad articular, que mejoran la flexibilidad y reducen el dolor. POSIBLE TRATAMIENTO:     " +
                                                  "\n El tratamiento de la Artritis se basa en el uso de antiinflamatorios no esteroides (AINEs) y fármacos modificadores de la    " +
                                                  "\n enfermedad (FAMEs), siendo el ibuprofeno, naproxeno, metotrexato y adalimumab opciones altamente eficaces para reducir la    " +
                                                  "\n inflamación y mejorar la calidad de vida. Marcas reconocidas incluyen Advil, Naprosyn, Trexall y Humira. En algunos casos    " +
                                                  "\n se pueden administrar terapias biológicas para mejorar la respuesta del organismo. ALIMENTACION: Se recomienda el consumo    " +
                                                  "\n de alimentos ricos en antioxidantes y ácidos grasos Omega-3, esenciales para reducir la inflamación articular. Salmón (por   " +
                                                  "\n cada 100 gramos aproximadamente 2.2 gramos de Omega-3) y espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C, " +
                                                  "\n cubriendo el 31% de la ingesta diaria recomendada). También se sugiere el consumo de cúrcuma, que posee propiedades          " +
                                                  "\n antiinflamatorias y ayuda a mejorar la función articular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente     " +
                                                  "\n correctas. Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento    " +
                                                  "\n adecuado de su paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda         " +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos de tamaño regular,    " +
                                                  "\n para ayudar a mantener la función pulmonar y reducir la inflamación. También se recomienda el consumo de líquidos con     " +
                                                  "\n propiedades antimicrobianas como té verde y agua con miel, que pueden aliviar la irritación de la garganta y mejorar      " +
                                                  "\n la salud respiratoria. EJERCICIO: La actividad física debe ser mínima mientras persistan los síntomas, priorizando el     " +
                                                  "\n descanso absoluto y evitando esfuerzos que puedan agravar la tos y la fatiga respiratoria. POSIBLE TRATAMIENTO: El        " +
                                                  "\n tratamiento de la Tosferina se basa en el uso de antibióticos, siendo la azitromicina, claritromicina y eritromicina      " +
                                                  "\n opciones altamente eficaces para reducir la duración y gravedad de la enfermedad. Marcas reconocidas incluyen Zithromax,  " +
                                                  "\n Biaxin y Erythrocin. En casos graves se pueden administrar terapias de oxígeno para mejorar la oxigenación del paciente.  " +
                                                  "\n ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el    " +
                                                  "\n sistema inmunológico. Naranjas (por cada 100 gramos aproximadamente 53 mg de vitamina C, cubriendo el 59% de la ingesta   " +
                                                  "\n diaria recomendada) y fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta     " +
                                                  "\n diaria recomendada). También se sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar " +
                                                  "\n la congestión pulmonar. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se    " +
                                                  "\n recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente." +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.      " +
                                                  "\n Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos de tamaño regular,    " +
                                                  "\n para ayudar a mantener la función inmunológica y reducir la inflamación. También se recomienda el consumo de líquidos con     " +
                                                  "\n propiedades antiinflamatorias como té verde y agua con miel, que pueden aliviar la irritación de la garganta y mejorar la     " +
                                                  "\n salud general. EJERCICIO: La actividad física debe ser mínima mientras persistan los síntomas, priorizando el descanso        " +
                                                  "\n absoluto y evitando esfuerzos que puedan agravar la fatiga y el malestar. POSIBLE TRATAMIENTO: El tratamiento de las Paperas  " +
                                                  "\n es principalmente sintomático, ya que no existe un antiviral específico para la enfermedad. Se recomienda el uso de analgésicos" +
                                                  "\n como paracetamol o ibuprofeno para reducir la fiebre y el dolor. Marcas reconocidas incluyen Tylenol y Advil. En casos de     " +
                                                  "\n inflamación severa se pueden aplicar compresas frías o calientes en la zona afectada para aliviar el dolor. ALIMENTACION:     " +
                                                  "\n Se recomienda el consumo de alimentos suaves y ricos en antioxidantes, esenciales para fortalecer el sistema inmunológico.    " +
                                                  "\n Plátanos (por cada 100 gramos aproximadamente 358 mg de potasio, cubriendo el 10% de la ingesta diaria recomendada) y arroz   " +
                                                  "\n blanco, que es fácil de digerir y ayuda a estabilizar el sistema digestivo. También se sugiere el consumo de yogur natural,   " +
                                                  "\n que aporta probióticos beneficiosos para la salud intestinal y la recuperación. Este es solo un diagnóstico predeterminado    " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus       " +
                                                  "\n respuestas sean completamente correctas. Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer       " +
                                                  "\n mayor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del diagnóstico no le        " +
                                                  "\n satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos de tamaño regular,     " +
                                                  "\n para prevenir la deshidratación causada por fiebre y otros síntomas. También se recomienda el consumo de líquidos con      " +
                                                  "\n electrolitos naturales como agua de coco, que ayuda a mantener el equilibrio de minerales en el cuerpo. EJERCICIO: La      " +
                                                  "\n actividad física debe ser mínima mientras persistan los síntomas, priorizando el descanso absoluto y ejercicios de         " +
                                                  "\n respiración para mejorar la oxigenación. POSIBLE TRATAMIENTO: No existe un antiviral específico para el Zika, por lo       " +
                                                  "\n que el tratamiento se basa en el manejo de síntomas. Se recomienda el uso de analgésicos como paracetamol para reducir     " +
                                                  "\n la fiebre y el dolor muscular. Es importante evitar el uso de aspirina y otros antiinflamatorios no esteroides hasta       " +
                                                  "\n descartar dengue para reducir el riesgo de sangrado. ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes" +
                                                  "\n y vitamina C, esenciales para fortalecer el sistema inmunológico. Naranjas y fresas son opciones recomendadas. También se      " +
                                                  "\n sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar el malestar general. Este es solo    " +
                                                  "\n un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por   " +
                                                  "\n ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer más de un diagnóstico de Mi Vida" +
                                                  "\n para establecer mayor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del diagnóstico" +
                                                  "\n no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos de tamaño regular,     " +
                                                  "\n para prevenir la deshidratación causada por la diarrea y los vómitos. También se recomienda el consumo de soluciones de        " +
                                                  "\n rehidratación oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos perdidos y mejorar la recuperación.        " +
                                                  "\n EJERCICIO: La actividad física debe ser mínima mientras persistan los síntomas, priorizando el descanso absoluto y evitando    " +
                                                  "\n esfuerzos que puedan agravar la pérdida de líquidos. POSIBLE TRATAMIENTO: No existe un antiviral específico para el Rotavirus, " +
                                                  "\n por lo que el tratamiento se basa en la rehidratación constante. En casos graves puede requerirse administración de líquidos   " +
                                                  "\n intravenosos en un hospital para evitar complicaciones. Marcas reconocidas incluyen Pedialyte y Enfalyte, recomendadas para la " +
                                                  "\n rehidratación efectiva. ALIMENTACION: Se recomienda el consumo de alimentos suaves y ricos en electrolitos, esenciales para    " +
                                                  "\n fortalecer el sistema digestivo y prevenir la deshidratación. Plátanos y arroz blanco son opciones recomendadas. También se    " +
                                                  "\n sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la salud intestinal y la recuperación. Este es   " +
                                                  "\n solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que  " +
                                                  "\n por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer más de un diagnóstico de   " +
                                                  "\n Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del   " +
                                                  "\n diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app Mi Vida  " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos de tamaño regular,         " +
                                                  "\n para ayudar a la eliminación de toxinas y prevenir complicaciones derivadas de la infección. También se recomienda el            " +
                                                  "\n consumo de líquidos con propiedades antimicrobianas como agua con limón y infusiones de jengibre, que fortalecen el sistema      " +
                                                  "\n inmunológico. EJERCICIO: La actividad física debe ser mínima mientras persistan los síntomas, priorizando el descanso absoluto   " +
                                                  "\n y evitando esfuerzos que puedan debilitar el organismo. POSIBLE TRATAMIENTO: El tratamiento de la Listeriosis se basa en el uso  " +
                                                  "\n de antibióticos, siendo la ampicilina y la gentamicina opciones altamente eficaces para eliminar la bacteria. La ampicilina impide" +
                                                  "\n la replicación de la bacteria mientras que la gentamicina bloquea la producción de proteínas esenciales para su supervivencia.   " +
                                                  "\n Marcas reconocidas incluyen Ampex y Garamycin. En casos graves se pueden administrar corticoides para reducir la inflamación y   " +
                                                  "\n mejorar la respuesta del organismo. ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C,     " +
                                                  "\n esenciales para fortalecer el sistema inmunológico. Espinacas y zanahorias son opciones recomendadas. También se sugiere el      " +
                                                  "\n consumo de yogur natural, que aporta probióticos beneficiosos para la salud intestinal y la recuperación. Este es solo un        " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello   " +
                                                  "\n la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer más de un diagnóstico de Mi Vida para " +
                                                  "\n establecer mayor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del diagnóstico no le" +
                                                  "\n satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos de tamaño regular,    " +
                                                  "\n para prevenir la deshidratación causada por la diarrea y la fiebre. También se recomienda el consumo de soluciones de         " +
                                                  "\n rehidratación oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos perdidos y mejorar la recuperación.       " +
                                                  "\n EJERCICIO: La actividad física debe ser mínima mientras persistan los síntomas, priorizando el descanso absoluto y evitando   " +
                                                  "\n esfuerzos que puedan agravar la pérdida de líquidos. POSIBLE TRATAMIENTO: El tratamiento de la Shigelosis se basa en la       " +
                                                  "\n rehidratación constante, y en casos graves puede requerirse administración de líquidos intravenosos en un hospital para       " +
                                                  "\n evitar complicaciones. En infecciones severas se pueden utilizar antibióticos como ciprofloxacino y azitromicina, que ayudan  " +
                                                  "\n a reducir la duración de la enfermedad. Marcas reconocidas incluyen Cipro y Zithromax. ALIMENTACION: Se recomienda el consumo " +
                                                  "\n de alimentos suaves y ricos en electrolitos, esenciales para fortalecer el sistema digestivo y prevenir la deshidratación.    " +
                                                  "\n Plátanos y arroz blanco son opciones recomendadas. También se sugiere el consumo de yogur natural, que aporta probióticos     " +
                                                  "\n beneficiosos para la salud intestinal y la recuperación. Este es solo un diagnóstico predeterminado lógico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente    " +
                                                  "\n correctas. Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento   " +
                                                  "\n adecuado de su paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar" +
                                                  "\n a su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad Pulmonar Obstructiva Crónica (EPOC). " +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos de tamaño regular,      " +
                                                  "\n para ayudar a mantener la función pulmonar y reducir la inflamación. También se recomienda el consumo de líquidos con         " +
                                                  "\n propiedades antioxidantes como té verde y agua con limón, que pueden mejorar la salud respiratoria. EJERCICIO: La actividad   " +
                                                  "\n física debe ser moderada y adaptada a la capacidad pulmonar, priorizando ejercicios de bajo impacto como caminatas, natación  " +
                                                  "\n y ejercicios de respiración, que fortalecen los músculos respiratorios y mejoran la oxigenación. POSIBLE TRATAMIENTO:         " +
                                                  "\n El tratamiento de la EPOC se basa en el uso de broncodilatadores y corticosteroides inhalados, siendo el salbutamol y la      " +
                                                  "\n fluticasona opciones altamente eficaces para mejorar la respiración y reducir la inflamación. Marcas reconocidas incluyen     " +
                                                  "\n Ventolin y Flixotide. En casos avanzados se pueden administrar terapias de oxígeno para mejorar la calidad de vida del paciente." +
                                                  "\n ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes y ácidos grasos Omega-3, esenciales para reducir la  " +
                                                  "\n inflamación pulmonar. Salmón y espinacas son opciones recomendadas. También se sugiere el consumo de cúrcuma, que posee propiedades" +
                                                  "\n antiinflamatorias y ayuda a mejorar la función pulmonar. Este es solo un diagnóstico predeterminado lógico, haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas." +
                                                  "\n Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su " +
                                                  "\n paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.  " +
                                                  "\n Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos de tamaño regular,           " +
                                                  "\n para ayudar a la eliminación de toxinas y prevenir molestias urinarias. También se recomienda el consumo de líquidos con           " +
                                                  "\n propiedades antimicrobianas como agua con limón y infusiones de jengibre, que fortalecen el sistema inmunológico. EJERCICIO:       " +
                                                  "\n La actividad física debe ser moderada y adaptada a su estado de salud, priorizando ejercicios aeróbicos de bajo impacto como       " +
                                                  "\n caminatas o yoga durante al menos 30 a 60 minutos al día, lo que ayuda a fortalecer el sistema inmunológico sin generar estrés     " +
                                                  "\n excesivo en el cuerpo. POSIBLE TRATAMIENTO: El tratamiento de la Clamidia se basa en el uso de antibióticos, siendo la azitromicina" +
                                                  "\n y la doxiciclina opciones altamente eficaces para eliminar la bacteria. La azitromicina se administra en una dosis única mientras  " +
                                                  "\n que la doxiciclina se toma durante varios días. Marcas reconocidas incluyen Zithromax y Doryx. ALIMENTACION: Se recomienda el      " +
                                                  "\n consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunológico. Fresas y kiwis       " +
                                                  "\n son opciones recomendadas. También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la salud       " +
                                                  "\n intestinal y la recuperación. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que       " +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se          " +
                                                  "\n recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente.       " +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L       " +
                                                  "\n Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis Bacteriana." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos de tamaño regular,     " +
                                                  "\n para prevenir la deshidratación causada por fiebre intensa y la inflamación de las meninges. También se recomienda el consumo  " +
                                                  "\n de soluciones de rehidratación oral como Pedialyte, que ayudan a reponer los electrolitos perdidos y mejorar la recuperación.  " +
                                                  "\n EJERCICIO: La actividad física debe ser mínima mientras persistan los síntomas, priorizando el descanso absoluto y evitando    " +
                                                  "\n esfuerzos que puedan agravar la inflamación cerebral. POSIBLE TRATAMIENTO: El tratamiento de la Meningitis Bacteriana se basa  " +
                                                  "\n en el uso de antibióticos intravenosos, siendo la ceftriaxona y la vancomicina opciones altamente eficaces para eliminar la    " +
                                                  "\n infección y reducir la inflamación. Marcas reconocidas incluyen Rocephin y Vancocin. En casos graves se pueden administrar     " +
                                                  "\n corticoides para reducir la inflamación y mejorar la respuesta del organismo. ALIMENTACION: Se recomienda el consumo de        " +
                                                  "\n alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunológico. Espinacas y zanahorias      " +
                                                  "\n son opciones recomendadas. También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la salud   " +
                                                  "\n intestinal y la recuperación. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que   " +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se      " +
                                                  "\n recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente.   " +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L   " +
                                                  "\n Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos de tamaño regular,        " +
                                                  "\n para ayudar a mantener la función celular y reducir los efectos secundarios del tratamiento. También se recomienda el         " +
                                                  "\n consumo de líquidos con propiedades antioxidantes como té verde y agua con limón, que fortalecen el sistema inmunológico.     " +
                                                  "\n EJERCICIO: La actividad física debe ser moderada y adaptada a la capacidad del paciente, priorizando ejercicios de bajo       " +
                                                  "\n impacto como caminatas, yoga y ejercicios de respiración, que mejoran la circulación y reducen la fatiga.                     " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento del Cáncer varía según el tipo y la etapa de la enfermedad, pero puede incluir quimioterapia," +
                                                  "\n radioterapia, cirugía y terapias dirigidas. Marcas reconocidas incluyen Adriamycin y Taxol. En algunos casos se pueden administrar" +
                                                  "\n inmunoterapias para mejorar la respuesta del organismo. ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes" +
                                                  "\n y proteínas, esenciales para fortalecer el sistema inmunológico y mantener la energía. Espinacas y zanahorias son opciones      " +
                                                  "\n recomendadas. También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la salud intestinal      " +
                                                  "\n y la recuperación. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente   " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer  " +
                                                  "\n más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Además, por su salud," +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita" +
                                                  "\n a la app Mi Vida y espera que te mejores.");
                            }
                            
                        }
                        if(EstaturaMasculino.equals("1.45-1.70 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos de tamaño regular,       " +
                                                  "\n para prevenir la deshidratación causada por fiebre y sudoración. También se recomienda el consumo de infusiones calientes    " +
                                                  "\n como té de jengibre y agua con miel, que ayudan a aliviar la irritación de la garganta y fortalecen el sistema inmunológico. " +
                                                  "\n EJERCICIO: La actividad física debe ser mínima mientras persistan los síntomas, priorizando el descanso absoluto y evitando  " +
                                                  "\n esfuerzos que puedan agravar la fatiga. POSIBLE TRATAMIENTO: Se recomienda el uso de antivirales como oseltamivir y baloxavir," +
                                                  "\n que pueden reducir la duración y gravedad de la enfermedad si se administran en las primeras 48 horas. Marcas reconocidas     " +
                                                  "\n incluyen Tamiflu y Xofluza. En casos graves se pueden administrar antipiréticos como paracetamol para controlar la fiebre y   " + 
                                                  "\n mejorar el bienestar del paciente. ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C,   " +
                                                  "\n esenciales para fortalecer el sistema inmunológico. Naranjas y fresas son opciones recomendadas. También se sugiere el consumo" +
                                                  "\n de jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar el malestar general. Este es solo un diagnóstico       " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad" +
                                                  "\n y sus respuestas sean completamente correctas. Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer " +
                                                  "\n mayor seguridad en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface" +
                                                  "\n del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos de tamaño regular,      " +
                                                  "\n para prevenir la deshidratación causada por fiebre intensa y dificultad respiratoria. También se recomienda el consumo de       " +
                                                  "\n infusiones calientes como té de eucalipto, que ayuda a despejar las vías respiratorias y mejorar la oxigenación. EJERCICIO:     " +
                                                  "\n La actividad física debe ser mínima mientras persistan los síntomas, priorizando el descanso absoluto y evitando esfuerzos      " +
                                                  "\n que puedan agravar la fatiga respiratoria. POSIBLE TRATAMIENTO: El tratamiento de la Neumonía se basa en el uso de antibióticos," +
                                                  "\n siendo la amoxicilina y la azitromicina opciones altamente eficaces para eliminar la infección y reducir la inflamación pulmonar." +
                                                  "\n Marcas reconocidas incluyen Amoxil y Zithromax. En casos graves se pueden administrar terapias de oxígeno para mejorar la       " +
                                                  "\n oxigenación del paciente. ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales   " +
                                                  "\n para fortalecer el sistema inmunológico. Naranjas y fresas son opciones recomendadas. También se sugiere el consumo de jengibre," +
                                                  "\n que posee propiedades antiinflamatorias y ayuda a aliviar la congestión pulmonar. Este es solo un diagnóstico predeterminado    " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas" +
                                                  "\n sean completamente correctas. Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad    " +
                                                  "\n en el tratamiento adecuado de su paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se   " +
                                                  "\n recomienda consultar a su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos de tamaño regular,     " +
                                                  "\n para ayudar a mantener el equilibrio de glucosa en sangre y prevenir la deshidratación causada por la micción frecuente.       " +
                                                  "\n También se recomienda el consumo de infusiones sin azúcar y agua con limón, que contribuyen a la regulación metabólica.        " +
                                                  "\n EJERCICIO: La actividad física debe ser moderada y adaptada a la capacidad del paciente, priorizando ejercicios aeróbicos      " +
                                                  "\n como caminatas, ciclismo y natación durante al menos 30 a 60 minutos al día, lo que ayuda a mejorar la sensibilidad a la       " +
                                                  "\n insulina y controlar los niveles de glucosa. POSIBLE TRATAMIENTO: El tratamiento de la Diabetes varía según el tipo, pero      " +
                                                  "\n puede incluir insulina en el caso de diabetes tipo 1 y medicamentos orales como la metformina en el caso de diabetes tipo 2.   " +
                                                  "\n Marcas reconocidas incluyen Humalog, Lantus y Glucophage. En algunos casos se pueden administrar inhibidores de SGLT2 para     " +
                                                  "\n mejorar la eliminación de glucosa a través de la orina. ALIMENTACION: Se recomienda el consumo de alimentos ricos en fibra     " +
                                                  "\n y proteínas, esenciales para estabilizar los niveles de glucosa en sangre. Avena y almendras son opciones recomendadas.        " +
                                                  "\n También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la salud intestinal y la regulación   " +
                                                  "\n metabólica. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga   " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer más   " +
                                                  "\n de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Además, por su salud,  " +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita" +
                                                  "\n a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos de tamaño regular,       " +
                                                  "\n para ayudar a mantener la función pulmonar y reducir la inflamación. También se recomienda el consumo de líquidos con            " +
                                                  "\n propiedades antioxidantes como té verde y agua con limón, que pueden mejorar la salud respiratoria. EJERCICIO: La actividad      " +
                                                  "\n física debe ser moderada y adaptada a la capacidad pulmonar, priorizando ejercicios de bajo impacto como caminatas, natación     " +
                                                  "\n y ejercicios de respiración, que fortalecen los músculos respiratorios y mejoran la oxigenación. POSIBLE TRATAMIENTO: El         " +
                                                  "\n tratamiento del Asma se basa en el uso de broncodilatadores y corticosteroides inhalados, siendo el salbutamol y la fluticasona  " +
                                                  "\n opciones altamente eficaces para mejorar la respiración y reducir la inflamación. Marcas reconocidas incluyen Ventolin y Flixotide." +
                                                  "\n En casos avanzados se pueden administrar terapias de oxígeno para mejorar la calidad de vida del paciente. ALIMENTACION: Se      " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y ácidos grasos Omega-3, esenciales para reducir la inflamación pulmonar." +
                                                  "\n Salmón y espinacas son opciones recomendadas. También se sugiere el consumo de cúrcuma, que posee propiedades antiinflamatorias  " +
                                                  "\n y ayuda a mejorar la función pulmonar. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%" +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se    " +
                                                  "\n recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente.     " +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L     " +
                                                  "\n Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos de tamaño regular,     " +
                                                  "\n para ayudar a mantener la función inmunológica y prevenir la deshidratación causada por fiebre y efectos secundarios       " +
                                                  "\n del tratamiento. También se recomienda el consumo de líquidos con propiedades antioxidantes como té verde y agua con       " +
                                                  "\n limón, que fortalecen el sistema inmunológico. EJERCICIO: La actividad física debe ser moderada y adaptada a la capacidad  " +
                                                  "\n del paciente, priorizando ejercicios de bajo impacto como caminatas, yoga y ejercicios de respiración, que mejoran la      " +
                                                  "\n circulación y reducen la fatiga. POSIBLE TRATAMIENTO: El tratamiento del VIH/SIDA se basa en el uso de antirretrovirales,  " +
                                                  "\n siendo el tenofovir, emtricitabina y dolutegravir opciones altamente eficaces para controlar la replicación del virus y    " +
                                                  "\n mejorar la calidad de vida. Marcas reconocidas incluyen Truvada, Tivicay y Biktarvy. En algunos casos se pueden administrar" +
                                                  "\n terapias inmunomoduladoras para mejorar la respuesta del organismo. ALIMENTACION: Se recomienda el consumo de alimentos    " +
                                                  "\n ricos en antioxidantes y proteínas, esenciales para fortalecer el sistema inmunológico y mantener la energía. Espinacas    " +
                                                  "\n y zanahorias son opciones recomendadas. También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos" +
                                                  "\n para la salud intestinal y la recuperación. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza" +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas.   " +
                                                  "\n Para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado  " +
                                                  "\n de su paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a  " +
                                                  "\n su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos de tamaño regular,  " +
                                                  "\n para ayudar a la eliminación de toxinas y prevenir molestias urinarias. También se recomienda el consumo de líquidos con  " +
                                                  "\n propiedades antimicrobianas como agua con limón y infusiones de jengibre, que fortalecen el sistema inmunológico.         " +
                                                  "\n EJERCICIO: La actividad física debe ser moderada y adaptada a su estado de salud, priorizando ejercicios aeróbicos        " +
                                                  "\n de bajo impacto como caminatas o yoga durante al menos 30 a 60 minutos al día, lo que ayuda a fortalecer el sistema       " +
                                                  "\n inmunológico sin generar estrés excesivo en el cuerpo. POSIBLE TRATAMIENTO: El tratamiento de la Gonorrea se basa en      " +
                                                  "\n el uso de antibióticos, siendo la ceftriaxona y la azitromicina opciones altamente eficaces para eliminar la bacteria.    " +
                                                  "\n La ceftriaxona se administra en una dosis única mientras que la azitromicina complementa el tratamiento para evitar       " +
                                                  "\n resistencia bacteriana. Marcas reconocidas incluyen Rocephin y Zithromax. ALIMENTACION: Se recomienda el consumo de       " +
                                                  "\n alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunológico. Fresas y kiwis son     " +
                                                  "\n opciones recomendadas. También se sugiere el consumo de yogur natural, que aporta probióticos beneficiosos para la salud  " +
                                                  "\n intestinal y la recuperación. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%  " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello" +
                                                  "\n se recomienda hacer más de un diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su     " +
                                                  "\n paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a       " +
                                                  "\n su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer HERPES GENITAL." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir entre 2 y 2.5 litros de agua al día (aproximadamente ocho a diez vasos de agua de tamaño regular)" +
                                                  "\n para mantener el sistema inmunológico fuerte y favorecer la recuperación. EJERCICIO: Se sugiere actividad física moderada, evitando  " +
                                                  "\n el sobreesfuerzo y el estrés, ya que estos pueden desencadenar brotes. Ejercicios de bajo impacto como caminatas, yoga y natación    " +
                                                  "\n pueden ser beneficiosos. POSIBLE TRATAMIENTO: No existe una cura definitiva, pero los antivirales como aciclovir, valaciclovir y     " +
                                                  "\n famciclovir ayudan a reducir los síntomas y la frecuencia de los brotes. Algunas marcas comerciales incluyen Zovirax (aciclovir),    " +
                                                  "\n Valtrex (valaciclovir) y Famvir (famciclovir). También pueden utilizarse cremas tópicas con antivirales para aliviar el malestar.    " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación,       " +
                                                  "\n tales como frutas cítricas como naranjas, limones y toronjas, que contienen aproximadamente 60 mg de vitamina C por cada 100 gramos, " +
                                                  "\n cubriendo el 100% de la ingesta diaria recomendada para un adulto. El ajo, rico en alicina, posee propiedades antivirales y          " +
                                                  "\n antiinflamatorias. El jengibre tiene efectos antiinflamatorios que pueden ayudar a reducir el malestar. El yogur natural, fuente     " +
                                                  "\n de probióticos, contribuye a la salud intestinal y fortalece la respuesta inmune. Las verduras de hoja verde como espinacas,         " +
                                                  "\n acelgas y kale son ricas en antioxidantes y vitamina E, favoreciendo la regeneración celular. Este es solo un diagnóstico            " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas           " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer        " +
                                                  "\n el tratamiento adecuado. Por tu salud, si la respuesta del diagnóstico no te satisface del todo, se recomienda mucho acudir a        " +
                                                  "\n un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer SÍFILIS." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 litros de agua al día para favorecer la eliminación de toxinas y fortalecer   " +
                                                  "\n el sistema inmunológico. EJERCICIO: Se sugiere actividad física moderada, evitando el sobreesfuerzo y priorizando ejercicios   " +
                                                  "\n de bajo impacto como caminatas y natación, ya que el estrés físico puede afectar la recuperación. POSIBLE TRATAMIENTO: La      " +
                                                  "\n sífilis se trata con antibióticos, siendo la penicilina G benzatina el medicamento de primera elección. En casos de alergia    " +
                                                  "\n a la penicilina, se pueden utilizar alternativas como doxiciclina o ceftriaxona. Algunas marcas comerciales incluyen Benzetacil" +
                                                  "\n (penicilina G benzatina), Doxiclat (doxiciclina) y Rocephin (ceftriaxona). ALIMENTACIÓN: Se recomienda el consumo de alimentos " +
                                                  "\n ricos en antioxidantes y nutrientes esenciales para la regeneración celular y el fortalecimiento del sistema inmune, tales como" +
                                                  "\n frutas cítricas como naranjas y limones, que contienen aproximadamente 60 mg de vitamina C por cada 100 gramos, cubriendo el   " +
                                                  "\n 100% de la ingesta diaria recomendada para un adulto. El ajo, rico en alicina, posee propiedades antimicrobianas. El jengibre  " +
                                                  "\n tiene efectos antiinflamatorios. El yogur natural, fuente de probióticos, contribuye a la salud intestinal y fortalece la      " +
                                                  "\n respuesta inmune. Las verduras de hoja verde como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo    " +
                                                  "\n la regeneración celular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el     " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de    " +
                                                  "\n un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagnóstico  " +
                                                  "\n no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida)   " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer TUBERCULOSIS (TB)." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 3 litros de agua al día para mantener las vías respiratorias hidratadas y     " +
                                                  "\n facilitar la eliminación de secreciones. EJERCICIO: Se sugiere actividad física ligera como caminatas y ejercicios de      " +
                                                  "\n respiración para fortalecer los pulmones sin generar fatiga excesiva. POSIBLE TRATAMIENTO: La tuberculosis se trata con    " +
                                                  "\n una combinación de antibióticos administrados por un período prolongado. Los medicamentos más utilizados incluyen isoniacida," +
                                                  "\n rifampicina, etambutol y pirazinamida. Algunas marcas comerciales incluyen Rifadin (rifampicina), Myambutol (etambutol)    " +
                                                  "\n y Pyrazinamide (pirazinamida). ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en nutrientes esenciales para     " +
                                                  "\n fortalecer el sistema inmunológico y mejorar la función pulmonar, tales como frutas cítricas como toronjas y kiwis, que    " +
                                                  "\n contienen aproximadamente 70 mg de vitamina C por cada 100 gramos, cubriendo el 100% de la ingesta diaria recomendada para " +
                                                  "\n un adulto. El ajo, con propiedades antimicrobianas, puede ayudar a combatir infecciones. El jengibre tiene efectos         " +
                                                  "\n antiinflamatorios. El yogur natural, fuente de probióticos, contribuye a la salud intestinal y fortalece la respuesta inmune." +
                                                  "\n Las verduras de hoja verde como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo la regeneración  " +
                                                  "\n celular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga  " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico" +
                                                  "\n y consultar a un médico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagnóstico no te satisface" + 
                                                  "\n del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer ARTRITIS. " +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2 litros de agua al día para mantener la lubricación de las articulaciones      " +
                                                  "\n y reducir la inflamación. EJERCICIO: Se sugiere actividad física de bajo impacto como natación, yoga y ejercicios de         " +
                                                  "\n movilidad articular para mejorar la flexibilidad y reducir el dolor. POSIBLE TRATAMIENTO: La artritis se trata con           " +
                                                  "\n medicamentos antiinflamatorios y analgésicos. Los más utilizados incluyen ibuprofeno, naproxeno y celecoxib. Algunas         " +
                                                  "\n marcas comerciales incluyen Advil (ibuprofeno), Aleve (naproxeno) y Celebrex (celecoxib). ALIMENTACIÓN: Se recomienda        " +
                                                  "\n el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para reducir la inflamación y fortalecer las          " +
                                                  "\n articulaciones, tales como pescados grasos como salmón y atún, que contienen aproximadamente 1.8 g de ácidos grasos          " +
                                                  "\n Omega-3 por cada 100 gramos, ayudando a reducir la inflamación. Frutas y verduras de colores vivos como fresas y espinacas,  " +
                                                  "\n ricas en antioxidantes y vitamina C. Jengibre y cúrcuma, con propiedades antiinflamatorias. Frutos secos como almendras y    " +
                                                  "\n nueces, ricos en vitamina E y ácidos grasos saludables. Este es solo un diagnóstico predeterminado lógico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se " +
                                                  "\n recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Por tu salud, si  " +
                                                  "\n la respuesta del diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 litros de agua al día para mantener las vías respiratorias hidratadas      " +
                                                  "\n y facilitar la eliminación de secreciones. EJERCICIO: Se sugiere actividad física ligera como caminatas y ejercicios de     " +
                                                  "\n respiración para fortalecer los pulmones sin generar fatiga excesiva. POSIBLE TRATAMIENTO: La tosferina se trata con        " +
                                                  "\n antibióticos, siendo los más utilizados la azitromicina, claritromicina y eritromicina. Algunas marcas comerciales          " +
                                                  "\n incluyen Zithromax (azitromicina), Klacid (claritromicina) y Ilosone (eritromicina). ALIMENTACIÓN: Se recomienda el         " +
                                                  "\n consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico y mejorar       " +
                                                  "\n la función pulmonar, tales como frutas cítricas como naranjas y toronjas, que contienen aproximadamente 60 mg de vitamina C " +
                                                  "\n por cada 100 gramos, cubriendo el 100% de la ingesta diaria recomendada para un adulto. El ajo, con propiedades antimicrobianas," +
                                                  "\n puede ayudar a combatir infecciones. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de probióticos,    " +
                                                  "\n contribuye a la salud intestinal y fortalece la respuesta inmune. Las verduras de hoja verde como espinacas y acelgas son   " +
                                                  "\n ricas en antioxidantes y vitamina E, favoreciendo la regeneración celular. Este es solo un diagnóstico predeterminado lógico," +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas." + 
                                                  "\n Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado.   " +
                                                  "\n Por tu salud, si la respuesta del diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista.      " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2 litros de agua al día para mantener la hidratación y reducir la       " +
                                                  "\n inflamación de las glándulas salivales. EJERCICIO: Se sugiere reposo y evitar actividades físicas intensas hasta     " +
                                                  "\n la recuperación completa. POSIBLE TRATAMIENTO: No existe un tratamiento específico para las paperas, pero los        " +
                                                  "\n síntomas pueden aliviarse con analgésicos como ibuprofeno y paracetamol. Algunas marcas comerciales incluyen Advil   " +
                                                  "\n (ibuprofeno) y Tylenol (paracetamol). ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a reducir la    " +
                                                  "\n inflamación y fortalezcan el sistema inmunológico, tales como frutas cítricas como limones y kiwis, que contienen    " +
                                                  "\n aproximadamente 70 mg de vitamina C por cada 100 gramos, cubriendo el 100% de la ingesta diaria recomendada para     " +
                                                  "\n un adulto. El ajo, con propiedades antimicrobianas, puede ayudar a combatir infecciones. El jengibre tiene efectos   " +
                                                  "\n antiinflamatorios. El yogur natural, fuente de probióticos, contribuye a la salud intestinal y fortalece la respuesta" +
                                                  "\n inmune. Las verduras de hoja verde como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo    " +
                                                  "\n la regeneración celular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%  " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda   " +
                                                  "\n realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Por tu salud, si la  " +
                                                  "\n respuesta del diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 litros de agua al día para prevenir la deshidratación y ayudar a     " +
                                                  "\n la eliminación de toxinas. EJERCICIO: Se sugiere reposo y evitar actividades físicas intensas hasta la recuperación   " +
                                                  "\n completa. POSIBLE TRATAMIENTO: No existe un tratamiento específico para el Zika, pero los síntomas pueden aliviarse   " +
                                                  "\n con analgésicos como paracetamol. Algunas marcas comerciales incluyen Tylenol (paracetamol). ALIMENTACIÓN: Se recomienda" +
                                                  "\n el consumo de alimentos que ayuden a fortalecer el sistema inmunológico y reducir la inflamación, tales como frutas     " +
                                                  "\n cítricas como naranjas y toronjas, que contienen aproximadamente 60 mg de vitamina C por cada 100 gramos, cubriendo     " +
                                                  "\n el 100% de la ingesta diaria recomendada para un adulto. El ajo, con propiedades antimicrobianas, puede ayudar a combatir" +
                                                  "\n infecciones. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de probióticos, contribuye a la salud " +
                                                  "\n intestinal y fortalece la respuesta inmune. Las verduras de hoja verde como espinacas y acelgas son ricas en antioxidantes" +
                                                  "\n y vitamina E, favoreciendo la regeneración celular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello," +
                                                  "\n se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Por tu salud," +
                                                  "\n si la respuesta del diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes    " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 3 litros de agua al día para prevenir la deshidratación causada por la diarrea    " +
                                                  "\n intensa, además de soluciones de rehidratación oral como Pedialyte o Enfalyte para reponer electrolitos perdidos. EJERCICIO:   " +
                                                  "\n Se sugiere reposo absoluto durante la fase aguda de la enfermedad, evitando cualquier actividad física intensa hasta la        " +
                                                  "\n recuperación completa. POSIBLE TRATAMIENTO: No existe un tratamiento específico para el rotavirus, pero los síntomas pueden    " +
                                                  "\n aliviarse con líquidos de rehidratación y una dieta adecuada. En casos graves, puede requerirse hidratación intravenosa.       " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a reponer los electrolitos y fortalecer el sistema digestivo,   " +
                                                  "\n tales como plátanos, que contienen aproximadamente 358 mg de potasio por cada 100 gramos, ayudando a equilibrar los electrolitos" +
                                                  "\n perdidos. El arroz blanco, fuente de carbohidratos de fácil digestión, contribuye a la recuperación. El yogur natural, rico en " +
                                                  "\n probióticos, favorece la salud intestinal. Las zanahorias, con aproximadamente 8 mg de betacarotenos por cada 100 gramos,      " +
                                                  "\n ayudan a fortalecer el sistema inmunológico. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza" +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda     " +
                                                  "\n realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Por tu salud, si la respuesta  " +
                                                  "\n del diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita      " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 litros de agua al día para ayudar a eliminar toxinas y fortalecer el   " +
                                                  "\n sistema inmunológico. EJERCICIO: Se sugiere actividad física moderada, evitando el sobreesfuerzo y priorizando          " +
                                                  "\n ejercicios de bajo impacto como caminatas y yoga. POSIBLE TRATAMIENTO: La listeriosis se trata con antibióticos,        " +
                                                  "\n siendo la ampicilina y la gentamicina los más utilizados. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos     " +
                                                  "\n en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico, tales como espinacas, que contienen   " +
                                                  "\n aproximadamente 2.7 mg de hierro por cada 100 gramos, favoreciendo la producción de glóbulos rojos. El ajo, rico en     " +
                                                  "\n alicina, posee propiedades antimicrobianas. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de    " +
                                                  "\n probióticos, contribuye a la salud intestinal y fortalece la respuesta inmune. Este es solo un diagnóstico predeterminado" +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean        " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer" +
                                                  "\n el tratamiento adecuado. Por tu salud, si la respuesta del diagnóstico no te satisface del todo, se recomienda mucho    " +
                                                  "\n acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 3 litros de agua al día para prevenir la deshidratación causada por la " +
                                                  "\n diarrea intensa, además de soluciones de rehidratación oral para reponer electrolitos. EJERCICIO: Se sugiere reposo " +
                                                  "\n absoluto durante la fase aguda de la enfermedad, evitando cualquier actividad física intensa hasta la recuperación  " +
                                                  "\n completa. POSIBLE TRATAMIENTO: La shigelosis se trata con antibióticos en casos graves, siendo la ciprofloxacina y  " +
                                                  "\n la azitromicina los más utilizados. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el  " +
                                                  "\n sistema digestivo y reponer los electrolitos, tales como plátanos, que contienen aproximadamente 358 mg de potasio  " +
                                                  "\n por cada 100 gramos, ayudando a equilibrar los electrolitos perdidos. El arroz blanco, fuente de carbohidratos de   " +
                                                  "\n fácil digestión, contribuye a la recuperación. El yogur natural, rico en probióticos, favorece la salud intestinal. " +
                                                  "\n Las zanahorias, con aproximadamente 8 mg de betacarotenos por cada 100 gramos, ayudan a fortalecer el sistema       " +
                                                  "\n inmunológico. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el     " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar" +
                                                  "\n más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Por tu salud, si la respuesta" +
                                                  "\n del diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu  " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 a 3 litros de agua al día para mantener las vías respiratorias        " +
                                                  "\n hidratadas y facilitar la eliminación de secreciones. También es beneficioso el consumo de infusiones calientes        " +
                                                  "\n para aliviar la irritación pulmonar. EJERCICIO: Se sugiere actividad física moderada, como caminatas y ejercicios      " +
                                                  "\n de respiración, para fortalecer los pulmones sin generar fatiga excesiva. Evitar ambientes con humo o contaminación    " +
                                                  "\n es clave para prevenir crisis respiratorias. POSIBLE TRATAMIENTO: La EPOC se trata con broncodilatadores y corticosteroides" + 
                                                  "\n inhalados para mejorar la función pulmonar. Algunos medicamentos incluyen salbutamol, tiotropio y budesonida.          " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer     " +
                                                  "\n la función pulmonar, tales como zanahorias, que contienen aproximadamente 8 mg de betacarotenos por cada 100 gramos,   " +
                                                  "\n ayudando a la salud respiratoria. El ajo, con propiedades antimicrobianas, puede ayudar a combatir infecciones.        " +
                                                  "\n El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de probióticos, contribuye a la salud intestinal " +
                                                  "\n y fortalece la respuesta inmune. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda" +
                                                  "\n realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Por tu salud, si la    " +
                                                  "\n respuesta del diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece" +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 litros de agua al día para favorecer la eliminación de toxinas     " +
                                                  "\n y fortalecer el sistema inmunológico. EJERCICIO: Se sugiere actividad física moderada, evitando el sobreesfuerzo    " +
                                                  "\n y priorizando ejercicios de bajo impacto como caminatas y yoga. POSIBLE TRATAMIENTO: La clamidia se trata con       " +
                                                  "\n antibióticos, siendo la azitromicina y la doxiciclina los más utilizados. Algunas marcas comerciales incluyen       " +
                                                  "\n Azitromicina y Doxiclat. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes    " +
                                                  "\n esenciales para fortalecer el sistema inmunológico, tales como espinacas, que contienen aproximadamente 2.7 mg de   " +
                                                  "\n hierro por cada 100 gramos, favoreciendo la producción de glóbulos rojos. El ajo, rico en alicina, posee propiedades" +
                                                  "\n antimicrobianas. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de probióticos, contribuye a " +
                                                  "\n la salud intestinal y fortalece la respuesta inmune. Este es solo un diagnóstico predeterminado lógico, haberlo     " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente      " +
                                                  "\n correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el       " +
                                                  "\n tratamiento adecuado. Por tu salud, si la respuesta del diagnóstico no te satisface del todo, se recomienda mucho   " +
                                                  "\n acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 3 litros de agua al día para mantener la hidratación y ayudar       " +
                                                  "\n a la eliminación de toxinas. EJERCICIO: Se sugiere reposo absoluto durante el tratamiento, evitando cualquier    " +
                                                  "\n actividad física intensa hasta la recuperación completa. POSIBLE TRATAMIENTO: La meningitis bacteriana se trata  " +
                                                  "\n con antibióticos administrados por vía intravenosa. Algunos medicamentos incluyen ceftriaxona y vancomicina.     " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmunológico y reducir    " +
                                                  "\n la inflamación, tales como frutas cítricas como naranjas y toronjas, que contienen aproximadamente 60 mg de      " +
                                                  "\n vitamina C por cada 100 gramos, cubriendo el 100% de la ingesta diaria recomendada para un adulto. El ajo,       " +
                                                  "\n con propiedades antimicrobianas, puede ayudar a combatir infecciones. El jengibre tiene efectos antiinflamatorios." +
                                                  "\n El yogur natural, fuente de probióticos, contribuye a la salud intestinal y fortalece la respuesta inmune.       " +
                                                  "\n Las verduras de hoja verde como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo        " +
                                                  "\n la regeneración celular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza      " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello,     " +
                                                  "\n se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado.    " +
                                                  "\n Por tu salud, si la respuesta del diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista." +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 a 3 litros de agua al día para mantener una adecuada       " +
                                                  "\n hidratación celular y ayudar a la eliminación de toxinas generadas por el tratamiento. También es           " +
                                                  "\n beneficioso el consumo de infusiones antioxidantes como té verde o agua con limón. EJERCICIO: Se            " +
                                                  "\n sugiere actividad física moderada y adaptada a la condición del paciente, como caminatas suaves,            " +
                                                  "\n yoga o ejercicios de respiración, evitando el sobreesfuerzo. El ejercicio puede ayudar a reducir            " +
                                                  "\n la fatiga y mejorar el bienestar general. POSIBLE TRATAMIENTO: El tratamiento del cáncer varía según        " +
                                                  "\n el tipo y la etapa de la enfermedad, incluyendo opciones como cirugía, quimioterapia, radioterapia,         " +
                                                  "\n inmunoterapia y terapia dirigida. Algunos medicamentos utilizados en la quimioterapia incluyen paclitaxel,  " +
                                                  "\n cisplatino y doxorrubicina. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y    " +
                                                  "\n nutrientes esenciales para fortalecer el sistema inmunológico y reducir la inflamación, tales como frutas   " +
                                                  "\n cítricas como naranjas y toronjas, que contienen aproximadamente 60 mg de vitamina C por cada 100 gramos,   " +
                                                  "\n cubriendo el 100% de la ingesta diaria recomendada para un adulto. El ajo, con propiedades antimicrobianas, " +
                                                  "\n puede ayudar a combatir infecciones. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente  " +
                                                  "\n de probióticos, contribuye a la salud intestinal y fortalece la respuesta inmune. Las verduras de hoja verde" +
                                                  "\n como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo la regeneración celular.     " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente  " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar " +
                                                  "\n más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Por tu salud, si la  " +
                                                  "\n respuesta del diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L   " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        
                        if(EstaturaMasculino.equals("1.65-1.80 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 litros de agua al día para mantener la hidratación y ayudar  " +
                                                  "\n a la eliminación de toxinas generadas por la fiebre y la congestión. También es beneficioso el consumo de     " +
                                                  "\n líquidos calientes como té de jengibre o caldos para aliviar la irritación de garganta. En casos de fiebre    " +
                                                  "\n alta, se recomienda el consumo de sueros de rehidratación oral para evitar la deshidratación. EJERCICIO:      " +
                                                  "\n Durante la fase aguda de la enfermedad, se recomienda reposo absoluto para evitar el desgaste energético      " +
                                                  "\n y permitir que el sistema inmunológico combata la infección. Una vez superada la fase crítica, se pueden      " +
                                                  "\n realizar ejercicios de bajo impacto como caminatas suaves para mejorar la circulación y la recuperación.      " +
                                                  "\n POSIBLE TRATAMIENTO: La gripe se trata con antivirales como oseltamivir (Tamiflu) y zanamivir (Relenza),      " +
                                                  "\n que ayudan a reducir la duración y gravedad de la enfermedad al inhibir la replicación del virus. También     " +
                                                  "\n se pueden utilizar analgésicos y antipiréticos como paracetamol (Tylenol) e ibuprofeno (Advil) para aliviar   " +
                                                  "\n la fiebre y el malestar general. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes   " +
                                                  "\n y nutrientes esenciales para fortalecer el sistema inmunológico, tales como frutas cítricas como naranjas y   " +
                                                  "\n toronjas, que contienen aproximadamente 60 mg de vitamina C por cada 100 gramos, cubriendo el 100% de la      " +
                                                  "\n ingesta diaria recomendada para un adulto. El ajo, con propiedades antimicrobianas, puede ayudar a combatir   " +
                                                  "\n infecciones. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de probióticos, contribuye " +
                                                  "\n a la salud intestinal y fortalece la respuesta inmune. Las verduras de hoja verde como espinacas y acelgas son" +
                                                  "\n ricas en antioxidantes y vitamina E, favoreciendo la regeneración celular. Este es solo un diagnóstico        " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las" +
                                                  "\n respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a" +
                                                  "\n un médico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagnóstico no te satisface" +
                                                  "\n del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 3 litros de agua al día para mantener las vías respiratorias   " +
                                                  "\n hidratadas y facilitar la eliminación de secreciones. También es beneficioso el consumo de infusiones       " +
                                                  "\n calientes como té de eucalipto o jengibre para aliviar la congestión pulmonar. En casos graves, puede       " +
                                                  "\n requerirse hidratación intravenosa para evitar complicaciones. EJERCICIO: Durante la fase aguda de la       " +
                                                  "\n enfermedad, se recomienda reposo absoluto para evitar el esfuerzo respiratorio excesivo. Una vez superada   " +
                                                  "\n la fase crítica, se pueden realizar ejercicios de respiración profunda y caminatas suaves para fortalecer   " +
                                                  "\n los pulmones y mejorar la oxigenación. POSIBLE TRATAMIENTO: La neumonía se trata con antibióticos en caso   " +
                                                  "\n de origen bacteriano, siendo amoxicilina (Amoxil) y azitromicina (Zithromax) los más utilizados para combatir" +
                                                  "\n la infección. También pueden recetarse broncodilatadores como salbutamol (Ventolin) y antiinflamatorios como" +
                                                  "\n prednisona (Deltasone) para mejorar la función pulmonar y reducir la inflamación. ALIMENTACIÓN: Se recomienda" +
                                                  "\n el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico" +
                                                  "\n y mejorar la función pulmonar, tales como zanahorias, que contienen aproximadamente 8 mg de betacarotenos por " +
                                                  "\n cada 100 gramos, ayudando a la salud respiratoria. El ajo, con propiedades antimicrobianas, puede ayudar a    " +
                                                  "\n combatir infecciones. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de probióticos,   " +
                                                  "\n contribuye a la salud intestinal y fortalece la respuesta inmune. Este es solo un diagnóstico predeterminado  " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas   " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico " +
                                                  "\n para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagnóstico no te satisface del    " +
                                                  "\n todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y    " +
                                                  "\n espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 litros de agua al día para mantener una adecuada hidratación      " +
                                                  "\n celular y ayudar a la regulación de la glucosa en sangre. También es beneficioso el consumo de infusiones sin      " +
                                                  "\n azúcar como té verde o agua con limón para mejorar la sensibilidad a la insulina. EJERCICIO: Se sugiere actividad  " +
                                                  "\n física moderada y adaptada a la condición del paciente, como caminatas diarias de al menos 30 minutos, natación o  " +
                                                  "\n ejercicios de resistencia para mejorar la sensibilidad a la insulina y controlar los niveles de glucosa.           " +
                                                  "\n POSIBLE TRATAMIENTO: La diabetes se trata con medicamentos como metformina (Glucophage), que ayuda a reducir la    " +
                                                  "\n producción de glucosa en el hígado, insulina (Lantus, Humalog) para regular los niveles de azúcar en sangre, y     " +
                                                  "\n empagliflozina (Jardiance), que favorece la eliminación de glucosa a través de la orina. ALIMENTACIÓN: Se recomienda" +
                                                  "\n el consumo de alimentos ricos en fibra y nutrientes esenciales para estabilizar los niveles de glucosa, tales como " +
                                                  "\n avena, que contiene aproximadamente 4 g de fibra por cada 100 gramos, ayudando a la regulación del azúcar en sangre." +
                                                  "\n Frutas como fresas y manzanas, ricas en antioxidantes y fibra. Frutos secos como almendras y nueces, que contienen " +
                                                  "\n grasas saludables. Verduras de hoja verde como espinacas y acelgas, ricas en antioxidantes y vitamina E. Este es   " +
                                                  "\n solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta      " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico" +
                                                  "\n y consultar a un médico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagnóstico no te  " +
                                                  "\n satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida)" +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 litros de agua al día para mantener las vías respiratorias hidratadas     " +
                                                  "\n y reducir la viscosidad de las secreciones bronquiales, facilitando la respiración. También es beneficioso el consumo      " +
                                                  "\n de infusiones como té de jengibre o manzanilla, que poseen propiedades antiinflamatorias. EJERCICIO: Se sugiere actividad  " +
                                                  "\n física moderada y controlada, con calentamiento previo y enfriamiento posterior. Ejercicios como natación, caminatas y     " +
                                                  "\n yoga pueden mejorar la capacidad pulmonar sin provocar crisis asmáticas. Se recomienda evitar ambientes con humo,          " +
                                                  "\n contaminación o temperaturas extremas. POSIBLE TRATAMIENTO: El asma se trata con broncodilatadores y corticosteroides      " +
                                                  "\n inhalados. Algunos medicamentos incluyen salbutamol (Ventolin, Aerolin), que actúa como broncodilatador de acción rápida,  " +
                                                  "\n budesonida (Pulmicort), que reduce la inflamación de las vías respiratorias, y montelukast (Singulair), que ayuda a        " +
                                                  "\n prevenir crisis asmáticas. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes         " +
                                                  "\n esenciales para fortalecer la función pulmonar, tales como pescados grasos como salmón y atún, que contienen               " +
                                                  "\n aproximadamente 1.8 g de ácidos grasos Omega-3 por cada 100 gramos, ayudando a reducir la inflamación. Frutas y verduras   " +
                                                  "\n de colores vivos como fresas y espinacas, ricas en antioxidantes y vitamina C. Jengibre y cúrcuma, con propiedades         " +
                                                  "\n antiinflamatorias. Frutos secos como almendras y nueces, ricos en vitamina E y ácidos grasos saludables. Este es solo      " +
                                                  "\n un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni     " +
                                                  "\n que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a     " +
                                                  "\n un médico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagnóstico no te satisface del todo, " +
                                                  "\n se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 3 litros de agua al día para mantener una adecuada hidratación         " +
                                                  "\n celular y ayudar a la eliminación de toxinas generadas por el tratamiento antirretroviral. También es beneficioso   " +
                                                  "\n el consumo de infusiones antioxidantes como té verde o agua con limón. EJERCICIO: Se sugiere actividad física       " +
                                                  "\n moderada y adaptada a la condición del paciente, como caminatas suaves, yoga o ejercicios de resistencia, evitando  " +
                                                  "\n el sobreesfuerzo. El ejercicio puede ayudar a reducir la fatiga y mejorar el bienestar general.                     " +
                                                  "\n POSIBLE TRATAMIENTO: El VIH/SIDA se trata con terapia antirretroviral (TAR), que combina varios medicamentos para   " +
                                                  "\n reducir la carga viral y fortalecer el sistema inmunológico. Algunos medicamentos incluyen tenofovir (Viread), que  " +
                                                  "\n inhibe la replicación del virus, efavirenz (Sustiva), que bloquea la acción del VIH en las células, dolutegravir    " +
                                                  "\n (Tivicay), que impide la integración del virus en el ADN celular, y lamivudina (Epivir), que ayuda a reducir la     " +
                                                  "\n progresión de la enfermedad. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes" +
                                                  "\n esenciales para fortalecer el sistema inmunológico, tales como frutas cítricas como naranjas y toronjas, que contienen" +
                                                  "\n aproximadamente 60 mg de vitamina C por cada 100 gramos, cubriendo el 100% de la ingesta diaria recomendada para un " +
                                                  "\n adulto. El ajo, con propiedades antimicrobianas, puede ayudar a combatir infecciones. El jengibre tiene efectos     " +
                                                  "\n antiinflamatorios. El yogur natural, fuente de probióticos, contribuye a la salud intestinal y fortalece la respuesta" +
                                                  "\n inmune. Las verduras de hoja verde como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo la " +
                                                  "\n regeneración celular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que " +
                                                  "\n el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar" +
                                                  "\n más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Por tu salud, si la respuesta " +
                                                  "\n del diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 litros de agua al día para favorecer la eliminación de toxinas      " +
                                                  "\n y fortalecer el sistema inmunológico. También es beneficioso el consumo de infusiones como té de manzanilla o        " +
                                                  "\n jengibre, que poseen propiedades antimicrobianas. EJERCICIO: Se sugiere actividad física moderada, evitando el       " +
                                                  "\n sobreesfuerzo y priorizando ejercicios de bajo impacto como caminatas y yoga. POSIBLE TRATAMIENTO: La gonorrea       " +
                                                  "\n se trata con antibióticos, siendo la ceftriaxona (Rocephin) y azitromicina (Zithromax) los más utilizados para       " +
                                                  "\n combatir la infección. También pueden recetarse doxiciclina (Doxiclat) en casos de coinfección con clamidia.         " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer   " +
                                                  "\n el sistema inmunológico, tales como espinacas, que contienen aproximadamente 2.7 mg de hierro por cada 100 gramos,   " +
                                                  "\n favoreciendo la producción de glóbulos rojos. El ajo, rico en alicina, posee propiedades antimicrobianas. El jengibre" +
                                                  "\n tiene efectos antiinflamatorios. El yogur natural, fuente de probióticos, contribuye a la salud intestinal y fortalece" +
                                                  "\n la respuesta inmune. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el" +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar" +
                                                  "\n más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Por tu salud, si la respuesta" +
                                                  "\n del diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu  " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 litros de agua al día para mantener la hidratación celular y   " +
                                                  "\n fortalecer el sistema inmunológico, lo que ayuda a reducir la frecuencia de los brotes. También es beneficioso  " +
                                                  "\n el consumo de infusiones antioxidantes como té verde o agua con limón. EJERCICIO: Se sugiere actividad física   " +
                                                  "\n moderada, evitando el sobreesfuerzo y el estrés, ya que estos pueden desencadenar brotes. Actividades como      " +
                                                  "\n caminatas, yoga y ejercicios de bajo impacto pueden ser beneficiosos para la salud general y el sistema         " +
                                                  "\n inmunológico. POSIBLE TRATAMIENTO: El herpes genital no tiene cura definitiva, pero existen tratamientos        " +
                                                  "\n para reducir los síntomas y la frecuencia de los brotes. Los antivirales como aciclovir (Zovirax), valaciclovir " +
                                                  "\n (Valtrex) y famciclovir (Famvir) son comúnmente recetados para controlar la infección, ayudando a reducir la    " +
                                                  "\n replicación del virus y la duración de los síntomas. ALIMENTACIÓN: Se recomienda el consumo de alimentos que    " +
                                                  "\n fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como frutas cítricas como naranjas " +
                                                  "\n y limones, que contienen aproximadamente 60 mg de vitamina C por cada 100 gramos, cubriendo el 100% de la ingesta" +
                                                  "\n diaria recomendada para un adulto. El ajo, rico en alicina, posee propiedades antivirales y antiinflamatorias.  " +
                                                  "\n El jengibre tiene efectos antiinflamatorios que pueden ayudar a reducir el malestar. El yogur natural, fuente   " +
                                                  "\n de probióticos, contribuye a la salud intestinal y fortalece la respuesta inmune. Las verduras de hoja verde    " +
                                                  "\n como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo la regeneración celular. Este    " +
                                                  "\n es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga     " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de    " +
                                                  "\n un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Por tu salud, si la respuesta   " +
                                                  "\n del diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 litros de agua al día para favorecer la eliminación de toxinas " +
                                                  "\n y fortalecer el sistema inmunológico. También es beneficioso el consumo de infusiones como té de manzanilla o   " +
                                                  "\n jengibre, que poseen propiedades antimicrobianas. EJERCICIO: Se sugiere actividad física moderada, evitando el  " +
                                                  "\n sobreesfuerzo y priorizando ejercicios de bajo impacto como caminatas y yoga, ya que el estrés físico puede     " +
                                                  "\n afectar la recuperación. POSIBLE TRATAMIENTO: La sífilis se trata con antibióticos, siendo la penicilina G      " +
                                                  "\n benzatina (Benzetacil) el medicamento de primera elección, que actúa eliminando la bacteria Treponema pallidum. " +
                                                  "\n En casos de alergia a la penicilina, se pueden utilizar alternativas como doxiciclina (Doxiclat) o ceftriaxona  " +
                                                  "\n (Rocephin), que también combaten la infección. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en     " +
                                                  "\n antioxidantes y nutrientes esenciales para la regeneración celular y el fortalecimiento del sistema inmune,     " +
                                                  "\n tales como frutas cítricas como naranjas y limones, que contienen aproximadamente 60 mg de vitamina C por cada  " +
                                                  "\n 100 gramos, cubriendo el 100% de la ingesta diaria recomendada para un adulto. El ajo, rico en alicina, posee   " +
                                                  "\n propiedades antimicrobianas. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de probióticos," +
                                                  "\n contribuye a la salud intestinal y fortalece la respuesta inmune. Las verduras de hoja verde como espinacas y   " +
                                                  "\n acelgas son ricas en antioxidantes y vitamina E, favoreciendo la regeneración celular. Este es solo un diagnóstico" +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las " +
                                                  "\n respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a  " +
                                                  "\n un médico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagnóstico no te satisface" +
                                                  "\n del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y  " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 3 litros de agua al día para mantener las vías respiratorias      " +
                                                  "\n hidratadas y facilitar la eliminación de secreciones. También es beneficioso el consumo de infusiones          " +
                                                  "\n calientes como té de eucalipto o jengibre para aliviar la congestión pulmonar. EJERCICIO: Durante la           " +
                                                  "\n fase aguda de la enfermedad, se recomienda reposo absoluto para evitar el esfuerzo respiratorio excesivo.      " +
                                                  "\n Una vez superada la fase crítica, se pueden realizar ejercicios de respiración profunda y caminatas suaves     " +
                                                  "\n para fortalecer los pulmones y mejorar la oxigenación. POSIBLE TRATAMIENTO: La tuberculosis se trata con una   " +
                                                  "\n combinación de antibióticos administrados por un período prolongado. Los medicamentos más utilizados incluyen  " +
                                                  "\n isoniacida (INH), que inhibe la síntesis de la pared celular de la bacteria, rifampicina (Rifadin), que bloquea" +
                                                  "\n la replicación del bacilo, etambutol (Myambutol), que impide el crecimiento de la bacteria, y pirazinamida, que" +
                                                  "\n ayuda a eliminar la infección en los pulmones. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en    " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico y mejorar la función pulmonar,   " +
                                                  "\n tales como frutas cítricas como toronjas y kiwis, que contienen aproximadamente 70 mg de vitamina C por cada   " +
                                                  "\n 100 gramos, cubriendo el 100% de la ingesta diaria recomendada para un adulto. El ajo, con propiedades antimicrobianas," +
                                                  "\n puede ayudar a combatir infecciones. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de   " +
                                                  "\n probióticos, contribuye a la salud intestinal y fortalece la respuesta inmune. Las verduras de hoja verde como  " +
                                                  "\n espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo la regeneración celular. Este es solo " +
                                                  "\n un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad" +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar" +
                                                  "\n a un médico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagnóstico no te satisface del" +
                                                  "\n todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 litros de agua al día para mantener la lubricación de las     " +
                                                  "\n articulaciones y reducir la inflamación. También es beneficioso el consumo de infusiones como té de cúrcuma    " +
                                                  "\n o jengibre, que poseen propiedades antiinflamatorias. EJERCICIO: Se sugiere actividad física de bajo impacto   " +
                                                  "\n como natación, yoga y ejercicios de movilidad articular para mejorar la flexibilidad y reducir el dolor. Se    " +
                                                  "\n recomienda evitar ejercicios de alto impacto que puedan generar mayor desgaste en las articulaciones.          " +
                                                  "\n POSIBLE TRATAMIENTO: La artritis se trata con medicamentos antiinflamatorios y analgésicos. Los más utilizados " +
                                                  "\n incluyen ibuprofeno (Advil), que ayuda a reducir la inflamación y el dolor, naproxeno (Aleve), que tiene efectos" +
                                                  "\n prolongados contra la inflamación, celecoxib (Celebrex), que actúa como inhibidor selectivo de la inflamación, y" +
                                                  "\n metotrexato, utilizado en casos de artritis reumatoide para reducir la respuesta autoinmune. ALIMENTACIÓN: Se   " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para reducir la inflamación y " +
                                                  "\n fortalecer las articulaciones, tales como pescados grasos como salmón y atún, que contienen aproximadamente 1.8 g" +
                                                  "\n de ácidos grasos Omega-3 por cada 100 gramos, ayudando a reducir la inflamación. Frutas y verduras de colores vivos" +
                                                  "\n como fresas y espinacas, ricas en antioxidantes y vitamina C. Jengibre y cúrcuma, con propiedades antiinflamatorias." +
                                                  "\n Frutos secos como almendras y nueces, ricos en vitamina E y ácidos grasos saludables. Este es solo un diagnóstico   " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las     " +
                                                  "\n respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un   " +
                                                  "\n médico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagnóstico no te satisface del   " +
                                                  "\n todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 litros de agua al día para mantener las vías respiratorias   " +
                                                  "\n hidratadas y facilitar la eliminación de secreciones. También es beneficioso el consumo de infusiones         " +
                                                  "\n calientes como té de eucalipto o miel con limón para aliviar la irritación de garganta. EJERCICIO: Durante    " +
                                                  "\n la fase aguda de la enfermedad, se recomienda reposo absoluto para evitar el esfuerzo respiratorio excesivo.  " +
                                                  "\n Una vez superada la fase crítica, se pueden realizar ejercicios de respiración profunda y caminatas suaves    " +
                                                  "\n para fortalecer los pulmones y mejorar la oxigenación. POSIBLE TRATAMIENTO: La tosferina se trata con antibióticos," +
                                                  "\n siendo los más utilizados azitromicina (Zithromax), que ayuda a eliminar la bacteria Bordetella pertussis,    " +
                                                  "\n claritromicina (Klacid), que reduce la duración de los síntomas, y eritromicina (Ilosone), que previene la    " +
                                                  "\n propagación de la infección. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y     " +
                                                  "\n nutrientes esenciales para fortalecer el sistema inmunológico y mejorar la función pulmonar, tales como frutas" +
                                                  "\n cítricas como naranjas y toronjas, que contienen aproximadamente 60 mg de vitamina C por cada 100 gramos,     " +
                                                  "\n cubriendo el 100% de la ingesta diaria recomendada para un adulto. El ajo, con propiedades antimicrobianas,   " +
                                                  "\n puede ayudar a combatir infecciones. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente    " +
                                                  "\n de probióticos, contribuye a la salud intestinal y fortalece la respuesta inmune. Las verduras de hoja verde  " +
                                                  "\n como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo la regeneración celular. Este  " +
                                                  "\n es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga   " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de  " +
                                                  "\n un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Por tu salud, si la respuesta " +
                                                  "\n del diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece" +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2 litros de agua al día para mantener la hidratación y reducir      " +
                                                  "\n la inflamación de las glándulas salivales. También es beneficioso el consumo de líquidos tibios como caldos      " +
                                                  "\n o infusiones de manzanilla para aliviar el malestar. EJERCICIO: Se sugiere reposo absoluto durante la fase       " +
                                                  "\n aguda de la enfermedad, evitando cualquier actividad física intensa hasta la recuperación completa.              " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento específico para las paperas, pero los síntomas pueden aliviarse    " +
                                                  "\n con analgésicos como ibuprofeno (Advil), que ayuda a reducir la fiebre y la inflamación, y paracetamol (Tylenol)," +
                                                  "\n que alivia el dolor y el malestar general. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a reducir" +
                                                  "\n la inflamación y fortalezcan el sistema inmunológico, tales como frutas cítricas como limones y kiwis, que contienen" +
                                                  "\n aproximadamente 70 mg de vitamina C por cada 100 gramos, cubriendo el 100% de la ingesta diaria recomendada para un " +
                                                  "\n adulto. El ajo, con propiedades antimicrobianas, puede ayudar a combatir infecciones. El jengibre tiene efectos     " +
                                                  "\n antiinflamatorios. El yogur natural, fuente de probióticos, contribuye a la salud intestinal y fortalece la respuesta " +
                                                  "\n inmune. Las verduras de hoja verde como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo la  " +
                                                  "\n regeneración celular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que  " +
                                                  "\n el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar  " +
                                                  "\n más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del " +
                                                  "\n diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a  " +
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 3 litros de agua al día para prevenir la deshidratación causada    " +
                                                  "\n por la fiebre y el malestar general. También es beneficioso el consumo de infusiones antioxidantes como té      " +
                                                  "\n verde o agua con limón para ayudar a la eliminación de toxinas. EJERCICIO: Se sugiere reposo absoluto durante   " +
                                                  "\n la fase aguda de la enfermedad, evitando cualquier actividad física intensa hasta la recuperación completa.     " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento específico para el Zika, pero los síntomas pueden aliviarse con   " +
                                                  "\n analgésicos como paracetamol (Tylenol) para reducir la fiebre y el dolor. Se recomienda evitar el uso de aspirina " +
                                                  "\n y otros antiinflamatorios no esteroideos hasta descartar la posibilidad de dengue, para reducir el riesgo de      " +
                                                  "\n hemorragias. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmunológico  " +
                                                  "\n y reducir la inflamación, tales como frutas cítricas como naranjas y toronjas, que contienen aproximadamente 60 mg" +
                                                  "\n de vitamina C por cada 100 gramos, cubriendo el 100% de la ingesta diaria recomendada para un adulto. El ajo, con " +
                                                  "\n propiedades antimicrobianas, puede ayudar a combatir infecciones. El jengibre tiene efectos antiinflamatorios.    " +
                                                  "\n El yogur natural, fuente de probióticos, contribuye a la salud intestinal y fortalece la respuesta inmune.        " +
                                                  "\n Las verduras de hoja verde como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo la      " +
                                                  "\n regeneración celular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%  " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda" +
                                                  "\n realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Por tu salud, si la" +
                                                  "\n respuesta del diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 3 litros de agua al día para prevenir la deshidratación causada     " +
                                                  "\n por la diarrea intensa, además de soluciones de rehidratación oral como Pedialyte o Enfalyte, que ayudan a       " +
                                                  "\n reponer los electrolitos perdidos. EJERCICIO: Se sugiere reposo absoluto durante la fase aguda de la enfermedad, " +
                                                  "\n evitando cualquier actividad física intensa hasta la recuperación completa. POSIBLE TRATAMIENTO: No existe un    " +
                                                  "\n tratamiento específico para el rotavirus, pero los síntomas pueden aliviarse con líquidos de rehidratación y     " +
                                                  "\n una dieta adecuada. En casos graves, puede requerirse hidratación intravenosa. ALIMENTACIÓN: Se recomienda el    " +
                                                  "\n consumo de alimentos que ayuden a reponer los electrolitos y fortalecer el sistema digestivo, tales como plátanos," +
                                                  "\n que contienen aproximadamente 358 mg de potasio por cada 100 gramos, ayudando a equilibrar los electrolitos      " +
                                                  "\n perdidos. El arroz blanco, fuente de carbohidratos de fácil digestión, contribuye a la recuperación. El yogur    " +
                                                  "\n natural, rico en probióticos, favorece la salud intestinal. Las zanahorias, con aproximadamente 8 mg de          " +
                                                  "\n betacarotenos por cada 100 gramos, ayudan a fortalecer el sistema inmunológico. Este es solo un diagnóstico      " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que      " +
                                                  "\n las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar " +
                                                  "\n a un médico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagnóstico no te         " +
                                                  "\n satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la         " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 litros de agua al día para ayudar a eliminar toxinas   " +
                                                  "\n y fortalecer el sistema inmunológico. También es beneficioso el consumo de infusiones como té de        " +
                                                  "\n manzanilla o jengibre, que poseen propiedades antimicrobianas. EJERCICIO: Se sugiere actividad física   " +
                                                  "\n moderada, evitando el sobreesfuerzo y priorizando ejercicios de bajo impacto como caminatas y yoga.     " +
                                                  "\n POSIBLE TRATAMIENTO: La listeriosis se trata con antibióticos, siendo la ampicilina y la gentamicina    " +
                                                  "\n los más utilizados. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y        " +
                                                  "\n nutrientes esenciales para fortalecer el sistema inmunológico, tales como espinacas, que contienen      " +
                                                  "\n aproximadamente 2.7 mg de hierro por cada 100 gramos, favoreciendo la producción de glóbulos rojos.     " +
                                                  "\n El ajo, rico en alicina, posee propiedades antimicrobianas. El jengibre tiene efectos antiinflamatorios.   " +
                                                  "\n El yogur natural, fuente de probióticos, contribuye a la salud intestinal y fortalece la respuesta inmune. " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar" +
                                                  "\n más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Por tu salud, si la " +
                                                  "\n respuesta del diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L  " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 3 litros de agua al día para prevenir la deshidratación       " +
                                                  "\n causada por la diarrea intensa. También es beneficioso el consumo de soluciones de rehidratación oral      " +
                                                  "\n para reponer electrolitos perdidos. EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda       " +
                                                  "\n reposo absoluto para evitar el desgaste energético. Una vez superada la fase crítica, se pueden realizar   " +
                                                  "\n caminatas suaves para mejorar la circulación y la recuperación. POSIBLE TRATAMIENTO: La shigelosis se      " +
                                                  "\n trata con antibióticos en casos graves, siendo ciprofloxacina y azitromicina los más utilizados para       " +
                                                  "\n combatir la infección. También pueden recetarse ceftriaxona, que actúa eliminando la bacteria Shigella.    " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema digestivo y reponer " +
                                                  "\n los electrolitos, tales como plátanos, que contienen aproximadamente 358 mg de potasio por cada 100 gramos," +    
                                                  "\n ayudando a equilibrar los electrolitos perdidos. El arroz blanco, fuente de carbohidratos de fácil digestión,    " +
                                                  "\n contribuye a la recuperación. El yogur natural, rico en probióticos, favorece la salud intestinal. Las zanahorias," +
                                                  "\n con aproximadamente 8 mg de betacarotenos por cada 100 gramos, ayudan a fortalecer el sistema inmunológico.   " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente    " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar   " +
                                                  "\n más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Por tu salud, si la    " +
                                                  "\n respuesta del diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L     " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 a 3 litros de agua al día para mantener las vías         " +
                                                  "\n respiratorias hidratadas y facilitar la eliminación de secreciones. También es beneficioso el             " +
                                                  "\n consumo de infusiones calientes como té de eucalipto o jengibre para aliviar la congestión pulmonar.      " +
                                                  "\n EJERCICIO: Se sugiere actividad física moderada, como caminatas y ejercicios de respiración, para         " +
                                                  "\n fortalecer los pulmones sin generar fatiga excesiva. Evitar ambientes con humo o contaminación es         " +
                                                  "\n clave para prevenir crisis respiratorias. POSIBLE TRATAMIENTO: La EPOC se trata con broncodilatadores     " +
                                                  "\n y corticosteroides inhalados para mejorar la función pulmonar. Algunos medicamentos incluyen salbutamol,  " +
                                                  "\n que actúa como broncodilatador de acción rápida, tiotropio, que ayuda a reducir la obstrucción bronquial, " +
                                                  "\n budesonida, que disminuye la inflamación de las vías respiratorias, y roflumilast, que reduce la exacerbación" +
                                                  "\n de los síntomas. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes     " +
                                                  "\n esenciales para fortalecer la función pulmonar, tales como zanahorias, que contienen aproximadamente 8 mg    " +
                                                  "\n de betacarotenos por cada 100 gramos, ayudando a la salud respiratoria. El ajo, con propiedades antimicrobianas," +
                                                  "\n puede ayudar a combatir infecciones. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de   " +
                                                  "\n probióticos, contribuye a la salud intestinal y fortalece la respuesta inmune. Este es solo un diagnóstico      " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que     " +
                                                  "\n las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar" +
                                                  "\n a un médico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagnóstico no te satisface" +
                                                  "\n del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y    " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 litros de agua al día para favorecer la eliminación   " +
                                                  "\n de toxinas y fortalecer el sistema inmunológico. También es beneficioso el consumo de infusiones como  " +
                                                  "\n té de manzanilla o jengibre, que poseen propiedades antimicrobianas. EJERCICIO: Se sugiere actividad   " +
                                                  "\n física moderada, evitando el sobreesfuerzo y priorizando ejercicios de bajo impacto como caminatas y   " +
                                                  "\n yoga. POSIBLE TRATAMIENTO: La clamidia se trata con antibióticos, siendo azitromicina, que elimina la  " +
                                                  "\n bacteria en una sola dosis, doxiciclina, que actúa inhibiendo la replicación de la bacteria, levofloxacina," +
                                                  "\n que ayuda a combatir la infección en casos más resistentes, y amoxicilina, utilizada en casos específicos  " +
                                                  "\n como el embarazo. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes  " +
                                                  "\n esenciales para fortalecer el sistema inmunológico, tales como espinacas, que contienen aproximadamente    " +
                                                  "\n 2.7 mg de hierro por cada 100 gramos, favoreciendo la producción de glóbulos rojos. El ajo, rico en alicina," +
                                                  "\n posee propiedades antimicrobianas. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente   " +
                                                  "\n de probióticos, contribuye a la salud intestinal y fortalece la respuesta inmune. Este es solo un diagnóstico" +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que  " +
                                                  "\n las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y       " +
                                                  "\n consultar a un médico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagnóstico " +
                                                  "\n no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita    " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 3 litros de agua al día para mantener la hidratación         " +
                                                  "\n y ayudar a la eliminación de toxinas generadas por la infección. También es beneficioso el consumo        " +
                                                  "\n de caldos y líquidos tibios para aliviar el malestar general. EJERCICIO: Durante la fase aguda de         " +
                                                  "\n la enfermedad, se recomienda reposo absoluto para evitar el esfuerzo físico excesivo. Una vez superada    " +
                                                  "\n la fase crítica, se pueden realizar ejercicios de movilidad y respiración para mejorar la recuperación.   " +
                                                  "\n POSIBLE TRATAMIENTO: La meningitis bacteriana se trata con antibióticos administrados por vía intravenosa." +
                                                  "\n Algunos medicamentos incluyen ceftriaxona, que actúa eliminando la bacteria causante de la infección,     " +
                                                  "\n vancomicina, utilizada en casos de resistencia bacteriana, ampicilina, efectiva contra ciertas cepas      " +
                                                  "\n bacterianas, y meropenem, que combate infecciones graves del sistema nervioso central. ALIMENTACIÓN:      " +
                                                  "\n Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmunológico y reducir la        " +
                                                  "\n inflamación, tales como frutas cítricas como naranjas y toronjas, que contienen aproximadamente           " +
                                                  "\n 60 mg de vitamina C por cada 100 gramos, cubriendo el 100% de la ingesta diaria recomendada para un       " +
                                                  "\n adulto. El ajo, con propiedades antimicrobianas, puede ayudar a combatir infecciones. El jengibre         " +
                                                  "\n tiene efectos antiinflamatorios. El yogur natural, fuente de probióticos, contribuye a la salud           " +
                                                  "\n intestinal y fortalece la respuesta inmune. Las verduras de hoja verde como espinacas y acelgas           " +
                                                  "\n son ricas en antioxidantes y vitamina E, favoreciendo la regeneración celular. Este es solo un            " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga          " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar     " +
                                                  "\n más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Por tu salud,      " +
                                                  "\n si la respuesta del diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista.   " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 a 3 litros de agua al día para mantener una adecuada hidratación  " +
                                                  "\n celular y ayudar a la eliminación de toxinas generadas por el tratamiento. También es beneficioso el consumo de    " +
                                                  "\n infusiones antioxidantes como té verde o agua con limón. EJERCICIO: Se sugiere actividad física moderada y adaptada" +
                                                  "\n a la condición del paciente, como caminatas suaves, yoga o ejercicios de resistencia, evitando el sobreesfuerzo.   " +
                                                  "\n El ejercicio puede ayudar a reducir la fatiga y mejorar el bienestar general. POSIBLE TRATAMIENTO: El tratamiento  " +
                                                  "\n del cáncer varía según el tipo y la etapa de la enfermedad, incluyendo opciones como cirugía, quimioterapia,       " +
                                                  "\n radioterapia, inmunoterapia y terapia dirigida. Algunos medicamentos utilizados en la quimioterapia incluyen       " +
                                                  "\n paclitaxel, que inhibe la división celular del cáncer, cisplatino, que interfiere con el ADN de las células        " +
                                                  "\n cancerosas, doxorrubicina, que bloquea la proliferación celular, y nivolumab, un inmunoterapéutico que ayuda       " +
                                                  "\n al sistema inmunológico a combatir el cáncer. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en         " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico y reducir la inflamación, tales      " +
                                                  "\n como frutas cítricas como naranjas y toronjas, que contienen aproximadamente 60 mg de vitamina C por cada 100      " +
                                                  "\n gramos, cubriendo el 100% de la ingesta diaria recomendada para un adulto. El ajo, con propiedades antimicrobianas," +
                                                  "\n puede ayudar a combatir infecciones. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de      " +
                                                  "\n probióticos, contribuye a la salud intestinal y fortalece la respuesta inmune. Las verduras de hoja verde como     " +
                                                  "\n espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo la regeneración celular. Este es solo    " +
                                                  "\n un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad" +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y      " +
                                                  "\n consultar a un médico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagnóstico no    " +
                                                  "\n te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app    " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        if(EstaturaMasculino.equals("1.55-1.70 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 litros de agua al día para mantener la hidratación y ayudar " +
                                                  "\n a la eliminación de toxinas generadas por la fiebre y la congestión. También es beneficioso el consumo de    " +
                                                  "\n líquidos calientes como té de jengibre o caldos para aliviar la irritación de garganta. En casos de fiebre   " +
                                                  "\n alta, se recomienda el consumo de sueros de rehidratación oral para evitar la deshidratación. EJERCICIO:     " +
                                                  "\n Durante la fase aguda de la enfermedad, se recomienda reposo absoluto para evitar el desgaste energético     " +
                                                  "\n y permitir que el sistema inmunológico combata la infección. Una vez superada la fase crítica, se pueden     " +
                                                  "\n realizar ejercicios de bajo impacto como caminatas suaves para mejorar la circulación y la recuperación.     " +
                                                  "\n POSIBLE TRATAMIENTO: La gripe se trata con antivirales como oseltamivir (Tamiflu) y zanamivir (Relenza),     " +
                                                  "\n que ayudan a reducir la duración y gravedad de la enfermedad al inhibir la replicación del virus. También    " +
                                                  "\n se pueden utilizar analgésicos y antipiréticos como paracetamol (Tylenol) e ibuprofeno (Advil) para aliviar  " +
                                                  "\n la fiebre y el malestar general. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes  " +
                                                  "\n y nutrientes esenciales para fortalecer el sistema inmunológico, tales como frutas cítricas como naranjas y  " +
                                                  "\n toronjas, que contienen aproximadamente 60 mg de vitamina C por cada 100 gramos, cubriendo el 100% de la     " +
                                                  "\n ingesta diaria recomendada para un adulto. El ajo, con propiedades antimicrobianas, puede ayudar a combatir  " +
                                                  "\n infecciones. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de probióticos, contribuye" +
                                                  "\n a la salud intestinal y fortalece la respuesta inmune. Las verduras de hoja verde como espinacas y acelgas son" +
                                                  "\n ricas en antioxidantes y vitamina E, favoreciendo la regeneración celular. Este es solo un diagnóstico predeterminado" +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean" +
                                                  "\n completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para " +
                                                  "\n establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagnóstico no te satisface del todo, se" +
                                                  "\n recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 3 litros de agua al día para mantener las vías respiratorias hidratadas   " +
                                                  "\n y facilitar la eliminación de secreciones. También es beneficioso el consumo de infusiones calientes como té de        " +
                                                  "\n eucalipto o jengibre para aliviar la congestión pulmonar. En casos graves, puede requerirse hidratación intravenosa    " +
                                                  "\n para evitar complicaciones. EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo absoluto para      " +
                                                  "\n evitar el esfuerzo respiratorio excesivo. Una vez superada la fase crítica, se pueden realizar ejercicios de respiración" +
                                                  "\n profunda y caminatas suaves para fortalecer los pulmones y mejorar la oxigenación. POSIBLE TRATAMIENTO: La neumonía se " +
                                                  "\n trata con antibióticos en caso de origen bacteriano, siendo amoxicilina (Amoxil) y azitromicina (Zithromax) los más    " +
                                                  "\n utilizados para combatir la infección. También pueden recetarse broncodilatadores como salbutamol (Ventolin) y         " +
                                                  "\n antiinflamatorios como prednisona (Deltasone) para mejorar la función pulmonar y reducir la inflamación. ALIMENTACIÓN: " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema        " +
                                                  "\n inmunológico y mejorar la función pulmonar, tales como zanahorias, que contienen aproximadamente 8 mg de betacarotenos " +
                                                  "\n por cada 100 gramos, ayudando a la salud respiratoria. El ajo, con propiedades antimicrobianas, puede ayudar a combatir" +
                                                  "\n infecciones. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de probióticos, contribuye a la salud" +
                                                  "\n intestinal y fortalece la respuesta inmune. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no   " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, " +
                                                  "\n se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Por tu   " +
                                                  "\n salud, si la respuesta del diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel   " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 litros de agua al día para mantener una adecuada hidratación    " +
                                                  "\n celular y ayudar a la regulación de la glucosa en sangre. También es beneficioso el consumo de infusiones sin    " +
                                                  "\n azúcar como té verde o agua con limón para mejorar la sensibilidad a la insulina. EJERCICIO: Se sugiere actividad" +
                                                  "\n física moderada y adaptada a la condición del paciente, como caminatas diarias de al menos 30 minutos, natación  " +
                                                  "\n o ejercicios de resistencia para mejorar la sensibilidad a la insulina y controlar los niveles de glucosa.       " +
                                                  "\n POSIBLE TRATAMIENTO: La diabetes se trata con medicamentos como metformina (Glucophage), que ayuda a reducir     " +
                                                  "\n la producción de glucosa en el hígado, insulina (Lantus, Humalog) para regular los niveles de azúcar en sangre,  " +
                                                  "\n y empagliflozina (Jardiance), que favorece la eliminación de glucosa a través de la orina. ALIMENTACIÓN: Se      " +
                                                  "\n recomienda el consumo de alimentos ricos en fibra y nutrientes esenciales para estabilizar los niveles de glucosa," +
                                                  "\n tales como avena, que contiene aproximadamente 4 g de fibra por cada 100 gramos, ayudando a la regulación del azúcar" +
                                                  "\n en sangre. Frutas como fresas y manzanas, ricas en antioxidantes y fibra. Frutos secos como almendras y nueces,     " +
                                                  "\n que contienen grasas saludables. Verduras de hoja verde como espinacas y acelgas, ricas en antioxidantes y vitamina E." +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico" +
                                                  "\n y consultar a un médico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagnóstico no te  " +
                                                  "\n satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la    " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 litros de agua al día para mantener las vías respiratorias     " +
                                                  "\n hidratadas y reducir la viscosidad de las secreciones bronquiales, facilitando la respiración. También es       " +
                                                  "\n beneficioso el consumo de infusiones como té de jengibre o manzanilla, que poseen propiedades antiinflamatorias." +
                                                  "\n EJERCICIO: Se sugiere actividad física moderada y controlada, con calentamiento previo y enfriamiento posterior." +
                                                  "\n Ejercicios como natación, caminatas y yoga pueden mejorar la capacidad pulmonar sin provocar crisis asmáticas.  " +
                                                  "\n Se recomienda evitar ambientes con humo, contaminación o temperaturas extremas. POSIBLE TRATAMIENTO:            " +
                                                  "\n El asma se trata con broncodilatadores y corticosteroides inhalados. Algunos medicamentos incluyen salbutamol,  " +
                                                  "\n que actúa como broncodilatador de acción rápida, budesonida, que reduce la inflamación de las vías respiratorias," +
                                                  "\n y montelukast, que ayuda a prevenir crisis asmáticas. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en" +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer la función pulmonar, tales como pescados grasos como salmón " +
                                                  "\n y atún, que contienen aproximadamente 1.8 g de ácidos grasos Omega-3 por cada 100 gramos, ayudando a reducir la   " +
                                                  "\n inflamación. Frutas y verduras de colores vivos como fresas y espinacas, ricas en antioxidantes y vitamina C.     " +
                                                  "\n Jengibre y cúrcuma, con propiedades antiinflamatorias. Frutos secos como almendras y nueces, ricos en vitamina E  " +
                                                  "\n y ácidos grasos saludables. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se      " +
                                                  "\n recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado.        " +
                                                  "\n Por tu salud, si la respuesta del diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista." +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 3 litros de agua al día para mantener una adecuada hidratación celular     " +
                                                  "\n y ayudar a la eliminación de toxinas generadas por el tratamiento antirretroviral. También es beneficioso el consumo    " +
                                                  "\n de infusiones antioxidantes como té verde o agua con limón. EJERCICIO: Se sugiere actividad física moderada y adaptada  " +
                                                  "\n a la condición del paciente, como caminatas suaves, yoga o ejercicios de resistencia, evitando el sobreesfuerzo.        " +
                                                  "\n El ejercicio puede ayudar a reducir la fatiga y mejorar el bienestar general. POSIBLE TRATAMIENTO: El VIH/SIDA se trata " +
                                                  "\n con terapia antirretroviral (TAR), que combina varios medicamentos para reducir la carga viral y fortalecer el sistema  " +
                                                  "\n inmunológico. Algunos medicamentos incluyen tenofovir, que inhibe la replicación del virus, efavirenz, que bloquea la   " +
                                                  "\n acción del VIH en las células, dolutegravir, que impide la integración del virus en el ADN celular, y lamivudina, que   " +
                                                  "\n ayuda a reducir la progresión de la enfermedad. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes" +
                                                  "\n y nutrientes esenciales para fortalecer el sistema inmunológico, tales como frutas cítricas como naranjas y toronjas,   " +
                                                  "\n que contienen aproximadamente 60 mg de vitamina C por cada 100 gramos, cubriendo el 100% de la ingesta diaria recomendada" +
                                                  "\n para un adulto. El ajo, con propiedades antimicrobianas, puede ayudar a combatir infecciones. El jengibre tiene efectos " +
                                                  "\n antiinflamatorios. El yogur natural, fuente de probióticos, contribuye a la salud intestinal y fortalece la respuesta   " +
                                                  "\n inmune. Las verduras de hoja verde como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo la    " +
                                                  "\n regeneración celular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más" +
                                                  "\n de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del    " +
                                                  "\n diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita   " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 litros de agua al día para favorecer la eliminación de toxinas   " +
                                                  "\n y fortalecer el sistema inmunológico. También es beneficioso el consumo de infusiones como té de manzanilla o     " +
                                                  "\n jengibre, que poseen propiedades antimicrobianas. EJERCICIO: Se sugiere actividad física moderada, evitando el    " +
                                                  "\n sobreesfuerzo y priorizando ejercicios de bajo impacto como caminatas y yoga. POSIBLE TRATAMIENTO: La gonorrea    " +
                                                  "\n se trata con antibióticos, siendo la ceftriaxona y azitromicina los más utilizados para combatir la infección.    " +
                                                  "\n También pueden recetarse doxiciclina en casos de coinfección con clamidia. ALIMENTACIÓN: Se recomienda el consumo " +
                                                  "\n de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico, tales como   " +
                                                  "\n espinacas, que contienen aproximadamente 2.7 mg de hierro por cada 100 gramos, favoreciendo la producción de      " +
                                                  "\n glóbulos rojos. El ajo, rico en alicina, posee propiedades antimicrobianas. El jengibre tiene efectos antiinflamatorios." +
                                                  "\n El yogur natural, fuente de probióticos, contribuye a la salud intestinal y fortalece la respuesta inmune.        " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente        " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar       " +
                                                  "\n más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Por tu salud, si la        " +
                                                  "\n respuesta del diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L         " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 litros de agua al día para mantener la hidratación celular y fortalecer   " +
                                                  "\n el sistema inmunológico, lo que ayuda a reducir la frecuencia de los brotes. También es beneficioso el consumo de          " +
                                                  "\n infusiones antioxidantes como té verde o agua con limón. EJERCICIO: Se sugiere actividad física moderada, evitando         " +
                                                  "\n el sobreesfuerzo y el estrés, ya que estos pueden desencadenar brotes. Actividades como caminatas, yoga y ejercicios       " +
                                                  "\n de bajo impacto pueden ser beneficiosos para la salud general y el sistema inmunológico. POSIBLE TRATAMIENTO: El herpes    " +
                                                  "\n genital no tiene cura definitiva, pero existen tratamientos para reducir los síntomas y la frecuencia de los brotes.       " +
                                                  "\n Los antivirales como aciclovir, valaciclovir y famciclovir son comúnmente recetados para controlar la infección,           " +
                                                  "\n ayudando a reducir la replicación del virus y la duración de los síntomas. ALIMENTACIÓN: Se recomienda el consumo          " +
                                                  "\n de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como frutas cítricas         " +
                                                  "\n como naranjas y limones, que contienen aproximadamente 60 mg de vitamina C por cada 100 gramos, cubriendo el 100%          " +
                                                  "\n de la ingesta diaria recomendada para un adulto. El ajo, rico en alicina, posee propiedades antivirales y antiinflamatorias." +
                                                  "\n El jengibre tiene efectos antiinflamatorios que pueden ayudar a reducir el malestar. El yogur natural, fuente de probióticos," +
                                                  "\n contribuye a la salud intestinal y fortalece la respuesta inmune. Las verduras de hoja verde como espinacas y acelgas son  " +
                                                  "\n ricas en antioxidantes y vitamina E, favoreciendo la regeneración celular. Este es solo un diagnóstico predeterminado lógico," +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente     " +
                                                  "\n correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento  " +
                                                  "\n adecuado. Por tu salud, si la respuesta del diagnóstico no te satisface del todo, se recomienda mucho acudir a un especialista." +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 2.5 litros de agua al día para favorecer la eliminación de toxinas    " +
                                                  "\n y fortalecer el sistema inmunológico. También es beneficioso el consumo de infusiones como té de manzanilla o      " +
                                                  "\n jengibre, que poseen propiedades antimicrobianas. EJERCICIO: Se sugiere actividad física moderada, evitando el     " +
                                                  "\n sobreesfuerzo y priorizando ejercicios de bajo impacto como caminatas y yoga, ya que el estrés físico puede afectar" +
                                                  "\n la recuperación. POSIBLE TRATAMIENTO: La sífilis se trata con antibióticos, siendo la penicilina G benzatina el    " +
                                                  "\n medicamento de primera elección, que actúa eliminando la bacteria Treponema pallidum. En casos de alergia a la     " +
                                                  "\n penicilina, se pueden utilizar alternativas como doxiciclina o ceftriaxona, que también combaten la infección.     " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para la         " +
                                                  "\n regeneración celular y el fortalecimiento del sistema inmune, tales como frutas cítricas como naranjas y limones,  " +
                                                  "\n que contienen aproximadamente 60 mg de vitamina C por cada 100 gramos, cubriendo el 100% de la ingesta diaria      " +
                                                  "\n recomendada para un adulto. El ajo, rico en alicina, posee propiedades antimicrobianas. El jengibre tiene efectos  " +
                                                  "\n antiinflamatorios. El yogur natural, fuente de probióticos, contribuye a la salud intestinal y fortalece la        " +
                                                  "\n respuesta inmune. Las verduras de hoja verde como espinacas y acelgas son ricas en antioxidantes y vitamina E,     " +
                                                  "\n favoreciendo la regeneración celular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no     " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas.        " +
                                                  "\n Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento     " +
                                                  "\n adecuado. Por tu salud, si la respuesta del diagnóstico no te satisface del todo, se recomienda mucho acudir a     " +
                                                  "\n un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACIÓN: Se recomienda consumir al menos 3 litros de agua al día para mantener las vías respiratorias  " +
                                                  "\n hidratadas y facilitar la eliminación de secreciones. También es beneficioso el consumo de infusiones      " +
                                                  "\n calientes como té de eucalipto o jengibre para aliviar la congestión pulmonar. EJERCICIO: Durante la       " +
                                                  "\n fase aguda de la enfermedad, se recomienda reposo absoluto para evitar el esfuerzo respiratorio excesivo.  " +
                                                  "\n Una vez superada la fase crítica, se pueden realizar ejercicios de respiración profunda y caminatas suaves " +
                                                  "\n para fortalecer los pulmones y mejorar la oxigenación. POSIBLE TRATAMIENTO: La tuberculosis se trata con   " +
                                                  "\n una combinación de antibióticos administrados por un período prolongado. Los medicamentos más utilizados   " +
                                                  "\n incluyen isoniazida, que inhibe la síntesis de la pared celular de la bacteria, rifampicina, que bloquea   " +
                                                  "\n la replicación del bacilo, etambutol, que impide el crecimiento de la bacteria, y pirazinamida, que ayuda  " +
                                                  "\n a eliminar la infección en los pulmones. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en      " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico y mejorar la función pulmonar," +
                                                  "\n tales como frutas cítricas como toronjas y kiwis, que contienen aproximadamente 70 mg de vitamina C por cada" +
                                                  "\n 100 gramos, cubriendo el 100% de la ingesta diaria recomendada para un adulto. El ajo, con propiedades      " +
                                                  "\n antimicrobianas, puede ayudar a combatir infecciones. El jengibre tiene efectos antiinflamatorios.          " +
                                                  "\n El yogur natural, fuente de probióticos, contribuye a la salud intestinal y fortalece la respuesta inmune.  " +
                                                  "\n Las verduras de hoja verde como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo   " +
                                                  "\n la regeneración celular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello," +
                                                  "\n se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado." +
                                                  "\n Por tu salud, si la respuesta del diagnóstico no te satisface del todo, se recomienda mucho acudir a un     " +
                                                  "\n especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer ARTRITIS." +
                                                  "\n Para un hombre joven de entre 22 y 29 años con artritis, es fundamental mantener un estilo de vida activo pero   " +
                                                  "\n adaptado a la condición. EJERCICIO: Se recomienda realizar actividades de bajo impacto como natación, yoga o     " +
                                                  "\n caminatas moderadas para fortalecer las articulaciones sin sobrecargarlas, con al menos 30 minutos diarios de    " +
                                                  "\n actividad física controlada para mejorar la movilidad y reducir la rigidez. HIDRATACIÓN: Es crucial el consumo   " +
                                                  "\n diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para mantener la lubricación de las       " +
                                                  "\n articulaciones y reducir la inflamación. POSIBLE TRATAMIENTO: Para la artritis en adultos jóvenes, el tratamiento" +
                                                  "\n suele incluir fármacos antirreumáticos modificadores de la enfermedad (FAMEs) como el metotrexato, que ayuda a   " +
                                                  "\n reducir la inflamación y el daño articular, además de corticoesteroides en casos específicos para controlar los  " +
                                                  "\n brotes de inflamación. También pueden recetarse antiinflamatorios no esteroideos (AINEs) como el ibuprofeno o el " +
                                                  "\n naproxeno, con marcas reconocidas como Tempra, Advil y Flanax. Es fundamental seguir las indicaciones médicas y  " +
                                                  "\n realizar controles periódicos para ajustar el tratamiento según la evolución de la enfermedad. ALIMENTACIÓN: Se  " +
                                                  "\n recomienda consumir alimentos que ayuden a reducir la inflamación y fortalecer las articulaciones, tales como    " +
                                                  "\n pescados grasos (salmón, atún, sardina) ricos en Omega-3 con propiedades antiinflamatorias, frutas cítricas      " +
                                                  "\n (naranjas, limones, toronjas) ricas en vitamina C esencial para la producción de colágeno y la salud articular,  " +
                                                  "\n verduras de hoja verde (espinacas, kale, acelgas) que contienen antioxidantes y vitamina K para reducir la inflamación," +
                                                  "\n jengibre y cúrcuma con efectos antiinflamatorios naturales, y frutos secos (almendras, nueces) ricos en magnesio que   " +
                                                  "\n contribuye a la relajación muscular y la salud ósea. Por ejemplo, 100 gramos de naranja contienen aproximadamente 53 mg" +
                                                  "\n de vitamina C, lo que equivale al 88% de la ingesta diaria recomendada para un adulto. Este es solo un diagnóstico     " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas" +
                                                  "\n sean completamente correctas, para ello se recomienda realizar más de un diagnóstico en Mi Vida para establecer mayor     " +
                                                  "\n seguridad en el tratamiento adecuado del paciente, además por su salud si la respuesta del diagnóstico no le satisface    " +
                                                  "\n del todo se recomienda consultar a su médico, Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Es una infección bacteriana altamente contagiosa que afecta las vías respiratorias, causando ataques de tos intensos     " +
                                                  "\n y persistentes. EJERCICIO: Se recomienda actividad física moderada sin sobreesfuerzo, evitando ambientes fríos o         " +
                                                  "\n contaminados que puedan agravar los síntomas, con caminatas ligeras de 20 a 30 minutos diarios para mejorar la capacidad " +
                                                  "\n pulmonar y reducir la fatiga. HIDRATACIÓN: Es fundamental consumir al menos 2.5 litros de agua al día (diez vasos de     " +
                                                  "\n tamaño regular) para mantener las vías respiratorias hidratadas y reducir la irritación de la garganta, además de incluir" +
                                                  "\n infusiones tibias para aliviar la tos. POSIBLE TRATAMIENTO: Se utilizan antibióticos como la azitromicina y claritromicina" +
                                                  "\n para combatir la infección y reducir el periodo de contagio. Marcas reconocidas que contienen estos medicamentos incluyen " +
                                                  "\n Zithromax y Klaricid. También se pueden emplear medicamentos para aliviar la tos y la inflamación, como el paracetamol,   " +
                                                  "\n con marcas como Tempra y Tylenol. Además, se recomienda el uso de humidificadores para mantener el aire húmedo y evitar   " +
                                                  "\n irritaciones en la garganta. ALIMENTACIÓN: Se recomienda consumir alimentos que ayuden a fortalecer el sistema inmunológico" +
                                                  "\n y reducir la inflamación, tales como cítricos (naranjas, limones, toronjas) ricos en vitamina C, que contribuyen a la     " +
                                                  "\n recuperación, miel con propiedades antibacterianas y calmantes para la garganta, jengibre con efectos antiinflamatorios   " +
                                                  "\n naturales, y ajo con propiedades antimicrobianas. Por ejemplo, 100 gramos de limón contienen aproximadamente 53 mg de     " +
                                                  "\n vitamina C, lo que equivale al 88% de la ingesta diaria recomendada para un adulto. Este es solo un diagnóstico predeterminado" +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente" +
                                                  "\n correctas, para ello se recomienda realizar más de un diagnóstico en Mi Vida para establecer mayor seguridad en el tratamiento" +
                                                  "\n adecuado del paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar " +
                                                  "\n a su médico, Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Es una infección viral que causa inflamación de las glándulas salivales y puede afectar otras partes del cuerpo." +
                                                  "\n EJERCICIO: Se recomienda reposo y evitar actividades físicas intensas durante la fase aguda de la enfermedad,   " +
                                                  "\n retomando ejercicios ligeros como estiramientos y caminatas suaves una vez que los síntomas disminuyan.         " +
                                                  "\n HIDRATACIÓN: Es importante consumir al menos 2 litros de agua al día (ocho vasos de tamaño regular) para        " +
                                                  "\n mantener la hidratación y aliviar la inflamación de las glándulas, además de incluir caldos y jugos naturales   " +
                                                  "\n para facilitar la recuperación. POSIBLE TRATAMIENTO: No existe un tratamiento específico, pero se pueden utilizar" +
                                                  "\n analgésicos como el ibuprofeno y paracetamol para reducir el dolor y la inflamación. Marcas reconocidas que      " +
                                                  "\n contienen estos medicamentos incluyen Advil y Flanax para el ibuprofeno, y Tempra y Tylenol para el paracetamol. " +
                                                  "\n También se recomienda el uso de compresas frías en la zona afectada para aliviar la inflamación y el dolor.      " +
                                                  "\n ALIMENTACIÓN: Se recomienda consumir alimentos suaves y fáciles de masticar que ayuden a reducir la inflamación  " +
                                                  "\n y fortalecer el sistema inmunológico, tales como yogur rico en probióticos para mejorar la salud digestiva,      " +
                                                  "\n papaya con enzimas que facilitan la digestión y reducen la inflamación, y espinacas con antioxidantes y vitamina K." +
                                                  "\n Por ejemplo, 100 gramos de papaya contienen aproximadamente 60 mg de vitamina C, lo que equivale al 100% de la ingesta" +
                                                  "\n diaria recomendada para un adulto. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello se recomienda" +
                                                  "\n realizar más de un diagnóstico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente, además" +
                                                  "\n por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico, Ángel L. Montes" +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n Es una infección viral transmitida por mosquitos que puede causar fiebre, erupciones cutáneas y dolor muscular.   " +
                                                  "\n EJERCICIO: Se recomienda actividad física ligera como yoga o caminatas suaves para mejorar la circulación y       " +
                                                  "\n reducir la fatiga, evitando esfuerzos excesivos que puedan agravar los síntomas. HIDRATACIÓN: Es esencial         " +
                                                  "\n consumir al menos 2.5 litros de agua al día (diez vasos de tamaño regular) para prevenir la deshidratación        " +
                                                  "\n y ayudar a la eliminación de toxinas, además de incluir agua de coco y jugos naturales para reponer electrolitos. " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento específico, pero se pueden utilizar analgésicos como el paracetamol " +
                                                  "\n para aliviar la fiebre y el dolor. Marcas reconocidas que contienen este medicamento incluyen Tempra y Tylenol.   " +
                                                  "\n También se recomienda reposo y una adecuada hidratación para facilitar la recuperación. ALIMENTACIÓN: Se recomienda" +
                                                  "\n consumir alimentos ricos en antioxidantes y propiedades antiinflamatorias que ayuden a fortalecer el sistema       " +
                                                  "\n inmunológico, tales como frutos rojos (arándanos, fresas) con antioxidantes que protegen las células, cúrcuma      " +
                                                  "\n con propiedades antiinflamatorias, y zanahorias con betacarotenos que fortalecen la respuesta inmune. Por ejemplo, " +
                                                  "\n 100 gramos de fresas contienen aproximadamente 59 mg de vitamina C, lo que equivale al 98% de la ingesta diaria    " +
                                                  "\n recomendada para un adulto. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza     " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello se     " +
                                                  "\n recomienda realizar más de un diagnóstico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado    " +
                                                  "\n del paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar " +
                                                  "\n a su médico, Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n Es una infección viral que causa gastroenteritis severa, provocando diarrea, vómitos y fiebre. EJERCICIO:       " +
                                                  "\n Se recomienda actividad física ligera como caminatas suaves de 15 a 20 minutos diarios para evitar la fatiga    " +
                                                  "\n y mejorar la recuperación, evitando esfuerzos intensos que puedan agravar la deshidratación.                    " +
                                                  "\n HIDRATACIÓN: Es esencial consumir al menos 3 litros de agua al día (doce vasos de tamaño regular) para reponer  " +
                                                  "\n líquidos perdidos por la diarrea y los vómitos, además de incluir soluciones de rehidratación oral como Pedialyte" +
                                                  "\n para equilibrar electrolitos. POSIBLE TRATAMIENTO: No existe un tratamiento específico, pero se recomienda el uso" +
                                                  "\n de soluciones de rehidratación oral para prevenir la deshidratación. También pueden utilizarse medicamentos para " +
                                                  "\n aliviar los síntomas, como el paracetamol para la fiebre y el dolor. Marcas reconocidas que contienen estos      " +
                                                  "\n medicamentos incluyen Tempra y Tylenol. ALIMENTACIÓN: Se recomienda consumir alimentos fáciles de digerir y      " +
                                                  "\n ricos en nutrientes esenciales para la recuperación, tales como arroz blanco, plátanos ricos en potasio para     " +
                                                  "\n reponer electrolitos, zanahorias con betacarotenos que fortalecen el sistema digestivo, y yogur con probióticos  " +
                                                  "\n para restaurar la flora intestinal. Por ejemplo, 100 gramos de plátano contienen aproximadamente 358 mg de potasio," +
                                                  "\n lo que equivale al 8% de la ingesta diaria recomendada para un adulto. Este es solo un diagnóstico predeterminado  " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean   " +
                                                  "\n completamente correctas, para ello se recomienda realizar más de un diagnóstico en Mi Vida para establecer mayor   " +
                                                  "\n seguridad en el tratamiento adecuado del paciente, además por su salud si la respuesta del diagnóstico no le satisface" +
                                                  "\n del todo se recomienda consultar a su médico, Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n Es una infección bacteriana causada por Listeria monocytogenes, que puede provocar fiebre, dolor muscular y síntomas     " +
                                                  "\n gastrointestinales. EJERCICIO: Se recomienda actividad física moderada como caminatas de 30 minutos diarios para         " +
                                                  "\n mejorar la circulación y fortalecer el sistema inmunológico, evitando esfuerzos excesivos que puedan agravar la fatiga.  " +
                                                  "\n HIDRATACIÓN: Es fundamental consumir al menos 2.5 litros de agua al día (diez vasos de tamaño regular) para mantener la  " +
                                                  "\n hidratación y ayudar a la eliminación de toxinas, además de incluir caldos y jugos naturales para facilitar la recuperación." +
                                                  "\n POSIBLE TRATAMIENTO: Se utilizan antibióticos como la ampicilina y la gentamicina para combatir la infección. Marcas        " +
                                                  "\n reconocidas que contienen estos medicamentos incluyen Ampicilina MK y Gentamicina Normon. También se recomienda reposo      " +
                                                  "\n y una adecuada hidratación para facilitar la recuperación. ALIMENTACIÓN: Se recomienda consumir alimentos ricos en          " +
                                                  "\n antioxidantes y propiedades antibacterianas que ayuden a fortalecer el sistema inmunológico, tales como ajo con propiedades " +
                                                  "\n antimicrobianas, jengibre con efectos antiinflamatorios naturales, espinacas con antioxidantes y vitamina K, y zanahorias   " +
                                                  "\n con betacarotenos que fortalecen la respuesta inmune. Por ejemplo, 100 gramos de zanahoria contienen aproximadamente 8.3 mg " +
                                                  "\n de betacarotenos, lo que equivale al 69% de la ingesta diaria recomendada para un adulto. Este es solo un diagnóstico       " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas  " +
                                                  "\n sean completamente correctas, para ello se recomienda realizar más de un diagnóstico en Mi Vida para establecer mayor       " +
                                                  "\n seguridad en el tratamiento adecuado del paciente, además por su salud si la respuesta del diagnóstico no le satisface      " +
                                                  "\n del todo se recomienda consultar a su médico, Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n Es una infección bacteriana que afecta el sistema digestivo, causando diarrea, fiebre y dolor abdominal.    " +
                                                  "\n EJERCICIO: Se recomienda actividad física ligera como estiramientos y caminatas suaves de 15 a 20 minutos   " +
                                                  "\n diarios para mejorar la circulación y reducir la fatiga, evitando esfuerzos intensos que puedan agravar los " +
                                                  "\n síntomas. HIDRATACIÓN: Es esencial consumir al menos 3 litros de agua al día (doce vasos de tamaño regular) " +
                                                  "\n para prevenir la deshidratación y ayudar a la eliminación de toxinas, además de incluir soluciones de rehidratación         " +
                                                  "\n oral como Electrolit para equilibrar electrolitos. POSIBLE TRATAMIENTO: Se utilizan antibióticos como la ciprofloxacina     " +
                                                  "\n y la azitromicina para combatir la infección. Marcas reconocidas que contienen estos medicamentos incluyen Ciproxina        " +
                                                  "\n y Zithromax. También se recomienda reposo y una adecuada hidratación para facilitar la recuperación. ALIMENTACIÓN:          " +
                                                  "\n Se recomienda consumir alimentos ricos en fibra y propiedades antibacterianas que ayuden a fortalecer el sistema            " +
                                                  "\n digestivo, tales como arroz integral con fibra para mejorar la digestión, plátanos ricos en potasio para reponer            " +
                                                  "\n electrolitos, yogur con probióticos para restaurar la flora intestinal, y cúrcuma con propiedades antiinflamatorias.        " +
                                                  "\n Por ejemplo, 100 gramos de yogur contienen aproximadamente 3.5 gramos de proteína, lo que equivale al 7% de la ingesta      " +
                                                  "\n diaria recomendada para un adulto. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza       " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello se recomienda   " +
                                                  "\n realizar más de un diagnóstico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente, además   " +
                                                  "\n por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico, Ángel L. Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n Es una afección respiratoria crónica que causa dificultad para respirar debido a la obstrucción del flujo de aire en   " +
                                                  "\n los pulmones. EJERCICIO: Se recomienda actividad física moderada como caminatas de 30 a 45 minutos diarios, natación   " +
                                                  "\n o ejercicios de respiración para fortalecer los músculos respiratorios y mejorar la capacidad pulmonar, evitando       " +
                                                  "\n ambientes con contaminación o humo de tabaco. HIDRATACIÓN: Es fundamental consumir al menos 2.5 litros de agua al      " +
                                                  "\n día (diez vasos de tamaño regular) para mantener la hidratación de las vías respiratorias y facilitar la eliminación   " +
                                                  "\n de secreciones. POSIBLE TRATAMIENTO: Se utilizan broncodilatadores de acción prolongada como el salmeterol y el        " +
                                                  "\n formoterol para mejorar la respiración, además de corticosteroides inhalados como la fluticasona para reducir la       " +
                                                  "\n inflamación pulmonar. Marcas reconocidas que contienen estos medicamentos incluyen Seretide y Symbicort. También       " +
                                                  "\n pueden recetarse mucolíticos como la acetilcisteína para facilitar la expulsión de flemas, con marcas como Fluimucil   " +
                                                  "\n y Bisolvon. ALIMENTACIÓN: Se recomienda consumir alimentos ricos en antioxidantes y propiedades antiinflamatorias que  " +
                                                  "\n ayuden a fortalecer el sistema respiratorio, tales como frutos rojos (arándanos, fresas) con antioxidantes que protegen" +
                                                  "\n las células, cúrcuma con propiedades antiinflamatorias, y zanahorias con betacarotenos que fortalecen la respuesta inmune." +
                                                  "\n Por ejemplo, 100 gramos de zanahoria contienen aproximadamente 8.3 mg de betacarotenos, lo que equivale al 69% de la   " +
                                                  "\n ingesta diaria recomendada para un adulto. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no    " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello  " +
                                                  "\n se recomienda realizar más de un diagnóstico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del " +
                                                  "\n paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico," +
                                                  "\n Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n Es una infección de transmisión sexual causada por la bacteria Chlamydia trachomatis, que puede afectar el sistema urinario  " +
                                                  "\n y reproductivo. EJERCICIO: Se recomienda actividad física moderada como caminatas de 30 minutos diarios para mejorar la      " +
                                                  "\n circulación y fortalecer el sistema inmunológico, evitando esfuerzos excesivos que puedan agravar la fatiga.                 " +
                                                  "\n HIDRATACIÓN: Es fundamental consumir al menos 2 litros de agua al día (ocho vasos de tamaño regular) para mantener la        " +
                                                  "\n hidratación y ayudar a la eliminación de toxinas, además de incluir jugos naturales ricos en vitamina C para fortalecer el   " +
                                                  "\n sistema inmunológico. POSIBLE TRATAMIENTO: Se utilizan antibióticos como la azitromicina y la doxiciclina para eliminar la   " +
                                                  "\n infección. Marcas reconocidas que contienen estos medicamentos incluyen Zithromax y Vibramycin. También se recomienda evitar " +
                                                  "\n el contacto sexual hasta completar el tratamiento y realizar pruebas de seguimiento para confirmar la eliminación de la      " +
                                                  "\n bacteria. ALIMENTACIÓN: Se recomienda consumir alimentos ricos en antioxidantes y propiedades antibacterianas que ayuden     " +
                                                  "\n a fortalecer el sistema inmunológico, tales como ajo con propiedades antimicrobianas, jengibre con efectos antiinflamatorios " +
                                                  "\n naturales, espinacas con antioxidantes y vitamina K, y zanahorias con betacarotenos que fortalecen la respuesta inmune.      " +
                                                  "\n Por ejemplo, 100 gramos de espinaca contienen aproximadamente 482 mcg de vitamina K, lo que equivale al 402% de la ingesta   " +
                                                  "\n diaria recomendada para un adulto. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%" +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello se recomienda realizar más" +
                                                  "\n de un diagnóstico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente, además por su salud si la" +
                                                  "\n respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico, Ángel L. Montes agradece tu visita a la" +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n Es una infección grave que causa inflamación de las membranas que rodean el cerebro y la médula espinal, pudiendo      " +
                                                  "\n provocar fiebre alta, rigidez en el cuello y alteraciones neurológicas. EJERCICIO: Se recomienda reposo absoluto       " +
                                                  "\n durante la fase aguda de la enfermedad, retomando actividad física ligera como caminatas suaves de 15 a 20 minutos     " +
                                                  "\n diarios una vez que los síntomas disminuyan para mejorar la circulación y la recuperación. HIDRATACIÓN: Es esencial    " +
                                                  "\n consumir al menos 3 litros de agua al día (doce vasos de tamaño regular) para prevenir la deshidratación y ayudar a    " +
                                                  "\n la eliminación de toxinas, además de incluir caldos y jugos naturales para facilitar la recuperación.                  " +
                                                  "\n POSIBLE TRATAMIENTO: Se utilizan antibióticos intravenosos como la ceftriaxona y la vancomicina para combatir la infección." +
                                                  "\n Marcas reconocidas que contienen estos medicamentos incluyen Rocephin y Vancocin. También pueden recetarse corticosteroides" +
                                                  "\n como la dexametasona para reducir la inflamación cerebral, con marcas como Decadron y Maxidex. ALIMENTACIÓN: Se recomienda " +
                                                  "\n consumir alimentos ricos en antioxidantes y propiedades antiinflamatorias que ayuden a fortalecer el sistema inmunológico, " +
                                                  "\n tales como frutos rojos (arándanos, fresas) con antioxidantes que protegen las células, cúrcuma con propiedades antiinflamatorias," +
                                                  "\n y zanahorias con betacarotenos que fortalecen la respuesta inmune. Por ejemplo, 100 gramos de fresas contienen aproximadamente    " +
                                                  "\n 59 mg de vitamina C, lo que equivale al 98% de la ingesta diaria recomendada para un adulto. Este es solo un diagnóstico          " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas        " +
                                                  "\n sean completamente correctas, para ello se recomienda realizar más de un diagnóstico en Mi Vida para establecer mayor seguridad   " +
                                                  "\n en el tratamiento adecuado del paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se          " +
                                                  "\n recomienda consultar a su médico, Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n Es una enfermedad caracterizada por el crecimiento descontrolado de células anormales en el cuerpo, pudiendo afectar    " +
                                                  "\n distintos órganos y sistemas. EJERCICIO: Se recomienda actividad física moderada adaptada a la condición del paciente,  " +
                                                  "\n como caminatas de 30 minutos diarios, yoga o ejercicios de resistencia para mejorar la movilidad y reducir la fatiga,   " +
                                                  "\n evitando esfuerzos excesivos que puedan comprometer el sistema inmunológico. HIDRATACIÓN: Es fundamental consumir al    " +
                                                  "\n menos 2.5 a 3 litros de agua al día (diez a doce vasos de tamaño regular) para mantener la hidratación celular y facilitar " +
                                                  "\n la eliminación de toxinas, además de incluir infusiones antioxidantes como té verde para fortalecer el organismo.          " +
                                                  "\n POSIBLE TRATAMIENTO: Dependiendo del tipo de cáncer, el tratamiento puede incluir quimioterapia, radioterapia, inmunoterapia  " +
                                                  "\n o cirugía. Se utilizan medicamentos como el paclitaxel y el cisplatino para combatir el crecimiento celular anormal. Marcas   " +
                                                  "\n reconocidas que contienen estos medicamentos incluyen Taxol y Platinol. También pueden recetarse fármacos de soporte como el  " +
                                                  "\n ondansetrón para controlar las náuseas, con marcas como Zofran y Emeset. ALIMENTACIÓN: Se recomienda consumir alimentos ricos " +
                                                  "\n en antioxidantes y propiedades anticancerígenas que ayuden a fortalecer el sistema inmunológico, tales como frutos rojos      " +
                                                  "\n (arándanos, fresas) con antioxidantes que protegen las células, cúrcuma con propiedades antiinflamatorias, brócoli con        " +
                                                  "\n sulforafano que ayuda a eliminar células dañadas, y zanahorias con betacarotenos que fortalecen la respuesta inmune.          " +
                                                  "\n Por ejemplo, 100 gramos de brócoli contienen aproximadamente 89 mg de vitamina C, lo que equivale al 99% de la ingesta        " +
                                                  "\n diaria recomendada para un adulto. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello se recomienda realizar más" +
                                                  "\n de un diagnóstico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente, además por su salud si  " +
                                                  "\n la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico, Ángel L. Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        if(EstaturaMasculino.equals("1.45-1.60 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n Es una infección viral que afecta el sistema respiratorio, causando fiebre, tos, dolor muscular y fatiga. EJERCICIO: Se recomienda    " +
                                                  "\n actividad física moderada como caminatas de 20 a 30 minutos diarios para mejorar la circulación y fortalecer el sistema inmunológico, " +
                                                  "\n evitando esfuerzos intensos que puedan agravar los síntomas. HIDRATACIÓN: Es fundamental consumir al menos 2.5 litros de agua al día  " +
                                                  "\n (diez vasos de tamaño regular) para mantener la hidratación y ayudar a la eliminación de toxinas, además de incluir infusiones tibias " +
                                                  "\n y caldos para aliviar la garganta. POSIBLE TRATAMIENTO: Se pueden utilizar antivirales como el oseltamivir y el zanamivir para        " +
                                                  "\n reducir la duración y gravedad de la enfermedad. Marcas reconocidas que contienen estos medicamentos incluyen Tamiflu y Relenza.      " +
                                                  "\n También pueden recetarse analgésicos como el paracetamol para aliviar la fiebre y el malestar, con marcas como Tempra y Tylenol.      " +
                                                  "\n ALIMENTACIÓN: Se recomienda consumir alimentos ricos en antioxidantes y propiedades antivirales que ayuden a fortalecer el sistema    " +
                                                  "\n inmunológico, tales como cítricos (naranjas, limones, toronjas) con vitamina C, miel con propiedades antibacterianas, jengibre        " +
                                                  "\n con efectos antiinflamatorios naturales y ajo con propiedades antimicrobianas. Por ejemplo, 100 gramos de naranja contienen           " +
                                                  "\n aproximadamente 53 mg de vitamina C, lo que equivale al 88% de la ingesta diaria recomendada para un adulto. Este es solo un          " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las           " +
                                                  "\n respuestas sean completamente correctas, para ello se recomienda realizar más de un diagnóstico en Mi Vida para establecer            " +
                                                  "\n mayor seguridad en el tratamiento adecuado del paciente, además por su salud si la respuesta del diagnóstico no le satisface          " +
                                                  "\n del todo se recomienda consultar a su médico, Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n Es una infección pulmonar que puede ser causada por bacterias, virus o hongos, provocando fiebre, tos con flema,     " +
                                                  "\n dificultad para respirar y dolor torácico. EJERCICIO: Se recomienda actividad física ligera como caminatas suaves    " +
                                                  "\n de 15 a 20 minutos diarios para mejorar la capacidad pulmonar y reducir la fatiga, evitando esfuerzos intensos       " +
                                                  "\n que puedan comprometer la respiración. HIDRATACIÓN: Es esencial consumir al menos 3 litros de agua al día (doce      " +
                                                  "\n vasos de tamaño regular) para mantener la hidratación de las vías respiratorias y facilitar la eliminación de        " +
                                                  "\n secreciones, además de incluir caldos y jugos naturales para fortalecer el sistema inmunológico. POSIBLE TRATAMIENTO:" +
                                                  "\n Se utilizan antibióticos como la amoxicilina y la azitromicina para combatir la infección bacteriana. Marcas         " +
                                                  "\n reconocidas que contienen estos medicamentos incluyen Amoxil y Zithromax. También pueden recetarse broncodilatadores " +
                                                  "\n como el salbutamol para mejorar la respiración, con marcas como Ventolin y Aerolin. ALIMENTACIÓN: Se recomienda      " +
                                                  "\n consumir alimentos ricos en antioxidantes y propiedades antiinflamatorias que ayuden a fortalecer el sistema         " +
                                                  "\n respiratorio, tales como frutos rojos (arándanos, fresas) con antioxidantes que protegen las células, cúrcuma        " +
                                                  "\n con propiedades antiinflamatorias, y zanahorias con betacarotenos que fortalecen la respuesta inmune. Por ejemplo,   " +
                                                  "\n 100 gramos de zanahoria contienen aproximadamente 8.3 mg de betacarotenos, lo que equivale al 69% de la ingesta      " +
                                                  "\n diaria recomendada para un adulto. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no          " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas,          " +
                                                  "\n para ello se recomienda realizar más de un diagnóstico en Mi Vida para establecer mayor seguridad en el              " +
                                                  "\n tratamiento adecuado del paciente, además por su salud si la respuesta del diagnóstico no le satisface del           " +
                                                  "\n todo se recomienda consultar a su médico, Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n Es una enfermedad crónica caracterizada por niveles elevados de glucosa en sangre debido a la resistencia a la   " +
                                                  "\n insulina o la falta de producción de esta hormona. EJERCICIO: Se recomienda actividad física regular como        " +
                                                  "\n caminatas de 30 a 45 minutos diarios, natación o ejercicios de resistencia para mejorar la sensibilidad a        " +
                                                  "\n la insulina y controlar los niveles de glucosa. HIDRATACIÓN: Es fundamental consumir al menos 2.5 litros de      " +
                                                  "\n agua al día (diez vasos de tamaño regular) para mantener la hidratación celular y facilitar la eliminación       " +
                                                  "\n de toxinas, además de incluir infusiones sin azúcar para mejorar el metabolismo. POSIBLE TRATAMIENTO: Se         " +
                                                  "\n utilizan medicamentos como la metformina y la insulina para controlar los niveles de glucosa en sangre.          " +
                                                  "\n Marcas reconocidas que contienen estos medicamentos incluyen Glucophage y Lantus. También pueden recetarse       " +
                                                  "\n inhibidores de SGLT2 como la empagliflozina para mejorar la eliminación de glucosa, con marcas como Jardiance    " +
                                                  "\n y Invokana. ALIMENTACIÓN: Se recomienda consumir alimentos ricos en fibra y propiedades reguladoras de la        " +
                                                  "\n glucosa que ayuden a mejorar el metabolismo, tales como avena con fibra soluble para estabilizar los niveles     " +
                                                  "\n de azúcar, frutos secos con grasas saludables para mejorar la sensibilidad a la insulina, espinacas con          " +
                                                  "\n antioxidantes y vitamina K, y zanahorias con betacarotenos que fortalecen la respuesta inmune. Por ejemplo,      " +
                                                  "\n 100 gramos de avena contienen aproximadamente 10 gramos de fibra, lo que equivale al 40% de la ingesta diaria    " +
                                                  "\n recomendada para un adulto. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza   " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello se   " +
                                                  "\n recomienda realizar más de un diagnóstico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado  " +
                                                  "\n del paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar" +
                                                  "\n a su médico, Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n Es una enfermedad inflamatoria crónica de las vías respiratorias que provoca dificultad para respirar, tos y sibilancias.       " +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada como caminatas de 30 minutos diarios, natación o ejercicios de respiración   " +
                                                  "\n para fortalecer los músculos respiratorios y mejorar la capacidad pulmonar, evitando ambientes con contaminación o humo de      " +
                                                  "\n tabaco. HIDRATACIÓN: Es fundamental consumir al menos 2.5 litros de agua al día (diez vasos de tamaño regular) para mantener    " +
                                                  "\n la hidratación de las vías respiratorias y facilitar la eliminación de secreciones. POSIBLE TRATAMIENTO: Se utilizan            " +
                                                  "\n broncodilatadores de acción rápida como el salbutamol y de acción prolongada como el formoterol para mejorar la respiración,    " +
                                                  "\n además de corticosteroides inhalados como la fluticasona para reducir la inflamación pulmonar. Marcas reconocidas que           " +
                                                  "\n contienen estos medicamentos incluyen Ventolin, Aerolin, Seretide y Symbicort. También pueden recetarse antihistamínicos        " +
                                                  "\n en casos de asma alérgica. ALIMENTACIÓN: Se recomienda consumir alimentos ricos en antioxidantes y propiedades antiinflamatorias" +
                                                  "\n que ayuden a fortalecer el sistema respiratorio, tales como frutos rojos (arándanos, fresas) con antioxidantes que              " +
                                                  "\n las células, cúrcuma con propiedades antiinflamatorias, y zanahorias con betacarotenos que fortalecen la respuesta inmune.      " +
                                                  "\n Por ejemplo, 100 gramos de zanahoria contienen aproximadamente 8.3 mg de betacarotenos, lo que equivale al 69% de la ingesta    " +
                                                  "\n diaria recomendada para un adulto. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%   " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello se recomienda realizar      " +
                                                  "\n más de un diagnóstico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente, además por su         " +
                                                  "\n salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico, Ángel L. Montes agradece    " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n Es una infección viral que afecta el sistema inmunológico, debilitando la capacidad del cuerpo para combatir enfermedades.   " +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada como caminatas de 30 minutos diarios, yoga o ejercicios de resistencia    " +
                                                  "\n para mejorar la movilidad y reducir la fatiga, evitando esfuerzos excesivos que puedan comprometer el sistema inmunológico.  " +
                                                  "\n HIDRATACIÓN: Es fundamental consumir al menos 2.5 a 3 litros de agua al día (diez a doce vasos de tamaño regular) para       " +
                                                  "\n mantener la hidratación celular y facilitar la eliminación de toxinas, además de incluir infusiones antioxidantes como       " +
                                                  "\n té verde para fortalecer el organismo. POSIBLE TRATAMIENTO: Se utilizan medicamentos antirretrovirales como el tenofovir     " +
                                                  "\n y el dolutegravir para controlar la replicación del virus y mejorar la calidad de vida del paciente. Marcas reconocidas      " +
                                                  "\n que contienen estos medicamentos incluyen Truvada y Tivicay. También pueden recetarse fármacos de soporte como el ondansetrón" +
                                                  "\n para controlar las náuseas, con marcas como Zofran y Emeset. ALIMENTACIÓN: Se recomienda consumir alimentos ricos en         " +
                                                  "\n antioxidantes y propiedades inmunomoduladoras que ayuden a fortalecer el sistema inmunológico, tales como frutos rojos       " +
                                                  "\n (arándanos, fresas) con antioxidantes que protegen las células, cúrcuma con propiedades antiinflamatorias, brócoli con       " +
                                                  "\n sulforafano que ayuda a eliminar células dañadas, y zanahorias con betacarotenos que fortalecen la respuesta inmune.         " +
                                                  "\n Por ejemplo, 100 gramos de brócoli contienen aproximadamente 89 mg de vitamina C, lo que equivale al 99% de la ingesta       " +
                                                  "\n diaria recomendada para un adulto. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza        " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello se recomienda    " +
                                                  "\n realizar más de un diagnóstico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente, además    " +
                                                  "\n por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico, Ángel L. Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n Es una infección de transmisión sexual causada por la bacteria Neisseria gonorrhoeae, que afecta el tracto urinario     " +
                                                  "\n y reproductivo. EJERCICIO: Se recomienda actividad física moderada como caminatas de 30 minutos diarios para mejorar    " +
                                                  "\n la circulación y fortalecer el sistema inmunológico, evitando esfuerzos excesivos que puedan agravar la fatiga.         " +
                                                  "\n HIDRATACIÓN: Es fundamental consumir al menos 2 litros de agua al día (ocho vasos de tamaño regular) para mantener      " +
                                                  "\n la hidratación y ayudar a la eliminación de toxinas, además de incluir jugos naturales ricos en vitamina C para         " +
                                                  "\n fortalecer el sistema inmunológico. POSIBLE TRATAMIENTO: Se utilizan antibióticos como la ceftriaxona y la azitromicina " +
                                                  "\n para eliminar la infección. Marcas reconocidas que contienen estos medicamentos incluyen Rocephin y Zithromax. También  " +
                                                  "\n se recomienda evitar el contacto sexual hasta completar el tratamiento y realizar pruebas de seguimiento para confirmar " +
                                                  "\n la eliminación de la bacteria. ALIMENTACIÓN: Se recomienda consumir alimentos ricos en antioxidantes y propiedades      " +
                                                  "\n antibacterianas que ayuden a fortalecer el sistema inmunológico, tales como ajo con propiedades antimicrobianas, jengibre" +
                                                  "\n con efectos antiinflamatorios naturales, espinacas con antioxidantes y vitamina K, y zanahorias con betacarotenos que    " +
                                                  "\n fortalecen la respuesta inmune. Por ejemplo, 100 gramos de espinaca contienen aproximadamente 482 mcg de vitamina K, lo  " +
                                                  "\n que equivale al 402% de la ingesta diaria recomendada para un adulto. Este es solo un diagnóstico predeterminado lógico, " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente   " +
                                                  "\n correctas, para ello se recomienda realizar más de un diagnóstico en Mi Vida para establecer mayor seguridad en el       " +
                                                  "\n tratamiento adecuado del paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se       " +
                                                  "\n recomienda consultar a su médico, Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Es una infección de transmisión sexual causada por el virus del herpes simple, que provoca ampollas dolorosas en la zona        " +
                                                  "\n genital. EJERCICIO: Se recomienda actividad física moderada como caminatas de 30 minutos diarios para mejorar la circulación    " +
                                                  "\n y fortalecer el sistema inmunológico, evitando esfuerzos excesivos que puedan agravar la fatiga. HIDRATACIÓN: Es fundamental    " +
                                                  "\n consumir al menos 2 litros de agua al día (ocho vasos de tamaño regular) para mantener la hidratación y ayudar a la recuperación" +
                                                  "\n de la piel, además de incluir infusiones antioxidantes como té verde. POSIBLE TRATAMIENTO: Se utilizan antivirales como el      " +
                                                  "\n aciclovir y el valaciclovir para reducir la duración y gravedad de los brotes. Marcas reconocidas que contienen estos           " +
                                                  "\n medicamentos incluyen Zovirax y Valtrex. También pueden recetarse analgésicos como el ibuprofeno para aliviar el dolor,         " +
                                                  "\n con marcas como Advil y Flanax. ALIMENTACIÓN: Se recomienda consumir alimentos ricos en antioxidantes y propiedades             " +
                                                  "\n antivirales que ayuden a fortalecer el sistema inmunológico, tales como frutos rojos (arándanos, fresas) con antioxidantes      " +
                                                  "\n que protegen las células, cúrcuma con propiedades antiinflamatorias, y ajo con propiedades antimicrobianas. Por ejemplo,        " +
                                                  "\n 100 gramos de fresas contienen aproximadamente 59 mg de vitamina C, lo que equivale al 98% de la ingesta diaria recomendada     " +
                                                  "\n para un adulto. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente      " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello se recomienda realizar más de un diagnóstico" +
                                                  "\n en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente, además por su salud si la respuesta         " +
                                                  "\n del diagnóstico no le satisface del todo se recomienda consultar a su médico, Ángel L. Montes agradece tu visita a la           " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n Es una infección de transmisión sexual causada por la bacteria Treponema pallidum, que puede afectar múltiples órganos     " +
                                                  "\n si no se trata a tiempo. EJERCICIO: Se recomienda actividad física moderada como caminatas de 30 minutos diarios para      " +
                                                  "\n mejorar la circulación y fortalecer el sistema inmunológico, evitando esfuerzos excesivos que puedan comprometer la        " +
                                                  "\n recuperación. HIDRATACIÓN: Es fundamental consumir al menos 2.5 litros de agua al día (diez vasos de tamaño regular)       " +
                                                  "\n para mantener la hidratación celular y facilitar la eliminación de toxinas, además de incluir jugos naturales ricos        " +
                                                  "\n en vitamina C. POSIBLE TRATAMIENTO: Se utilizan antibióticos como la penicilina y la doxiciclina para eliminar la          " +
                                                  "\n infección. Marcas reconocidas que contienen estos medicamentos incluyen Benzetacil y Vibramycin. También pueden recetarse  " +
                                                  "\n analgésicos para aliviar síntomas secundarios, con marcas como Advil y Tempra. ALIMENTACIÓN: Se recomienda consumir        " +
                                                  "\n alimentos ricos en antioxidantes y propiedades antibacterianas que ayuden a fortalecer el sistema inmunológico, tales      " +
                                                  "\n como ajo con propiedades antimicrobianas, jengibre con efectos antiinflamatorios naturales, espinacas con antioxidantes    " +
                                                  "\n y vitamina K, y zanahorias con betacarotenos que fortalecen la respuesta inmune. Por ejemplo, 100 gramos de espinaca       " +
                                                  "\n contienen aproximadamente 482 mcg de vitamina K, lo que equivale al 402% de la ingesta diaria recomendada para un adulto.  " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta      " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas, para ello se recomienda realizar más de un diagnóstico      " +
                                                  "\n en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente, además por su salud si la respuesta    " +
                                                  "\n del diagnóstico no le satisface del todo se recomienda consultar a su médico, Ángel L. Montes agradece tu visita           " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB). " +
                                                  "\n Es una infección bacteriana causada por Mycobacterium tuberculosis, que afecta principalmente los pulmones y puede      " +
                                                  "\n provocar tos persistente, fiebre y pérdida de peso. EJERCICIO: Se recomienda actividad física ligera como caminatas     " +
                                                  "\n suaves de 15 a 20 minutos diarios para mejorar la capacidad pulmonar y reducir la fatiga, evitando esfuerzos intensos   " +
                                                  "\n que puedan comprometer la respiración. HIDRATACIÓN: Es esencial consumir al menos 3 litros de agua al día (doce vasos   " +
                                                  "\n de tamaño regular) para mantener la hidratación de las vías respiratorias y facilitar la eliminación de secreciones,    " +
                                                  "\n además de incluir caldos y jugos naturales para fortalecer el sistema inmunológico. POSIBLE TRATAMIENTO: Se utilizan    " +
                                                  "\n antibióticos como la isoniazida y la rifampicina para combatir la infección. Marcas reconocidas que contienen estos     " +
                                                  "\n medicamentos incluyen Rimactane y Laniazid. También pueden recetarse broncodilatadores para mejorar la respiración,     " +
                                                  "\n con marcas como Ventolin y Aerolin. ALIMENTACIÓN: Se recomienda consumir alimentos ricos en antioxidantes y propiedades " +
                                                  "\n antiinflamatorias que ayuden a fortalecer el sistema respiratorio, tales como frutos rojos (arándanos, fresas) con      " +
                                                  "\n antioxidantes que protegen las células, cúrcuma con propiedades antiinflamatorias, y zanahorias con betacarotenos que   " +
                                                  "\n fortalecen la respuesta inmune. Por ejemplo, 100 gramos de zanahoria contienen aproximadamente 8.3 mg de betacarotenos, " +
                                                  "\n lo que equivale al 69% de la ingesta diaria recomendada para un adulto. Este es solo un diagnóstico predeterminado lógico," +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente  " +
                                                  "\n correctas, para ello se recomienda realizar más de un diagnóstico en Mi Vida para establecer mayor seguridad en el      " +
                                                  "\n tratamiento adecuado del paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se      " +
                                                  "\n recomienda consultar a su médico, Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");     
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n Es una enfermedad inflamatoria que afecta las articulaciones, causando dolor, rigidez y dificultad de movimiento.    " +
                                                  "\n EJERCICIO: Se recomienda actividad física de bajo impacto como natación, yoga o caminatas moderadas de 30 minutos    " +
                                                  "\n diarios para fortalecer las articulaciones sin sobrecargarlas y mejorar la movilidad. HIDRATACIÓN: Es fundamental    " +
                                                  "\n consumir al menos 2.5 litros de agua al día (diez vasos de tamaño regular) para mantener la lubricación de las       " +
                                                  "\n articulaciones y reducir la inflamación. POSIBLE TRATAMIENTO: Se utilizan fármacos antirreumáticos modificadores     " +
                                                  "\n de la enfermedad (FAMEs) como el metotrexato y la sulfasalazina para reducir la inflamación y el daño articular.     " +
                                                  "\n Marcas reconocidas que contienen estos medicamentos incluyen Metoject y Salazopyrin. También pueden recetarse        " +
                                                  "\n antiinflamatorios no esteroideos (AINEs) como el ibuprofeno y el naproxeno para aliviar el dolor, con marcas         " +
                                                  "\n como Advil y Flanax. ALIMENTACIÓN: Se recomienda consumir alimentos ricos en antioxidantes y propiedades             " +
                                                  "\n antiinflamatorias que ayuden a fortalecer las articulaciones, tales como pescados grasos (salmón, atún, sardina)     " +
                                                  "\n con Omega-3, cítricos (naranjas, limones, toronjas) con vitamina C, verduras de hoja verde (espinacas, kale, acelgas)" +
                                                  "\n con vitamina K, jengibre y cúrcuma con efectos antiinflamatorios naturales, y frutos secos (almendras, nueces) con   " +
                                                  "\n magnesio. Por ejemplo, 100 gramos de naranja contienen aproximadamente 53 mg de vitamina C, lo que equivale al 88%   " +
                                                  "\n de la ingesta diaria recomendada para un adulto. Este es solo un diagnóstico predeterminado lógico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para  " +
                                                  "\n ello se recomienda realizar más de un diagnóstico en Mi Vida para establecer mayor seguridad en el tratamiento       " +
                                                  "\n adecuado del paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda    " +
                                                  "\n consultar a su médico, Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Es una infección bacteriana altamente contagiosa que afecta las vías respiratorias, causando ataques de tos intensos    " +
                                                  "\n y persistentes. EJERCICIO: Se recomienda actividad física moderada sin sobreesfuerzo, evitando ambientes fríos o        " +
                                                  "\n contaminados que puedan agravar los síntomas, con caminatas ligeras de 20 a 30 minutos diarios para mejorar la          " +
                                                  "\n capacidad pulmonar. HIDRATACIÓN: Es fundamental consumir al menos 2.5 litros de agua al día (diez vasos de tamaño       " +
                                                  "\n regular) para mantener las vías respiratorias hidratadas y reducir la irritación de la garganta, además de incluir      " +
                                                  "\n infusiones tibias para aliviar la tos. POSIBLE TRATAMIENTO: Se utilizan antibióticos como la azitromicina y             " +
                                                  "\n claritromicina para combatir la infección y reducir el periodo de contagio. Marcas reconocidas que contienen estos      " +
                                                  "\n medicamentos incluyen Zithromax y Klaricid. También se pueden emplear medicamentos para aliviar la tos y la inflamación," +
                                                  "\n como el paracetamol, con marcas como Tempra y Tylenol. ALIMENTACIÓN: Se recomienda consumir alimentos que ayuden a      " +
                                                  "\n fortalecer el sistema inmunológico y reducir la inflamación, tales como cítricos (naranjas, limones, toronjas) con      " +
                                                  "\n vitamina C, miel con propiedades antibacterianas, jengibre con efectos antiinflamatorios naturales y ajo con propiedades" +
                                                  "\n antimicrobianas. Por ejemplo, 100 gramos de limón contienen aproximadamente 53 mg de vitamina C, lo que equivale al 88% " +
                                                  "\n de la ingesta diaria recomendada para un adulto. Este es solo un diagnóstico predeterminado lógico, haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello" +
                                                  "\n se recomienda realizar más de un diagnóstico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del  " +
                                                  "\n paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su     " +
                                                  "\n médico, Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Es una infección viral que causa inflamación de las glándulas salivales y puede afectar otras partes del cuerpo.    " +
                                                  "\n EJERCICIO: Se recomienda reposo y evitar actividades físicas intensas durante la fase aguda de la enfermedad,       " +
                                                  "\n retomando ejercicios ligeros como estiramientos y caminatas suaves una vez que los síntomas disminuyan.             " +
                                                  "\n HIDRATACIÓN: Es importante consumir al menos 2 litros de agua al día (ocho vasos de tamaño regular) para mantener   " +
                                                  "\n la hidratación y aliviar la inflamación de las glándulas, además de incluir caldos y jugos naturales para facilitar " +
                                                  "\n la recuperación. POSIBLE TRATAMIENTO: No existe un tratamiento específico, pero se pueden utilizar analgésicos como " +
                                                  "\n el ibuprofeno y paracetamol para reducir el dolor y la inflamación. Marcas reconocidas que contienen estos          " +
                                                  "\n medicamentos incluyen Advil y Flanax para el ibuprofeno, y Tempra y Tylenol para el paracetamol. También se         " +
                                                  "\n recomienda el uso de compresas frías en la zona afectada para aliviar la inflamación y el dolor. ALIMENTACIÓN:      " +
                                                  "\n Se recomienda consumir alimentos suaves y fáciles de masticar que ayuden a reducir la inflamación y fortalecer      " +
                                                  "\n el sistema inmunológico, tales como yogur con probióticos para mejorar la salud digestiva, papaya con enzimas que   " +
                                                  "\n facilitan la digestión y reducen la inflamación, y espinacas con antioxidantes y vitamina K. Por ejemplo, 100 gramos" +
                                                  "\n de papaya contienen aproximadamente 60 mg de vitamina C, lo que equivale al 100% de la ingesta diaria recomendada   " +
                                                  "\n para un adulto. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el   " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello se recomienda realizar " +
                                                  "\n más de un diagnóstico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente, además por" +
                                                  "\n su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico, Ángel L. Montes" +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n Es una infección viral transmitida por mosquitos que puede causar fiebre, erupciones cutáneas y dolor muscular.      " +
                                                  "\n EJERCICIO: Se recomienda actividad física ligera como yoga o caminatas suaves de 15 a 20 minutos diarios para        " +
                                                  "\n mejorar la circulación y reducir la fatiga, evitando esfuerzos excesivos que puedan agravar los síntomas.            " +
                                                  "\n HIDRATACIÓN: Es esencial consumir al menos 2.5 litros de agua al día (diez vasos de tamaño regular) para prevenir    " +
                                                  "\n la deshidratación y ayudar a la eliminación de toxinas, además de incluir agua de coco y jugos naturales para reponer" +
                                                  "\n electrolitos. POSIBLE TRATAMIENTO: No existe un tratamiento específico, pero se pueden utilizar analgésicos como el  " +
                                                  "\n paracetamol para aliviar la fiebre y el dolor. Marcas reconocidas que contienen este medicamento incluyen Tempra y   " +
                                                  "\n Tylenol. También se recomienda reposo y una adecuada hidratación para facilitar la recuperación. ALIMENTACIÓN: Se    " +
                                                  "\n recomienda consumir alimentos ricos en antioxidantes y propiedades antiinflamatorias que ayuden a fortalecer el      " +
                                                  "\n sistema inmunológico, tales como frutos rojos (arándanos, fresas) con antioxidantes que protegen las células, cúrcuma" +
                                                  "\n con propiedades antiinflamatorias, y zanahorias con betacarotenos que fortalecen la respuesta inmune. Por ejemplo,   " +
                                                  "\n 100 gramos de fresas contienen aproximadamente 59 mg de vitamina C, lo que equivale al 98% de la ingesta diaria      " +
                                                  "\n recomendada para un adulto. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al    " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello se recomienda" +
                                                  "\n realizar más de un diagnóstico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente,   " +
                                                  "\n además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico,    " +
                                                  "\n Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n Es una infección viral que causa gastroenteritis severa, provocando diarrea, vómitos y fiebre. EJERCICIO: Se recomienda       " +
                                                  "\n actividad física ligera como caminatas suaves de 15 a 20 minutos diarios para evitar la fatiga y mejorar la recuperación,     " +
                                                  "\n evitando esfuerzos intensos que puedan agravar la deshidratación. HIDRATACIÓN: Es esencial consumir al menos 3 litros de      " +
                                                  "\n agua al día (doce vasos de tamaño regular) para reponer líquidos perdidos por la diarrea y los vómitos, además de incluir     " +
                                                  "\n soluciones de rehidratación oral como Pedialyte para equilibrar electrolitos. POSIBLE TRATAMIENTO: No existe un tratamiento   " +
                                                  "\n específico, pero se recomienda el uso de soluciones de rehidratación oral para prevenir la deshidratación. También pueden     " +
                                                  "\n utilizarse medicamentos para aliviar los síntomas, como el paracetamol para la fiebre y el dolor. Marcas reconocidas que      " +
                                                  "\n contienen estos medicamentos incluyen Tempra y Tylenol. ALIMENTACIÓN: Se recomienda consumir alimentos fáciles de digerir     " +
                                                  "\n y ricos en nutrientes esenciales para la recuperación, tales como arroz blanco, plátanos ricos en potasio para reponer        " +
                                                  "\n electrolitos, zanahorias con betacarotenos que fortalecen el sistema digestivo, y yogur con probióticos para restaurar        " +
                                                  "\n la flora intestinal. Por ejemplo, 100 gramos de plátano contienen aproximadamente 358 mg de potasio, lo que equivale al       " +
                                                  "\n 8% de la ingesta diaria recomendada para un adulto. Este es solo un diagnóstico predeterminado lógico, haberlo consultado     " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello      " +
                                                  "\n se recomienda realizar más de un diagnóstico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del        " +
                                                  "\n paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su médico,   " +
                                                  "\n Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n Es una infección bacteriana causada por Listeria monocytogenes, que puede provocar fiebre, dolor muscular y síntomas    " +
                                                  "\n gastrointestinales. EJERCICIO: Se recomienda actividad física moderada como caminatas de 30 minutos diarios para        " +
                                                  "\n mejorar la circulación y fortalecer el sistema inmunológico, evitando esfuerzos excesivos que puedan agravar la fatiga. " +
                                                  "\n HIDRATACIÓN: Es fundamental consumir al menos 2.5 litros de agua al día (diez vasos de tamaño regular) para mantener    " +
                                                  "\n la hidratación y ayudar a la eliminación de toxinas, además de incluir caldos y jugos naturales para facilitar la       " +
                                                  "\n recuperación. POSIBLE TRATAMIENTO: Se utilizan antibióticos como la ampicilina y la gentamicina para combatir la        " +
                                                  "\n infección. Marcas reconocidas que contienen estos medicamentos incluyen Ampicilina MK y Gentamicina Normon. También     " +
                                                  "\n se recomienda reposo y una adecuada hidratación para facilitar la recuperación. ALIMENTACIÓN: Se recomienda consumir    " +
                                                  "\n alimentos ricos en antioxidantes y propiedades antibacterianas que ayuden a fortalecer el sistema inmunológico, tales   " +
                                                  "\n como ajo con propiedades antimicrobianas, jengibre con efectos antiinflamatorios naturales, espinacas con antioxidantes " +
                                                  "\n y vitamina K, y zanahorias con betacarotenos que fortalecen la respuesta inmune. Por ejemplo, 100 gramos de zanahoria   " +
                                                  "\n contienen aproximadamente 8.3 mg de betacarotenos, lo que equivale al 69% de la ingesta diaria recomendada para un adulto." +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta   " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas, para ello se recomienda realizar más de un diagnóstico   " +
                                                  "\n en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente, además por su salud si la respuesta " +
                                                  "\n del diagnóstico no le satisface del todo se recomienda consultar a su médico, Ángel L. Montes agradece tu visita a      " +
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n Es una infección bacteriana causada por Shigella, que afecta el sistema digestivo y provoca diarrea, fiebre y dolor    " +
                                                  "\n abdominal. EJERCICIO: Se recomienda actividad física ligera como estiramientos y caminatas suaves de 15 a 20 minutos   " +
                                                  "\n diarios para mejorar la circulación y reducir la fatiga, evitando esfuerzos intensos que puedan agravar los síntomas.  " +
                                                  "\n HIDRATACIÓN: Es esencial consumir al menos 3 litros de agua al día (doce vasos de tamaño regular) para prevenir la     " +
                                                  "\n deshidratación y ayudar a la eliminación de toxinas, además de incluir soluciones de rehidratación oral para equilibrar" +
                                                  "\n electrolitos. POSIBLE TRATAMIENTO: Se utilizan antibióticos como la ciprofloxacina y la azitromicina para combatir la  " +
                                                  "\n infección. Marcas reconocidas que contienen estos medicamentos incluyen Ciproxina y Zithromax. También se recomienda   " +
                                                  "\n reposo y una adecuada hidratación para facilitar la recuperación. ALIMENTACIÓN: Se recomienda consumir alimentos ricos " +
                                                  "\n en fibra y propiedades antibacterianas que ayuden a fortalecer el sistema digestivo, tales como arroz integral con fibra" +
                                                  "\n para mejorar la digestión, plátanos ricos en potasio para reponer electrolitos, yogur con probióticos para restaurar        " +
                                                  "\n la flora intestinal, y cúrcuma con propiedades antiinflamatorias. Por ejemplo, 100 gramos de yogur contienen aproximadamente" +
                                                  "\n 3.5 gramos de proteína, lo que equivale al 7% de la ingesta diaria recomendada para un adulto. Este es solo un diagnóstico  " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas  " +
                                                  "\n sean completamente correctas, para ello se recomienda realizar más de un diagnóstico en Mi Vida para establecer mayor       " +
                                                  "\n seguridad en el tratamiento adecuado del paciente, además por su salud si la respuesta del diagnóstico no le satisface      " +
                                                  "\n del todo se recomienda consultar a su médico, Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n Es una afección respiratoria crónica que causa dificultad para respirar debido a la obstrucción del flujo de aire en los          " +
                                                  "\n pulmones. EJERCICIO: Se recomienda actividad física moderada como caminatas de 30 a 45 minutos diarios, natación o ejercicios     " +
                                                  "\n de respiración para fortalecer los músculos respiratorios y mejorar la capacidad pulmonar, evitando ambientes con contaminación   " +
                                                  "\n o humo de tabaco. HIDRATACIÓN: Es fundamental consumir al menos 2.5 litros de agua al día (diez vasos de tamaño regular) para     " +
                                                  "\n mantener la hidratación de las vías respiratorias y facilitar la eliminación de secreciones. POSIBLE TRATAMIENTO: Se utilizan     " +
                                                  "\n broncodilatadores de acción prolongada como el salmeterol y el formoterol para mejorar la respiración, además de corticosteroides " +
                                                  "\n inhalados como la fluticasona para reducir la inflamación pulmonar. Marcas reconocidas que contienen estos medicamentos incluyen  " +
                                                  "\n Seretide y Symbicort. También pueden recetarse mucolíticos como la acetilcisteína para facilitar la expulsión de flemas, con      " +
                                                  "\n marcas como Fluimucil y Bisolvon. ALIMENTACIÓN: Se recomienda consumir alimentos ricos en antioxidantes y propiedades             " +
                                                  "\n antiinflamatorias que ayuden a fortalecer el sistema respiratorio, tales como frutos rojos (arándanos, fresas) con                " +
                                                  "\n antioxidantes que protegen las células, cúrcuma con propiedades antiinflamatorias, y zanahorias con betacarotenos que             " +
                                                  "\n fortalecen la respuesta inmune. Por ejemplo, 100 gramos de zanahoria contienen aproximadamente 8.3 mg de betacarotenos,           " +
                                                  "\n lo que equivale al 69% de la ingesta diaria recomendada para un adulto. Este es solo un diagnóstico predeterminado lógico,        " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente            " +
                                                  "\n correctas, para ello se recomienda realizar más de un diagnóstico en Mi Vida para establecer mayor seguridad en el tratamiento    " +
                                                  "\n adecuado del paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar       " +
                                                  "\n a su médico, Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n Es una infección de transmisión sexual causada por la bacteria Chlamydia trachomatis, que puede afectar el sistema urinario  " +
                                                  "\n y reproductivo. EJERCICIO: Se recomienda actividad física moderada como caminatas de 30 minutos diarios para mejorar la      " +
                                                  "\n circulación y fortalecer el sistema inmunológico, evitando esfuerzos excesivos que puedan agravar la fatiga.                 " +
                                                  "\n HIDRATACIÓN: Es fundamental consumir al menos 2 litros de agua al día (ocho vasos de tamaño regular) para mantener la        " +
                                                  "\n hidratación y ayudar a la eliminación de toxinas, además de incluir jugos naturales ricos en vitamina C para fortalecer      " +
                                                  "\n el sistema inmunológico. POSIBLE TRATAMIENTO: Se utilizan antibióticos como la azitromicina y la doxiciclina para eliminar   " +
                                                  "\n la infección. Marcas reconocidas que contienen estos medicamentos incluyen Zithromax y Vibramycin. También se recomienda     " +
                                                  "\n evitar el contacto sexual hasta completar el tratamiento y realizar pruebas de seguimiento para confirmar la eliminación     " +
                                                  "\n de la bacteria. ALIMENTACIÓN: Se recomienda consumir alimentos ricos en antioxidantes y propiedades antibacterianas que      " +
                                                  "\n ayuden a fortalecer el sistema inmunológico, tales como ajo con propiedades antimicrobianas, jengibre con efectos            " +
                                                  "\n antiinflamatorios naturales, espinacas con antioxidantes y vitamina K, y zanahorias con betacarotenos que fortalecen         " +
                                                  "\n la respuesta inmune. Por ejemplo, 100 gramos de espinaca contienen aproximadamente 482 mcg de vitamina K, lo que equivale    " +
                                                  "\n al 402% de la ingesta diaria recomendada para un adulto. Este es solo un diagnóstico predeterminado lógico, haberlo          " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas,    " +
                                                  "\n para ello se recomienda realizar más de un diagnóstico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado " +
                                                  "\n del paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a su      " +
                                                  "\n médico, Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n Es una infección grave que causa inflamación de las membranas que rodean el cerebro y la médula espinal, pudiendo provocar  " +
                                                  "\n fiebre alta, rigidez en el cuello y alteraciones neurológicas. EJERCICIO: Se recomienda reposo absoluto durante la fase     " +
                                                  "\n aguda de la enfermedad, retomando actividad física ligera como caminatas suaves de 15 a 20 minutos diarios una vez que      " +
                                                  "\n los síntomas disminuyan para mejorar la circulación y la recuperación. HIDRATACIÓN: Es esencial consumir al menos 3 litros  " +
                                                  "\n de agua al día (doce vasos de tamaño regular) para prevenir la deshidratación y ayudar a la eliminación de toxinas, además  " +
                                                  "\n de incluir caldos y jugos naturales para facilitar la recuperación. POSIBLE TRATAMIENTO: Se utilizan antibióticos           " +
                                                  "\n intravenosos como la ceftriaxona y la vancomicina para combatir la infección. Marcas reconocidas que contienen estos        " +
                                                  "\n medicamentos incluyen Rocephin y Vancocin. También pueden recetarse corticosteroides como la dexametasona para reducir      " +
                                                  "\n la inflamación cerebral, con marcas como Decadron y Maxidex. ALIMENTACIÓN: Se recomienda consumir alimentos ricos en        " +
                                                  "\n antioxidantes y propiedades antiinflamatorias que ayuden a fortalecer el sistema inmunológico, tales como frutos rojos      " +
                                                  "\n (arándanos, fresas) con antioxidantes que protegen las células, cúrcuma con propiedades antiinflamatorias, y zanahorias     " +
                                                  "\n con betacarotenos que fortalecen la respuesta inmune. Por ejemplo, 100 gramos de fresas contienen aproximadamente 59 mg     " +
                                                  "\n de vitamina C, lo que equivale al 98% de la ingesta diaria recomendada para un adulto. Este es solo un diagnóstico          " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas  " +
                                                  "\n sean completamente correctas, para ello se recomienda realizar más de un diagnóstico en Mi Vida para establecer mayor       " +
                                                  "\n seguridad en el tratamiento adecuado del paciente, además por su salud si la respuesta del diagnóstico no le satisface      " +
                                                  "\n del todo se recomienda consultar a su médico, Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n Es una enfermedad caracterizada por el crecimiento descontrolado de células anormales en el cuerpo, pudiendo afectar distintos   " +
                                                  "\n órganos y sistemas. EJERCICIO: Se recomienda actividad física moderada adaptada a la condición del paciente, como caminatas de   " +
                                                  "\n 30 minutos diarios, yoga o ejercicios de resistencia para mejorar la movilidad y reducir la fatiga, evitando esfuerzos excesivos " +
                                                  "\n que puedan comprometer el sistema inmunológico. HIDRATACIÓN: Es fundamental consumir al menos 2.5 a 3 litros de agua al día      " +
                                                  "\n (diez a doce vasos de tamaño regular) para mantener la hidratación celular y facilitar la eliminación de toxinas, además de      " +
                                                  "\n incluir infusiones antioxidantes como té verde para fortalecer el organismo. POSIBLE TRATAMIENTO: Dependiendo del tipo de cáncer," +
                                                  "\n el tratamiento puede incluir quimioterapia, radioterapia, inmunoterapia o cirugía. Se utilizan medicamentos como el paclitaxel   " +
                                                  "\n y el cisplatino para combatir el crecimiento celular anormal. Marcas reconocidas que contienen estos medicamentos incluyen Taxol " +
                                                  "\n y Platinol. También pueden recetarse fármacos de soporte como el ondansetrón para controlar las náuseas, con marcas como Zofran  " +
                                                  "\n y Emeset. ALIMENTACIÓN: Se recomienda consumir alimentos ricos en antioxidantes y propiedades anticancerígenas que ayuden a      " +
                                                  "\n fortalecer el sistema inmunológico, tales como frutos rojos (arándanos, fresas) con antioxidantes que protegen las células,      " +
                                                  "\n cúrcuma con propiedades antiinflamatorias, brócoli con sulforafano que ayuda a eliminar células dañadas, y zanahorias con        " +
                                                  "\n betacarotenos que fortalecen la respuesta inmune. Por ejemplo, 100 gramos de brócoli contienen aproximadamente 89 mg de          " +
                                                  "\n vitamina C, lo que equivale al 99% de la ingesta diaria recomendada para un adulto. Este es solo un diagnóstico predeterminado   " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente   " +
                                                  "\n correctas, para ello se recomienda realizar más de un diagnóstico en Mi Vida para establecer mayor seguridad en el tratamiento   " +
                                                  "\n adecuado del paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se recomienda consultar a    " +
                                                  "\n su médico, Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                    }
                }
        if (EdadMasculino.equals("Juventud = 22-29 años")) {
            frame.setVisible(true);
        } else {
            frame.setVisible(false);
        }
        }
        public Estudio4() {
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
        Estudio4 ventanaEstudio4 = new Estudio4();
        ventanaEstudio4.crearInterfaz();
    }
}