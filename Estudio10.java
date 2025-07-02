import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Estudio10 implements ActionListener{
    
         protected final JLabel label1;
         protected JScrollPane scrollpane1;
         protected JTextArea textarea1;
         private JFrame frame;
         private final String edadEsperada = "Juventud = 22-29 a�os";
         private String edadRecibida;
         
        public Estudio10(String nombrePaciente, String Sexo, String EdadFemenino, 
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
                 if(EdadFemenino.equals("Juventud = 22-29 a�os")){
                        if(EstaturaFemenino.equals("0.80-1.35 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para          " +
                                                  "\n mantener una hidrataci�n adecuada. Esto ayuda a reducir la congesti�n, mantener la mucosa respiratoria hidratada y         " +
                                                  "\n favorecer la eliminaci�n de toxinas. EJERCICIO: Se aconseja actividad f�sica moderada diariamente, evitando esfuerzos      " +
                                                  "\n excesivos mientras persistan los s�ntomas. Se recomienda al menos 30 minutos de ejercicio ligero, como caminatas o         " +
                                                  "\n estiramientos, lo cual ayuda a mejorar la circulaci�n, fortalecer el sistema inmune y promover una recuperaci�n m�s        " +
                                                  "\n efectiva. POSIBLE TRATAMIENTO: Para la gripe en mujeres j�venes, el tratamiento suele incluir medicamentos para reducir    " +
                                                  "\n la fiebre y aliviar los s�ntomas, como el paracetamol (marca com�n en M�xico: Tempra) o el ibuprofeno. Tambi�n pueden      " +
                                                  "\n utilizarse antivirales espec�ficos contra la gripe, como el oseltamivir (marca com�n: Tamiflu), en casos m�s severos o     " +
                                                  "\n bajo indicaci�n m�dica. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en vitaminas, minerales y antioxidantes  " +
                                                  "\n para fortalecer el sistema inmunol�gico y combatir los s�ntomas de la gripe: Naranjas y mandarinas: Ricas en vitamina C    " +
                                                  "\n (hasta un 89% del requerimiento diario por cada 100g), esenciales para reducir la duraci�n de los s�ntomas y mejorar la    " +
                                                  "\n respuesta inmune. Fresas y ar�ndanos: Contienen antioxidantes y vitamina C (hasta un 65% del requerimiento diario en 100g  " +
                                                  "\n de fresas) que protegen las c�lulas del da�o causado por la infecci�n. Jengibre: Posee propiedades antiinflamatorias y     " +
                                                  "\n antioxidantes que pueden aliviar la congesti�n y el malestar general. Espinacas y br�coli: Ricos en vitamina A (hasta      " +
                                                  "\n un 56% del requerimiento diario en 100g de espinaca) y vitamina C (hasta un 107% del requerimiento diario en 100g de       " +
                                                  "\n br�coli), esenciales para fortalecer el sistema inmunol�gico y acelerar la recuperaci�n. Este es solo un diagn�stico       " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la      " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para           " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s, por su salud, si la respuesta del            " +
                                                  "\n diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita      " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tama�o regular) para          " +
                                                  "\n mantener una hidrataci�n adecuada. Esto ayuda a fluidificar las secreciones pulmonares, facilitando su expulsi�n y         " +
                                                  "\n reduciendo la congesti�n respiratoria. EJERCICIO: Se aconseja actividad f�sica ligera y progresiva, evitando esfuerzos     " +
                                                  "\n intensos mientras persistan los s�ntomas. Se recomienda caminatas suaves de 15 a 30 minutos diarios para mejorar la        " +
                                                  "\n oxigenaci�n y la recuperaci�n pulmonar. POSIBLE TRATAMIENTO: Para la neumon�a en mujeres j�venes, el tratamiento suele     " +
                                                  "\n incluir antibi�ticos en caso de infecci�n bacteriana, como la amoxicilina (marca com�n en M�xico: Amoxil) o la             " +
                                                  "\n azitromicina. Tambi�n pueden utilizarse medicamentos para reducir la fiebre y aliviar los s�ntomas, como el paracetamol    " +
                                                  "\n o el ibuprofeno. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales para        " +
                                                  "\n fortalecer el sistema inmunol�gico y mejorar la funci�n pulmonar: Naranjas y mandarinas: Ricas en vitamina C (hasta un     " +
                                                  "\n 89% del requerimiento diario por cada 100g), esenciales para mejorar la respuesta inmune. Jengibre: Posee propiedades      " +
                                                  "\n antiinflamatorias y antioxidantes que pueden aliviar la congesti�n. Espinacas y br�coli: Ricos en vitamina A (hasta un     " +
                                                  "\n 56% del requerimiento diario en 100g de espinaca) y vitamina C (hasta un 107% del requerimiento diario en 100g de br�coli)," +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico y acelerar la recuperaci�n. Ajo: Contiene alicina, un compuesto con     " +
                                                  "\n propiedades antimicrobianas que puede ayudar a combatir infecciones respiratorias. Este es solo un diagn�stico predeterminado " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus       " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad    " +
                                                  "\n en el tratamiento adecuado de su paciente, adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo,    " +
                                                  "\n se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para        " +
                                                  "\n mantener una hidrataci�n adecuada y ayudar a regular los niveles de glucosa en sangre. EJERCICIO: Se aconseja            " +
                                                  "\n actividad f�sica regular, como caminatas de 30 a 60 minutos diarios, ejercicios de resistencia o yoga, lo cual ayuda     " +
                                                  "\n a mejorar la sensibilidad a la insulina y controlar los niveles de az�car en sangre. POSIBLE TRATAMIENTO: Para la        " +
                                                  "\n diabetes en mujeres j�venes, el tratamiento suele incluir medicamentos para controlar la glucosa, como la metformina     " +
                                                  "\n (marca com�n en M�xico: Glucophage) o insulina en casos espec�ficos. Tambi�n se recomienda el monitoreo constante de     " +
                                                  "\n los niveles de glucosa y una dieta equilibrada. ALIMENTACI�N: Se recomienda el consumo de alimentos con bajo �ndice      " +
                                                  "\n gluc�mico y ricos en nutrientes esenciales para el control de la diabetes: Aguacate: Rico en grasas saludables y fibra,  " +
                                                  "\n ayuda a estabilizar los niveles de glucosa. Frutos rojos (ar�ndanos, fresas): Contienen antioxidantes y vitamina C       " +
                                                  "\n (hasta un 65% del requerimiento diario en 100g de fresas), que pueden mejorar la sensibilidad a la insulina. Espinacas   " +
                                                  "\n y br�coli: Ricos en magnesio (hasta un 20% del requerimiento diario en 100g de espinaca), esencial para la regulaci�n    " +
                                                  "\n de la glucosa. Canela: Contiene compuestos que pueden mejorar la sensibilidad a la insulina y reducir los niveles de     " +
                                                  "\n az�car en sangre. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la      " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda     " +
                                                  "\n hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s," +
                                                  "\n por su salud, si la respuesta del diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico.    " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma. " +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para         " +
                                                  "\n mantener las v�as respiratorias hidratadas y reducir la viscosidad de las secreciones bronquiales. EJERCICIO: Se          " +
                                                  "\n aconseja actividad f�sica controlada y supervisada, con calentamiento previo y enfriamiento posterior, evitando           " +
                                                  "\n desencadenantes del asma como al�rgenos o aire fr�o. Se recomienda ejercicios de bajo impacto como nataci�n o yoga.       " +
                                                  "\n POSIBLE TRATAMIENTO: Para el asma en mujeres j�venes, el tratamiento suele incluir broncodilatadores de alivio r�pido,    " +
                                                  "\n como el salbutamol (marca com�n en M�xico: Ventolin o Aerolin), corticosteroides inhalados para el control a largo        " +
                                                  "\n plazo, como la fluticasona o budesonida (marcas comunes: Flixotide o Pulmicort), y en algunos casos, modificadores        " +
                                                  "\n de leucotrienos como el montelukast (marca com�n: Singulair). ALIMENTACI�N: Se recomienda el consumo de alimentos         " +
                                                  "\n con propiedades antiinflamatorias y antioxidantes para mejorar la funci�n pulmonar: Pescados grasos (salm�n, at�n):       " +
                                                  "\n Ricos en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias. Frutas y verduras de colores vivos (ar�ndanos,  " +
                                                  "\n fresas, espinacas, br�coli): Ricas en antioxidantes como la vitamina C (hasta un 107% del requerimiento diario en 100g    " +
                                                  "\n de br�coli) y carotenoides, que pueden proteger las c�lulas del da�o. Jengibre: Contiene compuestos con efectos           " +
                                                  "\n antiinflamatorios que podr�an ser beneficiosos para las v�as respiratorias. C�rcuma: Con su componente activo, la         " +
                                                  "\n curcumina, tiene potentes propiedades antiinflamatorias y antioxidantes. Este es solo un diagn�stico predeterminado       " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y       " +
                                                  "\n sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor      " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s, por su salud, si la respuesta del diagn�stico no le          " +
                                                  "\n satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida)    " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2.5 a 3 litros de agua al d�a, ya que la hidrataci�n adecuada es fundamental        " +
                                                  "\n para el funcionamiento del sistema inmunol�gico y la eliminaci�n de toxinas. Adem�s, el agua ayuda a reducir la fatiga       " +
                                                  "\n y mejorar la absorci�n de los medicamentos antirretrovirales. Se sugiere complementar con infusiones naturales como t�       " +
                                                  "\n verde o manzanilla, que poseen propiedades antioxidantes y antiinflamatorias. EJERCICIO. La actividad f�sica regular es      " +
                                                  "\n clave para fortalecer el sistema inmunol�gico y mejorar la salud cardiovascular. Se recomienda realizar ejercicio aer�bico   " +
                                                  "\n moderado al menos 30 minutos al d�a, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo. Tambi�n es         " +
                                                  "\n beneficioso incluir ejercicios de resistencia como levantamiento de pesas ligeras o yoga, que ayudan a mantener la masa      " +
                                                  "\n muscular y reducir el estr�s. POSIBLE TRATAMIENTO. El tratamiento est�ndar incluye terapia antirretroviral (TAR) con         " +
                                                  "\n medicamentos como tenofovir, emtricitabina y dolutegravir, que ayudan a controlar la replicaci�n del virus y mejorar         " +
                                                  "\n la calidad de vida. Marcas reconocidas incluyen Atripla, Truvada, Tivicay y Biktarvy, las cuales han demostrado eficacia     " +
                                                  "\n en el manejo del VIH/SIDA. ALIMENTACI�N. Para fortalecer el sistema inmunol�gico y reducir la inflamaci�n, se recomienda     " +
                                                  "\n consumir frutas c�tricas como naranja, lim�n y toronja, que son ricas en vitamina C, la cual contribuye a la producci�n      " +
                                                  "\n de gl�bulos blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento diario por cada 100     " +
                                                  "\n gramos. Verduras de hoja verde como espinaca, kale y acelga, que contienen �cido f�lico, esencial para la producci�n de      " +
                                                  "\n c�lulas sangu�neas, aportando cerca del 65% del requerimiento diario por cada 100 gramos. Pescados grasos como salm�n,       " +
                                                  "\n at�n y sardina, que son ricos en Omega-3, el cual tiene propiedades antiinflamatorias y aporta alrededor del 50% del         " +
                                                  "\n requerimiento diario por porci�n de 100 gramos. Frutos secos como almendras, nueces y semillas de ch�a, que aportan          " +
                                                  "\n vitamina E, la cual protege las c�lulas del da�o oxidativo y contribuye con el 70% del requerimiento diario por cada         " +
                                                  "\n 30 gramos. Legumbres como lentejas, garbanzos y frijoles, que son fuente de prote�nas y hierro, esenciales para la energ�a   " +
                                                  "\n y la regeneraci�n celular, aportando cerca del 40% del requerimiento diario por cada 100 gramos. Este es solo un             " +
                                                  "\n diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni          " +
                                                  "\n que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar         " +
                                                  "\n a un m�dico especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2 a 2.5 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda a                 " +
                                                  "\n eliminar toxinas y mantener el equilibrio del sistema inmunol�gico. Tambi�n es beneficioso complementar con                     " +
                                                  "\n infusiones naturales como t� verde o manzanilla, que poseen propiedades antibacterianas y antiinflamatorias. EJERCICIO.         " +
                                                  "\n La actividad f�sica moderada es clave para fortalecer el sistema inmunol�gico y mejorar la circulaci�n sangu�nea.               " +
                                                  "\n Se recomienda realizar ejercicio aer�bico moderado al menos 30 minutos al d�a, como caminar, nadar o andar en bicicleta,        " +
                                                  "\n evitando el sobreesfuerzo. Tambi�n es beneficioso incluir ejercicios de resistencia como levantamiento de pesas ligeras         " +
                                                  "\n o yoga, que ayudan a mantener la masa muscular y reducir el estr�s. POSIBLE TRATAMIENTO. El tratamiento est�ndar incluye        " +
                                                  "\n antibi�ticos como ceftriaxona y azitromicina, que ayudan a eliminar la bacteria Neisseria gonorrhoeae. Marcas reconocidas       " +
                                                  "\n incluyen Rocephin y Zithromax, las cuales han demostrado eficacia en el manejo de la gonorrea. ALIMENTACI�N. Para               " +
                                                  "\n fortalecer el sistema inmunol�gico y reducir la inflamaci�n, se recomienda consumir frutas c�tricas como naranja,               " +
                                                  "\n lim�n y toronja, que son ricas en vitamina C, la cual contribuye a la producci�n de gl�bulos blancos y mejora la                " +
                                                  "\n respuesta inmune, aportando aproximadamente el 90% del requerimiento diario por cada 100 gramos. Verduras de hoja               " +
                                                  "\n verde como espinaca, kale y acelga, que contienen �cido f�lico, esencial para la producci�n de c�lulas sangu�neas,              " +
                                                  "\n aportando cerca del 65% del requerimiento diario por cada 100 gramos. Pescados grasos como salm�n, at�n y sardina,              " +
                                                  "\n que son ricos en Omega-3, el cual tiene propiedades antiinflamatorias y aporta alrededor del 50% del requerimiento              " +
                                                  "\n diario por porci�n de 100 gramos. Frutos secos como almendras, nueces y semillas de ch�a, que aportan vitamina E,               " +
                                                  "\n la cual protege las c�lulas del da�o oxidativo y contribuye con el 70% del requerimiento diario por cada 30 gramos.             " +
                                                  "\n Legumbres como lentejas, garbanzos y frijoles, que son fuente de prote�nas y hierro, esenciales para la energ�a y la            " +
                                                  "\n regeneraci�n celular, aportando cerca del 40% del requerimiento diario por cada 100 gramos. Este es solo un diagn�stico         " +
                                                  "\n predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas      " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico especialista.     " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2 a 2.5 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda a              " +
                                                  "\n mantener la piel saludable y reducir la inflamaci�n causada por el virus. Tambi�n es beneficioso complementar con            " +
                                                  "\n infusiones naturales como t� de jengibre o c�rcuma, que poseen propiedades antivirales y antiinflamatorias. EJERCICIO.       " +
                                                  "\n La actividad f�sica moderada es clave para fortalecer el sistema inmunol�gico y mejorar la circulaci�n sangu�nea. Se         " +
                                                  "\n recomienda realizar ejercicio aer�bico moderado al menos 30 minutos al d�a, como caminar, nadar o andar en bicicleta,        " +
                                                  "\n evitando el sobreesfuerzo. Tambi�n es beneficioso incluir ejercicios de resistencia como levantamiento de pesas ligeras      " +
                                                  "\n o yoga, que ayudan a mantener la masa muscular y reducir el estr�s. POSIBLE TRATAMIENTO. El tratamiento est�ndar incluye     " +
                                                  "\n antivirales como aciclovir, valaciclovir y famciclovir, que ayudan a reducir la duraci�n y gravedad de los brotes.           " +
                                                  "\n Marcas reconocidas incluyen Zovirax, Valtrex y Famvir, las cuales han demostrado eficacia en el manejo del herpes            " +
                                                  "\n genital. ALIMENTACI�N. Para fortalecer el sistema inmunol�gico y reducir la inflamaci�n, se recomienda consumir frutas       " +
                                                  "\n c�tricas como naranja, lim�n y toronja, que son ricas en vitamina C, la cual contribuye a la producci�n de gl�bulos          " +
                                                  "\n blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento diario por cada 100 gramos.         " +
                                                  "\n Verduras de hoja verde como espinaca, kale y acelga, que contienen �cido f�lico, esencial para la producci�n de c�lulas      " +
                                                  "\n sangu�neas, aportando cerca del 65% del requerimiento diario por cada 100 gramos. Pescados grasos como salm�n, at�n y        " +
                                                  "\n sardina, que son ricos en Omega-3, el cual tiene propiedades antiinflamatorias y aporta alrededor del 50% del requerimiento  " +
                                                  "\n diario por porci�n de 100 gramos. Frutos secos como almendras, nueces y semillas de ch�a, que aportan vitamina E, la cual    " +
                                                  "\n protege las c�lulas del da�o oxidativo y contribuye con el 70% del requerimiento diario por cada 30 gramos. Legumbres como   " +
                                                  "\n lentejas, garbanzos y frijoles, que son fuente de prote�nas y hierro, esenciales para la energ�a y la regeneraci�n celular,  " +
                                                  "\n aportando cerca del 40% del requerimiento diario por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico.     " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente       " +
                                                  "\n correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico especialista. Angel L Montes      " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2.5 a 3 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda       " +
                                                  "\n a eliminar toxinas y mejorar la circulaci�n sangu�nea. Tambi�n es beneficioso complementar con infusiones           " +
                                                  "\n naturales como t� verde o manzanilla, que poseen propiedades antibacterianas y antiinflamatorias. EJERCICIO.        " +
                                                  "\n La actividad f�sica moderada es clave para fortalecer el sistema inmunol�gico y mejorar la circulaci�n sangu�nea.   " +
                                                  "\n Se recomienda realizar ejercicio aer�bico moderado al menos 30 minutos al d�a, como caminar, nadar o andar en       " +
                                                  "\n bicicleta, evitando el sobreesfuerzo. Tambi�n es beneficioso incluir ejercicios de resistencia como levantamiento   " +
                                                  "\n de pesas ligeras o yoga, que ayudan a mantener la masa muscular y reducir el estr�s. POSIBLE TRATAMIENTO. El        " +
                                                  "\n tratamiento est�ndar incluye antibi�ticos como penicilina G benzatina y doxiciclina, que ayudan a eliminar la       " +
                                                  "\n bacteria Treponema pallidum. Marcas reconocidas incluyen Benzetacil y Vibramycin, las cuales han demostrado eficacia   " +
                                                  "\n en el manejo de la s�filis. ALIMENTACI�N. Para fortalecer el sistema inmunol�gico y reducir la inflamaci�n, se         " +
                                                  "\n recomienda consumir frutas c�tricas como naranja, lim�n y toronja, que son ricas en vitamina C, la cual contribuye     " +
                                                  "\n a la producci�n de gl�bulos blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento   " +
                                                  "\n diario por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda     " +
                                                  "\n realizar m�s de un diagn�stico y consultar a un m�dico especialista. Angel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis." +
                                                  "\n EJERCICIO: Es fundamental que la paciente mantenga una rutina de actividad f�sica moderada, evitando esfuerzos            " +
                                                  "\n excesivos que puedan comprometan su capacidad respiratoria. Se recomienda ejercicios de bajo impacto como caminatas       " +
                                                  "\n suaves o yoga, adaptados a su condici�n y siempre bajo supervisi�n m�dica. HIDRATACI�N: La hidrataci�n es clave en el     " +
                                                  "\n tratamiento, ayudando a mantener las v�as respiratorias limpias y mejorar la eliminaci�n de toxinas. Se recomienda el     " +
                                                  "\n consumo diario de 2.5 litros de agua, aproximadamente 10 vasos de tama�o regular, para facilitar la expectoraci�n y       " +
                                                  "\n reducir la irritaci�n pulmonar. POSIBLE TRATAMIENTO: La tuberculosis se trata con antibi�ticos de primera l�nea como      " +
                                                  "\n isoniazida, rifampicina, etambutol y pirazinamida. En M�xico, algunas marcas reconocidas son Rimactane (rifampicina),     " +
                                                  "\n Laniazid (isoniazida) y Myambutol (etambutol). Es crucial seguir el tratamiento completo para evitar resistencia bacteriana. " +
                                                  "\n ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema inmunol�gico y mejorar la recuperaci�n, se recomienda el consumo        " +
                                                  "\n de alimentos ricos en vitaminas y minerales esenciales. FRUTAS C�TRICAS (naranjas, limones, toronjas): Altas en VITAMINA C,  " +
                                                  "\n que fortalece el sistema inmune, aportando aproximadamente el 89% del requerimiento diario por cada 100 gramos. AGUACATE:    " +
                                                  "\n Rico en VITAMINA E, que contribuye a la regeneraci�n celular, proporcionando cerca del 14% del requerimiento diario por      " +
                                                  "\n cada 100 gramos. ALMENDRAS Y NUECES: Contienen ZINC, esencial para la cicatrizaci�n y la respuesta inmunol�gica, aportando   " +
                                                  "\n alrededor del 15% del requerimiento diario por cada 30 gramos. PESCADOS GRASOS (salm�n, at�n): Fuente de OMEGA-3, con        " +
                                                  "\n propiedades antiinflamatorias, proporcionando aproximadamente 2.2 gramos por cada 100 gramos de pescado. VEGETALES DE        " +
                                                  "\n HOJA VERDE (espinaca, acelga): Ricos en HIERRO, fundamental para combatir la fatiga y mejorar la oxigenaci�n celular,        " +
                                                  "\n aportando cerca del 15% del requerimiento diario por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico.     " +
                                                  "\n Haberlo consultado no garantiza al 100% que la paciente tenga tuberculosis ni que el tratamiento sea el adecuado. Se         " +
                                                  "\n recomienda realizar m�s de un diagn�stico para mayor seguridad y, por su salud, consultar a su m�dico. Angel L Montes        " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n EJERCICIO: Es recomendable que la paciente realice actividad f�sica de bajo impacto como nataci�n, yoga o caminatas      " +
                                                  "\n suaves para mantener la movilidad articular y reducir la inflamaci�n. Se debe evitar el sobreesfuerzo y consultar al     " +
                                                  "\n m�dico para adaptar el ejercicio a su condici�n. HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de       " +
                                                  "\n agua, aproximadamente 8 a 10 vasos de tama�o regular, para mantener la lubricaci�n de las articulaciones y reducir       " +
                                                  "\n la rigidez matutina. POSIBLE TRATAMIENTO: La artritis se trata con medicamentos antiinflamatorios como ibuprofeno y      " +
                                                  "\n naproxeno, adem�s de f�rmacos modificadores de la enfermedad como metotrexato y sulfasalazina. En M�xico, algunas        " +
                                                  "\n marcas reconocidas son Voltaren (diclofenaco), Celebrex (celecoxib) y Arava (leflunomida). ALIMENTACI�N RECOMENDADA:     " +
                                                  "\n Para reducir la inflamaci�n y fortalecer las articulaciones, se recomienda el consumo de alimentos ricos en vitaminas    " +
                                                  "\n y minerales esenciales. PESCADOS GRASOS (salm�n, at�n): Fuente de OMEGA-3, con propiedades antiinflamatorias,            " +
                                                  "\n proporcionando aproximadamente 2.2 gramos por cada 100 gramos de pescado. FRUTAS C�TRICAS (naranjas, limones, toronjas): " +
                                                  "\n Altas en VITAMINA C, que fortalece el sistema inmune y ayuda a la producci�n de col�geno, aportando aproximadamente 89%  " +
                                                  "\n del requerimiento diario por cada 100 gramos. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO,    " +
                                                  "\n fundamentales para la regeneraci�n celular y la funci�n muscular, aportando cerca del 15% del requerimiento diario por   " +
                                                  "\n cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que la       " +
                                                  "\n paciente tenga artritis ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico para mayor   " +
                                                  "\n seguridad y, por su salud, consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n EJERCICIO: Se recomienda evitar esfuerzos f�sicos intensos mientras persistan los s�ntomas, priorizando el descanso         " +
                                                  "\n y la recuperaci�n pulmonar. HIDRATACI�N: Es fundamental el consumo de 2.5 a 3 litros de agua, aproximadamente 10 a 12       " +
                                                  "\n vasos de tama�o regular, para mantener las v�as respiratorias hidratadas y facilitar la eliminaci�n de secreciones.         " +
                                                  "\n POSIBLE TRATAMIENTO: La tosferina se trata con antibi�ticos como azitromicina, claritromicina y eritromicina. En M�xico,    " +
                                                  "\n algunas marcas reconocidas son Zithromax (azitromicina), Klaricid (claritromicina) y Ilosone (eritromicina). ALIMENTACI�N   " +
                                                  "\n RECOMENDADA: Para fortalecer el sistema inmunol�gico y mejorar la recuperaci�n, se recomienda el consumo de alimentos       " +
                                                  "\n ricos en vitaminas y minerales esenciales. FRUTAS C�TRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que          " +
                                                  "\n fortalece el sistema inmune, aportando aproximadamente 89% del requerimiento diario por cada 100 gramos. JENGIBRE:          " +
                                                  "\n Contiene compuestos con efectos antiinflamatorios que pueden ayudar a aliviar la irritaci�n de las v�as respiratorias,      " +
                                                  "\n proporcionando 5% del requerimiento diario de antioxidantes por cada 10 gramos. MIEL: Con propiedades antimicrobianas       " +
                                                  "\n y calmantes para la garganta, aportando 20% del requerimiento diario de antioxidantes por cada 30 gramos. Este es solo      " +
                                                  "\n un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que la paciente tenga tosferina ni que el     " +
                                                  "\n tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico para mayor seguridad y, por su salud, consultar   " +
                                                  "\n a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n EJERCICIO: Se recomienda reposo absoluto mientras persistan los s�ntomas para evitar complicaciones. HIDRATACI�N:    " +
                                                  "\n Es esencial el consumo de 2 a 2.5 litros de agua, aproximadamente 8 a 10 vasos de tama�o regular, para mantener la   " +
                                                  "\n hidrataci�n y reducir la fiebre. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para las paperas, pero se  " +
                                                  "\n pueden utilizar analg�sicos como paracetamol e ibuprofeno para aliviar los s�ntomas. En M�xico, algunas marcas       " +
                                                  "\n reconocidas son Tempra (paracetamol) y Advil (ibuprofeno). ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema      " +
                                                  "\n inmunol�gico y mejorar la recuperaci�n, se recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales. " +
                                                  "\n FRUTAS C�TRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema inmune, aportando         " +
                                                  "\n aproximadamente 89% del requerimiento diario por cada 100 gramos. PUR�S Y SOPAS: Facilitan la ingesta de alimentos     " +
                                                  "\n sin irritar las gl�ndulas salivales, proporcionando 15% del requerimiento diario de minerales esenciales por cada      " +
                                                  "\n 100 gramos. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales para la regeneraci�n " +
                                                  "\n celular y la funci�n muscular, aportando cerca del 15% del requerimiento diario por cada 100 gramos. Este es solo un   " +
                                                  "\n diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que la paciente tenga paperas ni que el     " +
                                                  "\n tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico para mayor seguridad y, por su salud, consultar" +
                                                  "\n a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente mantenga una hidrataci�n adecuada, consumiendo al menos 2 a 2.5 litros      " +
                                                  "\n de agua al d�a (aproximadamente ocho a diez vasos de agua de tama�o regular) para ayudar a su cuerpo a combatir la      " +
                                                  "\n infecci�n y prevenir la deshidrataci�n causada por fiebre y sudoraci�n. EJERCICIO: Se recomienda reposo moderado,       " +
                                                  "\n evitando esfuerzos f�sicos intensos mientras persistan los s�ntomas. Una vez recuperada, puede retomar el ejercicio     " +
                                                  "\n de forma progresiva. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para el Zika. El manejo se centra en      " +
                                                  "\n aliviar los s�ntomas con paracetamol (marca com�n en M�xico: Tempra) para la fiebre y el dolor, evitando el uso de         " +
                                                  "\n aspirina y otros antiinflamatorios no esteroides debido al riesgo de complicaciones hemorr�gicas. Tambi�n se recomienda    " +
                                                  "\n el uso de antihistam�nicos para aliviar el sarpullido y la picaz�n. ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema   " +
                                                  "\n inmunol�gico y ayudar en la recuperaci�n, se recomienda el consumo de FRUTAS C�TRICAS como naranja, lim�n y toronja, ricas " +
                                                  "\n en VITAMINA C, que ayuda a fortalecer el sistema inmune y aporta aproximadamente el 89% del requerimiento diario por cada  " +
                                                  "\n 100 g de consumo. PAPAYA, que contiene VITAMINA A y C, adem�s de enzimas que pueden ayudar a reducir la inflamaci�n,       " +
                                                  "\n aportando cerca del 75% del requerimiento diario de VITAMINA C por cada 100 g. JENGIBRE, con propiedades ANTIINFLAMATORIAS " +
                                                  "\n y antioxidantes que pueden aliviar s�ntomas como dolor muscular, aportando compuestos bioactivos como gingerol y shogaol.     " +
                                                  "\n VERDURAS DE HOJA VERDE como espinaca, acelga y kale, ricas en HIERRO y antioxidantes esenciales para la recuperaci�n celular, " +
                                                  "\n aportando cerca del 15% del requerimiento diario de HIERRO por cada 100 g. AGUA DE COCO, fuente natural de ELECTROLITOS,      " +
                                                  "\n �til para prevenir la deshidrataci�n, aportando potasio y sodio esenciales para la hidrataci�n celular. Este es solo un  " +
                                                  "\n diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que  " +
                                                  "\n las respuestas sean completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el     " +
                                                  "\n tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda      " +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2.5 a 3 litros de agua al d�a (aproximadamente diez          " +
                                                  "\n a doce vasos de agua de tama�o regular) para prevenir la deshidrataci�n causada por diarrea y v�mitos. Adem�s, se         " +
                                                  "\n recomienda el consumo de soluciones de rehidrataci�n oral como suero fisiol�gico para reponer los electrolitos            " +
                                                  "\n perdidos y evitar complicaciones graves. EJERCICIO: Se recomienda reposo absoluto mientras persistan los s�ntomas,        " +
                                                  "\n evitando cualquier actividad f�sica intensa. Una vez recuperada, puede retomar el ejercicio de forma progresiva,          " +
                                                  "\n comenzando con caminatas suaves y ejercicios de movilidad para fortalecer el cuerpo sin generar estr�s adicional.         " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para el rotavirus. El manejo se centra en la rehidrataci�n       " +
                                                  "\n con soluciones de electrolitos como Suero Oral (marca com�n en M�xico: Electrolit) para reponer los minerales perdidos.   " +
                                                  "\n En casos graves, puede requerirse hidrataci�n intravenosa en un entorno hospitalario. Tambi�n se recomienda el uso de     " +
                                                  "\n probi�ticos para ayudar a restaurar la flora intestinal y mejorar la digesti�n. ALIMENTACI�N RECOMENDADA: Para fortalecer " +
                                                  "\n el sistema digestivo y ayudar en la recuperaci�n, se recomienda el consumo de PL�TANO, rico en POTASIO, que ayuda a       " +
                                                  "\n reponer electrolitos perdidos, aportando aproximadamente el 12% del requerimiento diario por cada 100 g. ARROZ BLANCO,    " +
                                                  "\n fuente de CARBOHIDRATOS de f�cil digesti�n, que ayuda a estabilizar el sistema digestivo. MANZANA, rica en PECTINA,       " +
                                                  "\n que contribuye a la regulaci�n intestinal y aporta cerca del 10% del requerimiento diario de FIBRA por cada 100 g.        " +
                                                  "\n ZANAHORIA, fuente de VITAMINA A, que ayuda a la regeneraci�n celular y aporta aproximadamente el 89% del requerimiento    " +
                                                  "\n diario por cada 100 g. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el  " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar m�s de un       " +
                                                  "\n diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le  " +
                                                  "\n satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera    " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de al menos 2 litros de agua al d�a (aproximadamente ocho vasos de agua de tama�o          " +
                                                  "\n regular) para ayudar al cuerpo a eliminar la bacteria y prevenir la deshidrataci�n causada por fiebre y malestar. Tambi�n        " +
                                                  "\n es recomendable el consumo de l�quidos ricos en electrolitos como agua de coco o caldos naturales para mejorar la recuperaci�n.  " +
                                                  "\n EJERCICIO: Se recomienda reposo moderado mientras persistan los s�ntomas, evitando esfuerzos f�sicos intensos. Sin embargo,      " +
                                                  "\n una vez recuperada, se pueden realizar ejercicios de bajo impacto como yoga o estiramientos suaves para mejorar la circulaci�n   " +
                                                  "\n y fortalecer el sistema inmunol�gico. POSIBLE TRATAMIENTO: El tratamiento para la listeriosis suele incluir antibi�ticos como    " +
                                                  "\n ampicilina o gentamicina (marcas comunes en M�xico: Amikin, Ampigrin) en casos graves. Adem�s, se recomienda el consumo de       " +
                                                  "\n alimentos ricos en antioxidantes para ayudar al cuerpo a combatir la infecci�n de manera natural. ALIMENTACI�N RECOMENDADA:      " +
                                                  "\n Para fortalecer el sistema inmunol�gico y ayudar en la recuperaci�n, se recomienda el consumo de YOGUR NATURAL, rico en          " +
                                                  "\n PROBI�TICOS, que favorecen la recuperaci�n intestinal y aportan aproximadamente 10^9 UFC por cada 100 g. AJO, con propiedades    " +
                                                  "\n ANTIBACTERIANAS, que pueden ayudar a combatir la infecci�n y aporta compuestos bioactivos como alicina. ESPINACA, fuente de      " +
                                                  "\n VITAMINA C y HIERRO, que fortalece el sistema inmune y aporta cerca del 15% del requerimiento diario de HIERRO por cada 100 g.   " +
                                                  "\n FRUTOS ROJOS, ricos en ANTIOXIDANTES, que ayudan a reducir la inflamaci�n y aportan aproximadamente el 50% del requerimiento     " +
                                                  "\n diario de VITAMINA C por cada 100 g. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al       " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar m�s de     " +
                                                  "\n un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le      " +
                                                  "\n satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que       " +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2.5 litros de agua al d�a (aproximadamente diez vasos de         " +
                                                  "\n agua de tama�o regular) para prevenir la deshidrataci�n causada por diarrea intensa. Tambi�n se recomienda el consumo         " +
                                                  "\n de suero oral y bebidas con electrolitos para evitar la p�rdida excesiva de minerales esenciales. EJERCICIO: Se recomienda    " +
                                                  "\n reposo absoluto mientras persistan los s�ntomas, evitando cualquier actividad f�sica intensa. Una vez recuperada, se pueden   " +
                                                  "\n realizar ejercicios de bajo impacto como caminatas suaves y estiramientos para mejorar la circulaci�n y fortalecer el         " +
                                                  "\n sistema digestivo. POSIBLE TRATAMIENTO: El tratamiento para la shigelosis suele incluir antibi�ticos como ciprofloxacino      " +
                                                  "\n o azitromicina (marcas comunes en M�xico: Ciproxina, Zithromax) en casos graves. Tambi�n se recomienda el consumo de          " +
                                                  "\n alimentos ricos en fibra para ayudar a regular el tr�nsito intestinal y mejorar la digesti�n. ALIMENTACI�N RECOMENDADA:       " +
                                                  "\n Para fortalecer el sistema digestivo y ayudar en la recuperaci�n, se recomienda el consumo de PL�TANO, rico en POTASIO,       " +
                                                  "\n que ayuda a reponer electrolitos perdidos, aportando aproximadamente el 12% del requerimiento diario por cada 100 g.          " +
                                                  "\n ARROZ BLANCO, fuente de CARBOHIDRATOS de f�cil digesti�n, que ayuda a estabilizar el sistema digestivo. MANZANA, rica en      " +
                                                  "\n PECTINA, que contribuye a la regulaci�n intestinal y aporta cerca del 10% del requerimiento diario de FIBRA por cada 100 g.   " +
                                                  "\n ZANAHORIA, fuente de VITAMINA A, que ayuda a la regeneraci�n celular y aporta aproximadamente el 89% del requerimiento        " +
                                                  "\n diario por cada 100 g. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el      " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar m�s de un           " +
                                                  "\n diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no         " +
                                                  "\n le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera     " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC). " +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al d�a (aproximadamente ocho a diez     " +
                                                  "\n vasos de agua de tama�o regular) para mantener la hidrataci�n de las v�as respiratorias y reducir la acumulaci�n de         " +
                                                  "\n mucosidad. Tambi�n se recomienda el consumo de l�quidos tibios como t� de jengibre o caldos naturales para mejorar la       " +
                                                  "\n funci�n pulmonar. EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas diarias de 30 a 60 minutos,            " +
                                                  "\n ejercicios de respiraci�n y fortalecimiento pulmonar. Evitar la exposici�n a contaminantes y humo de tabaco es crucial      " +
                                                  "\n para prevenir exacerbaciones. POSIBLE TRATAMIENTO: El tratamiento para la EPOC suele incluir broncodilatadores de acci�n    " +
                                                  "\n r�pida y prolongada, como el salbutamol (marca com�n en M�xico: Ventolin) y corticosteroides inhalados como la fluticasona  " +
                                                  "\n (marca com�n: Flixotide). En casos avanzados, puede requerirse oxigenoterapia y rehabilitaci�n pulmonar. ALIMENTACI�N       " +
                                                  "\n RECOMENDADA: Para fortalecer el sistema respiratorio y reducir la inflamaci�n, se recomienda el consumo de PESCADOS         " +
                                                  "\n GRASOS como salm�n y at�n, ricos en �CIDOS GRASOS OMEGA-3, que poseen propiedades antiinflamatorias y aportan aproximadamente " +
                                                  "\n el 50% del requerimiento diario por cada 100 g. FRUTAS C�TRICAS como naranja y toronja, ricas en VITAMINA C, que fortalece    " +
                                                  "\n el sistema inmune y aporta cerca del 89% del requerimiento diario por cada 100 g. ESPINACA, fuente de HIERRO y ANTIOXIDANTES, " +
                                                  "\n que ayudan a mejorar la oxigenaci�n celular y aportan aproximadamente el 15% del requerimiento diario de HIERRO por cada      " +
                                                  "\n 100 g. JENGIBRE, con propiedades ANTIINFLAMATORIAS y antioxidantes, que pueden aliviar s�ntomas respiratorios y mejorar       " +
                                                  "\n la funci�n pulmonar. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el        " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar m�s de un           " +
                                                  "\n diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no         " +
                                                  "\n le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera     " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de al menos 2 litros de agua al d�a (aproximadamente ocho vasos de agua de tama�o         " +
                                                  "\n regular) para ayudar al cuerpo a eliminar la bacteria y prevenir la deshidrataci�n causada por fiebre y malestar. Tambi�n       " +
                                                  "\n es recomendable el consumo de l�quidos ricos en electrolitos como agua de coco o caldos naturales para mejorar la               " +
                                                  "\n recuperaci�n. EJERCICIO: Se recomienda reposo moderado mientras persistan los s�ntomas, evitando esfuerzos f�sicos intensos.    " +
                                                  "\n Sin embargo, una vez recuperada, se pueden realizar ejercicios de bajo impacto como yoga o estiramientos suaves para mejorar    " +
                                                  "\n la circulaci�n y fortalecer el sistema inmunol�gico. POSIBLE TRATAMIENTO: El tratamiento para la clamidia suele incluir         " +
                                                  "\n antibi�ticos como azitromicina o doxiciclina (marcas comunes en M�xico: Zithromax, Vibramycin). Es fundamental completar        " +
                                                  "\n el tratamiento indicado por el m�dico para evitar complicaciones y recurrencias. ALIMENTACI�N RECOMENDADA: Para fortalecer      " +
                                                  "\n el sistema inmunol�gico y ayudar en la recuperaci�n, se recomienda el consumo de YOGUR NATURAL, rico en PROBI�TICOS, que        " +
                                                  "\n favorecen la recuperaci�n intestinal y aportan aproximadamente 10^9 UFC por cada 100 g. AJO, con propiedades ANTIBACTERIANAS,   " + 
                                                  "\n que pueden ayudar a combatir la infecci�n y aporta compuestos bioactivos como alicina. ESPINACA, fuente de VITAMINA C y         " +
                                                  "\n HIERRO, que fortalece el sistema inmune y aporta cerca del 15% del requerimiento diario de HIERRO por cada 100 g. FRUTOS        " +
                                                  "\n ROJOS, ricos en ANTIOXIDANTES, que ayudan a reducir la inflamaci�n y aportan aproximadamente el 50% del requerimiento           " +
                                                  "\n diario de VITAMINA C por cada 100 g. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza         " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar        " +
                                                  "\n m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico    " +
                                                  "\n no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera    " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2.5 litros de agua al d�a (aproximadamente diez          " +
                                                  "\n vasos de agua de tama�o regular) para prevenir la deshidrataci�n causada por fiebre y sudoraci�n. Tambi�n se          " +
                                                  "\n recomienda el consumo de caldos naturales y bebidas con electrolitos para mejorar la recuperaci�n. EJERCICIO:         " +
                                                  "\n Se recomienda reposo absoluto mientras persistan los s�ntomas, evitando cualquier actividad f�sica intensa.           " +
                                                  "\n Una vez recuperada, se pueden realizar ejercicios de bajo impacto como caminatas suaves y estiramientos para          " +
                                                  "\n mejorar la circulaci�n y fortalecer el sistema nervioso. POSIBLE TRATAMIENTO: El tratamiento para la meningitis       " +
                                                  "\n bacteriana suele incluir antibi�ticos como ceftriaxona o vancomicina (marcas comunes en M�xico: Rocephin, Vancocin).     " +
                                                  "\n En casos graves, puede requerirse hospitalizaci�n y monitoreo constante. ALIMENTACI�N RECOMENDADA: Para fortalecer el    " +
                                                  "\n sistema inmunol�gico y ayudar en la recuperaci�n, se recomienda el consumo de FRUTAS C�TRICAS como naranja y toronja,    " +
                                                  "\n ricas en VITAMINA C, que fortalece el sistema inmune y aporta cerca del 89% del requerimiento diario por cada 100 g.     " +
                                                  "\n PESCADOS GRASOS como salm�n y at�n, ricos en �CIDOS GRASOS OMEGA-3, que poseen propiedades antiinflamatorias y aportan   " +
                                                  "\n aproximadamente el 50% del requerimiento diario por cada 100 g. ESPINACA, fuente de HIERRO y ANTIOXIDANTES, que ayudan   " +
                                                  "\n a mejorar la oxigenaci�n celular y aportan aproximadamente el 15% del requerimiento diario de HIERRO por cada 100 g.     " +
                                                  "\n JENGIBRE, con propiedades ANTIINFLAMATORIAS y antioxidantes, que pueden aliviar s�ntomas neurol�gicos y mejorar la funci�n  " +
                                                  "\n cerebral. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga  " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor " +
                                                  "\n seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se   " +
                                                  "\n recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N. Es fundamental mantener una hidrataci�n adecuada para apoyar la funci�n celular y reducir los efectos         " +
                                                  "\n secundarios del tratamiento, se recomienda el consumo de 2 a 2.5 litros de agua al d�a, adem�s de l�quidos ricos en        " +
                                                  "\n electrolitos como agua de coco o sueros orales para evitar la deshidrataci�n causada por la quimioterapia. EJERCICIO.      " +
                                                  "\n La actividad f�sica debe ser moderada y adaptada a la condici�n del paciente, se recomienda ejercicio ligero como          " +
                                                  "\n caminatas, yoga o estiramientos para mejorar la circulaci�n, reducir la fatiga y fortalecer el sistema inmunol�gico,       " +
                                                  "\n adem�s el ejercicio puede ayudar a disminuir la inflamaci�n y mejorar el estado de �nimo, es importante realizarlo         " +
                                                  "\n bajo supervisi�n m�dica y ajustar la intensidad seg�n la tolerancia del paciente. POSIBLE TRATAMIENTO. El tratamiento      " +
                                                  "\n var�a seg�n el tipo de c�ncer pero puede incluir quimioterapia, radioterapia, cirug�a y terapias dirigidas, en M�xico      " +
                                                  "\n algunos medicamentos utilizados incluyen Paclitaxel, Doxorrubicina y Trastuzumab dependiendo del tipo de c�ncer, adem�s    " +
                                                  "\n existen tratamientos complementarios como la inmunoterapia y la terapia hormonal que pueden ser recomendados por el          " +
                                                  "\n m�dico seg�n el caso, es crucial seguir las indicaciones m�dicas y realizar chequeos constantes para evaluar la efectividad  " +
                                                  "\n del tratamiento. ALIMENTACI�N. Se sugiere una dieta rica en antioxidantes y nutrientes esenciales para fortalecer el sistema " +
                                                  "\n inmunol�gico, NARANJA. Rica en vitamina C que ayuda a la regeneraci�n celular, aporta aproximadamente el 89% de la ingesta   " +
                                                  "\n diaria recomendada por cada 100 gramos. BR�COLI. Contiene antioxidantes y �cido f�lico esenciales para la reparaci�n celular," +
                                                  "\n aporta cerca del 15% de la ingesta diaria recomendada de �cido f�lico por cada 100 gramos. PESCADO GRASO (SALM�N, AT�N).     " +
                                                  "\n Rico en Omega-3 que puede ayudar a reducir la inflamaci�n, aporta aproximadamente el 50% de la ingesta diaria recomendada    " +
                                                  "\n de Omega-3 por cada 100 gramos. C�RCUMA. Contiene curcumina con propiedades antiinflamatorias y antioxidantes, su consumo    " +
                                                  "\n puede aportar hasta el 20% de la ingesta diaria recomendada de antioxidantes. Este es solo un Diagn�stico predeterminado     " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus      " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad   " +
                                                  "\n en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se   " +
                                                  "\n le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.35-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N. Es esencial mantener una hidrataci�n adecuada para ayudar al cuerpo a combatir la infecci�n y reducir         " +
                                                  "\n los s�ntomas, se recomienda el consumo de 2 a 2.5 litros de agua al d�a, adem�s de l�quidos calientes como t� de           " +
                                                  "\n jengibre o caldos para aliviar la congesti�n y mantener la garganta hidratada. EJERCICIO. Se recomienda actividad          " +
                                                  "\n f�sica ligera como caminatas suaves o estiramientos para mejorar la circulaci�n y fortalecer el sistema inmunol�gico,      " +
                                                  "\n sin embargo, es importante evitar esfuerzos excesivos mientras persistan los s�ntomas, el descanso adecuado tambi�n        " + 
                                                  "\n es clave para la recuperaci�n. POSIBLE TRATAMIENTO. El tratamiento suele incluir medicamentos para reducir la fiebre       " +
                                                  "\n y aliviar los s�ntomas como el paracetamol (Tempra) o el ibuprofeno (Advil), adem�s los antivirales espec�ficos contra     " +
                                                  "\n la gripe como el oseltamivir (Tamiflu) pueden ser recetados en casos graves, es fundamental seguir las indicaciones        " +
                                                  "\n m�dicas y evitar la automedicaci�n. ALIMENTACI�N. Se recomienda el consumo de alimentos ricos en vitaminas y antioxidantes " +
                                                  "\n para fortalecer el sistema inmunol�gico, NARANJA. Rica en vitamina C que ayuda a reducir la duraci�n de los s�ntomas,      " +
                                                  "\n aporta aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE. Contiene compuestos con      " +
                                                  "\n efectos antiinflamatorios y ayuda a aliviar la congesti�n, su consumo puede aportar hasta el 20% de la ingesta diaria      " +
                                                  "\n recomendada de antioxidantes. MIEL. Posee propiedades antimicrobianas y ayuda a calmar la garganta, aporta cerca del 10%   " +
                                                  "\n de la ingesta diaria recomendada de antioxidantes por cada cucharada. Este es solo un Diagn�stico predeterminado l�gico,   " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el      " +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le    " +
                                                  "\n recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N. Es crucial mantener una hidrataci�n adecuada para ayudar a fluidificar las secreciones y facilitar la        " +
                                                  "\n respiraci�n, se recomienda el consumo de 2.5 a 3 litros de agua al d�a, adem�s de l�quidos calientes como infusiones      " +
                                                  "\n de tomillo o caldos para aliviar la irritaci�n pulmonar. EJERCICIO. La actividad f�sica debe ser m�nima durante la        " +
                                                  "\n fase aguda de la enfermedad, se recomienda ejercicios de respiraci�n profunda y expansi�n pulmonar para mejorar la        " +
                                                  "\n oxigenaci�n, una vez recuperada la paciente, se pueden retomar actividades ligeras como caminatas cortas. POSIBLE         " +
                                                  "\n TRATAMIENTO. El tratamiento suele incluir antibi�ticos en caso de neumon�a bacteriana como la amoxicilina con �cido       " +
                                                  "\n clavul�nico (Clavulin) o la azitromicina, adem�s pueden recetarse broncodilatadores y antiinflamatorios para mejorar      " +
                                                  "\n la funci�n pulmonar, es fundamental seguir las indicaciones m�dicas y completar el tratamiento. ALIMENTACI�N. Se          " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema respiratorio," +
                                                  "\n ESPINACA. Rica en vitamina A que ayuda a la regeneraci�n celular pulmonar, aporta aproximadamente el 56% de la ingesta    " +
                                                  "\n diaria recomendada por cada 100 gramos. TOMILLO. Contiene compuestos con propiedades antimicrobianas y ayuda a aliviar    " +
                                                  "\n la inflamaci�n pulmonar, su consumo puede aportar hasta el 15% de la ingesta diaria recomendada de antioxidantes. PESCADO " +
                                                  "\n GRASO (SALM�N, AT�N). Rico en Omega-3 que puede ayudar a reducir la inflamaci�n pulmonar, aporta aproximadamente el 50%   " +
                                                  "\n de la ingesta diaria recomendada de Omega-3 por cada 100 gramos. Este es solo un Diagn�stico predeterminado l�gico,       " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas" +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el     " +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le   " +
                                                  "\n recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACI�N. Es fundamental mantener una hidrataci�n adecuada para regular los niveles de glucosa en sangre y prevenir     " +
                                                  "\n la deshidrataci�n, se recomienda el consumo de 2 a 3 litros de agua al d�a, adem�s de infusiones sin az�car como t�        " +
                                                  "\n verde o agua de jamaica para mejorar la circulaci�n. EJERCICIO. Se recomienda actividad f�sica moderada como caminatas,    " +
                                                  "\n nataci�n o yoga para mejorar la sensibilidad a la insulina y controlar los niveles de glucosa, es importante realizar      " +
                                                  "\n ejercicio de manera constante y bajo supervisi�n m�dica. POSIBLE TRATAMIENTO. El tratamiento suele incluir medicamentos    " +
                                                  "\n para controlar la glucosa como la metformina (Glucophage) o insulina en casos m�s avanzados, adem�s pueden recetarse       " +
                                                  "\n medicamentos complementarios como los inhibidores de SGLT2 para mejorar el control metab�lico, es fundamental seguir       " +
                                                  "\n las indicaciones m�dicas y mantener un monitoreo constante. ALIMENTACI�N. Se recomienda el consumo de alimentos con bajo   " +
                                                  "\n �ndice gluc�mico y ricos en fibra para estabilizar los niveles de glucosa, AVENA. Rica en fibra soluble que ayuda a        " +
                                                  "\n regular la glucosa en sangre, aporta aproximadamente el 40% de la ingesta diaria recomendada por cada 100 gramos. NOPAL.   " +
                                                  "\n Contiene fibra y antioxidantes que ayudan a mejorar la sensibilidad a la insulina, su consumo puede aportar hasta el 30%   " +
                                                  "\n de la ingesta diaria recomendada de fibra. ALMENDRAS. Ricas en grasas saludables y magnesio que ayudan a mejorar la        " +
                                                  "\n funci�n metab�lica, aportan aproximadamente el 25% de la ingesta diaria recomendada de magnesio por cada 100 gramos.       " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa       " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un          " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud      " +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes      " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para       " +
                                                  "\n mantener las v�as respiratorias hidratadas y reducir la viscosidad de las secreciones bronquiales. La hidrataci�n       " +
                                                  "\n adecuada tambi�n puede ayudar a prevenir la irritaci�n de las v�as respiratorias y mejorar la funci�n pulmonar.         " +
                                                  "\n EJERCICIO: Se aconseja actividad f�sica controlada y supervisada, con calentamiento previo y enfriamiento posterior,    " +
                                                  "\n evitando desencadenantes del asma como al�rgenos o aire fr�o. Se recomienda ejercicios de bajo impacto como nataci�n    " +
                                                  "\n o yoga, ya que pueden mejorar la capacidad pulmonar sin desencadenar s�ntomas asm�ticos. POSIBLE TRATAMIENTO: Para el   " +
                                                  "\n asma en mujeres j�venes, el tratamiento suele incluir broncodilatadores de alivio r�pido, como el salbutamol (marca     " +
                                                  "\n com�n en M�xico: Ventolin o Aerolin), corticosteroides inhalados para el control a largo plazo, como la fluticasona     " +
                                                  "\n o budesonida (marcas comunes: Flixotide o Pulmicort), y en algunos casos, modificadores de leucotrienos como el         " +
                                                  "\n montelukast (marca com�n: Singulair). Tambi�n es importante mantener un seguimiento m�dico regular para ajustar el      " +
                                                  "\n tratamiento seg�n la evoluci�n de los s�ntomas. ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades     " +
                                                  "\n antiinflamatorias y antioxidantes para mejorar la funci�n pulmonar: Pescados grasos (salm�n, at�n): Ricos en �cidos     " +
                                                  "\n grasos Omega-3, que poseen propiedades antiinflamatorias. Frutas y verduras de colores vivos (ar�ndanos, fresas,        " +
                                                  "\n espinacas, br�coli): Ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las c�lulas del      " +
                                                  "\n da�o. Jengibre: Contiene compuestos con efectos antiinflamatorios que podr�an ser beneficiosos para las v�as respiratorias. " +
                                                  "\n C�rcuma: Con su componente activo, la curcumina, tiene potentes propiedades antiinflamatorias y antioxidantes. Este " +
                                                  "\n es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esa     " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un   " +
                                                  "\n diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s, por su    " +
                                                  "\n salud, si la respuesta del diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico.      " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tama�o regular) para         " +
                                                  "\n mantener una hidrataci�n adecuada y ayudar a la funci�n renal, especialmente si se est�n tomando medicamentos           " +
                                                  "\n antirretrovirales. La hidrataci�n es esencial para ayudar a la eliminaci�n de toxinas y evitar la deshidrataci�n        " +
                                                  "\n causada por ciertos f�rmacos. EJERCICIO: Se aconseja actividad f�sica moderada, como caminatas de 30 a 60 minutos       " +
                                                  "\n diarios, ejercicios de resistencia o yoga, lo cual ayuda a fortalecer el sistema inmunol�gico y mejorar la calidad      " +
                                                  "\n de vida. Es fundamental adaptar el ejercicio seg�n el estado f�sico de la paciente, evitando esfuerzos que puedan       " +
                                                  "\n debilitar el sistema inmune. POSIBLE TRATAMIENTO: Para el VIH/SIDA en mujeres j�venes, el tratamiento suele incluir     " +
                                                  "\n terapia antirretroviral combinada (TAR), con medicamentos como el tenofovir, emtricitabina y dolutegravir (marcas       " +
                                                  "\n comunes en M�xico: Truvada, Tivicay). El cumplimiento estricto del tratamiento es crucial para controlar la carga       " +
                                                  "\n viral y evitar complicaciones. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes, vitaminas    " +
                                                  "\n y minerales esenciales para fortalecer el sistema inmunol�gico: Aguacate: Rico en grasas saludables y vitamina E,       " +
                                                  "\n ayuda a proteger las c�lulas del da�o oxidativo. Frutos rojos (ar�ndanos, fresas): Contienen antioxidantes y vitamina C,  " +
                                                  "\n que pueden mejorar la respuesta inmune. Espinacas y br�coli: Ricos en hierro y vitamina C, esenciales para la producci�n  " +
                                                  "\n de gl�bulos rojos y la funci�n inmunol�gica. Jengibre: Posee propiedades antiinflamatorias y antioxidantes que pueden     " +
                                                  "\n ayudar a reducir la inflamaci�n y mejorar la digesti�n. Este es solo un diagn�stico predeterminado l�gico, haberlo        " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas        " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en        " +
                                                  "\n el tratamiento adecuado de su paciente, adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo,   " +
                                                  "\n se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para          " +
                                                  "\n ayudar a eliminar toxinas y mantener la funci�n renal adecuada durante el tratamiento antibi�tico. Mantener una            " +
                                                  "\n buena hidrataci�n tambi�n puede ayudar a reducir la inflamaci�n y mejorar el bienestar general. EJERCICIO: Se              " +
                                                  "\n aconseja actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. Se recomienda            " +
                                                  "\n caminatas suaves de 30 minutos diarios para mejorar la circulaci�n y el bienestar general. El ejercicio puede              " +
                                                  "\n contribuir al fortalecimiento del sistema inmune, siempre evitando situaciones de estr�s f�sico extremo. POSIBLE           " +
                                                  "\n TRATAMIENTO: Para la gonorrea en mujeres j�venes, el tratamiento suele incluir antibi�ticos como la ceftriaxona en         " +
                                                  "\n combinaci�n con azitromicina (marcas comunes en M�xico: Rocephin y Zithromax). Es esencial seguir el tratamiento           " +
                                                  "\n prescrito por el m�dico para evitar la resistencia bacteriana y complicaciones. ALIMENTACI�N: Se recomienda el consumo     " +
                                                  "\n de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico y ayudar a la          " +
                                                  "\n recuperaci�n: Ajo: Contiene alicina, un compuesto con propiedades antimicrobianas que puede ayudar a combatir infecciones. " +
                                                  "\n Frutas c�tricas (naranjas, limones, toronjas): Ricas en vitamina C, esenciales para mejorar la respuesta inmune. Jengibre: " +
                                                  "\n Posee propiedades antiinflamatorias y antioxidantes que pueden aliviar la inflamaci�n y mejorar la circulaci�n. Yogur      " +
                                                  "\n natural: Rico en probi�ticos, ayuda a restaurar la flora intestinal y fortalecer el sistema inmunol�gico. Este es solo     " +
                                                  "\n un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y       " +
                                                  "\n que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de        " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s, por su salud, si la respuesta   " +
                                                  "\n del diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita  " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2 a 2.5 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda             " +
                                                  "\n a mantener la piel saludable y reducir la inflamaci�n causada por el virus. Tambi�n es beneficioso complementar           " +
                                                  "\n con infusiones naturales como t� de jengibre o c�rcuma, que poseen propiedades antivirales y antiinflamatorias.           " +
                                                  "\n EJERCICIO. La actividad f�sica moderada es clave para fortalecer el sistema inmunol�gico y mejorar la circulaci�n         " +
                                                  "\n sangu�nea. Se recomienda realizar ejercicio aer�bico moderado al menos 30 minutos al d�a, como caminar, nadar o           " +
                                                  "\n andar en bicicleta, evitando el sobreesfuerzo. Tambi�n es beneficioso incluir ejercicios de resistencia como              " +
                                                  "\n levantamiento de pesas ligeras o yoga, que ayudan a mantener la masa muscular y reducir el estr�s. POSIBLE TRATAMIENTO.   " +
                                                  "\n El tratamiento est�ndar incluye antivirales como aciclovir, valaciclovir y famciclovir, que ayudan a reducir la           " +
                                                  "\n duraci�n y gravedad de los brotes. Marcas reconocidas incluyen Zovirax, Valtrex y Famvir, las cuales han demostrado       " +
                                                  "\n eficacia en el manejo del herpes genital. ALIMENTACI�N. Para fortalecer el sistema inmunol�gico y reducir la inflamaci�n, " +
                                                  "\n se recomienda consumir frutas c�tricas como naranja, lim�n y toronja, que son ricas en vitamina C, la cual contribuye     " +
                                                  "\n a la producci�n de gl�bulos blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento      " +
                                                  "\n diario por cada 100 gramos. Verduras de hoja verde como espinaca, kale y acelga, que contienen �cido f�lico, esencial     " +
                                                  "\n para la producci�n de c�lulas sangu�neas, aportando cerca del 65% del requerimiento diario por cada 100 gramos. Pescados  " +
                                                  "\n grasos como salm�n, at�n y sardina, que son ricos en Omega-3, el cual tiene propiedades antiinflamatorias y aporta alrededor " +
                                                  "\n del 50% del requerimiento diario por porci�n de 100 gramos. Frutos secos como almendras, nueces y semillas de ch�a, que    " +
                                                  "\n aportan vitamina E, la cual protege las c�lulas del da�o oxidativo y contribuye con el 70% del requerimiento diario por    " +
                                                  "\n cada 30 gramos. Legumbres como lentejas, garbanzos y frijoles, que son fuente de prote�nas y hierro, esenciales para la    " +
                                                  "\n energ�a y la regeneraci�n celular, aportando cerca del 40% del requerimiento diario por cada 100 gramos. Este es solo un   " +
                                                  "\n diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que    " +
                                                  "\n las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico " +
                                                  "\n especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2.5 a 3 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda a eliminar  " +
                                                  "\n toxinas y mejorar la circulaci�n sangu�nea. Tambi�n es beneficioso complementar con infusiones naturales como t� verde    " +
                                                  "\n o manzanilla, que poseen propiedades antibacterianas y antiinflamatorias. EJERCICIO. La actividad f�sica moderada es      " +
                                                  "\n clave para fortalecer el sistema inmunol�gico y mejorar la circulaci�n sangu�nea. Se recomienda realizar ejercicio        " +
                                                  "\n aer�bico moderado al menos 30 minutos al d�a, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo.        " +
                                                  "\n Tambi�n es beneficioso incluir ejercicios de resistencia como levantamiento de pesas ligeras o yoga, que ayudan a         " + 
                                                  "\n mantener la masa muscular y reducir el estr�s. POSIBLE TRATAMIENTO. El tratamiento est�ndar incluye antibi�ticos          " +
                                                  "\n como penicilina G benzatina y doxiciclina, que ayudan a eliminar la bacteria Treponema pallidum. Marcas reconocidas       " +
                                                  "\n incluyen Benzetacil y Vibramycin, las cuales han demostrado eficacia en el manejo de la s�filis. ALIMENTACI�N. Para       " +
                                                  "\n fortalecer el sistema inmunol�gico y reducir la inflamaci�n, se recomienda consumir frutas c�tricas como naranja, lim�n   " +
                                                  "\n y toronja, que son ricas en vitamina C, la cual contribuye a la producci�n de gl�bulos blancos y mejora la respuesta      " +
                                                  "\n inmune, aportando aproximadamente el 90% del requerimiento diario por cada 100 gramos. Este es solo un diagn�stico        " +
                                                  "\n predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas" +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico especialista." +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 3 a 3.5 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda a mantener      " +
                                                  "\n las v�as respiratorias limpias y mejorar la eliminaci�n de toxinas. Tambi�n es beneficioso complementar con infusiones        " +
                                                  "\n naturales como t� de jengibre o c�rcuma, que poseen propiedades antiinflamatorias y antioxidantes. EJERCICIO. La actividad    " +
                                                  "\n f�sica moderada es clave para fortalecer el sistema inmunol�gico y mejorar la capacidad pulmonar. Se recomienda realizar      " +
                                                  "\n ejercicio aer�bico moderado al menos 30 minutos al d�a, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo.  " +
                                                  "\n Tambi�n es beneficioso incluir ejercicios de respiraci�n como yoga o t�cnicas de expansi�n pulmonar. POSIBLE TRATAMIENTO.     " +
                                                  "\n El tratamiento est�ndar incluye antibi�ticos como isoniazida, rifampicina, pirazinamida y etambutol, que ayudan a eliminar    " +
                                                  "\n la bacteria Mycobacterium tuberculosis. Marcas reconocidas incluyen Rifater y Myambutol, las cuales han demostrado eficacia   " +
                                                  "\n en el manejo de la tuberculosis. ALIMENTACI�N. Para fortalecer el sistema inmunol�gico y reducir la inflamaci�n, se           " +
                                                  "\n recomienda consumir frutas c�tricas como naranja, lim�n y toronja, que son ricas en vitamina C, la cual contribuye a la       " +
                                                  "\n producci�n de gl�bulos blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento diario por    " +
                                                  "\n cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente   " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un         " +
                                                  "\n diagn�stico y consultar a un m�dico especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica de bajo impacto como nataci�n, yoga o caminatas suaves para mantener la        " +
                                                  "\n movilidad articular y reducir la inflamaci�n. La hidroterapia es una excelente opci�n, ya que el agua templada           " + 
                                                  "\n reduce la presi�n sobre las articulaciones y mejora la circulaci�n, ayudando a disminuir el dolor y la rigidez.          " +
                                                  "\n Tambi�n se recomienda el fortalecimiento muscular con ejercicios de resistencia moderada para mejorar la estabilidad     " +
                                                  "\n articular. HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua, aproximadamente 8 a 10 vasos de       " +
                                                  "\n tama�o regular, para mantener la lubricaci�n de las articulaciones y reducir la rigidez matutina. La hidrataci�n         " +
                                                  "\n adecuada tambi�n contribuye a la eliminaci�n de toxinas y mejora la funci�n celular, lo que puede ayudar a reducir la    " +
                                                  "\n inflamaci�n en las articulaciones. POSIBLE TRATAMIENTO: La artritis se trata con medicamentos antiinflamatorios como     " +
                                                  "\n ibuprofeno y naproxeno, adem�s de f�rmacos modificadores de la enfermedad como metotrexato y sulfasalazina. En M�xico,   " +
                                                  "\n algunas marcas reconocidas son Voltaren (diclofenaco), Celebrex (celecoxib) y Arava (leflunomida). Tambi�n se recomienda " +
                                                  "\n el uso de suplementos como glucosamina y condroitina para mejorar la salud articular. ALIMENTACI�N RECOMENDADA: Para     " +
                                                  "\n reducir la inflamaci�n y fortalecer las articulaciones, se recomienda el consumo de alimentos ricos en vitaminas y       " +
                                                  "\n minerales esenciales. PESCADOS GRASOS (salm�n, at�n): Fuente de OMEGA-3, con propiedades antiinflamatorias, proporcionando" +
                                                  "\n aproximadamente 2.2 gramos por cada 100 gramos de pescado. FRUTAS C�TRICAS (naranjas, limones, toronjas): Altas en    " +
                                                  "\n VITAMINA C, que fortalece el sistema inmune y ayuda a la producci�n de col�geno, aportando aproximadamente 89% del    " +
                                                  "\n requerimiento diario por cada 100 gramos. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO,     " +
                                                  "\n fundamentales para la regeneraci�n celular y la funci�n muscular, aportando cerca del 15% del requerimiento diario    " +
                                                  "\n por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que   " +
                                                  "\n la paciente tenga artritis ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico para   " +
                                                  "\n mayor seguridad y, por su salud, consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n EJERCICIO: Se recomienda evitar esfuerzos f�sicos intensos mientras persistan los s�ntomas, priorizando el descanso          " +
                                                  "\n y la recuperaci�n pulmonar. Sin embargo, una vez superada la fase aguda, se pueden realizar ejercicios de respiraci�n        " +
                                                  "\n profunda para fortalecer los pulmones y mejorar la capacidad respiratoria. HIDRATACI�N: Es fundamental el consumo de         " +
                                                  "\n 2.5 a 3 litros de agua, aproximadamente 10 a 12 vasos de tama�o regular, para mantener las v�as respiratorias hidratadas     " +
                                                  "\n y facilitar la eliminaci�n de secreciones. Tambi�n se recomienda el consumo de l�quidos tibios como infusiones de jengibre   " +
                                                  "\n o miel para aliviar la irritaci�n de la garganta y mejorar la expectoraci�n. POSIBLE TRATAMIENTO: La tosferina se trata      " +
                                                  "\n con antibi�ticos como azitromicina, claritromicina y eritromicina. En M�xico, algunas marcas reconocidas son Zithromax       " +
                                                  "\n (azitromicina), Klaricid (claritromicina) y Ilosone (eritromicina). Adem�s, se recomienda el uso de broncodilatadores en     " +
                                                  "\n casos de dificultad respiratoria severa y el seguimiento de un plan de vacunaci�n adecuado para prevenir futuros contagios.  " +
                                                  "\n ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema inmunol�gico y mejorar la recuperaci�n, se recomienda el consumo de     " +
                                                  "\n alimentos ricos en vitaminas y minerales esenciales. FRUTAS C�TRICAS (naranjas, limones, toronjas): Altas en VITAMINA C,     " +
                                                  "\n que fortalece el sistema inmune, aportando aproximadamente 89% del requerimiento diario por cada 100 gramos. JENGIBRE:       " +
                                                  "\n Contiene compuestos con efectos antiinflamatorios que pueden ayudar a aliviar la irritaci�n de las v�as respiratorias,       " +
                                                  "\n proporcionando 5% del requerimiento diario de antioxidantes por cada 10 gramos. MIEL: Con propiedades antimicrobianas y      " +
                                                  "\n calmantes para la garganta, aportando 20% del requerimiento diario de antioxidantes por cada 30 gramos. Este es solo un      " +
                                                  "\n diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que la paciente tenga tosferina ni que el         " +
                                                  "\n tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico para mayor seguridad y, por su salud, consultar    " +
                                                  "\n a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas. " +
                                                  "\n EJERCICIO: Se recomienda reposo absoluto mientras persistan los s�ntomas para evitar complicaciones. Una vez superada     " +
                                                  "\n la fase aguda, se pueden realizar ejercicios suaves de movilidad para evitar la rigidez muscular y mejorar la             " +
                                                  "\n circulaci�n. HIDRATACI�N: Es esencial el consumo de 2 a 2.5 litros de agua, aproximadamente 8 a 10 vasos de tama�o        " +
                                                  "\n regular, para mantener la hidrataci�n y reducir la fiebre. Tambi�n se recomienda el consumo de caldos y sopas tibias      " +
                                                  "\n para facilitar la ingesta de l�quidos sin irritar las gl�ndulas salivales. POSIBLE TRATAMIENTO: No existe un tratamiento  " +
                                                  "\n espec�fico para las paperas, pero se pueden utilizar analg�sicos como paracetamol e ibuprofeno para aliviar los s�ntomas. " +
                                                  "\n En M�xico, algunas marcas reconocidas son Tempra (paracetamol) y Advil (ibuprofeno). Tambi�n se recomienda el uso de      " +
                                                  "\n compresas fr�as en la zona inflamada para reducir el dolor y la hinchaz�n. ALIMENTACI�N RECOMENDADA: Para fortalecer      " +
                                                  "\n el sistema inmunol�gico y mejorar la recuperaci�n, se recomienda el consumo de alimentos ricos en vitaminas y minerales   " +
                                                  "\n esenciales. FRUTAS C�TRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema inmune, aportando" +
                                                  "\n aproximadamente 89% del requerimiento diario por cada 100 gramos. PUR�S Y SOPAS: Facilitan la ingesta de alimentos sin    " +
                                                  "\n irritar las gl�ndulas salivales, proporcionando 15% del requerimiento diario de minerales esenciales por cada 100 gramos. " +
                                                  "\n VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales para la regeneraci�n celular y la   " +
                                                  "\n funci�n muscular, aportando cerca del 15% del requerimiento diario por cada 100 gramos. Este es solo un diagn�stico  " +
                                                  "\n predeterminado l�gico. Haberlo consultado no garantiza al 100% que la paciente tenga paperas ni que el tratamiento   " +
                                                  "\n sea el adecuado. Se recomienda realizar m�s de un diagn�stico para mayor seguridad y, por su salud, consultar a su   " +
                                                  "\n m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al d�a (aproximadamente ocho a diez        " +
                                                  "\n vasos de agua de tama�o regular) para ayudar a su cuerpo a combatir la infecci�n y prevenir la deshidrataci�n causada por      " +
                                                  "\n fiebre y sudoraci�n. Tambi�n se recomienda el consumo de l�quidos ricos en electrolitos como agua de coco o suero oral         " +
                                                  "\n para mejorar la recuperaci�n. EJERCICIO: Se recomienda reposo moderado, evitando esfuerzos f�sicos intensos mientras           " +
                                                  "\n persistan los s�ntomas. Sin embargo, una vez recuperada, es recomendable realizar ejercicios de bajo impacto como caminatas    " +
                                                  "\n suaves, yoga o estiramientos para mejorar la circulaci�n y fortalecer el sistema inmunol�gico. La actividad f�sica debe ser    " +
                                                  "\n progresiva y adaptada a la condici�n de la paciente, evitando la exposici�n prolongada al sol y asegurando una hidrataci�n     " +
                                                  "\n adecuada durante el ejercicio. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para el Zika. El manejo se centra      " +
                                                  "\n en aliviar los s�ntomas con paracetamol (marca com�n en M�xico: Tempra) para la fiebre y el dolor, evitando el uso de          " +
                                                  "\n aspirina y otros antiinflamatorios no esteroides debido al riesgo de complicaciones hemorr�gicas. Tambi�n se recomienda        " +
                                                  "\n el uso de antihistam�nicos para aliviar el sarpullido y la picaz�n. En casos graves, es fundamental el monitoreo m�dico        " +
                                                  "\n para evitar complicaciones neurol�gicas o en el embarazo. ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema inmunol�gico    " +
                                                  "\n y ayudar en la recuperaci�n, se recomienda el consumo de FRUTAS C�TRICAS como naranja, lim�n y toronja, ricas en VITAMINA C,   " +
                                                  "\n que ayuda a fortalecer el sistema inmune y aporta aproximadamente el 89% del requerimiento diario por cada 100 g de consumo.   " + 
                                                  "\n PAPAYA, que contiene VITAMINA A y C, adem�s de enzimas que pueden ayudar a reducir la inflamaci�n, aportando cerca del 75%     " +
                                                  "\n del requerimiento diario de VITAMINA C por cada 100 g. JENGIBRE, con propiedades ANTIINFLAMATORIAS y antioxidantes que pueden  " +
                                                  "\n aliviar s�ntomas como dolor muscular, aportando compuestos bioactivos como gingerol y shogaol. VERDURAS DE HOJA VERDE como     " +
                                                  "\n espinaca, acelga y kale, ricas en HIERRO y antioxidantes esenciales para la recuperaci�n celular, aportando cerca del 15%      " +
                                                  "\n del requerimiento diario de HIERRO por cada 100 g. AGUA DE COCO, fuente natural de ELECTROLITOS, �til para prevenir la         " +
                                                  "\n deshidrataci�n, aportando potasio y sodio esenciales para la hidrataci�n celular. Este es solo un diagn�stico predeterminado   " +
                                                  "\n l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente " +
                                                  "\n correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su        " +
                                                  "\n salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece  " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2.5 a 3 litros de agua al d�a (aproximadamente diez a doce         " +
                                                  "\n vasos de agua de tama�o regular) para prevenir la deshidrataci�n causada por diarrea y v�mitos. Adem�s, se recomienda el        " +
                                                  "\n consumo de soluciones de rehidrataci�n oral como suero fisiol�gico para reponer los electrolitos perdidos y evitar              " +
                                                  "\n complicaciones graves. EJERCICIO: Se recomienda reposo absoluto mientras persistan los s�ntomas, evitando cualquier             " +
                                                  "\n actividad f�sica intensa. Una vez recuperada, puede retomar el ejercicio de forma progresiva, comenzando con caminatas          " +
                                                  "\n suaves y ejercicios de movilidad para fortalecer el cuerpo sin generar estr�s adicional. Tambi�n es recomendable realizar       " +
                                                  "\n ejercicios de respiraci�n y relajaci�n para reducir el impacto del malestar digestivo y mejorar la recuperaci�n. POSIBLE        " +
                                                  "\n TRATAMIENTO: No existe un tratamiento espec�fico para el rotavirus. El manejo se centra en la rehidrataci�n con soluciones      " +
                                                  "\n de electrolitos como Suero Oral (marca com�n en M�xico: Electrolit) para reponer los minerales perdidos. En casos graves,       " +
                                                  "\n puede requerirse hidrataci�n intravenosa en un entorno hospitalario. Tambi�n se recomienda el uso de probi�ticos para           " +
                                                  "\n ayudar a restaurar la flora intestinal y mejorar la digesti�n. En algunos casos, los m�dicos pueden recomendar medicamentos     " +
                                                  "\n para controlar los v�mitos y la fiebre, asegurando una recuperaci�n m�s r�pida y efectiva. ALIMENTACI�N RECOMENDADA: Para       " +
                                                  "\n fortalecer el sistema digestivo y ayudar en la recuperaci�n, se recomienda el consumo de PL�TANO, rico en POTASIO, que ayuda    " +
                                                  "\n a reponer electrolitos perdidos, aportando aproximadamente el 12% del requerimiento diario por cada 100 g. ARROZ BLANCO,        " +
                                                  "\n fuente de CARBOHIDRATOS de f�cil digesti�n, que ayuda a estabilizar el sistema digestivo. MANZANA, rica en PECTINA, que         " +
                                                  "\n contribuye a la regulaci�n intestinal y aporta cerca del 10% del requerimiento diario de FIBRA por cada 100 g. ZANAHORIA,       " +
                                                  "\n fuente de VITAMINA A, que ayuda a la regeneraci�n celular y aporta aproximadamente el 89% del requerimiento diario por cada     " +
                                                  "\n 100 g. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta    " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor          " +
                                                  "\n seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo,           " +
                                                  "\n se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de al menos 2 litros de agua al d�a (aproximadamente ocho vasos de agua de tama�o   " +
                                                  "\n regular) para ayudar al cuerpo a eliminar la bacteria y prevenir la deshidrataci�n causada por fiebre y malestar.         " +
                                                  "\n Tambi�n es recomendable el consumo de l�quidos ricos en electrolitos como agua de coco o caldos naturales para mejorar    " +
                                                  "\n la recuperaci�n. EJERCICIO: Durante la fase aguda de la infecci�n, se recomienda reposo absoluto para permitir que el     " +
                                                  "\n cuerpo combata la bacteria. Sin embargo, una vez recuperada, se pueden realizar ejercicios de bajo impacto como           " +
                                                  "\n caminatas suaves, yoga o estiramientos para mejorar la circulaci�n y fortalecer el sistema inmunol�gico. POSIBLE          " +
                                                  "\n TRATAMIENTO: El tratamiento para la listeriosis suele incluir antibi�ticos como ampicilina o gentamicina (marcas          " +
                                                  "\n comunes en M�xico: Amikin, Ampigrin) en casos graves. Adem�s, se recomienda el consumo de alimentos ricos en              " +
                                                  "\n antioxidantes para ayudar al cuerpo a combatir la infecci�n de manera natural. En algunos casos, los m�dicos pueden       " +
                                                  "\n recomendar suplementos vitam�nicos para fortalecer el sistema inmunol�gico y acelerar la recuperaci�n. ALIMENTACI�N       " +
                                                  "\n RECOMENDADA: Para fortalecer el sistema inmunol�gico y ayudar en la recuperaci�n, se recomienda el consumo de YOGUR       " +
                                                  "\n NATURAL, rico en PROBI�TICOS, que favorecen la recuperaci�n intestinal y aportan aproximadamente 10^9 UFC por cada        " +
                                                  "\n 100 g. AJO, con propiedades ANTIBACTERIANAS, que pueden ayudar a combatir la infecci�n y aporta compuestos bioactivos     " +
                                                  "\n como alicina. ESPINACA, fuente de VITAMINA C y HIERRO, que fortalece el sistema inmune y aporta cerca del 15% del         " +
                                                  "\n requerimiento diario de HIERRO por cada 100 g. FRUTOS ROJOS, ricos en ANTIOXIDANTES, que ayudan a reducir la inflamaci�n  " +
                                                  "\n y aportan aproximadamente el 50% del requerimiento diario de VITAMINA C por cada 100 g. Este es solo un diagn�stico       " +
                                                  "\n predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las           " +
                                                  "\n respuestas sean completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el          " +
                                                  "\n tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda       " +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N. Es fundamental mantener una hidrataci�n adecuada para compensar la p�rdida de l�quidos causada por la       " +
                                                  "\n diarrea, se recomienda el consumo de 2.5 a 3 litros de agua al d�a, adem�s de soluciones de rehidrataci�n oral como      " +
                                                  "\n Pedialyte para recuperar electrolitos esenciales, tambi�n es recomendable el consumo de caldos ligeros y agua de         " +
                                                  "\n coco para reponer minerales perdidos y evitar la deshidrataci�n severa. EJERCICIO. Durante la fase aguda de la           " +
                                                  "\n enfermedad se recomienda reposo absoluto para evitar la deshidrataci�n y el desgaste f�sico, una vez recuperada la       " +
                                                  "\n paciente puede retomar actividades ligeras como caminatas cortas para mejorar la circulaci�n y fortalecer el sistema     " +
                                                  "\n inmunol�gico, adem�s ejercicios de movilidad pueden ayudar a recuperar la energ�a y mejorar la digesti�n. POSIBLE        " +
                                                  "\n TRATAMIENTO. El tratamiento suele incluir antibi�ticos en casos graves como la azitromicina o ciprofloxacino, adem�s     " +
                                                  "\n pueden recetarse medicamentos para aliviar los s�ntomas como el subsalicilato de bismuto (Pepto-Bismol), es fundamental  " +
                                                  "\n seguir las indicaciones m�dicas y evitar la automedicaci�n, tambi�n se recomienda el consumo de probi�ticos para         " +
                                                  "\n restaurar la flora intestinal y mejorar la absorci�n de nutrientes esenciales. ALIMENTACI�N. Se recomienda el consumo    " +
                                                  "\n de alimentos ricos en fibra y probi�ticos para restaurar la flora intestinal, PL�TANO. Rico en potasio que ayuda a       " +
                                                  "\n recuperar los electrolitos perdidos, aporta aproximadamente el 10% de la ingesta diaria recomendada por cada 100 gramos. " +
                                                  "\n YOGURT NATURAL. Contiene probi�ticos que ayudan a restaurar la flora intestinal, su consumo puede aportar hasta el 20%   " +
                                                  "\n de la ingesta diaria recomendada de probi�ticos. ZANAHORIA. Rica en vitamina A que ayuda a la regeneraci�n celular    " +
                                                  "\n intestinal, aporta aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos. Este es solo un       " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad       " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico    " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la       " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N. Es crucial mantener una hidrataci�n adecuada para facilitar la eliminaci�n de secreciones y mejorar la    " +
                                                  "\n funci�n pulmonar, se recomienda el consumo de 2.5 a 3 litros de agua al d�a, adem�s de infusiones calientes como t�    " +
                                                  "\n de jengibre o tomillo para aliviar la inflamaci�n pulmonar, tambi�n se recomienda el consumo de agua con lim�n para    " +
                                                  "\n aportar vitamina C y fortalecer el sistema inmunol�gico. EJERCICIO. Se recomienda actividad f�sica moderada como       " +
                                                  "\n ejercicios de respiraci�n profunda, caminatas cortas y yoga para mejorar la capacidad pulmonar y reducir la fatiga,    " +
                                                  "\n adem�s ejercicios de expansi�n tor�cica pueden ayudar a mejorar la oxigenaci�n y fortalecer los m�sculos respiratorios,  " +
                                                  "\n es importante realizarlo bajo supervisi�n m�dica y ajustar la intensidad seg�n la tolerancia del paciente. POSIBLE       " +
                                                  "\n TRATAMIENTO. El tratamiento suele incluir broncodilatadores como el salbutamol (Ventolin) y corticosteroides inhalados   " +
                                                  "\n como la fluticasona (Flixotide), adem�s pueden recetarse antibi�ticos en caso de infecciones respiratorias secundarias,  " +
                                                  "\n tambi�n se recomienda la rehabilitaci�n pulmonar para mejorar la calidad de vida del paciente y reducir la progresi�n    " +
                                                  "\n de la enfermedad, es fundamental seguir las indicaciones m�dicas y evitar la exposici�n a contaminantes. ALIMENTACI�N.   " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema          " +
                                                  "\n respiratorio, ESPINACA. Rica en vitamina A que ayuda a la regeneraci�n celular pulmonar, aporta aproximadamente          " +
                                                  "\n el 56% de la ingesta diaria recomendada por cada 100 gramos. TOMILLO. Contiene compuestos con propiedades antimicrobianas" +
                                                  "\n y ayuda a aliviar la inflamaci�n pulmonar, su consumo puede aportar hasta el 15% de la ingesta diaria recomendada de  " +
                                                  "\n antioxidantes. PESCADO GRASO (SALM�N, AT�N). Rico en Omega-3 que puede ayudar a reducir la inflamaci�n pulmonar,      " +
                                                  "\n aporta aproximadamente el 50% de la ingesta diaria recomendada de Omega-3 por cada 100 gramos. Este es solo un        " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad       " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico    " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la       " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N. Es fundamental mantener una hidrataci�n adecuada para ayudar al cuerpo a eliminar la infecci�n y reducir         " +
                                                  "\n la inflamaci�n, se recomienda el consumo de 2 a 2.5 litros de agua al d�a, adem�s de infusiones sin az�car como t� verde      " +
                                                  "\n o agua de jamaica para mejorar la circulaci�n, tambi�n se recomienda el consumo de agua con miel y lim�n para aliviar la      " +
                                                  "\n irritaci�n y fortalecer el sistema inmunol�gico. EJERCICIO. Se recomienda actividad f�sica moderada como caminatas,           " + 
                                                  "\n nataci�n o yoga para mejorar la circulaci�n y fortalecer el sistema inmunol�gico, adem�s ejercicios de movilidad pueden       " +
                                                  "\n ayudar a reducir la inflamaci�n y mejorar la recuperaci�n, es importante realizar ejercicio de manera constante y bajo        " +
                                                  "\n supervisi�n m�dica. POSIBLE TRATAMIENTO. El tratamiento suele incluir antibi�ticos como la azitromicina o doxiciclina,        " +
                                                  "\n adem�s pueden recetarse medicamentos complementarios para aliviar los s�ntomas, tambi�n se recomienda el uso de probi�ticos   " +
                                                  "\n para mejorar la flora vaginal y reducir el riesgo de reinfecci�n, es fundamental seguir las indicaciones m�dicas y evitar     " +
                                                  "\n el contacto sexual sin protecci�n durante el tratamiento. ALIMENTACI�N. Se recomienda el consumo de alimentos ricos en        " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, AR�NDANOS. Ricos en antioxidantes que ayudan   " +
                                                  "\n a combatir infecciones, aportan aproximadamente el 25% de la ingesta diaria recomendada por cada 100 gramos. AJO. Contiene    " +
                                                  "\n compuestos antimicrobianos que pueden ayudar a combatir la infecci�n, su consumo puede aportar hasta el 20% de la ingesta     " +
                                                  "\n diaria recomendada de antioxidantes. JENGIBRE. Contiene propiedades antiinflamatorias que pueden ayudar a reducir los         " +
                                                  "\n s�ntomas, su consumo puede aportar hasta el 15% de la ingesta diaria recomendada de antioxidantes. Este es solo un Diagn�stico" +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la         " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer   " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana. " +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tama�o regular) para mantener     " +
                                                  "\n una hidrataci�n adecuada. Esto ayuda a reducir la fiebre, mejorar la circulaci�n y facilitar la eliminaci�n de toxinas.        " +
                                                  "\n La hidrataci�n es clave para evitar complicaciones neurol�gicas y mejorar la recuperaci�n. EJERCICIO: Se aconseja actividad    " +
                                                  "\n f�sica ligera y progresiva, evitando esfuerzos intensos mientras persistan los s�ntomas. Se recomienda caminatas suaves de     " +
                                                  "\n 15 a 30 minutos diarios para mejorar la oxigenaci�n y la recuperaci�n cerebral. Es importante evitar actividades que puedan    " +
                                                  "\n generar estr�s f�sico excesivo. POSIBLE TRATAMIENTO: Para la meningitis bacteriana en mujeres j�venes, el tratamiento suele    " +
                                                  "\n incluir antibi�ticos intravenosos como la ceftriaxona o la vancomicina, dependiendo del agente causal. Tambi�n pueden          " +
                                                  "\n utilizarse corticosteroides para reducir la inflamaci�n cerebral y medicamentos para controlar la fiebre y el dolor. En        " +
                                                  "\n algunos casos, se requiere hospitalizaci�n para monitoreo y tratamiento intensivo. ALIMENTACI�N: Se recomienda el consumo de   " +
                                                  "\n alimentos ricos en vitaminas y minerales esenciales para fortalecer el sistema inmunol�gico y mejorar la funci�n cerebral:     " +
                                                  "\n Naranjas y mandarinas: Ricas en vitamina C (hasta un 89% del requerimiento diario por cada 100g), esenciales para mejorar la   " +
                                                  "\n respuesta inmune. Jengibre: Posee propiedades antiinflamatorias y antioxidantes que pueden aliviar la fiebre y mejorar la      " +
                                                  "\n circulaci�n. Espinacas y br�coli: Ricos en vitamina A (hasta un 56% del requerimiento diario en 100g de espinaca) y vitamina C " +
                                                  "\n (hasta un 107% del requerimiento diario en 100g de br�coli), esenciales para fortalecer el sistema inmunol�gico y acelerar la  " +
                                                  "\n recuperaci�n. Ajo: Contiene alicina, un compuesto con propiedades antimicrobianas que puede ayudar a combatir infecciones      " +
                                                  "\n bacterianas. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga  " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un     " +
                                                  "\n diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s, por su salud,   " +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes    " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tama�o regular) para mantener     " +
                                                  "\n una hidrataci�n adecuada. La hidrataci�n es fundamental para mejorar la funci�n renal, eliminar toxinas y reducir los          " +
                                                  "\n efectos secundarios de los tratamientos como la quimioterapia. EJERCICIO: Se aconseja actividad f�sica moderada, adaptada      " +
                                                  "\n a la condici�n de la paciente. Se recomienda caminatas de 30 a 60 minutos diarios, ejercicios de resistencia o yoga, lo cual   " +
                                                  "\n ayuda a mejorar la circulaci�n, fortalecer el sistema inmunol�gico y reducir la fatiga. POSIBLE TRATAMIENTO: Para el c�ncer    " +
                                                  "\n en mujeres j�venes, el tratamiento depende del tipo y estadio de la enfermedad. Puede incluir cirug�a, quimioterapia,          " +
                                                  "\n radioterapia o terapia dirigida. Medicamentos como el paclitaxel y la doxorrubicina son comunes en ciertos tipos de c�ncer.    " +
                                                  "\n Es fundamental seguir un plan de tratamiento personalizado bajo supervisi�n m�dica. ALIMENTACI�N: Se recomienda el consumo     " +
                                                  "\n de alimentos ricos en antioxidantes, vitaminas y minerales esenciales para fortalecer el sistema inmunol�gico y mejorar la     " +
                                                  "\n recuperaci�n: Aguacate: Rico en grasas saludables y vitamina E, ayuda a proteger las c�lulas del da�o oxidativo. Frutos rojos  " +
                                                  "\n (ar�ndanos, fresas): Contienen antioxidantes y vitamina C (hasta un 65% del requerimiento diario en 100g de fresas), que       " +
                                                  "\n pueden mejorar la respuesta inmune. Espinacas y br�coli: Ricos en hierro (hasta un 15% del requerimiento diario en 100g de     " +
                                                  "\n espinaca) y vitamina C (hasta un 107% del requerimiento diario en 100g de br�coli), esenciales para la producci�n de gl�bulos  " +
                                                  "\n rojos y la funci�n inmunol�gica. Jengibre: Posee propiedades antiinflamatorias y antioxidantes que pueden ayudar a reducir la  " +
                                                  "\n inflamaci�n y mejorar la digesti�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% " +
                                                  "\n que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda    " + 
                                                  "\n hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s, por  " +
                                                  "\n su salud, si la respuesta del diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L      " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.50-1.75 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para          " +
                                                  "\n mantener una hidrataci�n adecuada. Esto ayuda a reducir la congesti�n, mantener la mucosa respiratoria hidratada y         " +
                                                  "\n favorecer la eliminaci�n de toxinas. EJERCICIO: Se aconseja actividad f�sica moderada diariamente, evitando esfuerzos      " +
                                                  "\n excesivos mientras persistan los s�ntomas. Se recomienda al menos 30 minutos de ejercicio ligero, como caminatas o         " +
                                                  "\n estiramientos, lo cual ayuda a mejorar la circulaci�n, fortalecer el sistema inmune y promover una recuperaci�n m�s        " +
                                                  "\n efectiva. POSIBLE TRATAMIENTO: Para la gripe en mujeres j�venes, el tratamiento suele incluir medicamentos para reducir    " +
                                                  "\n la fiebre y aliviar los s�ntomas, como el paracetamol (marca com�n en M�xico: Tempra) o el ibuprofeno. Tambi�n pueden      " +
                                                  "\n utilizarse antivirales espec�ficos contra la gripe, como el oseltamivir (marca com�n: Tamiflu), en casos m�s severos o     " +
                                                  "\n bajo indicaci�n m�dica. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en vitaminas, minerales y antioxidantes  " +
                                                  "\n para fortalecer el sistema inmunol�gico y combatir los s�ntomas de la gripe: Naranjas y mandarinas: Ricas en vitamina C    " +
                                                  "\n (hasta un 89% del requerimiento diario por cada 100g), esenciales para reducir la duraci�n de los s�ntomas y mejorar       " +
                                                  "\n la respuesta inmune. Fresas y ar�ndanos: Contienen antioxidantes y vitamina C (hasta un 65% del requerimiento diario       " +
                                                  "\n en 100g de fresas) que protegen las c�lulas del da�o causado por la infecci�n. Jengibre: Posee propiedades antiinflamatorias " +
                                                  "\n y antioxidantes que pueden aliviar la congesti�n y el malestar general. Espinacas y br�coli: Ricos en vitamina A     " +
                                                  "\n (hasta un 56% del requerimiento diario en 100g de espinaca) y vitamina C (hasta un 107% del requerimiento diario     " +
                                                  "\n en 100g de br�coli), esenciales para fortalecer el sistema inmunol�gico y acelerar la recuperaci�n. Este es solo     " +
                                                  "\n un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad   " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico   " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s, por su salud, si la    " +
                                                  "\n respuesta del diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tama�o regular) para            " +
                                                  "\n mantener una hidrataci�n adecuada. Esto ayuda a fluidificar las secreciones pulmonares, facilitando su expulsi�n y           " +
                                                  "\n reduciendo la congesti�n respiratoria. EJERCICIO: Se aconseja actividad f�sica ligera y progresiva, evitando esfuerzos       " +
                                                  "\n intensos mientras persistan los s�ntomas. Se recomienda caminatas suaves de 15 a 30 minutos diarios para mejorar la          " +
                                                  "\n oxigenaci�n y la recuperaci�n pulmonar. POSIBLE TRATAMIENTO: Para la neumon�a en mujeres j�venes, el tratamiento suele       " +
                                                  "\n incluir antibi�ticos en caso de infecci�n bacteriana, como la amoxicilina (marca com�n en M�xico: Amoxil) o la azitromicina. " +
                                                  "\n Tambi�n pueden utilizarse medicamentos para reducir la fiebre y aliviar los s�ntomas, como el paracetamol o el ibuprofeno.   " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales para fortalecer el sistema     " +
                                                  "\n inmunol�gico y mejorar la funci�n pulmonar: Naranjas y mandarinas: Ricas en vitamina C (hasta un 89% del requerimiento       " +
                                                  "\n diario por cada 100g), esenciales para mejorar la respuesta inmune. Jengibre: Posee propiedades antiinflamatorias y          " +
                                                  "\n antioxidantes que pueden aliviar la congesti�n. Espinacas y br�coli: Ricos en vitamina A (hasta un 56% del requerimiento     " +
                                                  "\n diario en 100g de espinaca) y vitamina C (hasta un 107% del requerimiento diario en 100g de br�coli), esenciales para        " +
                                                  "\n fortalecer el sistema inmunol�gico y acelerar la recuperaci�n. Ajo: Contiene alicina, un compuesto con propiedades           " +
                                                  "\n antimicrobianas que puede ayudar a combatir infecciones respiratorias. Este es solo un diagn�stico predeterminado            " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus      " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad   " +
                                                  "\n en el tratamiento adecuado de su paciente, adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo,   " +
                                                  "\n se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para mantener       " +
                                                  "\n una hidrataci�n adecuada y ayudar a regular los niveles de glucosa en sangre. EJERCICIO: Se aconseja actividad f�sica regular,   " +
                                                  "\n como caminatas de 30 a 60 minutos diarios, ejercicios de resistencia o yoga, lo cual ayuda a mejorar la sensibilidad a la        " +
                                                  "\n insulina y controlar los niveles de az�car en sangre. POSIBLE TRATAMIENTO: Para la diabetes en mujeres j�venes, el tratamiento   " +
                                                  "\n suele incluir medicamentos para controlar la glucosa, como la metformina (marca com�n en M�xico: Glucophage) o insulina en       " +
                                                  "\n casos espec�ficos. Tambi�n se recomienda el monitoreo constante de los niveles de glucosa y una dieta equilibrada. ALIMENTACI�N: " +
                                                  "\n Se recomienda el consumo de alimentos con bajo �ndice gluc�mico y ricos en nutrientes esenciales para el control de la diabetes: " +
                                                  "\n Aguacate: Rico en grasas saludables y fibra, ayuda a estabilizar los niveles de glucosa. Frutos rojos (ar�ndanos, fresas):       " +
                                                  "\n Contienen antioxidantes y vitamina C (hasta un 65% del requerimiento diario en 100g de fresas), que pueden mejorar la            " +
                                                  "\n sensibilidad a la insulina. Espinacas y br�coli: Ricos en magnesio (hasta un 20% del requerimiento diario en 100g de espinaca),  " +
                                                  "\n esencial para la regulaci�n de la glucosa. Canela: Contiene compuestos que pueden mejorar la sensibilidad a la insulina y        " +
                                                  "\n reducir los niveles de az�car en sangre. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza      " +
                                                  "\n al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se         " +
                                                  "\n recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente,     " +
                                                  "\n adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico.    " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2 a 2.5 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda a mantener     " +
                                                  "\n las v�as respiratorias h�medas y reducir la inflamaci�n bronquial. Tambi�n es beneficioso complementar con infusiones        " + 
                                                  "\n naturales como t� de jengibre o c�rcuma, que poseen propiedades antiinflamatorias y antioxidantes. EJERCICIO. La actividad   " +
                                                  "\n f�sica moderada es clave para fortalecer el sistema respiratorio y mejorar la capacidad pulmonar. Se recomienda realizar     " +
                                                  "\n ejercicio aer�bico moderado al menos 30 minutos al d�a, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo. " +
                                                  "\n Tambi�n es beneficioso incluir ejercicios de respiraci�n como yoga o t�cnicas de expansi�n pulmonar. POSIBLE TRATAMIENTO.    " +
                                                  "\n El tratamiento est�ndar incluye broncodilatadores de alivio r�pido como salbutamol, y corticosteroides inhalados como        " +
                                                  "\n fluticasona o budesonida, que ayudan a reducir la inflamaci�n y mejorar la funci�n pulmonar. Marcas reconocidas incluyen     " +
                                                  "\n Ventolin, Aerolin, Flixotide y Pulmicort. ALIMENTACI�N. Para fortalecer el sistema inmunol�gico y reducir la inflamaci�n,    " +
                                                  "\n se recomienda consumir frutas c�tricas como naranja, lim�n y toronja, que son ricas en vitamina C, la cual contribuye a la   " +
                                                  "\n producci�n de gl�bulos blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento diario por   " +
                                                  "\n cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente  " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un        " +
                                                  "\n diagn�stico y consultar a un m�dico especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2.5 a 3 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda a          " +
                                                  "\n mantener el equilibrio del sistema inmunol�gico y mejorar la absorci�n de los medicamentos antirretrovirales.            " +
                                                  "\n Tambi�n es beneficioso complementar con infusiones naturales como t� verde o manzanilla, que poseen propiedades          " +
                                                  "\n antioxidantes y antiinflamatorias. EJERCICIO. La actividad f�sica moderada es clave para fortalecer el sistema           " +
                                                  "\n inmunol�gico y mejorar la salud cardiovascular. Se recomienda realizar ejercicio aer�bico moderado al menos 30           " +
                                                  "\n minutos al d�a, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo. Tambi�n es beneficioso incluir      " +
                                                  "\n ejercicios de resistencia como levantamiento de pesas ligeras o yoga, que ayudan a mantener la masa muscular y reducir   " +
                                                  "\n el estr�s. POSIBLE TRATAMIENTO. El tratamiento est�ndar incluye terapia antirretroviral (TAR) con medicamentos como      " +
                                                  "\n tenofovir, emtricitabina y dolutegravir, que ayudan a controlar la replicaci�n del virus y mejorar la calidad de vida.   " +
                                                  "\n Marcas reconocidas incluyen Atripla, Truvada, Tivicay y Biktarvy. ALIMENTACI�N. Para fortalecer el sistema inmunol�gico  " +
                                                  "\n y reducir la inflamaci�n, se recomienda consumir frutas c�tricas como naranja, lim�n y toronja, que son ricas en         " +
                                                  "\n vitamina C, la cual contribuye a la producci�n de gl�bulos blancos y mejora la respuesta inmune, aportando aproximadamente  " +
                                                  "\n el 90% del requerimiento diario por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello,   " +
                                                  "\n se recomienda realizar m�s de un diagn�stico y consultar a un m�dico especialista. Angel L Montes agradece tu visita a la   " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2 a 2.5 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda a eliminar       " +
                                                  "\n toxinas y mantener el equilibrio del sistema inmunol�gico. Tambi�n es beneficioso complementar con infusiones naturales        " +
                                                  "\n como t� verde o manzanilla, que poseen propiedades antibacterianas y antiinflamatorias. EJERCICIO. La actividad f�sica         " +
                                                  "\n moderada es clave para fortalecer el sistema inmunol�gico y mejorar la circulaci�n sangu�nea. Se recomienda realizar           " +
                                                  "\n ejercicio aer�bico moderado al menos 30 minutos al d�a, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo.   " +
                                                  "\n Tambi�n es beneficioso incluir ejercicios de resistencia como levantamiento de pesas ligeras o yoga, que ayudan a mantener     " +
                                                  "\n la masa muscular y reducir el estr�s. POSIBLE TRATAMIENTO. El tratamiento est�ndar incluye antibi�ticos como ceftriaxona y     " +
                                                  "\n azitromicina, que ayudan a eliminar la bacteria Neisseria gonorrhoeae. Marcas reconocidas incluyen Rocephin y Zithromax, las   " +
                                                  "\n cuales han demostrado eficacia en el manejo de la gonorrea. ALIMENTACI�N. Para fortalecer el sistema inmunol�gico y reducir    " +
                                                  "\n la inflamaci�n, se recomienda consumir frutas c�tricas como naranja, lim�n y toronja, que son ricas en vitamina C, la cual     " +
                                                  "\n contribuye a la producci�n de gl�bulos blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento" +
                                                  "\n diario por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el  " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de    " +
                                                  "\n un diagn�stico y consultar a un m�dico especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada para fortalecer el sistema inmunol�gico y reducir el estr�s,         " +
                                                  "\n que puede desencadenar brotes. Ejercicios como yoga, pilates y caminatas suaves son ideales para mejorar la             " +
                                                  "\n circulaci�n y el bienestar general. HIDRATACI�N: Es fundamental el consumo de 2 a 2.5 litros de agua, aproximadamente   " +
                                                  "\n 8 a 10 vasos de tama�o regular, para mantener la piel hidratada y favorecer la eliminaci�n de toxinas. POSIBLE          " +
                                                  "\n TRATAMIENTO: El herpes genital se trata con antivirales como aciclovir, famciclovir y valaciclovir, que ayudan          " +
                                                  "\n a reducir la duraci�n y severidad de los brotes. En M�xico, algunas marcas reconocidas son Zovirax (aciclovir),         " +
                                                  "\n Famvir (famciclovir) y Valtrex (valaciclovir). Tambi�n se recomienda el uso de cremas con lidoca�na para aliviar        " +
                                                  "\n el dolor y evitar irritaciones. ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema inmunol�gico y reducir la          " +
                                                  "\n frecuencia de los brotes, se recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales. FRUTAS       " +
                                                  "\n C�TRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema inmune, aportando aproximadamente " +
                                                  "\n 89% del requerimiento diario por cada 100 gramos. YOGURT NATURAL: Rico en PROBI�TICOS, que ayudan a equilibrar la       " +
                                                  "\n flora intestinal y fortalecer el sistema inmunol�gico, proporcionando 20% del requerimiento diario por cada 150 gramos. " +
                                                  "\n VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales para la regeneraci�n celular      " +
                                                  "\n y la funci�n muscular, aportando cerca del 15% del requerimiento diario por cada 100 gramos. Este es solo un diagn�stico  " +
                                                  "\n predeterminado l�gico. Haberlo consultado no garantiza al 100% que la paciente tenga herpes genital ni que el tratamiento " +
                                                  "\n sea el adecuado. Se recomienda realizar m�s de un diagn�stico para mayor seguridad y, por su salud, consultar a su m�dico." +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada para mejorar la circulaci�n" +
                                                  "\n y fortalecer el sistema inmunol�gico. Ejercicios como caminatas, nataci�n y estiramientos pueden ser beneficiosos para la        " +
                                                  "\n recuperaci�n. HIDRATACI�N: Es esencial el consumo de 2.5 a 3 litros de agua, aproximadamente 10 a 12 vasos de tama�o regular,    " +
                                                  "\n para facilitar la eliminaci�n de toxinas y mejorar la funci�n celular. POSIBLE TRATAMIENTO: La s�filis se trata con penicilina,  " +
                                                  "\n que es el medicamento de elecci�n. En M�xico, algunas marcas reconocidas son Benzetacil (penicilina benzatina). En casos de      " +
                                                  "\n alergia a la penicilina, se pueden utilizar alternativas como doxiciclina o azitromicina, bajo supervisi�n m�dica. ALIMENTACI�N  " +
                                                  "\n RECOMENDADA: Para fortalecer el sistema inmunol�gico y mejorar la recuperaci�n, se recomienda el consumo de alimentos ricos en   " +
                                                  "\n vitaminas y minerales esenciales. FRUTAS C�TRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema   " +
                                                  "\n inmune, aportando aproximadamente 89% del requerimiento diario por cada 100 gramos. PESCADOS GRASOS (salm�n, at�n): Fuente de    " +
                                                  "\n OMEGA-3, con propiedades antiinflamatorias, proporcionando aproximadamente 2.2 gramos por cada 100 gramos de pescado. VEGETALES  " +
                                                  "\n DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales para la regeneraci�n celular y la funci�n muscular,  " +
                                                  "\n aportando cerca del 15% del requerimiento diario por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico. Haberlo " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga s�filis ni que el tratamiento sea el adecuado. Se recomienda realizar m�s  " +
                                                  "\n de un diagn�stico para mayor seguridad y, por su salud, consultar a su m�dico. Angel L Montes agradece tu visita a la app        " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis." +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada como caminatas suaves y ejercicios de respiraci�n para        " +
                                                  "\n mejorar la capacidad pulmonar y reducir la fatiga. HIDRATACI�N: Es clave el consumo de 2.5 a 3 litros de         " +
                                                  "\n agua, aproximadamente 10 a 12 vasos de tama�o regular, para mantener las v�as respiratorias limpias y            " +
                                                  "\n mejorar la eliminaci�n de toxinas. POSIBLE TRATAMIENTO: La tuberculosis se trata con un r�gimen de antibi�ticos  " +
                                                  "\n de primera l�nea, que incluyen isoniazida, rifampicina, etambutol y pirazinamida. En M�xico, algunas marcas      " +
                                                  "\n reconocidas son Rimactane (rifampicina), Laniazid (isoniazida) y Myambutol (etambutol). Es crucial seguir el     " +
                                                  "\n tratamiento completo durante los meses indicados por el m�dico para evitar resistencia bacteriana. ALIMENTACI�N  " +
                                                  "\n RECOMENDADA: Para fortalecer el sistema inmunol�gico y mejorar la recuperaci�n, se recomienda el consumo de      " +
                                                  "\n alimentos ricos en vitaminas y minerales esenciales. FRUTAS C�TRICAS (naranjas, limones, toronjas): Altas en     " +
                                                  "\n VITAMINA C, que fortalece el sistema inmune, aportando aproximadamente 89% del requerimiento diario por cada     " +
                                                  "\n 100 gramos. ALMENDRAS Y NUECES: Contienen ZINC, esencial para la cicatrizaci�n y la respuesta inmunol�gica,      " +
                                                  "\n aportando alrededor del 15% del requerimiento diario por cada 30 gramos. PESCADOS GRASOS (salm�n, at�n): Fuente  " +
                                                  "\n de OMEGA-3, con propiedades antiinflamatorias, proporcionando aproximadamente 2.2 gramos por cada 100 gramos de  " +
                                                  "\n pescado. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO, fundamental para combatir la fatiga y      " +
                                                  "\n mejorar la oxigenaci�n celular, aportando cerca del 15% del requerimiento diario por cada 100 gramos. Este es    " +
                                                  "\n solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que la paciente tenga         " +
                                                  "\n tuberculosis ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico para mayor      " +
                                                  "\n seguridad y, por su salud, consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera  " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis. " +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al d�a (aproximadamente         " +
                                                  "\n ocho a diez vasos de agua de tama�o regular) para mantener la hidrataci�n de las articulaciones y reducir la        " +
                                                  "\n inflamaci�n. Tambi�n se recomienda el consumo de l�quidos ricos en antioxidantes como t� verde o infusiones         " +
                                                  "\n de c�rcuma para mejorar la funci�n articular. EJERCICIO: Se recomienda actividad f�sica moderada y adaptada         " +
                                                  "\n a la condici�n de la paciente, como ejercicios de bajo impacto, nataci�n, yoga o pilates. Estos ayudan a mejorar    " +
                                                  "\n la movilidad, reducir la rigidez y fortalecer los m�sculos que protegen las articulaciones. Es importante evitar    " +
                                                  "\n ejercicios de alto impacto que puedan generar estr�s en las articulaciones afectadas. POSIBLE TRATAMIENTO: El       " +
                                                  "\n tratamiento para la artritis suele incluir antiinflamatorios no esteroides como ibuprofeno (marca com�n en M�xico:  " +
                                                  "\n Advil) y corticosteroides en casos graves. Tambi�n se recomienda el uso de medicamentos modificadores de la         " +
                                                  "\n enfermedad como metotrexato o sulfasalazina para reducir la progresi�n de la artritis. En algunos casos, la         " +
                                                  "\n terapia f�sica y el uso de suplementos como glucosamina y condroitina pueden ser beneficiosos. ALIMENTACI�N         " +
                                                  "\n RECOMENDADA: Para fortalecer las articulaciones y reducir la inflamaci�n, se recomienda el consumo de PESCADOS      " +
                                                  "\n GRASOS como salm�n y at�n, ricos en �CIDOS GRASOS OMEGA-3, que poseen propiedades antiinflamatorias y aportan       " +
                                                  "\n aproximadamente el 50% del requerimiento diario por cada 100 g. FRUTOS ROJOS como fresas y ar�ndanos, ricos en      " +
                                                  "\n ANTIOXIDANTES, que ayudan a reducir el da�o celular y aportan cerca del 50% del requerimiento diario de VITAMINA C  " +
                                                  "\n por cada 100 g. C�RCUMA, con propiedades ANTIINFLAMATORIAS, que pueden aliviar el dolor articular y mejorar la      " +
                                                  "\n movilidad. ESPINACA, fuente de HIERRO y VITAMINA K, que fortalece los huesos y aporta aproximadamente el 15% del    " +
                                                  "\n requerimiento diario de HIERRO por cada 100 g. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se  " +
                                                  "\n recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud,   " +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes      " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al d�a (aproximadamente           " +
                                                  "\n ocho a diez vasos de agua de tama�o regular) para mantener la hidrataci�n de las v�as respiratorias y reducir         " +
                                                  "\n la irritaci�n causada por la tos persistente. Tambi�n se recomienda el consumo de l�quidos tibios como t� de          " +
                                                  "\n jengibre o caldos naturales para mejorar la funci�n pulmonar. EJERCICIO: Se recomienda reposo absoluto mientras       " +
                                                  "\n persistan los s�ntomas, evitando cualquier actividad f�sica intensa. Una vez recuperada, se pueden realizar           " +
                                                  "\n ejercicios de respiraci�n y fortalecimiento pulmonar para mejorar la capacidad respiratoria y reducir la fatiga.      " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la tosferina suele incluir antibi�ticos como azitromicina o claritromicina   " +
                                                  "\n (marcas comunes en M�xico: Zithromax, Klaricid) para reducir la duraci�n de la enfermedad y prevenir complicaciones.  " +
                                                  "\n Tambi�n se recomienda el uso de broncodilatadores en casos de dificultad respiratoria severa. ALIMENTACI�N            " +
                                                  "\n RECOMENDADA: Para fortalecer el sistema respiratorio y reducir la inflamaci�n, se recomienda el consumo de            " +
                                                  "\n FRUTAS C�TRICAS como naranja y toronja, ricas en VITAMINA C, que fortalece el sistema inmune y aporta cerca           " +
                                                  "\n del 89% del requerimiento diario por cada 100 g. JENGIBRE, con propiedades ANTIINFLAMATORIAS y antioxidantes,         " +
                                                  "\n que pueden aliviar s�ntomas respiratorios y mejorar la funci�n pulmonar. MIEL, con propiedades ANTIBACTERIANAS        " +
                                                  "\n y calmantes, que ayudan a reducir la irritaci�n de la garganta. ESPINACA, fuente de HIERRO y ANTIOXIDANTES, que       " +
                                                  "\n ayudan a mejorar la oxigenaci�n celular y aportan aproximadamente el 15% del requerimiento diario de HIERRO por       " +
                                                  "\n cada 100 g. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el         " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar m�s de      " +
                                                  "\n un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico " +
                                                  "\n no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al d�a (aproximadamente ocho       " +
                                                  "\n a diez vasos de agua de tama�o regular) para prevenir la deshidrataci�n causada por fiebre y malestar. Tambi�n se      " +
                                                  "\n recomienda el consumo de caldos naturales y bebidas con electrolitos para mejorar la recuperaci�n. EJERCICIO: Se       " +
                                                  "\n recomienda reposo absoluto mientras persistan los s�ntomas, evitando cualquier actividad f�sica intensa. Una vez       " +
                                                  "\n recuperada, se pueden realizar ejercicios de bajo impacto como caminatas suaves y estiramientos para mejorar la        " +
                                                  "\n circulaci�n y fortalecer el sistema inmunol�gico. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para        " +
                                                  "\n las paperas. El manejo se centra en aliviar los s�ntomas con analg�sicos como ibuprofeno o paracetamol (marcas         " +
                                                  "\n comunes en M�xico: Advil, Tempra) para reducir la fiebre y el dolor. Tambi�n se recomienda el uso de compresas fr�as   " +
                                                  "\n en la zona inflamada para aliviar la hinchaz�n. ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema inmunol�gico y    " +
                                                  "\n ayudar en la recuperaci�n, se recomienda el consumo de FRUTAS C�TRICAS como naranja y toronja, ricas en VITAMINA C,    " +
                                                  "\n que fortalece el sistema inmune y aporta cerca del 89% del requerimiento diario por cada 100 g. PESCADOS GRASOS como   " +
                                                  "\n salm�n y at�n, ricos en �CIDOS GRASOS OMEGA-3, que poseen propiedades antiinflamatorias y aportan aproximadamente el   " +
                                                  "\n 50% del requerimiento diario por cada 100 g. ESPINACA, fuente de HIERRO y ANTIOXIDANTES, que ayudan a mejorar la       " +
                                                  "\n oxigenaci�n celular y aportan aproximadamente el 15% del requerimiento diario de HIERRO por cada 100 g. JENGIBRE, con  " +
                                                  "\n propiedades ANTIINFLAMATORIAS y antioxidantes, que pueden aliviar s�ntomas neurol�gicos y mejorar la funci�n cerebral. " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta  " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor " +
                                                  "\n seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo,  " +
                                                  "\n se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N. Es fundamental mantener una hidrataci�n adecuada para reducir los s�ntomas y prevenir complicaciones,     " +
                                                  "\n se recomienda el consumo de 2 a 2.5 litros de agua al d�a, adem�s de l�quidos ricos en electrolitos como agua de       " +
                                                  "\n coco o sueros orales para evitar la deshidrataci�n causada por fiebre y sudoraci�n, tambi�n se recomienda el consumo   " +
                                                  "\n de infusiones naturales como t� de jengibre para aliviar la inflamaci�n. EJERCICIO. La actividad f�sica debe ser       " +
                                                  "\n ligera y adaptada a la condici�n del paciente, se recomienda caminatas suaves y ejercicios de movilidad para mejorar   " +
                                                  "\n la circulaci�n y reducir la fatiga, adem�s el descanso adecuado es clave para la recuperaci�n, evitando esfuerzos      " +
                                                  "\n excesivos mientras persistan los s�ntomas. POSIBLE TRATAMIENTO. No existe un f�rmaco antiviral espec�fico para tratar  " +
                                                  "\n la infecci�n por virus Zika, el tratamiento es sintom�tico e incluye antiinflamatorios no esteroideos y analg�sicos    " +
                                                  "\n como el paracetamol para reducir la fiebre y aliviar el malestar, tambi�n se recomienda reposo, ingesta de abundantes  " +
                                                  "\n l�quidos y administraci�n de antihistam�nicos para controlar el prurito asociado con el exantema, es fundamental seguir    " +
                                                  "\n las indicaciones m�dicas y evitar la automedicaci�n. ALIMENTACI�N. Se recomienda el consumo de alimentos ricos en          " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, NARANJA. Rica en vitamina C que ayuda       " +
                                                  "\n a reducir la inflamaci�n y fortalecer el sistema inmune, aporta aproximadamente el 89% de la ingesta diaria recomendada    " +
                                                  "\n por cada 100 gramos. JENGIBRE. Contiene compuestos con efectos antiinflamatorios y ayuda a aliviar la fiebre y el          " +
                                                  "\n malestar, su consumo puede aportar hasta el 20% de la ingesta diaria recomendada de antioxidantes. MIEL. Posee             " +
                                                  "\n propiedades antimicrobianas y ayuda a calmar la garganta y reducir la inflamaci�n, aporta cerca del 10% de la ingesta      " +
                                                  "\n diaria recomendada de antioxidantes por cada cucharada. Este es solo un Diagn�stico predeterminado l�gico, haberlo         " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n   " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el            " +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo          " +
                                                  "\n se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N. Es crucial mantener una hidrataci�n adecuada para prevenir la deshidrataci�n causada por la          " +
                                                  "\n diarrea y el v�mito, se recomienda el consumo de 2.5 a 3 litros de agua al d�a, adem�s de soluciones de           " +
                                                  "\n rehidrataci�n oral como Pedialyte para recuperar electrolitos esenciales, tambi�n se recomienda el consumo        " +
                                                  "\n de caldos ligeros y agua de coco para reponer minerales perdidos y evitar la deshidrataci�n severa. EJERCICIO.    " +
                                                  "\n Durante la fase aguda de la enfermedad se recomienda reposo absoluto para evitar la deshidrataci�n y el desgaste  " +
                                                  "\n f�sico, una vez recuperada la paciente puede retomar actividades ligeras como caminatas cortas para mejorar       " +
                                                  "\n la circulaci�n y fortalecer el sistema inmunol�gico, adem�s ejercicios de movilidad pueden ayudar a recuperar     " +
                                                  "\n la energ�a y mejorar la digesti�n. POSIBLE TRATAMIENTO. No existe un tratamiento espec�fico para la infecci�n     " +
                                                  "\n por rotavirus, el manejo se centra en la prevenci�n de la deshidrataci�n mediante el consumo de l�quidos y        " +
                                                  "\n soluciones de rehidrataci�n oral, en casos graves puede requerirse la administraci�n de l�quidos intravenosos     " +
                                                  "\n en el hospital, es fundamental seguir las indicaciones m�dicas y evitar el consumo de alimentos irritantes.       " +
                                                  "\n ALIMENTACI�N. Se recomienda el consumo de alimentos ricos en fibra y probi�ticos para restaurar la flora          " +
                                                  "\n intestinal, PL�TANO. Rico en potasio que ayuda a recuperar los electrolitos perdidos, aporta aproximadamente      " +
                                                  "\n el 10% de la ingesta diaria recomendada por cada 100 gramos. YOGURT NATURAL. Contiene probi�ticos que ayudan      " +
                                                  "\n a restaurar la flora intestinal, su consumo puede aportar hasta el 20% de la ingesta diaria recomendada de        " +
                                                  "\n probi�ticos. ZANAHORIA. Rica en vitamina A que ayuda a la regeneraci�n celular intestinal, aporta aproximadamente " +
                                                  "\n el 56% de la ingesta diaria recomendada por cada 100 gramos. Este es solo un Diagn�stico predeterminado l�gico,   " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus   " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor  " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le    " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app       " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N. Es fundamental mantener una hidrataci�n adecuada para ayudar al cuerpo a eliminar la infecci�n y            " +
                                                  "\n reducir la fiebre, se recomienda el consumo de 2 a 2.5 litros de agua al d�a, adem�s de infusiones sin az�car            " +
                                                  "\n como t� verde o agua de jamaica para mejorar la circulaci�n, tambi�n se recomienda el consumo de agua con miel           " +
                                                  "\n y lim�n para aliviar la irritaci�n y fortalecer el sistema inmunol�gico. EJERCICIO. Se recomienda actividad f�sica       " +
                                                  "\n moderada como caminatas, nataci�n o yoga para mejorar la circulaci�n y fortalecer el sistema inmunol�gico, adem�s        " +
                                                  "\n ejercicios de movilidad pueden ayudar a reducir la inflamaci�n y mejorar la recuperaci�n, es importante realizar         " +
                                                  "\n ejercicio de manera constante y bajo supervisi�n m�dica. POSIBLE TRATAMIENTO. El tratamiento suele incluir antibi�ticos  " +
                                                  "\n como la ampicilina o gentamicina, adem�s pueden recetarse medicamentos complementarios para aliviar los s�ntomas,        " +
                                                  "\n tambi�n se recomienda el uso de probi�ticos para mejorar la flora intestinal y reducir el riesgo de reinfecci�n,         " +
                                                  "\n es fundamental seguir las indicaciones m�dicas y evitar el consumo de alimentos contaminados. ALIMENTACI�N. Se           " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico," +
                                                  "\n AR�NDANOS. Ricos en antioxidantes que ayudan a combatir infecciones, aportan aproximadamente el 25% de la ingesta diaria  " +
                                                  "\n recomendada por cada 100 gramos. AJO. Contiene compuestos antimicrobianos que pueden ayudar a combatir la infecci�n,      " +
                                                  "\n su consumo puede aportar hasta el 20% de la ingesta diaria recomendada de antioxidantes. JENGIBRE. Contiene propiedades   " +
                                                  "\n antiinflamatorias que pueden ayudar a reducir los s�ntomas, su consumo puede aportar hasta el 15% de la ingesta diaria    " +
                                                  "\n recomendada de antioxidantes. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%  " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se          " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su        " +
                                                  "\n paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar   " +
                                                  "\n a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tama�o regular)         " +
                                                  "\n para prevenir la deshidrataci�n causada por la diarrea y ayudar a eliminar toxinas. Tambi�n es recomendable          " +
                                                  "\n el consumo de soluciones de rehidrataci�n oral para reponer electrolitos perdidos. EJERCICIO: Se aconseja            " +
                                                  "\n evitar actividad f�sica intensa mientras persistan los s�ntomas. Se recomienda caminatas suaves de 15 a 30           " +
                                                  "\n minutos diarios para mejorar la circulaci�n y el bienestar general. POSIBLE TRATAMIENTO: Para la shigelosis          " +
                                                  "\n en mujeres j�venes, el tratamiento suele incluir antibi�ticos como la azitromicina o la ciprofloxacina en casos      " +
                                                  "\n graves. Tambi�n se recomienda el uso de soluciones de rehidrataci�n oral y una dieta adecuada para evitar            " +
                                                  "\n complicaciones. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en probi�ticos, vitaminas y minerales      " +
                                                  "\n esenciales para fortalecer el sistema digestivo y acelerar la recuperaci�n: Yogur natural: Rico en probi�ticos,      " +
                                                  "\n ayuda a restaurar la flora intestinal y mejorar la digesti�n. Pl�tanos: Contienen potasio (hasta un 12% del          " +
                                                  "\n requerimiento diario en 100g), esencial para reponer electrolitos perdidos. Arroz y pan tostado: Son f�ciles de      " +
                                                  "\n digerir y ayudan a estabilizar el sistema digestivo. Zanahorias: Ricas en vitamina A (hasta un 56% del requerimiento " +
                                                  "\n diario en 100g), esenciales para la regeneraci�n celular y la recuperaci�n intestinal. Este es solo un diagn�stico   " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello   " +
                                                  "\n la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para  " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s, por su salud, si la respuesta del      " +
                                                  "\n diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita" +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tama�o regular) para      " +
                                                  "\n mantener las v�as respiratorias hidratadas y reducir la viscosidad de las secreciones bronquiales. Tambi�n es          " +
                                                  "\n recomendable el consumo de infusiones calientes para aliviar la congesti�n. EJERCICIO: Se aconseja actividad f�sica    " +
                                                  "\n moderada y adaptada a la capacidad pulmonar de la paciente. Se recomienda ejercicios de respiraci�n, caminatas de      " +
                                                  "\n 30 minutos diarios y yoga para mejorar la funci�n pulmonar. POSIBLE TRATAMIENTO: Para la EPOC en mujeres j�venes,      " +
                                                  "\n el tratamiento suele incluir broncodilatadores como el salbutamol, corticosteroides inhalados como la fluticasona      " +
                                                  "\n y en algunos casos, terapia de ox�geno. Tambi�n es fundamental evitar el tabaquismo y la exposici�n a contaminantes.   " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antioxidantes y antiinflamatorias para mejorar     " +
                                                  "\n la funci�n pulmonar: Pescados grasos (salm�n, at�n): Ricos en �cidos grasos Omega-3, que poseen propiedades            " +
                                                  "\n antiinflamatorias. Frutas y verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli): Ricas en antioxidantes  " +
                                                  "\n como la vitamina C (hasta un 107% del requerimiento diario en 100g de br�coli) y carotenoides, que pueden proteger     " +
                                                  "\n las c�lulas del da�o. Jengibre: Contiene compuestos con efectos antiinflamatorios que podr�an ser beneficiosos para    " +
                                                  "\n las v�as respiratorias. C�rcuma: Con su componente activo, la curcumina, tiene potentes propiedades antiinflamatorias  " +
                                                  "\n y antioxidantes. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la     " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda   " +
                                                  "\n hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente,      " +
                                                  "\n adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se le recomienda mucho consultar       " +
                                                  "\n a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para      " +
                                                  "\n ayudar a eliminar toxinas y mantener la funci�n renal adecuada durante el tratamiento antibi�tico. EJERCICIO: Se       " +
                                                  "\n aconseja actividad f�sica moderada, evitando esfuerzos excesivos mientras persistan los s�ntomas. Se recomienda        " +
                                                  "\n caminatas suaves de 30 minutos diarios para mejorar la circulaci�n y el bienestar general. POSIBLE TRATAMIENTO:        " +
                                                  "\n Para la clamidia en mujeres j�venes, el tratamiento suele incluir antibi�ticos como la azitromicina o la doxiciclina.  " +
                                                  "\n Es fundamental completar el tratamiento para evitar complicaciones y reinfecciones. ALIMENTACI�N: Se recomienda        " +
                                                  "\n el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico         " +
                                                  "\n y ayudar a la recuperaci�n: Ajo: Contiene alicina, un compuesto con propiedades antimicrobianas que puede ayudar       " +
                                                  "\n a combatir infecciones. Frutas c�tricas (naranjas, limones, toronjas): Ricas en vitamina C (hasta un 89% del           " +
                                                  "\n requerimiento diario por cada 100g), esenciales para mejorar la respuesta inmune. Jengibre: Posee propiedades          " +
                                                  "\n antiinflamatorias y antioxidantes que pueden aliviar la inflamaci�n y mejorar la circulaci�n. Yogur natural:           " +
                                                  "\n Rico en probi�ticos, ayuda a restaurar la flora intestinal y fortalecer el sistema inmunol�gico. Este es solo          " +
                                                  "\n un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad     " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico     " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s, por su salud, si la      " +
                                                  "\n respuesta del diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2.5 a 3 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda             " +
                                                  "\n a mantener el equilibrio del sistema nervioso y reducir la inflamaci�n de las meninges. Tambi�n es beneficioso            " +
                                                  "\n complementar con infusiones naturales como t� de manzanilla o jengibre, que poseen propiedades antiinflamatorias          " +
                                                  "\n y relajantes. EJERCICIO. La actividad f�sica moderada es clave para fortalecer el sistema inmunol�gico y mejorar          " +
                                                  "\n la circulaci�n sangu�nea. Se recomienda realizar ejercicio aer�bico moderado al menos 30 minutos al d�a, como caminar,    " +
                                                  "\n nadar o andar en bicicleta, evitando el sobreesfuerzo. Tambi�n es beneficioso incluir ejercicios de respiraci�n como      " +
                                                  "\n yoga o t�cnicas de expansi�n pulmonar para mejorar la oxigenaci�n cerebral. POSIBLE TRATAMIENTO. El tratamiento           " +
                                                  "\n est�ndar incluye antibi�ticos como ceftriaxona, vancomicina y ampicilina, que ayudan a eliminar la bacteria causante      " +
                                                  "\n de la meningitis. En casos graves, se puede requerir hospitalizaci�n para administraci�n intravenosa de antibi�ticos      " +
                                                  "\n y monitoreo de s�ntomas. Marcas reconocidas incluyen Rocephin, Vancocin y Principen, las cuales han demostrado eficacia   " +
                                                  "\n en el manejo de la enfermedad. Tambi�n es importante el uso de antiinflamatorios y analg�sicos para reducir el dolor y    " +
                                                  "\n la fiebre. ALIMENTACI�N. Para fortalecer el sistema inmunol�gico y reducir la inflamaci�n, se recomienda consumir frutas  " +
                                                  "\n c�tricas como naranja, lim�n y toronja, que son ricas en vitamina C, la cual contribuye a la producci�n de gl�bulos       " +
                                                  "\n blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento diario por cada 100 gramos.      " +
                                                  "\n Verduras cruc�feras como br�coli y coliflor, que contienen vitamina K y antioxidantes, esenciales para la regeneraci�n    " +
                                                  "\n celular y la protecci�n del sistema nervioso. Pescados grasos como salm�n y sardina, que son ricos en Omega-3, el cual    " +
                                                  "\n tiene propiedades antiinflamatorias y aporta alrededor del 50% del requerimiento diario por porci�n de 100 gramos.        " +
                                                  "\n Legumbres como lentejas y garbanzos, que son fuente de prote�nas y hierro, esenciales para la energ�a y la regeneraci�n   " +
                                                  "\n celular, aportando cerca del 40% del requerimiento diario por cada 100 gramos. Este es solo un diagn�stico predeterminado " +
                                                  "\n l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean          " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico especialista.    " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2.5 a 3 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda a mantener     " +
                                                  "\n el equilibrio celular y mejorar la eliminaci�n de toxinas. Tambi�n es beneficioso complementar con infusiones naturales      " +
                                                  "\n como t� verde o c�rcuma, que poseen propiedades antioxidantes y anticancer�genas. EJERCICIO. La actividad f�sica moderada    " +
                                                  "\n es clave para fortalecer el sistema inmunol�gico y mejorar la salud cardiovascular. Se recomienda realizar ejercicio         " +
                                                  "\n aer�bico moderado al menos 30 minutos al d�a, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo. Tambi�n   " +
                                                  "\n es beneficioso incluir ejercicios de resistencia como levantamiento de pesas ligeras o yoga, que ayudan a mantener la masa   " +
                                                  "\n muscular y reducir el estr�s. POSIBLE TRATAMIENTO. El tratamiento est�ndar incluye quimioterapia, radioterapia y terapia     " +
                                                  "\n dirigida, dependiendo del tipo y estadio del c�ncer. En algunos casos, se puede recurrir a inmunoterapia, que ayuda al       " +
                                                  "\n sistema inmunol�gico a combatir las c�lulas cancerosas. Marcas reconocidas incluyen Herceptin, Avastin, Keytruda y Opdivo,   " +
                                                  "\n las cuales han demostrado eficacia en el manejo de la enfermedad. Tambi�n es importante el uso de suplementos nutricionales  " +
                                                  "\n para mantener la energ�a y reducir los efectos secundarios del tratamiento. ALIMENTACI�N. Para fortalecer el sistema         " +
                                                  "\n inmunol�gico y reducir la inflamaci�n, se recomienda consumir frutas c�tricas como naranja, lim�n y toronja, que son ricas   " +
                                                  "\n en vitamina C, la cual contribuye a la producci�n de gl�bulos blancos y mejora la respuesta inmune, aportando aproximadamente" +
                                                  "\n el 90% del requerimiento diario por cada 100 gramos. Verduras de hoja verde como espinaca y kale, que contienen �cido f�lico " +
                                                  "\n y antioxidantes, esenciales para la regeneraci�n celular y la protecci�n contra el da�o oxidativo. Pescados grasos como      " +
                                                  "\n salm�n y at�n, que son ricos en Omega-3, el cual tiene propiedades antiinflamatorias y aporta alrededor del 50% del          " +
                                                  "\n requerimiento diario por porci�n de 100 gramos. Frutos secos como almendras y nueces, que aportan vitamina E, la cual        " +
                                                  "\n protege las c�lulas del da�o oxidativo y contribuye con el 70% del requerimiento diario por cada 30 gramos. Legumbres        " +
                                                  "\n como lentejas y garbanzos, que son fuente de prote�nas y hierro, esenciales para la energ�a y la regeneraci�n celular,       " +
                                                  "\n aportando cerca del 40% del requerimiento diario por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico.     " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente       " +
                                                  "\n correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico especialista. Angel L Montes      " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        
                        if(EstaturaFemenino.equals("1.40-1.65 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para          " +
                                                  "\n mantener una hidrataci�n adecuada. Esto ayuda a reducir la congesti�n, mantener la mucosa respiratoria hidratada           " +
                                                  "\n y favorecer la eliminaci�n de toxinas. Tambi�n es recomendable el consumo de infusiones calientes como t� de jengibre      " +
                                                  "\n o manzanilla para aliviar la irritaci�n de garganta y mejorar la recuperaci�n. EJERCICIO: Se aconseja actividad f�sica     " +
                                                  "\n moderada diariamente, evitando esfuerzos excesivos mientras persistan los s�ntomas. Se recomienda al menos 30 minutos      " +
                                                  "\n de ejercicio ligero, como caminatas o estiramientos, lo cual ayuda a mejorar la circulaci�n, fortalecer el sistema         " +
                                                  "\n inmune y promover una recuperaci�n m�s efectiva. POSIBLE TRATAMIENTO: Para la gripe en mujeres j�venes, el tratamiento     " +
                                                  "\n suele incluir medicamentos para reducir la fiebre y aliviar los s�ntomas, como el paracetamol (Tempra) o el ibuprofeno.    " +
                                                  "\n Tambi�n pueden utilizarse antivirales espec�ficos contra la gripe, como el oseltamivir (Tamiflu), en casos m�s severos     " +
                                                  "\n o bajo indicaci�n m�dica. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en vitaminas, minerales y antioxidantes  " +
                                                  "\n para fortalecer el sistema inmunol�gico y combatir los s�ntomas de la gripe: Naranjas y mandarinas: Ricas en vitamina C      " +
                                                  "\n (hasta un 89% del requerimiento diario por cada 100g), esenciales para reducir la duraci�n de los s�ntomas y mejorar la      " +
                                                  "\n respuesta inmune. Fresas y ar�ndanos: Contienen antioxidantes y vitamina C (hasta un 65% del requerimiento diario en 100g    " +
                                                  "\n de fresas) que protegen las c�lulas del da�o causado por la infecci�n. Jengibre: Posee propiedades antiinflamatorias y       " +
                                                  "\n antioxidantes que pueden aliviar la congesti�n y el malestar general. Espinacas y br�coli: Ricos en vitamina A (hasta un     " +
                                                  "\n 56% del requerimiento diario en 100g de espinaca) y vitamina C (hasta un 107% del requerimiento diario en 100g de br�coli),  " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico y acelerar la recuperaci�n. Este es solo un diagn�stico predeterminado    " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus      " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad   " +
                                                  "\n en el tratamiento adecuado de su paciente, adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo,   " +
                                                  "\n se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tama�o regular) para          " +
                                                  "\n mantener una hidrataci�n adecuada. Esto ayuda a fluidificar las secreciones pulmonares, facilitando su expulsi�n           " +
                                                  "\n y reduciendo la congesti�n respiratoria. Tambi�n es recomendable el consumo de caldos y sopas calientes para mejorar       " +
                                                  "\n la hidrataci�n y aliviar la irritaci�n de garganta. EJERCICIO: Se aconseja actividad f�sica ligera y progresiva,           " +
                                                  "\n evitando esfuerzos intensos mientras persistan los s�ntomas. Se recomienda caminatas suaves de 15 a 30 minutos diarios     " +
                                                  "\n para mejorar la oxigenaci�n y la recuperaci�n pulmonar. POSIBLE TRATAMIENTO: Para la neumon�a en mujeres j�venes, el       " +
                                                  "\n tratamiento suele incluir antibi�ticos en caso de infecci�n bacteriana, como la amoxicilina (Amoxil) o la azitromicina.    " +
                                                  "\n Tambi�n pueden utilizarse medicamentos para reducir la fiebre y aliviar los s�ntomas, como el paracetamol o el ibuprofeno. " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales para fortalecer el sistema   " +
                                                  "\n inmunol�gico y mejorar la funci�n pulmonar: Naranjas y mandarinas: Ricas en vitamina C (hasta un 89% del requerimiento     " +
                                                  "\n diario por cada 100g), esenciales para mejorar la respuesta inmune. Jengibre: Posee propiedades antiinflamatorias y        " +
                                                  "\n antioxidantes que pueden aliviar la congesti�n. Espinacas y br�coli: Ricos en vitamina A (hasta un 56% del requerimiento   " +
                                                  "\n diario en 100g de espinaca) y vitamina C (hasta un 107% del requerimiento diario en 100g de br�coli), esenciales para      " +
                                                  "\n fortalecer el sistema inmunol�gico y acelerar la recuperaci�n. Ajo: Contiene alicina, un compuesto con propiedades         " +
                                                  "\n antimicrobianas que puede ayudar a combatir infecciones respiratorias. Este es solo un diagn�stico predeterminado l�gico,  " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el      " +
                                                  "\n tratamiento adecuado de su paciente, adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se    " +
                                                  "\n le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para      " +
                                                  "\n mantener una hidrataci�n adecuada y ayudar a regular los niveles de glucosa en sangre. Tambi�n es recomendable el      " +
                                                  "\n consumo de infusiones sin az�car como t� verde o manzanilla para mejorar la digesti�n y el metabolismo. EJERCICIO:     " +
                                                  "\n Se aconseja actividad f�sica regular, como caminatas de 30 a 60 minutos diarios, ejercicios de resistencia o yoga,     " +
                                                  "\n lo cual ayuda a mejorar la sensibilidad a la insulina y controlar los niveles de az�car en sangre. POSIBLE             " +
                                                  "\n TRATAMIENTO: Para la diabetes en mujeres j�venes, el tratamiento suele incluir medicamentos para controlar             " +
                                                  "\n la glucosa, como la metformina (Glucophage) o insulina en casos espec�ficos. Tambi�n se recomienda el monitoreo        " +
                                                  "\n constante de los niveles de glucosa y una dieta equilibrada. ALIMENTACI�N: Se recomienda el consumo de alimentos       " +
                                                  "\n con bajo �ndice gluc�mico y ricos en nutrientes esenciales para el control de la diabetes: Aguacate: Rico en grasas    " +
                                                  "\n saludables y fibra, ayuda a estabilizar los niveles de glucosa. Frutos rojos (ar�ndanos, fresas): Contienen            " +
                                                  "\n antioxidantes y vitamina C (hasta un 65% del requerimiento diario en 100g de fresas), que pueden mejorar la            " +
                                                  "\n sensibilidad a la insulina. Espinacas y br�coli: Ricos en magnesio (hasta un 20% del requerimiento diario en           " +
                                                  "\n 100g de espinaca), esencial para la regulaci�n de la glucosa. Canela: Contiene compuestos que pueden mejorar           " +
                                                  "\n la sensibilidad a la insulina y reducir los niveles de az�car en sangre. Este es solo un diagn�stico predeterminado    " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y    " +
                                                  "\n sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor   " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s, por su salud, si la respuesta del diagn�stico no le       " +
                                                  "\n satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2 a 2.5 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda a mantener      " +
                                                  "\n las v�as respiratorias h�medas y reducir la inflamaci�n bronquial. Tambi�n es beneficioso complementar con infusiones         " +
                                                  "\n naturales como t� de jengibre o c�rcuma, que poseen propiedades antiinflamatorias y antioxidantes. EJERCICIO. La actividad    " +
                                                  "\n f�sica moderada es clave para fortalecer el sistema respiratorio y mejorar la capacidad pulmonar. Se recomienda realizar      " +
                                                  "\n ejercicio aer�bico moderado al menos 30 minutos al d�a, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo.  " +
                                                  "\n Tambi�n es beneficioso incluir ejercicios de respiraci�n como yoga o t�cnicas de expansi�n pulmonar. POSIBLE TRATAMIENTO.     " +
                                                  "\n El tratamiento est�ndar incluye broncodilatadores de alivio r�pido como salbutamol, y corticosteroides inhalados como         " +
                                                  "\n fluticasona o budesonida, que ayudan a reducir la inflamaci�n y mejorar la funci�n pulmonar. Marcas reconocidas incluyen      " +
                                                  "\n Ventolin, Aerolin, Flixotide y Pulmicort. ALIMENTACI�N. Para fortalecer el sistema inmunol�gico y reducir la inflamaci�n,     " +
                                                  "\n se recomienda consumir frutas c�tricas como naranja, lim�n y toronja, que son ricas en vitamina C, la cual contribuye a       " +
                                                  "\n la producci�n de gl�bulos blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento diario     " +
                                                  "\n por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el        " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s      " +
                                                  "\n de un diagn�stico y consultar a un m�dico especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que     " +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2.5 a 3 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda     " +
                                                  "\n a mantener el equilibrio del sistema inmunol�gico y mejorar la absorci�n de los medicamentos antirretrovirales.   " +
                                                  "\n Tambi�n es beneficioso complementar con infusiones naturales como t� verde o manzanilla, que poseen propiedades   " +
                                                  "\n antioxidantes y antiinflamatorias. EJERCICIO. La actividad f�sica moderada es clave para fortalecer el sistema    " +
                                                  "\n inmunol�gico y mejorar la salud cardiovascular. Se recomienda realizar ejercicio aer�bico moderado al menos 30    " +
                                                  "\n minutos al d�a, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo. Tambi�n es beneficioso       " +
                                                  "\n incluir ejercicios de resistencia como levantamiento de pesas ligeras o yoga, que ayudan a mantener la masa       " +
                                                  "\n muscular y reducir el estr�s. POSIBLE TRATAMIENTO. El tratamiento est�ndar incluye terapia antirretroviral        " +
                                                  "\n (TAR) con medicamentos como tenofovir, emtricitabina y dolutegravir, que ayudan a controlar la replicaci�n        " +
                                                  "\n del virus y mejorar la calidad de vida. Marcas reconocidas incluyen Atripla, Truvada, Tivicay y Biktarvy.         " +
                                                  "\n ALIMENTACI�N. Para fortalecer el sistema inmunol�gico y reducir la inflamaci�n, se recomienda consumir frutas     " +
                                                  "\n c�tricas como naranja, lim�n y toronja, que son ricas en vitamina C, la cual contribuye a la producci�n de        " +
                                                  "\n gl�bulos blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento diario por      " +
                                                  "\n cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100%       " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda" +
                                                  "\n realizar m�s de un diagn�stico y consultar a un m�dico especialista. Angel L Montes agradece tu visita a la app   " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2 a 2.5 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda   " +
                                                  "\n a eliminar toxinas y mantener el equilibrio del sistema inmunol�gico. Tambi�n es beneficioso complementar con   " +
                                                  "\n infusiones naturales como t� verde o manzanilla, que poseen propiedades antibacterianas y antiinflamatorias.    " +
                                                  "\n EJERCICIO. La actividad f�sica moderada es clave para fortalecer el sistema inmunol�gico y mejorar la           " + 
                                                  "\n circulaci�n sangu�nea. Se recomienda realizar ejercicio aer�bico moderado al menos 30 minutos al d�a, como      " +
                                                  "\n caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo. Tambi�n es beneficioso incluir ejercicios de    " +
                                                  "\n resistencia como levantamiento de pesas ligeras o yoga, que ayudan a mantener la masa muscular y reducir el     " +
                                                  "\n estr�s. POSIBLE TRATAMIENTO. El tratamiento est�ndar incluye antibi�ticos como ceftriaxona y azitromicina,      " +
                                                  "\n que ayudan a eliminar la bacteria Neisseria gonorrhoeae. Marcas reconocidas incluyen Rocephin y Zithromax, las     " +
                                                  "\n cuales han demostrado eficacia en el manejo de la gonorrea. ALIMENTACI�N. Para fortalecer el sistema inmunol�gico  " +
                                                  "\n y reducir la inflamaci�n, se recomienda consumir frutas c�tricas como naranja, lim�n y toronja, que son ricas en   " +
                                                  "\n vitamina C, la cual contribuye a la producci�n de gl�bulos blancos y mejora la respuesta inmune, aportando         " +
                                                  "\n aproximadamente el 90% del requerimiento diario por cada 100 gramos. Este es solo un diagn�stico predeterminado    " +
                                                  "\n l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean   " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico especialista. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada para fortalecer el sistema inmunol�gico y reducir el estr�s,     " +
                                                  "\n que puede desencadenar brotes. Ejercicios como yoga, pilates y caminatas suaves son ideales para mejorar la         " +
                                                  "\n circulaci�n y el bienestar general. Tambi�n se recomienda ejercicios de respiraci�n profunda para mejorar la        " +
                                                  "\n oxigenaci�n celular y reducir la inflamaci�n. HIDRATACI�N: Es fundamental el consumo de 2 a 2.5 litros de agua,     " +
                                                  "\n aproximadamente 8 a 10 vasos de tama�o regular, para mantener la piel hidratada y favorecer la eliminaci�n de       " +
                                                  "\n toxinas. La hidrataci�n adecuada tambi�n ayuda a reducir la sequedad y la irritaci�n en la piel, lo que puede       " +
                                                  "\n aliviar los s�ntomas del herpes genital. POSIBLE TRATAMIENTO: El herpes genital se trata con antivirales como       " +
                                                  "\n aciclovir, famciclovir y valaciclovir, que ayudan a reducir la duraci�n y severidad de los brotes. En M�xico,       " +
                                                  "\n algunas marcas reconocidas son Zovirax (aciclovir), Famvir (famciclovir) y Valtrex (valaciclovir). Tambi�n se       " +
                                                  "\n recomienda el uso de cremas con lidoca�na para aliviar el dolor y evitar irritaciones. Adem�s, mantener una         " +
                                                  "\n dieta equilibrada y evitar el consumo excesivo de alimentos ricos en arginina, como frutos secos y chocolate,       " +
                                                  "\n puede ayudar a reducir la frecuencia de los brotes. ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema            " +
                                                  "\n inmunol�gico y reducir la frecuencia de los brotes, se recomienda el consumo de alimentos ricos en vitaminas y      " +
                                                  "\n minerales esenciales. FRUTAS C�TRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema  " +
                                                  "\n inmune, aportando aproximadamente 89% del requerimiento diario por cada 100 gramos. YOGURT NATURAL: Rico en         " +
                                                  "\n PROBI�TICOS, que ayudan a equilibrar la flora intestinal y fortalecer el sistema inmunol�gico, proporcionando 20%   " +
                                                  "\n del requerimiento diario por cada 150 gramos. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO,  " +
                                                  "\n fundamentales para la regeneraci�n celular y la funci�n muscular, aportando cerca del 15% del requerimiento diario     " +
                                                  "\n por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que    " +
                                                  "\n la paciente tenga herpes genital ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico   " +
                                                  "\n para mayor seguridad y, por su salud, consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y    " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada para mejorar la circulaci�n y fortalecer el sistema     " +
                                                  "\n inmunol�gico. Ejercicios como caminatas, nataci�n y estiramientos pueden ser beneficiosos para la          " +
                                                  "\n recuperaci�n. Tambi�n se recomienda ejercicios de resistencia moderada para mejorar la funci�n muscular    " +
                                                  "\n y reducir la fatiga. HIDRATACI�N: Es esencial el consumo de 2.5 a 3 litros de agua, aproximadamente 10     " +
                                                  "\n a 12 vasos de tama�o regular, para facilitar la eliminaci�n de toxinas y mejorar la funci�n celular.       " +
                                                  "\n Mantener una hidrataci�n adecuada tambi�n contribuye a la regeneraci�n de tejidos y ayuda a reducir la     " +
                                                  "\n inflamaci�n. POSIBLE TRATAMIENTO: La s�filis se trata con penicilina, que es el medicamento de elecci�n.   " +
                                                  "\n En M�xico, algunas marcas reconocidas son Benzetacil (penicilina benzatina). En casos de alergia a la      " +
                                                  "\n penicilina, se pueden utilizar alternativas como doxiciclina o azitromicina, bajo supervisi�n m�dica.      " +
                                                  "\n Tambi�n se recomienda el seguimiento de un plan de tratamiento adecuado para evitar complicaciones a       " +
                                                  "\n largo plazo. ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema inmunol�gico y mejorar la recuperaci�n,  " +
                                                  "\n se recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales. FRUTAS C�TRICAS (naranjas," +
                                                  "\n limones, toronjas): Altas en VITAMINA C, que fortalece el sistema inmune, aportando aproximadamente 89%    " +
                                                  "\n del requerimiento diario por cada 100 gramos. PESCADOS GRASOS (salm�n, at�n): Fuente de OMEGA-3, con       " +
                                                  "\n propiedades antiinflamatorias, proporcionando aproximadamente 2.2 gramos por cada 100 gramos de pescado.   " +
                                                  "\n VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales para la regeneraci�n " +
                                                  "\n celular y la funci�n muscular, aportando cerca del 15% del requerimiento diario por cada 100 gramos. Este  " +
                                                  "\n es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que la paciente tenga" +
                                                  "\n s�filis ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico para mayor     " +
                                                  "\n seguridad y, por su salud, consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y   " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis." +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada como caminatas suaves y ejercicios de respiraci�n para mejorar        " +
                                                  "\n la capacidad pulmonar y reducir la fatiga. Tambi�n se recomienda ejercicios de expansi�n tor�cica para mejorar la        " +
                                                  "\n oxigenaci�n y fortalecer los m�sculos respiratorios. HIDRATACI�N: Es clave el consumo de 2.5 a 3 litros de agua,         " +
                                                  "\n aproximadamente 10 a 12 vasos de tama�o regular, para mantener las v�as respiratorias limpias y mejorar la eliminaci�n   " +
                                                  "\n de toxinas. Tambi�n se recomienda el consumo de l�quidos tibios como infusiones de jengibre o miel para aliviar la       " +
                                                  "\n irritaci�n de la garganta y mejorar la expectoraci�n. POSIBLE TRATAMIENTO: La tuberculosis se trata con un r�gimen de    " +
                                                  "\n antibi�ticos de primera l�nea, que incluyen isoniazida, rifampicina, etambutol y pirazinamida. En M�xico, algunas        " +
                                                  "\n marcas reconocidas son Rimactane (rifampicina), Laniazid (isoniazida) y Myambutol (etambutol). Es crucial seguir el      " +
                                                  "\n tratamiento completo durante los meses indicados por el m�dico para evitar resistencia bacteriana. Tambi�n se recomienda " +
                                                  "\n el seguimiento de un plan de alimentaci�n adecuado para mejorar la recuperaci�n. ALIMENTACI�N RECOMENDADA: Para          " +
                                                  "\n fortalecer el sistema inmunol�gico y mejorar la recuperaci�n, se recomienda el consumo de alimentos ricos en vitaminas   " +
                                                  "\n y minerales esenciales. FRUTAS C�TRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema     " +
                                                  "\n inmune, aportando aproximadamente 89% del requerimiento diario por cada 100 gramos. ALMENDRAS Y NUECES: Contienen ZINC,  " +
                                                  "\n esencial para la cicatrizaci�n y la respuesta inmunol�gica, aportando alrededor del 15% del requerimiento diario por     " +
                                                  "\n cada 30 gramos. PESCADOS GRASOS (salm�n, at�n): Fuente de OMEGA-3, con propiedades antiinflamatorias, proporcionando     " +
                                                  "\n aproximadamente 2.2 gramos por cada 100 gramos de pescado. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO,  " +
                                                  "\n fundamental para combatir la fatiga y mejorar la oxigenaci�n celular, aportando cerca del 15% del requerimiento diario   " +
                                                  "\n por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que la   " +
                                                  "\n paciente tenga tuberculosis ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico para     " +
                                                  "\n mayor seguridad y, por su salud, consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera    " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al d�a (aproximadamente        " +
                                                  "\n ocho a diez vasos de agua de tama�o regular) para mantener la hidrataci�n de las articulaciones y reducir la       " +
                                                  "\n inflamaci�n. Tambi�n se recomienda el consumo de l�quidos ricos en antioxidantes como t� verde o infusiones de     " +
                                                  "\n c�rcuma para mejorar la funci�n articular. EJERCICIO: Se recomienda actividad f�sica moderada y adaptada a la      " +
                                                  "\n condici�n de la paciente, como ejercicios de bajo impacto, nataci�n, yoga o pilates. Estos ayudan a mejorar la     " +
                                                  "\n movilidad, reducir la rigidez y fortalecer los m�sculos que protegen las articulaciones. Es importante evitar      " +
                                                  "\n ejercicios de alto impacto que puedan generar estr�s en las articulaciones afectadas. POSIBLE TRATAMIENTO: El      " +
                                                  "\n tratamiento para la artritis se centra en aliviar los s�ntomas y mejorar el funcionamiento de las articulaciones.  " +
                                                  "\n Se pueden utilizar antiinflamatorios no esteroides como ibuprofeno (marca com�n en M�xico: Advil) y naproxeno para " +
                                                  "\n reducir el dolor y la inflamaci�n. En casos m�s graves, los m�dicos pueden recetar corticosteroides para controlar " +
                                                  "\n la inflamaci�n severa. Tambi�n se recomienda el uso de medicamentos modificadores de la enfermedad como metotrexato   " +
                                                  "\n o sulfasalazina para reducir la progresi�n de la artritis. La fisioterapia es una opci�n clave para mejorar la        " + 
                                                  "\n movilidad y reducir el dolor, incluyendo ejercicios de fortalecimiento y t�cnicas de terapia manual. En algunos       " +
                                                  "\n casos, la terapia biol�gica con inhibidores del factor de necrosis tumoral (TNF) puede ser recomendada para pacientes " +
                                                  "\n con artritis reumatoide. ALIMENTACI�N RECOMENDADA: Para fortalecer las articulaciones y reducir la inflamaci�n, se    " +
                                                  "\n recomienda el consumo de PESCADOS GRASOS como salm�n y at�n, ricos en �CIDOS GRASOS OMEGA-3, que poseen propiedades   " +
                                                  "\n antiinflamatorias y aportan aproximadamente el 50% del requerimiento diario por cada 100 g. FRUTOS ROJOS como fresas  " +
                                                  "\n y ar�ndanos, ricos en ANTIOXIDANTES, que ayudan a reducir el da�o celular y aportan cerca del 50% del requerimiento   " +
                                                  "\n diario de VITAMINA C por cada 100 g. C�RCUMA, con propiedades ANTIINFLAMATORIAS, que pueden aliviar el dolor          " +
                                                  "\n articular y mejorar la movilidad. ESPINACA, fuente de HIERRO y VITAMINA K, que fortalece los huesos y aporta          " +
                                                  "\n aproximadamente el 15% del requerimiento diario de HIERRO por cada 100 g. Este es solo un diagn�stico predeterminado  " +
                                                  "\n l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean      " +
                                                  "\n completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado." +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.  " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al d�a (aproximadamente               " +
                                                  "\n ocho a diez vasos de agua de tama�o regular) para mantener la hidrataci�n de las v�as respiratorias y reducir             " +
                                                  "\n la irritaci�n causada por la tos persistente. Tambi�n se recomienda el consumo de l�quidos tibios como t� de              " +
                                                  "\n jengibre o caldos naturales para mejorar la funci�n pulmonar. EJERCICIO: Se recomienda reposo absoluto mientras           " +
                                                  "\n persistan los s�ntomas, evitando cualquier actividad f�sica intensa. Una vez recuperada, se pueden realizar               " +
                                                  "\n ejercicios de respiraci�n y fortalecimiento pulmonar para mejorar la capacidad respiratoria y reducir la fatiga.          " +
                                                  "\n Tambi�n es recomendable evitar ambientes con humo o contaminaci�n que puedan agravar los s�ntomas. POSIBLE                " +
                                                  "\n TRATAMIENTO: El tratamiento para la tosferina suele incluir antibi�ticos como azitromicina o claritromicina (marcas       " +
                                                  "\n comunes en M�xico: Zithromax, Klaricid) para reducir la duraci�n de la enfermedad y prevenir complicaciones.              " +
                                                  "\n Tambi�n se recomienda el uso de broncodilatadores en casos de dificultad respiratoria severa. En algunos casos,           " +
                                                  "\n los m�dicos pueden recomendar el uso de oxigenoterapia para mejorar la respiraci�n en pacientes con s�ntomas graves.      " +
                                                  "\n Adem�s, se recomienda el uso de humidificadores de vapor fr�o para aliviar la congesti�n y reducir la tos. ALIMENTACI�N   " +
                                                  "\n RECOMENDADA: Para fortalecer el sistema respiratorio y reducir la inflamaci�n, se recomienda el consumo de FRUTAS         " +
                                                  "\n C�TRICAS como naranja y toronja, ricas en VITAMINA C, que fortalece el sistema inmune y aporta cerca del 89% del          " +
                                                  "\n requerimiento diario por cada 100 g. JENGIBRE, con propiedades ANTIINFLAMATORIAS y antioxidantes, que pueden aliviar      " +
                                                  "\n s�ntomas respiratorios y mejorar la funci�n pulmonar. MIEL, con propiedades ANTIBACTERIANAS y calmantes, que ayudan       " +
                                                  "\n a reducir la irritaci�n de la garganta. ESPINACA, fuente de HIERRO y ANTIOXIDANTES, que ayudan a mejorar la oxigenaci�n   " +
                                                  "\n celular y aportan aproximadamente el 15% del requerimiento diario de HIERRO por cada 100 g. Este es solo un diagn�stico   " +
                                                  "\n predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas" +
                                                  "\n sean completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento         " +
                                                  "\n adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar         " +
                                                  "\n a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al d�a (aproximadamente         " +
                                                  "\n ocho a diez vasos de agua de tama�o regular) para prevenir la deshidrataci�n causada por fiebre y malestar.         " +
                                                  "\n Tambi�n se recomienda el consumo de caldos naturales y bebidas con electrolitos para mejorar la recuperaci�n.       " +
                                                  "\n EJERCICIO: Se recomienda reposo absoluto mientras persistan los s�ntomas, evitando cualquier actividad f�sica       " +
                                                  "\n intensa. Una vez recuperada, se pueden realizar ejercicios de bajo impacto como caminatas suaves y estiramientos    " +
                                                  "\n para mejorar la circulaci�n y fortalecer el sistema inmunol�gico. Tambi�n es recomendable evitar la exposici�n      " +
                                                  "\n prolongada al fr�o, ya que puede agravar la inflamaci�n de las gl�ndulas salivales. POSIBLE TRATAMIENTO: No existe  " +
                                                  "\n un tratamiento espec�fico para las paperas. El manejo se centra en aliviar los s�ntomas con analg�sicos como        " +
                                                  "\n ibuprofeno o paracetamol (marcas comunes en M�xico: Advil, Tempra) para reducir la fiebre y el dolor. Tambi�n       " +
                                                  "\n se recomienda el uso de compresas fr�as en la zona inflamada para aliviar la hinchaz�n. En casos graves, los        " +
                                                  "\n m�dicos pueden recomendar el monitoreo hospitalario para evitar complicaciones como meningitis o inflamaci�n        " +
                                                  "\n testicular. Adem�s, se recomienda evitar alimentos �cidos que puedan irritar las gl�ndulas salivales y aumentar     " +
                                                  "\n el dolor. ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema inmunol�gico y ayudar en la recuperaci�n, se         " +
                                                  "\n recomienda el consumo de FRUTAS C�TRICAS como naranja y toronja, ricas en VITAMINA C, que fortalece el sistema      " +
                                                  "\n inmune y aporta cerca del 89% del requerimiento diario por cada 100 g. PESCADOS GRASOS como salm�n y at�n, ricos    " +
                                                  "\n en �CIDOS GRASOS OMEGA-3, que poseen propiedades antiinflamatorias y aportan aproximadamente el 50% del             " +
                                                  "\n requerimiento diario por cada 100 g. ESPINACA, fuente de HIERRO y ANTIOXIDANTES, que ayudan a mejorar la            " +
                                                  "\n oxigenaci�n celular y aportan aproximadamente el 15% del requerimiento diario de HIERRO por cada 100 g.             " +
                                                  "\n JENGIBRE, con propiedades ANTIINFLAMATORIAS y antioxidantes, que pueden aliviar s�ntomas neurol�gicos y             " +
                                                  "\n mejorar la funci�n cerebral. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no               " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas.         " +
                                                  "\n Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por           " +
                                                  "\n su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.            " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N. Es fundamental mantener una hidrataci�n adecuada para reducir los s�ntomas y prevenir complicaciones,      " +
                                                  "\n se recomienda el consumo de 2 a 2.5 litros de agua al d�a, adem�s de l�quidos ricos en electrolitos como agua de        " +
                                                  "\n coco o sueros orales para evitar la deshidrataci�n causada por fiebre y sudoraci�n, tambi�n se recomienda el consumo    " +
                                                  "\n de infusiones naturales como t� de jengibre para aliviar la inflamaci�n. EJERCICIO. La actividad f�sica debe ser        " +
                                                  "\n ligera y adaptada a la condici�n del paciente, se recomienda caminatas suaves y ejercicios de movilidad para mejorar    " +
                                                  "\n la circulaci�n y reducir la fatiga, adem�s el descanso adecuado es clave para la recuperaci�n, evitando esfuerzos       " +
                                                  "\n excesivos mientras persistan los s�ntomas. POSIBLE TRATAMIENTO. No existe un f�rmaco antiviral espec�fico para tratar   " +
                                                  "\n la infecci�n por virus Zika, el tratamiento es sintom�tico e incluye antiinflamatorios no esteroideos y analg�sicos     " +
                                                  "\n como el paracetamol para reducir la fiebre y aliviar el malestar, tambi�n se recomienda reposo, ingesta de abundantes   " +
                                                  "\n l�quidos y administraci�n de antihistam�nicos para controlar el prurito asociado con el exantema, es fundamental seguir " +
                                                  "\n las indicaciones m�dicas y evitar la automedicaci�n. ALIMENTACI�N. Se recomienda el consumo de alimentos ricos en       " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, NARANJA. Rica en vitamina C que ayuda    " +
                                                  "\n a reducir la inflamaci�n y fortalecer el sistema inmune, aporta aproximadamente el 89% de la ingesta diaria recomendada " +
                                                  "\n por cada 100 gramos. JENGIBRE. Contiene compuestos con efectos antiinflamatorios y ayuda a aliviar la fiebre y el       " +
                                                  "\n malestar, su consumo puede aportar hasta el 20% de la ingesta diaria recomendada de antioxidantes. MIEL. Posee          " +
                                                  "\n propiedades antimicrobianas y ayuda a calmar la garganta y reducir la inflamaci�n, aporta cerca del 10% de la ingesta   " +
                                                  "\n diaria recomendada de antioxidantes por cada cucharada. Este es solo un Diagn�stico predeterminado l�gico, haberlo      " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas      " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en      " +
                                                  "\n el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo    " +
                                                  "\n se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N. Es crucial mantener una hidrataci�n adecuada para prevenir la deshidrataci�n causada por la diarrea           " +
                                                  "\n y el v�mito, se recomienda el consumo de 2.5 a 3 litros de agua al d�a, adem�s de soluciones de rehidrataci�n oral         " +
                                                  "\n como Pedialyte para recuperar electrolitos esenciales, tambi�n se recomienda el consumo de caldos ligeros y agua           " +
                                                  "\n de coco para reponer minerales perdidos y evitar la deshidrataci�n severa. EJERCICIO. Durante la fase aguda de la          " +
                                                  "\n enfermedad se recomienda reposo absoluto para evitar la deshidrataci�n y el desgaste f�sico, una vez recuperada la         " +
                                                  "\n paciente puede retomar actividades ligeras como caminatas cortas para mejorar la circulaci�n y fortalecer el sistema       " +
                                                  "\n inmunol�gico, adem�s ejercicios de movilidad pueden ayudar a recuperar la energ�a y mejorar la digesti�n. POSIBLE          " +
                                                  "\n TRATAMIENTO. No existe un tratamiento espec�fico para la infecci�n por rotavirus, el manejo se centra en la prevenci�n     " +
                                                  "\n de la deshidrataci�n mediante el consumo de l�quidos y soluciones de rehidrataci�n oral, en casos graves puede requerirse  " +
                                                  "\n la administraci�n de l�quidos intravenosos en el hospital, es fundamental seguir las indicaciones m�dicas y evitar el      " +
                                                  "\n consumo de alimentos irritantes. ALIMENTACI�N. Se recomienda el consumo de alimentos ricos en fibra y probi�ticos para     " +
                                                  "\n restaurar la flora intestinal, PL�TANO. Rico en potasio que ayuda a recuperar los electrolitos perdidos, aporta            " +
                                                  "\n aproximadamente el 10% de la ingesta diaria recomendada por cada 100 gramos. YOGURT NATURAL. Contiene probi�ticos          " +
                                                  "\n que ayudan a restaurar la flora intestinal, su consumo puede aportar hasta el 20% de la ingesta diaria recomendada         " +
                                                  "\n de probi�ticos. ZANAHORIA. Rica en vitamina A que ayuda a la regeneraci�n celular intestinal, aporta aproximadamente       " +
                                                  "\n el 56% de la ingesta diaria recomendada por cada 100 gramos. Este es solo un Diagn�stico predeterminado l�gico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n   " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el            " +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo          " +
                                                  "\n se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N. Es fundamental mantener una hidrataci�n adecuada para ayudar al cuerpo a eliminar la infecci�n      " +
                                                  "\n y reducir la fiebre, se recomienda el consumo de 2 a 2.5 litros de agua al d�a, adem�s de infusiones sin         " +
                                                  "\n az�car como t� verde o agua de jamaica para mejorar la circulaci�n, tambi�n se recomienda el consumo de agua     " +
                                                  "\n con miel y lim�n para aliviar la irritaci�n y fortalecer el sistema inmunol�gico. EJERCICIO. Se recomienda       " +
                                                  "\n actividad f�sica moderada como caminatas, nataci�n o yoga para mejorar la circulaci�n y fortalecer el sistema    " +
                                                  "\n inmunol�gico, adem�s ejercicios de movilidad pueden ayudar a reducir la inflamaci�n y mejorar la recuperaci�n,   " +
                                                  "\n es importante realizar ejercicio de manera constante y bajo supervisi�n m�dica. POSIBLE TRATAMIENTO. El          " +
                                                  "\n tratamiento suele incluir antibi�ticos como la ampicilina o gentamicina, adem�s pueden recetarse medicamentos    " +
                                                  "\n complementarios para aliviar los s�ntomas, tambi�n se recomienda el uso de probi�ticos para mejorar la flora     " +
                                                  "\n intestinal y reducir el riesgo de reinfecci�n, es fundamental seguir las indicaciones m�dicas y evitar el        " +
                                                  "\n consumo de alimentos contaminados. ALIMENTACI�N. Se recomienda el consumo de alimentos ricos en antioxidantes    " +
                                                  "\n y nutrientes esenciales para fortalecer el sistema inmunol�gico, AR�NDANOS. Ricos en antioxidantes que ayudan    " +
                                                  "\n a combatir infecciones, aportan aproximadamente el 25% de la ingesta diaria recomendada por cada 100 gramos.     " +
                                                  "\n AJO. Contiene compuestos antimicrobianos que pueden ayudar a combatir la infecci�n, su consumo puede aportar     " +
                                                  "\n hasta el 20% de la ingesta diaria recomendada de antioxidantes. JENGIBRE. Contiene propiedades antiinflamatorias " +
                                                  "\n que pueden ayudar a reducir los s�ntomas, su consumo puede aportar hasta el 15% de la ingesta diaria recomendada " +
                                                  "\n de antioxidantes. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que " +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se     " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de  " +
                                                  "\n su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho " +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tama�o regular)         " +
                                                  "\n para prevenir la deshidrataci�n causada por la diarrea y ayudar a eliminar toxinas. Tambi�n es recomendable          " +
                                                  "\n el consumo de soluciones de rehidrataci�n oral para reponer electrolitos perdidos, lo que ayuda a evitar             " +
                                                  "\n complicaciones como la fatiga extrema y el desequilibrio de minerales esenciales. EJERCICIO: Se aconseja evitar      " +
                                                  "\n actividad f�sica intensa mientras persistan los s�ntomas, ya que el cuerpo necesita conservar energ�a para           " +
                                                  "\n combatir la infecci�n. Sin embargo, una vez que los s�ntomas comiencen a mejorar, se recomienda caminatas suaves     " +
                                                  "\n de 15 a 30 minutos diarios para mejorar la circulaci�n, estimular el metabolismo y favorecer la recuperaci�n         " +
                                                  "\n intestinal. POSIBLE TRATAMIENTO: Para la shigelosis en mujeres j�venes, el tratamiento suele incluir antibi�ticos    " +
                                                  "\n como la azitromicina o la ciprofloxacina en casos graves. Tambi�n se recomienda el uso de soluciones de rehidrataci�n" +
                                                  "\n oral y una dieta adecuada para evitar complicaciones. Es fundamental seguir el tratamiento completo para evitar      " +
                                                  "\n reca�das y resistencia bacteriana. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en probi�ticos,         " +
                                                  "\n vitaminas y minerales esenciales para fortalecer el sistema digestivo y acelerar la recuperaci�n: Yogur natural:     " +
                                                  "\n Rico en probi�ticos, ayuda a restaurar la flora intestinal y mejorar la digesti�n. Pl�tanos: Contienen potasio,      " +
                                                  "\n esencial para reponer electrolitos perdidos y mejorar la funci�n muscular. Arroz y pan tostado: Son f�ciles de       " +
                                                  "\n digerir y ayudan a estabilizar el sistema digestivo. Zanahorias: Ricas en vitamina A, esenciales para la regeneraci�n" +
                                                  "\n celular y la recuperaci�n intestinal. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no       " +
                                                  "\n garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas," +
                                                  "\n para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento     " +
                                                  "\n adecuado de su paciente, adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se le       " +
                                                  "\n recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tama�o regular)            " +
                                                  "\n para mantener las v�as respiratorias hidratadas y reducir la viscosidad de las secreciones bronquiales. Tambi�n         " +
                                                  "\n es recomendable el consumo de infusiones calientes como t� de jengibre o manzanilla, que pueden ayudar a aliviar        " +
                                                  "\n la congesti�n y mejorar la respiraci�n. EJERCICIO: Se aconseja actividad f�sica moderada y adaptada a la capacidad      " +
                                                  "\n pulmonar de la paciente. Se recomienda ejercicios de respiraci�n profunda, caminatas de 30 minutos diarios y yoga       " +
                                                  "\n para mejorar la funci�n pulmonar y fortalecer los m�sculos respiratorios. Adem�s, el entrenamiento de resistencia       " +
                                                  "\n puede ser beneficioso para mejorar la capacidad aer�bica y reducir la fatiga. POSIBLE TRATAMIENTO: Para la EPOC en      " +
                                                  "\n mujeres j�venes, el tratamiento suele incluir broncodilatadores como el salbutamol, corticosteroides inhalados como     " +
                                                  "\n la fluticasona y en algunos casos, terapia de ox�geno. Tambi�n es fundamental evitar el tabaquismo y la exposici�n a    " +
                                                  "\n contaminantes, ya que estos factores pueden agravar la enfermedad. En algunos casos, se recomienda rehabilitaci�n       " +
                                                  "\n pulmonar para mejorar la calidad de vida y reducir la progresi�n de los s�ntomas. ALIMENTACI�N: Se recomienda el        " +
                                                  "\n consumo de alimentos con propiedades antioxidantes y antiinflamatorias para mejorar la funci�n pulmonar: Pescados       " +
                                                  "\n grasos (salm�n, at�n): Ricos en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias. Frutas y verduras      " +
                                                  "\n de colores vivos (ar�ndanos, fresas, espinacas, br�coli): Ricas en antioxidantes como la vitamina C y carotenoides,     " +
                                                  "\n que pueden proteger las c�lulas del da�o. Jengibre: Contiene compuestos con efectos antiinflamatorios que podr�an       " +
                                                  "\n ser beneficiosos para las v�as respiratorias. C�rcuma: Con su componente activo, la curcumina, tiene potentes           " +
                                                  "\n propiedades antiinflamatorias y antioxidantes. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado    " +
                                                  "\n no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas," +
                                                  "\n para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento        " +
                                                  "\n adecuado de su paciente, adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se le recomienda" +
                                                  "\n mucho consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia. " +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para        " +
                                                  "\n ayudar a eliminar toxinas y mantener la funci�n renal adecuada durante el tratamiento antibi�tico. Tambi�n es            " +
                                                  "\n recomendable el consumo de jugos naturales sin az�car y caldos ligeros para mejorar la hidrataci�n y fortalecer el       " +
                                                  "\n sistema inmunol�gico. EJERCICIO: Se aconseja actividad f�sica moderada, evitando esfuerzos excesivos mientras            " +
                                                  "\n persistan los s�ntomas. Se recomienda caminatas suaves de 30 minutos diarios para mejorar la circulaci�n y el            " +
                                                  "\n bienestar general. Adem�s, ejercicios de bajo impacto como yoga o pilates pueden ayudar a reducir el estr�s y mejorar    " +
                                                  "\n la recuperaci�n. POSIBLE TRATAMIENTO: Para la clamidia en mujeres j�venes, el tratamiento suele incluir antibi�ticos     " +
                                                  "\n como la azitromicina o la doxiciclina. Es fundamental completar el tratamiento para evitar complicaciones y reinfecciones. " +
                                                  "\n Tambi�n se recomienda evitar relaciones sexuales hasta que el tratamiento haya finalizado y la infecci�n haya sido       " +
                                                  "\n completamente erradicada. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes        " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico y ayudar a la recuperaci�n: Ajo: Contiene alicina, un compuesto       " +
                                                  "\n con propiedades antimicrobianas que puede ayudar a combatir infecciones. Frutas c�tricas (naranjas, limones, toronjas):  " +
                                                  "\n Ricas en vitamina C, esenciales para mejorar la respuesta inmune. Jengibre: Posee propiedades antiinflamatorias y        " +
                                                  "\n antioxidantes que pueden aliviar la inflamaci�n y mejorar la circulaci�n. Yogur natural: Rico en probi�ticos, ayuda      " +
                                                  "\n a restaurar la flora intestinal y fortalecer el sistema inmunol�gico. Este es solo un diagn�stico predeterminado l�gico, " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus          " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor         " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s, por su salud, si la respuesta del diagn�stico no le         " +
                                                  "\n satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida)   " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2.5 a 3 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda          " +
                                                  "\n a mantener el equilibrio del sistema nervioso y reducir la inflamaci�n de las meninges. Tambi�n es beneficioso         " +
                                                  "\n complementar con infusiones naturales como t� de manzanilla o jengibre, que poseen propiedades antiinflamatorias       " +
                                                  "\n y relajantes. EJERCICIO. La actividad f�sica moderada es clave para fortalecer el sistema inmunol�gico y mejorar       " +
                                                  "\n la circulaci�n sangu�nea. Se recomienda realizar ejercicio aer�bico moderado al menos 30 minutos al d�a, como          " +
                                                  "\n caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo. Tambi�n es beneficioso incluir ejercicios de           " +
                                                  "\n respiraci�n como yoga o t�cnicas de expansi�n pulmonar para mejorar la oxigenaci�n cerebral. POSIBLE TRATAMIENTO.      " +
                                                  "\n El tratamiento est�ndar incluye antibi�ticos como ceftriaxona, vancomicina y ampicilina, que ayudan a eliminar la      " +
                                                  "\n bacteria causante de la meningitis. En casos graves, se puede requerir hospitalizaci�n para administraci�n intravenosa " +
                                                  "\n de antibi�ticos y monitoreo de s�ntomas. Marcas reconocidas incluyen Rocephin, Vancocin y Principen, las cuales han    " +
                                                  "\n demostrado eficacia en el manejo de la enfermedad. Tambi�n es importante el uso de antiinflamatorios y analg�sicos     " +
                                                  "\n para reducir el dolor y la fiebre. ALIMENTACI�N. Para fortalecer el sistema inmunol�gico y reducir la inflamaci�n,     " +
                                                  "\n se recomienda consumir frutas c�tricas como naranja, lim�n y toronja, que son ricas en vitamina C, la cual contribuye  " +
                                                  "\n a la producci�n de gl�bulos blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento   " +
                                                  "\n diario por cada 100 gramos. Verduras cruc�feras como br�coli y coliflor, que contienen vitamina K y antioxidantes,     " +
                                                  "\n esenciales para la regeneraci�n celular y la protecci�n del sistema nervioso. Pescados grasos como salm�n y sardina,   " +
                                                  "\n que son ricos en Omega-3, el cual tiene propiedades antiinflamatorias y aporta alrededor del 50% del requerimiento     " +
                                                  "\n diario por porci�n de 100 gramos. Legumbres como lentejas y garbanzos, que son fuente de prote�nas y hierro, esenciales   " +
                                                  "\n para la energ�a y la regeneraci�n celular, aportando cerca del 40% del requerimiento diario por cada 100 gramos. Este es  " +
                                                  "\n solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad  " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar   " +
                                                  "\n a un m�dico especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2.5 a 3 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda         " +
                                                  "\n a mantener el equilibrio celular y mejorar la eliminaci�n de toxinas. Tambi�n es beneficioso complementar con         " +
                                                  "\n infusiones naturales como t� verde o c�rcuma, que poseen propiedades antioxidantes y anticancer�genas. EJERCICIO.     " +
                                                  "\n La actividad f�sica moderada es clave para fortalecer el sistema inmunol�gico y mejorar la salud cardiovascular.      " +
                                                  "\n Se recomienda realizar ejercicio aer�bico moderado al menos 30 minutos al d�a, como caminar, nadar o andar en         " +
                                                  "\n bicicleta, evitando el sobreesfuerzo. Tambi�n es beneficioso incluir ejercicios de resistencia como levantamiento     " +
                                                  "\n de pesas ligeras o yoga, que ayudan a mantener la masa muscular y reducir el estr�s. POSIBLE TRATAMIENTO. El          " +
                                                  "\n tratamiento est�ndar incluye quimioterapia, radioterapia y terapia dirigida, dependiendo del tipo y estadio del       " +
                                                  "\n c�ncer. En algunos casos, se puede recurrir a inmunoterapia, que ayuda al sistema inmunol�gico a combatir las c�lulas " +
                                                  "\n cancerosas. Marcas reconocidas incluyen Herceptin, Avastin, Keytruda y Opdivo, las cuales han demostrado eficacia en  " +
                                                  "\n el manejo de la enfermedad. Tambi�n es importante el uso de suplementos nutricionales para mantener la energ�a y      " +
                                                  "\n reducir los efectos secundarios del tratamiento. ALIMENTACI�N. Para fortalecer el sistema inmunol�gico y reducir la   " +
                                                  "\n inflamaci�n, se recomienda consumir frutas c�tricas como naranja, lim�n y toronja, que son ricas en vitamina C, la    " +
                                                  "\n cual contribuye a la producci�n de gl�bulos blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del" +
                                                  "\n requerimiento diario por cada 100 gramos. Verduras de hoja verde como espinaca y kale, que contienen �cido f�lico y   " +
                                                  "\n antioxidantes, esenciales para la regeneraci�n celular y la protecci�n contra el da�o oxidativo. Pescados grasos como " +
                                                  "\n salm�n y at�n, que son ricos en Omega-3, el cual tiene propiedades antiinflamatorias y aporta alrededor del 50% del   " +
                                                  "\n requerimiento diario por porci�n de 100 gramos. Frutos secos como almendras y nueces, que aportan vitamina E, la cual " +
                                                  "\n protege las c�lulas del da�o oxidativo y contribuye con el 70% del requerimiento diario por cada 30 gramos. Legumbres    " +
                                                  "\n como lentejas y garbanzos, que son fuente de prote�nas y hierro, esenciales para la energ�a y la regeneraci�n celular,   " +
                                                  "\n aportando cerca del 40% del requerimiento diario por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico. " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente   " +
                                                  "\n correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico especialista. Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.30-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para mantener    " +
                                                  "\n una hidrataci�n adecuada. Esto ayuda a reducir la congesti�n, mantener la mucosa respiratoria hidratada y favorecer la        " +
                                                  "\n eliminaci�n de toxinas. Tambi�n es recomendable el consumo de infusiones calientes como t� de jengibre o manzanilla para      " +
                                                  "\n aliviar la irritaci�n de garganta y mejorar la recuperaci�n. EJERCICIO: Se aconseja actividad f�sica moderada diariamente,    " +
                                                  "\n evitando esfuerzos excesivos mientras persistan los s�ntomas. Se recomienda al menos 30 minutos de ejercicio ligero, como     " +
                                                  "\n caminatas o estiramientos, lo cual ayuda a mejorar la circulaci�n, fortalecer el sistema inmune y promover una recuperaci�n   " +
                                                  "\n m�s efectiva. POSIBLE TRATAMIENTO: Para la gripe en mujeres j�venes, el tratamiento suele incluir medicamentos para reducir   " +
                                                  "\n la fiebre y aliviar los s�ntomas, como el paracetamol (Tempra) o el ibuprofeno. Tambi�n pueden utilizarse antivirales         " +
                                                  "\n espec�ficos contra la gripe, como el oseltamivir (Tamiflu), en casos m�s severos o bajo indicaci�n m�dica. ALIMENTACI�N:      " +
                                                  "\n Se recomienda el consumo de alimentos ricos en vitaminas, minerales y antioxidantes para fortalecer el sistema inmunol�gico   " +
                                                  "\n y combatir los s�ntomas de la gripe: Naranjas y mandarinas: Ricas en vitamina C (hasta un 89% del requerimiento diario por    " +
                                                  "\n cada 100g), esenciales para reducir la duraci�n de los s�ntomas y mejorar la respuesta inmune. Fresas y ar�ndanos: Contienen  " +
                                                  "\n antioxidantes y vitamina C (hasta un 65% del requerimiento diario en 100g de fresas) que protegen las c�lulas del da�o        " +
                                                  "\n causado por la infecci�n. Jengibre: Posee propiedades antiinflamatorias y antioxidantes que pueden aliviar la congesti�n      " +
                                                  "\n y el malestar general. Espinacas y br�coli: Ricos en vitamina A (hasta un 56% del requerimiento diario en 100g de espinaca)   " +
                                                  "\n y vitamina C (hasta un 107% del requerimiento diario en 100g de br�coli), esenciales para fortalecer el sistema inmunol�gico  " +
                                                  "\n y acelerar la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que    " +
                                                  "\n la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda       " +
                                                  "\n hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s,     " +
                                                  "\n por su salud, si la respuesta del diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico.         " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tama�o regular) para      " +
                                                  "\n mantener una hidrataci�n adecuada. Esto ayuda a fluidificar las secreciones pulmonares, facilitando su expulsi�n y     " +
                                                  "\n reduciendo la congesti�n respiratoria. Tambi�n es recomendable el consumo de caldos y sopas calientes para mejorar     " +
                                                  "\n la hidrataci�n y aliviar la irritaci�n de garganta. EJERCICIO: Se aconseja actividad f�sica ligera y progresiva,       " +
                                                  "\n evitando esfuerzos intensos mientras persistan los s�ntomas. Se recomienda caminatas suaves de 15 a 30 minutos         " +
                                                  "\n diarios para mejorar la oxigenaci�n y la recuperaci�n pulmonar. POSIBLE TRATAMIENTO: Para la neumon�a en mujeres       " +
                                                  "\n j�venes, el tratamiento suele incluir antibi�ticos en caso de infecci�n bacteriana, como la amoxicilina (Amoxil)       " +
                                                  "\n o la azitromicina. Tambi�n pueden utilizarse medicamentos para reducir la fiebre y aliviar los s�ntomas, como el       " +
                                                  "\n paracetamol o el ibuprofeno. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en vitaminas y minerales        " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico y mejorar la funci�n pulmonar: Naranjas y mandarinas: Ricas en      " +
                                                  "\n vitamina C (hasta un 89% del requerimiento diario por cada 100g), esenciales para mejorar la respuesta inmune.         " +
                                                  "\n Jengibre: Posee propiedades antiinflamatorias y antioxidantes que pueden aliviar la congesti�n. Espinacas y br�coli:   " +
                                                  "\n Ricos en vitamina A (hasta un 56% del requerimiento diario en 100g de espinaca) y vitamina C (hasta un 107% del        " +
                                                  "\n requerimiento diario en 100g de br�coli), esenciales para fortalecer el sistema inmunol�gico y acelerar la recuperaci�n.  " +
                                                  "\n Ajo: Contiene alicina, un compuesto con propiedades antimicrobianas que puede ayudar a combatir infecciones respiratorias. " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga     " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s      " +
                                                  "\n de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s,      " +
                                                  "\n por su salud, si la respuesta del diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico." +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para     " +
                                                  "\n mantener una hidrataci�n adecuada y ayudar a regular los niveles de glucosa en sangre. Tambi�n es recomendable el     " +
                                                  "\n consumo de infusiones sin az�car como t� verde o manzanilla para mejorar la digesti�n y el metabolismo. EJERCICIO:    " +
                                                  "\n Se aconseja actividad f�sica regular, como caminatas de 30 a 60 minutos diarios, ejercicios de resistencia o yoga,    " +
                                                  "\n lo cual ayuda a mejorar la sensibilidad a la insulina y controlar los niveles de az�car en sangre. POSIBLE            " +
                                                  "\n TRATAMIENTO: Para la diabetes en mujeres j�venes, el tratamiento suele incluir medicamentos para controlar la glucosa," +
                                                  "\n como la metformina (Glucophage) o insulina en casos espec�ficos. Tambi�n se recomienda el monitoreo constante de los  " +
                                                  "\n niveles de glucosa y una dieta equilibrada. ALIMENTACI�N: Se recomienda el consumo de alimentos con bajo �ndice       " +
                                                  "\n gluc�mico y ricos en nutrientes esenciales para el control de la diabetes: Aguacate: Rico en grasas saludables y      " +
                                                  "\n fibra, ayuda a estabilizar los niveles de glucosa. Frutos rojos (ar�ndanos, fresas): Contienen antioxidantes y        " +
                                                  "\n vitamina C (hasta un 65% del requerimiento diario en 100g de fresas), que pueden mejorar la sensibilidad a la insulina." +
                                                  "\n Espinacas y br�coli: Ricos en magnesio (hasta un 20% del requerimiento diario en 100g de espinaca), esencial para la   " +
                                                  "\n regulaci�n de la glucosa. Canela: Contiene compuestos que pueden mejorar la sensibilidad a la insulina y reducir los   " +
                                                  "\n niveles de az�car en sangre. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%" +
                                                  "\n que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se       " +
                                                  "\n recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su     " +
                                                  "\n paciente, adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se le recomienda mucho       " +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada y controlada, evitando factores desencadenantes como el aire fr�o,       " +
                                                  "\n la contaminaci�n y los al�rgenos. Ejercicios como nataci�n, yoga y caminatas suaves pueden mejorar la capacidad pulmonar    " +
                                                  "\n y reducir la inflamaci�n bronquial. Tambi�n se recomienda el uso de t�cnicas de respiraci�n profunda para fortalecer los    " +
                                                  "\n pulmones y mejorar la oxigenaci�n. HIDRATACI�N: Es fundamental el consumo de 2.5 a 3 litros de agua, aproximadamente 10 a   " +
                                                  "\n 12 vasos de tama�o regular, para mantener las v�as respiratorias hidratadas y facilitar la eliminaci�n de secreciones.      " +
                                                  "\n Tambi�n se recomienda el consumo de l�quidos tibios como infusiones de jengibre o miel para aliviar la irritaci�n de la     " +
                                                  "\n garganta y mejorar la expectoraci�n. POSIBLE TRATAMIENTO: El asma se trata con broncodilatadores de alivio r�pido como      " +
                                                  "\n salbutamol, corticosteroides inhalados como fluticasona y modificadores de leucotrienos como montelukast. Algunas marcas    " +
                                                  "\n reconocidas son Ventolin (salbutamol), Flixotide (fluticasona) y Singulair (montelukast). Tambi�n se recomienda el          " +
                                                  "\n seguimiento de un plan de acci�n para el asma indicado por el m�dico y el uso regular de medicamentos preventivos.          " +
                                                  "\n ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema inmunol�gico y mejorar la funci�n pulmonar, se recomienda el           " +
                                                  "\n consumo de alimentos ricos en vitaminas y minerales esenciales. PESCADOS GRASOS (salm�n, at�n): Fuente de OMEGA-3,          " +
                                                  "\n con propiedades antiinflamatorias, proporcionando aproximadamente 2.2 gramos por cada 100 gramos de pescado. FRUTAS         " +
                                                  "\n C�TRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema inmune, aportando aproximadamente     " +
                                                  "\n 89% del requerimiento diario por cada 100 gramos. JENGIBRE: Contiene compuestos con efectos antiinflamatorios que pueden    " +
                                                  "\n ayudar a aliviar la irritaci�n de las v�as respiratorias, proporcionando 5% del requerimiento diario de antioxidantes por   " +
                                                  "\n cada 10 gramos. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que la paciente  " +
                                                  "\n tenga asma ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico para mayor seguridad y, por  " +
                                                  "\n su salud, consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada para fortalecer el sistema inmunol�gico y mejorar la calidad de vida.   " +
                                                  "\n Ejercicios como caminatas, yoga y entrenamiento de resistencia pueden ayudar a mantener la masa muscular y reducir la      " +
                                                  "\n fatiga. Tambi�n se recomienda ejercicios de relajaci�n para reducir el estr�s y mejorar el bienestar emocional.            " +
                                                  "\n HIDRATACI�N: Es esencial el consumo de 2.5 a 3 litros de agua, aproximadamente 10 a 12 vasos de tama�o regular, para       " +
                                                  "\n facilitar la eliminaci�n de toxinas y mejorar la funci�n celular. Mantener una hidrataci�n adecuada tambi�n contribuye     " +
                                                  "\n a la absorci�n de nutrientes esenciales y al fortalecimiento del sistema inmunol�gico. POSIBLE TRATAMIENTO: El VIH/SIDA    " +
                                                  "\n se trata con terapia antirretroviral (TAR), que incluye medicamentos como tenofovir, emtricitabina y dolutegravir.         " +
                                                  "\n Algunas marcas reconocidas son Truvada (tenofovir/emtricitabina) y Tivicay (dolutegravir). Es fundamental seguir el        " +
                                                  "\n tratamiento de manera estricta para evitar la progresi�n de la enfermedad y mejorar la calidad de vida. ALIMENTACI�N       " +
                                                  "\n RECOMENDADA: Para fortalecer el sistema inmunol�gico y mejorar la recuperaci�n, se recomienda el consumo de alimentos      " +
                                                  "\n ricos en vitaminas y minerales esenciales. FRUTAS C�TRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que         " +
                                                  "\n fortalece el sistema inmune, aportando aproximadamente 89% del requerimiento diario por cada 100 gramos. PESCADOS          " +
                                                  "\n GRASOS (salm�n, at�n): Fuente de OMEGA-3, con propiedades antiinflamatorias, proporcionando aproximadamente 2.2 gramos     " +
                                                  "\n por cada 100 gramos de pescado. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales      " +
                                                  "\n para la regeneraci�n celular y la funci�n muscular, aportando cerca del 15% del requerimiento diario por cada 100 gramos.  " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que la paciente tenga VIH/SIDA  " +
                                                  "\n ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico para mayor seguridad y, por su salud,  " +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada para mejorar la circulaci�n y fortalecer el sistema inmunol�gico.   " +
                                                  "\n Ejercicios como caminatas, nataci�n y estiramientos pueden ser beneficiosos para la recuperaci�n. Tambi�n se           " +
                                                  "\n recomienda ejercicios de resistencia moderada para mejorar la funci�n muscular y reducir la fatiga. HIDRATACI�N:       " +
                                                  "\n Es esencial el consumo de 2.5 a 3 litros de agua, aproximadamente 10 a 12 vasos de tama�o regular, para facilitar      " +
                                                  "\n la eliminaci�n de toxinas y mejorar la funci�n celular. Mantener una hidrataci�n adecuada tambi�n contribuye a la      " +
                                                  "\n regeneraci�n de tejidos y ayuda a reducir la inflamaci�n. POSIBLE TRATAMIENTO: La gonorrea se trata con antibi�ticos   " +
                                                  "\n como ceftriaxona y azitromicina. Algunas marcas reconocidas son Rocephin (ceftriaxona) y Zithromax (azitromicina).     " +
                                                  "\n Es fundamental seguir el tratamiento indicado por el m�dico y realizar pruebas de seguimiento para asegurar la         " +
                                                  "\n eliminaci�n de la infecci�n. ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema inmunol�gico y mejorar la            " +
                                                  "\n recuperaci�n, se recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales. FRUTAS C�TRICAS         " +
                                                  "\n (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema inmune, aportando aproximadamente 89%     " +
                                                  "\n del requerimiento diario por cada 100 gramos. PESCADOS GRASOS (salm�n, at�n): Fuente de OMEGA-3, con propiedades       " +
                                                  "\n antiinflamatorias, proporcionando aproximadamente 2.2 gramos por cada 100 gramos de pescado. VEGETALES DE HOJA VERDE   " +
                                                  "\n (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales para la regeneraci�n celular y la funci�n muscular,      " +
                                                  "\n aportando cerca del 15% del requerimiento diario por cada 100 gramos. Este es solo un diagn�stico predeterminado       " +
                                                  "\n l�gico. Haberlo consultado no garantiza al 100% que la paciente tenga gonorrea ni que el tratamiento sea el adecuado.  " +
                                                  "\n Se recomienda realizar m�s de un diagn�stico para mayor seguridad y, por su salud, consultar a su m�dico. Angel L      " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al d�a (aproximadamente ocho         " +
                                                  "\n a diez vasos de agua de tama�o regular) para mantener la hidrataci�n celular y ayudar al cuerpo a combatir el virus.     " +
                                                  "\n Tambi�n se recomienda el consumo de l�quidos ricos en antioxidantes como t� verde o infusiones de manzanilla para        " +
                                                  "\n mejorar la respuesta inmunol�gica. EJERCICIO: Se recomienda actividad f�sica moderada, evitando el sobreesfuerzo         " +
                                                  "\n durante los brotes. Ejercicios como yoga, pilates y caminatas suaves pueden ayudar a reducir el estr�s, que es un        " +
                                                  "\n factor desencadenante de los brotes de herpes. POSIBLE TRATAMIENTO: El tratamiento para el herpes genital suele          " +
                                                  "\n incluir antivirales como aciclovir, valaciclovir o famciclovir, que ayudan a reducir la duraci�n y severidad de          " +
                                                  "\n los brotes. Marcas reconocidas incluyen Zovirax y Valtrex. Tambi�n se recomienda el uso de cremas t�picas para           " +
                                                  "\n aliviar el dolor y la inflamaci�n, as� como el fortalecimiento del sistema inmunol�gico mediante una dieta equilibrada   " +
                                                  "\n y el manejo del estr�s. ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema inmunol�gico y ayudar en la recuperaci�n,   " +
                                                  "\n se recomienda el consumo de FRUTAS C�TRICAS como naranja y toronja, ricas en VITAMINA C, que fortalece el sistema        " +
                                                  "\n inmune y aporta cerca del 89% del requerimiento diario por cada 100 g. AR�NDANOS, ricos en ANTIOXIDANTES, que ayudan     " +
                                                  "\n a reducir la inflamaci�n y aportan aproximadamente el 50% del requerimiento diario de VITAMINA C por cada 100 g. AJO,    " +
                                                  "\n con propiedades ANTIVIRALES, que pueden ayudar a combatir el virus y fortalecer el sistema inmunol�gico. ESPINACA,       " +
                                                  "\n fuente de HIERRO y VITAMINA E, que ayuda a mejorar la regeneraci�n celular y aporta aproximadamente el 15% del           " +
                                                  "\n requerimiento diario de HIERRO por cada 100 g. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado     " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se        " +
                                                  "\n recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si      " +
                                                  "\n la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece      " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al d�a (aproximadamente ocho       " +
                                                  "\n a diez vasos de agua de tama�o regular) para ayudar al cuerpo a eliminar la bacteria y prevenir la deshidrataci�n      " +
                                                  "\n causada por fiebre y malestar. Tambi�n se recomienda el consumo de l�quidos ricos en electrolitos como agua de coco    " +
                                                  "\n o caldos naturales para mejorar la recuperaci�n. EJERCICIO: Se recomienda reposo moderado mientras persistan los       " +
                                                  "\n s�ntomas, evitando esfuerzos f�sicos intensos. Sin embargo, una vez recuperada, se pueden realizar ejercicios de       " +
                                                  "\n bajo impacto como yoga o estiramientos suaves para mejorar la circulaci�n y fortalecer el sistema inmunol�gico.        " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la s�filis suele incluir antibi�ticos como la penicilina G benzatina, que     " +
                                                  "\n es el tratamiento de primera l�nea. Marcas reconocidas incluyen Benzetacil. En casos de alergia a la penicilina, se    " +
                                                  "\n pueden utilizar alternativas como doxiciclina o azitromicina. Es fundamental completar el tratamiento indicado por el  " +
                                                  "\n m�dico para evitar complicaciones y recurrencias. ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema inmunol�gico    " +
                                                  "\n y ayudar en la recuperaci�n, se recomienda el consumo de YOGUR NATURAL, rico en PROBI�TICOS, que favorecen la          " +
                                                  "\n recuperaci�n intestinal y aportan aproximadamente 10^9 UFC por cada 100 g. AJO, con propiedades ANTIBACTERIANAS,       " +
                                                  "\n que pueden ayudar a combatir la infecci�n y aporta compuestos bioactivos como alicina. ESPINACA, fuente de VITAMINA C  " +
                                                  "\n y HIERRO, que fortalece el sistema inmune y aporta cerca del 15% del requerimiento diario de HIERRO por cada 100 g.    " +
                                                  "\n FRUTOS ROJOS, ricos en ANTIOXIDANTES, que ayudan a reducir la inflamaci�n y aportan aproximadamente el 50% del         " +
                                                  "\n requerimiento diario de VITAMINA C por cada 100 g. Este es solo un diagn�stico predeterminado l�gico. Haberlo          " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente         " +
                                                  "\n correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s,       " +
                                                  "\n por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.           " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2.5 a 3 litros de agua al d�a (aproximadamente diez          " +
                                                  "\n a doce vasos de agua de tama�o regular) para mantener la hidrataci�n de las v�as respiratorias y ayudar al cuerpo         " +
                                                  "\n a eliminar la bacteria. Tambi�n se recomienda el consumo de l�quidos tibios como t� de jengibre o caldos naturales        " +
                                                  "\n para mejorar la funci�n pulmonar. EJERCICIO: Se recomienda reposo absoluto mientras persistan los s�ntomas, evitando      " +
                                                  "\n cualquier actividad f�sica intensa. Una vez recuperada, se pueden realizar ejercicios de respiraci�n y fortalecimiento    " +
                                                  "\n pulmonar para mejorar la capacidad respiratoria y reducir la fatiga. Tambi�n es recomendable evitar ambientes con humo    " +
                                                  "\n o contaminaci�n que puedan agravar los s�ntomas. POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis suele incluir   " +
                                                  "\n una combinaci�n de antibi�ticos como isoniazida, rifampicina, etambutol y pirazinamida, administrados durante un per�odo  " +
                                                  "\n de seis meses o m�s. Estos medicamentos est�n disponibles en el sistema de salud p�blica. Es fundamental seguir el        " +
                                                  "\n tratamiento de manera estricta para evitar la resistencia bacteriana y garantizar la recuperaci�n completa. ALIMENTACI�N  " +
                                                  "\n RECOMENDADA: Para fortalecer el sistema respiratorio y reducir la inflamaci�n, se recomienda el consumo de FRUTAS C�TRICAS" +
                                                  "\n como naranja y toronja, ricas en VITAMINA C, que fortalece el sistema inmune y aporta cerca del 89% del requerimiento     " +
                                                  "\n diario por cada 100 g. PESCADOS GRASOS como salm�n y at�n, ricos en �CIDOS GRASOS OMEGA-3, que poseen propiedades         " +
                                                  "\n antiinflamatorias y aportan aproximadamente el 50% del requerimiento diario por cada 100 g. ESPINACA, fuente de HIERRO    " +
                                                  "\n y ANTIOXIDANTES, que ayudan a mejorar la oxigenaci�n celular y aportan aproximadamente el 15% del requerimiento diario    " +
                                                  "\n de HIERRO por cada 100 g. JENGIBRE, con propiedades ANTIINFLAMATORIAS y antioxidantes, que pueden aliviar s�ntomas        " +
                                                  "\n respiratorios y mejorar la funci�n pulmonar. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado        " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se         " +
                                                  "\n recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si       " +
                                                  "\n la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece       " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N. Es fundamental mantener una hidrataci�n adecuada para reducir la inflamaci�n y mejorar la movilidad     " +
                                                  "\n articular, se recomienda el consumo de 2 a 2.5 litros de agua al d�a, adem�s de infusiones naturales como t� de      " +
                                                  "\n c�rcuma o jengibre para sus propiedades antiinflamatorias, tambi�n se recomienda el consumo de agua con lim�n        " +
                                                  "\n para aportar vitamina C y fortalecer el sistema inmunol�gico. EJERCICIO. Se recomienda actividad f�sica moderada     " +
                                                  "\n como ejercicios de bajo impacto, nataci�n, yoga o pilates para mejorar la movilidad y reducir la rigidez articular,  " +
                                                  "\n adem�s ejercicios de fortalecimiento muscular pueden ayudar a proteger las articulaciones y mejorar la calidad de    " +
                                                  "\n vida, es importante realizarlo bajo supervisi�n m�dica y ajustar la intensidad seg�n la tolerancia del paciente.     " +
                                                  "\n POSIBLE TRATAMIENTO. El tratamiento suele incluir antiinflamatorios no esteroideos como el ibuprofeno (Advil) y      " +
                                                  "\n corticosteroides en casos m�s severos, adem�s pueden recetarse medicamentos modificadores de la enfermedad como      " +
                                                  "\n el metotrexato o la sulfasalazina, tambi�n se recomienda la fisioterapia para mejorar la movilidad y reducir el      " +
                                                  "\n dolor, es fundamental seguir las indicaciones m�dicas y evitar la automedicaci�n. ALIMENTACI�N. Se recomienda el     " +
                                                  "\n consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer las articulaciones, C�RCUMA.     " +
                                                  "\n Contiene curcumina con propiedades antiinflamatorias y antioxidantes, su consumo puede aportar hasta el 20% de la    " +
                                                  "\n ingesta diaria recomendada de antioxidantes. PESCADO GRASO (SALM�N, AT�N). Rico en Omega-3 que puede ayudar a        " +
                                                  "\n reducir la inflamaci�n articular, aporta aproximadamente el 50% de la ingesta diaria recomendada de Omega-3 por      " +
                                                  "\n cada 100 gramos. ESPINACA. Rica en vitamina K que ayuda a fortalecer los huesos y reducir la inflamaci�n, aporta     " +
                                                  "\n aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos. Este es solo un Diagn�stico predeterminado " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad   " +
                                                  "\n y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer    " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no   " +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app      " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N. Es crucial mantener una hidrataci�n adecuada para aliviar la irritaci�n de las v�as respiratorias y       " +
                                                  "\n reducir la tos, se recomienda el consumo de 2.5 a 3 litros de agua al d�a, adem�s de infusiones calientes como t�      " +
                                                  "\n de tomillo o miel con lim�n para calmar la garganta y reducir la inflamaci�n, tambi�n se recomienda el consumo de      " +
                                                  "\n agua con jengibre para sus propiedades antimicrobianas. EJERCICIO. Se recomienda actividad f�sica ligera como          " +
                                                  "\n ejercicios de respiraci�n profunda y expansi�n pulmonar para mejorar la oxigenaci�n y reducir la fatiga, adem�s        " +
                                                  "\n caminatas cortas pueden ayudar a fortalecer el sistema inmunol�gico, es importante evitar esfuerzos excesivos          " +
                                                  "\n mientras persistan los s�ntomas y realizar el ejercicio bajo supervisi�n m�dica. POSIBLE TRATAMIENTO. El tratamiento   " +
                                                  "\n suele incluir antibi�ticos como la azitromicina o eritromicina para eliminar la bacteria causante de la enfermedad,    " +
                                                  "\n adem�s pueden recetarse broncodilatadores para mejorar la funci�n pulmonar y reducir la tos, tambi�n se recomienda     " +
                                                  "\n la vacunaci�n para prevenir futuros contagios, es fundamental seguir las indicaciones m�dicas y evitar la automedicaci�n. " +
                                                  "\n ALIMENTACI�N. Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer      " +
                                                  "\n el sistema respiratorio, TOMILLO. Contiene compuestos con propiedades antimicrobianas y ayuda a aliviar la inflamaci�n  " +
                                                  "\n pulmonar, su consumo puede aportar hasta el 15% de la ingesta diaria recomendada de antioxidantes. JENGIBRE. Contiene   " +
                                                  "\n propiedades antiinflamatorias que pueden ayudar a reducir los s�ntomas, su consumo puede aportar hasta el 20% de la     " +
                                                  "\n ingesta diaria recomendada de antioxidantes. MIEL. Posee propiedades antimicrobianas y ayuda a calmar la garganta,      " +
                                                  "\n aporta cerca del 10% de la ingesta diaria recomendada de antioxidantes por cada cucharada. Este es solo un Diagn�stico  " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la   " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para        " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app  " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N. Es fundamental mantener una hidrataci�n adecuada para reducir la fiebre y aliviar la inflamaci�n de las    " +
                                                  "\n gl�ndulas salivales, se recomienda el consumo de 2 a 2.5 litros de agua al d�a, adem�s de infusiones sin az�car como    " +
                                                  "\n t� verde o agua de coco para mejorar la circulaci�n, tambi�n se recomienda el consumo de agua con miel y lim�n para     " +
                                                  "\n aliviar la irritaci�n y fortalecer el sistema inmunol�gico. EJERCICIO. Se recomienda actividad f�sica moderada como     " +
                                                  "\n caminatas, nataci�n o yoga para mejorar la circulaci�n y fortalecer el sistema inmunol�gico, adem�s ejercicios de       " +
                                                  "\n movilidad pueden ayudar a reducir la inflamaci�n y mejorar la recuperaci�n, es importante realizar ejercicio de manera  " +
                                                  "\n constante y bajo supervisi�n m�dica. POSIBLE TRATAMIENTO. No existe un tratamiento espec�fico para las paperas, el      " +
                                                  "\n manejo se centra en aliviar los s�ntomas mediante el consumo de analg�sicos como el paracetamol o ibuprofeno para       " +
                                                  "\n reducir la fiebre y el dolor, adem�s se recomienda reposo, ingesta de abundantes l�quidos y alimentaci�n de consistencia" +
                                                  "\n blanda para facilitar la recuperaci�n, es fundamental seguir las indicaciones m�dicas y evitar la automedicaci�n.       " +
                                                  "\n ALIMENTACI�N. Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer      " +
                                                  "\n el sistema inmunol�gico, AR�NDANOS. Ricos en antioxidantes que ayudan a combatir infecciones, aportan aproximadamente   " +
                                                  "\n el 25% de la ingesta diaria recomendada por cada 100 gramos. AJO. Contiene compuestos antimicrobianos que pueden ayudar " +
                                                  "\n a combatir la infecci�n, su consumo puede aportar hasta el 20% de la ingesta diaria recomendada de antioxidantes.       " +
                                                  "\n JENGIBRE. Contiene propiedades antiinflamatorias que pueden ayudar a reducir los s�ntomas, su consumo puede aportar     " +
                                                  "\n hasta el 15% de la ingesta diaria recomendada de antioxidantes. Este es solo un Diagn�stico predeterminado l�gico,      " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el    " +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le  " +
                                                  "\n recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2.5 a 3 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda a reducir     " +
                                                  "\n la fiebre y prevenir la deshidrataci�n causada por la enfermedad. Tambi�n es beneficioso complementar con infusiones        " +
                                                  "\n naturales como t� de manzanilla o jengibre, que poseen propiedades antiinflamatorias y relajantes. EJERCICIO. La actividad  " +
                                                  "\n f�sica moderada es clave para fortalecer el sistema inmunol�gico y mejorar la circulaci�n sangu�nea. Se recomienda realizar " +
                                                  "\n ejercicio aer�bico moderado al menos 30 minutos al d�a, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo." +
                                                  "\n Tambi�n es beneficioso incluir ejercicios de respiraci�n como yoga o t�cnicas de expansi�n pulmonar para mejorar la         " +
                                                  "\n oxigenaci�n celular. POSIBLE TRATAMIENTO. No existe un tratamiento antiviral espec�fico para el Zika, por lo que el         " +
                                                  "\n manejo es sintom�tico. Se recomienda el uso de antiinflamatorios no esteroideos como paracetamol para reducir la fiebre     " +
                                                  "\n y el dolor muscular. Tambi�n se pueden administrar antihistam�nicos para controlar el prurito asociado con el exantema.     " +
                                                  "\n ALIMENTACI�N. Para fortalecer el sistema inmunol�gico y reducir la inflamaci�n, se recomienda consumir frutas c�tricas      " +
                                                  "\n como naranja, lim�n y toronja, que son ricas en vitamina C, la cual contribuye a la producci�n de gl�bulos blancos y        " +
                                                  "\n mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento diario por cada 100 gramos. Verduras de      " +
                                                  "\n hoja verde como espinaca y acelga, que contienen �cido f�lico, esencial para la producci�n de c�lulas sangu�neas. Pescados  " +
                                                  "\n grasos como salm�n y sardina, que son ricos en Omega-3, el cual tiene propiedades antiinflamatorias. Frutos secos como      " +
                                                  "\n almendras y nueces, que aportan vitamina E, la cual protege las c�lulas del da�o oxidativo. Legumbres como lentejas y       " +
                                                  "\n garbanzos, que son fuente de prote�nas y hierro, esenciales para la energ�a y la regeneraci�n celular. Este es solo un      " +
                                                  "\n diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que     " +
                                                  "\n las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico" +
                                                  "\n especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 3 a 3.5 litros de agua al d�a, ya que la hidrataci�n adecuada es fundamental    " +
                                                  "\n para prevenir la deshidrataci�n causada por la diarrea y el v�mito. Tambi�n es beneficioso complementar con soluciones   " +
                                                  "\n de rehidrataci�n oral como Pedialyte, que ayudan a reponer los electrolitos perdidos. EJERCICIO. Durante la enfermedad,  " +
                                                  "\n se recomienda evitar el ejercicio intenso y priorizar el descanso. Sin embargo, una vez recuperado, se puede retomar la  " +
                                                  "\n actividad f�sica moderada para fortalecer el sistema inmunol�gico. POSIBLE TRATAMIENTO. No existe un tratamiento         " +
                                                  "\n antiviral espec�fico para el rotavirus, por lo que el manejo es sintom�tico. Se recomienda el uso de l�quidos de         " +
                                                  "\n rehidrataci�n oral, as� como una dieta blanda para reducir la irritaci�n intestinal. En casos graves, puede ser          " +
                                                  "\n necesaria la administraci�n de l�quidos intravenosos en un hospital. ALIMENTACI�N. Para fortalecer el sistema inmunol�gico " +
                                                  "\n y reducir la inflamaci�n, se recomienda consumir pl�tanos, que son ricos en potasio, esencial para la recuperaci�n       " +
                                                  "\n de electrolitos. Arroz y pan integral, que ayudan a estabilizar el sistema digestivo. Yogur natural, que contiene        " +
                                                  "\n probi�ticos, beneficiosos para la recuperaci�n de la flora intestinal. Frutas c�tricas como naranja y toronja, que       " +
                                                  "\n aportan vitamina C para fortalecer el sistema inmunol�gico. Verduras de hoja verde como espinaca y acelga, que contienen " +
                                                  "\n �cido f�lico, esencial para la producci�n de c�lulas sangu�neas. Este es solo un diagn�stico predeterminado l�gico.      " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente   " +
                                                  "\n correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico especialista. Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2.5 a 3 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda     " +
                                                  "\n a eliminar toxinas y mejorar la circulaci�n sangu�nea. Tambi�n es beneficioso complementar con infusiones         " +
                                                  "\n naturales como t� de manzanilla o jengibre, que poseen propiedades antibacterianas y relajantes. EJERCICIO.       " +
                                                  "\n La actividad f�sica moderada es clave para fortalecer el sistema inmunol�gico y mejorar la circulaci�n            " +
                                                  "\n sangu�nea. Se recomienda realizar ejercicio aer�bico moderado al menos 30 minutos al d�a, como caminar,           " +
                                                  "\n nadar o andar en bicicleta, evitando el sobreesfuerzo. Tambi�n es beneficioso incluir ejercicios de respiraci�n   " +
                                                  "\n como yoga o t�cnicas de expansi�n pulmonar para mejorar la oxigenaci�n celular. POSIBLE TRATAMIENTO. El           " +
                                                  "\n tratamiento est�ndar incluye antibi�ticos como ampicilina y gentamicina, que ayudan a eliminar la bacteria        " +
                                                  "\n Listeria monocytogenes. En casos graves, se puede requerir hospitalizaci�n para administraci�n intravenosa        " +
                                                  "\n de antibi�ticos y monitoreo de s�ntomas. ALIMENTACI�N. Para fortalecer el sistema inmunol�gico y reducir la       " +
                                                  "\n inflamaci�n, se recomienda consumir frutas c�tricas como naranja, lim�n y toronja, que son ricas en vitamina C,   " +
                                                  "\n la cual contribuye a la producci�n de gl�bulos blancos y mejora la respuesta inmune. Verduras cruc�feras como     " +
                                                  "\n br�coli y coliflor, que contienen vitamina K y antioxidantes, esenciales para la regeneraci�n celular y la        " +
                                                  "\n protecci�n del sistema nervioso. Pescados grasos como salm�n y sardina, que son ricos en Omega-3, el cual tiene   " +
                                                  "\n propiedades antiinflamatorias. Legumbres como lentejas y garbanzos, que son fuente de prote�nas y hierro,         " +
                                                  "\n esenciales para la energ�a y la regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico. Haberlo  " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente    " +
                                                  "\n correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico especialista. Angel    " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tama�o regular) para     " +
                                                  "\n prevenir la deshidrataci�n causada por la diarrea y ayudar a eliminar toxinas. Tambi�n es recomendable el consumo     " +
                                                  "\n de soluciones de rehidrataci�n oral para reponer electrolitos perdidos, lo que ayuda a evitar complicaciones como     " +
                                                  "\n la fatiga extrema y el desequilibrio de minerales esenciales. EJERCICIO: Se aconseja evitar actividad f�sica intensa  " +
                                                  "\n mientras persistan los s�ntomas, ya que el cuerpo necesita conservar energ�a para combatir la infecci�n. Sin embargo, " +
                                                  "\n una vez que los s�ntomas comiencen a mejorar, se recomienda caminatas suaves de 15 a 30 minutos diarios para mejorar  " +
                                                  "\n la circulaci�n, estimular el metabolismo y favorecer la recuperaci�n intestinal. POSIBLE TRATAMIENTO: Para la         " +
                                                  "\n shigelosis en mujeres j�venes, el tratamiento suele incluir antibi�ticos como la azitromicina o la ciprofloxacina     " +
                                                  "\n en casos graves. Tambi�n se recomienda el uso de soluciones de rehidrataci�n oral y una dieta adecuada para evitar    " +
                                                  "\n complicaciones. Es fundamental seguir el tratamiento completo para evitar reca�das y resistencia bacteriana.          " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en probi�ticos, vitaminas y minerales esenciales para       " +
                                                  "\n fortalecer el sistema digestivo y acelerar la recuperaci�n: Yogur natural: Rico en probi�ticos, ayuda a restaurar     " +
                                                  "\n la flora intestinal y mejorar la digesti�n. Pl�tanos: Contienen potasio, esencial para reponer electrolitos perdidos  " +
                                                  "\n y mejorar la funci�n muscular. Arroz y pan tostado: Son f�ciles de digerir y ayudan a estabilizar el sistema digestivo. " +
                                                  "\n Zanahorias: Ricas en vitamina A, esenciales para la regeneraci�n celular y la recuperaci�n intestinal. Este es solo un  " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que   " +
                                                  "\n por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s, por su salud, si la respuesta del    " +
                                                  "\n diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita   " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tama�o regular)         " +
                                                  "\n para mantener las v�as respiratorias hidratadas y reducir la viscosidad de las secreciones bronquiales. Tambi�n      " +
                                                  "\n es recomendable el consumo de infusiones calientes como t� de jengibre o manzanilla, que pueden ayudar a aliviar     " +
                                                  "\n la congesti�n y mejorar la respiraci�n. EJERCICIO: Se aconseja actividad f�sica moderada y adaptada a la             " +
                                                  "\n capacidad pulmonar de la paciente. Se recomienda ejercicios de respiraci�n profunda, caminatas de 30 minutos         " +
                                                  "\n diarios y yoga para mejorar la funci�n pulmonar y fortalecer los m�sculos respiratorios. Adem�s, el entrenamiento    " +
                                                  "\n de resistencia puede ser beneficioso para mejorar la capacidad aer�bica y reducir la fatiga. POSIBLE TRATAMIENTO:    " +
                                                  "\n Para la EPOC en mujeres j�venes, el tratamiento suele incluir broncodilatadores como el salbutamol, corticosteroides " +
                                                  "\n inhalados como la fluticasona y en algunos casos, terapia de ox�geno. Tambi�n es fundamental evitar el tabaquismo    " +
                                                  "\n y la exposici�n a contaminantes, ya que estos factores pueden agravar la enfermedad. En algunos casos, se            " +
                                                  "\n recomienda rehabilitaci�n pulmonar para mejorar la calidad de vida y reducir la progresi�n de los s�ntomas.          " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antioxidantes y antiinflamatorias para           " +
                                                  "\n mejorar la funci�n pulmonar: Pescados grasos (salm�n, at�n): Ricos en �cidos grasos Omega-3, que poseen              " +
                                                  "\n propiedades antiinflamatorias. Frutas y verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli):           " +
                                                  "\n Ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las c�lulas del da�o. Jengibre:        " +
                                                  "\n Contiene compuestos con efectos antiinflamatorios que podr�an ser beneficiosos para las v�as respiratorias.          " +
                                                  "\n C�rcuma: Con su componente activo, la curcumina, tiene potentes propiedades antiinflamatorias y antioxidantes.       " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga     " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de   " +
                                                  "\n un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s, por su  " +
                                                  "\n salud, si la respuesta del diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico.       " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular)       " +
                                                  "\n para ayudar a eliminar toxinas y mantener la funci�n renal adecuada durante el tratamiento antibi�tico. Tambi�n    " +
                                                  "\n es recomendable el consumo de jugos naturales sin az�car y caldos ligeros para mejorar la hidrataci�n y            " +
                                                  "\n fortalecer el sistema inmunol�gico. EJERCICIO: Se aconseja actividad f�sica moderada, evitando esfuerzos           " +
                                                  "\n excesivos mientras persistan los s�ntomas. Se recomienda caminatas suaves de 30 minutos diarios para mejorar       " +
                                                  "\n la circulaci�n y el bienestar general. Adem�s, ejercicios de bajo impacto como yoga o pilates pueden ayudar        " +
                                                  "\n a reducir el estr�s y mejorar la recuperaci�n. POSIBLE TRATAMIENTO: Para la clamidia en mujeres j�venes, el        " +
                                                  "\n tratamiento suele incluir antibi�ticos como la azitromicina o la doxiciclina. Es fundamental completar el          " +
                                                  "\n tratamiento para evitar complicaciones y reinfecciones. Tambi�n se recomienda evitar relaciones sexuales hasta     " +
                                                  "\n que el tratamiento haya finalizado y la infecci�n haya sido completamente erradicada. ALIMENTACI�N: Se recomienda  " +
                                                  "\n el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico y   " +
                                                  "\n ayudar a la recuperaci�n: Ajo: Contiene alicina, un compuesto con propiedades antimicrobianas que puede ayudar a   " +
                                                  "\n combatir infecciones. Frutas c�tricas (naranjas, limones, toronjas): Ricas en vitamina C, esenciales para mejorar  " +
                                                  "\n la respuesta inmune. Jengibre: Posee propiedades antiinflamatorias y antioxidantes que pueden aliviar la inflamaci�n  " +
                                                  "\n y mejorar la circulaci�n. Yogur natural: Rico en probi�ticos, ayuda a restaurar la flora intestinal y fortalecer      " +
                                                  "\n el sistema inmunol�gico. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%   " +
                                                  "\n que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se      " +
                                                  "\n recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su    " +
                                                  "\n paciente, adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se le recomienda mucho      " +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo absoluto para evitar complicaciones        " +
                                                  "\n neurol�gicas. Una vez superada la etapa cr�tica, se pueden realizar ejercicios de movilidad y fortalecimiento      " +
                                                  "\n muscular para recuperar la funci�n motora y mejorar la circulaci�n. HIDRATACI�N: Es fundamental el consumo de      " +
                                                  "\n 2.5 a 3 litros de agua, aproximadamente 10 a 12 vasos de tama�o regular, para mantener la hidrataci�n celular      " +
                                                  "\n y favorecer la eliminaci�n de toxinas. Tambi�n se recomienda el consumo de caldos y l�quidos tibios para mejorar   " +
                                                  "\n la absorci�n de nutrientes esenciales. POSIBLE TRATAMIENTO: La meningitis bacteriana se trata con antibi�ticos     " +
                                                  "\n de amplio espectro como ceftriaxona, vancomicina y ampicilina, dependiendo del agente causal. Algunas marcas       " +
                                                  "\n reconocidas son Rocephin (ceftriaxona), Vancocin (vancomicina) y Principen (ampicilina). Tambi�n se recomienda     " +
                                                  "\n el uso de corticosteroides para reducir la inflamaci�n cerebral y mejorar la recuperaci�n. ALIMENTACI�N RECOMENDADA: " +
                                                  "\n Para fortalecer el sistema inmunol�gico y mejorar la recuperaci�n, se recomienda el consumo de alimentos ricos    " +
                                                  "\n en vitaminas y minerales esenciales. FRUTAS C�TRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que      " +
                                                  "\n fortalece el sistema inmune, aportando aproximadamente 89% del requerimiento diario por cada 100 gramos. PESCADOS " +
                                                  "\n GRASOS (salm�n, at�n): Fuente de OMEGA-3, con propiedades antiinflamatorias, proporcionando aproximadamente 2.2   " +
                                                  "\n gramos por cada 100 gramos de pescado. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO,    " + 
                                                  "\n fundamentales para la regeneraci�n celular y la funci�n muscular, aportando cerca del 15% del requerimiento diario" +
                                                  "\n por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100%   " +
                                                  "\n que la paciente tenga meningitis bacteriana ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de  " +
                                                  "\n un diagn�stico para mayor seguridad y, por su salud, consultar a su m�dico. Angel L Montes agradece tu visita a   " +
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada para mejorar la calidad de vida y reducir la fatiga asociada al     " +
                                                  "\n tratamiento. Ejercicios como caminatas, yoga y entrenamiento de resistencia pueden ayudar a mantener la masa           " +
                                                  "\n muscular y mejorar la circulaci�n. Tambi�n se recomienda ejercicios de relajaci�n para reducir el estr�s y mejorar     " +
                                                  "\n el bienestar emocional. HIDRATACI�N: Es esencial el consumo de 2.5 a 3 litros de agua, aproximadamente 10 a 12         " +
                                                  "\n vasos de tama�o regular, para facilitar la eliminaci�n de toxinas y mejorar la funci�n celular. Mantener una           " +
                                                  "\n hidrataci�n adecuada tambi�n contribuye a la absorci�n de nutrientes esenciales y al fortalecimiento del sistema       " +
                                                  "\n inmunol�gico. POSIBLE TRATAMIENTO: El c�ncer se trata con una combinaci�n de quimioterapia, radioterapia y cirug�a,    " +
                                                  "\n dependiendo del tipo y estadio de la enfermedad. Algunas marcas reconocidas de medicamentos incluyen Taxol             " +
                                                  "\n (paclitaxel), Herceptin (trastuzumab) y Xeloda (capecitabina). Tambi�n se recomienda el seguimiento de un plan de      " +
                                                  "\n tratamiento personalizado para mejorar la respuesta terap�utica. ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema  " +
                                                  "\n inmunol�gico y mejorar la recuperaci�n, se recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales. " +
                                                  "\n FRUTAS C�TRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema inmune, aportando         " +
                                                  "\n aproximadamente 89% del requerimiento diario por cada 100 gramos. PESCADOS GRASOS (salm�n, at�n): Fuente de OMEGA-3,   " +
                                                  "\n con propiedades antiinflamatorias, proporcionando aproximadamente 2.2 gramos por cada 100 gramos de pescado. VEGETALES " +
                                                  "\n DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales para la regeneraci�n celular y la funci�n  " +
                                                  "\n muscular, aportando cerca del 15% del requerimiento diario por cada 100 gramos. Este es solo un diagn�stico predeterminado " +
                                                  "\n l�gico. Haberlo consultado no garantiza al 100% que la paciente tenga c�ncer ni que el tratamiento sea el adecuado. Se " +
                                                  "\n recomienda realizar m�s de un diagn�stico para mayor seguridad y, por su salud, consultar a su m�dico. Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                    }
                }
             if (EdadFemenino.equals("Juventud = 22-29 a�os")) {
            frame.setVisible(true);
        } else {
            frame.setVisible(false);
        }
            }
        public Estudio10() {
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
        Estudio10 ventanaEstudio10 = new Estudio10();
        ventanaEstudio10.crearInterfaz();
    }
}
