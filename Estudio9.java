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
         private final String edadEsperada = "Adolescencia = 10-21 a�os";
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
                 if(EdadFemenino.equals("Adolescencia = 10-21 a�os")){
                        if(EstaturaFemenino.equals("0.80-1.35 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe). " +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica moderada a intensa diariamente, con una duraci�n      " +
                                                  "\n aproximada de 60 minutos, aunque esta cantidad puede ajustarse seg�n su condici�n. Actividades como caminatas, ejercicios    " +
                                                  "\n aer�bicos, nataci�n y deportes de bajo impacto pueden ser beneficiosos para fortalecer su sistema inmunol�gico y mejorar     " +
                                                  "\n la recuperaci�n. HIDRATACI�N: Es fundamental el consumo diario de 2 litros de agua (ocho vasos de tama�o regular) para       " +
                                                  "\n mantener una hidrataci�n adecuada y ayudar al cuerpo a combatir la enfermedad. Tambi�n se recomienda el consumo de           " +
                                                  "\n infusiones calientes como t� de jengibre o manzanilla para aliviar los s�ntomas respiratorios. POSIBLE TRATAMIENTO: Para     " +
                                                  "\n la gripe en adolescentes, el tratamiento suele incluir medicamentos para reducir la fiebre y aliviar los s�ntomas, como      " +
                                                  "\n el paracetamol (Tempra) o el ibuprofeno. En casos espec�ficos, se pueden utilizar antivirales como el oseltamivir (Tamiflu). " +
                                                  "\n ALIMENTACI�N: Es recomendable el consumo de frutas y verduras que fortalezcan el sistema inmune, tales como: Naranjas,       " +
                                                  "\n ricas en vitamina C (aportan aproximadamente el 89% del requerimiento diario por cada 100 g), que ayuda a fortalecer el      " +
                                                  "\n sistema inmunol�gico y reducir la duraci�n de los s�ntomas. Fresas, con antioxidantes y vitamina C (aportan cerca del 98%    " +
                                                  "\n del requerimiento diario por cada 100 g), esenciales para la protecci�n celular y la recuperaci�n del organismo. Pl�tanos,   " +
                                                  "\n ricos en potasio (aportan alrededor del 10% del requerimiento diario por cada 100 g), que ayuda a reemplazar los             " +
                                                  "\n electrolitos perdidos por fiebre y sudoraci�n. Kiwi, con vitamina C (aproximadamente el 93% del requerimiento diario por     " +
                                                  "\n cada 100 g) y potasio, que contribuyen a la funci�n inmunol�gica y la recuperaci�n del cuerpo. Este es solo un diagn�stico   " +
                                                  "\n predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas   " +
                                                  "\n sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar m�s de un diagn�stico y consultar    " +
                                                  "\n a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica de baja intensidad, evitando esfuerzos excesivos     " +
                                                  "\n y asegurando un descanso adecuado para la recuperaci�n. Actividades como caminatas suaves, ejercicios de respiraci�n y      " +
                                                  "\n yoga pueden ser beneficiosos para mantener el cuerpo activo sin comprometer la recuperaci�n. Tambi�n se recomienda          " +
                                                  "\n ejercicios de expansi�n tor�cica y fortalecimiento de los m�sculos respiratorios para mejorar la capacidad pulmonar.        " +
                                                  "\n HIDRATACI�N: Es fundamental el consumo diario de 2 litros de agua (ocho vasos de tama�o regular) para mantener una          " +
                                                  "\n hidrataci�n �ptima y ayudar a fluidificar las secreciones pulmonares. Tambi�n se recomienda el consumo de caldos y sopas    " +
                                                  "\n calientes para facilitar la digesti�n y evitar irritaciones en el tracto respiratorio. POSIBLE TRATAMIENTO: Para la neumon�a " +
                                                  "\n en adolescentes, el tratamiento suele incluir antibi�ticos como la amoxicilina o azitromicina en caso de infecciones         " +
                                                  "\n bacterianas, adem�s de medicamentos para reducir la fiebre y aliviar los s�ntomas, como el paracetamol. En casos graves,     " +
                                                  "\n puede requerirse hospitalizaci�n y oxigenoterapia. ALIMENTACI�N: Es recomendable el consumo de alimentos que fortalezcan     " +
                                                  "\n el sistema inmune y ayuden a la recuperaci�n, tales como: Naranjas, ricas en vitamina C (aportan aproximadamente el 89%      " +
                                                  "\n del requerimiento diario por cada 100 g), que ayuda a fortalecer el sistema inmunol�gico y reducir la duraci�n de los        " +
                                                  "\n s�ntomas. Espinacas, con hierro (aproximadamente el 15% del requerimiento diario por cada 100 g), que contribuye a la        " +
                                                  "\n producci�n de gl�bulos rojos y mejora la oxigenaci�n del cuerpo. Yogur, con probi�ticos que favorecen la salud intestinal    " +
                                                  "\n y fortalecen el sistema inmune. Tambi�n se recomienda el consumo de alimentos ricos en zinc para mejorar la respuesta inmune " +
                                                  "\n y acelerar la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que   " +
                                                  "\n el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado, se  " +
                                                  "\n recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y  " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica moderada diariamente, con una duraci�n              " +
                                                  "\n aproximada de 60 minutos, incluyendo ejercicios aer�bicos como caminar, correr o nadar, para mejorar la sensibilidad       " +
                                                  "\n a la insulina. Tambi�n se recomienda la pr�ctica de ejercicios de resistencia como el yoga o el entrenamiento ligero       " +
                                                  "\n con pesas para mejorar el metabolismo de la glucosa. HIDRATACI�N: Es fundamental el consumo diario de 2 litros de agua     " +
                                                  "\n (ocho vasos de tama�o regular) para ayudar a mantener niveles adecuados de glucosa en sangre y prevenir la                 " +
                                                  "\n deshidrataci�n. Tambi�n se recomienda el consumo de bebidas sin az�car como infusiones naturales o agua con lim�n.         " +
                                                  "\n POSIBLE TRATAMIENTO: Para la diabetes en adolescentes, el tratamiento suele incluir insulina en el caso de diabetes        " +
                                                  "\n tipo 1, mientras que en diabetes tipo 2 puede requerirse metformina y cambios en el estilo de vida. Es esencial el         " +
                                                  "\n monitoreo constante de la glucosa en sangre y el seguimiento m�dico. ALIMENTACI�N: Es recomendable el consumo de           " +
                                                  "\n alimentos que ayuden a regular los niveles de glucosa y fortalezcan el organismo, tales como: Avena, rica en fibra         " + 
                                                  "\n soluble (aproximadamente el 10% del requerimiento diario por cada 100 g), que ayuda a estabilizar los niveles de az�car    " +
                                                  "\n en sangre. Frutos secos, con grasas saludables y magnesio (aproximadamente el 15% del requerimiento diario por cada 100 g),  " +
                                                  "\n que contribuyen a la regulaci�n de la glucosa. Legumbres, con prote�nas vegetales y fibra (aproximadamente el 20% del        " +
                                                  "\n requerimiento diario por cada 100 g), que favorecen la saciedad y el control de la glucosa. Tambi�n se recomienda el         " +
                                                  "\n consumo de alimentos ricos en �cidos grasos Omega-3 para mejorar la funci�n metab�lica y reducir la inflamaci�n. Este        " +
                                                  "\n es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad  " +
                                                  "\n ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar m�s de un   " +
                                                  "\n diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para mantener     " +
                                                  "\n las v�as respiratorias hidratadas y reducir la viscosidad de las secreciones, lo que facilita la respiraci�n. La               " +
                                                  "\n deshidrataci�n puede agravar los s�ntomas del asma, aumentando la irritaci�n de las v�as respiratorias y la frecuencia de      " +
                                                  "\n los episodios de tos. Es importante consumir l�quidos ricos en electrolitos, como sueros orales y caldos, para mantener el     " +
                                                  "\n equilibrio de minerales esenciales. Tambi�n se recomienda el consumo de infusiones suaves, como manzanilla o jengibre, que     " +
                                                  "\n pueden ayudar a reducir la inflamaci�n y mejorar la funci�n pulmonar. EJERCICIO: La actividad f�sica debe ser moderada y       " +
                                                  "\n adaptada, evitando esfuerzos excesivos que puedan desencadenar crisis asm�ticas, ejercicios como nataci�n, yoga y caminatas    " +
                                                  "\n suaves pueden ser beneficiosos para mejorar la capacidad pulmonar y reducir la inflamaci�n. POSIBLE TRATAMIENTO: El            " +
                                                  "\n tratamiento est�ndar para el asma en adolescentes incluye broncodilatadores de alivio r�pido como salbutamol, adem�s de        " +
                                                  "\n corticosteroides inhalados como fluticasona o budesonida, en M�xico algunas marcas reconocidas incluyen Ventolin (salbutamol)  " +
                                                  "\n y Pulmicort (budesonida), en casos m�s severos pueden utilizarse biol�gicos como omalizumab, bajo estricta supervisi�n m�dica. " +
                                                  "\n ALIMENTACI�N: Para fortalecer el sistema respiratorio y reducir la inflamaci�n, se recomienda el consumo de alimentos ricos    " +
                                                  "\n en omega-3, antioxidantes y vitamina C. Salm�n y ch�a: Contienen aproximadamente 2-4 g de omega-3 por cada 100 g, lo que ayuda " +
                                                  "\n a reducir la inflamaci�n de las v�as respiratorias. Fresas y ar�ndanos: Aportan 50-90 mg de vitamina C por cada 100 g,         " +
                                                  "\n cubriendo hasta el 100% de la ingesta diaria recomendada, fortaleciendo el sistema inmunol�gico. Jengibre y c�rcuma: Poseen    " +
                                                  "\n propiedades antiinflamatorias y antioxidantes, ayudando a reducir la irritaci�n de las v�as respiratorias. Este es solo un     " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las    " +
                                                  "\n respuestas sean completamente correctas, para mayor seguridad se recomienda realizar m�s de un diagn�stico y consultar a un    " +
                                                  "\n m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tama�o regular) para          " +
                                                  "\n mantener la hidrataci�n y reducir la fatiga, lo que es fundamental en el proceso de recuperaci�n. El VIH puede           " +
                                                  "\n provocar fiebre, sudoraci�n nocturna y diarrea, lo que aumenta el riesgo de deshidrataci�n. Es esencial consumir         " +
                                                  "\n l�quidos ricos en electrolitos, como sueros orales y caldos, para reponer los minerales perdidos. Tambi�n se             " +
                                                  "\n recomienda el consumo de agua con lim�n o infusiones suaves, que pueden ayudar a aliviar las n�useas y mejorar la        " +
                                                  "\n digesti�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada, evitando esfuerzos excesivos que puedan          " +
                                                  "\n debilitar el sistema inmunol�gico, ejercicios como yoga, caminatas suaves y nataci�n pueden ser beneficiosos para        " +
                                                  "\n mejorar la resistencia y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento para el VIH en adolescentes incluye      " +
                                                  "\n terapia antirretroviral (TAR) con medicamentos como tenofovir, emtricitabina y dolutegravir, en M�xico algunas marcas    " +
                                                  "\n reconocidas incluyen Truvada (tenofovir/emtricitabina) y Tivicay (dolutegravir), adem�s se recomienda el uso de terapias    " +
                                                  "\n complementarias como apoyo nutricional y psicol�gico para mejorar la calidad de vida del paciente. ALIMENTACI�N: Para       " +
                                                  "\n fortalecer el sistema inmunol�gico y apoyar la recuperaci�n, se recomienda el consumo de alimentos ricos en antioxidantes,  " +
                                                  "\n prote�nas y �cidos grasos esenciales. Br�coli y zanahorias: Contienen aproximadamente 50-80 mg de vitamina C por cada       " +
                                                  "\n 100 g, lo que representa hasta el 90% de la ingesta diaria recomendada, fortaleciendo el sistema inmunol�gico. Salm�n       " +
                                                  "\n y ch�a: Son fuentes de omega-3, proporcionando entre 2-4 g por cada 100 g, lo que ayuda a reducir la inflamaci�n y mejorar  " +
                                                  "\n la funci�n celular. Frutas y verduras de colores vivos: Como ar�ndanos y espinacas, que son ricas en antioxidantes y ayudan   " +
                                                  "\n a proteger las c�lulas del da�o. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%   " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se recomienda  " +
                                                  "\n realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida)  " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para        " +
                                                  "\n mantener la hidrataci�n y ayudar a reducir la inflamaci�n, lo que es fundamental en el proceso de recuperaci�n.          " +
                                                  "\n La gonorrea puede provocar fiebre, dolor abdominal y secreci�n anormal, lo que aumenta el riesgo de deshidrataci�n.      " +
                                                  "\n Es esencial consumir l�quidos ricos en electrolitos, como sueros orales y caldos, para reponer los minerales perdidos.   " +
                                                  "\n Tambi�n se recomienda el consumo de infusiones suaves, como manzanilla o jengibre, que pueden ayudar a aliviar las       " +
                                                  "\n molestias digestivas y mejorar la absorci�n de nutrientes. EJERCICIO: La actividad f�sica debe ser muy ligera y          " +
                                                  "\n supervisada, evitando esfuerzos excesivos que puedan agravar los s�ntomas, ejercicios de respiraci�n profunda y          " +
                                                  "\n movilidad suave pueden ser beneficiosos para mejorar la circulaci�n y reducir la fatiga. POSIBLE TRATAMIENTO: El         " +
                                                  "\n tratamiento est�ndar para la gonorrea en adolescentes incluye antibi�ticos como ceftriaxona y azitromicina, administrados  " +
                                                  "\n en una sola dosis, en M�xico algunas marcas reconocidas incluyen Rocephin (ceftriaxona) y Zithromax (azitromicina),        " +
                                                  "\n adem�s se recomienda reposo absoluto y una dieta adecuada para mejorar la recuperaci�n. ALIMENTACI�N: Para fortalecer      " +
                                                  "\n el sistema inmunol�gico y apoyar la recuperaci�n, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes " +
                                                  "\n y prote�nas. Naranjas y fresas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa hasta   " +
                                                  "\n el 100% de la ingesta diaria recomendada, fortaleciendo el sistema inmunol�gico y ayudando a reducir la inflamaci�n.       " +
                                                  "\n Espinacas y lentejas: Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25% y 40% de la ingesta      " +
                                                  "\n diaria recomendada, lo que ayuda a mejorar la oxigenaci�n celular y reducir el cansancio. Carnes magras y huevos: Son una  " +
                                                  "\n fuente importante de prote�nas, proporcionando entre 20 y 25 g por cada 100 g, lo que equivale al 40-50% de la recomendaci�n  " +
                                                  "\n diaria, esenciales para la regeneraci�n celular y el fortalecimiento muscular. Este es solo un diagn�stico predeterminado     " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente" +
                                                  "\n correctas, para mayor seguridad se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: Mantener una hidrataci�n adecuada es esencial para fortalecer el sistema inmunol�gico y reducir la        " +
                                                  "\n inflamaci�n causada por el virus. Se recomienda el consumo diario de 1.5 a 2 litros de agua, adem�s de infusiones      " +
                                                  "\n de manzanilla y jengibre, que poseen propiedades antiinflamatorias y pueden ayudar a aliviar el malestar.              " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser moderada y enfocada en fortalecer el sistema inmunol�gico. Se recomienda       " +
                                                  "\n realizar ejercicios de bajo impacto, como yoga y caminatas suaves, que ayudan a reducir el estr�s, un factor que       " +
                                                  "\n puede desencadenar brotes del virus. POSIBLE TRATAMIENTO: El tratamiento para el herpes genital incluye antivirales    " +
                                                  "\n como aciclovir y valaciclovir, que ayudan a reducir la duraci�n y gravedad de los s�ntomas. En M�xico, estos           " +
                                                  "\n medicamentos est�n disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACI�N: Tambi�n es            " +
                                                  "\n recomendable el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n,        " +
                                                  "\n tales como frutas c�tricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunol�gico.  " +
                                                  "\n Verduras de hoja verde (espinacas, acelgas, br�coli), contienen antioxidantes y hierro, esenciales para la salud       " +
                                                  "\n celular. Pescados grasos (salm�n, at�n), ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos (almendras, " +
                                                  "\n nueces), aportan vitamina E, que ayuda a la regeneraci�n celular. Yogur natural, fuente de probi�ticos, que favorecen  " +
                                                  "\n la salud intestinal y el sistema inmunol�gico. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado   " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para    " +
                                                  "\n ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado " +
                                                  "\n del paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a  " +
                                                  "\n su m�dico. �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: La hidrataci�n es clave para ayudar al cuerpo a eliminar toxinas y fortalecer el sistema inmunol�gico.       " +
                                                  "\n Se recomienda el consumo diario de 1.5 a 2 litros de agua, adem�s de infusiones de equin�cea y jengibre, que pueden       " +
                                                  "\n ayudar a mejorar la respuesta inmunol�gica. EJERCICIO: La actividad f�sica debe ser moderada y enfocada en mejorar        " +
                                                  "\n la circulaci�n sangu�nea. Se recomienda realizar ejercicios aer�bicos suaves, como caminatas y bicicleta est�tica,        " +
                                                  "\n que ayudan a mejorar la oxigenaci�n celular y la recuperaci�n del cuerpo. POSIBLE TRATAMIENTO: El tratamiento para        " +
                                                  "\n la s�filis incluye penicilina benzatina, que es el medicamento de primera l�nea. En M�xico, estos medicamentos est�n      " +
                                                  "\n disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACI�N: Tambi�n es recomendable el consumo de       " +
                                                  "\n alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como frutas c�tricas (naranjas," +
                                                  "\n limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunol�gico. Verduras de hoja verde (espinacas,     " +
                                                  "\n acelgas, br�coli), contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos (salm�n, at�n), " +
                                                  "\n ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos (almendras, nueces), aportan vitamina E, que ayuda   " +
                                                  "\n a la regeneraci�n celular. Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal y el sistema        " +
                                                  "\n inmunol�gico. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el        " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar   " +
                                                  "\n m�s de un Diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s,      " +
                                                  "\n por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel     " +
                                                  "\n L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACI�N: La hidrataci�n es fundamental para mantener la salud pulmonar y ayudar a eliminar toxinas del cuerpo.     " +
                                                  "\n Se recomienda el consumo diario de 2 a 2.5 litros de agua, adem�s de infusiones de tomillo y eucalipto, que pueden     " +
                                                  "\n ayudar a mejorar la funci�n respiratoria. EJERCICIO: La actividad f�sica debe ser moderada y enfocada en mejorar       " +
                                                  "\n la capacidad pulmonar. Se recomienda realizar ejercicios de respiraci�n profunda, como respiraci�n diafragm�tica       " +
                                                  "\n y con labios fruncidos, que ayudan a mejorar la oxigenaci�n. Tambi�n es beneficioso practicar caminatas suaves,        " +
                                                  "\n evitando ambientes fr�os o contaminados. POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis incluye antibi�ticos " +
                                                  "\n como isoniazida, rifampicina y etambutol, que deben tomarse durante un per�odo prolongado para garantizar la           " +
                                                  "\n eliminaci�n de la bacteria. En M�xico, estos medicamentos est�n disponibles en instituciones de salud como el          " +
                                                  "\n IMSS y el Insabi. ALIMENTACI�N: Tambi�n es recomendable el consumo de alimentos que fortalezcan el sistema inmunol�gico" +
                                                  "\n y ayuden a reducir la inflamaci�n, tales como frutas c�tricas (naranjas, limones, toronjas), ricas en vitamina C,      " +
                                                  "\n que fortalece el sistema inmunol�gico. Verduras de hoja verde (espinacas, acelgas, br�coli), contienen antioxidantes   " +
                                                  "\n y hierro, esenciales para la salud celular. Pescados grasos (salm�n, at�n), ricos en Omega-3, con propiedades          " +
                                                  "\n antiinflamatorias. Frutos secos (almendras, nueces), aportan vitamina E, que ayuda a la regeneraci�n celular.          " +
                                                  "\n Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico. Este es solo        " +
                                                  "\n un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad    " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida " +
                                                  "\n para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud, si la respuesta del     " +
                                                  "\n diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece tu visita a la app " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis. " +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica moderada y adaptada a su condici�n, evitando       " +
                                                  "\n ejercicios de alto impacto que puedan afectar sus articulaciones. Se sugiere ejercicios de bajo impacto como nataci�n,    " +
                                                  "\n yoga o caminatas suaves, que ayudan a mejorar la movilidad sin generar estr�s en las articulaciones. HIDRATACI�N: Se      " +
                                                  "\n recomienda el consumo diario de 2 a 2.5 litros de agua al d�a (ocho a diez vasos de tama�o regular) para mantener una     " +
                                                  "\n adecuada hidrataci�n y ayudar a reducir la inflamaci�n en las articulaciones. Tambi�n es beneficioso el consumo de        " +
                                                  "\n infusiones de c�rcuma y jengibre, que poseen propiedades antiinflamatorias naturales. POSIBLE TRATAMIENTO: Para la        " +
                                                  "\n artritis juvenil, el tratamiento suele incluir antiinflamatorios no esteroides (AINEs) como ibuprofeno o naproxeno,       " +
                                                  "\n adem�s de f�rmacos modificadores de la enfermedad como metotrexato en casos m�s severos. Tambi�n pueden utilizarse        " +
                                                  "\n terapias biol�gicas bajo supervisi�n m�dica. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a reducir     " +
                                                  "\n la inflamaci�n y fortalecer las articulaciones, tales como Pescados grasos (salm�n, at�n): ricos en �cidos grasos Omega-3," +
                                                  "\n que poseen propiedades antiinflamatorias. Frutas y verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli):     " +
                                                  "\n ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las c�lulas del da�o y fortalecer el        " +
                                                  "\n sistema inmunol�gico. Jengibre: contiene compuestos con efectos antiinflamatorios que podr�an ser beneficiosos para       " +
                                                  "\n las articulaciones. C�rcuma: con su componente activo, la curcumina, tambi�n tiene potentes propiedades antiinflamatorias " +
                                                  "\n y antioxidantes. Semillas de ch�a y linaza: ricas en Omega-3 y fibra, que ayudan a reducir la inflamaci�n. Este es solo   " +
                                                  "\n un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni    " +
                                                  "\n que las respuestas sean completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el  " +
                                                  "\n tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda " +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica ligera, evitando esfuerzos excesivos         " +
                                                  "\n que puedan agravar la tos y la dificultad respiratoria. Se sugiere ejercicios de respiraci�n, caminatas             " +
                                                  "\n suaves y estiramientos para mejorar la capacidad pulmonar. HIDRATACI�N: Debido a la tos persistente y la            " +
                                                  "\n posible deshidrataci�n causada por la tosferina, se recomienda el consumo diario de 2 a 2.5 litros de agua          " +
                                                  "\n al d�a (ocho a diez vasos de tama�o regular). Tambi�n es beneficioso el consumo de infusiones de miel y jengibre,   " +
                                                  "\n que pueden ayudar a calmar la garganta y reducir la inflamaci�n. POSIBLE TRATAMIENTO: Para la tosferina en          " +
                                                  "\n adolescentes, el tratamiento suele incluir antibi�ticos como azitromicina, claritromicina o eritromicina,           " +
                                                  "\n administrados bajo supervisi�n m�dica. Tambi�n se recomienda el uso de humidificadores para aliviar la irritaci�n   " +
                                                  "\n de las v�as respiratorias. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema   " +
                                                  "\n respiratorio y aliviar los s�ntomas, tales como Miel: ayuda a calmar la garganta y tiene propiedades antimicrobianas. " +
                                                  "\n Jengibre: con propiedades antiinflamatorias que pueden aliviar la tos y mejorar la respuesta inmune. Frutas c�tricas  " +
                                                  "\n (naranjas, limones, toronjas): ricas en vitamina C, que ayuda a mejorar la respuesta inmunol�gica. Caldo de pollo:    " +
                                                  "\n fuente de electrolitos y nutrientes esenciales para la recuperaci�n. Ajo: contiene alicina, un compuesto con          " +
                                                  "\n propiedades antimicrobianas que pueden ayudar a combatir infecciones. Este es solo un diagn�stico predeterminado      " +
                                                  "\n l�gico. Haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean      " +
                                                  "\n completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento          " +
                                                  "\n adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar     " +
                                                  "\n a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica ligera, evitando esfuerzos excesivos que       " +
                                                  "\n puedan agravar la inflamaci�n de las gl�ndulas salivales. Se sugiere ejercicios de relajaci�n y estiramientos         " +
                                                  "\n suaves. HIDRATACI�N: Debido a la fiebre y la inflamaci�n de las gl�ndulas salivales, se recomienda el consumo         " +
                                                  "\n diario de 2 a 2.5 litros de agua al d�a (ocho a diez vasos de tama�o regular). Tambi�n es beneficioso el consumo      " +
                                                  "\n de infusiones de manzanilla, que pueden ayudar a reducir la inflamaci�n, y agua de coco, que aporta electrolitos      " +
                                                  "\n esenciales. POSIBLE TRATAMIENTO: Para las paperas en adolescentes, no existe un tratamiento espec�fico, ya que es     " +
                                                  "\n una enfermedad viral autolimitada. Se recomienda reposo, hidrataci�n y control de fiebre con paracetamol (Tempra)     " +
                                                  "\n o ibuprofeno. En casos graves, puede requerirse hospitalizaci�n con administraci�n de l�quidos intravenosos.          " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a reducir la inflamaci�n y fortalecer el sistema       " +
                                                  "\n inmune, tales como Frutas c�tricas (naranjas, limones, toronjas): ricas en vitamina C, que ayuda a mejorar la         " +
                                                  "\n respuesta inmunol�gica. Papaya: contiene vitamina C y flavonoides que pueden ayudar a reducir la inflamaci�n.         " +
                                                  "\n Jengibre: con propiedades antiinflamatorias que pueden aliviar la fatiga y mejorar la respuesta inmune. Miel: ayuda   " +
                                                  "\n a calmar la garganta y tiene propiedades antimicrobianas. Caldo de vegetales: fuente de electrolitos y nutrientes     " +
                                                  "\n esenciales para la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza   " +
                                                  "\n al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda       " +
                                                  "\n realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta " +
                                                  "\n del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica de baja intensidad, evitando esfuerzos          " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperaci�n. Actividades como caminatas suaves, ejercicios        " +
                                                  "\n de respiraci�n y yoga pueden ser beneficiosos para mantener el cuerpo activo sin comprometer la recuperaci�n.          " +
                                                  "\n Tambi�n se recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez muscular causada        " +
                                                  "\n por el reposo prolongado. HIDRATACI�N: Es fundamental el consumo diario de 2 litros de agua (ocho vasos de tama�o      " +
                                                  "\n regular) para mantener una hidrataci�n �ptima y ayudar a aliviar los s�ntomas. Tambi�n se recomienda el consumo de     " +
                                                  "\n infusiones con propiedades antiinflamatorias como el t� de jengibre o manzanilla. POSIBLE TRATAMIENTO: No existe un    " +
                                                  "\n tratamiento espec�fico para el virus del Zika, por lo que se recomienda reposo, hidrataci�n abundante y el uso de      " +
                                                  "\n analg�sicos como el paracetamol para aliviar los s�ntomas. Tambi�n es importante evitar la exposici�n a mosquitos      " +
                                                  "\n para prevenir la propagaci�n del virus. ALIMENTACI�N: Es recomendable el consumo de alimentos que ayuden a fortalecer  " +
                                                  "\n el sistema inmune y mejorar la recuperaci�n, tales como: Naranjas, ricas en vitamina C (aproximadamente el 89% del     " +
                                                  "\n requerimiento diario por cada 100 g), que ayuda a fortalecer el sistema inmunol�gico y reducir la duraci�n de los      " +
                                                  "\n s�ntomas. Espinacas, con hierro (aproximadamente el 15% del requerimiento diario por cada 100 g), que contribuye a la  " +
                                                  "\n producci�n de gl�bulos rojos y mejora la oxigenaci�n del cuerpo. Yogur, con probi�ticos que favorecen la salud intestinal " +
                                                  "\n y fortalecen el sistema inmune. Tambi�n se recomienda el consumo de alimentos ricos en zinc para mejorar la respuesta     " +
                                                  "\n inmune y acelerar la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza     " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento" +
                                                  "\n adecuado, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus. " +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica de baja intensidad, evitando esfuerzos        " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperaci�n. Actividades como caminatas suaves, juegos          " +
                                                  "\n tranquilos y ejercicios de respiraci�n pueden ser beneficiosos para mantener el cuerpo activo sin comprometer        " +
                                                  "\n la recuperaci�n. Tambi�n se recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez      " +
                                                  "\n muscular causada por el reposo prolongado. HIDRATACI�N: Es fundamental el consumo diario de 2 a 2.5 litros de        " +
                                                  "\n agua (ocho a diez vasos de tama�o regular) para prevenir la deshidrataci�n causada por la diarrea y ayudar a la      " +
                                                  "\n recuperaci�n del organismo. Adem�s, se recomienda el consumo de sueros de rehidrataci�n oral para reponer los        " +
                                                  "\n electrolitos perdidos. POSIBLE TRATAMIENTO: Para el rotavirus en adolescentes, el tratamiento suele enfocarse en     " +
                                                  "\n la rehidrataci�n y el manejo de los s�ntomas. Se recomienda el consumo de l�quidos abundantes, sueros de rehidrataci�n " +
                                                  "\n y el uso de medicamentos para aliviar la fiebre y el malestar general. ALIMENTACI�N: Es recomendable el consumo        " +
                                                  "\n de alimentos que ayuden a la recuperaci�n intestinal y fortalezcan el sistema inmune, tales como: Pl�tanos, ricos      " +
                                                  "\n en potasio (aproximadamente el 10% del requerimiento diario por cada 100 g), que ayudan a reponer electrolitos perdidos" +
                                                  "\n por la diarrea. Zanahorias, con vitamina A (aproximadamente el 334% del requerimiento diario por cada 100 g), que     " +
                                                  "\n contribuye a la regeneraci�n de la mucosa intestinal. Yogur, con probi�ticos que favorecen la salud intestinal y      " +
                                                  "\n fortalecen el sistema inmune. Tambi�n se recomienda el consumo de caldos y sopas suaves para facilitar la digesti�n   " +
                                                  "\n y evitar irritaciones en el tracto intestinal. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad " +
                                                  "\n en el tratamiento adecuado, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica moderada, evitando esfuerzos excesivos y            " +
                                                  "\n asegurando una recuperaci�n adecuada. Ejercicios como caminatas suaves, estiramientos y yoga pueden ser beneficiosos       " +
                                                  "\n para mantener el cuerpo activo sin comprometer el tratamiento. Tambi�n se recomienda ejercicios de relajaci�n y            " +
                                                  "\n respiraci�n profunda para reducir el estr�s y mejorar la respuesta inmune. HIDRATACI�N: Es fundamental el consumo          " +
                                                  "\n diario de 2 litros de agua (ocho vasos de tama�o regular) para ayudar a eliminar toxinas y mantener el organismo en        " +
                                                  "\n equilibrio. Tambi�n se recomienda el consumo de jugos naturales ricos en antioxidantes para fortalecer el sistema          " +
                                                  "\n inmune. POSIBLE TRATAMIENTO: Para la listeriosis en adolescentes, el tratamiento suele incluir antibi�ticos como la        " +
                                                  "\n ampicilina o gentamicina, administrados bajo supervisi�n m�dica. Tambi�n es importante evitar el consumo de alimentos      " +
                                                  "\n contaminados y mantener una higiene adecuada. ALIMENTACI�N: Es recomendable el consumo de alimentos que ayuden a           " +
                                                  "\n fortalecer el sistema inmune y mejorar la recuperaci�n, tales como: Naranjas, ricas en vitamina C (aproximadamente el      " +
                                                  "\n 89% del requerimiento diario por cada 100 g), que ayuda a fortalecer el sistema inmunol�gico y reducir la duraci�n de      " +
                                                  "\n los s�ntomas. Espinacas, con hierro (aproximadamente el 15% del requerimiento diario por cada 100 g), que contribuye       " +
                                                  "\n a la producci�n de gl�bulos rojos y mejora la oxigenaci�n del cuerpo. Yogur, con probi�ticos que favorecen la salud        " +
                                                  "\n intestinal y fortalecen el sistema inmune. Tambi�n se recomienda el consumo de alimentos ricos en zinc para mejorar        " +
                                                  "\n la respuesta inmune y acelerar la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado      " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad      " +
                                                  "\n en el tratamiento adecuado, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece  " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica de baja intensidad, evitando esfuerzos         " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperaci�n. Actividades como caminatas suaves, juegos           " +
                                                  "\n tranquilos y ejercicios de respiraci�n pueden ser beneficiosos para mantener el cuerpo activo sin comprometer         " +
                                                  "\n la recuperaci�n. Tambi�n se recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez       " +
                                                  "\n muscular causada por el reposo prolongado. HIDRATACI�N: Es fundamental el consumo diario de 1.5 a 2 litros de agua    " +
                                                  "\n (seis a ocho vasos de tama�o regular) para prevenir la deshidrataci�n causada por la diarrea y ayudar a la            " +
                                                  "\n recuperaci�n del organismo. Adem�s, se recomienda el consumo de sueros de rehidrataci�n oral para reponer los         " +
                                                  "\n electrolitos perdidos. POSIBLE TRATAMIENTO: Para la shigelosis en adolescentes, el tratamiento suele incluir          " +
                                                  "\n antibi�ticos como la azitromicina o ciprofloxacino en casos graves, adem�s de medidas de rehidrataci�n oral para      " +
                                                  "\n evitar la deshidrataci�n. Tambi�n es importante mantener una higiene adecuada, lavarse las manos frecuentemente y     " +
                                                  "\n evitar el contacto con personas infectadas. ALIMENTACI�N: Es recomendable el consumo de alimentos que ayuden a la     " +
                                                  "\n recuperaci�n intestinal y fortalezcan el sistema inmune, tales como: Pl�tanos, ricos en potasio (aproximadamente el   " +
                                                  "\n 10% del requerimiento diario por cada 100 g), que ayudan a reponer electrolitos perdidos por la diarrea. Zanahorias,  " +
                                                  "\n con vitamina A (aproximadamente el 334% del requerimiento diario por cada 100 g), que contribuye a la regeneraci�n de " +
                                                  "\n la mucosa intestinal. Yogur, con probi�ticos que favorecen la salud intestinal y fortalecen el sistema inmune. Tambi�n" +
                                                  "\n se recomienda el consumo de caldos y sopas suaves para facilitar la digesti�n y evitar irritaciones en el tracto      " +
                                                  "\n intestinal. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente" +
                                                  "\n tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado, se       " +
                                                  "\n recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida)" +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica adaptada a su capacidad respiratoria,             " +
                                                  "\n evitando esfuerzos excesivos y asegurando una respiraci�n controlada. Ejercicios como caminatas suaves, nataci�n,        " +
                                                  "\n yoga y t�cnicas de respiraci�n pueden mejorar la funci�n pulmonar y reducir la fatiga. Tambi�n se recomienda             " +
                                                  "\n ejercicios de expansi�n tor�cica y fortalecimiento de los m�sculos respiratorios para mejorar la capacidad pulmonar.     " +
                                                  "\n Es importante realizar calentamiento previo y enfriamiento posterior para evitar crisis respiratorias. HIDRATACI�N:      " +
                                                  "\n Es fundamental el consumo diario de 1.7 a 2 litros de agua (siete a ocho vasos de tama�o regular) para mantener las      " +
                                                  "\n v�as respiratorias hidratadas y facilitar la eliminaci�n de secreciones. Tambi�n se recomienda el consumo de infusiones  " +
                                                  "\n con propiedades antiinflamatorias como el t� de jengibre o manzanilla. POSIBLE TRATAMIENTO: Para el EPOC en adolescentes," +
                                                  "\n el tratamiento suele incluir broncodilatadores como el salbutamol, corticosteroides inhalados como la fluticasona y, en  " +
                                                  "\n casos graves, oxigenoterapia. Tambi�n es importante evitar la exposici�n a contaminantes ambientales y humo de tabaco.   " +
                                                  "\n ALIMENTACI�N: Es recomendable el consumo de alimentos que ayuden a mejorar la funci�n pulmonar y fortalezcan el sistema  " +
                                                  "\n inmune, tales como: Pescados grasos (salm�n, at�n), ricos en �cidos grasos Omega-3 (aproximadamente el 50% del           " +
                                                  "\n requerimiento diario por cada 100 g), que poseen propiedades antiinflamatorias que pueden ayudar a reducir la inflamaci�n" +
                                                  "\n de las v�as respiratorias. Frutas y verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli), ricas en          " +
                                                  "\n antioxidantes como la vitamina C (aproximadamente el 90% del requerimiento diario por cada 100 g) y carotenoides,        " +
                                                  "\n que pueden proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico. Jengibre, contiene compuestos con         " +
                                                  "\n efectos antiinflamatorios que podr�an ser beneficiosos para las v�as respiratorias. C�rcuma, con su componente activo,   " +
                                                  "\n la curcumina, tambi�n tiene potentes propiedades antiinflamatorias y antioxidantes. Tambi�n se recomienda el consumo     " +
                                                  "\n de alimentos ricos en fibra para mejorar la digesti�n y evitar la inflamaci�n intestinal. Este es solo un diagn�stico    " +
                                                  "\n predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas" +
                                                  "\n sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar m�s de un diagn�stico y consultar" +
                                                  "\n a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica moderada, evitando esfuerzos excesivos y         " +
                                                  "\n asegurando una recuperaci�n adecuada. Ejercicios como caminatas suaves, estiramientos y yoga pueden ser beneficiosos    " +
                                                  "\n para mantener el cuerpo activo sin comprometer el tratamiento. Tambi�n se recomienda ejercicios de relajaci�n y         " +
                                                  "\n respiraci�n profunda para reducir el estr�s y mejorar la respuesta inmune. HIDRATACI�N: Es fundamental el consumo       " +
                                                  "\n diario de 1.5 a 2 litros de agua (seis a ocho vasos de tama�o regular) para ayudar a eliminar toxinas y mantener el     " +
                                                  "\n organismo en equilibrio. Tambi�n se recomienda el consumo de jugos naturales ricos en antioxidantes para fortalecer     " +
                                                  "\n el sistema inmune. POSIBLE TRATAMIENTO: Para la clamidia en adolescentes, el tratamiento suele incluir antibi�ticos     " +
                                                  "\n como la azitromicina o doxiciclina, administrados bajo supervisi�n m�dica. Tambi�n es importante evitar el contacto     " +
                                                  "\n con personas infectadas y mantener una higiene adecuada. ALIMENTACI�N: Es recomendable el consumo de alimentos que      " +
                                                  "\n ayuden a fortalecer el sistema inmune y mejorar la recuperaci�n, tales como: Naranjas, ricas en vitamina C              " +
                                                  "\n (aproximadamente el 89% del requerimiento diario por cada 100 g), que ayuda a fortalecer el sistema inmunol�gico y      " +
                                                  "\n reducir la duraci�n de los s�ntomas. Espinacas, con hierro (aproximadamente el 15% del requerimiento diario por cada    " +
                                                  "\n 100 g), que contribuye a la producci�n de gl�bulos rojos y mejora la oxigenaci�n del cuerpo. Yogur, con probi�ticos     " +
                                                  "\n que favorecen la salud intestinal y fortalecen el sistema inmune. Tambi�n se recomienda el consumo de alimentos ricos   " +
                                                  "\n en zinc para mejorar la respuesta inmune y acelerar la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico. " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas.     " +
                                                  "\n Para mayor seguridad en el tratamiento adecuado, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico.  " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular)            " +
                                                  "\n para mantener la hidrataci�n y ayudar a reducir la fiebre y los s�ntomas neurol�gicos, lo que es fundamental            " +
                                                  "\n en el proceso de recuperaci�n. La meningitis bacteriana puede provocar fiebre alta, v�mitos, rigidez en el cuello       " +
                                                  "\n y sensibilidad a la luz, lo que puede llevar a una mayor p�rdida de l�quidos. Es importante que el paciente consuma     " +
                                                  "\n l�quidos ricos en electrolitos, como sueros orales, caldos y jugos naturales sin az�car, para evitar la deshidrataci�n  " +
                                                  "\n y mantener el equilibrio de minerales esenciales. Tambi�n se recomienda el consumo de infusiones suaves, como           " +
                                                  "\n manzanilla o jengibre, que pueden ayudar a aliviar las n�useas y mejorar la digesti�n. EJERCICIO: La actividad f�sica   " +
                                                  "\n debe ser muy ligera y supervisada, evitando esfuerzos excesivos que puedan agravar los s�ntomas, ejercicios de          " +
                                                  "\n respiraci�n profunda y movilidad suave pueden ser beneficiosos para mejorar la capacidad pulmonar y la circulaci�n.     " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento est�ndar para la meningitis bacteriana en adolescentes incluye antibi�ticos como    " +
                                                  "\n ceftriaxona, ampicilina y vancomicina, administrados por v�a intravenosa durante 7 a 14 d�as, en M�xico algunas marcas  " +
                                                  "\n reconocidas incluyen Rocephin (ceftriaxona) y Amikin (amikacina), adem�s se recomienda el uso de corticosteroides como  " +
                                                  "\n dexametasona para reducir la inflamaci�n cerebral en casos graves. ALIMENTACI�N: Para fortalecer el sistema inmunol�gico " +
                                                  "\n y apoyar la recuperaci�n, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y prote�nas. Naranjas " +
                                                  "\n y fresas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa hasta el 100% de la ingesta " +
                                                  "\n diaria recomendada, fortaleciendo el sistema inmunol�gico y ayudando a reducir la inflamaci�n. Espinacas y lentejas:     " +
                                                  "\n Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25% y 40% de la ingesta diaria recomendada,      " +
                                                  "\n lo que ayuda a mejorar la oxigenaci�n celular y reducir el cansancio. Carnes magras y huevos: Son una fuente importante  " +
                                                  "\n de prote�nas, proporcionando entre 20 y 25 g por cada 100 g, lo que equivale al 40-50% de la recomendaci�n diaria,       " +
                                                  "\n esenciales para la regeneraci�n celular y el fortalecimiento muscular. Este es solo un diagn�stico predeterminado l�gico," +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente  " +
                                                  "\n correctas, para mayor seguridad se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes    " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer. " +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tama�o regular) para         " +
                                                  "\n mantener la hidrataci�n y ayudar a reducir los efectos secundarios del tratamiento, lo que es fundamental en el         " +
                                                  "\n proceso de recuperaci�n. Los adolescentes con c�ncer pueden experimentar v�mitos, diarrea y sudoraci�n excesiva,        " +
                                                  "\n lo que aumenta el riesgo de deshidrataci�n. Es esencial consumir l�quidos ricos en electrolitos, como sueros orales     " +
                                                  "\n y caldos, para reponer los minerales perdidos. Tambi�n se recomienda el consumo de agua con lim�n o infusiones suaves,  " +
                                                  "\n que pueden ayudar a aliviar las n�useas y mejorar la digesti�n. EJERCICIO: La actividad f�sica debe ser moderada y      " +
                                                  "\n adaptada, evitando esfuerzos excesivos que puedan debilitar el sistema inmunol�gico, ejercicios como yoga, caminatas    " +
                                                  "\n suaves y nataci�n pueden ser beneficiosos para mejorar la resistencia y reducir la fatiga. POSIBLE TRATAMIENTO: El      " +
                                                  "\n tratamiento para el c�ncer en adolescentes depende del tipo espec�fico de c�ncer, pero puede incluir quimioterapia,     " +
                                                  "\n radioterapia y cirug�a, en M�xico algunas marcas reconocidas incluyen Methotrexate (metotrexato) y Vincristine          " +
                                                  "\n (vincristina), adem�s se recomienda el uso de terapias complementarias como apoyo nutricional y psicol�gico para mejorar" +
                                                  "\n la calidad de vida del paciente. ALIMENTACI�N: Para fortalecer el sistema inmunol�gico y apoyar la recuperaci�n, se     " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes, prote�nas y �cidos grasos esenciales. Br�coli y zanahorias:  " +
                                                  "\n Contienen aproximadamente 50-80 mg de vitamina C por cada 100 g, lo que representa hasta el 90% de la ingesta diaria    " +
                                                  "\n recomendada, fortaleciendo el sistema inmunol�gico. Salm�n y ch�a: Son fuentes de omega-3, proporcionando entre 2-4 g   " +
                                                  "\n por cada 100 g, lo que ayuda a reducir la inflamaci�n y mejorar la funci�n celular. Frutas y verduras de colores vivos: " +
                                                  "\n Como ar�ndanos y espinacas, que son ricas en antioxidantes y ayudan a proteger las c�lulas del da�o. Este es solo un    " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que     " +
                                                  "\n las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar m�s de un diagn�stico y consultar  " +
                                                  "\n a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.35-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica moderada a intensa diariamente, con una            " +
                                                  "\n duraci�n aproximada de 60 minutos, aunque esta cantidad puede ajustarse seg�n su condici�n. Actividades como              " +
                                                  "\n caminatas, ejercicios aer�bicos, nataci�n y deportes de bajo impacto pueden ser beneficiosos para fortalecer su           " +
                                                  "\n sistema inmunol�gico y mejorar la recuperaci�n. Tambi�n se recomienda ejercicios de respiraci�n profunda y relajaci�n     " +
                                                  "\n para mejorar la oxigenaci�n y reducir el estr�s, lo que puede favorecer la recuperaci�n. HIDRATACI�N: Es fundamental      " +
                                                  "\n el consumo diario de 2 litros de agua (ocho vasos de tama�o regular) para mantener una hidrataci�n adecuada y ayudar al   " +
                                                  "\n cuerpo a combatir la enfermedad. Tambi�n se recomienda el consumo de infusiones calientes como t� de jengibre o manzanilla" +
                                                  "\n para aliviar los s�ntomas respiratorios. Adem�s, el consumo de caldos y sopas calientes puede ayudar a mantener la        " +
                                                  "\n hidrataci�n y proporcionar nutrientes esenciales para la recuperaci�n. POSIBLE TRATAMIENTO: Para la gripe en adolescentes,  " +
                                                  "\n el tratamiento suele incluir medicamentos para reducir la fiebre y aliviar los s�ntomas, como el paracetamol (Tempra) o el  " +
                                                  "\n ibuprofeno. En casos espec�ficos, se pueden utilizar antivirales como el oseltamivir (Tamiflu). Tambi�n es recomendable el  " +
                                                  "\n uso de humidificadores para mantener el aire h�medo y facilitar la respiraci�n. El descanso adecuado es clave para la       " +
                                                  "\n recuperaci�n, por lo que se recomienda dormir al menos 8 horas diarias y evitar actividades que puedan generar fatiga.      " +
                                                  "\n ALIMENTACI�N: Es recomendable el consumo de frutas y verduras que fortalezcan el sistema inmune, tales como: Naranjas, ricas" +
                                                  "\n en vitamina C (aportan aproximadamente el 89% del requerimiento diario por cada 100 g), que ayuda a fortalecer el sistema   " +
                                                  "\n inmunol�gico y reducir la duraci�n de los s�ntomas. Fresas, con antioxidantes y vitamina C (aportan cerca del 98% del       " +
                                                  "\n requerimiento diario por cada 100 g), esenciales para la protecci�n celular y la recuperaci�n del organismo. Pl�tanos, ricos" +
                                                  "\n en potasio (aportan alrededor del 10% del requerimiento diario por cada 100 g), que ayuda a reemplazar los electrolitos     " +
                                                  "\n perdidos por fiebre y sudoraci�n. Kiwi, con vitamina C (aproximadamente el 93% del requerimiento diario por cada 100 g)     " +
                                                  "\n y potasio, que contribuyen a la funci�n inmunol�gica y la recuperaci�n del cuerpo. Este es solo un diagn�stico predeterminado" +
                                                  "\n l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas." +
                                                  "\n Para mayor seguridad en el tratamiento adecuado, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico.     " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica de baja intensidad, evitando esfuerzos               " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperaci�n. Actividades como caminatas suaves, ejercicios             " +
                                                  "\n de respiraci�n y yoga pueden ser beneficiosos para mantener el cuerpo activo sin comprometer la recuperaci�n.               " +
                                                  "\n Tambi�n se recomienda ejercicios de expansi�n tor�cica y fortalecimiento de los m�sculos respiratorios para mejorar         " +
                                                  "\n la capacidad pulmonar. HIDRATACI�N: Es fundamental el consumo diario de 2 litros de agua (ocho vasos de tama�o regular)     " +
                                                  "\n para mantener una hidrataci�n �ptima y ayudar a fluidificar las secreciones pulmonares. Tambi�n se recomienda el consumo    " +
                                                  "\n de caldos y sopas calientes para facilitar la digesti�n y evitar irritaciones en el tracto respiratorio. Adem�s, el         " +
                                                  "\n consumo de jugos naturales sin az�car puede aportar vitaminas esenciales para fortalecer el sistema inmunol�gico.           " +
                                                  "\n POSIBLE TRATAMIENTO: Para la neumon�a en adolescentes, el tratamiento suele incluir antibi�ticos como la amoxicilina        " +
                                                  "\n o azitromicina en caso de infecciones bacterianas, adem�s de medicamentos para reducir la fiebre y aliviar los s�ntomas,    " +
                                                  "\n como el paracetamol. En casos graves, puede requerirse hospitalizaci�n y oxigenoterapia. Tambi�n es importante evitar la    " +
                                                  "\n exposici�n a contaminantes ambientales y humo de tabaco, ya que pueden agravar los s�ntomas. ALIMENTACI�N: Es recomendable  " +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmune y ayuden a la recuperaci�n, tales como: Naranjas, ricas en        " +
                                                  "\n vitamina C (aportan aproximadamente el 89% del requerimiento diario por cada 100 g), que ayuda a fortalecer el sistema      " +
                                                  "\n inmunol�gico y reducir la duraci�n de los s�ntomas. Espinacas, con hierro (aproximadamente el 15% del requerimiento diario  " +
                                                  "\n por cada 100 g), que contribuye a la producci�n de gl�bulos rojos y mejora la oxigenaci�n del cuerpo. Yogur, con probi�ticos  " +
                                                  "\n que favorecen la salud intestinal y fortalecen el sistema inmune. Tambi�n se recomienda el consumo de alimentos ricos en zinc " +
                                                  "\n para mejorar la respuesta inmune y acelerar la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico. Haberlo       " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor        " +
                                                  "\n seguridad en el tratamiento adecuado, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes    " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica moderada diariamente, con una duraci�n aproximada   " +
                                                  "\n de 60 minutos, incluyendo ejercicios aer�bicos como caminar, correr o nadar, para mejorar la sensibilidad a la insulina.   " +
                                                  "\n Tambi�n se recomienda la pr�ctica de ejercicios de resistencia como el yoga o el entrenamiento ligero con pesas para       " +
                                                  "\n mejorar el metabolismo de la glucosa. HIDRATACI�N: Es fundamental el consumo diario de 2 litros de agua (ocho vasos de     " +
                                                  "\n tama�o regular) para ayudar a mantener niveles adecuados de glucosa en sangre y prevenir la deshidrataci�n. Tambi�n se     " +
                                                  "\n recomienda el consumo de bebidas sin az�car como infusiones naturales o agua con lim�n. Adem�s, el consumo de alimentos    " +
                                                  "\n con alto contenido de fibra puede ayudar a estabilizar los niveles de glucosa en sangre. POSIBLE TRATAMIENTO: Para la      " +
                                                  "\n diabetes en adolescentes, el tratamiento suele incluir insulina en el caso de diabetes tipo 1, mientras que en diabetes    " +
                                                  "\n tipo 2 puede requerirse metformina y cambios en el estilo de vida. Es esencial el monitoreo constante de la glucosa en     " +
                                                  "\n sangre y el seguimiento m�dico. Tambi�n es recomendable la educaci�n sobre el manejo de la enfermedad para evitar          " +
                                                  "\n complicaciones a largo plazo. ALIMENTACI�N: Es recomendable el consumo de alimentos que ayuden a regular los niveles de    " +
                                                  "\n glucosa y fortalezcan el organismo, tales como: Avena, rica en fibra soluble (aproximadamente el 10% del requerimiento     " +
                                                  "\n diario por cada 100 g), que ayuda a estabilizar los niveles de az�car en sangre. Frutos secos, con grasas saludables y     " +
                                                  "\n magnesio (aproximadamente el 15% del requerimiento diario por cada 100 g), que contribuyen a la regulaci�n de la glucosa.  " +
                                                  "\n Legumbres, con prote�nas vegetales y fibra (aproximadamente el 20% del requerimiento diario por cada 100 g), que favorecen    " +
                                                  "\n la saciedad y el control de la glucosa. Tambi�n se recomienda el consumo de alimentos ricos en �cidos grasos Omega-3 para     " +
                                                  "\n mejorar la funci�n metab�lica y reducir la inflamaci�n. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad en  " +
                                                  "\n el tratamiento adecuado, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece    " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para             " +
                                                  "\n mantener las v�as respiratorias hidratadas y reducir la viscosidad de las secreciones, lo que facilita la respiraci�n.        " +
                                                  "\n La deshidrataci�n puede agravar los s�ntomas del asma, aumentando la irritaci�n de las v�as respiratorias y la                " +
                                                  "\n frecuencia de los episodios de tos. Es importante consumir l�quidos ricos en electrolitos, como sueros orales y caldos,       " +
                                                  "\n para mantener el equilibrio de minerales esenciales. Tambi�n se recomienda el consumo de infusiones suaves, como              " +
                                                  "\n manzanilla o jengibre, que pueden ayudar a reducir la inflamaci�n y mejorar la funci�n pulmonar. EJERCICIO: La actividad      " +
                                                  "\n f�sica debe ser moderada y adaptada, evitando esfuerzos excesivos que puedan desencadenar crisis asm�ticas, ejercicios        " +
                                                  "\n como nataci�n, yoga y caminatas suaves pueden ser beneficiosos para mejorar la capacidad pulmonar y reducir la inflamaci�n.   " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento est�ndar para el asma en adolescentes incluye broncodilatadores de alivio r�pido como     " +
                                                  "\n salbutamol, adem�s de corticosteroides inhalados como fluticasona o budesonida, en M�xico algunas marcas reconocidas          " +
                                                  "\n incluyen Ventolin (salbutamol) y Pulmicort (budesonida), en casos m�s severos pueden utilizarse biol�gicos como omalizumab,   " +
                                                  "\n bajo estricta supervisi�n m�dica. ALIMENTACI�N: Para fortalecer el sistema respiratorio y reducir la inflamaci�n, se          " +
                                                  "\n recomienda el consumo de alimentos ricos en omega-3, antioxidantes y vitamina C. Salm�n y ch�a: Contienen aproximadamente     " +
                                                  "\n 2-4 g de omega-3 por cada 100 g, lo que ayuda a reducir la inflamaci�n de las v�as respiratorias. Fresas y ar�ndanos:         " +
                                                  "\n Aportan 50-90 mg de vitamina C por cada 100 g, cubriendo hasta el 100% de la ingesta diaria recomendada, fortaleciendo el     " +
                                                  "\n sistema inmunol�gico. Jengibre y c�rcuma: Poseen propiedades antiinflamatorias y antioxidantes, ayudando a reducir la         " +
                                                  "\n irritaci�n de las v�as respiratorias. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza      " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se     " +
                                                  "\n recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y     " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tama�o regular) para          " +
                                                  "\n mantener la hidrataci�n y reducir la fatiga, lo que es fundamental en el proceso de recuperaci�n. El VIH puede           " +
                                                  "\n provocar fiebre, sudoraci�n nocturna y diarrea, lo que aumenta el riesgo de deshidrataci�n. Es esencial consumir         " +
                                                  "\n l�quidos ricos en electrolitos, como sueros orales y caldos, para reponer los minerales perdidos. Tambi�n se             " +
                                                  "\n recomienda el consumo de agua con lim�n o infusiones suaves, que pueden ayudar a aliviar las n�useas y mejorar la        " +
                                                  "\n digesti�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada, evitando esfuerzos excesivos que puedan          " +
                                                  "\n debilitar el sistema inmunol�gico, ejercicios como yoga, caminatas suaves y nataci�n pueden ser beneficiosos para        " +
                                                  "\n mejorar la resistencia y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento para el VIH en adolescentes incluye      " +
                                                  "\n terapia antirretroviral (TAR) con medicamentos como tenofovir, emtricitabina y dolutegravir, en M�xico algunas marcas    " +
                                                  "\n reconocidas incluyen Truvada (tenofovir/emtricitabina) y Tivicay (dolutegravir), adem�s se recomienda el uso de          " +
                                                  "\n terapias complementarias como apoyo nutricional y psicol�gico para mejorar la calidad de vida del paciente.              " +
                                                  "\n ALIMENTACI�N: Para fortalecer el sistema inmunol�gico y apoyar la recuperaci�n, se recomienda el consumo de alimentos    " +
                                                  "\n ricos en antioxidantes, prote�nas y �cidos grasos esenciales. Br�coli y zanahorias: Contienen aproximadamente            " +
                                                  "\n 50-80 mg de vitamina C por cada 100 g, lo que representa hasta el 90% de la ingesta diaria recomendada, fortaleciendo    " +
                                                  "\n el sistema inmunol�gico. Salm�n y ch�a: Son fuentes de omega-3, proporcionando entre 2-4 g por cada 100 g, lo que        " +
                                                  "\n ayuda a reducir la inflamaci�n y mejorar la funci�n celular. Frutas y verduras de colores vivos: Como ar�ndanos y        " +
                                                  "\n espinacas, que son ricas en antioxidantes y ayudan a proteger las c�lulas del da�o. Este es solo un diagn�stico          " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las          " +
                                                  "\n respuestas sean completamente correctas, para mayor seguridad se recomienda realizar m�s de un diagn�stico y consultar   " +
                                                  "\n a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular)             " +
                                                  "\n para mantener la hidrataci�n y ayudar a reducir la inflamaci�n, lo que es fundamental en el proceso de                   " +
                                                  "\n recuperaci�n. La gonorrea puede provocar fiebre, dolor abdominal y secreci�n anormal, lo que aumenta el riesgo           " +
                                                  "\n de deshidrataci�n. Es esencial consumir l�quidos ricos en electrolitos, como sueros orales y caldos, para reponer        " +
                                                  "\n los minerales perdidos. Tambi�n se recomienda el consumo de infusiones suaves, como manzanilla o jengibre, que           " +
                                                  "\n pueden ayudar a aliviar las molestias digestivas y mejorar la absorci�n de nutrientes. EJERCICIO: La actividad           " +
                                                  "\n f�sica debe ser muy ligera y supervisada, evitando esfuerzos excesivos que puedan agravar los s�ntomas, ejercicios       " +
                                                  "\n de respiraci�n profunda y movilidad suave pueden ser beneficiosos para mejorar la circulaci�n y reducir la fatiga.       " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento est�ndar para la gonorrea en adolescentes incluye antibi�ticos como ceftriaxona      " +
                                                  "\n y azitromicina, administrados en una sola dosis, en M�xico algunas marcas reconocidas incluyen Rocephin (ceftriaxona)    " +
                                                  "\n y Zithromax (azitromicina), adem�s se recomienda reposo absoluto y una dieta adecuada para mejorar la recuperaci�n.      " +
                                                  "\n ALIMENTACI�N: Para fortalecer el sistema inmunol�gico y apoyar la recuperaci�n, se recomienda el consumo de alimentos    " +
                                                  "\n ricos en vitamina C, antioxidantes y prote�nas. Naranjas y fresas: Contienen aproximadamente 70-90 mg de vitamina C      " +
                                                  "\n por cada 100 g, lo que representa hasta el 100% de la ingesta diaria recomendada, fortaleciendo el sistema inmunol�gico  " +
                                                  "\n y ayudando a reducir la inflamaci�n. Espinacas y lentejas: Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g,          " +
                                                  "\n cubriendo entre el 25% y 40% de la ingesta diaria recomendada, lo que ayuda a mejorar la oxigenaci�n celular y           " +
                                                  "\n reducir el cansancio. Carnes magras y huevos: Son una fuente importante de prote�nas, proporcionando entre 20 y          " +
                                                  "\n 25 g por cada 100 g, lo que equivale al 40-50% de la recomendaci�n diaria, esenciales para la regeneraci�n celular       " +
                                                  "\n y el fortalecimiento muscular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al     " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se   " +
                                                  "\n recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida)  " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraerHerpes genital." +
                                                  "\n HIDRATACI�N: Mantener una hidrataci�n adecuada es esencial para fortalecer el sistema inmunol�gico y reducir la       " +
                                                  "\n inflamaci�n causada por el virus. Se recomienda el consumo diario de 1.5 a 2 litros de agua, adem�s de infusiones     " +
                                                  "\n de manzanilla y jengibre, que poseen propiedades antiinflamatorias y pueden ayudar a aliviar el malestar. La          " +
                                                  "\n hidrataci�n tambi�n contribuye a la regeneraci�n celular y a la eliminaci�n de toxinas, lo que puede ayudar a         " +
                                                  "\n reducir la frecuencia de los brotes. EJERCICIO: La actividad f�sica debe ser moderada y enfocada en fortalecer        " +
                                                  "\n el sistema inmunol�gico. Se recomienda realizar ejercicios de bajo impacto, como yoga y caminatas suaves, que         " + 
                                                  "\n ayudan a reducir el estr�s, un factor que puede desencadenar brotes del virus. Tambi�n es recomendable practicar      " +
                                                  "\n ejercicios de relajaci�n, como la meditaci�n y la respiraci�n profunda, para mejorar la respuesta del cuerpo ante     " +
                                                  "\n el virus. POSIBLE TRATAMIENTO: El tratamiento para el herpes genital incluye antivirales como aciclovir y             " +
                                                  "\n valaciclovir, que ayudan a reducir la duraci�n y gravedad de los s�ntomas. En casos recurrentes, se puede optar       " +
                                                  "\n por terapia supresiva, que consiste en el uso diario de antivirales para reducir la frecuencia de los brotes y la     " +
                                                  "\n posibilidad de transmisi�n. Tambi�n se recomienda el uso de cremas t�picas con lidoca�na, que pueden aliviar el       " +
                                                  "\n dolor y la irritaci�n en las lesiones. En M�xico, estos medicamentos est�n disponibles en instituciones de salud      " +
                                                  "\n como el IMSS y el Insabi. ALIMENTACI�N: Tambi�n es recomendable el consumo de alimentos que fortalezcan el sistema    " +
                                                  "\n inmunol�gico y ayuden a reducir la inflamaci�n, tales como frutas c�tricas (naranjas, limones, toronjas), ricas en    " +
                                                  "\n vitamina C, que fortalece el sistema inmunol�gico. Verduras de hoja verde (espinacas, acelgas, br�coli), contienen    " +
                                                  "\n antioxidantes y hierro, esenciales para la salud celular. Pescados grasos (salm�n, at�n), ricos en Omega-3, con       " +
                                                  "\n propiedades antiinflamatorias. Frutos secos (almendras, nueces), aportan vitamina E, que ayuda a la regeneraci�n      " +
                                                  "\n celular. Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico. Este es   " +
                                                  "\n solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi   " +
                                                  "\n Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud, si la respuesta " +
                                                  "\n del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece tu visita   " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: La hidrataci�n es clave para ayudar al cuerpo a eliminar toxinas y fortalecer el sistema inmunol�gico.     " +
                                                  "\n Se recomienda el consumo diario de 1.5 a 2 litros de agua, adem�s de infusiones de equin�cea y jengibre, que pueden     " +
                                                  "\n ayudar a mejorar la respuesta inmunol�gica. La hidrataci�n tambi�n contribuye a la circulaci�n sangu�nea, lo que es     " +
                                                  "\n esencial para la recuperaci�n de los tejidos afectados por la enfermedad. EJERCICIO: La actividad f�sica debe ser       " +
                                                  "\n moderada y enfocada en mejorar la circulaci�n sangu�nea. Se recomienda realizar ejercicios aer�bicos suaves, como       " +
                                                  "\n caminatas y bicicleta est�tica, que ayudan a mejorar la oxigenaci�n celular y la recuperaci�n del cuerpo. Tambi�n       " +
                                                  "\n es recomendable practicar ejercicios de resistencia, como el entrenamiento con pesas ligeras, para fortalecer el        " +
                                                  "\n sistema muscular y mejorar la respuesta del cuerpo ante la infecci�n. POSIBLE TRATAMIENTO: El tratamiento para la       " +
                                                  "\n s�filis incluye penicilina benzatina, que es el medicamento de primera l�nea. En casos de alergia a la penicilina,      " +
                                                  "\n se pueden utilizar antibi�ticos alternativos como doxiciclina o ceftriaxona. Es fundamental completar el tratamiento    " +
                                                  "\n indicado por el m�dico para evitar complicaciones graves como la s�filis terciaria, que puede afectar el sistema        " +
                                                  "\n nervioso y cardiovascular. Tambi�n se recomienda realizar pruebas de seguimiento para confirmar la eliminaci�n de       " +
                                                  "\n la bacteria y evitar la transmisi�n a otras personas. En M�xico, estos medicamentos est�n disponibles en instituciones  " +
                                                  "\n de salud como el IMSS y el Insabi. ALIMENTACI�N: Tambi�n es recomendable el consumo de alimentos que fortalezcan el     " +
                                                  "\n sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como frutas c�tricas (naranjas, limones, toronjas),       " +
                                                  "\n ricas en vitamina C, que fortalece el sistema inmunol�gico. Verduras de hoja verde (espinacas, acelgas, br�coli),       " +
                                                  "\n contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos (salm�n, at�n), ricos en Omega-3,   " +
                                                  "\n con propiedades antiinflamatorias. Frutos secos (almendras, nueces), aportan vitamina E, que ayuda a la regeneraci�n    " +
                                                  "\n celular. Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico. Este es     " +
                                                  "\n solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad" +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida" +
                                                  "\n para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud, si la respuesta del    " +
                                                  "\n diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece tu visita a la    " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACI�N: La hidrataci�n es fundamental para mantener la salud pulmonar y ayudar a eliminar toxinas del cuerpo.       " +
                                                  "\n Se recomienda el consumo diario de 2 a 2.5 litros de agua, adem�s de infusiones de tomillo y eucalipto, que pueden       " +
                                                  "\n ayudar a mejorar la funci�n respiratoria. La hidrataci�n tambi�n contribuye a la eliminaci�n de secreciones              " +
                                                  "\n pulmonares, lo que facilita la recuperaci�n del paciente. EJERCICIO: La actividad f�sica debe ser moderada y enfocada    " +
                                                  "\n en mejorar la capacidad pulmonar. Se recomienda realizar ejercicios de respiraci�n profunda, como respiraci�n            " +
                                                  "\n diafragm�tica y con labios fruncidos, que ayudan a mejorar la oxigenaci�n. Tambi�n es beneficioso practicar caminatas    " +
                                                  "\n suaves, evitando ambientes fr�os o contaminados. POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis incluye        " +
                                                  "\n antibi�ticos como isoniazida, rifampicina y etambutol, que deben tomarse durante un per�odo prolongado para garantizar   " +
                                                  "\n la eliminaci�n de la bacteria. En casos de tuberculosis resistente a los medicamentos, se pueden utilizar esquemas de    " +
                                                  "\n tratamiento m�s prolongados con f�rmacos como bedaquilina y linezolid. Es fundamental seguir estrictamente el            " +
                                                  "\n tratamiento para evitar reca�das y la propagaci�n de la enfermedad. Tambi�n se recomienda realizar pruebas de            " +
                                                  "\n seguimiento para confirmar la eliminaci�n de la bacteria y evitar la transmisi�n a otras personas. En M�xico,            " +
                                                  "\n estos medicamentos est�n disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACI�N: Tambi�n           " +
                                                  "\n es recomendable el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n,       " +
                                                  "\n tales como frutas c�tricas (naranjas, limones, toronjas), ricas en vitamina C, que fortalece el sistema inmunol�gico.    " +
                                                  "\n Verduras de hoja verde (espinacas, acelgas, br�coli), contienen antioxidantes y hierro, esenciales para la salud celular." +
                                                  "\n Pescados grasos (salm�n, at�n), ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos (almendras, nueces),   " +
                                                  "\n aportan vitamina E, que ayuda a la regeneraci�n celular. Yogur natural, fuente de probi�ticos, que favorecen la salud    " +
                                                  "\n intestinal y el sistema inmunol�gico. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se          " +
                                                  "\n recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado          " +
                                                  "\n del paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar    " +
                                                  "\n a su m�dico. �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis. " +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica moderada y adaptada a su condici�n,          " +
                                                  "\n evitando ejercicios de alto impacto que puedan afectar sus articulaciones. Se sugiere ejercicios de bajo            " +
                                                  "\n impacto como nataci�n, yoga o caminatas suaves, que ayudan a mejorar la movilidad sin generar estr�s en las         " +
                                                  "\n articulaciones. HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua al d�a (ocho a diez          " +
                                                  "\n vasos de tama�o regular) para mantener una adecuada hidrataci�n y ayudar a reducir la inflamaci�n en las            " + 
                                                  "\n articulaciones. Tambi�n es beneficioso el consumo de infusiones de c�rcuma y jengibre, que poseen propiedades       " +
                                                  "\n antiinflamatorias naturales. Adem�s, el consumo de agua con lim�n puede ser �til debido a su contenido de           " +
                                                  "\n vitamina C, que contribuye a la producci�n de col�geno y la salud articular. POSIBLE TRATAMIENTO: Para la           " +
                                                  "\n artritis juvenil, el tratamiento suele incluir antiinflamatorios no esteroides (AINEs) como ibuprofeno o            " +
                                                  "\n naproxeno, adem�s de f�rmacos modificadores de la enfermedad como metotrexato en casos m�s severos. Tambi�n         " +
                                                  "\n pueden utilizarse terapias biol�gicas bajo supervisi�n m�dica. La fisioterapia es clave para mejorar la movilidad   " +
                                                  "\n y reducir el dolor, y en algunos casos se recomienda el uso de suplementos de col�geno y glucosamina para           " +
                                                  "\n fortalecer las articulaciones. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a reducir la          " +
                                                  "\n inflamaci�n y fortalecer las articulaciones, tales como Pescados grasos (salm�n, at�n): ricos en �cidos grasos      " +
                                                  "\n Omega-3, que poseen propiedades antiinflamatorias. Frutas y verduras de colores vivos (ar�ndanos, fresas,           " +
                                                  "\n espinacas, br�coli): ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las c�lulas      " +
                                                  "\n del da�o y fortalecer el sistema inmunol�gico. Jengibre: contiene compuestos con efectos antiinflamatorios que      " +
                                                  "\n podr�an ser beneficiosos para las articulaciones. C�rcuma: con su componente activo, la curcumina, tambi�n tiene    " +
                                                  "\n potentes propiedades antiinflamatorias y antioxidantes. Semillas de ch�a y linaza: ricas en Omega-3 y fibra, que    " +
                                                  "\n ayudan a reducir la inflamaci�n. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza " +
                                                  "\n al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda     " +
                                                  "\n realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta " +
                                                  "\n del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica ligera, evitando esfuerzos excesivos            " +
                                                  "\n que puedan agravar la tos y la dificultad respiratoria. Se sugiere ejercicios de respiraci�n, caminatas suaves         " +
                                                  "\n y estiramientos para mejorar la capacidad pulmonar. HIDRATACI�N: Debido a la tos persistente y la posible              " +
                                                  "\n deshidrataci�n causada por la tosferina, se recomienda el consumo diario de 2.5 a 3 litros de agua al d�a (diez        " +
                                                  "\n a doce vasos de tama�o regular). Tambi�n es beneficioso el consumo de infusiones de miel y jengibre, que pueden        " +
                                                  "\n ayudar a calmar la garganta y reducir la inflamaci�n. Se recomienda el uso de bebidas tibias, como caldos y t�s        " +
                                                  "\n de hierbas, para aliviar la irritaci�n de la garganta. POSIBLE TRATAMIENTO: Para la tosferina en adolescentes, el      " +
                                                  "\n tratamiento suele incluir antibi�ticos como azitromicina, claritromicina o eritromicina, administrados bajo               " +
                                                  "\n supervisi�n m�dica. Tambi�n se recomienda el uso de humidificadores para aliviar la irritaci�n de las v�as respiratorias. " +
                                                  "\n En casos graves, puede requerirse hospitalizaci�n con administraci�n de ox�geno y l�quidos intravenosos para prevenir     " +
                                                  "\n la deshidrataci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema respiratorio    " +
                                                  "\n y aliviar los s�ntomas, tales como Miel: ayuda a calmar la garganta y tiene propiedades antimicrobianas. Jengibre: con    " +
                                                  "\n propiedades antiinflamatorias que pueden aliviar la tos y mejorar la respuesta inmune. Frutas c�tricas (naranjas,         " +
                                                  "\n limones, toronjas): ricas en vitamina C, que ayuda a mejorar la respuesta inmunol�gica. Caldo de pollo: fuente de         " +
                                                  "\n electrolitos y nutrientes esenciales para la recuperaci�n. Ajo: contiene alicina, un compuesto con propiedades            " +
                                                  "\n antimicrobianas que pueden ayudar a combatir infecciones. Este es solo un diagn�stico predeterminado l�gico. Haberlo      " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. " +
                                                  "\n Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud,    " +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica ligera, evitando esfuerzos excesivos que          " +
                                                  "\n puedan agravar la inflamaci�n de las gl�ndulas salivales. Se sugiere ejercicios de relajaci�n y estiramientos            " +
                                                  "\n suaves. HIDRATACI�N: Debido a la fiebre y la inflamaci�n de las gl�ndulas salivales, se recomienda el consumo            " +
                                                  "\n diario de 2.5 a 3 litros de agua al d�a (diez a doce vasos de tama�o regular). Tambi�n es beneficioso el consumo         " +
                                                  "\n de infusiones de manzanilla, que pueden ayudar a reducir la inflamaci�n, y agua de coco, que aporta electrolitos         " +
                                                  "\n esenciales. Se recomienda evitar bebidas �cidas como jugo de lim�n o naranja, ya que pueden irritar a�n m�s las          " +
                                                  "\n gl�ndulas salivales. POSIBLE TRATAMIENTO: Para las paperas en adolescentes, no existe un tratamiento espec�fico,         " +
                                                  "\n ya que es una enfermedad viral autolimitada. Se recomienda reposo, hidrataci�n y control de fiebre con paracetamol       " +
                                                  "\n (Tempra) o ibuprofeno. En casos graves, puede requerirse hospitalizaci�n con administraci�n de l�quidos intravenosos.    " +
                                                  "\n Se recomienda aplicar compresas fr�as en la zona inflamada para aliviar el dolor y la hinchaz�n. ALIMENTACI�N:           " +
                                                  "\n Se recomienda el consumo de alimentos que ayuden a reducir la inflamaci�n y fortalecer el sistema inmune, tales          " +
                                                  "\n como Frutas c�tricas (naranjas, limones, toronjas): ricas en vitamina C, que ayuda a mejorar la respuesta inmunol�gica.  " +
                                                  "\n Papaya: contiene vitamina C y flavonoides que pueden ayudar a reducir la inflamaci�n. Jengibre: con propiedades    " +
                                                  "\n antiinflamatorias que pueden aliviar la fatiga y mejorar la respuesta inmune. Miel: ayuda a calmar la garganta y   " +
                                                  "\n tiene propiedades antimicrobianas. Caldo de vegetales: fuente de electrolitos y nutrientes esenciales para la      " +
                                                  "\n recuperaci�n. Yogur natural: fuente de probi�ticos que ayudan a restaurar la flora intestinal y fortalecer el      " +
                                                  "\n sistema inmune. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que     " +
                                                  "\n la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar m�s   " +
                                                  "\n de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del       " +
                                                  "\n diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita       " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica de baja intensidad, evitando esfuerzos            " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperaci�n. Actividades como caminatas suaves, ejercicios          " +
                                                  "\n de respiraci�n y yoga pueden ser beneficiosos para mantener el cuerpo activo sin comprometer la recuperaci�n.            " +
                                                  "\n Tambi�n se recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez muscular causada          " +
                                                  "\n por el reposo prolongado. HIDRATACI�N: Es fundamental el consumo diario de 2 litros de agua (ocho vasos de tama�o        " +
                                                  "\n regular) para mantener una hidrataci�n �ptima y ayudar a aliviar los s�ntomas. Tambi�n se recomienda el consumo de       " +
                                                  "\n infusiones con propiedades antiinflamatorias como el t� de jengibre o manzanilla. POSIBLE TRATAMIENTO: No existe         " +
                                                  "\n un tratamiento espec�fico para el virus del Zika, por lo que se recomienda reposo, hidrataci�n abundante y el uso        " +
                                                  "\n de analg�sicos como el paracetamol para aliviar los s�ntomas. Tambi�n es importante evitar la exposici�n a mosquitos     " +
                                                  "\n para prevenir la propagaci�n del virus. Se recomienda el uso de repelentes de insectos, ropa de manga larga y            " +
                                                  "\n mosquiteros para reducir el riesgo de picaduras. En casos graves, si se presentan s�ntomas neurol�gicos o complicaciones," +
                                                  "\n es fundamental acudir al m�dico para una evaluaci�n m�s detallada. ALIMENTACI�N: Es recomendable el consumo de         " +
                                                  "\n alimentos que ayuden a fortalecer el sistema inmune y mejorar la recuperaci�n, tales como: Naranjas, ricas en          " +
                                                  "\n vitamina C, que ayuda a fortalecer el sistema inmunol�gico y reducir la duraci�n de los s�ntomas. Espinacas, con       " +
                                                  "\n hierro, que contribuye a la producci�n de gl�bulos rojos y mejora la oxigenaci�n del cuerpo. Yogur, con probi�ticos    " +
                                                  "\n que favorecen la salud intestinal y fortalecen el sistema inmune. Tambi�n se recomienda el consumo de alimentos ricos  " +
                                                  "\n en zinc para mejorar la respuesta inmune y acelerar la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico." +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas.    " +
                                                  "\n Para mayor seguridad en el tratamiento adecuado, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica de baja intensidad, evitando esfuerzos                   " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperaci�n. Actividades como caminatas suaves, juegos                     " +
                                                  "\n tranquilos y ejercicios de respiraci�n pueden ser beneficiosos para mantener el cuerpo activo sin comprometer                   " +
                                                  "\n la recuperaci�n. Tambi�n se recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez                 " +
                                                  "\n muscular causada por el reposo prolongado. HIDRATACI�N: Es fundamental el consumo diario de 2 a 2.5 litros de agua              " +
                                                  "\n (ocho a diez vasos de tama�o regular) para prevenir la deshidrataci�n causada por la diarrea y ayudar a la recuperaci�n         " +
                                                  "\n del organismo. Adem�s, se recomienda el consumo de sueros de rehidrataci�n oral para reponer los electrolitos perdidos.         " +
                                                  "\n POSIBLE TRATAMIENTO: Para el rotavirus en adolescentes, el tratamiento suele enfocarse en la rehidrataci�n y el manejo          " +
                                                  "\n de los s�ntomas. Se recomienda el consumo de l�quidos abundantes, sueros de rehidrataci�n y el uso de medicamentos para         " +
                                                  "\n aliviar la fiebre y el malestar general. En casos graves, si la deshidrataci�n es severa, puede requerirse hospitalizaci�n      " +
                                                  "\n para administraci�n de l�quidos intravenosos. Tambi�n es importante evitar el consumo de alimentos irritantes como productos    " +
                                                  "\n l�cteos, frituras y bebidas azucaradas, ya que pueden agravar los s�ntomas. ALIMENTACI�N: Es recomendable el consumo de         " +
                                                  "\n alimentos que ayuden a la recuperaci�n intestinal y fortalezcan el sistema inmune, tales como: Pl�tanos, ricos en potasio,      " +
                                                  "\n que ayudan a reponer electrolitos perdidos por la diarrea. Zanahorias, con vitamina A, que contribuye a la regeneraci�n de      " +
                                                  "\n la mucosa intestinal. Yogur, con probi�ticos que favorecen la salud intestinal y fortalecen el sistema inmune. Tambi�n se       " +
                                                  "\n recomienda el consumo de caldos y sopas suaves para facilitar la digesti�n y evitar irritaciones en el tracto intestinal.       " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta           " +
                                                  "\n enfermedad ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar        " +
                                                  "\n m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica moderada, evitando esfuerzos excesivos y         " +
                                                  "\n asegurando una recuperaci�n adecuada. Ejercicios como caminatas suaves, estiramientos y yoga pueden ser beneficiosos    " +
                                                  "\n para mantener el cuerpo activo sin comprometer el tratamiento. Tambi�n se recomienda ejercicios de relajaci�n y         " +
                                                  "\n respiraci�n profunda para reducir el estr�s y mejorar la respuesta inmune. HIDRATACI�N: Es fundamental el consumo       " +
                                                  "\n diario de 2 litros de agua (ocho vasos de tama�o regular) para ayudar a eliminar toxinas y mantener el organismo        " +
                                                  "\n en equilibrio. Tambi�n se recomienda el consumo de jugos naturales ricos en antioxidantes para fortalecer el sistema    " +
                                                  "\n inmune. POSIBLE TRATAMIENTO: Para la listeriosis en adolescentes, el tratamiento suele incluir antibi�ticos como la     " +
                                                  "\n ampicilina o gentamicina, administrados bajo supervisi�n m�dica. En casos graves, si la infecci�n se ha diseminado,     " +
                                                  "\n puede requerirse hospitalizaci�n y tratamiento intravenoso prolongado. Tambi�n es importante evitar el consumo de       " +
                                                  "\n alimentos contaminados y mantener una higiene adecuada, asegurando la correcta manipulaci�n y conservaci�n de los       " +
                                                  "\n alimentos. Se recomienda evitar el consumo de productos l�cteos sin pasteurizar, carnes crudas y pescados ahumados,     " +
                                                  "\n ya que pueden ser fuentes de infecci�n. ALIMENTACI�N: Es recomendable el consumo de alimentos que ayuden a fortalecer   " +
                                                  "\n el sistema inmune y mejorar la recuperaci�n, tales como: Naranjas, ricas en vitamina C, que ayuda a fortalecer el       " +
                                                  "\n sistema inmunol�gico y reducir la duraci�n de los s�ntomas. Espinacas, con hierro, que contribuye a la producci�n de    " +
                                                  "\n gl�bulos rojos y mejora la oxigenaci�n del cuerpo. Yogur, con probi�ticos que favorecen la salud intestinal y fortalecen" +
                                                  "\n el sistema inmune. Tambi�n se recomienda el consumo de alimentos ricos en zinc para mejorar la respuesta inmune y    " +
                                                  "\n acelerar la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento   " +
                                                  "\n adecuado, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a  " +
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica de baja intensidad, evitando esfuerzos         " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperaci�n. Actividades como caminatas suaves, juegos           " +
                                                  "\n tranquilos y ejercicios de respiraci�n pueden ser beneficiosos para mantener el cuerpo activo sin comprometer         " +
                                                  "\n la recuperaci�n. Tambi�n se recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez       " +
                                                  "\n muscular causada por el reposo prolongado. HIDRATACI�N: Es fundamental el consumo diario de 1.5 a 2 litros de agua    " +
                                                  "\n (seis a ocho vasos de tama�o regular) para prevenir la deshidrataci�n causada por la diarrea y ayudar a la            " +
                                                  "\n recuperaci�n del organismo. Adem�s, se recomienda el consumo de sueros de rehidrataci�n oral para reponer los         " +
                                                  "\n electrolitos perdidos. POSIBLE TRATAMIENTO: Para la shigelosis en adolescentes, el tratamiento suele incluir          " +
                                                  "\n antibi�ticos como la azitromicina o ciprofloxacino en casos graves, adem�s de medidas de rehidrataci�n oral para      " +
                                                  "\n evitar la deshidrataci�n. Tambi�n es importante mantener una higiene adecuada, lavarse las manos frecuentemente y     " +
                                                  "\n evitar el contacto con personas infectadas. En casos leves, el tratamiento puede centrarse en el manejo de los        " +
                                                  "\n s�ntomas con reposo, hidrataci�n y una dieta adecuada. Se recomienda evitar el consumo de alimentos irritantes        " +
                                                  "\n como l�cteos, frituras y comidas muy condimentadas, ya que pueden agravar la diarrea. ALIMENTACI�N: Es recomendable   " +
                                                  "\n el consumo de alimentos que ayuden a la recuperaci�n intestinal y fortalezcan el sistema inmune, tales como: Pl�tanos," +
                                                  "\n ricos en potasio, que ayudan a reponer electrolitos perdidos por la diarrea. Zanahorias, con vitamina A, que          " +
                                                  "\n contribuye a la regeneraci�n de la mucosa intestinal. Yogur, con probi�ticos que favorecen la salud intestinal        " +
                                                  "\n y fortalecen el sistema inmune. Tambi�n se recomienda el consumo de caldos y sopas suaves para facilitar la digesti�n " +
                                                  "\n y evitar irritaciones en el tracto intestinal. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad " +
                                                  "\n en el tratamiento adecuado, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica adaptada a su capacidad respiratoria,           " +
                                                  "\n evitando esfuerzos excesivos y asegurando una respiraci�n controlada. Ejercicios como caminatas suaves, nataci�n,      " +
                                                  "\n yoga y t�cnicas de respiraci�n pueden mejorar la funci�n pulmonar y reducir la fatiga. Tambi�n se recomienda           " +
                                                  "\n ejercicios de expansi�n tor�cica y fortalecimiento de los m�sculos respiratorios para mejorar la capacidad pulmonar.   " +
                                                  "\n Es importante realizar calentamiento previo y enfriamiento posterior para evitar crisis respiratorias. HIDRATACI�N:    " +
                                                  "\n Es fundamental el consumo diario de 1.7 a 2 litros de agua (siete a ocho vasos de tama�o regular) para mantener las    " +
                                                  "\n v�as respiratorias hidratadas y facilitar la eliminaci�n de secreciones. Tambi�n se recomienda el consumo de           " +
                                                  "\n infusiones con propiedades antiinflamatorias como el t� de jengibre o manzanilla. POSIBLE TRATAMIENTO: Para el         " +
                                                  "\n EPOC en adolescentes, el tratamiento suele incluir broncodilatadores como el salbutamol, corticosteroides inhalados    " +
                                                  "\n como la fluticasona y, en casos graves, oxigenoterapia. Tambi�n es importante evitar la exposici�n a contaminantes     " +
                                                  "\n ambientales y humo de tabaco. En algunos casos, se recomienda la rehabilitaci�n pulmonar, que incluye ejercicios         " +
                                                  "\n espec�ficos para mejorar la capacidad respiratoria y t�cnicas de manejo de la enfermedad. ALIMENTACI�N: Es recomendable  " +
                                                  "\n el consumo de alimentos que ayuden a mejorar la funci�n pulmonar y fortalezcan el sistema inmune, tales como: Pescados   " +
                                                  "\n grasos (salm�n, at�n), ricos en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias que pueden ayudar a      " +
                                                  "\n reducir la inflamaci�n de las v�as respiratorias. Frutas y verduras de colores vivos (ar�ndanos, fresas, espinacas,      " +
                                                  "\n br�coli), ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las c�lulas del da�o y fortalecer     " +
                                                  "\n el sistema inmunol�gico. Jengibre, contiene compuestos con efectos antiinflamatorios que podr�an ser beneficiosos para        " +
                                                  "\n las v�as respiratorias. C�rcuma, con su componente activo, la curcumina, tambi�n tiene potentes propiedades antiinflamatorias " +
                                                  "\n y antioxidantes. Tambi�n se recomienda el consumo de alimentos ricos en fibra para mejorar la digesti�n y evitar la        " +
                                                  "\n inflamaci�n intestinal. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que     " +
                                                  "\n el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento adecuado,   " +
                                                  "\n se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica moderada, evitando esfuerzos excesivos y           " +
                                                  "\n asegurando una recuperaci�n adecuada. Ejercicios como caminatas suaves, estiramientos y yoga pueden ser beneficiosos      " +
                                                  "\n para mantener el cuerpo activo sin comprometer el tratamiento. Tambi�n se recomienda ejercicios de relajaci�n y           " +
                                                  "\n respiraci�n profunda para reducir el estr�s y mejorar la respuesta inmune. HIDRATACI�N: Es fundamental el consumo         " +
                                                  "\n diario de 1.5 a 2 litros de agua (seis a ocho vasos de tama�o regular) para ayudar a eliminar toxinas y mantener el       " +
                                                  "\n organismo en equilibrio. Tambi�n se recomienda el consumo de jugos naturales ricos en antioxidantes para fortalecer       " +
                                                  "\n el sistema inmune. POSIBLE TRATAMIENTO: Para la clamidia en adolescentes, el tratamiento suele incluir antibi�ticos       " +
                                                  "\n como la azitromicina o doxiciclina, administrados bajo supervisi�n m�dica. Tambi�n es importante evitar el contacto       " +
                                                  "\n con personas infectadas y mantener una higiene adecuada. En algunos casos, se recomienda el uso de probi�ticos para       " +
                                                  "\n ayudar a restaurar la flora vaginal y prevenir infecciones recurrentes. ALIMENTACI�N: Es recomendable el consumo de       " +
                                                  "\n alimentos que ayuden a fortalecer el sistema inmune y mejorar la recuperaci�n, tales como: Naranjas, ricas en vitamina C, " +
                                                  "\n que ayuda a fortalecer el sistema inmunol�gico y reducir la duraci�n de los s�ntomas. Espinacas, con hierro, que contribuye " +
                                                  "\n a la producci�n de gl�bulos rojos y mejora la oxigenaci�n del cuerpo. Yogur, con probi�ticos que favorecen la salud         " +
                                                  "\n intestinal y fortalecen el sistema inmune. Tambi�n se recomienda el consumo de alimentos ricos en zinc para mejorar         " +
                                                  "\n la respuesta inmune y acelerar la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado       " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad       " +
                                                  "\n en el tratamiento adecuado, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece   " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular)                " +
                                                  "\n para mantener la hidrataci�n y ayudar a reducir la fiebre y los s�ntomas neurol�gicos, lo que es fundamental                " +
                                                  "\n en el proceso de recuperaci�n. La meningitis bacteriana puede provocar fiebre alta, v�mitos, rigidez en el cuello           " +
                                                  "\n y sensibilidad a la luz, lo que puede llevar a una mayor p�rdida de l�quidos. Es importante que el paciente consuma         " +
                                                  "\n l�quidos ricos en electrolitos, como sueros orales, caldos y jugos naturales sin az�car, para evitar la deshidrataci�n      " +
                                                  "\n y mantener el equilibrio de minerales esenciales. Tambi�n se recomienda el consumo de infusiones suaves, como               " +
                                                  "\n manzanilla o jengibre, que pueden ayudar a aliviar las n�useas y mejorar la digesti�n. EJERCICIO: La actividad              " +
                                                  "\n f�sica debe ser muy ligera y supervisada, evitando esfuerzos excesivos que puedan agravar los s�ntomas, ejercicios          " +
                                                  "\n de respiraci�n profunda y movilidad suave pueden ser beneficiosos para mejorar la capacidad pulmonar y la circulaci�n.      " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento est�ndar para la meningitis bacteriana en adolescentes incluye antibi�ticos como        " +
                                                  "\n ceftriaxona, ampicilina y vancomicina, administrados por v�a intravenosa durante 7 a 14 d�as, en M�xico algunas marcas      " +
                                                  "\n reconocidas incluyen Rocephin (ceftriaxona) y Amikin (amikacina), adem�s se recomienda el uso de corticosteroides como      " +
                                                  "\n dexametasona para reducir la inflamaci�n cerebral en casos graves. ALIMENTACI�N: Para fortalecer el sistema inmunol�gico    " +
                                                  "\n y apoyar la recuperaci�n, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y prote�nas. Naranjas    " +
                                                  "\n y fresas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa hasta el 100% de la ingesta    " +
                                                  "\n diaria recomendada, fortaleciendo el sistema inmunol�gico y ayudando a reducir la inflamaci�n. Espinacas y lentejas:        " +
                                                  "\n Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25% y 40% de la ingesta diaria recomendada,         " +
                                                  "\n lo que ayuda a mejorar la oxigenaci�n celular y reducir el cansancio. Carnes magras y huevos: Son una fuente importante     " +
                                                  "\n de prote�nas, proporcionando entre 20 y 25 g por cada 100 g, lo que equivale al 40-50% de la recomendaci�n diaria,          " +
                                                  "\n esenciales para la regeneraci�n celular y el fortalecimiento muscular. Este es solo un diagn�stico predeterminado l�gico,   " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente      " +
                                                  "\n correctas, para mayor seguridad se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes        " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tama�o regular) para          " +
                                                  "\n mantener la hidrataci�n y ayudar a reducir los efectos secundarios del tratamiento, lo que es fundamental en el          " +
                                                  "\n proceso de recuperaci�n. Los adolescentes con c�ncer pueden experimentar v�mitos, diarrea y sudoraci�n excesiva,         " +
                                                  "\n lo que aumenta el riesgo de deshidrataci�n. Es esencial consumir l�quidos ricos en electrolitos, como sueros             " +
                                                  "\n orales y caldos, para reponer los minerales perdidos. Tambi�n se recomienda el consumo de agua con lim�n o infusiones    " +
                                                  "\n suaves, que pueden ayudar a aliviar las n�useas y mejorar la digesti�n. EJERCICIO: La actividad f�sica debe ser          " +
                                                  "\n moderada y adaptada, evitando esfuerzos excesivos que puedan debilitar el sistema inmunol�gico, ejercicios como          " +
                                                  "\n yoga, caminatas suaves y nataci�n pueden ser beneficiosos para mejorar la resistencia y reducir la fatiga. POSIBLE       " +
                                                  "\n TRATAMIENTO: El tratamiento para el c�ncer en adolescentes depende del tipo espec�fico de c�ncer, pero puede incluir     " +
                                                  "\n quimioterapia, radioterapia y cirug�a, en M�xico algunas marcas reconocidas incluyen Methotrexate (metotrexato) y        " +
                                                  "\n Vincristine (vincristina), adem�s se recomienda el uso de terapias complementarias como apoyo nutricional y psicol�gico  " +
                                                  "\n para mejorar la calidad de vida del paciente. ALIMENTACI�N: Para fortalecer el sistema inmunol�gico y apoyar la          " +
                                                  "\n recuperaci�n, se recomienda el consumo de alimentos ricos en antioxidantes, prote�nas y �cidos grasos esenciales.        " +
                                                  "\n Br�coli y zanahorias: Contienen aproximadamente 50-80 mg de vitamina C por cada 100 g, lo que representa hasta el        " +
                                                  "\n 90% de la ingesta diaria recomendada, fortaleciendo el sistema inmunol�gico. Salm�n y ch�a: Son fuentes de omega-3,      " +
                                                  "\n proporcionando entre 2-4 g por cada 100 g, lo que ayuda a reducir la inflamaci�n y mejorar la funci�n celular. Frutas    " +
                                                  "\n y verduras de colores vivos: Como ar�ndanos y espinacas, que son ricas en antioxidantes y ayudan a proteger las c�lulas  " +
                                                  "\n del da�o. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente     " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar    " +
                                                  "\n m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.50-1.75 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica moderada a intensa diariamente, con una      " +
                                                  "\n duraci�n aproximada de 60 minutos, aunque esta cantidad puede ajustarse seg�n su condici�n. Actividades como        " +
                                                  "\n caminatas, ejercicios aer�bicos, nataci�n y deportes de bajo impacto pueden ser beneficiosos para fortalecer        " +
                                                  "\n su sistema inmunol�gico y mejorar la recuperaci�n. Tambi�n se recomienda ejercicios de respiraci�n profunda y       " +
                                                  "\n relajaci�n para mejorar la oxigenaci�n y reducir el estr�s, lo que puede favorecer la recuperaci�n. HIDRATACI�N:    " +
                                                  "\n Es fundamental el consumo diario de 2 litros de agua (ocho vasos de tama�o regular) para mantener una hidrataci�n   " +
                                                  "\n adecuada y ayudar al cuerpo a combatir la enfermedad. Tambi�n se recomienda el consumo de infusiones calientes      " +
                                                  "\n como t� de jengibre o manzanilla para aliviar los s�ntomas respiratorios. Adem�s, el consumo de caldos y sopas      " +
                                                  "\n calientes puede ayudar a mantener la hidrataci�n y proporcionar nutrientes esenciales para la recuperaci�n.         " +
                                                  "\n POSIBLE TRATAMIENTO: Para la gripe en adolescentes, el tratamiento suele incluir medicamentos para reducir la       " +
                                                  "\n fiebre y aliviar los s�ntomas, como el paracetamol (Tempra) o el ibuprofeno. En casos espec�ficos, se pueden        " +
                                                  "\n utilizar antivirales como el oseltamivir (Tamiflu). Tambi�n es recomendable el uso de humidificadores para          " +
                                                  "\n mantener el aire h�medo y facilitar la respiraci�n. El descanso adecuado es clave para la recuperaci�n, por         " +
                                                  "\n lo que se recomienda dormir al menos 8 horas diarias y evitar actividades que puedan generar fatiga. En casos       " +
                                                  "\n m�s severos, si la fiebre persiste por m�s de tres d�as o hay dificultad para respirar, es fundamental acudir       " +
                                                  "\n al m�dico para una evaluaci�n m�s detallada y considerar tratamientos adicionales como antibi�ticos en caso de      " +
                                                  "\n infecciones secundarias. ALIMENTACI�N: Es recomendable el consumo de frutas y verduras que fortalezcan el sistema   " +
                                                  "\n inmune, tales como: Naranjas, ricas en vitamina C, que ayuda a fortalecer el sistema inmunol�gico y reducir la      " +
                                                  "\n duraci�n de los s�ntomas. Fresas, con antioxidantes y vitamina C, esenciales para la protecci�n celular y la        " +
                                                  "\n recuperaci�n del organismo. Pl�tanos, ricos en potasio, que ayuda a reemplazar los electrolitos perdidos por        " +
                                                  "\n fiebre y sudoraci�n. Kiwi, con vitamina C y potasio, que contribuyen a la funci�n inmunol�gica y la recuperaci�n    " +
                                                  "\n del cuerpo. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el       " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento         " +
                                                  "\n adecuado, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita   " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica de baja intensidad, evitando esfuerzos          " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperaci�n. Actividades como caminatas suaves, ejercicios        " +
                                                  "\n de respiraci�n y yoga pueden ser beneficiosos para mantener el cuerpo activo sin comprometer la recuperaci�n.          " +
                                                  "\n Tambi�n se recomienda ejercicios de expansi�n tor�cica y fortalecimiento de los m�sculos respiratorios para            " +
                                                  "\n mejorar la capacidad pulmonar. HIDRATACI�N: Es fundamental el consumo diario de 2 litros de agua (ocho vasos de        " +
                                                  "\n tama�o regular) para mantener una hidrataci�n �ptima y ayudar a fluidificar las secreciones pulmonares. Tambi�n        " +
                                                  "\n se recomienda el consumo de caldos y sopas calientes para facilitar la digesti�n y evitar irritaciones en el           " +
                                                  "\n tracto respiratorio. Adem�s, el consumo de jugos naturales sin az�car puede aportar vitaminas esenciales para          " +
                                                  "\n fortalecer el sistema inmunol�gico. POSIBLE TRATAMIENTO: Para la neumon�a en adolescentes, el tratamiento suele        " +
                                                  "\n incluir antibi�ticos como la amoxicilina o azitromicina en caso de infecciones bacterianas, adem�s de medicamentos     " +
                                                  "\n para reducir la fiebre y aliviar los s�ntomas, como el paracetamol. En casos graves, puede requerirse hospitalizaci�n  " +
                                                  "\n y oxigenoterapia. Tambi�n es importante evitar la exposici�n a contaminantes ambientales y humo de tabaco, ya que      " +
                                                  "\n pueden agravar los s�ntomas. En situaciones m�s severas, el tratamiento puede incluir terapia respiratoria con         " +
                                                  "\n nebulizaciones y monitoreo constante de la funci�n pulmonar. ALIMENTACI�N: Es recomendable el consumo de alimentos     " +
                                                  "\n que fortalezcan el sistema inmune y ayuden a la recuperaci�n, tales como: Naranjas, ricas en vitamina C, que ayuda     " +
                                                  "\n a fortalecer el sistema inmunol�gico y reducir la duraci�n de los s�ntomas. Espinacas, con hierro, que contribuye a    " +
                                                  "\n la producci�n de gl�bulos rojos y mejora la oxigenaci�n del cuerpo. Yogur, con probi�ticos que favorecen la salud      " +
                                                  "\n intestinal y fortalecen el sistema inmune. Tambi�n se recomienda el consumo de alimentos ricos en zinc para mejorar    " +
                                                  "\n la respuesta inmune y acelerar la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad  " +
                                                  "\n en el tratamiento adecuado, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica moderada diariamente, con una duraci�n         " +
                                                  "\n aproximada de 60 minutos, incluyendo ejercicios aer�bicos como caminar, correr o nadar, para mejorar la               " +
                                                  "\n sensibilidad a la insulina. Tambi�n se recomienda la pr�ctica de ejercicios de resistencia como el yoga o el          " +
                                                  "\n entrenamiento ligero con pesas para mejorar el metabolismo de la glucosa. HIDRATACI�N: Es fundamental el consumo      " +
                                                  "\n diario de 2 litros de agua (ocho vasos de tama�o regular) para ayudar a mantener niveles adecuados de glucosa en      " +
                                                  "\n sangre y prevenir la deshidrataci�n. Tambi�n se recomienda el consumo de bebidas sin az�car como infusiones           " +
                                                  "\n naturales o agua con lim�n. Adem�s, el consumo de alimentos con alto contenido de fibra puede ayudar a estabilizar    " +
                                                  "\n los niveles de glucosa en sangre. POSIBLE TRATAMIENTO: Para la diabetes en adolescentes, el tratamiento suele         " +
                                                  "\n incluir insulina en el caso de diabetes tipo 1, mientras que en diabetes tipo 2 puede requerirse metformina y         " +
                                                  "\n cambios en el estilo de vida. Es esencial el monitoreo constante de la glucosa en sangre y el seguimiento m�dico.     " +
                                                  "\n Tambi�n es recomendable la educaci�n sobre el manejo de la enfermedad para evitar complicaciones a largo plazo.       " +
                                                  "\n En algunos casos, se pueden utilizar medicamentos adicionales como inhibidores de SGLT2 o agonistas de GLP-1 para     " +
                                                  "\n mejorar el control de la glucosa. ALIMENTACI�N: Es recomendable el consumo de alimentos que ayuden a regular los      " +
                                                  "\n niveles de glucosa y fortalezcan el organismo, tales como: Avena, rica en fibra soluble, que ayuda a estabilizar      " +
                                                  "\n los niveles de az�car en sangre. Frutos secos, con grasas saludables y magnesio, que contribuyen a la regulaci�n      " +
                                                  "\n de la glucosa. Legumbres, con prote�nas vegetales y fibra, que favorecen la saciedad y el control de la glucosa.      " +
                                                  "\n Tambi�n se recomienda el consumo de alimentos ricos en �cidos grasos Omega-3 para mejorar la funci�n metab�lica y     " +
                                                  "\n reducir la inflamaci�n. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100%    " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad en el tratamiento    " +
                                                  "\n adecuado, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita     " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para         " +
                                                  "\n mantener las v�as respiratorias hidratadas y reducir la viscosidad de las secreciones, lo que facilita la respiraci�n.    " +
                                                  "\n La deshidrataci�n puede agravar los s�ntomas del asma, aumentando la irritaci�n de las v�as respiratorias y la            " +
                                                  "\n frecuencia de los episodios de tos. Es importante consumir l�quidos ricos en electrolitos, como sueros orales y           " +
                                                  "\n caldos, para mantener el equilibrio de minerales esenciales. Tambi�n se recomienda el consumo de infusiones suaves,       " +
                                                  "\n como manzanilla o jengibre, que pueden ayudar a reducir la inflamaci�n y mejorar la funci�n pulmonar. EJERCICIO:          " +
                                                  "\n La actividad f�sica debe ser moderada y adaptada, evitando esfuerzos excesivos que puedan desencadenar crisis asm�ticas,  " +
                                                  "\n ejercicios como nataci�n, yoga y caminatas suaves pueden ser beneficiosos para mejorar la capacidad pulmonar y reducir    " +
                                                  "\n la inflamaci�n. POSIBLE TRATAMIENTO: El tratamiento est�ndar para el asma en adolescentes incluye broncodilatadores       " +
                                                  "\n de alivio r�pido como salbutamol, adem�s de corticosteroides inhalados como fluticasona o budesonida, en M�xico algunas   " +
                                                  "\n marcas reconocidas incluyen Ventolin (salbutamol) y Pulmicort (budesonida), en casos m�s severos pueden utilizarse        " +
                                                  "\n biol�gicos como omalizumab, bajo estricta supervisi�n m�dica. ALIMENTACI�N: Para fortalecer el sistema respiratorio       " +
                                                  "\n y reducir la inflamaci�n, se recomienda el consumo de alimentos ricos en omega-3, antioxidantes y vitamina C. Salm�n      " +
                                                  "\n y ch�a: Contienen aproximadamente 2-4 g de omega-3 por cada 100 g, lo que ayuda a reducir la inflamaci�n de las v�as      " +
                                                  "\n respiratorias. Fresas y ar�ndanos: Aportan 50-90 mg de vitamina C por cada 100 g, cubriendo hasta el 100% de la ingesta   " +
                                                  "\n diaria recomendada, fortaleciendo el sistema inmunol�gico. Jengibre y c�rcuma: Poseen propiedades antiinflamatorias y     " +
                                                  "\n antioxidantes, ayudando a reducir la irritaci�n de las v�as respiratorias. Este es solo un diagn�stico predeterminado     " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean    " +
                                                  "\n completamente correctas, para mayor seguridad se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tama�o regular) para              " +
                                                  "\n mantener la hidrataci�n y reducir la fatiga, lo que es fundamental en el proceso de recuperaci�n. El VIH puede               " +
                                                  "\n provocar fiebre, sudoraci�n nocturna y diarrea, lo que aumenta el riesgo de deshidrataci�n. Es esencial consumir             " +
                                                  "\n l�quidos ricos en electrolitos, como sueros orales y caldos, para reponer los minerales perdidos. Tambi�n se                 " +
                                                  "\n recomienda el consumo de agua con lim�n o infusiones suaves, que pueden ayudar a aliviar las n�useas y mejorar la            " +
                                                  "\n digesti�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada, evitando esfuerzos excesivos que puedan              " +
                                                  "\n debilitar el sistema inmunol�gico, ejercicios como yoga, caminatas suaves y nataci�n pueden ser beneficiosos para            " +
                                                  "\n mejorar la resistencia y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento para el VIH en adolescentes incluye          " +
                                                  "\n terapia antirretroviral (TAR) con medicamentos como tenofovir, emtricitabina y dolutegravir, en M�xico algunas marcas        " +
                                                  "\n reconocidas incluyen Truvada (tenofovir/emtricitabina) y Tivicay (dolutegravir), adem�s se recomienda el uso de              " +
                                                  "\n terapias complementarias como apoyo nutricional y psicol�gico para mejorar la calidad de vida del paciente. ALIMENTACI�N:    " +
                                                  "\n Para fortalecer el sistema inmunol�gico y apoyar la recuperaci�n, se recomienda el consumo de alimentos ricos en             " +
                                                  "\n antioxidantes, prote�nas y �cidos grasos esenciales. Br�coli y zanahorias: Contienen aproximadamente 50-80 mg de             " +
                                                  "\n vitamina C por cada 100 g, lo que representa hasta el 90% de la ingesta diaria recomendada, fortaleciendo el sistema         " +
                                                  "\n inmunol�gico. Salm�n y ch�a: Son fuentes de omega-3, proporcionando entre 2-4 g por cada 100 g, lo que ayuda a reducir       " +
                                                  "\n la inflamaci�n y mejorar la funci�n celular. Frutas y verduras de colores vivos: Como ar�ndanos y espinacas, que son         " +
                                                  "\n ricas en antioxidantes y ayudan a proteger las c�lulas del da�o. Este es solo un diagn�stico predeterminado l�gico,          " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente       " +
                                                  "\n correctas, para mayor seguridad se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes         " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular)          " +
                                                  "\n para mantener la hidrataci�n y ayudar a reducir la inflamaci�n, lo que es fundamental en el proceso de                " +
                                                  "\n recuperaci�n. La gonorrea puede provocar fiebre, dolor abdominal y secreci�n anormal, lo que aumenta el riesgo        " +
                                                  "\n de deshidrataci�n. Es esencial consumir l�quidos ricos en electrolitos, como sueros orales y caldos, para reponer     " +
                                                  "\n los minerales perdidos. Tambi�n se recomienda el consumo de infusiones suaves, como manzanilla o jengibre, que        " +
                                                  "\n pueden ayudar a aliviar las molestias digestivas y mejorar la absorci�n de nutrientes. EJERCICIO: La actividad        " +
                                                  "\n f�sica debe ser muy ligera y supervisada, evitando esfuerzos excesivos que puedan agravar los s�ntomas, ejercicios    " +
                                                  "\n de respiraci�n profunda y movilidad suave pueden ser beneficiosos para mejorar la circulaci�n y reducir la fatiga.    " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento est�ndar para la gonorrea en adolescentes incluye antibi�ticos como ceftriaxona   " +
                                                  "\n y azitromicina, administrados en una sola dosis, en M�xico algunas marcas reconocidas incluyen Rocephin (ceftriaxona)  " +
                                                  "\n y Zithromax (azitromicina), adem�s se recomienda reposo absoluto y una dieta adecuada para mejorar la recuperaci�n.    " +
                                                  "\n ALIMENTACI�N: Para fortalecer el sistema inmunol�gico y apoyar la recuperaci�n, se recomienda el consumo de alimentos  " +
                                                  "\n ricos en vitamina C, antioxidantes y prote�nas. Naranjas y fresas: Contienen aproximadamente 70-90 mg de vitamina C    " +
                                                  "\n por cada 100 g, lo que representa hasta el 100% de la ingesta diaria recomendada, fortaleciendo el sistema inmunol�gico" +
                                                  "\n y ayudando a reducir la inflamaci�n. Espinacas y lentejas: Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g,        " +
                                                  "\n cubriendo entre el 25% y 40% de la ingesta diaria recomendada, lo que ayuda a mejorar la oxigenaci�n celular y         " +
                                                  "\n reducir el cansancio. Carnes magras y huevos: Son una fuente importante de prote�nas, proporcionando entre 20 y        " +
                                                  "\n 25 g por cada 100 g, lo que equivale al 40-50% de la recomendaci�n diaria, esenciales para la regeneraci�n celular     " +
                                                  "\n y el fortalecimiento muscular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza      " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad " +
                                                  "\n se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app       " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: Mantener una hidrataci�n adecuada es esencial para fortalecer el sistema inmunol�gico y reducir la            " +
                                                  "\n inflamaci�n causada por el virus. Se recomienda el consumo diario de agua suficiente, adem�s de infusiones de              " +
                                                  "\n manzanilla y jengibre, que poseen propiedades antiinflamatorias y pueden ayudar a aliviar el malestar. La                  " +
                                                  "\n hidrataci�n tambi�n contribuye a la regeneraci�n celular y a la eliminaci�n de toxinas, lo que puede ayudar                " +
                                                  "\n a reducir la frecuencia de los brotes. EJERCICIO: La actividad f�sica debe ser moderada y enfocada en fortalecer           " +
                                                  "\n el sistema inmunol�gico. Se recomienda realizar ejercicios de bajo impacto, como yoga y caminatas suaves, que ayudan       " +
                                                  "\n a reducir el estr�s, un factor que puede desencadenar brotes del virus. Tambi�n es recomendable practicar ejercicios       " +
                                                  "\n de relajaci�n, como la meditaci�n y la respiraci�n profunda, para mejorar la respuesta del cuerpo ante el virus.           " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para el herpes genital incluye antivirales como aciclovir y valaciclovir, que          " +
                                                  "\n ayudan a reducir la duraci�n y gravedad de los s�ntomas. En casos recurrentes, se puede optar por terapia supresiva,       " +
                                                  "\n que consiste en el uso diario de antivirales para reducir la frecuencia de los brotes y la posibilidad de transmisi�n.     " +
                                                  "\n Tambi�n se recomienda el uso de cremas t�picas con lidoca�na, que pueden aliviar el dolor y la irritaci�n en las           " +
                                                  "\n lesiones. En M�xico, estos medicamentos est�n disponibles en instituciones de salud como el IMSS y el Insabi.              " +
                                                  "\n ALIMENTACI�N: Tambi�n es recomendable el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden             " +
                                                  "\n a reducir la inflamaci�n, tales como frutas c�tricas, ricas en vitamina C, que fortalece el sistema inmunol�gico.          " +
                                                  "\n Verduras de hoja verde, que contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos,           " +
                                                  "\n ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos, que aportan vitamina E, que ayuda a la regeneraci�n     " +
                                                  "\n celular. Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico. Este es        " +
                                                  "\n solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta              " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico     " +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud, si la            " +
                                                  "\n respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece          " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: La hidrataci�n es clave para ayudar al cuerpo a eliminar toxinas y fortalecer el sistema inmunol�gico.        " +
                                                  "\n Se recomienda el consumo diario de agua suficiente, adem�s de infusiones de equin�cea y jengibre, que pueden ayudar        " +
                                                  "\n a mejorar la respuesta inmunol�gica. La hidrataci�n tambi�n contribuye a la circulaci�n sangu�nea, lo que es esencial      " +
                                                  "\n para la recuperaci�n de los tejidos afectados por la enfermedad. EJERCICIO: La actividad f�sica debe ser moderada y        " +
                                                  "\n enfocada en mejorar la circulaci�n sangu�nea. Se recomienda realizar ejercicios aer�bicos suaves, como caminatas y bicicleta" +
                                                  "\n est�tica, que ayudan a mejorar la oxigenaci�n celular y la recuperaci�n del cuerpo. Tambi�n es recomendable practicar      " +
                                                  "\n ejercicios de resistencia, como el entrenamiento con pesas ligeras, para fortalecer el sistema muscular y mejorar la       " +
                                                  "\n respuesta del cuerpo ante la infecci�n. POSIBLE TRATAMIENTO: El tratamiento para la s�filis incluye penicilina benzatina,  " +
                                                  "\n que es el medicamento de primera l�nea. En casos de alergia a la penicilina, se pueden utilizar antibi�ticos alternativos  " +
                                                  "\n como doxiciclina o ceftriaxona. Es fundamental completar el tratamiento indicado por el m�dico para evitar complicaciones  " +
                                                  "\n graves como la s�filis terciaria, que puede afectar el sistema nervioso y cardiovascular. Tambi�n se recomienda realizar   " +
                                                  "\n pruebas de seguimiento para confirmar la eliminaci�n de la bacteria y evitar la transmisi�n a otras personas. Adem�s, en   " +
                                                  "\n casos avanzados de la enfermedad, puede ser necesario monitoreo m�dico frecuente y tratamiento adicional para controlar    " +
                                                  "\n los efectos secundarios en �rganos afectados. En M�xico, estos medicamentos est�n disponibles en instituciones de salud    " +
                                                  "\n como el IMSS y el Insabi. ALIMENTACI�N: Tambi�n es recomendable el consumo de alimentos que fortalezcan el sistema         " +
                                                  "\n inmunol�gico y ayuden a reducir la inflamaci�n, tales como frutas c�tricas, ricas en vitamina C, que fortalece el sistema  " +
                                                  "\n inmunol�gico. Verduras de hoja verde, que contienen antioxidantes y hierro, esenciales para la salud celular. Pescados     " +
                                                  "\n grasos, ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos, que aportan vitamina E, que ayuda a la          " +
                                                  "\n regeneraci�n celular. Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico.   " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta      " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico     " +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud, si la respuesta  " +
                                                  "\n del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece tu visita a la  " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACI�N: La hidrataci�n es fundamental para mantener la salud pulmonar y ayudar a eliminar toxinas del cuerpo.          " +
                                                  "\n Se recomienda el consumo diario de agua suficiente, adem�s de infusiones de tomillo y eucalipto, que pueden ayudar          " +
                                                  "\n a mejorar la funci�n respiratoria. La hidrataci�n tambi�n contribuye a la eliminaci�n de secreciones pulmonares, lo         " +
                                                  "\n que facilita la recuperaci�n del paciente. EJERCICIO: La actividad f�sica debe ser moderada y enfocada en mejorar la        " +
                                                  "\n capacidad pulmonar. Se recomienda realizar ejercicios de respiraci�n profunda, como respiraci�n diafragm�tica y con         " +
                                                  "\n labios fruncidos, que ayudan a mejorar la oxigenaci�n. Tambi�n es beneficioso practicar caminatas suaves, evitando          " +
                                                  "\n ambientes fr�os o contaminados. POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis incluye antibi�ticos como          " +
                                                  "\n isoniazida, rifampicina y etambutol, que deben tomarse durante un per�odo prolongado para garantizar la eliminaci�n         " +
                                                  "\n de la bacteria. En casos de tuberculosis resistente a los medicamentos, se pueden utilizar esquemas de tratamiento m�s      " +
                                                  "\n prolongados con f�rmacos como bedaquilina y linezolid. Es fundamental seguir estrictamente el tratamiento para evitar       " +
                                                  "\n reca�das y la propagaci�n de la enfermedad. Tambi�n se recomienda realizar pruebas de seguimiento para confirmar la         " +
                                                  "\n eliminaci�n de la bacteria y evitar la transmisi�n a otras personas. En casos severos, el tratamiento puede extenderse      " +
                                                  "\n por varios meses, incluyendo monitoreo m�dico frecuente y posibles ajustes en la medicaci�n seg�n la evoluci�n del          " +
                                                  "\n paciente. En M�xico, estos medicamentos est�n disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACI�N: " +
                                                  "\n Tambi�n es recomendable el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n,  " +
                                                  "\n tales como frutas c�tricas, ricas en vitamina C, que fortalece el sistema inmunol�gico. Verduras de hoja verde, que         " + 
                                                  "\n contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos, ricos en Omega-3, con propiedades      " +
                                                  "\n antiinflamatorias. Frutos secos, que aportan vitamina E, que ayuda a la regeneraci�n celular. Yogur natural, fuente de      " +
                                                  "\n probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico. Este es solo un diagn�stico predeterminado        " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean            " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mayor           " +
                                                  "\n seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface    " +
                                                  "\n del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica moderada y adaptada a su condici�n,                   " +
                                                  "\n evitando ejercicios de alto impacto que puedan afectar sus articulaciones. Se sugiere ejercicios de bajo impacto             " +
                                                  "\n como nataci�n, yoga o caminatas suaves, que ayudan a mejorar la movilidad sin generar estr�s en las articulaciones.          " +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua al d�a para mantener una adecuada hidrataci�n         " +
                                                  "\n y ayudar a reducir la inflamaci�n en las articulaciones. Tambi�n es beneficioso el consumo de infusiones de c�rcuma          " +
                                                  "\n y jengibre, que poseen propiedades antiinflamatorias naturales. Adem�s, el consumo de agua con lim�n puede ser �til          " +
                                                  "\n debido a su contenido de vitamina C, que contribuye a la producci�n de col�geno y la salud articular. POSIBLE                " +
                                                  "\n TRATAMIENTO: Para la artritis juvenil, el tratamiento suele incluir antiinflamatorios no esteroides (AINEs) como             " +
                                                  "\n ibuprofeno o naproxeno, adem�s de f�rmacos modificadores de la enfermedad como metotrexato en casos m�s severos.             " +
                                                  "\n Tambi�n pueden utilizarse terapias biol�gicas bajo supervisi�n m�dica. La fisioterapia es clave para mejorar la movilidad    " +
                                                  "\n y reducir el dolor, y en algunos casos se recomienda el uso de suplementos de col�geno y glucosamina para fortalecer las     " +
                                                  "\n articulaciones. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a reducir la inflamaci�n y fortalecer las     " +
                                                  "\n articulaciones, tales como Pescados grasos (salm�n, at�n): ricos en �cidos grasos Omega-3, que poseen propiedades            " +
                                                  "\n antiinflamatorias. Frutas y verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli): ricas en antioxidantes como   " +
                                                  "\n la vitamina C y carotenoides, que pueden proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico. Jengibre:       " +
                                                  "\n contiene compuestos con efectos antiinflamatorios que podr�an ser beneficiosos para las articulaciones. C�rcuma: con su      " +
                                                  "\n componente activo, la curcumina, tambi�n tiene potentes propiedades antiinflamatorias y antioxidantes. Semillas de ch�a      " +
                                                  "\n y linaza: ricas en Omega-3 y fibra, que ayudan a reducir la inflamaci�n. Este es solo un diagn�stico predeterminado l�gico.  " +
                                                  "\n Haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente     " +
                                                  "\n correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su    " +
                                                  "\n salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica ligera, evitando esfuerzos excesivos         " +
                                                  "\n que puedan agravar la tos y la dificultad respiratoria. Se sugiere ejercicios de respiraci�n, caminatas suaves      " +
                                                  "\n y estiramientos para mejorar la capacidad pulmonar. HIDRATACI�N: Debido a la tos persistente y la posible           " +
                                                  "\n deshidrataci�n causada por la tosferina, se recomienda el consumo diario de 2.5 a 3 litros de agua al d�a.          " +
                                                  "\n Tambi�n es beneficioso el consumo de infusiones de miel y jengibre, que pueden ayudar a calmar la garganta          " +
                                                  "\n y reducir la inflamaci�n. Se recomienda el uso de bebidas tibias, como caldos y t�s de hierbas, para aliviar        " +
                                                  "\n la irritaci�n de la garganta. POSIBLE TRATAMIENTO: Para la tosferina en adolescentes, el tratamiento suele          " +
                                                  "\n incluir antibi�ticos como azitromicina, claritromicina o eritromicina, administrados bajo supervisi�n m�dica.       " +
                                                  "\n Tambi�n se recomienda el uso de humidificadores para aliviar la irritaci�n de las v�as respiratorias. En casos      " +
                                                  "\n graves, puede requerirse hospitalizaci�n con administraci�n de ox�geno y l�quidos intravenosos para prevenir la     " +
                                                  "\n deshidrataci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema respiratorio " +
                                                  "\n y aliviar los s�ntomas, tales como Miel: ayuda a calmar la garganta y tiene propiedades antimicrobianas. Jengibre:  " +
                                                  "\n con propiedades antiinflamatorias que pueden aliviar la tos y mejorar la respuesta inmune. Frutas c�tricas (naranjas,  " +
                                                  "\n limones, toronjas): ricas en vitamina C, que ayuda a mejorar la respuesta inmunol�gica. Caldo de pollo: fuente de      " +
                                                  "\n electrolitos y nutrientes esenciales para la recuperaci�n. Ajo: contiene alicina, un compuesto con propiedades         " +
                                                  "\n antimicrobianas que pueden ayudar a combatir infecciones. Este es solo un diagn�stico predeterminado l�gico. Haberlo   " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente         " +
                                                  "\n correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s,       " +
                                                  "\n por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel     " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica ligera, evitando esfuerzos excesivos que       " +
                                                  "\n puedan agravar la inflamaci�n de las gl�ndulas salivales. Se sugiere ejercicios de relajaci�n y estiramientos         " +
                                                  "\n suaves. HIDRATACI�N: Debido a la fiebre y la inflamaci�n de las gl�ndulas salivales, se recomienda el consumo         " +
                                                  "\n diario de 2.5 a 3 litros de agua al d�a. Tambi�n es beneficioso el consumo de infusiones de manzanilla, que pueden    " +
                                                  "\n ayudar a reducir la inflamaci�n, y agua de coco, que aporta electrolitos esenciales. Se recomienda evitar bebidas     " +
                                                  "\n �cidas como jugo de lim�n o naranja, ya que pueden irritar a�n m�s las gl�ndulas salivales. POSIBLE TRATAMIENTO:      " +
                                                  "\n Para las paperas en adolescentes, no existe un tratamiento espec�fico, ya que es una enfermedad viral autolimitada.   " +
                                                  "\n Se recomienda reposo, hidrataci�n y control de fiebre con paracetamol (Tempra) o ibuprofeno. En casos graves, puede   " +
                                                  "\n requerirse hospitalizaci�n con administraci�n de l�quidos intravenosos. Se recomienda aplicar compresas fr�as en la   " +
                                                  "\n zona inflamada para aliviar el dolor y la hinchaz�n. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden   " +
                                                  "\n a reducir la inflamaci�n y fortalecer el sistema inmune, tales como Frutas c�tricas (naranjas, limones, toronjas):    " +
                                                  "\n ricas en vitamina C, que ayuda a mejorar la respuesta inmunol�gica. Papaya: contiene vitamina C y flavonoides que     " +
                                                  "\n pueden ayudar a reducir la inflamaci�n. Jengibre: con propiedades antiinflamatorias que pueden aliviar la fatiga y    " +
                                                  "\n mejorar la respuesta inmune. Miel: ayuda a calmar la garganta y tiene propiedades antimicrobianas. Caldo de vegetales:    " +
                                                  "\n fuente de electrolitos y nutrientes esenciales para la recuperaci�n. Yogur natural: fuente de probi�ticos que ayudan a    " +
                                                  "\n restaurar la flora intestinal y fortalecer el sistema inmune. Este es solo un diagn�stico predeterminado l�gico. Haberlo  " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. " +
                                                  "\n Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si  " +
                                                  "\n la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu  " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica de baja intensidad, evitando esfuerzos              " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperaci�n. Actividades como caminatas suaves, ejercicios            " +
                                                  "\n de respiraci�n y yoga pueden ser beneficiosos para mantener el cuerpo activo sin comprometer la recuperaci�n.              " +
                                                  "\n Tambi�n se recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez muscular causada            " +
                                                  "\n por el reposo prolongado. HIDRATACI�N: Es fundamental el consumo diario de 2 litros de agua (ocho vasos de tama�o          " +
                                                  "\n regular) para mantener una hidrataci�n �ptima y ayudar a aliviar los s�ntomas. Tambi�n se recomienda el consumo de         " +
                                                  "\n infusiones con propiedades antiinflamatorias como el t� de jengibre o manzanilla. POSIBLE TRATAMIENTO: No existe un        " +
                                                  "\n tratamiento espec�fico para el virus del Zika, por lo que se recomienda reposo, hidrataci�n abundante y el uso de          " + 
                                                  "\n analg�sicos como el paracetamol para aliviar los s�ntomas. Tambi�n es importante evitar la exposici�n a mosquitos          " +
                                                  "\n para prevenir la propagaci�n del virus. Se recomienda el uso de repelentes de insectos, ropa de manga larga y mosquiteros  " +
                                                  "\n para reducir el riesgo de picaduras. En casos graves, si se presentan s�ntomas neurol�gicos o complicaciones, es           " +
                                                  "\n fundamental acudir al m�dico para una evaluaci�n m�s detallada. ALIMENTACI�N: Es recomendable el consumo de alimentos      " +
                                                  "\n que ayuden a fortalecer el sistema inmune y mejorar la recuperaci�n, tales como: Naranjas, ricas en vitamina C, que        " +
                                                  "\n ayuda a fortalecer el sistema inmunol�gico y reducir la duraci�n de los s�ntomas. Espinacas, con hierro, que contribuye    " +
                                                  "\n a la producci�n de gl�bulos rojos y mejora la oxigenaci�n del cuerpo. Yogur, con probi�ticos que favorecen la salud        " +
                                                  "\n intestinal y fortalecen el sistema inmune. Tambi�n se recomienda el consumo de alimentos ricos en zinc para mejorar        " +
                                                  "\n la respuesta inmune y acelerar la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado      " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad      " +
                                                  "\n en el tratamiento adecuado, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece  " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica de baja intensidad, evitando esfuerzos             " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperaci�n. Actividades como caminatas suaves, juegos               " +
                                                  "\n tranquilos y ejercicios de respiraci�n pueden ser beneficiosos para mantener el cuerpo activo sin comprometer             " +
                                                  "\n la recuperaci�n. Tambi�n se recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez           " +
                                                  "\n muscular causada por el reposo prolongado. HIDRATACI�N: Es fundamental el consumo diario de 2 a 2.5 litros de             " +
                                                  "\n agua (ocho a diez vasos de tama�o regular) para prevenir la deshidrataci�n causada por la diarrea y ayudar a la           " +
                                                  "\n recuperaci�n del organismo. Adem�s, se recomienda el consumo de sueros de rehidrataci�n oral para reponer los             " +
                                                  "\n electrolitos perdidos. POSIBLE TRATAMIENTO: Para el rotavirus en adolescentes, el tratamiento suele enfocarse en          " +
                                                  "\n la rehidrataci�n y el manejo de los s�ntomas. Se recomienda el consumo de l�quidos abundantes, sueros de rehidrataci�n    " +
                                                  "\n y el uso de medicamentos para aliviar la fiebre y el malestar general. En casos graves, si la deshidrataci�n es severa,   " +
                                                  "\n puede requerirse hospitalizaci�n para administraci�n de l�quidos intravenosos. Tambi�n es importante evitar el consumo    " +
                                                  "\n de alimentos irritantes como productos l�cteos, frituras y bebidas azucaradas, ya que pueden agravar los s�ntomas.        " +
                                                  "\n ALIMENTACI�N: Es recomendable el consumo de alimentos que ayuden a la recuperaci�n intestinal y fortalezcan el sistema    " +
                                                  "\n inmune, tales como: Pl�tanos, ricos en potasio, que ayudan a reponer electrolitos perdidos por la diarrea. Zanahorias,    " +
                                                  "\n con vitamina A, que contribuye a la regeneraci�n de la mucosa intestinal. Yogur, con probi�ticos que favorecen la salud   " +
                                                  "\n intestinal y fortalecen el sistema inmune. Tambi�n se recomienda el consumo de caldos y sopas suaves para facilitar la    " +
                                                  "\n digesti�n y evitar irritaciones en el tracto intestinal. Este es solo un diagn�stico predeterminado l�gico. Haberlo       " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor    " +
                                                  "\n seguridad en el tratamiento adecuado, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L       " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica moderada, evitando esfuerzos excesivos              " +
                                                  "\n y asegurando una recuperaci�n adecuada. Ejercicios como caminatas suaves, estiramientos y yoga pueden ser                  " +
                                                  "\n beneficiosos para mantener el cuerpo activo sin comprometer el tratamiento. Tambi�n se recomienda ejercicios               " +
                                                  "\n de relajaci�n y respiraci�n profunda para reducir el estr�s y mejorar la respuesta inmune. HIDRATACI�N: Es                 " +
                                                  "\n fundamental el consumo diario de 2 litros de agua (ocho vasos de tama�o regular) para ayudar a eliminar toxinas            " +
                                                  "\n y mantener el organismo en equilibrio. Tambi�n se recomienda el consumo de jugos naturales ricos en antioxidantes          " +
                                                  "\n para fortalecer el sistema inmune. POSIBLE TRATAMIENTO: Para la listeriosis en adolescentes, el tratamiento suele          " +
                                                  "\n incluir antibi�ticos como la ampicilina o gentamicina, administrados bajo supervisi�n m�dica. En casos graves, si          " +
                                                  "\n la infecci�n se ha diseminado, puede requerirse hospitalizaci�n y tratamiento intravenoso prolongado. Tambi�n es           " +
                                                  "\n importante evitar el consumo de alimentos contaminados y mantener una higiene adecuada, asegurando la correcta             " +
                                                  "\n manipulaci�n y conservaci�n de los alimentos. Se recomienda evitar el consumo de productos l�cteos sin pasteurizar,        " +
                                                  "\n carnes crudas y pescados ahumados, ya que pueden ser fuentes de infecci�n. En situaciones m�s severas, el tratamiento      " +
                                                  "\n puede incluir monitoreo constante de la funci�n neurol�gica y terapia de soporte para evitar complicaciones.               " +
                                                  "\n ALIMENTACI�N: Es recomendable el consumo de alimentos que ayuden a fortalecer el sistema inmune y mejorar la recuperaci�n, " +
                                                  "\n tales como: Naranjas, ricas en vitamina C, que ayuda a fortalecer el sistema inmunol�gico y reducir la duraci�n de los     " +
                                                  "\n s�ntomas. Espinacas, con hierro, que contribuye a la producci�n de gl�bulos rojos y mejora la oxigenaci�n del cuerpo.      " +
                                                  "\n Yogur, con probi�ticos que favorecen la salud intestinal y fortalecen el sistema inmune. Tambi�n se recomienda el consumo  " +
                                                  "\n de alimentos ricos en zinc para mejorar la respuesta inmune y acelerar la recuperaci�n. Este es solo un diagn�stico        " +
                                                  "\n predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas " +
                                                  "\n sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar m�s de un diagn�stico y consultar  " +
                                                  "\n a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica de baja intensidad, evitando esfuerzos           " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperaci�n. Actividades como caminatas suaves, juegos             " +
                                                  "\n tranquilos y ejercicios de respiraci�n pueden ser beneficiosos para mantener el cuerpo activo sin comprometer           " +
                                                  "\n la recuperaci�n. Tambi�n se recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez         " +
                                                  "\n muscular causada por el reposo prolongado. HIDRATACI�N: Es fundamental el consumo diario de 1.5 a 2 litros de           " +
                                                  "\n agua (seis a ocho vasos de tama�o regular) para prevenir la deshidrataci�n causada por la diarrea y ayudar a la         " +
                                                  "\n recuperaci�n del organismo. Adem�s, se recomienda el consumo de sueros de rehidrataci�n oral para reponer los           " +
                                                  "\n electrolitos perdidos. POSIBLE TRATAMIENTO: Para la shigelosis en adolescentes, el tratamiento suele incluir            " +
                                                  "\n antibi�ticos como la azitromicina o ciprofloxacino en casos graves, adem�s de medidas de rehidrataci�n oral para        " +
                                                  "\n evitar la deshidrataci�n. Tambi�n es importante mantener una higiene adecuada, lavarse las manos frecuentemente         " +
                                                  "\n y evitar el contacto con personas infectadas. En casos leves, el tratamiento puede centrarse en el manejo de los        " +
                                                  "\n s�ntomas con reposo, hidrataci�n y una dieta adecuada. Se recomienda evitar el consumo de alimentos irritantes          " +
                                                  "\n como l�cteos, frituras y comidas muy condimentadas, ya que pueden agravar la diarrea. ALIMENTACI�N: Es recomendable     " +
                                                  "\n el consumo de alimentos que ayuden a la recuperaci�n intestinal y fortalezcan el sistema inmune, tales como: Pl�tanos,  " +
                                                  "\n ricos en potasio, que ayudan a reponer electrolitos perdidos por la diarrea. Zanahorias, con vitamina A, que contribuye " +
                                                  "\n a la regeneraci�n de la mucosa intestinal. Yogur, con probi�ticos que favorecen la salud intestinal y fortalecen el     " +
                                                  "\n sistema inmune. Tambi�n se recomienda el consumo de caldos y sopas suaves para facilitar la digesti�n y evitar          " +
                                                  "\n irritaciones en el tracto intestinal. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no          " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor seguridad      " +
                                                  "\n en el tratamiento adecuado, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes        " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica adaptada a su capacidad respiratoria, evitando        " +
                                                  "\n esfuerzos excesivos y asegurando una respiraci�n controlada. Ejercicios como caminatas suaves, nataci�n, yoga y t�cnicas     " +
                                                  "\n de respiraci�n pueden mejorar la funci�n pulmonar y reducir la fatiga. Tambi�n se recomienda ejercicios de expansi�n         " +
                                                  "\n tor�cica y fortalecimiento de los m�sculos respiratorios para mejorar la capacidad pulmonar. Es importante realizar          " +
                                                  "\n calentamiento previo y enfriamiento posterior para evitar crisis respiratorias. HIDRATACI�N: Es fundamental el consumo       " +
                                                  "\n diario de 1.7 a 2 litros de agua (siete a ocho vasos de tama�o regular) para mantener las v�as respiratorias hidratadas      " +
                                                  "\n y facilitar la eliminaci�n de secreciones. Tambi�n se recomienda el consumo de infusiones con propiedades antiinflamatorias  " +
                                                  "\n como el t� de jengibre o manzanilla. POSIBLE TRATAMIENTO: Para el EPOC en adolescentes, el tratamiento suele incluir         " +
                                                  "\n broncodilatadores como el salbutamol, corticosteroides inhalados como la fluticasona y, en casos graves, oxigenoterapia.     " +
                                                  "\n Tambi�n es importante evitar la exposici�n a contaminantes ambientales y humo de tabaco. En algunos casos, se recomienda     " +
                                                  "\n la rehabilitaci�n pulmonar, que incluye ejercicios espec�ficos para mejorar la capacidad respiratoria y t�cnicas de manejo   " +
                                                  "\n de la enfermedad. En casos m�s severos, puede requerirse el uso de dispositivos de asistencia respiratoria como ventiladores " +
                                                  "\n port�tiles o terapia con ox�geno domiciliario. ALIMENTACI�N: Es recomendable el consumo de alimentos que ayuden a mejorar la " +
                                                  "\n funci�n pulmonar y fortalezcan el sistema inmune, tales como: Pescados grasos (salm�n, at�n), ricos en �cidos grasos Omega-3," +
                                                  "\n que poseen propiedades antiinflamatorias que pueden ayudar a reducir la inflamaci�n de las v�as respiratorias. Frutas y      " +
                                                  "\n verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli), ricas en antioxidantes como la vitamina C y carotenoides, " +
                                                  "\n que pueden proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico. Jengibre, contiene compuestos con efectos     " +
                                                  "\n antiinflamatorios que podr�an ser beneficiosos para las v�as respiratorias. C�rcuma, con su componente activo, la curcumina, " +
                                                  "\n tambi�n tiene potentes propiedades antiinflamatorias y antioxidantes. Tambi�n se recomienda el consumo de alimentos ricos en " +
                                                  "\n fibra para mejorar la digesti�n y evitar la inflamaci�n intestinal. Este es solo un diagn�stico predeterminado l�gico. Haberlo" +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean correctas. Para mayor     " +
                                                  "\n seguridad en el tratamiento adecuado, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia. " +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica moderada, evitando esfuerzos excesivos                " +
                                                  "\n y asegurando una recuperaci�n adecuada. Ejercicios como caminatas suaves, estiramientos y yoga pueden ser                    " +
                                                  "\n beneficiosos para mantener el cuerpo activo sin comprometer el tratamiento. Tambi�n se recomienda ejercicios de              " +
                                                  "\n relajaci�n y respiraci�n profunda para reducir el estr�s y mejorar la respuesta inmune. HIDRATACI�N: Es fundamental          " +
                                                  "\n el consumo diario de 1.5 a 2 litros de agua (seis a ocho vasos de tama�o regular) para ayudar a eliminar toxinas y           " +
                                                  "\n mantener el organismo en equilibrio. Tambi�n se recomienda el consumo de jugos naturales ricos en antioxidantes para         " + 
                                                  "\n fortalecer el sistema inmune. POSIBLE TRATAMIENTO: Para la clamidia en adolescentes, el tratamiento suele incluir            " +
                                                  "\n antibi�ticos como la azitromicina o doxiciclina, administrados bajo supervisi�n m�dica. Tambi�n es importante evitar         " +
                                                  "\n el contacto con personas infectadas y mantener una higiene adecuada. En algunos casos, se recomienda el uso de probi�ticos   " +
                                                  "\n para ayudar a restaurar la flora vaginal y prevenir infecciones recurrentes. En situaciones m�s severas, si la infecci�n     " +
                                                  "\n no responde al tratamiento inicial, puede requerirse un ajuste en la medicaci�n o una evaluaci�n m�s detallada por un        " +
                                                  "\n especialista. ALIMENTACI�N: Es recomendable el consumo de alimentos que ayuden a fortalecer el sistema inmune y mejorar la   " +
                                                  "\n recuperaci�n, tales como: Naranjas, ricas en vitamina C, que ayuda a fortalecer el sistema inmunol�gico y reducir la duraci�n" +
                                                  "\n de los s�ntomas. Espinacas, con hierro, que contribuye a la producci�n de gl�bulos rojos y mejora la oxigenaci�n del cuerpo. " +
                                                  "\n Yogur, con probi�ticos que favorecen la salud intestinal y fortalecen el sistema inmune. Tambi�n se recomienda el consumo de " +
                                                  "\n alimentos ricos en zinc para mejorar la respuesta inmune y acelerar la recuperaci�n. Este es solo un diagn�stico             " +
                                                  "\n predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas   " +
                                                  "\n sean correctas. Para mayor seguridad en el tratamiento adecuado, se recomienda realizar m�s de un diagn�stico y consultar    " +
                                                  "\n a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para        " +
                                                  "\n mantener la hidrataci�n y ayudar a reducir la fiebre y los s�ntomas neurol�gicos, lo que es fundamental en el            " +
                                                  "\n proceso de recuperaci�n. La meningitis bacteriana puede provocar fiebre alta, v�mitos, rigidez en el cuello y            " +
                                                  "\n sensibilidad a la luz, lo que puede llevar a una mayor p�rdida de l�quidos. Es importante que el paciente consuma        " +
                                                  "\n l�quidos ricos en electrolitos, como sueros orales, caldos y jugos naturales sin az�car, para evitar la deshidrataci�n   " +
                                                  "\n y mantener el equilibrio de minerales esenciales. Tambi�n se recomienda el consumo de infusiones suaves, como            " +
                                                  "\n manzanilla o jengibre, que pueden ayudar a aliviar las n�useas y mejorar la digesti�n. EJERCICIO: La actividad           " +
                                                  "\n f�sica debe ser muy ligera y supervisada, evitando esfuerzos excesivos que puedan agravar los s�ntomas, ejercicios       " +
                                                  "\n de respiraci�n profunda y movilidad suave pueden ser beneficiosos para mejorar la capacidad pulmonar y la circulaci�n.   " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento est�ndar para la meningitis bacteriana en adolescentes incluye antibi�ticos como     " +
                                                  "\n ceftriaxona, ampicilina y vancomicina, administrados por v�a intravenosa durante 7 a 14 d�as, en M�xico algunas          " +
                                                  "\n marcas reconocidas incluyen Rocephin (ceftriaxona) y Amikin (amikacina), adem�s se recomienda el uso de corticosteroides " +
                                                  "\n como dexametasona para reducir la inflamaci�n cerebral en casos graves. ALIMENTACI�N: Para fortalecer el sistema         " +
                                                  "\n inmunol�gico y apoyar la recuperaci�n, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y        " +
                                                  "\n prote�nas. Naranjas y fresas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa         " +
                                                  "\n hasta el 100% de la ingesta diaria recomendada, fortaleciendo el sistema inmunol�gico y ayudando a reducir la inflamaci�n." +
                                                  "\n Espinacas y lentejas: Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25% y 40% de la ingesta     " +
                                                  "\n diaria recomendada, lo que ayuda a mejorar la oxigenaci�n celular y reducir el cansancio. Carnes magras y huevos: Son     " +
                                                  "\n una fuente importante de prote�nas, proporcionando entre 20 y 25 g por cada 100 g, lo que equivale al 40-50% de la        " +
                                                  "\n recomendaci�n diaria, esenciales para la regeneraci�n celular y el fortalecimiento muscular. Este es solo un diagn�stico  " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas" +
                                                  "\n sean completamente correctas, para mayor seguridad se recomienda realizar m�s de un diagn�stico y consultar a un m�dico.  " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tama�o regular) para mantener        " +
                                                  "\n la hidrataci�n y ayudar a reducir los efectos secundarios del tratamiento, lo que es fundamental en el proceso de               " +
                                                  "\n recuperaci�n. Los adolescentes con c�ncer pueden experimentar v�mitos, diarrea y sudoraci�n excesiva, lo que aumenta el         " +
                                                  "\n riesgo de deshidrataci�n. Es esencial consumir l�quidos ricos en electrolitos, como sueros orales y caldos, para reponer        " +
                                                  "\n los minerales perdidos. Tambi�n se recomienda el consumo de agua con lim�n o infusiones suaves, que pueden ayudar a aliviar     " +
                                                  "\n las n�useas y mejorar la digesti�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada, evitando esfuerzos excesivos   " +
                                                  "\n que puedan debilitar el sistema inmunol�gico, ejercicios como yoga, caminatas suaves y nataci�n pueden ser beneficiosos         " +
                                                  "\n para mejorar la resistencia y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento para el c�ncer en adolescentes             " +
                                                  "\n depende del tipo espec�fico de c�ncer, pero puede incluir quimioterapia, radioterapia y cirug�a, en M�xico algunas marcas       " +
                                                  "\n reconocidas incluyen Methotrexate (metotrexato) y Vincristine (vincristina), adem�s se recomienda el uso de terapias            " +
                                                  "\n complementarias como apoyo nutricional y psicol�gico para mejorar la calidad de vida del paciente. ALIMENTACI�N: Para           " +
                                                  "\n fortalecer el sistema inmunol�gico y apoyar la recuperaci�n, se recomienda el consumo de alimentos ricos en antioxidantes,      " +
                                                  "\n prote�nas y �cidos grasos esenciales. Br�coli y zanahorias: Contienen aproximadamente 50-80 mg de vitamina C por cada 100 g,    " +
                                                  "\n lo que representa hasta el 90% de la ingesta diaria recomendada, fortaleciendo el sistema inmunol�gico. Salm�n y ch�a:          " +
                                                  "\n Son fuentes de omega-3, proporcionando entre 2-4 g por cada 100 g, lo que ayuda a reducir la inflamaci�n y mejorar la           " +
                                                  "\n funci�n celular. Frutas y verduras de colores vivos: Como ar�ndanos y espinacas, que son ricas en antioxidantes y ayudan        " +
                                                  "\n a proteger las c�lulas del da�o. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%     " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se recomienda    " +
                                                  "\n realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        
                        if(EstaturaFemenino.equals("1.40-1.65 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n Para una mujer adolescente con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidrataci�n      " +
                                                  "\n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda     " +
                                                  "\n actividad f�sica ligera como caminatas suaves, estiramientos y ejercicios de respiraci�n profunda durante 20 a 30 minutos   " +
                                                  "\n al d�a. Esto ayuda a mejorar la oxigenaci�n, reducir la congesti�n y mantener el sistema inmunol�gico activo sin agotar     " +
                                                  "\n al cuerpo. HIDRATACI�N. Es esencial consumir entre 2 y 2.5 litros de agua al d�a para mantener las mucosas hidratadas,      " +
                                                  "\n compensar la p�rdida de l�quidos por fiebre y facilitar la eliminaci�n de toxinas. Tambi�n se recomiendan infusiones        " +
                                                  "\n tibias de jengibre o manzanilla, caldos naturales y jugos c�tricos sin az�car a�adida, ya que aportan vitamina C y ayudan   " +
                                                  "\n a aliviar la irritaci�n de garganta. La hidrataci�n adecuada tambi�n mejora la respuesta del sistema inmunol�gico y reduce  " +
                                                  "\n la duraci�n de los s�ntomas. POSIBLE TRATAMIENTO. El tratamiento incluye antivirales como oseltamivir (Tamiflu),            " +
                                                  "\n especialmente si se administra en las primeras 48 horas desde el inicio de los s�ntomas. Tambi�n se utilizan antipir�ticos  " +
                                                  "\n como paracetamol para controlar la fiebre y el malestar general. En casos leves, el manejo puede ser ambulatorio con        " +
                                                  "\n reposo, hidrataci�n y control de s�ntomas. En adolescentes con factores de riesgo o s�ntomas severos, se recomienda         " +
                                                  "\n vigilancia m�dica estrecha. ALIMENTACI�N RECOMENDADA. Se sugiere una dieta rica en vitamina C, zinc y antioxidantes.        " +
                                                  "\n Frutas c�tricas como naranja y kiwi, verduras como espinaca y br�coli, y alimentos ricos en vitamina E como nueces y        " +
                                                  "\n almendras ayudan a fortalecer el sistema inmune. Este diagn�stico es una referencia l�gica basada en informaci�n m�dica,    " +
                                                  "\n pero no garantiza al 100% que el paciente tenga influenza ni que el tratamiento sea el adecuado. Se recomienda realizar     " +
                                                  "\n m�s de un diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida)    " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n Para una mujer adolescente con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una        " +
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales.        " +
                                                  "\n EJERCICIO. Durante la fase aguda se recomienda reposo. Posteriormente, se pueden incorporar caminatas suaves,     " +
                                                  "\n ejercicios de respiraci�n profunda y estiramientos para mejorar la capacidad pulmonar y prevenir la rigidez       " +
                                                  "\n muscular. HIDRATACI�N. Se aconseja consumir entre 2.5 y 3 litros de agua al d�a para mantener las v�as            " +
                                                  "\n respiratorias hidratadas y facilitar la eliminaci�n de secreciones. Tambi�n se recomiendan caldos naturales,      " +
                                                  "\n infusiones tibias y jugos ricos en vitamina C. Una hidrataci�n adecuada ayuda a fluidificar el moco, mejora       " +
                                                  "\n la oxigenaci�n y favorece la recuperaci�n pulmonar. POSIBLE TRATAMIENTO. El tratamiento incluye antibi�ticos      " +
                                                  "\n como amoxicilina o macr�lidos (azitromicina) en caso de neumon�a at�pica. En adolescentes sanas, la mayor�a       " +
                                                  "\n de los casos pueden tratarse de forma ambulatoria. En casos m�s graves o con comorbilidades, puede requerirse     " +
                                                  "\n hospitalizaci�n. El tratamiento debe iniciarse lo antes posible para evitar complicaciones como derrame pleural   " +
                                                  "\n o insuficiencia respiratoria. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica en prote�nas, vitamina C y   " +
                                                  "\n antioxidantes. Alimentos clave incluyen carnes magras, pescado, frutas c�tricas, verduras de hoja verde y frutos  " +
                                                  "\n secos. Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el   " +
                                                  "\n paciente tenga neumon�a ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y     " +
                                                  "\n consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que     " +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n Para una mujer adolescente con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una         " +
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales.         " +
                                                  "\n EJERCICIO. Se recomienda al menos 60 minutos diarios de actividad f�sica moderada a vigorosa, incluyendo           " +
                                                  "\n ejercicios aer�bicos, de fuerza y de flexibilidad. Esto mejora la sensibilidad a la insulina, regula la            " +
                                                  "\n glucosa y reduce el riesgo cardiovascular. HIDRATACI�N. Es crucial consumir entre 2 y 2.5 litros de agua al        " +
                                                  "\n d�a, especialmente si hay niveles elevados de glucosa, para prevenir la deshidrataci�n. La hiperglucemia puede     " +
                                                  "\n causar micci�n frecuente, lo que incrementa la p�rdida de l�quidos. Se deben evitar bebidas azucaradas y optar     " +
                                                  "\n por agua, infusiones sin az�car o bebidas con electrolitos si hay p�rdida de l�quidos por v�mito o diarrea.        " +
                                                  "\n POSIBLE TRATAMIENTO. El tratamiento puede incluir medicamentos orales como metformina o insulina, dependiendo      " +
                                                  "\n del tipo y severidad. Es fundamental el monitoreo regular de glucosa, el uso de dispositivos como gluc�metros      " +
                                                  "\n o monitores continuos, y la educaci�n continua en el manejo de la enfermedad. El tratamiento debe ser individualizado " +
                                                  "\n y supervisado por un equipo multidisciplinario. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta equilibrada    " +
                                                  "\n con carbohidratos complejos, prote�nas magras, grasas saludables y fibra. Alimentos clave incluyen cereales      " +
                                                  "\n integrales, frutas con bajo �ndice gluc�mico, verduras, legumbres y frutos secos. Se debe evitar el exceso de    " +
                                                  "\n az�cares simples y grasas saturadas. Este diagn�stico es una referencia l�gica basada en informaci�n m�dica,     " +
                                                  "\n pero no garantiza al 100% que el paciente tenga diabetes ni que el tratamiento sea el adecuado. Se recomienda    " +
                                                  "\n realizar m�s de un diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu visita   " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para           " +
                                                  "\n mantener las v�as respiratorias hidratadas y reducir la viscosidad de las secreciones, lo que facilita la respiraci�n.      " +
                                                  "\n La deshidrataci�n puede agravar los s�ntomas del asma, aumentando la irritaci�n de las v�as respiratorias y la              " +
                                                  "\n frecuencia de los episodios de tos. Es importante consumir l�quidos ricos en electrolitos, como sueros orales y             " +
                                                  "\n caldos, para mantener el equilibrio de minerales esenciales. Tambi�n se recomienda el consumo de infusiones suaves,         " +
                                                  "\n como manzanilla o jengibre, que pueden ayudar a reducir la inflamaci�n y mejorar la funci�n pulmonar. EJERCICIO:            " +
                                                  "\n La actividad f�sica debe ser moderada y adaptada, evitando esfuerzos excesivos que puedan desencadenar crisis asm�ticas,    " +
                                                  "\n ejercicios como nataci�n, yoga y caminatas suaves pueden ser beneficiosos para mejorar la capacidad pulmonar y reducir      " +
                                                  "\n la inflamaci�n. POSIBLE TRATAMIENTO: El tratamiento est�ndar para el asma en adolescentes incluye broncodilatadores         " +
                                                  "\n de alivio r�pido como salbutamol, adem�s de corticosteroides inhalados como fluticasona o budesonida, en M�xico algunas     " +
                                                  "\n marcas reconocidas incluyen Ventolin (salbutamol) y Pulmicort (budesonida), en casos m�s severos pueden utilizarse          " +
                                                  "\n biol�gicos como omalizumab, bajo estricta supervisi�n m�dica. ALIMENTACI�N: Para fortalecer el sistema respiratorio         " +
                                                  "\n y reducir la inflamaci�n, se recomienda el consumo de alimentos ricos en omega-3, antioxidantes y vitamina C. Salm�n        " +
                                                  "\n y ch�a: Contienen aproximadamente 2-4 g de omega-3 por cada 100 g, lo que ayuda a reducir la inflamaci�n de las v�as        " +
                                                  "\n respiratorias. Fresas y ar�ndanos: Aportan 50-90 mg de vitamina C por cada 100 g, cubriendo hasta el 100% de la ingesta     " +
                                                  "\n diaria recomendada, fortaleciendo el sistema inmunol�gico. Jengibre y c�rcuma: Poseen propiedades antiinflamatorias y       " +
                                                  "\n antioxidantes, ayudando a reducir la irritaci�n de las v�as respiratorias. Este es solo un diagn�stico predeterminado       " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean            " +
                                                  "\n completamente correctas, para mayor seguridad se recomienda realizar m�s de un diagn�stico y consultar a un m�dico.         " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tama�o regular) para         " +
                                                  "\n mantener la hidrataci�n y reducir la fatiga, lo que es fundamental en el proceso de recuperaci�n. El VIH puede          " +
                                                  "\n provocar fiebre, sudoraci�n nocturna y diarrea, lo que aumenta el riesgo de deshidrataci�n. Es esencial consumir        " +
                                                  "\n l�quidos ricos en electrolitos, como sueros orales y caldos, para reponer los minerales perdidos. Tambi�n se            " +
                                                  "\n recomienda el consumo de agua con lim�n o infusiones suaves, que pueden ayudar a aliviar las n�useas y mejorar la       " +
                                                  "\n digesti�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada, evitando esfuerzos excesivos que puedan         " +
                                                  "\n debilitar el sistema inmunol�gico, ejercicios como yoga, caminatas suaves y nataci�n pueden ser beneficiosos para       " +
                                                  "\n mejorar la resistencia y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento para el VIH en adolescentes incluye     " +
                                                  "\n terapia antirretroviral (TAR) con medicamentos como tenofovir, emtricitabina y dolutegravir, en M�xico algunas marcas   " +
                                                  "\n reconocidas incluyen Truvada (tenofovir/emtricitabina) y Tivicay (dolutegravir), adem�s se recomienda el uso de         " +
                                                  "\n terapias complementarias como apoyo nutricional y psicol�gico para mejorar la calidad de vida del paciente. ALIMENTACI�N:" +
                                                  "\n Para fortalecer el sistema inmunol�gico y apoyar la recuperaci�n, se recomienda el consumo de alimentos ricos en         " +
                                                  "\n antioxidantes, prote�nas y �cidos grasos esenciales. Br�coli y zanahorias: Contienen aproximadamente 50-80 mg de         " +
                                                  "\n vitamina C por cada 100 g, lo que representa hasta el 90% de la ingesta diaria recomendada, fortaleciendo el sistema     " +
                                                  "\n inmunol�gico. Salm�n y ch�a: Son fuentes de omega-3, proporcionando entre 2-4 g por cada 100 g, lo que ayuda a reducir   " +
                                                  "\n la inflamaci�n y mejorar la funci�n celular. Frutas y verduras de colores vivos: Como ar�ndanos y espinacas, que son ricas  " +
                                                  "\n en antioxidantes y ayudan a proteger las c�lulas del da�o. Este es solo un diagn�stico predeterminado l�gico, haberlo       " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas,   " +
                                                  "\n para mayor seguridad se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita" +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular)          " +
                                                  "\n para mantener la hidrataci�n y ayudar a reducir la inflamaci�n, lo que es fundamental en el proceso de                " +
                                                  "\n recuperaci�n. La gonorrea puede provocar fiebre, dolor abdominal y secreci�n anormal, lo que aumenta el riesgo        " +
                                                  "\n de deshidrataci�n. Es esencial consumir l�quidos ricos en electrolitos, como sueros orales y caldos, para             " +
                                                  "\n reponer los minerales perdidos. Tambi�n se recomienda el consumo de infusiones suaves, como manzanilla o jengibre,    " +
                                                  "\n que pueden ayudar a aliviar las molestias digestivas y mejorar la absorci�n de nutrientes. EJERCICIO: La actividad    " +
                                                  "\n f�sica debe ser muy ligera y supervisada, evitando esfuerzos excesivos que puedan agravar los s�ntomas, ejercicios    " +
                                                  "\n de respiraci�n profunda y movilidad suave pueden ser beneficiosos para mejorar la circulaci�n y reducir la fatiga.    " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento est�ndar para la gonorrea en adolescentes incluye antibi�ticos como ceftriaxona   " +
                                                  "\n y azitromicina, administrados en una sola dosis, en M�xico algunas marcas reconocidas incluyen Rocephin (ceftriaxona) " +
                                                  "\n y Zithromax (azitromicina), adem�s se recomienda reposo absoluto y una dieta adecuada para mejorar la recuperaci�n.   " +
                                                  "\n ALIMENTACI�N: Para fortalecer el sistema inmunol�gico y apoyar la recuperaci�n, se recomienda el consumo de alimentos " +
                                                  "\n ricos en vitamina C, antioxidantes y prote�nas. Naranjas y fresas: Contienen aproximadamente 70-90 mg de vitamina C   " +
                                                  "\n por cada 100 g, lo que representa hasta el 100% de la ingesta diaria recomendada, fortaleciendo el sistema inmunol�gico  " +
                                                  "\n y ayudando a reducir la inflamaci�n. Espinacas y lentejas: Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g,        " +
                                                  "\n cubriendo entre el 25% y 40% de la ingesta diaria recomendada, lo que ayuda a mejorar la oxigenaci�n celular y         " +
                                                  "\n reducir el cansancio. Carnes magras y huevos: Son una fuente importante de prote�nas, proporcionando entre 20 y        " +
                                                  "\n 25 g por cada 100 g, lo que equivale al 40-50% de la recomendaci�n diaria, esenciales para la regeneraci�n celular     " +
                                                  "\n y el fortalecimiento muscular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al   " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad    " +
                                                  "\n se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app       " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: Mantener una hidrataci�n adecuada es esencial para fortalecer el sistema inmunol�gico y reducir la         " +
                                                  "\n inflamaci�n causada por el virus. Se recomienda el consumo diario de agua suficiente, adem�s de infusiones de           " +
                                                  "\n manzanilla y jengibre, que poseen propiedades antiinflamatorias y pueden ayudar a aliviar el malestar. La hidrataci�n   " +
                                                  "\n tambi�n contribuye a la regeneraci�n celular y a la eliminaci�n de toxinas, lo que puede ayudar a reducir la            " +
                                                  "\n frecuencia de los brotes. EJERCICIO: La actividad f�sica debe ser moderada y enfocada en fortalecer el sistema          " +
                                                  "\n inmunol�gico. Se recomienda realizar ejercicios de bajo impacto, como yoga y caminatas suaves, que ayudan a reducir     " +
                                                  "\n el estr�s, un factor que puede desencadenar brotes del virus. Tambi�n es recomendable practicar ejercicios de           " +
                                                  "\n relajaci�n, como la meditaci�n y la respiraci�n profunda, para mejorar la respuesta del cuerpo ante el virus.           " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para el herpes genital incluye antivirales como aciclovir y valaciclovir,           " +
                                                  "\n que ayudan a reducir la duraci�n y gravedad de los s�ntomas. En casos recurrentes, se puede optar por terapia           " +
                                                  "\n supresiva, que consiste en el uso diario de antivirales para reducir la frecuencia de los brotes y la posibilidad       " +
                                                  "\n de transmisi�n. Tambi�n se recomienda el uso de cremas t�picas con lidoca�na, que pueden aliviar el dolor y la          " +
                                                  "\n irritaci�n en las lesiones. En M�xico, estos medicamentos est�n disponibles en instituciones de salud como el IMSS      " +
                                                  "\n y el Insabi. ALIMENTACI�N: Tambi�n es recomendable el consumo de alimentos que fortalezcan el sistema inmunol�gico      " +
                                                  "\n y ayuden a reducir la inflamaci�n, tales como frutas c�tricas, ricas en vitamina C, que fortalece el sistema inmunol�gico. " +
                                                  "\n Verduras de hoja verde, que contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos,        " +
                                                  "\n ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos, que aportan vitamina E, que ayuda a la regeneraci�n  " +
                                                  "\n celular. Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico. Este        " +
                                                  "\n es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta        " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico  " +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud, si la         " +
                                                  "\n respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece       " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: La hidrataci�n es clave para ayudar al cuerpo a eliminar toxinas y fortalecer el sistema inmunol�gico.          " +
                                                  "\n Se recomienda el consumo diario de agua suficiente, adem�s de infusiones de equin�cea y jengibre, que pueden ayudar          " +
                                                  "\n a mejorar la respuesta inmunol�gica. La hidrataci�n tambi�n contribuye a la circulaci�n sangu�nea, lo que es esencial        " +
                                                  "\n para la recuperaci�n de los tejidos afectados por la enfermedad. EJERCICIO: La actividad f�sica debe ser moderada y          " +
                                                  "\n enfocada en mejorar la circulaci�n sangu�nea. Se recomienda realizar ejercicios aer�bicos suaves, como caminatas y           " +
                                                  "\n bicicleta est�tica, que ayudan a mejorar la oxigenaci�n celular y la recuperaci�n del cuerpo. Tambi�n es recomendable        " +
                                                  "\n practicar ejercicios de resistencia, como el entrenamiento con pesas ligeras, para fortalecer el sistema muscular y          " +
                                                  "\n mejorar la respuesta del cuerpo ante la infecci�n. POSIBLE TRATAMIENTO: El tratamiento para la s�filis incluye penicilina    " +
                                                  "\n benzatina, que es el medicamento de primera l�nea. En casos de alergia a la penicilina, se pueden utilizar antibi�ticos      " +
                                                  "\n alternativos como doxiciclina o ceftriaxona. Es fundamental completar el tratamiento indicado por el m�dico para evitar      " +
                                                  "\n complicaciones graves como la s�filis terciaria, que puede afectar el sistema nervioso y cardiovascular. Tambi�n se          " +
                                                  "\n recomienda realizar pruebas de seguimiento para confirmar la eliminaci�n de la bacteria y evitar la transmisi�n a otras      " +
                                                  "\n personas. Adem�s, en casos avanzados de la enfermedad, puede ser necesario monitoreo m�dico frecuente y tratamiento          " +
                                                  "\n adicional para controlar los efectos secundarios en �rganos afectados. En M�xico, estos medicamentos est�n disponibles       " +
                                                  "\n en instituciones de salud como el IMSS y el Insabi. ALIMENTACI�N: Tambi�n es recomendable el consumo de alimentos que        " +
                                                  "\n fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como frutas c�tricas, ricas en vitamina C,      " +
                                                  "\n que fortalece el sistema inmunol�gico. Verduras de hoja verde, que contienen antioxidantes y hierro, esenciales para la      " +
                                                  "\n salud celular. Pescados grasos, ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos, que aportan vitamina E,   " +
                                                  "\n que ayuda a la regeneraci�n celular. Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal y el sistema    " +
                                                  "\n inmunol�gico. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente     " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un        " +
                                                  "\n Diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud,        " +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece      " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACI�N: La hidrataci�n es fundamental para mantener la salud pulmonar y ayudar a eliminar toxinas del cuerpo.       " +
                                                  "\n Se recomienda el consumo diario de agua suficiente, adem�s de infusiones de tomillo y eucalipto, que pueden ayudar       " +
                                                  "\n a mejorar la funci�n respiratoria. La hidrataci�n tambi�n contribuye a la eliminaci�n de secreciones pulmonares,         " +
                                                  "\n lo que facilita la recuperaci�n del paciente. EJERCICIO: La actividad f�sica debe ser moderada y enfocada en             " +
                                                  "\n mejorar la capacidad pulmonar. Se recomienda realizar ejercicios de respiraci�n profunda, como respiraci�n               " +
                                                  "\n diafragm�tica y con labios fruncidos, que ayudan a mejorar la oxigenaci�n. Tambi�n es beneficioso practicar              " +
                                                  "\n caminatas suaves, evitando ambientes fr�os o contaminados. POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis      " +
                                                  "\n incluye antibi�ticos como isoniazida, rifampicina y etambutol, que deben tomarse durante un per�odo prolongado para      " +
                                                  "\n garantizar la eliminaci�n de la bacteria. En casos de tuberculosis resistente a los medicamentos, se pueden utilizar     " +
                                                  "\n esquemas de tratamiento m�s prolongados con f�rmacos como bedaquilina y linezolid. Es fundamental seguir                 " +
                                                  "\n estrictamente el tratamiento para evitar reca�das y la propagaci�n de la enfermedad. Tambi�n se recomienda               " +
                                                  "\n realizar pruebas de seguimiento para confirmar la eliminaci�n de la bacteria y evitar la transmisi�n a otras             " +
                                                  "\n personas. En casos severos, el tratamiento puede extenderse por varios meses, incluyendo monitoreo m�dico                " +
                                                  "\n frecuente y posibles ajustes en la medicaci�n seg�n la evoluci�n del paciente. En M�xico, estos medicamentos             " +
                                                  "\n est�n disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACI�N: Tambi�n es recomendable              " +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como            " +
                                                  "\n frutas c�tricas, ricas en vitamina C, que fortalece el sistema inmunol�gico. Verduras de hoja verde, que                 " +
                                                  "\n contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos, ricos en Omega-3, con               " +
                                                  "\n propiedades antiinflamatorias. Frutos secos, que aportan vitamina E, que ayuda a la regeneraci�n celular.                " +
                                                  "\n Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico. Este es               " +
                                                  "\n solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta            " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un               " +
                                                  "\n Diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, por              " +
                                                  "\n su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel           " +
                                                  "\n L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica moderada y adaptada a su condici�n,          " +
                                                  "\n evitando ejercicios de alto impacto que puedan afectar sus articulaciones. Se sugiere ejercicios de bajo            " +
                                                  "\n impacto como nataci�n, yoga o caminatas suaves, que ayudan a mejorar la movilidad sin generar estr�s en las         " +
                                                  "\n articulaciones. HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua al d�a para mantener         " +
                                                  "\n una adecuada hidrataci�n y ayudar a reducir la inflamaci�n en las articulaciones. Tambi�n es beneficioso el         " +
                                                  "\n consumo de infusiones de c�rcuma y jengibre, que poseen propiedades antiinflamatorias naturales. Adem�s, el         " +
                                                  "\n consumo de agua con lim�n puede ser �til debido a su contenido de vitamina C, que contribuye a la producci�n        " +
                                                  "\n de col�geno y la salud articular. POSIBLE TRATAMIENTO: Para la artritis juvenil, el tratamiento suele incluir       " +
                                                  "\n antiinflamatorios no esteroides (AINEs) como ibuprofeno o naproxeno, adem�s de f�rmacos modificadores de la         " +
                                                  "\n enfermedad como metotrexato en casos m�s severos. Tambi�n pueden utilizarse terapias biol�gicas bajo supervisi�n    " +
                                                  "\n m�dica. La fisioterapia es clave para mejorar la movilidad y reducir el dolor, y en algunos casos se recomienda     " +
                                                  "\n el uso de suplementos de col�geno y glucosamina para fortalecer las articulaciones. ALIMENTACI�N: Se recomienda     " +
                                                  "\n el consumo de alimentos que ayuden a reducir la inflamaci�n y fortalecer las articulaciones, tales como Pescados    " +
                                                  "\n grasos (salm�n, at�n): ricos en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias. Frutas y verduras  " +
                                                  "\n de colores vivos (ar�ndanos, fresas, espinacas, br�coli): ricas en antioxidantes como la vitamina C y carotenoides, " +
                                                  "\n que pueden proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico. Jengibre: contiene compuestos con    " +
                                                  "\n efectos antiinflamatorios que podr�an ser beneficiosos para las articulaciones. C�rcuma: con su componente activo,  " +
                                                  "\n la curcumina, tambi�n tiene potentes propiedades antiinflamatorias y antioxidantes. Semillas de ch�a y linaza:      " +
                                                  "\n ricas en Omega-3 y fibra, que ayudan a reducir la inflamaci�n. Este es solo un diagn�stico predeterminado l�gico.   " +
                                                  "\n Haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean            " +
                                                  "\n completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento        " +
                                                  "\n adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda             " +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica ligera, evitando esfuerzos excesivos que        " +
                                                  "\n puedan agravar la tos y la dificultad respiratoria. Se sugiere ejercicios de respiraci�n, caminatas suaves y           " +
                                                  "\n estiramientos para mejorar la capacidad pulmonar. HIDRATACI�N: Debido a la tos persistente y la posible deshidrataci�n " +
                                                  "\n causada por la tosferina, se recomienda el consumo diario de 2.5 a 3 litros de agua al d�a. Tambi�n es beneficioso     " +
                                                  "\n el consumo de infusiones de miel y jengibre, que pueden ayudar a calmar la garganta y reducir la inflamaci�n.          " +
                                                  "\n Se recomienda el uso de bebidas tibias, como caldos y t�s de hierbas, para aliviar la irritaci�n de la garganta.       " +
                                                  "\n POSIBLE TRATAMIENTO: Para la tosferina en adolescentes, el tratamiento suele incluir antibi�ticos como azitromicina,   " +
                                                  "\n claritromicina o eritromicina, administrados bajo supervisi�n m�dica. Tambi�n se recomienda el uso de humidificadores  " +
                                                  "\n para aliviar la irritaci�n de las v�as respiratorias. En casos graves, puede requerirse hospitalizaci�n con            " +
                                                  "\n administraci�n de ox�geno y l�quidos intravenosos para prevenir la deshidrataci�n. ALIMENTACI�N: Se recomienda         " +
                                                  "\n el consumo de alimentos que ayuden a fortalecer el sistema respiratorio y aliviar los s�ntomas, tales como Miel:       " +
                                                  "\n ayuda a calmar la garganta y tiene propiedades antimicrobianas. Jengibre: con propiedades antiinflamatorias que        " +
                                                  "\n pueden aliviar la tos y mejorar la respuesta inmune. Frutas c�tricas (naranjas, limones, toronjas): ricas en           " +
                                                  "\n vitamina C, que ayuda a mejorar la respuesta inmunol�gica. Caldo de pollo: fuente de electrolitos y nutrientes         " +
                                                  "\n esenciales para la recuperaci�n. Ajo: contiene alicina, un compuesto con propiedades antimicrobianas que pueden        " +
                                                  "\n ayudar a combatir infecciones. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza      " +
                                                  "\n al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda        " +
                                                  "\n realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta  " +
                                                  "\n del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita       " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica ligera, evitando esfuerzos excesivos que       " +
                                                  "\n puedan agravar la inflamaci�n de las gl�ndulas salivales. Se sugiere ejercicios de relajaci�n y estiramientos         " +
                                                  "\n suaves. HIDRATACI�N: Debido a la fiebre y la inflamaci�n de las gl�ndulas salivales, se recomienda el consumo         " +
                                                  "\n diario de 2.5 a 3 litros de agua al d�a. Tambi�n es beneficioso el consumo de infusiones de manzanilla, que pueden    " +
                                                  "\n ayudar a reducir la inflamaci�n, y agua de coco, que aporta electrolitos esenciales. Se recomienda evitar bebidas     " + 
                                                  "\n �cidas como jugo de lim�n o naranja, ya que pueden irritar a�n m�s las gl�ndulas salivales. POSIBLE TRATAMIENTO:      " +
                                                  "\n Para las paperas en adolescentes, no existe un tratamiento espec�fico, ya que es una enfermedad viral autolimitada.   " +
                                                  "\n Se recomienda reposo, hidrataci�n y control de fiebre con paracetamol (Tempra) o ibuprofeno. En casos graves,         " +
                                                  "\n puede requerirse hospitalizaci�n con administraci�n de l�quidos intravenosos. Se recomienda aplicar compresas         " +
                                                  "\n fr�as en la zona inflamada para aliviar el dolor y la hinchaz�n. ALIMENTACI�N: Se recomienda el consumo de            " +
                                                  "\n alimentos que ayuden a reducir la inflamaci�n y fortalecer el sistema inmune, tales como Frutas c�tricas (naranjas,   " +
                                                  "\n limones, toronjas): ricas en vitamina C, que ayuda a mejorar la respuesta inmunol�gica. Papaya: contiene vitamina C   " +
                                                  "\n y flavonoides que pueden ayudar a reducir la inflamaci�n. Jengibre: con propiedades antiinflamatorias que pueden      " +
                                                  "\n aliviar la fatiga y mejorar la respuesta inmune. Miel: ayuda a calmar la garganta y tiene propiedades antimicrobianas." +
                                                  "\n Caldo de vegetales: fuente de electrolitos y nutrientes esenciales para la recuperaci�n. Yogur natural: fuente de     " +
                                                  "\n probi�ticos que ayudan a restaurar la flora intestinal y fortalecer el sistema inmune. Este es solo un diagn�stico    " +
                                                  "\n predeterminado l�gico. Haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las       " +
                                                  "\n respuestas sean completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el      " +
                                                  "\n tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda   " +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N: Mantener una hidrataci�n adecuada es esencial para aliviar los s�ntomas del virus del Zika. Se        " +
                                                  "\n recomienda el consumo diario de agua suficiente, adem�s de infusiones de manzanilla y jengibre, que poseen         " +
                                                  "\n propiedades antiinflamatorias y pueden ayudar a reducir el malestar. EJERCICIO: Durante la enfermedad, se          " +
                                                  "\n recomienda reposo absoluto para evitar el desgaste energ�tico y permitir que el cuerpo se recupere. Una vez        " +
                                                  "\n que los s�ntomas comienzan a mejorar, es recomendable realizar ejercicios de movilidad suave, como estiramientos   " +
                                                  "\n ligeros y caminatas cortas, para estimular la circulaci�n y evitar la fatiga muscular causada por el reposo        " +
                                                  "\n prolongado. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para el Zika, pero se recomienda reposo,      " +
                                                  "\n analg�sicos como paracetamol, y ingesta abundante de l�quidos para aliviar los s�ntomas. Tambi�n se pueden         " +
                                                  "\n administrar antihistam�nicos para controlar el prurito asociado con el exantema. En M�xico, estos medicamentos     " +
                                                  "\n est�n disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACI�N: Tambi�n es recomendable el     " +
                                                  "\n consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como frutas  " +
                                                  "\n c�tricas, ricas en vitamina C, que fortalece el sistema inmunol�gico. Verduras de hoja verde, que contienen        " +
                                                  "\n antioxidantes y hierro, esenciales para la salud celular. Pescados grasos, ricos en Omega-3, con propiedades       " +
                                                  "\n antiinflamatorias. Frutos secos, que aportan vitamina E, que ayuda a la regeneraci�n celular. Yogur natural,       " +
                                                  "\n fuente de probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico. Este es solo un diagn�stico    " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las    " +
                                                  "\n respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para   " +
                                                  "\n establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud, si la respuesta del      " +
                                                  "\n diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece tu visita      " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N: La hidrataci�n es clave para combatir la deshidrataci�n causada por la diarrea intensa, uno de         " +
                                                  "\n los s�ntomas principales del rotavirus. Se recomienda el consumo diario de agua suficiente para reponer los         " +
                                                  "\n l�quidos perdidos y evitar complicaciones como el desequilibrio electrol�tico. Adem�s, es recomendable el uso       " +
                                                  "\n de soluciones de rehidrataci�n oral para recuperar los minerales esenciales. EJERCICIO: Durante la fase aguda       " +
                                                  "\n de la enfermedad, se recomienda reposo absoluto para evitar el desgaste energ�tico y permitir que el cuerpo se      " +
                                                  "\n recupere. Una vez que los s�ntomas comienzan a mejorar, es recomendable realizar ejercicios de movilidad suave,     " +
                                                  "\n como estiramientos ligeros y caminatas cortas, para estimular la circulaci�n y evitar la fatiga muscular causada    " +
                                                  "\n por el reposo prolongado. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para el rotavirus, pero se       " +
                                                  "\n recomienda rehidrataci�n constante, reposo, y en casos graves, hospitalizaci�n para administraci�n intravenosa      " +
                                                  "\n de l�quidos. En M�xico, estos medicamentos est�n disponibles en instituciones de salud como el IMSS y el Insabi.    " +
                                                  "\n ALIMENTACI�N: Tambi�n es recomendable el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a    " +
                                                  "\n la recuperaci�n intestinal, tales como pl�tanos, ricos en potasio, que ayudan a reponer electrolitos. Arroz blanco, " +
                                                  "\n fuente de carbohidratos de f�cil digesti�n, que contribuyen a la recuperaci�n intestinal. Manzanas, ricas en pectina,  " +
                                                  "\n que ayudan a regular la digesti�n y reducir la diarrea. Zanahorias, con vitamina A, que favorece la regeneraci�n       " +
                                                  "\n celular. Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico. Este       " +
                                                  "\n es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta       " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico " +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud, si la    " +
                                                  "\n respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece  " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N: La hidrataci�n es fundamental para combatir la fiebre y los s�ntomas gastrointestinales causados        " +
                                                  "\n por la listeriosis. Se recomienda el consumo diario de agua suficiente, adem�s de infusiones de manzanilla y         " +
                                                  "\n jengibre, que poseen propiedades antiinflamatorias y pueden ayudar a aliviar el malestar. EJERCICIO: Durante         " + 
                                                  "\n la enfermedad, se recomienda reposo absoluto para evitar el desgaste energ�tico y permitir que el cuerpo se          " +
                                                  "\n recupere. Una vez que los s�ntomas comienzan a mejorar, es recomendable realizar ejercicios de movilidad suave,      " +
                                                  "\n como estiramientos ligeros y caminatas cortas, para estimular la circulaci�n y evitar la fatiga muscular causada     " +
                                                  "\n por el reposo prolongado. POSIBLE TRATAMIENTO: El tratamiento para la listeriosis incluye antibi�ticos como          " +
                                                  "\n ampicilina y gentamicina, dependiendo de la gravedad del caso. En casos severos, se puede requerir hospitalizaci�n   " +
                                                  "\n y administraci�n intravenosa de antibi�ticos. En M�xico, estos medicamentos est�n disponibles en instituciones de    " +
                                                  "\n salud como el IMSS y el Insabi. ALIMENTACI�N: Tambi�n es recomendable el consumo de alimentos que fortalezcan el     " +
                                                  "\n sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como frutas c�tricas, ricas en vitamina C, que fortalece  " +
                                                  "\n el sistema inmunol�gico. Verduras de hoja verde, que contienen antioxidantes y hierro, esenciales para la salud         " +
                                                  "\n celular. Pescados grasos, ricos en Omega-3, con propiedades antiinflamatorias. Frutos secos, que aportan vitamina E,    " +
                                                  "\n que ayuda a la regeneraci�n celular. Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal y el       " +
                                                  "\n sistema inmunol�gico. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que    " +
                                                  "\n el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar " +
                                                  "\n m�s de un Diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, por   " +
                                                  "\n su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L.       " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica de baja intensidad, evitando esfuerzos       " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperaci�n. Actividades como caminatas suaves, juegos         " +
                                                  "\n tranquilos y ejercicios de respiraci�n pueden ser beneficiosos para mantener el cuerpo activo sin comprometer       " +
                                                  "\n la recuperaci�n. Tambi�n se recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez     " +
                                                  "\n muscular causada por el reposo prolongado. HIDRATACI�N: Es fundamental el consumo diario de 1.5 a 2 litros de       " +
                                                  "\n agua para prevenir la deshidrataci�n causada por la diarrea y ayudar a la recuperaci�n del organismo. Adem�s,       " +
                                                  "\n se recomienda el consumo de sueros de rehidrataci�n oral para reponer los electrolitos perdidos. Se debe evitar     " +
                                                  "\n el consumo de bebidas con cafe�na o azucaradas, ya que pueden afectar la recuperaci�n. POSIBLE TRATAMIENTO: Para    " +
                                                  "\n la shigelosis en adolescentes, el tratamiento suele incluir antibi�ticos como la azitromicina o ciprofloxacino      " +
                                                  "\n en casos graves, adem�s de medidas de rehidrataci�n oral para evitar la deshidrataci�n. Tambi�n es importante       " +
                                                  "\n mantener una higiene adecuada, lavarse las manos frecuentemente y evitar el contacto con personas infectadas.       " +
                                                  "\n En casos leves, el tratamiento puede centrarse en el manejo de los s�ntomas con reposo, hidrataci�n y una dieta     " +
                                                  "\n adecuada. Se recomienda evitar el consumo de alimentos irritantes como l�cteos, frituras y comidas muy condimentadas, " +
                                                  "\n ya que pueden agravar la diarrea. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a la recuperaci�n    " +
                                                  "\n intestinal y fortalezcan el sistema inmune, tales como pl�tanos ricos en potasio que ayudan a reponer electrolitos    " +
                                                  "\n perdidos por la diarrea, zanahorias con vitamina A que contribuyen a la regeneraci�n de la mucosa intestinal, yogur   " +
                                                  "\n con probi�ticos que favorecen la salud intestinal y fortalecen el sistema inmune, adem�s de caldos y sopas suaves     " +
                                                  "\n para facilitar la digesti�n y evitar irritaciones en el tracto intestinal. Tambi�n se recomienda el consumo de arroz  " +
                                                  "\n y manzana para ayudar a regular el tr�nsito intestinal. Este es solo un diagn�stico predeterminado l�gico. Haberlo    " +
                                                  "\n consultado no garantiza al cien por ciento que la paciente tenga esta enfermedad ni que las respuestas sean      " +
                                                  "\n completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento     " +
                                                  "\n adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar" +
                                                  "\n a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica adaptada a su capacidad respiratoria, evitando     " +
                                                  "\n esfuerzos excesivos y asegurando una respiraci�n controlada. Ejercicios como caminatas suaves, nataci�n, yoga y t�cnicas  " +
                                                  "\n de respiraci�n pueden mejorar la funci�n pulmonar y reducir la fatiga. Tambi�n se recomienda ejercicios de expansi�n      " +
                                                  "\n tor�cica y fortalecimiento de los m�sculos respiratorios para mejorar la capacidad pulmonar. Es importante realizar       " +
                                                  "\n calentamiento previo y enfriamiento posterior para evitar crisis respiratorias. HIDRATACI�N: Es fundamental el consumo    " +
                                                  "\n diario de 1.7 a 2 litros de agua para mantener las v�as respiratorias hidratadas y facilitar la eliminaci�n de secreciones. " +
                                                  "\n Tambi�n se recomienda el consumo de infusiones con propiedades antiinflamatorias como el t� de jengibre o manzanilla.       " +
                                                  "\n Se debe evitar el consumo de bebidas fr�as o con gas, ya que pueden irritar las v�as respiratorias. POSIBLE TRATAMIENTO:    " +
                                                  "\n Para el EPOC en adolescentes, el tratamiento suele incluir broncodilatadores como el salbutamol, corticosteroides inhalados " +
                                                  "\n como la fluticasona y, en casos graves, oxigenoterapia. Tambi�n es importante evitar la exposici�n a contaminantes      " +
                                                  "\n ambientales y humo de tabaco. En algunos casos, se recomienda la rehabilitaci�n pulmonar, que incluye ejercicios        " +
                                                  "\n espec�ficos para mejorar la capacidad respiratoria y t�cnicas de manejo de la enfermedad. En casos m�s severos, puede   " +
                                                  "\n requerirse el uso de dispositivos de asistencia respiratoria como ventiladores port�tiles o terapia con ox�geno         " +
                                                  "\n domiciliario. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a mejorar la funci�n pulmonar y fortalezcan" +
                                                  "\n el sistema inmune, tales como pescados grasos como el salm�n y el at�n, ricos en �cidos grasos Omega-3 que poseen       " +
                                                  "\n propiedades antiinflamatorias que pueden ayudar a reducir la inflamaci�n de las v�as respiratorias, frutas y verduras   " +
                                                  "\n de colores vivos como ar�ndanos, fresas, espinacas y br�coli, ricas en antioxidantes como la vitamina C y carotenoides  " +
                                                  "\n que pueden proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico, jengibre que contiene compuestos con     " +
                                                  "\n efectos antiinflamatorios que podr�an ser beneficiosos para las v�as respiratorias, c�rcuma con su componente activo    " +
                                                  "\n la curcumina que tiene potentes propiedades antiinflamatorias y antioxidantes, adem�s de alimentos ricos en fibra para  " +
                                                  "\n mejorar la digesti�n y evitar la inflamaci�n intestinal. Este es solo un diagn�stico predeterminado l�gico. Haberlo     " +
                                                  "\n consultado no garantiza al cien por ciento que la paciente tenga esta enfermedad ni que las respuestas sean completamente " +
                                                  "\n correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su   " +
                                                  "\n salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes      " +
                                                  "\n agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica moderada, evitando esfuerzos excesivos y asegurando    " +
                                                  "\n una recuperaci�n adecuada. Ejercicios como caminatas suaves, estiramientos y yoga pueden ser beneficiosos para mantener el    " +
                                                  "\n cuerpo activo sin comprometer el tratamiento. Tambi�n se recomienda ejercicios de relajaci�n y respiraci�n profunda para      " +
                                                  "\n reducir el estr�s y mejorar la respuesta inmune. HIDRATACI�N: Es fundamental el consumo diario de 1.5 a 2 litros de agua      " +
                                                  "\n para ayudar a eliminar toxinas y mantener el organismo en equilibrio. Tambi�n se recomienda el consumo de jugos naturales     " +
                                                  "\n ricos en antioxidantes para fortalecer el sistema inmune. Se debe evitar el consumo de bebidas alcoh�licas y azucaradas,      " +
                                                  "\n ya que pueden afectar la recuperaci�n. POSIBLE TRATAMIENTO: Para la clamidia en adolescentes, el tratamiento suele incluir    " +
                                                  "\n antibi�ticos como la azitromicina o doxiciclina, administrados bajo supervisi�n m�dica. Tambi�n es importante evitar el       " +
                                                  "\n contacto con personas infectadas y mantener una higiene adecuada. En algunos casos, se recomienda el uso de probi�ticos       " +
                                                  "\n para ayudar a restaurar la flora vaginal y prevenir infecciones recurrentes. En situaciones m�s severas, si la infecci�n      " +
                                                  "\n no responde al tratamiento inicial, puede requerirse un ajuste en la medicaci�n o una evaluaci�n m�s detallada por un         " +
                                                  "\n especialista. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmune y mejorar la      " +
                                                  "\n recuperaci�n, tales como naranjas ricas en vitamina C, que ayuda a fortalecer el sistema inmunol�gico y reducir la duraci�n   " +
                                                  "\n de los s�ntomas, espinacas con hierro que contribuyen a la producci�n de gl�bulos rojos y mejora la oxigenaci�n del cuerpo,   " +
                                                  "\n yogur con probi�ticos que favorecen la salud intestinal y fortalecen el sistema inmune, adem�s de alimentos ricos en zinc     " +
                                                  "\n para mejorar la respuesta inmune y acelerar la recuperaci�n. Tambi�n se recomienda el consumo de ajo y cebolla por sus        " +
                                                  "\n propiedades antimicrobianas. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al cien       " +
                                                  "\n por ciento que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar   " +
                                                  "\n m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico  " +
                                                  "\n no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera    " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular)           " +
                                                  "\n para mantener la hidrataci�n y ayudar a reducir la fiebre y los s�ntomas neurol�gicos, lo que es fundamental           " +
                                                  "\n en el proceso de recuperaci�n. La meningitis bacteriana puede provocar fiebre alta, v�mitos, rigidez en el             " +
                                                  "\n cuello y sensibilidad a la luz, lo que puede llevar a una mayor p�rdida de l�quidos. Es importante que el              " +
                                                  "\n paciente consuma l�quidos ricos en electrolitos, como sueros orales, caldos y jugos naturales sin az�car,              " +
                                                  "\n para evitar la deshidrataci�n y mantener el equilibrio de minerales esenciales. Tambi�n se recomienda el               " +
                                                  "\n consumo de infusiones suaves, como manzanilla o jengibre, que pueden ayudar a aliviar las n�useas y mejorar            " +
                                                  "\n la digesti�n. EJERCICIO: La actividad f�sica debe ser muy ligera y supervisada, evitando esfuerzos excesivos           " +
                                                  "\n que puedan agravar los s�ntomas, ejercicios de respiraci�n profunda y movilidad suave pueden ser beneficiosos          " +
                                                  "\n para mejorar la capacidad pulmonar y la circulaci�n. POSIBLE TRATAMIENTO: El tratamiento est�ndar para la              " +
                                                  "\n meningitis bacteriana en adolescentes incluye antibi�ticos como ceftriaxona, ampicilina y vancomicina,                 " +
                                                  "\n administrados por v�a intravenosa durante 7 a 14 d�as, en M�xico algunas marcas reconocidas incluyen Rocephin          " +
                                                  "\n (ceftriaxona) y Amikin (amikacina), adem�s se recomienda el uso de corticosteroides como dexametasona para             " +
                                                  "\n reducir la inflamaci�n cerebral en casos graves. ALIMENTACI�N: Para fortalecer el sistema inmunol�gico y apoyar        " +
                                                  "\n la recuperaci�n, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y prote�nas. Naranjas        " +
                                                  "\n y fresas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa hasta el 100% de la       " +
                                                  "\n ingesta diaria recomendada, fortaleciendo el sistema inmunol�gico y ayudando a reducir la inflamaci�n. Espinacas       " +
                                                  "\n y lentejas: Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25% y 40% de la ingesta diaria     " +
                                                  "\n recomendada, lo que ayuda a mejorar la oxigenaci�n celular y reducir el cansancio. Carnes magras y huevos: Son una     " +
                                                  "\n fuente importante de prote�nas, proporcionando entre 20 y 25 g por cada 100 g, lo que equivale al 40-50% de la         " +
                                                  "\n recomendaci�n diaria, esenciales para la regeneraci�n celular y el fortalecimiento muscular. Este es solo un           " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad       " +
                                                  "\n ni que las respuestas sean completamente correctas, para mayor seguridad se recomienda realizar m�s de un diagn�stico  " +
                                                  "\n y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tama�o regular) para    " +
                                                  "\n mantener la hidrataci�n y ayudar a reducir los efectos secundarios del tratamiento, lo que es fundamental en el    " +
                                                  "\n proceso de recuperaci�n. Los adolescentes con c�ncer pueden experimentar v�mitos, diarrea y sudoraci�n excesiva,   " +
                                                  "\n lo que aumenta el riesgo de deshidrataci�n. Es esencial consumir l�quidos ricos en electrolitos, como sueros       " +
                                                  "\n orales y caldos, para reponer los minerales perdidos. Tambi�n se recomienda el consumo de agua con lim�n o         " +
                                                  "\n infusiones suaves, que pueden ayudar a aliviar las n�useas y mejorar la digesti�n. EJERCICIO: La actividad         " +
                                                  "\n f�sica debe ser moderada y adaptada, evitando esfuerzos excesivos que puedan debilitar el sistema inmunol�gico,    " +
                                                  "\n ejercicios como yoga, caminatas suaves y nataci�n pueden ser beneficiosos para mejorar la resistencia y reducir    " +
                                                  "\n la fatiga. POSIBLE TRATAMIENTO: El tratamiento para el c�ncer en adolescentes depende del tipo espec�fico de       " +
                                                  "\n c�ncer, pero puede incluir quimioterapia, radioterapia y cirug�a, en M�xico algunas marcas reconocidas incluyen    " +
                                                  "\n Methotrexate (metotrexato) y Vincristine (vincristina), adem�s se recomienda el uso de terapias complementarias    " +
                                                  "\n como apoyo nutricional y psicol�gico para mejorar la calidad de vida del paciente. ALIMENTACI�N: Para fortalecer   " +
                                                  "\n el sistema inmunol�gico y apoyar la recuperaci�n, se recomienda el consumo de alimentos ricos en antioxidantes,    " +
                                                  "\n prote�nas y �cidos grasos esenciales. Br�coli y zanahorias: Contienen aproximadamente 50-80 mg de vitamina C por   " +
                                                  "\n cada 100 g, lo que representa hasta el 90% de la ingesta diaria recomendada, fortaleciendo el sistema inmunol�gico." +
                                                  "\n Salm�n y ch�a: Son fuentes de omega-3, proporcionando entre 2-4 g por cada 100 g, lo que ayuda a reducir la        " +
                                                  "\n inflamaci�n y mejorar la funci�n celular. Frutas y verduras de colores vivos: Como ar�ndanos y espinacas, que      " +
                                                  "\n son ricas en antioxidantes y ayudan a proteger las c�lulas del da�o. Este es solo un diagn�stico predeterminado    " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean   " +
                                                  "\n completamente correctas, para mayor seguridad se recomienda realizar m�s de un diagn�stico y consultar a un m�dico." +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.30-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica moderada a intensa diariamente, con una            " +
                                                  "\n duraci�n aproximada de 60 minutos, aunque esta cantidad puede ajustarse seg�n su condici�n. Actividades como              " +
                                                  "\n caminatas, ejercicios aer�bicos, nataci�n y deportes de bajo impacto pueden ser beneficiosos para fortalecer su           " +
                                                  "\n sistema inmunol�gico y mejorar la recuperaci�n. Tambi�n se recomienda ejercicios de respiraci�n profunda y relajaci�n     " +
                                                  "\n para mejorar la oxigenaci�n y reducir el estr�s, lo que puede favorecer la recuperaci�n. HIDRATACI�N: Es fundamental      " +
                                                  "\n el consumo diario de 2 litros de agua para mantener una hidrataci�n adecuada y ayudar al cuerpo a combatir la enfermedad. " +
                                                  "\n Tambi�n se recomienda el consumo de infusiones calientes como t� de jengibre o manzanilla para aliviar los s�ntomas       " +
                                                  "\n respiratorios. Adem�s, el consumo de caldos y sopas calientes puede ayudar a mantener la hidrataci�n y proporcionar       " +
                                                  "\n nutrientes esenciales para la recuperaci�n. POSIBLE TRATAMIENTO: Para la gripe en adolescentes, el tratamiento suele      " +
                                                  "\n incluir medicamentos para reducir la fiebre y aliviar los s�ntomas, como el paracetamol o el ibuprofeno. En casos         " +
                                                  "\n espec�ficos, se pueden utilizar antivirales como el oseltamivir. Tambi�n es recomendable el uso de humidificadores        " +
                                                  "\n para mantener el aire h�medo y facilitar la respiraci�n. El descanso adecuado es clave para la recuperaci�n, por lo       " +
                                                  "\n que se recomienda dormir al menos 8 horas diarias y evitar actividades que puedan generar fatiga. En casos m�s severos,   " +
                                                  "\n si la fiebre persiste por m�s de tres d�as o hay dificultad para respirar, es fundamental acudir al m�dico para una       " +
                                                  "\n evaluaci�n m�s detallada y considerar tratamientos adicionales como antibi�ticos en caso de infecciones secundarias.      " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de frutas y verduras que fortalezcan el sistema inmune, tales como naranjas ricas  " +
                                                  "\n en vitamina C, que ayuda a fortalecer el sistema inmunol�gico y reducir la duraci�n de los s�ntomas, fresas con           " +
                                                  "\n antioxidantes y vitamina C, esenciales para la protecci�n celular y la recuperaci�n del organismo, pl�tanos ricos         " +
                                                  "\n en potasio, que ayuda a reemplazar los electrolitos perdidos por fiebre y sudoraci�n, kiwi con vitamina C y potasio,      " +
                                                  "\n que contribuyen a la funci�n inmunol�gica y la recuperaci�n del cuerpo. Este es solo un diagn�stico predeterminado        " +
                                                  "\n l�gico. Haberlo consultado no garantiza al cien por ciento que la paciente tenga esta enfermedad ni que las respuestas    " +
                                                  "\n sean completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento         " +
                                                  "\n adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar         " +
                                                  "\n a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica de baja intensidad, evitando esfuerzos               " +
                                                  "\n excesivos y asegurando un descanso adecuado para la recuperaci�n. Actividades como caminatas suaves, ejercicios             " +
                                                  "\n de respiraci�n y yoga pueden ser beneficiosos para mantener el cuerpo activo sin comprometer la recuperaci�n.               " +
                                                  "\n Tambi�n se recomienda ejercicios de expansi�n tor�cica y fortalecimiento de los m�sculos respiratorios para mejorar         " +
                                                  "\n la capacidad pulmonar. HIDRATACI�N: Es fundamental el consumo diario de 2 litros de agua para mantener una hidrataci�n      " +
                                                  "\n �ptima y ayudar a fluidificar las secreciones pulmonares. Tambi�n se recomienda el consumo de caldos y sopas calientes      " +
                                                  "\n para facilitar la digesti�n y evitar irritaciones en el tracto respiratorio. Adem�s, el consumo de jugos naturales sin      " +
                                                  "\n az�car puede aportar vitaminas esenciales para fortalecer el sistema inmunol�gico. POSIBLE TRATAMIENTO: Para la             " +
                                                  "\n neumon�a en adolescentes, el tratamiento suele incluir antibi�ticos como la amoxicilina o azitromicina en caso de           " +
                                                  "\n infecciones bacterianas. Adem�s de medicamentos para reducir la fiebre y aliviar los s�ntomas, como el paracetamol.         " +
                                                  "\n En casos graves, puede requerirse hospitalizaci�n y oxigenoterapia. Tambi�n es importante evitar la exposici�n a            " +
                                                  "\n contaminantes ambientales y humo de tabaco, ya que pueden agravar los s�ntomas. En situaciones m�s severas, el              " +
                                                  "\n tratamiento puede incluir terapia respiratoria con nebulizaciones y monitoreo constante de la funci�n pulmonar.             " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos que fortalezcan el sistema inmune y ayuden a la recuperaci�n,           " +
                                                  "\n tales como naranjas ricas en vitamina C, que ayuda a fortalecer el sistema inmunol�gico y reducir la duraci�n de            " +
                                                  "\n los s�ntomas, espinacas con hierro, que contribuye a la producci�n de gl�bulos rojos y mejora la oxigenaci�n del            " +
                                                  "\n cuerpo, yogur con probi�ticos que favorecen la salud intestinal y fortalecen el sistema inmune, adem�s de alimentos         " +
                                                  "\n ricos en zinc para mejorar la respuesta inmune y acelerar la recuperaci�n. Este es solo un diagn�stico predeterminado       " +
                                                  "\n l�gico. Haberlo consultado no garantiza al cien por ciento que la paciente tenga esta enfermedad ni que las respuestas      " +
                                                  "\n sean completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento           " +
                                                  "\n adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar           " +
                                                  "\n a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica moderada diariamente, con una duraci�n        " +
                                                  "\n aproximada de 60 minutos, incluyendo ejercicios aer�bicos como caminar, correr o nadar, para mejorar la              " +
                                                  "\n sensibilidad a la insulina. Tambi�n se recomienda la pr�ctica de ejercicios de resistencia como el yoga              " +
                                                  "\n o el entrenamiento ligero con pesas para mejorar el metabolismo de la glucosa. HIDRATACI�N: Es fundamental           " +
                                                  "\n el consumo diario de 2 litros de agua para ayudar a mantener niveles adecuados de glucosa en sangre y prevenir       " +
                                                  "\n la deshidrataci�n. Tambi�n se recomienda el consumo de bebidas sin az�car como infusiones naturales o agua con       " +
                                                  "\n lim�n. Adem�s, el consumo de alimentos con alto contenido de fibra puede ayudar a estabilizar los niveles de         " +
                                                  "\n glucosa en sangre. POSIBLE TRATAMIENTO: Para la diabetes en adolescentes, el tratamiento suele incluir insulina      " +
                                                  "\n en el caso de diabetes tipo 1, mientras que en diabetes tipo 2 puede requerirse metformina y cambios en el estilo    " +
                                                  "\n de vida. Es esencial el monitoreo constante de la glucosa en sangre y el seguimiento m�dico. Tambi�n es              " +
                                                  "\n recomendable la educaci�n sobre el manejo de la enfermedad para evitar complicaciones a largo plazo. En algunos      " +
                                                  "\n casos, se pueden utilizar medicamentos adicionales como inhibidores de SGLT2 o agonistas de GLP-1 para mejorar el    " +
                                                  "\n control de la glucosa. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a regular los niveles de       " +
                                                  "\n glucosa y fortalezcan el organismo, tales como avena rica en fibra soluble, que ayuda a estabilizar los niveles de   " +
                                                  "\n az�car en sangre, frutos secos con grasas saludables y magnesio, que contribuyen a la regulaci�n de la glucosa,      " +
                                                  "\n legumbres con prote�nas vegetales y fibra, que favorecen la saciedad y el control de la glucosa, adem�s de alimentos " +
                                                  "\n ricos en �cidos grasos Omega-3 para mejorar la funci�n metab�lica y reducir la inflamaci�n. Este es solo un          " +
                                                  "\n diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al cien por ciento que la paciente tenga          " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar m�s de un diagn�stico     " +
                                                  "\n para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le         " +
                                                  "\n satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y        " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para             " +
                                                  "\n mantener las v�as respiratorias hidratadas y reducir la viscosidad de las secreciones, lo que facilita la respiraci�n.        " +
                                                  "\n La deshidrataci�n puede agravar los s�ntomas del asma, aumentando la irritaci�n de las v�as respiratorias y la                " +
                                                  "\n frecuencia de los episodios de tos. Es importante consumir l�quidos ricos en electrolitos, como sueros orales y caldos,       " +
                                                  "\n para mantener el equilibrio de minerales esenciales. Tambi�n se recomienda el consumo de infusiones suaves, como              " +
                                                  "\n manzanilla o jengibre, que pueden ayudar a reducir la inflamaci�n y mejorar la funci�n pulmonar. EJERCICIO: La actividad      " +
                                                  "\n f�sica debe ser moderada y adaptada, evitando esfuerzos excesivos que puedan desencadenar crisis asm�ticas, ejercicios        " +
                                                  "\n como nataci�n, yoga y caminatas suaves pueden ser beneficiosos para mejorar la capacidad pulmonar y reducir la inflamaci�n.   " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento est�ndar para el asma en adolescentes incluye broncodilatadores de alivio r�pido como     " +
                                                  "\n salbutamol, adem�s de corticosteroides inhalados como fluticasona o budesonida, en M�xico algunas marcas reconocidas          " +
                                                  "\n incluyen Ventolin (salbutamol) y Pulmicort (budesonida), en casos m�s severos pueden utilizarse biol�gicos como omalizumab,   " +
                                                  "\n bajo estricta supervisi�n m�dica. ALIMENTACI�N: Para fortalecer el sistema respiratorio y reducir la inflamaci�n, se          " +
                                                  "\n recomienda el consumo de alimentos ricos en omega-3, antioxidantes y vitamina C. Salm�n y ch�a: Contienen aproximadamente     " +
                                                  "\n 2-4 g de omega-3 por cada 100 g, lo que ayuda a reducir la inflamaci�n de las v�as respiratorias. Fresas y ar�ndanos:         " +  
                                                  "\n Aportan 50-90 mg de vitamina C por cada 100 g, cubriendo hasta el 100% de la ingesta diaria recomendada, fortaleciendo el     " +
                                                  "\n sistema inmunol�gico. Jengibre y c�rcuma: Poseen propiedades antiinflamatorias y antioxidantes, ayudando a reducir la         " +
                                                  "\n irritaci�n de las v�as respiratorias. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza      " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor seguridad se     " +
                                                  "\n recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y     " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tama�o regular) para          " +
                                                  "\n mantener la hidrataci�n y reducir la fatiga, lo que es fundamental en el proceso de recuperaci�n. El VIH puede           " +
                                                  "\n provocar fiebre, sudoraci�n nocturna y diarrea, lo que aumenta el riesgo de deshidrataci�n. Es esencial consumir         " +
                                                  "\n l�quidos ricos en electrolitos, como sueros orales y caldos, para reponer los minerales perdidos. Tambi�n se             " +
                                                  "\n recomienda el consumo de agua con lim�n o infusiones suaves, que pueden ayudar a aliviar las n�useas y mejorar la        " +
                                                  "\n digesti�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada, evitando esfuerzos excesivos que puedan          " +
                                                  "\n debilitar el sistema inmunol�gico, ejercicios como yoga, caminatas suaves y nataci�n pueden ser beneficiosos para        " +
                                                  "\n mejorar la resistencia y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento para el VIH en adolescentes incluye      " +
                                                  "\n terapia antirretroviral (TAR) con medicamentos como tenofovir, emtricitabina y dolutegravir, en M�xico algunas           " +
                                                  "\n marcas reconocidas incluyen Truvada (tenofovir/emtricitabina) y Tivicay (dolutegravir), adem�s se recomienda el uso      " +
                                                  "\n de terapias complementarias como apoyo nutricional y psicol�gico para mejorar la calidad de vida del paciente.           " +
                                                  "\n ALIMENTACI�N: Para fortalecer el sistema inmunol�gico y apoyar la recuperaci�n, se recomienda el consumo de alimentos    " +
                                                  "\n ricos en antioxidantes, prote�nas y �cidos grasos esenciales. Br�coli y zanahorias: Contienen aproximadamente 50-80      " +
                                                  "\n mg de vitamina C por cada 100 g, lo que representa hasta el 90% de la ingesta diaria recomendada, fortaleciendo el       " +
                                                  "\n sistema inmunol�gico. Salm�n y ch�a: Son fuentes de omega-3, proporcionando entre 2-4 g por cada 100 g, lo que ayuda     " +
                                                  "\n a reducir la inflamaci�n y mejorar la funci�n celular. Frutas y verduras de colores vivos: Como ar�ndanos y espinacas,   " +
                                                  "\n que son ricas en antioxidantes y ayudan a proteger las c�lulas del da�o. Este es solo un diagn�stico predeterminado      " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean         " +
                                                  "\n completamente correctas, para mayor seguridad se recomienda realizar m�s de un diagn�stico y consultar a un m�dico.      " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para            " +
                                                  "\n mantener la hidrataci�n y ayudar a reducir la inflamaci�n, lo que es fundamental en el proceso de recuperaci�n. La           " +
                                                  "\n gonorrea puede provocar fiebre, dolor abdominal y secreci�n anormal, lo que aumenta el riesgo de deshidrataci�n. Es          " +
                                                  "\n esencial consumir l�quidos ricos en electrolitos, como sueros orales y caldos, para reponer los minerales perdidos.          " +
                                                  "\n Tambi�n se recomienda el consumo de infusiones suaves, como manzanilla o jengibre, que pueden ayudar a aliviar las           " +
                                                  "\n molestias digestivas y mejorar la absorci�n de nutrientes. EJERCICIO: La actividad f�sica debe ser muy ligera y              " +
                                                  "\n supervisada, evitando esfuerzos excesivos que puedan agravar los s�ntomas, ejercicios de respiraci�n profunda y movilidad    " +
                                                  "\n suave pueden ser beneficiosos para mejorar la circulaci�n y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento           " +
                                                  "\n est�ndar para la gonorrea en adolescentes incluye antibi�ticos como ceftriaxona y azitromicina, administrados en una         " +
                                                  "\n sola dosis, en M�xico algunas marcas reconocidas incluyen Rocephin (ceftriaxona) y Zithromax (azitromicina), adem�s se       " +
                                                  "\n recomienda reposo absoluto y una dieta adecuada para mejorar la recuperaci�n. ALIMENTACI�N: Para fortalecer el sistema       " +
                                                  "\n inmunol�gico y apoyar la recuperaci�n, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y prote�nas. " +
                                                  "\n Naranjas y fresas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa hasta el 100% de       " +
                                                  "\n la ingesta diaria recomendada, fortaleciendo el sistema inmunol�gico y ayudando a reducir la inflamaci�n. Espinacas y        " +
                                                  "\n lentejas: Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25% y 40% de la ingesta diaria recomendada," +
                                                  "\n lo que ayuda a mejorar la oxigenaci�n celular y reducir el cansancio. Carnes magras y huevos: Son una fuente importante      " +
                                                  "\n de prote�nas, proporcionando entre 20 y 25 g por cada 100 g, lo que equivale al 40-50% de la recomendaci�n diaria, esenciales" +
                                                  "\n para la regeneraci�n celular y el fortalecimiento muscular. Este es solo un diagn�stico predeterminado l�gico, haberlo       " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas,    " +
                                                  "\n para mayor seguridad se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital. " +
                                                  "\n HIDRATACI�N: Mantener una hidrataci�n adecuada es esencial para fortalecer el sistema inmunol�gico y reducir la          " +
                                                  "\n inflamaci�n causada por el virus. Se recomienda el consumo diario de agua suficiente, adem�s de infusiones de            " +
                                                  "\n manzanilla y jengibre, que poseen propiedades antiinflamatorias y pueden ayudar a aliviar el malestar. La hidrataci�n    " +
                                                  "\n tambi�n contribuye a la regeneraci�n celular y a la eliminaci�n de toxinas, lo que puede ayudar a reducir la             " +
                                                  "\n frecuencia de los brotes. EJERCICIO: La actividad f�sica debe ser moderada y enfocada en fortalecer el sistema           " +
                                                  "\n inmunol�gico. Se recomienda realizar ejercicios de bajo impacto, como yoga y caminatas suaves, que ayudan a reducir      " +
                                                  "\n el estr�s, un factor que puede desencadenar brotes del virus. Tambi�n es recomendable practicar ejercicios de            " +
                                                  "\n relajaci�n, como la meditaci�n y la respiraci�n profunda, para mejorar la respuesta del cuerpo ante el virus.            " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para el herpes genital incluye antivirales como aciclovir y valaciclovir,            " +
                                                  "\n que ayudan a reducir la duraci�n y gravedad de los s�ntomas. En casos recurrentes, se puede optar por terapia            " +
                                                  "\n supresiva, que consiste en el uso diario de antivirales para reducir la frecuencia de los brotes y la posibilidad        " +
                                                  "\n de transmisi�n. Tambi�n se recomienda el uso de cremas t�picas con lidoca�na, que pueden aliviar el dolor y la           " +
                                                  "\n irritaci�n en las lesiones. En algunos casos, los m�dicos pueden recomendar tratamientos inmunomoduladores para          " +
                                                  "\n fortalecer la respuesta del cuerpo contra el virus y reducir la recurrencia de los s�ntomas. En M�xico, estos            " +
                                                  "\n medicamentos est�n disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACI�N: Tambi�n es recomendable " +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como frutas     " +
                                                  "\n c�tricas, ricas en vitamina C, que fortalece el sistema inmunol�gico. Verduras de hoja verde, que contienen antioxidantes" +
                                                  "\n y hierro, esenciales para la salud celular. Pescados grasos, ricos en Omega-3, con propiedades antiinflamatorias. Frutos " +
                                                  "\n secos, que aportan vitamina E, que ayuda a la regeneraci�n celular. Yogur natural, fuente de probi�ticos, que favorecen  " +
                                                  "\n la salud intestinal y el sistema inmunol�gico. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no  " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello,   " +
                                                  "\n se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del   " +
                                                  "\n paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su   " +
                                                  "\n m�dico. �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: La hidrataci�n es clave para ayudar al cuerpo a eliminar toxinas y fortalecer el sistema inmunol�gico.           " +
                                                  "\n Se recomienda el consumo diario de agua suficiente, adem�s de infusiones de equin�cea y jengibre, que pueden ayudar           " +
                                                  "\n a mejorar la respuesta inmunol�gica. La hidrataci�n tambi�n contribuye a la circulaci�n sangu�nea, lo que es esencial         " +
                                                  "\n para la recuperaci�n de los tejidos afectados por la enfermedad. EJERCICIO: La actividad f�sica debe ser moderada y           " +
                                                  "\n enfocada en mejorar la circulaci�n sangu�nea. Se recomienda realizar ejercicios aer�bicos suaves, como caminatas y            " +
                                                  "\n bicicleta est�tica, que ayudan a mejorar la oxigenaci�n celular y la recuperaci�n del cuerpo. Tambi�n es recomendable         " +
                                                  "\n practicar ejercicios de resistencia, como el entrenamiento con pesas ligeras, para fortalecer el sistema muscular y           " +
                                                  "\n mejorar la respuesta del cuerpo ante la infecci�n. POSIBLE TRATAMIENTO: El tratamiento para la s�filis incluye penicilina     " +
                                                  "\n benzatina, que es el medicamento de primera l�nea. En casos de alergia a la penicilina, se pueden utilizar antibi�ticos       " +
                                                  "\n alternativos como doxiciclina o ceftriaxona. Es fundamental completar el tratamiento indicado por el m�dico para evitar       " +
                                                  "\n complicaciones graves como la s�filis terciaria, que puede afectar el sistema nervioso y cardiovascular. Tambi�n se           " +
                                                  "\n recomienda realizar pruebas de seguimiento para confirmar la eliminaci�n de la bacteria y evitar la transmisi�n a otras       " +
                                                  "\n personas. En casos avanzados, el tratamiento puede incluir monitorizaci�n neurol�gica para detectar posibles afectaciones     " +
                                                  "\n en el sistema nervioso central. En M�xico, estos medicamentos est�n disponibles en instituciones de salud como el IMSS y      " +
                                                  "\n el Insabi. ALIMENTACI�N: Tambi�n es recomendable el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden     " +
                                                  "\n a reducir la inflamaci�n, tales como frutas c�tricas, ricas en vitamina C, que fortalece el sistema inmunol�gico. Verduras    " +
                                                  "\n de hoja verde, que contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos, ricos en Omega-3,     " +
                                                  "\n con propiedades antiinflamatorias. Frutos secos, que aportan vitamina E, que ayuda a la regeneraci�n celular. Yogur           " +
                                                  "\n natural, fuente de probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico. Este es solo un diagn�stico      " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas    " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mayor        " +
                                                  "\n seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface      " +
                                                  "\n del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACI�N: La hidrataci�n es fundamental para mantener la salud pulmonar y ayudar a eliminar toxinas del cuerpo.         " +
                                                  "\n Se recomienda el consumo diario de agua suficiente, adem�s de infusiones de tomillo y eucalipto, que pueden ayudar         " +
                                                  "\n a mejorar la funci�n respiratoria. La hidrataci�n tambi�n contribuye a la eliminaci�n de secreciones pulmonares, lo        " +
                                                  "\n que facilita la recuperaci�n del paciente. EJERCICIO: La actividad f�sica debe ser moderada y enfocada en mejorar la       " +
                                                  "\n capacidad pulmonar. Se recomienda realizar ejercicios de respiraci�n profunda, como respiraci�n diafragm�tica y con        " +
                                                  "\n labios fruncidos, que ayudan a mejorar la oxigenaci�n. Tambi�n es beneficioso practicar caminatas suaves, evitando         " +
                                                  "\n ambientes fr�os o contaminados. POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis incluye antibi�ticos como         " +
                                                  "\n isoniazida, rifampicina y etambutol, que deben tomarse durante un per�odo prolongado para garantizar la eliminaci�n        " +
                                                  "\n de la bacteria. En casos de tuberculosis resistente a los medicamentos, se pueden utilizar esquemas de tratamiento         " + 
                                                  "\n m�s prolongados con f�rmacos como bedaquilina y linezolid. Es fundamental seguir estrictamente el tratamiento para         " +
                                                  "\n evitar reca�das y la propagaci�n de la enfermedad. Tambi�n se recomienda realizar pruebas de seguimiento para confirmar    " +
                                                  "\n la eliminaci�n de la bacteria y evitar la transmisi�n a otras personas. En casos severos, el tratamiento puede extenderse  " +
                                                  "\n por varios meses, incluyendo terapia respiratoria especializada para mejorar la funci�n pulmonar. En M�xico, estos         " +
                                                  "\n medicamentos est�n disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACI�N: Tambi�n es recomendable   " +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como frutas       " +
                                                  "\n c�tricas, ricas en vitamina C, que fortalece el sistema inmunol�gico. Verduras de hoja verde, que contienen antioxidantes  " +
                                                  "\n y hierro, esenciales para la salud celular. Pescados grasos, ricos en Omega-3, con propiedades antiinflamatorias. Frutos   " +
                                                  "\n secos, que aportan vitamina E, que ayuda a la regeneraci�n celular. Yogur natural, fuente de probi�ticos, que favorecen    " +
                                                  "\n la salud intestinal y el sistema inmunol�gico. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no    " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello,     " +
                                                  "\n se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado del     " +
                                                  "\n paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su     " +
                                                  "\n m�dico. �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica moderada y adaptada a su condici�n, evitando           " +
                                                  "\n ejercicios de alto impacto que puedan afectar sus articulaciones. Se sugiere ejercicios de bajo impacto como nataci�n,        " +
                                                  "\n yoga o caminatas suaves, que ayudan a mejorar la movilidad sin generar estr�s en las articulaciones. HIDRATACI�N: Se          " +
                                                  "\n recomienda el consumo diario de 2 a 2.5 litros de agua al d�a para mantener una adecuada hidrataci�n y ayudar a reducir       " +
                                                  "\n la inflamaci�n en las articulaciones. Tambi�n es beneficioso el consumo de infusiones de c�rcuma y jengibre, que poseen       " +
                                                  "\n propiedades antiinflamatorias naturales. Adem�s, el consumo de agua con lim�n puede ser �til debido a su contenido de         " +
                                                  "\n vitamina C, que contribuye a la producci�n de col�geno y la salud articular. POSIBLE TRATAMIENTO: Para la artritis juvenil,   " +
                                                  "\n el tratamiento suele incluir antiinflamatorios no esteroides (AINEs) como ibuprofeno o naproxeno, adem�s de f�rmacos          " +
                                                  "\n modificadores de la enfermedad como metotrexato en casos m�s severos. Tambi�n pueden utilizarse terapias biol�gicas           " +
                                                  "\n bajo supervisi�n m�dica. La fisioterapia es clave para mejorar la movilidad y reducir el dolor, y en algunos casos se         " +
                                                  "\n recomienda el uso de suplementos de col�geno y glucosamina para fortalecer las articulaciones. ALIMENTACI�N: Se recomienda    " +
                                                  "\n el consumo de alimentos que ayuden a reducir la inflamaci�n y fortalecer las articulaciones, tales como Pescados grasos       " +
                                                  "\n (salm�n, at�n): ricos en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias. Frutas y verduras de colores vivos  " +
                                                  "\n (ar�ndanos, fresas, espinacas, br�coli): ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las    " +
                                                  "\n c�lulas del da�o y fortalecer el sistema inmunol�gico. Jengibre: contiene compuestos con efectos antiinflamatorios que podr�an" +
                                                  "\n ser beneficiosos para las articulaciones. C�rcuma: con su componente activo, la curcumina, tambi�n tiene potentes propiedades " +
                                                  "\n antiinflamatorias y antioxidantes. Semillas de ch�a y linaza: ricas en Omega-3 y fibra, que ayudan a reducir la inflamaci�n.  " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que la paciente tenga esta         " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor        " +
                                                  "\n seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se      " +
                                                  "\n recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica ligera, evitando esfuerzos excesivos que puedan         " +
                                                  "\n agravar la tos y la dificultad respiratoria. Se sugiere ejercicios de respiraci�n, caminatas suaves y estiramientos            " +
                                                  "\n para mejorar la capacidad pulmonar. HIDRATACI�N: Debido a la tos persistente y la posible deshidrataci�n causada por           " +
                                                  "\n la tosferina, se recomienda el consumo diario de 2.5 a 3 litros de agua al d�a. Tambi�n es beneficioso el consumo de           " +
                                                  "\n infusiones de miel y jengibre, que pueden ayudar a calmar la garganta y reducir la inflamaci�n. Se recomienda el uso           " +
                                                  "\n de bebidas tibias, como caldos y t�s de hierbas, para aliviar la irritaci�n de la garganta. POSIBLE TRATAMIENTO: Para          " +
                                                  "\n la tosferina en adolescentes, el tratamiento suele incluir antibi�ticos como azitromicina, claritromicina o eritromicina,      " +
                                                  "\n administrados bajo supervisi�n m�dica. Tambi�n se recomienda el uso de humidificadores para aliviar la irritaci�n de las       " +
                                                  "\n v�as respiratorias. En casos graves, puede requerirse hospitalizaci�n con administraci�n de ox�geno y l�quidos intravenosos    " +
                                                  "\n para prevenir la deshidrataci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema        " +
                                                  "\n respiratorio y aliviar los s�ntomas, tales como Miel: ayuda a calmar la garganta y tiene propiedades antimicrobianas.          " +
                                                  "\n Jengibre: con propiedades antiinflamatorias que pueden aliviar la tos y mejorar la respuesta inmune. Frutas c�tricas           " +
                                                  "\n (naranjas, limones, toronjas): ricas en vitamina C, que ayuda a mejorar la respuesta inmunol�gica. Caldo de pollo: fuente      " +
                                                  "\n de electrolitos y nutrientes esenciales para la recuperaci�n. Ajo: contiene alicina, un compuesto con propiedades              " +
                                                  "\n antimicrobianas que pueden ayudar a combatir infecciones. Este es solo un diagn�stico predeterminado l�gico. Haberlo           " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas.      " +
                                                  "\n Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la      " +
                                                  "\n respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita     " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica ligera, evitando esfuerzos excesivos                " +
                                                  "\n que puedan agravar la inflamaci�n de las gl�ndulas salivales. Se sugiere ejercicios de relajaci�n y estiramientos          " +
                                                  "\n suaves. HIDRATACI�N: Debido a la fiebre y la inflamaci�n de las gl�ndulas salivales, se recomienda el consumo              " +
                                                  "\n diario de 2.5 a 3 litros de agua al d�a. Tambi�n es beneficioso el consumo de infusiones de manzanilla, que                " +
                                                  "\n pueden ayudar a reducir la inflamaci�n, y agua de coco, que aporta electrolitos esenciales. Se recomienda evitar           " +
                                                  "\n bebidas �cidas como jugo de lim�n o naranja, ya que pueden irritar a�n m�s las gl�ndulas salivales. POSIBLE                " +
                                                  "\n TRATAMIENTO: Para las paperas en adolescentes, no existe un tratamiento espec�fico, ya que es una enfermedad               " +
                                                  "\n viral autolimitada. Se recomienda reposo, hidrataci�n y control de fiebre con paracetamol (Tempra) o ibuprofeno.           " +
                                                  "\n En casos graves, puede requerirse hospitalizaci�n con administraci�n de l�quidos intravenosos. Se recomienda               " +
                                                  "\n aplicar compresas fr�as en la zona inflamada para aliviar el dolor y la hinchaz�n. ALIMENTACI�N: Se recomienda             " +
                                                  "\n el consumo de alimentos que ayuden a reducir la inflamaci�n y fortalecer el sistema inmune, tales como Frutas              " +
                                                  "\n c�tricas (naranjas, limones, toronjas): ricas en vitamina C, que ayuda a mejorar la respuesta inmunol�gica. Papaya:        " +
                                                  "\n contiene vitamina C y flavonoides que pueden ayudar a reducir la inflamaci�n. Jengibre: con propiedades antiinflamatorias  " +
                                                  "\n que pueden aliviar la fatiga y mejorar la respuesta inmune. Miel: ayuda a calmar la garganta y tiene propiedades           " +
                                                  "\n antimicrobianas. Caldo de vegetales: fuente de electrolitos y nutrientes esenciales para la recuperaci�n. Yogur            " +
                                                  "\n natural: fuente de probi�ticos que ayudan a restaurar la flora intestinal y fortalecer el sistema inmune. Este es          " +
                                                  "\n solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad   " +
                                                  "\n ni que las respuestas sean completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad      " +
                                                  "\n en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda  " +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: Mantener una hidrataci�n adecuada es esencial para fortalecer el sistema inmunol�gico y reducir la          " +
                                                  "\n inflamaci�n causada por el virus. Se recomienda el consumo diario de agua suficiente, adem�s de infusiones de            " +
                                                  "\n manzanilla y jengibre, que poseen propiedades antiinflamatorias y pueden ayudar a aliviar el malestar. La hidrataci�n    " +
                                                  "\n tambi�n contribuye a la regeneraci�n celular y a la eliminaci�n de toxinas, lo que puede ayudar a reducir la             " +
                                                  "\n frecuencia de los brotes. EJERCICIO: La actividad f�sica debe ser moderada y enfocada en fortalecer el sistema           " +
                                                  "\n inmunol�gico. Se recomienda realizar ejercicios de bajo impacto, como yoga y caminatas suaves, que ayudan a reducir      " +
                                                  "\n el estr�s, un factor que puede desencadenar brotes del virus. Tambi�n es recomendable practicar ejercicios de            " +
                                                  "\n relajaci�n, como la meditaci�n y la respiraci�n profunda, para mejorar la respuesta del cuerpo ante el virus.            " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para el herpes genital incluye antivirales como aciclovir y valaciclovir,            " +
                                                  "\n que ayudan a reducir la duraci�n y gravedad de los s�ntomas. En casos recurrentes, se puede optar por terapia            " +
                                                  "\n supresiva, que consiste en el uso diario de antivirales para reducir la frecuencia de los brotes y la posibilidad        " +
                                                  "\n de transmisi�n. Tambi�n se recomienda el uso de cremas t�picas con lidoca�na, que pueden aliviar el dolor y la           " +
                                                  "\n irritaci�n en las lesiones. En algunos casos, los m�dicos pueden recomendar tratamientos inmunomoduladores para          " +
                                                  "\n fortalecer la respuesta del cuerpo contra el virus y reducir la recurrencia de los s�ntomas. En M�xico, estos            " +
                                                  "\n medicamentos est�n disponibles en instituciones de salud como el IMSS y el Insabi. ALIMENTACI�N: Tambi�n es              " +
                                                  "\n recomendable el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n,          " +
                                                  "\n tales como frutas c�tricas, ricas en vitamina C, que fortalece el sistema inmunol�gico. Verduras de hoja verde,          " +
                                                  "\n que contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos, ricos en Omega-3, con           " +
                                                  "\n propiedades antiinflamatorias. Frutos secos, que aportan vitamina E, que ayuda a la regeneraci�n celular. Yogur          " +
                                                  "\n natural, fuente de probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico. Este es solo un             " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad         " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi        " +
                                                  "\n Vida para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud, si la respuesta      " +
                                                  "\n del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece tu visita a      " +
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: La hidrataci�n es clave para ayudar al cuerpo a eliminar toxinas y fortalecer el sistema inmunol�gico.          " +
                                                  "\n Se recomienda el consumo diario de agua suficiente, adem�s de infusiones de equin�cea y jengibre, que pueden ayudar          " +
                                                  "\n a mejorar la respuesta inmunol�gica. La hidrataci�n tambi�n contribuye a la circulaci�n sangu�nea, lo que es esencial        " +
                                                  "\n para la recuperaci�n de los tejidos afectados por la enfermedad. EJERCICIO: La actividad f�sica debe ser moderada y          " +
                                                  "\n enfocada en mejorar la circulaci�n sangu�nea. Se recomienda realizar ejercicios aer�bicos suaves, como caminatas y           " +
                                                  "\n bicicleta est�tica, que ayudan a mejorar la oxigenaci�n celular y la recuperaci�n del cuerpo. Tambi�n es recomendable        " +
                                                  "\n practicar ejercicios de resistencia, como el entrenamiento con pesas ligeras, para fortalecer el sistema muscular y          " +
                                                  "\n mejorar la respuesta del cuerpo ante la infecci�n. POSIBLE TRATAMIENTO: El tratamiento para la s�filis incluye penicilina    " +
                                                  "\n benzatina, que es el medicamento de primera l�nea. En casos de alergia a la penicilina, se pueden utilizar antibi�ticos      " +
                                                  "\n alternativos como doxiciclina o ceftriaxona. Es fundamental completar el tratamiento indicado por el m�dico para evitar      " +
                                                  "\n complicaciones graves como la s�filis terciaria, que puede afectar el sistema nervioso y cardiovascular. Tambi�n se          " +
                                                  "\n recomienda realizar pruebas de seguimiento para confirmar la eliminaci�n de la bacteria y evitar la transmisi�n a otras      " +
                                                  "\n personas. En casos avanzados, el tratamiento puede incluir monitorizaci�n neurol�gica para detectar posibles afectaciones    " +
                                                  "\n en el sistema nervioso central. En M�xico, estos medicamentos est�n disponibles en instituciones de salud como el IMSS       " +
                                                  "\n y el Insabi. ALIMENTACI�N: Tambi�n es recomendable el consumo de alimentos que fortalezcan el sistema inmunol�gico y         " +
                                                  "\n ayuden a reducir la inflamaci�n, tales como frutas c�tricas, ricas en vitamina C, que fortalece el sistema inmunol�gico.     " +
                                                  "\n Verduras de hoja verde, que contienen antioxidantes y hierro, esenciales para la salud celular. Pescados grasos, ricos       " +
                                                  "\n en Omega-3, con propiedades antiinflamatorias. Frutos secos, que aportan vitamina E, que ayuda a la regeneraci�n celular.    " +
                                                  "\n Yogur natural, fuente de probi�ticos, que favorecen la salud intestinal y el sistema inmunol�gico. Este es solo un           " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni          " +
                                                  "\n que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida          " +
                                                  "\n para establecer mayor seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud, si la respuesta del           " +
                                                  "\n diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece tu visita a la           " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACI�N: La hidrataci�n es fundamental para mantener la salud pulmonar y ayudar a eliminar toxinas del cuerpo.        " +
                                                  "\n Se recomienda el consumo diario de agua suficiente, adem�s de infusiones de tomillo y eucalipto, que pueden ayudar        " +
                                                  "\n a mejorar la funci�n respiratoria. La hidrataci�n tambi�n contribuye a la eliminaci�n de secreciones pulmonares, lo       " +
                                                  "\n que facilita la recuperaci�n del paciente. EJERCICIO: La actividad f�sica debe ser moderada y enfocada en mejorar la      " +
                                                  "\n capacidad pulmonar. Se recomienda realizar ejercicios de respiraci�n profunda, como respiraci�n diafragm�tica y con       " +
                                                  "\n labios fruncidos, que ayudan a mejorar la oxigenaci�n. Tambi�n es beneficioso practicar caminatas suaves, evitando        " +
                                                  "\n ambientes fr�os o contaminados. POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis incluye antibi�ticos como        " +
                                                  "\n isoniazida, rifampicina y etambutol, que deben tomarse durante un per�odo prolongado para garantizar la eliminaci�n       " +
                                                  "\n de la bacteria. En casos de tuberculosis resistente a los medicamentos, se pueden utilizar esquemas de tratamiento        " +
                                                  "\n m�s prolongados con f�rmacos como bedaquilina y linezolid. Es fundamental seguir estrictamente el tratamiento para        " +
                                                  "\n evitar reca�das y la propagaci�n de la enfermedad. Tambi�n se recomienda realizar pruebas de seguimiento para confirmar   " +
                                                  "\n la eliminaci�n de la bacteria y evitar la transmisi�n a otras personas. En casos severos, el tratamiento puede extenderse " +
                                                  "\n por varios meses, incluyendo terapia respiratoria especializada para mejorar la funci�n pulmonar. En M�xico, estos            " +
                                                  "\n medicamentos est�n disponibles en instituciones de salud como el IMSS y el Insabi. Este es solo un diagn�stico predeterminado " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean              " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mayor             " +
                                                  "\n seguridad en el tratamiento adecuado del paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface      " +
                                                  "\n del todo, se recomienda consultar a su m�dico. �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis. " +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica de baja intensidad, evitando esfuerzos excesivos   " +
                                                  "\n y asegurando un descanso adecuado para la recuperaci�n. Actividades como caminatas suaves, juegos tranquilos y ejercicios " +
                                                  "\n de respiraci�n pueden ser beneficiosos para mantener el cuerpo activo sin comprometer la recuperaci�n. Tambi�n se         " +
                                                  "\n recomienda ejercicios de movilidad articular y estiramientos para evitar la rigidez muscular causada por el reposo        " +
                                                  "\n prolongado. HIDRATACI�N: Es fundamental el consumo diario de 1.5 a 2 litros de agua para prevenir la deshidrataci�n       " +
                                                  "\n causada por la diarrea y ayudar a la recuperaci�n del organismo. Adem�s, se recomienda el consumo de sueros de            " +
                                                  "\n rehidrataci�n oral para reponer los electrolitos perdidos. Se debe evitar el consumo de bebidas con cafe�na o             " +
                                                  "\n azucaradas, ya que pueden afectar la recuperaci�n. POSIBLE TRATAMIENTO: Para la shigelosis en adolescentes, el            " + 
                                                  "\n tratamiento suele incluir antibi�ticos como la azitromicina o ciprofloxacino en casos graves, adem�s de medidas           " +
                                                  "\n de rehidrataci�n oral para evitar la deshidrataci�n. Tambi�n es importante mantener una higiene adecuada, lavarse         " +
                                                  "\n las manos frecuentemente y evitar el contacto con personas infectadas. En casos leves, el tratamiento puede centrarse     " +
                                                  "\n en el manejo de los s�ntomas con reposo, hidrataci�n y una dieta adecuada. Se recomienda evitar el consumo de alimentos   " +
                                                  "\n irritantes como l�cteos, frituras y comidas muy condimentadas, ya que pueden agravar la diarrea. ALIMENTACI�N: Se         " +
                                                  "\n recomienda el consumo de alimentos que ayuden a la recuperaci�n intestinal y fortalezcan el sistema inmune, tales         " +
                                                  "\n como pl�tanos ricos en potasio que ayudan a reponer electrolitos perdidos por la diarrea, zanahorias con vitamina A       " +
                                                  "\n que contribuyen a la regeneraci�n de la mucosa intestinal, yogur con probi�ticos que favorecen la salud intestinal y      " +
                                                  "\n fortalecen el sistema inmune, adem�s de caldos y sopas suaves para facilitar la digesti�n y evitar irritaciones en el     " +
                                                  "\n tracto intestinal. Tambi�n se recomienda el consumo de arroz y manzana para ayudar a regular el tr�nsito intestinal.      " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al cien por ciento que la paciente     " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar m�s de un diagn�stico    " +
                                                  "\n para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface    " +
                                                  "\n del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica adaptada a su capacidad respiratoria,            " +
                                                  "\n evitando esfuerzos excesivos y asegurando una respiraci�n controlada. Ejercicios como caminatas suaves, nataci�n,       " + 
                                                  "\n yoga y t�cnicas de respiraci�n pueden mejorar la funci�n pulmonar y reducir la fatiga. Tambi�n se recomienda            " +
                                                  "\n ejercicios de expansi�n tor�cica y fortalecimiento de los m�sculos respiratorios para mejorar la capacidad pulmonar.    " +
                                                  "\n Es importante realizar calentamiento previo y enfriamiento posterior para evitar crisis respiratorias. HIDRATACI�N:     " +
                                                  "\n Es fundamental el consumo diario de 1.7 a 2 litros de agua para mantener las v�as respiratorias hidratadas y facilitar  " +
                                                  "\n la eliminaci�n de secreciones. Tambi�n se recomienda el consumo de infusiones con propiedades antiinflamatorias como    " +
                                                  "\n el t� de jengibre o manzanilla. Se debe evitar el consumo de bebidas fr�as o con gas, ya que pueden irritar las v�as    " +
                                                  "\n respiratorias. POSIBLE TRATAMIENTO: Para el EPOC en adolescentes, el tratamiento suele incluir broncodilatadores como   " +
                                                  "\n el salbutamol, corticosteroides inhalados como la fluticasona y, en casos graves, oxigenoterapia. Tambi�n es importante " +
                                                  "\n evitar la exposici�n a contaminantes ambientales y humo de tabaco. En algunos casos, se recomienda la rehabilitaci�n    " +
                                                  "\n pulmonar, que incluye ejercicios espec�ficos para mejorar la capacidad respiratoria y t�cnicas de manejo de la enfermedad. " +
                                                  "\n En casos m�s severos, puede requerirse el uso de dispositivos de asistencia respiratoria como ventiladores port�tiles o    " +
                                                  "\n terapia con ox�geno domiciliario. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a mejorar la funci�n      " +
                                                  "\n pulmonar y fortalezcan el sistema inmune, tales como pescados grasos como el salm�n y el at�n, ricos en �cidos grasos      " +
                                                  "\n Omega-3 que poseen propiedades antiinflamatorias que pueden ayudar a reducir la inflamaci�n de las v�as respiratorias,     " +
                                                  "\n frutas y verduras de colores vivos como ar�ndanos, fresas, espinacas y br�coli, ricas en antioxidantes como la vitamina C  " +
                                                  "\n y carotenoides que pueden proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico, jengibre que contiene        " +
                                                  "\n compuestos con efectos antiinflamatorios que podr�an ser beneficiosos para las v�as respiratorias, c�rcuma con su          " +
                                                  "\n componente activo la curcumina que tiene potentes propiedades antiinflamatorias y antioxidantes, adem�s de alimentos       " +
                                                  "\n ricos en fibra para mejorar la digesti�n y evitar la inflamaci�n intestinal. Este es solo un diagn�stico predeterminado    " +
                                                  "\n l�gico. Haberlo consultado no garantiza al cien por ciento que la paciente tenga esta enfermedad ni que las respuestas     " +
                                                  "\n sean completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado." +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.       " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n EJERCICIO: Es recomendable que la adolescente realice actividad f�sica moderada, evitando esfuerzos excesivos y          " +
                                                  "\n asegurando una recuperaci�n adecuada. Ejercicios como caminatas suaves, estiramientos y yoga pueden ser beneficiosos     " +
                                                  "\n para mantener el cuerpo activo sin comprometer el tratamiento. Tambi�n se recomienda ejercicios de relajaci�n y          " +
                                                  "\n respiraci�n profunda para reducir el estr�s y mejorar la respuesta inmune. HIDRATACI�N: Es fundamental el consumo        " +
                                                  "\n diario de 1.5 a 2 litros de agua para ayudar a eliminar toxinas y mantener el organismo en equilibrio. Tambi�n se        " +
                                                  "\n recomienda el consumo de jugos naturales ricos en antioxidantes para fortalecer el sistema inmune. Se debe evitar el     " +
                                                  "\n consumo de bebidas alcoh�licas y azucaradas, ya que pueden afectar la recuperaci�n. POSIBLE TRATAMIENTO: Para la         " +
                                                  "\n clamidia en adolescentes, el tratamiento suele incluir antibi�ticos como la azitromicina o doxiciclina, administrados    " +
                                                  "\n bajo supervisi�n m�dica. Tambi�n es importante evitar el contacto con personas infectadas y mantener una higiene adecuada. " +
                                                  "\n En algunos casos, se recomienda el uso de probi�ticos para ayudar a restaurar la flora vaginal y prevenir infecciones      " +
                                                  "\n recurrentes. En situaciones m�s severas, si la infecci�n no responde al tratamiento inicial, puede requerirse un ajuste    " +
                                                  "\n en la medicaci�n o una evaluaci�n m�s detallada por un especialista. ALIMENTACI�N: Se recomienda el consumo de alimentos   " +
                                                  "\n que ayuden a fortalecer el sistema inmune y mejorar la recuperaci�n, tales como naranjas ricas en vitamina C, que ayuda    " +
                                                  "\n a fortalecer el sistema inmunol�gico y reducir la duraci�n de los s�ntomas, espinacas con hierro que contribuyen a la      " +
                                                  "\n producci�n de gl�bulos rojos y mejora la oxigenaci�n del cuerpo, yogur con probi�ticos que favorecen la salud intestinal   " +
                                                  "\n y fortalecen el sistema inmune, adem�s de alimentos ricos en zinc para mejorar la respuesta inmune y acelerar la           " +
                                                  "\n recuperaci�n. Tambi�n se recomienda el consumo de ajo y cebolla por sus propiedades antimicrobianas. Este es solo un       " +
                                                  "\n diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al cien por ciento que la paciente tenga esta enfermedad" +
                                                  "\n ni que las respuestas sean completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el" +
                                                  "\n tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda        " +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana. " +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para       " +
                                                  "\n mantener la hidrataci�n y ayudar a reducir la fiebre y los s�ntomas neurol�gicos, lo que es fundamental en el           " +
                                                  "\n proceso de recuperaci�n. La meningitis bacteriana puede provocar fiebre alta, v�mitos, rigidez en el cuello y           " +
                                                  "\n sensibilidad a la luz, lo que puede llevar a una mayor p�rdida de l�quidos. Es importante que el paciente consuma       " +
                                                  "\n l�quidos ricos en electrolitos, como sueros orales, caldos y jugos naturales sin az�car, para evitar la deshidrataci�n  " +
                                                  "\n y mantener el equilibrio de minerales esenciales. Tambi�n se recomienda el consumo de infusiones suaves, como manzanilla  " +
                                                  "\n o jengibre, que pueden ayudar a aliviar las n�useas y mejorar la digesti�n. EJERCICIO: La actividad f�sica debe ser muy   " +
                                                  "\n ligera y supervisada, evitando esfuerzos excesivos que puedan agravar los s�ntomas, ejercicios de respiraci�n profunda    " +
                                                  "\n y movilidad suave pueden ser beneficiosos para mejorar la capacidad pulmonar y la circulaci�n. POSIBLE TRATAMIENTO: El    " +
                                                  "\n tratamiento est�ndar para la meningitis bacteriana en adolescentes incluye antibi�ticos como ceftriaxona, ampicilina y    " +
                                                  "\n vancomicina, administrados por v�a intravenosa durante 7 a 14 d�as, adem�s se recomienda el uso de corticosteroides como  " +
                                                  "\n dexametasona para reducir la inflamaci�n cerebral en casos graves. ALIMENTACI�N: Para fortalecer el sistema inmunol�gico  " +
                                                  "\n y apoyar la recuperaci�n, se recomienda el consumo de alimentos ricos en vitamina C, antioxidantes y prote�nas. Naranjas  " +
                                                  "\n y fresas: Contienen aproximadamente 70-90 mg de vitamina C por cada 100 g, lo que representa hasta el 100% de la ingesta  " +
                                                  "\n diaria recomendada, fortaleciendo el sistema inmunol�gico y ayudando a reducir la inflamaci�n. Espinacas y lentejas:      " +
                                                  "\n Aportan entre 3.5 y 6.6 mg de hierro por cada 100 g, cubriendo entre el 25% y 40% de la ingesta diaria recomendada, lo que     " +
                                                  "\n ayuda a mejorar la oxigenaci�n celular y reducir el cansancio. Carnes magras y huevos: Son una fuente importante de prote�nas, " +
                                                  "\n proporcionando entre 20 y 25 g por cada 100 g, lo que equivale al 40-50% de la recomendaci�n diaria, esenciales para la      " +
                                                  "\n regeneraci�n celular y el fortalecimiento muscular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado    " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para mayor    " +
                                                  "\n seguridad se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes agradece tu visita a la app   " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tama�o regular) para mantener    " +
                                                  "\n la hidrataci�n y ayudar a reducir los efectos secundarios del tratamiento, lo que es fundamental en el proceso de           " +
                                                  "\n recuperaci�n. Los adolescentes con c�ncer pueden experimentar v�mitos, diarrea y sudoraci�n excesiva, lo que aumenta        " +
                                                  "\n el riesgo de deshidrataci�n. Es esencial consumir l�quidos ricos en electrolitos, como sueros orales y caldos, para reponer " +
                                                  "\n los minerales perdidos. Tambi�n se recomienda el consumo de agua con lim�n o infusiones suaves, que pueden ayudar a aliviar " +
                                                  "\n las n�useas y mejorar la digesti�n. EJERCICIO: La actividad f�sica debe ser moderada y adaptada, evitando esfuerzos      " +
                                                  "\n excesivos que puedan debilitar el sistema inmunol�gico, ejercicios como yoga, caminatas suaves y nataci�n pueden ser     " +
                                                  "\n beneficiosos para mejorar la resistencia y reducir la fatiga. POSIBLE TRATAMIENTO: El tratamiento para el c�ncer en      " +
                                                  "\n adolescentes depende del tipo espec�fico de c�ncer, pero puede incluir quimioterapia, radioterapia y cirug�a, adem�s     " +
                                                  "\n se recomienda el uso de terapias complementarias como apoyo nutricional y psicol�gico para mejorar la calidad de vida    " +
                                                  "\n del paciente. ALIMENTACI�N: Para fortalecer el sistema inmunol�gico y apoyar la recuperaci�n, se recomienda el consumo   " +
                                                  "\n de alimentos ricos en antioxidantes, prote�nas y �cidos grasos esenciales. Br�coli y zanahorias: Contienen aproximadamente " +
                                                  "\n 50-80 mg de vitamina C por cada 100 g, lo que representa hasta el 90% de la ingesta diaria recomendada, fortaleciendo el   " +
                                                  "\n sistema inmunol�gico. Salm�n y ch�a: Son fuentes de omega-3, proporcionando entre 2-4 g por cada 100 g, lo que ayuda a     " +
                                                  "\n reducir la inflamaci�n y mejorar la funci�n celular. Frutas y verduras de colores vivos: Como ar�ndanos y espinacas, que   " +
                                                  "\n son ricas en antioxidantes y ayudan a proteger las c�lulas del da�o. Este es solo un diagn�stico predeterminado l�gico,    " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente     " +
                                                  "\n correctas, para mayor seguridad se recomienda realizar m�s de un diagn�stico y consultar a un m�dico. Angel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                    }
                }
             if (EdadFemenino.equals("Adolescencia = 10-21 a�os")) {
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