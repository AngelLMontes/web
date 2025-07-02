import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Estudio7 implements ActionListener{
    
  
         private final JLabel label1;
         private JScrollPane scrollpane1;
         private JTextArea textarea1;
         private JFrame frame;
         private final String edadEsperada = "Ancianidad = 75 años o mas";
         private String edadRecibida;
         
        public Estudio7(String nombrePaciente, String Sexo, String EdadMasculino,
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
                 if(EdadMasculino.equals("Ancianidad = 75 años o mas")){
                     if(EstaturaMasculino.equals("0.90-1.35 m")){
                              if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n En adultos mayores, la gripe puede ser más severa debido a la disminución de la respuesta inmune con la edad.     " +
                                                  "\n HIDRATACIÓN: Es recomendable que el paciente mantenga una hidratación adecuada, consumiendo entre 2 y 2.5 litros  " +
                                                  "\n de agua al día (aproximadamente ocho a diez vasos de tamaño regular) para ayudar a mantener las mucosas hidratadas " +
                                                  "\n y facilitar la expulsión de secreciones. EJERCICIO: La actividad física debe ser suave y adaptada, como caminatas  " +
                                                  "\n cortas de 20 a 30 minutos diarios, evitando esfuerzos excesivos y asegurando una buena ventilación en el entorno   " +
                                                  "\n para reducir el riesgo de complicaciones respiratorias. POSIBLE TRATAMIENTO: Para la gripe en adultos mayores, el  " +
                                                  "\n tratamiento suele incluir antivirales como oseltamivir (Tamiflu) en casos graves o de riesgo, además de medicamentos" +
                                                  "\n para aliviar síntomas como paracetamol (Tempra) o ibuprofeno (Advil) para la fiebre y el malestar. También se       " +
                                                  "\n recomienda el uso de jarabes expectorantes para facilitar la eliminación de flemas. La vacunación anual contra la   " +
                                                  "\n influenza es clave para la prevención. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en vitamina C y    " +
                                                  "\n antioxidantes para fortalecer el sistema inmune, tales como Naranjas y mandarinas (vitamina C, 50 mg por 100 g,     " +
                                                  "\n ayuda a fortalecer el sistema inmune y reducir la duración de los síntomas), Kiwi (vitamina C, 100 mg por 100 g,    " +
                                                  "\n refuerza el sistema inmunológico y mejora la absorción de hierro), Fresas (antioxidantes y vitamina C, 58 mg por    " +
                                                  "\n 100 g, protegen las células del daño oxidativo y fortalecen el sistema inmune), Espinacas y brócoli (vitamina A y C,  " +
                                                  "\n 937 µg de vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Miel   " +
                                                  "\n (propiedades antimicrobianas y suavizantes para la garganta, ayuda a reducir la irritación y la tos), Caldos calientes" +
                                                  "\n (favorecen la hidratación y alivian la congestión nasal). Este es solo un diagnóstico predeterminado lógico, haberlo  " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se       " +
                                                  "\n recomienda realizar más de un Diagnóstico de Mi Vida para mayor seguridad en el tratamiento. Además, por su salud,    " +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece" +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n En adultos mayores, la neumonía puede ser grave debido a la disminución de la respuesta inmune y la posible       " +
                                                  "\n presencia de enfermedades crónicas. HIDRATACIÓN: Es fundamental que el paciente consuma entre 2 y 2.5 litros      " +
                                                  "\n de agua al día (aproximadamente ocho a diez vasos de tamaño regular) para mantener las vías respiratorias         " +
                                                  "\n hidratadas y facilitar la expulsión de secreciones. EJERCICIO: La actividad física debe ser moderada y adaptada,  " +
                                                  "\n como caminatas cortas de 15 a 20 minutos diarios, evitando esfuerzos excesivos y asegurando una buena ventilación " +
                                                  "\n en el entorno para reducir el riesgo de complicaciones respiratorias. POSIBLE TRATAMIENTO: Para la neumonía en    " +
                                                  "\n adultos mayores, el tratamiento suele incluir antibióticos como amoxicilina con ácido clavulánico (Clavulin) o    " +
                                                  "\n levofloxacino (Levaquin) en casos bacterianos, además de medicamentos para aliviar síntomas como paracetamol (Tempra) " +
                                                  "\n o ibuprofeno (Advil) para la fiebre y el malestar. También se recomienda el uso de broncodilatadores en casos de      " +
                                                  "\n dificultad respiratoria y oxigenoterapia en situaciones graves. La vacunación contra neumococo e influenza es clave   " +
                                                  "\n para la prevención. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y minerales " +
                                                  "\n esenciales para fortalecer el sistema inmune y mejorar la recuperación, tales como Naranjas y mandarinas (vitamina C,  " +
                                                  "\n 50 mg por 100 g, ayuda a fortalecer el sistema inmune y reducir la duración de los síntomas), Kiwi (vitamina C, 100 mg   " +
                                                  "\n por 100 g, refuerza el sistema inmunológico y mejora la absorción de hierro), Fresas (antioxidantes y vitamina C, 58 mg  " +
                                                  "\n por 100 g, protegen las células del daño oxidativo y fortalecen el sistema inmune), Espinacas y brócoli (vitamina A y C, " +
                                                  "\n 937 µg de vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras " +
                                                  "\n (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamación y fortalecer el sistema inmunológico), Miel (propiedades    " +
                                                  "\n antimicrobianas y suavizantes para la garganta, ayuda a reducir la irritación y la tos), Caldos calientes (favorecen la  " +
                                                  "\n hidratación y alivian la congestión nasal). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no     " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar más" +
                                                  "\n de un Diagnóstico de Mi Vida para mayor seguridad en el tratamiento. Además, por su salud, si la respuesta del diagnóstico " +
                                                  "\n no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y " +
                                                  "\n espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n En adultos mayores, la diabetes puede generar complicaciones graves si no se controla adecuadamente.     " +
                                                  "\n HIDRATACIÓN: Es fundamental que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente " +
                                                  "\n ocho a diez vasos de tamaño regular) para mantener una adecuada función renal y evitar la deshidratación," +
                                                  "\n que puede afectar los niveles de glucosa en sangre. EJERCICIO: La actividad física debe ser moderada y      " +
                                                  "\n adaptada, como caminatas de 30 minutos diarios, ejercicios de bajo impacto como natación o yoga, siempre    " +
                                                  "\n bajo supervisión médica para evitar hipoglucemias. POSIBLE TRATAMIENTO: Para la diabetes en adultos mayores," +
                                                  "\n el tratamiento suele incluir medicamentos como metformina (Glucophage) para mejorar la sensibilidad a la    " +
                                                  "\n insulina, insulina en casos necesarios, y medicamentos como glibenclamida o sitagliptina para el control de " +
                                                  "\n la glucosa. Es clave mantener un monitoreo constante de los niveles de azúcar en sangre y seguir una dieta  " +
                                                  "\n equilibrada. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en fibra, antioxidantes y nutrientes " +
                                                  "\n esenciales para el control de la glucosa, tales como Avena (fibra soluble, 4 g por 100 g, ayuda a estabilizar   " +
                                                  "\n los niveles de glucosa), Frijoles (fibra y proteínas, 6 g de fibra por 100 g, contribuyen a la regulación del   " +
                                                  "\n azúcar en sangre), Espinacas (magnesio, 79 mg por 100 g, mejora la sensibilidad a la insulina), Naranjas        " +
                                                  "\n (vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora la absorción de hierro), Almendras (vitamina E, " +
                                                  "\n 25 mg por 100 g, ayuda a reducir la inflamación y proteger las células), Canela (compuestos bioactivos, ayuda a    " +
                                                  "\n mejorar la sensibilidad a la insulina). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no   " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda       " +
                                                  "\n realizar más de un Diagnóstico de Mi Vida para mayor seguridad en el tratamiento. Además, por su salud, si la      " +
                                                  "\n respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece   " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n En adultos mayores, el asma puede comprometer la función respiratoria y aumentar el riesgo de complicaciones.        " +
                                                  "\n HIDRATACIÓN: Es esencial que el paciente consuma entre 1.5 y 2 litros de agua al día (aproximadamente seis a ocho    " +
                                                  "\n vasos de tamaño regular) para mantener las vías respiratorias hidratadas y reducir la viscosidad de las secreciones. " +
                                                  "\n EJERCICIO: La actividad física debe ser controlada y adaptada, como ejercicios de respiración, caminatas cortas de     " +
                                                  "\n 15 a 20 minutos diarios, evitando ambientes con alérgenos o contaminación. POSIBLE TRATAMIENTO: Para el asma en adultos" +
                                                  "\n mayores, el tratamiento suele incluir broncodilatadores de alivio rápido como salbutamol (Ventolin), corticosteroides  " +
                                                  "\n inhalados como fluticasona (Flixotide) para el control a largo plazo, y en algunos casos, modificadores de leucotrienos" +
                                                  "\n como montelukast (Singulair). Es clave seguir estrictamente el plan de acción para el asma indicado por el médico.     " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y ácidos grasos esenciales para reducir la  " +
                                                  "\n inflamación y mejorar la función pulmonar, tales como Pescados grasos (salmón, atún, Omega-3, 2 g por 100 g, ayuda a   " +
                                                  "\n reducir la inflamación de las vías respiratorias), Frutas y verduras de colores vivos (arándanos, fresas, espinacas,   " +
                                                  "\n brócoli, vitamina C, 89 mg por 100 g, fortalece el sistema inmune y protege las células del daño oxidativo), Jengibre  " +
                                                  "\n (compuestos antiinflamatorios, ayuda a relajar las vías respiratorias), Cúrcuma (curcumina, 3% de concentración, potente " +
                                                  "\n antioxidante y antiinflamatorio). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al  " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar más de un       " +
                                                  "\n Diagnóstico de Mi Vida para mayor seguridad en el tratamiento. Además, por su salud, si la respuesta del diagnóstico no le" +
                                                  "\n satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que" +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n En adultos mayores, el VIH/SIDA requiere un control estricto para evitar complicaciones y mantener una buena    " +
                                                  "\n calidad de vida. HIDRATACIÓN: Es recomendable que el paciente consuma entre 2 y 2.5 litros de agua al día       " +
                                                  "\n (aproximadamente ocho a diez vasos de tamaño regular) para mantener una adecuada función renal y evitar la      " +
                                                  "\n deshidratación, que puede afectar el metabolismo de los medicamentos antirretrovirales. EJERCICIO: La actividad   " +
                                                  "\n física debe ser moderada y adaptada, como caminatas de 30 minutos diarios, ejercicios de bajo impacto como yoga   " +
                                                  "\n o natación, siempre bajo supervisión médica para evitar fatiga extrema. POSIBLE TRATAMIENTO: Para el VIH/SIDA     " +
                                                  "\n en adultos mayores, el tratamiento suele incluir terapia antirretroviral combinada con medicamentos como tenofovir, " +
                                                  "\n emtricitabina y dolutegravir, que ayudan a controlar la replicación del virus y mejorar la función inmunológica.    " +
                                                  "\n Es clave mantener un monitoreo constante de la carga viral y el estado inmunológico. ALIMENTACIÓN: Se recomienda    " +
                                                  "\n el consumo de alimentos ricos en antioxidantes, proteínas y nutrientes esenciales para fortalecer el sistema inmune " +
                                                  "\n y mejorar la recuperación, tales como Frutas cítricas (naranjas, limones, vitamina C, 50 mg por 100 g, fortalece el " +
                                                  "\n sistema inmune y mejora la absorción de hierro), Espinacas (vitamina A y C, 937 µg de vitamina A y 89 mg de     " +
                                                  "\n vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg     " +
                                                  "\n por 100 g, ayuda a reducir la inflamación y proteger las células), Yogur natural (probióticos, mejora la salud  " +
                                                  "\n intestinal y fortalece el sistema inmune), Pescados grasos (salmón, Omega-3, 2 g por 100 g, ayuda a reducir la  " +
                                                  "\n inflamación y mejorar la función celular). Este es solo un diagnóstico predeterminado lógico, haberlo consultado " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda  " +
                                                  "\n realizar más de un Diagnóstico de Mi Vida para mayor seguridad en el tratamiento. Además, por su salud, si la    " +
                                                  "\n respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n En adultos mayores, la gonorrea puede presentar síntomas más leves o atípicos, por lo que es fundamental un        " +
                                                  "\n diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que el paciente mantenga una hidratación   " +
                                                  "\n adecuada, consumiendo al menos 2 litros de agua al día (aproximadamente ocho vasos de tamaño regular) para         " +
                                                  "\n favorecer la eliminación de toxinas y mantener el sistema inmunológico fuerte. EJERCICIO: En cuanto a la actividad " +
                                                  "\n física, es recomendable realizar ejercicio moderado, como caminatas de 30 a 45 minutos diarios, siempre bajo       " +
                                                  "\n supervisión médica para evitar complicaciones. POSIBLE TRATAMIENTO: El tratamiento estándar para la gonorrea incluye " +
                                                  "\n antibióticos como la azitromicina y ceftriaxona, los cuales deben ser administrados bajo prescripción médica. En     " +
                                                  "\n casos más graves, puede requerirse hospitalización para recibir antibióticos intravenosos. Es fundamental que el     " +
                                                  "\n paciente evite el contacto íntimo hasta completar el tratamiento y que su pareja también reciba tratamiento para     " +
                                                  "\n evitar reinfecciones. ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema     " + 
                                                  "\n inmunológico y ayuden a combatir la infección, tales como: Ajo: Posee propiedades antimicrobianas naturales que      " +
                                                  "\n pueden ayudar a combatir infecciones y contiene alicina, un compuesto con efectos antibacterianos. Jengibre: Con     " +
                                                  "\n efectos antiinflamatorios que pueden ser beneficiosos para el organismo, aporta antioxidantes y gingerol, que ayuda  " +
                                                  "\n a reducir la inflamación. Frutas cítricas (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece el       " +
                                                  "\n sistema inmunológico y ayuda a reducir la duración de infecciones, aportando aproximadamente el 89% del requerimiento   " +
                                                  "\n diario por cada 100 gramos. Yogur natural: Contiene probióticos, que pueden ayudar a mantener el equilibrio de la flora " +
                                                  "\n bacteriana y mejorar la respuesta inmunológica, proporcionando cerca del 20% del requerimiento diario de calcio por     " +
                                                  "\n cada porción de 150 gramos. Verduras de hoja verde (espinaca, acelga, brócoli): Ricas en antioxidantes y vitaminas      " +
                                                  "\n esenciales para la recuperación, como la vitamina A, que contribuye a la regeneración celular y aporta cerca del 56%    " +
                                                  "\n del requerimiento diario por cada 100 gramos de espinaca. Este es solo un diagnóstico predeterminado lógico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. " +
                                                  "\n Para mayor seguridad, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento " +
                                                  "\n adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n En adultos mayores, el herpes genital puede causar síntomas más prolongados y mayor riesgo de complicaciones,  " +
                                                  "\n por lo que es fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que el      " +
                                                  "\n paciente mantenga una hidratación adecuada, consumiendo al menos 2 a 2.5 litros de agua al día (aproximadamente  " +
                                                  "\n ocho a diez vasos de tamaño regular) para favorecer la eliminación de toxinas y mantener el sistema inmunológico  " +
                                                  "\n fuerte. EJERCICIO: En cuanto a la actividad física, es recomendable realizar ejercicio moderado, como caminatas   " +
                                                  "\n de 30 a 45 minutos diarios, siempre bajo supervisión médica para evitar complicaciones y fortalecer el sistema    " +
                                                  "\n inmunológico. POSIBLE TRATAMIENTO: El tratamiento estándar para el herpes genital incluye antivirales como el     " +
                                                  "\n aciclovir, valaciclovir y famciclovir, los cuales deben ser administrados bajo prescripción médica. Estos         " +
                                                  "\n medicamentos ayudan a reducir la duración y gravedad de los síntomas, así como la frecuencia de los brotes        " +
                                                  "\n recurrentes. También es fundamental evitar el contacto íntimo durante los brotes y mantener una higiene adecuada  " +
                                                  "\n para prevenir la propagación del virus. ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo de alimentos que       " +
                                                  "\n fortalezcan el sistema inmunológico y ayuden a combatir la infección, tales como: Ajo: Posee propiedades          " +
                                                  "\n antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene alicina, un compuesto con efectos   " +
                                                  "\n antibacterianos. Frutas cítricas (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece el sistema     " +
                                                  "\n inmunológico y ayuda a reducir la duración de infecciones, aportando aproximadamente el 89% del requerimiento     " +
                                                  "\n diario por cada 100 gramos. Yogur natural: Contiene probióticos, que pueden ayudar a mantener el equilibrio de la " +
                                                  "\n flora bacteriana y mejorar la respuesta inmunológica, proporcionando cerca del 20% del requerimiento diario de    " +
                                                  "\n calcio por cada porción de 150 gramos. Verduras de hoja verde (espinaca, acelga, brócoli): Ricas en antioxidantes   " +
                                                  "\n y vitaminas esenciales para la recuperación, como la vitamina A, que contribuye a la regeneración celular y aporta  " +
                                                  "\n cerca del 56% del requerimiento diario por cada 100 gramos de espinaca. Omega-3 (salmón, atún, chía): Con propiedades " +
                                                  "\n antiinflamatorias que pueden ayudar a reducir la inflamación y mejorar la respuesta inmunológica, aportando           " +
                                                  "\n aproximadamente el 50% del requerimiento diario por cada 100 gramos de salmón. Este es solo un diagnóstico predeterminado" +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean    " +
                                                  "\n completamente correctas. Para mayor seguridad, se recomienda realizar más de un diagnóstico y consultar a un médico " +
                                                  "\n para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n En adultos mayores, la sífilis puede presentar síntomas más severos si no se trata a tiempo, por lo que es      " +
                                                  "\n fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que el paciente mantenga " +
                                                  "\n una hidratación adecuada, consumiendo al menos 2 litros de agua al día (aproximadamente ocho vasos de tamaño    " +
                                                  "\n regular) para favorecer la eliminación de toxinas y mantener el sistema inmunológico fuerte. EJERCICIO: En      " +
                                                  "\n cuanto a la actividad física, es recomendable realizar ejercicio moderado, como caminatas de 30 a 45 minutos    " +
                                                  "\n diarios, siempre bajo supervisión médica para evitar complicaciones y fortalecer el sistema inmunológico.       " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento estándar para la sífilis incluye antibióticos como la penicilina G benzatina  " +
                                                  "\n (Benzetacil), administrada en dosis única intramuscular, o alternativas como doxiciclina o ceftriaxona en casos   " +
                                                  "\n de alergia a la penicilina. Es fundamental seguir el tratamiento completo para evitar complicaciones graves.      " +
                                                  "\n ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden  " +
                                                  "\n a combatir la infección, tales como: Ajo: Posee propiedades antimicrobianas naturales que pueden ayudar a combatir  " +
                                                  "\n infecciones y contiene alicina, un compuesto con efectos antibacterianos. Frutas cítricas (naranjas, limones,       " +
                                                  "\n toronjas): Ricas en vitamina C, que fortalece el sistema inmunológico y ayuda a reducir la duración de infecciones, " +
                                                  "\n aportando aproximadamente el 89% del requerimiento diario por cada 100 gramos. Yogur natural: Contiene probióticos,   " +
                                                  "\n que pueden ayudar a mantener el equilibrio de la flora bacteriana y mejorar la respuesta inmunológica, proporcionando " +
                                                  "\n cerca del 20% del requerimiento diario de calcio por cada porción de 150 gramos. Verduras de hoja verde (espinaca,    " +
                                                  "\n acelga, brócoli): Ricas en antioxidantes y vitaminas esenciales para la recuperación, como la vitamina A, que         " +
                                                  "\n contribuye a la regeneración celular y aporta cerca del 56% del requerimiento diario por cada 100 gramos de espinaca. " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga   " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar   " +
                                                  "\n más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu  " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n En adultos mayores, la tuberculosis puede ser más difícil de tratar debido a la edad y posibles condiciones    " +
                                                  "\n preexistentes, por lo que es fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se       " +
                                                  "\n recomienda que el paciente mantenga una hidratación adecuada, consumiendo al menos 2.5 litros de agua al día   " +
                                                  "\n (aproximadamente diez vasos de tamaño regular) para favorecer la eliminación de toxinas y mantener el sistema  " +
                                                  "\n inmunológico fuerte. EJERCICIO: En cuanto a la actividad física, es recomendable realizar ejercicio moderado,  " +
                                                  "\n como caminatas de 30 minutos diarios, siempre bajo supervisión médica para evitar complicaciones y fortalecer  " +
                                                  "\n el sistema inmunológico. POSIBLE TRATAMIENTO: El tratamiento estándar para la tuberculosis incluye un régimen  " +
                                                  "\n de antibióticos como isoniazida, rifampicina, etambutol y pirazinamida, administrados durante un período de    " +
                                                  "\n seis meses bajo estricta supervisión médica. Es fundamental seguir el tratamiento completo para evitar resistencia   " +
                                                  "\n bacteriana. ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunológico  " +
                                                  "\n y ayuden a combatir la infección, tales como: Ajo: Posee propiedades antimicrobianas naturales que pueden ayudar a   " +
                                                  "\n combatir infecciones y contiene alicina, un compuesto con efectos antibacterianos. Frutas cítricas (naranjas,        " +
                                                  "\n limones, toronjas): Ricas en vitamina C, que fortalece el sistema inmunológico y ayuda a reducir la duración de      " +
                                                  "\n infecciones, aportando aproximadamente el 89% del requerimiento diario por cada 100 gramos. Yogur natural: Contiene  " +
                                                  "\n probióticos, que pueden ayudar a mantener el equilibrio de la flora bacteriana y mejorar la respuesta inmunológica,  " +
                                                  "\n proporcionando cerca del 20% del requerimiento diario de calcio por cada porción de 150 gramos. Verduras de hoja   " +
                                                  "\n verde (espinaca, acelga, brócoli): Ricas en antioxidantes y vitaminas esenciales para la recuperación, como la     " +
                                                  "\n vitamina A, que contribuye a la regeneración celular y aporta cerca del 56% del requerimiento diario por cada 100  " +
                                                  "\n gramos de espinaca. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que " +
                                                  "\n el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad, se     " +
                                                  "\n recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel   " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n En adultos mayores, la artritis puede causar dolor crónico y afectar la movilidad, por lo que es fundamental       " +
                                                  "\n un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que el paciente mantenga una            " +
                                                  "\n hidratación adecuada, consumiendo al menos 2 litros de agua al día (aproximadamente ocho vasos de tamaño regular)  " +
                                                  "\n para favorecer la lubricación de las articulaciones y reducir la inflamación. EJERCICIO: En cuanto a la actividad   " +
                                                  "\n física, es recomendable realizar ejercicios de bajo impacto, como caminatas de 30 minutos diarios, natación o yoga, " +
                                                  "\n siempre bajo supervisión médica para evitar complicaciones y fortalecer las articulaciones. POSIBLE TRATAMIENTO: El " +
                                                  "\n tratamiento estándar para la artritis incluye antiinflamatorios no esteroides (AINEs) como ibuprofeno y naproxeno,  " +
                                                  "\n así como fármacos modificadores de la enfermedad (FAMEs) como metotrexato y sulfasalazina, administrados bajo       " +
                                                  "\n prescripción médica. En casos graves, pueden recomendarse terapias biológicas. ALIMENTACIÓN RECOMENDADA: Se recomienda  " +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como: Omega-3  " +
                                                  "\n (salmón, atún, chía): Con propiedades antiinflamatorias que pueden ayudar a reducir la inflamación y mejorar la respuesta " +
                                                  "\n inmunológica, aportando aproximadamente el 50% del requerimiento diario por cada 100 gramos de salmón. Frutas y verduras  " +
                                                  "\n de colores vivos (arándanos, fresas, espinacas, brócoli): Ricas en antioxidantes como la vitamina C y carotenoides, que   " +
                                                  "\n pueden proteger las células del daño y fortalecer el sistema inmunológico. Jengibre: Contiene compuestos con efectos      " +
                                                  "\n antiinflamatorios que podrían ser beneficiosos para las articulaciones. Cúrcuma: Con su componente activo, la curcumina,  " +
                                                  "\n también tiene potentes propiedades antiinflamatorias y antioxidantes. Este es solo un diagnóstico predeterminado lógico,  " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente  " + 
                                                  "\n correctas. Para mayor seguridad, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer   " +
                                                  "\n el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n En adultos mayores, la tosferina puede ser grave debido a la disminución de la capacidad pulmonar y la         " +
                                                  "\n presencia de otras condiciones médicas. EJERCICIO: Es recomendable que el paciente realice actividad física    " +
                                                  "\n ligera y adaptada a su capacidad, como caminatas cortas en espacios bien ventilados, evitando esfuerzos        " +
                                                  "\n excesivos que puedan desencadenar episodios de tos intensa. HIDRATACIÓN: También es crucial el consumo diario  " +
                                                  "\n de 1.5 a 2 litros de agua (seis a ocho vasos de agua de tamaño regular) para mantener las vías respiratorias   " +
                                                  "\n hidratadas y facilitar la expulsión de secreciones. POSIBLE TRATAMIENTO: Para la tosferina en adultos mayores, " +
                                                  "\n el tratamiento suele incluir antibióticos como la azitromicina, claritromicina o eritromicina, los cuales ayudan   " +
                                                  "\n a reducir la duración de la enfermedad y la transmisión. En casos graves, puede requerirse hospitalización para    " +
                                                  "\n monitoreo respiratorio y administración de oxígeno. También se recomienda el uso de medidas de soporte, como       " +
                                                  "\n humidificadores para aliviar la irritación de las vías respiratorias y evitar ambientes con humo o contaminantes.  " +
                                                  "\n ALIMENTACIÓN: Es recomendable que el paciente consuma alimentos que ayuden a fortalecer el sistema inmunológico y  " +
                                                  "\n reducir la inflamación, tales como jengibre, que contiene compuestos con efectos antiinflamatorios y antioxidantes,  " +
                                                  "\n aportando 5% de la ingesta diaria recomendada de vitamina C. cúrcuma, con su componente activo, la curcumina, que    " +
                                                  "\n tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes." +
                                                  "\n frutas cítricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunológico, aportando" +
                                                  "\n 90 mg por cada 100 g de fruta, lo que representa 100% de la ingesta diaria recomendada. miel, que puede ayudar a    " +
                                                  "\n calmar la irritación de la garganta y reducir la tos, proporcionando antioxidantes y propiedades antimicrobianas.   " +
                                                  "\n caldo de pollo, que aporta líquidos y nutrientes esenciales para la recuperación, incluyendo electrolitos y         " +
                                                  "\n proteínas esenciales. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al         " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se        " +
                                                  "\n recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado.          " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n En adultos mayores, las paperas pueden causar complicaciones graves, como inflamación de órganos y problemas         " +
                                                  "\n neurológicos. EJERCICIO: Se recomienda actividad física ligera, como caminatas cortas en espacios bien ventilados,   " +
                                                  "\n evitando esfuerzos excesivos que puedan agravar la inflamación. También es recomendable realizar ejercicios de       " +
                                                  "\n movilidad articular y estiramientos suaves para mantener la flexibilidad y evitar la rigidez muscular.               " +
                                                  "\n HIDRATACIÓN: Es fundamental el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de agua de tamaño regular)" +
                                                  "\n para mantener el cuerpo hidratado y ayudar a reducir la fiebre y el malestar. POSIBLE TRATAMIENTO: No existe un      " +
                                                  "\n tratamiento específico para las paperas, ya que es una enfermedad viral. Sin embargo, se recomienda el uso de        " +
                                                  "\n medicamentos para aliviar los síntomas, como paracetamol o ibuprofeno, para reducir la fiebre y el dolor. También es " +
                                                  "\n importante el reposo, la hidratación adecuada y una alimentación de consistencia blanda para facilitar la ingesta de " +
                                                  "\n alimentos. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmunológico y     " +
                                                  "\n reducir la inflamación, tales como jengibre, que contiene compuestos con efectos antiinflamatorios y antioxidantes,  " +
                                                  "\n aportando 5% de la ingesta diaria recomendada de vitamina C. cúrcuma, con su componente activo, la curcumina, que    " +
                                                  "\n tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes." +
                                                  "\n frutas cítricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunológico, aportando    " +
                                                  "\n 90 mg por cada 100 g de fruta, lo que representa 100% de la ingesta diaria recomendada. miel, que puede ayudar a calmar " +
                                                  "\n la irritación de la garganta y reducir la inflamación, proporcionando antioxidantes y propiedades antimicrobianas.      " +
                                                  "\n caldo de pollo, que aporta líquidos y nutrientes esenciales para la recuperación, incluyendo electrolitos y proteínas   " +
                                                  "\n esenciales. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente  " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un   " +
                                                  "\n diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la     " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n En adultos mayores, el virus del Zika puede causar síntomas como fiebre, dolor muscular y articular, así como       " +
                                                  "\n complicaciones neurológicas en algunos casos. EJERCICIO: Se recomienda actividad física moderada, como caminatas    " +
                                                  "\n suaves, evitando la exposición prolongada al sol y a zonas con alta presencia de mosquitos. También es recomendable " +
                                                  "\n realizar ejercicios de respiración y movilidad para mejorar la circulación y reducir la fatiga muscular.            " +
                                                  "\n HIDRATACIÓN: Es esencial el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tamaño regular)  " +
                                                  "\n para mantener el cuerpo hidratado y ayudar a reducir la fiebre y el malestar. POSIBLE TRATAMIENTO: No existe un     " +
                                                  "\n tratamiento antiviral específico para el Zika. El manejo de la enfermedad es sintomático e incluye antiinflamatorios " +
                                                  "\n no esteroideos y analgésicos como paracetamol, además de reposo e ingesta abundante de líquidos. ALIMENTACIÓN: Se    " +
                                                  "\n recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmunológico y reducir la inflamación, tales   " +
                                                  "\n como arándanos, ricos en antioxidantes y vitamina C, aportando 25% de la ingesta diaria recomendada. espinacas, que  " +
                                                  "\n contienen hierro y vitamina A, esenciales para la recuperación, proporcionando 15% de la ingesta diaria recomendada  " +
                                                  "\n de hierro. jengibre, con propiedades antiinflamatorias y antioxidantes, aportando 5% de la ingesta diaria recomendada " +
                                                  "\n de vitamina C. cúrcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de  " +
                                                  "\n la ingesta diaria recomendada de antioxidantes. agua de coco, que ayuda a la hidratación y aporta electrolitos        " +
                                                  "\n esenciales. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un  " +
                                                  "\n diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n En adultos mayores, el rotavirus puede causar diarrea severa y deshidratación, lo que puede ser peligroso     " +
                                                  "\n si no se trata adecuadamente. EJERCICIO: Se recomienda actividad física ligera, como caminatas cortas,        " +
                                                  "\n evitando esfuerzos excesivos que puedan agravar la deshidratación. También es recomendable realizar ejercicios   " +
                                                  "\n de movilidad y estiramientos para mejorar la circulación y reducir la fatiga. HIDRATACIÓN: Es crucial el consumo " +
                                                  "\n diario de 2.5 a 3 litros de agua (diez a doce vasos de agua de tamaño regular) para compensar la pérdida de      " +
                                                  "\n líquidos y evitar la deshidratación. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral específico para     " +
                                                  "\n el rotavirus. El manejo de la enfermedad se basa en rehidratación oral, consumo de líquidos con electrolitos     " +
                                                  "\n y una dieta adecuada. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a reponer líquidos y fortalecer " +
                                                  "\n el sistema digestivo, tales como plátanos, ricos en potasio, que ayudan a reemplazar los electrolitos perdidos,      " +
                                                  "\n aportando 10% de la ingesta diaria recomendada de potasio. arroz blanco, que es fácil de digerir y ayuda a           " +
                                                  "\n estabilizar el sistema digestivo, proporcionando 20% de la ingesta diaria recomendada de carbohidratos. zanahorias,  " +
                                                  "\n ricas en vitamina A, que ayudan a la recuperación del sistema digestivo, aportando 50% de la ingesta diaria          " +
                                                  "\n recomendada de vitamina A. agua de coco, que ayuda a la hidratación y aporta electrolitos esenciales. yogur natural, " +
                                                  "\n que contiene probióticos beneficiosos para la flora intestinal, proporcionando 15% de la ingesta diaria recomendada  " +
                                                  "\n de calcio. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente" +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más    " +
                                                  "\n de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu      " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n En adultos mayores, la listeriosis puede ser grave debido a la debilidad del sistema inmunológico y la posibilidad   " +
                                                  "\n de complicaciones neurológicas. EJERCICIO: Se recomienda actividad física ligera, como caminatas cortas en espacios  " +
                                                  "\n bien ventilados, evitando esfuerzos excesivos que puedan generar fatiga. También es recomendable realizar ejercicios " +
                                                  "\n de movilidad articular y estiramientos suaves para mantener la flexibilidad y evitar la rigidez muscular. Debido a   " +
                                                  "\n que la listeriosis puede causar fiebre y debilidad, es importante que el ejercicio sea de baja intensidad y que se   " +
                                                  "\n realice en intervalos cortos para evitar el agotamiento. HIDRATACIÓN: Es fundamental el consumo diario de 1.5 a 2    " +
                                                  "\n litros de agua (seis a ocho vasos de agua de tamaño regular) para mantener el cuerpo hidratado y ayudar a reducir la " +
                                                  "\n fiebre y el malestar. POSIBLE TRATAMIENTO: La listeriosis se trata con antibióticos, como ampicilina combinada con   " +
                                                  "\n gentamicina, en casos graves. También se pueden utilizar penicilina o trimetoprima-sulfametoxazol en pacientes con   " +
                                                  "\n alergia a la ampicilina. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema         " +
                                                  "\n inmunológico y reducir la inflamación, tales como ajo, que contiene alicina con propiedades antimicrobianas, aportando  " +
                                                  "\n 5% de la ingesta diaria recomendada de antioxidantes. jengibre, con efectos antiinflamatorios y antioxidantes, aportando" +
                                                  "\n 5% de la ingesta diaria recomendada de vitamina C. cúrcuma, con curcumina, que tiene propiedades antiinflamatorias y    " +
                                                  "\n antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes. frutas cítricas (naranjas, limones, " +
                                                  "\n toronjas), ricas en vitamina C, que fortalece el sistema inmunológico, aportando 90 mg por cada 100 g de fruta, lo que  " +
                                                  "\n representa 100% de la ingesta diaria recomendada. yogur natural, que contiene probióticos beneficiosos para la flora    " +
                                                  "\n intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio. Este es solo un diagnóstico predeterminado   " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean        " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer" +
                                                  "\n el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n En adultos mayores, la shigelosis puede causar diarrea severa y deshidratación, lo que puede ser peligroso    " +
                                                  "\n si no se trata adecuadamente. EJERCICIO: Se recomienda actividad física ligera, como caminatas cortas,        " +
                                                  "\n evitando esfuerzos excesivos que puedan agravar la deshidratación. También es recomendable realizar ejercicios " +
                                                  "\n de movilidad y estiramientos para mejorar la circulación y reducir la fatiga. Debido a que la shigelosis causa " +
                                                  "\n diarrea y pérdida de líquidos, es importante evitar ejercicios que generen sudoración excesiva y optar por     " +
                                                  "\n movimientos suaves que ayuden a mantener la actividad sin comprometer la hidratación. HIDRATACIÓN: Es crucial  " +
                                                  "\n el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de agua de tamaño regular) para compensar la    " +
                                                  "\n pérdida de líquidos y evitar la deshidratación. POSIBLE TRATAMIENTO: La shigelosis se trata con antibióticos,  " +
                                                  "\n como azitromicina, ciprofloxacino o ceftriaxona, dependiendo de la gravedad del caso. También se recomienda    " +
                                                  "\n rehidratación oral y una dieta adecuada. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a      " +
                                                  "\n reponer líquidos y fortalecer el sistema digestivo, tales como plátanos, ricos en potasio, que ayudan a        " +
                                                  "\n reemplazar los electrolitos perdidos, aportando 10% de la ingesta diaria recomendada de potasio. arroz blanco, " +
                                                  "\n que es fácil de digerir y ayuda a estabilizar el sistema digestivo, proporcionando 20% de la ingesta diaria    " +
                                                  "\n recomendada de carbohidratos. zanahorias, ricas en vitamina A, que ayudan a la recuperación del sistema        " +
                                                  "\n digestivo, aportando 50% de la ingesta diaria recomendada de vitamina A. agua de coco, que ayuda a la         " +
                                                  "\n hidratación y aporta electrolitos esenciales. yogur natural, que contiene probióticos beneficiosos para la    " +
                                                  "\n flora intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio. Este es solo un diagnóstico  " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que   " +
                                                  "\n las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y        " +
                                                  "\n consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app     " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n En adultos mayores, la EPOC puede causar dificultad para respirar y fatiga, afectando la calidad de vida.    " +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada, como caminatas suaves y ejercicios de respiración para   " +
                                                  "\n mejorar la capacidad pulmonar. También es recomendable realizar ejercicios de movilidad y estiramientos para    " +
                                                  "\n mejorar la circulación y reducir la fatiga. Debido a que la EPOC afecta la función pulmonar, es importante      " +
                                                  "\n realizar ejercicios de respiración profunda, como la técnica de respiración diafragmática, que ayuda a mejorar  " +
                                                  "\n la oxigenación y reducir la sensación de falta de aire. También se recomienda la respiración con labios fruncidos, " +
                                                  "\n que permite controlar la exhalación y mejorar la eficiencia respiratoria. HIDRATACIÓN: Es esencial el consumo      " +
                                                  "\n diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tamaño regular) para mantener el cuerpo hidratado   " +
                                                  "\n y ayudar a reducir la inflamación de las vías respiratorias. POSIBLE TRATAMIENTO: La EPOC se trata con broncodilatadores," +
                                                  "\n como salbutamol, tiotropio o formoterol, además de corticosteroides inhalados, como fluticasona o budesonida.         " +
                                                  "\n En casos graves, se puede requerir oxígeno suplementario y rehabilitación pulmonar. ALIMENTACIÓN: Se recomienda       " +
                                                  "\n el consumo de alimentos que ayuden a fortalecer el sistema respiratorio y reducir la inflamación, tales como pescados " +
                                                  "\n grasos (salmón, atún), ricos en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias, aportando 50% de la  " +
                                                  "\n ingesta diaria recomendada de Omega-3. frutas y verduras de colores vivos (arándanos, fresas, espinacas, brócoli),    " +
                                                  "\n ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las células del daño y fortalecer el    " +
                                                  "\n sistema inmunológico, aportando 70% de la ingesta diaria recomendada de vitamina C. jengibre, que contiene compuestos " +
                                                  "\n con efectos antiinflamatorios que podrían ser beneficiosos para las vías respiratorias, aportando 5% de la ingesta    " +
                                                  "\n diaria recomendada de vitamina C. cúrcuma, con su componente activo, la curcumina, que tiene potentes propiedades     " +
                                                  "\n antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes. Este es solo  " +
                                                  "\n un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad   " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar " +
                                                  "\n a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que" +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n En adultos mayores, la clamidia puede causar complicaciones graves si no se trata adecuadamente.   " +
                                                  "\n HIDRATACIÓN: Es fundamental que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente ocho a diez  " +
                                                  "\n vasos de tamaño regular) para mantener una adecuada función renal y evitar la deshidratación, que puede afectar la    " +
                                                  "\n respuesta inmunológica. La hidratación también ayuda a reducir la inflamación y mejorar la circulación, lo que facilita " +
                                                  "\n la eliminación de toxinas y el transporte de nutrientes esenciales para la recuperación. EJERCICIO: La actividad física " +
                                                  "\n debe ser moderada y adaptada, como caminatas de 30 minutos diarios, ejercicios de bajo impacto como yoga o natación,    " +
                                                  "\n siempre bajo supervisión médica para evitar fatiga extrema. El ejercicio mejora la circulación sanguínea, lo que        " +
                                                  "\n contribuye a una mejor oxigenación de los tejidos y fortalece el sistema inmunológico, ayudando al cuerpo a combatir la " +
                                                  "\n infección. POSIBLE TRATAMIENTO: Para la clamidia en adultos mayores, el tratamiento suele incluir antibióticos como    " +
                                                  "\n azitromicina en dosis única o doxiciclina durante siete días. También se recomienda evitar relaciones sexuales hasta   " +
                                                  "\n completar el tratamiento y que la pareja también reciba tratamiento para prevenir reinfecciones. ALIMENTACIÓN: Se      " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmune    " +
                                                  "\n y mejorar la recuperación, tales como Frutas cítricas (naranjas, limones, vitamina C, 50 mg por 100 g, fortalece el    " +
                                                  "\n sistema inmune y mejora la absorción de hierro), Espinacas (vitamina A y C, 937 µg de vitamina A y 89 mg de vitamina C " +
                                                  "\n por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, ayuda a    " +
                                                  "\n reducir la inflamación y proteger las células), Yogur natural (probióticos, mejora la salud intestinal y fortalece el  " +
                                                  "\n sistema inmune), Pescados grasos (salmón, Omega-3, 2 g por 100 g, ayuda a reducir la inflamación y mejorar la función  " +
                                                  "\n celular). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente   " +
                                                  "\n tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar más de un Diagnóstico de Mi Vida   " +
                                                  "\n para mayor seguridad en el tratamiento. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo," +
                                                  "\n se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n En adultos mayores, la meningitis bacteriana puede ser grave y requiere atención médica inmediata. " +
                                                  "\n HIDRATACIÓN: Es esencial que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente ocho a         " +
                                                  "\n diez vasos de tamaño regular) para mantener una adecuada función cerebral y evitar la deshidratación, que puede      " +
                                                  "\n agravar los síntomas neurológicos. La hidratación es clave para mantener el equilibrio de electrolitos y mejorar     " + 
                                                  "\n la función cognitiva, reduciendo el riesgo de complicaciones neurológicas. EJERCICIO: La actividad física debe       " +
                                                  "\n ser mínima y adaptada, como ejercicios de respiración y movilidad pasiva, evitando esfuerzos excesivos que puedan    " +
                                                  "\n comprometer la recuperación. Movilizar el cuerpo de manera controlada ayuda a prevenir la rigidez muscular y mejora  " +
                                                  "\n la circulación, lo que favorece la recuperación. POSIBLE TRATAMIENTO: Para la meningitis bacteriana en adultos       " +
                                                  "\n mayores, el tratamiento suele incluir antibióticos intravenosos como ceftriaxona o vancomicina, dependiendo del agente    " +
                                                  "\n causal. También se recomienda el uso de corticosteroides para reducir la inflamación cerebral y en algunos casos,         " +
                                                  "\n soporte respiratorio. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales  " +
                                                  "\n para fortalecer el sistema inmune y mejorar la recuperación, tales como Frutas cítricas (naranjas, limones, vitamina C,   " +
                                                  "\n 50 mg por 100 g, fortalece el sistema inmune y mejora la absorción de hierro), Espinacas (vitamina A y C, 937 µg de       " +
                                                  "\n vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E, " +
                                                  "\n 25 mg por 100 g, ayuda a reducir la inflamación y proteger las células), Yogur natural (probióticos, mejora la salud        " +
                                                  "\n intestinal y fortalece el sistema inmune), Pescados grasos (salmón, Omega-3, 2 g por 100 g, ayuda a reducir la inflamación  " +
                                                  "\n y mejorar la función celular). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%   " +
                                                  "\n que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar más de un Diagnóstico   " +
                                                  "\n de Mi Vida para mayor seguridad en el tratamiento. Además, por su salud, si la respuesta del diagnóstico no le satisface    " +
                                                  "\n del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n En adultos mayores, el cáncer requiere un enfoque integral para mejorar la calidad de vida y el tratamiento.          " +
                                                  "\n HIDRATACIÓN: Es recomendable que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente ocho a diez " +
                                                  "\n vasos de tamaño regular) para mantener una adecuada función renal y evitar la deshidratación, que puede afectar la    " +
                                                  "\n tolerancia a los tratamientos oncológicos. La hidratación también ayuda a reducir la fatiga y mejorar la función celular,  " +
                                                  "\n lo que es crucial para la recuperación. EJERCICIO: La actividad física debe ser moderada y adaptada, como caminatas de 30  " +
                                                  "\n minutos diarios, ejercicios de bajo impacto como yoga o natación, siempre bajo supervisión médica para evitar fatiga extrema." +
                                                  "\n El ejercicio mejora la circulación, fortalece los músculos y ayuda a reducir los efectos secundarios del tratamiento, como   " +
                                                  "\n la fatiga y la pérdida de masa muscular. POSIBLE TRATAMIENTO: Para el cáncer en adultos mayores, el tratamiento suele incluir" +
                                                  "\n quimioterapia, radioterapia o inmunoterapia, dependiendo del tipo y estadio del cáncer. También se recomienda un enfoque     " +
                                                  "\n multidisciplinario con apoyo nutricional y psicológico. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en         " +
                                                  "\n antioxidantes, proteínas y nutrientes esenciales para fortalecer el sistema inmune y mejorar la recuperación, tales como     " +
                                                  "\n Frutas cítricas (naranjas, limones, vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora la absorción de hierro)," +
                                                  "\n Espinacas (vitamina A y C, 937 µg de vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la     " +
                                                  "\n respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamación y proteger las células), Yogur   " +
                                                  "\n natural (probióticos, mejora la salud intestinal y fortalece el sistema inmune), Pescados grasos (salmón, Omega-3, 2 g por " +
                                                  "\n 100 g, ayuda a reducir la inflamación y mejorar la función celular). Este es solo un diagnóstico predeterminado lógico,    " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se    " +
                                                  "\n recomienda realizar más de un Diagnóstico de Mi Vida para mayor seguridad en el tratamiento. Además, por su salud, si la   " +
                                                  "\n respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            
                        }
                        if(EstaturaMasculino.equals("1.45-1.70 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n En adultos mayores, la gripe puede ser más severa debido a la disminución de la respuesta inmune con la edad.  " +
                                                  "\n HIDRATACIÓN: Es recomendable que el paciente mantenga una hidratación adecuada, consumiendo entre 2 y 2.5      " +
                                                  "\n litros de agua al día (aproximadamente ocho a diez vasos de tamaño regular) para ayudar a mantener las mucosas " +
                                                  "\n hidratadas y facilitar la expulsión de secreciones. La hidratación también contribuye a la regulación de la    " +
                                                  "\n temperatura corporal y al transporte eficiente de nutrientes esenciales para la recuperación. EJERCICIO: La       " + 
                                                  "\n actividad física debe ser suave y adaptada, como caminatas cortas de 20 a 30 minutos diarios, evitando esfuerzos  " +
                                                  "\n excesivos y asegurando una buena ventilación en el entorno para reducir el riesgo de complicaciones respiratorias." +
                                                  "\n El ejercicio moderado mejora la circulación sanguínea, fortalece el sistema inmunológico y ayuda a reducir la     " +
                                                  "\n fatiga causada por la enfermedad. POSIBLE TRATAMIENTO: Para la gripe en adultos mayores, el tratamiento suele     " +
                                                  "\n incluir antivirales como oseltamivir (Tamiflu) en casos graves o de riesgo, además de medicamentos para aliviar   " +
                                                  "\n síntomas como paracetamol (Tempra) o ibuprofeno (Advil) para la fiebre y el malestar. También se recomienda el    " +
                                                  "\n uso de jarabes expectorantes para facilitar la eliminación de flemas. La vacunación anual contra la influenza     " +
                                                  "\n es clave para la prevención. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en vitamina C y antioxidantes " +
                                                  "\n para fortalecer el sistema inmune, tales como Naranjas y mandarinas (vitamina C, 50 mg por 100 g, fortalece el   " +
                                                  "\n sistema inmune y reduce la duración de los síntomas), Kiwi (vitamina C, 100 mg por 100 g, refuerza el sistema    " +
                                                  "\n inmunológico y mejora la absorción de hierro), Fresas (antioxidantes y vitamina C, 58 mg por 100 g, protegen las " +
                                                  "\n células del daño oxidativo y fortalecen el sistema inmune), Espinacas y brócoli (vitamina A y C, 937 µg de       " +
                                                  "\n vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Miel        " +
                                                  "\n (propiedades antimicrobianas y suavizantes para la garganta, ayuda a reducir la irritación y la tos), Caldos     " +
                                                  "\n calientes (favorecen la hidratación y alivian la congestión nasal). Este es solo un diagnóstico predeterminado   " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea  " +
                                                  "\n el adecuado. Se recomienda realizar más de un Diagnóstico de Mi Vida para mayor seguridad en el tratamiento.     " +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico." +
                                                  "\n Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n En adultos mayores, la neumonía puede ser grave debido a la disminución de la respuesta inmune y la posible   " +
                                                  "\n presencia de enfermedades crónicas. HIDRATACIÓN: Es fundamental que el paciente consuma entre 2 y 2.5 litros  " +
                                                  "\n de agua al día (aproximadamente ocho a diez vasos de tamaño regular) para mantener las vías respiratorias     " +
                                                  "\n hidratadas y facilitar la expulsión de secreciones. La hidratación también ayuda a reducir la inflamación     " +
                                                  "\n pulmonar y mejora la oxigenación de los tejidos, lo que es crucial para la recuperación. EJERCICIO: La        " +
                                                  "\n actividad física debe ser moderada y adaptada, como caminatas cortas de 15 a 20 minutos diarios, evitando     " +
                                                  "\n esfuerzos excesivos y asegurando una buena ventilación en el entorno para reducir el riesgo de complicaciones " +
                                                  "\n respiratorias. Movilizar el cuerpo de manera controlada ayuda a prevenir la rigidez muscular y mejora la      " +
                                                  "\n circulación, lo que favorece la recuperación. POSIBLE TRATAMIENTO: Para la neumonía en adultos mayores, el    " +
                                                  "\n tratamiento suele incluir antibióticos como amoxicilina con ácido clavulánico (Clavulin) o levofloxacino      " +
                                                  "\n (Levaquin) en casos bacterianos, además de medicamentos para aliviar síntomas como paracetamol (Tempra)       " +
                                                  "\n o ibuprofeno (Advil) para la fiebre y el malestar. También se recomienda el uso de broncodilatadores en casos " +
                                                  "\n de dificultad respiratoria y oxigenoterapia en situaciones graves. La vacunación contra neumococo e influenza " +
                                                  "\n es clave para la prevención. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en vitamina C,         " +
                                                  "\n antioxidantes y minerales esenciales para fortalecer el sistema inmune y mejorar la recuperación, tales como  " +
                                                  "\n Naranjas y mandarinas (vitamina C, 50 mg por 100 g, fortalece el sistema inmune y reduce la duración de los   " +
                                                  "\n síntomas), Kiwi (vitamina C, 100 mg por 100 g, refuerza el sistema inmunológico y mejora la absorción de hierro)," +
                                                  "\n Fresas (antioxidantes y vitamina C, 58 mg por 100 g, protegen las células del daño oxidativo y fortalecen el  " +
                                                  "\n sistema inmune), Espinacas y brócoli (vitamina A y C, 937 µg de vitamina A y 89 mg de vitamina C por 100 g,   " +
                                                  "\n esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, ayuda a      " +
                                                  "\n reducir la inflamación y fortalecer el sistema inmunológico), Miel (propiedades antimicrobianas y suavizantes " +
                                                  "\n para la garganta, ayuda a reducir la irritación y la tos), Caldos calientes (favorecen la hidratación y alivian " +
                                                  "\n la congestión nasal). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%" +
                                                  "\n que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar más de un   " +
                                                  "\n Diagnóstico de Mi Vida para mayor seguridad en el tratamiento. Además, por su salud, si la respuesta del        " +
                                                  "\n diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita    " +
                                                  "\n a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n En adultos mayores, la diabetes puede generar complicaciones graves si no se controla adecuadamente.      " +
                                                  "\n HIDRATACIÓN: Es fundamental que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente  " +
                                                  "\n ocho a diez vasos de tamaño regular) para mantener una adecuada función renal y evitar la deshidratación,    " +
                                                  "\n que puede afectar los niveles de glucosa en sangre. La hidratación también ayuda a mejorar la circulación    " +
                                                  "\n y la función metabólica, lo que es clave para el control de la enfermedad. EJERCICIO: La actividad física    " +
                                                  "\n debe ser moderada y adaptada, como caminatas de 30 minutos diarios, ejercicios de bajo impacto como natación " +
                                                  "\n o yoga, siempre bajo supervisión médica para evitar hipoglucemias. El ejercicio mejora la sensibilidad a la  " +
                                                  "\n insulina, ayuda a controlar los niveles de glucosa y fortalece el sistema cardiovascular. POSIBLE TRATAMIENTO: " +
                                                  "\n Para la diabetes en adultos mayores, el tratamiento suele incluir medicamentos como metformina (Glucophage)    " +
                                                  "\n para mejorar la sensibilidad a la insulina, insulina en casos necesarios, y medicamentos como glibenclamida o  " +
                                                  "\n sitagliptina para el control de la glucosa. Es clave mantener un monitoreo constante de los niveles de azúcar  " +
                                                  "\n en sangre y seguir una dieta equilibrada. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en fibra,  " +
                                                  "\n antioxidantes y nutrientes esenciales para el control de la glucosa, tales como Avena (fibra soluble, 4 g por  " +
                                                  "\n 100 g, ayuda a estabilizar los niveles de glucosa), Frijoles (fibra y proteínas, 6 g de fibra por 100 g,       " +
                                                  "\n contribuyen a la regulación del azúcar en sangre), Espinacas (magnesio, 79 mg por 100 g, mejora la sensibilidad " +
                                                  "\n a la insulina), Naranjas (vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora la absorción de     " +
                                                  "\n hierro), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamación y proteger las células), Canela " +
                                                  "\n (compuestos bioactivos, ayuda a mejorar la sensibilidad a la insulina). Este es solo un diagnóstico predeterminado" +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento      " +
                                                  "\n sea el adecuado. Se recomienda realizar más de un Diagnóstico de Mi Vida para mayor seguridad en el tratamiento." +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su " +
                                                  "\n médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n En adultos mayores, el asma puede generar mayor dificultad respiratoria y riesgo de exacerbaciones, por lo que es      " +
                                                  "\n fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que el paciente mantenga una    " +
                                                  "\n hidratación adecuada, consumiendo al menos 2.5 litros de agua al día (aproximadamente diez vasos de tamaño regular)    " +
                                                  "\n para favorecer la eliminación de toxinas y mantener las vías respiratorias hidratadas. EJERCICIO: En cuanto a la       " +
                                                  "\n actividad física, es recomendable realizar ejercicios de bajo impacto, como caminatas de 30 minutos diarios, natación  " +
                                                  "\n o yoga, siempre bajo supervisión médica para evitar complicaciones y fortalecer la función pulmonar. POSIBLE TRATAMIENTO: " +
                                                  "\n El tratamiento estándar para el asma incluye broncodilatadores de alivio rápido, como el salbutamol (Ventolin),           " +
                                                  "\n corticosteroides inhalados para el control a largo plazo, como la fluticasona (Flixotide), y en algunos casos, modificadores " +
                                                  "\n de leucotrienos como el montelukast (Singulair). Es fundamental seguir estrictamente el plan de acción para el asma indicado " +
                                                  "\n por el médico y usar los medicamentos preventivos regularmente. ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo de   " +
                                                  "\n alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como: Pescados grasos        " +
                                                  "\n (salmón, atún): Ricos en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias y pueden ayudar a reducir la   " +
                                                  "\n inflamación de las vías respiratorias, aportando aproximadamente el 50% del requerimiento diario por cada 100 gramos de " +
                                                  "\n salmón. Frutas y verduras de colores vivos (arándanos, fresas, espinacas, brócoli): Ricas en antioxidantes como la      " +
                                                  "\n vitamina C y carotenoides, que pueden proteger las células del daño y fortalecer el sistema inmunológico, aportando cerca   " +
                                                  "\n del 89% del requerimiento diario por cada 100 gramos de fresas. Jengibre: Contiene compuestos con efectos antiinflamatorios " +
                                                  "\n que podrían ser beneficiosos para las vías respiratorias. Cúrcuma: Con su componente activo, la curcumina, también tiene    " +
                                                  "\n potentes propiedades antiinflamatorias y antioxidantes. Este es solo un diagnóstico predeterminado lógico, haberlo consultado " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor " +
                                                  "\n seguridad, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado.  " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n En adultos mayores, el VIH/SIDA puede generar mayor vulnerabilidad a infecciones oportunistas y complicaciones    " +
                                                  "\n sistémicas, por lo que es fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda  " +
                                                  "\n que el paciente mantenga una hidratación adecuada, consumiendo al menos 2.5 litros de agua al día (aproximadamente  " +
                                                  "\n diez vasos de tamaño regular) para favorecer la eliminación de toxinas y mantener el sistema inmunológico fuerte.   " +
                                                  "\n EJERCICIO: En cuanto a la actividad física, es recomendable realizar ejercicios de bajo impacto, como caminatas de  " +
                                                  "\n 30 minutos diarios, natación o yoga, siempre bajo supervisión médica para evitar complicaciones y fortalecer la     " +
                                                  "\n función cardiovascular. POSIBLE TRATAMIENTO: El tratamiento estándar para el VIH/SIDA incluye terapia antirretroviral " +
                                                  "\n combinada (TAR), con medicamentos como tenofovir, emtricitabina y dolutegravir, que ayudan a reducir la carga viral   " +
                                                  "\n y mejorar la función inmunológica. Es fundamental seguir estrictamente el tratamiento indicado por el médico y        " +
                                                  "\n realizar controles periódicos para evaluar la respuesta al tratamiento. ALIMENTACIÓN RECOMENDADA: Se recomienda el    " +
                                                  "\n consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a combatir infecciones, tales como: Frutas      " +
                                                  "\n cítricas (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece el sistema inmunológico y ayuda a reducir  " +
                                                  "\n la duración de infecciones, aportando aproximadamente el 89% del requerimiento diario por cada 100 gramos. Yogur      " +
                                                  "\n natural: Contiene probióticos, que pueden ayudar a mantener el equilibrio de la flora bacteriana y mejorar la respuesta " +
                                                  "\n inmunológica, proporcionando cerca del 20% del requerimiento diario de calcio por cada porción de 150 gramos. Verduras  " +
                                                  "\n de hoja verde (espinaca, acelga, brócoli): Ricas en antioxidantes y vitaminas esenciales para la recuperación, como la  " +
                                                  "\n vitamina A, que contribuye a la regeneración celular y aporta cerca del 56% del requerimiento diario por cada 100       " +
                                                  "\n gramos de espinaca. Omega-3 (salmón, atún, chía): Con propiedades antiinflamatorias que pueden ayudar a reducir la      " +
                                                  "\n inflamación y mejorar la respuesta inmunológica, aportando aproximadamente el 50% del requerimiento diario por cada     " +
                                                  "\n 100 gramos de salmón. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que    " +
                                                  "\n el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda" +
                                                  "\n realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n En adultos mayores, la gonorrea puede presentar síntomas más leves o atípicos, por lo que es fundamental un         " +
                                                  "\n diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que el paciente mantenga una hidratación    " +
                                                  "\n adecuada, consumiendo al menos 2 litros de agua al día (aproximadamente ocho vasos de tamaño regular) para          " +
                                                  "\n favorecer la eliminación de toxinas y mantener el sistema inmunológico fuerte. EJERCICIO: En cuanto a la actividad       " +
                                                  "\n física, es recomendable realizar ejercicio moderado, como caminatas de 30 a 45 minutos diarios, siempre bajo supervisión " +
                                                  "\n médica para evitar complicaciones. POSIBLE TRATAMIENTO: El tratamiento estándar para la gonorrea incluye antibióticos    " +
                                                  "\n como la azitromicina y ceftriaxona, los cuales deben ser administrados bajo prescripción médica. En casos más graves,    " +
                                                  "\n puede requerirse hospitalización para recibir antibióticos intravenosos. Es fundamental que el paciente evite el contacto" +
                                                  "\n íntimo hasta completar el tratamiento y que su pareja también reciba tratamiento para evitar reinfecciones. ALIMENTACIÓN " +
                                                  "\n RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a combatir la        " +
                                                  "\n infección, tales como: Ajo: Posee propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y       " +
                                                  "\n contiene alicina, un compuesto con efectos antibacterianos. Frutas cítricas (naranjas, limones, toronjas): Ricas en      " +
                                                  "\n vitamina C, que fortalece el sistema inmunológico y ayuda a reducir la duración de infecciones, aportando aproximadamente" +
                                                  "\n el 89% del requerimiento diario por cada 100 gramos. Yogur natural: Contiene probióticos, que pueden ayudar a mantener el" +
                                                  "\n equilibrio de la flora bacteriana y mejorar la respuesta inmunológica, proporcionando cerca del 20% del requerimiento    " +
                                                  "\n diario de calcio por cada porción de 150 gramos. Verduras de hoja verde (espinaca, acelga, brócoli): Ricas en            " +
                                                  "\n antioxidantes y vitaminas esenciales para la recuperación, como la vitamina A, que contribuye a la regeneración celular  " +
                                                  "\n y aporta cerca del 56% del requerimiento diario por cada 100 gramos de espinaca. Este es solo un diagnóstico predeterminado" +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean         " +
                                                  "\n completamente correctas. Para mayor seguridad, se recomienda realizar más de un diagnóstico y consultar a un médico para " +
                                                  "\n establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n En adultos mayores, el herpes genital puede causar síntomas más prolongados y complicaciones debido a la disminución " +
                                                  "\n de la respuesta inmunológica. EJERCICIO: Se recomienda actividad física moderada, como caminatas suaves y ejercicios " +
                                                  "\n de movilidad para mejorar la circulación y reducir la fatiga. También es recomendable realizar ejercicios de         " +
                                                  "\n relajación y respiración para reducir el estrés, ya que este puede desencadenar brotes de herpes. HIDRATACIÓN: Es    " +
                                                  "\n esencial el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tamaño regular) para mantener el  " +
                                                  "\n cuerpo hidratado y ayudar a reducir la inflamación. POSIBLE TRATAMIENTO: El herpes genital se trata con antivirales, " +
                                                  "\n como aciclovir, valaciclovir o famciclovir, que ayudan a reducir la duración y gravedad de los brotes. También se    " +
                                                  "\n recomienda el uso de cremas tópicas para aliviar el dolor y la irritación. ALIMENTACIÓN: Se recomienda el consumo de " +
                                                  "\n alimentos que ayuden a fortalecer el sistema inmunológico y reducir la inflamación, tales como arándanos, ricos en   " +
                                                  "\n antioxidantes y vitamina C, aportando 25% de la ingesta diaria recomendada. espinacas, que contienen hierro y vitamina A," +
                                                  "\n esenciales para la recuperación, proporcionando 15% de la ingesta diaria recomendada de hierro. jengibre, con propiedades" +
                                                  "\n antiinflamatorias y antioxidantes, aportando 5% de la ingesta diaria recomendada de vitamina C. cúrcuma, con curcumina,  " +
                                                  "\n que tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de           " +
                                                  "\n antioxidantes. yogur natural, que contiene probióticos beneficiosos para la flora intestinal, proporcionando 15% de la   " +
                                                  "\n ingesta diaria recomendada de calcio. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda" +
                                                  "\n realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n En adultos mayores, la sífilis puede progresar a etapas avanzadas si no se trata adecuadamente, afectando   " +
                                                  "\n órganos internos y el sistema nervioso. EJERCICIO: Se recomienda actividad física moderada, como caminatas  " +
                                                  "\n suaves y ejercicios de movilidad para mejorar la circulación y reducir la fatiga. También es recomendable   " +
                                                  "\n realizar ejercicios de respiración y relajación para mejorar la oxigenación y reducir el estrés. HIDRATACIÓN: " +
                                                  "\n Es fundamental el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tamaño regular) para " +
                                                  "\n mantener el cuerpo hidratado y ayudar a reducir la inflamación. POSIBLE TRATAMIENTO: La sífilis se trata con  " +
                                                  "\n antibióticos, como penicilina G benzatina, que es el tratamiento de primera elección. En casos de alergia a la   " +
                                                  "\n penicilina, se pueden utilizar doxiciclina o ceftriaxona. ALIMENTACIÓN: Se recomienda el consumo de alimentos    " +
                                                  "\n que ayuden a fortalecer el sistema inmunológico y reducir la inflamación, tales como ajo, que contiene alicina   " +
                                                  "\n con propiedades antimicrobianas, aportando 5% de la ingesta diaria recomendada de antioxidantes. jengibre, con   " +
                                                  "\n efectos antiinflamatorios y antioxidantes, aportando 5% de la ingesta diaria recomendada de vitamina C. cúrcuma, " +
                                                  "\n con curcumina, que tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria   " +
                                                  "\n recomendada de antioxidantes. frutas cítricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalece  " +
                                                  "\n el sistema inmunológico, aportando 90 mg por cada 100 g de fruta, lo que representa 100% de la ingesta diaria    " +
                                                  "\n recomendada. yogur natural, que contiene probióticos beneficiosos para la flora intestinal, proporcionando 15%   " +
                                                  "\n de la ingesta diaria recomendada de calcio. Este es solo un diagnóstico predeterminado lógico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas.  " +
                                                  "\n Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento  " +
                                                  "\n adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n En adultos mayores, la tuberculosis puede ser grave debido a la disminución de la función pulmonar y la posibilidad " +
                                                  "\n de complicaciones respiratorias. EJERCICIO: Se recomienda actividad física moderada, como caminatas suaves y        " +
                                                  "\n ejercicios de respiración para mejorar la capacidad pulmonar. También es recomendable realizar ejercicios de        " +
                                                  "\n movilidad y estiramientos para mejorar la circulación y reducir la fatiga. Debido a que la tuberculosis afecta      " +
                                                  "\n la función pulmonar, es importante realizar ejercicios de respiración profunda, como la técnica de respiración      " +
                                                  "\n diafragmática, que ayuda a mejorar la oxigenación y reducir la sensación de falta de aire. También se recomienda    " +
                                                  "\n la respiración con labios fruncidos, que permite controlar la exhalación y mejorar la eficiencia respiratoria.      " +
                                                  "\n HIDRATACIÓN: Es esencial el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tamaño regular)  " +
                                                  "\n para mantener el cuerpo hidratado y ayudar a reducir la inflamación de las vías respiratorias. POSIBLE TRATAMIENTO: " +
                                                  "\n La tuberculosis se trata con antibióticos específicos, como isoniazida, rifampicina, pirazinamida y etambutol,      " +
                                                  "\n administrados en un régimen prolongado de varios meses. En casos graves, se puede requerir hospitalización y oxígeno" +
                                                  "\n suplementario. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema respiratorio y" +   
                                                  "\n reducir la inflamación, tales como pescados grasos (salmón, atún), ricos en ácidos grasos Omega-3, que poseen propiedades" +
                                                  "\n antiinflamatorias, aportando 50% de la ingesta diaria recomendada de Omega-3. frutas y verduras de colores vivos         " +
                                                  "\n (arándanos, fresas, espinacas, brócoli), ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger   " +
                                                  "\n las células del daño y fortalecer el sistema inmunológico, aportando 70% de la ingesta diaria recomendada de vitamina C. " +
                                                  "\n jengibre, que contiene compuestos con efectos antiinflamatorios que podrían ser beneficiosos para las vías respiratorias," +
                                                  "\n aportando 5% de la ingesta diaria recomendada de vitamina C. cúrcuma, con su componente activo, la curcumina, que tiene  " +
                                                  "\n potentes propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes." +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta  " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico " +
                                                  "\n y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida)  " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n En adultos mayores, la artritis puede causar dolor crónico y afectar la movilidad, lo que impacta la calidad      " +
                                                  "\n de vida. HIDRATACIÓN: Es fundamental que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente " +
                                                  "\n ocho a diez vasos de tamaño regular) para mantener la lubricación de las articulaciones y reducir la inflamación. " +
                                                  "\n La hidratación también ayuda a eliminar toxinas y mejorar la circulación, lo que favorece la regeneración de los  " +
                                                  "\n tejidos articulares. EJERCICIO: La actividad física debe ser moderada y adaptada, como ejercicios de bajo impacto " +
                                                  "\n como natación, yoga o caminatas de 30 minutos diarios. El ejercicio fortalece los músculos que rodean las         " +
                                                  "\n articulaciones, mejora la flexibilidad y reduce la rigidez matutina. POSIBLE TRATAMIENTO: Para la artritis en     " +
                                                  "\n adultos mayores, el tratamiento suele incluir antiinflamatorios como ibuprofeno (Advil) o naproxeno, medicamentos " +
                                                  "\n modificadores de la enfermedad como metotrexato, y en algunos casos, terapias biológicas. También se recomienda   " +
                                                  "\n fisioterapia para mejorar la movilidad y reducir el dolor. ALIMENTACIÓN: Se recomienda el consumo de alimentos    " +
                                                  "\n ricos en antioxidantes, ácidos grasos esenciales y minerales para fortalecer las articulaciones y reducir la      " +
                                                  "\n inflamación, tales como Pescados grasos (salmón, Omega-3, 2 g por 100 g, ayuda a reducir la inflamación articular)," +
                                                  "\n Frutas y verduras de colores vivos (arándanos, fresas, espinacas, brócoli, vitamina C, 89 mg por 100 g, fortalece " +
                                                  "\n el sistema inmune y protege las células del daño oxidativo), Jengibre (compuestos antiinflamatorios, ayuda a      " +
                                                  "\n reducir el dolor articular), Cúrcuma (curcumina, 3% de concentración, potente antioxidante y antiinflamatorio),   " +
                                                  "\n Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamación y proteger las células). Este es solo un   " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad  " +
                                                  "\n ni que el tratamiento sea el adecuado. Se recomienda realizar más de un Diagnóstico de Mi Vida para mayor seguridad" +
                                                  "\n en el tratamiento. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda  " +
                                                  "\n consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n En adultos mayores, la tosferina puede ser grave y causar complicaciones respiratorias si no se trata adecuadamente. " +
                                                  "\n HIDRATACIÓN: Es esencial que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente ocho a diez    " +
                                                  "\n vasos de tamaño regular) para mantener las vías respiratorias hidratadas y reducir la viscosidad de las secreciones. " +
                                                  "\n La hidratación también ayuda a calmar la irritación de la garganta y mejorar la función pulmonar. EJERCICIO: La      " +
                                                  "\n actividad física debe ser mínima y adaptada, como ejercicios de respiración y movilidad pasiva, evitando esfuerzos   " +
                                                  "\n excesivos que puedan comprometer la recuperación. Movilizar el cuerpo de manera controlada ayuda a prevenir la       " +
                                                  "\n rigidez muscular y mejora la circulación, lo que favorece la recuperación. POSIBLE TRATAMIENTO: Para la tosferina    " +
                                                  "\n en adultos mayores, el tratamiento suele incluir antibióticos como azitromicina o eritromicina para eliminar la      " +
                                                  "\n bacteria, además de medicamentos para aliviar la tos y reducir la inflamación de las vías respiratorias. También     " +
                                                  "\n se recomienda el uso de humidificadores para mejorar la respiración. ALIMENTACIÓN: Se recomienda el consumo de       " +
                                                  "\n alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmune y mejorar la recuperación," +
                                                  "\n tales como Frutas cítricas (naranjas, limones, vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora     " +
                                                  "\n la absorción de hierro), Espinacas (vitamina A y C, 937 µg de vitamina A y 89 mg de vitamina C por 100 g, esenciales " +
                                                  "\n para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamación " +
                                                  "\n y proteger las células), Miel (propiedades antimicrobianas y suavizantes para la garganta, ayuda a reducir la        " +
                                                  "\n irritación y la tos), Caldos calientes (favorecen la hidratación y alivian la congestión nasal). Este es solo un     " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad     " +
                                                  "\n ni que el tratamiento sea el adecuado. Se recomienda realizar más de un Diagnóstico de Mi Vida para mayor seguridad  " +
                                                  "\n en el tratamiento. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda " +
                                                  "\n consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n En adultos mayores, las paperas pueden causar inflamación severa de las glándulas salivales y generar complicaciones " +
                                                  "\n si no se manejan adecuadamente. HIDRATACIÓN: Es recomendable que el paciente consuma entre 2 y 2.5 litros de agua al " +
                                                  "\n día (aproximadamente ocho a diez vasos de tamaño regular) para mantener una adecuada función renal y evitar la       " +
                                                  "\n deshidratación, que puede afectar la recuperación. La hidratación también ayuda a reducir la inflamación de las      " +
                                                  "\n glándulas y mejorar la producción de saliva. EJERCICIO: La actividad física debe ser moderada y adaptada, como       " +
                                                  "\n caminatas de 30 minutos diarios, ejercicios de bajo impacto como yoga o natación, siempre bajo supervisión médica    " +
                                                  "\n para evitar fatiga extrema. El ejercicio mejora la circulación, fortalece los músculos y ayuda a reducir los efectos " +
                                                  "\n secundarios de la inflamación. POSIBLE TRATAMIENTO: Para las paperas en adultos mayores, el tratamiento suele incluir  " +
                                                  "\n analgésicos como paracetamol o ibuprofeno para reducir el dolor y la fiebre, además de reposo y aislamiento para evitar" +
                                                  "\n la propagación del virus. También se recomienda la aplicación de compresas frías en la zona inflamada. ALIMENTACIÓN:   " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes, proteínas y nutrientes esenciales para fortalecer el     " +
                                                  "\n sistema inmune y mejorar la recuperación, tales como Frutas cítricas (naranjas, limones, vitamina C, 50 mg por 100 g,  " +
                                                  "\n fortalece el sistema inmune y mejora la absorción de hierro), Espinacas (vitamina A y C, 937 µg de vitamina A y 89 mg  " +
                                                  "\n de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, " +
                                                  "\n ayuda a reducir la inflamación y proteger las células), Yogur natural (probióticos, mejora la salud intestinal y fortalece" +
                                                  "\n el sistema inmune), Pescados grasos (salmón, Omega-3, 2 g por 100 g, ayuda a reducir la inflamación y mejorar la función  " +
                                                  "\n celular). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga" +
                                                  "\n esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar más de un Diagnóstico de Mi Vida para mayor " +
                                                  "\n seguridad en el tratamiento. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda" +
                                                  "\n consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n En adultos mayores, el virus del Zika puede causar síntomas más intensos y prolongados, aumentando el riesgo de       " +
                                                  "\n complicaciones neurológicas, por lo que es fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN:   " +
                                                  "\n Se recomienda que el paciente mantenga una hidratación adecuada, consumiendo al menos 2.5 litros de agua al día       " +
                                                  "\n (aproximadamente diez vasos de tamaño regular) para favorecer la eliminación de toxinas y mantener el sistema inmunológico" +
                                                  "\n fuerte. EJERCICIO: En cuanto a la actividad física, es recomendable realizar ejercicios de bajo impacto, como caminatas   " +
                                                  "\n de 30 minutos diarios, natación o yoga, siempre bajo supervisión médica para evitar complicaciones y fortalecer la función" +
                                                  "\n cardiovascular. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral específico para el Zika, por lo que el manejo es  " +
                                                  "\n sintomático. Se recomienda el uso de analgésicos como paracetamol para aliviar la fiebre y el malestar, antihistamínicos  " +
                                                  "\n para reducir el prurito y reposo adecuado. Es fundamental evitar el uso de aspirina y otros antiinflamatorios no esteroides" +
                                                  "\n sin supervisión médica. ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema         " +
                                                  "\n inmunológico y ayuden a combatir la infección, tales como: Frutas cítricas (naranjas, limones, toronjas): Ricas en         " +
                                                  "\n vitamina C, que fortalece el sistema inmunológico y ayuda a reducir la duración de infecciones, aportando aproximadamente  " +
                                                  "\n el 89% del requerimiento diario por cada 100 gramos. Jengibre: Contiene compuestos con efectos antiinflamatorios que pueden " +
                                                  "\n ayudar a reducir la fiebre y el malestar general. Verduras de hoja verde (espinaca, acelga, brócoli): Ricas en antioxidantes" +
                                                  "\n y vitaminas esenciales para la recuperación, como la vitamina A, que contribuye a la regeneración celular y aporta cerca del" +
                                                  "\n 56% del requerimiento diario por cada 100 gramos de espinaca. Omega-3 (salmón, atún, chía): Con propiedades antiinflamatorias" +
                                                  "\n que pueden ayudar a reducir la inflamación y mejorar la respuesta inmunológica, aportando aproximadamente el 50% del      " +
                                                  "\n requerimiento diario por cada 100 gramos de salmón. Este es solo un diagnóstico predeterminado lógico, haberlo consultado " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor " +
                                                  "\n seguridad, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado.  " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n En adultos mayores, el rotavirus puede causar deshidratación severa y complicaciones gastrointestinales, por      " +
                                                  "\n lo que es fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que el paciente  " +
                                                  "\n mantenga una hidratación adecuada, consumiendo al menos 3 litros de agua al día (aproximadamente doce vasos de    " +
                                                  "\n tamaño regular) para compensar la pérdida de líquidos y evitar la deshidratación. EJERCICIO: En cuanto a la       " +
                                                  "\n actividad física, es recomendable realizar ejercicios de bajo impacto, como caminatas suaves de 20 minutos diarios,   " +
                                                  "\n siempre bajo supervisión médica para evitar complicaciones y fortalecer la función digestiva. POSIBLE TRATAMIENTO:    " +
                                                  "\n No existe un tratamiento antiviral específico para el rotavirus, por lo que el manejo es sintomático. Se recomienda   " +
                                                  "\n el uso de soluciones de rehidratación oral para evitar la deshidratación, así como una dieta blanda y de fácil digestión. " +
                                                  "\n En casos graves, puede requerirse hospitalización para administración de líquidos intravenosos. ALIMENTACIÓN RECOMENDADA: " +
                                                  "\n Se recomienda el consumo de alimentos que fortalezcan el sistema digestivo y ayuden a combatir la infección, tales como:  " +
                                                  "\n Plátano: Rico en potasio, que ayuda a reemplazar los electrolitos perdidos debido a la diarrea, aportando aproximadamente " +
                                                  "\n el 12% del requerimiento diario por cada 100 gramos. Yogur natural: Contiene probióticos, que pueden ayudar a restaurar la" +
                                                  "\n flora intestinal y mejorar la digestión, proporcionando cerca del 20% del requerimiento diario de calcio por cada porción " +
                                                  "\n de 150 gramos. Arroz blanco: Fuente de carbohidratos de fácil digestión que ayuda a estabilizar el sistema digestivo y     " +
                                                  "\n aporta energía sin irritar el estómago. Zanahoria: Rica en vitamina A, que contribuye a la regeneración celular y fortalece" +
                                                  "\n la mucosa intestinal, aportando cerca del 56% del requerimiento diario por cada 100 gramos. Este es solo un diagnóstico    " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas " +
                                                  "\n sean completamente correctas. Para mayor seguridad, se recomienda realizar más de un diagnóstico y consultar a un médico   " +
                                                  "\n para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n En adultos mayores, la listeriosis puede causar infecciones graves y afectar el sistema nervioso, por lo que      " +
                                                  "\n es fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que el paciente mantenga" +
                                                  "\n una hidratación adecuada, consumiendo al menos 2.5 litros de agua al día (aproximadamente diez vasos de tamaño    " +
                                                  "\n regular) para favorecer la eliminación de toxinas y mantener el sistema inmunológico fuerte. EJERCICIO: En cuanto " +
                                                  "\n a la actividad física, es recomendable realizar ejercicios de bajo impacto, como caminatas de 30 minutos diarios,    " +
                                                  "\n natación o yoga, siempre bajo supervisión médica para evitar complicaciones y fortalecer la función inmunológica.    " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento estándar para la listeriosis incluye antibióticos como ampicilina y gentamicina, " +
                                                  "\n administrados bajo prescripción médica. En casos graves, puede requerirse hospitalización para administración de     " +
                                                  "\n antibióticos intravenosos. ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema   " +
                                                  "\n inmunológico y ayuden a combatir la infección, tales como: Ajo: Posee propiedades antimicrobianas naturales que pueden  " +
                                                  "\n ayudar a combatir infecciones y contiene alicina, un compuesto con efectos antibacterianos. Frutas cítricas (naranjas,  " +
                                                  "\n limones, toronjas): Ricas en vitamina C, que fortalece el sistema inmunológico y ayuda a reducir la duración de         " +
                                                  "\n infecciones, aportando aproximadamente el 89% del requerimiento diario por cada 100 gramos. Yogur natural: Contiene     " +
                                                  "\n probióticos, que pueden ayudar a mantener el equilibrio de la flora bacteriana y mejorar la respuesta inmunológica,     " +
                                                  "\n proporcionando cerca del 20% del requerimiento diario de calcio por cada porción de 150 gramos. Verduras de hoja verde  " +
                                                  "\n (espinaca, acelga, brócoli): Ricas en antioxidantes y vitaminas esenciales para la recuperación, como la vitamina A,    " +
                                                  "\n que contribuye a la regeneración celular y aporta cerca del 56% del requerimiento diario por cada 100 gramos de espinaca." +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta   " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar más de un   " +
                                                  "\n diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la     " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n En adultos mayores, la shigelosis puede causar diarrea severa y deshidratación, lo que puede ser peligroso      " +
                                                  "\n si no se trata adecuadamente. EJERCICIO: Se recomienda actividad física ligera, como caminatas cortas, evitando " +
                                                  "\n esfuerzos excesivos que puedan agravar la deshidratación. También es recomendable realizar ejercicios de        " +
                                                  "\n movilidad y estiramientos para mejorar la circulación y reducir la fatiga. Debido a que la shigelosis causa     " +
                                                  "\n diarrea y pérdida de líquidos, es importante evitar ejercicios que generen sudoración excesiva y optar por      " +
                                                  "\n movimientos suaves que ayuden a mantener la actividad sin comprometer la hidratación. HIDRATACIÓN: Es crucial el" +
                                                  "\n consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de agua de tamaño regular) para compensar la pérdida" +
                                                  "\n de líquidos y evitar la deshidratación. Además del agua pura, se recomienda el consumo de soluciones de         " +
                                                  "\n rehidratación oral para reponer electrolitos esenciales como sodio y potasio. También es beneficioso ingerir agua " +
                                                  "\n de coco, que contiene electrolitos naturales, y caldos ligeros, que aportan líquidos y minerales esenciales para  " +
                                                  "\n la recuperación. POSIBLE TRATAMIENTO: La shigelosis se trata con antibióticos, como azitromicina, ciprofloxacino  " +
                                                  "\n o ceftriaxona, dependiendo de la gravedad del caso. También se recomienda rehidratación oral y una dieta adecuada." +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a reponer líquidos y fortalecer el sistema digestivo,  " +
                                                  "\n tales como plátanos, ricos en potasio, que ayudan a reemplazar los electrolitos perdidos, aportando 10% de la ingesta " +
                                                  "\n diaria recomendada de potasio. arroz blanco, que es fácil de digerir y ayuda a estabilizar el sistema digestivo,      " +
                                                  "\n proporcionando 20% de la ingesta diaria recomendada de carbohidratos. zanahorias, ricas en vitamina A, que ayudan a   " +
                                                  "\n la recuperación del sistema digestivo, aportando 50% de la ingesta diaria recomendada de vitamina A. agua de coco,    " +
                                                  "\n que ayuda a la hidratación y aporta electrolitos esenciales. yogur natural, que contiene probióticos beneficiosos     " +
                                                  "\n para la flora intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio. Este es solo un diagnóstico  " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas" +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para  " +
                                                  "\n establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n En adultos mayores, la EPOC puede causar dificultad para respirar y fatiga, afectando la calidad de vida.         " +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada, como caminatas suaves y ejercicios de respiración para        " +
                                                  "\n mejorar la capacidad pulmonar. También es recomendable realizar ejercicios de movilidad y estiramientos para      " +
                                                  "\n mejorar la circulación y reducir la fatiga. Debido a que la EPOC afecta la función pulmonar, es importante        " +
                                                  "\n realizar ejercicios de respiración profunda, como la técnica de respiración diafragmática, que ayuda a mejorar    " +
                                                  "\n la oxigenación y reducir la sensación de falta de aire. También se recomienda la respiración con labios fruncidos," +  
                                                  "\n que permite controlar la exhalación y mejorar la eficiencia respiratoria. HIDRATACIÓN: Es esencial el consumo diario  " +
                                                  "\n de 2.5 a 2.75 litros de agua (ocho a diez vasos de agua de tamaño regular) para mantener el cuerpo hidratado y ayudar " +
                                                  "\n a reducir la inflamación de las vías respiratorias. Además del agua pura, se recomienda el consumo de infusiones de   " +
                                                  "\n hierbas, como té de jengibre o manzanilla, que pueden ayudar a reducir la inflamación y mejorar la respiración.       " +
                                                  "\n También es beneficioso ingerir jugos naturales sin azúcar, que aportan antioxidantes y vitaminas esenciales para      " +
                                                  "\n la función pulmonar. POSIBLE TRATAMIENTO: La EPOC se trata con broncodilatadores, como salbutamol, tiotropio o        " +
                                                  "\n formoterol, además de corticosteroides inhalados, como fluticasona o budesonida. En casos graves, se puede requerir   " +
                                                  "\n oxígeno suplementario y rehabilitación pulmonar. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a     " +
                                                  "\n fortalecer el sistema respiratorio y reducir la inflamación, tales como pescados grasos (salmón, atún), ricos en      " +
                                                  "\n ácidos grasos Omega-3, que poseen propiedades antiinflamatorias, aportando 50% de la ingesta diaria recomendada de    " +
                                                  "\n Omega-3. frutas y verduras de colores vivos (arándanos, fresas, espinacas, brócoli), ricas en antioxidantes como la   " +
                                                  "\n vitamina C y carotenoides, que pueden proteger las células del daño y fortalecer el sistema inmunológico, aportando   " +
                                                  "\n 70% de la ingesta diaria recomendada de vitamina C. jengibre, que contiene compuestos con efectos antiinflamatorios   " +
                                                  "\n que podrían ser beneficiosos para las vías respiratorias, aportando 5% de la ingesta diaria recomendada de vitamina C." +
                                                  "\n cúrcuma, con su componente activo, la curcumina, que tiene potentes propiedades antiinflamatorias y antioxidantes,    " +
                                                  "\n proporcionando 3% de la ingesta diaria recomendada de antioxidantes. Este es solo un diagnóstico predeterminado lógico," +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente " +
                                                  "\n correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento" +
                                                  "\n adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n En adultos mayores, la clamidia puede causar síntomas prolongados y complicaciones si no se trata adecuadamente.   " +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada, como caminatas suaves y ejercicios de movilidad para mejorar   " +
                                                  "\n la circulación y reducir la fatiga. También es recomendable realizar ejercicios de relajación y respiración para   " +
                                                  "\n reducir el estrés, ya que este puede afectar la respuesta inmunológica y prolongar la infección. HIDRATACIÓN: Es   " +
                                                  "\n esencial el consumo diario de 2.5 a 2.75 litros de agua (ocho a diez vasos de agua de tamaño regular) para mantener" +
                                                  "\n el cuerpo hidratado y ayudar a reducir la inflamación. Además del agua pura, se recomienda el consumo de jugos     " +
                                                  "\n naturales ricos en vitamina C, como jugo de naranja o toronja, que pueden fortalecer el sistema inmunológico.      " +
                                                  "\n También es beneficioso ingerir caldos ligeros, que aportan líquidos y minerales esenciales para la recuperación.   " +
                                                  "\n POSIBLE TRATAMIENTO: La clamidia se trata con antibióticos, como azitromicina o doxiciclina, administrados en un   " +
                                                  "\n régimen de varios días. También se recomienda el uso de medidas preventivas, como el uso de preservativos y la     " +
                                                  "\n detección temprana en parejas sexuales. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer" +      
                                                  "\n el sistema inmunológico y reducir la inflamación, tales como arándanos, ricos en antioxidantes y vitamina C, aportando      " +
                                                  "\n 25% de la ingesta diaria recomendada. espinacas, que contienen hierro y vitamina A, esenciales para la recuperación,        " +
                                                  "\n proporcionando 15% de la ingesta diaria recomendada de hierro. jengibre, con propiedades antiinflamatorias y antioxidantes, " +
                                                  "\n aportando 5% de la ingesta diaria recomendada de vitamina C. cúrcuma, con curcumina, que tiene propiedades antiinflamatorias" +
                                                  "\n y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes. yogur natural, que contiene probióticos" +
                                                  "\n beneficiosos para la flora intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio. Este es solo un       " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las " +
                                                  "\n respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico  " +
                                                  "\n para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana. " +
                                                  "\n En adultos mayores, la meningitis bacteriana puede ser grave y requiere atención médica inmediata. HIDRATACIÓN:   " +
                                                  "\n Es esencial que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente ocho a diez vasos de     " +
                                                  "\n tamaño regular) para mantener una adecuada función cerebral y evitar la deshidratación, que puede agravar los     " +
                                                  "\n síntomas neurológicos. La hidratación es clave para mantener el equilibrio de electrolitos y mejorar la función   " +
                                                  "\n cognitiva, reduciendo el riesgo de complicaciones neurológicas. EJERCICIO: La actividad física debe ser mínima y  " +
                                                  "\n adaptada, como ejercicios de respiración y movilidad pasiva, evitando esfuerzos excesivos que puedan comprometer  " +
                                                  "\n la recuperación. Movilizar el cuerpo de manera controlada ayuda a prevenir la rigidez muscular y mejora la circulación," +
                                                  "\n lo que favorece la recuperación. POSIBLE TRATAMIENTO: Para la meningitis bacteriana en adultos mayores, el tratamiento " +
                                                  "\n suele incluir antibióticos intravenosos como ceftriaxona o vancomicina, dependiendo del agente causal. También se      " +
                                                  "\n recomienda el uso de corticosteroides para reducir la inflamación cerebral y en algunos casos, soporte respiratorio.   " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el  " +
                                                  "\n sistema inmune y mejorar la recuperación, tales como Frutas cítricas (naranjas, limones, vitamina C, 50 mg por 100 g,  " +
                                                  "\n fortalece el sistema inmune y mejora la absorción de hierro), Espinacas (vitamina A y C, 937 µg de vitamina A y 89 mg  " +
                                                  "\n de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, " +
                                                  "\n ayuda a reducir la inflamación y proteger las células), Yogur natural (probióticos, mejora la salud intestinal y fortalece" +
                                                  "\n el sistema inmune), Pescados grasos (salmón, Omega-3, 2 g por 100 g, ayuda a reducir la inflamación y mejorar la función  " +
                                                  "\n celular). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga" +
                                                  "\n esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar más de un Diagnóstico de Mi Vida para mayor " +
                                                  "\n seguridad en el tratamiento. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda" +
                                                  "\n consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n En adultos mayores, el cáncer requiere un enfoque integral para mejorar la calidad de vida y el tratamiento. " +
                                                  "\n HIDRATACIÓN: Es recomendable que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente ocho a diez vasos  " +
                                                  "\n de tamaño regular) para mantener una adecuada función renal y evitar la deshidratación, que puede afectar la tolerancia a    " +
                                                  "\n los tratamientos oncológicos. La hidratación también ayuda a reducir la fatiga y mejorar la función celular, lo que es crucial" +
                                                  "\n para la recuperación. EJERCICIO: La actividad física debe ser moderada y adaptada, como caminatas de 30 minutos diarios,      " +
                                                  "\n ejercicios de bajo impacto como yoga o natación, siempre bajo supervisión médica para evitar fatiga extrema. El ejercicio     " +
                                                  "\n mejora la circulación, fortalece los músculos y ayuda a reducir los efectos secundarios del tratamiento, como la fatiga y     " +
                                                  "\n la pérdida de masa muscular. POSIBLE TRATAMIENTO: Para el cáncer en adultos mayores, el tratamiento suele incluir quimioterapia," +
                                                  "\n radioterapia o inmunoterapia, dependiendo del tipo y estadio del cáncer. También se recomienda un enfoque multidisciplinario    " +
                                                  "\n con apoyo nutricional y psicológico. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes, proteínas y    " +
                                                  "\n nutrientes esenciales para fortalecer el sistema inmune y mejorar la recuperación, tales como Frutas cítricas (naranjas, limones," +
                                                  "\n vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora la absorción de hierro), Espinacas (vitamina A y C, 937 µg de  " +
                                                  "\n vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg" +
                                                  "\n por 100 g, ayuda a reducir la inflamación y proteger las células), Yogur natural (probióticos, mejora la salud intestinal y      " +
                                                  "\n fortalece el sistema inmune), Pescados grasos (salmón, Omega-3, 2 g por 100 g, ayuda a reducir la inflamación y mejorar la función" +
                                                  "\n celular). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta   " +
                                                  "\n enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar más de un Diagnóstico de Mi Vida para mayor seguridad en " +
                                                  "\n el tratamiento. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico." +
                                                  "\n Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        
                        if(EstaturaMasculino.equals("1.65-1.80 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n En adultos mayores, la gripe puede ser más severa debido a la disminución de la respuesta inmune con la edad.          " +
                                                  "\n HIDRATACIÓN: Es recomendable que el paciente mantenga una hidratación adecuada, consumiendo entre 2 y 2.5 litros       " +
                                                  "\n de agua al día (aproximadamente ocho a diez vasos de tamaño regular) para ayudar a mantener las mucosas hidratadas     " +
                                                  "\n y facilitar la expulsión de secreciones. La hidratación también contribuye a la regulación de la temperatura corporal  " +
                                                  "\n y al transporte eficiente de nutrientes esenciales para la recuperación. EJERCICIO: La actividad física debe ser suave " +
                                                  "\n y adaptada, como caminatas cortas de 20 a 30 minutos diarios, evitando esfuerzos excesivos y asegurando una buena      " +
                                                  "\n ventilación en el entorno para reducir el riesgo de complicaciones respiratorias. El ejercicio moderado mejora la circulación   " +
                                                  "\n sanguínea, fortalece el sistema inmunológico y ayuda a reducir la fatiga causada por la enfermedad. POSIBLE TRATAMIENTO:        " +
                                                  "\n Para la gripe en adultos mayores, el tratamiento suele incluir antivirales como oseltamivir (Tamiflu) en casos graves o de      " +
                                                  "\n riesgo, además de medicamentos para aliviar síntomas como paracetamol (Tempra) o ibuprofeno (Advil) para la fiebre y el malestar." +
                                                  "\n También se recomienda el uso de jarabes expectorantes para facilitar la eliminación de flemas. La vacunación anual contra        " +
                                                  "\n la influenza es clave para la prevención. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en vitamina C y antioxidantes" +
                                                  "\n para fortalecer el sistema inmune, tales como Naranjas y mandarinas (vitamina C, 50 mg por 100 g, fortalece el sistema inmune    " +
                                                  "\n y reduce la duración de los síntomas), Kiwi (vitamina C, 100 mg por 100 g, refuerza el sistema inmunológico y mejora la absorción" +
                                                  "\n de hierro), Fresas (antioxidantes y vitamina C, 58 mg por 100 g, protegen las células del daño oxidativo y fortalecen el sistema " +
                                                  "\n inmune), Espinacas y brócoli (vitamina A y C, 937 µg de vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud     " +
                                                  "\n celular y la respuesta inmune), Miel (propiedades antimicrobianas y suavizantes para la garganta, ayuda a reducir la irritación  " +
                                                  "\n y la tos), Caldos calientes (favorecen la hidratación y alivian la congestión nasal). Este es solo un diagnóstico predeterminado " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se  " +
                                                  "\n recomienda realizar más de un Diagnóstico de Mi Vida para mayor seguridad en el tratamiento. Además, por su salud, si la respuesta" +
                                                  "\n del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida)" +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n En adultos mayores, la neumonía puede ser grave debido a la disminución de la respuesta inmune y la posible     " +
                                                  "\n presencia de enfermedades crónicas. HIDRATACIÓN: Es fundamental que el paciente consuma entre 2 y 2.5 litros    " +
                                                  "\n de agua al día (aproximadamente ocho a diez vasos de tamaño regular) para mantener las vías respiratorias       " +
                                                  "\n hidratadas y facilitar la expulsión de secreciones. La hidratación también ayuda a reducir la inflamación       " +
                                                  "\n pulmonar y mejora la oxigenación de los tejidos, lo que es crucial para la recuperación. EJERCICIO: La actividad  " +
                                                  "\n física debe ser moderada y adaptada, como caminatas cortas de 15 a 20 minutos diarios, evitando esfuerzos         " +
                                                  "\n excesivos y asegurando una buena ventilación en el entorno para reducir el riesgo de complicaciones respiratorias." +
                                                  "\n Movilizar el cuerpo de manera controlada ayuda a prevenir la rigidez muscular y mejora la circulación, lo que     " +
                                                  "\n favorece la recuperación. POSIBLE TRATAMIENTO: Para la neumonía en adultos mayores, el tratamiento suele incluir  " +
                                                  "\n antibióticos como amoxicilina con ácido clavulánico (Clavulin) o levofloxacino (Levaquin) en casos bacterianos,   " +
                                                  "\n además de medicamentos para aliviar síntomas como paracetamol (Tempra) o ibuprofeno (Advil) para la fiebre y el   " +
                                                  "\n malestar. También se recomienda el uso de broncodilatadores en casos de dificultad respiratoria y oxigenoterapia  " +
                                                  "\n en situaciones graves. La vacunación contra neumococo e influenza es clave para la prevención. ALIMENTACIÓN: Se   " +
                                                  "\n recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y minerales esenciales para fortalecer el   " +
                                                  "\n sistema inmune y mejorar la recuperación, tales como Naranjas y mandarinas (vitamina C, 50 mg por 100 g, fortalece  " +
                                                  "\n el sistema inmune y reduce la duración de los síntomas), Kiwi (vitamina C, 100 mg por 100 g, refuerza el sistema    " +
                                                  "\n inmunológico y mejora la absorción de hierro), Fresas (antioxidantes y vitamina C, 58 mg por 100 g, protegen las    " +
                                                  "\n células del daño oxidativo y fortalecen el sistema inmune), Espinacas y brócoli (vitamina A y C, 937 µg de vitamina A  " +
                                                  "\n y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E,        " +
                                                  "\n 25 mg por 100 g, ayuda a reducir la inflamación y fortalecer el sistema inmunológico), Miel (propiedades antimicrobianas" +
                                                  "\n y suavizantes para la garganta, ayuda a reducir la irritación y la tos), Caldos calientes (favorecen la hidratación     " +
                                                  "\n y alivian la congestión nasal). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al   " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar más de un    " +
                                                  "\n Diagnóstico de Mi Vida para mayor seguridad en el tratamiento. Además, por su salud, si la respuesta del diagnóstico  " + 
                                                  "\n no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida)   " +
                                                  "\n y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n En adultos mayores, la diabetes puede generar complicaciones graves si no se controla adecuadamente.  " +
                                                  "\n HIDRATACIÓN: Es fundamental que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente ocho      " +
                                                  "\n a diez vasos de tamaño regular) para mantener una adecuada función renal y evitar la deshidratación, que puede     " +
                                                  "\n afectar los niveles de glucosa en sangre. La hidratación también ayuda a mejorar la circulación y la función       " +
                                                  "\n metabólica, lo que es clave para el control de la enfermedad. EJERCICIO: La actividad física debe ser moderada     " +
                                                  "\n y adaptada, como caminatas de 30 minutos diarios, ejercicios de bajo impacto como natación o yoga, siempre bajo    " +
                                                  "\n supervisión médica para evitar hipoglucemias. El ejercicio mejora la sensibilidad a la insulina, ayuda a controlar " +
                                                  "\n los niveles de glucosa y fortalece el sistema cardiovascular. POSIBLE TRATAMIENTO: Para la diabetes en adultos     " +
                                                  "\n mayores, el tratamiento suele incluir medicamentos como metformina (Glucophage) para mejorar la sensibilidad a la  " +
                                                  "\n insulina, insulina en casos necesarios, y medicamentos como glibenclamida o sitagliptina para el control de la     " +
                                                  "\n glucosa. Es clave mantener un monitoreo constante de los niveles de azúcar en sangre y seguir una dieta equilibrada." +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en fibra, antioxidantes y nutrientes esenciales para el     " +
                                                  "\n control de la glucosa, tales como Avena (fibra soluble, 4 g por 100 g, ayuda a estabilizar los niveles de glucosa),   " + 
                                                  "\n Frijoles (fibra y proteínas, 6 g de fibra por 100 g, contribuyen a la regulación del azúcar en sangre), Espinacas     " +
                                                  "\n (magnesio, 79 mg por 100 g, mejora la sensibilidad a la insulina), Naranjas (vitamina C, 50 mg por 100 g, fortalece   " +
                                                  "\n el sistema inmune y mejora la absorción de hierro), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la        " +
                                                  "\n inflamación y proteger las células), Canela (compuestos bioactivos, ayuda a mejorar la sensibilidad a la insulina).   " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga      " +
                                                  "\n esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar más de un Diagnóstico de Mi Vida para   " +
                                                  "\n mayor seguridad en el tratamiento. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo,    " +
                                                  "\n se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n En adultos mayores, el asma puede generar mayor dificultad respiratoria y riesgo de exacerbaciones, por lo que es     " +
                                                  "\n fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que el paciente mantenga una   " +
                                                  "\n hidratación adecuada, consumiendo al menos 2.5 litros de agua al día (aproximadamente diez vasos de tamaño regular)   " +
                                                  "\n para favorecer la eliminación de toxinas y mantener las vías respiratorias hidratadas, lo que ayuda a reducir la      " +
                                                  "\n viscosidad del moco y facilita la respiración. EJERCICIO: En cuanto a la actividad física, es recomendable realizar   " +
                                                  "\n ejercicios de bajo impacto, como caminatas de 30 minutos diarios, natación o yoga, siempre bajo supervisión médica    " +
                                                  "\n para evitar complicaciones y fortalecer la función pulmonar. También es importante realizar ejercicios de respiración " +
                                                  "\n profunda para mejorar la capacidad pulmonar y reducir la sensación de falta de aire. POSIBLE TRATAMIENTO: El tratamiento" +
                                                  "\n estándar para el asma incluye broncodilatadores de alivio rápido, como el salbutamol (Ventolin), corticosteroides          " +
                                                  "\n inhalados para el control a largo plazo, como la fluticasona (Flixotide), y en algunos casos, modificadores de leucotrienos" +
                                                  "\n como el montelukast (Singulair). Es fundamental seguir estrictamente el plan de acción para el asma indicado por el médico " +
                                                  "\n y usar los medicamentos preventivos regularmente. ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo de alimentos que      " +
                                                  "\n fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como: Pescados grasos (salmón, atún): Ricos   " +
                                                  "\n en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias y pueden ayudar a reducir la inflamación de las vías    " +
                                                  "\n respiratorias, aportando aproximadamente el 50% del requerimiento diario por cada 100 gramos de salmón. Frutas y verduras  " +
                                                  "\n de colores vivos (arándanos, fresas, espinacas, brócoli): Ricas en antioxidantes como la vitamina C y carotenoides, que    " +
                                                  "\n pueden proteger las células del daño y fortalecer el sistema inmunológico, aportando cerca del 89% del requerimiento       " +
                                                  "\n diario por cada 100 gramos de fresas. Jengibre: Contiene compuestos con efectos antiinflamatorios que podrían ser          " +
                                                  "\n beneficiosos para las vías respiratorias, ayudando a reducir la inflamación y mejorar la circulación sanguínea. Cúrcuma:   " +
                                                  "\n Con su componente activo, la curcumina, también tiene potentes propiedades antiinflamatorias y antioxidantes, contribuyendo" +
                                                  "\n a la reducción de la inflamación en los pulmones. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor    " +
                                                  "\n seguridad, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado.  " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n En adultos mayores, el VIH/SIDA puede generar mayor vulnerabilidad a infecciones oportunistas y complicaciones       " +
                                                  "\n sistémicas, por lo que es fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda     " +
                                                  "\n que el paciente mantenga una hidratación adecuada, consumiendo al menos 2.5 litros de agua al día (aproximadamente   " +
                                                  "\n diez vasos de tamaño regular) para favorecer la eliminación de toxinas y mantener el sistema inmunológico fuerte,    " +
                                                  "\n lo que ayuda a reducir la fatiga y mejorar la función renal. EJERCICIO: En cuanto a la actividad física, es recomendable " + 
                                                  "\n realizar ejercicios de bajo impacto, como caminatas de 30 minutos diarios, natación o yoga, siempre bajo supervisión     " +
                                                  "\n médica para evitar complicaciones y fortalecer la función cardiovascular y muscular. También se recomienda ejercicios    " +
                                                  "\n de resistencia para mejorar la masa muscular, ya que el VIH puede causar pérdida de peso y debilitamiento muscular.      " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento estándar para el VIH/SIDA incluye terapia antirretroviral combinada (TAR), con       " +
                                                  "\n medicamentos como tenofovir, emtricitabina y dolutegravir, que ayudan a reducir la carga viral y mejorar la función      " +
                                                  "\n inmunológica. Es fundamental seguir estrictamente el tratamiento indicado por el médico y realizar controles periódicos  " +
                                                  "\n para evaluar la respuesta al tratamiento. ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan  " +
                                                  "\n el sistema inmunológico y ayuden a combatir infecciones, tales como: Frutas cítricas (naranjas, limones, toronjas): Ricas  " +
                                                  "\n en vitamina C, que fortalece el sistema inmunológico y ayuda a reducir la duración de infecciones, aportando aproximadamente " +
                                                  "\n el 89% del requerimiento diario por cada 100 gramos. Yogur natural: Contiene probióticos, que pueden ayudar a mantener el    " +
                                                  "\n equilibrio de la flora bacteriana y mejorar la respuesta inmunológica, proporcionando cerca del 20% del requerimiento diario " +
                                                  "\n de calcio por cada porción de 150 gramos. Verduras de hoja verde (espinaca, acelga, brócoli): Ricas en antioxidantes y       " +
                                                  "\n vitaminas esenciales para la recuperación, como la vitamina A, que contribuye a la regeneración celular y aporta cerca del   " +
                                                  "\n 56% del requerimiento diario por cada 100 gramos de espinaca. Omega-3 (salmón, atún, chía): Con propiedades antiinflamatorias" +
                                                  "\n que pueden ayudar a reducir la inflamación y mejorar la respuesta inmunológica, aportando aproximadamente el 50% del         " +
                                                  "\n requerimiento diario por cada 100 gramos de salmón. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor       " +
                                                  "\n seguridad, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado.     " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n En adultos mayores, la gonorrea puede presentar síntomas más leves o atípicos, por lo que es fundamental un          " +
                                                  "\n diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que el paciente mantenga una hidratación     " +
                                                  "\n adecuada, consumiendo al menos 2 litros de agua al día (aproximadamente ocho vasos de tamaño regular) para favorecer " +
                                                  "\n la eliminación de toxinas y mantener el sistema inmunológico fuerte, lo que ayuda a reducir la inflamación y mejorar " +
                                                  "\n la función renal. EJERCICIO: En cuanto a la actividad física, es recomendable realizar ejercicio moderado, como      " +
                                                  "\n caminatas de 30 a 45 minutos diarios, siempre bajo supervisión médica para evitar complicaciones y fortalecer la        " +
                                                  "\n circulación sanguínea. También se recomienda ejercicios de movilidad para mejorar la función articular y reducir        " +
                                                  "\n la fatiga. POSIBLE TRATAMIENTO: El tratamiento estándar para la gonorrea incluye antibióticos como la azitromicina      " +
                                                  "\n y ceftriaxona, los cuales deben ser administrados bajo prescripción médica. En casos más graves, puede requerirse       " +
                                                  "\n hospitalización para recibir antibióticos intravenosos. Es fundamental que el paciente evite el contacto íntimo hasta   " +
                                                  "\n completar el tratamiento y que su pareja también reciba tratamiento para evitar reinfecciones. ALIMENTACIÓN RECOMENDADA:" +
                                                  "\n Se recomienda el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a combatir la infección, tales   " +
                                                  "\n como: Ajo: Posee propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene alicina, un  " +
                                                  "\n compuesto con efectos antibacterianos. Frutas cítricas (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece   " +
                                                  "\n el sistema inmunológico y ayuda a reducir la duración de infecciones, aportando aproximadamente el 89% del requerimiento   " +
                                                  "\n diario por cada 100 gramos. Yogur natural: Contiene probióticos, que pueden ayudar a mantener el equilibrio de la flora    " +
                                                  "\n bacteriana y mejorar la respuesta inmunológica, proporcionando cerca del 20% del requerimiento diario de calcio por cada   " +
                                                  "\n porción de 150 gramos. Verduras de hoja verde (espinaca, acelga, brócoli): Ricas en antioxidantes y vitaminas esenciales   " +
                                                  "\n para la recuperación, como la vitamina A, que contribuye a la regeneración celular y aporta cerca del 56% del requerimiento" +
                                                  "\n diario por cada 100 gramos de espinaca. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad,    " +
                                                  "\n se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraerHerpes genital." +
                                                  "\n En adultos mayores, el herpes genital puede causar síntomas más prolongados y complicaciones debido a la disminución      " +
                                                  "\n de la respuesta inmunológica. EJERCICIO: Se recomienda actividad física moderada, como caminatas suaves y ejercicios      " +
                                                  "\n de movilidad para mejorar la circulación y reducir la fatiga. También es recomendable realizar ejercicios de relajación   " +
                                                  "\n y respiración para reducir el estrés, ya que este puede desencadenar brotes de herpes. HIDRATACIÓN: Es esencial el consumo" +
                                                  "\n diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tamaño regular) para mantener el cuerpo hidratado y ayudar " +
                                                  "\n a reducir la inflamación. Además del agua pura, se recomienda el consumo de infusiones de hierbas, como té de manzanilla     " +
                                                  "\n o jengibre, que pueden ayudar a reducir la inflamación y mejorar la respuesta inmunológica. También es beneficioso ingerir   " +
                                                  "\n jugos naturales sin azúcar, que aportan antioxidantes y vitaminas esenciales. POSIBLE TRATAMIENTO: El herpes genital se trata" +
                                                  "\n con antivirales, como aciclovir, valaciclovir o famciclovir, que ayudan a reducir la duración y gravedad de los brotes.      " +
                                                  "\n También se recomienda el uso de cremas tópicas para aliviar el dolor y la irritación. ALIMENTACIÓN: Se recomienda el consumo " +
                                                  "\n de alimentos que ayuden a fortalecer el sistema inmunológico y reducir la inflamación, tales como arándanos, ricos en        " +
                                                  "\n antioxidantes y vitamina C, aportando 25% de la ingesta diaria recomendada. espinacas, que contienen hierro y vitamina A,    " +
                                                  "\n esenciales para la recuperación, proporcionando 15% de la ingesta diaria recomendada de hierro. jengibre, con propiedades    " +
                                                  "\n antiinflamatorias y antioxidantes, aportando 5% de la ingesta diaria recomendada de vitamina C. cúrcuma, con curcumina, que  " +
                                                  "\n tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes.    " +
                                                  "\n yogur natural, que contiene probióticos beneficiosos para la flora intestinal, proporcionando 15% de la ingesta diaria       " +
                                                  "\n recomendada de calcio. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico " +
                                                  "\n y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que" +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n En adultos mayores, la sífilis puede progresar a etapas avanzadas si no se trata adecuadamente, afectando    " +
                                                  "\n órganos internos y el sistema nervioso. EJERCICIO: Se recomienda actividad física moderada, como caminatas   " +
                                                  "\n suaves y ejercicios de movilidad para mejorar la circulación y reducir la fatiga. También es recomendable    " +
                                                  "\n realizar ejercicios de respiración y relajación para mejorar la oxigenación y reducir el estrés.             " +
                                                  "\n HIDRATACIÓN: Es fundamental el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tamaño " +
                                                  "\n regular) para mantener el cuerpo hidratado y ayudar a reducir la inflamación. Además del agua pura, se       " +
                                                  "\n recomienda el consumo de jugos naturales ricos en vitamina C, como jugo de naranja o toronja, que pueden     " +
                                                  "\n fortalecer el sistema inmunológico. También es beneficioso ingerir caldos ligeros, que aportan líquidos y    " +
                                                  "\n minerales esenciales para la recuperación. POSIBLE TRATAMIENTO: La sífilis se trata con antibióticos, como   " +
                                                  "\n penicilina G benzatina, que es el tratamiento de primera elección. En casos de alergia a la penicilina, se   " +
                                                  "\n pueden utilizar doxiciclina o ceftriaxona. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a  " +
                                                  "\n fortalecer el sistema inmunológico y reducir la inflamación, tales como ajo, que contiene alicina con propiedades" +
                                                  "\n antimicrobianas, aportando 5% de la ingesta diaria recomendada de antioxidantes. jengibre, con efectos           " +
                                                  "\n antiinflamatorios y antioxidantes, aportando 5% de la ingesta diaria recomendada de vitamina C. cúrcuma, con     " +
                                                  "\n curcumina, que tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria       " +
                                                  "\n recomendada de antioxidantes. frutas cítricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalece  " +
                                                  "\n el sistema inmunológico, aportando 90 mg por cada 100 g de fruta, lo que representa 100% de la ingesta diaria    " +
                                                  "\n recomendada. yogur natural, que contiene probióticos beneficiosos para la flora intestinal, proporcionando 15%   " +
                                                  "\n de la ingesta diaria recomendada de calcio. Este es solo un diagnóstico predeterminado lógico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas.   " +
                                                  "\n Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento   " +
                                                  "\n adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n En adultos mayores, la tuberculosis puede ser grave debido a la disminución de la función pulmonar y la     " +
                                                  "\n posibilidad de complicaciones respiratorias. EJERCICIO: Se recomienda actividad física moderada, como       " +
                                                  "\n caminatas suaves y ejercicios de respiración para mejorar la capacidad pulmonar. También es recomendable    " +
                                                  "\n realizar ejercicios de movilidad y estiramientos para mejorar la circulación y reducir la fatiga. Debido    " +
                                                  "\n a que la tuberculosis afecta la función pulmonar, es importante realizar ejercicios de respiración profunda," +
                                                  "\n como la técnica de respiración diafragmática, que ayuda a mejorar la oxigenación y reducir la sensación de  " +
                                                  "\n falta de aire. También se recomienda la respiración con labios fruncidos, que permite controlar la exhalación    " +
                                                  "\n y mejorar la eficiencia respiratoria. HIDRATACIÓN: Es esencial el consumo diario de 2.5 a 3 litros de agua       " +
                                                  "\n (diez a doce vasos de agua de tamaño regular) para mantener el cuerpo hidratado y ayudar a reducir la inflamación" +
                                                  "\n de las vías respiratorias. Además del agua pura, se recomienda el consumo de infusiones de hierbas, como té      " +
                                                  "\n de jengibre o manzanilla, que pueden ayudar a reducir la inflamación y mejorar la respiración. También es        " +
                                                  "\n beneficioso ingerir jugos naturales sin azúcar, que aportan antioxidantes y vitaminas esenciales para la función " +
                                                  "\n pulmonar. POSIBLE TRATAMIENTO: La tuberculosis se trata con antibióticos específicos, como isoniazida, rifampicina,  " +
                                                  "\n pirazinamida y etambutol, administrados en un régimen prolongado de varios meses. En casos graves, se puede requerir " +
                                                  "\n hospitalización y oxígeno suplementario. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer " +
                                                  "\n el sistema respiratorio y reducir la inflamación, tales como pescados grasos (salmón, atún), ricos en ácidos grasos  " +
                                                  "\n Omega-3, que poseen propiedades antiinflamatorias, aportando 50% de la ingesta diaria recomendada de Omega-3. frutas " +
                                                  "\n y verduras de colores vivos (arándanos, fresas, espinacas, brócoli), ricas en antioxidantes como la vitamina C y     " +
                                                  "\n carotenoides, que pueden proteger las células del daño y fortalecer el sistema inmunológico, aportando 70% de la     " +
                                                  "\n ingesta diaria recomendada de vitamina C. jengibre, que contiene compuestos con efectos antiinflamatorios que podrían" +
                                                  "\n ser beneficiosos para las vías respiratorias, aportando 5% de la ingesta diaria recomendada de vitamina C. cúrcuma,  " +
                                                  "\n con su componente activo, la curcumina, que tiene potentes propiedades antiinflamatorias y antioxidantes, proporcionando" +
                                                  "\n 3% de la ingesta diaria recomendada de antioxidantes. Este es solo un diagnóstico predeterminado lógico, haberlo " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente   " +
                                                  "\n correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el    " +
                                                  "\n tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n En adultos mayores, la artritis puede causar dolor crónico y afectar la movilidad, lo que impacta la calidad de vida.    " +
                                                  "\n HIDRATACIÓN: Es fundamental que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente ocho a diez     " +
                                                  "\n vasos de tamaño regular) para mantener la lubricación de las articulaciones y reducir la inflamación. La hidratación     " +
                                                  "\n también ayuda a eliminar toxinas y mejorar la circulación, lo que favorece la regeneración de los tejidos articulares.   " +
                                                  "\n EJERCICIO: La actividad física debe ser moderada y adaptada, como ejercicios de bajo impacto como natación, yoga o       " +
                                                  "\n caminatas de 30 minutos diarios. El ejercicio fortalece los músculos que rodean las articulaciones, mejora la flexibilidad" +
                                                  "\n y reduce la rigidez matutina. POSIBLE TRATAMIENTO: Para la artritis en adultos mayores, el tratamiento suele incluir      " +
                                                  "\n antiinflamatorios como ibuprofeno (Advil) o naproxeno, medicamentos modificadores de la enfermedad como metotrexato,      " +
                                                  "\n y en algunos casos, terapias biológicas. También se recomienda fisioterapia para mejorar la movilidad y reducir el dolor. " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes, ácidos grasos esenciales y minerales para     " +
                                                  "\n fortalecer las articulaciones y reducir la inflamación, tales como Pescados grasos (salmón, Omega-3, 2 g por 100 g, ayuda   " +
                                                  "\n a reducir la inflamación articular), Frutas y verduras de colores vivos (arándanos, fresas, espinacas, brócoli, vitamina C, " +
                                                  "\n 89 mg por 100 g, fortalece el sistema inmune y protege las células del daño oxidativo), Jengibre (compuestos antiinflamatorios," +
                                                  "\n ayuda a reducir el dolor articular), Cúrcuma (curcumina, 3% de concentración, potente antioxidante y antiinflamatorio),      " +
                                                  "\n Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamación y proteger las células). Este es solo un diagnóstico  " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento   " +
                                                  "\n sea el adecuado. Se recomienda realizar más de un Diagnóstico de Mi Vida para mayor seguridad en el tratamiento. Además,     " +
                                                  "\n por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n En adultos mayores, la tosferina puede ser grave y causar complicaciones respiratorias si no se trata adecuadamente.  " +
                                                  "\n HIDRATACIÓN: Es esencial que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente ocho a diez     " +
                                                  "\n vasos de tamaño regular) para mantener las vías respiratorias hidratadas y reducir la viscosidad de las secreciones.  " +
                                                  "\n La hidratación también ayuda a calmar la irritación de la garganta y mejorar la función pulmonar. EJERCICIO:          " +
                                                  "\n La actividad física debe ser mínima y adaptada, como ejercicios de respiración y movilidad pasiva, evitando esfuerzos " +
                                                  "\n excesivos que puedan comprometer la recuperación. Movilizar el cuerpo de manera controlada ayuda a prevenir la rigidez" +
                                                  "\n muscular y mejora la circulación, lo que favorece la recuperación. POSIBLE TRATAMIENTO: Para la tosferina en adultos  " +
                                                  "\n mayores, el tratamiento suele incluir antibióticos como azitromicina o eritromicina para eliminar la bacteria, además " +
                                                  "\n de medicamentos para aliviar la tos y reducir la inflamación de las vías respiratorias. También se recomienda el uso  " +   
                                                  "\n de humidificadores para mejorar la respiración. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes  " +
                                                  "\n y nutrientes esenciales para fortalecer el sistema inmune y mejorar la recuperación, tales como Frutas cítricas (naranjas,  " +
                                                  "\n limones, vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora la absorción de hierro), Espinacas (vitamina     " +
                                                  "\n A y C, 937 µg de vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune),       " +
                                                  "\n antimicrobianas y suavizantes para la garganta, ayuda a reducir la irritación y la tos), Caldos calientes (favorecen la     " +
                                                  "\n hidratación y alivian la congestión nasal). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no        " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar más   " +
                                                  "\n de un Diagnóstico de Mi Vida para mayor seguridad en el tratamiento. Además, por su salud, si la respuesta del diagnóstico  " +
                                                  "\n no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera" +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n En adultos mayores, las paperas pueden causar inflamación severa de las glándulas salivales y generar complicaciones   " +
                                                  "\n si no se manejan adecuadamente. HIDRATACIÓN: Es recomendable que el paciente consuma entre 2 y 2.5 litros de agua al   " +
                                                  "\n día (aproximadamente ocho a diez vasos de tamaño regular) para mantener una adecuada función renal y evitar la         " +
                                                  "\n deshidratación, que puede afectar la recuperación. La hidratación también ayuda a reducir la inflamación de las        " +
                                                  "\n glándulas y mejorar la producción de saliva. EJERCICIO: La actividad física debe ser moderada y adaptada, como caminatas " +
                                                  "\n de 30 minutos diarios, ejercicios de bajo impacto como yoga o natación, siempre bajo supervisión médica para evitar      " +
                                                  "\n fatiga extrema. El ejercicio mejora la circulación, fortalece los músculos y ayuda a reducir los efectos secundarios     " +
                                                  "\n de la inflamación. POSIBLE TRATAMIENTO: Para las paperas en adultos mayores, el tratamiento suele incluir analgésicos    " +
                                                  "\n como paracetamol o ibuprofeno para reducir el dolor y la fiebre, además de reposo y aislamiento para evitar la propagación " +
                                                  "\n del virus. También se recomienda la aplicación de compresas frías en la zona inflamada. ALIMENTACIÓN: Se recomienda el     " +
                                                  "\n consumo de alimentos ricos en antioxidantes, proteínas y nutrientes esenciales para fortalecer el sistema inmune y mejorar " +
                                                  "\n la recuperación, tales como Frutas cítricas (naranjas, limones, vitamina C, 50 mg por 100 g, fortalece el sistema inmune y " +
                                                  "\n mejora la absorción de hierro), Espinacas (vitamina A y C, 937 µg de vitamina A y 89 mg de vitamina C por 100 g, esenciales" +
                                                  "\n para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamación y     " +
                                                  "\n proteger las células), Yogur natural (probióticos, mejora la salud intestinal y fortalece el sistema inmune), Pescados     " +
                                                  "\n grasos (salmón, Omega-3, 2 g por 100 g, ayuda a reducir la inflamación y mejorar la función celular). Este es solo un      " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que    " +
                                                  "\n el tratamiento sea el adecuado. Se recomienda realizar más de un Diagnóstico de Mi Vida para mayor seguridad en el tratamiento." +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.  " +
                                                  "\n Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n En adultos mayores, el virus del Zika puede causar síntomas más intensos y prolongados, aumentando el riesgo de    " +
                                                  "\n complicaciones neurológicas, por lo que es fundamental un diagnóstico oportuno y tratamiento adecuado.             " +
                                                  "\n HIDRATACIÓN: Se recomienda que el paciente mantenga una hidratación adecuada, consumiendo al menos 2.5 litros de   " +
                                                  "\n agua al día (aproximadamente diez vasos de tamaño regular) para favorecer la eliminación de toxinas y mantener el  " +
                                                  "\n sistema inmunológico fuerte, lo que ayuda a reducir la fatiga y mejorar la función renal. EJERCICIO: En cuanto a   " +
                                                  "\n la actividad física, es recomendable realizar ejercicios de bajo impacto, como caminatas de 30 minutos diarios,    " +
                                                  "\n natación o yoga, siempre bajo supervisión médica para evitar complicaciones y fortalecer la función cardiovascular." +
                                                  "\n También se recomienda ejercicios de movilidad para mejorar la circulación sanguínea y reducir la inflamación.          " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento antiviral específico para el Zika, por lo que el manejo es sintomático.  " +
                                                  "\n Se recomienda el uso de analgésicos como paracetamol para aliviar la fiebre y el malestar, antihistamínicos para       " +
                                                  "\n reducir el prurito y reposo adecuado. Es fundamental evitar el uso de aspirina y otros antiinflamatorios no esteroides " +
                                                  "\n sin supervisión médica. ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema     " +
                                                  "\n inmunológico y ayuden a combatir la infección, tales como: Frutas cítricas (naranjas, limones, toronjas): Ricas en     " +
                                                  "\n vitamina C, que fortalece el sistema inmunológico y ayuda a reducir la duración de infecciones, aportando aproximadamente " +
                                                  "\n el 89% del requerimiento diario por cada 100 gramos. Jengibre: Contiene compuestos con efectos antiinflamatorios que      " +
                                                  "\n pueden ayudar a reducir la fiebre y el malestar general. Verduras de hoja verde (espinaca, acelga, brócoli): Ricas en     " +
                                                  "\n antioxidantes y vitaminas esenciales para la recuperación, como la vitamina A, que contribuye a la regeneración celular   " +
                                                  "\n y aporta cerca del 56% del requerimiento diario por cada 100 gramos de espinaca. Omega-3 (salmón, atún, chía): Con        " +
                                                  "\n propiedades antiinflamatorias que pueden ayudar a reducir la inflamación y mejorar la respuesta inmunológica, aportando   " +
                                                  "\n aproximadamente el 50% del requerimiento diario por cada 100 gramos de salmón. Este es solo un diagnóstico predeterminado " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean          " +
                                                  "\n completamente correctas. Para mayor seguridad, se recomienda realizar más de un diagnóstico y consultar a un médico para  " +
                                                  "\n establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n En adultos mayores, el rotavirus puede causar deshidratación severa y complicaciones gastrointestinales,      " +
                                                  "\n por lo que es fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que      " +
                                                  "\n el paciente mantenga una hidratación adecuada, consumiendo al menos 3 litros de agua al día (aproximadamente  " +
                                                  "\n doce vasos de tamaño regular) para compensar la pérdida de líquidos y evitar la deshidratación.               " +
                                                  "\n EJERCICIO: En cuanto a la actividad física, es recomendable realizar ejercicios de bajo impacto, como caminatas    " +
                                                  "\n suaves de 20 minutos diarios, siempre bajo supervisión médica para evitar complicaciones y fortalecer la función   " +
                                                  "\n digestiva. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral específico para el rotavirus, por lo que el     " +
                                                  "\n manejo es sintomático. Se recomienda el uso de soluciones de rehidratación oral para evitar la deshidratación,     " +
                                                  "\n así como una dieta blanda y de fácil digestión. En casos graves, puede requerirse hospitalización para administración        " +
                                                  "\n de líquidos intravenosos. ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema         " +
                                                  "\n digestivo y ayuden a combatir la infección, tales como: Plátano: Rico en potasio, que ayuda a reemplazar los electrolitos    " +
                                                  "\n perdidos debido a la diarrea, aportando aproximadamente el 12% del requerimiento diario por cada 100 gramos.                 " +
                                                  "\n Yogur natural: Contiene probióticos, que pueden ayudar a restaurar la flora intestinal y mejorar la digestión, proporcionando" +
                                                  "\n cerca del 20% del requerimiento diario de calcio por cada porción de 150 gramos. Arroz blanco: Fuente de carbohidratos de    " +
                                                  "\n fácil digestión que ayuda a estabilizar el sistema digestivo y aporta energía sin irritar el estómago. Zanahoria: Rica en    " +
                                                  "\n vitamina A, que contribuye a la regeneración celular y fortalece la mucosa intestinal, aportando cerca del 56% del           " +
                                                  "\n requerimiento diario por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no           " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor       " +
                                                  "\n seguridad, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado.     " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n En adultos mayores, la listeriosis puede causar infecciones graves y afectar el sistema nervioso, por lo que  " +
                                                  "\n es fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que el paciente     " +
                                                  "\n mantenga una hidratación adecuada, consumiendo al menos 2.5 litros de agua al día (aproximadamente diez vasos    " +
                                                  "\n de tamaño regular) para favorecer la eliminación de toxinas y mantener el sistema inmunológico fuerte.           " +
                                                  "\n EJERCICIO: En cuanto a la actividad física, es recomendable realizar ejercicios de bajo impacto, como caminatas  " +
                                                  "\n de 30 minutos diarios, natación o yoga, siempre bajo supervisión médica para evitar complicaciones y fortalecer  " +
                                                  "\n la función inmunológica. POSIBLE TRATAMIENTO: El tratamiento estándar para la listeriosis incluye antibióticos   " +
                                                  "\n como ampicilina y gentamicina, administrados bajo prescripción médica. En casos graves, puede requerirse         " +
                                                  "\n hospitalización para administración de antibióticos intravenosos. ALIMENTACIÓN RECOMENDADA: Se recomienda el     " +
                                                  "\n consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a combatir la infección, tales como: Ajo:  " +
                                                  "\n Posee propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene alicina, un      " +
                                                  "\n compuesto con efectos antibacterianos. Frutas cítricas (naranjas, limones, toronjas): Ricas en vitamina C, que   " +
                                                  "\n fortalece el sistema inmunológico y ayuda a reducir la duración de infecciones, aportando aproximadamente el 89% " +
                                                  "\n del requerimiento diario por cada 100 gramos. Yogur natural: Contiene probióticos, que pueden ayudar a mantener  " +
                                                  "\n el equilibrio de la flora bacteriana y mejorar la respuesta inmunológica, proporcionando cerca del 20% del       " +
                                                  "\n requerimiento diario de calcio por cada porción de 150 gramos. Verduras de hoja verde (espinaca, acelga, brócoli):  " +
                                                  "\n Ricas en antioxidantes y vitaminas esenciales para la recuperación, como la vitamina A, que contribuye a la         " +
                                                  "\n regeneración celular y aporta cerca del 56% del requerimiento diario por cada 100 gramos de espinaca. Este es solo  " +
                                                  "\n un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad " +
                                                  "\n ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar más de un diagnóstico" +
                                                  "\n y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n En adultos mayores, la shigelosis puede causar diarrea severa y deshidratación, lo que puede ser peligroso si  " +
                                                  "\n no se trata adecuadamente. EJERCICIO: Se recomienda actividad física ligera, como caminatas cortas, evitando   " +
                                                  "\n esfuerzos excesivos que puedan agravar la deshidratación. También es recomendable realizar ejercicios de       " +
                                                  "\n movilidad y estiramientos para mejorar la circulación y reducir la fatiga. Debido a que la shigelosis causa    " +
                                                  "\n diarrea y pérdida de líquidos, es importante evitar ejercicios que generen sudoración excesiva y optar por     " +
                                                  "\n movimientos suaves que ayuden a mantener la actividad sin comprometer la hidratación. HIDRATACIÓN: Es crucial  " +
                                                  "\n el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de agua de tamaño regular) para compensar la    " +
                                                  "\n pérdida de líquidos y evitar la deshidratación. Además del agua pura, se recomienda el consumo de soluciones de    " +
                                                  "\n rehidratación oral para reponer electrolitos esenciales como sodio y potasio. También es beneficioso ingerir agua  " +
                                                  "\n de coco, que contiene electrolitos naturales, y caldos ligeros, que aportan líquidos y minerales esenciales para   " +
                                                  "\n la recuperación. POSIBLE TRATAMIENTO: La shigelosis se trata con antibióticos, como azitromicina, ciprofloxacino   " +
                                                  "\n o ceftriaxona, dependiendo de la gravedad del caso. También se recomienda rehidratación oral y una dieta adecuada.    " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a reponer líquidos y fortalecer el sistema digestivo,  " +
                                                  "\n tales como plátanos, ricos en potasio, que ayudan a reemplazar los electrolitos perdidos, aportando 10% de la ingesta " +
                                                  "\n diaria recomendada de potasio. arroz blanco, que es fácil de digerir y ayuda a estabilizar el sistema digestivo,      " +
                                                  "\n proporcionando 20% de la ingesta diaria recomendada de carbohidratos. zanahorias, ricas en vitamina A, que ayudan     " +
                                                  "\n a la recuperación del sistema digestivo, aportando 50% de la ingesta diaria recomendada de vitamina A. agua de coco,  " +
                                                  "\n que ayuda a la hidratación y aporta electrolitos esenciales. yogur natural, que contiene probióticos beneficiosos para" +
                                                  "\n la flora intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio. Este es solo un diagnóstico    " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las    " +
                                                  "\n respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un  " +
                                                  "\n médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n En adultos mayores, la EPOC puede causar dificultad para respirar y fatiga, afectando la calidad de vida.           " +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada, como caminatas suaves y ejercicios de respiración para mejorar  " +
                                                  "\n la capacidad pulmonar. También es recomendable realizar ejercicios de movilidad y estiramientos para mejorar la     " +
                                                  "\n circulación y reducir la fatiga. Debido a que la EPOC afecta la función pulmonar, es importante realizar ejercicios " +
                                                  "\n de respiración profunda, como la técnica de respiración diafragmática, que ayuda a mejorar la oxigenación y reducir " +
                                                  "\n la sensación de falta de aire. También se recomienda la respiración con labios fruncidos, que permite controlar la  " +
                                                  "\n exhalación y mejorar la eficiencia respiratoria. HIDRATACIÓN: Es esencial el consumo diario de 2.5 a 2.75 litros de    " +
                                                  "\n agua (ocho a diez vasos de agua de tamaño regular) para mantener el cuerpo hidratado y ayudar a reducir la inflamación " +
                                                  "\n de las vías respiratorias. Además del agua pura, se recomienda el consumo de infusiones de hierbas, como té de jengibre" +
                                                  "\n o manzanilla, que pueden ayudar a reducir la inflamación y mejorar la respiración. También es beneficioso ingerir jugos" +
                                                  "\n naturales sin azúcar, que aportan antioxidantes y vitaminas esenciales para la función pulmonar. POSIBLE TRATAMIENTO:  " +
                                                  "\n La EPOC se trata con broncodilatadores, como salbutamol, tiotropio o formoterol, además de corticosteroides inhalados, " +
                                                  "\n como fluticasona o budesonida. En casos graves, se puede requerir oxígeno suplementario y rehabilitación pulmonar.     " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema respiratorio y reducir la       " +
                                                  "\n inflamación, tales como pescados grasos (salmón, atún), ricos en ácidos grasos Omega-3, que poseen propiedades         " +
                                                  "\n antiinflamatorias, aportando 50% de la ingesta diaria recomendada de Omega-3. frutas y verduras de colores vivos       " +
                                                  "\n (arándanos, fresas, espinacas, brócoli), ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger " +
                                                  "\n las células del daño y fortalecer el sistema inmunológico, aportando 70% de la ingesta diaria recomendada de vitamina C.  " +
                                                  "\n jengibre, que contiene compuestos con efectos antiinflamatorios que podrían ser beneficiosos para las vías respiratorias, " +
                                                  "\n aportando 5% de la ingesta diaria recomendada de vitamina C. cúrcuma, con su componente activo, la curcumina, que tiene   " +
                                                  "\n potentes propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes." +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico" +
                                                  "\n y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n En adultos mayores, la clamidia puede causar síntomas prolongados y complicaciones si no se trata adecuadamente.      " +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada, como caminatas suaves y ejercicios de movilidad para mejorar la   " +
                                                  "\n circulación y reducir la fatiga. También es recomendable realizar ejercicios de relajación y respiración para reducir " +
                                                  "\n el estrés, ya que este puede afectar la respuesta inmunológica y prolongar la infección. HIDRATACIÓN: Es esencial el  " +
                                                  "\n consumo diario de 2.5 a 2.75 litros de agua (ocho a diez vasos de agua de tamaño regular) para mantener el cuerpo     " +
                                                  "\n hidratado y ayudar a reducir la inflamación. Además del agua pura, se recomienda el consumo de jugos naturales ricos  " +
                                                  "\n en vitamina C, como jugo de naranja o toronja, que pueden fortalecer el sistema inmunológico. También es beneficioso  " +
                                                  "\n ingerir caldos ligeros, que aportan líquidos y minerales esenciales para la recuperación. POSIBLE TRATAMIENTO: La clamidia" +
                                                  "\n se trata con antibióticos, como azitromicina o doxiciclina, administrados en un régimen de varios días. También se        " +
                                                  "\n recomienda el uso de medidas preventivas, como el uso de preservativos y la detección temprana en parejas sexuales.       " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmunológico y reducir la inflamación," +
                                                  "\n tales como arándanos, ricos en antioxidantes y vitamina C, aportando 25% de la ingesta diaria recomendada. espinacas,     " +
                                                  "\n que contienen hierro y vitamina A, esenciales para la recuperación, proporcionando 15% de la ingesta diaria recomendada   " +
                                                  "\n de hierro. jengibre, con propiedades antiinflamatorias y antioxidantes, aportando 5% de la ingesta diaria recomendada de     " +
                                                  "\n vitamina C. cúrcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta " +
                                                  "\n diaria recomendada de antioxidantes. yogur natural, que contiene probióticos beneficiosos para la flora intestinal,          " +
                                                  "\n proporcionando 15% de la ingesta diaria recomendada de calcio. Este es solo un diagnóstico predeterminado lógico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas.    " +
                                                  "\n Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado.     " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n En adultos mayores, la meningitis bacteriana puede ser grave y requiere atención médica inmediata.   " +
                                                  "\n HIDRATACIÓN: Es esencial que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente ocho     " +
                                                  "\n a diez vasos de tamaño regular) para mantener una adecuada función cerebral y evitar la deshidratación, que    " +
                                                  "\n puede agravar los síntomas neurológicos. La hidratación es clave para mantener el equilibrio de electrolitos   " +
                                                  "\n y mejorar la función cognitiva, reduciendo el riesgo de complicaciones neurológicas. EJERCICIO: La actividad   " +
                                                  "\n física debe ser mínima y adaptada, como ejercicios de respiración y movilidad pasiva, evitando esfuerzos excesivos      " +
                                                  "\n que puedan comprometer la recuperación. Movilizar el cuerpo de manera controlada ayuda a prevenir la rigidez muscular   " +
                                                  "\n y mejora la circulación, lo que favorece la recuperación. POSIBLE TRATAMIENTO: Para la meningitis bacteriana en adultos " +
                                                  "\n mayores, el tratamiento suele incluir antibióticos intravenosos como ceftriaxona o vancomicina, dependiendo del agente  " +
                                                  "\n causal. También se recomienda el uso de corticosteroides para reducir la inflamación cerebral y en algunos casos, soporte  " +
                                                  "\n respiratorio. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para      " +
                                                  "\n fortalecer el sistema inmune y mejorar la recuperación, tales como Frutas cítricas (naranjas, limones, vitamina C, 50 mg   " +
                                                  "\n por 100 g, fortalece el sistema inmune y mejora la absorción de hierro), Espinacas (vitamina A y C, 937 µg de vitamina A   " +
                                                  "\n y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg por " +
                                                  "\n 100 g, ayuda a reducir la inflamación y proteger las células), Yogur natural (probióticos, mejora la salud intestinal y    " +
                                                  "\n fortalece el sistema inmune), Pescados grasos (salmón, Omega-3, 2 g por 100 g, ayuda a reducir la inflamación y mejorar la   " +
                                                  "\n función celular). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente " +
                                                  "\n tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar más de un Diagnóstico de Mi Vida para    " +
                                                  "\n mayor seguridad en el tratamiento. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se        " +
                                                  "\n recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n En adultos mayores, el cáncer requiere un enfoque integral para mejorar la calidad de vida y el tratamiento.   " +
                                                  "\n HIDRATACIÓN: Es recomendable que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente ocho a diez vasos     " +
                                                  "\n de tamaño regular) para mantener una adecuada función renal y evitar la deshidratación, que puede afectar la tolerancia a los   " +
                                                  "\n tratamientos oncológicos. La hidratación también ayuda a reducir la fatiga y mejorar la función celular, lo que es crucial      " +
                                                  "\n para la recuperación. EJERCICIO: La actividad física debe ser moderada y adaptada, como caminatas de 30 minutos diarios,        " +
                                                  "\n ejercicios de bajo impacto como yoga o natación, siempre bajo supervisión médica para evitar fatiga extrema. El ejercicio       " +
                                                  "\n mejora la circulación, fortalece los músculos y ayuda a reducir los efectos secundarios del tratamiento, como la fatiga y       " +
                                                  "\n la pérdida de masa muscular. POSIBLE TRATAMIENTO: Para el cáncer en adultos mayores, el tratamiento suele incluir quimioterapia," +
                                                  "\n radioterapia o inmunoterapia, dependiendo del tipo y estadio del cáncer. También se recomienda un enfoque multidisciplinario con" +
                                                  "\n apoyo nutricional y psicológico. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes, proteínas y         " +
                                                  "\n nutrientes esenciales para fortalecer el sistema inmune y mejorar la recuperación, tales como Frutas cítricas (naranjas, limones," +
                                                  "\n vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora la absorción de hierro), Espinacas (vitamina A y C, 937 µg de  " +
                                                  "\n vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E,     " +
                                                  "\n 25 mg por 100 g, ayuda a reducir la inflamación y proteger las células), Yogur natural (probióticos, mejora la salud intestinal " +
                                                  "\n y fortalece el sistema inmune), Pescados grasos (salmón, Omega-3, 2 g por 100 g, ayuda a reducir la inflamación y mejorar la    " +
                                                  "\n función celular). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente    " +
                                                  "\n tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar más de un Diagnóstico de Mi Vida para mayor " +
                                                  "\n seguridad en el tratamiento. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar" +
                                                  "\n a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        if(EstaturaMasculino.equals("1.55-1.70 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n En adultos mayores, la gripe puede ser más severa debido a la disminución de la respuesta inmune con la edad.       " +
                                                  "\n HIDRATACIÓN: Es recomendable que el paciente mantenga una hidratación adecuada, consumiendo entre 2 y 2.5 litros de   " +
                                                  "\n agua al día (aproximadamente ocho a diez vasos de tamaño regular) para ayudar a mantener las mucosas hidratadas y     " +
                                                  "\n facilitar la expulsión de secreciones. La hidratación también contribuye a la regulación de la temperatura corporal   " +
                                                  "\n y al transporte eficiente de nutrientes esenciales para la recuperación. EJERCICIO: La actividad física debe ser suave  " +
                                                  "\n y adaptada, como caminatas cortas de 20 a 30 minutos diarios, evitando esfuerzos excesivos y asegurando una buena       " +
                                                  "\n ventilación en el entorno para reducir el riesgo de complicaciones respiratorias. El ejercicio moderado mejora la       " +
                                                  "\n circulación sanguínea, fortalece el sistema inmunológico y ayuda a reducir la fatiga causada por la enfermedad.         " +
                                                  "\n POSIBLE TRATAMIENTO: Para la gripe en adultos mayores, el tratamiento suele incluir antivirales como oseltamivir (Tamiflu) " +
                                                  "\n en casos graves o de riesgo, además de medicamentos para aliviar síntomas como paracetamol (Tempra) o ibuprofeno (Advil)   " +
                                                  "\n para la fiebre y el malestar. También se recomienda el uso de jarabes expectorantes para facilitar la eliminación de       " +
                                                  "\n flemas. La vacunación anual contra la influenza es clave para la prevención. ALIMENTACIÓN: Se recomienda el consumo        " +
                                                  "\n de alimentos ricos en vitamina C y antioxidantes para fortalecer el sistema inmune, tales como Naranjas y mandarinas       " +
                                                  "\n (vitamina C, 50 mg por 100 g, fortalece el sistema inmune y reduce la duración de los síntomas), Kiwi (vitamina C,         " +
                                                  "\n 100 mg por 100 g, refuerza el sistema inmunológico y mejora la absorción de hierro), Fresas (antioxidantes y vitamina C,   " +
                                                  "\n 58 mg por 100 g, protegen las células del daño oxidativo y fortalecen el sistema inmune), Espinacas y brócoli (vitamina A  " +
                                                  "\n y C, 937 µg de vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune),        " +
                                                  "\n Miel (propiedades antimicrobianas y suavizantes para la garganta, ayuda a reducir la irritación y la tos), Caldos          " +
                                                  "\n calientes (favorecen la hidratación y alivian la congestión nasal). Este es solo un diagnóstico predeterminado lógico,     " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado.       " +
                                                  "\n Se recomienda realizar más de un Diagnóstico de Mi Vida para mayor seguridad en el tratamiento. Además, por su salud,      " +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece     " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n En adultos mayores, la neumonía puede ser grave debido a la disminución de la respuesta inmune y la posible presencia  " +
                                                  "\n de enfermedades crónicas. HIDRATACIÓN: Es fundamental que el paciente consuma entre 2 y 2.5 litros de agua al día      " +
                                                  "\n (aproximadamente ocho a diez vasos de tamaño regular) para mantener las vías respiratorias hidratadas y facilitar la   " +
                                                  "\n expulsión de secreciones. La hidratación también ayuda a reducir la inflamación pulmonar y mejora la oxigenación de    " +
                                                  "\n los tejidos, lo que es crucial para la recuperación. EJERCICIO: La actividad física debe ser moderada y adaptada, como " +
                                                  "\n caminatas cortas de 15 a 20 minutos diarios, evitando esfuerzos excesivos y asegurando una buena ventilación en el     " +
                                                  "\n entorno para reducir el riesgo de complicaciones respiratorias. Movilizar el cuerpo de manera controlada ayuda a prevenir   " +
                                                  "\n la rigidez muscular y mejora la circulación, lo que favorece la recuperación. POSIBLE TRATAMIENTO: Para la neumonía en      " +
                                                  "\n adultos mayores, el tratamiento suele incluir antibióticos como amoxicilina con ácido clavulánico (Clavulin) o levofloxacino" +
                                                  "\n (Levaquin) en casos bacterianos, además de medicamentos para aliviar síntomas como paracetamol (Tempra) o ibuprofeno        " +
                                                  "\n (Advil) para la fiebre y el malestar. También se recomienda el uso de broncodilatadores en casos de dificultad respiratoria " +
                                                  "\n y oxigenoterapia en situaciones graves. La vacunación contra neumococo e influenza es clave para la prevención.             " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y minerales esenciales para          " +
                                                  "\n fortalecer el sistema inmune y mejorar la recuperación, tales como Naranjas y mandarinas (vitamina C, 50 mg por 100 g,      " +
                                                  "\n fortalece el sistema inmune y reduce la duración de los síntomas), Kiwi (vitamina C, 100 mg por 100 g, refuerza el sistema  " +
                                                  "\n inmunológico y mejora la absorción de hierro), Fresas (antioxidantes y vitamina C, 58 mg por 100 g, protegen las células    " +
                                                  "\n del daño oxidativo y fortalecen el sistema inmune), Espinacas y brócoli (vitamina A y C, 937 µg de vitamina A y 89 mg de    " +
                                                  "\n vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg por 100 g,      " +
                                                  "\n ayuda a reducir la inflamación y fortalecer el sistema inmunológico), Miel (propiedades antimicrobianas y suavizantes       " +
                                                  "\n para la garganta, ayuda a reducir la irritación y la tos), Caldos calientes (favorecen la hidratación y alivian la          " +
                                                  "\n congestión nasal). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el        " +
                                                  "\n paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar más de un Diagnóstico de       " +
                                                  "\n Mi Vida para mayor seguridad en el tratamiento. Además, por su salud, si la respuesta del diagnóstico no le satisface       " +
                                                  "\n del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n En adultos mayores, la diabetes puede generar complicaciones graves si no se controla adecuadamente.  " +
                                                  "\n HIDRATACIÓN: Es fundamental que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente ocho       " +
                                                  "\n a diez vasos de tamaño regular) para mantener una adecuada función renal y evitar la deshidratación, que puede      " +
                                                  "\n afectar los niveles de glucosa en sangre. La hidratación también ayuda a mejorar la circulación y la función        " +
                                                  "\n metabólica, lo que es clave para el control de la enfermedad. EJERCICIO: La actividad física debe ser moderada      " +
                                                  "\n y adaptada, como caminatas de 30 minutos diarios, ejercicios de bajo impacto como natación o yoga, siempre bajo     " +
                                                  "\n supervisión médica para evitar hipoglucemias. El ejercicio mejora la sensibilidad a la insulina, ayuda a controlar  " +
                                                  "\n los niveles de glucosa y fortalece el sistema cardiovascular. POSIBLE TRATAMIENTO: Para la diabetes en adultos mayores,    " +
                                                  "\n el tratamiento suele incluir medicamentos como metformina (Glucophage) para mejorar la sensibilidad a la insulina,         " +
                                                  "\n insulina en casos necesarios, y medicamentos como glibenclamida o sitagliptina para el control de la glucosa. Es           " +
                                                  "\n clave mantener un monitoreo constante de los niveles de azúcar en sangre y seguir una dieta equilibrada. ALIMENTACIÓN:     " +
                                                  "\n Se recomienda el consumo de alimentos ricos en fibra, antioxidantes y nutrientes esenciales para el control de la glucosa, " +
                                                  "\n tales como Avena (fibra soluble, 4 g por 100 g, ayuda a estabilizar los niveles de glucosa), Frijoles (fibra y proteínas,  " +
                                                  "\n 6 g de fibra por 100 g, contribuyen a la regulación del azúcar en sangre), Espinacas (magnesio, 79 mg por 100 g, mejora    " +
                                                  "\n la sensibilidad a la insulina), Naranjas (vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora la absorción   " +
                                                  "\n de hierro), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamación y proteger las células), Canela         " +
                                                  "\n (compuestos bioactivos, ayuda a mejorar la sensibilidad a la insulina). Este es solo un diagnóstico predeterminado lógico, " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se    " +
                                                  "\n recomienda realizar más de un Diagnóstico de Mi Vida para mayor seguridad en el tratamiento. Además, por su salud, si la   " +
                                                  "\n respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n En adultos mayores, el asma puede generar mayor dificultad respiratoria y riesgo de exacerbaciones, por lo que es fundamental   " +
                                                  "\n un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que el paciente mantenga una hidratación adecuada,   " +
                                                  "\n consumiendo al menos 2.5 litros de agua al día (aproximadamente diez vasos de tamaño regular) para favorecer la eliminación de  " +
                                                  "\n toxinas y mantener las vías respiratorias hidratadas, lo que ayuda a reducir la viscosidad del moco y facilita la respiración.  " +
                                                  "\n EJERCICIO: En cuanto a la actividad física, es recomendable realizar ejercicios de bajo impacto, como caminatas de 30 minutos   " +
                                                  "\n diarios, natación o yoga, siempre bajo supervisión médica para evitar complicaciones y fortalecer la función pulmonar. También  " +
                                                  "\n es importante realizar ejercicios de respiración profunda para mejorar la capacidad pulmonar y reducir la sensación de falta de " +
                                                  "\n aire. POSIBLE TRATAMIENTO: El tratamiento estándar para el asma incluye broncodilatadores de alivio rápido, como el salbutamol  " +
                                                  "\n (Ventolin), corticosteroides inhalados para el control a largo plazo, como la fluticasona (Flixotide), y en algunos casos,      " +
                                                  "\n modificadores de leucotrienos como el montelukast (Singulair). Es fundamental seguir estrictamente el plan de acción para el    " +
                                                  "\n asma indicado por el médico y usar los medicamentos preventivos regularmente. ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo" +
                                                  "\n de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como: Pescados grasos (salmón, atún):" +
                                                  "\n Ricos en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias y pueden ayudar a reducir la inflamación de las vías  " +
                                                  "\n respiratorias, aportando aproximadamente el 50% del requerimiento diario por cada 100 gramos de salmón. Frutas y verduras de   " +
                                                  "\n colores vivos (arándanos, fresas, espinacas, brócoli): Ricas en antioxidantes como la vitamina C y carotenoides, que pueden    " +
                                                  "\n proteger las células del daño y fortalecer el sistema inmunológico, aportando cerca del 89% del requerimiento diario por cada  " +
                                                  "\n 100 gramos de fresas. Jengibre: Contiene compuestos con efectos antiinflamatorios que podrían ser beneficiosos para las vías   " +
                                                  "\n respiratorias, ayudando a reducir la inflamación y mejorar la circulación sanguínea. Cúrcuma: Con su componente activo, la     " +
                                                  "\n curcumina, también tiene potentes propiedades antiinflamatorias y antioxidantes, contribuyendo a la reducción de la inflamación" +
                                                  "\n en los pulmones. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente   " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar más    " +
                                                  "\n de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la     " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n En adultos mayores, el VIH/SIDA puede generar mayor vulnerabilidad a infecciones oportunistas y complicaciones      " +
                                                  "\n sistémicas, por lo que es fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda    " +
                                                  "\n que el paciente mantenga una hidratación adecuada, consumiendo al menos 2.5 litros de agua al día (aproximadamente  " +
                                                  "\n diez vasos de tamaño regular) para favorecer la eliminación de toxinas y mantener el sistema inmunológico fuerte,   " +
                                                  "\n lo que ayuda a reducir la fatiga y mejorar la función renal. EJERCICIO: En cuanto a la actividad física, es         " +
                                                  "\n recomendable realizar ejercicios de bajo impacto, como caminatas de 30 minutos diarios, natación o yoga, siempre    " +
                                                  "\n bajo supervisión médica para evitar complicaciones y fortalecer la función cardiovascular y muscular. También se    " +
                                                  "\n recomienda ejercicios de resistencia para mejorar la masa muscular, ya que el VIH puede causar pérdida de peso y    " +
                                                  "\n debilitamiento muscular. POSIBLE TRATAMIENTO: El tratamiento estándar para el VIH/SIDA incluye terapia antirretroviral  " +
                                                  "\n combinada (TAR), con medicamentos como tenofovir, emtricitabina y dolutegravir, que ayudan a reducir la carga viral y   " +
                                                  "\n mejorar la función inmunológica. Es fundamental seguir estrictamente el tratamiento indicado por el médico y realizar   " +
                                                  "\n controles periódicos para evaluar la respuesta al tratamiento. ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo de    " +
                                                  "\n alimentos que fortalezcan el sistema inmunológico y ayuden a combatir infecciones, tales como: Frutas cítricas (naranjas," +
                                                  "\n limones, toronjas): Ricas en vitamina C, que fortalece el sistema inmunológico y ayuda a reducir la duración de         " +
                                                  "\n infecciones, aportando aproximadamente el 89% del requerimiento diario por cada 100 gramos. Yogur natural: Contiene     " +
                                                  "\n probióticos, que pueden ayudar a mantener el equilibrio de la flora bacteriana y mejorar la respuesta inmunológica,     " +
                                                  "\n proporcionando cerca del 20% del requerimiento diario de calcio por cada porción de 150 gramos. Verduras de hoja verde  " +
                                                  "\n (espinaca, acelga, brócoli): Ricas en antioxidantes y vitaminas esenciales para la recuperación, como la vitamina A,    " +
                                                  "\n que contribuye a la regeneración celular y aporta cerca del 56% del requerimiento diario por cada 100 gramos de espinaca." +
                                                  "\n Omega-3 (salmón, atún, chía): Con propiedades antiinflamatorias que pueden ayudar a reducir la inflamación y mejorar la  " +
                                                  "\n respuesta inmunológica, aportando aproximadamente el 50% del requerimiento diario por cada 100 gramos de salmón. Este es " +
                                                  "\n solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad " +
                                                  "\n ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar más de un diagnóstico y " +
                                                  "\n consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y  " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n En adultos mayores, la gonorrea puede presentar síntomas más leves o atípicos, por lo que es fundamental un          " +
                                                  "\n diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que el paciente mantenga una hidratación     " +
                                                  "\n adecuada, consumiendo al menos 2 litros de agua al día (aproximadamente ocho vasos de tamaño regular) para           " +
                                                  "\n favorecer la eliminación de toxinas y mantener el sistema inmunológico fuerte, lo que ayuda a reducir la inflamación " +
                                                  "\n y mejorar la función renal. EJERCICIO: En cuanto a la actividad física, es recomendable realizar ejercicio moderado, " +
                                                  "\n como caminatas de 30 a 45 minutos diarios, siempre bajo supervisión médica para evitar complicaciones y fortalecer   " +
                                                  "\n la circulación sanguínea. También se recomienda ejercicios de movilidad para mejorar la función articular y reducir  " +
                                                  "\n la fatiga. POSIBLE TRATAMIENTO: El tratamiento estándar para la gonorrea incluye antibióticos como la azitromicina   " +
                                                  "\n y ceftriaxona, los cuales deben ser administrados bajo prescripción médica. En casos más graves, puede requerirse    " +
                                                  "\n hospitalización para recibir antibióticos intravenosos. Es fundamental que el paciente evite el contacto íntimo hasta    " +
                                                  "\n completar el tratamiento y que su pareja también reciba tratamiento para evitar reinfecciones. ALIMENTACIÓN RECOMENDADA: " +
                                                  "\n Se recomienda el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a combatir la infección, tales    " +
                                                  "\n como: Ajo: Posee propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene alicina,      " +
                                                  "\n un compuesto con efectos antibacterianos. Frutas cítricas (naranjas, limones, toronjas): Ricas en vitamina C, que        " +
                                                  "\n fortalece el sistema inmunológico y ayuda a reducir la duración de infecciones, aportando aproximadamente el 89% del     " +
                                                  "\n requerimiento diario por cada 100 gramos. Yogur natural: Contiene probióticos, que pueden ayudar a mantener el equilibrio" +
                                                  "\n de la flora bacteriana y mejorar la respuesta inmunológica, proporcionando cerca del 20% del requerimiento diario de    " +
                                                  "\n calcio por cada porción de 150 gramos. Verduras de hoja verde (espinaca, acelga, brócoli): Ricas en antioxidantes y     " +
                                                  "\n vitaminas esenciales para la recuperación, como la vitamina A, que contribuye a la regeneración celular y aporta cerca  " +
                                                  "\n del 56% del requerimiento diario por cada 100 gramos de espinaca. Este es solo un diagnóstico predeterminado lógico,    " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente  " +
                                                  "\n correctas. Para mayor seguridad, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer   " +
                                                  "\n el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n En adultos mayores, el herpes genital puede causar síntomas más prolongados y complicaciones debido a la disminución     " +
                                                  "\n de la respuesta inmunológica. EJERCICIO: Se recomienda actividad física moderada, como caminatas suaves y ejercicios     " +
                                                  "\n de movilidad para mejorar la circulación y reducir la fatiga. También es recomendable realizar ejercicios de relajación  " +
                                                  "\n y respiración para reducir el estrés, ya que este puede desencadenar brotes de herpes. HIDRATACIÓN: Es esencial el       " +
                                                  "\n consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tamaño regular) para mantener el cuerpo hidratado " +
                                                  "\n y ayudar a reducir la inflamación. Además del agua pura, se recomienda el consumo de infusiones de hierbas, como té de   " +
                                                  "\n manzanilla o jengibre, que pueden ayudar a reducir la inflamación y mejorar la respuesta inmunológica. También es        " +
                                                  "\n beneficioso ingerir jugos naturales sin azúcar, que aportan antioxidantes y vitaminas esenciales. POSIBLE TRATAMIENTO:   " +
                                                  "\n El herpes genital se trata con antivirales, como aciclovir, valaciclovir o famciclovir, que ayudan a reducir la duración " +
                                                  "\n y gravedad de los brotes. También se recomienda el uso de cremas tópicas para aliviar el dolor y la irritación.          " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmunológico y reducir la         " +
                                                  "\n inflamación, tales como arándanos, ricos en antioxidantes y vitamina C, aportando 25% de la ingesta diaria recomendada.  " +
                                                  "\n espinacas, que contienen hierro y vitamina A, esenciales para la recuperación, proporcionando 15% de la ingesta diaria   " +
                                                  "\n recomendada de hierro. jengibre, con propiedades antiinflamatorias y antioxidantes, aportando 5% de la ingesta diaria    " +
                                                  "\n recomendada de vitamina C. cúrcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes, proporcionando" +
                                                  "\n 3% de la ingesta diaria recomendada de antioxidantes. yogur natural, que contiene probióticos beneficiosos para la flora  " +
                                                  "\n intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio. Este es solo un diagnóstico predeterminado     " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean          " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer  " +
                                                  "\n el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n En adultos mayores, la sífilis puede progresar a etapas avanzadas si no se trata adecuadamente, afectando órganos         " +
                                                  "\n internos y el sistema nervioso. EJERCICIO: Se recomienda actividad física moderada, como caminatas suaves y ejercicios    " +
                                                  "\n de movilidad para mejorar la circulación y reducir la fatiga. También es recomendable realizar ejercicios de respiración  " +
                                                  "\n y relajación para mejorar la oxigenación y reducir el estrés. HIDRATACIÓN: Es fundamental el consumo diario de 2 a 2.5    " +
                                                  "\n litros de agua (ocho a diez vasos de agua de tamaño regular) para mantener el cuerpo hidratado y ayudar a reducir la      " +
                                                  "\n inflamación. Además del agua pura, se recomienda el consumo de jugos naturales ricos en vitamina C, como jugo de naranja  " +
                                                  "\n o toronja, que pueden fortalecer el sistema inmunológico. También es beneficioso ingerir caldos ligeros, que aportan      " +
                                                  "\n líquidos y minerales esenciales para la recuperación. POSIBLE TRATAMIENTO: La sífilis se trata con antibióticos, como     " +
                                                  "\n penicilina G benzatina, que es el tratamiento de primera elección. En casos de alergia a la penicilina, se pueden utilizar" +
                                                  "\n doxiciclina o ceftriaxona. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema         " +
                                                  "\n inmunológico y reducir la inflamación, tales como ajo, que contiene alicina con propiedades antimicrobianas, aportando 5% " +
                                                  "\n de la ingesta diaria recomendada de antioxidantes. jengibre, con efectos antiinflamatorios y antioxidantes, aportando 5%  " +   
                                                  "\n de la ingesta diaria recomendada de vitamina C. cúrcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes," +
                                                  "\n proporcionando 3% de la ingesta diaria recomendada de antioxidantes. frutas cítricas (naranjas, limones, toronjas), ricas en " +
                                                  "\n vitamina C, que fortalece el sistema inmunológico, aportando 90 mg por cada 100 g de fruta, lo que representa 100% de la  " +
                                                  "\n ingesta diaria recomendada. yogur natural, que contiene probióticos beneficiosos para la flora intestinal, proporcionando " +
                                                  "\n 15% de la ingesta diaria recomendada de calcio. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no  " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se " +
                                                  "\n recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n En adultos mayores, la tuberculosis puede ser grave debido a la disminución de la función pulmonar y la posibilidad " +
                                                  "\n de complicaciones respiratorias. EJERCICIO: Se recomienda actividad física moderada, como caminatas suaves y        " +
                                                  "\n ejercicios de respiración para mejorar la capacidad pulmonar. También es recomendable realizar ejercicios de        " +
                                                  "\n movilidad y estiramientos para mejorar la circulación y reducir la fatiga. Debido a que la tuberculosis afecta      " +
                                                  "\n la función pulmonar, es importante realizar ejercicios de respiración profunda, como la técnica de respiración      " +
                                                  "\n diafragmática, que ayuda a mejorar la oxigenación y reducir la sensación de falta de aire. También se recomienda    " +
                                                  "\n la respiración con labios fruncidos, que permite controlar la exhalación y mejorar la eficiencia respiratoria.      " +
                                                  "\n HIDRATACIÓN: Es esencial el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de agua de tamaño regular)  " +
                                                  "\n para mantener el cuerpo hidratado y ayudar a reducir la inflamación de las vías respiratorias. Además del agua pura," +
                                                  "\n se recomienda el consumo de infusiones de hierbas, como té de jengibre o manzanilla, que pueden ayudar a reducir la " +
                                                  "\n inflamación y mejorar la respiración. También es beneficioso ingerir jugos naturales sin azúcar, que aportan        " +
                                                  "\n antioxidantes y vitaminas esenciales para la función pulmonar. POSIBLE TRATAMIENTO: La tuberculosis se trata        " +
                                                  "\n con antibióticos específicos, como isoniazida, rifampicina, pirazinamida y etambutol, administrados en un régimen   " +
                                                  "\n prolongado de varios meses. En casos graves, se puede requerir hospitalización y oxígeno suplementario. ALIMENTACIÓN:   " +
                                                  "\n Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema respiratorio y reducir la inflamación, tales   " +
                                                  "\n como pescados grasos (salmón, atún), ricos en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias,          " +
                                                  "\n aportando 50% de la ingesta diaria recomendada de Omega-3. frutas y verduras de colores vivos (arándanos, fresas,       " +
                                                  "\n espinacas, brócoli), ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las células del      " +
                                                  "\n daño y fortalecer el sistema inmunológico, aportando 70% de la ingesta diaria recomendada de vitamina C. jengibre,      " +
                                                  "\n que contiene compuestos con efectos antiinflamatorios que podrían ser beneficiosos para las vías respiratorias,         " +
                                                  "\n aportando 5% de la ingesta diaria recomendada de vitamina C. cúrcuma, con su componente activo, la curcumina, que       " +
                                                  "\n tiene potentes propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de     " +
                                                  "\n antioxidantes. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el        " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar    " +
                                                  "\n más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita" +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n En adultos mayores, la artritis puede causar dolor crónico y afectar la movilidad, lo que impacta la calidad de vida.  " +
                                                  "\n HIDRATACIÓN: Es fundamental que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente ocho a diez   " +
                                                  "\n vasos de tamaño regular) para mantener la lubricación de las articulaciones y reducir la inflamación. La hidratación   " +
                                                  "\n también ayuda a eliminar toxinas y mejorar la circulación, lo que favorece la regeneración de los tejidos articulares. " +
                                                  "\n EJERCICIO: La actividad física debe ser moderada y adaptada, como ejercicios de bajo impacto como natación, yoga o     " +
                                                  "\n caminatas de 30 minutos diarios. El ejercicio fortalece los músculos que rodean las articulaciones, mejora la          " +
                                                  "\n flexibilidad y reduce la rigidez matutina. POSIBLE TRATAMIENTO: Para la artritis en adultos mayores, el tratamiento    " +
                                                  "\n suele incluir antiinflamatorios como ibuprofeno (Advil) o naproxeno, medicamentos modificadores de la enfermedad como  " +
                                                  "\n metotrexato, y en algunos casos, terapias biológicas. También se recomienda fisioterapia para mejorar la movilidad y   " +
                                                  "\n reducir el dolor. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes, ácidos grasos esenciales " +
                                                  "\n y minerales para fortalecer las articulaciones y reducir la inflamación, tales como Pescados grasos (salmón, Omega-3,  " +
                                                  "\n 2 g por 100 g, ayuda a reducir la inflamación articular), Frutas y verduras de colores vivos (arándanos, fresas,       " +
                                                  "\n espinacas, brócoli, vitamina C, 89 mg por 100 g, fortalece el sistema inmune y protege las células del daño oxidativo)," +
                                                  "\n Jengibre (compuestos antiinflamatorios, ayuda a reducir el dolor articular), Cúrcuma (curcumina, 3% de concentración,  " +
                                                  "\n potente antioxidante y antiinflamatorio), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamación y     " +
                                                  "\n proteger las células). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que  " +
                                                  "\n el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar más de un Diagnóstico  " +
                                                  "\n de Mi Vida para mayor seguridad en el tratamiento. Además, por su salud, si la respuesta del diagnóstico no le satisface  " +
                                                  "\n del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n En adultos mayores, la tosferina puede ser grave y causar complicaciones respiratorias si no se trata adecuadamente.  " +
                                                  "\n HIDRATACIÓN: Es esencial que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente ocho a diez     " +
                                                  "\n vasos de tamaño regular) para mantener las vías respiratorias hidratadas y reducir la viscosidad de las secreciones.  " +
                                                  "\n La hidratación también ayuda a calmar la irritación de la garganta y mejorar la función pulmonar. EJERCICIO: La       " +
                                                  "\n actividad física debe ser mínima y adaptada, como ejercicios de respiración y movilidad pasiva, evitando esfuerzos    " +
                                                  "\n excesivos que puedan comprometer la recuperación. Movilizar el cuerpo de manera controlada ayuda a prevenir la rigidez  " +
                                                  "\n muscular y mejora la circulación, lo que favorece la recuperación. POSIBLE TRATAMIENTO: Para la tosferina en adultos    " +
                                                  "\n mayores, el tratamiento suele incluir antibióticos como azitromicina o eritromicina para eliminar la bacteria, además   " +
                                                  "\n de medicamentos para aliviar la tos y reducir la inflamación de las vías respiratorias. También se recomienda el uso    " +
                                                  "\n de humidificadores para mejorar la respiración. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en            " + 
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmune y mejorar la recuperación, tales como Frutas    " +
                                                  "\n cítricas (naranjas, limones, vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora la absorción de hierro), " +
                                                  "\n Espinacas (vitamina A y C, 937 µg de vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la  " +
                                                  "\n respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamación y proteger las células), Miel " +
                                                  "\n (propiedades antimicrobianas y suavizantes para la garganta, ayuda a reducir la irritación y la tos), Caldos calientes  " +
                                                  "\n (favorecen la hidratación y alivian la congestión nasal). Este es solo un diagnóstico predeterminado lógico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda " +
                                                  "\n realizar más de un Diagnóstico de Mi Vida para mayor seguridad en el tratamiento. Además, por su salud, si la respuesta    " +
                                                  "\n del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app  " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n En adultos mayores, las paperas pueden causar inflamación severa de las glándulas salivales y generar complicaciones " +
                                                  "\n si no se manejan adecuadamente. HIDRATACIÓN: Es recomendable que el paciente consuma entre 2 y 2.5 litros de agua al " +
                                                  "\n día (aproximadamente ocho a diez vasos de tamaño regular) para mantener una adecuada función renal y evitar la       " +
                                                  "\n deshidratación, que puede afectar la recuperación. La hidratación también ayuda a reducir la inflamación de las      " +
                                                  "\n glándulas y mejorar la producción de saliva. EJERCICIO: La actividad física debe ser moderada y adaptada, como       " +
                                                  "\n caminatas de 30 minutos diarios, ejercicios de bajo impacto como yoga o natación, siempre bajo supervisión médica    " +
                                                  "\n para evitar fatiga extrema. El ejercicio mejora la circulación, fortalece los músculos y ayuda a reducir los efectos " +
                                                  "\n secundarios de la inflamación. POSIBLE TRATAMIENTO: Para las paperas en adultos mayores, el tratamiento suele incluir   " +
                                                  "\n analgésicos como paracetamol o ibuprofeno para reducir el dolor y la fiebre, además de reposo y aislamiento para evitar " +
                                                  "\n la propagación del virus. También se recomienda la aplicación de compresas frías en la zona inflamada. ALIMENTACIÓN:    " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes, proteínas y nutrientes esenciales para fortalecer el      " +
                                                  "\n sistema inmune y mejorar la recuperación, tales como Frutas cítricas (naranjas, limones, vitamina C, 50 mg por 100 g,   " +
                                                  "\n fortalece el sistema inmune y mejora la absorción de hierro), Espinacas (vitamina A y C, 937 µg de vitamina A y 89 mg   " +
                                                  "\n de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg por      " +
                                                  "\n 100 g, ayuda a reducir la inflamación y proteger las células), Yogur natural (probióticos, mejora la salud intestinal   " +
                                                  "\n y fortalece el sistema inmune), Pescados grasos (salmón, Omega-3, 2 g por 100 g, ayuda a reducir la inflamación y       " +
                                                  "\n mejorar la función celular). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al   " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar más de un   " +
                                                  "\n Diagnóstico de Mi Vida para mayor seguridad en el tratamiento. Además, por su salud, si la respuesta del diagnóstico " +
                                                  "\n no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida)  " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n En adultos mayores, el virus del Zika puede causar síntomas más intensos y prolongados, aumentando el riesgo de   " +
                                                  "\n complicaciones neurológicas, por lo que es fundamental un diagnóstico oportuno y tratamiento adecuado.            " +
                                                  "\n HIDRATACIÓN: Se recomienda que el paciente mantenga una hidratación adecuada, consumiendo al menos 2.5 litros de  " +
                                                  "\n agua al día (aproximadamente diez vasos de tamaño regular) para favorecer la eliminación de toxinas y mantener el " +
                                                  "\n sistema inmunológico fuerte, lo que ayuda a reducir la fatiga y mejorar la función renal. EJERCICIO: En cuanto a  " +
                                                  "\n la actividad física, es recomendable realizar ejercicios de bajo impacto, como caminatas de 30 minutos diarios,   " +
                                                  "\n natación o yoga, siempre bajo supervisión médica para evitar complicaciones y fortalecer la función cardiovascular.  " +
                                                  "\n También se recomienda ejercicios de movilidad para mejorar la circulación sanguínea y reducir la inflamación.        " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento antiviral específico para el Zika, por lo que el manejo es sintomático." +
                                                  "\n Se recomienda el uso de analgésicos como paracetamol para aliviar la fiebre y el malestar, antihistamínicos para        " +
                                                  "\n reducir el prurito y reposo adecuado. Es fundamental evitar el uso de aspirina y otros antiinflamatorios no esteroides  " +
                                                  "\n sin supervisión médica. ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema      " +
                                                  "\n inmunológico y ayuden a combatir la infección, tales como: Frutas cítricas (naranjas, limones, toronjas): Ricas en      " +
                                                  "\n vitamina C, que fortalece el sistema inmunológico y ayuda a reducir la duración de infecciones, aportando aproximadamente" +
                                                  "\n el 89% del requerimiento diario por cada 100 gramos. Jengibre: Contiene compuestos con efectos antiinflamatorios que     " +
                                                  "\n pueden ayudar a reducir la fiebre y el malestar general. Verduras de hoja verde (espinaca, acelga, brócoli): Ricas en    " +
                                                  "\n antioxidantes y vitaminas esenciales para la recuperación, como la vitamina A, que contribuye a la regeneración celular  " +
                                                  "\n y aporta cerca del 56% del requerimiento diario por cada 100 gramos de espinaca. Omega-3 (salmón, atún, chía): Con       " +
                                                  "\n propiedades antiinflamatorias que pueden ayudar a reducir la inflamación y mejorar la respuesta inmunológica, aportando  " +
                                                  "\n aproximadamente el 50% del requerimiento diario por cada 100 gramos de salmón. Este es solo un diagnóstico predeterminado" +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean         " +
                                                  "\n completamente correctas. Para mayor seguridad, se recomienda realizar más de un diagnóstico y consultar a un médico para " +
                                                  "\n establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n En adultos mayores, el rotavirus puede causar deshidratación severa y complicaciones gastrointestinales, por lo    " +
                                                  "\n que es fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que el paciente      " +
                                                  "\n mantenga una hidratación adecuada, consumiendo al menos 3 litros de agua al día (aproximadamente doce vasos de     " +
                                                  "\n tamaño regular) para compensar la pérdida de líquidos y evitar la deshidratación. EJERCICIO: En cuanto a la        " +
                                                  "\n actividad física, es recomendable realizar ejercicios de bajo impacto, como caminatas suaves de 20 minutos diarios," +
                                                  "\n siempre bajo supervisión médica para evitar complicaciones y fortalecer la función digestiva. POSIBLE TRATAMIENTO: " +
                                                  "\n No existe un tratamiento antiviral específico para el rotavirus, por lo que el manejo es sintomático. Se recomienda" +
                                                  "\n el uso de soluciones de rehidratación oral para evitar la deshidratación, así como una dieta blanda y de fácil     " +
                                                  "\n digestión. En casos graves, puede requerirse hospitalización para administración de líquidos intravenosos.         " +
                                                  "\n ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema digestivo y ayuden a    " +
                                                  "\n combatir la infección, tales como: Plátano: Rico en potasio, que ayuda a reemplazar los electrolitos perdidos debido  " +
                                                  "\n a la diarrea, aportando aproximadamente el 12% del requerimiento diario por cada 100 gramos. Yogur natural: Contiene  " +
                                                  "\n probióticos, que pueden ayudar a restaurar la flora intestinal y mejorar la digestión, proporcionando cerca del 20%   " +
                                                  "\n del requerimiento diario de calcio por cada porción de 150 gramos. Arroz blanco: Fuente de carbohidratos de fácil     " +
                                                  "\n digestión que ayuda a estabilizar el sistema digestivo y aporta energía sin irritar el estómago. Zanahoria: Rica en   " +
                                                  "\n vitamina A, que contribuye a la regeneración celular y fortalece la mucosa intestinal, aportando cerca del 56% del    " +
                                                  "\n requerimiento diario por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no    " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor" +
                                                  "\n seguridad, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado." +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n En adultos mayores, la listeriosis puede causar infecciones graves y afectar el sistema nervioso, por lo que  " +
                                                  "\n es fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que el paciente     " +
                                                  "\n mantenga una hidratación adecuada, consumiendo al menos 2.5 litros de agua al día (aproximadamente diez vasos " +
                                                  "\n de tamaño regular) para favorecer la eliminación de toxinas y mantener el sistema inmunológico fuerte.        " +
                                                  "\n EJERCICIO: En cuanto a la actividad física, es recomendable realizar ejercicios de bajo impacto, como caminatas  " +
                                                  "\n de 30 minutos diarios, natación o yoga, siempre bajo supervisión médica para evitar complicaciones y fortalecer  " +
                                                  "\n la función inmunológica. POSIBLE TRATAMIENTO: El tratamiento estándar para la listeriosis incluye antibióticos   " +
                                                  "\n como ampicilina y gentamicina, administrados bajo prescripción médica. En casos graves, puede requerirse         " +
                                                  "\n hospitalización para administración de antibióticos intravenosos. ALIMENTACIÓN RECOMENDADA: Se recomienda el     " +
                                                  "\n consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a combatir la infección, tales como: Ajo:  " +
                                                  "\n Posee propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene alicina, un      " +
                                                  "\n compuesto con efectos antibacterianos. Frutas cítricas (naranjas, limones, toronjas): Ricas en vitamina C, que   " +
                                                  "\n fortalece el sistema inmunológico y ayuda a reducir la duración de infecciones, aportando aproximadamente el 89% " +
                                                  "\n del requerimiento diario por cada 100 gramos. Yogur natural: Contiene probióticos, que pueden ayudar a mantener  " +
                                                  "\n el equilibrio de la flora bacteriana y mejorar la respuesta inmunológica, proporcionando cerca del 20% del         " +
                                                  "\n requerimiento diario de calcio por cada porción de 150 gramos. Verduras de hoja verde (espinaca, acelga, brócoli): " +
                                                  "\n Ricas en antioxidantes y vitaminas esenciales para la recuperación, como la vitamina A, que contribuye a la        " +
                                                  "\n regeneración celular y aporta cerca del 56% del requerimiento diario por cada 100 gramos de espinaca. Este es solo " +
                                                  "\n un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad" +
                                                  "\n ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar más de un         " +
                                                  "\n diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la" +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n En adultos mayores, la shigelosis puede causar diarrea severa y deshidratación, lo que puede ser peligroso     " +
                                                  "\n si no se trata adecuadamente. EJERCICIO: Se recomienda actividad física ligera, como caminatas cortas,         " +
                                                  "\n evitando esfuerzos excesivos que puedan agravar la deshidratación. También es recomendable realizar ejercicios " +
                                                  "\n de movilidad y estiramientos para mejorar la circulación y reducir la fatiga. Debido a que la shigelosis causa " +
                                                  "\n diarrea y pérdida de líquidos, es importante evitar ejercicios que generen sudoración excesiva y optar por     " +
                                                  "\n movimientos suaves que ayuden a mantener la actividad sin comprometer la hidratación. HIDRATACIÓN: Es crucial  " +
                                                  "\n el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de agua de tamaño regular) para compensar la    " +
                                                  "\n pérdida de líquidos y evitar la deshidratación. Además del agua pura, se recomienda el consumo de soluciones   " +
                                                  "\n de rehidratación oral para reponer electrolitos esenciales como sodio y potasio. También es beneficioso ingerir   " +
                                                  "\n agua de coco, que contiene electrolitos naturales, y caldos ligeros, que aportan líquidos y minerales esenciales  " +
                                                  "\n para la recuperación. POSIBLE TRATAMIENTO: La shigelosis se trata con antibióticos, como azitromicina,            " +
                                                  "\n ciprofloxacino o ceftriaxona, dependiendo de la gravedad del caso. También se recomienda rehidratación oral y una " +
                                                  "\n dieta adecuada. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a reponer líquidos y fortalecer el " +
                                                  "\n sistema digestivo, tales como plátanos, ricos en potasio, que ayudan a reemplazar los electrolitos perdidos,      " +
                                                  "\n aportando 10% de la ingesta diaria recomendada de potasio. arroz blanco, que es fácil de digerir y ayuda a        " +
                                                  "\n estabilizar el sistema digestivo, proporcionando 20% de la ingesta diaria recomendada de carbohidratos. zanahorias,  " +
                                                  "\n ricas en vitamina A, que ayudan a la recuperación del sistema digestivo, aportando 50% de la ingesta diaria          " +
                                                  "\n recomendada de vitamina A. agua de coco, que ayuda a la hidratación y aporta electrolitos esenciales. yogur natural, " +
                                                  "\n que contiene probióticos beneficiosos para la flora intestinal, proporcionando 15% de la ingesta diaria recomendada  " +
                                                  "\n de calcio. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un " +
                                                  "\n diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la   " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n En adultos mayores, la EPOC puede causar dificultad para respirar y fatiga, afectando la calidad de vida.     " +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada, como caminatas suaves y ejercicios de respiración para    " +
                                                  "\n mejorar la capacidad pulmonar. También es recomendable realizar ejercicios de movilidad y estiramientos para  " +
                                                  "\n mejorar la circulación y reducir la fatiga. Debido a que la EPOC afecta la función pulmonar, es importante    " +
                                                  "\n realizar ejercicios de respiración profunda, como la técnica de respiración diafragmática, que ayuda a mejorar     " +
                                                  "\n la oxigenación y reducir la sensación de falta de aire. También se recomienda la respiración con labios fruncidos, " +
                                                  "\n que permite controlar la exhalación y mejorar la eficiencia respiratoria. HIDRATACIÓN: Es esencial el consumo      " +
                                                  "\n diario de 2.5 a 2.75 litros de agua (ocho a diez vasos de agua de tamaño regular) para mantener el cuerpo hidratado" +
                                                  "\n y ayudar a reducir la inflamación de las vías respiratorias. Además del agua pura, se recomienda el consumo de     " +
                                                  "\n infusiones de hierbas, como té de jengibre o manzanilla, que pueden ayudar a reducir la inflamación y mejorar la   " +
                                                  "\n respiración. También es beneficioso ingerir jugos naturales sin azúcar, que aportan antioxidantes y vitaminas      " +
                                                  "\n esenciales para la función pulmonar. POSIBLE TRATAMIENTO: La EPOC se trata con broncodilatadores, como salbutamol, " +
                                                  "\n tiotropio o formoterol, además de corticosteroides inhalados, como fluticasona o budesonida. En casos graves, se   " +
                                                  "\n puede requerir oxígeno suplementario y rehabilitación pulmonar. ALIMENTACIÓN: Se recomienda el consumo de alimentos  " +
                                                  "\n que ayuden a fortalecer el sistema respiratorio y reducir la inflamación, tales como pescados grasos (salmón, atún), " +
                                                  "\n ricos en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias, aportando 50% de la ingesta diaria         " +
                                                  "\n recomendada de Omega-3. frutas y verduras de colores vivos (arándanos, fresas, espinacas, brócoli), ricas en         " +
                                                  "\n antioxidantes como la vitamina C y carotenoides, que pueden proteger las células del daño y fortalecer el sistema    " +
                                                  "\n inmunológico, aportando 70% de la ingesta diaria recomendada de vitamina C. jengibre, que contiene compuestos con    " +
                                                  "\n efectos antiinflamatorios que podrían ser beneficiosos para las vías respiratorias, aportando 5% de la ingesta diaria" +
                                                  "\n recomendada de vitamina C. cúrcuma, con su componente activo, la curcumina, que tiene potentes propiedades antiinflamatorias " +
                                                  "\n y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes. Este es solo un diagnóstico            " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas   " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para  " +
                                                  "\n establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n En adultos mayores, la clamidia puede causar síntomas prolongados y" +
                                                  "\n complicaciones si no se trata adecuadamente. EJERCICIO: Se recomienda actividad física moderada, como caminatas suaves " +
                                                  "\n y ejercicios de movilidad para mejorar la circulación y reducir la fatiga. También es recomendable realizar ejercicios " +
                                                  "\n de relajación y respiración para reducir el estrés, ya que este puede afectar la respuesta inmunológica y prolongar la " +
                                                  "\n infección. HIDRATACIÓN: Es esencial el consumo diario de 2.5 a 2.75 litros de agua (ocho a diez vasos de agua de tamaño   " +
                                                  "\n regular) para mantener el cuerpo hidratado y ayudar a reducir la inflamación. Además del agua pura, se recomienda el      " +
                                                  "\n consumo de jugos naturales ricos en vitamina C, como jugo de naranja o toronja, que pueden fortalecer el sistema          " +
                                                  "\n inmunológico. También es beneficioso ingerir caldos ligeros, que aportan líquidos y minerales esenciales para la          " +
                                                  "\n recuperación. POSIBLE TRATAMIENTO: La clamidia se trata con antibióticos, como azitromicina o doxiciclina, administrados  " +
                                                  "\n en un régimen de varios días. También se recomienda el uso de medidas preventivas, como el uso de preservativos y la      " +
                                                  "\n detección temprana en parejas sexuales. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el    " +
                                                  "\n sistema inmunológico y reducir la inflamación, tales como arándanos, ricos en antioxidantes y vitamina C, aportando 25%   " +
                                                  "\n de la ingesta diaria recomendada. espinacas, que contienen hierro y vitamina A, esenciales para la recuperación,          " +
                                                  "\n proporcionando 15% de la ingesta diaria recomendada de hierro. jengibre, con propiedades antiinflamatorias y antioxidantes,  " +
                                                  "\n aportando 5% de la ingesta diaria recomendada de vitamina C. cúrcuma, con curcumina, que tiene propiedades antiinflamatorias " +
                                                  "\n y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes. yogur natural, que contiene probióticos" +
                                                  "\n beneficiosos para la flora intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio. Este es solo un   " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que " +
                                                  "\n las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un   " +
                                                  "\n médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n En adultos mayores, la meningitis bacteriana puede ser grave y requiere atención médica inmediata. " +
                                                  "\n HIDRATACIÓN: Es esencial que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente ocho    " +
                                                  "\n a diez vasos de tamaño regular) para mantener una adecuada función cerebral y evitar la deshidratación, que   " +
                                                  "\n puede agravar los síntomas neurológicos. La hidratación es clave para mantener el equilibrio de electrolitos  " +
                                                  "\n y mejorar la función cognitiva, reduciendo el riesgo de complicaciones neurológicas. EJERCICIO: La actividad  " +
                                                  "\n física debe ser mínima y adaptada, como ejercicios de respiración y movilidad pasiva, evitando esfuerzos      " +
                                                  "\n excesivos que puedan comprometer la recuperación. Movilizar el cuerpo de manera controlada ayuda a prevenir la  " +
                                                  "\n rigidez muscular y mejora la circulación, lo que favorece la recuperación. POSIBLE TRATAMIENTO: Para la meningitis   " +
                                                  "\n bacteriana en adultos mayores, el tratamiento suele incluir antibióticos intravenosos como ceftriaxona o vancomicina," +
                                                  "\n dependiendo del agente causal. También se recomienda el uso de corticosteroides para reducir la inflamación cerebral " +
                                                  "\n y en algunos casos, soporte respiratorio. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes " +
                                                  "\n y nutrientes esenciales para fortalecer el sistema inmune y mejorar la recuperación, tales como Frutas cítricas      " +
                                                  "\n (naranjas, limones, vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora la absorción de hierro),       " +
                                                  "\n Espinacas (vitamina A y C, 937 µg de vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular    " +
                                                  "\n y la respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamación y proteger las células), " +
                                                  "\n Yogur natural (probióticos, mejora la salud intestinal y fortalece el sistema inmune), Pescados grasos (salmón, Omega-3," +
                                                  "\n 2 g por 100 g, ayuda a reducir la inflamación y mejorar la función celular). Este es solo un diagnóstico predeterminado " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el      " +
                                                  "\n adecuado. Se recomienda realizar más de un Diagnóstico de Mi Vida para mayor seguridad en el tratamiento. Además, por su" +
                                                  "\n salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n En adultos mayores, el cáncer requiere un enfoque integral para mejorar la calidad de vida y el tratamiento.   " +
                                                  "\n HIDRATACIÓN: Es recomendable que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente ocho a diez    " +
                                                  "\n vasos de tamaño regular) para mantener una adecuada función renal y evitar la deshidratación, que puede afectar la       " +
                                                  "\n tolerancia a los tratamientos oncológicos. La hidratación también ayuda a reducir la fatiga y mejorar la función celular," +
                                                  "\n lo que es crucial para la recuperación. EJERCICIO: La actividad física debe ser moderada y adaptada, como caminatas de 30" +
                                                  "\n minutos diarios, ejercicios de bajo impacto como yoga o natación, siempre bajo supervisión médica para evitar fatiga    " +
                                                  "\n extrema. El ejercicio mejora la circulación, fortalece los músculos y ayuda a reducir los efectos secundarios del       " +
                                                  "\n tratamiento, como la fatiga y la pérdida de masa muscular. POSIBLE TRATAMIENTO: Para el cáncer en adultos mayores, el   " +
                                                  "\n tratamiento suele incluir quimioterapia, radioterapia o inmunoterapia, dependiendo del tipo y estadio del cáncer.       " +
                                                  "\n También se recomienda un enfoque multidisciplinario con apoyo nutricional y psicológico. ALIMENTACIÓN: Se recomienda    " +
                                                  "\n el consumo de alimentos ricos en antioxidantes, proteínas y nutrientes esenciales para fortalecer el sistema inmune     " +
                                                  "\n y mejorar la recuperación, tales como Frutas cítricas (naranjas, limones, vitamina C, 50 mg por 100 g, fortalece el     " +
                                                  "\n sistema inmune y mejora la absorción de hierro), Espinacas (vitamina A y C, 937 µg de vitamina A y 89 mg de vitamina C  " +
                                                  "\n por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, ayuda a     " +
                                                  "\n reducir la inflamación y proteger las células), Yogur natural (probióticos, mejora la salud intestinal y fortalece el   " +
                                                  "\n sistema inmune), Pescados grasos (salmón, Omega-3, 2 g por 100 g, ayuda a reducir la inflamación y mejorar la función   " +
                                                  "\n celular). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente    " +
                                                  "\n tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar más de un Diagnóstico de Mi Vida    " +
                                                  "\n para mayor seguridad en el tratamiento. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, " +
                                                  "\n se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        if(EstaturaMasculino.equals("1.45-1.60 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n En adultos mayores, la gripe puede ser más severa debido a la disminución de la respuesta inmune con la edad.         " +
                                                  "\n HIDRATACIÓN: Es recomendable que el paciente mantenga una hidratación adecuada, consumiendo entre 2 y 2.5 litros      " +
                                                  "\n de agua al día (aproximadamente ocho a diez vasos de tamaño regular) para ayudar a mantener las mucosas hidratadas    " +
                                                  "\n y facilitar la expulsión de secreciones. La hidratación también contribuye a la regulación de la temperatura corporal " +
                                                  "\n y al transporte eficiente de nutrientes esenciales para la recuperación. EJERCICIO: La actividad física debe ser suave" +
                                                  "\n y adaptada, como caminatas cortas de 20 a 30 minutos diarios, evitando esfuerzos excesivos y asegurando una buena   " +
                                                  "\n ventilación en el entorno para reducir el riesgo de complicaciones respiratorias. El ejercicio moderado mejora la   " +
                                                  "\n circulación sanguínea, fortalece el sistema inmunológico y ayuda a reducir la fatiga causada por la enfermedad.     " +
                                                  "\n POSIBLE TRATAMIENTO: Para la gripe en adultos mayores, el tratamiento suele incluir antivirales como oseltamivir    " +
                                                  "\n (Tamiflu) en casos graves o de riesgo, además de medicamentos para aliviar síntomas como paracetamol (Tempra) o     " +
                                                  "\n ibuprofeno (Advil) para la fiebre y el malestar. También se recomienda el uso de jarabes expectorantes para facilitar" +
                                                  "\n la eliminación de flemas. La vacunación anual contra la influenza es clave para la prevención. ALIMENTACIÓN: Se      " +
                                                  "\n recomienda el consumo de alimentos ricos en vitamina C y antioxidantes para fortalecer el sistema inmune, tales      " +
                                                  "\n como Naranjas y mandarinas (vitamina C, 50 mg por 100 g, fortalece el sistema inmune y reduce la duración de los     " +
                                                  "\n síntomas), Kiwi (vitamina C, 100 mg por 100 g, refuerza el sistema inmunológico y mejora la absorción de hierro),    " +
                                                  "\n Fresas (antioxidantes y vitamina C, 58 mg por 100 g, protegen las células del daño oxidativo y fortalecen el sistema " +
                                                  "\n inmune), Espinacas y brócoli (vitamina A y C, 937 µg de vitamina A y 89 mg de vitamina C por 100 g, esenciales para  " +
                                                  "\n la salud celular y la respuesta inmune), Miel (propiedades antimicrobianas y suavizantes para la garganta, ayuda a   " +
                                                  "\n reducir la irritación y la tos), Caldos calientes (favorecen la hidratación y alivian la congestión nasal). Este es  " +
                                                  "\n solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad " +
                                                  "\n ni que el tratamiento sea el adecuado. Se recomienda realizar más de un Diagnóstico de Mi Vida para mayor seguridad      " +
                                                  "\n en el tratamiento. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar" +
                                                  "\n a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraerNeumonía." +
                                                  "\n En adultos mayores, la neumonía puede ser grave debido a la disminución de la respuesta inmune y la posible       " +
                                                  "\n presencia de enfermedades crónicas. HIDRATACIÓN: Es fundamental que el paciente consuma entre 2 y 2.5 litros      " +
                                                  "\n de agua al día (aproximadamente ocho a diez vasos de tamaño regular) para mantener las vías respiratorias           " +
                                                  "\n hidratadas y facilitar la expulsión de secreciones. La hidratación también ayuda a reducir la inflamación pulmonar  " +
                                                  "\n y mejora la oxigenación de los tejidos, lo que es crucial para la recuperación. EJERCICIO: La actividad física debe " +
                                                  "\n ser moderada y adaptada, como caminatas cortas de 15 a 20 minutos diarios, evitando esfuerzos excesivos y asegurando" +
                                                  "\n una buena ventilación en el entorno para reducir el riesgo de complicaciones respiratorias. Movilizar el cuerpo de    " +
                                                  "\n manera controlada ayuda a prevenir la rigidez muscular y mejora la circulación, lo que favorece la recuperación.      " +
                                                  "\n POSIBLE TRATAMIENTO: Para la neumonía en adultos mayores, el tratamiento suele incluir antibióticos como amoxicilina  " +
                                                  "\n con ácido clavulánico (Clavulin) o levofloxacino (Levaquin) en casos bacterianos, además de medicamentos para aliviar " +
                                                  "\n síntomas como paracetamol (Tempra) o ibuprofeno (Advil) para la fiebre y el malestar. También se recomienda el uso de " +
                                                  "\n broncodilatadores en casos de dificultad respiratoria y oxigenoterapia en situaciones graves. La vacunación contra    " +
                                                  "\n neumococo e influenza es clave para la prevención. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en vitamina C, " +
                                                  "\n antioxidantes y minerales esenciales para fortalecer el sistema inmune y mejorar la recuperación, tales como Naranjas y     " +
                                                  "\n mandarinas (vitamina C, 50 mg por 100 g, fortalece el sistema inmune y reduce la duración de los síntomas), Kiwi (vitamina C, " +
                                                  "\n 100 mg por 100 g, refuerza el sistema inmunológico y mejora la absorción de hierro), Fresas (antioxidantes y vitamina C,   " +
                                                  "\n 58 mg por 100 g, protegen las células del daño oxidativo y fortalecen el sistema inmune), Espinacas y brócoli (vitamina A  " +
                                                  "\n y C, 937 µg de vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune),        " +
                                                  "\n Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamación y fortalecer el sistema inmunológico), Miel         " +
                                                  "\n (propiedades antimicrobianas y suavizantes para la garganta, ayuda a reducir la irritación y la tos), Caldos calientes     " +
                                                  "\n (favorecen la hidratación y alivian la congestión nasal). Este es solo un diagnóstico predeterminado lógico, haberlo       " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda " +
                                                  "\n realizar más de un Diagnóstico de Mi Vida para mayor seguridad en el tratamiento. Además, por su salud, si la respuesta    " +
                                                  "\n del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a         " +
                                                  "\n la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n En adultos mayores, la diabetes puede generar complicaciones graves si no se controla adecuadamente.  " +
                                                  "\n HIDRATACIÓN: Es fundamental que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente ocho a   " +
                                                  "\n diez vasos de tamaño regular) para mantener una adecuada función renal y evitar la deshidratación, que puede      " +
                                                  "\n afectar los niveles de glucosa en sangre. La hidratación también ayuda a mejorar la circulación y la función      " +
                                                  "\n metabólica, lo que es clave para el control de la enfermedad. EJERCICIO: La actividad física debe ser moderada    " +
                                                  "\n y adaptada, como caminatas de 30 minutos diarios, ejercicios de bajo impacto como natación o yoga, siempre bajo   " +
                                                  "\n supervisión médica para evitar hipoglucemias. El ejercicio mejora la sensibilidad a la insulina, ayuda a controlar   " +
                                                  "\n los niveles de glucosa y fortalece el sistema cardiovascular. POSIBLE TRATAMIENTO: Para la diabetes en adultos       " +
                                                  "\n mayores, el tratamiento suele incluir medicamentos como metformina (Glucophage) para mejorar la sensibilidad a la    " +
                                                  "\n insulina, insulina en casos necesarios, y medicamentos como glibenclamida o sitagliptina para el control de la glucosa. " +
                                                  "\n Es clave mantener un monitoreo constante de los niveles de azúcar en sangre y seguir una dieta equilibrada.             " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en fibra, antioxidantes y nutrientes esenciales para el       " +
                                                  "\n control de la glucosa, tales como Avena (fibra soluble, 4 g por 100 g, ayuda a estabilizar los niveles de glucosa),     " +
                                                  "\n Frijoles (fibra y proteínas, 6 g de fibra por 100 g, contribuyen a la regulación del azúcar en sangre), Espinacas       " +
                                                  "\n (magnesio, 79 mg por 100 g, mejora la sensibilidad a la insulina), Naranjas (vitamina C, 50 mg por 100 g, fortalece el  " +
                                                  "\n sistema inmune y mejora la absorción de hierro), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamación " +
                                                  "\n y proteger las células), Canela (compuestos bioactivos, ayuda a mejorar la sensibilidad a la insulina). Este es solo un " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que " +
                                                  "\n el tratamiento sea el adecuado. Se recomienda realizar más de un Diagnóstico de Mi Vida para mayor seguridad en el   " +
                                                  "\n tratamiento. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar " +
                                                  "\n a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n En adultos mayores, el asma puede generar mayor dificultad respiratoria y riesgo de exacerbaciones, por lo que es  " +
                                                  "\n fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que el paciente mantenga    " +
                                                  "\n una hidratación adecuada, consumiendo al menos 2.5 litros de agua al día (aproximadamente diez vasos de tamaño     " +
                                                  "\n regular) para favorecer la eliminación de toxinas y mantener las vías respiratorias hidratadas, lo que ayuda a     " +
                                                  "\n reducir la viscosidad del moco y facilita la respiración. EJERCICIO: En cuanto a la actividad física, es recomendable " +
                                                  "\n realizar ejercicios de bajo impacto, como caminatas de 30 minutos diarios, natación o yoga, siempre bajo supervisión  " +
                                                  "\n médica para evitar complicaciones y fortalecer la función pulmonar. También es importante realizar ejercicios de      " +
                                                  "\n respiración profunda para mejorar la capacidad pulmonar y reducir la sensación de falta de aire. POSIBLE TRATAMIENTO: " +
                                                  "\n El tratamiento estándar para el asma incluye broncodilatadores de alivio rápido, como el salbutamol (Ventolin),       " +
                                                  "\n corticosteroides inhalados para el control a largo plazo, como la fluticasona (Flixotide), y en algunos casos,        " +
                                                  "\n modificadores de leucotrienos como el montelukast (Singulair). Es fundamental seguir estrictamente el plan de           " +
                                                  "\n acción para el asma indicado por el médico y usar los medicamentos preventivos regularmente. ALIMENTACIÓN RECOMENDADA:  " +
                                                  "\n Se recomienda el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales  " +
                                                  "\n como: Pescados grasos (salmón, atún): Ricos en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias y pueden " +
                                                  "\n ayudar a reducir la inflamación de las vías respiratorias, aportando aproximadamente el 50% del requerimiento diario por" +
                                                  "\n cada 100 gramos de salmón. Frutas y verduras de colores vivos (arándanos, fresas, espinacas, brócoli): Ricas en       " +
                                                  "\n antioxidantes como la vitamina C y carotenoides, que pueden proteger las células del daño y fortalecer el sistema     " +
                                                  "\n inmunológico, aportando cerca del 89% del requerimiento diario por cada 100 gramos de fresas. Jengibre: Contiene      " +
                                                  "\n compuestos con efectos antiinflamatorios que podrían ser beneficiosos para las vías respiratorias, ayudando a reducir " +
                                                  "\n la inflamación y mejorar la circulación sanguínea. Cúrcuma: Con su componente activo, la curcumina, también tiene     " +
                                                  "\n potentes propiedades antiinflamatorias y antioxidantes, contribuyendo a la reducción de la inflamación en los pulmones." +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta  " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar más de un  " +
                                                  "\n diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la    " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n En adultos mayores, el VIH/SIDA puede generar mayor vulnerabilidad a infecciones oportunistas y complicaciones sistémicas, " +
                                                  "\n por lo que es fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que el paciente       " +
                                                  "\n mantenga una hidratación adecuada, consumiendo al menos 2.5 litros de agua al día (aproximadamente diez vasos de tamaño    " +
                                                  "\n regular) para favorecer la eliminación de toxinas y mantener el sistema inmunológico fuerte, lo que ayuda a reducir la     " +
                                                  "\n fatiga y mejorar la función renal. EJERCICIO: En cuanto a la actividad física, es recomendable realizar ejercicios de bajo " +
                                                  "\n impacto, como caminatas de 30 minutos diarios, natación o yoga, siempre bajo supervisión médica para evitar complicaciones " +
                                                  "\n y fortalecer la función cardiovascular y muscular. También se recomienda ejercicios de resistencia para mejorar la masa    " +
                                                  "\n muscular, ya que el VIH puede causar pérdida de peso y debilitamiento muscular. POSIBLE TRATAMIENTO: El tratamiento estándar" +
                                                  "\n para el VIH/SIDA incluye terapia antirretroviral combinada (TAR), con medicamentos como tenofovir, emtricitabina y dolutegravir," +
                                                  "\n que ayudan a reducir la carga viral y mejorar la función inmunológica. Es fundamental seguir estrictamente el tratamiento   " +
                                                  "\n indicado por el médico y realizar controles periódicos para evaluar la respuesta al tratamiento. ALIMENTACIÓN RECOMENDADA:  " +
                                                  "\n Se recomienda el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a combatir infecciones, tales como:  " +
                                                  "\n Frutas cítricas (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece el sistema inmunológico y ayuda a reducir " +
                                                  "\n la duración de infecciones, aportando aproximadamente el 89% del requerimiento diario por cada 100 gramos. Yogur natural:   " +
                                                  "\n Contiene probióticos, que pueden ayudar a mantener el equilibrio de la flora bacteriana y mejorar la respuesta inmunológica," +
                                                  "\n proporcionando cerca del 20% del requerimiento diario de calcio por cada porción de 150 gramos. Verduras de hoja verde      " +
                                                  "\n (espinaca, acelga, brócoli): Ricas en antioxidantes y vitaminas esenciales para la recuperación, como la vitamina A, que    " +
                                                  "\n contribuye a la regeneración celular y aporta cerca del 56% del requerimiento diario por cada 100 gramos de espinaca. Omega-3" +
                                                  "\n (salmón, atún, chía): Con propiedades antiinflamatorias que pueden ayudar a reducir la inflamación y mejorar la respuesta    " +
                                                  "\n inmunológica, aportando aproximadamente el 50% del requerimiento diario por cada 100 gramos de salmón. Este es solo un       " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que      " +
                                                  "\n las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar más de un diagnóstico y consultar  " +
                                                  "\n a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n En adultos mayores, la gonorrea puede presentar síntomas más leves o atípicos, por lo que es fundamental un          " +
                                                  "\n diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que el paciente mantenga una hidratación     " +
                                                  "\n adecuada, consumiendo al menos 2 litros de agua al día (aproximadamente ocho vasos de tamaño regular) para favorecer " +
                                                  "\n la eliminación de toxinas y mantener el sistema inmunológico fuerte, lo que ayuda a reducir la inflamación y mejorar " +
                                                  "\n la función renal. EJERCICIO: En cuanto a la actividad física, es recomendable realizar ejercicio moderado, como      " +
                                                  "\n caminatas de 30 a 45 minutos diarios, siempre bajo supervisión médica para evitar complicaciones y fortalecer la     " +
                                                  "\n circulación sanguínea. También se recomienda ejercicios de movilidad para mejorar la función articular y reducir     " + 
                                                  "\n la fatiga. POSIBLE TRATAMIENTO: El tratamiento estándar para la gonorrea incluye antibióticos como la azitromicina   " +
                                                  "\n y ceftriaxona, los cuales deben ser administrados bajo prescripción médica. En casos más graves, puede requerirse    " +
                                                  "\n hospitalización para recibir antibióticos intravenosos. Es fundamental que el paciente evite el contacto íntimo      " +
                                                  "\n hasta completar el tratamiento y que su pareja también reciba tratamiento para evitar reinfecciones. ALIMENTACIÓN    " +
                                                  "\n RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a combatir la    " +
                                                  "\n infección, tales como: Ajo: Posee propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y   " +
                                                  "\n contiene alicina, un compuesto con efectos antibacterianos. Frutas cítricas (naranjas, limones, toronjas): Ricas en  " +
                                                  "\n vitamina C, que fortalece el sistema inmunológico y ayuda a reducir la duración de infecciones, aportando aproximadamente" +
                                                  "\n el 89% del requerimiento diario por cada 100 gramos. Yogur natural: Contiene probióticos, que pueden ayudar a mantener   " +
                                                  "\n el equilibrio de la flora bacteriana y mejorar la respuesta inmunológica, proporcionando cerca del 20% del requerimiento   " +
                                                  "\n diario de calcio por cada porción de 150 gramos. Verduras de hoja verde (espinaca, acelga, brócoli): Ricas en antioxidantes" +
                                                  "\n y vitaminas esenciales para la recuperación, como la vitamina A, que contribuye a la regeneración celular y aporta cerca" +
                                                  "\n del 56% del requerimiento diario por cada 100 gramos de espinaca. Este es solo un diagnóstico predeterminado lógico,    " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente  " +
                                                  "\n correctas. Para mayor seguridad, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer   " +
                                                  "\n el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n En adultos mayores, el herpes genital puede causar síntomas más prolongados y complicaciones debido a la disminución    " +
                                                  "\n de la respuesta inmunológica. EJERCICIO: Se recomienda actividad física moderada, como caminatas suaves y ejercicios    " +
                                                  "\n de movilidad para mejorar la circulación y reducir la fatiga. También es recomendable realizar ejercicios de relajación " +
                                                  "\n y respiración para reducir el estrés, ya que este puede desencadenar brotes de herpes. HIDRATACIÓN: Es esencial el      " +
                                                  "\n consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tamaño regular) para mantener el cuerpo hidratado" +
                                                  "\n y ayudar a reducir la inflamación. Además del agua pura, se recomienda el consumo de infusiones de hierbas, como té de  " +
                                                  "\n manzanilla o jengibre, que pueden ayudar a reducir la inflamación y mejorar la respuesta inmunológica. También es       " +
                                                  "\n beneficioso ingerir jugos naturales sin azúcar, que aportan antioxidantes y vitaminas esenciales. POSIBLE TRATAMIENTO:  " +
                                                  "\n El herpes genital se trata con antivirales, como aciclovir, valaciclovir o famciclovir, que ayudan a reducir la duración" +
                                                  "\n y gravedad de los brotes. También se recomienda el uso de cremas tópicas para aliviar el dolor y la irritación.         " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmunológico y reducir laç       " +
                                                  "\n inflamación, tales como arándanos, ricos en antioxidantes y vitamina C, aportando 25% de la ingesta diaria recomendada. " +
                                                  "\n Espinacas, que contienen hierro y vitamina A, esenciales para la recuperación, proporcionando 15% de la ingesta diaria  " +
                                                  "\n recomendada de hierro. jengibre, con propiedades antiinflamatorias y antioxidantes, aportando 5% de la ingesta diaria   " +
                                                  "\n recomendada de vitamina C. cúrcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes, proporcionando" +
                                                  "\n 3% de la ingesta diaria recomendada de antioxidantes. yogur natural, que contiene probióticos beneficiosos para la flora  " +
                                                  "\n intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio. Este es solo un diagnóstico predeterminado   " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean       " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer" +
                                                  "\n el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n En adultos mayores, la sífilis puede progresar a etapas avanzadas si no se trata adecuadamente, afectando      " +
                                                  "\n órganos internos y el sistema nervioso. EJERCICIO: Se recomienda actividad física moderada, como caminatas     " +
                                                  "\n suaves y ejercicios de movilidad para mejorar la circulación y reducir la fatiga. También es recomendable      " +
                                                  "\n realizar ejercicios de respiración y relajación para mejorar la oxigenación y reducir el estrés. HIDRATACIÓN:  " +
                                                  "\n Es fundamental el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tamaño regular) para  " +
                                                  "\n mantener el cuerpo hidratado y ayudar a reducir la inflamación. Además del agua pura, se recomienda el consumo " +
                                                  "\n de jugos naturales ricos en vitamina C, como jugo de naranja o toronja, que pueden fortalecer el sistema       " +
                                                  "\n inmunológico. También es beneficioso ingerir caldos ligeros, que aportan líquidos y minerales esenciales       " +
                                                  "\n para la recuperación. POSIBLE TRATAMIENTO: La sífilis se trata con antibióticos, como penicilina G benzatina,  " +
                                                  "\n que es el tratamiento de primera elección. En casos de alergia a la penicilina, se pueden utilizar doxiciclina " +
                                                  "\n o ceftriaxona. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema          " +
                                                  "\n inmunológico y reducir la inflamación, tales como ajo, que contiene alicina con propiedades antimicrobianas,   " +
                                                  "\n aportando 5% de la ingesta diaria recomendada de antioxidantes. jengibre, con efectos antiinflamatorios y      " +
                                                  "\n antioxidantes, aportando 5% de la ingesta diaria recomendada de vitamina C. cúrcuma, con curcumina, que tiene  " +
                                                  "\n propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes. " +
                                                  "\n frutas cítricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunológico, aportando" +
                                                  "\n 90 mg por cada 100 g de fruta, lo que representa 100% de la ingesta diaria recomendada. yogur natural, que contiene " +
                                                  "\n probióticos beneficiosos para la flora intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio.   " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga    " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un     " +
                                                  "\n diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a    " +
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n En adultos mayores, la tuberculosis puede ser grave debido a la disminución de la función pulmonar y la       " +
                                                  "\n posibilidad de complicaciones respiratorias. EJERCICIO: Se recomienda actividad física moderada, como         " +
                                                  "\n caminatas suaves y ejercicios de respiración para mejorar la capacidad pulmonar. También es recomendable      " +
                                                  "\n realizar ejercicios de movilidad y estiramientos para mejorar la circulación y reducir la fatiga. Debido      " +
                                                  "\n a que la tuberculosis afecta la función pulmonar, es importante realizar ejercicios de respiración profunda,  " +
                                                  "\n como la técnica de respiración diafragmática, que ayuda a mejorar la oxigenación y reducir la sensación de    " +
                                                  "\n falta de aire. También se recomienda la respiración con labios fruncidos, que permite controlar la exhalación " +
                                                  "\n y mejorar la eficiencia respiratoria. HIDRATACIÓN: Es esencial el consumo diario de 2.5 a 3 litros de agua    " +
                                                  "\n (diez a doce vasos de agua de tamaño regular) para mantener el cuerpo hidratado y ayudar a reducir la inflamación     " +
                                                  "\n de las vías respiratorias. Además del agua pura, se recomienda el consumo de infusiones de hierbas, como té de        " +
                                                  "\n jengibre o manzanilla, que pueden ayudar a reducir la inflamación y mejorar la respiración. También es beneficioso    " +
                                                  "\n ingerir jugos naturales sin azúcar, que aportan antioxidantes y vitaminas esenciales para la función pulmonar.        " +
                                                  "\n POSIBLE TRATAMIENTO: La tuberculosis se trata con antibióticos específicos, como isoniazida, rifampicina,             " +
                                                  "\n pirazinamida y etambutol, administrados en un régimen prolongado de varios meses. En casos graves, se puede requerir  " +
                                                  "\n hospitalización y oxígeno suplementario. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer  " +
                                                  "\n el sistema respiratorio y reducir la inflamación, tales como pescados grasos (salmón, atún), ricos en ácidos grasos   " +
                                                  "\n Omega-3, que poseen propiedades antiinflamatorias, aportando 50% de la ingesta diaria recomendada de Omega-3. frutas  " +
                                                  "\n y verduras de colores vivos (arándanos, fresas, espinacas, brócoli), ricas en antioxidantes como la vitamina C y      " +
                                                  "\n carotenoides, que pueden proteger las células del daño y fortalecer el sistema inmunológico, aportando 70% de la      " +
                                                  "\n ingesta diaria recomendada de vitamina C. jengibre, que contiene compuestos con efectos antiinflamatorios que podrían " +
                                                  "\n ser beneficiosos para las vías respiratorias, aportando 5% de la ingesta diaria recomendada de vitamina C. cúrcuma,   " +
                                                  "\n con su componente activo, la curcumina, que tiene potentes propiedades antiinflamatorias y antioxidantes,             " +
                                                  "\n proporcionando 3% de la ingesta diaria recomendada de antioxidantes. Este es solo un diagnóstico predeterminado       " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean      " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para         " +
                                                  "\n establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n En adultos mayores, la artritis puede causar dolor crónico y afectar la movilidad, lo que impacta la calidad       " +
                                                  "\n de vida. HIDRATACIÓN: Es fundamental que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente  " +
                                                  "\n ocho a diez vasos de tamaño regular) para mantener la lubricación de las articulaciones y reducir la inflamación.  " +
                                                  "\n La hidratación también ayuda a eliminar toxinas y mejorar la circulación, lo que favorece la regeneración de los   " +
                                                  "\n tejidos articulares. EJERCICIO: La actividad física debe ser moderada y adaptada, como ejercicios de bajo impacto  " +
                                                  "\n como natación, yoga o caminatas de 30 minutos diarios. El ejercicio fortalece los músculos que rodean las          " +
                                                  "\n articulaciones, mejora la flexibilidad y reduce la rigidez matutina. POSIBLE TRATAMIENTO: Para la artritis         " +
                                                  "\n en adultos mayores, el tratamiento suele incluir antiinflamatorios como ibuprofeno o naproxeno, medicamentos       " +
                                                  "\n modificadores de la enfermedad como metotrexato, y en algunos casos, terapias biológicas. También se recomienda    " +
                                                  "\n fisioterapia para mejorar la movilidad y reducir el dolor. ALIMENTACIÓN: Se recomienda el consumo de alimentos     " +
                                                  "\n ricos en antioxidantes, ácidos grasos esenciales y minerales para fortalecer las articulaciones y reducir la       " +
                                                  "\n inflamación, tales como Pescados grasos (salmón, Omega-3, 2 g por 100 g, ayuda a reducir la inflamación articular)," +
                                                  "\n Frutas y verduras de colores vivos (arándanos, fresas, espinacas, brócoli, vitamina C, 89 mg por 100 g, fortalece    " +
                                                  "\n el sistema inmune y protege las células del daño oxidativo), Jengibre (compuestos antiinflamatorios, ayuda a reducir " +
                                                  "\n el dolor articular), Cúrcuma (curcumina, 3% de concentración, potente antioxidante y antiinflamatorio), Almendras    " +
                                                  "\n (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamación y proteger las células). Este es solo un diagnóstico    " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el       " +
                                                  "\n tratamiento sea el adecuado. Se recomienda realizar más de un Diagnóstico de Mi Vida para mayor seguridad en el      " +
                                                  "\n tratamiento. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar " +
                                                  "\n a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n En adultos mayores, la tosferina puede ser grave y causar complicaciones respiratorias si no se trata adecuadamente.  " +
                                                  "\n HIDRATACIÓN: Es esencial que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente ocho a diez     " +
                                                  "\n vasos de tamaño regular) para mantener las vías respiratorias hidratadas y reducir la viscosidad de las secreciones.  " +
                                                  "\n La hidratación también ayuda a calmar la irritación de la garganta y mejorar la función pulmonar. EJERCICIO: La       " +
                                                  "\n actividad física debe ser mínima y adaptada, como ejercicios de respiración y movilidad pasiva, evitando esfuerzos    " +
                                                  "\n excesivos que puedan comprometer la recuperación. Movilizar el cuerpo de manera controlada ayuda a prevenir la rigidez" +
                                                  "\n muscular y mejora la circulación, lo que favorece la recuperación. POSIBLE TRATAMIENTO: Para la tosferina en adultos  " +
                                                  "\n mayores, el tratamiento suele incluir antibióticos como azitromicina o eritromicina para eliminar la bacteria, además " +
                                                  "\n de medicamentos para aliviar la tos y reducir la inflamación de las vías respiratorias. También se recomienda el uso  " + 
                                                  "\n de humidificadores para mejorar la respiración. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en          " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmune y mejorar la recuperación, tales como Frutas  " +
                                                  "\n cítricas (naranjas, limones, vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora la absorción de hierro)," +
                                                  "\n Espinacas (vitamina A y C, 937 µg de vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la " +
                                                  "\n respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamación y proteger las células), Miel" +
                                                  "\n (propiedades antimicrobianas y suavizantes para la garganta, ayuda a reducir la irritación y la tos), Caldos calientes " +
                                                  "\n (favorecen la hidratación y alivian la congestión nasal). Este es solo un diagnóstico predeterminado lógico, haberlo   " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se        " +
                                                  "\n recomienda realizar más de un Diagnóstico de Mi Vida para mayor seguridad en el tratamiento. Además, por su salud, si  " +
                                                  "\n la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n En adultos mayores, las paperas pueden causar inflamación severa de las glándulas salivales y generar               " +
                                                  "\n complicaciones si no se manejan adecuadamente. HIDRATACIÓN: Es recomendable que el paciente consuma entre           " +
                                                  "\n 2 y 2.5 litros de agua al día (aproximadamente ocho a diez vasos de tamaño regular) para mantener una adecuada      " +
                                                  "\n función renal y evitar la deshidratación, que puede afectar la recuperación. La hidratación también ayuda a         " +
                                                  "\n reducir la inflamación de las glándulas y mejorar la producción de saliva. EJERCICIO: La actividad física debe      " +
                                                  "\n ser moderada y adaptada, como caminatas de 30 minutos diarios, ejercicios de bajo impacto como yoga o natación,     " +
                                                  "\n siempre bajo supervisión médica para evitar fatiga extrema. El ejercicio mejora la circulación, fortalece los       " +
                                                  "\n músculos y ayuda a reducir los efectos secundarios de la inflamación. POSIBLE TRATAMIENTO: Para las paperas en      " +
                                                  "\n adultos mayores, el tratamiento suele incluir analgésicos como paracetamol o ibuprofeno para reducir el dolor y     " +
                                                  "\n la fiebre, además de reposo y aislamiento para evitar la propagación del virus. También se recomienda la aplicación " +
                                                  "\n de compresas frías en la zona inflamada. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes," +
                                                  "\n proteínas y nutrientes esenciales para fortalecer el sistema inmune y mejorar la recuperación, tales como Frutas    " +
                                                  "\n cítricas (naranjas, limones, vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora la absorción de hierro)," +
                                                  "\n Espinacas (vitamina A y C, 937 µg de vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y    " +
                                                  "\n la respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamación y proteger las células),  " +
                                                  "\n Yogur natural (probióticos, mejora la salud intestinal y fortalece el sistema inmune), Pescados grasos (salmón,        " +
                                                  "\n Omega-3, 2 g por 100 g, ayuda a reducir la inflamación y mejorar la función celular). Este es solo un diagnóstico      " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento  " +
                                                  "\n sea el adecuado. Se recomienda realizar más de un Diagnóstico de Mi Vida para mayor seguridad en el tratamiento. Además,    " +
                                                  "\n por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n En adultos mayores, el virus del Zika puede causar síntomas más intensos y prolongados, aumentando el riesgo de            " +
                                                  "\n complicaciones neurológicas, por lo que es fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN:        " +
                                                  "\n Se recomienda que el paciente mantenga una hidratación adecuada, consumiendo al menos 2.5 litros de agua al día            " +
                                                  "\n (aproximadamente diez vasos de tamaño regular) para favorecer la eliminación de toxinas y mantener el sistema inmunológico " +
                                                  "\n fuerte, lo que ayuda a reducir la fatiga y mejorar la función renal. EJERCICIO: En cuanto a la actividad física, es        " +
                                                  "\n recomendable realizar ejercicios de bajo impacto, como caminatas de 30 minutos diarios, natación o yoga, siempre bajo      " +
                                                  "\n supervisión médica para evitar complicaciones y fortalecer la función cardiovascular. También se recomienda ejercicios     " +
                                                  "\n de movilidad para mejorar la circulación sanguínea y reducir la inflamación. POSIBLE TRATAMIENTO: No existe un tratamiento " +
                                                  "\n antiviral específico para el Zika, por lo que el manejo es sintomático. Se recomienda el uso de analgésicos como paracetamol " +
                                                  "\n para aliviar la fiebre y el malestar, antihistamínicos para reducir el prurito y reposo adecuado. Es fundamental evitar el   " +
                                                  "\n uso de aspirina y otros antiinflamatorios no esteroides sin supervisión médica. ALIMENTACIÓN RECOMENDADA: Se recomienda el   " +
                                                  "\n consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a combatir la infección, tales como: Frutas cítricas   " +
                                                  "\n (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece el sistema inmunológico y ayuda a reducir la duración de   " +
                                                  "\n infecciones, aportando aproximadamente el 89% del requerimiento diario por cada 100 gramos. Jengibre: Contiene compuestos    " +
                                                  "\n con efectos antiinflamatorios que pueden ayudar a reducir la fiebre y el malestar general. Verduras de hoja verde (espinaca, " +
                                                  "\n acelga, brócoli): Ricas en antioxidantes y vitaminas esenciales para la recuperación, como la vitamina A, que contribuye a   " +
                                                  "\n la regeneración celular y aporta cerca del 56% del requerimiento diario por cada 100 gramos de espinaca. Omega-3 (salmón,    " +
                                                  "\n atún, chía): Con propiedades antiinflamatorias que pueden ayudar a reducir la inflamación y mejorar la respuesta inmunológica," +
                                                  "\n aportando aproximadamente el 50% del requerimiento diario por cada 100 gramos de salmón. Este es solo un diagnóstico          " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas    " +
                                                  "\n sean completamente correctas. Para mayor seguridad, se recomienda realizar más de un diagnóstico y consultar a un médico      " +
                                                  "\n para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n En adultos mayores, el rotavirus puede causar deshidratación severa y complicaciones gastrointestinales, por lo         " +
                                                  "\n que es fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que el paciente           " +
                                                  "\n mantenga una hidratación adecuada, consumiendo al menos 3 litros de agua al día (aproximadamente doce vasos de          " +
                                                  "\n tamaño regular) para compensar la pérdida de líquidos y evitar la deshidratación. EJERCICIO: En cuanto a la             " +
                                                  "\n actividad física, es recomendable realizar ejercicios de bajo impacto, como caminatas suaves de 20 minutos diarios,     " +
                                                  "\n siempre bajo supervisión médica para evitar complicaciones y fortalecer la función digestiva. POSIBLE TRATAMIENTO:      " +
                                                  "\n No existe un tratamiento antiviral específico para el rotavirus, por lo que el manejo es sintomático. Se recomienda     " +
                                                  "\n el uso de soluciones de rehidratación oral para evitar la deshidratación, así como una dieta blanda y de fácil digestión.  " +
                                                  "\n En casos graves, puede requerirse hospitalización para administración de líquidos intravenosos. ALIMENTACIÓN RECOMENDADA:  " +
                                                  "\n Se recomienda el consumo de alimentos que fortalezcan el sistema digestivo y ayuden a combatir la infección, tales como:   " +
                                                  "\n Plátano: Rico en potasio, que ayuda a reemplazar los electrolitos perdidos debido a la diarrea, aportando aproximadamente  " +
                                                  "\n el 12% del requerimiento diario por cada 100 gramos. Yogur natural: Contiene probióticos, que pueden ayudar a restaurar    " +
                                                  "\n la flora intestinal y mejorar la digestión, proporcionando cerca del 20% del requerimiento diario de calcio por cada       " +
                                                  "\n porción de 150 gramos. Arroz blanco: Fuente de carbohidratos de fácil digestión que ayuda a estabilizar el sistema         " +
                                                  "\n digestivo y aporta energía sin irritar el estómago. Zanahoria: Rica en vitamina A, que contribuye a la regeneración        " +
                                                  "\n celular y fortalece la mucosa intestinal, aportando cerca del 56% del requerimiento diario por cada 100 gramos. Este       " +
                                                  "\n es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad " +
                                                  "\n ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar más de un diagnóstico y    " +
                                                  "\n consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera" +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n En adultos mayores, la listeriosis puede causar infecciones graves y afectar el sistema nervioso, por lo         " +
                                                  "\n que es fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que el             " +
                                                  "\n paciente mantenga una hidratación adecuada, consumiendo al menos 2.5 litros de agua al día (aproximadamente      " +
                                                  "\n diez vasos de tamaño regular) para favorecer la eliminación de toxinas y mantener el sistema inmunológico        " +
                                                  "\n fuerte. EJERCICIO: En cuanto a la actividad física, es recomendable realizar ejercicios de bajo impacto, como    " +
                                                  "\n caminatas de 30 minutos diarios, natación o yoga, siempre bajo supervisión médica para evitar complicaciones     " +
                                                  "\n y fortalecer la función inmunológica. POSIBLE TRATAMIENTO: El tratamiento estándar para la listeriosis incluye   " +
                                                  "\n antibióticos como ampicilina y gentamicina, administrados bajo prescripción médica. En casos graves, puede       " +
                                                  "\n requerirse hospitalización para administración de antibióticos intravenosos. ALIMENTACIÓN RECOMENDADA: Se        " +
                                                  "\n recomienda el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a combatir la infección,     " +
                                                  "\n tales como: Ajo: Posee propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene " +
                                                  "\n alicina, un compuesto con efectos antibacterianos. Frutas cítricas (naranjas, limones, toronjas): Ricas en vitamina C," +
                                                  "\n que fortalece el sistema inmunológico y ayuda a reducir la duración de infecciones, aportando aproximadamente el      " +
                                                  "\n 89% del requerimiento diario por cada 100 gramos. Yogur natural: Contiene probióticos, que pueden ayudar a mantener   " +
                                                  "\n el equilibrio de la flora bacteriana y mejorar la respuesta inmunológica, proporcionando cerca del 20% del            " +
                                                  "\n requerimiento diario de calcio por cada porción de 150 gramos. Verduras de hoja verde (espinaca, acelga, brócoli):    " +
                                                  "\n Ricas en antioxidantes y vitaminas esenciales para la recuperación, como la vitamina A, que contribuye a la           " +
                                                  "\n regeneración celular y aporta cerca del 56% del requerimiento diario por cada 100 gramos de espinaca. Este es    " +
                                                  "\n solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta    " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar más  " +
                                                  "\n de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu    " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n En adultos mayores, la shigelosis puede causar diarrea severa y deshidratación, lo que puede ser peligroso           " +
                                                  "\n si no se trata adecuadamente. EJERCICIO: Se recomienda actividad física ligera, como caminatas cortas, evitando      " +
                                                  "\n esfuerzos excesivos que puedan agravar la deshidratación. También es recomendable realizar ejercicios de movilidad   " +
                                                  "\n y estiramientos para mejorar la circulación y reducir la fatiga. Debido a que la shigelosis causa diarrea y pérdida  " +
                                                  "\n de líquidos, es importante evitar ejercicios que generen sudoración excesiva y optar por movimientos suaves que      " +
                                                  "\n ayuden a mantener la actividad sin comprometer la hidratación. HIDRATACIÓN: Es crucial el consumo diario de 2.5 a 3  " +
                                                  "\n litros de agua (diez a doce vasos de agua de tamaño regular) para compensar la pérdida de líquidos y evitar la       " +
                                                  "\n deshidratación. Además del agua pura, se recomienda el consumo de soluciones de rehidratación oral para reponer      " +
                                                  "\n electrolitos esenciales como sodio y potasio. También es beneficioso ingerir agua de coco, que contiene electrolitos " +
                                                  "\n naturales, y caldos ligeros, que aportan líquidos y minerales esenciales para la recuperación. POSIBLE TRATAMIENTO:  " +
                                                  "\n La shigelosis se trata con antibióticos, como azitromicina, ciprofloxacino o ceftriaxona, dependiendo de la gravedad " +
                                                  "\n del caso. En casos severos, puede ser necesario el uso de terapia intravenosa para la rehidratación y el control de  " +
                                                  "\n síntomas. También se recomienda el uso de probióticos, que pueden ayudar a restaurar la flora intestinal y mejorar   " +
                                                  "\n la recuperación. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a reponer líquidos y fortalecer el   " +
                                                  "\n sistema digestivo, tales como plátanos, ricos en potasio, que ayudan a reemplazar los electrolitos perdidos, aportando   " +
                                                  "\n 10% de la ingesta diaria recomendada de potasio. arroz blanco, que es fácil de digerir y ayuda a estabilizar el sistema  " +
                                                  "\n digestivo, proporcionando 20% de la ingesta diaria recomendada de carbohidratos. zanahorias, ricas en vitamina A, que    " +
                                                  "\n ayudan a la recuperación del sistema digestivo, aportando 50% de la ingesta diaria recomendada de vitamina A. agua de    " +
                                                  "\n coco, que ayuda a la hidratación y aporta electrolitos esenciales. yogur natural, que contiene probióticos beneficiosos  " +
                                                  "\n para la flora intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio. Este es solo un diagnóstico     " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas" +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para  " +
                                                  "\n establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n En adultos mayores, la EPOC puede causar dificultad para respirar y fatiga, afectando la calidad de vida.             " +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada, como caminatas suaves y ejercicios de respiración para mejorar    " +
                                                  "\n la capacidad pulmonar. También es recomendable realizar ejercicios de movilidad y estiramientos para mejorar la       " +
                                                  "\n circulación y reducir la fatiga. Debido a que la EPOC afecta la función pulmonar, es importante realizar ejercicios   " +
                                                  "\n de respiración profunda, como la técnica de respiración diafragmática, que ayuda a mejorar la oxigenación y reducir   " +
                                                  "\n la sensación de falta de aire. También se recomienda la respiración con labios fruncidos, que permite controlar la    " +
                                                  "\n exhalación y mejorar la eficiencia respiratoria. HIDRATACIÓN: Es esencial el consumo diario de 2.5 a 2.75 litros de   " +
                                                  "\n agua (ocho a diez vasos de agua de tamaño regular) para mantener el cuerpo hidratado y ayudar a reducir la inflamación   " +
                                                  "\n de las vías respiratorias. Además del agua pura, se recomienda el consumo de infusiones de hierbas, como té de jengibre  " +
                                                  "\n o manzanilla, que pueden ayudar a reducir la inflamación y mejorar la respiración. También es beneficioso ingerir jugos  " +
                                                  "\n naturales sin azúcar, que aportan antioxidantes y vitaminas esenciales para la función pulmonar. POSIBLE TRATAMIENTO:    " +
                                                  "\n La EPOC se trata con broncodilatadores, como salbutamol, tiotropio o formoterol, además de corticosteroides inhalados,   " +
                                                  "\n como fluticasona o budesonida. En casos graves, se puede requerir oxígeno suplementario y rehabilitación pulmonar, que   " +
                                                  "\n incluye técnicas de respiración y ejercicios para mejorar la capacidad pulmonar. También se recomienda el uso de         " +
                                                  "\n antibióticos en caso de infecciones respiratorias secundarias y terapia de eliminación de secreciones, como drenaje      " +
                                                  "\n postural y fisioterapia respiratoria. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el     " +
                                                  "\n sistema respiratorio y reducir la inflamación, tales como pescados grasos (salmón, atún), ricos en ácidos grasos Omega-3," +
                                                  "\n que poseen propiedades antiinflamatorias, aportando 50% de la ingesta diaria recomendada de Omega-3. frutas y verduras de" +
                                                  "\n colores vivos (arándanos, fresas, espinacas, brócoli), ricas en antioxidantes como la vitamina C y carotenoides, que     " +
                                                  "\n pueden proteger las células del daño y fortalecer el sistema inmunológico, aportando 70% de la ingesta diaria recomendada" +
                                                  "\n de vitamina C. jengibre, que contiene compuestos con efectos antiinflamatorios que podrían ser beneficiosos para las vías" +
                                                  "\n respiratorias, aportando 5% de la ingesta diaria recomendada de vitamina C. cúrcuma, con su componente activo, la curcumina," +
                                                  "\n que tiene potentes propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de   " +
                                                  "\n antioxidantes. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un     " +
                                                  "\n diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app   " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n En adultos mayores, la clamidia puede causar síntomas prolongados y complicaciones si no se trata adecuadamente.       " +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada, como caminatas suaves y ejercicios de movilidad para mejorar la    " +
                                                  "\n circulación y reducir la fatiga. También es recomendable realizar ejercicios de relajación y respiración para reducir  " +
                                                  "\n el estrés, ya que este puede afectar la respuesta inmunológica y prolongar la infección. HIDRATACIÓN: Es esencial el   " +
                                                  "\n consumo diario de 2.5 a 2.75 litros de agua (ocho a diez vasos de agua de tamaño regular) para mantener el cuerpo      " +
                                                  "\n hidratado y ayudar a reducir la inflamación. Además del agua pura, se recomienda el consumo de jugos naturales ricos en    " +
                                                  "\n vitamina C, como jugo de naranja o toronja, que pueden fortalecer el sistema inmunológico. También es beneficioso ingerir  " +
                                                  "\n caldos ligeros, que aportan líquidos y minerales esenciales para la recuperación. POSIBLE TRATAMIENTO: La clamidia se trata" +
                                                  "\n con antibióticos, como azitromicina o doxiciclina, administrados en un régimen de varios días. En casos más severos, se    " +
                                                  "\n puede requerir tratamiento prolongado con antibióticos adicionales, como levofloxacino o eritromicina, dependiendo de la   " +
                                                  "\n resistencia bacteriana. También se recomienda el uso de probióticos para restaurar la flora intestinal y mejorar la        " +
                                                  "\n recuperación. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmunológico y        " +
                                                  "\n reducir la inflamación, tales como arándanos, ricos en antioxidantes y vitamina C, aportando 25% de la ingesta diaria      " +
                                                  "\n recomendada. espinacas, que contienen hierro y vitamina A, esenciales para la recuperación, proporcionando 15% de la       " + 
                                                  "\n ingesta diaria recomendada de hierro. jengibre, con propiedades antiinflamatorias y antioxidantes, aportando 5% de la      " +
                                                  "\n ingesta diaria recomendada de vitamina C. cúrcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes, " +
                                                  "\n proporcionando 3% de la ingesta diaria recomendada de antioxidantes. yogur natural, que contiene probióticos beneficiosos  " +
                                                  "\n para la flora intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio. Este es solo un diagnóstico       " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer" +
                                                  "\n el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n En adultos mayores, la meningitis bacteriana puede ser grave y requiere atención médica inmediata.           " +
                                                  "\n HIDRATACIÓN: Es esencial que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente ocho   " +
                                                  "\n a diez vasos de tamaño regular) para mantener una adecuada función cerebral y evitar la deshidratación, que  " +
                                                  "\n puede agravar los síntomas neurológicos. La hidratación es clave para mantener el equilibrio de electrolitos " +
                                                  "\n y mejorar la función cognitiva, reduciendo el riesgo de complicaciones neurológicas. Además, el agua ayuda a     " +
                                                  "\n regular la temperatura corporal y a prevenir la acumulación de toxinas que pueden afectar el sistema nervioso.   " +
                                                  "\n EJERCICIO: La actividad física debe ser mínima y adaptada, como ejercicios de respiración y movilidad pasiva,    " +
                                                  "\n evitando esfuerzos excesivos que puedan comprometer la recuperación. Movilizar el cuerpo de manera controlada    " +
                                                  "\n ayuda a prevenir la rigidez muscular y mejora la circulación, lo que favorece la recuperación. También es recomendable  " +
                                                  "\n realizar ejercicios de estiramiento suaves para evitar la pérdida de movilidad y mejorar la oxigenación de los tejidos. " +
                                                  "\n POSIBLE TRATAMIENTO: Para la meningitis bacteriana en adultos mayores, el tratamiento suele incluir antibióticos       " +
                                                  "\n intravenosos como ceftriaxona o vancomicina, dependiendo del agente causal. También se recomienda el uso de            " +
                                                  "\n corticosteroides para reducir la inflamación cerebral y en algunos casos, soporte respiratorio. ALIMENTACIÓN:          " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema        " +
                                                  "\n inmune y mejorar la recuperación, tales como Frutas cítricas (naranjas, limones, vitamina C, fortalece el sistema      " +
                                                  "\n inmune y mejora la absorción de hierro), Espinacas (vitamina A y C, esenciales para la salud celular y la respuesta    " +
                                                  "\n inmune), Almendras (vitamina E, ayuda a reducir la inflamación y proteger las células), Yogur natural (probióticos,    " +
                                                  "\n mejora la salud intestinal y fortalece el sistema inmune), Pescados grasos (salmón, Omega-3, ayuda a reducir la        " +
                                                  "\n inflamación y mejorar la función celular). Este es solo un diagnóstico predeterminado lógico, haberlo consultado       " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda        " +
                                                  "\n realizar más de un Diagnóstico de Mi Vida para mayor seguridad en el tratamiento. Además, por su salud, si la respuesta" +
                                                  "\n del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n En adultos mayores, el cáncer requiere un enfoque integral para mejorar la calidad de vida y el tratamiento.                 " +
                                                  "\n HIDRATACIÓN: Es recomendable que el paciente consuma entre 2 y 2.5 litros de agua al día (aproximadamente ocho a diez vasos     " +
                                                  "\n de tamaño regular) para mantener una adecuada función renal y evitar la deshidratación, que puede afectar la tolerancia a los   " +
                                                  "\n tratamientos oncológicos. La hidratación también ayuda a reducir la fatiga y mejorar la función celular, lo que es crucial      " +
                                                  "\n para la recuperación. Además, el agua facilita la eliminación de toxinas generadas por los tratamientos y mejora la absorción   " +
                                                  "\n de nutrientes esenciales para la regeneración celular. EJERCICIO: La actividad física debe ser moderada y adaptada, como        " +
                                                  "\n caminatas de 30 minutos diarios, ejercicios de bajo impacto como yoga o natación, siempre bajo supervisión médica para evitar   " +
                                                  "\n fatiga extrema. El ejercicio mejora la circulación, fortalece los músculos y ayuda a reducir los efectos secundarios del        " +
                                                  "\n tratamiento, como la fatiga y la pérdida de masa muscular. También se recomienda la práctica de ejercicios de resistencia para  " +
                                                  "\n mantener la fuerza muscular y mejorar la movilidad. POSIBLE TRATAMIENTO: Para el cáncer en adultos mayores, el tratamiento suele     " +
                                                  "\n incluir quimioterapia, radioterapia o inmunoterapia, dependiendo del tipo y estadio del cáncer. También se recomienda un enfoque     " +
                                                  "\n multidisciplinario con apoyo nutricional y psicológico. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes,  " +
                                                  "\n proteínas y nutrientes esenciales para fortalecer el sistema inmune y mejorar la recuperación, tales como Frutas cítricas (naranjas, " +
                                                  "\n limones, vitamina C, fortalece el sistema inmune y mejora la absorción de hierro), Espinacas (vitamina A y C, esenciales para la     " +
                                                  "\n salud celular y la respuesta inmune), Almendras (vitamina E, ayuda a reducir la inflamación y proteger las células), Yogur natural   " +
                                                  "\n (probióticos, mejora la salud intestinal y fortalece el sistema inmune), Pescados grasos (salmón, Omega-3, ayuda a reducir la        " +
                                                  "\n inflamación y mejorar la función celular). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al     " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar más de un Diagnóstico de    " +
                                                  "\n Mi Vida para mayor seguridad en el tratamiento. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se   " +
                                                  "\n recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        
                        }
                 }
            }
        if (EdadMasculino.equals("Ancianidad = 75 años o mas")) {
            frame.setVisible(true);
        } else {
            frame.setVisible(false);
        }
        }
        
        public Estudio7() {
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
        Estudio7 ventanaEstudio7 = new Estudio7();
        ventanaEstudio7.crearInterfaz();
    }
}