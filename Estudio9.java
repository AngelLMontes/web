import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Estudio9 implements ActionListener{
    
         protected final JLabel label1;
         protected JScrollPane scrollpane1;
         protected JTextArea textarea1;
         private JFrame frame;
         private final String edadEsperada = "Adolescencia = 10-21 años";
         private String edadRecibida;
         
        public Estudio9(String nombrePaciente, String Sexo, String EdadFemenino, 
        String EstaturaFemenino, String Enfermedad) {
            
        this.frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Resultado Final Del Diagnostico del Paciente");
        frame.setIconImage(new ImageIcon(getClass().getResource("images/Portadax.png")).getImage());
        
        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setBackground(new Color(224, 224, 224));
        textarea1.setForeground(new Color(0, 0, 0));
        textarea1.setText("Este es el resultado de tu Diagnostico");
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
        this.edadRecibida = EdadFemenino;
    
        
             if(Sexo.equals("Femenino")){
                 if(EdadFemenino.equals("Adolescencia = 10-21 años")){
                        if(EstaturaFemenino.equals("0.80-1.35 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe). " +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física moderada a intensa diariamente, con una duración      " +
                                                  "\n aproximada de 60 minutos, aunque esta cantidad puede ajustarse según su condición. Actividades como caminatas, ejercicios    " +
                                                  "\n aeróbicos, natación y deportes de bajo impacto pueden ser beneficiosos para fortalecer su sistema inmunológico y mejorar     " +
                                                  "\n la recuperación. HIDRATACIÓN: Es fundamental el consumo diario de 2 litros de agua (ocho vasos de tamaño regular) para       " +
                                                  "\n mantener una hidratación adecuada y ayudar al cuerpo a combatir la enfermedad. También se recomienda el consumo de           " +
                                                  "\n infusiones calientes como té de jengibre o manzanilla para aliviar los síntomas respiratorios. POSIBLE TRATAMIENTO: Para     " +
                                                  "\n la gripe en adolescentes, el tratamiento suele incluir medicamentos para reducir la fiebre y aliviar los síntomas, como      " +
                                                  "\n el paracetamol (Tempra) o el ibuprofeno. En casos específicos, se pueden utilizar antivirales como el oseltamivir (Tamiflu). " +
                                                  "\n ALIMENTACIÓN: Es recomendable el consumo de frutas y verduras que fortalezcan el sistema inmune, tales como: Naranjas,       " +
                                                  "\n ricas en vitamina C (aportan aproximadamente el 89% del requerimiento diario por cada 100 g), que ayuda a fortalecer el      " +
                                                  "\n sistema inmunológico y reducir la duración de los síntomas. Fresas, con antioxidantes y vitamina C (aportan cerca del 98%    " +
                                                  "\n del requerimiento diario por cada 100 g), esenciales para la protección celular y la recuperación del organismo. Plátanos,   " +
                                                  "\n ricos en potasio (aportan alrededor del 10% del requerimiento diario por cada 100 g), que ayuda a reemplazar los             " +
                                                  "\n electrolitos perdidos por fiebre y sudoración. Kiwi, con vitamina C (aproximadamente el 93% del requerimiento diario por     " +
                                                  "\n cada 100 g) y potasio, que contribuyen a la función inmunológica y la recuperación del cuerpo. Este es solo un diagnóstico   " +
                                                  "\n predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas   " +
                                                  "\n sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar más de un diagnóstico y consultar    " +
                                                  "\n a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física de baja intensidad, evitando esfuerzos excesivos     " +
                                                  "\n y asegurando un descanso adecuado para la recuperación. Actividades como caminatas suaves, ejercicios de respiración y      " +
                                                  "\n yoga pueden ser beneficiosos para mantener el cuerpo activo sin comprometer la recuperación. También se recomienda          " +
                                                  "\n ejercicios de expansión torácica y fortalecimiento de los músculos respiratorios para mejorar la capacidad pulmonar.        " +
                                                  "\n HIDRATACIÓN: Es fundamental el consumo diario de 2 litros de agua (ocho vasos de tamaño regular) para mantener una          " +
                                                  "\n hidratación óptima y ayudar a fluidificar las secreciones pulmonares. También se recomienda el consumo de caldos y sopas    " +
                                                  "\n calientes para facilitar la digestión y evitar irritaciones en el tracto respiratorio. POSIBLE TRATAMIENTO: Para la neumonía " +
                                                  "\n en adolescentes, el tratamiento suele incluir antibióticos como la amoxicilina o azitromicina en caso de infecciones         " +
                                                  "\n bacterianas, además de medicamentos para reducir la fiebre y aliviar los síntomas, como el paracetamol. En casos graves,     " +
                                                  "\n puede requerirse hospitalización y oxigenoterapia. ALIMENTACIÓN: Es recomendable el consumo de alimentos que fortalezcan     " +
                                                  "\n el sistema inmune y ayuden a la recuperación, tales como: Naranjas, ricas en vitamina C (aportan aproximadamente el 89%      " +
                                                  "\n del requerimiento diario por cada 100 g), que ayuda a fortalecer el sistema inmunológico y reducir la duración de los        " +
                                                  "\n síntomas. Espinacas, con hierro (aproximadamente el 15% del requerimiento diario por cada 100 g), que contribuye a la        " +
                                                  "\n producción de glóbulos rojos y mejora la oxigenación del cuerpo. Yogur, con probióticos que favorecen la salud intestinal    " +
                                                  "\n y fortalecen el sistema inmune. También se recomienda el consumo de alimentos ricos en zinc para mejorar la respuesta inmune " +
                                                  "\n y acelerar la recuperación. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que   " +
                                                  "\n el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado, se  " +
                                                  "\n recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y  " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física moderada diariamente, con una duración              " +
                                                  "\n aproximada de 60 minutos, incluyendo ejercicios aeróbicos como caminar, correr o nadar, para mejorar la sensibilidad       " +
                                                  "\n a la insulina. También se recomienda la práctica de ejercicios de resistencia como el yoga o el entrenamiento ligero       " +
                                                  "\n con pesas para mejorar el metabolismo de la glucosa. HIDRATACIÓN: Es fundamental el consumo diario de 2 litros de agua     " +
                                                  "\n (ocho vasos de tamaño regular) para ayudar a mantener niveles adecuados de glucosa en sangre y prevenir la                 " +
                                                  "\n deshidratación. También se recomienda el consumo de bebidas sin azúcar como infusiones naturales o agua con limón.         " +
                                                  "\n POSIBLE TRATAMIENTO: Para la diabetes en adolescentes, el tratamiento suele incluir insulina en el caso de diabetes        " +
                                                  "\n tipo 1, mientras que en diabetes tipo 2 puede requerirse metformina y cambios en el estilo de vida. Es esencial el         " +
                                                  "\n monitoreo constante de la glucosa en sangre y el seguimiento médico. ALIMENTACIÓN: Es recomendable el consumo de           " +
                                                  "\n alimentos que ayuden a regular los niveles de glucosa y fortalezcan el organismo, tales como: Avena, rica en fibra         " + 
                                                  "\n soluble (aproximadamente el 10% del requerimiento diario por cada 100 g), que ayuda a estabilizar los niveles de azúcar    " +
                                                  "\n en sangre. Frutos secos, con grasas saludables y magnesio (aproximadamente el 15% del requerimiento diario por cada 100 g),  " +
                                                  "\n que contribuyen a la regulación de la glucosa. Legumbres, con proteínas vegetales y fibra (aproximadamente el 20% del        " +
                                                  "\n requerimiento diario por cada 100 g), que favorecen la saciedad y el control de la glucosa. También se recomienda el         " +
                                                  "\n consumo de alimentos ricos en ácidos grasos Omega-3 para mejorar la función metabólica y reducir la inflamación. Este        " +
                                                  "\n es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad  " +
                                                  "\n ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar más de un   " +
                                                  "\n diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para mantener     " +
                                                  "\n las vías respiratorias hidratadas y reducir la viscosidad de las secreciones, lo que facilita la respiración. La               " +
                                                  "\n deshidratación puede agravar los síntomas del asma, aumentando la irritación de las vías respiratorias y la frecuencia de      " +
                                                  "\n los episodios de tos. Es importante consumir líquidos ricos en electrolitos, como sueros orales y caldos, para mantener el     " +
                                                  "\n equilibrio de minerales esenciales. También se recomienda el consumo de infusiones suaves, como manzanilla o jengibre, que     " +
                                                  "\n pueden ayudar a reducir la inflamación y mejorar la función pulmonar. EJERCICIO: La actividad física debe ser moderada y       " +
                                                  "\n adaptada, evitando esfuerzos excesivos que puedan desencadenar crisis asmáticas, ejercicios como natación, yoga y caminatas    " +
                                                  "\n suaves pueden ser beneficiosos para mejorar la capacidad pulmonar y reducir la inflamación. POSIBLE TRATAMIENTO: El            " +
                                                  "\n tratamiento estándar para el asma en adolescentes incluye broncodilatadores de alivio rápido como salbutamol, además de        " +
                                                  "\n corticosteroides inhalados como fluticasona o budesonida, en México algunas marcas reconocidas incluyen Ventolin (salbutamol)  " +
                                                  "\n y Pulmicort (budesonida), en casos más severos pueden utilizarse biológicos como omalizumab, bajo estricta supervisión médica. " +
                                                  "\n ALIMENTACIÓN: Para fortalecer el sistema respiratorio y reducir la inflamación, se recomienda el consumo de alimentos ricos    " +
                                                  "\n en omega-3, antioxidantes y vitamina C. Salmón y chía: Contienen aproximadamente 2-4 g de omega-3 por cada 100 g, lo que ayuda " +
                                                  "\n a reducir la inflamación de las vías respiratorias. Fresas y arándanos: Aportan 50-90 mg de vitamina C por cada 100 g,         " +
                                                  "\n cubriendo hasta el 100% de la ingesta diaria recomendada, fortaleciendo el sistema inmunológico. Jengibre y cúrcuma: Poseen    " +
                                                  "\n propiedades antiinflamatorias y antioxidantes, ayudando a reducir la irritación de las vías respiratorias. Este es solo un     " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las    " +
                                                  "\n respuestas sean completamente correctas, para mayor seguridad se recomienda realizar más de un diagnóstico y consultar a un    " +
                                                  "\n médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tamaño regular) para          " +
                                                  "\n mantener la hidratación y reducir la fatiga, lo que es fundamental en el proceso de recuperación. El VIH puede           " +
                                                  "\n provocar fiebre, sudoración nocturna y diarrea, lo que aumenta el riesgo de deshidratación. Es esencial consumir         " +
                                                  "\n líquidos ricos en electrolitos, como sueros orales y caldos, para reponer los minerales perdidos. También se             " +
                                                  "\n recomienda el consumo de agua con limón o infusiones suaves, que pueden ayudar a aliviar las náuseas y mejorar la        " +
                                                  "\n digestión. EJERCICIO: La actividad física debe ser moderada y adaptada, evitando esfuerzos excesivos que puedan          " +
                                                  "\n debilitar el sistema inmunológico, ejercicios como yoga, caminatas suaves y natación pueden ser beneficiosos para        " +
                                                  "\n mejorar la resistencia y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento para el VIH en adolescentes incluye      " +
                                                  "\n terapia antirretroviral (TAR) con medicamentos como tenofovir, emtricitabina y dolutegravir, en México algunas marcas    " +
                                                  "\n reconocidas incluyen Truvada (tenofovir/emtricitabina) y Tivicay (dolutegravir), además se recomienda el uso de terapias    " +
                                                  "\n complementarias como apoyo nutricional y psicológico para mejorar la calidad de vida del paciente. ALIMENTACIÓN: Para       " +
                                                  "\n fortalecer el sistema inmunológico y apoyar la recuperación, se recomienda el consumo de alimentos ricos en antioxidantes,  " +
                                                  "\n proteínas y ácidos grasos esenciales. Brócoli y zanahorias: Contienen aproximadamente 50-80 mg de vitamina C por cada       " +
                                                  "\n 100 g, lo que representa hasta el 90% de la ingesta diaria recomendada, fortaleciendo el sistema inmunológico. Salmón       " +
                                                  "\n y chía: Son fuentes de omega-3, proporcionando entre 2-4 g por cada 100 g, lo que ayuda a reducir la inflamación y mejorar  " +
                                                  "\n la función celular. Frutas y verduras de colores vivos: Como arándanos y espinacas, que son ricas en antioxidantes y ayudan   " +
                                                  "\n a proteger las células del daño. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%   " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se recomienda  " +
                                                  "\n realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida)  " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para        " +
                                                  "\n mantener la hidratación y ayudar a reducir la inflamación, lo que es fundamental en el proceso de recuperación.          " +
                                                  "\n La gonorrea puede provocar fiebre, dolor abdominal y secreción anormal, lo que aumenta el riesgo de deshidratación.      " +
                                                  "\n Es esencial consumir líquidos ricos en electrolitos, como sueros orales y caldos, para reponer los minerales perdidos.   " +
                                                  "\n También se recomienda el consumo de infusiones suaves, como manzanilla o jengibre, que pueden ayudar a aliviar las       " +
                                                  "\n molestias digestivas y mejorar la absorción de nutrientes. EJERCICIO: La actividad física debe ser muy ligera y          " +
                                                  "\n supervisada, evitando esfuerzos excesivos que puedan agravar los síntomas, ejercicios de respiración profunda y          " +
                                                  "\n movilidad suave pueden ser beneficiosos para mejorar la circulación y reducir la fatiga. POSIBLE TRATAMIENTO: El         " +
                                                  "\n tratamiento estándar para la gonorrea en adolescentes incluye antibióticos como ceftriaxona y azitromicina, administrados  " +
                                                  "\n en una sola dosis, en México algunas marcas reconocidas incluyen Rocephin (ceftriaxona) y Zithromax (azitromicina),        " +
                                                  "\n además se recomienda reposo absoluto y una dieta adecuada para mejorar la recuperación. ALIMENTACIÓN: Para fortalecer      " +
                                                  "\n el sistema inmunológico y apoyar la recuperación, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes " +
                                                  "\n y proteínas. Naranjas y fresas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa hasta   " +
                                                  "\n el 100% de la ingesta diaria recomendada, fortaleciendo el sistema inmunológico y ayudando a reducir la inflamación.       " +
                                                  "\n Espinacas y lentejas: Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25% y 40% de la ingesta      " +
                                                  "\n diaria recomendada, lo que ayuda a mejorar la oxigenación celular y reducir el cansancio. Carnes magras y huevos: Son una  " +
                                                  "\n fuente importante de proteínas, proporcionando entre 20 y 25 g por cada 100 g, lo que equivale al 40-50% de la recomendación  " +
                                                  "\n diaria, esenciales para la regeneración celular y el fortalecimiento muscular. Este es solo un diagnóstico predeterminado     " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente" +
                                                  "\n correctas, para mayor seguridad se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACIÓN: Mantener una hidratación adecuada es esencial para fortalecer el sistema inmunológico y reducir la        " +
                                                  "\n inflamación causada por el virus. Se recomienda el consumo diario de 1.5 a 2 litros de agua, además de infusiones      " +
                                                  "\n de manzanilla y jengibre, que poseen propiedades antiinflamatorias y pueden ayudar a aliviar el malestar.              " +
                                                  "\n EJERCICIO: La actividad física debe ser moderada y enfocada en fortalecer el sistema inmunológico. Se recomienda       " +
                                                  "\n realizar ejercicios de bajo impacto, como yoga y caminatas suaves, que ayudan a reducir el estrés, un factor que       " +
                                                  "\n puede desencadenar brotes del virus. POSIBLE TRATAMIENTO: El tratamiento para el herpes genital incluye antivirales    " +
                                                  "\n como aciclovir y valaciclovir, que ayudan a reducir la duración y gravedad de los síntomas. En México, estos           " +
                                                  "\n medicamentos están disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACIÓN: También es            " +
                                                  "\n recomendable el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación,        " +
                                                  "\n tales como frutas cítricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunológico.  " +
                                                  "\n Verduras de hoja verde (espinacas, acelgas, brócoli), contienen antioxidantes y hierro, esenciales para la salud       " +
                                                  "\n celular. Pescados grasos (salmón, atún), ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos (almendras, " +
                                                  "\n nueces), aportan vitamina E, que ayuda a la regeneración celular. Yogur natural, fuente de probióticos, que favorecen  " +
                                                  "\n la salud intestinal y el sistema inmunológico. Este es solo un diagnóstico predeterminado lógico, haberlo consultado   " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para    " +
                                                  "\n ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado " +
                                                  "\n del paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a  " +
                                                  "\n su médico. Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN: La hidratación es clave para ayudar al cuerpo a eliminar toxinas y fortalecer el sistema inmunológico.       " +
                                                  "\n Se recomienda el consumo diario de 1.5 a 2 litros de agua, además de infusiones de equinácea y jengibre, que pueden       " +
                                                  "\n ayudar a mejorar la respuesta inmunológica. EJERCICIO: La actividad física debe ser moderada y enfocada en mejorar        " +
                                                  "\n la circulación sanguínea. Se recomienda realizar ejercicios aeróbicos suaves, como caminatas y bicicleta estática,        " +
                                                  "\n que ayudan a mejorar la oxigenación celular y la recuperación del cuerpo. POSIBLE TRATAMIENTO: El tratamiento para        " +
                                                  "\n la sífilis incluye penicilina benzatina, que es el medicamento de primera línea. En México, estos medicamentos están      " +
                                                  "\n disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACIÓN: También es recomendable el consumo de       " +
                                                  "\n alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como frutas cítricas (naranjas," +
                                                  "\n limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunológico. Verduras de hoja verde (espinacas,     " +
                                                  "\n acelgas, brócoli), contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos (salmón, atún), " +
                                                  "\n ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos (almendras, nueces), aportan vitamina E, que ayuda   " +
                                                  "\n a la regeneración celular. Yogur natural, fuente de probióticos, que favorecen la salud intestinal y el sistema        " +
                                                  "\n inmunológico. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el        " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar   " +
                                                  "\n más de un Diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Además,      " +
                                                  "\n por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel     " +
                                                  "\n L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACIÓN: La hidratación es fundamental para mantener la salud pulmonar y ayudar a eliminar toxinas del cuerpo.     " +
                                                  "\n Se recomienda el consumo diario de 2 a 2.5 litros de agua, además de infusiones de tomillo y eucalipto, que pueden     " +
                                                  "\n ayudar a mejorar la función respiratoria. EJERCICIO: La actividad física debe ser moderada y enfocada en mejorar       " +
                                                  "\n la capacidad pulmonar. Se recomienda realizar ejercicios de respiración profunda, como respiración diafragmática       " +
                                                  "\n y con labios fruncidos, que ayudan a mejorar la oxigenación. También es beneficioso practicar caminatas suaves,        " +
                                                  "\n evitando ambientes fríos o contaminados. POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis incluye antibióticos " +
                                                  "\n como isoniazida, rifampicina y etambutol, que deben tomarse durante un período prolongado para garantizar la           " +
                                                  "\n eliminación de la bacteria. En México, estos medicamentos están disponibles en instituciones de salud como el          " +
                                                  "\n IMSS y el Insabi. ALIMENTACIÓN: También es recomendable el consumo de alimentos que fortalezcan el sistema inmunológico" +
                                                  "\n y ayuden a reducir la inflamación, tales como frutas cítricas (naranjas, limones, toronjas), ricas en vitamina C,      " +
                                                  "\n que fortalece el sistema inmunológico. Verduras de hoja verde (espinacas, acelgas, brócoli), contienen antioxidantes   " +
                                                  "\n y hierro, esenciales para la salud celular. Pescados grasos (salmón, atún), ricos en Omega-3, con propiedades          " +
                                                  "\n antiinflamatorias. Frutos secos (almendras, nueces), aportan vitamina E, que ayuda a la regeneración celular.          " +
                                                  "\n Yogur natural, fuente de probióticos, que favorecen la salud intestinal y el sistema inmunológico. Este es solo        " +
                                                  "\n un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad    " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida " +
                                                  "\n para establecer mayor seguridad en el tratamiento adecuado del paciente. Además, por su salud, si la respuesta del     " +
                                                  "\n diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L. Montes agradece tu visita a la app " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis. " +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física moderada y adaptada a su condición, evitando       " +
                                                  "\n ejercicios de alto impacto que puedan afectar sus articulaciones. Se sugiere ejercicios de bajo impacto como natación,    " +
                                                  "\n yoga o caminatas suaves, que ayudan a mejorar la movilidad sin generar estrés en las articulaciones. HIDRATACIÓN: Se      " +
                                                  "\n recomienda el consumo diario de 2 a 2.5 litros de agua al día (ocho a diez vasos de tamaño regular) para mantener una     " +
                                                  "\n adecuada hidratación y ayudar a reducir la inflamación en las articulaciones. También es beneficioso el consumo de        " +
                                                  "\n infusiones de cúrcuma y jengibre, que poseen propiedades antiinflamatorias naturales. POSIBLE TRATAMIENTO: Para la        " +
                                                  "\n artritis juvenil, el tratamiento suele incluir antiinflamatorios no esteroides (AINEs) como ibuprofeno o naproxeno,       " +
                                                  "\n además de fármacos modificadores de la enfermedad como metotrexato en casos más severos. También pueden utilizarse        " +
                                                  "\n terapias biológicas bajo supervisión médica. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a reducir     " +
                                                  "\n la inflamación y fortalecer las articulaciones, tales como Pescados grasos (salmón, atún): ricos en ácidos grasos Omega-3," +
                                                  "\n que poseen propiedades antiinflamatorias. Frutas y verduras de colores vivos (arándanos, fresas, espinacas, brócoli):     " +
                                                  "\n ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las células del daño y fortalecer el        " +
                                                  "\n sistema inmunológico. Jengibre: contiene compuestos con efectos antiinflamatorios que podrían ser beneficiosos para       " +
                                                  "\n las articulaciones. Cúrcuma: con su componente activo, la curcumina, también tiene potentes propiedades antiinflamatorias " +
                                                  "\n y antioxidantes. Semillas de chía y linaza: ricas en Omega-3 y fibra, que ayudan a reducir la inflamación. Este es solo   " +
                                                  "\n un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni    " +
                                                  "\n que las respuestas sean completamente correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el  " +
                                                  "\n tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda " +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física ligera, evitando esfuerzos excesivos         " +
                                                  "\n que puedan agravar la tos y la dificultad respiratoria. Se sugiere ejercicios de respiración, caminatas             " +
                                                  "\n suaves y estiramientos para mejorar la capacidad pulmonar. HIDRATACIÓN: Debido a la tos persistente y la            " +
                                                  "\n posible deshidratación causada por la tosferina, se recomienda el consumo diario de 2 a 2.5 litros de agua          " +
                                                  "\n al día (ocho a diez vasos de tamaño regular). También es beneficioso el consumo de infusiones de miel y jengibre,   " +
                                                  "\n que pueden ayudar a calmar la garganta y reducir la inflamación. POSIBLE TRATAMIENTO: Para la tosferina en          " +
                                                  "\n adolescentes, el tratamiento suele incluir antibióticos como azitromicina, claritromicina o eritromicina,           " +
                                                  "\n administrados bajo supervisión médica. También se recomienda el uso de humidificadores para aliviar la irritación   " +
                                                  "\n de las vías respiratorias. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema   " +
                                                  "\n respiratorio y aliviar los síntomas, tales como Miel: ayuda a calmar la garganta y tiene propiedades antimicrobianas. " +
                                                  "\n Jengibre: con propiedades antiinflamatorias que pueden aliviar la tos y mejorar la respuesta inmune. Frutas cítricas  " +
                                                  "\n (naranjas, limones, toronjas): ricas en vitamina C, que ayuda a mejorar la respuesta inmunológica. Caldo de pollo:    " +
                                                  "\n fuente de electrolitos y nutrientes esenciales para la recuperación. Ajo: contiene alicina, un compuesto con          " +
                                                  "\n propiedades antimicrobianas que pueden ayudar a combatir infecciones. Este es solo un diagnóstico predeterminado      " +
                                                  "\n lógico. Haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean      " +
                                                  "\n completamente correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento          " +
                                                  "\n adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar     " +
                                                  "\n a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física ligera, evitando esfuerzos excesivos que       " +
                                                  "\n puedan agravar la inflamación de las glándulas salivales. Se sugiere ejercicios de relajación y estiramientos         " +
                                                  "\n suaves. HIDRATACIÓN: Debido a la fiebre y la inflamación de las glándulas salivales, se recomienda el consumo         " +
                                                  "\n diario de 2 a 2.5 litros de agua al día (ocho a diez vasos de tamaño regular). También es beneficioso el consumo      " +
                                                  "\n de infusiones de manzanilla, que pueden ayudar a reducir la inflamación, y agua de coco, que aporta electrolitos      " +
                                                  "\n esenciales. POSIBLE TRATAMIENTO: Para las paperas en adolescentes, no existe un tratamiento específico, ya que es     " +
                                                  "\n una enfermedad viral autolimitada. Se recomienda reposo, hidratación y control de fiebre con paracetamol (Tempra)     " +
                                                  "\n o ibuprofeno. En casos graves, puede requerirse hospitalización con administración de líquidos intravenosos.          " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a reducir la inflamación y fortalecer el sistema       " +
                                                  "\n inmune, tales como Frutas cítricas (naranjas, limones, toronjas): ricas en vitamina C, que ayuda a mejorar la         " +
                                                  "\n respuesta inmunológica. Papaya: contiene vitamina C y flavonoides que pueden ayudar a reducir la inflamación.         " +
                                                  "\n Jengibre: con propiedades antiinflamatorias que pueden aliviar la fatiga y mejorar la respuesta inmune. Miel: ayuda   " +
                                                  "\n a calmar la garganta y tiene propiedades antimicrobianas. Caldo de vegetales: fuente de electrolitos y nutrientes     " +
                                                  "\n esenciales para la recuperación. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza   " +
                                                  "\n al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda       " +
                                                  "\n realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta " +
                                                  "\n del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física de baja intensidad, evitando esfuerzos          " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperación. Actividades como caminatas suaves, ejercicios        " +
                                                  "\n de respiración y yoga pueden ser beneficiosos para mantener el cuerpo activo sin comprometer la recuperación.          " +
                                                  "\n También se recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez muscular causada        " +
                                                  "\n por el reposo prolongado. HIDRATACIÓN: Es fundamental el consumo diario de 2 litros de agua (ocho vasos de tamaño      " +
                                                  "\n regular) para mantener una hidratación óptima y ayudar a aliviar los síntomas. También se recomienda el consumo de     " +
                                                  "\n infusiones con propiedades antiinflamatorias como el té de jengibre o manzanilla. POSIBLE TRATAMIENTO: No existe un    " +
                                                  "\n tratamiento específico para el virus del Zika, por lo que se recomienda reposo, hidratación abundante y el uso de      " +
                                                  "\n analgésicos como el paracetamol para aliviar los síntomas. También es importante evitar la exposición a mosquitos      " +
                                                  "\n para prevenir la propagación del virus. ALIMENTACIÓN: Es recomendable el consumo de alimentos que ayuden a fortalecer  " +
                                                  "\n el sistema inmune y mejorar la recuperación, tales como: Naranjas, ricas en vitamina C (aproximadamente el 89% del     " +
                                                  "\n requerimiento diario por cada 100 g), que ayuda a fortalecer el sistema inmunológico y reducir la duración de los      " +
                                                  "\n síntomas. Espinacas, con hierro (aproximadamente el 15% del requerimiento diario por cada 100 g), que contribuye a la  " +
                                                  "\n producción de glóbulos rojos y mejora la oxigenación del cuerpo. Yogur, con probióticos que favorecen la salud intestinal " +
                                                  "\n y fortalecen el sistema inmune. También se recomienda el consumo de alimentos ricos en zinc para mejorar la respuesta     " +
                                                  "\n inmune y acelerar la recuperación. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza     " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento" +
                                                  "\n adecuado, se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus. " +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física de baja intensidad, evitando esfuerzos        " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperación. Actividades como caminatas suaves, juegos          " +
                                                  "\n tranquilos y ejercicios de respiración pueden ser beneficiosos para mantener el cuerpo activo sin comprometer        " +
                                                  "\n la recuperación. También se recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez      " +
                                                  "\n muscular causada por el reposo prolongado. HIDRATACIÓN: Es fundamental el consumo diario de 2 a 2.5 litros de        " +
                                                  "\n agua (ocho a diez vasos de tamaño regular) para prevenir la deshidratación causada por la diarrea y ayudar a la      " +
                                                  "\n recuperación del organismo. Además, se recomienda el consumo de sueros de rehidratación oral para reponer los        " +
                                                  "\n electrolitos perdidos. POSIBLE TRATAMIENTO: Para el rotavirus en adolescentes, el tratamiento suele enfocarse en     " +
                                                  "\n la rehidratación y el manejo de los síntomas. Se recomienda el consumo de líquidos abundantes, sueros de rehidratación " +
                                                  "\n y el uso de medicamentos para aliviar la fiebre y el malestar general. ALIMENTACIÓN: Es recomendable el consumo        " +
                                                  "\n de alimentos que ayuden a la recuperación intestinal y fortalezcan el sistema inmune, tales como: Plátanos, ricos      " +
                                                  "\n en potasio (aproximadamente el 10% del requerimiento diario por cada 100 g), que ayudan a reponer electrolitos perdidos" +
                                                  "\n por la diarrea. Zanahorias, con vitamina A (aproximadamente el 334% del requerimiento diario por cada 100 g), que     " +
                                                  "\n contribuye a la regeneración de la mucosa intestinal. Yogur, con probióticos que favorecen la salud intestinal y      " +
                                                  "\n fortalecen el sistema inmune. También se recomienda el consumo de caldos y sopas suaves para facilitar la digestión   " +
                                                  "\n y evitar irritaciones en el tracto intestinal. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad " +
                                                  "\n en el tratamiento adecuado, se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física moderada, evitando esfuerzos excesivos y            " +
                                                  "\n asegurando una recuperación adecuada. Ejercicios como caminatas suaves, estiramientos y yoga pueden ser beneficiosos       " +
                                                  "\n para mantener el cuerpo activo sin comprometer el tratamiento. También se recomienda ejercicios de relajación y            " +
                                                  "\n respiración profunda para reducir el estrés y mejorar la respuesta inmune. HIDRATACIÓN: Es fundamental el consumo          " +
                                                  "\n diario de 2 litros de agua (ocho vasos de tamaño regular) para ayudar a eliminar toxinas y mantener el organismo en        " +
                                                  "\n equilibrio. También se recomienda el consumo de jugos naturales ricos en antioxidantes para fortalecer el sistema          " +
                                                  "\n inmune. POSIBLE TRATAMIENTO: Para la listeriosis en adolescentes, el tratamiento suele incluir antibióticos como la        " +
                                                  "\n ampicilina o gentamicina, administrados bajo supervisión médica. También es importante evitar el consumo de alimentos      " +
                                                  "\n contaminados y mantener una higiene adecuada. ALIMENTACIÓN: Es recomendable el consumo de alimentos que ayuden a           " +
                                                  "\n fortalecer el sistema inmune y mejorar la recuperación, tales como: Naranjas, ricas en vitamina C (aproximadamente el      " +
                                                  "\n 89% del requerimiento diario por cada 100 g), que ayuda a fortalecer el sistema inmunológico y reducir la duración de      " +
                                                  "\n los síntomas. Espinacas, con hierro (aproximadamente el 15% del requerimiento diario por cada 100 g), que contribuye       " +
                                                  "\n a la producción de glóbulos rojos y mejora la oxigenación del cuerpo. Yogur, con probióticos que favorecen la salud        " +
                                                  "\n intestinal y fortalecen el sistema inmune. También se recomienda el consumo de alimentos ricos en zinc para mejorar        " +
                                                  "\n la respuesta inmune y acelerar la recuperación. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado      " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad      " +
                                                  "\n en el tratamiento adecuado, se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece  " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física de baja intensidad, evitando esfuerzos         " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperación. Actividades como caminatas suaves, juegos           " +
                                                  "\n tranquilos y ejercicios de respiración pueden ser beneficiosos para mantener el cuerpo activo sin comprometer         " +
                                                  "\n la recuperación. También se recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez       " +
                                                  "\n muscular causada por el reposo prolongado. HIDRATACIÓN: Es fundamental el consumo diario de 1.5 a 2 litros de agua    " +
                                                  "\n (seis a ocho vasos de tamaño regular) para prevenir la deshidratación causada por la diarrea y ayudar a la            " +
                                                  "\n recuperación del organismo. Además, se recomienda el consumo de sueros de rehidratación oral para reponer los         " +
                                                  "\n electrolitos perdidos. POSIBLE TRATAMIENTO: Para la shigelosis en adolescentes, el tratamiento suele incluir          " +
                                                  "\n antibióticos como la azitromicina o ciprofloxacino en casos graves, además de medidas de rehidratación oral para      " +
                                                  "\n evitar la deshidratación. También es importante mantener una higiene adecuada, lavarse las manos frecuentemente y     " +
                                                  "\n evitar el contacto con personas infectadas. ALIMENTACIÓN: Es recomendable el consumo de alimentos que ayuden a la     " +
                                                  "\n recuperación intestinal y fortalezcan el sistema inmune, tales como: Plátanos, ricos en potasio (aproximadamente el   " +
                                                  "\n 10% del requerimiento diario por cada 100 g), que ayudan a reponer electrolitos perdidos por la diarrea. Zanahorias,  " +
                                                  "\n con vitamina A (aproximadamente el 334% del requerimiento diario por cada 100 g), que contribuye a la regeneración de " +
                                                  "\n la mucosa intestinal. Yogur, con probióticos que favorecen la salud intestinal y fortalecen el sistema inmune. También" +
                                                  "\n se recomienda el consumo de caldos y sopas suaves para facilitar la digestión y evitar irritaciones en el tracto      " +
                                                  "\n intestinal. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente" +
                                                  "\n tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado, se       " +
                                                  "\n recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida)" +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física adaptada a su capacidad respiratoria,             " +
                                                  "\n evitando esfuerzos excesivos y asegurando una respiración controlada. Ejercicios como caminatas suaves, natación,        " +
                                                  "\n yoga y técnicas de respiración pueden mejorar la función pulmonar y reducir la fatiga. También se recomienda             " +
                                                  "\n ejercicios de expansión torácica y fortalecimiento de los músculos respiratorios para mejorar la capacidad pulmonar.     " +
                                                  "\n Es importante realizar calentamiento previo y enfriamiento posterior para evitar crisis respiratorias. HIDRATACIÓN:      " +
                                                  "\n Es fundamental el consumo diario de 1.7 a 2 litros de agua (siete a ocho vasos de tamaño regular) para mantener las      " +
                                                  "\n vías respiratorias hidratadas y facilitar la eliminación de secreciones. También se recomienda el consumo de infusiones  " +
                                                  "\n con propiedades antiinflamatorias como el té de jengibre o manzanilla. POSIBLE TRATAMIENTO: Para el EPOC en adolescentes," +
                                                  "\n el tratamiento suele incluir broncodilatadores como el salbutamol, corticosteroides inhalados como la fluticasona y, en  " +
                                                  "\n casos graves, oxigenoterapia. También es importante evitar la exposición a contaminantes ambientales y humo de tabaco.   " +
                                                  "\n ALIMENTACIÓN: Es recomendable el consumo de alimentos que ayuden a mejorar la función pulmonar y fortalezcan el sistema  " +
                                                  "\n inmune, tales como: Pescados grasos (salmón, atún), ricos en ácidos grasos Omega-3 (aproximadamente el 50% del           " +
                                                  "\n requerimiento diario por cada 100 g), que poseen propiedades antiinflamatorias que pueden ayudar a reducir la inflamación" +
                                                  "\n de las vías respiratorias. Frutas y verduras de colores vivos (arándanos, fresas, espinacas, brócoli), ricas en          " +
                                                  "\n antioxidantes como la vitamina C (aproximadamente el 90% del requerimiento diario por cada 100 g) y carotenoides,        " +
                                                  "\n que pueden proteger las células del daño y fortalecer el sistema inmunológico. Jengibre, contiene compuestos con         " +
                                                  "\n efectos antiinflamatorios que podrían ser beneficiosos para las vías respiratorias. Cúrcuma, con su componente activo,   " +
                                                  "\n la curcumina, también tiene potentes propiedades antiinflamatorias y antioxidantes. También se recomienda el consumo     " +
                                                  "\n de alimentos ricos en fibra para mejorar la digestión y evitar la inflamación intestinal. Este es solo un diagnóstico    " +
                                                  "\n predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas" +
                                                  "\n sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar más de un diagnóstico y consultar" +
                                                  "\n a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física moderada, evitando esfuerzos excesivos y         " +
                                                  "\n asegurando una recuperación adecuada. Ejercicios como caminatas suaves, estiramientos y yoga pueden ser beneficiosos    " +
                                                  "\n para mantener el cuerpo activo sin comprometer el tratamiento. También se recomienda ejercicios de relajación y         " +
                                                  "\n respiración profunda para reducir el estrés y mejorar la respuesta inmune. HIDRATACIÓN: Es fundamental el consumo       " +
                                                  "\n diario de 1.5 a 2 litros de agua (seis a ocho vasos de tamaño regular) para ayudar a eliminar toxinas y mantener el     " +
                                                  "\n organismo en equilibrio. También se recomienda el consumo de jugos naturales ricos en antioxidantes para fortalecer     " +
                                                  "\n el sistema inmune. POSIBLE TRATAMIENTO: Para la clamidia en adolescentes, el tratamiento suele incluir antibióticos     " +
                                                  "\n como la azitromicina o doxiciclina, administrados bajo supervisión médica. También es importante evitar el contacto     " +
                                                  "\n con personas infectadas y mantener una higiene adecuada. ALIMENTACIÓN: Es recomendable el consumo de alimentos que      " +
                                                  "\n ayuden a fortalecer el sistema inmune y mejorar la recuperación, tales como: Naranjas, ricas en vitamina C              " +
                                                  "\n (aproximadamente el 89% del requerimiento diario por cada 100 g), que ayuda a fortalecer el sistema inmunológico y      " +
                                                  "\n reducir la duración de los síntomas. Espinacas, con hierro (aproximadamente el 15% del requerimiento diario por cada    " +
                                                  "\n 100 g), que contribuye a la producción de glóbulos rojos y mejora la oxigenación del cuerpo. Yogur, con probióticos     " +
                                                  "\n que favorecen la salud intestinal y fortalecen el sistema inmune. También se recomienda el consumo de alimentos ricos   " +
                                                  "\n en zinc para mejorar la respuesta inmune y acelerar la recuperación. Este es solo un diagnóstico predeterminado lógico. " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas.     " +
                                                  "\n Para mayor seguridad en el tratamiento adecuado, se recomienda realizar más de un diagnóstico y consultar a un médico.  " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular)            " +
                                                  "\n para mantener la hidratación y ayudar a reducir la fiebre y los síntomas neurológicos, lo que es fundamental            " +
                                                  "\n en el proceso de recuperación. La meningitis bacteriana puede provocar fiebre alta, vómitos, rigidez en el cuello       " +
                                                  "\n y sensibilidad a la luz, lo que puede llevar a una mayor pérdida de líquidos. Es importante que el paciente consuma     " +
                                                  "\n líquidos ricos en electrolitos, como sueros orales, caldos y jugos naturales sin azúcar, para evitar la deshidratación  " +
                                                  "\n y mantener el equilibrio de minerales esenciales. También se recomienda el consumo de infusiones suaves, como           " +
                                                  "\n manzanilla o jengibre, que pueden ayudar a aliviar las náuseas y mejorar la digestión. EJERCICIO: La actividad física   " +
                                                  "\n debe ser muy ligera y supervisada, evitando esfuerzos excesivos que puedan agravar los síntomas, ejercicios de          " +
                                                  "\n respiración profunda y movilidad suave pueden ser beneficiosos para mejorar la capacidad pulmonar y la circulación.     " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento estándar para la meningitis bacteriana en adolescentes incluye antibióticos como    " +
                                                  "\n ceftriaxona, ampicilina y vancomicina, administrados por vía intravenosa durante 7 a 14 días, en México algunas marcas  " +
                                                  "\n reconocidas incluyen Rocephin (ceftriaxona) y Amikin (amikacina), además se recomienda el uso de corticosteroides como  " +
                                                  "\n dexametasona para reducir la inflamación cerebral en casos graves. ALIMENTACIÓN: Para fortalecer el sistema inmunológico " +
                                                  "\n y apoyar la recuperación, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y proteínas. Naranjas " +
                                                  "\n y fresas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa hasta el 100% de la ingesta " +
                                                  "\n diaria recomendada, fortaleciendo el sistema inmunológico y ayudando a reducir la inflamación. Espinacas y lentejas:     " +
                                                  "\n Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25% y 40% de la ingesta diaria recomendada,      " +
                                                  "\n lo que ayuda a mejorar la oxigenación celular y reducir el cansancio. Carnes magras y huevos: Son una fuente importante  " +
                                                  "\n de proteínas, proporcionando entre 20 y 25 g por cada 100 g, lo que equivale al 40-50% de la recomendación diaria,       " +
                                                  "\n esenciales para la regeneración celular y el fortalecimiento muscular. Este es solo un diagnóstico predeterminado lógico," +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente  " +
                                                  "\n correctas, para mayor seguridad se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes    " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer. " +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tamaño regular) para         " +
                                                  "\n mantener la hidratación y ayudar a reducir los efectos secundarios del tratamiento, lo que es fundamental en el         " +
                                                  "\n proceso de recuperación. Los adolescentes con cáncer pueden experimentar vómitos, diarrea y sudoración excesiva,        " +
                                                  "\n lo que aumenta el riesgo de deshidratación. Es esencial consumir líquidos ricos en electrolitos, como sueros orales     " +
                                                  "\n y caldos, para reponer los minerales perdidos. También se recomienda el consumo de agua con limón o infusiones suaves,  " +
                                                  "\n que pueden ayudar a aliviar las náuseas y mejorar la digestión. EJERCICIO: La actividad física debe ser moderada y      " +
                                                  "\n adaptada, evitando esfuerzos excesivos que puedan debilitar el sistema inmunológico, ejercicios como yoga, caminatas    " +
                                                  "\n suaves y natación pueden ser beneficiosos para mejorar la resistencia y reducir la fatiga. POSIBLE TRATAMIENTO: El      " +
                                                  "\n tratamiento para el cáncer en adolescentes depende del tipo específico de cáncer, pero puede incluir quimioterapia,     " +
                                                  "\n radioterapia y cirugía, en México algunas marcas reconocidas incluyen Methotrexate (metotrexato) y Vincristine          " +
                                                  "\n (vincristina), además se recomienda el uso de terapias complementarias como apoyo nutricional y psicológico para mejorar" +
                                                  "\n la calidad de vida del paciente. ALIMENTACIÓN: Para fortalecer el sistema inmunológico y apoyar la recuperación, se     " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes, proteínas y ácidos grasos esenciales. Brócoli y zanahorias:  " +
                                                  "\n Contienen aproximadamente 50-80 mg de vitamina C por cada 100 g, lo que representa hasta el 90% de la ingesta diaria    " +
                                                  "\n recomendada, fortaleciendo el sistema inmunológico. Salmón y chía: Son fuentes de omega-3, proporcionando entre 2-4 g   " +
                                                  "\n por cada 100 g, lo que ayuda a reducir la inflamación y mejorar la función celular. Frutas y verduras de colores vivos: " +
                                                  "\n Como arándanos y espinacas, que son ricas en antioxidantes y ayudan a proteger las células del daño. Este es solo un    " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que     " +
                                                  "\n las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar más de un diagnóstico y consultar  " +
                                                  "\n a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.35-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física moderada a intensa diariamente, con una            " +
                                                  "\n duración aproximada de 60 minutos, aunque esta cantidad puede ajustarse según su condición. Actividades como              " +
                                                  "\n caminatas, ejercicios aeróbicos, natación y deportes de bajo impacto pueden ser beneficiosos para fortalecer su           " +
                                                  "\n sistema inmunológico y mejorar la recuperación. También se recomienda ejercicios de respiración profunda y relajación     " +
                                                  "\n para mejorar la oxigenación y reducir el estrés, lo que puede favorecer la recuperación. HIDRATACIÓN: Es fundamental      " +
                                                  "\n el consumo diario de 2 litros de agua (ocho vasos de tamaño regular) para mantener una hidratación adecuada y ayudar al   " +
                                                  "\n cuerpo a combatir la enfermedad. También se recomienda el consumo de infusiones calientes como té de jengibre o manzanilla" +
                                                  "\n para aliviar los síntomas respiratorios. Además, el consumo de caldos y sopas calientes puede ayudar a mantener la        " +
                                                  "\n hidratación y proporcionar nutrientes esenciales para la recuperación. POSIBLE TRATAMIENTO: Para la gripe en adolescentes,  " +
                                                  "\n el tratamiento suele incluir medicamentos para reducir la fiebre y aliviar los síntomas, como el paracetamol (Tempra) o el  " +
                                                  "\n ibuprofeno. En casos específicos, se pueden utilizar antivirales como el oseltamivir (Tamiflu). También es recomendable el  " +
                                                  "\n uso de humidificadores para mantener el aire húmedo y facilitar la respiración. El descanso adecuado es clave para la       " +
                                                  "\n recuperación, por lo que se recomienda dormir al menos 8 horas diarias y evitar actividades que puedan generar fatiga.      " +
                                                  "\n ALIMENTACIÓN: Es recomendable el consumo de frutas y verduras que fortalezcan el sistema inmune, tales como: Naranjas, ricas" +
                                                  "\n en vitamina C (aportan aproximadamente el 89% del requerimiento diario por cada 100 g), que ayuda a fortalecer el sistema   " +
                                                  "\n inmunológico y reducir la duración de los síntomas. Fresas, con antioxidantes y vitamina C (aportan cerca del 98% del       " +
                                                  "\n requerimiento diario por cada 100 g), esenciales para la protección celular y la recuperación del organismo. Plátanos, ricos" +
                                                  "\n en potasio (aportan alrededor del 10% del requerimiento diario por cada 100 g), que ayuda a reemplazar los electrolitos     " +
                                                  "\n perdidos por fiebre y sudoración. Kiwi, con vitamina C (aproximadamente el 93% del requerimiento diario por cada 100 g)     " +
                                                  "\n y potasio, que contribuyen a la función inmunológica y la recuperación del cuerpo. Este es solo un diagnóstico predeterminado" +
                                                  "\n lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas." +
                                                  "\n Para mayor seguridad en el tratamiento adecuado, se recomienda realizar más de un diagnóstico y consultar a un médico.     " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física de baja intensidad, evitando esfuerzos               " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperación. Actividades como caminatas suaves, ejercicios             " +
                                                  "\n de respiración y yoga pueden ser beneficiosos para mantener el cuerpo activo sin comprometer la recuperación.               " +
                                                  "\n También se recomienda ejercicios de expansión torácica y fortalecimiento de los músculos respiratorios para mejorar         " +
                                                  "\n la capacidad pulmonar. HIDRATACIÓN: Es fundamental el consumo diario de 2 litros de agua (ocho vasos de tamaño regular)     " +
                                                  "\n para mantener una hidratación óptima y ayudar a fluidificar las secreciones pulmonares. También se recomienda el consumo    " +
                                                  "\n de caldos y sopas calientes para facilitar la digestión y evitar irritaciones en el tracto respiratorio. Además, el         " +
                                                  "\n consumo de jugos naturales sin azúcar puede aportar vitaminas esenciales para fortalecer el sistema inmunológico.           " +
                                                  "\n POSIBLE TRATAMIENTO: Para la neumonía en adolescentes, el tratamiento suele incluir antibióticos como la amoxicilina        " +
                                                  "\n o azitromicina en caso de infecciones bacterianas, además de medicamentos para reducir la fiebre y aliviar los síntomas,    " +
                                                  "\n como el paracetamol. En casos graves, puede requerirse hospitalización y oxigenoterapia. También es importante evitar la    " +
                                                  "\n exposición a contaminantes ambientales y humo de tabaco, ya que pueden agravar los síntomas. ALIMENTACIÓN: Es recomendable  " +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmune y ayuden a la recuperación, tales como: Naranjas, ricas en        " +
                                                  "\n vitamina C (aportan aproximadamente el 89% del requerimiento diario por cada 100 g), que ayuda a fortalecer el sistema      " +
                                                  "\n inmunológico y reducir la duración de los síntomas. Espinacas, con hierro (aproximadamente el 15% del requerimiento diario  " +
                                                  "\n por cada 100 g), que contribuye a la producción de glóbulos rojos y mejora la oxigenación del cuerpo. Yogur, con probióticos  " +
                                                  "\n que favorecen la salud intestinal y fortalecen el sistema inmune. También se recomienda el consumo de alimentos ricos en zinc " +
                                                  "\n para mejorar la respuesta inmune y acelerar la recuperación. Este es solo un diagnóstico predeterminado lógico. Haberlo       " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor        " +
                                                  "\n seguridad en el tratamiento adecuado, se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes    " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física moderada diariamente, con una duración aproximada   " +
                                                  "\n de 60 minutos, incluyendo ejercicios aeróbicos como caminar, correr o nadar, para mejorar la sensibilidad a la insulina.   " +
                                                  "\n También se recomienda la práctica de ejercicios de resistencia como el yoga o el entrenamiento ligero con pesas para       " +
                                                  "\n mejorar el metabolismo de la glucosa. HIDRATACIÓN: Es fundamental el consumo diario de 2 litros de agua (ocho vasos de     " +
                                                  "\n tamaño regular) para ayudar a mantener niveles adecuados de glucosa en sangre y prevenir la deshidratación. También se     " +
                                                  "\n recomienda el consumo de bebidas sin azúcar como infusiones naturales o agua con limón. Además, el consumo de alimentos    " +
                                                  "\n con alto contenido de fibra puede ayudar a estabilizar los niveles de glucosa en sangre. POSIBLE TRATAMIENTO: Para la      " +
                                                  "\n diabetes en adolescentes, el tratamiento suele incluir insulina en el caso de diabetes tipo 1, mientras que en diabetes    " +
                                                  "\n tipo 2 puede requerirse metformina y cambios en el estilo de vida. Es esencial el monitoreo constante de la glucosa en     " +
                                                  "\n sangre y el seguimiento médico. También es recomendable la educación sobre el manejo de la enfermedad para evitar          " +
                                                  "\n complicaciones a largo plazo. ALIMENTACIÓN: Es recomendable el consumo de alimentos que ayuden a regular los niveles de    " +
                                                  "\n glucosa y fortalezcan el organismo, tales como: Avena, rica en fibra soluble (aproximadamente el 10% del requerimiento     " +
                                                  "\n diario por cada 100 g), que ayuda a estabilizar los niveles de azúcar en sangre. Frutos secos, con grasas saludables y     " +
                                                  "\n magnesio (aproximadamente el 15% del requerimiento diario por cada 100 g), que contribuyen a la regulación de la glucosa.  " +
                                                  "\n Legumbres, con proteínas vegetales y fibra (aproximadamente el 20% del requerimiento diario por cada 100 g), que favorecen    " +
                                                  "\n la saciedad y el control de la glucosa. También se recomienda el consumo de alimentos ricos en ácidos grasos Omega-3 para     " +
                                                  "\n mejorar la función metabólica y reducir la inflamación. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad en  " +
                                                  "\n el tratamiento adecuado, se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece    " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para             " +
                                                  "\n mantener las vías respiratorias hidratadas y reducir la viscosidad de las secreciones, lo que facilita la respiración.        " +
                                                  "\n La deshidratación puede agravar los síntomas del asma, aumentando la irritación de las vías respiratorias y la                " +
                                                  "\n frecuencia de los episodios de tos. Es importante consumir líquidos ricos en electrolitos, como sueros orales y caldos,       " +
                                                  "\n para mantener el equilibrio de minerales esenciales. También se recomienda el consumo de infusiones suaves, como              " +
                                                  "\n manzanilla o jengibre, que pueden ayudar a reducir la inflamación y mejorar la función pulmonar. EJERCICIO: La actividad      " +
                                                  "\n física debe ser moderada y adaptada, evitando esfuerzos excesivos que puedan desencadenar crisis asmáticas, ejercicios        " +
                                                  "\n como natación, yoga y caminatas suaves pueden ser beneficiosos para mejorar la capacidad pulmonar y reducir la inflamación.   " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento estándar para el asma en adolescentes incluye broncodilatadores de alivio rápido como     " +
                                                  "\n salbutamol, además de corticosteroides inhalados como fluticasona o budesonida, en México algunas marcas reconocidas          " +
                                                  "\n incluyen Ventolin (salbutamol) y Pulmicort (budesonida), en casos más severos pueden utilizarse biológicos como omalizumab,   " +
                                                  "\n bajo estricta supervisión médica. ALIMENTACIÓN: Para fortalecer el sistema respiratorio y reducir la inflamación, se          " +
                                                  "\n recomienda el consumo de alimentos ricos en omega-3, antioxidantes y vitamina C. Salmón y chía: Contienen aproximadamente     " +
                                                  "\n 2-4 g de omega-3 por cada 100 g, lo que ayuda a reducir la inflamación de las vías respiratorias. Fresas y arándanos:         " +
                                                  "\n Aportan 50-90 mg de vitamina C por cada 100 g, cubriendo hasta el 100% de la ingesta diaria recomendada, fortaleciendo el     " +
                                                  "\n sistema inmunológico. Jengibre y cúrcuma: Poseen propiedades antiinflamatorias y antioxidantes, ayudando a reducir la         " +
                                                  "\n irritación de las vías respiratorias. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza      " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se     " +
                                                  "\n recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y     " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tamaño regular) para          " +
                                                  "\n mantener la hidratación y reducir la fatiga, lo que es fundamental en el proceso de recuperación. El VIH puede           " +
                                                  "\n provocar fiebre, sudoración nocturna y diarrea, lo que aumenta el riesgo de deshidratación. Es esencial consumir         " +
                                                  "\n líquidos ricos en electrolitos, como sueros orales y caldos, para reponer los minerales perdidos. También se             " +
                                                  "\n recomienda el consumo de agua con limón o infusiones suaves, que pueden ayudar a aliviar las náuseas y mejorar la        " +
                                                  "\n digestión. EJERCICIO: La actividad física debe ser moderada y adaptada, evitando esfuerzos excesivos que puedan          " +
                                                  "\n debilitar el sistema inmunológico, ejercicios como yoga, caminatas suaves y natación pueden ser beneficiosos para        " +
                                                  "\n mejorar la resistencia y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento para el VIH en adolescentes incluye      " +
                                                  "\n terapia antirretroviral (TAR) con medicamentos como tenofovir, emtricitabina y dolutegravir, en México algunas marcas    " +
                                                  "\n reconocidas incluyen Truvada (tenofovir/emtricitabina) y Tivicay (dolutegravir), además se recomienda el uso de          " +
                                                  "\n terapias complementarias como apoyo nutricional y psicológico para mejorar la calidad de vida del paciente.              " +
                                                  "\n ALIMENTACIÓN: Para fortalecer el sistema inmunológico y apoyar la recuperación, se recomienda el consumo de alimentos    " +
                                                  "\n ricos en antioxidantes, proteínas y ácidos grasos esenciales. Brócoli y zanahorias: Contienen aproximadamente            " +
                                                  "\n 50-80 mg de vitamina C por cada 100 g, lo que representa hasta el 90% de la ingesta diaria recomendada, fortaleciendo    " +
                                                  "\n el sistema inmunológico. Salmón y chía: Son fuentes de omega-3, proporcionando entre 2-4 g por cada 100 g, lo que        " +
                                                  "\n ayuda a reducir la inflamación y mejorar la función celular. Frutas y verduras de colores vivos: Como arándanos y        " +
                                                  "\n espinacas, que son ricas en antioxidantes y ayudan a proteger las células del daño. Este es solo un diagnóstico          " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las          " +
                                                  "\n respuestas sean completamente correctas, para mayor seguridad se recomienda realizar más de un diagnóstico y consultar   " +
                                                  "\n a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular)             " +
                                                  "\n para mantener la hidratación y ayudar a reducir la inflamación, lo que es fundamental en el proceso de                   " +
                                                  "\n recuperación. La gonorrea puede provocar fiebre, dolor abdominal y secreción anormal, lo que aumenta el riesgo           " +
                                                  "\n de deshidratación. Es esencial consumir líquidos ricos en electrolitos, como sueros orales y caldos, para reponer        " +
                                                  "\n los minerales perdidos. También se recomienda el consumo de infusiones suaves, como manzanilla o jengibre, que           " +
                                                  "\n pueden ayudar a aliviar las molestias digestivas y mejorar la absorción de nutrientes. EJERCICIO: La actividad           " +
                                                  "\n física debe ser muy ligera y supervisada, evitando esfuerzos excesivos que puedan agravar los síntomas, ejercicios       " +
                                                  "\n de respiración profunda y movilidad suave pueden ser beneficiosos para mejorar la circulación y reducir la fatiga.       " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento estándar para la gonorrea en adolescentes incluye antibióticos como ceftriaxona      " +
                                                  "\n y azitromicina, administrados en una sola dosis, en México algunas marcas reconocidas incluyen Rocephin (ceftriaxona)    " +
                                                  "\n y Zithromax (azitromicina), además se recomienda reposo absoluto y una dieta adecuada para mejorar la recuperación.      " +
                                                  "\n ALIMENTACIÓN: Para fortalecer el sistema inmunológico y apoyar la recuperación, se recomienda el consumo de alimentos    " +
                                                  "\n ricos en vitamina C, antioxidantes y proteínas. Naranjas y fresas: Contienen aproximadamente 70-90 mg de vitamina C      " +
                                                  "\n por cada 100 g, lo que representa hasta el 100% de la ingesta diaria recomendada, fortaleciendo el sistema inmunológico  " +
                                                  "\n y ayudando a reducir la inflamación. Espinacas y lentejas: Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g,          " +
                                                  "\n cubriendo entre el 25% y 40% de la ingesta diaria recomendada, lo que ayuda a mejorar la oxigenación celular y           " +
                                                  "\n reducir el cansancio. Carnes magras y huevos: Son una fuente importante de proteínas, proporcionando entre 20 y          " +
                                                  "\n 25 g por cada 100 g, lo que equivale al 40-50% de la recomendación diaria, esenciales para la regeneración celular       " +
                                                  "\n y el fortalecimiento muscular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al     " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se   " +
                                                  "\n recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida)  " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraerHerpes genital." +
                                                  "\n HIDRATACIÓN: Mantener una hidratación adecuada es esencial para fortalecer el sistema inmunológico y reducir la       " +
                                                  "\n inflamación causada por el virus. Se recomienda el consumo diario de 1.5 a 2 litros de agua, además de infusiones     " +
                                                  "\n de manzanilla y jengibre, que poseen propiedades antiinflamatorias y pueden ayudar a aliviar el malestar. La          " +
                                                  "\n hidratación también contribuye a la regeneración celular y a la eliminación de toxinas, lo que puede ayudar a         " +
                                                  "\n reducir la frecuencia de los brotes. EJERCICIO: La actividad física debe ser moderada y enfocada en fortalecer        " +
                                                  "\n el sistema inmunológico. Se recomienda realizar ejercicios de bajo impacto, como yoga y caminatas suaves, que         " + 
                                                  "\n ayudan a reducir el estrés, un factor que puede desencadenar brotes del virus. También es recomendable practicar      " +
                                                  "\n ejercicios de relajación, como la meditación y la respiración profunda, para mejorar la respuesta del cuerpo ante     " +
                                                  "\n el virus. POSIBLE TRATAMIENTO: El tratamiento para el herpes genital incluye antivirales como aciclovir y             " +
                                                  "\n valaciclovir, que ayudan a reducir la duración y gravedad de los síntomas. En casos recurrentes, se puede optar       " +
                                                  "\n por terapia supresiva, que consiste en el uso diario de antivirales para reducir la frecuencia de los brotes y la     " +
                                                  "\n posibilidad de transmisión. También se recomienda el uso de cremas tópicas con lidocaína, que pueden aliviar el       " +
                                                  "\n dolor y la irritación en las lesiones. En México, estos medicamentos están disponibles en instituciones de salud      " +
                                                  "\n como el IMSS y el Insabi. ALIMENTACIÓN: También es recomendable el consumo de alimentos que fortalezcan el sistema    " +
                                                  "\n inmunológico y ayuden a reducir la inflamación, tales como frutas cítricas (naranjas, limones, toronjas), ricas en    " +
                                                  "\n vitamina C, que fortalece el sistema inmunológico. Verduras de hoja verde (espinacas, acelgas, brócoli), contienen    " +
                                                  "\n antioxidantes y hierro, esenciales para la salud celular. Pescados grasos (salmón, atún), ricos en Omega-3, con       " +
                                                  "\n propiedades antiinflamatorias. Frutos secos (almendras, nueces), aportan vitamina E, que ayuda a la regeneración      " +
                                                  "\n celular. Yogur natural, fuente de probióticos, que favorecen la salud intestinal y el sistema inmunológico. Este es   " +
                                                  "\n solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi   " +
                                                  "\n Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Además, por su salud, si la respuesta " +
                                                  "\n del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L. Montes agradece tu visita   " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN: La hidratación es clave para ayudar al cuerpo a eliminar toxinas y fortalecer el sistema inmunológico.     " +
                                                  "\n Se recomienda el consumo diario de 1.5 a 2 litros de agua, además de infusiones de equinácea y jengibre, que pueden     " +
                                                  "\n ayudar a mejorar la respuesta inmunológica. La hidratación también contribuye a la circulación sanguínea, lo que es     " +
                                                  "\n esencial para la recuperación de los tejidos afectados por la enfermedad. EJERCICIO: La actividad física debe ser       " +
                                                  "\n moderada y enfocada en mejorar la circulación sanguínea. Se recomienda realizar ejercicios aeróbicos suaves, como       " +
                                                  "\n caminatas y bicicleta estática, que ayudan a mejorar la oxigenación celular y la recuperación del cuerpo. También       " +
                                                  "\n es recomendable practicar ejercicios de resistencia, como el entrenamiento con pesas ligeras, para fortalecer el        " +
                                                  "\n sistema muscular y mejorar la respuesta del cuerpo ante la infección. POSIBLE TRATAMIENTO: El tratamiento para la       " +
                                                  "\n sífilis incluye penicilina benzatina, que es el medicamento de primera línea. En casos de alergia a la penicilina,      " +
                                                  "\n se pueden utilizar antibióticos alternativos como doxiciclina o ceftriaxona. Es fundamental completar el tratamiento    " +
                                                  "\n indicado por el médico para evitar complicaciones graves como la sífilis terciaria, que puede afectar el sistema        " +
                                                  "\n nervioso y cardiovascular. También se recomienda realizar pruebas de seguimiento para confirmar la eliminación de       " +
                                                  "\n la bacteria y evitar la transmisión a otras personas. En México, estos medicamentos están disponibles en instituciones  " +
                                                  "\n de salud como el IMSS y el Insabi. ALIMENTACIÓN: También es recomendable el consumo de alimentos que fortalezcan el     " +
                                                  "\n sistema inmunológico y ayuden a reducir la inflamación, tales como frutas cítricas (naranjas, limones, toronjas),       " +
                                                  "\n ricas en vitamina C, que fortalece el sistema inmunológico. Verduras de hoja verde (espinacas, acelgas, brócoli),       " +
                                                  "\n contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos (salmón, atún), ricos en Omega-3,   " +
                                                  "\n con propiedades antiinflamatorias. Frutos secos (almendras, nueces), aportan vitamina E, que ayuda a la regeneración    " +
                                                  "\n celular. Yogur natural, fuente de probióticos, que favorecen la salud intestinal y el sistema inmunológico. Este es     " +
                                                  "\n solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad" +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida" +
                                                  "\n para establecer mayor seguridad en el tratamiento adecuado del paciente. Además, por su salud, si la respuesta del    " +
                                                  "\n diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L. Montes agradece tu visita a la    " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACIÓN: La hidratación es fundamental para mantener la salud pulmonar y ayudar a eliminar toxinas del cuerpo.       " +
                                                  "\n Se recomienda el consumo diario de 2 a 2.5 litros de agua, además de infusiones de tomillo y eucalipto, que pueden       " +
                                                  "\n ayudar a mejorar la función respiratoria. La hidratación también contribuye a la eliminación de secreciones              " +
                                                  "\n pulmonares, lo que facilita la recuperación del paciente. EJERCICIO: La actividad física debe ser moderada y enfocada    " +
                                                  "\n en mejorar la capacidad pulmonar. Se recomienda realizar ejercicios de respiración profunda, como respiración            " +
                                                  "\n diafragmática y con labios fruncidos, que ayudan a mejorar la oxigenación. También es beneficioso practicar caminatas    " +
                                                  "\n suaves, evitando ambientes fríos o contaminados. POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis incluye        " +
                                                  "\n antibióticos como isoniazida, rifampicina y etambutol, que deben tomarse durante un período prolongado para garantizar   " +
                                                  "\n la eliminación de la bacteria. En casos de tuberculosis resistente a los medicamentos, se pueden utilizar esquemas de    " +
                                                  "\n tratamiento más prolongados con fármacos como bedaquilina y linezolid. Es fundamental seguir estrictamente el            " +
                                                  "\n tratamiento para evitar recaídas y la propagación de la enfermedad. También se recomienda realizar pruebas de            " +
                                                  "\n seguimiento para confirmar la eliminación de la bacteria y evitar la transmisión a otras personas. En México,            " +
                                                  "\n estos medicamentos están disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACIÓN: También           " +
                                                  "\n es recomendable el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación,       " +
                                                  "\n tales como frutas cítricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunológico.    " +
                                                  "\n Verduras de hoja verde (espinacas, acelgas, brócoli), contienen antioxidantes y hierro, esenciales para la salud celular." +
                                                  "\n Pescados grasos (salmón, atún), ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos (almendras, nueces),   " +
                                                  "\n aportan vitamina E, que ayuda a la regeneración celular. Yogur natural, fuente de probióticos, que favorecen la salud    " +
                                                  "\n intestinal y el sistema inmunológico. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se          " +
                                                  "\n recomienda realizar más de un Diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado          " +
                                                  "\n del paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar    " +
                                                  "\n a su médico. Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis. " +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física moderada y adaptada a su condición,          " +
                                                  "\n evitando ejercicios de alto impacto que puedan afectar sus articulaciones. Se sugiere ejercicios de bajo            " +
                                                  "\n impacto como natación, yoga o caminatas suaves, que ayudan a mejorar la movilidad sin generar estrés en las         " +
                                                  "\n articulaciones. HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua al día (ocho a diez          " +
                                                  "\n vasos de tamaño regular) para mantener una adecuada hidratación y ayudar a reducir la inflamación en las            " + 
                                                  "\n articulaciones. También es beneficioso el consumo de infusiones de cúrcuma y jengibre, que poseen propiedades       " +
                                                  "\n antiinflamatorias naturales. Además, el consumo de agua con limón puede ser útil debido a su contenido de           " +
                                                  "\n vitamina C, que contribuye a la producción de colágeno y la salud articular. POSIBLE TRATAMIENTO: Para la           " +
                                                  "\n artritis juvenil, el tratamiento suele incluir antiinflamatorios no esteroides (AINEs) como ibuprofeno o            " +
                                                  "\n naproxeno, además de fármacos modificadores de la enfermedad como metotrexato en casos más severos. También         " +
                                                  "\n pueden utilizarse terapias biológicas bajo supervisión médica. La fisioterapia es clave para mejorar la movilidad   " +
                                                  "\n y reducir el dolor, y en algunos casos se recomienda el uso de suplementos de colágeno y glucosamina para           " +
                                                  "\n fortalecer las articulaciones. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a reducir la          " +
                                                  "\n inflamación y fortalecer las articulaciones, tales como Pescados grasos (salmón, atún): ricos en ácidos grasos      " +
                                                  "\n Omega-3, que poseen propiedades antiinflamatorias. Frutas y verduras de colores vivos (arándanos, fresas,           " +
                                                  "\n espinacas, brócoli): ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las células      " +
                                                  "\n del daño y fortalecer el sistema inmunológico. Jengibre: contiene compuestos con efectos antiinflamatorios que      " +
                                                  "\n podrían ser beneficiosos para las articulaciones. Cúrcuma: con su componente activo, la curcumina, también tiene    " +
                                                  "\n potentes propiedades antiinflamatorias y antioxidantes. Semillas de chía y linaza: ricas en Omega-3 y fibra, que    " +
                                                  "\n ayudan a reducir la inflamación. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza " +
                                                  "\n al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda     " +
                                                  "\n realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta " +
                                                  "\n del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física ligera, evitando esfuerzos excesivos            " +
                                                  "\n que puedan agravar la tos y la dificultad respiratoria. Se sugiere ejercicios de respiración, caminatas suaves         " +
                                                  "\n y estiramientos para mejorar la capacidad pulmonar. HIDRATACIÓN: Debido a la tos persistente y la posible              " +
                                                  "\n deshidratación causada por la tosferina, se recomienda el consumo diario de 2.5 a 3 litros de agua al día (diez        " +
                                                  "\n a doce vasos de tamaño regular). También es beneficioso el consumo de infusiones de miel y jengibre, que pueden        " +
                                                  "\n ayudar a calmar la garganta y reducir la inflamación. Se recomienda el uso de bebidas tibias, como caldos y tés        " +
                                                  "\n de hierbas, para aliviar la irritación de la garganta. POSIBLE TRATAMIENTO: Para la tosferina en adolescentes, el      " +
                                                  "\n tratamiento suele incluir antibióticos como azitromicina, claritromicina o eritromicina, administrados bajo               " +
                                                  "\n supervisión médica. También se recomienda el uso de humidificadores para aliviar la irritación de las vías respiratorias. " +
                                                  "\n En casos graves, puede requerirse hospitalización con administración de oxígeno y líquidos intravenosos para prevenir     " +
                                                  "\n la deshidratación. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema respiratorio    " +
                                                  "\n y aliviar los síntomas, tales como Miel: ayuda a calmar la garganta y tiene propiedades antimicrobianas. Jengibre: con    " +
                                                  "\n propiedades antiinflamatorias que pueden aliviar la tos y mejorar la respuesta inmune. Frutas cítricas (naranjas,         " +
                                                  "\n limones, toronjas): ricas en vitamina C, que ayuda a mejorar la respuesta inmunológica. Caldo de pollo: fuente de         " +
                                                  "\n electrolitos y nutrientes esenciales para la recuperación. Ajo: contiene alicina, un compuesto con propiedades            " +
                                                  "\n antimicrobianas que pueden ayudar a combatir infecciones. Este es solo un diagnóstico predeterminado lógico. Haberlo      " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. " +
                                                  "\n Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud,    " +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física ligera, evitando esfuerzos excesivos que          " +
                                                  "\n puedan agravar la inflamación de las glándulas salivales. Se sugiere ejercicios de relajación y estiramientos            " +
                                                  "\n suaves. HIDRATACIÓN: Debido a la fiebre y la inflamación de las glándulas salivales, se recomienda el consumo            " +
                                                  "\n diario de 2.5 a 3 litros de agua al día (diez a doce vasos de tamaño regular). También es beneficioso el consumo         " +
                                                  "\n de infusiones de manzanilla, que pueden ayudar a reducir la inflamación, y agua de coco, que aporta electrolitos         " +
                                                  "\n esenciales. Se recomienda evitar bebidas ácidas como jugo de limón o naranja, ya que pueden irritar aún más las          " +
                                                  "\n glándulas salivales. POSIBLE TRATAMIENTO: Para las paperas en adolescentes, no existe un tratamiento específico,         " +
                                                  "\n ya que es una enfermedad viral autolimitada. Se recomienda reposo, hidratación y control de fiebre con paracetamol       " +
                                                  "\n (Tempra) o ibuprofeno. En casos graves, puede requerirse hospitalización con administración de líquidos intravenosos.    " +
                                                  "\n Se recomienda aplicar compresas frías en la zona inflamada para aliviar el dolor y la hinchazón. ALIMENTACIÓN:           " +
                                                  "\n Se recomienda el consumo de alimentos que ayuden a reducir la inflamación y fortalecer el sistema inmune, tales          " +
                                                  "\n como Frutas cítricas (naranjas, limones, toronjas): ricas en vitamina C, que ayuda a mejorar la respuesta inmunológica.  " +
                                                  "\n Papaya: contiene vitamina C y flavonoides que pueden ayudar a reducir la inflamación. Jengibre: con propiedades    " +
                                                  "\n antiinflamatorias que pueden aliviar la fatiga y mejorar la respuesta inmune. Miel: ayuda a calmar la garganta y   " +
                                                  "\n tiene propiedades antimicrobianas. Caldo de vegetales: fuente de electrolitos y nutrientes esenciales para la      " +
                                                  "\n recuperación. Yogur natural: fuente de probióticos que ayudan a restaurar la flora intestinal y fortalecer el      " +
                                                  "\n sistema inmune. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que     " +
                                                  "\n la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar más   " +
                                                  "\n de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del       " +
                                                  "\n diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita       " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física de baja intensidad, evitando esfuerzos            " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperación. Actividades como caminatas suaves, ejercicios          " +
                                                  "\n de respiración y yoga pueden ser beneficiosos para mantener el cuerpo activo sin comprometer la recuperación.            " +
                                                  "\n También se recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez muscular causada          " +
                                                  "\n por el reposo prolongado. HIDRATACIÓN: Es fundamental el consumo diario de 2 litros de agua (ocho vasos de tamaño        " +
                                                  "\n regular) para mantener una hidratación óptima y ayudar a aliviar los síntomas. También se recomienda el consumo de       " +
                                                  "\n infusiones con propiedades antiinflamatorias como el té de jengibre o manzanilla. POSIBLE TRATAMIENTO: No existe         " +
                                                  "\n un tratamiento específico para el virus del Zika, por lo que se recomienda reposo, hidratación abundante y el uso        " +
                                                  "\n de analgésicos como el paracetamol para aliviar los síntomas. También es importante evitar la exposición a mosquitos     " +
                                                  "\n para prevenir la propagación del virus. Se recomienda el uso de repelentes de insectos, ropa de manga larga y            " +
                                                  "\n mosquiteros para reducir el riesgo de picaduras. En casos graves, si se presentan síntomas neurológicos o complicaciones," +
                                                  "\n es fundamental acudir al médico para una evaluación más detallada. ALIMENTACIÓN: Es recomendable el consumo de         " +
                                                  "\n alimentos que ayuden a fortalecer el sistema inmune y mejorar la recuperación, tales como: Naranjas, ricas en          " +
                                                  "\n vitamina C, que ayuda a fortalecer el sistema inmunológico y reducir la duración de los síntomas. Espinacas, con       " +
                                                  "\n hierro, que contribuye a la producción de glóbulos rojos y mejora la oxigenación del cuerpo. Yogur, con probióticos    " +
                                                  "\n que favorecen la salud intestinal y fortalecen el sistema inmune. También se recomienda el consumo de alimentos ricos  " +
                                                  "\n en zinc para mejorar la respuesta inmune y acelerar la recuperación. Este es solo un diagnóstico predeterminado lógico." +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas.    " +
                                                  "\n Para mayor seguridad en el tratamiento adecuado, se recomienda realizar más de un diagnóstico y consultar a un médico. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física de baja intensidad, evitando esfuerzos                   " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperación. Actividades como caminatas suaves, juegos                     " +
                                                  "\n tranquilos y ejercicios de respiración pueden ser beneficiosos para mantener el cuerpo activo sin comprometer                   " +
                                                  "\n la recuperación. También se recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez                 " +
                                                  "\n muscular causada por el reposo prolongado. HIDRATACIÓN: Es fundamental el consumo diario de 2 a 2.5 litros de agua              " +
                                                  "\n (ocho a diez vasos de tamaño regular) para prevenir la deshidratación causada por la diarrea y ayudar a la recuperación         " +
                                                  "\n del organismo. Además, se recomienda el consumo de sueros de rehidratación oral para reponer los electrolitos perdidos.         " +
                                                  "\n POSIBLE TRATAMIENTO: Para el rotavirus en adolescentes, el tratamiento suele enfocarse en la rehidratación y el manejo          " +
                                                  "\n de los síntomas. Se recomienda el consumo de líquidos abundantes, sueros de rehidratación y el uso de medicamentos para         " +
                                                  "\n aliviar la fiebre y el malestar general. En casos graves, si la deshidratación es severa, puede requerirse hospitalización      " +
                                                  "\n para administración de líquidos intravenosos. También es importante evitar el consumo de alimentos irritantes como productos    " +
                                                  "\n lácteos, frituras y bebidas azucaradas, ya que pueden agravar los síntomas. ALIMENTACIÓN: Es recomendable el consumo de         " +
                                                  "\n alimentos que ayuden a la recuperación intestinal y fortalezcan el sistema inmune, tales como: Plátanos, ricos en potasio,      " +
                                                  "\n que ayudan a reponer electrolitos perdidos por la diarrea. Zanahorias, con vitamina A, que contribuye a la regeneración de      " +
                                                  "\n la mucosa intestinal. Yogur, con probióticos que favorecen la salud intestinal y fortalecen el sistema inmune. También se       " +
                                                  "\n recomienda el consumo de caldos y sopas suaves para facilitar la digestión y evitar irritaciones en el tracto intestinal.       " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta           " +
                                                  "\n enfermedad ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar        " +
                                                  "\n más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física moderada, evitando esfuerzos excesivos y         " +
                                                  "\n asegurando una recuperación adecuada. Ejercicios como caminatas suaves, estiramientos y yoga pueden ser beneficiosos    " +
                                                  "\n para mantener el cuerpo activo sin comprometer el tratamiento. También se recomienda ejercicios de relajación y         " +
                                                  "\n respiración profunda para reducir el estrés y mejorar la respuesta inmune. HIDRATACIÓN: Es fundamental el consumo       " +
                                                  "\n diario de 2 litros de agua (ocho vasos de tamaño regular) para ayudar a eliminar toxinas y mantener el organismo        " +
                                                  "\n en equilibrio. También se recomienda el consumo de jugos naturales ricos en antioxidantes para fortalecer el sistema    " +
                                                  "\n inmune. POSIBLE TRATAMIENTO: Para la listeriosis en adolescentes, el tratamiento suele incluir antibióticos como la     " +
                                                  "\n ampicilina o gentamicina, administrados bajo supervisión médica. En casos graves, si la infección se ha diseminado,     " +
                                                  "\n puede requerirse hospitalización y tratamiento intravenoso prolongado. También es importante evitar el consumo de       " +
                                                  "\n alimentos contaminados y mantener una higiene adecuada, asegurando la correcta manipulación y conservación de los       " +
                                                  "\n alimentos. Se recomienda evitar el consumo de productos lácteos sin pasteurizar, carnes crudas y pescados ahumados,     " +
                                                  "\n ya que pueden ser fuentes de infección. ALIMENTACIÓN: Es recomendable el consumo de alimentos que ayuden a fortalecer   " +
                                                  "\n el sistema inmune y mejorar la recuperación, tales como: Naranjas, ricas en vitamina C, que ayuda a fortalecer el       " +
                                                  "\n sistema inmunológico y reducir la duración de los síntomas. Espinacas, con hierro, que contribuye a la producción de    " +
                                                  "\n glóbulos rojos y mejora la oxigenación del cuerpo. Yogur, con probióticos que favorecen la salud intestinal y fortalecen" +
                                                  "\n el sistema inmune. También se recomienda el consumo de alimentos ricos en zinc para mejorar la respuesta inmune y    " +
                                                  "\n acelerar la recuperación. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento   " +
                                                  "\n adecuado, se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a  " +
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física de baja intensidad, evitando esfuerzos         " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperación. Actividades como caminatas suaves, juegos           " +
                                                  "\n tranquilos y ejercicios de respiración pueden ser beneficiosos para mantener el cuerpo activo sin comprometer         " +
                                                  "\n la recuperación. También se recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez       " +
                                                  "\n muscular causada por el reposo prolongado. HIDRATACIÓN: Es fundamental el consumo diario de 1.5 a 2 litros de agua    " +
                                                  "\n (seis a ocho vasos de tamaño regular) para prevenir la deshidratación causada por la diarrea y ayudar a la            " +
                                                  "\n recuperación del organismo. Además, se recomienda el consumo de sueros de rehidratación oral para reponer los         " +
                                                  "\n electrolitos perdidos. POSIBLE TRATAMIENTO: Para la shigelosis en adolescentes, el tratamiento suele incluir          " +
                                                  "\n antibióticos como la azitromicina o ciprofloxacino en casos graves, además de medidas de rehidratación oral para      " +
                                                  "\n evitar la deshidratación. También es importante mantener una higiene adecuada, lavarse las manos frecuentemente y     " +
                                                  "\n evitar el contacto con personas infectadas. En casos leves, el tratamiento puede centrarse en el manejo de los        " +
                                                  "\n síntomas con reposo, hidratación y una dieta adecuada. Se recomienda evitar el consumo de alimentos irritantes        " +
                                                  "\n como lácteos, frituras y comidas muy condimentadas, ya que pueden agravar la diarrea. ALIMENTACIÓN: Es recomendable   " +
                                                  "\n el consumo de alimentos que ayuden a la recuperación intestinal y fortalezcan el sistema inmune, tales como: Plátanos," +
                                                  "\n ricos en potasio, que ayudan a reponer electrolitos perdidos por la diarrea. Zanahorias, con vitamina A, que          " +
                                                  "\n contribuye a la regeneración de la mucosa intestinal. Yogur, con probióticos que favorecen la salud intestinal        " +
                                                  "\n y fortalecen el sistema inmune. También se recomienda el consumo de caldos y sopas suaves para facilitar la digestión " +
                                                  "\n y evitar irritaciones en el tracto intestinal. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad " +
                                                  "\n en el tratamiento adecuado, se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física adaptada a su capacidad respiratoria,           " +
                                                  "\n evitando esfuerzos excesivos y asegurando una respiración controlada. Ejercicios como caminatas suaves, natación,      " +
                                                  "\n yoga y técnicas de respiración pueden mejorar la función pulmonar y reducir la fatiga. También se recomienda           " +
                                                  "\n ejercicios de expansión torácica y fortalecimiento de los músculos respiratorios para mejorar la capacidad pulmonar.   " +
                                                  "\n Es importante realizar calentamiento previo y enfriamiento posterior para evitar crisis respiratorias. HIDRATACIÓN:    " +
                                                  "\n Es fundamental el consumo diario de 1.7 a 2 litros de agua (siete a ocho vasos de tamaño regular) para mantener las    " +
                                                  "\n vías respiratorias hidratadas y facilitar la eliminación de secreciones. También se recomienda el consumo de           " +
                                                  "\n infusiones con propiedades antiinflamatorias como el té de jengibre o manzanilla. POSIBLE TRATAMIENTO: Para el         " +
                                                  "\n EPOC en adolescentes, el tratamiento suele incluir broncodilatadores como el salbutamol, corticosteroides inhalados    " +
                                                  "\n como la fluticasona y, en casos graves, oxigenoterapia. También es importante evitar la exposición a contaminantes     " +
                                                  "\n ambientales y humo de tabaco. En algunos casos, se recomienda la rehabilitación pulmonar, que incluye ejercicios         " +
                                                  "\n específicos para mejorar la capacidad respiratoria y técnicas de manejo de la enfermedad. ALIMENTACIÓN: Es recomendable  " +
                                                  "\n el consumo de alimentos que ayuden a mejorar la función pulmonar y fortalezcan el sistema inmune, tales como: Pescados   " +
                                                  "\n grasos (salmón, atún), ricos en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias que pueden ayudar a      " +
                                                  "\n reducir la inflamación de las vías respiratorias. Frutas y verduras de colores vivos (arándanos, fresas, espinacas,      " +
                                                  "\n brócoli), ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las células del daño y fortalecer     " +
                                                  "\n el sistema inmunológico. Jengibre, contiene compuestos con efectos antiinflamatorios que podrían ser beneficiosos para        " +
                                                  "\n las vías respiratorias. Cúrcuma, con su componente activo, la curcumina, también tiene potentes propiedades antiinflamatorias " +
                                                  "\n y antioxidantes. También se recomienda el consumo de alimentos ricos en fibra para mejorar la digestión y evitar la        " +
                                                  "\n inflamación intestinal. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que     " +
                                                  "\n el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado,   " +
                                                  "\n se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física moderada, evitando esfuerzos excesivos y           " +
                                                  "\n asegurando una recuperación adecuada. Ejercicios como caminatas suaves, estiramientos y yoga pueden ser beneficiosos      " +
                                                  "\n para mantener el cuerpo activo sin comprometer el tratamiento. También se recomienda ejercicios de relajación y           " +
                                                  "\n respiración profunda para reducir el estrés y mejorar la respuesta inmune. HIDRATACIÓN: Es fundamental el consumo         " +
                                                  "\n diario de 1.5 a 2 litros de agua (seis a ocho vasos de tamaño regular) para ayudar a eliminar toxinas y mantener el       " +
                                                  "\n organismo en equilibrio. También se recomienda el consumo de jugos naturales ricos en antioxidantes para fortalecer       " +
                                                  "\n el sistema inmune. POSIBLE TRATAMIENTO: Para la clamidia en adolescentes, el tratamiento suele incluir antibióticos       " +
                                                  "\n como la azitromicina o doxiciclina, administrados bajo supervisión médica. También es importante evitar el contacto       " +
                                                  "\n con personas infectadas y mantener una higiene adecuada. En algunos casos, se recomienda el uso de probióticos para       " +
                                                  "\n ayudar a restaurar la flora vaginal y prevenir infecciones recurrentes. ALIMENTACIÓN: Es recomendable el consumo de       " +
                                                  "\n alimentos que ayuden a fortalecer el sistema inmune y mejorar la recuperación, tales como: Naranjas, ricas en vitamina C, " +
                                                  "\n que ayuda a fortalecer el sistema inmunológico y reducir la duración de los síntomas. Espinacas, con hierro, que contribuye " +
                                                  "\n a la producción de glóbulos rojos y mejora la oxigenación del cuerpo. Yogur, con probióticos que favorecen la salud         " +
                                                  "\n intestinal y fortalecen el sistema inmune. También se recomienda el consumo de alimentos ricos en zinc para mejorar         " +
                                                  "\n la respuesta inmune y acelerar la recuperación. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado       " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad       " +
                                                  "\n en el tratamiento adecuado, se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece   " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular)                " +
                                                  "\n para mantener la hidratación y ayudar a reducir la fiebre y los síntomas neurológicos, lo que es fundamental                " +
                                                  "\n en el proceso de recuperación. La meningitis bacteriana puede provocar fiebre alta, vómitos, rigidez en el cuello           " +
                                                  "\n y sensibilidad a la luz, lo que puede llevar a una mayor pérdida de líquidos. Es importante que el paciente consuma         " +
                                                  "\n líquidos ricos en electrolitos, como sueros orales, caldos y jugos naturales sin azúcar, para evitar la deshidratación      " +
                                                  "\n y mantener el equilibrio de minerales esenciales. También se recomienda el consumo de infusiones suaves, como               " +
                                                  "\n manzanilla o jengibre, que pueden ayudar a aliviar las náuseas y mejorar la digestión. EJERCICIO: La actividad              " +
                                                  "\n física debe ser muy ligera y supervisada, evitando esfuerzos excesivos que puedan agravar los síntomas, ejercicios          " +
                                                  "\n de respiración profunda y movilidad suave pueden ser beneficiosos para mejorar la capacidad pulmonar y la circulación.      " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento estándar para la meningitis bacteriana en adolescentes incluye antibióticos como        " +
                                                  "\n ceftriaxona, ampicilina y vancomicina, administrados por vía intravenosa durante 7 a 14 días, en México algunas marcas      " +
                                                  "\n reconocidas incluyen Rocephin (ceftriaxona) y Amikin (amikacina), además se recomienda el uso de corticosteroides como      " +
                                                  "\n dexametasona para reducir la inflamación cerebral en casos graves. ALIMENTACIÓN: Para fortalecer el sistema inmunológico    " +
                                                  "\n y apoyar la recuperación, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y proteínas. Naranjas    " +
                                                  "\n y fresas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa hasta el 100% de la ingesta    " +
                                                  "\n diaria recomendada, fortaleciendo el sistema inmunológico y ayudando a reducir la inflamación. Espinacas y lentejas:        " +
                                                  "\n Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25% y 40% de la ingesta diaria recomendada,         " +
                                                  "\n lo que ayuda a mejorar la oxigenación celular y reducir el cansancio. Carnes magras y huevos: Son una fuente importante     " +
                                                  "\n de proteínas, proporcionando entre 20 y 25 g por cada 100 g, lo que equivale al 40-50% de la recomendación diaria,          " +
                                                  "\n esenciales para la regeneración celular y el fortalecimiento muscular. Este es solo un diagnóstico predeterminado lógico,   " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente      " +
                                                  "\n correctas, para mayor seguridad se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes        " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tamaño regular) para          " +
                                                  "\n mantener la hidratación y ayudar a reducir los efectos secundarios del tratamiento, lo que es fundamental en el          " +
                                                  "\n proceso de recuperación. Los adolescentes con cáncer pueden experimentar vómitos, diarrea y sudoración excesiva,         " +
                                                  "\n lo que aumenta el riesgo de deshidratación. Es esencial consumir líquidos ricos en electrolitos, como sueros             " +
                                                  "\n orales y caldos, para reponer los minerales perdidos. También se recomienda el consumo de agua con limón o infusiones    " +
                                                  "\n suaves, que pueden ayudar a aliviar las náuseas y mejorar la digestión. EJERCICIO: La actividad física debe ser          " +
                                                  "\n moderada y adaptada, evitando esfuerzos excesivos que puedan debilitar el sistema inmunológico, ejercicios como          " +
                                                  "\n yoga, caminatas suaves y natación pueden ser beneficiosos para mejorar la resistencia y reducir la fatiga. POSIBLE       " +
                                                  "\n TRATAMIENTO: El tratamiento para el cáncer en adolescentes depende del tipo específico de cáncer, pero puede incluir     " +
                                                  "\n quimioterapia, radioterapia y cirugía, en México algunas marcas reconocidas incluyen Methotrexate (metotrexato) y        " +
                                                  "\n Vincristine (vincristina), además se recomienda el uso de terapias complementarias como apoyo nutricional y psicológico  " +
                                                  "\n para mejorar la calidad de vida del paciente. ALIMENTACIÓN: Para fortalecer el sistema inmunológico y apoyar la          " +
                                                  "\n recuperación, se recomienda el consumo de alimentos ricos en antioxidantes, proteínas y ácidos grasos esenciales.        " +
                                                  "\n Brócoli y zanahorias: Contienen aproximadamente 50-80 mg de vitamina C por cada 100 g, lo que representa hasta el        " +
                                                  "\n 90% de la ingesta diaria recomendada, fortaleciendo el sistema inmunológico. Salmón y chía: Son fuentes de omega-3,      " +
                                                  "\n proporcionando entre 2-4 g por cada 100 g, lo que ayuda a reducir la inflamación y mejorar la función celular. Frutas    " +
                                                  "\n y verduras de colores vivos: Como arándanos y espinacas, que son ricas en antioxidantes y ayudan a proteger las células  " +
                                                  "\n del daño. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente     " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar    " +
                                                  "\n más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.50-1.75 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física moderada a intensa diariamente, con una      " +
                                                  "\n duración aproximada de 60 minutos, aunque esta cantidad puede ajustarse según su condición. Actividades como        " +
                                                  "\n caminatas, ejercicios aeróbicos, natación y deportes de bajo impacto pueden ser beneficiosos para fortalecer        " +
                                                  "\n su sistema inmunológico y mejorar la recuperación. También se recomienda ejercicios de respiración profunda y       " +
                                                  "\n relajación para mejorar la oxigenación y reducir el estrés, lo que puede favorecer la recuperación. HIDRATACIÓN:    " +
                                                  "\n Es fundamental el consumo diario de 2 litros de agua (ocho vasos de tamaño regular) para mantener una hidratación   " +
                                                  "\n adecuada y ayudar al cuerpo a combatir la enfermedad. También se recomienda el consumo de infusiones calientes      " +
                                                  "\n como té de jengibre o manzanilla para aliviar los síntomas respiratorios. Además, el consumo de caldos y sopas      " +
                                                  "\n calientes puede ayudar a mantener la hidratación y proporcionar nutrientes esenciales para la recuperación.         " +
                                                  "\n POSIBLE TRATAMIENTO: Para la gripe en adolescentes, el tratamiento suele incluir medicamentos para reducir la       " +
                                                  "\n fiebre y aliviar los síntomas, como el paracetamol (Tempra) o el ibuprofeno. En casos específicos, se pueden        " +
                                                  "\n utilizar antivirales como el oseltamivir (Tamiflu). También es recomendable el uso de humidificadores para          " +
                                                  "\n mantener el aire húmedo y facilitar la respiración. El descanso adecuado es clave para la recuperación, por         " +
                                                  "\n lo que se recomienda dormir al menos 8 horas diarias y evitar actividades que puedan generar fatiga. En casos       " +
                                                  "\n más severos, si la fiebre persiste por más de tres días o hay dificultad para respirar, es fundamental acudir       " +
                                                  "\n al médico para una evaluación más detallada y considerar tratamientos adicionales como antibióticos en caso de      " +
                                                  "\n infecciones secundarias. ALIMENTACIÓN: Es recomendable el consumo de frutas y verduras que fortalezcan el sistema   " +
                                                  "\n inmune, tales como: Naranjas, ricas en vitamina C, que ayuda a fortalecer el sistema inmunológico y reducir la      " +
                                                  "\n duración de los síntomas. Fresas, con antioxidantes y vitamina C, esenciales para la protección celular y la        " +
                                                  "\n recuperación del organismo. Plátanos, ricos en potasio, que ayuda a reemplazar los electrolitos perdidos por        " +
                                                  "\n fiebre y sudoración. Kiwi, con vitamina C y potasio, que contribuyen a la función inmunológica y la recuperación    " +
                                                  "\n del cuerpo. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el       " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento         " +
                                                  "\n adecuado, se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita   " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física de baja intensidad, evitando esfuerzos          " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperación. Actividades como caminatas suaves, ejercicios        " +
                                                  "\n de respiración y yoga pueden ser beneficiosos para mantener el cuerpo activo sin comprometer la recuperación.          " +
                                                  "\n También se recomienda ejercicios de expansión torácica y fortalecimiento de los músculos respiratorios para            " +
                                                  "\n mejorar la capacidad pulmonar. HIDRATACIÓN: Es fundamental el consumo diario de 2 litros de agua (ocho vasos de        " +
                                                  "\n tamaño regular) para mantener una hidratación óptima y ayudar a fluidificar las secreciones pulmonares. También        " +
                                                  "\n se recomienda el consumo de caldos y sopas calientes para facilitar la digestión y evitar irritaciones en el           " +
                                                  "\n tracto respiratorio. Además, el consumo de jugos naturales sin azúcar puede aportar vitaminas esenciales para          " +
                                                  "\n fortalecer el sistema inmunológico. POSIBLE TRATAMIENTO: Para la neumonía en adolescentes, el tratamiento suele        " +
                                                  "\n incluir antibióticos como la amoxicilina o azitromicina en caso de infecciones bacterianas, además de medicamentos     " +
                                                  "\n para reducir la fiebre y aliviar los síntomas, como el paracetamol. En casos graves, puede requerirse hospitalización  " +
                                                  "\n y oxigenoterapia. También es importante evitar la exposición a contaminantes ambientales y humo de tabaco, ya que      " +
                                                  "\n pueden agravar los síntomas. En situaciones más severas, el tratamiento puede incluir terapia respiratoria con         " +
                                                  "\n nebulizaciones y monitoreo constante de la función pulmonar. ALIMENTACIÓN: Es recomendable el consumo de alimentos     " +
                                                  "\n que fortalezcan el sistema inmune y ayuden a la recuperación, tales como: Naranjas, ricas en vitamina C, que ayuda     " +
                                                  "\n a fortalecer el sistema inmunológico y reducir la duración de los síntomas. Espinacas, con hierro, que contribuye a    " +
                                                  "\n la producción de glóbulos rojos y mejora la oxigenación del cuerpo. Yogur, con probióticos que favorecen la salud      " +
                                                  "\n intestinal y fortalecen el sistema inmune. También se recomienda el consumo de alimentos ricos en zinc para mejorar    " +
                                                  "\n la respuesta inmune y acelerar la recuperación. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad  " +
                                                  "\n en el tratamiento adecuado, se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física moderada diariamente, con una duración         " +
                                                  "\n aproximada de 60 minutos, incluyendo ejercicios aeróbicos como caminar, correr o nadar, para mejorar la               " +
                                                  "\n sensibilidad a la insulina. También se recomienda la práctica de ejercicios de resistencia como el yoga o el          " +
                                                  "\n entrenamiento ligero con pesas para mejorar el metabolismo de la glucosa. HIDRATACIÓN: Es fundamental el consumo      " +
                                                  "\n diario de 2 litros de agua (ocho vasos de tamaño regular) para ayudar a mantener niveles adecuados de glucosa en      " +
                                                  "\n sangre y prevenir la deshidratación. También se recomienda el consumo de bebidas sin azúcar como infusiones           " +
                                                  "\n naturales o agua con limón. Además, el consumo de alimentos con alto contenido de fibra puede ayudar a estabilizar    " +
                                                  "\n los niveles de glucosa en sangre. POSIBLE TRATAMIENTO: Para la diabetes en adolescentes, el tratamiento suele         " +
                                                  "\n incluir insulina en el caso de diabetes tipo 1, mientras que en diabetes tipo 2 puede requerirse metformina y         " +
                                                  "\n cambios en el estilo de vida. Es esencial el monitoreo constante de la glucosa en sangre y el seguimiento médico.     " +
                                                  "\n También es recomendable la educación sobre el manejo de la enfermedad para evitar complicaciones a largo plazo.       " +
                                                  "\n En algunos casos, se pueden utilizar medicamentos adicionales como inhibidores de SGLT2 o agonistas de GLP-1 para     " +
                                                  "\n mejorar el control de la glucosa. ALIMENTACIÓN: Es recomendable el consumo de alimentos que ayuden a regular los      " +
                                                  "\n niveles de glucosa y fortalezcan el organismo, tales como: Avena, rica en fibra soluble, que ayuda a estabilizar      " +
                                                  "\n los niveles de azúcar en sangre. Frutos secos, con grasas saludables y magnesio, que contribuyen a la regulación      " +
                                                  "\n de la glucosa. Legumbres, con proteínas vegetales y fibra, que favorecen la saciedad y el control de la glucosa.      " +
                                                  "\n También se recomienda el consumo de alimentos ricos en ácidos grasos Omega-3 para mejorar la función metabólica y     " +
                                                  "\n reducir la inflamación. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100%    " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento    " +
                                                  "\n adecuado, se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita     " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para         " +
                                                  "\n mantener las vías respiratorias hidratadas y reducir la viscosidad de las secreciones, lo que facilita la respiración.    " +
                                                  "\n La deshidratación puede agravar los síntomas del asma, aumentando la irritación de las vías respiratorias y la            " +
                                                  "\n frecuencia de los episodios de tos. Es importante consumir líquidos ricos en electrolitos, como sueros orales y           " +
                                                  "\n caldos, para mantener el equilibrio de minerales esenciales. También se recomienda el consumo de infusiones suaves,       " +
                                                  "\n como manzanilla o jengibre, que pueden ayudar a reducir la inflamación y mejorar la función pulmonar. EJERCICIO:          " +
                                                  "\n La actividad física debe ser moderada y adaptada, evitando esfuerzos excesivos que puedan desencadenar crisis asmáticas,  " +
                                                  "\n ejercicios como natación, yoga y caminatas suaves pueden ser beneficiosos para mejorar la capacidad pulmonar y reducir    " +
                                                  "\n la inflamación. POSIBLE TRATAMIENTO: El tratamiento estándar para el asma en adolescentes incluye broncodilatadores       " +
                                                  "\n de alivio rápido como salbutamol, además de corticosteroides inhalados como fluticasona o budesonida, en México algunas   " +
                                                  "\n marcas reconocidas incluyen Ventolin (salbutamol) y Pulmicort (budesonida), en casos más severos pueden utilizarse        " +
                                                  "\n biológicos como omalizumab, bajo estricta supervisión médica. ALIMENTACIÓN: Para fortalecer el sistema respiratorio       " +
                                                  "\n y reducir la inflamación, se recomienda el consumo de alimentos ricos en omega-3, antioxidantes y vitamina C. Salmón      " +
                                                  "\n y chía: Contienen aproximadamente 2-4 g de omega-3 por cada 100 g, lo que ayuda a reducir la inflamación de las vías      " +
                                                  "\n respiratorias. Fresas y arándanos: Aportan 50-90 mg de vitamina C por cada 100 g, cubriendo hasta el 100% de la ingesta   " +
                                                  "\n diaria recomendada, fortaleciendo el sistema inmunológico. Jengibre y cúrcuma: Poseen propiedades antiinflamatorias y     " +
                                                  "\n antioxidantes, ayudando a reducir la irritación de las vías respiratorias. Este es solo un diagnóstico predeterminado     " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean    " +
                                                  "\n completamente correctas, para mayor seguridad se recomienda realizar más de un diagnóstico y consultar a un médico. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tamaño regular) para              " +
                                                  "\n mantener la hidratación y reducir la fatiga, lo que es fundamental en el proceso de recuperación. El VIH puede               " +
                                                  "\n provocar fiebre, sudoración nocturna y diarrea, lo que aumenta el riesgo de deshidratación. Es esencial consumir             " +
                                                  "\n líquidos ricos en electrolitos, como sueros orales y caldos, para reponer los minerales perdidos. También se                 " +
                                                  "\n recomienda el consumo de agua con limón o infusiones suaves, que pueden ayudar a aliviar las náuseas y mejorar la            " +
                                                  "\n digestión. EJERCICIO: La actividad física debe ser moderada y adaptada, evitando esfuerzos excesivos que puedan              " +
                                                  "\n debilitar el sistema inmunológico, ejercicios como yoga, caminatas suaves y natación pueden ser beneficiosos para            " +
                                                  "\n mejorar la resistencia y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento para el VIH en adolescentes incluye          " +
                                                  "\n terapia antirretroviral (TAR) con medicamentos como tenofovir, emtricitabina y dolutegravir, en México algunas marcas        " +
                                                  "\n reconocidas incluyen Truvada (tenofovir/emtricitabina) y Tivicay (dolutegravir), además se recomienda el uso de              " +
                                                  "\n terapias complementarias como apoyo nutricional y psicológico para mejorar la calidad de vida del paciente. ALIMENTACIÓN:    " +
                                                  "\n Para fortalecer el sistema inmunológico y apoyar la recuperación, se recomienda el consumo de alimentos ricos en             " +
                                                  "\n antioxidantes, proteínas y ácidos grasos esenciales. Brócoli y zanahorias: Contienen aproximadamente 50-80 mg de             " +
                                                  "\n vitamina C por cada 100 g, lo que representa hasta el 90% de la ingesta diaria recomendada, fortaleciendo el sistema         " +
                                                  "\n inmunológico. Salmón y chía: Son fuentes de omega-3, proporcionando entre 2-4 g por cada 100 g, lo que ayuda a reducir       " +
                                                  "\n la inflamación y mejorar la función celular. Frutas y verduras de colores vivos: Como arándanos y espinacas, que son         " +
                                                  "\n ricas en antioxidantes y ayudan a proteger las células del daño. Este es solo un diagnóstico predeterminado lógico,          " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente       " +
                                                  "\n correctas, para mayor seguridad se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes         " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular)          " +
                                                  "\n para mantener la hidratación y ayudar a reducir la inflamación, lo que es fundamental en el proceso de                " +
                                                  "\n recuperación. La gonorrea puede provocar fiebre, dolor abdominal y secreción anormal, lo que aumenta el riesgo        " +
                                                  "\n de deshidratación. Es esencial consumir líquidos ricos en electrolitos, como sueros orales y caldos, para reponer     " +
                                                  "\n los minerales perdidos. También se recomienda el consumo de infusiones suaves, como manzanilla o jengibre, que        " +
                                                  "\n pueden ayudar a aliviar las molestias digestivas y mejorar la absorción de nutrientes. EJERCICIO: La actividad        " +
                                                  "\n física debe ser muy ligera y supervisada, evitando esfuerzos excesivos que puedan agravar los síntomas, ejercicios    " +
                                                  "\n de respiración profunda y movilidad suave pueden ser beneficiosos para mejorar la circulación y reducir la fatiga.    " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento estándar para la gonorrea en adolescentes incluye antibióticos como ceftriaxona   " +
                                                  "\n y azitromicina, administrados en una sola dosis, en México algunas marcas reconocidas incluyen Rocephin (ceftriaxona)  " +
                                                  "\n y Zithromax (azitromicina), además se recomienda reposo absoluto y una dieta adecuada para mejorar la recuperación.    " +
                                                  "\n ALIMENTACIÓN: Para fortalecer el sistema inmunológico y apoyar la recuperación, se recomienda el consumo de alimentos  " +
                                                  "\n ricos en vitamina C, antioxidantes y proteínas. Naranjas y fresas: Contienen aproximadamente 70-90 mg de vitamina C    " +
                                                  "\n por cada 100 g, lo que representa hasta el 100% de la ingesta diaria recomendada, fortaleciendo el sistema inmunológico" +
                                                  "\n y ayudando a reducir la inflamación. Espinacas y lentejas: Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g,        " +
                                                  "\n cubriendo entre el 25% y 40% de la ingesta diaria recomendada, lo que ayuda a mejorar la oxigenación celular y         " +
                                                  "\n reducir el cansancio. Carnes magras y huevos: Son una fuente importante de proteínas, proporcionando entre 20 y        " +
                                                  "\n 25 g por cada 100 g, lo que equivale al 40-50% de la recomendación diaria, esenciales para la regeneración celular     " +
                                                  "\n y el fortalecimiento muscular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza      " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad " +
                                                  "\n se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app       " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACIÓN: Mantener una hidratación adecuada es esencial para fortalecer el sistema inmunológico y reducir la            " +
                                                  "\n inflamación causada por el virus. Se recomienda el consumo diario de agua suficiente, además de infusiones de              " +
                                                  "\n manzanilla y jengibre, que poseen propiedades antiinflamatorias y pueden ayudar a aliviar el malestar. La                  " +
                                                  "\n hidratación también contribuye a la regeneración celular y a la eliminación de toxinas, lo que puede ayudar                " +
                                                  "\n a reducir la frecuencia de los brotes. EJERCICIO: La actividad física debe ser moderada y enfocada en fortalecer           " +
                                                  "\n el sistema inmunológico. Se recomienda realizar ejercicios de bajo impacto, como yoga y caminatas suaves, que ayudan       " +
                                                  "\n a reducir el estrés, un factor que puede desencadenar brotes del virus. También es recomendable practicar ejercicios       " +
                                                  "\n de relajación, como la meditación y la respiración profunda, para mejorar la respuesta del cuerpo ante el virus.           " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para el herpes genital incluye antivirales como aciclovir y valaciclovir, que          " +
                                                  "\n ayudan a reducir la duración y gravedad de los síntomas. En casos recurrentes, se puede optar por terapia supresiva,       " +
                                                  "\n que consiste en el uso diario de antivirales para reducir la frecuencia de los brotes y la posibilidad de transmisión.     " +
                                                  "\n También se recomienda el uso de cremas tópicas con lidocaína, que pueden aliviar el dolor y la irritación en las           " +
                                                  "\n lesiones. En México, estos medicamentos están disponibles en instituciones de salud como el IMSS y el Insabi.              " +
                                                  "\n ALIMENTACIÓN: También es recomendable el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden             " +
                                                  "\n a reducir la inflamación, tales como frutas cítricas, ricas en vitamina C, que fortalece el sistema inmunológico.          " +
                                                  "\n Verduras de hoja verde, que contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos,           " +
                                                  "\n ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos, que aportan vitamina E, que ayuda a la regeneración     " +
                                                  "\n celular. Yogur natural, fuente de probióticos, que favorecen la salud intestinal y el sistema inmunológico. Este es        " +
                                                  "\n solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta              " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico     " +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Además, por su salud, si la            " +
                                                  "\n respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L. Montes agradece          " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN: La hidratación es clave para ayudar al cuerpo a eliminar toxinas y fortalecer el sistema inmunológico.        " +
                                                  "\n Se recomienda el consumo diario de agua suficiente, además de infusiones de equinácea y jengibre, que pueden ayudar        " +
                                                  "\n a mejorar la respuesta inmunológica. La hidratación también contribuye a la circulación sanguínea, lo que es esencial      " +
                                                  "\n para la recuperación de los tejidos afectados por la enfermedad. EJERCICIO: La actividad física debe ser moderada y        " +
                                                  "\n enfocada en mejorar la circulación sanguínea. Se recomienda realizar ejercicios aeróbicos suaves, como caminatas y bicicleta" +
                                                  "\n estática, que ayudan a mejorar la oxigenación celular y la recuperación del cuerpo. También es recomendable practicar      " +
                                                  "\n ejercicios de resistencia, como el entrenamiento con pesas ligeras, para fortalecer el sistema muscular y mejorar la       " +
                                                  "\n respuesta del cuerpo ante la infección. POSIBLE TRATAMIENTO: El tratamiento para la sífilis incluye penicilina benzatina,  " +
                                                  "\n que es el medicamento de primera línea. En casos de alergia a la penicilina, se pueden utilizar antibióticos alternativos  " +
                                                  "\n como doxiciclina o ceftriaxona. Es fundamental completar el tratamiento indicado por el médico para evitar complicaciones  " +
                                                  "\n graves como la sífilis terciaria, que puede afectar el sistema nervioso y cardiovascular. También se recomienda realizar   " +
                                                  "\n pruebas de seguimiento para confirmar la eliminación de la bacteria y evitar la transmisión a otras personas. Además, en   " +
                                                  "\n casos avanzados de la enfermedad, puede ser necesario monitoreo médico frecuente y tratamiento adicional para controlar    " +
                                                  "\n los efectos secundarios en órganos afectados. En México, estos medicamentos están disponibles en instituciones de salud    " +
                                                  "\n como el IMSS y el Insabi. ALIMENTACIÓN: También es recomendable el consumo de alimentos que fortalezcan el sistema         " +
                                                  "\n inmunológico y ayuden a reducir la inflamación, tales como frutas cítricas, ricas en vitamina C, que fortalece el sistema  " +
                                                  "\n inmunológico. Verduras de hoja verde, que contienen antioxidantes y hierro, esenciales para la salud celular. Pescados     " +
                                                  "\n grasos, ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos, que aportan vitamina E, que ayuda a la          " +
                                                  "\n regeneración celular. Yogur natural, fuente de probióticos, que favorecen la salud intestinal y el sistema inmunológico.   " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta      " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico     " +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Además, por su salud, si la respuesta  " +
                                                  "\n del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L. Montes agradece tu visita a la  " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACIÓN: La hidratación es fundamental para mantener la salud pulmonar y ayudar a eliminar toxinas del cuerpo.          " +
                                                  "\n Se recomienda el consumo diario de agua suficiente, además de infusiones de tomillo y eucalipto, que pueden ayudar          " +
                                                  "\n a mejorar la función respiratoria. La hidratación también contribuye a la eliminación de secreciones pulmonares, lo         " +
                                                  "\n que facilita la recuperación del paciente. EJERCICIO: La actividad física debe ser moderada y enfocada en mejorar la        " +
                                                  "\n capacidad pulmonar. Se recomienda realizar ejercicios de respiración profunda, como respiración diafragmática y con         " +
                                                  "\n labios fruncidos, que ayudan a mejorar la oxigenación. También es beneficioso practicar caminatas suaves, evitando          " +
                                                  "\n ambientes fríos o contaminados. POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis incluye antibióticos como          " +
                                                  "\n isoniazida, rifampicina y etambutol, que deben tomarse durante un período prolongado para garantizar la eliminación         " +
                                                  "\n de la bacteria. En casos de tuberculosis resistente a los medicamentos, se pueden utilizar esquemas de tratamiento más      " +
                                                  "\n prolongados con fármacos como bedaquilina y linezolid. Es fundamental seguir estrictamente el tratamiento para evitar       " +
                                                  "\n recaídas y la propagación de la enfermedad. También se recomienda realizar pruebas de seguimiento para confirmar la         " +
                                                  "\n eliminación de la bacteria y evitar la transmisión a otras personas. En casos severos, el tratamiento puede extenderse      " +
                                                  "\n por varios meses, incluyendo monitoreo médico frecuente y posibles ajustes en la medicación según la evolución del          " +
                                                  "\n paciente. En México, estos medicamentos están disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACIÓN: " +
                                                  "\n También es recomendable el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación,  " +
                                                  "\n tales como frutas cítricas, ricas en vitamina C, que fortalece el sistema inmunológico. Verduras de hoja verde, que         " + 
                                                  "\n contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos, ricos en Omega-3, con propiedades      " +
                                                  "\n antiinflamatorias. Frutos secos, que aportan vitamina E, que ayuda a la regeneración celular. Yogur natural, fuente de      " +
                                                  "\n probióticos, que favorecen la salud intestinal y el sistema inmunológico. Este es solo un diagnóstico predeterminado        " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean            " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mayor           " +
                                                  "\n seguridad en el tratamiento adecuado del paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface    " +
                                                  "\n del todo, se recomienda consultar a su médico. Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física moderada y adaptada a su condición,                   " +
                                                  "\n evitando ejercicios de alto impacto que puedan afectar sus articulaciones. Se sugiere ejercicios de bajo impacto             " +
                                                  "\n como natación, yoga o caminatas suaves, que ayudan a mejorar la movilidad sin generar estrés en las articulaciones.          " +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua al día para mantener una adecuada hidratación         " +
                                                  "\n y ayudar a reducir la inflamación en las articulaciones. También es beneficioso el consumo de infusiones de cúrcuma          " +
                                                  "\n y jengibre, que poseen propiedades antiinflamatorias naturales. Además, el consumo de agua con limón puede ser útil          " +
                                                  "\n debido a su contenido de vitamina C, que contribuye a la producción de colágeno y la salud articular. POSIBLE                " +
                                                  "\n TRATAMIENTO: Para la artritis juvenil, el tratamiento suele incluir antiinflamatorios no esteroides (AINEs) como             " +
                                                  "\n ibuprofeno o naproxeno, además de fármacos modificadores de la enfermedad como metotrexato en casos más severos.             " +
                                                  "\n También pueden utilizarse terapias biológicas bajo supervisión médica. La fisioterapia es clave para mejorar la movilidad    " +
                                                  "\n y reducir el dolor, y en algunos casos se recomienda el uso de suplementos de colágeno y glucosamina para fortalecer las     " +
                                                  "\n articulaciones. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a reducir la inflamación y fortalecer las     " +
                                                  "\n articulaciones, tales como Pescados grasos (salmón, atún): ricos en ácidos grasos Omega-3, que poseen propiedades            " +
                                                  "\n antiinflamatorias. Frutas y verduras de colores vivos (arándanos, fresas, espinacas, brócoli): ricas en antioxidantes como   " +
                                                  "\n la vitamina C y carotenoides, que pueden proteger las células del daño y fortalecer el sistema inmunológico. Jengibre:       " +
                                                  "\n contiene compuestos con efectos antiinflamatorios que podrían ser beneficiosos para las articulaciones. Cúrcuma: con su      " +
                                                  "\n componente activo, la curcumina, también tiene potentes propiedades antiinflamatorias y antioxidantes. Semillas de chía      " +
                                                  "\n y linaza: ricas en Omega-3 y fibra, que ayudan a reducir la inflamación. Este es solo un diagnóstico predeterminado lógico.  " +
                                                  "\n Haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente     " +
                                                  "\n correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su    " +
                                                  "\n salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física ligera, evitando esfuerzos excesivos         " +
                                                  "\n que puedan agravar la tos y la dificultad respiratoria. Se sugiere ejercicios de respiración, caminatas suaves      " +
                                                  "\n y estiramientos para mejorar la capacidad pulmonar. HIDRATACIÓN: Debido a la tos persistente y la posible           " +
                                                  "\n deshidratación causada por la tosferina, se recomienda el consumo diario de 2.5 a 3 litros de agua al día.          " +
                                                  "\n También es beneficioso el consumo de infusiones de miel y jengibre, que pueden ayudar a calmar la garganta          " +
                                                  "\n y reducir la inflamación. Se recomienda el uso de bebidas tibias, como caldos y tés de hierbas, para aliviar        " +
                                                  "\n la irritación de la garganta. POSIBLE TRATAMIENTO: Para la tosferina en adolescentes, el tratamiento suele          " +
                                                  "\n incluir antibióticos como azitromicina, claritromicina o eritromicina, administrados bajo supervisión médica.       " +
                                                  "\n También se recomienda el uso de humidificadores para aliviar la irritación de las vías respiratorias. En casos      " +
                                                  "\n graves, puede requerirse hospitalización con administración de oxígeno y líquidos intravenosos para prevenir la     " +
                                                  "\n deshidratación. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema respiratorio " +
                                                  "\n y aliviar los síntomas, tales como Miel: ayuda a calmar la garganta y tiene propiedades antimicrobianas. Jengibre:  " +
                                                  "\n con propiedades antiinflamatorias que pueden aliviar la tos y mejorar la respuesta inmune. Frutas cítricas (naranjas,  " +
                                                  "\n limones, toronjas): ricas en vitamina C, que ayuda a mejorar la respuesta inmunológica. Caldo de pollo: fuente de      " +
                                                  "\n electrolitos y nutrientes esenciales para la recuperación. Ajo: contiene alicina, un compuesto con propiedades         " +
                                                  "\n antimicrobianas que pueden ayudar a combatir infecciones. Este es solo un diagnóstico predeterminado lógico. Haberlo   " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente         " +
                                                  "\n correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además,       " +
                                                  "\n por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel     " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física ligera, evitando esfuerzos excesivos que       " +
                                                  "\n puedan agravar la inflamación de las glándulas salivales. Se sugiere ejercicios de relajación y estiramientos         " +
                                                  "\n suaves. HIDRATACIÓN: Debido a la fiebre y la inflamación de las glándulas salivales, se recomienda el consumo         " +
                                                  "\n diario de 2.5 a 3 litros de agua al día. También es beneficioso el consumo de infusiones de manzanilla, que pueden    " +
                                                  "\n ayudar a reducir la inflamación, y agua de coco, que aporta electrolitos esenciales. Se recomienda evitar bebidas     " +
                                                  "\n ácidas como jugo de limón o naranja, ya que pueden irritar aún más las glándulas salivales. POSIBLE TRATAMIENTO:      " +
                                                  "\n Para las paperas en adolescentes, no existe un tratamiento específico, ya que es una enfermedad viral autolimitada.   " +
                                                  "\n Se recomienda reposo, hidratación y control de fiebre con paracetamol (Tempra) o ibuprofeno. En casos graves, puede   " +
                                                  "\n requerirse hospitalización con administración de líquidos intravenosos. Se recomienda aplicar compresas frías en la   " +
                                                  "\n zona inflamada para aliviar el dolor y la hinchazón. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden   " +
                                                  "\n a reducir la inflamación y fortalecer el sistema inmune, tales como Frutas cítricas (naranjas, limones, toronjas):    " +
                                                  "\n ricas en vitamina C, que ayuda a mejorar la respuesta inmunológica. Papaya: contiene vitamina C y flavonoides que     " +
                                                  "\n pueden ayudar a reducir la inflamación. Jengibre: con propiedades antiinflamatorias que pueden aliviar la fatiga y    " +
                                                  "\n mejorar la respuesta inmune. Miel: ayuda a calmar la garganta y tiene propiedades antimicrobianas. Caldo de vegetales:    " +
                                                  "\n fuente de electrolitos y nutrientes esenciales para la recuperación. Yogur natural: fuente de probióticos que ayudan a    " +
                                                  "\n restaurar la flora intestinal y fortalecer el sistema inmune. Este es solo un diagnóstico predeterminado lógico. Haberlo  " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. " +
                                                  "\n Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si  " +
                                                  "\n la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu  " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física de baja intensidad, evitando esfuerzos              " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperación. Actividades como caminatas suaves, ejercicios            " +
                                                  "\n de respiración y yoga pueden ser beneficiosos para mantener el cuerpo activo sin comprometer la recuperación.              " +
                                                  "\n También se recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez muscular causada            " +
                                                  "\n por el reposo prolongado. HIDRATACIÓN: Es fundamental el consumo diario de 2 litros de agua (ocho vasos de tamaño          " +
                                                  "\n regular) para mantener una hidratación óptima y ayudar a aliviar los síntomas. También se recomienda el consumo de         " +
                                                  "\n infusiones con propiedades antiinflamatorias como el té de jengibre o manzanilla. POSIBLE TRATAMIENTO: No existe un        " +
                                                  "\n tratamiento específico para el virus del Zika, por lo que se recomienda reposo, hidratación abundante y el uso de          " + 
                                                  "\n analgésicos como el paracetamol para aliviar los síntomas. También es importante evitar la exposición a mosquitos          " +
                                                  "\n para prevenir la propagación del virus. Se recomienda el uso de repelentes de insectos, ropa de manga larga y mosquiteros  " +
                                                  "\n para reducir el riesgo de picaduras. En casos graves, si se presentan síntomas neurológicos o complicaciones, es           " +
                                                  "\n fundamental acudir al médico para una evaluación más detallada. ALIMENTACIÓN: Es recomendable el consumo de alimentos      " +
                                                  "\n que ayuden a fortalecer el sistema inmune y mejorar la recuperación, tales como: Naranjas, ricas en vitamina C, que        " +
                                                  "\n ayuda a fortalecer el sistema inmunológico y reducir la duración de los síntomas. Espinacas, con hierro, que contribuye    " +
                                                  "\n a la producción de glóbulos rojos y mejora la oxigenación del cuerpo. Yogur, con probióticos que favorecen la salud        " +
                                                  "\n intestinal y fortalecen el sistema inmune. También se recomienda el consumo de alimentos ricos en zinc para mejorar        " +
                                                  "\n la respuesta inmune y acelerar la recuperación. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado      " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad      " +
                                                  "\n en el tratamiento adecuado, se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece  " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física de baja intensidad, evitando esfuerzos             " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperación. Actividades como caminatas suaves, juegos               " +
                                                  "\n tranquilos y ejercicios de respiración pueden ser beneficiosos para mantener el cuerpo activo sin comprometer             " +
                                                  "\n la recuperación. También se recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez           " +
                                                  "\n muscular causada por el reposo prolongado. HIDRATACIÓN: Es fundamental el consumo diario de 2 a 2.5 litros de             " +
                                                  "\n agua (ocho a diez vasos de tamaño regular) para prevenir la deshidratación causada por la diarrea y ayudar a la           " +
                                                  "\n recuperación del organismo. Además, se recomienda el consumo de sueros de rehidratación oral para reponer los             " +
                                                  "\n electrolitos perdidos. POSIBLE TRATAMIENTO: Para el rotavirus en adolescentes, el tratamiento suele enfocarse en          " +
                                                  "\n la rehidratación y el manejo de los síntomas. Se recomienda el consumo de líquidos abundantes, sueros de rehidratación    " +
                                                  "\n y el uso de medicamentos para aliviar la fiebre y el malestar general. En casos graves, si la deshidratación es severa,   " +
                                                  "\n puede requerirse hospitalización para administración de líquidos intravenosos. También es importante evitar el consumo    " +
                                                  "\n de alimentos irritantes como productos lácteos, frituras y bebidas azucaradas, ya que pueden agravar los síntomas.        " +
                                                  "\n ALIMENTACIÓN: Es recomendable el consumo de alimentos que ayuden a la recuperación intestinal y fortalezcan el sistema    " +
                                                  "\n inmune, tales como: Plátanos, ricos en potasio, que ayudan a reponer electrolitos perdidos por la diarrea. Zanahorias,    " +
                                                  "\n con vitamina A, que contribuye a la regeneración de la mucosa intestinal. Yogur, con probióticos que favorecen la salud   " +
                                                  "\n intestinal y fortalecen el sistema inmune. También se recomienda el consumo de caldos y sopas suaves para facilitar la    " +
                                                  "\n digestión y evitar irritaciones en el tracto intestinal. Este es solo un diagnóstico predeterminado lógico. Haberlo       " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor    " +
                                                  "\n seguridad en el tratamiento adecuado, se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L       " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física moderada, evitando esfuerzos excesivos              " +
                                                  "\n y asegurando una recuperación adecuada. Ejercicios como caminatas suaves, estiramientos y yoga pueden ser                  " +
                                                  "\n beneficiosos para mantener el cuerpo activo sin comprometer el tratamiento. También se recomienda ejercicios               " +
                                                  "\n de relajación y respiración profunda para reducir el estrés y mejorar la respuesta inmune. HIDRATACIÓN: Es                 " +
                                                  "\n fundamental el consumo diario de 2 litros de agua (ocho vasos de tamaño regular) para ayudar a eliminar toxinas            " +
                                                  "\n y mantener el organismo en equilibrio. También se recomienda el consumo de jugos naturales ricos en antioxidantes          " +
                                                  "\n para fortalecer el sistema inmune. POSIBLE TRATAMIENTO: Para la listeriosis en adolescentes, el tratamiento suele          " +
                                                  "\n incluir antibióticos como la ampicilina o gentamicina, administrados bajo supervisión médica. En casos graves, si          " +
                                                  "\n la infección se ha diseminado, puede requerirse hospitalización y tratamiento intravenoso prolongado. También es           " +
                                                  "\n importante evitar el consumo de alimentos contaminados y mantener una higiene adecuada, asegurando la correcta             " +
                                                  "\n manipulación y conservación de los alimentos. Se recomienda evitar el consumo de productos lácteos sin pasteurizar,        " +
                                                  "\n carnes crudas y pescados ahumados, ya que pueden ser fuentes de infección. En situaciones más severas, el tratamiento      " +
                                                  "\n puede incluir monitoreo constante de la función neurológica y terapia de soporte para evitar complicaciones.               " +
                                                  "\n ALIMENTACIÓN: Es recomendable el consumo de alimentos que ayuden a fortalecer el sistema inmune y mejorar la recuperación, " +
                                                  "\n tales como: Naranjas, ricas en vitamina C, que ayuda a fortalecer el sistema inmunológico y reducir la duración de los     " +
                                                  "\n síntomas. Espinacas, con hierro, que contribuye a la producción de glóbulos rojos y mejora la oxigenación del cuerpo.      " +
                                                  "\n Yogur, con probióticos que favorecen la salud intestinal y fortalecen el sistema inmune. También se recomienda el consumo  " +
                                                  "\n de alimentos ricos en zinc para mejorar la respuesta inmune y acelerar la recuperación. Este es solo un diagnóstico        " +
                                                  "\n predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas " +
                                                  "\n sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar más de un diagnóstico y consultar  " +
                                                  "\n a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física de baja intensidad, evitando esfuerzos           " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperación. Actividades como caminatas suaves, juegos             " +
                                                  "\n tranquilos y ejercicios de respiración pueden ser beneficiosos para mantener el cuerpo activo sin comprometer           " +
                                                  "\n la recuperación. También se recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez         " +
                                                  "\n muscular causada por el reposo prolongado. HIDRATACIÓN: Es fundamental el consumo diario de 1.5 a 2 litros de           " +
                                                  "\n agua (seis a ocho vasos de tamaño regular) para prevenir la deshidratación causada por la diarrea y ayudar a la         " +
                                                  "\n recuperación del organismo. Además, se recomienda el consumo de sueros de rehidratación oral para reponer los           " +
                                                  "\n electrolitos perdidos. POSIBLE TRATAMIENTO: Para la shigelosis en adolescentes, el tratamiento suele incluir            " +
                                                  "\n antibióticos como la azitromicina o ciprofloxacino en casos graves, además de medidas de rehidratación oral para        " +
                                                  "\n evitar la deshidratación. También es importante mantener una higiene adecuada, lavarse las manos frecuentemente         " +
                                                  "\n y evitar el contacto con personas infectadas. En casos leves, el tratamiento puede centrarse en el manejo de los        " +
                                                  "\n síntomas con reposo, hidratación y una dieta adecuada. Se recomienda evitar el consumo de alimentos irritantes          " +
                                                  "\n como lácteos, frituras y comidas muy condimentadas, ya que pueden agravar la diarrea. ALIMENTACIÓN: Es recomendable     " +
                                                  "\n el consumo de alimentos que ayuden a la recuperación intestinal y fortalezcan el sistema inmune, tales como: Plátanos,  " +
                                                  "\n ricos en potasio, que ayudan a reponer electrolitos perdidos por la diarrea. Zanahorias, con vitamina A, que contribuye " +
                                                  "\n a la regeneración de la mucosa intestinal. Yogur, con probióticos que favorecen la salud intestinal y fortalecen el     " +
                                                  "\n sistema inmune. También se recomienda el consumo de caldos y sopas suaves para facilitar la digestión y evitar          " +
                                                  "\n irritaciones en el tracto intestinal. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no          " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad      " +
                                                  "\n en el tratamiento adecuado, se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes        " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física adaptada a su capacidad respiratoria, evitando        " +
                                                  "\n esfuerzos excesivos y asegurando una respiración controlada. Ejercicios como caminatas suaves, natación, yoga y técnicas     " +
                                                  "\n de respiración pueden mejorar la función pulmonar y reducir la fatiga. También se recomienda ejercicios de expansión         " +
                                                  "\n torácica y fortalecimiento de los músculos respiratorios para mejorar la capacidad pulmonar. Es importante realizar          " +
                                                  "\n calentamiento previo y enfriamiento posterior para evitar crisis respiratorias. HIDRATACIÓN: Es fundamental el consumo       " +
                                                  "\n diario de 1.7 a 2 litros de agua (siete a ocho vasos de tamaño regular) para mantener las vías respiratorias hidratadas      " +
                                                  "\n y facilitar la eliminación de secreciones. También se recomienda el consumo de infusiones con propiedades antiinflamatorias  " +
                                                  "\n como el té de jengibre o manzanilla. POSIBLE TRATAMIENTO: Para el EPOC en adolescentes, el tratamiento suele incluir         " +
                                                  "\n broncodilatadores como el salbutamol, corticosteroides inhalados como la fluticasona y, en casos graves, oxigenoterapia.     " +
                                                  "\n También es importante evitar la exposición a contaminantes ambientales y humo de tabaco. En algunos casos, se recomienda     " +
                                                  "\n la rehabilitación pulmonar, que incluye ejercicios específicos para mejorar la capacidad respiratoria y técnicas de manejo   " +
                                                  "\n de la enfermedad. En casos más severos, puede requerirse el uso de dispositivos de asistencia respiratoria como ventiladores " +
                                                  "\n portátiles o terapia con oxígeno domiciliario. ALIMENTACIÓN: Es recomendable el consumo de alimentos que ayuden a mejorar la " +
                                                  "\n función pulmonar y fortalezcan el sistema inmune, tales como: Pescados grasos (salmón, atún), ricos en ácidos grasos Omega-3," +
                                                  "\n que poseen propiedades antiinflamatorias que pueden ayudar a reducir la inflamación de las vías respiratorias. Frutas y      " +
                                                  "\n verduras de colores vivos (arándanos, fresas, espinacas, brócoli), ricas en antioxidantes como la vitamina C y carotenoides, " +
                                                  "\n que pueden proteger las células del daño y fortalecer el sistema inmunológico. Jengibre, contiene compuestos con efectos     " +
                                                  "\n antiinflamatorios que podrían ser beneficiosos para las vías respiratorias. Cúrcuma, con su componente activo, la curcumina, " +
                                                  "\n también tiene potentes propiedades antiinflamatorias y antioxidantes. También se recomienda el consumo de alimentos ricos en " +
                                                  "\n fibra para mejorar la digestión y evitar la inflamación intestinal. Este es solo un diagnóstico predeterminado lógico. Haberlo" +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor     " +
                                                  "\n seguridad en el tratamiento adecuado, se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia. " +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física moderada, evitando esfuerzos excesivos                " +
                                                  "\n y asegurando una recuperación adecuada. Ejercicios como caminatas suaves, estiramientos y yoga pueden ser                    " +
                                                  "\n beneficiosos para mantener el cuerpo activo sin comprometer el tratamiento. También se recomienda ejercicios de              " +
                                                  "\n relajación y respiración profunda para reducir el estrés y mejorar la respuesta inmune. HIDRATACIÓN: Es fundamental          " +
                                                  "\n el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tamaño regular) para ayudar a eliminar toxinas y           " +
                                                  "\n mantener el organismo en equilibrio. También se recomienda el consumo de jugos naturales ricos en antioxidantes para         " + 
                                                  "\n fortalecer el sistema inmune. POSIBLE TRATAMIENTO: Para la clamidia en adolescentes, el tratamiento suele incluir            " +
                                                  "\n antibióticos como la azitromicina o doxiciclina, administrados bajo supervisión médica. También es importante evitar         " +
                                                  "\n el contacto con personas infectadas y mantener una higiene adecuada. En algunos casos, se recomienda el uso de probióticos   " +
                                                  "\n para ayudar a restaurar la flora vaginal y prevenir infecciones recurrentes. En situaciones más severas, si la infección     " +
                                                  "\n no responde al tratamiento inicial, puede requerirse un ajuste en la medicación o una evaluación más detallada por un        " +
                                                  "\n especialista. ALIMENTACIÓN: Es recomendable el consumo de alimentos que ayuden a fortalecer el sistema inmune y mejorar la   " +
                                                  "\n recuperación, tales como: Naranjas, ricas en vitamina C, que ayuda a fortalecer el sistema inmunológico y reducir la duración" +
                                                  "\n de los síntomas. Espinacas, con hierro, que contribuye a la producción de glóbulos rojos y mejora la oxigenación del cuerpo. " +
                                                  "\n Yogur, con probióticos que favorecen la salud intestinal y fortalecen el sistema inmune. También se recomienda el consumo de " +
                                                  "\n alimentos ricos en zinc para mejorar la respuesta inmune y acelerar la recuperación. Este es solo un diagnóstico             " +
                                                  "\n predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas   " +
                                                  "\n sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar más de un diagnóstico y consultar    " +
                                                  "\n a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para        " +
                                                  "\n mantener la hidratación y ayudar a reducir la fiebre y los síntomas neurológicos, lo que es fundamental en el            " +
                                                  "\n proceso de recuperación. La meningitis bacteriana puede provocar fiebre alta, vómitos, rigidez en el cuello y            " +
                                                  "\n sensibilidad a la luz, lo que puede llevar a una mayor pérdida de líquidos. Es importante que el paciente consuma        " +
                                                  "\n líquidos ricos en electrolitos, como sueros orales, caldos y jugos naturales sin azúcar, para evitar la deshidratación   " +
                                                  "\n y mantener el equilibrio de minerales esenciales. También se recomienda el consumo de infusiones suaves, como            " +
                                                  "\n manzanilla o jengibre, que pueden ayudar a aliviar las náuseas y mejorar la digestión. EJERCICIO: La actividad           " +
                                                  "\n física debe ser muy ligera y supervisada, evitando esfuerzos excesivos que puedan agravar los síntomas, ejercicios       " +
                                                  "\n de respiración profunda y movilidad suave pueden ser beneficiosos para mejorar la capacidad pulmonar y la circulación.   " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento estándar para la meningitis bacteriana en adolescentes incluye antibióticos como     " +
                                                  "\n ceftriaxona, ampicilina y vancomicina, administrados por vía intravenosa durante 7 a 14 días, en México algunas          " +
                                                  "\n marcas reconocidas incluyen Rocephin (ceftriaxona) y Amikin (amikacina), además se recomienda el uso de corticosteroides " +
                                                  "\n como dexametasona para reducir la inflamación cerebral en casos graves. ALIMENTACIÓN: Para fortalecer el sistema         " +
                                                  "\n inmunológico y apoyar la recuperación, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y        " +
                                                  "\n proteínas. Naranjas y fresas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa         " +
                                                  "\n hasta el 100% de la ingesta diaria recomendada, fortaleciendo el sistema inmunológico y ayudando a reducir la inflamación." +
                                                  "\n Espinacas y lentejas: Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25% y 40% de la ingesta     " +
                                                  "\n diaria recomendada, lo que ayuda a mejorar la oxigenación celular y reducir el cansancio. Carnes magras y huevos: Son     " +
                                                  "\n una fuente importante de proteínas, proporcionando entre 20 y 25 g por cada 100 g, lo que equivale al 40-50% de la        " +
                                                  "\n recomendación diaria, esenciales para la regeneración celular y el fortalecimiento muscular. Este es solo un diagnóstico  " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas" +
                                                  "\n sean completamente correctas, para mayor seguridad se recomienda realizar más de un diagnóstico y consultar a un médico.  " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tamaño regular) para mantener        " +
                                                  "\n la hidratación y ayudar a reducir los efectos secundarios del tratamiento, lo que es fundamental en el proceso de               " +
                                                  "\n recuperación. Los adolescentes con cáncer pueden experimentar vómitos, diarrea y sudoración excesiva, lo que aumenta el         " +
                                                  "\n riesgo de deshidratación. Es esencial consumir líquidos ricos en electrolitos, como sueros orales y caldos, para reponer        " +
                                                  "\n los minerales perdidos. También se recomienda el consumo de agua con limón o infusiones suaves, que pueden ayudar a aliviar     " +
                                                  "\n las náuseas y mejorar la digestión. EJERCICIO: La actividad física debe ser moderada y adaptada, evitando esfuerzos excesivos   " +
                                                  "\n que puedan debilitar el sistema inmunológico, ejercicios como yoga, caminatas suaves y natación pueden ser beneficiosos         " +
                                                  "\n para mejorar la resistencia y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento para el cáncer en adolescentes             " +
                                                  "\n depende del tipo específico de cáncer, pero puede incluir quimioterapia, radioterapia y cirugía, en México algunas marcas       " +
                                                  "\n reconocidas incluyen Methotrexate (metotrexato) y Vincristine (vincristina), además se recomienda el uso de terapias            " +
                                                  "\n complementarias como apoyo nutricional y psicológico para mejorar la calidad de vida del paciente. ALIMENTACIÓN: Para           " +
                                                  "\n fortalecer el sistema inmunológico y apoyar la recuperación, se recomienda el consumo de alimentos ricos en antioxidantes,      " +
                                                  "\n proteínas y ácidos grasos esenciales. Brócoli y zanahorias: Contienen aproximadamente 50-80 mg de vitamina C por cada 100 g,    " +
                                                  "\n lo que representa hasta el 90% de la ingesta diaria recomendada, fortaleciendo el sistema inmunológico. Salmón y chía:          " +
                                                  "\n Son fuentes de omega-3, proporcionando entre 2-4 g por cada 100 g, lo que ayuda a reducir la inflamación y mejorar la           " +
                                                  "\n función celular. Frutas y verduras de colores vivos: Como arándanos y espinacas, que son ricas en antioxidantes y ayudan        " +
                                                  "\n a proteger las células del daño. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%     " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se recomienda    " +
                                                  "\n realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        
                        if(EstaturaFemenino.equals("1.40-1.65 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n Para una mujer adolescente con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidratación      " +
                                                  "\n óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda     " +
                                                  "\n actividad física ligera como caminatas suaves, estiramientos y ejercicios de respiración profunda durante 20 a 30 minutos   " +
                                                  "\n al día. Esto ayuda a mejorar la oxigenación, reducir la congestión y mantener el sistema inmunológico activo sin agotar     " +
                                                  "\n al cuerpo. HIDRATACIÓN. Es esencial consumir entre 2 y 2.5 litros de agua al día para mantener las mucosas hidratadas,      " +
                                                  "\n compensar la pérdida de líquidos por fiebre y facilitar la eliminación de toxinas. También se recomiendan infusiones        " +
                                                  "\n tibias de jengibre o manzanilla, caldos naturales y jugos cítricos sin azúcar añadida, ya que aportan vitamina C y ayudan   " +
                                                  "\n a aliviar la irritación de garganta. La hidratación adecuada también mejora la respuesta del sistema inmunológico y reduce  " +
                                                  "\n la duración de los síntomas. POSIBLE TRATAMIENTO. El tratamiento incluye antivirales como oseltamivir (Tamiflu),            " +
                                                  "\n especialmente si se administra en las primeras 48 horas desde el inicio de los síntomas. También se utilizan antipiréticos  " +
                                                  "\n como paracetamol para controlar la fiebre y el malestar general. En casos leves, el manejo puede ser ambulatorio con        " +
                                                  "\n reposo, hidratación y control de síntomas. En adolescentes con factores de riesgo o síntomas severos, se recomienda         " +
                                                  "\n vigilancia médica estrecha. ALIMENTACIÓN RECOMENDADA. Se sugiere una dieta rica en vitamina C, zinc y antioxidantes.        " +
                                                  "\n Frutas cítricas como naranja y kiwi, verduras como espinaca y brócoli, y alimentos ricos en vitamina E como nueces y        " +
                                                  "\n almendras ayudan a fortalecer el sistema inmune. Este diagnóstico es una referencia lógica basada en información médica,    " +
                                                  "\n pero no garantiza al 100% que el paciente tenga influenza ni que el tratamiento sea el adecuado. Se recomienda realizar     " +
                                                  "\n más de un diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida)    " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n Para una mujer adolescente con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una        " +
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales.        " +
                                                  "\n EJERCICIO. Durante la fase aguda se recomienda reposo. Posteriormente, se pueden incorporar caminatas suaves,     " +
                                                  "\n ejercicios de respiración profunda y estiramientos para mejorar la capacidad pulmonar y prevenir la rigidez       " +
                                                  "\n muscular. HIDRATACIÓN. Se aconseja consumir entre 2.5 y 3 litros de agua al día para mantener las vías            " +
                                                  "\n respiratorias hidratadas y facilitar la eliminación de secreciones. También se recomiendan caldos naturales,      " +
                                                  "\n infusiones tibias y jugos ricos en vitamina C. Una hidratación adecuada ayuda a fluidificar el moco, mejora       " +
                                                  "\n la oxigenación y favorece la recuperación pulmonar. POSIBLE TRATAMIENTO. El tratamiento incluye antibióticos      " +
                                                  "\n como amoxicilina o macrólidos (azitromicina) en caso de neumonía atípica. En adolescentes sanas, la mayoría       " +
                                                  "\n de los casos pueden tratarse de forma ambulatoria. En casos más graves o con comorbilidades, puede requerirse     " +
                                                  "\n hospitalización. El tratamiento debe iniciarse lo antes posible para evitar complicaciones como derrame pleural   " +
                                                  "\n o insuficiencia respiratoria. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica en proteínas, vitamina C y   " +
                                                  "\n antioxidantes. Alimentos clave incluyen carnes magras, pescado, frutas cítricas, verduras de hoja verde y frutos  " +
                                                  "\n secos. Este diagnóstico es una referencia lógica basada en información médica, pero no garantiza al 100% que el   " +
                                                  "\n paciente tenga neumonía ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y     " +
                                                  "\n consultar a un médico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que     " +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n Para una mujer adolescente con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una         " +
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales.         " +
                                                  "\n EJERCICIO. Se recomienda al menos 60 minutos diarios de actividad física moderada a vigorosa, incluyendo           " +
                                                  "\n ejercicios aeróbicos, de fuerza y de flexibilidad. Esto mejora la sensibilidad a la insulina, regula la            " +
                                                  "\n glucosa y reduce el riesgo cardiovascular. HIDRATACIÓN. Es crucial consumir entre 2 y 2.5 litros de agua al        " +
                                                  "\n día, especialmente si hay niveles elevados de glucosa, para prevenir la deshidratación. La hiperglucemia puede     " +
                                                  "\n causar micción frecuente, lo que incrementa la pérdida de líquidos. Se deben evitar bebidas azucaradas y optar     " +
                                                  "\n por agua, infusiones sin azúcar o bebidas con electrolitos si hay pérdida de líquidos por vómito o diarrea.        " +
                                                  "\n POSIBLE TRATAMIENTO. El tratamiento puede incluir medicamentos orales como metformina o insulina, dependiendo      " +
                                                  "\n del tipo y severidad. Es fundamental el monitoreo regular de glucosa, el uso de dispositivos como glucómetros      " +
                                                  "\n o monitores continuos, y la educación continua en el manejo de la enfermedad. El tratamiento debe ser individualizado " +
                                                  "\n y supervisado por un equipo multidisciplinario. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta equilibrada    " +
                                                  "\n con carbohidratos complejos, proteínas magras, grasas saludables y fibra. Alimentos clave incluyen cereales      " +
                                                  "\n integrales, frutas con bajo índice glucémico, verduras, legumbres y frutos secos. Se debe evitar el exceso de    " +
                                                  "\n azúcares simples y grasas saturadas. Este diagnóstico es una referencia lógica basada en información médica,     " +
                                                  "\n pero no garantiza al 100% que el paciente tenga diabetes ni que el tratamiento sea el adecuado. Se recomienda    " +
                                                  "\n realizar más de un diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes agradece tu visita   " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para           " +
                                                  "\n mantener las vías respiratorias hidratadas y reducir la viscosidad de las secreciones, lo que facilita la respiración.      " +
                                                  "\n La deshidratación puede agravar los síntomas del asma, aumentando la irritación de las vías respiratorias y la              " +
                                                  "\n frecuencia de los episodios de tos. Es importante consumir líquidos ricos en electrolitos, como sueros orales y             " +
                                                  "\n caldos, para mantener el equilibrio de minerales esenciales. También se recomienda el consumo de infusiones suaves,         " +
                                                  "\n como manzanilla o jengibre, que pueden ayudar a reducir la inflamación y mejorar la función pulmonar. EJERCICIO:            " +
                                                  "\n La actividad física debe ser moderada y adaptada, evitando esfuerzos excesivos que puedan desencadenar crisis asmáticas,    " +
                                                  "\n ejercicios como natación, yoga y caminatas suaves pueden ser beneficiosos para mejorar la capacidad pulmonar y reducir      " +
                                                  "\n la inflamación. POSIBLE TRATAMIENTO: El tratamiento estándar para el asma en adolescentes incluye broncodilatadores         " +
                                                  "\n de alivio rápido como salbutamol, además de corticosteroides inhalados como fluticasona o budesonida, en México algunas     " +
                                                  "\n marcas reconocidas incluyen Ventolin (salbutamol) y Pulmicort (budesonida), en casos más severos pueden utilizarse          " +
                                                  "\n biológicos como omalizumab, bajo estricta supervisión médica. ALIMENTACIÓN: Para fortalecer el sistema respiratorio         " +
                                                  "\n y reducir la inflamación, se recomienda el consumo de alimentos ricos en omega-3, antioxidantes y vitamina C. Salmón        " +
                                                  "\n y chía: Contienen aproximadamente 2-4 g de omega-3 por cada 100 g, lo que ayuda a reducir la inflamación de las vías        " +
                                                  "\n respiratorias. Fresas y arándanos: Aportan 50-90 mg de vitamina C por cada 100 g, cubriendo hasta el 100% de la ingesta     " +
                                                  "\n diaria recomendada, fortaleciendo el sistema inmunológico. Jengibre y cúrcuma: Poseen propiedades antiinflamatorias y       " +
                                                  "\n antioxidantes, ayudando a reducir la irritación de las vías respiratorias. Este es solo un diagnóstico predeterminado       " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean            " +
                                                  "\n completamente correctas, para mayor seguridad se recomienda realizar más de un diagnóstico y consultar a un médico.         " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tamaño regular) para         " +
                                                  "\n mantener la hidratación y reducir la fatiga, lo que es fundamental en el proceso de recuperación. El VIH puede          " +
                                                  "\n provocar fiebre, sudoración nocturna y diarrea, lo que aumenta el riesgo de deshidratación. Es esencial consumir        " +
                                                  "\n líquidos ricos en electrolitos, como sueros orales y caldos, para reponer los minerales perdidos. También se            " +
                                                  "\n recomienda el consumo de agua con limón o infusiones suaves, que pueden ayudar a aliviar las náuseas y mejorar la       " +
                                                  "\n digestión. EJERCICIO: La actividad física debe ser moderada y adaptada, evitando esfuerzos excesivos que puedan         " +
                                                  "\n debilitar el sistema inmunológico, ejercicios como yoga, caminatas suaves y natación pueden ser beneficiosos para       " +
                                                  "\n mejorar la resistencia y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento para el VIH en adolescentes incluye     " +
                                                  "\n terapia antirretroviral (TAR) con medicamentos como tenofovir, emtricitabina y dolutegravir, en México algunas marcas   " +
                                                  "\n reconocidas incluyen Truvada (tenofovir/emtricitabina) y Tivicay (dolutegravir), además se recomienda el uso de         " +
                                                  "\n terapias complementarias como apoyo nutricional y psicológico para mejorar la calidad de vida del paciente. ALIMENTACIÓN:" +
                                                  "\n Para fortalecer el sistema inmunológico y apoyar la recuperación, se recomienda el consumo de alimentos ricos en         " +
                                                  "\n antioxidantes, proteínas y ácidos grasos esenciales. Brócoli y zanahorias: Contienen aproximadamente 50-80 mg de         " +
                                                  "\n vitamina C por cada 100 g, lo que representa hasta el 90% de la ingesta diaria recomendada, fortaleciendo el sistema     " +
                                                  "\n inmunológico. Salmón y chía: Son fuentes de omega-3, proporcionando entre 2-4 g por cada 100 g, lo que ayuda a reducir   " +
                                                  "\n la inflamación y mejorar la función celular. Frutas y verduras de colores vivos: Como arándanos y espinacas, que son ricas  " +
                                                  "\n en antioxidantes y ayudan a proteger las células del daño. Este es solo un diagnóstico predeterminado lógico, haberlo       " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas,   " +
                                                  "\n para mayor seguridad se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita" +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular)          " +
                                                  "\n para mantener la hidratación y ayudar a reducir la inflamación, lo que es fundamental en el proceso de                " +
                                                  "\n recuperación. La gonorrea puede provocar fiebre, dolor abdominal y secreción anormal, lo que aumenta el riesgo        " +
                                                  "\n de deshidratación. Es esencial consumir líquidos ricos en electrolitos, como sueros orales y caldos, para             " +
                                                  "\n reponer los minerales perdidos. También se recomienda el consumo de infusiones suaves, como manzanilla o jengibre,    " +
                                                  "\n que pueden ayudar a aliviar las molestias digestivas y mejorar la absorción de nutrientes. EJERCICIO: La actividad    " +
                                                  "\n física debe ser muy ligera y supervisada, evitando esfuerzos excesivos que puedan agravar los síntomas, ejercicios    " +
                                                  "\n de respiración profunda y movilidad suave pueden ser beneficiosos para mejorar la circulación y reducir la fatiga.    " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento estándar para la gonorrea en adolescentes incluye antibióticos como ceftriaxona   " +
                                                  "\n y azitromicina, administrados en una sola dosis, en México algunas marcas reconocidas incluyen Rocephin (ceftriaxona) " +
                                                  "\n y Zithromax (azitromicina), además se recomienda reposo absoluto y una dieta adecuada para mejorar la recuperación.   " +
                                                  "\n ALIMENTACIÓN: Para fortalecer el sistema inmunológico y apoyar la recuperación, se recomienda el consumo de alimentos " +
                                                  "\n ricos en vitamina C, antioxidantes y proteínas. Naranjas y fresas: Contienen aproximadamente 70-90 mg de vitamina C   " +
                                                  "\n por cada 100 g, lo que representa hasta el 100% de la ingesta diaria recomendada, fortaleciendo el sistema inmunológico  " +
                                                  "\n y ayudando a reducir la inflamación. Espinacas y lentejas: Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g,        " +
                                                  "\n cubriendo entre el 25% y 40% de la ingesta diaria recomendada, lo que ayuda a mejorar la oxigenación celular y         " +
                                                  "\n reducir el cansancio. Carnes magras y huevos: Son una fuente importante de proteínas, proporcionando entre 20 y        " +
                                                  "\n 25 g por cada 100 g, lo que equivale al 40-50% de la recomendación diaria, esenciales para la regeneración celular     " +
                                                  "\n y el fortalecimiento muscular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al   " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad    " +
                                                  "\n se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app       " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACIÓN: Mantener una hidratación adecuada es esencial para fortalecer el sistema inmunológico y reducir la         " +
                                                  "\n inflamación causada por el virus. Se recomienda el consumo diario de agua suficiente, además de infusiones de           " +
                                                  "\n manzanilla y jengibre, que poseen propiedades antiinflamatorias y pueden ayudar a aliviar el malestar. La hidratación   " +
                                                  "\n también contribuye a la regeneración celular y a la eliminación de toxinas, lo que puede ayudar a reducir la            " +
                                                  "\n frecuencia de los brotes. EJERCICIO: La actividad física debe ser moderada y enfocada en fortalecer el sistema          " +
                                                  "\n inmunológico. Se recomienda realizar ejercicios de bajo impacto, como yoga y caminatas suaves, que ayudan a reducir     " +
                                                  "\n el estrés, un factor que puede desencadenar brotes del virus. También es recomendable practicar ejercicios de           " +
                                                  "\n relajación, como la meditación y la respiración profunda, para mejorar la respuesta del cuerpo ante el virus.           " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para el herpes genital incluye antivirales como aciclovir y valaciclovir,           " +
                                                  "\n que ayudan a reducir la duración y gravedad de los síntomas. En casos recurrentes, se puede optar por terapia           " +
                                                  "\n supresiva, que consiste en el uso diario de antivirales para reducir la frecuencia de los brotes y la posibilidad       " +
                                                  "\n de transmisión. También se recomienda el uso de cremas tópicas con lidocaína, que pueden aliviar el dolor y la          " +
                                                  "\n irritación en las lesiones. En México, estos medicamentos están disponibles en instituciones de salud como el IMSS      " +
                                                  "\n y el Insabi. ALIMENTACIÓN: También es recomendable el consumo de alimentos que fortalezcan el sistema inmunológico      " +
                                                  "\n y ayuden a reducir la inflamación, tales como frutas cítricas, ricas en vitamina C, que fortalece el sistema inmunológico. " +
                                                  "\n Verduras de hoja verde, que contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos,        " +
                                                  "\n ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos, que aportan vitamina E, que ayuda a la regeneración  " +
                                                  "\n celular. Yogur natural, fuente de probióticos, que favorecen la salud intestinal y el sistema inmunológico. Este        " +
                                                  "\n es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta        " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico  " +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Además, por su salud, si la         " +
                                                  "\n respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L. Montes agradece       " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN: La hidratación es clave para ayudar al cuerpo a eliminar toxinas y fortalecer el sistema inmunológico.          " +
                                                  "\n Se recomienda el consumo diario de agua suficiente, además de infusiones de equinácea y jengibre, que pueden ayudar          " +
                                                  "\n a mejorar la respuesta inmunológica. La hidratación también contribuye a la circulación sanguínea, lo que es esencial        " +
                                                  "\n para la recuperación de los tejidos afectados por la enfermedad. EJERCICIO: La actividad física debe ser moderada y          " +
                                                  "\n enfocada en mejorar la circulación sanguínea. Se recomienda realizar ejercicios aeróbicos suaves, como caminatas y           " +
                                                  "\n bicicleta estática, que ayudan a mejorar la oxigenación celular y la recuperación del cuerpo. También es recomendable        " +
                                                  "\n practicar ejercicios de resistencia, como el entrenamiento con pesas ligeras, para fortalecer el sistema muscular y          " +
                                                  "\n mejorar la respuesta del cuerpo ante la infección. POSIBLE TRATAMIENTO: El tratamiento para la sífilis incluye penicilina    " +
                                                  "\n benzatina, que es el medicamento de primera línea. En casos de alergia a la penicilina, se pueden utilizar antibióticos      " +
                                                  "\n alternativos como doxiciclina o ceftriaxona. Es fundamental completar el tratamiento indicado por el médico para evitar      " +
                                                  "\n complicaciones graves como la sífilis terciaria, que puede afectar el sistema nervioso y cardiovascular. También se          " +
                                                  "\n recomienda realizar pruebas de seguimiento para confirmar la eliminación de la bacteria y evitar la transmisión a otras      " +
                                                  "\n personas. Además, en casos avanzados de la enfermedad, puede ser necesario monitoreo médico frecuente y tratamiento          " +
                                                  "\n adicional para controlar los efectos secundarios en órganos afectados. En México, estos medicamentos están disponibles       " +
                                                  "\n en instituciones de salud como el IMSS y el Insabi. ALIMENTACIÓN: También es recomendable el consumo de alimentos que        " +
                                                  "\n fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como frutas cítricas, ricas en vitamina C,      " +
                                                  "\n que fortalece el sistema inmunológico. Verduras de hoja verde, que contienen antioxidantes y hierro, esenciales para la      " +
                                                  "\n salud celular. Pescados grasos, ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos, que aportan vitamina E,   " +
                                                  "\n que ayuda a la regeneración celular. Yogur natural, fuente de probióticos, que favorecen la salud intestinal y el sistema    " +
                                                  "\n inmunológico. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente     " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un        " +
                                                  "\n Diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Además, por su salud,        " +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L. Montes agradece      " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACIÓN: La hidratación es fundamental para mantener la salud pulmonar y ayudar a eliminar toxinas del cuerpo.       " +
                                                  "\n Se recomienda el consumo diario de agua suficiente, además de infusiones de tomillo y eucalipto, que pueden ayudar       " +
                                                  "\n a mejorar la función respiratoria. La hidratación también contribuye a la eliminación de secreciones pulmonares,         " +
                                                  "\n lo que facilita la recuperación del paciente. EJERCICIO: La actividad física debe ser moderada y enfocada en             " +
                                                  "\n mejorar la capacidad pulmonar. Se recomienda realizar ejercicios de respiración profunda, como respiración               " +
                                                  "\n diafragmática y con labios fruncidos, que ayudan a mejorar la oxigenación. También es beneficioso practicar              " +
                                                  "\n caminatas suaves, evitando ambientes fríos o contaminados. POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis      " +
                                                  "\n incluye antibióticos como isoniazida, rifampicina y etambutol, que deben tomarse durante un período prolongado para      " +
                                                  "\n garantizar la eliminación de la bacteria. En casos de tuberculosis resistente a los medicamentos, se pueden utilizar     " +
                                                  "\n esquemas de tratamiento más prolongados con fármacos como bedaquilina y linezolid. Es fundamental seguir                 " +
                                                  "\n estrictamente el tratamiento para evitar recaídas y la propagación de la enfermedad. También se recomienda               " +
                                                  "\n realizar pruebas de seguimiento para confirmar la eliminación de la bacteria y evitar la transmisión a otras             " +
                                                  "\n personas. En casos severos, el tratamiento puede extenderse por varios meses, incluyendo monitoreo médico                " +
                                                  "\n frecuente y posibles ajustes en la medicación según la evolución del paciente. En México, estos medicamentos             " +
                                                  "\n están disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACIÓN: También es recomendable              " +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como            " +
                                                  "\n frutas cítricas, ricas en vitamina C, que fortalece el sistema inmunológico. Verduras de hoja verde, que                 " +
                                                  "\n contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos, ricos en Omega-3, con               " +
                                                  "\n propiedades antiinflamatorias. Frutos secos, que aportan vitamina E, que ayuda a la regeneración celular.                " +
                                                  "\n Yogur natural, fuente de probióticos, que favorecen la salud intestinal y el sistema inmunológico. Este es               " +
                                                  "\n solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta            " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un               " +
                                                  "\n Diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Además, por              " +
                                                  "\n su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel           " +
                                                  "\n L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física moderada y adaptada a su condición,          " +
                                                  "\n evitando ejercicios de alto impacto que puedan afectar sus articulaciones. Se sugiere ejercicios de bajo            " +
                                                  "\n impacto como natación, yoga o caminatas suaves, que ayudan a mejorar la movilidad sin generar estrés en las         " +
                                                  "\n articulaciones. HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua al día para mantener         " +
                                                  "\n una adecuada hidratación y ayudar a reducir la inflamación en las articulaciones. También es beneficioso el         " +
                                                  "\n consumo de infusiones de cúrcuma y jengibre, que poseen propiedades antiinflamatorias naturales. Además, el         " +
                                                  "\n consumo de agua con limón puede ser útil debido a su contenido de vitamina C, que contribuye a la producción        " +
                                                  "\n de colágeno y la salud articular. POSIBLE TRATAMIENTO: Para la artritis juvenil, el tratamiento suele incluir       " +
                                                  "\n antiinflamatorios no esteroides (AINEs) como ibuprofeno o naproxeno, además de fármacos modificadores de la         " +
                                                  "\n enfermedad como metotrexato en casos más severos. También pueden utilizarse terapias biológicas bajo supervisión    " +
                                                  "\n médica. La fisioterapia es clave para mejorar la movilidad y reducir el dolor, y en algunos casos se recomienda     " +
                                                  "\n el uso de suplementos de colágeno y glucosamina para fortalecer las articulaciones. ALIMENTACIÓN: Se recomienda     " +
                                                  "\n el consumo de alimentos que ayuden a reducir la inflamación y fortalecer las articulaciones, tales como Pescados    " +
                                                  "\n grasos (salmón, atún): ricos en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias. Frutas y verduras  " +
                                                  "\n de colores vivos (arándanos, fresas, espinacas, brócoli): ricas en antioxidantes como la vitamina C y carotenoides, " +
                                                  "\n que pueden proteger las células del daño y fortalecer el sistema inmunológico. Jengibre: contiene compuestos con    " +
                                                  "\n efectos antiinflamatorios que podrían ser beneficiosos para las articulaciones. Cúrcuma: con su componente activo,  " +
                                                  "\n la curcumina, también tiene potentes propiedades antiinflamatorias y antioxidantes. Semillas de chía y linaza:      " +
                                                  "\n ricas en Omega-3 y fibra, que ayudan a reducir la inflamación. Este es solo un diagnóstico predeterminado lógico.   " +
                                                  "\n Haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean            " +
                                                  "\n completamente correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento        " +
                                                  "\n adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda             " +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física ligera, evitando esfuerzos excesivos que        " +
                                                  "\n puedan agravar la tos y la dificultad respiratoria. Se sugiere ejercicios de respiración, caminatas suaves y           " +
                                                  "\n estiramientos para mejorar la capacidad pulmonar. HIDRATACIÓN: Debido a la tos persistente y la posible deshidratación " +
                                                  "\n causada por la tosferina, se recomienda el consumo diario de 2.5 a 3 litros de agua al día. También es beneficioso     " +
                                                  "\n el consumo de infusiones de miel y jengibre, que pueden ayudar a calmar la garganta y reducir la inflamación.          " +
                                                  "\n Se recomienda el uso de bebidas tibias, como caldos y tés de hierbas, para aliviar la irritación de la garganta.       " +
                                                  "\n POSIBLE TRATAMIENTO: Para la tosferina en adolescentes, el tratamiento suele incluir antibióticos como azitromicina,   " +
                                                  "\n claritromicina o eritromicina, administrados bajo supervisión médica. También se recomienda el uso de humidificadores  " +
                                                  "\n para aliviar la irritación de las vías respiratorias. En casos graves, puede requerirse hospitalización con            " +
                                                  "\n administración de oxígeno y líquidos intravenosos para prevenir la deshidratación. ALIMENTACIÓN: Se recomienda         " +
                                                  "\n el consumo de alimentos que ayuden a fortalecer el sistema respiratorio y aliviar los síntomas, tales como Miel:       " +
                                                  "\n ayuda a calmar la garganta y tiene propiedades antimicrobianas. Jengibre: con propiedades antiinflamatorias que        " +
                                                  "\n pueden aliviar la tos y mejorar la respuesta inmune. Frutas cítricas (naranjas, limones, toronjas): ricas en           " +
                                                  "\n vitamina C, que ayuda a mejorar la respuesta inmunológica. Caldo de pollo: fuente de electrolitos y nutrientes         " +
                                                  "\n esenciales para la recuperación. Ajo: contiene alicina, un compuesto con propiedades antimicrobianas que pueden        " +
                                                  "\n ayudar a combatir infecciones. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza      " +
                                                  "\n al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda        " +
                                                  "\n realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta  " +
                                                  "\n del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita       " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física ligera, evitando esfuerzos excesivos que       " +
                                                  "\n puedan agravar la inflamación de las glándulas salivales. Se sugiere ejercicios de relajación y estiramientos         " +
                                                  "\n suaves. HIDRATACIÓN: Debido a la fiebre y la inflamación de las glándulas salivales, se recomienda el consumo         " +
                                                  "\n diario de 2.5 a 3 litros de agua al día. También es beneficioso el consumo de infusiones de manzanilla, que pueden    " +
                                                  "\n ayudar a reducir la inflamación, y agua de coco, que aporta electrolitos esenciales. Se recomienda evitar bebidas     " + 
                                                  "\n ácidas como jugo de limón o naranja, ya que pueden irritar aún más las glándulas salivales. POSIBLE TRATAMIENTO:      " +
                                                  "\n Para las paperas en adolescentes, no existe un tratamiento específico, ya que es una enfermedad viral autolimitada.   " +
                                                  "\n Se recomienda reposo, hidratación y control de fiebre con paracetamol (Tempra) o ibuprofeno. En casos graves,         " +
                                                  "\n puede requerirse hospitalización con administración de líquidos intravenosos. Se recomienda aplicar compresas         " +
                                                  "\n frías en la zona inflamada para aliviar el dolor y la hinchazón. ALIMENTACIÓN: Se recomienda el consumo de            " +
                                                  "\n alimentos que ayuden a reducir la inflamación y fortalecer el sistema inmune, tales como Frutas cítricas (naranjas,   " +
                                                  "\n limones, toronjas): ricas en vitamina C, que ayuda a mejorar la respuesta inmunológica. Papaya: contiene vitamina C   " +
                                                  "\n y flavonoides que pueden ayudar a reducir la inflamación. Jengibre: con propiedades antiinflamatorias que pueden      " +
                                                  "\n aliviar la fatiga y mejorar la respuesta inmune. Miel: ayuda a calmar la garganta y tiene propiedades antimicrobianas." +
                                                  "\n Caldo de vegetales: fuente de electrolitos y nutrientes esenciales para la recuperación. Yogur natural: fuente de     " +
                                                  "\n probióticos que ayudan a restaurar la flora intestinal y fortalecer el sistema inmune. Este es solo un diagnóstico    " +
                                                  "\n predeterminado lógico. Haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las       " +
                                                  "\n respuestas sean completamente correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el      " +
                                                  "\n tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda   " +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACIÓN: Mantener una hidratación adecuada es esencial para aliviar los síntomas del virus del Zika. Se        " +
                                                  "\n recomienda el consumo diario de agua suficiente, además de infusiones de manzanilla y jengibre, que poseen         " +
                                                  "\n propiedades antiinflamatorias y pueden ayudar a reducir el malestar. EJERCICIO: Durante la enfermedad, se          " +
                                                  "\n recomienda reposo absoluto para evitar el desgaste energético y permitir que el cuerpo se recupere. Una vez        " +
                                                  "\n que los síntomas comienzan a mejorar, es recomendable realizar ejercicios de movilidad suave, como estiramientos   " +
                                                  "\n ligeros y caminatas cortas, para estimular la circulación y evitar la fatiga muscular causada por el reposo        " +
                                                  "\n prolongado. POSIBLE TRATAMIENTO: No existe un tratamiento específico para el Zika, pero se recomienda reposo,      " +
                                                  "\n analgésicos como paracetamol, y ingesta abundante de líquidos para aliviar los síntomas. También se pueden         " +
                                                  "\n administrar antihistamínicos para controlar el prurito asociado con el exantema. En México, estos medicamentos     " +
                                                  "\n están disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACIÓN: También es recomendable el     " +
                                                  "\n consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como frutas  " +
                                                  "\n cítricas, ricas en vitamina C, que fortalece el sistema inmunológico. Verduras de hoja verde, que contienen        " +
                                                  "\n antioxidantes y hierro, esenciales para la salud celular. Pescados grasos, ricos en Omega-3, con propiedades       " +
                                                  "\n antiinflamatorias. Frutos secos, que aportan vitamina E, que ayuda a la regeneración celular. Yogur natural,       " +
                                                  "\n fuente de probióticos, que favorecen la salud intestinal y el sistema inmunológico. Este es solo un diagnóstico    " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las    " +
                                                  "\n respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para   " +
                                                  "\n establecer mayor seguridad en el tratamiento adecuado del paciente. Además, por su salud, si la respuesta del      " +
                                                  "\n diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L. Montes agradece tu visita      " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACIÓN: La hidratación es clave para combatir la deshidratación causada por la diarrea intensa, uno de         " +
                                                  "\n los síntomas principales del rotavirus. Se recomienda el consumo diario de agua suficiente para reponer los         " +
                                                  "\n líquidos perdidos y evitar complicaciones como el desequilibrio electrolítico. Además, es recomendable el uso       " +
                                                  "\n de soluciones de rehidratación oral para recuperar los minerales esenciales. EJERCICIO: Durante la fase aguda       " +
                                                  "\n de la enfermedad, se recomienda reposo absoluto para evitar el desgaste energético y permitir que el cuerpo se      " +
                                                  "\n recupere. Una vez que los síntomas comienzan a mejorar, es recomendable realizar ejercicios de movilidad suave,     " +
                                                  "\n como estiramientos ligeros y caminatas cortas, para estimular la circulación y evitar la fatiga muscular causada    " +
                                                  "\n por el reposo prolongado. POSIBLE TRATAMIENTO: No existe un tratamiento específico para el rotavirus, pero se       " +
                                                  "\n recomienda rehidratación constante, reposo, y en casos graves, hospitalización para administración intravenosa      " +
                                                  "\n de líquidos. En México, estos medicamentos están disponibles en instituciones de salud como el IMSS y el Insabi.    " +
                                                  "\n ALIMENTACIÓN: También es recomendable el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a    " +
                                                  "\n la recuperación intestinal, tales como plátanos, ricos en potasio, que ayudan a reponer electrolitos. Arroz blanco, " +
                                                  "\n fuente de carbohidratos de fácil digestión, que contribuyen a la recuperación intestinal. Manzanas, ricas en pectina,  " +
                                                  "\n que ayudan a regular la digestión y reducir la diarrea. Zanahorias, con vitamina A, que favorece la regeneración       " +
                                                  "\n celular. Yogur natural, fuente de probióticos, que favorecen la salud intestinal y el sistema inmunológico. Este       " +
                                                  "\n es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta       " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico " +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Además, por su salud, si la    " +
                                                  "\n respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L. Montes agradece  " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACIÓN: La hidratación es fundamental para combatir la fiebre y los síntomas gastrointestinales causados        " +
                                                  "\n por la listeriosis. Se recomienda el consumo diario de agua suficiente, además de infusiones de manzanilla y         " +
                                                  "\n jengibre, que poseen propiedades antiinflamatorias y pueden ayudar a aliviar el malestar. EJERCICIO: Durante         " + 
                                                  "\n la enfermedad, se recomienda reposo absoluto para evitar el desgaste energético y permitir que el cuerpo se          " +
                                                  "\n recupere. Una vez que los síntomas comienzan a mejorar, es recomendable realizar ejercicios de movilidad suave,      " +
                                                  "\n como estiramientos ligeros y caminatas cortas, para estimular la circulación y evitar la fatiga muscular causada     " +
                                                  "\n por el reposo prolongado. POSIBLE TRATAMIENTO: El tratamiento para la listeriosis incluye antibióticos como          " +
                                                  "\n ampicilina y gentamicina, dependiendo de la gravedad del caso. En casos severos, se puede requerir hospitalización   " +
                                                  "\n y administración intravenosa de antibióticos. En México, estos medicamentos están disponibles en instituciones de    " +
                                                  "\n salud como el IMSS y el Insabi. ALIMENTACIÓN: También es recomendable el consumo de alimentos que fortalezcan el     " +
                                                  "\n sistema inmunológico y ayuden a reducir la inflamación, tales como frutas cítricas, ricas en vitamina C, que fortalece  " +
                                                  "\n el sistema inmunológico. Verduras de hoja verde, que contienen antioxidantes y hierro, esenciales para la salud         " +
                                                  "\n celular. Pescados grasos, ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos, que aportan vitamina E,    " +
                                                  "\n que ayuda a la regeneración celular. Yogur natural, fuente de probióticos, que favorecen la salud intestinal y el       " +
                                                  "\n sistema inmunológico. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que    " +
                                                  "\n el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar " +
                                                  "\n más de un Diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Además, por   " +
                                                  "\n su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L.       " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física de baja intensidad, evitando esfuerzos       " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperación. Actividades como caminatas suaves, juegos         " +
                                                  "\n tranquilos y ejercicios de respiración pueden ser beneficiosos para mantener el cuerpo activo sin comprometer       " +
                                                  "\n la recuperación. También se recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez     " +
                                                  "\n muscular causada por el reposo prolongado. HIDRATACIÓN: Es fundamental el consumo diario de 1.5 a 2 litros de       " +
                                                  "\n agua para prevenir la deshidratación causada por la diarrea y ayudar a la recuperación del organismo. Además,       " +
                                                  "\n se recomienda el consumo de sueros de rehidratación oral para reponer los electrolitos perdidos. Se debe evitar     " +
                                                  "\n el consumo de bebidas con cafeína o azucaradas, ya que pueden afectar la recuperación. POSIBLE TRATAMIENTO: Para    " +
                                                  "\n la shigelosis en adolescentes, el tratamiento suele incluir antibióticos como la azitromicina o ciprofloxacino      " +
                                                  "\n en casos graves, además de medidas de rehidratación oral para evitar la deshidratación. También es importante       " +
                                                  "\n mantener una higiene adecuada, lavarse las manos frecuentemente y evitar el contacto con personas infectadas.       " +
                                                  "\n En casos leves, el tratamiento puede centrarse en el manejo de los síntomas con reposo, hidratación y una dieta     " +
                                                  "\n adecuada. Se recomienda evitar el consumo de alimentos irritantes como lácteos, frituras y comidas muy condimentadas, " +
                                                  "\n ya que pueden agravar la diarrea. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a la recuperación    " +
                                                  "\n intestinal y fortalezcan el sistema inmune, tales como plátanos ricos en potasio que ayudan a reponer electrolitos    " +
                                                  "\n perdidos por la diarrea, zanahorias con vitamina A que contribuyen a la regeneración de la mucosa intestinal, yogur   " +
                                                  "\n con probióticos que favorecen la salud intestinal y fortalecen el sistema inmune, además de caldos y sopas suaves     " +
                                                  "\n para facilitar la digestión y evitar irritaciones en el tracto intestinal. También se recomienda el consumo de arroz  " +
                                                  "\n y manzana para ayudar a regular el tránsito intestinal. Este es solo un diagnóstico predeterminado lógico. Haberlo    " +
                                                  "\n consultado no garantiza al cien por ciento que la paciente tenga esta enfermedad ni que las respuestas sean      " +
                                                  "\n completamente correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento     " +
                                                  "\n adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar" +
                                                  "\n a su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física adaptada a su capacidad respiratoria, evitando     " +
                                                  "\n esfuerzos excesivos y asegurando una respiración controlada. Ejercicios como caminatas suaves, natación, yoga y técnicas  " +
                                                  "\n de respiración pueden mejorar la función pulmonar y reducir la fatiga. También se recomienda ejercicios de expansión      " +
                                                  "\n torácica y fortalecimiento de los músculos respiratorios para mejorar la capacidad pulmonar. Es importante realizar       " +
                                                  "\n calentamiento previo y enfriamiento posterior para evitar crisis respiratorias. HIDRATACIÓN: Es fundamental el consumo    " +
                                                  "\n diario de 1.7 a 2 litros de agua para mantener las vías respiratorias hidratadas y facilitar la eliminación de secreciones. " +
                                                  "\n También se recomienda el consumo de infusiones con propiedades antiinflamatorias como el té de jengibre o manzanilla.       " +
                                                  "\n Se debe evitar el consumo de bebidas frías o con gas, ya que pueden irritar las vías respiratorias. POSIBLE TRATAMIENTO:    " +
                                                  "\n Para el EPOC en adolescentes, el tratamiento suele incluir broncodilatadores como el salbutamol, corticosteroides inhalados " +
                                                  "\n como la fluticasona y, en casos graves, oxigenoterapia. También es importante evitar la exposición a contaminantes      " +
                                                  "\n ambientales y humo de tabaco. En algunos casos, se recomienda la rehabilitación pulmonar, que incluye ejercicios        " +
                                                  "\n específicos para mejorar la capacidad respiratoria y técnicas de manejo de la enfermedad. En casos más severos, puede   " +
                                                  "\n requerirse el uso de dispositivos de asistencia respiratoria como ventiladores portátiles o terapia con oxígeno         " +
                                                  "\n domiciliario. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a mejorar la función pulmonar y fortalezcan" +
                                                  "\n el sistema inmune, tales como pescados grasos como el salmón y el atún, ricos en ácidos grasos Omega-3 que poseen       " +
                                                  "\n propiedades antiinflamatorias que pueden ayudar a reducir la inflamación de las vías respiratorias, frutas y verduras   " +
                                                  "\n de colores vivos como arándanos, fresas, espinacas y brócoli, ricas en antioxidantes como la vitamina C y carotenoides  " +
                                                  "\n que pueden proteger las células del daño y fortalecer el sistema inmunológico, jengibre que contiene compuestos con     " +
                                                  "\n efectos antiinflamatorios que podrían ser beneficiosos para las vías respiratorias, cúrcuma con su componente activo    " +
                                                  "\n la curcumina que tiene potentes propiedades antiinflamatorias y antioxidantes, además de alimentos ricos en fibra para  " +
                                                  "\n mejorar la digestión y evitar la inflamación intestinal. Este es solo un diagnóstico predeterminado lógico. Haberlo     " +
                                                  "\n consultado no garantiza al cien por ciento que la paciente tenga esta enfermedad ni que las respuestas sean completamente " +
                                                  "\n correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su   " +
                                                  "\n salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes      " +
                                                  "\n agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física moderada, evitando esfuerzos excesivos y asegurando    " +
                                                  "\n una recuperación adecuada. Ejercicios como caminatas suaves, estiramientos y yoga pueden ser beneficiosos para mantener el    " +
                                                  "\n cuerpo activo sin comprometer el tratamiento. También se recomienda ejercicios de relajación y respiración profunda para      " +
                                                  "\n reducir el estrés y mejorar la respuesta inmune. HIDRATACIÓN: Es fundamental el consumo diario de 1.5 a 2 litros de agua      " +
                                                  "\n para ayudar a eliminar toxinas y mantener el organismo en equilibrio. También se recomienda el consumo de jugos naturales     " +
                                                  "\n ricos en antioxidantes para fortalecer el sistema inmune. Se debe evitar el consumo de bebidas alcohólicas y azucaradas,      " +
                                                  "\n ya que pueden afectar la recuperación. POSIBLE TRATAMIENTO: Para la clamidia en adolescentes, el tratamiento suele incluir    " +
                                                  "\n antibióticos como la azitromicina o doxiciclina, administrados bajo supervisión médica. También es importante evitar el       " +
                                                  "\n contacto con personas infectadas y mantener una higiene adecuada. En algunos casos, se recomienda el uso de probióticos       " +
                                                  "\n para ayudar a restaurar la flora vaginal y prevenir infecciones recurrentes. En situaciones más severas, si la infección      " +
                                                  "\n no responde al tratamiento inicial, puede requerirse un ajuste en la medicación o una evaluación más detallada por un         " +
                                                  "\n especialista. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmune y mejorar la      " +
                                                  "\n recuperación, tales como naranjas ricas en vitamina C, que ayuda a fortalecer el sistema inmunológico y reducir la duración   " +
                                                  "\n de los síntomas, espinacas con hierro que contribuyen a la producción de glóbulos rojos y mejora la oxigenación del cuerpo,   " +
                                                  "\n yogur con probióticos que favorecen la salud intestinal y fortalecen el sistema inmune, además de alimentos ricos en zinc     " +
                                                  "\n para mejorar la respuesta inmune y acelerar la recuperación. También se recomienda el consumo de ajo y cebolla por sus        " +
                                                  "\n propiedades antimicrobianas. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al cien       " +
                                                  "\n por ciento que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar   " +
                                                  "\n más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico  " +
                                                  "\n no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera    " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular)           " +
                                                  "\n para mantener la hidratación y ayudar a reducir la fiebre y los síntomas neurológicos, lo que es fundamental           " +
                                                  "\n en el proceso de recuperación. La meningitis bacteriana puede provocar fiebre alta, vómitos, rigidez en el             " +
                                                  "\n cuello y sensibilidad a la luz, lo que puede llevar a una mayor pérdida de líquidos. Es importante que el              " +
                                                  "\n paciente consuma líquidos ricos en electrolitos, como sueros orales, caldos y jugos naturales sin azúcar,              " +
                                                  "\n para evitar la deshidratación y mantener el equilibrio de minerales esenciales. También se recomienda el               " +
                                                  "\n consumo de infusiones suaves, como manzanilla o jengibre, que pueden ayudar a aliviar las náuseas y mejorar            " +
                                                  "\n la digestión. EJERCICIO: La actividad física debe ser muy ligera y supervisada, evitando esfuerzos excesivos           " +
                                                  "\n que puedan agravar los síntomas, ejercicios de respiración profunda y movilidad suave pueden ser beneficiosos          " +
                                                  "\n para mejorar la capacidad pulmonar y la circulación. POSIBLE TRATAMIENTO: El tratamiento estándar para la              " +
                                                  "\n meningitis bacteriana en adolescentes incluye antibióticos como ceftriaxona, ampicilina y vancomicina,                 " +
                                                  "\n administrados por vía intravenosa durante 7 a 14 días, en México algunas marcas reconocidas incluyen Rocephin          " +
                                                  "\n (ceftriaxona) y Amikin (amikacina), además se recomienda el uso de corticosteroides como dexametasona para             " +
                                                  "\n reducir la inflamación cerebral en casos graves. ALIMENTACIÓN: Para fortalecer el sistema inmunológico y apoyar        " +
                                                  "\n la recuperación, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y proteínas. Naranjas        " +
                                                  "\n y fresas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa hasta el 100% de la       " +
                                                  "\n ingesta diaria recomendada, fortaleciendo el sistema inmunológico y ayudando a reducir la inflamación. Espinacas       " +
                                                  "\n y lentejas: Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25% y 40% de la ingesta diaria     " +
                                                  "\n recomendada, lo que ayuda a mejorar la oxigenación celular y reducir el cansancio. Carnes magras y huevos: Son una     " +
                                                  "\n fuente importante de proteínas, proporcionando entre 20 y 25 g por cada 100 g, lo que equivale al 40-50% de la         " +
                                                  "\n recomendación diaria, esenciales para la regeneración celular y el fortalecimiento muscular. Este es solo un           " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad       " +
                                                  "\n ni que las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar más de un diagnóstico  " +
                                                  "\n y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tamaño regular) para    " +
                                                  "\n mantener la hidratación y ayudar a reducir los efectos secundarios del tratamiento, lo que es fundamental en el    " +
                                                  "\n proceso de recuperación. Los adolescentes con cáncer pueden experimentar vómitos, diarrea y sudoración excesiva,   " +
                                                  "\n lo que aumenta el riesgo de deshidratación. Es esencial consumir líquidos ricos en electrolitos, como sueros       " +
                                                  "\n orales y caldos, para reponer los minerales perdidos. También se recomienda el consumo de agua con limón o         " +
                                                  "\n infusiones suaves, que pueden ayudar a aliviar las náuseas y mejorar la digestión. EJERCICIO: La actividad         " +
                                                  "\n física debe ser moderada y adaptada, evitando esfuerzos excesivos que puedan debilitar el sistema inmunológico,    " +
                                                  "\n ejercicios como yoga, caminatas suaves y natación pueden ser beneficiosos para mejorar la resistencia y reducir    " +
                                                  "\n la fatiga. POSIBLE TRATAMIENTO: El tratamiento para el cáncer en adolescentes depende del tipo específico de       " +
                                                  "\n cáncer, pero puede incluir quimioterapia, radioterapia y cirugía, en México algunas marcas reconocidas incluyen    " +
                                                  "\n Methotrexate (metotrexato) y Vincristine (vincristina), además se recomienda el uso de terapias complementarias    " +
                                                  "\n como apoyo nutricional y psicológico para mejorar la calidad de vida del paciente. ALIMENTACIÓN: Para fortalecer   " +
                                                  "\n el sistema inmunológico y apoyar la recuperación, se recomienda el consumo de alimentos ricos en antioxidantes,    " +
                                                  "\n proteínas y ácidos grasos esenciales. Brócoli y zanahorias: Contienen aproximadamente 50-80 mg de vitamina C por   " +
                                                  "\n cada 100 g, lo que representa hasta el 90% de la ingesta diaria recomendada, fortaleciendo el sistema inmunológico." +
                                                  "\n Salmón y chía: Son fuentes de omega-3, proporcionando entre 2-4 g por cada 100 g, lo que ayuda a reducir la        " +
                                                  "\n inflamación y mejorar la función celular. Frutas y verduras de colores vivos: Como arándanos y espinacas, que      " +
                                                  "\n son ricas en antioxidantes y ayudan a proteger las células del daño. Este es solo un diagnóstico predeterminado    " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean   " +
                                                  "\n completamente correctas, para mayor seguridad se recomienda realizar más de un diagnóstico y consultar a un médico." +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.30-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física moderada a intensa diariamente, con una            " +
                                                  "\n duración aproximada de 60 minutos, aunque esta cantidad puede ajustarse según su condición. Actividades como              " +
                                                  "\n caminatas, ejercicios aeróbicos, natación y deportes de bajo impacto pueden ser beneficiosos para fortalecer su           " +
                                                  "\n sistema inmunológico y mejorar la recuperación. También se recomienda ejercicios de respiración profunda y relajación     " +
                                                  "\n para mejorar la oxigenación y reducir el estrés, lo que puede favorecer la recuperación. HIDRATACIÓN: Es fundamental      " +
                                                  "\n el consumo diario de 2 litros de agua para mantener una hidratación adecuada y ayudar al cuerpo a combatir la enfermedad. " +
                                                  "\n También se recomienda el consumo de infusiones calientes como té de jengibre o manzanilla para aliviar los síntomas       " +
                                                  "\n respiratorios. Además, el consumo de caldos y sopas calientes puede ayudar a mantener la hidratación y proporcionar       " +
                                                  "\n nutrientes esenciales para la recuperación. POSIBLE TRATAMIENTO: Para la gripe en adolescentes, el tratamiento suele      " +
                                                  "\n incluir medicamentos para reducir la fiebre y aliviar los síntomas, como el paracetamol o el ibuprofeno. En casos         " +
                                                  "\n específicos, se pueden utilizar antivirales como el oseltamivir. También es recomendable el uso de humidificadores        " +
                                                  "\n para mantener el aire húmedo y facilitar la respiración. El descanso adecuado es clave para la recuperación, por lo       " +
                                                  "\n que se recomienda dormir al menos 8 horas diarias y evitar actividades que puedan generar fatiga. En casos más severos,   " +
                                                  "\n si la fiebre persiste por más de tres días o hay dificultad para respirar, es fundamental acudir al médico para una       " +
                                                  "\n evaluación más detallada y considerar tratamientos adicionales como antibióticos en caso de infecciones secundarias.      " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de frutas y verduras que fortalezcan el sistema inmune, tales como naranjas ricas  " +
                                                  "\n en vitamina C, que ayuda a fortalecer el sistema inmunológico y reducir la duración de los síntomas, fresas con           " +
                                                  "\n antioxidantes y vitamina C, esenciales para la protección celular y la recuperación del organismo, plátanos ricos         " +
                                                  "\n en potasio, que ayuda a reemplazar los electrolitos perdidos por fiebre y sudoración, kiwi con vitamina C y potasio,      " +
                                                  "\n que contribuyen a la función inmunológica y la recuperación del cuerpo. Este es solo un diagnóstico predeterminado        " +
                                                  "\n lógico. Haberlo consultado no garantiza al cien por ciento que la paciente tenga esta enfermedad ni que las respuestas    " +
                                                  "\n sean completamente correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento         " +
                                                  "\n adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar         " +
                                                  "\n a su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física de baja intensidad, evitando esfuerzos               " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperación. Actividades como caminatas suaves, ejercicios             " +
                                                  "\n de respiración y yoga pueden ser beneficiosos para mantener el cuerpo activo sin comprometer la recuperación.               " +
                                                  "\n También se recomienda ejercicios de expansión torácica y fortalecimiento de los músculos respiratorios para mejorar         " +
                                                  "\n la capacidad pulmonar. HIDRATACIÓN: Es fundamental el consumo diario de 2 litros de agua para mantener una hidratación      " +
                                                  "\n óptima y ayudar a fluidificar las secreciones pulmonares. También se recomienda el consumo de caldos y sopas calientes      " +
                                                  "\n para facilitar la digestión y evitar irritaciones en el tracto respiratorio. Además, el consumo de jugos naturales sin      " +
                                                  "\n azúcar puede aportar vitaminas esenciales para fortalecer el sistema inmunológico. POSIBLE TRATAMIENTO: Para la             " +
                                                  "\n neumonía en adolescentes, el tratamiento suele incluir antibióticos como la amoxicilina o azitromicina en caso de           " +
                                                  "\n infecciones bacterianas. Además de medicamentos para reducir la fiebre y aliviar los síntomas, como el paracetamol.         " +
                                                  "\n En casos graves, puede requerirse hospitalización y oxigenoterapia. También es importante evitar la exposición a            " +
                                                  "\n contaminantes ambientales y humo de tabaco, ya que pueden agravar los síntomas. En situaciones más severas, el              " +
                                                  "\n tratamiento puede incluir terapia respiratoria con nebulizaciones y monitoreo constante de la función pulmonar.             " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos que fortalezcan el sistema inmune y ayuden a la recuperación,           " +
                                                  "\n tales como naranjas ricas en vitamina C, que ayuda a fortalecer el sistema inmunológico y reducir la duración de            " +
                                                  "\n los síntomas, espinacas con hierro, que contribuye a la producción de glóbulos rojos y mejora la oxigenación del            " +
                                                  "\n cuerpo, yogur con probióticos que favorecen la salud intestinal y fortalecen el sistema inmune, además de alimentos         " +
                                                  "\n ricos en zinc para mejorar la respuesta inmune y acelerar la recuperación. Este es solo un diagnóstico predeterminado       " +
                                                  "\n lógico. Haberlo consultado no garantiza al cien por ciento que la paciente tenga esta enfermedad ni que las respuestas      " +
                                                  "\n sean completamente correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento           " +
                                                  "\n adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar           " +
                                                  "\n a su médico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física moderada diariamente, con una duración        " +
                                                  "\n aproximada de 60 minutos, incluyendo ejercicios aeróbicos como caminar, correr o nadar, para mejorar la              " +
                                                  "\n sensibilidad a la insulina. También se recomienda la práctica de ejercicios de resistencia como el yoga              " +
                                                  "\n o el entrenamiento ligero con pesas para mejorar el metabolismo de la glucosa. HIDRATACIÓN: Es fundamental           " +
                                                  "\n el consumo diario de 2 litros de agua para ayudar a mantener niveles adecuados de glucosa en sangre y prevenir       " +
                                                  "\n la deshidratación. También se recomienda el consumo de bebidas sin azúcar como infusiones naturales o agua con       " +
                                                  "\n limón. Además, el consumo de alimentos con alto contenido de fibra puede ayudar a estabilizar los niveles de         " +
                                                  "\n glucosa en sangre. POSIBLE TRATAMIENTO: Para la diabetes en adolescentes, el tratamiento suele incluir insulina      " +
                                                  "\n en el caso de diabetes tipo 1, mientras que en diabetes tipo 2 puede requerirse metformina y cambios en el estilo    " +
                                                  "\n de vida. Es esencial el monitoreo constante de la glucosa en sangre y el seguimiento médico. También es              " +
                                                  "\n recomendable la educación sobre el manejo de la enfermedad para evitar complicaciones a largo plazo. En algunos      " +
                                                  "\n casos, se pueden utilizar medicamentos adicionales como inhibidores de SGLT2 o agonistas de GLP-1 para mejorar el    " +
                                                  "\n control de la glucosa. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a regular los niveles de       " +
                                                  "\n glucosa y fortalezcan el organismo, tales como avena rica en fibra soluble, que ayuda a estabilizar los niveles de   " +
                                                  "\n azúcar en sangre, frutos secos con grasas saludables y magnesio, que contribuyen a la regulación de la glucosa,      " +
                                                  "\n legumbres con proteínas vegetales y fibra, que favorecen la saciedad y el control de la glucosa, además de alimentos " +
                                                  "\n ricos en ácidos grasos Omega-3 para mejorar la función metabólica y reducir la inflamación. Este es solo un          " +
                                                  "\n diagnóstico predeterminado lógico. Haberlo consultado no garantiza al cien por ciento que la paciente tenga          " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar más de un diagnóstico     " +
                                                  "\n para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le         " +
                                                  "\n satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app Mi Vida y        " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para             " +
                                                  "\n mantener las vías respiratorias hidratadas y reducir la viscosidad de las secreciones, lo que facilita la respiración.        " +
                                                  "\n La deshidratación puede agravar los síntomas del asma, aumentando la irritación de las vías respiratorias y la                " +
                                                  "\n frecuencia de los episodios de tos. Es importante consumir líquidos ricos en electrolitos, como sueros orales y caldos,       " +
                                                  "\n para mantener el equilibrio de minerales esenciales. También se recomienda el consumo de infusiones suaves, como              " +
                                                  "\n manzanilla o jengibre, que pueden ayudar a reducir la inflamación y mejorar la función pulmonar. EJERCICIO: La actividad      " +
                                                  "\n física debe ser moderada y adaptada, evitando esfuerzos excesivos que puedan desencadenar crisis asmáticas, ejercicios        " +
                                                  "\n como natación, yoga y caminatas suaves pueden ser beneficiosos para mejorar la capacidad pulmonar y reducir la inflamación.   " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento estándar para el asma en adolescentes incluye broncodilatadores de alivio rápido como     " +
                                                  "\n salbutamol, además de corticosteroides inhalados como fluticasona o budesonida, en México algunas marcas reconocidas          " +
                                                  "\n incluyen Ventolin (salbutamol) y Pulmicort (budesonida), en casos más severos pueden utilizarse biológicos como omalizumab,   " +
                                                  "\n bajo estricta supervisión médica. ALIMENTACIÓN: Para fortalecer el sistema respiratorio y reducir la inflamación, se          " +
                                                  "\n recomienda el consumo de alimentos ricos en omega-3, antioxidantes y vitamina C. Salmón y chía: Contienen aproximadamente     " +
                                                  "\n 2-4 g de omega-3 por cada 100 g, lo que ayuda a reducir la inflamación de las vías respiratorias. Fresas y arándanos:         " +  
                                                  "\n Aportan 50-90 mg de vitamina C por cada 100 g, cubriendo hasta el 100% de la ingesta diaria recomendada, fortaleciendo el     " +
                                                  "\n sistema inmunológico. Jengibre y cúrcuma: Poseen propiedades antiinflamatorias y antioxidantes, ayudando a reducir la         " +
                                                  "\n irritación de las vías respiratorias. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza      " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se     " +
                                                  "\n recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y     " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tamaño regular) para          " +
                                                  "\n mantener la hidratación y reducir la fatiga, lo que es fundamental en el proceso de recuperación. El VIH puede           " +
                                                  "\n provocar fiebre, sudoración nocturna y diarrea, lo que aumenta el riesgo de deshidratación. Es esencial consumir         " +
                                                  "\n líquidos ricos en electrolitos, como sueros orales y caldos, para reponer los minerales perdidos. También se             " +
                                                  "\n recomienda el consumo de agua con limón o infusiones suaves, que pueden ayudar a aliviar las náuseas y mejorar la        " +
                                                  "\n digestión. EJERCICIO: La actividad física debe ser moderada y adaptada, evitando esfuerzos excesivos que puedan          " +
                                                  "\n debilitar el sistema inmunológico, ejercicios como yoga, caminatas suaves y natación pueden ser beneficiosos para        " +
                                                  "\n mejorar la resistencia y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento para el VIH en adolescentes incluye      " +
                                                  "\n terapia antirretroviral (TAR) con medicamentos como tenofovir, emtricitabina y dolutegravir, en México algunas           " +
                                                  "\n marcas reconocidas incluyen Truvada (tenofovir/emtricitabina) y Tivicay (dolutegravir), además se recomienda el uso      " +
                                                  "\n de terapias complementarias como apoyo nutricional y psicológico para mejorar la calidad de vida del paciente.           " +
                                                  "\n ALIMENTACIÓN: Para fortalecer el sistema inmunológico y apoyar la recuperación, se recomienda el consumo de alimentos    " +
                                                  "\n ricos en antioxidantes, proteínas y ácidos grasos esenciales. Brócoli y zanahorias: Contienen aproximadamente 50-80      " +
                                                  "\n mg de vitamina C por cada 100 g, lo que representa hasta el 90% de la ingesta diaria recomendada, fortaleciendo el       " +
                                                  "\n sistema inmunológico. Salmón y chía: Son fuentes de omega-3, proporcionando entre 2-4 g por cada 100 g, lo que ayuda     " +
                                                  "\n a reducir la inflamación y mejorar la función celular. Frutas y verduras de colores vivos: Como arándanos y espinacas,   " +
                                                  "\n que son ricas en antioxidantes y ayudan a proteger las células del daño. Este es solo un diagnóstico predeterminado      " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean         " +
                                                  "\n completamente correctas, para mayor seguridad se recomienda realizar más de un diagnóstico y consultar a un médico.      " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para            " +
                                                  "\n mantener la hidratación y ayudar a reducir la inflamación, lo que es fundamental en el proceso de recuperación. La           " +
                                                  "\n gonorrea puede provocar fiebre, dolor abdominal y secreción anormal, lo que aumenta el riesgo de deshidratación. Es          " +
                                                  "\n esencial consumir líquidos ricos en electrolitos, como sueros orales y caldos, para reponer los minerales perdidos.          " +
                                                  "\n También se recomienda el consumo de infusiones suaves, como manzanilla o jengibre, que pueden ayudar a aliviar las           " +
                                                  "\n molestias digestivas y mejorar la absorción de nutrientes. EJERCICIO: La actividad física debe ser muy ligera y              " +
                                                  "\n supervisada, evitando esfuerzos excesivos que puedan agravar los síntomas, ejercicios de respiración profunda y movilidad    " +
                                                  "\n suave pueden ser beneficiosos para mejorar la circulación y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento           " +
                                                  "\n estándar para la gonorrea en adolescentes incluye antibióticos como ceftriaxona y azitromicina, administrados en una         " +
                                                  "\n sola dosis, en México algunas marcas reconocidas incluyen Rocephin (ceftriaxona) y Zithromax (azitromicina), además se       " +
                                                  "\n recomienda reposo absoluto y una dieta adecuada para mejorar la recuperación. ALIMENTACIÓN: Para fortalecer el sistema       " +
                                                  "\n inmunológico y apoyar la recuperación, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y proteínas. " +
                                                  "\n Naranjas y fresas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa hasta el 100% de       " +
                                                  "\n la ingesta diaria recomendada, fortaleciendo el sistema inmunológico y ayudando a reducir la inflamación. Espinacas y        " +
                                                  "\n lentejas: Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25% y 40% de la ingesta diaria recomendada," +
                                                  "\n lo que ayuda a mejorar la oxigenación celular y reducir el cansancio. Carnes magras y huevos: Son una fuente importante      " +
                                                  "\n de proteínas, proporcionando entre 20 y 25 g por cada 100 g, lo que equivale al 40-50% de la recomendación diaria, esenciales" +
                                                  "\n para la regeneración celular y el fortalecimiento muscular. Este es solo un diagnóstico predeterminado lógico, haberlo       " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas,    " +
                                                  "\n para mayor seguridad se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital. " +
                                                  "\n HIDRATACIÓN: Mantener una hidratación adecuada es esencial para fortalecer el sistema inmunológico y reducir la          " +
                                                  "\n inflamación causada por el virus. Se recomienda el consumo diario de agua suficiente, además de infusiones de            " +
                                                  "\n manzanilla y jengibre, que poseen propiedades antiinflamatorias y pueden ayudar a aliviar el malestar. La hidratación    " +
                                                  "\n también contribuye a la regeneración celular y a la eliminación de toxinas, lo que puede ayudar a reducir la             " +
                                                  "\n frecuencia de los brotes. EJERCICIO: La actividad física debe ser moderada y enfocada en fortalecer el sistema           " +
                                                  "\n inmunológico. Se recomienda realizar ejercicios de bajo impacto, como yoga y caminatas suaves, que ayudan a reducir      " +
                                                  "\n el estrés, un factor que puede desencadenar brotes del virus. También es recomendable practicar ejercicios de            " +
                                                  "\n relajación, como la meditación y la respiración profunda, para mejorar la respuesta del cuerpo ante el virus.            " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para el herpes genital incluye antivirales como aciclovir y valaciclovir,            " +
                                                  "\n que ayudan a reducir la duración y gravedad de los síntomas. En casos recurrentes, se puede optar por terapia            " +
                                                  "\n supresiva, que consiste en el uso diario de antivirales para reducir la frecuencia de los brotes y la posibilidad        " +
                                                  "\n de transmisión. También se recomienda el uso de cremas tópicas con lidocaína, que pueden aliviar el dolor y la           " +
                                                  "\n irritación en las lesiones. En algunos casos, los médicos pueden recomendar tratamientos inmunomoduladores para          " +
                                                  "\n fortalecer la respuesta del cuerpo contra el virus y reducir la recurrencia de los síntomas. En México, estos            " +
                                                  "\n medicamentos están disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACIÓN: También es recomendable " +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como frutas     " +
                                                  "\n cítricas, ricas en vitamina C, que fortalece el sistema inmunológico. Verduras de hoja verde, que contienen antioxidantes" +
                                                  "\n y hierro, esenciales para la salud celular. Pescados grasos, ricos en Omega-3, con propiedades antiinflamatorias. Frutos " +
                                                  "\n secos, que aportan vitamina E, que ayuda a la regeneración celular. Yogur natural, fuente de probióticos, que favorecen  " +
                                                  "\n la salud intestinal y el sistema inmunológico. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no  " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello,   " +
                                                  "\n se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del   " +
                                                  "\n paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su   " +
                                                  "\n médico. Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN: La hidratación es clave para ayudar al cuerpo a eliminar toxinas y fortalecer el sistema inmunológico.           " +
                                                  "\n Se recomienda el consumo diario de agua suficiente, además de infusiones de equinácea y jengibre, que pueden ayudar           " +
                                                  "\n a mejorar la respuesta inmunológica. La hidratación también contribuye a la circulación sanguínea, lo que es esencial         " +
                                                  "\n para la recuperación de los tejidos afectados por la enfermedad. EJERCICIO: La actividad física debe ser moderada y           " +
                                                  "\n enfocada en mejorar la circulación sanguínea. Se recomienda realizar ejercicios aeróbicos suaves, como caminatas y            " +
                                                  "\n bicicleta estática, que ayudan a mejorar la oxigenación celular y la recuperación del cuerpo. También es recomendable         " +
                                                  "\n practicar ejercicios de resistencia, como el entrenamiento con pesas ligeras, para fortalecer el sistema muscular y           " +
                                                  "\n mejorar la respuesta del cuerpo ante la infección. POSIBLE TRATAMIENTO: El tratamiento para la sífilis incluye penicilina     " +
                                                  "\n benzatina, que es el medicamento de primera línea. En casos de alergia a la penicilina, se pueden utilizar antibióticos       " +
                                                  "\n alternativos como doxiciclina o ceftriaxona. Es fundamental completar el tratamiento indicado por el médico para evitar       " +
                                                  "\n complicaciones graves como la sífilis terciaria, que puede afectar el sistema nervioso y cardiovascular. También se           " +
                                                  "\n recomienda realizar pruebas de seguimiento para confirmar la eliminación de la bacteria y evitar la transmisión a otras       " +
                                                  "\n personas. En casos avanzados, el tratamiento puede incluir monitorización neurológica para detectar posibles afectaciones     " +
                                                  "\n en el sistema nervioso central. En México, estos medicamentos están disponibles en instituciones de salud como el IMSS y      " +
                                                  "\n el Insabi. ALIMENTACIÓN: También es recomendable el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden     " +
                                                  "\n a reducir la inflamación, tales como frutas cítricas, ricas en vitamina C, que fortalece el sistema inmunológico. Verduras    " +
                                                  "\n de hoja verde, que contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos, ricos en Omega-3,     " +
                                                  "\n con propiedades antiinflamatorias. Frutos secos, que aportan vitamina E, que ayuda a la regeneración celular. Yogur           " +
                                                  "\n natural, fuente de probióticos, que favorecen la salud intestinal y el sistema inmunológico. Este es solo un diagnóstico      " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas    " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mayor        " +
                                                  "\n seguridad en el tratamiento adecuado del paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface      " +
                                                  "\n del todo, se recomienda consultar a su médico. Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACIÓN: La hidratación es fundamental para mantener la salud pulmonar y ayudar a eliminar toxinas del cuerpo.         " +
                                                  "\n Se recomienda el consumo diario de agua suficiente, además de infusiones de tomillo y eucalipto, que pueden ayudar         " +
                                                  "\n a mejorar la función respiratoria. La hidratación también contribuye a la eliminación de secreciones pulmonares, lo        " +
                                                  "\n que facilita la recuperación del paciente. EJERCICIO: La actividad física debe ser moderada y enfocada en mejorar la       " +
                                                  "\n capacidad pulmonar. Se recomienda realizar ejercicios de respiración profunda, como respiración diafragmática y con        " +
                                                  "\n labios fruncidos, que ayudan a mejorar la oxigenación. También es beneficioso practicar caminatas suaves, evitando         " +
                                                  "\n ambientes fríos o contaminados. POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis incluye antibióticos como         " +
                                                  "\n isoniazida, rifampicina y etambutol, que deben tomarse durante un período prolongado para garantizar la eliminación        " +
                                                  "\n de la bacteria. En casos de tuberculosis resistente a los medicamentos, se pueden utilizar esquemas de tratamiento         " + 
                                                  "\n más prolongados con fármacos como bedaquilina y linezolid. Es fundamental seguir estrictamente el tratamiento para         " +
                                                  "\n evitar recaídas y la propagación de la enfermedad. También se recomienda realizar pruebas de seguimiento para confirmar    " +
                                                  "\n la eliminación de la bacteria y evitar la transmisión a otras personas. En casos severos, el tratamiento puede extenderse  " +
                                                  "\n por varios meses, incluyendo terapia respiratoria especializada para mejorar la función pulmonar. En México, estos         " +
                                                  "\n medicamentos están disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACIÓN: También es recomendable   " +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como frutas       " +
                                                  "\n cítricas, ricas en vitamina C, que fortalece el sistema inmunológico. Verduras de hoja verde, que contienen antioxidantes  " +
                                                  "\n y hierro, esenciales para la salud celular. Pescados grasos, ricos en Omega-3, con propiedades antiinflamatorias. Frutos   " +
                                                  "\n secos, que aportan vitamina E, que ayuda a la regeneración celular. Yogur natural, fuente de probióticos, que favorecen    " +
                                                  "\n la salud intestinal y el sistema inmunológico. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no    " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello,     " +
                                                  "\n se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del     " +
                                                  "\n paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su     " +
                                                  "\n médico. Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física moderada y adaptada a su condición, evitando           " +
                                                  "\n ejercicios de alto impacto que puedan afectar sus articulaciones. Se sugiere ejercicios de bajo impacto como natación,        " +
                                                  "\n yoga o caminatas suaves, que ayudan a mejorar la movilidad sin generar estrés en las articulaciones. HIDRATACIÓN: Se          " +
                                                  "\n recomienda el consumo diario de 2 a 2.5 litros de agua al día para mantener una adecuada hidratación y ayudar a reducir       " +
                                                  "\n la inflamación en las articulaciones. También es beneficioso el consumo de infusiones de cúrcuma y jengibre, que poseen       " +
                                                  "\n propiedades antiinflamatorias naturales. Además, el consumo de agua con limón puede ser útil debido a su contenido de         " +
                                                  "\n vitamina C, que contribuye a la producción de colágeno y la salud articular. POSIBLE TRATAMIENTO: Para la artritis juvenil,   " +
                                                  "\n el tratamiento suele incluir antiinflamatorios no esteroides (AINEs) como ibuprofeno o naproxeno, además de fármacos          " +
                                                  "\n modificadores de la enfermedad como metotrexato en casos más severos. También pueden utilizarse terapias biológicas           " +
                                                  "\n bajo supervisión médica. La fisioterapia es clave para mejorar la movilidad y reducir el dolor, y en algunos casos se         " +
                                                  "\n recomienda el uso de suplementos de colágeno y glucosamina para fortalecer las articulaciones. ALIMENTACIÓN: Se recomienda    " +
                                                  "\n el consumo de alimentos que ayuden a reducir la inflamación y fortalecer las articulaciones, tales como Pescados grasos       " +
                                                  "\n (salmón, atún): ricos en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias. Frutas y verduras de colores vivos  " +
                                                  "\n (arándanos, fresas, espinacas, brócoli): ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las    " +
                                                  "\n células del daño y fortalecer el sistema inmunológico. Jengibre: contiene compuestos con efectos antiinflamatorios que podrían" +
                                                  "\n ser beneficiosos para las articulaciones. Cúrcuma: con su componente activo, la curcumina, también tiene potentes propiedades " +
                                                  "\n antiinflamatorias y antioxidantes. Semillas de chía y linaza: ricas en Omega-3 y fibra, que ayudan a reducir la inflamación.  " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que la paciente tenga esta         " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar más de un diagnóstico para mayor        " +
                                                  "\n seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se      " +
                                                  "\n recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física ligera, evitando esfuerzos excesivos que puedan         " +
                                                  "\n agravar la tos y la dificultad respiratoria. Se sugiere ejercicios de respiración, caminatas suaves y estiramientos            " +
                                                  "\n para mejorar la capacidad pulmonar. HIDRATACIÓN: Debido a la tos persistente y la posible deshidratación causada por           " +
                                                  "\n la tosferina, se recomienda el consumo diario de 2.5 a 3 litros de agua al día. También es beneficioso el consumo de           " +
                                                  "\n infusiones de miel y jengibre, que pueden ayudar a calmar la garganta y reducir la inflamación. Se recomienda el uso           " +
                                                  "\n de bebidas tibias, como caldos y tés de hierbas, para aliviar la irritación de la garganta. POSIBLE TRATAMIENTO: Para          " +
                                                  "\n la tosferina en adolescentes, el tratamiento suele incluir antibióticos como azitromicina, claritromicina o eritromicina,      " +
                                                  "\n administrados bajo supervisión médica. También se recomienda el uso de humidificadores para aliviar la irritación de las       " +
                                                  "\n vías respiratorias. En casos graves, puede requerirse hospitalización con administración de oxígeno y líquidos intravenosos    " +
                                                  "\n para prevenir la deshidratación. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema        " +
                                                  "\n respiratorio y aliviar los síntomas, tales como Miel: ayuda a calmar la garganta y tiene propiedades antimicrobianas.          " +
                                                  "\n Jengibre: con propiedades antiinflamatorias que pueden aliviar la tos y mejorar la respuesta inmune. Frutas cítricas           " +
                                                  "\n (naranjas, limones, toronjas): ricas en vitamina C, que ayuda a mejorar la respuesta inmunológica. Caldo de pollo: fuente      " +
                                                  "\n de electrolitos y nutrientes esenciales para la recuperación. Ajo: contiene alicina, un compuesto con propiedades              " +
                                                  "\n antimicrobianas que pueden ayudar a combatir infecciones. Este es solo un diagnóstico predeterminado lógico. Haberlo           " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas.      " +
                                                  "\n Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la      " +
                                                  "\n respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita     " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física ligera, evitando esfuerzos excesivos                " +
                                                  "\n que puedan agravar la inflamación de las glándulas salivales. Se sugiere ejercicios de relajación y estiramientos          " +
                                                  "\n suaves. HIDRATACIÓN: Debido a la fiebre y la inflamación de las glándulas salivales, se recomienda el consumo              " +
                                                  "\n diario de 2.5 a 3 litros de agua al día. También es beneficioso el consumo de infusiones de manzanilla, que                " +
                                                  "\n pueden ayudar a reducir la inflamación, y agua de coco, que aporta electrolitos esenciales. Se recomienda evitar           " +
                                                  "\n bebidas ácidas como jugo de limón o naranja, ya que pueden irritar aún más las glándulas salivales. POSIBLE                " +
                                                  "\n TRATAMIENTO: Para las paperas en adolescentes, no existe un tratamiento específico, ya que es una enfermedad               " +
                                                  "\n viral autolimitada. Se recomienda reposo, hidratación y control de fiebre con paracetamol (Tempra) o ibuprofeno.           " +
                                                  "\n En casos graves, puede requerirse hospitalización con administración de líquidos intravenosos. Se recomienda               " +
                                                  "\n aplicar compresas frías en la zona inflamada para aliviar el dolor y la hinchazón. ALIMENTACIÓN: Se recomienda             " +
                                                  "\n el consumo de alimentos que ayuden a reducir la inflamación y fortalecer el sistema inmune, tales como Frutas              " +
                                                  "\n cítricas (naranjas, limones, toronjas): ricas en vitamina C, que ayuda a mejorar la respuesta inmunológica. Papaya:        " +
                                                  "\n contiene vitamina C y flavonoides que pueden ayudar a reducir la inflamación. Jengibre: con propiedades antiinflamatorias  " +
                                                  "\n que pueden aliviar la fatiga y mejorar la respuesta inmune. Miel: ayuda a calmar la garganta y tiene propiedades           " +
                                                  "\n antimicrobianas. Caldo de vegetales: fuente de electrolitos y nutrientes esenciales para la recuperación. Yogur            " +
                                                  "\n natural: fuente de probióticos que ayudan a restaurar la flora intestinal y fortalecer el sistema inmune. Este es          " +
                                                  "\n solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad   " +
                                                  "\n ni que las respuestas sean completamente correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad      " +
                                                  "\n en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda  " +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACIÓN: Mantener una hidratación adecuada es esencial para fortalecer el sistema inmunológico y reducir la          " +
                                                  "\n inflamación causada por el virus. Se recomienda el consumo diario de agua suficiente, además de infusiones de            " +
                                                  "\n manzanilla y jengibre, que poseen propiedades antiinflamatorias y pueden ayudar a aliviar el malestar. La hidratación    " +
                                                  "\n también contribuye a la regeneración celular y a la eliminación de toxinas, lo que puede ayudar a reducir la             " +
                                                  "\n frecuencia de los brotes. EJERCICIO: La actividad física debe ser moderada y enfocada en fortalecer el sistema           " +
                                                  "\n inmunológico. Se recomienda realizar ejercicios de bajo impacto, como yoga y caminatas suaves, que ayudan a reducir      " +
                                                  "\n el estrés, un factor que puede desencadenar brotes del virus. También es recomendable practicar ejercicios de            " +
                                                  "\n relajación, como la meditación y la respiración profunda, para mejorar la respuesta del cuerpo ante el virus.            " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para el herpes genital incluye antivirales como aciclovir y valaciclovir,            " +
                                                  "\n que ayudan a reducir la duración y gravedad de los síntomas. En casos recurrentes, se puede optar por terapia            " +
                                                  "\n supresiva, que consiste en el uso diario de antivirales para reducir la frecuencia de los brotes y la posibilidad        " +
                                                  "\n de transmisión. También se recomienda el uso de cremas tópicas con lidocaína, que pueden aliviar el dolor y la           " +
                                                  "\n irritación en las lesiones. En algunos casos, los médicos pueden recomendar tratamientos inmunomoduladores para          " +
                                                  "\n fortalecer la respuesta del cuerpo contra el virus y reducir la recurrencia de los síntomas. En México, estos            " +
                                                  "\n medicamentos están disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACIÓN: También es              " +
                                                  "\n recomendable el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación,          " +
                                                  "\n tales como frutas cítricas, ricas en vitamina C, que fortalece el sistema inmunológico. Verduras de hoja verde,          " +
                                                  "\n que contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos, ricos en Omega-3, con           " +
                                                  "\n propiedades antiinflamatorias. Frutos secos, que aportan vitamina E, que ayuda a la regeneración celular. Yogur          " +
                                                  "\n natural, fuente de probióticos, que favorecen la salud intestinal y el sistema inmunológico. Este es solo un             " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad         " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi        " +
                                                  "\n Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Además, por su salud, si la respuesta      " +
                                                  "\n del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L. Montes agradece tu visita a      " +
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN: La hidratación es clave para ayudar al cuerpo a eliminar toxinas y fortalecer el sistema inmunológico.          " +
                                                  "\n Se recomienda el consumo diario de agua suficiente, además de infusiones de equinácea y jengibre, que pueden ayudar          " +
                                                  "\n a mejorar la respuesta inmunológica. La hidratación también contribuye a la circulación sanguínea, lo que es esencial        " +
                                                  "\n para la recuperación de los tejidos afectados por la enfermedad. EJERCICIO: La actividad física debe ser moderada y          " +
                                                  "\n enfocada en mejorar la circulación sanguínea. Se recomienda realizar ejercicios aeróbicos suaves, como caminatas y           " +
                                                  "\n bicicleta estática, que ayudan a mejorar la oxigenación celular y la recuperación del cuerpo. También es recomendable        " +
                                                  "\n practicar ejercicios de resistencia, como el entrenamiento con pesas ligeras, para fortalecer el sistema muscular y          " +
                                                  "\n mejorar la respuesta del cuerpo ante la infección. POSIBLE TRATAMIENTO: El tratamiento para la sífilis incluye penicilina    " +
                                                  "\n benzatina, que es el medicamento de primera línea. En casos de alergia a la penicilina, se pueden utilizar antibióticos      " +
                                                  "\n alternativos como doxiciclina o ceftriaxona. Es fundamental completar el tratamiento indicado por el médico para evitar      " +
                                                  "\n complicaciones graves como la sífilis terciaria, que puede afectar el sistema nervioso y cardiovascular. También se          " +
                                                  "\n recomienda realizar pruebas de seguimiento para confirmar la eliminación de la bacteria y evitar la transmisión a otras      " +
                                                  "\n personas. En casos avanzados, el tratamiento puede incluir monitorización neurológica para detectar posibles afectaciones    " +
                                                  "\n en el sistema nervioso central. En México, estos medicamentos están disponibles en instituciones de salud como el IMSS       " +
                                                  "\n y el Insabi. ALIMENTACIÓN: También es recomendable el consumo de alimentos que fortalezcan el sistema inmunológico y         " +
                                                  "\n ayuden a reducir la inflamación, tales como frutas cítricas, ricas en vitamina C, que fortalece el sistema inmunológico.     " +
                                                  "\n Verduras de hoja verde, que contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos, ricos       " +
                                                  "\n en Omega-3, con propiedades antiinflamatorias. Frutos secos, que aportan vitamina E, que ayuda a la regeneración celular.    " +
                                                  "\n Yogur natural, fuente de probióticos, que favorecen la salud intestinal y el sistema inmunológico. Este es solo un           " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni          " +
                                                  "\n que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida          " +
                                                  "\n para establecer mayor seguridad en el tratamiento adecuado del paciente. Además, por su salud, si la respuesta del           " +
                                                  "\n diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L. Montes agradece tu visita a la           " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACIÓN: La hidratación es fundamental para mantener la salud pulmonar y ayudar a eliminar toxinas del cuerpo.        " +
                                                  "\n Se recomienda el consumo diario de agua suficiente, además de infusiones de tomillo y eucalipto, que pueden ayudar        " +
                                                  "\n a mejorar la función respiratoria. La hidratación también contribuye a la eliminación de secreciones pulmonares, lo       " +
                                                  "\n que facilita la recuperación del paciente. EJERCICIO: La actividad física debe ser moderada y enfocada en mejorar la      " +
                                                  "\n capacidad pulmonar. Se recomienda realizar ejercicios de respiración profunda, como respiración diafragmática y con       " +
                                                  "\n labios fruncidos, que ayudan a mejorar la oxigenación. También es beneficioso practicar caminatas suaves, evitando        " +
                                                  "\n ambientes fríos o contaminados. POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis incluye antibióticos como        " +
                                                  "\n isoniazida, rifampicina y etambutol, que deben tomarse durante un período prolongado para garantizar la eliminación       " +
                                                  "\n de la bacteria. En casos de tuberculosis resistente a los medicamentos, se pueden utilizar esquemas de tratamiento        " +
                                                  "\n más prolongados con fármacos como bedaquilina y linezolid. Es fundamental seguir estrictamente el tratamiento para        " +
                                                  "\n evitar recaídas y la propagación de la enfermedad. También se recomienda realizar pruebas de seguimiento para confirmar   " +
                                                  "\n la eliminación de la bacteria y evitar la transmisión a otras personas. En casos severos, el tratamiento puede extenderse " +
                                                  "\n por varios meses, incluyendo terapia respiratoria especializada para mejorar la función pulmonar. En México, estos            " +
                                                  "\n medicamentos están disponibles en instituciones de salud como el IMSS y el Insabi. Este es solo un diagnóstico predeterminado " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean              " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mayor             " +
                                                  "\n seguridad en el tratamiento adecuado del paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface      " +
                                                  "\n del todo, se recomienda consultar a su médico. Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis. " +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física de baja intensidad, evitando esfuerzos excesivos   " +
                                                  "\n y asegurando un descanso adecuado para la recuperación. Actividades como caminatas suaves, juegos tranquilos y ejercicios " +
                                                  "\n de respiración pueden ser beneficiosos para mantener el cuerpo activo sin comprometer la recuperación. También se         " +
                                                  "\n recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez muscular causada por el reposo        " +
                                                  "\n prolongado. HIDRATACIÓN: Es fundamental el consumo diario de 1.5 a 2 litros de agua para prevenir la deshidratación       " +
                                                  "\n causada por la diarrea y ayudar a la recuperación del organismo. Además, se recomienda el consumo de sueros de            " +
                                                  "\n rehidratación oral para reponer los electrolitos perdidos. Se debe evitar el consumo de bebidas con cafeína o             " +
                                                  "\n azucaradas, ya que pueden afectar la recuperación. POSIBLE TRATAMIENTO: Para la shigelosis en adolescentes, el            " + 
                                                  "\n tratamiento suele incluir antibióticos como la azitromicina o ciprofloxacino en casos graves, además de medidas           " +
                                                  "\n de rehidratación oral para evitar la deshidratación. También es importante mantener una higiene adecuada, lavarse         " +
                                                  "\n las manos frecuentemente y evitar el contacto con personas infectadas. En casos leves, el tratamiento puede centrarse     " +
                                                  "\n en el manejo de los síntomas con reposo, hidratación y una dieta adecuada. Se recomienda evitar el consumo de alimentos   " +
                                                  "\n irritantes como lácteos, frituras y comidas muy condimentadas, ya que pueden agravar la diarrea. ALIMENTACIÓN: Se         " +
                                                  "\n recomienda el consumo de alimentos que ayuden a la recuperación intestinal y fortalezcan el sistema inmune, tales         " +
                                                  "\n como plátanos ricos en potasio que ayudan a reponer electrolitos perdidos por la diarrea, zanahorias con vitamina A       " +
                                                  "\n que contribuyen a la regeneración de la mucosa intestinal, yogur con probióticos que favorecen la salud intestinal y      " +
                                                  "\n fortalecen el sistema inmune, además de caldos y sopas suaves para facilitar la digestión y evitar irritaciones en el     " +
                                                  "\n tracto intestinal. También se recomienda el consumo de arroz y manzana para ayudar a regular el tránsito intestinal.      " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al cien por ciento que la paciente     " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar más de un diagnóstico    " +
                                                  "\n para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface    " +
                                                  "\n del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física adaptada a su capacidad respiratoria,            " +
                                                  "\n evitando esfuerzos excesivos y asegurando una respiración controlada. Ejercicios como caminatas suaves, natación,       " + 
                                                  "\n yoga y técnicas de respiración pueden mejorar la función pulmonar y reducir la fatiga. También se recomienda            " +
                                                  "\n ejercicios de expansión torácica y fortalecimiento de los músculos respiratorios para mejorar la capacidad pulmonar.    " +
                                                  "\n Es importante realizar calentamiento previo y enfriamiento posterior para evitar crisis respiratorias. HIDRATACIÓN:     " +
                                                  "\n Es fundamental el consumo diario de 1.7 a 2 litros de agua para mantener las vías respiratorias hidratadas y facilitar  " +
                                                  "\n la eliminación de secreciones. También se recomienda el consumo de infusiones con propiedades antiinflamatorias como    " +
                                                  "\n el té de jengibre o manzanilla. Se debe evitar el consumo de bebidas frías o con gas, ya que pueden irritar las vías    " +
                                                  "\n respiratorias. POSIBLE TRATAMIENTO: Para el EPOC en adolescentes, el tratamiento suele incluir broncodilatadores como   " +
                                                  "\n el salbutamol, corticosteroides inhalados como la fluticasona y, en casos graves, oxigenoterapia. También es importante " +
                                                  "\n evitar la exposición a contaminantes ambientales y humo de tabaco. En algunos casos, se recomienda la rehabilitación    " +
                                                  "\n pulmonar, que incluye ejercicios específicos para mejorar la capacidad respiratoria y técnicas de manejo de la enfermedad. " +
                                                  "\n En casos más severos, puede requerirse el uso de dispositivos de asistencia respiratoria como ventiladores portátiles o    " +
                                                  "\n terapia con oxígeno domiciliario. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a mejorar la función      " +
                                                  "\n pulmonar y fortalezcan el sistema inmune, tales como pescados grasos como el salmón y el atún, ricos en ácidos grasos      " +
                                                  "\n Omega-3 que poseen propiedades antiinflamatorias que pueden ayudar a reducir la inflamación de las vías respiratorias,     " +
                                                  "\n frutas y verduras de colores vivos como arándanos, fresas, espinacas y brócoli, ricas en antioxidantes como la vitamina C  " +
                                                  "\n y carotenoides que pueden proteger las células del daño y fortalecer el sistema inmunológico, jengibre que contiene        " +
                                                  "\n compuestos con efectos antiinflamatorios que podrían ser beneficiosos para las vías respiratorias, cúrcuma con su          " +
                                                  "\n componente activo la curcumina que tiene potentes propiedades antiinflamatorias y antioxidantes, además de alimentos       " +
                                                  "\n ricos en fibra para mejorar la digestión y evitar la inflamación intestinal. Este es solo un diagnóstico predeterminado    " +
                                                  "\n lógico. Haberlo consultado no garantiza al cien por ciento que la paciente tenga esta enfermedad ni que las respuestas     " +
                                                  "\n sean completamente correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado." +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.       " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad física moderada, evitando esfuerzos excesivos y          " +
                                                  "\n asegurando una recuperación adecuada. Ejercicios como caminatas suaves, estiramientos y yoga pueden ser beneficiosos     " +
                                                  "\n para mantener el cuerpo activo sin comprometer el tratamiento. También se recomienda ejercicios de relajación y          " +
                                                  "\n respiración profunda para reducir el estrés y mejorar la respuesta inmune. HIDRATACIÓN: Es fundamental el consumo        " +
                                                  "\n diario de 1.5 a 2 litros de agua para ayudar a eliminar toxinas y mantener el organismo en equilibrio. También se        " +
                                                  "\n recomienda el consumo de jugos naturales ricos en antioxidantes para fortalecer el sistema inmune. Se debe evitar el     " +
                                                  "\n consumo de bebidas alcohólicas y azucaradas, ya que pueden afectar la recuperación. POSIBLE TRATAMIENTO: Para la         " +
                                                  "\n clamidia en adolescentes, el tratamiento suele incluir antibióticos como la azitromicina o doxiciclina, administrados    " +
                                                  "\n bajo supervisión médica. También es importante evitar el contacto con personas infectadas y mantener una higiene adecuada. " +
                                                  "\n En algunos casos, se recomienda el uso de probióticos para ayudar a restaurar la flora vaginal y prevenir infecciones      " +
                                                  "\n recurrentes. En situaciones más severas, si la infección no responde al tratamiento inicial, puede requerirse un ajuste    " +
                                                  "\n en la medicación o una evaluación más detallada por un especialista. ALIMENTACIÓN: Se recomienda el consumo de alimentos   " +
                                                  "\n que ayuden a fortalecer el sistema inmune y mejorar la recuperación, tales como naranjas ricas en vitamina C, que ayuda    " +
                                                  "\n a fortalecer el sistema inmunológico y reducir la duración de los síntomas, espinacas con hierro que contribuyen a la      " +
                                                  "\n producción de glóbulos rojos y mejora la oxigenación del cuerpo, yogur con probióticos que favorecen la salud intestinal   " +
                                                  "\n y fortalecen el sistema inmune, además de alimentos ricos en zinc para mejorar la respuesta inmune y acelerar la           " +
                                                  "\n recuperación. También se recomienda el consumo de ajo y cebolla por sus propiedades antimicrobianas. Este es solo un       " +
                                                  "\n diagnóstico predeterminado lógico. Haberlo consultado no garantiza al cien por ciento que la paciente tenga esta enfermedad" +
                                                  "\n ni que las respuestas sean completamente correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el" +
                                                  "\n tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda        " +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana. " +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para       " +
                                                  "\n mantener la hidratación y ayudar a reducir la fiebre y los síntomas neurológicos, lo que es fundamental en el           " +
                                                  "\n proceso de recuperación. La meningitis bacteriana puede provocar fiebre alta, vómitos, rigidez en el cuello y           " +
                                                  "\n sensibilidad a la luz, lo que puede llevar a una mayor pérdida de líquidos. Es importante que el paciente consuma       " +
                                                  "\n líquidos ricos en electrolitos, como sueros orales, caldos y jugos naturales sin azúcar, para evitar la deshidratación  " +
                                                  "\n y mantener el equilibrio de minerales esenciales. También se recomienda el consumo de infusiones suaves, como manzanilla  " +
                                                  "\n o jengibre, que pueden ayudar a aliviar las náuseas y mejorar la digestión. EJERCICIO: La actividad física debe ser muy   " +
                                                  "\n ligera y supervisada, evitando esfuerzos excesivos que puedan agravar los síntomas, ejercicios de respiración profunda    " +
                                                  "\n y movilidad suave pueden ser beneficiosos para mejorar la capacidad pulmonar y la circulación. POSIBLE TRATAMIENTO: El    " +
                                                  "\n tratamiento estándar para la meningitis bacteriana en adolescentes incluye antibióticos como ceftriaxona, ampicilina y    " +
                                                  "\n vancomicina, administrados por vía intravenosa durante 7 a 14 días, además se recomienda el uso de corticosteroides como  " +
                                                  "\n dexametasona para reducir la inflamación cerebral en casos graves. ALIMENTACIÓN: Para fortalecer el sistema inmunológico  " +
                                                  "\n y apoyar la recuperación, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y proteínas. Naranjas  " +
                                                  "\n y fresas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa hasta el 100% de la ingesta  " +
                                                  "\n diaria recomendada, fortaleciendo el sistema inmunológico y ayudando a reducir la inflamación. Espinacas y lentejas:      " +
                                                  "\n Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25% y 40% de la ingesta diaria recomendada, lo que     " +
                                                  "\n ayuda a mejorar la oxigenación celular y reducir el cansancio. Carnes magras y huevos: Son una fuente importante de proteínas, " +
                                                  "\n proporcionando entre 20 y 25 g por cada 100 g, lo que equivale al 40-50% de la recomendación diaria, esenciales para la      " +
                                                  "\n regeneración celular y el fortalecimiento muscular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado    " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor    " +
                                                  "\n seguridad se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app   " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tamaño regular) para mantener    " +
                                                  "\n la hidratación y ayudar a reducir los efectos secundarios del tratamiento, lo que es fundamental en el proceso de           " +
                                                  "\n recuperación. Los adolescentes con cáncer pueden experimentar vómitos, diarrea y sudoración excesiva, lo que aumenta        " +
                                                  "\n el riesgo de deshidratación. Es esencial consumir líquidos ricos en electrolitos, como sueros orales y caldos, para reponer " +
                                                  "\n los minerales perdidos. También se recomienda el consumo de agua con limón o infusiones suaves, que pueden ayudar a aliviar " +
                                                  "\n las náuseas y mejorar la digestión. EJERCICIO: La actividad física debe ser moderada y adaptada, evitando esfuerzos      " +
                                                  "\n excesivos que puedan debilitar el sistema inmunológico, ejercicios como yoga, caminatas suaves y natación pueden ser     " +
                                                  "\n beneficiosos para mejorar la resistencia y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento para el cáncer en      " +
                                                  "\n adolescentes depende del tipo específico de cáncer, pero puede incluir quimioterapia, radioterapia y cirugía, además     " +
                                                  "\n se recomienda el uso de terapias complementarias como apoyo nutricional y psicológico para mejorar la calidad de vida    " +
                                                  "\n del paciente. ALIMENTACIÓN: Para fortalecer el sistema inmunológico y apoyar la recuperación, se recomienda el consumo   " +
                                                  "\n de alimentos ricos en antioxidantes, proteínas y ácidos grasos esenciales. Brócoli y zanahorias: Contienen aproximadamente " +
                                                  "\n 50-80 mg de vitamina C por cada 100 g, lo que representa hasta el 90% de la ingesta diaria recomendada, fortaleciendo el   " +
                                                  "\n sistema inmunológico. Salmón y chía: Son fuentes de omega-3, proporcionando entre 2-4 g por cada 100 g, lo que ayuda a     " +
                                                  "\n reducir la inflamación y mejorar la función celular. Frutas y verduras de colores vivos: Como arándanos y espinacas, que   " +
                                                  "\n son ricas en antioxidantes y ayudan a proteger las células del daño. Este es solo un diagnóstico predeterminado lógico,    " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente     " +
                                                  "\n correctas, para mayor seguridad se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                    }
                }
             if (EdadFemenino.equals("Adolescencia = 10-21 años")) {
            frame.setVisible(true);
        } else {
            frame.setVisible(false);
        }
            }
        public Estudio9() {
        this("", "", "", "", "");   
        }

    
        public void crearInterfaz(){
    
            scrollpane1.setSize(700, 550);
            frame.setVisible(true);
            frame.setResizable(true);
            frame.setLocationRelativeTo(null);
        }
        @Override
    public void actionPerformed(ActionEvent e) {
        
    }
        
        
        public static void main(String args[]) {
        Estudio9 ventanaEstudio9 = new Estudio9();
        ventanaEstudio9.crearInterfaz();
    }
}