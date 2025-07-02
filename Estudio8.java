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
         private final String edadEsperada = "Infancia = 0-9 a�os";
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
                 if(EdadFemenino.equals("Infancia = 0-9 a�os")){
                        if(EstaturaFemenino.equals("0.80-1.35 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice cerca de 60 minutos de actividad f�sica moderada a intensa diaria,    " +
                                                  "\n aunque esta cantidad puede ajustarse seg�n su edad y condici�n. Para los m�s peque�os, actividades suaves como       " +
                                                  "\n juegos activos pueden ser m�s apropiadas. HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 1.7 litros de        " +
                                                  "\n agua al d�a (seis a siete vasos de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a la recuperaci�n." +
                                                  "\n POSIBLE TRATAMIENTO: Para la gripe en ni�as, el tratamiento suele incluir medicamentos para reducir la fiebre y      " +
                                                  "\n aliviar los s�ntomas, como el paracetamol (Tempra) o el ibuprofeno. Tambi�n pueden utilizarse antivirales espec�ficos" +
                                                  "\n contra la gripe, como el oseltamivir (Tamiflu). Adem�s, es importante el descanso y la ingesta de l�quidos para      " +
                                                  "\n facilitar la recuperaci�n. ALIMENTACI�N: Se recomienda el consumo de frutas y verduras que fortalezcan el sistema    " +
                                                  "\n inmune, tales como Naranjas: ricas en vitamina C (89% del consumo diario recomendado por cada 100g), que ayuda a     " +
                                                  "\n reducir la duraci�n de los s�ntomas. Fresas: contienen antioxidantes y vitamina C (98% del consumo diario            " +
                                                  "\n recomendado por cada 100g), esenciales para la recuperaci�n. Pl�tanos: ricos en potasio (12% del consumo diario      " +
                                                  "\n recomendado por cada 100g), que puede ayudar a reemplazar los electrolitos perdidos debido a la fiebre y sudoraci�n. " +
                                                  "\n Kiwi: alto en vitamina C (154% del consumo diario recomendado por cada 100g) y potasio (10% del consumo diario       " +
                                                  "\n recomendado por cada 100g), beneficioso para el sistema inmunol�gico. Jengibre: con propiedades antiinflamatorias    " +
                                                  "\n que pueden aliviar la congesti�n y mejorar la respuesta inmune. Miel: puede ayudar a calmar la tos en ni�as mayores  " +
                                                  "\n de un a�o y tiene propiedades antimicrobianas. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas.       " +
                                                  "\n Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud,  " +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes        " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica moderada, evitando esfuerzos excesivos que         " +
                                                  "\n puedan agravar la dificultad respiratoria. Se sugiere ejercicios suaves como caminatas cortas o juegos             " +
                                                  "\n tranquilos en casa. HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 2 litros de agua al d�a (seis a ocho     " +
                                                  "\n vasos de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a fluidificar las secreciones pulmonares. " +
                                                  "\n POSIBLE TRATAMIENTO: Para la neumon�a en ni�as, el tratamiento suele incluir antibi�ticos en caso de infecci�n     " +
                                                  "\n bacteriana, como amoxicilina o azitromicina, y en casos virales, se recomienda reposo, hidrataci�n y control de    " +
                                                  "\n fiebre con paracetamol (Tempra) o ibuprofeno. En casos graves, puede requerirse hospitalizaci�n con ox�geno y      " +
                                                  "\n fisioterapia respiratoria. ALIMENTACI�N: Se recomienda el consumo de alimentos que fortalezcan el sistema inmune   " +
                                                  "\n y ayuden a la recuperaci�n, tales como Naranjas: ricas en vitamina C (89% del consumo diario recomendado por cada  " +
                                                  "\n 100g), que ayuda a mejorar la respuesta inmunol�gica. Espinacas: contienen hierro (15% del consumo diario recomendado " +
                                                  "\n por cada 100g) y vitamina A (56% del consumo diario recomendado por cada 100g), esenciales para la regeneraci�n       " +
                                                  "\n celular. Jengibre: con propiedades antiinflamatorias que pueden aliviar la congesti�n y mejorar la respuesta inmune.  " +
                                                  "\n Miel: ayuda a calmar la tos y tiene propiedades antimicrobianas. Este es solo un diagn�stico predeterminado l�gico.   " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente  " +
                                                  "\n correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por    " +
                                                  "\n su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice 60 minutos de actividad f�sica moderada al d�a, incluyendo juegos    " +
                                                  "\n activos, caminatas o deportes adaptados, lo que ayuda a mejorar la sensibilidad a la insulina y controlar los       " +
                                                  "\n niveles de glucosa. HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 2 litros de agua al d�a (seis a ocho      " +
                                                  "\n vasos de tama�o regular) para mantener una adecuada hidrataci�n y evitar fluctuaciones en los niveles de glucosa.   " +
                                                  "\n POSIBLE TRATAMIENTO: Para la diabetes infantil, el tratamiento suele incluir insulina en el caso de diabetes tipo 1,  " +
                                                  "\n administrada bajo supervisi�n m�dica. En diabetes tipo 2, se recomienda control de la alimentaci�n, ejercicio y en    " +
                                                  "\n algunos casos, metformina. Es fundamental el monitoreo regular de la glucosa en sangre. ALIMENTACI�N: Se recomienda   " +
                                                  "\n el consumo de alimentos que ayuden a estabilizar los niveles de glucosa, tales como Avena: rica en fibra soluble      " +
                                                  "\n (10% del consumo diario recomendado por cada 100g), que ayuda a regular la absorci�n de glucosa. Frutos secos:        " +
                                                  "\n contienen grasas saludables y magnesio (15% del consumo diario recomendado por cada 100g), que contribuyen al         " +
                                                  "\n metabolismo de la glucosa. Br�coli: alto en fibra y vitamina C (135% del consumo diario recomendado por cada 100g),   " +
                                                  "\n que ayuda a reducir la inflamaci�n y mejorar la respuesta a la insulina. Canela: puede ayudar a mejorar la sensibilidad  " +
                                                  "\n a la insulina y estabilizar los niveles de glucosa. Este es solo un diagn�stico predeterminado l�gico. Haberlo           " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas." +
                                                  "\n Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud,    " +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica de forma controlada y supervisada, con calentamiento         " +
                                                  "\n previo y enfriamiento posterior, evitando desencadenantes conocidos del asma (como al�rgenos, aire fr�o o contaminado)       " +
                                                  "\n y pausas si presenta s�ntomas. La cantidad de ejercicio debe ser adaptada a su capacidad y a la presencia de s�ntomas,       " +
                                                  "\n pudiendo ser cerca de 60 minutos de actividad moderada a intensa diaria en los d�as que se encuentre bien, pero siempre      " +
                                                  "\n consultando al m�dico para un plan seguro. HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 1.7 litros de agua al       " +
                                                  "\n d�a (seis a siete vasos de tama�o regular) para ayudar a mantener las v�as respiratorias hidratadas y las secreciones        " +
                                                  "\n m�s fluidas, lo que facilita la respiraci�n. POSIBLE TRATAMIENTO: Para el asma en ni�as, el tratamiento suele incluir        " +
                                                  "\n broncodilatadores de alivio r�pido (para abrir las v�as respiratorias durante un ataque, como el salbutamol, marca com�n     " +
                                                  "\n en M�xico: Ventolin o Aerolin), corticosteroides inhalados (para el control a largo plazo y reducir la inflamaci�n, como     " +
                                                  "\n la fluticasona o budesonida, marcas comunes: Flixotide o Pulmicort), y en algunos casos, modificadores de leucotrienos       " +
                                                  "\n (como el montelukast, marca com�n: Singulair). Es fundamental seguir estrictamente el plan de acci�n para el asma indicado   " +
                                                  "\n por el m�dico y usar los medicamentos preventivos regularmente. ALIMENTACI�N: Se recomienda el consumo de alimentos que      " +
                                                  "\n puedan ayudar a reducir la inflamaci�n y fortalecer el sistema inmune, tales como Pescados grasos (salm�n, at�n): ricos en   " +
                                                  "\n �cidos grasos Omega-3 (80% del consumo diario recomendado por cada 100g), que poseen propiedades antiinflamatorias que       " +
                                                  "\n pueden ayudar a reducir la inflamaci�n de las v�as respiratorias. Frutas y verduras de colores vivos (ar�ndanos, fresas,     " +
                                                  "\n espinacas, br�coli): ricas en antioxidantes como la vitamina C (90-150% del consumo diario recomendado por cada 100g) y      " +
                                                  "\n carotenoides, que pueden proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico. Jengibre: contiene compuestos   " +
                                                  "\n con efectos antiinflamatorios que podr�an ser beneficiosos para las v�as respiratorias. C�rcuma: con su componente activo,   " +
                                                  "\n la curcumina, tambi�n tiene potentes propiedades antiinflamatorias y antioxidantes. Este es solo un diagn�stico predeterminado " +
                                                  "\n l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente " +
                                                  "\n correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, " +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA. " +
                                                  "\n HIDRATACI�N: En el caso de ni�as de 0 a 9 a�os con VIH, es fundamental garantizar una hidrataci�n adecuada,                     " +
                                                  "\n recomend�ndose el consumo diario de 1.5 a 1.7 litros de agua (seis a siete vasos de tama�o regular) para mantener               " +
                                                  "\n el equilibrio h�drico y apoyar la funci�n inmunol�gica. EJERCICIO: La actividad f�sica debe ser moderada y adaptada             " +
                                                  "\n a la condici�n del paciente, evitando esfuerzos excesivos y priorizando ejercicios suaves como caminatas, juegos                " +
                                                  "\n activos y actividades recreativas que no comprometan el sistema inmunol�gico. POSIBLE TRATAMIENTO: El tratamiento para          " +
                                                  "\n el VIH en ni�os incluye terapia antirretroviral (TAR), que ayuda a controlar la carga viral y fortalecer el sistema             " +
                                                  "\n inmunol�gico. En M�xico, algunos medicamentos comunes incluyen Lamivudina, Zidovudina y Lopinavir/Ritonavir, disponibles        " +
                                                  "\n en instituciones de salud como el IMSS y el Insabi. Es crucial seguir estrictamente el tratamiento indicado por el m�dico       " +
                                                  "\n y garantizar la adherencia para evitar complicaciones. ALIMENTACI�N: Tambi�n es recomendable el consumo de alimentos que        " +
                                                  "\n fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como Frutas c�tricas (naranjas, limones,           " +
                                                  "\n toronjas), ricas en vitamina C (aportando aproximadamente el 89% del requerimiento diario por cada 100 g), que fortalece        " +
                                                  "\n el sistema inmunol�gico. Verduras de hoja verde (espinacas, acelgas, br�coli), contienen antioxidantes y hierro, esenciales     " +
                                                  "\n para la salud celular, con un aporte de 15% del hierro diario por cada 100 g. Pescados grasos (salm�n, at�n), ricos en Omega-3, " +
                                                  "\n con propiedades antiinflamatorias, aportando hasta 2.2 g de Omega-3 por cada 100 g. Frutos secos (almendras, nueces), aportan   " +
                                                  "\n vitamina E, que ayuda a la regeneraci�n celular, con un 37% del requerimiento diario por cada 28 g. Yogur natural, fuente de    " + 
                                                  "\n probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico, con un aporte de 20% de calcio por cada 100 g.        " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad" +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida          " +
                                                  "\n para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud, si la respuesta del diagn�stico  " +
                                                  "\n no le satisface del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece tu visita a la app (Mi Vida) y          " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: En el caso de ni�as de 0 a 9 a�os con gonorrea, es fundamental garantizar una hidrataci�n adecuada,       " +
                                                  "\n recomend�ndose el consumo diario de 1.5 a 1.7 litros de agua (seis a siete vasos de tama�o regular) para mantener      " +
                                                  "\n el equilibrio h�drico y apoyar la funci�n inmunol�gica. EJERCICIO: La actividad f�sica debe ser moderada y adaptada    " +
                                                  "\n a la condici�n del paciente, evitando esfuerzos excesivos y priorizando ejercicios suaves como caminatas, juegos       " +
                                                  "\n activos y actividades recreativas que no comprometan el sistema inmunol�gico. POSIBLE TRATAMIENTO: El tratamiento      " +
                                                  "\n para la gonorrea en ni�os incluye antibi�ticos como ceftriaxona, administrados en una sola dosis en casos no           " +
                                                  "\n complicados. En M�xico, estos medicamentos est�n disponibles en instituciones de salud como el IMSS y el Insabi.       " +
                                                  "\n Es crucial seguir estrictamente el tratamiento indicado por el m�dico y garantizar la adherencia para evitar           " +
                                                  "\n complicaciones. ALIMENTACI�N: Tambi�n es recomendable el consumo de alimentos que fortalezcan el sistema inmunol�gico  " +
                                                  "\n y ayuden a reducir la inflamaci�n, tales como frutas c�tricas (naranjas, limones, toronjas), ricas en vitamina C       " +
                                                  "\n (aportando aproximadamente el 89% del requerimiento diario por cada 100 g), que fortalece el sistema inmunol�gico.     " +
                                                  "\n Verduras de hoja verde (espinacas, acelgas, br�coli), contienen antioxidantes y hierro, esenciales para la salud       " +
                                                  "\n celular, con un aporte de 15% del hierro diario por cada 100 g. Pescados grasos (salm�n, at�n), ricos en Omega-3,      " +
                                                  "\n con propiedades antiinflamatorias, aportando hasta 2.2 g de Omega-3 por cada 100 g. Frutos secos (almendras, nueces),  " +
                                                  "\n aportan vitamina E, que ayuda a la regeneraci�n celular, con un 37% del requerimiento diario por cada 28 g. Yogur      " +
                                                  "\n natural, fuente de probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico, con un aporte de 20%      " +
                                                  "\n de calcio por cada 100 g. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%   " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda     " +
                                                  "\n realizar m�s de un Diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente.     " +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.   " +
                                                  "\n �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: En el caso de ni�as de 0 a 9 a�os con herpes genital, es fundamental garantizar una hidrataci�n             " +
                                                  "\n adecuada, recomend�ndose el consumo diario de 1.5 a 1.7 litros de agua (seis a siete vasos de tama�o regular)            " +
                                                  "\n para mantener el equilibrio h�drico y apoyar la funci�n inmunol�gica. EJERCICIO: La actividad f�sica debe ser            " +
                                                  "\n moderada y adaptada a la condici�n del paciente, evitando esfuerzos excesivos y priorizando ejercicios suaves            " +
                                                  "\n como caminatas, juegos activos y actividades recreativas que no comprometan el sistema inmunol�gico. POSIBLE             " +
                                                  "\n TRATAMIENTO: El tratamiento para el herpes genital en ni�os incluye antivirales como aciclovir, que ayudan a             " +
                                                  "\n reducir la duraci�n y gravedad de los s�ntomas. En M�xico, estos medicamentos est�n disponibles en instituciones         " +
                                                  "\n de salud como el IMSS y el Insabi. Es crucial seguir estrictamente el tratamiento indicado por el m�dico y               " +
                                                  "\n garantizar la adherencia para evitar complicaciones. ALIMENTACI�N: Tambi�n es recomendable el consumo de alimentos       " +
                                                  "\n que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como frutas c�tricas (naranjas,         " +
                                                  "\n limones, toronjas), ricas en vitamina C (aportando aproximadamente el 89% del requerimiento diario por cada 100 g),      " +
                                                  "\n que fortalece el sistema inmunol�gico. Verduras de hoja verde (espinacas, acelgas, br�coli), contienen antioxidantes     " +
                                                  "\n y hierro, esenciales para la salud celular, con un aporte de 15% del hierro diario por cada 100 g. Pescados grasos       " +
                                                  "\n (salm�n, at�n), ricos en Omega-3, con propiedades antiinflamatorias, aportando hasta 2.2 g de Omega-3 por cada 100 g.    " +
                                                  "\n Frutos secos (almendras, nueces), aportan vitamina E, que ayuda a la regeneraci�n celular, con un 37% del requerimiento  " +
                                                  "\n diario por cada 28 g. Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico, " +
                                                  "\n con un aporte de 20% de calcio por cada 100 g. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado     " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para      " +
                                                  "\n ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado " +
                                                  "\n del paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a  " +
                                                  "\n su m�dico. �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: En el caso de ni�as de 0 a 9 a�os con s�filis, es fundamental garantizar una hidrataci�n adecuada,          " +
                                                  "\n recomend�ndose el consumo diario de 1.5 a 1.7 litros de agua (seis a siete vasos de tama�o regular) para mantener        " +
                                                  "\n el equilibrio h�drico y apoyar la funci�n inmunol�gica. EJERCICIO: La actividad f�sica debe ser moderada y adaptada      " +
                                                  "\n a la condici�n del paciente, evitando esfuerzos excesivos y priorizando ejercicios suaves como caminatas, juegos         " +
                                                  "\n activos y actividades recreativas que no comprometan el sistema inmunol�gico. POSIBLE TRATAMIENTO: El tratamiento        " +
                                                  "\n para la s�filis en ni�os incluye penicilina, que es el medicamento de primera l�nea. En M�xico, estos medicamentos       " +
                                                  "\n est�n disponibles en instituciones de salud como el IMSS y el Insabi. Es crucial seguir estrictamente el tratamiento     " +
                                                  "\n indicado por el m�dico y garantizar la adherencia para evitar complicaciones. ALIMENTACI�N: Tambi�n es recomendable      " +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como frutas     " +
                                                  "\n c�tricas (naranjas, limones, toronjas), ricas en vitamina C (aportando aproximadamente el 89% del requerimiento diario   " +
                                                  "\n por cada 100 g), que fortalece el sistema inmunol�gico. Verduras de hoja verde (espinacas, acelgas, br�coli), contienen  " +
                                                  "\n antioxidantes y hierro, esenciales para la salud celular, con un aporte de 15% del hierro diario por cada 100 g.         " +
                                                  "\n Pescados grasos (salm�n, at�n), ricos en Omega-3, con propiedades antiinflamatorias, aportando hasta 2.2 g de Omega-3    " +
                                                  "\n por cada 100 g. Frutos secos (almendras, nueces), aportan vitamina E, que ayuda a la regeneraci�n celular, con un 37%    " +
                                                  "\n del requerimiento diario por cada 28 g. Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal y el     " +
                                                  "\n sistema inmunol�gico, con un aporte de 20% de calcio por cada 100 g. Este es solo un diagn�stico predeterminado l�gico,  " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente   " +
                                                  "\n correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mayor seguridad en el      " +
                                                  "\n tratamiento adecuado del paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se    " +
                                                  "\n recomienda consultar a su m�dico. �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tama�o regular)          " +
                                                  "\n para mantener las v�as respiratorias h�medas y ayudar a eliminar toxinas, lo que es fundamental en el proceso         " +
                                                  "\n de recuperaci�n. EJERCICIO: La actividad f�sica debe ser ligera y progresiva, evitando esfuerzos excesivos,           " +
                                                  "\n caminar al aire libre y realizar ejercicios de respiraci�n pueden ayudar a fortalecer los pulmones sin                " +
                                                  "\n sobrecargarlos. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la tuberculosis en ni�os incluye una combinaci�n    " +
                                                  "\n de antibi�ticos como isoniazida, rifampicina, pirazinamida y etambutol, administrados durante un per�odo de seis      " +
                                                  "\n meses en casos de tuberculosis sensible a los medicamentos, en M�xico algunas marcas reconocidas que contienen        " +
                                                  "\n estos f�rmacos incluyen Rimactane (rifampicina) y Isozid (isoniazida), en casos de tuberculosis resistente pueden     " +
                                                  "\n utilizarse medicamentos como bedaquilina y delamanid, bajo estricta supervisi�n m�dica. ALIMENTACI�N: Para fortalecer " +
                                                  "\n el sistema inmunol�gico y apoyar la recuperaci�n, se recomienda el consumo de alimentos ricos en vitamina C, hierro   " +
                                                  "\n y prote�nas. Naranjas y fresas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa    " +
                                                  "\n hasta el 100% de la ingesta diaria recomendada, fortaleciendo el sistema inmunol�gico y ayudando a reducir la         " +
                                                  "\n inflamaci�n. Espinacas y lentejas: Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25% y 40%  " +
                                                  "\n de la ingesta diaria recomendada, lo que ayuda a mejorar la oxigenaci�n celular y reducir el cansancio. Carnes magras " +
                                                  "\n y huevos: Son una fuente importante de prote�nas, proporcionando entre 20 y 25 g por cada 100 g, lo que equivale al   " +
                                                  "\n 40-50% de la recomendaci�n diaria, esenciales para la regeneraci�n celular y el fortalecimiento muscular. Este es     " +
                                                  "\n solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad " +
                                                  "\n ni que las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar m�s de un diagn�stico    " +
                                                  "\n y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tama�o regular)             " +
                                                  "\n para mantener la lubricaci�n de las articulaciones y reducir la inflamaci�n, lo que es fundamental en el manejo          " +
                                                  "\n de la enfermedad. EJERCICIO: La actividad f�sica debe ser de bajo impacto y adaptada a la movilidad del ni�o,            " +
                                                  "\n ejercicios como nataci�n, bicicleta y yoga pueden ayudar a fortalecer los m�sculos sin sobrecargar las articulaciones,   " +
                                                  "\n adem�s se recomienda realizar movimientos de estiramiento y movilidad articular diariamente para mejorar la              " +
                                                  "\n flexibilidad. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la artritis juvenil incluye antiinflamatorios no         " +
                                                  "\n esteroides (AINEs) como ibuprofeno y naproxeno, adem�s de f�rmacos modificadores de la enfermedad como metotrexato       " +
                                                  "\n y sulfasalazina, en M�xico algunas marcas reconocidas incluyen Tempra (ibuprofeno) y Arava (leflunomida), en casos       " +
                                                  "\n m�s severos pueden utilizarse biol�gicos como etanercept y adalimumab, bajo estricta supervisi�n m�dica. ALIMENTACI�N:   " +
                                                  "\n Para reducir la inflamaci�n y fortalecer las articulaciones, se recomienda el consumo de alimentos ricos en omega-3,     " +
                                                  "\n antioxidantes y vitamina D. Salm�n y ch�a: Contienen aproximadamente 2-4 g de omega-3 por cada 100 g, lo que ayuda a     " +
                                                  "\n reducir la inflamaci�n articular. Fresas y ar�ndanos: Aportan 50-90 mg de vitamina C por cada 100 g, cubriendo hasta     " +
                                                  "\n el 100% de la ingesta diaria recomendada, fortaleciendo el sistema inmunol�gico. L�cteos y huevos: Son una fuente        " +
                                                  "\n importante de vitamina D, proporcionando entre 10 y 20% de la recomendaci�n diaria, esencial para la salud �sea y        " +
                                                  "\n articular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente    " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar    " +
                                                  "\n m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tama�o regular)               " +
                                                  "\n para mantener las v�as respiratorias h�medas y ayudar a eliminar toxinas, lo que es fundamental en el proceso              " +
                                                  "\n de recuperaci�n. EJERCICIO: La actividad f�sica debe ser muy ligera y supervisada, evitando esfuerzos excesivos            " +
                                                  "\n que puedan desencadenar episodios de tos intensa, ejercicios de respiraci�n profunda y caminatas suaves pueden             " +
                                                  "\n ser beneficiosos para mejorar la capacidad pulmonar. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la tosferina        " +
                                                  "\n en ni�os incluye antibi�ticos como azitromicina, claritromicina y eritromicina, administrados durante 5 a 7 d�as,          " +
                                                  "\n en M�xico algunas marcas reconocidas incluyen Zithromax (azitromicina) y Klacid (claritromicina), adem�s se recomienda     " +
                                                  "\n el uso de broncodilatadores en casos de dificultad respiratoria bajo estricta supervisi�n m�dica. ALIMENTACI�N: Para       " +
                                                  "\n fortalecer el sistema inmunol�gico y apoyar la recuperaci�n, se recomienda el consumo de alimentos ricos en vitamina C,    " +
                                                  "\n antioxidantes y zinc. Kiwi y naranjas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa  " +
                                                  "\n hasta el 100% de la ingesta diaria recomendada, fortaleciendo el sistema inmunol�gico. Jengibre y c�rcuma: Poseen          " +
                                                  "\n propiedades antiinflamatorias y antioxidantes, ayudando a reducir la irritaci�n de las v�as respiratorias. Almendras       " +
                                                  "\n y semillas de calabaza: Aportan 10-15 mg de zinc por cada 100 g, cubriendo hasta el 100% de la recomendaci�n diaria,       " +
                                                  "\n esencial para la funci�n inmunol�gica. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza  " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se  " +
                                                  "\n recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y  " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tama�o regular)            " +
                                                  "\n para mantener la hidrataci�n y reducir la fiebre, lo que es fundamental en el proceso de recuperaci�n. EJERCICIO:       " +
                                                  "\n La actividad f�sica debe ser m�nima y de reposo, evitando esfuerzos f�sicos que puedan agravar la inflamaci�n de        " +
                                                  "\n las gl�ndulas salivales, se recomienda descanso absoluto hasta la recuperaci�n completa. POSIBLE TRATAMIENTO: El        " +
                                                  "\n tratamiento est�ndar para las paperas en ni�os es sintom�tico, incluyendo analg�sicos como paracetamol e ibuprofeno     " +
                                                  "\n para reducir el dolor y la fiebre, en M�xico algunas marcas reconocidas incluyen Tempra (paracetamol) y Advil           " +
                                                  "\n (ibuprofeno), adem�s se recomienda reposo y aplicaci�n de compresas fr�as en la zona inflamada. ALIMENTACI�N: Para      " +
                                                  "\n fortalecer el sistema inmunol�gico y apoyar la recuperaci�n, se recomienda el consumo de alimentos ricos en vitamina C, " +
                                                  "\n antioxidantes y prote�nas. Mango y espinacas: Contienen aproximadamente 50-80 mg de vitamina C por cada 100 g,          " +
                                                  "\n lo que representa hasta el 90% de la ingesta diaria recomendada, fortaleciendo el sistema inmunol�gico. Caldo de        " +
                                                  "\n pollo y yogur: Son fuentes de prote�nas y probi�ticos, esenciales para la recuperaci�n y el fortalecimiento del         " +
                                                  "\n sistema inmunol�gico. Frutas y verduras suaves: Como pl�tanos y zanahorias, que son f�ciles de consumir y aportan       " +
                                                  "\n fibra y antioxidantes para mejorar la digesti�n y la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico,   " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente  " +
                                                  "\n correctas, para mayor seguridad se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes    " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n En ni�as de 0 a 9 a�os, el virus del Zika puede causar fiebre, erupciones cut�neas y malestar general, aumentando             " +
                                                  "\n el riesgo de complicaciones neurol�gicas, por lo que es fundamental un diagn�stico oportuno y tratamiento adecuado.           " +
                                                  "\n HIDRATACI�N: Se recomienda que la paciente mantenga una hidrataci�n adecuada, consumiendo al menos 1.5 a 2 litros             " +
                                                  "\n de agua al d�a (aproximadamente seis a ocho vasos de tama�o regular) para favorecer la eliminaci�n de toxinas y               " +
                                                  "\n mantener el sistema inmunol�gico fuerte. EJERCICIO: En cuanto a la actividad f�sica, es recomendable realizar ejercicios      " +
                                                  "\n suaves como juegos al aire libre, caminatas cortas o nataci�n, siempre bajo supervisi�n m�dica para evitar complicaciones     " +
                                                  "\n y fortalecer la funci�n cardiovascular. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral espec�fico para el Zika,      " +
                                                  "\n por lo que el manejo es sintom�tico. Se recomienda el uso de analg�sicos como paracetamol para aliviar la fiebre y el         " +
                                                  "\n malestar, antihistam�nicos para reducir el prurito y reposo adecuado. Es fundamental evitar el uso de aspirina y otros        " +
                                                  "\n antiinflamatorios no esteroides sin supervisi�n m�dica. ALIMENTACI�N RECOMENDADA: Se recomienda el consumo de alimentos       " +
                                                  "\n que fortalezcan el sistema inmunol�gico y ayuden a combatir la infecci�n, tales como: Frutas c�tricas (naranjas,              " +
                                                  "\n limones, toronjas): Ricas en vitamina C, que fortalece el sistema inmunol�gico y ayuda a reducir la duraci�n de               " +
                                                  "\n infecciones, aportando aproximadamente el 89% del requerimiento diario por cada 100 gramos. Jengibre: Contiene                " +
                                                  "\n compuestos con efectos antiinflamatorios que pueden ayudar a reducir la fiebre y el malestar general. Verduras                " +
                                                  "\n de hoja verde (espinaca, acelga, br�coli): Ricas en antioxidantes y vitaminas esenciales para la recuperaci�n,                " +
                                                  "\n como la vitamina A, que contribuye a la regeneraci�n celular y aporta cerca del 56% del requerimiento diario por              " +
                                                  "\n cada 100 gramos de espinaca. Omega-3 (salm�n, at�n, ch�a): Con propiedades antiinflamatorias que pueden ayudar a              " +
                                                  "\n reducir la inflamaci�n y mejorar la respuesta inmunol�gica, aportando aproximadamente el 50% del requerimiento                " +
                                                  "\n diario por cada 100 gramos de salm�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no                " +
                                                  "\n garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para              " +
                                                  "\n mayor seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento          " +
                                                  "\n adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n En ni�as de 0 a 9 a�os, el rotavirus puede causar deshidrataci�n severa y complicaciones gastrointestinales,          " +
                                                  "\n por lo que es fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que la           " +
                                                  "\n paciente mantenga una hidrataci�n adecuada, consumiendo al menos 2 litros de agua al d�a (aproximadamente             " +
                                                  "\n ocho vasos de tama�o regular) para compensar la p�rdida de l�quidos y evitar la deshidrataci�n. EJERCICIO:            " +
                                                  "\n En cuanto a la actividad f�sica, es recomendable realizar actividades suaves como juegos tranquilos, caminatas        " +
                                                  "\n cortas o ejercicios de movilidad, siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer la          " +
                                                  "\n funci�n digestiva. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral espec�fico para el rotavirus, por lo       " +
                                                  "\n que el manejo es sintom�tico. Se recomienda el uso de soluciones de rehidrataci�n oral para evitar la deshidrataci�n, " +
                                                  "\n as� como una dieta blanda y de f�cil digesti�n. En casos graves, puede requerirse hospitalizaci�n para administraci�n " +
                                                  "\n de l�quidos intravenosos. ALIMENTACI�N RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema  " +
                                                  "\n digestivo y ayuden a combatir la infecci�n, tales como: Pl�tano: Rico en potasio, que ayuda a reemplazar los          " +
                                                  "\n electrolitos perdidos debido a la diarrea, aportando aproximadamente el 12% del requerimiento diario por cada         " +
                                                  "\n 100 gramos. Yogur natural: Contiene probi�ticos, que pueden ayudar a restaurar la flora intestinal y mejorar          " +
                                                  "\n la digesti�n, proporcionando cerca del 20% del requerimiento diario de calcio por cada porci�n de 150 gramos.         " +
                                                  "\n Arroz blanco: Fuente de carbohidratos de f�cil digesti�n que ayuda a estabilizar el sistema digestivo y aporta        " +
                                                  "\n energ�a sin irritar el est�mago. Zanahoria: Rica en vitamina A, que contribuye a la regeneraci�n celular y fortalece  " +
                                                  "\n la mucosa intestinal, aportando cerca del 56% del requerimiento diario por cada 100 gramos. Este es solo un diagn�stico " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las         " +
                                                  "\n respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar m�s de un diagn�stico y consultar " +
                                                  "\n a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que  " +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n En ni�as de 0 a 9 a�os, la listeriosis puede causar infecciones graves y afectar el sistema nervioso, por              " +
                                                  "\n lo que es fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que la                " +
                                                  "\n paciente mantenga una hidrataci�n adecuada, consumiendo al menos 2 litros de agua al d�a (aproximadamente              " +
                                                  "\n ocho vasos de tama�o regular) para favorecer la eliminaci�n de toxinas y mantener el sistema inmunol�gico              " +
                                                  "\n fuerte. EJERCICIO: En cuanto a la actividad f�sica, es recomendable realizar actividades suaves como juegos            " +
                                                  "\n tranquilos, caminatas cortas o ejercicios de movilidad, siempre bajo supervisi�n m�dica para evitar complicaciones     " +
                                                  "\n y fortalecer la funci�n inmunol�gica. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la listeriosis incluye         " +
                                                  "\n antibi�ticos como ampicilina y gentamicina, administrados bajo prescripci�n m�dica. En casos graves, puede             " +
                                                  "\n requerirse hospitalizaci�n para administraci�n de antibi�ticos intravenosos. ALIMENTACI�N RECOMENDADA: Se recomienda   " +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a combatir la infecci�n, tales como: Ajo:     " +
                                                  "\n Posee propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene alicina, un compuesto  " +
                                                  "\n con efectos antibacterianos. Frutas c�tricas (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece el      " +
                                                  "\n sistema inmunol�gico y ayuda a reducir la duraci�n de infecciones, aportando aproximadamente el 89% del requerimiento  " +
                                                  "\n diario por cada 100 gramos. Yogur natural: Contiene probi�ticos, que pueden ayudar a mantener el equilibrio de la      " +
                                                  "\n flora bacteriana y mejorar la respuesta inmunol�gica, proporcionando cerca del 20% del requerimiento diario de calcio  " +
                                                  "\n por cada porci�n de 150 gramos. Verduras de hoja verde (espinaca, acelga, br�coli): Ricas en antioxidantes y vitaminas " +
                                                  "\n esenciales para la recuperaci�n, como la vitamina A, que contribuye a la regeneraci�n celular y aporta cerca del 56%   " +
                                                  "\n del requerimiento diario por cada 100 gramos de espinaca. Este es solo un diagn�stico predeterminado l�gico, haberlo   " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas.  " +
                                                  "\n Para mayor seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento  " +
                                                  "\n adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n La shigelosis es una infecci�n bacteriana que afecta el sistema digestivo, causando diarrea severa, fiebre y                 " +
                                                  "\n deshidrataci�n. HIDRATACI�N: Se recomienda que la paciente mantenga una hidrataci�n adecuada, consumiendo al                 " +
                                                  "\n menos 2 litros de agua al d�a para compensar la p�rdida de l�quidos y evitar la deshidrataci�n. Adem�s, es                   " +
                                                  "\n recomendable el consumo de sueros de rehidrataci�n oral para reponer electrolitos esenciales como sodio, potasio             " +
                                                  "\n y cloro, los cuales se pierden con la diarrea. Tambi�n se pueden incluir caldos ligeros y agua de coco, que aportan          " +
                                                  "\n minerales esenciales para la recuperaci�n. EJERCICIO: Se recomienda realizar actividades suaves como juegos tranquilos,      " +
                                                  "\n caminatas cortas o ejercicios de movilidad, siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer la       " +
                                                  "\n funci�n digestiva. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la shigelosis incluye antibi�ticos como azitromicina,   " +
                                                  "\n ciprofloxacina o ceftriaxona, administrados bajo prescripci�n m�dica. Tambi�n se recomienda el uso de soluciones de          " +
                                                  "\n rehidrataci�n oral para evitar la deshidrataci�n. ALIMENTACI�N RECOMENDADA: Se recomienda el consumo de alimentos que        " +
                                                  "\n fortalezcan el sistema digestivo y ayuden a combatir la infecci�n, tales como: Pl�tano: Rico en potasio, que ayuda a         " +
                                                  "\n reemplazar los electrolitos perdidos debido a la diarrea. Yogur natural: Contiene probi�ticos, que pueden ayudar a           " +
                                                  "\n restaurar la flora intestinal y mejorar la digesti�n. Arroz blanco: Fuente de carbohidratos de f�cil digesti�n que           " +
                                                  "\n ayuda a estabilizar el sistema digestivo y aporta energ�a sin irritar el est�mago. Zanahoria: Rica en vitamina A, que        " +
                                                  "\n contribuye a la regeneraci�n celular y fortalece la mucosa intestinal. Este es solo un diagn�stico predeterminado l�gico,    " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente       " +
                                                  "\n correctas. Para mayor seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer        " +
                                                  "\n el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n La EPOC es una afecci�n respiratoria que dificulta la respiraci�n y puede causar fatiga extrema. HIDRATACI�N: Se          " +
                                                  "\n recomienda que la paciente mantenga una hidrataci�n adecuada, consumiendo al menos 2.5 litros de agua al d�a para         " +
                                                  "\n favorecer la eliminaci�n de toxinas y mantener las v�as respiratorias hidratadas. Adem�s, se recomienda el consumo        " +
                                                  "\n de l�quidos tibios como infusiones de jengibre o manzanilla, que pueden ayudar a reducir la inflamaci�n de las v�as       " +
                                                  "\n respiratorias. Tambi�n es importante evitar bebidas azucaradas y gaseosas, ya que pueden aumentar la producci�n de        " +
                                                  "\n moco y dificultar la respiraci�n. EJERCICIO: Se recomienda realizar ejercicios de bajo impacto, como caminatas de 30      " +
                                                  "\n minutos diarios, nataci�n o yoga, siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer la funci�n      " +
                                                  "\n pulmonar. Tambi�n es importante realizar ejercicios de respiraci�n profunda para mejorar la capacidad pulmonar y reducir  " +
                                                  "\n la sensaci�n de falta de aire. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la EPOC incluye broncodilatadores de     " +
                                                  "\n alivio r�pido, como el salbutamol, corticosteroides inhalados para el control a largo plazo, como la fluticasona, y en    " +
                                                  "\n algunos casos, terapia con ox�geno suplementario. Es fundamental seguir estrictamente el plan de acci�n para la EPOC      " +
                                                  "\n indicado por el m�dico y usar los medicamentos preventivos regularmente. ALIMENTACI�N RECOMENDADA: Se recomienda el consumo  " +
                                                  "\n de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como: Pescados grasos (salm�n, " +
                                                  "\n at�n): Ricos en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias y pueden ayudar a reducir la inflamaci�n de  " +
                                                  "\n las v�as respiratorias. Frutas y verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli): Ricas en antioxidantes   " +
                                                  "\n como la vitamina C y carotenoides, que pueden proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico. Jengibre:  " +
                                                  "\n Contiene compuestos con efectos antiinflamatorios que podr�an ser beneficiosos para las v�as respiratorias, ayudando a       " +
                                                  "\n reducir la inflamaci�n y mejorar la circulaci�n sangu�nea. C�rcuma: Con su componente activo, la curcumina, tambi�n tiene    " +
                                                  "\n potentes propiedades antiinflamatorias y antioxidantes, contribuyendo a la reducci�n de la inflamaci�n en los pulmones.      " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta   " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar m�s de un   " +
                                                  "\n diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n La clamidia es una infecci�n bacteriana que puede afectar el sistema urinario y reproductivo, causando molestias            " +
                                                  "\n abdominales y fiebre. HIDRATACI�N: Se recomienda que la paciente mantenga una hidrataci�n adecuada, consumiendo             " +
                                                  "\n al menos 2 litros de agua al d�a para favorecer la eliminaci�n de toxinas y mantener el sistema inmunol�gico fuerte.        " +
                                                  "\n Adem�s, se recomienda el consumo de jugos naturales sin az�car, como jugo de ar�ndano, que puede ayudar a prevenir          " +
                                                  "\n infecciones urinarias recurrentes. Tambi�n es importante evitar el consumo excesivo de cafe�na y bebidas alcoh�licas,       " +
                                                  "\n ya que pueden irritar el tracto urinario. EJERCICIO: Se recomienda realizar actividades suaves como juegos tranquilos,      " +
                                                  "\n caminatas cortas o ejercicios de movilidad, siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer la      " +
                                                  "\n funci�n inmunol�gica. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la clamidia incluye antibi�ticos como               " +
                                                  "\n azitromicina, doxiciclina o amoxicilina, administrados bajo prescripci�n m�dica. Es fundamental seguir estrictamente el     " +
                                                  "\n tratamiento indicado por el m�dico y evitar el contacto con posibles fuentes de infecci�n. ALIMENTACI�N RECOMENDADA: Se     " +
                                                  "\n recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a combatir la infecci�n, tales como:    " +
                                                  "\n Ajo: Posee propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene alicina, un compuesto  " +
                                                  "\n con efectos antibacterianos. Frutas c�tricas (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece el sistema   " +
                                                  "\n inmunol�gico y ayuda a reducir la duraci�n de infecciones. Yogur natural: Contiene probi�ticos, que pueden ayudar a         " +
                                                  "\n mantener el equilibrio de la flora bacteriana y mejorar la respuesta inmunol�gica. Verduras de hoja verde (espinaca,        " +
                                                  "\n acelga, br�coli): Ricas en antioxidantes y vitaminas esenciales para la recuperaci�n, como la vitamina A, que contribuye    " +
                                                  "\n a la regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%       " +
                                                  "\n que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad, se          " +
                                                  "\n recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n En ni�as peque�as, la meningitis bacteriana puede ser grave y requerir atenci�n m�dica urgente debido a la                  " +
                                                  "\n inflamaci�n de las membranas que recubren el cerebro y la m�dula espinal. EJERCICIO: Se recomienda actividad                " +
                                                  "\n f�sica ligera, como caminatas cortas y juegos tranquilos, evitando esfuerzos excesivos que puedan generar fatiga.           " +
                                                  "\n Tambi�n es importante realizar ejercicios de movilidad para mantener la flexibilidad y evitar la rigidez muscular.          " +
                                                  "\n HIDRATACI�N: Es fundamental el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de agua de tama�o regular)       " +
                                                  "\n para mantener el cuerpo hidratado y ayudar a reducir la fiebre y el malestar. Adem�s del agua pura, se recomienda el        " +
                                                  "\n consumo de caldos ligeros, jugos naturales sin az�car y infusiones suaves, que pueden aportar l�quidos y nutrientes         " +
                                                  "\n esenciales. POSIBLE TRATAMIENTO: La meningitis bacteriana se trata con antibi�ticos intravenosos, como ceftriaxona,         " +
                                                  "\n vancomicina o ampicilina, dependiendo del agente causal. En casos graves, puede requerirse hospitalizaci�n para monitoreo   " +
                                                  "\n neurol�gico y administraci�n de l�quidos intravenosos. Tambi�n se recomienda el uso de medicamentos para reducir la         " +
                                                  "\n fiebre y aliviar el dolor, como paracetamol o ibuprofeno. ALIMENTACI�N: Se recomienda el consumo de alimentos que           " +
                                                  "\n ayuden a fortalecer el sistema inmunol�gico y reducir la inflamaci�n, tales como ar�ndanos, ricos en antioxidantes          " +
                                                  "\n y vitamina C, aportando 25% de la ingesta diaria recomendada. espinacas, que contienen hierro y vitamina A, esenciales      " +
                                                  "\n para la recuperaci�n, proporcionando 15% de la ingesta diaria recomendada de hierro. jengibre, con propiedades              " +
                                                  "\n antiinflamatorias y antioxidantes, aportando 5% de la ingesta diaria recomendada de vitamina C. c�rcuma, con curcumina,     " +
                                                  "\n que tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes." +
                                                  "\n yogur natural, que contiene probi�ticos beneficiosos para la flora intestinal, proporcionando 15% de la ingesta diaria     " +
                                                  "\n recomendada de calcio. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la   " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s   " +
                                                  "\n de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la  " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n En ni�as peque�as, el c�ncer puede manifestarse de diversas formas y requerir un tratamiento especializado seg�n el tipo    " +
                                                  "\n y la etapa de la enfermedad. EJERCICIO: Se recomienda actividad f�sica moderada, adaptada a la capacidad de la ni�a, como   " +
                                                  "\n juegos tranquilos, caminatas suaves y ejercicios de movilidad para mejorar la circulaci�n y reducir la fatiga. Tambi�n es   " +
                                                  "\n recomendable realizar ejercicios de respiraci�n y relajaci�n para mejorar la oxigenaci�n y reducir el estr�s. HIDRATACI�N:  " +
                                                  "\n Es esencial el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tama�o regular) para mantener el      " +
                                                  "\n cuerpo hidratado y ayudar a reducir los efectos secundarios del tratamiento. Adem�s del agua pura, se recomienda el consumo " +
                                                  "\n de jugos naturales ricos en antioxidantes, como jugo de naranja o toronja, que pueden fortalecer el sistema inmunol�gico.   " +
                                                  "\n Tambi�n es beneficioso ingerir caldos ligeros, que aportan l�quidos y minerales esenciales para la recuperaci�n. POSIBLE    " +
                                                  "\n TRATAMIENTO: El c�ncer en ni�as se trata con quimioterapia, radioterapia o cirug�a, dependiendo del tipo y la etapa de la   " +
                                                  "\n enfermedad. Tambi�n se pueden utilizar terapias dirigidas, como inmunoterapia, para fortalecer el sistema inmunol�gico y    " +
                                                  "\n combatir las c�lulas cancerosas. En algunos casos, se recomienda el uso de medicamentos para aliviar los efectos secundarios," +
                                                  "\n como antiem�ticos para controlar las n�useas y analg�sicos para reducir el dolor. ALIMENTACI�N: Se recomienda el consumo     " +
                                                  "\n de alimentos que ayuden a fortalecer el sistema inmunol�gico y reducir la inflamaci�n, tales como ar�ndanos, ricos en        " +
                                                  "\n antioxidantes y vitamina C, aportando 25% de la ingesta diaria recomendada. espinacas, que contienen hierro y vitamina A,    " +
                                                  "\n esenciales para la recuperaci�n, proporcionando 15% de la ingesta diaria recomendada de hierro. jengibre, con propiedades    " +
                                                  "\n antiinflamatorias y antioxidantes, aportando 5% de la ingesta diaria recomendada de vitamina C. c�rcuma, con curcumina,      " +
                                                  "\n que tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes." +
                                                  "\n yogur natural, que contiene probi�ticos beneficiosos para la flora intestinal, proporcionando 15% de la ingesta diaria    " +
                                                  "\n recomendada de calcio. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la  " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s  " +
                                                  "\n de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a    " +
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.35-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n En ni�as peque�as, la influenza puede causar fiebre alta, tos, dolor muscular y fatiga, y en algunos casos puede         " +
                                                  "\n derivar en complicaciones como neumon�a. EJERCICIO: Se recomienda actividad f�sica ligera, como juegos tranquilos        " +
                                                  "\n y caminatas cortas, evitando esfuerzos excesivos que puedan generar fatiga. Tambi�n es importante realizar ejercicios    " +
                                                  "\n de movilidad para mantener la flexibilidad y evitar la rigidez muscular. HIDRATACI�N: Es fundamental el consumo diario   " +
                                                  "\n de 1.5 a 2 litros de agua (seis a ocho vasos de agua de tama�o regular) para mantener el cuerpo hidratado y ayudar a     " +
                                                  "\n reducir la fiebre y el malestar. Adem�s del agua pura, se recomienda el consumo de caldos ligeros, jugos naturales sin   " +
                                                  "\n az�car y infusiones suaves, que pueden aportar l�quidos y nutrientes esenciales. Tambi�n es recomendable el consumo de   " +
                                                  "\n bebidas con electrolitos naturales, como agua de coco, para ayudar a reponer los minerales perdidos por la fiebre y      " +
                                                  "\n sudoraci�n. POSIBLE TRATAMIENTO: La influenza se trata con medidas de soporte, como descanso adecuado, hidrataci�n y     " +
                                                  "\n medicamentos para aliviar los s�ntomas, como paracetamol o ibuprofeno. En casos graves o de alto riesgo, el m�dico puede " +
                                                  "\n prescribir antivirales, como oseltamivir, para reducir la duraci�n y gravedad de la enfermedad. Tambi�n es importante    " +
                                                  "\n evitar el uso de medicamentos que contengan �cido acetilsalic�lico, como la aspirina, debido al riesgo de desarrollar el " +
                                                  "\n s�ndrome de Reye en ni�os. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema        " +
                                                  "\n inmunol�gico y reducir la inflamaci�n, tales como naranjas, ricas en vitamina C, que fortalecen el sistema inmunol�gico, " +
                                                  "\n aportando 90 mg por cada 100 g de fruta, lo que representa 100% de la ingesta diaria recomendada. fresas, ricas en       " +
                                                  "\n vitamina C y antioxidantes, que ayudan a combatir infecciones, proporcionando 60 mg por cada 100 g de fruta. pl�tanos,   " +
                                                  "\n ricos en potasio, que pueden ayudar a reemplazar los electrolitos perdidos debido a la fiebre y sudoraci�n, aportando 10%" +
                                                  "\n de la ingesta diaria recomendada de potasio. kiwi, rico en vitamina C y potasio, que fortalece el sistema inmunol�gico y " +
                                                  "\n ayuda a la recuperaci�n, proporcionando 85 mg de vitamina C por cada 100 g. Este es solo un diagn�stico predeterminado   " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente" +
                                                  "\n correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento" +
                                                  "\n adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n En ni�as peque�as, la neumon�a puede causar fiebre alta, tos persistente, dificultad para respirar y fatiga               " +
                                                  "\n extrema, y puede requerir tratamiento m�dico urgente. EJERCICIO: Se recomienda actividad f�sica muy ligera,               " +
                                                  "\n como movimientos suaves y ejercicios de respiraci�n para mejorar la oxigenaci�n. Tambi�n es importante evitar             " +
                                                  "\n esfuerzos f�sicos que puedan generar fatiga o dificultar la respiraci�n. HIDRATACI�N: Es esencial el consumo              " +
                                                  "\n diario de 1.5 a 2 litros de agua (seis a ocho vasos de agua de tama�o regular) para mantener el cuerpo hidratado          " +
                                                  "\n y ayudar a reducir la fiebre y el malestar. Adem�s del agua pura, se recomienda el consumo de infusiones suaves,          " +
                                                  "\n jugos naturales sin az�car y caldos ligeros, que pueden aportar l�quidos y nutrientes esenciales. Tambi�n es              " +
                                                  "\n recomendable el consumo de bebidas con electrolitos naturales, como agua de coco, para ayudar a reponer los minerales     " +
                                                  "\n perdidos por la fiebre y sudoraci�n. POSIBLE TRATAMIENTO: La neumon�a se trata con antibi�ticos, como amoxicilina         " +
                                                  "\n o azitromicina, en caso de infecci�n bacteriana. Tambi�n se recomienda el uso de medicamentos para reducir la fiebre      " +
                                                  "\n y aliviar el dolor, como paracetamol o ibuprofeno. En casos graves, puede requerirse hospitalizaci�n para monitoreo       " +
                                                  "\n respiratorio y administraci�n de ox�geno. Tambi�n es importante mantener una buena higiene respiratoria y evitar la       " +
                                                  "\n exposici�n a contaminantes ambientales que puedan agravar la condici�n. ALIMENTACI�N: Se recomienda el consumo de         " +
                                                  "\n alimentos que ayuden a fortalecer el sistema inmunol�gico y reducir la inflamaci�n, tales como ajo, que contiene          " +
                                                  "\n alicina con propiedades antimicrobianas, aportando 5% de la ingesta diaria recomendada de antioxidantes. jengibre,        " +
                                                  "\n con efectos antiinflamatorios y antioxidantes, aportando 5% de la ingesta diaria recomendada de vitamina C. c�rcuma,      " +
                                                  "\n con curcumina, que tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada     " +
                                                  "\n de antioxidantes. frutas c�tricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalecen el sistema inmunol�gico,  " +
                                                  "\n aportando 90 mg por cada 100 g de fruta, lo que representa 100% de la ingesta diaria recomendada. yogur natural, que contiene  " +
                                                  "\n probi�ticos beneficiosos para la flora intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio. Este es      " +
                                                  "\n solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad       " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a      " +
                                                  "\n un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n En ni�as peque�as, la diabetes puede afectar el metabolismo del az�car y requerir un control estricto para                   " +
                                                  "\n evitar complicaciones. EJERCICIO: Se recomienda actividad f�sica moderada, como juegos tranquilos, caminatas                 " +
                                                  "\n suaves y ejercicios de movilidad para mejorar la circulaci�n y reducir la fatiga. Tambi�n es recomendable realizar           " +
                                                  "\n ejercicios de respiraci�n y relajaci�n para mejorar la oxigenaci�n y reducir el estr�s. HIDRATACI�N: Es esencial             " +
                                                  "\n el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tama�o regular) para mantener el cuerpo            " +
                                                  "\n hidratado y ayudar a reducir los efectos secundarios del tratamiento. Adem�s del agua pura, se recomienda el consumo         " +
                                                  "\n de jugos naturales sin az�car, infusiones suaves y caldos ligeros, que pueden aportar l�quidos y minerales esenciales.       " +
                                                  "\n Tambi�n es recomendable el consumo de bebidas con fibra natural, como agua de ch�a, para ayudar a estabilizar los niveles    " +
                                                  "\n de az�car en sangre. POSIBLE TRATAMIENTO: La diabetes en ni�as se trata con insulina, en el caso de diabetes tipo 1, y con   " +
                                                  "\n medicamentos como metformina, en el caso de diabetes tipo 2. Tambi�n se recomienda un plan de alimentaci�n saludable y       " +
                                                  "\n monitoreo constante de los niveles de glucosa. En algunos casos, se puede utilizar terapia con microinfusora de insulina,    " +
                                                  "\n que permite un control m�s preciso de los niveles de az�car en sangre. ALIMENTACI�N: Se recomienda el consumo de alimentos   " +
                                                  "\n que ayuden a estabilizar los niveles de az�car en sangre y fortalecer el sistema inmunol�gico, tales como ar�ndanos, ricos   " +
                                                  "\n en antioxidantes y vitamina C, aportando 25% de la ingesta diaria recomendada. espinacas, que contienen hierro y vitamina A, " +
                                                  "\n esenciales para la recuperaci�n, proporcionando 15% de la ingesta diaria recomendada de hierro. jengibre, con propiedades    " +
                                                  "\n antiinflamatorias y antioxidantes, aportando 5% de la ingesta diaria recomendada de vitamina C. c�rcuma, con curcumina,      " +
                                                  "\n que tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes." +
                                                  "\n yogur natural, que contiene probi�ticos beneficiosos para la flora intestinal, proporcionando 15% de la ingesta diaria     " +
                                                  "\n recomendada de calcio. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la   " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s   " +
                                                  "\n de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la  " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n En ni�as, el asma puede causar dificultad respiratoria y afectar la calidad de vida, por lo que es fundamental un          " +
                                                  "\n diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que la paciente mantenga una hidrataci�n           " +
                                                  "\n adecuada, consumiendo al menos 2 litros de agua al d�a para favorecer la eliminaci�n de toxinas y mantener las v�as        " +
                                                  "\n respiratorias hidratadas. Tambi�n es recomendable el consumo de l�quidos tibios como infusiones de manzanilla o jengibre,  " +
                                                  "\n que pueden ayudar a reducir la inflamaci�n de las v�as respiratorias. EJERCICIO: Se recomienda realizar actividades        " +
                                                  "\n f�sicas moderadas como juegos al aire libre, caminatas cortas o nataci�n, siempre bajo supervisi�n m�dica para evitar      " +
                                                  "\n complicaciones y fortalecer la funci�n pulmonar. Tambi�n es importante realizar ejercicios de respiraci�n profunda para    " +
                                                  "\n mejorar la capacidad pulmonar y reducir la sensaci�n de falta de aire. POSIBLE TRATAMIENTO: El tratamiento est�ndar para   " +
                                                  "\n el asma incluye broncodilatadores de alivio r�pido, como el salbutamol, corticosteroides inhalados para el control a largo " +
                                                  "\n plazo, como la fluticasona, y en algunos casos, modificadores de leucotrienos como el montelukast. Es fundamental seguir   " +
                                                  "\n estrictamente el plan de acci�n para el asma indicado por el m�dico y usar los medicamentos preventivos regularmente.      " +
                                                  "\n ALIMENTACI�N RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir " +
                                                  "\n la inflamaci�n, tales como: Pescados grasos (salm�n, at�n): Ricos en �cidos grasos Omega-3, que poseen propiedades         " +
                                                  "\n antiinflamatorias y pueden ayudar a reducir la inflamaci�n de las v�as respiratorias. Frutas y verduras de colores vivos   " +
                                                  "\n (ar�ndanos, fresas, espinacas, br�coli): Ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las " +
                                                  "\n c�lulas del da�o y fortalecer el sistema inmunol�gico. Jengibre: Contiene compuestos con efectos antiinflamatorios que podr�an  " +
                                                  "\n ser beneficiosos para las v�as respiratorias, ayudando a reducir la inflamaci�n y mejorar la circulaci�n sangu�nea. C�rcuma:    " +
                                                  "\n Con su componente activo, la curcumina, tambi�n tiene potentes propiedades antiinflamatorias y antioxidantes, contribuyendo a   " +
                                                  "\n la reducci�n de la inflamaci�n en los pulmones. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no        " +
                                                  "\n garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad," +
                                                  "\n se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n En ni�as, el VIH/SIDA puede generar mayor vulnerabilidad a infecciones oportunistas y complicaciones sist�micas,          " +
                                                  "\n por lo que es fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que la paciente      " +
                                                  "\n mantenga una hidrataci�n adecuada, consumiendo al menos 2.5 litros de agua al d�a para favorecer la eliminaci�n de        " +
                                                  "\n toxinas y mantener el sistema inmunol�gico fuerte. Tambi�n es recomendable el consumo de jugos naturales sin az�car,      " +
                                                  "\n como jugo de ar�ndano, que puede ayudar a prevenir infecciones urinarias recurrentes. EJERCICIO: Se recomienda            " +
                                                  "\n realizar actividades f�sicas moderadas como juegos tranquilos, caminatas cortas o ejercicios de movilidad, siempre        " +
                                                  "\n bajo supervisi�n m�dica para evitar complicaciones y fortalecer la funci�n inmunol�gica. POSIBLE TRATAMIENTO: El          " +
                                                  "\n tratamiento est�ndar para el VIH/SIDA incluye terapia antirretroviral combinada (TAR), con medicamentos como tenofovir,   " +
                                                  "\n emtricitabina y dolutegravir, que ayudan a reducir la carga viral y mejorar la funci�n inmunol�gica. Es fundamental       " +
                                                  "\n seguir estrictamente el tratamiento indicado por el m�dico y realizar controles peri�dicos para evaluar la respuesta      " +
                                                  "\n al tratamiento. ALIMENTACI�N RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico   " +
                                                  "\n y ayuden a combatir infecciones, tales como: Frutas c�tricas (naranjas, limones, toronjas): Ricas en vitamina C, que      " +
                                                  "\n fortalece el sistema inmunol�gico y ayuda a reducir la duraci�n de infecciones. Yogur natural: Contiene probi�ticos,      " +
                                                  "\n que pueden ayudar a mantener el equilibrio de la flora bacteriana y mejorar la respuesta inmunol�gica. Verduras de        " +
                                                  "\n hoja verde (espinaca, acelga, br�coli): Ricas en antioxidantes y vitaminas esenciales para la recuperaci�n, como la       " +
                                                  "\n vitamina A, que contribuye a la regeneraci�n celular. Omega-3 (salm�n, at�n, ch�a): Con propiedades antiinflamatorias     " +
                                                  "\n que pueden ayudar a reducir la inflamaci�n y mejorar la respuesta inmunol�gica. Este es solo un diagn�stico               " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las           " +
                                                  "\n respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar m�s de un diagn�stico y consultar   " +
                                                  "\n a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n En ni�as, la gonorrea puede presentar s�ntomas m�s leves o at�picos, por lo que es fundamental un diagn�stico            " +
                                                  "\n oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que la paciente mantenga una hidrataci�n adecuada,           " +
                                                  "\n consumiendo al menos 2 litros de agua al d�a para favorecer la eliminaci�n de toxinas y mantener el sistema              " +
                                                  "\n inmunol�gico fuerte. Tambi�n es recomendable el consumo de infusiones naturales como t� de manzanilla, que               " +
                                                  "\n puede ayudar a reducir la inflamaci�n y mejorar la funci�n renal. EJERCICIO: Se recomienda realizar actividades          " +
                                                  "\n f�sicas moderadas como juegos tranquilos, caminatas cortas o ejercicios de movilidad, siempre bajo supervisi�n           " +
                                                  "\n m�dica para evitar complicaciones y fortalecer la circulaci�n sangu�nea. POSIBLE TRATAMIENTO: El tratamiento             " +
                                                  "\n est�ndar para la gonorrea incluye antibi�ticos como la azitromicina y ceftriaxona, los cuales deben ser                  " +
                                                  "\n administrados bajo prescripci�n m�dica. En casos m�s graves, puede requerirse hospitalizaci�n para recibir               " +
                                                  "\n antibi�ticos intravenosos. Es fundamental que la paciente evite el contacto �ntimo hasta completar el tratamiento        " +
                                                  "\n y que su pareja tambi�n reciba tratamiento para evitar reinfecciones. ALIMENTACI�N RECOMENDADA: Se recomienda el         " +
                                                  "\n consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a combatir la infecci�n, tales como: Ajo:          " +
                                                  "\n Posee propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene alicina, un compuesto    " +
                                                  "\n con efectos antibacterianos. Frutas c�tricas (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece el        " +
                                                  "\n sistema inmunol�gico y ayuda a reducir la duraci�n de infecciones. Yogur natural: Contiene probi�ticos, que pueden       " +
                                                  "\n ayudar a mantener el equilibrio de la flora bacteriana y mejorar la respuesta inmunol�gica. Verduras de hoja verde       " +
                                                  "\n (espinaca, acelga, br�coli): Ricas en antioxidantes y vitaminas esenciales para la recuperaci�n, como la vitamina A,     " +
                                                  "\n que contribuye a la regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no       " +
                                                  "\n garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor   " +
                                                  "\n seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n En ni�as, el herpes genital puede causar molestias significativas y afectar la piel y mucosas, por lo que es                  " +
                                                  "\n fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que la paciente mantenga               " +
                                                  "\n una hidrataci�n adecuada, consumiendo al menos 2 litros de agua al d�a para favorecer la eliminaci�n de toxinas               " +
                                                  "\n y mantener el sistema inmunol�gico fuerte. Tambi�n es recomendable el consumo de l�quidos tibios como infusiones              " +
                                                  "\n de manzanilla o jengibre, que pueden ayudar a reducir la inflamaci�n y mejorar la cicatrizaci�n de las lesiones.              " +
                                                  "\n EJERCICIO: Se recomienda realizar actividades f�sicas moderadas como juegos tranquilos, caminatas cortas o ejercicios         " +
                                                  "\n de movilidad, siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer la funci�n inmunol�gica. POSIBLE        " +
                                                  "\n TRATAMIENTO: El tratamiento est�ndar para el herpes genital incluye antivirales como aciclovir, valaciclovir y famciclovir,   " +
                                                  "\n administrados bajo prescripci�n m�dica. Estos medicamentos ayudan a reducir la duraci�n y gravedad de los s�ntomas, as�       " +
                                                  "\n como la frecuencia de los brotes recurrentes. Tambi�n es fundamental evitar el contacto con posibles fuentes de infecci�n     " +
                                                  "\n y mantener una higiene adecuada para prevenir la propagaci�n del virus. ALIMENTACI�N RECOMENDADA: Se recomienda el consumo    " +
                                                  "\n de alimentos que fortalezcan el sistema inmunol�gico y ayuden a combatir la infecci�n, tales como: Ajo: Posee propiedades     " +
                                                  "\n antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene alicina, un compuesto con efectos antibacterianos." +
                                                  "\n Frutas c�tricas (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece el sistema inmunol�gico y ayuda a reducir    " +
                                                  "\n la duraci�n de infecciones. Yogur natural: Contiene probi�ticos, que pueden ayudar a mantener el equilibrio de la flora        " +
                                                  "\n bacteriana y mejorar la respuesta inmunol�gica. Verduras de hoja verde (espinaca, acelga, br�coli): Ricas en antioxidantes     " +
                                                  "\n y vitaminas esenciales para la recuperaci�n, como la vitamina A, que contribuye a la regeneraci�n celular. Este es solo un     " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las    " +
                                                  "\n respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un   " +
                                                  "\n m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n En ni�as, la s�filis puede causar s�ntomas graves si no se trata a tiempo, por lo que es fundamental un diagn�stico      " +
                                                  "\n oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que la paciente mantenga una hidrataci�n adecuada,           " +
                                                  "\n consumiendo al menos 2 litros de agua al d�a para favorecer la eliminaci�n de toxinas y mantener el sistema inmunol�gico " +
                                                  "\n fuerte. Tambi�n es recomendable el consumo de sueros de rehidrataci�n oral para reponer electrolitos esenciales          " +
                                                  "\n como sodio, potasio y cloro, los cuales se pierden con la fiebre y malestar general. EJERCICIO: Se recomienda realizar   " +
                                                  "\n actividades f�sicas moderadas como juegos tranquilos, caminatas cortas o ejercicios de movilidad, siempre bajo           " +
                                                  "\n supervisi�n m�dica para evitar complicaciones y fortalecer la funci�n inmunol�gica. POSIBLE TRATAMIENTO: El tratamiento  " +
                                                  "\n est�ndar para la s�filis incluye antibi�ticos como la penicilina G benzatina, administrada en dosis �nica intramuscular, " +
                                                  "\n o alternativas como doxiciclina o ceftriaxona en casos de alergia a la penicilina. Es fundamental seguir el tratamiento  " +
                                                  "\n completo para evitar complicaciones graves. ALIMENTACI�N RECOMENDADA: Se recomienda el consumo de alimentos que          " +
                                                  "\n fortalezcan el sistema inmunol�gico y ayuden a combatir la infecci�n, tales como: Ajo: Posee propiedades antimicrobianas " +
                                                  "\n naturales que pueden ayudar a combatir infecciones y contiene alicina, un compuesto con efectos antibacterianos. Frutas  " +
                                                  "\n c�tricas (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece el sistema inmunol�gico y ayuda a reducir la  " +
                                                  "\n duraci�n de infecciones. Yogur natural: Contiene probi�ticos, que pueden ayudar a mantener el equilibrio de la flora          " +
                                                  "\n bacteriana y mejorar la respuesta inmunol�gica. Verduras de hoja verde (espinaca, acelga, br�coli): Ricas en antioxidantes    " +
                                                  "\n y vitaminas esenciales para la recuperaci�n, como la vitamina A, que contribuye a la regeneraci�n celular. Este es solo un    " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las   " +
                                                  "\n respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar m�s de un diagn�stico y consultar a     " +
                                                  "\n un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n En ni�as, la tuberculosis puede causar s�ntomas respiratorios graves y afectar la funci�n pulmonar, por lo que              " +
                                                  "\n es fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que la paciente mantenga          " +
                                                  "\n una hidrataci�n adecuada, consumiendo al menos 2.5 litros de agua al d�a para favorecer la eliminaci�n de toxinas           " +
                                                  "\n y mantener las v�as respiratorias hidratadas. Tambi�n es recomendable el consumo de l�quidos tibios como infusiones         " +
                                                  "\n de jengibre o manzanilla, que pueden ayudar a reducir la inflamaci�n de las v�as respiratorias. EJERCICIO: Se               " +
                                                  "\n recomienda realizar actividades f�sicas moderadas como juegos tranquilos, caminatas cortas o ejercicios de movilidad,       " +
                                                  "\n siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer la funci�n pulmonar. Tambi�n es importante          " +
                                                  "\n realizar ejercicios de respiraci�n profunda para mejorar la capacidad pulmonar y reducir la sensaci�n de falta de aire.     " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento est�ndar para la tuberculosis incluye un r�gimen de antibi�ticos como isoniazida,       " +
                                                  "\n rifampicina, pirazinamida y etambutol, administrados durante un per�odo de seis meses bajo estricta supervisi�n m�dica.     " +
                                                  "\n Es fundamental seguir el tratamiento completo para evitar resistencia bacteriana. ALIMENTACI�N RECOMENDADA: Se recomienda   " +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a combatir la infecci�n, tales como: Ajo: Posee    " +
                                                  "\n propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene alicina, un compuesto con efectos " +
                                                  "\n antibacterianos. Frutas c�tricas (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece el sistema inmunol�gico  " +
                                                  "\n y ayuda a reducir la duraci�n de infecciones. Yogur natural: Contiene probi�ticos, que pueden ayudar a mantener el          " +
                                                  "\n equilibrio de la flora bacteriana y mejorar la respuesta inmunol�gica. Verduras de hoja verde (espinaca, acelga, br�coli):  " +
                                                  "\n Ricas en antioxidantes y vitaminas esenciales para la recuperaci�n, como la vitamina A, que contribuye a la regeneraci�n    " +
                                                  "\n celular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga   " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar m�s de     " +
                                                  "\n un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la      " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis. " +
                                                  "\n En ni�as peque�as, la artritis puede causar inflamaci�n en las articulaciones, dolor, rigidez y dificultad para           " +
                                                  "\n moverse, afectando su calidad de vida. EJERCICIO: Se recomienda actividad f�sica moderada, como ejercicios de             " +
                                                  "\n movilidad, estiramientos suaves y nataci�n, que ayudan a fortalecer los m�sculos sin generar impacto en las               " +
                                                  "\n articulaciones. Tambi�n es importante realizar ejercicios de respiraci�n y relajaci�n para reducir el estr�s y            " +
                                                  "\n mejorar la oxigenaci�n. HIDRATACI�N: Es esencial el consumo diario de 1.5 a 2 litros de agua para mantener el cuerpo      " +
                                                  "\n hidratado y ayudar a reducir la inflamaci�n en las articulaciones. Adem�s del agua pura, se recomienda el consumo de      " +
                                                  "\n infusiones suaves, jugos naturales sin az�car y caldos ligeros, que pueden aportar l�quidos y minerales esenciales.       " +
                                                  "\n POSIBLE TRATAMIENTO: La artritis en ni�as se trata con medicamentos antiinflamatorios no esteroideos (AINE), como         " +
                                                  "\n ibuprofeno, para aliviar el dolor y la inflamaci�n. Tambi�n se pueden utilizar f�rmacos antirreum�ticos modificadores     " +
                                                  "\n de la enfermedad, como metotrexato, en casos m�s severos. En algunos casos, se recomienda terapia f�sica y rehabilitaci�n," +
                                                  "\n que incluye ejercicios espec�ficos para mejorar la movilidad y reducir la rigidez articular. ALIMENTACI�N: Se recomienda  " +
                                                  "\n el consumo de alimentos que ayuden a fortalecer el sistema inmunol�gico y reducir la inflamaci�n, tales como pescados     " +
                                                  "\n grasos (salm�n, at�n), ricos en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias. frutas y verduras de     " +
                                                  "\n colores vivos (ar�ndanos, fresas, espinacas, br�coli), ricas en antioxidantes como la vitamina C y carotenoides, que      " +
                                                  "\n pueden proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico. jengibre, que contiene compuestos con efectos  " +
                                                  "\n antiinflamatorios que podr�an ser beneficiosos para las articulaciones. c�rcuma, con su componente activo, la curcumina,  " +
                                                  "\n que tiene potentes propiedades antiinflamatorias y antioxidantes. Este es solo un diagn�stico predeterminado l�gico,      " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente    " +
                                                  "\n correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento " +
                                                  "\n adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n En ni�as peque�as, la tosferina puede causar episodios de tos intensa, dificultad para respirar y fatiga extrema,           " +
                                                  "\n afectando su bienestar. EJERCICIO: Se recomienda actividad f�sica muy ligera, como movimientos suaves y ejercicios          " +
                                                  "\n de respiraci�n para mejorar la oxigenaci�n. Tambi�n es importante evitar esfuerzos f�sicos que puedan generar fatiga        " +
                                                  "\n o dificultar la respiraci�n. HIDRATACI�N: Es esencial el consumo diario de 1.5 a 2 litros de agua para mantener el          " +
                                                  "\n cuerpo hidratado y ayudar a reducir la irritaci�n de las v�as respiratorias. Adem�s del agua pura, se recomienda el         " +
                                                  "\n consumo de infusiones suaves, jugos naturales sin az�car y caldos ligeros, que pueden aportar l�quidos y nutrientes         " +
                                                  "\n esenciales. Tambi�n es recomendable el consumo de bebidas con electrolitos naturales, como agua de coco, para ayudar        " +
                                                  "\n a reponer los minerales perdidos por la fiebre y sudoraci�n. POSIBLE TRATAMIENTO: La tosferina se trata con antibi�ticos,   " +
                                                  "\n como azitromicina, claritromicina o eritromicina, que ayudan a reducir la duraci�n de la enfermedad y la transmisi�n.       " +
                                                  "\n En casos graves, puede requerirse hospitalizaci�n para monitoreo respiratorio y administraci�n de ox�geno. Tambi�n se       " +
                                                  "\n recomienda el uso de medidas de soporte, como humidificadores para aliviar la irritaci�n de las v�as respiratorias y evitar " +
                                                  "\n ambientes con humo o contaminantes. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema  " +
                                                  "\n inmunol�gico y reducir la inflamaci�n, tales como jengibre, que contiene compuestos con efectos antiinflamatorios y         " +
                                                  "\n antioxidantes. c�rcuma, con su componente activo, la curcumina, que tiene propiedades antiinflamatorias y antioxidantes.    " +
                                                  "\n frutas c�tricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalecen el sistema inmunol�gico. miel, que puede " +
                                                  "\n ayudar a calmar la irritaci�n de la garganta y reducir la tos. caldo de pollo, que aporta l�quidos y nutrientes esenciales  " +
                                                  "\n para la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la     " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s    " +
                                                  "\n de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la   " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n En ni�as peque�as, las paperas pueden causar inflamaci�n de las gl�ndulas salivales, fiebre, dolor y dificultad             " +
                                                  "\n para masticar y tragar. EJERCICIO: Se recomienda actividad f�sica ligera, como caminatas cortas y juegos tranquilos,        " +
                                                  "\n evitando esfuerzos excesivos que puedan generar fatiga. Tambi�n es importante realizar ejercicios de movilidad para         " +
                                                  "\n mantener la flexibilidad y evitar la rigidez muscular. HIDRATACI�N: Es fundamental el consumo diario de 1.5 a 2 litros      " +
                                                  "\n de agua para mantener el cuerpo hidratado y ayudar a reducir la fiebre y el malestar. Adem�s del agua pura, se recomienda   " +
                                                  "\n el consumo de caldos ligeros, jugos naturales sin az�car y infusiones suaves, que pueden aportar l�quidos y nutrientes      " +
                                                  "\n esenciales. Tambi�n es recomendable el consumo de bebidas con electrolitos naturales, como agua de coco, para ayudar a      " +
                                                  "\n reponer los minerales perdidos por la fiebre y sudoraci�n. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para    " + 
                                                  "\n las paperas, ya que es una enfermedad viral. Sin embargo, se recomienda el uso de medicamentos para aliviar los s�ntomas,   " +
                                                  "\n como paracetamol o ibuprofeno, para reducir la fiebre y el dolor. Tambi�n es importante el reposo, la hidrataci�n adecuada  " +
                                                  "\n y una alimentaci�n de consistencia blanda para facilitar la ingesta de alimentos. ALIMENTACI�N: Se recomienda el consumo    " +
                                                  "\n de alimentos que ayuden a fortalecer el sistema inmunol�gico y reducir la inflamaci�n, tales como jengibre, que contiene    " +
                                                  "\n compuestos con efectos antiinflamatorios y antioxidantes. c�rcuma, con su componente activo, la curcumina, que tiene        " +
                                                  "\n propiedades antiinflamatorias y antioxidantes. frutas c�tricas (naranjas, limones, toronjas), ricas en vitamina C, que      " +
                                                  "\n fortalecen el sistema inmunol�gico. miel, que puede ayudar a calmar la irritaci�n de la garganta y reducir la inflamaci�n.  " +
                                                  "\n caldo de pollo, que aporta l�quidos y nutrientes esenciales para la recuperaci�n. Este es solo un diagn�stico predeterminado " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean             " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el  " +
                                                  "\n tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica moderada, evitando esfuerzos excesivos que puedan generar   " +
                                                  "\n fatiga. Se sugiere ejercicios suaves como caminatas cortas o juegos tranquilos en casa. HIDRATACI�N: Debido a la fiebre y   " +
                                                  "\n la posible deshidrataci�n causada por el Zika, se recomienda el consumo diario de 2 a 2.5 litros de agua al d�a (ocho a diez " +
                                                  "\n vasos de tama�o regular). Tambi�n es beneficioso el consumo de agua de coco, que ayuda a reponer electrolitos perdidos, y    " +
                                                  "\n jugos naturales sin az�car, ricos en antioxidantes que pueden fortalecer el sistema inmune. POSIBLE TRATAMIENTO: Para el     " +
                                                  "\n Zika en ni�as, no existe un tratamiento espec�fico, ya que es una enfermedad viral autolimitada. Se recomienda reposo,       " +
                                                  "\n hidrataci�n y control de fiebre con paracetamol (Tempra) o ibuprofeno. Es fundamental evitar el uso de aspirina y otros      " +
                                                  "\n antiinflamatorios no esteroides debido al riesgo de complicaciones hemorr�gicas. ALIMENTACI�N: Se recomienda el consumo      " +
                                                  "\n de alimentos que fortalezcan el sistema inmune y ayuden a la recuperaci�n, tales como Naranjas: ricas en vitamina C (89% del " +
                                                  "\n consumo diario recomendado por cada 100g), que ayuda a mejorar la respuesta inmunol�gica. Papaya: contiene vitamina C (157%  " +
                                                  "\n del consumo diario recomendado por cada 100g) y flavonoides que pueden ayudar a reducir la inflamaci�n. Jengibre: con        " +
                                                  "\n propiedades antiinflamatorias que pueden aliviar la fatiga y mejorar la respuesta inmune. Miel: ayuda a calmar la garganta   " +
                                                  "\n y tiene propiedades antimicrobianas. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al   " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar m�s    " +
                                                  "\n de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico     " +
                                                  "\n no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y        " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica ligera, evitando esfuerzos excesivos que       " +
                                                  "\n puedan agravar la deshidrataci�n. Se sugiere juegos tranquilos en casa y caminatas cortas. HIDRATACI�N:        " +
                                                  "\n Debido a la diarrea y los v�mitos causados por el rotavirus, es fundamental una hidrataci�n constante.         " +
                                                  "\n Se recomienda el consumo diario de 2.5 a 3 litros de agua al d�a (diez a doce vasos de tama�o regular)         " +
                                                  "\n para compensar la p�rdida de l�quidos. Tambi�n se recomienda el uso de soluciones de rehidrataci�n oral        " +
                                                  "\n como Pedialyte, suero casero (agua, sal y az�car) y caldos ligeros, que ayudan a reponer electrolitos          " +
                                                  "\n esenciales. POSIBLE TRATAMIENTO: Para el rotavirus en ni�as, no existe un tratamiento espec�fico, ya que       " +
                                                  "\n es una enfermedad viral autolimitada. Se recomienda rehidrataci�n constante, reposo y control de fiebre con    " +
                                                  "\n paracetamol (Tempra) o ibuprofeno. En casos graves, puede requerirse hospitalizaci�n con administraci�n de     " +
                                                  "\n l�quidos intravenosos. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a estabilizar el sistema     " +
                                                  "\n digestivo y compensar la p�rdida de nutrientes, tales como Pl�tanos: ricos en potasio (12% del consumo diario      " +
                                                  "\n recomendado por cada 100g), que ayuda a reemplazar los electrolitos perdidos. Manzanas: contienen pectina, que     " +
                                                  "\n ayuda a regular la digesti�n y reducir la diarrea. Arroz blanco: fuente de carbohidratos de f�cil digesti�n que    " +
                                                  "\n ayuda a recuperar energ�a. Zanahorias: ricas en vitamina A (334% del consumo diario recomendado por cada 100g),    " +
                                                  "\n que contribuye a la regeneraci�n celular y la salud intestinal. Yogur natural: fuente de probi�ticos que ayudan    " +
                                                  "\n a restaurar la flora intestinal y fortalecer el sistema inmune. Este es solo un diagn�stico predeterminado l�gico. " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente" +
                                                  "\n correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s,  " +
                                                  "\n por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.      " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica moderada, evitando esfuerzos excesivos que             " +
                                                  "\n puedan generar fatiga. Se sugiere ejercicios suaves como caminatas cortas o juegos tranquilos en casa. HIDRATACI�N:    " +
                                                  "\n Debido a los s�ntomas gastrointestinales y fiebre que puede causar la listeriosis, se recomienda el consumo diario     " +
                                                  "\n de 2 a 2.5 litros de agua al d�a (ocho a diez vasos de tama�o regular). Tambi�n es beneficioso el consumo de           " +
                                                  "\n infusiones de jengibre, que pueden ayudar a reducir la inflamaci�n, y caldos ligeros, que aportan electrolitos         " +
                                                  "\n esenciales. POSIBLE TRATAMIENTO: Para la listeriosis en ni�as, el tratamiento suele incluir antibi�ticos como          " +
                                                  "\n ampicilina o gentamicina, administrados bajo supervisi�n m�dica. En casos graves, puede requerirse hospitalizaci�n     " +
                                                  "\n con tratamiento intravenoso. ALIMENTACI�N: Se recomienda el consumo de alimentos que fortalezcan el sistema inmune     " +
                                                  "\n y ayuden a la recuperaci�n, tales como Espinacas: contienen hierro (15% del consumo diario recomendado por cada 100g)  " +
                                                  "\n y vitamina A (56% del consumo diario recomendado por cada 100g), esenciales para la regeneraci�n celular. Yogur        " +
                                                  "\n natural: fuente de probi�ticos que ayudan a restaurar la flora intestinal y fortalecer el sistema inmune. Jengibre:    " +
                                                  "\n con propiedades antiinflamatorias que pueden aliviar la fatiga y mejorar la respuesta inmune. Miel: ayuda a calmar     " +
                                                  "\n la garganta y tiene propiedades antimicrobianas. Ajo: contiene alicina, un compuesto con propiedades antimicrobianas   " +
                                                  "\n que pueden ayudar a combatir infecciones. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no     " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se         " +
                                                  "\n recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud,       " +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: La hidrataci�n es esencial para combatir la deshidrataci�n causada por la diarrea intensa, uno de            " +
                                                  "\n los s�ntomas principales de la shigelosis. Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho         " +
                                                  "\n vasos de tama�o regular) para reponer los l�quidos perdidos y evitar complicaciones como el desequilibrio                 " +
                                                  "\n electrol�tico. Adem�s, es recomendable el uso de soluciones de rehidrataci�n oral para recuperar los minerales            " +
                                                  "\n esenciales. EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo absoluto para evitar el desgaste      " +
                                                  "\n energ�tico y permitir que el cuerpo se recupere. Sin embargo, una vez que los s�ntomas comienzan a mejorar, es            " +
                                                  "\n recomendable realizar ejercicios de movilidad suave, como estiramientos ligeros y caminatas cortas, para estimular la     " +
                                                  "\n circulaci�n y evitar la fatiga muscular causada por el reposo prolongado. POSIBLE TRATAMIENTO: El tratamiento para la     " +
                                                  "\n shigelosis incluye antibi�ticos como ciprofloxacina, azitromicina o ceftriaxona, dependiendo de la gravedad del caso      " +
                                                  "\n y la resistencia bacteriana. Tambi�n se recomienda el uso de sales de rehidrataci�n oral para prevenir la deshidrataci�n  " +
                                                  "\n severa. En M�xico, estos medicamentos est�n disponibles en instituciones de salud como el IMSS y el Insabi. Es crucial    " +
                                                  "\n seguir estrictamente el tratamiento indicado por el m�dico y garantizar la adherencia para evitar complicaciones.         " +
                                                  "\n ALIMENTACI�N: Tambi�n es recomendable el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a la       " +
                                                  "\n recuperaci�n intestinal, tales como pl�tanos, ricos en potasio, que ayudan a reponer electrolitos. Arroz blanco, fuente   " +
                                                  "\n de carbohidratos de f�cil digesti�n, que contribuyen a la recuperaci�n intestinal. Manzanas, ricas en pectina, que ayudan " +
                                                  "\n a regular la digesti�n y reducir la diarrea. Zanahorias, con vitamina A, que favorece la regeneraci�n celular. Yogur natural," +
                                                  "\n fuente de probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico. Este es solo un diagn�stico              " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas   " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mayor       " +
                                                  "\n seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface     " +
                                                  "\n del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: La hidrataci�n es clave para mantener las v�as respiratorias h�medas y facilitar la eliminaci�n de          " +
                                                  "\n secreciones, ya que la acumulaci�n de moco espeso es un s�ntoma com�n de la EPOC. Se recomienda el consumo diario        " +
                                                  "\n de 1.5 a 2 litros de agua, adem�s de infusiones calientes que pueden ayudar a aflojar el moco y mejorar la respiraci�n.  " +
                                                  "\n EJERCICIO: La actividad f�sica es fundamental para mejorar la capacidad pulmonar y reducir la sensaci�n de falta de aire." +
                                                  "\n Se recomienda realizar ejercicios de respiraci�n profunda, como la respiraci�n diafragm�tica y la respiraci�n con labios " +
                                                  "\n fruncidos, que ayudan a mejorar la oxigenaci�n y reducir la fatiga. Tambi�n es beneficioso realizar ejercicios de bajo   " +
                                                  "\n impacto, como caminatas suaves, yoga y estiramientos, para fortalecer los m�sculos respiratorios sin generar un esfuerzo " +
                                                  "\n excesivo. POSIBLE TRATAMIENTO: El tratamiento para la EPOC incluye broncodilatadores como salbutamol, corticosteroides   " +
                                                  "\n inhalados como budesonida o fluticasona, y en algunos casos, oxigenoterapia. Tambi�n se recomienda la rehabilitaci�n     " +
                                                  "\n pulmonar, que incluye ejercicios de respiraci�n y t�cnicas para mejorar la capacidad pulmonar. En M�xico, estos          " +
                                                  "\n medicamentos est�n disponibles en instituciones de salud como el IMSS y el Insabi. Es crucial seguir estrictamente    " +
                                                  "\n el tratamiento indicado por el m�dico y garantizar la adherencia para evitar complicaciones. ALIMENTACI�N: Tambi�n    " +
                                                  "\n es recomendable el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n,    " +
                                                  "\n tales como pescados grasos (salm�n, at�n), ricos en Omega-3, con propiedades antiinflamatorias. Frutas c�tricas       " +
                                                  "\n (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunol�gico. Verduras de hoja verde     " +
                                                  "\n (espinacas, acelgas, br�coli), contienen antioxidantes y hierro, esenciales para la salud celular. Frutos secos       " +
                                                  "\n (almendras, nueces), aportan vitamina E, que ayuda a la regeneraci�n celular. Yogur natural, fuente de probi�ticos,   " +
                                                  "\n que favorecen la salud intestinal y el sistema inmunol�gico. Este es solo un diagn�stico predeterminado l�gico,       " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente" +
                                                  "\n correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mayor seguridad en el   " +
                                                  "\n tratamiento adecuado del paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo,    " +
                                                  "\n se recomienda consultar a su m�dico. �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: La hidrataci�n es fundamental para aliviar los s�ntomas urinarios de la clamidia, como el ardor al orinar   " +
                                                  "\n y la necesidad frecuente de hacerlo. Se recomienda el consumo diario de 2 litros de agua para ayudar a eliminar la       " +
                                                  "\n bacteria del tracto urinario y reducir la inflamaci�n. Tambi�n es beneficioso el consumo de jugos naturales sin az�car,  " +
                                                  "\n como el jugo de ar�ndano, que puede ayudar a prevenir infecciones urinarias secundarias. EJERCICIO: La actividad f�sica  " +
                                                  "\n debe ser moderada y adaptada a la condici�n del paciente. Se recomienda realizar ejercicios de movilidad y estiramientos," +
                                                  "\n que ayudan a mejorar la circulaci�n y reducir la fatiga. Tambi�n es beneficioso practicar ejercicios de fortalecimiento  " +
                                                  "\n muscular, como pilates o yoga, para mejorar la resistencia del cuerpo y favorecer la recuperaci�n. POSIBLE TRATAMIENTO:  " +
                                                  "\n El tratamiento para la clamidia incluye antibi�ticos como azitromicina, doxiciclina o levofloxacina, dependiendo de la   " +
                                                  "\n gravedad del caso. Tambi�n se recomienda que la pareja del paciente reciba tratamiento para evitar reinfecciones.        " +
                                                  "\n En M�xico, estos medicamentos est�n disponibles en instituciones de salud como el IMSS y el Insabi. Es crucial seguir    " +
                                                  "\n estrictamente el tratamiento indicado por el m�dico y garantizar la adherencia para evitar complicaciones. ALIMENTACI�N:    " +
                                                  "\n Tambi�n es recomendable el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n,  " +
                                                  "\n tales como frutas c�tricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunol�gico.       " +
                                                  "\n Verduras de hoja verde (espinacas, acelgas, br�coli), contienen antioxidantes y hierro, esenciales para la salud celular.   " +
                                                  "\n Pescados grasos (salm�n, at�n), ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos (almendras, nueces),      " +
                                                  "\n aportan vitamina E, que ayuda a la regeneraci�n celular. Yogur natural, fuente de probi�ticos, que favorecen la salud       " +
                                                  "\n intestinal y el sistema inmunol�gico. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza    " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda  " +
                                                  "\n realizar m�s de un Diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s,  " +
                                                  "\n por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L.       " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tama�o regular)            " +
                                                  "\n para mantener la hidrataci�n y ayudar a reducir la fiebre, lo que es fundamental en el proceso de recuperaci�n.         " +
                                                  "\n La meningitis bacteriana puede provocar fiebre alta, v�mitos, rigidez en el cuello y sensibilidad a la luz, lo          " +
                                                  "\n que puede llevar a una mayor p�rdida de l�quidos. Es importante que el paciente consuma l�quidos ricos en               " +
                                                  "\n electrolitos, como sueros orales, caldos y jugos naturales sin az�car, para evitar la deshidrataci�n y mantener         " +
                                                  "\n el equilibrio de minerales esenciales. Tambi�n se recomienda el consumo de infusiones suaves, como manzanilla o         " +
                                                  "\n jengibre, que pueden ayudar a aliviar las n�useas y mejorar la digesti�n. EJERCICIO: La actividad f�sica debe ser       " +
                                                  "\n muy ligera y supervisada, evitando esfuerzos excesivos que puedan agravar los s�ntomas, ejercicios de respiraci�n       " +
                                                  "\n profunda y movilidad suave pueden ser beneficiosos para mejorar la capacidad pulmonar y la circulaci�n. POSIBLE         " +
                                                  "\n TRATAMIENTO: El tratamiento est�ndar para la meningitis bacteriana en ni�os incluye antibi�ticos como ceftriaxona,      " +
                                                  "\n ampicilina y vancomicina, administrados por v�a intravenosa durante 7 a 14 d�as, en M�xico algunas marcas reconocidas   " +
                                                  "\n incluyen Rocephin (ceftriaxona) y Amikin (amikacina), adem�s se recomienda el uso de corticosteroides como              " +
                                                  "\n dexametasona para reducir la inflamaci�n cerebral en casos graves. ALIMENTACI�N: Para fortalecer el sistema             " +
                                                  "\n inmunol�gico y apoyar la recuperaci�n, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes         " +
                                                  "\n y prote�nas. Naranjas y fresas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa      " +
                                                  "\n hasta el 100% de la ingesta diaria recomendada, fortaleciendo el sistema inmunol�gico y ayudando a reducir la           " +
                                                  "\n inflamaci�n. Espinacas y lentejas: Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25%          " +
                                                  "\n y 40% de la ingesta diaria recomendada, lo que ayuda a mejorar la oxigenaci�n celular y reducir el cansancio.           " +
                                                  "\n Carnes magras y huevos: Son una fuente importante de prote�nas, proporcionando entre 20 y 25 g por cada 100 g,          " +
                                                  "\n lo que equivale al 40-50% de la recomendaci�n diaria, esenciales para la regeneraci�n celular y el fortalecimiento      " +
                                                  "\n muscular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente    " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar   " +
                                                  "\n m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 2.5 litros de agua (seis a diez vasos de tama�o regular) para mantener     " +
                                                  "\n la hidrataci�n y ayudar a reducir los efectos secundarios del tratamiento, lo que es fundamental en el proceso de recuperaci�n.  " +
                                                  "\n Los ni�os con c�ncer pueden experimentar v�mitos, diarrea y sudoraci�n excesiva, lo que aumenta el riesgo de deshidrataci�n.     " +
                                                  "\n Es esencial consumir l�quidos ricos en electrolitos, como sueros orales y caldos, para reponer los minerales perdidos.           " +
                                                  "\n Tambi�n se recomienda el consumo de agua con lim�n o infusiones suaves, que pueden ayudar a aliviar las n�useas y mejorar la     " +
                                                  "\n digesti�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada, evitando esfuerzos excesivos que puedan debilitar el     " +
                                                  "\n sistema inmunol�gico, ejercicios como yoga, caminatas suaves y nataci�n pueden ser beneficiosos para mejorar la resistencia      " +
                                                  "\n y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento para el c�ncer en ni�os depende del tipo espec�fico de c�ncer, pero     " +
                                                  "\n puede incluir quimioterapia, radioterapia y cirug�a, en M�xico algunas marcas reconocidas incluyen Methotrexate (metotrexato)    " +
                                                  "\n y Vincristine (vincristina), adem�s se recomienda el uso de terapias complementarias como apoyo nutricional y psicol�gico para   " +
                                                  "\n mejorar la calidad de vida del paciente. ALIMENTACI�N: Para fortalecer el sistema inmunol�gico y apoyar la recuperaci�n, se      " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes, prote�nas y �cidos grasos esenciales. Br�coli y zanahorias:       " +
                                                  "\n Contienen aproximadamente 50-80 mg de vitamina C por cada 100 g, lo que representa hasta el 90% de la ingesta diaria         " +
                                                  "\n recomendada, fortaleciendo el sistema inmunol�gico. Salm�n y ch�a: Son fuentes de omega-3, proporcionando entre 2-4 g por    " +
                                                  "\n cada 100 g, lo que ayuda a reducir la inflamaci�n y mejorar la funci�n celular. Frutas y verduras de colores vivos: Como     " +
                                                  "\n ar�ndanos y espinacas, que son ricas en antioxidantes y ayudan a proteger las c�lulas del da�o. Este es solo un diagn�stico  " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas   " +
                                                  "\n sean completamente correctas, para mayor seguridad se recomienda realizar m�s de un diagn�stico y consultar a un m�dico.     " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.50-1.75 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n La influenza es una infecci�n viral que afecta el sistema respiratorio, causando fiebre alta, tos, dolor muscular       " +
                                                  "\n y fatiga. HIDRATACI�N: Se recomienda que la paciente mantenga una hidrataci�n adecuada, consumiendo al menos 2          " +
                                                  "\n litros de agua al d�a para prevenir la deshidrataci�n causada por la fiebre y la sudoraci�n. Tambi�n es recomendable    " +
                                                  "\n el consumo de caldos ligeros, infusiones tibias y jugos naturales sin az�car, que pueden ayudar a aliviar la garganta   " +
                                                  "\n irritada y fortalecer el sistema inmunol�gico. EJERCICIO: Durante la enfermedad, se recomienda evitar actividades       " +
                                                  "\n f�sicas intensas y optar por movimientos suaves como estiramientos o caminatas cortas dentro del hogar para evitar      " +
                                                  "\n el agotamiento. Una vez recuperada, es importante retomar la actividad f�sica progresivamente para fortalecer el        " +
                                                  "\n sistema inmunol�gico y mejorar la resistencia f�sica. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la influenza    " +
                                                  "\n incluye medicamentos para reducir la fiebre y aliviar los s�ntomas, como el paracetamol y el ibuprofeno. En casos de    " +
                                                  "\n riesgo, el m�dico puede prescribir antivirales como oseltamivir para reducir la duraci�n de la enfermedad. Tambi�n      " +
                                                  "\n se recomienda el descanso adecuado y el aislamiento para evitar la propagaci�n del virus. ALIMENTACI�N RECOMENDADA:     " +
                                                  "\n Se recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a la recuperaci�n, tales como:   " +
                                                  "\n Naranjas: Ricas en vitamina C, que fortalece el sistema inmunol�gico y ayuda a reducir la duraci�n de infecciones.      " +
                                                  "\n Fresas: Ricas en vitamina C y antioxidantes, que protegen las c�lulas del da�o. Pl�tanos: Ricos en potasio, que    " +
                                                  "\n puede ayudar a reemplazar los electrolitos perdidos debido a la fiebre y sudoraci�n. Kiwi: Rico en vitamina C y    " +
                                                  "\n potasio, que contribuye a la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado   " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas.     " +
                                                  "\n Para mayor seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el      " +
                                                  "\n tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n La neumon�a es una infecci�n pulmonar que puede causar dificultad respiratoria, fiebre alta y dolor en el pecho.         " +
                                                  "\n HIDRATACI�N: Se recomienda que la paciente mantenga una hidrataci�n adecuada, consumiendo al menos 2.5 litros de         " +
                                                  "\n agua al d�a para favorecer la eliminaci�n de toxinas y mantener las v�as respiratorias hidratadas. Tambi�n es            " +
                                                  "\n recomendable el consumo de l�quidos tibios como infusiones de jengibre o manzanilla, que pueden ayudar a reducir         " +
                                                  "\n la inflamaci�n de las v�as respiratorias. EJERCICIO: Durante la enfermedad, se recomienda evitar actividades             " +
                                                  "\n f�sicas intensas y optar por movimientos suaves como estiramientos o caminatas cortas dentro del hogar para evitar       " +
                                                  "\n el agotamiento. Una vez recuperada, es importante realizar ejercicios de respiraci�n profunda para mejorar la            " +
                                                  "\n capacidad pulmonar y fortalecer los m�sculos respiratorios. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la         " +
                                                  "\n neumon�a incluye antibi�ticos como amoxicilina o azitromicina, administrados bajo prescripci�n m�dica. En casos          " +
                                                  "\n graves, puede requerirse hospitalizaci�n para administraci�n de antibi�ticos intravenosos y oxigenoterapia. Tambi�n      " +
                                                  "\n se recomienda el descanso adecuado y el monitoreo de s�ntomas para evitar complicaciones. ALIMENTACI�N RECOMENDADA:      " +
                                                  "\n Se recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a combatir la infecci�n,          " +
                                                  "\n tales como: Ajo: Posee propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene         " +
                                                  "\n alicina, un compuesto con efectos antibacterianos. Frutas c�tricas (naranjas, limones, toronjas): Ricas en vitamina C,   " +
                                                  "\n que fortalece el sistema inmunol�gico y ayuda a reducir la duraci�n de infecciones. Yogur natural: Contiene probi�ticos, " +
                                                  "\n que pueden ayudar a mantener el equilibrio de la flora bacteriana y mejorar la respuesta inmunol�gica. Verduras de hoja  " +
                                                  "\n verde (espinaca, acelga, br�coli): Ricas en antioxidantes y vitaminas esenciales para la recuperaci�n, como la           " +
                                                  "\n vitamina A, que contribuye a la regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico, haberlo         " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente           " +
                                                  "\n correctas. Para mayor seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer    " +
                                                  "\n el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n La diabetes es una enfermedad cr�nica que afecta el metabolismo y la producci�n de insulina, lo que puede generar       " +
                                                  "\n complicaciones en el organismo. HIDRATACI�N: Se recomienda que la paciente mantenga una hidrataci�n adecuada,           " +
                                                  "\n consumiendo al menos 2.5 litros de agua al d�a para favorecer la eliminaci�n de toxinas y mantener el equilibrio        " +
                                                  "\n de glucosa en sangre. Tambi�n es recomendable el consumo de jugos naturales sin az�car, como jugo de ar�ndano, que      " +
                                                  "\n puede ayudar a prevenir infecciones urinarias recurrentes. EJERCICIO: Se recomienda realizar actividades f�sicas        " +
                                                  "\n moderadas como juegos tranquilos, caminatas cortas o ejercicios de movilidad, siempre bajo supervisi�n m�dica para      " +
                                                  "\n evitar complicaciones y fortalecer la funci�n metab�lica. Tambi�n es importante incluir ejercicios de resistencia       " +
                                                  "\n para mejorar la sensibilidad a la insulina y mantener un peso saludable. POSIBLE TRATAMIENTO: El tratamiento est�ndar   " +
                                                  "\n para la diabetes incluye insulina en el caso de diabetes tipo 1 y cambios en el estilo de vida para la diabetes tipo 2. " +
                                                  "\n En algunos casos, puede requerirse el uso de medicamentos como metformina para controlar los niveles de glucosa.        " +
                                                  "\n Tambi�n se recomienda el monitoreo constante de los niveles de az�car en sangre y la educaci�n sobre el manejo de       " +
                                                  "\n la enfermedad. ALIMENTACI�N RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico  " +
                                                  "\n y ayuden a mantener niveles adecuados de glucosa, tales como: Frutas c�tricas (naranjas, limones, toronjas): Ricas en   " +
                                                  "\n vitamina C, que fortalece el sistema inmunol�gico y ayuda a reducir la duraci�n de infecciones. Yogur natural:          " +
                                                  "\n Contiene probi�ticos, que pueden ayudar a mantener el equilibrio de la flora bacteriana y mejorar la respuesta          " +
                                                  "\n inmunol�gica. Verduras de hoja verde (espinaca, acelga, br�coli): Ricas en antioxidantes y vitaminas esenciales         " +
                                                  "\n para la recuperaci�n, como la vitamina A, que contribuye a la regeneraci�n celular. Omega-3 (salm�n, at�n, ch�a):       " +
                                                  "\n Con propiedades antiinflamatorias que pueden ayudar a reducir la inflamaci�n y mejorar la respuesta inmunol�gica.       " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga        " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar        " +
                                                  "\n m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu       " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n En ni�as peque�as, el asma puede causar dificultad para respirar, tos persistente, sibilancias y fatiga, afectando   " +
                                                  "\n su bienestar y calidad de vida. EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas suaves, juegos    " +
                                                  "\n tranquilos y ejercicios de respiraci�n para mejorar la oxigenaci�n. Tambi�n es importante evitar esfuerzos f�sicos   " +
                                                  "\n que puedan generar fatiga o dificultar la respiraci�n. HIDRATACI�N: Es esencial el consumo diario de 1.5 a 2 litros  " +
                                                  "\n de agua para mantener el cuerpo hidratado y ayudar a reducir la inflamaci�n de las v�as respiratorias. Adem�s del    " +
                                                  "\n agua pura, se recomienda el consumo de infusiones suaves, jugos naturales sin az�car y caldos ligeros, que pueden    " +
                                                  "\n aportar l�quidos y nutrientes esenciales. Tambi�n es recomendable el consumo de bebidas con electrolitos naturales,  " +
                                                  "\n como agua de coco, para ayudar a reponer los minerales perdidos por la fiebre y sudoraci�n. POSIBLE TRATAMIENTO:     " +
                                                  "\n El asma se trata con broncodilatadores, como salbutamol, para aliviar los episodios agudos, y corticosteroides       " +
                                                  "\n inhalados, como budesonida, para reducir la inflamaci�n de las v�as respiratorias. Tambi�n se recomienda el uso      " +
                                                  "\n de antihistam�nicos en casos de alergias asociadas y terapia respiratoria, que incluye ejercicios espec�ficos        " +
                                                  "\n para mejorar la capacidad pulmonar. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer      " +
                                                  "\n el sistema respiratorio y reducir la inflamaci�n, tales como pescados grasos (salm�n, at�n), ricos en �cidos         " +
                                                  "\n grasos Omega-3, que poseen propiedades antiinflamatorias. frutas y verduras de colores vivos (ar�ndanos, fresas,     " +
                                                  "\n espinacas, br�coli), ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las c�lulas       " +
                                                  "\n del da�o y fortalecer el sistema inmunol�gico. jengibre, que contiene compuestos con efectos antiinflamatorios       " +
                                                  "\n que podr�an ser beneficiosos para las v�as respiratorias. c�rcuma, con su componente activo, la curcumina, que       " +
                                                  "\n tiene potentes propiedades antiinflamatorias y antioxidantes. Este es solo un diagn�stico predeterminado l�gico,     " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente " +
                                                  "\n correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el  " +
                                                  "\n tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n En ni�as peque�as, el VIH puede afectar el sistema inmunol�gico y requerir un tratamiento especializado para evitar    " +
                                                  "\n complicaciones graves. EJERCICIO: Se recomienda actividad f�sica moderada, adaptada a la capacidad de la ni�a, como    " +
                                                  "\n juegos tranquilos, caminatas suaves y ejercicios de movilidad para mejorar la circulaci�n y reducir la fatiga.         " +
                                                  "\n Tambi�n es recomendable realizar ejercicios de respiraci�n y relajaci�n para mejorar la oxigenaci�n y reducir el       " +
                                                  "\n estr�s. HIDRATACI�N: Es esencial el consumo diario de 2 a 2.5 litros de agua para mantener el cuerpo hidratado y       " +
                                                  "\n ayudar a reducir los efectos secundarios del tratamiento. Adem�s del agua pura, se recomienda el consumo de jugos      " +
                                                  "\n naturales ricos en antioxidantes, como jugo de naranja o toronja, que pueden fortalecer el sistema inmunol�gico.       " +
                                                  "\n Tambi�n es beneficioso ingerir caldos ligeros, que aportan l�quidos y minerales esenciales para la recuperaci�n.       " +
                                                  "\n POSIBLE TRATAMIENTO: El VIH en ni�as se trata con terapia antirretroviral (TAR), que incluye medicamentos como         " +
                                                  "\n lamivudina, abacavir y lopinavir, para reducir la carga viral y fortalecer el sistema inmunol�gico. Tambi�n se         " +
                                                  "\n recomienda un plan de alimentaci�n saludable, monitoreo constante de los niveles de CD4 y seguimiento m�dico especializado." +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmunol�gico y reducir la       " +
                                                  "\n inflamaci�n, tales como ar�ndanos, ricos en antioxidantes y vitamina C. espinacas, que contienen hierro y vitamina A,  " +
                                                  "\n esenciales para la recuperaci�n. jengibre, con propiedades antiinflamatorias y antioxidantes. c�rcuma, con curcumina,  " +
                                                  "\n que tiene propiedades antiinflamatorias y antioxidantes. yogur natural, que contiene probi�ticos beneficiosos para la  " +
                                                  "\n flora intestinal. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la    " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar   " +
                                                  "\n m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu      " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n En ni�as peque�as, la gonorrea puede causar s�ntomas como secreci�n anormal, dolor al orinar y fiebre, y requiere     " +
                                                  "\n tratamiento inmediato para evitar complicaciones. EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas  " +
                                                  "\n suaves y ejercicios de movilidad para mejorar la circulaci�n y reducir la fatiga. Tambi�n es recomendable realizar    " +
                                                  "\n ejercicios de relajaci�n y respiraci�n para reducir el estr�s, ya que este puede afectar la respuesta inmunol�gica    " +
                                                  "\n y prolongar la infecci�n. HIDRATACI�N: Es esencial el consumo diario de 2.5 a 2.75 litros de agua para mantener el    " +
                                                  "\n cuerpo hidratado y ayudar a reducir la inflamaci�n. Adem�s del agua pura, se recomienda el consumo de jugos naturales " +
                                                  "\n ricos en vitamina C, como jugo de naranja o toronja, que pueden fortalecer el sistema inmunol�gico. Tambi�n es        " +
                                                  "\n beneficioso ingerir caldos ligeros, que aportan l�quidos y minerales esenciales para la recuperaci�n. POSIBLE         " +
                                                  "\n TRATAMIENTO: La gonorrea se trata con antibi�ticos, como ceftriaxona o azitromicina, administrados en una sola dosis  " +
                                                  "\n o en un r�gimen de varios d�as. En casos m�s severos, se puede requerir tratamiento prolongado con antibi�ticos       " +
                                                  "\n adicionales, dependiendo de la resistencia bacteriana. Tambi�n se recomienda el uso de probi�ticos para restaurar la  " +
                                                  "\n flora intestinal y mejorar la recuperaci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer " +
                                                  "\n el sistema inmunol�gico y reducir la inflamaci�n, tales como ar�ndanos, ricos en antioxidantes y vitamina C. espinacas, " +
                                                  "\n que contienen hierro y vitamina A, esenciales para la recuperaci�n. jengibre, con propiedades antiinflamatorias y       " +
                                                  "\n antioxidantes. c�rcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes. yogur natural, que      " +
                                                  "\n contiene probi�ticos beneficiosos para la flora intestinal. Este es solo un diagn�stico predeterminado l�gico, haberlo  " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas." +
                                                  "\n Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes Genital." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica moderada, evitando esfuerzos excesivos que puedan          " +
                                                  "\n generar fatiga o estr�s, ya que el herpes puede activarse en situaciones de debilitamiento del sistema inmunol�gico.       " +
                                                  "\n Se sugiere ejercicios suaves como caminatas cortas o juegos tranquilos en casa. HIDRATACI�N: Se recomienda el consumo      " +
                                                  "\n diario de 1.5 a 2 litros de agua al d�a (seis a ocho vasos de tama�o regular) para mantener una adecuada hidrataci�n       " +
                                                  "\n y ayudar a la recuperaci�n. Tambi�n es beneficioso el consumo de infusiones de manzanilla, que pueden ayudar a reducir     " +
                                                  "\n la inflamaci�n, y agua con lim�n, rica en vitamina C, que fortalece el sistema inmune. POSIBLE TRATAMIENTO: Para el        " +
                                                  "\n herpes genital en ni�as, el tratamiento suele incluir antivirales como aciclovir, valaciclovir o famciclovir, administrados" +
                                                  "\n bajo supervisi�n m�dica para reducir la duraci�n y severidad de los brotes. Tambi�n se recomienda el uso de cremas t�picas " +
                                                  "\n para aliviar el dolor y la irritaci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos que fortalezcan el sistema      " +
                                                  "\n inmune y ayuden a la recuperaci�n, tales como Yogur natural: fuente de probi�ticos que ayudan a fortalecer el sistema      " +
                                                  "\n inmune y mejorar la salud intestinal. Ajo: contiene alicina, un compuesto con propiedades antimicrobianas que pueden       " +
                                                  "\n ayudar a combatir infecciones. Jengibre: con propiedades antiinflamatorias que pueden aliviar la fatiga y mejorar la       " +
                                                  "\n respuesta inmune. Frutas c�tricas (naranjas, limones, toronjas): ricas en vitamina C (hasta 89% del consumo diario         " +
                                                  "\n recomendado por cada 100g), que ayuda a mejorar la respuesta inmunol�gica. Miel: ayuda a calmar la garganta y tiene        " +
                                                  "\n propiedades antimicrobianas. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100%    " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar m�s de    " +
                                                  "\n un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no   " +
                                                  "\n le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera  " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica moderada, evitando esfuerzos excesivos que       " +
                                                  "\n puedan generar fatiga. Se sugiere ejercicios suaves como caminatas cortas o juegos tranquilos en casa.           " +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 2 litros de agua al d�a (seis a ocho vasos de tama�o       " +
                                                  "\n regular) para mantener una adecuada hidrataci�n y ayudar a la recuperaci�n. Tambi�n es beneficioso el consumo    " +
                                                  "\n de infusiones de jengibre, que pueden ayudar a reducir la inflamaci�n, y agua con lim�n, rica en vitamina C,     " +
                                                  "\n que fortalece el sistema inmune. POSIBLE TRATAMIENTO: Para la s�filis en ni�as, el tratamiento suele incluir     " +
                                                  "\n penicilina como primera l�nea de defensa, administrada bajo supervisi�n m�dica. En casos de alergia a la         " +
                                                  "\n penicilina, pueden utilizarse otros antibi�ticos como doxiciclina o azitromicina. ALIMENTACI�N: Se recomienda    " +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmune y ayuden a la recuperaci�n, tales como Espinacas:      " +
                                                  "\n contienen hierro (15% del consumo diario recomendado por cada 100g) y vitamina A (56% del consumo diario         " +
                                                  "\n recomendado por cada 100g), esenciales para la regeneraci�n celular. Yogur natural: fuente de probi�ticos que    " +
                                                  "\n ayudan a restaurar la flora intestinal y fortalecer el sistema inmune. Jengibre: con propiedades antiinflamatorias" +
                                                  "\n que pueden aliviar la fatiga y mejorar la respuesta inmune. Miel: ayuda a calmar la garganta y tiene propiedades  " +
                                                  "\n antimicrobianas. Ajo: contiene alicina, un compuesto con propiedades antimicrobianas que pueden ayudar a combatir " +
                                                  "\n infecciones. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el    " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar m�s     " +
                                                  "\n de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del      " +
                                                  "\n diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita      " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica moderada, evitando esfuerzos excesivos que     " +
                                                  "\n puedan generar fatiga o afectar la funci�n pulmonar. Se sugiere ejercicios suaves como caminatas cortas o      " +
                                                  "\n juegos tranquilos en casa. HIDRATACI�N: Debido a la fiebre y la posible deshidrataci�n causada por la tuberculosis, " +
                                                  "\n se recomienda el consumo diario de 2 a 2.5 litros de agua al d�a (ocho a diez vasos de tama�o regular).             " +
                                                  "\n Tambi�n es beneficioso el consumo de infusiones de jengibre, que pueden ayudar a reducir la inflamaci�n,            " +
                                                  "\n y caldos ligeros, que aportan electrolitos esenciales. POSIBLE TRATAMIENTO: Para la tuberculosis en ni�as,          " +
                                                  "\n el tratamiento suele incluir antibi�ticos como isoniazida, rifampicina, pirazinamida y etambutol, administrados     " +
                                                  "\n bajo supervisi�n m�dica durante un per�odo prolongado. En casos graves, puede requerirse hospitalizaci�n con        " +
                                                  "\n tratamiento intravenoso. ALIMENTACI�N: Se recomienda el consumo de alimentos que fortalezcan el sistema inmune      " +
                                                  "\n y ayuden a la recuperaci�n, tales como Espinacas: contienen hierro (15% del consumo diario recomendado por cada     " +
                                                  "\n 100g) y vitamina A (56% del consumo diario recomendado por cada 100g), esenciales para la regeneraci�n celular.     " +
                                                  "\n Yogur natural: fuente de probi�ticos que ayudan a restaurar la flora intestinal y fortalecer el sistema inmune.     " +
                                                  "\n Jengibre: con propiedades antiinflamatorias que pueden aliviar la fatiga y mejorar la respuesta inmune. Miel:       " +
                                                  "\n ayuda a calmar la garganta y tiene propiedades antimicrobianas. Ajo: contiene alicina, un compuesto con propiedades " +
                                                  "\n antimicrobianas que pueden ayudar a combatir infecciones. Frutas c�tricas (naranjas, limones, toronjas): ricas en   " +
                                                  "\n vitamina C (hasta 89% del consumo diario recomendado por cada 100g), que ayuda a mejorar la respuesta inmunol�gica. " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga    " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar m�s de un diagn�stico    " +
                                                  "\n para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface " +
                                                  "\n del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N: Es fundamental mantener una hidrataci�n adecuada para reducir la inflamaci�n articular y mejorar         " +
                                                  "\n la movilidad. Se recomienda el consumo diario de 1.5 a 2 litros de agua, adem�s de infusiones de c�rcuma y jengibre,  " +
                                                  "\n que poseen propiedades antiinflamatorias naturales. EJERCICIO: La actividad f�sica es clave para mejorar la movilidad   " +
                                                  "\n y reducir la rigidez articular. Se recomienda realizar ejercicios de bajo impacto, como nataci�n, yoga y estiramientos  " +
                                                  "\n suaves, que fortalecen los m�sculos sin generar presi�n en las articulaciones. Tambi�n es beneficioso practicar         " +
                                                  "\n ejercicios de movilidad articular, como rotaciones de mu�ecas y tobillos, para mejorar la flexibilidad. POSIBLE         " +
                                                  "\n TRATAMIENTO: El tratamiento para la artritis incluye antiinflamatorios no esteroides (AINE) como ibuprofeno y naproxeno," +
                                                  "\n adem�s de terapia f�sica para mejorar la movilidad. En casos m�s severos, se pueden utilizar medicamentos modificadores " +
                                                  "\n de la enfermedad, como metotrexato. En M�xico, estos medicamentos est�n disponibles en instituciones de salud como el   " +
                                                  "\n IMSS y el Insabi. ALIMENTACI�N: Tambi�n es recomendable el consumo de alimentos que fortalezcan el sistema inmunol�gico " +
                                                  "\n y ayuden a reducir la inflamaci�n, tales como pescados grasos (salm�n, at�n), ricos en Omega-3, con propiedades     " +
                                                  "\n antiinflamatorias. Frutas c�tricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema     " +
                                                  "\n inmunol�gico. Verduras de hoja verde (espinacas, acelgas, br�coli), contienen antioxidantes y hierro, esenciales    " +
                                                  "\n para la salud celular. Frutos secos (almendras, nueces), aportan vitamina E, que ayuda a la regeneraci�n celular.   " +
                                                  "\n Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico. Este es solo un  " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni " +
                                                  "\n que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida " +
                                                  "\n para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud, si la respuesta del  " +
                                                  "\n diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece tu visita a la  " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: La hidrataci�n es clave para aliviar la irritaci�n de las v�as respiratorias y reducir la acumulaci�n      " +
                                                  "\n de moco. Se recomienda el consumo diario de 1.5 a 2 litros de agua, adem�s de infusiones de miel y lim�n, que ayudan    " +
                                                  "\n a calmar la tos y mejorar la respiraci�n. EJERCICIO: La actividad f�sica debe ser moderada y enfocada en mejorar la     " +
                                                  "\n capacidad pulmonar. Se recomienda realizar ejercicios de respiraci�n profunda, como respiraci�n diafragm�tica y con     " +
                                                  "\n labios fruncidos, que ayudan a mejorar la oxigenaci�n. Tambi�n es beneficioso practicar caminatas suaves, evitando      " +
                                                  "\n ambientes fr�os o contaminados. POSIBLE TRATAMIENTO: El tratamiento para la tosferina incluye antibi�ticos como         " +
                                                  "\n eritromicina y azitromicina, adem�s de terapia respiratoria para mejorar la funci�n pulmonar. En casos graves, se       " +
                                                  "\n puede requerir hospitalizaci�n y oxigenoterapia. En M�xico, estos medicamentos est�n disponibles en instituciones       " +  
                                                  "\n de salud como el IMSS y el Insabi. ALIMENTACI�N: Tambi�n es recomendable el consumo de alimentos que fortalezcan el     " +
                                                  "\n sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como frutas c�tricas (naranjas, limones, toronjas),       " +
                                                  "\n ricas en vitamina C, que fortalece el sistema inmunol�gico. Verduras de hoja verde (espinacas, acelgas, br�coli),       " +
                                                  "\n contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos (salm�n, at�n), ricos en Omega-3,   " +
                                                  "\n con propiedades antiinflamatorias. Frutos secos (almendras, nueces), aportan vitamina E, que ayuda a la regeneraci�n    " +
                                                  "\n celular. Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico. Este es     " +
                                                  "\n solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad" +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida  " +
                                                  "\n para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud, si la respuesta del      " +
                                                  "\n diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece tu visita a la      " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: La hidrataci�n es esencial para reducir la inflamaci�n de las gl�ndulas salivales y aliviar el malestar.    " +
                                                  "\n Se recomienda el consumo diario de 1.5 a 2 litros de agua, adem�s de infusiones de manzanilla y jengibre, que poseen     " +
                                                  "\n propiedades antiinflamatorias. EJERCICIO: Durante la enfermedad, se recomienda reposo absoluto para evitar el desgaste   " +
                                                  "\n energ�tico y permitir que el cuerpo se recupere. Una vez que los s�ntomas comienzan a mejorar, es recomendable realizar  " +
                                                  "\n ejercicios de movilidad suave, como estiramientos ligeros y caminatas cortas, para estimular la circulaci�n y evitar la  " +
                                                  "\n fatiga muscular causada por el reposo prolongado. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para las      " +
                                                  "\n paperas, pero se recomienda reposo, analg�sicos como ibuprofeno o paracetamol, y compresas fr�as en la zona inflamada    " +
                                                  "\n para aliviar el dolor. En M�xico, estos medicamentos est�n disponibles en instituciones de salud como el IMSS y el Insabi." +
                                                  "\n ALIMENTACI�N: Tambi�n es recomendable el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir  " +
                                                  "\n la inflamaci�n, tales como frutas c�tricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema   " +
                                                  "\n inmunol�gico. Verduras de hoja verde (espinacas, acelgas, br�coli), contienen antioxidantes y hierro, esenciales para la  " +
                                                  "\n salud celular. Pescados grasos (salm�n, at�n), ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos          " +
                                                  "\n (almendras, nueces), aportan vitamina E, que ayuda a la regeneraci�n celular. Yogur natural, fuente de probi�ticos, que   " +
                                                  "\n favorecen la salud intestinal y el sistema inmunol�gico. Este es solo un diagn�stico predeterminado l�gico, haberlo       " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. " +
                                                  "\n Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento  " +
                                                  "\n adecuado del paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda  " +
                                                  "\n consultar a su m�dico. �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tama�o regular) para                " +
                                                  "\n mantener la hidrataci�n y ayudar a reducir la fiebre y el malestar general, lo que es fundamental en el proceso de               " +
                                                  "\n recuperaci�n. El Zika puede provocar fiebre, dolor muscular, fatiga y sarpullido, lo que puede llevar a una mayor                " +
                                                  "\n p�rdida de l�quidos. Es importante que el paciente consuma l�quidos ricos en electrolitos, como sueros orales, caldos            " +
                                                  "\n y jugos naturales sin az�car, para evitar la deshidrataci�n y mantener el equilibrio de minerales esenciales. Tambi�n            " +
                                                  "\n se recomienda el consumo de infusiones suaves, como manzanilla o jengibre, que pueden ayudar a aliviar las molestias             " +
                                                  "\n musculares y mejorar la digesti�n. EJERCICIO: La actividad f�sica debe ser muy ligera y supervisada, evitando esfuerzos          " +
                                                  "\n excesivos que puedan agravar los s�ntomas, ejercicios de respiraci�n profunda y movilidad suave pueden ser beneficiosos          " +
                                                  "\n para mejorar la circulaci�n y reducir la fatiga. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para el Zika,          " +
                                                  "\n pero los s�ntomas pueden aliviarse con analg�sicos como paracetamol y acetaminof�n, en M�xico algunas marcas reconocidas         " +
                                                  "\n incluyen Tempra (paracetamol) y Tylenol (acetaminof�n), adem�s se recomienda reposo absoluto, hidrataci�n constante y            " +
                                                  "\n protecci�n contra picaduras de mosquitos para evitar complicaciones. ALIMENTACI�N: Para fortalecer el sistema inmunol�gico       " +
                                                  "\n y apoyar la recuperaci�n, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y zinc. Kiwi y naranjas:      " +
                                                  "\n Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa hasta el 100% de la ingesta diaria            " +
                                                  "\n recomendada, fortaleciendo el sistema inmunol�gico. Jengibre y c�rcuma: Poseen propiedades antiinflamatorias y antioxidantes,    " +
                                                  "\n ayudando a reducir la inflamaci�n y el malestar general. Almendras y semillas de calabaza: Aportan 10-15 mg de zinc por cada     " +
                                                  "\n 100 g, cubriendo hasta el 100% de la recomendaci�n diaria, esencial para la funci�n inmunol�gica. Este es solo un diagn�stico    " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas       " +
                                                  "\n sean completamente correctas, para mayor seguridad se recomienda realizar m�s de un diagn�stico y consultar a un m�dico.         " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tama�o regular)               " +
                                                  "\n para evitar la deshidrataci�n causada por la diarrea y los v�mitos, lo que es fundamental en el proceso de                 " +
                                                  "\n recuperaci�n. El rotavirus puede provocar fiebre, v�mitos y diarrea intensa, lo que aumenta el riesgo de p�rdida           " +
                                                  "\n de l�quidos y electrolitos. Es esencial consumir l�quidos ricos en electrolitos, como sueros orales y caldos, para         " +
                                                  "\n reponer los minerales perdidos. Tambi�n se recomienda el consumo de agua con lim�n o infusiones suaves, que pueden         " +
                                                  "\n ayudar a aliviar las n�useas y mejorar la digesti�n. EJERCICIO: La actividad f�sica debe ser m�nima y de reposo,           " +
                                                  "\n evitando esfuerzos f�sicos que puedan agravar la fatiga y la deshidrataci�n, se recomienda descanso absoluto hasta         " +
                                                  "\n la recuperaci�n completa. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para el rotavirus, pero los             " +
                                                  "\n s�ntomas pueden aliviarse con rehidrataci�n oral y medicamentos para la fiebre como paracetamol, en M�xico algunas         " +
                                                  "\n marcas reconocidas incluyen Tempra (paracetamol) y Pedialyte (soluci�n de rehidrataci�n oral), adem�s se recomienda        " +
                                                  "\n reposo y una dieta ligera para evitar complicaciones. ALIMENTACI�N: Para fortalecer el sistema digestivo y apoyar la       " +
                                                  "\n recuperaci�n, se recomienda el consumo de alimentos ricos en probi�ticos, fibra y minerales esenciales. Yogur y k�fir:     " +
                                                  "\n Contienen probi�ticos naturales, que ayudan a restaurar la flora intestinal y mejorar la digesti�n. Pl�tanos y             " +
                                                  "\n zanahorias: Son fuentes de fibra soluble, que ayuda a regular el tr�nsito intestinal y reducir la diarrea. Caldo           " +
                                                  "\n de pollo y arroz: Son alimentos suaves y f�ciles de digerir, proporcionando electrolitos y energ�a para la recuperaci�n.   " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta      " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar m�s de un       " +
                                                  "\n diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeriosis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tama�o regular)           " +
                                                  "\n para mantener la hidrataci�n y ayudar a reducir la fiebre y los s�ntomas gastrointestinales, lo que es fundamental     " +
                                                  "\n en el proceso de recuperaci�n. La listeriosis puede provocar fiebre, v�mitos, diarrea y fatiga extrema, lo que         " +
                                                  "\n aumenta el riesgo de deshidrataci�n. Es esencial consumir l�quidos ricos en electrolitos, como sueros orales y         " +
                                                  "\n caldos, para reponer los minerales perdidos. Tambi�n se recomienda el consumo de infusiones suaves, como manzanilla    " +
                                                  "\n o jengibre, que pueden ayudar a aliviar las molestias digestivas y mejorar la absorci�n de nutrientes. EJERCICIO:      " +
                                                  "\n La actividad f�sica debe ser muy ligera y supervisada, evitando esfuerzos excesivos que puedan agravar los s�ntomas,   " +
                                                  "\n ejercicios de respiraci�n profunda y movilidad suave pueden ser beneficiosos para mejorar la circulaci�n y reducir     " +
                                                  "\n la fatiga. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la listeriosis en ni�os incluye antibi�ticos como         " +
                                                  "\n ampicilina y gentamicina, administrados por v�a intravenosa en casos graves, en M�xico algunas marcas reconocidas      " +
                                                  "\n incluyen Amikin (amikacina) y Unasyn (ampicilina/sulbactam), adem�s se recomienda reposo absoluto y una dieta adecuada " +
                                                  "\n para mejorar la recuperaci�n. ALIMENTACI�N: Para fortalecer el sistema inmunol�gico y apoyar la recuperaci�n, se       " +
                                                  "\n recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y prote�nas. Naranjas y fresas: Contienen        " +
                                                  "\n aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa hasta el 100% de la ingesta diaria recomendada,  " +
                                                  "\n fortaleciendo el sistema inmunol�gico y ayudando a reducir la inflamaci�n. Espinacas y lentejas: Aportan entre 3.5        " +
                                                  "\n y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25% y 40% de la ingesta diaria recomendada, lo que ayuda a mejorar  " +
                                                  "\n la oxigenaci�n celular y reducir el cansancio. Carnes magras y huevos: Son una fuente importante de prote�nas,            " +
                                                  "\n proporcionando entre 20 y 25 g por cada 100 g, lo que equivale al 40-50% de la recomendaci�n diaria, esenciales para      " +
                                                  "\n la regeneraci�n celular y el fortalecimiento muscular. Este es solo un diagn�stico predeterminado l�gico, haberlo         " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, " +
                                                  "\n para mayor seguridad se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu     " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: La hidrataci�n es esencial para combatir la deshidrataci�n causada por la diarrea intensa, uno          " +
                                                  "\n de los s�ntomas principales de la shigelosis. Se recomienda el consumo diario de suficiente agua pura, adem�s        " +
                                                  "\n de soluciones de rehidrataci�n oral, para recuperar los minerales esenciales y evitar el desequilibrio electrol�tico." +
                                                  "\n EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo absoluto para evitar el desgaste energ�tico  " +
                                                  "\n y permitir que el cuerpo se recupere. Una vez que los s�ntomas comienzan a mejorar, es recomendable realizar         " +
                                                  "\n ejercicios de movilidad suave, como estiramientos ligeros y caminatas cortas, para estimular la circulaci�n          " +
                                                  "\n y evitar la fatiga muscular causada por el reposo prolongado. POSIBLE TRATAMIENTO: El tratamiento para la shigelosis " +
                                                  "\n incluye antibi�ticos como ciprofloxacina, azitromicina o ceftriaxona, dependiendo de la gravedad del caso y la       " +
                                                  "\n resistencia bacteriana. Tambi�n se recomienda el uso de sales de rehidrataci�n oral para prevenir la deshidrataci�n  " +
                                                  "\n severa. En M�xico, estos medicamentos est�n disponibles en instituciones de salud como el IMSS y el Insabi.          " +
                                                  "\n ALIMENTACI�N: Tambi�n es recomendable el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden       " +
                                                  "\n a la recuperaci�n intestinal, tales como pl�tanos, ricos en potasio, que ayudan a reponer electrolitos. Arroz        " +
                                                  "\n blanco, fuente de carbohidratos de f�cil digesti�n, que contribuyen a la recuperaci�n intestinal. Manzanas, ricas    " +
                                                  "\n en pectina, que ayudan a regular la digesti�n y reducir la diarrea. Zanahorias, con vitamina A, que favorece la      " +
                                                  "\n regeneraci�n celular. Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico. " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta  " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico " +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud, si la   " +
                                                  "\n respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: La hidrataci�n es clave para mantener las v�as respiratorias h�medas y facilitar la eliminaci�n de       " +
                                                  "\n secreciones, ya que la acumulaci�n de moco espeso es un s�ntoma com�n de la EPOC. Se recomienda el consumo diario     " +
                                                  "\n de agua pura y infusiones calientes, que pueden ayudar a aflojar el moco y mejorar la respiraci�n. EJERCICIO: La      " +
                                                  "\n actividad f�sica es fundamental para mejorar la capacidad pulmonar y reducir la sensaci�n de falta de aire. Se        " +
                                                  "\n recomienda realizar ejercicios de respiraci�n profunda, como la respiraci�n diafragm�tica y la respiraci�n con        " +
                                                  "\n labios fruncidos, que ayudan a mejorar la oxigenaci�n y reducir la fatiga. Tambi�n es beneficioso realizar ejercicios " +
                                                  "\n de bajo impacto, como caminatas suaves, yoga y estiramientos, para fortalecer los m�sculos respiratorios sin generar  " +
                                                  "\n un esfuerzo excesivo. POSIBLE TRATAMIENTO: El tratamiento para la EPOC incluye broncodilatadores como salbutamol,     " +
                                                  "\n corticosteroides inhalados como budesonida o fluticasona, y en algunos casos, oxigenoterapia. Tambi�n se recomienda   " +
                                                  "\n la rehabilitaci�n pulmonar, que incluye ejercicios de respiraci�n y t�cnicas para mejorar la capacidad pulmonar.      " +
                                                  "\n En M�xico, estos medicamentos est�n disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACI�N:     " +
                                                  "\n Tambi�n es recomendable el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, " +
                                                  "\n tales como pescados grasos (salm�n, at�n), ricos en Omega-3, con propiedades antiinflamatorias. Frutas c�tricas (naranjas, " +
                                                  "\n limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunol�gico. Verduras de hoja verde (espinacas, acelgas," +
                                                  "\n br�coli), contienen antioxidantes y hierro, esenciales para la salud celular. Frutos secos (almendras, nueces), aportan  " +
                                                  "\n vitamina E, que ayuda a la regeneraci�n celular. Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal " +
                                                  "\n y el sistema inmunol�gico. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que" +
                                                  "\n el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar  " +
                                                  "\n m�s de un Diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, por su " +
                                                  "\n salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L. Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: La hidrataci�n es fundamental para aliviar los s�ntomas urinarios de la clamidia, como el ardor al orinar     " +
                                                  "\n y la necesidad frecuente de hacerlo. Se recomienda el consumo diario de agua pura, adem�s de jugos naturales sin az�car,   " +
                                                  "\n como el jugo de ar�ndano, que puede ayudar a prevenir infecciones urinarias secundarias. EJERCICIO: La actividad f�sica    " +
                                                  "\n debe ser moderada y adaptada a la condici�n del paciente. Se recomienda realizar ejercicios de movilidad y estiramientos,  " +
                                                  "\n que ayudan a mejorar la circulaci�n y reducir la fatiga. Tambi�n es beneficioso practicar ejercicios de fortalecimiento    " +
                                                  "\n muscular, como pilates o yoga, para mejorar la resistencia del cuerpo y favorecer la recuperaci�n. POSIBLE TRATAMIENTO:    " +
                                                  "\n El tratamiento para la clamidia incluye antibi�ticos como azitromicina, doxiciclina o levofloxacina, dependiendo de la     " +
                                                  "\n gravedad del caso. Tambi�n se recomienda que la pareja del paciente reciba tratamiento para evitar reinfecciones. En M�xico,  " +
                                                  "\n estos medicamentos est�n disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACI�N: Tambi�n es recomendable" +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como frutas c�tricas " +
                                                  "\n (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunol�gico. Verduras de hoja verde (espinacas, " +
                                                  "\n acelgas, br�coli), contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos (salm�n, at�n),    " +
                                                  "\n ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos (almendras, nueces), aportan vitamina E, que ayuda a    " +
                                                  "\n la regeneraci�n celular. Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico." +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta    " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico   " +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud, si la respuesta" +
                                                  "\n del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece tu visita a la " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tama�o regular)     " +
                                                  "\n para mantener la hidrataci�n y ayudar a reducir la fiebre y los s�ntomas neurol�gicos, lo que es fundamental     " +
                                                  "\n en el proceso de recuperaci�n. La meningitis bacteriana puede provocar fiebre alta, v�mitos, rigidez en el       " +
                                                  "\n cuello y sensibilidad a la luz, lo que puede llevar a una mayor p�rdida de l�quidos. Es importante que el        " +
                                                  "\n paciente consuma l�quidos ricos en electrolitos, como sueros orales, caldos y jugos naturales sin az�car,        " +
                                                  "\n para evitar la deshidrataci�n y mantener el equilibrio de minerales esenciales. Tambi�n se recomienda el         " +
                                                  "\n consumo de infusiones suaves, como manzanilla o jengibre, que pueden ayudar a aliviar las n�useas y mejorar      " +
                                                  "\n la digesti�n. EJERCICIO: La actividad f�sica debe ser muy ligera y supervisada, evitando esfuerzos excesivos     " +
                                                  "\n que puedan agravar los s�ntomas, ejercicios de respiraci�n profunda y movilidad suave pueden ser beneficiosos    " +
                                                  "\n para mejorar la capacidad pulmonar y la circulaci�n. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la        " +
                                                  "\n meningitis bacteriana en ni�os incluye antibi�ticos como ceftriaxona, ampicilina y vancomicina, administrados    " +
                                                  "\n por v�a intravenosa durante 7 a 14 d�as, en M�xico algunas marcas reconocidas incluyen Rocephin (ceftriaxona)    " +
                                                  "\n y Amikin (amikacina), adem�s se recomienda el uso de corticosteroides como dexametasona para reducir la inflamaci�n " +
                                                  "\n cerebral en casos graves. ALIMENTACI�N: Para fortalecer el sistema inmunol�gico y apoyar la recuperaci�n, se     " +
                                                  "\n recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y prote�nas. Naranjas y fresas: Contienen  " +
                                                  "\n aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa hasta el 100% de la ingesta diaria      " +
                                                  "\n recomendada, fortaleciendo el sistema inmunol�gico y ayudando a reducir la inflamaci�n. Espinacas y lentejas:      " +
                                                  "\n Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25% y 40% de la ingesta diaria recomendada," +
                                                  "\n lo que ayuda a mejorar la oxigenaci�n celular y reducir el cansancio. Carnes magras y huevos: Son una fuente         " +
                                                  "\n importante de prote�nas, proporcionando entre 20 y 25 g por cada 100 g, lo que equivale al 40-50% de la recomendaci�n" +
                                                  "\n diaria, esenciales para la regeneraci�n celular y el fortalecimiento muscular. Este es solo un diagn�stico    " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que   " +
                                                  "\n las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar m�s de un diagn�stico" +
                                                  "\n y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 2.5 litros de agua (seis a diez vasos de tama�o regular) para       " +
                                                  "\n mantener la hidrataci�n y ayudar a reducir los efectos secundarios del tratamiento, lo que es fundamental en el proceso   " +
                                                  "\n de recuperaci�n. Los ni�os con c�ncer pueden experimentar v�mitos, diarrea y sudoraci�n excesiva, lo que aumenta el       " +
                                                  "\n riesgo de deshidrataci�n. Es esencial consumir l�quidos ricos en electrolitos, como sueros orales y caldos, para reponer  " +
                                                  "\n los minerales perdidos. Tambi�n se recomienda el consumo de agua con lim�n o infusiones suaves, que pueden ayudar a       " +
                                                  "\n aliviar las n�useas y mejorar la digesti�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada, evitando         " +
                                                  "\n esfuerzos excesivos que puedan debilitar el sistema inmunol�gico, ejercicios como yoga, caminatas suaves y nataci�n       " +
                                                  "\n pueden ser beneficiosos para mejorar la resistencia y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento para el      " +
                                                  "\n c�ncer en ni�os depende del tipo espec�fico de c�ncer, pero puede incluir quimioterapia, radioterapia y cirug�a, en       " +
                                                  "\n M�xico algunas marcas reconocidas incluyen Methotrexate (metotrexato) y Vincristine (vincristina), adem�s se recomienda   " +
                                                  "\n el uso de terapias complementarias como apoyo nutricional y psicol�gico para mejorar la calidad de vida del paciente.     " +
                                                  "\n ALIMENTACI�N: Para fortalecer el sistema inmunol�gico y apoyar la recuperaci�n, se recomienda el consumo de alimentos     " +
                                                  "\n ricos en antioxidantes, prote�nas y �cidos grasos esenciales. Br�coli y zanahorias: Contienen aproximadamente 50-80 mg    " +
                                                  "\n de vitamina C por cada 100 g, lo que representa hasta el 90% de la ingesta diaria recomendada, fortaleciendo el sistema   " +
                                                  "\n inmunol�gico. Salm�n y ch�a: Son fuentes de omega-3, proporcionando entre 2-4 g por cada 100 g, lo que ayuda a reducir    " +
                                                  "\n la inflamaci�n y mejorar la funci�n celular. Frutas y verduras de colores vivos: Como ar�ndanos y espinacas, que son      " +
                                                  "\n ricas en antioxidantes y ayudan a proteger las c�lulas del da�o. Este es solo un diagn�stico predeterminado l�gico,       " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente    " +
                                                  "\n correctas, para mayor seguridad se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes      " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        
                        if(EstaturaFemenino.equals("1.40-1.65 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica moderada a intensa diariamente, con una duraci�n           " +
                                                  "\n aproximada de 60 minutos, aunque esta cantidad puede ajustarse seg�n su edad y condici�n. HIDRATACI�N: Es fundamental      " +
                                                  "\n el consumo diario de 1.7 litros de agua (siete vasos de tama�o regular) para mantener una hidrataci�n adecuada y ayudar    " +
                                                  "\n al cuerpo a combatir la enfermedad. POSIBLE TRATAMIENTO: Para la gripe en ni�os, el tratamiento suele incluir medicamentos " +
                                                  "\n para reducir la fiebre y aliviar los s�ntomas, como el paracetamol (Tempra) o el ibuprofeno. En casos espec�ficos, se      " +
                                                  "\n pueden utilizar antivirales como el oseltamivir (Tamiflu). ALIMENTACI�N: Es recomendable el consumo de frutas y verduras   " +
                                                  "\n que fortalezcan el sistema inmune, tales como: Naranjas, ricas en vitamina C (aportan aproximadamente el 89% del       " +
                                                  "\n requerimiento diario por cada 100 g), que ayuda a fortalecer el sistema inmunol�gico y reducir la duraci�n de los      " +
                                                  "\n s�ntomas. Fresas, con antioxidantes y vitamina C (aportan cerca del 98% del requerimiento diario por cada 100 g),      " +
                                                  "\n esenciales para la protecci�n celular y la recuperaci�n del organismo. Pl�tanos, ricos en potasio (aportan alrededor   " +
                                                  "\n del 10% del requerimiento diario por cada 100 g), que ayuda a reemplazar los electrolitos perdidos por fiebre y        " +
                                                  "\n sudoraci�n. Kiwi, con vitamina C (aproximadamente el 93% del requerimiento diario por cada 100 g) y potasio, que       " +
                                                  "\n contribuyen a la funci�n inmunol�gica y la recuperaci�n del cuerpo. Este es solo un diagn�stico predeterminado l�gico. " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas.    " +
                                                  "\n Para mayor seguridad en el tratamiento adecuado, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica de baja intensidad, evitando esfuerzos           " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperaci�n. HIDRATACI�N: Es fundamental el consumo         " +
                                                  "\n diario de 1.5 a 2 litros de agua (seis a ocho vasos de tama�o regular) para mantener una hidrataci�n �ptima      " +
                                                  "\n y ayudar a fluidificar las secreciones pulmonares. POSIBLE TRATAMIENTO: Para la neumon�a en ni�os, el            " +
                                                  "\n tratamiento suele incluir antibi�ticos como la amoxicilina o azitromicina en caso de infecciones bacterianas,    " +
                                                  "\n adem�s de medicamentos para reducir la fiebre y aliviar los s�ntomas, como el paracetamol. En casos graves,      " +
                                                  "\n puede requerirse hospitalizaci�n y oxigenoterapia. ALIMENTACI�N: Es recomendable el consumo de alimentos que     " +
                                                  "\n fortalezcan el sistema inmune y ayuden a la recuperaci�n, tales como: Naranjas, ricas en vitamina C (aportan     " +
                                                  "\n aproximadamente el 89% del requerimiento diario por cada 100 g), que ayuda a fortalecer el sistema inmunol�gico  " +
                                                  "\n y reducir la duraci�n de los s�ntomas. Espinacas, con hierro (aproximadamente el 15% del requerimiento diario    " +
                                                  "\n por cada 100 g), que contribuye a la producci�n de gl�bulos rojos y mejora la oxigenaci�n del cuerpo. Yogur,     " +
                                                  "\n con probi�ticos que favorecen la salud intestinal y fortalecen el sistema inmune. Este es solo un diagn�stico    " +
                                                  "\n predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las  " +
                                                  "\n respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar m�s de un     " +
                                                  "\n diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica moderada diariamente, con una duraci�n aproximada       " +
                                                  "\n de 60 minutos, incluyendo ejercicios aer�bicos como caminar, correr o nadar, para mejorar la sensibilidad a la          " +
                                                  "\n insulina. HIDRATACI�N: Es fundamental el consumo diario de 1.7 a 2 litros de agua (siete a ocho vasos de tama�o         " +
                                                  "\n regular) para ayudar a mantener niveles adecuados de glucosa en sangre y prevenir la deshidrataci�n. POSIBLE            " +
                                                  "\n TRATAMIENTO: Para la diabetes en ni�os, el tratamiento suele incluir insulina en el caso de diabetes tipo 1,            " +
                                                  "\n mientras que en diabetes tipo 2 puede requerirse metformina y cambios en el estilo de vida. Es esencial el monitoreo    " +
                                                  "\n constante de la glucosa en sangre y el seguimiento m�dico. ALIMENTACI�N: Es recomendable el consumo de alimentos que    " +
                                                  "\n ayuden a regular los niveles de glucosa y fortalezcan el organismo, tales como: Avena, rica en fibra soluble            " +
                                                  "\n (aproximadamente el 10% del requerimiento diario por cada 100 g), que ayuda a estabilizar los niveles de az�car en      " +
                                                  "\n sangre. Frutos secos, con grasas saludables y magnesio (aproximadamente el 15% del requerimiento diario por cada        " +
                                                  "\n 100 g), que contribuyen a la regulaci�n de la glucosa. Legumbres, con prote�nas vegetales y fibra (aproximadamente      " +
                                                  "\n el 20% del requerimiento diario por cada 100 g), que favorecen la saciedad y el control de la glucosa. Este es solo     " +
                                                  "\n un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad     " +
                                                  "\n ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar m�s de    " +
                                                  "\n un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n En ni�as peque�as, el asma puede causar dificultad para respirar, tos persistente, sibilancias y fatiga, afectando     " +
                                                  "\n su bienestar y calidad de vida. EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas suaves, juegos      " +
                                                  "\n tranquilos y ejercicios de respiraci�n para mejorar la oxigenaci�n. Tambi�n es importante evitar esfuerzos f�sicos     " +
                                                  "\n que puedan generar fatiga o dificultar la respiraci�n. HIDRATACI�N: Es esencial el consumo diario de 1.5 a 2 litros    " +
                                                  "\n de agua para mantener el cuerpo hidratado y ayudar a reducir la inflamaci�n de las v�as respiratorias. Adem�s del      " +
                                                  "\n agua pura, se recomienda el consumo de infusiones suaves, jugos naturales sin az�car y caldos ligeros, que pueden      " +
                                                  "\n aportar l�quidos y nutrientes esenciales. Tambi�n es recomendable el consumo de bebidas con electrolitos naturales,    " +
                                                  "\n como agua de coco, para ayudar a reponer los minerales perdidos por la fiebre y sudoraci�n. POSIBLE TRATAMIENTO: El    " +
                                                  "\n asma se trata con broncodilatadores, como salbutamol, para aliviar los episodios agudos, y corticosteroides inhalados, " +
                                                  "\n como budesonida, para reducir la inflamaci�n de las v�as respiratorias. Tambi�n se recomienda el uso de antihistam�nicos " +
                                                  "\n en casos de alergias asociadas y terapia respiratoria, que incluye ejercicios espec�ficos para mejorar la capacidad      " +
                                                  "\n pulmonar. En casos m�s severos, se puede requerir ox�geno suplementario y rehabilitaci�n pulmonar para mejorar la        " +
                                                  "\n funci�n respiratoria. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema respiratorio" +
                                                  "\n y reducir la inflamaci�n, tales como pescados grasos (salm�n, at�n), ricos en �cidos grasos Omega-3, que poseen        " +
                                                  "\n propiedades antiinflamatorias. frutas y verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli), ricas       " +
                                                  "\n en antioxidantes como la vitamina C y carotenoides, que pueden proteger las c�lulas del da�o y fortalecer el sistema   " +
                                                  "\n inmunol�gico. jengibre, que contiene compuestos con efectos antiinflamatorios que podr�an ser beneficiosos para las    " +
                                                  "\n v�as respiratorias. c�rcuma, con su componente activo, la curcumina, que tiene potentes propiedades antiinflamatorias  " +
                                                  "\n y antioxidantes. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la     " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar   " +
                                                  "\n m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n En ni�as peque�as, el VIH puede afectar el sistema inmunol�gico y requerir un tratamiento especializado      " +
                                                  "\n para evitar complicaciones graves. EJERCICIO: Se recomienda actividad f�sica moderada, adaptada a la         " +
                                                  "\n capacidad de la ni�a, como juegos tranquilos, caminatas suaves y ejercicios de movilidad para mejorar        " +
                                                  "\n la circulaci�n y reducir la fatiga. Tambi�n es recomendable realizar ejercicios de respiraci�n y relajaci�n  " +
                                                  "\n para mejorar la oxigenaci�n y reducir el estr�s. HIDRATACI�N: Es esencial el consumo diario de 2 a 2.5       " +
                                                  "\n litros de agua para mantener el cuerpo hidratado y ayudar a reducir los efectos secundarios del tratamiento. " +
                                                  "\n Adem�s del agua pura, se recomienda el consumo de jugos naturales ricos en antioxidantes, como jugo de       " +
                                                  "\n naranja o toronja, que pueden fortalecer el sistema inmunol�gico. Tambi�n es beneficioso ingerir caldos      " +
                                                  "\n ligeros, que aportan l�quidos y minerales esenciales para la recuperaci�n. POSIBLE TRATAMIENTO: El VIH       " +
                                                  "\n en ni�as se trata con terapia antirretroviral (TAR), que incluye medicamentos como lamivudina, abacavir      " +
                                                  "\n y lopinavir, para reducir la carga viral y fortalecer el sistema inmunol�gico. Tambi�n se recomienda un      " +
                                                  "\n plan de alimentaci�n saludable, monitoreo constante de los niveles de CD4 y seguimiento m�dico especializado." +
                                                  "\n En algunos casos, se pueden utilizar medicamentos para tratar infecciones oportunistas, como antibi�ticos    " +
                                                  "\n y antif�ngicos, para prevenir complicaciones. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden " +
                                                  "\n a fortalecer el sistema inmunol�gico y reducir la inflamaci�n, tales como ar�ndanos, ricos en antioxidantes  " +
                                                  "\n y vitamina C. espinacas, que contienen hierro y vitamina A, esenciales para la recuperaci�n. jengibre, con   " +
                                                  "\n propiedades antiinflamatorias y antioxidantes. c�rcuma, con curcumina, que tiene propiedades antiinflamatorias " +
                                                  "\n y antioxidantes. yogur natural, que contiene probi�ticos beneficiosos para la flora intestinal. Este es solo   " +
                                                  "\n un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta       " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un     " +
                                                  "\n diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n En ni�as peque�as, la gonorrea puede causar s�ntomas como secreci�n anormal, dolor al orinar y fiebre,         " +
                                                  "\n y requiere tratamiento inmediato para evitar complicaciones. EJERCICIO: Se recomienda actividad f�sica         " +
                                                  "\n moderada, como caminatas suaves y ejercicios de movilidad para mejorar la circulaci�n y reducir la fatiga.     " +
                                                  "\n Tambi�n es recomendable realizar ejercicios de relajaci�n y respiraci�n para reducir el estr�s, ya que este    " +
                                                  "\n puede afectar la respuesta inmunol�gica y prolongar la infecci�n. HIDRATACI�N: Es esencial el consumo diario   " +
                                                  "\n de 2.5 a 2.75 litros de agua para mantener el cuerpo hidratado y ayudar a reducir la inflamaci�n. Adem�s del   " +
                                                  "\n agua pura, se recomienda el consumo de jugos naturales ricos en vitamina C, como jugo de naranja o toronja,    " +
                                                  "\n que pueden fortalecer el sistema inmunol�gico. Tambi�n es beneficioso ingerir caldos ligeros, que aportan      " +
                                                  "\n l�quidos y minerales esenciales para la recuperaci�n. POSIBLE TRATAMIENTO: La gonorrea se trata con            " +
                                                  "\n antibi�ticos, como ceftriaxona o azitromicina, administrados en una sola dosis o en un r�gimen de varios d�as. " +
                                                  "\n En casos m�s severos, se puede requerir tratamiento prolongado con antibi�ticos adicionales, dependiendo de la " +
                                                  "\n resistencia bacteriana. Tambi�n se recomienda el uso de probi�ticos para restaurar la flora intestinal y       " +
                                                  "\n mejorar la recuperaci�n. En algunos casos, se pueden utilizar medicamentos para aliviar el dolor y la          " +
                                                  "\n inflamaci�n, como ibuprofeno, para reducir los s�ntomas. ALIMENTACI�N: Se recomienda el consumo de alimentos   " +
                                                  "\n que ayuden a fortalecer el sistema inmunol�gico y reducir la inflamaci�n, tales como ar�ndanos, ricos en       " +
                                                  "\n antioxidantes y vitamina C. espinacas, que contienen hierro y vitamina A, esenciales para la recuperaci�n.     " +
                                                  "\n Jengibre, con propiedades antiinflamatorias y antioxidantes. c�rcuma, con curcumina, que tiene propiedades     " +
                                                  "\n antiinflamatorias y antioxidantes. yogur natural, que contiene probi�ticos beneficiosos para la flora intestinal. " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga  " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un  " +
                                                  "\n diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita  " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes Genital." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica moderada, evitando esfuerzos excesivos que puedan       " +
                                                  "\n generar fatiga o estr�s, ya que el herpes puede activarse en situaciones de debilitamiento del sistema inmunol�gico.    " +
                                                  "\n Se sugiere ejercicios suaves como caminatas cortas o juegos tranquilos en casa. HIDRATACI�N: Se recomienda el consumo   " +
                                                  "\n diario de 1.5 a 2 litros de agua al d�a (seis a ocho vasos de tama�o regular) para mantener una adecuada hidrataci�n    " +
                                                  "\n y ayudar a la recuperaci�n. Tambi�n es beneficioso el consumo de infusiones de manzanilla, que pueden ayudar a reducir  " +
                                                  "\n la inflamaci�n, y agua con lim�n, rica en vitamina C, que fortalece el sistema inmune. POSIBLE TRATAMIENTO: Para el     " +
                                                  "\n herpes genital en ni�as, el tratamiento suele incluir antivirales como aciclovir, valaciclovir o famciclovir,           " +
                                                  "\n administrados bajo supervisi�n m�dica para reducir la duraci�n y severidad de los brotes. Tambi�n se recomienda         " +
                                                  "\n el uso de cremas t�picas para aliviar el dolor y la irritaci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos     " +
                                                  "\n que fortalezcan el sistema inmune y ayuden a la recuperaci�n, tales como Yogur natural: fuente de probi�ticos que       " +
                                                  "\n ayudan a fortalecer el sistema inmune y mejorar la salud intestinal. Ajo: contiene alicina, un compuesto con propiedades" +
                                                  "\n antimicrobianas que pueden ayudar a combatir infecciones. Jengibre: con propiedades antiinflamatorias que pueden aliviar" +
                                                  "\n la fatiga y mejorar la respuesta inmune. Frutas c�tricas (naranjas, limones, toronjas): ricas en vitamina C (hasta 89%  " +
                                                  "\n del consumo diario recomendado por cada 100g), que ayuda a mejorar la respuesta inmunol�gica. Miel: ayuda a calmar la   " +
                                                  "\n garganta y tiene propiedades antimicrobianas. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no  " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda " +
                                                  "\n realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del " +
                                                  "\n diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app  " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica moderada, evitando esfuerzos excesivos que puedan    " +
                                                  "\n generar fatiga. Se sugiere ejercicios suaves como caminatas cortas o juegos tranquilos en casa. HIDRATACI�N: Se      " +
                                                  "\n recomienda el consumo diario de 1.5 a 2 litros de agua al d�a (seis a ocho vasos de tama�o regular) para mantener    " +
                                                  "\n una adecuada hidrataci�n y ayudar a la recuperaci�n. Tambi�n es beneficioso el consumo de infusiones de jengibre,    " +
                                                  "\n que pueden ayudar a reducir la inflamaci�n, y agua con lim�n, rica en vitamina C, que fortalece el sistema inmune.   " +
                                                  "\n POSIBLE TRATAMIENTO: Para la s�filis en ni�as, el tratamiento suele incluir penicilina como primera l�nea de defensa,   " +
                                                  "\n administrada bajo supervisi�n m�dica. En casos de alergia a la penicilina, pueden utilizarse otros antibi�ticos como    " +
                                                  "\n doxiciclina o azitromicina. ALIMENTACI�N: Se recomienda el consumo de alimentos que fortalezcan el sistema inmune y     " +
                                                  "\n ayuden a la recuperaci�n, tales como Espinacas: contienen hierro (15% del consumo diario recomendado por cada 100g)     " +
                                                  "\n y vitamina A (56% del consumo diario recomendado por cada 100g), esenciales para la regeneraci�n celular. Yogur natural:   " +
                                                  "\n fuente de probi�ticos que ayudan a restaurar la flora intestinal y fortalecer el sistema inmune. Jengibre: con propiedades " +
                                                  "\n antiinflamatorias que pueden aliviar la fatiga y mejorar la respuesta inmune. Miel: ayuda a calmar la garganta y tiene   " +
                                                  "\n propiedades antimicrobianas. Ajo: contiene alicina, un compuesto con propiedades antimicrobianas que pueden ayudar a     " +
                                                  "\n combatir infecciones. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el  " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar m�s de un      " +
                                                  "\n diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no    " +
                                                  "\n le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera" +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica moderada, evitando esfuerzos excesivos que puedan        " +
                                                  "\n generar fatiga o afectar la funci�n pulmonar. Se sugiere ejercicios suaves como caminatas cortas o juegos tranquilos     " +
                                                  "\n en casa. HIDRATACI�N: Debido a la fiebre y la posible deshidrataci�n causada por la tuberculosis, se recomienda el       " +
                                                  "\n consumo diario de 2 a 2.5 litros de agua al d�a (ocho a diez vasos de tama�o regular). Tambi�n es beneficioso el         " +
                                                  "\n consumo de infusiones de jengibre, que pueden ayudar a reducir la inflamaci�n, y caldos ligeros, que aportan             " +
                                                  "\n electrolitos esenciales. POSIBLE TRATAMIENTO: Para la tuberculosis en ni�as, el tratamiento suele incluir antibi�ticos   " +
                                                  "\n como isoniazida, rifampicina, pirazinamida y etambutol, administrados bajo supervisi�n m�dica durante un per�odo         " +
                                                  "\n prolongado. En casos graves, puede requerirse hospitalizaci�n con tratamiento intravenoso. ALIMENTACI�N: Se recomienda   " +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmune y ayuden a la recuperaci�n, tales como Espinacas: contienen    " +
                                                  "\n hierro (15% del consumo diario recomendado por cada 100g) y vitamina A (56% del consumo diario recomendado por           " +
                                                  "\n cada 100g), esenciales para la regeneraci�n celular. Yogur natural: fuente de probi�ticos que ayudan a restaurar         " +
                                                  "\n la flora intestinal y fortalecer el sistema inmune. Jengibre: con propiedades antiinflamatorias que pueden aliviar       " +
                                                  "\n la fatiga y mejorar la respuesta inmune. Miel: ayuda a calmar la garganta y tiene propiedades antimicrobianas. Ajo:      " +
                                                  "\n contiene alicina, un compuesto con propiedades antimicrobianas que pueden ayudar a combatir infecciones. Frutas c�tricas " +
                                                  "\n (naranjas, limones, toronjas): ricas en vitamina C (hasta 89% del consumo diario recomendado por cada 100g), que ayuda a " +
                                                  "\n mejorar la respuesta inmunol�gica. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar m�s" +
                                                  "\n de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico " +
                                                  "\n no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera" +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N: Es fundamental mantener una hidrataci�n adecuada para reducir la inflamaci�n articular y mejorar           " +
                                                  "\n la movilidad. Se recomienda el consumo diario de 1.5 a 2 litros de agua, adem�s de infusiones de c�rcuma y jengibre,    " +
                                                  "\n que poseen propiedades antiinflamatorias naturales. La artritis idiop�tica juvenil es la forma m�s com�n de artritis    " +
                                                  "\n en ni�os y puede afectar la movilidad y calidad de vida si no se trata adecuadamente. EJERCICIO: La actividad f�sica    " +
                                                  "\n es clave para mejorar la movilidad y reducir la rigidez articular. Se recomienda realizar ejercicios de bajo impacto,   " +
                                                  "\n como nataci�n, yoga y estiramientos suaves, que fortalecen los m�sculos sin generar presi�n en las articulaciones.      " +
                                                  "\n Tambi�n es beneficioso practicar ejercicios de movilidad articular, como rotaciones de mu�ecas y tobillos, para mejorar " +
                                                  "\n la flexibilidad. La terapia f�sica es esencial para evitar la p�rdida de movilidad y fortalecer los m�sculos que rodean " +
                                                  "\n las articulaciones afectadas. POSIBLE TRATAMIENTO: El tratamiento para la artritis incluye antiinflamatorios no         " +
                                                  "\n esteroides (AINE) como ibuprofeno y naproxeno, adem�s de terapia f�sica para mejorar la movilidad. En casos m�s severos," +
                                                  "\n se pueden utilizar medicamentos modificadores de la enfermedad, como metotrexato. En M�xico, estos medicamentos est�n   " +
                                                  "\n disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACI�N: Tambi�n es recomendable el consumo de     " +
                                                  "\n alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como pescados grasos (salm�n," +
                                                  "\n at�n), ricos en Omega-3, con propiedades antiinflamatorias. Frutas c�tricas (naranjas, limones, toronjas), ricas en     " +
                                                  "\n vitamina C, que fortalece el sistema inmunol�gico. Verduras de hoja verde (espinacas, acelgas, br�coli), contienen         " +
                                                  "\n antioxidantes y hierro, esenciales para la salud celular. Frutos secos (almendras, nueces), aportan vitamina E, que ayuda  " +
                                                  "\n a la regeneraci�n celular. Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico." +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta      " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico     " +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud, si la respuesta  " +
                                                  "\n del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece tu visita a la     " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: La hidrataci�n es clave para aliviar la irritaci�n de las v�as respiratorias y reducir la acumulaci�n    " +
                                                  "\n de moco. Se recomienda el consumo diario de 1.5 a 2 litros de agua, adem�s de infusiones de miel y lim�n, que ayudan  " +
                                                  "\n a calmar la tos y mejorar la respiraci�n. La tosferina es una infecci�n respiratoria altamente contagiosa causada por " +
                                                  "\n la bacteria Bordetella pertussis, que puede provocar ataques de tos severos y dificultad para respirar. EJERCICIO:    " +
                                                  "\n La actividad f�sica debe ser moderada y enfocada en mejorar la capacidad pulmonar. Se recomienda realizar ejercicios  " +
                                                  "\n de respiraci�n profunda, como respiraci�n diafragm�tica y con labios fruncidos, que ayudan a mejorar la oxigenaci�n.  " +
                                                  "\n Tambi�n es beneficioso practicar caminatas suaves, evitando ambientes fr�os o contaminados. En casos graves, los ni�os" +
                                                  "\n pueden requerir hospitalizaci�n para recibir ox�geno suplementario. POSIBLE TRATAMIENTO: El tratamiento para la       " +
                                                  "\n tosferina incluye antibi�ticos como eritromicina y azitromicina, adem�s de terapia respiratoria para mejorar la       " +
                                                  "\n funci�n pulmonar. En casos graves, se puede requerir hospitalizaci�n y oxigenoterapia. En M�xico, estos medicamentos  " +
                                                  "\n est�n disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACI�N: Tambi�n es recomendable el consumo" +
                                                  "\n de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como frutas c�tricas    " +
                                                  "\n (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunol�gico. Verduras de hoja verde     " +
                                                  "\n (espinacas, acelgas, br�coli), contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos    " +
                                                  "\n (salm�n, at�n), ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos (almendras, nueces), aportan        " +
                                                  "\n vitamina E, que ayuda a la regeneraci�n celular. Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal " +
                                                  "\n y el sistema inmunol�gico. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda    " +
                                                  "\n realizar m�s de un Diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente.    " +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.  " +
                                                  "\n �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: La hidrataci�n es esencial para reducir la inflamaci�n de las gl�ndulas salivales y aliviar el      " +
                                                  "\n malestar. Se recomienda el consumo diario de 1.5 a 2 litros de agua, adem�s de infusiones de manzanilla y        " +
                                                  "\n jengibre, que poseen propiedades antiinflamatorias. La papera es una infecci�n viral que afecta principalmente   " +
                                                  "\n a las gl�ndulas salivales y puede causar fiebre, dolor muscular y dificultad para tragar. EJERCICIO: Durante     " +
                                                  "\n la enfermedad, se recomienda reposo absoluto para evitar el desgaste energ�tico y permitir que el cuerpo se      " +
                                                  "\n recupere. Una vez que los s�ntomas comienzan a mejorar, es recomendable realizar ejercicios de movilidad suave,  " +
                                                  "\n como estiramientos ligeros y caminatas cortas, para estimular la circulaci�n y evitar la fatiga muscular causada " +
                                                  "\n por el reposo prolongado. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para las paperas, pero se     " +
                                                  "\n recomienda reposo, analg�sicos como ibuprofeno o paracetamol, y compresas fr�as en la zona inflamada para aliviar    " +
                                                  "\n el dolor. En M�xico, estos medicamentos est�n disponibles en instituciones de salud como el IMSS y el Insabi.        " +
                                                  "\n ALIMENTACI�N: Tambi�n es recomendable el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a     " +
                                                  "\n reducir la inflamaci�n, tales como frutas c�tricas (naranjas, limones, toronjas), ricas en vitamina C, que           " +
                                                  "\n fortalece el sistema inmunol�gico. Verduras de hoja verde (espinacas, acelgas, br�coli), contienen antioxidantes     " +
                                                  "\n y hierro, esenciales para la salud celular. Pescados grasos (salm�n, at�n), ricos en Omega-3, con propiedades        " +
                                                  "\n antiinflamatorias. Frutos secos (almendras, nueces), aportan vitamina E, que ayuda a la regeneraci�n celular.        " +
                                                  "\n Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico. Este es solo      " +
                                                  "\n un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad  " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de       " +
                                                  "\n Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud, si la         " +
                                                  "\n respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece    " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tama�o regular)      " +
                                                  "\n para mantener la hidrataci�n y ayudar a reducir la fiebre y el malestar general, lo que es fundamental en el      " +
                                                  "\n proceso de recuperaci�n. El Zika puede provocar fiebre, dolor muscular, fatiga y sarpullido, lo que puede         " +
                                                  "\n llevar a una mayor p�rdida de l�quidos. Es importante que el paciente consuma l�quidos ricos en electrolitos,     " +
                                                  "\n como sueros orales, caldos y jugos naturales sin az�car, para evitar la deshidrataci�n y mantener el equilibrio   " +
                                                  "\n de minerales esenciales. Tambi�n se recomienda el consumo de infusiones suaves, como manzanilla o jengibre, que   " +
                                                  "\n pueden ayudar a aliviar las molestias musculares y mejorar la digesti�n. EJERCICIO: La actividad f�sica debe      " +
                                                  "\n ser muy ligera y supervisada, evitando esfuerzos excesivos que puedan agravar los s�ntomas, ejercicios de         " +
                                                  "\n respiraci�n profunda y movilidad suave pueden ser beneficiosos para mejorar la circulaci�n y reducir la fatiga.   " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para el Zika, pero los s�ntomas pueden aliviarse con     " +
                                                  "\n analg�sicos como paracetamol y acetaminof�n, en M�xico algunas marcas reconocidas incluyen Tempra (paracetamol)   " +
                                                  "\n y Tylenol (acetaminof�n), adem�s se recomienda reposo absoluto, hidrataci�n constante y protecci�n contra picaduras " +
                                                  "\n de mosquitos para evitar complicaciones. ALIMENTACI�N: Para fortalecer el sistema inmunol�gico y apoyar la          " +
                                                  "\n recuperaci�n, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y zinc. Kiwi y naranjas:     " +
                                                  "\n Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa hasta el 100% de la ingesta      " +
                                                  "\n diaria recomendada, fortaleciendo el sistema inmunol�gico. Jengibre y c�rcuma: Poseen propiedades antiinflamatorias " +
                                                  "\n y antioxidantes, ayudando a reducir la inflamaci�n y el malestar general. Almendras y semillas de calabaza: Aportan " +
                                                  "\n 10-15 mg de zinc por cada 100 g, cubriendo hasta el 100% de la recomendaci�n diaria, esencial para la funci�n    " +
                                                  "\n inmunol�gica. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el  " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se       " +
                                                  "\n recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app    " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tama�o regular)        " +
                                                  "\n para evitar la deshidrataci�n causada por la diarrea y los v�mitos, lo que es fundamental en el proceso de          " +
                                                  "\n recuperaci�n. El rotavirus puede provocar fiebre, v�mitos y diarrea intensa, lo que aumenta el riesgo de p�rdida    " +
                                                  "\n de l�quidos y electrolitos. Es esencial consumir l�quidos ricos en electrolitos, como sueros orales y caldos,       " +
                                                  "\n para reponer los minerales perdidos. Tambi�n se recomienda el consumo de agua con lim�n o infusiones suaves, que    " +
                                                  "\n pueden ayudar a aliviar las n�useas y mejorar la digesti�n. EJERCICIO: La actividad f�sica debe ser m�nima y de     " +
                                                  "\n reposo, evitando esfuerzos f�sicos que puedan agravar la fatiga y la deshidrataci�n, se recomienda descanso         " +
                                                  "\n absoluto hasta la recuperaci�n completa. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para el rotavirus,  " +
                                                  "\n pero los s�ntomas pueden aliviarse con rehidrataci�n oral y medicamentos para la fiebre como paracetamol, en M�xico   " +
                                                  "\n algunas marcas reconocidas incluyen Tempra (paracetamol) y Pedialyte (soluci�n de rehidrataci�n oral), adem�s se      " +
                                                  "\n recomienda reposo y una dieta ligera para evitar complicaciones. ALIMENTACI�N: Para fortalecer el sistema digestivo   " +
                                                  "\n y apoyar la recuperaci�n, se recomienda el consumo de alimentos ricos en probi�ticos, fibra y minerales esenciales.   " +
                                                  "\n Yogur y k�fir: Contienen probi�ticos naturales, que ayudan a restaurar la flora intestinal y mejorar la digesti�n.    " +
                                                  "\n Pl�tanos y zanahorias: Son fuentes de fibra soluble, que ayuda a regular el tr�nsito intestinal y reducir la diarrea. " +
                                                  "\n Caldo de pollo y arroz: Son alimentos suaves y f�ciles de digerir, proporcionando electrolitos y energ�a para la      " +
                                                  "\n recuperaci�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar    " +
                                                  "\n m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeriosis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tama�o regular)        " +
                                                  "\n para mantener la hidrataci�n y ayudar a reducir la fiebre y los s�ntomas gastrointestinales, lo que es              " +
                                                  "\n fundamental en el proceso de recuperaci�n. La listeriosis puede provocar fiebre, v�mitos, diarrea y fatiga          " +
                                                  "\n extrema, lo que aumenta el riesgo de deshidrataci�n. Es esencial consumir l�quidos ricos en electrolitos,           " +
                                                  "\n como sueros orales y caldos, para reponer los minerales perdidos. Tambi�n se recomienda el consumo de infusiones    " +
                                                  "\n suaves, como manzanilla o jengibre, que pueden ayudar a aliviar las molestias digestivas y mejorar la absorci�n     " +
                                                  "\n de nutrientes. EJERCICIO: La actividad f�sica debe ser muy ligera y supervisada, evitando esfuerzos excesivos que   " +
                                                  "\n puedan agravar los s�ntomas, ejercicios de respiraci�n profunda y movilidad suave pueden ser beneficiosos para      " +
                                                  "\n mejorar la circulaci�n y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la listeriosis en     " +
                                                  "\n ni�os incluye antibi�ticos como ampicilina y gentamicina, administrados por v�a intravenosa en casos graves, en     " +
                                                  "\n M�xico algunas marcas reconocidas incluyen Amikin (amikacina) y Unasyn (ampicilina/sulbactam), adem�s se recomienda " +
                                                  "\n reposo absoluto y una dieta adecuada para mejorar la recuperaci�n. ALIMENTACI�N: Para fortalecer el sistema         " +
                                                  "\n inmunol�gico y apoyar la recuperaci�n, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes     " +
                                                  "\n y prote�nas. Naranjas y fresas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa  " +
                                                  "\n hasta el 100% de la ingesta diaria recomendada, fortaleciendo el sistema inmunol�gico y ayudando a reducir la          " +
                                                  "\n inflamaci�n. Espinacas y lentejas: Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25% y 40%   " +
                                                  "\n de la ingesta diaria recomendada, lo que ayuda a mejorar la oxigenaci�n celular y reducir el cansancio. Carnes magras  " +
                                                  "\n y huevos: Son una fuente importante de prote�nas, proporcionando entre 20 y 25 g por cada 100 g, lo que equivale al    " +
                                                  "\n 40-50% de la recomendaci�n diaria, esenciales para la regeneraci�n celular y el fortalecimiento muscular. Este es solo " +
                                                  "\n un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni " +
                                                  "\n que las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar m�s de un diagn�stico y   " +
                                                  "\n consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica de baja intensidad, evitando esfuerzos excesivos    " +
                                                  "\n y asegurando un descanso adecuado para la recuperaci�n. Actividades como caminatas suaves, juegos tranquilos y      " +
                                                  "\n ejercicios de respiraci�n pueden ser beneficiosos para mantener el cuerpo activo sin comprometer la recuperaci�n.   " +
                                                  "\n HIDRATACI�N: Es fundamental el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tama�o regular) para  " +
                                                  "\n prevenir la deshidrataci�n causada por la diarrea y ayudar a la recuperaci�n del organismo. POSIBLE TRATAMIENTO:    " +
                                                  "\n Para la shigelosis en ni�os, el tratamiento suele incluir antibi�ticos como la azitromicina o ciprofloxacino en     " +
                                                  "\n casos graves, adem�s de medidas de rehidrataci�n oral para evitar la deshidrataci�n. ALIMENTACI�N: Es recomendable      " +
                                                  "\n el consumo de alimentos que ayuden a la recuperaci�n intestinal y fortalezcan el sistema inmune, tales como: Pl�tanos,  " +
                                                  "\n ricos en potasio (aproximadamente el 10% del requerimiento diario por cada 100 g), que ayudan a reponer electrolitos    " +
                                                  "\n perdidos por la diarrea. Zanahorias, con vitamina A (aproximadamente el 334% del requerimiento diario por cada 100 g),  " +
                                                  "\n que contribuye a la regeneraci�n de la mucosa intestinal. Yogur, con probi�ticos que favorecen la salud intestinal y    " +
                                                  "\n fortalecen el sistema inmune. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al     " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento " +
                                                  "\n adecuado, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la  " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica adaptada a su capacidad respiratoria, evitando        " +
                                                  "\n esfuerzos excesivos y asegurando una respiraci�n controlada. Ejercicios como caminatas suaves, nataci�n, yoga y       " +
                                                  "\n t�cnicas de respiraci�n pueden mejorar la funci�n pulmonar y reducir la fatiga. Es importante realizar calentamiento  " +
                                                  "\n previo y enfriamiento posterior para evitar crisis respiratorias. HIDRATACI�N: Es fundamental el consumo diario de    " +
                                                  "\n 1.7 a 2 litros de agua (siete a ocho vasos de tama�o regular) para mantener las v�as respiratorias hidratadas y       " +
                                                  "\n facilitar la eliminaci�n de secreciones. POSIBLE TRATAMIENTO: Para el EPOC en ni�os, el tratamiento suele incluir     " +
                                                  "\n broncodilatadores como el salbutamol, corticosteroides inhalados como la fluticasona y, en casos graves, oxigenoterapia. " +
                                                  "\n ALIMENTACI�N: Es recomendable el consumo de alimentos que ayuden a mejorar la funci�n pulmonar y fortalezcan el sistema  " +
                                                  "\n inmune, tales como: Pescados grasos (salm�n, at�n), ricos en �cidos grasos Omega-3 (aproximadamente el 50% del           " +
                                                  "\n requerimiento diario por cada 100 g), que poseen propiedades antiinflamatorias que pueden ayudar a reducir la inflamaci�n" +
                                                  "\n de las v�as respiratorias. Frutas y verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli), ricas en       " +
                                                  "\n antioxidantes como la vitamina C (aproximadamente el 90% del requerimiento diario por cada 100 g) y carotenoides,     " +
                                                  "\n que pueden proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico. Jengibre, contiene compuestos con      " +
                                                  "\n efectos antiinflamatorios que podr�an ser beneficiosos para las v�as respiratorias. C�rcuma, con su componente activo," +
                                                  "\n la curcumina, tambi�n tiene potentes propiedades antiinflamatorias y antioxidantes. Este es solo un diagn�stico       " +
                                                  "\n predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las       " +
                                                  "\n respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar m�s de un diagn�stico" +
                                                  "\n y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica moderada, evitando esfuerzos excesivos y asegurando  " +
                                                  "\n una recuperaci�n adecuada. Ejercicios como caminatas suaves, estiramientos y yoga pueden ser beneficiosos para       " +
                                                  "\n mantener el cuerpo activo sin comprometer el tratamiento. HIDRATACI�N: Es fundamental el consumo diario de 1.5 a 2   " +
                                                  "\n litros de agua (seis a ocho vasos de tama�o regular) para ayudar a eliminar toxinas y mantener el organismo en       " +
                                                  "\n equilibrio. POSIBLE TRATAMIENTO: Para la clamidia en ni�os, el tratamiento suele incluir antibi�ticos como la        " +
                                                  "\n azitromicina o doxiciclina, administrados bajo supervisi�n m�dica. ALIMENTACI�N: Es recomendable el consumo de       " +
                                                  "\n alimentos que ayuden a fortalecer el sistema inmune y mejorar la recuperaci�n, tales como: Naranjas, ricas en        " +
                                                  "\n vitamina C (aproximadamente el 89% del requerimiento diario por cada 100 g), que ayuda a fortalecer el sistema       " +
                                                  "\n inmunol�gico y reducir la duraci�n de los s�ntomas. Espinacas, con hierro (aproximadamente el 15% del requerimiento  " +
                                                  "\n diario por cada 100 g), que contribuye a la producci�n de gl�bulos rojos y mejora la oxigenaci�n del cuerpo. Yogur,  " +
                                                  "\n con probi�ticos que favorecen la salud intestinal y fortalecen el sistema inmune. Este es solo un diagn�stico        " +
                                                  "\n predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las      " +
                                                  "\n respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar m�s de un   " +
                                                  "\n diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraerMeningitis bacteriana." +
                                                  "\n En ni�as peque�as, la meningitis bacteriana es una infecci�n grave que afecta las membranas que recubren el          " +
                                                  "\n cerebro y la m�dula espinal, pudiendo causar fiebre alta, rigidez en el cuello, v�mitos y alteraciones del           " +
                                                  "\n estado mental. EJERCICIO: Se recomienda actividad f�sica muy ligera, como movimientos suaves y ejercicios de         " +
                                                  "\n respiraci�n para mejorar la oxigenaci�n. Tambi�n es importante evitar esfuerzos f�sicos que puedan generar           " +
                                                  "\n fatiga o dificultar la recuperaci�n. HIDRATACI�N: Es fundamental el consumo diario de 1.5 a 2 litros de agua         " +
                                                  "\n para mantener el cuerpo hidratado y ayudar a reducir la fiebre y el malestar. Adem�s del agua pura, se recomienda    " +
                                                  "\n el consumo de caldos ligeros, jugos naturales sin az�car y infusiones suaves, que pueden aportar l�quidos y          " +
                                                  "\n nutrientes esenciales. Tambi�n es recomendable el consumo de bebidas con electrolitos naturales, como agua de        " +
                                                  "\n coco, para ayudar a reponer los minerales perdidos por la fiebre y sudoraci�n. POSIBLE TRATAMIENTO: La meningitis    " +
                                                  "\n bacteriana se trata con antibi�ticos intravenosos, como ceftriaxona, vancomicina o ampicilina, dependiendo del       " +
                                                  "\n agente causal. En casos graves, puede requerirse hospitalizaci�n para monitoreo neurol�gico y administraci�n de      " +
                                                  "\n l�quidos intravenosos. Tambi�n se recomienda el uso de medicamentos para reducir la fiebre y aliviar el dolor,       " +
                                                  "\n como paracetamol o ibuprofeno. En algunos casos, se pueden utilizar corticoides para reducir la inflamaci�n cerebral " +
                                                  "\n y prevenir complicaciones neurol�gicas. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer  " +
                                                  "\n el sistema inmunol�gico y reducir la inflamaci�n, tales como ar�ndanos, ricos en antioxidantes y vitamina C. espinacas," +
                                                  "\n que contienen hierro y vitamina A, esenciales para la recuperaci�n. jengibre, con propiedades antiinflamatorias y      " +
                                                  "\n antioxidantes. c�rcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes. yogur natural, que     " +
                                                  "\n contiene probi�ticos beneficiosos para la flora intestinal. Este es solo un diagn�stico predeterminado l�gico, haberlo " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas." +
                                                  "\n Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado." +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n En ni�as peque�as, el c�ncer puede manifestarse de diversas formas y requerir un tratamiento especializado seg�n el   " +
                                                  "\n tipo y la etapa de la enfermedad. EJERCICIO: Se recomienda actividad f�sica moderada, adaptada a la capacidad de la   " +
                                                  "\n ni�a, como juegos tranquilos, caminatas suaves y ejercicios de movilidad para mejorar la circulaci�n y reducir la     " +
                                                  "\n fatiga. Tambi�n es recomendable realizar ejercicios de respiraci�n y relajaci�n para mejorar la oxigenaci�n y reducir " +
                                                  "\n el estr�s. HIDRATACI�N: Es esencial el consumo diario de 2 a 2.5 litros de agua para mantener el cuerpo hidratado y   " +
                                                  "\n ayudar a reducir los efectos secundarios del tratamiento. Adem�s del agua pura, se recomienda el consumo de jugos     " +
                                                  "\n naturales ricos en antioxidantes, como jugo de naranja o toronja, que pueden fortalecer el sistema inmunol�gico.      " +
                                                  "\n Tambi�n es beneficioso ingerir caldos ligeros, que aportan l�quidos y minerales esenciales para la recuperaci�n.      " +
                                                  "\n POSIBLE TRATAMIENTO: El c�ncer en ni�as se trata con quimioterapia, radioterapia o cirug�a, dependiendo del tipo      " +
                                                  "\n y la etapa de la enfermedad. Tambi�n se pueden utilizar terapias dirigidas, como inmunoterapia, para fortalecer       " +
                                                  "\n el sistema inmunol�gico y combatir las c�lulas cancerosas. En algunos casos, se recomienda el uso de medicamentos     " +
                                                  "\n para aliviar los efectos secundarios, como antiem�ticos para controlar las n�useas y analg�sicos para reducir el      " +
                                                  "\n dolor. Adem�s, se pueden emplear terapias complementarias, como apoyo psicol�gico y nutricional, para mejorar la      " +
                                                  "\n calidad de vida de la paciente. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema" +
                                                  "\n inmunol�gico y reducir la inflamaci�n, tales como ar�ndanos, ricos en antioxidantes y vitamina C. espinacas, que      " +
                                                  "\n contienen hierro y vitamina A, esenciales para la recuperaci�n. jengibre, con propiedades antiinflamatorias y         " +
                                                  "\n antioxidantes. c�rcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes. yogur natural, que    " +
                                                  "\n contiene probi�ticos beneficiosos para la flora intestinal. Este es solo un diagn�stico predeterminado l�gico, haberlo" +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas." +
                                                  "\n Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado." +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.30-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica moderada a intensa diariamente, con una duraci�n      " +
                                                  "\n aproximada de 60 minutos, aunque esta cantidad puede ajustarse seg�n su edad y condici�n. Actividades como juegos     " +
                                                  "\n activos, caminatas, baile y ejercicios aer�bicos pueden ser beneficiosos para fortalecer su sistema inmunol�gico.     " +
                                                  "\n HIDRATACI�N: Es fundamental el consumo diario de 1.7 litros de agua (siete vasos de tama�o regular) para mantener     " +
                                                  "\n una hidrataci�n adecuada y ayudar al cuerpo a combatir la enfermedad. POSIBLE TRATAMIENTO: Para la gripe en ni�os,    " +
                                                  "\n el tratamiento suele incluir medicamentos para reducir la fiebre y aliviar los s�ntomas, como el paracetamol (Tempra) " +
                                                  "\n o el ibuprofeno. En casos espec�ficos, se pueden utilizar antivirales como el oseltamivir (Tamiflu). ALIMENTACI�N:    " + 
                                                  "\n Es recomendable el consumo de frutas y verduras que fortalezcan el sistema inmune, tales como: Naranjas, ricas en     " +
                                                  "\n vitamina C (aportan aproximadamente el 89% del requerimiento diario por cada 100 g), que ayuda a fortalecer el        " +
                                                  "\n sistema inmunol�gico y reducir la duraci�n de los s�ntomas. Fresas, con antioxidantes y vitamina C (aportan cerca     " +
                                                  "\n del 98% del requerimiento diario por cada 100 g), esenciales para la protecci�n celular y la recuperaci�n del         " +
                                                  "\n organismo. Pl�tanos, ricos en potasio (aportan alrededor del 10% del requerimiento diario por cada 100 g), que        " +
                                                  "\n ayuda a reemplazar los electrolitos perdidos por fiebre y sudoraci�n. Kiwi, con vitamina C (aproximadamente el        " +
                                                  "\n 93% del requerimiento diario por cada 100 g) y potasio, que contribuyen a la funci�n inmunol�gica y la recuperaci�n   " +
                                                  "\n del cuerpo. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente" +
                                                  "\n tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado, se " +
                                                  "\n recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app   " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica de baja intensidad, evitando esfuerzos             " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperaci�n. Actividades como caminatas suaves, juegos        " +
                                                  "\n tranquilos y ejercicios de respiraci�n pueden ser beneficiosos para mantener el cuerpo activo sin comprometer      " +
                                                  "\n la recuperaci�n. HIDRATACI�N: Es fundamental el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de     " +
                                                  "\n tama�o regular) para mantener una hidrataci�n �ptima y ayudar a fluidificar las secreciones pulmonares. POSIBLE    " +
                                                  "\n TRATAMIENTO: Para la neumon�a en ni�os, el tratamiento suele incluir antibi�ticos como la amoxicilina o azitromicina " +
                                                  "\n en caso de infecciones bacterianas, adem�s de medicamentos para reducir la fiebre y aliviar los s�ntomas, como el    " +
                                                  "\n paracetamol. En casos graves, puede requerirse hospitalizaci�n y oxigenoterapia. ALIMENTACI�N: Es recomendable el    " +
                                                  "\n consumo de alimentos que fortalezcan el sistema inmune y ayuden a la recuperaci�n, tales como: Naranjas, ricas en    " +
                                                  "\n vitamina C (aportan aproximadamente el 89% del requerimiento diario por cada 100 g), que ayuda a fortalecer el       " +
                                                  "\n sistema inmunol�gico y reducir la duraci�n de los s�ntomas. Espinacas, con hierro (aproximadamente el 15% del        " +
                                                  "\n requerimiento diario por cada 100 g), que contribuye a la producci�n de gl�bulos rojos y mejora la oxigenaci�n       " +
                                                  "\n del cuerpo. Yogur, con probi�ticos que favorecen la salud intestinal y fortalecen el sistema inmune. Este es solo    " +
                                                  "\n un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad  " +
                                                  "\n ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar m�s    " +
                                                  "\n de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica moderada diariamente, con una duraci�n aproximada     " +
                                                  "\n de 60 minutos, incluyendo ejercicios aer�bicos como caminar, correr o nadar, para mejorar la sensibilidad a la        " +
                                                  "\n insulina. Tambi�n se recomienda la pr�ctica de ejercicios de resistencia como el yoga o el entrenamiento ligero       " +
                                                  "\n con pesas para mejorar el metabolismo de la glucosa. HIDRATACI�N: Es fundamental el consumo diario de 1.7 a 2 litros  " +
                                                  "\n de agua (siete a ocho vasos de tama�o regular) para ayudar a mantener niveles adecuados de glucosa en sangre y      " + 
                                                  "\n prevenir la deshidrataci�n. POSIBLE TRATAMIENTO: Para la diabetes en ni�os, el tratamiento suele incluir insulina   " +
                                                  "\n en el caso de diabetes tipo 1, mientras que en diabetes tipo 2 puede requerirse metformina y cambios en el estilo   " +
                                                  "\n de vida. Es esencial el monitoreo constante de la glucosa en sangre y el seguimiento m�dico. ALIMENTACI�N: Es       " +
                                                  "\n recomendable el consumo de alimentos que ayuden a regular los niveles de glucosa y fortalezcan el organismo, tales  " +
                                                  "\n como: Avena, rica en fibra soluble (aproximadamente el 10% del requerimiento diario por cada 100 g), que ayuda a    " +
                                                  "\n estabilizar los niveles de az�car en sangre. Frutos secos, con grasas saludables y magnesio (aproximadamente el 15% " +
                                                  "\n del requerimiento diario por cada 100 g), que contribuyen a la regulaci�n de la glucosa. Legumbres, con prote�nas   " +
                                                  "\n vegetales y fibra (aproximadamente el 20% del requerimiento diario por cada 100 g), que favorecen la saciedad y el  " +
                                                  "\n control de la glucosa. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100%   " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento  " +
                                                  "\n adecuado, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita   " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n En ni�as peque�as, el asma puede causar dificultad para respirar, tos persistente, sibilancias y fatiga, afectando     " +
                                                  "\n su bienestar y calidad de vida. EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas suaves, juegos      " +
                                                  "\n tranquilos y ejercicios de respiraci�n para mejorar la oxigenaci�n. Tambi�n es importante evitar esfuerzos f�sicos     " +
                                                  "\n que puedan generar fatiga o dificultar la respiraci�n. HIDRATACI�N: Es esencial el consumo diario de 1.5 a 2 litros    " +
                                                  "\n de agua para mantener el cuerpo hidratado y ayudar a reducir la inflamaci�n de las v�as respiratorias. Adem�s del      " +
                                                  "\n agua pura, se recomienda el consumo de infusiones suaves, jugos naturales sin az�car y caldos ligeros, que pueden      " +
                                                  "\n aportar l�quidos y nutrientes esenciales. Tambi�n es recomendable el consumo de bebidas con electrolitos naturales,    " +
                                                  "\n como agua de coco, para ayudar a reponer los minerales perdidos por la fiebre y sudoraci�n. POSIBLE TRATAMIENTO: El    " +
                                                  "\n asma se trata con broncodilatadores, como salbutamol, para aliviar los episodios agudos, y corticosteroides            " +
                                                  "\n inhalados, como budesonida, para reducir la inflamaci�n de las v�as respiratorias. Tambi�n se recomienda el uso de     " +
                                                  "\n antihistam�nicos en casos de alergias asociadas y terapia respiratoria, que incluye ejercicios espec�ficos para        " +
                                                  "\n mejorar la capacidad pulmonar. En casos m�s severos, se puede requerir ox�geno suplementario y rehabilitaci�n          " +
                                                  "\n pulmonar para mejorar la funci�n respiratoria. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a        " +
                                                  "\n fortalecer el sistema respiratorio y reducir la inflamaci�n, tales como pescados grasos (salm�n, at�n), ricos en       " +
                                                  "\n �cidos grasos Omega-3, que poseen propiedades antiinflamatorias. frutas y verduras de colores vivos (ar�ndanos,        " +
                                                  "\n fresas, espinacas, br�coli), ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las         " +
                                                  "\n c�lulas del da�o y fortalecer el sistema inmunol�gico. jengibre, que contiene compuestos con efectos antiinflamatorios " +
                                                  "\n que podr�an ser beneficiosos para las v�as respiratorias. c�rcuma, con su componente activo, la curcumina, que         " +
                                                  "\n tiene potentes propiedades antiinflamatorias y antioxidantes. Este es solo un diagn�stico predeterminado l�gico,       " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente " +
                                                  "\n correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el   " +
                                                  "\n tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n En ni�as peque�as, el VIH puede afectar el sistema inmunol�gico y requerir un tratamiento especializado para        " +
                                                  "\n evitar complicaciones graves. EJERCICIO: Se recomienda actividad f�sica moderada, adaptada a la capacidad de        " +
                                                  "\n la ni�a, como juegos tranquilos, caminatas suaves y ejercicios de movilidad para mejorar la circulaci�n y           " +
                                                  "\n reducir la fatiga. Tambi�n es recomendable realizar ejercicios de respiraci�n y relajaci�n para mejorar la          " +
                                                  "\n oxigenaci�n y reducir el estr�s. HIDRATACI�N: Es esencial el consumo diario de 2 a 2.5 litros de agua para          " +
                                                  "\n mantener el cuerpo hidratado y ayudar a reducir los efectos secundarios del tratamiento. Adem�s del agua pura,      " +
                                                  "\n se recomienda el consumo de jugos naturales ricos en antioxidantes, como jugo de naranja o toronja, que pueden      " +
                                                  "\n fortalecer el sistema inmunol�gico. Tambi�n es beneficioso ingerir caldos ligeros, que aportan l�quidos y           " +
                                                  "\n minerales esenciales para la recuperaci�n. POSIBLE TRATAMIENTO: El VIH en ni�as se trata con terapia                " +
                                                  "\n antirretroviral (TAR), que incluye medicamentos como lamivudina, abacavir y lopinavir, para reducir la carga        " +
                                                  "\n viral y fortalecer el sistema inmunol�gico. Tambi�n se recomienda un plan de alimentaci�n saludable, monitoreo      " +
                                                  "\n constante de los niveles de CD4 y seguimiento m�dico especializado. En algunos casos, se pueden utilizar            " +
                                                  "\n medicamentos para tratar infecciones oportunistas, como antibi�ticos y antif�ngicos, para prevenir complicaciones.  " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmunol�gico y reducir       " +
                                                  "\n la inflamaci�n, tales como ar�ndanos, ricos en antioxidantes y vitamina C. espinacas, que contienen hierro y        " +
                                                  "\n vitamina A, esenciales para la recuperaci�n. jengibre, con propiedades antiinflamatorias y antioxidantes.           " +
                                                  "\n c�rcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes. yogur natural, que contiene        " +
                                                  "\n probi�ticos beneficiosos para la flora intestinal. Este es solo un diagn�stico predeterminado l�gico, haberlo       " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente      " +
                                                  "\n correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el       " +
                                                  "\n tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n En ni�as peque�as, la gonorrea puede causar s�ntomas como secreci�n anormal, dolor al orinar y fiebre, y requiere      " +
                                                  "\n tratamiento inmediato para evitar complicaciones. EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas   " +
                                                  "\n suaves y ejercicios de movilidad para mejorar la circulaci�n y reducir la fatiga. Tambi�n es recomendable realizar     " +
                                                  "\n ejercicios de relajaci�n y respiraci�n para reducir el estr�s, ya que este puede afectar la respuesta inmunol�gica     " +
                                                  "\n y prolongar la infecci�n. HIDRATACI�N: Es esencial el consumo diario de 2.5 a 2.75 litros de agua para mantener el     " +
                                                  "\n cuerpo hidratado y ayudar a reducir la inflamaci�n. Adem�s del agua pura, se recomienda el consumo de jugos naturales  " +
                                                  "\n ricos en vitamina C, como jugo de naranja o toronja, que pueden fortalecer el sistema inmunol�gico. Tambi�n es         " +
                                                  "\n beneficioso ingerir caldos ligeros, que aportan l�quidos y minerales esenciales para la recuperaci�n. POSIBLE          " +
                                                  "\n TRATAMIENTO: La gonorrea se trata con antibi�ticos, como ceftriaxona o azitromicina, administrados en una sola         " +
                                                  "\n dosis o en un r�gimen de varios d�as. En casos m�s severos, se puede requerir tratamiento prolongado con antibi�ticos  " +
                                                  "\n adicionales, dependiendo de la resistencia bacteriana. Tambi�n se recomienda el uso de probi�ticos para restaurar      " +
                                                  "\n la flora intestinal y mejorar la recuperaci�n. En algunos casos, se pueden utilizar medicamentos para aliviar el       " +
                                                  "\n dolor y la inflamaci�n, como ibuprofeno, para reducir los s�ntomas. ALIMENTACI�N: Se recomienda el consumo de alimentos" +
                                                  "\n que ayuden a fortalecer el sistema inmunol�gico y reducir la inflamaci�n, tales como ar�ndanos, ricos en antioxidantes " +
                                                  "\n y vitamina C. espinacas, que contienen hierro y vitamina A, esenciales para la recuperaci�n. jengibre, con propiedades " +
                                                  "\n antiinflamatorias y antioxidantes. c�rcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes.    " +
                                                  "\n yogur natural, que contiene probi�ticos beneficiosos para la flora intestinal. Este es solo un diagn�stico predeterminado" +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean         " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer " +
                                                  "\n el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes Genital." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica moderada, evitando esfuerzos excesivos que puedan       " +
                                                  "\n generar fatiga o estr�s, ya que el herpes puede activarse en situaciones de debilitamiento del sistema inmunol�gico.    " +
                                                  "\n Se sugiere ejercicios suaves como caminatas cortas o juegos tranquilos en casa. HIDRATACI�N: Se recomienda el consumo   " +
                                                  "\n diario de 1.5 a 2 litros de agua al d�a (seis a ocho vasos de tama�o regular) para mantener una adecuada hidrataci�n    " +
                                                  "\n y ayudar a la recuperaci�n. Tambi�n es beneficioso el consumo de infusiones de manzanilla, que pueden ayudar a reducir  " +
                                                  "\n la inflamaci�n, y agua con lim�n, rica en vitamina C, que fortalece el sistema inmune. POSIBLE TRATAMIENTO: Para el     " +
                                                  "\n herpes genital en ni�as, el tratamiento suele incluir antivirales como aciclovir, valaciclovir o famciclovir,           " +
                                                  "\n administrados bajo supervisi�n m�dica para reducir la duraci�n y severidad de los brotes. Tambi�n se recomienda el      " +
                                                  "\n uso de cremas t�picas para aliviar el dolor y la irritaci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos que    " +
                                                  "\n fortalezcan el sistema inmune y ayuden a la recuperaci�n, tales como Yogur natural: fuente de probi�ticos que ayudan    " +
                                                  "\n a fortalecer el sistema inmune y mejorar la salud intestinal. Ajo: contiene alicina, un compuesto con propiedades       " +
                                                  "\n antimicrobianas que pueden ayudar a combatir infecciones. Jengibre: con propiedades antiinflamatorias que pueden aliviar" +
                                                  "\n la fatiga y mejorar la respuesta inmune. Frutas c�tricas (naranjas, limones, toronjas): ricas en vitamina C, que ayuda  " +
                                                  "\n a mejorar la respuesta inmunol�gica. Miel: ayuda a calmar la garganta y tiene propiedades antimicrobianas. Este es solo " +
                                                  "\n un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni  " +
                                                  "\n que las respuestas sean completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en   " +
                                                  "\n el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda  " +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores..");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica moderada, evitando esfuerzos excesivos que puedan       " +
                                                  "\n generar fatiga. Se sugiere ejercicios suaves como caminatas cortas o juegos tranquilos en casa. HIDRATACI�N: Se         " +
                                                  "\n recomienda el consumo diario de 1.5 a 2 litros de agua al d�a (seis a ocho vasos de tama�o regular) para mantener       " +
                                                  "\n una adecuada hidrataci�n y ayudar a la recuperaci�n. Tambi�n es beneficioso el consumo de infusiones de jengibre,       " +
                                                  "\n que pueden ayudar a reducir la inflamaci�n, y agua con lim�n, rica en vitamina C, que fortalece el sistema inmune.      " +
                                                  "\n POSIBLE TRATAMIENTO: Para la s�filis en ni�as, el tratamiento suele incluir penicilina como primera l�nea de defensa,   " +
                                                  "\n administrada bajo supervisi�n m�dica. En casos de alergia a la penicilina, pueden utilizarse otros antibi�ticos como    " +
                                                  "\n doxiciclina o azitromicina. ALIMENTACI�N: Se recomienda el consumo de alimentos que fortalezcan el sistema inmune y     " +
                                                  "\n ayuden a la recuperaci�n, tales como Espinacas: contienen hierro y vitamina A, esenciales para la regeneraci�n celular. " +
                                                  "\n Yogur natural: fuente de probi�ticos que ayudan a restaurar la flora intestinal y fortalecer el sistema inmune.         " +
                                                  "\n Jengibre: con propiedades antiinflamatorias que pueden aliviar la fatiga y mejorar la respuesta inmune. Miel:           " +
                                                  "\n ayuda a calmar la garganta y tiene propiedades antimicrobianas. Ajo: contiene alicina, un compuesto con propiedades     " +
                                                  "\n antimicrobianas que pueden ayudar a combatir infecciones. Este es solo un diagn�stico predeterminado l�gico. Haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente          " +
                                                  "\n correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s,        " +
                                                  "\n por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.            " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica moderada, evitando esfuerzos excesivos                  " +
                                                  "\n que puedan generar fatiga o afectar la funci�n pulmonar. Se sugiere ejercicios suaves como caminatas cortas             " +
                                                  "\n o juegos tranquilos en casa. HIDRATACI�N: Debido a la fiebre y la posible deshidrataci�n causada por la                 " +
                                                  "\n tuberculosis, se recomienda el consumo diario de 2 a 2.5 litros de agua al d�a (ocho a diez vasos de tama�o             " +
                                                  "\n regular). Tambi�n es beneficioso el consumo de infusiones de jengibre, que pueden ayudar a reducir la inflamaci�n,      " +
                                                  "\n y caldos ligeros, que aportan electrolitos esenciales. POSIBLE TRATAMIENTO: Para la tuberculosis en ni�as, el           " +
                                                  "\n tratamiento suele incluir antibi�ticos como isoniazida, rifampicina, pirazinamida y etambutol, administrados bajo       " +
                                                  "\n supervisi�n m�dica durante un per�odo prolongado. En casos graves, puede requerirse hospitalizaci�n con tratamiento     " +
                                                  "\n intravenoso. ALIMENTACI�N: Se recomienda el consumo de alimentos que fortalezcan el sistema inmune y ayuden a la        " +
                                                  "\n recuperaci�n, tales como Espinacas: contienen hierro y vitamina A, esenciales para la regeneraci�n celular. Yogur       " +
                                                  "\n natural: fuente de probi�ticos que ayudan a restaurar la flora intestinal y fortalecer el sistema inmune. Jengibre:     " +
                                                  "\n con propiedades antiinflamatorias que pueden aliviar la fatiga y mejorar la respuesta inmune. Miel: ayuda a calmar      " +
                                                  "\n la garganta y tiene propiedades antimicrobianas. Ajo: contiene alicina, un compuesto con propiedades antimicrobianas    " +
                                                  "\n que pueden ayudar a combatir infecciones. Frutas c�tricas (naranjas, limones, toronjas): ricas en vitamina C, que       " +
                                                  "\n ayuda a mejorar la respuesta inmunol�gica. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no     " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda " +
                                                  "\n realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta " +
                                                  "\n del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N: Es fundamental mantener una hidrataci�n adecuada para reducir la inflamaci�n articular y mejorar la        " +
                                                  "\n movilidad. Se recomienda el consumo diario de 1.5 a 2 litros de agua, adem�s de infusiones de c�rcuma y jengibre,       " +
                                                  "\n que poseen propiedades antiinflamatorias naturales. La artritis idiop�tica juvenil es la forma m�s com�n de artritis    " +
                                                  "\n en ni�os y puede afectar la movilidad y calidad de vida si no se trata adecuadamente. La hidrataci�n tambi�n ayuda a    " +
                                                  "\n mantener la elasticidad de los tejidos y a reducir la rigidez matutina en las articulaciones. EJERCICIO: La actividad   " +
                                                  "\n f�sica es clave para mejorar la movilidad y reducir la rigidez articular. Se recomienda realizar ejercicios de bajo     " +
                                                  "\n impacto, como nataci�n, yoga y estiramientos suaves, que fortalecen los m�sculos sin generar presi�n en las             " +
                                                  "\n articulaciones. Tambi�n es beneficioso practicar ejercicios de movilidad articular, como rotaciones de mu�ecas y        " +
                                                  "\n tobillos, para mejorar la flexibilidad. La terapia f�sica es esencial para evitar la p�rdida de movilidad y fortalecer  " +
                                                  "\n los m�sculos que rodean las articulaciones afectadas. POSIBLE TRATAMIENTO: El tratamiento para la artritis incluye      " +
                                                  "\n antiinflamatorios no esteroides (AINE) como ibuprofeno y naproxeno, adem�s de terapia f�sica para mejorar la movilidad. " +
                                                  "\n En casos m�s severos, se pueden utilizar medicamentos modificadores de la enfermedad, como metotrexato. En M�xico,      " +
                                                  "\n estos medicamentos est�n disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACI�N: Tambi�n es       " +
                                                  "\n recomendable el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales   " +
                                                  "\n como pescados grasos (salm�n, at�n), ricos en Omega-3, con propiedades antiinflamatorias. Frutas c�tricas (naranjas,    " +
                                                  "\n limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunol�gico. Verduras de hoja verde (espinacas,      " +
                                                  "\n acelgas, br�coli), contienen antioxidantes y hierro, esenciales para la salud celular. Frutos secos (almendras, nueces),   " +
                                                  "\n aportan vitamina E, que ayuda a la regeneraci�n celular. Yogur natural, fuente de probi�ticos, que favorecen la salud      " +
                                                  "\n intestinal y el sistema inmunol�gico. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza   " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda " +
                                                  "\n realizar m�s de un Diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, " +
                                                  "\n por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L.      " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: La hidrataci�n es clave para aliviar la irritaci�n de las v�as respiratorias y reducir la acumulaci�n     " +
                                                  "\n de moco. Se recomienda el consumo diario de 1.5 a 2 litros de agua, adem�s de infusiones de miel y lim�n, que ayudan   " +
                                                  "\n a calmar la tos y mejorar la respiraci�n. La tosferina es una infecci�n respiratoria altamente contagiosa causada por  " +
                                                  "\n la bacteria Bordetella pertussis, que puede provocar ataques de tos severos y dificultad para respirar. Mantener una   " +
                                                  "\n hidrataci�n adecuada ayuda a reducir la viscosidad del moco y facilita su expulsi�n, evitando la obstrucci�n de las    " +
                                                  "\n v�as respiratorias. EJERCICIO: La actividad f�sica debe ser moderada y enfocada en mejorar la capacidad pulmonar. Se   " +
                                                  "\n recomienda realizar ejercicios de respiraci�n profunda, como respiraci�n diafragm�tica y con labios fruncidos, que     " +
                                                  "\n ayudan a mejorar la oxigenaci�n. Tambi�n es beneficioso practicar caminatas suaves, evitando ambientes fr�os o         " +
                                                  "\n contaminados. En casos graves, los ni�os pueden requerir hospitalizaci�n para recibir ox�geno suplementario. POSIBLE   " +
                                                  "\n TRATAMIENTO: El tratamiento para la tosferina incluye antibi�ticos como eritromicina y azitromicina, adem�s de terapia " +
                                                  "\n respiratoria para mejorar la funci�n pulmonar. En casos graves, se puede requerir hospitalizaci�n y oxigenoterapia.    " +
                                                  "\n En M�xico, estos medicamentos est�n disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACI�N:      " +
                                                  "\n Tambi�n es recomendable el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, " +
                                                  "\n tales como frutas c�tricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunol�gico.      " +
                                                  "\n Verduras de hoja verde (espinacas, acelgas, br�coli), contienen antioxidantes y hierro, esenciales para la salud       " +
                                                  "\n celular. Pescados grasos (salm�n, at�n), ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos (almendras, " +
                                                  "\n nueces), aportan vitamina E, que ayuda a la regeneraci�n celular. Yogur natural, fuente de probi�ticos, que favorecen  " +
                                                  "\n la salud intestinal y el sistema inmunol�gico. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado   " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para    " +
                                                  "\n ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado " +
                                                  "\n del paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar  " +
                                                  "\n a su m�dico. �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: La hidrataci�n es esencial para reducir la inflamaci�n de las gl�ndulas salivales y aliviar el malestar.    " +
                                                  "\n Se recomienda el consumo diario de 1.5 a 2 litros de agua, adem�s de infusiones de manzanilla y jengibre, que poseen     " +
                                                  "\n propiedades antiinflamatorias. La papera es una infecci�n viral que afecta principalmente a las gl�ndulas salivales y    " +
                                                  "\n puede causar fiebre, dolor muscular y dificultad para tragar. Mantener una hidrataci�n adecuada ayuda a reducir la       " +
                                                  "\n sequedad bucal y a aliviar la inflamaci�n de las gl�ndulas afectadas. EJERCICIO: Durante la enfermedad, se recomienda    " +
                                                  "\n reposo absoluto para evitar el desgaste energ�tico y permitir que el cuerpo se recupere. Una vez que los s�ntomas        " +
                                                  "\n comienzan a mejorar, es recomendable realizar ejercicios de movilidad suave, como estiramientos ligeros y caminatas      " +
                                                  "\n cortas, para estimular la circulaci�n y evitar la fatiga muscular causada por el reposo prolongado. POSIBLE TRATAMIENTO: " +
                                                  "\n No existe un tratamiento espec�fico para las paperas, pero se recomienda reposo, analg�sicos como ibuprofeno o paracetamol,  " +
                                                  "\n y compresas fr�as en la zona inflamada para aliviar el dolor. En M�xico, estos medicamentos est�n disponibles en             " +
                                                  "\n instituciones de salud como el IMSS y el Insabi. ALIMENTACI�N: Tambi�n es recomendable el consumo de alimentos que           " +
                                                  "\n fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como frutas c�tricas (naranjas, limones,        " +
                                                  "\n toronjas), ricas en vitamina C, que fortalece el sistema inmunol�gico. Verduras de hoja verde (espinacas, acelgas, br�coli), " +
                                                  "\n contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos (salm�n, at�n), ricos en Omega-3,        " +
                                                  "\n con propiedades antiinflamatorias. Frutos secos (almendras, nueces), aportan vitamina E, que ayuda a la regeneraci�n         " +
                                                  "\n celular. Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico. Este es          " +
                                                  "\n solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad     " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida    " +
                                                  "\n para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud, si la respuesta del        " +
                                                  "\n diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece tu visita a la        " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tama�o regular) para      " +
                                                  "\n mantener la hidrataci�n y ayudar a reducir la fiebre y el malestar general, lo que es fundamental en el proceso de     " +
                                                  "\n recuperaci�n. El Zika puede provocar fiebre, dolor muscular, fatiga y sarpullido, lo que puede llevar a una mayor      " +
                                                  "\n p�rdida de l�quidos. Es importante que el paciente consuma l�quidos ricos en electrolitos, como sueros orales, caldos  " +
                                                  "\n y jugos naturales sin az�car, para evitar la deshidrataci�n y mantener el equilibrio de minerales esenciales. Tambi�n  " +
                                                  "\n se recomienda el consumo de infusiones suaves, como manzanilla o jengibre, que pueden ayudar a aliviar las molestias   " +
                                                  "\n musculares y mejorar la digesti�n. EJERCICIO: La actividad f�sica debe ser muy ligera y supervisada, evitando esfuerzos   " +
                                                  "\n excesivos que puedan agravar los s�ntomas, ejercicios de respiraci�n profunda y movilidad suave pueden ser beneficiosos   " +
                                                  "\n para mejorar la circulaci�n y reducir la fatiga. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para el Zika,   " +
                                                  "\n pero los s�ntomas pueden aliviarse con analg�sicos como paracetamol y acetaminof�n, en M�xico algunas marcas reconocidas  " +
                                                  "\n incluyen Tempra (paracetamol) y Tylenol (acetaminof�n), adem�s se recomienda reposo absoluto, hidrataci�n constante y     " +
                                                  "\n protecci�n contra picaduras de mosquitos para evitar complicaciones. ALIMENTACI�N: Para fortalecer el sistema inmunol�gico" +
                                                  "\n y apoyar la recuperaci�n, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y zinc. Kiwi y         " +
                                                  "\n naranjas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa hasta el 100% de la          " +
                                                  "\n ingesta diaria recomendada, fortaleciendo el sistema inmunol�gico. Jengibre y c�rcuma: Poseen propiedades antiinflamatorias" +
                                                  "\n y antioxidantes, ayudando a reducir la inflamaci�n y el malestar general. Almendras y semillas de calabaza: Aportan        " +
                                                  "\n 10-15 mg de zinc por cada 100 g, cubriendo hasta el 100% de la recomendaci�n diaria, esencial para la funci�n inmunol�gica." +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta  " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar m�s de un   " +
                                                  "\n diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tama�o regular)         " +
                                                  "\n para evitar la deshidrataci�n causada por la diarrea y los v�mitos, lo que es fundamental en el proceso de           " +
                                                  "\n recuperaci�n. El rotavirus puede provocar fiebre, v�mitos y diarrea intensa, lo que aumenta el riesgo de p�rdida     " +
                                                  "\n de l�quidos y electrolitos. Es esencial consumir l�quidos ricos en electrolitos, como sueros orales y caldos,        " +
                                                  "\n para reponer los minerales perdidos. Tambi�n se recomienda el consumo de agua con lim�n o infusiones suaves, que     " +
                                                  "\n pueden ayudar a aliviar las n�useas y mejorar la digesti�n. EJERCICIO: La actividad f�sica debe ser m�nima y de      " +
                                                  "\n reposo, evitando esfuerzos f�sicos que puedan agravar la fatiga y la deshidrataci�n, se recomienda descanso absoluto " +
                                                  "\n hasta la recuperaci�n completa. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para el rotavirus, pero los " +
                                                  "\n s�ntomas pueden aliviarse con rehidrataci�n oral y medicamentos para la fiebre como paracetamol, en M�xico algunas   " +
                                                  "\n marcas reconocidas incluyen Tempra (paracetamol) y Pedialyte (soluci�n de rehidrataci�n oral), adem�s se recomienda  " +
                                                  "\n reposo y una dieta ligera para evitar complicaciones. ALIMENTACI�N: Para fortalecer el sistema digestivo y apoyar la " +
                                                  "\n recuperaci�n, se recomienda el consumo de alimentos ricos en probi�ticos, fibra y minerales esenciales. Yogur y k�fir:     " +
                                                  "\n Contienen probi�ticos naturales, que ayudan a restaurar la flora intestinal y mejorar la digesti�n. Pl�tanos y zanahorias: " +
                                                  "\n Son fuentes de fibra soluble, que ayuda a regular el tr�nsito intestinal y reducir la diarrea. Caldo de pollo y arroz:     " +
                                                  "\n Son alimentos suaves y f�ciles de digerir, proporcionando electrolitos y energ�a para la recuperaci�n. Este es solo un     " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que    " +
                                                  "\n las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar m�s de un diagn�stico y   " +
                                                  "\n consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeriosis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tama�o regular)          " +
                                                  "\n para mantener la hidrataci�n y ayudar a reducir la fiebre y los s�ntomas gastrointestinales, lo que es fundamental    " +
                                                  "\n en el proceso de recuperaci�n. La listeriosis puede provocar fiebre, v�mitos, diarrea y fatiga extrema, lo que        " +
                                                  "\n aumenta el riesgo de deshidrataci�n. Es esencial consumir l�quidos ricos en electrolitos, como sueros orales y        " +
                                                  "\n caldos, para reponer los minerales perdidos. Tambi�n se recomienda el consumo de infusiones suaves, como manzanilla   " +
                                                  "\n o jengibre, que pueden ayudar a aliviar las molestias digestivas y mejorar la absorci�n de nutrientes. EJERCICIO:     " +
                                                  "\n La actividad f�sica debe ser muy ligera y supervisada, evitando esfuerzos excesivos que puedan agravar los s�ntomas,  " +
                                                  "\n ejercicios de respiraci�n profunda y movilidad suave pueden ser beneficiosos para mejorar la circulaci�n y reducir la " +
                                                  "\n fatiga. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la listeriosis en ni�os incluye antibi�ticos como ampicilina" +
                                                  "\n y gentamicina, administrados por v�a intravenosa en casos graves, en M�xico algunas marcas reconocidas incluyen Amikin" +
                                                  "\n (amikacina) y Unasyn (ampicilina/sulbactam), adem�s se recomienda reposo absoluto y una dieta adecuada para mejorar la" +
                                                  "\n recuperaci�n. ALIMENTACI�N: Para fortalecer el sistema inmunol�gico y apoyar la recuperaci�n, se recomienda el consumo" +
                                                  "\n de alimentos ricos en vitamina C, antioxidantes y prote�nas. Naranjas y fresas: Contienen aproximadamente 70-90 mg de " +
                                                  "\n vitamina C por cada 100 g, lo que representa hasta el 100% de la ingesta diaria recomendada, fortaleciendo el sistema " +
                                                  "\n inmunol�gico y ayudando a reducir la inflamaci�n. Espinacas y lentejas: Aportan entre 3.5 y 6.6 mg de hierro por cada " +
                                                  "\n 100 g, cubriendo entre el 25% y 40% de la ingesta diaria recomendada, lo que ayuda a mejorar la oxigenaci�n celular y " +
                                                  "\n reducir el cansancio. Carnes magras y huevos: Son una fuente importante de prote�nas, proporcionando entre 20 y 25 g  " +
                                                  "\n por cada 100 g, lo que equivale al 40-50% de la recomendaci�n diaria, esenciales para la regeneraci�n celular y el    " +
                                                  "\n fortalecimiento muscular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%  " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se     " +
                                                  "\n recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida)" +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica de baja intensidad, evitando esfuerzos excesivos      " +
                                                  "\n y asegurando un descanso adecuado para la recuperaci�n. Actividades como caminatas suaves, juegos tranquilos y        " +
                                                  "\n ejercicios de respiraci�n pueden ser beneficiosos para mantener el cuerpo activo sin comprometer la recuperaci�n.     " +
                                                  "\n Tambi�n se recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez muscular causada       " +
                                                  "\n por el reposo prolongado. HIDRATACI�N: Es fundamental el consumo diario de 1.5 a 2 litros de agua (seis a ocho        " +
                                                  "\n vasos de tama�o regular) para prevenir la deshidrataci�n causada por la diarrea y ayudar a la recuperaci�n del        " +
                                                  "\n organismo. Adem�s, se recomienda el consumo de sueros de rehidrataci�n oral para reponer los electrolitos perdidos.   " +
                                                  "\n POSIBLE TRATAMIENTO: Para la shigelosis en ni�os, el tratamiento suele incluir antibi�ticos como la azitromicina o    " +
                                                  "\n ciprofloxacino en casos graves, adem�s de medidas de rehidrataci�n oral para evitar la deshidrataci�n. Tambi�n es     " +
                                                  "\n importante mantener una higiene adecuada, lavarse las manos frecuentemente y evitar el contacto con personas infectadas. " +
                                                  "\n ALIMENTACI�N: Es recomendable el consumo de alimentos que ayuden a la recuperaci�n intestinal y fortalezcan el sistema   " +
                                                  "\n inmune, tales como: Pl�tanos, ricos en potasio (aproximadamente el 10% del requerimiento diario por cada 100 g), que     " +
                                                  "\n ayudan a reponer electrolitos perdidos por la diarrea. Zanahorias, con vitamina A (aproximadamente el 334% del           " +
                                                  "\n requerimiento diario por cada 100 g), que contribuye a la regeneraci�n de la mucosa intestinal. Yogur, con probi�ticos   " +
                                                  "\n que favorecen la salud intestinal y fortalecen el sistema inmune. Tambi�n se recomienda el consumo de caldos y sopas     " +
                                                  "\n suaves para facilitar la digesti�n y evitar irritaciones en el tracto intestinal. Este es solo un diagn�stico   " +
                                                  "\n predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las " +
                                                  "\n respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar m�s de un    " +
                                                  "\n diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica adaptada a su capacidad respiratoria, evitando esfuerzos  " +
                                                  "\n excesivos y asegurando una respiraci�n controlada. Ejercicios como caminatas suaves, nataci�n, yoga y t�cnicas de         " +
                                                  "\n respiraci�n pueden mejorar la funci�n pulmonar y reducir la fatiga. Tambi�n se recomienda ejercicios de expansi�n         " +
                                                  "\n tor�cica y fortalecimiento de los m�sculos respiratorios para mejorar la capacidad pulmonar. Es importante realizar       " +
                                                  "\n calentamiento previo y enfriamiento posterior para evitar crisis respiratorias. HIDRATACI�N: Es fundamental el consumo    " +
                                                  "\n diario de 1.7 a 2 litros de agua (siete a ocho vasos de tama�o regular) para mantener las v�as respiratorias hidratadas   " +
                                                  "\n y facilitar la eliminaci�n de secreciones. Tambi�n se recomienda el consumo de infusiones con propiedades antiinflamatorias" +
                                                  "\n como el t� de jengibre o manzanilla. POSIBLE TRATAMIENTO: Para el EPOC en ni�os, el tratamiento suele incluir             " +
                                                  "\n broncodilatadores como el salbutamol, corticosteroides inhalados como la fluticasona y, en casos graves, oxigenoterapia.  " +
                                                  "\n Tambi�n es importante evitar la exposici�n a contaminantes ambientales y humo de tabaco. ALIMENTACI�N: Es recomendable    " +
                                                  "\n el consumo de alimentos que ayuden a mejorar la funci�n pulmonar y fortalezcan el sistema inmune, tales como: Pescados    " +
                                                  "\n grasos (salm�n, at�n), ricos en �cidos grasos Omega-3 (aproximadamente el 50% del requerimiento diario por cada 100 g),   " +
                                                  "\n que poseen propiedades antiinflamatorias que pueden ayudar a reducir la inflamaci�n de las v�as respiratorias. Frutas     " +
                                                  "\n y verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli), ricas en antioxidantes como la vitamina C        " +
                                                  "\n (aproximadamente el 90% del requerimiento diario por cada 100 g) y carotenoides, que pueden proteger las c�lulas      " +
                                                  "\n del da�o y fortalecer el sistema inmunol�gico. Jengibre, contiene compuestos con efectos antiinflamatorios que        " +
                                                  "\n podr�an ser beneficiosos para las v�as respiratorias. C�rcuma, con su componente activo, la curcumina, tambi�n        " +
                                                  "\n tiene potentes propiedades antiinflamatorias y antioxidantes. Tambi�n se recomienda el consumo de alimentos ricos     " +
                                                  "\n en fibra para mejorar la digesti�n y evitar la inflamaci�n intestinal. Este es solo un diagn�stico predeterminado     " +
                                                  "\n l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean      " +
                                                  "\n correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar m�s de un diagn�stico y consultar  " +
                                                  "\n a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n EJERCICIO: Es recomendable que la ni�a realice actividad f�sica moderada, evitando esfuerzos excesivos y asegurando  " +
                                                  "\n una recuperaci�n adecuada. Ejercicios como caminatas suaves, estiramientos y yoga pueden ser beneficiosos para       " +
                                                  "\n mantener el cuerpo activo sin comprometer el tratamiento. Tambi�n se recomienda ejercicios de relajaci�n y           " +
                                                  "\n respiraci�n profunda para reducir el estr�s y mejorar la respuesta inmune. HIDRATACI�N: Es fundamental el consumo    " +
                                                  "\n diario de 1.5 a 2 litros de agua (seis a ocho vasos de tama�o regular) para ayudar a eliminar toxinas y mantener el  " +
                                                  "\n organismo en equilibrio. Tambi�n se recomienda el consumo de jugos naturales ricos en antioxidantes para fortalecer  " +
                                                  "\n el sistema inmune. POSIBLE TRATAMIENTO: Para la clamidia en ni�os, el tratamiento suele incluir antibi�ticos como la " +
                                                  "\n azitromicina o doxiciclina, administrados bajo supervisi�n m�dica. Tambi�n es importante evitar el contacto con        " +
                                                  "\n personas infectadas y mantener una higiene adecuada. ALIMENTACI�N: Es recomendable el consumo de alimentos que ayuden  " +
                                                  "\n a fortalecer el sistema inmune y mejorar la recuperaci�n, tales como: Naranjas, ricas en vitamina C (aproximadamente   " +
                                                  "\n el 89% del requerimiento diario por cada 100 g), que ayuda a fortalecer el sistema inmunol�gico y reducir la duraci�n  " +
                                                  "\n de los s�ntomas. Espinacas, con hierro (aproximadamente el 15% del requerimiento diario por cada 100 g), que contribuye" +
                                                  "\n a la producci�n de gl�bulos rojos y mejora la oxigenaci�n del cuerpo. Yogur, con probi�ticos que favorecen la salud   " +
                                                  "\n intestinal y fortalecen el sistema inmune. Tambi�n se recomienda el consumo de alimentos ricos en zinc para mejorar   " +
                                                  "\n la respuesta inmune y acelerar la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad " +
                                                  "\n en el tratamiento adecuado, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n En ni�as peque�as, la meningitis bacteriana es una infecci�n grave que afecta las membranas que recubren el         " +
                                                  "\n cerebro y la m�dula espinal, pudiendo causar fiebre alta, rigidez en el cuello, v�mitos y alteraciones del          " +
                                                  "\n estado mental. EJERCICIO: Se recomienda actividad f�sica muy ligera, como movimientos suaves y ejercicios de        " +
                                                  "\n respiraci�n para mejorar la oxigenaci�n. Tambi�n es importante evitar esfuerzos f�sicos que puedan generar          " +
                                                  "\n fatiga o dificultar la recuperaci�n. Actividades como estiramientos suaves, movimientos de brazos y piernas,        " +
                                                  "\n y ejercicios de respiraci�n profunda pueden ayudar a mejorar la circulaci�n y reducir la rigidez muscular.          " +
                                                  "\n En algunos casos, los m�dicos pueden recomendar terapia f�sica supervisada, que incluye ejercicios espec�ficos      " +
                                                  "\n para mejorar la movilidad y prevenir complicaciones neurol�gicas. HIDRATACI�N: Es fundamental el consumo diario     " +
                                                  "\n de 1.5 a 2 litros de agua para mantener el cuerpo hidratado y ayudar a reducir la fiebre y el malestar. Adem�s      " +
                                                  "\n del agua pura, se recomienda el consumo de caldos ligeros, jugos naturales sin az�car y infusiones suaves, que      " +
                                                  "\n pueden aportar l�quidos y nutrientes esenciales. Tambi�n es recomendable el consumo de bebidas con electrolitos     " +
                                                  "\n naturales, como agua de coco, para ayudar a reponer los minerales perdidos por la fiebre y sudoraci�n. POSIBLE      " +
                                                  "\n TRATAMIENTO: La meningitis bacteriana se trata con antibi�ticos intravenosos, como ceftriaxona, vancomicina o       " +
                                                  "\n ampicilina, dependiendo del agente causal. En casos graves, puede requerirse hospitalizaci�n para monitoreo         " +
                                                  "\n neurol�gico y administraci�n de l�quidos intravenosos. Tambi�n se recomienda el uso de medicamentos para reducir    " +
                                                  "\n la fiebre y aliviar el dolor, como paracetamol o ibuprofeno. En algunos casos, se pueden utilizar corticoides para  " +
                                                  "\n reducir la inflamaci�n cerebral y prevenir complicaciones neurol�gicas. ALIMENTACI�N: Se recomienda el consumo de   " +
                                                  "\n alimentos que ayuden a fortalecer el sistema inmunol�gico y reducir la inflamaci�n, tales como ar�ndanos, ricos en  " +
                                                  "\n antioxidantes y vitamina C. espinacas, que contienen hierro y vitamina A, esenciales para la recuperaci�n. jengibre," +
                                                  "\n con propiedades antiinflamatorias y antioxidantes. c�rcuma, con curcumina, que tiene propiedades antiinflamatorias  " +
                                                  "\n y antioxidantes. yogur natural, que contiene probi�ticos beneficiosos para la flora intestinal. Este es solo un     " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad    " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y       " +
                                                  "\n consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n En ni�as peque�as, el c�ncer puede manifestarse de diversas formas y requerir un tratamiento especializado           " +
                                                  "\n seg�n el tipo y la etapa de la enfermedad. EJERCICIO: Se recomienda actividad f�sica moderada, adaptada a la         " +
                                                  "\n capacidad de la ni�a, como juegos tranquilos, caminatas suaves y ejercicios de movilidad para mejorar la             " +
                                                  "\n circulaci�n y reducir la fatiga. Tambi�n es recomendable realizar ejercicios de respiraci�n y relajaci�n para        " +
                                                  "\n mejorar la oxigenaci�n y reducir el estr�s. Estudios han demostrado que el ejercicio puede mejorar la fuerza         " +
                                                  "\n muscular, preservar la funci�n card�aca, reducir la fatiga y fortalecer el sistema inmunol�gico en pacientes         " +
                                                  "\n con c�ncer. Actividades como yoga infantil, nataci�n suave, ejercicios de resistencia con peso ligero y movimientos  " +
                                                  "\n de coordinaci�n pueden ser beneficiosos para mejorar la calidad de vida durante el tratamiento. Adem�s, el ejercicio " +
                                                  "\n puede ayudar a reducir los efectos secundarios de la quimioterapia, como la p�rdida de masa muscular y la fatiga     " +
                                                  "\n extrema. HIDRATACI�N: Es esencial el consumo diario de 2 a 2.5 litros de agua para mantener el cuerpo hidratado      " +
                                                  "\n y ayudar a reducir los efectos secundarios del tratamiento. Adem�s del agua pura, se recomienda el consumo de jugos  " +
                                                  "\n naturales ricos en antioxidantes, como jugo de naranja o toronja, que pueden fortalecer el sistema inmunol�gico.     " +
                                                  "\n Tambi�n es beneficioso ingerir caldos ligeros, que aportan l�quidos y minerales esenciales para la recuperaci�n.     " +
                                                  "\n POSIBLE TRATAMIENTO: El c�ncer en ni�as se trata con quimioterapia, radioterapia o cirug�a, dependiendo del tipo     " +
                                                  "\n y la etapa de la enfermedad. Tambi�n se pueden utilizar terapias dirigidas, como inmunoterapia, para fortalecer      " +
                                                  "\n el sistema inmunol�gico y combatir las c�lulas cancerosas. En algunos casos, se recomienda el uso de medicamentos    " +
                                                  "\n para aliviar los efectos secundarios, como antiem�ticos para controlar las n�useas y analg�sicos para reducir el     " +
                                                  "\n dolor. Adem�s, se pueden emplear terapias complementarias, como apoyo psicol�gico y nutricional, para mejorar la     " +
                                                  "\n calidad de vida de la paciente. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el       " +
                                                  "\n sistema inmunol�gico y reducir la inflamaci�n, tales como ar�ndanos, ricos en antioxidantes y vitamina C. espinacas, " +
                                                  "\n que contienen hierro y vitamina A, esenciales para la recuperaci�n. jengibre, con propiedades antiinflamatorias y    " +
                                                  "\n antioxidantes. c�rcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes. yogur natural, que   " +
                                                  "\n contiene probi�ticos beneficiosos para la flora intestinal. Este es solo un diagn�stico predeterminado l�gico, haberlo   " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas." +
                                                  "\n Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                    }
                }
             if (EdadFemenino.equals("Infancia = 0-9 a�os")) {
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