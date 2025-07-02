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
         private final String edadEsperada = "Adultez = 30 - 59 años";
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
                 if(EdadFemenino.equals("Adultez = 30 - 59 años")){
                        if(EstaturaFemenino.equals("0.80-1.35 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada para fortalecer el sistema inmunológico y mejorar la recuperación.     " +
                                                  "\n Ejercicios como caminatas suaves, yoga y estiramientos pueden ayudar a reducir la fatiga y mejorar la circulación.        " +
                                                  "\n También se recomienda evitar esfuerzos físicos intensos mientras persistan los síntomas. HIDRATACIÓN: Es fundamental      " +
                                                  "\n el consumo de 2.5 a 3 litros de agua, aproximadamente 10 a 12 vasos de tamaño regular, para mantener la hidratación y     " +
                                                  "\n facilitar la eliminación de toxinas. También se recomienda el consumo de líquidos tibios como infusiones de jengibre      " +
                                                  "\n o miel para aliviar la irritación de la garganta y mejorar la expectoración. POSIBLE TRATAMIENTO: La influenza se trata   " +
                                                  "\n con medicamentos antivirales como oseltamivir, zanamivir y baloxavir, que ayudan a reducir la duración y severidad de     " +
                                                  "\n la enfermedad. Algunas marcas reconocidas son Tamiflu (oseltamivir), Relenza (zanamivir) y Xofluza (baloxavir). Además    " +
                                                  "\n del tratamiento antiviral, es importante el uso de analgésicos y antipiréticos como paracetamol para aliviar los          " +
                                                  "\n síntomas. Se recomienda reposo absoluto y una alimentación rica en antioxidantes para fortalecer el sistema inmunológico. " +
                                                  "\n En casos graves, el médico puede indicar hospitalización para monitoreo y administración de medicamentos intravenosos.    " +
                                                  "\n ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema inmunológico y mejorar la recuperación, se recomienda el consumo     " +
                                                  "\n de alimentos ricos en vitaminas y minerales esenciales. FRUTAS CÍTRICAS (naranjas, limones, toronjas): Altas en VITAMINA C," +
                                                  "\n que fortalece el sistema inmune, aportando aproximadamente 89% del requerimiento diario por cada 100 gramos. JENGIBRE:    " +
                                                  "\n Contiene compuestos con efectos antiinflamatorios que pueden ayudar a aliviar la irritación de las vías respiratorias,    " +
                                                  "\n proporcionando 5% del requerimiento diario de antioxidantes por cada 10 gramos. MIEL: Con propiedades antimicrobianas     " +
                                                  "\n y calmantes para la garganta, aportando 20% del requerimiento diario de antioxidantes por cada 30 gramos. Este es solo    " +
                                                  "\n un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que la paciente tenga influenza ni que el   " +
                                                  "\n tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico para mayor seguridad y, por su salud, consultar " +
                                                  "\n a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n EJERCICIO: Se recomienda reposo absoluto durante la fase aguda de la enfermedad para evitar complicaciones respiratorias.   " +
                                                  "\n Una vez superada la etapa crítica, se pueden realizar ejercicios de movilidad y respiración profunda para mejorar la        " +
                                                  "\n capacidad pulmonar y reducir la fatiga. También se recomienda ejercicios de expansión torácica para fortalecer los          " +
                                                  "\n músculos respiratorios y mejorar la oxigenación. HIDRATACIÓN: Es esencial el consumo de 2.5 a 3 litros de agua,             " +
                                                  "\n aproximadamente 10 a 12 vasos de tamaño regular, para mantener las vías respiratorias limpias y mejorar la eliminación      " +
                                                  "\n de secreciones. También se recomienda el consumo de caldos y líquidos tibios para mejorar la absorción de nutrientes        " +
                                                  "\n esenciales. POSIBLE TRATAMIENTO: La neumonía se trata con antibióticos como amoxicilina, azitromicina y ceftriaxona,        " +
                                                  "\n dependiendo del agente causal. Algunas marcas reconocidas son Augmentin (amoxicilina), Zithromax (azitromicina) y Rocephin  " +
                                                  "\n (ceftriaxona). Además del tratamiento antibiótico, se recomienda el uso de antipiréticos para controlar la fiebre y         " + 
                                                  "\n broncodilatadores en casos de dificultad respiratoria severa. En casos graves, el médico puede indicar hospitalización      " +
                                                  "\n para administración de oxígeno y monitoreo constante. ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema inmunológico     " +
                                                  "\n y mejorar la recuperación, se recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales. FRUTAS          " +
                                                  "\n CÍTRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema inmune, aportando aproximadamente     " +
                                                  "\n 89% del requerimiento diario por cada 100 gramos. PESCADOS GRASOS (salmón, atún): Fuente de OMEGA-3, con propiedades        " +
                                                  "\n antiinflamatorias, proporcionando aproximadamente 2.2 gramos por cada 100 gramos de pescado. VEGETALES DE HOJA VERDE        " +
                                                  "\n (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales para la regeneración celular y la función muscular, aportando " +
                                                  "\n cerca del 15% del requerimiento diario por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico. Haberlo   " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga neumonía ni que el tratamiento sea el adecuado. Se recomienda      " +
                                                  "\n realizar más de un diagnóstico para mayor seguridad y, por su salud, consultar a su médico. Angel L Montes agradece      " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n EJERCICIO: Se recomienda actividad física regular para mejorar la sensibilidad a la insulina y controlar los         " +
                                                  "\n niveles de glucosa en sangre. Ejercicios como caminatas, natación y entrenamiento de resistencia pueden ser          " +
                                                  "\n beneficiosos para la regulación metabólica. También se recomienda ejercicios de relajación para reducir el           " +
                                                  "\n estrés y mejorar el bienestar emocional. HIDRATACIÓN: Es esencial el consumo de 2.5 a 3 litros de agua,              " +
                                                  "\n aproximadamente 10 a 12 vasos de tamaño regular, para facilitar la eliminación de toxinas y mejorar la función       " +
                                                  "\n celular. Mantener una hidratación adecuada también contribuye a la absorción de nutrientes esenciales y al           " +
                                                  "\n fortalecimiento del sistema inmunológico. POSIBLE TRATAMIENTO: La diabetes se trata con medicamentos como            " +
                                                  "\n metformina, insulina y sulfonilureas, dependiendo del tipo y gravedad de la enfermedad. Algunas marcas reconocidas   " +
                                                  "\n son Glucophage (metformina), Lantus (insulina) y Amaryl (glimepirida). Además del tratamiento farmacológico,         " +
                                                  "\n se recomienda el seguimiento de un plan de alimentación adecuado y la monitorización constante de los niveles        " +
                                                  "\n de glucosa en sangre. En casos avanzados, el médico puede indicar el uso de bombas de insulina o tratamientos        " +
                                                  "\n combinados para mejorar el control de la enfermedad. ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema            " +
                                                  "\n inmunológico y mejorar la regulación de la glucosa, se recomienda el consumo de alimentos ricos en vitaminas         " +
                                                  "\n y minerales esenciales. FRUTAS CÍTRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el         " +
                                                  "\n sistema inmune, aportando aproximadamente 89% del requerimiento diario por cada 100 gramos. PESCADOS GRASOS          " +
                                                  "\n (salmón, atún): Fuente de OMEGA-3, con propiedades antiinflamatorias, proporcionando aproximadamente 2.2 gramos      " +
                                                  "\n por cada 100 gramos de pescado. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales" +
                                                  "\n para la regeneración celular y la función muscular, aportando cerca del 15% del requerimiento diario por cada      " +
                                                  "\n 100 gramos. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que la      " +
                                                  "\n paciente tenga diabetes ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico para   " +
                                                  "\n mayor seguridad y, por su salud, consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y     " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2 a 2.5 litros de agua al día, ya que una hidratación adecuada ayuda a        " +
                                                  "\n mantener las vías respiratorias húmedas y reducir la inflamación bronquial. También es beneficioso complementar        " +
                                                  "\n con infusiones naturales como té de jengibre o cúrcuma, que poseen propiedades antiinflamatorias y antioxidantes.      " +
                                                  "\n EJERCICIO. La actividad física moderada es clave para fortalecer el sistema respiratorio y mejorar la capacidad        " +
                                                  "\n pulmonar. Se recomienda realizar ejercicio aeróbico moderado al menos 30 minutos al día, como caminar, nadar o         " +
                                                  "\n andar en bicicleta, evitando el sobreesfuerzo. También es beneficioso incluir ejercicios de respiración como yoga      " +
                                                  "\n o técnicas de expansión pulmonar. POSIBLE TRATAMIENTO. El tratamiento estándar incluye broncodilatadores de alivio     " +
                                                  "\n rápido como salbutamol, y corticosteroides inhalados como fluticasona o budesonida, que ayudan a reducir la inflamación" +
                                                  "\n y mejorar la función pulmonar. También se pueden utilizar antagonistas de los receptores de leucotrienos, como         " +
                                                  "\n montelukast, para el control a largo plazo. Marcas reconocidas incluyen Ventolin, Aerolin, Flixotide, Pulmicort        " +
                                                  "\n y Singulair. ALIMENTACIÓN. Para fortalecer el sistema inmunológico y reducir la inflamación, se recomienda consumir    " +
                                                  "\n frutas cítricas como naranja, limón y toronja, que son ricas en vitamina C, la cual contribuye a la producción de      " +
                                                  "\n glóbulos blancos y mejora la respuesta inmune. Verduras de hoja verde como espinaca y acelga, que contienen ácido      " +
                                                  "\n fólico, esencial para la producción de células sanguíneas. Pescados grasos como salmón y sardina, que son ricos en     " +
                                                  "\n Omega-3, el cual tiene propiedades antiinflamatorias. Frutos secos como almendras y nueces, que aportan vitamina E,    " +
                                                  "\n la cual protege las células del daño oxidativo. Legumbres como lentejas y garbanzos, que son fuente de proteínas y     " +
                                                  "\n hierro, esenciales para la energía y la regeneración celular. Este es solo un diagnóstico predeterminado lógico.       " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente " +
                                                  "\n correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico especialista. Angel L Montes" +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2.5 a 3 litros de agua al día, ya que una hidratación adecuada           " +
                                                  "\n ayuda a mantener el equilibrio del sistema inmunológico y mejorar la absorción de los medicamentos                " +
                                                  "\n antirretrovirales. También es beneficioso complementar con infusiones naturales como té verde o manzanilla,       " +
                                                  "\n que poseen propiedades antioxidantes y antiinflamatorias. EJERCICIO. La actividad física moderada es clave        " +
                                                  "\n para fortalecer el sistema inmunológico y mejorar la salud cardiovascular. Se recomienda realizar ejercicio       " +
                                                  "\n aeróbico moderado al menos 30 minutos al día, como caminar, nadar o andar en bicicleta, evitando el               " +
                                                  "\n sobreesfuerzo. También es beneficioso incluir ejercicios de resistencia como levantamiento de pesas ligeras       " +
                                                  "\n o yoga, que ayudan a mantener la masa muscular y reducir el estrés. POSIBLE TRATAMIENTO. El tratamiento           " +
                                                  "\n estándar incluye terapia antirretroviral (TAR) con medicamentos como tenofovir, emtricitabina y dolutegravir,     " +
                                                  "\n que ayudan a controlar la replicación del virus y mejorar la calidad de vida. También pueden utilizarse           " +
                                                  "\n inhibidores de proteasa, como darunavir, en combinación con otros antirretrovirales. Marcas reconocidas           " +
                                                  "\n incluyen Atripla, Truvada, Tivicay, Biktarvy y Prezista. ALIMENTACIÓN. Para fortalecer el sistema inmunológico    " +
                                                  "\n y reducir la inflamación, se recomienda consumir frutas cítricas como naranja, limón y toronja, que son ricas     " +
                                                  "\n en vitamina C, la cual contribuye a la producción de glóbulos blancos y mejora la respuesta inmune. Verduras      " + 
                                                  "\n de hoja verde como espinaca y kale, que contienen ácido fólico y antioxidantes, esenciales para la regeneración   " +
                                                  "\n celular y la protección contra el daño oxidativo. Pescados grasos como salmón y atún, que son ricos en Omega-3,   " +
                                                  "\n el cual tiene propiedades antiinflamatorias. Frutos secos como almendras y nueces, que aportan vitamina E, la     " +
                                                  "\n cual protege las células del daño oxidativo. Legumbres como lentejas y garbanzos, que son fuente de proteínas y   " +
                                                  "\n hierro, esenciales para la energía y la regeneración celular. Este es solo un diagnóstico predeterminado lógico.  " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean          " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico          " +
                                                  "\n especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2 a 2.5 litros de agua al día, ya que una hidratación adecuada ayuda           " +
                                                  "\n a eliminar toxinas y mantener el equilibrio del sistema inmunológico. También es beneficioso complementar con           " +
                                                  "\n infusiones naturales como té verde o manzanilla, que poseen propiedades antibacterianas y antiinflamatorias.            " +
                                                  "\n EJERCICIO. La actividad física moderada es clave para fortalecer el sistema inmunológico y mejorar la circulación       " +
                                                  "\n sanguínea. Se recomienda realizar ejercicio aeróbico moderado al menos 30 minutos al día, como caminar, nadar o         " +
                                                  "\n andar en bicicleta, evitando el sobreesfuerzo. También es beneficioso incluir ejercicios de resistencia como            " +
                                                  "\n levantamiento de pesas ligeras o yoga, que ayudan a mantener la masa muscular y reducir el estrés. POSIBLE TRATAMIENTO. " +
                                                  "\n El tratamiento estándar incluye antibióticos como ceftriaxona y azitromicina, que ayudan a eliminar la bacteria         " +
                                                  "\n Neisseria gonorrhoeae. En casos de resistencia, se pueden utilizar combinaciones de antibióticos como gentamicina       " +
                                                  "\n con azitromicina. Marcas reconocidas incluyen Rocephin, Zithromax y Gentak. ALIMENTACIÓN. Para fortalecer el sistema    " +
                                                  "\n inmunológico y reducir la inflamación, se recomienda consumir frutas cítricas como naranja, limón y toronja, que son    " +
                                                  "\n ricas en vitamina C, la cual contribuye a la producción de glóbulos blancos y mejora la respuesta inmune. Verduras      " +
                                                  "\n crucíferas como brócoli y coliflor, que contienen vitamina K y antioxidantes, esenciales para la regeneración celular.  " +
                                                  "\n Pescados grasos como salmón y sardina, que son ricos en Omega-3, el cual tiene propiedades antiinflamatorias.           " +
                                                  "\n Legumbres como lentejas y garbanzos, que son fuente de proteínas y hierro, esenciales para la energía y la regeneración " +
                                                  "\n celular. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente     " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de   " +
                                                  "\n un diagnóstico y consultar a un médico especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera   " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al día (aproximadamente              " +
                                                  "\n ocho a diez vasos de agua de tamaño regular) para mantener la hidratación celular y ayudar al cuerpo a combatir          " +
                                                  "\n el virus. También se recomienda el consumo de líquidos ricos en antioxidantes como té verde o infusiones de              " +
                                                  "\n manzanilla para mejorar la respuesta inmunológica. EJERCICIO: Se recomienda actividad física moderada, evitando          " +
                                                  "\n el sobreesfuerzo durante los brotes. Ejercicios como yoga, pilates y caminatas suaves pueden ayudar a reducir el         " +
                                                  "\n estrés, que es un factor desencadenante de los brotes de herpes. Además, el ejercicio regular fortalece el sistema       " +
                                                  "\n inmunológico, lo que puede ayudar a reducir la frecuencia de los brotes. Es importante evitar actividades que generen    " +
                                                  "\n fricción o sudoración excesiva en la zona afectada, ya que esto puede agravar los síntomas. POSIBLE TRATAMIENTO: El      " +
                                                  "\n tratamiento para el herpes genital suele incluir antivirales como aciclovir, valaciclovir o famciclovir, que ayudan      " +
                                                  "\n a reducir la duración y severidad de los brotes. Marcas reconocidas incluyen Zovirax y Valtrex. También se recomienda    " +
                                                  "\n el uso de cremas tópicas para aliviar el dolor y la inflamación, así como el fortalecimiento del sistema inmunológico    " +
                                                  "\n mediante una dieta equilibrada y el manejo del estrés. En algunos casos, los médicos pueden recomendar suplementos de    " +
                                                  "\n lisina, un aminoácido que puede ayudar a reducir la replicación del virus. ALIMENTACIÓN RECOMENDADA: Para fortalecer     " +
                                                  "\n el sistema inmunológico y ayudar en la recuperación, se recomienda el consumo de FRUTAS CÍTRICAS como naranja y          " +
                                                  "\n toronja, ricas en VITAMINA C, que fortalece el sistema inmune y aporta cerca del 89% del requerimiento diario por        " +
                                                  "\n cada 100 g. ARÁNDANOS, ricos en ANTIOXIDANTES, que ayudan a reducir la inflamación y aportan aproximadamente el 50%      " +
                                                  "\n del requerimiento diario de VITAMINA C por cada 100 g. AJO, con propiedades ANTIVIRALES, que pueden ayudar a combatir    " +
                                                  "\n el virus y fortalecer el sistema inmunológico. ESPINACA, fuente de HIERRO y VITAMINA E, que ayuda a mejorar la           " +
                                                  "\n regeneración celular y aporta aproximadamente el 15% del requerimiento diario de HIERRO por cada 100 g. Este es solo     " +
                                                  "\n un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad      " +
                                                  "\n ni que las respuestas sean completamente correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad    " +
                                                  "\n en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda" +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al día (aproximadamente         " +
                                                  "\n ocho a diez vasos de agua de tamaño regular) para ayudar al cuerpo a eliminar la bacteria y prevenir la             " +
                                                  "\n deshidratación causada por fiebre y malestar. También se recomienda el consumo de líquidos ricos en electrolitos    " +
                                                  "\n como agua de coco o caldos naturales para mejorar la recuperación. EJERCICIO: Se recomienda reposo moderado         " +
                                                  "\n mientras persistan los síntomas, evitando esfuerzos físicos intensos. Sin embargo, una vez recuperada, se pueden    " +
                                                  "\n realizar ejercicios de bajo impacto como yoga o estiramientos suaves para mejorar la circulación y fortalecer el    " +
                                                  "\n sistema inmunológico. La actividad física regular puede ayudar a mejorar la respuesta del cuerpo al tratamiento     " +
                                                  "\n antibiótico, ya que estimula la circulación sanguínea y la oxigenación celular. POSIBLE TRATAMIENTO: El             " +
                                                  "\n tratamiento para la sífilis suele incluir antibióticos como la penicilina G benzatina, que es el tratamiento        " +
                                                  "\n de primera línea. Marcas reconocidas incluyen Benzetacil. En casos de alergia a la penicilina, se pueden utilizar   " +
                                                  "\n alternativas como doxiciclina o azitromicina. Es fundamental completar el tratamiento indicado por el médico para   " +
                                                  "\n evitar complicaciones y recurrencias. Además, se recomienda evitar el consumo de alcohol y tabaco durante el        " +
                                                  "\n tratamiento, ya que pueden interferir con la eficacia de los antibióticos y prolongar la recuperación. ALIMENTACIÓN " +
                                                  "\n RECOMENDADA: Para fortalecer el sistema inmunológico y ayudar en la recuperación, se recomienda el consumo de YOGUR " +
                                                  "\n NATURAL, rico en PROBIÓTICOS, que favorecen la recuperación intestinal y aportan aproximadamente 10^9 UFC por cada  " +
                                                  "\n 100 g. AJO, con propiedades ANTIBACTERIANAS, que pueden ayudar a combatir la infección y aporta compuestos bioactivos " +
                                                  "\n como alicina. ESPINACA, fuente de VITAMINA C y HIERRO, que fortalece el sistema inmune y aporta cerca del 15% del     " +
                                                  "\n requerimiento diario de HIERRO por cada 100 g. FRUTOS ROJOS, ricos en ANTIOXIDANTES, que ayudan a reducir la          " +
                                                  "\n inflamación y aportan aproximadamente el 50% del requerimiento diario de VITAMINA C por cada 100 g. Este es solo un   " +
                                                  "\n diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni   " +
                                                  "\n que las respuestas sean completamente correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad    " +
                                                  "\n en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se        " +
                                                  "\n recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2.5 a 3 litros de agua al día (aproximadamente           " +
                                                  "\n diez a doce vasos de agua de tamaño regular) para mantener la hidratación de las vías respiratorias y ayudar          " +
                                                  "\n al cuerpo a eliminar la bacteria. También se recomienda el consumo de líquidos tibios como té de jengibre o           " +
                                                  "\n caldos naturales para mejorar la función pulmonar. EJERCICIO: Se recomienda reposo absoluto mientras persistan        " +
                                                  "\n los síntomas, evitando cualquier actividad física intensa. Una vez recuperada, se pueden realizar ejercicios de       " +
                                                  "\n respiración y fortalecimiento pulmonar para mejorar la capacidad respiratoria y reducir la fatiga. También es         " +
                                                  "\n recomendable evitar ambientes con humo o contaminación que puedan agravar los síntomas. La rehabilitación pulmonar    " +
                                                  "\n puede ser una opción efectiva para mejorar la función respiratoria en pacientes con tuberculosis, incluyendo          " +
                                                  "\n ejercicios de expansión torácica y técnicas de respiración profunda. POSIBLE TRATAMIENTO: El tratamiento para la      " +
                                                  "\n tuberculosis suele incluir una combinación de antibióticos como isoniazida, rifampicina, etambutol y pirazinamida,    " +
                                                  "\n administrados durante un período de seis meses o más. Estos medicamentos están disponibles en el sistema de salud     " +
                                                  "\n pública. Es fundamental seguir el tratamiento de manera estricta para evitar la resistencia bacteriana y garantizar   " +
                                                  "\n la recuperación completa. Además, se recomienda una alimentación rica en proteínas y vitaminas para fortalecer el     " +
                                                  "\n sistema inmunológico y mejorar la respuesta al tratamiento. ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema      " +
                                                  "\n respiratorio y reducir la inflamación, se recomienda el consumo de FRUTAS CÍTRICAS como naranja y toronja, ricas en   " +
                                                  "\n VITAMINA C, que fortalece el sistema inmune y aporta cerca del 89% del requerimiento diario por cada 100 g. PESCADOS  " +
                                                  "\n GRASOS como salmón y atún, ricos en ÁCIDOS GRASOS OMEGA-3, que poseen propiedades antiinflamatorias y aportan         " +
                                                  "\n aproximadamente el 50% del requerimiento diario por cada 100 g. ESPINACA, fuente de HIERRO y ANTIOXIDANTES, que       " +
                                                  "\n ayudan a mejorar la oxigenación celular y aportan aproximadamente el 15% del requerimiento diario de HIERRO por       " +
                                                  "\n cada 100 g. JENGIBRE, con propiedades ANTIINFLAMATORIAS y antioxidantes, que pueden aliviar síntomas respiratorios    " +
                                                  "\n y mejorar la función pulmonar. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza     " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda       " +
                                                  "\n realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta " +
                                                  "\n del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular)                 " +
                                                  "\n para mantener una hidratación adecuada. La hidratación es clave para reducir la inflamación en las articulaciones            " +
                                                  "\n y mejorar la movilidad. También es recomendable el consumo de infusiones antiinflamatorias como té de cúrcuma o              " +
                                                  "\n jengibre. EJERCICIO: Se aconseja actividad física moderada y adaptada a la condición de la paciente. Se recomienda           " +
                                                  "\n ejercicios de bajo impacto como natación, yoga o pilates para fortalecer los músculos sin generar estrés en las              " +
                                                  "\n articulaciones. También es beneficioso realizar ejercicios de movilidad articular y estiramientos para mejorar la            " +
                                                  "\n flexibilidad y reducir la rigidez. POSIBLE TRATAMIENTO: Para la artritis en mujeres adultas, el tratamiento suele            " +
                                                  "\n incluir medicamentos antiinflamatorios no esteroides como el ibuprofeno o el naproxeno, corticosteroides en casos            " +
                                                  "\n más severos y medicamentos antirreumáticos modificadores de la enfermedad como el metotrexato. También se recomienda         " +
                                                  "\n la fisioterapia y el uso de suplementos como el colágeno y la glucosamina para mejorar la salud articular. ALIMENTACIÓN:     " +
                                                  "\n Se recomienda el consumo de alimentos con propiedades antiinflamatorias y antioxidantes para mejorar la función articular:   " +
                                                  "\n Pescados grasos (salmón, atún): Ricos en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias. Frutas y           " +
                                                  "\n verduras de colores vivos (arándanos, fresas, espinacas, brócoli): Ricas en antioxidantes como la vitamina C y carotenoides, " +
                                                  "\n que pueden proteger las células del daño. Jengibre: Contiene compuestos con efectos antiinflamatorios que podrían ser        " +
                                                  "\n beneficiosos para las articulaciones. Cúrcuma: Con su componente activo, la curcumina, tiene potentes propiedades            " +
                                                  "\n antiinflamatorias y antioxidantes. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza        " +
                                                  "\n al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello        " +
                                                  "\n se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su        " +
                                                  "\n paciente, además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se le recomienda mucho consultar   " +
                                                  "\n a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tamaño regular) para            " +
                                                  "\n mantener una hidratación adecuada y ayudar a aliviar la irritación de las vías respiratorias. También es recomendable      " +
                                                  "\n el consumo de infusiones calientes como té de miel y limón para calmar la tos y mejorar la respiración. EJERCICIO:         " +
                                                  "\n Se aconseja actividad física ligera y progresiva, evitando esfuerzos intensos mientras persistan los síntomas. Se          " +
                                                  "\n recomienda caminatas suaves de 15 a 30 minutos diarios para mejorar la oxigenación y la recuperación pulmonar. También     " +
                                                  "\n es importante evitar ambientes con humo o polvo que puedan agravar la tos. POSIBLE TRATAMIENTO: Para la tosferina en       " +
                                                  "\n mujeres adultas, el tratamiento suele incluir antibióticos como la azitromicina o la claritromicina para reducir la        " +
                                                  "\n duración de la enfermedad y evitar complicaciones. También se recomienda el uso de humidificadores y el descanso adecuado  " +
                                                  "\n para facilitar la recuperación. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en vitaminas y minerales         " +
                                                  "\n esenciales para fortalecer el sistema inmunológico y mejorar la función pulmonar: Naranjas y mandarinas: Ricas en          " +
                                                  "\n vitamina C, esenciales para mejorar la respuesta inmune. Jengibre: Posee propiedades antiinflamatorias y antioxidantes que " +
                                                  "\n pueden aliviar la congestión. Espinacas y brócoli: Ricos en vitamina A y vitamina C, esenciales para fortalecer el sistema " +
                                                  "\n inmunológico y acelerar la recuperación. Miel: Tiene propiedades antibacterianas y ayuda a calmar la irritación de la    " +
                                                  "\n garganta. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente     " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más    " +
                                                  "\n de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además, por su   " +
                                                  "\n salud, si la respuesta del diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico. Angel L   " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular)         " +
                                                  "\n para mantener una hidratación adecuada y ayudar a reducir la fiebre. También es recomendable el consumo de           " +
                                                  "\n caldos y sopas calientes para mejorar la hidratación y aliviar la inflamación de las glándulas salivales.            " +
                                                  "\n EJERCICIO: Se aconseja evitar actividad física intensa mientras persistan los síntomas. Se recomienda descanso       " +
                                                  "\n absoluto y caminatas suaves para mejorar la circulación y el bienestar general. POSIBLE TRATAMIENTO: Para las        " +
                                                  "\n paperas en mujeres adultas, el tratamiento suele incluir medicamentos para reducir la fiebre y aliviar los           " +
                                                  "\n síntomas, como el paracetamol o el ibuprofeno. También se recomienda el reposo, la hidratación adecuada y una        " +
                                                  "\n alimentación de consistencia blanda para facilitar la ingesta de alimentos. ALIMENTACIÓN: Se recomienda el consumo   " +
                                                  "\n de alimentos ricos en vitaminas y minerales esenciales para fortalecer el sistema inmunológico y mejorar la          " +
                                                  "\n recuperación: Yogur natural: Rico en probióticos, ayuda a restaurar la flora intestinal y mejorar la digestión.      " +
                                                  "\n Plátanos: Contienen potasio, esencial para reponer electrolitos perdidos y mejorar la función muscular. Arroz y pan  " +
                                                  "\n tostado: Son fáciles de digerir y ayudan a estabilizar el sistema digestivo. Zanahorias: Ricas en vitamina A,        " +
                                                  "\n esenciales para la regeneración celular y la recuperación. Este es solo un diagnóstico predeterminado lógico, haberlo" +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas   " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en   " +
                                                  "\n el tratamiento adecuado de su paciente, además, por su salud, si la respuesta del diagnóstico no le satisface del    " +
                                                  "\n todo, se le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera    " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACIÓN. Es fundamental mantener una hidratación adecuada para reducir los síntomas y prevenir complicaciones,      " +
                                                  "\n se recomienda el consumo de 2 a 2.5 litros de agua al día, además de líquidos ricos en electrolitos como agua de        " +
                                                  "\n coco o sueros orales para evitar la deshidratación causada por fiebre y sudoración, también se recomienda el consumo    " +
                                                  "\n de infusiones naturales como té de jengibre para aliviar la inflamación y mejorar la circulación sanguínea.             " +
                                                  "\n EJERCICIO. La actividad física debe ser ligera y adaptada a la condición del paciente, se recomienda caminatas          " +
                                                  "\n suaves y ejercicios de movilidad para mejorar la circulación y reducir la fatiga, además el descanso adecuado es        " +
                                                  "\n clave para la recuperación, evitando esfuerzos excesivos mientras persistan los síntomas, ejercicios de respiración     " +
                                                  "\n profunda pueden ayudar a mejorar la oxigenación y reducir el estrés. POSIBLE TRATAMIENTO. No existe un fármaco          " +
                                                  "\n antiviral específico para tratar la infección por virus Zika, el tratamiento es sintomático e incluye antiinflamatorios " +
                                                  "\n no esteroideos y analgésicos como el paracetamol para reducir la fiebre y aliviar el malestar, también se recomienda    " +
                                                  "\n reposo, ingesta de abundantes líquidos y administración de antihistamínicos para controlar el prurito asociado con el   " +
                                                  "\n exantema, es fundamental seguir las indicaciones médicas y evitar la automedicación, en casos graves se recomienda      " +
                                                  "\n acudir al médico para evaluar posibles complicaciones neurológicas. ALIMENTACIÓN. Se recomienda el consumo de alimentos " +
                                                  "\n ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico, NARANJA. Rica en vitamina C que " +
                                                  "\n ayuda a reducir la inflamación y fortalecer el sistema inmune, aporta aproximadamente el 89% de la ingesta diaria       " +
                                                  "\n recomendada por cada 100 gramos. JENGIBRE. Contiene compuestos con efectos antiinflamatorios y ayuda a aliviar la       " +
                                                  "\n fiebre y el malestar, su consumo puede aportar hasta el 20% de la ingesta diaria recomendada de antioxidantes. MIEL.    " +
                                                  "\n Posee propiedades antimicrobianas y ayuda a calmar la garganta y reducir la inflamación, aporta cerca del 10% de la     " +
                                                  "\n ingesta diaria recomendada de antioxidantes por cada cucharada. Este es solo un Diagnóstico predeterminado lógico,      " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus         " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor        " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera    " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACIÓN. Es crucial mantener una hidratación adecuada para prevenir la deshidratación causada por            " +
                                                  "\n la diarrea y el vómito, se recomienda el consumo de 2.5 a 3 litros de agua al día, además de soluciones          " +
                                                  "\n de rehidratación oral como Pedialyte para recuperar electrolitos esenciales, también se recomienda el            " +
                                                  "\n consumo de caldos ligeros y agua de coco para reponer minerales perdidos y evitar la deshidratación severa,      " +
                                                  "\n el consumo de agua con limón puede ayudar a mejorar la absorción de nutrientes y fortalecer el sistema           " +
                                                  "\n inmunológico. EJERCICIO. Durante la fase aguda de la enfermedad se recomienda reposo absoluto para evitar        " +
                                                  "\n la deshidratación y el desgaste físico, una vez recuperada la paciente puede retomar actividades ligeras         " +
                                                  "\n como caminatas cortas para mejorar la circulación y fortalecer el sistema inmunológico, además ejercicios        " +
                                                  "\n de movilidad pueden ayudar a recuperar la energía y mejorar la digestión, el yoga y la respiración profunda      " +
                                                  "\n pueden ser beneficiosos para reducir el estrés y mejorar la función digestiva. POSIBLE TRATAMIENTO. No existe    " +
                                                  "\n un tratamiento específico para la infección por rotavirus, el manejo se centra en la prevención de la deshidratación " +
                                                  "\n mediante el consumo de líquidos y soluciones de rehidratación oral, en casos graves puede requerirse la           " +
                                                  "\n administración de líquidos intravenosos en el hospital, es fundamental seguir las indicaciones médicas y evitar   " +
                                                  "\n el consumo de alimentos irritantes, también se recomienda el consumo de probióticos para restaurar la flora       " +
                                                  "\n intestinal y mejorar la absorción de nutrientes esenciales. ALIMENTACIÓN. Se recomienda el consumo de alimentos   " +
                                                  "\n ricos en fibra y probióticos para restaurar la flora intestinal, PLÁTANO. Rico en potasio que ayuda a recuperar   " +
                                                  "\n los electrolitos perdidos, aporta aproximadamente el 10% de la ingesta diaria recomendada por cada 100 gramos.    " +
                                                  "\n YOGURT NATURAL. Contiene probióticos que ayudan a restaurar la flora intestinal, su consumo puede aportar hasta   " +
                                                  "\n el 20% de la ingesta diaria recomendada de probióticos. ZANAHORIA. Rica en vitamina A que ayuda a la regeneración " +
                                                  "\n celular intestinal, aporta aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos. Este es   " +
                                                  "\n solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa      " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un " +
                                                  "\n Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su   " +
                                                  "\n salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel" +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACIÓN. Es fundamental mantener una hidratación adecuada para ayudar al cuerpo a eliminar la infección        " +
                                                  "\n y reducir la fiebre, se recomienda el consumo de 2 a 2.5 litros de agua al día, además de infusiones sin           " +
                                                  "\n azúcar como té verde o agua de jamaica para mejorar la circulación, también se recomienda el consumo de agua       " +
                                                  "\n con miel y limón para aliviar la irritación y fortalecer el sistema inmunológico, el consumo de caldos ricos       " +
                                                  "\n en minerales puede ayudar a mejorar la recuperación y fortalecer el sistema digestivo. EJERCICIO. Se recomienda    " +
                                                  "\n actividad física moderada como caminatas, natación o yoga para mejorar la circulación y fortalecer el sistema      " +
                                                  "\n inmunológico, además ejercicios de movilidad pueden ayudar a reducir la inflamación y mejorar la recuperación,     " +
                                                  "\n es importante realizar ejercicio de manera constante y bajo supervisión médica, ejercicios de respiración profunda " +
                                                  "\n pueden ayudar a mejorar la oxigenación y reducir el estrés. POSIBLE TRATAMIENTO. El tratamiento suele incluir      " +
                                                  "\n antibióticos como la ampicilina o gentamicina, además pueden recetarse medicamentos complementarios para aliviar   " +
                                                  "\n los síntomas, también se recomienda el uso de probióticos para mejorar la flora intestinal y reducir el riesgo de  " +
                                                  "\n reinfección, es fundamental seguir las indicaciones médicas y evitar el consumo de alimentos contaminados, en      " +
                                                  "\n casos graves se recomienda acudir al médico para evaluar posibles complicaciones neurológicas. ALIMENTACIÓN. Se    " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema       " +
                                                  "\n inmunológico, ARÁNDANOS. Ricos en antioxidantes que ayudan a combatir infecciones, aportan aproximadamente el 25%  " +
                                                  "\n de la ingesta diaria recomendada por cada 100 gramos. AJO. Contiene compuestos antimicrobianos que pueden ayudar   " +
                                                  "\n a combatir la infección, su consumo puede aportar hasta el 20% de la ingesta diaria recomendada de antioxidantes.  " +
                                                  "\n JENGIBRE. Contiene propiedades antiinflamatorias que pueden ayudar a reducir los síntomas, su consumo puede aportar" +
                                                  "\n hasta el 15% de la ingesta diaria recomendada de antioxidantes. Este es solo un Diagnóstico predeterminado lógico, " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus    " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor   " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le     " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app        " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo absoluto para evitar complicaciones      " +
                                                  "\n gastrointestinales. Una vez superada la etapa crítica, se pueden realizar ejercicios de movilidad y              " +
                                                  "\n fortalecimiento muscular para recuperar la energía y mejorar la circulación. HIDRATACIÓN: Es fundamental el      " +
                                                  "\n consumo de 2.5 a 3 litros de agua, aproximadamente 10 a 12 vasos de tamaño regular, para prevenir la             " +
                                                  "\n deshidratación causada por la diarrea y favorecer la eliminación de toxinas. También se recomienda el consumo    " +
                                                  "\n de soluciones de rehidratación oral para recuperar electrolitos esenciales. POSIBLE TRATAMIENTO: La shigelosis   " +
                                                  "\n se trata con antibióticos como ciprofloxacina, azitromicina y ceftriaxona, dependiendo de la gravedad de la      " +
                                                  "\n infección. Algunas marcas reconocidas son Cipro (ciprofloxacina), Zithromax (azitromicina) y Rocephin (ceftriaxona). " + 
                                                  "\n Además del tratamiento antibiótico, se recomienda el uso de probióticos para restaurar la flora intestinal y       " +
                                                  "\n mejorar la digestión. ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema inmunológico y mejorar la recuperación, " +
                                                  "\n se recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales. BANANAS: Ricas en POTASIO, que    " +
                                                  "\n ayuda a reemplazar los electrolitos perdidos, aportando aproximadamente 12% del requerimiento diario por cada 100  " +
                                                  "\n gramos. ARROZ BLANCO: Fuente de CARBOHIDRATOS de fácil digestión, proporcionando 20% del requerimiento diario por  " +
                                                  "\n cada 100 gramos. ZANAHORIAS: Altas en VITAMINA A, que favorece la regeneración celular, aportando aproximadamente  " +
                                                  "\n 15% del requerimiento diario por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico. Haberlo    " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga shigelosis ni que el tratamiento sea el adecuado. Se      " +
                                                  "\n recomienda realizar más de un diagnóstico para mayor seguridad y, por su salud, consultar a su médico. Angel    " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada para mejorar la capacidad pulmonar y reducir la fatiga.              " +
                                                  "\n Ejercicios como caminatas, natación y entrenamiento de resistencia pueden ayudar a fortalecer los músculos              " +
                                                  "\n respiratorios. También se recomienda ejercicios de respiración profunda para mejorar la oxigenación y reducir           " +
                                                  "\n la sensación de falta de aire. HIDRATACIÓN: Es esencial el consumo de 2.5 a 3 litros de agua, aproximadamente           " +
                                                  "\n 10 a 12 vasos de tamaño regular, para mantener las vías respiratorias hidratadas y facilitar la eliminación de          " +
                                                  "\n secreciones. También se recomienda el consumo de líquidos tibios como infusiones de jengibre o miel para aliviar        " +
                                                  "\n la irritación de la garganta y mejorar la expectoración. POSIBLE TRATAMIENTO: La EPOC se trata con broncodilatadores    " +
                                                  "\n como salbutamol, tiotropio y formoterol, además de corticosteroides inhalados como budesonida y fluticasona. Algunas    " +
                                                  "\n marcas reconocidas son Ventolin (salbutamol), Spiriva (tiotropio) y Symbicort (budesonida/formoterol). También se       " +
                                                  "\n recomienda el uso de oxigenoterapia en casos avanzados y la rehabilitación pulmonar para mejorar la calidad de vida.    " +
                                                  "\n ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema inmunológico y mejorar la función pulmonar, se recomienda el       " +
                                                  "\n consumo de alimentos ricos en vitaminas y minerales esenciales. PESCADOS GRASOS (salmón, atún): Fuente de OMEGA-3,      " +
                                                  "\n con propiedades antiinflamatorias, proporcionando aproximadamente 2.2 gramos por cada 100 gramos de pescado. FRUTAS     " +
                                                  "\n CÍTRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema inmune, aportando                 " +
                                                  "\n aproximadamente 89% del requerimiento diario por cada 100 gramos. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos     " +
                                                  "\n en HIERRO y MAGNESIO, fundamentales para la regeneración celular y la función muscular, aportando cerca del 15% del     " +
                                                  "\n requerimiento diario por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no      " +
                                                  "\n garantiza al 100% que la paciente tenga EPOC ni que el tratamiento sea el adecuado. Se recomienda realizar más de un    " +
                                                  "\n diagnóstico para mayor seguridad y, por su salud, consultar a su médico. Angel L Montes agradece tu visita a la app     " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada para mejorar la circulación y fortalecer el sistema              " +
                                                  "\n inmunológico. Ejercicios como caminatas, natación y estiramientos pueden ser beneficiosos para la recuperación.     " +
                                                  "\n También se recomienda ejercicios de resistencia moderada para mejorar la función muscular y reducir la fatiga.      " +
                                                  "\n HIDRATACIÓN: Es esencial el consumo de 2.5 a 3 litros de agua, aproximadamente 10 a 12 vasos de tamaño regular,     " +
                                                  "\n para facilitar la eliminación de toxinas y mejorar la función celular. Mantener una hidratación adecuada también    " +
                                                  "\n contribuye a la regeneración de tejidos y ayuda a reducir la inflamación. POSIBLE TRATAMIENTO: La clamidia se       " +
                                                  "\n trata con antibióticos como azitromicina, doxiciclina y levofloxacina. Algunas marcas reconocidas son Zithromax     " +
                                                  "\n (azitromicina), Vibramycin (doxiciclina) y Levaquin (levofloxacina). Es fundamental seguir el tratamiento indicado  " +
                                                  "\n por el médico y realizar pruebas de seguimiento para asegurar la eliminación de la infección. También se recomienda " +
                                                  "\n evitar relaciones sexuales durante el tratamiento para prevenir la reinfección. ALIMENTACIÓN RECOMENDADA: Para      " +
                                                  "\n fortalecer el sistema inmunológico y mejorar la recuperación, se recomienda el consumo de alimentos ricos en        " +
                                                  "\n vitaminas y minerales esenciales. FRUTAS CÍTRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece " +
                                                  "\n el sistema inmune, aportando aproximadamente 89% del requerimiento diario por cada 100 gramos. PESCADOS GRASOS      " +
                                                  "\n (salmón, atún): Fuente de OMEGA-3, con propiedades antiinflamatorias, proporcionando aproximadamente 2.2 gramos por " +
                                                  "\n cada 100 gramos de pescado. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales   " +
                                                  "\n para la regeneración celular y la función muscular, aportando cerca del 15% del requerimiento diario por cada 100   " +
                                                  "\n gramos. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que la paciente  " +
                                                  "\n tenga clamidia ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico para mayor       " +
                                                  "\n seguridad y, por su salud, consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera     " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2.5 a 3 litros de agua al día, ya que una hidratación adecuada              " +
                                                  "\n ayuda a mantener el equilibrio del sistema nervioso y reducir la inflamación de las meninges. También es             " +
                                                  "\n beneficioso complementar con infusiones naturales como té de manzanilla o jengibre, que poseen propiedades           " +
                                                  "\n antiinflamatorias y relajantes. EJERCICIO. La actividad física moderada es clave para fortalecer el sistema          " +
                                                  "\n inmunológico y mejorar la circulación sanguínea. Se recomienda realizar ejercicio aeróbico moderado al menos         " +
                                                  "\n 30 minutos al día, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo. También es beneficioso       " +
                                                  "\n incluir ejercicios de respiración como yoga o técnicas de expansión pulmonar para mejorar la oxigenación cerebral.   " +
                                                  "\n POSIBLE TRATAMIENTO. El tratamiento estándar incluye antibióticos como ceftriaxona, vancomicina y ampicilina, que    " +
                                                  "\n ayudan a eliminar la bacteria causante de la meningitis. En casos graves, se puede requerir hospitalización para     " +
                                                  "\n administración intravenosa de antibióticos y monitoreo de síntomas. También es importante el uso de antiinflamatorios" +
                                                  "\n y analgésicos para reducir el dolor y la fiebre. ALIMENTACIÓN. Para fortalecer el sistema inmunológico y reducir     " +
                                                  "\n la inflamación, se recomienda consumir frutas cítricas como naranja, limón y toronja, que son ricas en vitamina C,   " +
                                                  "\n la cual contribuye a la producción de glóbulos blancos y mejora la respuesta inmune. Verduras crucíferas como brócoli" +
                                                  "\n y coliflor, que contienen vitamina K y antioxidantes, esenciales para la regeneración celular y la protección del    " +
                                                  "\n sistema nervioso. Pescados grasos como salmón y sardina, que son ricos en Omega-3, el cual tiene propiedades         " +
                                                  "\n antiinflamatorias. Legumbres como lentejas y garbanzos, que son fuente de proteínas y hierro, esenciales para        " +
                                                  "\n la energía y la regeneración celular. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no       " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para     " +
                                                  "\n ello, se recomienda realizar más de un diagnóstico y consultar a un médico especialista. Angel L Montes agradece     " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2.5 a 3 litros de agua al día, ya que una hidratación adecuada ayuda        " +
                                                  "\n a mantener el equilibrio celular y mejorar la eliminación de toxinas. También es beneficioso complementar con        " +
                                                  "\n infusiones naturales como té verde o cúrcuma, que poseen propiedades antioxidantes y anticancerígenas. EJERCICIO.    " +
                                                  "\n La actividad física moderada es clave para fortalecer el sistema inmunológico y mejorar la salud cardiovascular.     " +
                                                  "\n Se recomienda realizar ejercicio aeróbico moderado al menos 30 minutos al día, como caminar, nadar o andar en        " +
                                                  "\n bicicleta, evitando el sobreesfuerzo. También es beneficioso incluir ejercicios de resistencia como levantamiento    " +
                                                  "\n de pesas ligeras o yoga, que ayudan a mantener la masa muscular y reducir el estrés. POSIBLE TRATAMIENTO. El         " +
                                                  "\n tratamiento estándar incluye quimioterapia, radioterapia y terapia dirigida, dependiendo del tipo y estadio del      " +
                                                  "\n cáncer. En algunos casos, se puede recurrir a inmunoterapia, que ayuda al sistema inmunológico a combatir las células" +
                                                  "\n cancerosas. Marcas reconocidas incluyen Herceptin, Avastin, Keytruda y Opdivo. También es importante el uso de       " +
                                                  "\n suplementos nutricionales para mantener la energía y reducir los efectos secundarios del tratamiento. ALIMENTACIÓN.    " +
                                                  "\n Para fortalecer el sistema inmunológico y reducir la inflamación, se recomienda consumir frutas cítricas como naranja, " +
                                                  "\n limón y toronja, que son ricas en vitamina C, la cual contribuye a la producción de glóbulos blancos y mejora la       " +
                                                  "\n respuesta inmune. Verduras de hoja verde como espinaca y kale, que contienen ácido fólico y antioxidantes, esenciales  " +
                                                  "\n para la regeneración celular y la protección contra el daño oxidativo. Pescados grasos como salmón y atún, que son     " +
                                                  "\n ricos en Omega-3, el cual tiene propiedades antiinflamatorias. Frutos secos como almendras y nueces, que aportan       " +
                                                  "\n vitamina E, la cual protege las células del daño oxidativo. Legumbres como lentejas y garbanzos, que son fuente de     " +
                                                  "\n proteínas y hierro, esenciales para la energía y la regeneración celular. Este es solo un diagnóstico predeterminado   " +
                                                  "\n lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean       " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico especialista. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.35-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada para fortalecer el sistema inmunológico y mejorar la              " +
                                                  "\n recuperación. Ejercicios como caminatas suaves, yoga y estiramientos pueden ayudar a reducir la fatiga               " +
                                                  "\n y mejorar la circulación. También se recomienda evitar esfuerzos físicos intensos mientras persistan los             " +
                                                  "\n síntomas. HIDRATACIÓN: Es fundamental el consumo de 2.5 a 3 litros de agua, aproximadamente 10 a 12 vasos            " +
                                                  "\n de tamaño regular, para mantener la hidratación y facilitar la eliminación de toxinas. También se recomienda         " +
                                                  "\n el consumo de líquidos tibios como infusiones de jengibre o miel para aliviar la irritación de la garganta y         " +
                                                  "\n mejorar la expectoración. POSIBLE TRATAMIENTO: La influenza se trata con medicamentos antivirales como oseltamivir,  " +
                                                  "\n zanamivir y baloxavir, que ayudan a reducir la duración y severidad de la enfermedad. Además del tratamiento         " +
                                                  "\n antiviral, es importante el uso de analgésicos y antipiréticos como paracetamol para aliviar los síntomas. Se        " +
                                                  "\n recomienda reposo absoluto y una alimentación rica en antioxidantes para fortalecer el sistema inmunológico.         " +
                                                  "\n En casos graves, el médico puede indicar hospitalización para monitoreo y administración de medicamentos intravenosos." +
                                                  "\n ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema inmunológico y mejorar la recuperación, se recomienda el         " +
                                                  "\n consumo de alimentos ricos en vitaminas y minerales esenciales. FRUTAS CÍTRICAS (naranjas, limones, toronjas):        " +
                                                  "\n Altas en VITAMINA C, que fortalece el sistema inmune, aportando aproximadamente 89% del requerimiento diario por      " +
                                                  "\n cada 100 gramos. JENGIBRE: Contiene compuestos con efectos antiinflamatorios que pueden ayudar a aliviar la irritación" +
                                                  "\n de las vías respiratorias, proporcionando 5% del requerimiento diario de antioxidantes por cada 10 gramos. MIEL:      " +
                                                  "\n Con propiedades antimicrobianas y calmantes para la garganta, aportando 20% del requerimiento diario de antioxidantes " +
                                                  "\n por cada 30 gramos. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que    " +
                                                  "\n la paciente tenga influenza ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico para  " +
                                                  "\n mayor seguridad y, por su salud, consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n EJERCICIO: Se recomienda reposo absoluto durante la fase aguda de la enfermedad para evitar complicaciones          " +
                                                  "\n respiratorias. Una vez superada la etapa crítica, se pueden realizar ejercicios de movilidad y respiración          " +
                                                  "\n profunda para mejorar la capacidad pulmonar y reducir la fatiga. También se recomienda ejercicios de expansión      " +
                                                  "\n torácica para fortalecer los músculos respiratorios y mejorar la oxigenación. HIDRATACIÓN: Es esencial el           " +
                                                  "\n consumo de 2.5 a 3 litros de agua, aproximadamente 10 a 12 vasos de tamaño regular, para mantener las vías          " +
                                                  "\n respiratorias limpias y mejorar la eliminación de secreciones. También se recomienda el consumo de caldos y         " +
                                                  "\n líquidos tibios para mejorar la absorción de nutrientes esenciales. POSIBLE TRATAMIENTO: La neumonía se trata       " +
                                                  "\n con antibióticos como amoxicilina, azitromicina y ceftriaxona, dependiendo del agente causal. Además del            " +
                                                  "\n tratamiento antibiótico, se recomienda el uso de antipiréticos para controlar la fiebre y broncodilatadores en      " +
                                                  "\n casos de dificultad respiratoria severa. En casos graves, el médico puede indicar hospitalización para administración " +
                                                  "\n de oxígeno y monitoreo constante. ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema inmunológico y mejorar         " +
                                                  "\n la recuperación, se recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales. FRUTAS CÍTRICAS     " +
                                                  "\n (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema inmune, aportando aproximadamente 89%    " +
                                                  "\n del requerimiento diario por cada 100 gramos. PESCADOS GRASOS (salmón, atún): Fuente de OMEGA-3, con propiedades      " +
                                                  "\n antiinflamatorias, proporcionando aproximadamente 2.2 gramos por cada 100 gramos de pescado. VEGETALES DE HOJA        " +
                                                  "\n VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales para la regeneración celular y la función         " +
                                                  "\n muscular, aportando cerca del 15% del requerimiento diario por cada 100 gramos. Este es solo un diagnóstico           " +
                                                  "\n predeterminado lógico. Haberlo consultado no garantiza al 100% que la paciente tenga neumonía ni que el tratamiento   " +
                                                  "\n sea el adecuado. Se recomienda realizar más de un diagnóstico para mayor seguridad y, por su salud, consultar         " +
                                                  "\n a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n EJERCICIO: Se recomienda actividad física regular para mejorar la sensibilidad a la insulina y controlar       " +
                                                  "\n los niveles de glucosa en sangre. Ejercicios como caminatas, natación y entrenamiento de resistencia pueden    " +
                                                  "\n ser beneficiosos para la regulación metabólica. También se recomienda ejercicios de relajación para reducir    " +
                                                  "\n el estrés y mejorar el bienestar emocional. HIDRATACIÓN: Es esencial el consumo de 2.5 a 3 litros de agua,     " +
                                                  "\n aproximadamente 10 a 12 vasos de tamaño regular, para facilitar la eliminación de toxinas y mejorar la función   " +
                                                  "\n celular. Mantener una hidratación adecuada también contribuye a la absorción de nutrientes esenciales y al       " +
                                                  "\n fortalecimiento del sistema inmunológico. POSIBLE TRATAMIENTO: La diabetes se trata con medicamentos como        " +
                                                  "\n metformina, insulina y sulfonilureas, dependiendo del tipo y gravedad de la enfermedad. Además del tratamiento   " +
                                                  "\n farmacológico, se recomienda el seguimiento de un plan de alimentación adecuado y la monitorización constante    " +
                                                  "\n de los niveles de glucosa en sangre. En casos avanzados, el médico puede indicar el uso de bombas de insulina    " +
                                                  "\n o tratamientos combinados para mejorar el control de la enfermedad. También es importante la educación del       " +
                                                  "\n paciente sobre el manejo de la diabetes y la prevención de complicaciones a largo plazo. ALIMENTACIÓN RECOMENDADA: " +
                                                  "\n Para fortalecer el sistema inmunológico y mejorar la regulación de la glucosa, se recomienda el consumo de         " +
                                                  "\n alimentos ricos en vitaminas y minerales esenciales. FRUTAS CÍTRICAS (naranjas, limones, toronjas): Altas en       " +
                                                  "\n VITAMINA C, que fortalece el sistema inmune, aportando aproximadamente 89% del requerimiento diario por cada       " +
                                                  "\n 100 gramos. PESCADOS GRASOS (salmón, atún): Fuente de OMEGA-3, con propiedades antiinflamatorias, proporcionando   " +
                                                  "\n aproximadamente 2.2 gramos por cada 100 gramos de pescado. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en    " +
                                                  "\n HIERRO y MAGNESIO, fundamentales para la regeneración celular y la función muscular, aportando cerca del 15% del   " +
                                                  "\n requerimiento diario por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado    " +
                                                  "\n no garantiza al 100% que la paciente tenga diabetes ni que el tratamiento sea el adecuado. Se recomienda realizar  " +
                                                  "\n más de un diagnóstico para mayor seguridad y, por su salud, consultar a su médico. Angel L Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2 a 2.5 litros de agua al día, ya que una hidratación adecuada ayuda            " +
                                                  "\n a mantener las vías respiratorias húmedas y reducir la inflamación bronquial. También es beneficioso complementar        " +
                                                  "\n con infusiones naturales como té de jengibre o cúrcuma, que poseen propiedades antiinflamatorias y antioxidantes.        " +
                                                  "\n EJERCICIO. La actividad física moderada es clave para fortalecer el sistema respiratorio y mejorar la capacidad          " +
                                                  "\n pulmonar. Se recomienda realizar ejercicio aeróbico moderado al menos 30 minutos al día, como caminar, nadar o andar     " +
                                                  "\n en bicicleta, evitando el sobreesfuerzo. También es beneficioso incluir ejercicios de respiración como yoga o técnicas   " +
                                                  "\n de expansión pulmonar. POSIBLE TRATAMIENTO. El tratamiento estándar incluye broncodilatadores de alivio rápido como      " +
                                                  "\n salbutamol, y corticosteroides inhalados como fluticasona o budesonida, que ayudan a reducir la inflamación y mejorar    " +
                                                  "\n la función pulmonar. También se pueden utilizar antagonistas de los receptores de leucotrienos, como montelukast, para   " +
                                                  "\n el control a largo plazo. Marcas reconocidas incluyen Ventolin, Aerolin, Flixotide, Pulmicort y Singulair. ALIMENTACIÓN. " +
                                                  "\n Para fortalecer el sistema inmunológico y reducir la inflamación, se recomienda consumir frutas cítricas como naranja,   " +
                                                  "\n limón y toronja, que son ricas en vitamina C, la cual contribuye a la producción de glóbulos blancos y mejora la         " +
                                                  "\n respuesta inmune. Verduras de hoja verde como espinaca y acelga, que contienen ácido fólico, esencial para la producción " +
                                                  "\n de células sanguíneas. Pescados grasos como salmón y sardina, que son ricos en Omega-3, el cual tiene propiedades        " +
                                                  "\n antiinflamatorias. Frutos secos como almendras y nueces, que aportan vitamina E, la cual protege las células del daño    " +
                                                  "\n oxidativo. Legumbres como lentejas y garbanzos, que son fuente de proteínas y hierro, esenciales para la energía y la    " +
                                                  "\n regeneración celular. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que     " + 
                                                  "\n el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar  " +
                                                  "\n más de un diagnóstico y consultar a un médico especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera" +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2.5 a 3 litros de agua al día, ya que una hidratación adecuada          " +
                                                  "\n ayuda a mantener el equilibrio del sistema inmunológico y mejorar la absorción de los medicamentos               " +
                                                  "\n antirretrovirales. También es beneficioso complementar con infusiones naturales como té verde o manzanilla,      " +
                                                  "\n que poseen propiedades antioxidantes y antiinflamatorias. EJERCICIO. La actividad física moderada es clave       " +
                                                  "\n para fortalecer el sistema inmunológico y mejorar la salud cardiovascular. Se recomienda realizar ejercicio      " +
                                                  "\n aeróbico moderado al menos 30 minutos al día, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo. " +
                                                  "\n También es beneficioso incluir ejercicios de resistencia como levantamiento de pesas ligeras o yoga, que         " +
                                                  "\n ayudan a mantener la masa muscular y reducir el estrés. POSIBLE TRATAMIENTO. El tratamiento estándar incluye     " +
                                                  "\n terapia antirretroviral (TAR) con medicamentos como tenofovir, emtricitabina y dolutegravir, que ayudan a        " +
                                                  "\n controlar la replicación del virus y mejorar la calidad de vida. También pueden utilizarse inhibidores de        " +
                                                  "\n proteasa, como darunavir, en combinación con otros antirretrovirales. Marcas reconocidas incluyen Atripla,       " +
                                                  "\n Truvada, Tivicay, Biktarvy y Prezista. ALIMENTACIÓN. Para fortalecer el sistema inmunológico y reducir la        " +
                                                  "\n inflamación, se recomienda consumir frutas cítricas como naranja, limón y toronja, que son ricas en vitamina C,  " +
                                                  "\n la cual contribuye a la producción de glóbulos blancos y mejora la respuesta inmune. Verduras de hoja verde      " +
                                                  "\n como espinaca y kale, que contienen ácido fólico y antioxidantes, esenciales para la regeneración celular y      " +
                                                  "\n la protección contra el daño oxidativo. Pescados grasos como salmón y atún, que son ricos en Omega-3, el cual    " +
                                                  "\n tiene propiedades antiinflamatorias. Frutos secos como almendras y nueces, que aportan vitamina E, la cual       " +
                                                  "\n protege las células del daño oxidativo. Legumbres como lentejas y garbanzos, que son fuente de proteínas y       " +
                                                  "\n hierro, esenciales para la energía y la regeneración celular. Este es solo un diagnóstico predeterminado lógico. " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean    " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico    " +
                                                  "\n especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2 a 2.5 litros de agua al día, ya que una hidratación adecuada      " +
                                                  "\n ayuda a eliminar toxinas y mantener el equilibrio del sistema inmunológico. También es beneficioso           " +
                                                  "\n complementar con infusiones naturales como té verde o manzanilla, que poseen propiedades antibacterianas     " +
                                                  "\n y antiinflamatorias. EJERCICIO. La actividad física moderada es clave para fortalecer el sistema             " +
                                                  "\n inmunológico y mejorar la circulación sanguínea. Se recomienda realizar ejercicio aeróbico moderado al       " +
                                                  "\n menos 30 minutos al día, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo. También es     " +
                                                  "\n beneficioso incluir ejercicios de resistencia como levantamiento de pesas ligeras o yoga, que ayudan a       " +
                                                  "\n mantener la masa muscular y reducir el estrés. POSIBLE TRATAMIENTO. El tratamiento estándar incluye          " +
                                                  "\n antibióticos como ceftriaxona y azitromicina, que ayudan a eliminar la bacteria Neisseria gonorrhoeae.       " +
                                                  "\n En casos de resistencia, se pueden utilizar combinaciones de antibióticos como gentamicina con azitromicina.     " +
                                                  "\n Marcas reconocidas incluyen Rocephin, Zithromax y Gentak. ALIMENTACIÓN. Para fortalecer el sistema inmunológico  " +
                                                  "\n y reducir la inflamación, se recomienda consumir frutas cítricas como naranja, limón y toronja, que son ricas    " +
                                                  "\n en vitamina C, la cual contribuye a la producción de glóbulos blancos y mejora la respuesta inmune. Verduras     " +
                                                  "\n crucíferas como brócoli y coliflor, que contienen vitamina K y antioxidantes, esenciales para la regeneración    " +
                                                  "\n celular. Pescados grasos como salmón y sardina, que son ricos en Omega-3, el cual tiene propiedades antiinflamatorias." +
                                                  "\n Legumbres como lentejas y garbanzos, que son fuente de proteínas y hierro, esenciales para la energía y la    " +
                                                  "\n regeneración celular. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al   " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se  " +
                                                  "\n recomienda realizar más de un diagnóstico y consultar a un médico especialista. Angel L Montes agradece tu    " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al día (aproximadamente           " +
                                                  "\n ocho a diez vasos de agua de tamaño regular) para mantener la hidratación celular y ayudar al cuerpo a combatir       " +
                                                  "\n el virus. También se recomienda el consumo de líquidos ricos en antioxidantes como té verde o infusiones de           " +
                                                  "\n manzanilla para mejorar la respuesta inmunológica. EJERCICIO: Se recomienda actividad física moderada, evitando       " +
                                                  "\n el sobreesfuerzo durante los brotes. Ejercicios como yoga, pilates y caminatas suaves pueden ayudar a reducir el      " +
                                                  "\n estrés, que es un factor desencadenante de los brotes de herpes. Además, el ejercicio regular fortalece el sistema    " +
                                                  "\n inmunológico, lo que puede ayudar a reducir la frecuencia de los brotes. Es importante evitar actividades que generen " +
                                                  "\n fricción o sudoración excesiva en la zona afectada, ya que esto puede agravar los síntomas. POSIBLE TRATAMIENTO:      " +
                                                  "\n El tratamiento para el herpes genital suele incluir antivirales como aciclovir, valaciclovir o famciclovir, que       " +
                                                  "\n ayudan a reducir la duración y severidad de los brotes. Marcas reconocidas incluyen Zovirax y Valtrex. También se     " +
                                                  "\n recomienda el uso de cremas tópicas para aliviar el dolor y la inflamación, así como el fortalecimiento del sistema   " +
                                                  "\n inmunológico mediante una dieta equilibrada y el manejo del estrés. En algunos casos, los médicos pueden recomendar   " +
                                                  "\n suplementos de lisina, un aminoácido que puede ayudar a reducir la replicación del virus. ALIMENTACIÓN RECOMENDADA:   " +
                                                  "\n Para fortalecer el sistema inmunológico y ayudar en la recuperación, se recomienda el consumo de FRUTAS CÍTRICAS como    " +
                                                  "\n naranja y toronja, ricas en VITAMINA C, que fortalece el sistema inmune y aporta cerca del 89% del requerimiento diario  " +
                                                  "\n por cada 100 g. ARÁNDANOS, ricos en ANTIOXIDANTES, que ayudan a reducir la inflamación y aportan aproximadamente el 50%  " +
                                                  "\n del requerimiento diario de VITAMINA C por cada 100 g. AJO, con propiedades ANTIVIRALES, que pueden ayudar a combatir el " +
                                                  "\n virus y fortalecer el sistema inmunológico. ESPINACA, fuente de HIERRO y VITAMINA E, que ayuda a mejorar la regeneración " +
                                                  "\n celular y aporta aproximadamente el 15% del requerimiento diario de HIERRO por cada 100 g. Este es solo un diagnóstico   " +
                                                  "\n predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas " +
                                                  "\n sean completamente correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento  " +
                                                  "\n adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar  " +
                                                  "\n a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al día (aproximadamente          " +
                                                  "\n ocho a diez vasos de agua de tamaño regular) para ayudar al cuerpo a eliminar la bacteria y prevenir la              " +
                                                  "\n deshidratación causada por fiebre y malestar. También se recomienda el consumo de líquidos ricos en electrolitos     " +
                                                  "\n como agua de coco o caldos naturales para mejorar la recuperación. EJERCICIO: Se recomienda reposo moderado          " +
                                                  "\n mientras persistan los síntomas, evitando esfuerzos físicos intensos. Sin embargo, una vez recuperada, se pueden     " +
                                                  "\n realizar ejercicios de bajo impacto como yoga o estiramientos suaves para mejorar la circulación y fortalecer el     " +
                                                  "\n sistema inmunológico. La actividad física regular puede ayudar a mejorar la respuesta del cuerpo al tratamiento      " +
                                                  "\n antibiótico, ya que estimula la circulación sanguínea y la oxigenación celular. POSIBLE TRATAMIENTO: El tratamiento  " +
                                                  "\n para la sífilis suele incluir antibióticos como la penicilina G benzatina, que es el tratamiento de primera línea.   " +
                                                  "\n Marcas reconocidas incluyen Benzetacil. En casos de alergia a la penicilina, se pueden utilizar alternativas como    " +
                                                  "\n doxiciclina o azitromicina. Es fundamental completar el tratamiento indicado por el médico para evitar complicaciones   " +
                                                  "\n y recurrencias. Además, se recomienda evitar el consumo de alcohol y tabaco durante el tratamiento, ya que pueden       " +
                                                  "\n interferir con la eficacia de los antibióticos y prolongar la recuperación. ALIMENTACIÓN RECOMENDADA: Para fortalecer   " +
                                                  "\n el sistema inmunológico y ayudar en la recuperación, se recomienda el consumo de YOGUR NATURAL, rico en PROBIÓTICOS,    " +
                                                  "\n que favorecen la recuperación intestinal y aportan aproximadamente 10^9 UFC por cada 100 g. AJO, con propiedades        " +
                                                  "\n ANTIBACTERIANAS, que pueden ayudar a combatir la infección y aporta compuestos bioactivos como alicina. ESPINACA,       " +
                                                  "\n fuente de VITAMINA C y HIERRO, que fortalece el sistema inmune y aporta cerca del 15% del requerimiento diario de       " +
                                                  "\n HIERRO por cada 100 g. FRUTOS ROJOS, ricos en ANTIOXIDANTES, que ayudan a reducir la inflamación y aportan aproximadamente " +
                                                  "\n el 50% del requerimiento diario de VITAMINA C por cada 100 g. Este es solo un diagnóstico predeterminado lógico.      " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente" +
                                                  "\n correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además,  " +
                                                  "\n por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.      " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2.5 a 3 litros de agua al día (aproximadamente           " +
                                                  "\n diez a doce vasos de agua de tamaño regular) para mantener la hidratación de las vías respiratorias y ayudar          " +
                                                  "\n al cuerpo a eliminar la bacteria. También se recomienda el consumo de líquidos tibios como té de jengibre o           " +
                                                  "\n caldos naturales para mejorar la función pulmonar. EJERCICIO: Se recomienda reposo absoluto mientras persistan        " +
                                                  "\n los síntomas, evitando cualquier actividad física intensa. Una vez recuperada, se pueden realizar ejercicios de       " +
                                                  "\n respiración y fortalecimiento pulmonar para mejorar la capacidad respiratoria y reducir la fatiga. También es         " +
                                                  "\n recomendable evitar ambientes con humo o contaminación que puedan agravar los síntomas. La rehabilitación pulmonar    " +
                                                  "\n puede ser una opción efectiva para mejorar la función respiratoria en pacientes con tuberculosis, incluyendo          " +
                                                  "\n ejercicios de expansión torácica y técnicas de respiración profunda. POSIBLE TRATAMIENTO: El tratamiento para         " +
                                                  "\n la tuberculosis suele incluir una combinación de antibióticos como isoniazida, rifampicina, etambutol y pirazinamida, " +
                                                  "\n administrados durante un período de seis meses o más. Es fundamental seguir el tratamiento de manera estricta para    " +
                                                  "\n evitar la resistencia bacteriana y garantizar la recuperación completa. Además, se recomienda una alimentación rica   " +
                                                  "\n en proteínas y vitaminas para fortalecer el sistema inmunológico y mejorar la respuesta al tratamiento. ALIMENTACIÓN  " +
                                                  "\n RECOMENDADA: Para fortalecer el sistema respiratorio y reducir la inflamación, se recomienda el consumo de FRUTAS     " +
                                                  "\n CÍTRICAS como naranja y toronja, ricas en VITAMINA C, que fortalece el sistema inmune y aporta cerca del 89% del      " +
                                                  "\n requerimiento diario por cada 100 g. PESCADOS GRASOS como salmón y atún, ricos en ÁCIDOS GRASOS OMEGA-3, que poseen   " +
                                                  "\n propiedades antiinflamatorias y aportan aproximadamente el 50% del requerimiento diario por cada 100 g. ESPINACA,     " +
                                                  "\n fuente de HIERRO y ANTIOXIDANTES, que ayudan a mejorar la oxigenación celular y aportan aproximadamente el 15% del      " +
                                                  "\n requerimiento diario de HIERRO por cada 100 g. JENGIBRE, con propiedades ANTIINFLAMATORIAS y antioxidantes, que pueden  " +
                                                  "\n aliviar síntomas respiratorios y mejorar la función pulmonar. Este es solo un diagnóstico predeterminado lógico.        " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente  " +
                                                  "\n correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su " +
                                                  "\n salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes    " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular)              " +
                                                  "\n para mantener una hidratación adecuada. La hidratación es clave para reducir la inflamación en las articulaciones         " +
                                                  "\n y mejorar la movilidad. También es recomendable el consumo de infusiones antiinflamatorias como té de cúrcuma o           " +
                                                  "\n jengibre. EJERCICIO: Se aconseja actividad física moderada y adaptada a la condición de la paciente. Se recomienda        " +
                                                  "\n ejercicios de bajo impacto como natación, yoga o pilates para fortalecer los músculos sin generar estrés en las           " +
                                                  "\n articulaciones. También es beneficioso realizar ejercicios de movilidad articular y estiramientos para mejorar la         " +
                                                  "\n flexibilidad y reducir la rigidez. POSIBLE TRATAMIENTO: Para la artritis en mujeres adultas, el tratamiento suele         " +
                                                  "\n incluir medicamentos antiinflamatorios no esteroides como el ibuprofeno o el naproxeno, corticosteroides en casos         " +
                                                  "\n más severos y medicamentos antirreumáticos modificadores de la enfermedad como el metotrexato. También se recomienda      " +
                                                  "\n la fisioterapia y el uso de suplementos como el colágeno y la glucosamina para mejorar la salud articular. ALIMENTACIÓN:  " +
                                                  "\n Se recomienda el consumo de alimentos con propiedades antiinflamatorias y antioxidantes para mejorar la función           " +
                                                  "\n articular: Pescados grasos (salmón, atún): Ricos en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias.      " +
                                                  "\n Frutas y verduras de colores vivos (arándanos, fresas, espinacas, brócoli): Ricas en antioxidantes como la vitamina C     " +
                                                  "\n y carotenoides, que pueden proteger las células del daño. Jengibre: Contiene compuestos con efectos antiinflamatorios     " +
                                                  "\n que podrían ser beneficiosos para las articulaciones. Cúrcuma: Con su componente activo, la curcumina, tiene potentes     " +
                                                  "\n propiedades antiinflamatorias y antioxidantes. Este es solo un diagnóstico predeterminado lógico, haberlo consultado      " +
                                                  "\n no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas,  " +
                                                  "\n para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado " +
                                                  "\n de su paciente, además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se le recomienda mucho    " +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tamaño regular)          " +
                                                  "\n para mantener una hidratación adecuada y ayudar a aliviar la irritación de las vías respiratorias. También          " +
                                                  "\n es recomendable el consumo de infusiones calientes como té de miel y limón para calmar la tos y mejorar la          " +
                                                  "\n respiración. EJERCICIO: Se aconseja actividad física ligera y progresiva, evitando esfuerzos intensos mientras      " +
                                                  "\n persistan los síntomas. Se recomienda caminatas suaves de 15 a 30 minutos diarios para mejorar la oxigenación       " +
                                                  "\n y la recuperación pulmonar. También es importante evitar ambientes con humo o polvo que puedan agravar la tos.      " +
                                                  "\n POSIBLE TRATAMIENTO: Para la tosferina en mujeres adultas, el tratamiento suele incluir antibióticos como la        " +
                                                  "\n azitromicina o la claritromicina para reducir la duración de la enfermedad y evitar complicaciones. También se      " +
                                                  "\n recomienda el uso de humidificadores y el descanso adecuado para facilitar la recuperación. ALIMENTACIÓN: Se        " +
                                                  "\n recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales para fortalecer el sistema inmunológico" +
                                                  "\n y mejorar la función pulmonar: Naranjas y mandarinas: Ricas en vitamina C, esenciales para mejorar la respuesta     " +
                                                  "\n inmune. Jengibre: Posee propiedades antiinflamatorias y antioxidantes que pueden aliviar la congestión. Espinacas   " +
                                                  "\n y brócoli: Ricos en vitamina A y vitamina C, esenciales para fortalecer el sistema inmunológico y acelerar la       " +
                                                  "\n recuperación. Miel: Tiene propiedades antibacterianas y ayuda a calmar la irritación de la garganta. Este es solo   " +
                                                  "\n un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad  " +
                                                  "\n y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico  " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además, por su salud, si la   " +
                                                  "\n respuesta del diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico. Angel L Montes    " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular)       " +
                                                  "\n para mantener una hidratación adecuada y ayudar a reducir la fiebre. También es recomendable el consumo de         " +
                                                  "\n caldos y sopas calientes para mejorar la hidratación y aliviar la inflamación de las glándulas salivales.          " +
                                                  "\n EJERCICIO: Se aconseja evitar actividad física intensa mientras persistan los síntomas. Se recomienda descanso     " +
                                                  "\n absoluto y caminatas suaves para mejorar la circulación y el bienestar general. POSIBLE TRATAMIENTO: Para las      " +
                                                  "\n paperas en mujeres adultas, el tratamiento suele incluir medicamentos para reducir la fiebre y aliviar los         " +
                                                  "\n síntomas, como el paracetamol o el ibuprofeno. También se recomienda el reposo, la hidratación adecuada y una      " +
                                                  "\n alimentación de consistencia blanda para facilitar la ingesta de alimentos. ALIMENTACIÓN: Se recomienda el         " +
                                                  "\n consumo de alimentos ricos en vitaminas y minerales esenciales para fortalecer el sistema inmunológico y mejorar   " +
                                                  "\n la recuperación: Yogur natural: Rico en probióticos, ayuda a restaurar la flora intestinal y mejorar la digestión. " +
                                                  "\n Plátanos: Contienen potasio, esencial para reponer electrolitos perdidos y mejorar la función muscular. Arroz      " +
                                                  "\n y pan tostado: Son fáciles de digerir y ayudan a estabilizar el sistema digestivo. Zanahorias: Ricas en vitamina A," +
                                                  "\n esenciales para la regeneración celular y la recuperación. Este es solo un diagnóstico predeterminado lógico,      " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus    " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor   " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además, por su salud, si la respuesta del diagnóstico no le   " +
                                                  "\n satisface del todo, se le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita a la app       " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACIÓN. Es fundamental mantener una hidratación adecuada para reducir los síntomas y prevenir                 " +
                                                  "\n complicaciones, se recomienda el consumo de 2 a 2.5 litros de agua al día, además de líquidos ricos                " +
                                                  "\n en electrolitos como agua de coco o sueros orales para evitar la deshidratación causada por fiebre                 " +
                                                  "\n y sudoración, también se recomienda el consumo de infusiones naturales como té de jengibre para aliviar            " +
                                                  "\n la inflamación y mejorar la circulación sanguínea. EJERCICIO. La actividad física debe ser ligera y                " +
                                                  "\n adaptada a la condición del paciente, se recomienda caminatas suaves y ejercicios de movilidad para                " +
                                                  "\n mejorar la circulación y reducir la fatiga, además el descanso adecuado es clave para la recuperación,             " +
                                                  "\n evitando esfuerzos excesivos mientras persistan los síntomas, ejercicios de respiración profunda pueden            " +
                                                  "\n ayudar a mejorar la oxigenación y reducir el estrés. POSIBLE TRATAMIENTO. No existe un fármaco antiviral           " +
                                                  "\n específico para tratar la infección por virus Zika, el tratamiento es sintomático e incluye antiinflamatorios      " +
                                                  "\n no esteroideos y analgésicos como el paracetamol para reducir la fiebre y aliviar el malestar, también se          " +
                                                  "\n recomienda reposo, ingesta de abundantes líquidos y administración de antihistamínicos para controlar el           " +
                                                  "\n prurito asociado con el exantema, es fundamental seguir las indicaciones médicas y evitar la automedicación,       " +
                                                  "\n en casos graves se recomienda acudir al médico para evaluar posibles complicaciones neurológicas. ALIMENTACIÓN.    " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema    " +
                                                  "\n inmunológico, NARANJA. Rica en vitamina C que ayuda a reducir la inflamación y fortalecer el sistema inmune,       " +
                                                  "\n aporta aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE. Contiene compuestos  " +
                                                  "\n con efectos antiinflamatorios y ayuda a aliviar la fiebre y el malestar, su consumo puede aportar hasta el 20% de     " +
                                                  "\n la ingesta diaria recomendada de antioxidantes. MIEL. Posee propiedades antimicrobianas y ayuda a calmar la garganta  " +
                                                  "\n y reducir la inflamación, aporta cerca del 10% de la ingesta diaria recomendada de antioxidantes por cada cucharada.  " +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa  " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un     " +
                                                  "\n Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud " +
                                                  "\n si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACIÓN. Es crucial mantener una hidratación adecuada para prevenir la deshidratación causada por la           " +
                                                  "\n diarrea y el vómito, se recomienda el consumo de 2.5 a 3 litros de agua al día, además de soluciones de            " +
                                                  "\n rehidratación oral como Pedialyte para recuperar electrolitos esenciales, también se recomienda el consumo         " +
                                                  "\n de caldos ligeros y agua de coco para reponer minerales perdidos y evitar la deshidratación severa, el             " +
                                                  "\n consumo de agua con limón puede ayudar a mejorar la absorción de nutrientes y fortalecer el sistema inmunológico.  " +
                                                  "\n EJERCICIO. Durante la fase aguda de la enfermedad se recomienda reposo absoluto para evitar la deshidratación      " +
                                                  "\n y el desgaste físico, una vez recuperada la paciente puede retomar actividades ligeras como caminatas cortas       " +
                                                  "\n para mejorar la circulación y fortalecer el sistema inmunológico, además ejercicios de movilidad pueden ayudar     " +
                                                  "\n a recuperar la energía y mejorar la digestión, el yoga y la respiración profunda pueden ser beneficiosos para      " +
                                                  "\n reducir el estrés y mejorar la función digestiva. POSIBLE TRATAMIENTO. No existe un tratamiento específico para    " +
                                                  "\n la infección por rotavirus, el manejo se centra en la prevención de la deshidratación mediante el consumo de       " +
                                                  "\n líquidos y soluciones de rehidratación oral, en casos graves puede requerirse la administración de líquidos        " +
                                                  "\n intravenosos en el hospital, es fundamental seguir las indicaciones médicas y evitar el consumo de alimentos       " +
                                                  "\n irritantes, también se recomienda el consumo de probióticos para restaurar la flora intestinal y mejorar la        " +
                                                  "\n absorción de nutrientes esenciales. ALIMENTACIÓN. Se recomienda el consumo de alimentos ricos en fibra y probióticos   " +
                                                  "\n para restaurar la flora intestinal, PLÁTANO. Rico en potasio que ayuda a recuperar los electrolitos perdidos, aporta   " +
                                                  "\n aproximadamente el 10% de la ingesta diaria recomendada por cada 100 gramos. YOGURT NATURAL. Contiene probióticos que  " + 
                                                  "\n ayudan a restaurar la flora intestinal, su consumo puede aportar hasta el 20% de la ingesta diaria recomendada de      " +
                                                  "\n probióticos. ZANAHORIA. Rica en vitamina A que ayuda a la regeneración celular intestinal, aporta aproximadamente el   " +
                                                  "\n 56% de la ingesta diaria recomendada por cada 100 gramos. Este es solo un Diagnóstico predeterminado lógico, haberlo   " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén     " +
                                                  "\n correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento  " +
                                                  "\n adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda       " +
                                                  "\n mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACIÓN. Es fundamental mantener una hidratación adecuada para ayudar al cuerpo a eliminar la infección             " +
                                                  "\n y reducir la fiebre, se recomienda el consumo de 2 a 2.5 litros de agua al día, además de infusiones sin azúcar         " +
                                                  "\n como té verde o agua de jamaica para mejorar la circulación, también se recomienda el consumo de agua con miel          " +
                                                  "\n y limón para aliviar la irritación y fortalecer el sistema inmunológico, el consumo de caldos ricos en minerales        " +
                                                  "\n puede ayudar a mejorar la recuperación y fortalecer el sistema digestivo. EJERCICIO. Se recomienda actividad física     " +
                                                  "\n moderada como caminatas, natación o yoga para mejorar la circulación y fortalecer el sistema inmunológico, además       " +
                                                  "\n ejercicios de movilidad pueden ayudar a reducir la inflamación y mejorar la recuperación, es importante realizar        " + 
                                                  "\n ejercicio de manera constante y bajo supervisión médica, ejercicios de respiración profunda pueden ayudar a mejorar     " +
                                                  "\n la oxigenación y reducir el estrés. POSIBLE TRATAMIENTO. El tratamiento suele incluir antibióticos como la ampicilina   " +
                                                  "\n o gentamicina, además pueden recetarse medicamentos complementarios para aliviar los síntomas, también se recomienda    " +
                                                  "\n el uso de probióticos para mejorar la flora intestinal y reducir el riesgo de reinfección, es fundamental seguir las    " +
                                                  "\n indicaciones médicas y evitar el consumo de alimentos contaminados, en casos graves se recomienda acudir al médico      " +
                                                  "\n para evaluar posibles complicaciones neurológicas. ALIMENTACIÓN. Se recomienda el consumo de alimentos ricos en         " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico, ARÁNDANOS. Ricos en antioxidantes que    " +
                                                  "\n ayudan a combatir infecciones, aportan aproximadamente el 25% de la ingesta diaria recomendada por cada 100 gramos.     " +
                                                  "\n AJO. Contiene compuestos antimicrobianos que pueden ayudar a combatir la infección, su consumo puede aportar hasta el   " +
                                                  "\n 20% de la ingesta diaria recomendada de antioxidantes. JENGIBRE. Contiene propiedades antiinflamatorias que pueden      " +
                                                  "\n ayudar a reducir los síntomas, su consumo puede aportar hasta el 15% de la ingesta diaria recomendada de antioxidantes. " +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa    " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un       " +
                                                  "\n Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud   " +
                                                  "\n si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2.5 litros de agua al día (aproximadamente diez      " +
                                                  "\n vasos de agua de tamaño regular) para prevenir la deshidratación causada por diarrea intensa. También se          " +
                                                  "\n recomienda el consumo de suero oral y bebidas con electrolitos para evitar la pérdida excesiva de minerales       " +
                                                  "\n esenciales. EJERCICIO: Se recomienda reposo absoluto mientras persistan los síntomas, evitando cualquier          " +
                                                  "\n actividad física intensa. Una vez recuperada, se pueden realizar ejercicios de bajo impacto como caminatas        " +
                                                  "\n suaves y estiramientos para mejorar la circulación y fortalecer el sistema digestivo. POSIBLE TRATAMIENTO:        " +
                                                  "\n El tratamiento para la shigelosis suele incluir antibióticos como ciprofloxacino o azitromicina en casos          " +
                                                  "\n graves. También se recomienda el consumo de alimentos ricos en fibra para ayudar a regular el tránsito            " +
                                                  "\n intestinal y mejorar la digestión. ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema digestivo y ayudar        " +
                                                  "\n en la recuperación, se recomienda el consumo de PLÁTANO, rico en POTASIO, que ayuda a reponer electrolitos        " +
                                                  "\n perdidos, aportando aproximadamente el 12% del requerimiento diario por cada 100 g. ARROZ BLANCO, fuente de       " +
                                                  "\n CARBOHIDRATOS de fácil digestión, que ayuda a estabilizar el sistema digestivo. MANZANA, rica en PECTINA, que     " +
                                                  "\n contribuye a la regulación intestinal y aporta cerca del 10% del requerimiento diario de FIBRA por cada 100 g.    " +
                                                  "\n ZANAHORIA, fuente de VITAMINA A, que ayuda a la regeneración celular y aporta aproximadamente el 89% del          " +
                                                  "\n requerimiento diario por cada 100 g. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no     " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se    " +
                                                  "\n recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud,  " +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al día (aproximadamente        " +
                                                  "\n ocho a diez vasos de agua de tamaño regular) para mantener la hidratación de las vías respiratorias y reducir      " +
                                                  "\n la acumulación de mucosidad. También se recomienda el consumo de líquidos tibios como té de jengibre o caldos      " +
                                                  "\n naturales para mejorar la función pulmonar. EJERCICIO: Se recomienda actividad física moderada, como caminatas     " +
                                                  "\n diarias de 30 a 60 minutos, ejercicios de respiración y fortalecimiento pulmonar. Evitar la exposición a           " +
                                                  "\n contaminantes y humo de tabaco es crucial para prevenir exacerbaciones. POSIBLE TRATAMIENTO: El tratamiento para   " +
                                                  "\n la EPOC suele incluir broncodilatadores de acción rápida y prolongada, como el salbutamol y corticosteroides       " +
                                                  "\n inhalados como la fluticasona. En casos avanzados, puede requerirse oxigenoterapia y rehabilitación pulmonar.      " +
                                                  "\n ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema respiratorio y reducir la inflamación, se recomienda el       " +
                                                  "\n consumo de PESCADOS GRASOS como salmón y atún, ricos en ÁCIDOS GRASOS OMEGA-3, que poseen propiedades antiinflamatorias" +
                                                  "\n y aportan aproximadamente el 50% del requerimiento diario por cada 100 g. FRUTAS CÍTRICAS como naranja y toronja,      " +
                                                  "\n ricas en VITAMINA C, que fortalece el sistema inmune y aporta cerca del 89% del requerimiento diario por cada 100 g.   " +
                                                  "\n ESPINACA, fuente de HIERRO y ANTIOXIDANTES, que ayudan a mejorar la oxigenación celular y aportan aproximadamente el   " +
                                                  "\n 15% del requerimiento diario de HIERRO por cada 100 g. JENGIBRE, con propiedades ANTIINFLAMATORIAS y antioxidantes,    " +
                                                  "\n que pueden aliviar síntomas respiratorios y mejorar la función pulmonar. Este es solo un diagnóstico predeterminado    " +
                                                  "\n lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean       " +
                                                  "\n completamente correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. " +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.   " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de al menos 2 litros de agua al día (aproximadamente ocho vasos de          " +
                                                  "\n agua de tamaño regular) para ayudar al cuerpo a eliminar la bacteria y prevenir la deshidratación causada         " +
                                                  "\n por fiebre y malestar. También es recomendable el consumo de líquidos ricos en electrolitos como agua de          " +
                                                  "\n coco o caldos naturales para mejorar la recuperación. EJERCICIO: Se recomienda reposo moderado mientras           " +
                                                  "\n persistan los síntomas, evitando esfuerzos físicos intensos. Sin embargo, una vez recuperada, se pueden           " +
                                                  "\n realizar ejercicios de bajo impacto como yoga o estiramientos suaves para mejorar la circulación y fortalecer     " +
                                                  "\n el sistema inmunológico. POSIBLE TRATAMIENTO: El tratamiento para la clamidia suele incluir antibióticos como     " +
                                                  "\n azitromicina o doxiciclina. Es fundamental completar el tratamiento indicado por el médico para evitar            " +
                                                  "\n complicaciones y recurrencias. ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema inmunológico y ayudar en      " +
                                                  "\n la recuperación, se recomienda el consumo de YOGUR NATURAL, rico en PROBIÓTICOS, que favorecen la recuperación    " +
                                                  "\n intestinal y aportan aproximadamente 10^9 UFC por cada 100 g. AJO, con propiedades ANTIBACTERIANAS, que pueden    " +
                                                  "\n ayudar a combatir la infección y aporta compuestos bioactivos como alicina. ESPINACA, fuente de VITAMINA C y      " +
                                                  "\n HIERRO, que fortalece el sistema inmune y aporta cerca del 15% del requerimiento diario de HIERRO por cada 100 g. " +
                                                  "\n FRUTOS ROJOS, ricos en ANTIOXIDANTES, que ayudan a reducir la inflamación y aportan aproximadamente el 50% del    " +
                                                  "\n requerimiento diario de VITAMINA C por cada 100 g. Este es solo un diagnóstico predeterminado lógico. Haberlo     " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente    " +
                                                  "\n correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además,  " +
                                                  "\n por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.      " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2.5 a 3 litros de agua al día, ya que una hidratación adecuada           " +
                                                  "\n ayuda a mantener el equilibrio del sistema nervioso y reducir la inflamación de las meninges. También es          " +
                                                  "\n beneficioso complementar con infusiones naturales como té de manzanilla o jengibre, que poseen propiedades        " +
                                                  "\n antiinflamatorias y relajantes. EJERCICIO. La actividad física moderada es clave para fortalecer el sistema       " +
                                                  "\n inmunológico y mejorar la circulación sanguínea. Se recomienda realizar ejercicio aeróbico moderado al menos      " +
                                                  "\n 30 minutos al día, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo. También es beneficioso    " +
                                                  "\n incluir ejercicios de respiración como yoga o técnicas de expansión pulmonar para mejorar la oxigenación          " +
                                                  "\n cerebral. POSIBLE TRATAMIENTO. El tratamiento estándar incluye antibióticos como ceftriaxona, vancomicina         " +
                                                  "\n y ampicilina, que ayudan a eliminar la bacteria causante de la meningitis. En casos graves, se puede requerir     " +
                                                  "\n hospitalización para administración intravenosa de antibióticos y monitoreo de síntomas. También es importante    " +
                                                  "\n el uso de antiinflamatorios y analgésicos para reducir el dolor y la fiebre. ALIMENTACIÓN. Para fortalecer el     " +
                                                  "\n sistema inmunológico y reducir la inflamación, se recomienda consumir frutas cítricas como naranja, limón y          " +
                                                  "\n toronja, que son ricas en vitamina C, la cual contribuye a la producción de glóbulos blancos y mejora la respuesta   " +
                                                  "\n inmune. Verduras crucíferas como brócoli y coliflor, que contienen vitamina K y antioxidantes, esenciales para la    " +
                                                  "\n regeneración celular y la protección del sistema nervioso. Pescados grasos como salmón y sardina, que son ricos en   " +
                                                  "\n Omega-3, el cual tiene propiedades antiinflamatorias. Legumbres como lentejas y garbanzos, que son fuente de         " +
                                                  "\n proteínas y hierro, esenciales para la energía y la regeneración celular. Este es solo un diagnóstico predeterminado " +
                                                  "\n lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean     " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico especialista. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2.5 a 3 litros de agua al día, ya que una hidratación adecuada ayuda a       " +
                                                  "\n mantener el equilibrio celular y mejorar la eliminación de toxinas. También es beneficioso complementar con           " +
                                                  "\n infusiones naturales como té verde o cúrcuma, que poseen propiedades antioxidantes y anticancerígenas. EJERCICIO.     " +
                                                  "\n La actividad física moderada es clave para fortalecer el sistema inmunológico y mejorar la salud cardiovascular.      " +
                                                  "\n Se recomienda realizar ejercicio aeróbico moderado al menos 30 minutos al día, como caminar, nadar o andar en         " +
                                                  "\n bicicleta, evitando el sobreesfuerzo. También es beneficioso incluir ejercicios de resistencia como levantamiento     " +
                                                  "\n de pesas ligeras o yoga, que ayudan a mantener la masa muscular y reducir el estrés. POSIBLE TRATAMIENTO. El          " +
                                                  "\n tratamiento estándar incluye quimioterapia, radioterapia y terapia dirigida, dependiendo del tipo y estadio del       " +
                                                  "\n cáncer. En algunos casos, se puede recurrir a inmunoterapia, que ayuda al sistema inmunológico a combatir las         " +
                                                  "\n células cancerosas. Marcas reconocidas incluyen Herceptin, Avastin, Keytruda y Opdivo. También es importante el       " +
                                                  "\n uso de suplementos nutricionales para mantener la energía y reducir los efectos secundarios del tratamiento.          " +
                                                  "\n ALIMENTACIÓN. Para fortalecer el sistema inmunológico y reducir la inflamación, se recomienda consumir frutas         " +
                                                  "\n cítricas como naranja, limón y toronja, que son ricas en vitamina C, la cual contribuye a la producción de glóbulos   " +
                                                  "\n blancos y mejora la respuesta inmune. Verduras de hoja verde como espinaca y kale, que contienen ácido fólico y       " +
                                                  "\n antioxidantes, esenciales para la regeneración celular y la protección contra el daño oxidativo. Pescados grasos      " +
                                                  "\n como salmón y atún, que son ricos en Omega-3, el cual tiene propiedades antiinflamatorias. Frutos secos como almendras  " +
                                                  "\n y nueces, que aportan vitamina E, la cual protege las células del daño oxidativo. Legumbres como lentejas y garbanzos,  " +
                                                  "\n que son fuente de proteínas y hierro, esenciales para la energía y la regeneración celular. Este es solo un diagnóstico " +
                                                  "\n predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las    " +
                                                  "\n respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un  " +
                                                  "\n médico especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.50-1.75 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACIÓN Para el tratamiento de la influenza es fundamental mantener una hidratación adecuada con un consumo   " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a la      " +
                                                  "\n recuperación y prevenir la deshidratación causada por la fiebre EJERCICIO Se recomienda ejercicio moderado como   " +
                                                  "\n caminatas suaves o yoga evitando esfuerzos intensos mientras persistan los síntomas POSIBLE TRATAMIENTO El        " +
                                                  "\n tratamiento suele incluir medicamentos para reducir la fiebre y aliviar los síntomas como el paracetamol marca    " +
                                                  "\n común Tempra o el ibuprofeno En casos más severos los médicos pueden recetar antivirales específicos contra la    " +
                                                  "\n gripe como el oseltamivir marca común Tamiflu Es importante seguir las indicaciones médicas y evitar el uso de    " +
                                                  "\n aspirina ya que puede generar complicaciones en algunos casos ALIMENTOS RECOMENDADOS Para fortalecer el sistema   " +
                                                  "\n inmunológico y acelerar la recuperación se recomienda el consumo de NARANJAS Y GUAYABAS Ricas en vitamina C que   " +
                                                  "\n ayuda a reducir la duración de los síntomas aportando aproximadamente el 89% de la ingesta diaria recomendada por " +
                                                  "\n cada 100 gramos JENGIBRE Contiene compuestos con propiedades antiinflamatorias y puede aliviar la congestión      " +
                                                  "\n además de aportar antioxidantes esenciales MIEL Y LIMÓN Combinación efectiva para calmar la garganta y reducir la " +
                                                  "\n tos aportando flavonoides y vitamina C ESPINACAS Y BRÓCOLI Aportan antioxidantes y vitamina A esenciales para la  " +
                                                  "\n regeneración celular con un contenido de aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos " +
                                                  "\n YOGUR NATURAL Contiene probióticos que pueden fortalecer el sistema inmunológico y mejorar la salud digestiva     " +
                                                  "\n aportando calcio y proteínas esenciales Este es solo un diagnóstico predeterminado lógico haberlo consultado no   " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para      " +
                                                  "\n ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado " +
                                                  "\n de su paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho   " +
                                                  "\n consultar a su médico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n HIDRATACIÓN Para el tratamiento de la neumonía es fundamental mantener una hidratación adecuada con               " +
                                                  "\n un consumo diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular            " +
                                                  "\n para ayudar a la recuperación y prevenir la deshidratación causada por la fiebre EJERCICIO Se recomienda          " +
                                                  "\n actividad física moderada como caminatas suaves evitando esfuerzos intensos mientras persistan los                " +
                                                  "\n síntomas Una vez superada la fase aguda es recomendable realizar ejercicios de respiración profunda y             " +
                                                  "\n expansión pulmonar como técnicas de fisioterapia respiratoria para mejorar la capacidad pulmonar y reducir        " +
                                                  "\n la sensación de fatiga POSIBLE TRATAMIENTO El tratamiento suele incluir antibióticos como la amoxicilina          " +
                                                  "\n la azitromicina o la ceftriaxona en casos más severos los médicos pueden recetar antivirales como el              " +
                                                  "\n oseltamivir además de medicamentos para reducir la fiebre como el paracetamol o el ibuprofeno Es importante       " +
                                                  "\n seguir las indicaciones médicas y evitar la automedicación ALIMENTOS RECOMENDADOS Para fortalecer el sistema      " +
                                                  "\n inmunológico y acelerar la recuperación se recomienda el consumo de NARANJAS Y GUAYABAS Ricas en vitamina C       " +
                                                  "\n que ayuda a reducir la duración de los síntomas aportando aproximadamente el 89% de la ingesta diaria             " +
                                                  "\n recomendada por cada 100 gramos JENGIBRE Contiene compuestos con propiedades antiinflamatorias y puede aliviar    " +
                                                  "\n la congestión además de aportar antioxidantes esenciales ESPINACAS Y BRÓCOLI Aportan antioxidantes y vitamina A   " +
                                                  "\n esenciales para la regeneración celular con un contenido de aproximadamente 56% de la ingesta diaria recomendada  " +
                                                  "\n por cada 100 gramos YOGUR NATURAL Contiene probióticos que pueden fortalecer el sistema inmunológico y mejorar    " +
                                                  "\n la salud digestiva aportando calcio y proteínas esenciales Este es solo un diagnóstico predeterminado lógico      " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean          " +
                                                  "\n completamente correctas para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor      " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente además por su salud si la respuesta del Diagnóstico no le     " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico Angel L Montes agradece tu visita a la app Mi     " +
                                                  "\n Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACIÓN Para el tratamiento de la diabetes es fundamental mantener una hidratación adecuada con un consumo          " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a la            " +
                                                  "\n regulación de la glucosa en sangre y prevenir la deshidratación EJERCICIO Se recomienda actividad física regular        " +
                                                  "\n como caminatas natación o ejercicios de resistencia para mejorar la sensibilidad a la insulina y controlar los          " +
                                                  "\n niveles de glucosa en sangre Además se recomienda la práctica de ejercicios aeróbicos como ciclismo o baile al          " +
                                                  "\n menos 150 minutos por semana para mejorar la función cardiovascular y reducir el riesgo de complicaciones POSIBLE       " +
                                                  "\n TRATAMIENTO El tratamiento suele incluir medicamentos como la metformina para mejorar la sensibilidad a la insulina     " +
                                                  "\n en casos más severos los médicos pueden recetar insulina de acción rápida o prolongada además de medicamentos para      " +
                                                  "\n controlar la presión arterial y el colesterol Es importante seguir las indicaciones médicas y mantener un monitoreo     " +
                                                  "\n constante de los niveles de glucosa ALIMENTOS RECOMENDADOS Para fortalecer el metabolismo y mejorar el control de la    " +  
                                                  "\n glucosa se recomienda el consumo de FRUTOS ROJOS Ricos en antioxidantes y fibra que ayudan a regular la glucosa en      " +
                                                  "\n sangre aportando aproximadamente el 32% de la ingesta diaria recomendada por cada 100 gramos FRUTOS SECOS Contienen     " +
                                                  "\n grasas saludables y fibra que pueden mejorar la sensibilidad a la insulina aportando aproximadamente el 25% de la       " +
                                                  "\n ingesta diaria recomendada por cada 100 gramos ESPINACAS Y BRÓCOLI Aportan antioxidantes y vitamina A esenciales para   " +
                                                  "\n la regeneración celular con un contenido de aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos    " +
                                                  "\n AVENA Rica en fibra soluble que ayuda a estabilizar los niveles de glucosa en sangre aportando aproximadamente el 40%   " +
                                                  "\n de la ingesta diaria recomendada por cada 100 gramos Este es solo un diagnóstico predeterminado lógico haberlo          " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas  " +
                                                  "\n para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado " +
                                                  "\n de su paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho   " +
                                                  "\n consultar a su médico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN Para el tratamiento del asma es fundamental mantener una hidratación adecuada con un consumo diario       " +
                                                  "\n recomendado de 1.5 a 2 litros de agua aproximadamente 6 a 8 vasos de tamaño regular para ayudar a mantener las        " +
                                                  "\n vías respiratorias hidratadas y reducir la inflamación EJERCICIO Se recomienda actividad física de forma controlada   " + 
                                                  "\n y supervisada con calentamiento previo y enfriamiento posterior evitando desencadenantes conocidos del asma como      " +
                                                  "\n alérgenos aire frío o contaminado y pausas si presenta síntomas Además se recomienda la práctica de ejercicios de     " +
                                                  "\n respiración profunda como técnicas de relajación y yoga para mejorar la capacidad pulmonar y reducir la sensación     " +
                                                  "\n de opresión en el pecho POSIBLE TRATAMIENTO El tratamiento suele incluir broncodilatadores de alivio rápido como      " +
                                                  "\n el salbutamol marca común Ventolin o Aerolin corticosteroides inhalados para el control a largo plazo como la         " +
                                                  "\n fluticasona o budesonida marcas comunes Flixotide o Pulmicort y en algunos casos modificadores de leucotrienos como   " +
                                                  "\n el montelukast marca común Singulair Es fundamental seguir estrictamente el plan de acción para el asma indicado por  " +
                                                  "\n el médico y usar los medicamentos preventivos regularmente ALIMENTOS RECOMENDADOS Para fortalecer el sistema          " +
                                                  "\n respiratorio y reducir la inflamación se recomienda el consumo de PESCADOS GRASOS Salmón y atún ricos en ácidos       " +
                                                  "\n grasos Omega-3 que poseen propiedades antiinflamatorias que pueden ayudar a reducir la inflamación de las vías        " +
                                                  "\n respiratorias aportando aproximadamente el 50% de la ingesta diaria recomendada por cada 100 gramos FRUTAS Y VERDURAS " +
                                                  "\n DE COLORES VIVOS Arándanos fresas espinacas brócoli ricos en antioxidantes como la vitamina C y carotenoides que      " +
                                                  "\n pueden proteger las células del daño y fortalecer el sistema inmunológico aportando aproximadamente el 70% de la      " +
                                                  "\n ingesta diaria recomendada por cada 100 gramos JENGIBRE Contiene compuestos con efectos antiinflamatorios que podrían " +
                                                  "\n ser beneficiosos para las vías respiratorias CÚRCUMA Con su componente activo la curcumina también tiene potentes     " +
                                                  "\n propiedades antiinflamatorias y antioxidantes Este es solo un diagnóstico predeterminado lógico haberlo consultado    " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para    " +
                                                  "\n ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado  " +
                                                  "\n de su paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho    " +
                                                  "\n consultar a su médico Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente mantenga una hidratación adecuada, consumiendo al menos 2 a 2.5              " +
                                                  "\n litros de agua al día (aproximadamente ocho a diez vasos de agua de tamaño regular) para ayudar a la función             " +
                                                  "\n renal y la eliminación de toxinas. EJERCICIO: Se recomienda actividad física moderada como caminatas, yoga o             " +
                                                  "\n entrenamiento de resistencia, adaptado a su estado de salud y bajo supervisión médica, evitando el sobreesfuerzo.        " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento estándar incluye terapia antirretroviral (TAR), que combina varios medicamentos      " +
                                                  "\n para suprimir la replicación del virus y mejorar la calidad de vida. Algunos fármacos comunes incluyen Tenofovir,        " +
                                                  "\n Emtricitabina, Efavirenz (marca Atripla), Dolutegravir (marca Tivicay) y Lamivudina (marca Epivir). Es crucial seguir    " +
                                                  "\n estrictamente el tratamiento indicado por el médico y realizar controles periódicos. ALIMENTACIÓN: Se recomienda el      " +
                                                  "\n consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como: NARANJAS     " +
                                                  "\n (ricas en vitamina C, que fortalece el sistema inmune, aportando aproximadamente 89% del requerimiento diario por cada   " +
                                                  "\n 100 g); AGUACATE (fuente de grasas saludables y antioxidantes, con 14% de la ingesta diaria recomendada de vitamina E    " +
                                                  "\n por cada 100 g); PESCADOS GRASOS (salmón, atún, ricos en Omega-3, que pueden ayudar a reducir la inflamación, aportando  " +
                                                  "\n cerca de 50% de la ingesta diaria recomendada por cada porción de 100 g); VERDURAS DE HOJA VERDE (espinacas, kale, con   " +
                                                  "\n vitamina A y hierro, esenciales para la salud celular, aportando 56% de la ingesta diaria recomendada de vitamina A por  " +
                                                  "\n cada 100 g); LEGUMBRES (frijoles, lentejas, que aportan proteínas y fibra, con 37% de la ingesta diaria recomendada de   " +
                                                  "\n hierro por cada 100 g). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que   " +
                                                  "\n la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar  " +
                                                  "\n más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Además, por su salud, si la " +
                                                  "\n respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu      " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2 a 2.5 litros de agua al día (aproximadamente ocho a diez vasos       " +
                                                  "\n de agua de tamaño regular) para ayudar a la eliminación de toxinas y mantener la función renal óptima.          " +
                                                  "\n Mantener una hidratación adecuada también contribuye a la regulación de la temperatura corporal y al            " +
                                                  "\n transporte eficiente de nutrientes esenciales para la recuperación. EJERCICIO: Actividad física moderada        " +
                                                  "\n como caminatas o ejercicios de bajo impacto es recomendable para fortalecer el sistema inmunológico y mejorar   " +
                                                  "\n la circulación, evitando el sobreesfuerzo. El ejercicio regular ayuda a reducir el estrés, lo que puede mejorar    " +
                                                  "\n la respuesta del sistema inmune y acelerar la recuperación. POSIBLE TRATAMIENTO: El tratamiento estándar incluye   " +
                                                  "\n antibióticos como Ceftriaxona (inyección única) y Azitromicina (dosis oral), los cuales ayudan a eliminar la       " +
                                                  "\n bacteria Neisseria gonorrhoeae. Es fundamental completar el tratamiento indicado por el médico para evitar la      " +
                                                  "\n resistencia bacteriana y prevenir complicaciones como la enfermedad inflamatoria pélvica. ALIMENTACIÓN: Se         " +
                                                  "\n recomienda el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación,      " +
                                                  "\n tales como: Naranjas (ricas en vitamina C, que fortalece el sistema inmune, aportando aproximadamente 89% del      " +
                                                  "\n requerimiento diario por cada 100 g); Espinacas (fuente de hierro, esencial para la producción de glóbulos rojos,  " +
                                                  "\n con 56% de la ingesta diaria recomendada por cada 100 g); Yogur natural (rico en probióticos, que favorecen la salud  " +
                                                  "\n intestinal y el sistema inmune, aportando 30% de la ingesta diaria recomendada de calcio por cada 100 g). Este es     " +
                                                  "\n solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta         " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico" +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del  " +
                                                  "\n diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2 litros de agua al día (aproximadamente ocho vasos de agua de tamaño    " +
                                                  "\n regular) para ayudar a mantener la piel hidratada y reducir la inflamación. La hidratación adecuada también       " +
                                                  "\n contribuye a la regeneración celular y a la eliminación de toxinas, lo que puede ayudar a reducir la frecuencia   " +
                                                  "\n y severidad de los brotes. EJERCICIO: Actividad física moderada como yoga o ejercicios de relajación pueden       " +
                                                  "\n ayudar a reducir el estrés, que es un factor desencadenante de brotes de herpes. La práctica de ejercicios de     " +
                                                  "\n respiración y meditación también puede mejorar la respuesta del sistema inmunológico y reducir la inflamación.    " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento estándar incluye antivirales como Aciclovir, Valaciclovir y Famciclovir,      " + 
                                                  "\n los cuales ayudan a reducir la duración y severidad de los brotes. Es importante iniciar el tratamiento lo antes  " +
                                                  "\n posible para minimizar los síntomas y reducir el riesgo de transmisión. ALIMENTACIÓN: Se recomienda el consumo    " +
                                                  "\n de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como: Kiwi (rico en " +
                                                  "\n vitamina C, que fortalece el sistema inmune, aportando aproximadamente 92% del requerimiento diario por cada      " +
                                                  "\n 100 g); Almendras (fuente de L-lisina, un aminoácido que puede ayudar a reducir la replicación del virus, con 25%     " +
                                                  "\n de la ingesta diaria recomendada por cada 100 g); Jengibre (contiene compuestos con efectos antiinflamatorios,        " +
                                                  "\n que pueden ser beneficiosos para la piel y el sistema inmune). Este es solo un diagnóstico predeterminado lógico,     " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente" +
                                                  "\n correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en      " +
                                                  "\n el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda" +
                                                  "\n consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 litros de agua al día (aproximadamente diez vasos de agua de tamaño          " +
                                                  "\n regular) para ayudar a la eliminación de toxinas y mejorar la circulación sanguínea. La hidratación adecuada también      " +
                                                  "\n contribuye a la función hepática y renal, lo que facilita la eliminación de bacterias y toxinas del cuerpo. EJERCICIO:    " +
                                                  "\n Actividad física moderada como caminatas o ejercicios de bajo impacto es recomendable para fortalecer el sistema          " +
                                                  "\n inmunológico y mejorar la circulación. El ejercicio también puede ayudar a reducir la fatiga y mejorar la función         " +
                                                  "\n cardiovascular, lo que es esencial para la recuperación. POSIBLE TRATAMIENTO: El tratamiento estándar incluye antibióticos" +
                                                  "\n como Penicilina G Benzatina (inyección única) y Doxiciclina (alternativa para personas alérgicas a la penicilina). Es     " +
                                                  "\n fundamental seguir el tratamiento completo para evitar complicaciones graves como la neurosífilis. ALIMENTACIÓN: Se       " +
                                                  "\n recomienda el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como: " +
                                                  "\n Plátanos (ricos en potasio, que ayuda a la función cardiovascular y muscular, aportando aproximadamente 23% del           " +
                                                  "\n requerimiento diario por cada 100 g); Brócoli (fuente de vitamina C, que fortalece el sistema inmune, con 135% de la        " +
                                                  "\n ingesta diaria recomendada por cada 100 g); Lentejas (ricas en hierro, esencial para la producción de glóbulos rojos, con   " +
                                                  "\n 37% de la ingesta diaria recomendada por cada 100 g). Este es solo un diagnóstico predeterminado lógico, haberlo consultado " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello,   " +
                                                  "\n se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Además, " +
                                                  "\n por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Para una mujer adulta con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidratación          " +
                                                  "\n óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se               " +
                                                  "\n recomienda actividad física moderada, como caminatas diarias de 30 minutos, yoga o ejercicios de respiración para          " +
                                                  "\n fortalecer los pulmones. Es importante evitar esfuerzos excesivos y asegurarse de que el entorno esté bien ventilado.      " +
                                                  "\n HIDRATACIÓN. Se aconseja consumir al menos 2 a 2.5 litros de agua al día para mantener una buena hidratación y ayudar      " +
                                                  "\n a eliminar toxinas del cuerpo. POSIBLE TRATAMIENTO. El tratamiento estándar para la tuberculosis incluye una combinación   " +
                                                  "\n de antibióticos como isoniazida, rifampicina, etambutol y pirazinamida. Marcas reconocidas de estos medicamentos           " +  
                                                  "\n incluyen Rifater y Rimactane. Es crucial seguir el tratamiento completo para evitar resistencia a los antibióticos.        " +
                                                  "\n ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica en proteínas, vitaminas y minerales para fortalecer el sistema      " +
                                                  "\n inmunológico. Algunos alimentos clave incluyen carnes magras y pescado que aportan proteínas esenciales para la            " + 
                                                  "\n regeneración celular y fortalecimiento del sistema inmunológico. Frutas cítricas como naranja, limón y kiwi, ricas en      " +
                                                  "\n vitamina C, que ayuda a la recuperación y fortalecimiento del sistema inmune, aportando aproximadamente el 89% del         " +
                                                  "\n requerimiento diario por cada 100 gramos de consumo. Verduras de hoja verde como espinaca y brócoli, que contienen hierro  " +
                                                  "\n y antioxidantes esenciales para la producción de glóbulos rojos y la oxigenación celular, aportando cerca del 15% del      " +
                                                  "\n requerimiento diario por cada 100 gramos. Frutos secos y semillas como almendras, nueces y chía, que contienen vitamina E  " +
                                                  "\n y ácidos grasos esenciales, contribuyendo a la protección celular y fortalecimiento del sistema inmunológico, con un       " +
                                                  "\n aporte del 37% del requerimiento diario por cada 28 gramos de consumo. Este diagnóstico es una referencia lógica basada en " +
                                                  "\n información médica, pero no garantiza al 100% que el paciente tenga tuberculosis ni que el tratamiento sea el adecuado.    " +
                                                  "\n Se recomienda realizar más de un diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes agradece tu visita" +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n Para una mujer adulta con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidratación      " +
                                                  "\n óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se           " +
                                                  "\n recomienda actividad física de bajo impacto como natación, yoga o caminatas suaves de 30 minutos al día para mejorar   " +
                                                  "\n la movilidad articular y reducir la inflamación. También es beneficioso realizar ejercicios de fortalecimiento         " +
                                                  "\n muscular con bandas de resistencia o pesas ligeras, ya que ayudan a estabilizar las articulaciones y prevenir el       " +
                                                  "\n deterioro óseo. Además, el ejercicio aeróbico moderado, como el ciclismo o la elíptica, puede mejorar la circulación   " +
                                                  "\n y reducir la rigidez matutina. HIDRATACIÓN. Se aconseja consumir al menos 2 litros de agua al día para mantener la     " +
                                                  "\n lubricación de las articulaciones y reducir la rigidez. Además, el té verde es una excelente opción, ya que contiene   " +
                                                  "\n polifenoles con propiedades antiinflamatorias que pueden ayudar a reducir el dolor articular. También se recomienda    " +
                                                  "\n el consumo de caldos naturales y jugos de frutas sin azúcar añadida para mantener el equilibrio de electrolitos y      " +
                                                  "\n mejorar la absorción de nutrientes esenciales. POSIBLE TRATAMIENTO. El tratamiento para la artritis incluye            " +
                                                  "\n medicamentos antiinflamatorios no esteroides como ibuprofeno y naproxeno, además de fármacos modificadores de          " +
                                                  "\n la enfermedad como metotrexato y sulfasalazina. También se pueden utilizar terapias biológicas como los inhibidores    " +
                                                  "\n del factor de necrosis tumoral (TNF), que han demostrado ser eficaces en el control de la inflamación crónica.         " +
                                                  "\n En algunos casos, se recomienda la fisioterapia para mejorar la movilidad y reducir el dolor. Marcas reconocidas       " +
                                                  "\n incluyen Advil, Aleve y Arava. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica en antioxidantes y ácidos        " +
                                                  "\n grasos esenciales. Algunos alimentos clave incluyen pescados grasos como salmón y atún, ricos en omega-3, que ayudan   " +
                                                  "\n a reducir la inflamación, aportando aproximadamente el 70% del requerimiento diario por cada 100 gramos de consumo.    " +
                                                  "\n Frutas cítricas como naranja y kiwi, ricas en vitamina C, que contribuyen a la producción de colágeno y fortalecen     " +
                                                  "\n el sistema inmunológico, con un aporte del 89% del requerimiento diario por cada 100 gramos. Verduras de hoja verde    " +
                                                  "\n como espinaca y brócoli, que contienen hierro y antioxidantes esenciales para la producción de glóbulos rojos y la     " +
                                                  "\n oxigenación celular, aportando cerca del 15% del requerimiento diario por cada 100 gramos. Frutos secos y semillas     " +
                                                  "\n como almendras y nueces, que contienen vitamina E y ácidos grasos esenciales, contribuyendo a la protección celular    " +
                                                  "\n y fortalecimiento del sistema inmunológico, con un aporte del 37% del requerimiento diario por cada 28 gramos de       " +
                                                  "\n consumo. Este diagnóstico es una referencia lógica basada en información médica, pero no garantiza al 100% que el      " +
                                                  "\n paciente tenga artritis ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar" +
                                                  "\n a un médico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Para una mujer adulta con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una                   " +
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales.              " +
                                                  "\n EJERCICIO. Se recomienda actividad física ligera como caminatas cortas y ejercicios de respiración para                 " +
                                                  "\n fortalecer los pulmones sin generar fatiga excesiva. También es recomendable realizar ejercicios de expansión           " +
                                                  "\n torácica y técnicas de respiración profunda para mejorar la capacidad pulmonar y reducir la sensación de ahogo.         " +
                                                  "\n Además, el uso de técnicas de relajación como la meditación y el control de la respiración puede ayudar a               " +
                                                  "\n reducir la ansiedad provocada por la dificultad respiratoria. HIDRATACIÓN. Se aconseja consumir al menos 2.5            " +
                                                  "\n litros de agua al día para mantener las vías respiratorias hidratadas y facilitar la eliminación de mucosidad.          " +
                                                  "\n Además, el consumo de líquidos tibios como infusiones de jengibre y miel puede ayudar a calmar la irritación de         " +
                                                  "\n garganta y mejorar la expectoración. También se recomienda el consumo de caldos naturales y jugos cítricos para         " +
                                                  "\n mantener el equilibrio de electrolitos y fortalecer el sistema inmunológico. POSIBLE TRATAMIENTO. El tratamiento        " +
                                                  "\n para la tosferina incluye antibióticos como azitromicina, claritromicina y eritromicina. También se recomienda el       " +
                                                  "\n uso de broncodilatadores en casos de dificultad respiratoria severa. En algunos casos, los médicos pueden indicar       " +
                                                  "\n el uso de corticosteroides para reducir la inflamación de las vías respiratorias. Marcas reconocidas incluyen           " +
                                                  "\n Zithromax, Biaxin y Erythrocin. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica en vitaminas y antioxidantes     " +
                                                  "\n para fortalecer el sistema inmunológico. Algunos alimentos clave incluyen frutas cítricas como naranja y limón,         " +
                                                  "\n ricas en vitamina C, que ayudan a la recuperación y fortalecimiento del sistema inmune, aportando aproximadamente el    " +
                                                  "\n 89% del requerimiento diario por cada 100 gramos de consumo. Verduras como zanahoria y espinaca, ricas en vitamina A,   " +
                                                  "\n que contribuyen a la salud respiratoria y fortalecen las mucosas, con un aporte del 15% del requerimiento diario por    " +
                                                  "\n cada 100 gramos. Miel, que posee propiedades antibacterianas y ayuda a calmar la irritación de garganta, proporcionando " +
                                                  "\n alivio inmediato. Jengibre, con efectos antiinflamatorios que pueden ayudar a reducir la congestión y mejorar la        " +
                                                  "\n respiración. Este diagnóstico es una referencia lógica basada en información médica, pero no garantiza al 100% que      " +
                                                  "\n el paciente tenga tosferina ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y       " +
                                                  "\n consultar a un médico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Para una mujer adulta con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una           " +
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales.      " +
                                                  "\n EJERCICIO. Se recomienda reposo y evitar actividad física intensa hasta la recuperación completa para           " +
                                                  "\n prevenir complicaciones. Sin embargo, ejercicios suaves de movilidad pueden ser beneficiosos para evitar        " +
                                                  "\n la rigidez muscular y mejorar la circulación. También se recomienda realizar ejercicios de estiramiento         " +
                                                  "\n para reducir la tensión muscular y mejorar la recuperación. HIDRATACIÓN. Se aconseja consumir al menos 2        " +
                                                  "\n litros de agua al día para mantener una buena hidratación y aliviar la inflamación de las glándulas             " +
                                                  "\n salivales. También se recomienda el consumo de caldos y jugos naturales para mantener el equilibrio de          " +
                                                  "\n electrolitos. Además, el consumo de bebidas ricas en antioxidantes como el té verde puede ayudar a fortalecer   " +
                                                  "\n el sistema inmunológico. POSIBLE TRATAMIENTO. El tratamiento para las paperas es sintomático e incluye          " +
                                                  "\n analgésicos como paracetamol e ibuprofeno para reducir el dolor y la fiebre. En casos severos, se pueden        " +
                                                  "\n administrar corticosteroides para reducir la inflamación. También se recomienda el uso de compresas frías       " +
                                                  "\n para aliviar la hinchazón de las glándulas salivales. Marcas reconocidas incluyen Tempra y Advil. ALIMENTACIÓN  " +
                                                  "\n RECOMENDADA. Se recomienda una dieta suave y rica en nutrientes esenciales. Algunos alimentos clave incluyen    " +
                                                  "\n yogur y puré de papas, que son fáciles de consumir y ayudan a mantener la energía sin irritar las glándulas     " +
                                                  "\n salivales. Frutas como plátano y mango, ricas en vitamina B6, que contribuyen a la reducción de la inflamación  " +
                                                  "\n y fortalecen el sistema inmunológico, con un aporte del 30% del requerimiento diario por cada 100 gramos.       " +
                                                  "\n Verduras como zanahoria y calabacín, ricas en vitamina A, que ayudan a la regeneración celular y fortalecen las " +
                                                  "\n mucosas, con un aporte del 15% del requerimiento diario por cada 100 gramos. Miel, que posee propiedades        " +
                                                  "\n antibacterianas y ayuda a calmar la irritación de garganta. Este diagnóstico es una referencia lógica basada en   " +
                                                  "\n información médica, pero no garantiza al 100% que el paciente tenga paperas ni que el tratamiento sea el adecuado." +
                                                  "\n Se recomienda realizar más de un diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes         " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n El virus del Zika es transmitido por la picadura del mosquito Aedes aegypti y puede causar síntomas como      " +
                                                  "\n fiebre, conjuntivitis, dolor muscular y erupciones cutáneas. Aunque la enfermedad suele ser leve, es          " +
                                                  "\n importante tomar medidas para aliviar los síntomas y prevenir complicaciones. EJERCICIO. Se recomienda        " +
                                                  "\n actividad física moderada, evitando esfuerzos excesivos si hay fiebre o fatiga. Caminar y ejercicios de       " +
                                                  "\n bajo impacto pueden ser beneficiosos para mantener la circulación y el bienestar general. Es recomendable     " +
                                                  "\n realizar ejercicios de movilidad articular y respiración profunda para mejorar la oxigenación y reducir       " +
                                                  "\n el estrés, lo que puede favorecer la recuperación. También se sugiere evitar la exposición prolongada al      " +
                                                  "\n sol y mantenerse en ambientes frescos para prevenir el agotamiento. HIDRATACIÓN. Es fundamental consumir      " +
                                                  "\n 2 a 2.5 litros de agua al día para ayudar al cuerpo a combatir la infección y mantenerse hidratado. La        " +
                                                  "\n hidratación adecuada contribuye a la regulación de la temperatura corporal, la eliminación de toxinas y       " +
                                                  "\n el mantenimiento de la función celular. Se recomienda complementar la ingesta de agua con líquidos ricos      " +
                                                  "\n en electrolitos como sueros orales o agua de coco, que pueden ayudar a reponer minerales esenciales           " +
                                                  "\n perdidos por la fiebre y sudoración. POSIBLE TRATAMIENTO. No existe un tratamiento antiviral específico       " +
                                                  "\n para el Zika. Se recomienda el uso de paracetamol para aliviar la fiebre y el dolor, evitando el ibuprofeno   " +
                                                  "\n y la aspirina, ya que pueden aumentar el riesgo de sangrado. Además, es importante descansar adecuadamente    " +
                                                  "\n y evitar el estrés para permitir que el sistema inmunológico combata la infección de manera eficiente. Se     " +
                                                  "\n sugiere el uso de compresas frías para reducir la fiebre y aliviar el malestar general. ALIMENTACIÓN RECOMENDADA. " +
                                                  "\n Consumir alimentos ricos en antioxidantes y vitaminas para fortalecer el sistema inmunológico. Frutas cítricas    " +
                                                  "\n como naranja, limón y toronja, ricas en vitamina C, que ayuda a la recuperación, aportando aproximadamente el     " +
                                                  "\n 89% del requerimiento diario por cada 100 g. Papaya, que contiene vitamina A y C, además de enzimas que pueden    " +
                                                  "\n favorecer la digestión y el bienestar general, proporcionando cerca del 75% de la vitamina C diaria por cada      " +
                                                  "\n 100 g. Jengibre, con propiedades antiinflamatorias que pueden ayudar a aliviar síntomas como dolor muscular,      " +
                                                  "\n aportando antioxidantes esenciales. Verduras de hoja verde como espinaca y acelga, que contienen hierro y         " +
                                                  "\n antioxidantes esenciales para la recuperación, proporcionando hasta el 15% del requerimiento diario de hierro     " +
                                                  "\n por cada 100 g. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que    " +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se      " +
                                                  "\n recomienda hacer más de un diagnóstico de (Mi Vida) para establecer mejor seguridad en el tratamiento adecuado    " +
                                                  "\n de su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda     " +
                                                  "\n mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n El rotavirus es una infección viral que causa gastroenteritis, caracterizada por diarrea severa, vómitos,            " +
                                                  "\n fiebre y deshidratación. Aunque suele afectar más a niños, los adultos también pueden padecerlo, especialmente       " +
                                                  "\n si tienen contacto con personas infectadas. EJERCICIO. Se recomienda actividad física ligera mientras persistan      " +
                                                  "\n los síntomas, evitando esfuerzos intensos que puedan agravar la deshidratación. Caminar y realizar estiramientos     " +
                                                  "\n suaves pueden ser beneficiosos para mantener la circulación y el bienestar general. HIDRATACIÓN. Es fundamental      " +
                                                  "\n consumir entre 2.5 y 3 litros de agua al día para compensar la pérdida de líquidos causada por la diarrea y los      " + 
                                                  "\n vómitos. También se recomienda el consumo de soluciones de rehidratación oral que contienen electrolitos esenciales  " +
                                                  "\n como sodio y potasio, ayudando a restablecer el equilibrio hídrico del cuerpo. POSIBLE TRATAMIENTO. No existe un     " +
                                                  "\n tratamiento antiviral específico para el rotavirus. Se recomienda el uso de paracetamol para aliviar la fiebre y     " +
                                                  "\n el malestar, evitando el ibuprofeno y la aspirina, ya que pueden irritar el estómago. En casos graves, puede ser     " +
                                                  "\n necesario el uso de líquidos intravenosos para prevenir la deshidratación severa. ALIMENTACIÓN RECOMENDADA.          " +
                                                  "\n Consumir alimentos de fácil digestión y ricos en nutrientes esenciales para la recuperación. Plátano, rico en        " +
                                                  "\n potasio, que ayuda a reponer los electrolitos perdidos, aportando aproximadamente el 10% del requerimiento diario       " +
                                                  "\n por cada 100 g. Arroz blanco, fuente de carbohidratos de fácil digestión, que contribuye a la recuperación intestinal.  " +
                                                  "\n Zanahoria, rica en vitamina A y antioxidantes, que favorecen la regeneración de la mucosa intestinal, proporcionando    " +
                                                  "\n cerca del 15% del requerimiento diario de vitamina A por cada 100 g. Manzana, con pectina que ayuda a regular el        " +
                                                  "\n tránsito intestinal, aportando fibra soluble beneficiosa para la digestión. Este es solo un diagnóstico predeterminado  " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad       " +
                                                  "\n y sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer        " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no       " +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita a la app          " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria." +
                                                  "\n La listeriosis es una infección bacteriana causada por Listeria monocytogenes, que puede provocar fiebre,          " +
                                                  "\n dolores musculares, náuseas y, en casos graves, afectar el sistema nervioso. EJERCICIO. Se recomienda              " +
                                                  "\n actividad física moderada, evitando esfuerzos excesivos si hay fiebre o fatiga. Caminar y ejercicios de            " +
                                                  "\n bajo impacto pueden ser beneficiosos para mantener la circulación y el bienestar general. También se sugiere       " +
                                                  "\n realizar ejercicios de respiración profunda para mejorar la oxigenación y reducir el estrés. HIDRATACIÓN. Es       " +
                                                  "\n fundamental consumir entre 2 y 2.5 litros de agua al día para ayudar al cuerpo a combatir la infección y           " +
                                                  "\n mantenerse hidratado. Se recomienda complementar la ingesta de agua con líquidos ricos en electrolitos como        " +
                                                  "\n sueros orales o agua de coco, que pueden ayudar a reponer minerales esenciales perdidos por la fiebre y sudoración." +
                                                  "\n POSIBLE TRATAMIENTO. La listeriosis se trata con antibióticos como la ampicilina o el trimetoprima-sulfametoxazol, " +
                                                  "\n que ayudan a eliminar la bacteria. En casos graves, puede ser necesario el uso de antibióticos intravenosos        " +
                                                  "\n para controlar la infección. ALIMENTACIÓN RECOMENDADA. Consumir alimentos ricos en antioxidantes y vitaminas       " +
                                                  "\n para fortalecer el sistema inmunológico. Espinaca, rica en hierro y vitamina K, que favorece la recuperación       " +
                                                  "\n celular, proporcionando hasta el 20% del requerimiento diario de hierro por cada 100 g. Yogur natural, fuente      " +
                                                  "\n de probióticos que ayudan a fortalecer la flora intestinal y mejorar la respuesta inmune. Frutas cítricas como     " +
                                                  "\n naranja y toronja, ricas en vitamina C, que contribuyen a la recuperación, aportando aproximadamente el 89% del    " +
                                                  "\n requerimiento diario por cada 100 g. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no      " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas," +
                                                  "\n para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento " +
                                                  "\n adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le      " +
                                                  "\n recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n La shigelosis es una infección bacteriana causada por Shigella, que provoca diarrea con sangre, fiebre, calambres       " +
                                                  "\n abdominales y deshidratación. EJERCICIO. Se recomienda actividad física ligera mientras persistan los síntomas,         " +
                                                  "\n evitando esfuerzos intensos que puedan agravar la deshidratación. Caminar y realizar estiramientos suaves pueden        " +
                                                  "\n ser beneficiosos para mantener la circulación y el bienestar general. HIDRATACIÓN. Es fundamental consumir entre        " +
                                                  "\n 2.5 y 3 litros de agua al día para compensar la pérdida de líquidos causada por la diarrea. También se recomienda       " +
                                                  "\n el consumo de soluciones de rehidratación oral que contienen electrolitos esenciales como sodio y potasio, ayudando     " +
                                                  "\n a restablecer el equilibrio hídrico del cuerpo. POSIBLE TRATAMIENTO. La shigelosis se trata con antibióticos como       " + 
                                                  "\n ciprofloxacino o azitromicina, que ayudan a eliminar la bacteria. Se recomienda evitar el uso de medicamentos           " +
                                                  "\n antidiarreicos como la loperamida, ya que pueden prolongar la infección. ALIMENTACIÓN RECOMENDADA. Consumir alimentos   " +
                                                  "\n de fácil digestión y ricos en nutrientes esenciales para la recuperación. Plátano, rico en potasio, que ayuda a         " +
                                                  "\n reponer los electrolitos perdidos, aportando aproximadamente el 10% del requerimiento diario por cada 100 g. Arroz      " +
                                                  "\n blanco, fuente de carbohidratos de fácil digestión, que contribuye a la recuperación intestinal. Zanahoria, rica en     " +
                                                  "\n vitamina A y antioxidantes, que favorecen la regeneración de la mucosa intestinal, proporcionando cerca del 15% del     " +
                                                  "\n requerimiento diario de vitamina A por cada 100 g. Manzana, con pectina que ayuda a regular el tránsito intestinal,     " +
                                                  "\n aportando fibra soluble beneficiosa para la digestión. Este es solo un diagnóstico predeterminado lógico, haberlo       " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas      " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en      " +
                                                  "\n el tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo    " +
                                                  "\n se le recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n EJERCICIO: La actividad física es fundamental para mejorar la calidad de vida de las personas con EPOC. Se          " +
                                                  "\n recomienda realizar ejercicios aeróbicos moderados como caminatas diarias de 30 a 45 minutos, natación o            " +
                                                  "\n ciclismo de baja intensidad. También es beneficioso incluir ejercicios de fortalecimiento muscular,                 " +
                                                  "\n especialmente para los músculos respiratorios, como el entrenamiento con pesas ligeras o bandas de resistencia.     " +
                                                  "\n Además, los ejercicios de respiración profunda y técnicas de expansión torácica pueden ayudar a mejorar la          " +
                                                  "\n función pulmonar y reducir la sensación de falta de aire. HIDRATACIÓN: Es crucial el consumo diario de 2 a 2.5      " +
                                                  "\n litros de agua para mantener la hidratación y ayudar a la eliminación de secreciones pulmonares. La hidratación     " +
                                                  "\n adecuada contribuye a la fluidez del moco en los pulmones, facilitando su expulsión y reduciendo la obstrucción     " +
                                                  "\n de las vías respiratorias. También se recomienda el consumo de infusiones con propiedades antiinflamatorias como    " +
                                                  "\n té de jengibre o manzanilla. POSIBLE TRATAMIENTO: Para la EPOC, el tratamiento suele incluir broncodilatadores de        " +
                                                  "\n acción corta y larga como el salbutamol y el tiotropio, corticosteroides inhalados como la fluticasona y en casos        " +
                                                  "\n avanzados, oxigenoterapia. También se recomienda la rehabilitación pulmonar, que incluye técnicas de respiración         " +
                                                  "\n y ejercicios para mejorar la capacidad pulmonar. En algunos casos, el uso de modificadores de leucotrienos como el       " +
                                                  "\n montelukast puede ser beneficioso para reducir la inflamación de las vías respiratorias. ALIMENTACIÓN: Se recomienda     " +
                                                  "\n el consumo de alimentos ricos en antioxidantes y antiinflamatorios, tales como frutas cítricas como naranjas,            " +
                                                  "\n toronjas y limones, que aportan vitamina C en un 89% de la ingesta diaria recomendada, fortaleciendo el sistema          " +
                                                  "\n inmunológico. Pescados grasos como salmón y atún, que contienen ácidos grasos Omega-3 con propiedades antiinflamatorias  " +
                                                  "\n y aportan hasta un 70% de la ingesta diaria recomendada de estos nutrientes. Verduras de hoja verde como espinacas,      " +
                                                  "\n acelgas y brócoli, que contienen antioxidantes y vitaminas esenciales para la función pulmonar, aportando hasta          " +
                                                  "\n un 50% de la ingesta diaria recomendada de vitamina A y K. Jengibre y cúrcuma, que poseen propiedades antiinflamatorias  " +
                                                  "\n y antioxidantes, contribuyendo con hasta un 40% de la ingesta diaria recomendada de compuestos bioactivos beneficiosos   " +
                                                  "\n para la salud respiratoria. este es solo un diagnóstico predeterminado lógico. haberlo consultado no garantiza al 100%   " +
                                                  "\n que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar más     " +
                                                  "\n de un diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico " +
                                                  "\n no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida)      " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n EJERCICIO: No hay una recomendación específica de actividad física para la clamidia, pero mantener un estilo             " +
                                                  "\n de vida activo fortalece el sistema inmunológico y ayuda a la recuperación. Se recomienda ejercicio moderado             " +
                                                  "\n como caminatas diarias de 30 minutos o yoga para reducir el estrés, que puede afectar la respuesta inmune.               " +
                                                  "\n HIDRATACIÓN: Es fundamental consumir al menos 2 litros de agua al día para ayudar a eliminar toxinas y mantener          " +
                                                  "\n el equilibrio de los fluidos corporales. También se recomienda el consumo de infusiones como té verde, que tiene         " +
                                                  "\n propiedades antioxidantes y antibacterianas. POSIBLE TRATAMIENTO: La clamidia se trata con antibióticos como la          " +
                                                  "\n azitromicina en dosis única o la doxiciclina durante 7 días. También pueden utilizarse levofloxacina o amoxicilina       " +
                                                  "\n en ciertos casos. Es esencial que la pareja también reciba tratamiento para evitar reinfecciones. ALIMENTACIÓN: Se       " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico, " +
                                                  "\n tales como frutas cítricas como naranjas y toronjas, que aportan vitamina C en un 89% de la ingesta diaria recomendada,    " +
                                                  "\n ayudando a combatir infecciones. Yogur natural, que contiene probióticos que favorecen la salud intestinal y el equilibrio " + 
                                                  "\n de la flora vaginal. Verduras de hoja verde como espinacas y acelgas, que aportan hasta un 50% de la ingesta diaria        " +
                                                  "\n recomendada de vitamina A y K, esenciales para la regeneración celular. Ajo, que posee propiedades antimicrobianas y       " +
                                                  "\n antioxidantes, contribuyendo con hasta un 40% de la ingesta diaria recomendada de compuestos bioactivos beneficiosos       " +
                                                  "\n para la salud. este es solo un diagnóstico predeterminado lógico. haberlo consultado no garantiza al 100% que la paciente  " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar más de un diagnóstico     " +
                                                  "\n para mayor seguridad en el tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico no le satisface     " +
                                                  "\n del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n EJERCICIO: Durante la recuperación de la meningitis bacteriana, se recomienda evitar esfuerzos físicos intensos        " +
                                                  "\n y priorizar el descanso. Una vez estabilizada la condición, se pueden realizar ejercicios de bajo impacto como         " +
                                                  "\n caminatas suaves o ejercicios de respiración para mejorar la oxigenación cerebral. HIDRATACIÓN: Es crucial el          " +
                                                  "\n consumo de al menos 2.5 litros de agua al día para mantener la hidratación y ayudar a la eliminación de toxinas.       " +
                                                  "\n También se recomienda el consumo de caldos naturales y jugos sin azúcar para aportar electrolitos esenciales.          " +
                                                  "\n POSIBLE TRATAMIENTO: La meningitis bacteriana requiere tratamiento inmediato con antibióticos intravenosos como        " +
                                                  "\n ceftriaxona, cefotaxima o ampicilina, dependiendo del agente causal. También pueden administrarse corticosteroides     " +
                                                  "\n para reducir la inflamación cerebral y medicamentos para controlar síntomas como fiebre y convulsiones. ALIMENTACIÓN:  " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para la recuperación, tales como  " +
                                                  "\n pescado azul como salmón y atún, que contienen ácidos grasos Omega-3 con propiedades antiinflamatorias y aportan       " +
                                                  "\n hasta un 70% de la ingesta diaria recomendada de estos nutrientes. Frutas como fresas y arándanos, que contienen       " +
                                                  "\n antioxidantes y vitamina C en un 89% de la ingesta diaria recomendada, fortaleciendo el sistema inmunológico.          " +
                                                  "\n Verduras como zanahorias y brócoli, que aportan hasta un 50% de la ingesta diaria recomendada de vitamina A y K,       " +
                                                  "\n esenciales para la función cerebral. Frutos secos como almendras y nueces, que contienen vitamina E y magnesio,        " + 
                                                  "\n contribuyendo con hasta un 40% de la ingesta diaria recomendada de estos nutrientes esenciales para la recuperación    " +
                                                  "\n neurológica. este es solo un diagnóstico predeterminado lógico. haberlo consultado no garantiza al 100% que la         " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar más de       " +
                                                  "\n un diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico  " +
                                                  "\n no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida)    " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n EJERCICIO: La actividad física es clave para mejorar la calidad de vida de las personas con cáncer. Se           " +
                                                  "\n recomienda ejercicio moderado como caminatas diarias de 30 a 45 minutos, yoga o ejercicios de resistencia        " +
                                                  "\n para fortalecer los músculos y reducir la fatiga. También es beneficioso realizar ejercicios de respiración      " +
                                                  "\n profunda para mejorar la oxigenación celular. HIDRATACIÓN: Es fundamental consumir al menos 2.5 litros de        " +
                                                  "\n agua al día para mantener la hidratación y ayudar a la eliminación de toxinas. También se recomienda el          " +
                                                  "\n consumo de infusiones con propiedades antioxidantes como té verde o manzanilla. POSIBLE TRATAMIENTO: El          " +
                                                  "\n tratamiento del cáncer varía según el tipo y la etapa de la enfermedad, incluyendo opciones como cirugía,        " +
                                                  "\n quimioterapia, radioterapia e inmunoterapia. También pueden utilizarse terapias dirigidas y hormonales en        " +
                                                  "\n ciertos casos. Es esencial seguir las indicaciones médicas y mantener un monitoreo constante. ALIMENTACIÓN:          " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema      " +
                                                  "\n inmunológico y reducir la inflamación, tales como frutas cítricas como naranjas y toronjas, que aportan vitamina C   " +
                                                  "\n en un 89% de la ingesta diaria recomendada, ayudando a combatir el daño celular. Pescados grasos como salmón y       " +
                                                  "\n atún, que contienen ácidos grasos Omega-3 con propiedades antiinflamatorias y aportan hasta un 70% de la ingesta     " +
                                                  "\n diaria recomendada de estos nutrientes. Verduras de hoja verde como espinacas y acelgas, que contienen antioxidantes  " +
                                                  "\n y vitaminas esenciales para la función celular, aportando hasta un 50% de la ingesta diaria recomendada de vitamina A " +
                                                  "\n y K. Frutos secos como almendras y nueces, que contienen vitamina E y magnesio, contribuyendo con hasta un 40% de la  " +
                                                  "\n ingesta diaria recomendada de estos nutrientes esenciales para la regeneración celular. este es solo un diagnóstico   " +
                                                  "\n predeterminado lógico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las       " +
                                                  "\n respuestas sean completamente correctas. se recomienda realizar más de un diagnóstico para mayor seguridad en el      " +
                                                  "\n tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda   " +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        
                        if(EstaturaFemenino.equals("1.40-1.65 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n Es recomendable que la mujer realice ACTIVIDAD FÍSICA moderada durante aproximadamente 30 minutos al día,          " +
                                                  "\n adaptando la intensidad a su estado general y evitando el ejercicio extenuante si presenta síntomas agudos,        " +
                                                  "\n también es crucial la HIDRATACIÓN diaria consumiendo de 2 a 2.5 Litros de agua al día (ocho a diez vasos de        " +
                                                  "\n tamaño regular) para ayudar a mantener las vías respiratorias hidratadas y facilitar la expectoración.               " +
                                                  "\n POSIBLE TRATAMIENTO: Para la gripe en mujeres adultas, el tratamiento suele incluir medicamentos para reducir        " +
                                                  "\n la fiebre y aliviar los síntomas, como el paracetamol (Tempra) o el ibuprofeno (Advil), antivirales específicos      " +
                                                  "\n contra la gripe como el oseltamivir (Tamiflu) pueden ser recetados por un médico, especialmente si se administran    " +
                                                  "\n dentro de las primeras 48 horas de inicio de los síntomas, también es recomendable que la mujer consuma ALIMENTOS    " +
                                                  "\n que puedan fortalecer su sistema inmune y aliviar los síntomas, tales como: Cítricos (naranjas, limones, toronjas)   " +
                                                  "\n ricos en vitamina C, aportando hasta el 70-90% de la ingesta diaria recomendada, la vitamina C es esencial para      " +
                                                  "\n fortalecer el sistema inmunológico, estimulando la producción de glóbulos blancos y actuando como antioxidante       " +
                                                  "\n para proteger las células del daño causado por la infección; caldos y sopas de pollo ayudan a aliviar la congestión  " +
                                                  "\n nasal y la inflamación de las vías respiratorias, proporcionan hidratación y contienen aminoácidos esenciales que    " +
                                                  "\n pueden ayudar a reparar tejidos dañados y fortalecer el sistema inmunológico; jengibre tiene propiedades             " +
                                                  "\n antiinflamatorias y expectorantes que pueden aliviar la tos y el dolor de garganta, contiene gingerol, un compuesto  " +
                                                  "\n bioactivo que puede ayudar a reducir la inflamación y el dolor en las vías respiratorias; miel puede ayudar a calmar " +
                                                  "\n la tos y el dolor de garganta, contiene enzimas y antioxidantes que pueden tener propiedades antimicrobianas y       " +
                                                  "\n antiinflamatorias, pero debe consumirse con moderación debido a su contenido de azúcar. Este es solo un Diagnóstico  " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello   " +
                                                  "\n la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para  " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del        " +
                                                  "\n Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu        " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía. " +
                                                  "\n Es recomendable que la mujer evite la ACTIVIDAD FÍSICA intensa hasta que se recupere completamente, comenzando          " +
                                                  "\n con ejercicios suaves de respiración y rehabilitación pulmonar según las indicaciones médicas, también es crucial       " +
                                                  "\n la HIDRATACIÓN diaria consumiendo de 2 a 2.5 Litros de agua al día (ocho a diez vasos de tamaño regular) para           " +
                                                  "\n ayudar a fluidificar las secreciones y facilitar la expectoración. POSIBLE TRATAMIENTO: Para la neumonía en mujeres     " +
                                                  "\n adultas, el tratamiento suele incluir antibióticos (como amoxicilina, azitromicina, o levofloxacino) para combatir      " +
                                                  "\n la infección bacteriana, broncodilatadores (como el salbutamol) para abrir las vías respiratorias si hay sibilancias,   " +
                                                  "\n y oxigenoterapia en casos de dificultad respiratoria grave, también es recomendable que la mujer consuma ALIMENTOS      " +
                                                  "\n que puedan fortalecer su sistema inmune y facilitar la recuperación, tales como: Caldos y sopas de pollo ricos en       " +
                                                  "\n proteínas y nutrientes esenciales, ayudan a aliviar la congestión y proporcionan hidratación; alimentos ricos en        " +
                                                  "\n vitamina C (cítricos, fresas, kiwi) contribuyen a fortalecer el sistema inmunológico y reducir la inflamación,          " +
                                                  "\n aportando hasta el 70-90% de la ingesta diaria recomendada; miel puede ayudar a calmar la tos y el dolor de garganta,   " +
                                                  "\n contiene enzimas y antioxidantes que pueden tener propiedades antimicrobianas y antiinflamatorias, pero debe consumirse " +
                                                  "\n con moderación debido a su contenido de azúcar. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado   " +
                                                  "\n no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas,   " +
                                                  "\n para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado  " +
                                                  "\n de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho        " +
                                                  "\n consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes. " +
                                                  "\n Es recomendable que la mujer realice ACTIVIDAD FÍSICA moderada de forma regular, como caminar, nadar o andar         " +
                                                  "\n en bicicleta, durante al menos 30 minutos al día, para mejorar la sensibilidad a la insulina y controlar los         " +
                                                  "\n niveles de glucosa en sangre, también es crucial la HIDRATACIÓN diaria consumiendo de 2 a 2.5 Litros de agua         " +
                                                  "\n al día (ocho a diez vasos de tamaño regular) para ayudar a mantener los niveles de glucosa en sangre estables        " +
                                                  "\n y prevenir la deshidratación. POSIBLE TRATAMIENTO: Para la diabetes en mujeres adultas, el tratamiento suele         " +
                                                  "\n incluir dieta equilibrada y control de carbohidratos, ejercicio regular, y medicamentos como metformina (para        " +
                                                  "\n mejorar la sensibilidad a la insulina) o insulina (en casos de deficiencia de insulina), también es recomendable          " +
                                                  "\n que la mujer consuma ALIMENTOS que puedan ayudar a controlar los niveles de glucosa en sangre, tales como: Verduras       " +
                                                  "\n de hoja verde (espinacas, lechuga, acelgas) bajas en carbohidratos y ricas en fibra, ayudan a mantener los niveles        " +
                                                  "\n de glucosa estables y proporcionan vitaminas y minerales esenciales; frutas bajas en índice glucémico (bayas, manzanas,   " +
                                                  "\n peras) aportan fibra y antioxidantes, ayudando a controlar los niveles de glucosa en sangre y proteger las células        " +
                                                  "\n del daño; legumbres (frijoles, lentejas, garbanzos) ricas en fibra y proteínas, ayudan a mantener los niveles de glucosa  " +
                                                  "\n estables y proporcionan sensación de saciedad. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado      " +
                                                  "\n no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas,  " +
                                                  "\n para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado " +
                                                  "\n de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho       " +
                                                  "\n consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n Es recomendable que la mujer realice ACTIVIDAD FÍSICA de forma controlada y supervisada, con calentamiento previo       " +
                                                  "\n y enfriamiento posterior, evitando desencadenantes conocidos del asma (como alérgenos, aire frío o contaminado) y       " +
                                                  "\n pausas si presenta síntomas, la cantidad de ejercicio debe ser adaptada a su capacidad y a la presencia de síntomas,    " +
                                                  "\n pudiendo ser cerca de 30 minutos de actividad moderada a intensa diaria en los días que se encuentre bien, pero         " +
                                                  "\n siempre consultando al médico para un plan seguro, también es crucial la HIDRATACIÓN diaria consumiendo de 2 a 2.5      " +
                                                  "\n Litros de agua al día (ocho a diez vasos de tamaño regular) para ayudar a mantener las vías respiratorias hidratadas    " +
                                                  "\n y las secreciones más fluidas, lo que facilita la respiración. POSIBLE TRATAMIENTO: Para el asma en mujeres adultas,    " +
                                                  "\n el tratamiento suele incluir broncodilatadores de alivio rápido (para abrir las vías respiratorias durante un ataque,   " +
                                                  "\n como el salbutamol), corticosteroides inhalados (para el control a largo plazo y reducir la inflamación, como la        " +
                                                  "\n fluticasona o budesonida), y en algunos casos, modificadores de leucotrienos (como el montelukast), es fundamental      " +
                                                  "\n seguir estrictamente el plan de acción para el asma indicado por el médico y usar los medicamentos preventivos          " +
                                                  "\n regularmente, también es recomendable que la mujer consuma ALIMENTOS que puedan ayudar a reducir la inflamación         " +
                                                  "\n y fortalecer el sistema inmune, tales como: Pescados grasos (salmón, atún) ricos en ácidos grasos Omega-3, que          " +
                                                  "\n poseen propiedades antiinflamatorias que pueden ayudar a reducir la inflamación de las vías respiratorias; frutas       " +
                                                  "\n y verduras de colores vivos (arándanos, fresas, espinacas, brócoli) ricas en antioxidantes como la vitamina C y         " +
                                                  "\n carotenoides, que pueden proteger las células del daño y fortalecer el sistema inmunológico; jengibre contiene          " +
                                                  "\n compuestos con efectos antiinflamatorios que podrían ser beneficiosos para las vías respiratorias. Este es solo un      " +
                                                  "\n Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y       " +
                                                  "\n que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de     " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta  " +
                                                  "\n del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu       " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n EJERCICIO: Es fundamental mantener un régimen de ejercicio regular y adaptado para fortalecer el cuerpo; se recomienda    " +
                                                  "\n una combinación de actividad aeróbica como caminar o nadar durante 20-30 minutos, de 3 a 4 veces por semana, junto con    " +
                                                  "\n ejercicios de resistencia (pesas ligeras) para mantener la masa muscular. Siempre se debe consultar al médico antes de    " +
                                                  "\n iniciar cualquier programa. HIDRATACIÓN: Es crucial asegurar un consumo de al menos 2 a 3 litros de agua al día para      " +
                                                  "\n ayudar al buen funcionamiento de los riñones, procesar los medicamentos y mantener las mucosas hidratadas como una        " +
                                                  "\n barrera efectiva contra infecciones. POSIBLE TRATAMIENTO: El tratamiento estándar es la Terapia Antirretroviral (TAR),    " +
                                                  "\n que combina varios fármacos para suprimir la replicación del virus. El tratamiento es personalizado y manejado por un     " +
                                                  "\n especialista, buscando una adherencia estricta para mantener la carga viral indetectable. Algunas de las combinaciones    " +
                                                  "\n y marcas comunes que pueden indicarse son Biktarvy (Bictegravir/Emtricitabina/Tenofovir Alafenamida) y Triumeq            " +
                                                  "\n (Dolutegravir/Abacavir/Lamivudina), aunque el esquema específico siempre será determinado por el médico tratante.         " +
                                                  "\n ALIMENTACIÓN: Es vital consumir alimentos que fortalezcan el sistema inmunitario. Proteínas magras (pollo, pescado,       " +
                                                  "\n frijoles) son esenciales para reparar células y mantener la masa muscular. Se recomienda enfocarse en alimentos con       " +
                                                  "\n nutrientes clave: Frutas cítricas (naranjas, fresas): una naranja mediana puede aportar más del 90% de la ingesta diaria  " +
                                                  "\n recomendada de Vitamina C, un antioxidante que protege las células inmunes del daño y es vital para combatir infecciones.    " +
                                                  "\n Verduras de hoja verde (espinacas, brócoli): una taza de espinacas cocidas puede proveer más del 100% de la ingesta diaria   " +
                                                  "\n de Vitamina A, crucial para mantener la integridad de las barreras mucosas (nariz, intestinos) que defienden contra          " +
                                                  "\n patógenos. Legumbres y frutos secos (lentejas, almendras): una taza de lentejas cocidas aporta cerca del 30% del Zinc        " +
                                                  "\n diario recomendado, mineral indispensable para la producción y maduración de los linfocitos, las células de defensa del      " +
                                                  "\n cuerpo. Las nueces de Brasil son excepcionales, ya que una sola pieza puede superar el 100% del Selenio diario necesario,    " +
                                                  "\n un mineral que apoya la función inmune y reduce la inflamación. Este es solo un Diagnóstico predeterminado lógico, haberlo   " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén     " +
                                                  "\n correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento  " +
                                                  "\n adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho " +
                                                  "\n consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la gonorrea es fundamental mantener una hidratación adecuada con un consumo      " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a la         " +
                                                  "\n eliminación de toxinas y mantener el equilibrio del sistema inmunológico. EJERCICIO: Se recomienda actividad         " +
                                                  "\n física moderada como caminatas natación o ejercicios de resistencia para mejorar la circulación sanguínea y          " +
                                                  "\n fortalecer el sistema inmunológico. Además se recomienda la práctica de ejercicios aeróbicos como ciclismo o         " +
                                                  "\n baile al menos 150 minutos por semana para mejorar la función cardiovascular y reducir el riesgo de complicaciones.  " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento suele incluir antibióticos como la ceftriaxona en combinación con azitromicina   " +
                                                  "\n para eliminar la bacteria causante de la infección. Es fundamental seguir estrictamente el tratamiento indicado por  " +
                                                  "\n el médico y evitar la automedicación. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunológico y acelerar la  " +
                                                  "\n recuperación se recomienda el consumo de NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a fortalecer el sistema  " +
                                                  "\n inmunológico aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE:        " +
                                                  "\n Contiene compuestos con propiedades antiinflamatorias y puede ayudar a reducir la inflamación. ESPINACAS Y BRÓCOLI:  " +
                                                  "\n Aportan antioxidantes y vitamina A esenciales para la regeneración celular con un contenido de aproximadamente 56%   " +
                                                  "\n de la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probióticos que pueden fortalecer el   " +
                                                  "\n sistema inmunológico y mejorar la salud digestiva aportando calcio y proteínas esenciales. Este es solo un diagnóstico  " +
                                                  "\n predeterminado lógico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las          " +
                                                  "\n respuestas sean completamente correctas para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer  " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente además por su salud si la respuesta del Diagnóstico no le     " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico Angel L Montes agradece tu visita a la app (Mi Vida)    " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACIÓN: Para el tratamiento del herpes genital es fundamental mantener una hidratación adecuada con un consumo   " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a la          " +
                                                  "\n eliminación de toxinas y mantener el equilibrio del sistema inmunológico. EJERCICIO: Se recomienda actividad física   " +
                                                  "\n moderada como caminatas natación o ejercicios de resistencia para mejorar la circulación sanguínea y fortalecer el    " +
                                                  "\n sistema inmunológico. Además se recomienda la práctica de ejercicios de relajación como yoga o meditación para        " +
                                                  "\n reducir el estrés que puede desencadenar brotes de herpes. POSIBLE TRATAMIENTO: El tratamiento suele incluir          " +
                                                  "\n antivirales como el aciclovir el famciclovir o el valaciclovir para reducir la duración y gravedad de los brotes.     " +
                                                  "\n Es fundamental seguir estrictamente el tratamiento indicado por el médico y evitar la automedicación. ALIMENTOS       " +
                                                  "\n RECOMENDADOS: Para fortalecer el sistema inmunológico y acelerar la recuperación se recomienda el consumo de FRUTOS   " +
                                                  "\n ROJOS: Ricos en antioxidantes y vitamina C que ayudan a fortalecer el sistema inmunológico aportando aproximadamente  " +
                                                  "\n el 70% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos con propiedades            " +
                                                  "\n antiinflamatorias y puede ayudar a reducir la inflamación. ESPINACAS Y BRÓCOLI: Aportan antioxidantes y vitamina A    " +
                                                  "\n esenciales para la regeneración celular con un contenido de aproximadamente 56% de la ingesta diaria recomendada por  " +
                                                  "\n cada 100 gramos. YOGUR NATURAL: Contiene probióticos que pueden fortalecer el sistema inmunológico y mejorar la salud    " +
                                                  "\n digestiva aportando calcio y proteínas esenciales. Este es solo un diagnóstico predeterminado lógico haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello  " +
                                                  "\n se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su    " +
                                                  "\n paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar   " +
                                                  "\n a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la sífilis es fundamental mantener una hidratación adecuada con un consumo       " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a la         " +
                                                  "\n eliminación de toxinas y mantener el equilibrio del sistema inmunológico. EJERCICIO: Se recomienda actividad         " +
                                                  "\n física moderada como caminatas natación o ejercicios de resistencia para mejorar la circulación sanguínea y          " +
                                                  "\n fortalecer el sistema inmunológico. Además se recomienda la práctica de ejercicios aeróbicos como ciclismo o         " +
                                                  "\n baile al menos 150 minutos por semana para mejorar la función cardiovascular y reducir el riesgo de complicaciones.  " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento suele incluir antibióticos como la penicilina G benzatina en dosis única o       " +
                                                  "\n en ciclos prolongados dependiendo de la fase de la enfermedad. Es fundamental seguir estrictamente el tratamiento    " +
                                                  "\n indicado por el médico y evitar la automedicación. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunológico   " +
                                                  "\n y acelerar la recuperación se recomienda el consumo de FRUTOS ROJOS: Ricos en antioxidantes y vitamina C que ayudan   " +
                                                  "\n a fortalecer el sistema inmunológico aportando aproximadamente el 70% de la ingesta diaria recomendada por cada 100   " +
                                                  "\n gramos. JENGIBRE: Contiene compuestos con propiedades antiinflamatorias y puede ayudar a reducir la inflamación.      " +
                                                  "\n ESPINACAS Y BRÓCOLI: Aportan antioxidantes y vitamina A esenciales para la regeneración celular con un contenido de   " +
                                                  "\n aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probióticos que     " +
                                                  "\n pueden fortalecer el sistema inmunológico y mejorar la salud digestiva aportando calcio y proteínas esenciales.       " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza al 100% que el paciente tenga esta  " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer más de un Diagnóstico     " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente además por su salud si la        " +
                                                  "\n respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico Angel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 a 3 litros de agua al día (aproximadamente diez a doce vasos de agua      " +
                                                  "\n de tamaño regular) para ayudar a la eliminación de toxinas y mantener la función pulmonar óptima. La hidratación       " +
                                                  "\n adecuada también contribuye a la fluidificación de las secreciones bronquiales, facilitando la expectoración y         " + 
                                                  "\n mejorando la respiración. Además, el consumo de infusiones calientes con miel y jengibre puede ayudar a aliviar la     " +
                                                  "\n irritación de la garganta y mejorar la capacidad respiratoria. EJERCICIO: Actividad física moderada como caminatas     " +
                                                  "\n al aire libre y ejercicios de respiración pueden ayudar a fortalecer los pulmones y mejorar la oxigenación. Es         " +
                                                  "\n importante evitar el sobreesfuerzo y realizar actividad en ambientes bien ventilados para reducir el riesgo de         " +
                                                  "\n contagio. También se recomienda la práctica de ejercicios de expansión torácica, que pueden mejorar la capacidad       " +
                                                  "\n pulmonar y reducir la sensación de falta de aire. POSIBLE TRATAMIENTO: El tratamiento estándar incluye antibióticos    " +
                                                  "\n como Isoniazida, Rifampicina, Etambutol y Pirazinamida, los cuales deben tomarse por un período prolongado para        " +
                                                  "\n eliminar la bacteria Mycobacterium tuberculosis. Es fundamental seguir el tratamiento completo para evitar la          " +
                                                  "\n resistencia bacteriana y prevenir recaídas. Además, se recomienda el consumo de suplementos de vitamina D, ya que      " +
                                                  "\n esta vitamina juega un papel clave en la respuesta inmunológica contra la tuberculosis. ALIMENTACIÓN: Se recomienda    " +
                                                  "\n el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a mejorar la función pulmonar, tales como:    " +
                                                  "\n Naranjas (ricas en vitamina C, que fortalece el sistema inmune, aportando aproximadamente 89% del requerimiento diario     " +
                                                  "\n por cada 100 g); Aguacate (fuente de grasas saludables y antioxidantes, con 14% de la ingesta diaria recomendada de        " +
                                                  "\n vitamina E por cada 100 g); Pescados grasos (salmón, atún, ricos en Omega-3, que pueden ayudar a reducir la inflamación    " +
                                                  "\n pulmonar, aportando cerca de 50% de la ingesta diaria recomendada por cada porción de 100 g). Este es solo un diagnóstico  " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor     " +
                                                  "\n seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se   " +
                                                  "\n recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2 a 2.5 litros de agua al día (aproximadamente ocho a diez vasos de          " +
                                                  "\n agua de tamaño regular) para ayudar a la lubricación de las articulaciones y reducir la inflamación. Mantener         " +
                                                  "\n una hidratación adecuada también contribuye a la eliminación de toxinas y mejora la circulación sanguínea.            " +
                                                  "\n Además, el consumo de infusiones de cúrcuma y jengibre puede ayudar a reducir la inflamación y aliviar el dolor       " +
                                                  "\n articular. EJERCICIO: Actividad física de bajo impacto como natación, yoga y ejercicios de movilidad articular        " +
                                                  "\n pueden ayudar a reducir la rigidez y mejorar la función de las articulaciones. Es importante evitar movimientos       " +
                                                  "\n bruscos y mantener una rutina constante para fortalecer los músculos que rodean las articulaciones. También se        " +
                                                  "\n recomienda la práctica de ejercicios de estiramiento y fortalecimiento muscular, que pueden mejorar la estabilidad    " +
                                                  "\n articular y reducir el dolor. POSIBLE TRATAMIENTO: El tratamiento estándar incluye antiinflamatorios no esteroides    " +
                                                  "\n (AINEs) como Ibuprofeno y Naproxeno, corticosteroides para reducir la inflamación y fármacos modificadores de la      " +
                                                  "\n enfermedad (FAMEs) como Metotrexato y Sulfasalazina, que ayudan a controlar la progresión de la artritis. Además,     " +
                                                  "\n se recomienda el uso de suplementos de colágeno y glucosamina, que pueden mejorar la salud articular y reducir la     " +
                                                  "\n degeneración del cartílago. ALIMENTACIÓN: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunológico  " +
                                                  "\n y ayuden a reducir la inflamación, tales como: Jengibre (contiene compuestos con efectos antiinflamatorios, que pueden   " +
                                                  "\n ser beneficiosos para las articulaciones); Cúrcuma (con su componente activo, la curcumina, que tiene potentes           " +
                                                  "\n propiedades antiinflamatorias y antioxidantes); Frutas y verduras de colores vivos (arándanos, fresas, espinacas,        " +
                                                  "\n brócoli), ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las células del daño y           " +
                                                  "\n fortalecer el sistema inmunológico. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza   " +
                                                  "\n al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se          " +
                                                  "\n recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado.         " +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.     " +
                                                  "\n Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2 a 2.5 litros de agua al día (aproximadamente ocho a diez vasos de agua           " +
                                                  "\n de tamaño regular) para ayudar a mantener las vías respiratorias hidratadas y reducir la irritación de la garganta.         " +
                                                  "\n También es recomendable el uso de infusiones calientes con miel y jengibre para aliviar la tos y mejorar la expectoración.  " +
                                                  "\n EJERCICIO: Actividad física ligera como caminatas y ejercicios de respiración pueden ayudar a mejorar la oxigenación        " +
                                                  "\n y reducir la fatiga. Es importante evitar ambientes con humo, polvo o vapores químicos que puedan agravar los síntomas.     " +
                                                  "\n También se recomienda la práctica de ejercicios de expansión pulmonar, que pueden mejorar la capacidad respiratoria         " +
                                                  "\n y reducir la sensación de falta de aire. POSIBLE TRATAMIENTO: El tratamiento estándar incluye antibióticos como             " +
                                                  "\n Azitromicina, Claritromicina y Eritromicina, los cuales ayudan a eliminar la bacteria Bordetella pertussis y reducir        " +
                                                  "\n la duración de la enfermedad. También se recomienda el uso de humidificadores para mantener el aire húmedo y facilitar      " +
                                                  "\n la respiración. ALIMENTACIÓN: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a      " +
                                                  "\n reducir la inflamación, tales como: Kiwi (rico en vitamina C, que fortalece el sistema inmune, aportando aproximadamente    " +
                                                  "\n 92% del requerimiento diario por cada 100 g); Miel (con propiedades antibacterianas y antiinflamatorias, que pueden         " +
                                                  "\n ayudar a aliviar la irritación de la garganta); Jengibre (contiene compuestos con efectos antiinflamatorios, que pueden     " +
                                                  "\n ser beneficiosos para las vías respiratorias). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no     " +
                                                  "\n garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello,      " +
                                                  "\n se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado.         " +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.        " +
                                                  "\n Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n Para una mujer adulta con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidratación        " +
                                                  "\n óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se             " +
                                                  "\n recomienda actividad física de bajo impacto como natación, yoga o caminatas suaves de 30 minutos al día para             " +
                                                  "\n mejorar la movilidad articular y reducir la inflamación. También es beneficioso realizar ejercicios de fortalecimiento   " +
                                                  "\n muscular con bandas de resistencia o pesas ligeras, ya que ayudan a estabilizar las articulaciones y prevenir el         " +
                                                  "\n deterioro óseo. Además, el ejercicio aeróbico moderado, como el ciclismo o la elíptica, puede mejorar la circulación     " +
                                                  "\n y reducir la rigidez matutina. HIDRATACIÓN. Se aconseja consumir al menos 2 litros de agua al día para mantener la       " +
                                                  "\n lubricación de las articulaciones y reducir la rigidez. Además, el té verde es una excelente opción, ya que contiene     " +
                                                  "\n polifenoles con propiedades antiinflamatorias que pueden ayudar a reducir el dolor articular. También se recomienda      " +
                                                  "\n el consumo de caldos naturales y jugos de frutas sin azúcar añadida para mantener el equilibrio de electrolitos y        " +
                                                  "\n mejorar la absorción de nutrientes esenciales. POSIBLE TRATAMIENTO. El tratamiento para la artritis incluye medicamentos " +
                                                  "\n antiinflamatorios no esteroides como ibuprofeno y naproxeno, además de fármacos modificadores de la enfermedad como      " +
                                                  "\n metotrexato y sulfasalazina. También se pueden utilizar terapias biológicas como los inhibidores del factor de necrosis  " +
                                                  "\n tumoral (TNF), que han demostrado ser eficaces en el control de la inflamación crónica. En algunos casos, se recomienda  " +
                                                  "\n la fisioterapia para mejorar la movilidad y reducir el dolor. Marcas reconocidas incluyen Advil, Aleve y Arava.          " +
                                                  "\n ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica en antioxidantes y ácidos grasos esenciales. Algunos alimentos    " +
                                                  "\n clave incluyen pescados grasos como salmón y atún, ricos en omega-3, que ayudan a reducir la inflamación, aportando      " +
                                                  "\n aproximadamente el 70% del requerimiento diario por cada 100 gramos de consumo. Frutas cítricas como naranja y kiwi,     " +
                                                  "\n ricas en vitamina C, que contribuyen a la producción de colágeno y fortalecen el sistema inmunológico, con un aporte     " +
                                                  "\n del 89% del requerimiento diario por cada 100 gramos. Verduras de hoja verde como espinaca y brócoli, que contienen      " +
                                                  "\n hierro y antioxidantes esenciales para la producción de glóbulos rojos y la oxigenación celular, aportando cerca del 15% " +
                                                  "\n del requerimiento diario por cada 100 gramos. Frutos secos y semillas como almendras y nueces, que contienen vitamina E  " +
                                                  "\n y ácidos grasos esenciales, contribuyendo a la protección celular y fortalecimiento del sistema inmunológico, con un     " +
                                                  "\n aporte del 37% del requerimiento diario por cada 28 gramos de consumo. Este diagnóstico es una referencia lógica basada  " +
                                                  "\n en información médica, pero no garantiza al 100% que el paciente tenga artritis ni que el tratamiento sea el adecuado.   " +
                                                  "\n Se recomienda realizar más de un diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes agradece tu    " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Para una mujer adulta con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidratación       " +
                                                  "\n óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se            " +
                                                  "\n recomienda actividad física ligera como caminatas cortas y ejercicios de respiración para fortalecer los pulmones       " + 
                                                  "\n sin generar fatiga excesiva. También es recomendable realizar ejercicios de expansión torácica y técnicas de            " +
                                                  "\n respiración profunda para mejorar la capacidad pulmonar y reducir la sensación de ahogo. Además, el uso de técnicas     " +
                                                  "\n de relajación como la meditación y el control de la respiración puede ayudar a reducir la ansiedad provocada por la        " + 
                                                  "\n dificultad respiratoria. HIDRATACIÓN. Se aconseja consumir al menos 2.5 litros de agua al día para mantener las vías       " +
                                                  "\n respiratorias hidratadas y facilitar la eliminación de mucosidad. Además, el consumo de líquidos tibios como infusiones    " +
                                                  "\n de jengibre y miel puede ayudar a calmar la irritación de garganta y mejorar la expectoración. También se recomienda el    " +
                                                  "\n consumo de caldos naturales y jugos cítricos para mantener el equilibrio de electrolitos y fortalecer el sistema           " + 
                                                  "\n inmunológico. POSIBLE TRATAMIENTO. El tratamiento para la tosferina incluye antibióticos como azitromicina, claritromicina " +
                                                  "\n y eritromicina. También se recomienda el uso de broncodilatadores en casos de dificultad respiratoria severa. En algunos   " +
                                                  "\n casos, los médicos pueden indicar el uso de corticosteroides para reducir la inflamación de las vías respiratorias. Marcas " +
                                                  "\n reconocidas incluyen Zithromax, Biaxin y Erythrocin. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica en vitaminas y " +
                                                  "\n antioxidantes para fortalecer el sistema inmunológico. Algunos alimentos clave incluyen frutas cítricas como naranja y     " +
                                                  "\n limón, ricas en vitamina C, que ayudan a la recuperación y fortalecimiento del sistema inmune, aportando aproximadamente   " +
                                                  "\n el 89% del requerimiento diario por cada 100 gramos de consumo. Verduras como zanahoria y espinaca, ricas en vitamina A,   " +
                                                  "\n que contribuyen a la salud respiratoria y fortalecen las mucosas, con un aporte del 15% del requerimiento diario por cada  " +
                                                  "\n 100 gramos. Miel, que posee propiedades antibacterianas y ayuda a calmar la irritación de garganta, proporcionando alivio  " +
                                                  "\n inmediato. Jengibre, con efectos antiinflamatorios que pueden ayudar a reducir la congestión y mejorar la respiración.     " +
                                                  "\n Este diagnóstico es una referencia lógica basada en información médica, pero no garantiza al 100% que el paciente tenga    " +
                                                  "\n tosferina ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico para " +
                                                  "\n mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Para una mujer adulta con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidratación     " +
                                                  "\n óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se          " +
                                                  "\n recomienda reposo y evitar actividad física intensa hasta la recuperación completa para prevenir complicaciones.      " +
                                                  "\n Sin embargo, ejercicios suaves de movilidad pueden ser beneficiosos para evitar la rigidez muscular y mejorar la      " +
                                                  "\n circulación. También se recomienda realizar ejercicios de estiramiento para reducir la tensión muscular y mejorar     " +
                                                  "\n la recuperación. HIDRATACIÓN. Se aconseja consumir al menos 2 litros de agua al día para mantener una buena hidratación  " +
                                                  "\n y aliviar la inflamación de las glándulas salivales. También se recomienda el consumo de caldos y jugos naturales para   " +
                                                  "\n mantener el equilibrio de electrolitos. Además, el consumo de bebidas ricas en antioxidantes como el té verde puede      " +
                                                  "\n ayudar a fortalecer el sistema inmunológico. POSIBLE TRATAMIENTO. El tratamiento para las paperas es sintomático e       " + 
                                                  "\n incluye analgésicos como paracetamol e ibuprofeno para reducir el dolor y la fiebre. En casos severos, se pueden         " +
                                                  "\n administrar corticosteroides para reducir la inflamación. También se recomienda el uso de compresas frías para aliviar   " +
                                                  "\n la hinchazón de las glándulas salivales. Marcas reconocidas incluyen Tempra y Advil. ALIMENTACIÓN RECOMENDADA. Se        " +
                                                  "\n recomienda una dieta suave y rica en nutrientes esenciales. Algunos alimentos clave incluyen yogur y puré de papas,      " +
                                                  "\n que son fáciles de consumir y ayudan a mantener la energía sin irritar las glándulas salivales. Frutas como plátano      " +
                                                  "\n y mango, ricas en vitamina B6, que contribuyen a la reducción de la inflamación y fortalecen el sistema inmunológico.    " +
                                                  "\n Este diagnóstico es una referencia lógica basada en información médica, pero no garantiza al 100% que el paciente tenga  " +
                                                  "\n paperas ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico para " +
                                                  "\n mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria." +
                                                  "\n La listeriosis es una infección bacteriana causada por Listeria monocytogenes, que puede provocar fiebre,        " +
                                                  "\n dolores musculares, náuseas y, en casos graves, afectar el sistema nervioso. EJERCICIO. Se recomienda            " +
                                                  "\n actividad física moderada, evitando esfuerzos excesivos si hay fiebre o fatiga. Caminar y ejercicios de          " +
                                                  "\n bajo impacto pueden ser beneficiosos para mantener la circulación y el bienestar general. También se sugiere     " +
                                                  "\n realizar ejercicios de respiración profunda para mejorar la oxigenación y reducir el estrés. HIDRATACIÓN. Es     " +
                                                  "\n fundamental consumir entre 2 y 2.5 litros de agua al día para ayudar al cuerpo a combatir la infección y         " +
                                                  "\n mantenerse hidratado. Se recomienda complementar la ingesta de agua con líquidos ricos en electrolitos como      " +
                                                  "\n sueros orales o agua de coco, que pueden ayudar a reponer minerales esenciales perdidos por la fiebre y          " +
                                                  "\n sudoración. POSIBLE TRATAMIENTO. La listeriosis se trata con antibióticos como la ampicilina o el                " +
                                                  "\n trimetoprima-sulfametoxazol, que ayudan a eliminar la bacteria. En casos graves, puede ser necesario el uso de   " +
                                                  "\n antibióticos intravenosos para controlar la infección. ALIMENTACIÓN RECOMENDADA. Consumir alimentos ricos en     " +
                                                  "\n antioxidantes y vitaminas para fortalecer el sistema inmunológico. Espinaca, rica en hierro y vitamina K, que    " +
                                                  "\n favorece la recuperación celular, proporcionando hasta el 20% del requerimiento diario de hierro por cada 100 g.    " +
                                                  "\n Yogur natural, fuente de probióticos que ayudan a fortalecer la flora intestinal y mejorar la respuesta inmune.     " +
                                                  "\n Frutas cítricas como naranja y toronja, ricas en vitamina C, que contribuyen a la recuperación, aportando           " +
                                                  "\n aproximadamente el 89% del requerimiento diario por cada 100 g. Este es solo un diagnóstico predeterminado lógico,  " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus     " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor    " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le      " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n La shigelosis es una infección bacteriana causada por Shigella, que provoca diarrea con sangre, fiebre, calambres      " +
                                                  "\n abdominales y deshidratación. EJERCICIO. Se recomienda actividad física ligera mientras persistan los síntomas,        " +
                                                  "\n evitando esfuerzos intensos que puedan agravar la deshidratación. Caminar y realizar estiramientos suaves pueden       " +
                                                  "\n ser beneficiosos para mantener la circulación y el bienestar general. HIDRATACIÓN. Es fundamental consumir entre       " +
                                                  "\n 2.5 y 3 litros de agua al día para compensar la pérdida de líquidos causada por la diarrea. También se recomienda      " +
                                                  "\n el consumo de soluciones de rehidratación oral que contienen electrolitos esenciales como sodio y potasio, ayudando    " +
                                                  "\n a restablecer el equilibrio hídrico del cuerpo. POSIBLE TRATAMIENTO. La shigelosis se trata con antibióticos como      " +
                                                  "\n ciprofloxacino o azitromicina, que ayudan a eliminar la bacteria. Se recomienda evitar el uso de medicamentos          " +
                                                  "\n antidiarreicos como la loperamida, ya que pueden prolongar la infección. ALIMENTACIÓN RECOMENDADA. Consumir alimentos  " +
                                                  "\n de fácil digestión y ricos en nutrientes esenciales para la recuperación. Plátano, rico en potasio, que ayuda a        " +
                                                  "\n reponer los electrolitos perdidos, aportando aproximadamente el 10% del requerimiento diario por cada 100 g. Arroz     " +
                                                  "\n blanco, fuente de carbohidratos de fácil digestión, que contribuye a la recuperación intestinal. Zanahoria, rica en    " +
                                                  "\n vitamina A y antioxidantes, que favorecen la regeneración de la mucosa intestinal, proporcionando cerca del 15% del    " +
                                                  "\n requerimiento diario de vitamina A por cada 100 g. Manzana, con pectina que ayuda a regular el tránsito intestinal,    " +
                                                  "\n aportando fibra soluble beneficiosa para la digestión. Este es solo un diagnóstico predeterminado lógico, haberlo      " + 
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas     " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en     " +
                                                  "\n el tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo   " +
                                                  "\n se le recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n La EPOC es una afección respiratoria progresiva que dificulta la respiración y puede causar tos crónica, producción      " +
                                                  "\n de moco y fatiga. EJERCICIO. Se recomienda actividad física moderada para mejorar la capacidad pulmonar y reducir        " +
                                                  "\n la fatiga. Ejercicios de respiración profunda y técnicas de fortalecimiento muscular pueden ser beneficiosos. Se         " +
                                                  "\n sugiere evitar ambientes con humo o contaminación para prevenir exacerbaciones. HIDRATACIÓN. Es fundamental consumir     " +
                                                  "\n entre 2 y 3 litros de agua al día para mantener las vías respiratorias hidratadas y facilitar la eliminación de          " +
                                                  "\n mucosidad. Se recomienda el consumo de líquidos tibios como té de jengibre o infusiones de hierbas para aliviar la       " +
                                                  "\n irritación pulmonar. POSIBLE TRATAMIENTO. La EPOC se trata con broncodilatadores de acción prolongada como el salmeterol " +
                                                  "\n o el tiotropio, que ayudan a abrir las vías respiratorias. También pueden utilizarse corticosteroides inhalados para     " +
                                                  "\n reducir la inflamación. En casos graves, puede ser necesario el uso de oxigenoterapia. ALIMENTACIÓN RECOMENDADA.         " +
                                                  "\n Consumir alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema respiratorio. Pescados      " +
                                                  "\n grasos como salmón y atún, ricos en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias y pueden ayudar      " +
                                                  "\n a reducir la inflamación pulmonar. Frutas y verduras de colores vivos como arándanos, fresas, espinacas y brócoli,       " +
                                                  "\n ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las células del daño y fortalecer el       " +
                                                  "\n sistema inmunológico. Jengibre, que contiene compuestos con efectos antiinflamatorios que podrían ser beneficiosos       " +
                                                  "\n para las vías respiratorias. Cúrcuma, con su componente activo, la curcumina, que tiene potentes propiedades             " +
                                                  "\n antiinflamatorias y antioxidantes. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza    " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello    " +
                                                  "\n se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su    " +
                                                  "\n paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar  " +
                                                  "\n a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n EJERCICIO: No hay una recomendación específica de actividad física para la clamidia, pero mantener un estilo de         " +
                                                  "\n vida activo fortalece el sistema inmunológico y ayuda a la recuperación. Se recomienda ejercicio moderado como          " +
                                                  "\n caminatas diarias de 30 minutos o yoga para reducir el estrés, que puede afectar la respuesta inmune. HIDRATACIÓN:      " +
                                                  "\n Es fundamental consumir al menos 2 litros de agua al día para ayudar a eliminar toxinas y mantener el equilibrio        " +
                                                  "\n de los fluidos corporales. También se recomienda el consumo de infusiones como té verde, que tiene propiedades          " +
                                                  "\n antioxidantes y antibacterianas. Además, el agua ayuda a mantener la salud de las mucosas, reduciendo la irritación     " +
                                                  "\n y el malestar en el tracto urinario. POSIBLE TRATAMIENTO: La clamidia se trata con antibióticos como la azitromicina    " +
                                                  "\n en dosis única o la doxiciclina durante 7 días. También pueden utilizarse levofloxacina o amoxicilina en ciertos casos. " +
                                                  "\n Es esencial que la pareja también reciba tratamiento para evitar reinfecciones. Además, se recomienda evitar el consumo   " +
                                                  "\n de alcohol y tabaco durante el tratamiento, ya que pueden afectar la eficacia de los antibióticos y debilitar el sistema  " +
                                                  "\n inmunológico. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para     " +
                                                  "\n fortalecer el sistema inmunológico, tales como frutas cítricas como naranjas y toronjas, que aportan vitamina C en un     " +
                                                  "\n 89% de la ingesta diaria recomendada, ayudando a combatir infecciones. Yogur natural, que contiene probióticos que        " +
                                                  "\n favorecen la salud intestinal y el equilibrio de la flora vaginal. Verduras de hoja verde como espinacas y acelgas,       " +
                                                  "\n que aportan hasta un 50% de la ingesta diaria recomendada de vitamina A y K, esenciales para la regeneración celular.     " + 
                                                  "\n Ajo, que posee propiedades antimicrobianas y antioxidantes, contribuyendo con hasta un 40% de la ingesta diaria           " +
                                                  "\n recomendada de compuestos bioactivos beneficiosos para la salud. este es solo un diagnóstico predeterminado lógico.       " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente    " +
                                                  "\n correctas. se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su   " +
                                                  "\n salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes      " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n EJERCICIO: Durante la recuperación de la meningitis bacteriana, se recomienda evitar esfuerzos físicos intensos         " +
                                                  "\n y priorizar el descanso. Una vez estabilizada la condición, se pueden realizar ejercicios de bajo impacto como          " +
                                                  "\n caminatas suaves o ejercicios de respiración para mejorar la oxigenación cerebral. HIDRATACIÓN: Es crucial el           " +
                                                  "\n consumo de al menos 2.5 litros de agua al día para mantener la hidratación y ayudar a la eliminación de toxinas.        " +
                                                  "\n También se recomienda el consumo de caldos naturales y jugos sin azúcar para aportar electrolitos esenciales. La        " +
                                                  "\n hidratación adecuada es clave para mantener la viscosidad del líquido cefalorraquídeo y reducir la inflamación de        " +
                                                  "\n las meninges. POSIBLE TRATAMIENTO: La meningitis bacteriana requiere tratamiento inmediato con antibióticos intravenosos " +
                                                  "\n como ceftriaxona, cefotaxima o ampicilina, dependiendo del agente causal. También pueden administrarse corticosteroides  " +
                                                  "\n para reducir la inflamación cerebral y medicamentos para controlar síntomas como fiebre y convulsiones. En algunos     " +
                                                  "\n casos, se recomienda el uso de antivirales si la infección es mixta. Además, la suplementación con vitamina B puede    " +
                                                  "\n ser beneficiosa para la recuperación neurológica. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en         " + 
                                                  "\n antioxidantes y nutrientes esenciales para la recuperación, tales como pescado azul como salmón y atún, que contienen  " +
                                                  "\n ácidos grasos Omega-3 con propiedades antiinflamatorias y aportan hasta un 70% de la ingesta diaria recomendada de     " +
                                                  "\n estos nutrientes. Frutas como fresas y arándanos, que contienen antioxidantes y vitamina C en un 89% de la ingesta     " +
                                                  "\n diaria recomendada, fortaleciendo el sistema inmunológico. Verduras como zanahorias y brócoli, que aportan hasta un       " +
                                                  "\n 50% de la ingesta diaria recomendada de vitamina A y K, esenciales para la función cerebral. Frutos secos como almendras  " +
                                                  "\n y nueces, que contienen vitamina E y magnesio, contribuyendo con hasta un 40% de la ingesta diaria recomendada de estos   " +
                                                  "\n nutrientes esenciales para la recuperación neurológica. este es solo un diagnóstico predeterminado lógico. haberlo        " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas.  " +
                                                  "\n se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud, si la  " +
                                                  "\n respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n EJERCICIO: La actividad física es clave para mejorar la calidad de vida de las personas con cáncer. Se recomienda ejercicio  " +
                                                  "\n moderado como caminatas diarias de 30 a 45 minutos, yoga o ejercicios de resistencia para fortalecer los músculos y reducir  " +
                                                  "\n la fatiga. También es beneficioso realizar ejercicios de respiración profunda para mejorar la oxigenación celular.           " +
                                                  "\n HIDRATACIÓN: Es fundamental consumir al menos 2.5 litros de agua al día para mantener la hidratación y ayudar a la           " +
                                                  "\n eliminación de toxinas. También se recomienda el consumo de infusiones con propiedades antioxidantes como té verde           " +
                                                  "\n o manzanilla. La hidratación adecuada es esencial para reducir los efectos secundarios de la quimioterapia, como la          " +
                                                  "\n fatiga y la sequedad en la piel y mucosas. POSIBLE TRATAMIENTO: El tratamiento del cáncer varía según el tipo y la           " +
                                                  "\n etapa de la enfermedad, incluyendo opciones como cirugía, quimioterapia, radioterapia e inmunoterapia. También pueden        " +
                                                  "\n utilizarse terapias dirigidas y hormonales en ciertos casos. Es esencial seguir las indicaciones médicas y mantener un       " +
                                                  "\n monitoreo constante. Además, la suplementación con antioxidantes como la vitamina E y el selenio puede ayudar a reducir      " +
                                                  "\n el daño celular. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para     " +
                                                  "\n fortalecer el sistema inmunológico y reducir la inflamación, tales como frutas cítricas como naranjas y toronjas, que        " +
                                                  "\n aportan vitamina C en un 89% de la ingesta diaria recomendada, ayudando a combatir el daño celular. Pescados grasos como     " +
                                                  "\n salmón y atún, que contienen ácidos grasos Omega-3 con propiedades antiinflamatorias y aportan hasta un 70% de la ingesta    " +
                                                  "\n diaria recomendada de estos nutrientes. Verduras de hoja verde como espinacas y acelgas, que contienen antioxidantes y       " +
                                                  "\n vitaminas esenciales para la función celular, aportando hasta un 50% de la ingesta diaria recomendada de vitamina A y K.     " +
                                                  "\n Frutos secos como almendras y nueces, que contienen vitamina E y magnesio, contribuyendo con hasta un 40% de la ingesta      " +
                                                  "\n diaria recomendada de estos nutrientes esenciales para la regeneración celular. este es solo un diagnóstico predeterminado   " +
                                                  "\n lógico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente " +
                                                  "\n correctas. se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su  " +
                                                  "\n salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.30-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la influenza es fundamental mantener una hidratación adecuada con un consumo      " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a la          " +
                                                  "\n recuperación y prevenir la deshidratación causada por la fiebre. EJERCICIO: Se recomienda actividad física moderada   " +
                                                  "\n como caminatas suaves o yoga evitando esfuerzos intensos mientras persistan los síntomas. Una vez superada la fase        " +
                                                  "\n aguda es recomendable realizar ejercicios de respiración profunda para mejorar la capacidad pulmonar y reducir la         " +
                                                  "\n sensación de fatiga. POSIBLE TRATAMIENTO: El tratamiento suele incluir medicamentos para reducir la fiebre y aliviar      " +
                                                  "\n los síntomas como el paracetamol marca común Tempra o el ibuprofeno. En casos más severos los médicos pueden recetar      " +
                                                  "\n antivirales específicos contra la gripe como el oseltamivir marca común Tamiflu. Es importante seguir las indicaciones    " +
                                                  "\n médicas y evitar el uso de aspirina ya que puede generar complicaciones en algunos casos. ALIMENTOS RECOMENDADOS: Para    " +
                                                  "\n fortalecer el sistema inmunológico y acelerar la recuperación se recomienda el consumo de NARANJAS Y GUAYABAS: Ricas en   " +
                                                  "\n vitamina C que ayuda a reducir la duración de los síntomas aportando aproximadamente el 89% de la ingesta diaria          " +
                                                  "\n recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos con propiedades antiinflamatorias y puede aliviar la          " +
                                                  "\n congestión. MIEL Y LIMÓN: Combinación efectiva para calmar la garganta y reducir la tos aportando flavonoides y vitamina C.  " +
                                                  "\n ESPINACAS Y BRÓCOLI: Aportan antioxidantes y vitamina A esenciales para la regeneración celular con un contenido de          " +
                                                  "\n aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probióticos que pueden     " +
                                                  "\n fortalecer el sistema inmunológico y mejorar la salud digestiva aportando calcio y proteínas esenciales. Este es solo un     " +
                                                  "\n diagnóstico predeterminado lógico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las   " +
                                                  "\n respuestas sean completamente correctas para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente además por su salud si la respuesta del Diagnóstico no le satisface del  " +
                                                  "\n todo se le recomienda mucho consultar a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la neumonía es fundamental mantener una hidratación adecuada con un consumo             " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a la                " +
                                                  "\n recuperación y prevenir la deshidratación causada por la fiebre. EJERCICIO: Se recomienda actividad física moderada         " +
                                                  "\n como caminatas suaves evitando esfuerzos intensos mientras persistan los síntomas. Una vez superada la fase aguda es        " +
                                                  "\n recomendable realizar ejercicios de respiración profunda y expansión pulmonar como técnicas de fisioterapia respiratoria    " +
                                                  "\n para mejorar la capacidad pulmonar y reducir la sensación de fatiga. POSIBLE TRATAMIENTO: El tratamiento suele incluir      " +
                                                  "\n antibióticos como la amoxicilina la azitromicina o la ceftriaxona. En casos más severos los médicos pueden recetar          " +
                                                  "\n antivirales como el oseltamivir además de medicamentos para reducir la fiebre como el paracetamol o el ibuprofeno. Es       " +
                                                  "\n importante seguir las indicaciones médicas y evitar la automedicación. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema   " + 
                                                  "\n inmunológico y acelerar la recuperación se recomienda el consumo de NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a    " +
                                                  "\n reducir la duración de los síntomas aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos.  " +
                                                  "\n JENGIBRE: Contiene compuestos con propiedades antiinflamatorias y puede aliviar la congestión. ESPINACAS Y BRÓCOLI: Aportan " +
                                                  "\n antioxidantes y vitamina A esenciales para la regeneración celular con un contenido de aproximadamente 56% de la ingesta    " +
                                                  "\n diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probióticos que pueden fortalecer el sistema inmunológico   " +
                                                  "\n y mejorar la salud digestiva aportando calcio y proteínas esenciales. Este es solo un diagnóstico predeterminado lógico     " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente      " +
                                                  "\n correctas para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento  " +
                                                  "\n adecuado de su paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho " +
                                                  "\n consultar a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la diabetes es fundamental mantener una hidratación adecuada con un consumo         " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a la            " +
                                                  "\n regulación de la glucosa en sangre y prevenir la deshidratación. EJERCICIO: Se recomienda actividad física regular      " +
                                                  "\n como caminatas natación o ejercicios de resistencia para mejorar la sensibilidad a la insulina y controlar los          " +
                                                  "\n niveles de glucosa en sangre. Además se recomienda la práctica de ejercicios aeróbicos como ciclismo o baile al         " +
                                                  "\n menos 150 minutos por semana para mejorar la función cardiovascular y reducir el riesgo de complicaciones. POSIBLE      " +
                                                  "\n TRATAMIENTO: El tratamiento suele incluir medicamentos como la metformina para mejorar la sensibilidad a la insulina.   " +
                                                  "\n En casos más severos los médicos pueden recetar insulina de acción rápida o prolongada además de medicamentos para      " +
                                                  "\n controlar la presión arterial y el colesterol. Es importante seguir las indicaciones médicas y mantener un monitoreo    " +
                                                  "\n constante de los niveles de glucosa. ALIMENTOS RECOMENDADOS: Para fortalecer el metabolismo y mejorar el control de     " +
                                                  "\n la glucosa se recomienda el consumo de FRUTOS ROJOS: Ricos en antioxidantes y fibra que ayudan a regular la glucosa     " +
                                                  "\n en sangre aportando aproximadamente el 32% de la ingesta diaria recomendada por cada 100 gramos. FRUTOS SECOS:          " +
                                                  "\n Contienen grasas saludables y fibra que pueden mejorar la sensibilidad a la insulina aportando aproximadamente el 25%   " +
                                                  "\n de la ingesta diaria recomendada por cada 100 gramos. ESPINACAS Y BRÓCOLI: Aportan antioxidantes y vitamina A esenciales   " +
                                                  "\n para la regeneración celular con un contenido de aproximadamente 56% de la ingesta diaria recomendada por cada 100         " +
                                                  "\n gramos. AVENA: Rica en fibra soluble que ayuda a estabilizar los niveles de glucosa en sangre aportando aproximadamente    " +
                                                  "\n el 40% de la ingesta diaria recomendada por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico haberlo     " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas   " +
                                                  "\n para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado  " +
                                                  "\n de su paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho         " +
                                                  "\n consultar a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2 a 2.5 litros de agua al día (aproximadamente ocho a diez vasos de agua       " +
                                                  "\n de tamaño regular) para ayudar a mantener las vías respiratorias hidratadas y reducir la inflamación. La hidratación    " +
                                                  "\n adecuada también contribuye a la fluidificación de las secreciones bronquiales, facilitando la expectoración y          " +
                                                  "\n mejorando la respiración. Además, el consumo de infusiones calientes con miel y jengibre puede ayudar a aliviar la      " +
                                                  "\n irritación de la garganta y mejorar la capacidad respiratoria. EJERCICIO: Actividad física moderada como caminatas,     " +
                                                  "\n natación y ejercicios de respiración pueden ayudar a fortalecer los pulmones y mejorar la oxigenación. Es importante    " +
                                                  "\n evitar el sobreesfuerzo y realizar actividad en ambientes bien ventilados para reducir el riesgo de crisis asmáticas.   " +
                                                  "\n También se recomienda la práctica de ejercicios de expansión torácica, que pueden mejorar la capacidad pulmonar y       " +
                                                  "\n reducir la sensación de falta de aire. POSIBLE TRATAMIENTO: El tratamiento estándar incluye broncodilatadores de        " +
                                                  "\n alivio rápido como Salbutamol (marcas comunes: Ventolin, Aerolin), corticosteroides inhalados como Fluticasona y        " +
                                                  "\n Budesonida (marcas comunes: Flixotide, Pulmicort), y en algunos casos, modificadores de leucotrienos como Montelukast   " +
                                                  "\n (marca común: Singulair). Es fundamental seguir estrictamente el plan de acción para el asma indicado por el médico y   " +
                                                  "\n usar los medicamentos preventivos regularmente. ALIMENTACIÓN: Se recomienda el consumo de alimentos que fortalezcan     " +
                                                  "\n el sistema inmunológico y ayuden a reducir la inflamación, tales como: Pescados grasos (salmón, atún, ricos en Omega-3,   " +
                                                  "\n que poseen propiedades antiinflamatorias y pueden ayudar a reducir la inflamación de las vías respiratorias, aportando    " +
                                                  "\n cerca de 50% de la ingesta diaria recomendada por cada porción de 100 g); Frutas y verduras de colores vivos (arándanos,  " +
                                                  "\n fresas, espinacas, brócoli), ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las células    " +
                                                  "\n del daño y fortalecer el sistema inmunológico; Jengibre (contiene compuestos con efectos antiinflamatorios, que podrían   " +
                                                  "\n ser beneficiosos para las vías respiratorias); Cúrcuma (con su componente activo, la curcumina, también tiene potentes    " +
                                                  "\n propiedades antiinflamatorias y antioxidantes). Este es solo un diagnóstico predeterminado lógico, haberlo consultado     " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para       " +
                                                  "\n ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. " +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.      " +
                                                  "\n Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente mantenga una hidratación adecuada, consumiendo al menos 2 a 2.5 litros       " +
                                                  "\n de agua al día (aproximadamente ocho a diez vasos de agua de tamaño regular) para ayudar a la función renal y la         " +
                                                  "\n eliminación de toxinas. La hidratación también contribuye a la regulación de la temperatura corporal y al transporte     " +
                                                  "\n eficiente de nutrientes esenciales para la recuperación. EJERCICIO: Se recomienda actividad física moderada como         " + 
                                                  "\n caminatas, yoga o entrenamiento de resistencia, adaptado a su estado de salud y bajo supervisión médica, evitando el     " +
                                                  "\n sobreesfuerzo. El ejercicio regular ayuda a reducir el estrés y fortalecer el sistema inmunológico. POSIBLE TRATAMIENTO: " +
                                                  "\n El tratamiento estándar incluye terapia antirretroviral (TAR), que combina varios medicamentos para suprimir la          " +
                                                  "\n replicación del virus y mejorar la calidad de vida. Algunos fármacos comunes incluyen Tenofovir, Emtricitabina,          " +
                                                  "\n Efavirenz (marca Atripla), Dolutegravir (marca Tivicay) y Lamivudina (marca Epivir). Es crucial seguir estrictamente     " + 
                                                  "\n el tratamiento indicado por el médico y realizar controles periódicos. ALIMENTACIÓN: Se recomienda el consumo de         " +
                                                  "\n alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales como: Frutas cítricas         " +
                                                  "\n (naranjas, toronjas, limones), ricas en vitamina C, que fortalece el sistema inmune, aportando aproximadamente 89% del   " +
                                                  "\n requerimiento diario por cada 100 g; Aguacate, fuente de grasas saludables y antioxidantes, con 14% de la ingesta        " +
                                                  "\n diaria recomendada de vitamina E por cada 100 g; Pescados grasos (salmón, atún), ricos en Omega-3, que pueden ayudar     " +
                                                  "\n a reducir la inflamación, aportando cerca de 50% de la ingesta diaria recomendada por cada porción de 100 g; Verduras    " +
                                                  "\n de hoja verde (espinacas, kale), con vitamina A y hierro, esenciales para la salud celular, aportando 56% de la ingesta  " +
                                                  "\n diaria recomendada de vitamina A por cada 100 g; Legumbres (frijoles, lentejas), que aportan proteínas y fibra, con 37%  " +
                                                  "\n de la ingesta diaria recomendada de hierro por cada 100 g. Este es solo un diagnóstico predeterminado lógico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas." +
                                                  "\n Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento     " +
                                                  "\n adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su   " +
                                                  "\n médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2 a 2.5 litros de agua al día (aproximadamente ocho a diez vasos de agua        " +
                                                  "\n de tamaño regular) para ayudar a la eliminación de toxinas y mantener la función renal óptima. Mantener una              " +
                                                  "\n hidratación adecuada también contribuye a la regulación de la temperatura corporal y al transporte eficiente de          " +
                                                  "\n nutrientes esenciales para la recuperación. EJERCICIO: Actividad física moderada como caminatas o ejercicios de          " +
                                                  "\n bajo impacto es recomendable para fortalecer el sistema inmunológico y mejorar la circulación, evitando el sobreesfuerzo." +
                                                  "\n El ejercicio regular ayuda a reducir el estrés, lo que puede mejorar la respuesta del sistema inmune y acelerar la       " +
                                                  "\n recuperación. POSIBLE TRATAMIENTO: El tratamiento estándar incluye antibióticos como Ceftriaxona (inyección única)       " +
                                                  "\n y Azitromicina (dosis oral), los cuales ayudan a eliminar la bacteria Neisseria gonorrhoeae. Es fundamental completar       " +
                                                  "\n el tratamiento indicado por el médico para evitar la resistencia bacteriana y prevenir complicaciones como la enfermedad    " +
                                                  "\n inflamatoria pélvica. ALIMENTACIÓN: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden  " +
                                                  "\n a reducir la inflamación, tales como: Naranjas (ricas en vitamina C, que fortalece el sistema inmune, aportando             " +
                                                  "\n aproximadamente 89% del requerimiento diario por cada 100 g); Espinacas (fuente de hierro, esencial para la producción      " +
                                                  "\n de glóbulos rojos, con 56% de la ingesta diaria recomendada por cada 100 g); Yogur natural (rico en probióticos, que        " +
                                                  "\n favorecen la salud intestinal y el sistema inmune, aportando 30% de la ingesta diaria recomendada de calcio por cada        " +
                                                  "\n 100 g). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga    " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico" +
                                                  "\n no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera" +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Para una mujer adulta con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidratación         " +
                                                  "\n óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda   " +
                                                  "\n actividad física moderada como yoga, pilates o caminatas suaves de 30 minutos al día para fortalecer el sistema           " +
                                                  "\n inmunológico y reducir el estrés, ya que el estrés puede desencadenar brotes de herpes. También es beneficioso realizar   " +
                                                  "\n ejercicios de respiración y relajación para mejorar la respuesta del cuerpo ante el virus. HIDRATACIÓN. Se aconseja       " +
                                                  "\n consumir al menos 2 litros de agua al día para mantener la piel hidratada y reducir la sequedad de las mucosas. Además,   " +
                                                  "\n el consumo de infusiones de manzanilla y té verde puede ayudar a reducir la inflamación y fortalecer el sistema           " +
                                                  "\n inmunológico. POSIBLE TRATAMIENTO. El tratamiento para el herpes genital incluye antivirales como aciclovir, famciclovir  " +
                                                  "\n y valaciclovir, que ayudan a reducir la duración y frecuencia de los brotes. Marcas reconocidas incluyen Zovirax y        " +
                                                  "\n Valtrex. También se recomienda el uso de cremas tópicas con propiedades calmantes para aliviar el malestar. ALIMENTACIÓN  " +
                                                  "\n RECOMENDADA. Se recomienda una dieta rica en lisina y antioxidantes para fortalecer el sistema inmunológico. Algunos      " +
                                                  "\n alimentos clave incluyen yogur y leche, ricos en lisina, que ayudan a inhibir la replicación del virus. Frutas cítricas   " +
                                                  "\n como naranja y kiwi, ricas en vitamina C, que fortalecen el sistema inmunológico, aportando aproximadamente el 89% del    " +
                                                  "\n requerimiento diario por cada 100 gramos de consumo. Verduras como espinaca y zanahoria, ricas en vitamina A, que         " +
                                                  "\n contribuyen a la regeneración celular y fortalecen las mucosas. Este diagnóstico es una referencia lógica basada en       " +
                                                  "\n información médica, pero no garantiza al 100% que el paciente tenga herpes genital ni que el tratamiento sea el adecuado. " +
                                                  "\n Se recomienda realizar más de un diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes agradece tu     " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n Para una mujer adulta con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidratación      " +
                                                  "\n óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se           " +
                                                  "\n recomienda actividad física moderada como caminatas diarias de 30 minutos, ejercicios de movilidad articular y         " +
                                                  "\n estiramientos para mejorar la circulación y fortalecer el sistema inmunológico. También es beneficioso realizar        " +
                                                  "\n ejercicios de resistencia con pesas ligeras para mejorar la salud ósea y muscular. HIDRATACIÓN. Se aconseja consumir   " +
                                                  "\n al menos 2.5 litros de agua al día para ayudar a eliminar toxinas del cuerpo y mejorar la circulación sanguínea.       " +
                                                  "\n También se recomienda el consumo de jugos naturales ricos en antioxidantes como el jugo de granada y té verde.         " + 
                                                  "\n POSIBLE TRATAMIENTO. El tratamiento estándar para la sífilis incluye antibióticos como penicilina G benzatina,         " +
                                                  "\n doxiciclina y ceftriaxona. Marcas reconocidas incluyen Benzetacil y Doxiciclina. Es crucial seguir el tratamiento      " +
                                                  "\n completo para evitar complicaciones. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica en proteínas, vitaminas    " +
                                                  "\n y minerales para fortalecer el sistema inmunológico. Algunos alimentos clave incluyen carnes magras y pescado, fuentes " +
                                                  "\n de proteínas esenciales. Frutas cítricas como naranja y limón, ricas en vitamina C, que ayudan a la recuperación y        " +
                                                  "\n fortalecimiento del sistema inmune. Verduras de hoja verde como espinaca y brócoli, que contienen hierro y antioxidantes  " +
                                                  "\n esenciales para la producción de glóbulos rojos. Este diagnóstico es una referencia lógica basada en información médica,  " +
                                                  "\n pero no garantiza al 100% que el paciente tenga sífilis ni que el tratamiento sea el adecuado. Se recomienda realizar más " +
                                                  "\n de un diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y    " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Para una mujer adulta con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidratación       " +
                                                  "\n óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se            " +
                                                  "\n recomienda actividad física moderada como caminatas diarias de 30 minutos, ejercicios de respiración profunda y yoga    " +
                                                  "\n para fortalecer los pulmones. También es beneficioso realizar ejercicios de movilidad para mejorar la capacidad         " + 
                                                  "\n pulmonar y reducir la fatiga. HIDRATACIÓN. Se aconseja consumir al menos 2.5 litros de agua al día para mantener        " +
                                                  "\n las vías respiratorias hidratadas y facilitar la eliminación de toxinas. También se recomienda el consumo de caldos     " +
                                                  "\n naturales y jugos cítricos para fortalecer el sistema inmunológico. POSIBLE TRATAMIENTO. El tratamiento estándar para   " +
                                                  "\n la tuberculosis incluye una combinación de antibióticos como isoniazida, rifampicina, etambutol y pirazinamida. Marcas  " +
                                                  "\n reconocidas incluyen Rifater y Rimactane. Es crucial seguir el tratamiento completo para evitar resistencia a los          " +
                                                  "\n antibióticos. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica en proteínas, vitaminas y minerales para fortalecer   " +
                                                  "\n el sistema inmunológico. Algunos alimentos clave incluyen carnes magras y pescado, fuentes de proteínas esenciales.        " +
                                                  "\n Frutas cítricas como naranja y kiwi, ricas en vitamina C, que ayudan a la recuperación y fortalecimiento del sistema       " +
                                                  "\n inmune. Verduras de hoja verde como espinaca y brócoli, que contienen hierro y antioxidantes esenciales para la producción " +
                                                  "\n de glóbulos rojos. Este diagnóstico es una referencia lógica basada en información médica, pero no garantiza al 100% que el " +
                                                  "\n paciente tenga tuberculosis ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar " +
                                                  "\n a un médico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n La artritis es una inflamación de las articulaciones que puede causar dolor, rigidez y disminución de la movilidad.         " +
                                                  "\n Existen diferentes tipos, como la osteoartritis y la artritis reumatoide, que pueden afectar la calidad de vida.            " +
                                                  "\n EJERCICIO. Se recomienda actividad física moderada para mejorar la movilidad y reducir la rigidez articular. Ejercicios     " +
                                                  "\n de bajo impacto como natación, yoga y caminatas pueden ser beneficiosos. También se sugiere realizar ejercicios de          " +
                                                  "\n fortalecimiento muscular para mejorar el soporte de las articulaciones. HIDRATACIÓN. Es fundamental consumir entre 2 y      " +
                                                  "\n 2.5 litros de agua al día para mantener la lubricación de las articulaciones y reducir la inflamación. Se recomienda        " +
                                                  "\n complementar la ingesta de agua con infusiones de cúrcuma y jengibre, que poseen propiedades antiinflamatorias. POSIBLE     " +
                                                  "\n TRATAMIENTO. La artritis se trata con medicamentos antiinflamatorios no esteroides como ibuprofeno y naproxeno, que ayudan  " +
                                                  "\n a reducir el dolor y la inflamación. También pueden utilizarse corticosteroides y fármacos modificadores de la enfermedad   " +
                                                  "\n como el metotrexato en casos más severos. ALIMENTACIÓN RECOMENDADA. Consumir alimentos ricos en antioxidantes y ácidos      " +
                                                  "\n grasos esenciales para reducir la inflamación. Pescados grasos como salmón y atún, ricos en ácidos grasos Omega-3, que      " +
                                                  "\n poseen propiedades antiinflamatorias y pueden ayudar a reducir la inflamación articular. Frutas y verduras de colores vivos " +
                                                  "\n como arándanos, fresas, espinacas y brócoli, ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger  " +
                                                  "\n las células del daño y fortalecer el sistema inmunológico. Jengibre, que contiene compuestos con efectos antiinflamatorios  " +
                                                  "\n que podrían ser beneficiosos para las articulaciones. Cúrcuma, con su componente activo, la curcumina, que tiene potentes   " +
                                                  "\n propiedades antiinflamatorias y antioxidantes. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no     " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para  " +
                                                  "\n ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su  " +
                                                  "\n paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a   " +
                                                  "\n su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n La tosferina, también conocida como pertussis, es una infección bacteriana altamente contagiosa que afecta las vías       " +
                                                  "\n respiratorias y causa episodios de tos intensa. EJERCICIO. Se recomienda actividad física ligera mientras persistan       " +
                                                  "\n los síntomas, evitando esfuerzos intensos que puedan agravar la fatiga y la dificultad respiratoria. Caminar y realizar   " +
                                                  "\n ejercicios de respiración profunda pueden ser beneficiosos para mejorar la oxigenación. HIDRATACIÓN. Es fundamental       " +
                                                  "\n consumir entre 2 y 2.5 litros de agua al día para mantener las vías respiratorias hidratadas y facilitar la eliminación   " +
                                                  "\n de mucosidad. Se recomienda el consumo de líquidos tibios como té de jengibre o infusiones de hierbas para aliviar la     " +
                                                  "\n irritación pulmonar. POSIBLE TRATAMIENTO. La tosferina se trata con antibióticos como azitromicina, claritromicina o      " +
                                                  "\n eritromicina, que ayudan a eliminar la bacteria. También se recomienda el uso de broncodilatadores en casos de dificultad " +
                                                  "\n respiratoria severa. ALIMENTACIÓN RECOMENDADA. Consumir alimentos ricos en antioxidantes y nutrientes esenciales para     " +
                                                  "\n fortalecer el sistema respiratorio. Frutas cítricas como naranja y toronja, ricas en vitamina C, que contribuyen a la     " +
                                                  "\n recuperación, aportando aproximadamente el 89% del requerimiento diario por cada 100 g. Miel, con propiedades antimicrobianas  " +
                                                  "\n y antiinflamatorias que pueden ayudar a aliviar la irritación de la garganta. Jengibre, que contiene compuestos con            " +
                                                  "\n efectos antiinflamatorios que podrían ser beneficiosos para las vías respiratorias. Este es solo un diagnóstico predeterminado " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus     " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad  " +
                                                  "\n en el tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se  " +
                                                  "\n le recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Las paperas son una infección viral que afecta las glándulas salivales, causando inflamación y dolor en la zona.          " +
                                                  "\n EJERCICIO. Se recomienda actividad física ligera mientras persistan los síntomas, evitando esfuerzos intensos que         " +
                                                  "\n puedan agravar la fatiga. Caminar y realizar estiramientos suaves pueden ser beneficiosos para mantener la circulación    " +
                                                  "\n y el bienestar general. HIDRATACIÓN. Es fundamental consumir entre 2 y 2.5 litros de agua al día para ayudar al cuerpo    " +
                                                  "\n a combatir la infección y mantenerse hidratado. Se recomienda complementar la ingesta de agua con líquidos ricos en       " +
                                                  "\n electrolitos como sueros orales o agua de coco, que pueden ayudar a reponer minerales esenciales perdidos por la fiebre   " +
                                                  "\n y sudoración. POSIBLE TRATAMIENTO. No existe un tratamiento antiviral específico para las paperas. Se recomienda el uso   " +
                                                  "\n de paracetamol para aliviar la fiebre y el dolor, evitando el ibuprofeno y la aspirina, ya que pueden aumentar el riesgo  " +
                                                  "\n de sangrado. También se sugiere el uso de compresas frías para reducir la inflamación de las glándulas salivales.         " +
                                                  "\n ALIMENTACIÓN RECOMENDADA. Consumir alimentos ricos en antioxidantes y vitaminas para fortalecer el sistema inmunológico.  " +
                                                  "\n Frutas cítricas como naranja y toronja, ricas en vitamina C, que contribuyen a la recuperación, aportando aproximadamente " +
                                                  "\n el 89% del requerimiento diario por cada 100 g. Yogur natural, fuente de probióticos que ayudan a fortalecer la flora     " +
                                                  "\n intestinal y mejorar la respuesta inmune. Verduras de hoja verde como espinaca y acelga, que contienen hierro y antioxidantes " +
                                                  "\n esenciales para la recuperación, proporcionando hasta el 15% del requerimiento diario de hierro por cada 100 g. Este es   " +
                                                  "\n solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad   " +
                                                  "\n y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de     " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta    " +
                                                  "\n del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita  " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n EJERCICIO: Durante la infección por el virus del Zika, se recomienda evitar esfuerzos físicos intensos y priorizar        " +
                                                  "\n el descanso. Una vez que los síntomas disminuyen, se pueden realizar ejercicios de bajo impacto como caminatas            " +
                                                  "\n suaves o yoga para mejorar la circulación y reducir la fatiga. También es importante realizar ejercicios de respiración   " +
                                                  "\n profunda para mejorar la oxigenación celular y reducir la inflamación. HIDRATACIÓN: Es fundamental consumir al menos      " +
                                                  "\n 2.5 litros de agua al día para prevenir la deshidratación y ayudar a la eliminación de toxinas. También se recomienda     " +
                                                  "\n el consumo de jugos naturales sin azúcar y caldos ligeros para mantener el equilibrio de electrolitos. La hidratación     " +
                                                  "\n adecuada contribuye a la regulación de la temperatura corporal y ayuda a reducir la fiebre, uno de los síntomas comunes   " +
                                                  "\n del Zika. POSIBLE TRATAMIENTO: No existe un tratamiento específico para el Zika, pero los síntomas pueden aliviarse con   " +
                                                  "\n reposo, hidratación y medicamentos como acetaminofén para reducir la fiebre y el dolor. Se recomienda evitar el uso de    " +
                                                  "\n aspirina y otros antiinflamatorios no esteroideos hasta descartar la posibilidad de dengue. Además, el consumo de         " +
                                                  "\n alimentos ricos en antioxidantes puede ayudar a reducir la inflamación y fortalecer el sistema inmunológico. ALIMENTACIÓN:" +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema           " +
                                                  "\n inmunológico, tales como frutas cítricas como naranjas y toronjas, que aportan vitamina C en un 89% de la ingesta diaria  " +
                                                  "\n recomendada, ayudando a combatir infecciones. Verduras de hoja verde como espinacas y acelgas, que aportan hasta un 50%   " +
                                                  "\n de la ingesta diaria recomendada de vitamina A y K, esenciales para la regeneración celular. Jengibre y cúrcuma, que      " +
                                                  "\n poseen propiedades antiinflamatorias y antioxidantes, contribuyendo con hasta un 40% de la ingesta diaria recomendada de  " +
                                                  "\n compuestos bioactivos beneficiosos para la salud. este es solo un diagnóstico predeterminado lógico. haberlo consultado   " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda " +
                                                  "\n realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud, si la respuesta del  " +
                                                  "\n diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app  " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n EJERCICIO: Durante la infección por rotavirus, se recomienda evitar esfuerzos físicos intensos y priorizar            " +
                                                  "\n el descanso. Una vez que los síntomas disminuyen, se pueden realizar ejercicios de bajo impacto como caminatas        " +
                                                  "\n suaves para mejorar la recuperación. También es recomendable realizar ejercicios de respiración para mejorar          " +
                                                  "\n la oxigenación celular y reducir la fatiga. HIDRATACIÓN: Es crucial el consumo de al menos 2.5 litros de agua         " +
                                                  "\n al día para prevenir la deshidratación causada por la diarrea y los vómitos. También se recomienda el consumo         " +
                                                  "\n de soluciones de rehidratación oral para reponer los electrolitos perdidos. La hidratación adecuada ayuda a           " +
                                                  "\n reducir la irritación intestinal y mejora la absorción de nutrientes esenciales para la recuperación. POSIBLE         " +
                                                  "\n TRATAMIENTO: No existe un tratamiento específico para el rotavirus, pero los síntomas pueden aliviarse con            " +
                                                  "\n hidratación adecuada y reposo. Se recomienda evitar el uso de medicamentos antidiarreicos, ya que pueden prolongar    " +
                                                  "\n la infección. Además, el consumo de alimentos ricos en probióticos puede ayudar a restaurar la flora intestinal       " +
                                                  "\n y mejorar la digestión. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes       " +
                                                  "\n esenciales para fortalecer el sistema digestivo, tales como yogur natural, que contiene probióticos que favorecen     " +
                                                  "\n la salud intestinal y el equilibrio de la flora digestiva. Frutas como plátanos y manzanas, que aportan fibra         " +
                                                  "\n soluble y ayudan a regular el tránsito intestinal. Verduras como zanahorias y calabacines, que contienen antioxidantes" +
                                                  "\n y vitaminas esenciales para la recuperación digestiva. este es solo un diagnóstico predeterminado lógico. haberlo     " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente        " +
                                                  "\n correctas. se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. además,      " +
                                                  "\n por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.          " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n EJERCICIO: Durante la infección por listeria, se recomienda evitar esfuerzos físicos intensos y priorizar el descanso.  " +
                                                  "\n Una vez que los síntomas disminuyen, se pueden realizar ejercicios de bajo impacto como caminatas suaves para mejorar   " +
                                                  "\n la recuperación. También es recomendable realizar ejercicios de respiración para mejorar la oxigenación celular y       " +
                                                  "\n reducir la fatiga. HIDRATACIÓN: Es fundamental consumir al menos 2.5 litros de agua al día para ayudar a eliminar       " +  
                                                  "\n toxinas y mantener el equilibrio de los fluidos corporales. También se recomienda el consumo de caldos naturales y      " +
                                                  "\n jugos sin azúcar para aportar electrolitos esenciales. La hidratación adecuada contribuye a la eliminación de bacterias " +
                                                  "\n y toxinas del organismo, ayudando a acelerar la recuperación. POSIBLE TRATAMIENTO: La infección por listeria puede      " +
                                                  "\n tratarse con antibióticos como ampicilina o gentamicina en casos graves. Durante el embarazo, el tratamiento inmediato  " +
                                                  "\n con antibióticos puede ayudar a impedir que la infección afecte al bebé. Además, el consumo de alimentos ricos en       " +
                                                  "\n antioxidantes y vitaminas esenciales puede ayudar a fortalecer el sistema inmunológico y mejorar la respuesta del       " +
                                                  "\n organismo ante la infección. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes    " +
                                                  "\n esenciales para fortalecer el sistema inmunológico, tales como frutas cítricas como naranjas y toronjas, que aportan    " +
                                                  "\n vitamina C en un 89% de la ingesta diaria recomendada, ayudando a combatir infecciones. Verduras de hoja verde como     " +
                                                  "\n espinacas y acelgas, que aportan hasta un 50% de la ingesta diaria recomendada de vitamina A y K, esenciales para la    " + 
                                                  "\n regeneración celular. Frutos secos como almendras y nueces, que contienen vitamina E y magnesio, contribuyendo con      " +
                                                  "\n hasta un 40% de la ingesta diaria recomendada de estos nutrientes esenciales para la recuperación neurológica. este     " +
                                                  "\n es solo un diagnóstico predeterminado lógico. haberlo consultado no garantiza al 100% que la paciente tenga esta        " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar más de un diagnóstico para mayor  " +
                                                  "\n seguridad en el tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico no le satisface del todo,   " +
                                                  "\n se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la shigelosis es fundamental mantener una hidratación adecuada con un consumo        " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a la             " +
                                                  "\n recuperación y prevenir la deshidratación causada por la diarrea. EJERCICIO: Se recomienda actividad física moderada     " +
                                                  "\n como caminatas suaves evitando esfuerzos intensos mientras persistan los síntomas. Una vez superada la fase aguda es     " +
                                                  "\n recomendable realizar ejercicios de movilidad y fortalecimiento muscular para recuperar energía y mejorar la función     " +
                                                  "\n digestiva. POSIBLE TRATAMIENTO: El tratamiento suele incluir antibióticos como la ciprofloxacina o la azitromicina en    " +
                                                  "\n casos más severos los médicos pueden recetar ceftriaxona. Es importante seguir las indicaciones médicas y evitar la      " +
                                                  "\n automedicación. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunológico y acelerar la recuperación se recomienda " +
                                                  "\n el consumo de PLÁTANOS: Ricos en potasio que ayuda a reemplazar los electrolitos perdidos debido a la diarrea aportando  " +
                                                  "\n aproximadamente el 12% de la ingesta diaria recomendada por cada 100 gramos. ARROZ BLANCO: Fuente de carbohidratos de    " +
                                                  "\n fácil digestión que ayuda a estabilizar el sistema digestivo. ZANAHORIAS: Ricas en vitamina A y antioxidantes que ayudan " +
                                                  "\n a la regeneración celular aportando aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR   " +
                                                  "\n NATURAL: Contiene probióticos que pueden fortalecer el sistema digestivo y mejorar la salud intestinal aportando calcio    " +
                                                  "\n y proteínas esenciales. Este es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza al 100% que el   " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer más de un  " +
                                                  "\n Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente además por su salud si la " +
                                                  "\n respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico Angel L Montes agradece tu " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la EPOC es fundamental mantener una hidratación adecuada con un consumo diario         " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a mantener las vías       " +
                                                  "\n respiratorias hidratadas y reducir la acumulación de mucosidad. EJERCICIO: Se recomienda actividad física moderada         " +
                                                  "\n como caminatas natación o ejercicios de resistencia para mejorar la capacidad pulmonar y fortalecer los músculos           " +
                                                  "\n respiratorios. Además se recomienda la práctica de ejercicios de respiración profunda como técnicas de relajación          " +
                                                  "\n y yoga para mejorar la oxigenación y reducir la sensación de falta de aire. POSIBLE TRATAMIENTO: El tratamiento suele      " +
                                                  "\n incluir broncodilatadores de acción rápida como el salbutamol corticosteroides inhalados para el control a largo plazo     " +
                                                  "\n como la fluticasona y en algunos casos terapia con oxígeno. Es fundamental seguir estrictamente el plan de acción para     " +
                                                  "\n la EPOC indicado por el médico y evitar la exposición a contaminantes ambientales. ALIMENTOS RECOMENDADOS: Para fortalecer " +
                                                  "\n el sistema respiratorio y reducir la inflamación se recomienda el consumo de PESCADOS GRASOS: Salmón y atún ricos en       " +
                                                  "\n ácidos grasos Omega-3 que poseen propiedades antiinflamatorias que pueden ayudar a reducir la inflamación de las vías      " +
                                                  "\n respiratorias aportando aproximadamente el 50% de la ingesta diaria recomendada por cada 100 gramos. FRUTAS Y VERDURAS     " +
                                                  "\n DE COLORES VIVOS: Arándanos fresas espinacas brócoli ricos en antioxidantes como la vitamina C y carotenoides que pueden   " +
                                                  "\n proteger las células del daño y fortalecer el sistema inmunológico aportando aproximadamente el 70% de la ingesta diaria   " +
                                                  "\n recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos con efectos antiinflamatorios que podrían ser beneficiosos       " +
                                                  "\n para las vías respiratorias. CÚRCUMA: Con su componente activo la curcumina también tiene potentes propiedades antiinflamatorias " +
                                                  "\n y antioxidantes. Este es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza al 100% que el paciente    " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer más de un Diagnóstico  " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente además por su salud si la respuesta del  " +
                                                  "\n Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico Angel L Montes agradece tu visita a la app  " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la clamidia es fundamental mantener una hidratación adecuada con un consumo diario        " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a la eliminación de          " +
                                                  "\n toxinas y fortalecer el sistema inmunológico. EJERCICIO: Se recomienda actividad física moderada como caminatas natación      " +
                                                  "\n o ejercicios de resistencia para mejorar la circulación sanguínea y fortalecer el sistema inmunológico. Además se             " +
                                                  "\n recomienda la práctica de ejercicios de relajación como yoga o meditación para reducir el estrés que puede afectar la         " +
                                                  "\n respuesta inmunológica. POSIBLE TRATAMIENTO: El tratamiento suele incluir antibióticos como la azitromicina o la doxiciclina  " +
                                                  "\n en casos más severos los médicos pueden recetar levofloxacina. Es fundamental seguir estrictamente el tratamiento indicado    " +
                                                  "\n por el médico y evitar la automedicación. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunológico y acelerar la       " +
                                                  "\n recuperación se recomienda el consumo de FRUTOS ROJOS: Ricos en antioxidantes y vitamina C que ayudan a fortalecer el sistema " +
                                                  "\n inmunológico aportando aproximadamente el 70% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene        " +
                                                  "\n compuestos con propiedades antiinflamatorias y puede ayudar a reducir la inflamación. ESPINACAS Y BRÓCOLI: Aportan            " +
                                                  "\n antioxidantes y vitamina A esenciales para la regeneración celular con un contenido de aproximadamente 56% de la ingesta      " +
                                                  "\n diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probióticos que pueden fortalecer el sistema inmunológico     " +
                                                  "\n y mejorar la salud digestiva aportando calcio y proteínas esenciales. Este es solo un diagnóstico predeterminado lógico       " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente        " +
                                                  "\n correctas para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento    " +
                                                  "\n adecuado de su paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho   " +
                                                  "\n consultar a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 a 3 litros de agua al día (aproximadamente diez a doce vasos de agua          " +
                                                  "\n de tamaño regular) para ayudar a la eliminación de toxinas y mantener la función cerebral óptima. La hidratación           " +
                                                  "\n adecuada también contribuye a la regulación de la temperatura corporal y al transporte eficiente de nutrientes             " +
                                                  "\n esenciales para la recuperación. EJERCICIO: Actividad física moderada como caminatas y ejercicios de respiración           " +
                                                  "\n pueden ayudar a mejorar la oxigenación y reducir la fatiga. Es importante evitar el sobreesfuerzo y realizar actividad     " +
                                                  "\n en ambientes bien ventilados para reducir el riesgo de complicaciones neurológicas. También se recomienda la práctica      " +
                                                  "\n de ejercicios de relajación y estiramiento, que pueden mejorar la circulación sanguínea y reducir la tensión muscular.     " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento estándar incluye antibióticos intravenosos como Ceftriaxona, Cefotaxima y Ampicilina,  " +
                                                  "\n dependiendo del tipo de bacteria causante. En algunos casos, se pueden administrar corticosteroides para reducir la        " +
                                                  "\n inflamación cerebral y prevenir complicaciones. Es fundamental seguir el tratamiento completo para evitar recaídas y       " +
                                                  "\n posibles daños neurológicos. Además, en casos graves, puede ser necesario el uso de medicación anticonvulsiva para         " +
                                                  "\n controlar posibles crisis epilépticas derivadas de la inflamación cerebral. También se recomienda un seguimiento médico    " +
                                                  "\n constante para evaluar la respuesta al tratamiento y prevenir secuelas neurológicas. ALIMENTACIÓN: Se recomienda el        " +
                                                  "\n consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a mejorar la función cerebral, tales como: Naranjas  " +
                                                  "\n (ricas en vitamina C, que fortalece el sistema inmune, aportando aproximadamente 89% del requerimiento diario por cada     " +
                                                  "\n 100 g); Aguacate (fuente de grasas saludables y antioxidantes, con 14% de la ingesta diaria recomendada de vitamina E por  " +
                                                  "\n cada 100 g); Pescados grasos (salmón, atún, ricos en Omega-3, que pueden ayudar a reducir la inflamación cerebral,         " +
                                                  "\n aportando cerca de 50% de la ingesta diaria recomendada por cada porción de 100 g). Este es solo un diagnóstico            " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor     " +
                                                  "\n seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se   " +
                                                  "\n recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 a 3 litros de agua al día (aproximadamente diez a doce vasos de agua de        " +
                                                  "\n tamaño regular) para ayudar a la eliminación de toxinas y mejorar la función celular. La hidratación adecuada también       " +
                                                  "\n contribuye a la regulación de la temperatura corporal y al transporte eficiente de nutrientes esenciales para la            " +
                                                  "\n recuperación. Además, el consumo de infusiones antioxidantes como té verde y jengibre puede ayudar a reducir el estrés      " +
                                                  "\n oxidativo en el cuerpo. EJERCICIO: Actividad física moderada como caminatas, yoga y ejercicios de resistencia pueden        " +
                                                  "\n ayudar a mejorar la circulación sanguínea y reducir la fatiga. Es importante adaptar la actividad física al estado de       " +
                                                  "\n salud de la paciente y realizar ejercicios que fortalezcan el sistema inmunológico. También se recomienda la práctica       " +
                                                  "\n de ejercicios de respiración y relajación, que pueden mejorar la respuesta del cuerpo al tratamiento y reducir el estrés.   " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento estándar incluye quimioterapia, radioterapia, inmunoterapia y cirugía, dependiendo      " +
                                                  "\n del tipo y estadio del cáncer. En algunos casos, se pueden administrar terapias dirigidas para atacar células cancerosas    " +
                                                  "\n específicas. Es fundamental seguir el tratamiento indicado por el médico y realizar controles periódicos para evaluar la    " +
                                                  "\n respuesta del cuerpo. Además, se recomienda el uso de medicación para el manejo de efectos secundarios, como antieméticos   " +
                                                  "\n para controlar las náuseas, analgésicos para el dolor y suplementos nutricionales para evitar la pérdida de peso. En        " +
                                                  "\n algunos casos, la terapia hormonal puede ser una opción para ciertos tipos de cáncer, como el de mama o próstata. También   " +
                                                  "\n es importante el apoyo psicológico y emocional para mejorar la calidad de vida durante el tratamiento. ALIMENTACIÓN:        " +
                                                  "\n Se recomienda el consumo de alimentos que fortalezcan el sistema inmunológico y ayuden a reducir la inflamación, tales      " +
                                                  "\n como: Frutas cítricas (naranjas, toronjas, limones), ricas en vitamina C, que fortalece el sistema inmune, aportando        " +
                                                  "\n aproximadamente 89% del requerimiento diario por cada 100 g; Aguacate, fuente de grasas saludables y antioxidantes,         " +
                                                  "\n con 14% de la ingesta diaria recomendada de vitamina E por cada 100 g; Pescados grasos (salmón, atún), ricos en Omega-3,    " +
                                                  "\n que pueden ayudar a reducir la inflamación, aportando cerca de 50% de la ingesta diaria recomendada por cada porción        " +
                                                  "\n de 100 g; Verduras de hoja verde (espinacas, kale), con vitamina A y hierro, esenciales para la salud celular, aportando    " +
                                                  "\n 56% de la ingesta diaria recomendada de vitamina A por cada 100 g; Legumbres (frijoles, lentejas), que aportan proteínas    " +
                                                  "\n y fibra, con 37% de la ingesta diaria recomendada de hierro por cada 100 g. Este es solo un diagnóstico predeterminado      " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean            " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor           " +
                                                  "\n seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo,       " +
                                                  "\n se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                    }
                }
             if (EdadFemenino.equals("Adultez = 30 - 59 años")) {
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