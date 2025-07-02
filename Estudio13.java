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
         private final String edadEsperada = "Ancianidad = 75 años o mas";
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
                 if(EdadFemenino.equals("Ancianidad = 75 años o mas")){
                        if(EstaturaFemenino.equals("0.80-1.35 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener             " +
                                                  "\n una hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales.                " +
                                                  "\n EJERCICIO. Se recomienda actividad física ligera como caminatas suaves de 15 a 20 minutos al día, ejercicios de               " +
                                                  "\n respiración profunda y estiramientos suaves para mantener la circulación activa y mejorar la oxigenación sin agotar           " +
                                                  "\n al cuerpo. También es útil realizar ejercicios de movilidad articular para prevenir rigidez muscular durante el               " +
                                                  "\n reposo. HIDRATACIÓN. Se aconseja consumir entre 2.5 y 3 litros de agua al día para compensar la pérdida de líquidos           " +
                                                  "\n por fiebre y sudoración, mantener las mucosas hidratadas y facilitar la eliminación de toxinas. También se recomienda         " + 
                                                  "\n el consumo de caldos naturales, infusiones tibias de jengibre o manzanilla y jugos cítricos sin azúcar añadida para           " +
                                                  "\n reforzar el sistema inmunológico. POSIBLE TRATAMIENTO. El tratamiento para la influenza incluye antivirales como              " +
                                                  "\n oseltamivir (marca reconocida: Tamiflu) que deben administrarse en las primeras 48 horas de síntomas. También se              " +
                                                  "\n utilizan medicamentos para aliviar fiebre y dolor como paracetamol (Tempra) o ibuprofeno (Advil). Es importante el            " +
                                                  "\n reposo absoluto y evitar el contacto con otras personas para prevenir contagios. ALIMENTACIÓN RECOMENDADA. Se recomienda      " +
                                                  "\n una dieta rica en antioxidantes, vitamina C y zinc. Algunos alimentos clave incluyen frutas cítricas como naranja,            " +
                                                  "\n toronja y kiwi, ricas en vitamina C, que fortalecen el sistema inmune, aportando el 89% del requerimiento diario por          " +
                                                  "\n cada 100 gramos. Verduras como espinaca y brócoli, ricas en vitamina A y ácido fólico, que ayudan a la regeneración           " +
                                                  "\n celular y fortalecen las mucosas, con un aporte del 15% del requerimiento diario por cada 100 gramos. Frutos secos como       " +
                                                  "\n almendras y nueces, ricos en vitamina E y ácidos grasos esenciales, que protegen las células inmunológicas, con un aporte     " +
                                                  "\n del 37% del requerimiento diario por cada 28 gramos. Este diagnóstico es una referencia lógica basada en información          " +
                                                  "\n médica, pero no garantiza al 100% que el paciente tenga influenza ni que el tratamiento sea el adecuado. Se recomienda        " +
                                                  "\n realizar más de un diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes agradece tu visita a la app       " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener        " +
                                                  "\n una hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales.           " +
                                                  "\n EJERCICIO. Se recomienda reposo durante la fase aguda de la enfermedad. Una vez superada esta etapa, se pueden           " +
                                                  "\n incorporar caminatas suaves de 10 a 15 minutos al día, ejercicios de respiración profunda y estiramientos para           " +
                                                  "\n mejorar la oxigenación y prevenir la rigidez muscular. También es útil realizar ejercicios de equilibrio y               " +
                                                  "\n coordinación para recuperar la funcionalidad neurológica. HIDRATACIÓN. Se aconseja consumir entre 2.5 y 3 litros         " +
                                                  "\n de agua al día para mantener el equilibrio de líquidos, facilitar la eliminación de toxinas y apoyar la función          " +
                                                  "\n renal durante el tratamiento antibiótico. También se recomienda el consumo de caldos naturales, infusiones suaves        " +
                                                  "\n y jugos naturales ricos en vitamina C. POSIBLE TRATAMIENTO. El tratamiento para la neumonía incluye antibióticos         " +
                                                  "\n como amoxicilina con ácido clavulánico, ceftriaxona o levofloxacino, dependiendo del agente causal. Marcas reconocidas   " +
                                                  "\n incluyen Clavulin, Rocephin y Tavanic. En algunos casos se añaden corticosteroides como la dexametasona para reducir     " +
                                                  "\n la inflamación pulmonar. Es fundamental iniciar el tratamiento lo antes posible para evitar complicaciones. ALIMENTACIÓN " +
                                                  "\n RECOMENDADA. Se recomienda una dieta rica en proteínas, antioxidantes y vitaminas del complejo B. Algunos alimentos      " +
                                                  "\n clave incluyen carnes magras y pescado, fuentes de proteínas esenciales. Frutas cítricas como naranja y kiwi, ricas      " +
                                                  "\n en vitamina C, que fortalecen el sistema inmune, aportando el 89% del requerimiento diario por cada 100 gramos. Verduras " +
                                                  "\n como espinaca y brócoli, ricas en ácido fólico y vitamina B9, esenciales para la regeneración celular, con un aporte del " +
                                                  "\n 15% del requerimiento diario por cada 100 gramos. Frutos secos como almendras y nueces, ricos en vitamina E y ácidos     " +
                                                  "\n grasos esenciales, que protegen las células inmunológicas y aportan el 37% del requerimiento diario por cada 28 gramos.  " +
                                                  "\n Este diagnóstico es una referencia lógica basada en información médica, pero no garantiza al 100% que el paciente tenga   " +
                                                  "\n neumonía ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico para " +
                                                  "\n mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener         " +
                                                  "\n una hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales.            " +
                                                  "\n EJERCICIO. Se recomienda actividad física regular como caminatas de 20 a 30 minutos al día, ejercicios de resistencia     " +
                                                  "\n moderada y estiramientos. También se aconseja incluir ejercicios de fuerza dos veces por semana para prevenir la          " +
                                                  "\n pérdida de masa muscular y ósea. La actividad física mejora la sensibilidad a la insulina, regula la glucosa y reduce     " +
                                                  "\n el riesgo cardiovascular. HIDRATACIÓN. Se aconseja consumir entre 2 y 2.5 litros de agua al día para apoyar la función    " +
                                                  "\n renal, facilitar la absorción de medicamentos y prevenir infecciones urinarias. También se recomienda el consumo de       " +
                                                  "\n caldos naturales, infusiones sin azúcar y bebidas con electrolitos en caso de diarrea o fiebre. POSIBLE TRATAMIENTO.      " +
                                                  "\n El tratamiento para la diabetes incluye medicamentos orales como metformina, glibenclamida o sitagliptina, y en algunos   " +
                                                  "\n casos insulina. Marcas reconocidas incluyen Glucophage, Diamicron y Januvia. Es fundamental mantener una adherencia       " +
                                                  "\n estricta al tratamiento y realizar controles periódicos de glucosa. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta     " +
                                                  "\n equilibrada rica en fibra, proteínas magras y carbohidratos complejos. Algunos alimentos clave incluyen cereales          " +
                                                  "\n integrales como avena y arroz integral, que ayudan a mantener niveles estables de glucosa. Frutas como manzana y pera,    " +
                                                  "\n ricas en fibra soluble, que ralentizan la absorción de azúcar, con un aporte del 15% del requerimiento diario por cada    " +
                                                  "\n 100 gramos. Verduras como espinaca, brócoli y zanahoria, ricas en vitamina A, hierro y antioxidantes, que ayudan a        " +
                                                  "\n prevenir complicaciones. Frutos secos como almendras y nueces, ricos en vitamina E y ácidos grasos esenciales, con un     " +
                                                  "\n aporte del 37% del requerimiento diario por cada 28 gramos. Este diagnóstico es una referencia lógica basada en           " +
                                                  "\n información médica, pero no garantiza al 100% que el paciente tenga diabetes ni que el tratamiento sea el adecuado.       " +
                                                  "\n Se recomienda realizar más de un diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes agradece        " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n El asma es una enfermedad inflamatoria crónica de las vías respiratorias que puede causar dificultad para respirar, tos,      " +
                                                  "\n opresión en el pecho y sibilancias. En la ancianidad, los síntomas pueden confundirse con otras afecciones respiratorias,     " +
                                                  "\n y el riesgo de complicaciones aumenta debido a la disminución de la función pulmonar y la presencia de otras enfermedades     " +
                                                  "\n crónicas. EJERCICIO. Se recomienda actividad física moderada y controlada, como caminatas suaves, ejercicios de respiración   " +
                                                  "\n y estiramientos, evitando ambientes fríos o contaminados. Es importante realizar calentamiento previo y enfriamiento          " +
                                                  "\n posterior, así como adaptar la intensidad según la capacidad respiratoria del paciente. HIDRATACIÓN. Es fundamental           " +
                                                  "\n consumir entre 2 y 2.5 litros de agua al día para mantener las vías respiratorias hidratadas, facilitar la eliminación        " +
                                                  "\n de secreciones y reducir la irritación bronquial. También se recomienda el consumo de líquidos tibios como infusiones de      " +
                                                  "\n jengibre o manzanilla. POSIBLE TRATAMIENTO. El tratamiento incluye broncodilatadores de acción rápida como el salbutamol,     " +
                                                  "\n corticosteroides inhalados como la fluticasona o budesonida, y en algunos casos, modificadores de leucotrienos como el        " +
                                                  "\n montelukast. Es esencial seguir un plan de acción personalizado y utilizar los medicamentos preventivos de forma regular.     " +
                                                  "\n ALIMENTACIÓN RECOMENDADA. Consumir alimentos que reduzcan la inflamación y fortalezcan el sistema respiratorio. Pescados      " + 
                                                  "\n grasos como salmón y atún, ricos en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias, aportando hasta el       " +
                                                  "\n 90% del requerimiento diario por cada 100 g. Frutas como fresas y arándanos, ricas en vitamina C y antioxidantes, que         " +
                                                  "\n fortalecen el sistema inmune, aportando cerca del 70% del requerimiento diario por cada 100 g. Verduras como espinaca y       " +
                                                  "\n brócoli, ricas en hierro, vitamina A y carotenoides, esenciales para la salud pulmonar. Este es solo un diagnóstico           " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la         " +
                                                  "\n enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer   " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le          " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida)         " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n El VIH es un virus que debilita el sistema inmunológico, y si no se trata adecuadamente, puede progresar a SIDA,            " +
                                                  "\n una condición que deja al cuerpo vulnerable a infecciones y enfermedades graves. En la ancianidad, el diagnóstico           " +
                                                  "\n puede retrasarse y el tratamiento debe considerar otras condiciones crónicas. EJERCICIO. Se recomienda actividad            " +
                                                  "\n física moderada como caminatas, yoga o ejercicios de bajo impacto, que ayudan a fortalecer el sistema inmune, mejorar       " +
                                                  "\n el estado de ánimo y mantener la masa muscular. Es importante evitar el sobreesfuerzo y adaptar la rutina a la              " +
                                                  "\n condición física del paciente. HIDRATACIÓN. Es fundamental consumir entre 2 y 2.5 litros de agua al día para apoyar la      " +
                                                  "\n función renal, facilitar la eliminación de toxinas y mantener el equilibrio corporal. También se recomienda el consumo      " +
                                                  "\n de líquidos ricos en electrolitos en caso de fiebre o diarrea. POSIBLE TRATAMIENTO. El tratamiento consiste en terapia      " +
                                                  "\n antirretroviral (TAR), que incluye combinaciones de medicamentos como tenofovir, emtricitabina, dolutegravir o efavirenz,   " +
                                                  "\n que ayudan a mantener la carga viral indetectable y preservar la función inmunológica. Es esencial la adherencia estricta   " +
                                                  "\n al tratamiento y el monitoreo médico constante. ALIMENTACIÓN RECOMENDADA. Consumir alimentos que fortalezcan el sistema     " +
                                                  "\n inmunológico y prevengan la pérdida de peso. Frutas como papaya y guayaba, ricas en vitamina C, que fortalecen las defensas," +
                                                  "\n aportando hasta el 200% del requerimiento diario por cada 100 g. Lácteos como yogur natural, fuente de probióticos que      " +
                                                  "\n mejoran la flora intestinal. Carnes magras y huevos, ricos en proteínas de alta calidad, esenciales para la regeneración    " +
                                                  "\n celular. Verduras como espinaca y zanahoria, ricas en vitamina A, hierro y antioxidantes. Este es solo un diagnóstico       " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la       " +
                                                  "\n enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le        " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida)       " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n La gonorrea es una infección bacteriana de transmisión sexual causada por Neisseria gonorrhoeae, que puede afectar el       " +
                                                  "\n tracto genital, rectal o faríngeo. En mujeres mayores, puede pasar desapercibida o confundirse con otras afecciones,        " +
                                                  "\n aumentando el riesgo de complicaciones. EJERCICIO. Se recomienda actividad física ligera como caminatas o estiramientos     " +
                                                  "\n suaves, evitando esfuerzos intensos durante el tratamiento para no comprometer el sistema inmunológico. HIDRATACIÓN. Es     " +
                                                  "\n fundamental consumir entre 2 y 2.5 litros de agua al día para facilitar la eliminación de toxinas, mantener la función      " +
                                                  "\n renal y apoyar el proceso de recuperación. POSIBLE TRATAMIENTO. El tratamiento de primera línea consiste en una dosis       " +
                                                  "\n única intramuscular de ceftriaxona 500 mg. En caso de alergia o dificultad de acceso, puede utilizarse cefixima 800 mg      " +
                                                  "\n vía oral. Si no se ha descartado coinfección con clamidia, se añade doxiciclina 100 mg dos veces al día por 7 días. Es      " +
                                                  "\n importante tratar también a las parejas sexuales para evitar reinfección. ALIMENTACIÓN RECOMENDADA. Consumir alimentos      " +
                                                  "\n que fortalezcan el sistema inmunológico y favorezcan la recuperación. Frutas como kiwi y naranja, ricas en vitamina C,      " +
                                                  "\n que ayudan a combatir infecciones, aportando hasta el 90% del requerimiento diario por cada 100 g. Verduras como brócoli    " +
                                                  "\n y espinaca, ricas en ácido fólico, hierro y antioxidantes. Yogur natural, fuente de probióticos que fortalecen la flora     " +
                                                  "\n intestinal. Carnes magras, ricas en proteínas necesarias para la regeneración celular. Este es solo un diagnóstico          " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la       " +
                                                  "\n enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le        " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida)       " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n EJERCICIO: Durante los brotes activos de herpes genital se recomienda evitar la actividad física intensa y priorizar el        " +
                                                  "\n descanso, ya que el estrés físico puede agravar los síntomas y retrasar la cicatrización. Una vez que las lesiones hayan       " +
                                                  "\n sanado, se pueden retomar ejercicios suaves como caminatas lentas, estiramientos o yoga terapéutico, que ayudan a mejorar      " +
                                                  "\n la circulación, reducir la tensión muscular y fortalecer el sistema inmunológico. HIDRATACIÓN: Es fundamental consumir al      " +
                                                  "\n menos 2.5 litros de agua al día para mantener la piel y las mucosas hidratadas, lo que favorece la cicatrización de las        " +
                                                  "\n lesiones y ayuda a eliminar toxinas. También se recomienda el consumo de infusiones con propiedades antivirales y calmantes    " +
                                                  "\n como el té de manzanilla, té verde o infusión de caléndula, que pueden aliviar la irritación y reforzar las defensas naturales." +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento del herpes genital incluye antivirales como aciclovir, valaciclovir o famciclovir,         " +
                                                  "\n administrados por vía oral durante 7 a 10 días en episodios iniciales. En casos de recurrencias frecuentes, puede indicarse    " +
                                                  "\n tratamiento supresivo diario por varios meses o incluso años. En situaciones graves o en pacientes inmunocomprometidos, puede  " +
                                                  "\n ser necesario el uso de antivirales por vía intravenosa. También se pueden utilizar cremas anestésicas con lidocaína para      " +
                                                  "\n aliviar el dolor local, y es importante mantener la zona limpia y seca para evitar infecciones secundarias. ALIMENTACIÓN:      " +
                                                  "\n Se recomienda el consumo de alimentos que fortalezcan el sistema inmunológico y favorezcan la regeneración de tejidos, tales   " +
                                                  "\n como frutas cítricas como naranjas y toronjas, que aportan vitamina C en un 89% de la ingesta diaria recomendada. Yogur        " + 
                                                  "\n natural, que contiene probióticos que equilibran la flora vaginal y fortalecen las defensas. Verduras de hoja verde como       " +
                                                  "\n espinacas y acelgas, que aportan hasta un 50% de la ingesta diaria recomendada de vitamina A y K, esenciales para la           " +
                                                  "\n regeneración celular. Ajo y cebolla, que contienen compuestos sulfurados con propiedades antivirales y antioxidantes,          " +
                                                  "\n contribuyendo con hasta un 40% de la ingesta diaria recomendada de estos nutrientes. este es solo un diagnóstico predeterminado " +
                                                  "\n lógico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente  " +
                                                  "\n correctas. se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud,  " +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu       " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n EJERCICIO: Durante el tratamiento de la sífilis se recomienda evitar esfuerzos físicos intensos, especialmente si hay            " +
                                                  "\n síntomas como fiebre, fatiga o lesiones cutáneas. Una vez estabilizada la condición, se pueden realizar ejercicios               " +
                                                  "\n suaves como caminatas o estiramientos para mejorar la circulación, apoyar el sistema inmunológico y mantener la movilidad        " +
                                                  "\n articular. HIDRATACIÓN: Es esencial consumir entre 2 y 2.5 litros de agua al día para facilitar la eliminación de toxinas        " +
                                                  "\n y apoyar la función renal durante el tratamiento antibiótico. También se recomienda el consumo de infusiones como té de          " +
                                                  "\n diente de león o manzanilla, que ayudan a depurar el organismo y calmar el sistema digestivo. POSIBLE TRATAMIENTO: El            " +
                                                  "\n tratamiento estándar para la sífilis en etapas primaria, secundaria o latente precoz es una inyección intramuscular única        " +
                                                  "\n de penicilina G benzatina (2.4 millones de unidades). En casos de sífilis latente tardía o terciaria, se administran tres        " +
                                                  "\n dosis semanales consecutivas. Para personas alérgicas a la penicilina, se pueden usar doxiciclina o ceftriaxona. En pacientes    " +
                                                  "\n de edad avanzada, es fundamental realizar seguimiento clínico y serológico para confirmar la curación y evitar complicaciones    " +
                                                  "\n neurológicas. ALIMENTACIÓN: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunológico y favorezcan la        " +
                                                  "\n regeneración celular, tales como frutas como kiwi y fresas, que aportan vitamina C en un 90% de la ingesta diaria recomendada.   " +
                                                  "\n Verduras como brócoli y zanahorias, que contienen vitamina A y antioxidantes, aportando hasta un 50% de la ingesta diaria        " +
                                                  "\n recomendada. Frutos secos como almendras y nueces, que contienen vitamina E y zinc, contribuyendo con hasta un 40% de la         " +
                                                  "\n ingesta diaria recomendada de estos nutrientes esenciales para la reparación celular. este es solo un diagnóstico predeterminado " +
                                                  "\n lógico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente   " +
                                                  "\n correctas. se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud,   " +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu        " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n EJERCICIO: Durante el tratamiento de la tuberculosis se recomienda realizar actividad física moderada como caminatas    " +
                                                  "\n suaves o ejercicios de respiración para mejorar la capacidad pulmonar y reducir la fatiga. Es importante evitar el      " +
                                                  "\n esfuerzo físico excesivo, especialmente en las primeras semanas de tratamiento. La fisioterapia respiratoria puede ser  " +
                                                  "\n de gran ayuda para mejorar la oxigenación y la función pulmonar, especialmente en personas mayores. HIDRATACIÓN: Es     " +
                                                  "\n crucial consumir al menos 2.5 litros de agua al día para mantener las mucosas hidratadas, facilitar la expectoración y  " +
                                                  "\n apoyar la función renal durante el tratamiento prolongado con antibióticos. También se recomienda el consumo de caldos  " +
                                                  "\n naturales, infusiones suaves y jugos naturales sin azúcar para aportar líquidos y micronutrientes esenciales. Una       " +
                                                  "\n hidratación adecuada también ayuda a reducir la toxicidad de los medicamentos y mejora la tolerancia al tratamiento.    " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento estándar para la tuberculosis activa incluye una combinación de antibióticos como   " +
                                                  "\n isoniazida, rifampicina, pirazinamida y etambutol durante al menos 6 meses. Es fundamental seguir el esquema completo   " +
                                                  "\n sin interrupciones para evitar recaídas o resistencia bacteriana. En casos de tuberculosis resistente, se utilizan      " +
                                                  "\n medicamentos de segunda línea y el tratamiento puede extenderse hasta 18 meses. En personas mayores, se debe monitorear " +
                                                  "\n estrechamente la función hepática y renal durante el tratamiento. ALIMENTACIÓN: Se recomienda el consumo de alimentos       " +
                                                  "\n ricos en proteínas, vitaminas y minerales para fortalecer el sistema inmunológico y apoyar la regeneración pulmonar,        " +
                                                  "\n tales como carnes magras y legumbres, que aportan proteínas de alta calidad. Frutas como guayaba y papaya, que contienen    " +
                                                  "\n vitamina C en un 90% de la ingesta diaria recomendada, ayudando a combatir infecciones. Verduras como espinacas y brócoli,  " +
                                                  "\n que aportan hierro, vitamina A y ácido fólico, esenciales para la producción de glóbulos rojos y la reparación celular.     " +
                                                  "\n Frutos secos como nueces y semillas de girasol, que contienen vitamina E y selenio, contribuyendo con hasta un 40% de la       " +
                                                  "\n ingesta diaria recomendada de estos antioxidantes. este es solo un diagnóstico predeterminado lógico. haberlo consultado       " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda   " +
                                                  "\n realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud, si la respuesta del      " +
                                                  "\n diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app          " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la artritis es fundamental mantener una hidratación adecuada con un consumo diario         " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para favorecer la lubricación de          " +
                                                  "\n las articulaciones y reducir la rigidez matutina. EJERCICIO: Se recomienda actividad física regular y de bajo impacto          " +
                                                  "\n como caminatas suaves ejercicios de estiramiento o natación para mantener la movilidad articular y fortalecer los              " +
                                                  "\n músculos que rodean las articulaciones además se sugiere la práctica de ejercicios específicos de fisioterapia articular       " +
                                                  "\n y técnicas de relajación como el yoga adaptado. POSIBLE TRATAMIENTO: El tratamiento puede incluir medicamentos                 " +
                                                  "\n antiinflamatorios no esteroideos como el ibuprofeno o el naproxeno para aliviar el dolor y la inflamación además de            " +
                                                  "\n fármacos modificadores de la enfermedad como el metotrexato o la sulfasalazina en algunos casos se utilizan corticosteroides   " +
                                                  "\n o terapias biológicas como los inhibidores del TNF es fundamental seguir el tratamiento indicado por el reumatólogo y          " +
                                                  "\n realizar controles periódicos. ALIMENTOS RECOMENDADOS: Para reducir la inflamación y proteger las articulaciones se            " +
                                                  "\n recomienda el consumo de PESCADOS GRASOS: Como el salmón y la sardina ricos en ácidos grasos Omega-3 que aportan               " +
                                                  "\n aproximadamente el 50% de la ingesta diaria recomendada por cada 100 gramos. FRUTOS SECOS: Como nueces y almendras que         " +
                                                  "\n contienen vitamina E y grasas saludables con un aporte del 35% de la ingesta diaria recomendada por cada 30 gramos.            " +
                                                  "\n ESPINACAS Y BRÓCOLI: Ricos en antioxidantes vitamina A y vitamina K esenciales para la salud ósea y articular con un           " +
                                                  "\n aporte del 56% de la ingesta diaria recomendada por cada 100 gramos. CÚRCUMA: Contiene curcumina con propiedades               " +
                                                  "\n antiinflamatorias naturales. Este es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza al 100%         " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer         " +
                                                  "\n más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente además por          " +
                                                  "\n su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico Angel           " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la tosferina es fundamental mantener una hidratación adecuada con un consumo diario       " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para mantener las vías respiratorias     " +
                                                  "\n húmedas y facilitar la expulsión de mucosidad. EJERCICIO: Se recomienda reposo durante la fase aguda y posteriormente         " +
                                                  "\n actividad física ligera como caminatas lentas ejercicios de respiración profunda y estiramientos suaves para mejorar la       " +
                                                  "\n oxigenación y reducir la fatiga respiratoria. POSIBLE TRATAMIENTO: El tratamiento suele incluir antibióticos como la          " +
                                                  "\n azitromicina la claritromicina o la eritromicina especialmente si se inicia en las primeras fases de la enfermedad también    " +
                                                  "\n se pueden utilizar broncodilatadores y humidificadores para aliviar la tos es importante evitar el uso de medicamentos para   " +
                                                  "\n la tos sin prescripción médica. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema respiratorio se recomienda el consumo de   " +
                                                  "\n NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la duración de los síntomas aportando aproximadamente el 89%     " +
                                                  "\n de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Con propiedades antiinflamatorias que pueden aliviar la       " +
                                                  "\n irritación de garganta. MIEL Y LIMÓN: Combinación efectiva para calmar la tos y suavizar la garganta aportando flavonoides    " +
                                                  "\n y vitamina C. ESPINACAS Y BRÓCOLI: Aportan antioxidantes y vitamina A esenciales para la regeneración celular con un          " +
                                                  "\n contenido de aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos. Este es solo un diagnóstico            " +
                                                  "\n predeterminado lógico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas     " +
                                                  "\n sean completamente correctas para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad   " +
                                                  "\n en el tratamiento adecuado de su paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo se     " +
                                                  "\n le recomienda mucho consultar a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de las paperas es fundamental mantener una hidratación adecuada con un consumo diario         " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para prevenir la deshidratación y         " +
                                                  "\n aliviar la inflamación de las glándulas salivales. EJERCICIO: Se recomienda reposo durante la fase aguda y posteriormente      " +
                                                  "\n actividad física ligera como estiramientos suaves y caminatas cortas para recuperar energía sin forzar el sistema              " +
                                                  "\n inmunológico. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral específico para las paperas el manejo es sintomático     " +
                                                  "\n e incluye el uso de analgésicos como el paracetamol o el ibuprofeno para reducir el dolor y la fiebre además de compresas      " +
                                                  "\n frías en las glándulas inflamadas y aislamiento durante al menos cinco días desde el inicio de los síntomas. ALIMENTOS         " +
                                                  "\n RECOMENDADOS: Para aliviar los síntomas y fortalecer el sistema inmunológico se recomienda el consumo de SOPAS Y CALDOS:       " +
                                                  "\n Fáciles de tragar y nutritivos. NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la duración de los síntomas       " +
                                                  "\n aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Con propiedades               " +
                                                  "\n antiinflamatorias que pueden aliviar el malestar general. ESPINACAS Y BRÓCOLI: Aportan antioxidantes y vitamina A              " +
                                                  "\n esenciales para la regeneración celular con un contenido de aproximadamente 56% de la ingesta diaria recomendada por           " +
                                                  "\n cada 100 gramos. YOGUR NATURAL: Contiene probióticos que fortalecen el sistema inmunológico y mejoran la salud digestiva       " +
                                                  "\n aportando calcio y proteínas esenciales. Este es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza     " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda       " +
                                                  "\n hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente además        " +
                                                  "\n por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico Angel       " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 a 3 litros de agua al día (diez a doce vasos de agua de tamaño regular) para    " +
                                                  "\n prevenir la deshidratación causada por fiebre, sudoración y pérdida de apetito. En mujeres en etapa de ancianidad, una       " +
                                                  "\n hidratación constante también ayuda a mantener la función renal, reducir el riesgo de hipotensión y apoyar la eliminación    " +
                                                  "\n de toxinas virales. EJERCICIO: Durante la fase aguda se recomienda reposo absoluto. Una vez superados los síntomas, se       " +
                                                  "\n puede retomar actividad física ligera como caminatas suaves o ejercicios de estiramiento para mejorar la circulación y el    " +
                                                  "\n estado de ánimo. POSIBLE TRATAMIENTO: No existe un antiviral específico para el virus del Zika. El tratamiento es            " +
                                                  "\n sintomático e incluye Paracetamol para la fiebre y el dolor, antihistamínicos para el prurito y reposo. Se debe evitar el    " +
                                                  "\n uso de aspirina o AINEs hasta descartar dengue, por riesgo de hemorragias. También se recomienda el uso de repelentes,       " +
                                                  "\n mosquiteros y ropa protectora para evitar nuevas picaduras. En mujeres mayores, se debe vigilar la aparición de síntomas     " +
                                                  "\n neurológicos como debilidad muscular, visión borrosa o alteraciones sensoriales. ALIMENTACIÓN: Se sugiere una dieta rica     " +
                                                  "\n en antioxidantes y nutrientes inmunoestimulantes como: Naranjas (con vitamina C, 89% por cada 100 g); Kiwi (con vitamina C   " +
                                                  "\n y potasio, 92% y 7% respectivamente); Aguacate (con vitamina E, 14% por cada 100 g); Zanahorias (con vitamina A, 93% por     " +
                                                  "\n cada 100 g); y Jengibre (con compuestos antiinflamatorios y antivirales naturales). Este es solo un diagnóstico              " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas   " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor       " +
                                                  "\n seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se     " +
                                                  "\n recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 3 litros de agua al día (doce vasos de agua de tamaño regular), incluyendo          " +
                                                  "\n soluciones de rehidratación oral para reponer electrolitos perdidos por diarrea y vómitos. En mujeres mayores de 75          " +
                                                  "\n años, la deshidratación puede ser más severa, por lo que se debe vigilar la frecuencia urinaria, la presión arterial         " +
                                                  "\n y el estado de conciencia. EJERCICIO: Durante la fase aguda se recomienda reposo absoluto. Una vez superados los             " +
                                                  "\n síntomas, se puede retomar actividad física ligera para recuperar energía, estimular la digestión y prevenir la pérdida      " +
                                                  "\n de masa muscular. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral específico. El manejo es sintomático y se          " +
                                                  "\n enfoca en rehidratación intensiva, control de la fiebre con Paracetamol y dieta astringente. No se recomiendan antidiarreicos " +
                                                  "\n como la loperamida. En casos graves, puede requerirse hospitalización para administración de líquidos intravenosos. También   " +
                                                  "\n se sugiere el uso de probióticos para restaurar la flora intestinal. ALIMENTACIÓN: Se recomienda una dieta suave y rica       " +
                                                  "\n en nutrientes como: Plátanos (con potasio, 23% por cada 100 g); Arroz blanco (fácil digestión y fuente de energía); Manzanas  " +
                                                  "\n cocidas (con pectina, que regula el tránsito intestinal); Zanahorias cocidas (con vitamina A, 93% por cada 100 g); y Yogur    " +
                                                  "\n natural (con probióticos y calcio, 30% por cada 100 g). Este es solo un diagnóstico predeterminado lógico, haberlo consultado " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se  " +
                                                  "\n recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Además, por  " +
                                                  "\n su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 a 3 litros de agua al día (diez a doce vasos de agua de tamaño regular)       " +
                                                  "\n para apoyar la función renal, facilitar la eliminación de toxinas y mantener el equilibrio electrolítico. En mujeres       " +
                                                  "\n en etapa de ancianidad, una hidratación adecuada también ayuda a prevenir la hipotensión y la fatiga asociadas a la        " +
                                                  "\n infección. EJERCICIO: Durante la fase aguda se recomienda reposo absoluto. Una vez estabilizada, se puede retomar          " +
                                                  "\n actividad física ligera como caminatas suaves para mejorar la circulación y reducir la rigidez muscular. POSIBLE           " +
                                                  "\n TRATAMIENTO: El tratamiento incluye antibióticos intravenosos como Ampicilina o Penicilina G, frecuentemente combinados    " +
                                                  "\n con Gentamicina en casos graves. En mujeres adultas mayores, se debe ajustar la dosis según la función renal y             " +
                                                  "\n monitorear signos de meningitis o septicemia. También se recomienda evitar alimentos de alto riesgo como quesos            " +
                                                  "\n blandos no pasteurizados, embutidos y pescados ahumados. En casos neurológicos, puede requerirse hospitalización           " +
                                                  "\n prolongada y seguimiento con neuroimagen. ALIMENTACIÓN: Se sugiere una dieta rica en nutrientes inmunoestimulantes         " +
                                                  "\n como: Espinacas (con vitamina A y hierro, 56% y 15% por cada 100 g); Ajo (con propiedades antibacterianas naturales);      " +
                                                  "\n Zanahorias (con vitamina A, 93% por cada 100 g); Frutas cítricas (con vitamina C, 89% por cada 100 g); y Yogur natural     " +
                                                  "\n (con probióticos y calcio, 30% por cada 100 g). Este es solo un diagnóstico predeterminado lógico, haberlo consultado      " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para        " +
                                                  "\n ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado.  " +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.       " +
                                                  "\n Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una     " +
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO.     " +
                                                  "\n Durante la fase aguda se recomienda reposo absoluto para evitar complicaciones gastrointestinales. Una vez superada       " +
                                                  "\n esta etapa, se pueden incorporar caminatas suaves de 10 a 15 minutos al día, ejercicios de movilidad articular y          " +
                                                  "\n respiración profunda para estimular la circulación y la recuperación intestinal. También es útil realizar estiramientos   " +
                                                  "\n suaves para reducir la rigidez muscular y mantener la funcionalidad. HIDRATACIÓN. Se aconseja consumir entre 2.5 y 3      " +
                                                  "\n litros de agua al día para prevenir la deshidratación causada por la diarrea. También se recomienda el uso de soluciones  " +
                                                  "\n de rehidratación oral, caldos naturales y jugos suaves sin azúcar añadida. Se deben evitar bebidas con cafeína, alcohol   " +
                                                  "\n o alto contenido de azúcar, ya que pueden empeorar los síntomas. POSIBLE TRATAMIENTO. El tratamiento para la shigelosis   " +
                                                  "\n incluye reposo, rehidratación y en casos severos, antibióticos como ciprofloxacino o azitromicina. Marcas reconocidas     " +
                                                  "\n incluyen Ciproxin y Zitromax. No se deben usar medicamentos antidiarreicos como loperamida, ya que pueden agravar la      " +
                                                  "\n infección. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta blanda, baja en fibra y rica en nutrientes esenciales.       " +
                                                  "\n Algunos alimentos clave incluyen arroz blanco y puré de papa, que son fáciles de digerir y ayudan a estabilizar el        " +
                                                  "\n sistema digestivo. Yogur natural, fuente de probióticos que ayudan a restaurar la flora intestinal. Plátano, rico en      " +
                                                  "\n potasio, que ayuda a reponer electrolitos perdidos, aportando el 10% del requerimiento diario por cada 100 gramos.        " +
                                                  "\n Zanahoria cocida, rica en vitamina A, que fortalece las mucosas intestinales, con un aporte del 15% del requerimiento     " +
                                                  "\n diario por cada 100 gramos. Este diagnóstico es una referencia lógica basada en información médica, pero no garantiza     " +
                                                  "\n al 100% que el paciente tenga shigelosis ni que el tratamiento sea el adecuado. Se recomienda realizar más de un          " +
                                                  "\n diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera   " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener        " +
                                                  "\n una hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales.           " +
                                                  "\n EJERCICIO. Se recomienda actividad física moderada como caminatas diarias de 20 a 30 minutos, ejercicios de              " +
                                                  "\n respiración profunda y yoga terapéutico para fortalecer los pulmones y reducir la disnea. También es útil realizar       " +
                                                  "\n ejercicios de fortalecimiento muscular con bandas elásticas y técnicas de expansión torácica para mejorar la             " +
                                                  "\n capacidad pulmonar. HIDRATACIÓN. Se aconseja consumir entre 2.5 y 3 litros de agua al día para mantener las vías         " +
                                                  "\n respiratorias hidratadas, facilitar la eliminación de secreciones y apoyar la función renal. También se recomienda       " +
                                                  "\n el consumo de infusiones tibias como manzanilla o jengibre para aliviar la irritación bronquial. POSIBLE TRATAMIENTO.    " +
                                                  "\n El tratamiento para la EPOC incluye broncodilatadores de acción corta como salbutamol (Ventolin, Aerolin),               " +
                                                  "\n corticosteroides inhalados como fluticasona o budesonida (Flixotide, Pulmicort) y en algunos casos, anticolinérgicos     " +
                                                  "\n de acción prolongada como tiotropio (Spiriva). También se recomienda la rehabilitación pulmonar y el uso adecuado de     " +
                                                  "\n inhaladores. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica en antioxidantes, proteínas y grasas saludables.     " +
                                                  "\n Algunos alimentos clave incluyen pescados grasos como salmón y atún, ricos en omega-3, que reducen la inflamación        " +
                                                  "\n pulmonar, aportando el 70% del requerimiento diario por cada 100 gramos. Frutas como naranja, kiwi y papaya, ricas       " +
                                                  "\n en vitamina C, que fortalecen el sistema inmune, con un aporte del 89% del requerimiento diario por cada 100 gramos.     " +
                                                  "\n Verduras como espinaca y brócoli, ricas en vitamina A y ácido fólico, que protegen las mucosas respiratorias, con un     " +
                                                  "\n aporte del 15% del requerimiento diario por cada 100 gramos. Frutos secos como almendras y nueces, ricos en vitamina E   " +
                                                  "\n y ácidos grasos esenciales, con un aporte del 37% del requerimiento diario por cada 28 gramos. Este diagnóstico es una   " +
                                                  "\n referencia lógica basada en información médica, pero no garantiza al 100% que el paciente tenga EPOC ni que el           " +
                                                  "\n tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico para mayor seguridad.  " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una      " +
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO.      " +
                                                  "\n Se recomienda actividad física moderada como caminatas suaves, yoga o ejercicios de movilidad durante 30 minutos al        " +
                                                  "\n día para mejorar la circulación, reducir el estrés y fortalecer el sistema inmunológico. También es útil realizar          " +
                                                  "\n ejercicios de respiración y relajación para apoyar el bienestar general. HIDRATACIÓN. Se aconseja consumir entre 2         " +
                                                  "\n y 2.5 litros de agua al día para facilitar la eliminación de toxinas, apoyar la función renal y mantener las mucosas       " +
                                                  "\n hidratadas. También se recomienda el consumo de infusiones suaves como manzanilla o menta para aliviar molestias           " +
                                                  "\n urinarias. POSIBLE TRATAMIENTO. El tratamiento para la clamidia incluye antibióticos como azitromicina en dosis única      " +
                                                  "\n o doxiciclina durante 7 días. Marcas reconocidas incluyen Zitromax y Vibramycin. Es fundamental completar el tratamiento   " +
                                                  "\n y tratar también a la pareja sexual para evitar reinfección. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica en     " +
                                                  "\n antioxidantes, lisina y vitaminas del complejo B. Algunos alimentos clave incluyen yogur natural y leche, ricos en lisina, " +
                                                  "\n que inhibe la replicación bacteriana. Frutas como naranja, kiwi y papaya, ricas en vitamina C, que fortalecen el sistema   " +
                                                  "\n inmune, con un aporte del 89% del requerimiento diario por cada 100 gramos. Verduras como espinaca y zanahoria, ricas en   " +
                                                  "\n vitamina A y ácido fólico, que favorecen la regeneración celular y fortalecen las mucosas, con un aporte del 15% del       " +
                                                  "\n requerimiento diario por cada 100 gramos. Frutos secos como almendras y nueces, ricos en vitamina E y ácidos grasos        " +
                                                  "\n esenciales, que protegen las células inmunológicas, con un aporte del 37% del requerimiento diario por cada 28 gramos.     " +
                                                  "\n Este diagnóstico es una referencia lógica basada en información médica, pero no garantiza al 100% que el paciente tenga    " +
                                                  "\n clamidia ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico       " +
                                                  "\n para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n La meningitis bacteriana es una infección grave que inflama las membranas que rodean el cerebro y la médula espinal.     " +
                                                  "\n En la ancianidad, los síntomas pueden ser atípicos y presentarse como confusión, somnolencia o pérdida de apetito,       " +
                                                  "\n lo que dificulta su detección temprana. EJERCICIO. Se recomienda actividad física muy ligera durante la fase de          " +
                                                  "\n recuperación, como estiramientos suaves o caminatas cortas en ambientes tranquilos, evitando cualquier esfuerzo que      " +
                                                  "\n pueda aumentar la presión intracraneal o la fatiga. HIDRATACIÓN. Es fundamental consumir entre 2.5 y 3 litros de agua    " +
                                                  "\n al día para mantener el equilibrio de líquidos, apoyar la función renal y facilitar la eliminación de toxinas. También   " +
                                                  "\n se recomienda el consumo de caldos suaves o infusiones tibias para mantener la hidratación sin irritar el sistema        " +
                                                  "\n digestivo. POSIBLE TRATAMIENTO. El tratamiento incluye antibióticos intravenosos de amplio espectro como ceftriaxona     " +
                                                  "\n o vancomicina, ajustados según el agente causal identificado. En algunos casos se administra dexametasona como           " +
                                                  "\n antiinflamatorio adyuvante para reducir el riesgo de daño neurológico. Es crucial iniciar el tratamiento lo antes        " +
                                                  "\n posible para evitar complicaciones graves. ALIMENTACIÓN RECOMENDADA. Consumir alimentos ricos en vitaminas del           " +
                                                  "\n complejo B, antioxidantes y proteínas para apoyar la recuperación neurológica. Huevo cocido, fuente de vitamina B12 y    " +
                                                  "\n colina, esenciales para la función cerebral. Espinaca, rica en ácido fólico y hierro, que favorecen la oxigenación          " +
                                                  "\n cerebral, aportando hasta el 20% del requerimiento diario de hierro por cada 100 g. Frutas como plátano y manzana,          " +
                                                  "\n que aportan potasio y fibra soluble, ayudando a mantener el equilibrio electrolítico y la digestión. Yogur natural,         " +
                                                  "\n fuente de probióticos que fortalecen la flora intestinal y el sistema inmune. Este es solo un diagnóstico predeterminado    " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus     " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad  " +
                                                  "\n en el tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo     " +
                                                  "\n se le recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n El cáncer es un conjunto de enfermedades caracterizadas por el crecimiento descontrolado de células anormales que pueden     " +
                                                  "\n invadir tejidos y órganos. En la ancianidad, el tratamiento debe adaptarse a la condición física general, comorbilidades     " +
                                                  "\n y tipo de cáncer. EJERCICIO. Se recomienda actividad física moderada y personalizada, como caminatas, ejercicios de          " +
                                                  "\n resistencia con bandas elásticas o yoga suave, que ayudan a mantener la masa muscular, mejorar el estado de ánimo y          " +
                                                  "\n reducir la fatiga asociada al tratamiento. HIDRATACIÓN. Es fundamental consumir entre 2.5 y 3 litros de agua al día          " +       
                                                  "\n para apoyar la función renal, especialmente durante la quimioterapia o radioterapia, y facilitar la eliminación de           " +
                                                  "\n toxinas. También se recomienda el consumo de líquidos ricos en electrolitos si hay vómitos o diarrea. POSIBLE TRATAMIENTO.   " +
                                                  "\n El tratamiento puede incluir cirugía, quimioterapia, radioterapia, inmunoterapia o terapia hormonal, dependiendo del tipo    " +
                                                  "\n y estadio del cáncer. En adultos mayores, se prioriza un enfoque individualizado que equilibre eficacia y calidad de vida.   " +
                                                  "\n Medicamentos como letrozol, capecitabina o pembrolizumab pueden ser considerados según el caso. ALIMENTACIÓN RECOMENDADA.    " +
                                                  "\n Consumir alimentos ricos en antioxidantes, proteínas y vitaminas para fortalecer el sistema inmunológico y prevenir la       " +
                                                  "\n pérdida de peso. Frutas como papaya y guayaba, ricas en vitamina C, que fortalecen las defensas, aportando hasta el 200%     " +
                                                  "\n del requerimiento diario por cada 100 g. Carnes magras y huevos, fuentes de proteínas de alta calidad, esenciales para       " +
                                                  "\n la regeneración celular. Verduras como brócoli y zanahoria, ricas en vitamina A, ácido fólico y antioxidantes. Yogur         " +
                                                  "\n natural, fuente de probióticos que mejoran la flora intestinal y la absorción de nutrientes. Este es solo un diagnóstico     " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la        " +
                                                  "\n enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer  " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le         " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida)        " +
                                                  "\n y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.35-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener           " +
                                                  "\n una hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales.              " +
                                                  "\n EJERCICIO. Se recomienda actividad física ligera como caminatas suaves de 15 a 20 minutos al día, ejercicios de             " +
                                                  "\n respiración profunda y estiramientos suaves para mantener la circulación activa y mejorar la oxigenación sin agotar         " +
                                                  "\n al cuerpo. También es útil realizar ejercicios de movilidad articular para prevenir rigidez muscular durante el             " +
                                                  "\n reposo. HIDRATACIÓN. Se aconseja consumir entre 2.5 y 3 litros de agua al día para compensar la pérdida de líquidos         " +
                                                  "\n por fiebre y sudoración, mantener las mucosas hidratadas y facilitar la eliminación de toxinas. También se recomienda       " +
                                                  "\n el consumo de caldos naturales, infusiones tibias de jengibre o manzanilla y jugos cítricos sin azúcar añadida para         " +
                                                  "\n reforzar el sistema inmunológico. POSIBLE TRATAMIENTO. El tratamiento para la influenza incluye antivirales como            " +
                                                  "\n oseltamivir (marca reconocida: Tamiflu) que deben administrarse en las primeras 48 horas de síntomas. También se            " +
                                                  "\n utilizan medicamentos para aliviar fiebre y dolor como paracetamol (Tempra) o ibuprofeno (Advil). Es importante el          " +
                                                  "\n reposo absoluto y evitar el contacto con otras personas para prevenir contagios. ALIMENTACIÓN RECOMENDADA. Se recomienda    " +
                                                  "\n una dieta rica en antioxidantes, vitamina C y zinc. Algunos alimentos clave incluyen frutas cítricas como naranja,          " +
                                                  "\n toronja y kiwi, ricas en vitamina C, que fortalecen el sistema inmune, aportando el 89% del requerimiento diario por cada   " +
                                                  "\n 100 gramos. Verduras como espinaca y brócoli, ricas en vitamina A y ácido fólico, que ayudan a la regeneración celular y    " +
                                                  "\n fortalecen las mucosas, con un aporte del 15% del requerimiento diario por cada 100 gramos. Frutos secos como almendras     " +
                                                  "\n y nueces, ricos en vitamina E y ácidos grasos esenciales, que protegen las células inmunológicas, con un aporte del 37%     " +
                                                  "\n del requerimiento diario por cada 28 gramos. Este diagnóstico es una referencia lógica basada en información médica, pero   " +
                                                  "\n no garantiza al 100% que el paciente tenga influenza ni que el tratamiento sea el adecuado. Se recomienda realizar más de   " +
                                                  "\n un diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera  " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener    " +
                                                  "\n una hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales.       " +
                                                  "\n EJERCICIO. Se recomienda reposo durante la fase aguda de la enfermedad. Una vez superada esta etapa, se pueden       " +
                                                  "\n incorporar caminatas suaves de 10 a 15 minutos al día, ejercicios de respiración profunda y estiramientos para       " +
                                                  "\n mejorar la oxigenación y prevenir la rigidez muscular. También es útil realizar ejercicios de equilibrio y           " +
                                                  "\n coordinación para recuperar la funcionalidad neurológica. HIDRATACIÓN. Se aconseja consumir entre 2.5 y 3 litros          " +
                                                  "\n de agua al día para mantener el equilibrio de líquidos, facilitar la eliminación de toxinas y apoyar la función           " +
                                                  "\n renal durante el tratamiento antibiótico. También se recomienda el consumo de caldos naturales, infusiones suaves         " +
                                                  "\n y jugos naturales ricos en vitamina C. POSIBLE TRATAMIENTO. El tratamiento para la neumonía incluye antibióticos          " +
                                                  "\n como amoxicilina con ácido clavulánico, ceftriaxona o levofloxacino, dependiendo del agente causal. Marcas reconocidas    " +
                                                  "\n incluyen Clavulin, Rocephin y Tavanic. En algunos casos se añaden corticosteroides como la dexametasona para reducir      " +
                                                  "\n la inflamación pulmonar. Es fundamental iniciar el tratamiento lo antes posible para evitar complicaciones. ALIMENTACIÓN  " + 
                                                  "\n RECOMENDADA. Se recomienda una dieta rica en proteínas, antioxidantes y vitaminas del complejo B. Algunos alimentos       " +
                                                  "\n clave incluyen carnes magras y pescado, fuentes de proteínas esenciales. Frutas cítricas como naranja y kiwi, ricas       " +
                                                  "\n en vitamina C, que fortalecen el sistema inmune, aportando el 89% del requerimiento diario por cada 100 gramos. Verduras  " +
                                                  "\n como espinaca y brócoli, ricas en ácido fólico y vitamina B9, esenciales para la regeneración celular, con un aporte del  " +
                                                  "\n 15% del requerimiento diario por cada 100 gramos. Frutos secos como almendras y nueces, ricos en vitamina E y ácidos      " +
                                                  "\n grasos esenciales, que protegen las células inmunológicas y aportan el 37% del requerimiento diario por cada 28 gramos.   " +
                                                  "\n Este diagnóstico es una referencia lógica basada en información médica, pero no garantiza al 100% que el paciente tenga   " +
                                                  "\n neumonía ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico      " +
                                                  "\n para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener    " +
                                                  "\n una hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales.       " +
                                                  "\n EJERCICIO. Se recomienda actividad física regular como caminatas de 20 a 30 minutos al día, ejercicios de            " +
                                                  "\n resistencia moderada y estiramientos. También se aconseja incluir ejercicios de fuerza dos veces por semana para     " +
                                                  "\n prevenir la pérdida de masa muscular y ósea. La actividad física mejora la sensibilidad a la insulina, regula la     " +
                                                  "\n glucosa y reduce el riesgo cardiovascular. HIDRATACIÓN. Se aconseja consumir entre 2 y 2.5 litros de agua al día     " +
                                                  "\n para apoyar la función renal, facilitar la absorción de medicamentos y prevenir infecciones urinarias. También se    " +
                                                  "\n recomienda el consumo de caldos naturales, infusiones sin azúcar y bebidas con electrolitos en caso de diarrea o     " +
                                                  "\n fiebre. POSIBLE TRATAMIENTO. El tratamiento para la diabetes incluye medicamentos orales como metformina,            " +
                                                  "\n glibenclamida o sitagliptina, y en algunos casos insulina. Marcas reconocidas incluyen Glucophage, Diamicron y       " +
                                                  "\n Januvia. Es fundamental mantener una adherencia estricta al tratamiento y realizar controles periódicos de glucosa.  " +
                                                  "\n ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta equilibrada rica en fibra, proteínas magras y carbohidratos        " +
                                                  "\n complejos. Algunos alimentos clave incluyen cereales integrales como avena y arroz integral, que ayudan a mantener   " +
                                                  "\n niveles estables de glucosa. Frutas como manzana y pera, ricas en fibra soluble, que ralentizan la absorción de      " +
                                                  "\n azúcar, con un aporte del 15% del requerimiento diario por cada 100 gramos. Verduras como espinaca, brócoli y        " +
                                                  "\n zanahoria, ricas en vitamina A, hierro y antioxidantes, que ayudan a prevenir complicaciones. Frutos secos como      " + 
                                                  "\n almendras y nueces, ricos en vitamina E y ácidos grasos esenciales, con un aporte del 37% del requerimiento diario   " +
                                                  "\n por cada 28 gramos. Este diagnóstico es una referencia lógica basada en información médica, pero no garantiza al     " +
                                                  "\n 100% que el paciente tenga diabetes ni que el tratamiento sea el adecuado. Se recomienda realizar más de un          " +
                                                  "\n diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida)       " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n El asma es una enfermedad inflamatoria crónica de las vías respiratorias que puede causar dificultad para respirar,  " +
                                                  "\n tos, opresión en el pecho y sibilancias. En la ancianidad, los síntomas pueden confundirse con otras afecciones      " +
                                                  "\n respiratorias, y el riesgo de complicaciones aumenta debido a la disminución de la función pulmonar y la presencia   " +
                                                  "\n de otras enfermedades crónicas. EJERCICIO. Se recomienda actividad física moderada y controlada, como caminatas      " +
                                                  "\n suaves, ejercicios de respiración y estiramientos, evitando ambientes fríos o contaminados. Es importante realizar   " +
                                                  "\n calentamiento previo y enfriamiento posterior, así como adaptar la intensidad según la capacidad respiratoria del    " +
                                                  "\n paciente. HIDRATACIÓN. Es fundamental consumir entre 2 y 2.5 litros de agua al día para mantener las vías            " +
                                                  "\n respiratorias hidratadas, facilitar la eliminación de secreciones y reducir la irritación bronquial. También se      " +
                                                  "\n recomienda el consumo de líquidos tibios como infusiones de jengibre o manzanilla. POSIBLE TRATAMIENTO. El           " +
                                                  "\n tratamiento incluye broncodilatadores de acción rápida como el salbutamol, corticosteroides inhalados como la        " +
                                                  "\n fluticasona o budesonida, y en algunos casos, modificadores de leucotrienos como el montelukast. Es esencial seguir  " +
                                                  "\n un plan de acción personalizado y utilizar los medicamentos preventivos de forma regular. ALIMENTACIÓN RECOMENDADA.  " +
                                                  "\n Consumir alimentos que reduzcan la inflamación y fortalezcan el sistema respiratorio. Pescados grasos como salmón    " +
                                                  "\n y atún, ricos en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias, aportando hasta el 90% del         " +
                                                  "\n requerimiento diario por cada 100 g. Frutas como fresas y arándanos, ricas en vitamina C y antioxidantes, que        " +
                                                  "\n fortalecen el sistema inmune, aportando cerca del 70% del requerimiento diario por cada 100 g. Verduras como         " +
                                                  "\n espinaca y brócoli, ricas en hierro, vitamina A y carotenoides, esenciales para la salud pulmonar. Este es solo      " +
                                                  "\n un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad   " +
                                                  "\n y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico   " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la      " +
                                                  "\n respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Ángel L Montes      " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n El VIH es un virus que debilita el sistema inmunológico, y si no se trata adecuadamente, puede progresar a SIDA,        " +
                                                  "\n una condición que deja al cuerpo vulnerable a infecciones y enfermedades graves. En la ancianidad, el diagnóstico       " +
                                                  "\n puede retrasarse y el tratamiento debe considerar otras condiciones crónicas. EJERCICIO. Se recomienda actividad        " +
                                                  "\n física moderada como caminatas, yoga o ejercicios de bajo impacto, que ayudan a fortalecer el sistema inmune,           " +
                                                  "\n mejorar el estado de ánimo y mantener la masa muscular. Es importante evitar el sobreesfuerzo y adaptar la rutina       " +
                                                  "\n a la condición física del paciente. HIDRATACIÓN. Es fundamental consumir entre 2 y 2.5 litros de agua al día para       " +
                                                  "\n apoyar la función renal, facilitar la eliminación de toxinas y mantener el equilibrio corporal. También se recomienda   " +
                                                  "\n el consumo de líquidos ricos en electrolitos en caso de fiebre o diarrea. POSIBLE TRATAMIENTO. El tratamiento           " +
                                                  "\n consiste en terapia antirretroviral (TAR), que incluye combinaciones de medicamentos como tenofovir, emtricitabina,     " +
                                                  "\n dolutegravir o efavirenz, que ayudan a mantener la carga viral indetectable y preservar la función inmunológica. Es     " +
                                                  "\n esencial la adherencia estricta al tratamiento y el monitoreo médico constante. ALIMENTACIÓN RECOMENDADA. Consumir      " +
                                                  "\n alimentos que fortalezcan el sistema inmunológico y prevengan la pérdida de peso. Frutas como papaya y guayaba,         " +
                                                  "\n ricas en vitamina C, que fortalecen las defensas, aportando hasta el 200% del requerimiento diario por cada 100 g.      " +
                                                  "\n Lácteos como yogur natural, fuente de probióticos que mejoran la flora intestinal. Carnes magras y huevos, ricos        " +
                                                  "\n en proteínas de alta calidad, esenciales para la regeneración celular. Verduras como espinaca y zanahoria, ricas        " +
                                                  "\n en vitamina A, hierro y antioxidantes. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no         " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas,   " +
                                                  "\n para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento        " +
                                                  "\n adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le             " +
                                                  "\n recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n La gonorrea es una infección bacteriana de transmisión sexual causada por Neisseria gonorrhoeae, que puede afectar         " +
                                                  "\n el tracto genital, rectal o faríngeo. En mujeres mayores, puede pasar desapercibida o confundirse con otras afecciones,    " +
                                                  "\n aumentando el riesgo de complicaciones. EJERCICIO. Se recomienda actividad física ligera como caminatas o estiramientos    " +
                                                  "\n suaves, evitando esfuerzos intensos durante el tratamiento para no comprometer el sistema inmunológico. HIDRATACIÓN. Es    " +
                                                  "\n fundamental consumir entre 2 y 2.5 litros de agua al día para facilitar la eliminación de toxinas, mantener la función     " +
                                                  "\n renal y apoyar el proceso de recuperación. POSIBLE TRATAMIENTO. El tratamiento de primera línea consiste en una dosis      " +
                                                  "\n única intramuscular de ceftriaxona 500 mg. En caso de alergia o dificultad de acceso, puede utilizarse cefixima 800 mg     " +
                                                  "\n vía oral. Si no se ha descartado coinfección con clamidia, se añade doxiciclina 100 mg dos veces al día por 7 días. Es     " +
                                                  "\n importante tratar también a las parejas sexuales para evitar reinfección. ALIMENTACIÓN RECOMENDADA. Consumir alimentos     " +
                                                  "\n que fortalezcan el sistema inmunológico y favorezcan la recuperación. Frutas como kiwi y naranja, ricas en vitamina C,     " +
                                                  "\n que ayudan a combatir infecciones, aportando hasta el 90% del requerimiento diario por cada 100 g. Verduras como brócoli   " +
                                                  "\n y espinaca, ricas en ácido fólico, hierro y antioxidantes. Yogur natural, fuente de probióticos que fortalecen la flora    " +
                                                  "\n intestinal. Carnes magras, ricas en proteínas necesarias para la regeneración celular. Este es solo un diagnóstico         " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la      " +
                                                  "\n enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer " + 
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le   " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida)  " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n EJERCICIO: Durante los brotes activos de herpes genital se recomienda evitar la actividad física intensa y priorizar        " +
                                                  "\n el descanso, ya que el estrés físico puede agravar los síntomas y retrasar la cicatrización. Una vez que las lesiones       " +
                                                  "\n hayan sanado, se pueden retomar ejercicios suaves como caminatas lentas, estiramientos o yoga terapéutico, que ayudan       " +
                                                  "\n a mejorar la circulación, reducir la tensión muscular y fortalecer el sistema inmunológico. HIDRATACIÓN: Es fundamental     " +
                                                  "\n consumir al menos 2.5 litros de agua al día para mantener la piel y las mucosas hidratadas, lo que favorece la              " +
                                                  "\n cicatrización de las lesiones y ayuda a eliminar toxinas. También se recomienda el consumo de infusiones con propiedades    " +
                                                  "\n antivirales y calmantes como el té de manzanilla, té verde o infusión de caléndula, que pueden aliviar la irritación y      " +
                                                  "\n reforzar las defensas naturales. POSIBLE TRATAMIENTO: El tratamiento del herpes genital incluye antivirales como            " +
                                                  "\n aciclovir, valaciclovir o famciclovir, administrados por vía oral durante 7 a 10 días en episodios iniciales. En            " +
                                                  "\n casos de recurrencias frecuentes, puede indicarse tratamiento supresivo diario por varios meses o incluso años. En          " +
                                                  "\n situaciones graves o en pacientes inmunocomprometidos, puede ser necesario el uso de antivirales por vía intravenosa.       " +
                                                  "\n También se pueden utilizar cremas anestésicas con lidocaína para aliviar el dolor local, y es importante mantener la        " +
                                                  "\n zona limpia y seca para evitar infecciones secundarias. ALIMENTACIÓN: Se recomienda el consumo de alimentos que             " +
                                                  "\n fortalezcan el sistema inmunológico y favorezcan la regeneración de tejidos, tales como frutas cítricas como naranjas       " +
                                                  "\n y toronjas, que aportan vitamina C en un 89% de la ingesta diaria recomendada. Yogur natural, que contiene probióticos      " +
                                                  "\n que equilibran la flora vaginal y fortalecen las defensas. Verduras de hoja verde como espinacas y acelgas, que aportan     " +
                                                  "\n hasta un 50% de la ingesta diaria recomendada de vitamina A y K, esenciales para la regeneración celular. Ajo y cebolla,    " +
                                                  "\n que contienen compuestos sulfurados con propiedades antivirales y antioxidantes, contribuyendo con hasta un 40% de la       " +
                                                  "\n ingesta diaria recomendada de estos nutrientes. este es solo un diagnóstico predeterminado lógico. haberlo consultado       " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se           " +
                                                  "\n recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud, si la      " +
                                                  "\n respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu         " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n EJERCICIO: Durante el tratamiento de la sífilis se recomienda evitar esfuerzos físicos intensos, especialmente si hay     " +
                                                  "\n síntomas como fiebre, fatiga o lesiones cutáneas. Una vez estabilizada la condición, se pueden realizar ejercicios        " +
                                                  "\n suaves como caminatas o estiramientos para mejorar la circulación, apoyar el sistema inmunológico y mantener la           " +
                                                  "\n movilidad articular. HIDRATACIÓN: Es esencial consumir entre 2 y 2.5 litros de agua al día para facilitar la eliminación  " +
                                                  "\n de toxinas y apoyar la función renal durante el tratamiento antibiótico. También se recomienda el consumo de infusiones   " +
                                                  "\n como té de diente de león o manzanilla, que ayudan a depurar el organismo y calmar el sistema digestivo. POSIBLE          " +
                                                  "\n TRATAMIENTO: El tratamiento estándar para la sífilis en etapas primaria, secundaria o latente precoz es una inyección     " +
                                                  "\n intramuscular única de penicilina G benzatina (2.4 millones de unidades). En casos de sífilis latente tardía o terciaria, " +
                                                  "\n se administran tres dosis semanales consecutivas. Para personas alérgicas a la penicilina, se pueden usar doxiciclina o   " +
                                                  "\n ceftriaxona. En pacientes de edad avanzada, es fundamental realizar seguimiento clínico y serológico para confirmar la    " +
                                                  "\n curación y evitar complicaciones neurológicas. ALIMENTACIÓN: Se recomienda el consumo de alimentos que fortalezcan el     " +
                                                  "\n sistema inmunológico y favorezcan la regeneración celular, tales como frutas como kiwi y fresas, que aportan vitamina C   " + 
                                                  "\n en un 90% de la ingesta diaria recomendada. Verduras como brócoli y zanahorias, que contienen vitamina A y antioxidantes, " +
                                                  "\n aportando hasta un 50% de la ingesta diaria recomendada. Frutos secos como almendras y nueces, que contienen vitamina E   " +
                                                  "\n y zinc, contribuyendo con hasta un 40% de la ingesta diaria recomendada de estos nutrientes esenciales para la reparación " +
                                                  "\n celular. este es solo un diagnóstico predeterminado lógico. haberlo consultado no garantiza al 100% que la paciente       " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar más de un diagnóstico    " +
                                                  "\n para mayor seguridad en el tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico no le satisface    " +
                                                  "\n del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n EJERCICIO: Durante el tratamiento de la tuberculosis se recomienda realizar actividad física moderada como caminatas      " +
                                                  "\n suaves o ejercicios de respiración para mejorar la capacidad pulmonar y reducir la fatiga. Es importante evitar el        " + 
                                                  "\n esfuerzo físico excesivo, especialmente en las primeras semanas de tratamiento. La fisioterapia respiratoria puede        " +
                                                  "\n ser de gran ayuda para mejorar la oxigenación y la función pulmonar, especialmente en personas mayores. HIDRATACIÓN:      " +
                                                  "\n Es crucial consumir al menos 2.5 litros de agua al día para mantener las mucosas hidratadas, facilitar la expectoración   " +
                                                  "\n y apoyar la función renal durante el tratamiento prolongado con antibióticos. También se recomienda el consumo de caldos  " +
                                                  "\n naturales, infusiones suaves y jugos naturales sin azúcar para aportar líquidos y micronutrientes esenciales. Una         " +
                                                  "\n hidratación adecuada también ayuda a reducir la toxicidad de los medicamentos y mejora la tolerancia al tratamiento.      " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento estándar para la tuberculosis activa incluye una combinación de antibióticos como     " +
                                                  "\n isoniazida, rifampicina, pirazinamida y etambutol durante al menos 6 meses. Es fundamental seguir el esquema completo     " +
                                                  "\n sin interrupciones para evitar recaídas o resistencia bacteriana. En casos de tuberculosis resistente, se utilizan        " +
                                                  "\n medicamentos de segunda línea y el tratamiento puede extenderse hasta 18 meses. En personas mayores, se debe monitorear   " +
                                                  "\n estrechamente la función hepática y renal durante el tratamiento. ALIMENTACIÓN: Se recomienda el consumo de alimentos     " +
                                                  "\n ricos en proteínas, vitaminas y minerales para fortalecer el sistema inmunológico y apoyar la regeneración pulmonar,      " +
                                                  "\n tales como carnes magras y legumbres, que aportan proteínas de alta calidad. Frutas como guayaba y papaya, que contienen  " +
                                                  "\n vitamina C en un 90% de la ingesta diaria recomendada, ayudando a combatir infecciones. Verduras como espinacas y brócoli,  " +
                                                  "\n que aportan hierro, vitamina A y ácido fólico, esenciales para la producción de glóbulos rojos y la reparación celular.     " +
                                                  "\n Frutos secos como nueces y semillas de girasol, que contienen vitamina E y selenio, contribuyendo con hasta un 40% de la    " +
                                                  "\n ingesta diaria recomendada de estos antioxidantes. este es solo un diagnóstico predeterminado lógico. haberlo consultado    " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda" +
                                                  "\n realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud, si la respuesta del   " +
                                                  "\n diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app       " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la artritis es fundamental mantener una hidratación adecuada con un consumo diario       " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para favorecer la lubricación de        " +
                                                  "\n las articulaciones y reducir la rigidez matutina. EJERCICIO: Se recomienda actividad física regular y de bajo impacto        " +
                                                  "\n como caminatas suaves ejercicios de estiramiento o natación para mantener la movilidad articular y fortalecer los músculos   " +
                                                  "\n que rodean las articulaciones además se sugiere la práctica de ejercicios específicos de fisioterapia articular y técnicas   " +
                                                  "\n de relajación como el yoga adaptado. POSIBLE TRATAMIENTO: El tratamiento puede incluir medicamentos antiinflamatorios no     " +
                                                  "\n esteroideos como el ibuprofeno o el naproxeno para aliviar el dolor y la inflamación además de fármacos modificadores de     " +
                                                  "\n la enfermedad como el metotrexato o la sulfasalazina en algunos casos se utilizan corticosteroides o terapias biológicas        " +
                                                  "\n como los inhibidores del TNF es fundamental seguir el tratamiento indicado por el reumatólogo y realizar controles periódicos.  " +
                                                  "\n ALIMENTOS RECOMENDADOS: Para reducir la inflamación y proteger las articulaciones se recomienda el consumo de PESCADOS          " + 
                                                  "\n GRASOS: Como el salmón y la sardina ricos en ácidos grasos Omega-3 que aportan aproximadamente el 50% de la ingesta diaria      " +
                                                  "\n recomendada por cada 100 gramos. FRUTOS SECOS: Como nueces y almendras que contienen vitamina E y grasas saludables con un      " +
                                                  "\n aporte del 35% de la ingesta diaria recomendada por cada 30 gramos. ESPINACAS Y BRÓCOLI: Ricos en antioxidantes vitamina A      " +
                                                  "\n y vitamina K esenciales para la salud ósea y articular con un aporte del 56% de la ingesta diaria recomendada por cada 100      " +
                                                  "\n gramos. CÚRCUMA: Contiene curcumina con propiedades antiinflamatorias naturales. Este es solo un diagnóstico predeterminado     " +
                                                  "\n lógico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente   " +
                                                  "\n correctas para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento      " +
                                                  "\n adecuado de su paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho     " +
                                                  "\n consultar a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la tosferina es fundamental mantener una hidratación adecuada con un consumo          " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para mantener las vías        " +
                                                  "\n respiratorias húmedas y facilitar la expulsión de mucosidad. EJERCICIO: Se recomienda reposo durante la fase aguda        " +
                                                  "\n y posteriormente actividad física ligera como caminatas lentas ejercicios de respiración profunda y estiramientos         " +
                                                  "\n suaves para mejorar la oxigenación y reducir la fatiga respiratoria. POSIBLE TRATAMIENTO: El tratamiento suele incluir    " +
                                                  "\n antibióticos como la azitromicina la claritromicina o la eritromicina especialmente si se inicia en las primeras fases    " +
                                                  "\n de la enfermedad también se pueden utilizar broncodilatadores y humidificadores para aliviar la tos es importante evitar  " +
                                                  "\n el uso de medicamentos para la tos sin prescripción médica. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema            " +
                                                  "\n respiratorio se recomienda el consumo de NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la duración de      " +
                                                  "\n los síntomas aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Con         " +
                                                  "\n propiedades antiinflamatorias que pueden aliviar la irritación de garganta. MIEL Y LIMÓN: Combinación efectiva para       " +
                                                  "\n calmar la tos y suavizar la garganta aportando flavonoides y vitamina C. ESPINACAS Y BRÓCOLI: Aportan antioxidantes       " +
                                                  "\n y vitamina A esenciales para la regeneración celular con un contenido de aproximadamente el 56% de la ingesta diaria      " +
                                                  "\n recomendada por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza al     " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda     " +
                                                  "\n hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente además   " +
                                                  "\n por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico Angel  " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de las paperas es fundamental mantener una hidratación adecuada con un consumo diario       " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para prevenir la deshidratación y       " +
                                                  "\n aliviar la inflamación de las glándulas salivales. EJERCICIO: Se recomienda reposo durante la fase aguda y posteriormente    " +
                                                  "\n actividad física ligera como estiramientos suaves y caminatas cortas para recuperar energía sin forzar el sistema            " +
                                                  "\n inmunológico. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral específico para las paperas el manejo es sintomático   " +
                                                  "\n e incluye el uso de analgésicos como el paracetamol o el ibuprofeno para reducir el dolor y la fiebre además de compresas    " +
                                                  "\n frías en las glándulas inflamadas y aislamiento durante al menos cinco días desde el inicio de los síntomas. ALIMENTOS       " +
                                                  "\n RECOMENDADOS: Para aliviar los síntomas y fortalecer el sistema inmunológico se recomienda el consumo de SOPAS Y CALDOS:     " +
                                                  "\n Fáciles de tragar y nutritivos. NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la duración de los síntomas     " +
                                                  "\n aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Con propiedades             " +
                                                  "\n antiinflamatorias que pueden aliviar el malestar general. ESPINACAS Y BRÓCOLI: Aportan antioxidantes y vitamina A esenciales " +
                                                  "\n para la regeneración celular con un contenido de aproximadamente el 56% de la ingesta diaria recomendada por cada 100        " +
                                                  "\n gramos. YOGUR NATURAL: Contiene probióticos que fortalecen el sistema inmunológico y mejoran la salud digestiva aportando    " +
                                                  "\n calcio y proteínas esenciales. Este es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza al 100%     " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer más   " + 
                                                  "\n de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente además por su salud   " +
                                                  "\n si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico Angel L Montes         " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 a 3 litros de agua al día para prevenir la deshidratación causada por fiebre,  " +
                                                  "\n sudoración y pérdida de apetito. En mujeres en etapa de ancianidad, una hidratación constante también ayuda a mantener la   " +
                                                  "\n función renal, reducir el riesgo de hipotensión y apoyar la eliminación de toxinas virales. EJERCICIO: Durante la fase      " +
                                                  "\n aguda se recomienda reposo absoluto. Una vez superados los síntomas, se puede retomar actividad física ligera como          " +
                                                  "\n caminatas suaves, ejercicios de movilidad articular y respiración profunda. Estas actividades ayudan a mejorar la           " +
                                                  "\n circulación, reducir la rigidez muscular y estimular el sistema linfático, lo cual favorece la eliminación de residuos      " +
                                                  "\n celulares. También se recomienda realizar ejercicios en ambientes ventilados y con apoyo si hay debilidad o mareos.         " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un antiviral específico para el virus del Zika. El tratamiento es sintomático e incluye      " +
                                                  "\n Paracetamol para la fiebre y el dolor, antihistamínicos para el prurito y reposo. Se debe evitar el uso de aspirina o       " +
                                                  "\n AINEs hasta descartar dengue, por riesgo de hemorragias. También se recomienda el uso de repelentes, mosquiteros y ropa     " +
                                                  "\n protectora para evitar nuevas picaduras. En mujeres mayores, se debe vigilar la aparición de síntomas neurológicos como     " +
                                                  "\n debilidad muscular, visión borrosa o alteraciones sensoriales. ALIMENTACIÓN: Se sugiere una dieta rica en antioxidantes     " +
                                                  "\n y nutrientes inmunoestimulantes como: Naranjas (con vitamina C, 89% por cada 100 g); Kiwi (con vitamina C y potasio, 92%    " +
                                                  "\n y 7% respectivamente); Aguacate (con vitamina E, 14% por cada 100 g); Zanahorias (con vitamina A, 93% por cada 100 g);      " +
                                                  "\n y Jengibre (con compuestos antiinflamatorios y antivirales naturales). Este es solo un diagnóstico predeterminado lógico,   " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente      " +
                                                  "\n correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el         " +
                                                  "\n tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda         " +
                                                  "\n consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 3 litros de agua al día, incluyendo soluciones de rehidratación oral para      " +
                                                  "\n reponer electrolitos perdidos por diarrea y vómitos. En mujeres mayores de 75 años, la deshidratación puede ser más     " +
                                                  "\n severa, por lo que se debe vigilar la frecuencia urinaria, la presión arterial y el estado de conciencia. EJERCICIO:    " +
                                                  "\n Durante la fase aguda se recomienda reposo absoluto. Una vez superados los síntomas, se puede retomar actividad física  " +
                                                  "\n ligera como ejercicios de estiramiento, caminatas cortas y movimientos suaves de brazos y piernas. Estas actividades    " +
                                                  "\n ayudan a reactivar la circulación, prevenir la pérdida de masa muscular y mejorar la digestión. También se recomienda   " +
                                                  "\n realizar ejercicios de respiración para oxigenar los tejidos y reducir la fatiga. POSIBLE TRATAMIENTO: No existe un     " +
                                                  "\n tratamiento antiviral específico. El manejo es sintomático y se enfoca en rehidratación intensiva, control de la fiebre " +
                                                  "\n con Paracetamol y dieta astringente. No se recomiendan antidiarreicos como la loperamida. En casos graves, puede        " +
                                                  "\n requerirse hospitalización para administración de líquidos intravenosos. También se sugiere el uso de probióticos       " +
                                                  "\n para restaurar la flora intestinal. ALIMENTACIÓN: Se recomienda una dieta suave y rica en nutrientes como: Plátanos     " +
                                                  "\n (con potasio, 23% por cada 100 g); Arroz blanco (fácil digestión y fuente de energía); Manzanas cocidas (con pectina,   " +
                                                  "\n que regula el tránsito intestinal); Zanahorias cocidas (con vitamina A, 93% por cada 100 g); y Yogur natural (con       " +
                                                  "\n probióticos y calcio, 30% por cada 100 g). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no     " +
                                                  "\n garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello,  " +
                                                  "\n se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado.     " +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.    " +
                                                  "\n Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 a 3 litros de agua al día para apoyar la función renal, facilitar la          " +
                                                  "\n eliminación de toxinas y mantener el equilibrio electrolítico. En mujeres en etapa de ancianidad, una hidratación          " +
                                                  "\n adecuada también ayuda a prevenir la hipotensión y la fatiga asociadas a la infección. EJERCICIO: Durante la fase          " +
                                                  "\n aguda se recomienda reposo absoluto. Una vez estabilizada, se puede retomar actividad física ligera como caminatas         " +
                                                  "\n suaves, ejercicios de movilidad articular y respiración profunda. Estas actividades ayudan a prevenir el deterioro         " +
                                                  "\n funcional, mejorar la circulación y reducir el riesgo de trombosis. También se recomienda realizar ejercicios en           " +
                                                  "\n casa con apoyo, como levantarse y sentarse lentamente, para mantener la autonomía sin comprometer la seguridad.            " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento incluye antibióticos intravenosos como Ampicilina o Penicilina G, frecuentemente       " +
                                                  "\n combinados con Gentamicina en casos graves. En mujeres adultas mayores, se debe ajustar la dosis según la función          " +
                                                  "\n renal y monitorear signos de meningitis o septicemia. También se recomienda evitar alimentos de alto riesgo como           " +
                                                  "\n quesos blandos no pasteurizados, embutidos y pescados ahumados. En casos neurológicos, puede requerirse hospitalización    " +
                                                  "\n prolongada y seguimiento con neuroimagen. ALIMENTACIÓN: Se sugiere una dieta rica en nutrientes inmunoestimulantes         " +
                                                  "\n como: Espinacas (con vitamina A y hierro, 56% y 15% por cada 100 g); Ajo (con propiedades antibacterianas naturales);      " +
                                                  "\n Zanahorias (con vitamina A, 93% por cada 100 g); Frutas cítricas (con vitamina C, 89% por cada 100 g); y Yogur natural     " +
                                                  "\n (con probióticos y calcio, 30% por cada 100 g). Este es solo un diagnóstico predeterminado lógico, haberlo consultado      " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para        " +
                                                  "\n ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado.  " +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.       " +
                                                  "\n Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener     " +
                                                  "\n una hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales.        " +
                                                  "\n EJERCICIO. Durante la fase aguda se recomienda reposo absoluto para evitar complicaciones gastrointestinales.         " +
                                                  "\n Una vez superada esta etapa, se pueden incorporar caminatas suaves de 10 a 15 minutos al día, ejercicios de           " +
                                                  "\n movilidad articular y respiración profunda para estimular la circulación y la recuperación intestinal. También        " +
                                                  "\n es útil realizar estiramientos suaves para reducir la rigidez muscular y mantener la funcionalidad. HIDRATACIÓN.      " +
                                                  "\n Se aconseja consumir entre 2.5 y 3 litros de agua al día para prevenir la deshidratación causada por la diarrea.      " +
                                                  "\n También se recomienda el uso de soluciones de rehidratación oral, caldos naturales y jugos suaves sin azúcar          " +
                                                  "\n añadida. Se deben evitar bebidas con cafeína, alcohol o alto contenido de azúcar, ya que pueden empeorar los          " +
                                                  "\n síntomas. POSIBLE TRATAMIENTO. El tratamiento para la shigelosis incluye reposo, rehidratación y en casos severos,    " +
                                                  "\n antibióticos como ciprofloxacino o azitromicina. Marcas reconocidas incluyen Ciproxin y Zitromax. No se deben usar    " +
                                                  "\n medicamentos antidiarreicos como loperamida, ya que pueden agravar la infección. ALIMENTACIÓN RECOMENDADA. Se         " +
                                                  "\n recomienda una dieta blanda, baja en fibra y rica en nutrientes esenciales. Algunos alimentos clave incluyen arroz    " +
                                                  "\n blanco y puré de papa, que son fáciles de digerir y ayudan a estabilizar el sistema digestivo. Yogur natural,         " +
                                                  "\n fuente de probióticos que ayudan a restaurar la flora intestinal. Plátano, rico en potasio, que ayuda a reponer       " +
                                                  "\n electrolitos perdidos, aportando el 10% del requerimiento diario por cada 100 gramos. Zanahoria cocida, rica en       " +
                                                  "\n vitamina A, que fortalece las mucosas intestinales, con un aporte del 15% del requerimiento diario por cada 100       " +
                                                  "\n gramos. Este diagnóstico es una referencia lógica basada en información médica, pero no garantiza al 100% que el      " +
                                                  "\n paciente tenga shigelosis ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y       " +
                                                  "\n consultar a un médico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una        " +
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO.        " +
                                                  "\n Se recomienda actividad física moderada como caminatas diarias de 20 a 30 minutos, ejercicios de respiración profunda        " +
                                                  "\n y yoga terapéutico para fortalecer los pulmones y reducir la disnea. También es útil realizar ejercicios de fortalecimiento  " +
                                                  "\n muscular con bandas elásticas y técnicas de expansión torácica para mejorar la capacidad pulmonar. HIDRATACIÓN. Se           " +
                                                  "\n aconseja consumir entre 2.5 y 3 litros de agua al día para mantener las vías respiratorias hidratadas, facilitar la          " +
                                                  "\n eliminación de secreciones y apoyar la función renal. También se recomienda el consumo de infusiones tibias como manzanilla  " +
                                                  "\n o jengibre para aliviar la irritación bronquial. POSIBLE TRATAMIENTO. El tratamiento para la EPOC incluye broncodilatadores  " +
                                                  "\n de acción corta como salbutamol (Ventolin, Aerolin), corticosteroides inhalados como fluticasona o budesonida (Flixotide,    " +
                                                  "\n Pulmicort) y en algunos casos, anticolinérgicos de acción prolongada como tiotropio (Spiriva). También se recomienda la      " +  
                                                  "\n rehabilitación pulmonar y el uso adecuado de inhaladores. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica en          " +
                                                  "\n antioxidantes, proteínas y grasas saludables. Algunos alimentos clave incluyen pescados grasos como salmón y atún, ricos     " +
                                                  "\n en omega-3, que reducen la inflamación pulmonar, aportando el 70% del requerimiento diario por cada 100 gramos. Frutas       " +
                                                  "\n como naranja, kiwi y papaya, ricas en vitamina C, que fortalecen el sistema inmune, con un aporte del 89% del requerimiento  " +
                                                  "\n diario por cada 100 gramos. Verduras como espinaca y brócoli, ricas en vitamina A y ácido fólico, que protegen las mucosas   " +
                                                  "\n respiratorias, con un aporte del 15% del requerimiento diario por cada 100 gramos. Frutos secos como almendras y nueces,     " +
                                                  "\n ricos en vitamina E y ácidos grasos esenciales, con un aporte del 37% del requerimiento diario por cada 28 gramos. Este      " +
                                                  "\n diagnóstico es una referencia lógica basada en información médica, pero no garantiza al 100% que el paciente tenga EPOC      " +
                                                  "\n ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico para mayor       " +
                                                  "\n seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una     " +  
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO.     " +
                                                  "\n Se recomienda actividad física moderada como caminatas suaves, yoga o ejercicios de movilidad durante 30 minutos al       " +
                                                  "\n día para mejorar la circulación, reducir el estrés y fortalecer el sistema inmunológico. También es útil realizar         " +
                                                  "\n ejercicios de respiración y relajación para apoyar el bienestar general. HIDRATACIÓN. Se aconseja consumir entre 2 y      " +
                                                  "\n 2.5 litros de agua al día para facilitar la eliminación de toxinas, apoyar la función renal y mantener las mucosas        " +
                                                  "\n hidratadas. También se recomienda el consumo de infusiones suaves como manzanilla o menta para aliviar molestias          " +
                                                  "\n urinarias. POSIBLE TRATAMIENTO. El tratamiento para la clamidia incluye antibióticos como azitromicina en dosis única     " +
                                                  "\n o doxiciclina durante 7 días. Marcas reconocidas incluyen Zitromax y Vibramycin. Es fundamental completar el tratamiento  " +
                                                  "\n y tratar también a la pareja sexual para evitar reinfección. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica en    " +
                                                  "\n antioxidantes, lisina y vitaminas del complejo B. Algunos alimentos clave incluyen yogur natural y leche, ricos en lisina," +
                                                  "\n que inhibe la replicación bacteriana. Frutas como naranja, kiwi y papaya, ricas en vitamina C, que fortalecen el sistema  " +
                                                  "\n inmune, con un aporte del 89% del requerimiento diario por cada 100 gramos. Verduras como espinaca y zanahoria, ricas en  " +
                                                  "\n vitamina A y ácido fólico, que favorecen la regeneración celular y fortalecen las mucosas, con un aporte del 15% del      " +
                                                  "\n requerimiento diario por cada 100 gramos. Frutos secos como almendras y nueces, ricos en vitamina E y ácidos grasos       " +
                                                  "\n esenciales, que protegen las células inmunológicas, con un aporte del 37% del requerimiento diario por cada 28 gramos.    " +
                                                  "\n Este diagnóstico es una referencia lógica basada en información médica, pero no garantiza al 100% que el paciente tenga   " +
                                                  "\n clamidia ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico      " +
                                                  "\n para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n La meningitis bacteriana es una infección grave que inflama las membranas que rodean el cerebro y la médula espinal.      " +
                                                  "\n En la ancianidad, los síntomas pueden ser atípicos y presentarse como confusión, somnolencia o pérdida de apetito,        " +
                                                  "\n lo que dificulta su detección temprana. EJERCICIO. Se recomienda actividad física muy ligera durante la fase de           " +
                                                  "\n recuperación, como estiramientos suaves o caminatas cortas en ambientes tranquilos, evitando cualquier esfuerzo que       " +
                                                  "\n pueda aumentar la presión intracraneal o la fatiga. HIDRATACIÓN. Es fundamental consumir entre 2.5 y 3 litros de agua     " +
                                                  "\n al día para mantener el equilibrio de líquidos, apoyar la función renal y facilitar la eliminación de toxinas. También    " +
                                                  "\n se recomienda el consumo de caldos suaves o infusiones tibias para mantener la hidratación sin irritar el sistema         " +
                                                  "\n digestivo. POSIBLE TRATAMIENTO. El tratamiento incluye antibióticos intravenosos de amplio espectro como ceftriaxona      " +
                                                  "\n o vancomicina, ajustados según el agente causal identificado. En algunos casos se administra dexametasona como            " +
                                                  "\n antiinflamatorio adyuvante para reducir el riesgo de daño neurológico. Es crucial iniciar el tratamiento lo antes posible " +
                                                  "\n para evitar complicaciones graves. ALIMENTACIÓN RECOMENDADA. Consumir alimentos ricos en vitaminas del complejo B,        " +
                                                  "\n antioxidantes y proteínas para apoyar la recuperación neurológica. Huevo cocido, fuente de vitamina B12 y colina,         " +
                                                  "\n esenciales para la función cerebral. Espinaca, rica en ácido fólico y hierro, que favorecen la oxigenación cerebral,      " +
                                                  "\n aportando hasta el 20% del requerimiento diario de hierro por cada 100 g. Frutas como plátano y manzana, que aportan      " +
                                                  "\n potasio y fibra soluble, ayudando a mantener el equilibrio electrolítico y la digestión. Yogur natural, fuente de         " +
                                                  "\n probióticos que fortalecen la flora intestinal y el sistema inmune. Este es solo un diagnóstico predeterminado lógico,      " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas  " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el       " +
                                                  "\n tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le     " +
                                                  "\n recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n El cáncer es un conjunto de enfermedades caracterizadas por el crecimiento descontrolado de células anormales que pueden     " +
                                                  "\n invadir tejidos y órganos. En la ancianidad, el tratamiento debe adaptarse a la condición física general, comorbilidades     " +
                                                  "\n y tipo de cáncer. EJERCICIO. Se recomienda actividad física moderada y personalizada, como caminatas, ejercicios de          " +
                                                  "\n resistencia con bandas elásticas o yoga suave, que ayudan a mantener la masa muscular, mejorar el estado de ánimo y          " +
                                                  "\n reducir la fatiga asociada al tratamiento. HIDRATACIÓN. Es fundamental consumir entre 2.5 y 3 litros de agua al día para     " +
                                                  "\n apoyar la función renal, especialmente durante la quimioterapia o radioterapia, y facilitar la eliminación de toxinas.       " +
                                                  "\n También se recomienda el consumo de líquidos ricos en electrolitos si hay vómitos o diarrea. POSIBLE TRATAMIENTO. El         " +
                                                  "\n tratamiento puede incluir cirugía, quimioterapia, radioterapia, inmunoterapia o terapia hormonal, dependiendo del tipo       " +
                                                  "\n y estadio del cáncer. En adultos mayores, se prioriza un enfoque individualizado que equilibre eficacia y calidad de vida.   " + 
                                                  "\n Medicamentos como letrozol, capecitabina o pembrolizumab pueden ser considerados según el caso. ALIMENTACIÓN RECOMENDADA.    " +
                                                  "\n Consumir alimentos ricos en antioxidantes, proteínas y vitaminas para fortalecer el sistema inmunológico y prevenir la       " +
                                                  "\n pérdida de peso. Frutas como papaya y guayaba, ricas en vitamina C, que fortalecen las defensas, aportando hasta el 200%     " +
                                                  "\n del requerimiento diario por cada 100 g. Carnes magras y huevos, fuentes de proteínas de alta calidad, esenciales para       " +
                                                  "\n la regeneración celular. Verduras como brócoli y zanahoria, ricas en vitamina A, ácido fólico y antioxidantes. Yogur         " +
                                                  "\n natural, fuente de probióticos que mejoran la flora intestinal y la absorción de nutrientes. Este es solo un diagnóstico     " + 
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la        " +
                                                  "\n enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer  " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le         " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida)        " +
                                                  "\n y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.50-1.75 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n La influenza es una infección viral respiratoria que puede causar fiebre, tos, dolor muscular, fatiga y complicaciones     " +
                                                  "\n graves en personas mayores debido al debilitamiento del sistema inmunológico. EJERCICIO. Se recomienda actividad física    " +
                                                  "\n ligera y controlada, como caminatas suaves o ejercicios de respiración, que ayudan a mantener la movilidad, mejorar la     " + 
                                                  "\n oxigenación y reducir el riesgo de complicaciones respiratorias. Es importante evitar el esfuerzo excesivo durante la      " +
                                                  "\n fase aguda de la enfermedad. HIDRATACIÓN. Es fundamental consumir entre 2.5 y 3 litros de agua al día para mantener las    " +
                                                  "\n mucosas hidratadas, facilitar la eliminación de secreciones y apoyar la función inmunológica. También se recomienda el     " +
                                                  "\n consumo de líquidos tibios como infusiones de jengibre o caldos suaves. POSIBLE TRATAMIENTO. El tratamiento puede incluir  " +
                                                  "\n antivirales como oseltamivir o zanamivir, especialmente si se administran en las primeras 48 horas desde el inicio de los  " +
                                                  "\n síntomas. También se utilizan medicamentos como paracetamol para reducir la fiebre y aliviar el malestar general. Es       " +
                                                  "\n esencial el reposo, el aislamiento y el monitoreo de signos de complicaciones como dificultad respiratoria. ALIMENTACIÓN   " +
                                                  "\n RECOMENDADA. Consumir alimentos que fortalezcan el sistema inmunológico y ayuden a la recuperación. Frutas cítricas como   " +
                                                  "\n naranja y toronja, ricas en vitamina C, que fortalecen las defensas, aportando hasta el 89% del requerimiento diario por   " +
                                                  "\n cada 100 g. Papaya, rica en vitamina A y C, que favorece la regeneración celular y la respuesta inmune. Verduras como      " +
                                                  "\n espinaca y brócoli, ricas en hierro, ácido fólico y antioxidantes. Yogur natural, fuente de probióticos que mejoran la     " +
                                                  "\n flora intestinal. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el        " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda       " +
                                                  "\n hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además   " +
                                                  "\n por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico,        " +
                                                  "\n Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n La neumonía es una infección pulmonar que inflama los alvéolos y puede llenarlos de líquido o pus, dificultando la           " +
                                                  "\n respiración. En la ancianidad, puede presentarse con síntomas atípicos como debilidad, confusión o pérdida de apetito.       " +
                                                  "\n EJERCICIO. Se recomienda actividad física muy ligera durante la recuperación, como ejercicios respiratorios o caminatas      " +
                                                  "\n cortas, que ayudan a mejorar la capacidad pulmonar y prevenir la pérdida de masa muscular. HIDRATACIÓN. Es fundamental       " +
                                                  "\n consumir entre 2.5 y 3 litros de agua al día para mantener las vías respiratorias hidratadas, facilitar la eliminación       " + 
                                                  "\n de secreciones y apoyar la función renal. También se sugiere el consumo de caldos tibios o infusiones suaves. POSIBLE        " +
                                                  "\n TRATAMIENTO. El tratamiento incluye antibióticos como amoxicilina con ácido clavulánico, ceftriaxona o levofloxacino,        " +
                                                  "\n dependiendo del agente causal. En casos graves, puede requerirse hospitalización y oxigenoterapia. Es importante iniciar     " +  
                                                  "\n el tratamiento lo antes posible para evitar complicaciones. ALIMENTACIÓN RECOMENDADA. Consumir alimentos ricos en            " +
                                                  "\n proteínas, vitaminas y antioxidantes. Huevos y carnes magras, fuentes de proteínas de alta calidad. Frutas como guayaba      " +
                                                  "\n y kiwi, ricas en vitamina C, que fortalecen el sistema inmune, aportando hasta el 200% del requerimiento diario por cada     " +
                                                  "\n 100 g. Verduras como zanahoria y espinaca, ricas en vitamina A, hierro y ácido fólico. Yogur natural, fuente de probióticos  " +
                                                  "\n que mejoran la flora intestinal. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza       " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello     " +
                                                  "\n se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su     " +
                                                  "\n paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar   " +
                                                  "\n a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n La diabetes es una enfermedad crónica que afecta la forma en que el cuerpo utiliza la glucosa, y en la ancianidad puede      " +
                                                  "\n estar acompañada de otras condiciones como hipertensión o deterioro cognitivo. EJERCICIO. Se recomienda actividad física     " +
                                                  "\n moderada y constante, como caminatas, ejercicios de resistencia con bandas o yoga suave, que ayudan a mejorar la             " +
                                                  "\n sensibilidad a la insulina, controlar el peso y mantener la movilidad. HIDRATACIÓN. Es fundamental consumir entre            " +
                                                  "\n 2 y 2.5 litros de agua al día para evitar la deshidratación, apoyar la función renal y facilitar la eliminación de           " +
                                                  "\n glucosa por la orina. POSIBLE TRATAMIENTO. El tratamiento puede incluir medicamentos orales como metformina, inhibidores     " +
                                                  "\n de DPP-4 como sitagliptina o inhibidores de SGLT2 como dapagliflozina. En algunos casos se requiere insulina. Es esencial    " +
                                                  "\n el monitoreo regular de la glucosa y la adaptación del tratamiento a la condición física del paciente. ALIMENTACIÓN          " +
                                                  "\n RECOMENDADA. Consumir alimentos con bajo índice glucémico, ricos en fibra, antioxidantes y nutrientes esenciales. Avena      " +
                                                  "\n y legumbres, que ayudan a controlar los niveles de glucosa. Frutas como manzana y pera, ricas en fibra soluble y vitamina C, " +
                                                  "\n aportando cerca del 70% del requerimiento diario por cada 100 g. Verduras como brócoli y espinaca, ricas en magnesio,        " +
                                                  "\n ácido fólico y antioxidantes. Yogur natural sin azúcar, fuente de probióticos que mejoran la digestión y el metabolismo.     " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa         " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico" +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta " +
                                                  "\n del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita  " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n EJERCICIO: La actividad física moderada es esencial para mejorar la capacidad pulmonar y reducir los síntomas del    " +
                                                  "\n asma en personas mayores. Se recomienda realizar caminatas suaves de 20 a 30 minutos al día, ejercicios de           " +
                                                  "\n respiración diafragmática y estiramientos para fortalecer los músculos respiratorios. También es útil practicar      " +
                                                  "\n ejercicios acuáticos o yoga adaptado, que ayudan a mantener la movilidad sin generar fatiga excesiva. HIDRATACIÓN:   " +
                                                  "\n Es fundamental consumir entre 2 y 2.5 litros de agua al día para mantener las vías respiratorias hidratadas,         " +
                                                  "\n facilitar la eliminación de secreciones y reducir la inflamación bronquial. También se recomienda el consumo de      " +
                                                  "\n infusiones como té de tomillo o manzanilla, que poseen propiedades expectorantes y calmantes. POSIBLE TRATAMIENTO:   " +
                                                  "\n El tratamiento del asma incluye broncodilatadores de acción corta como el salbutamol para aliviar los síntomas       " +
                                                  "\n agudos, y corticosteroides inhalados como la fluticasona o budesonida para el control a largo plazo. En personas     " +
                                                  "\n mayores, es importante revisar la técnica de inhalación y ajustar las dosis para evitar efectos secundarios.         " +
                                                  "\n También pueden utilizarse antileucotrienos como el montelukast en casos de asma persistente. ALIMENTACIÓN: Se        " +
                                                  "\n recomienda el consumo de alimentos con propiedades antiinflamatorias y antioxidantes, tales como pescados grasos     " +
                                                  "\n como salmón y sardinas, que aportan ácidos grasos Omega-3 en un 70% de la ingesta diaria recomendada, ayudando a     " +
                                                  "\n reducir la inflamación de las vías respiratorias. Frutas como fresas y arándanos, que contienen vitamina C y         " +
                                                  "\n antioxidantes en un 89% de la ingesta diaria recomendada, fortaleciendo el sistema inmunológico. Verduras como       " +
                                                  "\n espinacas y brócoli, que aportan vitamina A y K en un 50% de la ingesta diaria recomendada, esenciales para la       " +
                                                  "\n salud pulmonar. este es solo un diagnóstico predeterminado lógico. haberlo consultado no garantiza al 100% que       " +
                                                  "\n la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar más     " +
                                                  "\n de un diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud, si la respuesta del         " +
                                                  "\n diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a       " +
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n EJERCICIO: La actividad física regular es clave para mantener la salud cardiovascular, muscular y emocional en            " +
                                                  "\n personas mayores con VIH. Se recomienda realizar ejercicios aeróbicos moderados como caminatas de 30 minutos,             " +
                                                  "\n tres a cinco veces por semana, combinados con ejercicios de fuerza y flexibilidad. También es beneficioso incluir         " +
                                                  "\n ejercicios de equilibrio para prevenir caídas. HIDRATACIÓN: Es esencial consumir al menos 2.5 litros de agua al           " +
                                                  "\n día para apoyar la función renal, especialmente durante el tratamiento antirretroviral. También se recomienda el          " + 
                                                  "\n consumo de infusiones suaves como té de rooibos o manzanilla, que ayudan a reducir el estrés oxidativo y mejorar          " +
                                                  "\n la digestión. POSIBLE TRATAMIENTO: El tratamiento del VIH se basa en la terapia antirretroviral (TAR), que incluye        " +
                                                  "\n combinaciones de medicamentos como tenofovir, emtricitabina, dolutegravir o efavirenz. En personas mayores, es            " +
                                                  "\n fundamental monitorear posibles interacciones con otros medicamentos y ajustar las dosis según la función hepática        " +
                                                  "\n y renal. El seguimiento médico regular y la adherencia estricta al tratamiento son claves para mantener la carga          " +
                                                  "\n viral indetectable. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes, proteínas y               " +
                                                  "\n micronutrientes para fortalecer el sistema inmunológico, tales como frutas como kiwi y papaya, que aportan vitamina C     " +
                                                  "\n en un 90% de la ingesta diaria recomendada. Legumbres como lentejas y garbanzos, que contienen hierro y zinc,             " +
                                                  "\n esenciales para la producción de glóbulos blancos. Verduras como zanahorias y espinacas, que aportan vitamina A y         " +
                                                  "\n ácido fólico en un 50% de la ingesta diaria recomendada. Frutos secos como almendras y nueces, que contienen vitamina E   " +
                                                  "\n y selenio, contribuyendo con hasta un 40% de la ingesta diaria recomendada de estos antioxidantes. este es solo un        " +
                                                  "\n diagnóstico predeterminado lógico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni       " +
                                                  "\n que las respuestas sean completamente correctas. se recomienda realizar más de un diagnóstico para mayor seguridad en     " +
                                                  "\n el tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda    " +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n EJERCICIO: Durante el tratamiento de la gonorrea se recomienda evitar la actividad física intensa y priorizar el descanso,      " +
                                                  "\n ya que el cuerpo necesita conservar energía para combatir la infección. Una vez finalizado el tratamiento y con autorización    " +
                                                  "\n médica, se pueden retomar ejercicios suaves como caminatas o estiramientos para mejorar la circulación y el bienestar           " +
                                                  "\n general. HIDRATACIÓN: Es fundamental consumir al menos 2.5 litros de agua al día para ayudar a eliminar toxinas, mantener       " +  
                                                  "\n la salud del tracto urinario y favorecer la recuperación. También se recomienda el consumo de infusiones como té de equinácea   " +
                                                  "\n o arándano rojo, que poseen propiedades antibacterianas y fortalecen el sistema inmunológico. POSIBLE TRATAMIENTO: El           " +
                                                  "\n tratamiento de la gonorrea incluye antibióticos como ceftriaxona en dosis única intramuscular, combinada con azitromicina       " +
                                                  "\n por vía oral. En casos de resistencia bacteriana, puede ser necesario prolongar el tratamiento o utilizar combinaciones         " +
                                                  "\n alternativas como gentamicina o doxiciclina. Es fundamental que la pareja también reciba tratamiento y se eviten relaciones     " +
                                                  "\n sexuales hasta completar la terapia. ALIMENTACIÓN: Se recomienda el consumo de alimentos que fortalezcan el sistema             " +
                                                  "\n inmunológico y favorezcan la eliminación de bacterias, tales como frutas cítricas como naranjas y toronjas, que aportan         " +
                                                  "\n vitamina C en un 89% de la ingesta diaria recomendada. Yogur natural, que contiene probióticos que equilibran la flora          " +
                                                  "\n vaginal y fortalecen las defensas. Verduras como brócoli y zanahorias, que aportan vitamina A y antioxidantes en un 50%         " +
                                                  "\n de la ingesta diaria recomendada. Ajo y cebolla, que contienen compuestos sulfurados con propiedades antimicrobianas,           " +
                                                  "\n contribuyendo con hasta un 40% de la ingesta diaria recomendada de estos nutrientes. este es solo un diagnóstico predeterminado " +
                                                  "\n lógico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente  " +
                                                  "\n correctas. se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud,  " +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu       " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACIÓN: Para el tratamiento del herpes genital es fundamental mantener una hidratación adecuada con un consumo diario      " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a la eliminación de            " +
                                                  "\n toxinas y mantener el equilibrio del sistema inmunológico. EJERCICIO: Se recomienda actividad física ligera como caminatas      " +
                                                  "\n suaves ejercicios de estiramiento o yoga adaptado para reducir el estrés que puede desencadenar brotes y fortalecer la          " +
                                                  "\n circulación sin comprometer el sistema inmunológico. POSIBLE TRATAMIENTO: El tratamiento suele incluir antivirales como el      " +
                                                  "\n aciclovir el famciclovir o el valaciclovir durante 7 a 10 días en su primera aparición y en brotes recurrentes por períodos     " +
                                                  "\n más cortos además en casos frecuentes se puede indicar tratamiento supresivo prolongado con antivirales orales y en             " +
                                                  "\n situaciones graves hospitalización con antivirales intravenosos también pueden utilizarse cremas anestésicas como lidocaína     " +
                                                  "\n para aliviar el dolor local. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunológico se recomienda el consumo de        " +
                                                  "\n FRUTOS ROJOS: Ricos en antioxidantes y vitamina C que ayudan a combatir infecciones virales aportando aproximadamente el 70%    " +
                                                  "\n de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Con propiedades antiinflamatorias que pueden aliviar la         " +
                                                  "\n inflamación local. ESPINACAS Y BRÓCOLI: Aportan antioxidantes y vitamina A esenciales para la regeneración celular con un       " +
                                                  "\n contenido de aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probióticos   " +
                                                  "\n que fortalecen el sistema inmunológico y mejoran la salud digestiva aportando calcio y proteínas esenciales. Este es solo un    " +
                                                  "\n diagnóstico predeterminado lógico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las      " +
                                                  "\n respuestas sean completamente correctas para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor    " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente además por su salud si la respuesta del Diagnóstico no le satisface del     " +
                                                  "\n todo se le recomienda mucho consultar a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la sífilis es fundamental mantener una hidratación adecuada con un consumo diario         " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para facilitar la eliminación de         " +
                                                  "\n toxinas y apoyar el sistema inmunológico durante el tratamiento antibiótico. EJERCICIO: Se recomienda actividad física        " +
                                                  "\n ligera como caminatas lentas ejercicios de movilidad articular y estiramientos suaves para mantener la circulación activa     " +
                                                  "\n sin comprometer la recuperación especialmente en fases avanzadas. POSIBLE TRATAMIENTO: El tratamiento suele incluir           " +
                                                  "\n antibióticos como la penicilina G benzatina en dosis única de 2.4 millones de unidades intramuscular para fases tempranas     " +
                                                  "\n o en ciclos prolongados para fases avanzadas en caso de alergia a la penicilina se puede utilizar doxiciclina o ceftriaxona   " +
                                                  "\n según indicación médica es fundamental completar el tratamiento y realizar seguimiento clínico. ALIMENTOS RECOMENDADOS:       " +
                                                  "\n Para fortalecer el sistema inmunológico se recomienda el consumo de FRUTOS ROJOS: Ricos en antioxidantes y vitamina C que     " +
                                                  "\n ayudan a combatir infecciones bacterianas aportando aproximadamente el 70% de la ingesta diaria recomendada por cada 100      " +
                                                  "\n gramos. JENGIBRE: Con propiedades antiinflamatorias que pueden ayudar a reducir la inflamación. ESPINACAS Y BRÓCOLI: Aportan  " +
                                                  "\n antioxidantes y vitamina A esenciales para la regeneración celular con un contenido de aproximadamente el 56% de la ingesta   " +
                                                  "\n diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probióticos que fortalecen el sistema inmunológico y mejoran  " +
                                                  "\n la salud digestiva aportando calcio y proteínas esenciales. Este es solo un diagnóstico predeterminado lógico haberlo         " + 
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas      " +
                                                  "\n para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de  " +
                                                  "\n su paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a   " +
                                                  "\n su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la tuberculosis es fundamental mantener una hidratación adecuada con un consumo        " +
                                                  "\n diario recomendado de 2.5 litros de agua aproximadamente 10 vasos de tamaño regular para ayudar a fluidificar las          " +
                                                  "\n secreciones pulmonares y facilitar su expulsión. EJERCICIO: Se recomienda actividad física ligera como caminatas           " +
                                                  "\n lentas ejercicios de respiración profunda y estiramientos suaves para mejorar la oxigenación y la capacidad pulmonar       " +
                                                  "\n evitando esfuerzos intensos durante el tratamiento activo. POSIBLE TRATAMIENTO: El tratamiento suele incluir una           " +
                                                  "\n combinación de antibióticos como isoniazida rifampicina pirazinamida y etambutol durante un mínimo de 6 meses bajo         " +
                                                  "\n estricta supervisión médica en casos de tuberculosis resistente o diseminada puede requerirse hospitalización y ajustes    " +
                                                  "\n terapéuticos. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunológico y apoyar la recuperación se recomienda el    " +
                                                  "\n consumo de HÍGADO DE RES: Rico en hierro y vitamina A que ayuda a combatir la anemia y fortalecer la inmunidad aportando   " +
                                                  "\n más del 100% de la ingesta diaria recomendada por cada 100 gramos. FRUTAS CÍTRICAS: Como naranja y toronja ricas en        " +
                                                  "\n vitamina C que favorece la absorción de hierro y combate infecciones aportando aproximadamente el 89% de la ingesta diaria " +
                                                  "\n recomendada por cada 100 gramos. ESPINACAS Y BRÓCOLI: Aportan antioxidantes hierro y vitamina A esenciales para la         " +
                                                  "\n regeneración celular con un contenido de aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos.      " +
                                                  "\n YOGUR NATURAL: Contiene probióticos que fortalecen el sistema inmunológico y mejoran la salud digestiva aportando calcio   " +
                                                  "\n y proteínas esenciales. Este es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza al 100% que el   " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer más de un  " +
                                                  "\n Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente además por su salud si la " +
                                                  "\n respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico Angel L Montes agradece tu " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2 a 2.5 litros de agua al día para mantener la lubricación de las articulaciones,    " +
                                                  "\n facilitar la eliminación de toxinas y mejorar la circulación. En mujeres en etapa de ancianidad, una hidratación constante    " +
                                                  "\n también ayuda a prevenir la rigidez matutina y la fatiga asociada a la inflamación crónica. EJERCICIO: Actividad física de    " +
                                                  "\n bajo impacto como natación, yoga suave, caminatas cortas y ejercicios de movilidad articular puede mejorar la flexibilidad,   " +
                                                  "\n reducir el dolor y fortalecer los músculos que rodean las articulaciones. También se recomienda realizar ejercicios de        " +
                                                  "\n estiramiento diario, con apoyo si es necesario, para mantener la autonomía funcional y prevenir la pérdida de masa muscular.  " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento incluye analgésicos como Paracetamol, antiinflamatorios no esteroideos (AINEs) como       " +
                                                  "\n Ibuprofeno o Naproxeno, y en casos más avanzados, corticosteroides o fármacos modificadores de la enfermedad (FAMEs) como     " + 
                                                  "\n Metotrexato. En mujeres mayores, se debe ajustar la dosis según la función renal y hepática, y vigilar efectos adversos       " +
                                                  "\n gastrointestinales o cardiovasculares. También se puede considerar el uso de agentes biológicos bajo supervisión reumatológica. " +
                                                  "\n ALIMENTACIÓN: Se recomienda una dieta antiinflamatoria rica en: Jengibre (con compuestos antiinflamatorios naturales);      " +
                                                  "\n Cúrcuma (con curcumina, antioxidante potente); Pescados grasos (salmón, atún), con Omega-3, 50% por cada 100 g; Frutas      " +
                                                  "\n rojas (arándanos, fresas), con antocianinas y vitamina C, 89% por cada 100 g; y Espinacas (con vitamina A y magnesio, 56%   " +
                                                  "\n y 20% respectivamente por cada 100 g). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza   " +
                                                  "\n al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda  " +
                                                  "\n realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Además, por su salud, " +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu   " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 litros de agua al día, incluyendo infusiones calientes con jengibre     " +
                                                  "\n o miel para aliviar la tos y mantener las vías respiratorias hidratadas. En mujeres mayores, una hidratación         " +
                                                  "\n adecuada también ayuda a prevenir la sequedad de mucosas y facilita la expectoración. EJERCICIO: Durante la fase     " +
                                                  "\n aguda se recomienda reposo absoluto. Una vez superada la etapa crítica, se puede retomar ejercicios respiratorios,   " +
                                                  "\n caminatas suaves y movimientos de expansión torácica para mejorar la oxigenación y reducir la fatiga. También se     " +
                                                  "\n sugiere el uso de humidificadores y evitar ambientes con humo o polvo. POSIBLE TRATAMIENTO: El tratamiento incluye   " +
                                                  "\n antibióticos como Azitromicina, Claritromicina o Eritromicina, que deben iniciarse en los primeros días para reducir " +
                                                  "\n la duración y severidad de la enfermedad. En mujeres mayores, se debe ajustar la dosis según la función renal y      " +
                                                  "\n monitorear signos de complicaciones respiratorias. También se recomienda el uso de oxigenoterapia en casos de        " +
                                                  "\n dificultad respiratoria y rehabilitación pulmonar si hay secuelas. ALIMENTACIÓN: Se sugiere una dieta rica en        " +
                                                  "\n nutrientes que fortalezcan el sistema respiratorio como: Kiwi (con vitamina C, 92% por cada 100 g); Miel (con        " +
                                                  "\n propiedades antibacterianas y antiinflamatorias); Jengibre (con compuestos expectorantes y antiinflamatorios);       " +
                                                  "\n Zanahorias (con vitamina A, 93% por cada 100 g); y Yogur natural (con probióticos y calcio, 30% por cada 100 g).     " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga     " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un      " +
                                                  "\n Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Además, por su salud, si la       " +
                                                  "\n respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece     " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 litros de agua al día para mantener la función renal, reducir la fiebre     " +
                                                  "\n y aliviar la inflamación de las glándulas salivales. También se sugiere el uso de infusiones suaves y caldos tibios      " +
                                                  "\n para facilitar la deglución y mantener el confort. EJERCICIO: Durante la fase aguda se recomienda reposo absoluto.       " +
                                                  "\n Una vez que la fiebre y la inflamación disminuyen, se puede retomar actividad física ligera como estiramientos suaves,   " +
                                                  "\n ejercicios de cuello y caminatas cortas para mejorar la circulación y prevenir la rigidez muscular. Se debe evitar el    " +
                                                  "\n esfuerzo físico intenso hasta la recuperación completa. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral          " +
                                                  "\n específico. El manejo es sintomático e incluye Paracetamol o Ibuprofeno para el dolor y la fiebre, compresas frías       " +
                                                  "\n en las glándulas inflamadas y reposo. En mujeres mayores, se debe vigilar la aparición de complicaciones como            " +
                                                  "\n meningitis, pancreatitis o inflamación de ovarios. También se recomienda el aislamiento durante al menos cinco días      " +
                                                  "\n desde el inicio de la inflamación para evitar contagios. ALIMENTACIÓN: Se sugiere una dieta blanda y rica en nutrientes  " +
                                                  "\n como: Sopas y purés (fáciles de tragar y nutritivos); Frutas cítricas (con vitamina C, 89% por cada 100 g); Aguacate     " +
                                                  "\n (con vitamina E, 14% por cada 100 g); Zanahorias cocidas (con vitamina A, 93% por cada 100 g); y Yogur natural (con      " +
                                                  "\n probióticos y calcio, 30% por cada 100 g). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no      " +
                                                  "\n garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello,   " +
                                                  "\n se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado.      " +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.     " +
                                                  "\n Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una       " +
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO.       " +
                                                  "\n Se recomienda actividad física ligera como caminatas suaves de 15 a 20 minutos al día, ejercicios de respiración            " +
                                                  "\n profunda y estiramientos suaves para mantener la circulación activa, reducir el estrés y fortalecer el sistema              " +
                                                  "\n inmunológico. También es útil realizar ejercicios de equilibrio y movilidad para prevenir caídas y mejorar la coordinación. " +
                                                  "\n HIDRATACIÓN. Se aconseja consumir entre 2.5 y 3 litros de agua al día para prevenir la deshidratación causada por fiebre,   " +
                                                  "\n sudoración y pérdida de apetito. También se recomienda el consumo de infusiones suaves como manzanilla o té verde, así      " +
                                                  "\n como caldos naturales y jugos cítricos sin azúcar añadida para mantener el equilibrio de electrolitos. POSIBLE TRATAMIENTO. " +
                                                  "\n No existe un tratamiento antiviral específico para el Zika. El manejo se basa en aliviar los síntomas con reposo,           " +
                                                  "\n hidratación y medicamentos como paracetamol (Tempra) para reducir fiebre y dolor. No se recomienda el uso de                " +
                                                  "\n antiinflamatorios no esteroides como ibuprofeno hasta descartar dengue. En algunos casos se pueden usar antihistamínicos    " +
                                                  "\n para aliviar el sarpullido y la picazón. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica en antioxidantes,           " +
                                                  "\n vitamina C y compuestos antiinflamatorios. Algunos alimentos clave incluyen frutas cítricas como naranja, toronja y kiwi,   " +
                                                  "\n ricas en vitamina C, que fortalecen el sistema inmune, aportando el 89% del requerimiento diario por cada 100 gramos.       " +
                                                  "\n Verduras como espinaca y brócoli, ricas en vitamina A y ácido fólico, que ayudan a la regeneración celular y fortalecen     " +
                                                  "\n las mucosas, con un aporte del 15% del requerimiento diario por cada 100 gramos. Frutos secos como almendras y nueces,      " + 
                                                  "\n ricos en vitamina E y ácidos grasos esenciales, que protegen las células inmunológicas, con un aporte del 37% del           " +
                                                  "\n requerimiento diario por cada 28 gramos. Este diagnóstico es una referencia lógica basada en información médica, pero       " +
                                                  "\n no garantiza al 100% que el paciente tenga Zika ni que el tratamiento sea el adecuado. Se recomienda realizar más de un     " +
                                                  "\n diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera     " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener     " +
                                                  "\n una hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales.        " +
                                                  "\n EJERCICIO. Durante la fase aguda se recomienda reposo absoluto para evitar complicaciones gastrointestinales.         " +
                                                  "\n Una vez superada esta etapa, se pueden incorporar caminatas suaves de 10 a 15 minutos al día, ejercicios de           " +
                                                  "\n movilidad articular y respiración profunda para estimular la circulación y la recuperación intestinal. También        " +
                                                  "\n es útil realizar estiramientos suaves para reducir la rigidez muscular. HIDRATACIÓN. Se aconseja consumir entre       " +
                                                  "\n 2.5 y 3 litros de agua al día para prevenir la deshidratación causada por diarrea y vómito. También se recomienda     " +
                                                  "\n el uso de soluciones de rehidratación oral, caldos naturales y jugos suaves sin azúcar añadida. Se deben evitar       " +
                                                  "\n bebidas con cafeína, alcohol o alto contenido de azúcar, ya que pueden empeorar los síntomas. POSIBLE TRATAMIENTO.    " +
                                                  "\n No existe un tratamiento antiviral específico para el rotavirus. El manejo se basa en la rehidratación, el control    " +
                                                  "\n de la fiebre con paracetamol (Tempra) y el reposo. En casos severos puede requerirse hidratación intravenosa. No se   " +
                                                  "\n recomienda el uso de antidiarreicos como loperamida. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta blanda, baja   " +
                                                  "\n en fibra y rica en nutrientes esenciales. Algunos alimentos clave incluyen arroz blanco y puré de papa, que son       " +
                                                  "\n fáciles de digerir y ayudan a estabilizar el sistema digestivo. Yogur natural, fuente de probióticos que ayudan a     " +
                                                  "\n restaurar la flora intestinal. Plátano, rico en potasio, que ayuda a reponer electrolitos perdidos, aportando el 10%  " +
                                                  "\n del requerimiento diario por cada 100 gramos. Zanahoria cocida, rica en vitamina A, que fortalece las mucosas         " +
                                                  "\n intestinales, con un aporte del 15% del requerimiento diario por cada 100 gramos. Este diagnóstico es una referencia  " +
                                                  "\n lógica basada en información médica, pero no garantiza al 100% que el paciente tenga rotavirus ni que el tratamiento  " +
                                                  "\n sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico para mayor seguridad. Angel L   " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener       " +
                                                  "\n una hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales.          " +
                                                  "\n EJERCICIO. Durante la fase aguda se recomienda reposo absoluto. Una vez estabilizada, se pueden incorporar caminatas    " +
                                                  "\n suaves de 10 a 15 minutos al día, ejercicios de respiración profunda y estiramientos para mejorar la circulación,       " +
                                                  "\n reducir la rigidez muscular y apoyar la recuperación neurológica. También es útil realizar ejercicios de equilibrio     " +
                                                  "\n y coordinación para prevenir caídas. HIDRATACIÓN. Se aconseja consumir entre 2.5 y 3 litros de agua al día para         " +
                                                  "\n mantener el equilibrio de líquidos, facilitar la eliminación de toxinas y apoyar la función renal durante el            " +
                                                  "\n tratamiento antibiótico. También se recomienda el consumo de caldos naturales, infusiones suaves y jugos naturales      " +
                                                  "\n ricos en vitamina C. POSIBLE TRATAMIENTO. El tratamiento para la listeriosis incluye antibióticos como ampicilina,      " +
                                                  "\n gentamicina o trimetoprim-sulfametoxazol, dependiendo del caso. Marcas reconocidas incluyen Ampicillin y Bactrim.       " +
                                                  "\n En pacientes mayores se debe ajustar la dosis y monitorear efectos secundarios. Es fundamental iniciar el tratamiento   " +
                                                  "\n lo antes posible para evitar complicaciones neurológicas. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica en     " +
                                                  "\n proteínas, antioxidantes y vitaminas del complejo B. Algunos alimentos clave incluyen carnes magras y pescado, fuentes  " +
                                                  "\n de proteínas esenciales. Frutas cítricas como naranja y kiwi, ricas en vitamina C, que fortalecen el sistema inmune,    " +
                                                  "\n aportando el 89% del requerimiento diario por cada 100 gramos. Verduras como espinaca y brócoli, ricas en ácido fólico  " +
                                                  "\n y vitamina B9, esenciales para la regeneración celular, con un aporte del 15% del requerimiento diario por cada 100     " +
                                                  "\n gramos. Frutos secos como almendras y nueces, ricos en vitamina E y ácidos grasos esenciales, que protegen las células  " +
                                                  "\n inmunológicas y aportan el 37% del requerimiento diario por cada 28 gramos. Este diagnóstico es una referencia lógica   " +
                                                  "\n basada en información médica, pero no garantiza al 100% que el paciente tenga listeriosis ni que el tratamiento sea el  " +
                                                  "\n adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n La shigelosis es una infección bacteriana intestinal causada por Shigella, que provoca diarrea, fiebre, dolor     " +
                                                  "\n abdominal y, en casos graves, deshidratación. En la ancianidad, el riesgo de complicaciones aumenta debido a      " +
                                                  "\n la fragilidad del sistema inmunológico. EJERCICIO. Se recomienda actividad física ligera como caminatas cortas    " +
                                                  "\n o estiramientos suaves, que ayudan a mantener la circulación y prevenir el deterioro muscular sin comprometer     " + 
                                                  "\n la recuperación. HIDRATACIÓN. Es fundamental consumir entre 2.5 y 3 litros de agua al día para reponer los        " +
                                                  "\n líquidos perdidos por la diarrea y evitar la deshidratación. También se recomienda el uso de soluciones de        " +
                                                  "\n rehidratación oral con electrolitos como sodio y potasio. POSIBLE TRATAMIENTO. El tratamiento puede incluir       " +
                                                  "\n antibióticos como ciprofloxacino o azitromicina, especialmente en casos moderados a graves. Se debe evitar el     " +
                                                  "\n uso de antidiarreicos como la loperamida, ya que pueden empeorar la infección. ALIMENTACIÓN RECOMENDADA.          " +
                                                  "\n Consumir alimentos de fácil digestión y ricos en nutrientes esenciales. Plátano, rico en potasio, que ayuda a     " +
                                                  "\n reponer electrolitos, aportando aproximadamente el 10% del requerimiento diario por cada 100 g. Arroz blanco,     " +
                                                  "\n fuente de carbohidratos suaves que ayudan a estabilizar el sistema digestivo. Zanahoria, rica en vitamina A y     " +
                                                  "\n antioxidantes, que favorecen la regeneración de la mucosa intestinal, aportando cerca del 15% del requerimiento   " +
                                                  "\n diario de vitamina A por cada 100 g. Manzana, con pectina que regula el tránsito intestinal y aporta fibra        " +
                                                  "\n soluble. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el        " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se         " +
                                                  "\n recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado      " +
                                                  "\n de su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda     " +
                                                  "\n mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n La EPOC es una afección respiratoria progresiva que dificulta la respiración y puede causar tos crónica, producción      " +
                                                  "\n de moco y fatiga. En la ancianidad, su manejo requiere un enfoque integral y adaptado a la capacidad funcional del       " +
                                                  "\n paciente. EJERCICIO. Se recomienda actividad física moderada y personalizada, como caminatas suaves, ejercicios de       " +
                                                  "\n respiración profunda y fortalecimiento muscular, que ayudan a mejorar la capacidad pulmonar y reducir la disnea.         " +
                                                  "\n HIDRATACIÓN. Es fundamental consumir entre 2 y 3 litros de agua al día para mantener las vías respiratorias hidratadas   " +
                                                  "\n y facilitar la eliminación de mucosidad. También se sugiere el consumo de líquidos tibios como infusiones de jengibre    " +
                                                  "\n o caldos suaves. POSIBLE TRATAMIENTO. El tratamiento incluye broncodilatadores de acción prolongada como salmeterol o    " +
                                                  "\n tiotropio, corticosteroides inhalados como fluticasona, y en casos avanzados, oxigenoterapia. Es esencial el seguimiento " +
                                                  "\n médico y la adherencia al tratamiento. ALIMENTACIÓN RECOMENDADA. Consumir alimentos que fortalezcan el sistema           " +
                                                  "\n respiratorio y reduzcan la inflamación. Pescados grasos como salmón y atún, ricos en ácidos grasos Omega-3, que          " +
                                                  "\n poseen propiedades antiinflamatorias, aportando hasta el 90% del requerimiento diario por cada 100 g. Frutas como        " +
                                                  "\n arándanos y fresas, ricas en vitamina C y antioxidantes, que fortalecen el sistema inmune, aportando cerca del 70%       " +
                                                  "\n del requerimiento diario por cada 100 g. Verduras como espinaca y brócoli, ricas en hierro, vitamina A y carotenoides,   " +
                                                  "\n esenciales para la salud pulmonar. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza    " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello    " +
                                                  "\n se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su    " +
                                                  "\n paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar  " +
                                                  "\n a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n La clamidia es una infección bacteriana de transmisión sexual causada por Chlamydia trachomatis, que puede afectar el     " +
                                                  "\n tracto genital, rectal o faríngeo. En mujeres mayores, puede pasar desapercibida o confundirse con otras afecciones,      " +
                                                  "\n aumentando el riesgo de complicaciones. EJERCICIO. Se recomienda actividad física ligera como caminatas o estiramientos   " +
                                                  "\n suaves, evitando esfuerzos intensos durante el tratamiento para no comprometer el sistema inmunológico. HIDRATACIÓN. Es   " +
                                                  "\n fundamental consumir entre 2 y 2.5 litros de agua al día para facilitar la eliminación de toxinas, mantener la función    " +
                                                  "\n renal y apoyar el proceso de recuperación. POSIBLE TRATAMIENTO. El tratamiento de primera línea incluye doxiciclina       " +
                                                  "\n 100 mg dos veces al día durante 7 días o azitromicina 1 g en dosis única. En casos de alergia o resistencia, pueden       " +
                                                  "\n utilizarse alternativas como levofloxacino o ofloxacino. Es importante tratar también a las parejas sexuales para evitar  " +
                                                  "\n reinfección. ALIMENTACIÓN RECOMENDADA. Consumir alimentos que fortalezcan el sistema inmunológico y favorezcan la           " +
                                                  "\n recuperación. Frutas como kiwi y naranja, ricas en vitamina C, que ayudan a combatir infecciones, aportando hasta el 90%    " +
                                                  "\n del requerimiento diario por cada 100 g. Verduras como brócoli y espinaca, ricas en ácido fólico, hierro y antioxidantes.   " +
                                                  "\n Yogur natural, fuente de probióticos que fortalecen la flora intestinal. Carnes magras, ricas en proteínas necesarias para  " +
                                                  "\n la regeneración celular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el  " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer  " +
                                                  "\n más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su   " +
                                                  "\n salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Ángel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n EJERCICIO: Durante la fase aguda de la meningitis bacteriana se recomienda reposo absoluto, ya que el cuerpo necesita         " +
                                                  "\n conservar energía para combatir la infección y evitar complicaciones neurológicas. Una vez superada la fase crítica,          " +
                                                  "\n se pueden realizar ejercicios suaves como caminatas lentas, estiramientos o ejercicios de respiración para mejorar la         " +
                                                  "\n oxigenación cerebral, la movilidad y reducir la rigidez muscular. HIDRATACIÓN: Es fundamental consumir al menos 2.5           " +
                                                  "\n litros de agua al día para mantener la hidratación, facilitar la eliminación de toxinas y apoyar la función renal,            " +
                                                  "\n especialmente durante el tratamiento con antibióticos. También se recomienda el consumo de caldos naturales, infusiones       " +
                                                  "\n suaves y jugos sin azúcar, que aportan electrolitos esenciales como sodio, potasio y magnesio, ayudando a prevenir la         " +
                                                  "\n deshidratación y el desequilibrio electrolítico. POSIBLE TRATAMIENTO: El tratamiento de la meningitis bacteriana requiere     " +
                                                  "\n hospitalización inmediata y administración intravenosa de antibióticos como ceftriaxona, cefotaxima o ampicilina,             " +
                                                  "\n dependiendo del agente causal. En casos de infección por Listeria monocytogenes, se utiliza ampicilina combinada con          " +
                                                  "\n gentamicina. También se pueden administrar corticosteroides como la dexametasona para reducir la inflamación cerebral         " +
                                                  "\n y prevenir complicaciones como convulsiones o pérdida auditiva. En pacientes mayores, es esencial monitorear la función       " +
                                                  "\n renal y hepática durante el tratamiento. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes,          " +
                                                  "\n vitaminas y minerales para apoyar la recuperación neurológica, tales como pescado azul como salmón y atún, que contienen      " +
                                                  "\n ácidos grasos Omega-3 con propiedades antiinflamatorias y aportan hasta un 70% de la ingesta diaria recomendada. Frutas       " +
                                                  "\n como fresas y arándanos, que contienen antioxidantes y vitamina C en un 89% de la ingesta diaria recomendada, fortaleciendo   " +
                                                  "\n el sistema inmunológico. Verduras como zanahorias y brócoli, que aportan hasta un 50% de la ingesta diaria recomendada de     " +
                                                  "\n vitamina A y K, esenciales para la función cerebral. Frutos secos como almendras y nueces, que contienen vitamina E y         " +
                                                  "\n magnesio, contribuyendo con hasta un 40% de la ingesta diaria recomendada de estos nutrientes esenciales para la recuperación " +
                                                  "\n neurológica. este es solo un diagnóstico predeterminado lógico. haberlo consultado no garantiza al 100% que la paciente tenga " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar más de un diagnóstico para mayor   " +
                                                  "\n seguridad en el tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se      " +
                                                  "\n recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n EJERCICIO: La actividad física moderada es clave para mejorar la calidad de vida en personas mayores con cáncer.               " +
                                                  "\n Se recomienda realizar caminatas suaves de 20 a 30 minutos al día, ejercicios de estiramiento y respiración profunda           " +
                                                  "\n para reducir la fatiga, mejorar la oxigenación celular y mantener la movilidad. También es beneficioso incluir ejercicios      " +
                                                  "\n de equilibrio para prevenir caídas y fortalecer la musculatura. HIDRATACIÓN: Es esencial consumir al menos 2.5 litros de       " +
                                                  "\n agua al día para mantener la hidratación, reducir los efectos secundarios de la quimioterapia y facilitar la eliminación       " +
                                                  "\n de toxinas. También se recomienda el consumo de infusiones antioxidantes como té verde o rooibos, y caldos naturales que       " +
                                                  "\n aporten electrolitos y micronutrientes esenciales. Una hidratación adecuada ayuda a prevenir la sequedad de mucosas, la        " +
                                                  "\n fatiga y los trastornos digestivos asociados al tratamiento. POSIBLE TRATAMIENTO: El tratamiento del cáncer en personas        " +
                                                  "\n mayores debe ser individualizado según el tipo, estadio y estado funcional de la paciente. Puede incluir cirugía,              " +
                                                  "\n quimioterapia, radioterapia, inmunoterapia o terapias dirigidas. En mujeres mayores, se prioriza la tolerancia al              " +
                                                  "\n tratamiento y la calidad de vida, por lo que se pueden utilizar esquemas menos agresivos o tratamientos hormonales en          " +
                                                  "\n casos de cáncer hormonodependiente. Es fundamental realizar una evaluación geriátrica integral para ajustar el tratamiento     " +
                                                  "\n a las necesidades específicas. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes, proteínas y         " +
                                                  "\n micronutrientes para fortalecer el sistema inmunológico y apoyar la regeneración celular, tales como frutas cítricas como      " +
                                                  "\n naranjas y toronjas, que aportan vitamina C en un 89% de la ingesta diaria recomendada. Pescados grasos como salmón y atún,    " +
                                                  "\n que contienen ácidos grasos Omega-3 con propiedades antiinflamatorias y aportan hasta un 70% de la ingesta diaria recomendada. " +
                                                  "\n Verduras de hoja verde como espinacas y acelgas, que contienen antioxidantes y vitaminas esenciales para la función celular,   " +
                                                  "\n aportando hasta un 50% de la ingesta diaria recomendada de vitamina A y K. Frutos secos como almendras y nueces, que contienen " +
                                                  "\n vitamina E y magnesio, contribuyendo con hasta un 40% de la ingesta diaria recomendada de estos nutrientes esenciales para la  " +
                                                  "\n regeneración celular. este es solo un diagnóstico predeterminado lógico. haberlo consultado no garantiza al 100% que la        " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar más de un            " +
                                                  "\n diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico no le       " +
                                                  "\n satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que     " +
                                                  "\n te mejores.");
                            }
                        }
                        
                        if(EstaturaFemenino.equals("1.40-1.65 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n EJERCICIO: Durante la infección por influenza se recomienda reposo absoluto, ya que el cuerpo necesita conservar energía     " +
                                                  "\n para combatir el virus. Una vez que los síntomas disminuyen, se pueden realizar ejercicios suaves como caminatas lentas      " +
                                                  "\n o estiramientos para mejorar la circulación y reducir la rigidez muscular. También es útil practicar ejercicios de           " +
                                                  "\n respiración profunda para mejorar la oxigenación pulmonar. HIDRATACIÓN: Es fundamental consumir al menos 2.5 litros de       " +
                                                  "\n agua al día para mantener las mucosas hidratadas, reducir la fiebre y facilitar la eliminación de toxinas. También se        " +
                                                  "\n recomienda el consumo de caldos naturales, infusiones como té de jengibre o manzanilla y jugos naturales sin azúcar, que     " +
                                                  "\n aportan líquidos, antioxidantes y alivio para la garganta. POSIBLE TRATAMIENTO: El tratamiento de la influenza incluye       " +
                                                  "\n medicamentos antivirales como oseltamivir o zanamivir, que deben iniciarse dentro de las primeras 48 horas desde el inicio   " +
                                                  "\n de los síntomas para ser eficaces. También se utilizan antipiréticos como el paracetamol para controlar la fiebre y          " +
                                                  "\n analgésicos para aliviar el malestar general. En personas mayores, es fundamental evitar el uso de aspirina por el riesgo    " +
                                                  "\n de síndrome de Reye y monitorear posibles complicaciones como neumonía. ALIMENTACIÓN: Se recomienda el consumo de alimentos  " +
                                                  "\n ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico, tales como frutas cítricas como      " +
                                                  "\n naranjas y toronjas, que aportan vitamina C en un 89% de la ingesta diaria recomendada. Verduras como zanahorias y espinacas," +
                                                  "\n que contienen vitamina A y K en un 50% de la ingesta diaria recomendada, esenciales para la regeneración celular. Jengibre   " +
                                                  "\n y cúrcuma, que poseen propiedades antiinflamatorias y antioxidantes, contribuyendo con hasta un 40% de la ingesta diaria     " +
                                                  "\n recomendada de compuestos bioactivos beneficiosos para la salud respiratoria. este es solo un diagnóstico predeterminado     " +
                                                  "\n lógico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente " +
                                                  "\n correctas. se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su        " +
                                                  "\n salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece  " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n EJERCICIO: Durante la fase aguda de la neumonía se recomienda reposo absoluto para permitir que el cuerpo se recupere.       " +
                                                  "\n Una vez superada la etapa crítica, se pueden realizar ejercicios suaves como caminatas lentas, ejercicios de respiración     " +
                                                  "\n profunda y estiramientos para mejorar la capacidad pulmonar, reducir la fatiga y prevenir la pérdida de masa muscular.       " +
                                                  "\n HIDRATACIÓN: Es esencial consumir al menos 2.5 litros de agua al día para mantener las vías respiratorias hidratadas,        " +
                                                  "\n facilitar la expectoración y apoyar la función renal durante el tratamiento con antibióticos. También se recomienda el       " +
                                                  "\n consumo de caldos naturales, infusiones suaves y jugos sin azúcar para aportar líquidos y micronutrientes esenciales.        " +
                                                  "\n Una hidratación adecuada ayuda a reducir la viscosidad del moco y mejora la oxigenación. POSIBLE TRATAMIENTO: El             " +
                                                  "\n tratamiento de la neumonía incluye antibióticos como amoxicilina, ceftriaxona o levofloxacino, dependiendo del agente        " +
                                                  "\n causal y la gravedad del cuadro. También se pueden utilizar antipiréticos y broncodilatadores si hay dificultad              " +
                                                  "\n respiratoria. En personas mayores, es fundamental monitorear la función respiratoria y renal, y considerar la hospitalización " +
                                                  "\n si hay signos de descompensación. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes, proteínas y     " +
                                                  "\n vitaminas para fortalecer el sistema inmunológico y apoyar la regeneración pulmonar, tales como frutas como fresas y          " +
                                                  "\n arándanos, que aportan vitamina C en un 89% de la ingesta diaria recomendada. Verduras como brócoli y zanahorias, que         " +
                                                  "\n contienen vitamina A y K en un 50% de la ingesta diaria recomendada, esenciales para la función pulmonar. Pescados grasos     " +
                                                  "\n como salmón y atún, que aportan ácidos grasos Omega-3 en un 70% de la ingesta diaria recomendada, con propiedades             " +
                                                  "\n antiinflamatorias. Frutos secos como almendras y nueces, que contienen vitamina E y magnesio, contribuyendo con hasta un 40%  " +
                                                  "\n de la ingesta diaria recomendada de estos nutrientes. este es solo un diagnóstico predeterminado lógico. haberlo consultado   " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda  " +
                                                  "\n realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud, si la respuesta del     " +
                                                  "\n diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app         " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n EJERCICIO: La actividad física regular es fundamental para el control de la glucosa en sangre y la prevención de       " +
                                                  "\n complicaciones en personas mayores con diabetes. Se recomienda realizar caminatas suaves de 30 minutos al día,         " +
                                                  "\n ejercicios de resistencia con bandas elásticas y ejercicios de equilibrio para prevenir caídas. También es útil        " +
                                                  "\n practicar ejercicios de respiración y estiramientos para mejorar la circulación y reducir el estrés. HIDRATACIÓN:      " +
                                                  "\n Es crucial consumir entre 2 y 2.5 litros de agua al día para mantener el equilibrio de líquidos, prevenir la           " +
                                                  "\n deshidratación y facilitar la eliminación de glucosa a través de la orina. También se recomienda el consumo de         " +
                                                  "\n infusiones sin azúcar como té de canela o manzanilla, que pueden ayudar a estabilizar los niveles de glucosa.          " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento de la diabetes tipo 2 en personas mayores incluye cambios en el estilo de vida,    " +
                                                  "\n control nutricional y medicamentos como metformina, inhibidores de DPP-4 o análogos de GLP-1. En algunos casos, puede  " +
                                                  "\n ser necesario el uso de insulina. Es fundamental individualizar el tratamiento para evitar hipoglucemias y preservar   " +
                                                  "\n la funcionalidad. También se recomienda el monitoreo regular de la glucosa y la evaluación de la función renal y       " +
                                                  "\n hepática. ALIMENTACIÓN: Se recomienda el consumo de alimentos con bajo índice glucémico y ricos en fibra, vitaminas    " +
                                                  "\n y minerales, tales como legumbres como lentejas y garbanzos, que aportan fibra y proteínas de alta calidad. Frutas     " +
                                                  "\n como manzanas y peras, que contienen fibra soluble y vitamina C en un 70% de la ingesta diaria recomendada. Verduras     " +
                                                  "\n como espinacas y brócoli, que aportan ácido fólico, vitamina A y K en un 50% de la ingesta diaria recomendada. Frutos    " +
                                                  "\n secos como nueces y almendras, que contienen magnesio y vitamina E, contribuyendo con hasta un 40% de la ingesta diaria  " +
                                                  "\n recomendada de estos nutrientes esenciales para la salud metabólica. este es solo un diagnóstico predeterminado lógico.  " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente   " +
                                                  "\n correctas. se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su  " +
                                                  "\n salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN: Para el tratamiento del asma es fundamental mantener una hidratación adecuada con un consumo diario     " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para mantener las vías          " +
                                                  "\n respiratorias húmedas y facilitar la expulsión de mucosidad. EJERCICIO: Se recomienda actividad física ligera y      " +
                                                  "\n controlada como caminatas lentas ejercicios de respiración profunda y estiramientos suaves evitando ambientes        " +
                                                  "\n fríos o con alérgenos. Además se sugiere la práctica de ejercicios de relajación como yoga adaptado o tai chi para   " +
                                                  "\n mejorar la capacidad pulmonar y reducir la ansiedad asociada a la dificultad respiratoria. POSIBLE TRATAMIENTO: El   " +
                                                  "\n tratamiento suele incluir broncodilatadores de alivio rápido como el salbutamol corticosteroides inhalados como la   " +
                                                  "\n fluticasona o budesonida y en algunos casos modificadores de leucotrienos como el montelukast. Es fundamental seguir " +
                                                  "\n el plan de acción indicado por el médico y utilizar los inhaladores con técnica adecuada. ALIMENTOS RECOMENDADOS:    " +
                                                  "\n Para fortalecer el sistema respiratorio se recomienda el consumo de PESCADOS GRASOS: Como el salmón y el atún ricos  " +
                                                  "\n en ácidos grasos Omega-3 con propiedades antiinflamatorias que aportan aproximadamente el 50% de la ingesta diaria   " + 
                                                  "\n recomendada por cada 100 gramos. FRUTAS Y VERDURAS DE COLORES VIVOS: Como arándanos fresas espinacas y brócoli ricos " +
                                                  "\n en antioxidantes como la vitamina C y carotenoides que fortalecen el sistema inmunológico aportando aproximadamente  " +
                                                  "\n el 70% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Con compuestos antiinflamatorios que pueden   " +
                                                  "\n aliviar la inflamación de las vías respiratorias. CÚRCUMA: Con curcumina que posee propiedades antioxidantes y       " +
                                                  "\n antiinflamatorias. Este es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza al 100% que el  " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer más  " +
                                                  "\n de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente además por su " +
                                                  "\n salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico Angel L  " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN: Para el tratamiento del VIH/SIDA es fundamental mantener una hidratación adecuada con un consumo diario         " +
                                                  "\n recomendado de 2.5 litros de agua aproximadamente 10 vasos de tamaño regular para apoyar la función renal y hepática         " +
                                                  "\n durante la terapia antirretroviral. EJERCICIO: Se recomienda actividad física regular y moderada como caminatas natación     " +
                                                  "\n o ejercicios de bajo impacto para mejorar la función cardiovascular mantener la masa muscular y reducir el estrés.           " +
                                                  "\n También se sugiere la práctica de ejercicios de fortalecimiento y movilidad para contrarrestar la pérdida de densidad        " +
                                                  "\n ósea y mejorar el bienestar general. POSIBLE TRATAMIENTO: El tratamiento se basa en la terapia antirretroviral combinada     " +
                                                  "\n (TAR) que incluye medicamentos como tenofovir emtricitabina dolutegravir o efavirenz según el esquema indicado por el        " +
                                                  "\n médico. Es fundamental mantener la adherencia diaria al tratamiento para lograr la supresión viral y prevenir complicaciones." +
                                                  "\n ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunológico se recomienda el consumo de FRUTAS CÍTRICAS: Como naranja    " +
                                                  "\n toronja y guayaba ricas en vitamina C que aportan aproximadamente el 89% de la ingesta diaria recomendada por cada 100       " +
                                                  "\n gramos. HÍGADO DE RES: Fuente de hierro y vitamina A que ayuda a combatir la anemia y fortalecer la inmunidad aportando      " +
                                                  "\n más del 100% de la ingesta diaria recomendada por cada 100 gramos. ESPINACAS Y BRÓCOLI: Ricos en antioxidantes hierro y      " +
                                                  "\n vitamina A esenciales para la regeneración celular con un contenido de aproximadamente el 56% de la ingesta diaria           " +
                                                  "\n recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probióticos que fortalecen el sistema inmunológico y mejoran la     " +
                                                  "\n salud digestiva aportando calcio y proteínas esenciales. Este es solo un diagnóstico predeterminado lógico haberlo           " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas     " +
                                                  "\n para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado    " +
                                                  "\n de su paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar " +
                                                  "\n a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la gonorrea es fundamental mantener una hidratación adecuada con un consumo diario   " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para facilitar la eliminación de    " +
                                                  "\n toxinas y apoyar el sistema inmunológico. EJERCICIO: Se recomienda actividad física ligera como caminatas suaves         " +
                                                  "\n ejercicios de movilidad articular y estiramientos para mejorar la circulación y fortalecer el sistema inmunológico       " +
                                                  "\n evitando esfuerzos intensos durante el tratamiento. POSIBLE TRATAMIENTO: El tratamiento suele incluir antibióticos       " +
                                                  "\n como la ceftriaxona en combinación con azitromicina o doxiciclina según la indicación médica. Es fundamental completar   " +
                                                  "\n el tratamiento y evitar relaciones sexuales hasta que se confirme la curación para prevenir reinfecciones. ALIMENTOS     " +
                                                  "\n RECOMENDADOS: Para fortalecer el sistema inmunológico se recomienda el consumo de NARANJAS Y GUAYABAS: Ricas en          " +
                                                  "\n vitamina C que ayudan a combatir infecciones bacterianas aportando aproximadamente el 89% de la ingesta diaria           " +
                                                  "\n recomendada por cada 100 gramos. JENGIBRE: Con propiedades antiinflamatorias que pueden ayudar a reducir la inflamación. " +
                                                  "\n ESPINACAS Y BRÓCOLI: Aportan antioxidantes y vitamina A esenciales para la regeneración celular con un contenido de      " +
                                                  "\n aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probióticos que     " +
                                                  "\n fortalecen el sistema inmunológico y mejoran la salud digestiva aportando calcio y proteínas esenciales. Este es solo    " +
                                                  "\n un diagnóstico predeterminado lógico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni    " +
                                                  "\n que las respuestas sean completamente correctas para ello se recomienda hacer más de un Diagnóstico de Mi Vida para      " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente además por su salud si la respuesta del Diagnóstico " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su médico Angel L Montes agradece tu visita a la app         " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital. " +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 litros de agua al día para mantener la piel hidratada, favorecer         " +
                                                  "\n la eliminación de toxinas y apoyar la función renal, especialmente importante en mujeres mayores que toman            " +
                                                  "\n múltiples medicamentos. También se sugiere el uso de infusiones suaves como manzanilla o té verde para aliviar        " +
                                                  "\n la inflamación. EJERCICIO: Durante los brotes activos se recomienda reposo relativo. Una vez superados los            " +
                                                  "\n síntomas, se puede retomar actividad física ligera como caminatas suaves, ejercicios de estiramiento y respiración    " +
                                                  "\n profunda. Estas actividades ayudan a reducir el estrés, que es un factor desencadenante de los brotes, y fortalecen   " +
                                                  "\n el sistema inmunológico. También se recomienda practicar técnicas de relajación como meditación o tai chi. POSIBLE    " +
                                                  "\n TRATAMIENTO: El tratamiento incluye antivirales orales como Aciclovir, Valaciclovir o Famciclovir, administrados      " +
                                                  "\n durante 7 a 10 días en el primer episodio, y de 1 a 5 días en recurrencias. En mujeres mayores, puede indicarse       " +
                                                  "\n tratamiento supresivo diario si los brotes son frecuentes. También se pueden usar cremas anestésicas con lidocaína    " +
                                                  "\n para aliviar el dolor, aunque no sustituyen el tratamiento oral. Es fundamental iniciar el tratamiento al primer      " +
                                                  "\n signo de brote y mantener una higiene íntima adecuada. ALIMENTACIÓN: Se recomienda una dieta rica en nutrientes       " +
                                                  "\n antivirales y antiinflamatorios como: Kiwi (con vitamina C, 92% por cada 100 g); Almendras (fuente de L-lisina, 25%   " +
                                                  "\n por cada 100 g); Jengibre (con compuestos antiinflamatorios); Yogur natural (con probióticos y calcio, 30% por cada   " +
                                                  "\n 100 g); y Espinacas (con vitamina A y magnesio, 56% y 20% respectivamente por cada 100 g). Este es solo un diagnóstico" +
                                                  "\n predeterminado lógico. Para mayor seguridad, se recomienda realizar más de un Diagnóstico de Mi Vida y consultar a su " +
                                                  "\n médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 litros de agua al día para apoyar la función renal, facilitar la eliminación    " +
                                                  "\n de toxinas y mantener la circulación adecuada. En mujeres mayores, una hidratación constante también ayuda a prevenir la     " +
                                                  "\n fatiga y la sequedad de mucosas. EJERCICIO: Actividad física ligera como caminatas, ejercicios de movilidad articular y      " +
                                                  "\n respiración profunda puede mejorar la circulación, reducir el estrés y fortalecer el sistema inmunológico. Se recomienda     " +
                                                  "\n evitar el esfuerzo físico intenso durante el tratamiento antibiótico. POSIBLE TRATAMIENTO: El tratamiento estándar es la     " +
                                                  "\n Penicilina G Benzatina (2.4 millones de unidades intramuscular en dosis única para sífilis primaria o secundaria). En        " +
                                                  "\n mujeres mayores con alergia a la penicilina, se puede usar Doxiciclina (100 mg dos veces al día por 14 días) o Ceftriaxona   " +
                                                  "\n (1 g diario por 10 a 14 días). En casos de neurosífilis, se requiere hospitalización y tratamiento intravenoso. Es           " +
                                                  "\n fundamental realizar seguimiento serológico y tratar a las parejas sexuales. ALIMENTACIÓN: Se recomienda una dieta rica      " +
                                                  "\n en nutrientes inmunoestimulantes como: Plátanos (con potasio, 23% por cada 100 g); Brócoli (con vitamina C, 135% por cada    " +
                                                  "\n 100 g); Lentejas (con hierro, 37% por cada 100 g); Ajo (con propiedades antibacterianas naturales); y Frutas cítricas        " +
                                                  "\n (con vitamina C, 89% por cada 100 g). Este es solo un diagnóstico predeterminado lógico. Para mayor seguridad, se recomienda " +
                                                  "\n realizar más de un Diagnóstico de Mi Vida y consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y    " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 3 litros de agua al día para mantener la función pulmonar, fluidificar las   " +
                                                  "\n secreciones y facilitar su expulsión. En mujeres mayores, una hidratación adecuada también ayuda a prevenir la        " +
                                                  "\n deshidratación causada por fiebre o pérdida de apetito. EJERCICIO: Durante la fase activa se recomienda reposo        " +
                                                  "\n supervisado. Una vez estabilizada, se puede iniciar rehabilitación pulmonar con ejercicios de respiración profunda,   " +
                                                  "\n caminatas suaves y estiramientos. Estas actividades mejoran la oxigenación, reducen la fatiga y previenen la pérdida  " +
                                                  "\n de masa muscular. También se recomienda evitar ambientes cerrados o con poca ventilación. POSIBLE TRATAMIENTO: El     " +
                                                  "\n tratamiento estándar incluye una combinación de Isoniazida, Rifampicina, Pirazinamida y Etambutol durante los primeros " +
                                                  "\n 2 meses, seguido de Isoniazida y Rifampicina por 4 meses más. En mujeres mayores, se debe monitorear la función        " +
                                                  "\n hepática y ajustar las dosis si hay deterioro renal. También se recomienda el uso de vitamina B6 (piridoxina) para     " +
                                                  "\n prevenir neuropatía inducida por Isoniazida. El tratamiento debe ser supervisado estrictamente para evitar recaídas o  " +
                                                  "\n resistencia. ALIMENTACIÓN: Se sugiere una dieta rica en proteínas y antioxidantes como: Naranjas (con vitamina C, 89%  " +
                                                  "\n por cada 100 g); Aguacate (con vitamina E, 14% por cada 100 g); Pescados grasos (con Omega-3, 50% por cada 100 g);     " +
                                                  "\n Huevos (con colina, 27% por unidad); y Legumbres (con hierro y proteína vegetal, 37% por cada 100 g). Este es solo un  " +
                                                  "\n diagnóstico predeterminado lógico. Para mayor seguridad, se recomienda realizar más de un Diagnóstico de Mi Vida y     " +
                                                  "\n consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una     " +
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO.     " +
                                                  "\n Se recomienda actividad física de bajo impacto como caminatas suaves, natación o yoga terapéutico durante 20 a 30         " +
                                                  "\n minutos al día, cinco veces por semana. También es útil realizar ejercicios de fortalecimiento muscular con bandas        " +
                                                  "\n elásticas o pesas ligeras para estabilizar las articulaciones y prevenir la pérdida de masa ósea. El ejercicio mejora     " +
                                                  "\n la movilidad, reduce la rigidez y ayuda a mantener la independencia funcional. HIDRATACIÓN. Se aconseja consumir entre    " +
                                                  "\n 2 y 2.5 litros de agua al día para mantener la lubricación de las articulaciones y apoyar la función renal. También se    " +
                                                  "\n recomienda el consumo de infusiones antiinflamatorias como té verde o manzanilla, así como caldos naturales ricos en      " +
                                                  "\n minerales. POSIBLE TRATAMIENTO. El tratamiento incluye analgésicos como paracetamol, antiinflamatorios no esteroides      " +
                                                  "\n (AINEs) como ibuprofeno o naproxeno, y fármacos modificadores de la enfermedad como metotrexato o sulfasalazina. En       " +
                                                  "\n casos más avanzados, se pueden utilizar terapias biológicas como los inhibidores del TNF. Marcas reconocidas incluyen     " +
                                                  "\n Advil, Arava y Enbrel. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta antiinflamatoria rica en omega-3, antioxidantes  " +
                                                  "\n y fibra. Algunos alimentos clave incluyen pescados grasos como salmón y sardina, frutas cítricas como naranja y kiwi,     " +
                                                  "\n verduras de hoja verde como espinaca y brócoli, y frutos secos como almendras y nueces. Este diagnóstico es una referencia " +
                                                  "\n lógica basada en información médica, pero no garantiza al 100% que el paciente tenga artritis ni que el tratamiento sea   " +
                                                  "\n el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes    " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una       " +
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO.       " +
                                                  "\n Se recomienda reposo durante la fase aguda. Posteriormente, se pueden incorporar caminatas suaves, ejercicios de            " +
                                                  "\n respiración profunda y técnicas de expansión torácica para mejorar la capacidad pulmonar. También es útil realizar          " +
                                                  "\n ejercicios de relajación como meditación o yoga suave para reducir la ansiedad respiratoria. HIDRATACIÓN. Se aconseja       " +
                                                  "\n consumir entre 2.5 y 3 litros de agua al día para mantener las vías respiratorias hidratadas y facilitar la eliminación     " +
                                                  "\n de mucosidad. Infusiones tibias de jengibre, miel y limón pueden aliviar la irritación de garganta. También se recomienda   " +
                                                  "\n el consumo de caldos naturales y jugos cítricos sin azúcar añadida. POSIBLE TRATAMIENTO. El tratamiento incluye             " +
                                                  "\n antibióticos como azitromicina, claritromicina o eritromicina. En casos severos, se pueden usar broncodilatadores           " +
                                                  "\n o corticosteroides. Marcas reconocidas incluyen Zithromax, Biaxin y Erythrocin. Es importante iniciar el tratamiento        " +
                                                  "\n en las primeras etapas para reducir la gravedad y prevenir contagios. ALIMENTACIÓN RECOMENDADA. Se recomienda una           " +
                                                  "\n dieta rica en vitamina C, vitamina A y antioxidantes. Algunos alimentos clave incluyen frutas cítricas, zanahoria,          " +
                                                  "\n espinaca, miel natural y jengibre fresco. Este diagnóstico es una referencia lógica basada en información médica,           " +
                                                  "\n pero no garantiza al 100% que el paciente tenga tosferina ni que el tratamiento sea el adecuado. Se recomienda realizar     " +
                                                  "\n más de un diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes agradece tu visita a la app              " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una    " +
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO.    " +
                                                  "\n Se recomienda reposo absoluto durante la fase aguda para evitar complicaciones. Una vez superada, se pueden incorporar   " +
                                                  "\n ejercicios suaves de movilidad, estiramientos y caminatas cortas para mejorar la circulación y prevenir la rigidez       " + 
                                                  "\n muscular. HIDRATACIÓN. Se aconseja consumir entre 2 y 2.5 litros de agua al día para aliviar la inflamación de las       " +
                                                  "\n glándulas salivales y prevenir la deshidratación. También se recomienda el consumo de caldos suaves, infusiones tibias   " +
                                                  "\n y jugos naturales sin azúcar añadida. POSIBLE TRATAMIENTO. El tratamiento es sintomático e incluye analgésicos como      " +
                                                  "\n paracetamol o ibuprofeno para reducir el dolor y la fiebre. En casos severos, se pueden usar corticosteroides. También   " +
                                                  "\n se recomienda aplicar compresas frías en las zonas inflamadas. Marcas reconocidas incluyen Tempra y Advil. ALIMENTACIÓN  " +
                                                  "\n RECOMENDADA. Se recomienda una dieta suave, rica en vitaminas y fácil de masticar. Algunos alimentos clave incluyen      " +
                                                  "\n yogur, puré de papa, plátano, mango, zanahoria cocida y calabacín. La miel puede ayudar a calmar la garganta. Este       " +
                                                  "\n diagnóstico es una referencia lógica basada en información médica, pero no garantiza al 100% que el paciente tenga       " +
                                                  "\n paperas ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico      " +
                                                  "\n para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n El virus del Zika es una infección transmitida por el mosquito Aedes aegypti que puede causar fiebre leve, sarpullido,     " +
                                                  "\n dolor muscular, conjuntivitis y malestar general. En la ancianidad, aunque los síntomas suelen ser leves, el sistema       " +
                                                  "\n inmunológico debilitado puede prolongar la recuperación. EJERCICIO. Se recomienda actividad física ligera como caminatas   " +
                                                  "\n suaves, estiramientos o ejercicios de respiración, que ayudan a mantener la circulación y reducir el estrés sin agotar     " +
                                                  "\n al organismo. HIDRATACIÓN. Es fundamental consumir entre 2.5 y 3 litros de agua al día para prevenir la deshidratación,    " +
                                                  "\n regular la temperatura corporal y facilitar la eliminación de toxinas. También se sugiere el consumo de infusiones         " +
                                                  "\n suaves como manzanilla o té verde por sus propiedades antioxidantes. POSIBLE TRATAMIENTO. No existe un tratamiento         " +
                                                  "\n antiviral específico para el Zika. Se recomienda el uso de paracetamol para aliviar la fiebre y el dolor, evitando         " +
                                                  "\n el ibuprofeno y la aspirina por el riesgo de sangrado. Es esencial el reposo, el control de síntomas y la vigilancia       " +
                                                  "\n médica ante cualquier complicación. ALIMENTACIÓN RECOMENDADA. Consumir alimentos que fortalezcan el sistema inmunológico   " +
                                                  "\n y reduzcan la inflamación. Frutas cítricas como naranja y toronja, ricas en vitamina C, que fortalecen las defensas,       " +
                                                  "\n aportando hasta el 89% del requerimiento diario por cada 100 g. Papaya, rica en vitamina A y C, que favorece la            " +
                                                  "\n regeneración celular, aportando cerca del 75% del requerimiento diario de vitamina C por cada 100 g. Jengibre, con         " +
                                                  "\n propiedades antiinflamatorias y antioxidantes. Verduras de hoja verde como espinaca, que aportan hierro y antioxidantes    " +
                                                  "\n esenciales para la recuperación. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al     " +
                                                  "\n 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se      " +
                                                  "\n recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su         " +
                                                  "\n paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar    " +
                                                  "\n a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n El rotavirus es una infección viral que causa gastroenteritis, caracterizada por diarrea severa, vómitos, fiebre y           " +
                                                  "\n deshidratación. En personas mayores, puede provocar complicaciones graves si no se trata adecuadamente. EJERCICIO.           " +
                                                  "\n Se recomienda actividad física muy ligera durante la fase aguda, como estiramientos suaves o caminatas cortas, para          " +
                                                  "\n mantener la movilidad sin agotar al cuerpo. HIDRATACIÓN. Es fundamental consumir entre 2.5 y 3 litros de agua al día         " +
                                                  "\n para reponer los líquidos perdidos por la diarrea y los vómitos. También se recomienda el uso de soluciones de               " +
                                                  "\n rehidratación oral con electrolitos como sodio y potasio. POSIBLE TRATAMIENTO. No existe un tratamiento antiviral            " + 
                                                  "\n específico para el rotavirus. Se recomienda el uso de paracetamol para aliviar la fiebre y el malestar, evitando el          " +
                                                  "\n ibuprofeno y la aspirina. En casos graves, puede ser necesario el uso de líquidos intravenosos. ALIMENTACIÓN RECOMENDADA.    " +
                                                  "\n Consumir alimentos de fácil digestión y ricos en nutrientes esenciales. Plátano, rico en potasio, que ayuda a reponer        " +
                                                  "\n electrolitos, aportando aproximadamente el 10% del requerimiento diario por cada 100 g. Arroz blanco, fuente de              " +
                                                  "\n carbohidratos suaves que estabilizan el sistema digestivo. Zanahoria, rica en vitamina A y antioxidantes, que favorecen      " +
                                                  "\n la regeneración de la mucosa intestinal, aportando cerca del 15% del requerimiento diario de vitamina A por cada 100 g.      " +
                                                  "\n Manzana, con pectina que regula el tránsito intestinal y aporta fibra soluble. Este es solo un diagnóstico predeterminado    " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus      " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad   " +
                                                  "\n en el tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se   " +
                                                  "\n le recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria." +
                                                  "\n La listeriosis es una infección bacteriana causada por Listeria monocytogenes, que puede provocar fiebre, dolores             " +
                                                  "\n musculares, náuseas y, en casos graves, afectar el sistema nervioso. En la ancianidad, el riesgo de complicaciones            " +
                                                  "\n es mayor debido a la inmunidad reducida. EJERCICIO. Se recomienda actividad física moderada y adaptada, como caminatas        " +
                                                  "\n suaves o ejercicios de respiración, que ayudan a mantener la circulación y reducir el estrés sin comprometer la               " +
                                                  "\n recuperación. HIDRATACIÓN. Es fundamental consumir entre 2 y 2.5 litros de agua al día para apoyar la función renal,          " +
                                                  "\n eliminar toxinas y mantener el equilibrio de líquidos. También se sugiere el consumo de infusiones suaves como manzanilla     " +
                                                  "\n o agua de coco. POSIBLE TRATAMIENTO. La listeriosis se trata con antibióticos como ampicilina o trimetoprima-sulfametoxazol.  " +
                                                  "\n En casos graves, puede requerirse tratamiento intravenoso y hospitalización. Es esencial seguir el tratamiento completo y     " +
                                                  "\n bajo supervisión médica. ALIMENTACIÓN RECOMENDADA. Consumir alimentos ricos en antioxidantes y vitaminas para fortalecer      " +
                                                  "\n el sistema inmunológico. Espinaca, rica en hierro y vitamina K, que favorece la recuperación celular, aportando hasta el      " +
                                                  "\n 20% del requerimiento diario de hierro por cada 100 g. Yogur natural, fuente de probióticos que fortalecen la flora           " +
                                                  "\n intestinal. Frutas cítricas como naranja y toronja, ricas en vitamina C, que contribuyen a la recuperación, aportando         " +
                                                  "\n aproximadamente el 89% del requerimiento diario por cada 100 g. Este es solo un diagnóstico predeterminado lógico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén      " +
                                                  "\n correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento   " +
                                                  "\n adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho  " +
                                                  "\n consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n EJERCICIO: Durante la fase activa de la shigelosis se recomienda reposo absoluto, ya que la diarrea, fiebre y debilidad      " +  
                                                  "\n general pueden comprometer la estabilidad física. Una vez superada la fase aguda, se pueden realizar caminatas suaves y      " +
                                                  "\n ejercicios de respiración para estimular la circulación, mejorar la digestión y recuperar la energía. HIDRATACIÓN: Es        " +
                                                  "\n fundamental consumir entre 2.5 y 3 litros de agua al día para prevenir la deshidratación causada por la diarrea. También     " +
                                                  "\n se recomienda el uso de soluciones de rehidratación oral que aporten sodio, potasio y glucosa, así como caldos naturales     " +
                                                  "\n y jugos suaves sin azúcar para reponer electrolitos y mantener el equilibrio hídrico. POSIBLE TRATAMIENTO: En casos leves,   " +
                                                  "\n la shigelosis puede resolverse con reposo e hidratación, pero en personas mayores o con síntomas severos se recomienda el    " +
                                                  "\n uso de antibióticos como ciprofloxacino o azitromicina, siempre bajo prescripción médica. No se deben utilizar medicamentos  " +
                                                  "\n antidiarreicos como loperamida, ya que pueden empeorar la infección. También es importante mantener una higiene estricta     " +
                                                  "\n para evitar la reinfección. ALIMENTACIÓN: Se recomienda el consumo de alimentos suaves y ricos en nutrientes para fortalecer " +
                                                  "\n el sistema digestivo, tales como arroz blanco y plátano, que aportan potasio y fibra soluble. Yogur natural, que contiene      " +
                                                  "\n probióticos beneficiosos para la flora intestinal. Zanahorias cocidas, que aportan vitamina A y antioxidantes en un 50% de     " +
                                                  "\n la ingesta diaria recomendada. Manzanas cocidas o ralladas, que contienen pectina y vitamina C en un 70% de la ingesta diaria  " +
                                                  "\n recomendada, ayudando a regular el tránsito intestinal. este es solo un diagnóstico predeterminado lógico. haberlo consultado  " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda   " +
                                                  "\n realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud, si la respuesta del      " +
                                                  "\n diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app          " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n EJERCICIO: La actividad física moderada es esencial para mantener la capacidad pulmonar y prevenir la pérdida de masa     " +
                                                  "\n muscular en personas mayores con EPOC. Se recomienda realizar caminatas suaves de 20 a 30 minutos al día, ejercicios      " +
                                                  "\n de respiración diafragmática y estiramientos para mejorar la movilidad torácica. También es útil incluir ejercicios de    " +
                                                  "\n fortalecimiento muscular con bandas elásticas bajo supervisión médica. HIDRATACIÓN: Es crucial consumir entre 2.5 y 3     " +
                                                  "\n litros de agua al día para mantener las vías respiratorias hidratadas, facilitar la eliminación de secreciones y reducir  " +
                                                  "\n la viscosidad del moco. También se recomienda el consumo de infusiones como té de jengibre o manzanilla, que poseen       " +
                                                  "\n propiedades antiinflamatorias y relajantes. POSIBLE TRATAMIENTO: El tratamiento de la EPOC incluye broncodilatadores      " +
                                                  "\n de acción corta como salbutamol para alivio rápido, y de acción prolongada como tiotropio para el control diario. También " +
                                                  "\n se utilizan corticosteroides inhalados como fluticasona o budesonida para reducir la inflamación. En casos avanzados,     " +
                                                  "\n puede ser necesaria la oxigenoterapia domiciliaria. Es fundamental realizar espirometrías periódicas y ajustar el         " +
                                                  "\n tratamiento según la evolución clínica. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y      " +
                                                  "\n nutrientes esenciales para la función pulmonar, tales como frutas cítricas como naranjas y toronjas, que aportan          " +
                                                  "\n vitamina C en un 89% de la ingesta diaria recomendada. Pescados grasos como salmón y atún, que contienen ácidos grasos    " +
                                                  "\n Omega-3 con propiedades antiinflamatorias y aportan hasta un 70% de la ingesta diaria recomendada. Verduras de hoja       " +
                                                  "\n verde como espinacas y acelgas, que aportan vitamina A y K en un 50% de la ingesta diaria recomendada. Jengibre y         " +
                                                  "\n cúrcuma, que contienen compuestos bioactivos con propiedades antiinflamatorias, contribuyendo con hasta un 40% de la      " +
                                                  "\n ingesta diaria recomendada. este es solo un diagnóstico predeterminado lógico. haberlo consultado no garantiza al 100%    " +
                                                  "\n que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar más      " +
                                                  "\n de un diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico  " +
                                                  "\n no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y     " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n EJERCICIO: Durante el tratamiento de la clamidia se recomienda evitar esfuerzos físicos intensos y priorizar el descanso,      " +
                                                  "\n especialmente si hay síntomas como fiebre o dolor pélvico. Una vez finalizado el tratamiento, se pueden retomar ejercicios     " +
                                                  "\n suaves como caminatas o yoga para mejorar la circulación y reducir el estrés, que puede afectar la respuesta inmunológica.     " +
                                                  "\n HIDRATACIÓN: Es fundamental consumir al menos 2.5 litros de agua al día para mantener la salud de las mucosas, facilitar la    " +
                                                  "\n eliminación de toxinas y apoyar la función renal durante el tratamiento antibiótico. También se recomienda el consumo de       " +
                                                  "\n infusiones como té verde o manzanilla, que poseen propiedades antibacterianas y calmantes. POSIBLE TRATAMIENTO: La clamidia    " +
                                                  "\n se trata con antibióticos como azitromicina en dosis única o doxiciclina durante 7 días. En personas mayores, es importante    " +
                                                  "\n ajustar la dosis según la función renal y hepática. También se recomienda evitar relaciones sexuales durante el tratamiento    " +
                                                  "\n y asegurarse de que la pareja reciba tratamiento para prevenir reinfecciones. ALIMENTACIÓN: Se recomienda el consumo de        " +
                                                  "\n alimentos que fortalezcan el sistema inmunológico y favorezcan la regeneración de tejidos, tales como frutas cítricas como      " +
                                                  "\n naranjas y toronjas, que aportan vitamina C en un 89% de la ingesta diaria recomendada. Yogur natural, que contiene probióticos " +
                                                  "\n que equilibran la flora vaginal y fortalecen las defensas. Verduras de hoja verde como espinacas y acelgas, que aportan         " +
                                                  "\n vitamina A y K en un 50% de la ingesta diaria recomendada. Ajo y cebolla, que contienen compuestos sulfurados con propiedades   " +
                                                  "\n antimicrobianas, contribuyendo con hasta un 40% de la ingesta diaria recomendada de estos nutrientes. este es solo un           " +
                                                  "\n diagnóstico predeterminado lógico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que         " +
                                                  "\n las respuestas sean completamente correctas. se recomienda realizar más de un diagnóstico para mayor seguridad en el            " +
                                                  "\n tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar   " +
                                                  "\n a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la meningitis bacteriana es fundamental mantener una hidratación adecuada con un        " +
                                                  "\n consumo diario recomendado de 2.5 litros de agua aproximadamente 10 vasos de tamaño regular para apoyar la función renal    " +
                                                  "\n y compensar la pérdida de líquidos por fiebre y sudoración. EJERCICIO: Se recomienda reposo absoluto durante la fase        " +
                                                  "\n aguda de la enfermedad. Una vez superada esta etapa, se pueden incorporar ejercicios de movilidad pasiva y respiración      " +
                                                  "\n profunda para prevenir complicaciones por inmovilidad y mejorar la oxigenación cerebral. POSIBLE TRATAMIENTO: El            " +
                                                  "\n tratamiento incluye antibióticos intravenosos de amplio espectro como ceftriaxona o cefotaxima, ajustados según el          " +
                                                  "\n microorganismo identificado. En casos de sospecha de Listeria monocytogenes, se añade ampicilina con gentamicina.           " +
                                                  "\n También se pueden administrar corticosteroides como la dexametasona para reducir la inflamación cerebral. Es fundamental    " +
                                                  "\n iniciar el tratamiento lo antes posible y mantener vigilancia médica constante. ALIMENTOS RECOMENDADOS: Para apoyar la      " +
                                                  "\n recuperación neurológica y fortalecer el sistema inmunológico se recomienda el consumo de HÍGADO DE RES: Rico en hierro     " +
                                                  "\n y vitamina A que ayuda a combatir la anemia y fortalecer la inmunidad aportando más del 100% de la ingesta diaria           " +
                                                  "\n recomendada por cada 100 gramos. FRUTAS CÍTRICAS: Como naranja y toronja ricas en vitamina C que favorece la absorción      " +
                                                  "\n de hierro y combate infecciones aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos.      " +
                                                  "\n ESPINACAS Y BRÓCOLI: Aportan antioxidantes y vitamina A esenciales para la regeneración celular con un contenido de         " +
                                                  "\n aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probióticos que        " +
                                                  "\n fortalecen el sistema inmunológico y mejoran la salud digestiva aportando calcio y proteínas esenciales. Este es solo       " +
                                                  "\n un diagnóstico predeterminado lógico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que   " +
                                                  "\n las respuestas sean completamente correctas para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer  " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente además por su salud si la respuesta del Diagnóstico no le satisface " +
                                                  "\n del todo se le recomienda mucho consultar a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN: Para el tratamiento del cáncer es fundamental mantener una hidratación adecuada con un consumo diario        " +
                                                  "\n recomendado de 2.5 litros de agua aproximadamente 10 vasos de tamaño regular para apoyar la función renal y hepática      " +
                                                  "\n durante la quimioterapia o radioterapia y prevenir la deshidratación. EJERCICIO: Se recomienda actividad física adaptada  " +
                                                  "\n como caminatas suaves ejercicios de estiramiento o fisioterapia oncológica para mantener la movilidad reducir la fatiga   " +
                                                  "\n y mejorar el estado de ánimo. En pacientes con debilidad se sugiere iniciar con ejercicios pasivos o asistidos. POSIBLE   " +
                                                  "\n TRATAMIENTO: El tratamiento depende del tipo y estadio del cáncer. En mujeres mayores de 75 años se prioriza un enfoque   " +
                                                  "\n individualizado que puede incluir cirugía, quimioterapia, radioterapia u hormonoterapia según la tolerancia y             " +
                                                  "\n comorbilidades. En cánceres hormonodependientes como el de mama se puede optar por hormonoterapia como tamoxifeno o       " +
                                                  "\n inhibidores de aromatasa. En casos avanzados se puede considerar tratamiento paliativo para mejorar la calidad de vida.   " +
                                                  "\n ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunológico y apoyar la recuperación se recomienda el consumo de      " +
                                                  "\n FRUTAS CÍTRICAS: Como naranja toronja y guayaba ricas en vitamina C que aportan aproximadamente el 89% de la ingesta      " +
                                                  "\n diaria recomendada por cada 100 gramos. HÍGADO DE RES: Fuente de hierro y vitamina A que ayuda a combatir la anemia y     " +
                                                  "\n fortalecer la inmunidad aportando más del 100% de la ingesta diaria recomendada por cada 100 gramos. ESPINACAS Y          " +
                                                  "\n BRÓCOLI: Ricos en antioxidantes hierro y vitamina A esenciales para la regeneración celular con un contenido de     " +
                                                  "\n aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probióticos    " +
                                                  "\n que fortalecen el sistema inmunológico y mejoran la salud digestiva aportando calcio y proteínas esenciales. Este   " +
                                                  "\n es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza al 100% que el paciente tenga esta     " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer más de un Diagnóstico   " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente además por su salud si la      " +
                                                  "\n respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico Angel L Montes      " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.30-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe). " +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la influenza es fundamental mantener una hidratación adecuada con un consumo diario      " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a fluidificar las           " +
                                                  "\n secreciones respiratorias y prevenir la deshidratación causada por la fiebre. EJERCICIO: Se recomienda actividad física      " + 
                                                  "\n ligera como caminatas suaves dentro del hogar estiramientos o ejercicios de movilidad evitando esfuerzos intensos mientras   " +
                                                  "\n persistan los síntomas. Una vez superada la fase aguda es recomendable realizar ejercicios de respiración profunda para      " +
                                                  "\n mejorar la oxigenación y prevenir la pérdida de masa muscular. POSIBLE TRATAMIENTO: El tratamiento suele incluir             " +
                                                  "\n medicamentos para reducir la fiebre y aliviar los síntomas como el paracetamol o el ibuprofeno y en casos más severos los    " +
                                                  "\n médicos pueden recetar antivirales específicos como el oseltamivir. Es importante seguir las indicaciones médicas y evitar   " +
                                                  "\n el uso de aspirina ya que puede generar complicaciones. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunológico y    " +
                                                  "\n acelerar la recuperación se recomienda el consumo de NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la         " +
                                                  "\n duración de los síntomas aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE:    " +  
                                                  "\n Contiene compuestos con propiedades antiinflamatorias y puede aliviar la congestión. MIEL Y LIMÓN: Combinación efectiva      " +
                                                  "\n para calmar la garganta y reducir la tos aportando flavonoides y vitamina C. ESPINACAS Y BRÓCOLI: Aportan antioxidantes      " +
                                                  "\n y vitamina A esenciales para la regeneración celular con un contenido de aproximadamente el 56% de la ingesta diaria         " +
                                                  "\n recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probióticos que pueden fortalecer el sistema inmunológico y mejorar " +
                                                  "\n la salud digestiva aportando calcio y proteínas esenciales. Este es solo un diagnóstico predeterminado lógico haberlo        " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas     " +
                                                  "\n para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado    " +
                                                  "\n de su paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar " +
                                                  "\n a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la neumonía es fundamental mantener una hidratación adecuada con un consumo diario         " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a fluidificar las             " +
                                                  "\n secreciones pulmonares y facilitar su expulsión. EJERCICIO: Se recomienda actividad física ligera como caminatas lentas        " +
                                                  "\n dentro del hogar ejercicios de respiración profunda y estiramientos suaves evitando esfuerzos intensos mientras persistan      " +
                                                  "\n los síntomas. Una vez superada la fase aguda es recomendable realizar fisioterapia respiratoria y ejercicios de expansión      " +
                                                  "\n pulmonar para mejorar la capacidad pulmonar y reducir la sensación de fatiga. POSIBLE TRATAMIENTO: El tratamiento suele        " +
                                                  "\n incluir antibióticos como la amoxicilina la azitromicina o la ceftriaxona y en casos más severos antivirales como el           " +
                                                  "\n oseltamivir además de medicamentos para reducir la fiebre como el paracetamol o el ibuprofeno. Es importante seguir las        " +
                                                  "\n indicaciones médicas y evitar la automedicación. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunológico y acelerar    " +
                                                  "\n la recuperación se recomienda el consumo de NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la duración de los    " +
                                                  "\n síntomas aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos  " +
                                                  "\n con propiedades antiinflamatorias y puede aliviar la congestión. ESPINACAS Y BRÓCOLI: Aportan antioxidantes y vitamina A       " +
                                                  "\n esenciales para la regeneración celular con un contenido de aproximadamente el 56% de la ingesta diaria recomendada por cada   " +
                                                  "\n 100 gramos. YOGUR NATURAL: Contiene probióticos que pueden fortalecer el sistema inmunológico y mejorar la salud digestiva     " +
                                                  "\n aportando calcio y proteínas esenciales. Este es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza al  " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer    " +
                                                  "\n más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente además por su salud " +
                                                  "\n si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico Angel L Montes agradece  " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la diabetes es fundamental mantener una hidratación adecuada con un consumo diario       " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a la regulación de la       " +
                                                  "\n glucosa en sangre y prevenir la deshidratación. EJERCICIO: Se recomienda actividad física regular como caminatas suaves      " +
                                                  "\n ejercicios de bajo impacto o natación para mejorar la sensibilidad a la insulina y controlar los niveles de glucosa en       " + 
                                                  "\n sangre. Además se recomienda la práctica de ejercicios aeróbicos como bicicleta estática o baile al menos 150 minutos        " +
                                                  "\n por semana para mejorar la función cardiovascular y reducir el riesgo de complicaciones. POSIBLE TRATAMIENTO: El             " +
                                                  "\n tratamiento suele incluir medicamentos como la metformina para mejorar la sensibilidad a la insulina y en casos más          " +
                                                  "\n severos insulina de acción rápida o prolongada además de medicamentos para controlar la presión arterial y el colesterol.    " +
                                                  "\n Es importante seguir las indicaciones médicas y mantener un monitoreo constante de los niveles de glucosa. ALIMENTOS         " +
                                                  "\n RECOMENDADOS: Para fortalecer el metabolismo y mejorar el control de la glucosa se recomienda el consumo de FRUTOS ROJOS:    " +
                                                  "\n Ricos en antioxidantes y fibra que ayudan a regular la glucosa en sangre aportando aproximadamente el 32% de la ingesta      " +
                                                  "\n diaria recomendada por cada 100 gramos. FRUTOS SECOS: Contienen grasas saludables y fibra que pueden mejorar la sensibilidad " +
                                                  "\n a la insulina aportando aproximadamente el 25% de la ingesta diaria recomendada por cada 100 gramos. ESPINACAS Y BRÓCOLI:    " +
                                                  "\n Aportan antioxidantes y vitamina A esenciales para la regeneración celular con un contenido de aproximadamente el 56% de     " +
                                                  "\n la ingesta diaria recomendada por cada 100 gramos. AVENA: Rica en fibra soluble que ayuda a estabilizar los niveles de       " +
                                                  "\n glucosa en sangre aportando aproximadamente el 40% de la ingesta diaria recomendada por cada 100 gramos. Este es solo        " +
                                                  "\n un diagnóstico predeterminado lógico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni        " +
                                                  "\n que las respuestas sean completamente correctas para ello se recomienda hacer más de un Diagnóstico de Mi Vida para          " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente además por su salud si la respuesta del Diagnóstico     " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su médico Angel L Montes agradece tu visita a la app (Mi Vida)   " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 litros de agua al día para mantener las vías respiratorias hidratadas,     " +
                                                  "\n facilitar la eliminación de secreciones y reducir la inflamación bronquial. En mujeres mayores, una hidratación         " +
                                                  "\n constante también ayuda a prevenir la sequedad de mucosas y mejora la función pulmonar general. EJERCICIO: Actividad    " +
                                                  "\n física moderada y adaptada como caminatas suaves, ejercicios de respiración diafragmática y estiramientos torácicos     " +
                                                  "\n puede mejorar la capacidad pulmonar, reducir la disnea y fortalecer los músculos respiratorios. También se recomienda   " +
                                                  "\n realizar ejercicios con espirómetro incentivador para mantener la expansión pulmonar y prevenir complicaciones como     " +
                                                  "\n atelectasias. POSIBLE TRATAMIENTO: El tratamiento incluye broncodilatadores de acción rápida como Salbutamol,           " +
                                                  "\n corticosteroides inhalados como Fluticasona o Budesonida, y en algunos casos, modificadores de leucotrienos como        " +
                                                  "\n Montelukast. En mujeres mayores, es esencial revisar la técnica de inhalación, ajustar las dosis para evitar efectos    " +
                                                  "\n secundarios como temblores o taquicardia, y considerar el uso de espaciadores para mejorar la administración del        " +
                                                  "\n medicamento. ALIMENTACIÓN: Se sugiere el consumo de alimentos antiinflamatorios y antioxidantes como: pescados grasos   " +
                                                  "\n (ricos en Omega-3), frutas cítricas (con vitamina C), espinacas (con vitamina A y magnesio), jengibre y cúrcuma, con    " +
                                                  "\n propiedades naturales que ayudan a reducir la inflamación de las vías respiratorias. Este es solo un diagnóstico        " +
                                                  "\n predeterminado lógico. Para mayor seguridad, se recomienda realizar más de un Diagnóstico de Mi Vida y consultar a su   " +
                                                  "\n médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 a 3 litros de agua al día para apoyar la función renal, facilitar la         " +
                                                  "\n eliminación de toxinas y mantener el equilibrio electrolítico, especialmente importante en pacientes polimedicados.       " +
                                                  "\n También se sugiere incluir infusiones antioxidantes como té verde o rooibos. EJERCICIO: Actividad física moderada         " +
                                                  "\n como caminatas, yoga suave o ejercicios de bajo impacto puede mejorar la masa muscular, reducir el estrés y fortalecer    " +
                                                  "\n el sistema inmunológico. También se recomienda la práctica de ejercicios de equilibrio y coordinación para prevenir       " +
                                                  "\n caídas. POSIBLE TRATAMIENTO: El tratamiento estándar es la terapia antirretroviral (TAR), que combina medicamentos como   " +
                                                  "\n Tenofovir, Emtricitabina, Efavirenz, Dolutegravir y Lamivudina. En mujeres mayores, es crucial monitorear la función      " +
                                                  "\n hepática y renal, así como posibles interacciones con otros medicamentos. También se recomienda el seguimiento de la      " +
                                                  "\n densidad ósea, ya que algunos antirretrovirales pueden afectar el metabolismo del calcio. El acompañamiento psicológico   " +
                                                  "\n y el control nutricional son fundamentales para mantener la adherencia terapéutica y la calidad de vida. ALIMENTACIÓN:    " +
                                                  "\n Se recomienda una dieta rica en vitamina C, E, A, hierro, zinc, Omega-3 y proteínas vegetales, presentes en frutas        " +
                                                  "\n cítricas, aguacate, pescados grasos, verduras de hoja verde, legumbres y frutos secos. Este es solo un diagnóstico        " +
                                                  "\n predeterminado lógico. Para mayor seguridad, se recomienda realizar más de un Diagnóstico de Mi Vida y consultar a su     " +
                                                  "\n médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 litros de agua al día para facilitar la eliminación de toxinas, mantener     " +
                                                  "\n la función renal y apoyar el tratamiento antibiótico. También se sugiere el consumo de jugos naturales sin azúcar y       " +
                                                  "\n caldos suaves. EJERCICIO: Actividad física ligera como caminatas, ejercicios de movilidad articular y estiramientos       " +
                                                  "\n suaves puede ayudar a mejorar la circulación y fortalecer el sistema inmune. Se debe evitar el ejercicio intenso durante  " +
                                                  "\n el tratamiento para no comprometer la recuperación. POSIBLE TRATAMIENTO: El tratamiento incluye antibióticos como         " +
                                                  "\n Ceftriaxona (inyección única) y Azitromicina (dosis oral). En mujeres mayores, es importante vigilar posibles efectos     " +
                                                  "\n secundarios gastrointestinales y ajustar la dosis en caso de insuficiencia renal. También se recomienda realizar pruebas  " +
                                                  "\n de seguimiento para confirmar la erradicación de la bacteria y evitar reinfecciones. En casos resistentes, puede ser      " +
                                                  "\n necesario el uso de combinaciones antibióticas o tratamientos prolongados. ALIMENTACIÓN: Se recomienda una dieta que      " +
                                                  "\n apoye la función inmunológica y la recuperación, incluyendo: naranjas (vitamina C), espinacas (hierro y ácido fólico),    " +
                                                  "\n yogur natural (probióticos y calcio), ajo (antibacteriano natural) y zanahorias (vitamina A). Este es solo un diagnóstico " +
                                                  "\n predeterminado lógico. Para mayor seguridad, se recomienda realizar más de un Diagnóstico de Mi Vida y consultar a su     " +
                                                  "\n médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una        " +
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO.        " +
                                                  "\n Se recomienda actividad física ligera como caminatas suaves de 15 a 20 minutos al día, ejercicios de estiramiento y          " +
                                                  "\n respiración profunda para reducir el estrés, mejorar la circulación y fortalecer el sistema inmunológico, ya que el          " +
                                                  "\n estrés puede desencadenar brotes. También es útil practicar yoga suave o meditación para mantener el equilibrio emocional.   " +
                                                  "\n HIDRATACIÓN. Se aconseja consumir entre 2 y 2.5 litros de agua al día para mantener la piel y las mucosas hidratadas, lo     " +
                                                  "\n cual ayuda a reducir la irritación y prevenir brotes. Además, se recomienda evitar bebidas con cafeína o alcohol, ya que     " +
                                                  "\n pueden favorecer la deshidratación. Infusiones suaves como manzanilla o té verde pueden ser beneficiosas por sus             " +
                                                  "\n propiedades antiinflamatorias y antioxidantes. POSIBLE TRATAMIENTO. El tratamiento incluye antivirales como aciclovir,       " +
                                                  "\n famciclovir y valaciclovir, que ayudan a reducir la duración y frecuencia de los brotes. Marcas reconocidas incluyen         " +
                                                  "\n Zovirax y Valtrex. En casos de recurrencias frecuentes, se puede considerar terapia supresiva diaria. También se             " +
                                                  "\n recomienda el uso de cremas tópicas con lidocaína o aloe vera para aliviar el malestar local. ALIMENTACIÓN RECOMENDADA.      " +
                                                  "\n Se recomienda una dieta rica en lisina y antioxidantes para fortalecer el sistema inmunológico. Algunos alimentos clave      " +
                                                  "\n incluyen yogur natural y leche, ricos en lisina, que inhibe la replicación del virus. Frutas cítricas como naranja y kiwi,   " +
                                                  "\n ricas en vitamina C, que fortalecen el sistema inmune, aportando aproximadamente el 89% del requerimiento diario por cada    " +
                                                  "\n 100 gramos. Verduras como espinaca y zanahoria, ricas en vitamina A, que contribuyen a la regeneración celular y fortalecen  " +
                                                  "\n las mucosas, con un aporte del 15% del requerimiento diario por cada 100 gramos. Este diagnóstico es una referencia lógica   " +
                                                  "\n basada en información médica, pero no garantiza al 100% que el paciente tenga herpes genital ni que el tratamiento sea el    " +
                                                  "\n adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes          " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una     " +
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO.     " +
                                                  "\n Se recomienda actividad física moderada como caminatas diarias de 20 a 30 minutos, ejercicios de movilidad articular y    " +
                                                  "\n estiramientos suaves para mejorar la circulación, mantener la masa muscular y fortalecer el sistema inmunológico.         " +
                                                  "\n También es beneficioso incluir ejercicios de equilibrio y coordinación para prevenir caídas. HIDRATACIÓN. Se aconseja     " +
                                                  "\n consumir entre 2 y 2.5 litros de agua al día para ayudar a eliminar toxinas del cuerpo, mantener la función renal y       " +
                                                  "\n apoyar el metabolismo durante el tratamiento antibiótico. También se recomienda el consumo de caldos naturales y jugos    " +
                                                  "\n de frutas sin azúcar añadida para mantener el equilibrio de electrolitos. POSIBLE TRATAMIENTO. El tratamiento estándar    " +
                                                  "\n incluye antibióticos como penicilina G benzatina, doxiciclina o ceftriaxona. Marcas reconocidas incluyen Benzetacil y     " +
                                                  "\n Doxiciclina. En pacientes alérgicos a la penicilina, se utilizan alternativas como la doxiciclina por vía oral durante    " +
                                                  "\n 14 días. Es fundamental completar el tratamiento para evitar complicaciones como neurosífilis o daño cardiovascular.      " +
                                                  "\n ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica en proteínas, vitaminas y minerales para fortalecer el sistema     " +
                                                  "\n inmunológico. Algunos alimentos clave incluyen carnes magras y pescado, fuentes de proteínas esenciales. Frutas cítricas  " +
                                                  "\n como naranja y limón, ricas en vitamina C, que ayudan a la recuperación y fortalecimiento del sistema inmune, aportando   " +
                                                  "\n el 89% del requerimiento diario por cada 100 gramos. Verduras de hoja verde como espinaca y brócoli, que contienen hierro " +
                                                  "\n y antioxidantes esenciales para la producción de glóbulos rojos, con un aporte del 15% del requerimiento diario por cada  " +
                                                  "\n 100 gramos. Ajo y cebolla, con compuestos antimicrobianos naturales que pueden apoyar el tratamiento. Este diagnóstico    " +
                                                  "\n es una referencia lógica basada en información médica, pero no garantiza al 100% que el paciente tenga sífilis ni que el  " +
                                                  "\n tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico para mayor seguridad.   " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Para una mujer en etapa de ancianidad con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una    " +
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO.    " +
                                                  "\n Se recomienda actividad física moderada como caminatas suaves, ejercicios de respiración profunda y yoga terapéutico     " +
                                                  "\n para fortalecer los pulmones, mejorar la oxigenación y reducir la fatiga. También es útil realizar ejercicios de         " +
                                                  "\n movilidad articular y estiramientos para mantener la flexibilidad y prevenir la pérdida de masa muscular. HIDRATACIÓN.   " +
                                                  "\n Se aconseja consumir entre 2.5 y 3 litros de agua al día para mantener las vías respiratorias hidratadas, facilitar la   " +
                                                  "\n eliminación de toxinas y apoyar la función renal durante el tratamiento. También se recomienda el consumo de caldos      " +
                                                  "\n ricos en minerales y jugos naturales con alto contenido de vitamina C. POSIBLE TRATAMIENTO. El tratamiento estándar      " +
                                                  "\n incluye una combinación de antibióticos como isoniazida, rifampicina, etambutol y pirazinamida durante un período de     " +
                                                  "\n al menos seis meses. Marcas reconocidas incluyen Rifater y Rimactane. Es fundamental seguir el tratamiento completo y     " +
                                                  "\n bajo supervisión médica para evitar recaídas o resistencia bacteriana. En adultos mayores, se debe ajustar la dosis en    " +
                                                  "\n caso de insuficiencia renal o hepática y monitorear posibles efectos secundarios. ALIMENTACIÓN RECOMENDADA. Se recomienda " +
                                                  "\n una dieta rica en proteínas, vitaminas y minerales para fortalecer el sistema inmunológico y apoyar la recuperación.      " +
                                                  "\n Algunos alimentos clave incluyen carnes magras y pescado, fuentes de proteínas esenciales. Frutas cítricas como naranja   " +
                                                  "\n y kiwi, ricas en vitamina C, que ayudan a la recuperación y fortalecimiento del sistema inmune, aportando el 89% del      " +
                                                  "\n requerimiento diario por cada 100 gramos. Verduras de hoja verde como espinaca y brócoli, que contienen hierro y          " +  
                                                  "\n antioxidantes esenciales para la producción de glóbulos rojos, con un aporte del 15% del requerimiento diario por cada    " +
                                                  "\n 100 gramos. Frutos secos como almendras y nueces, ricos en vitamina E y ácidos grasos esenciales, que fortalecen el       " +
                                                  "\n sistema inmunológico y aportan el 37% del requerimiento diario por cada 28 gramos. Este diagnóstico es una referencia     " +
                                                  "\n lógica basada en información médica, pero no garantiza al 100% que el paciente tenga tuberculosis ni que el tratamiento    " +
                                                  "\n sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n La artritis es una inflamación crónica de las articulaciones que puede provocar dolor, rigidez y pérdida de movilidad,     " +
                                                  "\n siendo la osteoartritis la forma más común en la ancianidad, especialmente en rodillas, caderas y manos. EJERCICIO. Se     " +
                                                  "\n recomienda actividad física moderada y adaptada a las capacidades de la persona, como caminatas suaves, ejercicios         " +
                                                  "\n acuáticos o yoga terapéutico, que ayudan a mantener la flexibilidad, reducir la rigidez y fortalecer los músculos que      " +
                                                  "\n rodean las articulaciones. También es útil realizar ejercicios de bajo impacto con apoyo, como bicicleta estática o        " +
                                                  "\n estiramientos guiados. HIDRATACIÓN. Es fundamental consumir entre 2 y 2.5 litros de agua al día para mantener la           " +
                                                  "\n lubricación de las articulaciones, facilitar la eliminación de toxinas y reducir la inflamación. Se sugiere complementar   " +
                                                  "\n con infusiones de cúrcuma o jengibre, que poseen propiedades antiinflamatorias naturales. POSIBLE TRATAMIENTO. El          " +
                                                  "\n tratamiento puede incluir medicamentos antiinflamatorios no esteroides como ibuprofeno o naproxeno, corticosteroides en    " +
                                                  "\n casos más severos, y fármacos modificadores de la enfermedad como el metotrexato. También se recomienda fisioterapia,      " +
                                                  "\n terapia ocupacional y en algunos casos el uso de suplementos como glucosamina y condroitina para mejorar la salud          " +
                                                  "\n articular. ALIMENTACIÓN RECOMENDADA. Consumir alimentos ricos en antioxidantes y ácidos grasos esenciales. Pescados grasos " +
                                                  "\n como salmón y sardina, ricos en ácidos grasos Omega-3, que ayudan a reducir la inflamación articular, aportando hasta el      " +
                                                  "\n 90% del requerimiento diario por cada 100 g. Frutas como arándanos y fresas, ricas en vitamina C y antioxidantes, que         " +
                                                  "\n fortalecen el sistema inmunológico y reducen el daño celular, aportando cerca del 70% del requerimiento diario por cada       " +
                                                  "\n 100 g. Verduras de hoja verde como espinaca y kale, que contienen hierro, calcio y vitamina K, esenciales para la salud       " + 
                                                  "\n ósea y articular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente  " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un   " +
                                                  "\n diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la   " +
                                                  "\n respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Ángel L Montes agradece tu   " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n La tosferina, o pertussis, es una infección bacteriana que afecta las vías respiratorias y puede causar tos intensa       " +
                                                  "\n y prolongada. En la ancianidad, puede ser más severa y provocar complicaciones respiratorias como neumonía o              " +
                                                  "\n insuficiencia respiratoria. EJERCICIO. Se recomienda actividad física ligera, como caminatas cortas o ejercicios de       " +
                                                  "\n respiración profunda, para mejorar la oxigenación sin agotar al paciente. Es importante evitar ambientes fríos o          " +
                                                  "\n contaminados que puedan agravar los síntomas. HIDRATACIÓN. Es fundamental consumir entre 2 y 2.5 litros de agua al        " +
                                                  "\n día para mantener las vías respiratorias hidratadas y facilitar la eliminación de mucosidad. También se recomienda el     " +
                                                  "\n consumo de líquidos tibios como infusiones de jengibre o té de manzanilla para aliviar la garganta. POSIBLE TRATAMIENTO.  " +
                                                  "\n El tratamiento incluye antibióticos como azitromicina, claritromicina o eritromicina, que ayudan a eliminar la bacteria.  " +
                                                  "\n En casos con dificultad respiratoria, pueden utilizarse broncodilatadores. Se recomienda reposo y aislamiento durante     " +
                                                  "\n los primeros días para evitar contagios. ALIMENTACIÓN RECOMENDADA. Consumir alimentos que fortalezcan el sistema          " +
                                                  "\n respiratorio. Frutas cítricas como naranja y toronja, ricas en vitamina C, que ayudan a reducir la duración de los        " +
                                                  "\n síntomas, aportando hasta el 89% del requerimiento diario por cada 100 g. Miel, con propiedades antimicrobianas y         " +
                                                  "\n calmantes para la garganta. Jengibre, con efectos antiinflamatorios que pueden aliviar la tos. Yogur natural, fuente de   " +
                                                  "\n probióticos que fortalecen la flora intestinal y el sistema inmune. Este es solo un diagnóstico predeterminado lógico,    " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas" +
                                                  "\n estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el     " +
                                                  "\n tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le   " +
                                                  "\n recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Las paperas son una infección viral que afecta las glándulas salivales, causando inflamación y dolor en la zona de la       " +
                                                  "\n mandíbula. En la ancianidad, pueden presentarse síntomas más intensos y riesgo de complicaciones como meningitis o          " +
                                                  "\n pancreatitis. EJERCICIO. Se recomienda actividad física ligera mientras persistan los síntomas, como estiramientos          " +
                                                  "\n suaves o caminatas cortas, evitando esfuerzos que puedan aumentar la inflamación. HIDRATACIÓN. Es fundamental consumir      " +
                                                  "\n entre 2 y 2.5 litros de agua al día para ayudar al cuerpo a combatir la infección y mantenerse hidratado. Se sugiere        " +
                                                  "\n complementar con líquidos suaves como caldos o infusiones de manzanilla. POSIBLE TRATAMIENTO. No existe un tratamiento      " +
                                                  "\n antiviral específico para las paperas. Se recomienda el uso de paracetamol para aliviar la fiebre y el dolor, evitando      " +
                                                  "\n el ibuprofeno y la aspirina. También se sugiere el uso de compresas frías en la zona inflamada y reposo absoluto durante    " +
                                                  "\n los primeros días. ALIMENTACIÓN RECOMENDADA. Consumir alimentos blandos y ricos en nutrientes. Frutas cítricas como         " + 
                                                  "\n naranja y mandarina, ricas en vitamina C, que fortalecen el sistema inmunológico, aportando hasta el 89% del requerimiento  " +
                                                  "\n diario por cada 100 g. Yogur natural, fuente de probióticos que ayudan a mantener la flora intestinal. Verduras de hoja     " +
                                                  "\n verde como espinaca, que aportan hierro y antioxidantes esenciales para la recuperación. Este es solo un diagnóstico        " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la       " +
                                                  "\n enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le        " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida)       " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n EJERCICIO: Durante la infección por el virus del Zika se recomienda reposo absoluto, ya que el cuerpo necesita conservar        " +
                                                  "\n energía para combatir el virus. Una vez que los síntomas disminuyen, se pueden realizar caminatas lentas, estiramientos         " +
                                                  "\n suaves y ejercicios de respiración profunda para mejorar la circulación, reducir la rigidez muscular y favorecer la             " +
                                                  "\n oxigenación celular. HIDRATACIÓN: Es fundamental consumir entre 2.5 y 3 litros de agua al día para prevenir la deshidratación,  " +
                                                  "\n regular la temperatura corporal y facilitar la eliminación de toxinas. También se recomienda el consumo de caldos naturales,    " +
                                                  "\n infusiones como té de jengibre o manzanilla, y jugos naturales sin azúcar añadida, que además de hidratar aportan               " +
                                                  "\n antioxidantes y alivian síntomas como la fiebre y el dolor muscular. POSIBLE TRATAMIENTO: No existe un tratamiento              " +
                                                  "\n antiviral específico para el Zika, pero los síntomas pueden aliviarse con reposo, hidratación constante y medicamentos          " +
                                                  "\n como el acetaminofén para reducir la fiebre y el dolor. Es importante evitar el uso de aspirina y otros antiinflamatorios       " +
                                                  "\n no esteroideos hasta descartar la posibilidad de dengue, para reducir el riesgo de hemorragias. También se recomienda           " +
                                                  "\n evitar el consumo de alcohol y tabaco durante la recuperación, ya que pueden debilitar el sistema inmunológico. ALIMENTACIÓN:   " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico,   " +
                                                  "\n tales como frutas cítricas como naranjas y toronjas, verduras de hoja verde como espinacas y acelgas, y especias como jengibre  " +
                                                  "\n y cúrcuma, que poseen propiedades antiinflamatorias y antioxidantes. este es solo un diagnóstico predeterminado lógico.         " + 
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. " +
                                                  "\n se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud, si la   " +
                                                  "\n respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita  " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n EJERCICIO: Durante la infección por rotavirus se recomienda reposo absoluto, ya que la diarrea, los vómitos y la fiebre     " +
                                                  "\n pueden provocar debilidad extrema. Una vez superada la fase aguda, se pueden realizar ejercicios suaves como caminatas      " +
                                                  "\n lentas, estiramientos y respiración profunda para estimular la circulación, mejorar la oxigenación y recuperar la energía.  " + 
                                                  "\n HIDRATACIÓN: Es crucial consumir entre 2.5 y 3 litros de agua al día para prevenir la deshidratación causada por la         " +
                                                  "\n pérdida de líquidos. También se recomienda el uso de soluciones de rehidratación oral que aporten sodio, potasio y          " +
                                                  "\n glucosa, así como caldos naturales y jugos suaves sin azúcar para reponer electrolitos y mantener el equilibrio hídrico.    " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento antiviral específico para el rotavirus, pero los síntomas pueden aliviarse    " +
                                                  "\n con hidratación intensiva, reposo y una dieta adecuada. Se deben evitar los medicamentos antidiarreicos, ya que pueden      " +
                                                  "\n prolongar la infección. En casos graves, puede ser necesaria la administración de líquidos por vía intravenosa. También     " +
                                                  "\n se recomienda el consumo de probióticos para restaurar la flora intestinal. ALIMENTACIÓN: Se recomienda el consumo de       " +
                                                  "\n alimentos que favorezcan la recuperación del sistema digestivo, tales como yogur natural, frutas como plátanos y manzanas,  " +
                                                  "\n y verduras como zanahorias y calabacines, que contienen antioxidantes y vitaminas esenciales para la regeneración de la     " +
                                                  "\n mucosa intestinal. este es solo un diagnóstico predeterminado lógico. haberlo consultado no garantiza al 100% que la        " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar más de un         " +
                                                  "\n diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico no le    " +
                                                  "\n satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera      " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n EJERCICIO: Durante la infección por listeria se recomienda evitar esfuerzos físicos intensos y priorizar el descanso, ya        " +
                                                  "\n que el cuerpo necesita conservar energía para combatir la bacteria. Una vez que los síntomas disminuyen, se pueden              " +
                                                  "\n realizar ejercicios suaves como caminatas lentas, estiramientos y respiración profunda para mejorar la oxigenación celular,     " +
                                                  "\n reducir la fatiga y prevenir la rigidez muscular. HIDRATACIÓN: Es fundamental consumir entre 2.5 y 3 litros de agua al día      " +
                                                  "\n para ayudar a eliminar toxinas, mantener el equilibrio de los fluidos corporales y apoyar la función renal durante el           " +
                                                  "\n tratamiento antibiótico. También se recomienda el consumo de caldos naturales, infusiones suaves y jugos sin azúcar para        " +
                                                  "\n aportar electrolitos esenciales. Una hidratación adecuada contribuye a la eliminación de bacterias a través de la orina y       " +
                                                  "\n mejora la tolerancia al tratamiento. POSIBLE TRATAMIENTO: La infección por listeria se trata con antibióticos como ampicilina   " +
                                                  "\n o gentamicina, especialmente en casos graves o en pacientes inmunocomprometidos. En personas mayores, el tratamiento debe       " +
                                                  "\n iniciarse lo antes posible para evitar complicaciones como septicemia o meningitis. También se recomienda evitar alimentos      " +
                                                  "\n de alto riesgo como productos lácteos no pasteurizados, embutidos y pescados ahumados durante la recuperación. ALIMENTACIÓN:    " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico,   " +
                                                  "\n tales como frutas cítricas, verduras de hoja verde como espinacas y acelgas, y frutos secos como almendras y nueces, que        " +
                                                  "\n contienen vitamina E y magnesio. este es solo un diagnóstico predeterminado lógico. haberlo consultado no garantiza al 100%     " +
                                                  "\n que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar más de un      " +
                                                  "\n diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico no le        " +
                                                  "\n satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que      " +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la shigelosis es fundamental mantener una hidratación adecuada con un consumo diario    " +
                                                  "\n recomendado de 2.5 litros de agua aproximadamente 10 vasos de tamaño regular para reponer los líquidos perdidos por la      " +
                                                  "\n diarrea y prevenir la deshidratación severa. EJERCICIO: Se recomienda reposo absoluto durante la fase aguda. Una vez        " +
                                                  "\n superada, se pueden incorporar caminatas suaves dentro del hogar y ejercicios de movilidad articular para recuperar         " +
                                                  "\n energía y mejorar la función digestiva sin comprometer el equilibrio del organismo. POSIBLE TRATAMIENTO: El tratamiento     " +
                                                  "\n puede incluir antibióticos como ciprofloxacina, azitromicina o ceftriaxona en casos más severos. En adultos mayores, el     " +
                                                  "\n uso de antibióticos debe ser cuidadosamente evaluado por el médico debido al riesgo de resistencia bacteriana y posibles    " +
                                                  "\n interacciones con otros medicamentos. ALIMENTOS RECOMENDADOS: Para estabilizar el sistema digestivo se recomienda el        " +
                                                  "\n consumo de PLÁTANOS: Ricos en potasio que ayudan a reemplazar los electrolitos perdidos aportando aproximadamente el 12%    " +
                                                  "\n de la ingesta diaria recomendada por cada 100 gramos. ARROZ BLANCO: Fuente de carbohidratos de fácil digestión que ayuda    " +
                                                  "\n a estabilizar el sistema digestivo. ZANAHORIAS: Ricas en vitamina A y antioxidantes que ayudan a la regeneración celular    " +
                                                  "\n aportando aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probióticos  " +
                                                  "\n que fortalecen el sistema digestivo y mejoran la salud intestinal aportando calcio y proteínas esenciales. Este es solo un  " +
                                                  "\n diagnóstico predeterminado lógico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las  " +
                                                  "\n respuestas sean completamente correctas para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor" +
                                                  "\n seguridad en el tratamiento adecuado de su paciente además por su salud si la respuesta del Diagnóstico no le satisface del " +
                                                  "\n todo se le recomienda mucho consultar a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la EPOC es fundamental mantener una hidratación adecuada con un consumo diario        " +
                                                  "\n recomendado de 2.5 litros de agua aproximadamente 10 vasos de tamaño regular para mantener las vías respiratorias         " +
                                                  "\n hidratadas y facilitar la expulsión de mucosidad. EJERCICIO: Se recomienda actividad física ligera como caminatas         " +
                                                  "\n lentas ejercicios de respiración profunda y estiramientos suaves para mejorar la oxigenación y la capacidad pulmonar.     " +
                                                  "\n También se sugiere fisioterapia respiratoria adaptada a la capacidad funcional del paciente para mantener la movilidad    " +
                                                  "\n y prevenir la pérdida de masa muscular. POSIBLE TRATAMIENTO: El tratamiento puede incluir broncodilatadores de acción     " +
                                                  "\n rápida como el salbutamol corticosteroides inhalados como la fluticasona y en algunos casos terapia con oxígeno. Es       " +
                                                  "\n fundamental seguir estrictamente el plan de acción indicado por el médico y evitar la exposición a contaminantes          " +
                                                  "\n ambientales. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema respiratorio se recomienda el consumo de PESCADOS GRASOS: " +
                                                  "\n Como el salmón y el atún ricos en ácidos grasos Omega-3 con propiedades antiinflamatorias que aportan aproximadamente el  " +
                                                  "\n 50% de la ingesta diaria recomendada por cada 100 gramos. FRUTAS Y VERDURAS DE COLORES VIVOS: Como arándanos fresas       " +
                                                  "\n espinacas y brócoli ricos en antioxidantes como la vitamina C y carotenoides que fortalecen el sistema inmunológico       " +
                                                  "\n aportando aproximadamente el 70% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Con compuestos           " +
                                                  "\n antiinflamatorios que pueden aliviar la inflamación de las vías respiratorias. CÚRCUMA: Con curcumina que posee           " +
                                                  "\n propiedades antioxidantes y antiinflamatorias. Este es solo un diagnóstico predeterminado lógico haberlo consultado       " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para        " +
                                                  "\n ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado      " +
                                                  "\n de su paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho        " +
                                                  "\n consultar a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la clamidia es fundamental mantener una hidratación adecuada con un consumo diario         " +
                                                  "\n recomendado de 2.5 litros de agua aproximadamente 10 vasos de tamaño regular para facilitar la eliminación de toxinas          " +
                                                  "\n y apoyar el sistema inmunológico. EJERCICIO: Se recomienda actividad física ligera como caminatas suaves ejercicios de         " +
                                                  "\n movilidad articular y estiramientos para mejorar la circulación y fortalecer el sistema inmunológico evitando esfuerzos        " +
                                                  "\n intensos durante el tratamiento. POSIBLE TRATAMIENTO: El tratamiento suele incluir antibióticos como la azitromicina en        " +
                                                  "\n dosis única o la doxiciclina durante 7 días y en casos más severos levofloxacina. Es fundamental completar el tratamiento      " +
                                                  "\n y evitar relaciones sexuales hasta que se confirme la curación para prevenir reinfecciones. ALIMENTOS RECOMENDADOS: Para       " +
                                                  "\n fortalecer el sistema inmunológico se recomienda el consumo de FRUTOS ROJOS: Ricos en antioxidantes y vitamina C que ayudan    " +
                                                  "\n a combatir infecciones bacterianas aportando aproximadamente el 70% de la ingesta diaria recomendada por cada 100 gramos.      " +
                                                  "\n JENGIBRE: Con propiedades antiinflamatorias que pueden ayudar a reducir la inflamación. ESPINACAS Y BRÓCOLI: Aportan           " +
                                                  "\n antioxidantes y vitamina A esenciales para la regeneración celular con un contenido de aproximadamente el 56% de la ingesta    " +
                                                  "\n diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probióticos que fortalecen el sistema inmunológico y mejoran   " +
                                                  "\n la salud digestiva aportando calcio y proteínas esenciales. Este es solo un diagnóstico predeterminado lógico haberlo          " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas       " +
                                                  "\n para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado      " +
                                                  "\n de su paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar   " +
                                                  "\n a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 a 3 litros de agua al día para mantener la función cerebral, facilitar la     " +
                                                  "\n eliminación de toxinas y apoyar el sistema inmunológico. En mujeres en etapa de ancianidad, una hidratación constante      " +
                                                  "\n también ayuda a prevenir la deshidratación, que puede agravar los síntomas neurológicos y aumentar el riesgo de            " +
                                                  "\n complicaciones como confusión o delirio. EJERCICIO: Durante la fase aguda se recomienda reposo absoluto. Una vez           " +
                                                  "\n estabilizada, se puede retomar actividad física ligera como caminatas suaves, ejercicios de respiración profunda           " +
                                                  "\n y estiramientos controlados. Estas actividades ayudan a mejorar la circulación cerebral, prevenir el deterioro funcional   " +
                                                  "\n y mantener la autonomía. También se recomienda realizar ejercicios de movilidad con apoyo para evitar caídas. POSIBLE      " +
                                                  "\n TRATAMIENTO: El tratamiento inmediato incluye antibióticos intravenosos de amplio espectro como Ceftriaxona, Cefotaxima    " +
                                                  "\n o Ampicilina, ajustados según el microorganismo identificado. También se administran corticosteroides como la Dexametasona " +
                                                  "\n para reducir la inflamación cerebral y prevenir complicaciones como pérdida auditiva o convulsiones. En casos graves,      " +
                                                  "\n puede requerirse hospitalización prolongada, monitoreo neurológico intensivo y el uso de anticonvulsivos si se presentan   " +
                                                  "\n crisis. Además, se recomienda el seguimiento con evaluaciones cognitivas y apoyo neuropsicológico para detectar posibles   " +
                                                  "\n secuelas. ALIMENTACIÓN: Se recomienda una dieta rica en nutrientes neuroprotectores como: naranjas (ricas en vitamina C,   " +
                                                  "\n fortalecen el sistema inmune, 89% del requerimiento diario por cada 100 g); aguacate (fuente de vitamina E y ácidos grasos    " +
                                                  "\n saludables, 14% de la ingesta diaria por cada 100 g); pescados grasos (salmón, atún), ricos en Omega-3, que ayudan a reducir  " +
                                                  "\n la inflamación cerebral (50% de la ingesta diaria por cada 100 g); huevos (aportan colina, esencial para la función           " +
                                                  "\n cognitiva, 27% del requerimiento diario por unidad); y nueces (ricas en ácido alfa-linolénico, un tipo de Omega-3 vegetal,    " +
                                                  "\n 91% por cada 30 g). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la         " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más      " +
                                                  "\n de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Además, por su salud, si la          " +
                                                  "\n respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita    " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer. " +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 a 3 litros de agua al día para apoyar la función renal, facilitar la       " +
                                                  "\n eliminación de toxinas derivadas del tratamiento y mantener la homeostasis celular. En pacientes con cáncer, una        " +
                                                  "\n hidratación adecuada también ayuda a reducir los efectos secundarios de la quimioterapia como náuseas, fatiga y         " +
                                                  "\n estreñimiento. EJERCICIO: Actividad física moderada y adaptada como caminatas, ejercicios de bajo impacto o yoga        " +
                                                  "\n suave puede mejorar la calidad de vida, reducir la fatiga y fortalecer el sistema inmunológico. Es importante           " +
                                                  "\n realizar una evaluación funcional previa para ajustar la intensidad del ejercicio según el estado físico de la          " +
                                                  "\n paciente. También se recomienda la práctica de ejercicios de respiración y relajación para mejorar la respuesta         " +
                                                  "\n del cuerpo al tratamiento. POSIBLE TRATAMIENTO: El tratamiento depende del tipo y estadio del cáncer, pero puede        " +
                                                  "\n incluir quimioterapia, radioterapia, inmunoterapia, cirugía y terapias dirigidas. En mujeres adultas mayores, se        " +
                                                  "\n realiza una valoración geriátrica integral para personalizar el tratamiento, considerando comorbilidades, estado        " +
                                                  "\n funcional y tolerancia a los fármacos. También se emplean terapias hormonales en ciertos tipos de cáncer como el        " +
                                                  "\n de mama, y se utilizan medicamentos de soporte como antieméticos, analgésicos y suplementos nutricionales para          " +
                                                  "\n mejorar la tolerancia al tratamiento. El acompañamiento psicológico y el seguimiento nutricional son claves para        " +
                                                  "\n mantener la adherencia terapéutica y la estabilidad emocional. ALIMENTACIÓN: Se recomienda una dieta rica en            " +
                                                  "\n antioxidantes, proteínas y grasas saludables como: frutas cítricas (naranjas, toronjas), con vitamina C (89% por        " +
                                                  "\n cada 100 g); aguacate, fuente de vitamina E y ácidos grasos monoinsaturados (14% por cada 100 g); pescados grasos       " +
                                                  "\n (salmón, sardina), ricos en Omega-3 (50% por cada 100 g); verduras de hoja verde (espinacas, acelgas), con vitamina A   " +
                                                  "\n y hierro (56% y 15% respectivamente por cada 100 g); legumbres (lentejas, frijoles), con proteínas vegetales y hierro   " +
                                                  "\n (37% por cada 100 g); y frutos secos (almendras, nueces), con selenio y zinc, que apoyan la función inmune (45% y 30%   " +
                                                  "\n respectivamente por cada 30 g). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al   " +
                                                  "\n 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda " +
                                                  "\n realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Además, por su   " +
                                                  "\n salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                    }
                }
             if (EdadFemenino.equals("Ancianidad = 75 años o mas")) {
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