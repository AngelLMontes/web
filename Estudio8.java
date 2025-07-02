import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Estudio8 implements ActionListener{
    
         protected final JLabel label1;
         protected JScrollPane scrollpane1;
         protected JTextArea textarea1;
         private JFrame frame;
         private final String edadEsperada = "Infancia = 0-9 años";
         private String edadRecibida;
         
        public Estudio8(String nombrePaciente, String Sexo, String EdadFemenino, 
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
                 if(EdadFemenino.equals("Infancia = 0-9 años")){
                        if(EstaturaFemenino.equals("0.80-1.35 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice cerca de 60 minutos de actividad física moderada a intensa diaria,    " +
                                                  "\n aunque esta cantidad puede ajustarse según su edad y condición. Para los más pequeños, actividades suaves como       " +
                                                  "\n juegos activos pueden ser más apropiadas. HIDRATACIÓN: Se recomienda el consumo diario de 1.5 a 1.7 litros de        " +
                                                  "\n agua al día (seis a siete vasos de tamaño regular) para mantener una adecuada hidratación y ayudar a la recuperación." +
                                                  "\n POSIBLE TRATAMIENTO: Para la gripe en niñas, el tratamiento suele incluir medicamentos para reducir la fiebre y      " +
                                                  "\n aliviar los síntomas, como el paracetamol (Tempra) o el ibuprofeno. También pueden utilizarse antivirales específicos" +
                                                  "\n contra la gripe, como el oseltamivir (Tamiflu). Además, es importante el descanso y la ingesta de líquidos para      " +
                                                  "\n facilitar la recuperación. ALIMENTACIÓN: Se recomienda el consumo de frutas y verduras que fortalezcan el sistema    " +
                                                  "\n inmune, tales como Naranjas: ricas en vitamina C (89% del consumo diario recomendado por cada 100g), que ayuda a     " +
                                                  "\n reducir la duración de los síntomas. Fresas: contienen antioxidantes y vitamina C (98% del consumo diario            " +
                                                  "\n recomendado por cada 100g), esenciales para la recuperación. Plátanos: ricos en potasio (12% del consumo diario      " +
                                                  "\n recomendado por cada 100g), que puede ayudar a reemplazar los electrolitos perdidos debido a la fiebre y sudoración. " +
                                                  "\n Kiwi: alto en vitamina C (154% del consumo diario recomendado por cada 100g) y potasio (10% del consumo diario       " +
                                                  "\n recomendado por cada 100g), beneficioso para el sistema inmunológico. Jengibre: con propiedades antiinflamatorias    " +
                                                  "\n que pueden aliviar la congestión y mejorar la respuesta inmune. Miel: puede ayudar a calmar la tos en niñas mayores  " +
                                                  "\n de un año y tiene propiedades antimicrobianas. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas.       " +
                                                  "\n Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud,  " +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes        " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física moderada, evitando esfuerzos excesivos que         " +
                                                  "\n puedan agravar la dificultad respiratoria. Se sugiere ejercicios suaves como caminatas cortas o juegos             " +
                                                  "\n tranquilos en casa. HIDRATACIÓN: Se recomienda el consumo diario de 1.5 a 2 litros de agua al día (seis a ocho     " +
                                                  "\n vasos de tamaño regular) para mantener una adecuada hidratación y ayudar a fluidificar las secreciones pulmonares. " +
                                                  "\n POSIBLE TRATAMIENTO: Para la neumonía en niñas, el tratamiento suele incluir antibióticos en caso de infección     " +
                                                  "\n bacteriana, como amoxicilina o azitromicina, y en casos virales, se recomienda reposo, hidratación y control de    " +
                                                  "\n fiebre con paracetamol (Tempra) o ibuprofeno. En casos graves, puede requerirse hospitalización con oxígeno y      " +
                                                  "\n fisioterapia respiratoria. ALIMENTACIÓN: Se recomienda el consumo de alimentos que fortalezcan el sistema inmune   " +
                                                  "\n y ayuden a la recuperación, tales como Naranjas: ricas en vitamina C (89% del consumo diario recomendado por cada  " +
                                                  "\n 100g), que ayuda a mejorar la respuesta inmunológica. Espinacas: contienen hierro (15% del consumo diario recomendado " +
                                                  "\n por cada 100g) y vitamina A (56% del consumo diario recomendado por cada 100g), esenciales para la regeneración       " +
                                                  "\n celular. Jengibre: con propiedades antiinflamatorias que pueden aliviar la congestión y mejorar la respuesta inmune.  " +
                                                  "\n Miel: ayuda a calmar la tos y tiene propiedades antimicrobianas. Este es solo un diagnóstico predeterminado lógico.   " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente  " +
                                                  "\n correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por    " +
                                                  "\n su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice 60 minutos de actividad física moderada al día, incluyendo juegos    " +
                                                  "\n activos, caminatas o deportes adaptados, lo que ayuda a mejorar la sensibilidad a la insulina y controlar los       " +
                                                  "\n niveles de glucosa. HIDRATACIÓN: Se recomienda el consumo diario de 1.5 a 2 litros de agua al día (seis a ocho      " +
                                                  "\n vasos de tamaño regular) para mantener una adecuada hidratación y evitar fluctuaciones en los niveles de glucosa.   " +
                                                  "\n POSIBLE TRATAMIENTO: Para la diabetes infantil, el tratamiento suele incluir insulina en el caso de diabetes tipo 1,  " +
                                                  "\n administrada bajo supervisión médica. En diabetes tipo 2, se recomienda control de la alimentación, ejercicio y en    " +
                                                  "\n algunos casos, metformina. Es fundamental el monitoreo regular de la glucosa en sangre. ALIMENTACIÓN: Se recomienda   " +
                                                  "\n el consumo de alimentos que ayuden a estabilizar los niveles de glucosa, tales como Avena: rica en fibra soluble      " +
                                                  "\n (10% del consumo diario recomendado por cada 100g), que ayuda a regular la absorción de glucosa. Frutos secos:        " +
                                                  "\n contienen grasas saludables y magnesio (15% del consumo diario recomendado por cada 100g), que contribuyen al         " +
                                                  "\n metabolismo de la glucosa. Brócoli: alto en fibra y vitamina C (135% del consumo diario recomendado por cada 100g),   " +
                                                  "\n que ayuda a reducir la inflamación y mejorar la respuesta a la insulina. Canela: puede ayudar a mejorar la sensibilidad  " +
                                                  "\n a la insulina y estabilizar los niveles de glucosa. Este es solo un diagnóstico predeterminado lógico. Haberlo           " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas." +
                                                  "\n Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud,    " +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física de forma controlada y supervisada, con calentamiento         " +
                                                  "\n previo y enfriamiento posterior, evitando desencadenantes conocidos del asma (como alérgenos, aire frío o contaminado)       " +
                                                  "\n y pausas si presenta síntomas. La cantidad de ejercicio debe ser adaptada a su capacidad y a la presencia de síntomas,       " +
                                                  "\n pudiendo ser cerca de 60 minutos de actividad moderada a intensa diaria en los días que se encuentre bien, pero siempre      " +
                                                  "\n consultando al médico para un plan seguro. HIDRATACIÓN: Se recomienda el consumo diario de 1.5 a 1.7 litros de agua al       " +
                                                  "\n día (seis a siete vasos de tamaño regular) para ayudar a mantener las vías respiratorias hidratadas y las secreciones        " +
                                                  "\n más fluidas, lo que facilita la respiración. POSIBLE TRATAMIENTO: Para el asma en niñas, el tratamiento suele incluir        " +
                                                  "\n broncodilatadores de alivio rápido (para abrir las vías respiratorias durante un ataque, como el salbutamol, marca común     " +
                                                  "\n en México: Ventolin o Aerolin), corticosteroides inhalados (para el control a largo plazo y reducir la inflamación, como     " +
                                                  "\n la fluticasona o budesonida, marcas comunes: Flixotide o Pulmicort), y en algunos casos, modificadores de leucotrienos       " +
                                                  "\n (como el montelukast, marca común: Singulair). Es fundamental seguir estrictamente el plan de acción para el asma indicado   " +
                                                  "\n por el médico y usar los medicamentos preventivos regularmente. ALIMENTACIÓN: Se recomienda el consumo de alimentos que      " +
                                                  "\n puedan ayudar a reducir la inflamación y fortalecer el sistema inmune, tales como Pescados grasos (salmón, atún): ricos en   " +
                                                  "\n ácidos grasos Omega-3 (80% del consumo diario recomendado por cada 100g), que poseen propiedades antiinflamatorias que       " +
                                                  "\n pueden ayudar a reducir la inflamación de las vías respiratorias. Frutas y verduras de colores vivos (arándanos, fresas,     " +
                                                  "\n espinacas, brócoli): ricas en antioxidantes como la vitamina C (90-150% del consumo diario recomendado por cada 100g) y      " +
                                                  "\n carotenoides, que pueden proteger las células del daño y fortalecer el sistema inmunológico. Jengibre: contiene compuestos   " +
                                                  "\n con efectos antiinflamatorios que podrían ser beneficiosos para las vías respiratorias. Cúrcuma: con su componente activo,   " +
                                                  "\n la curcumina, también tiene potentes propiedades antiinflamatorias y antioxidantes. Este es solo un diagnóstico predeterminado " +
                                                  "\n lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente " +
                                                  "\n correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, " +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA. " +
                                                  "\n HIDRATACIÓN: En el caso de niñas de 0 a 9 años con VIH, es fundamental garantizar una hidratación adecuada,                     " +
                                                  "\n recomendándose el consumo diario de 1.5 a 1.7 litros de agua (seis a siete vasos de tamaño regular) para mantener               " +
                                                  "\n el equilibrio hídrico y apoyar la función inmunológica. EJERCICIO: La actividad física debe ser moderada y adaptada             " +
                                                  "\n a la condición del paciente, evitando esfuerzos excesivos y priorizando ejercicios suaves como caminatas, juegos                " +
                                                  "\n activos y actividades recreativas que no comprometan el sistema inmunológico. POSIBLE TRATAMIENTO: El tratamiento para          " +
                                                  "\n el VIH en niños incluye terapia antirretroviral (TAR), que ayuda a controlar la carga viral y fortalecer el sistema             " +
                                                  "\n inmunológico. En México, algunos medicamentos comunes incluyen Lamivudina, Zidovudina y Lopinavir/Ritonavir, disponibles        " +
                                                  "\n en instituciones de salud como el IMSS y el Insabi. Es crucial seguir estrictamente el tratamiento indicado por el médico       " +
                                                  "\n y garantizar la adherencia para evitar complicaciones. ALIMENTACIÓN: También es recomendable el consumo de alimentos que        " +
                                                  "\n fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como Frutas cítricas (naranjas, limones,           " +
                                                  "\n toronjas), ricas en vitamina C (aportando aproximadamente el 89% del requerimiento diario por cada 100 g), que fortalece        " +
                                                  "\n el sistema inmunológico. Verduras de hoja verde (espinacas, acelgas, brócoli), contienen antioxidantes y hierro, esenciales     " +
                                                  "\n para la salud celular, con un aporte de 15% del hierro diario por cada 100 g. Pescados grasos (salmón, atún), ricos en Omega-3, " +
                                                  "\n con propiedades antiinflamatorias, aportando hasta 2.2 g de Omega-3 por cada 100 g. Frutos secos (almendras, nueces), aportan   " +
                                                  "\n vitamina E, que ayuda a la regeneración celular, con un 37% del requerimiento diario por cada 28 g. Yogur natural, fuente de    " + 
                                                  "\n probióticos, que favorecen la salud intestinal y el sistema inmunológico, con un aporte de 20% de calcio por cada 100 g.        " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad" +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida          " +
                                                  "\n para establecer mayor seguridad en el tratamiento adecuado del paciente. Además, por su salud, si la respuesta del diagnóstico  " +
                                                  "\n no le satisface del todo, se recomienda consultar a su médico. Ángel L. Montes agradece tu visita a la app (Mi Vida) y          " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN: En el caso de niñas de 0 a 9 años con gonorrea, es fundamental garantizar una hidratación adecuada,       " +
                                                  "\n recomendándose el consumo diario de 1.5 a 1.7 litros de agua (seis a siete vasos de tamaño regular) para mantener      " +
                                                  "\n el equilibrio hídrico y apoyar la función inmunológica. EJERCICIO: La actividad física debe ser moderada y adaptada    " +
                                                  "\n a la condición del paciente, evitando esfuerzos excesivos y priorizando ejercicios suaves como caminatas, juegos       " +
                                                  "\n activos y actividades recreativas que no comprometan el sistema inmunológico. POSIBLE TRATAMIENTO: El tratamiento      " +
                                                  "\n para la gonorrea en niños incluye antibióticos como ceftriaxona, administrados en una sola dosis en casos no           " +
                                                  "\n complicados. En México, estos medicamentos están disponibles en instituciones de salud como el IMSS y el Insabi.       " +
                                                  "\n Es crucial seguir estrictamente el tratamiento indicado por el médico y garantizar la adherencia para evitar           " +
                                                  "\n complicaciones. ALIMENTACIÓN: También es recomendable el consumo de alimentos que fortalezcan el sistema inmunológico  " +
                                                  "\n y ayuden a reducir la inflamación, tales como frutas cítricas (naranjas, limones, toronjas), ricas en vitamina C       " +
                                                  "\n (aportando aproximadamente el 89% del requerimiento diario por cada 100 g), que fortalece el sistema inmunológico.     " +
                                                  "\n Verduras de hoja verde (espinacas, acelgas, brócoli), contienen antioxidantes y hierro, esenciales para la salud       " +
                                                  "\n celular, con un aporte de 15% del hierro diario por cada 100 g. Pescados grasos (salmón, atún), ricos en Omega-3,      " +
                                                  "\n con propiedades antiinflamatorias, aportando hasta 2.2 g de Omega-3 por cada 100 g. Frutos secos (almendras, nueces),  " +
                                                  "\n aportan vitamina E, que ayuda a la regeneración celular, con un 37% del requerimiento diario por cada 28 g. Yogur      " +
                                                  "\n natural, fuente de probióticos, que favorecen la salud intestinal y el sistema inmunológico, con un aporte de 20%      " +
                                                  "\n de calcio por cada 100 g. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%   " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda     " +
                                                  "\n realizar más de un Diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente.     " +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.   " +
                                                  "\n Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACIÓN: En el caso de niñas de 0 a 9 años con herpes genital, es fundamental garantizar una hidratación             " +
                                                  "\n adecuada, recomendándose el consumo diario de 1.5 a 1.7 litros de agua (seis a siete vasos de tamaño regular)            " +
                                                  "\n para mantener el equilibrio hídrico y apoyar la función inmunológica. EJERCICIO: La actividad física debe ser            " +
                                                  "\n moderada y adaptada a la condición del paciente, evitando esfuerzos excesivos y priorizando ejercicios suaves            " +
                                                  "\n como caminatas, juegos activos y actividades recreativas que no comprometan el sistema inmunológico. POSIBLE             " +
                                                  "\n TRATAMIENTO: El tratamiento para el herpes genital en niños incluye antivirales como aciclovir, que ayudan a             " +
                                                  "\n reducir la duración y gravedad de los síntomas. En México, estos medicamentos están disponibles en instituciones         " +
                                                  "\n de salud como el IMSS y el Insabi. Es crucial seguir estrictamente el tratamiento indicado por el médico y               " +
                                                  "\n garantizar la adherencia para evitar complicaciones. ALIMENTACIÓN: También es recomendable el consumo de alimentos       " +
                                                  "\n que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como frutas cítricas (naranjas,         " +
                                                  "\n limones, toronjas), ricas en vitamina C (aportando aproximadamente el 89% del requerimiento diario por cada 100 g),      " +
                                                  "\n que fortalece el sistema inmunológico. Verduras de hoja verde (espinacas, acelgas, brócoli), contienen antioxidantes     " +
                                                  "\n y hierro, esenciales para la salud celular, con un aporte de 15% del hierro diario por cada 100 g. Pescados grasos       " +
                                                  "\n (salmón, atún), ricos en Omega-3, con propiedades antiinflamatorias, aportando hasta 2.2 g de Omega-3 por cada 100 g.    " +
                                                  "\n Frutos secos (almendras, nueces), aportan vitamina E, que ayuda a la regeneración celular, con un 37% del requerimiento  " +
                                                  "\n diario por cada 28 g. Yogur natural, fuente de probióticos, que favorecen la salud intestinal y el sistema inmunológico, " +
                                                  "\n con un aporte de 20% de calcio por cada 100 g. Este es solo un diagnóstico predeterminado lógico, haberlo consultado     " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para      " +
                                                  "\n ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado " +
                                                  "\n del paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a  " +
                                                  "\n su médico. Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN: En el caso de niñas de 0 a 9 años con sífilis, es fundamental garantizar una hidratación adecuada,          " +
                                                  "\n recomendándose el consumo diario de 1.5 a 1.7 litros de agua (seis a siete vasos de tamaño regular) para mantener        " +
                                                  "\n el equilibrio hídrico y apoyar la función inmunológica. EJERCICIO: La actividad física debe ser moderada y adaptada      " +
                                                  "\n a la condición del paciente, evitando esfuerzos excesivos y priorizando ejercicios suaves como caminatas, juegos         " +
                                                  "\n activos y actividades recreativas que no comprometan el sistema inmunológico. POSIBLE TRATAMIENTO: El tratamiento        " +
                                                  "\n para la sífilis en niños incluye penicilina, que es el medicamento de primera línea. En México, estos medicamentos       " +
                                                  "\n están disponibles en instituciones de salud como el IMSS y el Insabi. Es crucial seguir estrictamente el tratamiento     " +
                                                  "\n indicado por el médico y garantizar la adherencia para evitar complicaciones. ALIMENTACIÓN: También es recomendable      " +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como frutas     " +
                                                  "\n cítricas (naranjas, limones, toronjas), ricas en vitamina C (aportando aproximadamente el 89% del requerimiento diario   " +
                                                  "\n por cada 100 g), que fortalece el sistema inmunológico. Verduras de hoja verde (espinacas, acelgas, brócoli), contienen  " +
                                                  "\n antioxidantes y hierro, esenciales para la salud celular, con un aporte de 15% del hierro diario por cada 100 g.         " +
                                                  "\n Pescados grasos (salmón, atún), ricos en Omega-3, con propiedades antiinflamatorias, aportando hasta 2.2 g de Omega-3    " +
                                                  "\n por cada 100 g. Frutos secos (almendras, nueces), aportan vitamina E, que ayuda a la regeneración celular, con un 37%    " +
                                                  "\n del requerimiento diario por cada 28 g. Yogur natural, fuente de probióticos, que favorecen la salud intestinal y el     " +
                                                  "\n sistema inmunológico, con un aporte de 20% de calcio por cada 100 g. Este es solo un diagnóstico predeterminado lógico,  " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente   " +
                                                  "\n correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mayor seguridad en el      " +
                                                  "\n tratamiento adecuado del paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se    " +
                                                  "\n recomienda consultar a su médico. Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tamaño regular)          " +
                                                  "\n para mantener las vías respiratorias húmedas y ayudar a eliminar toxinas, lo que es fundamental en el proceso         " +
                                                  "\n de recuperación. EJERCICIO: La actividad física debe ser ligera y progresiva, evitando esfuerzos excesivos,           " +
                                                  "\n caminar al aire libre y realizar ejercicios de respiración pueden ayudar a fortalecer los pulmones sin                " +
                                                  "\n sobrecargarlos. POSIBLE TRATAMIENTO: El tratamiento estándar para la tuberculosis en niños incluye una combinación    " +
                                                  "\n de antibióticos como isoniazida, rifampicina, pirazinamida y etambutol, administrados durante un período de seis      " +
                                                  "\n meses en casos de tuberculosis sensible a los medicamentos, en México algunas marcas reconocidas que contienen        " +
                                                  "\n estos fármacos incluyen Rimactane (rifampicina) y Isozid (isoniazida), en casos de tuberculosis resistente pueden     " +
                                                  "\n utilizarse medicamentos como bedaquilina y delamanid, bajo estricta supervisión médica. ALIMENTACIÓN: Para fortalecer " +
                                                  "\n el sistema inmunológico y apoyar la recuperación, se recomienda el consumo de alimentos ricos en vitamina C, hierro   " +
                                                  "\n y proteínas. Naranjas y fresas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa    " +
                                                  "\n hasta el 100% de la ingesta diaria recomendada, fortaleciendo el sistema inmunológico y ayudando a reducir la         " +
                                                  "\n inflamación. Espinacas y lentejas: Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25% y 40%  " +
                                                  "\n de la ingesta diaria recomendada, lo que ayuda a mejorar la oxigenación celular y reducir el cansancio. Carnes magras " +
                                                  "\n y huevos: Son una fuente importante de proteínas, proporcionando entre 20 y 25 g por cada 100 g, lo que equivale al   " +
                                                  "\n 40-50% de la recomendación diaria, esenciales para la regeneración celular y el fortalecimiento muscular. Este es     " +
                                                  "\n solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad " +
                                                  "\n ni que las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar más de un diagnóstico    " +
                                                  "\n y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tamaño regular)             " +
                                                  "\n para mantener la lubricación de las articulaciones y reducir la inflamación, lo que es fundamental en el manejo          " +
                                                  "\n de la enfermedad. EJERCICIO: La actividad física debe ser de bajo impacto y adaptada a la movilidad del niño,            " +
                                                  "\n ejercicios como natación, bicicleta y yoga pueden ayudar a fortalecer los músculos sin sobrecargar las articulaciones,   " +
                                                  "\n además se recomienda realizar movimientos de estiramiento y movilidad articular diariamente para mejorar la              " +
                                                  "\n flexibilidad. POSIBLE TRATAMIENTO: El tratamiento estándar para la artritis juvenil incluye antiinflamatorios no         " +
                                                  "\n esteroides (AINEs) como ibuprofeno y naproxeno, además de fármacos modificadores de la enfermedad como metotrexato       " +
                                                  "\n y sulfasalazina, en México algunas marcas reconocidas incluyen Tempra (ibuprofeno) y Arava (leflunomida), en casos       " +
                                                  "\n más severos pueden utilizarse biológicos como etanercept y adalimumab, bajo estricta supervisión médica. ALIMENTACIÓN:   " +
                                                  "\n Para reducir la inflamación y fortalecer las articulaciones, se recomienda el consumo de alimentos ricos en omega-3,     " +
                                                  "\n antioxidantes y vitamina D. Salmón y chía: Contienen aproximadamente 2-4 g de omega-3 por cada 100 g, lo que ayuda a     " +
                                                  "\n reducir la inflamación articular. Fresas y arándanos: Aportan 50-90 mg de vitamina C por cada 100 g, cubriendo hasta     " +
                                                  "\n el 100% de la ingesta diaria recomendada, fortaleciendo el sistema inmunológico. Lácteos y huevos: Son una fuente        " +
                                                  "\n importante de vitamina D, proporcionando entre 10 y 20% de la recomendación diaria, esencial para la salud ósea y        " +
                                                  "\n articular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente    " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar    " +
                                                  "\n más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tamaño regular)               " +
                                                  "\n para mantener las vías respiratorias húmedas y ayudar a eliminar toxinas, lo que es fundamental en el proceso              " +
                                                  "\n de recuperación. EJERCICIO: La actividad física debe ser muy ligera y supervisada, evitando esfuerzos excesivos            " +
                                                  "\n que puedan desencadenar episodios de tos intensa, ejercicios de respiración profunda y caminatas suaves pueden             " +
                                                  "\n ser beneficiosos para mejorar la capacidad pulmonar. POSIBLE TRATAMIENTO: El tratamiento estándar para la tosferina        " +
                                                  "\n en niños incluye antibióticos como azitromicina, claritromicina y eritromicina, administrados durante 5 a 7 días,          " +
                                                  "\n en México algunas marcas reconocidas incluyen Zithromax (azitromicina) y Klacid (claritromicina), además se recomienda     " +
                                                  "\n el uso de broncodilatadores en casos de dificultad respiratoria bajo estricta supervisión médica. ALIMENTACIÓN: Para       " +
                                                  "\n fortalecer el sistema inmunológico y apoyar la recuperación, se recomienda el consumo de alimentos ricos en vitamina C,    " +
                                                  "\n antioxidantes y zinc. Kiwi y naranjas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa  " +
                                                  "\n hasta el 100% de la ingesta diaria recomendada, fortaleciendo el sistema inmunológico. Jengibre y cúrcuma: Poseen          " +
                                                  "\n propiedades antiinflamatorias y antioxidantes, ayudando a reducir la irritación de las vías respiratorias. Almendras       " +
                                                  "\n y semillas de calabaza: Aportan 10-15 mg de zinc por cada 100 g, cubriendo hasta el 100% de la recomendación diaria,       " +
                                                  "\n esencial para la función inmunológica. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza  " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se  " +
                                                  "\n recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y  " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tamaño regular)            " +
                                                  "\n para mantener la hidratación y reducir la fiebre, lo que es fundamental en el proceso de recuperación. EJERCICIO:       " +
                                                  "\n La actividad física debe ser mínima y de reposo, evitando esfuerzos físicos que puedan agravar la inflamación de        " +
                                                  "\n las glándulas salivales, se recomienda descanso absoluto hasta la recuperación completa. POSIBLE TRATAMIENTO: El        " +
                                                  "\n tratamiento estándar para las paperas en niños es sintomático, incluyendo analgésicos como paracetamol e ibuprofeno     " +
                                                  "\n para reducir el dolor y la fiebre, en México algunas marcas reconocidas incluyen Tempra (paracetamol) y Advil           " +
                                                  "\n (ibuprofeno), además se recomienda reposo y aplicación de compresas frías en la zona inflamada. ALIMENTACIÓN: Para      " +
                                                  "\n fortalecer el sistema inmunológico y apoyar la recuperación, se recomienda el consumo de alimentos ricos en vitamina C, " +
                                                  "\n antioxidantes y proteínas. Mango y espinacas: Contienen aproximadamente 50-80 mg de vitamina C por cada 100 g,          " +
                                                  "\n lo que representa hasta el 90% de la ingesta diaria recomendada, fortaleciendo el sistema inmunológico. Caldo de        " +
                                                  "\n pollo y yogur: Son fuentes de proteínas y probióticos, esenciales para la recuperación y el fortalecimiento del         " +
                                                  "\n sistema inmunológico. Frutas y verduras suaves: Como plátanos y zanahorias, que son fáciles de consumir y aportan       " +
                                                  "\n fibra y antioxidantes para mejorar la digestión y la recuperación. Este es solo un diagnóstico predeterminado lógico,   " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente  " +
                                                  "\n correctas, para mayor seguridad se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes    " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n En niñas de 0 a 9 años, el virus del Zika puede causar fiebre, erupciones cutáneas y malestar general, aumentando             " +
                                                  "\n el riesgo de complicaciones neurológicas, por lo que es fundamental un diagnóstico oportuno y tratamiento adecuado.           " +
                                                  "\n HIDRATACIÓN: Se recomienda que la paciente mantenga una hidratación adecuada, consumiendo al menos 1.5 a 2 litros             " +
                                                  "\n de agua al día (aproximadamente seis a ocho vasos de tamaño regular) para favorecer la eliminación de toxinas y               " +
                                                  "\n mantener el sistema inmunológico fuerte. EJERCICIO: En cuanto a la actividad física, es recomendable realizar ejercicios      " +
                                                  "\n suaves como juegos al aire libre, caminatas cortas o natación, siempre bajo supervisión médica para evitar complicaciones     " +
                                                  "\n y fortalecer la función cardiovascular. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral específico para el Zika,      " +
                                                  "\n por lo que el manejo es sintomático. Se recomienda el uso de analgésicos como paracetamol para aliviar la fiebre y el         " +
                                                  "\n malestar, antihistamínicos para reducir el prurito y reposo adecuado. Es fundamental evitar el uso de aspirina y otros        " +
                                                  "\n antiinflamatorios no esteroides sin supervisión médica. ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo de alimentos       " +
                                                  "\n que fortalezcan el sistema inmunológico y ayuden a combatir la infección, tales como: Frutas cítricas (naranjas,              " +
                                                  "\n limones, toronjas): Ricas en vitamina C, que fortalece el sistema inmunológico y ayuda a reducir la duración de               " +
                                                  "\n infecciones, aportando aproximadamente el 89% del requerimiento diario por cada 100 gramos. Jengibre: Contiene                " +
                                                  "\n compuestos con efectos antiinflamatorios que pueden ayudar a reducir la fiebre y el malestar general. Verduras                " +
                                                  "\n de hoja verde (espinaca, acelga, brócoli): Ricas en antioxidantes y vitaminas esenciales para la recuperación,                " +
                                                  "\n como la vitamina A, que contribuye a la regeneración celular y aporta cerca del 56% del requerimiento diario por              " +
                                                  "\n cada 100 gramos de espinaca. Omega-3 (salmón, atún, chía): Con propiedades antiinflamatorias que pueden ayudar a              " +
                                                  "\n reducir la inflamación y mejorar la respuesta inmunológica, aportando aproximadamente el 50% del requerimiento                " +
                                                  "\n diario por cada 100 gramos de salmón. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no                " +
                                                  "\n garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para              " +
                                                  "\n mayor seguridad, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento          " +
                                                  "\n adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n En niñas de 0 a 9 años, el rotavirus puede causar deshidratación severa y complicaciones gastrointestinales,          " +
                                                  "\n por lo que es fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que la           " +
                                                  "\n paciente mantenga una hidratación adecuada, consumiendo al menos 2 litros de agua al día (aproximadamente             " +
                                                  "\n ocho vasos de tamaño regular) para compensar la pérdida de líquidos y evitar la deshidratación. EJERCICIO:            " +
                                                  "\n En cuanto a la actividad física, es recomendable realizar actividades suaves como juegos tranquilos, caminatas        " +
                                                  "\n cortas o ejercicios de movilidad, siempre bajo supervisión médica para evitar complicaciones y fortalecer la          " +
                                                  "\n función digestiva. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral específico para el rotavirus, por lo       " +
                                                  "\n que el manejo es sintomático. Se recomienda el uso de soluciones de rehidratación oral para evitar la deshidratación, " +
                                                  "\n así como una dieta blanda y de fácil digestión. En casos graves, puede requerirse hospitalización para administración " +
                                                  "\n de líquidos intravenosos. ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema  " +
                                                  "\n digestivo y ayuden a combatir la infección, tales como: Plátano: Rico en potasio, que ayuda a reemplazar los          " +
                                                  "\n electrolitos perdidos debido a la diarrea, aportando aproximadamente el 12% del requerimiento diario por cada         " +
                                                  "\n 100 gramos. Yogur natural: Contiene probióticos, que pueden ayudar a restaurar la flora intestinal y mejorar          " +
                                                  "\n la digestión, proporcionando cerca del 20% del requerimiento diario de calcio por cada porción de 150 gramos.         " +
                                                  "\n Arroz blanco: Fuente de carbohidratos de fácil digestión que ayuda a estabilizar el sistema digestivo y aporta        " +
                                                  "\n energía sin irritar el estómago. Zanahoria: Rica en vitamina A, que contribuye a la regeneración celular y fortalece  " +
                                                  "\n la mucosa intestinal, aportando cerca del 56% del requerimiento diario por cada 100 gramos. Este es solo un diagnóstico " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las         " +
                                                  "\n respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar más de un diagnóstico y consultar " +
                                                  "\n a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que  " +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n En niñas de 0 a 9 años, la listeriosis puede causar infecciones graves y afectar el sistema nervioso, por              " +
                                                  "\n lo que es fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que la                " +
                                                  "\n paciente mantenga una hidratación adecuada, consumiendo al menos 2 litros de agua al día (aproximadamente              " +
                                                  "\n ocho vasos de tamaño regular) para favorecer la eliminación de toxinas y mantener el sistema inmunológico              " +
                                                  "\n fuerte. EJERCICIO: En cuanto a la actividad física, es recomendable realizar actividades suaves como juegos            " +
                                                  "\n tranquilos, caminatas cortas o ejercicios de movilidad, siempre bajo supervisión médica para evitar complicaciones     " +
                                                  "\n y fortalecer la función inmunológica. POSIBLE TRATAMIENTO: El tratamiento estándar para la listeriosis incluye         " +
                                                  "\n antibióticos como ampicilina y gentamicina, administrados bajo prescripción médica. En casos graves, puede             " +
                                                  "\n requerirse hospitalización para administración de antibióticos intravenosos. ALIMENTACIÓN RECOMENDADA: Se recomienda   " +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a combatir la infección, tales como: Ajo:     " +
                                                  "\n Posee propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene alicina, un compuesto  " +
                                                  "\n con efectos antibacterianos. Frutas cítricas (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece el      " +
                                                  "\n sistema inmunológico y ayuda a reducir la duración de infecciones, aportando aproximadamente el 89% del requerimiento  " +
                                                  "\n diario por cada 100 gramos. Yogur natural: Contiene probióticos, que pueden ayudar a mantener el equilibrio de la      " +
                                                  "\n flora bacteriana y mejorar la respuesta inmunológica, proporcionando cerca del 20% del requerimiento diario de calcio  " +
                                                  "\n por cada porción de 150 gramos. Verduras de hoja verde (espinaca, acelga, brócoli): Ricas en antioxidantes y vitaminas " +
                                                  "\n esenciales para la recuperación, como la vitamina A, que contribuye a la regeneración celular y aporta cerca del 56%   " +
                                                  "\n del requerimiento diario por cada 100 gramos de espinaca. Este es solo un diagnóstico predeterminado lógico, haberlo   " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas.  " +
                                                  "\n Para mayor seguridad, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento  " +
                                                  "\n adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n La shigelosis es una infección bacteriana que afecta el sistema digestivo, causando diarrea severa, fiebre y                 " +
                                                  "\n deshidratación. HIDRATACIÓN: Se recomienda que la paciente mantenga una hidratación adecuada, consumiendo al                 " +
                                                  "\n menos 2 litros de agua al día para compensar la pérdida de líquidos y evitar la deshidratación. Además, es                   " +
                                                  "\n recomendable el consumo de sueros de rehidratación oral para reponer electrolitos esenciales como sodio, potasio             " +
                                                  "\n y cloro, los cuales se pierden con la diarrea. También se pueden incluir caldos ligeros y agua de coco, que aportan          " +
                                                  "\n minerales esenciales para la recuperación. EJERCICIO: Se recomienda realizar actividades suaves como juegos tranquilos,      " +
                                                  "\n caminatas cortas o ejercicios de movilidad, siempre bajo supervisión médica para evitar complicaciones y fortalecer la       " +
                                                  "\n función digestiva. POSIBLE TRATAMIENTO: El tratamiento estándar para la shigelosis incluye antibióticos como azitromicina,   " +
                                                  "\n ciprofloxacina o ceftriaxona, administrados bajo prescripción médica. También se recomienda el uso de soluciones de          " +
                                                  "\n rehidratación oral para evitar la deshidratación. ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo de alimentos que        " +
                                                  "\n fortalezcan el sistema digestivo y ayuden a combatir la infección, tales como: Plátano: Rico en potasio, que ayuda a         " +
                                                  "\n reemplazar los electrolitos perdidos debido a la diarrea. Yogur natural: Contiene probióticos, que pueden ayudar a           " +
                                                  "\n restaurar la flora intestinal y mejorar la digestión. Arroz blanco: Fuente de carbohidratos de fácil digestión que           " +
                                                  "\n ayuda a estabilizar el sistema digestivo y aporta energía sin irritar el estómago. Zanahoria: Rica en vitamina A, que        " +
                                                  "\n contribuye a la regeneración celular y fortalece la mucosa intestinal. Este es solo un diagnóstico predeterminado lógico,    " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente       " +
                                                  "\n correctas. Para mayor seguridad, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer        " +
                                                  "\n el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n La EPOC es una afección respiratoria que dificulta la respiración y puede causar fatiga extrema. HIDRATACIÓN: Se          " +
                                                  "\n recomienda que la paciente mantenga una hidratación adecuada, consumiendo al menos 2.5 litros de agua al día para         " +
                                                  "\n favorecer la eliminación de toxinas y mantener las vías respiratorias hidratadas. Además, se recomienda el consumo        " +
                                                  "\n de líquidos tibios como infusiones de jengibre o manzanilla, que pueden ayudar a reducir la inflamación de las vías       " +
                                                  "\n respiratorias. También es importante evitar bebidas azucaradas y gaseosas, ya que pueden aumentar la producción de        " +
                                                  "\n moco y dificultar la respiración. EJERCICIO: Se recomienda realizar ejercicios de bajo impacto, como caminatas de 30      " +
                                                  "\n minutos diarios, natación o yoga, siempre bajo supervisión médica para evitar complicaciones y fortalecer la función      " +
                                                  "\n pulmonar. También es importante realizar ejercicios de respiración profunda para mejorar la capacidad pulmonar y reducir  " +
                                                  "\n la sensación de falta de aire. POSIBLE TRATAMIENTO: El tratamiento estándar para la EPOC incluye broncodilatadores de     " +
                                                  "\n alivio rápido, como el salbutamol, corticosteroides inhalados para el control a largo plazo, como la fluticasona, y en    " +
                                                  "\n algunos casos, terapia con oxígeno suplementario. Es fundamental seguir estrictamente el plan de acción para la EPOC      " +
                                                  "\n indicado por el médico y usar los medicamentos preventivos regularmente. ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo  " +
                                                  "\n de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como: Pescados grasos (salmón, " +
                                                  "\n atún): Ricos en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias y pueden ayudar a reducir la inflamación de  " +
                                                  "\n las vías respiratorias. Frutas y verduras de colores vivos (arándanos, fresas, espinacas, brócoli): Ricas en antioxidantes   " +
                                                  "\n como la vitamina C y carotenoides, que pueden proteger las células del daño y fortalecer el sistema inmunológico. Jengibre:  " +
                                                  "\n Contiene compuestos con efectos antiinflamatorios que podrían ser beneficiosos para las vías respiratorias, ayudando a       " +
                                                  "\n reducir la inflamación y mejorar la circulación sanguínea. Cúrcuma: Con su componente activo, la curcumina, también tiene    " +
                                                  "\n potentes propiedades antiinflamatorias y antioxidantes, contribuyendo a la reducción de la inflamación en los pulmones.      " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta   " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar más de un   " +
                                                  "\n diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n La clamidia es una infección bacteriana que puede afectar el sistema urinario y reproductivo, causando molestias            " +
                                                  "\n abdominales y fiebre. HIDRATACIÓN: Se recomienda que la paciente mantenga una hidratación adecuada, consumiendo             " +
                                                  "\n al menos 2 litros de agua al día para favorecer la eliminación de toxinas y mantener el sistema inmunológico fuerte.        " +
                                                  "\n Además, se recomienda el consumo de jugos naturales sin azúcar, como jugo de arándano, que puede ayudar a prevenir          " +
                                                  "\n infecciones urinarias recurrentes. También es importante evitar el consumo excesivo de cafeína y bebidas alcohólicas,       " +
                                                  "\n ya que pueden irritar el tracto urinario. EJERCICIO: Se recomienda realizar actividades suaves como juegos tranquilos,      " +
                                                  "\n caminatas cortas o ejercicios de movilidad, siempre bajo supervisión médica para evitar complicaciones y fortalecer la      " +
                                                  "\n función inmunológica. POSIBLE TRATAMIENTO: El tratamiento estándar para la clamidia incluye antibióticos como               " +
                                                  "\n azitromicina, doxiciclina o amoxicilina, administrados bajo prescripción médica. Es fundamental seguir estrictamente el     " +
                                                  "\n tratamiento indicado por el médico y evitar el contacto con posibles fuentes de infección. ALIMENTACIÓN RECOMENDADA: Se     " +
                                                  "\n recomienda el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a combatir la infección, tales como:    " +
                                                  "\n Ajo: Posee propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene alicina, un compuesto  " +
                                                  "\n con efectos antibacterianos. Frutas cítricas (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece el sistema   " +
                                                  "\n inmunológico y ayuda a reducir la duración de infecciones. Yogur natural: Contiene probióticos, que pueden ayudar a         " +
                                                  "\n mantener el equilibrio de la flora bacteriana y mejorar la respuesta inmunológica. Verduras de hoja verde (espinaca,        " +
                                                  "\n acelga, brócoli): Ricas en antioxidantes y vitaminas esenciales para la recuperación, como la vitamina A, que contribuye    " +
                                                  "\n a la regeneración celular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%       " +
                                                  "\n que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad, se          " +
                                                  "\n recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n En niñas pequeñas, la meningitis bacteriana puede ser grave y requerir atención médica urgente debido a la                  " +
                                                  "\n inflamación de las membranas que recubren el cerebro y la médula espinal. EJERCICIO: Se recomienda actividad                " +
                                                  "\n física ligera, como caminatas cortas y juegos tranquilos, evitando esfuerzos excesivos que puedan generar fatiga.           " +
                                                  "\n También es importante realizar ejercicios de movilidad para mantener la flexibilidad y evitar la rigidez muscular.          " +
                                                  "\n HIDRATACIÓN: Es fundamental el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de agua de tamaño regular)       " +
                                                  "\n para mantener el cuerpo hidratado y ayudar a reducir la fiebre y el malestar. Además del agua pura, se recomienda el        " +
                                                  "\n consumo de caldos ligeros, jugos naturales sin azúcar y infusiones suaves, que pueden aportar líquidos y nutrientes         " +
                                                  "\n esenciales. POSIBLE TRATAMIENTO: La meningitis bacteriana se trata con antibióticos intravenosos, como ceftriaxona,         " +
                                                  "\n vancomicina o ampicilina, dependiendo del agente causal. En casos graves, puede requerirse hospitalización para monitoreo   " +
                                                  "\n neurológico y administración de líquidos intravenosos. También se recomienda el uso de medicamentos para reducir la         " +
                                                  "\n fiebre y aliviar el dolor, como paracetamol o ibuprofeno. ALIMENTACIÓN: Se recomienda el consumo de alimentos que           " +
                                                  "\n ayuden a fortalecer el sistema inmunológico y reducir la inflamación, tales como arándanos, ricos en antioxidantes          " +
                                                  "\n y vitamina C, aportando 25% de la ingesta diaria recomendada. espinacas, que contienen hierro y vitamina A, esenciales      " +
                                                  "\n para la recuperación, proporcionando 15% de la ingesta diaria recomendada de hierro. jengibre, con propiedades              " +
                                                  "\n antiinflamatorias y antioxidantes, aportando 5% de la ingesta diaria recomendada de vitamina C. cúrcuma, con curcumina,     " +
                                                  "\n que tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes." +
                                                  "\n yogur natural, que contiene probióticos beneficiosos para la flora intestinal, proporcionando 15% de la ingesta diaria     " +
                                                  "\n recomendada de calcio. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la   " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más   " +
                                                  "\n de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la  " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n En niñas pequeñas, el cáncer puede manifestarse de diversas formas y requerir un tratamiento especializado según el tipo    " +
                                                  "\n y la etapa de la enfermedad. EJERCICIO: Se recomienda actividad física moderada, adaptada a la capacidad de la niña, como   " +
                                                  "\n juegos tranquilos, caminatas suaves y ejercicios de movilidad para mejorar la circulación y reducir la fatiga. También es   " +
                                                  "\n recomendable realizar ejercicios de respiración y relajación para mejorar la oxigenación y reducir el estrés. HIDRATACIÓN:  " +
                                                  "\n Es esencial el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tamaño regular) para mantener el      " +
                                                  "\n cuerpo hidratado y ayudar a reducir los efectos secundarios del tratamiento. Además del agua pura, se recomienda el consumo " +
                                                  "\n de jugos naturales ricos en antioxidantes, como jugo de naranja o toronja, que pueden fortalecer el sistema inmunológico.   " +
                                                  "\n También es beneficioso ingerir caldos ligeros, que aportan líquidos y minerales esenciales para la recuperación. POSIBLE    " +
                                                  "\n TRATAMIENTO: El cáncer en niñas se trata con quimioterapia, radioterapia o cirugía, dependiendo del tipo y la etapa de la   " +
                                                  "\n enfermedad. También se pueden utilizar terapias dirigidas, como inmunoterapia, para fortalecer el sistema inmunológico y    " +
                                                  "\n combatir las células cancerosas. En algunos casos, se recomienda el uso de medicamentos para aliviar los efectos secundarios," +
                                                  "\n como antieméticos para controlar las náuseas y analgésicos para reducir el dolor. ALIMENTACIÓN: Se recomienda el consumo     " +
                                                  "\n de alimentos que ayuden a fortalecer el sistema inmunológico y reducir la inflamación, tales como arándanos, ricos en        " +
                                                  "\n antioxidantes y vitamina C, aportando 25% de la ingesta diaria recomendada. espinacas, que contienen hierro y vitamina A,    " +
                                                  "\n esenciales para la recuperación, proporcionando 15% de la ingesta diaria recomendada de hierro. jengibre, con propiedades    " +
                                                  "\n antiinflamatorias y antioxidantes, aportando 5% de la ingesta diaria recomendada de vitamina C. cúrcuma, con curcumina,      " +
                                                  "\n que tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes." +
                                                  "\n yogur natural, que contiene probióticos beneficiosos para la flora intestinal, proporcionando 15% de la ingesta diaria    " +
                                                  "\n recomendada de calcio. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la  " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más  " +
                                                  "\n de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a    " +
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.35-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n En niñas pequeñas, la influenza puede causar fiebre alta, tos, dolor muscular y fatiga, y en algunos casos puede         " +
                                                  "\n derivar en complicaciones como neumonía. EJERCICIO: Se recomienda actividad física ligera, como juegos tranquilos        " +
                                                  "\n y caminatas cortas, evitando esfuerzos excesivos que puedan generar fatiga. También es importante realizar ejercicios    " +
                                                  "\n de movilidad para mantener la flexibilidad y evitar la rigidez muscular. HIDRATACIÓN: Es fundamental el consumo diario   " +
                                                  "\n de 1.5 a 2 litros de agua (seis a ocho vasos de agua de tamaño regular) para mantener el cuerpo hidratado y ayudar a     " +
                                                  "\n reducir la fiebre y el malestar. Además del agua pura, se recomienda el consumo de caldos ligeros, jugos naturales sin   " +
                                                  "\n azúcar y infusiones suaves, que pueden aportar líquidos y nutrientes esenciales. También es recomendable el consumo de   " +
                                                  "\n bebidas con electrolitos naturales, como agua de coco, para ayudar a reponer los minerales perdidos por la fiebre y      " +
                                                  "\n sudoración. POSIBLE TRATAMIENTO: La influenza se trata con medidas de soporte, como descanso adecuado, hidratación y     " +
                                                  "\n medicamentos para aliviar los síntomas, como paracetamol o ibuprofeno. En casos graves o de alto riesgo, el médico puede " +
                                                  "\n prescribir antivirales, como oseltamivir, para reducir la duración y gravedad de la enfermedad. También es importante    " +
                                                  "\n evitar el uso de medicamentos que contengan ácido acetilsalicílico, como la aspirina, debido al riesgo de desarrollar el " +
                                                  "\n síndrome de Reye en niños. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema        " +
                                                  "\n inmunológico y reducir la inflamación, tales como naranjas, ricas en vitamina C, que fortalecen el sistema inmunológico, " +
                                                  "\n aportando 90 mg por cada 100 g de fruta, lo que representa 100% de la ingesta diaria recomendada. fresas, ricas en       " +
                                                  "\n vitamina C y antioxidantes, que ayudan a combatir infecciones, proporcionando 60 mg por cada 100 g de fruta. plátanos,   " +
                                                  "\n ricos en potasio, que pueden ayudar a reemplazar los electrolitos perdidos debido a la fiebre y sudoración, aportando 10%" +
                                                  "\n de la ingesta diaria recomendada de potasio. kiwi, rico en vitamina C y potasio, que fortalece el sistema inmunológico y " +
                                                  "\n ayuda a la recuperación, proporcionando 85 mg de vitamina C por cada 100 g. Este es solo un diagnóstico predeterminado   " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente" +
                                                  "\n correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento" +
                                                  "\n adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n En niñas pequeñas, la neumonía puede causar fiebre alta, tos persistente, dificultad para respirar y fatiga               " +
                                                  "\n extrema, y puede requerir tratamiento médico urgente. EJERCICIO: Se recomienda actividad física muy ligera,               " +
                                                  "\n como movimientos suaves y ejercicios de respiración para mejorar la oxigenación. También es importante evitar             " +
                                                  "\n esfuerzos físicos que puedan generar fatiga o dificultar la respiración. HIDRATACIÓN: Es esencial el consumo              " +
                                                  "\n diario de 1.5 a 2 litros de agua (seis a ocho vasos de agua de tamaño regular) para mantener el cuerpo hidratado          " +
                                                  "\n y ayudar a reducir la fiebre y el malestar. Además del agua pura, se recomienda el consumo de infusiones suaves,          " +
                                                  "\n jugos naturales sin azúcar y caldos ligeros, que pueden aportar líquidos y nutrientes esenciales. También es              " +
                                                  "\n recomendable el consumo de bebidas con electrolitos naturales, como agua de coco, para ayudar a reponer los minerales     " +
                                                  "\n perdidos por la fiebre y sudoración. POSIBLE TRATAMIENTO: La neumonía se trata con antibióticos, como amoxicilina         " +
                                                  "\n o azitromicina, en caso de infección bacteriana. También se recomienda el uso de medicamentos para reducir la fiebre      " +
                                                  "\n y aliviar el dolor, como paracetamol o ibuprofeno. En casos graves, puede requerirse hospitalización para monitoreo       " +
                                                  "\n respiratorio y administración de oxígeno. También es importante mantener una buena higiene respiratoria y evitar la       " +
                                                  "\n exposición a contaminantes ambientales que puedan agravar la condición. ALIMENTACIÓN: Se recomienda el consumo de         " +
                                                  "\n alimentos que ayuden a fortalecer el sistema inmunológico y reducir la inflamación, tales como ajo, que contiene          " +
                                                  "\n alicina con propiedades antimicrobianas, aportando 5% de la ingesta diaria recomendada de antioxidantes. jengibre,        " +
                                                  "\n con efectos antiinflamatorios y antioxidantes, aportando 5% de la ingesta diaria recomendada de vitamina C. cúrcuma,      " +
                                                  "\n con curcumina, que tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada     " +
                                                  "\n de antioxidantes. frutas cítricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalecen el sistema inmunológico,  " +
                                                  "\n aportando 90 mg por cada 100 g de fruta, lo que representa 100% de la ingesta diaria recomendada. yogur natural, que contiene  " +
                                                  "\n probióticos beneficiosos para la flora intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio. Este es      " +
                                                  "\n solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad       " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a      " +
                                                  "\n un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n En niñas pequeñas, la diabetes puede afectar el metabolismo del azúcar y requerir un control estricto para                   " +
                                                  "\n evitar complicaciones. EJERCICIO: Se recomienda actividad física moderada, como juegos tranquilos, caminatas                 " +
                                                  "\n suaves y ejercicios de movilidad para mejorar la circulación y reducir la fatiga. También es recomendable realizar           " +
                                                  "\n ejercicios de respiración y relajación para mejorar la oxigenación y reducir el estrés. HIDRATACIÓN: Es esencial             " +
                                                  "\n el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tamaño regular) para mantener el cuerpo            " +
                                                  "\n hidratado y ayudar a reducir los efectos secundarios del tratamiento. Además del agua pura, se recomienda el consumo         " +
                                                  "\n de jugos naturales sin azúcar, infusiones suaves y caldos ligeros, que pueden aportar líquidos y minerales esenciales.       " +
                                                  "\n También es recomendable el consumo de bebidas con fibra natural, como agua de chía, para ayudar a estabilizar los niveles    " +
                                                  "\n de azúcar en sangre. POSIBLE TRATAMIENTO: La diabetes en niñas se trata con insulina, en el caso de diabetes tipo 1, y con   " +
                                                  "\n medicamentos como metformina, en el caso de diabetes tipo 2. También se recomienda un plan de alimentación saludable y       " +
                                                  "\n monitoreo constante de los niveles de glucosa. En algunos casos, se puede utilizar terapia con microinfusora de insulina,    " +
                                                  "\n que permite un control más preciso de los niveles de azúcar en sangre. ALIMENTACIÓN: Se recomienda el consumo de alimentos   " +
                                                  "\n que ayuden a estabilizar los niveles de azúcar en sangre y fortalecer el sistema inmunológico, tales como arándanos, ricos   " +
                                                  "\n en antioxidantes y vitamina C, aportando 25% de la ingesta diaria recomendada. espinacas, que contienen hierro y vitamina A, " +
                                                  "\n esenciales para la recuperación, proporcionando 15% de la ingesta diaria recomendada de hierro. jengibre, con propiedades    " +
                                                  "\n antiinflamatorias y antioxidantes, aportando 5% de la ingesta diaria recomendada de vitamina C. cúrcuma, con curcumina,      " +
                                                  "\n que tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes." +
                                                  "\n yogur natural, que contiene probióticos beneficiosos para la flora intestinal, proporcionando 15% de la ingesta diaria     " +
                                                  "\n recomendada de calcio. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la   " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más   " +
                                                  "\n de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la  " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n En niñas, el asma puede causar dificultad respiratoria y afectar la calidad de vida, por lo que es fundamental un          " +
                                                  "\n diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que la paciente mantenga una hidratación           " +
                                                  "\n adecuada, consumiendo al menos 2 litros de agua al día para favorecer la eliminación de toxinas y mantener las vías        " +
                                                  "\n respiratorias hidratadas. También es recomendable el consumo de líquidos tibios como infusiones de manzanilla o jengibre,  " +
                                                  "\n que pueden ayudar a reducir la inflamación de las vías respiratorias. EJERCICIO: Se recomienda realizar actividades        " +
                                                  "\n físicas moderadas como juegos al aire libre, caminatas cortas o natación, siempre bajo supervisión médica para evitar      " +
                                                  "\n complicaciones y fortalecer la función pulmonar. También es importante realizar ejercicios de respiración profunda para    " +
                                                  "\n mejorar la capacidad pulmonar y reducir la sensación de falta de aire. POSIBLE TRATAMIENTO: El tratamiento estándar para   " +
                                                  "\n el asma incluye broncodilatadores de alivio rápido, como el salbutamol, corticosteroides inhalados para el control a largo " +
                                                  "\n plazo, como la fluticasona, y en algunos casos, modificadores de leucotrienos como el montelukast. Es fundamental seguir   " +
                                                  "\n estrictamente el plan de acción para el asma indicado por el médico y usar los medicamentos preventivos regularmente.      " +
                                                  "\n ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir " +
                                                  "\n la inflamación, tales como: Pescados grasos (salmón, atún): Ricos en ácidos grasos Omega-3, que poseen propiedades         " +
                                                  "\n antiinflamatorias y pueden ayudar a reducir la inflamación de las vías respiratorias. Frutas y verduras de colores vivos   " +
                                                  "\n (arándanos, fresas, espinacas, brócoli): Ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las " +
                                                  "\n células del daño y fortalecer el sistema inmunológico. Jengibre: Contiene compuestos con efectos antiinflamatorios que podrían  " +
                                                  "\n ser beneficiosos para las vías respiratorias, ayudando a reducir la inflamación y mejorar la circulación sanguínea. Cúrcuma:    " +
                                                  "\n Con su componente activo, la curcumina, también tiene potentes propiedades antiinflamatorias y antioxidantes, contribuyendo a   " +
                                                  "\n la reducción de la inflamación en los pulmones. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no        " +
                                                  "\n garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad," +
                                                  "\n se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n En niñas, el VIH/SIDA puede generar mayor vulnerabilidad a infecciones oportunistas y complicaciones sistémicas,          " +
                                                  "\n por lo que es fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que la paciente      " +
                                                  "\n mantenga una hidratación adecuada, consumiendo al menos 2.5 litros de agua al día para favorecer la eliminación de        " +
                                                  "\n toxinas y mantener el sistema inmunológico fuerte. También es recomendable el consumo de jugos naturales sin azúcar,      " +
                                                  "\n como jugo de arándano, que puede ayudar a prevenir infecciones urinarias recurrentes. EJERCICIO: Se recomienda            " +
                                                  "\n realizar actividades físicas moderadas como juegos tranquilos, caminatas cortas o ejercicios de movilidad, siempre        " +
                                                  "\n bajo supervisión médica para evitar complicaciones y fortalecer la función inmunológica. POSIBLE TRATAMIENTO: El          " +
                                                  "\n tratamiento estándar para el VIH/SIDA incluye terapia antirretroviral combinada (TAR), con medicamentos como tenofovir,   " +
                                                  "\n emtricitabina y dolutegravir, que ayudan a reducir la carga viral y mejorar la función inmunológica. Es fundamental       " +
                                                  "\n seguir estrictamente el tratamiento indicado por el médico y realizar controles periódicos para evaluar la respuesta      " +
                                                  "\n al tratamiento. ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunológico   " +
                                                  "\n y ayuden a combatir infecciones, tales como: Frutas cítricas (naranjas, limones, toronjas): Ricas en vitamina C, que      " +
                                                  "\n fortalece el sistema inmunológico y ayuda a reducir la duración de infecciones. Yogur natural: Contiene probióticos,      " +
                                                  "\n que pueden ayudar a mantener el equilibrio de la flora bacteriana y mejorar la respuesta inmunológica. Verduras de        " +
                                                  "\n hoja verde (espinaca, acelga, brócoli): Ricas en antioxidantes y vitaminas esenciales para la recuperación, como la       " +
                                                  "\n vitamina A, que contribuye a la regeneración celular. Omega-3 (salmón, atún, chía): Con propiedades antiinflamatorias     " +
                                                  "\n que pueden ayudar a reducir la inflamación y mejorar la respuesta inmunológica. Este es solo un diagnóstico               " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las           " +
                                                  "\n respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar más de un diagnóstico y consultar   " +
                                                  "\n a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n En niñas, la gonorrea puede presentar síntomas más leves o atípicos, por lo que es fundamental un diagnóstico            " +
                                                  "\n oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que la paciente mantenga una hidratación adecuada,           " +
                                                  "\n consumiendo al menos 2 litros de agua al día para favorecer la eliminación de toxinas y mantener el sistema              " +
                                                  "\n inmunológico fuerte. También es recomendable el consumo de infusiones naturales como té de manzanilla, que               " +
                                                  "\n puede ayudar a reducir la inflamación y mejorar la función renal. EJERCICIO: Se recomienda realizar actividades          " +
                                                  "\n físicas moderadas como juegos tranquilos, caminatas cortas o ejercicios de movilidad, siempre bajo supervisión           " +
                                                  "\n médica para evitar complicaciones y fortalecer la circulación sanguínea. POSIBLE TRATAMIENTO: El tratamiento             " +
                                                  "\n estándar para la gonorrea incluye antibióticos como la azitromicina y ceftriaxona, los cuales deben ser                  " +
                                                  "\n administrados bajo prescripción médica. En casos más graves, puede requerirse hospitalización para recibir               " +
                                                  "\n antibióticos intravenosos. Es fundamental que la paciente evite el contacto íntimo hasta completar el tratamiento        " +
                                                  "\n y que su pareja también reciba tratamiento para evitar reinfecciones. ALIMENTACIÓN RECOMENDADA: Se recomienda el         " +
                                                  "\n consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a combatir la infección, tales como: Ajo:          " +
                                                  "\n Posee propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene alicina, un compuesto    " +
                                                  "\n con efectos antibacterianos. Frutas cítricas (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece el        " +
                                                  "\n sistema inmunológico y ayuda a reducir la duración de infecciones. Yogur natural: Contiene probióticos, que pueden       " +
                                                  "\n ayudar a mantener el equilibrio de la flora bacteriana y mejorar la respuesta inmunológica. Verduras de hoja verde       " +
                                                  "\n (espinaca, acelga, brócoli): Ricas en antioxidantes y vitaminas esenciales para la recuperación, como la vitamina A,     " +
                                                  "\n que contribuye a la regeneración celular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no       " +
                                                  "\n garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor   " +
                                                  "\n seguridad, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n En niñas, el herpes genital puede causar molestias significativas y afectar la piel y mucosas, por lo que es                  " +
                                                  "\n fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que la paciente mantenga               " +
                                                  "\n una hidratación adecuada, consumiendo al menos 2 litros de agua al día para favorecer la eliminación de toxinas               " +
                                                  "\n y mantener el sistema inmunológico fuerte. También es recomendable el consumo de líquidos tibios como infusiones              " +
                                                  "\n de manzanilla o jengibre, que pueden ayudar a reducir la inflamación y mejorar la cicatrización de las lesiones.              " +
                                                  "\n EJERCICIO: Se recomienda realizar actividades físicas moderadas como juegos tranquilos, caminatas cortas o ejercicios         " +
                                                  "\n de movilidad, siempre bajo supervisión médica para evitar complicaciones y fortalecer la función inmunológica. POSIBLE        " +
                                                  "\n TRATAMIENTO: El tratamiento estándar para el herpes genital incluye antivirales como aciclovir, valaciclovir y famciclovir,   " +
                                                  "\n administrados bajo prescripción médica. Estos medicamentos ayudan a reducir la duración y gravedad de los síntomas, así       " +
                                                  "\n como la frecuencia de los brotes recurrentes. También es fundamental evitar el contacto con posibles fuentes de infección     " +
                                                  "\n y mantener una higiene adecuada para prevenir la propagación del virus. ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo    " +
                                                  "\n de alimentos que fortalezcan el sistema inmunológico y ayuden a combatir la infección, tales como: Ajo: Posee propiedades     " +
                                                  "\n antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene alicina, un compuesto con efectos antibacterianos." +
                                                  "\n Frutas cítricas (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece el sistema inmunológico y ayuda a reducir    " +
                                                  "\n la duración de infecciones. Yogur natural: Contiene probióticos, que pueden ayudar a mantener el equilibrio de la flora        " +
                                                  "\n bacteriana y mejorar la respuesta inmunológica. Verduras de hoja verde (espinaca, acelga, brócoli): Ricas en antioxidantes     " +
                                                  "\n y vitaminas esenciales para la recuperación, como la vitamina A, que contribuye a la regeneración celular. Este es solo un     " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las    " +
                                                  "\n respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar más de un diagnóstico y consultar a un   " +
                                                  "\n médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n En niñas, la sífilis puede causar síntomas graves si no se trata a tiempo, por lo que es fundamental un diagnóstico      " +
                                                  "\n oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que la paciente mantenga una hidratación adecuada,           " +
                                                  "\n consumiendo al menos 2 litros de agua al día para favorecer la eliminación de toxinas y mantener el sistema inmunológico " +
                                                  "\n fuerte. También es recomendable el consumo de sueros de rehidratación oral para reponer electrolitos esenciales          " +
                                                  "\n como sodio, potasio y cloro, los cuales se pierden con la fiebre y malestar general. EJERCICIO: Se recomienda realizar   " +
                                                  "\n actividades físicas moderadas como juegos tranquilos, caminatas cortas o ejercicios de movilidad, siempre bajo           " +
                                                  "\n supervisión médica para evitar complicaciones y fortalecer la función inmunológica. POSIBLE TRATAMIENTO: El tratamiento  " +
                                                  "\n estándar para la sífilis incluye antibióticos como la penicilina G benzatina, administrada en dosis única intramuscular, " +
                                                  "\n o alternativas como doxiciclina o ceftriaxona en casos de alergia a la penicilina. Es fundamental seguir el tratamiento  " +
                                                  "\n completo para evitar complicaciones graves. ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo de alimentos que          " +
                                                  "\n fortalezcan el sistema inmunológico y ayuden a combatir la infección, tales como: Ajo: Posee propiedades antimicrobianas " +
                                                  "\n naturales que pueden ayudar a combatir infecciones y contiene alicina, un compuesto con efectos antibacterianos. Frutas  " +
                                                  "\n cítricas (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece el sistema inmunológico y ayuda a reducir la  " +
                                                  "\n duración de infecciones. Yogur natural: Contiene probióticos, que pueden ayudar a mantener el equilibrio de la flora          " +
                                                  "\n bacteriana y mejorar la respuesta inmunológica. Verduras de hoja verde (espinaca, acelga, brócoli): Ricas en antioxidantes    " +
                                                  "\n y vitaminas esenciales para la recuperación, como la vitamina A, que contribuye a la regeneración celular. Este es solo un    " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las   " +
                                                  "\n respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar más de un diagnóstico y consultar a     " +
                                                  "\n un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n En niñas, la tuberculosis puede causar síntomas respiratorios graves y afectar la función pulmonar, por lo que              " +
                                                  "\n es fundamental un diagnóstico oportuno y tratamiento adecuado. HIDRATACIÓN: Se recomienda que la paciente mantenga          " +
                                                  "\n una hidratación adecuada, consumiendo al menos 2.5 litros de agua al día para favorecer la eliminación de toxinas           " +
                                                  "\n y mantener las vías respiratorias hidratadas. También es recomendable el consumo de líquidos tibios como infusiones         " +
                                                  "\n de jengibre o manzanilla, que pueden ayudar a reducir la inflamación de las vías respiratorias. EJERCICIO: Se               " +
                                                  "\n recomienda realizar actividades físicas moderadas como juegos tranquilos, caminatas cortas o ejercicios de movilidad,       " +
                                                  "\n siempre bajo supervisión médica para evitar complicaciones y fortalecer la función pulmonar. También es importante          " +
                                                  "\n realizar ejercicios de respiración profunda para mejorar la capacidad pulmonar y reducir la sensación de falta de aire.     " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento estándar para la tuberculosis incluye un régimen de antibióticos como isoniazida,       " +
                                                  "\n rifampicina, pirazinamida y etambutol, administrados durante un período de seis meses bajo estricta supervisión médica.     " +
                                                  "\n Es fundamental seguir el tratamiento completo para evitar resistencia bacteriana. ALIMENTACIÓN RECOMENDADA: Se recomienda   " +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a combatir la infección, tales como: Ajo: Posee    " +
                                                  "\n propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene alicina, un compuesto con efectos " +
                                                  "\n antibacterianos. Frutas cítricas (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece el sistema inmunológico  " +
                                                  "\n y ayuda a reducir la duración de infecciones. Yogur natural: Contiene probióticos, que pueden ayudar a mantener el          " +
                                                  "\n equilibrio de la flora bacteriana y mejorar la respuesta inmunológica. Verduras de hoja verde (espinaca, acelga, brócoli):  " +
                                                  "\n Ricas en antioxidantes y vitaminas esenciales para la recuperación, como la vitamina A, que contribuye a la regeneración    " +
                                                  "\n celular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga   " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar más de     " +
                                                  "\n un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la      " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis. " +
                                                  "\n En niñas pequeñas, la artritis puede causar inflamación en las articulaciones, dolor, rigidez y dificultad para           " +
                                                  "\n moverse, afectando su calidad de vida. EJERCICIO: Se recomienda actividad física moderada, como ejercicios de             " +
                                                  "\n movilidad, estiramientos suaves y natación, que ayudan a fortalecer los músculos sin generar impacto en las               " +
                                                  "\n articulaciones. También es importante realizar ejercicios de respiración y relajación para reducir el estrés y            " +
                                                  "\n mejorar la oxigenación. HIDRATACIÓN: Es esencial el consumo diario de 1.5 a 2 litros de agua para mantener el cuerpo      " +
                                                  "\n hidratado y ayudar a reducir la inflamación en las articulaciones. Además del agua pura, se recomienda el consumo de      " +
                                                  "\n infusiones suaves, jugos naturales sin azúcar y caldos ligeros, que pueden aportar líquidos y minerales esenciales.       " +
                                                  "\n POSIBLE TRATAMIENTO: La artritis en niñas se trata con medicamentos antiinflamatorios no esteroideos (AINE), como         " +
                                                  "\n ibuprofeno, para aliviar el dolor y la inflamación. También se pueden utilizar fármacos antirreumáticos modificadores     " +
                                                  "\n de la enfermedad, como metotrexato, en casos más severos. En algunos casos, se recomienda terapia física y rehabilitación," +
                                                  "\n que incluye ejercicios específicos para mejorar la movilidad y reducir la rigidez articular. ALIMENTACIÓN: Se recomienda  " +
                                                  "\n el consumo de alimentos que ayuden a fortalecer el sistema inmunológico y reducir la inflamación, tales como pescados     " +
                                                  "\n grasos (salmón, atún), ricos en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias. frutas y verduras de     " +
                                                  "\n colores vivos (arándanos, fresas, espinacas, brócoli), ricas en antioxidantes como la vitamina C y carotenoides, que      " +
                                                  "\n pueden proteger las células del daño y fortalecer el sistema inmunológico. jengibre, que contiene compuestos con efectos  " +
                                                  "\n antiinflamatorios que podrían ser beneficiosos para las articulaciones. cúrcuma, con su componente activo, la curcumina,  " +
                                                  "\n que tiene potentes propiedades antiinflamatorias y antioxidantes. Este es solo un diagnóstico predeterminado lógico,      " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente    " +
                                                  "\n correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento " +
                                                  "\n adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n En niñas pequeñas, la tosferina puede causar episodios de tos intensa, dificultad para respirar y fatiga extrema,           " +
                                                  "\n afectando su bienestar. EJERCICIO: Se recomienda actividad física muy ligera, como movimientos suaves y ejercicios          " +
                                                  "\n de respiración para mejorar la oxigenación. También es importante evitar esfuerzos físicos que puedan generar fatiga        " +
                                                  "\n o dificultar la respiración. HIDRATACIÓN: Es esencial el consumo diario de 1.5 a 2 litros de agua para mantener el          " +
                                                  "\n cuerpo hidratado y ayudar a reducir la irritación de las vías respiratorias. Además del agua pura, se recomienda el         " +
                                                  "\n consumo de infusiones suaves, jugos naturales sin azúcar y caldos ligeros, que pueden aportar líquidos y nutrientes         " +
                                                  "\n esenciales. También es recomendable el consumo de bebidas con electrolitos naturales, como agua de coco, para ayudar        " +
                                                  "\n a reponer los minerales perdidos por la fiebre y sudoración. POSIBLE TRATAMIENTO: La tosferina se trata con antibióticos,   " +
                                                  "\n como azitromicina, claritromicina o eritromicina, que ayudan a reducir la duración de la enfermedad y la transmisión.       " +
                                                  "\n En casos graves, puede requerirse hospitalización para monitoreo respiratorio y administración de oxígeno. También se       " +
                                                  "\n recomienda el uso de medidas de soporte, como humidificadores para aliviar la irritación de las vías respiratorias y evitar " +
                                                  "\n ambientes con humo o contaminantes. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema  " +
                                                  "\n inmunológico y reducir la inflamación, tales como jengibre, que contiene compuestos con efectos antiinflamatorios y         " +
                                                  "\n antioxidantes. cúrcuma, con su componente activo, la curcumina, que tiene propiedades antiinflamatorias y antioxidantes.    " +
                                                  "\n frutas cítricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalecen el sistema inmunológico. miel, que puede " +
                                                  "\n ayudar a calmar la irritación de la garganta y reducir la tos. caldo de pollo, que aporta líquidos y nutrientes esenciales  " +
                                                  "\n para la recuperación. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la     " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más    " +
                                                  "\n de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la   " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n En niñas pequeñas, las paperas pueden causar inflamación de las glándulas salivales, fiebre, dolor y dificultad             " +
                                                  "\n para masticar y tragar. EJERCICIO: Se recomienda actividad física ligera, como caminatas cortas y juegos tranquilos,        " +
                                                  "\n evitando esfuerzos excesivos que puedan generar fatiga. También es importante realizar ejercicios de movilidad para         " +
                                                  "\n mantener la flexibilidad y evitar la rigidez muscular. HIDRATACIÓN: Es fundamental el consumo diario de 1.5 a 2 litros      " +
                                                  "\n de agua para mantener el cuerpo hidratado y ayudar a reducir la fiebre y el malestar. Además del agua pura, se recomienda   " +
                                                  "\n el consumo de caldos ligeros, jugos naturales sin azúcar y infusiones suaves, que pueden aportar líquidos y nutrientes      " +
                                                  "\n esenciales. También es recomendable el consumo de bebidas con electrolitos naturales, como agua de coco, para ayudar a      " +
                                                  "\n reponer los minerales perdidos por la fiebre y sudoración. POSIBLE TRATAMIENTO: No existe un tratamiento específico para    " + 
                                                  "\n las paperas, ya que es una enfermedad viral. Sin embargo, se recomienda el uso de medicamentos para aliviar los síntomas,   " +
                                                  "\n como paracetamol o ibuprofeno, para reducir la fiebre y el dolor. También es importante el reposo, la hidratación adecuada  " +
                                                  "\n y una alimentación de consistencia blanda para facilitar la ingesta de alimentos. ALIMENTACIÓN: Se recomienda el consumo    " +
                                                  "\n de alimentos que ayuden a fortalecer el sistema inmunológico y reducir la inflamación, tales como jengibre, que contiene    " +
                                                  "\n compuestos con efectos antiinflamatorios y antioxidantes. cúrcuma, con su componente activo, la curcumina, que tiene        " +
                                                  "\n propiedades antiinflamatorias y antioxidantes. frutas cítricas (naranjas, limones, toronjas), ricas en vitamina C, que      " +
                                                  "\n fortalecen el sistema inmunológico. miel, que puede ayudar a calmar la irritación de la garganta y reducir la inflamación.  " +
                                                  "\n caldo de pollo, que aporta líquidos y nutrientes esenciales para la recuperación. Este es solo un diagnóstico predeterminado " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean             " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el  " +
                                                  "\n tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física moderada, evitando esfuerzos excesivos que puedan generar   " +
                                                  "\n fatiga. Se sugiere ejercicios suaves como caminatas cortas o juegos tranquilos en casa. HIDRATACIÓN: Debido a la fiebre y   " +
                                                  "\n la posible deshidratación causada por el Zika, se recomienda el consumo diario de 2 a 2.5 litros de agua al día (ocho a diez " +
                                                  "\n vasos de tamaño regular). También es beneficioso el consumo de agua de coco, que ayuda a reponer electrolitos perdidos, y    " +
                                                  "\n jugos naturales sin azúcar, ricos en antioxidantes que pueden fortalecer el sistema inmune. POSIBLE TRATAMIENTO: Para el     " +
                                                  "\n Zika en niñas, no existe un tratamiento específico, ya que es una enfermedad viral autolimitada. Se recomienda reposo,       " +
                                                  "\n hidratación y control de fiebre con paracetamol (Tempra) o ibuprofeno. Es fundamental evitar el uso de aspirina y otros      " +
                                                  "\n antiinflamatorios no esteroides debido al riesgo de complicaciones hemorrágicas. ALIMENTACIÓN: Se recomienda el consumo      " +
                                                  "\n de alimentos que fortalezcan el sistema inmune y ayuden a la recuperación, tales como Naranjas: ricas en vitamina C (89% del " +
                                                  "\n consumo diario recomendado por cada 100g), que ayuda a mejorar la respuesta inmunológica. Papaya: contiene vitamina C (157%  " +
                                                  "\n del consumo diario recomendado por cada 100g) y flavonoides que pueden ayudar a reducir la inflamación. Jengibre: con        " +
                                                  "\n propiedades antiinflamatorias que pueden aliviar la fatiga y mejorar la respuesta inmune. Miel: ayuda a calmar la garganta   " +
                                                  "\n y tiene propiedades antimicrobianas. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al   " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar más    " +
                                                  "\n de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico     " +
                                                  "\n no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y        " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física ligera, evitando esfuerzos excesivos que       " +
                                                  "\n puedan agravar la deshidratación. Se sugiere juegos tranquilos en casa y caminatas cortas. HIDRATACIÓN:        " +
                                                  "\n Debido a la diarrea y los vómitos causados por el rotavirus, es fundamental una hidratación constante.         " +
                                                  "\n Se recomienda el consumo diario de 2.5 a 3 litros de agua al día (diez a doce vasos de tamaño regular)         " +
                                                  "\n para compensar la pérdida de líquidos. También se recomienda el uso de soluciones de rehidratación oral        " +
                                                  "\n como Pedialyte, suero casero (agua, sal y azúcar) y caldos ligeros, que ayudan a reponer electrolitos          " +
                                                  "\n esenciales. POSIBLE TRATAMIENTO: Para el rotavirus en niñas, no existe un tratamiento específico, ya que       " +
                                                  "\n es una enfermedad viral autolimitada. Se recomienda rehidratación constante, reposo y control de fiebre con    " +
                                                  "\n paracetamol (Tempra) o ibuprofeno. En casos graves, puede requerirse hospitalización con administración de     " +
                                                  "\n líquidos intravenosos. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a estabilizar el sistema     " +
                                                  "\n digestivo y compensar la pérdida de nutrientes, tales como Plátanos: ricos en potasio (12% del consumo diario      " +
                                                  "\n recomendado por cada 100g), que ayuda a reemplazar los electrolitos perdidos. Manzanas: contienen pectina, que     " +
                                                  "\n ayuda a regular la digestión y reducir la diarrea. Arroz blanco: fuente de carbohidratos de fácil digestión que    " +
                                                  "\n ayuda a recuperar energía. Zanahorias: ricas en vitamina A (334% del consumo diario recomendado por cada 100g),    " +
                                                  "\n que contribuye a la regeneración celular y la salud intestinal. Yogur natural: fuente de probióticos que ayudan    " +
                                                  "\n a restaurar la flora intestinal y fortalecer el sistema inmune. Este es solo un diagnóstico predeterminado lógico. " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente" +
                                                  "\n correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además,  " +
                                                  "\n por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.      " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física moderada, evitando esfuerzos excesivos que             " +
                                                  "\n puedan generar fatiga. Se sugiere ejercicios suaves como caminatas cortas o juegos tranquilos en casa. HIDRATACIÓN:    " +
                                                  "\n Debido a los síntomas gastrointestinales y fiebre que puede causar la listeriosis, se recomienda el consumo diario     " +
                                                  "\n de 2 a 2.5 litros de agua al día (ocho a diez vasos de tamaño regular). También es beneficioso el consumo de           " +
                                                  "\n infusiones de jengibre, que pueden ayudar a reducir la inflamación, y caldos ligeros, que aportan electrolitos         " +
                                                  "\n esenciales. POSIBLE TRATAMIENTO: Para la listeriosis en niñas, el tratamiento suele incluir antibióticos como          " +
                                                  "\n ampicilina o gentamicina, administrados bajo supervisión médica. En casos graves, puede requerirse hospitalización     " +
                                                  "\n con tratamiento intravenoso. ALIMENTACIÓN: Se recomienda el consumo de alimentos que fortalezcan el sistema inmune     " +
                                                  "\n y ayuden a la recuperación, tales como Espinacas: contienen hierro (15% del consumo diario recomendado por cada 100g)  " +
                                                  "\n y vitamina A (56% del consumo diario recomendado por cada 100g), esenciales para la regeneración celular. Yogur        " +
                                                  "\n natural: fuente de probióticos que ayudan a restaurar la flora intestinal y fortalecer el sistema inmune. Jengibre:    " +
                                                  "\n con propiedades antiinflamatorias que pueden aliviar la fatiga y mejorar la respuesta inmune. Miel: ayuda a calmar     " +
                                                  "\n la garganta y tiene propiedades antimicrobianas. Ajo: contiene alicina, un compuesto con propiedades antimicrobianas   " +
                                                  "\n que pueden ayudar a combatir infecciones. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no     " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se         " +
                                                  "\n recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud,       " +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACIÓN: La hidratación es esencial para combatir la deshidratación causada por la diarrea intensa, uno de            " +
                                                  "\n los síntomas principales de la shigelosis. Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho         " +
                                                  "\n vasos de tamaño regular) para reponer los líquidos perdidos y evitar complicaciones como el desequilibrio                 " +
                                                  "\n electrolítico. Además, es recomendable el uso de soluciones de rehidratación oral para recuperar los minerales            " +
                                                  "\n esenciales. EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo absoluto para evitar el desgaste      " +
                                                  "\n energético y permitir que el cuerpo se recupere. Sin embargo, una vez que los síntomas comienzan a mejorar, es            " +
                                                  "\n recomendable realizar ejercicios de movilidad suave, como estiramientos ligeros y caminatas cortas, para estimular la     " +
                                                  "\n circulación y evitar la fatiga muscular causada por el reposo prolongado. POSIBLE TRATAMIENTO: El tratamiento para la     " +
                                                  "\n shigelosis incluye antibióticos como ciprofloxacina, azitromicina o ceftriaxona, dependiendo de la gravedad del caso      " +
                                                  "\n y la resistencia bacteriana. También se recomienda el uso de sales de rehidratación oral para prevenir la deshidratación  " +
                                                  "\n severa. En México, estos medicamentos están disponibles en instituciones de salud como el IMSS y el Insabi. Es crucial    " +
                                                  "\n seguir estrictamente el tratamiento indicado por el médico y garantizar la adherencia para evitar complicaciones.         " +
                                                  "\n ALIMENTACIÓN: También es recomendable el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a la       " +
                                                  "\n recuperación intestinal, tales como plátanos, ricos en potasio, que ayudan a reponer electrolitos. Arroz blanco, fuente   " +
                                                  "\n de carbohidratos de fácil digestión, que contribuyen a la recuperación intestinal. Manzanas, ricas en pectina, que ayudan " +
                                                  "\n a regular la digestión y reducir la diarrea. Zanahorias, con vitamina A, que favorece la regeneración celular. Yogur natural," +
                                                  "\n fuente de probióticos, que favorecen la salud intestinal y el sistema inmunológico. Este es solo un diagnóstico              " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas   " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mayor       " +
                                                  "\n seguridad en el tratamiento adecuado del paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface     " +
                                                  "\n del todo, se recomienda consultar a su médico. Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n HIDRATACIÓN: La hidratación es clave para mantener las vías respiratorias húmedas y facilitar la eliminación de          " +
                                                  "\n secreciones, ya que la acumulación de moco espeso es un síntoma común de la EPOC. Se recomienda el consumo diario        " +
                                                  "\n de 1.5 a 2 litros de agua, además de infusiones calientes que pueden ayudar a aflojar el moco y mejorar la respiración.  " +
                                                  "\n EJERCICIO: La actividad física es fundamental para mejorar la capacidad pulmonar y reducir la sensación de falta de aire." +
                                                  "\n Se recomienda realizar ejercicios de respiración profunda, como la respiración diafragmática y la respiración con labios " +
                                                  "\n fruncidos, que ayudan a mejorar la oxigenación y reducir la fatiga. También es beneficioso realizar ejercicios de bajo   " +
                                                  "\n impacto, como caminatas suaves, yoga y estiramientos, para fortalecer los músculos respiratorios sin generar un esfuerzo " +
                                                  "\n excesivo. POSIBLE TRATAMIENTO: El tratamiento para la EPOC incluye broncodilatadores como salbutamol, corticosteroides   " +
                                                  "\n inhalados como budesonida o fluticasona, y en algunos casos, oxigenoterapia. También se recomienda la rehabilitación     " +
                                                  "\n pulmonar, que incluye ejercicios de respiración y técnicas para mejorar la capacidad pulmonar. En México, estos          " +
                                                  "\n medicamentos están disponibles en instituciones de salud como el IMSS y el Insabi. Es crucial seguir estrictamente    " +
                                                  "\n el tratamiento indicado por el médico y garantizar la adherencia para evitar complicaciones. ALIMENTACIÓN: También    " +
                                                  "\n es recomendable el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación,    " +
                                                  "\n tales como pescados grasos (salmón, atún), ricos en Omega-3, con propiedades antiinflamatorias. Frutas cítricas       " +
                                                  "\n (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunológico. Verduras de hoja verde     " +
                                                  "\n (espinacas, acelgas, brócoli), contienen antioxidantes y hierro, esenciales para la salud celular. Frutos secos       " +
                                                  "\n (almendras, nueces), aportan vitamina E, que ayuda a la regeneración celular. Yogur natural, fuente de probióticos,   " +
                                                  "\n que favorecen la salud intestinal y el sistema inmunológico. Este es solo un diagnóstico predeterminado lógico,       " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente" +
                                                  "\n correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mayor seguridad en el   " +
                                                  "\n tratamiento adecuado del paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo,    " +
                                                  "\n se recomienda consultar a su médico. Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACIÓN: La hidratación es fundamental para aliviar los síntomas urinarios de la clamidia, como el ardor al orinar   " +
                                                  "\n y la necesidad frecuente de hacerlo. Se recomienda el consumo diario de 2 litros de agua para ayudar a eliminar la       " +
                                                  "\n bacteria del tracto urinario y reducir la inflamación. También es beneficioso el consumo de jugos naturales sin azúcar,  " +
                                                  "\n como el jugo de arándano, que puede ayudar a prevenir infecciones urinarias secundarias. EJERCICIO: La actividad física  " +
                                                  "\n debe ser moderada y adaptada a la condición del paciente. Se recomienda realizar ejercicios de movilidad y estiramientos," +
                                                  "\n que ayudan a mejorar la circulación y reducir la fatiga. También es beneficioso practicar ejercicios de fortalecimiento  " +
                                                  "\n muscular, como pilates o yoga, para mejorar la resistencia del cuerpo y favorecer la recuperación. POSIBLE TRATAMIENTO:  " +
                                                  "\n El tratamiento para la clamidia incluye antibióticos como azitromicina, doxiciclina o levofloxacina, dependiendo de la   " +
                                                  "\n gravedad del caso. También se recomienda que la pareja del paciente reciba tratamiento para evitar reinfecciones.        " +
                                                  "\n En México, estos medicamentos están disponibles en instituciones de salud como el IMSS y el Insabi. Es crucial seguir    " +
                                                  "\n estrictamente el tratamiento indicado por el médico y garantizar la adherencia para evitar complicaciones. ALIMENTACIÓN:    " +
                                                  "\n También es recomendable el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación,  " +
                                                  "\n tales como frutas cítricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunológico.       " +
                                                  "\n Verduras de hoja verde (espinacas, acelgas, brócoli), contienen antioxidantes y hierro, esenciales para la salud celular.   " +
                                                  "\n Pescados grasos (salmón, atún), ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos (almendras, nueces),      " +
                                                  "\n aportan vitamina E, que ayuda a la regeneración celular. Yogur natural, fuente de probióticos, que favorecen la salud       " +
                                                  "\n intestinal y el sistema inmunológico. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza    " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda  " +
                                                  "\n realizar más de un Diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Además,  " +
                                                  "\n por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L.       " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tamaño regular)            " +
                                                  "\n para mantener la hidratación y ayudar a reducir la fiebre, lo que es fundamental en el proceso de recuperación.         " +
                                                  "\n La meningitis bacteriana puede provocar fiebre alta, vómitos, rigidez en el cuello y sensibilidad a la luz, lo          " +
                                                  "\n que puede llevar a una mayor pérdida de líquidos. Es importante que el paciente consuma líquidos ricos en               " +
                                                  "\n electrolitos, como sueros orales, caldos y jugos naturales sin azúcar, para evitar la deshidratación y mantener         " +
                                                  "\n el equilibrio de minerales esenciales. También se recomienda el consumo de infusiones suaves, como manzanilla o         " +
                                                  "\n jengibre, que pueden ayudar a aliviar las náuseas y mejorar la digestión. EJERCICIO: La actividad física debe ser       " +
                                                  "\n muy ligera y supervisada, evitando esfuerzos excesivos que puedan agravar los síntomas, ejercicios de respiración       " +
                                                  "\n profunda y movilidad suave pueden ser beneficiosos para mejorar la capacidad pulmonar y la circulación. POSIBLE         " +
                                                  "\n TRATAMIENTO: El tratamiento estándar para la meningitis bacteriana en niños incluye antibióticos como ceftriaxona,      " +
                                                  "\n ampicilina y vancomicina, administrados por vía intravenosa durante 7 a 14 días, en México algunas marcas reconocidas   " +
                                                  "\n incluyen Rocephin (ceftriaxona) y Amikin (amikacina), además se recomienda el uso de corticosteroides como              " +
                                                  "\n dexametasona para reducir la inflamación cerebral en casos graves. ALIMENTACIÓN: Para fortalecer el sistema             " +
                                                  "\n inmunológico y apoyar la recuperación, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes         " +
                                                  "\n y proteínas. Naranjas y fresas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa      " +
                                                  "\n hasta el 100% de la ingesta diaria recomendada, fortaleciendo el sistema inmunológico y ayudando a reducir la           " +
                                                  "\n inflamación. Espinacas y lentejas: Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25%          " +
                                                  "\n y 40% de la ingesta diaria recomendada, lo que ayuda a mejorar la oxigenación celular y reducir el cansancio.           " +
                                                  "\n Carnes magras y huevos: Son una fuente importante de proteínas, proporcionando entre 20 y 25 g por cada 100 g,          " +
                                                  "\n lo que equivale al 40-50% de la recomendación diaria, esenciales para la regeneración celular y el fortalecimiento      " +
                                                  "\n muscular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente    " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar   " +
                                                  "\n más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 1.5 a 2.5 litros de agua (seis a diez vasos de tamaño regular) para mantener     " +
                                                  "\n la hidratación y ayudar a reducir los efectos secundarios del tratamiento, lo que es fundamental en el proceso de recuperación.  " +
                                                  "\n Los niños con cáncer pueden experimentar vómitos, diarrea y sudoración excesiva, lo que aumenta el riesgo de deshidratación.     " +
                                                  "\n Es esencial consumir líquidos ricos en electrolitos, como sueros orales y caldos, para reponer los minerales perdidos.           " +
                                                  "\n También se recomienda el consumo de agua con limón o infusiones suaves, que pueden ayudar a aliviar las náuseas y mejorar la     " +
                                                  "\n digestión. EJERCICIO: La actividad física debe ser moderada y adaptada, evitando esfuerzos excesivos que puedan debilitar el     " +
                                                  "\n sistema inmunológico, ejercicios como yoga, caminatas suaves y natación pueden ser beneficiosos para mejorar la resistencia      " +
                                                  "\n y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento para el cáncer en niños depende del tipo específico de cáncer, pero     " +
                                                  "\n puede incluir quimioterapia, radioterapia y cirugía, en México algunas marcas reconocidas incluyen Methotrexate (metotrexato)    " +
                                                  "\n y Vincristine (vincristina), además se recomienda el uso de terapias complementarias como apoyo nutricional y psicológico para   " +
                                                  "\n mejorar la calidad de vida del paciente. ALIMENTACIÓN: Para fortalecer el sistema inmunológico y apoyar la recuperación, se      " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes, proteínas y ácidos grasos esenciales. Brócoli y zanahorias:       " +
                                                  "\n Contienen aproximadamente 50-80 mg de vitamina C por cada 100 g, lo que representa hasta el 90% de la ingesta diaria         " +
                                                  "\n recomendada, fortaleciendo el sistema inmunológico. Salmón y chía: Son fuentes de omega-3, proporcionando entre 2-4 g por    " +
                                                  "\n cada 100 g, lo que ayuda a reducir la inflamación y mejorar la función celular. Frutas y verduras de colores vivos: Como     " +
                                                  "\n arándanos y espinacas, que son ricas en antioxidantes y ayudan a proteger las células del daño. Este es solo un diagnóstico  " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas   " +
                                                  "\n sean completamente correctas, para mayor seguridad se recomienda realizar más de un diagnóstico y consultar a un médico.     " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.50-1.75 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n La influenza es una infección viral que afecta el sistema respiratorio, causando fiebre alta, tos, dolor muscular       " +
                                                  "\n y fatiga. HIDRATACIÓN: Se recomienda que la paciente mantenga una hidratación adecuada, consumiendo al menos 2          " +
                                                  "\n litros de agua al día para prevenir la deshidratación causada por la fiebre y la sudoración. También es recomendable    " +
                                                  "\n el consumo de caldos ligeros, infusiones tibias y jugos naturales sin azúcar, que pueden ayudar a aliviar la garganta   " +
                                                  "\n irritada y fortalecer el sistema inmunológico. EJERCICIO: Durante la enfermedad, se recomienda evitar actividades       " +
                                                  "\n físicas intensas y optar por movimientos suaves como estiramientos o caminatas cortas dentro del hogar para evitar      " +
                                                  "\n el agotamiento. Una vez recuperada, es importante retomar la actividad física progresivamente para fortalecer el        " +
                                                  "\n sistema inmunológico y mejorar la resistencia física. POSIBLE TRATAMIENTO: El tratamiento estándar para la influenza    " +
                                                  "\n incluye medicamentos para reducir la fiebre y aliviar los síntomas, como el paracetamol y el ibuprofeno. En casos de    " +
                                                  "\n riesgo, el médico puede prescribir antivirales como oseltamivir para reducir la duración de la enfermedad. También      " +
                                                  "\n se recomienda el descanso adecuado y el aislamiento para evitar la propagación del virus. ALIMENTACIÓN RECOMENDADA:     " +
                                                  "\n Se recomienda el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a la recuperación, tales como:   " +
                                                  "\n Naranjas: Ricas en vitamina C, que fortalece el sistema inmunológico y ayuda a reducir la duración de infecciones.      " +
                                                  "\n Fresas: Ricas en vitamina C y antioxidantes, que protegen las células del daño. Plátanos: Ricos en potasio, que    " +
                                                  "\n puede ayudar a reemplazar los electrolitos perdidos debido a la fiebre y sudoración. Kiwi: Rico en vitamina C y    " +
                                                  "\n potasio, que contribuye a la recuperación. Este es solo un diagnóstico predeterminado lógico, haberlo consultado   " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas.     " +
                                                  "\n Para mayor seguridad, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el      " +
                                                  "\n tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n La neumonía es una infección pulmonar que puede causar dificultad respiratoria, fiebre alta y dolor en el pecho.         " +
                                                  "\n HIDRATACIÓN: Se recomienda que la paciente mantenga una hidratación adecuada, consumiendo al menos 2.5 litros de         " +
                                                  "\n agua al día para favorecer la eliminación de toxinas y mantener las vías respiratorias hidratadas. También es            " +
                                                  "\n recomendable el consumo de líquidos tibios como infusiones de jengibre o manzanilla, que pueden ayudar a reducir         " +
                                                  "\n la inflamación de las vías respiratorias. EJERCICIO: Durante la enfermedad, se recomienda evitar actividades             " +
                                                  "\n físicas intensas y optar por movimientos suaves como estiramientos o caminatas cortas dentro del hogar para evitar       " +
                                                  "\n el agotamiento. Una vez recuperada, es importante realizar ejercicios de respiración profunda para mejorar la            " +
                                                  "\n capacidad pulmonar y fortalecer los músculos respiratorios. POSIBLE TRATAMIENTO: El tratamiento estándar para la         " +
                                                  "\n neumonía incluye antibióticos como amoxicilina o azitromicina, administrados bajo prescripción médica. En casos          " +
                                                  "\n graves, puede requerirse hospitalización para administración de antibióticos intravenosos y oxigenoterapia. También      " +
                                                  "\n se recomienda el descanso adecuado y el monitoreo de síntomas para evitar complicaciones. ALIMENTACIÓN RECOMENDADA:      " +
                                                  "\n Se recomienda el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a combatir la infección,          " +
                                                  "\n tales como: Ajo: Posee propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene         " +
                                                  "\n alicina, un compuesto con efectos antibacterianos. Frutas cítricas (naranjas, limones, toronjas): Ricas en vitamina C,   " +
                                                  "\n que fortalece el sistema inmunológico y ayuda a reducir la duración de infecciones. Yogur natural: Contiene probióticos, " +
                                                  "\n que pueden ayudar a mantener el equilibrio de la flora bacteriana y mejorar la respuesta inmunológica. Verduras de hoja  " +
                                                  "\n verde (espinaca, acelga, brócoli): Ricas en antioxidantes y vitaminas esenciales para la recuperación, como la           " +
                                                  "\n vitamina A, que contribuye a la regeneración celular. Este es solo un diagnóstico predeterminado lógico, haberlo         " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente           " +
                                                  "\n correctas. Para mayor seguridad, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer    " +
                                                  "\n el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n La diabetes es una enfermedad crónica que afecta el metabolismo y la producción de insulina, lo que puede generar       " +
                                                  "\n complicaciones en el organismo. HIDRATACIÓN: Se recomienda que la paciente mantenga una hidratación adecuada,           " +
                                                  "\n consumiendo al menos 2.5 litros de agua al día para favorecer la eliminación de toxinas y mantener el equilibrio        " +
                                                  "\n de glucosa en sangre. También es recomendable el consumo de jugos naturales sin azúcar, como jugo de arándano, que      " +
                                                  "\n puede ayudar a prevenir infecciones urinarias recurrentes. EJERCICIO: Se recomienda realizar actividades físicas        " +
                                                  "\n moderadas como juegos tranquilos, caminatas cortas o ejercicios de movilidad, siempre bajo supervisión médica para      " +
                                                  "\n evitar complicaciones y fortalecer la función metabólica. También es importante incluir ejercicios de resistencia       " +
                                                  "\n para mejorar la sensibilidad a la insulina y mantener un peso saludable. POSIBLE TRATAMIENTO: El tratamiento estándar   " +
                                                  "\n para la diabetes incluye insulina en el caso de diabetes tipo 1 y cambios en el estilo de vida para la diabetes tipo 2. " +
                                                  "\n En algunos casos, puede requerirse el uso de medicamentos como metformina para controlar los niveles de glucosa.        " +
                                                  "\n También se recomienda el monitoreo constante de los niveles de azúcar en sangre y la educación sobre el manejo de       " +
                                                  "\n la enfermedad. ALIMENTACIÓN RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunológico  " +
                                                  "\n y ayuden a mantener niveles adecuados de glucosa, tales como: Frutas cítricas (naranjas, limones, toronjas): Ricas en   " +
                                                  "\n vitamina C, que fortalece el sistema inmunológico y ayuda a reducir la duración de infecciones. Yogur natural:          " +
                                                  "\n Contiene probióticos, que pueden ayudar a mantener el equilibrio de la flora bacteriana y mejorar la respuesta          " +
                                                  "\n inmunológica. Verduras de hoja verde (espinaca, acelga, brócoli): Ricas en antioxidantes y vitaminas esenciales         " +
                                                  "\n para la recuperación, como la vitamina A, que contribuye a la regeneración celular. Omega-3 (salmón, atún, chía):       " +
                                                  "\n Con propiedades antiinflamatorias que pueden ayudar a reducir la inflamación y mejorar la respuesta inmunológica.       " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga        " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar        " +
                                                  "\n más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu       " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n En niñas pequeñas, el asma puede causar dificultad para respirar, tos persistente, sibilancias y fatiga, afectando   " +
                                                  "\n su bienestar y calidad de vida. EJERCICIO: Se recomienda actividad física moderada, como caminatas suaves, juegos    " +
                                                  "\n tranquilos y ejercicios de respiración para mejorar la oxigenación. También es importante evitar esfuerzos físicos   " +
                                                  "\n que puedan generar fatiga o dificultar la respiración. HIDRATACIÓN: Es esencial el consumo diario de 1.5 a 2 litros  " +
                                                  "\n de agua para mantener el cuerpo hidratado y ayudar a reducir la inflamación de las vías respiratorias. Además del    " +
                                                  "\n agua pura, se recomienda el consumo de infusiones suaves, jugos naturales sin azúcar y caldos ligeros, que pueden    " +
                                                  "\n aportar líquidos y nutrientes esenciales. También es recomendable el consumo de bebidas con electrolitos naturales,  " +
                                                  "\n como agua de coco, para ayudar a reponer los minerales perdidos por la fiebre y sudoración. POSIBLE TRATAMIENTO:     " +
                                                  "\n El asma se trata con broncodilatadores, como salbutamol, para aliviar los episodios agudos, y corticosteroides       " +
                                                  "\n inhalados, como budesonida, para reducir la inflamación de las vías respiratorias. También se recomienda el uso      " +
                                                  "\n de antihistamínicos en casos de alergias asociadas y terapia respiratoria, que incluye ejercicios específicos        " +
                                                  "\n para mejorar la capacidad pulmonar. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer      " +
                                                  "\n el sistema respiratorio y reducir la inflamación, tales como pescados grasos (salmón, atún), ricos en ácidos         " +
                                                  "\n grasos Omega-3, que poseen propiedades antiinflamatorias. frutas y verduras de colores vivos (arándanos, fresas,     " +
                                                  "\n espinacas, brócoli), ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las células       " +
                                                  "\n del daño y fortalecer el sistema inmunológico. jengibre, que contiene compuestos con efectos antiinflamatorios       " +
                                                  "\n que podrían ser beneficiosos para las vías respiratorias. cúrcuma, con su componente activo, la curcumina, que       " +
                                                  "\n tiene potentes propiedades antiinflamatorias y antioxidantes. Este es solo un diagnóstico predeterminado lógico,     " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente " +
                                                  "\n correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el  " +
                                                  "\n tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n En niñas pequeñas, el VIH puede afectar el sistema inmunológico y requerir un tratamiento especializado para evitar    " +
                                                  "\n complicaciones graves. EJERCICIO: Se recomienda actividad física moderada, adaptada a la capacidad de la niña, como    " +
                                                  "\n juegos tranquilos, caminatas suaves y ejercicios de movilidad para mejorar la circulación y reducir la fatiga.         " +
                                                  "\n También es recomendable realizar ejercicios de respiración y relajación para mejorar la oxigenación y reducir el       " +
                                                  "\n estrés. HIDRATACIÓN: Es esencial el consumo diario de 2 a 2.5 litros de agua para mantener el cuerpo hidratado y       " +
                                                  "\n ayudar a reducir los efectos secundarios del tratamiento. Además del agua pura, se recomienda el consumo de jugos      " +
                                                  "\n naturales ricos en antioxidantes, como jugo de naranja o toronja, que pueden fortalecer el sistema inmunológico.       " +
                                                  "\n También es beneficioso ingerir caldos ligeros, que aportan líquidos y minerales esenciales para la recuperación.       " +
                                                  "\n POSIBLE TRATAMIENTO: El VIH en niñas se trata con terapia antirretroviral (TAR), que incluye medicamentos como         " +
                                                  "\n lamivudina, abacavir y lopinavir, para reducir la carga viral y fortalecer el sistema inmunológico. También se         " +
                                                  "\n recomienda un plan de alimentación saludable, monitoreo constante de los niveles de CD4 y seguimiento médico especializado." +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmunológico y reducir la       " +
                                                  "\n inflamación, tales como arándanos, ricos en antioxidantes y vitamina C. espinacas, que contienen hierro y vitamina A,  " +
                                                  "\n esenciales para la recuperación. jengibre, con propiedades antiinflamatorias y antioxidantes. cúrcuma, con curcumina,  " +
                                                  "\n que tiene propiedades antiinflamatorias y antioxidantes. yogur natural, que contiene probióticos beneficiosos para la  " +
                                                  "\n flora intestinal. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la    " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar   " +
                                                  "\n más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu      " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n En niñas pequeñas, la gonorrea puede causar síntomas como secreción anormal, dolor al orinar y fiebre, y requiere     " +
                                                  "\n tratamiento inmediato para evitar complicaciones. EJERCICIO: Se recomienda actividad física moderada, como caminatas  " +
                                                  "\n suaves y ejercicios de movilidad para mejorar la circulación y reducir la fatiga. También es recomendable realizar    " +
                                                  "\n ejercicios de relajación y respiración para reducir el estrés, ya que este puede afectar la respuesta inmunológica    " +
                                                  "\n y prolongar la infección. HIDRATACIÓN: Es esencial el consumo diario de 2.5 a 2.75 litros de agua para mantener el    " +
                                                  "\n cuerpo hidratado y ayudar a reducir la inflamación. Además del agua pura, se recomienda el consumo de jugos naturales " +
                                                  "\n ricos en vitamina C, como jugo de naranja o toronja, que pueden fortalecer el sistema inmunológico. También es        " +
                                                  "\n beneficioso ingerir caldos ligeros, que aportan líquidos y minerales esenciales para la recuperación. POSIBLE         " +
                                                  "\n TRATAMIENTO: La gonorrea se trata con antibióticos, como ceftriaxona o azitromicina, administrados en una sola dosis  " +
                                                  "\n o en un régimen de varios días. En casos más severos, se puede requerir tratamiento prolongado con antibióticos       " +
                                                  "\n adicionales, dependiendo de la resistencia bacteriana. También se recomienda el uso de probióticos para restaurar la  " +
                                                  "\n flora intestinal y mejorar la recuperación. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer " +
                                                  "\n el sistema inmunológico y reducir la inflamación, tales como arándanos, ricos en antioxidantes y vitamina C. espinacas, " +
                                                  "\n que contienen hierro y vitamina A, esenciales para la recuperación. jengibre, con propiedades antiinflamatorias y       " +
                                                  "\n antioxidantes. cúrcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes. yogur natural, que      " +
                                                  "\n contiene probióticos beneficiosos para la flora intestinal. Este es solo un diagnóstico predeterminado lógico, haberlo  " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas." +
                                                  "\n Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes Genital." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física moderada, evitando esfuerzos excesivos que puedan          " +
                                                  "\n generar fatiga o estrés, ya que el herpes puede activarse en situaciones de debilitamiento del sistema inmunológico.       " +
                                                  "\n Se sugiere ejercicios suaves como caminatas cortas o juegos tranquilos en casa. HIDRATACIÓN: Se recomienda el consumo      " +
                                                  "\n diario de 1.5 a 2 litros de agua al día (seis a ocho vasos de tamaño regular) para mantener una adecuada hidratación       " +
                                                  "\n y ayudar a la recuperación. También es beneficioso el consumo de infusiones de manzanilla, que pueden ayudar a reducir     " +
                                                  "\n la inflamación, y agua con limón, rica en vitamina C, que fortalece el sistema inmune. POSIBLE TRATAMIENTO: Para el        " +
                                                  "\n herpes genital en niñas, el tratamiento suele incluir antivirales como aciclovir, valaciclovir o famciclovir, administrados" +
                                                  "\n bajo supervisión médica para reducir la duración y severidad de los brotes. También se recomienda el uso de cremas tópicas " +
                                                  "\n para aliviar el dolor y la irritación. ALIMENTACIÓN: Se recomienda el consumo de alimentos que fortalezcan el sistema      " +
                                                  "\n inmune y ayuden a la recuperación, tales como Yogur natural: fuente de probióticos que ayudan a fortalecer el sistema      " +
                                                  "\n inmune y mejorar la salud intestinal. Ajo: contiene alicina, un compuesto con propiedades antimicrobianas que pueden       " +
                                                  "\n ayudar a combatir infecciones. Jengibre: con propiedades antiinflamatorias que pueden aliviar la fatiga y mejorar la       " +
                                                  "\n respuesta inmune. Frutas cítricas (naranjas, limones, toronjas): ricas en vitamina C (hasta 89% del consumo diario         " +
                                                  "\n recomendado por cada 100g), que ayuda a mejorar la respuesta inmunológica. Miel: ayuda a calmar la garganta y tiene        " +
                                                  "\n propiedades antimicrobianas. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100%    " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar más de    " +
                                                  "\n un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no   " +
                                                  "\n le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera  " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física moderada, evitando esfuerzos excesivos que       " +
                                                  "\n puedan generar fatiga. Se sugiere ejercicios suaves como caminatas cortas o juegos tranquilos en casa.           " +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 1.5 a 2 litros de agua al día (seis a ocho vasos de tamaño       " +
                                                  "\n regular) para mantener una adecuada hidratación y ayudar a la recuperación. También es beneficioso el consumo    " +
                                                  "\n de infusiones de jengibre, que pueden ayudar a reducir la inflamación, y agua con limón, rica en vitamina C,     " +
                                                  "\n que fortalece el sistema inmune. POSIBLE TRATAMIENTO: Para la sífilis en niñas, el tratamiento suele incluir     " +
                                                  "\n penicilina como primera línea de defensa, administrada bajo supervisión médica. En casos de alergia a la         " +
                                                  "\n penicilina, pueden utilizarse otros antibióticos como doxiciclina o azitromicina. ALIMENTACIÓN: Se recomienda    " +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmune y ayuden a la recuperación, tales como Espinacas:      " +
                                                  "\n contienen hierro (15% del consumo diario recomendado por cada 100g) y vitamina A (56% del consumo diario         " +
                                                  "\n recomendado por cada 100g), esenciales para la regeneración celular. Yogur natural: fuente de probióticos que    " +
                                                  "\n ayudan a restaurar la flora intestinal y fortalecer el sistema inmune. Jengibre: con propiedades antiinflamatorias" +
                                                  "\n que pueden aliviar la fatiga y mejorar la respuesta inmune. Miel: ayuda a calmar la garganta y tiene propiedades  " +
                                                  "\n antimicrobianas. Ajo: contiene alicina, un compuesto con propiedades antimicrobianas que pueden ayudar a combatir " +
                                                  "\n infecciones. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el    " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar más     " +
                                                  "\n de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del      " +
                                                  "\n diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita      " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física moderada, evitando esfuerzos excesivos que     " +
                                                  "\n puedan generar fatiga o afectar la función pulmonar. Se sugiere ejercicios suaves como caminatas cortas o      " +
                                                  "\n juegos tranquilos en casa. HIDRATACIÓN: Debido a la fiebre y la posible deshidratación causada por la tuberculosis, " +
                                                  "\n se recomienda el consumo diario de 2 a 2.5 litros de agua al día (ocho a diez vasos de tamaño regular).             " +
                                                  "\n También es beneficioso el consumo de infusiones de jengibre, que pueden ayudar a reducir la inflamación,            " +
                                                  "\n y caldos ligeros, que aportan electrolitos esenciales. POSIBLE TRATAMIENTO: Para la tuberculosis en niñas,          " +
                                                  "\n el tratamiento suele incluir antibióticos como isoniazida, rifampicina, pirazinamida y etambutol, administrados     " +
                                                  "\n bajo supervisión médica durante un período prolongado. En casos graves, puede requerirse hospitalización con        " +
                                                  "\n tratamiento intravenoso. ALIMENTACIÓN: Se recomienda el consumo de alimentos que fortalezcan el sistema inmune      " +
                                                  "\n y ayuden a la recuperación, tales como Espinacas: contienen hierro (15% del consumo diario recomendado por cada     " +
                                                  "\n 100g) y vitamina A (56% del consumo diario recomendado por cada 100g), esenciales para la regeneración celular.     " +
                                                  "\n Yogur natural: fuente de probióticos que ayudan a restaurar la flora intestinal y fortalecer el sistema inmune.     " +
                                                  "\n Jengibre: con propiedades antiinflamatorias que pueden aliviar la fatiga y mejorar la respuesta inmune. Miel:       " +
                                                  "\n ayuda a calmar la garganta y tiene propiedades antimicrobianas. Ajo: contiene alicina, un compuesto con propiedades " +
                                                  "\n antimicrobianas que pueden ayudar a combatir infecciones. Frutas cítricas (naranjas, limones, toronjas): ricas en   " +
                                                  "\n vitamina C (hasta 89% del consumo diario recomendado por cada 100g), que ayuda a mejorar la respuesta inmunológica. " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga    " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar más de un diagnóstico    " +
                                                  "\n para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface " +
                                                  "\n del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACIÓN: Es fundamental mantener una hidratación adecuada para reducir la inflamación articular y mejorar         " +
                                                  "\n la movilidad. Se recomienda el consumo diario de 1.5 a 2 litros de agua, además de infusiones de cúrcuma y jengibre,  " +
                                                  "\n que poseen propiedades antiinflamatorias naturales. EJERCICIO: La actividad física es clave para mejorar la movilidad   " +
                                                  "\n y reducir la rigidez articular. Se recomienda realizar ejercicios de bajo impacto, como natación, yoga y estiramientos  " +
                                                  "\n suaves, que fortalecen los músculos sin generar presión en las articulaciones. También es beneficioso practicar         " +
                                                  "\n ejercicios de movilidad articular, como rotaciones de muñecas y tobillos, para mejorar la flexibilidad. POSIBLE         " +
                                                  "\n TRATAMIENTO: El tratamiento para la artritis incluye antiinflamatorios no esteroides (AINE) como ibuprofeno y naproxeno," +
                                                  "\n además de terapia física para mejorar la movilidad. En casos más severos, se pueden utilizar medicamentos modificadores " +
                                                  "\n de la enfermedad, como metotrexato. En México, estos medicamentos están disponibles en instituciones de salud como el   " +
                                                  "\n IMSS y el Insabi. ALIMENTACIÓN: También es recomendable el consumo de alimentos que fortalezcan el sistema inmunológico " +
                                                  "\n y ayuden a reducir la inflamación, tales como pescados grasos (salmón, atún), ricos en Omega-3, con propiedades     " +
                                                  "\n antiinflamatorias. Frutas cítricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema     " +
                                                  "\n inmunológico. Verduras de hoja verde (espinacas, acelgas, brócoli), contienen antioxidantes y hierro, esenciales    " +
                                                  "\n para la salud celular. Frutos secos (almendras, nueces), aportan vitamina E, que ayuda a la regeneración celular.   " +
                                                  "\n Yogur natural, fuente de probióticos, que favorecen la salud intestinal y el sistema inmunológico. Este es solo un  " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni " +
                                                  "\n que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida " +
                                                  "\n para establecer mayor seguridad en el tratamiento adecuado del paciente. Además, por su salud, si la respuesta del  " +
                                                  "\n diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L. Montes agradece tu visita a la  " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACIÓN: La hidratación es clave para aliviar la irritación de las vías respiratorias y reducir la acumulación      " +
                                                  "\n de moco. Se recomienda el consumo diario de 1.5 a 2 litros de agua, además de infusiones de miel y limón, que ayudan    " +
                                                  "\n a calmar la tos y mejorar la respiración. EJERCICIO: La actividad física debe ser moderada y enfocada en mejorar la     " +
                                                  "\n capacidad pulmonar. Se recomienda realizar ejercicios de respiración profunda, como respiración diafragmática y con     " +
                                                  "\n labios fruncidos, que ayudan a mejorar la oxigenación. También es beneficioso practicar caminatas suaves, evitando      " +
                                                  "\n ambientes fríos o contaminados. POSIBLE TRATAMIENTO: El tratamiento para la tosferina incluye antibióticos como         " +
                                                  "\n eritromicina y azitromicina, además de terapia respiratoria para mejorar la función pulmonar. En casos graves, se       " +
                                                  "\n puede requerir hospitalización y oxigenoterapia. En México, estos medicamentos están disponibles en instituciones       " +  
                                                  "\n de salud como el IMSS y el Insabi. ALIMENTACIÓN: También es recomendable el consumo de alimentos que fortalezcan el     " +
                                                  "\n sistema inmunológico y ayuden a reducir la inflamación, tales como frutas cítricas (naranjas, limones, toronjas),       " +
                                                  "\n ricas en vitamina C, que fortalece el sistema inmunológico. Verduras de hoja verde (espinacas, acelgas, brócoli),       " +
                                                  "\n contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos (salmón, atún), ricos en Omega-3,   " +
                                                  "\n con propiedades antiinflamatorias. Frutos secos (almendras, nueces), aportan vitamina E, que ayuda a la regeneración    " +
                                                  "\n celular. Yogur natural, fuente de probióticos, que favorecen la salud intestinal y el sistema inmunológico. Este es     " +
                                                  "\n solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad" +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida  " +
                                                  "\n para establecer mayor seguridad en el tratamiento adecuado del paciente. Además, por su salud, si la respuesta del      " +
                                                  "\n diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L. Montes agradece tu visita a la      " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACIÓN: La hidratación es esencial para reducir la inflamación de las glándulas salivales y aliviar el malestar.    " +
                                                  "\n Se recomienda el consumo diario de 1.5 a 2 litros de agua, además de infusiones de manzanilla y jengibre, que poseen     " +
                                                  "\n propiedades antiinflamatorias. EJERCICIO: Durante la enfermedad, se recomienda reposo absoluto para evitar el desgaste   " +
                                                  "\n energético y permitir que el cuerpo se recupere. Una vez que los síntomas comienzan a mejorar, es recomendable realizar  " +
                                                  "\n ejercicios de movilidad suave, como estiramientos ligeros y caminatas cortas, para estimular la circulación y evitar la  " +
                                                  "\n fatiga muscular causada por el reposo prolongado. POSIBLE TRATAMIENTO: No existe un tratamiento específico para las      " +
                                                  "\n paperas, pero se recomienda reposo, analgésicos como ibuprofeno o paracetamol, y compresas frías en la zona inflamada    " +
                                                  "\n para aliviar el dolor. En México, estos medicamentos están disponibles en instituciones de salud como el IMSS y el Insabi." +
                                                  "\n ALIMENTACIÓN: También es recomendable el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir  " +
                                                  "\n la inflamación, tales como frutas cítricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema   " +
                                                  "\n inmunológico. Verduras de hoja verde (espinacas, acelgas, brócoli), contienen antioxidantes y hierro, esenciales para la  " +
                                                  "\n salud celular. Pescados grasos (salmón, atún), ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos          " +
                                                  "\n (almendras, nueces), aportan vitamina E, que ayuda a la regeneración celular. Yogur natural, fuente de probióticos, que   " +
                                                  "\n favorecen la salud intestinal y el sistema inmunológico. Este es solo un diagnóstico predeterminado lógico, haberlo       " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. " +
                                                  "\n Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento  " +
                                                  "\n adecuado del paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda  " +
                                                  "\n consultar a su médico. Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tamaño regular) para                " +
                                                  "\n mantener la hidratación y ayudar a reducir la fiebre y el malestar general, lo que es fundamental en el proceso de               " +
                                                  "\n recuperación. El Zika puede provocar fiebre, dolor muscular, fatiga y sarpullido, lo que puede llevar a una mayor                " +
                                                  "\n pérdida de líquidos. Es importante que el paciente consuma líquidos ricos en electrolitos, como sueros orales, caldos            " +
                                                  "\n y jugos naturales sin azúcar, para evitar la deshidratación y mantener el equilibrio de minerales esenciales. También            " +
                                                  "\n se recomienda el consumo de infusiones suaves, como manzanilla o jengibre, que pueden ayudar a aliviar las molestias             " +
                                                  "\n musculares y mejorar la digestión. EJERCICIO: La actividad física debe ser muy ligera y supervisada, evitando esfuerzos          " +
                                                  "\n excesivos que puedan agravar los síntomas, ejercicios de respiración profunda y movilidad suave pueden ser beneficiosos          " +
                                                  "\n para mejorar la circulación y reducir la fatiga. POSIBLE TRATAMIENTO: No existe un tratamiento específico para el Zika,          " +
                                                  "\n pero los síntomas pueden aliviarse con analgésicos como paracetamol y acetaminofén, en México algunas marcas reconocidas         " +
                                                  "\n incluyen Tempra (paracetamol) y Tylenol (acetaminofén), además se recomienda reposo absoluto, hidratación constante y            " +
                                                  "\n protección contra picaduras de mosquitos para evitar complicaciones. ALIMENTACIÓN: Para fortalecer el sistema inmunológico       " +
                                                  "\n y apoyar la recuperación, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y zinc. Kiwi y naranjas:      " +
                                                  "\n Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa hasta el 100% de la ingesta diaria            " +
                                                  "\n recomendada, fortaleciendo el sistema inmunológico. Jengibre y cúrcuma: Poseen propiedades antiinflamatorias y antioxidantes,    " +
                                                  "\n ayudando a reducir la inflamación y el malestar general. Almendras y semillas de calabaza: Aportan 10-15 mg de zinc por cada     " +
                                                  "\n 100 g, cubriendo hasta el 100% de la recomendación diaria, esencial para la función inmunológica. Este es solo un diagnóstico    " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas       " +
                                                  "\n sean completamente correctas, para mayor seguridad se recomienda realizar más de un diagnóstico y consultar a un médico.         " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tamaño regular)               " +
                                                  "\n para evitar la deshidratación causada por la diarrea y los vómitos, lo que es fundamental en el proceso de                 " +
                                                  "\n recuperación. El rotavirus puede provocar fiebre, vómitos y diarrea intensa, lo que aumenta el riesgo de pérdida           " +
                                                  "\n de líquidos y electrolitos. Es esencial consumir líquidos ricos en electrolitos, como sueros orales y caldos, para         " +
                                                  "\n reponer los minerales perdidos. También se recomienda el consumo de agua con limón o infusiones suaves, que pueden         " +
                                                  "\n ayudar a aliviar las náuseas y mejorar la digestión. EJERCICIO: La actividad física debe ser mínima y de reposo,           " +
                                                  "\n evitando esfuerzos físicos que puedan agravar la fatiga y la deshidratación, se recomienda descanso absoluto hasta         " +
                                                  "\n la recuperación completa. POSIBLE TRATAMIENTO: No existe un tratamiento específico para el rotavirus, pero los             " +
                                                  "\n síntomas pueden aliviarse con rehidratación oral y medicamentos para la fiebre como paracetamol, en México algunas         " +
                                                  "\n marcas reconocidas incluyen Tempra (paracetamol) y Pedialyte (solución de rehidratación oral), además se recomienda        " +
                                                  "\n reposo y una dieta ligera para evitar complicaciones. ALIMENTACIÓN: Para fortalecer el sistema digestivo y apoyar la       " +
                                                  "\n recuperación, se recomienda el consumo de alimentos ricos en probióticos, fibra y minerales esenciales. Yogur y kéfir:     " +
                                                  "\n Contienen probióticos naturales, que ayudan a restaurar la flora intestinal y mejorar la digestión. Plátanos y             " +
                                                  "\n zanahorias: Son fuentes de fibra soluble, que ayuda a regular el tránsito intestinal y reducir la diarrea. Caldo           " +
                                                  "\n de pollo y arroz: Son alimentos suaves y fáciles de digerir, proporcionando electrolitos y energía para la recuperación.   " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta      " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar más de un       " +
                                                  "\n diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeriosis." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tamaño regular)           " +
                                                  "\n para mantener la hidratación y ayudar a reducir la fiebre y los síntomas gastrointestinales, lo que es fundamental     " +
                                                  "\n en el proceso de recuperación. La listeriosis puede provocar fiebre, vómitos, diarrea y fatiga extrema, lo que         " +
                                                  "\n aumenta el riesgo de deshidratación. Es esencial consumir líquidos ricos en electrolitos, como sueros orales y         " +
                                                  "\n caldos, para reponer los minerales perdidos. También se recomienda el consumo de infusiones suaves, como manzanilla    " +
                                                  "\n o jengibre, que pueden ayudar a aliviar las molestias digestivas y mejorar la absorción de nutrientes. EJERCICIO:      " +
                                                  "\n La actividad física debe ser muy ligera y supervisada, evitando esfuerzos excesivos que puedan agravar los síntomas,   " +
                                                  "\n ejercicios de respiración profunda y movilidad suave pueden ser beneficiosos para mejorar la circulación y reducir     " +
                                                  "\n la fatiga. POSIBLE TRATAMIENTO: El tratamiento estándar para la listeriosis en niños incluye antibióticos como         " +
                                                  "\n ampicilina y gentamicina, administrados por vía intravenosa en casos graves, en México algunas marcas reconocidas      " +
                                                  "\n incluyen Amikin (amikacina) y Unasyn (ampicilina/sulbactam), además se recomienda reposo absoluto y una dieta adecuada " +
                                                  "\n para mejorar la recuperación. ALIMENTACIÓN: Para fortalecer el sistema inmunológico y apoyar la recuperación, se       " +
                                                  "\n recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y proteínas. Naranjas y fresas: Contienen        " +
                                                  "\n aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa hasta el 100% de la ingesta diaria recomendada,  " +
                                                  "\n fortaleciendo el sistema inmunológico y ayudando a reducir la inflamación. Espinacas y lentejas: Aportan entre 3.5        " +
                                                  "\n y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25% y 40% de la ingesta diaria recomendada, lo que ayuda a mejorar  " +
                                                  "\n la oxigenación celular y reducir el cansancio. Carnes magras y huevos: Son una fuente importante de proteínas,            " +
                                                  "\n proporcionando entre 20 y 25 g por cada 100 g, lo que equivale al 40-50% de la recomendación diaria, esenciales para      " +
                                                  "\n la regeneración celular y el fortalecimiento muscular. Este es solo un diagnóstico predeterminado lógico, haberlo         " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, " +
                                                  "\n para mayor seguridad se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu     " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACIÓN: La hidratación es esencial para combatir la deshidratación causada por la diarrea intensa, uno          " +
                                                  "\n de los síntomas principales de la shigelosis. Se recomienda el consumo diario de suficiente agua pura, además        " +
                                                  "\n de soluciones de rehidratación oral, para recuperar los minerales esenciales y evitar el desequilibrio electrolítico." +
                                                  "\n EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo absoluto para evitar el desgaste energético  " +
                                                  "\n y permitir que el cuerpo se recupere. Una vez que los síntomas comienzan a mejorar, es recomendable realizar         " +
                                                  "\n ejercicios de movilidad suave, como estiramientos ligeros y caminatas cortas, para estimular la circulación          " +
                                                  "\n y evitar la fatiga muscular causada por el reposo prolongado. POSIBLE TRATAMIENTO: El tratamiento para la shigelosis " +
                                                  "\n incluye antibióticos como ciprofloxacina, azitromicina o ceftriaxona, dependiendo de la gravedad del caso y la       " +
                                                  "\n resistencia bacteriana. También se recomienda el uso de sales de rehidratación oral para prevenir la deshidratación  " +
                                                  "\n severa. En México, estos medicamentos están disponibles en instituciones de salud como el IMSS y el Insabi.          " +
                                                  "\n ALIMENTACIÓN: También es recomendable el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden       " +
                                                  "\n a la recuperación intestinal, tales como plátanos, ricos en potasio, que ayudan a reponer electrolitos. Arroz        " +
                                                  "\n blanco, fuente de carbohidratos de fácil digestión, que contribuyen a la recuperación intestinal. Manzanas, ricas    " +
                                                  "\n en pectina, que ayudan a regular la digestión y reducir la diarrea. Zanahorias, con vitamina A, que favorece la      " +
                                                  "\n regeneración celular. Yogur natural, fuente de probióticos, que favorecen la salud intestinal y el sistema inmunológico. " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta  " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico " +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Además, por su salud, si la   " +
                                                  "\n respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L. Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n HIDRATACIÓN: La hidratación es clave para mantener las vías respiratorias húmedas y facilitar la eliminación de       " +
                                                  "\n secreciones, ya que la acumulación de moco espeso es un síntoma común de la EPOC. Se recomienda el consumo diario     " +
                                                  "\n de agua pura y infusiones calientes, que pueden ayudar a aflojar el moco y mejorar la respiración. EJERCICIO: La      " +
                                                  "\n actividad física es fundamental para mejorar la capacidad pulmonar y reducir la sensación de falta de aire. Se        " +
                                                  "\n recomienda realizar ejercicios de respiración profunda, como la respiración diafragmática y la respiración con        " +
                                                  "\n labios fruncidos, que ayudan a mejorar la oxigenación y reducir la fatiga. También es beneficioso realizar ejercicios " +
                                                  "\n de bajo impacto, como caminatas suaves, yoga y estiramientos, para fortalecer los músculos respiratorios sin generar  " +
                                                  "\n un esfuerzo excesivo. POSIBLE TRATAMIENTO: El tratamiento para la EPOC incluye broncodilatadores como salbutamol,     " +
                                                  "\n corticosteroides inhalados como budesonida o fluticasona, y en algunos casos, oxigenoterapia. También se recomienda   " +
                                                  "\n la rehabilitación pulmonar, que incluye ejercicios de respiración y técnicas para mejorar la capacidad pulmonar.      " +
                                                  "\n En México, estos medicamentos están disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACIÓN:     " +
                                                  "\n También es recomendable el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, " +
                                                  "\n tales como pescados grasos (salmón, atún), ricos en Omega-3, con propiedades antiinflamatorias. Frutas cítricas (naranjas, " +
                                                  "\n limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunológico. Verduras de hoja verde (espinacas, acelgas," +
                                                  "\n brócoli), contienen antioxidantes y hierro, esenciales para la salud celular. Frutos secos (almendras, nueces), aportan  " +
                                                  "\n vitamina E, que ayuda a la regeneración celular. Yogur natural, fuente de probióticos, que favorecen la salud intestinal " +
                                                  "\n y el sistema inmunológico. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que" +
                                                  "\n el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar  " +
                                                  "\n más de un Diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Además, por su " +
                                                  "\n salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L. Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACIÓN: La hidratación es fundamental para aliviar los síntomas urinarios de la clamidia, como el ardor al orinar     " +
                                                  "\n y la necesidad frecuente de hacerlo. Se recomienda el consumo diario de agua pura, además de jugos naturales sin azúcar,   " +
                                                  "\n como el jugo de arándano, que puede ayudar a prevenir infecciones urinarias secundarias. EJERCICIO: La actividad física    " +
                                                  "\n debe ser moderada y adaptada a la condición del paciente. Se recomienda realizar ejercicios de movilidad y estiramientos,  " +
                                                  "\n que ayudan a mejorar la circulación y reducir la fatiga. También es beneficioso practicar ejercicios de fortalecimiento    " +
                                                  "\n muscular, como pilates o yoga, para mejorar la resistencia del cuerpo y favorecer la recuperación. POSIBLE TRATAMIENTO:    " +
                                                  "\n El tratamiento para la clamidia incluye antibióticos como azitromicina, doxiciclina o levofloxacina, dependiendo de la     " +
                                                  "\n gravedad del caso. También se recomienda que la pareja del paciente reciba tratamiento para evitar reinfecciones. En México,  " +
                                                  "\n estos medicamentos están disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACIÓN: También es recomendable" +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como frutas cítricas " +
                                                  "\n (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunológico. Verduras de hoja verde (espinacas, " +
                                                  "\n acelgas, brócoli), contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos (salmón, atún),    " +
                                                  "\n ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos (almendras, nueces), aportan vitamina E, que ayuda a    " +
                                                  "\n la regeneración celular. Yogur natural, fuente de probióticos, que favorecen la salud intestinal y el sistema inmunológico." +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta    " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico   " +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Además, por su salud, si la respuesta" +
                                                  "\n del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L. Montes agradece tu visita a la " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tamaño regular)     " +
                                                  "\n para mantener la hidratación y ayudar a reducir la fiebre y los síntomas neurológicos, lo que es fundamental     " +
                                                  "\n en el proceso de recuperación. La meningitis bacteriana puede provocar fiebre alta, vómitos, rigidez en el       " +
                                                  "\n cuello y sensibilidad a la luz, lo que puede llevar a una mayor pérdida de líquidos. Es importante que el        " +
                                                  "\n paciente consuma líquidos ricos en electrolitos, como sueros orales, caldos y jugos naturales sin azúcar,        " +
                                                  "\n para evitar la deshidratación y mantener el equilibrio de minerales esenciales. También se recomienda el         " +
                                                  "\n consumo de infusiones suaves, como manzanilla o jengibre, que pueden ayudar a aliviar las náuseas y mejorar      " +
                                                  "\n la digestión. EJERCICIO: La actividad física debe ser muy ligera y supervisada, evitando esfuerzos excesivos     " +
                                                  "\n que puedan agravar los síntomas, ejercicios de respiración profunda y movilidad suave pueden ser beneficiosos    " +
                                                  "\n para mejorar la capacidad pulmonar y la circulación. POSIBLE TRATAMIENTO: El tratamiento estándar para la        " +
                                                  "\n meningitis bacteriana en niños incluye antibióticos como ceftriaxona, ampicilina y vancomicina, administrados    " +
                                                  "\n por vía intravenosa durante 7 a 14 días, en México algunas marcas reconocidas incluyen Rocephin (ceftriaxona)    " +
                                                  "\n y Amikin (amikacina), además se recomienda el uso de corticosteroides como dexametasona para reducir la inflamación " +
                                                  "\n cerebral en casos graves. ALIMENTACIÓN: Para fortalecer el sistema inmunológico y apoyar la recuperación, se     " +
                                                  "\n recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y proteínas. Naranjas y fresas: Contienen  " +
                                                  "\n aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa hasta el 100% de la ingesta diaria      " +
                                                  "\n recomendada, fortaleciendo el sistema inmunológico y ayudando a reducir la inflamación. Espinacas y lentejas:      " +
                                                  "\n Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25% y 40% de la ingesta diaria recomendada," +
                                                  "\n lo que ayuda a mejorar la oxigenación celular y reducir el cansancio. Carnes magras y huevos: Son una fuente         " +
                                                  "\n importante de proteínas, proporcionando entre 20 y 25 g por cada 100 g, lo que equivale al 40-50% de la recomendación" +
                                                  "\n diaria, esenciales para la regeneración celular y el fortalecimiento muscular. Este es solo un diagnóstico    " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que   " +
                                                  "\n las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar más de un diagnóstico" +
                                                  "\n y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 1.5 a 2.5 litros de agua (seis a diez vasos de tamaño regular) para       " +
                                                  "\n mantener la hidratación y ayudar a reducir los efectos secundarios del tratamiento, lo que es fundamental en el proceso   " +
                                                  "\n de recuperación. Los niños con cáncer pueden experimentar vómitos, diarrea y sudoración excesiva, lo que aumenta el       " +
                                                  "\n riesgo de deshidratación. Es esencial consumir líquidos ricos en electrolitos, como sueros orales y caldos, para reponer  " +
                                                  "\n los minerales perdidos. También se recomienda el consumo de agua con limón o infusiones suaves, que pueden ayudar a       " +
                                                  "\n aliviar las náuseas y mejorar la digestión. EJERCICIO: La actividad física debe ser moderada y adaptada, evitando         " +
                                                  "\n esfuerzos excesivos que puedan debilitar el sistema inmunológico, ejercicios como yoga, caminatas suaves y natación       " +
                                                  "\n pueden ser beneficiosos para mejorar la resistencia y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento para el      " +
                                                  "\n cáncer en niños depende del tipo específico de cáncer, pero puede incluir quimioterapia, radioterapia y cirugía, en       " +
                                                  "\n México algunas marcas reconocidas incluyen Methotrexate (metotrexato) y Vincristine (vincristina), además se recomienda   " +
                                                  "\n el uso de terapias complementarias como apoyo nutricional y psicológico para mejorar la calidad de vida del paciente.     " +
                                                  "\n ALIMENTACIÓN: Para fortalecer el sistema inmunológico y apoyar la recuperación, se recomienda el consumo de alimentos     " +
                                                  "\n ricos en antioxidantes, proteínas y ácidos grasos esenciales. Brócoli y zanahorias: Contienen aproximadamente 50-80 mg    " +
                                                  "\n de vitamina C por cada 100 g, lo que representa hasta el 90% de la ingesta diaria recomendada, fortaleciendo el sistema   " +
                                                  "\n inmunológico. Salmón y chía: Son fuentes de omega-3, proporcionando entre 2-4 g por cada 100 g, lo que ayuda a reducir    " +
                                                  "\n la inflamación y mejorar la función celular. Frutas y verduras de colores vivos: Como arándanos y espinacas, que son      " +
                                                  "\n ricas en antioxidantes y ayudan a proteger las células del daño. Este es solo un diagnóstico predeterminado lógico,       " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente    " +
                                                  "\n correctas, para mayor seguridad se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes      " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        
                        if(EstaturaFemenino.equals("1.40-1.65 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física moderada a intensa diariamente, con una duración           " +
                                                  "\n aproximada de 60 minutos, aunque esta cantidad puede ajustarse según su edad y condición. HIDRATACIÓN: Es fundamental      " +
                                                  "\n el consumo diario de 1.7 litros de agua (siete vasos de tamaño regular) para mantener una hidratación adecuada y ayudar    " +
                                                  "\n al cuerpo a combatir la enfermedad. POSIBLE TRATAMIENTO: Para la gripe en niños, el tratamiento suele incluir medicamentos " +
                                                  "\n para reducir la fiebre y aliviar los síntomas, como el paracetamol (Tempra) o el ibuprofeno. En casos específicos, se      " +
                                                  "\n pueden utilizar antivirales como el oseltamivir (Tamiflu). ALIMENTACIÓN: Es recomendable el consumo de frutas y verduras   " +
                                                  "\n que fortalezcan el sistema inmune, tales como: Naranjas, ricas en vitamina C (aportan aproximadamente el 89% del       " +
                                                  "\n requerimiento diario por cada 100 g), que ayuda a fortalecer el sistema inmunológico y reducir la duración de los      " +
                                                  "\n síntomas. Fresas, con antioxidantes y vitamina C (aportan cerca del 98% del requerimiento diario por cada 100 g),      " +
                                                  "\n esenciales para la protección celular y la recuperación del organismo. Plátanos, ricos en potasio (aportan alrededor   " +
                                                  "\n del 10% del requerimiento diario por cada 100 g), que ayuda a reemplazar los electrolitos perdidos por fiebre y        " +
                                                  "\n sudoración. Kiwi, con vitamina C (aproximadamente el 93% del requerimiento diario por cada 100 g) y potasio, que       " +
                                                  "\n contribuyen a la función inmunológica y la recuperación del cuerpo. Este es solo un diagnóstico predeterminado lógico. " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas.    " +
                                                  "\n Para mayor seguridad en el tratamiento adecuado, se recomienda realizar más de un diagnóstico y consultar a un médico. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física de baja intensidad, evitando esfuerzos           " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperación. HIDRATACIÓN: Es fundamental el consumo         " +
                                                  "\n diario de 1.5 a 2 litros de agua (seis a ocho vasos de tamaño regular) para mantener una hidratación óptima      " +
                                                  "\n y ayudar a fluidificar las secreciones pulmonares. POSIBLE TRATAMIENTO: Para la neumonía en niños, el            " +
                                                  "\n tratamiento suele incluir antibióticos como la amoxicilina o azitromicina en caso de infecciones bacterianas,    " +
                                                  "\n además de medicamentos para reducir la fiebre y aliviar los síntomas, como el paracetamol. En casos graves,      " +
                                                  "\n puede requerirse hospitalización y oxigenoterapia. ALIMENTACIÓN: Es recomendable el consumo de alimentos que     " +
                                                  "\n fortalezcan el sistema inmune y ayuden a la recuperación, tales como: Naranjas, ricas en vitamina C (aportan     " +
                                                  "\n aproximadamente el 89% del requerimiento diario por cada 100 g), que ayuda a fortalecer el sistema inmunológico  " +
                                                  "\n y reducir la duración de los síntomas. Espinacas, con hierro (aproximadamente el 15% del requerimiento diario    " +
                                                  "\n por cada 100 g), que contribuye a la producción de glóbulos rojos y mejora la oxigenación del cuerpo. Yogur,     " +
                                                  "\n con probióticos que favorecen la salud intestinal y fortalecen el sistema inmune. Este es solo un diagnóstico    " +
                                                  "\n predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las  " +
                                                  "\n respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar más de un     " +
                                                  "\n diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física moderada diariamente, con una duración aproximada       " +
                                                  "\n de 60 minutos, incluyendo ejercicios aeróbicos como caminar, correr o nadar, para mejorar la sensibilidad a la          " +
                                                  "\n insulina. HIDRATACIÓN: Es fundamental el consumo diario de 1.7 a 2 litros de agua (siete a ocho vasos de tamaño         " +
                                                  "\n regular) para ayudar a mantener niveles adecuados de glucosa en sangre y prevenir la deshidratación. POSIBLE            " +
                                                  "\n TRATAMIENTO: Para la diabetes en niños, el tratamiento suele incluir insulina en el caso de diabetes tipo 1,            " +
                                                  "\n mientras que en diabetes tipo 2 puede requerirse metformina y cambios en el estilo de vida. Es esencial el monitoreo    " +
                                                  "\n constante de la glucosa en sangre y el seguimiento médico. ALIMENTACIÓN: Es recomendable el consumo de alimentos que    " +
                                                  "\n ayuden a regular los niveles de glucosa y fortalezcan el organismo, tales como: Avena, rica en fibra soluble            " +
                                                  "\n (aproximadamente el 10% del requerimiento diario por cada 100 g), que ayuda a estabilizar los niveles de azúcar en      " +
                                                  "\n sangre. Frutos secos, con grasas saludables y magnesio (aproximadamente el 15% del requerimiento diario por cada        " +
                                                  "\n 100 g), que contribuyen a la regulación de la glucosa. Legumbres, con proteínas vegetales y fibra (aproximadamente      " +
                                                  "\n el 20% del requerimiento diario por cada 100 g), que favorecen la saciedad y el control de la glucosa. Este es solo     " +
                                                  "\n un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad     " +
                                                  "\n ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar más de    " +
                                                  "\n un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n En niñas pequeñas, el asma puede causar dificultad para respirar, tos persistente, sibilancias y fatiga, afectando     " +
                                                  "\n su bienestar y calidad de vida. EJERCICIO: Se recomienda actividad física moderada, como caminatas suaves, juegos      " +
                                                  "\n tranquilos y ejercicios de respiración para mejorar la oxigenación. También es importante evitar esfuerzos físicos     " +
                                                  "\n que puedan generar fatiga o dificultar la respiración. HIDRATACIÓN: Es esencial el consumo diario de 1.5 a 2 litros    " +
                                                  "\n de agua para mantener el cuerpo hidratado y ayudar a reducir la inflamación de las vías respiratorias. Además del      " +
                                                  "\n agua pura, se recomienda el consumo de infusiones suaves, jugos naturales sin azúcar y caldos ligeros, que pueden      " +
                                                  "\n aportar líquidos y nutrientes esenciales. También es recomendable el consumo de bebidas con electrolitos naturales,    " +
                                                  "\n como agua de coco, para ayudar a reponer los minerales perdidos por la fiebre y sudoración. POSIBLE TRATAMIENTO: El    " +
                                                  "\n asma se trata con broncodilatadores, como salbutamol, para aliviar los episodios agudos, y corticosteroides inhalados, " +
                                                  "\n como budesonida, para reducir la inflamación de las vías respiratorias. También se recomienda el uso de antihistamínicos " +
                                                  "\n en casos de alergias asociadas y terapia respiratoria, que incluye ejercicios específicos para mejorar la capacidad      " +
                                                  "\n pulmonar. En casos más severos, se puede requerir oxígeno suplementario y rehabilitación pulmonar para mejorar la        " +
                                                  "\n función respiratoria. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema respiratorio" +
                                                  "\n y reducir la inflamación, tales como pescados grasos (salmón, atún), ricos en ácidos grasos Omega-3, que poseen        " +
                                                  "\n propiedades antiinflamatorias. frutas y verduras de colores vivos (arándanos, fresas, espinacas, brócoli), ricas       " +
                                                  "\n en antioxidantes como la vitamina C y carotenoides, que pueden proteger las células del daño y fortalecer el sistema   " +
                                                  "\n inmunológico. jengibre, que contiene compuestos con efectos antiinflamatorios que podrían ser beneficiosos para las    " +
                                                  "\n vías respiratorias. cúrcuma, con su componente activo, la curcumina, que tiene potentes propiedades antiinflamatorias  " +
                                                  "\n y antioxidantes. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la     " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar   " +
                                                  "\n más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n En niñas pequeñas, el VIH puede afectar el sistema inmunológico y requerir un tratamiento especializado      " +
                                                  "\n para evitar complicaciones graves. EJERCICIO: Se recomienda actividad física moderada, adaptada a la         " +
                                                  "\n capacidad de la niña, como juegos tranquilos, caminatas suaves y ejercicios de movilidad para mejorar        " +
                                                  "\n la circulación y reducir la fatiga. También es recomendable realizar ejercicios de respiración y relajación  " +
                                                  "\n para mejorar la oxigenación y reducir el estrés. HIDRATACIÓN: Es esencial el consumo diario de 2 a 2.5       " +
                                                  "\n litros de agua para mantener el cuerpo hidratado y ayudar a reducir los efectos secundarios del tratamiento. " +
                                                  "\n Además del agua pura, se recomienda el consumo de jugos naturales ricos en antioxidantes, como jugo de       " +
                                                  "\n naranja o toronja, que pueden fortalecer el sistema inmunológico. También es beneficioso ingerir caldos      " +
                                                  "\n ligeros, que aportan líquidos y minerales esenciales para la recuperación. POSIBLE TRATAMIENTO: El VIH       " +
                                                  "\n en niñas se trata con terapia antirretroviral (TAR), que incluye medicamentos como lamivudina, abacavir      " +
                                                  "\n y lopinavir, para reducir la carga viral y fortalecer el sistema inmunológico. También se recomienda un      " +
                                                  "\n plan de alimentación saludable, monitoreo constante de los niveles de CD4 y seguimiento médico especializado." +
                                                  "\n En algunos casos, se pueden utilizar medicamentos para tratar infecciones oportunistas, como antibióticos    " +
                                                  "\n y antifúngicos, para prevenir complicaciones. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden " +
                                                  "\n a fortalecer el sistema inmunológico y reducir la inflamación, tales como arándanos, ricos en antioxidantes  " +
                                                  "\n y vitamina C. espinacas, que contienen hierro y vitamina A, esenciales para la recuperación. jengibre, con   " +
                                                  "\n propiedades antiinflamatorias y antioxidantes. cúrcuma, con curcumina, que tiene propiedades antiinflamatorias " +
                                                  "\n y antioxidantes. yogur natural, que contiene probióticos beneficiosos para la flora intestinal. Este es solo   " +
                                                  "\n un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta       " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un     " +
                                                  "\n diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n En niñas pequeñas, la gonorrea puede causar síntomas como secreción anormal, dolor al orinar y fiebre,         " +
                                                  "\n y requiere tratamiento inmediato para evitar complicaciones. EJERCICIO: Se recomienda actividad física         " +
                                                  "\n moderada, como caminatas suaves y ejercicios de movilidad para mejorar la circulación y reducir la fatiga.     " +
                                                  "\n También es recomendable realizar ejercicios de relajación y respiración para reducir el estrés, ya que este    " +
                                                  "\n puede afectar la respuesta inmunológica y prolongar la infección. HIDRATACIÓN: Es esencial el consumo diario   " +
                                                  "\n de 2.5 a 2.75 litros de agua para mantener el cuerpo hidratado y ayudar a reducir la inflamación. Además del   " +
                                                  "\n agua pura, se recomienda el consumo de jugos naturales ricos en vitamina C, como jugo de naranja o toronja,    " +
                                                  "\n que pueden fortalecer el sistema inmunológico. También es beneficioso ingerir caldos ligeros, que aportan      " +
                                                  "\n líquidos y minerales esenciales para la recuperación. POSIBLE TRATAMIENTO: La gonorrea se trata con            " +
                                                  "\n antibióticos, como ceftriaxona o azitromicina, administrados en una sola dosis o en un régimen de varios días. " +
                                                  "\n En casos más severos, se puede requerir tratamiento prolongado con antibióticos adicionales, dependiendo de la " +
                                                  "\n resistencia bacteriana. También se recomienda el uso de probióticos para restaurar la flora intestinal y       " +
                                                  "\n mejorar la recuperación. En algunos casos, se pueden utilizar medicamentos para aliviar el dolor y la          " +
                                                  "\n inflamación, como ibuprofeno, para reducir los síntomas. ALIMENTACIÓN: Se recomienda el consumo de alimentos   " +
                                                  "\n que ayuden a fortalecer el sistema inmunológico y reducir la inflamación, tales como arándanos, ricos en       " +
                                                  "\n antioxidantes y vitamina C. espinacas, que contienen hierro y vitamina A, esenciales para la recuperación.     " +
                                                  "\n Jengibre, con propiedades antiinflamatorias y antioxidantes. cúrcuma, con curcumina, que tiene propiedades     " +
                                                  "\n antiinflamatorias y antioxidantes. yogur natural, que contiene probióticos beneficiosos para la flora intestinal. " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga  " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un  " +
                                                  "\n diagnóstico y consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita  " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes Genital." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física moderada, evitando esfuerzos excesivos que puedan       " +
                                                  "\n generar fatiga o estrés, ya que el herpes puede activarse en situaciones de debilitamiento del sistema inmunológico.    " +
                                                  "\n Se sugiere ejercicios suaves como caminatas cortas o juegos tranquilos en casa. HIDRATACIÓN: Se recomienda el consumo   " +
                                                  "\n diario de 1.5 a 2 litros de agua al día (seis a ocho vasos de tamaño regular) para mantener una adecuada hidratación    " +
                                                  "\n y ayudar a la recuperación. También es beneficioso el consumo de infusiones de manzanilla, que pueden ayudar a reducir  " +
                                                  "\n la inflamación, y agua con limón, rica en vitamina C, que fortalece el sistema inmune. POSIBLE TRATAMIENTO: Para el     " +
                                                  "\n herpes genital en niñas, el tratamiento suele incluir antivirales como aciclovir, valaciclovir o famciclovir,           " +
                                                  "\n administrados bajo supervisión médica para reducir la duración y severidad de los brotes. También se recomienda         " +
                                                  "\n el uso de cremas tópicas para aliviar el dolor y la irritación. ALIMENTACIÓN: Se recomienda el consumo de alimentos     " +
                                                  "\n que fortalezcan el sistema inmune y ayuden a la recuperación, tales como Yogur natural: fuente de probióticos que       " +
                                                  "\n ayudan a fortalecer el sistema inmune y mejorar la salud intestinal. Ajo: contiene alicina, un compuesto con propiedades" +
                                                  "\n antimicrobianas que pueden ayudar a combatir infecciones. Jengibre: con propiedades antiinflamatorias que pueden aliviar" +
                                                  "\n la fatiga y mejorar la respuesta inmune. Frutas cítricas (naranjas, limones, toronjas): ricas en vitamina C (hasta 89%  " +
                                                  "\n del consumo diario recomendado por cada 100g), que ayuda a mejorar la respuesta inmunológica. Miel: ayuda a calmar la   " +
                                                  "\n garganta y tiene propiedades antimicrobianas. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no  " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda " +
                                                  "\n realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del " +
                                                  "\n diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app  " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física moderada, evitando esfuerzos excesivos que puedan    " +
                                                  "\n generar fatiga. Se sugiere ejercicios suaves como caminatas cortas o juegos tranquilos en casa. HIDRATACIÓN: Se      " +
                                                  "\n recomienda el consumo diario de 1.5 a 2 litros de agua al día (seis a ocho vasos de tamaño regular) para mantener    " +
                                                  "\n una adecuada hidratación y ayudar a la recuperación. También es beneficioso el consumo de infusiones de jengibre,    " +
                                                  "\n que pueden ayudar a reducir la inflamación, y agua con limón, rica en vitamina C, que fortalece el sistema inmune.   " +
                                                  "\n POSIBLE TRATAMIENTO: Para la sífilis en niñas, el tratamiento suele incluir penicilina como primera línea de defensa,   " +
                                                  "\n administrada bajo supervisión médica. En casos de alergia a la penicilina, pueden utilizarse otros antibióticos como    " +
                                                  "\n doxiciclina o azitromicina. ALIMENTACIÓN: Se recomienda el consumo de alimentos que fortalezcan el sistema inmune y     " +
                                                  "\n ayuden a la recuperación, tales como Espinacas: contienen hierro (15% del consumo diario recomendado por cada 100g)     " +
                                                  "\n y vitamina A (56% del consumo diario recomendado por cada 100g), esenciales para la regeneración celular. Yogur natural:   " +
                                                  "\n fuente de probióticos que ayudan a restaurar la flora intestinal y fortalecer el sistema inmune. Jengibre: con propiedades " +
                                                  "\n antiinflamatorias que pueden aliviar la fatiga y mejorar la respuesta inmune. Miel: ayuda a calmar la garganta y tiene   " +
                                                  "\n propiedades antimicrobianas. Ajo: contiene alicina, un compuesto con propiedades antimicrobianas que pueden ayudar a     " +
                                                  "\n combatir infecciones. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el  " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar más de un      " +
                                                  "\n diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no    " +
                                                  "\n le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera" +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física moderada, evitando esfuerzos excesivos que puedan        " +
                                                  "\n generar fatiga o afectar la función pulmonar. Se sugiere ejercicios suaves como caminatas cortas o juegos tranquilos     " +
                                                  "\n en casa. HIDRATACIÓN: Debido a la fiebre y la posible deshidratación causada por la tuberculosis, se recomienda el       " +
                                                  "\n consumo diario de 2 a 2.5 litros de agua al día (ocho a diez vasos de tamaño regular). También es beneficioso el         " +
                                                  "\n consumo de infusiones de jengibre, que pueden ayudar a reducir la inflamación, y caldos ligeros, que aportan             " +
                                                  "\n electrolitos esenciales. POSIBLE TRATAMIENTO: Para la tuberculosis en niñas, el tratamiento suele incluir antibióticos   " +
                                                  "\n como isoniazida, rifampicina, pirazinamida y etambutol, administrados bajo supervisión médica durante un período         " +
                                                  "\n prolongado. En casos graves, puede requerirse hospitalización con tratamiento intravenoso. ALIMENTACIÓN: Se recomienda   " +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmune y ayuden a la recuperación, tales como Espinacas: contienen    " +
                                                  "\n hierro (15% del consumo diario recomendado por cada 100g) y vitamina A (56% del consumo diario recomendado por           " +
                                                  "\n cada 100g), esenciales para la regeneración celular. Yogur natural: fuente de probióticos que ayudan a restaurar         " +
                                                  "\n la flora intestinal y fortalecer el sistema inmune. Jengibre: con propiedades antiinflamatorias que pueden aliviar       " +
                                                  "\n la fatiga y mejorar la respuesta inmune. Miel: ayuda a calmar la garganta y tiene propiedades antimicrobianas. Ajo:      " +
                                                  "\n contiene alicina, un compuesto con propiedades antimicrobianas que pueden ayudar a combatir infecciones. Frutas cítricas " +
                                                  "\n (naranjas, limones, toronjas): ricas en vitamina C (hasta 89% del consumo diario recomendado por cada 100g), que ayuda a " +
                                                  "\n mejorar la respuesta inmunológica. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar más" +
                                                  "\n de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico " +
                                                  "\n no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera" +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACIÓN: Es fundamental mantener una hidratación adecuada para reducir la inflamación articular y mejorar           " +
                                                  "\n la movilidad. Se recomienda el consumo diario de 1.5 a 2 litros de agua, además de infusiones de cúrcuma y jengibre,    " +
                                                  "\n que poseen propiedades antiinflamatorias naturales. La artritis idiopática juvenil es la forma más común de artritis    " +
                                                  "\n en niños y puede afectar la movilidad y calidad de vida si no se trata adecuadamente. EJERCICIO: La actividad física    " +
                                                  "\n es clave para mejorar la movilidad y reducir la rigidez articular. Se recomienda realizar ejercicios de bajo impacto,   " +
                                                  "\n como natación, yoga y estiramientos suaves, que fortalecen los músculos sin generar presión en las articulaciones.      " +
                                                  "\n También es beneficioso practicar ejercicios de movilidad articular, como rotaciones de muñecas y tobillos, para mejorar " +
                                                  "\n la flexibilidad. La terapia física es esencial para evitar la pérdida de movilidad y fortalecer los músculos que rodean " +
                                                  "\n las articulaciones afectadas. POSIBLE TRATAMIENTO: El tratamiento para la artritis incluye antiinflamatorios no         " +
                                                  "\n esteroides (AINE) como ibuprofeno y naproxeno, además de terapia física para mejorar la movilidad. En casos más severos," +
                                                  "\n se pueden utilizar medicamentos modificadores de la enfermedad, como metotrexato. En México, estos medicamentos están   " +
                                                  "\n disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACIÓN: También es recomendable el consumo de     " +
                                                  "\n alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como pescados grasos (salmón," +
                                                  "\n atún), ricos en Omega-3, con propiedades antiinflamatorias. Frutas cítricas (naranjas, limones, toronjas), ricas en     " +
                                                  "\n vitamina C, que fortalece el sistema inmunológico. Verduras de hoja verde (espinacas, acelgas, brócoli), contienen         " +
                                                  "\n antioxidantes y hierro, esenciales para la salud celular. Frutos secos (almendras, nueces), aportan vitamina E, que ayuda  " +
                                                  "\n a la regeneración celular. Yogur natural, fuente de probióticos, que favorecen la salud intestinal y el sistema inmunológico." +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta      " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico     " +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Además, por su salud, si la respuesta  " +
                                                  "\n del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L. Montes agradece tu visita a la     " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACIÓN: La hidratación es clave para aliviar la irritación de las vías respiratorias y reducir la acumulación    " +
                                                  "\n de moco. Se recomienda el consumo diario de 1.5 a 2 litros de agua, además de infusiones de miel y limón, que ayudan  " +
                                                  "\n a calmar la tos y mejorar la respiración. La tosferina es una infección respiratoria altamente contagiosa causada por " +
                                                  "\n la bacteria Bordetella pertussis, que puede provocar ataques de tos severos y dificultad para respirar. EJERCICIO:    " +
                                                  "\n La actividad física debe ser moderada y enfocada en mejorar la capacidad pulmonar. Se recomienda realizar ejercicios  " +
                                                  "\n de respiración profunda, como respiración diafragmática y con labios fruncidos, que ayudan a mejorar la oxigenación.  " +
                                                  "\n También es beneficioso practicar caminatas suaves, evitando ambientes fríos o contaminados. En casos graves, los niños" +
                                                  "\n pueden requerir hospitalización para recibir oxígeno suplementario. POSIBLE TRATAMIENTO: El tratamiento para la       " +
                                                  "\n tosferina incluye antibióticos como eritromicina y azitromicina, además de terapia respiratoria para mejorar la       " +
                                                  "\n función pulmonar. En casos graves, se puede requerir hospitalización y oxigenoterapia. En México, estos medicamentos  " +
                                                  "\n están disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACIÓN: También es recomendable el consumo" +
                                                  "\n de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como frutas cítricas    " +
                                                  "\n (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunológico. Verduras de hoja verde     " +
                                                  "\n (espinacas, acelgas, brócoli), contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos    " +
                                                  "\n (salmón, atún), ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos (almendras, nueces), aportan        " +
                                                  "\n vitamina E, que ayuda a la regeneración celular. Yogur natural, fuente de probióticos, que favorecen la salud intestinal " +
                                                  "\n y el sistema inmunológico. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda    " +
                                                  "\n realizar más de un Diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente.    " +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.  " +
                                                  "\n Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACIÓN: La hidratación es esencial para reducir la inflamación de las glándulas salivales y aliviar el      " +
                                                  "\n malestar. Se recomienda el consumo diario de 1.5 a 2 litros de agua, además de infusiones de manzanilla y        " +
                                                  "\n jengibre, que poseen propiedades antiinflamatorias. La papera es una infección viral que afecta principalmente   " +
                                                  "\n a las glándulas salivales y puede causar fiebre, dolor muscular y dificultad para tragar. EJERCICIO: Durante     " +
                                                  "\n la enfermedad, se recomienda reposo absoluto para evitar el desgaste energético y permitir que el cuerpo se      " +
                                                  "\n recupere. Una vez que los síntomas comienzan a mejorar, es recomendable realizar ejercicios de movilidad suave,  " +
                                                  "\n como estiramientos ligeros y caminatas cortas, para estimular la circulación y evitar la fatiga muscular causada " +
                                                  "\n por el reposo prolongado. POSIBLE TRATAMIENTO: No existe un tratamiento específico para las paperas, pero se     " +
                                                  "\n recomienda reposo, analgésicos como ibuprofeno o paracetamol, y compresas frías en la zona inflamada para aliviar    " +
                                                  "\n el dolor. En México, estos medicamentos están disponibles en instituciones de salud como el IMSS y el Insabi.        " +
                                                  "\n ALIMENTACIÓN: También es recomendable el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a     " +
                                                  "\n reducir la inflamación, tales como frutas cítricas (naranjas, limones, toronjas), ricas en vitamina C, que           " +
                                                  "\n fortalece el sistema inmunológico. Verduras de hoja verde (espinacas, acelgas, brócoli), contienen antioxidantes     " +
                                                  "\n y hierro, esenciales para la salud celular. Pescados grasos (salmón, atún), ricos en Omega-3, con propiedades        " +
                                                  "\n antiinflamatorias. Frutos secos (almendras, nueces), aportan vitamina E, que ayuda a la regeneración celular.        " +
                                                  "\n Yogur natural, fuente de probióticos, que favorecen la salud intestinal y el sistema inmunológico. Este es solo      " +
                                                  "\n un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad  " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de       " +
                                                  "\n Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Además, por su salud, si la         " +
                                                  "\n respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L. Montes agradece    " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tamaño regular)      " +
                                                  "\n para mantener la hidratación y ayudar a reducir la fiebre y el malestar general, lo que es fundamental en el      " +
                                                  "\n proceso de recuperación. El Zika puede provocar fiebre, dolor muscular, fatiga y sarpullido, lo que puede         " +
                                                  "\n llevar a una mayor pérdida de líquidos. Es importante que el paciente consuma líquidos ricos en electrolitos,     " +
                                                  "\n como sueros orales, caldos y jugos naturales sin azúcar, para evitar la deshidratación y mantener el equilibrio   " +
                                                  "\n de minerales esenciales. También se recomienda el consumo de infusiones suaves, como manzanilla o jengibre, que   " +
                                                  "\n pueden ayudar a aliviar las molestias musculares y mejorar la digestión. EJERCICIO: La actividad física debe      " +
                                                  "\n ser muy ligera y supervisada, evitando esfuerzos excesivos que puedan agravar los síntomas, ejercicios de         " +
                                                  "\n respiración profunda y movilidad suave pueden ser beneficiosos para mejorar la circulación y reducir la fatiga.   " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento específico para el Zika, pero los síntomas pueden aliviarse con     " +
                                                  "\n analgésicos como paracetamol y acetaminofén, en México algunas marcas reconocidas incluyen Tempra (paracetamol)   " +
                                                  "\n y Tylenol (acetaminofén), además se recomienda reposo absoluto, hidratación constante y protección contra picaduras " +
                                                  "\n de mosquitos para evitar complicaciones. ALIMENTACIÓN: Para fortalecer el sistema inmunológico y apoyar la          " +
                                                  "\n recuperación, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y zinc. Kiwi y naranjas:     " +
                                                  "\n Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa hasta el 100% de la ingesta      " +
                                                  "\n diaria recomendada, fortaleciendo el sistema inmunológico. Jengibre y cúrcuma: Poseen propiedades antiinflamatorias " +
                                                  "\n y antioxidantes, ayudando a reducir la inflamación y el malestar general. Almendras y semillas de calabaza: Aportan " +
                                                  "\n 10-15 mg de zinc por cada 100 g, cubriendo hasta el 100% de la recomendación diaria, esencial para la función    " +
                                                  "\n inmunológica. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el  " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se       " +
                                                  "\n recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app    " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tamaño regular)        " +
                                                  "\n para evitar la deshidratación causada por la diarrea y los vómitos, lo que es fundamental en el proceso de          " +
                                                  "\n recuperación. El rotavirus puede provocar fiebre, vómitos y diarrea intensa, lo que aumenta el riesgo de pérdida    " +
                                                  "\n de líquidos y electrolitos. Es esencial consumir líquidos ricos en electrolitos, como sueros orales y caldos,       " +
                                                  "\n para reponer los minerales perdidos. También se recomienda el consumo de agua con limón o infusiones suaves, que    " +
                                                  "\n pueden ayudar a aliviar las náuseas y mejorar la digestión. EJERCICIO: La actividad física debe ser mínima y de     " +
                                                  "\n reposo, evitando esfuerzos físicos que puedan agravar la fatiga y la deshidratación, se recomienda descanso         " +
                                                  "\n absoluto hasta la recuperación completa. POSIBLE TRATAMIENTO: No existe un tratamiento específico para el rotavirus,  " +
                                                  "\n pero los síntomas pueden aliviarse con rehidratación oral y medicamentos para la fiebre como paracetamol, en México   " +
                                                  "\n algunas marcas reconocidas incluyen Tempra (paracetamol) y Pedialyte (solución de rehidratación oral), además se      " +
                                                  "\n recomienda reposo y una dieta ligera para evitar complicaciones. ALIMENTACIÓN: Para fortalecer el sistema digestivo   " +
                                                  "\n y apoyar la recuperación, se recomienda el consumo de alimentos ricos en probióticos, fibra y minerales esenciales.   " +
                                                  "\n Yogur y kéfir: Contienen probióticos naturales, que ayudan a restaurar la flora intestinal y mejorar la digestión.    " +
                                                  "\n Plátanos y zanahorias: Son fuentes de fibra soluble, que ayuda a regular el tránsito intestinal y reducir la diarrea. " +
                                                  "\n Caldo de pollo y arroz: Son alimentos suaves y fáciles de digerir, proporcionando electrolitos y energía para la      " +
                                                  "\n recuperación. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar    " +
                                                  "\n más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeriosis." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tamaño regular)        " +
                                                  "\n para mantener la hidratación y ayudar a reducir la fiebre y los síntomas gastrointestinales, lo que es              " +
                                                  "\n fundamental en el proceso de recuperación. La listeriosis puede provocar fiebre, vómitos, diarrea y fatiga          " +
                                                  "\n extrema, lo que aumenta el riesgo de deshidratación. Es esencial consumir líquidos ricos en electrolitos,           " +
                                                  "\n como sueros orales y caldos, para reponer los minerales perdidos. También se recomienda el consumo de infusiones    " +
                                                  "\n suaves, como manzanilla o jengibre, que pueden ayudar a aliviar las molestias digestivas y mejorar la absorción     " +
                                                  "\n de nutrientes. EJERCICIO: La actividad física debe ser muy ligera y supervisada, evitando esfuerzos excesivos que   " +
                                                  "\n puedan agravar los síntomas, ejercicios de respiración profunda y movilidad suave pueden ser beneficiosos para      " +
                                                  "\n mejorar la circulación y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento estándar para la listeriosis en     " +
                                                  "\n niños incluye antibióticos como ampicilina y gentamicina, administrados por vía intravenosa en casos graves, en     " +
                                                  "\n México algunas marcas reconocidas incluyen Amikin (amikacina) y Unasyn (ampicilina/sulbactam), además se recomienda " +
                                                  "\n reposo absoluto y una dieta adecuada para mejorar la recuperación. ALIMENTACIÓN: Para fortalecer el sistema         " +
                                                  "\n inmunológico y apoyar la recuperación, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes     " +
                                                  "\n y proteínas. Naranjas y fresas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa  " +
                                                  "\n hasta el 100% de la ingesta diaria recomendada, fortaleciendo el sistema inmunológico y ayudando a reducir la          " +
                                                  "\n inflamación. Espinacas y lentejas: Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25% y 40%   " +
                                                  "\n de la ingesta diaria recomendada, lo que ayuda a mejorar la oxigenación celular y reducir el cansancio. Carnes magras  " +
                                                  "\n y huevos: Son una fuente importante de proteínas, proporcionando entre 20 y 25 g por cada 100 g, lo que equivale al    " +
                                                  "\n 40-50% de la recomendación diaria, esenciales para la regeneración celular y el fortalecimiento muscular. Este es solo " +
                                                  "\n un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni " +
                                                  "\n que las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar más de un diagnóstico y   " +
                                                  "\n consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física de baja intensidad, evitando esfuerzos excesivos    " +
                                                  "\n y asegurando un descanso adecuado para la recuperación. Actividades como caminatas suaves, juegos tranquilos y      " +
                                                  "\n ejercicios de respiración pueden ser beneficiosos para mantener el cuerpo activo sin comprometer la recuperación.   " +
                                                  "\n HIDRATACIÓN: Es fundamental el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tamaño regular) para  " +
                                                  "\n prevenir la deshidratación causada por la diarrea y ayudar a la recuperación del organismo. POSIBLE TRATAMIENTO:    " +
                                                  "\n Para la shigelosis en niños, el tratamiento suele incluir antibióticos como la azitromicina o ciprofloxacino en     " +
                                                  "\n casos graves, además de medidas de rehidratación oral para evitar la deshidratación. ALIMENTACIÓN: Es recomendable      " +
                                                  "\n el consumo de alimentos que ayuden a la recuperación intestinal y fortalezcan el sistema inmune, tales como: Plátanos,  " +
                                                  "\n ricos en potasio (aproximadamente el 10% del requerimiento diario por cada 100 g), que ayudan a reponer electrolitos    " +
                                                  "\n perdidos por la diarrea. Zanahorias, con vitamina A (aproximadamente el 334% del requerimiento diario por cada 100 g),  " +
                                                  "\n que contribuye a la regeneración de la mucosa intestinal. Yogur, con probióticos que favorecen la salud intestinal y    " +
                                                  "\n fortalecen el sistema inmune. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al     " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento " +
                                                  "\n adecuado, se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la  " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física adaptada a su capacidad respiratoria, evitando        " +
                                                  "\n esfuerzos excesivos y asegurando una respiración controlada. Ejercicios como caminatas suaves, natación, yoga y       " +
                                                  "\n técnicas de respiración pueden mejorar la función pulmonar y reducir la fatiga. Es importante realizar calentamiento  " +
                                                  "\n previo y enfriamiento posterior para evitar crisis respiratorias. HIDRATACIÓN: Es fundamental el consumo diario de    " +
                                                  "\n 1.7 a 2 litros de agua (siete a ocho vasos de tamaño regular) para mantener las vías respiratorias hidratadas y       " +
                                                  "\n facilitar la eliminación de secreciones. POSIBLE TRATAMIENTO: Para el EPOC en niños, el tratamiento suele incluir     " +
                                                  "\n broncodilatadores como el salbutamol, corticosteroides inhalados como la fluticasona y, en casos graves, oxigenoterapia. " +
                                                  "\n ALIMENTACIÓN: Es recomendable el consumo de alimentos que ayuden a mejorar la función pulmonar y fortalezcan el sistema  " +
                                                  "\n inmune, tales como: Pescados grasos (salmón, atún), ricos en ácidos grasos Omega-3 (aproximadamente el 50% del           " +
                                                  "\n requerimiento diario por cada 100 g), que poseen propiedades antiinflamatorias que pueden ayudar a reducir la inflamación" +
                                                  "\n de las vías respiratorias. Frutas y verduras de colores vivos (arándanos, fresas, espinacas, brócoli), ricas en       " +
                                                  "\n antioxidantes como la vitamina C (aproximadamente el 90% del requerimiento diario por cada 100 g) y carotenoides,     " +
                                                  "\n que pueden proteger las células del daño y fortalecer el sistema inmunológico. Jengibre, contiene compuestos con      " +
                                                  "\n efectos antiinflamatorios que podrían ser beneficiosos para las vías respiratorias. Cúrcuma, con su componente activo," +
                                                  "\n la curcumina, también tiene potentes propiedades antiinflamatorias y antioxidantes. Este es solo un diagnóstico       " +
                                                  "\n predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las       " +
                                                  "\n respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar más de un diagnóstico" +
                                                  "\n y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física moderada, evitando esfuerzos excesivos y asegurando  " +
                                                  "\n una recuperación adecuada. Ejercicios como caminatas suaves, estiramientos y yoga pueden ser beneficiosos para       " +
                                                  "\n mantener el cuerpo activo sin comprometer el tratamiento. HIDRATACIÓN: Es fundamental el consumo diario de 1.5 a 2   " +
                                                  "\n litros de agua (seis a ocho vasos de tamaño regular) para ayudar a eliminar toxinas y mantener el organismo en       " +
                                                  "\n equilibrio. POSIBLE TRATAMIENTO: Para la clamidia en niños, el tratamiento suele incluir antibióticos como la        " +
                                                  "\n azitromicina o doxiciclina, administrados bajo supervisión médica. ALIMENTACIÓN: Es recomendable el consumo de       " +
                                                  "\n alimentos que ayuden a fortalecer el sistema inmune y mejorar la recuperación, tales como: Naranjas, ricas en        " +
                                                  "\n vitamina C (aproximadamente el 89% del requerimiento diario por cada 100 g), que ayuda a fortalecer el sistema       " +
                                                  "\n inmunológico y reducir la duración de los síntomas. Espinacas, con hierro (aproximadamente el 15% del requerimiento  " +
                                                  "\n diario por cada 100 g), que contribuye a la producción de glóbulos rojos y mejora la oxigenación del cuerpo. Yogur,  " +
                                                  "\n con probióticos que favorecen la salud intestinal y fortalecen el sistema inmune. Este es solo un diagnóstico        " +
                                                  "\n predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las      " +
                                                  "\n respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar más de un   " +
                                                  "\n diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraerMeningitis bacteriana." +
                                                  "\n En niñas pequeñas, la meningitis bacteriana es una infección grave que afecta las membranas que recubren el          " +
                                                  "\n cerebro y la médula espinal, pudiendo causar fiebre alta, rigidez en el cuello, vómitos y alteraciones del           " +
                                                  "\n estado mental. EJERCICIO: Se recomienda actividad física muy ligera, como movimientos suaves y ejercicios de         " +
                                                  "\n respiración para mejorar la oxigenación. También es importante evitar esfuerzos físicos que puedan generar           " +
                                                  "\n fatiga o dificultar la recuperación. HIDRATACIÓN: Es fundamental el consumo diario de 1.5 a 2 litros de agua         " +
                                                  "\n para mantener el cuerpo hidratado y ayudar a reducir la fiebre y el malestar. Además del agua pura, se recomienda    " +
                                                  "\n el consumo de caldos ligeros, jugos naturales sin azúcar y infusiones suaves, que pueden aportar líquidos y          " +
                                                  "\n nutrientes esenciales. También es recomendable el consumo de bebidas con electrolitos naturales, como agua de        " +
                                                  "\n coco, para ayudar a reponer los minerales perdidos por la fiebre y sudoración. POSIBLE TRATAMIENTO: La meningitis    " +
                                                  "\n bacteriana se trata con antibióticos intravenosos, como ceftriaxona, vancomicina o ampicilina, dependiendo del       " +
                                                  "\n agente causal. En casos graves, puede requerirse hospitalización para monitoreo neurológico y administración de      " +
                                                  "\n líquidos intravenosos. También se recomienda el uso de medicamentos para reducir la fiebre y aliviar el dolor,       " +
                                                  "\n como paracetamol o ibuprofeno. En algunos casos, se pueden utilizar corticoides para reducir la inflamación cerebral " +
                                                  "\n y prevenir complicaciones neurológicas. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer  " +
                                                  "\n el sistema inmunológico y reducir la inflamación, tales como arándanos, ricos en antioxidantes y vitamina C. espinacas," +
                                                  "\n que contienen hierro y vitamina A, esenciales para la recuperación. jengibre, con propiedades antiinflamatorias y      " +
                                                  "\n antioxidantes. cúrcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes. yogur natural, que     " +
                                                  "\n contiene probióticos beneficiosos para la flora intestinal. Este es solo un diagnóstico predeterminado lógico, haberlo " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas." +
                                                  "\n Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado." +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n En niñas pequeñas, el cáncer puede manifestarse de diversas formas y requerir un tratamiento especializado según el   " +
                                                  "\n tipo y la etapa de la enfermedad. EJERCICIO: Se recomienda actividad física moderada, adaptada a la capacidad de la   " +
                                                  "\n niña, como juegos tranquilos, caminatas suaves y ejercicios de movilidad para mejorar la circulación y reducir la     " +
                                                  "\n fatiga. También es recomendable realizar ejercicios de respiración y relajación para mejorar la oxigenación y reducir " +
                                                  "\n el estrés. HIDRATACIÓN: Es esencial el consumo diario de 2 a 2.5 litros de agua para mantener el cuerpo hidratado y   " +
                                                  "\n ayudar a reducir los efectos secundarios del tratamiento. Además del agua pura, se recomienda el consumo de jugos     " +
                                                  "\n naturales ricos en antioxidantes, como jugo de naranja o toronja, que pueden fortalecer el sistema inmunológico.      " +
                                                  "\n También es beneficioso ingerir caldos ligeros, que aportan líquidos y minerales esenciales para la recuperación.      " +
                                                  "\n POSIBLE TRATAMIENTO: El cáncer en niñas se trata con quimioterapia, radioterapia o cirugía, dependiendo del tipo      " +
                                                  "\n y la etapa de la enfermedad. También se pueden utilizar terapias dirigidas, como inmunoterapia, para fortalecer       " +
                                                  "\n el sistema inmunológico y combatir las células cancerosas. En algunos casos, se recomienda el uso de medicamentos     " +
                                                  "\n para aliviar los efectos secundarios, como antieméticos para controlar las náuseas y analgésicos para reducir el      " +
                                                  "\n dolor. Además, se pueden emplear terapias complementarias, como apoyo psicológico y nutricional, para mejorar la      " +
                                                  "\n calidad de vida de la paciente. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema" +
                                                  "\n inmunológico y reducir la inflamación, tales como arándanos, ricos en antioxidantes y vitamina C. espinacas, que      " +
                                                  "\n contienen hierro y vitamina A, esenciales para la recuperación. jengibre, con propiedades antiinflamatorias y         " +
                                                  "\n antioxidantes. cúrcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes. yogur natural, que    " +
                                                  "\n contiene probióticos beneficiosos para la flora intestinal. Este es solo un diagnóstico predeterminado lógico, haberlo" +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas." +
                                                  "\n Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado." +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.30-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física moderada a intensa diariamente, con una duración      " +
                                                  "\n aproximada de 60 minutos, aunque esta cantidad puede ajustarse según su edad y condición. Actividades como juegos     " +
                                                  "\n activos, caminatas, baile y ejercicios aeróbicos pueden ser beneficiosos para fortalecer su sistema inmunológico.     " +
                                                  "\n HIDRATACIÓN: Es fundamental el consumo diario de 1.7 litros de agua (siete vasos de tamaño regular) para mantener     " +
                                                  "\n una hidratación adecuada y ayudar al cuerpo a combatir la enfermedad. POSIBLE TRATAMIENTO: Para la gripe en niños,    " +
                                                  "\n el tratamiento suele incluir medicamentos para reducir la fiebre y aliviar los síntomas, como el paracetamol (Tempra) " +
                                                  "\n o el ibuprofeno. En casos específicos, se pueden utilizar antivirales como el oseltamivir (Tamiflu). ALIMENTACIÓN:    " + 
                                                  "\n Es recomendable el consumo de frutas y verduras que fortalezcan el sistema inmune, tales como: Naranjas, ricas en     " +
                                                  "\n vitamina C (aportan aproximadamente el 89% del requerimiento diario por cada 100 g), que ayuda a fortalecer el        " +
                                                  "\n sistema inmunológico y reducir la duración de los síntomas. Fresas, con antioxidantes y vitamina C (aportan cerca     " +
                                                  "\n del 98% del requerimiento diario por cada 100 g), esenciales para la protección celular y la recuperación del         " +
                                                  "\n organismo. Plátanos, ricos en potasio (aportan alrededor del 10% del requerimiento diario por cada 100 g), que        " +
                                                  "\n ayuda a reemplazar los electrolitos perdidos por fiebre y sudoración. Kiwi, con vitamina C (aproximadamente el        " +
                                                  "\n 93% del requerimiento diario por cada 100 g) y potasio, que contribuyen a la función inmunológica y la recuperación   " +
                                                  "\n del cuerpo. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente" +
                                                  "\n tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado, se " +
                                                  "\n recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app   " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física de baja intensidad, evitando esfuerzos             " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperación. Actividades como caminatas suaves, juegos        " +
                                                  "\n tranquilos y ejercicios de respiración pueden ser beneficiosos para mantener el cuerpo activo sin comprometer      " +
                                                  "\n la recuperación. HIDRATACIÓN: Es fundamental el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de     " +
                                                  "\n tamaño regular) para mantener una hidratación óptima y ayudar a fluidificar las secreciones pulmonares. POSIBLE    " +
                                                  "\n TRATAMIENTO: Para la neumonía en niños, el tratamiento suele incluir antibióticos como la amoxicilina o azitromicina " +
                                                  "\n en caso de infecciones bacterianas, además de medicamentos para reducir la fiebre y aliviar los síntomas, como el    " +
                                                  "\n paracetamol. En casos graves, puede requerirse hospitalización y oxigenoterapia. ALIMENTACIÓN: Es recomendable el    " +
                                                  "\n consumo de alimentos que fortalezcan el sistema inmune y ayuden a la recuperación, tales como: Naranjas, ricas en    " +
                                                  "\n vitamina C (aportan aproximadamente el 89% del requerimiento diario por cada 100 g), que ayuda a fortalecer el       " +
                                                  "\n sistema inmunológico y reducir la duración de los síntomas. Espinacas, con hierro (aproximadamente el 15% del        " +
                                                  "\n requerimiento diario por cada 100 g), que contribuye a la producción de glóbulos rojos y mejora la oxigenación       " +
                                                  "\n del cuerpo. Yogur, con probióticos que favorecen la salud intestinal y fortalecen el sistema inmune. Este es solo    " +
                                                  "\n un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad  " +
                                                  "\n ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar más    " +
                                                  "\n de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física moderada diariamente, con una duración aproximada     " +
                                                  "\n de 60 minutos, incluyendo ejercicios aeróbicos como caminar, correr o nadar, para mejorar la sensibilidad a la        " +
                                                  "\n insulina. También se recomienda la práctica de ejercicios de resistencia como el yoga o el entrenamiento ligero       " +
                                                  "\n con pesas para mejorar el metabolismo de la glucosa. HIDRATACIÓN: Es fundamental el consumo diario de 1.7 a 2 litros  " +
                                                  "\n de agua (siete a ocho vasos de tamaño regular) para ayudar a mantener niveles adecuados de glucosa en sangre y      " + 
                                                  "\n prevenir la deshidratación. POSIBLE TRATAMIENTO: Para la diabetes en niños, el tratamiento suele incluir insulina   " +
                                                  "\n en el caso de diabetes tipo 1, mientras que en diabetes tipo 2 puede requerirse metformina y cambios en el estilo   " +
                                                  "\n de vida. Es esencial el monitoreo constante de la glucosa en sangre y el seguimiento médico. ALIMENTACIÓN: Es       " +
                                                  "\n recomendable el consumo de alimentos que ayuden a regular los niveles de glucosa y fortalezcan el organismo, tales  " +
                                                  "\n como: Avena, rica en fibra soluble (aproximadamente el 10% del requerimiento diario por cada 100 g), que ayuda a    " +
                                                  "\n estabilizar los niveles de azúcar en sangre. Frutos secos, con grasas saludables y magnesio (aproximadamente el 15% " +
                                                  "\n del requerimiento diario por cada 100 g), que contribuyen a la regulación de la glucosa. Legumbres, con proteínas   " +
                                                  "\n vegetales y fibra (aproximadamente el 20% del requerimiento diario por cada 100 g), que favorecen la saciedad y el  " +
                                                  "\n control de la glucosa. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100%   " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento  " +
                                                  "\n adecuado, se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita   " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n En niñas pequeñas, el asma puede causar dificultad para respirar, tos persistente, sibilancias y fatiga, afectando     " +
                                                  "\n su bienestar y calidad de vida. EJERCICIO: Se recomienda actividad física moderada, como caminatas suaves, juegos      " +
                                                  "\n tranquilos y ejercicios de respiración para mejorar la oxigenación. También es importante evitar esfuerzos físicos     " +
                                                  "\n que puedan generar fatiga o dificultar la respiración. HIDRATACIÓN: Es esencial el consumo diario de 1.5 a 2 litros    " +
                                                  "\n de agua para mantener el cuerpo hidratado y ayudar a reducir la inflamación de las vías respiratorias. Además del      " +
                                                  "\n agua pura, se recomienda el consumo de infusiones suaves, jugos naturales sin azúcar y caldos ligeros, que pueden      " +
                                                  "\n aportar líquidos y nutrientes esenciales. También es recomendable el consumo de bebidas con electrolitos naturales,    " +
                                                  "\n como agua de coco, para ayudar a reponer los minerales perdidos por la fiebre y sudoración. POSIBLE TRATAMIENTO: El    " +
                                                  "\n asma se trata con broncodilatadores, como salbutamol, para aliviar los episodios agudos, y corticosteroides            " +
                                                  "\n inhalados, como budesonida, para reducir la inflamación de las vías respiratorias. También se recomienda el uso de     " +
                                                  "\n antihistamínicos en casos de alergias asociadas y terapia respiratoria, que incluye ejercicios específicos para        " +
                                                  "\n mejorar la capacidad pulmonar. En casos más severos, se puede requerir oxígeno suplementario y rehabilitación          " +
                                                  "\n pulmonar para mejorar la función respiratoria. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a        " +
                                                  "\n fortalecer el sistema respiratorio y reducir la inflamación, tales como pescados grasos (salmón, atún), ricos en       " +
                                                  "\n ácidos grasos Omega-3, que poseen propiedades antiinflamatorias. frutas y verduras de colores vivos (arándanos,        " +
                                                  "\n fresas, espinacas, brócoli), ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las         " +
                                                  "\n células del daño y fortalecer el sistema inmunológico. jengibre, que contiene compuestos con efectos antiinflamatorios " +
                                                  "\n que podrían ser beneficiosos para las vías respiratorias. cúrcuma, con su componente activo, la curcumina, que         " +
                                                  "\n tiene potentes propiedades antiinflamatorias y antioxidantes. Este es solo un diagnóstico predeterminado lógico,       " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente " +
                                                  "\n correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el   " +
                                                  "\n tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n En niñas pequeñas, el VIH puede afectar el sistema inmunológico y requerir un tratamiento especializado para        " +
                                                  "\n evitar complicaciones graves. EJERCICIO: Se recomienda actividad física moderada, adaptada a la capacidad de        " +
                                                  "\n la niña, como juegos tranquilos, caminatas suaves y ejercicios de movilidad para mejorar la circulación y           " +
                                                  "\n reducir la fatiga. También es recomendable realizar ejercicios de respiración y relajación para mejorar la          " +
                                                  "\n oxigenación y reducir el estrés. HIDRATACIÓN: Es esencial el consumo diario de 2 a 2.5 litros de agua para          " +
                                                  "\n mantener el cuerpo hidratado y ayudar a reducir los efectos secundarios del tratamiento. Además del agua pura,      " +
                                                  "\n se recomienda el consumo de jugos naturales ricos en antioxidantes, como jugo de naranja o toronja, que pueden      " +
                                                  "\n fortalecer el sistema inmunológico. También es beneficioso ingerir caldos ligeros, que aportan líquidos y           " +
                                                  "\n minerales esenciales para la recuperación. POSIBLE TRATAMIENTO: El VIH en niñas se trata con terapia                " +
                                                  "\n antirretroviral (TAR), que incluye medicamentos como lamivudina, abacavir y lopinavir, para reducir la carga        " +
                                                  "\n viral y fortalecer el sistema inmunológico. También se recomienda un plan de alimentación saludable, monitoreo      " +
                                                  "\n constante de los niveles de CD4 y seguimiento médico especializado. En algunos casos, se pueden utilizar            " +
                                                  "\n medicamentos para tratar infecciones oportunistas, como antibióticos y antifúngicos, para prevenir complicaciones.  " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmunológico y reducir       " +
                                                  "\n la inflamación, tales como arándanos, ricos en antioxidantes y vitamina C. espinacas, que contienen hierro y        " +
                                                  "\n vitamina A, esenciales para la recuperación. jengibre, con propiedades antiinflamatorias y antioxidantes.           " +
                                                  "\n cúrcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes. yogur natural, que contiene        " +
                                                  "\n probióticos beneficiosos para la flora intestinal. Este es solo un diagnóstico predeterminado lógico, haberlo       " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente      " +
                                                  "\n correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el       " +
                                                  "\n tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n En niñas pequeñas, la gonorrea puede causar síntomas como secreción anormal, dolor al orinar y fiebre, y requiere      " +
                                                  "\n tratamiento inmediato para evitar complicaciones. EJERCICIO: Se recomienda actividad física moderada, como caminatas   " +
                                                  "\n suaves y ejercicios de movilidad para mejorar la circulación y reducir la fatiga. También es recomendable realizar     " +
                                                  "\n ejercicios de relajación y respiración para reducir el estrés, ya que este puede afectar la respuesta inmunológica     " +
                                                  "\n y prolongar la infección. HIDRATACIÓN: Es esencial el consumo diario de 2.5 a 2.75 litros de agua para mantener el     " +
                                                  "\n cuerpo hidratado y ayudar a reducir la inflamación. Además del agua pura, se recomienda el consumo de jugos naturales  " +
                                                  "\n ricos en vitamina C, como jugo de naranja o toronja, que pueden fortalecer el sistema inmunológico. También es         " +
                                                  "\n beneficioso ingerir caldos ligeros, que aportan líquidos y minerales esenciales para la recuperación. POSIBLE          " +
                                                  "\n TRATAMIENTO: La gonorrea se trata con antibióticos, como ceftriaxona o azitromicina, administrados en una sola         " +
                                                  "\n dosis o en un régimen de varios días. En casos más severos, se puede requerir tratamiento prolongado con antibióticos  " +
                                                  "\n adicionales, dependiendo de la resistencia bacteriana. También se recomienda el uso de probióticos para restaurar      " +
                                                  "\n la flora intestinal y mejorar la recuperación. En algunos casos, se pueden utilizar medicamentos para aliviar el       " +
                                                  "\n dolor y la inflamación, como ibuprofeno, para reducir los síntomas. ALIMENTACIÓN: Se recomienda el consumo de alimentos" +
                                                  "\n que ayuden a fortalecer el sistema inmunológico y reducir la inflamación, tales como arándanos, ricos en antioxidantes " +
                                                  "\n y vitamina C. espinacas, que contienen hierro y vitamina A, esenciales para la recuperación. jengibre, con propiedades " +
                                                  "\n antiinflamatorias y antioxidantes. cúrcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes.    " +
                                                  "\n yogur natural, que contiene probióticos beneficiosos para la flora intestinal. Este es solo un diagnóstico predeterminado" +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean         " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer " +
                                                  "\n el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes Genital." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física moderada, evitando esfuerzos excesivos que puedan       " +
                                                  "\n generar fatiga o estrés, ya que el herpes puede activarse en situaciones de debilitamiento del sistema inmunológico.    " +
                                                  "\n Se sugiere ejercicios suaves como caminatas cortas o juegos tranquilos en casa. HIDRATACIÓN: Se recomienda el consumo   " +
                                                  "\n diario de 1.5 a 2 litros de agua al día (seis a ocho vasos de tamaño regular) para mantener una adecuada hidratación    " +
                                                  "\n y ayudar a la recuperación. También es beneficioso el consumo de infusiones de manzanilla, que pueden ayudar a reducir  " +
                                                  "\n la inflamación, y agua con limón, rica en vitamina C, que fortalece el sistema inmune. POSIBLE TRATAMIENTO: Para el     " +
                                                  "\n herpes genital en niñas, el tratamiento suele incluir antivirales como aciclovir, valaciclovir o famciclovir,           " +
                                                  "\n administrados bajo supervisión médica para reducir la duración y severidad de los brotes. También se recomienda el      " +
                                                  "\n uso de cremas tópicas para aliviar el dolor y la irritación. ALIMENTACIÓN: Se recomienda el consumo de alimentos que    " +
                                                  "\n fortalezcan el sistema inmune y ayuden a la recuperación, tales como Yogur natural: fuente de probióticos que ayudan    " +
                                                  "\n a fortalecer el sistema inmune y mejorar la salud intestinal. Ajo: contiene alicina, un compuesto con propiedades       " +
                                                  "\n antimicrobianas que pueden ayudar a combatir infecciones. Jengibre: con propiedades antiinflamatorias que pueden aliviar" +
                                                  "\n la fatiga y mejorar la respuesta inmune. Frutas cítricas (naranjas, limones, toronjas): ricas en vitamina C, que ayuda  " +
                                                  "\n a mejorar la respuesta inmunológica. Miel: ayuda a calmar la garganta y tiene propiedades antimicrobianas. Este es solo " +
                                                  "\n un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni  " +
                                                  "\n que las respuestas sean completamente correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en   " +
                                                  "\n el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda  " +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores..");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física moderada, evitando esfuerzos excesivos que puedan       " +
                                                  "\n generar fatiga. Se sugiere ejercicios suaves como caminatas cortas o juegos tranquilos en casa. HIDRATACIÓN: Se         " +
                                                  "\n recomienda el consumo diario de 1.5 a 2 litros de agua al día (seis a ocho vasos de tamaño regular) para mantener       " +
                                                  "\n una adecuada hidratación y ayudar a la recuperación. También es beneficioso el consumo de infusiones de jengibre,       " +
                                                  "\n que pueden ayudar a reducir la inflamación, y agua con limón, rica en vitamina C, que fortalece el sistema inmune.      " +
                                                  "\n POSIBLE TRATAMIENTO: Para la sífilis en niñas, el tratamiento suele incluir penicilina como primera línea de defensa,   " +
                                                  "\n administrada bajo supervisión médica. En casos de alergia a la penicilina, pueden utilizarse otros antibióticos como    " +
                                                  "\n doxiciclina o azitromicina. ALIMENTACIÓN: Se recomienda el consumo de alimentos que fortalezcan el sistema inmune y     " +
                                                  "\n ayuden a la recuperación, tales como Espinacas: contienen hierro y vitamina A, esenciales para la regeneración celular. " +
                                                  "\n Yogur natural: fuente de probióticos que ayudan a restaurar la flora intestinal y fortalecer el sistema inmune.         " +
                                                  "\n Jengibre: con propiedades antiinflamatorias que pueden aliviar la fatiga y mejorar la respuesta inmune. Miel:           " +
                                                  "\n ayuda a calmar la garganta y tiene propiedades antimicrobianas. Ajo: contiene alicina, un compuesto con propiedades     " +
                                                  "\n antimicrobianas que pueden ayudar a combatir infecciones. Este es solo un diagnóstico predeterminado lógico. Haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente          " +
                                                  "\n correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además,        " +
                                                  "\n por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.            " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física moderada, evitando esfuerzos excesivos                  " +
                                                  "\n que puedan generar fatiga o afectar la función pulmonar. Se sugiere ejercicios suaves como caminatas cortas             " +
                                                  "\n o juegos tranquilos en casa. HIDRATACIÓN: Debido a la fiebre y la posible deshidratación causada por la                 " +
                                                  "\n tuberculosis, se recomienda el consumo diario de 2 a 2.5 litros de agua al día (ocho a diez vasos de tamaño             " +
                                                  "\n regular). También es beneficioso el consumo de infusiones de jengibre, que pueden ayudar a reducir la inflamación,      " +
                                                  "\n y caldos ligeros, que aportan electrolitos esenciales. POSIBLE TRATAMIENTO: Para la tuberculosis en niñas, el           " +
                                                  "\n tratamiento suele incluir antibióticos como isoniazida, rifampicina, pirazinamida y etambutol, administrados bajo       " +
                                                  "\n supervisión médica durante un período prolongado. En casos graves, puede requerirse hospitalización con tratamiento     " +
                                                  "\n intravenoso. ALIMENTACIÓN: Se recomienda el consumo de alimentos que fortalezcan el sistema inmune y ayuden a la        " +
                                                  "\n recuperación, tales como Espinacas: contienen hierro y vitamina A, esenciales para la regeneración celular. Yogur       " +
                                                  "\n natural: fuente de probióticos que ayudan a restaurar la flora intestinal y fortalecer el sistema inmune. Jengibre:     " +
                                                  "\n con propiedades antiinflamatorias que pueden aliviar la fatiga y mejorar la respuesta inmune. Miel: ayuda a calmar      " +
                                                  "\n la garganta y tiene propiedades antimicrobianas. Ajo: contiene alicina, un compuesto con propiedades antimicrobianas    " +
                                                  "\n que pueden ayudar a combatir infecciones. Frutas cítricas (naranjas, limones, toronjas): ricas en vitamina C, que       " +
                                                  "\n ayuda a mejorar la respuesta inmunológica. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no     " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda " +
                                                  "\n realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta " +
                                                  "\n del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACIÓN: Es fundamental mantener una hidratación adecuada para reducir la inflamación articular y mejorar la        " +
                                                  "\n movilidad. Se recomienda el consumo diario de 1.5 a 2 litros de agua, además de infusiones de cúrcuma y jengibre,       " +
                                                  "\n que poseen propiedades antiinflamatorias naturales. La artritis idiopática juvenil es la forma más común de artritis    " +
                                                  "\n en niños y puede afectar la movilidad y calidad de vida si no se trata adecuadamente. La hidratación también ayuda a    " +
                                                  "\n mantener la elasticidad de los tejidos y a reducir la rigidez matutina en las articulaciones. EJERCICIO: La actividad   " +
                                                  "\n física es clave para mejorar la movilidad y reducir la rigidez articular. Se recomienda realizar ejercicios de bajo     " +
                                                  "\n impacto, como natación, yoga y estiramientos suaves, que fortalecen los músculos sin generar presión en las             " +
                                                  "\n articulaciones. También es beneficioso practicar ejercicios de movilidad articular, como rotaciones de muñecas y        " +
                                                  "\n tobillos, para mejorar la flexibilidad. La terapia física es esencial para evitar la pérdida de movilidad y fortalecer  " +
                                                  "\n los músculos que rodean las articulaciones afectadas. POSIBLE TRATAMIENTO: El tratamiento para la artritis incluye      " +
                                                  "\n antiinflamatorios no esteroides (AINE) como ibuprofeno y naproxeno, además de terapia física para mejorar la movilidad. " +
                                                  "\n En casos más severos, se pueden utilizar medicamentos modificadores de la enfermedad, como metotrexato. En México,      " +
                                                  "\n estos medicamentos están disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACIÓN: También es       " +
                                                  "\n recomendable el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales   " +
                                                  "\n como pescados grasos (salmón, atún), ricos en Omega-3, con propiedades antiinflamatorias. Frutas cítricas (naranjas,    " +
                                                  "\n limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunológico. Verduras de hoja verde (espinacas,      " +
                                                  "\n acelgas, brócoli), contienen antioxidantes y hierro, esenciales para la salud celular. Frutos secos (almendras, nueces),   " +
                                                  "\n aportan vitamina E, que ayuda a la regeneración celular. Yogur natural, fuente de probióticos, que favorecen la salud      " +
                                                  "\n intestinal y el sistema inmunológico. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza   " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda " +
                                                  "\n realizar más de un Diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Además, " +
                                                  "\n por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L.      " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACIÓN: La hidratación es clave para aliviar la irritación de las vías respiratorias y reducir la acumulación     " +
                                                  "\n de moco. Se recomienda el consumo diario de 1.5 a 2 litros de agua, además de infusiones de miel y limón, que ayudan   " +
                                                  "\n a calmar la tos y mejorar la respiración. La tosferina es una infección respiratoria altamente contagiosa causada por  " +
                                                  "\n la bacteria Bordetella pertussis, que puede provocar ataques de tos severos y dificultad para respirar. Mantener una   " +
                                                  "\n hidratación adecuada ayuda a reducir la viscosidad del moco y facilita su expulsión, evitando la obstrucción de las    " +
                                                  "\n vías respiratorias. EJERCICIO: La actividad física debe ser moderada y enfocada en mejorar la capacidad pulmonar. Se   " +
                                                  "\n recomienda realizar ejercicios de respiración profunda, como respiración diafragmática y con labios fruncidos, que     " +
                                                  "\n ayudan a mejorar la oxigenación. También es beneficioso practicar caminatas suaves, evitando ambientes fríos o         " +
                                                  "\n contaminados. En casos graves, los niños pueden requerir hospitalización para recibir oxígeno suplementario. POSIBLE   " +
                                                  "\n TRATAMIENTO: El tratamiento para la tosferina incluye antibióticos como eritromicina y azitromicina, además de terapia " +
                                                  "\n respiratoria para mejorar la función pulmonar. En casos graves, se puede requerir hospitalización y oxigenoterapia.    " +
                                                  "\n En México, estos medicamentos están disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACIÓN:      " +
                                                  "\n También es recomendable el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, " +
                                                  "\n tales como frutas cítricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunológico.      " +
                                                  "\n Verduras de hoja verde (espinacas, acelgas, brócoli), contienen antioxidantes y hierro, esenciales para la salud       " +
                                                  "\n celular. Pescados grasos (salmón, atún), ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos (almendras, " +
                                                  "\n nueces), aportan vitamina E, que ayuda a la regeneración celular. Yogur natural, fuente de probióticos, que favorecen  " +
                                                  "\n la salud intestinal y el sistema inmunológico. Este es solo un diagnóstico predeterminado lógico, haberlo consultado   " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para    " +
                                                  "\n ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado " +
                                                  "\n del paciente. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar  " +
                                                  "\n a su médico. Ángel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACIÓN: La hidratación es esencial para reducir la inflamación de las glándulas salivales y aliviar el malestar.    " +
                                                  "\n Se recomienda el consumo diario de 1.5 a 2 litros de agua, además de infusiones de manzanilla y jengibre, que poseen     " +
                                                  "\n propiedades antiinflamatorias. La papera es una infección viral que afecta principalmente a las glándulas salivales y    " +
                                                  "\n puede causar fiebre, dolor muscular y dificultad para tragar. Mantener una hidratación adecuada ayuda a reducir la       " +
                                                  "\n sequedad bucal y a aliviar la inflamación de las glándulas afectadas. EJERCICIO: Durante la enfermedad, se recomienda    " +
                                                  "\n reposo absoluto para evitar el desgaste energético y permitir que el cuerpo se recupere. Una vez que los síntomas        " +
                                                  "\n comienzan a mejorar, es recomendable realizar ejercicios de movilidad suave, como estiramientos ligeros y caminatas      " +
                                                  "\n cortas, para estimular la circulación y evitar la fatiga muscular causada por el reposo prolongado. POSIBLE TRATAMIENTO: " +
                                                  "\n No existe un tratamiento específico para las paperas, pero se recomienda reposo, analgésicos como ibuprofeno o paracetamol,  " +
                                                  "\n y compresas frías en la zona inflamada para aliviar el dolor. En México, estos medicamentos están disponibles en             " +
                                                  "\n instituciones de salud como el IMSS y el Insabi. ALIMENTACIÓN: También es recomendable el consumo de alimentos que           " +
                                                  "\n fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como frutas cítricas (naranjas, limones,        " +
                                                  "\n toronjas), ricas en vitamina C, que fortalece el sistema inmunológico. Verduras de hoja verde (espinacas, acelgas, brócoli), " +
                                                  "\n contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos (salmón, atún), ricos en Omega-3,        " +
                                                  "\n con propiedades antiinflamatorias. Frutos secos (almendras, nueces), aportan vitamina E, que ayuda a la regeneración         " +
                                                  "\n celular. Yogur natural, fuente de probióticos, que favorecen la salud intestinal y el sistema inmunológico. Este es          " +
                                                  "\n solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad     " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida    " +
                                                  "\n para establecer mayor seguridad en el tratamiento adecuado del paciente. Además, por su salud, si la respuesta del        " +
                                                  "\n diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L. Montes agradece tu visita a la        " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tamaño regular) para      " +
                                                  "\n mantener la hidratación y ayudar a reducir la fiebre y el malestar general, lo que es fundamental en el proceso de     " +
                                                  "\n recuperación. El Zika puede provocar fiebre, dolor muscular, fatiga y sarpullido, lo que puede llevar a una mayor      " +
                                                  "\n pérdida de líquidos. Es importante que el paciente consuma líquidos ricos en electrolitos, como sueros orales, caldos  " +
                                                  "\n y jugos naturales sin azúcar, para evitar la deshidratación y mantener el equilibrio de minerales esenciales. También  " +
                                                  "\n se recomienda el consumo de infusiones suaves, como manzanilla o jengibre, que pueden ayudar a aliviar las molestias   " +
                                                  "\n musculares y mejorar la digestión. EJERCICIO: La actividad física debe ser muy ligera y supervisada, evitando esfuerzos   " +
                                                  "\n excesivos que puedan agravar los síntomas, ejercicios de respiración profunda y movilidad suave pueden ser beneficiosos   " +
                                                  "\n para mejorar la circulación y reducir la fatiga. POSIBLE TRATAMIENTO: No existe un tratamiento específico para el Zika,   " +
                                                  "\n pero los síntomas pueden aliviarse con analgésicos como paracetamol y acetaminofén, en México algunas marcas reconocidas  " +
                                                  "\n incluyen Tempra (paracetamol) y Tylenol (acetaminofén), además se recomienda reposo absoluto, hidratación constante y     " +
                                                  "\n protección contra picaduras de mosquitos para evitar complicaciones. ALIMENTACIÓN: Para fortalecer el sistema inmunológico" +
                                                  "\n y apoyar la recuperación, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y zinc. Kiwi y         " +
                                                  "\n naranjas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa hasta el 100% de la          " +
                                                  "\n ingesta diaria recomendada, fortaleciendo el sistema inmunológico. Jengibre y cúrcuma: Poseen propiedades antiinflamatorias" +
                                                  "\n y antioxidantes, ayudando a reducir la inflamación y el malestar general. Almendras y semillas de calabaza: Aportan        " +
                                                  "\n 10-15 mg de zinc por cada 100 g, cubriendo hasta el 100% de la recomendación diaria, esencial para la función inmunológica." +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta  " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar más de un   " +
                                                  "\n diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tamaño regular)         " +
                                                  "\n para evitar la deshidratación causada por la diarrea y los vómitos, lo que es fundamental en el proceso de           " +
                                                  "\n recuperación. El rotavirus puede provocar fiebre, vómitos y diarrea intensa, lo que aumenta el riesgo de pérdida     " +
                                                  "\n de líquidos y electrolitos. Es esencial consumir líquidos ricos en electrolitos, como sueros orales y caldos,        " +
                                                  "\n para reponer los minerales perdidos. También se recomienda el consumo de agua con limón o infusiones suaves, que     " +
                                                  "\n pueden ayudar a aliviar las náuseas y mejorar la digestión. EJERCICIO: La actividad física debe ser mínima y de      " +
                                                  "\n reposo, evitando esfuerzos físicos que puedan agravar la fatiga y la deshidratación, se recomienda descanso absoluto " +
                                                  "\n hasta la recuperación completa. POSIBLE TRATAMIENTO: No existe un tratamiento específico para el rotavirus, pero los " +
                                                  "\n síntomas pueden aliviarse con rehidratación oral y medicamentos para la fiebre como paracetamol, en México algunas   " +
                                                  "\n marcas reconocidas incluyen Tempra (paracetamol) y Pedialyte (solución de rehidratación oral), además se recomienda  " +
                                                  "\n reposo y una dieta ligera para evitar complicaciones. ALIMENTACIÓN: Para fortalecer el sistema digestivo y apoyar la " +
                                                  "\n recuperación, se recomienda el consumo de alimentos ricos en probióticos, fibra y minerales esenciales. Yogur y kéfir:     " +
                                                  "\n Contienen probióticos naturales, que ayudan a restaurar la flora intestinal y mejorar la digestión. Plátanos y zanahorias: " +
                                                  "\n Son fuentes de fibra soluble, que ayuda a regular el tránsito intestinal y reducir la diarrea. Caldo de pollo y arroz:     " +
                                                  "\n Son alimentos suaves y fáciles de digerir, proporcionando electrolitos y energía para la recuperación. Este es solo un     " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que    " +
                                                  "\n las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar más de un diagnóstico y   " +
                                                  "\n consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeriosis." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tamaño regular)          " +
                                                  "\n para mantener la hidratación y ayudar a reducir la fiebre y los síntomas gastrointestinales, lo que es fundamental    " +
                                                  "\n en el proceso de recuperación. La listeriosis puede provocar fiebre, vómitos, diarrea y fatiga extrema, lo que        " +
                                                  "\n aumenta el riesgo de deshidratación. Es esencial consumir líquidos ricos en electrolitos, como sueros orales y        " +
                                                  "\n caldos, para reponer los minerales perdidos. También se recomienda el consumo de infusiones suaves, como manzanilla   " +
                                                  "\n o jengibre, que pueden ayudar a aliviar las molestias digestivas y mejorar la absorción de nutrientes. EJERCICIO:     " +
                                                  "\n La actividad física debe ser muy ligera y supervisada, evitando esfuerzos excesivos que puedan agravar los síntomas,  " +
                                                  "\n ejercicios de respiración profunda y movilidad suave pueden ser beneficiosos para mejorar la circulación y reducir la " +
                                                  "\n fatiga. POSIBLE TRATAMIENTO: El tratamiento estándar para la listeriosis en niños incluye antibióticos como ampicilina" +
                                                  "\n y gentamicina, administrados por vía intravenosa en casos graves, en México algunas marcas reconocidas incluyen Amikin" +
                                                  "\n (amikacina) y Unasyn (ampicilina/sulbactam), además se recomienda reposo absoluto y una dieta adecuada para mejorar la" +
                                                  "\n recuperación. ALIMENTACIÓN: Para fortalecer el sistema inmunológico y apoyar la recuperación, se recomienda el consumo" +
                                                  "\n de alimentos ricos en vitamina C, antioxidantes y proteínas. Naranjas y fresas: Contienen aproximadamente 70-90 mg de " +
                                                  "\n vitamina C por cada 100 g, lo que representa hasta el 100% de la ingesta diaria recomendada, fortaleciendo el sistema " +
                                                  "\n inmunológico y ayudando a reducir la inflamación. Espinacas y lentejas: Aportan entre 3.5 y 6.6 mg de hierro por cada " +
                                                  "\n 100 g, cubriendo entre el 25% y 40% de la ingesta diaria recomendada, lo que ayuda a mejorar la oxigenación celular y " +
                                                  "\n reducir el cansancio. Carnes magras y huevos: Son una fuente importante de proteínas, proporcionando entre 20 y 25 g  " +
                                                  "\n por cada 100 g, lo que equivale al 40-50% de la recomendación diaria, esenciales para la regeneración celular y el    " +
                                                  "\n fortalecimiento muscular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%  " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se     " +
                                                  "\n recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida)" +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física de baja intensidad, evitando esfuerzos excesivos      " +
                                                  "\n y asegurando un descanso adecuado para la recuperación. Actividades como caminatas suaves, juegos tranquilos y        " +
                                                  "\n ejercicios de respiración pueden ser beneficiosos para mantener el cuerpo activo sin comprometer la recuperación.     " +
                                                  "\n También se recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez muscular causada       " +
                                                  "\n por el reposo prolongado. HIDRATACIÓN: Es fundamental el consumo diario de 1.5 a 2 litros de agua (seis a ocho        " +
                                                  "\n vasos de tamaño regular) para prevenir la deshidratación causada por la diarrea y ayudar a la recuperación del        " +
                                                  "\n organismo. Además, se recomienda el consumo de sueros de rehidratación oral para reponer los electrolitos perdidos.   " +
                                                  "\n POSIBLE TRATAMIENTO: Para la shigelosis en niños, el tratamiento suele incluir antibióticos como la azitromicina o    " +
                                                  "\n ciprofloxacino en casos graves, además de medidas de rehidratación oral para evitar la deshidratación. También es     " +
                                                  "\n importante mantener una higiene adecuada, lavarse las manos frecuentemente y evitar el contacto con personas infectadas. " +
                                                  "\n ALIMENTACIÓN: Es recomendable el consumo de alimentos que ayuden a la recuperación intestinal y fortalezcan el sistema   " +
                                                  "\n inmune, tales como: Plátanos, ricos en potasio (aproximadamente el 10% del requerimiento diario por cada 100 g), que     " +
                                                  "\n ayudan a reponer electrolitos perdidos por la diarrea. Zanahorias, con vitamina A (aproximadamente el 334% del           " +
                                                  "\n requerimiento diario por cada 100 g), que contribuye a la regeneración de la mucosa intestinal. Yogur, con probióticos   " +
                                                  "\n que favorecen la salud intestinal y fortalecen el sistema inmune. También se recomienda el consumo de caldos y sopas     " +
                                                  "\n suaves para facilitar la digestión y evitar irritaciones en el tracto intestinal. Este es solo un diagnóstico   " +
                                                  "\n predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las " +
                                                  "\n respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar más de un    " +
                                                  "\n diagnóstico y consultar a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física adaptada a su capacidad respiratoria, evitando esfuerzos  " +
                                                  "\n excesivos y asegurando una respiración controlada. Ejercicios como caminatas suaves, natación, yoga y técnicas de         " +
                                                  "\n respiración pueden mejorar la función pulmonar y reducir la fatiga. También se recomienda ejercicios de expansión         " +
                                                  "\n torácica y fortalecimiento de los músculos respiratorios para mejorar la capacidad pulmonar. Es importante realizar       " +
                                                  "\n calentamiento previo y enfriamiento posterior para evitar crisis respiratorias. HIDRATACIÓN: Es fundamental el consumo    " +
                                                  "\n diario de 1.7 a 2 litros de agua (siete a ocho vasos de tamaño regular) para mantener las vías respiratorias hidratadas   " +
                                                  "\n y facilitar la eliminación de secreciones. También se recomienda el consumo de infusiones con propiedades antiinflamatorias" +
                                                  "\n como el té de jengibre o manzanilla. POSIBLE TRATAMIENTO: Para el EPOC en niños, el tratamiento suele incluir             " +
                                                  "\n broncodilatadores como el salbutamol, corticosteroides inhalados como la fluticasona y, en casos graves, oxigenoterapia.  " +
                                                  "\n También es importante evitar la exposición a contaminantes ambientales y humo de tabaco. ALIMENTACIÓN: Es recomendable    " +
                                                  "\n el consumo de alimentos que ayuden a mejorar la función pulmonar y fortalezcan el sistema inmune, tales como: Pescados    " +
                                                  "\n grasos (salmón, atún), ricos en ácidos grasos Omega-3 (aproximadamente el 50% del requerimiento diario por cada 100 g),   " +
                                                  "\n que poseen propiedades antiinflamatorias que pueden ayudar a reducir la inflamación de las vías respiratorias. Frutas     " +
                                                  "\n y verduras de colores vivos (arándanos, fresas, espinacas, brócoli), ricas en antioxidantes como la vitamina C        " +
                                                  "\n (aproximadamente el 90% del requerimiento diario por cada 100 g) y carotenoides, que pueden proteger las células      " +
                                                  "\n del daño y fortalecer el sistema inmunológico. Jengibre, contiene compuestos con efectos antiinflamatorios que        " +
                                                  "\n podrían ser beneficiosos para las vías respiratorias. Cúrcuma, con su componente activo, la curcumina, también        " +
                                                  "\n tiene potentes propiedades antiinflamatorias y antioxidantes. También se recomienda el consumo de alimentos ricos     " +
                                                  "\n en fibra para mejorar la digestión y evitar la inflamación intestinal. Este es solo un diagnóstico predeterminado     " +
                                                  "\n lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean      " +
                                                  "\n correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar más de un diagnóstico y consultar  " +
                                                  "\n a un médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n EJERCICIO: Es recomendable que la niña realice actividad física moderada, evitando esfuerzos excesivos y asegurando  " +
                                                  "\n una recuperación adecuada. Ejercicios como caminatas suaves, estiramientos y yoga pueden ser beneficiosos para       " +
                                                  "\n mantener el cuerpo activo sin comprometer el tratamiento. También se recomienda ejercicios de relajación y           " +
                                                  "\n respiración profunda para reducir el estrés y mejorar la respuesta inmune. HIDRATACIÓN: Es fundamental el consumo    " +
                                                  "\n diario de 1.5 a 2 litros de agua (seis a ocho vasos de tamaño regular) para ayudar a eliminar toxinas y mantener el  " +
                                                  "\n organismo en equilibrio. También se recomienda el consumo de jugos naturales ricos en antioxidantes para fortalecer  " +
                                                  "\n el sistema inmune. POSIBLE TRATAMIENTO: Para la clamidia en niños, el tratamiento suele incluir antibióticos como la " +
                                                  "\n azitromicina o doxiciclina, administrados bajo supervisión médica. También es importante evitar el contacto con        " +
                                                  "\n personas infectadas y mantener una higiene adecuada. ALIMENTACIÓN: Es recomendable el consumo de alimentos que ayuden  " +
                                                  "\n a fortalecer el sistema inmune y mejorar la recuperación, tales como: Naranjas, ricas en vitamina C (aproximadamente   " +
                                                  "\n el 89% del requerimiento diario por cada 100 g), que ayuda a fortalecer el sistema inmunológico y reducir la duración  " +
                                                  "\n de los síntomas. Espinacas, con hierro (aproximadamente el 15% del requerimiento diario por cada 100 g), que contribuye" +
                                                  "\n a la producción de glóbulos rojos y mejora la oxigenación del cuerpo. Yogur, con probióticos que favorecen la salud   " +
                                                  "\n intestinal y fortalecen el sistema inmune. También se recomienda el consumo de alimentos ricos en zinc para mejorar   " +
                                                  "\n la respuesta inmune y acelerar la recuperación. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad " +
                                                  "\n en el tratamiento adecuado, se recomienda realizar más de un diagnóstico y consultar a un médico. Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n En niñas pequeñas, la meningitis bacteriana es una infección grave que afecta las membranas que recubren el         " +
                                                  "\n cerebro y la médula espinal, pudiendo causar fiebre alta, rigidez en el cuello, vómitos y alteraciones del          " +
                                                  "\n estado mental. EJERCICIO: Se recomienda actividad física muy ligera, como movimientos suaves y ejercicios de        " +
                                                  "\n respiración para mejorar la oxigenación. También es importante evitar esfuerzos físicos que puedan generar          " +
                                                  "\n fatiga o dificultar la recuperación. Actividades como estiramientos suaves, movimientos de brazos y piernas,        " +
                                                  "\n y ejercicios de respiración profunda pueden ayudar a mejorar la circulación y reducir la rigidez muscular.          " +
                                                  "\n En algunos casos, los médicos pueden recomendar terapia física supervisada, que incluye ejercicios específicos      " +
                                                  "\n para mejorar la movilidad y prevenir complicaciones neurológicas. HIDRATACIÓN: Es fundamental el consumo diario     " +
                                                  "\n de 1.5 a 2 litros de agua para mantener el cuerpo hidratado y ayudar a reducir la fiebre y el malestar. Además      " +
                                                  "\n del agua pura, se recomienda el consumo de caldos ligeros, jugos naturales sin azúcar y infusiones suaves, que      " +
                                                  "\n pueden aportar líquidos y nutrientes esenciales. También es recomendable el consumo de bebidas con electrolitos     " +
                                                  "\n naturales, como agua de coco, para ayudar a reponer los minerales perdidos por la fiebre y sudoración. POSIBLE      " +
                                                  "\n TRATAMIENTO: La meningitis bacteriana se trata con antibióticos intravenosos, como ceftriaxona, vancomicina o       " +
                                                  "\n ampicilina, dependiendo del agente causal. En casos graves, puede requerirse hospitalización para monitoreo         " +
                                                  "\n neurológico y administración de líquidos intravenosos. También se recomienda el uso de medicamentos para reducir    " +
                                                  "\n la fiebre y aliviar el dolor, como paracetamol o ibuprofeno. En algunos casos, se pueden utilizar corticoides para  " +
                                                  "\n reducir la inflamación cerebral y prevenir complicaciones neurológicas. ALIMENTACIÓN: Se recomienda el consumo de   " +
                                                  "\n alimentos que ayuden a fortalecer el sistema inmunológico y reducir la inflamación, tales como arándanos, ricos en  " +
                                                  "\n antioxidantes y vitamina C. espinacas, que contienen hierro y vitamina A, esenciales para la recuperación. jengibre," +
                                                  "\n con propiedades antiinflamatorias y antioxidantes. cúrcuma, con curcumina, que tiene propiedades antiinflamatorias  " +
                                                  "\n y antioxidantes. yogur natural, que contiene probióticos beneficiosos para la flora intestinal. Este es solo un     " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad    " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y       " +
                                                  "\n consultar a un médico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n En niñas pequeñas, el cáncer puede manifestarse de diversas formas y requerir un tratamiento especializado           " +
                                                  "\n según el tipo y la etapa de la enfermedad. EJERCICIO: Se recomienda actividad física moderada, adaptada a la         " +
                                                  "\n capacidad de la niña, como juegos tranquilos, caminatas suaves y ejercicios de movilidad para mejorar la             " +
                                                  "\n circulación y reducir la fatiga. También es recomendable realizar ejercicios de respiración y relajación para        " +
                                                  "\n mejorar la oxigenación y reducir el estrés. Estudios han demostrado que el ejercicio puede mejorar la fuerza         " +
                                                  "\n muscular, preservar la función cardíaca, reducir la fatiga y fortalecer el sistema inmunológico en pacientes         " +
                                                  "\n con cáncer. Actividades como yoga infantil, natación suave, ejercicios de resistencia con peso ligero y movimientos  " +
                                                  "\n de coordinación pueden ser beneficiosos para mejorar la calidad de vida durante el tratamiento. Además, el ejercicio " +
                                                  "\n puede ayudar a reducir los efectos secundarios de la quimioterapia, como la pérdida de masa muscular y la fatiga     " +
                                                  "\n extrema. HIDRATACIÓN: Es esencial el consumo diario de 2 a 2.5 litros de agua para mantener el cuerpo hidratado      " +
                                                  "\n y ayudar a reducir los efectos secundarios del tratamiento. Además del agua pura, se recomienda el consumo de jugos  " +
                                                  "\n naturales ricos en antioxidantes, como jugo de naranja o toronja, que pueden fortalecer el sistema inmunológico.     " +
                                                  "\n También es beneficioso ingerir caldos ligeros, que aportan líquidos y minerales esenciales para la recuperación.     " +
                                                  "\n POSIBLE TRATAMIENTO: El cáncer en niñas se trata con quimioterapia, radioterapia o cirugía, dependiendo del tipo     " +
                                                  "\n y la etapa de la enfermedad. También se pueden utilizar terapias dirigidas, como inmunoterapia, para fortalecer      " +
                                                  "\n el sistema inmunológico y combatir las células cancerosas. En algunos casos, se recomienda el uso de medicamentos    " +
                                                  "\n para aliviar los efectos secundarios, como antieméticos para controlar las náuseas y analgésicos para reducir el     " +
                                                  "\n dolor. Además, se pueden emplear terapias complementarias, como apoyo psicológico y nutricional, para mejorar la     " +
                                                  "\n calidad de vida de la paciente. ALIMENTACIÓN: Se recomienda el consumo de alimentos que ayuden a fortalecer el       " +
                                                  "\n sistema inmunológico y reducir la inflamación, tales como arándanos, ricos en antioxidantes y vitamina C. espinacas, " +
                                                  "\n que contienen hierro y vitamina A, esenciales para la recuperación. jengibre, con propiedades antiinflamatorias y    " +
                                                  "\n antioxidantes. cúrcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes. yogur natural, que   " +
                                                  "\n contiene probióticos beneficiosos para la flora intestinal. Este es solo un diagnóstico predeterminado lógico, haberlo   " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas." +
                                                  "\n Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico para establecer el tratamiento adecuado. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                    }
                }
             if (EdadFemenino.equals("Infancia = 0-9 años")) {
            frame.setVisible(true);
        } else {
            frame.setVisible(false);
        }
            }
        public Estudio8() {
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
        Estudio8 ventanaEstudio8 = new Estudio8();
        ventanaEstudio8.crearInterfaz();
    }
}