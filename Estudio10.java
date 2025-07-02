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
         private final String edadEsperada = "Juventud = 22-29 años";
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
                 if(EdadFemenino.equals("Juventud = 22-29 años")){
                        if(EstaturaFemenino.equals("0.80-1.35 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para          " +
                                                  "\n mantener una hidratación adecuada. Esto ayuda a reducir la congestión, mantener la mucosa respiratoria hidratada y         " +
                                                  "\n favorecer la eliminación de toxinas. EJERCICIO: Se aconseja actividad física moderada diariamente, evitando esfuerzos      " +
                                                  "\n excesivos mientras persistan los síntomas. Se recomienda al menos 30 minutos de ejercicio ligero, como caminatas o         " +
                                                  "\n estiramientos, lo cual ayuda a mejorar la circulación, fortalecer el sistema inmune y promover una recuperación más        " +
                                                  "\n efectiva. POSIBLE TRATAMIENTO: Para la gripe en mujeres jóvenes, el tratamiento suele incluir medicamentos para reducir    " +
                                                  "\n la fiebre y aliviar los síntomas, como el paracetamol (marca común en México: Tempra) o el ibuprofeno. También pueden      " +
                                                  "\n utilizarse antivirales específicos contra la gripe, como el oseltamivir (marca común: Tamiflu), en casos más severos o     " +
                                                  "\n bajo indicación médica. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en vitaminas, minerales y antioxidantes  " +
                                                  "\n para fortalecer el sistema inmunológico y combatir los síntomas de la gripe: Naranjas y mandarinas: Ricas en vitamina C    " +
                                                  "\n (hasta un 89% del requerimiento diario por cada 100g), esenciales para reducir la duración de los síntomas y mejorar la    " +
                                                  "\n respuesta inmune. Fresas y arándanos: Contienen antioxidantes y vitamina C (hasta un 65% del requerimiento diario en 100g  " +
                                                  "\n de fresas) que protegen las células del daño causado por la infección. Jengibre: Posee propiedades antiinflamatorias y     " +
                                                  "\n antioxidantes que pueden aliviar la congestión y el malestar general. Espinacas y brócoli: Ricos en vitamina A (hasta      " +
                                                  "\n un 56% del requerimiento diario en 100g de espinaca) y vitamina C (hasta un 107% del requerimiento diario en 100g de       " +
                                                  "\n brócoli), esenciales para fortalecer el sistema inmunológico y acelerar la recuperación. Este es solo un diagnóstico       " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la      " +
                                                  "\n enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para           " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, además, por su salud, si la respuesta del            " +
                                                  "\n diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita      " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tamaño regular) para          " +
                                                  "\n mantener una hidratación adecuada. Esto ayuda a fluidificar las secreciones pulmonares, facilitando su expulsión y         " +
                                                  "\n reduciendo la congestión respiratoria. EJERCICIO: Se aconseja actividad física ligera y progresiva, evitando esfuerzos     " +
                                                  "\n intensos mientras persistan los síntomas. Se recomienda caminatas suaves de 15 a 30 minutos diarios para mejorar la        " +
                                                  "\n oxigenación y la recuperación pulmonar. POSIBLE TRATAMIENTO: Para la neumonía en mujeres jóvenes, el tratamiento suele     " +
                                                  "\n incluir antibióticos en caso de infección bacteriana, como la amoxicilina (marca común en México: Amoxil) o la             " +
                                                  "\n azitromicina. También pueden utilizarse medicamentos para reducir la fiebre y aliviar los síntomas, como el paracetamol    " +
                                                  "\n o el ibuprofeno. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales para        " +
                                                  "\n fortalecer el sistema inmunológico y mejorar la función pulmonar: Naranjas y mandarinas: Ricas en vitamina C (hasta un     " +
                                                  "\n 89% del requerimiento diario por cada 100g), esenciales para mejorar la respuesta inmune. Jengibre: Posee propiedades      " +
                                                  "\n antiinflamatorias y antioxidantes que pueden aliviar la congestión. Espinacas y brócoli: Ricos en vitamina A (hasta un     " +
                                                  "\n 56% del requerimiento diario en 100g de espinaca) y vitamina C (hasta un 107% del requerimiento diario en 100g de brócoli)," +
                                                  "\n esenciales para fortalecer el sistema inmunológico y acelerar la recuperación. Ajo: Contiene alicina, un compuesto con     " +
                                                  "\n propiedades antimicrobianas que puede ayudar a combatir infecciones respiratorias. Este es solo un diagnóstico predeterminado " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus       " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad    " +
                                                  "\n en el tratamiento adecuado de su paciente, además, por su salud, si la respuesta del diagnóstico no le satisface del todo,    " +
                                                  "\n se le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para        " +
                                                  "\n mantener una hidratación adecuada y ayudar a regular los niveles de glucosa en sangre. EJERCICIO: Se aconseja            " +
                                                  "\n actividad física regular, como caminatas de 30 a 60 minutos diarios, ejercicios de resistencia o yoga, lo cual ayuda     " +
                                                  "\n a mejorar la sensibilidad a la insulina y controlar los niveles de azúcar en sangre. POSIBLE TRATAMIENTO: Para la        " +
                                                  "\n diabetes en mujeres jóvenes, el tratamiento suele incluir medicamentos para controlar la glucosa, como la metformina     " +
                                                  "\n (marca común en México: Glucophage) o insulina en casos específicos. También se recomienda el monitoreo constante de     " +
                                                  "\n los niveles de glucosa y una dieta equilibrada. ALIMENTACIÓN: Se recomienda el consumo de alimentos con bajo índice      " +
                                                  "\n glucémico y ricos en nutrientes esenciales para el control de la diabetes: Aguacate: Rico en grasas saludables y fibra,  " +
                                                  "\n ayuda a estabilizar los niveles de glucosa. Frutos rojos (arándanos, fresas): Contienen antioxidantes y vitamina C       " +
                                                  "\n (hasta un 65% del requerimiento diario en 100g de fresas), que pueden mejorar la sensibilidad a la insulina. Espinacas   " +
                                                  "\n y brócoli: Ricos en magnesio (hasta un 20% del requerimiento diario en 100g de espinaca), esencial para la regulación    " +
                                                  "\n de la glucosa. Canela: Contiene compuestos que pueden mejorar la sensibilidad a la insulina y reducir los niveles de     " +
                                                  "\n azúcar en sangre. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la      " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda     " +
                                                  "\n hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además," +
                                                  "\n por su salud, si la respuesta del diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico.    " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma. " +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para         " +
                                                  "\n mantener las vías respiratorias hidratadas y reducir la viscosidad de las secreciones bronquiales. EJERCICIO: Se          " +
                                                  "\n aconseja actividad física controlada y supervisada, con calentamiento previo y enfriamiento posterior, evitando           " +
                                                  "\n desencadenantes del asma como alérgenos o aire frío. Se recomienda ejercicios de bajo impacto como natación o yoga.       " +
                                                  "\n POSIBLE TRATAMIENTO: Para el asma en mujeres jóvenes, el tratamiento suele incluir broncodilatadores de alivio rápido,    " +
                                                  "\n como el salbutamol (marca común en México: Ventolin o Aerolin), corticosteroides inhalados para el control a largo        " +
                                                  "\n plazo, como la fluticasona o budesonida (marcas comunes: Flixotide o Pulmicort), y en algunos casos, modificadores        " +
                                                  "\n de leucotrienos como el montelukast (marca común: Singulair). ALIMENTACIÓN: Se recomienda el consumo de alimentos         " +
                                                  "\n con propiedades antiinflamatorias y antioxidantes para mejorar la función pulmonar: Pescados grasos (salmón, atún):       " +
                                                  "\n Ricos en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias. Frutas y verduras de colores vivos (arándanos,  " +
                                                  "\n fresas, espinacas, brócoli): Ricas en antioxidantes como la vitamina C (hasta un 107% del requerimiento diario en 100g    " +
                                                  "\n de brócoli) y carotenoides, que pueden proteger las células del daño. Jengibre: Contiene compuestos con efectos           " +
                                                  "\n antiinflamatorios que podrían ser beneficiosos para las vías respiratorias. Cúrcuma: Con su componente activo, la         " +
                                                  "\n curcumina, tiene potentes propiedades antiinflamatorias y antioxidantes. Este es solo un diagnóstico predeterminado       " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y       " +
                                                  "\n sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor      " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además, por su salud, si la respuesta del diagnóstico no le          " +
                                                  "\n satisface del todo, se le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida)    " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2.5 a 3 litros de agua al día, ya que la hidratación adecuada es fundamental        " +
                                                  "\n para el funcionamiento del sistema inmunológico y la eliminación de toxinas. Además, el agua ayuda a reducir la fatiga       " +
                                                  "\n y mejorar la absorción de los medicamentos antirretrovirales. Se sugiere complementar con infusiones naturales como té       " +
                                                  "\n verde o manzanilla, que poseen propiedades antioxidantes y antiinflamatorias. EJERCICIO. La actividad física regular es      " +
                                                  "\n clave para fortalecer el sistema inmunológico y mejorar la salud cardiovascular. Se recomienda realizar ejercicio aeróbico   " +
                                                  "\n moderado al menos 30 minutos al día, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo. También es         " +
                                                  "\n beneficioso incluir ejercicios de resistencia como levantamiento de pesas ligeras o yoga, que ayudan a mantener la masa      " +
                                                  "\n muscular y reducir el estrés. POSIBLE TRATAMIENTO. El tratamiento estándar incluye terapia antirretroviral (TAR) con         " +
                                                  "\n medicamentos como tenofovir, emtricitabina y dolutegravir, que ayudan a controlar la replicación del virus y mejorar         " +
                                                  "\n la calidad de vida. Marcas reconocidas incluyen Atripla, Truvada, Tivicay y Biktarvy, las cuales han demostrado eficacia     " +
                                                  "\n en el manejo del VIH/SIDA. ALIMENTACIÓN. Para fortalecer el sistema inmunológico y reducir la inflamación, se recomienda     " +
                                                  "\n consumir frutas cítricas como naranja, limón y toronja, que son ricas en vitamina C, la cual contribuye a la producción      " +
                                                  "\n de glóbulos blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento diario por cada 100     " +
                                                  "\n gramos. Verduras de hoja verde como espinaca, kale y acelga, que contienen ácido fólico, esencial para la producción de      " +
                                                  "\n células sanguíneas, aportando cerca del 65% del requerimiento diario por cada 100 gramos. Pescados grasos como salmón,       " +
                                                  "\n atún y sardina, que son ricos en Omega-3, el cual tiene propiedades antiinflamatorias y aporta alrededor del 50% del         " +
                                                  "\n requerimiento diario por porción de 100 gramos. Frutos secos como almendras, nueces y semillas de chía, que aportan          " +
                                                  "\n vitamina E, la cual protege las células del daño oxidativo y contribuye con el 70% del requerimiento diario por cada         " +
                                                  "\n 30 gramos. Legumbres como lentejas, garbanzos y frijoles, que son fuente de proteínas y hierro, esenciales para la energía   " +
                                                  "\n y la regeneración celular, aportando cerca del 40% del requerimiento diario por cada 100 gramos. Este es solo un             " +
                                                  "\n diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni          " +
                                                  "\n que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar         " +
                                                  "\n a un médico especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2 a 2.5 litros de agua al día, ya que una hidratación adecuada ayuda a                 " +
                                                  "\n eliminar toxinas y mantener el equilibrio del sistema inmunológico. También es beneficioso complementar con                     " +
                                                  "\n infusiones naturales como té verde o manzanilla, que poseen propiedades antibacterianas y antiinflamatorias. EJERCICIO.         " +
                                                  "\n La actividad física moderada es clave para fortalecer el sistema inmunológico y mejorar la circulación sanguínea.               " +
                                                  "\n Se recomienda realizar ejercicio aeróbico moderado al menos 30 minutos al día, como caminar, nadar o andar en bicicleta,        " +
                                                  "\n evitando el sobreesfuerzo. También es beneficioso incluir ejercicios de resistencia como levantamiento de pesas ligeras         " +
                                                  "\n o yoga, que ayudan a mantener la masa muscular y reducir el estrés. POSIBLE TRATAMIENTO. El tratamiento estándar incluye        " +
                                                  "\n antibióticos como ceftriaxona y azitromicina, que ayudan a eliminar la bacteria Neisseria gonorrhoeae. Marcas reconocidas       " +
                                                  "\n incluyen Rocephin y Zithromax, las cuales han demostrado eficacia en el manejo de la gonorrea. ALIMENTACIÓN. Para               " +
                                                  "\n fortalecer el sistema inmunológico y reducir la inflamación, se recomienda consumir frutas cítricas como naranja,               " +
                                                  "\n limón y toronja, que son ricas en vitamina C, la cual contribuye a la producción de glóbulos blancos y mejora la                " +
                                                  "\n respuesta inmune, aportando aproximadamente el 90% del requerimiento diario por cada 100 gramos. Verduras de hoja               " +
                                                  "\n verde como espinaca, kale y acelga, que contienen ácido fólico, esencial para la producción de células sanguíneas,              " +
                                                  "\n aportando cerca del 65% del requerimiento diario por cada 100 gramos. Pescados grasos como salmón, atún y sardina,              " +
                                                  "\n que son ricos en Omega-3, el cual tiene propiedades antiinflamatorias y aporta alrededor del 50% del requerimiento              " +
                                                  "\n diario por porción de 100 gramos. Frutos secos como almendras, nueces y semillas de chía, que aportan vitamina E,               " +
                                                  "\n la cual protege las células del daño oxidativo y contribuye con el 70% del requerimiento diario por cada 30 gramos.             " +
                                                  "\n Legumbres como lentejas, garbanzos y frijoles, que son fuente de proteínas y hierro, esenciales para la energía y la            " +
                                                  "\n regeneración celular, aportando cerca del 40% del requerimiento diario por cada 100 gramos. Este es solo un diagnóstico         " +
                                                  "\n predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas      " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico especialista.     " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2 a 2.5 litros de agua al día, ya que una hidratación adecuada ayuda a              " +
                                                  "\n mantener la piel saludable y reducir la inflamación causada por el virus. También es beneficioso complementar con            " +
                                                  "\n infusiones naturales como té de jengibre o cúrcuma, que poseen propiedades antivirales y antiinflamatorias. EJERCICIO.       " +
                                                  "\n La actividad física moderada es clave para fortalecer el sistema inmunológico y mejorar la circulación sanguínea. Se         " +
                                                  "\n recomienda realizar ejercicio aeróbico moderado al menos 30 minutos al día, como caminar, nadar o andar en bicicleta,        " +
                                                  "\n evitando el sobreesfuerzo. También es beneficioso incluir ejercicios de resistencia como levantamiento de pesas ligeras      " +
                                                  "\n o yoga, que ayudan a mantener la masa muscular y reducir el estrés. POSIBLE TRATAMIENTO. El tratamiento estándar incluye     " +
                                                  "\n antivirales como aciclovir, valaciclovir y famciclovir, que ayudan a reducir la duración y gravedad de los brotes.           " +
                                                  "\n Marcas reconocidas incluyen Zovirax, Valtrex y Famvir, las cuales han demostrado eficacia en el manejo del herpes            " +
                                                  "\n genital. ALIMENTACIÓN. Para fortalecer el sistema inmunológico y reducir la inflamación, se recomienda consumir frutas       " +
                                                  "\n cítricas como naranja, limón y toronja, que son ricas en vitamina C, la cual contribuye a la producción de glóbulos          " +
                                                  "\n blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento diario por cada 100 gramos.         " +
                                                  "\n Verduras de hoja verde como espinaca, kale y acelga, que contienen ácido fólico, esencial para la producción de células      " +
                                                  "\n sanguíneas, aportando cerca del 65% del requerimiento diario por cada 100 gramos. Pescados grasos como salmón, atún y        " +
                                                  "\n sardina, que son ricos en Omega-3, el cual tiene propiedades antiinflamatorias y aporta alrededor del 50% del requerimiento  " +
                                                  "\n diario por porción de 100 gramos. Frutos secos como almendras, nueces y semillas de chía, que aportan vitamina E, la cual    " +
                                                  "\n protege las células del daño oxidativo y contribuye con el 70% del requerimiento diario por cada 30 gramos. Legumbres como   " +
                                                  "\n lentejas, garbanzos y frijoles, que son fuente de proteínas y hierro, esenciales para la energía y la regeneración celular,  " +
                                                  "\n aportando cerca del 40% del requerimiento diario por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico.     " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente       " +
                                                  "\n correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico especialista. Angel L Montes      " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2.5 a 3 litros de agua al día, ya que una hidratación adecuada ayuda       " +
                                                  "\n a eliminar toxinas y mejorar la circulación sanguínea. También es beneficioso complementar con infusiones           " +
                                                  "\n naturales como té verde o manzanilla, que poseen propiedades antibacterianas y antiinflamatorias. EJERCICIO.        " +
                                                  "\n La actividad física moderada es clave para fortalecer el sistema inmunológico y mejorar la circulación sanguínea.   " +
                                                  "\n Se recomienda realizar ejercicio aeróbico moderado al menos 30 minutos al día, como caminar, nadar o andar en       " +
                                                  "\n bicicleta, evitando el sobreesfuerzo. También es beneficioso incluir ejercicios de resistencia como levantamiento   " +
                                                  "\n de pesas ligeras o yoga, que ayudan a mantener la masa muscular y reducir el estrés. POSIBLE TRATAMIENTO. El        " +
                                                  "\n tratamiento estándar incluye antibióticos como penicilina G benzatina y doxiciclina, que ayudan a eliminar la       " +
                                                  "\n bacteria Treponema pallidum. Marcas reconocidas incluyen Benzetacil y Vibramycin, las cuales han demostrado eficacia   " +
                                                  "\n en el manejo de la sífilis. ALIMENTACIÓN. Para fortalecer el sistema inmunológico y reducir la inflamación, se         " +
                                                  "\n recomienda consumir frutas cítricas como naranja, limón y toronja, que son ricas en vitamina C, la cual contribuye     " +
                                                  "\n a la producción de glóbulos blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento   " +
                                                  "\n diario por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda     " +
                                                  "\n realizar más de un diagnóstico y consultar a un médico especialista. Angel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis." +
                                                  "\n EJERCICIO: Es fundamental que la paciente mantenga una rutina de actividad física moderada, evitando esfuerzos            " +
                                                  "\n excesivos que puedan comprometan su capacidad respiratoria. Se recomienda ejercicios de bajo impacto como caminatas       " +
                                                  "\n suaves o yoga, adaptados a su condición y siempre bajo supervisión médica. HIDRATACIÓN: La hidratación es clave en el     " +
                                                  "\n tratamiento, ayudando a mantener las vías respiratorias limpias y mejorar la eliminación de toxinas. Se recomienda el     " +
                                                  "\n consumo diario de 2.5 litros de agua, aproximadamente 10 vasos de tamaño regular, para facilitar la expectoración y       " +
                                                  "\n reducir la irritación pulmonar. POSIBLE TRATAMIENTO: La tuberculosis se trata con antibióticos de primera línea como      " +
                                                  "\n isoniazida, rifampicina, etambutol y pirazinamida. En México, algunas marcas reconocidas son Rimactane (rifampicina),     " +
                                                  "\n Laniazid (isoniazida) y Myambutol (etambutol). Es crucial seguir el tratamiento completo para evitar resistencia bacteriana. " +
                                                  "\n ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema inmunológico y mejorar la recuperación, se recomienda el consumo        " +
                                                  "\n de alimentos ricos en vitaminas y minerales esenciales. FRUTAS CÍTRICAS (naranjas, limones, toronjas): Altas en VITAMINA C,  " +
                                                  "\n que fortalece el sistema inmune, aportando aproximadamente el 89% del requerimiento diario por cada 100 gramos. AGUACATE:    " +
                                                  "\n Rico en VITAMINA E, que contribuye a la regeneración celular, proporcionando cerca del 14% del requerimiento diario por      " +
                                                  "\n cada 100 gramos. ALMENDRAS Y NUECES: Contienen ZINC, esencial para la cicatrización y la respuesta inmunológica, aportando   " +
                                                  "\n alrededor del 15% del requerimiento diario por cada 30 gramos. PESCADOS GRASOS (salmón, atún): Fuente de OMEGA-3, con        " +
                                                  "\n propiedades antiinflamatorias, proporcionando aproximadamente 2.2 gramos por cada 100 gramos de pescado. VEGETALES DE        " +
                                                  "\n HOJA VERDE (espinaca, acelga): Ricos en HIERRO, fundamental para combatir la fatiga y mejorar la oxigenación celular,        " +
                                                  "\n aportando cerca del 15% del requerimiento diario por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico.     " +
                                                  "\n Haberlo consultado no garantiza al 100% que la paciente tenga tuberculosis ni que el tratamiento sea el adecuado. Se         " +
                                                  "\n recomienda realizar más de un diagnóstico para mayor seguridad y, por su salud, consultar a su médico. Angel L Montes        " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n EJERCICIO: Es recomendable que la paciente realice actividad física de bajo impacto como natación, yoga o caminatas      " +
                                                  "\n suaves para mantener la movilidad articular y reducir la inflamación. Se debe evitar el sobreesfuerzo y consultar al     " +
                                                  "\n médico para adaptar el ejercicio a su condición. HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de       " +
                                                  "\n agua, aproximadamente 8 a 10 vasos de tamaño regular, para mantener la lubricación de las articulaciones y reducir       " +
                                                  "\n la rigidez matutina. POSIBLE TRATAMIENTO: La artritis se trata con medicamentos antiinflamatorios como ibuprofeno y      " +
                                                  "\n naproxeno, además de fármacos modificadores de la enfermedad como metotrexato y sulfasalazina. En México, algunas        " +
                                                  "\n marcas reconocidas son Voltaren (diclofenaco), Celebrex (celecoxib) y Arava (leflunomida). ALIMENTACIÓN RECOMENDADA:     " +
                                                  "\n Para reducir la inflamación y fortalecer las articulaciones, se recomienda el consumo de alimentos ricos en vitaminas    " +
                                                  "\n y minerales esenciales. PESCADOS GRASOS (salmón, atún): Fuente de OMEGA-3, con propiedades antiinflamatorias,            " +
                                                  "\n proporcionando aproximadamente 2.2 gramos por cada 100 gramos de pescado. FRUTAS CÍTRICAS (naranjas, limones, toronjas): " +
                                                  "\n Altas en VITAMINA C, que fortalece el sistema inmune y ayuda a la producción de colágeno, aportando aproximadamente 89%  " +
                                                  "\n del requerimiento diario por cada 100 gramos. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO,    " +
                                                  "\n fundamentales para la regeneración celular y la función muscular, aportando cerca del 15% del requerimiento diario por   " +
                                                  "\n cada 100 gramos. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que la       " +
                                                  "\n paciente tenga artritis ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico para mayor   " +
                                                  "\n seguridad y, por su salud, consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n EJERCICIO: Se recomienda evitar esfuerzos físicos intensos mientras persistan los síntomas, priorizando el descanso         " +
                                                  "\n y la recuperación pulmonar. HIDRATACIÓN: Es fundamental el consumo de 2.5 a 3 litros de agua, aproximadamente 10 a 12       " +
                                                  "\n vasos de tamaño regular, para mantener las vías respiratorias hidratadas y facilitar la eliminación de secreciones.         " +
                                                  "\n POSIBLE TRATAMIENTO: La tosferina se trata con antibióticos como azitromicina, claritromicina y eritromicina. En México,    " +
                                                  "\n algunas marcas reconocidas son Zithromax (azitromicina), Klaricid (claritromicina) y Ilosone (eritromicina). ALIMENTACIÓN   " +
                                                  "\n RECOMENDADA: Para fortalecer el sistema inmunológico y mejorar la recuperación, se recomienda el consumo de alimentos       " +
                                                  "\n ricos en vitaminas y minerales esenciales. FRUTAS CÍTRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que          " +
                                                  "\n fortalece el sistema inmune, aportando aproximadamente 89% del requerimiento diario por cada 100 gramos. JENGIBRE:          " +
                                                  "\n Contiene compuestos con efectos antiinflamatorios que pueden ayudar a aliviar la irritación de las vías respiratorias,      " +
                                                  "\n proporcionando 5% del requerimiento diario de antioxidantes por cada 10 gramos. MIEL: Con propiedades antimicrobianas       " +
                                                  "\n y calmantes para la garganta, aportando 20% del requerimiento diario de antioxidantes por cada 30 gramos. Este es solo      " +
                                                  "\n un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que la paciente tenga tosferina ni que el     " +
                                                  "\n tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico para mayor seguridad y, por su salud, consultar   " +
                                                  "\n a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n EJERCICIO: Se recomienda reposo absoluto mientras persistan los síntomas para evitar complicaciones. HIDRATACIÓN:    " +
                                                  "\n Es esencial el consumo de 2 a 2.5 litros de agua, aproximadamente 8 a 10 vasos de tamaño regular, para mantener la   " +
                                                  "\n hidratación y reducir la fiebre. POSIBLE TRATAMIENTO: No existe un tratamiento específico para las paperas, pero se  " +
                                                  "\n pueden utilizar analgésicos como paracetamol e ibuprofeno para aliviar los síntomas. En México, algunas marcas       " +
                                                  "\n reconocidas son Tempra (paracetamol) y Advil (ibuprofeno). ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema      " +
                                                  "\n inmunológico y mejorar la recuperación, se recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales. " +
                                                  "\n FRUTAS CÍTRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema inmune, aportando         " +
                                                  "\n aproximadamente 89% del requerimiento diario por cada 100 gramos. PURÉS Y SOPAS: Facilitan la ingesta de alimentos     " +
                                                  "\n sin irritar las glándulas salivales, proporcionando 15% del requerimiento diario de minerales esenciales por cada      " +
                                                  "\n 100 gramos. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales para la regeneración " +
                                                  "\n celular y la función muscular, aportando cerca del 15% del requerimiento diario por cada 100 gramos. Este es solo un   " +
                                                  "\n diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que la paciente tenga paperas ni que el     " +
                                                  "\n tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico para mayor seguridad y, por su salud, consultar" +
                                                  "\n a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente mantenga una hidratación adecuada, consumiendo al menos 2 a 2.5 litros      " +
                                                  "\n de agua al día (aproximadamente ocho a diez vasos de agua de tamaño regular) para ayudar a su cuerpo a combatir la      " +
                                                  "\n infección y prevenir la deshidratación causada por fiebre y sudoración. EJERCICIO: Se recomienda reposo moderado,       " +
                                                  "\n evitando esfuerzos físicos intensos mientras persistan los síntomas. Una vez recuperada, puede retomar el ejercicio     " +
                                                  "\n de forma progresiva. POSIBLE TRATAMIENTO: No existe un tratamiento específico para el Zika. El manejo se centra en      " +
                                                  "\n aliviar los síntomas con paracetamol (marca común en México: Tempra) para la fiebre y el dolor, evitando el uso de         " +
                                                  "\n aspirina y otros antiinflamatorios no esteroides debido al riesgo de complicaciones hemorrágicas. También se recomienda    " +
                                                  "\n el uso de antihistamínicos para aliviar el sarpullido y la picazón. ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema   " +
                                                  "\n inmunológico y ayudar en la recuperación, se recomienda el consumo de FRUTAS CÍTRICAS como naranja, limón y toronja, ricas " +
                                                  "\n en VITAMINA C, que ayuda a fortalecer el sistema inmune y aporta aproximadamente el 89% del requerimiento diario por cada  " +
                                                  "\n 100 g de consumo. PAPAYA, que contiene VITAMINA A y C, además de enzimas que pueden ayudar a reducir la inflamación,       " +
                                                  "\n aportando cerca del 75% del requerimiento diario de VITAMINA C por cada 100 g. JENGIBRE, con propiedades ANTIINFLAMATORIAS " +
                                                  "\n y antioxidantes que pueden aliviar síntomas como dolor muscular, aportando compuestos bioactivos como gingerol y shogaol.     " +
                                                  "\n VERDURAS DE HOJA VERDE como espinaca, acelga y kale, ricas en HIERRO y antioxidantes esenciales para la recuperación celular, " +
                                                  "\n aportando cerca del 15% del requerimiento diario de HIERRO por cada 100 g. AGUA DE COCO, fuente natural de ELECTROLITOS,      " +
                                                  "\n útil para prevenir la deshidratación, aportando potasio y sodio esenciales para la hidratación celular. Este es solo un  " +
                                                  "\n diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que  " +
                                                  "\n las respuestas sean completamente correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el     " +
                                                  "\n tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda      " +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2.5 a 3 litros de agua al día (aproximadamente diez          " +
                                                  "\n a doce vasos de agua de tamaño regular) para prevenir la deshidratación causada por diarrea y vómitos. Además, se         " +
                                                  "\n recomienda el consumo de soluciones de rehidratación oral como suero fisiológico para reponer los electrolitos            " +
                                                  "\n perdidos y evitar complicaciones graves. EJERCICIO: Se recomienda reposo absoluto mientras persistan los síntomas,        " +
                                                  "\n evitando cualquier actividad física intensa. Una vez recuperada, puede retomar el ejercicio de forma progresiva,          " +
                                                  "\n comenzando con caminatas suaves y ejercicios de movilidad para fortalecer el cuerpo sin generar estrés adicional.         " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento específico para el rotavirus. El manejo se centra en la rehidratación       " +
                                                  "\n con soluciones de electrolitos como Suero Oral (marca común en México: Electrolit) para reponer los minerales perdidos.   " +
                                                  "\n En casos graves, puede requerirse hidratación intravenosa en un entorno hospitalario. También se recomienda el uso de     " +
                                                  "\n probióticos para ayudar a restaurar la flora intestinal y mejorar la digestión. ALIMENTACIÓN RECOMENDADA: Para fortalecer " +
                                                  "\n el sistema digestivo y ayudar en la recuperación, se recomienda el consumo de PLÁTANO, rico en POTASIO, que ayuda a       " +
                                                  "\n reponer electrolitos perdidos, aportando aproximadamente el 12% del requerimiento diario por cada 100 g. ARROZ BLANCO,    " +
                                                  "\n fuente de CARBOHIDRATOS de fácil digestión, que ayuda a estabilizar el sistema digestivo. MANZANA, rica en PECTINA,       " +
                                                  "\n que contribuye a la regulación intestinal y aporta cerca del 10% del requerimiento diario de FIBRA por cada 100 g.        " +
                                                  "\n ZANAHORIA, fuente de VITAMINA A, que ayuda a la regeneración celular y aporta aproximadamente el 89% del requerimiento    " +
                                                  "\n diario por cada 100 g. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el  " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar más de un       " +
                                                  "\n diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le  " +
                                                  "\n satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera    " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de al menos 2 litros de agua al día (aproximadamente ocho vasos de agua de tamaño          " +
                                                  "\n regular) para ayudar al cuerpo a eliminar la bacteria y prevenir la deshidratación causada por fiebre y malestar. También        " +
                                                  "\n es recomendable el consumo de líquidos ricos en electrolitos como agua de coco o caldos naturales para mejorar la recuperación.  " +
                                                  "\n EJERCICIO: Se recomienda reposo moderado mientras persistan los síntomas, evitando esfuerzos físicos intensos. Sin embargo,      " +
                                                  "\n una vez recuperada, se pueden realizar ejercicios de bajo impacto como yoga o estiramientos suaves para mejorar la circulación   " +
                                                  "\n y fortalecer el sistema inmunológico. POSIBLE TRATAMIENTO: El tratamiento para la listeriosis suele incluir antibióticos como    " +
                                                  "\n ampicilina o gentamicina (marcas comunes en México: Amikin, Ampigrin) en casos graves. Además, se recomienda el consumo de       " +
                                                  "\n alimentos ricos en antioxidantes para ayudar al cuerpo a combatir la infección de manera natural. ALIMENTACIÓN RECOMENDADA:      " +
                                                  "\n Para fortalecer el sistema inmunológico y ayudar en la recuperación, se recomienda el consumo de YOGUR NATURAL, rico en          " +
                                                  "\n PROBIÓTICOS, que favorecen la recuperación intestinal y aportan aproximadamente 10^9 UFC por cada 100 g. AJO, con propiedades    " +
                                                  "\n ANTIBACTERIANAS, que pueden ayudar a combatir la infección y aporta compuestos bioactivos como alicina. ESPINACA, fuente de      " +
                                                  "\n VITAMINA C y HIERRO, que fortalece el sistema inmune y aporta cerca del 15% del requerimiento diario de HIERRO por cada 100 g.   " +
                                                  "\n FRUTOS ROJOS, ricos en ANTIOXIDANTES, que ayudan a reducir la inflamación y aportan aproximadamente el 50% del requerimiento     " +
                                                  "\n diario de VITAMINA C por cada 100 g. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al       " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar más de     " +
                                                  "\n un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le      " +
                                                  "\n satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que       " +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2.5 litros de agua al día (aproximadamente diez vasos de         " +
                                                  "\n agua de tamaño regular) para prevenir la deshidratación causada por diarrea intensa. También se recomienda el consumo         " +
                                                  "\n de suero oral y bebidas con electrolitos para evitar la pérdida excesiva de minerales esenciales. EJERCICIO: Se recomienda    " +
                                                  "\n reposo absoluto mientras persistan los síntomas, evitando cualquier actividad física intensa. Una vez recuperada, se pueden   " +
                                                  "\n realizar ejercicios de bajo impacto como caminatas suaves y estiramientos para mejorar la circulación y fortalecer el         " +
                                                  "\n sistema digestivo. POSIBLE TRATAMIENTO: El tratamiento para la shigelosis suele incluir antibióticos como ciprofloxacino      " +
                                                  "\n o azitromicina (marcas comunes en México: Ciproxina, Zithromax) en casos graves. También se recomienda el consumo de          " +
                                                  "\n alimentos ricos en fibra para ayudar a regular el tránsito intestinal y mejorar la digestión. ALIMENTACIÓN RECOMENDADA:       " +
                                                  "\n Para fortalecer el sistema digestivo y ayudar en la recuperación, se recomienda el consumo de PLÁTANO, rico en POTASIO,       " +
                                                  "\n que ayuda a reponer electrolitos perdidos, aportando aproximadamente el 12% del requerimiento diario por cada 100 g.          " +
                                                  "\n ARROZ BLANCO, fuente de CARBOHIDRATOS de fácil digestión, que ayuda a estabilizar el sistema digestivo. MANZANA, rica en      " +
                                                  "\n PECTINA, que contribuye a la regulación intestinal y aporta cerca del 10% del requerimiento diario de FIBRA por cada 100 g.   " +
                                                  "\n ZANAHORIA, fuente de VITAMINA A, que ayuda a la regeneración celular y aporta aproximadamente el 89% del requerimiento        " +
                                                  "\n diario por cada 100 g. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el      " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar más de un           " +
                                                  "\n diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no         " +
                                                  "\n le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera     " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC). " +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al día (aproximadamente ocho a diez     " +
                                                  "\n vasos de agua de tamaño regular) para mantener la hidratación de las vías respiratorias y reducir la acumulación de         " +
                                                  "\n mucosidad. También se recomienda el consumo de líquidos tibios como té de jengibre o caldos naturales para mejorar la       " +
                                                  "\n función pulmonar. EJERCICIO: Se recomienda actividad física moderada, como caminatas diarias de 30 a 60 minutos,            " +
                                                  "\n ejercicios de respiración y fortalecimiento pulmonar. Evitar la exposición a contaminantes y humo de tabaco es crucial      " +
                                                  "\n para prevenir exacerbaciones. POSIBLE TRATAMIENTO: El tratamiento para la EPOC suele incluir broncodilatadores de acción    " +
                                                  "\n rápida y prolongada, como el salbutamol (marca común en México: Ventolin) y corticosteroides inhalados como la fluticasona  " +
                                                  "\n (marca común: Flixotide). En casos avanzados, puede requerirse oxigenoterapia y rehabilitación pulmonar. ALIMENTACIÓN       " +
                                                  "\n RECOMENDADA: Para fortalecer el sistema respiratorio y reducir la inflamación, se recomienda el consumo de PESCADOS         " +
                                                  "\n GRASOS como salmón y atún, ricos en ÁCIDOS GRASOS OMEGA-3, que poseen propiedades antiinflamatorias y aportan aproximadamente " +
                                                  "\n el 50% del requerimiento diario por cada 100 g. FRUTAS CÍTRICAS como naranja y toronja, ricas en VITAMINA C, que fortalece    " +
                                                  "\n el sistema inmune y aporta cerca del 89% del requerimiento diario por cada 100 g. ESPINACA, fuente de HIERRO y ANTIOXIDANTES, " +
                                                  "\n que ayudan a mejorar la oxigenación celular y aportan aproximadamente el 15% del requerimiento diario de HIERRO por cada      " +
                                                  "\n 100 g. JENGIBRE, con propiedades ANTIINFLAMATORIAS y antioxidantes, que pueden aliviar síntomas respiratorios y mejorar       " +
                                                  "\n la función pulmonar. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el        " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar más de un           " +
                                                  "\n diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no         " +
                                                  "\n le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera     " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de al menos 2 litros de agua al día (aproximadamente ocho vasos de agua de tamaño         " +
                                                  "\n regular) para ayudar al cuerpo a eliminar la bacteria y prevenir la deshidratación causada por fiebre y malestar. También       " +
                                                  "\n es recomendable el consumo de líquidos ricos en electrolitos como agua de coco o caldos naturales para mejorar la               " +
                                                  "\n recuperación. EJERCICIO: Se recomienda reposo moderado mientras persistan los síntomas, evitando esfuerzos físicos intensos.    " +
                                                  "\n Sin embargo, una vez recuperada, se pueden realizar ejercicios de bajo impacto como yoga o estiramientos suaves para mejorar    " +
                                                  "\n la circulación y fortalecer el sistema inmunológico. POSIBLE TRATAMIENTO: El tratamiento para la clamidia suele incluir         " +
                                                  "\n antibióticos como azitromicina o doxiciclina (marcas comunes en México: Zithromax, Vibramycin). Es fundamental completar        " +
                                                  "\n el tratamiento indicado por el médico para evitar complicaciones y recurrencias. ALIMENTACIÓN RECOMENDADA: Para fortalecer      " +
                                                  "\n el sistema inmunológico y ayudar en la recuperación, se recomienda el consumo de YOGUR NATURAL, rico en PROBIÓTICOS, que        " +
                                                  "\n favorecen la recuperación intestinal y aportan aproximadamente 10^9 UFC por cada 100 g. AJO, con propiedades ANTIBACTERIANAS,   " + 
                                                  "\n que pueden ayudar a combatir la infección y aporta compuestos bioactivos como alicina. ESPINACA, fuente de VITAMINA C y         " +
                                                  "\n HIERRO, que fortalece el sistema inmune y aporta cerca del 15% del requerimiento diario de HIERRO por cada 100 g. FRUTOS        " +
                                                  "\n ROJOS, ricos en ANTIOXIDANTES, que ayudan a reducir la inflamación y aportan aproximadamente el 50% del requerimiento           " +
                                                  "\n diario de VITAMINA C por cada 100 g. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza         " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar        " +
                                                  "\n más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico    " +
                                                  "\n no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera    " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2.5 litros de agua al día (aproximadamente diez          " +
                                                  "\n vasos de agua de tamaño regular) para prevenir la deshidratación causada por fiebre y sudoración. También se          " +
                                                  "\n recomienda el consumo de caldos naturales y bebidas con electrolitos para mejorar la recuperación. EJERCICIO:         " +
                                                  "\n Se recomienda reposo absoluto mientras persistan los síntomas, evitando cualquier actividad física intensa.           " +
                                                  "\n Una vez recuperada, se pueden realizar ejercicios de bajo impacto como caminatas suaves y estiramientos para          " +
                                                  "\n mejorar la circulación y fortalecer el sistema nervioso. POSIBLE TRATAMIENTO: El tratamiento para la meningitis       " +
                                                  "\n bacteriana suele incluir antibióticos como ceftriaxona o vancomicina (marcas comunes en México: Rocephin, Vancocin).     " +
                                                  "\n En casos graves, puede requerirse hospitalización y monitoreo constante. ALIMENTACIÓN RECOMENDADA: Para fortalecer el    " +
                                                  "\n sistema inmunológico y ayudar en la recuperación, se recomienda el consumo de FRUTAS CÍTRICAS como naranja y toronja,    " +
                                                  "\n ricas en VITAMINA C, que fortalece el sistema inmune y aporta cerca del 89% del requerimiento diario por cada 100 g.     " +
                                                  "\n PESCADOS GRASOS como salmón y atún, ricos en ÁCIDOS GRASOS OMEGA-3, que poseen propiedades antiinflamatorias y aportan   " +
                                                  "\n aproximadamente el 50% del requerimiento diario por cada 100 g. ESPINACA, fuente de HIERRO y ANTIOXIDANTES, que ayudan   " +
                                                  "\n a mejorar la oxigenación celular y aportan aproximadamente el 15% del requerimiento diario de HIERRO por cada 100 g.     " +
                                                  "\n JENGIBRE, con propiedades ANTIINFLAMATORIAS y antioxidantes, que pueden aliviar síntomas neurológicos y mejorar la función  " +
                                                  "\n cerebral. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga  " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar más de un diagnóstico para mayor " +
                                                  "\n seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se   " +
                                                  "\n recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN. Es fundamental mantener una hidratación adecuada para apoyar la función celular y reducir los efectos         " +
                                                  "\n secundarios del tratamiento, se recomienda el consumo de 2 a 2.5 litros de agua al día, además de líquidos ricos en        " +
                                                  "\n electrolitos como agua de coco o sueros orales para evitar la deshidratación causada por la quimioterapia. EJERCICIO.      " +
                                                  "\n La actividad física debe ser moderada y adaptada a la condición del paciente, se recomienda ejercicio ligero como          " +
                                                  "\n caminatas, yoga o estiramientos para mejorar la circulación, reducir la fatiga y fortalecer el sistema inmunológico,       " +
                                                  "\n además el ejercicio puede ayudar a disminuir la inflamación y mejorar el estado de ánimo, es importante realizarlo         " +
                                                  "\n bajo supervisión médica y ajustar la intensidad según la tolerancia del paciente. POSIBLE TRATAMIENTO. El tratamiento      " +
                                                  "\n varía según el tipo de cáncer pero puede incluir quimioterapia, radioterapia, cirugía y terapias dirigidas, en México      " +
                                                  "\n algunos medicamentos utilizados incluyen Paclitaxel, Doxorrubicina y Trastuzumab dependiendo del tipo de cáncer, además    " +
                                                  "\n existen tratamientos complementarios como la inmunoterapia y la terapia hormonal que pueden ser recomendados por el          " +
                                                  "\n médico según el caso, es crucial seguir las indicaciones médicas y realizar chequeos constantes para evaluar la efectividad  " +
                                                  "\n del tratamiento. ALIMENTACIÓN. Se sugiere una dieta rica en antioxidantes y nutrientes esenciales para fortalecer el sistema " +
                                                  "\n inmunológico, NARANJA. Rica en vitamina C que ayuda a la regeneración celular, aporta aproximadamente el 89% de la ingesta   " +
                                                  "\n diaria recomendada por cada 100 gramos. BRÓCOLI. Contiene antioxidantes y ácido fólico esenciales para la reparación celular," +
                                                  "\n aporta cerca del 15% de la ingesta diaria recomendada de ácido fólico por cada 100 gramos. PESCADO GRASO (SALMÓN, ATÚN).     " +
                                                  "\n Rico en Omega-3 que puede ayudar a reducir la inflamación, aporta aproximadamente el 50% de la ingesta diaria recomendada    " +
                                                  "\n de Omega-3 por cada 100 gramos. CÚRCUMA. Contiene curcumina con propiedades antiinflamatorias y antioxidantes, su consumo    " +
                                                  "\n puede aportar hasta el 20% de la ingesta diaria recomendada de antioxidantes. Este es solo un Diagnóstico predeterminado     " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus      " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad   " +
                                                  "\n en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se   " +
                                                  "\n le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.35-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACIÓN. Es esencial mantener una hidratación adecuada para ayudar al cuerpo a combatir la infección y reducir         " +
                                                  "\n los síntomas, se recomienda el consumo de 2 a 2.5 litros de agua al día, además de líquidos calientes como té de           " +
                                                  "\n jengibre o caldos para aliviar la congestión y mantener la garganta hidratada. EJERCICIO. Se recomienda actividad          " +
                                                  "\n física ligera como caminatas suaves o estiramientos para mejorar la circulación y fortalecer el sistema inmunológico,      " +
                                                  "\n sin embargo, es importante evitar esfuerzos excesivos mientras persistan los síntomas, el descanso adecuado también        " + 
                                                  "\n es clave para la recuperación. POSIBLE TRATAMIENTO. El tratamiento suele incluir medicamentos para reducir la fiebre       " +
                                                  "\n y aliviar los síntomas como el paracetamol (Tempra) o el ibuprofeno (Advil), además los antivirales específicos contra     " +
                                                  "\n la gripe como el oseltamivir (Tamiflu) pueden ser recetados en casos graves, es fundamental seguir las indicaciones        " +
                                                  "\n médicas y evitar la automedicación. ALIMENTACIÓN. Se recomienda el consumo de alimentos ricos en vitaminas y antioxidantes " +
                                                  "\n para fortalecer el sistema inmunológico, NARANJA. Rica en vitamina C que ayuda a reducir la duración de los síntomas,      " +
                                                  "\n aporta aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE. Contiene compuestos con      " +
                                                  "\n efectos antiinflamatorios y ayuda a aliviar la congestión, su consumo puede aportar hasta el 20% de la ingesta diaria      " +
                                                  "\n recomendada de antioxidantes. MIEL. Posee propiedades antimicrobianas y ayuda a calmar la garganta, aporta cerca del 10%   " +
                                                  "\n de la ingesta diaria recomendada de antioxidantes por cada cucharada. Este es solo un Diagnóstico predeterminado lógico,   " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el      " +
                                                  "\n tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le    " +
                                                  "\n recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n HIDRATACIÓN. Es crucial mantener una hidratación adecuada para ayudar a fluidificar las secreciones y facilitar la        " +
                                                  "\n respiración, se recomienda el consumo de 2.5 a 3 litros de agua al día, además de líquidos calientes como infusiones      " +
                                                  "\n de tomillo o caldos para aliviar la irritación pulmonar. EJERCICIO. La actividad física debe ser mínima durante la        " +
                                                  "\n fase aguda de la enfermedad, se recomienda ejercicios de respiración profunda y expansión pulmonar para mejorar la        " +
                                                  "\n oxigenación, una vez recuperada la paciente, se pueden retomar actividades ligeras como caminatas cortas. POSIBLE         " +
                                                  "\n TRATAMIENTO. El tratamiento suele incluir antibióticos en caso de neumonía bacteriana como la amoxicilina con ácido       " +
                                                  "\n clavulánico (Clavulin) o la azitromicina, además pueden recetarse broncodilatadores y antiinflamatorios para mejorar      " +
                                                  "\n la función pulmonar, es fundamental seguir las indicaciones médicas y completar el tratamiento. ALIMENTACIÓN. Se          " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema respiratorio," +
                                                  "\n ESPINACA. Rica en vitamina A que ayuda a la regeneración celular pulmonar, aporta aproximadamente el 56% de la ingesta    " +
                                                  "\n diaria recomendada por cada 100 gramos. TOMILLO. Contiene compuestos con propiedades antimicrobianas y ayuda a aliviar    " +
                                                  "\n la inflamación pulmonar, su consumo puede aportar hasta el 15% de la ingesta diaria recomendada de antioxidantes. PESCADO " +
                                                  "\n GRASO (SALMÓN, ATÚN). Rico en Omega-3 que puede ayudar a reducir la inflamación pulmonar, aporta aproximadamente el 50%   " +
                                                  "\n de la ingesta diaria recomendada de Omega-3 por cada 100 gramos. Este es solo un Diagnóstico predeterminado lógico,       " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas" +
                                                  "\n estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el     " +
                                                  "\n tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le   " +
                                                  "\n recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACIÓN. Es fundamental mantener una hidratación adecuada para regular los niveles de glucosa en sangre y prevenir     " +
                                                  "\n la deshidratación, se recomienda el consumo de 2 a 3 litros de agua al día, además de infusiones sin azúcar como té        " +
                                                  "\n verde o agua de jamaica para mejorar la circulación. EJERCICIO. Se recomienda actividad física moderada como caminatas,    " +
                                                  "\n natación o yoga para mejorar la sensibilidad a la insulina y controlar los niveles de glucosa, es importante realizar      " +
                                                  "\n ejercicio de manera constante y bajo supervisión médica. POSIBLE TRATAMIENTO. El tratamiento suele incluir medicamentos    " +
                                                  "\n para controlar la glucosa como la metformina (Glucophage) o insulina en casos más avanzados, además pueden recetarse       " +
                                                  "\n medicamentos complementarios como los inhibidores de SGLT2 para mejorar el control metabólico, es fundamental seguir       " +
                                                  "\n las indicaciones médicas y mantener un monitoreo constante. ALIMENTACIÓN. Se recomienda el consumo de alimentos con bajo   " +
                                                  "\n índice glucémico y ricos en fibra para estabilizar los niveles de glucosa, AVENA. Rica en fibra soluble que ayuda a        " +
                                                  "\n regular la glucosa en sangre, aporta aproximadamente el 40% de la ingesta diaria recomendada por cada 100 gramos. NOPAL.   " +
                                                  "\n Contiene fibra y antioxidantes que ayudan a mejorar la sensibilidad a la insulina, su consumo puede aportar hasta el 30%   " +
                                                  "\n de la ingesta diaria recomendada de fibra. ALMENDRAS. Ricas en grasas saludables y magnesio que ayudan a mejorar la        " +
                                                  "\n función metabólica, aportan aproximadamente el 25% de la ingesta diaria recomendada de magnesio por cada 100 gramos.       " +
                                                  "\n Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa       " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un          " +
                                                  "\n Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud      " +
                                                  "\n si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes      " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para       " +
                                                  "\n mantener las vías respiratorias hidratadas y reducir la viscosidad de las secreciones bronquiales. La hidratación       " +
                                                  "\n adecuada también puede ayudar a prevenir la irritación de las vías respiratorias y mejorar la función pulmonar.         " +
                                                  "\n EJERCICIO: Se aconseja actividad física controlada y supervisada, con calentamiento previo y enfriamiento posterior,    " +
                                                  "\n evitando desencadenantes del asma como alérgenos o aire frío. Se recomienda ejercicios de bajo impacto como natación    " +
                                                  "\n o yoga, ya que pueden mejorar la capacidad pulmonar sin desencadenar síntomas asmáticos. POSIBLE TRATAMIENTO: Para el   " +
                                                  "\n asma en mujeres jóvenes, el tratamiento suele incluir broncodilatadores de alivio rápido, como el salbutamol (marca     " +
                                                  "\n común en México: Ventolin o Aerolin), corticosteroides inhalados para el control a largo plazo, como la fluticasona     " +
                                                  "\n o budesonida (marcas comunes: Flixotide o Pulmicort), y en algunos casos, modificadores de leucotrienos como el         " +
                                                  "\n montelukast (marca común: Singulair). También es importante mantener un seguimiento médico regular para ajustar el      " +
                                                  "\n tratamiento según la evolución de los síntomas. ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades     " +
                                                  "\n antiinflamatorias y antioxidantes para mejorar la función pulmonar: Pescados grasos (salmón, atún): Ricos en ácidos     " +
                                                  "\n grasos Omega-3, que poseen propiedades antiinflamatorias. Frutas y verduras de colores vivos (arándanos, fresas,        " +
                                                  "\n espinacas, brócoli): Ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las células del      " +
                                                  "\n daño. Jengibre: Contiene compuestos con efectos antiinflamatorios que podrían ser beneficiosos para las vías respiratorias. " +
                                                  "\n Cúrcuma: Con su componente activo, la curcumina, tiene potentes propiedades antiinflamatorias y antioxidantes. Este " +
                                                  "\n es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esa     " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un   " +
                                                  "\n diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además, por su    " +
                                                  "\n salud, si la respuesta del diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico.      " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 3 litros de agua (ocho a doce vasos de tamaño regular) para         " +
                                                  "\n mantener una hidratación adecuada y ayudar a la función renal, especialmente si se están tomando medicamentos           " +
                                                  "\n antirretrovirales. La hidratación es esencial para ayudar a la eliminación de toxinas y evitar la deshidratación        " +
                                                  "\n causada por ciertos fármacos. EJERCICIO: Se aconseja actividad física moderada, como caminatas de 30 a 60 minutos       " +
                                                  "\n diarios, ejercicios de resistencia o yoga, lo cual ayuda a fortalecer el sistema inmunológico y mejorar la calidad      " +
                                                  "\n de vida. Es fundamental adaptar el ejercicio según el estado físico de la paciente, evitando esfuerzos que puedan       " +
                                                  "\n debilitar el sistema inmune. POSIBLE TRATAMIENTO: Para el VIH/SIDA en mujeres jóvenes, el tratamiento suele incluir     " +
                                                  "\n terapia antirretroviral combinada (TAR), con medicamentos como el tenofovir, emtricitabina y dolutegravir (marcas       " +
                                                  "\n comunes en México: Truvada, Tivicay). El cumplimiento estricto del tratamiento es crucial para controlar la carga       " +
                                                  "\n viral y evitar complicaciones. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes, vitaminas    " +
                                                  "\n y minerales esenciales para fortalecer el sistema inmunológico: Aguacate: Rico en grasas saludables y vitamina E,       " +
                                                  "\n ayuda a proteger las células del daño oxidativo. Frutos rojos (arándanos, fresas): Contienen antioxidantes y vitamina C,  " +
                                                  "\n que pueden mejorar la respuesta inmune. Espinacas y brócoli: Ricos en hierro y vitamina C, esenciales para la producción  " +
                                                  "\n de glóbulos rojos y la función inmunológica. Jengibre: Posee propiedades antiinflamatorias y antioxidantes que pueden     " +
                                                  "\n ayudar a reducir la inflamación y mejorar la digestión. Este es solo un diagnóstico predeterminado lógico, haberlo        " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas        " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en        " +
                                                  "\n el tratamiento adecuado de su paciente, además, por su salud, si la respuesta del diagnóstico no le satisface del todo,   " +
                                                  "\n se le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para          " +
                                                  "\n ayudar a eliminar toxinas y mantener la función renal adecuada durante el tratamiento antibiótico. Mantener una            " +
                                                  "\n buena hidratación también puede ayudar a reducir la inflamación y mejorar el bienestar general. EJERCICIO: Se              " +
                                                  "\n aconseja actividad física moderada, evitando esfuerzos excesivos mientras persistan los síntomas. Se recomienda            " +
                                                  "\n caminatas suaves de 30 minutos diarios para mejorar la circulación y el bienestar general. El ejercicio puede              " +
                                                  "\n contribuir al fortalecimiento del sistema inmune, siempre evitando situaciones de estrés físico extremo. POSIBLE           " +
                                                  "\n TRATAMIENTO: Para la gonorrea en mujeres jóvenes, el tratamiento suele incluir antibióticos como la ceftriaxona en         " +
                                                  "\n combinación con azitromicina (marcas comunes en México: Rocephin y Zithromax). Es esencial seguir el tratamiento           " +
                                                  "\n prescrito por el médico para evitar la resistencia bacteriana y complicaciones. ALIMENTACIÓN: Se recomienda el consumo     " +
                                                  "\n de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico y ayudar a la          " +
                                                  "\n recuperación: Ajo: Contiene alicina, un compuesto con propiedades antimicrobianas que puede ayudar a combatir infecciones. " +
                                                  "\n Frutas cítricas (naranjas, limones, toronjas): Ricas en vitamina C, esenciales para mejorar la respuesta inmune. Jengibre: " +
                                                  "\n Posee propiedades antiinflamatorias y antioxidantes que pueden aliviar la inflamación y mejorar la circulación. Yogur      " +
                                                  "\n natural: Rico en probióticos, ayuda a restaurar la flora intestinal y fortalecer el sistema inmunológico. Este es solo     " +
                                                  "\n un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y       " +
                                                  "\n que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de        " +
                                                  "\n Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además, por su salud, si la respuesta   " +
                                                  "\n del diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita  " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2 a 2.5 litros de agua al día, ya que una hidratación adecuada ayuda             " +
                                                  "\n a mantener la piel saludable y reducir la inflamación causada por el virus. También es beneficioso complementar           " +
                                                  "\n con infusiones naturales como té de jengibre o cúrcuma, que poseen propiedades antivirales y antiinflamatorias.           " +
                                                  "\n EJERCICIO. La actividad física moderada es clave para fortalecer el sistema inmunológico y mejorar la circulación         " +
                                                  "\n sanguínea. Se recomienda realizar ejercicio aeróbico moderado al menos 30 minutos al día, como caminar, nadar o           " +
                                                  "\n andar en bicicleta, evitando el sobreesfuerzo. También es beneficioso incluir ejercicios de resistencia como              " +
                                                  "\n levantamiento de pesas ligeras o yoga, que ayudan a mantener la masa muscular y reducir el estrés. POSIBLE TRATAMIENTO.   " +
                                                  "\n El tratamiento estándar incluye antivirales como aciclovir, valaciclovir y famciclovir, que ayudan a reducir la           " +
                                                  "\n duración y gravedad de los brotes. Marcas reconocidas incluyen Zovirax, Valtrex y Famvir, las cuales han demostrado       " +
                                                  "\n eficacia en el manejo del herpes genital. ALIMENTACIÓN. Para fortalecer el sistema inmunológico y reducir la inflamación, " +
                                                  "\n se recomienda consumir frutas cítricas como naranja, limón y toronja, que son ricas en vitamina C, la cual contribuye     " +
                                                  "\n a la producción de glóbulos blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento      " +
                                                  "\n diario por cada 100 gramos. Verduras de hoja verde como espinaca, kale y acelga, que contienen ácido fólico, esencial     " +
                                                  "\n para la producción de células sanguíneas, aportando cerca del 65% del requerimiento diario por cada 100 gramos. Pescados  " +
                                                  "\n grasos como salmón, atún y sardina, que son ricos en Omega-3, el cual tiene propiedades antiinflamatorias y aporta alrededor " +
                                                  "\n del 50% del requerimiento diario por porción de 100 gramos. Frutos secos como almendras, nueces y semillas de chía, que    " +
                                                  "\n aportan vitamina E, la cual protege las células del daño oxidativo y contribuye con el 70% del requerimiento diario por    " +
                                                  "\n cada 30 gramos. Legumbres como lentejas, garbanzos y frijoles, que son fuente de proteínas y hierro, esenciales para la    " +
                                                  "\n energía y la regeneración celular, aportando cerca del 40% del requerimiento diario por cada 100 gramos. Este es solo un   " +
                                                  "\n diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que    " +
                                                  "\n las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico " +
                                                  "\n especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2.5 a 3 litros de agua al día, ya que una hidratación adecuada ayuda a eliminar  " +
                                                  "\n toxinas y mejorar la circulación sanguínea. También es beneficioso complementar con infusiones naturales como té verde    " +
                                                  "\n o manzanilla, que poseen propiedades antibacterianas y antiinflamatorias. EJERCICIO. La actividad física moderada es      " +
                                                  "\n clave para fortalecer el sistema inmunológico y mejorar la circulación sanguínea. Se recomienda realizar ejercicio        " +
                                                  "\n aeróbico moderado al menos 30 minutos al día, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo.        " +
                                                  "\n También es beneficioso incluir ejercicios de resistencia como levantamiento de pesas ligeras o yoga, que ayudan a         " + 
                                                  "\n mantener la masa muscular y reducir el estrés. POSIBLE TRATAMIENTO. El tratamiento estándar incluye antibióticos          " +
                                                  "\n como penicilina G benzatina y doxiciclina, que ayudan a eliminar la bacteria Treponema pallidum. Marcas reconocidas       " +
                                                  "\n incluyen Benzetacil y Vibramycin, las cuales han demostrado eficacia en el manejo de la sífilis. ALIMENTACIÓN. Para       " +
                                                  "\n fortalecer el sistema inmunológico y reducir la inflamación, se recomienda consumir frutas cítricas como naranja, limón   " +
                                                  "\n y toronja, que son ricas en vitamina C, la cual contribuye a la producción de glóbulos blancos y mejora la respuesta      " +
                                                  "\n inmune, aportando aproximadamente el 90% del requerimiento diario por cada 100 gramos. Este es solo un diagnóstico        " +
                                                  "\n predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas" +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico especialista." +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 3 a 3.5 litros de agua al día, ya que una hidratación adecuada ayuda a mantener      " +
                                                  "\n las vías respiratorias limpias y mejorar la eliminación de toxinas. También es beneficioso complementar con infusiones        " +
                                                  "\n naturales como té de jengibre o cúrcuma, que poseen propiedades antiinflamatorias y antioxidantes. EJERCICIO. La actividad    " +
                                                  "\n física moderada es clave para fortalecer el sistema inmunológico y mejorar la capacidad pulmonar. Se recomienda realizar      " +
                                                  "\n ejercicio aeróbico moderado al menos 30 minutos al día, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo.  " +
                                                  "\n También es beneficioso incluir ejercicios de respiración como yoga o técnicas de expansión pulmonar. POSIBLE TRATAMIENTO.     " +
                                                  "\n El tratamiento estándar incluye antibióticos como isoniazida, rifampicina, pirazinamida y etambutol, que ayudan a eliminar    " +
                                                  "\n la bacteria Mycobacterium tuberculosis. Marcas reconocidas incluyen Rifater y Myambutol, las cuales han demostrado eficacia   " +
                                                  "\n en el manejo de la tuberculosis. ALIMENTACIÓN. Para fortalecer el sistema inmunológico y reducir la inflamación, se           " +
                                                  "\n recomienda consumir frutas cítricas como naranja, limón y toronja, que son ricas en vitamina C, la cual contribuye a la       " +
                                                  "\n producción de glóbulos blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento diario por    " +
                                                  "\n cada 100 gramos. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente   " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un         " +
                                                  "\n diagnóstico y consultar a un médico especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n EJERCICIO: Se recomienda actividad física de bajo impacto como natación, yoga o caminatas suaves para mantener la        " +
                                                  "\n movilidad articular y reducir la inflamación. La hidroterapia es una excelente opción, ya que el agua templada           " + 
                                                  "\n reduce la presión sobre las articulaciones y mejora la circulación, ayudando a disminuir el dolor y la rigidez.          " +
                                                  "\n También se recomienda el fortalecimiento muscular con ejercicios de resistencia moderada para mejorar la estabilidad     " +
                                                  "\n articular. HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua, aproximadamente 8 a 10 vasos de       " +
                                                  "\n tamaño regular, para mantener la lubricación de las articulaciones y reducir la rigidez matutina. La hidratación         " +
                                                  "\n adecuada también contribuye a la eliminación de toxinas y mejora la función celular, lo que puede ayudar a reducir la    " +
                                                  "\n inflamación en las articulaciones. POSIBLE TRATAMIENTO: La artritis se trata con medicamentos antiinflamatorios como     " +
                                                  "\n ibuprofeno y naproxeno, además de fármacos modificadores de la enfermedad como metotrexato y sulfasalazina. En México,   " +
                                                  "\n algunas marcas reconocidas son Voltaren (diclofenaco), Celebrex (celecoxib) y Arava (leflunomida). También se recomienda " +
                                                  "\n el uso de suplementos como glucosamina y condroitina para mejorar la salud articular. ALIMENTACIÓN RECOMENDADA: Para     " +
                                                  "\n reducir la inflamación y fortalecer las articulaciones, se recomienda el consumo de alimentos ricos en vitaminas y       " +
                                                  "\n minerales esenciales. PESCADOS GRASOS (salmón, atún): Fuente de OMEGA-3, con propiedades antiinflamatorias, proporcionando" +
                                                  "\n aproximadamente 2.2 gramos por cada 100 gramos de pescado. FRUTAS CÍTRICAS (naranjas, limones, toronjas): Altas en    " +
                                                  "\n VITAMINA C, que fortalece el sistema inmune y ayuda a la producción de colágeno, aportando aproximadamente 89% del    " +
                                                  "\n requerimiento diario por cada 100 gramos. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO,     " +
                                                  "\n fundamentales para la regeneración celular y la función muscular, aportando cerca del 15% del requerimiento diario    " +
                                                  "\n por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que   " +
                                                  "\n la paciente tenga artritis ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico para   " +
                                                  "\n mayor seguridad y, por su salud, consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n EJERCICIO: Se recomienda evitar esfuerzos físicos intensos mientras persistan los síntomas, priorizando el descanso          " +
                                                  "\n y la recuperación pulmonar. Sin embargo, una vez superada la fase aguda, se pueden realizar ejercicios de respiración        " +
                                                  "\n profunda para fortalecer los pulmones y mejorar la capacidad respiratoria. HIDRATACIÓN: Es fundamental el consumo de         " +
                                                  "\n 2.5 a 3 litros de agua, aproximadamente 10 a 12 vasos de tamaño regular, para mantener las vías respiratorias hidratadas     " +
                                                  "\n y facilitar la eliminación de secreciones. También se recomienda el consumo de líquidos tibios como infusiones de jengibre   " +
                                                  "\n o miel para aliviar la irritación de la garganta y mejorar la expectoración. POSIBLE TRATAMIENTO: La tosferina se trata      " +
                                                  "\n con antibióticos como azitromicina, claritromicina y eritromicina. En México, algunas marcas reconocidas son Zithromax       " +
                                                  "\n (azitromicina), Klaricid (claritromicina) y Ilosone (eritromicina). Además, se recomienda el uso de broncodilatadores en     " +
                                                  "\n casos de dificultad respiratoria severa y el seguimiento de un plan de vacunación adecuado para prevenir futuros contagios.  " +
                                                  "\n ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema inmunológico y mejorar la recuperación, se recomienda el consumo de     " +
                                                  "\n alimentos ricos en vitaminas y minerales esenciales. FRUTAS CÍTRICAS (naranjas, limones, toronjas): Altas en VITAMINA C,     " +
                                                  "\n que fortalece el sistema inmune, aportando aproximadamente 89% del requerimiento diario por cada 100 gramos. JENGIBRE:       " +
                                                  "\n Contiene compuestos con efectos antiinflamatorios que pueden ayudar a aliviar la irritación de las vías respiratorias,       " +
                                                  "\n proporcionando 5% del requerimiento diario de antioxidantes por cada 10 gramos. MIEL: Con propiedades antimicrobianas y      " +
                                                  "\n calmantes para la garganta, aportando 20% del requerimiento diario de antioxidantes por cada 30 gramos. Este es solo un      " +
                                                  "\n diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que la paciente tenga tosferina ni que el         " +
                                                  "\n tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico para mayor seguridad y, por su salud, consultar    " +
                                                  "\n a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas. " +
                                                  "\n EJERCICIO: Se recomienda reposo absoluto mientras persistan los síntomas para evitar complicaciones. Una vez superada     " +
                                                  "\n la fase aguda, se pueden realizar ejercicios suaves de movilidad para evitar la rigidez muscular y mejorar la             " +
                                                  "\n circulación. HIDRATACIÓN: Es esencial el consumo de 2 a 2.5 litros de agua, aproximadamente 8 a 10 vasos de tamaño        " +
                                                  "\n regular, para mantener la hidratación y reducir la fiebre. También se recomienda el consumo de caldos y sopas tibias      " +
                                                  "\n para facilitar la ingesta de líquidos sin irritar las glándulas salivales. POSIBLE TRATAMIENTO: No existe un tratamiento  " +
                                                  "\n específico para las paperas, pero se pueden utilizar analgésicos como paracetamol e ibuprofeno para aliviar los síntomas. " +
                                                  "\n En México, algunas marcas reconocidas son Tempra (paracetamol) y Advil (ibuprofeno). También se recomienda el uso de      " +
                                                  "\n compresas frías en la zona inflamada para reducir el dolor y la hinchazón. ALIMENTACIÓN RECOMENDADA: Para fortalecer      " +
                                                  "\n el sistema inmunológico y mejorar la recuperación, se recomienda el consumo de alimentos ricos en vitaminas y minerales   " +
                                                  "\n esenciales. FRUTAS CÍTRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema inmune, aportando" +
                                                  "\n aproximadamente 89% del requerimiento diario por cada 100 gramos. PURÉS Y SOPAS: Facilitan la ingesta de alimentos sin    " +
                                                  "\n irritar las glándulas salivales, proporcionando 15% del requerimiento diario de minerales esenciales por cada 100 gramos. " +
                                                  "\n VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales para la regeneración celular y la   " +
                                                  "\n función muscular, aportando cerca del 15% del requerimiento diario por cada 100 gramos. Este es solo un diagnóstico  " +
                                                  "\n predeterminado lógico. Haberlo consultado no garantiza al 100% que la paciente tenga paperas ni que el tratamiento   " +
                                                  "\n sea el adecuado. Se recomienda realizar más de un diagnóstico para mayor seguridad y, por su salud, consultar a su   " +
                                                  "\n médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al día (aproximadamente ocho a diez        " +
                                                  "\n vasos de agua de tamaño regular) para ayudar a su cuerpo a combatir la infección y prevenir la deshidratación causada por      " +
                                                  "\n fiebre y sudoración. También se recomienda el consumo de líquidos ricos en electrolitos como agua de coco o suero oral         " +
                                                  "\n para mejorar la recuperación. EJERCICIO: Se recomienda reposo moderado, evitando esfuerzos físicos intensos mientras           " +
                                                  "\n persistan los síntomas. Sin embargo, una vez recuperada, es recomendable realizar ejercicios de bajo impacto como caminatas    " +
                                                  "\n suaves, yoga o estiramientos para mejorar la circulación y fortalecer el sistema inmunológico. La actividad física debe ser    " +
                                                  "\n progresiva y adaptada a la condición de la paciente, evitando la exposición prolongada al sol y asegurando una hidratación     " +
                                                  "\n adecuada durante el ejercicio. POSIBLE TRATAMIENTO: No existe un tratamiento específico para el Zika. El manejo se centra      " +
                                                  "\n en aliviar los síntomas con paracetamol (marca común en México: Tempra) para la fiebre y el dolor, evitando el uso de          " +
                                                  "\n aspirina y otros antiinflamatorios no esteroides debido al riesgo de complicaciones hemorrágicas. También se recomienda        " +
                                                  "\n el uso de antihistamínicos para aliviar el sarpullido y la picazón. En casos graves, es fundamental el monitoreo médico        " +
                                                  "\n para evitar complicaciones neurológicas o en el embarazo. ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema inmunológico    " +
                                                  "\n y ayudar en la recuperación, se recomienda el consumo de FRUTAS CÍTRICAS como naranja, limón y toronja, ricas en VITAMINA C,   " +
                                                  "\n que ayuda a fortalecer el sistema inmune y aporta aproximadamente el 89% del requerimiento diario por cada 100 g de consumo.   " + 
                                                  "\n PAPAYA, que contiene VITAMINA A y C, además de enzimas que pueden ayudar a reducir la inflamación, aportando cerca del 75%     " +
                                                  "\n del requerimiento diario de VITAMINA C por cada 100 g. JENGIBRE, con propiedades ANTIINFLAMATORIAS y antioxidantes que pueden  " +
                                                  "\n aliviar síntomas como dolor muscular, aportando compuestos bioactivos como gingerol y shogaol. VERDURAS DE HOJA VERDE como     " +
                                                  "\n espinaca, acelga y kale, ricas en HIERRO y antioxidantes esenciales para la recuperación celular, aportando cerca del 15%      " +
                                                  "\n del requerimiento diario de HIERRO por cada 100 g. AGUA DE COCO, fuente natural de ELECTROLITOS, útil para prevenir la         " +
                                                  "\n deshidratación, aportando potasio y sodio esenciales para la hidratación celular. Este es solo un diagnóstico predeterminado   " +
                                                  "\n lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente " +
                                                  "\n correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su        " +
                                                  "\n salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece  " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2.5 a 3 litros de agua al día (aproximadamente diez a doce         " +
                                                  "\n vasos de agua de tamaño regular) para prevenir la deshidratación causada por diarrea y vómitos. Además, se recomienda el        " +
                                                  "\n consumo de soluciones de rehidratación oral como suero fisiológico para reponer los electrolitos perdidos y evitar              " +
                                                  "\n complicaciones graves. EJERCICIO: Se recomienda reposo absoluto mientras persistan los síntomas, evitando cualquier             " +
                                                  "\n actividad física intensa. Una vez recuperada, puede retomar el ejercicio de forma progresiva, comenzando con caminatas          " +
                                                  "\n suaves y ejercicios de movilidad para fortalecer el cuerpo sin generar estrés adicional. También es recomendable realizar       " +
                                                  "\n ejercicios de respiración y relajación para reducir el impacto del malestar digestivo y mejorar la recuperación. POSIBLE        " +
                                                  "\n TRATAMIENTO: No existe un tratamiento específico para el rotavirus. El manejo se centra en la rehidratación con soluciones      " +
                                                  "\n de electrolitos como Suero Oral (marca común en México: Electrolit) para reponer los minerales perdidos. En casos graves,       " +
                                                  "\n puede requerirse hidratación intravenosa en un entorno hospitalario. También se recomienda el uso de probióticos para           " +
                                                  "\n ayudar a restaurar la flora intestinal y mejorar la digestión. En algunos casos, los médicos pueden recomendar medicamentos     " +
                                                  "\n para controlar los vómitos y la fiebre, asegurando una recuperación más rápida y efectiva. ALIMENTACIÓN RECOMENDADA: Para       " +
                                                  "\n fortalecer el sistema digestivo y ayudar en la recuperación, se recomienda el consumo de PLÁTANO, rico en POTASIO, que ayuda    " +
                                                  "\n a reponer electrolitos perdidos, aportando aproximadamente el 12% del requerimiento diario por cada 100 g. ARROZ BLANCO,        " +
                                                  "\n fuente de CARBOHIDRATOS de fácil digestión, que ayuda a estabilizar el sistema digestivo. MANZANA, rica en PECTINA, que         " +
                                                  "\n contribuye a la regulación intestinal y aporta cerca del 10% del requerimiento diario de FIBRA por cada 100 g. ZANAHORIA,       " +
                                                  "\n fuente de VITAMINA A, que ayuda a la regeneración celular y aporta aproximadamente el 89% del requerimiento diario por cada     " +
                                                  "\n 100 g. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta    " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar más de un diagnóstico para mayor          " +
                                                  "\n seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo,           " +
                                                  "\n se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de al menos 2 litros de agua al día (aproximadamente ocho vasos de agua de tamaño   " +
                                                  "\n regular) para ayudar al cuerpo a eliminar la bacteria y prevenir la deshidratación causada por fiebre y malestar.         " +
                                                  "\n También es recomendable el consumo de líquidos ricos en electrolitos como agua de coco o caldos naturales para mejorar    " +
                                                  "\n la recuperación. EJERCICIO: Durante la fase aguda de la infección, se recomienda reposo absoluto para permitir que el     " +
                                                  "\n cuerpo combata la bacteria. Sin embargo, una vez recuperada, se pueden realizar ejercicios de bajo impacto como           " +
                                                  "\n caminatas suaves, yoga o estiramientos para mejorar la circulación y fortalecer el sistema inmunológico. POSIBLE          " +
                                                  "\n TRATAMIENTO: El tratamiento para la listeriosis suele incluir antibióticos como ampicilina o gentamicina (marcas          " +
                                                  "\n comunes en México: Amikin, Ampigrin) en casos graves. Además, se recomienda el consumo de alimentos ricos en              " +
                                                  "\n antioxidantes para ayudar al cuerpo a combatir la infección de manera natural. En algunos casos, los médicos pueden       " +
                                                  "\n recomendar suplementos vitamínicos para fortalecer el sistema inmunológico y acelerar la recuperación. ALIMENTACIÓN       " +
                                                  "\n RECOMENDADA: Para fortalecer el sistema inmunológico y ayudar en la recuperación, se recomienda el consumo de YOGUR       " +
                                                  "\n NATURAL, rico en PROBIÓTICOS, que favorecen la recuperación intestinal y aportan aproximadamente 10^9 UFC por cada        " +
                                                  "\n 100 g. AJO, con propiedades ANTIBACTERIANAS, que pueden ayudar a combatir la infección y aporta compuestos bioactivos     " +
                                                  "\n como alicina. ESPINACA, fuente de VITAMINA C y HIERRO, que fortalece el sistema inmune y aporta cerca del 15% del         " +
                                                  "\n requerimiento diario de HIERRO por cada 100 g. FRUTOS ROJOS, ricos en ANTIOXIDANTES, que ayudan a reducir la inflamación  " +
                                                  "\n y aportan aproximadamente el 50% del requerimiento diario de VITAMINA C por cada 100 g. Este es solo un diagnóstico       " +
                                                  "\n predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las           " +
                                                  "\n respuestas sean completamente correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el          " +
                                                  "\n tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda       " +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACIÓN. Es fundamental mantener una hidratación adecuada para compensar la pérdida de líquidos causada por la       " +
                                                  "\n diarrea, se recomienda el consumo de 2.5 a 3 litros de agua al día, además de soluciones de rehidratación oral como      " +
                                                  "\n Pedialyte para recuperar electrolitos esenciales, también es recomendable el consumo de caldos ligeros y agua de         " +
                                                  "\n coco para reponer minerales perdidos y evitar la deshidratación severa. EJERCICIO. Durante la fase aguda de la           " +
                                                  "\n enfermedad se recomienda reposo absoluto para evitar la deshidratación y el desgaste físico, una vez recuperada la       " +
                                                  "\n paciente puede retomar actividades ligeras como caminatas cortas para mejorar la circulación y fortalecer el sistema     " +
                                                  "\n inmunológico, además ejercicios de movilidad pueden ayudar a recuperar la energía y mejorar la digestión. POSIBLE        " +
                                                  "\n TRATAMIENTO. El tratamiento suele incluir antibióticos en casos graves como la azitromicina o ciprofloxacino, además     " +
                                                  "\n pueden recetarse medicamentos para aliviar los síntomas como el subsalicilato de bismuto (Pepto-Bismol), es fundamental  " +
                                                  "\n seguir las indicaciones médicas y evitar la automedicación, también se recomienda el consumo de probióticos para         " +
                                                  "\n restaurar la flora intestinal y mejorar la absorción de nutrientes esenciales. ALIMENTACIÓN. Se recomienda el consumo    " +
                                                  "\n de alimentos ricos en fibra y probióticos para restaurar la flora intestinal, PLÁTANO. Rico en potasio que ayuda a       " +
                                                  "\n recuperar los electrolitos perdidos, aporta aproximadamente el 10% de la ingesta diaria recomendada por cada 100 gramos. " +
                                                  "\n YOGURT NATURAL. Contiene probióticos que ayudan a restaurar la flora intestinal, su consumo puede aportar hasta el 20%   " +
                                                  "\n de la ingesta diaria recomendada de probióticos. ZANAHORIA. Rica en vitamina A que ayuda a la regeneración celular    " +
                                                  "\n intestinal, aporta aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos. Este es solo un       " +
                                                  "\n Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad       " +
                                                  "\n y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico    " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la       " +
                                                  "\n respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n HIDRATACIÓN. Es crucial mantener una hidratación adecuada para facilitar la eliminación de secreciones y mejorar la    " +
                                                  "\n función pulmonar, se recomienda el consumo de 2.5 a 3 litros de agua al día, además de infusiones calientes como té    " +
                                                  "\n de jengibre o tomillo para aliviar la inflamación pulmonar, también se recomienda el consumo de agua con limón para    " +
                                                  "\n aportar vitamina C y fortalecer el sistema inmunológico. EJERCICIO. Se recomienda actividad física moderada como       " +
                                                  "\n ejercicios de respiración profunda, caminatas cortas y yoga para mejorar la capacidad pulmonar y reducir la fatiga,    " +
                                                  "\n además ejercicios de expansión torácica pueden ayudar a mejorar la oxigenación y fortalecer los músculos respiratorios,  " +
                                                  "\n es importante realizarlo bajo supervisión médica y ajustar la intensidad según la tolerancia del paciente. POSIBLE       " +
                                                  "\n TRATAMIENTO. El tratamiento suele incluir broncodilatadores como el salbutamol (Ventolin) y corticosteroides inhalados   " +
                                                  "\n como la fluticasona (Flixotide), además pueden recetarse antibióticos en caso de infecciones respiratorias secundarias,  " +
                                                  "\n también se recomienda la rehabilitación pulmonar para mejorar la calidad de vida del paciente y reducir la progresión    " +
                                                  "\n de la enfermedad, es fundamental seguir las indicaciones médicas y evitar la exposición a contaminantes. ALIMENTACIÓN.   " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema          " +
                                                  "\n respiratorio, ESPINACA. Rica en vitamina A que ayuda a la regeneración celular pulmonar, aporta aproximadamente          " +
                                                  "\n el 56% de la ingesta diaria recomendada por cada 100 gramos. TOMILLO. Contiene compuestos con propiedades antimicrobianas" +
                                                  "\n y ayuda a aliviar la inflamación pulmonar, su consumo puede aportar hasta el 15% de la ingesta diaria recomendada de  " +
                                                  "\n antioxidantes. PESCADO GRASO (SALMÓN, ATÚN). Rico en Omega-3 que puede ayudar a reducir la inflamación pulmonar,      " +
                                                  "\n aporta aproximadamente el 50% de la ingesta diaria recomendada de Omega-3 por cada 100 gramos. Este es solo un        " +
                                                  "\n Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad       " +
                                                  "\n y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico    " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la       " +
                                                  "\n respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACIÓN. Es fundamental mantener una hidratación adecuada para ayudar al cuerpo a eliminar la infección y reducir         " +
                                                  "\n la inflamación, se recomienda el consumo de 2 a 2.5 litros de agua al día, además de infusiones sin azúcar como té verde      " +
                                                  "\n o agua de jamaica para mejorar la circulación, también se recomienda el consumo de agua con miel y limón para aliviar la      " +
                                                  "\n irritación y fortalecer el sistema inmunológico. EJERCICIO. Se recomienda actividad física moderada como caminatas,           " + 
                                                  "\n natación o yoga para mejorar la circulación y fortalecer el sistema inmunológico, además ejercicios de movilidad pueden       " +
                                                  "\n ayudar a reducir la inflamación y mejorar la recuperación, es importante realizar ejercicio de manera constante y bajo        " +
                                                  "\n supervisión médica. POSIBLE TRATAMIENTO. El tratamiento suele incluir antibióticos como la azitromicina o doxiciclina,        " +
                                                  "\n además pueden recetarse medicamentos complementarios para aliviar los síntomas, también se recomienda el uso de probióticos   " +
                                                  "\n para mejorar la flora vaginal y reducir el riesgo de reinfección, es fundamental seguir las indicaciones médicas y evitar     " +
                                                  "\n el contacto sexual sin protección durante el tratamiento. ALIMENTACIÓN. Se recomienda el consumo de alimentos ricos en        " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico, ARÁNDANOS. Ricos en antioxidantes que ayudan   " +
                                                  "\n a combatir infecciones, aportan aproximadamente el 25% de la ingesta diaria recomendada por cada 100 gramos. AJO. Contiene    " +
                                                  "\n compuestos antimicrobianos que pueden ayudar a combatir la infección, su consumo puede aportar hasta el 20% de la ingesta     " +
                                                  "\n diaria recomendada de antioxidantes. JENGIBRE. Contiene propiedades antiinflamatorias que pueden ayudar a reducir los         " +
                                                  "\n síntomas, su consumo puede aportar hasta el 15% de la ingesta diaria recomendada de antioxidantes. Este es solo un Diagnóstico" +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la         " +
                                                  "\n enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer   " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface" +
                                                  "\n del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana. " +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tamaño regular) para mantener     " +
                                                  "\n una hidratación adecuada. Esto ayuda a reducir la fiebre, mejorar la circulación y facilitar la eliminación de toxinas.        " +
                                                  "\n La hidratación es clave para evitar complicaciones neurológicas y mejorar la recuperación. EJERCICIO: Se aconseja actividad    " +
                                                  "\n física ligera y progresiva, evitando esfuerzos intensos mientras persistan los síntomas. Se recomienda caminatas suaves de     " +
                                                  "\n 15 a 30 minutos diarios para mejorar la oxigenación y la recuperación cerebral. Es importante evitar actividades que puedan    " +
                                                  "\n generar estrés físico excesivo. POSIBLE TRATAMIENTO: Para la meningitis bacteriana en mujeres jóvenes, el tratamiento suele    " +
                                                  "\n incluir antibióticos intravenosos como la ceftriaxona o la vancomicina, dependiendo del agente causal. También pueden          " +
                                                  "\n utilizarse corticosteroides para reducir la inflamación cerebral y medicamentos para controlar la fiebre y el dolor. En        " +
                                                  "\n algunos casos, se requiere hospitalización para monitoreo y tratamiento intensivo. ALIMENTACIÓN: Se recomienda el consumo de   " +
                                                  "\n alimentos ricos en vitaminas y minerales esenciales para fortalecer el sistema inmunológico y mejorar la función cerebral:     " +
                                                  "\n Naranjas y mandarinas: Ricas en vitamina C (hasta un 89% del requerimiento diario por cada 100g), esenciales para mejorar la   " +
                                                  "\n respuesta inmune. Jengibre: Posee propiedades antiinflamatorias y antioxidantes que pueden aliviar la fiebre y mejorar la      " +
                                                  "\n circulación. Espinacas y brócoli: Ricos en vitamina A (hasta un 56% del requerimiento diario en 100g de espinaca) y vitamina C " +
                                                  "\n (hasta un 107% del requerimiento diario en 100g de brócoli), esenciales para fortalecer el sistema inmunológico y acelerar la  " +
                                                  "\n recuperación. Ajo: Contiene alicina, un compuesto con propiedades antimicrobianas que puede ayudar a combatir infecciones      " +
                                                  "\n bacterianas. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga  " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un     " +
                                                  "\n diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además, por su salud,   " +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico. Angel L Montes    " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tamaño regular) para mantener     " +
                                                  "\n una hidratación adecuada. La hidratación es fundamental para mejorar la función renal, eliminar toxinas y reducir los          " +
                                                  "\n efectos secundarios de los tratamientos como la quimioterapia. EJERCICIO: Se aconseja actividad física moderada, adaptada      " +
                                                  "\n a la condición de la paciente. Se recomienda caminatas de 30 a 60 minutos diarios, ejercicios de resistencia o yoga, lo cual   " +
                                                  "\n ayuda a mejorar la circulación, fortalecer el sistema inmunológico y reducir la fatiga. POSIBLE TRATAMIENTO: Para el cáncer    " +
                                                  "\n en mujeres jóvenes, el tratamiento depende del tipo y estadio de la enfermedad. Puede incluir cirugía, quimioterapia,          " +
                                                  "\n radioterapia o terapia dirigida. Medicamentos como el paclitaxel y la doxorrubicina son comunes en ciertos tipos de cáncer.    " +
                                                  "\n Es fundamental seguir un plan de tratamiento personalizado bajo supervisión médica. ALIMENTACIÓN: Se recomienda el consumo     " +
                                                  "\n de alimentos ricos en antioxidantes, vitaminas y minerales esenciales para fortalecer el sistema inmunológico y mejorar la     " +
                                                  "\n recuperación: Aguacate: Rico en grasas saludables y vitamina E, ayuda a proteger las células del daño oxidativo. Frutos rojos  " +
                                                  "\n (arándanos, fresas): Contienen antioxidantes y vitamina C (hasta un 65% del requerimiento diario en 100g de fresas), que       " +
                                                  "\n pueden mejorar la respuesta inmune. Espinacas y brócoli: Ricos en hierro (hasta un 15% del requerimiento diario en 100g de     " +
                                                  "\n espinaca) y vitamina C (hasta un 107% del requerimiento diario en 100g de brócoli), esenciales para la producción de glóbulos  " +
                                                  "\n rojos y la función inmunológica. Jengibre: Posee propiedades antiinflamatorias y antioxidantes que pueden ayudar a reducir la  " +
                                                  "\n inflamación y mejorar la digestión. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% " +
                                                  "\n que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda    " + 
                                                  "\n hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además, por  " +
                                                  "\n su salud, si la respuesta del diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico. Angel L      " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.50-1.75 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para          " +
                                                  "\n mantener una hidratación adecuada. Esto ayuda a reducir la congestión, mantener la mucosa respiratoria hidratada y         " +
                                                  "\n favorecer la eliminación de toxinas. EJERCICIO: Se aconseja actividad física moderada diariamente, evitando esfuerzos      " +
                                                  "\n excesivos mientras persistan los síntomas. Se recomienda al menos 30 minutos de ejercicio ligero, como caminatas o         " +
                                                  "\n estiramientos, lo cual ayuda a mejorar la circulación, fortalecer el sistema inmune y promover una recuperación más        " +
                                                  "\n efectiva. POSIBLE TRATAMIENTO: Para la gripe en mujeres jóvenes, el tratamiento suele incluir medicamentos para reducir    " +
                                                  "\n la fiebre y aliviar los síntomas, como el paracetamol (marca común en México: Tempra) o el ibuprofeno. También pueden      " +
                                                  "\n utilizarse antivirales específicos contra la gripe, como el oseltamivir (marca común: Tamiflu), en casos más severos o     " +
                                                  "\n bajo indicación médica. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en vitaminas, minerales y antioxidantes  " +
                                                  "\n para fortalecer el sistema inmunológico y combatir los síntomas de la gripe: Naranjas y mandarinas: Ricas en vitamina C    " +
                                                  "\n (hasta un 89% del requerimiento diario por cada 100g), esenciales para reducir la duración de los síntomas y mejorar       " +
                                                  "\n la respuesta inmune. Fresas y arándanos: Contienen antioxidantes y vitamina C (hasta un 65% del requerimiento diario       " +
                                                  "\n en 100g de fresas) que protegen las células del daño causado por la infección. Jengibre: Posee propiedades antiinflamatorias " +
                                                  "\n y antioxidantes que pueden aliviar la congestión y el malestar general. Espinacas y brócoli: Ricos en vitamina A     " +
                                                  "\n (hasta un 56% del requerimiento diario en 100g de espinaca) y vitamina C (hasta un 107% del requerimiento diario     " +
                                                  "\n en 100g de brócoli), esenciales para fortalecer el sistema inmunológico y acelerar la recuperación. Este es solo     " +
                                                  "\n un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad   " +
                                                  "\n y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico   " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además, por su salud, si la    " +
                                                  "\n respuesta del diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico. Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tamaño regular) para            " +
                                                  "\n mantener una hidratación adecuada. Esto ayuda a fluidificar las secreciones pulmonares, facilitando su expulsión y           " +
                                                  "\n reduciendo la congestión respiratoria. EJERCICIO: Se aconseja actividad física ligera y progresiva, evitando esfuerzos       " +
                                                  "\n intensos mientras persistan los síntomas. Se recomienda caminatas suaves de 15 a 30 minutos diarios para mejorar la          " +
                                                  "\n oxigenación y la recuperación pulmonar. POSIBLE TRATAMIENTO: Para la neumonía en mujeres jóvenes, el tratamiento suele       " +
                                                  "\n incluir antibióticos en caso de infección bacteriana, como la amoxicilina (marca común en México: Amoxil) o la azitromicina. " +
                                                  "\n También pueden utilizarse medicamentos para reducir la fiebre y aliviar los síntomas, como el paracetamol o el ibuprofeno.   " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales para fortalecer el sistema     " +
                                                  "\n inmunológico y mejorar la función pulmonar: Naranjas y mandarinas: Ricas en vitamina C (hasta un 89% del requerimiento       " +
                                                  "\n diario por cada 100g), esenciales para mejorar la respuesta inmune. Jengibre: Posee propiedades antiinflamatorias y          " +
                                                  "\n antioxidantes que pueden aliviar la congestión. Espinacas y brócoli: Ricos en vitamina A (hasta un 56% del requerimiento     " +
                                                  "\n diario en 100g de espinaca) y vitamina C (hasta un 107% del requerimiento diario en 100g de brócoli), esenciales para        " +
                                                  "\n fortalecer el sistema inmunológico y acelerar la recuperación. Ajo: Contiene alicina, un compuesto con propiedades           " +
                                                  "\n antimicrobianas que puede ayudar a combatir infecciones respiratorias. Este es solo un diagnóstico predeterminado            " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus      " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad   " +
                                                  "\n en el tratamiento adecuado de su paciente, además, por su salud, si la respuesta del diagnóstico no le satisface del todo,   " +
                                                  "\n se le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para mantener       " +
                                                  "\n una hidratación adecuada y ayudar a regular los niveles de glucosa en sangre. EJERCICIO: Se aconseja actividad física regular,   " +
                                                  "\n como caminatas de 30 a 60 minutos diarios, ejercicios de resistencia o yoga, lo cual ayuda a mejorar la sensibilidad a la        " +
                                                  "\n insulina y controlar los niveles de azúcar en sangre. POSIBLE TRATAMIENTO: Para la diabetes en mujeres jóvenes, el tratamiento   " +
                                                  "\n suele incluir medicamentos para controlar la glucosa, como la metformina (marca común en México: Glucophage) o insulina en       " +
                                                  "\n casos específicos. También se recomienda el monitoreo constante de los niveles de glucosa y una dieta equilibrada. ALIMENTACIÓN: " +
                                                  "\n Se recomienda el consumo de alimentos con bajo índice glucémico y ricos en nutrientes esenciales para el control de la diabetes: " +
                                                  "\n Aguacate: Rico en grasas saludables y fibra, ayuda a estabilizar los niveles de glucosa. Frutos rojos (arándanos, fresas):       " +
                                                  "\n Contienen antioxidantes y vitamina C (hasta un 65% del requerimiento diario en 100g de fresas), que pueden mejorar la            " +
                                                  "\n sensibilidad a la insulina. Espinacas y brócoli: Ricos en magnesio (hasta un 20% del requerimiento diario en 100g de espinaca),  " +
                                                  "\n esencial para la regulación de la glucosa. Canela: Contiene compuestos que pueden mejorar la sensibilidad a la insulina y        " +
                                                  "\n reducir los niveles de azúcar en sangre. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza      " +
                                                  "\n al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se         " +
                                                  "\n recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente,     " +
                                                  "\n además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico.    " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2 a 2.5 litros de agua al día, ya que una hidratación adecuada ayuda a mantener     " +
                                                  "\n las vías respiratorias húmedas y reducir la inflamación bronquial. También es beneficioso complementar con infusiones        " + 
                                                  "\n naturales como té de jengibre o cúrcuma, que poseen propiedades antiinflamatorias y antioxidantes. EJERCICIO. La actividad   " +
                                                  "\n física moderada es clave para fortalecer el sistema respiratorio y mejorar la capacidad pulmonar. Se recomienda realizar     " +
                                                  "\n ejercicio aeróbico moderado al menos 30 minutos al día, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo. " +
                                                  "\n También es beneficioso incluir ejercicios de respiración como yoga o técnicas de expansión pulmonar. POSIBLE TRATAMIENTO.    " +
                                                  "\n El tratamiento estándar incluye broncodilatadores de alivio rápido como salbutamol, y corticosteroides inhalados como        " +
                                                  "\n fluticasona o budesonida, que ayudan a reducir la inflamación y mejorar la función pulmonar. Marcas reconocidas incluyen     " +
                                                  "\n Ventolin, Aerolin, Flixotide y Pulmicort. ALIMENTACIÓN. Para fortalecer el sistema inmunológico y reducir la inflamación,    " +
                                                  "\n se recomienda consumir frutas cítricas como naranja, limón y toronja, que son ricas en vitamina C, la cual contribuye a la   " +
                                                  "\n producción de glóbulos blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento diario por   " +
                                                  "\n cada 100 gramos. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente  " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un        " +
                                                  "\n diagnóstico y consultar a un médico especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2.5 a 3 litros de agua al día, ya que una hidratación adecuada ayuda a          " +
                                                  "\n mantener el equilibrio del sistema inmunológico y mejorar la absorción de los medicamentos antirretrovirales.            " +
                                                  "\n También es beneficioso complementar con infusiones naturales como té verde o manzanilla, que poseen propiedades          " +
                                                  "\n antioxidantes y antiinflamatorias. EJERCICIO. La actividad física moderada es clave para fortalecer el sistema           " +
                                                  "\n inmunológico y mejorar la salud cardiovascular. Se recomienda realizar ejercicio aeróbico moderado al menos 30           " +
                                                  "\n minutos al día, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo. También es beneficioso incluir      " +
                                                  "\n ejercicios de resistencia como levantamiento de pesas ligeras o yoga, que ayudan a mantener la masa muscular y reducir   " +
                                                  "\n el estrés. POSIBLE TRATAMIENTO. El tratamiento estándar incluye terapia antirretroviral (TAR) con medicamentos como      " +
                                                  "\n tenofovir, emtricitabina y dolutegravir, que ayudan a controlar la replicación del virus y mejorar la calidad de vida.   " +
                                                  "\n Marcas reconocidas incluyen Atripla, Truvada, Tivicay y Biktarvy. ALIMENTACIÓN. Para fortalecer el sistema inmunológico  " +
                                                  "\n y reducir la inflamación, se recomienda consumir frutas cítricas como naranja, limón y toronja, que son ricas en         " +
                                                  "\n vitamina C, la cual contribuye a la producción de glóbulos blancos y mejora la respuesta inmune, aportando aproximadamente  " +
                                                  "\n el 90% del requerimiento diario por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello,   " +
                                                  "\n se recomienda realizar más de un diagnóstico y consultar a un médico especialista. Angel L Montes agradece tu visita a la   " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2 a 2.5 litros de agua al día, ya que una hidratación adecuada ayuda a eliminar       " +
                                                  "\n toxinas y mantener el equilibrio del sistema inmunológico. También es beneficioso complementar con infusiones naturales        " +
                                                  "\n como té verde o manzanilla, que poseen propiedades antibacterianas y antiinflamatorias. EJERCICIO. La actividad física         " +
                                                  "\n moderada es clave para fortalecer el sistema inmunológico y mejorar la circulación sanguínea. Se recomienda realizar           " +
                                                  "\n ejercicio aeróbico moderado al menos 30 minutos al día, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo.   " +
                                                  "\n También es beneficioso incluir ejercicios de resistencia como levantamiento de pesas ligeras o yoga, que ayudan a mantener     " +
                                                  "\n la masa muscular y reducir el estrés. POSIBLE TRATAMIENTO. El tratamiento estándar incluye antibióticos como ceftriaxona y     " +
                                                  "\n azitromicina, que ayudan a eliminar la bacteria Neisseria gonorrhoeae. Marcas reconocidas incluyen Rocephin y Zithromax, las   " +
                                                  "\n cuales han demostrado eficacia en el manejo de la gonorrea. ALIMENTACIÓN. Para fortalecer el sistema inmunológico y reducir    " +
                                                  "\n la inflamación, se recomienda consumir frutas cítricas como naranja, limón y toronja, que son ricas en vitamina C, la cual     " +
                                                  "\n contribuye a la producción de glóbulos blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento" +
                                                  "\n diario por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el  " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de    " +
                                                  "\n un diagnóstico y consultar a un médico especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada para fortalecer el sistema inmunológico y reducir el estrés,         " +
                                                  "\n que puede desencadenar brotes. Ejercicios como yoga, pilates y caminatas suaves son ideales para mejorar la             " +
                                                  "\n circulación y el bienestar general. HIDRATACIÓN: Es fundamental el consumo de 2 a 2.5 litros de agua, aproximadamente   " +
                                                  "\n 8 a 10 vasos de tamaño regular, para mantener la piel hidratada y favorecer la eliminación de toxinas. POSIBLE          " +
                                                  "\n TRATAMIENTO: El herpes genital se trata con antivirales como aciclovir, famciclovir y valaciclovir, que ayudan          " +
                                                  "\n a reducir la duración y severidad de los brotes. En México, algunas marcas reconocidas son Zovirax (aciclovir),         " +
                                                  "\n Famvir (famciclovir) y Valtrex (valaciclovir). También se recomienda el uso de cremas con lidocaína para aliviar        " +
                                                  "\n el dolor y evitar irritaciones. ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema inmunológico y reducir la          " +
                                                  "\n frecuencia de los brotes, se recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales. FRUTAS       " +
                                                  "\n CÍTRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema inmune, aportando aproximadamente " +
                                                  "\n 89% del requerimiento diario por cada 100 gramos. YOGURT NATURAL: Rico en PROBIÓTICOS, que ayudan a equilibrar la       " +
                                                  "\n flora intestinal y fortalecer el sistema inmunológico, proporcionando 20% del requerimiento diario por cada 150 gramos. " +
                                                  "\n VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales para la regeneración celular      " +
                                                  "\n y la función muscular, aportando cerca del 15% del requerimiento diario por cada 100 gramos. Este es solo un diagnóstico  " +
                                                  "\n predeterminado lógico. Haberlo consultado no garantiza al 100% que la paciente tenga herpes genital ni que el tratamiento " +
                                                  "\n sea el adecuado. Se recomienda realizar más de un diagnóstico para mayor seguridad y, por su salud, consultar a su médico." +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada para mejorar la circulación" +
                                                  "\n y fortalecer el sistema inmunológico. Ejercicios como caminatas, natación y estiramientos pueden ser beneficiosos para la        " +
                                                  "\n recuperación. HIDRATACIÓN: Es esencial el consumo de 2.5 a 3 litros de agua, aproximadamente 10 a 12 vasos de tamaño regular,    " +
                                                  "\n para facilitar la eliminación de toxinas y mejorar la función celular. POSIBLE TRATAMIENTO: La sífilis se trata con penicilina,  " +
                                                  "\n que es el medicamento de elección. En México, algunas marcas reconocidas son Benzetacil (penicilina benzatina). En casos de      " +
                                                  "\n alergia a la penicilina, se pueden utilizar alternativas como doxiciclina o azitromicina, bajo supervisión médica. ALIMENTACIÓN  " +
                                                  "\n RECOMENDADA: Para fortalecer el sistema inmunológico y mejorar la recuperación, se recomienda el consumo de alimentos ricos en   " +
                                                  "\n vitaminas y minerales esenciales. FRUTAS CÍTRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema   " +
                                                  "\n inmune, aportando aproximadamente 89% del requerimiento diario por cada 100 gramos. PESCADOS GRASOS (salmón, atún): Fuente de    " +
                                                  "\n OMEGA-3, con propiedades antiinflamatorias, proporcionando aproximadamente 2.2 gramos por cada 100 gramos de pescado. VEGETALES  " +
                                                  "\n DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales para la regeneración celular y la función muscular,  " +
                                                  "\n aportando cerca del 15% del requerimiento diario por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico. Haberlo " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga sífilis ni que el tratamiento sea el adecuado. Se recomienda realizar más  " +
                                                  "\n de un diagnóstico para mayor seguridad y, por su salud, consultar a su médico. Angel L Montes agradece tu visita a la app        " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis." +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada como caminatas suaves y ejercicios de respiración para        " +
                                                  "\n mejorar la capacidad pulmonar y reducir la fatiga. HIDRATACIÓN: Es clave el consumo de 2.5 a 3 litros de         " +
                                                  "\n agua, aproximadamente 10 a 12 vasos de tamaño regular, para mantener las vías respiratorias limpias y            " +
                                                  "\n mejorar la eliminación de toxinas. POSIBLE TRATAMIENTO: La tuberculosis se trata con un régimen de antibióticos  " +
                                                  "\n de primera línea, que incluyen isoniazida, rifampicina, etambutol y pirazinamida. En México, algunas marcas      " +
                                                  "\n reconocidas son Rimactane (rifampicina), Laniazid (isoniazida) y Myambutol (etambutol). Es crucial seguir el     " +
                                                  "\n tratamiento completo durante los meses indicados por el médico para evitar resistencia bacteriana. ALIMENTACIÓN  " +
                                                  "\n RECOMENDADA: Para fortalecer el sistema inmunológico y mejorar la recuperación, se recomienda el consumo de      " +
                                                  "\n alimentos ricos en vitaminas y minerales esenciales. FRUTAS CÍTRICAS (naranjas, limones, toronjas): Altas en     " +
                                                  "\n VITAMINA C, que fortalece el sistema inmune, aportando aproximadamente 89% del requerimiento diario por cada     " +
                                                  "\n 100 gramos. ALMENDRAS Y NUECES: Contienen ZINC, esencial para la cicatrización y la respuesta inmunológica,      " +
                                                  "\n aportando alrededor del 15% del requerimiento diario por cada 30 gramos. PESCADOS GRASOS (salmón, atún): Fuente  " +
                                                  "\n de OMEGA-3, con propiedades antiinflamatorias, proporcionando aproximadamente 2.2 gramos por cada 100 gramos de  " +
                                                  "\n pescado. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO, fundamental para combatir la fatiga y      " +
                                                  "\n mejorar la oxigenación celular, aportando cerca del 15% del requerimiento diario por cada 100 gramos. Este es    " +
                                                  "\n solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que la paciente tenga         " +
                                                  "\n tuberculosis ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico para mayor      " +
                                                  "\n seguridad y, por su salud, consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera  " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis. " +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al día (aproximadamente         " +
                                                  "\n ocho a diez vasos de agua de tamaño regular) para mantener la hidratación de las articulaciones y reducir la        " +
                                                  "\n inflamación. También se recomienda el consumo de líquidos ricos en antioxidantes como té verde o infusiones         " +
                                                  "\n de cúrcuma para mejorar la función articular. EJERCICIO: Se recomienda actividad física moderada y adaptada         " +
                                                  "\n a la condición de la paciente, como ejercicios de bajo impacto, natación, yoga o pilates. Estos ayudan a mejorar    " +
                                                  "\n la movilidad, reducir la rigidez y fortalecer los músculos que protegen las articulaciones. Es importante evitar    " +
                                                  "\n ejercicios de alto impacto que puedan generar estrés en las articulaciones afectadas. POSIBLE TRATAMIENTO: El       " +
                                                  "\n tratamiento para la artritis suele incluir antiinflamatorios no esteroides como ibuprofeno (marca común en México:  " +
                                                  "\n Advil) y corticosteroides en casos graves. También se recomienda el uso de medicamentos modificadores de la         " +
                                                  "\n enfermedad como metotrexato o sulfasalazina para reducir la progresión de la artritis. En algunos casos, la         " +
                                                  "\n terapia física y el uso de suplementos como glucosamina y condroitina pueden ser beneficiosos. ALIMENTACIÓN         " +
                                                  "\n RECOMENDADA: Para fortalecer las articulaciones y reducir la inflamación, se recomienda el consumo de PESCADOS      " +
                                                  "\n GRASOS como salmón y atún, ricos en ÁCIDOS GRASOS OMEGA-3, que poseen propiedades antiinflamatorias y aportan       " +
                                                  "\n aproximadamente el 50% del requerimiento diario por cada 100 g. FRUTOS ROJOS como fresas y arándanos, ricos en      " +
                                                  "\n ANTIOXIDANTES, que ayudan a reducir el daño celular y aportan cerca del 50% del requerimiento diario de VITAMINA C  " +
                                                  "\n por cada 100 g. CÚRCUMA, con propiedades ANTIINFLAMATORIAS, que pueden aliviar el dolor articular y mejorar la      " +
                                                  "\n movilidad. ESPINACA, fuente de HIERRO y VITAMINA K, que fortalece los huesos y aporta aproximadamente el 15% del    " +
                                                  "\n requerimiento diario de HIERRO por cada 100 g. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se  " +
                                                  "\n recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud,   " +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes      " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al día (aproximadamente           " +
                                                  "\n ocho a diez vasos de agua de tamaño regular) para mantener la hidratación de las vías respiratorias y reducir         " +
                                                  "\n la irritación causada por la tos persistente. También se recomienda el consumo de líquidos tibios como té de          " +
                                                  "\n jengibre o caldos naturales para mejorar la función pulmonar. EJERCICIO: Se recomienda reposo absoluto mientras       " +
                                                  "\n persistan los síntomas, evitando cualquier actividad física intensa. Una vez recuperada, se pueden realizar           " +
                                                  "\n ejercicios de respiración y fortalecimiento pulmonar para mejorar la capacidad respiratoria y reducir la fatiga.      " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la tosferina suele incluir antibióticos como azitromicina o claritromicina   " +
                                                  "\n (marcas comunes en México: Zithromax, Klaricid) para reducir la duración de la enfermedad y prevenir complicaciones.  " +
                                                  "\n También se recomienda el uso de broncodilatadores en casos de dificultad respiratoria severa. ALIMENTACIÓN            " +
                                                  "\n RECOMENDADA: Para fortalecer el sistema respiratorio y reducir la inflamación, se recomienda el consumo de            " +
                                                  "\n FRUTAS CÍTRICAS como naranja y toronja, ricas en VITAMINA C, que fortalece el sistema inmune y aporta cerca           " +
                                                  "\n del 89% del requerimiento diario por cada 100 g. JENGIBRE, con propiedades ANTIINFLAMATORIAS y antioxidantes,         " +
                                                  "\n que pueden aliviar síntomas respiratorios y mejorar la función pulmonar. MIEL, con propiedades ANTIBACTERIANAS        " +
                                                  "\n y calmantes, que ayudan a reducir la irritación de la garganta. ESPINACA, fuente de HIERRO y ANTIOXIDANTES, que       " +
                                                  "\n ayudan a mejorar la oxigenación celular y aportan aproximadamente el 15% del requerimiento diario de HIERRO por       " +
                                                  "\n cada 100 g. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el         " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar más de      " +
                                                  "\n un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico " +
                                                  "\n no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al día (aproximadamente ocho       " +
                                                  "\n a diez vasos de agua de tamaño regular) para prevenir la deshidratación causada por fiebre y malestar. También se      " +
                                                  "\n recomienda el consumo de caldos naturales y bebidas con electrolitos para mejorar la recuperación. EJERCICIO: Se       " +
                                                  "\n recomienda reposo absoluto mientras persistan los síntomas, evitando cualquier actividad física intensa. Una vez       " +
                                                  "\n recuperada, se pueden realizar ejercicios de bajo impacto como caminatas suaves y estiramientos para mejorar la        " +
                                                  "\n circulación y fortalecer el sistema inmunológico. POSIBLE TRATAMIENTO: No existe un tratamiento específico para        " +
                                                  "\n las paperas. El manejo se centra en aliviar los síntomas con analgésicos como ibuprofeno o paracetamol (marcas         " +
                                                  "\n comunes en México: Advil, Tempra) para reducir la fiebre y el dolor. También se recomienda el uso de compresas frías   " +
                                                  "\n en la zona inflamada para aliviar la hinchazón. ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema inmunológico y    " +
                                                  "\n ayudar en la recuperación, se recomienda el consumo de FRUTAS CÍTRICAS como naranja y toronja, ricas en VITAMINA C,    " +
                                                  "\n que fortalece el sistema inmune y aporta cerca del 89% del requerimiento diario por cada 100 g. PESCADOS GRASOS como   " +
                                                  "\n salmón y atún, ricos en ÁCIDOS GRASOS OMEGA-3, que poseen propiedades antiinflamatorias y aportan aproximadamente el   " +
                                                  "\n 50% del requerimiento diario por cada 100 g. ESPINACA, fuente de HIERRO y ANTIOXIDANTES, que ayudan a mejorar la       " +
                                                  "\n oxigenación celular y aportan aproximadamente el 15% del requerimiento diario de HIERRO por cada 100 g. JENGIBRE, con  " +
                                                  "\n propiedades ANTIINFLAMATORIAS y antioxidantes, que pueden aliviar síntomas neurológicos y mejorar la función cerebral. " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta  " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Se recomienda realizar más de un diagnóstico para mayor " +
                                                  "\n seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo,  " +
                                                  "\n se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACIÓN. Es fundamental mantener una hidratación adecuada para reducir los síntomas y prevenir complicaciones,     " +
                                                  "\n se recomienda el consumo de 2 a 2.5 litros de agua al día, además de líquidos ricos en electrolitos como agua de       " +
                                                  "\n coco o sueros orales para evitar la deshidratación causada por fiebre y sudoración, también se recomienda el consumo   " +
                                                  "\n de infusiones naturales como té de jengibre para aliviar la inflamación. EJERCICIO. La actividad física debe ser       " +
                                                  "\n ligera y adaptada a la condición del paciente, se recomienda caminatas suaves y ejercicios de movilidad para mejorar   " +
                                                  "\n la circulación y reducir la fatiga, además el descanso adecuado es clave para la recuperación, evitando esfuerzos      " +
                                                  "\n excesivos mientras persistan los síntomas. POSIBLE TRATAMIENTO. No existe un fármaco antiviral específico para tratar  " +
                                                  "\n la infección por virus Zika, el tratamiento es sintomático e incluye antiinflamatorios no esteroideos y analgésicos    " +
                                                  "\n como el paracetamol para reducir la fiebre y aliviar el malestar, también se recomienda reposo, ingesta de abundantes  " +
                                                  "\n líquidos y administración de antihistamínicos para controlar el prurito asociado con el exantema, es fundamental seguir    " +
                                                  "\n las indicaciones médicas y evitar la automedicación. ALIMENTACIÓN. Se recomienda el consumo de alimentos ricos en          " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico, NARANJA. Rica en vitamina C que ayuda       " +
                                                  "\n a reducir la inflamación y fortalecer el sistema inmune, aporta aproximadamente el 89% de la ingesta diaria recomendada    " +
                                                  "\n por cada 100 gramos. JENGIBRE. Contiene compuestos con efectos antiinflamatorios y ayuda a aliviar la fiebre y el          " +
                                                  "\n malestar, su consumo puede aportar hasta el 20% de la ingesta diaria recomendada de antioxidantes. MIEL. Posee             " +
                                                  "\n propiedades antimicrobianas y ayuda a calmar la garganta y reducir la inflamación, aporta cerca del 10% de la ingesta      " +
                                                  "\n diaria recomendada de antioxidantes por cada cucharada. Este es solo un Diagnóstico predeterminado lógico, haberlo         " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén   " +
                                                  "\n correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el            " +
                                                  "\n tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo          " +
                                                  "\n se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACIÓN. Es crucial mantener una hidratación adecuada para prevenir la deshidratación causada por la          " +
                                                  "\n diarrea y el vómito, se recomienda el consumo de 2.5 a 3 litros de agua al día, además de soluciones de           " +
                                                  "\n rehidratación oral como Pedialyte para recuperar electrolitos esenciales, también se recomienda el consumo        " +
                                                  "\n de caldos ligeros y agua de coco para reponer minerales perdidos y evitar la deshidratación severa. EJERCICIO.    " +
                                                  "\n Durante la fase aguda de la enfermedad se recomienda reposo absoluto para evitar la deshidratación y el desgaste  " +
                                                  "\n físico, una vez recuperada la paciente puede retomar actividades ligeras como caminatas cortas para mejorar       " +
                                                  "\n la circulación y fortalecer el sistema inmunológico, además ejercicios de movilidad pueden ayudar a recuperar     " +
                                                  "\n la energía y mejorar la digestión. POSIBLE TRATAMIENTO. No existe un tratamiento específico para la infección     " +
                                                  "\n por rotavirus, el manejo se centra en la prevención de la deshidratación mediante el consumo de líquidos y        " +
                                                  "\n soluciones de rehidratación oral, en casos graves puede requerirse la administración de líquidos intravenosos     " +
                                                  "\n en el hospital, es fundamental seguir las indicaciones médicas y evitar el consumo de alimentos irritantes.       " +
                                                  "\n ALIMENTACIÓN. Se recomienda el consumo de alimentos ricos en fibra y probióticos para restaurar la flora          " +
                                                  "\n intestinal, PLÁTANO. Rico en potasio que ayuda a recuperar los electrolitos perdidos, aporta aproximadamente      " +
                                                  "\n el 10% de la ingesta diaria recomendada por cada 100 gramos. YOGURT NATURAL. Contiene probióticos que ayudan      " +
                                                  "\n a restaurar la flora intestinal, su consumo puede aportar hasta el 20% de la ingesta diaria recomendada de        " +
                                                  "\n probióticos. ZANAHORIA. Rica en vitamina A que ayuda a la regeneración celular intestinal, aporta aproximadamente " +
                                                  "\n el 56% de la ingesta diaria recomendada por cada 100 gramos. Este es solo un Diagnóstico predeterminado lógico,   " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus   " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor  " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le    " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app       " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACIÓN. Es fundamental mantener una hidratación adecuada para ayudar al cuerpo a eliminar la infección y            " +
                                                  "\n reducir la fiebre, se recomienda el consumo de 2 a 2.5 litros de agua al día, además de infusiones sin azúcar            " +
                                                  "\n como té verde o agua de jamaica para mejorar la circulación, también se recomienda el consumo de agua con miel           " +
                                                  "\n y limón para aliviar la irritación y fortalecer el sistema inmunológico. EJERCICIO. Se recomienda actividad física       " +
                                                  "\n moderada como caminatas, natación o yoga para mejorar la circulación y fortalecer el sistema inmunológico, además        " +
                                                  "\n ejercicios de movilidad pueden ayudar a reducir la inflamación y mejorar la recuperación, es importante realizar         " +
                                                  "\n ejercicio de manera constante y bajo supervisión médica. POSIBLE TRATAMIENTO. El tratamiento suele incluir antibióticos  " +
                                                  "\n como la ampicilina o gentamicina, además pueden recetarse medicamentos complementarios para aliviar los síntomas,        " +
                                                  "\n también se recomienda el uso de probióticos para mejorar la flora intestinal y reducir el riesgo de reinfección,         " +
                                                  "\n es fundamental seguir las indicaciones médicas y evitar el consumo de alimentos contaminados. ALIMENTACIÓN. Se           " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico," +
                                                  "\n ARÁNDANOS. Ricos en antioxidantes que ayudan a combatir infecciones, aportan aproximadamente el 25% de la ingesta diaria  " +
                                                  "\n recomendada por cada 100 gramos. AJO. Contiene compuestos antimicrobianos que pueden ayudar a combatir la infección,      " +
                                                  "\n su consumo puede aportar hasta el 20% de la ingesta diaria recomendada de antioxidantes. JENGIBRE. Contiene propiedades   " +
                                                  "\n antiinflamatorias que pueden ayudar a reducir los síntomas, su consumo puede aportar hasta el 15% de la ingesta diaria    " +
                                                  "\n recomendada de antioxidantes. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%  " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se          " +
                                                  "\n recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su        " +
                                                  "\n paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar   " +
                                                  "\n a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tamaño regular)         " +
                                                  "\n para prevenir la deshidratación causada por la diarrea y ayudar a eliminar toxinas. También es recomendable          " +
                                                  "\n el consumo de soluciones de rehidratación oral para reponer electrolitos perdidos. EJERCICIO: Se aconseja            " +
                                                  "\n evitar actividad física intensa mientras persistan los síntomas. Se recomienda caminatas suaves de 15 a 30           " +
                                                  "\n minutos diarios para mejorar la circulación y el bienestar general. POSIBLE TRATAMIENTO: Para la shigelosis          " +
                                                  "\n en mujeres jóvenes, el tratamiento suele incluir antibióticos como la azitromicina o la ciprofloxacina en casos      " +
                                                  "\n graves. También se recomienda el uso de soluciones de rehidratación oral y una dieta adecuada para evitar            " +
                                                  "\n complicaciones. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en probióticos, vitaminas y minerales      " +
                                                  "\n esenciales para fortalecer el sistema digestivo y acelerar la recuperación: Yogur natural: Rico en probióticos,      " +
                                                  "\n ayuda a restaurar la flora intestinal y mejorar la digestión. Plátanos: Contienen potasio (hasta un 12% del          " +
                                                  "\n requerimiento diario en 100g), esencial para reponer electrolitos perdidos. Arroz y pan tostado: Son fáciles de      " +
                                                  "\n digerir y ayudan a estabilizar el sistema digestivo. Zanahorias: Ricas en vitamina A (hasta un 56% del requerimiento " +
                                                  "\n diario en 100g), esenciales para la regeneración celular y la recuperación intestinal. Este es solo un diagnóstico   " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello   " +
                                                  "\n la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para  " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, además, por su salud, si la respuesta del      " +
                                                  "\n diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita" +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tamaño regular) para      " +
                                                  "\n mantener las vías respiratorias hidratadas y reducir la viscosidad de las secreciones bronquiales. También es          " +
                                                  "\n recomendable el consumo de infusiones calientes para aliviar la congestión. EJERCICIO: Se aconseja actividad física    " +
                                                  "\n moderada y adaptada a la capacidad pulmonar de la paciente. Se recomienda ejercicios de respiración, caminatas de      " +
                                                  "\n 30 minutos diarios y yoga para mejorar la función pulmonar. POSIBLE TRATAMIENTO: Para la EPOC en mujeres jóvenes,      " +
                                                  "\n el tratamiento suele incluir broncodilatadores como el salbutamol, corticosteroides inhalados como la fluticasona      " +
                                                  "\n y en algunos casos, terapia de oxígeno. También es fundamental evitar el tabaquismo y la exposición a contaminantes.   " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades antioxidantes y antiinflamatorias para mejorar     " +
                                                  "\n la función pulmonar: Pescados grasos (salmón, atún): Ricos en ácidos grasos Omega-3, que poseen propiedades            " +
                                                  "\n antiinflamatorias. Frutas y verduras de colores vivos (arándanos, fresas, espinacas, brócoli): Ricas en antioxidantes  " +
                                                  "\n como la vitamina C (hasta un 107% del requerimiento diario en 100g de brócoli) y carotenoides, que pueden proteger     " +
                                                  "\n las células del daño. Jengibre: Contiene compuestos con efectos antiinflamatorios que podrían ser beneficiosos para    " +
                                                  "\n las vías respiratorias. Cúrcuma: Con su componente activo, la curcumina, tiene potentes propiedades antiinflamatorias  " +
                                                  "\n y antioxidantes. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la     " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda   " +
                                                  "\n hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente,      " +
                                                  "\n además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se le recomienda mucho consultar       " +
                                                  "\n a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para      " +
                                                  "\n ayudar a eliminar toxinas y mantener la función renal adecuada durante el tratamiento antibiótico. EJERCICIO: Se       " +
                                                  "\n aconseja actividad física moderada, evitando esfuerzos excesivos mientras persistan los síntomas. Se recomienda        " +
                                                  "\n caminatas suaves de 30 minutos diarios para mejorar la circulación y el bienestar general. POSIBLE TRATAMIENTO:        " +
                                                  "\n Para la clamidia en mujeres jóvenes, el tratamiento suele incluir antibióticos como la azitromicina o la doxiciclina.  " +
                                                  "\n Es fundamental completar el tratamiento para evitar complicaciones y reinfecciones. ALIMENTACIÓN: Se recomienda        " +
                                                  "\n el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico         " +
                                                  "\n y ayudar a la recuperación: Ajo: Contiene alicina, un compuesto con propiedades antimicrobianas que puede ayudar       " +
                                                  "\n a combatir infecciones. Frutas cítricas (naranjas, limones, toronjas): Ricas en vitamina C (hasta un 89% del           " +
                                                  "\n requerimiento diario por cada 100g), esenciales para mejorar la respuesta inmune. Jengibre: Posee propiedades          " +
                                                  "\n antiinflamatorias y antioxidantes que pueden aliviar la inflamación y mejorar la circulación. Yogur natural:           " +
                                                  "\n Rico en probióticos, ayuda a restaurar la flora intestinal y fortalecer el sistema inmunológico. Este es solo          " +
                                                  "\n un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad     " +
                                                  "\n y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico     " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además, por su salud, si la      " +
                                                  "\n respuesta del diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico. Angel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2.5 a 3 litros de agua al día, ya que una hidratación adecuada ayuda             " +
                                                  "\n a mantener el equilibrio del sistema nervioso y reducir la inflamación de las meninges. También es beneficioso            " +
                                                  "\n complementar con infusiones naturales como té de manzanilla o jengibre, que poseen propiedades antiinflamatorias          " +
                                                  "\n y relajantes. EJERCICIO. La actividad física moderada es clave para fortalecer el sistema inmunológico y mejorar          " +
                                                  "\n la circulación sanguínea. Se recomienda realizar ejercicio aeróbico moderado al menos 30 minutos al día, como caminar,    " +
                                                  "\n nadar o andar en bicicleta, evitando el sobreesfuerzo. También es beneficioso incluir ejercicios de respiración como      " +
                                                  "\n yoga o técnicas de expansión pulmonar para mejorar la oxigenación cerebral. POSIBLE TRATAMIENTO. El tratamiento           " +
                                                  "\n estándar incluye antibióticos como ceftriaxona, vancomicina y ampicilina, que ayudan a eliminar la bacteria causante      " +
                                                  "\n de la meningitis. En casos graves, se puede requerir hospitalización para administración intravenosa de antibióticos      " +
                                                  "\n y monitoreo de síntomas. Marcas reconocidas incluyen Rocephin, Vancocin y Principen, las cuales han demostrado eficacia   " +
                                                  "\n en el manejo de la enfermedad. También es importante el uso de antiinflamatorios y analgésicos para reducir el dolor y    " +
                                                  "\n la fiebre. ALIMENTACIÓN. Para fortalecer el sistema inmunológico y reducir la inflamación, se recomienda consumir frutas  " +
                                                  "\n cítricas como naranja, limón y toronja, que son ricas en vitamina C, la cual contribuye a la producción de glóbulos       " +
                                                  "\n blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento diario por cada 100 gramos.      " +
                                                  "\n Verduras crucíferas como brócoli y coliflor, que contienen vitamina K y antioxidantes, esenciales para la regeneración    " +
                                                  "\n celular y la protección del sistema nervioso. Pescados grasos como salmón y sardina, que son ricos en Omega-3, el cual    " +
                                                  "\n tiene propiedades antiinflamatorias y aporta alrededor del 50% del requerimiento diario por porción de 100 gramos.        " +
                                                  "\n Legumbres como lentejas y garbanzos, que son fuente de proteínas y hierro, esenciales para la energía y la regeneración   " +
                                                  "\n celular, aportando cerca del 40% del requerimiento diario por cada 100 gramos. Este es solo un diagnóstico predeterminado " +
                                                  "\n lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean          " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico especialista.    " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2.5 a 3 litros de agua al día, ya que una hidratación adecuada ayuda a mantener     " +
                                                  "\n el equilibrio celular y mejorar la eliminación de toxinas. También es beneficioso complementar con infusiones naturales      " +
                                                  "\n como té verde o cúrcuma, que poseen propiedades antioxidantes y anticancerígenas. EJERCICIO. La actividad física moderada    " +
                                                  "\n es clave para fortalecer el sistema inmunológico y mejorar la salud cardiovascular. Se recomienda realizar ejercicio         " +
                                                  "\n aeróbico moderado al menos 30 minutos al día, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo. También   " +
                                                  "\n es beneficioso incluir ejercicios de resistencia como levantamiento de pesas ligeras o yoga, que ayudan a mantener la masa   " +
                                                  "\n muscular y reducir el estrés. POSIBLE TRATAMIENTO. El tratamiento estándar incluye quimioterapia, radioterapia y terapia     " +
                                                  "\n dirigida, dependiendo del tipo y estadio del cáncer. En algunos casos, se puede recurrir a inmunoterapia, que ayuda al       " +
                                                  "\n sistema inmunológico a combatir las células cancerosas. Marcas reconocidas incluyen Herceptin, Avastin, Keytruda y Opdivo,   " +
                                                  "\n las cuales han demostrado eficacia en el manejo de la enfermedad. También es importante el uso de suplementos nutricionales  " +
                                                  "\n para mantener la energía y reducir los efectos secundarios del tratamiento. ALIMENTACIÓN. Para fortalecer el sistema         " +
                                                  "\n inmunológico y reducir la inflamación, se recomienda consumir frutas cítricas como naranja, limón y toronja, que son ricas   " +
                                                  "\n en vitamina C, la cual contribuye a la producción de glóbulos blancos y mejora la respuesta inmune, aportando aproximadamente" +
                                                  "\n el 90% del requerimiento diario por cada 100 gramos. Verduras de hoja verde como espinaca y kale, que contienen ácido fólico " +
                                                  "\n y antioxidantes, esenciales para la regeneración celular y la protección contra el daño oxidativo. Pescados grasos como      " +
                                                  "\n salmón y atún, que son ricos en Omega-3, el cual tiene propiedades antiinflamatorias y aporta alrededor del 50% del          " +
                                                  "\n requerimiento diario por porción de 100 gramos. Frutos secos como almendras y nueces, que aportan vitamina E, la cual        " +
                                                  "\n protege las células del daño oxidativo y contribuye con el 70% del requerimiento diario por cada 30 gramos. Legumbres        " +
                                                  "\n como lentejas y garbanzos, que son fuente de proteínas y hierro, esenciales para la energía y la regeneración celular,       " +
                                                  "\n aportando cerca del 40% del requerimiento diario por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico.     " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente       " +
                                                  "\n correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico especialista. Angel L Montes      " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        
                        if(EstaturaFemenino.equals("1.40-1.65 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para          " +
                                                  "\n mantener una hidratación adecuada. Esto ayuda a reducir la congestión, mantener la mucosa respiratoria hidratada           " +
                                                  "\n y favorecer la eliminación de toxinas. También es recomendable el consumo de infusiones calientes como té de jengibre      " +
                                                  "\n o manzanilla para aliviar la irritación de garganta y mejorar la recuperación. EJERCICIO: Se aconseja actividad física     " +
                                                  "\n moderada diariamente, evitando esfuerzos excesivos mientras persistan los síntomas. Se recomienda al menos 30 minutos      " +
                                                  "\n de ejercicio ligero, como caminatas o estiramientos, lo cual ayuda a mejorar la circulación, fortalecer el sistema         " +
                                                  "\n inmune y promover una recuperación más efectiva. POSIBLE TRATAMIENTO: Para la gripe en mujeres jóvenes, el tratamiento     " +
                                                  "\n suele incluir medicamentos para reducir la fiebre y aliviar los síntomas, como el paracetamol (Tempra) o el ibuprofeno.    " +
                                                  "\n También pueden utilizarse antivirales específicos contra la gripe, como el oseltamivir (Tamiflu), en casos más severos     " +
                                                  "\n o bajo indicación médica. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en vitaminas, minerales y antioxidantes  " +
                                                  "\n para fortalecer el sistema inmunológico y combatir los síntomas de la gripe: Naranjas y mandarinas: Ricas en vitamina C      " +
                                                  "\n (hasta un 89% del requerimiento diario por cada 100g), esenciales para reducir la duración de los síntomas y mejorar la      " +
                                                  "\n respuesta inmune. Fresas y arándanos: Contienen antioxidantes y vitamina C (hasta un 65% del requerimiento diario en 100g    " +
                                                  "\n de fresas) que protegen las células del daño causado por la infección. Jengibre: Posee propiedades antiinflamatorias y       " +
                                                  "\n antioxidantes que pueden aliviar la congestión y el malestar general. Espinacas y brócoli: Ricos en vitamina A (hasta un     " +
                                                  "\n 56% del requerimiento diario en 100g de espinaca) y vitamina C (hasta un 107% del requerimiento diario en 100g de brócoli),  " +
                                                  "\n esenciales para fortalecer el sistema inmunológico y acelerar la recuperación. Este es solo un diagnóstico predeterminado    " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus      " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad   " +
                                                  "\n en el tratamiento adecuado de su paciente, además, por su salud, si la respuesta del diagnóstico no le satisface del todo,   " +
                                                  "\n se le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tamaño regular) para          " +
                                                  "\n mantener una hidratación adecuada. Esto ayuda a fluidificar las secreciones pulmonares, facilitando su expulsión           " +
                                                  "\n y reduciendo la congestión respiratoria. También es recomendable el consumo de caldos y sopas calientes para mejorar       " +
                                                  "\n la hidratación y aliviar la irritación de garganta. EJERCICIO: Se aconseja actividad física ligera y progresiva,           " +
                                                  "\n evitando esfuerzos intensos mientras persistan los síntomas. Se recomienda caminatas suaves de 15 a 30 minutos diarios     " +
                                                  "\n para mejorar la oxigenación y la recuperación pulmonar. POSIBLE TRATAMIENTO: Para la neumonía en mujeres jóvenes, el       " +
                                                  "\n tratamiento suele incluir antibióticos en caso de infección bacteriana, como la amoxicilina (Amoxil) o la azitromicina.    " +
                                                  "\n También pueden utilizarse medicamentos para reducir la fiebre y aliviar los síntomas, como el paracetamol o el ibuprofeno. " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales para fortalecer el sistema   " +
                                                  "\n inmunológico y mejorar la función pulmonar: Naranjas y mandarinas: Ricas en vitamina C (hasta un 89% del requerimiento     " +
                                                  "\n diario por cada 100g), esenciales para mejorar la respuesta inmune. Jengibre: Posee propiedades antiinflamatorias y        " +
                                                  "\n antioxidantes que pueden aliviar la congestión. Espinacas y brócoli: Ricos en vitamina A (hasta un 56% del requerimiento   " +
                                                  "\n diario en 100g de espinaca) y vitamina C (hasta un 107% del requerimiento diario en 100g de brócoli), esenciales para      " +
                                                  "\n fortalecer el sistema inmunológico y acelerar la recuperación. Ajo: Contiene alicina, un compuesto con propiedades         " +
                                                  "\n antimicrobianas que puede ayudar a combatir infecciones respiratorias. Este es solo un diagnóstico predeterminado lógico,  " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el      " +
                                                  "\n tratamiento adecuado de su paciente, además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se    " +
                                                  "\n le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para      " +
                                                  "\n mantener una hidratación adecuada y ayudar a regular los niveles de glucosa en sangre. También es recomendable el      " +
                                                  "\n consumo de infusiones sin azúcar como té verde o manzanilla para mejorar la digestión y el metabolismo. EJERCICIO:     " +
                                                  "\n Se aconseja actividad física regular, como caminatas de 30 a 60 minutos diarios, ejercicios de resistencia o yoga,     " +
                                                  "\n lo cual ayuda a mejorar la sensibilidad a la insulina y controlar los niveles de azúcar en sangre. POSIBLE             " +
                                                  "\n TRATAMIENTO: Para la diabetes en mujeres jóvenes, el tratamiento suele incluir medicamentos para controlar             " +
                                                  "\n la glucosa, como la metformina (Glucophage) o insulina en casos específicos. También se recomienda el monitoreo        " +
                                                  "\n constante de los niveles de glucosa y una dieta equilibrada. ALIMENTACIÓN: Se recomienda el consumo de alimentos       " +
                                                  "\n con bajo índice glucémico y ricos en nutrientes esenciales para el control de la diabetes: Aguacate: Rico en grasas    " +
                                                  "\n saludables y fibra, ayuda a estabilizar los niveles de glucosa. Frutos rojos (arándanos, fresas): Contienen            " +
                                                  "\n antioxidantes y vitamina C (hasta un 65% del requerimiento diario en 100g de fresas), que pueden mejorar la            " +
                                                  "\n sensibilidad a la insulina. Espinacas y brócoli: Ricos en magnesio (hasta un 20% del requerimiento diario en           " +
                                                  "\n 100g de espinaca), esencial para la regulación de la glucosa. Canela: Contiene compuestos que pueden mejorar           " +
                                                  "\n la sensibilidad a la insulina y reducir los niveles de azúcar en sangre. Este es solo un diagnóstico predeterminado    " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y    " +
                                                  "\n sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor   " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además, por su salud, si la respuesta del diagnóstico no le       " +
                                                  "\n satisface del todo, se le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2 a 2.5 litros de agua al día, ya que una hidratación adecuada ayuda a mantener      " +
                                                  "\n las vías respiratorias húmedas y reducir la inflamación bronquial. También es beneficioso complementar con infusiones         " +
                                                  "\n naturales como té de jengibre o cúrcuma, que poseen propiedades antiinflamatorias y antioxidantes. EJERCICIO. La actividad    " +
                                                  "\n física moderada es clave para fortalecer el sistema respiratorio y mejorar la capacidad pulmonar. Se recomienda realizar      " +
                                                  "\n ejercicio aeróbico moderado al menos 30 minutos al día, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo.  " +
                                                  "\n También es beneficioso incluir ejercicios de respiración como yoga o técnicas de expansión pulmonar. POSIBLE TRATAMIENTO.     " +
                                                  "\n El tratamiento estándar incluye broncodilatadores de alivio rápido como salbutamol, y corticosteroides inhalados como         " +
                                                  "\n fluticasona o budesonida, que ayudan a reducir la inflamación y mejorar la función pulmonar. Marcas reconocidas incluyen      " +
                                                  "\n Ventolin, Aerolin, Flixotide y Pulmicort. ALIMENTACIÓN. Para fortalecer el sistema inmunológico y reducir la inflamación,     " +
                                                  "\n se recomienda consumir frutas cítricas como naranja, limón y toronja, que son ricas en vitamina C, la cual contribuye a       " +
                                                  "\n la producción de glóbulos blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento diario     " +
                                                  "\n por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el        " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más      " +
                                                  "\n de un diagnóstico y consultar a un médico especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que     " +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2.5 a 3 litros de agua al día, ya que una hidratación adecuada ayuda     " +
                                                  "\n a mantener el equilibrio del sistema inmunológico y mejorar la absorción de los medicamentos antirretrovirales.   " +
                                                  "\n También es beneficioso complementar con infusiones naturales como té verde o manzanilla, que poseen propiedades   " +
                                                  "\n antioxidantes y antiinflamatorias. EJERCICIO. La actividad física moderada es clave para fortalecer el sistema    " +
                                                  "\n inmunológico y mejorar la salud cardiovascular. Se recomienda realizar ejercicio aeróbico moderado al menos 30    " +
                                                  "\n minutos al día, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo. También es beneficioso       " +
                                                  "\n incluir ejercicios de resistencia como levantamiento de pesas ligeras o yoga, que ayudan a mantener la masa       " +
                                                  "\n muscular y reducir el estrés. POSIBLE TRATAMIENTO. El tratamiento estándar incluye terapia antirretroviral        " +
                                                  "\n (TAR) con medicamentos como tenofovir, emtricitabina y dolutegravir, que ayudan a controlar la replicación        " +
                                                  "\n del virus y mejorar la calidad de vida. Marcas reconocidas incluyen Atripla, Truvada, Tivicay y Biktarvy.         " +
                                                  "\n ALIMENTACIÓN. Para fortalecer el sistema inmunológico y reducir la inflamación, se recomienda consumir frutas     " +
                                                  "\n cítricas como naranja, limón y toronja, que son ricas en vitamina C, la cual contribuye a la producción de        " +
                                                  "\n glóbulos blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento diario por      " +
                                                  "\n cada 100 gramos. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100%       " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda" +
                                                  "\n realizar más de un diagnóstico y consultar a un médico especialista. Angel L Montes agradece tu visita a la app   " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2 a 2.5 litros de agua al día, ya que una hidratación adecuada ayuda   " +
                                                  "\n a eliminar toxinas y mantener el equilibrio del sistema inmunológico. También es beneficioso complementar con   " +
                                                  "\n infusiones naturales como té verde o manzanilla, que poseen propiedades antibacterianas y antiinflamatorias.    " +
                                                  "\n EJERCICIO. La actividad física moderada es clave para fortalecer el sistema inmunológico y mejorar la           " + 
                                                  "\n circulación sanguínea. Se recomienda realizar ejercicio aeróbico moderado al menos 30 minutos al día, como      " +
                                                  "\n caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo. También es beneficioso incluir ejercicios de    " +
                                                  "\n resistencia como levantamiento de pesas ligeras o yoga, que ayudan a mantener la masa muscular y reducir el     " +
                                                  "\n estrés. POSIBLE TRATAMIENTO. El tratamiento estándar incluye antibióticos como ceftriaxona y azitromicina,      " +
                                                  "\n que ayudan a eliminar la bacteria Neisseria gonorrhoeae. Marcas reconocidas incluyen Rocephin y Zithromax, las     " +
                                                  "\n cuales han demostrado eficacia en el manejo de la gonorrea. ALIMENTACIÓN. Para fortalecer el sistema inmunológico  " +
                                                  "\n y reducir la inflamación, se recomienda consumir frutas cítricas como naranja, limón y toronja, que son ricas en   " +
                                                  "\n vitamina C, la cual contribuye a la producción de glóbulos blancos y mejora la respuesta inmune, aportando         " +
                                                  "\n aproximadamente el 90% del requerimiento diario por cada 100 gramos. Este es solo un diagnóstico predeterminado    " +
                                                  "\n lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean   " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico especialista. " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada para fortalecer el sistema inmunológico y reducir el estrés,     " +
                                                  "\n que puede desencadenar brotes. Ejercicios como yoga, pilates y caminatas suaves son ideales para mejorar la         " +
                                                  "\n circulación y el bienestar general. También se recomienda ejercicios de respiración profunda para mejorar la        " +
                                                  "\n oxigenación celular y reducir la inflamación. HIDRATACIÓN: Es fundamental el consumo de 2 a 2.5 litros de agua,     " +
                                                  "\n aproximadamente 8 a 10 vasos de tamaño regular, para mantener la piel hidratada y favorecer la eliminación de       " +
                                                  "\n toxinas. La hidratación adecuada también ayuda a reducir la sequedad y la irritación en la piel, lo que puede       " +
                                                  "\n aliviar los síntomas del herpes genital. POSIBLE TRATAMIENTO: El herpes genital se trata con antivirales como       " +
                                                  "\n aciclovir, famciclovir y valaciclovir, que ayudan a reducir la duración y severidad de los brotes. En México,       " +
                                                  "\n algunas marcas reconocidas son Zovirax (aciclovir), Famvir (famciclovir) y Valtrex (valaciclovir). También se       " +
                                                  "\n recomienda el uso de cremas con lidocaína para aliviar el dolor y evitar irritaciones. Además, mantener una         " +
                                                  "\n dieta equilibrada y evitar el consumo excesivo de alimentos ricos en arginina, como frutos secos y chocolate,       " +
                                                  "\n puede ayudar a reducir la frecuencia de los brotes. ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema            " +
                                                  "\n inmunológico y reducir la frecuencia de los brotes, se recomienda el consumo de alimentos ricos en vitaminas y      " +
                                                  "\n minerales esenciales. FRUTAS CÍTRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema  " +
                                                  "\n inmune, aportando aproximadamente 89% del requerimiento diario por cada 100 gramos. YOGURT NATURAL: Rico en         " +
                                                  "\n PROBIÓTICOS, que ayudan a equilibrar la flora intestinal y fortalecer el sistema inmunológico, proporcionando 20%   " +
                                                  "\n del requerimiento diario por cada 150 gramos. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO,  " +
                                                  "\n fundamentales para la regeneración celular y la función muscular, aportando cerca del 15% del requerimiento diario     " +
                                                  "\n por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que    " +
                                                  "\n la paciente tenga herpes genital ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico   " +
                                                  "\n para mayor seguridad y, por su salud, consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y    " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada para mejorar la circulación y fortalecer el sistema     " +
                                                  "\n inmunológico. Ejercicios como caminatas, natación y estiramientos pueden ser beneficiosos para la          " +
                                                  "\n recuperación. También se recomienda ejercicios de resistencia moderada para mejorar la función muscular    " +
                                                  "\n y reducir la fatiga. HIDRATACIÓN: Es esencial el consumo de 2.5 a 3 litros de agua, aproximadamente 10     " +
                                                  "\n a 12 vasos de tamaño regular, para facilitar la eliminación de toxinas y mejorar la función celular.       " +
                                                  "\n Mantener una hidratación adecuada también contribuye a la regeneración de tejidos y ayuda a reducir la     " +
                                                  "\n inflamación. POSIBLE TRATAMIENTO: La sífilis se trata con penicilina, que es el medicamento de elección.   " +
                                                  "\n En México, algunas marcas reconocidas son Benzetacil (penicilina benzatina). En casos de alergia a la      " +
                                                  "\n penicilina, se pueden utilizar alternativas como doxiciclina o azitromicina, bajo supervisión médica.      " +
                                                  "\n También se recomienda el seguimiento de un plan de tratamiento adecuado para evitar complicaciones a       " +
                                                  "\n largo plazo. ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema inmunológico y mejorar la recuperación,  " +
                                                  "\n se recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales. FRUTAS CÍTRICAS (naranjas," +
                                                  "\n limones, toronjas): Altas en VITAMINA C, que fortalece el sistema inmune, aportando aproximadamente 89%    " +
                                                  "\n del requerimiento diario por cada 100 gramos. PESCADOS GRASOS (salmón, atún): Fuente de OMEGA-3, con       " +
                                                  "\n propiedades antiinflamatorias, proporcionando aproximadamente 2.2 gramos por cada 100 gramos de pescado.   " +
                                                  "\n VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales para la regeneración " +
                                                  "\n celular y la función muscular, aportando cerca del 15% del requerimiento diario por cada 100 gramos. Este  " +
                                                  "\n es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que la paciente tenga" +
                                                  "\n sífilis ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico para mayor     " +
                                                  "\n seguridad y, por su salud, consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y   " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis." +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada como caminatas suaves y ejercicios de respiración para mejorar        " +
                                                  "\n la capacidad pulmonar y reducir la fatiga. También se recomienda ejercicios de expansión torácica para mejorar la        " +
                                                  "\n oxigenación y fortalecer los músculos respiratorios. HIDRATACIÓN: Es clave el consumo de 2.5 a 3 litros de agua,         " +
                                                  "\n aproximadamente 10 a 12 vasos de tamaño regular, para mantener las vías respiratorias limpias y mejorar la eliminación   " +
                                                  "\n de toxinas. También se recomienda el consumo de líquidos tibios como infusiones de jengibre o miel para aliviar la       " +
                                                  "\n irritación de la garganta y mejorar la expectoración. POSIBLE TRATAMIENTO: La tuberculosis se trata con un régimen de    " +
                                                  "\n antibióticos de primera línea, que incluyen isoniazida, rifampicina, etambutol y pirazinamida. En México, algunas        " +
                                                  "\n marcas reconocidas son Rimactane (rifampicina), Laniazid (isoniazida) y Myambutol (etambutol). Es crucial seguir el      " +
                                                  "\n tratamiento completo durante los meses indicados por el médico para evitar resistencia bacteriana. También se recomienda " +
                                                  "\n el seguimiento de un plan de alimentación adecuado para mejorar la recuperación. ALIMENTACIÓN RECOMENDADA: Para          " +
                                                  "\n fortalecer el sistema inmunológico y mejorar la recuperación, se recomienda el consumo de alimentos ricos en vitaminas   " +
                                                  "\n y minerales esenciales. FRUTAS CÍTRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema     " +
                                                  "\n inmune, aportando aproximadamente 89% del requerimiento diario por cada 100 gramos. ALMENDRAS Y NUECES: Contienen ZINC,  " +
                                                  "\n esencial para la cicatrización y la respuesta inmunológica, aportando alrededor del 15% del requerimiento diario por     " +
                                                  "\n cada 30 gramos. PESCADOS GRASOS (salmón, atún): Fuente de OMEGA-3, con propiedades antiinflamatorias, proporcionando     " +
                                                  "\n aproximadamente 2.2 gramos por cada 100 gramos de pescado. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO,  " +
                                                  "\n fundamental para combatir la fatiga y mejorar la oxigenación celular, aportando cerca del 15% del requerimiento diario   " +
                                                  "\n por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que la   " +
                                                  "\n paciente tenga tuberculosis ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico para     " +
                                                  "\n mayor seguridad y, por su salud, consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera    " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al día (aproximadamente        " +
                                                  "\n ocho a diez vasos de agua de tamaño regular) para mantener la hidratación de las articulaciones y reducir la       " +
                                                  "\n inflamación. También se recomienda el consumo de líquidos ricos en antioxidantes como té verde o infusiones de     " +
                                                  "\n cúrcuma para mejorar la función articular. EJERCICIO: Se recomienda actividad física moderada y adaptada a la      " +
                                                  "\n condición de la paciente, como ejercicios de bajo impacto, natación, yoga o pilates. Estos ayudan a mejorar la     " +
                                                  "\n movilidad, reducir la rigidez y fortalecer los músculos que protegen las articulaciones. Es importante evitar      " +
                                                  "\n ejercicios de alto impacto que puedan generar estrés en las articulaciones afectadas. POSIBLE TRATAMIENTO: El      " +
                                                  "\n tratamiento para la artritis se centra en aliviar los síntomas y mejorar el funcionamiento de las articulaciones.  " +
                                                  "\n Se pueden utilizar antiinflamatorios no esteroides como ibuprofeno (marca común en México: Advil) y naproxeno para " +
                                                  "\n reducir el dolor y la inflamación. En casos más graves, los médicos pueden recetar corticosteroides para controlar " +
                                                  "\n la inflamación severa. También se recomienda el uso de medicamentos modificadores de la enfermedad como metotrexato   " +
                                                  "\n o sulfasalazina para reducir la progresión de la artritis. La fisioterapia es una opción clave para mejorar la        " + 
                                                  "\n movilidad y reducir el dolor, incluyendo ejercicios de fortalecimiento y técnicas de terapia manual. En algunos       " +
                                                  "\n casos, la terapia biológica con inhibidores del factor de necrosis tumoral (TNF) puede ser recomendada para pacientes " +
                                                  "\n con artritis reumatoide. ALIMENTACIÓN RECOMENDADA: Para fortalecer las articulaciones y reducir la inflamación, se    " +
                                                  "\n recomienda el consumo de PESCADOS GRASOS como salmón y atún, ricos en ÁCIDOS GRASOS OMEGA-3, que poseen propiedades   " +
                                                  "\n antiinflamatorias y aportan aproximadamente el 50% del requerimiento diario por cada 100 g. FRUTOS ROJOS como fresas  " +
                                                  "\n y arándanos, ricos en ANTIOXIDANTES, que ayudan a reducir el daño celular y aportan cerca del 50% del requerimiento   " +
                                                  "\n diario de VITAMINA C por cada 100 g. CÚRCUMA, con propiedades ANTIINFLAMATORIAS, que pueden aliviar el dolor          " +
                                                  "\n articular y mejorar la movilidad. ESPINACA, fuente de HIERRO y VITAMINA K, que fortalece los huesos y aporta          " +
                                                  "\n aproximadamente el 15% del requerimiento diario de HIERRO por cada 100 g. Este es solo un diagnóstico predeterminado  " +
                                                  "\n lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean      " +
                                                  "\n completamente correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado." +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.  " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al día (aproximadamente               " +
                                                  "\n ocho a diez vasos de agua de tamaño regular) para mantener la hidratación de las vías respiratorias y reducir             " +
                                                  "\n la irritación causada por la tos persistente. También se recomienda el consumo de líquidos tibios como té de              " +
                                                  "\n jengibre o caldos naturales para mejorar la función pulmonar. EJERCICIO: Se recomienda reposo absoluto mientras           " +
                                                  "\n persistan los síntomas, evitando cualquier actividad física intensa. Una vez recuperada, se pueden realizar               " +
                                                  "\n ejercicios de respiración y fortalecimiento pulmonar para mejorar la capacidad respiratoria y reducir la fatiga.          " +
                                                  "\n También es recomendable evitar ambientes con humo o contaminación que puedan agravar los síntomas. POSIBLE                " +
                                                  "\n TRATAMIENTO: El tratamiento para la tosferina suele incluir antibióticos como azitromicina o claritromicina (marcas       " +
                                                  "\n comunes en México: Zithromax, Klaricid) para reducir la duración de la enfermedad y prevenir complicaciones.              " +
                                                  "\n También se recomienda el uso de broncodilatadores en casos de dificultad respiratoria severa. En algunos casos,           " +
                                                  "\n los médicos pueden recomendar el uso de oxigenoterapia para mejorar la respiración en pacientes con síntomas graves.      " +
                                                  "\n Además, se recomienda el uso de humidificadores de vapor frío para aliviar la congestión y reducir la tos. ALIMENTACIÓN   " +
                                                  "\n RECOMENDADA: Para fortalecer el sistema respiratorio y reducir la inflamación, se recomienda el consumo de FRUTAS         " +
                                                  "\n CÍTRICAS como naranja y toronja, ricas en VITAMINA C, que fortalece el sistema inmune y aporta cerca del 89% del          " +
                                                  "\n requerimiento diario por cada 100 g. JENGIBRE, con propiedades ANTIINFLAMATORIAS y antioxidantes, que pueden aliviar      " +
                                                  "\n síntomas respiratorios y mejorar la función pulmonar. MIEL, con propiedades ANTIBACTERIANAS y calmantes, que ayudan       " +
                                                  "\n a reducir la irritación de la garganta. ESPINACA, fuente de HIERRO y ANTIOXIDANTES, que ayudan a mejorar la oxigenación   " +
                                                  "\n celular y aportan aproximadamente el 15% del requerimiento diario de HIERRO por cada 100 g. Este es solo un diagnóstico   " +
                                                  "\n predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas" +
                                                  "\n sean completamente correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento         " +
                                                  "\n adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar         " +
                                                  "\n a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al día (aproximadamente         " +
                                                  "\n ocho a diez vasos de agua de tamaño regular) para prevenir la deshidratación causada por fiebre y malestar.         " +
                                                  "\n También se recomienda el consumo de caldos naturales y bebidas con electrolitos para mejorar la recuperación.       " +
                                                  "\n EJERCICIO: Se recomienda reposo absoluto mientras persistan los síntomas, evitando cualquier actividad física       " +
                                                  "\n intensa. Una vez recuperada, se pueden realizar ejercicios de bajo impacto como caminatas suaves y estiramientos    " +
                                                  "\n para mejorar la circulación y fortalecer el sistema inmunológico. También es recomendable evitar la exposición      " +
                                                  "\n prolongada al frío, ya que puede agravar la inflamación de las glándulas salivales. POSIBLE TRATAMIENTO: No existe  " +
                                                  "\n un tratamiento específico para las paperas. El manejo se centra en aliviar los síntomas con analgésicos como        " +
                                                  "\n ibuprofeno o paracetamol (marcas comunes en México: Advil, Tempra) para reducir la fiebre y el dolor. También       " +
                                                  "\n se recomienda el uso de compresas frías en la zona inflamada para aliviar la hinchazón. En casos graves, los        " +
                                                  "\n médicos pueden recomendar el monitoreo hospitalario para evitar complicaciones como meningitis o inflamación        " +
                                                  "\n testicular. Además, se recomienda evitar alimentos ácidos que puedan irritar las glándulas salivales y aumentar     " +
                                                  "\n el dolor. ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema inmunológico y ayudar en la recuperación, se         " +
                                                  "\n recomienda el consumo de FRUTAS CÍTRICAS como naranja y toronja, ricas en VITAMINA C, que fortalece el sistema      " +
                                                  "\n inmune y aporta cerca del 89% del requerimiento diario por cada 100 g. PESCADOS GRASOS como salmón y atún, ricos    " +
                                                  "\n en ÁCIDOS GRASOS OMEGA-3, que poseen propiedades antiinflamatorias y aportan aproximadamente el 50% del             " +
                                                  "\n requerimiento diario por cada 100 g. ESPINACA, fuente de HIERRO y ANTIOXIDANTES, que ayudan a mejorar la            " +
                                                  "\n oxigenación celular y aportan aproximadamente el 15% del requerimiento diario de HIERRO por cada 100 g.             " +
                                                  "\n JENGIBRE, con propiedades ANTIINFLAMATORIAS y antioxidantes, que pueden aliviar síntomas neurológicos y             " +
                                                  "\n mejorar la función cerebral. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no               " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas.         " +
                                                  "\n Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por           " +
                                                  "\n su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.            " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACIÓN. Es fundamental mantener una hidratación adecuada para reducir los síntomas y prevenir complicaciones,      " +
                                                  "\n se recomienda el consumo de 2 a 2.5 litros de agua al día, además de líquidos ricos en electrolitos como agua de        " +
                                                  "\n coco o sueros orales para evitar la deshidratación causada por fiebre y sudoración, también se recomienda el consumo    " +
                                                  "\n de infusiones naturales como té de jengibre para aliviar la inflamación. EJERCICIO. La actividad física debe ser        " +
                                                  "\n ligera y adaptada a la condición del paciente, se recomienda caminatas suaves y ejercicios de movilidad para mejorar    " +
                                                  "\n la circulación y reducir la fatiga, además el descanso adecuado es clave para la recuperación, evitando esfuerzos       " +
                                                  "\n excesivos mientras persistan los síntomas. POSIBLE TRATAMIENTO. No existe un fármaco antiviral específico para tratar   " +
                                                  "\n la infección por virus Zika, el tratamiento es sintomático e incluye antiinflamatorios no esteroideos y analgésicos     " +
                                                  "\n como el paracetamol para reducir la fiebre y aliviar el malestar, también se recomienda reposo, ingesta de abundantes   " +
                                                  "\n líquidos y administración de antihistamínicos para controlar el prurito asociado con el exantema, es fundamental seguir " +
                                                  "\n las indicaciones médicas y evitar la automedicación. ALIMENTACIÓN. Se recomienda el consumo de alimentos ricos en       " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico, NARANJA. Rica en vitamina C que ayuda    " +
                                                  "\n a reducir la inflamación y fortalecer el sistema inmune, aporta aproximadamente el 89% de la ingesta diaria recomendada " +
                                                  "\n por cada 100 gramos. JENGIBRE. Contiene compuestos con efectos antiinflamatorios y ayuda a aliviar la fiebre y el       " +
                                                  "\n malestar, su consumo puede aportar hasta el 20% de la ingesta diaria recomendada de antioxidantes. MIEL. Posee          " +
                                                  "\n propiedades antimicrobianas y ayuda a calmar la garganta y reducir la inflamación, aporta cerca del 10% de la ingesta   " +
                                                  "\n diaria recomendada de antioxidantes por cada cucharada. Este es solo un Diagnóstico predeterminado lógico, haberlo      " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas      " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en      " +
                                                  "\n el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo    " +
                                                  "\n se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACIÓN. Es crucial mantener una hidratación adecuada para prevenir la deshidratación causada por la diarrea           " +
                                                  "\n y el vómito, se recomienda el consumo de 2.5 a 3 litros de agua al día, además de soluciones de rehidratación oral         " +
                                                  "\n como Pedialyte para recuperar electrolitos esenciales, también se recomienda el consumo de caldos ligeros y agua           " +
                                                  "\n de coco para reponer minerales perdidos y evitar la deshidratación severa. EJERCICIO. Durante la fase aguda de la          " +
                                                  "\n enfermedad se recomienda reposo absoluto para evitar la deshidratación y el desgaste físico, una vez recuperada la         " +
                                                  "\n paciente puede retomar actividades ligeras como caminatas cortas para mejorar la circulación y fortalecer el sistema       " +
                                                  "\n inmunológico, además ejercicios de movilidad pueden ayudar a recuperar la energía y mejorar la digestión. POSIBLE          " +
                                                  "\n TRATAMIENTO. No existe un tratamiento específico para la infección por rotavirus, el manejo se centra en la prevención     " +
                                                  "\n de la deshidratación mediante el consumo de líquidos y soluciones de rehidratación oral, en casos graves puede requerirse  " +
                                                  "\n la administración de líquidos intravenosos en el hospital, es fundamental seguir las indicaciones médicas y evitar el      " +
                                                  "\n consumo de alimentos irritantes. ALIMENTACIÓN. Se recomienda el consumo de alimentos ricos en fibra y probióticos para     " +
                                                  "\n restaurar la flora intestinal, PLÁTANO. Rico en potasio que ayuda a recuperar los electrolitos perdidos, aporta            " +
                                                  "\n aproximadamente el 10% de la ingesta diaria recomendada por cada 100 gramos. YOGURT NATURAL. Contiene probióticos          " +
                                                  "\n que ayudan a restaurar la flora intestinal, su consumo puede aportar hasta el 20% de la ingesta diaria recomendada         " +
                                                  "\n de probióticos. ZANAHORIA. Rica en vitamina A que ayuda a la regeneración celular intestinal, aporta aproximadamente       " +
                                                  "\n el 56% de la ingesta diaria recomendada por cada 100 gramos. Este es solo un Diagnóstico predeterminado lógico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén   " +
                                                  "\n correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el            " +
                                                  "\n tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo          " +
                                                  "\n se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACIÓN. Es fundamental mantener una hidratación adecuada para ayudar al cuerpo a eliminar la infección      " +
                                                  "\n y reducir la fiebre, se recomienda el consumo de 2 a 2.5 litros de agua al día, además de infusiones sin         " +
                                                  "\n azúcar como té verde o agua de jamaica para mejorar la circulación, también se recomienda el consumo de agua     " +
                                                  "\n con miel y limón para aliviar la irritación y fortalecer el sistema inmunológico. EJERCICIO. Se recomienda       " +
                                                  "\n actividad física moderada como caminatas, natación o yoga para mejorar la circulación y fortalecer el sistema    " +
                                                  "\n inmunológico, además ejercicios de movilidad pueden ayudar a reducir la inflamación y mejorar la recuperación,   " +
                                                  "\n es importante realizar ejercicio de manera constante y bajo supervisión médica. POSIBLE TRATAMIENTO. El          " +
                                                  "\n tratamiento suele incluir antibióticos como la ampicilina o gentamicina, además pueden recetarse medicamentos    " +
                                                  "\n complementarios para aliviar los síntomas, también se recomienda el uso de probióticos para mejorar la flora     " +
                                                  "\n intestinal y reducir el riesgo de reinfección, es fundamental seguir las indicaciones médicas y evitar el        " +
                                                  "\n consumo de alimentos contaminados. ALIMENTACIÓN. Se recomienda el consumo de alimentos ricos en antioxidantes    " +
                                                  "\n y nutrientes esenciales para fortalecer el sistema inmunológico, ARÁNDANOS. Ricos en antioxidantes que ayudan    " +
                                                  "\n a combatir infecciones, aportan aproximadamente el 25% de la ingesta diaria recomendada por cada 100 gramos.     " +
                                                  "\n AJO. Contiene compuestos antimicrobianos que pueden ayudar a combatir la infección, su consumo puede aportar     " +
                                                  "\n hasta el 20% de la ingesta diaria recomendada de antioxidantes. JENGIBRE. Contiene propiedades antiinflamatorias " +
                                                  "\n que pueden ayudar a reducir los síntomas, su consumo puede aportar hasta el 15% de la ingesta diaria recomendada " +
                                                  "\n de antioxidantes. Este es solo un Diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que " +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se     " +
                                                  "\n recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de  " +
                                                  "\n su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho " +
                                                  "\n consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tamaño regular)         " +
                                                  "\n para prevenir la deshidratación causada por la diarrea y ayudar a eliminar toxinas. También es recomendable          " +
                                                  "\n el consumo de soluciones de rehidratación oral para reponer electrolitos perdidos, lo que ayuda a evitar             " +
                                                  "\n complicaciones como la fatiga extrema y el desequilibrio de minerales esenciales. EJERCICIO: Se aconseja evitar      " +
                                                  "\n actividad física intensa mientras persistan los síntomas, ya que el cuerpo necesita conservar energía para           " +
                                                  "\n combatir la infección. Sin embargo, una vez que los síntomas comiencen a mejorar, se recomienda caminatas suaves     " +
                                                  "\n de 15 a 30 minutos diarios para mejorar la circulación, estimular el metabolismo y favorecer la recuperación         " +
                                                  "\n intestinal. POSIBLE TRATAMIENTO: Para la shigelosis en mujeres jóvenes, el tratamiento suele incluir antibióticos    " +
                                                  "\n como la azitromicina o la ciprofloxacina en casos graves. También se recomienda el uso de soluciones de rehidratación" +
                                                  "\n oral y una dieta adecuada para evitar complicaciones. Es fundamental seguir el tratamiento completo para evitar      " +
                                                  "\n recaídas y resistencia bacteriana. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en probióticos,         " +
                                                  "\n vitaminas y minerales esenciales para fortalecer el sistema digestivo y acelerar la recuperación: Yogur natural:     " +
                                                  "\n Rico en probióticos, ayuda a restaurar la flora intestinal y mejorar la digestión. Plátanos: Contienen potasio,      " +
                                                  "\n esencial para reponer electrolitos perdidos y mejorar la función muscular. Arroz y pan tostado: Son fáciles de       " +
                                                  "\n digerir y ayudan a estabilizar el sistema digestivo. Zanahorias: Ricas en vitamina A, esenciales para la regeneración" +
                                                  "\n celular y la recuperación intestinal. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no       " +
                                                  "\n garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas," +
                                                  "\n para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento     " +
                                                  "\n adecuado de su paciente, además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se le       " +
                                                  "\n recomienda mucho consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tamaño regular)            " +
                                                  "\n para mantener las vías respiratorias hidratadas y reducir la viscosidad de las secreciones bronquiales. También         " +
                                                  "\n es recomendable el consumo de infusiones calientes como té de jengibre o manzanilla, que pueden ayudar a aliviar        " +
                                                  "\n la congestión y mejorar la respiración. EJERCICIO: Se aconseja actividad física moderada y adaptada a la capacidad      " +
                                                  "\n pulmonar de la paciente. Se recomienda ejercicios de respiración profunda, caminatas de 30 minutos diarios y yoga       " +
                                                  "\n para mejorar la función pulmonar y fortalecer los músculos respiratorios. Además, el entrenamiento de resistencia       " +
                                                  "\n puede ser beneficioso para mejorar la capacidad aeróbica y reducir la fatiga. POSIBLE TRATAMIENTO: Para la EPOC en      " +
                                                  "\n mujeres jóvenes, el tratamiento suele incluir broncodilatadores como el salbutamol, corticosteroides inhalados como     " +
                                                  "\n la fluticasona y en algunos casos, terapia de oxígeno. También es fundamental evitar el tabaquismo y la exposición a    " +
                                                  "\n contaminantes, ya que estos factores pueden agravar la enfermedad. En algunos casos, se recomienda rehabilitación       " +
                                                  "\n pulmonar para mejorar la calidad de vida y reducir la progresión de los síntomas. ALIMENTACIÓN: Se recomienda el        " +
                                                  "\n consumo de alimentos con propiedades antioxidantes y antiinflamatorias para mejorar la función pulmonar: Pescados       " +
                                                  "\n grasos (salmón, atún): Ricos en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias. Frutas y verduras      " +
                                                  "\n de colores vivos (arándanos, fresas, espinacas, brócoli): Ricas en antioxidantes como la vitamina C y carotenoides,     " +
                                                  "\n que pueden proteger las células del daño. Jengibre: Contiene compuestos con efectos antiinflamatorios que podrían       " +
                                                  "\n ser beneficiosos para las vías respiratorias. Cúrcuma: Con su componente activo, la curcumina, tiene potentes           " +
                                                  "\n propiedades antiinflamatorias y antioxidantes. Este es solo un diagnóstico predeterminado lógico, haberlo consultado    " +
                                                  "\n no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas," +
                                                  "\n para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento        " +
                                                  "\n adecuado de su paciente, además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se le recomienda" +
                                                  "\n mucho consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia. " +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para        " +
                                                  "\n ayudar a eliminar toxinas y mantener la función renal adecuada durante el tratamiento antibiótico. También es            " +
                                                  "\n recomendable el consumo de jugos naturales sin azúcar y caldos ligeros para mejorar la hidratación y fortalecer el       " +
                                                  "\n sistema inmunológico. EJERCICIO: Se aconseja actividad física moderada, evitando esfuerzos excesivos mientras            " +
                                                  "\n persistan los síntomas. Se recomienda caminatas suaves de 30 minutos diarios para mejorar la circulación y el            " +
                                                  "\n bienestar general. Además, ejercicios de bajo impacto como yoga o pilates pueden ayudar a reducir el estrés y mejorar    " +
                                                  "\n la recuperación. POSIBLE TRATAMIENTO: Para la clamidia en mujeres jóvenes, el tratamiento suele incluir antibióticos     " +
                                                  "\n como la azitromicina o la doxiciclina. Es fundamental completar el tratamiento para evitar complicaciones y reinfecciones. " +
                                                  "\n También se recomienda evitar relaciones sexuales hasta que el tratamiento haya finalizado y la infección haya sido       " +
                                                  "\n completamente erradicada. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes        " +
                                                  "\n esenciales para fortalecer el sistema inmunológico y ayudar a la recuperación: Ajo: Contiene alicina, un compuesto       " +
                                                  "\n con propiedades antimicrobianas que puede ayudar a combatir infecciones. Frutas cítricas (naranjas, limones, toronjas):  " +
                                                  "\n Ricas en vitamina C, esenciales para mejorar la respuesta inmune. Jengibre: Posee propiedades antiinflamatorias y        " +
                                                  "\n antioxidantes que pueden aliviar la inflamación y mejorar la circulación. Yogur natural: Rico en probióticos, ayuda      " +
                                                  "\n a restaurar la flora intestinal y fortalecer el sistema inmunológico. Este es solo un diagnóstico predeterminado lógico, " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que por ello la enfermedad y sus          " +
                                                  "\n respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor         " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente, además, por su salud, si la respuesta del diagnóstico no le         " +
                                                  "\n satisface del todo, se le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida)   " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2.5 a 3 litros de agua al día, ya que una hidratación adecuada ayuda          " +
                                                  "\n a mantener el equilibrio del sistema nervioso y reducir la inflamación de las meninges. También es beneficioso         " +
                                                  "\n complementar con infusiones naturales como té de manzanilla o jengibre, que poseen propiedades antiinflamatorias       " +
                                                  "\n y relajantes. EJERCICIO. La actividad física moderada es clave para fortalecer el sistema inmunológico y mejorar       " +
                                                  "\n la circulación sanguínea. Se recomienda realizar ejercicio aeróbico moderado al menos 30 minutos al día, como          " +
                                                  "\n caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo. También es beneficioso incluir ejercicios de           " +
                                                  "\n respiración como yoga o técnicas de expansión pulmonar para mejorar la oxigenación cerebral. POSIBLE TRATAMIENTO.      " +
                                                  "\n El tratamiento estándar incluye antibióticos como ceftriaxona, vancomicina y ampicilina, que ayudan a eliminar la      " +
                                                  "\n bacteria causante de la meningitis. En casos graves, se puede requerir hospitalización para administración intravenosa " +
                                                  "\n de antibióticos y monitoreo de síntomas. Marcas reconocidas incluyen Rocephin, Vancocin y Principen, las cuales han    " +
                                                  "\n demostrado eficacia en el manejo de la enfermedad. También es importante el uso de antiinflamatorios y analgésicos     " +
                                                  "\n para reducir el dolor y la fiebre. ALIMENTACIÓN. Para fortalecer el sistema inmunológico y reducir la inflamación,     " +
                                                  "\n se recomienda consumir frutas cítricas como naranja, limón y toronja, que son ricas en vitamina C, la cual contribuye  " +
                                                  "\n a la producción de glóbulos blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento   " +
                                                  "\n diario por cada 100 gramos. Verduras crucíferas como brócoli y coliflor, que contienen vitamina K y antioxidantes,     " +
                                                  "\n esenciales para la regeneración celular y la protección del sistema nervioso. Pescados grasos como salmón y sardina,   " +
                                                  "\n que son ricos en Omega-3, el cual tiene propiedades antiinflamatorias y aporta alrededor del 50% del requerimiento     " +
                                                  "\n diario por porción de 100 gramos. Legumbres como lentejas y garbanzos, que son fuente de proteínas y hierro, esenciales   " +
                                                  "\n para la energía y la regeneración celular, aportando cerca del 40% del requerimiento diario por cada 100 gramos. Este es  " +
                                                  "\n solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad  " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar   " +
                                                  "\n a un médico especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2.5 a 3 litros de agua al día, ya que una hidratación adecuada ayuda         " +
                                                  "\n a mantener el equilibrio celular y mejorar la eliminación de toxinas. También es beneficioso complementar con         " +
                                                  "\n infusiones naturales como té verde o cúrcuma, que poseen propiedades antioxidantes y anticancerígenas. EJERCICIO.     " +
                                                  "\n La actividad física moderada es clave para fortalecer el sistema inmunológico y mejorar la salud cardiovascular.      " +
                                                  "\n Se recomienda realizar ejercicio aeróbico moderado al menos 30 minutos al día, como caminar, nadar o andar en         " +
                                                  "\n bicicleta, evitando el sobreesfuerzo. También es beneficioso incluir ejercicios de resistencia como levantamiento     " +
                                                  "\n de pesas ligeras o yoga, que ayudan a mantener la masa muscular y reducir el estrés. POSIBLE TRATAMIENTO. El          " +
                                                  "\n tratamiento estándar incluye quimioterapia, radioterapia y terapia dirigida, dependiendo del tipo y estadio del       " +
                                                  "\n cáncer. En algunos casos, se puede recurrir a inmunoterapia, que ayuda al sistema inmunológico a combatir las células " +
                                                  "\n cancerosas. Marcas reconocidas incluyen Herceptin, Avastin, Keytruda y Opdivo, las cuales han demostrado eficacia en  " +
                                                  "\n el manejo de la enfermedad. También es importante el uso de suplementos nutricionales para mantener la energía y      " +
                                                  "\n reducir los efectos secundarios del tratamiento. ALIMENTACIÓN. Para fortalecer el sistema inmunológico y reducir la   " +
                                                  "\n inflamación, se recomienda consumir frutas cítricas como naranja, limón y toronja, que son ricas en vitamina C, la    " +
                                                  "\n cual contribuye a la producción de glóbulos blancos y mejora la respuesta inmune, aportando aproximadamente el 90% del" +
                                                  "\n requerimiento diario por cada 100 gramos. Verduras de hoja verde como espinaca y kale, que contienen ácido fólico y   " +
                                                  "\n antioxidantes, esenciales para la regeneración celular y la protección contra el daño oxidativo. Pescados grasos como " +
                                                  "\n salmón y atún, que son ricos en Omega-3, el cual tiene propiedades antiinflamatorias y aporta alrededor del 50% del   " +
                                                  "\n requerimiento diario por porción de 100 gramos. Frutos secos como almendras y nueces, que aportan vitamina E, la cual " +
                                                  "\n protege las células del daño oxidativo y contribuye con el 70% del requerimiento diario por cada 30 gramos. Legumbres    " +
                                                  "\n como lentejas y garbanzos, que son fuente de proteínas y hierro, esenciales para la energía y la regeneración celular,   " +
                                                  "\n aportando cerca del 40% del requerimiento diario por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico. " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente   " +
                                                  "\n correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico especialista. Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.30-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para mantener    " +
                                                  "\n una hidratación adecuada. Esto ayuda a reducir la congestión, mantener la mucosa respiratoria hidratada y favorecer la        " +
                                                  "\n eliminación de toxinas. También es recomendable el consumo de infusiones calientes como té de jengibre o manzanilla para      " +
                                                  "\n aliviar la irritación de garganta y mejorar la recuperación. EJERCICIO: Se aconseja actividad física moderada diariamente,    " +
                                                  "\n evitando esfuerzos excesivos mientras persistan los síntomas. Se recomienda al menos 30 minutos de ejercicio ligero, como     " +
                                                  "\n caminatas o estiramientos, lo cual ayuda a mejorar la circulación, fortalecer el sistema inmune y promover una recuperación   " +
                                                  "\n más efectiva. POSIBLE TRATAMIENTO: Para la gripe en mujeres jóvenes, el tratamiento suele incluir medicamentos para reducir   " +
                                                  "\n la fiebre y aliviar los síntomas, como el paracetamol (Tempra) o el ibuprofeno. También pueden utilizarse antivirales         " +
                                                  "\n específicos contra la gripe, como el oseltamivir (Tamiflu), en casos más severos o bajo indicación médica. ALIMENTACIÓN:      " +
                                                  "\n Se recomienda el consumo de alimentos ricos en vitaminas, minerales y antioxidantes para fortalecer el sistema inmunológico   " +
                                                  "\n y combatir los síntomas de la gripe: Naranjas y mandarinas: Ricas en vitamina C (hasta un 89% del requerimiento diario por    " +
                                                  "\n cada 100g), esenciales para reducir la duración de los síntomas y mejorar la respuesta inmune. Fresas y arándanos: Contienen  " +
                                                  "\n antioxidantes y vitamina C (hasta un 65% del requerimiento diario en 100g de fresas) que protegen las células del daño        " +
                                                  "\n causado por la infección. Jengibre: Posee propiedades antiinflamatorias y antioxidantes que pueden aliviar la congestión      " +
                                                  "\n y el malestar general. Espinacas y brócoli: Ricos en vitamina A (hasta un 56% del requerimiento diario en 100g de espinaca)   " +
                                                  "\n y vitamina C (hasta un 107% del requerimiento diario en 100g de brócoli), esenciales para fortalecer el sistema inmunológico  " +
                                                  "\n y acelerar la recuperación. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que    " +
                                                  "\n la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda       " +
                                                  "\n hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además,     " +
                                                  "\n por su salud, si la respuesta del diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico.         " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tamaño regular) para      " +
                                                  "\n mantener una hidratación adecuada. Esto ayuda a fluidificar las secreciones pulmonares, facilitando su expulsión y     " +
                                                  "\n reduciendo la congestión respiratoria. También es recomendable el consumo de caldos y sopas calientes para mejorar     " +
                                                  "\n la hidratación y aliviar la irritación de garganta. EJERCICIO: Se aconseja actividad física ligera y progresiva,       " +
                                                  "\n evitando esfuerzos intensos mientras persistan los síntomas. Se recomienda caminatas suaves de 15 a 30 minutos         " +
                                                  "\n diarios para mejorar la oxigenación y la recuperación pulmonar. POSIBLE TRATAMIENTO: Para la neumonía en mujeres       " +
                                                  "\n jóvenes, el tratamiento suele incluir antibióticos en caso de infección bacteriana, como la amoxicilina (Amoxil)       " +
                                                  "\n o la azitromicina. También pueden utilizarse medicamentos para reducir la fiebre y aliviar los síntomas, como el       " +
                                                  "\n paracetamol o el ibuprofeno. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en vitaminas y minerales        " +
                                                  "\n esenciales para fortalecer el sistema inmunológico y mejorar la función pulmonar: Naranjas y mandarinas: Ricas en      " +
                                                  "\n vitamina C (hasta un 89% del requerimiento diario por cada 100g), esenciales para mejorar la respuesta inmune.         " +
                                                  "\n Jengibre: Posee propiedades antiinflamatorias y antioxidantes que pueden aliviar la congestión. Espinacas y brócoli:   " +
                                                  "\n Ricos en vitamina A (hasta un 56% del requerimiento diario en 100g de espinaca) y vitamina C (hasta un 107% del        " +
                                                  "\n requerimiento diario en 100g de brócoli), esenciales para fortalecer el sistema inmunológico y acelerar la recuperación.  " +
                                                  "\n Ajo: Contiene alicina, un compuesto con propiedades antimicrobianas que puede ayudar a combatir infecciones respiratorias. " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga     " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más      " +
                                                  "\n de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además,      " +
                                                  "\n por su salud, si la respuesta del diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico." +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular) para     " +
                                                  "\n mantener una hidratación adecuada y ayudar a regular los niveles de glucosa en sangre. También es recomendable el     " +
                                                  "\n consumo de infusiones sin azúcar como té verde o manzanilla para mejorar la digestión y el metabolismo. EJERCICIO:    " +
                                                  "\n Se aconseja actividad física regular, como caminatas de 30 a 60 minutos diarios, ejercicios de resistencia o yoga,    " +
                                                  "\n lo cual ayuda a mejorar la sensibilidad a la insulina y controlar los niveles de azúcar en sangre. POSIBLE            " +
                                                  "\n TRATAMIENTO: Para la diabetes en mujeres jóvenes, el tratamiento suele incluir medicamentos para controlar la glucosa," +
                                                  "\n como la metformina (Glucophage) o insulina en casos específicos. También se recomienda el monitoreo constante de los  " +
                                                  "\n niveles de glucosa y una dieta equilibrada. ALIMENTACIÓN: Se recomienda el consumo de alimentos con bajo índice       " +
                                                  "\n glucémico y ricos en nutrientes esenciales para el control de la diabetes: Aguacate: Rico en grasas saludables y      " +
                                                  "\n fibra, ayuda a estabilizar los niveles de glucosa. Frutos rojos (arándanos, fresas): Contienen antioxidantes y        " +
                                                  "\n vitamina C (hasta un 65% del requerimiento diario en 100g de fresas), que pueden mejorar la sensibilidad a la insulina." +
                                                  "\n Espinacas y brócoli: Ricos en magnesio (hasta un 20% del requerimiento diario en 100g de espinaca), esencial para la   " +
                                                  "\n regulación de la glucosa. Canela: Contiene compuestos que pueden mejorar la sensibilidad a la insulina y reducir los   " +
                                                  "\n niveles de azúcar en sangre. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%" +
                                                  "\n que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se       " +
                                                  "\n recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su     " +
                                                  "\n paciente, además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se le recomienda mucho       " +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada y controlada, evitando factores desencadenantes como el aire frío,       " +
                                                  "\n la contaminación y los alérgenos. Ejercicios como natación, yoga y caminatas suaves pueden mejorar la capacidad pulmonar    " +
                                                  "\n y reducir la inflamación bronquial. También se recomienda el uso de técnicas de respiración profunda para fortalecer los    " +
                                                  "\n pulmones y mejorar la oxigenación. HIDRATACIÓN: Es fundamental el consumo de 2.5 a 3 litros de agua, aproximadamente 10 a   " +
                                                  "\n 12 vasos de tamaño regular, para mantener las vías respiratorias hidratadas y facilitar la eliminación de secreciones.      " +
                                                  "\n También se recomienda el consumo de líquidos tibios como infusiones de jengibre o miel para aliviar la irritación de la     " +
                                                  "\n garganta y mejorar la expectoración. POSIBLE TRATAMIENTO: El asma se trata con broncodilatadores de alivio rápido como      " +
                                                  "\n salbutamol, corticosteroides inhalados como fluticasona y modificadores de leucotrienos como montelukast. Algunas marcas    " +
                                                  "\n reconocidas son Ventolin (salbutamol), Flixotide (fluticasona) y Singulair (montelukast). También se recomienda el          " +
                                                  "\n seguimiento de un plan de acción para el asma indicado por el médico y el uso regular de medicamentos preventivos.          " +
                                                  "\n ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema inmunológico y mejorar la función pulmonar, se recomienda el           " +
                                                  "\n consumo de alimentos ricos en vitaminas y minerales esenciales. PESCADOS GRASOS (salmón, atún): Fuente de OMEGA-3,          " +
                                                  "\n con propiedades antiinflamatorias, proporcionando aproximadamente 2.2 gramos por cada 100 gramos de pescado. FRUTAS         " +
                                                  "\n CÍTRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema inmune, aportando aproximadamente     " +
                                                  "\n 89% del requerimiento diario por cada 100 gramos. JENGIBRE: Contiene compuestos con efectos antiinflamatorios que pueden    " +
                                                  "\n ayudar a aliviar la irritación de las vías respiratorias, proporcionando 5% del requerimiento diario de antioxidantes por   " +
                                                  "\n cada 10 gramos. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que la paciente  " +
                                                  "\n tenga asma ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico para mayor seguridad y, por  " +
                                                  "\n su salud, consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada para fortalecer el sistema inmunológico y mejorar la calidad de vida.   " +
                                                  "\n Ejercicios como caminatas, yoga y entrenamiento de resistencia pueden ayudar a mantener la masa muscular y reducir la      " +
                                                  "\n fatiga. También se recomienda ejercicios de relajación para reducir el estrés y mejorar el bienestar emocional.            " +
                                                  "\n HIDRATACIÓN: Es esencial el consumo de 2.5 a 3 litros de agua, aproximadamente 10 a 12 vasos de tamaño regular, para       " +
                                                  "\n facilitar la eliminación de toxinas y mejorar la función celular. Mantener una hidratación adecuada también contribuye     " +
                                                  "\n a la absorción de nutrientes esenciales y al fortalecimiento del sistema inmunológico. POSIBLE TRATAMIENTO: El VIH/SIDA    " +
                                                  "\n se trata con terapia antirretroviral (TAR), que incluye medicamentos como tenofovir, emtricitabina y dolutegravir.         " +
                                                  "\n Algunas marcas reconocidas son Truvada (tenofovir/emtricitabina) y Tivicay (dolutegravir). Es fundamental seguir el        " +
                                                  "\n tratamiento de manera estricta para evitar la progresión de la enfermedad y mejorar la calidad de vida. ALIMENTACIÓN       " +
                                                  "\n RECOMENDADA: Para fortalecer el sistema inmunológico y mejorar la recuperación, se recomienda el consumo de alimentos      " +
                                                  "\n ricos en vitaminas y minerales esenciales. FRUTAS CÍTRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que         " +
                                                  "\n fortalece el sistema inmune, aportando aproximadamente 89% del requerimiento diario por cada 100 gramos. PESCADOS          " +
                                                  "\n GRASOS (salmón, atún): Fuente de OMEGA-3, con propiedades antiinflamatorias, proporcionando aproximadamente 2.2 gramos     " +
                                                  "\n por cada 100 gramos de pescado. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales      " +
                                                  "\n para la regeneración celular y la función muscular, aportando cerca del 15% del requerimiento diario por cada 100 gramos.  " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que la paciente tenga VIH/SIDA  " +
                                                  "\n ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico para mayor seguridad y, por su salud,  " +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada para mejorar la circulación y fortalecer el sistema inmunológico.   " +
                                                  "\n Ejercicios como caminatas, natación y estiramientos pueden ser beneficiosos para la recuperación. También se           " +
                                                  "\n recomienda ejercicios de resistencia moderada para mejorar la función muscular y reducir la fatiga. HIDRATACIÓN:       " +
                                                  "\n Es esencial el consumo de 2.5 a 3 litros de agua, aproximadamente 10 a 12 vasos de tamaño regular, para facilitar      " +
                                                  "\n la eliminación de toxinas y mejorar la función celular. Mantener una hidratación adecuada también contribuye a la      " +
                                                  "\n regeneración de tejidos y ayuda a reducir la inflamación. POSIBLE TRATAMIENTO: La gonorrea se trata con antibióticos   " +
                                                  "\n como ceftriaxona y azitromicina. Algunas marcas reconocidas son Rocephin (ceftriaxona) y Zithromax (azitromicina).     " +
                                                  "\n Es fundamental seguir el tratamiento indicado por el médico y realizar pruebas de seguimiento para asegurar la         " +
                                                  "\n eliminación de la infección. ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema inmunológico y mejorar la            " +
                                                  "\n recuperación, se recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales. FRUTAS CÍTRICAS         " +
                                                  "\n (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema inmune, aportando aproximadamente 89%     " +
                                                  "\n del requerimiento diario por cada 100 gramos. PESCADOS GRASOS (salmón, atún): Fuente de OMEGA-3, con propiedades       " +
                                                  "\n antiinflamatorias, proporcionando aproximadamente 2.2 gramos por cada 100 gramos de pescado. VEGETALES DE HOJA VERDE   " +
                                                  "\n (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales para la regeneración celular y la función muscular,      " +
                                                  "\n aportando cerca del 15% del requerimiento diario por cada 100 gramos. Este es solo un diagnóstico predeterminado       " +
                                                  "\n lógico. Haberlo consultado no garantiza al 100% que la paciente tenga gonorrea ni que el tratamiento sea el adecuado.  " +
                                                  "\n Se recomienda realizar más de un diagnóstico para mayor seguridad y, por su salud, consultar a su médico. Angel L      " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al día (aproximadamente ocho         " +
                                                  "\n a diez vasos de agua de tamaño regular) para mantener la hidratación celular y ayudar al cuerpo a combatir el virus.     " +
                                                  "\n También se recomienda el consumo de líquidos ricos en antioxidantes como té verde o infusiones de manzanilla para        " +
                                                  "\n mejorar la respuesta inmunológica. EJERCICIO: Se recomienda actividad física moderada, evitando el sobreesfuerzo         " +
                                                  "\n durante los brotes. Ejercicios como yoga, pilates y caminatas suaves pueden ayudar a reducir el estrés, que es un        " +
                                                  "\n factor desencadenante de los brotes de herpes. POSIBLE TRATAMIENTO: El tratamiento para el herpes genital suele          " +
                                                  "\n incluir antivirales como aciclovir, valaciclovir o famciclovir, que ayudan a reducir la duración y severidad de          " +
                                                  "\n los brotes. Marcas reconocidas incluyen Zovirax y Valtrex. También se recomienda el uso de cremas tópicas para           " +
                                                  "\n aliviar el dolor y la inflamación, así como el fortalecimiento del sistema inmunológico mediante una dieta equilibrada   " +
                                                  "\n y el manejo del estrés. ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema inmunológico y ayudar en la recuperación,   " +
                                                  "\n se recomienda el consumo de FRUTAS CÍTRICAS como naranja y toronja, ricas en VITAMINA C, que fortalece el sistema        " +
                                                  "\n inmune y aporta cerca del 89% del requerimiento diario por cada 100 g. ARÁNDANOS, ricos en ANTIOXIDANTES, que ayudan     " +
                                                  "\n a reducir la inflamación y aportan aproximadamente el 50% del requerimiento diario de VITAMINA C por cada 100 g. AJO,    " +
                                                  "\n con propiedades ANTIVIRALES, que pueden ayudar a combatir el virus y fortalecer el sistema inmunológico. ESPINACA,       " +
                                                  "\n fuente de HIERRO y VITAMINA E, que ayuda a mejorar la regeneración celular y aporta aproximadamente el 15% del           " +
                                                  "\n requerimiento diario de HIERRO por cada 100 g. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado     " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se        " +
                                                  "\n recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si      " +
                                                  "\n la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece      " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2 a 2.5 litros de agua al día (aproximadamente ocho       " +
                                                  "\n a diez vasos de agua de tamaño regular) para ayudar al cuerpo a eliminar la bacteria y prevenir la deshidratación      " +
                                                  "\n causada por fiebre y malestar. También se recomienda el consumo de líquidos ricos en electrolitos como agua de coco    " +
                                                  "\n o caldos naturales para mejorar la recuperación. EJERCICIO: Se recomienda reposo moderado mientras persistan los       " +
                                                  "\n síntomas, evitando esfuerzos físicos intensos. Sin embargo, una vez recuperada, se pueden realizar ejercicios de       " +
                                                  "\n bajo impacto como yoga o estiramientos suaves para mejorar la circulación y fortalecer el sistema inmunológico.        " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento para la sífilis suele incluir antibióticos como la penicilina G benzatina, que     " +
                                                  "\n es el tratamiento de primera línea. Marcas reconocidas incluyen Benzetacil. En casos de alergia a la penicilina, se    " +
                                                  "\n pueden utilizar alternativas como doxiciclina o azitromicina. Es fundamental completar el tratamiento indicado por el  " +
                                                  "\n médico para evitar complicaciones y recurrencias. ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema inmunológico    " +
                                                  "\n y ayudar en la recuperación, se recomienda el consumo de YOGUR NATURAL, rico en PROBIÓTICOS, que favorecen la          " +
                                                  "\n recuperación intestinal y aportan aproximadamente 10^9 UFC por cada 100 g. AJO, con propiedades ANTIBACTERIANAS,       " +
                                                  "\n que pueden ayudar a combatir la infección y aporta compuestos bioactivos como alicina. ESPINACA, fuente de VITAMINA C  " +
                                                  "\n y HIERRO, que fortalece el sistema inmune y aporta cerca del 15% del requerimiento diario de HIERRO por cada 100 g.    " +
                                                  "\n FRUTOS ROJOS, ricos en ANTIOXIDANTES, que ayudan a reducir la inflamación y aportan aproximadamente el 50% del         " +
                                                  "\n requerimiento diario de VITAMINA C por cada 100 g. Este es solo un diagnóstico predeterminado lógico. Haberlo          " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente         " +
                                                  "\n correctas. Se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además,       " +
                                                  "\n por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.           " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACIÓN: Es fundamental que la paciente consuma al menos 2.5 a 3 litros de agua al día (aproximadamente diez          " +
                                                  "\n a doce vasos de agua de tamaño regular) para mantener la hidratación de las vías respiratorias y ayudar al cuerpo         " +
                                                  "\n a eliminar la bacteria. También se recomienda el consumo de líquidos tibios como té de jengibre o caldos naturales        " +
                                                  "\n para mejorar la función pulmonar. EJERCICIO: Se recomienda reposo absoluto mientras persistan los síntomas, evitando      " +
                                                  "\n cualquier actividad física intensa. Una vez recuperada, se pueden realizar ejercicios de respiración y fortalecimiento    " +
                                                  "\n pulmonar para mejorar la capacidad respiratoria y reducir la fatiga. También es recomendable evitar ambientes con humo    " +
                                                  "\n o contaminación que puedan agravar los síntomas. POSIBLE TRATAMIENTO: El tratamiento para la tuberculosis suele incluir   " +
                                                  "\n una combinación de antibióticos como isoniazida, rifampicina, etambutol y pirazinamida, administrados durante un período  " +
                                                  "\n de seis meses o más. Estos medicamentos están disponibles en el sistema de salud pública. Es fundamental seguir el        " +
                                                  "\n tratamiento de manera estricta para evitar la resistencia bacteriana y garantizar la recuperación completa. ALIMENTACIÓN  " +
                                                  "\n RECOMENDADA: Para fortalecer el sistema respiratorio y reducir la inflamación, se recomienda el consumo de FRUTAS CÍTRICAS" +
                                                  "\n como naranja y toronja, ricas en VITAMINA C, que fortalece el sistema inmune y aporta cerca del 89% del requerimiento     " +
                                                  "\n diario por cada 100 g. PESCADOS GRASOS como salmón y atún, ricos en ÁCIDOS GRASOS OMEGA-3, que poseen propiedades         " +
                                                  "\n antiinflamatorias y aportan aproximadamente el 50% del requerimiento diario por cada 100 g. ESPINACA, fuente de HIERRO    " +
                                                  "\n y ANTIOXIDANTES, que ayudan a mejorar la oxigenación celular y aportan aproximadamente el 15% del requerimiento diario    " +
                                                  "\n de HIERRO por cada 100 g. JENGIBRE, con propiedades ANTIINFLAMATORIAS y antioxidantes, que pueden aliviar síntomas        " +
                                                  "\n respiratorios y mejorar la función pulmonar. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado        " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Se         " +
                                                  "\n recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. Además, por su salud, si       " +
                                                  "\n la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece       " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACIÓN. Es fundamental mantener una hidratación adecuada para reducir la inflamación y mejorar la movilidad     " +
                                                  "\n articular, se recomienda el consumo de 2 a 2.5 litros de agua al día, además de infusiones naturales como té de      " +
                                                  "\n cúrcuma o jengibre para sus propiedades antiinflamatorias, también se recomienda el consumo de agua con limón        " +
                                                  "\n para aportar vitamina C y fortalecer el sistema inmunológico. EJERCICIO. Se recomienda actividad física moderada     " +
                                                  "\n como ejercicios de bajo impacto, natación, yoga o pilates para mejorar la movilidad y reducir la rigidez articular,  " +
                                                  "\n además ejercicios de fortalecimiento muscular pueden ayudar a proteger las articulaciones y mejorar la calidad de    " +
                                                  "\n vida, es importante realizarlo bajo supervisión médica y ajustar la intensidad según la tolerancia del paciente.     " +
                                                  "\n POSIBLE TRATAMIENTO. El tratamiento suele incluir antiinflamatorios no esteroideos como el ibuprofeno (Advil) y      " +
                                                  "\n corticosteroides en casos más severos, además pueden recetarse medicamentos modificadores de la enfermedad como      " +
                                                  "\n el metotrexato o la sulfasalazina, también se recomienda la fisioterapia para mejorar la movilidad y reducir el      " +
                                                  "\n dolor, es fundamental seguir las indicaciones médicas y evitar la automedicación. ALIMENTACIÓN. Se recomienda el     " +
                                                  "\n consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer las articulaciones, CÚRCUMA.     " +
                                                  "\n Contiene curcumina con propiedades antiinflamatorias y antioxidantes, su consumo puede aportar hasta el 20% de la    " +
                                                  "\n ingesta diaria recomendada de antioxidantes. PESCADO GRASO (SALMÓN, ATÚN). Rico en Omega-3 que puede ayudar a        " +
                                                  "\n reducir la inflamación articular, aporta aproximadamente el 50% de la ingesta diaria recomendada de Omega-3 por      " +
                                                  "\n cada 100 gramos. ESPINACA. Rica en vitamina K que ayuda a fortalecer los huesos y reducir la inflamación, aporta     " +
                                                  "\n aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos. Este es solo un Diagnóstico predeterminado " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad   " +
                                                  "\n y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer    " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no   " +
                                                  "\n le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app      " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACIÓN. Es crucial mantener una hidratación adecuada para aliviar la irritación de las vías respiratorias y       " +
                                                  "\n reducir la tos, se recomienda el consumo de 2.5 a 3 litros de agua al día, además de infusiones calientes como té      " +
                                                  "\n de tomillo o miel con limón para calmar la garganta y reducir la inflamación, también se recomienda el consumo de      " +
                                                  "\n agua con jengibre para sus propiedades antimicrobianas. EJERCICIO. Se recomienda actividad física ligera como          " +
                                                  "\n ejercicios de respiración profunda y expansión pulmonar para mejorar la oxigenación y reducir la fatiga, además        " +
                                                  "\n caminatas cortas pueden ayudar a fortalecer el sistema inmunológico, es importante evitar esfuerzos excesivos          " +
                                                  "\n mientras persistan los síntomas y realizar el ejercicio bajo supervisión médica. POSIBLE TRATAMIENTO. El tratamiento   " +
                                                  "\n suele incluir antibióticos como la azitromicina o eritromicina para eliminar la bacteria causante de la enfermedad,    " +
                                                  "\n además pueden recetarse broncodilatadores para mejorar la función pulmonar y reducir la tos, también se recomienda     " +
                                                  "\n la vacunación para prevenir futuros contagios, es fundamental seguir las indicaciones médicas y evitar la automedicación. " +
                                                  "\n ALIMENTACIÓN. Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer      " +
                                                  "\n el sistema respiratorio, TOMILLO. Contiene compuestos con propiedades antimicrobianas y ayuda a aliviar la inflamación  " +
                                                  "\n pulmonar, su consumo puede aportar hasta el 15% de la ingesta diaria recomendada de antioxidantes. JENGIBRE. Contiene   " +
                                                  "\n propiedades antiinflamatorias que pueden ayudar a reducir los síntomas, su consumo puede aportar hasta el 20% de la     " +
                                                  "\n ingesta diaria recomendada de antioxidantes. MIEL. Posee propiedades antimicrobianas y ayuda a calmar la garganta,      " +
                                                  "\n aporta cerca del 10% de la ingesta diaria recomendada de antioxidantes por cada cucharada. Este es solo un Diagnóstico  " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la   " +
                                                  "\n enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para        " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app  " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACIÓN. Es fundamental mantener una hidratación adecuada para reducir la fiebre y aliviar la inflamación de las    " +
                                                  "\n glándulas salivales, se recomienda el consumo de 2 a 2.5 litros de agua al día, además de infusiones sin azúcar como    " +
                                                  "\n té verde o agua de coco para mejorar la circulación, también se recomienda el consumo de agua con miel y limón para     " +
                                                  "\n aliviar la irritación y fortalecer el sistema inmunológico. EJERCICIO. Se recomienda actividad física moderada como     " +
                                                  "\n caminatas, natación o yoga para mejorar la circulación y fortalecer el sistema inmunológico, además ejercicios de       " +
                                                  "\n movilidad pueden ayudar a reducir la inflamación y mejorar la recuperación, es importante realizar ejercicio de manera  " +
                                                  "\n constante y bajo supervisión médica. POSIBLE TRATAMIENTO. No existe un tratamiento específico para las paperas, el      " +
                                                  "\n manejo se centra en aliviar los síntomas mediante el consumo de analgésicos como el paracetamol o ibuprofeno para       " +
                                                  "\n reducir la fiebre y el dolor, además se recomienda reposo, ingesta de abundantes líquidos y alimentación de consistencia" +
                                                  "\n blanda para facilitar la recuperación, es fundamental seguir las indicaciones médicas y evitar la automedicación.       " +
                                                  "\n ALIMENTACIÓN. Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer      " +
                                                  "\n el sistema inmunológico, ARÁNDANOS. Ricos en antioxidantes que ayudan a combatir infecciones, aportan aproximadamente   " +
                                                  "\n el 25% de la ingesta diaria recomendada por cada 100 gramos. AJO. Contiene compuestos antimicrobianos que pueden ayudar " +
                                                  "\n a combatir la infección, su consumo puede aportar hasta el 20% de la ingesta diaria recomendada de antioxidantes.       " +
                                                  "\n JENGIBRE. Contiene propiedades antiinflamatorias que pueden ayudar a reducir los síntomas, su consumo puede aportar     " +
                                                  "\n hasta el 15% de la ingesta diaria recomendada de antioxidantes. Este es solo un Diagnóstico predeterminado lógico,      " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el    " +
                                                  "\n tratamiento adecuado de su paciente, además por su salud si la respuesta del Diagnóstico no le satisface del todo se le  " +
                                                  "\n recomienda mucho consultar a su médico, Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2.5 a 3 litros de agua al día, ya que una hidratación adecuada ayuda a reducir     " +
                                                  "\n la fiebre y prevenir la deshidratación causada por la enfermedad. También es beneficioso complementar con infusiones        " +
                                                  "\n naturales como té de manzanilla o jengibre, que poseen propiedades antiinflamatorias y relajantes. EJERCICIO. La actividad  " +
                                                  "\n física moderada es clave para fortalecer el sistema inmunológico y mejorar la circulación sanguínea. Se recomienda realizar " +
                                                  "\n ejercicio aeróbico moderado al menos 30 minutos al día, como caminar, nadar o andar en bicicleta, evitando el sobreesfuerzo." +
                                                  "\n También es beneficioso incluir ejercicios de respiración como yoga o técnicas de expansión pulmonar para mejorar la         " +
                                                  "\n oxigenación celular. POSIBLE TRATAMIENTO. No existe un tratamiento antiviral específico para el Zika, por lo que el         " +
                                                  "\n manejo es sintomático. Se recomienda el uso de antiinflamatorios no esteroideos como paracetamol para reducir la fiebre     " +
                                                  "\n y el dolor muscular. También se pueden administrar antihistamínicos para controlar el prurito asociado con el exantema.     " +
                                                  "\n ALIMENTACIÓN. Para fortalecer el sistema inmunológico y reducir la inflamación, se recomienda consumir frutas cítricas      " +
                                                  "\n como naranja, limón y toronja, que son ricas en vitamina C, la cual contribuye a la producción de glóbulos blancos y        " +
                                                  "\n mejora la respuesta inmune, aportando aproximadamente el 90% del requerimiento diario por cada 100 gramos. Verduras de      " +
                                                  "\n hoja verde como espinaca y acelga, que contienen ácido fólico, esencial para la producción de células sanguíneas. Pescados  " +
                                                  "\n grasos como salmón y sardina, que son ricos en Omega-3, el cual tiene propiedades antiinflamatorias. Frutos secos como      " +
                                                  "\n almendras y nueces, que aportan vitamina E, la cual protege las células del daño oxidativo. Legumbres como lentejas y       " +
                                                  "\n garbanzos, que son fuente de proteínas y hierro, esenciales para la energía y la regeneración celular. Este es solo un      " +
                                                  "\n diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que     " +
                                                  "\n las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico" +
                                                  "\n especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 3 a 3.5 litros de agua al día, ya que la hidratación adecuada es fundamental    " +
                                                  "\n para prevenir la deshidratación causada por la diarrea y el vómito. También es beneficioso complementar con soluciones   " +
                                                  "\n de rehidratación oral como Pedialyte, que ayudan a reponer los electrolitos perdidos. EJERCICIO. Durante la enfermedad,  " +
                                                  "\n se recomienda evitar el ejercicio intenso y priorizar el descanso. Sin embargo, una vez recuperado, se puede retomar la  " +
                                                  "\n actividad física moderada para fortalecer el sistema inmunológico. POSIBLE TRATAMIENTO. No existe un tratamiento         " +
                                                  "\n antiviral específico para el rotavirus, por lo que el manejo es sintomático. Se recomienda el uso de líquidos de         " +
                                                  "\n rehidratación oral, así como una dieta blanda para reducir la irritación intestinal. En casos graves, puede ser          " +
                                                  "\n necesaria la administración de líquidos intravenosos en un hospital. ALIMENTACIÓN. Para fortalecer el sistema inmunológico " +
                                                  "\n y reducir la inflamación, se recomienda consumir plátanos, que son ricos en potasio, esencial para la recuperación       " +
                                                  "\n de electrolitos. Arroz y pan integral, que ayudan a estabilizar el sistema digestivo. Yogur natural, que contiene        " +
                                                  "\n probióticos, beneficiosos para la recuperación de la flora intestinal. Frutas cítricas como naranja y toronja, que       " +
                                                  "\n aportan vitamina C para fortalecer el sistema inmunológico. Verduras de hoja verde como espinaca y acelga, que contienen " +
                                                  "\n ácido fólico, esencial para la producción de células sanguíneas. Este es solo un diagnóstico predeterminado lógico.      " +
                                                  "\n Haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente   " +
                                                  "\n correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico especialista. Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACIÓN. Se recomienda el consumo de 2.5 a 3 litros de agua al día, ya que una hidratación adecuada ayuda     " +
                                                  "\n a eliminar toxinas y mejorar la circulación sanguínea. También es beneficioso complementar con infusiones         " +
                                                  "\n naturales como té de manzanilla o jengibre, que poseen propiedades antibacterianas y relajantes. EJERCICIO.       " +
                                                  "\n La actividad física moderada es clave para fortalecer el sistema inmunológico y mejorar la circulación            " +
                                                  "\n sanguínea. Se recomienda realizar ejercicio aeróbico moderado al menos 30 minutos al día, como caminar,           " +
                                                  "\n nadar o andar en bicicleta, evitando el sobreesfuerzo. También es beneficioso incluir ejercicios de respiración   " +
                                                  "\n como yoga o técnicas de expansión pulmonar para mejorar la oxigenación celular. POSIBLE TRATAMIENTO. El           " +
                                                  "\n tratamiento estándar incluye antibióticos como ampicilina y gentamicina, que ayudan a eliminar la bacteria        " +
                                                  "\n Listeria monocytogenes. En casos graves, se puede requerir hospitalización para administración intravenosa        " +
                                                  "\n de antibióticos y monitoreo de síntomas. ALIMENTACIÓN. Para fortalecer el sistema inmunológico y reducir la       " +
                                                  "\n inflamación, se recomienda consumir frutas cítricas como naranja, limón y toronja, que son ricas en vitamina C,   " +
                                                  "\n la cual contribuye a la producción de glóbulos blancos y mejora la respuesta inmune. Verduras crucíferas como     " +
                                                  "\n brócoli y coliflor, que contienen vitamina K y antioxidantes, esenciales para la regeneración celular y la        " +
                                                  "\n protección del sistema nervioso. Pescados grasos como salmón y sardina, que son ricos en Omega-3, el cual tiene   " +
                                                  "\n propiedades antiinflamatorias. Legumbres como lentejas y garbanzos, que son fuente de proteínas y hierro,         " +
                                                  "\n esenciales para la energía y la regeneración celular. Este es solo un diagnóstico predeterminado lógico. Haberlo  " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente    " +
                                                  "\n correctas. Para ello, se recomienda realizar más de un diagnóstico y consultar a un médico especialista. Angel    " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tamaño regular) para     " +
                                                  "\n prevenir la deshidratación causada por la diarrea y ayudar a eliminar toxinas. También es recomendable el consumo     " +
                                                  "\n de soluciones de rehidratación oral para reponer electrolitos perdidos, lo que ayuda a evitar complicaciones como     " +
                                                  "\n la fatiga extrema y el desequilibrio de minerales esenciales. EJERCICIO: Se aconseja evitar actividad física intensa  " +
                                                  "\n mientras persistan los síntomas, ya que el cuerpo necesita conservar energía para combatir la infección. Sin embargo, " +
                                                  "\n una vez que los síntomas comiencen a mejorar, se recomienda caminatas suaves de 15 a 30 minutos diarios para mejorar  " +
                                                  "\n la circulación, estimular el metabolismo y favorecer la recuperación intestinal. POSIBLE TRATAMIENTO: Para la         " +
                                                  "\n shigelosis en mujeres jóvenes, el tratamiento suele incluir antibióticos como la azitromicina o la ciprofloxacina     " +
                                                  "\n en casos graves. También se recomienda el uso de soluciones de rehidratación oral y una dieta adecuada para evitar    " +
                                                  "\n complicaciones. Es fundamental seguir el tratamiento completo para evitar recaídas y resistencia bacteriana.          " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en probióticos, vitaminas y minerales esenciales para       " +
                                                  "\n fortalecer el sistema digestivo y acelerar la recuperación: Yogur natural: Rico en probióticos, ayuda a restaurar     " +
                                                  "\n la flora intestinal y mejorar la digestión. Plátanos: Contienen potasio, esencial para reponer electrolitos perdidos  " +
                                                  "\n y mejorar la función muscular. Arroz y pan tostado: Son fáciles de digerir y ayudan a estabilizar el sistema digestivo. " +
                                                  "\n Zanahorias: Ricas en vitamina A, esenciales para la regeneración celular y la recuperación intestinal. Este es solo un  " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esa enfermedad y que   " +
                                                  "\n por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente, además, por su salud, si la respuesta del    " +
                                                  "\n diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico. Angel L Montes agradece tu visita   " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2.5 a 3 litros de agua (diez a doce vasos de tamaño regular)         " +
                                                  "\n para mantener las vías respiratorias hidratadas y reducir la viscosidad de las secreciones bronquiales. También      " +
                                                  "\n es recomendable el consumo de infusiones calientes como té de jengibre o manzanilla, que pueden ayudar a aliviar     " +
                                                  "\n la congestión y mejorar la respiración. EJERCICIO: Se aconseja actividad física moderada y adaptada a la             " +
                                                  "\n capacidad pulmonar de la paciente. Se recomienda ejercicios de respiración profunda, caminatas de 30 minutos         " +
                                                  "\n diarios y yoga para mejorar la función pulmonar y fortalecer los músculos respiratorios. Además, el entrenamiento    " +
                                                  "\n de resistencia puede ser beneficioso para mejorar la capacidad aeróbica y reducir la fatiga. POSIBLE TRATAMIENTO:    " +
                                                  "\n Para la EPOC en mujeres jóvenes, el tratamiento suele incluir broncodilatadores como el salbutamol, corticosteroides " +
                                                  "\n inhalados como la fluticasona y en algunos casos, terapia de oxígeno. También es fundamental evitar el tabaquismo    " +
                                                  "\n y la exposición a contaminantes, ya que estos factores pueden agravar la enfermedad. En algunos casos, se            " +
                                                  "\n recomienda rehabilitación pulmonar para mejorar la calidad de vida y reducir la progresión de los síntomas.          " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades antioxidantes y antiinflamatorias para           " +
                                                  "\n mejorar la función pulmonar: Pescados grasos (salmón, atún): Ricos en ácidos grasos Omega-3, que poseen              " +
                                                  "\n propiedades antiinflamatorias. Frutas y verduras de colores vivos (arándanos, fresas, espinacas, brócoli):           " +
                                                  "\n Ricas en antioxidantes como la vitamina C y carotenoides, que pueden proteger las células del daño. Jengibre:        " +
                                                  "\n Contiene compuestos con efectos antiinflamatorios que podrían ser beneficiosos para las vías respiratorias.          " +
                                                  "\n Cúrcuma: Con su componente activo, la curcumina, tiene potentes propiedades antiinflamatorias y antioxidantes.       " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga     " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de   " +
                                                  "\n un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además, por su  " +
                                                  "\n salud, si la respuesta del diagnóstico no le satisface del todo, se le recomienda mucho consultar a su médico.       " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo diario de 2 a 2.5 litros de agua (ocho a diez vasos de tamaño regular)       " +
                                                  "\n para ayudar a eliminar toxinas y mantener la función renal adecuada durante el tratamiento antibiótico. También    " +
                                                  "\n es recomendable el consumo de jugos naturales sin azúcar y caldos ligeros para mejorar la hidratación y            " +
                                                  "\n fortalecer el sistema inmunológico. EJERCICIO: Se aconseja actividad física moderada, evitando esfuerzos           " +
                                                  "\n excesivos mientras persistan los síntomas. Se recomienda caminatas suaves de 30 minutos diarios para mejorar       " +
                                                  "\n la circulación y el bienestar general. Además, ejercicios de bajo impacto como yoga o pilates pueden ayudar        " +
                                                  "\n a reducir el estrés y mejorar la recuperación. POSIBLE TRATAMIENTO: Para la clamidia en mujeres jóvenes, el        " +
                                                  "\n tratamiento suele incluir antibióticos como la azitromicina o la doxiciclina. Es fundamental completar el          " +
                                                  "\n tratamiento para evitar complicaciones y reinfecciones. También se recomienda evitar relaciones sexuales hasta     " +
                                                  "\n que el tratamiento haya finalizado y la infección haya sido completamente erradicada. ALIMENTACIÓN: Se recomienda  " +
                                                  "\n el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico y   " +
                                                  "\n ayudar a la recuperación: Ajo: Contiene alicina, un compuesto con propiedades antimicrobianas que puede ayudar a   " +
                                                  "\n combatir infecciones. Frutas cítricas (naranjas, limones, toronjas): Ricas en vitamina C, esenciales para mejorar  " +
                                                  "\n la respuesta inmune. Jengibre: Posee propiedades antiinflamatorias y antioxidantes que pueden aliviar la inflamación  " +
                                                  "\n y mejorar la circulación. Yogur natural: Rico en probióticos, ayuda a restaurar la flora intestinal y fortalecer      " +
                                                  "\n el sistema inmunológico. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%   " +
                                                  "\n que la paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se      " +
                                                  "\n recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su    " +
                                                  "\n paciente, además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se le recomienda mucho      " +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo absoluto para evitar complicaciones        " +
                                                  "\n neurológicas. Una vez superada la etapa crítica, se pueden realizar ejercicios de movilidad y fortalecimiento      " +
                                                  "\n muscular para recuperar la función motora y mejorar la circulación. HIDRATACIÓN: Es fundamental el consumo de      " +
                                                  "\n 2.5 a 3 litros de agua, aproximadamente 10 a 12 vasos de tamaño regular, para mantener la hidratación celular      " +
                                                  "\n y favorecer la eliminación de toxinas. También se recomienda el consumo de caldos y líquidos tibios para mejorar   " +
                                                  "\n la absorción de nutrientes esenciales. POSIBLE TRATAMIENTO: La meningitis bacteriana se trata con antibióticos     " +
                                                  "\n de amplio espectro como ceftriaxona, vancomicina y ampicilina, dependiendo del agente causal. Algunas marcas       " +
                                                  "\n reconocidas son Rocephin (ceftriaxona), Vancocin (vancomicina) y Principen (ampicilina). También se recomienda     " +
                                                  "\n el uso de corticosteroides para reducir la inflamación cerebral y mejorar la recuperación. ALIMENTACIÓN RECOMENDADA: " +
                                                  "\n Para fortalecer el sistema inmunológico y mejorar la recuperación, se recomienda el consumo de alimentos ricos    " +
                                                  "\n en vitaminas y minerales esenciales. FRUTAS CÍTRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que      " +
                                                  "\n fortalece el sistema inmune, aportando aproximadamente 89% del requerimiento diario por cada 100 gramos. PESCADOS " +
                                                  "\n GRASOS (salmón, atún): Fuente de OMEGA-3, con propiedades antiinflamatorias, proporcionando aproximadamente 2.2   " +
                                                  "\n gramos por cada 100 gramos de pescado. VEGETALES DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO,    " + 
                                                  "\n fundamentales para la regeneración celular y la función muscular, aportando cerca del 15% del requerimiento diario" +
                                                  "\n por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico. Haberlo consultado no garantiza al 100%   " +
                                                  "\n que la paciente tenga meningitis bacteriana ni que el tratamiento sea el adecuado. Se recomienda realizar más de  " +
                                                  "\n un diagnóstico para mayor seguridad y, por su salud, consultar a su médico. Angel L Montes agradece tu visita a   " +
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n EJERCICIO: Se recomienda actividad física moderada para mejorar la calidad de vida y reducir la fatiga asociada al     " +
                                                  "\n tratamiento. Ejercicios como caminatas, yoga y entrenamiento de resistencia pueden ayudar a mantener la masa           " +
                                                  "\n muscular y mejorar la circulación. También se recomienda ejercicios de relajación para reducir el estrés y mejorar     " +
                                                  "\n el bienestar emocional. HIDRATACIÓN: Es esencial el consumo de 2.5 a 3 litros de agua, aproximadamente 10 a 12         " +
                                                  "\n vasos de tamaño regular, para facilitar la eliminación de toxinas y mejorar la función celular. Mantener una           " +
                                                  "\n hidratación adecuada también contribuye a la absorción de nutrientes esenciales y al fortalecimiento del sistema       " +
                                                  "\n inmunológico. POSIBLE TRATAMIENTO: El cáncer se trata con una combinación de quimioterapia, radioterapia y cirugía,    " +
                                                  "\n dependiendo del tipo y estadio de la enfermedad. Algunas marcas reconocidas de medicamentos incluyen Taxol             " +
                                                  "\n (paclitaxel), Herceptin (trastuzumab) y Xeloda (capecitabina). También se recomienda el seguimiento de un plan de      " +
                                                  "\n tratamiento personalizado para mejorar la respuesta terapéutica. ALIMENTACIÓN RECOMENDADA: Para fortalecer el sistema  " +
                                                  "\n inmunológico y mejorar la recuperación, se recomienda el consumo de alimentos ricos en vitaminas y minerales esenciales. " +
                                                  "\n FRUTAS CÍTRICAS (naranjas, limones, toronjas): Altas en VITAMINA C, que fortalece el sistema inmune, aportando         " +
                                                  "\n aproximadamente 89% del requerimiento diario por cada 100 gramos. PESCADOS GRASOS (salmón, atún): Fuente de OMEGA-3,   " +
                                                  "\n con propiedades antiinflamatorias, proporcionando aproximadamente 2.2 gramos por cada 100 gramos de pescado. VEGETALES " +
                                                  "\n DE HOJA VERDE (espinaca, acelga): Ricos en HIERRO y MAGNESIO, fundamentales para la regeneración celular y la función  " +
                                                  "\n muscular, aportando cerca del 15% del requerimiento diario por cada 100 gramos. Este es solo un diagnóstico predeterminado " +
                                                  "\n lógico. Haberlo consultado no garantiza al 100% que la paciente tenga cáncer ni que el tratamiento sea el adecuado. Se " +
                                                  "\n recomienda realizar más de un diagnóstico para mayor seguridad y, por su salud, consultar a su médico. Angel L Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                    }
                }
             if (EdadFemenino.equals("Juventud = 22-29 años")) {
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
