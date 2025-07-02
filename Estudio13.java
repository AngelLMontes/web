import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Estudio13 implements ActionListener{
    
         protected final JLabel label1;
         protected JScrollPane scrollpane1;
         protected JTextArea textarea1;
         private JFrame frame;
         private final String edadEsperada = "Ancianidad = 75 a�os o mas";
         private String edadRecibida;
         
        public Estudio13(String nombrePaciente, String Sexo, String EdadFemenino, 
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
                 if(EdadFemenino.equals("Ancianidad = 75 a�os o mas")){
                        if(EstaturaFemenino.equals("0.80-1.35 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener             " +
                                                  "\n una hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales.                " +
                                                  "\n EJERCICIO. Se recomienda actividad f�sica ligera como caminatas suaves de 15 a 20 minutos al d�a, ejercicios de               " +
                                                  "\n respiraci�n profunda y estiramientos suaves para mantener la circulaci�n activa y mejorar la oxigenaci�n sin agotar           " +
                                                  "\n al cuerpo. Tambi�n es �til realizar ejercicios de movilidad articular para prevenir rigidez muscular durante el               " +
                                                  "\n reposo. HIDRATACI�N. Se aconseja consumir entre 2.5 y 3 litros de agua al d�a para compensar la p�rdida de l�quidos           " +
                                                  "\n por fiebre y sudoraci�n, mantener las mucosas hidratadas y facilitar la eliminaci�n de toxinas. Tambi�n se recomienda         " + 
                                                  "\n el consumo de caldos naturales, infusiones tibias de jengibre o manzanilla y jugos c�tricos sin az�car a�adida para           " +
                                                  "\n reforzar el sistema inmunol�gico. POSIBLE TRATAMIENTO. El tratamiento para la influenza incluye antivirales como              " +
                                                  "\n oseltamivir (marca reconocida: Tamiflu) que deben administrarse en las primeras 48 horas de s�ntomas. Tambi�n se              " +
                                                  "\n utilizan medicamentos para aliviar fiebre y dolor como paracetamol (Tempra) o ibuprofeno (Advil). Es importante el            " +
                                                  "\n reposo absoluto y evitar el contacto con otras personas para prevenir contagios. ALIMENTACI�N RECOMENDADA. Se recomienda      " +
                                                  "\n una dieta rica en antioxidantes, vitamina C y zinc. Algunos alimentos clave incluyen frutas c�tricas como naranja,            " +
                                                  "\n toronja y kiwi, ricas en vitamina C, que fortalecen el sistema inmune, aportando el 89% del requerimiento diario por          " +
                                                  "\n cada 100 gramos. Verduras como espinaca y br�coli, ricas en vitamina A y �cido f�lico, que ayudan a la regeneraci�n           " +
                                                  "\n celular y fortalecen las mucosas, con un aporte del 15% del requerimiento diario por cada 100 gramos. Frutos secos como       " +
                                                  "\n almendras y nueces, ricos en vitamina E y �cidos grasos esenciales, que protegen las c�lulas inmunol�gicas, con un aporte     " +
                                                  "\n del 37% del requerimiento diario por cada 28 gramos. Este diagn�stico es una referencia l�gica basada en informaci�n          " +
                                                  "\n m�dica, pero no garantiza al 100% que el paciente tenga influenza ni que el tratamiento sea el adecuado. Se recomienda        " +
                                                  "\n realizar m�s de un diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app       " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener        " +
                                                  "\n una hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales.           " +
                                                  "\n EJERCICIO. Se recomienda reposo durante la fase aguda de la enfermedad. Una vez superada esta etapa, se pueden           " +
                                                  "\n incorporar caminatas suaves de 10 a 15 minutos al d�a, ejercicios de respiraci�n profunda y estiramientos para           " +
                                                  "\n mejorar la oxigenaci�n y prevenir la rigidez muscular. Tambi�n es �til realizar ejercicios de equilibrio y               " +
                                                  "\n coordinaci�n para recuperar la funcionalidad neurol�gica. HIDRATACI�N. Se aconseja consumir entre 2.5 y 3 litros         " +
                                                  "\n de agua al d�a para mantener el equilibrio de l�quidos, facilitar la eliminaci�n de toxinas y apoyar la funci�n          " +
                                                  "\n renal durante el tratamiento antibi�tico. Tambi�n se recomienda el consumo de caldos naturales, infusiones suaves        " +
                                                  "\n y jugos naturales ricos en vitamina C. POSIBLE TRATAMIENTO. El tratamiento para la neumon�a incluye antibi�ticos         " +
                                                  "\n como amoxicilina con �cido clavul�nico, ceftriaxona o levofloxacino, dependiendo del agente causal. Marcas reconocidas   " +
                                                  "\n incluyen Clavulin, Rocephin y Tavanic. En algunos casos se a�aden corticosteroides como la dexametasona para reducir     " +
                                                  "\n la inflamaci�n pulmonar. Es fundamental iniciar el tratamiento lo antes posible para evitar complicaciones. ALIMENTACI�N " +
                                                  "\n RECOMENDADA. Se recomienda una dieta rica en prote�nas, antioxidantes y vitaminas del complejo B. Algunos alimentos      " +
                                                  "\n clave incluyen carnes magras y pescado, fuentes de prote�nas esenciales. Frutas c�tricas como naranja y kiwi, ricas      " +
                                                  "\n en vitamina C, que fortalecen el sistema inmune, aportando el 89% del requerimiento diario por cada 100 gramos. Verduras " +
                                                  "\n como espinaca y br�coli, ricas en �cido f�lico y vitamina B9, esenciales para la regeneraci�n celular, con un aporte del " +
                                                  "\n 15% del requerimiento diario por cada 100 gramos. Frutos secos como almendras y nueces, ricos en vitamina E y �cidos     " +
                                                  "\n grasos esenciales, que protegen las c�lulas inmunol�gicas y aportan el 37% del requerimiento diario por cada 28 gramos.  " +
                                                  "\n Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga   " +
                                                  "\n neumon�a ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para " +
                                                  "\n mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener         " +
                                                  "\n una hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales.            " +
                                                  "\n EJERCICIO. Se recomienda actividad f�sica regular como caminatas de 20 a 30 minutos al d�a, ejercicios de resistencia     " +
                                                  "\n moderada y estiramientos. Tambi�n se aconseja incluir ejercicios de fuerza dos veces por semana para prevenir la          " +
                                                  "\n p�rdida de masa muscular y �sea. La actividad f�sica mejora la sensibilidad a la insulina, regula la glucosa y reduce     " +
                                                  "\n el riesgo cardiovascular. HIDRATACI�N. Se aconseja consumir entre 2 y 2.5 litros de agua al d�a para apoyar la funci�n    " +
                                                  "\n renal, facilitar la absorci�n de medicamentos y prevenir infecciones urinarias. Tambi�n se recomienda el consumo de       " +
                                                  "\n caldos naturales, infusiones sin az�car y bebidas con electrolitos en caso de diarrea o fiebre. POSIBLE TRATAMIENTO.      " +
                                                  "\n El tratamiento para la diabetes incluye medicamentos orales como metformina, glibenclamida o sitagliptina, y en algunos   " +
                                                  "\n casos insulina. Marcas reconocidas incluyen Glucophage, Diamicron y Januvia. Es fundamental mantener una adherencia       " +
                                                  "\n estricta al tratamiento y realizar controles peri�dicos de glucosa. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta     " +
                                                  "\n equilibrada rica en fibra, prote�nas magras y carbohidratos complejos. Algunos alimentos clave incluyen cereales          " +
                                                  "\n integrales como avena y arroz integral, que ayudan a mantener niveles estables de glucosa. Frutas como manzana y pera,    " +
                                                  "\n ricas en fibra soluble, que ralentizan la absorci�n de az�car, con un aporte del 15% del requerimiento diario por cada    " +
                                                  "\n 100 gramos. Verduras como espinaca, br�coli y zanahoria, ricas en vitamina A, hierro y antioxidantes, que ayudan a        " +
                                                  "\n prevenir complicaciones. Frutos secos como almendras y nueces, ricos en vitamina E y �cidos grasos esenciales, con un     " +
                                                  "\n aporte del 37% del requerimiento diario por cada 28 gramos. Este diagn�stico es una referencia l�gica basada en           " +
                                                  "\n informaci�n m�dica, pero no garantiza al 100% que el paciente tenga diabetes ni que el tratamiento sea el adecuado.       " +
                                                  "\n Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes agradece        " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n El asma es una enfermedad inflamatoria cr�nica de las v�as respiratorias que puede causar dificultad para respirar, tos,      " +
                                                  "\n opresi�n en el pecho y sibilancias. En la ancianidad, los s�ntomas pueden confundirse con otras afecciones respiratorias,     " +
                                                  "\n y el riesgo de complicaciones aumenta debido a la disminuci�n de la funci�n pulmonar y la presencia de otras enfermedades     " +
                                                  "\n cr�nicas. EJERCICIO. Se recomienda actividad f�sica moderada y controlada, como caminatas suaves, ejercicios de respiraci�n   " +
                                                  "\n y estiramientos, evitando ambientes fr�os o contaminados. Es importante realizar calentamiento previo y enfriamiento          " +
                                                  "\n posterior, as� como adaptar la intensidad seg�n la capacidad respiratoria del paciente. HIDRATACI�N. Es fundamental           " +
                                                  "\n consumir entre 2 y 2.5 litros de agua al d�a para mantener las v�as respiratorias hidratadas, facilitar la eliminaci�n        " +
                                                  "\n de secreciones y reducir la irritaci�n bronquial. Tambi�n se recomienda el consumo de l�quidos tibios como infusiones de      " +
                                                  "\n jengibre o manzanilla. POSIBLE TRATAMIENTO. El tratamiento incluye broncodilatadores de acci�n r�pida como el salbutamol,     " +
                                                  "\n corticosteroides inhalados como la fluticasona o budesonida, y en algunos casos, modificadores de leucotrienos como el        " +
                                                  "\n montelukast. Es esencial seguir un plan de acci�n personalizado y utilizar los medicamentos preventivos de forma regular.     " +
                                                  "\n ALIMENTACI�N RECOMENDADA. Consumir alimentos que reduzcan la inflamaci�n y fortalezcan el sistema respiratorio. Pescados      " + 
                                                  "\n grasos como salm�n y at�n, ricos en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias, aportando hasta el       " +
                                                  "\n 90% del requerimiento diario por cada 100 g. Frutas como fresas y ar�ndanos, ricas en vitamina C y antioxidantes, que         " +
                                                  "\n fortalecen el sistema inmune, aportando cerca del 70% del requerimiento diario por cada 100 g. Verduras como espinaca y       " +
                                                  "\n br�coli, ricas en hierro, vitamina A y carotenoides, esenciales para la salud pulmonar. Este es solo un diagn�stico           " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la         " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer   " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le          " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida)         " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n El VIH es un virus que debilita el sistema inmunol�gico, y si no se trata adecuadamente, puede progresar a SIDA,            " +
                                                  "\n una condici�n que deja al cuerpo vulnerable a infecciones y enfermedades graves. En la ancianidad, el diagn�stico           " +
                                                  "\n puede retrasarse y el tratamiento debe considerar otras condiciones cr�nicas. EJERCICIO. Se recomienda actividad            " +
                                                  "\n f�sica moderada como caminatas, yoga o ejercicios de bajo impacto, que ayudan a fortalecer el sistema inmune, mejorar       " +
                                                  "\n el estado de �nimo y mantener la masa muscular. Es importante evitar el sobreesfuerzo y adaptar la rutina a la              " +
                                                  "\n condici�n f�sica del paciente. HIDRATACI�N. Es fundamental consumir entre 2 y 2.5 litros de agua al d�a para apoyar la      " +
                                                  "\n funci�n renal, facilitar la eliminaci�n de toxinas y mantener el equilibrio corporal. Tambi�n se recomienda el consumo      " +
                                                  "\n de l�quidos ricos en electrolitos en caso de fiebre o diarrea. POSIBLE TRATAMIENTO. El tratamiento consiste en terapia      " +
                                                  "\n antirretroviral (TAR), que incluye combinaciones de medicamentos como tenofovir, emtricitabina, dolutegravir o efavirenz,   " +
                                                  "\n que ayudan a mantener la carga viral indetectable y preservar la funci�n inmunol�gica. Es esencial la adherencia estricta   " +
                                                  "\n al tratamiento y el monitoreo m�dico constante. ALIMENTACI�N RECOMENDADA. Consumir alimentos que fortalezcan el sistema     " +
                                                  "\n inmunol�gico y prevengan la p�rdida de peso. Frutas como papaya y guayaba, ricas en vitamina C, que fortalecen las defensas," +
                                                  "\n aportando hasta el 200% del requerimiento diario por cada 100 g. L�cteos como yogur natural, fuente de probi�ticos que      " +
                                                  "\n mejoran la flora intestinal. Carnes magras y huevos, ricos en prote�nas de alta calidad, esenciales para la regeneraci�n    " +
                                                  "\n celular. Verduras como espinaca y zanahoria, ricas en vitamina A, hierro y antioxidantes. Este es solo un diagn�stico       " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la       " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le        " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida)       " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n La gonorrea es una infecci�n bacteriana de transmisi�n sexual causada por Neisseria gonorrhoeae, que puede afectar el       " +
                                                  "\n tracto genital, rectal o far�ngeo. En mujeres mayores, puede pasar desapercibida o confundirse con otras afecciones,        " +
                                                  "\n aumentando el riesgo de complicaciones. EJERCICIO. Se recomienda actividad f�sica ligera como caminatas o estiramientos     " +
                                                  "\n suaves, evitando esfuerzos intensos durante el tratamiento para no comprometer el sistema inmunol�gico. HIDRATACI�N. Es     " +
                                                  "\n fundamental consumir entre 2 y 2.5 litros de agua al d�a para facilitar la eliminaci�n de toxinas, mantener la funci�n      " +
                                                  "\n renal y apoyar el proceso de recuperaci�n. POSIBLE TRATAMIENTO. El tratamiento de primera l�nea consiste en una dosis       " +
                                                  "\n �nica intramuscular de ceftriaxona 500 mg. En caso de alergia o dificultad de acceso, puede utilizarse cefixima 800 mg      " +
                                                  "\n v�a oral. Si no se ha descartado coinfecci�n con clamidia, se a�ade doxiciclina 100 mg dos veces al d�a por 7 d�as. Es      " +
                                                  "\n importante tratar tambi�n a las parejas sexuales para evitar reinfecci�n. ALIMENTACI�N RECOMENDADA. Consumir alimentos      " +
                                                  "\n que fortalezcan el sistema inmunol�gico y favorezcan la recuperaci�n. Frutas como kiwi y naranja, ricas en vitamina C,      " +
                                                  "\n que ayudan a combatir infecciones, aportando hasta el 90% del requerimiento diario por cada 100 g. Verduras como br�coli    " +
                                                  "\n y espinaca, ricas en �cido f�lico, hierro y antioxidantes. Yogur natural, fuente de probi�ticos que fortalecen la flora     " +
                                                  "\n intestinal. Carnes magras, ricas en prote�nas necesarias para la regeneraci�n celular. Este es solo un diagn�stico          " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la       " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le        " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida)       " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n EJERCICIO: Durante los brotes activos de herpes genital se recomienda evitar la actividad f�sica intensa y priorizar el        " +
                                                  "\n descanso, ya que el estr�s f�sico puede agravar los s�ntomas y retrasar la cicatrizaci�n. Una vez que las lesiones hayan       " +
                                                  "\n sanado, se pueden retomar ejercicios suaves como caminatas lentas, estiramientos o yoga terap�utico, que ayudan a mejorar      " +
                                                  "\n la circulaci�n, reducir la tensi�n muscular y fortalecer el sistema inmunol�gico. HIDRATACI�N: Es fundamental consumir al      " +
                                                  "\n menos 2.5 litros de agua al d�a para mantener la piel y las mucosas hidratadas, lo que favorece la cicatrizaci�n de las        " +
                                                  "\n lesiones y ayuda a eliminar toxinas. Tambi�n se recomienda el consumo de infusiones con propiedades antivirales y calmantes    " +
                                                  "\n como el t� de manzanilla, t� verde o infusi�n de cal�ndula, que pueden aliviar la irritaci�n y reforzar las defensas naturales." +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento del herpes genital incluye antivirales como aciclovir, valaciclovir o famciclovir,         " +
                                                  "\n administrados por v�a oral durante 7 a 10 d�as en episodios iniciales. En casos de recurrencias frecuentes, puede indicarse    " +
                                                  "\n tratamiento supresivo diario por varios meses o incluso a�os. En situaciones graves o en pacientes inmunocomprometidos, puede  " +
                                                  "\n ser necesario el uso de antivirales por v�a intravenosa. Tambi�n se pueden utilizar cremas anest�sicas con lidoca�na para      " +
                                                  "\n aliviar el dolor local, y es importante mantener la zona limpia y seca para evitar infecciones secundarias. ALIMENTACI�N:      " +
                                                  "\n Se recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico y favorezcan la regeneraci�n de tejidos, tales   " +
                                                  "\n como frutas c�tricas como naranjas y toronjas, que aportan vitamina C en un 89% de la ingesta diaria recomendada. Yogur        " + 
                                                  "\n natural, que contiene probi�ticos que equilibran la flora vaginal y fortalecen las defensas. Verduras de hoja verde como       " +
                                                  "\n espinacas y acelgas, que aportan hasta un 50% de la ingesta diaria recomendada de vitamina A y K, esenciales para la           " +
                                                  "\n regeneraci�n celular. Ajo y cebolla, que contienen compuestos sulfurados con propiedades antivirales y antioxidantes,          " +
                                                  "\n contribuyendo con hasta un 40% de la ingesta diaria recomendada de estos nutrientes. este es solo un diagn�stico predeterminado " +
                                                  "\n l�gico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente  " +
                                                  "\n correctas. se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud,  " +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu       " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n EJERCICIO: Durante el tratamiento de la s�filis se recomienda evitar esfuerzos f�sicos intensos, especialmente si hay            " +
                                                  "\n s�ntomas como fiebre, fatiga o lesiones cut�neas. Una vez estabilizada la condici�n, se pueden realizar ejercicios               " +
                                                  "\n suaves como caminatas o estiramientos para mejorar la circulaci�n, apoyar el sistema inmunol�gico y mantener la movilidad        " +
                                                  "\n articular. HIDRATACI�N: Es esencial consumir entre 2 y 2.5 litros de agua al d�a para facilitar la eliminaci�n de toxinas        " +
                                                  "\n y apoyar la funci�n renal durante el tratamiento antibi�tico. Tambi�n se recomienda el consumo de infusiones como t� de          " +
                                                  "\n diente de le�n o manzanilla, que ayudan a depurar el organismo y calmar el sistema digestivo. POSIBLE TRATAMIENTO: El            " +
                                                  "\n tratamiento est�ndar para la s�filis en etapas primaria, secundaria o latente precoz es una inyecci�n intramuscular �nica        " +
                                                  "\n de penicilina G benzatina (2.4 millones de unidades). En casos de s�filis latente tard�a o terciaria, se administran tres        " +
                                                  "\n dosis semanales consecutivas. Para personas al�rgicas a la penicilina, se pueden usar doxiciclina o ceftriaxona. En pacientes    " +
                                                  "\n de edad avanzada, es fundamental realizar seguimiento cl�nico y serol�gico para confirmar la curaci�n y evitar complicaciones    " +
                                                  "\n neurol�gicas. ALIMENTACI�N: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico y favorezcan la        " +
                                                  "\n regeneraci�n celular, tales como frutas como kiwi y fresas, que aportan vitamina C en un 90% de la ingesta diaria recomendada.   " +
                                                  "\n Verduras como br�coli y zanahorias, que contienen vitamina A y antioxidantes, aportando hasta un 50% de la ingesta diaria        " +
                                                  "\n recomendada. Frutos secos como almendras y nueces, que contienen vitamina E y zinc, contribuyendo con hasta un 40% de la         " +
                                                  "\n ingesta diaria recomendada de estos nutrientes esenciales para la reparaci�n celular. este es solo un diagn�stico predeterminado " +
                                                  "\n l�gico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente   " +
                                                  "\n correctas. se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud,   " +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu        " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n EJERCICIO: Durante el tratamiento de la tuberculosis se recomienda realizar actividad f�sica moderada como caminatas    " +
                                                  "\n suaves o ejercicios de respiraci�n para mejorar la capacidad pulmonar y reducir la fatiga. Es importante evitar el      " +
                                                  "\n esfuerzo f�sico excesivo, especialmente en las primeras semanas de tratamiento. La fisioterapia respiratoria puede ser  " +
                                                  "\n de gran ayuda para mejorar la oxigenaci�n y la funci�n pulmonar, especialmente en personas mayores. HIDRATACI�N: Es     " +
                                                  "\n crucial consumir al menos 2.5 litros de agua al d�a para mantener las mucosas hidratadas, facilitar la expectoraci�n y  " +
                                                  "\n apoyar la funci�n renal durante el tratamiento prolongado con antibi�ticos. Tambi�n se recomienda el consumo de caldos  " +
                                                  "\n naturales, infusiones suaves y jugos naturales sin az�car para aportar l�quidos y micronutrientes esenciales. Una       " +
                                                  "\n hidrataci�n adecuada tambi�n ayuda a reducir la toxicidad de los medicamentos y mejora la tolerancia al tratamiento.    " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento est�ndar para la tuberculosis activa incluye una combinaci�n de antibi�ticos como   " +
                                                  "\n isoniazida, rifampicina, pirazinamida y etambutol durante al menos 6 meses. Es fundamental seguir el esquema completo   " +
                                                  "\n sin interrupciones para evitar reca�das o resistencia bacteriana. En casos de tuberculosis resistente, se utilizan      " +
                                                  "\n medicamentos de segunda l�nea y el tratamiento puede extenderse hasta 18 meses. En personas mayores, se debe monitorear " +
                                                  "\n estrechamente la funci�n hep�tica y renal durante el tratamiento. ALIMENTACI�N: Se recomienda el consumo de alimentos       " +
                                                  "\n ricos en prote�nas, vitaminas y minerales para fortalecer el sistema inmunol�gico y apoyar la regeneraci�n pulmonar,        " +
                                                  "\n tales como carnes magras y legumbres, que aportan prote�nas de alta calidad. Frutas como guayaba y papaya, que contienen    " +
                                                  "\n vitamina C en un 90% de la ingesta diaria recomendada, ayudando a combatir infecciones. Verduras como espinacas y br�coli,  " +
                                                  "\n que aportan hierro, vitamina A y �cido f�lico, esenciales para la producci�n de gl�bulos rojos y la reparaci�n celular.     " +
                                                  "\n Frutos secos como nueces y semillas de girasol, que contienen vitamina E y selenio, contribuyendo con hasta un 40% de la       " +
                                                  "\n ingesta diaria recomendada de estos antioxidantes. este es solo un diagn�stico predeterminado l�gico. haberlo consultado       " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda   " +
                                                  "\n realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la respuesta del      " +
                                                  "\n diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app          " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la artritis es fundamental mantener una hidrataci�n adecuada con un consumo diario         " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para favorecer la lubricaci�n de          " +
                                                  "\n las articulaciones y reducir la rigidez matutina. EJERCICIO: Se recomienda actividad f�sica regular y de bajo impacto          " +
                                                  "\n como caminatas suaves ejercicios de estiramiento o nataci�n para mantener la movilidad articular y fortalecer los              " +
                                                  "\n m�sculos que rodean las articulaciones adem�s se sugiere la pr�ctica de ejercicios espec�ficos de fisioterapia articular       " +
                                                  "\n y t�cnicas de relajaci�n como el yoga adaptado. POSIBLE TRATAMIENTO: El tratamiento puede incluir medicamentos                 " +
                                                  "\n antiinflamatorios no esteroideos como el ibuprofeno o el naproxeno para aliviar el dolor y la inflamaci�n adem�s de            " +
                                                  "\n f�rmacos modificadores de la enfermedad como el metotrexato o la sulfasalazina en algunos casos se utilizan corticosteroides   " +
                                                  "\n o terapias biol�gicas como los inhibidores del TNF es fundamental seguir el tratamiento indicado por el reumat�logo y          " +
                                                  "\n realizar controles peri�dicos. ALIMENTOS RECOMENDADOS: Para reducir la inflamaci�n y proteger las articulaciones se            " +
                                                  "\n recomienda el consumo de PESCADOS GRASOS: Como el salm�n y la sardina ricos en �cidos grasos Omega-3 que aportan               " +
                                                  "\n aproximadamente el 50% de la ingesta diaria recomendada por cada 100 gramos. FRUTOS SECOS: Como nueces y almendras que         " +
                                                  "\n contienen vitamina E y grasas saludables con un aporte del 35% de la ingesta diaria recomendada por cada 30 gramos.            " +
                                                  "\n ESPINACAS Y BR�COLI: Ricos en antioxidantes vitamina A y vitamina K esenciales para la salud �sea y articular con un           " +
                                                  "\n aporte del 56% de la ingesta diaria recomendada por cada 100 gramos. C�RCUMA: Contiene curcumina con propiedades               " +
                                                  "\n antiinflamatorias naturales. Este es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100%         " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer         " +
                                                  "\n m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s por          " +
                                                  "\n su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico Angel           " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la tosferina es fundamental mantener una hidrataci�n adecuada con un consumo diario       " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para mantener las v�as respiratorias     " +
                                                  "\n h�medas y facilitar la expulsi�n de mucosidad. EJERCICIO: Se recomienda reposo durante la fase aguda y posteriormente         " +
                                                  "\n actividad f�sica ligera como caminatas lentas ejercicios de respiraci�n profunda y estiramientos suaves para mejorar la       " +
                                                  "\n oxigenaci�n y reducir la fatiga respiratoria. POSIBLE TRATAMIENTO: El tratamiento suele incluir antibi�ticos como la          " +
                                                  "\n azitromicina la claritromicina o la eritromicina especialmente si se inicia en las primeras fases de la enfermedad tambi�n    " +
                                                  "\n se pueden utilizar broncodilatadores y humidificadores para aliviar la tos es importante evitar el uso de medicamentos para   " +
                                                  "\n la tos sin prescripci�n m�dica. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema respiratorio se recomienda el consumo de   " +
                                                  "\n NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la duraci�n de los s�ntomas aportando aproximadamente el 89%     " +
                                                  "\n de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Con propiedades antiinflamatorias que pueden aliviar la       " +
                                                  "\n irritaci�n de garganta. MIEL Y LIM�N: Combinaci�n efectiva para calmar la tos y suavizar la garganta aportando flavonoides    " +
                                                  "\n y vitamina C. ESPINACAS Y BR�COLI: Aportan antioxidantes y vitamina A esenciales para la regeneraci�n celular con un          " +
                                                  "\n contenido de aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos. Este es solo un diagn�stico            " +
                                                  "\n predeterminado l�gico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas     " +
                                                  "\n sean completamente correctas para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad   " +
                                                  "\n en el tratamiento adecuado de su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se     " +
                                                  "\n le recomienda mucho consultar a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: Para el tratamiento de las paperas es fundamental mantener una hidrataci�n adecuada con un consumo diario         " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para prevenir la deshidrataci�n y         " +
                                                  "\n aliviar la inflamaci�n de las gl�ndulas salivales. EJERCICIO: Se recomienda reposo durante la fase aguda y posteriormente      " +
                                                  "\n actividad f�sica ligera como estiramientos suaves y caminatas cortas para recuperar energ�a sin forzar el sistema              " +
                                                  "\n inmunol�gico. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral espec�fico para las paperas el manejo es sintom�tico     " +
                                                  "\n e incluye el uso de analg�sicos como el paracetamol o el ibuprofeno para reducir el dolor y la fiebre adem�s de compresas      " +
                                                  "\n fr�as en las gl�ndulas inflamadas y aislamiento durante al menos cinco d�as desde el inicio de los s�ntomas. ALIMENTOS         " +
                                                  "\n RECOMENDADOS: Para aliviar los s�ntomas y fortalecer el sistema inmunol�gico se recomienda el consumo de SOPAS Y CALDOS:       " +
                                                  "\n F�ciles de tragar y nutritivos. NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la duraci�n de los s�ntomas       " +
                                                  "\n aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Con propiedades               " +
                                                  "\n antiinflamatorias que pueden aliviar el malestar general. ESPINACAS Y BR�COLI: Aportan antioxidantes y vitamina A              " +
                                                  "\n esenciales para la regeneraci�n celular con un contenido de aproximadamente 56% de la ingesta diaria recomendada por           " +
                                                  "\n cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos que fortalecen el sistema inmunol�gico y mejoran la salud digestiva       " +
                                                  "\n aportando calcio y prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza     " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda       " +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s        " +
                                                  "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico Angel       " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 a 3 litros de agua al d�a (diez a doce vasos de agua de tama�o regular) para    " +
                                                  "\n prevenir la deshidrataci�n causada por fiebre, sudoraci�n y p�rdida de apetito. En mujeres en etapa de ancianidad, una       " +
                                                  "\n hidrataci�n constante tambi�n ayuda a mantener la funci�n renal, reducir el riesgo de hipotensi�n y apoyar la eliminaci�n    " +
                                                  "\n de toxinas virales. EJERCICIO: Durante la fase aguda se recomienda reposo absoluto. Una vez superados los s�ntomas, se       " +
                                                  "\n puede retomar actividad f�sica ligera como caminatas suaves o ejercicios de estiramiento para mejorar la circulaci�n y el    " +
                                                  "\n estado de �nimo. POSIBLE TRATAMIENTO: No existe un antiviral espec�fico para el virus del Zika. El tratamiento es            " +
                                                  "\n sintom�tico e incluye Paracetamol para la fiebre y el dolor, antihistam�nicos para el prurito y reposo. Se debe evitar el    " +
                                                  "\n uso de aspirina o AINEs hasta descartar dengue, por riesgo de hemorragias. Tambi�n se recomienda el uso de repelentes,       " +
                                                  "\n mosquiteros y ropa protectora para evitar nuevas picaduras. En mujeres mayores, se debe vigilar la aparici�n de s�ntomas     " +
                                                  "\n neurol�gicos como debilidad muscular, visi�n borrosa o alteraciones sensoriales. ALIMENTACI�N: Se sugiere una dieta rica     " +
                                                  "\n en antioxidantes y nutrientes inmunoestimulantes como: Naranjas (con vitamina C, 89% por cada 100 g); Kiwi (con vitamina C   " +
                                                  "\n y potasio, 92% y 7% respectivamente); Aguacate (con vitamina E, 14% por cada 100 g); Zanahorias (con vitamina A, 93% por     " +
                                                  "\n cada 100 g); y Jengibre (con compuestos antiinflamatorios y antivirales naturales). Este es solo un diagn�stico              " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas   " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor       " +
                                                  "\n seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se     " +
                                                  "\n recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 3 litros de agua al d�a (doce vasos de agua de tama�o regular), incluyendo          " +
                                                  "\n soluciones de rehidrataci�n oral para reponer electrolitos perdidos por diarrea y v�mitos. En mujeres mayores de 75          " +
                                                  "\n a�os, la deshidrataci�n puede ser m�s severa, por lo que se debe vigilar la frecuencia urinaria, la presi�n arterial         " +
                                                  "\n y el estado de conciencia. EJERCICIO: Durante la fase aguda se recomienda reposo absoluto. Una vez superados los             " +
                                                  "\n s�ntomas, se puede retomar actividad f�sica ligera para recuperar energ�a, estimular la digesti�n y prevenir la p�rdida      " +
                                                  "\n de masa muscular. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral espec�fico. El manejo es sintom�tico y se          " +
                                                  "\n enfoca en rehidrataci�n intensiva, control de la fiebre con Paracetamol y dieta astringente. No se recomiendan antidiarreicos " +
                                                  "\n como la loperamida. En casos graves, puede requerirse hospitalizaci�n para administraci�n de l�quidos intravenosos. Tambi�n   " +
                                                  "\n se sugiere el uso de probi�ticos para restaurar la flora intestinal. ALIMENTACI�N: Se recomienda una dieta suave y rica       " +
                                                  "\n en nutrientes como: Pl�tanos (con potasio, 23% por cada 100 g); Arroz blanco (f�cil digesti�n y fuente de energ�a); Manzanas  " +
                                                  "\n cocidas (con pectina, que regula el tr�nsito intestinal); Zanahorias cocidas (con vitamina A, 93% por cada 100 g); y Yogur    " +
                                                  "\n natural (con probi�ticos y calcio, 30% por cada 100 g). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se  " +
                                                  "\n recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Adem�s, por  " +
                                                  "\n su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 a 3 litros de agua al d�a (diez a doce vasos de agua de tama�o regular)       " +
                                                  "\n para apoyar la funci�n renal, facilitar la eliminaci�n de toxinas y mantener el equilibrio electrol�tico. En mujeres       " +
                                                  "\n en etapa de ancianidad, una hidrataci�n adecuada tambi�n ayuda a prevenir la hipotensi�n y la fatiga asociadas a la        " +
                                                  "\n infecci�n. EJERCICIO: Durante la fase aguda se recomienda reposo absoluto. Una vez estabilizada, se puede retomar          " +
                                                  "\n actividad f�sica ligera como caminatas suaves para mejorar la circulaci�n y reducir la rigidez muscular. POSIBLE           " +
                                                  "\n TRATAMIENTO: El tratamiento incluye antibi�ticos intravenosos como Ampicilina o Penicilina G, frecuentemente combinados    " +
                                                  "\n con Gentamicina en casos graves. En mujeres adultas mayores, se debe ajustar la dosis seg�n la funci�n renal y             " +
                                                  "\n monitorear signos de meningitis o septicemia. Tambi�n se recomienda evitar alimentos de alto riesgo como quesos            " +
                                                  "\n blandos no pasteurizados, embutidos y pescados ahumados. En casos neurol�gicos, puede requerirse hospitalizaci�n           " +
                                                  "\n prolongada y seguimiento con neuroimagen. ALIMENTACI�N: Se sugiere una dieta rica en nutrientes inmunoestimulantes         " +
                                                  "\n como: Espinacas (con vitamina A y hierro, 56% y 15% por cada 100 g); Ajo (con propiedades antibacterianas naturales);      " +
                                                  "\n Zanahorias (con vitamina A, 93% por cada 100 g); Frutas c�tricas (con vitamina C, 89% por cada 100 g); y Yogur natural     " +
                                                  "\n (con probi�ticos y calcio, 30% por cada 100 g). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado      " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para        " +
                                                  "\n ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado.  " +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.       " +
                                                  "\n �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una     " +
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO.     " +
                                                  "\n Durante la fase aguda se recomienda reposo absoluto para evitar complicaciones gastrointestinales. Una vez superada       " +
                                                  "\n esta etapa, se pueden incorporar caminatas suaves de 10 a 15 minutos al d�a, ejercicios de movilidad articular y          " +
                                                  "\n respiraci�n profunda para estimular la circulaci�n y la recuperaci�n intestinal. Tambi�n es �til realizar estiramientos   " +
                                                  "\n suaves para reducir la rigidez muscular y mantener la funcionalidad. HIDRATACI�N. Se aconseja consumir entre 2.5 y 3      " +
                                                  "\n litros de agua al d�a para prevenir la deshidrataci�n causada por la diarrea. Tambi�n se recomienda el uso de soluciones  " +
                                                  "\n de rehidrataci�n oral, caldos naturales y jugos suaves sin az�car a�adida. Se deben evitar bebidas con cafe�na, alcohol   " +
                                                  "\n o alto contenido de az�car, ya que pueden empeorar los s�ntomas. POSIBLE TRATAMIENTO. El tratamiento para la shigelosis   " +
                                                  "\n incluye reposo, rehidrataci�n y en casos severos, antibi�ticos como ciprofloxacino o azitromicina. Marcas reconocidas     " +
                                                  "\n incluyen Ciproxin y Zitromax. No se deben usar medicamentos antidiarreicos como loperamida, ya que pueden agravar la      " +
                                                  "\n infecci�n. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta blanda, baja en fibra y rica en nutrientes esenciales.       " +
                                                  "\n Algunos alimentos clave incluyen arroz blanco y pur� de papa, que son f�ciles de digerir y ayudan a estabilizar el        " +
                                                  "\n sistema digestivo. Yogur natural, fuente de probi�ticos que ayudan a restaurar la flora intestinal. Pl�tano, rico en      " +
                                                  "\n potasio, que ayuda a reponer electrolitos perdidos, aportando el 10% del requerimiento diario por cada 100 gramos.        " +
                                                  "\n Zanahoria cocida, rica en vitamina A, que fortalece las mucosas intestinales, con un aporte del 15% del requerimiento     " +
                                                  "\n diario por cada 100 gramos. Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza     " +
                                                  "\n al 100% que el paciente tenga shigelosis ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un          " +
                                                  "\n diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera   " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener        " +
                                                  "\n una hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales.           " +
                                                  "\n EJERCICIO. Se recomienda actividad f�sica moderada como caminatas diarias de 20 a 30 minutos, ejercicios de              " +
                                                  "\n respiraci�n profunda y yoga terap�utico para fortalecer los pulmones y reducir la disnea. Tambi�n es �til realizar       " +
                                                  "\n ejercicios de fortalecimiento muscular con bandas el�sticas y t�cnicas de expansi�n tor�cica para mejorar la             " +
                                                  "\n capacidad pulmonar. HIDRATACI�N. Se aconseja consumir entre 2.5 y 3 litros de agua al d�a para mantener las v�as         " +
                                                  "\n respiratorias hidratadas, facilitar la eliminaci�n de secreciones y apoyar la funci�n renal. Tambi�n se recomienda       " +
                                                  "\n el consumo de infusiones tibias como manzanilla o jengibre para aliviar la irritaci�n bronquial. POSIBLE TRATAMIENTO.    " +
                                                  "\n El tratamiento para la EPOC incluye broncodilatadores de acci�n corta como salbutamol (Ventolin, Aerolin),               " +
                                                  "\n corticosteroides inhalados como fluticasona o budesonida (Flixotide, Pulmicort) y en algunos casos, anticolin�rgicos     " +
                                                  "\n de acci�n prolongada como tiotropio (Spiriva). Tambi�n se recomienda la rehabilitaci�n pulmonar y el uso adecuado de     " +
                                                  "\n inhaladores. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica en antioxidantes, prote�nas y grasas saludables.     " +
                                                  "\n Algunos alimentos clave incluyen pescados grasos como salm�n y at�n, ricos en omega-3, que reducen la inflamaci�n        " +
                                                  "\n pulmonar, aportando el 70% del requerimiento diario por cada 100 gramos. Frutas como naranja, kiwi y papaya, ricas       " +
                                                  "\n en vitamina C, que fortalecen el sistema inmune, con un aporte del 89% del requerimiento diario por cada 100 gramos.     " +
                                                  "\n Verduras como espinaca y br�coli, ricas en vitamina A y �cido f�lico, que protegen las mucosas respiratorias, con un     " +
                                                  "\n aporte del 15% del requerimiento diario por cada 100 gramos. Frutos secos como almendras y nueces, ricos en vitamina E   " +
                                                  "\n y �cidos grasos esenciales, con un aporte del 37% del requerimiento diario por cada 28 gramos. Este diagn�stico es una   " +
                                                  "\n referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga EPOC ni que el           " +
                                                  "\n tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para mayor seguridad.  " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una      " +
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO.      " +
                                                  "\n Se recomienda actividad f�sica moderada como caminatas suaves, yoga o ejercicios de movilidad durante 30 minutos al        " +
                                                  "\n d�a para mejorar la circulaci�n, reducir el estr�s y fortalecer el sistema inmunol�gico. Tambi�n es �til realizar          " +
                                                  "\n ejercicios de respiraci�n y relajaci�n para apoyar el bienestar general. HIDRATACI�N. Se aconseja consumir entre 2         " +
                                                  "\n y 2.5 litros de agua al d�a para facilitar la eliminaci�n de toxinas, apoyar la funci�n renal y mantener las mucosas       " +
                                                  "\n hidratadas. Tambi�n se recomienda el consumo de infusiones suaves como manzanilla o menta para aliviar molestias           " +
                                                  "\n urinarias. POSIBLE TRATAMIENTO. El tratamiento para la clamidia incluye antibi�ticos como azitromicina en dosis �nica      " +
                                                  "\n o doxiciclina durante 7 d�as. Marcas reconocidas incluyen Zitromax y Vibramycin. Es fundamental completar el tratamiento   " +
                                                  "\n y tratar tambi�n a la pareja sexual para evitar reinfecci�n. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica en     " +
                                                  "\n antioxidantes, lisina y vitaminas del complejo B. Algunos alimentos clave incluyen yogur natural y leche, ricos en lisina, " +
                                                  "\n que inhibe la replicaci�n bacteriana. Frutas como naranja, kiwi y papaya, ricas en vitamina C, que fortalecen el sistema   " +
                                                  "\n inmune, con un aporte del 89% del requerimiento diario por cada 100 gramos. Verduras como espinaca y zanahoria, ricas en   " +
                                                  "\n vitamina A y �cido f�lico, que favorecen la regeneraci�n celular y fortalecen las mucosas, con un aporte del 15% del       " +
                                                  "\n requerimiento diario por cada 100 gramos. Frutos secos como almendras y nueces, ricos en vitamina E y �cidos grasos        " +
                                                  "\n esenciales, que protegen las c�lulas inmunol�gicas, con un aporte del 37% del requerimiento diario por cada 28 gramos.     " +
                                                  "\n Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga    " +
                                                  "\n clamidia ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico       " +
                                                  "\n para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n La meningitis bacteriana es una infecci�n grave que inflama las membranas que rodean el cerebro y la m�dula espinal.     " +
                                                  "\n En la ancianidad, los s�ntomas pueden ser at�picos y presentarse como confusi�n, somnolencia o p�rdida de apetito,       " +
                                                  "\n lo que dificulta su detecci�n temprana. EJERCICIO. Se recomienda actividad f�sica muy ligera durante la fase de          " +
                                                  "\n recuperaci�n, como estiramientos suaves o caminatas cortas en ambientes tranquilos, evitando cualquier esfuerzo que      " +
                                                  "\n pueda aumentar la presi�n intracraneal o la fatiga. HIDRATACI�N. Es fundamental consumir entre 2.5 y 3 litros de agua    " +
                                                  "\n al d�a para mantener el equilibrio de l�quidos, apoyar la funci�n renal y facilitar la eliminaci�n de toxinas. Tambi�n   " +
                                                  "\n se recomienda el consumo de caldos suaves o infusiones tibias para mantener la hidrataci�n sin irritar el sistema        " +
                                                  "\n digestivo. POSIBLE TRATAMIENTO. El tratamiento incluye antibi�ticos intravenosos de amplio espectro como ceftriaxona     " +
                                                  "\n o vancomicina, ajustados seg�n el agente causal identificado. En algunos casos se administra dexametasona como           " +
                                                  "\n antiinflamatorio adyuvante para reducir el riesgo de da�o neurol�gico. Es crucial iniciar el tratamiento lo antes        " +
                                                  "\n posible para evitar complicaciones graves. ALIMENTACI�N RECOMENDADA. Consumir alimentos ricos en vitaminas del           " +
                                                  "\n complejo B, antioxidantes y prote�nas para apoyar la recuperaci�n neurol�gica. Huevo cocido, fuente de vitamina B12 y    " +
                                                  "\n colina, esenciales para la funci�n cerebral. Espinaca, rica en �cido f�lico y hierro, que favorecen la oxigenaci�n          " +
                                                  "\n cerebral, aportando hasta el 20% del requerimiento diario de hierro por cada 100 g. Frutas como pl�tano y manzana,          " +
                                                  "\n que aportan potasio y fibra soluble, ayudando a mantener el equilibrio electrol�tico y la digesti�n. Yogur natural,         " +
                                                  "\n fuente de probi�ticos que fortalecen la flora intestinal y el sistema inmune. Este es solo un diagn�stico predeterminado    " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus     " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad  " +
                                                  "\n en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo     " +
                                                  "\n se le recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n El c�ncer es un conjunto de enfermedades caracterizadas por el crecimiento descontrolado de c�lulas anormales que pueden     " +
                                                  "\n invadir tejidos y �rganos. En la ancianidad, el tratamiento debe adaptarse a la condici�n f�sica general, comorbilidades     " +
                                                  "\n y tipo de c�ncer. EJERCICIO. Se recomienda actividad f�sica moderada y personalizada, como caminatas, ejercicios de          " +
                                                  "\n resistencia con bandas el�sticas o yoga suave, que ayudan a mantener la masa muscular, mejorar el estado de �nimo y          " +
                                                  "\n reducir la fatiga asociada al tratamiento. HIDRATACI�N. Es fundamental consumir entre 2.5 y 3 litros de agua al d�a          " +       
                                                  "\n para apoyar la funci�n renal, especialmente durante la quimioterapia o radioterapia, y facilitar la eliminaci�n de           " +
                                                  "\n toxinas. Tambi�n se recomienda el consumo de l�quidos ricos en electrolitos si hay v�mitos o diarrea. POSIBLE TRATAMIENTO.   " +
                                                  "\n El tratamiento puede incluir cirug�a, quimioterapia, radioterapia, inmunoterapia o terapia hormonal, dependiendo del tipo    " +
                                                  "\n y estadio del c�ncer. En adultos mayores, se prioriza un enfoque individualizado que equilibre eficacia y calidad de vida.   " +
                                                  "\n Medicamentos como letrozol, capecitabina o pembrolizumab pueden ser considerados seg�n el caso. ALIMENTACI�N RECOMENDADA.    " +
                                                  "\n Consumir alimentos ricos en antioxidantes, prote�nas y vitaminas para fortalecer el sistema inmunol�gico y prevenir la       " +
                                                  "\n p�rdida de peso. Frutas como papaya y guayaba, ricas en vitamina C, que fortalecen las defensas, aportando hasta el 200%     " +
                                                  "\n del requerimiento diario por cada 100 g. Carnes magras y huevos, fuentes de prote�nas de alta calidad, esenciales para       " +
                                                  "\n la regeneraci�n celular. Verduras como br�coli y zanahoria, ricas en vitamina A, �cido f�lico y antioxidantes. Yogur         " +
                                                  "\n natural, fuente de probi�ticos que mejoran la flora intestinal y la absorci�n de nutrientes. Este es solo un diagn�stico     " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la        " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer  " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le         " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida)        " +
                                                  "\n y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.35-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener           " +
                                                  "\n una hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales.              " +
                                                  "\n EJERCICIO. Se recomienda actividad f�sica ligera como caminatas suaves de 15 a 20 minutos al d�a, ejercicios de             " +
                                                  "\n respiraci�n profunda y estiramientos suaves para mantener la circulaci�n activa y mejorar la oxigenaci�n sin agotar         " +
                                                  "\n al cuerpo. Tambi�n es �til realizar ejercicios de movilidad articular para prevenir rigidez muscular durante el             " +
                                                  "\n reposo. HIDRATACI�N. Se aconseja consumir entre 2.5 y 3 litros de agua al d�a para compensar la p�rdida de l�quidos         " +
                                                  "\n por fiebre y sudoraci�n, mantener las mucosas hidratadas y facilitar la eliminaci�n de toxinas. Tambi�n se recomienda       " +
                                                  "\n el consumo de caldos naturales, infusiones tibias de jengibre o manzanilla y jugos c�tricos sin az�car a�adida para         " +
                                                  "\n reforzar el sistema inmunol�gico. POSIBLE TRATAMIENTO. El tratamiento para la influenza incluye antivirales como            " +
                                                  "\n oseltamivir (marca reconocida: Tamiflu) que deben administrarse en las primeras 48 horas de s�ntomas. Tambi�n se            " +
                                                  "\n utilizan medicamentos para aliviar fiebre y dolor como paracetamol (Tempra) o ibuprofeno (Advil). Es importante el          " +
                                                  "\n reposo absoluto y evitar el contacto con otras personas para prevenir contagios. ALIMENTACI�N RECOMENDADA. Se recomienda    " +
                                                  "\n una dieta rica en antioxidantes, vitamina C y zinc. Algunos alimentos clave incluyen frutas c�tricas como naranja,          " +
                                                  "\n toronja y kiwi, ricas en vitamina C, que fortalecen el sistema inmune, aportando el 89% del requerimiento diario por cada   " +
                                                  "\n 100 gramos. Verduras como espinaca y br�coli, ricas en vitamina A y �cido f�lico, que ayudan a la regeneraci�n celular y    " +
                                                  "\n fortalecen las mucosas, con un aporte del 15% del requerimiento diario por cada 100 gramos. Frutos secos como almendras     " +
                                                  "\n y nueces, ricos en vitamina E y �cidos grasos esenciales, que protegen las c�lulas inmunol�gicas, con un aporte del 37%     " +
                                                  "\n del requerimiento diario por cada 28 gramos. Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero   " +
                                                  "\n no garantiza al 100% que el paciente tenga influenza ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de   " +
                                                  "\n un diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera  " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener    " +
                                                  "\n una hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales.       " +
                                                  "\n EJERCICIO. Se recomienda reposo durante la fase aguda de la enfermedad. Una vez superada esta etapa, se pueden       " +
                                                  "\n incorporar caminatas suaves de 10 a 15 minutos al d�a, ejercicios de respiraci�n profunda y estiramientos para       " +
                                                  "\n mejorar la oxigenaci�n y prevenir la rigidez muscular. Tambi�n es �til realizar ejercicios de equilibrio y           " +
                                                  "\n coordinaci�n para recuperar la funcionalidad neurol�gica. HIDRATACI�N. Se aconseja consumir entre 2.5 y 3 litros          " +
                                                  "\n de agua al d�a para mantener el equilibrio de l�quidos, facilitar la eliminaci�n de toxinas y apoyar la funci�n           " +
                                                  "\n renal durante el tratamiento antibi�tico. Tambi�n se recomienda el consumo de caldos naturales, infusiones suaves         " +
                                                  "\n y jugos naturales ricos en vitamina C. POSIBLE TRATAMIENTO. El tratamiento para la neumon�a incluye antibi�ticos          " +
                                                  "\n como amoxicilina con �cido clavul�nico, ceftriaxona o levofloxacino, dependiendo del agente causal. Marcas reconocidas    " +
                                                  "\n incluyen Clavulin, Rocephin y Tavanic. En algunos casos se a�aden corticosteroides como la dexametasona para reducir      " +
                                                  "\n la inflamaci�n pulmonar. Es fundamental iniciar el tratamiento lo antes posible para evitar complicaciones. ALIMENTACI�N  " + 
                                                  "\n RECOMENDADA. Se recomienda una dieta rica en prote�nas, antioxidantes y vitaminas del complejo B. Algunos alimentos       " +
                                                  "\n clave incluyen carnes magras y pescado, fuentes de prote�nas esenciales. Frutas c�tricas como naranja y kiwi, ricas       " +
                                                  "\n en vitamina C, que fortalecen el sistema inmune, aportando el 89% del requerimiento diario por cada 100 gramos. Verduras  " +
                                                  "\n como espinaca y br�coli, ricas en �cido f�lico y vitamina B9, esenciales para la regeneraci�n celular, con un aporte del  " +
                                                  "\n 15% del requerimiento diario por cada 100 gramos. Frutos secos como almendras y nueces, ricos en vitamina E y �cidos      " +
                                                  "\n grasos esenciales, que protegen las c�lulas inmunol�gicas y aportan el 37% del requerimiento diario por cada 28 gramos.   " +
                                                  "\n Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga   " +
                                                  "\n neumon�a ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico      " +
                                                  "\n para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener    " +
                                                  "\n una hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales.       " +
                                                  "\n EJERCICIO. Se recomienda actividad f�sica regular como caminatas de 20 a 30 minutos al d�a, ejercicios de            " +
                                                  "\n resistencia moderada y estiramientos. Tambi�n se aconseja incluir ejercicios de fuerza dos veces por semana para     " +
                                                  "\n prevenir la p�rdida de masa muscular y �sea. La actividad f�sica mejora la sensibilidad a la insulina, regula la     " +
                                                  "\n glucosa y reduce el riesgo cardiovascular. HIDRATACI�N. Se aconseja consumir entre 2 y 2.5 litros de agua al d�a     " +
                                                  "\n para apoyar la funci�n renal, facilitar la absorci�n de medicamentos y prevenir infecciones urinarias. Tambi�n se    " +
                                                  "\n recomienda el consumo de caldos naturales, infusiones sin az�car y bebidas con electrolitos en caso de diarrea o     " +
                                                  "\n fiebre. POSIBLE TRATAMIENTO. El tratamiento para la diabetes incluye medicamentos orales como metformina,            " +
                                                  "\n glibenclamida o sitagliptina, y en algunos casos insulina. Marcas reconocidas incluyen Glucophage, Diamicron y       " +
                                                  "\n Januvia. Es fundamental mantener una adherencia estricta al tratamiento y realizar controles peri�dicos de glucosa.  " +
                                                  "\n ALIMENTACI�N RECOMENDADA. Se recomienda una dieta equilibrada rica en fibra, prote�nas magras y carbohidratos        " +
                                                  "\n complejos. Algunos alimentos clave incluyen cereales integrales como avena y arroz integral, que ayudan a mantener   " +
                                                  "\n niveles estables de glucosa. Frutas como manzana y pera, ricas en fibra soluble, que ralentizan la absorci�n de      " +
                                                  "\n az�car, con un aporte del 15% del requerimiento diario por cada 100 gramos. Verduras como espinaca, br�coli y        " +
                                                  "\n zanahoria, ricas en vitamina A, hierro y antioxidantes, que ayudan a prevenir complicaciones. Frutos secos como      " + 
                                                  "\n almendras y nueces, ricos en vitamina E y �cidos grasos esenciales, con un aporte del 37% del requerimiento diario   " +
                                                  "\n por cada 28 gramos. Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al     " +
                                                  "\n 100% que el paciente tenga diabetes ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un          " +
                                                  "\n diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida)       " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n El asma es una enfermedad inflamatoria cr�nica de las v�as respiratorias que puede causar dificultad para respirar,  " +
                                                  "\n tos, opresi�n en el pecho y sibilancias. En la ancianidad, los s�ntomas pueden confundirse con otras afecciones      " +
                                                  "\n respiratorias, y el riesgo de complicaciones aumenta debido a la disminuci�n de la funci�n pulmonar y la presencia   " +
                                                  "\n de otras enfermedades cr�nicas. EJERCICIO. Se recomienda actividad f�sica moderada y controlada, como caminatas      " +
                                                  "\n suaves, ejercicios de respiraci�n y estiramientos, evitando ambientes fr�os o contaminados. Es importante realizar   " +
                                                  "\n calentamiento previo y enfriamiento posterior, as� como adaptar la intensidad seg�n la capacidad respiratoria del    " +
                                                  "\n paciente. HIDRATACI�N. Es fundamental consumir entre 2 y 2.5 litros de agua al d�a para mantener las v�as            " +
                                                  "\n respiratorias hidratadas, facilitar la eliminaci�n de secreciones y reducir la irritaci�n bronquial. Tambi�n se      " +
                                                  "\n recomienda el consumo de l�quidos tibios como infusiones de jengibre o manzanilla. POSIBLE TRATAMIENTO. El           " +
                                                  "\n tratamiento incluye broncodilatadores de acci�n r�pida como el salbutamol, corticosteroides inhalados como la        " +
                                                  "\n fluticasona o budesonida, y en algunos casos, modificadores de leucotrienos como el montelukast. Es esencial seguir  " +
                                                  "\n un plan de acci�n personalizado y utilizar los medicamentos preventivos de forma regular. ALIMENTACI�N RECOMENDADA.  " +
                                                  "\n Consumir alimentos que reduzcan la inflamaci�n y fortalezcan el sistema respiratorio. Pescados grasos como salm�n    " +
                                                  "\n y at�n, ricos en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias, aportando hasta el 90% del         " +
                                                  "\n requerimiento diario por cada 100 g. Frutas como fresas y ar�ndanos, ricas en vitamina C y antioxidantes, que        " +
                                                  "\n fortalecen el sistema inmune, aportando cerca del 70% del requerimiento diario por cada 100 g. Verduras como         " +
                                                  "\n espinaca y br�coli, ricas en hierro, vitamina A y carotenoides, esenciales para la salud pulmonar. Este es solo      " +
                                                  "\n un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad   " +
                                                  "\n y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico   " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la      " +
                                                  "\n respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, �ngel L Montes      " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n El VIH es un virus que debilita el sistema inmunol�gico, y si no se trata adecuadamente, puede progresar a SIDA,        " +
                                                  "\n una condici�n que deja al cuerpo vulnerable a infecciones y enfermedades graves. En la ancianidad, el diagn�stico       " +
                                                  "\n puede retrasarse y el tratamiento debe considerar otras condiciones cr�nicas. EJERCICIO. Se recomienda actividad        " +
                                                  "\n f�sica moderada como caminatas, yoga o ejercicios de bajo impacto, que ayudan a fortalecer el sistema inmune,           " +
                                                  "\n mejorar el estado de �nimo y mantener la masa muscular. Es importante evitar el sobreesfuerzo y adaptar la rutina       " +
                                                  "\n a la condici�n f�sica del paciente. HIDRATACI�N. Es fundamental consumir entre 2 y 2.5 litros de agua al d�a para       " +
                                                  "\n apoyar la funci�n renal, facilitar la eliminaci�n de toxinas y mantener el equilibrio corporal. Tambi�n se recomienda   " +
                                                  "\n el consumo de l�quidos ricos en electrolitos en caso de fiebre o diarrea. POSIBLE TRATAMIENTO. El tratamiento           " +
                                                  "\n consiste en terapia antirretroviral (TAR), que incluye combinaciones de medicamentos como tenofovir, emtricitabina,     " +
                                                  "\n dolutegravir o efavirenz, que ayudan a mantener la carga viral indetectable y preservar la funci�n inmunol�gica. Es     " +
                                                  "\n esencial la adherencia estricta al tratamiento y el monitoreo m�dico constante. ALIMENTACI�N RECOMENDADA. Consumir      " +
                                                  "\n alimentos que fortalezcan el sistema inmunol�gico y prevengan la p�rdida de peso. Frutas como papaya y guayaba,         " +
                                                  "\n ricas en vitamina C, que fortalecen las defensas, aportando hasta el 200% del requerimiento diario por cada 100 g.      " +
                                                  "\n L�cteos como yogur natural, fuente de probi�ticos que mejoran la flora intestinal. Carnes magras y huevos, ricos        " +
                                                  "\n en prote�nas de alta calidad, esenciales para la regeneraci�n celular. Verduras como espinaca y zanahoria, ricas        " +
                                                  "\n en vitamina A, hierro y antioxidantes. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no         " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas,   " +
                                                  "\n para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento        " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le             " +
                                                  "\n recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n La gonorrea es una infecci�n bacteriana de transmisi�n sexual causada por Neisseria gonorrhoeae, que puede afectar         " +
                                                  "\n el tracto genital, rectal o far�ngeo. En mujeres mayores, puede pasar desapercibida o confundirse con otras afecciones,    " +
                                                  "\n aumentando el riesgo de complicaciones. EJERCICIO. Se recomienda actividad f�sica ligera como caminatas o estiramientos    " +
                                                  "\n suaves, evitando esfuerzos intensos durante el tratamiento para no comprometer el sistema inmunol�gico. HIDRATACI�N. Es    " +
                                                  "\n fundamental consumir entre 2 y 2.5 litros de agua al d�a para facilitar la eliminaci�n de toxinas, mantener la funci�n     " +
                                                  "\n renal y apoyar el proceso de recuperaci�n. POSIBLE TRATAMIENTO. El tratamiento de primera l�nea consiste en una dosis      " +
                                                  "\n �nica intramuscular de ceftriaxona 500 mg. En caso de alergia o dificultad de acceso, puede utilizarse cefixima 800 mg     " +
                                                  "\n v�a oral. Si no se ha descartado coinfecci�n con clamidia, se a�ade doxiciclina 100 mg dos veces al d�a por 7 d�as. Es     " +
                                                  "\n importante tratar tambi�n a las parejas sexuales para evitar reinfecci�n. ALIMENTACI�N RECOMENDADA. Consumir alimentos     " +
                                                  "\n que fortalezcan el sistema inmunol�gico y favorezcan la recuperaci�n. Frutas como kiwi y naranja, ricas en vitamina C,     " +
                                                  "\n que ayudan a combatir infecciones, aportando hasta el 90% del requerimiento diario por cada 100 g. Verduras como br�coli   " +
                                                  "\n y espinaca, ricas en �cido f�lico, hierro y antioxidantes. Yogur natural, fuente de probi�ticos que fortalecen la flora    " +
                                                  "\n intestinal. Carnes magras, ricas en prote�nas necesarias para la regeneraci�n celular. Este es solo un diagn�stico         " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la      " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer " + 
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le   " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida)  " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n EJERCICIO: Durante los brotes activos de herpes genital se recomienda evitar la actividad f�sica intensa y priorizar        " +
                                                  "\n el descanso, ya que el estr�s f�sico puede agravar los s�ntomas y retrasar la cicatrizaci�n. Una vez que las lesiones       " +
                                                  "\n hayan sanado, se pueden retomar ejercicios suaves como caminatas lentas, estiramientos o yoga terap�utico, que ayudan       " +
                                                  "\n a mejorar la circulaci�n, reducir la tensi�n muscular y fortalecer el sistema inmunol�gico. HIDRATACI�N: Es fundamental     " +
                                                  "\n consumir al menos 2.5 litros de agua al d�a para mantener la piel y las mucosas hidratadas, lo que favorece la              " +
                                                  "\n cicatrizaci�n de las lesiones y ayuda a eliminar toxinas. Tambi�n se recomienda el consumo de infusiones con propiedades    " +
                                                  "\n antivirales y calmantes como el t� de manzanilla, t� verde o infusi�n de cal�ndula, que pueden aliviar la irritaci�n y      " +
                                                  "\n reforzar las defensas naturales. POSIBLE TRATAMIENTO: El tratamiento del herpes genital incluye antivirales como            " +
                                                  "\n aciclovir, valaciclovir o famciclovir, administrados por v�a oral durante 7 a 10 d�as en episodios iniciales. En            " +
                                                  "\n casos de recurrencias frecuentes, puede indicarse tratamiento supresivo diario por varios meses o incluso a�os. En          " +
                                                  "\n situaciones graves o en pacientes inmunocomprometidos, puede ser necesario el uso de antivirales por v�a intravenosa.       " +
                                                  "\n Tambi�n se pueden utilizar cremas anest�sicas con lidoca�na para aliviar el dolor local, y es importante mantener la        " +
                                                  "\n zona limpia y seca para evitar infecciones secundarias. ALIMENTACI�N: Se recomienda el consumo de alimentos que             " +
                                                  "\n fortalezcan el sistema inmunol�gico y favorezcan la regeneraci�n de tejidos, tales como frutas c�tricas como naranjas       " +
                                                  "\n y toronjas, que aportan vitamina C en un 89% de la ingesta diaria recomendada. Yogur natural, que contiene probi�ticos      " +
                                                  "\n que equilibran la flora vaginal y fortalecen las defensas. Verduras de hoja verde como espinacas y acelgas, que aportan     " +
                                                  "\n hasta un 50% de la ingesta diaria recomendada de vitamina A y K, esenciales para la regeneraci�n celular. Ajo y cebolla,    " +
                                                  "\n que contienen compuestos sulfurados con propiedades antivirales y antioxidantes, contribuyendo con hasta un 40% de la       " +
                                                  "\n ingesta diaria recomendada de estos nutrientes. este es solo un diagn�stico predeterminado l�gico. haberlo consultado       " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se           " +
                                                  "\n recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la      " +
                                                  "\n respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu         " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n EJERCICIO: Durante el tratamiento de la s�filis se recomienda evitar esfuerzos f�sicos intensos, especialmente si hay     " +
                                                  "\n s�ntomas como fiebre, fatiga o lesiones cut�neas. Una vez estabilizada la condici�n, se pueden realizar ejercicios        " +
                                                  "\n suaves como caminatas o estiramientos para mejorar la circulaci�n, apoyar el sistema inmunol�gico y mantener la           " +
                                                  "\n movilidad articular. HIDRATACI�N: Es esencial consumir entre 2 y 2.5 litros de agua al d�a para facilitar la eliminaci�n  " +
                                                  "\n de toxinas y apoyar la funci�n renal durante el tratamiento antibi�tico. Tambi�n se recomienda el consumo de infusiones   " +
                                                  "\n como t� de diente de le�n o manzanilla, que ayudan a depurar el organismo y calmar el sistema digestivo. POSIBLE          " +
                                                  "\n TRATAMIENTO: El tratamiento est�ndar para la s�filis en etapas primaria, secundaria o latente precoz es una inyecci�n     " +
                                                  "\n intramuscular �nica de penicilina G benzatina (2.4 millones de unidades). En casos de s�filis latente tard�a o terciaria, " +
                                                  "\n se administran tres dosis semanales consecutivas. Para personas al�rgicas a la penicilina, se pueden usar doxiciclina o   " +
                                                  "\n ceftriaxona. En pacientes de edad avanzada, es fundamental realizar seguimiento cl�nico y serol�gico para confirmar la    " +
                                                  "\n curaci�n y evitar complicaciones neurol�gicas. ALIMENTACI�N: Se recomienda el consumo de alimentos que fortalezcan el     " +
                                                  "\n sistema inmunol�gico y favorezcan la regeneraci�n celular, tales como frutas como kiwi y fresas, que aportan vitamina C   " + 
                                                  "\n en un 90% de la ingesta diaria recomendada. Verduras como br�coli y zanahorias, que contienen vitamina A y antioxidantes, " +
                                                  "\n aportando hasta un 50% de la ingesta diaria recomendada. Frutos secos como almendras y nueces, que contienen vitamina E   " +
                                                  "\n y zinc, contribuyendo con hasta un 40% de la ingesta diaria recomendada de estos nutrientes esenciales para la reparaci�n " +
                                                  "\n celular. este es solo un diagn�stico predeterminado l�gico. haberlo consultado no garantiza al 100% que la paciente       " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar m�s de un diagn�stico    " +
                                                  "\n para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico no le satisface    " +
                                                  "\n del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n EJERCICIO: Durante el tratamiento de la tuberculosis se recomienda realizar actividad f�sica moderada como caminatas      " +
                                                  "\n suaves o ejercicios de respiraci�n para mejorar la capacidad pulmonar y reducir la fatiga. Es importante evitar el        " + 
                                                  "\n esfuerzo f�sico excesivo, especialmente en las primeras semanas de tratamiento. La fisioterapia respiratoria puede        " +
                                                  "\n ser de gran ayuda para mejorar la oxigenaci�n y la funci�n pulmonar, especialmente en personas mayores. HIDRATACI�N:      " +
                                                  "\n Es crucial consumir al menos 2.5 litros de agua al d�a para mantener las mucosas hidratadas, facilitar la expectoraci�n   " +
                                                  "\n y apoyar la funci�n renal durante el tratamiento prolongado con antibi�ticos. Tambi�n se recomienda el consumo de caldos  " +
                                                  "\n naturales, infusiones suaves y jugos naturales sin az�car para aportar l�quidos y micronutrientes esenciales. Una         " +
                                                  "\n hidrataci�n adecuada tambi�n ayuda a reducir la toxicidad de los medicamentos y mejora la tolerancia al tratamiento.      " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento est�ndar para la tuberculosis activa incluye una combinaci�n de antibi�ticos como     " +
                                                  "\n isoniazida, rifampicina, pirazinamida y etambutol durante al menos 6 meses. Es fundamental seguir el esquema completo     " +
                                                  "\n sin interrupciones para evitar reca�das o resistencia bacteriana. En casos de tuberculosis resistente, se utilizan        " +
                                                  "\n medicamentos de segunda l�nea y el tratamiento puede extenderse hasta 18 meses. En personas mayores, se debe monitorear   " +
                                                  "\n estrechamente la funci�n hep�tica y renal durante el tratamiento. ALIMENTACI�N: Se recomienda el consumo de alimentos     " +
                                                  "\n ricos en prote�nas, vitaminas y minerales para fortalecer el sistema inmunol�gico y apoyar la regeneraci�n pulmonar,      " +
                                                  "\n tales como carnes magras y legumbres, que aportan prote�nas de alta calidad. Frutas como guayaba y papaya, que contienen  " +
                                                  "\n vitamina C en un 90% de la ingesta diaria recomendada, ayudando a combatir infecciones. Verduras como espinacas y br�coli,  " +
                                                  "\n que aportan hierro, vitamina A y �cido f�lico, esenciales para la producci�n de gl�bulos rojos y la reparaci�n celular.     " +
                                                  "\n Frutos secos como nueces y semillas de girasol, que contienen vitamina E y selenio, contribuyendo con hasta un 40% de la    " +
                                                  "\n ingesta diaria recomendada de estos antioxidantes. este es solo un diagn�stico predeterminado l�gico. haberlo consultado    " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda" +
                                                  "\n realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la respuesta del   " +
                                                  "\n diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app       " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la artritis es fundamental mantener una hidrataci�n adecuada con un consumo diario       " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para favorecer la lubricaci�n de        " +
                                                  "\n las articulaciones y reducir la rigidez matutina. EJERCICIO: Se recomienda actividad f�sica regular y de bajo impacto        " +
                                                  "\n como caminatas suaves ejercicios de estiramiento o nataci�n para mantener la movilidad articular y fortalecer los m�sculos   " +
                                                  "\n que rodean las articulaciones adem�s se sugiere la pr�ctica de ejercicios espec�ficos de fisioterapia articular y t�cnicas   " +
                                                  "\n de relajaci�n como el yoga adaptado. POSIBLE TRATAMIENTO: El tratamiento puede incluir medicamentos antiinflamatorios no     " +
                                                  "\n esteroideos como el ibuprofeno o el naproxeno para aliviar el dolor y la inflamaci�n adem�s de f�rmacos modificadores de     " +
                                                  "\n la enfermedad como el metotrexato o la sulfasalazina en algunos casos se utilizan corticosteroides o terapias biol�gicas        " +
                                                  "\n como los inhibidores del TNF es fundamental seguir el tratamiento indicado por el reumat�logo y realizar controles peri�dicos.  " +
                                                  "\n ALIMENTOS RECOMENDADOS: Para reducir la inflamaci�n y proteger las articulaciones se recomienda el consumo de PESCADOS          " + 
                                                  "\n GRASOS: Como el salm�n y la sardina ricos en �cidos grasos Omega-3 que aportan aproximadamente el 50% de la ingesta diaria      " +
                                                  "\n recomendada por cada 100 gramos. FRUTOS SECOS: Como nueces y almendras que contienen vitamina E y grasas saludables con un      " +
                                                  "\n aporte del 35% de la ingesta diaria recomendada por cada 30 gramos. ESPINACAS Y BR�COLI: Ricos en antioxidantes vitamina A      " +
                                                  "\n y vitamina K esenciales para la salud �sea y articular con un aporte del 56% de la ingesta diaria recomendada por cada 100      " +
                                                  "\n gramos. C�RCUMA: Contiene curcumina con propiedades antiinflamatorias naturales. Este es solo un diagn�stico predeterminado     " +
                                                  "\n l�gico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente   " +
                                                  "\n correctas para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento      " +
                                                  "\n adecuado de su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho     " +
                                                  "\n consultar a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la tosferina es fundamental mantener una hidrataci�n adecuada con un consumo          " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para mantener las v�as        " +
                                                  "\n respiratorias h�medas y facilitar la expulsi�n de mucosidad. EJERCICIO: Se recomienda reposo durante la fase aguda        " +
                                                  "\n y posteriormente actividad f�sica ligera como caminatas lentas ejercicios de respiraci�n profunda y estiramientos         " +
                                                  "\n suaves para mejorar la oxigenaci�n y reducir la fatiga respiratoria. POSIBLE TRATAMIENTO: El tratamiento suele incluir    " +
                                                  "\n antibi�ticos como la azitromicina la claritromicina o la eritromicina especialmente si se inicia en las primeras fases    " +
                                                  "\n de la enfermedad tambi�n se pueden utilizar broncodilatadores y humidificadores para aliviar la tos es importante evitar  " +
                                                  "\n el uso de medicamentos para la tos sin prescripci�n m�dica. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema            " +
                                                  "\n respiratorio se recomienda el consumo de NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la duraci�n de      " +
                                                  "\n los s�ntomas aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Con         " +
                                                  "\n propiedades antiinflamatorias que pueden aliviar la irritaci�n de garganta. MIEL Y LIM�N: Combinaci�n efectiva para       " +
                                                  "\n calmar la tos y suavizar la garganta aportando flavonoides y vitamina C. ESPINACAS Y BR�COLI: Aportan antioxidantes       " +
                                                  "\n y vitamina A esenciales para la regeneraci�n celular con un contenido de aproximadamente el 56% de la ingesta diaria      " +
                                                  "\n recomendada por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza al     " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda     " +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s   " +
                                                  "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico Angel  " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: Para el tratamiento de las paperas es fundamental mantener una hidrataci�n adecuada con un consumo diario       " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para prevenir la deshidrataci�n y       " +
                                                  "\n aliviar la inflamaci�n de las gl�ndulas salivales. EJERCICIO: Se recomienda reposo durante la fase aguda y posteriormente    " +
                                                  "\n actividad f�sica ligera como estiramientos suaves y caminatas cortas para recuperar energ�a sin forzar el sistema            " +
                                                  "\n inmunol�gico. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral espec�fico para las paperas el manejo es sintom�tico   " +
                                                  "\n e incluye el uso de analg�sicos como el paracetamol o el ibuprofeno para reducir el dolor y la fiebre adem�s de compresas    " +
                                                  "\n fr�as en las gl�ndulas inflamadas y aislamiento durante al menos cinco d�as desde el inicio de los s�ntomas. ALIMENTOS       " +
                                                  "\n RECOMENDADOS: Para aliviar los s�ntomas y fortalecer el sistema inmunol�gico se recomienda el consumo de SOPAS Y CALDOS:     " +
                                                  "\n F�ciles de tragar y nutritivos. NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la duraci�n de los s�ntomas     " +
                                                  "\n aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Con propiedades             " +
                                                  "\n antiinflamatorias que pueden aliviar el malestar general. ESPINACAS Y BR�COLI: Aportan antioxidantes y vitamina A esenciales " +
                                                  "\n para la regeneraci�n celular con un contenido de aproximadamente el 56% de la ingesta diaria recomendada por cada 100        " +
                                                  "\n gramos. YOGUR NATURAL: Contiene probi�ticos que fortalecen el sistema inmunol�gico y mejoran la salud digestiva aportando    " +
                                                  "\n calcio y prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100%     " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer m�s   " + 
                                                  "\n de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s por su salud   " +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico Angel L Montes         " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 a 3 litros de agua al d�a para prevenir la deshidrataci�n causada por fiebre,  " +
                                                  "\n sudoraci�n y p�rdida de apetito. En mujeres en etapa de ancianidad, una hidrataci�n constante tambi�n ayuda a mantener la   " +
                                                  "\n funci�n renal, reducir el riesgo de hipotensi�n y apoyar la eliminaci�n de toxinas virales. EJERCICIO: Durante la fase      " +
                                                  "\n aguda se recomienda reposo absoluto. Una vez superados los s�ntomas, se puede retomar actividad f�sica ligera como          " +
                                                  "\n caminatas suaves, ejercicios de movilidad articular y respiraci�n profunda. Estas actividades ayudan a mejorar la           " +
                                                  "\n circulaci�n, reducir la rigidez muscular y estimular el sistema linf�tico, lo cual favorece la eliminaci�n de residuos      " +
                                                  "\n celulares. Tambi�n se recomienda realizar ejercicios en ambientes ventilados y con apoyo si hay debilidad o mareos.         " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un antiviral espec�fico para el virus del Zika. El tratamiento es sintom�tico e incluye      " +
                                                  "\n Paracetamol para la fiebre y el dolor, antihistam�nicos para el prurito y reposo. Se debe evitar el uso de aspirina o       " +
                                                  "\n AINEs hasta descartar dengue, por riesgo de hemorragias. Tambi�n se recomienda el uso de repelentes, mosquiteros y ropa     " +
                                                  "\n protectora para evitar nuevas picaduras. En mujeres mayores, se debe vigilar la aparici�n de s�ntomas neurol�gicos como     " +
                                                  "\n debilidad muscular, visi�n borrosa o alteraciones sensoriales. ALIMENTACI�N: Se sugiere una dieta rica en antioxidantes     " +
                                                  "\n y nutrientes inmunoestimulantes como: Naranjas (con vitamina C, 89% por cada 100 g); Kiwi (con vitamina C y potasio, 92%    " +
                                                  "\n y 7% respectivamente); Aguacate (con vitamina E, 14% por cada 100 g); Zanahorias (con vitamina A, 93% por cada 100 g);      " +
                                                  "\n y Jengibre (con compuestos antiinflamatorios y antivirales naturales). Este es solo un diagn�stico predeterminado l�gico,   " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente      " +
                                                  "\n correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el         " +
                                                  "\n tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda         " +
                                                  "\n consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 3 litros de agua al d�a, incluyendo soluciones de rehidrataci�n oral para      " +
                                                  "\n reponer electrolitos perdidos por diarrea y v�mitos. En mujeres mayores de 75 a�os, la deshidrataci�n puede ser m�s     " +
                                                  "\n severa, por lo que se debe vigilar la frecuencia urinaria, la presi�n arterial y el estado de conciencia. EJERCICIO:    " +
                                                  "\n Durante la fase aguda se recomienda reposo absoluto. Una vez superados los s�ntomas, se puede retomar actividad f�sica  " +
                                                  "\n ligera como ejercicios de estiramiento, caminatas cortas y movimientos suaves de brazos y piernas. Estas actividades    " +
                                                  "\n ayudan a reactivar la circulaci�n, prevenir la p�rdida de masa muscular y mejorar la digesti�n. Tambi�n se recomienda   " +
                                                  "\n realizar ejercicios de respiraci�n para oxigenar los tejidos y reducir la fatiga. POSIBLE TRATAMIENTO: No existe un     " +
                                                  "\n tratamiento antiviral espec�fico. El manejo es sintom�tico y se enfoca en rehidrataci�n intensiva, control de la fiebre " +
                                                  "\n con Paracetamol y dieta astringente. No se recomiendan antidiarreicos como la loperamida. En casos graves, puede        " +
                                                  "\n requerirse hospitalizaci�n para administraci�n de l�quidos intravenosos. Tambi�n se sugiere el uso de probi�ticos       " +
                                                  "\n para restaurar la flora intestinal. ALIMENTACI�N: Se recomienda una dieta suave y rica en nutrientes como: Pl�tanos     " +
                                                  "\n (con potasio, 23% por cada 100 g); Arroz blanco (f�cil digesti�n y fuente de energ�a); Manzanas cocidas (con pectina,   " +
                                                  "\n que regula el tr�nsito intestinal); Zanahorias cocidas (con vitamina A, 93% por cada 100 g); y Yogur natural (con       " +
                                                  "\n probi�ticos y calcio, 30% por cada 100 g). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no     " +
                                                  "\n garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello,  " +
                                                  "\n se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado.     " +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.    " +
                                                  "\n �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 a 3 litros de agua al d�a para apoyar la funci�n renal, facilitar la          " +
                                                  "\n eliminaci�n de toxinas y mantener el equilibrio electrol�tico. En mujeres en etapa de ancianidad, una hidrataci�n          " +
                                                  "\n adecuada tambi�n ayuda a prevenir la hipotensi�n y la fatiga asociadas a la infecci�n. EJERCICIO: Durante la fase          " +
                                                  "\n aguda se recomienda reposo absoluto. Una vez estabilizada, se puede retomar actividad f�sica ligera como caminatas         " +
                                                  "\n suaves, ejercicios de movilidad articular y respiraci�n profunda. Estas actividades ayudan a prevenir el deterioro         " +
                                                  "\n funcional, mejorar la circulaci�n y reducir el riesgo de trombosis. Tambi�n se recomienda realizar ejercicios en           " +
                                                  "\n casa con apoyo, como levantarse y sentarse lentamente, para mantener la autonom�a sin comprometer la seguridad.            " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento incluye antibi�ticos intravenosos como Ampicilina o Penicilina G, frecuentemente       " +
                                                  "\n combinados con Gentamicina en casos graves. En mujeres adultas mayores, se debe ajustar la dosis seg�n la funci�n          " +
                                                  "\n renal y monitorear signos de meningitis o septicemia. Tambi�n se recomienda evitar alimentos de alto riesgo como           " +
                                                  "\n quesos blandos no pasteurizados, embutidos y pescados ahumados. En casos neurol�gicos, puede requerirse hospitalizaci�n    " +
                                                  "\n prolongada y seguimiento con neuroimagen. ALIMENTACI�N: Se sugiere una dieta rica en nutrientes inmunoestimulantes         " +
                                                  "\n como: Espinacas (con vitamina A y hierro, 56% y 15% por cada 100 g); Ajo (con propiedades antibacterianas naturales);      " +
                                                  "\n Zanahorias (con vitamina A, 93% por cada 100 g); Frutas c�tricas (con vitamina C, 89% por cada 100 g); y Yogur natural     " +
                                                  "\n (con probi�ticos y calcio, 30% por cada 100 g). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado      " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para        " +
                                                  "\n ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado.  " +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.       " +
                                                  "\n �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener     " +
                                                  "\n una hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales.        " +
                                                  "\n EJERCICIO. Durante la fase aguda se recomienda reposo absoluto para evitar complicaciones gastrointestinales.         " +
                                                  "\n Una vez superada esta etapa, se pueden incorporar caminatas suaves de 10 a 15 minutos al d�a, ejercicios de           " +
                                                  "\n movilidad articular y respiraci�n profunda para estimular la circulaci�n y la recuperaci�n intestinal. Tambi�n        " +
                                                  "\n es �til realizar estiramientos suaves para reducir la rigidez muscular y mantener la funcionalidad. HIDRATACI�N.      " +
                                                  "\n Se aconseja consumir entre 2.5 y 3 litros de agua al d�a para prevenir la deshidrataci�n causada por la diarrea.      " +
                                                  "\n Tambi�n se recomienda el uso de soluciones de rehidrataci�n oral, caldos naturales y jugos suaves sin az�car          " +
                                                  "\n a�adida. Se deben evitar bebidas con cafe�na, alcohol o alto contenido de az�car, ya que pueden empeorar los          " +
                                                  "\n s�ntomas. POSIBLE TRATAMIENTO. El tratamiento para la shigelosis incluye reposo, rehidrataci�n y en casos severos,    " +
                                                  "\n antibi�ticos como ciprofloxacino o azitromicina. Marcas reconocidas incluyen Ciproxin y Zitromax. No se deben usar    " +
                                                  "\n medicamentos antidiarreicos como loperamida, ya que pueden agravar la infecci�n. ALIMENTACI�N RECOMENDADA. Se         " +
                                                  "\n recomienda una dieta blanda, baja en fibra y rica en nutrientes esenciales. Algunos alimentos clave incluyen arroz    " +
                                                  "\n blanco y pur� de papa, que son f�ciles de digerir y ayudan a estabilizar el sistema digestivo. Yogur natural,         " +
                                                  "\n fuente de probi�ticos que ayudan a restaurar la flora intestinal. Pl�tano, rico en potasio, que ayuda a reponer       " +
                                                  "\n electrolitos perdidos, aportando el 10% del requerimiento diario por cada 100 gramos. Zanahoria cocida, rica en       " +
                                                  "\n vitamina A, que fortalece las mucosas intestinales, con un aporte del 15% del requerimiento diario por cada 100       " +
                                                  "\n gramos. Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el      " +
                                                  "\n paciente tenga shigelosis ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y       " +
                                                  "\n consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una        " +
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO.        " +
                                                  "\n Se recomienda actividad f�sica moderada como caminatas diarias de 20 a 30 minutos, ejercicios de respiraci�n profunda        " +
                                                  "\n y yoga terap�utico para fortalecer los pulmones y reducir la disnea. Tambi�n es �til realizar ejercicios de fortalecimiento  " +
                                                  "\n muscular con bandas el�sticas y t�cnicas de expansi�n tor�cica para mejorar la capacidad pulmonar. HIDRATACI�N. Se           " +
                                                  "\n aconseja consumir entre 2.5 y 3 litros de agua al d�a para mantener las v�as respiratorias hidratadas, facilitar la          " +
                                                  "\n eliminaci�n de secreciones y apoyar la funci�n renal. Tambi�n se recomienda el consumo de infusiones tibias como manzanilla  " +
                                                  "\n o jengibre para aliviar la irritaci�n bronquial. POSIBLE TRATAMIENTO. El tratamiento para la EPOC incluye broncodilatadores  " +
                                                  "\n de acci�n corta como salbutamol (Ventolin, Aerolin), corticosteroides inhalados como fluticasona o budesonida (Flixotide,    " +
                                                  "\n Pulmicort) y en algunos casos, anticolin�rgicos de acci�n prolongada como tiotropio (Spiriva). Tambi�n se recomienda la      " +  
                                                  "\n rehabilitaci�n pulmonar y el uso adecuado de inhaladores. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica en          " +
                                                  "\n antioxidantes, prote�nas y grasas saludables. Algunos alimentos clave incluyen pescados grasos como salm�n y at�n, ricos     " +
                                                  "\n en omega-3, que reducen la inflamaci�n pulmonar, aportando el 70% del requerimiento diario por cada 100 gramos. Frutas       " +
                                                  "\n como naranja, kiwi y papaya, ricas en vitamina C, que fortalecen el sistema inmune, con un aporte del 89% del requerimiento  " +
                                                  "\n diario por cada 100 gramos. Verduras como espinaca y br�coli, ricas en vitamina A y �cido f�lico, que protegen las mucosas   " +
                                                  "\n respiratorias, con un aporte del 15% del requerimiento diario por cada 100 gramos. Frutos secos como almendras y nueces,     " +
                                                  "\n ricos en vitamina E y �cidos grasos esenciales, con un aporte del 37% del requerimiento diario por cada 28 gramos. Este      " +
                                                  "\n diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga EPOC      " +
                                                  "\n ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para mayor       " +
                                                  "\n seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una     " +  
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO.     " +
                                                  "\n Se recomienda actividad f�sica moderada como caminatas suaves, yoga o ejercicios de movilidad durante 30 minutos al       " +
                                                  "\n d�a para mejorar la circulaci�n, reducir el estr�s y fortalecer el sistema inmunol�gico. Tambi�n es �til realizar         " +
                                                  "\n ejercicios de respiraci�n y relajaci�n para apoyar el bienestar general. HIDRATACI�N. Se aconseja consumir entre 2 y      " +
                                                  "\n 2.5 litros de agua al d�a para facilitar la eliminaci�n de toxinas, apoyar la funci�n renal y mantener las mucosas        " +
                                                  "\n hidratadas. Tambi�n se recomienda el consumo de infusiones suaves como manzanilla o menta para aliviar molestias          " +
                                                  "\n urinarias. POSIBLE TRATAMIENTO. El tratamiento para la clamidia incluye antibi�ticos como azitromicina en dosis �nica     " +
                                                  "\n o doxiciclina durante 7 d�as. Marcas reconocidas incluyen Zitromax y Vibramycin. Es fundamental completar el tratamiento  " +
                                                  "\n y tratar tambi�n a la pareja sexual para evitar reinfecci�n. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica en    " +
                                                  "\n antioxidantes, lisina y vitaminas del complejo B. Algunos alimentos clave incluyen yogur natural y leche, ricos en lisina," +
                                                  "\n que inhibe la replicaci�n bacteriana. Frutas como naranja, kiwi y papaya, ricas en vitamina C, que fortalecen el sistema  " +
                                                  "\n inmune, con un aporte del 89% del requerimiento diario por cada 100 gramos. Verduras como espinaca y zanahoria, ricas en  " +
                                                  "\n vitamina A y �cido f�lico, que favorecen la regeneraci�n celular y fortalecen las mucosas, con un aporte del 15% del      " +
                                                  "\n requerimiento diario por cada 100 gramos. Frutos secos como almendras y nueces, ricos en vitamina E y �cidos grasos       " +
                                                  "\n esenciales, que protegen las c�lulas inmunol�gicas, con un aporte del 37% del requerimiento diario por cada 28 gramos.    " +
                                                  "\n Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga   " +
                                                  "\n clamidia ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico      " +
                                                  "\n para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n La meningitis bacteriana es una infecci�n grave que inflama las membranas que rodean el cerebro y la m�dula espinal.      " +
                                                  "\n En la ancianidad, los s�ntomas pueden ser at�picos y presentarse como confusi�n, somnolencia o p�rdida de apetito,        " +
                                                  "\n lo que dificulta su detecci�n temprana. EJERCICIO. Se recomienda actividad f�sica muy ligera durante la fase de           " +
                                                  "\n recuperaci�n, como estiramientos suaves o caminatas cortas en ambientes tranquilos, evitando cualquier esfuerzo que       " +
                                                  "\n pueda aumentar la presi�n intracraneal o la fatiga. HIDRATACI�N. Es fundamental consumir entre 2.5 y 3 litros de agua     " +
                                                  "\n al d�a para mantener el equilibrio de l�quidos, apoyar la funci�n renal y facilitar la eliminaci�n de toxinas. Tambi�n    " +
                                                  "\n se recomienda el consumo de caldos suaves o infusiones tibias para mantener la hidrataci�n sin irritar el sistema         " +
                                                  "\n digestivo. POSIBLE TRATAMIENTO. El tratamiento incluye antibi�ticos intravenosos de amplio espectro como ceftriaxona      " +
                                                  "\n o vancomicina, ajustados seg�n el agente causal identificado. En algunos casos se administra dexametasona como            " +
                                                  "\n antiinflamatorio adyuvante para reducir el riesgo de da�o neurol�gico. Es crucial iniciar el tratamiento lo antes posible " +
                                                  "\n para evitar complicaciones graves. ALIMENTACI�N RECOMENDADA. Consumir alimentos ricos en vitaminas del complejo B,        " +
                                                  "\n antioxidantes y prote�nas para apoyar la recuperaci�n neurol�gica. Huevo cocido, fuente de vitamina B12 y colina,         " +
                                                  "\n esenciales para la funci�n cerebral. Espinaca, rica en �cido f�lico y hierro, que favorecen la oxigenaci�n cerebral,      " +
                                                  "\n aportando hasta el 20% del requerimiento diario de hierro por cada 100 g. Frutas como pl�tano y manzana, que aportan      " +
                                                  "\n potasio y fibra soluble, ayudando a mantener el equilibrio electrol�tico y la digesti�n. Yogur natural, fuente de         " +
                                                  "\n probi�ticos que fortalecen la flora intestinal y el sistema inmune. Este es solo un diagn�stico predeterminado l�gico,      " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas  " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el       " +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le     " +
                                                  "\n recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n El c�ncer es un conjunto de enfermedades caracterizadas por el crecimiento descontrolado de c�lulas anormales que pueden     " +
                                                  "\n invadir tejidos y �rganos. En la ancianidad, el tratamiento debe adaptarse a la condici�n f�sica general, comorbilidades     " +
                                                  "\n y tipo de c�ncer. EJERCICIO. Se recomienda actividad f�sica moderada y personalizada, como caminatas, ejercicios de          " +
                                                  "\n resistencia con bandas el�sticas o yoga suave, que ayudan a mantener la masa muscular, mejorar el estado de �nimo y          " +
                                                  "\n reducir la fatiga asociada al tratamiento. HIDRATACI�N. Es fundamental consumir entre 2.5 y 3 litros de agua al d�a para     " +
                                                  "\n apoyar la funci�n renal, especialmente durante la quimioterapia o radioterapia, y facilitar la eliminaci�n de toxinas.       " +
                                                  "\n Tambi�n se recomienda el consumo de l�quidos ricos en electrolitos si hay v�mitos o diarrea. POSIBLE TRATAMIENTO. El         " +
                                                  "\n tratamiento puede incluir cirug�a, quimioterapia, radioterapia, inmunoterapia o terapia hormonal, dependiendo del tipo       " +
                                                  "\n y estadio del c�ncer. En adultos mayores, se prioriza un enfoque individualizado que equilibre eficacia y calidad de vida.   " + 
                                                  "\n Medicamentos como letrozol, capecitabina o pembrolizumab pueden ser considerados seg�n el caso. ALIMENTACI�N RECOMENDADA.    " +
                                                  "\n Consumir alimentos ricos en antioxidantes, prote�nas y vitaminas para fortalecer el sistema inmunol�gico y prevenir la       " +
                                                  "\n p�rdida de peso. Frutas como papaya y guayaba, ricas en vitamina C, que fortalecen las defensas, aportando hasta el 200%     " +
                                                  "\n del requerimiento diario por cada 100 g. Carnes magras y huevos, fuentes de prote�nas de alta calidad, esenciales para       " +
                                                  "\n la regeneraci�n celular. Verduras como br�coli y zanahoria, ricas en vitamina A, �cido f�lico y antioxidantes. Yogur         " +
                                                  "\n natural, fuente de probi�ticos que mejoran la flora intestinal y la absorci�n de nutrientes. Este es solo un diagn�stico     " + 
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la        " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer  " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le         " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida)        " +
                                                  "\n y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.50-1.75 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n La influenza es una infecci�n viral respiratoria que puede causar fiebre, tos, dolor muscular, fatiga y complicaciones     " +
                                                  "\n graves en personas mayores debido al debilitamiento del sistema inmunol�gico. EJERCICIO. Se recomienda actividad f�sica    " +
                                                  "\n ligera y controlada, como caminatas suaves o ejercicios de respiraci�n, que ayudan a mantener la movilidad, mejorar la     " + 
                                                  "\n oxigenaci�n y reducir el riesgo de complicaciones respiratorias. Es importante evitar el esfuerzo excesivo durante la      " +
                                                  "\n fase aguda de la enfermedad. HIDRATACI�N. Es fundamental consumir entre 2.5 y 3 litros de agua al d�a para mantener las    " +
                                                  "\n mucosas hidratadas, facilitar la eliminaci�n de secreciones y apoyar la funci�n inmunol�gica. Tambi�n se recomienda el     " +
                                                  "\n consumo de l�quidos tibios como infusiones de jengibre o caldos suaves. POSIBLE TRATAMIENTO. El tratamiento puede incluir  " +
                                                  "\n antivirales como oseltamivir o zanamivir, especialmente si se administran en las primeras 48 horas desde el inicio de los  " +
                                                  "\n s�ntomas. Tambi�n se utilizan medicamentos como paracetamol para reducir la fiebre y aliviar el malestar general. Es       " +
                                                  "\n esencial el reposo, el aislamiento y el monitoreo de signos de complicaciones como dificultad respiratoria. ALIMENTACI�N   " +
                                                  "\n RECOMENDADA. Consumir alimentos que fortalezcan el sistema inmunol�gico y ayuden a la recuperaci�n. Frutas c�tricas como   " +
                                                  "\n naranja y toronja, ricas en vitamina C, que fortalecen las defensas, aportando hasta el 89% del requerimiento diario por   " +
                                                  "\n cada 100 g. Papaya, rica en vitamina A y C, que favorece la regeneraci�n celular y la respuesta inmune. Verduras como      " +
                                                  "\n espinaca y br�coli, ricas en hierro, �cido f�lico y antioxidantes. Yogur natural, fuente de probi�ticos que mejoran la     " +
                                                  "\n flora intestinal. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el        " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda       " +
                                                  "\n hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s   " +
                                                  "\n por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico,        " +
                                                  "\n �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n La neumon�a es una infecci�n pulmonar que inflama los alv�olos y puede llenarlos de l�quido o pus, dificultando la           " +
                                                  "\n respiraci�n. En la ancianidad, puede presentarse con s�ntomas at�picos como debilidad, confusi�n o p�rdida de apetito.       " +
                                                  "\n EJERCICIO. Se recomienda actividad f�sica muy ligera durante la recuperaci�n, como ejercicios respiratorios o caminatas      " +
                                                  "\n cortas, que ayudan a mejorar la capacidad pulmonar y prevenir la p�rdida de masa muscular. HIDRATACI�N. Es fundamental       " +
                                                  "\n consumir entre 2.5 y 3 litros de agua al d�a para mantener las v�as respiratorias hidratadas, facilitar la eliminaci�n       " + 
                                                  "\n de secreciones y apoyar la funci�n renal. Tambi�n se sugiere el consumo de caldos tibios o infusiones suaves. POSIBLE        " +
                                                  "\n TRATAMIENTO. El tratamiento incluye antibi�ticos como amoxicilina con �cido clavul�nico, ceftriaxona o levofloxacino,        " +
                                                  "\n dependiendo del agente causal. En casos graves, puede requerirse hospitalizaci�n y oxigenoterapia. Es importante iniciar     " +  
                                                  "\n el tratamiento lo antes posible para evitar complicaciones. ALIMENTACI�N RECOMENDADA. Consumir alimentos ricos en            " +
                                                  "\n prote�nas, vitaminas y antioxidantes. Huevos y carnes magras, fuentes de prote�nas de alta calidad. Frutas como guayaba      " +
                                                  "\n y kiwi, ricas en vitamina C, que fortalecen el sistema inmune, aportando hasta el 200% del requerimiento diario por cada     " +
                                                  "\n 100 g. Verduras como zanahoria y espinaca, ricas en vitamina A, hierro y �cido f�lico. Yogur natural, fuente de probi�ticos  " +
                                                  "\n que mejoran la flora intestinal. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza       " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello     " +
                                                  "\n se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su     " +
                                                  "\n paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar   " +
                                                  "\n a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n La diabetes es una enfermedad cr�nica que afecta la forma en que el cuerpo utiliza la glucosa, y en la ancianidad puede      " +
                                                  "\n estar acompa�ada de otras condiciones como hipertensi�n o deterioro cognitivo. EJERCICIO. Se recomienda actividad f�sica     " +
                                                  "\n moderada y constante, como caminatas, ejercicios de resistencia con bandas o yoga suave, que ayudan a mejorar la             " +
                                                  "\n sensibilidad a la insulina, controlar el peso y mantener la movilidad. HIDRATACI�N. Es fundamental consumir entre            " +
                                                  "\n 2 y 2.5 litros de agua al d�a para evitar la deshidrataci�n, apoyar la funci�n renal y facilitar la eliminaci�n de           " +
                                                  "\n glucosa por la orina. POSIBLE TRATAMIENTO. El tratamiento puede incluir medicamentos orales como metformina, inhibidores     " +
                                                  "\n de DPP-4 como sitagliptina o inhibidores de SGLT2 como dapagliflozina. En algunos casos se requiere insulina. Es esencial    " +
                                                  "\n el monitoreo regular de la glucosa y la adaptaci�n del tratamiento a la condici�n f�sica del paciente. ALIMENTACI�N          " +
                                                  "\n RECOMENDADA. Consumir alimentos con bajo �ndice gluc�mico, ricos en fibra, antioxidantes y nutrientes esenciales. Avena      " +
                                                  "\n y legumbres, que ayudan a controlar los niveles de glucosa. Frutas como manzana y pera, ricas en fibra soluble y vitamina C, " +
                                                  "\n aportando cerca del 70% del requerimiento diario por cada 100 g. Verduras como br�coli y espinaca, ricas en magnesio,        " +
                                                  "\n �cido f�lico y antioxidantes. Yogur natural sin az�car, fuente de probi�ticos que mejoran la digesti�n y el metabolismo.     " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa         " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico" +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta " +
                                                  "\n del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita  " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n EJERCICIO: La actividad f�sica moderada es esencial para mejorar la capacidad pulmonar y reducir los s�ntomas del    " +
                                                  "\n asma en personas mayores. Se recomienda realizar caminatas suaves de 20 a 30 minutos al d�a, ejercicios de           " +
                                                  "\n respiraci�n diafragm�tica y estiramientos para fortalecer los m�sculos respiratorios. Tambi�n es �til practicar      " +
                                                  "\n ejercicios acu�ticos o yoga adaptado, que ayudan a mantener la movilidad sin generar fatiga excesiva. HIDRATACI�N:   " +
                                                  "\n Es fundamental consumir entre 2 y 2.5 litros de agua al d�a para mantener las v�as respiratorias hidratadas,         " +
                                                  "\n facilitar la eliminaci�n de secreciones y reducir la inflamaci�n bronquial. Tambi�n se recomienda el consumo de      " +
                                                  "\n infusiones como t� de tomillo o manzanilla, que poseen propiedades expectorantes y calmantes. POSIBLE TRATAMIENTO:   " +
                                                  "\n El tratamiento del asma incluye broncodilatadores de acci�n corta como el salbutamol para aliviar los s�ntomas       " +
                                                  "\n agudos, y corticosteroides inhalados como la fluticasona o budesonida para el control a largo plazo. En personas     " +
                                                  "\n mayores, es importante revisar la t�cnica de inhalaci�n y ajustar las dosis para evitar efectos secundarios.         " +
                                                  "\n Tambi�n pueden utilizarse antileucotrienos como el montelukast en casos de asma persistente. ALIMENTACI�N: Se        " +
                                                  "\n recomienda el consumo de alimentos con propiedades antiinflamatorias y antioxidantes, tales como pescados grasos     " +
                                                  "\n como salm�n y sardinas, que aportan �cidos grasos Omega-3 en un 70% de la ingesta diaria recomendada, ayudando a     " +
                                                  "\n reducir la inflamaci�n de las v�as respiratorias. Frutas como fresas y ar�ndanos, que contienen vitamina C y         " +
                                                  "\n antioxidantes en un 89% de la ingesta diaria recomendada, fortaleciendo el sistema inmunol�gico. Verduras como       " +
                                                  "\n espinacas y br�coli, que aportan vitamina A y K en un 50% de la ingesta diaria recomendada, esenciales para la       " +
                                                  "\n salud pulmonar. este es solo un diagn�stico predeterminado l�gico. haberlo consultado no garantiza al 100% que       " +
                                                  "\n la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar m�s     " +
                                                  "\n de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la respuesta del         " +
                                                  "\n diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a       " +
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n EJERCICIO: La actividad f�sica regular es clave para mantener la salud cardiovascular, muscular y emocional en            " +
                                                  "\n personas mayores con VIH. Se recomienda realizar ejercicios aer�bicos moderados como caminatas de 30 minutos,             " +
                                                  "\n tres a cinco veces por semana, combinados con ejercicios de fuerza y flexibilidad. Tambi�n es beneficioso incluir         " +
                                                  "\n ejercicios de equilibrio para prevenir ca�das. HIDRATACI�N: Es esencial consumir al menos 2.5 litros de agua al           " +
                                                  "\n d�a para apoyar la funci�n renal, especialmente durante el tratamiento antirretroviral. Tambi�n se recomienda el          " + 
                                                  "\n consumo de infusiones suaves como t� de rooibos o manzanilla, que ayudan a reducir el estr�s oxidativo y mejorar          " +
                                                  "\n la digesti�n. POSIBLE TRATAMIENTO: El tratamiento del VIH se basa en la terapia antirretroviral (TAR), que incluye        " +
                                                  "\n combinaciones de medicamentos como tenofovir, emtricitabina, dolutegravir o efavirenz. En personas mayores, es            " +
                                                  "\n fundamental monitorear posibles interacciones con otros medicamentos y ajustar las dosis seg�n la funci�n hep�tica        " +
                                                  "\n y renal. El seguimiento m�dico regular y la adherencia estricta al tratamiento son claves para mantener la carga          " +
                                                  "\n viral indetectable. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes, prote�nas y               " +
                                                  "\n micronutrientes para fortalecer el sistema inmunol�gico, tales como frutas como kiwi y papaya, que aportan vitamina C     " +
                                                  "\n en un 90% de la ingesta diaria recomendada. Legumbres como lentejas y garbanzos, que contienen hierro y zinc,             " +
                                                  "\n esenciales para la producci�n de gl�bulos blancos. Verduras como zanahorias y espinacas, que aportan vitamina A y         " +
                                                  "\n �cido f�lico en un 50% de la ingesta diaria recomendada. Frutos secos como almendras y nueces, que contienen vitamina E   " +
                                                  "\n y selenio, contribuyendo con hasta un 40% de la ingesta diaria recomendada de estos antioxidantes. este es solo un        " +
                                                  "\n diagn�stico predeterminado l�gico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni       " +
                                                  "\n que las respuestas sean completamente correctas. se recomienda realizar m�s de un diagn�stico para mayor seguridad en     " +
                                                  "\n el tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda    " +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n EJERCICIO: Durante el tratamiento de la gonorrea se recomienda evitar la actividad f�sica intensa y priorizar el descanso,      " +
                                                  "\n ya que el cuerpo necesita conservar energ�a para combatir la infecci�n. Una vez finalizado el tratamiento y con autorizaci�n    " +
                                                  "\n m�dica, se pueden retomar ejercicios suaves como caminatas o estiramientos para mejorar la circulaci�n y el bienestar           " +
                                                  "\n general. HIDRATACI�N: Es fundamental consumir al menos 2.5 litros de agua al d�a para ayudar a eliminar toxinas, mantener       " +  
                                                  "\n la salud del tracto urinario y favorecer la recuperaci�n. Tambi�n se recomienda el consumo de infusiones como t� de equin�cea   " +
                                                  "\n o ar�ndano rojo, que poseen propiedades antibacterianas y fortalecen el sistema inmunol�gico. POSIBLE TRATAMIENTO: El           " +
                                                  "\n tratamiento de la gonorrea incluye antibi�ticos como ceftriaxona en dosis �nica intramuscular, combinada con azitromicina       " +
                                                  "\n por v�a oral. En casos de resistencia bacteriana, puede ser necesario prolongar el tratamiento o utilizar combinaciones         " +
                                                  "\n alternativas como gentamicina o doxiciclina. Es fundamental que la pareja tambi�n reciba tratamiento y se eviten relaciones     " +
                                                  "\n sexuales hasta completar la terapia. ALIMENTACI�N: Se recomienda el consumo de alimentos que fortalezcan el sistema             " +
                                                  "\n inmunol�gico y favorezcan la eliminaci�n de bacterias, tales como frutas c�tricas como naranjas y toronjas, que aportan         " +
                                                  "\n vitamina C en un 89% de la ingesta diaria recomendada. Yogur natural, que contiene probi�ticos que equilibran la flora          " +
                                                  "\n vaginal y fortalecen las defensas. Verduras como br�coli y zanahorias, que aportan vitamina A y antioxidantes en un 50%         " +
                                                  "\n de la ingesta diaria recomendada. Ajo y cebolla, que contienen compuestos sulfurados con propiedades antimicrobianas,           " +
                                                  "\n contribuyendo con hasta un 40% de la ingesta diaria recomendada de estos nutrientes. este es solo un diagn�stico predeterminado " +
                                                  "\n l�gico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente  " +
                                                  "\n correctas. se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud,  " +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu       " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: Para el tratamiento del herpes genital es fundamental mantener una hidrataci�n adecuada con un consumo diario      " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a la eliminaci�n de            " +
                                                  "\n toxinas y mantener el equilibrio del sistema inmunol�gico. EJERCICIO: Se recomienda actividad f�sica ligera como caminatas      " +
                                                  "\n suaves ejercicios de estiramiento o yoga adaptado para reducir el estr�s que puede desencadenar brotes y fortalecer la          " +
                                                  "\n circulaci�n sin comprometer el sistema inmunol�gico. POSIBLE TRATAMIENTO: El tratamiento suele incluir antivirales como el      " +
                                                  "\n aciclovir el famciclovir o el valaciclovir durante 7 a 10 d�as en su primera aparici�n y en brotes recurrentes por per�odos     " +
                                                  "\n m�s cortos adem�s en casos frecuentes se puede indicar tratamiento supresivo prolongado con antivirales orales y en             " +
                                                  "\n situaciones graves hospitalizaci�n con antivirales intravenosos tambi�n pueden utilizarse cremas anest�sicas como lidoca�na     " +
                                                  "\n para aliviar el dolor local. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunol�gico se recomienda el consumo de        " +
                                                  "\n FRUTOS ROJOS: Ricos en antioxidantes y vitamina C que ayudan a combatir infecciones virales aportando aproximadamente el 70%    " +
                                                  "\n de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Con propiedades antiinflamatorias que pueden aliviar la         " +
                                                  "\n inflamaci�n local. ESPINACAS Y BR�COLI: Aportan antioxidantes y vitamina A esenciales para la regeneraci�n celular con un       " +
                                                  "\n contenido de aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos   " +
                                                  "\n que fortalecen el sistema inmunol�gico y mejoran la salud digestiva aportando calcio y prote�nas esenciales. Este es solo un    " +
                                                  "\n diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las      " +
                                                  "\n respuestas sean completamente correctas para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor    " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del     " +
                                                  "\n todo se le recomienda mucho consultar a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la s�filis es fundamental mantener una hidrataci�n adecuada con un consumo diario         " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para facilitar la eliminaci�n de         " +
                                                  "\n toxinas y apoyar el sistema inmunol�gico durante el tratamiento antibi�tico. EJERCICIO: Se recomienda actividad f�sica        " +
                                                  "\n ligera como caminatas lentas ejercicios de movilidad articular y estiramientos suaves para mantener la circulaci�n activa     " +
                                                  "\n sin comprometer la recuperaci�n especialmente en fases avanzadas. POSIBLE TRATAMIENTO: El tratamiento suele incluir           " +
                                                  "\n antibi�ticos como la penicilina G benzatina en dosis �nica de 2.4 millones de unidades intramuscular para fases tempranas     " +
                                                  "\n o en ciclos prolongados para fases avanzadas en caso de alergia a la penicilina se puede utilizar doxiciclina o ceftriaxona   " +
                                                  "\n seg�n indicaci�n m�dica es fundamental completar el tratamiento y realizar seguimiento cl�nico. ALIMENTOS RECOMENDADOS:       " +
                                                  "\n Para fortalecer el sistema inmunol�gico se recomienda el consumo de FRUTOS ROJOS: Ricos en antioxidantes y vitamina C que     " +
                                                  "\n ayudan a combatir infecciones bacterianas aportando aproximadamente el 70% de la ingesta diaria recomendada por cada 100      " +
                                                  "\n gramos. JENGIBRE: Con propiedades antiinflamatorias que pueden ayudar a reducir la inflamaci�n. ESPINACAS Y BR�COLI: Aportan  " +
                                                  "\n antioxidantes y vitamina A esenciales para la regeneraci�n celular con un contenido de aproximadamente el 56% de la ingesta   " +
                                                  "\n diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos que fortalecen el sistema inmunol�gico y mejoran  " +
                                                  "\n la salud digestiva aportando calcio y prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico haberlo         " + 
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas      " +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de  " +
                                                  "\n su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a   " +
                                                  "\n su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la tuberculosis es fundamental mantener una hidrataci�n adecuada con un consumo        " +
                                                  "\n diario recomendado de 2.5 litros de agua aproximadamente 10 vasos de tama�o regular para ayudar a fluidificar las          " +
                                                  "\n secreciones pulmonares y facilitar su expulsi�n. EJERCICIO: Se recomienda actividad f�sica ligera como caminatas           " +
                                                  "\n lentas ejercicios de respiraci�n profunda y estiramientos suaves para mejorar la oxigenaci�n y la capacidad pulmonar       " +
                                                  "\n evitando esfuerzos intensos durante el tratamiento activo. POSIBLE TRATAMIENTO: El tratamiento suele incluir una           " +
                                                  "\n combinaci�n de antibi�ticos como isoniazida rifampicina pirazinamida y etambutol durante un m�nimo de 6 meses bajo         " +
                                                  "\n estricta supervisi�n m�dica en casos de tuberculosis resistente o diseminada puede requerirse hospitalizaci�n y ajustes    " +
                                                  "\n terap�uticos. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunol�gico y apoyar la recuperaci�n se recomienda el    " +
                                                  "\n consumo de H�GADO DE RES: Rico en hierro y vitamina A que ayuda a combatir la anemia y fortalecer la inmunidad aportando   " +
                                                  "\n m�s del 100% de la ingesta diaria recomendada por cada 100 gramos. FRUTAS C�TRICAS: Como naranja y toronja ricas en        " +
                                                  "\n vitamina C que favorece la absorci�n de hierro y combate infecciones aportando aproximadamente el 89% de la ingesta diaria " +
                                                  "\n recomendada por cada 100 gramos. ESPINACAS Y BR�COLI: Aportan antioxidantes hierro y vitamina A esenciales para la         " +
                                                  "\n regeneraci�n celular con un contenido de aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos.      " +
                                                  "\n YOGUR NATURAL: Contiene probi�ticos que fortalecen el sistema inmunol�gico y mejoran la salud digestiva aportando calcio   " +
                                                  "\n y prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100% que el   " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer m�s de un  " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s por su salud si la " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico Angel L Montes agradece tu " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2 a 2.5 litros de agua al d�a para mantener la lubricaci�n de las articulaciones,    " +
                                                  "\n facilitar la eliminaci�n de toxinas y mejorar la circulaci�n. En mujeres en etapa de ancianidad, una hidrataci�n constante    " +
                                                  "\n tambi�n ayuda a prevenir la rigidez matutina y la fatiga asociada a la inflamaci�n cr�nica. EJERCICIO: Actividad f�sica de    " +
                                                  "\n bajo impacto como nataci�n, yoga suave, caminatas cortas y ejercicios de movilidad articular puede mejorar la flexibilidad,   " +
                                                  "\n reducir el dolor y fortalecer los m�sculos que rodean las articulaciones. Tambi�n se recomienda realizar ejercicios de        " +
                                                  "\n estiramiento diario, con apoyo si es necesario, para mantener la autonom�a funcional y prevenir la p�rdida de masa muscular.  " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento incluye analg�sicos como Paracetamol, antiinflamatorios no esteroideos (AINEs) como       " +
                                                  "\n Ibuprofeno o Naproxeno, y en casos m�s avanzados, corticosteroides o f�rmacos modificadores de la enfermedad (FAMEs) como     " + 
                                                  "\n Metotrexato. En mujeres mayores, se debe ajustar la dosis seg�n la funci�n renal y hep�tica, y vigilar efectos adversos       " +
                                                  "\n gastrointestinales o cardiovasculares. Tambi�n se puede considerar el uso de agentes biol�gicos bajo supervisi�n reumatol�gica. " +
                                                  "\n ALIMENTACI�N: Se recomienda una dieta antiinflamatoria rica en: Jengibre (con compuestos antiinflamatorios naturales);      " +
                                                  "\n C�rcuma (con curcumina, antioxidante potente); Pescados grasos (salm�n, at�n), con Omega-3, 50% por cada 100 g; Frutas      " +
                                                  "\n rojas (ar�ndanos, fresas), con antocianinas y vitamina C, 89% por cada 100 g; y Espinacas (con vitamina A y magnesio, 56%   " +
                                                  "\n y 20% respectivamente por cada 100 g). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza   " +
                                                  "\n al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda  " +
                                                  "\n realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Adem�s, por su salud, " +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu   " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 litros de agua al d�a, incluyendo infusiones calientes con jengibre     " +
                                                  "\n o miel para aliviar la tos y mantener las v�as respiratorias hidratadas. En mujeres mayores, una hidrataci�n         " +
                                                  "\n adecuada tambi�n ayuda a prevenir la sequedad de mucosas y facilita la expectoraci�n. EJERCICIO: Durante la fase     " +
                                                  "\n aguda se recomienda reposo absoluto. Una vez superada la etapa cr�tica, se puede retomar ejercicios respiratorios,   " +
                                                  "\n caminatas suaves y movimientos de expansi�n tor�cica para mejorar la oxigenaci�n y reducir la fatiga. Tambi�n se     " +
                                                  "\n sugiere el uso de humidificadores y evitar ambientes con humo o polvo. POSIBLE TRATAMIENTO: El tratamiento incluye   " +
                                                  "\n antibi�ticos como Azitromicina, Claritromicina o Eritromicina, que deben iniciarse en los primeros d�as para reducir " +
                                                  "\n la duraci�n y severidad de la enfermedad. En mujeres mayores, se debe ajustar la dosis seg�n la funci�n renal y      " +
                                                  "\n monitorear signos de complicaciones respiratorias. Tambi�n se recomienda el uso de oxigenoterapia en casos de        " +
                                                  "\n dificultad respiratoria y rehabilitaci�n pulmonar si hay secuelas. ALIMENTACI�N: Se sugiere una dieta rica en        " +
                                                  "\n nutrientes que fortalezcan el sistema respiratorio como: Kiwi (con vitamina C, 92% por cada 100 g); Miel (con        " +
                                                  "\n propiedades antibacterianas y antiinflamatorias); Jengibre (con compuestos expectorantes y antiinflamatorios);       " +
                                                  "\n Zanahorias (con vitamina A, 93% por cada 100 g); y Yogur natural (con probi�ticos y calcio, 30% por cada 100 g).     " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga     " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un      " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la       " +
                                                  "\n respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece     " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 litros de agua al d�a para mantener la funci�n renal, reducir la fiebre     " +
                                                  "\n y aliviar la inflamaci�n de las gl�ndulas salivales. Tambi�n se sugiere el uso de infusiones suaves y caldos tibios      " +
                                                  "\n para facilitar la degluci�n y mantener el confort. EJERCICIO: Durante la fase aguda se recomienda reposo absoluto.       " +
                                                  "\n Una vez que la fiebre y la inflamaci�n disminuyen, se puede retomar actividad f�sica ligera como estiramientos suaves,   " +
                                                  "\n ejercicios de cuello y caminatas cortas para mejorar la circulaci�n y prevenir la rigidez muscular. Se debe evitar el    " +
                                                  "\n esfuerzo f�sico intenso hasta la recuperaci�n completa. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral          " +
                                                  "\n espec�fico. El manejo es sintom�tico e incluye Paracetamol o Ibuprofeno para el dolor y la fiebre, compresas fr�as       " +
                                                  "\n en las gl�ndulas inflamadas y reposo. En mujeres mayores, se debe vigilar la aparici�n de complicaciones como            " +
                                                  "\n meningitis, pancreatitis o inflamaci�n de ovarios. Tambi�n se recomienda el aislamiento durante al menos cinco d�as      " +
                                                  "\n desde el inicio de la inflamaci�n para evitar contagios. ALIMENTACI�N: Se sugiere una dieta blanda y rica en nutrientes  " +
                                                  "\n como: Sopas y pur�s (f�ciles de tragar y nutritivos); Frutas c�tricas (con vitamina C, 89% por cada 100 g); Aguacate     " +
                                                  "\n (con vitamina E, 14% por cada 100 g); Zanahorias cocidas (con vitamina A, 93% por cada 100 g); y Yogur natural (con      " +
                                                  "\n probi�ticos y calcio, 30% por cada 100 g). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no      " +
                                                  "\n garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello,   " +
                                                  "\n se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado.      " +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.     " +
                                                  "\n �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una       " +
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO.       " +
                                                  "\n Se recomienda actividad f�sica ligera como caminatas suaves de 15 a 20 minutos al d�a, ejercicios de respiraci�n            " +
                                                  "\n profunda y estiramientos suaves para mantener la circulaci�n activa, reducir el estr�s y fortalecer el sistema              " +
                                                  "\n inmunol�gico. Tambi�n es �til realizar ejercicios de equilibrio y movilidad para prevenir ca�das y mejorar la coordinaci�n. " +
                                                  "\n HIDRATACI�N. Se aconseja consumir entre 2.5 y 3 litros de agua al d�a para prevenir la deshidrataci�n causada por fiebre,   " +
                                                  "\n sudoraci�n y p�rdida de apetito. Tambi�n se recomienda el consumo de infusiones suaves como manzanilla o t� verde, as�      " +
                                                  "\n como caldos naturales y jugos c�tricos sin az�car a�adida para mantener el equilibrio de electrolitos. POSIBLE TRATAMIENTO. " +
                                                  "\n No existe un tratamiento antiviral espec�fico para el Zika. El manejo se basa en aliviar los s�ntomas con reposo,           " +
                                                  "\n hidrataci�n y medicamentos como paracetamol (Tempra) para reducir fiebre y dolor. No se recomienda el uso de                " +
                                                  "\n antiinflamatorios no esteroides como ibuprofeno hasta descartar dengue. En algunos casos se pueden usar antihistam�nicos    " +
                                                  "\n para aliviar el sarpullido y la picaz�n. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica en antioxidantes,           " +
                                                  "\n vitamina C y compuestos antiinflamatorios. Algunos alimentos clave incluyen frutas c�tricas como naranja, toronja y kiwi,   " +
                                                  "\n ricas en vitamina C, que fortalecen el sistema inmune, aportando el 89% del requerimiento diario por cada 100 gramos.       " +
                                                  "\n Verduras como espinaca y br�coli, ricas en vitamina A y �cido f�lico, que ayudan a la regeneraci�n celular y fortalecen     " +
                                                  "\n las mucosas, con un aporte del 15% del requerimiento diario por cada 100 gramos. Frutos secos como almendras y nueces,      " + 
                                                  "\n ricos en vitamina E y �cidos grasos esenciales, que protegen las c�lulas inmunol�gicas, con un aporte del 37% del           " +
                                                  "\n requerimiento diario por cada 28 gramos. Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero       " +
                                                  "\n no garantiza al 100% que el paciente tenga Zika ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un     " +
                                                  "\n diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera     " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener     " +
                                                  "\n una hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales.        " +
                                                  "\n EJERCICIO. Durante la fase aguda se recomienda reposo absoluto para evitar complicaciones gastrointestinales.         " +
                                                  "\n Una vez superada esta etapa, se pueden incorporar caminatas suaves de 10 a 15 minutos al d�a, ejercicios de           " +
                                                  "\n movilidad articular y respiraci�n profunda para estimular la circulaci�n y la recuperaci�n intestinal. Tambi�n        " +
                                                  "\n es �til realizar estiramientos suaves para reducir la rigidez muscular. HIDRATACI�N. Se aconseja consumir entre       " +
                                                  "\n 2.5 y 3 litros de agua al d�a para prevenir la deshidrataci�n causada por diarrea y v�mito. Tambi�n se recomienda     " +
                                                  "\n el uso de soluciones de rehidrataci�n oral, caldos naturales y jugos suaves sin az�car a�adida. Se deben evitar       " +
                                                  "\n bebidas con cafe�na, alcohol o alto contenido de az�car, ya que pueden empeorar los s�ntomas. POSIBLE TRATAMIENTO.    " +
                                                  "\n No existe un tratamiento antiviral espec�fico para el rotavirus. El manejo se basa en la rehidrataci�n, el control    " +
                                                  "\n de la fiebre con paracetamol (Tempra) y el reposo. En casos severos puede requerirse hidrataci�n intravenosa. No se   " +
                                                  "\n recomienda el uso de antidiarreicos como loperamida. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta blanda, baja   " +
                                                  "\n en fibra y rica en nutrientes esenciales. Algunos alimentos clave incluyen arroz blanco y pur� de papa, que son       " +
                                                  "\n f�ciles de digerir y ayudan a estabilizar el sistema digestivo. Yogur natural, fuente de probi�ticos que ayudan a     " +
                                                  "\n restaurar la flora intestinal. Pl�tano, rico en potasio, que ayuda a reponer electrolitos perdidos, aportando el 10%  " +
                                                  "\n del requerimiento diario por cada 100 gramos. Zanahoria cocida, rica en vitamina A, que fortalece las mucosas         " +
                                                  "\n intestinales, con un aporte del 15% del requerimiento diario por cada 100 gramos. Este diagn�stico es una referencia  " +
                                                  "\n l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga rotavirus ni que el tratamiento  " +
                                                  "\n sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para mayor seguridad. Angel L   " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener       " +
                                                  "\n una hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales.          " +
                                                  "\n EJERCICIO. Durante la fase aguda se recomienda reposo absoluto. Una vez estabilizada, se pueden incorporar caminatas    " +
                                                  "\n suaves de 10 a 15 minutos al d�a, ejercicios de respiraci�n profunda y estiramientos para mejorar la circulaci�n,       " +
                                                  "\n reducir la rigidez muscular y apoyar la recuperaci�n neurol�gica. Tambi�n es �til realizar ejercicios de equilibrio     " +
                                                  "\n y coordinaci�n para prevenir ca�das. HIDRATACI�N. Se aconseja consumir entre 2.5 y 3 litros de agua al d�a para         " +
                                                  "\n mantener el equilibrio de l�quidos, facilitar la eliminaci�n de toxinas y apoyar la funci�n renal durante el            " +
                                                  "\n tratamiento antibi�tico. Tambi�n se recomienda el consumo de caldos naturales, infusiones suaves y jugos naturales      " +
                                                  "\n ricos en vitamina C. POSIBLE TRATAMIENTO. El tratamiento para la listeriosis incluye antibi�ticos como ampicilina,      " +
                                                  "\n gentamicina o trimetoprim-sulfametoxazol, dependiendo del caso. Marcas reconocidas incluyen Ampicillin y Bactrim.       " +
                                                  "\n En pacientes mayores se debe ajustar la dosis y monitorear efectos secundarios. Es fundamental iniciar el tratamiento   " +
                                                  "\n lo antes posible para evitar complicaciones neurol�gicas. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica en     " +
                                                  "\n prote�nas, antioxidantes y vitaminas del complejo B. Algunos alimentos clave incluyen carnes magras y pescado, fuentes  " +
                                                  "\n de prote�nas esenciales. Frutas c�tricas como naranja y kiwi, ricas en vitamina C, que fortalecen el sistema inmune,    " +
                                                  "\n aportando el 89% del requerimiento diario por cada 100 gramos. Verduras como espinaca y br�coli, ricas en �cido f�lico  " +
                                                  "\n y vitamina B9, esenciales para la regeneraci�n celular, con un aporte del 15% del requerimiento diario por cada 100     " +
                                                  "\n gramos. Frutos secos como almendras y nueces, ricos en vitamina E y �cidos grasos esenciales, que protegen las c�lulas  " +
                                                  "\n inmunol�gicas y aportan el 37% del requerimiento diario por cada 28 gramos. Este diagn�stico es una referencia l�gica   " +
                                                  "\n basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga listeriosis ni que el tratamiento sea el  " +
                                                  "\n adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n La shigelosis es una infecci�n bacteriana intestinal causada por Shigella, que provoca diarrea, fiebre, dolor     " +
                                                  "\n abdominal y, en casos graves, deshidrataci�n. En la ancianidad, el riesgo de complicaciones aumenta debido a      " +
                                                  "\n la fragilidad del sistema inmunol�gico. EJERCICIO. Se recomienda actividad f�sica ligera como caminatas cortas    " +
                                                  "\n o estiramientos suaves, que ayudan a mantener la circulaci�n y prevenir el deterioro muscular sin comprometer     " + 
                                                  "\n la recuperaci�n. HIDRATACI�N. Es fundamental consumir entre 2.5 y 3 litros de agua al d�a para reponer los        " +
                                                  "\n l�quidos perdidos por la diarrea y evitar la deshidrataci�n. Tambi�n se recomienda el uso de soluciones de        " +
                                                  "\n rehidrataci�n oral con electrolitos como sodio y potasio. POSIBLE TRATAMIENTO. El tratamiento puede incluir       " +
                                                  "\n antibi�ticos como ciprofloxacino o azitromicina, especialmente en casos moderados a graves. Se debe evitar el     " +
                                                  "\n uso de antidiarreicos como la loperamida, ya que pueden empeorar la infecci�n. ALIMENTACI�N RECOMENDADA.          " +
                                                  "\n Consumir alimentos de f�cil digesti�n y ricos en nutrientes esenciales. Pl�tano, rico en potasio, que ayuda a     " +
                                                  "\n reponer electrolitos, aportando aproximadamente el 10% del requerimiento diario por cada 100 g. Arroz blanco,     " +
                                                  "\n fuente de carbohidratos suaves que ayudan a estabilizar el sistema digestivo. Zanahoria, rica en vitamina A y     " +
                                                  "\n antioxidantes, que favorecen la regeneraci�n de la mucosa intestinal, aportando cerca del 15% del requerimiento   " +
                                                  "\n diario de vitamina A por cada 100 g. Manzana, con pectina que regula el tr�nsito intestinal y aporta fibra        " +
                                                  "\n soluble. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el        " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se         " +
                                                  "\n recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado      " +
                                                  "\n de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda     " +
                                                  "\n mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n La EPOC es una afecci�n respiratoria progresiva que dificulta la respiraci�n y puede causar tos cr�nica, producci�n      " +
                                                  "\n de moco y fatiga. En la ancianidad, su manejo requiere un enfoque integral y adaptado a la capacidad funcional del       " +
                                                  "\n paciente. EJERCICIO. Se recomienda actividad f�sica moderada y personalizada, como caminatas suaves, ejercicios de       " +
                                                  "\n respiraci�n profunda y fortalecimiento muscular, que ayudan a mejorar la capacidad pulmonar y reducir la disnea.         " +
                                                  "\n HIDRATACI�N. Es fundamental consumir entre 2 y 3 litros de agua al d�a para mantener las v�as respiratorias hidratadas   " +
                                                  "\n y facilitar la eliminaci�n de mucosidad. Tambi�n se sugiere el consumo de l�quidos tibios como infusiones de jengibre    " +
                                                  "\n o caldos suaves. POSIBLE TRATAMIENTO. El tratamiento incluye broncodilatadores de acci�n prolongada como salmeterol o    " +
                                                  "\n tiotropio, corticosteroides inhalados como fluticasona, y en casos avanzados, oxigenoterapia. Es esencial el seguimiento " +
                                                  "\n m�dico y la adherencia al tratamiento. ALIMENTACI�N RECOMENDADA. Consumir alimentos que fortalezcan el sistema           " +
                                                  "\n respiratorio y reduzcan la inflamaci�n. Pescados grasos como salm�n y at�n, ricos en �cidos grasos Omega-3, que          " +
                                                  "\n poseen propiedades antiinflamatorias, aportando hasta el 90% del requerimiento diario por cada 100 g. Frutas como        " +
                                                  "\n ar�ndanos y fresas, ricas en vitamina C y antioxidantes, que fortalecen el sistema inmune, aportando cerca del 70%       " +
                                                  "\n del requerimiento diario por cada 100 g. Verduras como espinaca y br�coli, ricas en hierro, vitamina A y carotenoides,   " +
                                                  "\n esenciales para la salud pulmonar. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza    " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello    " +
                                                  "\n se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su    " +
                                                  "\n paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar  " +
                                                  "\n a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n La clamidia es una infecci�n bacteriana de transmisi�n sexual causada por Chlamydia trachomatis, que puede afectar el     " +
                                                  "\n tracto genital, rectal o far�ngeo. En mujeres mayores, puede pasar desapercibida o confundirse con otras afecciones,      " +
                                                  "\n aumentando el riesgo de complicaciones. EJERCICIO. Se recomienda actividad f�sica ligera como caminatas o estiramientos   " +
                                                  "\n suaves, evitando esfuerzos intensos durante el tratamiento para no comprometer el sistema inmunol�gico. HIDRATACI�N. Es   " +
                                                  "\n fundamental consumir entre 2 y 2.5 litros de agua al d�a para facilitar la eliminaci�n de toxinas, mantener la funci�n    " +
                                                  "\n renal y apoyar el proceso de recuperaci�n. POSIBLE TRATAMIENTO. El tratamiento de primera l�nea incluye doxiciclina       " +
                                                  "\n 100 mg dos veces al d�a durante 7 d�as o azitromicina 1 g en dosis �nica. En casos de alergia o resistencia, pueden       " +
                                                  "\n utilizarse alternativas como levofloxacino o ofloxacino. Es importante tratar tambi�n a las parejas sexuales para evitar  " +
                                                  "\n reinfecci�n. ALIMENTACI�N RECOMENDADA. Consumir alimentos que fortalezcan el sistema inmunol�gico y favorezcan la           " +
                                                  "\n recuperaci�n. Frutas como kiwi y naranja, ricas en vitamina C, que ayudan a combatir infecciones, aportando hasta el 90%    " +
                                                  "\n del requerimiento diario por cada 100 g. Verduras como br�coli y espinaca, ricas en �cido f�lico, hierro y antioxidantes.   " +
                                                  "\n Yogur natural, fuente de probi�ticos que fortalecen la flora intestinal. Carnes magras, ricas en prote�nas necesarias para  " +
                                                  "\n la regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el  " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer  " +
                                                  "\n m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su   " +
                                                  "\n salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, �ngel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n EJERCICIO: Durante la fase aguda de la meningitis bacteriana se recomienda reposo absoluto, ya que el cuerpo necesita         " +
                                                  "\n conservar energ�a para combatir la infecci�n y evitar complicaciones neurol�gicas. Una vez superada la fase cr�tica,          " +
                                                  "\n se pueden realizar ejercicios suaves como caminatas lentas, estiramientos o ejercicios de respiraci�n para mejorar la         " +
                                                  "\n oxigenaci�n cerebral, la movilidad y reducir la rigidez muscular. HIDRATACI�N: Es fundamental consumir al menos 2.5           " +
                                                  "\n litros de agua al d�a para mantener la hidrataci�n, facilitar la eliminaci�n de toxinas y apoyar la funci�n renal,            " +
                                                  "\n especialmente durante el tratamiento con antibi�ticos. Tambi�n se recomienda el consumo de caldos naturales, infusiones       " +
                                                  "\n suaves y jugos sin az�car, que aportan electrolitos esenciales como sodio, potasio y magnesio, ayudando a prevenir la         " +
                                                  "\n deshidrataci�n y el desequilibrio electrol�tico. POSIBLE TRATAMIENTO: El tratamiento de la meningitis bacteriana requiere     " +
                                                  "\n hospitalizaci�n inmediata y administraci�n intravenosa de antibi�ticos como ceftriaxona, cefotaxima o ampicilina,             " +
                                                  "\n dependiendo del agente causal. En casos de infecci�n por Listeria monocytogenes, se utiliza ampicilina combinada con          " +
                                                  "\n gentamicina. Tambi�n se pueden administrar corticosteroides como la dexametasona para reducir la inflamaci�n cerebral         " +
                                                  "\n y prevenir complicaciones como convulsiones o p�rdida auditiva. En pacientes mayores, es esencial monitorear la funci�n       " +
                                                  "\n renal y hep�tica durante el tratamiento. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes,          " +
                                                  "\n vitaminas y minerales para apoyar la recuperaci�n neurol�gica, tales como pescado azul como salm�n y at�n, que contienen      " +
                                                  "\n �cidos grasos Omega-3 con propiedades antiinflamatorias y aportan hasta un 70% de la ingesta diaria recomendada. Frutas       " +
                                                  "\n como fresas y ar�ndanos, que contienen antioxidantes y vitamina C en un 89% de la ingesta diaria recomendada, fortaleciendo   " +
                                                  "\n el sistema inmunol�gico. Verduras como zanahorias y br�coli, que aportan hasta un 50% de la ingesta diaria recomendada de     " +
                                                  "\n vitamina A y K, esenciales para la funci�n cerebral. Frutos secos como almendras y nueces, que contienen vitamina E y         " +
                                                  "\n magnesio, contribuyendo con hasta un 40% de la ingesta diaria recomendada de estos nutrientes esenciales para la recuperaci�n " +
                                                  "\n neurol�gica. este es solo un diagn�stico predeterminado l�gico. haberlo consultado no garantiza al 100% que la paciente tenga " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar m�s de un diagn�stico para mayor   " +
                                                  "\n seguridad en el tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se      " +
                                                  "\n recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n EJERCICIO: La actividad f�sica moderada es clave para mejorar la calidad de vida en personas mayores con c�ncer.               " +
                                                  "\n Se recomienda realizar caminatas suaves de 20 a 30 minutos al d�a, ejercicios de estiramiento y respiraci�n profunda           " +
                                                  "\n para reducir la fatiga, mejorar la oxigenaci�n celular y mantener la movilidad. Tambi�n es beneficioso incluir ejercicios      " +
                                                  "\n de equilibrio para prevenir ca�das y fortalecer la musculatura. HIDRATACI�N: Es esencial consumir al menos 2.5 litros de       " +
                                                  "\n agua al d�a para mantener la hidrataci�n, reducir los efectos secundarios de la quimioterapia y facilitar la eliminaci�n       " +
                                                  "\n de toxinas. Tambi�n se recomienda el consumo de infusiones antioxidantes como t� verde o rooibos, y caldos naturales que       " +
                                                  "\n aporten electrolitos y micronutrientes esenciales. Una hidrataci�n adecuada ayuda a prevenir la sequedad de mucosas, la        " +
                                                  "\n fatiga y los trastornos digestivos asociados al tratamiento. POSIBLE TRATAMIENTO: El tratamiento del c�ncer en personas        " +
                                                  "\n mayores debe ser individualizado seg�n el tipo, estadio y estado funcional de la paciente. Puede incluir cirug�a,              " +
                                                  "\n quimioterapia, radioterapia, inmunoterapia o terapias dirigidas. En mujeres mayores, se prioriza la tolerancia al              " +
                                                  "\n tratamiento y la calidad de vida, por lo que se pueden utilizar esquemas menos agresivos o tratamientos hormonales en          " +
                                                  "\n casos de c�ncer hormonodependiente. Es fundamental realizar una evaluaci�n geri�trica integral para ajustar el tratamiento     " +
                                                  "\n a las necesidades espec�ficas. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes, prote�nas y         " +
                                                  "\n micronutrientes para fortalecer el sistema inmunol�gico y apoyar la regeneraci�n celular, tales como frutas c�tricas como      " +
                                                  "\n naranjas y toronjas, que aportan vitamina C en un 89% de la ingesta diaria recomendada. Pescados grasos como salm�n y at�n,    " +
                                                  "\n que contienen �cidos grasos Omega-3 con propiedades antiinflamatorias y aportan hasta un 70% de la ingesta diaria recomendada. " +
                                                  "\n Verduras de hoja verde como espinacas y acelgas, que contienen antioxidantes y vitaminas esenciales para la funci�n celular,   " +
                                                  "\n aportando hasta un 50% de la ingesta diaria recomendada de vitamina A y K. Frutos secos como almendras y nueces, que contienen " +
                                                  "\n vitamina E y magnesio, contribuyendo con hasta un 40% de la ingesta diaria recomendada de estos nutrientes esenciales para la  " +
                                                  "\n regeneraci�n celular. este es solo un diagn�stico predeterminado l�gico. haberlo consultado no garantiza al 100% que la        " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar m�s de un            " +
                                                  "\n diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico no le       " +
                                                  "\n satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que     " +
                                                  "\n te mejores.");
                            }
                        }
                        
                        if(EstaturaFemenino.equals("1.40-1.65 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n EJERCICIO: Durante la infecci�n por influenza se recomienda reposo absoluto, ya que el cuerpo necesita conservar energ�a     " +
                                                  "\n para combatir el virus. Una vez que los s�ntomas disminuyen, se pueden realizar ejercicios suaves como caminatas lentas      " +
                                                  "\n o estiramientos para mejorar la circulaci�n y reducir la rigidez muscular. Tambi�n es �til practicar ejercicios de           " +
                                                  "\n respiraci�n profunda para mejorar la oxigenaci�n pulmonar. HIDRATACI�N: Es fundamental consumir al menos 2.5 litros de       " +
                                                  "\n agua al d�a para mantener las mucosas hidratadas, reducir la fiebre y facilitar la eliminaci�n de toxinas. Tambi�n se        " +
                                                  "\n recomienda el consumo de caldos naturales, infusiones como t� de jengibre o manzanilla y jugos naturales sin az�car, que     " +
                                                  "\n aportan l�quidos, antioxidantes y alivio para la garganta. POSIBLE TRATAMIENTO: El tratamiento de la influenza incluye       " +
                                                  "\n medicamentos antivirales como oseltamivir o zanamivir, que deben iniciarse dentro de las primeras 48 horas desde el inicio   " +
                                                  "\n de los s�ntomas para ser eficaces. Tambi�n se utilizan antipir�ticos como el paracetamol para controlar la fiebre y          " +
                                                  "\n analg�sicos para aliviar el malestar general. En personas mayores, es fundamental evitar el uso de aspirina por el riesgo    " +
                                                  "\n de s�ndrome de Reye y monitorear posibles complicaciones como neumon�a. ALIMENTACI�N: Se recomienda el consumo de alimentos  " +
                                                  "\n ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, tales como frutas c�tricas como      " +
                                                  "\n naranjas y toronjas, que aportan vitamina C en un 89% de la ingesta diaria recomendada. Verduras como zanahorias y espinacas," +
                                                  "\n que contienen vitamina A y K en un 50% de la ingesta diaria recomendada, esenciales para la regeneraci�n celular. Jengibre   " +
                                                  "\n y c�rcuma, que poseen propiedades antiinflamatorias y antioxidantes, contribuyendo con hasta un 40% de la ingesta diaria     " +
                                                  "\n recomendada de compuestos bioactivos beneficiosos para la salud respiratoria. este es solo un diagn�stico predeterminado     " +
                                                  "\n l�gico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente " +
                                                  "\n correctas. se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su        " +
                                                  "\n salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece  " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n EJERCICIO: Durante la fase aguda de la neumon�a se recomienda reposo absoluto para permitir que el cuerpo se recupere.       " +
                                                  "\n Una vez superada la etapa cr�tica, se pueden realizar ejercicios suaves como caminatas lentas, ejercicios de respiraci�n     " +
                                                  "\n profunda y estiramientos para mejorar la capacidad pulmonar, reducir la fatiga y prevenir la p�rdida de masa muscular.       " +
                                                  "\n HIDRATACI�N: Es esencial consumir al menos 2.5 litros de agua al d�a para mantener las v�as respiratorias hidratadas,        " +
                                                  "\n facilitar la expectoraci�n y apoyar la funci�n renal durante el tratamiento con antibi�ticos. Tambi�n se recomienda el       " +
                                                  "\n consumo de caldos naturales, infusiones suaves y jugos sin az�car para aportar l�quidos y micronutrientes esenciales.        " +
                                                  "\n Una hidrataci�n adecuada ayuda a reducir la viscosidad del moco y mejora la oxigenaci�n. POSIBLE TRATAMIENTO: El             " +
                                                  "\n tratamiento de la neumon�a incluye antibi�ticos como amoxicilina, ceftriaxona o levofloxacino, dependiendo del agente        " +
                                                  "\n causal y la gravedad del cuadro. Tambi�n se pueden utilizar antipir�ticos y broncodilatadores si hay dificultad              " +
                                                  "\n respiratoria. En personas mayores, es fundamental monitorear la funci�n respiratoria y renal, y considerar la hospitalizaci�n " +
                                                  "\n si hay signos de descompensaci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes, prote�nas y     " +
                                                  "\n vitaminas para fortalecer el sistema inmunol�gico y apoyar la regeneraci�n pulmonar, tales como frutas como fresas y          " +
                                                  "\n ar�ndanos, que aportan vitamina C en un 89% de la ingesta diaria recomendada. Verduras como br�coli y zanahorias, que         " +
                                                  "\n contienen vitamina A y K en un 50% de la ingesta diaria recomendada, esenciales para la funci�n pulmonar. Pescados grasos     " +
                                                  "\n como salm�n y at�n, que aportan �cidos grasos Omega-3 en un 70% de la ingesta diaria recomendada, con propiedades             " +
                                                  "\n antiinflamatorias. Frutos secos como almendras y nueces, que contienen vitamina E y magnesio, contribuyendo con hasta un 40%  " +
                                                  "\n de la ingesta diaria recomendada de estos nutrientes. este es solo un diagn�stico predeterminado l�gico. haberlo consultado   " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda  " +
                                                  "\n realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la respuesta del     " +
                                                  "\n diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app         " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n EJERCICIO: La actividad f�sica regular es fundamental para el control de la glucosa en sangre y la prevenci�n de       " +
                                                  "\n complicaciones en personas mayores con diabetes. Se recomienda realizar caminatas suaves de 30 minutos al d�a,         " +
                                                  "\n ejercicios de resistencia con bandas el�sticas y ejercicios de equilibrio para prevenir ca�das. Tambi�n es �til        " +
                                                  "\n practicar ejercicios de respiraci�n y estiramientos para mejorar la circulaci�n y reducir el estr�s. HIDRATACI�N:      " +
                                                  "\n Es crucial consumir entre 2 y 2.5 litros de agua al d�a para mantener el equilibrio de l�quidos, prevenir la           " +
                                                  "\n deshidrataci�n y facilitar la eliminaci�n de glucosa a trav�s de la orina. Tambi�n se recomienda el consumo de         " +
                                                  "\n infusiones sin az�car como t� de canela o manzanilla, que pueden ayudar a estabilizar los niveles de glucosa.          " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento de la diabetes tipo 2 en personas mayores incluye cambios en el estilo de vida,    " +
                                                  "\n control nutricional y medicamentos como metformina, inhibidores de DPP-4 o an�logos de GLP-1. En algunos casos, puede  " +
                                                  "\n ser necesario el uso de insulina. Es fundamental individualizar el tratamiento para evitar hipoglucemias y preservar   " +
                                                  "\n la funcionalidad. Tambi�n se recomienda el monitoreo regular de la glucosa y la evaluaci�n de la funci�n renal y       " +
                                                  "\n hep�tica. ALIMENTACI�N: Se recomienda el consumo de alimentos con bajo �ndice gluc�mico y ricos en fibra, vitaminas    " +
                                                  "\n y minerales, tales como legumbres como lentejas y garbanzos, que aportan fibra y prote�nas de alta calidad. Frutas     " +
                                                  "\n como manzanas y peras, que contienen fibra soluble y vitamina C en un 70% de la ingesta diaria recomendada. Verduras     " +
                                                  "\n como espinacas y br�coli, que aportan �cido f�lico, vitamina A y K en un 50% de la ingesta diaria recomendada. Frutos    " +
                                                  "\n secos como nueces y almendras, que contienen magnesio y vitamina E, contribuyendo con hasta un 40% de la ingesta diaria  " +
                                                  "\n recomendada de estos nutrientes esenciales para la salud metab�lica. este es solo un diagn�stico predeterminado l�gico.  " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente   " +
                                                  "\n correctas. se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su  " +
                                                  "\n salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: Para el tratamiento del asma es fundamental mantener una hidrataci�n adecuada con un consumo diario     " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para mantener las v�as          " +
                                                  "\n respiratorias h�medas y facilitar la expulsi�n de mucosidad. EJERCICIO: Se recomienda actividad f�sica ligera y      " +
                                                  "\n controlada como caminatas lentas ejercicios de respiraci�n profunda y estiramientos suaves evitando ambientes        " +
                                                  "\n fr�os o con al�rgenos. Adem�s se sugiere la pr�ctica de ejercicios de relajaci�n como yoga adaptado o tai chi para   " +
                                                  "\n mejorar la capacidad pulmonar y reducir la ansiedad asociada a la dificultad respiratoria. POSIBLE TRATAMIENTO: El   " +
                                                  "\n tratamiento suele incluir broncodilatadores de alivio r�pido como el salbutamol corticosteroides inhalados como la   " +
                                                  "\n fluticasona o budesonida y en algunos casos modificadores de leucotrienos como el montelukast. Es fundamental seguir " +
                                                  "\n el plan de acci�n indicado por el m�dico y utilizar los inhaladores con t�cnica adecuada. ALIMENTOS RECOMENDADOS:    " +
                                                  "\n Para fortalecer el sistema respiratorio se recomienda el consumo de PESCADOS GRASOS: Como el salm�n y el at�n ricos  " +
                                                  "\n en �cidos grasos Omega-3 con propiedades antiinflamatorias que aportan aproximadamente el 50% de la ingesta diaria   " + 
                                                  "\n recomendada por cada 100 gramos. FRUTAS Y VERDURAS DE COLORES VIVOS: Como ar�ndanos fresas espinacas y br�coli ricos " +
                                                  "\n en antioxidantes como la vitamina C y carotenoides que fortalecen el sistema inmunol�gico aportando aproximadamente  " +
                                                  "\n el 70% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Con compuestos antiinflamatorios que pueden   " +
                                                  "\n aliviar la inflamaci�n de las v�as respiratorias. C�RCUMA: Con curcumina que posee propiedades antioxidantes y       " +
                                                  "\n antiinflamatorias. Este es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100% que el  " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer m�s  " +
                                                  "\n de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s por su " +
                                                  "\n salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico Angel L  " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: Para el tratamiento del VIH/SIDA es fundamental mantener una hidrataci�n adecuada con un consumo diario         " +
                                                  "\n recomendado de 2.5 litros de agua aproximadamente 10 vasos de tama�o regular para apoyar la funci�n renal y hep�tica         " +
                                                  "\n durante la terapia antirretroviral. EJERCICIO: Se recomienda actividad f�sica regular y moderada como caminatas nataci�n     " +
                                                  "\n o ejercicios de bajo impacto para mejorar la funci�n cardiovascular mantener la masa muscular y reducir el estr�s.           " +
                                                  "\n Tambi�n se sugiere la pr�ctica de ejercicios de fortalecimiento y movilidad para contrarrestar la p�rdida de densidad        " +
                                                  "\n �sea y mejorar el bienestar general. POSIBLE TRATAMIENTO: El tratamiento se basa en la terapia antirretroviral combinada     " +
                                                  "\n (TAR) que incluye medicamentos como tenofovir emtricitabina dolutegravir o efavirenz seg�n el esquema indicado por el        " +
                                                  "\n m�dico. Es fundamental mantener la adherencia diaria al tratamiento para lograr la supresi�n viral y prevenir complicaciones." +
                                                  "\n ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunol�gico se recomienda el consumo de FRUTAS C�TRICAS: Como naranja    " +
                                                  "\n toronja y guayaba ricas en vitamina C que aportan aproximadamente el 89% de la ingesta diaria recomendada por cada 100       " +
                                                  "\n gramos. H�GADO DE RES: Fuente de hierro y vitamina A que ayuda a combatir la anemia y fortalecer la inmunidad aportando      " +
                                                  "\n m�s del 100% de la ingesta diaria recomendada por cada 100 gramos. ESPINACAS Y BR�COLI: Ricos en antioxidantes hierro y      " +
                                                  "\n vitamina A esenciales para la regeneraci�n celular con un contenido de aproximadamente el 56% de la ingesta diaria           " +
                                                  "\n recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos que fortalecen el sistema inmunol�gico y mejoran la     " +
                                                  "\n salud digestiva aportando calcio y prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico haberlo           " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas     " +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado    " +
                                                  "\n de su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar " +
                                                  "\n a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la gonorrea es fundamental mantener una hidrataci�n adecuada con un consumo diario   " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para facilitar la eliminaci�n de    " +
                                                  "\n toxinas y apoyar el sistema inmunol�gico. EJERCICIO: Se recomienda actividad f�sica ligera como caminatas suaves         " +
                                                  "\n ejercicios de movilidad articular y estiramientos para mejorar la circulaci�n y fortalecer el sistema inmunol�gico       " +
                                                  "\n evitando esfuerzos intensos durante el tratamiento. POSIBLE TRATAMIENTO: El tratamiento suele incluir antibi�ticos       " +
                                                  "\n como la ceftriaxona en combinaci�n con azitromicina o doxiciclina seg�n la indicaci�n m�dica. Es fundamental completar   " +
                                                  "\n el tratamiento y evitar relaciones sexuales hasta que se confirme la curaci�n para prevenir reinfecciones. ALIMENTOS     " +
                                                  "\n RECOMENDADOS: Para fortalecer el sistema inmunol�gico se recomienda el consumo de NARANJAS Y GUAYABAS: Ricas en          " +
                                                  "\n vitamina C que ayudan a combatir infecciones bacterianas aportando aproximadamente el 89% de la ingesta diaria           " +
                                                  "\n recomendada por cada 100 gramos. JENGIBRE: Con propiedades antiinflamatorias que pueden ayudar a reducir la inflamaci�n. " +
                                                  "\n ESPINACAS Y BR�COLI: Aportan antioxidantes y vitamina A esenciales para la regeneraci�n celular con un contenido de      " +
                                                  "\n aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos que     " +
                                                  "\n fortalecen el sistema inmunol�gico y mejoran la salud digestiva aportando calcio y prote�nas esenciales. Este es solo    " +
                                                  "\n un diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni    " +
                                                  "\n que las respuestas sean completamente correctas para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para      " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s por su salud si la respuesta del Diagn�stico " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su m�dico Angel L Montes agradece tu visita a la app         " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital. " +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 litros de agua al d�a para mantener la piel hidratada, favorecer         " +
                                                  "\n la eliminaci�n de toxinas y apoyar la funci�n renal, especialmente importante en mujeres mayores que toman            " +
                                                  "\n m�ltiples medicamentos. Tambi�n se sugiere el uso de infusiones suaves como manzanilla o t� verde para aliviar        " +
                                                  "\n la inflamaci�n. EJERCICIO: Durante los brotes activos se recomienda reposo relativo. Una vez superados los            " +
                                                  "\n s�ntomas, se puede retomar actividad f�sica ligera como caminatas suaves, ejercicios de estiramiento y respiraci�n    " +
                                                  "\n profunda. Estas actividades ayudan a reducir el estr�s, que es un factor desencadenante de los brotes, y fortalecen   " +
                                                  "\n el sistema inmunol�gico. Tambi�n se recomienda practicar t�cnicas de relajaci�n como meditaci�n o tai chi. POSIBLE    " +
                                                  "\n TRATAMIENTO: El tratamiento incluye antivirales orales como Aciclovir, Valaciclovir o Famciclovir, administrados      " +
                                                  "\n durante 7 a 10 d�as en el primer episodio, y de 1 a 5 d�as en recurrencias. En mujeres mayores, puede indicarse       " +
                                                  "\n tratamiento supresivo diario si los brotes son frecuentes. Tambi�n se pueden usar cremas anest�sicas con lidoca�na    " +
                                                  "\n para aliviar el dolor, aunque no sustituyen el tratamiento oral. Es fundamental iniciar el tratamiento al primer      " +
                                                  "\n signo de brote y mantener una higiene �ntima adecuada. ALIMENTACI�N: Se recomienda una dieta rica en nutrientes       " +
                                                  "\n antivirales y antiinflamatorios como: Kiwi (con vitamina C, 92% por cada 100 g); Almendras (fuente de L-lisina, 25%   " +
                                                  "\n por cada 100 g); Jengibre (con compuestos antiinflamatorios); Yogur natural (con probi�ticos y calcio, 30% por cada   " +
                                                  "\n 100 g); y Espinacas (con vitamina A y magnesio, 56% y 20% respectivamente por cada 100 g). Este es solo un diagn�stico" +
                                                  "\n predeterminado l�gico. Para mayor seguridad, se recomienda realizar m�s de un Diagn�stico de Mi Vida y consultar a su " +
                                                  "\n m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 litros de agua al d�a para apoyar la funci�n renal, facilitar la eliminaci�n    " +
                                                  "\n de toxinas y mantener la circulaci�n adecuada. En mujeres mayores, una hidrataci�n constante tambi�n ayuda a prevenir la     " +
                                                  "\n fatiga y la sequedad de mucosas. EJERCICIO: Actividad f�sica ligera como caminatas, ejercicios de movilidad articular y      " +
                                                  "\n respiraci�n profunda puede mejorar la circulaci�n, reducir el estr�s y fortalecer el sistema inmunol�gico. Se recomienda     " +
                                                  "\n evitar el esfuerzo f�sico intenso durante el tratamiento antibi�tico. POSIBLE TRATAMIENTO: El tratamiento est�ndar es la     " +
                                                  "\n Penicilina G Benzatina (2.4 millones de unidades intramuscular en dosis �nica para s�filis primaria o secundaria). En        " +
                                                  "\n mujeres mayores con alergia a la penicilina, se puede usar Doxiciclina (100 mg dos veces al d�a por 14 d�as) o Ceftriaxona   " +
                                                  "\n (1 g diario por 10 a 14 d�as). En casos de neuros�filis, se requiere hospitalizaci�n y tratamiento intravenoso. Es           " +
                                                  "\n fundamental realizar seguimiento serol�gico y tratar a las parejas sexuales. ALIMENTACI�N: Se recomienda una dieta rica      " +
                                                  "\n en nutrientes inmunoestimulantes como: Pl�tanos (con potasio, 23% por cada 100 g); Br�coli (con vitamina C, 135% por cada    " +
                                                  "\n 100 g); Lentejas (con hierro, 37% por cada 100 g); Ajo (con propiedades antibacterianas naturales); y Frutas c�tricas        " +
                                                  "\n (con vitamina C, 89% por cada 100 g). Este es solo un diagn�stico predeterminado l�gico. Para mayor seguridad, se recomienda " +
                                                  "\n realizar m�s de un Diagn�stico de Mi Vida y consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y    " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 3 litros de agua al d�a para mantener la funci�n pulmonar, fluidificar las   " +
                                                  "\n secreciones y facilitar su expulsi�n. En mujeres mayores, una hidrataci�n adecuada tambi�n ayuda a prevenir la        " +
                                                  "\n deshidrataci�n causada por fiebre o p�rdida de apetito. EJERCICIO: Durante la fase activa se recomienda reposo        " +
                                                  "\n supervisado. Una vez estabilizada, se puede iniciar rehabilitaci�n pulmonar con ejercicios de respiraci�n profunda,   " +
                                                  "\n caminatas suaves y estiramientos. Estas actividades mejoran la oxigenaci�n, reducen la fatiga y previenen la p�rdida  " +
                                                  "\n de masa muscular. Tambi�n se recomienda evitar ambientes cerrados o con poca ventilaci�n. POSIBLE TRATAMIENTO: El     " +
                                                  "\n tratamiento est�ndar incluye una combinaci�n de Isoniazida, Rifampicina, Pirazinamida y Etambutol durante los primeros " +
                                                  "\n 2 meses, seguido de Isoniazida y Rifampicina por 4 meses m�s. En mujeres mayores, se debe monitorear la funci�n        " +
                                                  "\n hep�tica y ajustar las dosis si hay deterioro renal. Tambi�n se recomienda el uso de vitamina B6 (piridoxina) para     " +
                                                  "\n prevenir neuropat�a inducida por Isoniazida. El tratamiento debe ser supervisado estrictamente para evitar reca�das o  " +
                                                  "\n resistencia. ALIMENTACI�N: Se sugiere una dieta rica en prote�nas y antioxidantes como: Naranjas (con vitamina C, 89%  " +
                                                  "\n por cada 100 g); Aguacate (con vitamina E, 14% por cada 100 g); Pescados grasos (con Omega-3, 50% por cada 100 g);     " +
                                                  "\n Huevos (con colina, 27% por unidad); y Legumbres (con hierro y prote�na vegetal, 37% por cada 100 g). Este es solo un  " +
                                                  "\n diagn�stico predeterminado l�gico. Para mayor seguridad, se recomienda realizar m�s de un Diagn�stico de Mi Vida y     " +
                                                  "\n consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una     " +
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO.     " +
                                                  "\n Se recomienda actividad f�sica de bajo impacto como caminatas suaves, nataci�n o yoga terap�utico durante 20 a 30         " +
                                                  "\n minutos al d�a, cinco veces por semana. Tambi�n es �til realizar ejercicios de fortalecimiento muscular con bandas        " +
                                                  "\n el�sticas o pesas ligeras para estabilizar las articulaciones y prevenir la p�rdida de masa �sea. El ejercicio mejora     " +
                                                  "\n la movilidad, reduce la rigidez y ayuda a mantener la independencia funcional. HIDRATACI�N. Se aconseja consumir entre    " +
                                                  "\n 2 y 2.5 litros de agua al d�a para mantener la lubricaci�n de las articulaciones y apoyar la funci�n renal. Tambi�n se    " +
                                                  "\n recomienda el consumo de infusiones antiinflamatorias como t� verde o manzanilla, as� como caldos naturales ricos en      " +
                                                  "\n minerales. POSIBLE TRATAMIENTO. El tratamiento incluye analg�sicos como paracetamol, antiinflamatorios no esteroides      " +
                                                  "\n (AINEs) como ibuprofeno o naproxeno, y f�rmacos modificadores de la enfermedad como metotrexato o sulfasalazina. En       " +
                                                  "\n casos m�s avanzados, se pueden utilizar terapias biol�gicas como los inhibidores del TNF. Marcas reconocidas incluyen     " +
                                                  "\n Advil, Arava y Enbrel. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta antiinflamatoria rica en omega-3, antioxidantes  " +
                                                  "\n y fibra. Algunos alimentos clave incluyen pescados grasos como salm�n y sardina, frutas c�tricas como naranja y kiwi,     " +
                                                  "\n verduras de hoja verde como espinaca y br�coli, y frutos secos como almendras y nueces. Este diagn�stico es una referencia " +
                                                  "\n l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga artritis ni que el tratamiento sea   " +
                                                  "\n el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes    " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una       " +
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO.       " +
                                                  "\n Se recomienda reposo durante la fase aguda. Posteriormente, se pueden incorporar caminatas suaves, ejercicios de            " +
                                                  "\n respiraci�n profunda y t�cnicas de expansi�n tor�cica para mejorar la capacidad pulmonar. Tambi�n es �til realizar          " +
                                                  "\n ejercicios de relajaci�n como meditaci�n o yoga suave para reducir la ansiedad respiratoria. HIDRATACI�N. Se aconseja       " +
                                                  "\n consumir entre 2.5 y 3 litros de agua al d�a para mantener las v�as respiratorias hidratadas y facilitar la eliminaci�n     " +
                                                  "\n de mucosidad. Infusiones tibias de jengibre, miel y lim�n pueden aliviar la irritaci�n de garganta. Tambi�n se recomienda   " +
                                                  "\n el consumo de caldos naturales y jugos c�tricos sin az�car a�adida. POSIBLE TRATAMIENTO. El tratamiento incluye             " +
                                                  "\n antibi�ticos como azitromicina, claritromicina o eritromicina. En casos severos, se pueden usar broncodilatadores           " +
                                                  "\n o corticosteroides. Marcas reconocidas incluyen Zithromax, Biaxin y Erythrocin. Es importante iniciar el tratamiento        " +
                                                  "\n en las primeras etapas para reducir la gravedad y prevenir contagios. ALIMENTACI�N RECOMENDADA. Se recomienda una           " +
                                                  "\n dieta rica en vitamina C, vitamina A y antioxidantes. Algunos alimentos clave incluyen frutas c�tricas, zanahoria,          " +
                                                  "\n espinaca, miel natural y jengibre fresco. Este diagn�stico es una referencia l�gica basada en informaci�n m�dica,           " +
                                                  "\n pero no garantiza al 100% que el paciente tenga tosferina ni que el tratamiento sea el adecuado. Se recomienda realizar     " +
                                                  "\n m�s de un diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app              " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una    " +
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO.    " +
                                                  "\n Se recomienda reposo absoluto durante la fase aguda para evitar complicaciones. Una vez superada, se pueden incorporar   " +
                                                  "\n ejercicios suaves de movilidad, estiramientos y caminatas cortas para mejorar la circulaci�n y prevenir la rigidez       " + 
                                                  "\n muscular. HIDRATACI�N. Se aconseja consumir entre 2 y 2.5 litros de agua al d�a para aliviar la inflamaci�n de las       " +
                                                  "\n gl�ndulas salivales y prevenir la deshidrataci�n. Tambi�n se recomienda el consumo de caldos suaves, infusiones tibias   " +
                                                  "\n y jugos naturales sin az�car a�adida. POSIBLE TRATAMIENTO. El tratamiento es sintom�tico e incluye analg�sicos como      " +
                                                  "\n paracetamol o ibuprofeno para reducir el dolor y la fiebre. En casos severos, se pueden usar corticosteroides. Tambi�n   " +
                                                  "\n se recomienda aplicar compresas fr�as en las zonas inflamadas. Marcas reconocidas incluyen Tempra y Advil. ALIMENTACI�N  " +
                                                  "\n RECOMENDADA. Se recomienda una dieta suave, rica en vitaminas y f�cil de masticar. Algunos alimentos clave incluyen      " +
                                                  "\n yogur, pur� de papa, pl�tano, mango, zanahoria cocida y calabac�n. La miel puede ayudar a calmar la garganta. Este       " +
                                                  "\n diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga       " +
                                                  "\n paperas ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico      " +
                                                  "\n para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n El virus del Zika es una infecci�n transmitida por el mosquito Aedes aegypti que puede causar fiebre leve, sarpullido,     " +
                                                  "\n dolor muscular, conjuntivitis y malestar general. En la ancianidad, aunque los s�ntomas suelen ser leves, el sistema       " +
                                                  "\n inmunol�gico debilitado puede prolongar la recuperaci�n. EJERCICIO. Se recomienda actividad f�sica ligera como caminatas   " +
                                                  "\n suaves, estiramientos o ejercicios de respiraci�n, que ayudan a mantener la circulaci�n y reducir el estr�s sin agotar     " +
                                                  "\n al organismo. HIDRATACI�N. Es fundamental consumir entre 2.5 y 3 litros de agua al d�a para prevenir la deshidrataci�n,    " +
                                                  "\n regular la temperatura corporal y facilitar la eliminaci�n de toxinas. Tambi�n se sugiere el consumo de infusiones         " +
                                                  "\n suaves como manzanilla o t� verde por sus propiedades antioxidantes. POSIBLE TRATAMIENTO. No existe un tratamiento         " +
                                                  "\n antiviral espec�fico para el Zika. Se recomienda el uso de paracetamol para aliviar la fiebre y el dolor, evitando         " +
                                                  "\n el ibuprofeno y la aspirina por el riesgo de sangrado. Es esencial el reposo, el control de s�ntomas y la vigilancia       " +
                                                  "\n m�dica ante cualquier complicaci�n. ALIMENTACI�N RECOMENDADA. Consumir alimentos que fortalezcan el sistema inmunol�gico   " +
                                                  "\n y reduzcan la inflamaci�n. Frutas c�tricas como naranja y toronja, ricas en vitamina C, que fortalecen las defensas,       " +
                                                  "\n aportando hasta el 89% del requerimiento diario por cada 100 g. Papaya, rica en vitamina A y C, que favorece la            " +
                                                  "\n regeneraci�n celular, aportando cerca del 75% del requerimiento diario de vitamina C por cada 100 g. Jengibre, con         " +
                                                  "\n propiedades antiinflamatorias y antioxidantes. Verduras de hoja verde como espinaca, que aportan hierro y antioxidantes    " +
                                                  "\n esenciales para la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al     " +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se      " +
                                                  "\n recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su         " +
                                                  "\n paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar    " +
                                                  "\n a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n El rotavirus es una infecci�n viral que causa gastroenteritis, caracterizada por diarrea severa, v�mitos, fiebre y           " +
                                                  "\n deshidrataci�n. En personas mayores, puede provocar complicaciones graves si no se trata adecuadamente. EJERCICIO.           " +
                                                  "\n Se recomienda actividad f�sica muy ligera durante la fase aguda, como estiramientos suaves o caminatas cortas, para          " +
                                                  "\n mantener la movilidad sin agotar al cuerpo. HIDRATACI�N. Es fundamental consumir entre 2.5 y 3 litros de agua al d�a         " +
                                                  "\n para reponer los l�quidos perdidos por la diarrea y los v�mitos. Tambi�n se recomienda el uso de soluciones de               " +
                                                  "\n rehidrataci�n oral con electrolitos como sodio y potasio. POSIBLE TRATAMIENTO. No existe un tratamiento antiviral            " + 
                                                  "\n espec�fico para el rotavirus. Se recomienda el uso de paracetamol para aliviar la fiebre y el malestar, evitando el          " +
                                                  "\n ibuprofeno y la aspirina. En casos graves, puede ser necesario el uso de l�quidos intravenosos. ALIMENTACI�N RECOMENDADA.    " +
                                                  "\n Consumir alimentos de f�cil digesti�n y ricos en nutrientes esenciales. Pl�tano, rico en potasio, que ayuda a reponer        " +
                                                  "\n electrolitos, aportando aproximadamente el 10% del requerimiento diario por cada 100 g. Arroz blanco, fuente de              " +
                                                  "\n carbohidratos suaves que estabilizan el sistema digestivo. Zanahoria, rica en vitamina A y antioxidantes, que favorecen      " +
                                                  "\n la regeneraci�n de la mucosa intestinal, aportando cerca del 15% del requerimiento diario de vitamina A por cada 100 g.      " +
                                                  "\n Manzana, con pectina que regula el tr�nsito intestinal y aporta fibra soluble. Este es solo un diagn�stico predeterminado    " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus      " +
                                                  "\n respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad   " +
                                                  "\n en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se   " +
                                                  "\n le recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria." +
                                                  "\n La listeriosis es una infecci�n bacteriana causada por Listeria monocytogenes, que puede provocar fiebre, dolores             " +
                                                  "\n musculares, n�useas y, en casos graves, afectar el sistema nervioso. En la ancianidad, el riesgo de complicaciones            " +
                                                  "\n es mayor debido a la inmunidad reducida. EJERCICIO. Se recomienda actividad f�sica moderada y adaptada, como caminatas        " +
                                                  "\n suaves o ejercicios de respiraci�n, que ayudan a mantener la circulaci�n y reducir el estr�s sin comprometer la               " +
                                                  "\n recuperaci�n. HIDRATACI�N. Es fundamental consumir entre 2 y 2.5 litros de agua al d�a para apoyar la funci�n renal,          " +
                                                  "\n eliminar toxinas y mantener el equilibrio de l�quidos. Tambi�n se sugiere el consumo de infusiones suaves como manzanilla     " +
                                                  "\n o agua de coco. POSIBLE TRATAMIENTO. La listeriosis se trata con antibi�ticos como ampicilina o trimetoprima-sulfametoxazol.  " +
                                                  "\n En casos graves, puede requerirse tratamiento intravenoso y hospitalizaci�n. Es esencial seguir el tratamiento completo y     " +
                                                  "\n bajo supervisi�n m�dica. ALIMENTACI�N RECOMENDADA. Consumir alimentos ricos en antioxidantes y vitaminas para fortalecer      " +
                                                  "\n el sistema inmunol�gico. Espinaca, rica en hierro y vitamina K, que favorece la recuperaci�n celular, aportando hasta el      " +
                                                  "\n 20% del requerimiento diario de hierro por cada 100 g. Yogur natural, fuente de probi�ticos que fortalecen la flora           " +
                                                  "\n intestinal. Frutas c�tricas como naranja y toronja, ricas en vitamina C, que contribuyen a la recuperaci�n, aportando         " +
                                                  "\n aproximadamente el 89% del requerimiento diario por cada 100 g. Este es solo un diagn�stico predeterminado l�gico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n      " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento   " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho  " +
                                                  "\n consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n EJERCICIO: Durante la fase activa de la shigelosis se recomienda reposo absoluto, ya que la diarrea, fiebre y debilidad      " +  
                                                  "\n general pueden comprometer la estabilidad f�sica. Una vez superada la fase aguda, se pueden realizar caminatas suaves y      " +
                                                  "\n ejercicios de respiraci�n para estimular la circulaci�n, mejorar la digesti�n y recuperar la energ�a. HIDRATACI�N: Es        " +
                                                  "\n fundamental consumir entre 2.5 y 3 litros de agua al d�a para prevenir la deshidrataci�n causada por la diarrea. Tambi�n     " +
                                                  "\n se recomienda el uso de soluciones de rehidrataci�n oral que aporten sodio, potasio y glucosa, as� como caldos naturales     " +
                                                  "\n y jugos suaves sin az�car para reponer electrolitos y mantener el equilibrio h�drico. POSIBLE TRATAMIENTO: En casos leves,   " +
                                                  "\n la shigelosis puede resolverse con reposo e hidrataci�n, pero en personas mayores o con s�ntomas severos se recomienda el    " +
                                                  "\n uso de antibi�ticos como ciprofloxacino o azitromicina, siempre bajo prescripci�n m�dica. No se deben utilizar medicamentos  " +
                                                  "\n antidiarreicos como loperamida, ya que pueden empeorar la infecci�n. Tambi�n es importante mantener una higiene estricta     " +
                                                  "\n para evitar la reinfecci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos suaves y ricos en nutrientes para fortalecer " +
                                                  "\n el sistema digestivo, tales como arroz blanco y pl�tano, que aportan potasio y fibra soluble. Yogur natural, que contiene      " +
                                                  "\n probi�ticos beneficiosos para la flora intestinal. Zanahorias cocidas, que aportan vitamina A y antioxidantes en un 50% de     " +
                                                  "\n la ingesta diaria recomendada. Manzanas cocidas o ralladas, que contienen pectina y vitamina C en un 70% de la ingesta diaria  " +
                                                  "\n recomendada, ayudando a regular el tr�nsito intestinal. este es solo un diagn�stico predeterminado l�gico. haberlo consultado  " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda   " +
                                                  "\n realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la respuesta del      " +
                                                  "\n diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app          " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n EJERCICIO: La actividad f�sica moderada es esencial para mantener la capacidad pulmonar y prevenir la p�rdida de masa     " +
                                                  "\n muscular en personas mayores con EPOC. Se recomienda realizar caminatas suaves de 20 a 30 minutos al d�a, ejercicios      " +
                                                  "\n de respiraci�n diafragm�tica y estiramientos para mejorar la movilidad tor�cica. Tambi�n es �til incluir ejercicios de    " +
                                                  "\n fortalecimiento muscular con bandas el�sticas bajo supervisi�n m�dica. HIDRATACI�N: Es crucial consumir entre 2.5 y 3     " +
                                                  "\n litros de agua al d�a para mantener las v�as respiratorias hidratadas, facilitar la eliminaci�n de secreciones y reducir  " +
                                                  "\n la viscosidad del moco. Tambi�n se recomienda el consumo de infusiones como t� de jengibre o manzanilla, que poseen       " +
                                                  "\n propiedades antiinflamatorias y relajantes. POSIBLE TRATAMIENTO: El tratamiento de la EPOC incluye broncodilatadores      " +
                                                  "\n de acci�n corta como salbutamol para alivio r�pido, y de acci�n prolongada como tiotropio para el control diario. Tambi�n " +
                                                  "\n se utilizan corticosteroides inhalados como fluticasona o budesonida para reducir la inflamaci�n. En casos avanzados,     " +
                                                  "\n puede ser necesaria la oxigenoterapia domiciliaria. Es fundamental realizar espirometr�as peri�dicas y ajustar el         " +
                                                  "\n tratamiento seg�n la evoluci�n cl�nica. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y      " +
                                                  "\n nutrientes esenciales para la funci�n pulmonar, tales como frutas c�tricas como naranjas y toronjas, que aportan          " +
                                                  "\n vitamina C en un 89% de la ingesta diaria recomendada. Pescados grasos como salm�n y at�n, que contienen �cidos grasos    " +
                                                  "\n Omega-3 con propiedades antiinflamatorias y aportan hasta un 70% de la ingesta diaria recomendada. Verduras de hoja       " +
                                                  "\n verde como espinacas y acelgas, que aportan vitamina A y K en un 50% de la ingesta diaria recomendada. Jengibre y         " +
                                                  "\n c�rcuma, que contienen compuestos bioactivos con propiedades antiinflamatorias, contribuyendo con hasta un 40% de la      " +
                                                  "\n ingesta diaria recomendada. este es solo un diagn�stico predeterminado l�gico. haberlo consultado no garantiza al 100%    " +
                                                  "\n que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar m�s      " +
                                                  "\n de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico  " +
                                                  "\n no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y     " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n EJERCICIO: Durante el tratamiento de la clamidia se recomienda evitar esfuerzos f�sicos intensos y priorizar el descanso,      " +
                                                  "\n especialmente si hay s�ntomas como fiebre o dolor p�lvico. Una vez finalizado el tratamiento, se pueden retomar ejercicios     " +
                                                  "\n suaves como caminatas o yoga para mejorar la circulaci�n y reducir el estr�s, que puede afectar la respuesta inmunol�gica.     " +
                                                  "\n HIDRATACI�N: Es fundamental consumir al menos 2.5 litros de agua al d�a para mantener la salud de las mucosas, facilitar la    " +
                                                  "\n eliminaci�n de toxinas y apoyar la funci�n renal durante el tratamiento antibi�tico. Tambi�n se recomienda el consumo de       " +
                                                  "\n infusiones como t� verde o manzanilla, que poseen propiedades antibacterianas y calmantes. POSIBLE TRATAMIENTO: La clamidia    " +
                                                  "\n se trata con antibi�ticos como azitromicina en dosis �nica o doxiciclina durante 7 d�as. En personas mayores, es importante    " +
                                                  "\n ajustar la dosis seg�n la funci�n renal y hep�tica. Tambi�n se recomienda evitar relaciones sexuales durante el tratamiento    " +
                                                  "\n y asegurarse de que la pareja reciba tratamiento para prevenir reinfecciones. ALIMENTACI�N: Se recomienda el consumo de        " +
                                                  "\n alimentos que fortalezcan el sistema inmunol�gico y favorezcan la regeneraci�n de tejidos, tales como frutas c�tricas como      " +
                                                  "\n naranjas y toronjas, que aportan vitamina C en un 89% de la ingesta diaria recomendada. Yogur natural, que contiene probi�ticos " +
                                                  "\n que equilibran la flora vaginal y fortalecen las defensas. Verduras de hoja verde como espinacas y acelgas, que aportan         " +
                                                  "\n vitamina A y K en un 50% de la ingesta diaria recomendada. Ajo y cebolla, que contienen compuestos sulfurados con propiedades   " +
                                                  "\n antimicrobianas, contribuyendo con hasta un 40% de la ingesta diaria recomendada de estos nutrientes. este es solo un           " +
                                                  "\n diagn�stico predeterminado l�gico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que         " +
                                                  "\n las respuestas sean completamente correctas. se recomienda realizar m�s de un diagn�stico para mayor seguridad en el            " +
                                                  "\n tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar   " +
                                                  "\n a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la meningitis bacteriana es fundamental mantener una hidrataci�n adecuada con un        " +
                                                  "\n consumo diario recomendado de 2.5 litros de agua aproximadamente 10 vasos de tama�o regular para apoyar la funci�n renal    " +
                                                  "\n y compensar la p�rdida de l�quidos por fiebre y sudoraci�n. EJERCICIO: Se recomienda reposo absoluto durante la fase        " +
                                                  "\n aguda de la enfermedad. Una vez superada esta etapa, se pueden incorporar ejercicios de movilidad pasiva y respiraci�n      " +
                                                  "\n profunda para prevenir complicaciones por inmovilidad y mejorar la oxigenaci�n cerebral. POSIBLE TRATAMIENTO: El            " +
                                                  "\n tratamiento incluye antibi�ticos intravenosos de amplio espectro como ceftriaxona o cefotaxima, ajustados seg�n el          " +
                                                  "\n microorganismo identificado. En casos de sospecha de Listeria monocytogenes, se a�ade ampicilina con gentamicina.           " +
                                                  "\n Tambi�n se pueden administrar corticosteroides como la dexametasona para reducir la inflamaci�n cerebral. Es fundamental    " +
                                                  "\n iniciar el tratamiento lo antes posible y mantener vigilancia m�dica constante. ALIMENTOS RECOMENDADOS: Para apoyar la      " +
                                                  "\n recuperaci�n neurol�gica y fortalecer el sistema inmunol�gico se recomienda el consumo de H�GADO DE RES: Rico en hierro     " +
                                                  "\n y vitamina A que ayuda a combatir la anemia y fortalecer la inmunidad aportando m�s del 100% de la ingesta diaria           " +
                                                  "\n recomendada por cada 100 gramos. FRUTAS C�TRICAS: Como naranja y toronja ricas en vitamina C que favorece la absorci�n      " +
                                                  "\n de hierro y combate infecciones aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos.      " +
                                                  "\n ESPINACAS Y BR�COLI: Aportan antioxidantes y vitamina A esenciales para la regeneraci�n celular con un contenido de         " +
                                                  "\n aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos que        " +
                                                  "\n fortalecen el sistema inmunol�gico y mejoran la salud digestiva aportando calcio y prote�nas esenciales. Este es solo       " +
                                                  "\n un diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que   " +
                                                  "\n las respuestas sean completamente correctas para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer  " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface " +
                                                  "\n del todo se le recomienda mucho consultar a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: Para el tratamiento del c�ncer es fundamental mantener una hidrataci�n adecuada con un consumo diario        " +
                                                  "\n recomendado de 2.5 litros de agua aproximadamente 10 vasos de tama�o regular para apoyar la funci�n renal y hep�tica      " +
                                                  "\n durante la quimioterapia o radioterapia y prevenir la deshidrataci�n. EJERCICIO: Se recomienda actividad f�sica adaptada  " +
                                                  "\n como caminatas suaves ejercicios de estiramiento o fisioterapia oncol�gica para mantener la movilidad reducir la fatiga   " +
                                                  "\n y mejorar el estado de �nimo. En pacientes con debilidad se sugiere iniciar con ejercicios pasivos o asistidos. POSIBLE   " +
                                                  "\n TRATAMIENTO: El tratamiento depende del tipo y estadio del c�ncer. En mujeres mayores de 75 a�os se prioriza un enfoque   " +
                                                  "\n individualizado que puede incluir cirug�a, quimioterapia, radioterapia u hormonoterapia seg�n la tolerancia y             " +
                                                  "\n comorbilidades. En c�nceres hormonodependientes como el de mama se puede optar por hormonoterapia como tamoxifeno o       " +
                                                  "\n inhibidores de aromatasa. En casos avanzados se puede considerar tratamiento paliativo para mejorar la calidad de vida.   " +
                                                  "\n ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunol�gico y apoyar la recuperaci�n se recomienda el consumo de      " +
                                                  "\n FRUTAS C�TRICAS: Como naranja toronja y guayaba ricas en vitamina C que aportan aproximadamente el 89% de la ingesta      " +
                                                  "\n diaria recomendada por cada 100 gramos. H�GADO DE RES: Fuente de hierro y vitamina A que ayuda a combatir la anemia y     " +
                                                  "\n fortalecer la inmunidad aportando m�s del 100% de la ingesta diaria recomendada por cada 100 gramos. ESPINACAS Y          " +
                                                  "\n BR�COLI: Ricos en antioxidantes hierro y vitamina A esenciales para la regeneraci�n celular con un contenido de     " +
                                                  "\n aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos    " +
                                                  "\n que fortalecen el sistema inmunol�gico y mejoran la salud digestiva aportando calcio y prote�nas esenciales. Este   " +
                                                  "\n es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100% que el paciente tenga esta     " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer m�s de un Diagn�stico   " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s por su salud si la      " +
                                                  "\n respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico Angel L Montes      " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.30-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe). " +
                                                  "\n HIDRATACI�N: Para el tratamiento de la influenza es fundamental mantener una hidrataci�n adecuada con un consumo diario      " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a fluidificar las           " +
                                                  "\n secreciones respiratorias y prevenir la deshidrataci�n causada por la fiebre. EJERCICIO: Se recomienda actividad f�sica      " + 
                                                  "\n ligera como caminatas suaves dentro del hogar estiramientos o ejercicios de movilidad evitando esfuerzos intensos mientras   " +
                                                  "\n persistan los s�ntomas. Una vez superada la fase aguda es recomendable realizar ejercicios de respiraci�n profunda para      " +
                                                  "\n mejorar la oxigenaci�n y prevenir la p�rdida de masa muscular. POSIBLE TRATAMIENTO: El tratamiento suele incluir             " +
                                                  "\n medicamentos para reducir la fiebre y aliviar los s�ntomas como el paracetamol o el ibuprofeno y en casos m�s severos los    " +
                                                  "\n m�dicos pueden recetar antivirales espec�ficos como el oseltamivir. Es importante seguir las indicaciones m�dicas y evitar   " +
                                                  "\n el uso de aspirina ya que puede generar complicaciones. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunol�gico y    " +
                                                  "\n acelerar la recuperaci�n se recomienda el consumo de NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la         " +
                                                  "\n duraci�n de los s�ntomas aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE:    " +  
                                                  "\n Contiene compuestos con propiedades antiinflamatorias y puede aliviar la congesti�n. MIEL Y LIM�N: Combinaci�n efectiva      " +
                                                  "\n para calmar la garganta y reducir la tos aportando flavonoides y vitamina C. ESPINACAS Y BR�COLI: Aportan antioxidantes      " +
                                                  "\n y vitamina A esenciales para la regeneraci�n celular con un contenido de aproximadamente el 56% de la ingesta diaria         " +
                                                  "\n recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos que pueden fortalecer el sistema inmunol�gico y mejorar " +
                                                  "\n la salud digestiva aportando calcio y prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico haberlo        " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas     " +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado    " +
                                                  "\n de su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar " +
                                                  "\n a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la neumon�a es fundamental mantener una hidrataci�n adecuada con un consumo diario         " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a fluidificar las             " +
                                                  "\n secreciones pulmonares y facilitar su expulsi�n. EJERCICIO: Se recomienda actividad f�sica ligera como caminatas lentas        " +
                                                  "\n dentro del hogar ejercicios de respiraci�n profunda y estiramientos suaves evitando esfuerzos intensos mientras persistan      " +
                                                  "\n los s�ntomas. Una vez superada la fase aguda es recomendable realizar fisioterapia respiratoria y ejercicios de expansi�n      " +
                                                  "\n pulmonar para mejorar la capacidad pulmonar y reducir la sensaci�n de fatiga. POSIBLE TRATAMIENTO: El tratamiento suele        " +
                                                  "\n incluir antibi�ticos como la amoxicilina la azitromicina o la ceftriaxona y en casos m�s severos antivirales como el           " +
                                                  "\n oseltamivir adem�s de medicamentos para reducir la fiebre como el paracetamol o el ibuprofeno. Es importante seguir las        " +
                                                  "\n indicaciones m�dicas y evitar la automedicaci�n. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunol�gico y acelerar    " +
                                                  "\n la recuperaci�n se recomienda el consumo de NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la duraci�n de los    " +
                                                  "\n s�ntomas aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos  " +
                                                  "\n con propiedades antiinflamatorias y puede aliviar la congesti�n. ESPINACAS Y BR�COLI: Aportan antioxidantes y vitamina A       " +
                                                  "\n esenciales para la regeneraci�n celular con un contenido de aproximadamente el 56% de la ingesta diaria recomendada por cada   " +
                                                  "\n 100 gramos. YOGUR NATURAL: Contiene probi�ticos que pueden fortalecer el sistema inmunol�gico y mejorar la salud digestiva     " +
                                                  "\n aportando calcio y prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza al  " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer    " +
                                                  "\n m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s por su salud " +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico Angel L Montes agradece  " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la diabetes es fundamental mantener una hidrataci�n adecuada con un consumo diario       " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a la regulaci�n de la       " +
                                                  "\n glucosa en sangre y prevenir la deshidrataci�n. EJERCICIO: Se recomienda actividad f�sica regular como caminatas suaves      " +
                                                  "\n ejercicios de bajo impacto o nataci�n para mejorar la sensibilidad a la insulina y controlar los niveles de glucosa en       " + 
                                                  "\n sangre. Adem�s se recomienda la pr�ctica de ejercicios aer�bicos como bicicleta est�tica o baile al menos 150 minutos        " +
                                                  "\n por semana para mejorar la funci�n cardiovascular y reducir el riesgo de complicaciones. POSIBLE TRATAMIENTO: El             " +
                                                  "\n tratamiento suele incluir medicamentos como la metformina para mejorar la sensibilidad a la insulina y en casos m�s          " +
                                                  "\n severos insulina de acci�n r�pida o prolongada adem�s de medicamentos para controlar la presi�n arterial y el colesterol.    " +
                                                  "\n Es importante seguir las indicaciones m�dicas y mantener un monitoreo constante de los niveles de glucosa. ALIMENTOS         " +
                                                  "\n RECOMENDADOS: Para fortalecer el metabolismo y mejorar el control de la glucosa se recomienda el consumo de FRUTOS ROJOS:    " +
                                                  "\n Ricos en antioxidantes y fibra que ayudan a regular la glucosa en sangre aportando aproximadamente el 32% de la ingesta      " +
                                                  "\n diaria recomendada por cada 100 gramos. FRUTOS SECOS: Contienen grasas saludables y fibra que pueden mejorar la sensibilidad " +
                                                  "\n a la insulina aportando aproximadamente el 25% de la ingesta diaria recomendada por cada 100 gramos. ESPINACAS Y BR�COLI:    " +
                                                  "\n Aportan antioxidantes y vitamina A esenciales para la regeneraci�n celular con un contenido de aproximadamente el 56% de     " +
                                                  "\n la ingesta diaria recomendada por cada 100 gramos. AVENA: Rica en fibra soluble que ayuda a estabilizar los niveles de       " +
                                                  "\n glucosa en sangre aportando aproximadamente el 40% de la ingesta diaria recomendada por cada 100 gramos. Este es solo        " +
                                                  "\n un diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni        " +
                                                  "\n que las respuestas sean completamente correctas para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para          " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s por su salud si la respuesta del Diagn�stico     " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida)   " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 litros de agua al d�a para mantener las v�as respiratorias hidratadas,     " +
                                                  "\n facilitar la eliminaci�n de secreciones y reducir la inflamaci�n bronquial. En mujeres mayores, una hidrataci�n         " +
                                                  "\n constante tambi�n ayuda a prevenir la sequedad de mucosas y mejora la funci�n pulmonar general. EJERCICIO: Actividad    " +
                                                  "\n f�sica moderada y adaptada como caminatas suaves, ejercicios de respiraci�n diafragm�tica y estiramientos tor�cicos     " +
                                                  "\n puede mejorar la capacidad pulmonar, reducir la disnea y fortalecer los m�sculos respiratorios. Tambi�n se recomienda   " +
                                                  "\n realizar ejercicios con espir�metro incentivador para mantener la expansi�n pulmonar y prevenir complicaciones como     " +
                                                  "\n atelectasias. POSIBLE TRATAMIENTO: El tratamiento incluye broncodilatadores de acci�n r�pida como Salbutamol,           " +
                                                  "\n corticosteroides inhalados como Fluticasona o Budesonida, y en algunos casos, modificadores de leucotrienos como        " +
                                                  "\n Montelukast. En mujeres mayores, es esencial revisar la t�cnica de inhalaci�n, ajustar las dosis para evitar efectos    " +
                                                  "\n secundarios como temblores o taquicardia, y considerar el uso de espaciadores para mejorar la administraci�n del        " +
                                                  "\n medicamento. ALIMENTACI�N: Se sugiere el consumo de alimentos antiinflamatorios y antioxidantes como: pescados grasos   " +
                                                  "\n (ricos en Omega-3), frutas c�tricas (con vitamina C), espinacas (con vitamina A y magnesio), jengibre y c�rcuma, con    " +
                                                  "\n propiedades naturales que ayudan a reducir la inflamaci�n de las v�as respiratorias. Este es solo un diagn�stico        " +
                                                  "\n predeterminado l�gico. Para mayor seguridad, se recomienda realizar m�s de un Diagn�stico de Mi Vida y consultar a su   " +
                                                  "\n m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 a 3 litros de agua al d�a para apoyar la funci�n renal, facilitar la         " +
                                                  "\n eliminaci�n de toxinas y mantener el equilibrio electrol�tico, especialmente importante en pacientes polimedicados.       " +
                                                  "\n Tambi�n se sugiere incluir infusiones antioxidantes como t� verde o rooibos. EJERCICIO: Actividad f�sica moderada         " +
                                                  "\n como caminatas, yoga suave o ejercicios de bajo impacto puede mejorar la masa muscular, reducir el estr�s y fortalecer    " +
                                                  "\n el sistema inmunol�gico. Tambi�n se recomienda la pr�ctica de ejercicios de equilibrio y coordinaci�n para prevenir       " +
                                                  "\n ca�das. POSIBLE TRATAMIENTO: El tratamiento est�ndar es la terapia antirretroviral (TAR), que combina medicamentos como   " +
                                                  "\n Tenofovir, Emtricitabina, Efavirenz, Dolutegravir y Lamivudina. En mujeres mayores, es crucial monitorear la funci�n      " +
                                                  "\n hep�tica y renal, as� como posibles interacciones con otros medicamentos. Tambi�n se recomienda el seguimiento de la      " +
                                                  "\n densidad �sea, ya que algunos antirretrovirales pueden afectar el metabolismo del calcio. El acompa�amiento psicol�gico   " +
                                                  "\n y el control nutricional son fundamentales para mantener la adherencia terap�utica y la calidad de vida. ALIMENTACI�N:    " +
                                                  "\n Se recomienda una dieta rica en vitamina C, E, A, hierro, zinc, Omega-3 y prote�nas vegetales, presentes en frutas        " +
                                                  "\n c�tricas, aguacate, pescados grasos, verduras de hoja verde, legumbres y frutos secos. Este es solo un diagn�stico        " +
                                                  "\n predeterminado l�gico. Para mayor seguridad, se recomienda realizar m�s de un Diagn�stico de Mi Vida y consultar a su     " +
                                                  "\n m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 litros de agua al d�a para facilitar la eliminaci�n de toxinas, mantener     " +
                                                  "\n la funci�n renal y apoyar el tratamiento antibi�tico. Tambi�n se sugiere el consumo de jugos naturales sin az�car y       " +
                                                  "\n caldos suaves. EJERCICIO: Actividad f�sica ligera como caminatas, ejercicios de movilidad articular y estiramientos       " +
                                                  "\n suaves puede ayudar a mejorar la circulaci�n y fortalecer el sistema inmune. Se debe evitar el ejercicio intenso durante  " +
                                                  "\n el tratamiento para no comprometer la recuperaci�n. POSIBLE TRATAMIENTO: El tratamiento incluye antibi�ticos como         " +
                                                  "\n Ceftriaxona (inyecci�n �nica) y Azitromicina (dosis oral). En mujeres mayores, es importante vigilar posibles efectos     " +
                                                  "\n secundarios gastrointestinales y ajustar la dosis en caso de insuficiencia renal. Tambi�n se recomienda realizar pruebas  " +
                                                  "\n de seguimiento para confirmar la erradicaci�n de la bacteria y evitar reinfecciones. En casos resistentes, puede ser      " +
                                                  "\n necesario el uso de combinaciones antibi�ticas o tratamientos prolongados. ALIMENTACI�N: Se recomienda una dieta que      " +
                                                  "\n apoye la funci�n inmunol�gica y la recuperaci�n, incluyendo: naranjas (vitamina C), espinacas (hierro y �cido f�lico),    " +
                                                  "\n yogur natural (probi�ticos y calcio), ajo (antibacteriano natural) y zanahorias (vitamina A). Este es solo un diagn�stico " +
                                                  "\n predeterminado l�gico. Para mayor seguridad, se recomienda realizar m�s de un Diagn�stico de Mi Vida y consultar a su     " +
                                                  "\n m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una        " +
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO.        " +
                                                  "\n Se recomienda actividad f�sica ligera como caminatas suaves de 15 a 20 minutos al d�a, ejercicios de estiramiento y          " +
                                                  "\n respiraci�n profunda para reducir el estr�s, mejorar la circulaci�n y fortalecer el sistema inmunol�gico, ya que el          " +
                                                  "\n estr�s puede desencadenar brotes. Tambi�n es �til practicar yoga suave o meditaci�n para mantener el equilibrio emocional.   " +
                                                  "\n HIDRATACI�N. Se aconseja consumir entre 2 y 2.5 litros de agua al d�a para mantener la piel y las mucosas hidratadas, lo     " +
                                                  "\n cual ayuda a reducir la irritaci�n y prevenir brotes. Adem�s, se recomienda evitar bebidas con cafe�na o alcohol, ya que     " +
                                                  "\n pueden favorecer la deshidrataci�n. Infusiones suaves como manzanilla o t� verde pueden ser beneficiosas por sus             " +
                                                  "\n propiedades antiinflamatorias y antioxidantes. POSIBLE TRATAMIENTO. El tratamiento incluye antivirales como aciclovir,       " +
                                                  "\n famciclovir y valaciclovir, que ayudan a reducir la duraci�n y frecuencia de los brotes. Marcas reconocidas incluyen         " +
                                                  "\n Zovirax y Valtrex. En casos de recurrencias frecuentes, se puede considerar terapia supresiva diaria. Tambi�n se             " +
                                                  "\n recomienda el uso de cremas t�picas con lidoca�na o aloe vera para aliviar el malestar local. ALIMENTACI�N RECOMENDADA.      " +
                                                  "\n Se recomienda una dieta rica en lisina y antioxidantes para fortalecer el sistema inmunol�gico. Algunos alimentos clave      " +
                                                  "\n incluyen yogur natural y leche, ricos en lisina, que inhibe la replicaci�n del virus. Frutas c�tricas como naranja y kiwi,   " +
                                                  "\n ricas en vitamina C, que fortalecen el sistema inmune, aportando aproximadamente el 89% del requerimiento diario por cada    " +
                                                  "\n 100 gramos. Verduras como espinaca y zanahoria, ricas en vitamina A, que contribuyen a la regeneraci�n celular y fortalecen  " +
                                                  "\n las mucosas, con un aporte del 15% del requerimiento diario por cada 100 gramos. Este diagn�stico es una referencia l�gica   " +
                                                  "\n basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga herpes genital ni que el tratamiento sea el    " +
                                                  "\n adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes          " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una     " +
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO.     " +
                                                  "\n Se recomienda actividad f�sica moderada como caminatas diarias de 20 a 30 minutos, ejercicios de movilidad articular y    " +
                                                  "\n estiramientos suaves para mejorar la circulaci�n, mantener la masa muscular y fortalecer el sistema inmunol�gico.         " +
                                                  "\n Tambi�n es beneficioso incluir ejercicios de equilibrio y coordinaci�n para prevenir ca�das. HIDRATACI�N. Se aconseja     " +
                                                  "\n consumir entre 2 y 2.5 litros de agua al d�a para ayudar a eliminar toxinas del cuerpo, mantener la funci�n renal y       " +
                                                  "\n apoyar el metabolismo durante el tratamiento antibi�tico. Tambi�n se recomienda el consumo de caldos naturales y jugos    " +
                                                  "\n de frutas sin az�car a�adida para mantener el equilibrio de electrolitos. POSIBLE TRATAMIENTO. El tratamiento est�ndar    " +
                                                  "\n incluye antibi�ticos como penicilina G benzatina, doxiciclina o ceftriaxona. Marcas reconocidas incluyen Benzetacil y     " +
                                                  "\n Doxiciclina. En pacientes al�rgicos a la penicilina, se utilizan alternativas como la doxiciclina por v�a oral durante    " +
                                                  "\n 14 d�as. Es fundamental completar el tratamiento para evitar complicaciones como neuros�filis o da�o cardiovascular.      " +
                                                  "\n ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica en prote�nas, vitaminas y minerales para fortalecer el sistema     " +
                                                  "\n inmunol�gico. Algunos alimentos clave incluyen carnes magras y pescado, fuentes de prote�nas esenciales. Frutas c�tricas  " +
                                                  "\n como naranja y lim�n, ricas en vitamina C, que ayudan a la recuperaci�n y fortalecimiento del sistema inmune, aportando   " +
                                                  "\n el 89% del requerimiento diario por cada 100 gramos. Verduras de hoja verde como espinaca y br�coli, que contienen hierro " +
                                                  "\n y antioxidantes esenciales para la producci�n de gl�bulos rojos, con un aporte del 15% del requerimiento diario por cada  " +
                                                  "\n 100 gramos. Ajo y cebolla, con compuestos antimicrobianos naturales que pueden apoyar el tratamiento. Este diagn�stico    " +
                                                  "\n es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga s�filis ni que el  " +
                                                  "\n tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para mayor seguridad.   " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una    " +
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO.    " +
                                                  "\n Se recomienda actividad f�sica moderada como caminatas suaves, ejercicios de respiraci�n profunda y yoga terap�utico     " +
                                                  "\n para fortalecer los pulmones, mejorar la oxigenaci�n y reducir la fatiga. Tambi�n es �til realizar ejercicios de         " +
                                                  "\n movilidad articular y estiramientos para mantener la flexibilidad y prevenir la p�rdida de masa muscular. HIDRATACI�N.   " +
                                                  "\n Se aconseja consumir entre 2.5 y 3 litros de agua al d�a para mantener las v�as respiratorias hidratadas, facilitar la   " +
                                                  "\n eliminaci�n de toxinas y apoyar la funci�n renal durante el tratamiento. Tambi�n se recomienda el consumo de caldos      " +
                                                  "\n ricos en minerales y jugos naturales con alto contenido de vitamina C. POSIBLE TRATAMIENTO. El tratamiento est�ndar      " +
                                                  "\n incluye una combinaci�n de antibi�ticos como isoniazida, rifampicina, etambutol y pirazinamida durante un per�odo de     " +
                                                  "\n al menos seis meses. Marcas reconocidas incluyen Rifater y Rimactane. Es fundamental seguir el tratamiento completo y     " +
                                                  "\n bajo supervisi�n m�dica para evitar reca�das o resistencia bacteriana. En adultos mayores, se debe ajustar la dosis en    " +
                                                  "\n caso de insuficiencia renal o hep�tica y monitorear posibles efectos secundarios. ALIMENTACI�N RECOMENDADA. Se recomienda " +
                                                  "\n una dieta rica en prote�nas, vitaminas y minerales para fortalecer el sistema inmunol�gico y apoyar la recuperaci�n.      " +
                                                  "\n Algunos alimentos clave incluyen carnes magras y pescado, fuentes de prote�nas esenciales. Frutas c�tricas como naranja   " +
                                                  "\n y kiwi, ricas en vitamina C, que ayudan a la recuperaci�n y fortalecimiento del sistema inmune, aportando el 89% del      " +
                                                  "\n requerimiento diario por cada 100 gramos. Verduras de hoja verde como espinaca y br�coli, que contienen hierro y          " +  
                                                  "\n antioxidantes esenciales para la producci�n de gl�bulos rojos, con un aporte del 15% del requerimiento diario por cada    " +
                                                  "\n 100 gramos. Frutos secos como almendras y nueces, ricos en vitamina E y �cidos grasos esenciales, que fortalecen el       " +
                                                  "\n sistema inmunol�gico y aportan el 37% del requerimiento diario por cada 28 gramos. Este diagn�stico es una referencia     " +
                                                  "\n l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga tuberculosis ni que el tratamiento    " +
                                                  "\n sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n La artritis es una inflamaci�n cr�nica de las articulaciones que puede provocar dolor, rigidez y p�rdida de movilidad,     " +
                                                  "\n siendo la osteoartritis la forma m�s com�n en la ancianidad, especialmente en rodillas, caderas y manos. EJERCICIO. Se     " +
                                                  "\n recomienda actividad f�sica moderada y adaptada a las capacidades de la persona, como caminatas suaves, ejercicios         " +
                                                  "\n acu�ticos o yoga terap�utico, que ayudan a mantener la flexibilidad, reducir la rigidez y fortalecer los m�sculos que      " +
                                                  "\n rodean las articulaciones. Tambi�n es �til realizar ejercicios de bajo impacto con apoyo, como bicicleta est�tica o        " +
                                                  "\n estiramientos guiados. HIDRATACI�N. Es fundamental consumir entre 2 y 2.5 litros de agua al d�a para mantener la           " +
                                                  "\n lubricaci�n de las articulaciones, facilitar la eliminaci�n de toxinas y reducir la inflamaci�n. Se sugiere complementar   " +
                                                  "\n con infusiones de c�rcuma o jengibre, que poseen propiedades antiinflamatorias naturales. POSIBLE TRATAMIENTO. El          " +
                                                  "\n tratamiento puede incluir medicamentos antiinflamatorios no esteroides como ibuprofeno o naproxeno, corticosteroides en    " +
                                                  "\n casos m�s severos, y f�rmacos modificadores de la enfermedad como el metotrexato. Tambi�n se recomienda fisioterapia,      " +
                                                  "\n terapia ocupacional y en algunos casos el uso de suplementos como glucosamina y condroitina para mejorar la salud          " +
                                                  "\n articular. ALIMENTACI�N RECOMENDADA. Consumir alimentos ricos en antioxidantes y �cidos grasos esenciales. Pescados grasos " +
                                                  "\n como salm�n y sardina, ricos en �cidos grasos Omega-3, que ayudan a reducir la inflamaci�n articular, aportando hasta el      " +
                                                  "\n 90% del requerimiento diario por cada 100 g. Frutas como ar�ndanos y fresas, ricas en vitamina C y antioxidantes, que         " +
                                                  "\n fortalecen el sistema inmunol�gico y reducen el da�o celular, aportando cerca del 70% del requerimiento diario por cada       " +
                                                  "\n 100 g. Verduras de hoja verde como espinaca y kale, que contienen hierro, calcio y vitamina K, esenciales para la salud       " + 
                                                  "\n �sea y articular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente  " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un   " +
                                                  "\n diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la   " +
                                                  "\n respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu   " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n La tosferina, o pertussis, es una infecci�n bacteriana que afecta las v�as respiratorias y puede causar tos intensa       " +
                                                  "\n y prolongada. En la ancianidad, puede ser m�s severa y provocar complicaciones respiratorias como neumon�a o              " +
                                                  "\n insuficiencia respiratoria. EJERCICIO. Se recomienda actividad f�sica ligera, como caminatas cortas o ejercicios de       " +
                                                  "\n respiraci�n profunda, para mejorar la oxigenaci�n sin agotar al paciente. Es importante evitar ambientes fr�os o          " +
                                                  "\n contaminados que puedan agravar los s�ntomas. HIDRATACI�N. Es fundamental consumir entre 2 y 2.5 litros de agua al        " +
                                                  "\n d�a para mantener las v�as respiratorias hidratadas y facilitar la eliminaci�n de mucosidad. Tambi�n se recomienda el     " +
                                                  "\n consumo de l�quidos tibios como infusiones de jengibre o t� de manzanilla para aliviar la garganta. POSIBLE TRATAMIENTO.  " +
                                                  "\n El tratamiento incluye antibi�ticos como azitromicina, claritromicina o eritromicina, que ayudan a eliminar la bacteria.  " +
                                                  "\n En casos con dificultad respiratoria, pueden utilizarse broncodilatadores. Se recomienda reposo y aislamiento durante     " +
                                                  "\n los primeros d�as para evitar contagios. ALIMENTACI�N RECOMENDADA. Consumir alimentos que fortalezcan el sistema          " +
                                                  "\n respiratorio. Frutas c�tricas como naranja y toronja, ricas en vitamina C, que ayudan a reducir la duraci�n de los        " +
                                                  "\n s�ntomas, aportando hasta el 89% del requerimiento diario por cada 100 g. Miel, con propiedades antimicrobianas y         " +
                                                  "\n calmantes para la garganta. Jengibre, con efectos antiinflamatorios que pueden aliviar la tos. Yogur natural, fuente de   " +
                                                  "\n probi�ticos que fortalecen la flora intestinal y el sistema inmune. Este es solo un diagn�stico predeterminado l�gico,    " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas" +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el     " +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le   " +
                                                  "\n recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Las paperas son una infecci�n viral que afecta las gl�ndulas salivales, causando inflamaci�n y dolor en la zona de la       " +
                                                  "\n mand�bula. En la ancianidad, pueden presentarse s�ntomas m�s intensos y riesgo de complicaciones como meningitis o          " +
                                                  "\n pancreatitis. EJERCICIO. Se recomienda actividad f�sica ligera mientras persistan los s�ntomas, como estiramientos          " +
                                                  "\n suaves o caminatas cortas, evitando esfuerzos que puedan aumentar la inflamaci�n. HIDRATACI�N. Es fundamental consumir      " +
                                                  "\n entre 2 y 2.5 litros de agua al d�a para ayudar al cuerpo a combatir la infecci�n y mantenerse hidratado. Se sugiere        " +
                                                  "\n complementar con l�quidos suaves como caldos o infusiones de manzanilla. POSIBLE TRATAMIENTO. No existe un tratamiento      " +
                                                  "\n antiviral espec�fico para las paperas. Se recomienda el uso de paracetamol para aliviar la fiebre y el dolor, evitando      " +
                                                  "\n el ibuprofeno y la aspirina. Tambi�n se sugiere el uso de compresas fr�as en la zona inflamada y reposo absoluto durante    " +
                                                  "\n los primeros d�as. ALIMENTACI�N RECOMENDADA. Consumir alimentos blandos y ricos en nutrientes. Frutas c�tricas como         " + 
                                                  "\n naranja y mandarina, ricas en vitamina C, que fortalecen el sistema inmunol�gico, aportando hasta el 89% del requerimiento  " +
                                                  "\n diario por cada 100 g. Yogur natural, fuente de probi�ticos que ayudan a mantener la flora intestinal. Verduras de hoja     " +
                                                  "\n verde como espinaca, que aportan hierro y antioxidantes esenciales para la recuperaci�n. Este es solo un diagn�stico        " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la       " +
                                                  "\n enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le        " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida)       " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n EJERCICIO: Durante la infecci�n por el virus del Zika se recomienda reposo absoluto, ya que el cuerpo necesita conservar        " +
                                                  "\n energ�a para combatir el virus. Una vez que los s�ntomas disminuyen, se pueden realizar caminatas lentas, estiramientos         " +
                                                  "\n suaves y ejercicios de respiraci�n profunda para mejorar la circulaci�n, reducir la rigidez muscular y favorecer la             " +
                                                  "\n oxigenaci�n celular. HIDRATACI�N: Es fundamental consumir entre 2.5 y 3 litros de agua al d�a para prevenir la deshidrataci�n,  " +
                                                  "\n regular la temperatura corporal y facilitar la eliminaci�n de toxinas. Tambi�n se recomienda el consumo de caldos naturales,    " +
                                                  "\n infusiones como t� de jengibre o manzanilla, y jugos naturales sin az�car a�adida, que adem�s de hidratar aportan               " +
                                                  "\n antioxidantes y alivian s�ntomas como la fiebre y el dolor muscular. POSIBLE TRATAMIENTO: No existe un tratamiento              " +
                                                  "\n antiviral espec�fico para el Zika, pero los s�ntomas pueden aliviarse con reposo, hidrataci�n constante y medicamentos          " +
                                                  "\n como el acetaminof�n para reducir la fiebre y el dolor. Es importante evitar el uso de aspirina y otros antiinflamatorios       " +
                                                  "\n no esteroideos hasta descartar la posibilidad de dengue, para reducir el riesgo de hemorragias. Tambi�n se recomienda           " +
                                                  "\n evitar el consumo de alcohol y tabaco durante la recuperaci�n, ya que pueden debilitar el sistema inmunol�gico. ALIMENTACI�N:   " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico,   " +
                                                  "\n tales como frutas c�tricas como naranjas y toronjas, verduras de hoja verde como espinacas y acelgas, y especias como jengibre  " +
                                                  "\n y c�rcuma, que poseen propiedades antiinflamatorias y antioxidantes. este es solo un diagn�stico predeterminado l�gico.         " + 
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. " +
                                                  "\n se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la   " +
                                                  "\n respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita  " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n EJERCICIO: Durante la infecci�n por rotavirus se recomienda reposo absoluto, ya que la diarrea, los v�mitos y la fiebre     " +
                                                  "\n pueden provocar debilidad extrema. Una vez superada la fase aguda, se pueden realizar ejercicios suaves como caminatas      " +
                                                  "\n lentas, estiramientos y respiraci�n profunda para estimular la circulaci�n, mejorar la oxigenaci�n y recuperar la energ�a.  " + 
                                                  "\n HIDRATACI�N: Es crucial consumir entre 2.5 y 3 litros de agua al d�a para prevenir la deshidrataci�n causada por la         " +
                                                  "\n p�rdida de l�quidos. Tambi�n se recomienda el uso de soluciones de rehidrataci�n oral que aporten sodio, potasio y          " +
                                                  "\n glucosa, as� como caldos naturales y jugos suaves sin az�car para reponer electrolitos y mantener el equilibrio h�drico.    " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento antiviral espec�fico para el rotavirus, pero los s�ntomas pueden aliviarse    " +
                                                  "\n con hidrataci�n intensiva, reposo y una dieta adecuada. Se deben evitar los medicamentos antidiarreicos, ya que pueden      " +
                                                  "\n prolongar la infecci�n. En casos graves, puede ser necesaria la administraci�n de l�quidos por v�a intravenosa. Tambi�n     " +
                                                  "\n se recomienda el consumo de probi�ticos para restaurar la flora intestinal. ALIMENTACI�N: Se recomienda el consumo de       " +
                                                  "\n alimentos que favorezcan la recuperaci�n del sistema digestivo, tales como yogur natural, frutas como pl�tanos y manzanas,  " +
                                                  "\n y verduras como zanahorias y calabacines, que contienen antioxidantes y vitaminas esenciales para la regeneraci�n de la     " +
                                                  "\n mucosa intestinal. este es solo un diagn�stico predeterminado l�gico. haberlo consultado no garantiza al 100% que la        " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar m�s de un         " +
                                                  "\n diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico no le    " +
                                                  "\n satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera      " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n EJERCICIO: Durante la infecci�n por listeria se recomienda evitar esfuerzos f�sicos intensos y priorizar el descanso, ya        " +
                                                  "\n que el cuerpo necesita conservar energ�a para combatir la bacteria. Una vez que los s�ntomas disminuyen, se pueden              " +
                                                  "\n realizar ejercicios suaves como caminatas lentas, estiramientos y respiraci�n profunda para mejorar la oxigenaci�n celular,     " +
                                                  "\n reducir la fatiga y prevenir la rigidez muscular. HIDRATACI�N: Es fundamental consumir entre 2.5 y 3 litros de agua al d�a      " +
                                                  "\n para ayudar a eliminar toxinas, mantener el equilibrio de los fluidos corporales y apoyar la funci�n renal durante el           " +
                                                  "\n tratamiento antibi�tico. Tambi�n se recomienda el consumo de caldos naturales, infusiones suaves y jugos sin az�car para        " +
                                                  "\n aportar electrolitos esenciales. Una hidrataci�n adecuada contribuye a la eliminaci�n de bacterias a trav�s de la orina y       " +
                                                  "\n mejora la tolerancia al tratamiento. POSIBLE TRATAMIENTO: La infecci�n por listeria se trata con antibi�ticos como ampicilina   " +
                                                  "\n o gentamicina, especialmente en casos graves o en pacientes inmunocomprometidos. En personas mayores, el tratamiento debe       " +
                                                  "\n iniciarse lo antes posible para evitar complicaciones como septicemia o meningitis. Tambi�n se recomienda evitar alimentos      " +
                                                  "\n de alto riesgo como productos l�cteos no pasteurizados, embutidos y pescados ahumados durante la recuperaci�n. ALIMENTACI�N:    " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico,   " +
                                                  "\n tales como frutas c�tricas, verduras de hoja verde como espinacas y acelgas, y frutos secos como almendras y nueces, que        " +
                                                  "\n contienen vitamina E y magnesio. este es solo un diagn�stico predeterminado l�gico. haberlo consultado no garantiza al 100%     " +
                                                  "\n que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar m�s de un      " +
                                                  "\n diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico no le        " +
                                                  "\n satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que      " +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la shigelosis es fundamental mantener una hidrataci�n adecuada con un consumo diario    " +
                                                  "\n recomendado de 2.5 litros de agua aproximadamente 10 vasos de tama�o regular para reponer los l�quidos perdidos por la      " +
                                                  "\n diarrea y prevenir la deshidrataci�n severa. EJERCICIO: Se recomienda reposo absoluto durante la fase aguda. Una vez        " +
                                                  "\n superada, se pueden incorporar caminatas suaves dentro del hogar y ejercicios de movilidad articular para recuperar         " +
                                                  "\n energ�a y mejorar la funci�n digestiva sin comprometer el equilibrio del organismo. POSIBLE TRATAMIENTO: El tratamiento     " +
                                                  "\n puede incluir antibi�ticos como ciprofloxacina, azitromicina o ceftriaxona en casos m�s severos. En adultos mayores, el     " +
                                                  "\n uso de antibi�ticos debe ser cuidadosamente evaluado por el m�dico debido al riesgo de resistencia bacteriana y posibles    " +
                                                  "\n interacciones con otros medicamentos. ALIMENTOS RECOMENDADOS: Para estabilizar el sistema digestivo se recomienda el        " +
                                                  "\n consumo de PL�TANOS: Ricos en potasio que ayudan a reemplazar los electrolitos perdidos aportando aproximadamente el 12%    " +
                                                  "\n de la ingesta diaria recomendada por cada 100 gramos. ARROZ BLANCO: Fuente de carbohidratos de f�cil digesti�n que ayuda    " +
                                                  "\n a estabilizar el sistema digestivo. ZANAHORIAS: Ricas en vitamina A y antioxidantes que ayudan a la regeneraci�n celular    " +
                                                  "\n aportando aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos  " +
                                                  "\n que fortalecen el sistema digestivo y mejoran la salud intestinal aportando calcio y prote�nas esenciales. Este es solo un  " +
                                                  "\n diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las  " +
                                                  "\n respuestas sean completamente correctas para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor" +
                                                  "\n seguridad en el tratamiento adecuado de su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del " +
                                                  "\n todo se le recomienda mucho consultar a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la EPOC es fundamental mantener una hidrataci�n adecuada con un consumo diario        " +
                                                  "\n recomendado de 2.5 litros de agua aproximadamente 10 vasos de tama�o regular para mantener las v�as respiratorias         " +
                                                  "\n hidratadas y facilitar la expulsi�n de mucosidad. EJERCICIO: Se recomienda actividad f�sica ligera como caminatas         " +
                                                  "\n lentas ejercicios de respiraci�n profunda y estiramientos suaves para mejorar la oxigenaci�n y la capacidad pulmonar.     " +
                                                  "\n Tambi�n se sugiere fisioterapia respiratoria adaptada a la capacidad funcional del paciente para mantener la movilidad    " +
                                                  "\n y prevenir la p�rdida de masa muscular. POSIBLE TRATAMIENTO: El tratamiento puede incluir broncodilatadores de acci�n     " +
                                                  "\n r�pida como el salbutamol corticosteroides inhalados como la fluticasona y en algunos casos terapia con ox�geno. Es       " +
                                                  "\n fundamental seguir estrictamente el plan de acci�n indicado por el m�dico y evitar la exposici�n a contaminantes          " +
                                                  "\n ambientales. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema respiratorio se recomienda el consumo de PESCADOS GRASOS: " +
                                                  "\n Como el salm�n y el at�n ricos en �cidos grasos Omega-3 con propiedades antiinflamatorias que aportan aproximadamente el  " +
                                                  "\n 50% de la ingesta diaria recomendada por cada 100 gramos. FRUTAS Y VERDURAS DE COLORES VIVOS: Como ar�ndanos fresas       " +
                                                  "\n espinacas y br�coli ricos en antioxidantes como la vitamina C y carotenoides que fortalecen el sistema inmunol�gico       " +
                                                  "\n aportando aproximadamente el 70% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Con compuestos           " +
                                                  "\n antiinflamatorios que pueden aliviar la inflamaci�n de las v�as respiratorias. C�RCUMA: Con curcumina que posee           " +
                                                  "\n propiedades antioxidantes y antiinflamatorias. Este es solo un diagn�stico predeterminado l�gico haberlo consultado       " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para        " +
                                                  "\n ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado      " +
                                                  "\n de su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho        " +
                                                  "\n consultar a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la clamidia es fundamental mantener una hidrataci�n adecuada con un consumo diario         " +
                                                  "\n recomendado de 2.5 litros de agua aproximadamente 10 vasos de tama�o regular para facilitar la eliminaci�n de toxinas          " +
                                                  "\n y apoyar el sistema inmunol�gico. EJERCICIO: Se recomienda actividad f�sica ligera como caminatas suaves ejercicios de         " +
                                                  "\n movilidad articular y estiramientos para mejorar la circulaci�n y fortalecer el sistema inmunol�gico evitando esfuerzos        " +
                                                  "\n intensos durante el tratamiento. POSIBLE TRATAMIENTO: El tratamiento suele incluir antibi�ticos como la azitromicina en        " +
                                                  "\n dosis �nica o la doxiciclina durante 7 d�as y en casos m�s severos levofloxacina. Es fundamental completar el tratamiento      " +
                                                  "\n y evitar relaciones sexuales hasta que se confirme la curaci�n para prevenir reinfecciones. ALIMENTOS RECOMENDADOS: Para       " +
                                                  "\n fortalecer el sistema inmunol�gico se recomienda el consumo de FRUTOS ROJOS: Ricos en antioxidantes y vitamina C que ayudan    " +
                                                  "\n a combatir infecciones bacterianas aportando aproximadamente el 70% de la ingesta diaria recomendada por cada 100 gramos.      " +
                                                  "\n JENGIBRE: Con propiedades antiinflamatorias que pueden ayudar a reducir la inflamaci�n. ESPINACAS Y BR�COLI: Aportan           " +
                                                  "\n antioxidantes y vitamina A esenciales para la regeneraci�n celular con un contenido de aproximadamente el 56% de la ingesta    " +
                                                  "\n diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos que fortalecen el sistema inmunol�gico y mejoran   " +
                                                  "\n la salud digestiva aportando calcio y prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico haberlo          " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas       " +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado      " +
                                                  "\n de su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar   " +
                                                  "\n a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 a 3 litros de agua al d�a para mantener la funci�n cerebral, facilitar la     " +
                                                  "\n eliminaci�n de toxinas y apoyar el sistema inmunol�gico. En mujeres en etapa de ancianidad, una hidrataci�n constante      " +
                                                  "\n tambi�n ayuda a prevenir la deshidrataci�n, que puede agravar los s�ntomas neurol�gicos y aumentar el riesgo de            " +
                                                  "\n complicaciones como confusi�n o delirio. EJERCICIO: Durante la fase aguda se recomienda reposo absoluto. Una vez           " +
                                                  "\n estabilizada, se puede retomar actividad f�sica ligera como caminatas suaves, ejercicios de respiraci�n profunda           " +
                                                  "\n y estiramientos controlados. Estas actividades ayudan a mejorar la circulaci�n cerebral, prevenir el deterioro funcional   " +
                                                  "\n y mantener la autonom�a. Tambi�n se recomienda realizar ejercicios de movilidad con apoyo para evitar ca�das. POSIBLE      " +
                                                  "\n TRATAMIENTO: El tratamiento inmediato incluye antibi�ticos intravenosos de amplio espectro como Ceftriaxona, Cefotaxima    " +
                                                  "\n o Ampicilina, ajustados seg�n el microorganismo identificado. Tambi�n se administran corticosteroides como la Dexametasona " +
                                                  "\n para reducir la inflamaci�n cerebral y prevenir complicaciones como p�rdida auditiva o convulsiones. En casos graves,      " +
                                                  "\n puede requerirse hospitalizaci�n prolongada, monitoreo neurol�gico intensivo y el uso de anticonvulsivos si se presentan   " +
                                                  "\n crisis. Adem�s, se recomienda el seguimiento con evaluaciones cognitivas y apoyo neuropsicol�gico para detectar posibles   " +
                                                  "\n secuelas. ALIMENTACI�N: Se recomienda una dieta rica en nutrientes neuroprotectores como: naranjas (ricas en vitamina C,   " +
                                                  "\n fortalecen el sistema inmune, 89% del requerimiento diario por cada 100 g); aguacate (fuente de vitamina E y �cidos grasos    " +
                                                  "\n saludables, 14% de la ingesta diaria por cada 100 g); pescados grasos (salm�n, at�n), ricos en Omega-3, que ayudan a reducir  " +
                                                  "\n la inflamaci�n cerebral (50% de la ingesta diaria por cada 100 g); huevos (aportan colina, esencial para la funci�n           " +
                                                  "\n cognitiva, 27% del requerimiento diario por unidad); y nueces (ricas en �cido alfa-linol�nico, un tipo de Omega-3 vegetal,    " +
                                                  "\n 91% por cada 30 g). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la         " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s      " +
                                                  "\n de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la          " +
                                                  "\n respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita    " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer. " +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 a 3 litros de agua al d�a para apoyar la funci�n renal, facilitar la       " +
                                                  "\n eliminaci�n de toxinas derivadas del tratamiento y mantener la homeostasis celular. En pacientes con c�ncer, una        " +
                                                  "\n hidrataci�n adecuada tambi�n ayuda a reducir los efectos secundarios de la quimioterapia como n�useas, fatiga y         " +
                                                  "\n estre�imiento. EJERCICIO: Actividad f�sica moderada y adaptada como caminatas, ejercicios de bajo impacto o yoga        " +
                                                  "\n suave puede mejorar la calidad de vida, reducir la fatiga y fortalecer el sistema inmunol�gico. Es importante           " +
                                                  "\n realizar una evaluaci�n funcional previa para ajustar la intensidad del ejercicio seg�n el estado f�sico de la          " +
                                                  "\n paciente. Tambi�n se recomienda la pr�ctica de ejercicios de respiraci�n y relajaci�n para mejorar la respuesta         " +
                                                  "\n del cuerpo al tratamiento. POSIBLE TRATAMIENTO: El tratamiento depende del tipo y estadio del c�ncer, pero puede        " +
                                                  "\n incluir quimioterapia, radioterapia, inmunoterapia, cirug�a y terapias dirigidas. En mujeres adultas mayores, se        " +
                                                  "\n realiza una valoraci�n geri�trica integral para personalizar el tratamiento, considerando comorbilidades, estado        " +
                                                  "\n funcional y tolerancia a los f�rmacos. Tambi�n se emplean terapias hormonales en ciertos tipos de c�ncer como el        " +
                                                  "\n de mama, y se utilizan medicamentos de soporte como antiem�ticos, analg�sicos y suplementos nutricionales para          " +
                                                  "\n mejorar la tolerancia al tratamiento. El acompa�amiento psicol�gico y el seguimiento nutricional son claves para        " +
                                                  "\n mantener la adherencia terap�utica y la estabilidad emocional. ALIMENTACI�N: Se recomienda una dieta rica en            " +
                                                  "\n antioxidantes, prote�nas y grasas saludables como: frutas c�tricas (naranjas, toronjas), con vitamina C (89% por        " +
                                                  "\n cada 100 g); aguacate, fuente de vitamina E y �cidos grasos monoinsaturados (14% por cada 100 g); pescados grasos       " +
                                                  "\n (salm�n, sardina), ricos en Omega-3 (50% por cada 100 g); verduras de hoja verde (espinacas, acelgas), con vitamina A   " +
                                                  "\n y hierro (56% y 15% respectivamente por cada 100 g); legumbres (lentejas, frijoles), con prote�nas vegetales y hierro   " +
                                                  "\n (37% por cada 100 g); y frutos secos (almendras, nueces), con selenio y zinc, que apoyan la funci�n inmune (45% y 30%   " +
                                                  "\n respectivamente por cada 30 g). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al   " +
                                                  "\n 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda " +
                                                  "\n realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Adem�s, por su   " +
                                                  "\n salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                    }
                }
             if (EdadFemenino.equals("Ancianidad = 75 a�os o mas")) {
            frame.setVisible(true);
        } else {
            frame.setVisible(false);
        }
            }
        public Estudio13() {
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
        Estudio13 ventanaEstudio13 = new Estudio13();
        ventanaEstudio13.crearInterfaz();
    }
}