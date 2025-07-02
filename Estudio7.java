import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Estudio7 implements ActionListener{
    
  
         private final JLabel label1;
         private JScrollPane scrollpane1;
         private JTextArea textarea1;
         private JFrame frame;
         private final String edadEsperada = "Ancianidad = 75 a�os o mas";
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
                 if(EdadMasculino.equals("Ancianidad = 75 a�os o mas")){
                     if(EstaturaMasculino.equals("0.90-1.35 m")){
                              if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n En adultos mayores, la gripe puede ser m�s severa debido a la disminuci�n de la respuesta inmune con la edad.     " +
                                                  "\n HIDRATACI�N: Es recomendable que el paciente mantenga una hidrataci�n adecuada, consumiendo entre 2 y 2.5 litros  " +
                                                  "\n de agua al d�a (aproximadamente ocho a diez vasos de tama�o regular) para ayudar a mantener las mucosas hidratadas " +
                                                  "\n y facilitar la expulsi�n de secreciones. EJERCICIO: La actividad f�sica debe ser suave y adaptada, como caminatas  " +
                                                  "\n cortas de 20 a 30 minutos diarios, evitando esfuerzos excesivos y asegurando una buena ventilaci�n en el entorno   " +
                                                  "\n para reducir el riesgo de complicaciones respiratorias. POSIBLE TRATAMIENTO: Para la gripe en adultos mayores, el  " +
                                                  "\n tratamiento suele incluir antivirales como oseltamivir (Tamiflu) en casos graves o de riesgo, adem�s de medicamentos" +
                                                  "\n para aliviar s�ntomas como paracetamol (Tempra) o ibuprofeno (Advil) para la fiebre y el malestar. Tambi�n se       " +
                                                  "\n recomienda el uso de jarabes expectorantes para facilitar la eliminaci�n de flemas. La vacunaci�n anual contra la   " +
                                                  "\n influenza es clave para la prevenci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en vitamina C y    " +
                                                  "\n antioxidantes para fortalecer el sistema inmune, tales como Naranjas y mandarinas (vitamina C, 50 mg por 100 g,     " +
                                                  "\n ayuda a fortalecer el sistema inmune y reducir la duraci�n de los s�ntomas), Kiwi (vitamina C, 100 mg por 100 g,    " +
                                                  "\n refuerza el sistema inmunol�gico y mejora la absorci�n de hierro), Fresas (antioxidantes y vitamina C, 58 mg por    " +
                                                  "\n 100 g, protegen las c�lulas del da�o oxidativo y fortalecen el sistema inmune), Espinacas y br�coli (vitamina A y C,  " +
                                                  "\n 937 �g de vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Miel   " +
                                                  "\n (propiedades antimicrobianas y suavizantes para la garganta, ayuda a reducir la irritaci�n y la tos), Caldos calientes" +
                                                  "\n (favorecen la hidrataci�n y alivian la congesti�n nasal). Este es solo un diagn�stico predeterminado l�gico, haberlo  " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se       " +
                                                  "\n recomienda realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad en el tratamiento. Adem�s, por su salud,    " +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece" +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n En adultos mayores, la neumon�a puede ser grave debido a la disminuci�n de la respuesta inmune y la posible       " +
                                                  "\n presencia de enfermedades cr�nicas. HIDRATACI�N: Es fundamental que el paciente consuma entre 2 y 2.5 litros      " +
                                                  "\n de agua al d�a (aproximadamente ocho a diez vasos de tama�o regular) para mantener las v�as respiratorias         " +
                                                  "\n hidratadas y facilitar la expulsi�n de secreciones. EJERCICIO: La actividad f�sica debe ser moderada y adaptada,  " +
                                                  "\n como caminatas cortas de 15 a 20 minutos diarios, evitando esfuerzos excesivos y asegurando una buena ventilaci�n " +
                                                  "\n en el entorno para reducir el riesgo de complicaciones respiratorias. POSIBLE TRATAMIENTO: Para la neumon�a en    " +
                                                  "\n adultos mayores, el tratamiento suele incluir antibi�ticos como amoxicilina con �cido clavul�nico (Clavulin) o    " +
                                                  "\n levofloxacino (Levaquin) en casos bacterianos, adem�s de medicamentos para aliviar s�ntomas como paracetamol (Tempra) " +
                                                  "\n o ibuprofeno (Advil) para la fiebre y el malestar. Tambi�n se recomienda el uso de broncodilatadores en casos de      " +
                                                  "\n dificultad respiratoria y oxigenoterapia en situaciones graves. La vacunaci�n contra neumococo e influenza es clave   " +
                                                  "\n para la prevenci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y minerales " +
                                                  "\n esenciales para fortalecer el sistema inmune y mejorar la recuperaci�n, tales como Naranjas y mandarinas (vitamina C,  " +
                                                  "\n 50 mg por 100 g, ayuda a fortalecer el sistema inmune y reducir la duraci�n de los s�ntomas), Kiwi (vitamina C, 100 mg   " +
                                                  "\n por 100 g, refuerza el sistema inmunol�gico y mejora la absorci�n de hierro), Fresas (antioxidantes y vitamina C, 58 mg  " +
                                                  "\n por 100 g, protegen las c�lulas del da�o oxidativo y fortalecen el sistema inmune), Espinacas y br�coli (vitamina A y C, " +
                                                  "\n 937 �g de vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras " +
                                                  "\n (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamaci�n y fortalecer el sistema inmunol�gico), Miel (propiedades    " +
                                                  "\n antimicrobianas y suavizantes para la garganta, ayuda a reducir la irritaci�n y la tos), Caldos calientes (favorecen la  " +
                                                  "\n hidrataci�n y alivian la congesti�n nasal). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no     " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar m�s" +
                                                  "\n de un Diagn�stico de Mi Vida para mayor seguridad en el tratamiento. Adem�s, por su salud, si la respuesta del diagn�stico " +
                                                  "\n no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y " +
                                                  "\n espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n En adultos mayores, la diabetes puede generar complicaciones graves si no se controla adecuadamente.     " +
                                                  "\n HIDRATACI�N: Es fundamental que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente " +
                                                  "\n ocho a diez vasos de tama�o regular) para mantener una adecuada funci�n renal y evitar la deshidrataci�n," +
                                                  "\n que puede afectar los niveles de glucosa en sangre. EJERCICIO: La actividad f�sica debe ser moderada y      " +
                                                  "\n adaptada, como caminatas de 30 minutos diarios, ejercicios de bajo impacto como nataci�n o yoga, siempre    " +
                                                  "\n bajo supervisi�n m�dica para evitar hipoglucemias. POSIBLE TRATAMIENTO: Para la diabetes en adultos mayores," +
                                                  "\n el tratamiento suele incluir medicamentos como metformina (Glucophage) para mejorar la sensibilidad a la    " +
                                                  "\n insulina, insulina en casos necesarios, y medicamentos como glibenclamida o sitagliptina para el control de " +
                                                  "\n la glucosa. Es clave mantener un monitoreo constante de los niveles de az�car en sangre y seguir una dieta  " +
                                                  "\n equilibrada. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en fibra, antioxidantes y nutrientes " +
                                                  "\n esenciales para el control de la glucosa, tales como Avena (fibra soluble, 4 g por 100 g, ayuda a estabilizar   " +
                                                  "\n los niveles de glucosa), Frijoles (fibra y prote�nas, 6 g de fibra por 100 g, contribuyen a la regulaci�n del   " +
                                                  "\n az�car en sangre), Espinacas (magnesio, 79 mg por 100 g, mejora la sensibilidad a la insulina), Naranjas        " +
                                                  "\n (vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora la absorci�n de hierro), Almendras (vitamina E, " +
                                                  "\n 25 mg por 100 g, ayuda a reducir la inflamaci�n y proteger las c�lulas), Canela (compuestos bioactivos, ayuda a    " +
                                                  "\n mejorar la sensibilidad a la insulina). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no   " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda       " +
                                                  "\n realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad en el tratamiento. Adem�s, por su salud, si la      " +
                                                  "\n respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece   " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n En adultos mayores, el asma puede comprometer la funci�n respiratoria y aumentar el riesgo de complicaciones.        " +
                                                  "\n HIDRATACI�N: Es esencial que el paciente consuma entre 1.5 y 2 litros de agua al d�a (aproximadamente seis a ocho    " +
                                                  "\n vasos de tama�o regular) para mantener las v�as respiratorias hidratadas y reducir la viscosidad de las secreciones. " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser controlada y adaptada, como ejercicios de respiraci�n, caminatas cortas de     " +
                                                  "\n 15 a 20 minutos diarios, evitando ambientes con al�rgenos o contaminaci�n. POSIBLE TRATAMIENTO: Para el asma en adultos" +
                                                  "\n mayores, el tratamiento suele incluir broncodilatadores de alivio r�pido como salbutamol (Ventolin), corticosteroides  " +
                                                  "\n inhalados como fluticasona (Flixotide) para el control a largo plazo, y en algunos casos, modificadores de leucotrienos" +
                                                  "\n como montelukast (Singulair). Es clave seguir estrictamente el plan de acci�n para el asma indicado por el m�dico.     " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y �cidos grasos esenciales para reducir la  " +
                                                  "\n inflamaci�n y mejorar la funci�n pulmonar, tales como Pescados grasos (salm�n, at�n, Omega-3, 2 g por 100 g, ayuda a   " +
                                                  "\n reducir la inflamaci�n de las v�as respiratorias), Frutas y verduras de colores vivos (ar�ndanos, fresas, espinacas,   " +
                                                  "\n br�coli, vitamina C, 89 mg por 100 g, fortalece el sistema inmune y protege las c�lulas del da�o oxidativo), Jengibre  " +
                                                  "\n (compuestos antiinflamatorios, ayuda a relajar las v�as respiratorias), C�rcuma (curcumina, 3% de concentraci�n, potente " +
                                                  "\n antioxidante y antiinflamatorio). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al  " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un       " +
                                                  "\n Diagn�stico de Mi Vida para mayor seguridad en el tratamiento. Adem�s, por su salud, si la respuesta del diagn�stico no le" +
                                                  "\n satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que" +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n En adultos mayores, el VIH/SIDA requiere un control estricto para evitar complicaciones y mantener una buena    " +
                                                  "\n calidad de vida. HIDRATACI�N: Es recomendable que el paciente consuma entre 2 y 2.5 litros de agua al d�a       " +
                                                  "\n (aproximadamente ocho a diez vasos de tama�o regular) para mantener una adecuada funci�n renal y evitar la      " +
                                                  "\n deshidrataci�n, que puede afectar el metabolismo de los medicamentos antirretrovirales. EJERCICIO: La actividad   " +
                                                  "\n f�sica debe ser moderada y adaptada, como caminatas de 30 minutos diarios, ejercicios de bajo impacto como yoga   " +
                                                  "\n o nataci�n, siempre bajo supervisi�n m�dica para evitar fatiga extrema. POSIBLE TRATAMIENTO: Para el VIH/SIDA     " +
                                                  "\n en adultos mayores, el tratamiento suele incluir terapia antirretroviral combinada con medicamentos como tenofovir, " +
                                                  "\n emtricitabina y dolutegravir, que ayudan a controlar la replicaci�n del virus y mejorar la funci�n inmunol�gica.    " +
                                                  "\n Es clave mantener un monitoreo constante de la carga viral y el estado inmunol�gico. ALIMENTACI�N: Se recomienda    " +
                                                  "\n el consumo de alimentos ricos en antioxidantes, prote�nas y nutrientes esenciales para fortalecer el sistema inmune " +
                                                  "\n y mejorar la recuperaci�n, tales como Frutas c�tricas (naranjas, limones, vitamina C, 50 mg por 100 g, fortalece el " +
                                                  "\n sistema inmune y mejora la absorci�n de hierro), Espinacas (vitamina A y C, 937 �g de vitamina A y 89 mg de     " +
                                                  "\n vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg     " +
                                                  "\n por 100 g, ayuda a reducir la inflamaci�n y proteger las c�lulas), Yogur natural (probi�ticos, mejora la salud  " +
                                                  "\n intestinal y fortalece el sistema inmune), Pescados grasos (salm�n, Omega-3, 2 g por 100 g, ayuda a reducir la  " +
                                                  "\n inflamaci�n y mejorar la funci�n celular). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda  " +
                                                  "\n realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad en el tratamiento. Adem�s, por su salud, si la    " +
                                                  "\n respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n En adultos mayores, la gonorrea puede presentar s�ntomas m�s leves o at�picos, por lo que es fundamental un        " +
                                                  "\n diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que el paciente mantenga una hidrataci�n   " +
                                                  "\n adecuada, consumiendo al menos 2 litros de agua al d�a (aproximadamente ocho vasos de tama�o regular) para         " +
                                                  "\n favorecer la eliminaci�n de toxinas y mantener el sistema inmunol�gico fuerte. EJERCICIO: En cuanto a la actividad " +
                                                  "\n f�sica, es recomendable realizar ejercicio moderado, como caminatas de 30 a 45 minutos diarios, siempre bajo       " +
                                                  "\n supervisi�n m�dica para evitar complicaciones. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la gonorrea incluye " +
                                                  "\n antibi�ticos como la azitromicina y ceftriaxona, los cuales deben ser administrados bajo prescripci�n m�dica. En     " +
                                                  "\n casos m�s graves, puede requerirse hospitalizaci�n para recibir antibi�ticos intravenosos. Es fundamental que el     " +
                                                  "\n paciente evite el contacto �ntimo hasta completar el tratamiento y que su pareja tambi�n reciba tratamiento para     " +
                                                  "\n evitar reinfecciones. ALIMENTACI�N RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema     " + 
                                                  "\n inmunol�gico y ayuden a combatir la infecci�n, tales como: Ajo: Posee propiedades antimicrobianas naturales que      " +
                                                  "\n pueden ayudar a combatir infecciones y contiene alicina, un compuesto con efectos antibacterianos. Jengibre: Con     " +
                                                  "\n efectos antiinflamatorios que pueden ser beneficiosos para el organismo, aporta antioxidantes y gingerol, que ayuda  " +
                                                  "\n a reducir la inflamaci�n. Frutas c�tricas (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece el       " +
                                                  "\n sistema inmunol�gico y ayuda a reducir la duraci�n de infecciones, aportando aproximadamente el 89% del requerimiento   " +
                                                  "\n diario por cada 100 gramos. Yogur natural: Contiene probi�ticos, que pueden ayudar a mantener el equilibrio de la flora " +
                                                  "\n bacteriana y mejorar la respuesta inmunol�gica, proporcionando cerca del 20% del requerimiento diario de calcio por     " +
                                                  "\n cada porci�n de 150 gramos. Verduras de hoja verde (espinaca, acelga, br�coli): Ricas en antioxidantes y vitaminas      " +
                                                  "\n esenciales para la recuperaci�n, como la vitamina A, que contribuye a la regeneraci�n celular y aporta cerca del 56%    " +
                                                  "\n del requerimiento diario por cada 100 gramos de espinaca. Este es solo un diagn�stico predeterminado l�gico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. " +
                                                  "\n Para mayor seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento " +
                                                  "\n adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n En adultos mayores, el herpes genital puede causar s�ntomas m�s prolongados y mayor riesgo de complicaciones,  " +
                                                  "\n por lo que es fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que el      " +
                                                  "\n paciente mantenga una hidrataci�n adecuada, consumiendo al menos 2 a 2.5 litros de agua al d�a (aproximadamente  " +
                                                  "\n ocho a diez vasos de tama�o regular) para favorecer la eliminaci�n de toxinas y mantener el sistema inmunol�gico  " +
                                                  "\n fuerte. EJERCICIO: En cuanto a la actividad f�sica, es recomendable realizar ejercicio moderado, como caminatas   " +
                                                  "\n de 30 a 45 minutos diarios, siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer el sistema    " +
                                                  "\n inmunol�gico. POSIBLE TRATAMIENTO: El tratamiento est�ndar para el herpes genital incluye antivirales como el     " +
                                                  "\n aciclovir, valaciclovir y famciclovir, los cuales deben ser administrados bajo prescripci�n m�dica. Estos         " +
                                                  "\n medicamentos ayudan a reducir la duraci�n y gravedad de los s�ntomas, as� como la frecuencia de los brotes        " +
                                                  "\n recurrentes. Tambi�n es fundamental evitar el contacto �ntimo durante los brotes y mantener una higiene adecuada  " +
                                                  "\n para prevenir la propagaci�n del virus. ALIMENTACI�N RECOMENDADA: Se recomienda el consumo de alimentos que       " +
                                                  "\n fortalezcan el sistema inmunol�gico y ayuden a combatir la infecci�n, tales como: Ajo: Posee propiedades          " +
                                                  "\n antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene alicina, un compuesto con efectos   " +
                                                  "\n antibacterianos. Frutas c�tricas (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece el sistema     " +
                                                  "\n inmunol�gico y ayuda a reducir la duraci�n de infecciones, aportando aproximadamente el 89% del requerimiento     " +
                                                  "\n diario por cada 100 gramos. Yogur natural: Contiene probi�ticos, que pueden ayudar a mantener el equilibrio de la " +
                                                  "\n flora bacteriana y mejorar la respuesta inmunol�gica, proporcionando cerca del 20% del requerimiento diario de    " +
                                                  "\n calcio por cada porci�n de 150 gramos. Verduras de hoja verde (espinaca, acelga, br�coli): Ricas en antioxidantes   " +
                                                  "\n y vitaminas esenciales para la recuperaci�n, como la vitamina A, que contribuye a la regeneraci�n celular y aporta  " +
                                                  "\n cerca del 56% del requerimiento diario por cada 100 gramos de espinaca. Omega-3 (salm�n, at�n, ch�a): Con propiedades " +
                                                  "\n antiinflamatorias que pueden ayudar a reducir la inflamaci�n y mejorar la respuesta inmunol�gica, aportando           " +
                                                  "\n aproximadamente el 50% del requerimiento diario por cada 100 gramos de salm�n. Este es solo un diagn�stico predeterminado" +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean    " +
                                                  "\n completamente correctas. Para mayor seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico " +
                                                  "\n para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n En adultos mayores, la s�filis puede presentar s�ntomas m�s severos si no se trata a tiempo, por lo que es      " +
                                                  "\n fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que el paciente mantenga " +
                                                  "\n una hidrataci�n adecuada, consumiendo al menos 2 litros de agua al d�a (aproximadamente ocho vasos de tama�o    " +
                                                  "\n regular) para favorecer la eliminaci�n de toxinas y mantener el sistema inmunol�gico fuerte. EJERCICIO: En      " +
                                                  "\n cuanto a la actividad f�sica, es recomendable realizar ejercicio moderado, como caminatas de 30 a 45 minutos    " +
                                                  "\n diarios, siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer el sistema inmunol�gico.       " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento est�ndar para la s�filis incluye antibi�ticos como la penicilina G benzatina  " +
                                                  "\n (Benzetacil), administrada en dosis �nica intramuscular, o alternativas como doxiciclina o ceftriaxona en casos   " +
                                                  "\n de alergia a la penicilina. Es fundamental seguir el tratamiento completo para evitar complicaciones graves.      " +
                                                  "\n ALIMENTACI�N RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden  " +
                                                  "\n a combatir la infecci�n, tales como: Ajo: Posee propiedades antimicrobianas naturales que pueden ayudar a combatir  " +
                                                  "\n infecciones y contiene alicina, un compuesto con efectos antibacterianos. Frutas c�tricas (naranjas, limones,       " +
                                                  "\n toronjas): Ricas en vitamina C, que fortalece el sistema inmunol�gico y ayuda a reducir la duraci�n de infecciones, " +
                                                  "\n aportando aproximadamente el 89% del requerimiento diario por cada 100 gramos. Yogur natural: Contiene probi�ticos,   " +
                                                  "\n que pueden ayudar a mantener el equilibrio de la flora bacteriana y mejorar la respuesta inmunol�gica, proporcionando " +
                                                  "\n cerca del 20% del requerimiento diario de calcio por cada porci�n de 150 gramos. Verduras de hoja verde (espinaca,    " +
                                                  "\n acelga, br�coli): Ricas en antioxidantes y vitaminas esenciales para la recuperaci�n, como la vitamina A, que         " +
                                                  "\n contribuye a la regeneraci�n celular y aporta cerca del 56% del requerimiento diario por cada 100 gramos de espinaca. " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga   " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar   " +
                                                  "\n m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu  " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n En adultos mayores, la tuberculosis puede ser m�s dif�cil de tratar debido a la edad y posibles condiciones    " +
                                                  "\n preexistentes, por lo que es fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se       " +
                                                  "\n recomienda que el paciente mantenga una hidrataci�n adecuada, consumiendo al menos 2.5 litros de agua al d�a   " +
                                                  "\n (aproximadamente diez vasos de tama�o regular) para favorecer la eliminaci�n de toxinas y mantener el sistema  " +
                                                  "\n inmunol�gico fuerte. EJERCICIO: En cuanto a la actividad f�sica, es recomendable realizar ejercicio moderado,  " +
                                                  "\n como caminatas de 30 minutos diarios, siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer  " +
                                                  "\n el sistema inmunol�gico. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la tuberculosis incluye un r�gimen  " +
                                                  "\n de antibi�ticos como isoniazida, rifampicina, etambutol y pirazinamida, administrados durante un per�odo de    " +
                                                  "\n seis meses bajo estricta supervisi�n m�dica. Es fundamental seguir el tratamiento completo para evitar resistencia   " +
                                                  "\n bacteriana. ALIMENTACI�N RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico  " +
                                                  "\n y ayuden a combatir la infecci�n, tales como: Ajo: Posee propiedades antimicrobianas naturales que pueden ayudar a   " +
                                                  "\n combatir infecciones y contiene alicina, un compuesto con efectos antibacterianos. Frutas c�tricas (naranjas,        " +
                                                  "\n limones, toronjas): Ricas en vitamina C, que fortalece el sistema inmunol�gico y ayuda a reducir la duraci�n de      " +
                                                  "\n infecciones, aportando aproximadamente el 89% del requerimiento diario por cada 100 gramos. Yogur natural: Contiene  " +
                                                  "\n probi�ticos, que pueden ayudar a mantener el equilibrio de la flora bacteriana y mejorar la respuesta inmunol�gica,  " +
                                                  "\n proporcionando cerca del 20% del requerimiento diario de calcio por cada porci�n de 150 gramos. Verduras de hoja   " +
                                                  "\n verde (espinaca, acelga, br�coli): Ricas en antioxidantes y vitaminas esenciales para la recuperaci�n, como la     " +
                                                  "\n vitamina A, que contribuye a la regeneraci�n celular y aporta cerca del 56% del requerimiento diario por cada 100  " +
                                                  "\n gramos de espinaca. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que " +
                                                  "\n el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad, se     " +
                                                  "\n recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel   " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n En adultos mayores, la artritis puede causar dolor cr�nico y afectar la movilidad, por lo que es fundamental       " +
                                                  "\n un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que el paciente mantenga una            " +
                                                  "\n hidrataci�n adecuada, consumiendo al menos 2 litros de agua al d�a (aproximadamente ocho vasos de tama�o regular)  " +
                                                  "\n para favorecer la lubricaci�n de las articulaciones y reducir la inflamaci�n. EJERCICIO: En cuanto a la actividad   " +
                                                  "\n f�sica, es recomendable realizar ejercicios de bajo impacto, como caminatas de 30 minutos diarios, nataci�n o yoga, " +
                                                  "\n siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer las articulaciones. POSIBLE TRATAMIENTO: El " +
                                                  "\n tratamiento est�ndar para la artritis incluye antiinflamatorios no esteroides (AINEs) como ibuprofeno y naproxeno,  " +
                                                  "\n as� como f�rmacos modificadores de la enfermedad (FAMEs) como metotrexato y sulfasalazina, administrados bajo       " +
                                                  "\n prescripci�n m�dica. En casos graves, pueden recomendarse terapias biol�gicas. ALIMENTACI�N RECOMENDADA: Se recomienda  " +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como: Omega-3  " +
                                                  "\n (salm�n, at�n, ch�a): Con propiedades antiinflamatorias que pueden ayudar a reducir la inflamaci�n y mejorar la respuesta " +
                                                  "\n inmunol�gica, aportando aproximadamente el 50% del requerimiento diario por cada 100 gramos de salm�n. Frutas y verduras  " +
                                                  "\n de colores vivos (ar�ndanos, fresas, espinacas, br�coli): Ricas en antioxidantes como la vitamina C y carotenoides, que   " +
                                                  "\n pueden proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico. Jengibre: Contiene compuestos con efectos      " +
                                                  "\n antiinflamatorios que podr�an ser beneficiosos para las articulaciones. C�rcuma: Con su componente activo, la curcumina,  " +
                                                  "\n tambi�n tiene potentes propiedades antiinflamatorias y antioxidantes. Este es solo un diagn�stico predeterminado l�gico,  " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente  " + 
                                                  "\n correctas. Para mayor seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer   " +
                                                  "\n el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n En adultos mayores, la tosferina puede ser grave debido a la disminuci�n de la capacidad pulmonar y la         " +
                                                  "\n presencia de otras condiciones m�dicas. EJERCICIO: Es recomendable que el paciente realice actividad f�sica    " +
                                                  "\n ligera y adaptada a su capacidad, como caminatas cortas en espacios bien ventilados, evitando esfuerzos        " +
                                                  "\n excesivos que puedan desencadenar episodios de tos intensa. HIDRATACI�N: Tambi�n es crucial el consumo diario  " +
                                                  "\n de 1.5 a 2 litros de agua (seis a ocho vasos de agua de tama�o regular) para mantener las v�as respiratorias   " +
                                                  "\n hidratadas y facilitar la expulsi�n de secreciones. POSIBLE TRATAMIENTO: Para la tosferina en adultos mayores, " +
                                                  "\n el tratamiento suele incluir antibi�ticos como la azitromicina, claritromicina o eritromicina, los cuales ayudan   " +
                                                  "\n a reducir la duraci�n de la enfermedad y la transmisi�n. En casos graves, puede requerirse hospitalizaci�n para    " +
                                                  "\n monitoreo respiratorio y administraci�n de ox�geno. Tambi�n se recomienda el uso de medidas de soporte, como       " +
                                                  "\n humidificadores para aliviar la irritaci�n de las v�as respiratorias y evitar ambientes con humo o contaminantes.  " +
                                                  "\n ALIMENTACI�N: Es recomendable que el paciente consuma alimentos que ayuden a fortalecer el sistema inmunol�gico y  " +
                                                  "\n reducir la inflamaci�n, tales como jengibre, que contiene compuestos con efectos antiinflamatorios y antioxidantes,  " +
                                                  "\n aportando 5% de la ingesta diaria recomendada de vitamina C. c�rcuma, con su componente activo, la curcumina, que    " +
                                                  "\n tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes." +
                                                  "\n frutas c�tricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunol�gico, aportando" +
                                                  "\n 90 mg por cada 100 g de fruta, lo que representa 100% de la ingesta diaria recomendada. miel, que puede ayudar a    " +
                                                  "\n calmar la irritaci�n de la garganta y reducir la tos, proporcionando antioxidantes y propiedades antimicrobianas.   " +
                                                  "\n caldo de pollo, que aporta l�quidos y nutrientes esenciales para la recuperaci�n, incluyendo electrolitos y         " +
                                                  "\n prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al         " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se        " +
                                                  "\n recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado.          " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n En adultos mayores, las paperas pueden causar complicaciones graves, como inflamaci�n de �rganos y problemas         " +
                                                  "\n neurol�gicos. EJERCICIO: Se recomienda actividad f�sica ligera, como caminatas cortas en espacios bien ventilados,   " +
                                                  "\n evitando esfuerzos excesivos que puedan agravar la inflamaci�n. Tambi�n es recomendable realizar ejercicios de       " +
                                                  "\n movilidad articular y estiramientos suaves para mantener la flexibilidad y evitar la rigidez muscular.               " +
                                                  "\n HIDRATACI�N: Es fundamental el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de agua de tama�o regular)" +
                                                  "\n para mantener el cuerpo hidratado y ayudar a reducir la fiebre y el malestar. POSIBLE TRATAMIENTO: No existe un      " +
                                                  "\n tratamiento espec�fico para las paperas, ya que es una enfermedad viral. Sin embargo, se recomienda el uso de        " +
                                                  "\n medicamentos para aliviar los s�ntomas, como paracetamol o ibuprofeno, para reducir la fiebre y el dolor. Tambi�n es " +
                                                  "\n importante el reposo, la hidrataci�n adecuada y una alimentaci�n de consistencia blanda para facilitar la ingesta de " +
                                                  "\n alimentos. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmunol�gico y     " +
                                                  "\n reducir la inflamaci�n, tales como jengibre, que contiene compuestos con efectos antiinflamatorios y antioxidantes,  " +
                                                  "\n aportando 5% de la ingesta diaria recomendada de vitamina C. c�rcuma, con su componente activo, la curcumina, que    " +
                                                  "\n tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes." +
                                                  "\n frutas c�tricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunol�gico, aportando    " +
                                                  "\n 90 mg por cada 100 g de fruta, lo que representa 100% de la ingesta diaria recomendada. miel, que puede ayudar a calmar " +
                                                  "\n la irritaci�n de la garganta y reducir la inflamaci�n, proporcionando antioxidantes y propiedades antimicrobianas.      " +
                                                  "\n caldo de pollo, que aporta l�quidos y nutrientes esenciales para la recuperaci�n, incluyendo electrolitos y prote�nas   " +
                                                  "\n esenciales. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente  " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un   " +
                                                  "\n diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la     " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n En adultos mayores, el virus del Zika puede causar s�ntomas como fiebre, dolor muscular y articular, as� como       " +
                                                  "\n complicaciones neurol�gicas en algunos casos. EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas    " +
                                                  "\n suaves, evitando la exposici�n prolongada al sol y a zonas con alta presencia de mosquitos. Tambi�n es recomendable " +
                                                  "\n realizar ejercicios de respiraci�n y movilidad para mejorar la circulaci�n y reducir la fatiga muscular.            " +
                                                  "\n HIDRATACI�N: Es esencial el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tama�o regular)  " +
                                                  "\n para mantener el cuerpo hidratado y ayudar a reducir la fiebre y el malestar. POSIBLE TRATAMIENTO: No existe un     " +
                                                  "\n tratamiento antiviral espec�fico para el Zika. El manejo de la enfermedad es sintom�tico e incluye antiinflamatorios " +
                                                  "\n no esteroideos y analg�sicos como paracetamol, adem�s de reposo e ingesta abundante de l�quidos. ALIMENTACI�N: Se    " +
                                                  "\n recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmunol�gico y reducir la inflamaci�n, tales   " +
                                                  "\n como ar�ndanos, ricos en antioxidantes y vitamina C, aportando 25% de la ingesta diaria recomendada. espinacas, que  " +
                                                  "\n contienen hierro y vitamina A, esenciales para la recuperaci�n, proporcionando 15% de la ingesta diaria recomendada  " +
                                                  "\n de hierro. jengibre, con propiedades antiinflamatorias y antioxidantes, aportando 5% de la ingesta diaria recomendada " +
                                                  "\n de vitamina C. c�rcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de  " +
                                                  "\n la ingesta diaria recomendada de antioxidantes. agua de coco, que ayuda a la hidrataci�n y aporta electrolitos        " +
                                                  "\n esenciales. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un  " +
                                                  "\n diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n En adultos mayores, el rotavirus puede causar diarrea severa y deshidrataci�n, lo que puede ser peligroso     " +
                                                  "\n si no se trata adecuadamente. EJERCICIO: Se recomienda actividad f�sica ligera, como caminatas cortas,        " +
                                                  "\n evitando esfuerzos excesivos que puedan agravar la deshidrataci�n. Tambi�n es recomendable realizar ejercicios   " +
                                                  "\n de movilidad y estiramientos para mejorar la circulaci�n y reducir la fatiga. HIDRATACI�N: Es crucial el consumo " +
                                                  "\n diario de 2.5 a 3 litros de agua (diez a doce vasos de agua de tama�o regular) para compensar la p�rdida de      " +
                                                  "\n l�quidos y evitar la deshidrataci�n. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral espec�fico para     " +
                                                  "\n el rotavirus. El manejo de la enfermedad se basa en rehidrataci�n oral, consumo de l�quidos con electrolitos     " +
                                                  "\n y una dieta adecuada. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a reponer l�quidos y fortalecer " +
                                                  "\n el sistema digestivo, tales como pl�tanos, ricos en potasio, que ayudan a reemplazar los electrolitos perdidos,      " +
                                                  "\n aportando 10% de la ingesta diaria recomendada de potasio. arroz blanco, que es f�cil de digerir y ayuda a           " +
                                                  "\n estabilizar el sistema digestivo, proporcionando 20% de la ingesta diaria recomendada de carbohidratos. zanahorias,  " +
                                                  "\n ricas en vitamina A, que ayudan a la recuperaci�n del sistema digestivo, aportando 50% de la ingesta diaria          " +
                                                  "\n recomendada de vitamina A. agua de coco, que ayuda a la hidrataci�n y aporta electrolitos esenciales. yogur natural, " +
                                                  "\n que contiene probi�ticos beneficiosos para la flora intestinal, proporcionando 15% de la ingesta diaria recomendada  " +
                                                  "\n de calcio. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente" +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s    " +
                                                  "\n de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu      " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n En adultos mayores, la listeriosis puede ser grave debido a la debilidad del sistema inmunol�gico y la posibilidad   " +
                                                  "\n de complicaciones neurol�gicas. EJERCICIO: Se recomienda actividad f�sica ligera, como caminatas cortas en espacios  " +
                                                  "\n bien ventilados, evitando esfuerzos excesivos que puedan generar fatiga. Tambi�n es recomendable realizar ejercicios " +
                                                  "\n de movilidad articular y estiramientos suaves para mantener la flexibilidad y evitar la rigidez muscular. Debido a   " +
                                                  "\n que la listeriosis puede causar fiebre y debilidad, es importante que el ejercicio sea de baja intensidad y que se   " +
                                                  "\n realice en intervalos cortos para evitar el agotamiento. HIDRATACI�N: Es fundamental el consumo diario de 1.5 a 2    " +
                                                  "\n litros de agua (seis a ocho vasos de agua de tama�o regular) para mantener el cuerpo hidratado y ayudar a reducir la " +
                                                  "\n fiebre y el malestar. POSIBLE TRATAMIENTO: La listeriosis se trata con antibi�ticos, como ampicilina combinada con   " +
                                                  "\n gentamicina, en casos graves. Tambi�n se pueden utilizar penicilina o trimetoprima-sulfametoxazol en pacientes con   " +
                                                  "\n alergia a la ampicilina. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema         " +
                                                  "\n inmunol�gico y reducir la inflamaci�n, tales como ajo, que contiene alicina con propiedades antimicrobianas, aportando  " +
                                                  "\n 5% de la ingesta diaria recomendada de antioxidantes. jengibre, con efectos antiinflamatorios y antioxidantes, aportando" +
                                                  "\n 5% de la ingesta diaria recomendada de vitamina C. c�rcuma, con curcumina, que tiene propiedades antiinflamatorias y    " +
                                                  "\n antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes. frutas c�tricas (naranjas, limones, " +
                                                  "\n toronjas), ricas en vitamina C, que fortalece el sistema inmunol�gico, aportando 90 mg por cada 100 g de fruta, lo que  " +
                                                  "\n representa 100% de la ingesta diaria recomendada. yogur natural, que contiene probi�ticos beneficiosos para la flora    " +
                                                  "\n intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio. Este es solo un diagn�stico predeterminado   " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean        " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer" +
                                                  "\n el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n En adultos mayores, la shigelosis puede causar diarrea severa y deshidrataci�n, lo que puede ser peligroso    " +
                                                  "\n si no se trata adecuadamente. EJERCICIO: Se recomienda actividad f�sica ligera, como caminatas cortas,        " +
                                                  "\n evitando esfuerzos excesivos que puedan agravar la deshidrataci�n. Tambi�n es recomendable realizar ejercicios " +
                                                  "\n de movilidad y estiramientos para mejorar la circulaci�n y reducir la fatiga. Debido a que la shigelosis causa " +
                                                  "\n diarrea y p�rdida de l�quidos, es importante evitar ejercicios que generen sudoraci�n excesiva y optar por     " +
                                                  "\n movimientos suaves que ayuden a mantener la actividad sin comprometer la hidrataci�n. HIDRATACI�N: Es crucial  " +
                                                  "\n el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de agua de tama�o regular) para compensar la    " +
                                                  "\n p�rdida de l�quidos y evitar la deshidrataci�n. POSIBLE TRATAMIENTO: La shigelosis se trata con antibi�ticos,  " +
                                                  "\n como azitromicina, ciprofloxacino o ceftriaxona, dependiendo de la gravedad del caso. Tambi�n se recomienda    " +
                                                  "\n rehidrataci�n oral y una dieta adecuada. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a      " +
                                                  "\n reponer l�quidos y fortalecer el sistema digestivo, tales como pl�tanos, ricos en potasio, que ayudan a        " +
                                                  "\n reemplazar los electrolitos perdidos, aportando 10% de la ingesta diaria recomendada de potasio. arroz blanco, " +
                                                  "\n que es f�cil de digerir y ayuda a estabilizar el sistema digestivo, proporcionando 20% de la ingesta diaria    " +
                                                  "\n recomendada de carbohidratos. zanahorias, ricas en vitamina A, que ayudan a la recuperaci�n del sistema        " +
                                                  "\n digestivo, aportando 50% de la ingesta diaria recomendada de vitamina A. agua de coco, que ayuda a la         " +
                                                  "\n hidrataci�n y aporta electrolitos esenciales. yogur natural, que contiene probi�ticos beneficiosos para la    " +
                                                  "\n flora intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio. Este es solo un diagn�stico  " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que   " +
                                                  "\n las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y        " +
                                                  "\n consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app     " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n En adultos mayores, la EPOC puede causar dificultad para respirar y fatiga, afectando la calidad de vida.    " +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas suaves y ejercicios de respiraci�n para   " +
                                                  "\n mejorar la capacidad pulmonar. Tambi�n es recomendable realizar ejercicios de movilidad y estiramientos para    " +
                                                  "\n mejorar la circulaci�n y reducir la fatiga. Debido a que la EPOC afecta la funci�n pulmonar, es importante      " +
                                                  "\n realizar ejercicios de respiraci�n profunda, como la t�cnica de respiraci�n diafragm�tica, que ayuda a mejorar  " +
                                                  "\n la oxigenaci�n y reducir la sensaci�n de falta de aire. Tambi�n se recomienda la respiraci�n con labios fruncidos, " +
                                                  "\n que permite controlar la exhalaci�n y mejorar la eficiencia respiratoria. HIDRATACI�N: Es esencial el consumo      " +
                                                  "\n diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tama�o regular) para mantener el cuerpo hidratado   " +
                                                  "\n y ayudar a reducir la inflamaci�n de las v�as respiratorias. POSIBLE TRATAMIENTO: La EPOC se trata con broncodilatadores," +
                                                  "\n como salbutamol, tiotropio o formoterol, adem�s de corticosteroides inhalados, como fluticasona o budesonida.         " +
                                                  "\n En casos graves, se puede requerir ox�geno suplementario y rehabilitaci�n pulmonar. ALIMENTACI�N: Se recomienda       " +
                                                  "\n el consumo de alimentos que ayuden a fortalecer el sistema respiratorio y reducir la inflamaci�n, tales como pescados " +
                                                  "\n grasos (salm�n, at�n), ricos en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias, aportando 50% de la  " +
                                                  "\n ingesta diaria recomendada de Omega-3. frutas y verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli),    " +
                                                  "\n ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las c�lulas del da�o y fortalecer el    " +
                                                  "\n sistema inmunol�gico, aportando 70% de la ingesta diaria recomendada de vitamina C. jengibre, que contiene compuestos " +
                                                  "\n con efectos antiinflamatorios que podr�an ser beneficiosos para las v�as respiratorias, aportando 5% de la ingesta    " +
                                                  "\n diaria recomendada de vitamina C. c�rcuma, con su componente activo, la curcumina, que tiene potentes propiedades     " +
                                                  "\n antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes. Este es solo  " +
                                                  "\n un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad   " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar " +
                                                  "\n a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que" +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n En adultos mayores, la clamidia puede causar complicaciones graves si no se trata adecuadamente.   " +
                                                  "\n HIDRATACI�N: Es fundamental que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente ocho a diez  " +
                                                  "\n vasos de tama�o regular) para mantener una adecuada funci�n renal y evitar la deshidrataci�n, que puede afectar la    " +
                                                  "\n respuesta inmunol�gica. La hidrataci�n tambi�n ayuda a reducir la inflamaci�n y mejorar la circulaci�n, lo que facilita " +
                                                  "\n la eliminaci�n de toxinas y el transporte de nutrientes esenciales para la recuperaci�n. EJERCICIO: La actividad f�sica " +
                                                  "\n debe ser moderada y adaptada, como caminatas de 30 minutos diarios, ejercicios de bajo impacto como yoga o nataci�n,    " +
                                                  "\n siempre bajo supervisi�n m�dica para evitar fatiga extrema. El ejercicio mejora la circulaci�n sangu�nea, lo que        " +
                                                  "\n contribuye a una mejor oxigenaci�n de los tejidos y fortalece el sistema inmunol�gico, ayudando al cuerpo a combatir la " +
                                                  "\n infecci�n. POSIBLE TRATAMIENTO: Para la clamidia en adultos mayores, el tratamiento suele incluir antibi�ticos como    " +
                                                  "\n azitromicina en dosis �nica o doxiciclina durante siete d�as. Tambi�n se recomienda evitar relaciones sexuales hasta   " +
                                                  "\n completar el tratamiento y que la pareja tambi�n reciba tratamiento para prevenir reinfecciones. ALIMENTACI�N: Se      " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmune    " +
                                                  "\n y mejorar la recuperaci�n, tales como Frutas c�tricas (naranjas, limones, vitamina C, 50 mg por 100 g, fortalece el    " +
                                                  "\n sistema inmune y mejora la absorci�n de hierro), Espinacas (vitamina A y C, 937 �g de vitamina A y 89 mg de vitamina C " +
                                                  "\n por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, ayuda a    " +
                                                  "\n reducir la inflamaci�n y proteger las c�lulas), Yogur natural (probi�ticos, mejora la salud intestinal y fortalece el  " +
                                                  "\n sistema inmune), Pescados grasos (salm�n, Omega-3, 2 g por 100 g, ayuda a reducir la inflamaci�n y mejorar la funci�n  " +
                                                  "\n celular). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente   " +
                                                  "\n tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un Diagn�stico de Mi Vida   " +
                                                  "\n para mayor seguridad en el tratamiento. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo," +
                                                  "\n se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n En adultos mayores, la meningitis bacteriana puede ser grave y requiere atenci�n m�dica inmediata. " +
                                                  "\n HIDRATACI�N: Es esencial que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente ocho a         " +
                                                  "\n diez vasos de tama�o regular) para mantener una adecuada funci�n cerebral y evitar la deshidrataci�n, que puede      " +
                                                  "\n agravar los s�ntomas neurol�gicos. La hidrataci�n es clave para mantener el equilibrio de electrolitos y mejorar     " + 
                                                  "\n la funci�n cognitiva, reduciendo el riesgo de complicaciones neurol�gicas. EJERCICIO: La actividad f�sica debe       " +
                                                  "\n ser m�nima y adaptada, como ejercicios de respiraci�n y movilidad pasiva, evitando esfuerzos excesivos que puedan    " +
                                                  "\n comprometer la recuperaci�n. Movilizar el cuerpo de manera controlada ayuda a prevenir la rigidez muscular y mejora  " +
                                                  "\n la circulaci�n, lo que favorece la recuperaci�n. POSIBLE TRATAMIENTO: Para la meningitis bacteriana en adultos       " +
                                                  "\n mayores, el tratamiento suele incluir antibi�ticos intravenosos como ceftriaxona o vancomicina, dependiendo del agente    " +
                                                  "\n causal. Tambi�n se recomienda el uso de corticosteroides para reducir la inflamaci�n cerebral y en algunos casos,         " +
                                                  "\n soporte respiratorio. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales  " +
                                                  "\n para fortalecer el sistema inmune y mejorar la recuperaci�n, tales como Frutas c�tricas (naranjas, limones, vitamina C,   " +
                                                  "\n 50 mg por 100 g, fortalece el sistema inmune y mejora la absorci�n de hierro), Espinacas (vitamina A y C, 937 �g de       " +
                                                  "\n vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E, " +
                                                  "\n 25 mg por 100 g, ayuda a reducir la inflamaci�n y proteger las c�lulas), Yogur natural (probi�ticos, mejora la salud        " +
                                                  "\n intestinal y fortalece el sistema inmune), Pescados grasos (salm�n, Omega-3, 2 g por 100 g, ayuda a reducir la inflamaci�n  " +
                                                  "\n y mejorar la funci�n celular). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%   " +
                                                  "\n que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un Diagn�stico   " +
                                                  "\n de Mi Vida para mayor seguridad en el tratamiento. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface    " +
                                                  "\n del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n En adultos mayores, el c�ncer requiere un enfoque integral para mejorar la calidad de vida y el tratamiento.          " +
                                                  "\n HIDRATACI�N: Es recomendable que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente ocho a diez " +
                                                  "\n vasos de tama�o regular) para mantener una adecuada funci�n renal y evitar la deshidrataci�n, que puede afectar la    " +
                                                  "\n tolerancia a los tratamientos oncol�gicos. La hidrataci�n tambi�n ayuda a reducir la fatiga y mejorar la funci�n celular,  " +
                                                  "\n lo que es crucial para la recuperaci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada, como caminatas de 30  " +
                                                  "\n minutos diarios, ejercicios de bajo impacto como yoga o nataci�n, siempre bajo supervisi�n m�dica para evitar fatiga extrema." +
                                                  "\n El ejercicio mejora la circulaci�n, fortalece los m�sculos y ayuda a reducir los efectos secundarios del tratamiento, como   " +
                                                  "\n la fatiga y la p�rdida de masa muscular. POSIBLE TRATAMIENTO: Para el c�ncer en adultos mayores, el tratamiento suele incluir" +
                                                  "\n quimioterapia, radioterapia o inmunoterapia, dependiendo del tipo y estadio del c�ncer. Tambi�n se recomienda un enfoque     " +
                                                  "\n multidisciplinario con apoyo nutricional y psicol�gico. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en         " +
                                                  "\n antioxidantes, prote�nas y nutrientes esenciales para fortalecer el sistema inmune y mejorar la recuperaci�n, tales como     " +
                                                  "\n Frutas c�tricas (naranjas, limones, vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora la absorci�n de hierro)," +
                                                  "\n Espinacas (vitamina A y C, 937 �g de vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la     " +
                                                  "\n respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamaci�n y proteger las c�lulas), Yogur   " +
                                                  "\n natural (probi�ticos, mejora la salud intestinal y fortalece el sistema inmune), Pescados grasos (salm�n, Omega-3, 2 g por " +
                                                  "\n 100 g, ayuda a reducir la inflamaci�n y mejorar la funci�n celular). Este es solo un diagn�stico predeterminado l�gico,    " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se    " +
                                                  "\n recomienda realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad en el tratamiento. Adem�s, por su salud, si la   " +
                                                  "\n respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            
                        }
                        if(EstaturaMasculino.equals("1.45-1.70 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n En adultos mayores, la gripe puede ser m�s severa debido a la disminuci�n de la respuesta inmune con la edad.  " +
                                                  "\n HIDRATACI�N: Es recomendable que el paciente mantenga una hidrataci�n adecuada, consumiendo entre 2 y 2.5      " +
                                                  "\n litros de agua al d�a (aproximadamente ocho a diez vasos de tama�o regular) para ayudar a mantener las mucosas " +
                                                  "\n hidratadas y facilitar la expulsi�n de secreciones. La hidrataci�n tambi�n contribuye a la regulaci�n de la    " +
                                                  "\n temperatura corporal y al transporte eficiente de nutrientes esenciales para la recuperaci�n. EJERCICIO: La       " + 
                                                  "\n actividad f�sica debe ser suave y adaptada, como caminatas cortas de 20 a 30 minutos diarios, evitando esfuerzos  " +
                                                  "\n excesivos y asegurando una buena ventilaci�n en el entorno para reducir el riesgo de complicaciones respiratorias." +
                                                  "\n El ejercicio moderado mejora la circulaci�n sangu�nea, fortalece el sistema inmunol�gico y ayuda a reducir la     " +
                                                  "\n fatiga causada por la enfermedad. POSIBLE TRATAMIENTO: Para la gripe en adultos mayores, el tratamiento suele     " +
                                                  "\n incluir antivirales como oseltamivir (Tamiflu) en casos graves o de riesgo, adem�s de medicamentos para aliviar   " +
                                                  "\n s�ntomas como paracetamol (Tempra) o ibuprofeno (Advil) para la fiebre y el malestar. Tambi�n se recomienda el    " +
                                                  "\n uso de jarabes expectorantes para facilitar la eliminaci�n de flemas. La vacunaci�n anual contra la influenza     " +
                                                  "\n es clave para la prevenci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en vitamina C y antioxidantes " +
                                                  "\n para fortalecer el sistema inmune, tales como Naranjas y mandarinas (vitamina C, 50 mg por 100 g, fortalece el   " +
                                                  "\n sistema inmune y reduce la duraci�n de los s�ntomas), Kiwi (vitamina C, 100 mg por 100 g, refuerza el sistema    " +
                                                  "\n inmunol�gico y mejora la absorci�n de hierro), Fresas (antioxidantes y vitamina C, 58 mg por 100 g, protegen las " +
                                                  "\n c�lulas del da�o oxidativo y fortalecen el sistema inmune), Espinacas y br�coli (vitamina A y C, 937 �g de       " +
                                                  "\n vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Miel        " +
                                                  "\n (propiedades antimicrobianas y suavizantes para la garganta, ayuda a reducir la irritaci�n y la tos), Caldos     " +
                                                  "\n calientes (favorecen la hidrataci�n y alivian la congesti�n nasal). Este es solo un diagn�stico predeterminado   " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea  " +
                                                  "\n el adecuado. Se recomienda realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad en el tratamiento.     " +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico." +
                                                  "\n �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n En adultos mayores, la neumon�a puede ser grave debido a la disminuci�n de la respuesta inmune y la posible   " +
                                                  "\n presencia de enfermedades cr�nicas. HIDRATACI�N: Es fundamental que el paciente consuma entre 2 y 2.5 litros  " +
                                                  "\n de agua al d�a (aproximadamente ocho a diez vasos de tama�o regular) para mantener las v�as respiratorias     " +
                                                  "\n hidratadas y facilitar la expulsi�n de secreciones. La hidrataci�n tambi�n ayuda a reducir la inflamaci�n     " +
                                                  "\n pulmonar y mejora la oxigenaci�n de los tejidos, lo que es crucial para la recuperaci�n. EJERCICIO: La        " +
                                                  "\n actividad f�sica debe ser moderada y adaptada, como caminatas cortas de 15 a 20 minutos diarios, evitando     " +
                                                  "\n esfuerzos excesivos y asegurando una buena ventilaci�n en el entorno para reducir el riesgo de complicaciones " +
                                                  "\n respiratorias. Movilizar el cuerpo de manera controlada ayuda a prevenir la rigidez muscular y mejora la      " +
                                                  "\n circulaci�n, lo que favorece la recuperaci�n. POSIBLE TRATAMIENTO: Para la neumon�a en adultos mayores, el    " +
                                                  "\n tratamiento suele incluir antibi�ticos como amoxicilina con �cido clavul�nico (Clavulin) o levofloxacino      " +
                                                  "\n (Levaquin) en casos bacterianos, adem�s de medicamentos para aliviar s�ntomas como paracetamol (Tempra)       " +
                                                  "\n o ibuprofeno (Advil) para la fiebre y el malestar. Tambi�n se recomienda el uso de broncodilatadores en casos " +
                                                  "\n de dificultad respiratoria y oxigenoterapia en situaciones graves. La vacunaci�n contra neumococo e influenza " +
                                                  "\n es clave para la prevenci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en vitamina C,         " +
                                                  "\n antioxidantes y minerales esenciales para fortalecer el sistema inmune y mejorar la recuperaci�n, tales como  " +
                                                  "\n Naranjas y mandarinas (vitamina C, 50 mg por 100 g, fortalece el sistema inmune y reduce la duraci�n de los   " +
                                                  "\n s�ntomas), Kiwi (vitamina C, 100 mg por 100 g, refuerza el sistema inmunol�gico y mejora la absorci�n de hierro)," +
                                                  "\n Fresas (antioxidantes y vitamina C, 58 mg por 100 g, protegen las c�lulas del da�o oxidativo y fortalecen el  " +
                                                  "\n sistema inmune), Espinacas y br�coli (vitamina A y C, 937 �g de vitamina A y 89 mg de vitamina C por 100 g,   " +
                                                  "\n esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, ayuda a      " +
                                                  "\n reducir la inflamaci�n y fortalecer el sistema inmunol�gico), Miel (propiedades antimicrobianas y suavizantes " +
                                                  "\n para la garganta, ayuda a reducir la irritaci�n y la tos), Caldos calientes (favorecen la hidrataci�n y alivian " +
                                                  "\n la congesti�n nasal). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%" +
                                                  "\n que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un   " +
                                                  "\n Diagn�stico de Mi Vida para mayor seguridad en el tratamiento. Adem�s, por su salud, si la respuesta del        " +
                                                  "\n diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita    " +
                                                  "\n a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n En adultos mayores, la diabetes puede generar complicaciones graves si no se controla adecuadamente.      " +
                                                  "\n HIDRATACI�N: Es fundamental que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente  " +
                                                  "\n ocho a diez vasos de tama�o regular) para mantener una adecuada funci�n renal y evitar la deshidrataci�n,    " +
                                                  "\n que puede afectar los niveles de glucosa en sangre. La hidrataci�n tambi�n ayuda a mejorar la circulaci�n    " +
                                                  "\n y la funci�n metab�lica, lo que es clave para el control de la enfermedad. EJERCICIO: La actividad f�sica    " +
                                                  "\n debe ser moderada y adaptada, como caminatas de 30 minutos diarios, ejercicios de bajo impacto como nataci�n " +
                                                  "\n o yoga, siempre bajo supervisi�n m�dica para evitar hipoglucemias. El ejercicio mejora la sensibilidad a la  " +
                                                  "\n insulina, ayuda a controlar los niveles de glucosa y fortalece el sistema cardiovascular. POSIBLE TRATAMIENTO: " +
                                                  "\n Para la diabetes en adultos mayores, el tratamiento suele incluir medicamentos como metformina (Glucophage)    " +
                                                  "\n para mejorar la sensibilidad a la insulina, insulina en casos necesarios, y medicamentos como glibenclamida o  " +
                                                  "\n sitagliptina para el control de la glucosa. Es clave mantener un monitoreo constante de los niveles de az�car  " +
                                                  "\n en sangre y seguir una dieta equilibrada. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en fibra,  " +
                                                  "\n antioxidantes y nutrientes esenciales para el control de la glucosa, tales como Avena (fibra soluble, 4 g por  " +
                                                  "\n 100 g, ayuda a estabilizar los niveles de glucosa), Frijoles (fibra y prote�nas, 6 g de fibra por 100 g,       " +
                                                  "\n contribuyen a la regulaci�n del az�car en sangre), Espinacas (magnesio, 79 mg por 100 g, mejora la sensibilidad " +
                                                  "\n a la insulina), Naranjas (vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora la absorci�n de     " +
                                                  "\n hierro), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamaci�n y proteger las c�lulas), Canela " +
                                                  "\n (compuestos bioactivos, ayuda a mejorar la sensibilidad a la insulina). Este es solo un diagn�stico predeterminado" +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento      " +
                                                  "\n sea el adecuado. Se recomienda realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad en el tratamiento." +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su " +
                                                  "\n m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n En adultos mayores, el asma puede generar mayor dificultad respiratoria y riesgo de exacerbaciones, por lo que es      " +
                                                  "\n fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que el paciente mantenga una    " +
                                                  "\n hidrataci�n adecuada, consumiendo al menos 2.5 litros de agua al d�a (aproximadamente diez vasos de tama�o regular)    " +
                                                  "\n para favorecer la eliminaci�n de toxinas y mantener las v�as respiratorias hidratadas. EJERCICIO: En cuanto a la       " +
                                                  "\n actividad f�sica, es recomendable realizar ejercicios de bajo impacto, como caminatas de 30 minutos diarios, nataci�n  " +
                                                  "\n o yoga, siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer la funci�n pulmonar. POSIBLE TRATAMIENTO: " +
                                                  "\n El tratamiento est�ndar para el asma incluye broncodilatadores de alivio r�pido, como el salbutamol (Ventolin),           " +
                                                  "\n corticosteroides inhalados para el control a largo plazo, como la fluticasona (Flixotide), y en algunos casos, modificadores " +
                                                  "\n de leucotrienos como el montelukast (Singulair). Es fundamental seguir estrictamente el plan de acci�n para el asma indicado " +
                                                  "\n por el m�dico y usar los medicamentos preventivos regularmente. ALIMENTACI�N RECOMENDADA: Se recomienda el consumo de   " +
                                                  "\n alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como: Pescados grasos        " +
                                                  "\n (salm�n, at�n): Ricos en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias y pueden ayudar a reducir la   " +
                                                  "\n inflamaci�n de las v�as respiratorias, aportando aproximadamente el 50% del requerimiento diario por cada 100 gramos de " +
                                                  "\n salm�n. Frutas y verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli): Ricas en antioxidantes como la      " +
                                                  "\n vitamina C y carotenoides, que pueden proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico, aportando cerca   " +
                                                  "\n del 89% del requerimiento diario por cada 100 gramos de fresas. Jengibre: Contiene compuestos con efectos antiinflamatorios " +
                                                  "\n que podr�an ser beneficiosos para las v�as respiratorias. C�rcuma: Con su componente activo, la curcumina, tambi�n tiene    " +
                                                  "\n potentes propiedades antiinflamatorias y antioxidantes. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor " +
                                                  "\n seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado.  " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n En adultos mayores, el VIH/SIDA puede generar mayor vulnerabilidad a infecciones oportunistas y complicaciones    " +
                                                  "\n sist�micas, por lo que es fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda  " +
                                                  "\n que el paciente mantenga una hidrataci�n adecuada, consumiendo al menos 2.5 litros de agua al d�a (aproximadamente  " +
                                                  "\n diez vasos de tama�o regular) para favorecer la eliminaci�n de toxinas y mantener el sistema inmunol�gico fuerte.   " +
                                                  "\n EJERCICIO: En cuanto a la actividad f�sica, es recomendable realizar ejercicios de bajo impacto, como caminatas de  " +
                                                  "\n 30 minutos diarios, nataci�n o yoga, siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer la     " +
                                                  "\n funci�n cardiovascular. POSIBLE TRATAMIENTO: El tratamiento est�ndar para el VIH/SIDA incluye terapia antirretroviral " +
                                                  "\n combinada (TAR), con medicamentos como tenofovir, emtricitabina y dolutegravir, que ayudan a reducir la carga viral   " +
                                                  "\n y mejorar la funci�n inmunol�gica. Es fundamental seguir estrictamente el tratamiento indicado por el m�dico y        " +
                                                  "\n realizar controles peri�dicos para evaluar la respuesta al tratamiento. ALIMENTACI�N RECOMENDADA: Se recomienda el    " +
                                                  "\n consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a combatir infecciones, tales como: Frutas      " +
                                                  "\n c�tricas (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece el sistema inmunol�gico y ayuda a reducir  " +
                                                  "\n la duraci�n de infecciones, aportando aproximadamente el 89% del requerimiento diario por cada 100 gramos. Yogur      " +
                                                  "\n natural: Contiene probi�ticos, que pueden ayudar a mantener el equilibrio de la flora bacteriana y mejorar la respuesta " +
                                                  "\n inmunol�gica, proporcionando cerca del 20% del requerimiento diario de calcio por cada porci�n de 150 gramos. Verduras  " +
                                                  "\n de hoja verde (espinaca, acelga, br�coli): Ricas en antioxidantes y vitaminas esenciales para la recuperaci�n, como la  " +
                                                  "\n vitamina A, que contribuye a la regeneraci�n celular y aporta cerca del 56% del requerimiento diario por cada 100       " +
                                                  "\n gramos de espinaca. Omega-3 (salm�n, at�n, ch�a): Con propiedades antiinflamatorias que pueden ayudar a reducir la      " +
                                                  "\n inflamaci�n y mejorar la respuesta inmunol�gica, aportando aproximadamente el 50% del requerimiento diario por cada     " +
                                                  "\n 100 gramos de salm�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que    " +
                                                  "\n el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda" +
                                                  "\n realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n En adultos mayores, la gonorrea puede presentar s�ntomas m�s leves o at�picos, por lo que es fundamental un         " +
                                                  "\n diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que el paciente mantenga una hidrataci�n    " +
                                                  "\n adecuada, consumiendo al menos 2 litros de agua al d�a (aproximadamente ocho vasos de tama�o regular) para          " +
                                                  "\n favorecer la eliminaci�n de toxinas y mantener el sistema inmunol�gico fuerte. EJERCICIO: En cuanto a la actividad       " +
                                                  "\n f�sica, es recomendable realizar ejercicio moderado, como caminatas de 30 a 45 minutos diarios, siempre bajo supervisi�n " +
                                                  "\n m�dica para evitar complicaciones. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la gonorrea incluye antibi�ticos    " +
                                                  "\n como la azitromicina y ceftriaxona, los cuales deben ser administrados bajo prescripci�n m�dica. En casos m�s graves,    " +
                                                  "\n puede requerirse hospitalizaci�n para recibir antibi�ticos intravenosos. Es fundamental que el paciente evite el contacto" +
                                                  "\n �ntimo hasta completar el tratamiento y que su pareja tambi�n reciba tratamiento para evitar reinfecciones. ALIMENTACI�N " +
                                                  "\n RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a combatir la        " +
                                                  "\n infecci�n, tales como: Ajo: Posee propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y       " +
                                                  "\n contiene alicina, un compuesto con efectos antibacterianos. Frutas c�tricas (naranjas, limones, toronjas): Ricas en      " +
                                                  "\n vitamina C, que fortalece el sistema inmunol�gico y ayuda a reducir la duraci�n de infecciones, aportando aproximadamente" +
                                                  "\n el 89% del requerimiento diario por cada 100 gramos. Yogur natural: Contiene probi�ticos, que pueden ayudar a mantener el" +
                                                  "\n equilibrio de la flora bacteriana y mejorar la respuesta inmunol�gica, proporcionando cerca del 20% del requerimiento    " +
                                                  "\n diario de calcio por cada porci�n de 150 gramos. Verduras de hoja verde (espinaca, acelga, br�coli): Ricas en            " +
                                                  "\n antioxidantes y vitaminas esenciales para la recuperaci�n, como la vitamina A, que contribuye a la regeneraci�n celular  " +
                                                  "\n y aporta cerca del 56% del requerimiento diario por cada 100 gramos de espinaca. Este es solo un diagn�stico predeterminado" +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean         " +
                                                  "\n completamente correctas. Para mayor seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para " +
                                                  "\n establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n En adultos mayores, el herpes genital puede causar s�ntomas m�s prolongados y complicaciones debido a la disminuci�n " +
                                                  "\n de la respuesta inmunol�gica. EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas suaves y ejercicios " +
                                                  "\n de movilidad para mejorar la circulaci�n y reducir la fatiga. Tambi�n es recomendable realizar ejercicios de         " +
                                                  "\n relajaci�n y respiraci�n para reducir el estr�s, ya que este puede desencadenar brotes de herpes. HIDRATACI�N: Es    " +
                                                  "\n esencial el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tama�o regular) para mantener el  " +
                                                  "\n cuerpo hidratado y ayudar a reducir la inflamaci�n. POSIBLE TRATAMIENTO: El herpes genital se trata con antivirales, " +
                                                  "\n como aciclovir, valaciclovir o famciclovir, que ayudan a reducir la duraci�n y gravedad de los brotes. Tambi�n se    " +
                                                  "\n recomienda el uso de cremas t�picas para aliviar el dolor y la irritaci�n. ALIMENTACI�N: Se recomienda el consumo de " +
                                                  "\n alimentos que ayuden a fortalecer el sistema inmunol�gico y reducir la inflamaci�n, tales como ar�ndanos, ricos en   " +
                                                  "\n antioxidantes y vitamina C, aportando 25% de la ingesta diaria recomendada. espinacas, que contienen hierro y vitamina A," +
                                                  "\n esenciales para la recuperaci�n, proporcionando 15% de la ingesta diaria recomendada de hierro. jengibre, con propiedades" +
                                                  "\n antiinflamatorias y antioxidantes, aportando 5% de la ingesta diaria recomendada de vitamina C. c�rcuma, con curcumina,  " +
                                                  "\n que tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de           " +
                                                  "\n antioxidantes. yogur natural, que contiene probi�ticos beneficiosos para la flora intestinal, proporcionando 15% de la   " +
                                                  "\n ingesta diaria recomendada de calcio. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda" +
                                                  "\n realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n En adultos mayores, la s�filis puede progresar a etapas avanzadas si no se trata adecuadamente, afectando   " +
                                                  "\n �rganos internos y el sistema nervioso. EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas  " +
                                                  "\n suaves y ejercicios de movilidad para mejorar la circulaci�n y reducir la fatiga. Tambi�n es recomendable   " +
                                                  "\n realizar ejercicios de respiraci�n y relajaci�n para mejorar la oxigenaci�n y reducir el estr�s. HIDRATACI�N: " +
                                                  "\n Es fundamental el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tama�o regular) para " +
                                                  "\n mantener el cuerpo hidratado y ayudar a reducir la inflamaci�n. POSIBLE TRATAMIENTO: La s�filis se trata con  " +
                                                  "\n antibi�ticos, como penicilina G benzatina, que es el tratamiento de primera elecci�n. En casos de alergia a la   " +
                                                  "\n penicilina, se pueden utilizar doxiciclina o ceftriaxona. ALIMENTACI�N: Se recomienda el consumo de alimentos    " +
                                                  "\n que ayuden a fortalecer el sistema inmunol�gico y reducir la inflamaci�n, tales como ajo, que contiene alicina   " +
                                                  "\n con propiedades antimicrobianas, aportando 5% de la ingesta diaria recomendada de antioxidantes. jengibre, con   " +
                                                  "\n efectos antiinflamatorios y antioxidantes, aportando 5% de la ingesta diaria recomendada de vitamina C. c�rcuma, " +
                                                  "\n con curcumina, que tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria   " +
                                                  "\n recomendada de antioxidantes. frutas c�tricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalece  " +
                                                  "\n el sistema inmunol�gico, aportando 90 mg por cada 100 g de fruta, lo que representa 100% de la ingesta diaria    " +
                                                  "\n recomendada. yogur natural, que contiene probi�ticos beneficiosos para la flora intestinal, proporcionando 15%   " +
                                                  "\n de la ingesta diaria recomendada de calcio. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas.  " +
                                                  "\n Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento  " +
                                                  "\n adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n En adultos mayores, la tuberculosis puede ser grave debido a la disminuci�n de la funci�n pulmonar y la posibilidad " +
                                                  "\n de complicaciones respiratorias. EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas suaves y        " +
                                                  "\n ejercicios de respiraci�n para mejorar la capacidad pulmonar. Tambi�n es recomendable realizar ejercicios de        " +
                                                  "\n movilidad y estiramientos para mejorar la circulaci�n y reducir la fatiga. Debido a que la tuberculosis afecta      " +
                                                  "\n la funci�n pulmonar, es importante realizar ejercicios de respiraci�n profunda, como la t�cnica de respiraci�n      " +
                                                  "\n diafragm�tica, que ayuda a mejorar la oxigenaci�n y reducir la sensaci�n de falta de aire. Tambi�n se recomienda    " +
                                                  "\n la respiraci�n con labios fruncidos, que permite controlar la exhalaci�n y mejorar la eficiencia respiratoria.      " +
                                                  "\n HIDRATACI�N: Es esencial el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tama�o regular)  " +
                                                  "\n para mantener el cuerpo hidratado y ayudar a reducir la inflamaci�n de las v�as respiratorias. POSIBLE TRATAMIENTO: " +
                                                  "\n La tuberculosis se trata con antibi�ticos espec�ficos, como isoniazida, rifampicina, pirazinamida y etambutol,      " +
                                                  "\n administrados en un r�gimen prolongado de varios meses. En casos graves, se puede requerir hospitalizaci�n y ox�geno" +
                                                  "\n suplementario. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema respiratorio y" +   
                                                  "\n reducir la inflamaci�n, tales como pescados grasos (salm�n, at�n), ricos en �cidos grasos Omega-3, que poseen propiedades" +
                                                  "\n antiinflamatorias, aportando 50% de la ingesta diaria recomendada de Omega-3. frutas y verduras de colores vivos         " +
                                                  "\n (ar�ndanos, fresas, espinacas, br�coli), ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger   " +
                                                  "\n las c�lulas del da�o y fortalecer el sistema inmunol�gico, aportando 70% de la ingesta diaria recomendada de vitamina C. " +
                                                  "\n jengibre, que contiene compuestos con efectos antiinflamatorios que podr�an ser beneficiosos para las v�as respiratorias," +
                                                  "\n aportando 5% de la ingesta diaria recomendada de vitamina C. c�rcuma, con su componente activo, la curcumina, que tiene  " +
                                                  "\n potentes propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes." +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta  " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico " +
                                                  "\n y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida)  " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n En adultos mayores, la artritis puede causar dolor cr�nico y afectar la movilidad, lo que impacta la calidad      " +
                                                  "\n de vida. HIDRATACI�N: Es fundamental que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente " +
                                                  "\n ocho a diez vasos de tama�o regular) para mantener la lubricaci�n de las articulaciones y reducir la inflamaci�n. " +
                                                  "\n La hidrataci�n tambi�n ayuda a eliminar toxinas y mejorar la circulaci�n, lo que favorece la regeneraci�n de los  " +
                                                  "\n tejidos articulares. EJERCICIO: La actividad f�sica debe ser moderada y adaptada, como ejercicios de bajo impacto " +
                                                  "\n como nataci�n, yoga o caminatas de 30 minutos diarios. El ejercicio fortalece los m�sculos que rodean las         " +
                                                  "\n articulaciones, mejora la flexibilidad y reduce la rigidez matutina. POSIBLE TRATAMIENTO: Para la artritis en     " +
                                                  "\n adultos mayores, el tratamiento suele incluir antiinflamatorios como ibuprofeno (Advil) o naproxeno, medicamentos " +
                                                  "\n modificadores de la enfermedad como metotrexato, y en algunos casos, terapias biol�gicas. Tambi�n se recomienda   " +
                                                  "\n fisioterapia para mejorar la movilidad y reducir el dolor. ALIMENTACI�N: Se recomienda el consumo de alimentos    " +
                                                  "\n ricos en antioxidantes, �cidos grasos esenciales y minerales para fortalecer las articulaciones y reducir la      " +
                                                  "\n inflamaci�n, tales como Pescados grasos (salm�n, Omega-3, 2 g por 100 g, ayuda a reducir la inflamaci�n articular)," +
                                                  "\n Frutas y verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli, vitamina C, 89 mg por 100 g, fortalece " +
                                                  "\n el sistema inmune y protege las c�lulas del da�o oxidativo), Jengibre (compuestos antiinflamatorios, ayuda a      " +
                                                  "\n reducir el dolor articular), C�rcuma (curcumina, 3% de concentraci�n, potente antioxidante y antiinflamatorio),   " +
                                                  "\n Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamaci�n y proteger las c�lulas). Este es solo un   " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad  " +
                                                  "\n ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad" +
                                                  "\n en el tratamiento. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda  " +
                                                  "\n consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n En adultos mayores, la tosferina puede ser grave y causar complicaciones respiratorias si no se trata adecuadamente. " +
                                                  "\n HIDRATACI�N: Es esencial que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente ocho a diez    " +
                                                  "\n vasos de tama�o regular) para mantener las v�as respiratorias hidratadas y reducir la viscosidad de las secreciones. " +
                                                  "\n La hidrataci�n tambi�n ayuda a calmar la irritaci�n de la garganta y mejorar la funci�n pulmonar. EJERCICIO: La      " +
                                                  "\n actividad f�sica debe ser m�nima y adaptada, como ejercicios de respiraci�n y movilidad pasiva, evitando esfuerzos   " +
                                                  "\n excesivos que puedan comprometer la recuperaci�n. Movilizar el cuerpo de manera controlada ayuda a prevenir la       " +
                                                  "\n rigidez muscular y mejora la circulaci�n, lo que favorece la recuperaci�n. POSIBLE TRATAMIENTO: Para la tosferina    " +
                                                  "\n en adultos mayores, el tratamiento suele incluir antibi�ticos como azitromicina o eritromicina para eliminar la      " +
                                                  "\n bacteria, adem�s de medicamentos para aliviar la tos y reducir la inflamaci�n de las v�as respiratorias. Tambi�n     " +
                                                  "\n se recomienda el uso de humidificadores para mejorar la respiraci�n. ALIMENTACI�N: Se recomienda el consumo de       " +
                                                  "\n alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmune y mejorar la recuperaci�n," +
                                                  "\n tales como Frutas c�tricas (naranjas, limones, vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora     " +
                                                  "\n la absorci�n de hierro), Espinacas (vitamina A y C, 937 �g de vitamina A y 89 mg de vitamina C por 100 g, esenciales " +
                                                  "\n para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamaci�n " +
                                                  "\n y proteger las c�lulas), Miel (propiedades antimicrobianas y suavizantes para la garganta, ayuda a reducir la        " +
                                                  "\n irritaci�n y la tos), Caldos calientes (favorecen la hidrataci�n y alivian la congesti�n nasal). Este es solo un     " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad     " +
                                                  "\n ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad  " +
                                                  "\n en el tratamiento. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda " +
                                                  "\n consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n En adultos mayores, las paperas pueden causar inflamaci�n severa de las gl�ndulas salivales y generar complicaciones " +
                                                  "\n si no se manejan adecuadamente. HIDRATACI�N: Es recomendable que el paciente consuma entre 2 y 2.5 litros de agua al " +
                                                  "\n d�a (aproximadamente ocho a diez vasos de tama�o regular) para mantener una adecuada funci�n renal y evitar la       " +
                                                  "\n deshidrataci�n, que puede afectar la recuperaci�n. La hidrataci�n tambi�n ayuda a reducir la inflamaci�n de las      " +
                                                  "\n gl�ndulas y mejorar la producci�n de saliva. EJERCICIO: La actividad f�sica debe ser moderada y adaptada, como       " +
                                                  "\n caminatas de 30 minutos diarios, ejercicios de bajo impacto como yoga o nataci�n, siempre bajo supervisi�n m�dica    " +
                                                  "\n para evitar fatiga extrema. El ejercicio mejora la circulaci�n, fortalece los m�sculos y ayuda a reducir los efectos " +
                                                  "\n secundarios de la inflamaci�n. POSIBLE TRATAMIENTO: Para las paperas en adultos mayores, el tratamiento suele incluir  " +
                                                  "\n analg�sicos como paracetamol o ibuprofeno para reducir el dolor y la fiebre, adem�s de reposo y aislamiento para evitar" +
                                                  "\n la propagaci�n del virus. Tambi�n se recomienda la aplicaci�n de compresas fr�as en la zona inflamada. ALIMENTACI�N:   " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes, prote�nas y nutrientes esenciales para fortalecer el     " +
                                                  "\n sistema inmune y mejorar la recuperaci�n, tales como Frutas c�tricas (naranjas, limones, vitamina C, 50 mg por 100 g,  " +
                                                  "\n fortalece el sistema inmune y mejora la absorci�n de hierro), Espinacas (vitamina A y C, 937 �g de vitamina A y 89 mg  " +
                                                  "\n de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, " +
                                                  "\n ayuda a reducir la inflamaci�n y proteger las c�lulas), Yogur natural (probi�ticos, mejora la salud intestinal y fortalece" +
                                                  "\n el sistema inmune), Pescados grasos (salm�n, Omega-3, 2 g por 100 g, ayuda a reducir la inflamaci�n y mejorar la funci�n  " +
                                                  "\n celular). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga" +
                                                  "\n esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un Diagn�stico de Mi Vida para mayor " +
                                                  "\n seguridad en el tratamiento. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda" +
                                                  "\n consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n En adultos mayores, el virus del Zika puede causar s�ntomas m�s intensos y prolongados, aumentando el riesgo de       " +
                                                  "\n complicaciones neurol�gicas, por lo que es fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N:   " +
                                                  "\n Se recomienda que el paciente mantenga una hidrataci�n adecuada, consumiendo al menos 2.5 litros de agua al d�a       " +
                                                  "\n (aproximadamente diez vasos de tama�o regular) para favorecer la eliminaci�n de toxinas y mantener el sistema inmunol�gico" +
                                                  "\n fuerte. EJERCICIO: En cuanto a la actividad f�sica, es recomendable realizar ejercicios de bajo impacto, como caminatas   " +
                                                  "\n de 30 minutos diarios, nataci�n o yoga, siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer la funci�n" +
                                                  "\n cardiovascular. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral espec�fico para el Zika, por lo que el manejo es  " +
                                                  "\n sintom�tico. Se recomienda el uso de analg�sicos como paracetamol para aliviar la fiebre y el malestar, antihistam�nicos  " +
                                                  "\n para reducir el prurito y reposo adecuado. Es fundamental evitar el uso de aspirina y otros antiinflamatorios no esteroides" +
                                                  "\n sin supervisi�n m�dica. ALIMENTACI�N RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema         " +
                                                  "\n inmunol�gico y ayuden a combatir la infecci�n, tales como: Frutas c�tricas (naranjas, limones, toronjas): Ricas en         " +
                                                  "\n vitamina C, que fortalece el sistema inmunol�gico y ayuda a reducir la duraci�n de infecciones, aportando aproximadamente  " +
                                                  "\n el 89% del requerimiento diario por cada 100 gramos. Jengibre: Contiene compuestos con efectos antiinflamatorios que pueden " +
                                                  "\n ayudar a reducir la fiebre y el malestar general. Verduras de hoja verde (espinaca, acelga, br�coli): Ricas en antioxidantes" +
                                                  "\n y vitaminas esenciales para la recuperaci�n, como la vitamina A, que contribuye a la regeneraci�n celular y aporta cerca del" +
                                                  "\n 56% del requerimiento diario por cada 100 gramos de espinaca. Omega-3 (salm�n, at�n, ch�a): Con propiedades antiinflamatorias" +
                                                  "\n que pueden ayudar a reducir la inflamaci�n y mejorar la respuesta inmunol�gica, aportando aproximadamente el 50% del      " +
                                                  "\n requerimiento diario por cada 100 gramos de salm�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor " +
                                                  "\n seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado.  " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n En adultos mayores, el rotavirus puede causar deshidrataci�n severa y complicaciones gastrointestinales, por      " +
                                                  "\n lo que es fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que el paciente  " +
                                                  "\n mantenga una hidrataci�n adecuada, consumiendo al menos 3 litros de agua al d�a (aproximadamente doce vasos de    " +
                                                  "\n tama�o regular) para compensar la p�rdida de l�quidos y evitar la deshidrataci�n. EJERCICIO: En cuanto a la       " +
                                                  "\n actividad f�sica, es recomendable realizar ejercicios de bajo impacto, como caminatas suaves de 20 minutos diarios,   " +
                                                  "\n siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer la funci�n digestiva. POSIBLE TRATAMIENTO:    " +
                                                  "\n No existe un tratamiento antiviral espec�fico para el rotavirus, por lo que el manejo es sintom�tico. Se recomienda   " +
                                                  "\n el uso de soluciones de rehidrataci�n oral para evitar la deshidrataci�n, as� como una dieta blanda y de f�cil digesti�n. " +
                                                  "\n En casos graves, puede requerirse hospitalizaci�n para administraci�n de l�quidos intravenosos. ALIMENTACI�N RECOMENDADA: " +
                                                  "\n Se recomienda el consumo de alimentos que fortalezcan el sistema digestivo y ayuden a combatir la infecci�n, tales como:  " +
                                                  "\n Pl�tano: Rico en potasio, que ayuda a reemplazar los electrolitos perdidos debido a la diarrea, aportando aproximadamente " +
                                                  "\n el 12% del requerimiento diario por cada 100 gramos. Yogur natural: Contiene probi�ticos, que pueden ayudar a restaurar la" +
                                                  "\n flora intestinal y mejorar la digesti�n, proporcionando cerca del 20% del requerimiento diario de calcio por cada porci�n " +
                                                  "\n de 150 gramos. Arroz blanco: Fuente de carbohidratos de f�cil digesti�n que ayuda a estabilizar el sistema digestivo y     " +
                                                  "\n aporta energ�a sin irritar el est�mago. Zanahoria: Rica en vitamina A, que contribuye a la regeneraci�n celular y fortalece" +
                                                  "\n la mucosa intestinal, aportando cerca del 56% del requerimiento diario por cada 100 gramos. Este es solo un diagn�stico    " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas " +
                                                  "\n sean completamente correctas. Para mayor seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico   " +
                                                  "\n para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n En adultos mayores, la listeriosis puede causar infecciones graves y afectar el sistema nervioso, por lo que      " +
                                                  "\n es fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que el paciente mantenga" +
                                                  "\n una hidrataci�n adecuada, consumiendo al menos 2.5 litros de agua al d�a (aproximadamente diez vasos de tama�o    " +
                                                  "\n regular) para favorecer la eliminaci�n de toxinas y mantener el sistema inmunol�gico fuerte. EJERCICIO: En cuanto " +
                                                  "\n a la actividad f�sica, es recomendable realizar ejercicios de bajo impacto, como caminatas de 30 minutos diarios,    " +
                                                  "\n nataci�n o yoga, siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer la funci�n inmunol�gica.    " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento est�ndar para la listeriosis incluye antibi�ticos como ampicilina y gentamicina, " +
                                                  "\n administrados bajo prescripci�n m�dica. En casos graves, puede requerirse hospitalizaci�n para administraci�n de     " +
                                                  "\n antibi�ticos intravenosos. ALIMENTACI�N RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema   " +
                                                  "\n inmunol�gico y ayuden a combatir la infecci�n, tales como: Ajo: Posee propiedades antimicrobianas naturales que pueden  " +
                                                  "\n ayudar a combatir infecciones y contiene alicina, un compuesto con efectos antibacterianos. Frutas c�tricas (naranjas,  " +
                                                  "\n limones, toronjas): Ricas en vitamina C, que fortalece el sistema inmunol�gico y ayuda a reducir la duraci�n de         " +
                                                  "\n infecciones, aportando aproximadamente el 89% del requerimiento diario por cada 100 gramos. Yogur natural: Contiene     " +
                                                  "\n probi�ticos, que pueden ayudar a mantener el equilibrio de la flora bacteriana y mejorar la respuesta inmunol�gica,     " +
                                                  "\n proporcionando cerca del 20% del requerimiento diario de calcio por cada porci�n de 150 gramos. Verduras de hoja verde  " +
                                                  "\n (espinaca, acelga, br�coli): Ricas en antioxidantes y vitaminas esenciales para la recuperaci�n, como la vitamina A,    " +
                                                  "\n que contribuye a la regeneraci�n celular y aporta cerca del 56% del requerimiento diario por cada 100 gramos de espinaca." +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta   " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar m�s de un   " +
                                                  "\n diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la     " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n En adultos mayores, la shigelosis puede causar diarrea severa y deshidrataci�n, lo que puede ser peligroso      " +
                                                  "\n si no se trata adecuadamente. EJERCICIO: Se recomienda actividad f�sica ligera, como caminatas cortas, evitando " +
                                                  "\n esfuerzos excesivos que puedan agravar la deshidrataci�n. Tambi�n es recomendable realizar ejercicios de        " +
                                                  "\n movilidad y estiramientos para mejorar la circulaci�n y reducir la fatiga. Debido a que la shigelosis causa     " +
                                                  "\n diarrea y p�rdida de l�quidos, es importante evitar ejercicios que generen sudoraci�n excesiva y optar por      " +
                                                  "\n movimientos suaves que ayuden a mantener la actividad sin comprometer la hidrataci�n. HIDRATACI�N: Es crucial el" +
                                                  "\n consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de agua de tama�o regular) para compensar la p�rdida" +
                                                  "\n de l�quidos y evitar la deshidrataci�n. Adem�s del agua pura, se recomienda el consumo de soluciones de         " +
                                                  "\n rehidrataci�n oral para reponer electrolitos esenciales como sodio y potasio. Tambi�n es beneficioso ingerir agua " +
                                                  "\n de coco, que contiene electrolitos naturales, y caldos ligeros, que aportan l�quidos y minerales esenciales para  " +
                                                  "\n la recuperaci�n. POSIBLE TRATAMIENTO: La shigelosis se trata con antibi�ticos, como azitromicina, ciprofloxacino  " +
                                                  "\n o ceftriaxona, dependiendo de la gravedad del caso. Tambi�n se recomienda rehidrataci�n oral y una dieta adecuada." +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a reponer l�quidos y fortalecer el sistema digestivo,  " +
                                                  "\n tales como pl�tanos, ricos en potasio, que ayudan a reemplazar los electrolitos perdidos, aportando 10% de la ingesta " +
                                                  "\n diaria recomendada de potasio. arroz blanco, que es f�cil de digerir y ayuda a estabilizar el sistema digestivo,      " +
                                                  "\n proporcionando 20% de la ingesta diaria recomendada de carbohidratos. zanahorias, ricas en vitamina A, que ayudan a   " +
                                                  "\n la recuperaci�n del sistema digestivo, aportando 50% de la ingesta diaria recomendada de vitamina A. agua de coco,    " +
                                                  "\n que ayuda a la hidrataci�n y aporta electrolitos esenciales. yogur natural, que contiene probi�ticos beneficiosos     " +
                                                  "\n para la flora intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio. Este es solo un diagn�stico  " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas" +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para  " +
                                                  "\n establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n En adultos mayores, la EPOC puede causar dificultad para respirar y fatiga, afectando la calidad de vida.         " +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas suaves y ejercicios de respiraci�n para        " +
                                                  "\n mejorar la capacidad pulmonar. Tambi�n es recomendable realizar ejercicios de movilidad y estiramientos para      " +
                                                  "\n mejorar la circulaci�n y reducir la fatiga. Debido a que la EPOC afecta la funci�n pulmonar, es importante        " +
                                                  "\n realizar ejercicios de respiraci�n profunda, como la t�cnica de respiraci�n diafragm�tica, que ayuda a mejorar    " +
                                                  "\n la oxigenaci�n y reducir la sensaci�n de falta de aire. Tambi�n se recomienda la respiraci�n con labios fruncidos," +  
                                                  "\n que permite controlar la exhalaci�n y mejorar la eficiencia respiratoria. HIDRATACI�N: Es esencial el consumo diario  " +
                                                  "\n de 2.5 a 2.75 litros de agua (ocho a diez vasos de agua de tama�o regular) para mantener el cuerpo hidratado y ayudar " +
                                                  "\n a reducir la inflamaci�n de las v�as respiratorias. Adem�s del agua pura, se recomienda el consumo de infusiones de   " +
                                                  "\n hierbas, como t� de jengibre o manzanilla, que pueden ayudar a reducir la inflamaci�n y mejorar la respiraci�n.       " +
                                                  "\n Tambi�n es beneficioso ingerir jugos naturales sin az�car, que aportan antioxidantes y vitaminas esenciales para      " +
                                                  "\n la funci�n pulmonar. POSIBLE TRATAMIENTO: La EPOC se trata con broncodilatadores, como salbutamol, tiotropio o        " +
                                                  "\n formoterol, adem�s de corticosteroides inhalados, como fluticasona o budesonida. En casos graves, se puede requerir   " +
                                                  "\n ox�geno suplementario y rehabilitaci�n pulmonar. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a     " +
                                                  "\n fortalecer el sistema respiratorio y reducir la inflamaci�n, tales como pescados grasos (salm�n, at�n), ricos en      " +
                                                  "\n �cidos grasos Omega-3, que poseen propiedades antiinflamatorias, aportando 50% de la ingesta diaria recomendada de    " +
                                                  "\n Omega-3. frutas y verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli), ricas en antioxidantes como la   " +
                                                  "\n vitamina C y carotenoides, que pueden proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico, aportando   " +
                                                  "\n 70% de la ingesta diaria recomendada de vitamina C. jengibre, que contiene compuestos con efectos antiinflamatorios   " +
                                                  "\n que podr�an ser beneficiosos para las v�as respiratorias, aportando 5% de la ingesta diaria recomendada de vitamina C." +
                                                  "\n c�rcuma, con su componente activo, la curcumina, que tiene potentes propiedades antiinflamatorias y antioxidantes,    " +
                                                  "\n proporcionando 3% de la ingesta diaria recomendada de antioxidantes. Este es solo un diagn�stico predeterminado l�gico," +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente " +
                                                  "\n correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento" +
                                                  "\n adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n En adultos mayores, la clamidia puede causar s�ntomas prolongados y complicaciones si no se trata adecuadamente.   " +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas suaves y ejercicios de movilidad para mejorar   " +
                                                  "\n la circulaci�n y reducir la fatiga. Tambi�n es recomendable realizar ejercicios de relajaci�n y respiraci�n para   " +
                                                  "\n reducir el estr�s, ya que este puede afectar la respuesta inmunol�gica y prolongar la infecci�n. HIDRATACI�N: Es   " +
                                                  "\n esencial el consumo diario de 2.5 a 2.75 litros de agua (ocho a diez vasos de agua de tama�o regular) para mantener" +
                                                  "\n el cuerpo hidratado y ayudar a reducir la inflamaci�n. Adem�s del agua pura, se recomienda el consumo de jugos     " +
                                                  "\n naturales ricos en vitamina C, como jugo de naranja o toronja, que pueden fortalecer el sistema inmunol�gico.      " +
                                                  "\n Tambi�n es beneficioso ingerir caldos ligeros, que aportan l�quidos y minerales esenciales para la recuperaci�n.   " +
                                                  "\n POSIBLE TRATAMIENTO: La clamidia se trata con antibi�ticos, como azitromicina o doxiciclina, administrados en un   " +
                                                  "\n r�gimen de varios d�as. Tambi�n se recomienda el uso de medidas preventivas, como el uso de preservativos y la     " +
                                                  "\n detecci�n temprana en parejas sexuales. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer" +      
                                                  "\n el sistema inmunol�gico y reducir la inflamaci�n, tales como ar�ndanos, ricos en antioxidantes y vitamina C, aportando      " +
                                                  "\n 25% de la ingesta diaria recomendada. espinacas, que contienen hierro y vitamina A, esenciales para la recuperaci�n,        " +
                                                  "\n proporcionando 15% de la ingesta diaria recomendada de hierro. jengibre, con propiedades antiinflamatorias y antioxidantes, " +
                                                  "\n aportando 5% de la ingesta diaria recomendada de vitamina C. c�rcuma, con curcumina, que tiene propiedades antiinflamatorias" +
                                                  "\n y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes. yogur natural, que contiene probi�ticos" +
                                                  "\n beneficiosos para la flora intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio. Este es solo un       " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las " +
                                                  "\n respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico  " +
                                                  "\n para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana. " +
                                                  "\n En adultos mayores, la meningitis bacteriana puede ser grave y requiere atenci�n m�dica inmediata. HIDRATACI�N:   " +
                                                  "\n Es esencial que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente ocho a diez vasos de     " +
                                                  "\n tama�o regular) para mantener una adecuada funci�n cerebral y evitar la deshidrataci�n, que puede agravar los     " +
                                                  "\n s�ntomas neurol�gicos. La hidrataci�n es clave para mantener el equilibrio de electrolitos y mejorar la funci�n   " +
                                                  "\n cognitiva, reduciendo el riesgo de complicaciones neurol�gicas. EJERCICIO: La actividad f�sica debe ser m�nima y  " +
                                                  "\n adaptada, como ejercicios de respiraci�n y movilidad pasiva, evitando esfuerzos excesivos que puedan comprometer  " +
                                                  "\n la recuperaci�n. Movilizar el cuerpo de manera controlada ayuda a prevenir la rigidez muscular y mejora la circulaci�n," +
                                                  "\n lo que favorece la recuperaci�n. POSIBLE TRATAMIENTO: Para la meningitis bacteriana en adultos mayores, el tratamiento " +
                                                  "\n suele incluir antibi�ticos intravenosos como ceftriaxona o vancomicina, dependiendo del agente causal. Tambi�n se      " +
                                                  "\n recomienda el uso de corticosteroides para reducir la inflamaci�n cerebral y en algunos casos, soporte respiratorio.   " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el  " +
                                                  "\n sistema inmune y mejorar la recuperaci�n, tales como Frutas c�tricas (naranjas, limones, vitamina C, 50 mg por 100 g,  " +
                                                  "\n fortalece el sistema inmune y mejora la absorci�n de hierro), Espinacas (vitamina A y C, 937 �g de vitamina A y 89 mg  " +
                                                  "\n de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, " +
                                                  "\n ayuda a reducir la inflamaci�n y proteger las c�lulas), Yogur natural (probi�ticos, mejora la salud intestinal y fortalece" +
                                                  "\n el sistema inmune), Pescados grasos (salm�n, Omega-3, 2 g por 100 g, ayuda a reducir la inflamaci�n y mejorar la funci�n  " +
                                                  "\n celular). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga" +
                                                  "\n esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un Diagn�stico de Mi Vida para mayor " +
                                                  "\n seguridad en el tratamiento. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda" +
                                                  "\n consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n En adultos mayores, el c�ncer requiere un enfoque integral para mejorar la calidad de vida y el tratamiento. " +
                                                  "\n HIDRATACI�N: Es recomendable que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente ocho a diez vasos  " +
                                                  "\n de tama�o regular) para mantener una adecuada funci�n renal y evitar la deshidrataci�n, que puede afectar la tolerancia a    " +
                                                  "\n los tratamientos oncol�gicos. La hidrataci�n tambi�n ayuda a reducir la fatiga y mejorar la funci�n celular, lo que es crucial" +
                                                  "\n para la recuperaci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada, como caminatas de 30 minutos diarios,      " +
                                                  "\n ejercicios de bajo impacto como yoga o nataci�n, siempre bajo supervisi�n m�dica para evitar fatiga extrema. El ejercicio     " +
                                                  "\n mejora la circulaci�n, fortalece los m�sculos y ayuda a reducir los efectos secundarios del tratamiento, como la fatiga y     " +
                                                  "\n la p�rdida de masa muscular. POSIBLE TRATAMIENTO: Para el c�ncer en adultos mayores, el tratamiento suele incluir quimioterapia," +
                                                  "\n radioterapia o inmunoterapia, dependiendo del tipo y estadio del c�ncer. Tambi�n se recomienda un enfoque multidisciplinario    " +
                                                  "\n con apoyo nutricional y psicol�gico. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes, prote�nas y    " +
                                                  "\n nutrientes esenciales para fortalecer el sistema inmune y mejorar la recuperaci�n, tales como Frutas c�tricas (naranjas, limones," +
                                                  "\n vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora la absorci�n de hierro), Espinacas (vitamina A y C, 937 �g de  " +
                                                  "\n vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg" +
                                                  "\n por 100 g, ayuda a reducir la inflamaci�n y proteger las c�lulas), Yogur natural (probi�ticos, mejora la salud intestinal y      " +
                                                  "\n fortalece el sistema inmune), Pescados grasos (salm�n, Omega-3, 2 g por 100 g, ayuda a reducir la inflamaci�n y mejorar la funci�n" +
                                                  "\n celular). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta   " +
                                                  "\n enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad en " +
                                                  "\n el tratamiento. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico." +
                                                  "\n �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        
                        if(EstaturaMasculino.equals("1.65-1.80 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n En adultos mayores, la gripe puede ser m�s severa debido a la disminuci�n de la respuesta inmune con la edad.          " +
                                                  "\n HIDRATACI�N: Es recomendable que el paciente mantenga una hidrataci�n adecuada, consumiendo entre 2 y 2.5 litros       " +
                                                  "\n de agua al d�a (aproximadamente ocho a diez vasos de tama�o regular) para ayudar a mantener las mucosas hidratadas     " +
                                                  "\n y facilitar la expulsi�n de secreciones. La hidrataci�n tambi�n contribuye a la regulaci�n de la temperatura corporal  " +
                                                  "\n y al transporte eficiente de nutrientes esenciales para la recuperaci�n. EJERCICIO: La actividad f�sica debe ser suave " +
                                                  "\n y adaptada, como caminatas cortas de 20 a 30 minutos diarios, evitando esfuerzos excesivos y asegurando una buena      " +
                                                  "\n ventilaci�n en el entorno para reducir el riesgo de complicaciones respiratorias. El ejercicio moderado mejora la circulaci�n   " +
                                                  "\n sangu�nea, fortalece el sistema inmunol�gico y ayuda a reducir la fatiga causada por la enfermedad. POSIBLE TRATAMIENTO:        " +
                                                  "\n Para la gripe en adultos mayores, el tratamiento suele incluir antivirales como oseltamivir (Tamiflu) en casos graves o de      " +
                                                  "\n riesgo, adem�s de medicamentos para aliviar s�ntomas como paracetamol (Tempra) o ibuprofeno (Advil) para la fiebre y el malestar." +
                                                  "\n Tambi�n se recomienda el uso de jarabes expectorantes para facilitar la eliminaci�n de flemas. La vacunaci�n anual contra        " +
                                                  "\n la influenza es clave para la prevenci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en vitamina C y antioxidantes" +
                                                  "\n para fortalecer el sistema inmune, tales como Naranjas y mandarinas (vitamina C, 50 mg por 100 g, fortalece el sistema inmune    " +
                                                  "\n y reduce la duraci�n de los s�ntomas), Kiwi (vitamina C, 100 mg por 100 g, refuerza el sistema inmunol�gico y mejora la absorci�n" +
                                                  "\n de hierro), Fresas (antioxidantes y vitamina C, 58 mg por 100 g, protegen las c�lulas del da�o oxidativo y fortalecen el sistema " +
                                                  "\n inmune), Espinacas y br�coli (vitamina A y C, 937 �g de vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud     " +
                                                  "\n celular y la respuesta inmune), Miel (propiedades antimicrobianas y suavizantes para la garganta, ayuda a reducir la irritaci�n  " +
                                                  "\n y la tos), Caldos calientes (favorecen la hidrataci�n y alivian la congesti�n nasal). Este es solo un diagn�stico predeterminado " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se  " +
                                                  "\n recomienda realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad en el tratamiento. Adem�s, por su salud, si la respuesta" +
                                                  "\n del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida)" +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n En adultos mayores, la neumon�a puede ser grave debido a la disminuci�n de la respuesta inmune y la posible     " +
                                                  "\n presencia de enfermedades cr�nicas. HIDRATACI�N: Es fundamental que el paciente consuma entre 2 y 2.5 litros    " +
                                                  "\n de agua al d�a (aproximadamente ocho a diez vasos de tama�o regular) para mantener las v�as respiratorias       " +
                                                  "\n hidratadas y facilitar la expulsi�n de secreciones. La hidrataci�n tambi�n ayuda a reducir la inflamaci�n       " +
                                                  "\n pulmonar y mejora la oxigenaci�n de los tejidos, lo que es crucial para la recuperaci�n. EJERCICIO: La actividad  " +
                                                  "\n f�sica debe ser moderada y adaptada, como caminatas cortas de 15 a 20 minutos diarios, evitando esfuerzos         " +
                                                  "\n excesivos y asegurando una buena ventilaci�n en el entorno para reducir el riesgo de complicaciones respiratorias." +
                                                  "\n Movilizar el cuerpo de manera controlada ayuda a prevenir la rigidez muscular y mejora la circulaci�n, lo que     " +
                                                  "\n favorece la recuperaci�n. POSIBLE TRATAMIENTO: Para la neumon�a en adultos mayores, el tratamiento suele incluir  " +
                                                  "\n antibi�ticos como amoxicilina con �cido clavul�nico (Clavulin) o levofloxacino (Levaquin) en casos bacterianos,   " +
                                                  "\n adem�s de medicamentos para aliviar s�ntomas como paracetamol (Tempra) o ibuprofeno (Advil) para la fiebre y el   " +
                                                  "\n malestar. Tambi�n se recomienda el uso de broncodilatadores en casos de dificultad respiratoria y oxigenoterapia  " +
                                                  "\n en situaciones graves. La vacunaci�n contra neumococo e influenza es clave para la prevenci�n. ALIMENTACI�N: Se   " +
                                                  "\n recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y minerales esenciales para fortalecer el   " +
                                                  "\n sistema inmune y mejorar la recuperaci�n, tales como Naranjas y mandarinas (vitamina C, 50 mg por 100 g, fortalece  " +
                                                  "\n el sistema inmune y reduce la duraci�n de los s�ntomas), Kiwi (vitamina C, 100 mg por 100 g, refuerza el sistema    " +
                                                  "\n inmunol�gico y mejora la absorci�n de hierro), Fresas (antioxidantes y vitamina C, 58 mg por 100 g, protegen las    " +
                                                  "\n c�lulas del da�o oxidativo y fortalecen el sistema inmune), Espinacas y br�coli (vitamina A y C, 937 �g de vitamina A  " +
                                                  "\n y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E,        " +
                                                  "\n 25 mg por 100 g, ayuda a reducir la inflamaci�n y fortalecer el sistema inmunol�gico), Miel (propiedades antimicrobianas" +
                                                  "\n y suavizantes para la garganta, ayuda a reducir la irritaci�n y la tos), Caldos calientes (favorecen la hidrataci�n     " +
                                                  "\n y alivian la congesti�n nasal). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al   " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un    " +
                                                  "\n Diagn�stico de Mi Vida para mayor seguridad en el tratamiento. Adem�s, por su salud, si la respuesta del diagn�stico  " + 
                                                  "\n no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida)   " +
                                                  "\n y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n En adultos mayores, la diabetes puede generar complicaciones graves si no se controla adecuadamente.  " +
                                                  "\n HIDRATACI�N: Es fundamental que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente ocho      " +
                                                  "\n a diez vasos de tama�o regular) para mantener una adecuada funci�n renal y evitar la deshidrataci�n, que puede     " +
                                                  "\n afectar los niveles de glucosa en sangre. La hidrataci�n tambi�n ayuda a mejorar la circulaci�n y la funci�n       " +
                                                  "\n metab�lica, lo que es clave para el control de la enfermedad. EJERCICIO: La actividad f�sica debe ser moderada     " +
                                                  "\n y adaptada, como caminatas de 30 minutos diarios, ejercicios de bajo impacto como nataci�n o yoga, siempre bajo    " +
                                                  "\n supervisi�n m�dica para evitar hipoglucemias. El ejercicio mejora la sensibilidad a la insulina, ayuda a controlar " +
                                                  "\n los niveles de glucosa y fortalece el sistema cardiovascular. POSIBLE TRATAMIENTO: Para la diabetes en adultos     " +
                                                  "\n mayores, el tratamiento suele incluir medicamentos como metformina (Glucophage) para mejorar la sensibilidad a la  " +
                                                  "\n insulina, insulina en casos necesarios, y medicamentos como glibenclamida o sitagliptina para el control de la     " +
                                                  "\n glucosa. Es clave mantener un monitoreo constante de los niveles de az�car en sangre y seguir una dieta equilibrada." +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en fibra, antioxidantes y nutrientes esenciales para el     " +
                                                  "\n control de la glucosa, tales como Avena (fibra soluble, 4 g por 100 g, ayuda a estabilizar los niveles de glucosa),   " + 
                                                  "\n Frijoles (fibra y prote�nas, 6 g de fibra por 100 g, contribuyen a la regulaci�n del az�car en sangre), Espinacas     " +
                                                  "\n (magnesio, 79 mg por 100 g, mejora la sensibilidad a la insulina), Naranjas (vitamina C, 50 mg por 100 g, fortalece   " +
                                                  "\n el sistema inmune y mejora la absorci�n de hierro), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la        " +
                                                  "\n inflamaci�n y proteger las c�lulas), Canela (compuestos bioactivos, ayuda a mejorar la sensibilidad a la insulina).   " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga      " +
                                                  "\n esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un Diagn�stico de Mi Vida para   " +
                                                  "\n mayor seguridad en el tratamiento. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo,    " +
                                                  "\n se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n En adultos mayores, el asma puede generar mayor dificultad respiratoria y riesgo de exacerbaciones, por lo que es     " +
                                                  "\n fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que el paciente mantenga una   " +
                                                  "\n hidrataci�n adecuada, consumiendo al menos 2.5 litros de agua al d�a (aproximadamente diez vasos de tama�o regular)   " +
                                                  "\n para favorecer la eliminaci�n de toxinas y mantener las v�as respiratorias hidratadas, lo que ayuda a reducir la      " +
                                                  "\n viscosidad del moco y facilita la respiraci�n. EJERCICIO: En cuanto a la actividad f�sica, es recomendable realizar   " +
                                                  "\n ejercicios de bajo impacto, como caminatas de 30 minutos diarios, nataci�n o yoga, siempre bajo supervisi�n m�dica    " +
                                                  "\n para evitar complicaciones y fortalecer la funci�n pulmonar. Tambi�n es importante realizar ejercicios de respiraci�n " +
                                                  "\n profunda para mejorar la capacidad pulmonar y reducir la sensaci�n de falta de aire. POSIBLE TRATAMIENTO: El tratamiento" +
                                                  "\n est�ndar para el asma incluye broncodilatadores de alivio r�pido, como el salbutamol (Ventolin), corticosteroides          " +
                                                  "\n inhalados para el control a largo plazo, como la fluticasona (Flixotide), y en algunos casos, modificadores de leucotrienos" +
                                                  "\n como el montelukast (Singulair). Es fundamental seguir estrictamente el plan de acci�n para el asma indicado por el m�dico " +
                                                  "\n y usar los medicamentos preventivos regularmente. ALIMENTACI�N RECOMENDADA: Se recomienda el consumo de alimentos que      " +
                                                  "\n fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como: Pescados grasos (salm�n, at�n): Ricos   " +
                                                  "\n en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias y pueden ayudar a reducir la inflamaci�n de las v�as    " +
                                                  "\n respiratorias, aportando aproximadamente el 50% del requerimiento diario por cada 100 gramos de salm�n. Frutas y verduras  " +
                                                  "\n de colores vivos (ar�ndanos, fresas, espinacas, br�coli): Ricas en antioxidantes como la vitamina C y carotenoides, que    " +
                                                  "\n pueden proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico, aportando cerca del 89% del requerimiento       " +
                                                  "\n diario por cada 100 gramos de fresas. Jengibre: Contiene compuestos con efectos antiinflamatorios que podr�an ser          " +
                                                  "\n beneficiosos para las v�as respiratorias, ayudando a reducir la inflamaci�n y mejorar la circulaci�n sangu�nea. C�rcuma:   " +
                                                  "\n Con su componente activo, la curcumina, tambi�n tiene potentes propiedades antiinflamatorias y antioxidantes, contribuyendo" +
                                                  "\n a la reducci�n de la inflamaci�n en los pulmones. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor    " +
                                                  "\n seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado.  " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n En adultos mayores, el VIH/SIDA puede generar mayor vulnerabilidad a infecciones oportunistas y complicaciones       " +
                                                  "\n sist�micas, por lo que es fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda     " +
                                                  "\n que el paciente mantenga una hidrataci�n adecuada, consumiendo al menos 2.5 litros de agua al d�a (aproximadamente   " +
                                                  "\n diez vasos de tama�o regular) para favorecer la eliminaci�n de toxinas y mantener el sistema inmunol�gico fuerte,    " +
                                                  "\n lo que ayuda a reducir la fatiga y mejorar la funci�n renal. EJERCICIO: En cuanto a la actividad f�sica, es recomendable " + 
                                                  "\n realizar ejercicios de bajo impacto, como caminatas de 30 minutos diarios, nataci�n o yoga, siempre bajo supervisi�n     " +
                                                  "\n m�dica para evitar complicaciones y fortalecer la funci�n cardiovascular y muscular. Tambi�n se recomienda ejercicios    " +
                                                  "\n de resistencia para mejorar la masa muscular, ya que el VIH puede causar p�rdida de peso y debilitamiento muscular.      " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento est�ndar para el VIH/SIDA incluye terapia antirretroviral combinada (TAR), con       " +
                                                  "\n medicamentos como tenofovir, emtricitabina y dolutegravir, que ayudan a reducir la carga viral y mejorar la funci�n      " +
                                                  "\n inmunol�gica. Es fundamental seguir estrictamente el tratamiento indicado por el m�dico y realizar controles peri�dicos  " +
                                                  "\n para evaluar la respuesta al tratamiento. ALIMENTACI�N RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan  " +
                                                  "\n el sistema inmunol�gico y ayuden a combatir infecciones, tales como: Frutas c�tricas (naranjas, limones, toronjas): Ricas  " +
                                                  "\n en vitamina C, que fortalece el sistema inmunol�gico y ayuda a reducir la duraci�n de infecciones, aportando aproximadamente " +
                                                  "\n el 89% del requerimiento diario por cada 100 gramos. Yogur natural: Contiene probi�ticos, que pueden ayudar a mantener el    " +
                                                  "\n equilibrio de la flora bacteriana y mejorar la respuesta inmunol�gica, proporcionando cerca del 20% del requerimiento diario " +
                                                  "\n de calcio por cada porci�n de 150 gramos. Verduras de hoja verde (espinaca, acelga, br�coli): Ricas en antioxidantes y       " +
                                                  "\n vitaminas esenciales para la recuperaci�n, como la vitamina A, que contribuye a la regeneraci�n celular y aporta cerca del   " +
                                                  "\n 56% del requerimiento diario por cada 100 gramos de espinaca. Omega-3 (salm�n, at�n, ch�a): Con propiedades antiinflamatorias" +
                                                  "\n que pueden ayudar a reducir la inflamaci�n y mejorar la respuesta inmunol�gica, aportando aproximadamente el 50% del         " +
                                                  "\n requerimiento diario por cada 100 gramos de salm�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor       " +
                                                  "\n seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado.     " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n En adultos mayores, la gonorrea puede presentar s�ntomas m�s leves o at�picos, por lo que es fundamental un          " +
                                                  "\n diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que el paciente mantenga una hidrataci�n     " +
                                                  "\n adecuada, consumiendo al menos 2 litros de agua al d�a (aproximadamente ocho vasos de tama�o regular) para favorecer " +
                                                  "\n la eliminaci�n de toxinas y mantener el sistema inmunol�gico fuerte, lo que ayuda a reducir la inflamaci�n y mejorar " +
                                                  "\n la funci�n renal. EJERCICIO: En cuanto a la actividad f�sica, es recomendable realizar ejercicio moderado, como      " +
                                                  "\n caminatas de 30 a 45 minutos diarios, siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer la        " +
                                                  "\n circulaci�n sangu�nea. Tambi�n se recomienda ejercicios de movilidad para mejorar la funci�n articular y reducir        " +
                                                  "\n la fatiga. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la gonorrea incluye antibi�ticos como la azitromicina      " +
                                                  "\n y ceftriaxona, los cuales deben ser administrados bajo prescripci�n m�dica. En casos m�s graves, puede requerirse       " +
                                                  "\n hospitalizaci�n para recibir antibi�ticos intravenosos. Es fundamental que el paciente evite el contacto �ntimo hasta   " +
                                                  "\n completar el tratamiento y que su pareja tambi�n reciba tratamiento para evitar reinfecciones. ALIMENTACI�N RECOMENDADA:" +
                                                  "\n Se recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a combatir la infecci�n, tales   " +
                                                  "\n como: Ajo: Posee propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene alicina, un  " +
                                                  "\n compuesto con efectos antibacterianos. Frutas c�tricas (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece   " +
                                                  "\n el sistema inmunol�gico y ayuda a reducir la duraci�n de infecciones, aportando aproximadamente el 89% del requerimiento   " +
                                                  "\n diario por cada 100 gramos. Yogur natural: Contiene probi�ticos, que pueden ayudar a mantener el equilibrio de la flora    " +
                                                  "\n bacteriana y mejorar la respuesta inmunol�gica, proporcionando cerca del 20% del requerimiento diario de calcio por cada   " +
                                                  "\n porci�n de 150 gramos. Verduras de hoja verde (espinaca, acelga, br�coli): Ricas en antioxidantes y vitaminas esenciales   " +
                                                  "\n para la recuperaci�n, como la vitamina A, que contribuye a la regeneraci�n celular y aporta cerca del 56% del requerimiento" +
                                                  "\n diario por cada 100 gramos de espinaca. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad,    " +
                                                  "\n se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraerHerpes genital." +
                                                  "\n En adultos mayores, el herpes genital puede causar s�ntomas m�s prolongados y complicaciones debido a la disminuci�n      " +
                                                  "\n de la respuesta inmunol�gica. EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas suaves y ejercicios      " +
                                                  "\n de movilidad para mejorar la circulaci�n y reducir la fatiga. Tambi�n es recomendable realizar ejercicios de relajaci�n   " +
                                                  "\n y respiraci�n para reducir el estr�s, ya que este puede desencadenar brotes de herpes. HIDRATACI�N: Es esencial el consumo" +
                                                  "\n diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tama�o regular) para mantener el cuerpo hidratado y ayudar " +
                                                  "\n a reducir la inflamaci�n. Adem�s del agua pura, se recomienda el consumo de infusiones de hierbas, como t� de manzanilla     " +
                                                  "\n o jengibre, que pueden ayudar a reducir la inflamaci�n y mejorar la respuesta inmunol�gica. Tambi�n es beneficioso ingerir   " +
                                                  "\n jugos naturales sin az�car, que aportan antioxidantes y vitaminas esenciales. POSIBLE TRATAMIENTO: El herpes genital se trata" +
                                                  "\n con antivirales, como aciclovir, valaciclovir o famciclovir, que ayudan a reducir la duraci�n y gravedad de los brotes.      " +
                                                  "\n Tambi�n se recomienda el uso de cremas t�picas para aliviar el dolor y la irritaci�n. ALIMENTACI�N: Se recomienda el consumo " +
                                                  "\n de alimentos que ayuden a fortalecer el sistema inmunol�gico y reducir la inflamaci�n, tales como ar�ndanos, ricos en        " +
                                                  "\n antioxidantes y vitamina C, aportando 25% de la ingesta diaria recomendada. espinacas, que contienen hierro y vitamina A,    " +
                                                  "\n esenciales para la recuperaci�n, proporcionando 15% de la ingesta diaria recomendada de hierro. jengibre, con propiedades    " +
                                                  "\n antiinflamatorias y antioxidantes, aportando 5% de la ingesta diaria recomendada de vitamina C. c�rcuma, con curcumina, que  " +
                                                  "\n tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes.    " +
                                                  "\n yogur natural, que contiene probi�ticos beneficiosos para la flora intestinal, proporcionando 15% de la ingesta diaria       " +
                                                  "\n recomendada de calcio. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico " +
                                                  "\n y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que" +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n En adultos mayores, la s�filis puede progresar a etapas avanzadas si no se trata adecuadamente, afectando    " +
                                                  "\n �rganos internos y el sistema nervioso. EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas   " +
                                                  "\n suaves y ejercicios de movilidad para mejorar la circulaci�n y reducir la fatiga. Tambi�n es recomendable    " +
                                                  "\n realizar ejercicios de respiraci�n y relajaci�n para mejorar la oxigenaci�n y reducir el estr�s.             " +
                                                  "\n HIDRATACI�N: Es fundamental el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tama�o " +
                                                  "\n regular) para mantener el cuerpo hidratado y ayudar a reducir la inflamaci�n. Adem�s del agua pura, se       " +
                                                  "\n recomienda el consumo de jugos naturales ricos en vitamina C, como jugo de naranja o toronja, que pueden     " +
                                                  "\n fortalecer el sistema inmunol�gico. Tambi�n es beneficioso ingerir caldos ligeros, que aportan l�quidos y    " +
                                                  "\n minerales esenciales para la recuperaci�n. POSIBLE TRATAMIENTO: La s�filis se trata con antibi�ticos, como   " +
                                                  "\n penicilina G benzatina, que es el tratamiento de primera elecci�n. En casos de alergia a la penicilina, se   " +
                                                  "\n pueden utilizar doxiciclina o ceftriaxona. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a  " +
                                                  "\n fortalecer el sistema inmunol�gico y reducir la inflamaci�n, tales como ajo, que contiene alicina con propiedades" +
                                                  "\n antimicrobianas, aportando 5% de la ingesta diaria recomendada de antioxidantes. jengibre, con efectos           " +
                                                  "\n antiinflamatorios y antioxidantes, aportando 5% de la ingesta diaria recomendada de vitamina C. c�rcuma, con     " +
                                                  "\n curcumina, que tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria       " +
                                                  "\n recomendada de antioxidantes. frutas c�tricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalece  " +
                                                  "\n el sistema inmunol�gico, aportando 90 mg por cada 100 g de fruta, lo que representa 100% de la ingesta diaria    " +
                                                  "\n recomendada. yogur natural, que contiene probi�ticos beneficiosos para la flora intestinal, proporcionando 15%   " +
                                                  "\n de la ingesta diaria recomendada de calcio. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas.   " +
                                                  "\n Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento   " +
                                                  "\n adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n En adultos mayores, la tuberculosis puede ser grave debido a la disminuci�n de la funci�n pulmonar y la     " +
                                                  "\n posibilidad de complicaciones respiratorias. EJERCICIO: Se recomienda actividad f�sica moderada, como       " +
                                                  "\n caminatas suaves y ejercicios de respiraci�n para mejorar la capacidad pulmonar. Tambi�n es recomendable    " +
                                                  "\n realizar ejercicios de movilidad y estiramientos para mejorar la circulaci�n y reducir la fatiga. Debido    " +
                                                  "\n a que la tuberculosis afecta la funci�n pulmonar, es importante realizar ejercicios de respiraci�n profunda," +
                                                  "\n como la t�cnica de respiraci�n diafragm�tica, que ayuda a mejorar la oxigenaci�n y reducir la sensaci�n de  " +
                                                  "\n falta de aire. Tambi�n se recomienda la respiraci�n con labios fruncidos, que permite controlar la exhalaci�n    " +
                                                  "\n y mejorar la eficiencia respiratoria. HIDRATACI�N: Es esencial el consumo diario de 2.5 a 3 litros de agua       " +
                                                  "\n (diez a doce vasos de agua de tama�o regular) para mantener el cuerpo hidratado y ayudar a reducir la inflamaci�n" +
                                                  "\n de las v�as respiratorias. Adem�s del agua pura, se recomienda el consumo de infusiones de hierbas, como t�      " +
                                                  "\n de jengibre o manzanilla, que pueden ayudar a reducir la inflamaci�n y mejorar la respiraci�n. Tambi�n es        " +
                                                  "\n beneficioso ingerir jugos naturales sin az�car, que aportan antioxidantes y vitaminas esenciales para la funci�n " +
                                                  "\n pulmonar. POSIBLE TRATAMIENTO: La tuberculosis se trata con antibi�ticos espec�ficos, como isoniazida, rifampicina,  " +
                                                  "\n pirazinamida y etambutol, administrados en un r�gimen prolongado de varios meses. En casos graves, se puede requerir " +
                                                  "\n hospitalizaci�n y ox�geno suplementario. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer " +
                                                  "\n el sistema respiratorio y reducir la inflamaci�n, tales como pescados grasos (salm�n, at�n), ricos en �cidos grasos  " +
                                                  "\n Omega-3, que poseen propiedades antiinflamatorias, aportando 50% de la ingesta diaria recomendada de Omega-3. frutas " +
                                                  "\n y verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli), ricas en antioxidantes como la vitamina C y     " +
                                                  "\n carotenoides, que pueden proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico, aportando 70% de la     " +
                                                  "\n ingesta diaria recomendada de vitamina C. jengibre, que contiene compuestos con efectos antiinflamatorios que podr�an" +
                                                  "\n ser beneficiosos para las v�as respiratorias, aportando 5% de la ingesta diaria recomendada de vitamina C. c�rcuma,  " +
                                                  "\n con su componente activo, la curcumina, que tiene potentes propiedades antiinflamatorias y antioxidantes, proporcionando" +
                                                  "\n 3% de la ingesta diaria recomendada de antioxidantes. Este es solo un diagn�stico predeterminado l�gico, haberlo " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente   " +
                                                  "\n correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el    " +
                                                  "\n tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n En adultos mayores, la artritis puede causar dolor cr�nico y afectar la movilidad, lo que impacta la calidad de vida.    " +
                                                  "\n HIDRATACI�N: Es fundamental que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente ocho a diez     " +
                                                  "\n vasos de tama�o regular) para mantener la lubricaci�n de las articulaciones y reducir la inflamaci�n. La hidrataci�n     " +
                                                  "\n tambi�n ayuda a eliminar toxinas y mejorar la circulaci�n, lo que favorece la regeneraci�n de los tejidos articulares.   " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser moderada y adaptada, como ejercicios de bajo impacto como nataci�n, yoga o       " +
                                                  "\n caminatas de 30 minutos diarios. El ejercicio fortalece los m�sculos que rodean las articulaciones, mejora la flexibilidad" +
                                                  "\n y reduce la rigidez matutina. POSIBLE TRATAMIENTO: Para la artritis en adultos mayores, el tratamiento suele incluir      " +
                                                  "\n antiinflamatorios como ibuprofeno (Advil) o naproxeno, medicamentos modificadores de la enfermedad como metotrexato,      " +
                                                  "\n y en algunos casos, terapias biol�gicas. Tambi�n se recomienda fisioterapia para mejorar la movilidad y reducir el dolor. " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes, �cidos grasos esenciales y minerales para     " +
                                                  "\n fortalecer las articulaciones y reducir la inflamaci�n, tales como Pescados grasos (salm�n, Omega-3, 2 g por 100 g, ayuda   " +
                                                  "\n a reducir la inflamaci�n articular), Frutas y verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli, vitamina C, " +
                                                  "\n 89 mg por 100 g, fortalece el sistema inmune y protege las c�lulas del da�o oxidativo), Jengibre (compuestos antiinflamatorios," +
                                                  "\n ayuda a reducir el dolor articular), C�rcuma (curcumina, 3% de concentraci�n, potente antioxidante y antiinflamatorio),      " +
                                                  "\n Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamaci�n y proteger las c�lulas). Este es solo un diagn�stico  " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento   " +
                                                  "\n sea el adecuado. Se recomienda realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad en el tratamiento. Adem�s,     " +
                                                  "\n por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n En adultos mayores, la tosferina puede ser grave y causar complicaciones respiratorias si no se trata adecuadamente.  " +
                                                  "\n HIDRATACI�N: Es esencial que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente ocho a diez     " +
                                                  "\n vasos de tama�o regular) para mantener las v�as respiratorias hidratadas y reducir la viscosidad de las secreciones.  " +
                                                  "\n La hidrataci�n tambi�n ayuda a calmar la irritaci�n de la garganta y mejorar la funci�n pulmonar. EJERCICIO:          " +
                                                  "\n La actividad f�sica debe ser m�nima y adaptada, como ejercicios de respiraci�n y movilidad pasiva, evitando esfuerzos " +
                                                  "\n excesivos que puedan comprometer la recuperaci�n. Movilizar el cuerpo de manera controlada ayuda a prevenir la rigidez" +
                                                  "\n muscular y mejora la circulaci�n, lo que favorece la recuperaci�n. POSIBLE TRATAMIENTO: Para la tosferina en adultos  " +
                                                  "\n mayores, el tratamiento suele incluir antibi�ticos como azitromicina o eritromicina para eliminar la bacteria, adem�s " +
                                                  "\n de medicamentos para aliviar la tos y reducir la inflamaci�n de las v�as respiratorias. Tambi�n se recomienda el uso  " +   
                                                  "\n de humidificadores para mejorar la respiraci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes  " +
                                                  "\n y nutrientes esenciales para fortalecer el sistema inmune y mejorar la recuperaci�n, tales como Frutas c�tricas (naranjas,  " +
                                                  "\n limones, vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora la absorci�n de hierro), Espinacas (vitamina     " +
                                                  "\n A y C, 937 �g de vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune),       " +
                                                  "\n antimicrobianas y suavizantes para la garganta, ayuda a reducir la irritaci�n y la tos), Caldos calientes (favorecen la     " +
                                                  "\n hidrataci�n y alivian la congesti�n nasal). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no        " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar m�s   " +
                                                  "\n de un Diagn�stico de Mi Vida para mayor seguridad en el tratamiento. Adem�s, por su salud, si la respuesta del diagn�stico  " +
                                                  "\n no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera" +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n En adultos mayores, las paperas pueden causar inflamaci�n severa de las gl�ndulas salivales y generar complicaciones   " +
                                                  "\n si no se manejan adecuadamente. HIDRATACI�N: Es recomendable que el paciente consuma entre 2 y 2.5 litros de agua al   " +
                                                  "\n d�a (aproximadamente ocho a diez vasos de tama�o regular) para mantener una adecuada funci�n renal y evitar la         " +
                                                  "\n deshidrataci�n, que puede afectar la recuperaci�n. La hidrataci�n tambi�n ayuda a reducir la inflamaci�n de las        " +
                                                  "\n gl�ndulas y mejorar la producci�n de saliva. EJERCICIO: La actividad f�sica debe ser moderada y adaptada, como caminatas " +
                                                  "\n de 30 minutos diarios, ejercicios de bajo impacto como yoga o nataci�n, siempre bajo supervisi�n m�dica para evitar      " +
                                                  "\n fatiga extrema. El ejercicio mejora la circulaci�n, fortalece los m�sculos y ayuda a reducir los efectos secundarios     " +
                                                  "\n de la inflamaci�n. POSIBLE TRATAMIENTO: Para las paperas en adultos mayores, el tratamiento suele incluir analg�sicos    " +
                                                  "\n como paracetamol o ibuprofeno para reducir el dolor y la fiebre, adem�s de reposo y aislamiento para evitar la propagaci�n " +
                                                  "\n del virus. Tambi�n se recomienda la aplicaci�n de compresas fr�as en la zona inflamada. ALIMENTACI�N: Se recomienda el     " +
                                                  "\n consumo de alimentos ricos en antioxidantes, prote�nas y nutrientes esenciales para fortalecer el sistema inmune y mejorar " +
                                                  "\n la recuperaci�n, tales como Frutas c�tricas (naranjas, limones, vitamina C, 50 mg por 100 g, fortalece el sistema inmune y " +
                                                  "\n mejora la absorci�n de hierro), Espinacas (vitamina A y C, 937 �g de vitamina A y 89 mg de vitamina C por 100 g, esenciales" +
                                                  "\n para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamaci�n y     " +
                                                  "\n proteger las c�lulas), Yogur natural (probi�ticos, mejora la salud intestinal y fortalece el sistema inmune), Pescados     " +
                                                  "\n grasos (salm�n, Omega-3, 2 g por 100 g, ayuda a reducir la inflamaci�n y mejorar la funci�n celular). Este es solo un      " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que    " +
                                                  "\n el tratamiento sea el adecuado. Se recomienda realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad en el tratamiento." +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.  " +
                                                  "\n �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n En adultos mayores, el virus del Zika puede causar s�ntomas m�s intensos y prolongados, aumentando el riesgo de    " +
                                                  "\n complicaciones neurol�gicas, por lo que es fundamental un diagn�stico oportuno y tratamiento adecuado.             " +
                                                  "\n HIDRATACI�N: Se recomienda que el paciente mantenga una hidrataci�n adecuada, consumiendo al menos 2.5 litros de   " +
                                                  "\n agua al d�a (aproximadamente diez vasos de tama�o regular) para favorecer la eliminaci�n de toxinas y mantener el  " +
                                                  "\n sistema inmunol�gico fuerte, lo que ayuda a reducir la fatiga y mejorar la funci�n renal. EJERCICIO: En cuanto a   " +
                                                  "\n la actividad f�sica, es recomendable realizar ejercicios de bajo impacto, como caminatas de 30 minutos diarios,    " +
                                                  "\n nataci�n o yoga, siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer la funci�n cardiovascular." +
                                                  "\n Tambi�n se recomienda ejercicios de movilidad para mejorar la circulaci�n sangu�nea y reducir la inflamaci�n.          " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento antiviral espec�fico para el Zika, por lo que el manejo es sintom�tico.  " +
                                                  "\n Se recomienda el uso de analg�sicos como paracetamol para aliviar la fiebre y el malestar, antihistam�nicos para       " +
                                                  "\n reducir el prurito y reposo adecuado. Es fundamental evitar el uso de aspirina y otros antiinflamatorios no esteroides " +
                                                  "\n sin supervisi�n m�dica. ALIMENTACI�N RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema     " +
                                                  "\n inmunol�gico y ayuden a combatir la infecci�n, tales como: Frutas c�tricas (naranjas, limones, toronjas): Ricas en     " +
                                                  "\n vitamina C, que fortalece el sistema inmunol�gico y ayuda a reducir la duraci�n de infecciones, aportando aproximadamente " +
                                                  "\n el 89% del requerimiento diario por cada 100 gramos. Jengibre: Contiene compuestos con efectos antiinflamatorios que      " +
                                                  "\n pueden ayudar a reducir la fiebre y el malestar general. Verduras de hoja verde (espinaca, acelga, br�coli): Ricas en     " +
                                                  "\n antioxidantes y vitaminas esenciales para la recuperaci�n, como la vitamina A, que contribuye a la regeneraci�n celular   " +
                                                  "\n y aporta cerca del 56% del requerimiento diario por cada 100 gramos de espinaca. Omega-3 (salm�n, at�n, ch�a): Con        " +
                                                  "\n propiedades antiinflamatorias que pueden ayudar a reducir la inflamaci�n y mejorar la respuesta inmunol�gica, aportando   " +
                                                  "\n aproximadamente el 50% del requerimiento diario por cada 100 gramos de salm�n. Este es solo un diagn�stico predeterminado " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean          " +
                                                  "\n completamente correctas. Para mayor seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para  " +
                                                  "\n establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n En adultos mayores, el rotavirus puede causar deshidrataci�n severa y complicaciones gastrointestinales,      " +
                                                  "\n por lo que es fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que      " +
                                                  "\n el paciente mantenga una hidrataci�n adecuada, consumiendo al menos 3 litros de agua al d�a (aproximadamente  " +
                                                  "\n doce vasos de tama�o regular) para compensar la p�rdida de l�quidos y evitar la deshidrataci�n.               " +
                                                  "\n EJERCICIO: En cuanto a la actividad f�sica, es recomendable realizar ejercicios de bajo impacto, como caminatas    " +
                                                  "\n suaves de 20 minutos diarios, siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer la funci�n   " +
                                                  "\n digestiva. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral espec�fico para el rotavirus, por lo que el     " +
                                                  "\n manejo es sintom�tico. Se recomienda el uso de soluciones de rehidrataci�n oral para evitar la deshidrataci�n,     " +
                                                  "\n as� como una dieta blanda y de f�cil digesti�n. En casos graves, puede requerirse hospitalizaci�n para administraci�n        " +
                                                  "\n de l�quidos intravenosos. ALIMENTACI�N RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema         " +
                                                  "\n digestivo y ayuden a combatir la infecci�n, tales como: Pl�tano: Rico en potasio, que ayuda a reemplazar los electrolitos    " +
                                                  "\n perdidos debido a la diarrea, aportando aproximadamente el 12% del requerimiento diario por cada 100 gramos.                 " +
                                                  "\n Yogur natural: Contiene probi�ticos, que pueden ayudar a restaurar la flora intestinal y mejorar la digesti�n, proporcionando" +
                                                  "\n cerca del 20% del requerimiento diario de calcio por cada porci�n de 150 gramos. Arroz blanco: Fuente de carbohidratos de    " +
                                                  "\n f�cil digesti�n que ayuda a estabilizar el sistema digestivo y aporta energ�a sin irritar el est�mago. Zanahoria: Rica en    " +
                                                  "\n vitamina A, que contribuye a la regeneraci�n celular y fortalece la mucosa intestinal, aportando cerca del 56% del           " +
                                                  "\n requerimiento diario por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no           " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor       " +
                                                  "\n seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado.     " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n En adultos mayores, la listeriosis puede causar infecciones graves y afectar el sistema nervioso, por lo que  " +
                                                  "\n es fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que el paciente     " +
                                                  "\n mantenga una hidrataci�n adecuada, consumiendo al menos 2.5 litros de agua al d�a (aproximadamente diez vasos    " +
                                                  "\n de tama�o regular) para favorecer la eliminaci�n de toxinas y mantener el sistema inmunol�gico fuerte.           " +
                                                  "\n EJERCICIO: En cuanto a la actividad f�sica, es recomendable realizar ejercicios de bajo impacto, como caminatas  " +
                                                  "\n de 30 minutos diarios, nataci�n o yoga, siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer  " +
                                                  "\n la funci�n inmunol�gica. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la listeriosis incluye antibi�ticos   " +
                                                  "\n como ampicilina y gentamicina, administrados bajo prescripci�n m�dica. En casos graves, puede requerirse         " +
                                                  "\n hospitalizaci�n para administraci�n de antibi�ticos intravenosos. ALIMENTACI�N RECOMENDADA: Se recomienda el     " +
                                                  "\n consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a combatir la infecci�n, tales como: Ajo:  " +
                                                  "\n Posee propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene alicina, un      " +
                                                  "\n compuesto con efectos antibacterianos. Frutas c�tricas (naranjas, limones, toronjas): Ricas en vitamina C, que   " +
                                                  "\n fortalece el sistema inmunol�gico y ayuda a reducir la duraci�n de infecciones, aportando aproximadamente el 89% " +
                                                  "\n del requerimiento diario por cada 100 gramos. Yogur natural: Contiene probi�ticos, que pueden ayudar a mantener  " +
                                                  "\n el equilibrio de la flora bacteriana y mejorar la respuesta inmunol�gica, proporcionando cerca del 20% del       " +
                                                  "\n requerimiento diario de calcio por cada porci�n de 150 gramos. Verduras de hoja verde (espinaca, acelga, br�coli):  " +
                                                  "\n Ricas en antioxidantes y vitaminas esenciales para la recuperaci�n, como la vitamina A, que contribuye a la         " +
                                                  "\n regeneraci�n celular y aporta cerca del 56% del requerimiento diario por cada 100 gramos de espinaca. Este es solo  " +
                                                  "\n un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad " +
                                                  "\n ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar m�s de un diagn�stico" +
                                                  "\n y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n En adultos mayores, la shigelosis puede causar diarrea severa y deshidrataci�n, lo que puede ser peligroso si  " +
                                                  "\n no se trata adecuadamente. EJERCICIO: Se recomienda actividad f�sica ligera, como caminatas cortas, evitando   " +
                                                  "\n esfuerzos excesivos que puedan agravar la deshidrataci�n. Tambi�n es recomendable realizar ejercicios de       " +
                                                  "\n movilidad y estiramientos para mejorar la circulaci�n y reducir la fatiga. Debido a que la shigelosis causa    " +
                                                  "\n diarrea y p�rdida de l�quidos, es importante evitar ejercicios que generen sudoraci�n excesiva y optar por     " +
                                                  "\n movimientos suaves que ayuden a mantener la actividad sin comprometer la hidrataci�n. HIDRATACI�N: Es crucial  " +
                                                  "\n el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de agua de tama�o regular) para compensar la    " +
                                                  "\n p�rdida de l�quidos y evitar la deshidrataci�n. Adem�s del agua pura, se recomienda el consumo de soluciones de    " +
                                                  "\n rehidrataci�n oral para reponer electrolitos esenciales como sodio y potasio. Tambi�n es beneficioso ingerir agua  " +
                                                  "\n de coco, que contiene electrolitos naturales, y caldos ligeros, que aportan l�quidos y minerales esenciales para   " +
                                                  "\n la recuperaci�n. POSIBLE TRATAMIENTO: La shigelosis se trata con antibi�ticos, como azitromicina, ciprofloxacino   " +
                                                  "\n o ceftriaxona, dependiendo de la gravedad del caso. Tambi�n se recomienda rehidrataci�n oral y una dieta adecuada.    " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a reponer l�quidos y fortalecer el sistema digestivo,  " +
                                                  "\n tales como pl�tanos, ricos en potasio, que ayudan a reemplazar los electrolitos perdidos, aportando 10% de la ingesta " +
                                                  "\n diaria recomendada de potasio. arroz blanco, que es f�cil de digerir y ayuda a estabilizar el sistema digestivo,      " +
                                                  "\n proporcionando 20% de la ingesta diaria recomendada de carbohidratos. zanahorias, ricas en vitamina A, que ayudan     " +
                                                  "\n a la recuperaci�n del sistema digestivo, aportando 50% de la ingesta diaria recomendada de vitamina A. agua de coco,  " +
                                                  "\n que ayuda a la hidrataci�n y aporta electrolitos esenciales. yogur natural, que contiene probi�ticos beneficiosos para" +
                                                  "\n la flora intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio. Este es solo un diagn�stico    " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las    " +
                                                  "\n respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un  " +
                                                  "\n m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n En adultos mayores, la EPOC puede causar dificultad para respirar y fatiga, afectando la calidad de vida.           " +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas suaves y ejercicios de respiraci�n para mejorar  " +
                                                  "\n la capacidad pulmonar. Tambi�n es recomendable realizar ejercicios de movilidad y estiramientos para mejorar la     " +
                                                  "\n circulaci�n y reducir la fatiga. Debido a que la EPOC afecta la funci�n pulmonar, es importante realizar ejercicios " +
                                                  "\n de respiraci�n profunda, como la t�cnica de respiraci�n diafragm�tica, que ayuda a mejorar la oxigenaci�n y reducir " +
                                                  "\n la sensaci�n de falta de aire. Tambi�n se recomienda la respiraci�n con labios fruncidos, que permite controlar la  " +
                                                  "\n exhalaci�n y mejorar la eficiencia respiratoria. HIDRATACI�N: Es esencial el consumo diario de 2.5 a 2.75 litros de    " +
                                                  "\n agua (ocho a diez vasos de agua de tama�o regular) para mantener el cuerpo hidratado y ayudar a reducir la inflamaci�n " +
                                                  "\n de las v�as respiratorias. Adem�s del agua pura, se recomienda el consumo de infusiones de hierbas, como t� de jengibre" +
                                                  "\n o manzanilla, que pueden ayudar a reducir la inflamaci�n y mejorar la respiraci�n. Tambi�n es beneficioso ingerir jugos" +
                                                  "\n naturales sin az�car, que aportan antioxidantes y vitaminas esenciales para la funci�n pulmonar. POSIBLE TRATAMIENTO:  " +
                                                  "\n La EPOC se trata con broncodilatadores, como salbutamol, tiotropio o formoterol, adem�s de corticosteroides inhalados, " +
                                                  "\n como fluticasona o budesonida. En casos graves, se puede requerir ox�geno suplementario y rehabilitaci�n pulmonar.     " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema respiratorio y reducir la       " +
                                                  "\n inflamaci�n, tales como pescados grasos (salm�n, at�n), ricos en �cidos grasos Omega-3, que poseen propiedades         " +
                                                  "\n antiinflamatorias, aportando 50% de la ingesta diaria recomendada de Omega-3. frutas y verduras de colores vivos       " +
                                                  "\n (ar�ndanos, fresas, espinacas, br�coli), ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger " +
                                                  "\n las c�lulas del da�o y fortalecer el sistema inmunol�gico, aportando 70% de la ingesta diaria recomendada de vitamina C.  " +
                                                  "\n jengibre, que contiene compuestos con efectos antiinflamatorios que podr�an ser beneficiosos para las v�as respiratorias, " +
                                                  "\n aportando 5% de la ingesta diaria recomendada de vitamina C. c�rcuma, con su componente activo, la curcumina, que tiene   " +
                                                  "\n potentes propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes." +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico" +
                                                  "\n y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n En adultos mayores, la clamidia puede causar s�ntomas prolongados y complicaciones si no se trata adecuadamente.      " +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas suaves y ejercicios de movilidad para mejorar la   " +
                                                  "\n circulaci�n y reducir la fatiga. Tambi�n es recomendable realizar ejercicios de relajaci�n y respiraci�n para reducir " +
                                                  "\n el estr�s, ya que este puede afectar la respuesta inmunol�gica y prolongar la infecci�n. HIDRATACI�N: Es esencial el  " +
                                                  "\n consumo diario de 2.5 a 2.75 litros de agua (ocho a diez vasos de agua de tama�o regular) para mantener el cuerpo     " +
                                                  "\n hidratado y ayudar a reducir la inflamaci�n. Adem�s del agua pura, se recomienda el consumo de jugos naturales ricos  " +
                                                  "\n en vitamina C, como jugo de naranja o toronja, que pueden fortalecer el sistema inmunol�gico. Tambi�n es beneficioso  " +
                                                  "\n ingerir caldos ligeros, que aportan l�quidos y minerales esenciales para la recuperaci�n. POSIBLE TRATAMIENTO: La clamidia" +
                                                  "\n se trata con antibi�ticos, como azitromicina o doxiciclina, administrados en un r�gimen de varios d�as. Tambi�n se        " +
                                                  "\n recomienda el uso de medidas preventivas, como el uso de preservativos y la detecci�n temprana en parejas sexuales.       " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmunol�gico y reducir la inflamaci�n," +
                                                  "\n tales como ar�ndanos, ricos en antioxidantes y vitamina C, aportando 25% de la ingesta diaria recomendada. espinacas,     " +
                                                  "\n que contienen hierro y vitamina A, esenciales para la recuperaci�n, proporcionando 15% de la ingesta diaria recomendada   " +
                                                  "\n de hierro. jengibre, con propiedades antiinflamatorias y antioxidantes, aportando 5% de la ingesta diaria recomendada de     " +
                                                  "\n vitamina C. c�rcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta " +
                                                  "\n diaria recomendada de antioxidantes. yogur natural, que contiene probi�ticos beneficiosos para la flora intestinal,          " +
                                                  "\n proporcionando 15% de la ingesta diaria recomendada de calcio. Este es solo un diagn�stico predeterminado l�gico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas.    " +
                                                  "\n Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado.     " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n En adultos mayores, la meningitis bacteriana puede ser grave y requiere atenci�n m�dica inmediata.   " +
                                                  "\n HIDRATACI�N: Es esencial que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente ocho     " +
                                                  "\n a diez vasos de tama�o regular) para mantener una adecuada funci�n cerebral y evitar la deshidrataci�n, que    " +
                                                  "\n puede agravar los s�ntomas neurol�gicos. La hidrataci�n es clave para mantener el equilibrio de electrolitos   " +
                                                  "\n y mejorar la funci�n cognitiva, reduciendo el riesgo de complicaciones neurol�gicas. EJERCICIO: La actividad   " +
                                                  "\n f�sica debe ser m�nima y adaptada, como ejercicios de respiraci�n y movilidad pasiva, evitando esfuerzos excesivos      " +
                                                  "\n que puedan comprometer la recuperaci�n. Movilizar el cuerpo de manera controlada ayuda a prevenir la rigidez muscular   " +
                                                  "\n y mejora la circulaci�n, lo que favorece la recuperaci�n. POSIBLE TRATAMIENTO: Para la meningitis bacteriana en adultos " +
                                                  "\n mayores, el tratamiento suele incluir antibi�ticos intravenosos como ceftriaxona o vancomicina, dependiendo del agente  " +
                                                  "\n causal. Tambi�n se recomienda el uso de corticosteroides para reducir la inflamaci�n cerebral y en algunos casos, soporte  " +
                                                  "\n respiratorio. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para      " +
                                                  "\n fortalecer el sistema inmune y mejorar la recuperaci�n, tales como Frutas c�tricas (naranjas, limones, vitamina C, 50 mg   " +
                                                  "\n por 100 g, fortalece el sistema inmune y mejora la absorci�n de hierro), Espinacas (vitamina A y C, 937 �g de vitamina A   " +
                                                  "\n y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg por " +
                                                  "\n 100 g, ayuda a reducir la inflamaci�n y proteger las c�lulas), Yogur natural (probi�ticos, mejora la salud intestinal y    " +
                                                  "\n fortalece el sistema inmune), Pescados grasos (salm�n, Omega-3, 2 g por 100 g, ayuda a reducir la inflamaci�n y mejorar la   " +
                                                  "\n funci�n celular). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente " +
                                                  "\n tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un Diagn�stico de Mi Vida para    " +
                                                  "\n mayor seguridad en el tratamiento. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se        " +
                                                  "\n recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n En adultos mayores, el c�ncer requiere un enfoque integral para mejorar la calidad de vida y el tratamiento.   " +
                                                  "\n HIDRATACI�N: Es recomendable que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente ocho a diez vasos     " +
                                                  "\n de tama�o regular) para mantener una adecuada funci�n renal y evitar la deshidrataci�n, que puede afectar la tolerancia a los   " +
                                                  "\n tratamientos oncol�gicos. La hidrataci�n tambi�n ayuda a reducir la fatiga y mejorar la funci�n celular, lo que es crucial      " +
                                                  "\n para la recuperaci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada, como caminatas de 30 minutos diarios,        " +
                                                  "\n ejercicios de bajo impacto como yoga o nataci�n, siempre bajo supervisi�n m�dica para evitar fatiga extrema. El ejercicio       " +
                                                  "\n mejora la circulaci�n, fortalece los m�sculos y ayuda a reducir los efectos secundarios del tratamiento, como la fatiga y       " +
                                                  "\n la p�rdida de masa muscular. POSIBLE TRATAMIENTO: Para el c�ncer en adultos mayores, el tratamiento suele incluir quimioterapia," +
                                                  "\n radioterapia o inmunoterapia, dependiendo del tipo y estadio del c�ncer. Tambi�n se recomienda un enfoque multidisciplinario con" +
                                                  "\n apoyo nutricional y psicol�gico. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes, prote�nas y         " +
                                                  "\n nutrientes esenciales para fortalecer el sistema inmune y mejorar la recuperaci�n, tales como Frutas c�tricas (naranjas, limones," +
                                                  "\n vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora la absorci�n de hierro), Espinacas (vitamina A y C, 937 �g de  " +
                                                  "\n vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E,     " +
                                                  "\n 25 mg por 100 g, ayuda a reducir la inflamaci�n y proteger las c�lulas), Yogur natural (probi�ticos, mejora la salud intestinal " +
                                                  "\n y fortalece el sistema inmune), Pescados grasos (salm�n, Omega-3, 2 g por 100 g, ayuda a reducir la inflamaci�n y mejorar la    " +
                                                  "\n funci�n celular). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente    " +
                                                  "\n tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un Diagn�stico de Mi Vida para mayor " +
                                                  "\n seguridad en el tratamiento. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar" +
                                                  "\n a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        if(EstaturaMasculino.equals("1.55-1.70 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n En adultos mayores, la gripe puede ser m�s severa debido a la disminuci�n de la respuesta inmune con la edad.       " +
                                                  "\n HIDRATACI�N: Es recomendable que el paciente mantenga una hidrataci�n adecuada, consumiendo entre 2 y 2.5 litros de   " +
                                                  "\n agua al d�a (aproximadamente ocho a diez vasos de tama�o regular) para ayudar a mantener las mucosas hidratadas y     " +
                                                  "\n facilitar la expulsi�n de secreciones. La hidrataci�n tambi�n contribuye a la regulaci�n de la temperatura corporal   " +
                                                  "\n y al transporte eficiente de nutrientes esenciales para la recuperaci�n. EJERCICIO: La actividad f�sica debe ser suave  " +
                                                  "\n y adaptada, como caminatas cortas de 20 a 30 minutos diarios, evitando esfuerzos excesivos y asegurando una buena       " +
                                                  "\n ventilaci�n en el entorno para reducir el riesgo de complicaciones respiratorias. El ejercicio moderado mejora la       " +
                                                  "\n circulaci�n sangu�nea, fortalece el sistema inmunol�gico y ayuda a reducir la fatiga causada por la enfermedad.         " +
                                                  "\n POSIBLE TRATAMIENTO: Para la gripe en adultos mayores, el tratamiento suele incluir antivirales como oseltamivir (Tamiflu) " +
                                                  "\n en casos graves o de riesgo, adem�s de medicamentos para aliviar s�ntomas como paracetamol (Tempra) o ibuprofeno (Advil)   " +
                                                  "\n para la fiebre y el malestar. Tambi�n se recomienda el uso de jarabes expectorantes para facilitar la eliminaci�n de       " +
                                                  "\n flemas. La vacunaci�n anual contra la influenza es clave para la prevenci�n. ALIMENTACI�N: Se recomienda el consumo        " +
                                                  "\n de alimentos ricos en vitamina C y antioxidantes para fortalecer el sistema inmune, tales como Naranjas y mandarinas       " +
                                                  "\n (vitamina C, 50 mg por 100 g, fortalece el sistema inmune y reduce la duraci�n de los s�ntomas), Kiwi (vitamina C,         " +
                                                  "\n 100 mg por 100 g, refuerza el sistema inmunol�gico y mejora la absorci�n de hierro), Fresas (antioxidantes y vitamina C,   " +
                                                  "\n 58 mg por 100 g, protegen las c�lulas del da�o oxidativo y fortalecen el sistema inmune), Espinacas y br�coli (vitamina A  " +
                                                  "\n y C, 937 �g de vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune),        " +
                                                  "\n Miel (propiedades antimicrobianas y suavizantes para la garganta, ayuda a reducir la irritaci�n y la tos), Caldos          " +
                                                  "\n calientes (favorecen la hidrataci�n y alivian la congesti�n nasal). Este es solo un diagn�stico predeterminado l�gico,     " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado.       " +
                                                  "\n Se recomienda realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad en el tratamiento. Adem�s, por su salud,      " +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece     " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n En adultos mayores, la neumon�a puede ser grave debido a la disminuci�n de la respuesta inmune y la posible presencia  " +
                                                  "\n de enfermedades cr�nicas. HIDRATACI�N: Es fundamental que el paciente consuma entre 2 y 2.5 litros de agua al d�a      " +
                                                  "\n (aproximadamente ocho a diez vasos de tama�o regular) para mantener las v�as respiratorias hidratadas y facilitar la   " +
                                                  "\n expulsi�n de secreciones. La hidrataci�n tambi�n ayuda a reducir la inflamaci�n pulmonar y mejora la oxigenaci�n de    " +
                                                  "\n los tejidos, lo que es crucial para la recuperaci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada, como " +
                                                  "\n caminatas cortas de 15 a 20 minutos diarios, evitando esfuerzos excesivos y asegurando una buena ventilaci�n en el     " +
                                                  "\n entorno para reducir el riesgo de complicaciones respiratorias. Movilizar el cuerpo de manera controlada ayuda a prevenir   " +
                                                  "\n la rigidez muscular y mejora la circulaci�n, lo que favorece la recuperaci�n. POSIBLE TRATAMIENTO: Para la neumon�a en      " +
                                                  "\n adultos mayores, el tratamiento suele incluir antibi�ticos como amoxicilina con �cido clavul�nico (Clavulin) o levofloxacino" +
                                                  "\n (Levaquin) en casos bacterianos, adem�s de medicamentos para aliviar s�ntomas como paracetamol (Tempra) o ibuprofeno        " +
                                                  "\n (Advil) para la fiebre y el malestar. Tambi�n se recomienda el uso de broncodilatadores en casos de dificultad respiratoria " +
                                                  "\n y oxigenoterapia en situaciones graves. La vacunaci�n contra neumococo e influenza es clave para la prevenci�n.             " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y minerales esenciales para          " +
                                                  "\n fortalecer el sistema inmune y mejorar la recuperaci�n, tales como Naranjas y mandarinas (vitamina C, 50 mg por 100 g,      " +
                                                  "\n fortalece el sistema inmune y reduce la duraci�n de los s�ntomas), Kiwi (vitamina C, 100 mg por 100 g, refuerza el sistema  " +
                                                  "\n inmunol�gico y mejora la absorci�n de hierro), Fresas (antioxidantes y vitamina C, 58 mg por 100 g, protegen las c�lulas    " +
                                                  "\n del da�o oxidativo y fortalecen el sistema inmune), Espinacas y br�coli (vitamina A y C, 937 �g de vitamina A y 89 mg de    " +
                                                  "\n vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg por 100 g,      " +
                                                  "\n ayuda a reducir la inflamaci�n y fortalecer el sistema inmunol�gico), Miel (propiedades antimicrobianas y suavizantes       " +
                                                  "\n para la garganta, ayuda a reducir la irritaci�n y la tos), Caldos calientes (favorecen la hidrataci�n y alivian la          " +
                                                  "\n congesti�n nasal). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el        " +
                                                  "\n paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un Diagn�stico de       " +
                                                  "\n Mi Vida para mayor seguridad en el tratamiento. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface       " +
                                                  "\n del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n En adultos mayores, la diabetes puede generar complicaciones graves si no se controla adecuadamente.  " +
                                                  "\n HIDRATACI�N: Es fundamental que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente ocho       " +
                                                  "\n a diez vasos de tama�o regular) para mantener una adecuada funci�n renal y evitar la deshidrataci�n, que puede      " +
                                                  "\n afectar los niveles de glucosa en sangre. La hidrataci�n tambi�n ayuda a mejorar la circulaci�n y la funci�n        " +
                                                  "\n metab�lica, lo que es clave para el control de la enfermedad. EJERCICIO: La actividad f�sica debe ser moderada      " +
                                                  "\n y adaptada, como caminatas de 30 minutos diarios, ejercicios de bajo impacto como nataci�n o yoga, siempre bajo     " +
                                                  "\n supervisi�n m�dica para evitar hipoglucemias. El ejercicio mejora la sensibilidad a la insulina, ayuda a controlar  " +
                                                  "\n los niveles de glucosa y fortalece el sistema cardiovascular. POSIBLE TRATAMIENTO: Para la diabetes en adultos mayores,    " +
                                                  "\n el tratamiento suele incluir medicamentos como metformina (Glucophage) para mejorar la sensibilidad a la insulina,         " +
                                                  "\n insulina en casos necesarios, y medicamentos como glibenclamida o sitagliptina para el control de la glucosa. Es           " +
                                                  "\n clave mantener un monitoreo constante de los niveles de az�car en sangre y seguir una dieta equilibrada. ALIMENTACI�N:     " +
                                                  "\n Se recomienda el consumo de alimentos ricos en fibra, antioxidantes y nutrientes esenciales para el control de la glucosa, " +
                                                  "\n tales como Avena (fibra soluble, 4 g por 100 g, ayuda a estabilizar los niveles de glucosa), Frijoles (fibra y prote�nas,  " +
                                                  "\n 6 g de fibra por 100 g, contribuyen a la regulaci�n del az�car en sangre), Espinacas (magnesio, 79 mg por 100 g, mejora    " +
                                                  "\n la sensibilidad a la insulina), Naranjas (vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora la absorci�n   " +
                                                  "\n de hierro), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamaci�n y proteger las c�lulas), Canela         " +
                                                  "\n (compuestos bioactivos, ayuda a mejorar la sensibilidad a la insulina). Este es solo un diagn�stico predeterminado l�gico, " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se    " +
                                                  "\n recomienda realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad en el tratamiento. Adem�s, por su salud, si la   " +
                                                  "\n respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n En adultos mayores, el asma puede generar mayor dificultad respiratoria y riesgo de exacerbaciones, por lo que es fundamental   " +
                                                  "\n un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que el paciente mantenga una hidrataci�n adecuada,   " +
                                                  "\n consumiendo al menos 2.5 litros de agua al d�a (aproximadamente diez vasos de tama�o regular) para favorecer la eliminaci�n de  " +
                                                  "\n toxinas y mantener las v�as respiratorias hidratadas, lo que ayuda a reducir la viscosidad del moco y facilita la respiraci�n.  " +
                                                  "\n EJERCICIO: En cuanto a la actividad f�sica, es recomendable realizar ejercicios de bajo impacto, como caminatas de 30 minutos   " +
                                                  "\n diarios, nataci�n o yoga, siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer la funci�n pulmonar. Tambi�n  " +
                                                  "\n es importante realizar ejercicios de respiraci�n profunda para mejorar la capacidad pulmonar y reducir la sensaci�n de falta de " +
                                                  "\n aire. POSIBLE TRATAMIENTO: El tratamiento est�ndar para el asma incluye broncodilatadores de alivio r�pido, como el salbutamol  " +
                                                  "\n (Ventolin), corticosteroides inhalados para el control a largo plazo, como la fluticasona (Flixotide), y en algunos casos,      " +
                                                  "\n modificadores de leucotrienos como el montelukast (Singulair). Es fundamental seguir estrictamente el plan de acci�n para el    " +
                                                  "\n asma indicado por el m�dico y usar los medicamentos preventivos regularmente. ALIMENTACI�N RECOMENDADA: Se recomienda el consumo" +
                                                  "\n de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como: Pescados grasos (salm�n, at�n):" +
                                                  "\n Ricos en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias y pueden ayudar a reducir la inflamaci�n de las v�as  " +
                                                  "\n respiratorias, aportando aproximadamente el 50% del requerimiento diario por cada 100 gramos de salm�n. Frutas y verduras de   " +
                                                  "\n colores vivos (ar�ndanos, fresas, espinacas, br�coli): Ricas en antioxidantes como la vitamina C y carotenoides, que pueden    " +
                                                  "\n proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico, aportando cerca del 89% del requerimiento diario por cada  " +
                                                  "\n 100 gramos de fresas. Jengibre: Contiene compuestos con efectos antiinflamatorios que podr�an ser beneficiosos para las v�as   " +
                                                  "\n respiratorias, ayudando a reducir la inflamaci�n y mejorar la circulaci�n sangu�nea. C�rcuma: Con su componente activo, la     " +
                                                  "\n curcumina, tambi�n tiene potentes propiedades antiinflamatorias y antioxidantes, contribuyendo a la reducci�n de la inflamaci�n" +
                                                  "\n en los pulmones. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente   " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar m�s    " +
                                                  "\n de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la     " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n En adultos mayores, el VIH/SIDA puede generar mayor vulnerabilidad a infecciones oportunistas y complicaciones      " +
                                                  "\n sist�micas, por lo que es fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda    " +
                                                  "\n que el paciente mantenga una hidrataci�n adecuada, consumiendo al menos 2.5 litros de agua al d�a (aproximadamente  " +
                                                  "\n diez vasos de tama�o regular) para favorecer la eliminaci�n de toxinas y mantener el sistema inmunol�gico fuerte,   " +
                                                  "\n lo que ayuda a reducir la fatiga y mejorar la funci�n renal. EJERCICIO: En cuanto a la actividad f�sica, es         " +
                                                  "\n recomendable realizar ejercicios de bajo impacto, como caminatas de 30 minutos diarios, nataci�n o yoga, siempre    " +
                                                  "\n bajo supervisi�n m�dica para evitar complicaciones y fortalecer la funci�n cardiovascular y muscular. Tambi�n se    " +
                                                  "\n recomienda ejercicios de resistencia para mejorar la masa muscular, ya que el VIH puede causar p�rdida de peso y    " +
                                                  "\n debilitamiento muscular. POSIBLE TRATAMIENTO: El tratamiento est�ndar para el VIH/SIDA incluye terapia antirretroviral  " +
                                                  "\n combinada (TAR), con medicamentos como tenofovir, emtricitabina y dolutegravir, que ayudan a reducir la carga viral y   " +
                                                  "\n mejorar la funci�n inmunol�gica. Es fundamental seguir estrictamente el tratamiento indicado por el m�dico y realizar   " +
                                                  "\n controles peri�dicos para evaluar la respuesta al tratamiento. ALIMENTACI�N RECOMENDADA: Se recomienda el consumo de    " +
                                                  "\n alimentos que fortalezcan el sistema inmunol�gico y ayuden a combatir infecciones, tales como: Frutas c�tricas (naranjas," +
                                                  "\n limones, toronjas): Ricas en vitamina C, que fortalece el sistema inmunol�gico y ayuda a reducir la duraci�n de         " +
                                                  "\n infecciones, aportando aproximadamente el 89% del requerimiento diario por cada 100 gramos. Yogur natural: Contiene     " +
                                                  "\n probi�ticos, que pueden ayudar a mantener el equilibrio de la flora bacteriana y mejorar la respuesta inmunol�gica,     " +
                                                  "\n proporcionando cerca del 20% del requerimiento diario de calcio por cada porci�n de 150 gramos. Verduras de hoja verde  " +
                                                  "\n (espinaca, acelga, br�coli): Ricas en antioxidantes y vitaminas esenciales para la recuperaci�n, como la vitamina A,    " +
                                                  "\n que contribuye a la regeneraci�n celular y aporta cerca del 56% del requerimiento diario por cada 100 gramos de espinaca." +
                                                  "\n Omega-3 (salm�n, at�n, ch�a): Con propiedades antiinflamatorias que pueden ayudar a reducir la inflamaci�n y mejorar la  " +
                                                  "\n respuesta inmunol�gica, aportando aproximadamente el 50% del requerimiento diario por cada 100 gramos de salm�n. Este es " +
                                                  "\n solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad " +
                                                  "\n ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar m�s de un diagn�stico y " +
                                                  "\n consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y  " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n En adultos mayores, la gonorrea puede presentar s�ntomas m�s leves o at�picos, por lo que es fundamental un          " +
                                                  "\n diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que el paciente mantenga una hidrataci�n     " +
                                                  "\n adecuada, consumiendo al menos 2 litros de agua al d�a (aproximadamente ocho vasos de tama�o regular) para           " +
                                                  "\n favorecer la eliminaci�n de toxinas y mantener el sistema inmunol�gico fuerte, lo que ayuda a reducir la inflamaci�n " +
                                                  "\n y mejorar la funci�n renal. EJERCICIO: En cuanto a la actividad f�sica, es recomendable realizar ejercicio moderado, " +
                                                  "\n como caminatas de 30 a 45 minutos diarios, siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer   " +
                                                  "\n la circulaci�n sangu�nea. Tambi�n se recomienda ejercicios de movilidad para mejorar la funci�n articular y reducir  " +
                                                  "\n la fatiga. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la gonorrea incluye antibi�ticos como la azitromicina   " +
                                                  "\n y ceftriaxona, los cuales deben ser administrados bajo prescripci�n m�dica. En casos m�s graves, puede requerirse    " +
                                                  "\n hospitalizaci�n para recibir antibi�ticos intravenosos. Es fundamental que el paciente evite el contacto �ntimo hasta    " +
                                                  "\n completar el tratamiento y que su pareja tambi�n reciba tratamiento para evitar reinfecciones. ALIMENTACI�N RECOMENDADA: " +
                                                  "\n Se recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a combatir la infecci�n, tales    " +
                                                  "\n como: Ajo: Posee propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene alicina,      " +
                                                  "\n un compuesto con efectos antibacterianos. Frutas c�tricas (naranjas, limones, toronjas): Ricas en vitamina C, que        " +
                                                  "\n fortalece el sistema inmunol�gico y ayuda a reducir la duraci�n de infecciones, aportando aproximadamente el 89% del     " +
                                                  "\n requerimiento diario por cada 100 gramos. Yogur natural: Contiene probi�ticos, que pueden ayudar a mantener el equilibrio" +
                                                  "\n de la flora bacteriana y mejorar la respuesta inmunol�gica, proporcionando cerca del 20% del requerimiento diario de    " +
                                                  "\n calcio por cada porci�n de 150 gramos. Verduras de hoja verde (espinaca, acelga, br�coli): Ricas en antioxidantes y     " +
                                                  "\n vitaminas esenciales para la recuperaci�n, como la vitamina A, que contribuye a la regeneraci�n celular y aporta cerca  " +
                                                  "\n del 56% del requerimiento diario por cada 100 gramos de espinaca. Este es solo un diagn�stico predeterminado l�gico,    " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente  " +
                                                  "\n correctas. Para mayor seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer   " +
                                                  "\n el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n En adultos mayores, el herpes genital puede causar s�ntomas m�s prolongados y complicaciones debido a la disminuci�n     " +
                                                  "\n de la respuesta inmunol�gica. EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas suaves y ejercicios     " +
                                                  "\n de movilidad para mejorar la circulaci�n y reducir la fatiga. Tambi�n es recomendable realizar ejercicios de relajaci�n  " +
                                                  "\n y respiraci�n para reducir el estr�s, ya que este puede desencadenar brotes de herpes. HIDRATACI�N: Es esencial el       " +
                                                  "\n consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tama�o regular) para mantener el cuerpo hidratado " +
                                                  "\n y ayudar a reducir la inflamaci�n. Adem�s del agua pura, se recomienda el consumo de infusiones de hierbas, como t� de   " +
                                                  "\n manzanilla o jengibre, que pueden ayudar a reducir la inflamaci�n y mejorar la respuesta inmunol�gica. Tambi�n es        " +
                                                  "\n beneficioso ingerir jugos naturales sin az�car, que aportan antioxidantes y vitaminas esenciales. POSIBLE TRATAMIENTO:   " +
                                                  "\n El herpes genital se trata con antivirales, como aciclovir, valaciclovir o famciclovir, que ayudan a reducir la duraci�n " +
                                                  "\n y gravedad de los brotes. Tambi�n se recomienda el uso de cremas t�picas para aliviar el dolor y la irritaci�n.          " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmunol�gico y reducir la         " +
                                                  "\n inflamaci�n, tales como ar�ndanos, ricos en antioxidantes y vitamina C, aportando 25% de la ingesta diaria recomendada.  " +
                                                  "\n espinacas, que contienen hierro y vitamina A, esenciales para la recuperaci�n, proporcionando 15% de la ingesta diaria   " +
                                                  "\n recomendada de hierro. jengibre, con propiedades antiinflamatorias y antioxidantes, aportando 5% de la ingesta diaria    " +
                                                  "\n recomendada de vitamina C. c�rcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes, proporcionando" +
                                                  "\n 3% de la ingesta diaria recomendada de antioxidantes. yogur natural, que contiene probi�ticos beneficiosos para la flora  " +
                                                  "\n intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio. Este es solo un diagn�stico predeterminado     " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean          " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer  " +
                                                  "\n el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n En adultos mayores, la s�filis puede progresar a etapas avanzadas si no se trata adecuadamente, afectando �rganos         " +
                                                  "\n internos y el sistema nervioso. EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas suaves y ejercicios    " +
                                                  "\n de movilidad para mejorar la circulaci�n y reducir la fatiga. Tambi�n es recomendable realizar ejercicios de respiraci�n  " +
                                                  "\n y relajaci�n para mejorar la oxigenaci�n y reducir el estr�s. HIDRATACI�N: Es fundamental el consumo diario de 2 a 2.5    " +
                                                  "\n litros de agua (ocho a diez vasos de agua de tama�o regular) para mantener el cuerpo hidratado y ayudar a reducir la      " +
                                                  "\n inflamaci�n. Adem�s del agua pura, se recomienda el consumo de jugos naturales ricos en vitamina C, como jugo de naranja  " +
                                                  "\n o toronja, que pueden fortalecer el sistema inmunol�gico. Tambi�n es beneficioso ingerir caldos ligeros, que aportan      " +
                                                  "\n l�quidos y minerales esenciales para la recuperaci�n. POSIBLE TRATAMIENTO: La s�filis se trata con antibi�ticos, como     " +
                                                  "\n penicilina G benzatina, que es el tratamiento de primera elecci�n. En casos de alergia a la penicilina, se pueden utilizar" +
                                                  "\n doxiciclina o ceftriaxona. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema         " +
                                                  "\n inmunol�gico y reducir la inflamaci�n, tales como ajo, que contiene alicina con propiedades antimicrobianas, aportando 5% " +
                                                  "\n de la ingesta diaria recomendada de antioxidantes. jengibre, con efectos antiinflamatorios y antioxidantes, aportando 5%  " +   
                                                  "\n de la ingesta diaria recomendada de vitamina C. c�rcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes," +
                                                  "\n proporcionando 3% de la ingesta diaria recomendada de antioxidantes. frutas c�tricas (naranjas, limones, toronjas), ricas en " +
                                                  "\n vitamina C, que fortalece el sistema inmunol�gico, aportando 90 mg por cada 100 g de fruta, lo que representa 100% de la  " +
                                                  "\n ingesta diaria recomendada. yogur natural, que contiene probi�ticos beneficiosos para la flora intestinal, proporcionando " +
                                                  "\n 15% de la ingesta diaria recomendada de calcio. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no  " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se " +
                                                  "\n recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n En adultos mayores, la tuberculosis puede ser grave debido a la disminuci�n de la funci�n pulmonar y la posibilidad " +
                                                  "\n de complicaciones respiratorias. EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas suaves y        " +
                                                  "\n ejercicios de respiraci�n para mejorar la capacidad pulmonar. Tambi�n es recomendable realizar ejercicios de        " +
                                                  "\n movilidad y estiramientos para mejorar la circulaci�n y reducir la fatiga. Debido a que la tuberculosis afecta      " +
                                                  "\n la funci�n pulmonar, es importante realizar ejercicios de respiraci�n profunda, como la t�cnica de respiraci�n      " +
                                                  "\n diafragm�tica, que ayuda a mejorar la oxigenaci�n y reducir la sensaci�n de falta de aire. Tambi�n se recomienda    " +
                                                  "\n la respiraci�n con labios fruncidos, que permite controlar la exhalaci�n y mejorar la eficiencia respiratoria.      " +
                                                  "\n HIDRATACI�N: Es esencial el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de agua de tama�o regular)  " +
                                                  "\n para mantener el cuerpo hidratado y ayudar a reducir la inflamaci�n de las v�as respiratorias. Adem�s del agua pura," +
                                                  "\n se recomienda el consumo de infusiones de hierbas, como t� de jengibre o manzanilla, que pueden ayudar a reducir la " +
                                                  "\n inflamaci�n y mejorar la respiraci�n. Tambi�n es beneficioso ingerir jugos naturales sin az�car, que aportan        " +
                                                  "\n antioxidantes y vitaminas esenciales para la funci�n pulmonar. POSIBLE TRATAMIENTO: La tuberculosis se trata        " +
                                                  "\n con antibi�ticos espec�ficos, como isoniazida, rifampicina, pirazinamida y etambutol, administrados en un r�gimen   " +
                                                  "\n prolongado de varios meses. En casos graves, se puede requerir hospitalizaci�n y ox�geno suplementario. ALIMENTACI�N:   " +
                                                  "\n Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema respiratorio y reducir la inflamaci�n, tales   " +
                                                  "\n como pescados grasos (salm�n, at�n), ricos en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias,          " +
                                                  "\n aportando 50% de la ingesta diaria recomendada de Omega-3. frutas y verduras de colores vivos (ar�ndanos, fresas,       " +
                                                  "\n espinacas, br�coli), ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las c�lulas del      " +
                                                  "\n da�o y fortalecer el sistema inmunol�gico, aportando 70% de la ingesta diaria recomendada de vitamina C. jengibre,      " +
                                                  "\n que contiene compuestos con efectos antiinflamatorios que podr�an ser beneficiosos para las v�as respiratorias,         " +
                                                  "\n aportando 5% de la ingesta diaria recomendada de vitamina C. c�rcuma, con su componente activo, la curcumina, que       " +
                                                  "\n tiene potentes propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de     " +
                                                  "\n antioxidantes. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el        " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar    " +
                                                  "\n m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita" +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n En adultos mayores, la artritis puede causar dolor cr�nico y afectar la movilidad, lo que impacta la calidad de vida.  " +
                                                  "\n HIDRATACI�N: Es fundamental que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente ocho a diez   " +
                                                  "\n vasos de tama�o regular) para mantener la lubricaci�n de las articulaciones y reducir la inflamaci�n. La hidrataci�n   " +
                                                  "\n tambi�n ayuda a eliminar toxinas y mejorar la circulaci�n, lo que favorece la regeneraci�n de los tejidos articulares. " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser moderada y adaptada, como ejercicios de bajo impacto como nataci�n, yoga o     " +
                                                  "\n caminatas de 30 minutos diarios. El ejercicio fortalece los m�sculos que rodean las articulaciones, mejora la          " +
                                                  "\n flexibilidad y reduce la rigidez matutina. POSIBLE TRATAMIENTO: Para la artritis en adultos mayores, el tratamiento    " +
                                                  "\n suele incluir antiinflamatorios como ibuprofeno (Advil) o naproxeno, medicamentos modificadores de la enfermedad como  " +
                                                  "\n metotrexato, y en algunos casos, terapias biol�gicas. Tambi�n se recomienda fisioterapia para mejorar la movilidad y   " +
                                                  "\n reducir el dolor. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes, �cidos grasos esenciales " +
                                                  "\n y minerales para fortalecer las articulaciones y reducir la inflamaci�n, tales como Pescados grasos (salm�n, Omega-3,  " +
                                                  "\n 2 g por 100 g, ayuda a reducir la inflamaci�n articular), Frutas y verduras de colores vivos (ar�ndanos, fresas,       " +
                                                  "\n espinacas, br�coli, vitamina C, 89 mg por 100 g, fortalece el sistema inmune y protege las c�lulas del da�o oxidativo)," +
                                                  "\n Jengibre (compuestos antiinflamatorios, ayuda a reducir el dolor articular), C�rcuma (curcumina, 3% de concentraci�n,  " +
                                                  "\n potente antioxidante y antiinflamatorio), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamaci�n y     " +
                                                  "\n proteger las c�lulas). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que  " +
                                                  "\n el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un Diagn�stico  " +
                                                  "\n de Mi Vida para mayor seguridad en el tratamiento. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface  " +
                                                  "\n del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n En adultos mayores, la tosferina puede ser grave y causar complicaciones respiratorias si no se trata adecuadamente.  " +
                                                  "\n HIDRATACI�N: Es esencial que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente ocho a diez     " +
                                                  "\n vasos de tama�o regular) para mantener las v�as respiratorias hidratadas y reducir la viscosidad de las secreciones.  " +
                                                  "\n La hidrataci�n tambi�n ayuda a calmar la irritaci�n de la garganta y mejorar la funci�n pulmonar. EJERCICIO: La       " +
                                                  "\n actividad f�sica debe ser m�nima y adaptada, como ejercicios de respiraci�n y movilidad pasiva, evitando esfuerzos    " +
                                                  "\n excesivos que puedan comprometer la recuperaci�n. Movilizar el cuerpo de manera controlada ayuda a prevenir la rigidez  " +
                                                  "\n muscular y mejora la circulaci�n, lo que favorece la recuperaci�n. POSIBLE TRATAMIENTO: Para la tosferina en adultos    " +
                                                  "\n mayores, el tratamiento suele incluir antibi�ticos como azitromicina o eritromicina para eliminar la bacteria, adem�s   " +
                                                  "\n de medicamentos para aliviar la tos y reducir la inflamaci�n de las v�as respiratorias. Tambi�n se recomienda el uso    " +
                                                  "\n de humidificadores para mejorar la respiraci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en            " + 
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmune y mejorar la recuperaci�n, tales como Frutas    " +
                                                  "\n c�tricas (naranjas, limones, vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora la absorci�n de hierro), " +
                                                  "\n Espinacas (vitamina A y C, 937 �g de vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la  " +
                                                  "\n respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamaci�n y proteger las c�lulas), Miel " +
                                                  "\n (propiedades antimicrobianas y suavizantes para la garganta, ayuda a reducir la irritaci�n y la tos), Caldos calientes  " +
                                                  "\n (favorecen la hidrataci�n y alivian la congesti�n nasal). Este es solo un diagn�stico predeterminado l�gico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda " +
                                                  "\n realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad en el tratamiento. Adem�s, por su salud, si la respuesta    " +
                                                  "\n del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app  " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n En adultos mayores, las paperas pueden causar inflamaci�n severa de las gl�ndulas salivales y generar complicaciones " +
                                                  "\n si no se manejan adecuadamente. HIDRATACI�N: Es recomendable que el paciente consuma entre 2 y 2.5 litros de agua al " +
                                                  "\n d�a (aproximadamente ocho a diez vasos de tama�o regular) para mantener una adecuada funci�n renal y evitar la       " +
                                                  "\n deshidrataci�n, que puede afectar la recuperaci�n. La hidrataci�n tambi�n ayuda a reducir la inflamaci�n de las      " +
                                                  "\n gl�ndulas y mejorar la producci�n de saliva. EJERCICIO: La actividad f�sica debe ser moderada y adaptada, como       " +
                                                  "\n caminatas de 30 minutos diarios, ejercicios de bajo impacto como yoga o nataci�n, siempre bajo supervisi�n m�dica    " +
                                                  "\n para evitar fatiga extrema. El ejercicio mejora la circulaci�n, fortalece los m�sculos y ayuda a reducir los efectos " +
                                                  "\n secundarios de la inflamaci�n. POSIBLE TRATAMIENTO: Para las paperas en adultos mayores, el tratamiento suele incluir   " +
                                                  "\n analg�sicos como paracetamol o ibuprofeno para reducir el dolor y la fiebre, adem�s de reposo y aislamiento para evitar " +
                                                  "\n la propagaci�n del virus. Tambi�n se recomienda la aplicaci�n de compresas fr�as en la zona inflamada. ALIMENTACI�N:    " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes, prote�nas y nutrientes esenciales para fortalecer el      " +
                                                  "\n sistema inmune y mejorar la recuperaci�n, tales como Frutas c�tricas (naranjas, limones, vitamina C, 50 mg por 100 g,   " +
                                                  "\n fortalece el sistema inmune y mejora la absorci�n de hierro), Espinacas (vitamina A y C, 937 �g de vitamina A y 89 mg   " +
                                                  "\n de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg por      " +
                                                  "\n 100 g, ayuda a reducir la inflamaci�n y proteger las c�lulas), Yogur natural (probi�ticos, mejora la salud intestinal   " +
                                                  "\n y fortalece el sistema inmune), Pescados grasos (salm�n, Omega-3, 2 g por 100 g, ayuda a reducir la inflamaci�n y       " +
                                                  "\n mejorar la funci�n celular). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al   " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un   " +
                                                  "\n Diagn�stico de Mi Vida para mayor seguridad en el tratamiento. Adem�s, por su salud, si la respuesta del diagn�stico " +
                                                  "\n no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida)  " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n En adultos mayores, el virus del Zika puede causar s�ntomas m�s intensos y prolongados, aumentando el riesgo de   " +
                                                  "\n complicaciones neurol�gicas, por lo que es fundamental un diagn�stico oportuno y tratamiento adecuado.            " +
                                                  "\n HIDRATACI�N: Se recomienda que el paciente mantenga una hidrataci�n adecuada, consumiendo al menos 2.5 litros de  " +
                                                  "\n agua al d�a (aproximadamente diez vasos de tama�o regular) para favorecer la eliminaci�n de toxinas y mantener el " +
                                                  "\n sistema inmunol�gico fuerte, lo que ayuda a reducir la fatiga y mejorar la funci�n renal. EJERCICIO: En cuanto a  " +
                                                  "\n la actividad f�sica, es recomendable realizar ejercicios de bajo impacto, como caminatas de 30 minutos diarios,   " +
                                                  "\n nataci�n o yoga, siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer la funci�n cardiovascular.  " +
                                                  "\n Tambi�n se recomienda ejercicios de movilidad para mejorar la circulaci�n sangu�nea y reducir la inflamaci�n.        " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento antiviral espec�fico para el Zika, por lo que el manejo es sintom�tico." +
                                                  "\n Se recomienda el uso de analg�sicos como paracetamol para aliviar la fiebre y el malestar, antihistam�nicos para        " +
                                                  "\n reducir el prurito y reposo adecuado. Es fundamental evitar el uso de aspirina y otros antiinflamatorios no esteroides  " +
                                                  "\n sin supervisi�n m�dica. ALIMENTACI�N RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema      " +
                                                  "\n inmunol�gico y ayuden a combatir la infecci�n, tales como: Frutas c�tricas (naranjas, limones, toronjas): Ricas en      " +
                                                  "\n vitamina C, que fortalece el sistema inmunol�gico y ayuda a reducir la duraci�n de infecciones, aportando aproximadamente" +
                                                  "\n el 89% del requerimiento diario por cada 100 gramos. Jengibre: Contiene compuestos con efectos antiinflamatorios que     " +
                                                  "\n pueden ayudar a reducir la fiebre y el malestar general. Verduras de hoja verde (espinaca, acelga, br�coli): Ricas en    " +
                                                  "\n antioxidantes y vitaminas esenciales para la recuperaci�n, como la vitamina A, que contribuye a la regeneraci�n celular  " +
                                                  "\n y aporta cerca del 56% del requerimiento diario por cada 100 gramos de espinaca. Omega-3 (salm�n, at�n, ch�a): Con       " +
                                                  "\n propiedades antiinflamatorias que pueden ayudar a reducir la inflamaci�n y mejorar la respuesta inmunol�gica, aportando  " +
                                                  "\n aproximadamente el 50% del requerimiento diario por cada 100 gramos de salm�n. Este es solo un diagn�stico predeterminado" +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean         " +
                                                  "\n completamente correctas. Para mayor seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para " +
                                                  "\n establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n En adultos mayores, el rotavirus puede causar deshidrataci�n severa y complicaciones gastrointestinales, por lo    " +
                                                  "\n que es fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que el paciente      " +
                                                  "\n mantenga una hidrataci�n adecuada, consumiendo al menos 3 litros de agua al d�a (aproximadamente doce vasos de     " +
                                                  "\n tama�o regular) para compensar la p�rdida de l�quidos y evitar la deshidrataci�n. EJERCICIO: En cuanto a la        " +
                                                  "\n actividad f�sica, es recomendable realizar ejercicios de bajo impacto, como caminatas suaves de 20 minutos diarios," +
                                                  "\n siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer la funci�n digestiva. POSIBLE TRATAMIENTO: " +
                                                  "\n No existe un tratamiento antiviral espec�fico para el rotavirus, por lo que el manejo es sintom�tico. Se recomienda" +
                                                  "\n el uso de soluciones de rehidrataci�n oral para evitar la deshidrataci�n, as� como una dieta blanda y de f�cil     " +
                                                  "\n digesti�n. En casos graves, puede requerirse hospitalizaci�n para administraci�n de l�quidos intravenosos.         " +
                                                  "\n ALIMENTACI�N RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema digestivo y ayuden a    " +
                                                  "\n combatir la infecci�n, tales como: Pl�tano: Rico en potasio, que ayuda a reemplazar los electrolitos perdidos debido  " +
                                                  "\n a la diarrea, aportando aproximadamente el 12% del requerimiento diario por cada 100 gramos. Yogur natural: Contiene  " +
                                                  "\n probi�ticos, que pueden ayudar a restaurar la flora intestinal y mejorar la digesti�n, proporcionando cerca del 20%   " +
                                                  "\n del requerimiento diario de calcio por cada porci�n de 150 gramos. Arroz blanco: Fuente de carbohidratos de f�cil     " +
                                                  "\n digesti�n que ayuda a estabilizar el sistema digestivo y aporta energ�a sin irritar el est�mago. Zanahoria: Rica en   " +
                                                  "\n vitamina A, que contribuye a la regeneraci�n celular y fortalece la mucosa intestinal, aportando cerca del 56% del    " +
                                                  "\n requerimiento diario por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no    " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para mayor" +
                                                  "\n seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado." +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n En adultos mayores, la listeriosis puede causar infecciones graves y afectar el sistema nervioso, por lo que  " +
                                                  "\n es fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que el paciente     " +
                                                  "\n mantenga una hidrataci�n adecuada, consumiendo al menos 2.5 litros de agua al d�a (aproximadamente diez vasos " +
                                                  "\n de tama�o regular) para favorecer la eliminaci�n de toxinas y mantener el sistema inmunol�gico fuerte.        " +
                                                  "\n EJERCICIO: En cuanto a la actividad f�sica, es recomendable realizar ejercicios de bajo impacto, como caminatas  " +
                                                  "\n de 30 minutos diarios, nataci�n o yoga, siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer  " +
                                                  "\n la funci�n inmunol�gica. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la listeriosis incluye antibi�ticos   " +
                                                  "\n como ampicilina y gentamicina, administrados bajo prescripci�n m�dica. En casos graves, puede requerirse         " +
                                                  "\n hospitalizaci�n para administraci�n de antibi�ticos intravenosos. ALIMENTACI�N RECOMENDADA: Se recomienda el     " +
                                                  "\n consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a combatir la infecci�n, tales como: Ajo:  " +
                                                  "\n Posee propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene alicina, un      " +
                                                  "\n compuesto con efectos antibacterianos. Frutas c�tricas (naranjas, limones, toronjas): Ricas en vitamina C, que   " +
                                                  "\n fortalece el sistema inmunol�gico y ayuda a reducir la duraci�n de infecciones, aportando aproximadamente el 89% " +
                                                  "\n del requerimiento diario por cada 100 gramos. Yogur natural: Contiene probi�ticos, que pueden ayudar a mantener  " +
                                                  "\n el equilibrio de la flora bacteriana y mejorar la respuesta inmunol�gica, proporcionando cerca del 20% del         " +
                                                  "\n requerimiento diario de calcio por cada porci�n de 150 gramos. Verduras de hoja verde (espinaca, acelga, br�coli): " +
                                                  "\n Ricas en antioxidantes y vitaminas esenciales para la recuperaci�n, como la vitamina A, que contribuye a la        " +
                                                  "\n regeneraci�n celular y aporta cerca del 56% del requerimiento diario por cada 100 gramos de espinaca. Este es solo " +
                                                  "\n un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad" +
                                                  "\n ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar m�s de un         " +
                                                  "\n diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la" +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n En adultos mayores, la shigelosis puede causar diarrea severa y deshidrataci�n, lo que puede ser peligroso     " +
                                                  "\n si no se trata adecuadamente. EJERCICIO: Se recomienda actividad f�sica ligera, como caminatas cortas,         " +
                                                  "\n evitando esfuerzos excesivos que puedan agravar la deshidrataci�n. Tambi�n es recomendable realizar ejercicios " +
                                                  "\n de movilidad y estiramientos para mejorar la circulaci�n y reducir la fatiga. Debido a que la shigelosis causa " +
                                                  "\n diarrea y p�rdida de l�quidos, es importante evitar ejercicios que generen sudoraci�n excesiva y optar por     " +
                                                  "\n movimientos suaves que ayuden a mantener la actividad sin comprometer la hidrataci�n. HIDRATACI�N: Es crucial  " +
                                                  "\n el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de agua de tama�o regular) para compensar la    " +
                                                  "\n p�rdida de l�quidos y evitar la deshidrataci�n. Adem�s del agua pura, se recomienda el consumo de soluciones   " +
                                                  "\n de rehidrataci�n oral para reponer electrolitos esenciales como sodio y potasio. Tambi�n es beneficioso ingerir   " +
                                                  "\n agua de coco, que contiene electrolitos naturales, y caldos ligeros, que aportan l�quidos y minerales esenciales  " +
                                                  "\n para la recuperaci�n. POSIBLE TRATAMIENTO: La shigelosis se trata con antibi�ticos, como azitromicina,            " +
                                                  "\n ciprofloxacino o ceftriaxona, dependiendo de la gravedad del caso. Tambi�n se recomienda rehidrataci�n oral y una " +
                                                  "\n dieta adecuada. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a reponer l�quidos y fortalecer el " +
                                                  "\n sistema digestivo, tales como pl�tanos, ricos en potasio, que ayudan a reemplazar los electrolitos perdidos,      " +
                                                  "\n aportando 10% de la ingesta diaria recomendada de potasio. arroz blanco, que es f�cil de digerir y ayuda a        " +
                                                  "\n estabilizar el sistema digestivo, proporcionando 20% de la ingesta diaria recomendada de carbohidratos. zanahorias,  " +
                                                  "\n ricas en vitamina A, que ayudan a la recuperaci�n del sistema digestivo, aportando 50% de la ingesta diaria          " +
                                                  "\n recomendada de vitamina A. agua de coco, que ayuda a la hidrataci�n y aporta electrolitos esenciales. yogur natural, " +
                                                  "\n que contiene probi�ticos beneficiosos para la flora intestinal, proporcionando 15% de la ingesta diaria recomendada  " +
                                                  "\n de calcio. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un " +
                                                  "\n diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la   " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n En adultos mayores, la EPOC puede causar dificultad para respirar y fatiga, afectando la calidad de vida.     " +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas suaves y ejercicios de respiraci�n para    " +
                                                  "\n mejorar la capacidad pulmonar. Tambi�n es recomendable realizar ejercicios de movilidad y estiramientos para  " +
                                                  "\n mejorar la circulaci�n y reducir la fatiga. Debido a que la EPOC afecta la funci�n pulmonar, es importante    " +
                                                  "\n realizar ejercicios de respiraci�n profunda, como la t�cnica de respiraci�n diafragm�tica, que ayuda a mejorar     " +
                                                  "\n la oxigenaci�n y reducir la sensaci�n de falta de aire. Tambi�n se recomienda la respiraci�n con labios fruncidos, " +
                                                  "\n que permite controlar la exhalaci�n y mejorar la eficiencia respiratoria. HIDRATACI�N: Es esencial el consumo      " +
                                                  "\n diario de 2.5 a 2.75 litros de agua (ocho a diez vasos de agua de tama�o regular) para mantener el cuerpo hidratado" +
                                                  "\n y ayudar a reducir la inflamaci�n de las v�as respiratorias. Adem�s del agua pura, se recomienda el consumo de     " +
                                                  "\n infusiones de hierbas, como t� de jengibre o manzanilla, que pueden ayudar a reducir la inflamaci�n y mejorar la   " +
                                                  "\n respiraci�n. Tambi�n es beneficioso ingerir jugos naturales sin az�car, que aportan antioxidantes y vitaminas      " +
                                                  "\n esenciales para la funci�n pulmonar. POSIBLE TRATAMIENTO: La EPOC se trata con broncodilatadores, como salbutamol, " +
                                                  "\n tiotropio o formoterol, adem�s de corticosteroides inhalados, como fluticasona o budesonida. En casos graves, se   " +
                                                  "\n puede requerir ox�geno suplementario y rehabilitaci�n pulmonar. ALIMENTACI�N: Se recomienda el consumo de alimentos  " +
                                                  "\n que ayuden a fortalecer el sistema respiratorio y reducir la inflamaci�n, tales como pescados grasos (salm�n, at�n), " +
                                                  "\n ricos en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias, aportando 50% de la ingesta diaria         " +
                                                  "\n recomendada de Omega-3. frutas y verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli), ricas en         " +
                                                  "\n antioxidantes como la vitamina C y carotenoides, que pueden proteger las c�lulas del da�o y fortalecer el sistema    " +
                                                  "\n inmunol�gico, aportando 70% de la ingesta diaria recomendada de vitamina C. jengibre, que contiene compuestos con    " +
                                                  "\n efectos antiinflamatorios que podr�an ser beneficiosos para las v�as respiratorias, aportando 5% de la ingesta diaria" +
                                                  "\n recomendada de vitamina C. c�rcuma, con su componente activo, la curcumina, que tiene potentes propiedades antiinflamatorias " +
                                                  "\n y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes. Este es solo un diagn�stico            " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas   " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para  " +
                                                  "\n establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n En adultos mayores, la clamidia puede causar s�ntomas prolongados y" +
                                                  "\n complicaciones si no se trata adecuadamente. EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas suaves " +
                                                  "\n y ejercicios de movilidad para mejorar la circulaci�n y reducir la fatiga. Tambi�n es recomendable realizar ejercicios " +
                                                  "\n de relajaci�n y respiraci�n para reducir el estr�s, ya que este puede afectar la respuesta inmunol�gica y prolongar la " +
                                                  "\n infecci�n. HIDRATACI�N: Es esencial el consumo diario de 2.5 a 2.75 litros de agua (ocho a diez vasos de agua de tama�o   " +
                                                  "\n regular) para mantener el cuerpo hidratado y ayudar a reducir la inflamaci�n. Adem�s del agua pura, se recomienda el      " +
                                                  "\n consumo de jugos naturales ricos en vitamina C, como jugo de naranja o toronja, que pueden fortalecer el sistema          " +
                                                  "\n inmunol�gico. Tambi�n es beneficioso ingerir caldos ligeros, que aportan l�quidos y minerales esenciales para la          " +
                                                  "\n recuperaci�n. POSIBLE TRATAMIENTO: La clamidia se trata con antibi�ticos, como azitromicina o doxiciclina, administrados  " +
                                                  "\n en un r�gimen de varios d�as. Tambi�n se recomienda el uso de medidas preventivas, como el uso de preservativos y la      " +
                                                  "\n detecci�n temprana en parejas sexuales. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el    " +
                                                  "\n sistema inmunol�gico y reducir la inflamaci�n, tales como ar�ndanos, ricos en antioxidantes y vitamina C, aportando 25%   " +
                                                  "\n de la ingesta diaria recomendada. espinacas, que contienen hierro y vitamina A, esenciales para la recuperaci�n,          " +
                                                  "\n proporcionando 15% de la ingesta diaria recomendada de hierro. jengibre, con propiedades antiinflamatorias y antioxidantes,  " +
                                                  "\n aportando 5% de la ingesta diaria recomendada de vitamina C. c�rcuma, con curcumina, que tiene propiedades antiinflamatorias " +
                                                  "\n y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes. yogur natural, que contiene probi�ticos" +
                                                  "\n beneficiosos para la flora intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio. Este es solo un   " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que " +
                                                  "\n las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un   " +
                                                  "\n m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n En adultos mayores, la meningitis bacteriana puede ser grave y requiere atenci�n m�dica inmediata. " +
                                                  "\n HIDRATACI�N: Es esencial que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente ocho    " +
                                                  "\n a diez vasos de tama�o regular) para mantener una adecuada funci�n cerebral y evitar la deshidrataci�n, que   " +
                                                  "\n puede agravar los s�ntomas neurol�gicos. La hidrataci�n es clave para mantener el equilibrio de electrolitos  " +
                                                  "\n y mejorar la funci�n cognitiva, reduciendo el riesgo de complicaciones neurol�gicas. EJERCICIO: La actividad  " +
                                                  "\n f�sica debe ser m�nima y adaptada, como ejercicios de respiraci�n y movilidad pasiva, evitando esfuerzos      " +
                                                  "\n excesivos que puedan comprometer la recuperaci�n. Movilizar el cuerpo de manera controlada ayuda a prevenir la  " +
                                                  "\n rigidez muscular y mejora la circulaci�n, lo que favorece la recuperaci�n. POSIBLE TRATAMIENTO: Para la meningitis   " +
                                                  "\n bacteriana en adultos mayores, el tratamiento suele incluir antibi�ticos intravenosos como ceftriaxona o vancomicina," +
                                                  "\n dependiendo del agente causal. Tambi�n se recomienda el uso de corticosteroides para reducir la inflamaci�n cerebral " +
                                                  "\n y en algunos casos, soporte respiratorio. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes " +
                                                  "\n y nutrientes esenciales para fortalecer el sistema inmune y mejorar la recuperaci�n, tales como Frutas c�tricas      " +
                                                  "\n (naranjas, limones, vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora la absorci�n de hierro),       " +
                                                  "\n Espinacas (vitamina A y C, 937 �g de vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular    " +
                                                  "\n y la respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamaci�n y proteger las c�lulas), " +
                                                  "\n Yogur natural (probi�ticos, mejora la salud intestinal y fortalece el sistema inmune), Pescados grasos (salm�n, Omega-3," +
                                                  "\n 2 g por 100 g, ayuda a reducir la inflamaci�n y mejorar la funci�n celular). Este es solo un diagn�stico predeterminado " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el      " +
                                                  "\n adecuado. Se recomienda realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad en el tratamiento. Adem�s, por su" +
                                                  "\n salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n En adultos mayores, el c�ncer requiere un enfoque integral para mejorar la calidad de vida y el tratamiento.   " +
                                                  "\n HIDRATACI�N: Es recomendable que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente ocho a diez    " +
                                                  "\n vasos de tama�o regular) para mantener una adecuada funci�n renal y evitar la deshidrataci�n, que puede afectar la       " +
                                                  "\n tolerancia a los tratamientos oncol�gicos. La hidrataci�n tambi�n ayuda a reducir la fatiga y mejorar la funci�n celular," +
                                                  "\n lo que es crucial para la recuperaci�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada, como caminatas de 30" +
                                                  "\n minutos diarios, ejercicios de bajo impacto como yoga o nataci�n, siempre bajo supervisi�n m�dica para evitar fatiga    " +
                                                  "\n extrema. El ejercicio mejora la circulaci�n, fortalece los m�sculos y ayuda a reducir los efectos secundarios del       " +
                                                  "\n tratamiento, como la fatiga y la p�rdida de masa muscular. POSIBLE TRATAMIENTO: Para el c�ncer en adultos mayores, el   " +
                                                  "\n tratamiento suele incluir quimioterapia, radioterapia o inmunoterapia, dependiendo del tipo y estadio del c�ncer.       " +
                                                  "\n Tambi�n se recomienda un enfoque multidisciplinario con apoyo nutricional y psicol�gico. ALIMENTACI�N: Se recomienda    " +
                                                  "\n el consumo de alimentos ricos en antioxidantes, prote�nas y nutrientes esenciales para fortalecer el sistema inmune     " +
                                                  "\n y mejorar la recuperaci�n, tales como Frutas c�tricas (naranjas, limones, vitamina C, 50 mg por 100 g, fortalece el     " +
                                                  "\n sistema inmune y mejora la absorci�n de hierro), Espinacas (vitamina A y C, 937 �g de vitamina A y 89 mg de vitamina C  " +
                                                  "\n por 100 g, esenciales para la salud celular y la respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, ayuda a     " +
                                                  "\n reducir la inflamaci�n y proteger las c�lulas), Yogur natural (probi�ticos, mejora la salud intestinal y fortalece el   " +
                                                  "\n sistema inmune), Pescados grasos (salm�n, Omega-3, 2 g por 100 g, ayuda a reducir la inflamaci�n y mejorar la funci�n   " +
                                                  "\n celular). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente    " +
                                                  "\n tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un Diagn�stico de Mi Vida    " +
                                                  "\n para mayor seguridad en el tratamiento. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, " +
                                                  "\n se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        if(EstaturaMasculino.equals("1.45-1.60 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n En adultos mayores, la gripe puede ser m�s severa debido a la disminuci�n de la respuesta inmune con la edad.         " +
                                                  "\n HIDRATACI�N: Es recomendable que el paciente mantenga una hidrataci�n adecuada, consumiendo entre 2 y 2.5 litros      " +
                                                  "\n de agua al d�a (aproximadamente ocho a diez vasos de tama�o regular) para ayudar a mantener las mucosas hidratadas    " +
                                                  "\n y facilitar la expulsi�n de secreciones. La hidrataci�n tambi�n contribuye a la regulaci�n de la temperatura corporal " +
                                                  "\n y al transporte eficiente de nutrientes esenciales para la recuperaci�n. EJERCICIO: La actividad f�sica debe ser suave" +
                                                  "\n y adaptada, como caminatas cortas de 20 a 30 minutos diarios, evitando esfuerzos excesivos y asegurando una buena   " +
                                                  "\n ventilaci�n en el entorno para reducir el riesgo de complicaciones respiratorias. El ejercicio moderado mejora la   " +
                                                  "\n circulaci�n sangu�nea, fortalece el sistema inmunol�gico y ayuda a reducir la fatiga causada por la enfermedad.     " +
                                                  "\n POSIBLE TRATAMIENTO: Para la gripe en adultos mayores, el tratamiento suele incluir antivirales como oseltamivir    " +
                                                  "\n (Tamiflu) en casos graves o de riesgo, adem�s de medicamentos para aliviar s�ntomas como paracetamol (Tempra) o     " +
                                                  "\n ibuprofeno (Advil) para la fiebre y el malestar. Tambi�n se recomienda el uso de jarabes expectorantes para facilitar" +
                                                  "\n la eliminaci�n de flemas. La vacunaci�n anual contra la influenza es clave para la prevenci�n. ALIMENTACI�N: Se      " +
                                                  "\n recomienda el consumo de alimentos ricos en vitamina C y antioxidantes para fortalecer el sistema inmune, tales      " +
                                                  "\n como Naranjas y mandarinas (vitamina C, 50 mg por 100 g, fortalece el sistema inmune y reduce la duraci�n de los     " +
                                                  "\n s�ntomas), Kiwi (vitamina C, 100 mg por 100 g, refuerza el sistema inmunol�gico y mejora la absorci�n de hierro),    " +
                                                  "\n Fresas (antioxidantes y vitamina C, 58 mg por 100 g, protegen las c�lulas del da�o oxidativo y fortalecen el sistema " +
                                                  "\n inmune), Espinacas y br�coli (vitamina A y C, 937 �g de vitamina A y 89 mg de vitamina C por 100 g, esenciales para  " +
                                                  "\n la salud celular y la respuesta inmune), Miel (propiedades antimicrobianas y suavizantes para la garganta, ayuda a   " +
                                                  "\n reducir la irritaci�n y la tos), Caldos calientes (favorecen la hidrataci�n y alivian la congesti�n nasal). Este es  " +
                                                  "\n solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad " +
                                                  "\n ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad      " +
                                                  "\n en el tratamiento. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar" +
                                                  "\n a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraerNeumon�a." +
                                                  "\n En adultos mayores, la neumon�a puede ser grave debido a la disminuci�n de la respuesta inmune y la posible       " +
                                                  "\n presencia de enfermedades cr�nicas. HIDRATACI�N: Es fundamental que el paciente consuma entre 2 y 2.5 litros      " +
                                                  "\n de agua al d�a (aproximadamente ocho a diez vasos de tama�o regular) para mantener las v�as respiratorias           " +
                                                  "\n hidratadas y facilitar la expulsi�n de secreciones. La hidrataci�n tambi�n ayuda a reducir la inflamaci�n pulmonar  " +
                                                  "\n y mejora la oxigenaci�n de los tejidos, lo que es crucial para la recuperaci�n. EJERCICIO: La actividad f�sica debe " +
                                                  "\n ser moderada y adaptada, como caminatas cortas de 15 a 20 minutos diarios, evitando esfuerzos excesivos y asegurando" +
                                                  "\n una buena ventilaci�n en el entorno para reducir el riesgo de complicaciones respiratorias. Movilizar el cuerpo de    " +
                                                  "\n manera controlada ayuda a prevenir la rigidez muscular y mejora la circulaci�n, lo que favorece la recuperaci�n.      " +
                                                  "\n POSIBLE TRATAMIENTO: Para la neumon�a en adultos mayores, el tratamiento suele incluir antibi�ticos como amoxicilina  " +
                                                  "\n con �cido clavul�nico (Clavulin) o levofloxacino (Levaquin) en casos bacterianos, adem�s de medicamentos para aliviar " +
                                                  "\n s�ntomas como paracetamol (Tempra) o ibuprofeno (Advil) para la fiebre y el malestar. Tambi�n se recomienda el uso de " +
                                                  "\n broncodilatadores en casos de dificultad respiratoria y oxigenoterapia en situaciones graves. La vacunaci�n contra    " +
                                                  "\n neumococo e influenza es clave para la prevenci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en vitamina C, " +
                                                  "\n antioxidantes y minerales esenciales para fortalecer el sistema inmune y mejorar la recuperaci�n, tales como Naranjas y     " +
                                                  "\n mandarinas (vitamina C, 50 mg por 100 g, fortalece el sistema inmune y reduce la duraci�n de los s�ntomas), Kiwi (vitamina C, " +
                                                  "\n 100 mg por 100 g, refuerza el sistema inmunol�gico y mejora la absorci�n de hierro), Fresas (antioxidantes y vitamina C,   " +
                                                  "\n 58 mg por 100 g, protegen las c�lulas del da�o oxidativo y fortalecen el sistema inmune), Espinacas y br�coli (vitamina A  " +
                                                  "\n y C, 937 �g de vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la respuesta inmune),        " +
                                                  "\n Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamaci�n y fortalecer el sistema inmunol�gico), Miel         " +
                                                  "\n (propiedades antimicrobianas y suavizantes para la garganta, ayuda a reducir la irritaci�n y la tos), Caldos calientes     " +
                                                  "\n (favorecen la hidrataci�n y alivian la congesti�n nasal). Este es solo un diagn�stico predeterminado l�gico, haberlo       " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda " +
                                                  "\n realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad en el tratamiento. Adem�s, por su salud, si la respuesta    " +
                                                  "\n del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a         " +
                                                  "\n la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n En adultos mayores, la diabetes puede generar complicaciones graves si no se controla adecuadamente.  " +
                                                  "\n HIDRATACI�N: Es fundamental que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente ocho a   " +
                                                  "\n diez vasos de tama�o regular) para mantener una adecuada funci�n renal y evitar la deshidrataci�n, que puede      " +
                                                  "\n afectar los niveles de glucosa en sangre. La hidrataci�n tambi�n ayuda a mejorar la circulaci�n y la funci�n      " +
                                                  "\n metab�lica, lo que es clave para el control de la enfermedad. EJERCICIO: La actividad f�sica debe ser moderada    " +
                                                  "\n y adaptada, como caminatas de 30 minutos diarios, ejercicios de bajo impacto como nataci�n o yoga, siempre bajo   " +
                                                  "\n supervisi�n m�dica para evitar hipoglucemias. El ejercicio mejora la sensibilidad a la insulina, ayuda a controlar   " +
                                                  "\n los niveles de glucosa y fortalece el sistema cardiovascular. POSIBLE TRATAMIENTO: Para la diabetes en adultos       " +
                                                  "\n mayores, el tratamiento suele incluir medicamentos como metformina (Glucophage) para mejorar la sensibilidad a la    " +
                                                  "\n insulina, insulina en casos necesarios, y medicamentos como glibenclamida o sitagliptina para el control de la glucosa. " +
                                                  "\n Es clave mantener un monitoreo constante de los niveles de az�car en sangre y seguir una dieta equilibrada.             " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en fibra, antioxidantes y nutrientes esenciales para el       " +
                                                  "\n control de la glucosa, tales como Avena (fibra soluble, 4 g por 100 g, ayuda a estabilizar los niveles de glucosa),     " +
                                                  "\n Frijoles (fibra y prote�nas, 6 g de fibra por 100 g, contribuyen a la regulaci�n del az�car en sangre), Espinacas       " +
                                                  "\n (magnesio, 79 mg por 100 g, mejora la sensibilidad a la insulina), Naranjas (vitamina C, 50 mg por 100 g, fortalece el  " +
                                                  "\n sistema inmune y mejora la absorci�n de hierro), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamaci�n " +
                                                  "\n y proteger las c�lulas), Canela (compuestos bioactivos, ayuda a mejorar la sensibilidad a la insulina). Este es solo un " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que " +
                                                  "\n el tratamiento sea el adecuado. Se recomienda realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad en el   " +
                                                  "\n tratamiento. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar " +
                                                  "\n a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n En adultos mayores, el asma puede generar mayor dificultad respiratoria y riesgo de exacerbaciones, por lo que es  " +
                                                  "\n fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que el paciente mantenga    " +
                                                  "\n una hidrataci�n adecuada, consumiendo al menos 2.5 litros de agua al d�a (aproximadamente diez vasos de tama�o     " +
                                                  "\n regular) para favorecer la eliminaci�n de toxinas y mantener las v�as respiratorias hidratadas, lo que ayuda a     " +
                                                  "\n reducir la viscosidad del moco y facilita la respiraci�n. EJERCICIO: En cuanto a la actividad f�sica, es recomendable " +
                                                  "\n realizar ejercicios de bajo impacto, como caminatas de 30 minutos diarios, nataci�n o yoga, siempre bajo supervisi�n  " +
                                                  "\n m�dica para evitar complicaciones y fortalecer la funci�n pulmonar. Tambi�n es importante realizar ejercicios de      " +
                                                  "\n respiraci�n profunda para mejorar la capacidad pulmonar y reducir la sensaci�n de falta de aire. POSIBLE TRATAMIENTO: " +
                                                  "\n El tratamiento est�ndar para el asma incluye broncodilatadores de alivio r�pido, como el salbutamol (Ventolin),       " +
                                                  "\n corticosteroides inhalados para el control a largo plazo, como la fluticasona (Flixotide), y en algunos casos,        " +
                                                  "\n modificadores de leucotrienos como el montelukast (Singulair). Es fundamental seguir estrictamente el plan de           " +
                                                  "\n acci�n para el asma indicado por el m�dico y usar los medicamentos preventivos regularmente. ALIMENTACI�N RECOMENDADA:  " +
                                                  "\n Se recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales  " +
                                                  "\n como: Pescados grasos (salm�n, at�n): Ricos en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias y pueden " +
                                                  "\n ayudar a reducir la inflamaci�n de las v�as respiratorias, aportando aproximadamente el 50% del requerimiento diario por" +
                                                  "\n cada 100 gramos de salm�n. Frutas y verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli): Ricas en       " +
                                                  "\n antioxidantes como la vitamina C y carotenoides, que pueden proteger las c�lulas del da�o y fortalecer el sistema     " +
                                                  "\n inmunol�gico, aportando cerca del 89% del requerimiento diario por cada 100 gramos de fresas. Jengibre: Contiene      " +
                                                  "\n compuestos con efectos antiinflamatorios que podr�an ser beneficiosos para las v�as respiratorias, ayudando a reducir " +
                                                  "\n la inflamaci�n y mejorar la circulaci�n sangu�nea. C�rcuma: Con su componente activo, la curcumina, tambi�n tiene     " +
                                                  "\n potentes propiedades antiinflamatorias y antioxidantes, contribuyendo a la reducci�n de la inflamaci�n en los pulmones." +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta  " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar m�s de un  " +
                                                  "\n diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la    " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n En adultos mayores, el VIH/SIDA puede generar mayor vulnerabilidad a infecciones oportunistas y complicaciones sist�micas, " +
                                                  "\n por lo que es fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que el paciente       " +
                                                  "\n mantenga una hidrataci�n adecuada, consumiendo al menos 2.5 litros de agua al d�a (aproximadamente diez vasos de tama�o    " +
                                                  "\n regular) para favorecer la eliminaci�n de toxinas y mantener el sistema inmunol�gico fuerte, lo que ayuda a reducir la     " +
                                                  "\n fatiga y mejorar la funci�n renal. EJERCICIO: En cuanto a la actividad f�sica, es recomendable realizar ejercicios de bajo " +
                                                  "\n impacto, como caminatas de 30 minutos diarios, nataci�n o yoga, siempre bajo supervisi�n m�dica para evitar complicaciones " +
                                                  "\n y fortalecer la funci�n cardiovascular y muscular. Tambi�n se recomienda ejercicios de resistencia para mejorar la masa    " +
                                                  "\n muscular, ya que el VIH puede causar p�rdida de peso y debilitamiento muscular. POSIBLE TRATAMIENTO: El tratamiento est�ndar" +
                                                  "\n para el VIH/SIDA incluye terapia antirretroviral combinada (TAR), con medicamentos como tenofovir, emtricitabina y dolutegravir," +
                                                  "\n que ayudan a reducir la carga viral y mejorar la funci�n inmunol�gica. Es fundamental seguir estrictamente el tratamiento   " +
                                                  "\n indicado por el m�dico y realizar controles peri�dicos para evaluar la respuesta al tratamiento. ALIMENTACI�N RECOMENDADA:  " +
                                                  "\n Se recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a combatir infecciones, tales como:  " +
                                                  "\n Frutas c�tricas (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece el sistema inmunol�gico y ayuda a reducir " +
                                                  "\n la duraci�n de infecciones, aportando aproximadamente el 89% del requerimiento diario por cada 100 gramos. Yogur natural:   " +
                                                  "\n Contiene probi�ticos, que pueden ayudar a mantener el equilibrio de la flora bacteriana y mejorar la respuesta inmunol�gica," +
                                                  "\n proporcionando cerca del 20% del requerimiento diario de calcio por cada porci�n de 150 gramos. Verduras de hoja verde      " +
                                                  "\n (espinaca, acelga, br�coli): Ricas en antioxidantes y vitaminas esenciales para la recuperaci�n, como la vitamina A, que    " +
                                                  "\n contribuye a la regeneraci�n celular y aporta cerca del 56% del requerimiento diario por cada 100 gramos de espinaca. Omega-3" +
                                                  "\n (salm�n, at�n, ch�a): Con propiedades antiinflamatorias que pueden ayudar a reducir la inflamaci�n y mejorar la respuesta    " +
                                                  "\n inmunol�gica, aportando aproximadamente el 50% del requerimiento diario por cada 100 gramos de salm�n. Este es solo un       " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que      " +
                                                  "\n las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar m�s de un diagn�stico y consultar  " +
                                                  "\n a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n En adultos mayores, la gonorrea puede presentar s�ntomas m�s leves o at�picos, por lo que es fundamental un          " +
                                                  "\n diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que el paciente mantenga una hidrataci�n     " +
                                                  "\n adecuada, consumiendo al menos 2 litros de agua al d�a (aproximadamente ocho vasos de tama�o regular) para favorecer " +
                                                  "\n la eliminaci�n de toxinas y mantener el sistema inmunol�gico fuerte, lo que ayuda a reducir la inflamaci�n y mejorar " +
                                                  "\n la funci�n renal. EJERCICIO: En cuanto a la actividad f�sica, es recomendable realizar ejercicio moderado, como      " +
                                                  "\n caminatas de 30 a 45 minutos diarios, siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer la     " +
                                                  "\n circulaci�n sangu�nea. Tambi�n se recomienda ejercicios de movilidad para mejorar la funci�n articular y reducir     " + 
                                                  "\n la fatiga. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la gonorrea incluye antibi�ticos como la azitromicina   " +
                                                  "\n y ceftriaxona, los cuales deben ser administrados bajo prescripci�n m�dica. En casos m�s graves, puede requerirse    " +
                                                  "\n hospitalizaci�n para recibir antibi�ticos intravenosos. Es fundamental que el paciente evite el contacto �ntimo      " +
                                                  "\n hasta completar el tratamiento y que su pareja tambi�n reciba tratamiento para evitar reinfecciones. ALIMENTACI�N    " +
                                                  "\n RECOMENDADA: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a combatir la    " +
                                                  "\n infecci�n, tales como: Ajo: Posee propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y   " +
                                                  "\n contiene alicina, un compuesto con efectos antibacterianos. Frutas c�tricas (naranjas, limones, toronjas): Ricas en  " +
                                                  "\n vitamina C, que fortalece el sistema inmunol�gico y ayuda a reducir la duraci�n de infecciones, aportando aproximadamente" +
                                                  "\n el 89% del requerimiento diario por cada 100 gramos. Yogur natural: Contiene probi�ticos, que pueden ayudar a mantener   " +
                                                  "\n el equilibrio de la flora bacteriana y mejorar la respuesta inmunol�gica, proporcionando cerca del 20% del requerimiento   " +
                                                  "\n diario de calcio por cada porci�n de 150 gramos. Verduras de hoja verde (espinaca, acelga, br�coli): Ricas en antioxidantes" +
                                                  "\n y vitaminas esenciales para la recuperaci�n, como la vitamina A, que contribuye a la regeneraci�n celular y aporta cerca" +
                                                  "\n del 56% del requerimiento diario por cada 100 gramos de espinaca. Este es solo un diagn�stico predeterminado l�gico,    " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente  " +
                                                  "\n correctas. Para mayor seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer   " +
                                                  "\n el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n En adultos mayores, el herpes genital puede causar s�ntomas m�s prolongados y complicaciones debido a la disminuci�n    " +
                                                  "\n de la respuesta inmunol�gica. EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas suaves y ejercicios    " +
                                                  "\n de movilidad para mejorar la circulaci�n y reducir la fatiga. Tambi�n es recomendable realizar ejercicios de relajaci�n " +
                                                  "\n y respiraci�n para reducir el estr�s, ya que este puede desencadenar brotes de herpes. HIDRATACI�N: Es esencial el      " +
                                                  "\n consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tama�o regular) para mantener el cuerpo hidratado" +
                                                  "\n y ayudar a reducir la inflamaci�n. Adem�s del agua pura, se recomienda el consumo de infusiones de hierbas, como t� de  " +
                                                  "\n manzanilla o jengibre, que pueden ayudar a reducir la inflamaci�n y mejorar la respuesta inmunol�gica. Tambi�n es       " +
                                                  "\n beneficioso ingerir jugos naturales sin az�car, que aportan antioxidantes y vitaminas esenciales. POSIBLE TRATAMIENTO:  " +
                                                  "\n El herpes genital se trata con antivirales, como aciclovir, valaciclovir o famciclovir, que ayudan a reducir la duraci�n" +
                                                  "\n y gravedad de los brotes. Tambi�n se recomienda el uso de cremas t�picas para aliviar el dolor y la irritaci�n.         " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmunol�gico y reducir la�       " +
                                                  "\n inflamaci�n, tales como ar�ndanos, ricos en antioxidantes y vitamina C, aportando 25% de la ingesta diaria recomendada. " +
                                                  "\n Espinacas, que contienen hierro y vitamina A, esenciales para la recuperaci�n, proporcionando 15% de la ingesta diaria  " +
                                                  "\n recomendada de hierro. jengibre, con propiedades antiinflamatorias y antioxidantes, aportando 5% de la ingesta diaria   " +
                                                  "\n recomendada de vitamina C. c�rcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes, proporcionando" +
                                                  "\n 3% de la ingesta diaria recomendada de antioxidantes. yogur natural, que contiene probi�ticos beneficiosos para la flora  " +
                                                  "\n intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio. Este es solo un diagn�stico predeterminado   " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean       " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer" +
                                                  "\n el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n En adultos mayores, la s�filis puede progresar a etapas avanzadas si no se trata adecuadamente, afectando      " +
                                                  "\n �rganos internos y el sistema nervioso. EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas     " +
                                                  "\n suaves y ejercicios de movilidad para mejorar la circulaci�n y reducir la fatiga. Tambi�n es recomendable      " +
                                                  "\n realizar ejercicios de respiraci�n y relajaci�n para mejorar la oxigenaci�n y reducir el estr�s. HIDRATACI�N:  " +
                                                  "\n Es fundamental el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de agua de tama�o regular) para  " +
                                                  "\n mantener el cuerpo hidratado y ayudar a reducir la inflamaci�n. Adem�s del agua pura, se recomienda el consumo " +
                                                  "\n de jugos naturales ricos en vitamina C, como jugo de naranja o toronja, que pueden fortalecer el sistema       " +
                                                  "\n inmunol�gico. Tambi�n es beneficioso ingerir caldos ligeros, que aportan l�quidos y minerales esenciales       " +
                                                  "\n para la recuperaci�n. POSIBLE TRATAMIENTO: La s�filis se trata con antibi�ticos, como penicilina G benzatina,  " +
                                                  "\n que es el tratamiento de primera elecci�n. En casos de alergia a la penicilina, se pueden utilizar doxiciclina " +
                                                  "\n o ceftriaxona. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema          " +
                                                  "\n inmunol�gico y reducir la inflamaci�n, tales como ajo, que contiene alicina con propiedades antimicrobianas,   " +
                                                  "\n aportando 5% de la ingesta diaria recomendada de antioxidantes. jengibre, con efectos antiinflamatorios y      " +
                                                  "\n antioxidantes, aportando 5% de la ingesta diaria recomendada de vitamina C. c�rcuma, con curcumina, que tiene  " +
                                                  "\n propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de antioxidantes. " +
                                                  "\n frutas c�tricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunol�gico, aportando" +
                                                  "\n 90 mg por cada 100 g de fruta, lo que representa 100% de la ingesta diaria recomendada. yogur natural, que contiene " +
                                                  "\n probi�ticos beneficiosos para la flora intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio.   " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga    " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un     " +
                                                  "\n diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a    " +
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n En adultos mayores, la tuberculosis puede ser grave debido a la disminuci�n de la funci�n pulmonar y la       " +
                                                  "\n posibilidad de complicaciones respiratorias. EJERCICIO: Se recomienda actividad f�sica moderada, como         " +
                                                  "\n caminatas suaves y ejercicios de respiraci�n para mejorar la capacidad pulmonar. Tambi�n es recomendable      " +
                                                  "\n realizar ejercicios de movilidad y estiramientos para mejorar la circulaci�n y reducir la fatiga. Debido      " +
                                                  "\n a que la tuberculosis afecta la funci�n pulmonar, es importante realizar ejercicios de respiraci�n profunda,  " +
                                                  "\n como la t�cnica de respiraci�n diafragm�tica, que ayuda a mejorar la oxigenaci�n y reducir la sensaci�n de    " +
                                                  "\n falta de aire. Tambi�n se recomienda la respiraci�n con labios fruncidos, que permite controlar la exhalaci�n " +
                                                  "\n y mejorar la eficiencia respiratoria. HIDRATACI�N: Es esencial el consumo diario de 2.5 a 3 litros de agua    " +
                                                  "\n (diez a doce vasos de agua de tama�o regular) para mantener el cuerpo hidratado y ayudar a reducir la inflamaci�n     " +
                                                  "\n de las v�as respiratorias. Adem�s del agua pura, se recomienda el consumo de infusiones de hierbas, como t� de        " +
                                                  "\n jengibre o manzanilla, que pueden ayudar a reducir la inflamaci�n y mejorar la respiraci�n. Tambi�n es beneficioso    " +
                                                  "\n ingerir jugos naturales sin az�car, que aportan antioxidantes y vitaminas esenciales para la funci�n pulmonar.        " +
                                                  "\n POSIBLE TRATAMIENTO: La tuberculosis se trata con antibi�ticos espec�ficos, como isoniazida, rifampicina,             " +
                                                  "\n pirazinamida y etambutol, administrados en un r�gimen prolongado de varios meses. En casos graves, se puede requerir  " +
                                                  "\n hospitalizaci�n y ox�geno suplementario. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer  " +
                                                  "\n el sistema respiratorio y reducir la inflamaci�n, tales como pescados grasos (salm�n, at�n), ricos en �cidos grasos   " +
                                                  "\n Omega-3, que poseen propiedades antiinflamatorias, aportando 50% de la ingesta diaria recomendada de Omega-3. frutas  " +
                                                  "\n y verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli), ricas en antioxidantes como la vitamina C y      " +
                                                  "\n carotenoides, que pueden proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico, aportando 70% de la      " +
                                                  "\n ingesta diaria recomendada de vitamina C. jengibre, que contiene compuestos con efectos antiinflamatorios que podr�an " +
                                                  "\n ser beneficiosos para las v�as respiratorias, aportando 5% de la ingesta diaria recomendada de vitamina C. c�rcuma,   " +
                                                  "\n con su componente activo, la curcumina, que tiene potentes propiedades antiinflamatorias y antioxidantes,             " +
                                                  "\n proporcionando 3% de la ingesta diaria recomendada de antioxidantes. Este es solo un diagn�stico predeterminado       " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean      " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para         " +
                                                  "\n establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n En adultos mayores, la artritis puede causar dolor cr�nico y afectar la movilidad, lo que impacta la calidad       " +
                                                  "\n de vida. HIDRATACI�N: Es fundamental que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente  " +
                                                  "\n ocho a diez vasos de tama�o regular) para mantener la lubricaci�n de las articulaciones y reducir la inflamaci�n.  " +
                                                  "\n La hidrataci�n tambi�n ayuda a eliminar toxinas y mejorar la circulaci�n, lo que favorece la regeneraci�n de los   " +
                                                  "\n tejidos articulares. EJERCICIO: La actividad f�sica debe ser moderada y adaptada, como ejercicios de bajo impacto  " +
                                                  "\n como nataci�n, yoga o caminatas de 30 minutos diarios. El ejercicio fortalece los m�sculos que rodean las          " +
                                                  "\n articulaciones, mejora la flexibilidad y reduce la rigidez matutina. POSIBLE TRATAMIENTO: Para la artritis         " +
                                                  "\n en adultos mayores, el tratamiento suele incluir antiinflamatorios como ibuprofeno o naproxeno, medicamentos       " +
                                                  "\n modificadores de la enfermedad como metotrexato, y en algunos casos, terapias biol�gicas. Tambi�n se recomienda    " +
                                                  "\n fisioterapia para mejorar la movilidad y reducir el dolor. ALIMENTACI�N: Se recomienda el consumo de alimentos     " +
                                                  "\n ricos en antioxidantes, �cidos grasos esenciales y minerales para fortalecer las articulaciones y reducir la       " +
                                                  "\n inflamaci�n, tales como Pescados grasos (salm�n, Omega-3, 2 g por 100 g, ayuda a reducir la inflamaci�n articular)," +
                                                  "\n Frutas y verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli, vitamina C, 89 mg por 100 g, fortalece    " +
                                                  "\n el sistema inmune y protege las c�lulas del da�o oxidativo), Jengibre (compuestos antiinflamatorios, ayuda a reducir " +
                                                  "\n el dolor articular), C�rcuma (curcumina, 3% de concentraci�n, potente antioxidante y antiinflamatorio), Almendras    " +
                                                  "\n (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamaci�n y proteger las c�lulas). Este es solo un diagn�stico    " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el       " +
                                                  "\n tratamiento sea el adecuado. Se recomienda realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad en el      " +
                                                  "\n tratamiento. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar " +
                                                  "\n a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n En adultos mayores, la tosferina puede ser grave y causar complicaciones respiratorias si no se trata adecuadamente.  " +
                                                  "\n HIDRATACI�N: Es esencial que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente ocho a diez     " +
                                                  "\n vasos de tama�o regular) para mantener las v�as respiratorias hidratadas y reducir la viscosidad de las secreciones.  " +
                                                  "\n La hidrataci�n tambi�n ayuda a calmar la irritaci�n de la garganta y mejorar la funci�n pulmonar. EJERCICIO: La       " +
                                                  "\n actividad f�sica debe ser m�nima y adaptada, como ejercicios de respiraci�n y movilidad pasiva, evitando esfuerzos    " +
                                                  "\n excesivos que puedan comprometer la recuperaci�n. Movilizar el cuerpo de manera controlada ayuda a prevenir la rigidez" +
                                                  "\n muscular y mejora la circulaci�n, lo que favorece la recuperaci�n. POSIBLE TRATAMIENTO: Para la tosferina en adultos  " +
                                                  "\n mayores, el tratamiento suele incluir antibi�ticos como azitromicina o eritromicina para eliminar la bacteria, adem�s " +
                                                  "\n de medicamentos para aliviar la tos y reducir la inflamaci�n de las v�as respiratorias. Tambi�n se recomienda el uso  " + 
                                                  "\n de humidificadores para mejorar la respiraci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en          " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmune y mejorar la recuperaci�n, tales como Frutas  " +
                                                  "\n c�tricas (naranjas, limones, vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora la absorci�n de hierro)," +
                                                  "\n Espinacas (vitamina A y C, 937 �g de vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y la " +
                                                  "\n respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamaci�n y proteger las c�lulas), Miel" +
                                                  "\n (propiedades antimicrobianas y suavizantes para la garganta, ayuda a reducir la irritaci�n y la tos), Caldos calientes " +
                                                  "\n (favorecen la hidrataci�n y alivian la congesti�n nasal). Este es solo un diagn�stico predeterminado l�gico, haberlo   " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se        " +
                                                  "\n recomienda realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad en el tratamiento. Adem�s, por su salud, si  " +
                                                  "\n la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n En adultos mayores, las paperas pueden causar inflamaci�n severa de las gl�ndulas salivales y generar               " +
                                                  "\n complicaciones si no se manejan adecuadamente. HIDRATACI�N: Es recomendable que el paciente consuma entre           " +
                                                  "\n 2 y 2.5 litros de agua al d�a (aproximadamente ocho a diez vasos de tama�o regular) para mantener una adecuada      " +
                                                  "\n funci�n renal y evitar la deshidrataci�n, que puede afectar la recuperaci�n. La hidrataci�n tambi�n ayuda a         " +
                                                  "\n reducir la inflamaci�n de las gl�ndulas y mejorar la producci�n de saliva. EJERCICIO: La actividad f�sica debe      " +
                                                  "\n ser moderada y adaptada, como caminatas de 30 minutos diarios, ejercicios de bajo impacto como yoga o nataci�n,     " +
                                                  "\n siempre bajo supervisi�n m�dica para evitar fatiga extrema. El ejercicio mejora la circulaci�n, fortalece los       " +
                                                  "\n m�sculos y ayuda a reducir los efectos secundarios de la inflamaci�n. POSIBLE TRATAMIENTO: Para las paperas en      " +
                                                  "\n adultos mayores, el tratamiento suele incluir analg�sicos como paracetamol o ibuprofeno para reducir el dolor y     " +
                                                  "\n la fiebre, adem�s de reposo y aislamiento para evitar la propagaci�n del virus. Tambi�n se recomienda la aplicaci�n " +
                                                  "\n de compresas fr�as en la zona inflamada. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes," +
                                                  "\n prote�nas y nutrientes esenciales para fortalecer el sistema inmune y mejorar la recuperaci�n, tales como Frutas    " +
                                                  "\n c�tricas (naranjas, limones, vitamina C, 50 mg por 100 g, fortalece el sistema inmune y mejora la absorci�n de hierro)," +
                                                  "\n Espinacas (vitamina A y C, 937 �g de vitamina A y 89 mg de vitamina C por 100 g, esenciales para la salud celular y    " +
                                                  "\n la respuesta inmune), Almendras (vitamina E, 25 mg por 100 g, ayuda a reducir la inflamaci�n y proteger las c�lulas),  " +
                                                  "\n Yogur natural (probi�ticos, mejora la salud intestinal y fortalece el sistema inmune), Pescados grasos (salm�n,        " +
                                                  "\n Omega-3, 2 g por 100 g, ayuda a reducir la inflamaci�n y mejorar la funci�n celular). Este es solo un diagn�stico      " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento  " +
                                                  "\n sea el adecuado. Se recomienda realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad en el tratamiento. Adem�s,    " +
                                                  "\n por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n En adultos mayores, el virus del Zika puede causar s�ntomas m�s intensos y prolongados, aumentando el riesgo de            " +
                                                  "\n complicaciones neurol�gicas, por lo que es fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N:        " +
                                                  "\n Se recomienda que el paciente mantenga una hidrataci�n adecuada, consumiendo al menos 2.5 litros de agua al d�a            " +
                                                  "\n (aproximadamente diez vasos de tama�o regular) para favorecer la eliminaci�n de toxinas y mantener el sistema inmunol�gico " +
                                                  "\n fuerte, lo que ayuda a reducir la fatiga y mejorar la funci�n renal. EJERCICIO: En cuanto a la actividad f�sica, es        " +
                                                  "\n recomendable realizar ejercicios de bajo impacto, como caminatas de 30 minutos diarios, nataci�n o yoga, siempre bajo      " +
                                                  "\n supervisi�n m�dica para evitar complicaciones y fortalecer la funci�n cardiovascular. Tambi�n se recomienda ejercicios     " +
                                                  "\n de movilidad para mejorar la circulaci�n sangu�nea y reducir la inflamaci�n. POSIBLE TRATAMIENTO: No existe un tratamiento " +
                                                  "\n antiviral espec�fico para el Zika, por lo que el manejo es sintom�tico. Se recomienda el uso de analg�sicos como paracetamol " +
                                                  "\n para aliviar la fiebre y el malestar, antihistam�nicos para reducir el prurito y reposo adecuado. Es fundamental evitar el   " +
                                                  "\n uso de aspirina y otros antiinflamatorios no esteroides sin supervisi�n m�dica. ALIMENTACI�N RECOMENDADA: Se recomienda el   " +
                                                  "\n consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a combatir la infecci�n, tales como: Frutas c�tricas   " +
                                                  "\n (naranjas, limones, toronjas): Ricas en vitamina C, que fortalece el sistema inmunol�gico y ayuda a reducir la duraci�n de   " +
                                                  "\n infecciones, aportando aproximadamente el 89% del requerimiento diario por cada 100 gramos. Jengibre: Contiene compuestos    " +
                                                  "\n con efectos antiinflamatorios que pueden ayudar a reducir la fiebre y el malestar general. Verduras de hoja verde (espinaca, " +
                                                  "\n acelga, br�coli): Ricas en antioxidantes y vitaminas esenciales para la recuperaci�n, como la vitamina A, que contribuye a   " +
                                                  "\n la regeneraci�n celular y aporta cerca del 56% del requerimiento diario por cada 100 gramos de espinaca. Omega-3 (salm�n,    " +
                                                  "\n at�n, ch�a): Con propiedades antiinflamatorias que pueden ayudar a reducir la inflamaci�n y mejorar la respuesta inmunol�gica," +
                                                  "\n aportando aproximadamente el 50% del requerimiento diario por cada 100 gramos de salm�n. Este es solo un diagn�stico          " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas    " +
                                                  "\n sean completamente correctas. Para mayor seguridad, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico      " +
                                                  "\n para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n En adultos mayores, el rotavirus puede causar deshidrataci�n severa y complicaciones gastrointestinales, por lo         " +
                                                  "\n que es fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que el paciente           " +
                                                  "\n mantenga una hidrataci�n adecuada, consumiendo al menos 3 litros de agua al d�a (aproximadamente doce vasos de          " +
                                                  "\n tama�o regular) para compensar la p�rdida de l�quidos y evitar la deshidrataci�n. EJERCICIO: En cuanto a la             " +
                                                  "\n actividad f�sica, es recomendable realizar ejercicios de bajo impacto, como caminatas suaves de 20 minutos diarios,     " +
                                                  "\n siempre bajo supervisi�n m�dica para evitar complicaciones y fortalecer la funci�n digestiva. POSIBLE TRATAMIENTO:      " +
                                                  "\n No existe un tratamiento antiviral espec�fico para el rotavirus, por lo que el manejo es sintom�tico. Se recomienda     " +
                                                  "\n el uso de soluciones de rehidrataci�n oral para evitar la deshidrataci�n, as� como una dieta blanda y de f�cil digesti�n.  " +
                                                  "\n En casos graves, puede requerirse hospitalizaci�n para administraci�n de l�quidos intravenosos. ALIMENTACI�N RECOMENDADA:  " +
                                                  "\n Se recomienda el consumo de alimentos que fortalezcan el sistema digestivo y ayuden a combatir la infecci�n, tales como:   " +
                                                  "\n Pl�tano: Rico en potasio, que ayuda a reemplazar los electrolitos perdidos debido a la diarrea, aportando aproximadamente  " +
                                                  "\n el 12% del requerimiento diario por cada 100 gramos. Yogur natural: Contiene probi�ticos, que pueden ayudar a restaurar    " +
                                                  "\n la flora intestinal y mejorar la digesti�n, proporcionando cerca del 20% del requerimiento diario de calcio por cada       " +
                                                  "\n porci�n de 150 gramos. Arroz blanco: Fuente de carbohidratos de f�cil digesti�n que ayuda a estabilizar el sistema         " +
                                                  "\n digestivo y aporta energ�a sin irritar el est�mago. Zanahoria: Rica en vitamina A, que contribuye a la regeneraci�n        " +
                                                  "\n celular y fortalece la mucosa intestinal, aportando cerca del 56% del requerimiento diario por cada 100 gramos. Este       " +
                                                  "\n es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad " +
                                                  "\n ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar m�s de un diagn�stico y    " +
                                                  "\n consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera" +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n En adultos mayores, la listeriosis puede causar infecciones graves y afectar el sistema nervioso, por lo         " +
                                                  "\n que es fundamental un diagn�stico oportuno y tratamiento adecuado. HIDRATACI�N: Se recomienda que el             " +
                                                  "\n paciente mantenga una hidrataci�n adecuada, consumiendo al menos 2.5 litros de agua al d�a (aproximadamente      " +
                                                  "\n diez vasos de tama�o regular) para favorecer la eliminaci�n de toxinas y mantener el sistema inmunol�gico        " +
                                                  "\n fuerte. EJERCICIO: En cuanto a la actividad f�sica, es recomendable realizar ejercicios de bajo impacto, como    " +
                                                  "\n caminatas de 30 minutos diarios, nataci�n o yoga, siempre bajo supervisi�n m�dica para evitar complicaciones     " +
                                                  "\n y fortalecer la funci�n inmunol�gica. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la listeriosis incluye   " +
                                                  "\n antibi�ticos como ampicilina y gentamicina, administrados bajo prescripci�n m�dica. En casos graves, puede       " +
                                                  "\n requerirse hospitalizaci�n para administraci�n de antibi�ticos intravenosos. ALIMENTACI�N RECOMENDADA: Se        " +
                                                  "\n recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a combatir la infecci�n,     " +
                                                  "\n tales como: Ajo: Posee propiedades antimicrobianas naturales que pueden ayudar a combatir infecciones y contiene " +
                                                  "\n alicina, un compuesto con efectos antibacterianos. Frutas c�tricas (naranjas, limones, toronjas): Ricas en vitamina C," +
                                                  "\n que fortalece el sistema inmunol�gico y ayuda a reducir la duraci�n de infecciones, aportando aproximadamente el      " +
                                                  "\n 89% del requerimiento diario por cada 100 gramos. Yogur natural: Contiene probi�ticos, que pueden ayudar a mantener   " +
                                                  "\n el equilibrio de la flora bacteriana y mejorar la respuesta inmunol�gica, proporcionando cerca del 20% del            " +
                                                  "\n requerimiento diario de calcio por cada porci�n de 150 gramos. Verduras de hoja verde (espinaca, acelga, br�coli):    " +
                                                  "\n Ricas en antioxidantes y vitaminas esenciales para la recuperaci�n, como la vitamina A, que contribuye a la           " +
                                                  "\n regeneraci�n celular y aporta cerca del 56% del requerimiento diario por cada 100 gramos de espinaca. Este es    " +
                                                  "\n solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta    " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para mayor seguridad, se recomienda realizar m�s  " +
                                                  "\n de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu    " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n En adultos mayores, la shigelosis puede causar diarrea severa y deshidrataci�n, lo que puede ser peligroso           " +
                                                  "\n si no se trata adecuadamente. EJERCICIO: Se recomienda actividad f�sica ligera, como caminatas cortas, evitando      " +
                                                  "\n esfuerzos excesivos que puedan agravar la deshidrataci�n. Tambi�n es recomendable realizar ejercicios de movilidad   " +
                                                  "\n y estiramientos para mejorar la circulaci�n y reducir la fatiga. Debido a que la shigelosis causa diarrea y p�rdida  " +
                                                  "\n de l�quidos, es importante evitar ejercicios que generen sudoraci�n excesiva y optar por movimientos suaves que      " +
                                                  "\n ayuden a mantener la actividad sin comprometer la hidrataci�n. HIDRATACI�N: Es crucial el consumo diario de 2.5 a 3  " +
                                                  "\n litros de agua (diez a doce vasos de agua de tama�o regular) para compensar la p�rdida de l�quidos y evitar la       " +
                                                  "\n deshidrataci�n. Adem�s del agua pura, se recomienda el consumo de soluciones de rehidrataci�n oral para reponer      " +
                                                  "\n electrolitos esenciales como sodio y potasio. Tambi�n es beneficioso ingerir agua de coco, que contiene electrolitos " +
                                                  "\n naturales, y caldos ligeros, que aportan l�quidos y minerales esenciales para la recuperaci�n. POSIBLE TRATAMIENTO:  " +
                                                  "\n La shigelosis se trata con antibi�ticos, como azitromicina, ciprofloxacino o ceftriaxona, dependiendo de la gravedad " +
                                                  "\n del caso. En casos severos, puede ser necesario el uso de terapia intravenosa para la rehidrataci�n y el control de  " +
                                                  "\n s�ntomas. Tambi�n se recomienda el uso de probi�ticos, que pueden ayudar a restaurar la flora intestinal y mejorar   " +
                                                  "\n la recuperaci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a reponer l�quidos y fortalecer el   " +
                                                  "\n sistema digestivo, tales como pl�tanos, ricos en potasio, que ayudan a reemplazar los electrolitos perdidos, aportando   " +
                                                  "\n 10% de la ingesta diaria recomendada de potasio. arroz blanco, que es f�cil de digerir y ayuda a estabilizar el sistema  " +
                                                  "\n digestivo, proporcionando 20% de la ingesta diaria recomendada de carbohidratos. zanahorias, ricas en vitamina A, que    " +
                                                  "\n ayudan a la recuperaci�n del sistema digestivo, aportando 50% de la ingesta diaria recomendada de vitamina A. agua de    " +
                                                  "\n coco, que ayuda a la hidrataci�n y aporta electrolitos esenciales. yogur natural, que contiene probi�ticos beneficiosos  " +
                                                  "\n para la flora intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio. Este es solo un diagn�stico     " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas" +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para  " +
                                                  "\n establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n En adultos mayores, la EPOC puede causar dificultad para respirar y fatiga, afectando la calidad de vida.             " +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas suaves y ejercicios de respiraci�n para mejorar    " +
                                                  "\n la capacidad pulmonar. Tambi�n es recomendable realizar ejercicios de movilidad y estiramientos para mejorar la       " +
                                                  "\n circulaci�n y reducir la fatiga. Debido a que la EPOC afecta la funci�n pulmonar, es importante realizar ejercicios   " +
                                                  "\n de respiraci�n profunda, como la t�cnica de respiraci�n diafragm�tica, que ayuda a mejorar la oxigenaci�n y reducir   " +
                                                  "\n la sensaci�n de falta de aire. Tambi�n se recomienda la respiraci�n con labios fruncidos, que permite controlar la    " +
                                                  "\n exhalaci�n y mejorar la eficiencia respiratoria. HIDRATACI�N: Es esencial el consumo diario de 2.5 a 2.75 litros de   " +
                                                  "\n agua (ocho a diez vasos de agua de tama�o regular) para mantener el cuerpo hidratado y ayudar a reducir la inflamaci�n   " +
                                                  "\n de las v�as respiratorias. Adem�s del agua pura, se recomienda el consumo de infusiones de hierbas, como t� de jengibre  " +
                                                  "\n o manzanilla, que pueden ayudar a reducir la inflamaci�n y mejorar la respiraci�n. Tambi�n es beneficioso ingerir jugos  " +
                                                  "\n naturales sin az�car, que aportan antioxidantes y vitaminas esenciales para la funci�n pulmonar. POSIBLE TRATAMIENTO:    " +
                                                  "\n La EPOC se trata con broncodilatadores, como salbutamol, tiotropio o formoterol, adem�s de corticosteroides inhalados,   " +
                                                  "\n como fluticasona o budesonida. En casos graves, se puede requerir ox�geno suplementario y rehabilitaci�n pulmonar, que   " +
                                                  "\n incluye t�cnicas de respiraci�n y ejercicios para mejorar la capacidad pulmonar. Tambi�n se recomienda el uso de         " +
                                                  "\n antibi�ticos en caso de infecciones respiratorias secundarias y terapia de eliminaci�n de secreciones, como drenaje      " +
                                                  "\n postural y fisioterapia respiratoria. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el     " +
                                                  "\n sistema respiratorio y reducir la inflamaci�n, tales como pescados grasos (salm�n, at�n), ricos en �cidos grasos Omega-3," +
                                                  "\n que poseen propiedades antiinflamatorias, aportando 50% de la ingesta diaria recomendada de Omega-3. frutas y verduras de" +
                                                  "\n colores vivos (ar�ndanos, fresas, espinacas, br�coli), ricas en antioxidantes como la vitamina C y carotenoides, que     " +
                                                  "\n pueden proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico, aportando 70% de la ingesta diaria recomendada" +
                                                  "\n de vitamina C. jengibre, que contiene compuestos con efectos antiinflamatorios que podr�an ser beneficiosos para las v�as" +
                                                  "\n respiratorias, aportando 5% de la ingesta diaria recomendada de vitamina C. c�rcuma, con su componente activo, la curcumina," +
                                                  "\n que tiene potentes propiedades antiinflamatorias y antioxidantes, proporcionando 3% de la ingesta diaria recomendada de   " +
                                                  "\n antioxidantes. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un     " +
                                                  "\n diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Angel L Montes agradece tu visita a la app   " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n En adultos mayores, la clamidia puede causar s�ntomas prolongados y complicaciones si no se trata adecuadamente.       " +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas suaves y ejercicios de movilidad para mejorar la    " +
                                                  "\n circulaci�n y reducir la fatiga. Tambi�n es recomendable realizar ejercicios de relajaci�n y respiraci�n para reducir  " +
                                                  "\n el estr�s, ya que este puede afectar la respuesta inmunol�gica y prolongar la infecci�n. HIDRATACI�N: Es esencial el   " +
                                                  "\n consumo diario de 2.5 a 2.75 litros de agua (ocho a diez vasos de agua de tama�o regular) para mantener el cuerpo      " +
                                                  "\n hidratado y ayudar a reducir la inflamaci�n. Adem�s del agua pura, se recomienda el consumo de jugos naturales ricos en    " +
                                                  "\n vitamina C, como jugo de naranja o toronja, que pueden fortalecer el sistema inmunol�gico. Tambi�n es beneficioso ingerir  " +
                                                  "\n caldos ligeros, que aportan l�quidos y minerales esenciales para la recuperaci�n. POSIBLE TRATAMIENTO: La clamidia se trata" +
                                                  "\n con antibi�ticos, como azitromicina o doxiciclina, administrados en un r�gimen de varios d�as. En casos m�s severos, se    " +
                                                  "\n puede requerir tratamiento prolongado con antibi�ticos adicionales, como levofloxacino o eritromicina, dependiendo de la   " +
                                                  "\n resistencia bacteriana. Tambi�n se recomienda el uso de probi�ticos para restaurar la flora intestinal y mejorar la        " +
                                                  "\n recuperaci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmunol�gico y        " +
                                                  "\n reducir la inflamaci�n, tales como ar�ndanos, ricos en antioxidantes y vitamina C, aportando 25% de la ingesta diaria      " +
                                                  "\n recomendada. espinacas, que contienen hierro y vitamina A, esenciales para la recuperaci�n, proporcionando 15% de la       " + 
                                                  "\n ingesta diaria recomendada de hierro. jengibre, con propiedades antiinflamatorias y antioxidantes, aportando 5% de la      " +
                                                  "\n ingesta diaria recomendada de vitamina C. c�rcuma, con curcumina, que tiene propiedades antiinflamatorias y antioxidantes, " +
                                                  "\n proporcionando 3% de la ingesta diaria recomendada de antioxidantes. yogur natural, que contiene probi�ticos beneficiosos  " +
                                                  "\n para la flora intestinal, proporcionando 15% de la ingesta diaria recomendada de calcio. Este es solo un diagn�stico       " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer" +
                                                  "\n el tratamiento adecuado. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n En adultos mayores, la meningitis bacteriana puede ser grave y requiere atenci�n m�dica inmediata.           " +
                                                  "\n HIDRATACI�N: Es esencial que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente ocho   " +
                                                  "\n a diez vasos de tama�o regular) para mantener una adecuada funci�n cerebral y evitar la deshidrataci�n, que  " +
                                                  "\n puede agravar los s�ntomas neurol�gicos. La hidrataci�n es clave para mantener el equilibrio de electrolitos " +
                                                  "\n y mejorar la funci�n cognitiva, reduciendo el riesgo de complicaciones neurol�gicas. Adem�s, el agua ayuda a     " +
                                                  "\n regular la temperatura corporal y a prevenir la acumulaci�n de toxinas que pueden afectar el sistema nervioso.   " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser m�nima y adaptada, como ejercicios de respiraci�n y movilidad pasiva,    " +
                                                  "\n evitando esfuerzos excesivos que puedan comprometer la recuperaci�n. Movilizar el cuerpo de manera controlada    " +
                                                  "\n ayuda a prevenir la rigidez muscular y mejora la circulaci�n, lo que favorece la recuperaci�n. Tambi�n es recomendable  " +
                                                  "\n realizar ejercicios de estiramiento suaves para evitar la p�rdida de movilidad y mejorar la oxigenaci�n de los tejidos. " +
                                                  "\n POSIBLE TRATAMIENTO: Para la meningitis bacteriana en adultos mayores, el tratamiento suele incluir antibi�ticos       " +
                                                  "\n intravenosos como ceftriaxona o vancomicina, dependiendo del agente causal. Tambi�n se recomienda el uso de            " +
                                                  "\n corticosteroides para reducir la inflamaci�n cerebral y en algunos casos, soporte respiratorio. ALIMENTACI�N:          " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema        " +
                                                  "\n inmune y mejorar la recuperaci�n, tales como Frutas c�tricas (naranjas, limones, vitamina C, fortalece el sistema      " +
                                                  "\n inmune y mejora la absorci�n de hierro), Espinacas (vitamina A y C, esenciales para la salud celular y la respuesta    " +
                                                  "\n inmune), Almendras (vitamina E, ayuda a reducir la inflamaci�n y proteger las c�lulas), Yogur natural (probi�ticos,    " +
                                                  "\n mejora la salud intestinal y fortalece el sistema inmune), Pescados grasos (salm�n, Omega-3, ayuda a reducir la        " +
                                                  "\n inflamaci�n y mejorar la funci�n celular). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado       " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda        " +
                                                  "\n realizar m�s de un Diagn�stico de Mi Vida para mayor seguridad en el tratamiento. Adem�s, por su salud, si la respuesta" +
                                                  "\n del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n En adultos mayores, el c�ncer requiere un enfoque integral para mejorar la calidad de vida y el tratamiento.                 " +
                                                  "\n HIDRATACI�N: Es recomendable que el paciente consuma entre 2 y 2.5 litros de agua al d�a (aproximadamente ocho a diez vasos     " +
                                                  "\n de tama�o regular) para mantener una adecuada funci�n renal y evitar la deshidrataci�n, que puede afectar la tolerancia a los   " +
                                                  "\n tratamientos oncol�gicos. La hidrataci�n tambi�n ayuda a reducir la fatiga y mejorar la funci�n celular, lo que es crucial      " +
                                                  "\n para la recuperaci�n. Adem�s, el agua facilita la eliminaci�n de toxinas generadas por los tratamientos y mejora la absorci�n   " +
                                                  "\n de nutrientes esenciales para la regeneraci�n celular. EJERCICIO: La actividad f�sica debe ser moderada y adaptada, como        " +
                                                  "\n caminatas de 30 minutos diarios, ejercicios de bajo impacto como yoga o nataci�n, siempre bajo supervisi�n m�dica para evitar   " +
                                                  "\n fatiga extrema. El ejercicio mejora la circulaci�n, fortalece los m�sculos y ayuda a reducir los efectos secundarios del        " +
                                                  "\n tratamiento, como la fatiga y la p�rdida de masa muscular. Tambi�n se recomienda la pr�ctica de ejercicios de resistencia para  " +
                                                  "\n mantener la fuerza muscular y mejorar la movilidad. POSIBLE TRATAMIENTO: Para el c�ncer en adultos mayores, el tratamiento suele     " +
                                                  "\n incluir quimioterapia, radioterapia o inmunoterapia, dependiendo del tipo y estadio del c�ncer. Tambi�n se recomienda un enfoque     " +
                                                  "\n multidisciplinario con apoyo nutricional y psicol�gico. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes,  " +
                                                  "\n prote�nas y nutrientes esenciales para fortalecer el sistema inmune y mejorar la recuperaci�n, tales como Frutas c�tricas (naranjas, " +
                                                  "\n limones, vitamina C, fortalece el sistema inmune y mejora la absorci�n de hierro), Espinacas (vitamina A y C, esenciales para la     " +
                                                  "\n salud celular y la respuesta inmune), Almendras (vitamina E, ayuda a reducir la inflamaci�n y proteger las c�lulas), Yogur natural   " +
                                                  "\n (probi�ticos, mejora la salud intestinal y fortalece el sistema inmune), Pescados grasos (salm�n, Omega-3, ayuda a reducir la        " +
                                                  "\n inflamaci�n y mejorar la funci�n celular). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al     " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un Diagn�stico de    " +
                                                  "\n Mi Vida para mayor seguridad en el tratamiento. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se   " +
                                                  "\n recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        
                        }
                 }
            }
        if (EdadMasculino.equals("Ancianidad = 75 a�os o mas")) {
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