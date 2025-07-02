import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Estudio11 implements ActionListener{
    
         protected final JLabel label1;
         protected JScrollPane scrollpane1;
         protected JTextArea textarea1;
         private JFrame frame;
         private final String edadEsperada = "Adultez = 30 - 59 a�os";
         private String edadRecibida;
         
        public Estudio11(String nombrePaciente, String Sexo, String EdadFemenino, 
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
                 if(EdadFemenino.equals("Adultez = 30 - 59 a�os")){
                        if(EstaturaFemenino.equals("0.80-1.35 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada para fortalecer el sistema inmunol�gico y mejorar la recuperaci�n.     " +
                                                  "\n Ejercicios como caminatas suaves, yoga y estiramientos pueden ayudar a reducir la fatiga y mejorar la circulaci�n.        " +
                                                  "\n Tambi�n se recomienda evitar esfuerzos f�sicos intensos mientras persistan los s�ntomas. HIDRATACI�N: Es fundamental      " +
                                                  "\n el consumo de 2.5 a 3 litros de agua, aproximadamente 10 a 12 vasos de tama�o regular, para mantener la hidrataci�n y     " +
                                                  "\n facilitar la eliminaci�n de toxinas. Tambi�n se recomienda el consumo de l�quidos tibios como infusiones de jengibre      " +
                                                  "\n o miel para aliviar la irritaci�n de la garganta y mejorar la expectoraci�n. POSIBLE TRATAMIENTO: La influenza se trata   " +
                                                  "\n con medicamentos antivirales como oseltamivir, zanamivir y baloxavir, que ayudan a reducir la duraci�n y severidad de     " +
                                                  "\n la enfermedad. Algunas marcas reconocidas son Tamiflu (oseltamivir), Relenza (zanamivir) y Xofluza (baloxavir). Adem�s    " +
                                                  "\n del tratamiento antiviral, es importante el uso de analg�sicos y antipir�ticos como paracetamol para aliviar los          " +
                                                  "\n s�ntomas. Se recomienda reposo absoluto y una alimentaci�n rica en antioxidantes para fortalecer el sistema inmunol�gico. " +
                                                  "\n En casos graves, el m�dico puede indicar hospitalizaci�n para monitoreo y administraci�n de medicamentos intravenosos.    " +
                                                  "\n ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema inmunol�gico y mejorar la recuperaci�n, se recomienda el consumo     " +
                                                  "\n de alimentos ricos en vitaminas y minerales esenciales. FRUTAS C�TRICAS (naranjas, limones, toronjas): Altas en VITAMINA C," +
                                                  "\n que fortalece el sistema inmune, aportando aproximadamente 89% del requerimiento diario por cada 100 gramos. JENGIBRE:    " +
                                                  "\n Contiene compuestos con efectos antiinflamatorios que pueden ayudar a aliviar la irritaci�n de las v�as respiratorias,    " +
                                                  "\n proporcionando 5% del requerimiento diario de antioxidantes por cada 10 gramos. MIEL: Con propiedades antimicrobianas     " +
                                                  "\n y calmantes para la garganta, aportando 20% del requerimiento diario de antioxidantes por cada 30 gramos. Este es solo    " +
                                                  "\n un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que la paciente tenga influenza ni que el   " +
                                                  "\n tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico para mayor seguridad y, por su salud, consultar " +
                                                  "\n a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n EJERCICIO: Se recomienda reposo absoluto durante la fase aguda de la enfermedad para evitar complicaciones respiratorias.   " +
                                                  "\n Una vez superada la etapa cr�tica, se pueden realizar ejercicios de movilidad y respiraci�n profunda para mejorar la        " +
                                                  "\n capacidad pulmonar y reducir la fatiga. Tambi�n se recomienda ejercicios de expansi�n tor�cica para fortalecer los          " +
                                                  "\n m�sculos respiratorios y mejorar la oxigenaci�n. HIDRATACI�N: Es esencial el consumo de 2.5 a 3 litros de agua,             " +
                                                  "\n aproximadamente 10 a 12 vasos de tama�o regular, para mantener las v�as respiratorias limpias y mejorar la eliminaci�n      " +
                                                  "\n de secreciones. Tambi�n se recomienda el consumo de caldos y l�quidos tibios para mejorar la absorci�n de nutrientes        " +
                                                  "\n esenciales. POSIBLE TRATAMIENTO: La neumon�a se trata con antibi�ticos como amoxicilina, azitromicina y ceftriaxona,        " +
                                                  "\n dependiendo del agente causal. Algunas marcas reconocidas son Augmentin (amoxicilina), Zithromax (azitromicina) y Rocephin  " +
                                                  "\n (ceftriaxona). Adem�s del tratamiento antibi�tico, se recomienda el uso de antipir�ticos para controlar la fiebre y         " + 
                                                  "\n broncodilatadores en casos de dificultad respiratoria severa. En casos graves, el m�dico puede indicar hospitalizaci�n      " +
                                                  "\n para administraci�n de ox�geno y monitoreo constante. ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema inmunol�gico     " +
                                                  "\n y mejorar la recuperaci�n, se recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales. FRUTAS          " +
                                                  "\n C�TRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema inmune, aportando aproximadamente     " +
                                                  "\n 89% del requerimiento diario por cada 100 gramos. PESCADOS GRASOS (salm�n, at�n): Fuente de OMEGA-3, con propiedades        " +
                                                  "\n antiinflamatorias, proporcionando aproximadamente 2.2 gramos por cada 100 gramos de pescado. VEGETALES DE HOJA VERDE        " +
                                                  "\n (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales para la regeneraci�n celular y la funci�n muscular, aportando " +
                                                  "\n cerca del 15% del requerimiento diario por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico. Haberlo   " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga neumon�a ni que el tratamiento sea el adecuado. Se recomienda      " +
                                                  "\n realizar m�s de un diagn�stico para mayor seguridad y, por su salud, consultar a su m�dico. Angel L Montes agradece      " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica regular para mejorar la sensibilidad a la insulina y controlar los         " +
                                                  "\n niveles de glucosa en sangre. Ejercicios como caminatas, nataci�n y entrenamiento de resistencia pueden ser          " +
                                                  "\n beneficiosos para la regulaci�n metab�lica. Tambi�n se recomienda ejercicios de relajaci�n para reducir el           " +
                                                  "\n estr�s y mejorar el bienestar emocional. HIDRATACI�N: Es esencial el consumo de 2.5 a 3 litros de agua,              " +
                                                  "\n aproximadamente 10 a 12 vasos de tama�o regular, para facilitar la eliminaci�n de toxinas y mejorar la funci�n       " +
                                                  "\n celular. Mantener una hidrataci�n adecuada tambi�n contribuye a la absorci�n de nutrientes esenciales y al           " +
                                                  "\n fortalecimiento del sistema inmunol�gico. POSIBLE TRATAMIENTO: La diabetes se trata con medicamentos como            " +
                                                  "\n metformina, insulina y sulfonilureas, dependiendo del tipo y gravedad de la enfermedad. Algunas marcas reconocidas   " +
                                                  "\n son Glucophage (metformina), Lantus (insulina) y Amaryl (glimepirida). Adem�s del tratamiento farmacol�gico,         " +
                                                  "\n se recomienda el seguimiento de un plan de alimentaci�n adecuado y la monitorizaci�n constante de los niveles        " +
                                                  "\n de glucosa en sangre. En casos avanzados, el m�dico puede indicar el uso de bombas de insulina o tratamientos        " +
                                                  "\n combinados para mejorar el control de la enfermedad. ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema            " +
                                                  "\n inmunol�gico y mejorar la regulaci�n de la glucosa, se recomienda el consumo de alimentos ricos en vitaminas         " +
                                                  "\n y minerales esenciales. FRUTAS C�TRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el         " +
                                                  "\n sistema inmune, aportando aproximadamente 89% del requerimiento diario por cada 100 gramos. PESCADOS GRASOS          " +
                                                  "\n (salm�n, at�n): Fuente de OMEGA-3, con propiedades antiinflamatorias, proporcionando aproximadamente 2.2 gramos      " +
                                                  "\n por cada 100 gramos de pescado. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales" +
                                                  "\n para la regeneraci�n celular y la funci�n muscular, aportando cerca del 15% del requerimiento diario por cada      " +
                                                  "\n 100 gramos. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que la      " +
                                                  "\n paciente tenga diabetes ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico para   " +
                                                  "\n mayor seguridad y, por su salud, consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y     " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2 a 2.5 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda a        " +
                                                  "\n mantener las v�as respiratorias h�medas y reducir la inflamaci�n bronquial. Tambi�n es beneficioso complementar        " +
                                                  "\n con infusiones naturales como t� de jengibre o c�rcuma, que poseen propiedades antiinflamatorias y antioxidantes.      " +
                                                  "\n EJERCICIO. La actividad f�sica moderada es clave para fortalecer el sistema respiratorio y mejorar la capacidad        " +
                                                  "\n pulmonar. Se recomienda realizar ejercicio aer�bico moderado al menos 30 minutos al d�a, como caminar, nadar o         " +
                                                  "\n andar en bicicleta, evitando el sobreesfuerzo. Tambi�n es beneficioso incluir ejercicios de respiraci�n como yoga      " +
                                                  "\n o t�cnicas de expansi�n pulmonar. POSIBLE TRATAMIENTO. El tratamiento est�ndar incluye broncodilatadores de alivio     " +
                                                  "\n r�pido como salbutamol, y corticosteroides inhalados como fluticasona o budesonida, que ayudan a reducir la inflamaci�n" +
                                                  "\n y mejorar la funci�n pulmonar. Tambi�n se pueden utilizar antagonistas de los receptores de leucotrienos, como         " +
                                                  "\n montelukast, para el control a largo plazo. Marcas reconocidas incluyen Ventolin, Aerolin, Flixotide, Pulmicort        " +
                                                  "\n y Singulair. ALIMENTACI�N. Para fortalecer el sistema inmunol�gico y reducir la inflamaci�n, se recomienda consumir    " +
                                                  "\n frutas c�tricas como naranja, lim�n y toronja, que son ricas en vitamina C, la cual contribuye a la producci�n de      " +
                                                  "\n gl�bulos blancos y mejora la respuesta inmune. Verduras de hoja verde como espinaca y acelga, que contienen �cido      " +
                                                  "\n f�lico, esencial para la producci�n de c�lulas sangu�neas. Pescados grasos como salm�n y sardina, que son ricos en     " +
                                                  "\n Omega-3, el cual tiene propiedades antiinflamatorias. Frutos secos como almendras y nueces, que aportan vitamina E,    " +
                                                  "\n la cual protege las c�lulas del da�o oxidativo. Legumbres como lentejas y garbanzos, que son fuente de prote�nas y     " +
                                                  "\n hierro, esenciales para la energ�a y la regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico.       " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente " +
                                                  "\n correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico especialista. Angel L Montes" +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2.5 a 3 litros de agua al d�a, ya que una hidrataci�n adecuada           " +
                                                  "\n ayuda a mantener el equilibrio del sistema inmunol�gico y mejorar la absorci�n de los medicamentos                " +
                                                  "\n antirretrovirales. Tambi�n es beneficioso complementar con infusiones naturales como t� verde o manzanilla,       " +
                                                  "\n que poseen propiedades antioxidantes y antiinflamatorias. EJERCICIO. La actividad f�sica moderada es clave        " +
                                                  "\n para fortalecer el sistema inmunol�gico y mejorar la salud cardiovascular. Se recomienda realizar ejercicio       " +
                                                  "\n aer�bico moderado al menos 30 minutos al d�a, como caminar, nadar o andar en bicicleta, evitando el               " +
                                                  "\n sobreesfuerzo. Tambi�n es beneficioso incluir ejercicios de resistencia como levantamiento de pesas ligeras       " +
                                                  "\n o yoga, que ayudan a mantener la masa muscular y reducir el estr�s. POSIBLE TRATAMIENTO. El tratamiento           " +
                                                  "\n est�ndar incluye terapia antirretroviral (TAR) con medicamentos como tenofovir, emtricitabina y dolutegravir,     " +
                                                  "\n que ayudan a controlar la replicaci�n del virus y mejorar la calidad de vida. Tambi�n pueden utilizarse           " +
                                                  "\n inhibidores de proteasa, como darunavir, en combinaci�n con otros antirretrovirales. Marcas reconocidas           " +
                                                  "\n incluyen Atripla, Truvada, Tivicay, Biktarvy y Prezista. ALIMENTACI�N. Para fortalecer el sistema inmunol�gico    " +
                                                  "\n y reducir la inflamaci�n, se recomienda consumir frutas c�tricas como naranja, lim�n y toronja, que son ricas     " +
                                                  "\n en vitamina C, la cual contribuye a la producci�n de gl�bulos blancos y mejora la respuesta inmune. Verduras      " + 
                                                  "\n de hoja verde como espinaca y kale, que contienen �cido f�lico y antioxidantes, esenciales para la regeneraci�n   " +
                                                  "\n celular y la protecci�n contra el da�o oxidativo. Pescados grasos como salm�n y at�n, que son ricos en Omega-3,   " +
                                                  "\n el cual tiene propiedades antiinflamatorias. Frutos secos como almendras y nueces, que aportan vitamina E, la     " +
                                                  "\n cual protege las c�lulas del da�o oxidativo. Legumbres como lentejas y garbanzos, que son fuente de prote�nas y   " +
                                                  "\n hierro, esenciales para la energ�a y la regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico.  " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean          " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico          " +
                                                  "\n especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2 a 2.5 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda           " +
                                                  "\n a eliminar toxinas y mantener el equilibrio del sistema inmunol�gico. Tambi�n es beneficioso complementar con           " +
                                                  "\n infusiones naturales como t� verde o manzanilla, que poseen propiedades antibacterianas y antiinflamatorias.            " +
                                                  "\n EJERCICIO. La actividad f�sica moderada es clave para fortalecer el sistema inmunol�gico y mejorar la circulaci�n       " +
                                                  "\n sangu�nea. Se recomienda realizar ejercicio aer�bico moderado al menos 30 minutos al d�a, como caminar, nadar o         " +
                                                  "\n andar en bicicleta, evitando el sobreesfuerzo. Tambi�n es beneficioso incluir ejercicios de resistencia como            " +
                                                  "\n levantamiento de pesas ligeras o yoga, que ayudan a mantener la masa muscular y reducir el estr�s. POSIBLE TRATAMIENTO. " +
                                                  "\n El tratamiento est�ndar incluye antibi�ticos como ceftriaxona y azitromicina, que ayudan a eliminar la bacteria         " +
                                                  "\n Neisseria gonorrhoeae. En casos de resistencia, se pueden utilizar combinaciones de antibi�ticos como gentamicina       " +
                                                  "\n con azitromicina. Marcas reconocidas incluyen Rocephin, Zithromax y Gentak. ALIMENTACI�N. Para fortalecer el sistema    " +
                                                  "\n inmunol�gico y reducir la inflamaci�n, se recomienda consumir frutas c�tricas como naranja, lim�n y toronja, que son    " +
                                                  "\n ricas en vitamina C, la cual contribuye a la producci�n de gl�bulos blancos y mejora la respuesta inmune. Verduras      " +
                                                  "\n cruc�feras como br�coli y coliflor, que contienen vitamina K y antioxidantes, esenciales para la regeneraci�n celular.  " +
                                                  "\n Pescados grasos como salm�n y sardina, que son ricos en Omega-3, el cual tiene propiedades antiinflamatorias.           " +
                                                  "\n Legumbres como lentejas y garbanzos, que son fuente de prote�nas y hierro, esenciales para la energ�a y la regeneraci�n " +
                                                  "\n celular. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente     " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de   " +
                                                  "\n un diagn�stico y consultar a un m�dico especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera   " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al d�a (aproximadamente              " +
                                                  "\n ocho a diez vasos de agua de tama�o regular) para mantener la hidrataci�n celular y ayudar al cuerpo a combatir          " +
                                                  "\n el virus. Tambi�n se recomienda el consumo de l�quidos ricos en antioxidantes como t� verde o infusiones de              " +
                                                  "\n manzanilla para mejorar la respuesta inmunol�gica. EJERCICIO: Se recomienda actividad f�sica moderada, evitando          " +
                                                  "\n el sobreesfuerzo durante los brotes. Ejercicios como yoga, pilates y caminatas suaves pueden ayudar a reducir el         " +
                                                  "\n estr�s, que es un factor desencadenante de los brotes de herpes. Adem�s, el ejercicio regular fortalece el sistema       " +
                                                  "\n inmunol�gico, lo que puede ayudar a reducir la frecuencia de los brotes. Es importante evitar actividades que generen    " +
                                                  "\n fricci�n o sudoraci�n excesiva en la zona afectada, ya que esto puede agravar los s�ntomas. POSIBLE TRATAMIENTO: El      " +
                                                  "\n tratamiento para el herpes genital suele incluir antivirales como aciclovir, valaciclovir o famciclovir, que ayudan      " +
                                                  "\n a reducir la duraci�n y severidad de los brotes. Marcas reconocidas incluyen Zovirax y Valtrex. Tambi�n se recomienda    " +
                                                  "\n el uso de cremas t�picas para aliviar el dolor y la inflamaci�n, as� como el fortalecimiento del sistema inmunol�gico    " +
                                                  "\n mediante una dieta equilibrada y el manejo del estr�s. En algunos casos, los m�dicos pueden recomendar suplementos de    " +
                                                  "\n lisina, un amino�cido que puede ayudar a reducir la replicaci�n del virus. ALIMENTACI�N RECOMENDADA: Para fortalecer     " +
                                                  "\n el sistema inmunol�gico y ayudar en la recuperaci�n, se recomienda el consumo de FRUTAS C�TRICAS como naranja y          " +
                                                  "\n toronja, ricas en VITAMINA C, que fortalece el sistema inmune y aporta cerca del 89% del requerimiento diario por        " +
                                                  "\n cada 100 g. AR�NDANOS, ricos en ANTIOXIDANTES, que ayudan a reducir la inflamaci�n y aportan aproximadamente el 50%      " +
                                                  "\n del requerimiento diario de VITAMINA C por cada 100 g. AJO, con propiedades ANTIVIRALES, que pueden ayudar a combatir    " +
                                                  "\n el virus y fortalecer el sistema inmunol�gico. ESPINACA, fuente de HIERRO y VITAMINA E, que ayuda a mejorar la           " +
                                                  "\n regeneraci�n celular y aporta aproximadamente el 15% del requerimiento diario de HIERRO por cada 100 g. Este es solo     " +
                                                  "\n un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad      " +
                                                  "\n ni que las respuestas sean completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad    " +
                                                  "\n en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda" +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al d�a (aproximadamente         " +
                                                  "\n ocho a diez vasos de agua de tama�o regular) para ayudar al cuerpo a eliminar la bacteria y prevenir la             " +
                                                  "\n deshidrataci�n causada por fiebre y malestar. Tambi�n se recomienda el consumo de l�quidos ricos en electrolitos    " +
                                                  "\n como agua de coco o caldos naturales para mejorar la recuperaci�n. EJERCICIO: Se recomienda reposo moderado         " +
                                                  "\n mientras persistan los s�ntomas, evitando esfuerzos f�sicos intensos. Sin embargo, una vez recuperada, se pueden    " +
                                                  "\n realizar ejercicios de bajo impacto como yoga o estiramientos suaves para mejorar la circulaci�n y fortalecer el    " +
                                                  "\n sistema inmunol�gico. La actividad f�sica regular puede ayudar a mejorar la respuesta del cuerpo al tratamiento     " +
                                                  "\n antibi�tico, ya que estimula la circulaci�n sangu�nea y la oxigenaci�n celular. POSIBLE TRATAMIENTO: El             " +
                                                  "\n tratamiento para la s�filis suele incluir antibi�ticos como la penicilina G benzatina, que es el tratamiento        " +
                                                  "\n de primera l�nea. Marcas reconocidas incluyen Benzetacil. En casos de alergia a la penicilina, se pueden utilizar   " +
                                                  "\n alternativas como doxiciclina o azitromicina. Es fundamental completar el tratamiento indicado por el m�dico para   " +
                                                  "\n evitar complicaciones y recurrencias. Adem�s, se recomienda evitar el consumo de alcohol y tabaco durante el        " +
                                                  "\n tratamiento, ya que pueden interferir con la eficacia de los antibi�ticos y prolongar la recuperaci�n. ALIMENTACI�N " +
                                                  "\n RECOMENDADA: Para fortalecer el sistema inmunol�gico y ayudar en la recuperaci�n, se recomienda el consumo de YOGUR " +
                                                  "\n NATURAL, rico en PROBI�TICOS, que favorecen la recuperaci�n intestinal y aportan aproximadamente 10^9 UFC por cada  " +
                                                  "\n 100 g. AJO, con propiedades ANTIBACTERIANAS, que pueden ayudar a combatir la infecci�n y aporta compuestos bioactivos " +
                                                  "\n como alicina. ESPINACA, fuente de VITAMINA C y HIERRO, que fortalece el sistema inmune y aporta cerca del 15% del     " +
                                                  "\n requerimiento diario de HIERRO por cada 100 g. FRUTOS ROJOS, ricos en ANTIOXIDANTES, que ayudan a reducir la          " +
                                                  "\n inflamaci�n y aportan aproximadamente el 50% del requerimiento diario de VITAMINA C por cada 100 g. Este es solo un   " +
                                                  "\n diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni   " +
                                                  "\n que las respuestas sean completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad    " +
                                                  "\n en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se        " +
                                                  "\n recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2.5 a 3 litros de agua al d�a (aproximadamente           " +
                                                  "\n diez a doce vasos de agua de tama�o regular) para mantener la hidrataci�n de las v�as respiratorias y ayudar          " +
                                                  "\n al cuerpo a eliminar la bacteria. Tambi�n se recomienda el consumo de l�quidos tibios como t� de jengibre o           " +
                                                  "\n caldos naturales para mejorar la funci�n pulmonar. EJERCICIO: Se recomienda reposo absoluto mientras persistan        " +
                                                  "\n los s�ntomas, evitando cualquier actividad f�sica intensa. Una vez recuperada, se pueden realizar ejercicios de       " +
                                                  "\n respiraci�n y fortalecimiento pulmonar para mejorar la capacidad respiratoria y reducir la fatiga. Tambi�n es         " +
                                                  "\n recomendable evitar ambientes con humo o contaminaci�n que puedan agravar los s�ntomas. La rehabilitaci�n pulmonar    " +
                                                  "\n puede ser una opci�n efectiva para mejorar la funci�n respiratoria en pacientes con tuberculosis, incluyendo          " +
                                                  "\n ejercicios de expansi�n tor�cica y t�cnicas de respiraci�n profunda. POSIBLE TRATAMIENTO: El tratamiento para la      " +
                                                  "\n tuberculosis suele incluir una combinaci�n de antibi�ticos como isoniazida, rifampicina, etambutol y pirazinamida,    " +
                                                  "\n administrados durante un per�odo de seis meses o m�s. Estos medicamentos est�n disponibles en el sistema de salud     " +
                                                  "\n p�blica. Es fundamental seguir el tratamiento de manera estricta para evitar la resistencia bacteriana y garantizar   " +
                                                  "\n la recuperaci�n completa. Adem�s, se recomienda una alimentaci�n rica en prote�nas y vitaminas para fortalecer el     " +
                                                  "\n sistema inmunol�gico y mejorar la respuesta al tratamiento. ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema      " +
                                                  "\n respiratorio y reducir la inflamaci�n, se recomienda el consumo de FRUTAS C�TRICAS como naranja y toronja, ricas en   " +
                                                  "\n VITAMINA C, que fortalece el sistema inmune y aporta cerca del 89% del requerimiento diario por cada 100 g. PESCADOS  " +
                                                  "\n GRASOS como salm�n y at�n, ricos en �CIDOS GRASOS OMEGA-3, que poseen propiedades antiinflamatorias y aportan         " +
                                                  "\n aproximadamente el 50% del requerimiento diario por cada 100 g. ESPINACA, fuente de HIERRO y ANTIOXIDANTES, que       " +
                                                  "\n ayudan a mejorar la oxigenaci�n celular y aportan aproximadamente el 15% del requerimiento diario de HIERRO por       " +
                                                  "\n cada 100 g. JENGIBRE, con propiedades ANTIINFLAMATORIAS y antioxidantes, que pueden aliviar s�ntomas respiratorios    " +
                                                  "\n y mejorar la funci�n pulmonar. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza     " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda       " +
                                                  "\n realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta " +
                                                  "\n del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular)                 " +
                                                  "\n para mantener una hidrataci�n adecuada. La hidrataci�n es clave para reducir la inflamaci�n en las articulaciones            " +
                                                  "\n y mejorar la movilidad. Tambi�n es recomendable el consumo de infusiones antiinflamatorias como t� de c�rcuma o              " +
                                                  "\n jengibre. EJERCICIO: Se aconseja actividad f�sica moderada y adaptada a la condici�n de la paciente. Se recomienda           " +
                                                  "\n ejercicios de bajo impacto como nataci�n, yoga o pilates para fortalecer los m�sculos sin generar estr�s en las              " +
                                                  "\n articulaciones. Tambi�n es beneficioso realizar ejercicios de movilidad articular y estiramientos para mejorar la            " +
                                                  "\n flexibilidad y reducir la rigidez. POSIBLE TRATAMIENTO: Para la artritis en mujeres adultas, el tratamiento suele            " +
                                                  "\n incluir medicamentos antiinflamatorios no esteroides como el ibuprofeno o el naproxeno, corticosteroides en casos            " +
                                                  "\n m�s severos y medicamentos antirreum�ticos modificadores de la enfermedad como el metotrexato. Tambi�n se recomienda         " +
                                                  "\n la fisioterapia y el uso de suplementos como el col�geno y la glucosamina para mejorar la salud articular. ALIMENTACI�N:     " +
                                                  "\n Se recomienda el consumo de alimentos con propiedades antiinflamatorias y antioxidantes para mejorar la funci�n articular:   " +
                                                  "\n Pescados grasos (salm�n, at�n): Ricos en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias. Frutas y           " +
                                                  "\n verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli): Ricas en antioxidantes como la vitamina C y carotenoides, " +
                                                  "\n que pueden proteger las c�lulas del da�o. Jengibre: Contiene compuestos con efectos antiinflamatorios que podr�an ser        " +
                                                  "\n beneficiosos para las articulaciones. C�rcuma: Con su componente activo, la curcumina, tiene potentes propiedades            " +
                                                  "\n antiinflamatorias y antioxidantes. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza        " +
                                                  "\n al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello        " +
                                                  "\n se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su        " +
                                                  "\n paciente, adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se le recomienda mucho consultar   " +
                                                  "\n a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tama�o regular) para            " +
                                                  "\n mantener una hidrataci�n adecuada y ayudar a aliviar la irritaci�n de las v�as respiratorias. Tambi�n es recomendable      " +
                                                  "\n el consumo de infusiones calientes como t� de miel y lim�n para calmar la tos y mejorar la respiraci�n. EJERCICIO:         " +
                                                  "\n Se aconseja actividad f�sica ligera y progresiva, evitando esfuerzos intensos mientras persistan los s�ntomas. Se          " +
                                                  "\n recomienda caminatas suaves de 15 a 30 minutos diarios para mejorar la oxigenaci�n y la recuperaci�n pulmonar. Tambi�n     " +
                                                  "\n es importante evitar ambientes con humo o polvo que puedan agravar la tos. POSIBLE TRATAMIENTO: Para la tosferina en       " +
                                                  "\n mujeres adultas, el tratamiento suele incluir antibi�ticos como la azitromicina o la claritromicina para reducir la        " +
                                                  "\n duraci�n de la enfermedad y evitar complicaciones. Tambi�n se recomienda el uso de humidificadores y el descanso adecuado  " +
                                                  "\n para facilitar la recuperaci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en vitaminas y minerales         " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico y mejorar la funci�n pulmonar: Naranjas y mandarinas: Ricas en          " +
                                                  "\n vitamina C, esenciales para mejorar la respuesta inmune. Jengibre: Posee propiedades antiinflamatorias y antioxidantes que " +
                                                  "\n pueden aliviar la congesti�n. Espinacas y br�coli: Ricos en vitamina A y vitamina C, esenciales para fortalecer el sistema " +
                                                  "\n inmunol�gico y acelerar la recuperaci�n. Miel: Tiene propiedades antibacterianas y ayuda a calmar la irritaci�n de la    " +
                                                  "\n garganta. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente     " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s    " +
                                                  "\n de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s, por su   " +
                                                  "\n salud, si la respuesta del diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L   " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular)         " +
                                                  "\n para mantener una hidrataci�n adecuada y ayudar a reducir la fiebre. Tambi�n es recomendable el consumo de           " +
                                                  "\n caldos y sopas calientes para mejorar la hidrataci�n y aliviar la inflamaci�n de las gl�ndulas salivales.            " +
                                                  "\n EJERCICIO: Se aconseja evitar actividad f�sica intensa mientras persistan los s�ntomas. Se recomienda descanso       " +
                                                  "\n absoluto y caminatas suaves para mejorar la circulaci�n y el bienestar general. POSIBLE TRATAMIENTO: Para las        " +
                                                  "\n paperas en mujeres adultas, el tratamiento suele incluir medicamentos para reducir la fiebre y aliviar los           " +
                                                  "\n s�ntomas, como el paracetamol o el ibuprofeno. Tambi�n se recomienda el reposo, la hidrataci�n adecuada y una        " +
                                                  "\n alimentaci�n de consistencia blanda para facilitar la ingesta de alimentos. ALIMENTACI�N: Se recomienda el consumo   " +
                                                  "\n de alimentos ricos en vitaminas y minerales esenciales para fortalecer el sistema inmunol�gico y mejorar la          " +
                                                  "\n recuperaci�n: Yogur natural: Rico en probi�ticos, ayuda a restaurar la flora intestinal y mejorar la digesti�n.      " +
                                                  "\n Pl�tanos: Contienen potasio, esencial para reponer electrolitos perdidos y mejorar la funci�n muscular. Arroz y pan  " +
                                                  "\n tostado: Son f�ciles de digerir y ayudan a estabilizar el sistema digestivo. Zanahorias: Ricas en vitamina A,        " +
                                                  "\n esenciales para la regeneraci�n celular y la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico, haberlo" +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas   " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en   " +
                                                  "\n el tratamiento adecuado de su paciente, adem�s, por su salud, si la respuesta del diagn�stico no le satisface del    " +
                                                  "\n todo, se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera    " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N. Es fundamental mantener una hidrataci�n adecuada para reducir los s�ntomas y prevenir complicaciones,      " +
                                                  "\n se recomienda el consumo de 2 a 2.5 litros de agua al d�a, adem�s de l�quidos ricos en electrolitos como agua de        " +
                                                  "\n coco o sueros orales para evitar la deshidrataci�n causada por fiebre y sudoraci�n, tambi�n se recomienda el consumo    " +
                                                  "\n de infusiones naturales como t� de jengibre para aliviar la inflamaci�n y mejorar la circulaci�n sangu�nea.             " +
                                                  "\n EJERCICIO. La actividad f�sica debe ser ligera y adaptada a la condici�n del paciente, se recomienda caminatas          " +
                                                  "\n suaves y ejercicios de movilidad para mejorar la circulaci�n y reducir la fatiga, adem�s el descanso adecuado es        " +
                                                  "\n clave para la recuperaci�n, evitando esfuerzos excesivos mientras persistan los s�ntomas, ejercicios de respiraci�n     " +
                                                  "\n profunda pueden ayudar a mejorar la oxigenaci�n y reducir el estr�s. POSIBLE TRATAMIENTO. No existe un f�rmaco          " +
                                                  "\n antiviral espec�fico para tratar la infecci�n por virus Zika, el tratamiento es sintom�tico e incluye antiinflamatorios " +
                                                  "\n no esteroideos y analg�sicos como el paracetamol para reducir la fiebre y aliviar el malestar, tambi�n se recomienda    " +
                                                  "\n reposo, ingesta de abundantes l�quidos y administraci�n de antihistam�nicos para controlar el prurito asociado con el   " +
                                                  "\n exantema, es fundamental seguir las indicaciones m�dicas y evitar la automedicaci�n, en casos graves se recomienda      " +
                                                  "\n acudir al m�dico para evaluar posibles complicaciones neurol�gicas. ALIMENTACI�N. Se recomienda el consumo de alimentos " +
                                                  "\n ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, NARANJA. Rica en vitamina C que " +
                                                  "\n ayuda a reducir la inflamaci�n y fortalecer el sistema inmune, aporta aproximadamente el 89% de la ingesta diaria       " +
                                                  "\n recomendada por cada 100 gramos. JENGIBRE. Contiene compuestos con efectos antiinflamatorios y ayuda a aliviar la       " +
                                                  "\n fiebre y el malestar, su consumo puede aportar hasta el 20% de la ingesta diaria recomendada de antioxidantes. MIEL.    " +
                                                  "\n Posee propiedades antimicrobianas y ayuda a calmar la garganta y reducir la inflamaci�n, aporta cerca del 10% de la     " +
                                                  "\n ingesta diaria recomendada de antioxidantes por cada cucharada. Este es solo un Diagn�stico predeterminado l�gico,      " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus         " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor        " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera    " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N. Es crucial mantener una hidrataci�n adecuada para prevenir la deshidrataci�n causada por            " +
                                                  "\n la diarrea y el v�mito, se recomienda el consumo de 2.5 a 3 litros de agua al d�a, adem�s de soluciones          " +
                                                  "\n de rehidrataci�n oral como Pedialyte para recuperar electrolitos esenciales, tambi�n se recomienda el            " +
                                                  "\n consumo de caldos ligeros y agua de coco para reponer minerales perdidos y evitar la deshidrataci�n severa,      " +
                                                  "\n el consumo de agua con lim�n puede ayudar a mejorar la absorci�n de nutrientes y fortalecer el sistema           " +
                                                  "\n inmunol�gico. EJERCICIO. Durante la fase aguda de la enfermedad se recomienda reposo absoluto para evitar        " +
                                                  "\n la deshidrataci�n y el desgaste f�sico, una vez recuperada la paciente puede retomar actividades ligeras         " +
                                                  "\n como caminatas cortas para mejorar la circulaci�n y fortalecer el sistema inmunol�gico, adem�s ejercicios        " +
                                                  "\n de movilidad pueden ayudar a recuperar la energ�a y mejorar la digesti�n, el yoga y la respiraci�n profunda      " +
                                                  "\n pueden ser beneficiosos para reducir el estr�s y mejorar la funci�n digestiva. POSIBLE TRATAMIENTO. No existe    " +
                                                  "\n un tratamiento espec�fico para la infecci�n por rotavirus, el manejo se centra en la prevenci�n de la deshidrataci�n " +
                                                  "\n mediante el consumo de l�quidos y soluciones de rehidrataci�n oral, en casos graves puede requerirse la           " +
                                                  "\n administraci�n de l�quidos intravenosos en el hospital, es fundamental seguir las indicaciones m�dicas y evitar   " +
                                                  "\n el consumo de alimentos irritantes, tambi�n se recomienda el consumo de probi�ticos para restaurar la flora       " +
                                                  "\n intestinal y mejorar la absorci�n de nutrientes esenciales. ALIMENTACI�N. Se recomienda el consumo de alimentos   " +
                                                  "\n ricos en fibra y probi�ticos para restaurar la flora intestinal, PL�TANO. Rico en potasio que ayuda a recuperar   " +
                                                  "\n los electrolitos perdidos, aporta aproximadamente el 10% de la ingesta diaria recomendada por cada 100 gramos.    " +
                                                  "\n YOGURT NATURAL. Contiene probi�ticos que ayudan a restaurar la flora intestinal, su consumo puede aportar hasta   " +
                                                  "\n el 20% de la ingesta diaria recomendada de probi�ticos. ZANAHORIA. Rica en vitamina A que ayuda a la regeneraci�n " +
                                                  "\n celular intestinal, aporta aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos. Este es   " +
                                                  "\n solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa      " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su   " +
                                                  "\n salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel" +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N. Es fundamental mantener una hidrataci�n adecuada para ayudar al cuerpo a eliminar la infecci�n        " +
                                                  "\n y reducir la fiebre, se recomienda el consumo de 2 a 2.5 litros de agua al d�a, adem�s de infusiones sin           " +
                                                  "\n az�car como t� verde o agua de jamaica para mejorar la circulaci�n, tambi�n se recomienda el consumo de agua       " +
                                                  "\n con miel y lim�n para aliviar la irritaci�n y fortalecer el sistema inmunol�gico, el consumo de caldos ricos       " +
                                                  "\n en minerales puede ayudar a mejorar la recuperaci�n y fortalecer el sistema digestivo. EJERCICIO. Se recomienda    " +
                                                  "\n actividad f�sica moderada como caminatas, nataci�n o yoga para mejorar la circulaci�n y fortalecer el sistema      " +
                                                  "\n inmunol�gico, adem�s ejercicios de movilidad pueden ayudar a reducir la inflamaci�n y mejorar la recuperaci�n,     " +
                                                  "\n es importante realizar ejercicio de manera constante y bajo supervisi�n m�dica, ejercicios de respiraci�n profunda " +
                                                  "\n pueden ayudar a mejorar la oxigenaci�n y reducir el estr�s. POSIBLE TRATAMIENTO. El tratamiento suele incluir      " +
                                                  "\n antibi�ticos como la ampicilina o gentamicina, adem�s pueden recetarse medicamentos complementarios para aliviar   " +
                                                  "\n los s�ntomas, tambi�n se recomienda el uso de probi�ticos para mejorar la flora intestinal y reducir el riesgo de  " +
                                                  "\n reinfecci�n, es fundamental seguir las indicaciones m�dicas y evitar el consumo de alimentos contaminados, en      " +
                                                  "\n casos graves se recomienda acudir al m�dico para evaluar posibles complicaciones neurol�gicas. ALIMENTACI�N. Se    " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema       " +
                                                  "\n inmunol�gico, AR�NDANOS. Ricos en antioxidantes que ayudan a combatir infecciones, aportan aproximadamente el 25%  " +
                                                  "\n de la ingesta diaria recomendada por cada 100 gramos. AJO. Contiene compuestos antimicrobianos que pueden ayudar   " +
                                                  "\n a combatir la infecci�n, su consumo puede aportar hasta el 20% de la ingesta diaria recomendada de antioxidantes.  " +
                                                  "\n JENGIBRE. Contiene propiedades antiinflamatorias que pueden ayudar a reducir los s�ntomas, su consumo puede aportar" +
                                                  "\n hasta el 15% de la ingesta diaria recomendada de antioxidantes. Este es solo un Diagn�stico predeterminado l�gico, " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus    " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor   " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le     " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app        " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo absoluto para evitar complicaciones      " +
                                                  "\n gastrointestinales. Una vez superada la etapa cr�tica, se pueden realizar ejercicios de movilidad y              " +
                                                  "\n fortalecimiento muscular para recuperar la energ�a y mejorar la circulaci�n. HIDRATACI�N: Es fundamental el      " +
                                                  "\n consumo de 2.5 a 3 litros de agua, aproximadamente 10 a 12 vasos de tama�o regular, para prevenir la             " +
                                                  "\n deshidrataci�n causada por la diarrea y favorecer la eliminaci�n de toxinas. Tambi�n se recomienda el consumo    " +
                                                  "\n de soluciones de rehidrataci�n oral para recuperar electrolitos esenciales. POSIBLE TRATAMIENTO: La shigelosis   " +
                                                  "\n se trata con antibi�ticos como ciprofloxacina, azitromicina y ceftriaxona, dependiendo de la gravedad de la      " +
                                                  "\n infecci�n. Algunas marcas reconocidas son Cipro (ciprofloxacina), Zithromax (azitromicina) y Rocephin (ceftriaxona). " + 
                                                  "\n Adem�s del tratamiento antibi�tico, se recomienda el uso de probi�ticos para restaurar la flora intestinal y       " +
                                                  "\n mejorar la digesti�n. ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema inmunol�gico y mejorar la recuperaci�n, " +
                                                  "\n se recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales. BANANAS: Ricas en POTASIO, que    " +
                                                  "\n ayuda a reemplazar los electrolitos perdidos, aportando aproximadamente 12% del requerimiento diario por cada 100  " +
                                                  "\n gramos. ARROZ BLANCO: Fuente de CARBOHIDRATOS de f�cil digesti�n, proporcionando 20% del requerimiento diario por  " +
                                                  "\n cada 100 gramos. ZANAHORIAS: Altas en VITAMINA A, que favorece la regeneraci�n celular, aportando aproximadamente  " +
                                                  "\n 15% del requerimiento diario por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico. Haberlo    " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga shigelosis ni que el tratamiento sea el adecuado. Se      " +
                                                  "\n recomienda realizar m�s de un diagn�stico para mayor seguridad y, por su salud, consultar a su m�dico. Angel    " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada para mejorar la capacidad pulmonar y reducir la fatiga.              " +
                                                  "\n Ejercicios como caminatas, nataci�n y entrenamiento de resistencia pueden ayudar a fortalecer los m�sculos              " +
                                                  "\n respiratorios. Tambi�n se recomienda ejercicios de respiraci�n profunda para mejorar la oxigenaci�n y reducir           " +
                                                  "\n la sensaci�n de falta de aire. HIDRATACI�N: Es esencial el consumo de 2.5 a 3 litros de agua, aproximadamente           " +
                                                  "\n 10 a 12 vasos de tama�o regular, para mantener las v�as respiratorias hidratadas y facilitar la eliminaci�n de          " +
                                                  "\n secreciones. Tambi�n se recomienda el consumo de l�quidos tibios como infusiones de jengibre o miel para aliviar        " +
                                                  "\n la irritaci�n de la garganta y mejorar la expectoraci�n. POSIBLE TRATAMIENTO: La EPOC se trata con broncodilatadores    " +
                                                  "\n como salbutamol, tiotropio y formoterol, adem�s de corticosteroides inhalados como budesonida y fluticasona. Algunas    " +
                                                  "\n marcas reconocidas son Ventolin (salbutamol), Spiriva (tiotropio) y Symbicort (budesonida/formoterol). Tambi�n se       " +
                                                  "\n recomienda el uso de oxigenoterapia en casos avanzados y la rehabilitaci�n pulmonar para mejorar la calidad de vida.    " +
                                                  "\n ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema inmunol�gico y mejorar la funci�n pulmonar, se recomienda el       " +
                                                  "\n consumo de alimentos ricos en vitaminas y minerales esenciales. PESCADOS GRASOS (salm�n, at�n): Fuente de OMEGA-3,      " +
                                                  "\n con propiedades antiinflamatorias, proporcionando aproximadamente 2.2 gramos por cada 100 gramos de pescado. FRUTAS     " +
                                                  "\n C�TRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema inmune, aportando                 " +
                                                  "\n aproximadamente 89% del requerimiento diario por cada 100 gramos. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos     " +
                                                  "\n en HIERRO y MAGNESIO, fundamentales para la regeneraci�n celular y la funci�n muscular, aportando cerca del 15% del     " +
                                                  "\n requerimiento diario por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no      " +
                                                  "\n garantiza al 100% que la paciente tenga EPOC ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un    " +
                                                  "\n diagn�stico para mayor seguridad y, por su salud, consultar a su m�dico. Angel L Montes agradece tu visita a la app     " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada para mejorar la circulaci�n y fortalecer el sistema              " +
                                                  "\n inmunol�gico. Ejercicios como caminatas, nataci�n y estiramientos pueden ser beneficiosos para la recuperaci�n.     " +
                                                  "\n Tambi�n se recomienda ejercicios de resistencia moderada para mejorar la funci�n muscular y reducir la fatiga.      " +
                                                  "\n HIDRATACI�N: Es esencial el consumo de 2.5 a 3 litros de agua, aproximadamente 10 a 12 vasos de tama�o regular,     " +
                                                  "\n para facilitar la eliminaci�n de toxinas y mejorar la funci�n celular. Mantener una hidrataci�n adecuada tambi�n    " +
                                                  "\n contribuye a la regeneraci�n de tejidos y ayuda a reducir la inflamaci�n. POSIBLE TRATAMIENTO: La clamidia se       " +
                                                  "\n trata con antibi�ticos como azitromicina, doxiciclina y levofloxacina. Algunas marcas reconocidas son Zithromax     " +
                                                  "\n (azitromicina), Vibramycin (doxiciclina) y Levaquin (levofloxacina). Es fundamental seguir el tratamiento indicado  " +
                                                  "\n por el m�dico y realizar pruebas de seguimiento para asegurar la eliminaci�n de la infecci�n. Tambi�n se recomienda " +
                                                  "\n evitar relaciones sexuales durante el tratamiento para prevenir la reinfecci�n. ALIMENTACI�N RECOMENDADA: Para      " +
                                                  "\n fortalecer el sistema inmunol�gico y mejorar la recuperaci�n, se recomienda el consumo de alimentos ricos en        " +
                                                  "\n vitaminas y minerales esenciales. FRUTAS C�TRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece " +
                                                  "\n el sistema inmune, aportando aproximadamente 89% del requerimiento diario por cada 100 gramos. PESCADOS GRASOS      " +
                                                  "\n (salm�n, at�n): Fuente de OMEGA-3, con propiedades antiinflamatorias, proporcionando aproximadamente 2.2 gramos por " +
                                                  "\n cada 100 gramos de pescado. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales   " +
                                                  "\n para la regeneraci�n celular y la funci�n muscular, aportando cerca del 15% del requerimiento diario por cada 100   " +
                                                  "\n gramos. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que la paciente  " +
                                                  "\n tenga clamidia ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico para mayor       " +
                                                  "\n seguridad y, por su salud, consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera     " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2.5 a 3 litros de agua al d�a, ya que una hidrataci�n adecuada              " +
                                                  "\n ayuda a mantener el equilibrio del sistema nervioso y reducir la inflamaci�n de las meninges. Tambi�n es             " +
                                                  "\n beneficioso complementar con infusiones naturales como t� de manzanilla o jengibre, que poseen propiedades           " +
                                                  "\n antiinflamatorias y relajantes. EJERCICIO. La actividad f�sica moderada es clave para fortalecer el sistema          " +
                                                  "\n inmunol�gico y mejorar la circulaci�n sangu�nea. Se recomienda realizar ejercicio aer�bico moderado al menos         " +
                                                  "\n 30 minutos al d�a, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo. Tambi�n es beneficioso       " +
                                                  "\n incluir ejercicios de respiraci�n como yoga o t�cnicas de expansi�n pulmonar para mejorar la oxigenaci�n cerebral.   " +
                                                  "\n POSIBLE TRATAMIENTO. El tratamiento est�ndar incluye antibi�ticos como ceftriaxona, vancomicina y ampicilina, que    " +
                                                  "\n ayudan a eliminar la bacteria causante de la meningitis. En casos graves, se puede requerir hospitalizaci�n para     " +
                                                  "\n administraci�n intravenosa de antibi�ticos y monitoreo de s�ntomas. Tambi�n es importante el uso de antiinflamatorios" +
                                                  "\n y analg�sicos para reducir el dolor y la fiebre. ALIMENTACI�N. Para fortalecer el sistema inmunol�gico y reducir     " +
                                                  "\n la inflamaci�n, se recomienda consumir frutas c�tricas como naranja, lim�n y toronja, que son ricas en vitamina C,   " +
                                                  "\n la cual contribuye a la producci�n de gl�bulos blancos y mejora la respuesta inmune. Verduras cruc�feras como br�coli" +
                                                  "\n y coliflor, que contienen vitamina K y antioxidantes, esenciales para la regeneraci�n celular y la protecci�n del    " +
                                                  "\n sistema nervioso. Pescados grasos como salm�n y sardina, que son ricos en Omega-3, el cual tiene propiedades         " +
                                                  "\n antiinflamatorias. Legumbres como lentejas y garbanzos, que son fuente de prote�nas y hierro, esenciales para        " +
                                                  "\n la energ�a y la regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no       " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para     " +
                                                  "\n ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico especialista. Angel L Montes agradece     " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2.5 a 3 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda        " +
                                                  "\n a mantener el equilibrio celular y mejorar la eliminaci�n de toxinas. Tambi�n es beneficioso complementar con        " +
                                                  "\n infusiones naturales como t� verde o c�rcuma, que poseen propiedades antioxidantes y anticancer�genas. EJERCICIO.    " +
                                                  "\n La actividad f�sica moderada es clave para fortalecer el sistema inmunol�gico y mejorar la salud cardiovascular.     " +
                                                  "\n Se recomienda realizar ejercicio aer�bico moderado al menos 30 minutos al d�a, como caminar, nadar o andar en        " +
                                                  "\n bicicleta, evitando el sobreesfuerzo. Tambi�n es beneficioso incluir ejercicios de resistencia como levantamiento    " +
                                                  "\n de pesas ligeras o yoga, que ayudan a mantener la masa muscular y reducir el estr�s. POSIBLE TRATAMIENTO. El         " +
                                                  "\n tratamiento est�ndar incluye quimioterapia, radioterapia y terapia dirigida, dependiendo del tipo y estadio del      " +
                                                  "\n c�ncer. En algunos casos, se puede recurrir a inmunoterapia, que ayuda al sistema inmunol�gico a combatir las c�lulas" +
                                                  "\n cancerosas. Marcas reconocidas incluyen Herceptin, Avastin, Keytruda y Opdivo. Tambi�n es importante el uso de       " +
                                                  "\n suplementos nutricionales para mantener la energ�a y reducir los efectos secundarios del tratamiento. ALIMENTACI�N.    " +
                                                  "\n Para fortalecer el sistema inmunol�gico y reducir la inflamaci�n, se recomienda consumir frutas c�tricas como naranja, " +
                                                  "\n lim�n y toronja, que son ricas en vitamina C, la cual contribuye a la producci�n de gl�bulos blancos y mejora la       " +
                                                  "\n respuesta inmune. Verduras de hoja verde como espinaca y kale, que contienen �cido f�lico y antioxidantes, esenciales  " +
                                                  "\n para la regeneraci�n celular y la protecci�n contra el da�o oxidativo. Pescados grasos como salm�n y at�n, que son     " +
                                                  "\n ricos en Omega-3, el cual tiene propiedades antiinflamatorias. Frutos secos como almendras y nueces, que aportan       " +
                                                  "\n vitamina E, la cual protege las c�lulas del da�o oxidativo. Legumbres como lentejas y garbanzos, que son fuente de     " +
                                                  "\n prote�nas y hierro, esenciales para la energ�a y la regeneraci�n celular. Este es solo un diagn�stico predeterminado   " +
                                                  "\n l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean       " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico especialista. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.35-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada para fortalecer el sistema inmunol�gico y mejorar la              " +
                                                  "\n recuperaci�n. Ejercicios como caminatas suaves, yoga y estiramientos pueden ayudar a reducir la fatiga               " +
                                                  "\n y mejorar la circulaci�n. Tambi�n se recomienda evitar esfuerzos f�sicos intensos mientras persistan los             " +
                                                  "\n s�ntomas. HIDRATACI�N: Es fundamental el consumo de 2.5 a 3 litros de agua, aproximadamente 10 a 12 vasos            " +
                                                  "\n de tama�o regular, para mantener la hidrataci�n y facilitar la eliminaci�n de toxinas. Tambi�n se recomienda         " +
                                                  "\n el consumo de l�quidos tibios como infusiones de jengibre o miel para aliviar la irritaci�n de la garganta y         " +
                                                  "\n mejorar la expectoraci�n. POSIBLE TRATAMIENTO: La influenza se trata con medicamentos antivirales como oseltamivir,  " +
                                                  "\n zanamivir y baloxavir, que ayudan a reducir la duraci�n y severidad de la enfermedad. Adem�s del tratamiento         " +
                                                  "\n antiviral, es importante el uso de analg�sicos y antipir�ticos como paracetamol para aliviar los s�ntomas. Se        " +
                                                  "\n recomienda reposo absoluto y una alimentaci�n rica en antioxidantes para fortalecer el sistema inmunol�gico.         " +
                                                  "\n En casos graves, el m�dico puede indicar hospitalizaci�n para monitoreo y administraci�n de medicamentos intravenosos." +
                                                  "\n ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema inmunol�gico y mejorar la recuperaci�n, se recomienda el         " +
                                                  "\n consumo de alimentos ricos en vitaminas y minerales esenciales. FRUTAS C�TRICAS (naranjas, limones, toronjas):        " +
                                                  "\n Altas en VITAMINA C, que fortalece el sistema inmune, aportando aproximadamente 89% del requerimiento diario por      " +
                                                  "\n cada 100 gramos. JENGIBRE: Contiene compuestos con efectos antiinflamatorios que pueden ayudar a aliviar la irritaci�n" +
                                                  "\n de las v�as respiratorias, proporcionando 5% del requerimiento diario de antioxidantes por cada 10 gramos. MIEL:      " +
                                                  "\n Con propiedades antimicrobianas y calmantes para la garganta, aportando 20% del requerimiento diario de antioxidantes " +
                                                  "\n por cada 30 gramos. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que    " +
                                                  "\n la paciente tenga influenza ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico para  " +
                                                  "\n mayor seguridad y, por su salud, consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n EJERCICIO: Se recomienda reposo absoluto durante la fase aguda de la enfermedad para evitar complicaciones          " +
                                                  "\n respiratorias. Una vez superada la etapa cr�tica, se pueden realizar ejercicios de movilidad y respiraci�n          " +
                                                  "\n profunda para mejorar la capacidad pulmonar y reducir la fatiga. Tambi�n se recomienda ejercicios de expansi�n      " +
                                                  "\n tor�cica para fortalecer los m�sculos respiratorios y mejorar la oxigenaci�n. HIDRATACI�N: Es esencial el           " +
                                                  "\n consumo de 2.5 a 3 litros de agua, aproximadamente 10 a 12 vasos de tama�o regular, para mantener las v�as          " +
                                                  "\n respiratorias limpias y mejorar la eliminaci�n de secreciones. Tambi�n se recomienda el consumo de caldos y         " +
                                                  "\n l�quidos tibios para mejorar la absorci�n de nutrientes esenciales. POSIBLE TRATAMIENTO: La neumon�a se trata       " +
                                                  "\n con antibi�ticos como amoxicilina, azitromicina y ceftriaxona, dependiendo del agente causal. Adem�s del            " +
                                                  "\n tratamiento antibi�tico, se recomienda el uso de antipir�ticos para controlar la fiebre y broncodilatadores en      " +
                                                  "\n casos de dificultad respiratoria severa. En casos graves, el m�dico puede indicar hospitalizaci�n para administraci�n " +
                                                  "\n de ox�geno y monitoreo constante. ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema inmunol�gico y mejorar         " +
                                                  "\n la recuperaci�n, se recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales. FRUTAS C�TRICAS     " +
                                                  "\n (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema inmune, aportando aproximadamente 89%    " +
                                                  "\n del requerimiento diario por cada 100 gramos. PESCADOS GRASOS (salm�n, at�n): Fuente de OMEGA-3, con propiedades      " +
                                                  "\n antiinflamatorias, proporcionando aproximadamente 2.2 gramos por cada 100 gramos de pescado. VEGETALES DE HOJA        " +
                                                  "\n VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales para la regeneraci�n celular y la funci�n         " +
                                                  "\n muscular, aportando cerca del 15% del requerimiento diario por cada 100 gramos. Este es solo un diagn�stico           " +
                                                  "\n predeterminado l�gico. Haberlo consultado no garantiza al 100% que la paciente tenga neumon�a ni que el tratamiento   " +
                                                  "\n sea el adecuado. Se recomienda realizar m�s de un diagn�stico para mayor seguridad y, por su salud, consultar         " +
                                                  "\n a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica regular para mejorar la sensibilidad a la insulina y controlar       " +
                                                  "\n los niveles de glucosa en sangre. Ejercicios como caminatas, nataci�n y entrenamiento de resistencia pueden    " +
                                                  "\n ser beneficiosos para la regulaci�n metab�lica. Tambi�n se recomienda ejercicios de relajaci�n para reducir    " +
                                                  "\n el estr�s y mejorar el bienestar emocional. HIDRATACI�N: Es esencial el consumo de 2.5 a 3 litros de agua,     " +
                                                  "\n aproximadamente 10 a 12 vasos de tama�o regular, para facilitar la eliminaci�n de toxinas y mejorar la funci�n   " +
                                                  "\n celular. Mantener una hidrataci�n adecuada tambi�n contribuye a la absorci�n de nutrientes esenciales y al       " +
                                                  "\n fortalecimiento del sistema inmunol�gico. POSIBLE TRATAMIENTO: La diabetes se trata con medicamentos como        " +
                                                  "\n metformina, insulina y sulfonilureas, dependiendo del tipo y gravedad de la enfermedad. Adem�s del tratamiento   " +
                                                  "\n farmacol�gico, se recomienda el seguimiento de un plan de alimentaci�n adecuado y la monitorizaci�n constante    " +
                                                  "\n de los niveles de glucosa en sangre. En casos avanzados, el m�dico puede indicar el uso de bombas de insulina    " +
                                                  "\n o tratamientos combinados para mejorar el control de la enfermedad. Tambi�n es importante la educaci�n del       " +
                                                  "\n paciente sobre el manejo de la diabetes y la prevenci�n de complicaciones a largo plazo. ALIMENTACI�N RECOMENDADA: " +
                                                  "\n Para fortalecer el sistema inmunol�gico y mejorar la regulaci�n de la glucosa, se recomienda el consumo de         " +
                                                  "\n alimentos ricos en vitaminas y minerales esenciales. FRUTAS C�TRICAS (naranjas, limones, toronjas): Altas en       " +
                                                  "\n VITAMINA C, que fortalece el sistema inmune, aportando aproximadamente 89% del requerimiento diario por cada       " +
                                                  "\n 100 gramos. PESCADOS GRASOS (salm�n, at�n): Fuente de OMEGA-3, con propiedades antiinflamatorias, proporcionando   " +
                                                  "\n aproximadamente 2.2 gramos por cada 100 gramos de pescado. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en    " +
                                                  "\n HIERRO y MAGNESIO, fundamentales para la regeneraci�n celular y la funci�n muscular, aportando cerca del 15% del   " +
                                                  "\n requerimiento diario por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado    " +
                                                  "\n no garantiza al 100% que la paciente tenga diabetes ni que el tratamiento sea el adecuado. Se recomienda realizar  " +
                                                  "\n m�s de un diagn�stico para mayor seguridad y, por su salud, consultar a su m�dico. Angel L Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2 a 2.5 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda            " +
                                                  "\n a mantener las v�as respiratorias h�medas y reducir la inflamaci�n bronquial. Tambi�n es beneficioso complementar        " +
                                                  "\n con infusiones naturales como t� de jengibre o c�rcuma, que poseen propiedades antiinflamatorias y antioxidantes.        " +
                                                  "\n EJERCICIO. La actividad f�sica moderada es clave para fortalecer el sistema respiratorio y mejorar la capacidad          " +
                                                  "\n pulmonar. Se recomienda realizar ejercicio aer�bico moderado al menos 30 minutos al d�a, como caminar, nadar o andar     " +
                                                  "\n en bicicleta, evitando el sobreesfuerzo. Tambi�n es beneficioso incluir ejercicios de respiraci�n como yoga o t�cnicas   " +
                                                  "\n de expansi�n pulmonar. POSIBLE TRATAMIENTO. El tratamiento est�ndar incluye broncodilatadores de alivio r�pido como      " +
                                                  "\n salbutamol, y corticosteroides inhalados como fluticasona o budesonida, que ayudan a reducir la inflamaci�n y mejorar    " +
                                                  "\n la funci�n pulmonar. Tambi�n se pueden utilizar antagonistas de los receptores de leucotrienos, como montelukast, para   " +
                                                  "\n el control a largo plazo. Marcas reconocidas incluyen Ventolin, Aerolin, Flixotide, Pulmicort y Singulair. ALIMENTACI�N. " +
                                                  "\n Para fortalecer el sistema inmunol�gico y reducir la inflamaci�n, se recomienda consumir frutas c�tricas como naranja,   " +
                                                  "\n lim�n y toronja, que son ricas en vitamina C, la cual contribuye a la producci�n de gl�bulos blancos y mejora la         " +
                                                  "\n respuesta inmune. Verduras de hoja verde como espinaca y acelga, que contienen �cido f�lico, esencial para la producci�n " +
                                                  "\n de c�lulas sangu�neas. Pescados grasos como salm�n y sardina, que son ricos en Omega-3, el cual tiene propiedades        " +
                                                  "\n antiinflamatorias. Frutos secos como almendras y nueces, que aportan vitamina E, la cual protege las c�lulas del da�o    " +
                                                  "\n oxidativo. Legumbres como lentejas y garbanzos, que son fuente de prote�nas y hierro, esenciales para la energ�a y la    " +
                                                  "\n regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al 100% que     " + 
                                                  "\n el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar  " +
                                                  "\n m�s de un diagn�stico y consultar a un m�dico especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera" +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2.5 a 3 litros de agua al d�a, ya que una hidrataci�n adecuada          " +
                                                  "\n ayuda a mantener el equilibrio del sistema inmunol�gico y mejorar la absorci�n de los medicamentos               " +
                                                  "\n antirretrovirales. Tambi�n es beneficioso complementar con infusiones naturales como t� verde o manzanilla,      " +
                                                  "\n que poseen propiedades antioxidantes y antiinflamatorias. EJERCICIO. La actividad f�sica moderada es clave       " +
                                                  "\n para fortalecer el sistema inmunol�gico y mejorar la salud cardiovascular. Se recomienda realizar ejercicio      " +
                                                  "\n aer�bico moderado al menos 30 minutos al d�a, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo. " +
                                                  "\n Tambi�n es beneficioso incluir ejercicios de resistencia como levantamiento de pesas ligeras o yoga, que         " +
                                                  "\n ayudan a mantener la masa muscular y reducir el estr�s. POSIBLE TRATAMIENTO. El tratamiento est�ndar incluye     " +
                                                  "\n terapia antirretroviral (TAR) con medicamentos como tenofovir, emtricitabina y dolutegravir, que ayudan a        " +
                                                  "\n controlar la replicaci�n del virus y mejorar la calidad de vida. Tambi�n pueden utilizarse inhibidores de        " +
                                                  "\n proteasa, como darunavir, en combinaci�n con otros antirretrovirales. Marcas reconocidas incluyen Atripla,       " +
                                                  "\n Truvada, Tivicay, Biktarvy y Prezista. ALIMENTACI�N. Para fortalecer el sistema inmunol�gico y reducir la        " +
                                                  "\n inflamaci�n, se recomienda consumir frutas c�tricas como naranja, lim�n y toronja, que son ricas en vitamina C,  " +
                                                  "\n la cual contribuye a la producci�n de gl�bulos blancos y mejora la respuesta inmune. Verduras de hoja verde      " +
                                                  "\n como espinaca y kale, que contienen �cido f�lico y antioxidantes, esenciales para la regeneraci�n celular y      " +
                                                  "\n la protecci�n contra el da�o oxidativo. Pescados grasos como salm�n y at�n, que son ricos en Omega-3, el cual    " +
                                                  "\n tiene propiedades antiinflamatorias. Frutos secos como almendras y nueces, que aportan vitamina E, la cual       " +
                                                  "\n protege las c�lulas del da�o oxidativo. Legumbres como lentejas y garbanzos, que son fuente de prote�nas y       " +
                                                  "\n hierro, esenciales para la energ�a y la regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico. " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean    " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico    " +
                                                  "\n especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2 a 2.5 litros de agua al d�a, ya que una hidrataci�n adecuada      " +
                                                  "\n ayuda a eliminar toxinas y mantener el equilibrio del sistema inmunol�gico. Tambi�n es beneficioso           " +
                                                  "\n complementar con infusiones naturales como t� verde o manzanilla, que poseen propiedades antibacterianas     " +
                                                  "\n y antiinflamatorias. EJERCICIO. La actividad f�sica moderada es clave para fortalecer el sistema             " +
                                                  "\n inmunol�gico y mejorar la circulaci�n sangu�nea. Se recomienda realizar ejercicio aer�bico moderado al       " +
                                                  "\n menos 30 minutos al d�a, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo. Tambi�n es     " +
                                                  "\n beneficioso incluir ejercicios de resistencia como levantamiento de pesas ligeras o yoga, que ayudan a       " +
                                                  "\n mantener la masa muscular y reducir el estr�s. POSIBLE TRATAMIENTO. El tratamiento est�ndar incluye          " +
                                                  "\n antibi�ticos como ceftriaxona y azitromicina, que ayudan a eliminar la bacteria Neisseria gonorrhoeae.       " +
                                                  "\n En casos de resistencia, se pueden utilizar combinaciones de antibi�ticos como gentamicina con azitromicina.     " +
                                                  "\n Marcas reconocidas incluyen Rocephin, Zithromax y Gentak. ALIMENTACI�N. Para fortalecer el sistema inmunol�gico  " +
                                                  "\n y reducir la inflamaci�n, se recomienda consumir frutas c�tricas como naranja, lim�n y toronja, que son ricas    " +
                                                  "\n en vitamina C, la cual contribuye a la producci�n de gl�bulos blancos y mejora la respuesta inmune. Verduras     " +
                                                  "\n cruc�feras como br�coli y coliflor, que contienen vitamina K y antioxidantes, esenciales para la regeneraci�n    " +
                                                  "\n celular. Pescados grasos como salm�n y sardina, que son ricos en Omega-3, el cual tiene propiedades antiinflamatorias." +
                                                  "\n Legumbres como lentejas y garbanzos, que son fuente de prote�nas y hierro, esenciales para la energ�a y la    " +
                                                  "\n regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no garantiza al   " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se  " +
                                                  "\n recomienda realizar m�s de un diagn�stico y consultar a un m�dico especialista. Angel L Montes agradece tu    " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al d�a (aproximadamente           " +
                                                  "\n ocho a diez vasos de agua de tama�o regular) para mantener la hidrataci�n celular y ayudar al cuerpo a combatir       " +
                                                  "\n el virus. Tambi�n se recomienda el consumo de l�quidos ricos en antioxidantes como t� verde o infusiones de           " +
                                                  "\n manzanilla para mejorar la respuesta inmunol�gica. EJERCICIO: Se recomienda actividad f�sica moderada, evitando       " +
                                                  "\n el sobreesfuerzo durante los brotes. Ejercicios como yoga, pilates y caminatas suaves pueden ayudar a reducir el      " +
                                                  "\n estr�s, que es un factor desencadenante de los brotes de herpes. Adem�s, el ejercicio regular fortalece el sistema    " +
                                                  "\n inmunol�gico, lo que puede ayudar a reducir la frecuencia de los brotes. Es importante evitar actividades que generen " +
                                                  "\n fricci�n o sudoraci�n excesiva en la zona afectada, ya que esto puede agravar los s�ntomas. POSIBLE TRATAMIENTO:      " +
                                                  "\n El tratamiento para el herpes genital suele incluir antivirales como aciclovir, valaciclovir o famciclovir, que       " +
                                                  "\n ayudan a reducir la duraci�n y severidad de los brotes. Marcas reconocidas incluyen Zovirax y Valtrex. Tambi�n se     " +
                                                  "\n recomienda el uso de cremas t�picas para aliviar el dolor y la inflamaci�n, as� como el fortalecimiento del sistema   " +
                                                  "\n inmunol�gico mediante una dieta equilibrada y el manejo del estr�s. En algunos casos, los m�dicos pueden recomendar   " +
                                                  "\n suplementos de lisina, un amino�cido que puede ayudar a reducir la replicaci�n del virus. ALIMENTACI�N RECOMENDADA:   " +
                                                  "\n Para fortalecer el sistema inmunol�gico y ayudar en la recuperaci�n, se recomienda el consumo de FRUTAS C�TRICAS como    " +
                                                  "\n naranja y toronja, ricas en VITAMINA C, que fortalece el sistema inmune y aporta cerca del 89% del requerimiento diario  " +
                                                  "\n por cada 100 g. AR�NDANOS, ricos en ANTIOXIDANTES, que ayudan a reducir la inflamaci�n y aportan aproximadamente el 50%  " +
                                                  "\n del requerimiento diario de VITAMINA C por cada 100 g. AJO, con propiedades ANTIVIRALES, que pueden ayudar a combatir el " +
                                                  "\n virus y fortalecer el sistema inmunol�gico. ESPINACA, fuente de HIERRO y VITAMINA E, que ayuda a mejorar la regeneraci�n " +
                                                  "\n celular y aporta aproximadamente el 15% del requerimiento diario de HIERRO por cada 100 g. Este es solo un diagn�stico   " +
                                                  "\n predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas " +
                                                  "\n sean completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento  " +
                                                  "\n adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar  " +
                                                  "\n a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al d�a (aproximadamente          " +
                                                  "\n ocho a diez vasos de agua de tama�o regular) para ayudar al cuerpo a eliminar la bacteria y prevenir la              " +
                                                  "\n deshidrataci�n causada por fiebre y malestar. Tambi�n se recomienda el consumo de l�quidos ricos en electrolitos     " +
                                                  "\n como agua de coco o caldos naturales para mejorar la recuperaci�n. EJERCICIO: Se recomienda reposo moderado          " +
                                                  "\n mientras persistan los s�ntomas, evitando esfuerzos f�sicos intensos. Sin embargo, una vez recuperada, se pueden     " +
                                                  "\n realizar ejercicios de bajo impacto como yoga o estiramientos suaves para mejorar la circulaci�n y fortalecer el     " +
                                                  "\n sistema inmunol�gico. La actividad f�sica regular puede ayudar a mejorar la respuesta del cuerpo al tratamiento      " +
                                                  "\n antibi�tico, ya que estimula la circulaci�n sangu�nea y la oxigenaci�n celular. POSIBLE TRATAMIENTO: El tratamiento  " +
                                                  "\n para la s�filis suele incluir antibi�ticos como la penicilina G benzatina, que es el tratamiento de primera l�nea.   " +
                                                  "\n Marcas reconocidas incluyen Benzetacil. En casos de alergia a la penicilina, se pueden utilizar alternativas como    " +
                                                  "\n doxiciclina o azitromicina. Es fundamental completar el tratamiento indicado por el m�dico para evitar complicaciones   " +
                                                  "\n y recurrencias. Adem�s, se recomienda evitar el consumo de alcohol y tabaco durante el tratamiento, ya que pueden       " +
                                                  "\n interferir con la eficacia de los antibi�ticos y prolongar la recuperaci�n. ALIMENTACI�N RECOMENDADA: Para fortalecer   " +
                                                  "\n el sistema inmunol�gico y ayudar en la recuperaci�n, se recomienda el consumo de YOGUR NATURAL, rico en PROBI�TICOS,    " +
                                                  "\n que favorecen la recuperaci�n intestinal y aportan aproximadamente 10^9 UFC por cada 100 g. AJO, con propiedades        " +
                                                  "\n ANTIBACTERIANAS, que pueden ayudar a combatir la infecci�n y aporta compuestos bioactivos como alicina. ESPINACA,       " +
                                                  "\n fuente de VITAMINA C y HIERRO, que fortalece el sistema inmune y aporta cerca del 15% del requerimiento diario de       " +
                                                  "\n HIERRO por cada 100 g. FRUTOS ROJOS, ricos en ANTIOXIDANTES, que ayudan a reducir la inflamaci�n y aportan aproximadamente " +
                                                  "\n el 50% del requerimiento diario de VITAMINA C por cada 100 g. Este es solo un diagn�stico predeterminado l�gico.      " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente" +
                                                  "\n correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s,  " +
                                                  "\n por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.      " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2.5 a 3 litros de agua al d�a (aproximadamente           " +
                                                  "\n diez a doce vasos de agua de tama�o regular) para mantener la hidrataci�n de las v�as respiratorias y ayudar          " +
                                                  "\n al cuerpo a eliminar la bacteria. Tambi�n se recomienda el consumo de l�quidos tibios como t� de jengibre o           " +
                                                  "\n caldos naturales para mejorar la funci�n pulmonar. EJERCICIO: Se recomienda reposo absoluto mientras persistan        " +
                                                  "\n los s�ntomas, evitando cualquier actividad f�sica intensa. Una vez recuperada, se pueden realizar ejercicios de       " +
                                                  "\n respiraci�n y fortalecimiento pulmonar para mejorar la capacidad respiratoria y reducir la fatiga. Tambi�n es         " +
                                                  "\n recomendable evitar ambientes con humo o contaminaci�n que puedan agravar los s�ntomas. La rehabilitaci�n pulmonar    " +
                                                  "\n puede ser una opci�n efectiva para mejorar la funci�n respiratoria en pacientes con tuberculosis, incluyendo          " +
                                                  "\n ejercicios de expansi�n tor�cica y t�cnicas de respiraci�n profunda. POSIBLE TRATAMIENTO: El tratamiento para         " +
                                                  "\n la tuberculosis suele incluir una combinaci�n de antibi�ticos como isoniazida, rifampicina, etambutol y pirazinamida, " +
                                                  "\n administrados durante un per�odo de seis meses o m�s. Es fundamental seguir el tratamiento de manera estricta para    " +
                                                  "\n evitar la resistencia bacteriana y garantizar la recuperaci�n completa. Adem�s, se recomienda una alimentaci�n rica   " +
                                                  "\n en prote�nas y vitaminas para fortalecer el sistema inmunol�gico y mejorar la respuesta al tratamiento. ALIMENTACI�N  " +
                                                  "\n RECOMENDADA: Para fortalecer el sistema respiratorio y reducir la inflamaci�n, se recomienda el consumo de FRUTAS     " +
                                                  "\n C�TRICAS como naranja y toronja, ricas en VITAMINA C, que fortalece el sistema inmune y aporta cerca del 89% del      " +
                                                  "\n requerimiento diario por cada 100 g. PESCADOS GRASOS como salm�n y at�n, ricos en �CIDOS GRASOS OMEGA-3, que poseen   " +
                                                  "\n propiedades antiinflamatorias y aportan aproximadamente el 50% del requerimiento diario por cada 100 g. ESPINACA,     " +
                                                  "\n fuente de HIERRO y ANTIOXIDANTES, que ayudan a mejorar la oxigenaci�n celular y aportan aproximadamente el 15% del      " +
                                                  "\n requerimiento diario de HIERRO por cada 100 g. JENGIBRE, con propiedades ANTIINFLAMATORIAS y antioxidantes, que pueden  " +
                                                  "\n aliviar s�ntomas respiratorios y mejorar la funci�n pulmonar. Este es solo un diagn�stico predeterminado l�gico.        " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente  " +
                                                  "\n correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su " +
                                                  "\n salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes    " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular)              " +
                                                  "\n para mantener una hidrataci�n adecuada. La hidrataci�n es clave para reducir la inflamaci�n en las articulaciones         " +
                                                  "\n y mejorar la movilidad. Tambi�n es recomendable el consumo de infusiones antiinflamatorias como t� de c�rcuma o           " +
                                                  "\n jengibre. EJERCICIO: Se aconseja actividad f�sica moderada y adaptada a la condici�n de la paciente. Se recomienda        " +
                                                  "\n ejercicios de bajo impacto como nataci�n, yoga o pilates para fortalecer los m�sculos sin generar estr�s en las           " +
                                                  "\n articulaciones. Tambi�n es beneficioso realizar ejercicios de movilidad articular y estiramientos para mejorar la         " +
                                                  "\n flexibilidad y reducir la rigidez. POSIBLE TRATAMIENTO: Para la artritis en mujeres adultas, el tratamiento suele         " +
                                                  "\n incluir medicamentos antiinflamatorios no esteroides como el ibuprofeno o el naproxeno, corticosteroides en casos         " +
                                                  "\n m�s severos y medicamentos antirreum�ticos modificadores de la enfermedad como el metotrexato. Tambi�n se recomienda      " +
                                                  "\n la fisioterapia y el uso de suplementos como el col�geno y la glucosamina para mejorar la salud articular. ALIMENTACI�N:  " +
                                                  "\n Se recomienda el consumo de alimentos con propiedades antiinflamatorias y antioxidantes para mejorar la funci�n           " +
                                                  "\n articular: Pescados grasos (salm�n, at�n): Ricos en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias.      " +
                                                  "\n Frutas y verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli): Ricas en antioxidantes como la vitamina C     " +
                                                  "\n y carotenoides, que pueden proteger las c�lulas del da�o. Jengibre: Contiene compuestos con efectos antiinflamatorios     " +
                                                  "\n que podr�an ser beneficiosos para las articulaciones. C�rcuma: Con su componente activo, la curcumina, tiene potentes     " +
                                                  "\n propiedades antiinflamatorias y antioxidantes. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado      " +
                                                  "\n no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas,  " +
                                                  "\n para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado " +
                                                  "\n de su paciente, adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se le recomienda mucho    " +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tama�o regular)          " +
                                                  "\n para mantener una hidrataci�n adecuada y ayudar a aliviar la irritaci�n de las v�as respiratorias. Tambi�n          " +
                                                  "\n es recomendable el consumo de infusiones calientes como t� de miel y lim�n para calmar la tos y mejorar la          " +
                                                  "\n respiraci�n. EJERCICIO: Se aconseja actividad f�sica ligera y progresiva, evitando esfuerzos intensos mientras      " +
                                                  "\n persistan los s�ntomas. Se recomienda caminatas suaves de 15 a 30 minutos diarios para mejorar la oxigenaci�n       " +
                                                  "\n y la recuperaci�n pulmonar. Tambi�n es importante evitar ambientes con humo o polvo que puedan agravar la tos.      " +
                                                  "\n POSIBLE TRATAMIENTO: Para la tosferina en mujeres adultas, el tratamiento suele incluir antibi�ticos como la        " +
                                                  "\n azitromicina o la claritromicina para reducir la duraci�n de la enfermedad y evitar complicaciones. Tambi�n se      " +
                                                  "\n recomienda el uso de humidificadores y el descanso adecuado para facilitar la recuperaci�n. ALIMENTACI�N: Se        " +
                                                  "\n recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales para fortalecer el sistema inmunol�gico" +
                                                  "\n y mejorar la funci�n pulmonar: Naranjas y mandarinas: Ricas en vitamina C, esenciales para mejorar la respuesta     " +
                                                  "\n inmune. Jengibre: Posee propiedades antiinflamatorias y antioxidantes que pueden aliviar la congesti�n. Espinacas   " +
                                                  "\n y br�coli: Ricos en vitamina A y vitamina C, esenciales para fortalecer el sistema inmunol�gico y acelerar la       " +
                                                  "\n recuperaci�n. Miel: Tiene propiedades antibacterianas y ayuda a calmar la irritaci�n de la garganta. Este es solo   " +
                                                  "\n un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad  " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico  " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s, por su salud, si la   " +
                                                  "\n respuesta del diagn�stico no le satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes    " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular)       " +
                                                  "\n para mantener una hidrataci�n adecuada y ayudar a reducir la fiebre. Tambi�n es recomendable el consumo de         " +
                                                  "\n caldos y sopas calientes para mejorar la hidrataci�n y aliviar la inflamaci�n de las gl�ndulas salivales.          " +
                                                  "\n EJERCICIO: Se aconseja evitar actividad f�sica intensa mientras persistan los s�ntomas. Se recomienda descanso     " +
                                                  "\n absoluto y caminatas suaves para mejorar la circulaci�n y el bienestar general. POSIBLE TRATAMIENTO: Para las      " +
                                                  "\n paperas en mujeres adultas, el tratamiento suele incluir medicamentos para reducir la fiebre y aliviar los         " +
                                                  "\n s�ntomas, como el paracetamol o el ibuprofeno. Tambi�n se recomienda el reposo, la hidrataci�n adecuada y una      " +
                                                  "\n alimentaci�n de consistencia blanda para facilitar la ingesta de alimentos. ALIMENTACI�N: Se recomienda el         " +
                                                  "\n consumo de alimentos ricos en vitaminas y minerales esenciales para fortalecer el sistema inmunol�gico y mejorar   " +
                                                  "\n la recuperaci�n: Yogur natural: Rico en probi�ticos, ayuda a restaurar la flora intestinal y mejorar la digesti�n. " +
                                                  "\n Pl�tanos: Contienen potasio, esencial para reponer electrolitos perdidos y mejorar la funci�n muscular. Arroz      " +
                                                  "\n y pan tostado: Son f�ciles de digerir y ayudan a estabilizar el sistema digestivo. Zanahorias: Ricas en vitamina A," +
                                                  "\n esenciales para la regeneraci�n celular y la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico,      " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus    " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor   " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s, por su salud, si la respuesta del diagn�stico no le   " +
                                                  "\n satisface del todo, se le recomienda mucho consultar a su m�dico. Angel L Montes agradece tu visita a la app       " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N. Es fundamental mantener una hidrataci�n adecuada para reducir los s�ntomas y prevenir                 " +
                                                  "\n complicaciones, se recomienda el consumo de 2 a 2.5 litros de agua al d�a, adem�s de l�quidos ricos                " +
                                                  "\n en electrolitos como agua de coco o sueros orales para evitar la deshidrataci�n causada por fiebre                 " +
                                                  "\n y sudoraci�n, tambi�n se recomienda el consumo de infusiones naturales como t� de jengibre para aliviar            " +
                                                  "\n la inflamaci�n y mejorar la circulaci�n sangu�nea. EJERCICIO. La actividad f�sica debe ser ligera y                " +
                                                  "\n adaptada a la condici�n del paciente, se recomienda caminatas suaves y ejercicios de movilidad para                " +
                                                  "\n mejorar la circulaci�n y reducir la fatiga, adem�s el descanso adecuado es clave para la recuperaci�n,             " +
                                                  "\n evitando esfuerzos excesivos mientras persistan los s�ntomas, ejercicios de respiraci�n profunda pueden            " +
                                                  "\n ayudar a mejorar la oxigenaci�n y reducir el estr�s. POSIBLE TRATAMIENTO. No existe un f�rmaco antiviral           " +
                                                  "\n espec�fico para tratar la infecci�n por virus Zika, el tratamiento es sintom�tico e incluye antiinflamatorios      " +
                                                  "\n no esteroideos y analg�sicos como el paracetamol para reducir la fiebre y aliviar el malestar, tambi�n se          " +
                                                  "\n recomienda reposo, ingesta de abundantes l�quidos y administraci�n de antihistam�nicos para controlar el           " +
                                                  "\n prurito asociado con el exantema, es fundamental seguir las indicaciones m�dicas y evitar la automedicaci�n,       " +
                                                  "\n en casos graves se recomienda acudir al m�dico para evaluar posibles complicaciones neurol�gicas. ALIMENTACI�N.    " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema    " +
                                                  "\n inmunol�gico, NARANJA. Rica en vitamina C que ayuda a reducir la inflamaci�n y fortalecer el sistema inmune,       " +
                                                  "\n aporta aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE. Contiene compuestos  " +
                                                  "\n con efectos antiinflamatorios y ayuda a aliviar la fiebre y el malestar, su consumo puede aportar hasta el 20% de     " +
                                                  "\n la ingesta diaria recomendada de antioxidantes. MIEL. Posee propiedades antimicrobianas y ayuda a calmar la garganta  " +
                                                  "\n y reducir la inflamaci�n, aporta cerca del 10% de la ingesta diaria recomendada de antioxidantes por cada cucharada.  " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa  " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un     " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud " +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N. Es crucial mantener una hidrataci�n adecuada para prevenir la deshidrataci�n causada por la           " +
                                                  "\n diarrea y el v�mito, se recomienda el consumo de 2.5 a 3 litros de agua al d�a, adem�s de soluciones de            " +
                                                  "\n rehidrataci�n oral como Pedialyte para recuperar electrolitos esenciales, tambi�n se recomienda el consumo         " +
                                                  "\n de caldos ligeros y agua de coco para reponer minerales perdidos y evitar la deshidrataci�n severa, el             " +
                                                  "\n consumo de agua con lim�n puede ayudar a mejorar la absorci�n de nutrientes y fortalecer el sistema inmunol�gico.  " +
                                                  "\n EJERCICIO. Durante la fase aguda de la enfermedad se recomienda reposo absoluto para evitar la deshidrataci�n      " +
                                                  "\n y el desgaste f�sico, una vez recuperada la paciente puede retomar actividades ligeras como caminatas cortas       " +
                                                  "\n para mejorar la circulaci�n y fortalecer el sistema inmunol�gico, adem�s ejercicios de movilidad pueden ayudar     " +
                                                  "\n a recuperar la energ�a y mejorar la digesti�n, el yoga y la respiraci�n profunda pueden ser beneficiosos para      " +
                                                  "\n reducir el estr�s y mejorar la funci�n digestiva. POSIBLE TRATAMIENTO. No existe un tratamiento espec�fico para    " +
                                                  "\n la infecci�n por rotavirus, el manejo se centra en la prevenci�n de la deshidrataci�n mediante el consumo de       " +
                                                  "\n l�quidos y soluciones de rehidrataci�n oral, en casos graves puede requerirse la administraci�n de l�quidos        " +
                                                  "\n intravenosos en el hospital, es fundamental seguir las indicaciones m�dicas y evitar el consumo de alimentos       " +
                                                  "\n irritantes, tambi�n se recomienda el consumo de probi�ticos para restaurar la flora intestinal y mejorar la        " +
                                                  "\n absorci�n de nutrientes esenciales. ALIMENTACI�N. Se recomienda el consumo de alimentos ricos en fibra y probi�ticos   " +
                                                  "\n para restaurar la flora intestinal, PL�TANO. Rico en potasio que ayuda a recuperar los electrolitos perdidos, aporta   " +
                                                  "\n aproximadamente el 10% de la ingesta diaria recomendada por cada 100 gramos. YOGURT NATURAL. Contiene probi�ticos que  " + 
                                                  "\n ayudan a restaurar la flora intestinal, su consumo puede aportar hasta el 20% de la ingesta diaria recomendada de      " +
                                                  "\n probi�ticos. ZANAHORIA. Rica en vitamina A que ayuda a la regeneraci�n celular intestinal, aporta aproximadamente el   " +
                                                  "\n 56% de la ingesta diaria recomendada por cada 100 gramos. Este es solo un Diagn�stico predeterminado l�gico, haberlo   " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n     " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento  " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda       " +
                                                  "\n mucho consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N. Es fundamental mantener una hidrataci�n adecuada para ayudar al cuerpo a eliminar la infecci�n             " +
                                                  "\n y reducir la fiebre, se recomienda el consumo de 2 a 2.5 litros de agua al d�a, adem�s de infusiones sin az�car         " +
                                                  "\n como t� verde o agua de jamaica para mejorar la circulaci�n, tambi�n se recomienda el consumo de agua con miel          " +
                                                  "\n y lim�n para aliviar la irritaci�n y fortalecer el sistema inmunol�gico, el consumo de caldos ricos en minerales        " +
                                                  "\n puede ayudar a mejorar la recuperaci�n y fortalecer el sistema digestivo. EJERCICIO. Se recomienda actividad f�sica     " +
                                                  "\n moderada como caminatas, nataci�n o yoga para mejorar la circulaci�n y fortalecer el sistema inmunol�gico, adem�s       " +
                                                  "\n ejercicios de movilidad pueden ayudar a reducir la inflamaci�n y mejorar la recuperaci�n, es importante realizar        " + 
                                                  "\n ejercicio de manera constante y bajo supervisi�n m�dica, ejercicios de respiraci�n profunda pueden ayudar a mejorar     " +
                                                  "\n la oxigenaci�n y reducir el estr�s. POSIBLE TRATAMIENTO. El tratamiento suele incluir antibi�ticos como la ampicilina   " +
                                                  "\n o gentamicina, adem�s pueden recetarse medicamentos complementarios para aliviar los s�ntomas, tambi�n se recomienda    " +
                                                  "\n el uso de probi�ticos para mejorar la flora intestinal y reducir el riesgo de reinfecci�n, es fundamental seguir las    " +
                                                  "\n indicaciones m�dicas y evitar el consumo de alimentos contaminados, en casos graves se recomienda acudir al m�dico      " +
                                                  "\n para evaluar posibles complicaciones neurol�gicas. ALIMENTACI�N. Se recomienda el consumo de alimentos ricos en         " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, AR�NDANOS. Ricos en antioxidantes que    " +
                                                  "\n ayudan a combatir infecciones, aportan aproximadamente el 25% de la ingesta diaria recomendada por cada 100 gramos.     " +
                                                  "\n AJO. Contiene compuestos antimicrobianos que pueden ayudar a combatir la infecci�n, su consumo puede aportar hasta el   " +
                                                  "\n 20% de la ingesta diaria recomendada de antioxidantes. JENGIBRE. Contiene propiedades antiinflamatorias que pueden      " +
                                                  "\n ayudar a reducir los s�ntomas, su consumo puede aportar hasta el 15% de la ingesta diaria recomendada de antioxidantes. " +
                                                  "\n Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa    " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un       " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud   " +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2.5 litros de agua al d�a (aproximadamente diez      " +
                                                  "\n vasos de agua de tama�o regular) para prevenir la deshidrataci�n causada por diarrea intensa. Tambi�n se          " +
                                                  "\n recomienda el consumo de suero oral y bebidas con electrolitos para evitar la p�rdida excesiva de minerales       " +
                                                  "\n esenciales. EJERCICIO: Se recomienda reposo absoluto mientras persistan los s�ntomas, evitando cualquier          " +
                                                  "\n actividad f�sica intensa. Una vez recuperada, se pueden realizar ejercicios de bajo impacto como caminatas        " +
                                                  "\n suaves y estiramientos para mejorar la circulaci�n y fortalecer el sistema digestivo. POSIBLE TRATAMIENTO:        " +
                                                  "\n El tratamiento para la shigelosis suele incluir antibi�ticos como ciprofloxacino o azitromicina en casos          " +
                                                  "\n graves. Tambi�n se recomienda el consumo de alimentos ricos en fibra para ayudar a regular el tr�nsito            " +
                                                  "\n intestinal y mejorar la digesti�n. ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema digestivo y ayudar        " +
                                                  "\n en la recuperaci�n, se recomienda el consumo de PL�TANO, rico en POTASIO, que ayuda a reponer electrolitos        " +
                                                  "\n perdidos, aportando aproximadamente el 12% del requerimiento diario por cada 100 g. ARROZ BLANCO, fuente de       " +
                                                  "\n CARBOHIDRATOS de f�cil digesti�n, que ayuda a estabilizar el sistema digestivo. MANZANA, rica en PECTINA, que     " +
                                                  "\n contribuye a la regulaci�n intestinal y aporta cerca del 10% del requerimiento diario de FIBRA por cada 100 g.    " +
                                                  "\n ZANAHORIA, fuente de VITAMINA A, que ayuda a la regeneraci�n celular y aporta aproximadamente el 89% del          " +
                                                  "\n requerimiento diario por cada 100 g. Este es solo un diagn�stico predeterminado l�gico. Haberlo consultado no     " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se    " +
                                                  "\n recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s, por su salud,  " +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al d�a (aproximadamente        " +
                                                  "\n ocho a diez vasos de agua de tama�o regular) para mantener la hidrataci�n de las v�as respiratorias y reducir      " +
                                                  "\n la acumulaci�n de mucosidad. Tambi�n se recomienda el consumo de l�quidos tibios como t� de jengibre o caldos      " +
                                                  "\n naturales para mejorar la funci�n pulmonar. EJERCICIO: Se recomienda actividad f�sica moderada, como caminatas     " +
                                                  "\n diarias de 30 a 60 minutos, ejercicios de respiraci�n y fortalecimiento pulmonar. Evitar la exposici�n a           " +
                                                  "\n contaminantes y humo de tabaco es crucial para prevenir exacerbaciones. POSIBLE TRATAMIENTO: El tratamiento para   " +
                                                  "\n la EPOC suele incluir broncodilatadores de acci�n r�pida y prolongada, como el salbutamol y corticosteroides       " +
                                                  "\n inhalados como la fluticasona. En casos avanzados, puede requerirse oxigenoterapia y rehabilitaci�n pulmonar.      " +
                                                  "\n ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema respiratorio y reducir la inflamaci�n, se recomienda el       " +
                                                  "\n consumo de PESCADOS GRASOS como salm�n y at�n, ricos en �CIDOS GRASOS OMEGA-3, que poseen propiedades antiinflamatorias" +
                                                  "\n y aportan aproximadamente el 50% del requerimiento diario por cada 100 g. FRUTAS C�TRICAS como naranja y toronja,      " +
                                                  "\n ricas en VITAMINA C, que fortalece el sistema inmune y aporta cerca del 89% del requerimiento diario por cada 100 g.   " +
                                                  "\n ESPINACA, fuente de HIERRO y ANTIOXIDANTES, que ayudan a mejorar la oxigenaci�n celular y aportan aproximadamente el   " +
                                                  "\n 15% del requerimiento diario de HIERRO por cada 100 g. JENGIBRE, con propiedades ANTIINFLAMATORIAS y antioxidantes,    " +
                                                  "\n que pueden aliviar s�ntomas respiratorios y mejorar la funci�n pulmonar. Este es solo un diagn�stico predeterminado    " +
                                                  "\n l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean       " +
                                                  "\n completamente correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. " +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.   " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de al menos 2 litros de agua al d�a (aproximadamente ocho vasos de          " +
                                                  "\n agua de tama�o regular) para ayudar al cuerpo a eliminar la bacteria y prevenir la deshidrataci�n causada         " +
                                                  "\n por fiebre y malestar. Tambi�n es recomendable el consumo de l�quidos ricos en electrolitos como agua de          " +
                                                  "\n coco o caldos naturales para mejorar la recuperaci�n. EJERCICIO: Se recomienda reposo moderado mientras           " +
                                                  "\n persistan los s�ntomas, evitando esfuerzos f�sicos intensos. Sin embargo, una vez recuperada, se pueden           " +
                                                  "\n realizar ejercicios de bajo impacto como yoga o estiramientos suaves para mejorar la circulaci�n y fortalecer     " +
                                                  "\n el sistema inmunol�gico. POSIBLE TRATAMIENTO: El tratamiento para la clamidia suele incluir antibi�ticos como     " +
                                                  "\n azitromicina o doxiciclina. Es fundamental completar el tratamiento indicado por el m�dico para evitar            " +
                                                  "\n complicaciones y recurrencias. ALIMENTACI�N RECOMENDADA: Para fortalecer el sistema inmunol�gico y ayudar en      " +
                                                  "\n la recuperaci�n, se recomienda el consumo de YOGUR NATURAL, rico en PROBI�TICOS, que favorecen la recuperaci�n    " +
                                                  "\n intestinal y aportan aproximadamente 10^9 UFC por cada 100 g. AJO, con propiedades ANTIBACTERIANAS, que pueden    " +
                                                  "\n ayudar a combatir la infecci�n y aporta compuestos bioactivos como alicina. ESPINACA, fuente de VITAMINA C y      " +
                                                  "\n HIERRO, que fortalece el sistema inmune y aporta cerca del 15% del requerimiento diario de HIERRO por cada 100 g. " +
                                                  "\n FRUTOS ROJOS, ricos en ANTIOXIDANTES, que ayudan a reducir la inflamaci�n y aportan aproximadamente el 50% del    " +
                                                  "\n requerimiento diario de VITAMINA C por cada 100 g. Este es solo un diagn�stico predeterminado l�gico. Haberlo     " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente    " +
                                                  "\n correctas. Se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. Adem�s,  " +
                                                  "\n por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.      " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2.5 a 3 litros de agua al d�a, ya que una hidrataci�n adecuada           " +
                                                  "\n ayuda a mantener el equilibrio del sistema nervioso y reducir la inflamaci�n de las meninges. Tambi�n es          " +
                                                  "\n beneficioso complementar con infusiones naturales como t� de manzanilla o jengibre, que poseen propiedades        " +
                                                  "\n antiinflamatorias y relajantes. EJERCICIO. La actividad f�sica moderada es clave para fortalecer el sistema       " +
                                                  "\n inmunol�gico y mejorar la circulaci�n sangu�nea. Se recomienda realizar ejercicio aer�bico moderado al menos      " +
                                                  "\n 30 minutos al d�a, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo. Tambi�n es beneficioso    " +
                                                  "\n incluir ejercicios de respiraci�n como yoga o t�cnicas de expansi�n pulmonar para mejorar la oxigenaci�n          " +
                                                  "\n cerebral. POSIBLE TRATAMIENTO. El tratamiento est�ndar incluye antibi�ticos como ceftriaxona, vancomicina         " +
                                                  "\n y ampicilina, que ayudan a eliminar la bacteria causante de la meningitis. En casos graves, se puede requerir     " +
                                                  "\n hospitalizaci�n para administraci�n intravenosa de antibi�ticos y monitoreo de s�ntomas. Tambi�n es importante    " +
                                                  "\n el uso de antiinflamatorios y analg�sicos para reducir el dolor y la fiebre. ALIMENTACI�N. Para fortalecer el     " +
                                                  "\n sistema inmunol�gico y reducir la inflamaci�n, se recomienda consumir frutas c�tricas como naranja, lim�n y          " +
                                                  "\n toronja, que son ricas en vitamina C, la cual contribuye a la producci�n de gl�bulos blancos y mejora la respuesta   " +
                                                  "\n inmune. Verduras cruc�feras como br�coli y coliflor, que contienen vitamina K y antioxidantes, esenciales para la    " +
                                                  "\n regeneraci�n celular y la protecci�n del sistema nervioso. Pescados grasos como salm�n y sardina, que son ricos en   " +
                                                  "\n Omega-3, el cual tiene propiedades antiinflamatorias. Legumbres como lentejas y garbanzos, que son fuente de         " +
                                                  "\n prote�nas y hierro, esenciales para la energ�a y la regeneraci�n celular. Este es solo un diagn�stico predeterminado " +
                                                  "\n l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean     " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico especialista. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N. Se recomienda el consumo de 2.5 a 3 litros de agua al d�a, ya que una hidrataci�n adecuada ayuda a       " +
                                                  "\n mantener el equilibrio celular y mejorar la eliminaci�n de toxinas. Tambi�n es beneficioso complementar con           " +
                                                  "\n infusiones naturales como t� verde o c�rcuma, que poseen propiedades antioxidantes y anticancer�genas. EJERCICIO.     " +
                                                  "\n La actividad f�sica moderada es clave para fortalecer el sistema inmunol�gico y mejorar la salud cardiovascular.      " +
                                                  "\n Se recomienda realizar ejercicio aer�bico moderado al menos 30 minutos al d�a, como caminar, nadar o andar en         " +
                                                  "\n bicicleta, evitando el sobreesfuerzo. Tambi�n es beneficioso incluir ejercicios de resistencia como levantamiento     " +
                                                  "\n de pesas ligeras o yoga, que ayudan a mantener la masa muscular y reducir el estr�s. POSIBLE TRATAMIENTO. El          " +
                                                  "\n tratamiento est�ndar incluye quimioterapia, radioterapia y terapia dirigida, dependiendo del tipo y estadio del       " +
                                                  "\n c�ncer. En algunos casos, se puede recurrir a inmunoterapia, que ayuda al sistema inmunol�gico a combatir las         " +
                                                  "\n c�lulas cancerosas. Marcas reconocidas incluyen Herceptin, Avastin, Keytruda y Opdivo. Tambi�n es importante el       " +
                                                  "\n uso de suplementos nutricionales para mantener la energ�a y reducir los efectos secundarios del tratamiento.          " +
                                                  "\n ALIMENTACI�N. Para fortalecer el sistema inmunol�gico y reducir la inflamaci�n, se recomienda consumir frutas         " +
                                                  "\n c�tricas como naranja, lim�n y toronja, que son ricas en vitamina C, la cual contribuye a la producci�n de gl�bulos   " +
                                                  "\n blancos y mejora la respuesta inmune. Verduras de hoja verde como espinaca y kale, que contienen �cido f�lico y       " +
                                                  "\n antioxidantes, esenciales para la regeneraci�n celular y la protecci�n contra el da�o oxidativo. Pescados grasos      " +
                                                  "\n como salm�n y at�n, que son ricos en Omega-3, el cual tiene propiedades antiinflamatorias. Frutos secos como almendras  " +
                                                  "\n y nueces, que aportan vitamina E, la cual protege las c�lulas del da�o oxidativo. Legumbres como lentejas y garbanzos,  " +
                                                  "\n que son fuente de prote�nas y hierro, esenciales para la energ�a y la regeneraci�n celular. Este es solo un diagn�stico " +
                                                  "\n predeterminado l�gico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las    " +
                                                  "\n respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un  " +
                                                  "\n m�dico especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.50-1.75 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N Para el tratamiento de la influenza es fundamental mantener una hidrataci�n adecuada con un consumo   " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a la      " +
                                                  "\n recuperaci�n y prevenir la deshidrataci�n causada por la fiebre EJERCICIO Se recomienda ejercicio moderado como   " +
                                                  "\n caminatas suaves o yoga evitando esfuerzos intensos mientras persistan los s�ntomas POSIBLE TRATAMIENTO El        " +
                                                  "\n tratamiento suele incluir medicamentos para reducir la fiebre y aliviar los s�ntomas como el paracetamol marca    " +
                                                  "\n com�n Tempra o el ibuprofeno En casos m�s severos los m�dicos pueden recetar antivirales espec�ficos contra la    " +
                                                  "\n gripe como el oseltamivir marca com�n Tamiflu Es importante seguir las indicaciones m�dicas y evitar el uso de    " +
                                                  "\n aspirina ya que puede generar complicaciones en algunos casos ALIMENTOS RECOMENDADOS Para fortalecer el sistema   " +
                                                  "\n inmunol�gico y acelerar la recuperaci�n se recomienda el consumo de NARANJAS Y GUAYABAS Ricas en vitamina C que   " +
                                                  "\n ayuda a reducir la duraci�n de los s�ntomas aportando aproximadamente el 89% de la ingesta diaria recomendada por " +
                                                  "\n cada 100 gramos JENGIBRE Contiene compuestos con propiedades antiinflamatorias y puede aliviar la congesti�n      " +
                                                  "\n adem�s de aportar antioxidantes esenciales MIEL Y LIM�N Combinaci�n efectiva para calmar la garganta y reducir la " +
                                                  "\n tos aportando flavonoides y vitamina C ESPINACAS Y BR�COLI Aportan antioxidantes y vitamina A esenciales para la  " +
                                                  "\n regeneraci�n celular con un contenido de aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos " +
                                                  "\n YOGUR NATURAL Contiene probi�ticos que pueden fortalecer el sistema inmunol�gico y mejorar la salud digestiva     " +
                                                  "\n aportando calcio y prote�nas esenciales Este es solo un diagn�stico predeterminado l�gico haberlo consultado no   " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para      " +
                                                  "\n ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado " +
                                                  "\n de su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho   " +
                                                  "\n consultar a su m�dico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N Para el tratamiento de la neumon�a es fundamental mantener una hidrataci�n adecuada con               " +
                                                  "\n un consumo diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular            " +
                                                  "\n para ayudar a la recuperaci�n y prevenir la deshidrataci�n causada por la fiebre EJERCICIO Se recomienda          " +
                                                  "\n actividad f�sica moderada como caminatas suaves evitando esfuerzos intensos mientras persistan los                " +
                                                  "\n s�ntomas Una vez superada la fase aguda es recomendable realizar ejercicios de respiraci�n profunda y             " +
                                                  "\n expansi�n pulmonar como t�cnicas de fisioterapia respiratoria para mejorar la capacidad pulmonar y reducir        " +
                                                  "\n la sensaci�n de fatiga POSIBLE TRATAMIENTO El tratamiento suele incluir antibi�ticos como la amoxicilina          " +
                                                  "\n la azitromicina o la ceftriaxona en casos m�s severos los m�dicos pueden recetar antivirales como el              " +
                                                  "\n oseltamivir adem�s de medicamentos para reducir la fiebre como el paracetamol o el ibuprofeno Es importante       " +
                                                  "\n seguir las indicaciones m�dicas y evitar la automedicaci�n ALIMENTOS RECOMENDADOS Para fortalecer el sistema      " +
                                                  "\n inmunol�gico y acelerar la recuperaci�n se recomienda el consumo de NARANJAS Y GUAYABAS Ricas en vitamina C       " +
                                                  "\n que ayuda a reducir la duraci�n de los s�ntomas aportando aproximadamente el 89% de la ingesta diaria             " +
                                                  "\n recomendada por cada 100 gramos JENGIBRE Contiene compuestos con propiedades antiinflamatorias y puede aliviar    " +
                                                  "\n la congesti�n adem�s de aportar antioxidantes esenciales ESPINACAS Y BR�COLI Aportan antioxidantes y vitamina A   " +
                                                  "\n esenciales para la regeneraci�n celular con un contenido de aproximadamente 56% de la ingesta diaria recomendada  " +
                                                  "\n por cada 100 gramos YOGUR NATURAL Contiene probi�ticos que pueden fortalecer el sistema inmunol�gico y mejorar    " +
                                                  "\n la salud digestiva aportando calcio y prote�nas esenciales Este es solo un diagn�stico predeterminado l�gico      " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean          " +
                                                  "\n completamente correctas para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor      " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente adem�s por su salud si la respuesta del Diagn�stico no le     " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico Angel L Montes agradece tu visita a la app Mi     " +
                                                  "\n Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACI�N Para el tratamiento de la diabetes es fundamental mantener una hidrataci�n adecuada con un consumo          " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a la            " +
                                                  "\n regulaci�n de la glucosa en sangre y prevenir la deshidrataci�n EJERCICIO Se recomienda actividad f�sica regular        " +
                                                  "\n como caminatas nataci�n o ejercicios de resistencia para mejorar la sensibilidad a la insulina y controlar los          " +
                                                  "\n niveles de glucosa en sangre Adem�s se recomienda la pr�ctica de ejercicios aer�bicos como ciclismo o baile al          " +
                                                  "\n menos 150 minutos por semana para mejorar la funci�n cardiovascular y reducir el riesgo de complicaciones POSIBLE       " +
                                                  "\n TRATAMIENTO El tratamiento suele incluir medicamentos como la metformina para mejorar la sensibilidad a la insulina     " +
                                                  "\n en casos m�s severos los m�dicos pueden recetar insulina de acci�n r�pida o prolongada adem�s de medicamentos para      " +
                                                  "\n controlar la presi�n arterial y el colesterol Es importante seguir las indicaciones m�dicas y mantener un monitoreo     " +
                                                  "\n constante de los niveles de glucosa ALIMENTOS RECOMENDADOS Para fortalecer el metabolismo y mejorar el control de la    " +  
                                                  "\n glucosa se recomienda el consumo de FRUTOS ROJOS Ricos en antioxidantes y fibra que ayudan a regular la glucosa en      " +
                                                  "\n sangre aportando aproximadamente el 32% de la ingesta diaria recomendada por cada 100 gramos FRUTOS SECOS Contienen     " +
                                                  "\n grasas saludables y fibra que pueden mejorar la sensibilidad a la insulina aportando aproximadamente el 25% de la       " +
                                                  "\n ingesta diaria recomendada por cada 100 gramos ESPINACAS Y BR�COLI Aportan antioxidantes y vitamina A esenciales para   " +
                                                  "\n la regeneraci�n celular con un contenido de aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos    " +
                                                  "\n AVENA Rica en fibra soluble que ayuda a estabilizar los niveles de glucosa en sangre aportando aproximadamente el 40%   " +
                                                  "\n de la ingesta diaria recomendada por cada 100 gramos Este es solo un diagn�stico predeterminado l�gico haberlo          " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas  " +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado " +
                                                  "\n de su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho   " +
                                                  "\n consultar a su m�dico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N Para el tratamiento del asma es fundamental mantener una hidrataci�n adecuada con un consumo diario       " +
                                                  "\n recomendado de 1.5 a 2 litros de agua aproximadamente 6 a 8 vasos de tama�o regular para ayudar a mantener las        " +
                                                  "\n v�as respiratorias hidratadas y reducir la inflamaci�n EJERCICIO Se recomienda actividad f�sica de forma controlada   " + 
                                                  "\n y supervisada con calentamiento previo y enfriamiento posterior evitando desencadenantes conocidos del asma como      " +
                                                  "\n al�rgenos aire fr�o o contaminado y pausas si presenta s�ntomas Adem�s se recomienda la pr�ctica de ejercicios de     " +
                                                  "\n respiraci�n profunda como t�cnicas de relajaci�n y yoga para mejorar la capacidad pulmonar y reducir la sensaci�n     " +
                                                  "\n de opresi�n en el pecho POSIBLE TRATAMIENTO El tratamiento suele incluir broncodilatadores de alivio r�pido como      " +
                                                  "\n el salbutamol marca com�n Ventolin o Aerolin corticosteroides inhalados para el control a largo plazo como la         " +
                                                  "\n fluticasona o budesonida marcas comunes Flixotide o Pulmicort y en algunos casos modificadores de leucotrienos como   " +
                                                  "\n el montelukast marca com�n Singulair Es fundamental seguir estrictamente el plan de acci�n para el asma indicado por  " +
                                                  "\n el m�dico y usar los medicamentos preventivos regularmente ALIMENTOS RECOMENDADOS Para fortalecer el sistema          " +
                                                  "\n respiratorio y reducir la inflamaci�n se recomienda el consumo de PESCADOS GRASOS Salm�n y at�n ricos en �cidos       " +
                                                  "\n grasos Omega-3 que poseen propiedades antiinflamatorias que pueden ayudar a reducir la inflamaci�n de las v�as        " +
                                                  "\n respiratorias aportando aproximadamente el 50% de la ingesta diaria recomendada por cada 100 gramos FRUTAS Y VERDURAS " +
                                                  "\n DE COLORES VIVOS Ar�ndanos fresas espinacas br�coli ricos en antioxidantes como la vitamina C y carotenoides que      " +
                                                  "\n pueden proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico aportando aproximadamente el 70% de la      " +
                                                  "\n ingesta diaria recomendada por cada 100 gramos JENGIBRE Contiene compuestos con efectos antiinflamatorios que podr�an " +
                                                  "\n ser beneficiosos para las v�as respiratorias C�RCUMA Con su componente activo la curcumina tambi�n tiene potentes     " +
                                                  "\n propiedades antiinflamatorias y antioxidantes Este es solo un diagn�stico predeterminado l�gico haberlo consultado    " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para    " +
                                                  "\n ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado  " +
                                                  "\n de su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho    " +
                                                  "\n consultar a su m�dico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente mantenga una hidrataci�n adecuada, consumiendo al menos 2 a 2.5              " +
                                                  "\n litros de agua al d�a (aproximadamente ocho a diez vasos de agua de tama�o regular) para ayudar a la funci�n             " +
                                                  "\n renal y la eliminaci�n de toxinas. EJERCICIO: Se recomienda actividad f�sica moderada como caminatas, yoga o             " +
                                                  "\n entrenamiento de resistencia, adaptado a su estado de salud y bajo supervisi�n m�dica, evitando el sobreesfuerzo.        " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento est�ndar incluye terapia antirretroviral (TAR), que combina varios medicamentos      " +
                                                  "\n para suprimir la replicaci�n del virus y mejorar la calidad de vida. Algunos f�rmacos comunes incluyen Tenofovir,        " +
                                                  "\n Emtricitabina, Efavirenz (marca Atripla), Dolutegravir (marca Tivicay) y Lamivudina (marca Epivir). Es crucial seguir    " +
                                                  "\n estrictamente el tratamiento indicado por el m�dico y realizar controles peri�dicos. ALIMENTACI�N: Se recomienda el      " +
                                                  "\n consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como: NARANJAS     " +
                                                  "\n (ricas en vitamina C, que fortalece el sistema inmune, aportando aproximadamente 89% del requerimiento diario por cada   " +
                                                  "\n 100 g); AGUACATE (fuente de grasas saludables y antioxidantes, con 14% de la ingesta diaria recomendada de vitamina E    " +
                                                  "\n por cada 100 g); PESCADOS GRASOS (salm�n, at�n, ricos en Omega-3, que pueden ayudar a reducir la inflamaci�n, aportando  " +
                                                  "\n cerca de 50% de la ingesta diaria recomendada por cada porci�n de 100 g); VERDURAS DE HOJA VERDE (espinacas, kale, con   " +
                                                  "\n vitamina A y hierro, esenciales para la salud celular, aportando 56% de la ingesta diaria recomendada de vitamina A por  " +
                                                  "\n cada 100 g); LEGUMBRES (frijoles, lentejas, que aportan prote�nas y fibra, con 37% de la ingesta diaria recomendada de   " +
                                                  "\n hierro por cada 100 g). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que   " +
                                                  "\n la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar  " +
                                                  "\n m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la " +
                                                  "\n respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu      " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2 a 2.5 litros de agua al d�a (aproximadamente ocho a diez vasos       " +
                                                  "\n de agua de tama�o regular) para ayudar a la eliminaci�n de toxinas y mantener la funci�n renal �ptima.          " +
                                                  "\n Mantener una hidrataci�n adecuada tambi�n contribuye a la regulaci�n de la temperatura corporal y al            " +
                                                  "\n transporte eficiente de nutrientes esenciales para la recuperaci�n. EJERCICIO: Actividad f�sica moderada        " +
                                                  "\n como caminatas o ejercicios de bajo impacto es recomendable para fortalecer el sistema inmunol�gico y mejorar   " +
                                                  "\n la circulaci�n, evitando el sobreesfuerzo. El ejercicio regular ayuda a reducir el estr�s, lo que puede mejorar    " +
                                                  "\n la respuesta del sistema inmune y acelerar la recuperaci�n. POSIBLE TRATAMIENTO: El tratamiento est�ndar incluye   " +
                                                  "\n antibi�ticos como Ceftriaxona (inyecci�n �nica) y Azitromicina (dosis oral), los cuales ayudan a eliminar la       " +
                                                  "\n bacteria Neisseria gonorrhoeae. Es fundamental completar el tratamiento indicado por el m�dico para evitar la      " +
                                                  "\n resistencia bacteriana y prevenir complicaciones como la enfermedad inflamatoria p�lvica. ALIMENTACI�N: Se         " +
                                                  "\n recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n,      " +
                                                  "\n tales como: Naranjas (ricas en vitamina C, que fortalece el sistema inmune, aportando aproximadamente 89% del      " +
                                                  "\n requerimiento diario por cada 100 g); Espinacas (fuente de hierro, esencial para la producci�n de gl�bulos rojos,  " +
                                                  "\n con 56% de la ingesta diaria recomendada por cada 100 g); Yogur natural (rico en probi�ticos, que favorecen la salud  " +
                                                  "\n intestinal y el sistema inmune, aportando 30% de la ingesta diaria recomendada de calcio por cada 100 g). Este es     " +
                                                  "\n solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta         " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico" +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del  " +
                                                  "\n diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2 litros de agua al d�a (aproximadamente ocho vasos de agua de tama�o    " +
                                                  "\n regular) para ayudar a mantener la piel hidratada y reducir la inflamaci�n. La hidrataci�n adecuada tambi�n       " +
                                                  "\n contribuye a la regeneraci�n celular y a la eliminaci�n de toxinas, lo que puede ayudar a reducir la frecuencia   " +
                                                  "\n y severidad de los brotes. EJERCICIO: Actividad f�sica moderada como yoga o ejercicios de relajaci�n pueden       " +
                                                  "\n ayudar a reducir el estr�s, que es un factor desencadenante de brotes de herpes. La pr�ctica de ejercicios de     " +
                                                  "\n respiraci�n y meditaci�n tambi�n puede mejorar la respuesta del sistema inmunol�gico y reducir la inflamaci�n.    " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento est�ndar incluye antivirales como Aciclovir, Valaciclovir y Famciclovir,      " + 
                                                  "\n los cuales ayudan a reducir la duraci�n y severidad de los brotes. Es importante iniciar el tratamiento lo antes  " +
                                                  "\n posible para minimizar los s�ntomas y reducir el riesgo de transmisi�n. ALIMENTACI�N: Se recomienda el consumo    " +
                                                  "\n de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como: Kiwi (rico en " +
                                                  "\n vitamina C, que fortalece el sistema inmune, aportando aproximadamente 92% del requerimiento diario por cada      " +
                                                  "\n 100 g); Almendras (fuente de L-lisina, un amino�cido que puede ayudar a reducir la replicaci�n del virus, con 25%     " +
                                                  "\n de la ingesta diaria recomendada por cada 100 g); Jengibre (contiene compuestos con efectos antiinflamatorios,        " +
                                                  "\n que pueden ser beneficiosos para la piel y el sistema inmune). Este es solo un diagn�stico predeterminado l�gico,     " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente" +
                                                  "\n correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en      " +
                                                  "\n el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda" +
                                                  "\n consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 litros de agua al d�a (aproximadamente diez vasos de agua de tama�o          " +
                                                  "\n regular) para ayudar a la eliminaci�n de toxinas y mejorar la circulaci�n sangu�nea. La hidrataci�n adecuada tambi�n      " +
                                                  "\n contribuye a la funci�n hep�tica y renal, lo que facilita la eliminaci�n de bacterias y toxinas del cuerpo. EJERCICIO:    " +
                                                  "\n Actividad f�sica moderada como caminatas o ejercicios de bajo impacto es recomendable para fortalecer el sistema          " +
                                                  "\n inmunol�gico y mejorar la circulaci�n. El ejercicio tambi�n puede ayudar a reducir la fatiga y mejorar la funci�n         " +
                                                  "\n cardiovascular, lo que es esencial para la recuperaci�n. POSIBLE TRATAMIENTO: El tratamiento est�ndar incluye antibi�ticos" +
                                                  "\n como Penicilina G Benzatina (inyecci�n �nica) y Doxiciclina (alternativa para personas al�rgicas a la penicilina). Es     " +
                                                  "\n fundamental seguir el tratamiento completo para evitar complicaciones graves como la neuros�filis. ALIMENTACI�N: Se       " +
                                                  "\n recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como: " +
                                                  "\n Pl�tanos (ricos en potasio, que ayuda a la funci�n cardiovascular y muscular, aportando aproximadamente 23% del           " +
                                                  "\n requerimiento diario por cada 100 g); Br�coli (fuente de vitamina C, que fortalece el sistema inmune, con 135% de la        " +
                                                  "\n ingesta diaria recomendada por cada 100 g); Lentejas (ricas en hierro, esencial para la producci�n de gl�bulos rojos, con   " +
                                                  "\n 37% de la ingesta diaria recomendada por cada 100 g). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello,   " +
                                                  "\n se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Adem�s, " +
                                                  "\n por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Para una mujer adulta con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidrataci�n          " +
                                                  "\n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se               " +
                                                  "\n recomienda actividad f�sica moderada, como caminatas diarias de 30 minutos, yoga o ejercicios de respiraci�n para          " +
                                                  "\n fortalecer los pulmones. Es importante evitar esfuerzos excesivos y asegurarse de que el entorno est� bien ventilado.      " +
                                                  "\n HIDRATACI�N. Se aconseja consumir al menos 2 a 2.5 litros de agua al d�a para mantener una buena hidrataci�n y ayudar      " +
                                                  "\n a eliminar toxinas del cuerpo. POSIBLE TRATAMIENTO. El tratamiento est�ndar para la tuberculosis incluye una combinaci�n   " +
                                                  "\n de antibi�ticos como isoniazida, rifampicina, etambutol y pirazinamida. Marcas reconocidas de estos medicamentos           " +  
                                                  "\n incluyen Rifater y Rimactane. Es crucial seguir el tratamiento completo para evitar resistencia a los antibi�ticos.        " +
                                                  "\n ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica en prote�nas, vitaminas y minerales para fortalecer el sistema      " +
                                                  "\n inmunol�gico. Algunos alimentos clave incluyen carnes magras y pescado que aportan prote�nas esenciales para la            " + 
                                                  "\n regeneraci�n celular y fortalecimiento del sistema inmunol�gico. Frutas c�tricas como naranja, lim�n y kiwi, ricas en      " +
                                                  "\n vitamina C, que ayuda a la recuperaci�n y fortalecimiento del sistema inmune, aportando aproximadamente el 89% del         " +
                                                  "\n requerimiento diario por cada 100 gramos de consumo. Verduras de hoja verde como espinaca y br�coli, que contienen hierro  " +
                                                  "\n y antioxidantes esenciales para la producci�n de gl�bulos rojos y la oxigenaci�n celular, aportando cerca del 15% del      " +
                                                  "\n requerimiento diario por cada 100 gramos. Frutos secos y semillas como almendras, nueces y ch�a, que contienen vitamina E  " +
                                                  "\n y �cidos grasos esenciales, contribuyendo a la protecci�n celular y fortalecimiento del sistema inmunol�gico, con un       " +
                                                  "\n aporte del 37% del requerimiento diario por cada 28 gramos de consumo. Este diagn�stico es una referencia l�gica basada en " +
                                                  "\n informaci�n m�dica, pero no garantiza al 100% que el paciente tenga tuberculosis ni que el tratamiento sea el adecuado.    " +
                                                  "\n Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu visita" +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n Para una mujer adulta con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidrataci�n      " +
                                                  "\n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se           " +
                                                  "\n recomienda actividad f�sica de bajo impacto como nataci�n, yoga o caminatas suaves de 30 minutos al d�a para mejorar   " +
                                                  "\n la movilidad articular y reducir la inflamaci�n. Tambi�n es beneficioso realizar ejercicios de fortalecimiento         " +
                                                  "\n muscular con bandas de resistencia o pesas ligeras, ya que ayudan a estabilizar las articulaciones y prevenir el       " +
                                                  "\n deterioro �seo. Adem�s, el ejercicio aer�bico moderado, como el ciclismo o la el�ptica, puede mejorar la circulaci�n   " +
                                                  "\n y reducir la rigidez matutina. HIDRATACI�N. Se aconseja consumir al menos 2 litros de agua al d�a para mantener la     " +
                                                  "\n lubricaci�n de las articulaciones y reducir la rigidez. Adem�s, el t� verde es una excelente opci�n, ya que contiene   " +
                                                  "\n polifenoles con propiedades antiinflamatorias que pueden ayudar a reducir el dolor articular. Tambi�n se recomienda    " +
                                                  "\n el consumo de caldos naturales y jugos de frutas sin az�car a�adida para mantener el equilibrio de electrolitos y      " +
                                                  "\n mejorar la absorci�n de nutrientes esenciales. POSIBLE TRATAMIENTO. El tratamiento para la artritis incluye            " +
                                                  "\n medicamentos antiinflamatorios no esteroides como ibuprofeno y naproxeno, adem�s de f�rmacos modificadores de          " +
                                                  "\n la enfermedad como metotrexato y sulfasalazina. Tambi�n se pueden utilizar terapias biol�gicas como los inhibidores    " +
                                                  "\n del factor de necrosis tumoral (TNF), que han demostrado ser eficaces en el control de la inflamaci�n cr�nica.         " +
                                                  "\n En algunos casos, se recomienda la fisioterapia para mejorar la movilidad y reducir el dolor. Marcas reconocidas       " +
                                                  "\n incluyen Advil, Aleve y Arava. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica en antioxidantes y �cidos        " +
                                                  "\n grasos esenciales. Algunos alimentos clave incluyen pescados grasos como salm�n y at�n, ricos en omega-3, que ayudan   " +
                                                  "\n a reducir la inflamaci�n, aportando aproximadamente el 70% del requerimiento diario por cada 100 gramos de consumo.    " +
                                                  "\n Frutas c�tricas como naranja y kiwi, ricas en vitamina C, que contribuyen a la producci�n de col�geno y fortalecen     " +
                                                  "\n el sistema inmunol�gico, con un aporte del 89% del requerimiento diario por cada 100 gramos. Verduras de hoja verde    " +
                                                  "\n como espinaca y br�coli, que contienen hierro y antioxidantes esenciales para la producci�n de gl�bulos rojos y la     " +
                                                  "\n oxigenaci�n celular, aportando cerca del 15% del requerimiento diario por cada 100 gramos. Frutos secos y semillas     " +
                                                  "\n como almendras y nueces, que contienen vitamina E y �cidos grasos esenciales, contribuyendo a la protecci�n celular    " +
                                                  "\n y fortalecimiento del sistema inmunol�gico, con un aporte del 37% del requerimiento diario por cada 28 gramos de       " +
                                                  "\n consumo. Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el      " +
                                                  "\n paciente tenga artritis ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar" +
                                                  "\n a un m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Para una mujer adulta con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una                   " +
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales.              " +
                                                  "\n EJERCICIO. Se recomienda actividad f�sica ligera como caminatas cortas y ejercicios de respiraci�n para                 " +
                                                  "\n fortalecer los pulmones sin generar fatiga excesiva. Tambi�n es recomendable realizar ejercicios de expansi�n           " +
                                                  "\n tor�cica y t�cnicas de respiraci�n profunda para mejorar la capacidad pulmonar y reducir la sensaci�n de ahogo.         " +
                                                  "\n Adem�s, el uso de t�cnicas de relajaci�n como la meditaci�n y el control de la respiraci�n puede ayudar a               " +
                                                  "\n reducir la ansiedad provocada por la dificultad respiratoria. HIDRATACI�N. Se aconseja consumir al menos 2.5            " +
                                                  "\n litros de agua al d�a para mantener las v�as respiratorias hidratadas y facilitar la eliminaci�n de mucosidad.          " +
                                                  "\n Adem�s, el consumo de l�quidos tibios como infusiones de jengibre y miel puede ayudar a calmar la irritaci�n de         " +
                                                  "\n garganta y mejorar la expectoraci�n. Tambi�n se recomienda el consumo de caldos naturales y jugos c�tricos para         " +
                                                  "\n mantener el equilibrio de electrolitos y fortalecer el sistema inmunol�gico. POSIBLE TRATAMIENTO. El tratamiento        " +
                                                  "\n para la tosferina incluye antibi�ticos como azitromicina, claritromicina y eritromicina. Tambi�n se recomienda el       " +
                                                  "\n uso de broncodilatadores en casos de dificultad respiratoria severa. En algunos casos, los m�dicos pueden indicar       " +
                                                  "\n el uso de corticosteroides para reducir la inflamaci�n de las v�as respiratorias. Marcas reconocidas incluyen           " +
                                                  "\n Zithromax, Biaxin y Erythrocin. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica en vitaminas y antioxidantes     " +
                                                  "\n para fortalecer el sistema inmunol�gico. Algunos alimentos clave incluyen frutas c�tricas como naranja y lim�n,         " +
                                                  "\n ricas en vitamina C, que ayudan a la recuperaci�n y fortalecimiento del sistema inmune, aportando aproximadamente el    " +
                                                  "\n 89% del requerimiento diario por cada 100 gramos de consumo. Verduras como zanahoria y espinaca, ricas en vitamina A,   " +
                                                  "\n que contribuyen a la salud respiratoria y fortalecen las mucosas, con un aporte del 15% del requerimiento diario por    " +
                                                  "\n cada 100 gramos. Miel, que posee propiedades antibacterianas y ayuda a calmar la irritaci�n de garganta, proporcionando " +
                                                  "\n alivio inmediato. Jengibre, con efectos antiinflamatorios que pueden ayudar a reducir la congesti�n y mejorar la        " +
                                                  "\n respiraci�n. Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que      " +
                                                  "\n el paciente tenga tosferina ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y       " +
                                                  "\n consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Para una mujer adulta con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una           " +
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales.      " +
                                                  "\n EJERCICIO. Se recomienda reposo y evitar actividad f�sica intensa hasta la recuperaci�n completa para           " +
                                                  "\n prevenir complicaciones. Sin embargo, ejercicios suaves de movilidad pueden ser beneficiosos para evitar        " +
                                                  "\n la rigidez muscular y mejorar la circulaci�n. Tambi�n se recomienda realizar ejercicios de estiramiento         " +
                                                  "\n para reducir la tensi�n muscular y mejorar la recuperaci�n. HIDRATACI�N. Se aconseja consumir al menos 2        " +
                                                  "\n litros de agua al d�a para mantener una buena hidrataci�n y aliviar la inflamaci�n de las gl�ndulas             " +
                                                  "\n salivales. Tambi�n se recomienda el consumo de caldos y jugos naturales para mantener el equilibrio de          " +
                                                  "\n electrolitos. Adem�s, el consumo de bebidas ricas en antioxidantes como el t� verde puede ayudar a fortalecer   " +
                                                  "\n el sistema inmunol�gico. POSIBLE TRATAMIENTO. El tratamiento para las paperas es sintom�tico e incluye          " +
                                                  "\n analg�sicos como paracetamol e ibuprofeno para reducir el dolor y la fiebre. En casos severos, se pueden        " +
                                                  "\n administrar corticosteroides para reducir la inflamaci�n. Tambi�n se recomienda el uso de compresas fr�as       " +
                                                  "\n para aliviar la hinchaz�n de las gl�ndulas salivales. Marcas reconocidas incluyen Tempra y Advil. ALIMENTACI�N  " +
                                                  "\n RECOMENDADA. Se recomienda una dieta suave y rica en nutrientes esenciales. Algunos alimentos clave incluyen    " +
                                                  "\n yogur y pur� de papas, que son f�ciles de consumir y ayudan a mantener la energ�a sin irritar las gl�ndulas     " +
                                                  "\n salivales. Frutas como pl�tano y mango, ricas en vitamina B6, que contribuyen a la reducci�n de la inflamaci�n  " +
                                                  "\n y fortalecen el sistema inmunol�gico, con un aporte del 30% del requerimiento diario por cada 100 gramos.       " +
                                                  "\n Verduras como zanahoria y calabac�n, ricas en vitamina A, que ayudan a la regeneraci�n celular y fortalecen las " +
                                                  "\n mucosas, con un aporte del 15% del requerimiento diario por cada 100 gramos. Miel, que posee propiedades        " +
                                                  "\n antibacterianas y ayuda a calmar la irritaci�n de garganta. Este diagn�stico es una referencia l�gica basada en   " +
                                                  "\n informaci�n m�dica, pero no garantiza al 100% que el paciente tenga paperas ni que el tratamiento sea el adecuado." +
                                                  "\n Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes         " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n El virus del Zika es transmitido por la picadura del mosquito Aedes aegypti y puede causar s�ntomas como      " +
                                                  "\n fiebre, conjuntivitis, dolor muscular y erupciones cut�neas. Aunque la enfermedad suele ser leve, es          " +
                                                  "\n importante tomar medidas para aliviar los s�ntomas y prevenir complicaciones. EJERCICIO. Se recomienda        " +
                                                  "\n actividad f�sica moderada, evitando esfuerzos excesivos si hay fiebre o fatiga. Caminar y ejercicios de       " +
                                                  "\n bajo impacto pueden ser beneficiosos para mantener la circulaci�n y el bienestar general. Es recomendable     " +
                                                  "\n realizar ejercicios de movilidad articular y respiraci�n profunda para mejorar la oxigenaci�n y reducir       " +
                                                  "\n el estr�s, lo que puede favorecer la recuperaci�n. Tambi�n se sugiere evitar la exposici�n prolongada al      " +
                                                  "\n sol y mantenerse en ambientes frescos para prevenir el agotamiento. HIDRATACI�N. Es fundamental consumir      " +
                                                  "\n 2 a 2.5 litros de agua al d�a para ayudar al cuerpo a combatir la infecci�n y mantenerse hidratado. La        " +
                                                  "\n hidrataci�n adecuada contribuye a la regulaci�n de la temperatura corporal, la eliminaci�n de toxinas y       " +
                                                  "\n el mantenimiento de la funci�n celular. Se recomienda complementar la ingesta de agua con l�quidos ricos      " +
                                                  "\n en electrolitos como sueros orales o agua de coco, que pueden ayudar a reponer minerales esenciales           " +
                                                  "\n perdidos por la fiebre y sudoraci�n. POSIBLE TRATAMIENTO. No existe un tratamiento antiviral espec�fico       " +
                                                  "\n para el Zika. Se recomienda el uso de paracetamol para aliviar la fiebre y el dolor, evitando el ibuprofeno   " +
                                                  "\n y la aspirina, ya que pueden aumentar el riesgo de sangrado. Adem�s, es importante descansar adecuadamente    " +
                                                  "\n y evitar el estr�s para permitir que el sistema inmunol�gico combata la infecci�n de manera eficiente. Se     " +
                                                  "\n sugiere el uso de compresas fr�as para reducir la fiebre y aliviar el malestar general. ALIMENTACI�N RECOMENDADA. " +
                                                  "\n Consumir alimentos ricos en antioxidantes y vitaminas para fortalecer el sistema inmunol�gico. Frutas c�tricas    " +
                                                  "\n como naranja, lim�n y toronja, ricas en vitamina C, que ayuda a la recuperaci�n, aportando aproximadamente el     " +
                                                  "\n 89% del requerimiento diario por cada 100 g. Papaya, que contiene vitamina A y C, adem�s de enzimas que pueden    " +
                                                  "\n favorecer la digesti�n y el bienestar general, proporcionando cerca del 75% de la vitamina C diaria por cada      " +
                                                  "\n 100 g. Jengibre, con propiedades antiinflamatorias que pueden ayudar a aliviar s�ntomas como dolor muscular,      " +
                                                  "\n aportando antioxidantes esenciales. Verduras de hoja verde como espinaca y acelga, que contienen hierro y         " +
                                                  "\n antioxidantes esenciales para la recuperaci�n, proporcionando hasta el 15% del requerimiento diario de hierro     " +
                                                  "\n por cada 100 g. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que    " +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se      " +
                                                  "\n recomienda hacer m�s de un diagn�stico de (Mi Vida) para establecer mejor seguridad en el tratamiento adecuado    " +
                                                  "\n de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda     " +
                                                  "\n mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n El rotavirus es una infecci�n viral que causa gastroenteritis, caracterizada por diarrea severa, v�mitos,            " +
                                                  "\n fiebre y deshidrataci�n. Aunque suele afectar m�s a ni�os, los adultos tambi�n pueden padecerlo, especialmente       " +
                                                  "\n si tienen contacto con personas infectadas. EJERCICIO. Se recomienda actividad f�sica ligera mientras persistan      " +
                                                  "\n los s�ntomas, evitando esfuerzos intensos que puedan agravar la deshidrataci�n. Caminar y realizar estiramientos     " +
                                                  "\n suaves pueden ser beneficiosos para mantener la circulaci�n y el bienestar general. HIDRATACI�N. Es fundamental      " +
                                                  "\n consumir entre 2.5 y 3 litros de agua al d�a para compensar la p�rdida de l�quidos causada por la diarrea y los      " + 
                                                  "\n v�mitos. Tambi�n se recomienda el consumo de soluciones de rehidrataci�n oral que contienen electrolitos esenciales  " +
                                                  "\n como sodio y potasio, ayudando a restablecer el equilibrio h�drico del cuerpo. POSIBLE TRATAMIENTO. No existe un     " +
                                                  "\n tratamiento antiviral espec�fico para el rotavirus. Se recomienda el uso de paracetamol para aliviar la fiebre y     " +
                                                  "\n el malestar, evitando el ibuprofeno y la aspirina, ya que pueden irritar el est�mago. En casos graves, puede ser     " +
                                                  "\n necesario el uso de l�quidos intravenosos para prevenir la deshidrataci�n severa. ALIMENTACI�N RECOMENDADA.          " +
                                                  "\n Consumir alimentos de f�cil digesti�n y ricos en nutrientes esenciales para la recuperaci�n. Pl�tano, rico en        " +
                                                  "\n potasio, que ayuda a reponer los electrolitos perdidos, aportando aproximadamente el 10% del requerimiento diario       " +
                                                  "\n por cada 100 g. Arroz blanco, fuente de carbohidratos de f�cil digesti�n, que contribuye a la recuperaci�n intestinal.  " +
                                                  "\n Zanahoria, rica en vitamina A y antioxidantes, que favorecen la regeneraci�n de la mucosa intestinal, proporcionando    " +
                                                  "\n cerca del 15% del requerimiento diario de vitamina A por cada 100 g. Manzana, con pectina que ayuda a regular el        " +
                                                  "\n tr�nsito intestinal, aportando fibra soluble beneficiosa para la digesti�n. Este es solo un diagn�stico predeterminado  " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad       " +
                                                  "\n y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer        " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no       " +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app          " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria." +
                                                  "\n La listeriosis es una infecci�n bacteriana causada por Listeria monocytogenes, que puede provocar fiebre,          " +
                                                  "\n dolores musculares, n�useas y, en casos graves, afectar el sistema nervioso. EJERCICIO. Se recomienda              " +
                                                  "\n actividad f�sica moderada, evitando esfuerzos excesivos si hay fiebre o fatiga. Caminar y ejercicios de            " +
                                                  "\n bajo impacto pueden ser beneficiosos para mantener la circulaci�n y el bienestar general. Tambi�n se sugiere       " +
                                                  "\n realizar ejercicios de respiraci�n profunda para mejorar la oxigenaci�n y reducir el estr�s. HIDRATACI�N. Es       " +
                                                  "\n fundamental consumir entre 2 y 2.5 litros de agua al d�a para ayudar al cuerpo a combatir la infecci�n y           " +
                                                  "\n mantenerse hidratado. Se recomienda complementar la ingesta de agua con l�quidos ricos en electrolitos como        " +
                                                  "\n sueros orales o agua de coco, que pueden ayudar a reponer minerales esenciales perdidos por la fiebre y sudoraci�n." +
                                                  "\n POSIBLE TRATAMIENTO. La listeriosis se trata con antibi�ticos como la ampicilina o el trimetoprima-sulfametoxazol, " +
                                                  "\n que ayudan a eliminar la bacteria. En casos graves, puede ser necesario el uso de antibi�ticos intravenosos        " +
                                                  "\n para controlar la infecci�n. ALIMENTACI�N RECOMENDADA. Consumir alimentos ricos en antioxidantes y vitaminas       " +
                                                  "\n para fortalecer el sistema inmunol�gico. Espinaca, rica en hierro y vitamina K, que favorece la recuperaci�n       " +
                                                  "\n celular, proporcionando hasta el 20% del requerimiento diario de hierro por cada 100 g. Yogur natural, fuente      " +
                                                  "\n de probi�ticos que ayudan a fortalecer la flora intestinal y mejorar la respuesta inmune. Frutas c�tricas como     " +
                                                  "\n naranja y toronja, ricas en vitamina C, que contribuyen a la recuperaci�n, aportando aproximadamente el 89% del    " +
                                                  "\n requerimiento diario por cada 100 g. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no      " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas," +
                                                  "\n para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le      " +
                                                  "\n recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n La shigelosis es una infecci�n bacteriana causada por Shigella, que provoca diarrea con sangre, fiebre, calambres       " +
                                                  "\n abdominales y deshidrataci�n. EJERCICIO. Se recomienda actividad f�sica ligera mientras persistan los s�ntomas,         " +
                                                  "\n evitando esfuerzos intensos que puedan agravar la deshidrataci�n. Caminar y realizar estiramientos suaves pueden        " +
                                                  "\n ser beneficiosos para mantener la circulaci�n y el bienestar general. HIDRATACI�N. Es fundamental consumir entre        " +
                                                  "\n 2.5 y 3 litros de agua al d�a para compensar la p�rdida de l�quidos causada por la diarrea. Tambi�n se recomienda       " +
                                                  "\n el consumo de soluciones de rehidrataci�n oral que contienen electrolitos esenciales como sodio y potasio, ayudando     " +
                                                  "\n a restablecer el equilibrio h�drico del cuerpo. POSIBLE TRATAMIENTO. La shigelosis se trata con antibi�ticos como       " + 
                                                  "\n ciprofloxacino o azitromicina, que ayudan a eliminar la bacteria. Se recomienda evitar el uso de medicamentos           " +
                                                  "\n antidiarreicos como la loperamida, ya que pueden prolongar la infecci�n. ALIMENTACI�N RECOMENDADA. Consumir alimentos   " +
                                                  "\n de f�cil digesti�n y ricos en nutrientes esenciales para la recuperaci�n. Pl�tano, rico en potasio, que ayuda a         " +
                                                  "\n reponer los electrolitos perdidos, aportando aproximadamente el 10% del requerimiento diario por cada 100 g. Arroz      " +
                                                  "\n blanco, fuente de carbohidratos de f�cil digesti�n, que contribuye a la recuperaci�n intestinal. Zanahoria, rica en     " +
                                                  "\n vitamina A y antioxidantes, que favorecen la regeneraci�n de la mucosa intestinal, proporcionando cerca del 15% del     " +
                                                  "\n requerimiento diario de vitamina A por cada 100 g. Manzana, con pectina que ayuda a regular el tr�nsito intestinal,     " +
                                                  "\n aportando fibra soluble beneficiosa para la digesti�n. Este es solo un diagn�stico predeterminado l�gico, haberlo       " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas      " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en      " +
                                                  "\n el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo    " +
                                                  "\n se le recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n EJERCICIO: La actividad f�sica es fundamental para mejorar la calidad de vida de las personas con EPOC. Se          " +
                                                  "\n recomienda realizar ejercicios aer�bicos moderados como caminatas diarias de 30 a 45 minutos, nataci�n o            " +
                                                  "\n ciclismo de baja intensidad. Tambi�n es beneficioso incluir ejercicios de fortalecimiento muscular,                 " +
                                                  "\n especialmente para los m�sculos respiratorios, como el entrenamiento con pesas ligeras o bandas de resistencia.     " +
                                                  "\n Adem�s, los ejercicios de respiraci�n profunda y t�cnicas de expansi�n tor�cica pueden ayudar a mejorar la          " +
                                                  "\n funci�n pulmonar y reducir la sensaci�n de falta de aire. HIDRATACI�N: Es crucial el consumo diario de 2 a 2.5      " +
                                                  "\n litros de agua para mantener la hidrataci�n y ayudar a la eliminaci�n de secreciones pulmonares. La hidrataci�n     " +
                                                  "\n adecuada contribuye a la fluidez del moco en los pulmones, facilitando su expulsi�n y reduciendo la obstrucci�n     " +
                                                  "\n de las v�as respiratorias. Tambi�n se recomienda el consumo de infusiones con propiedades antiinflamatorias como    " +
                                                  "\n t� de jengibre o manzanilla. POSIBLE TRATAMIENTO: Para la EPOC, el tratamiento suele incluir broncodilatadores de        " +
                                                  "\n acci�n corta y larga como el salbutamol y el tiotropio, corticosteroides inhalados como la fluticasona y en casos        " +
                                                  "\n avanzados, oxigenoterapia. Tambi�n se recomienda la rehabilitaci�n pulmonar, que incluye t�cnicas de respiraci�n         " +
                                                  "\n y ejercicios para mejorar la capacidad pulmonar. En algunos casos, el uso de modificadores de leucotrienos como el       " +
                                                  "\n montelukast puede ser beneficioso para reducir la inflamaci�n de las v�as respiratorias. ALIMENTACI�N: Se recomienda     " +
                                                  "\n el consumo de alimentos ricos en antioxidantes y antiinflamatorios, tales como frutas c�tricas como naranjas,            " +
                                                  "\n toronjas y limones, que aportan vitamina C en un 89% de la ingesta diaria recomendada, fortaleciendo el sistema          " +
                                                  "\n inmunol�gico. Pescados grasos como salm�n y at�n, que contienen �cidos grasos Omega-3 con propiedades antiinflamatorias  " +
                                                  "\n y aportan hasta un 70% de la ingesta diaria recomendada de estos nutrientes. Verduras de hoja verde como espinacas,      " +
                                                  "\n acelgas y br�coli, que contienen antioxidantes y vitaminas esenciales para la funci�n pulmonar, aportando hasta          " +
                                                  "\n un 50% de la ingesta diaria recomendada de vitamina A y K. Jengibre y c�rcuma, que poseen propiedades antiinflamatorias  " +
                                                  "\n y antioxidantes, contribuyendo con hasta un 40% de la ingesta diaria recomendada de compuestos bioactivos beneficiosos   " +
                                                  "\n para la salud respiratoria. este es solo un diagn�stico predeterminado l�gico. haberlo consultado no garantiza al 100%   " +
                                                  "\n que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar m�s     " +
                                                  "\n de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico " +
                                                  "\n no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida)      " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n EJERCICIO: No hay una recomendaci�n espec�fica de actividad f�sica para la clamidia, pero mantener un estilo             " +
                                                  "\n de vida activo fortalece el sistema inmunol�gico y ayuda a la recuperaci�n. Se recomienda ejercicio moderado             " +
                                                  "\n como caminatas diarias de 30 minutos o yoga para reducir el estr�s, que puede afectar la respuesta inmune.               " +
                                                  "\n HIDRATACI�N: Es fundamental consumir al menos 2 litros de agua al d�a para ayudar a eliminar toxinas y mantener          " +
                                                  "\n el equilibrio de los fluidos corporales. Tambi�n se recomienda el consumo de infusiones como t� verde, que tiene         " +
                                                  "\n propiedades antioxidantes y antibacterianas. POSIBLE TRATAMIENTO: La clamidia se trata con antibi�ticos como la          " +
                                                  "\n azitromicina en dosis �nica o la doxiciclina durante 7 d�as. Tambi�n pueden utilizarse levofloxacina o amoxicilina       " +
                                                  "\n en ciertos casos. Es esencial que la pareja tambi�n reciba tratamiento para evitar reinfecciones. ALIMENTACI�N: Se       " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, " +
                                                  "\n tales como frutas c�tricas como naranjas y toronjas, que aportan vitamina C en un 89% de la ingesta diaria recomendada,    " +
                                                  "\n ayudando a combatir infecciones. Yogur natural, que contiene probi�ticos que favorecen la salud intestinal y el equilibrio " + 
                                                  "\n de la flora vaginal. Verduras de hoja verde como espinacas y acelgas, que aportan hasta un 50% de la ingesta diaria        " +
                                                  "\n recomendada de vitamina A y K, esenciales para la regeneraci�n celular. Ajo, que posee propiedades antimicrobianas y       " +
                                                  "\n antioxidantes, contribuyendo con hasta un 40% de la ingesta diaria recomendada de compuestos bioactivos beneficiosos       " +
                                                  "\n para la salud. este es solo un diagn�stico predeterminado l�gico. haberlo consultado no garantiza al 100% que la paciente  " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar m�s de un diagn�stico     " +
                                                  "\n para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico no le satisface     " +
                                                  "\n del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n EJERCICIO: Durante la recuperaci�n de la meningitis bacteriana, se recomienda evitar esfuerzos f�sicos intensos        " +
                                                  "\n y priorizar el descanso. Una vez estabilizada la condici�n, se pueden realizar ejercicios de bajo impacto como         " +
                                                  "\n caminatas suaves o ejercicios de respiraci�n para mejorar la oxigenaci�n cerebral. HIDRATACI�N: Es crucial el          " +
                                                  "\n consumo de al menos 2.5 litros de agua al d�a para mantener la hidrataci�n y ayudar a la eliminaci�n de toxinas.       " +
                                                  "\n Tambi�n se recomienda el consumo de caldos naturales y jugos sin az�car para aportar electrolitos esenciales.          " +
                                                  "\n POSIBLE TRATAMIENTO: La meningitis bacteriana requiere tratamiento inmediato con antibi�ticos intravenosos como        " +
                                                  "\n ceftriaxona, cefotaxima o ampicilina, dependiendo del agente causal. Tambi�n pueden administrarse corticosteroides     " +
                                                  "\n para reducir la inflamaci�n cerebral y medicamentos para controlar s�ntomas como fiebre y convulsiones. ALIMENTACI�N:  " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para la recuperaci�n, tales como  " +
                                                  "\n pescado azul como salm�n y at�n, que contienen �cidos grasos Omega-3 con propiedades antiinflamatorias y aportan       " +
                                                  "\n hasta un 70% de la ingesta diaria recomendada de estos nutrientes. Frutas como fresas y ar�ndanos, que contienen       " +
                                                  "\n antioxidantes y vitamina C en un 89% de la ingesta diaria recomendada, fortaleciendo el sistema inmunol�gico.          " +
                                                  "\n Verduras como zanahorias y br�coli, que aportan hasta un 50% de la ingesta diaria recomendada de vitamina A y K,       " +
                                                  "\n esenciales para la funci�n cerebral. Frutos secos como almendras y nueces, que contienen vitamina E y magnesio,        " + 
                                                  "\n contribuyendo con hasta un 40% de la ingesta diaria recomendada de estos nutrientes esenciales para la recuperaci�n    " +
                                                  "\n neurol�gica. este es solo un diagn�stico predeterminado l�gico. haberlo consultado no garantiza al 100% que la         " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar m�s de       " +
                                                  "\n un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico  " +
                                                  "\n no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida)    " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n EJERCICIO: La actividad f�sica es clave para mejorar la calidad de vida de las personas con c�ncer. Se           " +
                                                  "\n recomienda ejercicio moderado como caminatas diarias de 30 a 45 minutos, yoga o ejercicios de resistencia        " +
                                                  "\n para fortalecer los m�sculos y reducir la fatiga. Tambi�n es beneficioso realizar ejercicios de respiraci�n      " +
                                                  "\n profunda para mejorar la oxigenaci�n celular. HIDRATACI�N: Es fundamental consumir al menos 2.5 litros de        " +
                                                  "\n agua al d�a para mantener la hidrataci�n y ayudar a la eliminaci�n de toxinas. Tambi�n se recomienda el          " +
                                                  "\n consumo de infusiones con propiedades antioxidantes como t� verde o manzanilla. POSIBLE TRATAMIENTO: El          " +
                                                  "\n tratamiento del c�ncer var�a seg�n el tipo y la etapa de la enfermedad, incluyendo opciones como cirug�a,        " +
                                                  "\n quimioterapia, radioterapia e inmunoterapia. Tambi�n pueden utilizarse terapias dirigidas y hormonales en        " +
                                                  "\n ciertos casos. Es esencial seguir las indicaciones m�dicas y mantener un monitoreo constante. ALIMENTACI�N:          " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema      " +
                                                  "\n inmunol�gico y reducir la inflamaci�n, tales como frutas c�tricas como naranjas y toronjas, que aportan vitamina C   " +
                                                  "\n en un 89% de la ingesta diaria recomendada, ayudando a combatir el da�o celular. Pescados grasos como salm�n y       " +
                                                  "\n at�n, que contienen �cidos grasos Omega-3 con propiedades antiinflamatorias y aportan hasta un 70% de la ingesta     " +
                                                  "\n diaria recomendada de estos nutrientes. Verduras de hoja verde como espinacas y acelgas, que contienen antioxidantes  " +
                                                  "\n y vitaminas esenciales para la funci�n celular, aportando hasta un 50% de la ingesta diaria recomendada de vitamina A " +
                                                  "\n y K. Frutos secos como almendras y nueces, que contienen vitamina E y magnesio, contribuyendo con hasta un 40% de la  " +
                                                  "\n ingesta diaria recomendada de estos nutrientes esenciales para la regeneraci�n celular. este es solo un diagn�stico   " +
                                                  "\n predeterminado l�gico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las       " +
                                                  "\n respuestas sean completamente correctas. se recomienda realizar m�s de un diagn�stico para mayor seguridad en el      " +
                                                  "\n tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda   " +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        
                        if(EstaturaFemenino.equals("1.40-1.65 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n Es recomendable que la mujer realice ACTIVIDAD F�SICA moderada durante aproximadamente 30 minutos al d�a,          " +
                                                  "\n adaptando la intensidad a su estado general y evitando el ejercicio extenuante si presenta s�ntomas agudos,        " +
                                                  "\n tambi�n es crucial la HIDRATACI�N diaria consumiendo de 2 a 2.5 Litros de agua al d�a (ocho a diez vasos de        " +
                                                  "\n tama�o regular) para ayudar a mantener las v�as respiratorias hidratadas y facilitar la expectoraci�n.               " +
                                                  "\n POSIBLE TRATAMIENTO: Para la gripe en mujeres adultas, el tratamiento suele incluir medicamentos para reducir        " +
                                                  "\n la fiebre y aliviar los s�ntomas, como el paracetamol (Tempra) o el ibuprofeno (Advil), antivirales espec�ficos      " +
                                                  "\n contra la gripe como el oseltamivir (Tamiflu) pueden ser recetados por un m�dico, especialmente si se administran    " +
                                                  "\n dentro de las primeras 48 horas de inicio de los s�ntomas, tambi�n es recomendable que la mujer consuma ALIMENTOS    " +
                                                  "\n que puedan fortalecer su sistema inmune y aliviar los s�ntomas, tales como: C�tricos (naranjas, limones, toronjas)   " +
                                                  "\n ricos en vitamina C, aportando hasta el 70-90% de la ingesta diaria recomendada, la vitamina C es esencial para      " +
                                                  "\n fortalecer el sistema inmunol�gico, estimulando la producci�n de gl�bulos blancos y actuando como antioxidante       " +
                                                  "\n para proteger las c�lulas del da�o causado por la infecci�n; caldos y sopas de pollo ayudan a aliviar la congesti�n  " +
                                                  "\n nasal y la inflamaci�n de las v�as respiratorias, proporcionan hidrataci�n y contienen amino�cidos esenciales que    " +
                                                  "\n pueden ayudar a reparar tejidos da�ados y fortalecer el sistema inmunol�gico; jengibre tiene propiedades             " +
                                                  "\n antiinflamatorias y expectorantes que pueden aliviar la tos y el dolor de garganta, contiene gingerol, un compuesto  " +
                                                  "\n bioactivo que puede ayudar a reducir la inflamaci�n y el dolor en las v�as respiratorias; miel puede ayudar a calmar " +
                                                  "\n la tos y el dolor de garganta, contiene enzimas y antioxidantes que pueden tener propiedades antimicrobianas y       " +
                                                  "\n antiinflamatorias, pero debe consumirse con moderaci�n debido a su contenido de az�car. Este es solo un Diagn�stico  " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello   " +
                                                  "\n la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para  " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del        " +
                                                  "\n Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu        " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a. " +
                                                  "\n Es recomendable que la mujer evite la ACTIVIDAD F�SICA intensa hasta que se recupere completamente, comenzando          " +
                                                  "\n con ejercicios suaves de respiraci�n y rehabilitaci�n pulmonar seg�n las indicaciones m�dicas, tambi�n es crucial       " +
                                                  "\n la HIDRATACI�N diaria consumiendo de 2 a 2.5 Litros de agua al d�a (ocho a diez vasos de tama�o regular) para           " +
                                                  "\n ayudar a fluidificar las secreciones y facilitar la expectoraci�n. POSIBLE TRATAMIENTO: Para la neumon�a en mujeres     " +
                                                  "\n adultas, el tratamiento suele incluir antibi�ticos (como amoxicilina, azitromicina, o levofloxacino) para combatir      " +
                                                  "\n la infecci�n bacteriana, broncodilatadores (como el salbutamol) para abrir las v�as respiratorias si hay sibilancias,   " +
                                                  "\n y oxigenoterapia en casos de dificultad respiratoria grave, tambi�n es recomendable que la mujer consuma ALIMENTOS      " +
                                                  "\n que puedan fortalecer su sistema inmune y facilitar la recuperaci�n, tales como: Caldos y sopas de pollo ricos en       " +
                                                  "\n prote�nas y nutrientes esenciales, ayudan a aliviar la congesti�n y proporcionan hidrataci�n; alimentos ricos en        " +
                                                  "\n vitamina C (c�tricos, fresas, kiwi) contribuyen a fortalecer el sistema inmunol�gico y reducir la inflamaci�n,          " +
                                                  "\n aportando hasta el 70-90% de la ingesta diaria recomendada; miel puede ayudar a calmar la tos y el dolor de garganta,   " +
                                                  "\n contiene enzimas y antioxidantes que pueden tener propiedades antimicrobianas y antiinflamatorias, pero debe consumirse " +
                                                  "\n con moderaci�n debido a su contenido de az�car. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado   " +
                                                  "\n no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas,   " +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado  " +
                                                  "\n de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho        " +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes. " +
                                                  "\n Es recomendable que la mujer realice ACTIVIDAD F�SICA moderada de forma regular, como caminar, nadar o andar         " +
                                                  "\n en bicicleta, durante al menos 30 minutos al d�a, para mejorar la sensibilidad a la insulina y controlar los         " +
                                                  "\n niveles de glucosa en sangre, tambi�n es crucial la HIDRATACI�N diaria consumiendo de 2 a 2.5 Litros de agua         " +
                                                  "\n al d�a (ocho a diez vasos de tama�o regular) para ayudar a mantener los niveles de glucosa en sangre estables        " +
                                                  "\n y prevenir la deshidrataci�n. POSIBLE TRATAMIENTO: Para la diabetes en mujeres adultas, el tratamiento suele         " +
                                                  "\n incluir dieta equilibrada y control de carbohidratos, ejercicio regular, y medicamentos como metformina (para        " +
                                                  "\n mejorar la sensibilidad a la insulina) o insulina (en casos de deficiencia de insulina), tambi�n es recomendable          " +
                                                  "\n que la mujer consuma ALIMENTOS que puedan ayudar a controlar los niveles de glucosa en sangre, tales como: Verduras       " +
                                                  "\n de hoja verde (espinacas, lechuga, acelgas) bajas en carbohidratos y ricas en fibra, ayudan a mantener los niveles        " +
                                                  "\n de glucosa estables y proporcionan vitaminas y minerales esenciales; frutas bajas en �ndice gluc�mico (bayas, manzanas,   " +
                                                  "\n peras) aportan fibra y antioxidantes, ayudando a controlar los niveles de glucosa en sangre y proteger las c�lulas        " +
                                                  "\n del da�o; legumbres (frijoles, lentejas, garbanzos) ricas en fibra y prote�nas, ayudan a mantener los niveles de glucosa  " +
                                                  "\n estables y proporcionan sensaci�n de saciedad. Este es solo un Diagn�stico predeterminado l�gico, haberlo consultado      " +
                                                  "\n no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas,  " +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado " +
                                                  "\n de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho       " +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n Es recomendable que la mujer realice ACTIVIDAD F�SICA de forma controlada y supervisada, con calentamiento previo       " +
                                                  "\n y enfriamiento posterior, evitando desencadenantes conocidos del asma (como al�rgenos, aire fr�o o contaminado) y       " +
                                                  "\n pausas si presenta s�ntomas, la cantidad de ejercicio debe ser adaptada a su capacidad y a la presencia de s�ntomas,    " +
                                                  "\n pudiendo ser cerca de 30 minutos de actividad moderada a intensa diaria en los d�as que se encuentre bien, pero         " +
                                                  "\n siempre consultando al m�dico para un plan seguro, tambi�n es crucial la HIDRATACI�N diaria consumiendo de 2 a 2.5      " +
                                                  "\n Litros de agua al d�a (ocho a diez vasos de tama�o regular) para ayudar a mantener las v�as respiratorias hidratadas    " +
                                                  "\n y las secreciones m�s fluidas, lo que facilita la respiraci�n. POSIBLE TRATAMIENTO: Para el asma en mujeres adultas,    " +
                                                  "\n el tratamiento suele incluir broncodilatadores de alivio r�pido (para abrir las v�as respiratorias durante un ataque,   " +
                                                  "\n como el salbutamol), corticosteroides inhalados (para el control a largo plazo y reducir la inflamaci�n, como la        " +
                                                  "\n fluticasona o budesonida), y en algunos casos, modificadores de leucotrienos (como el montelukast), es fundamental      " +
                                                  "\n seguir estrictamente el plan de acci�n para el asma indicado por el m�dico y usar los medicamentos preventivos          " +
                                                  "\n regularmente, tambi�n es recomendable que la mujer consuma ALIMENTOS que puedan ayudar a reducir la inflamaci�n         " +
                                                  "\n y fortalecer el sistema inmune, tales como: Pescados grasos (salm�n, at�n) ricos en �cidos grasos Omega-3, que          " +
                                                  "\n poseen propiedades antiinflamatorias que pueden ayudar a reducir la inflamaci�n de las v�as respiratorias; frutas       " +
                                                  "\n y verduras de colores vivos (ar�ndanos, fresas, espinacas, br�coli) ricas en antioxidantes como la vitamina C y         " +
                                                  "\n carotenoides, que pueden proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico; jengibre contiene          " +
                                                  "\n compuestos con efectos antiinflamatorios que podr�an ser beneficiosos para las v�as respiratorias. Este es solo un      " +
                                                  "\n Diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y       " +
                                                  "\n que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un Diagn�stico de     " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta  " +
                                                  "\n del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, Angel L Montes agradece tu       " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n EJERCICIO: Es fundamental mantener un r�gimen de ejercicio regular y adaptado para fortalecer el cuerpo; se recomienda    " +
                                                  "\n una combinaci�n de actividad aer�bica como caminar o nadar durante 20-30 minutos, de 3 a 4 veces por semana, junto con    " +
                                                  "\n ejercicios de resistencia (pesas ligeras) para mantener la masa muscular. Siempre se debe consultar al m�dico antes de    " +
                                                  "\n iniciar cualquier programa. HIDRATACI�N: Es crucial asegurar un consumo de al menos 2 a 3 litros de agua al d�a para      " +
                                                  "\n ayudar al buen funcionamiento de los ri�ones, procesar los medicamentos y mantener las mucosas hidratadas como una        " +
                                                  "\n barrera efectiva contra infecciones. POSIBLE TRATAMIENTO: El tratamiento est�ndar es la Terapia Antirretroviral (TAR),    " +
                                                  "\n que combina varios f�rmacos para suprimir la replicaci�n del virus. El tratamiento es personalizado y manejado por un     " +
                                                  "\n especialista, buscando una adherencia estricta para mantener la carga viral indetectable. Algunas de las combinaciones    " +
                                                  "\n y marcas comunes que pueden indicarse son Biktarvy (Bictegravir/Emtricitabina/Tenofovir Alafenamida) y Triumeq            " +
                                                  "\n (Dolutegravir/Abacavir/Lamivudina), aunque el esquema espec�fico siempre ser� determinado por el m�dico tratante.         " +
                                                  "\n ALIMENTACI�N: Es vital consumir alimentos que fortalezcan el sistema inmunitario. Prote�nas magras (pollo, pescado,       " +
                                                  "\n frijoles) son esenciales para reparar c�lulas y mantener la masa muscular. Se recomienda enfocarse en alimentos con       " +
                                                  "\n nutrientes clave: Frutas c�tricas (naranjas, fresas): una naranja mediana puede aportar m�s del 90% de la ingesta diaria  " +
                                                  "\n recomendada de Vitamina C, un antioxidante que protege las c�lulas inmunes del da�o y es vital para combatir infecciones.    " +
                                                  "\n Verduras de hoja verde (espinacas, br�coli): una taza de espinacas cocidas puede proveer m�s del 100% de la ingesta diaria   " +
                                                  "\n de Vitamina A, crucial para mantener la integridad de las barreras mucosas (nariz, intestinos) que defienden contra          " +
                                                  "\n pat�genos. Legumbres y frutos secos (lentejas, almendras): una taza de lentejas cocidas aporta cerca del 30% del Zinc        " +
                                                  "\n diario recomendado, mineral indispensable para la producci�n y maduraci�n de los linfocitos, las c�lulas de defensa del      " +
                                                  "\n cuerpo. Las nueces de Brasil son excepcionales, ya que una sola pieza puede superar el 100% del Selenio diario necesario,    " +
                                                  "\n un mineral que apoya la funci�n inmune y reduce la inflamaci�n. Este es solo un Diagn�stico predeterminado l�gico, haberlo   " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n     " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento  " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho " +
                                                  "\n consultar a su m�dico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la gonorrea es fundamental mantener una hidrataci�n adecuada con un consumo      " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a la         " +
                                                  "\n eliminaci�n de toxinas y mantener el equilibrio del sistema inmunol�gico. EJERCICIO: Se recomienda actividad         " +
                                                  "\n f�sica moderada como caminatas nataci�n o ejercicios de resistencia para mejorar la circulaci�n sangu�nea y          " +
                                                  "\n fortalecer el sistema inmunol�gico. Adem�s se recomienda la pr�ctica de ejercicios aer�bicos como ciclismo o         " +
                                                  "\n baile al menos 150 minutos por semana para mejorar la funci�n cardiovascular y reducir el riesgo de complicaciones.  " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento suele incluir antibi�ticos como la ceftriaxona en combinaci�n con azitromicina   " +
                                                  "\n para eliminar la bacteria causante de la infecci�n. Es fundamental seguir estrictamente el tratamiento indicado por  " +
                                                  "\n el m�dico y evitar la automedicaci�n. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunol�gico y acelerar la  " +
                                                  "\n recuperaci�n se recomienda el consumo de NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a fortalecer el sistema  " +
                                                  "\n inmunol�gico aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE:        " +
                                                  "\n Contiene compuestos con propiedades antiinflamatorias y puede ayudar a reducir la inflamaci�n. ESPINACAS Y BR�COLI:  " +
                                                  "\n Aportan antioxidantes y vitamina A esenciales para la regeneraci�n celular con un contenido de aproximadamente 56%   " +
                                                  "\n de la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos que pueden fortalecer el   " +
                                                  "\n sistema inmunol�gico y mejorar la salud digestiva aportando calcio y prote�nas esenciales. Este es solo un diagn�stico  " +
                                                  "\n predeterminado l�gico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las          " +
                                                  "\n respuestas sean completamente correctas para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer  " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente adem�s por su salud si la respuesta del Diagn�stico no le     " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida)    " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: Para el tratamiento del herpes genital es fundamental mantener una hidrataci�n adecuada con un consumo   " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a la          " +
                                                  "\n eliminaci�n de toxinas y mantener el equilibrio del sistema inmunol�gico. EJERCICIO: Se recomienda actividad f�sica   " +
                                                  "\n moderada como caminatas nataci�n o ejercicios de resistencia para mejorar la circulaci�n sangu�nea y fortalecer el    " +
                                                  "\n sistema inmunol�gico. Adem�s se recomienda la pr�ctica de ejercicios de relajaci�n como yoga o meditaci�n para        " +
                                                  "\n reducir el estr�s que puede desencadenar brotes de herpes. POSIBLE TRATAMIENTO: El tratamiento suele incluir          " +
                                                  "\n antivirales como el aciclovir el famciclovir o el valaciclovir para reducir la duraci�n y gravedad de los brotes.     " +
                                                  "\n Es fundamental seguir estrictamente el tratamiento indicado por el m�dico y evitar la automedicaci�n. ALIMENTOS       " +
                                                  "\n RECOMENDADOS: Para fortalecer el sistema inmunol�gico y acelerar la recuperaci�n se recomienda el consumo de FRUTOS   " +
                                                  "\n ROJOS: Ricos en antioxidantes y vitamina C que ayudan a fortalecer el sistema inmunol�gico aportando aproximadamente  " +
                                                  "\n el 70% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos con propiedades            " +
                                                  "\n antiinflamatorias y puede ayudar a reducir la inflamaci�n. ESPINACAS Y BR�COLI: Aportan antioxidantes y vitamina A    " +
                                                  "\n esenciales para la regeneraci�n celular con un contenido de aproximadamente 56% de la ingesta diaria recomendada por  " +
                                                  "\n cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos que pueden fortalecer el sistema inmunol�gico y mejorar la salud    " +
                                                  "\n digestiva aportando calcio y prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello  " +
                                                  "\n se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su    " +
                                                  "\n paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar   " +
                                                  "\n a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la s�filis es fundamental mantener una hidrataci�n adecuada con un consumo       " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a la         " +
                                                  "\n eliminaci�n de toxinas y mantener el equilibrio del sistema inmunol�gico. EJERCICIO: Se recomienda actividad         " +
                                                  "\n f�sica moderada como caminatas nataci�n o ejercicios de resistencia para mejorar la circulaci�n sangu�nea y          " +
                                                  "\n fortalecer el sistema inmunol�gico. Adem�s se recomienda la pr�ctica de ejercicios aer�bicos como ciclismo o         " +
                                                  "\n baile al menos 150 minutos por semana para mejorar la funci�n cardiovascular y reducir el riesgo de complicaciones.  " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento suele incluir antibi�ticos como la penicilina G benzatina en dosis �nica o       " +
                                                  "\n en ciclos prolongados dependiendo de la fase de la enfermedad. Es fundamental seguir estrictamente el tratamiento    " +
                                                  "\n indicado por el m�dico y evitar la automedicaci�n. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunol�gico   " +
                                                  "\n y acelerar la recuperaci�n se recomienda el consumo de FRUTOS ROJOS: Ricos en antioxidantes y vitamina C que ayudan   " +
                                                  "\n a fortalecer el sistema inmunol�gico aportando aproximadamente el 70% de la ingesta diaria recomendada por cada 100   " +
                                                  "\n gramos. JENGIBRE: Contiene compuestos con propiedades antiinflamatorias y puede ayudar a reducir la inflamaci�n.      " +
                                                  "\n ESPINACAS Y BR�COLI: Aportan antioxidantes y vitamina A esenciales para la regeneraci�n celular con un contenido de   " +
                                                  "\n aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos que     " +
                                                  "\n pueden fortalecer el sistema inmunol�gico y mejorar la salud digestiva aportando calcio y prote�nas esenciales.       " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100% que el paciente tenga esta  " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer m�s de un Diagn�stico     " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s por su salud si la        " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico Angel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 a 3 litros de agua al d�a (aproximadamente diez a doce vasos de agua      " +
                                                  "\n de tama�o regular) para ayudar a la eliminaci�n de toxinas y mantener la funci�n pulmonar �ptima. La hidrataci�n       " +
                                                  "\n adecuada tambi�n contribuye a la fluidificaci�n de las secreciones bronquiales, facilitando la expectoraci�n y         " + 
                                                  "\n mejorando la respiraci�n. Adem�s, el consumo de infusiones calientes con miel y jengibre puede ayudar a aliviar la     " +
                                                  "\n irritaci�n de la garganta y mejorar la capacidad respiratoria. EJERCICIO: Actividad f�sica moderada como caminatas     " +
                                                  "\n al aire libre y ejercicios de respiraci�n pueden ayudar a fortalecer los pulmones y mejorar la oxigenaci�n. Es         " +
                                                  "\n importante evitar el sobreesfuerzo y realizar actividad en ambientes bien ventilados para reducir el riesgo de         " +
                                                  "\n contagio. Tambi�n se recomienda la pr�ctica de ejercicios de expansi�n tor�cica, que pueden mejorar la capacidad       " +
                                                  "\n pulmonar y reducir la sensaci�n de falta de aire. POSIBLE TRATAMIENTO: El tratamiento est�ndar incluye antibi�ticos    " +
                                                  "\n como Isoniazida, Rifampicina, Etambutol y Pirazinamida, los cuales deben tomarse por un per�odo prolongado para        " +
                                                  "\n eliminar la bacteria Mycobacterium tuberculosis. Es fundamental seguir el tratamiento completo para evitar la          " +
                                                  "\n resistencia bacteriana y prevenir reca�das. Adem�s, se recomienda el consumo de suplementos de vitamina D, ya que      " +
                                                  "\n esta vitamina juega un papel clave en la respuesta inmunol�gica contra la tuberculosis. ALIMENTACI�N: Se recomienda    " +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a mejorar la funci�n pulmonar, tales como:    " +
                                                  "\n Naranjas (ricas en vitamina C, que fortalece el sistema inmune, aportando aproximadamente 89% del requerimiento diario     " +
                                                  "\n por cada 100 g); Aguacate (fuente de grasas saludables y antioxidantes, con 14% de la ingesta diaria recomendada de        " +
                                                  "\n vitamina E por cada 100 g); Pescados grasos (salm�n, at�n, ricos en Omega-3, que pueden ayudar a reducir la inflamaci�n    " +
                                                  "\n pulmonar, aportando cerca de 50% de la ingesta diaria recomendada por cada porci�n de 100 g). Este es solo un diagn�stico  " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor     " +
                                                  "\n seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se   " +
                                                  "\n recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2 a 2.5 litros de agua al d�a (aproximadamente ocho a diez vasos de          " +
                                                  "\n agua de tama�o regular) para ayudar a la lubricaci�n de las articulaciones y reducir la inflamaci�n. Mantener         " +
                                                  "\n una hidrataci�n adecuada tambi�n contribuye a la eliminaci�n de toxinas y mejora la circulaci�n sangu�nea.            " +
                                                  "\n Adem�s, el consumo de infusiones de c�rcuma y jengibre puede ayudar a reducir la inflamaci�n y aliviar el dolor       " +
                                                  "\n articular. EJERCICIO: Actividad f�sica de bajo impacto como nataci�n, yoga y ejercicios de movilidad articular        " +
                                                  "\n pueden ayudar a reducir la rigidez y mejorar la funci�n de las articulaciones. Es importante evitar movimientos       " +
                                                  "\n bruscos y mantener una rutina constante para fortalecer los m�sculos que rodean las articulaciones. Tambi�n se        " +
                                                  "\n recomienda la pr�ctica de ejercicios de estiramiento y fortalecimiento muscular, que pueden mejorar la estabilidad    " +
                                                  "\n articular y reducir el dolor. POSIBLE TRATAMIENTO: El tratamiento est�ndar incluye antiinflamatorios no esteroides    " +
                                                  "\n (AINEs) como Ibuprofeno y Naproxeno, corticosteroides para reducir la inflamaci�n y f�rmacos modificadores de la      " +
                                                  "\n enfermedad (FAMEs) como Metotrexato y Sulfasalazina, que ayudan a controlar la progresi�n de la artritis. Adem�s,     " +
                                                  "\n se recomienda el uso de suplementos de col�geno y glucosamina, que pueden mejorar la salud articular y reducir la     " +
                                                  "\n degeneraci�n del cart�lago. ALIMENTACI�N: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico  " +
                                                  "\n y ayuden a reducir la inflamaci�n, tales como: Jengibre (contiene compuestos con efectos antiinflamatorios, que pueden   " +
                                                  "\n ser beneficiosos para las articulaciones); C�rcuma (con su componente activo, la curcumina, que tiene potentes           " +
                                                  "\n propiedades antiinflamatorias y antioxidantes); Frutas y verduras de colores vivos (ar�ndanos, fresas, espinacas,        " +
                                                  "\n br�coli), ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las c�lulas del da�o y           " +
                                                  "\n fortalecer el sistema inmunol�gico. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza   " +
                                                  "\n al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se          " +
                                                  "\n recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado.         " +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.     " +
                                                  "\n �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2 a 2.5 litros de agua al d�a (aproximadamente ocho a diez vasos de agua           " +
                                                  "\n de tama�o regular) para ayudar a mantener las v�as respiratorias hidratadas y reducir la irritaci�n de la garganta.         " +
                                                  "\n Tambi�n es recomendable el uso de infusiones calientes con miel y jengibre para aliviar la tos y mejorar la expectoraci�n.  " +
                                                  "\n EJERCICIO: Actividad f�sica ligera como caminatas y ejercicios de respiraci�n pueden ayudar a mejorar la oxigenaci�n        " +
                                                  "\n y reducir la fatiga. Es importante evitar ambientes con humo, polvo o vapores qu�micos que puedan agravar los s�ntomas.     " +
                                                  "\n Tambi�n se recomienda la pr�ctica de ejercicios de expansi�n pulmonar, que pueden mejorar la capacidad respiratoria         " +
                                                  "\n y reducir la sensaci�n de falta de aire. POSIBLE TRATAMIENTO: El tratamiento est�ndar incluye antibi�ticos como             " +
                                                  "\n Azitromicina, Claritromicina y Eritromicina, los cuales ayudan a eliminar la bacteria Bordetella pertussis y reducir        " +
                                                  "\n la duraci�n de la enfermedad. Tambi�n se recomienda el uso de humidificadores para mantener el aire h�medo y facilitar      " +
                                                  "\n la respiraci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a      " +
                                                  "\n reducir la inflamaci�n, tales como: Kiwi (rico en vitamina C, que fortalece el sistema inmune, aportando aproximadamente    " +
                                                  "\n 92% del requerimiento diario por cada 100 g); Miel (con propiedades antibacterianas y antiinflamatorias, que pueden         " +
                                                  "\n ayudar a aliviar la irritaci�n de la garganta); Jengibre (contiene compuestos con efectos antiinflamatorios, que pueden     " +
                                                  "\n ser beneficiosos para las v�as respiratorias). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no     " +
                                                  "\n garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello,      " +
                                                  "\n se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado.         " +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.        " +
                                                  "\n �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n Para una mujer adulta con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidrataci�n        " +
                                                  "\n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se             " +
                                                  "\n recomienda actividad f�sica de bajo impacto como nataci�n, yoga o caminatas suaves de 30 minutos al d�a para             " +
                                                  "\n mejorar la movilidad articular y reducir la inflamaci�n. Tambi�n es beneficioso realizar ejercicios de fortalecimiento   " +
                                                  "\n muscular con bandas de resistencia o pesas ligeras, ya que ayudan a estabilizar las articulaciones y prevenir el         " +
                                                  "\n deterioro �seo. Adem�s, el ejercicio aer�bico moderado, como el ciclismo o la el�ptica, puede mejorar la circulaci�n     " +
                                                  "\n y reducir la rigidez matutina. HIDRATACI�N. Se aconseja consumir al menos 2 litros de agua al d�a para mantener la       " +
                                                  "\n lubricaci�n de las articulaciones y reducir la rigidez. Adem�s, el t� verde es una excelente opci�n, ya que contiene     " +
                                                  "\n polifenoles con propiedades antiinflamatorias que pueden ayudar a reducir el dolor articular. Tambi�n se recomienda      " +
                                                  "\n el consumo de caldos naturales y jugos de frutas sin az�car a�adida para mantener el equilibrio de electrolitos y        " +
                                                  "\n mejorar la absorci�n de nutrientes esenciales. POSIBLE TRATAMIENTO. El tratamiento para la artritis incluye medicamentos " +
                                                  "\n antiinflamatorios no esteroides como ibuprofeno y naproxeno, adem�s de f�rmacos modificadores de la enfermedad como      " +
                                                  "\n metotrexato y sulfasalazina. Tambi�n se pueden utilizar terapias biol�gicas como los inhibidores del factor de necrosis  " +
                                                  "\n tumoral (TNF), que han demostrado ser eficaces en el control de la inflamaci�n cr�nica. En algunos casos, se recomienda  " +
                                                  "\n la fisioterapia para mejorar la movilidad y reducir el dolor. Marcas reconocidas incluyen Advil, Aleve y Arava.          " +
                                                  "\n ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica en antioxidantes y �cidos grasos esenciales. Algunos alimentos    " +
                                                  "\n clave incluyen pescados grasos como salm�n y at�n, ricos en omega-3, que ayudan a reducir la inflamaci�n, aportando      " +
                                                  "\n aproximadamente el 70% del requerimiento diario por cada 100 gramos de consumo. Frutas c�tricas como naranja y kiwi,     " +
                                                  "\n ricas en vitamina C, que contribuyen a la producci�n de col�geno y fortalecen el sistema inmunol�gico, con un aporte     " +
                                                  "\n del 89% del requerimiento diario por cada 100 gramos. Verduras de hoja verde como espinaca y br�coli, que contienen      " +
                                                  "\n hierro y antioxidantes esenciales para la producci�n de gl�bulos rojos y la oxigenaci�n celular, aportando cerca del 15% " +
                                                  "\n del requerimiento diario por cada 100 gramos. Frutos secos y semillas como almendras y nueces, que contienen vitamina E  " +
                                                  "\n y �cidos grasos esenciales, contribuyendo a la protecci�n celular y fortalecimiento del sistema inmunol�gico, con un     " +
                                                  "\n aporte del 37% del requerimiento diario por cada 28 gramos de consumo. Este diagn�stico es una referencia l�gica basada  " +
                                                  "\n en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga artritis ni que el tratamiento sea el adecuado.   " +
                                                  "\n Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu    " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Para una mujer adulta con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidrataci�n       " +
                                                  "\n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se            " +
                                                  "\n recomienda actividad f�sica ligera como caminatas cortas y ejercicios de respiraci�n para fortalecer los pulmones       " + 
                                                  "\n sin generar fatiga excesiva. Tambi�n es recomendable realizar ejercicios de expansi�n tor�cica y t�cnicas de            " +
                                                  "\n respiraci�n profunda para mejorar la capacidad pulmonar y reducir la sensaci�n de ahogo. Adem�s, el uso de t�cnicas     " +
                                                  "\n de relajaci�n como la meditaci�n y el control de la respiraci�n puede ayudar a reducir la ansiedad provocada por la        " + 
                                                  "\n dificultad respiratoria. HIDRATACI�N. Se aconseja consumir al menos 2.5 litros de agua al d�a para mantener las v�as       " +
                                                  "\n respiratorias hidratadas y facilitar la eliminaci�n de mucosidad. Adem�s, el consumo de l�quidos tibios como infusiones    " +
                                                  "\n de jengibre y miel puede ayudar a calmar la irritaci�n de garganta y mejorar la expectoraci�n. Tambi�n se recomienda el    " +
                                                  "\n consumo de caldos naturales y jugos c�tricos para mantener el equilibrio de electrolitos y fortalecer el sistema           " + 
                                                  "\n inmunol�gico. POSIBLE TRATAMIENTO. El tratamiento para la tosferina incluye antibi�ticos como azitromicina, claritromicina " +
                                                  "\n y eritromicina. Tambi�n se recomienda el uso de broncodilatadores en casos de dificultad respiratoria severa. En algunos   " +
                                                  "\n casos, los m�dicos pueden indicar el uso de corticosteroides para reducir la inflamaci�n de las v�as respiratorias. Marcas " +
                                                  "\n reconocidas incluyen Zithromax, Biaxin y Erythrocin. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica en vitaminas y " +
                                                  "\n antioxidantes para fortalecer el sistema inmunol�gico. Algunos alimentos clave incluyen frutas c�tricas como naranja y     " +
                                                  "\n lim�n, ricas en vitamina C, que ayudan a la recuperaci�n y fortalecimiento del sistema inmune, aportando aproximadamente   " +
                                                  "\n el 89% del requerimiento diario por cada 100 gramos de consumo. Verduras como zanahoria y espinaca, ricas en vitamina A,   " +
                                                  "\n que contribuyen a la salud respiratoria y fortalecen las mucosas, con un aporte del 15% del requerimiento diario por cada  " +
                                                  "\n 100 gramos. Miel, que posee propiedades antibacterianas y ayuda a calmar la irritaci�n de garganta, proporcionando alivio  " +
                                                  "\n inmediato. Jengibre, con efectos antiinflamatorios que pueden ayudar a reducir la congesti�n y mejorar la respiraci�n.     " +
                                                  "\n Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga    " +
                                                  "\n tosferina ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para " +
                                                  "\n mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Para una mujer adulta con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidrataci�n     " +
                                                  "\n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se          " +
                                                  "\n recomienda reposo y evitar actividad f�sica intensa hasta la recuperaci�n completa para prevenir complicaciones.      " +
                                                  "\n Sin embargo, ejercicios suaves de movilidad pueden ser beneficiosos para evitar la rigidez muscular y mejorar la      " +
                                                  "\n circulaci�n. Tambi�n se recomienda realizar ejercicios de estiramiento para reducir la tensi�n muscular y mejorar     " +
                                                  "\n la recuperaci�n. HIDRATACI�N. Se aconseja consumir al menos 2 litros de agua al d�a para mantener una buena hidrataci�n  " +
                                                  "\n y aliviar la inflamaci�n de las gl�ndulas salivales. Tambi�n se recomienda el consumo de caldos y jugos naturales para   " +
                                                  "\n mantener el equilibrio de electrolitos. Adem�s, el consumo de bebidas ricas en antioxidantes como el t� verde puede      " +
                                                  "\n ayudar a fortalecer el sistema inmunol�gico. POSIBLE TRATAMIENTO. El tratamiento para las paperas es sintom�tico e       " + 
                                                  "\n incluye analg�sicos como paracetamol e ibuprofeno para reducir el dolor y la fiebre. En casos severos, se pueden         " +
                                                  "\n administrar corticosteroides para reducir la inflamaci�n. Tambi�n se recomienda el uso de compresas fr�as para aliviar   " +
                                                  "\n la hinchaz�n de las gl�ndulas salivales. Marcas reconocidas incluyen Tempra y Advil. ALIMENTACI�N RECOMENDADA. Se        " +
                                                  "\n recomienda una dieta suave y rica en nutrientes esenciales. Algunos alimentos clave incluyen yogur y pur� de papas,      " +
                                                  "\n que son f�ciles de consumir y ayudan a mantener la energ�a sin irritar las gl�ndulas salivales. Frutas como pl�tano      " +
                                                  "\n y mango, ricas en vitamina B6, que contribuyen a la reducci�n de la inflamaci�n y fortalecen el sistema inmunol�gico.    " +
                                                  "\n Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga  " +
                                                  "\n paperas ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para " +
                                                  "\n mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria." +
                                                  "\n La listeriosis es una infecci�n bacteriana causada por Listeria monocytogenes, que puede provocar fiebre,        " +
                                                  "\n dolores musculares, n�useas y, en casos graves, afectar el sistema nervioso. EJERCICIO. Se recomienda            " +
                                                  "\n actividad f�sica moderada, evitando esfuerzos excesivos si hay fiebre o fatiga. Caminar y ejercicios de          " +
                                                  "\n bajo impacto pueden ser beneficiosos para mantener la circulaci�n y el bienestar general. Tambi�n se sugiere     " +
                                                  "\n realizar ejercicios de respiraci�n profunda para mejorar la oxigenaci�n y reducir el estr�s. HIDRATACI�N. Es     " +
                                                  "\n fundamental consumir entre 2 y 2.5 litros de agua al d�a para ayudar al cuerpo a combatir la infecci�n y         " +
                                                  "\n mantenerse hidratado. Se recomienda complementar la ingesta de agua con l�quidos ricos en electrolitos como      " +
                                                  "\n sueros orales o agua de coco, que pueden ayudar a reponer minerales esenciales perdidos por la fiebre y          " +
                                                  "\n sudoraci�n. POSIBLE TRATAMIENTO. La listeriosis se trata con antibi�ticos como la ampicilina o el                " +
                                                  "\n trimetoprima-sulfametoxazol, que ayudan a eliminar la bacteria. En casos graves, puede ser necesario el uso de   " +
                                                  "\n antibi�ticos intravenosos para controlar la infecci�n. ALIMENTACI�N RECOMENDADA. Consumir alimentos ricos en     " +
                                                  "\n antioxidantes y vitaminas para fortalecer el sistema inmunol�gico. Espinaca, rica en hierro y vitamina K, que    " +
                                                  "\n favorece la recuperaci�n celular, proporcionando hasta el 20% del requerimiento diario de hierro por cada 100 g.    " +
                                                  "\n Yogur natural, fuente de probi�ticos que ayudan a fortalecer la flora intestinal y mejorar la respuesta inmune.     " +
                                                  "\n Frutas c�tricas como naranja y toronja, ricas en vitamina C, que contribuyen a la recuperaci�n, aportando           " +
                                                  "\n aproximadamente el 89% del requerimiento diario por cada 100 g. Este es solo un diagn�stico predeterminado l�gico,  " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus     " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor    " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le      " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n La shigelosis es una infecci�n bacteriana causada por Shigella, que provoca diarrea con sangre, fiebre, calambres      " +
                                                  "\n abdominales y deshidrataci�n. EJERCICIO. Se recomienda actividad f�sica ligera mientras persistan los s�ntomas,        " +
                                                  "\n evitando esfuerzos intensos que puedan agravar la deshidrataci�n. Caminar y realizar estiramientos suaves pueden       " +
                                                  "\n ser beneficiosos para mantener la circulaci�n y el bienestar general. HIDRATACI�N. Es fundamental consumir entre       " +
                                                  "\n 2.5 y 3 litros de agua al d�a para compensar la p�rdida de l�quidos causada por la diarrea. Tambi�n se recomienda      " +
                                                  "\n el consumo de soluciones de rehidrataci�n oral que contienen electrolitos esenciales como sodio y potasio, ayudando    " +
                                                  "\n a restablecer el equilibrio h�drico del cuerpo. POSIBLE TRATAMIENTO. La shigelosis se trata con antibi�ticos como      " +
                                                  "\n ciprofloxacino o azitromicina, que ayudan a eliminar la bacteria. Se recomienda evitar el uso de medicamentos          " +
                                                  "\n antidiarreicos como la loperamida, ya que pueden prolongar la infecci�n. ALIMENTACI�N RECOMENDADA. Consumir alimentos  " +
                                                  "\n de f�cil digesti�n y ricos en nutrientes esenciales para la recuperaci�n. Pl�tano, rico en potasio, que ayuda a        " +
                                                  "\n reponer los electrolitos perdidos, aportando aproximadamente el 10% del requerimiento diario por cada 100 g. Arroz     " +
                                                  "\n blanco, fuente de carbohidratos de f�cil digesti�n, que contribuye a la recuperaci�n intestinal. Zanahoria, rica en    " +
                                                  "\n vitamina A y antioxidantes, que favorecen la regeneraci�n de la mucosa intestinal, proporcionando cerca del 15% del    " +
                                                  "\n requerimiento diario de vitamina A por cada 100 g. Manzana, con pectina que ayuda a regular el tr�nsito intestinal,    " +
                                                  "\n aportando fibra soluble beneficiosa para la digesti�n. Este es solo un diagn�stico predeterminado l�gico, haberlo      " + 
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas     " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en     " +
                                                  "\n el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo   " +
                                                  "\n se le recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n La EPOC es una afecci�n respiratoria progresiva que dificulta la respiraci�n y puede causar tos cr�nica, producci�n      " +
                                                  "\n de moco y fatiga. EJERCICIO. Se recomienda actividad f�sica moderada para mejorar la capacidad pulmonar y reducir        " +
                                                  "\n la fatiga. Ejercicios de respiraci�n profunda y t�cnicas de fortalecimiento muscular pueden ser beneficiosos. Se         " +
                                                  "\n sugiere evitar ambientes con humo o contaminaci�n para prevenir exacerbaciones. HIDRATACI�N. Es fundamental consumir     " +
                                                  "\n entre 2 y 3 litros de agua al d�a para mantener las v�as respiratorias hidratadas y facilitar la eliminaci�n de          " +
                                                  "\n mucosidad. Se recomienda el consumo de l�quidos tibios como t� de jengibre o infusiones de hierbas para aliviar la       " +
                                                  "\n irritaci�n pulmonar. POSIBLE TRATAMIENTO. La EPOC se trata con broncodilatadores de acci�n prolongada como el salmeterol " +
                                                  "\n o el tiotropio, que ayudan a abrir las v�as respiratorias. Tambi�n pueden utilizarse corticosteroides inhalados para     " +
                                                  "\n reducir la inflamaci�n. En casos graves, puede ser necesario el uso de oxigenoterapia. ALIMENTACI�N RECOMENDADA.         " +
                                                  "\n Consumir alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema respiratorio. Pescados      " +
                                                  "\n grasos como salm�n y at�n, ricos en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias y pueden ayudar      " +
                                                  "\n a reducir la inflamaci�n pulmonar. Frutas y verduras de colores vivos como ar�ndanos, fresas, espinacas y br�coli,       " +
                                                  "\n ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las c�lulas del da�o y fortalecer el       " +
                                                  "\n sistema inmunol�gico. Jengibre, que contiene compuestos con efectos antiinflamatorios que podr�an ser beneficiosos       " +
                                                  "\n para las v�as respiratorias. C�rcuma, con su componente activo, la curcumina, que tiene potentes propiedades             " +
                                                  "\n antiinflamatorias y antioxidantes. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza    " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello    " +
                                                  "\n se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su    " +
                                                  "\n paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar  " +
                                                  "\n a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n EJERCICIO: No hay una recomendaci�n espec�fica de actividad f�sica para la clamidia, pero mantener un estilo de         " +
                                                  "\n vida activo fortalece el sistema inmunol�gico y ayuda a la recuperaci�n. Se recomienda ejercicio moderado como          " +
                                                  "\n caminatas diarias de 30 minutos o yoga para reducir el estr�s, que puede afectar la respuesta inmune. HIDRATACI�N:      " +
                                                  "\n Es fundamental consumir al menos 2 litros de agua al d�a para ayudar a eliminar toxinas y mantener el equilibrio        " +
                                                  "\n de los fluidos corporales. Tambi�n se recomienda el consumo de infusiones como t� verde, que tiene propiedades          " +
                                                  "\n antioxidantes y antibacterianas. Adem�s, el agua ayuda a mantener la salud de las mucosas, reduciendo la irritaci�n     " +
                                                  "\n y el malestar en el tracto urinario. POSIBLE TRATAMIENTO: La clamidia se trata con antibi�ticos como la azitromicina    " +
                                                  "\n en dosis �nica o la doxiciclina durante 7 d�as. Tambi�n pueden utilizarse levofloxacina o amoxicilina en ciertos casos. " +
                                                  "\n Es esencial que la pareja tambi�n reciba tratamiento para evitar reinfecciones. Adem�s, se recomienda evitar el consumo   " +
                                                  "\n de alcohol y tabaco durante el tratamiento, ya que pueden afectar la eficacia de los antibi�ticos y debilitar el sistema  " +
                                                  "\n inmunol�gico. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para     " +
                                                  "\n fortalecer el sistema inmunol�gico, tales como frutas c�tricas como naranjas y toronjas, que aportan vitamina C en un     " +
                                                  "\n 89% de la ingesta diaria recomendada, ayudando a combatir infecciones. Yogur natural, que contiene probi�ticos que        " +
                                                  "\n favorecen la salud intestinal y el equilibrio de la flora vaginal. Verduras de hoja verde como espinacas y acelgas,       " +
                                                  "\n que aportan hasta un 50% de la ingesta diaria recomendada de vitamina A y K, esenciales para la regeneraci�n celular.     " + 
                                                  "\n Ajo, que posee propiedades antimicrobianas y antioxidantes, contribuyendo con hasta un 40% de la ingesta diaria           " +
                                                  "\n recomendada de compuestos bioactivos beneficiosos para la salud. este es solo un diagn�stico predeterminado l�gico.       " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente    " +
                                                  "\n correctas. se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su   " +
                                                  "\n salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes      " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n EJERCICIO: Durante la recuperaci�n de la meningitis bacteriana, se recomienda evitar esfuerzos f�sicos intensos         " +
                                                  "\n y priorizar el descanso. Una vez estabilizada la condici�n, se pueden realizar ejercicios de bajo impacto como          " +
                                                  "\n caminatas suaves o ejercicios de respiraci�n para mejorar la oxigenaci�n cerebral. HIDRATACI�N: Es crucial el           " +
                                                  "\n consumo de al menos 2.5 litros de agua al d�a para mantener la hidrataci�n y ayudar a la eliminaci�n de toxinas.        " +
                                                  "\n Tambi�n se recomienda el consumo de caldos naturales y jugos sin az�car para aportar electrolitos esenciales. La        " +
                                                  "\n hidrataci�n adecuada es clave para mantener la viscosidad del l�quido cefalorraqu�deo y reducir la inflamaci�n de        " +
                                                  "\n las meninges. POSIBLE TRATAMIENTO: La meningitis bacteriana requiere tratamiento inmediato con antibi�ticos intravenosos " +
                                                  "\n como ceftriaxona, cefotaxima o ampicilina, dependiendo del agente causal. Tambi�n pueden administrarse corticosteroides  " +
                                                  "\n para reducir la inflamaci�n cerebral y medicamentos para controlar s�ntomas como fiebre y convulsiones. En algunos     " +
                                                  "\n casos, se recomienda el uso de antivirales si la infecci�n es mixta. Adem�s, la suplementaci�n con vitamina B puede    " +
                                                  "\n ser beneficiosa para la recuperaci�n neurol�gica. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en         " + 
                                                  "\n antioxidantes y nutrientes esenciales para la recuperaci�n, tales como pescado azul como salm�n y at�n, que contienen  " +
                                                  "\n �cidos grasos Omega-3 con propiedades antiinflamatorias y aportan hasta un 70% de la ingesta diaria recomendada de     " +
                                                  "\n estos nutrientes. Frutas como fresas y ar�ndanos, que contienen antioxidantes y vitamina C en un 89% de la ingesta     " +
                                                  "\n diaria recomendada, fortaleciendo el sistema inmunol�gico. Verduras como zanahorias y br�coli, que aportan hasta un       " +
                                                  "\n 50% de la ingesta diaria recomendada de vitamina A y K, esenciales para la funci�n cerebral. Frutos secos como almendras  " +
                                                  "\n y nueces, que contienen vitamina E y magnesio, contribuyendo con hasta un 40% de la ingesta diaria recomendada de estos   " +
                                                  "\n nutrientes esenciales para la recuperaci�n neurol�gica. este es solo un diagn�stico predeterminado l�gico. haberlo        " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas.  " +
                                                  "\n se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la  " +
                                                  "\n respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n EJERCICIO: La actividad f�sica es clave para mejorar la calidad de vida de las personas con c�ncer. Se recomienda ejercicio  " +
                                                  "\n moderado como caminatas diarias de 30 a 45 minutos, yoga o ejercicios de resistencia para fortalecer los m�sculos y reducir  " +
                                                  "\n la fatiga. Tambi�n es beneficioso realizar ejercicios de respiraci�n profunda para mejorar la oxigenaci�n celular.           " +
                                                  "\n HIDRATACI�N: Es fundamental consumir al menos 2.5 litros de agua al d�a para mantener la hidrataci�n y ayudar a la           " +
                                                  "\n eliminaci�n de toxinas. Tambi�n se recomienda el consumo de infusiones con propiedades antioxidantes como t� verde           " +
                                                  "\n o manzanilla. La hidrataci�n adecuada es esencial para reducir los efectos secundarios de la quimioterapia, como la          " +
                                                  "\n fatiga y la sequedad en la piel y mucosas. POSIBLE TRATAMIENTO: El tratamiento del c�ncer var�a seg�n el tipo y la           " +
                                                  "\n etapa de la enfermedad, incluyendo opciones como cirug�a, quimioterapia, radioterapia e inmunoterapia. Tambi�n pueden        " +
                                                  "\n utilizarse terapias dirigidas y hormonales en ciertos casos. Es esencial seguir las indicaciones m�dicas y mantener un       " +
                                                  "\n monitoreo constante. Adem�s, la suplementaci�n con antioxidantes como la vitamina E y el selenio puede ayudar a reducir      " +
                                                  "\n el da�o celular. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para     " +
                                                  "\n fortalecer el sistema inmunol�gico y reducir la inflamaci�n, tales como frutas c�tricas como naranjas y toronjas, que        " +
                                                  "\n aportan vitamina C en un 89% de la ingesta diaria recomendada, ayudando a combatir el da�o celular. Pescados grasos como     " +
                                                  "\n salm�n y at�n, que contienen �cidos grasos Omega-3 con propiedades antiinflamatorias y aportan hasta un 70% de la ingesta    " +
                                                  "\n diaria recomendada de estos nutrientes. Verduras de hoja verde como espinacas y acelgas, que contienen antioxidantes y       " +
                                                  "\n vitaminas esenciales para la funci�n celular, aportando hasta un 50% de la ingesta diaria recomendada de vitamina A y K.     " +
                                                  "\n Frutos secos como almendras y nueces, que contienen vitamina E y magnesio, contribuyendo con hasta un 40% de la ingesta      " +
                                                  "\n diaria recomendada de estos nutrientes esenciales para la regeneraci�n celular. este es solo un diagn�stico predeterminado   " +
                                                  "\n l�gico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente " +
                                                  "\n correctas. se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su  " +
                                                  "\n salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.30-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la influenza es fundamental mantener una hidrataci�n adecuada con un consumo      " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a la          " +
                                                  "\n recuperaci�n y prevenir la deshidrataci�n causada por la fiebre. EJERCICIO: Se recomienda actividad f�sica moderada   " +
                                                  "\n como caminatas suaves o yoga evitando esfuerzos intensos mientras persistan los s�ntomas. Una vez superada la fase        " +
                                                  "\n aguda es recomendable realizar ejercicios de respiraci�n profunda para mejorar la capacidad pulmonar y reducir la         " +
                                                  "\n sensaci�n de fatiga. POSIBLE TRATAMIENTO: El tratamiento suele incluir medicamentos para reducir la fiebre y aliviar      " +
                                                  "\n los s�ntomas como el paracetamol marca com�n Tempra o el ibuprofeno. En casos m�s severos los m�dicos pueden recetar      " +
                                                  "\n antivirales espec�ficos contra la gripe como el oseltamivir marca com�n Tamiflu. Es importante seguir las indicaciones    " +
                                                  "\n m�dicas y evitar el uso de aspirina ya que puede generar complicaciones en algunos casos. ALIMENTOS RECOMENDADOS: Para    " +
                                                  "\n fortalecer el sistema inmunol�gico y acelerar la recuperaci�n se recomienda el consumo de NARANJAS Y GUAYABAS: Ricas en   " +
                                                  "\n vitamina C que ayuda a reducir la duraci�n de los s�ntomas aportando aproximadamente el 89% de la ingesta diaria          " +
                                                  "\n recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos con propiedades antiinflamatorias y puede aliviar la          " +
                                                  "\n congesti�n. MIEL Y LIM�N: Combinaci�n efectiva para calmar la garganta y reducir la tos aportando flavonoides y vitamina C.  " +
                                                  "\n ESPINACAS Y BR�COLI: Aportan antioxidantes y vitamina A esenciales para la regeneraci�n celular con un contenido de          " +
                                                  "\n aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos que pueden     " +
                                                  "\n fortalecer el sistema inmunol�gico y mejorar la salud digestiva aportando calcio y prote�nas esenciales. Este es solo un     " +
                                                  "\n diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las   " +
                                                  "\n respuestas sean completamente correctas para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del  " +
                                                  "\n todo se le recomienda mucho consultar a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la neumon�a es fundamental mantener una hidrataci�n adecuada con un consumo             " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a la                " +
                                                  "\n recuperaci�n y prevenir la deshidrataci�n causada por la fiebre. EJERCICIO: Se recomienda actividad f�sica moderada         " +
                                                  "\n como caminatas suaves evitando esfuerzos intensos mientras persistan los s�ntomas. Una vez superada la fase aguda es        " +
                                                  "\n recomendable realizar ejercicios de respiraci�n profunda y expansi�n pulmonar como t�cnicas de fisioterapia respiratoria    " +
                                                  "\n para mejorar la capacidad pulmonar y reducir la sensaci�n de fatiga. POSIBLE TRATAMIENTO: El tratamiento suele incluir      " +
                                                  "\n antibi�ticos como la amoxicilina la azitromicina o la ceftriaxona. En casos m�s severos los m�dicos pueden recetar          " +
                                                  "\n antivirales como el oseltamivir adem�s de medicamentos para reducir la fiebre como el paracetamol o el ibuprofeno. Es       " +
                                                  "\n importante seguir las indicaciones m�dicas y evitar la automedicaci�n. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema   " + 
                                                  "\n inmunol�gico y acelerar la recuperaci�n se recomienda el consumo de NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a    " +
                                                  "\n reducir la duraci�n de los s�ntomas aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos.  " +
                                                  "\n JENGIBRE: Contiene compuestos con propiedades antiinflamatorias y puede aliviar la congesti�n. ESPINACAS Y BR�COLI: Aportan " +
                                                  "\n antioxidantes y vitamina A esenciales para la regeneraci�n celular con un contenido de aproximadamente 56% de la ingesta    " +
                                                  "\n diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos que pueden fortalecer el sistema inmunol�gico   " +
                                                  "\n y mejorar la salud digestiva aportando calcio y prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico     " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente      " +
                                                  "\n correctas para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento  " +
                                                  "\n adecuado de su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho " +
                                                  "\n consultar a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la diabetes es fundamental mantener una hidrataci�n adecuada con un consumo         " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a la            " +
                                                  "\n regulaci�n de la glucosa en sangre y prevenir la deshidrataci�n. EJERCICIO: Se recomienda actividad f�sica regular      " +
                                                  "\n como caminatas nataci�n o ejercicios de resistencia para mejorar la sensibilidad a la insulina y controlar los          " +
                                                  "\n niveles de glucosa en sangre. Adem�s se recomienda la pr�ctica de ejercicios aer�bicos como ciclismo o baile al         " +
                                                  "\n menos 150 minutos por semana para mejorar la funci�n cardiovascular y reducir el riesgo de complicaciones. POSIBLE      " +
                                                  "\n TRATAMIENTO: El tratamiento suele incluir medicamentos como la metformina para mejorar la sensibilidad a la insulina.   " +
                                                  "\n En casos m�s severos los m�dicos pueden recetar insulina de acci�n r�pida o prolongada adem�s de medicamentos para      " +
                                                  "\n controlar la presi�n arterial y el colesterol. Es importante seguir las indicaciones m�dicas y mantener un monitoreo    " +
                                                  "\n constante de los niveles de glucosa. ALIMENTOS RECOMENDADOS: Para fortalecer el metabolismo y mejorar el control de     " +
                                                  "\n la glucosa se recomienda el consumo de FRUTOS ROJOS: Ricos en antioxidantes y fibra que ayudan a regular la glucosa     " +
                                                  "\n en sangre aportando aproximadamente el 32% de la ingesta diaria recomendada por cada 100 gramos. FRUTOS SECOS:          " +
                                                  "\n Contienen grasas saludables y fibra que pueden mejorar la sensibilidad a la insulina aportando aproximadamente el 25%   " +
                                                  "\n de la ingesta diaria recomendada por cada 100 gramos. ESPINACAS Y BR�COLI: Aportan antioxidantes y vitamina A esenciales   " +
                                                  "\n para la regeneraci�n celular con un contenido de aproximadamente 56% de la ingesta diaria recomendada por cada 100         " +
                                                  "\n gramos. AVENA: Rica en fibra soluble que ayuda a estabilizar los niveles de glucosa en sangre aportando aproximadamente    " +
                                                  "\n el 40% de la ingesta diaria recomendada por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico haberlo     " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas   " +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado  " +
                                                  "\n de su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho         " +
                                                  "\n consultar a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2 a 2.5 litros de agua al d�a (aproximadamente ocho a diez vasos de agua       " +
                                                  "\n de tama�o regular) para ayudar a mantener las v�as respiratorias hidratadas y reducir la inflamaci�n. La hidrataci�n    " +
                                                  "\n adecuada tambi�n contribuye a la fluidificaci�n de las secreciones bronquiales, facilitando la expectoraci�n y          " +
                                                  "\n mejorando la respiraci�n. Adem�s, el consumo de infusiones calientes con miel y jengibre puede ayudar a aliviar la      " +
                                                  "\n irritaci�n de la garganta y mejorar la capacidad respiratoria. EJERCICIO: Actividad f�sica moderada como caminatas,     " +
                                                  "\n nataci�n y ejercicios de respiraci�n pueden ayudar a fortalecer los pulmones y mejorar la oxigenaci�n. Es importante    " +
                                                  "\n evitar el sobreesfuerzo y realizar actividad en ambientes bien ventilados para reducir el riesgo de crisis asm�ticas.   " +
                                                  "\n Tambi�n se recomienda la pr�ctica de ejercicios de expansi�n tor�cica, que pueden mejorar la capacidad pulmonar y       " +
                                                  "\n reducir la sensaci�n de falta de aire. POSIBLE TRATAMIENTO: El tratamiento est�ndar incluye broncodilatadores de        " +
                                                  "\n alivio r�pido como Salbutamol (marcas comunes: Ventolin, Aerolin), corticosteroides inhalados como Fluticasona y        " +
                                                  "\n Budesonida (marcas comunes: Flixotide, Pulmicort), y en algunos casos, modificadores de leucotrienos como Montelukast   " +
                                                  "\n (marca com�n: Singulair). Es fundamental seguir estrictamente el plan de acci�n para el asma indicado por el m�dico y   " +
                                                  "\n usar los medicamentos preventivos regularmente. ALIMENTACI�N: Se recomienda el consumo de alimentos que fortalezcan     " +
                                                  "\n el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como: Pescados grasos (salm�n, at�n, ricos en Omega-3,   " +
                                                  "\n que poseen propiedades antiinflamatorias y pueden ayudar a reducir la inflamaci�n de las v�as respiratorias, aportando    " +
                                                  "\n cerca de 50% de la ingesta diaria recomendada por cada porci�n de 100 g); Frutas y verduras de colores vivos (ar�ndanos,  " +
                                                  "\n fresas, espinacas, br�coli), ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las c�lulas    " +
                                                  "\n del da�o y fortalecer el sistema inmunol�gico; Jengibre (contiene compuestos con efectos antiinflamatorios, que podr�an   " +
                                                  "\n ser beneficiosos para las v�as respiratorias); C�rcuma (con su componente activo, la curcumina, tambi�n tiene potentes    " +
                                                  "\n propiedades antiinflamatorias y antioxidantes). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado     " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para       " +
                                                  "\n ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. " +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.      " +
                                                  "\n �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: Es fundamental que la paciente mantenga una hidrataci�n adecuada, consumiendo al menos 2 a 2.5 litros       " +
                                                  "\n de agua al d�a (aproximadamente ocho a diez vasos de agua de tama�o regular) para ayudar a la funci�n renal y la         " +
                                                  "\n eliminaci�n de toxinas. La hidrataci�n tambi�n contribuye a la regulaci�n de la temperatura corporal y al transporte     " +
                                                  "\n eficiente de nutrientes esenciales para la recuperaci�n. EJERCICIO: Se recomienda actividad f�sica moderada como         " + 
                                                  "\n caminatas, yoga o entrenamiento de resistencia, adaptado a su estado de salud y bajo supervisi�n m�dica, evitando el     " +
                                                  "\n sobreesfuerzo. El ejercicio regular ayuda a reducir el estr�s y fortalecer el sistema inmunol�gico. POSIBLE TRATAMIENTO: " +
                                                  "\n El tratamiento est�ndar incluye terapia antirretroviral (TAR), que combina varios medicamentos para suprimir la          " +
                                                  "\n replicaci�n del virus y mejorar la calidad de vida. Algunos f�rmacos comunes incluyen Tenofovir, Emtricitabina,          " +
                                                  "\n Efavirenz (marca Atripla), Dolutegravir (marca Tivicay) y Lamivudina (marca Epivir). Es crucial seguir estrictamente     " + 
                                                  "\n el tratamiento indicado por el m�dico y realizar controles peri�dicos. ALIMENTACI�N: Se recomienda el consumo de         " +
                                                  "\n alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como: Frutas c�tricas         " +
                                                  "\n (naranjas, toronjas, limones), ricas en vitamina C, que fortalece el sistema inmune, aportando aproximadamente 89% del   " +
                                                  "\n requerimiento diario por cada 100 g; Aguacate, fuente de grasas saludables y antioxidantes, con 14% de la ingesta        " +
                                                  "\n diaria recomendada de vitamina E por cada 100 g; Pescados grasos (salm�n, at�n), ricos en Omega-3, que pueden ayudar     " +
                                                  "\n a reducir la inflamaci�n, aportando cerca de 50% de la ingesta diaria recomendada por cada porci�n de 100 g; Verduras    " +
                                                  "\n de hoja verde (espinacas, kale), con vitamina A y hierro, esenciales para la salud celular, aportando 56% de la ingesta  " +
                                                  "\n diaria recomendada de vitamina A por cada 100 g; Legumbres (frijoles, lentejas), que aportan prote�nas y fibra, con 37%  " +
                                                  "\n de la ingesta diaria recomendada de hierro por cada 100 g. Este es solo un diagn�stico predeterminado l�gico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas." +
                                                  "\n Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento     " +
                                                  "\n adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su   " +
                                                  "\n m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2 a 2.5 litros de agua al d�a (aproximadamente ocho a diez vasos de agua        " +
                                                  "\n de tama�o regular) para ayudar a la eliminaci�n de toxinas y mantener la funci�n renal �ptima. Mantener una              " +
                                                  "\n hidrataci�n adecuada tambi�n contribuye a la regulaci�n de la temperatura corporal y al transporte eficiente de          " +
                                                  "\n nutrientes esenciales para la recuperaci�n. EJERCICIO: Actividad f�sica moderada como caminatas o ejercicios de          " +
                                                  "\n bajo impacto es recomendable para fortalecer el sistema inmunol�gico y mejorar la circulaci�n, evitando el sobreesfuerzo." +
                                                  "\n El ejercicio regular ayuda a reducir el estr�s, lo que puede mejorar la respuesta del sistema inmune y acelerar la       " +
                                                  "\n recuperaci�n. POSIBLE TRATAMIENTO: El tratamiento est�ndar incluye antibi�ticos como Ceftriaxona (inyecci�n �nica)       " +
                                                  "\n y Azitromicina (dosis oral), los cuales ayudan a eliminar la bacteria Neisseria gonorrhoeae. Es fundamental completar       " +
                                                  "\n el tratamiento indicado por el m�dico para evitar la resistencia bacteriana y prevenir complicaciones como la enfermedad    " +
                                                  "\n inflamatoria p�lvica. ALIMENTACI�N: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden  " +
                                                  "\n a reducir la inflamaci�n, tales como: Naranjas (ricas en vitamina C, que fortalece el sistema inmune, aportando             " +
                                                  "\n aproximadamente 89% del requerimiento diario por cada 100 g); Espinacas (fuente de hierro, esencial para la producci�n      " +
                                                  "\n de gl�bulos rojos, con 56% de la ingesta diaria recomendada por cada 100 g); Yogur natural (rico en probi�ticos, que        " +
                                                  "\n favorecen la salud intestinal y el sistema inmune, aportando 30% de la ingesta diaria recomendada de calcio por cada        " +
                                                  "\n 100 g). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga    " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico" +
                                                  "\n no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera" +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Para una mujer adulta con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidrataci�n         " +
                                                  "\n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda   " +
                                                  "\n actividad f�sica moderada como yoga, pilates o caminatas suaves de 30 minutos al d�a para fortalecer el sistema           " +
                                                  "\n inmunol�gico y reducir el estr�s, ya que el estr�s puede desencadenar brotes de herpes. Tambi�n es beneficioso realizar   " +
                                                  "\n ejercicios de respiraci�n y relajaci�n para mejorar la respuesta del cuerpo ante el virus. HIDRATACI�N. Se aconseja       " +
                                                  "\n consumir al menos 2 litros de agua al d�a para mantener la piel hidratada y reducir la sequedad de las mucosas. Adem�s,   " +
                                                  "\n el consumo de infusiones de manzanilla y t� verde puede ayudar a reducir la inflamaci�n y fortalecer el sistema           " +
                                                  "\n inmunol�gico. POSIBLE TRATAMIENTO. El tratamiento para el herpes genital incluye antivirales como aciclovir, famciclovir  " +
                                                  "\n y valaciclovir, que ayudan a reducir la duraci�n y frecuencia de los brotes. Marcas reconocidas incluyen Zovirax y        " +
                                                  "\n Valtrex. Tambi�n se recomienda el uso de cremas t�picas con propiedades calmantes para aliviar el malestar. ALIMENTACI�N  " +
                                                  "\n RECOMENDADA. Se recomienda una dieta rica en lisina y antioxidantes para fortalecer el sistema inmunol�gico. Algunos      " +
                                                  "\n alimentos clave incluyen yogur y leche, ricos en lisina, que ayudan a inhibir la replicaci�n del virus. Frutas c�tricas   " +
                                                  "\n como naranja y kiwi, ricas en vitamina C, que fortalecen el sistema inmunol�gico, aportando aproximadamente el 89% del    " +
                                                  "\n requerimiento diario por cada 100 gramos de consumo. Verduras como espinaca y zanahoria, ricas en vitamina A, que         " +
                                                  "\n contribuyen a la regeneraci�n celular y fortalecen las mucosas. Este diagn�stico es una referencia l�gica basada en       " +
                                                  "\n informaci�n m�dica, pero no garantiza al 100% que el paciente tenga herpes genital ni que el tratamiento sea el adecuado. " +
                                                  "\n Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu     " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n Para una mujer adulta con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidrataci�n      " +
                                                  "\n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se           " +
                                                  "\n recomienda actividad f�sica moderada como caminatas diarias de 30 minutos, ejercicios de movilidad articular y         " +
                                                  "\n estiramientos para mejorar la circulaci�n y fortalecer el sistema inmunol�gico. Tambi�n es beneficioso realizar        " +
                                                  "\n ejercicios de resistencia con pesas ligeras para mejorar la salud �sea y muscular. HIDRATACI�N. Se aconseja consumir   " +
                                                  "\n al menos 2.5 litros de agua al d�a para ayudar a eliminar toxinas del cuerpo y mejorar la circulaci�n sangu�nea.       " +
                                                  "\n Tambi�n se recomienda el consumo de jugos naturales ricos en antioxidantes como el jugo de granada y t� verde.         " + 
                                                  "\n POSIBLE TRATAMIENTO. El tratamiento est�ndar para la s�filis incluye antibi�ticos como penicilina G benzatina,         " +
                                                  "\n doxiciclina y ceftriaxona. Marcas reconocidas incluyen Benzetacil y Doxiciclina. Es crucial seguir el tratamiento      " +
                                                  "\n completo para evitar complicaciones. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica en prote�nas, vitaminas    " +
                                                  "\n y minerales para fortalecer el sistema inmunol�gico. Algunos alimentos clave incluyen carnes magras y pescado, fuentes " +
                                                  "\n de prote�nas esenciales. Frutas c�tricas como naranja y lim�n, ricas en vitamina C, que ayudan a la recuperaci�n y        " +
                                                  "\n fortalecimiento del sistema inmune. Verduras de hoja verde como espinaca y br�coli, que contienen hierro y antioxidantes  " +
                                                  "\n esenciales para la producci�n de gl�bulos rojos. Este diagn�stico es una referencia l�gica basada en informaci�n m�dica,  " +
                                                  "\n pero no garantiza al 100% que el paciente tenga s�filis ni que el tratamiento sea el adecuado. Se recomienda realizar m�s " +
                                                  "\n de un diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y    " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Para una mujer adulta con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidrataci�n       " +
                                                  "\n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se            " +
                                                  "\n recomienda actividad f�sica moderada como caminatas diarias de 30 minutos, ejercicios de respiraci�n profunda y yoga    " +
                                                  "\n para fortalecer los pulmones. Tambi�n es beneficioso realizar ejercicios de movilidad para mejorar la capacidad         " + 
                                                  "\n pulmonar y reducir la fatiga. HIDRATACI�N. Se aconseja consumir al menos 2.5 litros de agua al d�a para mantener        " +
                                                  "\n las v�as respiratorias hidratadas y facilitar la eliminaci�n de toxinas. Tambi�n se recomienda el consumo de caldos     " +
                                                  "\n naturales y jugos c�tricos para fortalecer el sistema inmunol�gico. POSIBLE TRATAMIENTO. El tratamiento est�ndar para   " +
                                                  "\n la tuberculosis incluye una combinaci�n de antibi�ticos como isoniazida, rifampicina, etambutol y pirazinamida. Marcas  " +
                                                  "\n reconocidas incluyen Rifater y Rimactane. Es crucial seguir el tratamiento completo para evitar resistencia a los          " +
                                                  "\n antibi�ticos. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica en prote�nas, vitaminas y minerales para fortalecer   " +
                                                  "\n el sistema inmunol�gico. Algunos alimentos clave incluyen carnes magras y pescado, fuentes de prote�nas esenciales.        " +
                                                  "\n Frutas c�tricas como naranja y kiwi, ricas en vitamina C, que ayudan a la recuperaci�n y fortalecimiento del sistema       " +
                                                  "\n inmune. Verduras de hoja verde como espinaca y br�coli, que contienen hierro y antioxidantes esenciales para la producci�n " +
                                                  "\n de gl�bulos rojos. Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el " +
                                                  "\n paciente tenga tuberculosis ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar " +
                                                  "\n a un m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n La artritis es una inflamaci�n de las articulaciones que puede causar dolor, rigidez y disminuci�n de la movilidad.         " +
                                                  "\n Existen diferentes tipos, como la osteoartritis y la artritis reumatoide, que pueden afectar la calidad de vida.            " +
                                                  "\n EJERCICIO. Se recomienda actividad f�sica moderada para mejorar la movilidad y reducir la rigidez articular. Ejercicios     " +
                                                  "\n de bajo impacto como nataci�n, yoga y caminatas pueden ser beneficiosos. Tambi�n se sugiere realizar ejercicios de          " +
                                                  "\n fortalecimiento muscular para mejorar el soporte de las articulaciones. HIDRATACI�N. Es fundamental consumir entre 2 y      " +
                                                  "\n 2.5 litros de agua al d�a para mantener la lubricaci�n de las articulaciones y reducir la inflamaci�n. Se recomienda        " +
                                                  "\n complementar la ingesta de agua con infusiones de c�rcuma y jengibre, que poseen propiedades antiinflamatorias. POSIBLE     " +
                                                  "\n TRATAMIENTO. La artritis se trata con medicamentos antiinflamatorios no esteroides como ibuprofeno y naproxeno, que ayudan  " +
                                                  "\n a reducir el dolor y la inflamaci�n. Tambi�n pueden utilizarse corticosteroides y f�rmacos modificadores de la enfermedad   " +
                                                  "\n como el metotrexato en casos m�s severos. ALIMENTACI�N RECOMENDADA. Consumir alimentos ricos en antioxidantes y �cidos      " +
                                                  "\n grasos esenciales para reducir la inflamaci�n. Pescados grasos como salm�n y at�n, ricos en �cidos grasos Omega-3, que      " +
                                                  "\n poseen propiedades antiinflamatorias y pueden ayudar a reducir la inflamaci�n articular. Frutas y verduras de colores vivos " +
                                                  "\n como ar�ndanos, fresas, espinacas y br�coli, ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger  " +
                                                  "\n las c�lulas del da�o y fortalecer el sistema inmunol�gico. Jengibre, que contiene compuestos con efectos antiinflamatorios  " +
                                                  "\n que podr�an ser beneficiosos para las articulaciones. C�rcuma, con su componente activo, la curcumina, que tiene potentes   " +
                                                  "\n propiedades antiinflamatorias y antioxidantes. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no     " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para  " +
                                                  "\n ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su  " +
                                                  "\n paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a   " +
                                                  "\n su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n La tosferina, tambi�n conocida como pertussis, es una infecci�n bacteriana altamente contagiosa que afecta las v�as       " +
                                                  "\n respiratorias y causa episodios de tos intensa. EJERCICIO. Se recomienda actividad f�sica ligera mientras persistan       " +
                                                  "\n los s�ntomas, evitando esfuerzos intensos que puedan agravar la fatiga y la dificultad respiratoria. Caminar y realizar   " +
                                                  "\n ejercicios de respiraci�n profunda pueden ser beneficiosos para mejorar la oxigenaci�n. HIDRATACI�N. Es fundamental       " +
                                                  "\n consumir entre 2 y 2.5 litros de agua al d�a para mantener las v�as respiratorias hidratadas y facilitar la eliminaci�n   " +
                                                  "\n de mucosidad. Se recomienda el consumo de l�quidos tibios como t� de jengibre o infusiones de hierbas para aliviar la     " +
                                                  "\n irritaci�n pulmonar. POSIBLE TRATAMIENTO. La tosferina se trata con antibi�ticos como azitromicina, claritromicina o      " +
                                                  "\n eritromicina, que ayudan a eliminar la bacteria. Tambi�n se recomienda el uso de broncodilatadores en casos de dificultad " +
                                                  "\n respiratoria severa. ALIMENTACI�N RECOMENDADA. Consumir alimentos ricos en antioxidantes y nutrientes esenciales para     " +
                                                  "\n fortalecer el sistema respiratorio. Frutas c�tricas como naranja y toronja, ricas en vitamina C, que contribuyen a la     " +
                                                  "\n recuperaci�n, aportando aproximadamente el 89% del requerimiento diario por cada 100 g. Miel, con propiedades antimicrobianas  " +
                                                  "\n y antiinflamatorias que pueden ayudar a aliviar la irritaci�n de la garganta. Jengibre, que contiene compuestos con            " +
                                                  "\n efectos antiinflamatorios que podr�an ser beneficiosos para las v�as respiratorias. Este es solo un diagn�stico predeterminado " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus     " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad  " +
                                                  "\n en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se  " +
                                                  "\n le recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Las paperas son una infecci�n viral que afecta las gl�ndulas salivales, causando inflamaci�n y dolor en la zona.          " +
                                                  "\n EJERCICIO. Se recomienda actividad f�sica ligera mientras persistan los s�ntomas, evitando esfuerzos intensos que         " +
                                                  "\n puedan agravar la fatiga. Caminar y realizar estiramientos suaves pueden ser beneficiosos para mantener la circulaci�n    " +
                                                  "\n y el bienestar general. HIDRATACI�N. Es fundamental consumir entre 2 y 2.5 litros de agua al d�a para ayudar al cuerpo    " +
                                                  "\n a combatir la infecci�n y mantenerse hidratado. Se recomienda complementar la ingesta de agua con l�quidos ricos en       " +
                                                  "\n electrolitos como sueros orales o agua de coco, que pueden ayudar a reponer minerales esenciales perdidos por la fiebre   " +
                                                  "\n y sudoraci�n. POSIBLE TRATAMIENTO. No existe un tratamiento antiviral espec�fico para las paperas. Se recomienda el uso   " +
                                                  "\n de paracetamol para aliviar la fiebre y el dolor, evitando el ibuprofeno y la aspirina, ya que pueden aumentar el riesgo  " +
                                                  "\n de sangrado. Tambi�n se sugiere el uso de compresas fr�as para reducir la inflamaci�n de las gl�ndulas salivales.         " +
                                                  "\n ALIMENTACI�N RECOMENDADA. Consumir alimentos ricos en antioxidantes y vitaminas para fortalecer el sistema inmunol�gico.  " +
                                                  "\n Frutas c�tricas como naranja y toronja, ricas en vitamina C, que contribuyen a la recuperaci�n, aportando aproximadamente " +
                                                  "\n el 89% del requerimiento diario por cada 100 g. Yogur natural, fuente de probi�ticos que ayudan a fortalecer la flora     " +
                                                  "\n intestinal y mejorar la respuesta inmune. Verduras de hoja verde como espinaca y acelga, que contienen hierro y antioxidantes " +
                                                  "\n esenciales para la recuperaci�n, proporcionando hasta el 15% del requerimiento diario de hierro por cada 100 g. Este es   " +
                                                  "\n solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad   " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de     " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta    " +
                                                  "\n del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita  " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n EJERCICIO: Durante la infecci�n por el virus del Zika, se recomienda evitar esfuerzos f�sicos intensos y priorizar        " +
                                                  "\n el descanso. Una vez que los s�ntomas disminuyen, se pueden realizar ejercicios de bajo impacto como caminatas            " +
                                                  "\n suaves o yoga para mejorar la circulaci�n y reducir la fatiga. Tambi�n es importante realizar ejercicios de respiraci�n   " +
                                                  "\n profunda para mejorar la oxigenaci�n celular y reducir la inflamaci�n. HIDRATACI�N: Es fundamental consumir al menos      " +
                                                  "\n 2.5 litros de agua al d�a para prevenir la deshidrataci�n y ayudar a la eliminaci�n de toxinas. Tambi�n se recomienda     " +
                                                  "\n el consumo de jugos naturales sin az�car y caldos ligeros para mantener el equilibrio de electrolitos. La hidrataci�n     " +
                                                  "\n adecuada contribuye a la regulaci�n de la temperatura corporal y ayuda a reducir la fiebre, uno de los s�ntomas comunes   " +
                                                  "\n del Zika. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para el Zika, pero los s�ntomas pueden aliviarse con   " +
                                                  "\n reposo, hidrataci�n y medicamentos como acetaminof�n para reducir la fiebre y el dolor. Se recomienda evitar el uso de    " +
                                                  "\n aspirina y otros antiinflamatorios no esteroideos hasta descartar la posibilidad de dengue. Adem�s, el consumo de         " +
                                                  "\n alimentos ricos en antioxidantes puede ayudar a reducir la inflamaci�n y fortalecer el sistema inmunol�gico. ALIMENTACI�N:" +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema           " +
                                                  "\n inmunol�gico, tales como frutas c�tricas como naranjas y toronjas, que aportan vitamina C en un 89% de la ingesta diaria  " +
                                                  "\n recomendada, ayudando a combatir infecciones. Verduras de hoja verde como espinacas y acelgas, que aportan hasta un 50%   " +
                                                  "\n de la ingesta diaria recomendada de vitamina A y K, esenciales para la regeneraci�n celular. Jengibre y c�rcuma, que      " +
                                                  "\n poseen propiedades antiinflamatorias y antioxidantes, contribuyendo con hasta un 40% de la ingesta diaria recomendada de  " +
                                                  "\n compuestos bioactivos beneficiosos para la salud. este es solo un diagn�stico predeterminado l�gico. haberlo consultado   " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda " +
                                                  "\n realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la respuesta del  " +
                                                  "\n diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app  " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n EJERCICIO: Durante la infecci�n por rotavirus, se recomienda evitar esfuerzos f�sicos intensos y priorizar            " +
                                                  "\n el descanso. Una vez que los s�ntomas disminuyen, se pueden realizar ejercicios de bajo impacto como caminatas        " +
                                                  "\n suaves para mejorar la recuperaci�n. Tambi�n es recomendable realizar ejercicios de respiraci�n para mejorar          " +
                                                  "\n la oxigenaci�n celular y reducir la fatiga. HIDRATACI�N: Es crucial el consumo de al menos 2.5 litros de agua         " +
                                                  "\n al d�a para prevenir la deshidrataci�n causada por la diarrea y los v�mitos. Tambi�n se recomienda el consumo         " +
                                                  "\n de soluciones de rehidrataci�n oral para reponer los electrolitos perdidos. La hidrataci�n adecuada ayuda a           " +
                                                  "\n reducir la irritaci�n intestinal y mejora la absorci�n de nutrientes esenciales para la recuperaci�n. POSIBLE         " +
                                                  "\n TRATAMIENTO: No existe un tratamiento espec�fico para el rotavirus, pero los s�ntomas pueden aliviarse con            " +
                                                  "\n hidrataci�n adecuada y reposo. Se recomienda evitar el uso de medicamentos antidiarreicos, ya que pueden prolongar    " +
                                                  "\n la infecci�n. Adem�s, el consumo de alimentos ricos en probi�ticos puede ayudar a restaurar la flora intestinal       " +
                                                  "\n y mejorar la digesti�n. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes       " +
                                                  "\n esenciales para fortalecer el sistema digestivo, tales como yogur natural, que contiene probi�ticos que favorecen     " +
                                                  "\n la salud intestinal y el equilibrio de la flora digestiva. Frutas como pl�tanos y manzanas, que aportan fibra         " +
                                                  "\n soluble y ayudan a regular el tr�nsito intestinal. Verduras como zanahorias y calabacines, que contienen antioxidantes" +
                                                  "\n y vitaminas esenciales para la recuperaci�n digestiva. este es solo un diagn�stico predeterminado l�gico. haberlo     " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente        " +
                                                  "\n correctas. se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s,      " +
                                                  "\n por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.          " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n EJERCICIO: Durante la infecci�n por listeria, se recomienda evitar esfuerzos f�sicos intensos y priorizar el descanso.  " +
                                                  "\n Una vez que los s�ntomas disminuyen, se pueden realizar ejercicios de bajo impacto como caminatas suaves para mejorar   " +
                                                  "\n la recuperaci�n. Tambi�n es recomendable realizar ejercicios de respiraci�n para mejorar la oxigenaci�n celular y       " +
                                                  "\n reducir la fatiga. HIDRATACI�N: Es fundamental consumir al menos 2.5 litros de agua al d�a para ayudar a eliminar       " +  
                                                  "\n toxinas y mantener el equilibrio de los fluidos corporales. Tambi�n se recomienda el consumo de caldos naturales y      " +
                                                  "\n jugos sin az�car para aportar electrolitos esenciales. La hidrataci�n adecuada contribuye a la eliminaci�n de bacterias " +
                                                  "\n y toxinas del organismo, ayudando a acelerar la recuperaci�n. POSIBLE TRATAMIENTO: La infecci�n por listeria puede      " +
                                                  "\n tratarse con antibi�ticos como ampicilina o gentamicina en casos graves. Durante el embarazo, el tratamiento inmediato  " +
                                                  "\n con antibi�ticos puede ayudar a impedir que la infecci�n afecte al beb�. Adem�s, el consumo de alimentos ricos en       " +
                                                  "\n antioxidantes y vitaminas esenciales puede ayudar a fortalecer el sistema inmunol�gico y mejorar la respuesta del       " +
                                                  "\n organismo ante la infecci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes    " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico, tales como frutas c�tricas como naranjas y toronjas, que aportan    " +
                                                  "\n vitamina C en un 89% de la ingesta diaria recomendada, ayudando a combatir infecciones. Verduras de hoja verde como     " +
                                                  "\n espinacas y acelgas, que aportan hasta un 50% de la ingesta diaria recomendada de vitamina A y K, esenciales para la    " + 
                                                  "\n regeneraci�n celular. Frutos secos como almendras y nueces, que contienen vitamina E y magnesio, contribuyendo con      " +
                                                  "\n hasta un 40% de la ingesta diaria recomendada de estos nutrientes esenciales para la recuperaci�n neurol�gica. este     " +
                                                  "\n es solo un diagn�stico predeterminado l�gico. haberlo consultado no garantiza al 100% que la paciente tenga esta        " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar m�s de un diagn�stico para mayor  " +
                                                  "\n seguridad en el tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo,   " +
                                                  "\n se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la shigelosis es fundamental mantener una hidrataci�n adecuada con un consumo        " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a la             " +
                                                  "\n recuperaci�n y prevenir la deshidrataci�n causada por la diarrea. EJERCICIO: Se recomienda actividad f�sica moderada     " +
                                                  "\n como caminatas suaves evitando esfuerzos intensos mientras persistan los s�ntomas. Una vez superada la fase aguda es     " +
                                                  "\n recomendable realizar ejercicios de movilidad y fortalecimiento muscular para recuperar energ�a y mejorar la funci�n     " +
                                                  "\n digestiva. POSIBLE TRATAMIENTO: El tratamiento suele incluir antibi�ticos como la ciprofloxacina o la azitromicina en    " +
                                                  "\n casos m�s severos los m�dicos pueden recetar ceftriaxona. Es importante seguir las indicaciones m�dicas y evitar la      " +
                                                  "\n automedicaci�n. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunol�gico y acelerar la recuperaci�n se recomienda " +
                                                  "\n el consumo de PL�TANOS: Ricos en potasio que ayuda a reemplazar los electrolitos perdidos debido a la diarrea aportando  " +
                                                  "\n aproximadamente el 12% de la ingesta diaria recomendada por cada 100 gramos. ARROZ BLANCO: Fuente de carbohidratos de    " +
                                                  "\n f�cil digesti�n que ayuda a estabilizar el sistema digestivo. ZANAHORIAS: Ricas en vitamina A y antioxidantes que ayudan " +
                                                  "\n a la regeneraci�n celular aportando aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR   " +
                                                  "\n NATURAL: Contiene probi�ticos que pueden fortalecer el sistema digestivo y mejorar la salud intestinal aportando calcio    " +
                                                  "\n y prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100% que el   " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer m�s de un  " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s por su salud si la " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico Angel L Montes agradece tu " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la EPOC es fundamental mantener una hidrataci�n adecuada con un consumo diario         " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a mantener las v�as       " +
                                                  "\n respiratorias hidratadas y reducir la acumulaci�n de mucosidad. EJERCICIO: Se recomienda actividad f�sica moderada         " +
                                                  "\n como caminatas nataci�n o ejercicios de resistencia para mejorar la capacidad pulmonar y fortalecer los m�sculos           " +
                                                  "\n respiratorios. Adem�s se recomienda la pr�ctica de ejercicios de respiraci�n profunda como t�cnicas de relajaci�n          " +
                                                  "\n y yoga para mejorar la oxigenaci�n y reducir la sensaci�n de falta de aire. POSIBLE TRATAMIENTO: El tratamiento suele      " +
                                                  "\n incluir broncodilatadores de acci�n r�pida como el salbutamol corticosteroides inhalados para el control a largo plazo     " +
                                                  "\n como la fluticasona y en algunos casos terapia con ox�geno. Es fundamental seguir estrictamente el plan de acci�n para     " +
                                                  "\n la EPOC indicado por el m�dico y evitar la exposici�n a contaminantes ambientales. ALIMENTOS RECOMENDADOS: Para fortalecer " +
                                                  "\n el sistema respiratorio y reducir la inflamaci�n se recomienda el consumo de PESCADOS GRASOS: Salm�n y at�n ricos en       " +
                                                  "\n �cidos grasos Omega-3 que poseen propiedades antiinflamatorias que pueden ayudar a reducir la inflamaci�n de las v�as      " +
                                                  "\n respiratorias aportando aproximadamente el 50% de la ingesta diaria recomendada por cada 100 gramos. FRUTAS Y VERDURAS     " +
                                                  "\n DE COLORES VIVOS: Ar�ndanos fresas espinacas br�coli ricos en antioxidantes como la vitamina C y carotenoides que pueden   " +
                                                  "\n proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico aportando aproximadamente el 70% de la ingesta diaria   " +
                                                  "\n recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos con efectos antiinflamatorios que podr�an ser beneficiosos       " +
                                                  "\n para las v�as respiratorias. C�RCUMA: Con su componente activo la curcumina tambi�n tiene potentes propiedades antiinflamatorias " +
                                                  "\n y antioxidantes. Este es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100% que el paciente    " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer m�s de un Diagn�stico  " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s por su salud si la respuesta del  " +
                                                  "\n Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico Angel L Montes agradece tu visita a la app  " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la clamidia es fundamental mantener una hidrataci�n adecuada con un consumo diario        " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a la eliminaci�n de          " +
                                                  "\n toxinas y fortalecer el sistema inmunol�gico. EJERCICIO: Se recomienda actividad f�sica moderada como caminatas nataci�n      " +
                                                  "\n o ejercicios de resistencia para mejorar la circulaci�n sangu�nea y fortalecer el sistema inmunol�gico. Adem�s se             " +
                                                  "\n recomienda la pr�ctica de ejercicios de relajaci�n como yoga o meditaci�n para reducir el estr�s que puede afectar la         " +
                                                  "\n respuesta inmunol�gica. POSIBLE TRATAMIENTO: El tratamiento suele incluir antibi�ticos como la azitromicina o la doxiciclina  " +
                                                  "\n en casos m�s severos los m�dicos pueden recetar levofloxacina. Es fundamental seguir estrictamente el tratamiento indicado    " +
                                                  "\n por el m�dico y evitar la automedicaci�n. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunol�gico y acelerar la       " +
                                                  "\n recuperaci�n se recomienda el consumo de FRUTOS ROJOS: Ricos en antioxidantes y vitamina C que ayudan a fortalecer el sistema " +
                                                  "\n inmunol�gico aportando aproximadamente el 70% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene        " +
                                                  "\n compuestos con propiedades antiinflamatorias y puede ayudar a reducir la inflamaci�n. ESPINACAS Y BR�COLI: Aportan            " +
                                                  "\n antioxidantes y vitamina A esenciales para la regeneraci�n celular con un contenido de aproximadamente 56% de la ingesta      " +
                                                  "\n diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos que pueden fortalecer el sistema inmunol�gico     " +
                                                  "\n y mejorar la salud digestiva aportando calcio y prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico       " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente        " +
                                                  "\n correctas para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento    " +
                                                  "\n adecuado de su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho   " +
                                                  "\n consultar a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 a 3 litros de agua al d�a (aproximadamente diez a doce vasos de agua          " +
                                                  "\n de tama�o regular) para ayudar a la eliminaci�n de toxinas y mantener la funci�n cerebral �ptima. La hidrataci�n           " +
                                                  "\n adecuada tambi�n contribuye a la regulaci�n de la temperatura corporal y al transporte eficiente de nutrientes             " +
                                                  "\n esenciales para la recuperaci�n. EJERCICIO: Actividad f�sica moderada como caminatas y ejercicios de respiraci�n           " +
                                                  "\n pueden ayudar a mejorar la oxigenaci�n y reducir la fatiga. Es importante evitar el sobreesfuerzo y realizar actividad     " +
                                                  "\n en ambientes bien ventilados para reducir el riesgo de complicaciones neurol�gicas. Tambi�n se recomienda la pr�ctica      " +
                                                  "\n de ejercicios de relajaci�n y estiramiento, que pueden mejorar la circulaci�n sangu�nea y reducir la tensi�n muscular.     " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento est�ndar incluye antibi�ticos intravenosos como Ceftriaxona, Cefotaxima y Ampicilina,  " +
                                                  "\n dependiendo del tipo de bacteria causante. En algunos casos, se pueden administrar corticosteroides para reducir la        " +
                                                  "\n inflamaci�n cerebral y prevenir complicaciones. Es fundamental seguir el tratamiento completo para evitar reca�das y       " +
                                                  "\n posibles da�os neurol�gicos. Adem�s, en casos graves, puede ser necesario el uso de medicaci�n anticonvulsiva para         " +
                                                  "\n controlar posibles crisis epil�pticas derivadas de la inflamaci�n cerebral. Tambi�n se recomienda un seguimiento m�dico    " +
                                                  "\n constante para evaluar la respuesta al tratamiento y prevenir secuelas neurol�gicas. ALIMENTACI�N: Se recomienda el        " +
                                                  "\n consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a mejorar la funci�n cerebral, tales como: Naranjas  " +
                                                  "\n (ricas en vitamina C, que fortalece el sistema inmune, aportando aproximadamente 89% del requerimiento diario por cada     " +
                                                  "\n 100 g); Aguacate (fuente de grasas saludables y antioxidantes, con 14% de la ingesta diaria recomendada de vitamina E por  " +
                                                  "\n cada 100 g); Pescados grasos (salm�n, at�n, ricos en Omega-3, que pueden ayudar a reducir la inflamaci�n cerebral,         " +
                                                  "\n aportando cerca de 50% de la ingesta diaria recomendada por cada porci�n de 100 g). Este es solo un diagn�stico            " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor     " +
                                                  "\n seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se   " +
                                                  "\n recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 a 3 litros de agua al d�a (aproximadamente diez a doce vasos de agua de        " +
                                                  "\n tama�o regular) para ayudar a la eliminaci�n de toxinas y mejorar la funci�n celular. La hidrataci�n adecuada tambi�n       " +
                                                  "\n contribuye a la regulaci�n de la temperatura corporal y al transporte eficiente de nutrientes esenciales para la            " +
                                                  "\n recuperaci�n. Adem�s, el consumo de infusiones antioxidantes como t� verde y jengibre puede ayudar a reducir el estr�s      " +
                                                  "\n oxidativo en el cuerpo. EJERCICIO: Actividad f�sica moderada como caminatas, yoga y ejercicios de resistencia pueden        " +
                                                  "\n ayudar a mejorar la circulaci�n sangu�nea y reducir la fatiga. Es importante adaptar la actividad f�sica al estado de       " +
                                                  "\n salud de la paciente y realizar ejercicios que fortalezcan el sistema inmunol�gico. Tambi�n se recomienda la pr�ctica       " +
                                                  "\n de ejercicios de respiraci�n y relajaci�n, que pueden mejorar la respuesta del cuerpo al tratamiento y reducir el estr�s.   " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento est�ndar incluye quimioterapia, radioterapia, inmunoterapia y cirug�a, dependiendo      " +
                                                  "\n del tipo y estadio del c�ncer. En algunos casos, se pueden administrar terapias dirigidas para atacar c�lulas cancerosas    " +
                                                  "\n espec�ficas. Es fundamental seguir el tratamiento indicado por el m�dico y realizar controles peri�dicos para evaluar la    " +
                                                  "\n respuesta del cuerpo. Adem�s, se recomienda el uso de medicaci�n para el manejo de efectos secundarios, como antiem�ticos   " +
                                                  "\n para controlar las n�useas, analg�sicos para el dolor y suplementos nutricionales para evitar la p�rdida de peso. En        " +
                                                  "\n algunos casos, la terapia hormonal puede ser una opci�n para ciertos tipos de c�ncer, como el de mama o pr�stata. Tambi�n   " +
                                                  "\n es importante el apoyo psicol�gico y emocional para mejorar la calidad de vida durante el tratamiento. ALIMENTACI�N:        " +
                                                  "\n Se recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales      " +
                                                  "\n como: Frutas c�tricas (naranjas, toronjas, limones), ricas en vitamina C, que fortalece el sistema inmune, aportando        " +
                                                  "\n aproximadamente 89% del requerimiento diario por cada 100 g; Aguacate, fuente de grasas saludables y antioxidantes,         " +
                                                  "\n con 14% de la ingesta diaria recomendada de vitamina E por cada 100 g; Pescados grasos (salm�n, at�n), ricos en Omega-3,    " +
                                                  "\n que pueden ayudar a reducir la inflamaci�n, aportando cerca de 50% de la ingesta diaria recomendada por cada porci�n        " +
                                                  "\n de 100 g; Verduras de hoja verde (espinacas, kale), con vitamina A y hierro, esenciales para la salud celular, aportando    " +
                                                  "\n 56% de la ingesta diaria recomendada de vitamina A por cada 100 g; Legumbres (frijoles, lentejas), que aportan prote�nas    " +
                                                  "\n y fibra, con 37% de la ingesta diaria recomendada de hierro por cada 100 g. Este es solo un diagn�stico predeterminado      " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean            " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor           " +
                                                  "\n seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo,       " +
                                                  "\n se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                    }
                }
             if (EdadFemenino.equals("Adultez = 30 - 59 a�os")) {
            frame.setVisible(true);
        } else {
            frame.setVisible(false);
        }
            }
        public Estudio11() {
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
        Estudio11 ventanaEstudio11 = new Estudio11();
        ventanaEstudio11.crearInterfaz();
    }
}