import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Estudio12 implements ActionListener{
    
         protected final JLabel label1;
         protected JScrollPane scrollpane1;
         protected JTextArea textarea1;
         private JFrame frame;
         private final String edadEsperada = "Adultez Mayor = 60 - 74 años";
         private String edadRecibida;
         
        public Estudio12(String nombrePaciente, String Sexo, String EdadFemenino, 
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
                 if(EdadFemenino.equals("Adultez Mayor = 60 - 74 años")){
                        if(EstaturaFemenino.equals("0.80-1.35 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la influenza es fundamental mantener una hidratación adecuada con un consumo            " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a fluidificar       " +
                                                  "\n las secreciones respiratorias y prevenir la deshidratación causada por la fiebre. EJERCICIO: Se recomienda actividad        " +
                                                  "\n física ligera como estiramientos suaves o caminatas cortas dentro del hogar evitando esfuerzos intensos mientras            " +
                                                  "\n persistan los síntomas. Una vez superada la fase aguda es recomendable realizar ejercicios de respiración profunda          " +
                                                  "\n y movilidad articular para mejorar la oxigenación y prevenir la pérdida de masa muscular. POSIBLE TRATAMIENTO: El           " +
                                                  "\n tratamiento suele incluir medicamentos para reducir la fiebre y aliviar los síntomas como el paracetamol o el ibuprofeno.   " +
                                                  "\n En casos más severos los médicos pueden recetar antivirales específicos contra la gripe como el oseltamivir. Es importante  " +
                                                  "\n seguir las indicaciones médicas y evitar el uso de aspirina ya que puede generar complicaciones. ALIMENTOS RECOMENDADOS:    " +
                                                  "\n Para fortalecer el sistema inmunológico y acelerar la recuperación se recomienda el consumo de NARANJAS Y GUAYABAS:         " +
                                                  "\n Ricas en vitamina C que ayuda a reducir la duración de los síntomas aportando aproximadamente el 89% de la ingesta          " +
                                                  "\n diaria recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos con propiedades antiinflamatorias y puede aliviar     " +
                                                  "\n la congestión. MIEL Y LIMÓN: Combinación efectiva para calmar la garganta y reducir la tos aportando flavonoides y          " +
                                                  "\n vitamina C. ESPINACAS Y BRÓCOLI: Aportan antioxidantes y vitamina A esenciales para la regeneración celular con un          " +
                                                  "\n contenido de aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probióticos  " +
                                                  "\n que pueden fortalecer el sistema inmunológico y mejorar la salud digestiva aportando calcio y proteínas esenciales. Este    " +
                                                  "\n es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad  " +
                                                  "\n ni que las respuestas sean completamente correctas para ello se recomienda hacer más de un Diagnóstico de Mi Vida para      " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente además por su salud si la respuesta del Diagnóstico    " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su médico Angel L Montes agradece tu visita a la app (Mi Vida)  " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la neumonía es fundamental mantener una hidratación adecuada con un consumo       " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a             " +
                                                  "\n fluidificar las secreciones pulmonares y facilitar su expulsión. EJERCICIO: Se recomienda actividad física ligera     " +
                                                  "\n como caminatas cortas dentro del hogar y ejercicios de respiración profunda evitando esfuerzos intensos mientras      " +
                                                  "\n persistan los síntomas. Una vez superada la fase aguda es recomendable realizar ejercicios de expansión pulmonar      " +
                                                  "\n y fisioterapia respiratoria para mejorar la capacidad pulmonar y reducir la sensación de fatiga. POSIBLE TRATAMIENTO: " +
                                                  "\n El tratamiento suele incluir antibióticos como la amoxicilina la azitromicina o la ceftriaxona. En casos más severos  " +
                                                  "\n los médicos pueden recetar antivirales como el oseltamivir además de medicamentos para reducir la fiebre como el      " +
                                                  "\n paracetamol o el ibuprofeno. Es importante seguir las indicaciones médicas y evitar la automedicación. ALIMENTOS      " +
                                                  "\n RECOMENDADOS: Para fortalecer el sistema inmunológico y acelerar la recuperación se recomienda el consumo de NARANJAS " +
                                                  "\n Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la duración de los síntomas aportando aproximadamente el 89% de   " +
                                                  "\n la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos con propiedades antiinflamatorias y  " +
                                                  "\n puede aliviar la congestión. ESPINACAS Y BRÓCOLI: Aportan antioxidantes y vitamina A esenciales para la regeneración  " +
                                                  "\n celular con un contenido de aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL:  " +
                                                  "\n Contiene probióticos que pueden fortalecer el sistema inmunológico y mejorar la salud digestiva aportando calcio y    " +
                                                  "\n proteínas esenciales. Este es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza al 100% que   " +
                                                  "\n el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer    " +
                                                  "\n más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente además     " +
                                                  "\n por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico    " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la diabetes es fundamental mantener una hidratación adecuada con un consumo           " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a la              " +
                                                  "\n regulación de la glucosa en sangre y prevenir la deshidratación. EJERCICIO: Se recomienda actividad física regular        " +
                                                  "\n como caminatas suaves ejercicios de bajo impacto o natación para mejorar la sensibilidad a la insulina y controlar        " +
                                                  "\n los niveles de glucosa en sangre. Además se recomienda la práctica de ejercicios aeróbicos como bicicleta estática        " +
                                                  "\n o baile al menos 150 minutos por semana para mejorar la función cardiovascular y reducir el riesgo de complicaciones.     " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento suele incluir medicamentos como la metformina para mejorar la sensibilidad a la       " +
                                                  "\n insulina. En casos más severos los médicos pueden recetar insulina de acción rápida o prolongada además de medicamentos     " +
                                                  "\n para controlar la presión arterial y el colesterol. Es importante seguir las indicaciones médicas y mantener un monitoreo   " +
                                                  "\n constante de los niveles de glucosa. ALIMENTOS RECOMENDADOS: Para fortalecer el metabolismo y mejorar el control de la      " +
                                                  "\n glucosa se recomienda el consumo de FRUTOS ROJOS: Ricos en antioxidantes y fibra que ayudan a regular la glucosa en sangre  " +
                                                  "\n aportando aproximadamente el 32% de la ingesta diaria recomendada por cada 100 gramos. FRUTOS SECOS: Contienen grasas       " +
                                                  "\n saludables y fibra que pueden mejorar la sensibilidad a la insulina aportando aproximadamente el 25% de la ingesta diaria   " +
                                                  "\n recomendada por cada 100 gramos. ESPINACAS Y BRÓCOLI: Aportan antioxidantes y vitamina A esenciales para la regeneración    " +
                                                  "\n celular con un contenido de aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos. AVENA: Rica en fibra  " +
                                                  "\n soluble que ayuda a estabilizar los niveles de glucosa en sangre aportando aproximadamente el 40% de la ingesta diaria      " +
                                                  "\n recomendada por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza al 100%  " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer más  " +
                                                  "\n de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente además por su salud  " +
                                                  "\n si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico Angel L Montes        " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2 a 2.5 litros de agua al día (aproximadamente ocho a diez vasos de agua      " +
                                                  "\n de tamaño regular) para mantener las vías respiratorias hidratadas, facilitar la eliminación de secreciones y          " +
                                                  "\n reducir la inflamación bronquial. En personas adultas mayores, una hidratación adecuada también ayuda a prevenir       " +
                                                  "\n la sequedad de mucosas y mejora la función pulmonar general. EJERCICIO: Actividad física moderada como caminatas       " +
                                                  "\n suaves, ejercicios de respiración y estiramientos controlados pueden mejorar la capacidad pulmonar y reducir la        " +
                                                  "\n frecuencia de las crisis asmáticas. Es importante evitar ambientes fríos o contaminados y realizar calentamiento       " +
                                                  "\n previo para prevenir la broncoconstricción inducida por el ejercicio. POSIBLE TRATAMIENTO: El tratamiento incluye      " +
                                                  "\n broncodilatadores de acción rápida como Salbutamol (Ventolin, Aerolin), corticosteroides inhalados como Fluticasona    " +
                                                  "\n o Budesonida (Flixotide, Pulmicort), y en algunos casos, modificadores de leucotrienos como Montelukast (Singulair).   " +
                                                  "\n En adultos mayores, es esencial revisar la técnica de inhalación y ajustar las dosis para evitar efectos secundarios   " +
                                                  "\n como temblores o taquicardia. También se recomienda el uso de espaciadores para mejorar la administración del medicamento. " +
                                                  "\n ALIMENTACIÓN: Se sugiere el consumo de alimentos antiinflamatorios y antioxidantes como: Pescados grasos (salmón, atún),   " +
                                                  "\n ricos en Omega-3, que ayudan a reducir la inflamación de las vías respiratorias (50% de la ingesta diaria recomendada      " +
                                                  "\n por cada 100 g); Frutas cítricas (naranjas, toronjas), con vitamina C que fortalece el sistema inmune (89% por cada        " +
                                                  "\n 100 g); Espinacas (ricas en vitamina A y magnesio, esenciales para la función pulmonar, con 56% y 20% respectivamente      " +
                                                  "\n por cada 100 g); Jengibre y cúrcuma, con propiedades antiinflamatorias naturales. Este es solo un diagnóstico predeterminado" +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean      " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor     " +
                                                  "\n seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, " +
                                                  "\n se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 litros de agua al día (diez vasos de agua de tamaño regular) para           " +
                                                  "\n apoyar la función renal, facilitar la eliminación de toxinas y mantener el equilibrio electrolítico, especialmente       " +
                                                  "\n importante en pacientes que toman múltiples medicamentos. También se sugiere incluir infusiones antioxidantes como       " +
                                                  "\n té verde o rooibos. EJERCICIO: Actividad física moderada como caminatas, yoga suave o ejercicios de bajo impacto         " +
                                                  "\n puede mejorar la masa muscular, reducir el estrés y fortalecer el sistema inmunológico. Es importante adaptar la         " +
                                                  "\n rutina a la condición física de la paciente y evitar el sobreesfuerzo. POSIBLE TRATAMIENTO: El tratamiento estándar      " +
                                                  "\n es la terapia antirretroviral (TAR), que combina medicamentos como Tenofovir, Emtricitabina, Efavirenz (Atripla),        " +
                                                  "\n Dolutegravir (Tivicay) y Lamivudina (Epivir). En mujeres adultas mayores, es crucial monitorear la función hepática      " +
                                                  "\n y renal, así como posibles interacciones con otros medicamentos para enfermedades crónicas. También se recomienda el     " +
                                                  "\n seguimiento de la densidad ósea, ya que algunos antirretrovirales pueden afectar el metabolismo del calcio. ALIMENTACIÓN:  " +
                                                  "\n Se recomienda una dieta rica en nutrientes inmunoestimulantes como: Frutas cítricas (naranjas, limones), con vitamina C    " +
                                                  "\n (89% por cada 100 g); Aguacate, fuente de vitamina E y ácidos grasos monoinsaturados (14% por cada 100 g); Pescados grasos " +
                                                  "\n (salmón, sardina), ricos en Omega-3 (50% por cada 100 g); Verduras de hoja verde (espinacas, acelgas), con vitamina A      " +
                                                  "\n y hierro (56% y 15% respectivamente por cada 100 g); Legumbres (lentejas, frijoles), con proteínas vegetales y hierro      " +
                                                  "\n (37% por cada 100 g). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la    " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más   " +
                                                  "\n de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Además, por su salud, si la       " +
                                                  "\n respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea. " +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2 a 2.5 litros de agua al día (ocho a diez vasos de agua de tamaño regular)    " +
                                                  "\n para facilitar la eliminación de toxinas y mantener la función renal, especialmente importante durante el tratamiento   " +
                                                  "\n antibiótico. También se sugiere el consumo de jugos naturales sin azúcar para aportar antioxidantes. EJERCICIO:         " +
                                                  "\n Actividad física ligera como caminatas o estiramientos suaves puede ayudar a mejorar la circulación y fortalecer        " +
                                                  "\n el sistema inmune. Se debe evitar el ejercicio intenso durante el tratamiento para no comprometer la recuperación.      " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento incluye antibióticos como Ceftriaxona (inyección única) y Azitromicina (dosis       " +
                                                  "\n oral). En mujeres adultas mayores, es importante vigilar posibles efectos secundarios gastrointestinales y ajustar      " +
                                                  "\n la dosis en caso de insuficiencia renal. También se recomienda realizar pruebas de seguimiento para confirmar la        " +
                                                  "\n erradicación de la bacteria y evitar reinfecciones. En casos resistentes, puede ser necesario el uso de combinaciones   " +
                                                  "\n antibióticas o tratamientos prolongados. ALIMENTACIÓN: Se recomienda una dieta que apoye la función inmunológica y la   " +
                                                  "\n recuperación, incluyendo: Naranjas (ricas en vitamina C, 89% por cada 100 g); Espinacas (fuente de hierro y ácido fólico," +
                                                  "\n 56% y 49% respectivamente por cada 100 g); Yogur natural (rico en probióticos y calcio, 30% de la ingesta diaria      " +
                                                  "\n recomendada por cada 100 g); Ajo (con propiedades antibacterianas naturales); y Zanahorias (ricas en vitamina A,      " +
                                                  "\n 93% por cada 100 g), que ayudan a mantener la integridad de las mucosas. Este es solo un diagnóstico predeterminado   " +
                                                  "\n lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean      " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor     " +
                                                  "\n seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, " +
                                                  "\n se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidratación    " +
                                                  "\n óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda    " +
                                                  "\n actividad física moderada como caminatas suaves, yoga o ejercicios de estiramiento de bajo impacto durante 30 minutos      " +
                                                  "\n al día, cinco veces por semana, para fortalecer el sistema inmunológico y reducir el estrés, ya que el estrés puede        " +
                                                  "\n desencadenar brotes. También es útil incorporar ejercicios de respiración profunda y meditación para mejorar la respuesta  " +
                                                  "\n del cuerpo ante el virus. HIDRATACIÓN. Se aconseja consumir al menos 2 litros de agua al día para mantener la piel y las   " +
                                                  "\n mucosas hidratadas, lo cual ayuda a reducir la irritación y prevenir brotes. Además, se recomienda evitar bebidas con      " +
                                                  "\n cafeína o alcohol, ya que pueden favorecer la deshidratación. Infusiones suaves como manzanilla o té verde pueden ser      " +
                                                  "\n beneficiosas por sus propiedades antiinflamatorias y antioxidantes. POSIBLE TRATAMIENTO. El tratamiento para el herpes     " +
                                                  "\n genital incluye antivirales como aciclovir, famciclovir y valaciclovir, que ayudan a reducir la duración y frecuencia      " +
                                                  "\n de los brotes. Marcas reconocidas incluyen Zovirax y Valtrex. En casos de recurrencias frecuentes, se puede considerar     " +
                                                  "\n terapia supresiva diaria. También se recomienda el uso de cremas tópicas con lidocaína o aloe vera para aliviar el         " + 
                                                  "\n malestar local. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica en lisina y antioxidantes para fortalecer el        " +
                                                  "\n sistema inmunológico. Algunos alimentos clave incluyen yogur natural y leche, ricos en lisina, que inhibe la replicación   " +
                                                  "\n del virus. Frutas cítricas como naranja y kiwi, ricas en vitamina C, que fortalecen el sistema inmune, aportando           " +
                                                  "\n aproximadamente el 89% del requerimiento diario por cada 100 gramos. Verduras como espinaca y zanahoria, ricas en          " +
                                                  "\n vitamina A, que contribuyen a la regeneración celular y fortalecen las mucosas, con un aporte del 15% del requerimiento    " +
                                                  "\n diario por cada 100 gramos. Este diagnóstico es una referencia lógica basada en información médica, pero no garantiza al   " +
                                                  "\n 100% que el paciente tenga herpes genital ni que el tratamiento sea el adecuado. Se recomienda realizar más de un          " +
                                                  "\n diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera    " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una       " +
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales.        " +
                                                  "\n EJERCICIO. Se recomienda actividad física moderada como caminatas diarias de 30 minutos, ejercicios de            " +
                                                  "\n movilidad articular y estiramientos suaves para mejorar la circulación, mantener la masa muscular y fortalecer    " +
                                                  "\n el sistema inmunológico. También es beneficioso incluir ejercicios de equilibrio y coordinación para prevenir     " +
                                                  "\n caídas. HIDRATACIÓN. Se aconseja consumir entre 2 y 2.5 litros de agua al día para ayudar a eliminar toxinas      " +
                                                  "\n del cuerpo, mantener la función renal y apoyar el metabolismo durante el tratamiento antibiótico. También se      " +
                                                  "\n recomienda el consumo de caldos naturales y jugos de frutas sin azúcar añadida para mantener el equilibrio de     " +
                                                  "\n electrolitos. POSIBLE TRATAMIENTO. El tratamiento estándar para la sífilis incluye antibióticos como penicilina   " +
                                                  "\n G benzatina, doxiciclina o ceftriaxona. Marcas reconocidas incluyen Benzetacil y Doxiciclina. En pacientes               " +
                                                  "\n alérgicos a la penicilina, se utilizan alternativas como la doxiciclina por vía oral durante 14 días. Es fundamental     " +
                                                  "\n completar el tratamiento para evitar complicaciones como neurosífilis o daño cardiovascular. ALIMENTACIÓN RECOMENDADA.   " +
                                                  "\n Se recomienda una dieta rica en proteínas, vitaminas y minerales para fortalecer el sistema inmunológico. Algunos        " +
                                                  "\n alimentos clave incluyen carnes magras y pescado, fuentes de proteínas esenciales. Frutas cítricas como naranja y        " +
                                                  "\n limón, ricas en vitamina C, que ayudan a la recuperación y fortalecimiento del sistema inmune, aportando el 89% del      " +
                                                  "\n requerimiento diario por cada 100 gramos. Verduras de hoja verde como espinaca y brócoli, que contienen hierro y         " +
                                                  "\n antioxidantes esenciales para la producción de glóbulos rojos, con un aporte del 15% del requerimiento diario por        " +
                                                  "\n cada 100 gramos. Ajo y cebolla, con compuestos antimicrobianos naturales que pueden apoyar el tratamiento. Este          " +
                                                  "\n diagnóstico es una referencia lógica basada en información médica, pero no garantiza al 100% que el paciente tenga       " +
                                                  "\n sífilis ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico      " +
                                                  "\n para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una         " +
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales.          " +
                                                  "\n EJERCICIO. Se recomienda actividad física moderada como caminatas suaves, ejercicios de respiración profunda        " + 
                                                  "\n y yoga terapéutico para fortalecer los pulmones, mejorar la oxigenación y reducir la fatiga. También es útil        " +
                                                  "\n realizar ejercicios de movilidad articular y estiramientos para mantener la flexibilidad y prevenir la pérdida      " +
                                                  "\n de masa muscular. HIDRATACIÓN. Se aconseja consumir entre 2.5 y 3 litros de agua al día para mantener las vías      " +
                                                  "\n respiratorias hidratadas, facilitar la eliminación de toxinas y apoyar la función renal durante el tratamiento.     " +
                                                  "\n También se recomienda el consumo de caldos ricos en minerales y jugos naturales con alto contenido de vitamina C.   " +
                                                  "\n POSIBLE TRATAMIENTO. El tratamiento estándar para la tuberculosis incluye una combinación de antibióticos como      " +
                                                  "\n isoniazida, rifampicina, etambutol y pirazinamida durante un período de al menos seis meses. Marcas reconocidas     " +
                                                  "\n incluyen Rifater y Rimactane. Es fundamental seguir el tratamiento completo y bajo supervisión médica para evitar   " +
                                                  "\n recaídas o resistencia bacteriana. En adultos mayores, se debe ajustar la dosis en caso de insuficiencia renal o    " +
                                                  "\n hepática y monitorear posibles efectos secundarios. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica en         " +
                                                  "\n proteínas, vitaminas y minerales para fortalecer el sistema inmunológico y apoyar la recuperación. Algunos alimentos  " +
                                                  "\n clave incluyen carnes magras y pescado, fuentes de proteínas esenciales. Frutas cítricas como naranja y kiwi, ricas   " +
                                                  "\n en vitamina C, que ayudan a la recuperación y fortalecimiento del sistema inmune, aportando el 89% del requerimiento  " +
                                                  "\n diario por cada 100 gramos. Verduras de hoja verde como espinaca y brócoli, que contienen hierro y antioxidantes      " +
                                                  "\n esenciales para la producción de glóbulos rojos, con un aporte del 15% del requerimiento diario por cada 100 gramos.  " +
                                                  "\n Frutos secos como almendras y nueces, ricos en vitamina E y ácidos grasos esenciales, que fortalecen el sistema       " +
                                                  "\n inmunológico y aportan el 37% del requerimiento diario por cada 28 gramos. Este diagnóstico es una referencia lógica  " +
                                                  "\n basada en información médica, pero no garantiza al 100% que el paciente tenga tuberculosis ni que el tratamiento sea  " +
                                                  "\n el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes" +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis. " +
                                                  "\n La artritis es una inflamación de las articulaciones que puede causar dolor, rigidez y disminución de la movilidad.            " +
                                                  "\n En la adultez mayor, es común que se presente osteoartritis, una forma degenerativa que afecta principalmente rodillas,        " +
                                                  "\n caderas y manos. EJERCICIO. Se recomienda actividad física moderada y adaptada a la movilidad de la persona, como              " +
                                                  "\n caminatas suaves, ejercicios acuáticos o estiramientos guiados, que ayudan a mantener la flexibilidad y reducir la             " +
                                                  "\n rigidez. También es beneficioso realizar ejercicios de fortalecimiento muscular para mejorar el soporte articular y            " +
                                                  "\n prevenir caídas. HIDRATACIÓN. Es fundamental consumir entre 2 y 2.5 litros de agua al día para mantener la lubricación         " +
                                                  "\n de las articulaciones, facilitar la eliminación de toxinas y reducir la inflamación. Se sugiere complementar con infusiones    " +
                                                  "\n de cúrcuma o jengibre, que poseen propiedades antiinflamatorias naturales. POSIBLE TRATAMIENTO. El tratamiento puede incluir   " +
                                                  "\n medicamentos antiinflamatorios no esteroides como ibuprofeno o naproxeno, corticosteroides en casos más severos, y fármacos    " +
                                                  "\n modificadores de la enfermedad como el metotrexato. También se recomienda fisioterapia y en algunos casos el uso de            " +
                                                  "\n suplementos como glucosamina y condroitina. ALIMENTACIÓN RECOMENDADA. Consumir alimentos ricos en antioxidantes y ácidos       " +
                                                  "\n grasos esenciales. Pescados grasos como salmón y sardina, ricos en ácidos grasos Omega-3, que ayudan a reducir la inflamación  " +
                                                  "\n articular, aportando hasta el 90% del requerimiento diario por cada 100 g. Frutas como arándanos y fresas, ricas en vitamina C " +
                                                  "\n y antioxidantes, que fortalecen el sistema inmunológico y reducen el daño celular, aportando cerca del 70% del requerimiento   " +
                                                  "\n diario por cada 100 g. Verduras de hoja verde como espinaca y kale, que contienen hierro, calcio y vitamina K, esenciales para " +
                                                  "\n la salud ósea y articular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el   " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más " +
                                                  "\n de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud si " +
                                                  "\n la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Ángel L Montes agradece tu " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n La tosferina, o pertussis, es una infección bacteriana que afecta las vías respiratorias y puede causar tos intensa      " +
                                                  "\n y prolongada. En adultos mayores, puede ser más severa y provocar complicaciones respiratorias. EJERCICIO. Se            " +
                                                  "\n recomienda actividad física ligera, como caminatas cortas o ejercicios de respiración profunda, para mejorar la          " +
                                                  "\n oxigenación sin agotar al paciente. Es importante evitar ambientes fríos o contaminados que puedan agravar los           " +
                                                  "\n síntomas. HIDRATACIÓN. Es fundamental consumir entre 2 y 2.5 litros de agua al día para mantener las vías respiratorias  " +
                                                  "\n hidratadas y facilitar la eliminación de mucosidad. También se recomienda el consumo de líquidos tibios como infusiones  " +
                                                  "\n de jengibre o té de manzanilla para aliviar la garganta. POSIBLE TRATAMIENTO. El tratamiento incluye antibióticos como   " +
                                                  "\n azitromicina, claritromicina o eritromicina, que ayudan a eliminar la bacteria. En casos con dificultad respiratoria,    " +
                                                  "\n pueden utilizarse broncodilatadores. Se recomienda reposo y aislamiento durante los primeros días para evitar contagios. " +
                                                  "\n ALIMENTACIÓN RECOMENDADA. Consumir alimentos que fortalezcan el sistema respiratorio. Frutas cítricas como naranja y     " +
                                                  "\n toronja, ricas en vitamina C, que ayudan a reducir la duración de los síntomas, aportando hasta el 89% del requerimiento " +
                                                  "\n diario por cada 100 g. Miel, con propiedades antimicrobianas y calmantes para la garganta. Jengibre, con efectos         " +
                                                  "\n antiinflamatorios que pueden aliviar la tos. Yogur natural, fuente de probióticos que fortalecen la flora intestinal y   " +
                                                  "\n el sistema inmune. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el     " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda     " +
                                                  "\n hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además " +
                                                  "\n por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico,      " +
                                                  "\n Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Las paperas son una infección viral que afecta las glándulas salivales, causando inflamación y dolor en la zona             " +
                                                  "\n de la mandíbula. En adultos mayores, pueden presentarse síntomas más intensos y riesgo de complicaciones. EJERCICIO.        " +
                                                  "\n Se recomienda actividad física ligera mientras persistan los síntomas, como estiramientos suaves o caminatas cortas,        " +
                                                  "\n evitando esfuerzos que puedan aumentar la inflamación. HIDRATACIÓN. Es fundamental consumir entre 2 y 2.5 litros de         " +
                                                  "\n agua al día para ayudar al cuerpo a combatir la infección y mantenerse hidratado. Se sugiere complementar con líquidos      " +
                                                  "\n suaves como caldos o infusiones de manzanilla. POSIBLE TRATAMIENTO. No existe un tratamiento antiviral específico para      " +
                                                  "\n las paperas. Se recomienda el uso de paracetamol para aliviar la fiebre y el dolor, evitando el ibuprofeno y la aspirina.     " +
                                                  "\n También se sugiere el uso de compresas frías en la zona inflamada y reposo absoluto durante los primeros días. ALIMENTACIÓN   " +
                                                  "\n RECOMENDADA. Consumir alimentos blandos y ricos en nutrientes. Frutas cítricas como naranja y mandarina, ricas en vitamina C, " +
                                                  "\n que fortalecen el sistema inmunológico, aportando hasta el 89% del requerimiento diario por cada 100 g. Yogur natural,        " +
                                                  "\n fuente de probióticos que ayudan a mantener la flora intestinal. Verduras de hoja verde como espinaca, que aportan hierro     " +
                                                  "\n y antioxidantes esenciales para la recuperación. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no     " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para    " +
                                                  "\n ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su    " +
                                                  "\n paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a     " +
                                                  "\n su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n EJERCICIO: Durante la infección por el virus del Zika se recomienda evitar cualquier esfuerzo físico intenso y            " +
                                                  "\n priorizar el descanso absoluto, ya que el sistema inmunológico necesita conservar energía para combatir el virus.         " +
                                                  "\n Una vez que los síntomas disminuyen, se pueden realizar ejercicios suaves como caminatas lentas o estiramientos           " +
                                                  "\n ligeros para mejorar la circulación y reducir la rigidez muscular. También es útil practicar ejercicios de                " +
                                                  "\n respiración profunda para mejorar la oxigenación celular y reducir la inflamación. HIDRATACIÓN: Es fundamental            " +
                                                  "\n consumir al menos 2.5 litros de agua al día para prevenir la deshidratación, regular la temperatura corporal y            " +
                                                  "\n facilitar la eliminación de toxinas. También se recomienda el consumo de caldos naturales, infusiones como té de          " +
                                                  "\n jengibre o manzanilla, y jugos naturales sin azúcar añadida, que además de hidratar aportan antioxidantes y alivian       " +
                                                  "\n síntomas como el dolor muscular y la fiebre. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral específico para      " + 
                                                  "\n el Zika, pero los síntomas pueden aliviarse con reposo, hidratación constante y medicamentos como el acetaminofén para    " +
                                                  "\n reducir la fiebre y el dolor. Es importante evitar el uso de aspirina y otros antiinflamatorios no esteroideos hasta      " +
                                                  "\n descartar la posibilidad de dengue, para reducir el riesgo de hemorragias. También se recomienda evitar el consumo de     " +
                                                  "\n alcohol y tabaco durante la recuperación, ya que pueden debilitar el sistema inmunológico. ALIMENTACIÓN: Se recomienda    " +
                                                  "\n el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico, tales     " +
                                                  "\n como frutas cítricas como naranjas y toronjas, que aportan vitamina C en un 89% de la ingesta diaria recomendada,         " +
                                                  "\n ayudando a combatir infecciones. Verduras de hoja verde como espinacas y acelgas, que aportan hasta un 50% de la ingesta    " +
                                                  "\n diaria recomendada de vitamina A y K, esenciales para la regeneración celular. Jengibre y cúrcuma, que poseen propiedades   " +
                                                  "\n antiinflamatorias y antioxidantes, contribuyendo con hasta un 40% de la ingesta diaria recomendada de compuestos bioactivos " +
                                                  "\n beneficiosos para la salud. este es solo un diagnóstico predeterminado lógico. haberlo consultado no garantiza al 100% que  " +
                                                  "\n la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar más de un      " +
                                                  "\n diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico no le    " +
                                                  "\n satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera      " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n EJERCICIO: Durante la infección por rotavirus se recomienda evitar cualquier tipo de esfuerzo físico y priorizar          " +
                                                  "\n el descanso absoluto, ya que la pérdida de líquidos y nutrientes puede provocar debilidad extrema. Una vez superada       " +
                                                  "\n la fase aguda, se pueden realizar ejercicios suaves como caminatas lentas o estiramientos para estimular la circulación   " +
                                                  "\n y recuperar la energía. HIDRATACIÓN: Es crucial el consumo de al menos 2.5 litros de agua al día para prevenir la         " +
                                                  "\n deshidratación causada por la diarrea y los vómitos. También se recomienda el uso de soluciones de rehidratación oral     " +
                                                  "\n que contienen electrolitos esenciales como sodio, potasio y glucosa, los cuales ayudan a restablecer el equilibrio        " +
                                                  "\n hídrico y energético del cuerpo. El consumo de caldos naturales y jugos suaves sin azúcar también puede ser beneficioso.  " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento antiviral específico para el rotavirus, pero los síntomas pueden aliviarse  " +
                                                  "\n con hidratación intensiva, reposo y una dieta adecuada. Se deben evitar los medicamentos antidiarreicos, ya que pueden    " +
                                                  "\n prolongar la infección. En casos graves, puede ser necesaria la administración de líquidos por vía intravenosa. También   " +
                                                  "\n se recomienda el consumo de probióticos para restaurar la flora intestinal. ALIMENTACIÓN: Se recomienda el consumo de     " +
                                                  "\n alimentos que favorezcan la recuperación del sistema digestivo, tales como yogur natural, que contiene probióticos        " +
                                                  "\n beneficiosos para la flora intestinal. Frutas como plátanos y manzanas, que aportan fibra soluble y ayudan a regular      " +
                                                  "\n el tránsito intestinal. Verduras como zanahorias y calabacines, que contienen antioxidantes y vitaminas esenciales como   " +
                                                  "\n la vitamina A y el potasio, aportando hasta un 50% de la ingesta diaria recomendada, fundamentales para la regeneración   " +
                                                  "\n de la mucosa intestinal. este es solo un diagnóstico predeterminado lógico. haberlo consultado no garantiza al 100% que   " +
                                                  "\n la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar más de un    " +
                                                  "\n diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico no     " +
                                                  "\n le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n EJERCICIO: Durante la infección por listeria se recomienda evitar esfuerzos físicos intensos y priorizar el descanso,   " +
                                                  "\n ya que el cuerpo necesita conservar energía para combatir la bacteria. Una vez que los síntomas disminuyen, se pueden   " +
                                                  "\n realizar ejercicios suaves como caminatas lentas o ejercicios de respiración para mejorar la oxigenación celular y      " +
                                                  "\n reducir la fatiga. HIDRATACIÓN: Es fundamental consumir al menos 2.5 litros de agua al día para ayudar a eliminar       " +
                                                  "\n toxinas y mantener el equilibrio de los fluidos corporales. También se recomienda el consumo de caldos naturales,       " +
                                                  "\n infusiones suaves y jugos sin azúcar para aportar electrolitos esenciales. La hidratación adecuada contribuye a la      " +
                                                  "\n eliminación de bacterias a través de la orina y mejora la función renal, lo cual es clave durante una infección         " +
                                                  "\n bacteriana. POSIBLE TRATAMIENTO: La infección por listeria se trata con antibióticos como ampicilina o gentamicina,     " +
                                                  "\n especialmente en casos graves o en pacientes inmunocomprometidos. En adultos mayores, el tratamiento debe iniciarse     " +
                                                  "\n lo antes posible para evitar complicaciones como septicemia o meningitis. También se recomienda evitar alimentos de     " +
                                                  "\n alto riesgo como productos lácteos no pasteurizados, embutidos y pescados ahumados durante la recuperación. ALIMENTACIÓN: " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema       " +
                                                  "\n inmunológico, tales como frutas cítricas como naranjas y toronjas, que aportan vitamina C en un 89% de la ingesta     " +
                                                  "\n diaria recomendada, ayudando a combatir infecciones. Verduras de hoja verde como espinacas y acelgas, que aportan     " +
                                                  "\n hasta un 50% de la ingesta diaria recomendada de vitamina A y K, esenciales para la regeneración celular. Frutos      " +
                                                  "\n secos como almendras y nueces, que contienen vitamina E y magnesio, contribuyendo con hasta un 40% de la ingesta      " +
                                                  "\n diaria recomendada de estos nutrientes esenciales para la recuperación neurológica. este es solo un diagnóstico       " +
                                                  "\n predeterminado lógico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las       " +
                                                  "\n respuestas sean completamente correctas. se recomienda realizar más de un diagnóstico para mayor seguridad en el      " +
                                                  "\n tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda   " +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la shigelosis es fundamental mantener una hidratación adecuada con un consumo    " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para reponer los         " +
                                                  "\n líquidos perdidos por la diarrea y prevenir la deshidratación. EJERCICIO: Se recomienda actividad física ligera      " + 
                                                  "\n como caminatas suaves dentro del hogar o ejercicios de movilidad articular evitando esfuerzos intensos mientras      " +
                                                  "\n persistan los síntomas. Una vez superada la fase aguda es recomendable realizar ejercicios de fortalecimiento        " +
                                                  "\n progresivo para recuperar energía y mejorar la función digestiva. POSIBLE TRATAMIENTO: El tratamiento suele incluir  " +
                                                  "\n antibióticos como la ciprofloxacina o la azitromicina y en casos más severos ceftriaxona. Es importante evitar       " +
                                                  "\n medicamentos antidiarreicos sin indicación médica ya que pueden empeorar la eliminación de la bacteria. ALIMENTOS    " +
                                                  "\n RECOMENDADOS: Para fortalecer el sistema digestivo y acelerar la recuperación se recomienda el consumo de PLÁTANOS:  " +
                                                  "\n Ricos en potasio que ayuda a reemplazar los electrolitos perdidos debido a la diarrea aportando aproximadamente el   " +
                                                  "\n 12% de la ingesta diaria recomendada por cada 100 gramos. ARROZ BLANCO: Fuente de carbohidratos de fácil digestión   " +
                                                  "\n que ayuda a estabilizar el sistema digestivo. ZANAHORIAS: Ricas en vitamina A y antioxidantes que ayudan a la        " +
                                                  "\n regeneración celular aportando aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR    " +
                                                  "\n NATURAL: Contiene probióticos que pueden fortalecer el sistema digestivo y mejorar la salud intestinal aportando     " +
                                                  "\n calcio y proteínas esenciales. Este es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza     " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se        " +
                                                  "\n recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su   " +
                                                  "\n paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho         " +
                                                  "\n consultar a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la EPOC es fundamental mantener una hidratación adecuada con un consumo diario            " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a mantener las vías          " +
                                                  "\n respiratorias hidratadas y facilitar la expulsión de mucosidad. EJERCICIO: Se recomienda actividad física ligera como         " +
                                                  "\n caminatas lentas ejercicios de respiración profunda y estiramientos suaves para mejorar la oxigenación y la capacidad         " +
                                                  "\n pulmonar. Además se recomienda la práctica de ejercicios de fortalecimiento muscular y fisioterapia respiratoria adaptada     " +
                                                  "\n a la capacidad del paciente para mantener la funcionalidad y prevenir la pérdida de masa muscular. POSIBLE TRATAMIENTO:       " +
                                                  "\n El tratamiento suele incluir broncodilatadores de acción rápida como el salbutamol corticosteroides inhalados como la         " +
                                                  "\n fluticasona y en algunos casos terapia con oxígeno. Es fundamental seguir estrictamente el plan de acción indicado por        " +
                                                  "\n el médico y evitar la exposición a contaminantes ambientales. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema respiratorio " + 
                                                  "\n y reducir la inflamación se recomienda el consumo de PESCADOS GRASOS: Salmón y atún ricos en ácidos grasos Omega-3 que poseen " +
                                                  "\n propiedades antiinflamatorias que pueden ayudar a reducir la inflamación de las vías respiratorias aportando aproximadamente  " +
                                                  "\n el 50% de la ingesta diaria recomendada por cada 100 gramos. FRUTAS Y VERDURAS DE COLORES VIVOS: Arándanos fresas espinacas   " +
                                                  "\n brócoli ricos en antioxidantes como la vitamina C y carotenoides que pueden proteger las células del daño y fortalecer el     " +
                                                  "\n sistema inmunológico aportando aproximadamente el 70% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE:         " +
                                                  "\n Contiene compuestos con efectos antiinflamatorios que podrían ser beneficiosos para las vías respiratorias. CÚRCUMA: Con su   " +
                                                  "\n componente activo la curcumina también tiene potentes propiedades antiinflamatorias y antioxidantes. Este es solo un          " +
                                                  "\n diagnóstico predeterminado lógico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que        " +
                                                  "\n las respuestas sean completamente correctas para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer    " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente además por su salud si la respuesta del Diagnóstico no le satisface " +
                                                  "\n del todo se le recomienda mucho consultar a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la clamidia es fundamental mantener una hidratación adecuada con un consumo       " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a la          " +
                                                  "\n eliminación de toxinas y fortalecer el sistema inmunológico. EJERCICIO: Se recomienda actividad física moderada       " +
                                                  "\n como caminatas ejercicios de bajo impacto o natación para mejorar la circulación sanguínea y fortalecer el sistema    " +
                                                  "\n inmunológico. Además se recomienda la práctica de ejercicios de relajación como yoga o meditación para reducir el     " +
                                                  "\n estrés que puede afectar la respuesta inmunológica. POSIBLE TRATAMIENTO: El tratamiento suele incluir antibióticos    " +
                                                  "\n como la azitromicina en dosis única o la doxiciclina durante 7 días. En casos más severos los médicos pueden recetar  " +
                                                  "\n levofloxacina. Es fundamental seguir estrictamente el tratamiento indicado por el médico y evitar la automedicación.  " +
                                                  "\n ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunológico y acelerar la recuperación se recomienda el consumo   " +
                                                  "\n de FRUTOS ROJOS: Ricos en antioxidantes y vitamina C que ayudan a fortalecer el sistema inmunológico aportando        " +
                                                  "\n aproximadamente el 70% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos con        " +
                                                  "\n propiedades antiinflamatorias y puede ayudar a reducir la inflamación. ESPINACAS Y BRÓCOLI: Aportan antioxidantes     " +
                                                  "\n y vitamina A esenciales para la regeneración celular con un contenido de aproximadamente 56% de la ingesta diaria     " + 
                                                  "\n recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probióticos que pueden fortalecer el sistema inmunológico       " +
                                                  "\n y mejorar la salud digestiva aportando calcio y proteínas esenciales. Este es solo un diagnóstico predeterminado lógico  " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente   " +
                                                  "\n correctas para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el           " +
                                                  "\n tratamiento adecuado de su paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo         " +
                                                  "\n se le recomienda mucho consultar a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 a 3 litros de agua al día (diez a doce vasos de agua de tamaño regular)      " +
                                                  "\n para mantener la función cerebral, facilitar la eliminación de toxinas y apoyar el sistema inmunológico. En mujeres       " +
                                                  "\n adultas mayores, una hidratación constante también ayuda a prevenir la deshidratación, que puede agravar los síntomas     " +
                                                  "\n neurológicos. EJERCICIO: Actividad física ligera como caminatas suaves, ejercicios de respiración y estiramientos         " +
                                                  "\n controlados puede mejorar la circulación cerebral y reducir la rigidez muscular. Es importante evitar el esfuerzo         " +
                                                  "\n excesivo y priorizar el descanso durante la fase aguda de la enfermedad. Una vez estabilizada, se recomienda incorporar   " +
                                                  "\n rutinas de movilidad para prevenir el deterioro funcional. POSIBLE TRATAMIENTO: El tratamiento inmediato incluye          " +
                                                  "\n antibióticos intravenosos de amplio espectro como Ceftriaxona, Cefotaxima o Ampicilina, ajustados según el microorganismo " +
                                                  "\n identificado. También se administran corticosteroides como la Dexametasona para reducir la inflamación cerebral y         " +
                                                  "\n prevenir complicaciones como pérdida auditiva o convulsiones. En casos graves, puede requerirse hospitalización           " +
                                                  "\n prolongada, monitoreo neurológico intensivo y el uso de anticonvulsivos si se presentan crisis. Es esencial iniciar el    " +
                                                  "\n tratamiento lo antes posible para reducir el riesgo de secuelas neurológicas permanentes. ALIMENTACIÓN: Se recomienda     " +
                                                  "\n una dieta rica en nutrientes neuroprotectores como: Naranjas (ricas en vitamina C, fortalecen el sistema inmune, 89%      " +
                                                  "\n del requerimiento diario por cada 100 g); Aguacate (fuente de vitamina E y ácidos grasos saludables, 14% de la ingesta    " +
                                                  "\n diaria por cada 100 g); Pescados grasos (salmón, atún), ricos en Omega-3, que ayudan a reducir la inflamación cerebral       " +
                                                  "\n (50% de la ingesta diaria por cada 100 g); Huevos (aportan colina, esencial para la función cognitiva, 27% del requerimiento " +
                                                  "\n diario por unidad); y Nueces (ricas en ácido alfa-linolénico, un tipo de Omega-3 vegetal, 91% por cada 30 g). Este es solo   " +
                                                  "\n un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que   " +
                                                  "\n las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para         " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface " +
                                                  "\n del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 a 3 litros de agua al día (diez a doce vasos de agua de tamaño regular)    " +
                                                  "\n para apoyar la función renal, facilitar la eliminación de toxinas derivadas del tratamiento y mantener la homeostasis   " +
                                                  "\n celular. En pacientes con cáncer, una hidratación adecuada también ayuda a reducir los efectos secundarios de la        " +
                                                  "\n quimioterapia como náuseas, fatiga y estreñimiento. EJERCICIO: Actividad física moderada y adaptada como caminatas,     " +
                                                  "\n ejercicios de bajo impacto o yoga suave puede mejorar la calidad de vida, reducir la fatiga y fortalecer el sistema     " +
                                                  "\n inmunológico. Es importante realizar una evaluación funcional previa para ajustar la intensidad del ejercicio según     " +
                                                  "\n el estado físico de la paciente. POSIBLE TRATAMIENTO: El tratamiento depende del tipo y estadio del cáncer, pero        " +
                                                  "\n puede incluir quimioterapia, radioterapia, inmunoterapia, cirugía y terapias dirigidas. En mujeres adultas mayores,     " +
                                                  "\n se realiza una valoración geriátrica integral para personalizar el tratamiento, considerando comorbilidades, estado     " +
                                                  "\n funcional y tolerancia a los fármacos. También se emplean terapias hormonales en ciertos tipos de cáncer como el de     " +
                                                  "\n mama, y se utilizan medicamentos de soporte como antieméticos, analgésicos y suplementos nutricionales para mejorar     " +
                                                  "\n la tolerancia al tratamiento. El acompañamiento psicológico y el seguimiento nutricional son claves para mantener la    " +
                                                  "\n adherencia terapéutica y la estabilidad emocional. ALIMENTACIÓN: Se recomienda una dieta rica en antioxidantes,         " +
                                                  "\n proteínas y grasas saludables como: Frutas cítricas (naranjas, toronjas), con vitamina C (89% por cada 100 g); Aguacate," +
                                                  "\n fuente de vitamina E y ácidos grasos monoinsaturados (14% por cada 100 g); Pescados grasos (salmón, sardina), ricos     " +
                                                  "\n en Omega-3 (50% por cada 100 g); Verduras de hoja verde (espinacas, acelgas), con vitamina A y hierro (56% y 15%        " +
                                                  "\n respectivamente por cada 100 g); Legumbres (lentejas, frijoles), con proteínas vegetales y hierro (37% por cada 100 g); " +
                                                  "\n y Frutos secos (almendras, nueces), con selenio y zinc, que apoyan la función inmune (45% y 30% respectivamente por     " +
                                                  "\n cada 30 g). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente  " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un    " +
                                                  "\n Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta " +
                                                  "\n del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la    " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.35-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la influenza es fundamental mantener una hidratación adecuada con un consumo diario    " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a fluidificar las         " +
                                                  "\n secreciones respiratorias y prevenir la deshidratación causada por la fiebre. EJERCICIO: Se recomienda actividad física    " +
                                                  "\n ligera como caminatas suaves dentro del hogar estiramientos o ejercicios de movilidad evitando esfuerzos intensos mientras " +
                                                  "\n persistan los síntomas. Una vez superada la fase aguda es recomendable realizar ejercicios de respiración profunda para    " +
                                                  "\n mejorar la oxigenación y prevenir la pérdida de masa muscular. POSIBLE TRATAMIENTO: El tratamiento suele incluir           " +
                                                  "\n medicamentos para reducir la fiebre y aliviar los síntomas como el paracetamol o el ibuprofeno y en casos más severos      " +
                                                  "\n los médicos pueden recetar antivirales específicos como el oseltamivir. Es importante seguir las indicaciones médicas      " +
                                                  "\n y evitar el uso de aspirina ya que puede generar complicaciones. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema        " +
                                                  "\n inmunológico y acelerar la recuperación se recomienda el consumo de NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda     " +
                                                  "\n a reducir la duración de los síntomas aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100       " +
                                                  "\n gramos. JENGIBRE: Contiene compuestos con propiedades antiinflamatorias y puede aliviar la congestión. MIEL Y LIMÓN:       " +
                                                  "\n Combinación efectiva para calmar la garganta y reducir la tos aportando flavonoides y vitamina C. ESPINACAS Y BRÓCOLI:     " +
                                                  "\n Aportan antioxidantes y vitamina A esenciales para la regeneración celular con un contenido de aproximadamente 56% de      " +
                                                  "\n la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probióticos que pueden fortalecer el sistema    " +
                                                  "\n inmunológico y mejorar la salud digestiva aportando calcio y proteínas esenciales. Este es solo un diagnóstico             " +
                                                  "\n predeterminado lógico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas  " +
                                                  "\n sean completamente correctas para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad " +
                                                  "\n en el tratamiento adecuado de su paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo se   " +
                                                  "\n le recomienda mucho consultar a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la neumonía es fundamental mantener una hidratación adecuada con un consumo        " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a              " +
                                                  "\n fluidificar las secreciones pulmonares y facilitar su expulsión. EJERCICIO: Se recomienda actividad física ligera      " +
                                                  "\n como caminatas lentas dentro del hogar ejercicios de respiración profunda y estiramientos suaves evitando esfuerzos    " +
                                                  "\n intensos mientras persistan los síntomas. Una vez superada la fase aguda es recomendable realizar fisioterapia         " +
                                                  "\n respiratoria y ejercicios de expansión pulmonar para mejorar la capacidad pulmonar y reducir la sensación de fatiga.   " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento suele incluir antibióticos como la amoxicilina la azitromicina o la ceftriaxona    " +
                                                  "\n y en casos más severos antivirales como el oseltamivir además de medicamentos para reducir la fiebre como el           " +
                                                  "\n paracetamol o el ibuprofeno. Es importante seguir las indicaciones médicas y evitar la automedicación. ALIMENTOS       " +
                                                  "\n RECOMENDADOS: Para fortalecer el sistema inmunológico y acelerar la recuperación se recomienda el consumo de NARANJAS  " +
                                                  "\n Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la duración de los síntomas aportando aproximadamente el 89% de    " +
                                                  "\n la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos con propiedades antiinflamatorias     " +
                                                  "\n y puede aliviar la congestión. ESPINACAS Y BRÓCOLI: Aportan antioxidantes y vitamina A esenciales para la regeneración " +
                                                  "\n celular con un contenido de aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL:   " +
                                                  "\n Contiene probióticos que pueden fortalecer el sistema inmunológico y mejorar la salud digestiva aportando calcio y     " +
                                                  "\n proteínas esenciales. Este es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza al 100% que    " +
                                                  "\n el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer     " +
                                                  "\n más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente además      " +
                                                  "\n por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico     " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la diabetes es fundamental mantener una hidratación adecuada con un consumo             " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a la                " +
                                                  "\n regulación de la glucosa en sangre y prevenir la deshidratación. EJERCICIO: Se recomienda actividad física regular          " +
                                                  "\n como caminatas suaves ejercicios de bajo impacto o natación para mejorar la sensibilidad a la insulina y controlar          " +
                                                  "\n los niveles de glucosa en sangre. Además se recomienda la práctica de ejercicios aeróbicos como bicicleta estática          " +
                                                  "\n o baile al menos 150 minutos por semana para mejorar la función cardiovascular y reducir el riesgo de complicaciones.       " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento suele incluir medicamentos como la metformina para mejorar la sensibilidad a la         " +
                                                  "\n insulina y en casos más severos insulina de acción rápida o prolongada además de medicamentos para controlar la presión     " +
                                                  "\n arterial y el colesterol. Es importante seguir las indicaciones médicas y mantener un monitoreo constante de los niveles    " +
                                                  "\n de glucosa. ALIMENTOS RECOMENDADOS: Para fortalecer el metabolismo y mejorar el control de la glucosa se recomienda el      " +
                                                  "\n consumo de FRUTOS ROJOS: Ricos en antioxidantes y fibra que ayudan a regular la glucosa en sangre aportando aproximadamente " +
                                                  "\n el 32% de la ingesta diaria recomendada por cada 100 gramos. FRUTOS SECOS: Contienen grasas saludables y fibra que pueden   " +
                                                  "\n mejorar la sensibilidad a la insulina aportando aproximadamente el 25% de la ingesta diaria recomendada por cada 100 gramos." +
                                                  "\n ESPINACAS Y BRÓCOLI: Aportan antioxidantes y vitamina A esenciales para la regeneración celular con un contenido de     " +
                                                  "\n aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos. AVENA: Rica en fibra soluble que ayuda a      " +
                                                  "\n estabilizar los niveles de glucosa en sangre aportando aproximadamente el 40% de la ingesta diaria recomendada por      " +
                                                  "\n cada 100 gramos. Este es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza al 100% que el       " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer más     " +
                                                  "\n de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente además por su    " +
                                                  "\n salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico Angel L     " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2 a 2.5 litros de agua al día (ocho a diez vasos de agua de tamaño regular   " +
                                                  "\n para mantener las vías respiratorias hidratadas, facilitar la eliminación de secreciones y reducir la inflamación     " +
                                                  "\n bronquial. En mujeres adultas mayores, una hidratación constante también ayuda a prevenir la sequedad de mucosas y    " +
                                                  "\n mejora la función pulmonar general. EJERCICIO: Actividad física moderada como caminatas suaves, ejercicios de         " +
                                                  "\n respiración y estiramientos controlados puede mejorar la capacidad pulmonar y reducir la frecuencia de las crisis     " +
                                                  "\n asmáticas. Es importante evitar ambientes fríos o contaminados y realizar calentamiento previo para prevenir la       " +
                                                  "\n broncoconstricción inducida por el ejercicio. POSIBLE TRATAMIENTO: El tratamiento incluye broncodilatadores de acción " +
                                                  "\n rápida como Salbutamol (Ventolin, Aerolin), corticosteroides inhalados como Fluticasona o Budesonida (Flixotide,      " +
                                                  "\n Pulmicort), y en algunos casos, modificadores de leucotrienos como Montelukast (Singulair). En mujeres adultas mayores, " +
                                                  "\n es esencial revisar la técnica de inhalación, ajustar las dosis para evitar efectos secundarios como temblores o      " +
                                                  "\n taquicardia, y considerar el uso de espaciadores para mejorar la administración del medicamento. ALIMENTACIÓN: Se     " +
                                                  "\n sugiere el consumo de alimentos antiinflamatorios y antioxidantes como: Pescados grasos (salmón, atún), ricos en      " +
                                                  "\n Omega-3, que ayudan a reducir la inflamación de las vías respiratorias (50% de la ingesta diaria recomendada por      " +
                                                  "\n cada 100 g); Frutas cítricas (naranjas, toronjas), con vitamina C que fortalece el sistema inmune (89% por cada       " +
                                                  "\n 100 g); Espinacas (ricas en vitamina A y magnesio, esenciales para la función pulmonar, con 56% y 20% respectivamente " +
                                                  "\n por cada 100 g); Jengibre y cúrcuma, con propiedades antiinflamatorias naturales. Este es solo un diagnóstico     " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las   " +
                                                  "\n respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para  " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no   " +
                                                  "\n le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida)  " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 litros de agua al día (diez vasos de agua de tamaño regular) para          " +
                                                  "\n apoyar la función renal, facilitar la eliminación de toxinas y mantener el equilibrio electrolítico, especialmente      " +
                                                  "\n importante en pacientes que toman múltiples medicamentos. También se sugiere incluir infusiones antioxidantes como      " +
                                                  "\n té verde o rooibos. EJERCICIO: Actividad física moderada como caminatas, yoga suave o ejercicios de bajo impacto        " +
                                                  "\n puede mejorar la masa muscular, reducir el estrés y fortalecer el sistema inmunológico. Es importante adaptar la        " +
                                                  "\n rutina a la condición física de la paciente y evitar el sobreesfuerzo. POSIBLE TRATAMIENTO: El tratamiento estándar     " +
                                                  "\n es la terapia antirretroviral (TAR), que combina medicamentos como Tenofovir, Emtricitabina, Efavirenz (Atripla),       " +
                                                  "\n Dolutegravir (Tivicay) y Lamivudina (Epivir). En mujeres adultas mayores, es crucial monitorear la función hepática     " +
                                                  "\n y renal, así como posibles interacciones con otros medicamentos para enfermedades crónicas. También se recomienda el    " +
                                                  "\n seguimiento de la densidad ósea, ya que algunos antirretrovirales pueden afectar el metabolismo del calcio. El          " +
                                                  "\n acompañamiento psicológico y el control nutricional son fundamentales para mantener la adherencia terapéutica y la      " +
                                                  "\n calidad de vida. ALIMENTACIÓN: Se recomienda una dieta rica en nutrientes inmunoestimulantes como: Frutas cítricas      " +
                                                  "\n (naranjas, limones), con vitamina C (89% por cada 100 g); Aguacate, fuente de vitamina E y ácidos grasos monoinsaturados" +
                                                  "\n (14% por cada 100 g); Pescados grasos (salmón, sardina), ricos en Omega-3 (50% por cada 100 g); Verduras de hoja verde    " +
                                                  "\n (espinacas, acelgas), con vitamina A y hierro (56% y 15% respectivamente por cada 100 g); Legumbres (lentejas, frijoles), " +
                                                  "\n con proteínas vegetales y hierro (37% por cada 100 g). Este es solo un diagnóstico predeterminado lógico, haberlo         " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. " +
                                                  "\n Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento  " +
                                                  "\n adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a   " +
                                                  "\n su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2 a 2.5 litros de agua al día (ocho a diez vasos de agua de tamaño regular)     " +
                                                  "\n para facilitar la eliminación de toxinas y mantener la función renal, especialmente importante durante el tratamiento    " +
                                                  "\n antibiótico. También se sugiere el consumo de jugos naturales sin azúcar para aportar antioxidantes. EJERCICIO:          " +
                                                  "\n Actividad física ligera como caminatas o estiramientos suaves puede ayudar a mejorar la circulación y fortalecer         " +
                                                  "\n el sistema inmune. Se debe evitar el ejercicio intenso durante el tratamiento para no comprometer la recuperación.       " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento incluye antibióticos como Ceftriaxona (inyección única) y Azitromicina (dosis oral). " +
                                                  "\n En mujeres adultas mayores, es importante vigilar posibles efectos secundarios gastrointestinales y ajustar la dosis en  " +
                                                  "\n caso de insuficiencia renal. También se recomienda realizar pruebas de seguimiento para confirmar la erradicación de la  " +
                                                  "\n bacteria y evitar reinfecciones. En casos resistentes, puede ser necesario el uso de combinaciones antibióticas o        " +
                                                  "\n tratamientos prolongados. ALIMENTACIÓN: Se recomienda una dieta que apoye la función inmunológica y la recuperación,     " +
                                                  "\n incluyendo: Naranjas (ricas en vitamina C, 89% por cada 100 g); Espinacas (fuente de hierro y ácido fólico, 56% y 49%    " +
                                                  "\n respectivamente por cada 100 g); Yogur natural (rico en probióticos y calcio, 30% de la ingesta diaria recomendada por   " +
                                                  "\n cada 100 g); Ajo (con propiedades antibacterianas naturales); y Zanahorias (ricas en vitamina A, 93% por cada 100 g),    " +
                                                  "\n que ayudan a mantener la integridad de las mucosas. Este es solo un diagnóstico predeterminado lógico, haberlo consultado " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, " +
                                                  "\n se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado.       " +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.      " +
                                                  "\n Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una           " +
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales.            " +
                                                  "\n EJERCICIO. Se recomienda actividad física moderada como caminatas suaves, yoga o ejercicios de estiramiento           " +
                                                  "\n de bajo impacto durante 30 minutos al día, cinco veces por semana, para fortalecer el sistema inmunológico y          " +
                                                  "\n reducir el estrés, ya que el estrés puede desencadenar brotes. También es útil incorporar ejercicios de                  " +
                                                  "\n respiración profunda y meditación para mejorar la respuesta del cuerpo ante el virus. HIDRATACIÓN. Se aconseja           " +
                                                  "\n consumir entre 2 y 2.5 litros de agua al día para mantener la piel y las mucosas hidratadas, lo cual ayuda a             " +
                                                  "\n reducir la irritación y prevenir brotes. Además, se recomienda evitar bebidas con cafeína o alcohol, ya que pueden       " +
                                                  "\n favorecer la deshidratación. Infusiones suaves como manzanilla o té verde pueden ser beneficiosas por sus propiedades    " +
                                                  "\n antiinflamatorias y antioxidantes. POSIBLE TRATAMIENTO. El tratamiento para el herpes genital incluye antivirales        " +
                                                  "\n como aciclovir, famciclovir y valaciclovir, que ayudan a reducir la duración y frecuencia de los brotes. Marcas          " +
                                                  "\n reconocidas incluyen Zovirax y Valtrex. En casos de recurrencias frecuentes, se puede considerar terapia supresiva       " +
                                                  "\n diaria. También se recomienda el uso de cremas tópicas con lidocaína o aloe vera para aliviar el malestar local.         " +
                                                  "\n ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica en lisina y antioxidantes para fortalecer el sistema inmunológico." +
                                                  "\n Algunos alimentos clave incluyen yogur natural y leche, ricos en lisina, que inhibe la replicación del virus. Frutas     " +
                                                  "\n cítricas como naranja y kiwi, ricas en vitamina C, que fortalecen el sistema inmune, aportando aproximadamente el 89%    " +
                                                  "\n del requerimiento diario por cada 100 gramos. Verduras como espinaca y zanahoria, ricas en vitamina A, que contribuyen   " +
                                                  "\n a la regeneración celular y fortalecen las mucosas, con un aporte del 15% del requerimiento diario por cada 100 gramos.  " +
                                                  "\n Este diagnóstico es una referencia lógica basada en información médica, pero no garantiza al 100% que el paciente tenga  " +
                                                  "\n herpes genital ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un      " +
                                                  "\n médico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una          " +
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales.           " +
                                                  "\n EJERCICIO. Se recomienda actividad física moderada como caminatas diarias de 30 minutos, ejercicios de movilidad     " +
                                                  "\n articular y estiramientos suaves para mejorar la circulación, mantener la masa muscular y fortalecer el sistema      " +
                                                  "\n inmunológico. También es beneficioso incluir ejercicios de equilibrio y coordinación para prevenir caídas.           " +
                                                  "\n HIDRATACIÓN. Se aconseja consumir entre 2 y 2.5 litros de agua al día para ayudar a eliminar toxinas del cuerpo,     " +
                                                  "\n mantener la función renal y apoyar el metabolismo durante el tratamiento antibiótico. También se recomienda el       " +
                                                  "\n consumo de caldos naturales y jugos de frutas sin azúcar añadida para mantener el equilibrio de electrolitos.        " +
                                                  "\n POSIBLE TRATAMIENTO. El tratamiento estándar para la sífilis incluye antibióticos como penicilina G benzatina,       " +
                                                  "\n doxiciclina o ceftriaxona. Marcas reconocidas incluyen Benzetacil y Doxiciclina. En pacientes alérgicos a la         " +
                                                  "\n penicilina, se utilizan alternativas como la doxiciclina por vía oral durante 14 días. Es fundamental completar el   " +
                                                  "\n tratamiento para evitar complicaciones como neurosífilis o daño cardiovascular. ALIMENTACIÓN RECOMENDADA. Se         " +
                                                  "\n recomienda una dieta rica en proteínas, vitaminas y minerales para fortalecer el sistema inmunológico. Algunos       " +
                                                  "\n alimentos clave incluyen carnes magras y pescado, fuentes de proteínas esenciales. Frutas cítricas como naranja y    " +
                                                  "\n limón, ricas en vitamina C, que ayudan a la recuperación y fortalecimiento del sistema inmune, aportando el 89% del  " +
                                                  "\n requerimiento diario por cada 100 gramos. Verduras de hoja verde como espinaca y brócoli, que contienen hierro y     " +
                                                  "\n antioxidantes esenciales para la producción de glóbulos rojos, con un aporte del 15% del requerimiento diario por    " +
                                                  "\n cada 100 gramos. Ajo y cebolla, con compuestos antimicrobianos naturales que pueden apoyar el tratamiento. Este      " +
                                                  "\n diagnóstico es una referencia lógica basada en información médica, pero no garantiza al 100% que el paciente tenga   " +
                                                  "\n sífilis ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico  " +
                                                  "\n para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidratación     " +
                                                  "\n óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda     " +
                                                  "\n actividad física moderada como caminatas suaves, ejercicios de respiración profunda y yoga terapéutico para fortalecer      " +
                                                  "\n los pulmones, mejorar la oxigenación y reducir la fatiga. También es útil realizar ejercicios de movilidad articular y      " +
                                                  "\n estiramientos para mantener la flexibilidad y prevenir la pérdida de masa muscular. HIDRATACIÓN. Se aconseja consumir       " +
                                                  "\n entre 2.5 y 3 litros de agua al día para mantener las vías respiratorias hidratadas, facilitar la eliminación de toxinas    " +
                                                  "\n y apoyar la función renal durante el tratamiento. También se recomienda el consumo de caldos ricos en minerales y jugos     " +
                                                  "\n naturales con alto contenido de vitamina C. POSIBLE TRATAMIENTO. El tratamiento estándar para la tuberculosis incluye       " +
                                                  "\n una combinación de antibióticos como isoniazida, rifampicina, etambutol y pirazinamida durante un período de al menos       " +
                                                  "\n seis meses. Marcas reconocidas incluyen Rifater y Rimactane. Es fundamental seguir el tratamiento completo y bajo           " +
                                                  "\n supervisión médica para evitar recaídas o resistencia bacteriana. En adultos mayores, se debe ajustar la dosis en caso      " +
                                                  "\n de insuficiencia renal o hepática y monitorear posibles efectos secundarios. ALIMENTACIÓN RECOMENDADA. Se recomienda una    " +
                                                  "\n dieta rica en proteínas, vitaminas y minerales para fortalecer el sistema inmunológico y apoyar la recuperación. Algunos    " +
                                                  "\n alimentos clave incluyen carnes magras y pescado, fuentes de proteínas esenciales. Frutas cítricas como naranja y kiwi,     " +
                                                  "\n ricas en vitamina C, que ayudan a la recuperación y fortalecimiento del sistema inmune, aportando el 89% del requerimiento  " +
                                                  "\n diario por cada 100 gramos. Verduras de hoja verde como espinaca y brócoli, que contienen hierro y antioxidantes esenciales " +
                                                  "\n para la producción de glóbulos rojos, con un aporte del 15% del requerimiento diario por cada 100 gramos. Frutos secos como " +
                                                  "\n almendras y nueces, ricos en vitamina E y ácidos grasos esenciales, que fortalecen el sistema inmunológico y aportan el 37% " +
                                                  "\n del requerimiento diario por cada 28 gramos. Este diagnóstico es una referencia lógica basada en información médica, pero   " +
                                                  "\n no garantiza al 100% que el paciente tenga tuberculosis ni que el tratamiento sea el adecuado. Se recomienda realizar más   " +
                                                  "\n de un diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera" +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n La artritis es una inflamación crónica de las articulaciones que puede provocar dolor, rigidez y pérdida de       " +
                                                  "\n movilidad, siendo la osteoartritis la forma más común en la adultez mayor, especialmente en rodillas, caderas     " +
                                                  "\n y manos. EJERCICIO. Se recomienda actividad física moderada y adaptada a las capacidades de la persona, como      " +
                                                  "\n caminatas suaves, ejercicios acuáticos o yoga terapéutico, que ayudan a mantener la flexibilidad, reducir la      " +
                                                  "\n rigidez y fortalecer los músculos que rodean las articulaciones. También es útil realizar ejercicios de bajo      " +
                                                  "\n impacto con apoyo, como bicicleta estática o estiramientos guiados. HIDRATACIÓN. Es fundamental consumir entre    " +
                                                  "\n 2 y 2.5 litros de agua al día para mantener la lubricación de las articulaciones, facilitar la eliminación de     " +
                                                  "\n toxinas y reducir la inflamación. Se sugiere complementar con infusiones de cúrcuma o jengibre, que poseen        " +
                                                  "\n propiedades antiinflamatorias naturales. POSIBLE TRATAMIENTO. El tratamiento puede incluir medicamentos           " +
                                                  "\n antiinflamatorios no esteroides como ibuprofeno o naproxeno, corticosteroides en casos más severos, y fármacos     " +
                                                  "\n modificadores de la enfermedad como el metotrexato. También se recomienda fisioterapia, terapia ocupacional y en   " +
                                                  "\n algunos casos el uso de suplementos como glucosamina y condroitina para mejorar la salud articular. ALIMENTACIÓN   " +
                                                  "\n RECOMENDADA. Consumir alimentos ricos en antioxidantes y ácidos grasos esenciales. Pescados grasos como salmón y     " +
                                                  "\n sardina, ricos en ácidos grasos Omega-3, que ayudan a reducir la inflamación articular, aportando hasta el 90% del   " +
                                                  "\n requerimiento diario por cada 100 g. Frutas como arándanos y fresas, ricas en vitamina C y antioxidantes, que        " +
                                                  "\n fortalecen el sistema inmunológico y reducen el daño celular, aportando cerca del 70% del requerimiento diario por   " +
                                                  "\n cada 100 g. Verduras de hoja verde como espinaca y kale, que contienen hierro, calcio y vitamina K, esenciales para  " +
                                                  "\n la salud ósea y articular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%" +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se        " +
                                                  "\n recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su      " +
                                                  "\n paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar " +
                                                  "\n a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n La tosferina, o pertussis, es una infección bacteriana que afecta las vías respiratorias y puede causar tos           " +
                                                  "\n intensa y prolongada. En adultos mayores, puede ser más severa y provocar complicaciones respiratorias.               " +
                                                  "\n EJERCICIO. Se recomienda actividad física ligera, como caminatas cortas o ejercicios de respiración profunda,         " +
                                                  "\n para mejorar la oxigenación sin agotar al paciente. Es importante evitar ambientes fríos o contaminados que           " +
                                                  "\n puedan agravar los síntomas. HIDRATACIÓN. Es fundamental consumir entre 2 y 2.5 litros de agua al día para            " +
                                                  "\n mantener las vías respiratorias hidratadas y facilitar la eliminación de mucosidad. También se recomienda el          " +
                                                  "\n consumo de líquidos tibios como infusiones de jengibre o té de manzanilla para aliviar la garganta. POSIBLE           " +
                                                  "\n TRATAMIENTO. El tratamiento incluye antibióticos como azitromicina, claritromicina o eritromicina, que ayudan         " +
                                                  "\n a eliminar la bacteria. En casos con dificultad respiratoria, pueden utilizarse broncodilatadores. Se recomienda      " +
                                                  "\n reposo y aislamiento durante los primeros días para evitar contagios. ALIMENTACIÓN RECOMENDADA. Consumir              " +
                                                  "\n alimentos que fortalezcan el sistema respiratorio. Frutas cítricas como naranja y toronja, ricas en vitamina C,       " +
                                                  "\n que ayudan a reducir la duración de los síntomas, aportando hasta el 89% del requerimiento diario por cada 100 g.     " +
                                                  "\n Miel, con propiedades antimicrobianas y calmantes para la garganta. Jengibre, con efectos antiinflamatorios que       " +
                                                  "\n pueden aliviar la tos. Yogur natural, fuente de probióticos que fortalecen la flora intestinal y el sistema inmune.   " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga      " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de    " +
                                                  "\n un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su    " +
                                                  "\n salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Ángel    " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Las paperas son una infección viral que afecta las glándulas salivales, causando inflamación y dolor en la            " +
                                                  "\n zona de la mandíbula. En adultos mayores, pueden presentarse síntomas más intensos y riesgo de complicaciones.        " +
                                                  "\n EJERCICIO. Se recomienda actividad física ligera mientras persistan los síntomas, como estiramientos suaves o         " +
                                                  "\n caminatas cortas, evitando esfuerzos que puedan aumentar la inflamación. HIDRATACIÓN. Es fundamental consumir         " +
                                                  "\n entre 2 y 2.5 litros de agua al día para ayudar al cuerpo a combatir la infección y mantenerse hidratado. Se          " +
                                                  "\n sugiere complementar con líquidos suaves como caldos o infusiones de manzanilla. POSIBLE TRATAMIENTO. No existe       " +
                                                  "\n un tratamiento antiviral específico para las paperas. Se recomienda el uso de paracetamol para aliviar la fiebre      " +
                                                  "\n y el dolor, evitando el ibuprofeno y la aspirina. También se sugiere el uso de compresas frías en la zona inflamada   " +
                                                  "\n y reposo absoluto durante los primeros días. ALIMENTACIÓN RECOMENDADA. Consumir alimentos blandos y ricos en          " +
                                                  "\n nutrientes. Frutas cítricas como naranja y mandarina, ricas en vitamina C, que fortalecen el sistema inmunológico,    " +
                                                  "\n aportando hasta el 89% del requerimiento diario por cada 100 g. Yogur natural, fuente de probióticos que ayudan a     " +
                                                  "\n mantener la flora intestinal. Verduras de hoja verde como espinaca, que aportan hierro y antioxidantes esenciales     " +
                                                  "\n para la recuperación. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%      " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se      " +
                                                  "\n recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su    " +
                                                  "\n paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho         " +
                                                  "\n consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n EJERCICIO: Durante la infección por el virus del Zika se recomienda evitar cualquier esfuerzo físico intenso     " +
                                                  "\n y priorizar el descanso absoluto, ya que el sistema inmunológico necesita conservar energía para combatir el     " +
                                                  "\n virus. Una vez que los síntomas disminuyen, se pueden realizar ejercicios suaves como caminatas lentas o         " +
                                                  "\n estiramientos ligeros para mejorar la circulación y reducir la rigidez muscular. También es útil practicar       " +
                                                  "\n ejercicios de respiración profunda para mejorar la oxigenación celular y reducir la inflamación. HIDRATACIÓN:    " +
                                                  "\n Es fundamental consumir al menos 2.5 litros de agua al día para prevenir la deshidratación, regular la           " +
                                                  "\n temperatura corporal y facilitar la eliminación de toxinas. También se recomienda el consumo de caldos           " +
                                                  "\n naturales, infusiones como té de jengibre o manzanilla, y jugos naturales sin azúcar añadida, que además         " +
                                                  "\n de hidratar aportan antioxidantes y alivian síntomas como el dolor muscular y la fiebre. POSIBLE TRATAMIENTO:    " +
                                                  "\n No existe un tratamiento antiviral específico para el Zika, pero los síntomas pueden aliviarse con reposo,       " +
                                                  "\n hidratación constante y medicamentos como el acetaminofén para reducir la fiebre y el dolor. Es importante       " +
                                                  "\n evitar el uso de aspirina y otros antiinflamatorios no esteroideos hasta descartar la posibilidad de dengue,     " +
                                                  "\n para reducir el riesgo de hemorragias. También se recomienda evitar el consumo de alcohol y tabaco durante la    " +
                                                  "\n recuperación, ya que pueden debilitar el sistema inmunológico. ALIMENTACIÓN: Se recomienda el consumo de         " +
                                                  "\n alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico, tales como     " +
                                                  "\n frutas cítricas como naranjas y toronjas, que aportan vitamina C en un 89% de la ingesta diaria recomendada,     " +
                                                  "\n ayudando a combatir infecciones. Verduras de hoja verde como espinacas y acelgas, que aportan hasta un 50% de    " +
                                                  "\n la ingesta diaria recomendada de vitamina A y K, esenciales para la regeneración celular. Jengibre y cúrcuma,    " +
                                                  "\n que poseen propiedades antiinflamatorias y antioxidantes, contribuyendo con hasta un 40% de la ingesta diaria    " +
                                                  "\n recomendada de compuestos bioactivos beneficiosos para la salud. este es solo un diagnóstico predeterminado      " +
                                                  "\n lógico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas      " +
                                                  "\n sean completamente correctas. se recomienda realizar más de un diagnóstico para mayor seguridad en el            " +
                                                  "\n tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se         " +
                                                  "\n recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n EJERCICIO: Durante la infección por rotavirus se recomienda evitar cualquier tipo de esfuerzo físico y priorizar      " +
                                                  "\n el descanso absoluto, ya que la pérdida de líquidos y nutrientes puede provocar debilidad extrema. Una vez superada   " +
                                                  "\n la fase aguda, se pueden realizar ejercicios suaves como caminatas lentas o estiramientos para estimular la           " +
                                                  "\n circulación y recuperar la energía. También es recomendable realizar ejercicios de respiración para mejorar la        " +
                                                  "\n oxigenación celular y reducir la fatiga. HIDRATACIÓN: Es crucial el consumo de al menos 2.5 litros de agua al día     " +
                                                  "\n para prevenir la deshidratación causada por la diarrea y los vómitos. También se recomienda el uso de soluciones de   " +
                                                  "\n rehidratación oral que contienen electrolitos esenciales como sodio, potasio y glucosa, los cuales ayudan a           " +
                                                  "\n restablecer el equilibrio hídrico y energético del cuerpo. El consumo de caldos naturales y jugos suaves sin          " +
                                                  "\n azúcar también puede ser beneficioso. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral específico para         " +
                                                  "\n el rotavirus, pero los síntomas pueden aliviarse con hidratación intensiva, reposo y una dieta adecuada. Se deben     " +
                                                  "\n evitar los medicamentos antidiarreicos, ya que pueden prolongar la infección. En casos graves, puede ser necesaria    " +
                                                  "\n la administración de líquidos por vía intravenosa. También se recomienda el consumo de probióticos para restaurar     " +
                                                  "\n la flora intestinal. ALIMENTACIÓN: Se recomienda el consumo de alimentos que favorezcan la recuperación del sistema   " +
                                                  "\n digestivo, tales como yogur natural, que contiene probióticos beneficiosos para la flora intestinal. Frutas como      " +
                                                  "\n plátanos y manzanas, que aportan fibra soluble y ayudan a regular el tránsito intestinal. Verduras como zanahorias    " +
                                                  "\n y calabacines, que contienen antioxidantes y vitaminas esenciales como la vitamina A y el potasio, aportando hasta    " +
                                                  "\n un 50% de la ingesta diaria recomendada, fundamentales para la regeneración de la mucosa intestinal. este es solo     " +
                                                  "\n un diagnóstico predeterminado lógico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad   " +
                                                  "\n ni que las respuestas sean completamente correctas. se recomienda realizar más de un diagnóstico para mayor seguridad " +
                                                  "\n en el tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se        " +
                                                  "\n recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n EJERCICIO: Durante la infección por listeria se recomienda evitar esfuerzos físicos intensos y priorizar el descanso,    " +
                                                  "\n ya que el cuerpo necesita conservar energía para combatir la bacteria. Una vez que los síntomas disminuyen, se pueden    " +
                                                  "\n realizar ejercicios suaves como caminatas lentas o ejercicios de respiración para mejorar la oxigenación celular y       " +
                                                  "\n reducir la fatiga. También es importante mantener una rutina de movilidad ligera para prevenir la rigidez muscular y     " +
                                                  "\n mejorar la circulación. HIDRATACIÓN: Es fundamental consumir al menos 2.5 litros de agua al día para ayudar a eliminar   " +
                                                  "\n toxinas y mantener el equilibrio de los fluidos corporales. También se recomienda el consumo de caldos naturales,        " +
                                                  "\n infusiones suaves y jugos sin azúcar para aportar electrolitos esenciales. La hidratación adecuada contribuye a la       " +
                                                  "\n eliminación de bacterias a través de la orina y mejora la función renal, lo cual es clave durante una infección          " +
                                                  "\n bacteriana. POSIBLE TRATAMIENTO: La infección por listeria se trata con antibióticos como ampicilina o gentamicina,      " +
                                                  "\n especialmente en casos graves o en pacientes inmunocomprometidos. En adultos mayores, el tratamiento debe iniciarse      " +
                                                  "\n lo antes posible para evitar complicaciones como septicemia o meningitis. También se recomienda evitar alimentos de      " +
                                                  "\n alto riesgo como productos lácteos no pasteurizados, embutidos y pescados ahumados durante la recuperación. ALIMENTACIÓN:" +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema        " +
                                                  "\n inmunológico, tales como frutas cítricas como naranjas y toronjas, que aportan vitamina C en un 89% de la ingesta      " +
                                                  "\n diaria recomendada, ayudando a combatir infecciones. Verduras de hoja verde como espinacas y acelgas, que aportan      " +
                                                  "\n hasta un 50% de la ingesta diaria recomendada de vitamina A y K, esenciales para la regeneración celular. Frutos       " +
                                                  "\n secos como almendras y nueces, que contienen vitamina E y magnesio, contribuyendo con hasta un 40% de la ingesta       " +
                                                  "\n diaria recomendada de estos nutrientes esenciales para la recuperación neurológica. este es solo un diagnóstico        " +
                                                  "\n predeterminado lógico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las        " +
                                                  "\n respuestas sean completamente correctas. se recomienda realizar más de un diagnóstico para mayor seguridad en el       " +
                                                  "\n tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda    " +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la shigelosis es fundamental mantener una hidratación adecuada con un consumo    " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para reponer los         " +
                                                  "\n líquidos perdidos por la diarrea y prevenir la deshidratación. EJERCICIO: Se recomienda actividad física ligera      " +
                                                  "\n como caminatas suaves dentro del hogar o ejercicios de movilidad articular evitando esfuerzos intensos mientras      " +
                                                  "\n persistan los síntomas. Una vez superada la fase aguda es recomendable realizar ejercicios de fortalecimiento        " +
                                                  "\n progresivo para recuperar energía y mejorar la función digestiva. POSIBLE TRATAMIENTO: El tratamiento suele incluir  " +
                                                  "\n antibióticos como la ciprofloxacina o la azitromicina y en casos más severos ceftriaxona. Es importante evitar       " +
                                                  "\n medicamentos antidiarreicos sin indicación médica ya que pueden empeorar la eliminación de la bacteria. ALIMENTOS    " +
                                                  "\n RECOMENDADOS: Para fortalecer el sistema digestivo y acelerar la recuperación se recomienda el consumo de PLÁTANOS:  " +
                                                  "\n Ricos en potasio que ayuda a reemplazar los electrolitos perdidos debido a la diarrea aportando aproximadamente el   " +
                                                  "\n 12% de la ingesta diaria recomendada por cada 100 gramos. ARROZ BLANCO: Fuente de carbohidratos de fácil digestión   " +
                                                  "\n que ayuda a estabilizar el sistema digestivo. ZANAHORIAS: Ricas en vitamina A y antioxidantes que ayudan a la        " +
                                                  "\n regeneración celular aportando aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR  " +
                                                  "\n NATURAL: Contiene probióticos que pueden fortalecer el sistema digestivo y mejorar la salud intestinal aportando   " +
                                                  "\n calcio y proteínas esenciales. Este es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza   " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se      " +
                                                  "\n recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de    " +
                                                  "\n su paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho    " +
                                                  "\n consultar a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la EPOC es fundamental mantener una hidratación adecuada con un consumo               " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a                 " +
                                                  "\n mantener las vías respiratorias hidratadas y facilitar la expulsión de mucosidad. EJERCICIO: Se recomienda                " +
                                                  "\n actividad física ligera como caminatas lentas ejercicios de respiración profunda y estiramientos suaves para              " +
                                                  "\n mejorar la oxigenación y la capacidad pulmonar. Además se recomienda la práctica de ejercicios de fortalecimiento         " +
                                                  "\n muscular y fisioterapia respiratoria adaptada a la capacidad del paciente para mantener la funcionalidad y prevenir       " +
                                                  "\n la pérdida de masa muscular. POSIBLE TRATAMIENTO: El tratamiento suele incluir broncodilatadores de acción rápida         " +
                                                  "\n como el salbutamol corticosteroides inhalados como la fluticasona y en algunos casos terapia con oxígeno. Es fundamental  " +
                                                  "\n seguir estrictamente el plan de acción indicado por el médico y evitar la exposición a contaminantes ambientales.         " +
                                                  "\n ALIMENTOS RECOMENDADOS: Para fortalecer el sistema respiratorio y reducir la inflamación se recomienda el consumo         " +
                                                  "\n de PESCADOS GRASOS: Salmón y atún ricos en ácidos grasos Omega-3 que poseen propiedades antiinflamatorias que pueden      " +
                                                  "\n ayudar a reducir la inflamación de las vías respiratorias aportando aproximadamente el 50% de la ingesta diaria           " +
                                                  "\n recomendada por cada 100 gramos. FRUTAS Y VERDURAS DE COLORES VIVOS: Arándanos fresas espinacas brócoli ricos en          " +
                                                  "\n antioxidantes como la vitamina C y carotenoides que pueden proteger las células del daño y fortalecer el sistema          " +
                                                  "\n inmunológico aportando aproximadamente el 70% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene    " +
                                                  "\n compuestos con efectos antiinflamatorios que podrían ser beneficiosos para las vías respiratorias. CÚRCUMA: Con su        " +
                                                  "\n componente activo la curcumina también tiene potentes propiedades antiinflamatorias y antioxidantes. Este es solo un      " +
                                                  "\n diagnóstico predeterminado lógico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que    " +
                                                  "\n las respuestas sean completamente correctas para ello se recomienda hacer más de un Diagnóstico de Mi Vida para           " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente además por su salud si la respuesta del Diagnóstico  " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su médico Angel L Montes agradece tu visita a la app          " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la clamidia es fundamental mantener una hidratación adecuada con un consumo        " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a la           " +
                                                  "\n eliminación de toxinas y fortalecer el sistema inmunológico. EJERCICIO: Se recomienda actividad física moderada        " +
                                                  "\n como caminatas ejercicios de bajo impacto o natación para mejorar la circulación sanguínea y fortalecer el sistema     " +
                                                  "\n inmunológico. Además se recomienda la práctica de ejercicios de relajación como yoga o meditación para reducir el      " +
                                                  "\n estrés que puede afectar la respuesta inmunológica. POSIBLE TRATAMIENTO: El tratamiento suele incluir antibióticos     " +
                                                  "\n como la azitromicina en dosis única o la doxiciclina durante 7 días y en casos más severos levofloxacina. Es           " +
                                                  "\n fundamental seguir estrictamente el tratamiento indicado por el médico y evitar la automedicación. ALIMENTOS           " +
                                                  "\n RECOMENDADOS: Para fortalecer el sistema inmunológico y acelerar la recuperación se recomienda el consumo de FRUTOS    " +
                                                  "\n ROJOS: Ricos en antioxidantes y vitamina C que ayudan a fortalecer el sistema inmunológico aportando aproximadamente   " +
                                                  "\n el 70% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos con propiedades             " +
                                                  "\n antiinflamatorias y puede ayudar a reducir la inflamación. ESPINACAS Y BRÓCOLI: Aportan antioxidantes y vitamina A     " +
                                                  "\n esenciales para la regeneración celular con un contenido de aproximadamente 56% de la ingesta diaria recomendada por     " +
                                                  "\n cada 100 gramos. YOGUR NATURAL: Contiene probióticos que pueden fortalecer el sistema inmunológico y mejorar la salud    " +
                                                  "\n digestiva aportando calcio y proteínas esenciales. Este es solo un diagnóstico predeterminado lógico haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello  " +
                                                  "\n se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su    " +
                                                  "\n paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar   " +
                                                  "\n a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 a 3 litros de agua al día (diez a doce vasos de agua de tamaño regular)          " +
                                                  "\n para mantener la función cerebral, facilitar la eliminación de toxinas y apoyar el sistema inmunológico. En mujeres           " +
                                                  "\n adultas mayores, una hidratación constante también ayuda a prevenir la deshidratación, que puede agravar los síntomas         " +
                                                  "\n neurológicos y aumentar el riesgo de complicaciones. EJERCICIO: Actividad física ligera como caminatas suaves, ejercicios     " +
                                                  "\n de respiración y estiramientos controlados puede mejorar la circulación cerebral y reducir la rigidez muscular. Es            " +
                                                  "\n importante evitar el esfuerzo excesivo y priorizar el descanso durante la fase aguda de la enfermedad. Una vez estabilizada,  " +
                                                  "\n se recomienda incorporar rutinas de movilidad para prevenir el deterioro funcional y mantener la autonomía. POSIBLE           " +
                                                  "\n TRATAMIENTO: El tratamiento inmediato incluye antibióticos intravenosos de amplio espectro como Ceftriaxona, Cefotaxima o     " +
                                                  "\n Ampicilina, ajustados según el microorganismo identificado. También se administran corticosteroides como la Dexametasona      " +
                                                  "\n para reducir la inflamación cerebral y prevenir complicaciones como pérdida auditiva o convulsiones. En casos graves,         " +
                                                  "\n puede requerirse hospitalización prolongada, monitoreo neurológico intensivo y el uso de anticonvulsivos si se presentan      " +
                                                  "\n crisis. Además, se recomienda el seguimiento con evaluaciones cognitivas y apoyo neuropsicológico para detectar posibles      " +
                                                  "\n secuelas. ALIMENTACIÓN: Se recomienda una dieta rica en nutrientes neuroprotectores como: Naranjas (ricas en vitamina C,      " +
                                                  "\n fortalecen el sistema inmune, 89% del requerimiento diario por cada 100 g); Aguacate (fuente de vitamina E y ácidos grasos    " +
                                                  "\n saludables, 14% de la ingesta diaria por cada 100 g); Pescados grasos (salmón, atún), ricos en Omega-3, que ayudan a          " +
                                                  "\n reducir la inflamación cerebral (50% de la ingesta diaria por cada 100 g); Huevos (aportan colina, esencial para la           " +
                                                  "\n función cognitiva, 27% del requerimiento diario por unidad); y Nueces (ricas en ácido alfa-linolénico, un tipo de Omega-3     " +
                                                  "\n vegetal, 91% por cada 30 g). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100%       " +
                                                  "\n que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda            " +
                                                  "\n realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Además, por             " +
                                                  "\n su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L              " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 a 3 litros de agua al día (diez a doce vasos de agua de tamaño regular)        " +
                                                  "\n para apoyar la función renal, facilitar la eliminación de toxinas derivadas del tratamiento y mantener la homeostasis       " +
                                                  "\n celular. En pacientes con cáncer, una hidratación adecuada también ayuda a reducir los efectos secundarios de la            " +
                                                  "\n quimioterapia como náuseas, fatiga y estreñimiento. EJERCICIO: Actividad física moderada y adaptada como caminatas,         " +
                                                  "\n ejercicios de bajo impacto o yoga suave puede mejorar la calidad de vida, reducir la fatiga y fortalecer el sistema         " +
                                                  "\n inmunológico. Es importante realizar una evaluación funcional previa para ajustar la intensidad del ejercicio según         " +
                                                  "\n el estado físico de la paciente. POSIBLE TRATAMIENTO: El tratamiento depende del tipo y estadio del cáncer, pero puede      " +
                                                  "\n incluir quimioterapia, radioterapia, inmunoterapia, cirugía y terapias dirigidas. En mujeres adultas mayores, se            " +  
                                                  "\n realiza una valoración geriátrica integral para personalizar el tratamiento, considerando comorbilidades, estado            " +
                                                  "\n funcional y tolerancia a los fármacos. También se emplean terapias hormonales en ciertos tipos de cáncer como el            " +
                                                  "\n de mama, y se utilizan medicamentos de soporte como antieméticos, analgésicos y suplementos nutricionales para mejorar      " +
                                                  "\n la tolerancia al tratamiento. El acompañamiento psicológico y el seguimiento nutricional son claves para mantener la        " +
                                                  "\n adherencia terapéutica y la estabilidad emocional. ALIMENTACIÓN: Se recomienda una dieta rica en antioxidantes, proteínas   " +
                                                  "\n y grasas saludables como: Frutas cítricas (naranjas, toronjas), con vitamina C (89% por cada 100 g); Aguacate, fuente de    " +
                                                  "\n vitamina E y ácidos grasos monoinsaturados (14% por cada 100 g); Pescados grasos (salmón, sardina), ricos en Omega-3        " +
                                                  "\n (50% por cada 100 g); Verduras de hoja verde (espinacas, acelgas), con vitamina A y hierro (56% y 15% respectivamente       " +
                                                  "\n por cada 100 g); Legumbres (lentejas, frijoles), con proteínas vegetales y hierro (37% por cada 100 g); y Frutos secos      " +
                                                  "\n (almendras, nueces), con selenio y zinc, que apoyan la función inmune (45% y 30% respectivamente por cada 30 g). Este es    " +
                                                  "\n solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad    " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida      " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le     " +
                                                  "\n satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera      " +
                                                  "\n que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.50-1.75 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la influenza es fundamental mantener una hidratación adecuada con un consumo    " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a           " +
                                                  "\n fluidificar las secreciones respiratorias y prevenir la deshidratación causada por la fiebre. EJERCICIO: Se         " +
                                                  "\n recomienda actividad física ligera como caminatas suaves dentro del hogar estiramientos o ejercicios de movilidad   " +
                                                  "\n evitando esfuerzos intensos mientras persistan los síntomas. Una vez superada la fase aguda es recomendable         " +
                                                  "\n realizar ejercicios de respiración profunda para mejorar la oxigenación y prevenir la pérdida de masa muscular.     " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento suele incluir medicamentos para reducir la fiebre y aliviar los síntomas como   " +
                                                  "\n el paracetamol o el ibuprofeno y en casos más severos los médicos pueden recetar antivirales específicos como el    " +
                                                  "\n oseltamivir. Es importante seguir las indicaciones médicas y evitar el uso de aspirina ya que puede generar         " +
                                                  "\n complicaciones. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunológico y acelerar la recuperación se       " +
                                                  "\n recomienda el consumo de NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la duración de los síntomas   " +
                                                  "\n aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene           " +
                                                  "\n compuestos con propiedades antiinflamatorias y puede aliviar la congestión. MIEL Y LIMÓN: Combinación efectiva      " +
                                                  "\n para calmar la garganta y reducir la tos aportando flavonoides y vitamina C. ESPINACAS Y BRÓCOLI: Aportan           " +
                                                  "\n antioxidantes y vitamina A esenciales para la regeneración celular con un contenido de aproximadamente 56% de la    " +
                                                  "\n ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probióticos que pueden fortalecer el        " +
                                                  "\n sistema inmunológico y mejorar la salud digestiva aportando calcio y proteínas esenciales. Este es solo un          " +
                                                  "\n diagnóstico predeterminado lógico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad     " +
                                                  "\n ni que las respuestas sean completamente correctas para ello se recomienda hacer más de un Diagnóstico de Mi Vida   " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente además por su salud si la respuesta del   " +
                                                  "\n Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico Angel L Montes agradece tu        " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la neumonía es fundamental mantener una hidratación adecuada con un consumo    " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a          " +
                                                  "\n fluidificar las secreciones pulmonares y facilitar su expulsión. EJERCICIO: Se recomienda actividad física ligera  " +
                                                  "\n como caminatas lentas dentro del hogar ejercicios de respiración profunda y estiramientos suaves evitando          " +
                                                  "\n esfuerzos intensos mientras persistan los síntomas. Una vez superada la fase aguda es recomendable realizar        " +
                                                  "\n fisioterapia respiratoria y ejercicios de expansión pulmonar para mejorar la capacidad pulmonar y reducir la       " +
                                                  "\n sensación de fatiga. POSIBLE TRATAMIENTO: El tratamiento suele incluir antibióticos como la amoxicilina la         " +
                                                  "\n azitromicina o la ceftriaxona y en casos más severos antivirales como el oseltamivir además de medicamentos para   " +
                                                  "\n reducir la fiebre como el paracetamol o el ibuprofeno. Es importante seguir las indicaciones médicas y evitar la   " +
                                                  "\n automedicación. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunológico y acelerar la recuperación se      " +
                                                  "\n recomienda el consumo de NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la duración de los síntomas     " +
                                                  "\n aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos  " +
                                                  "\n con propiedades antiinflamatorias y puede aliviar la congestión. ESPINACAS Y BRÓCOLI: Aportan antioxidantes y         " +
                                                  "\n vitamina A esenciales para la regeneración celular con un contenido de aproximadamente 56% de la ingesta diaria       " +
                                                  "\n recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probióticos que pueden fortalecer el sistema inmunológico    " +
                                                  "\n y mejorar la salud digestiva aportando calcio y proteínas esenciales. Este es solo un diagnóstico predeterminado      " +
                                                  "\n lógico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean        " +
                                                  "\n completamente correctas para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad  " +
                                                  "\n en el tratamiento adecuado de su paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo   " +
                                                  "\n se le recomienda mucho consultar a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la diabetes es fundamental mantener una hidratación adecuada con un consumo            " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a la               " +
                                                  "\n regulación de la glucosa en sangre y prevenir la deshidratación. EJERCICIO: Se recomienda actividad física regular         " +
                                                  "\n como caminatas suaves ejercicios de bajo impacto o natación para mejorar la sensibilidad a la insulina y controlar         " +
                                                  "\n los niveles de glucosa en sangre. Además se recomienda la práctica de ejercicios aeróbicos como bicicleta estática         " +
                                                  "\n o baile al menos 150 minutos por semana para mejorar la función cardiovascular y reducir el riesgo de complicaciones.      " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento suele incluir medicamentos como la metformina para mejorar la sensibilidad a la        " +
                                                  "\n insulina y en casos más severos insulina de acción rápida o prolongada además de medicamentos para controlar la presión    " +
                                                  "\n arterial y el colesterol. Es importante seguir las indicaciones médicas y mantener un monitoreo constante de los niveles   " +
                                                  "\n de glucosa. ALIMENTOS RECOMENDADOS: Para fortalecer el metabolismo y mejorar el control de la glucosa se recomienda el      " +
                                                  "\n consumo de FRUTOS ROJOS: Ricos en antioxidantes y fibra que ayudan a regular la glucosa en sangre aportando aproximadamente " +
                                                  "\n el 32% de la ingesta diaria recomendada por cada 100 gramos. FRUTOS SECOS: Contienen grasas saludables y fibra que         " +
                                                  "\n pueden mejorar la sensibilidad a la insulina aportando aproximadamente el 25% de la ingesta diaria recomendada por         " +
                                                  "\n cada 100 gramos. ESPINACAS Y BRÓCOLI: Aportan antioxidantes y vitamina A esenciales para la regeneración celular con       " +
                                                  "\n un contenido de aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos. AVENA: Rica en fibra soluble     " +
                                                  "\n que ayuda a estabilizar los niveles de glucosa en sangre aportando aproximadamente el 40% de la ingesta diaria recomendada " +
                                                  "\n por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza al 100% que el    " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer más de   " +
                                                  "\n un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente además por su salud  " +
                                                  "\n si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2 a 2.5 litros de agua al día (ocho a diez vasos de agua de tamaño regular)         " +
                                                  "\n para mantener las vías respiratorias hidratadas, facilitar la eliminación de secreciones y reducir la inflamación            " +
                                                  "\n bronquial. En mujeres adultas mayores, una hidratación constante también ayuda a prevenir la sequedad de mucosas y           " +
                                                  "\n mejora la función pulmonar general. EJERCICIO: Actividad física moderada como caminatas suaves, ejercicios de respiración    " +
                                                  "\n y estiramientos controlados puede mejorar la capacidad pulmonar y reducir la frecuencia de las crisis asmáticas. Es          " +
                                                  "\n importante evitar ambientes fríos o contaminados y realizar calentamiento previo para prevenir la broncoconstricción         " +
                                                  "\n inducida por el ejercicio. POSIBLE TRATAMIENTO: El tratamiento incluye broncodilatadores de acción rápida como Salbutamol    " +
                                                  "\n (Ventolin, Aerolin), corticosteroides inhalados como Fluticasona o Budesonida (Flixotide, Pulmicort), y en algunos casos,    " +
                                                  "\n modificadores de leucotrienos como Montelukast (Singulair). En mujeres adultas mayores, es esencial revisar la técnica de    " +
                                                  "\n inhalación, ajustar las dosis para evitar efectos secundarios como temblores o taquicardia, y considerar el uso de              " +
                                                  "\n espaciadores para mejorar la administración del medicamento. ALIMENTACIÓN: Se sugiere el consumo de alimentos antiinflamatorios " +
                                                  "\n y antioxidantes como: Pescados grasos (salmón, atún), ricos en Omega-3, que ayudan a reducir la inflamación de las vías     " +
                                                  "\n respiratorias (50% de la ingesta diaria recomendada por cada 100 g); Frutas cítricas (naranjas, toronjas), con vitamina C   " +
                                                  "\n que fortalece el sistema inmune (89% por cada 100 g); Espinacas (ricas en vitamina A y magnesio, esenciales para la función " +
                                                  "\n pulmonar, con 56% y 20% respectivamente por cada 100 g); Jengibre y cúrcuma, con propiedades antiinflamatorias naturales.   " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta       " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico      " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico" +
                                                  "\n no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera" +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 litros de agua al día (diez vasos de agua de tamaño regular) para          " +
                                                  "\n apoyar la función renal, facilitar la eliminación de toxinas y mantener el equilibrio electrolítico, especialmente      " +
                                                  "\n importante en pacientes que toman múltiples medicamentos. También se sugiere incluir infusiones antioxidantes como      " +
                                                  "\n té verde o rooibos. EJERCICIO: Actividad física moderada como caminatas, yoga suave o ejercicios de bajo impacto        " +
                                                  "\n puede mejorar la masa muscular, reducir el estrés y fortalecer el sistema inmunológico. Es importante adaptar la        " +
                                                  "\n rutina a la condición física de la paciente y evitar el sobreesfuerzo. POSIBLE TRATAMIENTO: El tratamiento estándar     " +
                                                  "\n es la terapia antirretroviral (TAR), que combina medicamentos como Tenofovir, Emtricitabina, Efavirenz (Atripla),       " +
                                                  "\n Dolutegravir (Tivicay) y Lamivudina (Epivir). En mujeres adultas mayores, es crucial monitorear la función hepática     " +
                                                  "\n y renal, así como posibles interacciones con otros medicamentos para enfermedades crónicas. También se recomienda el    " +
                                                  "\n seguimiento de la densidad ósea, ya que algunos antirretrovirales pueden afectar el metabolismo del calcio. El          " +
                                                  "\n acompañamiento psicológico y el control nutricional son fundamentales para mantener la adherencia terapéutica y la      " +
                                                  "\n calidad de vida. ALIMENTACIÓN: Se recomienda una dieta rica en nutrientes inmunoestimulantes como: Frutas cítricas       " +
                                                  "\n (naranjas, limones), con vitamina C (89% por cada 100 g); Aguacate, fuente de vitamina E y ácidos grasos monoinsaturados " +
                                                  "\n (14% por cada 100 g); Pescados grasos (salmón, sardina), ricos en Omega-3 (50% por cada 100 g); Verduras de hoja verde   " +
                                                  "\n (espinacas, acelgas), con vitamina A y hierro (56% y 15% respectivamente por cada 100 g); Legumbres (lentejas, frijoles)," +
                                                  "\n con proteínas vegetales y hierro (37% por cada 100 g). Este es solo un diagnóstico predeterminado lógico, haberlo        " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas." +
                                                  "\n Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento     " +
                                                  "\n adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su   " +
                                                  "\n médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2 a 2.5 litros de agua al día (ocho a diez vasos de agua de tamaño regular)       " +
                                                  "\n para facilitar la eliminación de toxinas y mantener la función renal, especialmente importante durante el tratamiento      " +
                                                  "\n antibiótico. También se sugiere el consumo de jugos naturales sin azúcar para aportar antioxidantes. EJERCICIO:            " +
                                                  "\n Actividad física ligera como caminatas o estiramientos suaves puede ayudar a mejorar la circulación y fortalecer           " +
                                                  "\n el sistema inmune. Se debe evitar el ejercicio intenso durante el tratamiento para no comprometer la recuperación.         " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento incluye antibióticos como Ceftriaxona (inyección única) y Azitromicina (dosis oral).   " +
                                                  "\n En mujeres adultas mayores, es importante vigilar posibles efectos secundarios gastrointestinales y ajustar la dosis       " +
                                                  "\n en caso de insuficiencia renal. También se recomienda realizar pruebas de seguimiento para confirmar la erradicación       " +
                                                  "\n de la bacteria y evitar reinfecciones. En casos resistentes, puede ser necesario el uso de combinaciones antibióticas      " +
                                                  "\n o tratamientos prolongados. ALIMENTACIÓN: Se recomienda una dieta que apoye la función inmunológica y la recuperación,     " +
                                                  "\n incluyendo: Naranjas (ricas en vitamina C, 89% por cada 100 g); Espinacas (fuente de hierro y ácido fólico, 56% y 49%      " +
                                                  "\n respectivamente por cada 100 g); Yogur natural (rico en probióticos y calcio, 30% de la ingesta diaria recomendada por     " +
                                                  "\n cada 100 g); Ajo (con propiedades antibacterianas naturales); y Zanahorias (ricas en vitamina A, 93% por cada 100 g),      " +
                                                  "\n que ayudan a mantener la integridad de las mucosas. Este es solo un diagnóstico predeterminado lógico, haberlo consultado  " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello,  " +
                                                  "\n se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado.        " +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.       " +
                                                  "\n Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una    " +
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales.     " +
                                                  "\n EJERCICIO. Se recomienda actividad física moderada como caminatas suaves, yoga o ejercicios de estiramiento    " +
                                                  "\n de bajo impacto durante 30 minutos al día, cinco veces por semana, para fortalecer el sistema inmunológico     " +
                                                  "\n y reducir el estrés, ya que el estrés puede desencadenar brotes. También es útil incorporar ejercicios de      " +
                                                  "\n respiración profunda y meditación para mejorar la respuesta del cuerpo ante el virus. HIDRATACIÓN. Se          " +
                                                  "\n aconseja consumir entre 2 y 2.5 litros de agua al día para mantener la piel y las mucosas hidratadas, lo       " +
                                                  "\n cual ayuda a reducir la irritación y prevenir brotes. Además, se recomienda evitar bebidas con cafeína o       " +
                                                  "\n alcohol, ya que pueden favorecer la deshidratación. Infusiones suaves como manzanilla o té verde pueden ser    " +
                                                  "\n beneficiosas por sus propiedades antiinflamatorias y antioxidantes. POSIBLE TRATAMIENTO. El tratamiento para   " +
                                                  "\n el herpes genital incluye antivirales como aciclovir, famciclovir y valaciclovir, que ayudan a reducir la      " +
                                                  "\n duración y frecuencia de los brotes. Marcas reconocidas incluyen Zovirax y Valtrex. En casos de recurrencias   " +
                                                  "\n frecuentes, se puede considerar terapia supresiva diaria. También se recomienda el uso de cremas tópicas con   " +
                                                  "\n lidocaína o aloe vera para aliviar el malestar local. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica   " +
                                                  "\n en lisina y antioxidantes para fortalecer el sistema inmunológico. Algunos alimentos clave incluyen yogur      " +
                                                  "\n natural y leche, ricos en lisina, que inhibe la replicación del virus. Frutas cítricas como naranja y kiwi,    " +
                                                  "\n ricas en vitamina C, que fortalecen el sistema inmune, aportando aproximadamente el 89% del requerimiento      " +
                                                  "\n diario por cada 100 gramos. Verduras como espinaca y zanahoria, ricas en vitamina A, que contribuyen a la      " +
                                                  "\n regeneración celular y fortalecen las mucosas, con un aporte del 15% del requerimiento diario por cada 100     " +
                                                  "\n gramos. Este diagnóstico es una referencia lógica basada en información médica, pero no garantiza al 100%      " +
                                                  "\n que el paciente tenga herpes genital ni que el tratamiento sea el adecuado. Se recomienda realizar más de      " +
                                                  "\n un diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes agradece tu visita a la app        " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una        " +
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales.         " +
                                                  "\n EJERCICIO. Se recomienda actividad física moderada como caminatas diarias de 30 minutos, ejercicios de movilidad   " +
                                                  "\n articular y estiramientos suaves para mejorar la circulación, mantener la masa muscular y fortalecer el sistema    " +
                                                  "\n inmunológico. También es beneficioso incluir ejercicios de equilibrio y coordinación para prevenir caídas.         " +
                                                  "\n HIDRATACIÓN. Se aconseja consumir entre 2 y 2.5 litros de agua al día para ayudar a eliminar toxinas del cuerpo,   " +
                                                  "\n mantener la función renal y apoyar el metabolismo durante el tratamiento antibiótico. También se recomienda el     " +
                                                  "\n consumo de caldos naturales y jugos de frutas sin azúcar añadida para mantener el equilibrio de electrolitos.      " +
                                                  "\n POSIBLE TRATAMIENTO. El tratamiento estándar para la sífilis incluye antibióticos como penicilina G benzatina,     " +
                                                  "\n doxiciclina o ceftriaxona. Marcas reconocidas incluyen Benzetacil y Doxiciclina. En pacientes alérgicos a la       " +
                                                  "\n penicilina, se utilizan alternativas como la doxiciclina por vía oral durante 14 días. Es fundamental completar    " +
                                                  "\n el tratamiento para evitar complicaciones como neurosífilis o daño cardiovascular. ALIMENTACIÓN RECOMENDADA. Se    " +
                                                  "\n recomienda una dieta rica en proteínas, vitaminas y minerales para fortalecer el sistema inmunológico. Algunos     " +
                                                  "\n alimentos clave incluyen carnes magras y pescado, fuentes de proteínas esenciales. Frutas cítricas como naranja       " +
                                                  "\n y limón, ricas en vitamina C, que ayudan a la recuperación y fortalecimiento del sistema inmune, aportando el 89%     " +
                                                  "\n del requerimiento diario por cada 100 gramos. Verduras de hoja verde como espinaca y brócoli, que contienen hierro    " +
                                                  "\n y antioxidantes esenciales para la producción de glóbulos rojos, con un aporte del 15% del requerimiento diario por   " +
                                                  "\n cada 100 gramos. Ajo y cebolla, con compuestos antimicrobianos naturales que pueden apoyar el tratamiento. Este       " +
                                                  "\n diagnóstico es una referencia lógica basada en información médica, pero no garantiza al 100% que el paciente tenga    " +
                                                  "\n sífilis ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico   " +
                                                  "\n para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidratación       " +
                                                  "\n óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda       " +
                                                  "\n actividad física moderada como caminatas suaves, ejercicios de respiración profunda y yoga terapéutico para fortalecer        " +
                                                  "\n los pulmones, mejorar la oxigenación y reducir la fatiga. También es útil realizar ejercicios de movilidad articular y        " +
                                                  "\n estiramientos para mantener la flexibilidad y prevenir la pérdida de masa muscular. HIDRATACIÓN. Se aconseja consumir         " +
                                                  "\n entre 2.5 y 3 litros de agua al día para mantener las vías respiratorias hidratadas, facilitar la eliminación de toxinas      " +
                                                  "\n y apoyar la función renal durante el tratamiento. También se recomienda el consumo de caldos ricos en minerales y jugos       " +
                                                  "\n naturales con alto contenido de vitamina C. POSIBLE TRATAMIENTO. El tratamiento estándar para la tuberculosis incluye una     " +
                                                  "\n combinación de antibióticos como isoniazida, rifampicina, etambutol y pirazinamida durante un período de al menos seis meses. " +
                                                  "\n Marcas reconocidas incluyen Rifater y Rimactane. Es fundamental seguir el tratamiento completo y bajo supervisión médica      " +
                                                  "\n para evitar recaídas o resistencia bacteriana. En adultos mayores, se debe ajustar la dosis en caso de insuficiencia renal    " +
                                                  "\n o hepática y monitorear posibles efectos secundarios. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica en proteínas,    " +
                                                  "\n vitaminas y minerales para fortalecer el sistema inmunológico y apoyar la recuperación. Algunos alimentos clave incluyen      " +
                                                  "\n carnes magras y pescado, fuentes de proteínas esenciales. Frutas cítricas como naranja y kiwi, ricas en vitamina C, que       " +
                                                  "\n ayudan a la recuperación y fortalecimiento del sistema inmune, aportando el 89% del requerimiento diario por cada 100 gramos. " +
                                                  "\n Verduras de hoja verde como espinaca y brócoli, que contienen hierro y antioxidantes esenciales para la producción de         " +
                                                  "\n glóbulos rojos, con un aporte del 15% del requerimiento diario por cada 100 gramos. Frutos secos como almendras y nueces,     " +
                                                  "\n ricos en vitamina E y ácidos grasos esenciales, que fortalecen el sistema inmunológico y aportan el 37% del requerimiento     " +
                                                  "\n diario por cada 28 gramos. Este diagnóstico es una referencia lógica basada en información médica, pero no garantiza al       " +
                                                  "\n 100% que el paciente tenga tuberculosis ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico   " +
                                                  "\n y consultar a un médico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n La artritis es una inflamación crónica de las articulaciones que puede provocar dolor, rigidez y pérdida de movilidad,    " +
                                                  "\n siendo la osteoartritis la forma más común en la adultez mayor, especialmente en rodillas, caderas y manos. EJERCICIO.    " +
                                                  "\n Se recomienda actividad física moderada y adaptada a las capacidades de la persona, como caminatas suaves, ejercicios     " +
                                                  "\n acuáticos o yoga terapéutico, que ayudan a mantener la flexibilidad, reducir la rigidez y fortalecer los músculos que     " +
                                                  "\n rodean las articulaciones. También es útil realizar ejercicios de bajo impacto con apoyo, como bicicleta estática o       " +
                                                  "\n estiramientos guiados. HIDRATACIÓN. Es fundamental consumir entre 2 y 2.5 litros de agua al día para mantener la          " +
                                                  "\n lubricación de las articulaciones, facilitar la eliminación de toxinas y reducir la inflamación. Se sugiere complementar  " +
                                                  "\n con infusiones de cúrcuma o jengibre, que poseen propiedades antiinflamatorias naturales. POSIBLE TRATAMIENTO. El         " + 
                                                  "\n tratamiento puede incluir medicamentos antiinflamatorios no esteroides como ibuprofeno o naproxeno, corticosteroides      " +
                                                  "\n en casos más severos, y fármacos modificadores de la enfermedad como el metotrexato. También se recomienda fisioterapia,  " +
                                                  "\n terapia ocupacional y en algunos casos el uso de suplementos como glucosamina y condroitina para mejorar la salud         " +
                                                  "\n articular. ALIMENTACIÓN RECOMENDADA. Consumir alimentos ricos en antioxidantes y ácidos grasos esenciales. Pescados       " +
                                                  "\n grasos como salmón y sardina, ricos en ácidos grasos Omega-3, que ayudan a reducir la inflamación articular, aportando    " +
                                                  "\n hasta el 90% del requerimiento diario por cada 100 g. Frutas como arándanos y fresas, ricas en vitamina C y antioxidantes," +
                                                  "\n que fortalecen el sistema inmunológico y reducen el daño celular, aportando cerca del 70% del requerimiento diario por    " +
                                                  "\n cada 100 g. Verduras de hoja verde como espinaca y kale, que contienen hierro, calcio y vitamina K, esenciales para la    " +
                                                  "\n salud ósea y articular. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que    " +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda   " +
                                                  "\n hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además  " +
                                                  "\n por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Ángel " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n La tosferina, o pertussis, es una infección bacteriana que afecta las vías respiratorias y puede causar tos intensa      " +
                                                  "\n y prolongada. En adultos mayores, puede ser más severa y provocar complicaciones respiratorias. EJERCICIO. Se            " +
                                                  "\n recomienda actividad física ligera, como caminatas cortas o ejercicios de respiración profunda, para mejorar la          " +
                                                  "\n oxigenación sin agotar al paciente. Es importante evitar ambientes fríos o contaminados que puedan agravar los           " +
                                                  "\n síntomas. HIDRATACIÓN. Es fundamental consumir entre 2 y 2.5 litros de agua al día para mantener las vías respiratorias  " +
                                                  "\n hidratadas y facilitar la eliminación de mucosidad. También se recomienda el consumo de líquidos tibios como infusiones  " +
                                                  "\n de jengibre o té de manzanilla para aliviar la garganta. POSIBLE TRATAMIENTO. El tratamiento incluye antibióticos como   " +
                                                  "\n azitromicina, claritromicina o eritromicina, que ayudan a eliminar la bacteria. En casos con dificultad respiratoria,    " + 
                                                  "\n pueden utilizarse broncodilatadores. Se recomienda reposo y aislamiento durante los primeros días para evitar contagios. " +
                                                  "\n ALIMENTACIÓN RECOMENDADA. Consumir alimentos que fortalezcan el sistema respiratorio. Frutas cítricas como naranja y     " +
                                                  "\n toronja, ricas en vitamina C, que ayudan a reducir la duración de los síntomas, aportando hasta el 89% del requerimiento " +
                                                  "\n diario por cada 100 g. Miel, con propiedades antimicrobianas y calmantes para la garganta. Jengibre, con efectos         " +
                                                  "\n antiinflamatorios que pueden aliviar la tos. Yogur natural, fuente de probióticos que fortalecen la flora intestinal y   " +
                                                  "\n el sistema inmune. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el     " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda     " +
                                                  "\n hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además " +
                                                  "\n por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico,      " +
                                                  "\n Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Las paperas son una infección viral que afecta las glándulas salivales, causando inflamación y dolor en la zona         " +
                                                  "\n de la mandíbula. En adultos mayores, pueden presentarse síntomas más intensos y riesgo de complicaciones. EJERCICIO.    " +
                                                  "\n Se recomienda actividad física ligera mientras persistan los síntomas, como estiramientos suaves o caminatas cortas,    " +
                                                  "\n evitando esfuerzos que puedan aumentar la inflamación. HIDRATACIÓN. Es fundamental consumir entre 2 y 2.5 litros de     " +
                                                  "\n agua al día para ayudar al cuerpo a combatir la infección y mantenerse hidratado. Se sugiere complementar con           " +
                                                  "\n líquidos suaves como caldos o infusiones de manzanilla. POSIBLE TRATAMIENTO. No existe un tratamiento antiviral         " +
                                                  "\n específico para las paperas. Se recomienda el uso de paracetamol para aliviar la fiebre y el dolor, evitando el         " +
                                                  "\n ibuprofeno y la aspirina. También se sugiere el uso de compresas frías en la zona inflamada y reposo absoluto           " +
                                                  "\n durante los primeros días. ALIMENTACIÓN RECOMENDADA. Consumir alimentos blandos y ricos en nutrientes. Frutas           " +
                                                  "\n cítricas como naranja y mandarina, ricas en vitamina C, que fortalecen el sistema inmunológico, aportando hasta         " +
                                                  "\n el 89% del requerimiento diario por cada 100 g. Yogur natural, fuente de probióticos que ayudan a mantener la flora     " +
                                                  "\n intestinal. Verduras de hoja verde como espinaca, que aportan hierro y antioxidantes esenciales para la recuperación.   " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente tenga esa    " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de un       " +
                                                  "\n diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud   " +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Ángel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n EJERCICIO: Durante la infección por el virus del Zika se recomienda evitar cualquier esfuerzo físico intenso y priorizar   " +
                                                  "\n el descanso absoluto, ya que el sistema inmunológico necesita conservar energía para combatir el virus. Una vez que los    " +
                                                  "\n síntomas disminuyen, se pueden realizar ejercicios suaves como caminatas lentas o estiramientos ligeros para mejorar la    " +
                                                  "\n circulación y reducir la rigidez muscular. También es útil practicar ejercicios de respiración profunda para mejorar la    " +
                                                  "\n oxigenación celular y reducir la inflamación. HIDRATACIÓN: Es fundamental consumir al menos 2.5 litros de agua al día      " +
                                                  "\n para prevenir la deshidratación, regular la temperatura corporal y facilitar la eliminación de toxinas. También se         " +
                                                  "\n recomienda el consumo de caldos naturales, infusiones como té de jengibre o manzanilla, y jugos naturales sin azúcar       " +
                                                  "\n añadida, que además de hidratar aportan antioxidantes y alivian síntomas como el dolor muscular y la fiebre. POSIBLE       " +
                                                  "\n TRATAMIENTO: No existe un tratamiento antiviral específico para el Zika, pero los síntomas pueden aliviarse con reposo,    " +
                                                  "\n hidratación constante y medicamentos como el acetaminofén para reducir la fiebre y el dolor. Es importante evitar el uso   " +
                                                  "\n de aspirina y otros antiinflamatorios no esteroideos hasta descartar la posibilidad de dengue, para reducir el riesgo de   " +
                                                  "\n hemorragias. También se recomienda evitar el consumo de alcohol y tabaco durante la recuperación, ya que pueden debilitar   " +
                                                  "\n el sistema inmunológico. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales " +
                                                  "\n para fortalecer el sistema inmunológico, tales como frutas cítricas como naranjas y toronjas, que aportan vitamina C en un  " +
                                                  "\n 89% de la ingesta diaria recomendada, ayudando a combatir infecciones. Verduras de hoja verde como espinacas y acelgas, que " +
                                                  "\n aportan hasta un 50% de la ingesta diaria recomendada de vitamina A y K, esenciales para la regeneración celular. Jengibre  " +
                                                  "\n y cúrcuma, que poseen propiedades antiinflamatorias y antioxidantes, contribuyendo con hasta un 40% de la ingesta diaria    " +
                                                  "\n recomendada de compuestos bioactivos beneficiosos para la salud. este es solo un diagnóstico predeterminado lógico. haberlo " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas.   " +
                                                  "\n se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud, si la   " +
                                                  "\n respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita  " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n EJERCICIO: Durante la infección por rotavirus se recomienda evitar cualquier tipo de esfuerzo físico y priorizar          " +
                                                  "\n el descanso absoluto, ya que la pérdida de líquidos y nutrientes puede provocar debilidad extrema. Una vez superada       " +
                                                  "\n la fase aguda, se pueden realizar ejercicios suaves como caminatas lentas o estiramientos para estimular la circulación   " +
                                                  "\n y recuperar la energía. También es recomendable realizar ejercicios de respiración para mejorar la oxigenación celular    " +
                                                  "\n y reducir la fatiga. HIDRATACIÓN: Es crucial el consumo de al menos 2.5 litros de agua al día para prevenir la            " +
                                                  "\n deshidratación causada por la diarrea y los vómitos. También se recomienda el uso de soluciones de rehidratación oral     " +
                                                  "\n que contienen electrolitos esenciales como sodio, potasio y glucosa, los cuales ayudan a restablecer el equilibrio        " +
                                                  "\n hídrico y energético del cuerpo. El consumo de caldos naturales y jugos suaves sin azúcar también puede ser beneficioso.  " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento antiviral específico para el rotavirus, pero los síntomas pueden aliviarse  " +
                                                  "\n con hidratación intensiva, reposo y una dieta adecuada. Se deben evitar los medicamentos antidiarreicos, ya que pueden    " +
                                                  "\n prolongar la infección. En casos graves, puede ser necesaria la administración de líquidos por vía intravenosa. También   " +
                                                  "\n se recomienda el consumo de probióticos para restaurar la flora intestinal. ALIMENTACIÓN: Se recomienda el consumo de     " +
                                                  "\n alimentos que favorezcan la recuperación del sistema digestivo, tales como yogur natural, que contiene probióticos        " +
                                                  "\n beneficiosos para la flora intestinal. Frutas como plátanos y manzanas, que aportan fibra soluble y ayudan a regular el   " +
                                                  "\n tránsito intestinal. Verduras como zanahorias y calabacines, que contienen antioxidantes y vitaminas esenciales como la   " +
                                                  "\n vitamina A y el potasio, aportando hasta un 50% de la ingesta diaria recomendada, fundamentales para la regeneración de   " +
                                                  "\n la mucosa intestinal. este es solo un diagnóstico predeterminado lógico. haberlo consultado no garantiza al 100% que la   " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar más de un       " +
                                                  "\n diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico no le  " +
                                                  "\n satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que" +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n EJERCICIO: Durante la infección por listeria se recomienda evitar esfuerzos físicos intensos y priorizar el descanso,      " +
                                                  "\n ya que el cuerpo necesita conservar energía para combatir la bacteria. Una vez que los síntomas disminuyen, se pueden      " +
                                                  "\n realizar ejercicios suaves como caminatas lentas o ejercicios de respiración para mejorar la oxigenación celular y         " +
                                                  "\n reducir la fatiga. También es importante mantener una rutina de movilidad ligera para prevenir la rigidez muscular y       " +
                                                  "\n mejorar la circulación. HIDRATACIÓN: Es fundamental consumir al menos 2.5 litros de agua al día para ayudar a eliminar     " +
                                                  "\n toxinas y mantener el equilibrio de los fluidos corporales. También se recomienda el consumo de caldos naturales,          " +
                                                  "\n infusiones suaves y jugos sin azúcar para aportar electrolitos esenciales. La hidratación adecuada contribuye a la         " +
                                                  "\n eliminación de bacterias a través de la orina y mejora la función renal, lo cual es clave durante una infección bacteriana." +
                                                  "\n POSIBLE TRATAMIENTO: La infección por listeria se trata con antibióticos como ampicilina o gentamicina, especialmente      " +
                                                  "\n en casos graves o en pacientes inmunocomprometidos. En adultos mayores, el tratamiento debe iniciarse lo antes posible     " +
                                                  "\n para evitar complicaciones como septicemia o meningitis. También se recomienda evitar alimentos de alto riesgo como        " +
                                                  "\n productos lácteos no pasteurizados, embutidos y pescados ahumados durante la recuperación. ALIMENTACIÓN: Se recomienda     " +
                                                  "\n el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunológico, tales      " +
                                                  "\n como frutas cítricas como naranjas y toronjas, que aportan vitamina C en un 89% de la ingesta diaria recomendada, ayudando " +
                                                  "\n a combatir infecciones. Verduras de hoja verde como espinacas y acelgas, que aportan hasta un 50% de la ingesta diaria     " +
                                                  "\n recomendada de vitamina A y K, esenciales para la regeneración celular. Frutos secos como almendras y nueces, que contienen  " +
                                                  "\n vitamina E y magnesio, contribuyendo con hasta un 40% de la ingesta diaria recomendada de estos nutrientes esenciales para   " +
                                                  "\n la recuperación neurológica. este es solo un diagnóstico predeterminado lógico. haberlo consultado no garantiza al 100% que  " +
                                                  "\n la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar más de un       " +
                                                  "\n diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico no le     " +
                                                  "\n satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que   " +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la shigelosis es fundamental mantener una hidratación adecuada con un consumo      " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para reponer los           " +
                                                  "\n líquidos perdidos por la diarrea y prevenir la deshidratación. EJERCICIO: Se recomienda actividad física ligera        " +
                                                  "\n como caminatas suaves dentro del hogar o ejercicios de movilidad articular evitando esfuerzos intensos mientras        " +
                                                  "\n persistan los síntomas. Una vez superada la fase aguda es recomendable realizar ejercicios de fortalecimiento          " +
                                                  "\n progresivo para recuperar energía y mejorar la función digestiva. POSIBLE TRATAMIENTO: El tratamiento suele incluir    " +
                                                  "\n antibióticos como la ciprofloxacina o la azitromicina y en casos más severos ceftriaxona. Es importante evitar         " +
                                                  "\n medicamentos antidiarreicos sin indicación médica ya que pueden empeorar la eliminación de la bacteria. ALIMENTOS      " +
                                                  "\n RECOMENDADOS: Para fortalecer el sistema digestivo y acelerar la recuperación se recomienda el consumo de PLÁTANOS:    " +
                                                  "\n Ricos en potasio que ayuda a reemplazar los electrolitos perdidos debido a la diarrea aportando aproximadamente el     " +
                                                  "\n 12% de la ingesta diaria recomendada por cada 100 gramos. ARROZ BLANCO: Fuente de carbohidratos de fácil digestión     " +
                                                  "\n que ayuda a estabilizar el sistema digestivo. ZANAHORIAS: Ricas en vitamina A y antioxidantes que ayudan a la          " +
                                                  "\n regeneración celular aportando aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos.             " +
                                                  "\n YOGUR NATURAL: Contiene probióticos que pueden fortalecer el sistema digestivo y mejorar la salud intestinal aportando  " +
                                                  "\n calcio y proteínas esenciales. Este es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza al     " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda   " +
                                                  "\n hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente además " +
                                                  "\n por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico      " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la EPOC es fundamental mantener una hidratación adecuada con un consumo diario        " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a mantener las vías      " +
                                                  "\n respiratorias hidratadas y facilitar la expulsión de mucosidad. EJERCICIO: Se recomienda actividad física ligera como     " +
                                                  "\n caminatas lentas ejercicios de respiración profunda y estiramientos suaves para mejorar la oxigenación y la capacidad     " +
                                                  "\n pulmonar. Además se recomienda la práctica de ejercicios de fortalecimiento muscular y fisioterapia respiratoria          " +
                                                  "\n adaptada a la capacidad del paciente para mantener la funcionalidad y prevenir la pérdida de masa muscular. POSIBLE       " +
                                                  "\n TRATAMIENTO: El tratamiento suele incluir broncodilatadores de acción rápida como el salbutamol corticosteroides          " +
                                                  "\n inhalados como la fluticasona y en algunos casos terapia con oxígeno. Es fundamental seguir estrictamente el plan de      " +
                                                  "\n acción indicado por el médico y evitar la exposición a contaminantes ambientales. ALIMENTOS RECOMENDADOS: Para fortalecer " +
                                                  "\n el sistema respiratorio y reducir la inflamación se recomienda el consumo de PESCADOS GRASOS: Salmón y atún ricos en      " +    
                                                  "\n ácidos grasos Omega-3 que poseen propiedades antiinflamatorias que pueden ayudar a reducir la inflamación de las vías     " +
                                                  "\n respiratorias aportando aproximadamente el 50% de la ingesta diaria recomendada por cada 100 gramos. FRUTAS Y VERDURAS    " +
                                                  "\n DE COLORES VIVOS: Arándanos fresas espinacas brócoli ricos en antioxidantes como la vitamina C y carotenoides que pueden  " +
                                                  "\n proteger las células del daño y fortalecer el sistema inmunológico aportando aproximadamente el 70% de la ingesta diaria  " +
                                                  "\n recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos con efectos antiinflamatorios que podrían ser beneficiosos " +
                                                  "\n para las vías respiratorias. CÚRCUMA: Con su componente activo la curcumina también tiene potentes propiedades            " +
                                                  "\n antiinflamatorias y antioxidantes. Este es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza al   " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda     " +
                                                  "\n hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente además   " +
                                                  "\n por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico Angel  " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la clamidia es fundamental mantener una hidratación adecuada con un consumo      " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para ayudar a la         " +
                                                  "\n eliminación de toxinas y fortalecer el sistema inmunológico. EJERCICIO: Se recomienda actividad física moderada      " +
                                                  "\n como caminatas ejercicios de bajo impacto o natación para mejorar la circulación sanguínea y fortalecer el sistema   " +
                                                  "\n inmunológico. Además se recomienda la práctica de ejercicios de relajación como yoga o meditación para reducir el    " +
                                                  "\n estrés que puede afectar la respuesta inmunológica. POSIBLE TRATAMIENTO: El tratamiento suele incluir antibióticos   " +
                                                  "\n como la azitromicina en dosis única o la doxiciclina durante 7 días y en casos más severos levofloxacina. Es         " +
                                                  "\n fundamental seguir estrictamente el tratamiento indicado por el médico y evitar la automedicación. ALIMENTOS         " +
                                                  "\n RECOMENDADOS: Para fortalecer el sistema inmunológico y acelerar la recuperación se recomienda el consumo de         " +
                                                  "\n FRUTOS ROJOS: Ricos en antioxidantes y vitamina C que ayudan a fortalecer el sistema inmunológico aportando          " +
                                                  "\n aproximadamente el 70% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos con       " +
                                                  "\n propiedades antiinflamatorias y puede ayudar a reducir la inflamación. ESPINACAS Y BRÓCOLI: Aportan antioxidantes    " +
                                                  "\n y vitamina A esenciales para la regeneración celular con un contenido de aproximadamente 56% de la ingesta diaria    " +
                                                  "\n recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probióticos que pueden fortalecer el sistema inmunológico   " +
                                                  "\n y mejorar la salud digestiva aportando calcio y proteínas esenciales. Este es solo un diagnóstico predeterminado     " +
                                                  "\n lógico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean      " +
                                                  "\n completamente correctas para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor         " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente además por su salud si la respuesta del Diagnóstico no le        " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su médico Angel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 a 3 litros de agua al día (diez a doce vasos de agua de tamaño regular)        " +
                                                  "\n para mantener la función cerebral, facilitar la eliminación de toxinas y apoyar el sistema inmunológico. En mujeres         " +
                                                  "\n adultas mayores, una hidratación constante también ayuda a prevenir la deshidratación, que puede agravar los síntomas       " +
                                                  "\n neurológicos y aumentar el riesgo de complicaciones como confusión o delirio. EJERCICIO: Actividad física ligera como       " +
                                                  "\n caminatas suaves, ejercicios de respiración y estiramientos controlados puede mejorar la circulación cerebral y reducir     " + 
                                                  "\n la rigidez muscular. Es importante evitar el esfuerzo excesivo y priorizar el descanso durante la fase aguda de la          " +  
                                                  "\n enfermedad. Una vez estabilizada, se recomienda incorporar rutinas de movilidad para prevenir el deterioro funcional        " +
                                                  "\n y mantener la autonomía. POSIBLE TRATAMIENTO: El tratamiento inmediato incluye antibióticos intravenosos de amplio          " +
                                                  "\n espectro como Ceftriaxona, Cefotaxima o Ampicilina, ajustados según el microorganismo identificado. También se administran  " +
                                                  "\n corticosteroides como la Dexametasona para reducir la inflamación cerebral y prevenir complicaciones como pérdida auditiva  " +
                                                  "\n o convulsiones. En casos graves, puede requerirse hospitalización prolongada, monitoreo neurológico intensivo y el uso de   " +
                                                  "\n anticonvulsivos si se presentan crisis. Además, se recomienda el seguimiento con evaluaciones cognitivas y apoyo            " +
                                                  "\n neuropsicológico para detectar posibles secuelas. ALIMENTACIÓN: Se recomienda una dieta rica en nutrientes neuroprotectores " +
                                                  "\n como: Naranjas (ricas en vitamina C, fortalecen el sistema inmune, 89% del requerimiento diario por cada 100 g); Aguacate   " +
                                                  "\n (fuente de vitamina E y ácidos grasos saludables, 14% de la ingesta diaria por cada 100 g); Pescados grasos (salmón, atún), " +
                                                  "\n ricos en Omega-3, que ayudan a reducir la inflamación cerebral (50% de la ingesta diaria por cada 100 g); Huevos (aportan   " +
                                                  "\n colina, esencial para la función cognitiva, 27% del requerimiento diario por unidad); y Nueces (ricas en ácido alfa-linolénico, " +
                                                  "\n un tipo de Omega-3 vegetal, 91% por cada 30 g). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no    " +
                                                  "\n garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se   " +
                                                  "\n recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Además,    " +
                                                  "\n por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 a 3 litros de agua al día (diez a doce vasos de agua de tamaño regular)     " +
                                                  "\n para apoyar la función renal, facilitar la eliminación de toxinas derivadas del tratamiento y mantener la homeostasis    " +
                                                  "\n celular. En pacientes con cáncer, una hidratación adecuada también ayuda a reducir los efectos secundarios de la         " +
                                                  "\n quimioterapia como náuseas, fatiga y estreñimiento. EJERCICIO: Actividad física moderada y adaptada como caminatas,      " +
                                                  "\n ejercicios de bajo impacto o yoga suave puede mejorar la calidad de vida, reducir la fatiga y fortalecer el sistema      " +
                                                  "\n inmunológico. Es importante realizar una evaluación funcional previa para ajustar la intensidad del ejercicio según      " +
                                                  "\n el estado físico de la paciente. POSIBLE TRATAMIENTO: El tratamiento depende del tipo y estadio del cáncer, pero puede   " +
                                                  "\n incluir quimioterapia, radioterapia, inmunoterapia, cirugía y terapias dirigidas. En mujeres adultas mayores, se realiza    " +
                                                  "\n una valoración geriátrica integral para personalizar el tratamiento, considerando comorbilidades, estado funcional y        " +
                                                  "\n tolerancia a los fármacos. También se emplean terapias hormonales en ciertos tipos de cáncer como el de mama, y se          " +
                                                  "\n utilizan medicamentos de soporte como antieméticos, analgésicos y suplementos nutricionales para mejorar la tolerancia      " +
                                                  "\n al tratamiento. El acompañamiento psicológico y el seguimiento nutricional son claves para mantener la adherencia           " +
                                                  "\n terapéutica y la estabilidad emocional. ALIMENTACIÓN: Se recomienda una dieta rica en antioxidantes, proteínas y grasas     " +
                                                  "\n saludables como: Frutas cítricas (naranjas, toronjas), con vitamina C (89% por cada 100 g); Aguacate, fuente de vitamina E  " +
                                                  "\n y ácidos grasos monoinsaturados (14% por cada 100 g); Pescados grasos (salmón, sardina), ricos en Omega-3 (50% por cada     " +
                                                  "\n 100 g); Verduras de hoja verde (espinacas, acelgas), con vitamina A y hierro (56% y 15% respectivamente por cada 100 g);    " +
                                                  "\n Legumbres (lentejas, frijoles), con proteínas vegetales y hierro (37% por cada 100 g); y Frutos secos (almendras, nueces),  " +
                                                  "\n con selenio y zinc, que apoyan la función inmune (45% y 30% respectivamente por cada 30 g). Este es solo un diagnóstico     " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas  " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor      " +
                                                  "\n seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se    " +
                                                  "\n recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        
                        if(EstaturaFemenino.equals("1.40-1.65 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 litros de agua al día (diez vasos de agua de tamaño regular) para            " +
                                                  "\n mantener las mucosas respiratorias hidratadas, facilitar la eliminación de secreciones y prevenir la deshidratación       " +
                                                  "\n causada por fiebre. También se sugiere el consumo de caldos calientes, infusiones con jengibre y miel, que ayudan a       " +
                                                  "\n aliviar la garganta y mejorar la expectoración. EJERCICIO: Durante la fase aguda se recomienda reposo absoluto, ya        " +
                                                  "\n que el descanso permite al sistema inmunológico combatir la infección. Una vez superada la fiebre y los síntomas          " + 
                                                  "\n intensos, se puede retomar actividad física ligera como caminatas suaves o ejercicios de respiración para recuperar       " +
                                                  "\n la capacidad pulmonar. POSIBLE TRATAMIENTO: El tratamiento incluye medidas sintomáticas como paracetamol o ibuprofeno     " +
                                                  "\n para controlar la fiebre y el malestar general. En casos de alto riesgo o síntomas graves, se puede indicar un antiviral  " +
                                                  "\n como Oseltamivir (Tamiflu), especialmente si se administra en las primeras 48 horas. Se debe evitar el uso de aspirina    " +
                                                  "\n por riesgo de síndrome de Reye. También se recomienda aislamiento domiciliario, buena ventilación y monitoreo de signos   " +
                                                  "\n de alarma como dificultad respiratoria o desorientación. ALIMENTACIÓN: Se sugiere una dieta rica en alimentos que         " +
                                                  "\n fortalezcan el sistema inmunológico como: Naranjas (ricas en vitamina C, 89% del requerimiento diario por cada 100 g);    " +
                                                  "\n Kiwi (con vitamina C y potasio, 92% y 7% respectivamente); Zanahorias (aportan vitamina A, 93% por cada 100 g); Ajo       " +
                                                  "\n (con propiedades antivirales y antibacterianas); y Miel (con efectos antisépticos y antiinflamatorios). Este es solo un   " +
                                                  "\n diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que   " +
                                                  "\n las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para      " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le        " +
                                                  "\n satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera    " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 3 litros de agua al día (doce vasos de agua de tamaño regular) para mantener       " +
                                                  "\n la función pulmonar, fluidificar las secreciones y facilitar su expulsión. También se sugiere el uso de humidificadores     " +
                                                  "\n y vaporizaciones para mantener las vías respiratorias húmedas. EJERCICIO: Durante la fase aguda se debe guardar reposo      " +
                                                  "\n absoluto. Una vez estabilizada la paciente, se recomienda movilización temprana, ejercicios de respiración profunda y       " +
                                                  "\n caminatas cortas para prevenir complicaciones como trombosis o pérdida de masa muscular. POSIBLE TRATAMIENTO: El            " +
                                                  "\n tratamiento incluye antibióticos de amplio espectro como Amoxicilina con ácido clavulánico, Ceftriaxona o Levofloxacino,    " +
                                                  "\n dependiendo del agente causal. En casos graves, puede requerirse hospitalización, oxigenoterapia y tratamiento de soporte.  " +
                                                  "\n También se pueden usar corticosteroides en pacientes con inflamación severa o comorbilidades. Es fundamental iniciar el     " +
                                                  "\n tratamiento lo antes posible y completar el esquema indicado. ALIMENTACIÓN: Se recomienda una dieta rica en nutrientes      " +
                                                  "\n que apoyen la función pulmonar y la inmunidad como: Brócoli (con vitamina C y sulforafano, 135% y 20% respectivamente       " +
                                                  "\n por cada 100 g); Pescados grasos (ricos en Omega-3, 50% por cada 100 g); Huevos (aportan colina, 27% por unidad); Frutas    " +
                                                  "\n cítricas (con vitamina C, 89% por cada 100 g); y Jengibre (con propiedades antiinflamatorias y expectorantes). Este es      " +
                                                  "\n solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad    " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida      " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le     " +
                                                  "\n satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera      " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 litros de agua al día (diez vasos de agua de tamaño regular) para    " +
                                                  "\n mantener el equilibrio glucémico, prevenir la deshidratación y facilitar la función renal. En mujeres adultas     " +
                                                  "\n mayores, una hidratación adecuada también ayuda a reducir el riesgo de infecciones urinarias y complicaciones         " +
                                                  "\n metabólicas. EJERCICIO: Actividad física regular como caminatas, ejercicios de bajo impacto o yoga puede mejorar      " +
                                                  "\n la sensibilidad a la insulina, controlar el peso y reducir el riesgo cardiovascular. Se recomienda al menos 150       " +
                                                  "\n minutos semanales de ejercicio moderado, adaptado a la condición física de la paciente. POSIBLE TRATAMIENTO: El       " +
                                                  "\n tratamiento incluye modificaciones en el estilo de vida, control nutricional y medicamentos como Metformina,          " +
                                                  "\n Inhibidores de SGLT2 (como Dapagliflozina), Inhibidores de DPP-4 (como Sitagliptina) o Insulina en casos avanzados.   " +
                                                  "\n En mujeres adultas mayores, es esencial evitar hipoglucemias, ajustar las dosis según la función renal y monitorear   " +
                                                  "\n la presión arterial y lípidos. También se recomienda el uso de glucómetros para el control diario y la educación      " +
                                                  "\n continua sobre el manejo de la enfermedad. ALIMENTACIÓN: Se sugiere una dieta con bajo índice glucémico, rica en      " +
                                                  "\n fibra, antioxidantes y grasas saludables como: Avena (con beta-glucanos, que ayudan a controlar la glucosa, 34% de    " +
                                                  "\n fibra por cada 100 g); Frutas con bajo índice glucémico como manzana o pera (con vitamina C, 10–12% por cada 100 g);  " +
                                                  "\n Verduras de hoja verde (ricas en magnesio y vitamina A, 20% y 56% respectivamente por cada 100 g); Legumbres (fuente  " +
                                                  "\n de proteína vegetal y fibra, 37% de hierro por cada 100 g); y Frutos secos (almendras, nueces), con grasas              " +
                                                  "\n monoinsaturadas y magnesio, 45% y 20% respectivamente por cada 30 g. Este es solo un diagnóstico predeterminado lógico, " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente  " +
                                                  "\n correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el     " +
                                                  "\n tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda     " +
                                                  "\n consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidratación       " +
                                                  "\n óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda       " +
                                                  "\n actividad física moderada como caminatas diarias de 30 minutos, ejercicios de respiración profunda y yoga suave, siempre      " +
                                                  "\n con calentamiento previo y enfriamiento posterior. También es útil realizar ejercicios de fortalecimiento muscular con        " +
                                                  "\n bandas elásticas o pesas ligeras para mejorar la capacidad pulmonar y reducir la fatiga. HIDRATACIÓN. Se aconseja consumir    " +
                                                  "\n entre 2 y 2.5 litros de agua al día para mantener las vías respiratorias hidratadas, facilitar la eliminación de              " +
                                                  "\n secreciones y prevenir la sequedad de las mucosas. También se recomienda el consumo de infusiones tibias como manzanilla      " +
                                                  "\n o jengibre para aliviar la irritación bronquial. POSIBLE TRATAMIENTO. El tratamiento para el asma incluye broncodilatadores   " +
                                                  "\n de acción rápida como el salbutamol (marcas reconocidas: Ventolin, Aerolin), corticosteroides inhalados como la fluticasona   " +
                                                  "\n o budesonida (marcas: Flixotide, Pulmicort), y en algunos casos, modificadores de leucotrienos como el montelukast (marca:    " +
                                                  "\n Singulair). Es fundamental seguir el plan de acción indicado por el médico y utilizar los inhaladores con técnica adecuada.   " +
                                                  "\n ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta antiinflamatoria rica en antioxidantes y ácidos grasos esenciales. Algunos  " +
                                                  "\n alimentos clave incluyen pescados grasos como salmón y atún, ricos en omega-3, que ayudan a reducir la inflamación bronquial,  " +
                                                  "\n aportando el 70% del requerimiento diario por cada 100 gramos. Frutas como fresas, kiwi y naranja, ricas en vitamina C, que    " +
                                                  "\n fortalecen el sistema inmunológico, con un aporte del 89% del requerimiento diario por cada 100 gramos. Verduras como espinaca " +
                                                  "\n y brócoli, ricas en vitamina A y antioxidantes, que protegen las mucosas respiratorias, con un aporte del 15% del         " +
                                                  "\n requerimiento diario por cada 100 gramos. Este diagnóstico es una referencia lógica basada en información médica, pero    " +
                                                  "\n no garantiza al 100% que el paciente tenga asma ni que el tratamiento sea el adecuado. Se recomienda realizar más de un   " +
                                                  "\n diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera   " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una      " +
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales.       " +
                                                  "\n EJERCICIO. Se recomienda actividad física regular como caminatas, ciclismo suave o ejercicios de resistencia     " +
                                                  "\n moderada durante al menos 150 minutos semanales, distribuidos en cinco días. También se aconseja incluir         " +
                                                  "\n ejercicios de fuerza dos veces por semana para prevenir la pérdida de masa muscular y ósea. La actividad         " +
                                                  "\n física mejora el estado de ánimo, fortalece el sistema inmunológico y reduce el riesgo de enfermedades           " +
                                                  "\n cardiovasculares. HIDRATACIÓN. Se aconseja consumir entre 2 y 2.5 litros de agua al día para apoyar la           " +
                                                  "\n función renal, facilitar la absorción de medicamentos antirretrovirales y prevenir infecciones urinarias.        " +
                                                  "\n También se recomienda el consumo de caldos naturales, jugos sin azúcar y bebidas con electrolitos en caso        " +
                                                  "\n de diarrea o fiebre. POSIBLE TRATAMIENTO. El tratamiento para el VIH/SIDA se basa en la terapia antirretroviral  " +
                                                  "\n (TAR), que incluye combinaciones de medicamentos como tenofovir, emtricitabina, efavirenz, dolutegravir o           " +
                                                  "\n lamivudina. Marcas reconocidas incluyen Atripla, Biktarvy y Triumeq. Es esencial mantener la adherencia al          " +
                                                  "\n tratamiento para lograr la supresión viral y evitar la progresión de la enfermedad. ALIMENTACIÓN RECOMENDADA.       " +
                                                  "\n Se recomienda una dieta equilibrada rica en proteínas, vitaminas y minerales. Algunos alimentos clave incluyen      " +
                                                  "\n carnes magras y pescado, fuentes de proteínas esenciales. Frutas como papaya, mango y naranja, ricas en vitamina C  " +
                                                  "\n y betacarotenos, que fortalecen el sistema inmune, aportando entre el 70% y 90% del requerimiento diario por cada   " +
                                                  "\n 100 gramos. Verduras como espinaca, zanahoria y brócoli, ricas en vitamina A, hierro y antioxidantes, que ayudan    " +
                                                  "\n a prevenir infecciones oportunistas. Frutos secos como almendras y nueces, ricos en vitamina E y ácidos grasos      " +
                                                  "\n esenciales, con un aporte del 37% del requerimiento diario por cada 28 gramos. Este diagnóstico es una referencia   " +
                                                  "\n lógica basada en información médica, pero no garantiza al 100% que el paciente tenga VIH/SIDA ni que el tratamiento " +
                                                  "\n sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico para mayor seguridad. Angel L " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una              " +
                                                  "\n hidratación óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales.               " +
                                                  "\n EJERCICIO. Se recomienda actividad física ligera como caminatas suaves, estiramientos y ejercicios de movilidad          " +
                                                  "\n durante 20 a 30 minutos diarios para mejorar la circulación, reducir el estrés y fortalecer el sistema inmunológico.     " +
                                                  "\n Se debe evitar el ejercicio intenso durante el tratamiento para prevenir complicaciones. HIDRATACIÓN. Se aconseja        " +
                                                  "\n consumir entre 2 y 2.5 litros de agua al día para facilitar la eliminación de toxinas, apoyar la función renal y         " +
                                                  "\n reducir la inflamación del tracto urinario. También se recomienda el consumo de infusiones suaves como manzanilla        " +
                                                  "\n o menta para aliviar molestias urinarias. POSIBLE TRATAMIENTO. El tratamiento para la gonorrea incluye antibióticos      " +
                                                  "\n como ceftriaxona en dosis única intramuscular de 500 mg. En caso de coinfección con clamidia, se añade doxiciclina       " +
                                                  "\n 100 mg dos veces al día por 7 días. Marcas reconocidas incluyen Rocephin y Vibramycin. Es importante tratar también      " +
                                                  "\n a la pareja sexual para evitar reinfección. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta antiinflamatoria rica      " +
                                                  "\n en antioxidantes y nutrientes que fortalezcan el sistema inmunológico. Algunos alimentos clave incluyen frutas como      " +
                                                  "\n arándanos, naranja y piña, ricas en vitamina C, que ayudan a combatir infecciones, aportando el 89% del requerimiento    " +
                                                  "\n diario por cada 100 gramos. Verduras como brócoli y espinaca, ricas en vitamina A y hierro, que favorecen la regeneración" +
                                                  "\n celular y la oxigenación, con un aporte del 15% del requerimiento diario por cada 100 gramos. Yogur natural, fuente      " +
                                                  "\n de probióticos que ayudan a mantener el equilibrio de la flora vaginal y digestiva. Este diagnóstico es una referencia   " +
                                                  "\n lógica basada en información médica, pero no garantiza al 100% que el paciente tenga gonorrea ni que el tratamiento sea  " +
                                                  "\n el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n El herpes genital es una infección viral crónica causada por el virus del herpes simple (VHS), que puede provocar       " +
                                                  "\n llagas dolorosas, picazón y molestias en la zona genital. En la adultez mayor, los brotes pueden ser más frecuentes     " +
                                                  "\n y prolongados debido al debilitamiento del sistema inmunológico. EJERCICIO. Se recomienda actividad física moderada     " +
                                                  "\n como caminatas suaves, yoga o ejercicios de respiración, que ayudan a reducir el estrés, uno de los principales         " +
                                                  "\n desencadenantes de los brotes. También es útil mantener una rutina de ejercicio constante para fortalecer el sistema    " +
                                                  "\n inmune. HIDRATACIÓN. Es fundamental consumir entre 2 y 2.5 litros de agua al día para mantener la piel y las mucosas    " +
                                                  "\n hidratadas, lo que puede ayudar a reducir la irritación durante los brotes. Se sugiere complementar con infusiones de   " +
                                                  "\n manzanilla o té verde por sus propiedades calmantes y antioxidantes. POSIBLE TRATAMIENTO. El tratamiento incluye        " +
                                                  "\n antivirales como aciclovir, valaciclovir o famciclovir, que ayudan a reducir la duración y severidad de los brotes.     " +
                                                  "\n En casos recurrentes, puede indicarse tratamiento supresivo diario. También se recomienda mantener una buena higiene    " +
                                                  "\n personal y evitar el contacto directo durante los brotes. ALIMENTACIÓN RECOMENDADA. Consumir alimentos que fortalezcan  " +
                                                  "\n el sistema inmunológico y reduzcan la inflamación. Yogur natural, fuente de probióticos que ayudan a mantener la flora  " +
                                                  "\n intestinal y mejorar la respuesta inmune. Frutas cítricas como naranja y toronja, ricas en vitamina C, que fortalecen   " +
                                                  "\n el sistema inmunológico, aportando hasta el 89% del requerimiento diario por cada 100 g. Verduras de hoja verde como    " +
                                                  "\n espinaca, que contienen hierro y antioxidantes esenciales para la recuperación. Pescados como salmón, ricos en ácidos   " +
                                                  "\n grasos Omega-3, que poseen propiedades antiinflamatorias. Este es solo un diagnóstico predeterminado lógico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas      " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el   " +
                                                  "\n tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se    " +
                                                  "\n le recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n La sífilis es una infección bacteriana de transmisión sexual causada por Treponema pallidum, que puede progresar      " +
                                                  "\n por etapas si no se trata, afectando la piel, órganos internos y el sistema nervioso. EJERCICIO. Se recomienda        " +
                                                  "\n actividad física moderada como caminatas o ejercicios de bajo impacto, que ayudan a mantener la circulación y el      " +
                                                  "\n bienestar general. Es importante evitar el sobreesfuerzo durante las fases activas de la enfermedad. HIDRATACIÓN.     " +
                                                  "\n Es fundamental consumir entre 2 y 2.5 litros de agua al día para favorecer la eliminación de toxinas y apoyar el      " +
                                                  "\n funcionamiento del sistema inmunológico. POSIBLE TRATAMIENTO. El tratamiento de elección es la penicilina benzatina,   " +
                                                  "\n administrada por vía intramuscular. En personas alérgicas, pueden utilizarse alternativas como doxiciclina o             " +
                                                  "\n azitromicina. Es esencial completar el tratamiento y realizar seguimiento médico para evitar recaídas o complicaciones.    " +
                                                  "\n ALIMENTACIÓN RECOMENDADA. Consumir alimentos que fortalezcan el sistema inmunológico y favorezcan la regeneración celular.   " +
                                                  "\n Frutas como kiwi y fresas, ricas en vitamina C, que ayudan a combatir infecciones, aportando hasta el 90% del requerimiento  " +
                                                  "\n diario por cada 100 g. Hígado de res, fuente de vitamina B12 y hierro, esenciales para la producción de glóbulos rojos.   " +
                                                  "\n Verduras como brócoli y espinaca, ricas en ácido fólico y antioxidantes. Yogur natural, fuente de probióticos que         " +
                                                  "\n fortalecen la flora intestinal. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza        " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello     " +
                                                  "\n se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su     " +
                                                  "\n paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar   " +
                                                  "\n a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n La tuberculosis es una infección bacteriana causada por Mycobacterium tuberculosis, que afecta principalmente               " +
                                                  "\n los pulmones y puede causar tos persistente, fiebre, sudoración nocturna y pérdida de peso. En adultos mayores,             " +
                                                  "\n el diagnóstico puede ser más complejo por síntomas atípicos. EJERCICIO. Se recomienda actividad física moderada             " +
                                                  "\n como caminatas suaves o ejercicios respiratorios, que ayudan a mejorar la capacidad pulmonar y reducir la fatiga.           " +
                                                  "\n Es importante evitar el esfuerzo excesivo durante el tratamiento activo. HIDRATACIÓN. Es fundamental consumir entre         " +
                                                  "\n 2.5 y 3 litros de agua al día para mantener las vías respiratorias hidratadas y facilitar la eliminación de toxinas.        " +
                                                  "\n También se recomienda el consumo de líquidos tibios como caldos o infusiones para aliviar la garganta. POSIBLE              " +
                                                  "\n TRATAMIENTO. El tratamiento estándar incluye una combinación de antibióticos como isoniazida, rifampicina, pirazinamida     " +
                                                  "\n y etambutol durante al menos seis meses. Es crucial seguir el tratamiento completo para evitar recaídas o resistencia       " +
                                                  "\n bacteriana. ALIMENTACIÓN RECOMENDADA. Consumir alimentos ricos en proteínas, vitaminas y minerales para fortalecer el       " +
                                                  "\n sistema inmunológico. Huevos y carnes magras, fuentes de proteínas de alta calidad. Frutas como guayaba y papaya, ricas     " +
                                                  "\n en vitamina C, que fortalecen el sistema inmune, aportando hasta el 200% del requerimiento diario por cada 100 g. Lácteos   " +
                                                  "\n como leche y yogur, ricos en calcio y vitamina D, esenciales para la recuperación. Verduras como zanahoria y espinaca,      " +
                                                  "\n ricas en vitamina A y hierro, que favorecen la regeneración celular. Este es solo un diagnóstico predeterminado lógico,     " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas  " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el       " +
                                                  "\n tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le     " +
                                                  "\n recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n EJERCICIO: La actividad física regular es esencial para mantener la movilidad y reducir el dolor articular           " +
                                                  "\n en personas con artritis. Se recomienda realizar ejercicios de bajo impacto como caminatas suaves, natación          " +
                                                  "\n o tai chi durante 30 minutos al día, cinco veces por semana. También es beneficioso incluir ejercicios de            " +
                                                  "\n fortalecimiento muscular con bandas elásticas o pesas ligeras, así como estiramientos suaves para mejorar la         " +
                                                  "\n flexibilidad y prevenir la rigidez. HIDRATACIÓN: Es fundamental consumir entre 2 y 2.5 litros de agua al día         " +
                                                  "\n para mantener la lubricación de las articulaciones y facilitar la eliminación de toxinas. La hidratación             " +
                                                  "\n adecuada también ayuda a reducir la inflamación y mejora la absorción de nutrientes esenciales para la salud         " +
                                                  "\n ósea y articular. POSIBLE TRATAMIENTO: El tratamiento de la artritis puede incluir medicamentos antiinflamatorios    " +
                                                  "\n no esteroideos como el ibuprofeno o el naproxeno, analgésicos como el paracetamol, y fármacos modificadores          " +
                                                  "\n de la enfermedad como el metotrexato o la sulfasalazina. En casos más avanzados, se pueden utilizar terapias         " +
                                                  "\n biológicas como los inhibidores del TNF. También se recomienda la fisioterapia y el uso de compresas calientes       " +
                                                  "\n o frías para aliviar el dolor. ALIMENTACIÓN: Se recomienda el consumo de alimentos con propiedades antiinflamatorias " +
                                                  "\n y ricos en nutrientes esenciales, tales como pescados grasos como salmón y sardinas, que aportan ácidos grasos       " +
                                                  "\n Omega-3 en un 70% de la ingesta diaria recomendada, ayudando a reducir la inflamación articular. Frutas como         " +
                                                  "\n cerezas y fresas, que contienen antioxidantes y vitamina C en un 89% de la ingesta diaria recomendada, fortaleciendo " +
                                                  "\n el sistema inmunológico. Verduras como brócoli y espinacas, que aportan vitamina K y calcio en un 50% de la ingesta  " +
                                                  "\n diaria recomendada, esenciales para la salud ósea. Frutos secos como nueces y almendras, que contienen vitamina E y  " +
                                                  "\n magnesio, contribuyendo con hasta un 40% de la ingesta diaria recomendada de estos nutrientes beneficiosos para las  " +
                                                  "\n articulaciones. este es solo un diagnóstico predeterminado lógico. haberlo consultado no garantiza al 100% que la    " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar más de un  " +
                                                  "\n diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico   " +
                                                  "\n no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida)  " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n EJERCICIO: Durante la infección por tosferina se recomienda evitar esfuerzos físicos intensos y priorizar el descanso      " +
                                                  "\n absoluto, ya que los ataques de tos pueden ser debilitantes. Una vez que los síntomas disminuyen, se pueden realizar       " +
                                                  "\n ejercicios suaves como caminatas lentas o ejercicios de respiración para mejorar la oxigenación pulmonar y reducir la      " +
                                                  "\n fatiga. HIDRATACIÓN: Es crucial consumir al menos 2.5 litros de agua al día para mantener las vías respiratorias           " +
                                                  "\n hidratadas y facilitar la expulsión de mucosidades. También se recomienda el consumo de infusiones tibias como             " +
                                                  "\n manzanilla o jengibre, que ayudan a calmar la garganta y reducir la tos. POSIBLE TRATAMIENTO: El tratamiento de la         " +
                                                  "\n tosferina incluye antibióticos como la azitromicina, claritromicina o eritromicina, especialmente si se administra         " +
                                                  "\n en las primeras etapas de la enfermedad. También se pueden utilizar broncodilatadores y humidificadores de vapor frío      " +
                                                  "\n para aliviar los síntomas respiratorios. Es importante mantener el entorno libre de humo, polvo y vapores irritantes.      " +
                                                  "\n ALIMENTACIÓN: Se recomienda el consumo de alimentos suaves y ricos en nutrientes para fortalecer el sistema inmunológico,  " +
                                                  "\n tales como frutas cítricas como naranjas y mandarinas, que aportan vitamina C en un 89% de la ingesta diaria recomendada,  " +
                                                  "\n ayudando a combatir infecciones. Caldos naturales y sopas de verduras, que aportan líquidos, minerales y vitaminas         " +
                                                  "\n esenciales como el potasio y la vitamina A. Miel natural en pequeñas cantidades, que posee propiedades antimicrobianas y   " +
                                                  "\n suaviza la garganta. Yogur natural, que contiene probióticos beneficiosos para la flora intestinal y el sistema inmune.    " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico. haberlo consultado no garantiza al 100% que la paciente tenga esta      " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar más de un diagnóstico para mayor     " +
                                                  "\n seguridad en el tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se   " +
                                                  "\n recomienda consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n EJERCICIO: Durante la infección por paperas se recomienda reposo absoluto, ya que la inflamación de las           " +
                                                  "\n glándulas salivales puede causar dolor al moverse o hablar. Una vez que los síntomas disminuyen, se pueden        " +
                                                  "\n realizar ejercicios suaves como estiramientos o caminatas cortas para mejorar la circulación y reducir la         " +
                                                  "\n rigidez muscular. HIDRATACIÓN: Es fundamental consumir al menos 2.5 litros de agua al día para mantener la        " +
                                                  "\n hidratación y facilitar la recuperación. También se recomienda el consumo de líquidos tibios como caldos,         " +
                                                  "\n infusiones suaves y jugos naturales sin azúcar, que ayudan a aliviar el dolor en las glándulas salivales y        " +
                                                  "\n a mantener el equilibrio de electrolitos. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral específico      " +
                                                  "\n para las paperas, pero los síntomas pueden aliviarse con analgésicos como el paracetamol o el ibuprofeno,         " +
                                                  "\n compresas frías en las zonas inflamadas y reposo. También se recomienda evitar alimentos ácidos o duros que       " +
                                                  "\n puedan irritar las glándulas salivales. ALIMENTACIÓN: Se recomienda el consumo de alimentos blandos y ricos       " +
                                                  "\n en nutrientes para facilitar la masticación y fortalecer el sistema inmunológico, tales como frutas como melón    " +
                                                  "\n y plátano, que aportan potasio y vitamina C en un 70% de la ingesta diaria recomendada, ayudando a reducir la         " +
                                                  "\n inflamación. Verduras cocidas como calabaza y zanahoria, que contienen vitamina A y antioxidantes esenciales para     " +
                                                  "\n la regeneración celular. Yogur natural, que aporta probióticos y proteínas de fácil digestión. Sopas de verduras,     " +
                                                  "\n que hidratan y aportan minerales como el sodio y el magnesio. este es solo un diagnóstico predeterminado lógico.      " +
                                                  "\n Haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente" +
                                                  "\n correctas. se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. además,  " +
                                                  "\n por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.      " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACIÓN: Para el tratamiento del zika es fundamental mantener una hidratación adecuada con un consumo diario        " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para prevenir la deshidratación    " +
                                                  "\n causada por la fiebre y apoyar el sistema inmunológico. EJERCICIO: Se recomienda actividad física ligera como           " +
                                                  "\n estiramientos suaves o caminatas cortas dentro del hogar evitando esfuerzos intensos mientras persistan los síntomas.   " +
                                                  "\n Una vez superada la fase aguda es recomendable realizar ejercicios de movilidad y respiración para recuperar energía    " +
                                                  "\n y mejorar la circulación. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral específico para el zika. El manejo    " +
                                                  "\n es sintomático e incluye reposo abundante, hidratación constante y medicamentos como el paracetamol para reducir la     " +
                                                  "\n fiebre y el dolor. No se recomienda el uso de aspirina ni antiinflamatorios no esteroideos hasta descartar dengue por   " +
                                                  "\n riesgo de hemorragias. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunológico se recomienda el consumo de      " +
                                                  "\n NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la duración de los síntomas aportando aproximadamente el   " +
                                                  "\n 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos con propiedades antiinflamatorias  " +
                                                  "\n que pueden aliviar el malestar general. ESPINACAS Y BRÓCOLI: Aportan antioxidantes y vitamina A esenciales para la         " +
                                                  "\n regeneración celular con un contenido de aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos.         " +
                                                  "\n YOGUR NATURAL: Contiene probióticos que fortalecen el sistema inmunológico y mejoran la salud digestiva aportando calcio   " +
                                                  "\n y proteínas esenciales. Este es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza al 100% que el   " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer más de     " +
                                                  "\n un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente además por su salud    " +
                                                  "\n si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico Angel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACIÓN: Para el tratamiento del rotavirus es fundamental mantener una hidratación adecuada con un consumo        " +
                                                  "\n diario recomendado de 2.5 litros de agua aproximadamente 10 vasos de tamaño regular para reponer los líquidos         " +  
                                                  "\n perdidos por la diarrea y prevenir la deshidratación severa. EJERCICIO: Se recomienda reposo durante la fase          " +
                                                  "\n aguda de la enfermedad y posteriormente actividad física ligera como caminatas suaves y ejercicios de movilidad       " +
                                                  "\n para recuperar energía y fortalecer el sistema digestivo. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral     " +
                                                  "\n específico para el rotavirus. El manejo se basa en el control de los síntomas y la prevención de la deshidratación.   " +
                                                  "\n En casos graves puede requerirse rehidratación oral con soluciones como Vida Suero Oral o incluso intravenosa. No     " +
                                                  "\n se recomiendan medicamentos antidiarreicos. ALIMENTOS RECOMENDADOS: Para estabilizar el sistema digestivo se          " +
                                                  "\n recomienda el consumo de PLÁTANOS: Ricos en potasio que ayuda a reemplazar los electrolitos perdidos aportando        " +
                                                  "\n aproximadamente el 12% de la ingesta diaria recomendada por cada 100 gramos. ARROZ BLANCO: Fuente de carbohidratos    " +
                                                  "\n de fácil digestión que ayuda a estabilizar el sistema digestivo. ZANAHORIAS: Ricas en vitamina A y antioxidantes         " + 
                                                  "\n que ayudan a la regeneración celular aportando aproximadamente el 56% de la ingesta diaria recomendada por cada 100      " +
                                                  "\n gramos. YOGUR NATURAL: Contiene probióticos que fortalecen el sistema digestivo y mejoran la salud intestinal aportando  " +
                                                  "\n calcio y proteínas esenciales. Este es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza al 100% " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer   " +
                                                  "\n más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente además por    " +
                                                  "\n su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico Angel     " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la listeriosis es fundamental mantener una hidratación adecuada con un consumo            " + 
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para apoyar la eliminación        " +
                                                  "\n de toxinas y mantener el equilibrio del sistema inmunológico. EJERCICIO: Se recomienda actividad física ligera como           " +
                                                  "\n caminatas suaves ejercicios de estiramiento y respiración profunda para mejorar la circulación y fortalecer el sistema        " +
                                                  "\n inmunológico evitando esfuerzos intensos durante el tratamiento. POSIBLE TRATAMIENTO: El tratamiento suele incluir            " +
                                                  "\n antibióticos como la ampicilina o la penicilina G en combinación con gentamicina en casos graves. Es fundamental iniciar      " +
                                                  "\n el tratamiento lo antes posible y seguir estrictamente las indicaciones médicas. ALIMENTOS RECOMENDADOS: Para fortalecer      " +
                                                  "\n el sistema inmunológico se recomienda el consumo de FRUTOS ROJOS: Ricos en antioxidantes y vitamina C que ayudan a combatir   " +
                                                  "\n infecciones aportando aproximadamente el 70% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene         " +
                                                  "\n compuestos con propiedades antiinflamatorias que pueden ayudar a reducir la inflamación. ESPINACAS Y BRÓCOLI: Aportan         " +
                                                  "\n antioxidantes y vitamina A esenciales para la regeneración celular con un contenido de aproximadamente 56% de la ingesta      " +
                                                  "\n diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probióticos que fortalecen el sistema inmunológico y mejoran  " +
                                                  "\n la salud digestiva aportando calcio y proteínas esenciales. Este es solo un diagnóstico predeterminado lógico haberlo         " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas      " +
                                                  "\n para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado     " +
                                                  "\n de su paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar  " +
                                                  "\n a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 a 3 litros de agua al día (diez a doce vasos de agua de tamaño regular)     " +
                                                  "\n para prevenir la deshidratación causada por la diarrea, mantener el equilibrio electrolítico y apoyar la función renal.  " +
                                                  "\n En mujeres adultas mayores, también se sugiere el uso de soluciones de rehidratación oral en casos de pérdida            " +
                                                  "\n significativa de líquidos. EJERCICIO: Durante la fase aguda se recomienda reposo absoluto. Una vez superados             " +
                                                  "\n los síntomas, se puede retomar actividad física ligera como caminatas suaves para estimular la digestión y mejorar       " +
                                                  "\n la circulación. POSIBLE TRATAMIENTO: El tratamiento incluye antibióticos como Ciprofloxacino (500 mg dos veces al        " +
                                                  "\n día por 3 a 5 días) o Ceftriaxona (1 a 2 g diarios por vía intramuscular en casos graves o si no es posible la vía       " +
                                                  "\n oral). También puede utilizarse Azitromicina (500 mg el primer día, luego 250 mg diarios por 4 días) si hay resistencia  " +
                                                  "\n o intolerancia a los anteriores. Es fundamental evitar medicamentos antidiarreicos como la loperamida, ya que pueden     " +
                                                  "\n empeorar la infección. ALIMENTACIÓN: Se recomienda una dieta suave, rica en nutrientes que favorezcan la recuperación    " +
                                                  "\n intestinal como: Plátanos (aportan potasio, 23% del requerimiento diario por cada 100 g); Zanahorias cocidas (ricas en   " +
                                                  "\n vitamina A, 93% por cada 100 g); Arroz blanco (fuente de energía y fácil digestión); Manzanas cocidas (con pectina, que  " +
                                                  "\n ayuda a regular el tránsito intestinal); y Yogur natural (rico en probióticos y calcio, 30% por cada 100 g). Este es     " +
                                                  "\n solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida   " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le  " +
                                                  "\n satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera   " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 litros de agua al día (diez vasos de agua de tamaño regular) para mantener    " +
                                                  "\n las vías respiratorias hidratadas, facilitar la expectoración y mejorar la oxigenación. También se sugiere el uso de       " +
                                                  "\n infusiones calientes con jengibre o eucalipto para aliviar la congestión bronquial. EJERCICIO: Actividad física moderada   " +
                                                  "\n y controlada como caminatas, ejercicios de respiración diafragmática y entrenamiento pulmonar puede mejorar la capacidad   " + 
                                                  "\n respiratoria y reducir la disnea. Se recomienda realizar rehabilitación pulmonar supervisada, especialmente en mujeres     " +
                                                  "\n adultas mayores con limitación funcional. POSIBLE TRATAMIENTO: El tratamiento incluye broncodilatadores inhalados como     " +
                                                  "\n Salbutamol o Tiotropio, corticosteroides inhalados como Budesonida o Fluticasona, y en casos avanzados, oxigenoterapia     " +
                                                  "\n domiciliaria. También se pueden usar antibióticos en caso de exacerbaciones infecciosas y vacunas anuales contra la        " +
                                                  "\n influenza y el neumococo. Es fundamental el abandono del tabaco y el control de comorbilidades como hipertensión o         " +
                                                  "\n diabetes. ALIMENTACIÓN: Se recomienda una dieta rica en antioxidantes y nutrientes antiinflamatorios como: Brócoli         " +
                                                  "\n (con vitamina C y sulforafano, 135% y 20% respectivamente por cada 100 g); Pescados grasos (ricos en Omega-3, 50% por      " +
                                                  "\n cada 100 g); Frutas cítricas (con vitamina C, 89% por cada 100 g); Espinacas (con vitamina A y hierro, 56% y 15%           " +
                                                  "\n respectivamente por cada 100 g); y Nueces (con ácido alfa-linolénico, 91% por cada 30 g). Este es solo un diagnóstico      " +
                                                  "\n predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor     " +
                                                  "\n seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se   " +
                                                  "\n recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2 a 2.5 litros de agua al día (ocho a diez vasos de agua de tamaño regular)    " +
                                                  "\n para apoyar la función renal, facilitar la eliminación de toxinas y mantener el equilibrio electrolítico durante el     " +
                                                  "\n tratamiento antibiótico. También se sugiere el consumo de jugos naturales sin azúcar y caldos suaves. EJERCICIO:        " +
                                                  "\n Actividad física ligera como caminatas o estiramientos suaves puede ayudar a mejorar la circulación y fortalecer el     " +
                                                  "\n sistema inmune. Se debe evitar el ejercicio intenso durante el tratamiento para no comprometer la recuperación.         " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento incluye antibióticos como Azitromicina (1 g en dosis única) o Doxiciclina (100 mg   " +
                                                  "\n dos veces al día durante 7 días). En mujeres adultas mayores, es importante ajustar las dosis si hay insuficiencia      " +
                                                  "\n renal o hepática, y realizar seguimiento para confirmar la erradicación de la bacteria. También se recomienda tratar    " +
                                                  "\n a todas las parejas sexuales recientes y evitar relaciones sexuales durante al menos 7 días tras el inicio del          " +
                                                  "\n tratamiento. ALIMENTACIÓN: Se recomienda una dieta que apoye la función inmunológica y la recuperación, incluyendo:     " +
                                                  "\n Naranjas (ricas en vitamina C, 89% por cada 100 g); Espinacas (fuente de hierro y ácido fólico, 56% y 49% respectivamente " +
                                                  "\n por cada 100 g); Yogur natural (rico en probióticos y calcio, 30% de la ingesta diaria recomendada por cada 100 g);    " +
                                                  "\n Ajo (con propiedades antibacterianas naturales); y Zanahorias (ricas en vitamina A, 93% por cada 100 g), que ayudan    " +
                                                  "\n a mantener la integridad de las mucosas. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no      " +
                                                  "\n garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, " +
                                                  "\n se recomienda realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado.    " +
                                                  "\n Además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico.   " +
                                                  "\n Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana. " +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidratación   " +
                                                  "\n óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda   " +
                                                  "\n reposo absoluto durante la fase aguda de la enfermedad para evitar complicaciones neurológicas. Una vez superada esta     " +
                                                  "\n etapa, se pueden incorporar caminatas suaves de 15 a 20 minutos al día, ejercicios de movilidad articular y respiración   " +
                                                  "\n profunda para mejorar la oxigenación cerebral y prevenir la rigidez muscular. También es útil realizar ejercicios de      " +
                                                  "\n equilibrio y coordinación para recuperar la funcionalidad neurológica. HIDRATACIÓN. Se aconseja consumir entre 2.5 y 3    " +
                                                  "\n litros de agua al día para mantener el equilibrio de líquidos, facilitar la eliminación de toxinas y apoyar la función    " +
                                                  "\n renal durante el tratamiento antibiótico. También se recomienda el consumo de caldos naturales, infusiones suaves y       " +
                                                  "\n jugos naturales ricos en vitamina C para fortalecer el sistema inmunológico. POSIBLE TRATAMIENTO. El tratamiento para     " +
                                                  "\n la meningitis bacteriana incluye la administración inmediata de antibióticos por vía intravenosa como ceftriaxona,        " +
                                                  "\n vancomicina o ampicilina, dependiendo del agente causal. En algunos casos se añaden corticosteroides como la dexametasona   " +
                                                  "\n para reducir la inflamación cerebral. Marcas reconocidas incluyen Rocephin, Vancocin y Ampicillin. Es fundamental iniciar   " +
                                                  "\n el tratamiento lo antes posible para evitar secuelas neurológicas. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica   " +
                                                  "\n en proteínas, antioxidantes y vitaminas del complejo B para apoyar la recuperación neurológica. Algunos alimentos clave     " +
                                                  "\n incluyen carnes magras y pescado, fuentes de proteínas esenciales. Frutas cítricas como naranja y kiwi, ricas en vitamina C," +
                                                  "\n que fortalecen el sistema inmune, aportando el 89% del requerimiento diario por cada 100 gramos. Verduras como espinaca  " +
                                                  "\n y brócoli, ricas en ácido fólico y vitamina B9, esenciales para la regeneración celular, con un aporte del 15% del       " +
                                                  "\n requerimiento diario por cada 100 gramos. Frutos secos como almendras y nueces, ricos en vitamina E y ácidos grasos      " +
                                                  "\n esenciales, que protegen las células nerviosas y aportan el 37% del requerimiento diario por cada 28 gramos. Este        " +
                                                  "\n diagnóstico es una referencia lógica basada en información médica, pero no garantiza al 100% que el paciente tenga       " +
                                                  "\n meningitis bacteriana ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar    " +
                                                  "\n a un médico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidratación    " +
                                                  "\n óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda    " +
                                                  "\n actividad física regular como caminatas suaves, ejercicios de resistencia moderada y estiramientos durante al menos 150    " +
                                                  "\n minutos semanales, distribuidos en cinco días. También se aconseja incluir ejercicios de fuerza dos veces por semana       " +
                                                  "\n para prevenir la pérdida de masa muscular y ósea. La actividad física mejora el estado de ánimo, fortalece el sistema      " +
                                                  "\n inmunológico y reduce la fatiga asociada al tratamiento. HIDRATACIÓN. Se aconseja consumir entre 2 y 2.5 litros de agua    " +
                                                  "\n al día para apoyar la función renal, facilitar la absorción de medicamentos y prevenir infecciones urinarias. También      " +
                                                  "\n se recomienda el consumo de caldos naturales, jugos sin azúcar y bebidas con electrolitos en caso de diarrea o fiebre.     " +
                                                  "\n POSIBLE TRATAMIENTO. El tratamiento para el cáncer depende del tipo y estadio, pero puede incluir cirugía, quimioterapia,  " +
                                                  "\n radioterapia, inmunoterapia o terapia hormonal. En mujeres adultas mayores, se realiza una valoración geriátrica integral  " +
                                                  "\n para personalizar el tratamiento y minimizar efectos secundarios. Medicamentos comunes incluyen paclitaxel, letrozol,      " +
                                                  "\n tamoxifeno o capecitabina. Marcas reconocidas incluyen Taxol, Femara y Xeloda. ALIMENTACIÓN RECOMENDADA. Se recomienda     " +
                                                  "\n una dieta equilibrada rica en proteínas, antioxidantes y grasas saludables. Algunos alimentos clave incluyen pescados      " +
                                                  "\n grasos como salmón y atún, ricos en omega-3, que ayudan a reducir la inflamación y fortalecen el sistema inmune, aportando " +
                                                  "\n el 70% del requerimiento diario por cada 100 gramos. Frutas como papaya, mango y naranja, ricas en vitamina C y            " +
                                                  "\n betacarotenos, que fortalecen el sistema inmune, con un aporte del 90% del requerimiento diario por cada 100 gramos.       " +
                                                  "\n Verduras como espinaca, zanahoria y brócoli, ricas en vitamina A, hierro y antioxidantes, que ayudan a prevenir infecciones" +
                                                  "\n oportunistas. Frutos secos como almendras y nueces, ricos en vitamina E y ácidos grasos esenciales, con un aporte del 37%  " +
                                                  "\n del requerimiento diario por cada 28 gramos. Este diagnóstico es una referencia lógica basada en información médica, pero  " +
                                                  "\n no garantiza al 100% que el paciente tenga cáncer ni que el tratamiento sea el adecuado. Se recomienda realizar más de un  " +
                                                  "\n diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera    " +
                                                  "\n que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.30-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidratación     " +
                                                  "\n óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda     " +
                                                  "\n actividad física moderada como caminatas suaves de 30 minutos al día, cinco veces por semana, acompañadas de ejercicios     " +
                                                  "\n de respiración profunda para mejorar la oxigenación y reducir la congestión. También es útil realizar estiramientos         " +
                                                  "\n suaves y ejercicios de movilidad para mantener la circulación activa sin agotar al cuerpo. HIDRATACIÓN. Se aconseja         " +
                                                  "\n consumir entre 2.5 y 3 litros de agua al día para compensar la pérdida de líquidos por fiebre y sudoración, mantener        " +
                                                  "\n las mucosas hidratadas y facilitar la eliminación de toxinas. También se recomienda el consumo de caldos naturales,         " +
                                                  "\n infusiones tibias de jengibre o manzanilla y jugos cítricos sin azúcar añadida para reforzar el sistema inmunológico.       " +
                                                  "\n POSIBLE TRATAMIENTO. El tratamiento para la influenza incluye antivirales como oseltamivir (marca reconocida: Tamiflu)      " +
                                                  "\n que deben administrarse en las primeras 48 horas de síntomas. También se utilizan medicamentos para aliviar fiebre y        " +
                                                  "\n dolor como paracetamol (Tempra) o ibuprofeno (Advil). Es importante el reposo absoluto y evitar el contacto con otras       " +
                                                  "\n personas para prevenir contagios. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica en antioxidantes, vitamina C       " +
                                                  "\n y zinc. Algunos alimentos clave incluyen frutas cítricas como naranja, toronja y kiwi, ricas en vitamina C, que fortalecen  " +
                                                  "\n el sistema inmune, aportando el 89% del requerimiento diario por cada 100 gramos. Verduras como espinaca y brócoli, ricas   " +
                                                  "\n en vitamina A y ácido fólico, que ayudan a la regeneración celular y fortalecen las mucosas, con un aporte del 15% del      " +
                                                  "\n requerimiento diario por cada 100 gramos. Frutos secos como almendras y nueces, ricos en vitamina E y ácidos grasos         " +
                                                  "\n esenciales, que protegen las células inmunológicas, con un aporte del 37% del requerimiento diario por cada 28 gramos.      " +
                                                  "\n Este diagnóstico es una referencia lógica basada en información médica, pero no garantiza al 100% que el paciente tenga     " +
                                                  "\n influenza ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico       " +
                                                  "\n para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumonía." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidratación     " +
                                                  "\n óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda     " +
                                                  "\n reposo durante la fase aguda de la enfermedad. Una vez superada esta etapa, se pueden incorporar caminatas suaves de 15     " +
                                                  "\n a 20 minutos al día, ejercicios de respiración profunda y estiramientos para mejorar la oxigenación y prevenir la rigidez   " +
                                                  "\n muscular. También es útil realizar ejercicios de equilibrio y coordinación para recuperar la funcionalidad neurológica.     " +
                                                  "\n HIDRATACIÓN. Se aconseja consumir entre 2.5 y 3 litros de agua al día para mantener el equilibrio de líquidos, facilitar    " +
                                                  "\n la eliminación de toxinas y apoyar la función renal durante el tratamiento antibiótico. También se recomienda el consumo    " +
                                                  "\n de caldos naturales, infusiones suaves y jugos naturales ricos en vitamina C. POSIBLE TRATAMIENTO. El tratamiento para la   " +
                                                  "\n neumonía incluye antibióticos como amoxicilina con ácido clavulánico, ceftriaxona o levofloxacino, dependiendo del agente   " +
                                                  "\n causal. Marcas reconocidas incluyen Clavulin, Rocephin y Tavanic. En algunos casos se añaden corticosteroides como la       " +
                                                  "\n dexametasona para reducir la inflamación pulmonar. Es fundamental iniciar el tratamiento lo antes posible para evitar       " +
                                                  "\n complicaciones. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica en proteínas, antioxidantes y vitaminas del          " +
                                                  "\n complejo B. Algunos alimentos clave incluyen carnes magras y pescado, fuentes de proteínas esenciales. Frutas cítricas      " +
                                                  "\n como naranja y kiwi, ricas en vitamina C, que fortalecen el sistema inmune, aportando el 89% del requerimiento diario       " +
                                                  "\n por cada 100 gramos. Verduras como espinaca y brócoli, ricas en ácido fólico y vitamina B9, esenciales para la regeneración " +
                                                  "\n celular, con un aporte del 15% del requerimiento diario por cada 100 gramos. Frutos secos como almendras y nueces, ricos en " +
                                                  "\n vitamina E y ácidos grasos esenciales, que protegen las células inmunológicas y aportan el 37% del requerimiento diario por " +
                                                  "\n cada 28 gramos. Este diagnóstico es una referencia lógica basada en información médica, pero no garantiza al 100% que el    " +
                                                  "\n paciente tenga neumonía ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar a   " +
                                                  "\n un médico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visión borrosa, Pérdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes. " +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidratación    " +
                                                  "\n óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda    " +
                                                  "\n actividad física regular como caminatas de 30 minutos al día, cinco veces por semana, ejercicios de resistencia moderada   " +
                                                  "\n y estiramientos. También se aconseja incluir ejercicios de fuerza dos veces por semana para prevenir la pérdida de masa    " +
                                                  "\n muscular y ósea. La actividad física mejora la sensibilidad a la insulina, regula la glucosa y reduce el riesgo            " +
                                                  "\n cardiovascular. HIDRATACIÓN. Se aconseja consumir entre 2 y 2.5 litros de agua al día para apoyar la función renal,        " +
                                                  "\n facilitar la absorción de medicamentos y prevenir infecciones urinarias. También se recomienda el consumo de caldos        " +
                                                  "\n naturales, infusiones sin azúcar y bebidas con electrolitos en caso de diarrea o fiebre. POSIBLE TRATAMIENTO. El           " +
                                                  "\n tratamiento para la diabetes incluye medicamentos orales como metformina, glibenclamida o sitagliptina, y en algunos       " +
                                                  "\n casos insulina. Marcas reconocidas incluyen Glucophage, Diamicron y Januvia. Es fundamental mantener una adherencia        " + 
                                                  "\n estricta al tratamiento y realizar controles periódicos de glucosa. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta         " +
                                                  "\n equilibrada rica en fibra, proteínas magras y carbohidratos complejos. Algunos alimentos clave incluyen cereales integrales   " +
                                                  "\n como avena y arroz integral, que ayudan a mantener niveles estables de glucosa. Frutas como manzana y pera, ricas en fibra    " +
                                                  "\n soluble, que ralentizan la absorción de azúcar, con un aporte del 15% del requerimiento diario por cada 100 gramos. Verduras  " +
                                                  "\n como espinaca, brócoli y zanahoria, ricas en vitamina A, hierro y antioxidantes, que ayudan a prevenir complicaciones. Frutos " +
                                                  "\n secos como almendras y nueces, ricos en vitamina E y ácidos grasos esenciales, con un aporte del 37% del requerimiento diario " +
                                                  "\n por cada 28 gramos. Este diagnóstico es una referencia lógica basada en información médica, pero no garantiza al 100% que el  " +
                                                  "\n paciente tenga diabetes ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un  " +
                                                  "\n médico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresión en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n El asma es una enfermedad inflamatoria crónica de las vías respiratorias que puede causar dificultad para respirar,         " +
                                                  "\n tos, opresión en el pecho y sibilancias. En la adultez mayor, los síntomas pueden confundirse con otras afecciones          " +
                                                  "\n respiratorias, por lo que es fundamental un diagnóstico y manejo adecuados. EJERCICIO. Se recomienda actividad física       " +
                                                  "\n moderada y controlada, como caminatas suaves, ejercicios de respiración y estiramientos, evitando ambientes fríos o         " +
                                                  "\n contaminados. Es importante realizar calentamiento previo y enfriamiento posterior, así como adaptar la intensidad          " +
                                                  "\n según la capacidad respiratoria del paciente. HIDRATACIÓN. Es fundamental consumir entre 2 y 2.5 litros de agua al          " +
                                                  "\n día para mantener las vías respiratorias hidratadas, facilitar la eliminación de secreciones y reducir la irritación        " +
                                                  "\n bronquial. También se recomienda el consumo de líquidos tibios como infusiones de jengibre o manzanilla. POSIBLE            " +
                                                  "\n TRATAMIENTO. El tratamiento incluye broncodilatadores de acción rápida como el salbutamol, corticosteroides inhalados       " +
                                                  "\n como la fluticasona o budesonida, y en algunos casos, modificadores de leucotrienos como el montelukast. Es esencial        " +
                                                  "\n seguir un plan de acción personalizado y utilizar los medicamentos preventivos de forma regular. ALIMENTACIÓN RECOMENDADA.  " +
                                                  "\n Consumir alimentos que reduzcan la inflamación y fortalezcan el sistema respiratorio. Pescados grasos como salmón y atún,   " +
                                                  "\n ricos en ácidos grasos Omega-3, que poseen propiedades antiinflamatorias, aportando hasta el 90% del requerimiento diario   " +
                                                  "\n por cada 100 g. Frutas como fresas y arándanos, ricas en vitamina C y antioxidantes, que fortalecen el sistema inmune,      " +
                                                  "\n aportando cerca del 70% del requerimiento diario por cada 100 g. Verduras como espinaca y brócoli, ricas en hierro,         " +
                                                  "\n vitamina A y carotenoides, esenciales para la salud pulmonar. Este es solo un diagnóstico predeterminado lógico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén    " +
                                                  "\n correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento " +
                                                  "\n adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda      " +
                                                  "\n mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, Pérdida de peso, Ganglios linfáticos inflamados, Erupción cutánea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n El VIH es un virus que debilita el sistema inmunológico, y si no se trata adecuadamente, puede progresar a SIDA,        " +
                                                  "\n una condición que deja al cuerpo vulnerable a infecciones y enfermedades graves. En la adultez mayor, el                " +
                                                  "\n diagnóstico puede retrasarse y el tratamiento debe considerar otras condiciones crónicas. EJERCICIO. Se recomienda      " +
                                                  "\n actividad física moderada como caminatas, yoga o ejercicios de bajo impacto, que ayudan a fortalecer el sistema         " +
                                                  "\n inmune, mejorar el estado de ánimo y mantener la masa muscular. Es importante evitar el sobreesfuerzo y adaptar la      " +
                                                  "\n rutina a la condición física del paciente. HIDRATACIÓN. Es fundamental consumir entre 2 y 2.5 litros de agua al día     " +
                                                  "\n para apoyar la función renal, facilitar la eliminación de toxinas y mantener el equilibrio corporal. También se         " +
                                                  "\n recomienda el consumo de líquidos ricos en electrolitos en caso de fiebre o diarrea. POSIBLE TRATAMIENTO. El            " +
                                                  "\n tratamiento consiste en terapia antirretroviral (TAR), que incluye combinaciones de medicamentos como tenofovir,        " +
                                                  "\n emtricitabina, dolutegravir o efavirenz, que ayudan a mantener la carga viral indetectable y preservar la función       " +
                                                  "\n inmunológica. Es esencial la adherencia estricta al tratamiento y el monitoreo médico constante. ALIMENTACIÓN           " +
                                                  "\n RECOMENDADA. Consumir alimentos que fortalezcan el sistema inmunológico y prevengan la pérdida de peso. Frutas como     " +
                                                  "\n papaya y guayaba, ricas en vitamina C, que fortalecen las defensas, aportando hasta el 200% del requerimiento diario    " +
                                                  "\n por cada 100 g. Lácteos como yogur natural, fuente de probióticos que mejoran la flora intestinal. Carnes magras y      " +
                                                  "\n huevos, ricos en proteínas de alta calidad, esenciales para la regeneración celular. Verduras como espinaca y           " +
                                                  "\n zanahoria, ricas en vitamina A, hierro y antioxidantes. Este es solo un diagnóstico predeterminado lógico, haberlo      " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas      " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en      " +
                                                  "\n el tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo    " +
                                                  "\n se le recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreción anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n La gonorrea es una infección bacteriana de transmisión sexual causada por Neisseria gonorrhoeae, que puede afectar          " +
                                                  "\n el tracto genital, rectal o faríngeo. En mujeres mayores, puede pasar desapercibida o confundirse con otras afecciones.     " +
                                                  "\n EJERCICIO. Se recomienda actividad física ligera como caminatas o estiramientos suaves, evitando esfuerzos intensos         " +
                                                  "\n durante el tratamiento para no comprometer el sistema inmunológico. HIDRATACIÓN. Es fundamental consumir entre 2 y 2.5      " +
                                                  "\n litros de agua al día para facilitar la eliminación de toxinas, mantener la función renal y apoyar el proceso de            " +
                                                  "\n recuperación. POSIBLE TRATAMIENTO. El tratamiento de primera línea consiste en una dosis única intramuscular de             " +
                                                  "\n ceftriaxona 500 mg. En caso de alergia o dificultad de acceso, puede utilizarse cefixima 800 mg vía oral. Si no se          " +
                                                  "\n ha descartado coinfección con clamidia, se añade doxiciclina 100 mg dos veces al día por 7 días. Es importante tratar       " +
                                                  "\n también a las parejas sexuales para evitar reinfección. ALIMENTACIÓN RECOMENDADA. Consumir alimentos que fortalezcan el     " +
                                                  "\n sistema inmunológico y favorezcan la recuperación. Frutas como kiwi y naranja, ricas en vitamina C, que ayudan a combatir   " +
                                                  "\n infecciones, aportando hasta el 90% del requerimiento diario por cada 100 g. Verduras como brócoli y espinaca, ricas en     " +
                                                  "\n ácido fólico, hierro y antioxidantes. Yogur natural, fuente de probióticos que fortalecen la flora intestinal. Carnes       " +
                                                  "\n magras, ricas en proteínas necesarias para la regeneración celular. Este es solo un diagnóstico predeterminado lógico,      " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas  " +
                                                  "\n estén correctas, para ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el       " +
                                                  "\n tratamiento adecuado de su paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le     " +
                                                  "\n recomienda mucho consultar a su médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linfáticos inflamados, Úlceras o llagas dolorosas, Picazón o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n EJERCICIO: Durante los brotes activos de herpes genital se recomienda evitar la actividad física intensa y priorizar          " +
                                                  "\n el descanso, ya que el estrés físico puede agravar los síntomas. Una vez que las lesiones hayan sanado, se pueden             " +
                                                  "\n retomar ejercicios suaves como caminatas lentas, yoga o estiramientos para mejorar la circulación y reducir la tensión        " +
                                                  "\n muscular. También es útil practicar ejercicios de respiración para disminuir el estrés, que puede ser un desencadenante       " +
                                                  "\n de nuevos brotes. HIDRATACIÓN: Es fundamental consumir al menos 2.5 litros de agua al día para mantener la piel y las         " +
                                                  "\n mucosas hidratadas, lo que favorece la cicatrización de las lesiones. También se recomienda el consumo de infusiones          " +
                                                  "\n con propiedades antivirales y calmantes como el té de manzanilla o el té verde. Una hidratación adecuada ayuda a eliminar     " +
                                                  "\n toxinas y a mantener el sistema inmunológico en óptimas condiciones. POSIBLE TRATAMIENTO: El tratamiento del herpes           " +
                                                  "\n genital incluye antivirales como aciclovir, valaciclovir o famciclovir, que pueden administrarse durante 7 a 10 días          " +
                                                  "\n en episodios iniciales o de forma continua en casos de recurrencias frecuentes. En situaciones graves o en pacientes          " +
                                                  "\n inmunocomprometidos, puede ser necesario el uso de antivirales por vía intravenosa. También se pueden utilizar cremas         " +
                                                  "\n anestésicas con lidocaína para aliviar el dolor local. ALIMENTACIÓN: Se recomienda el consumo de alimentos que                " +
                                                  "\n fortalezcan el sistema inmunológico y favorezcan la regeneración de tejidos, tales como frutas cítricas como naranjas         " +
                                                  "\n y toronjas, que aportan vitamina C en un 89% de la ingesta diaria recomendada. Yogur natural, que contiene probióticos        " +
                                                  "\n que equilibran la flora vaginal y fortalecen las defensas. Verduras de hoja verde como espinacas y acelgas, que aportan       " +
                                                  "\n hasta un 50% de la ingesta diaria recomendada de vitamina A y K, esenciales para la regeneración celular. Ajo y cebolla,      " +
                                                  "\n que contienen compuestos sulfurados con propiedades antivirales y antioxidantes, contribuyendo con hasta un 40% de la         " +
                                                  "\n ingesta diaria recomendada de estos nutrientes. este es solo un diagnóstico predeterminado lógico. haberlo consultado         " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se             " +
                                                  "\n recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su salud, si la        " +
                                                  "\n respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes agradece tu           " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Úlceras indoloras, Erupción cutánea, Dolor de cabeza, Ganglios linfáticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Sífilis." +
                                                  "\n EJERCICIO: Durante el tratamiento de la sífilis se recomienda evitar esfuerzos físicos intensos, especialmente si hay   " +
                                                  "\n síntomas como fiebre, fatiga o lesiones cutáneas. Una vez estabilizada la condición, se pueden realizar ejercicios      " +
                                                  "\n suaves como caminatas o estiramientos para mejorar la circulación y apoyar el sistema inmunológico. HIDRATACIÓN: Es     " +
                                                  "\n esencial consumir entre 2 y 2.5 litros de agua al día para facilitar la eliminación de toxinas y apoyar la función      " +
                                                  "\n renal durante el tratamiento antibiótico. También se recomienda el consumo de infusiones como té de diente de león      " +
                                                  "\n o manzanilla, que ayudan a depurar el organismo y calmar el sistema digestivo. POSIBLE TRATAMIENTO: El tratamiento      " +
                                                  "\n estándar para la sífilis en etapas primaria, secundaria o latente precoz es una inyección intramuscular única de        " +
                                                  "\n penicilina G benzatina (2.4 millones de unidades). En casos de sífilis latente tardía o terciaria, se administran       " +
                                                  "\n tres dosis semanales consecutivas. Para personas alérgicas a la penicilina, se pueden usar doxiciclina o ceftriaxona.   " +
                                                  "\n Es fundamental completar el tratamiento y realizar seguimiento serológico para confirmar la curación. ALIMENTACIÓN:     " +
                                                  "\n Se recomienda el consumo de alimentos que fortalezcan el sistema inmunológico y favorezcan la regeneración celular,     " +
                                                  "\n tales como frutas como kiwi y fresas, que aportan vitamina C en un 90% de la ingesta diaria recomendada. Verduras       " +
                                                  "\n como brócoli y zanahorias, que contienen vitamina A y antioxidantes, aportando hasta un 50% de la ingesta diaria        " +
                                                  "\n recomendada. Frutos secos como almendras y nueces, que contienen vitamina E y zinc, contribuyendo con hasta un 40%      " +
                                                  "\n de la ingesta diaria recomendada de estos nutrientes esenciales para la reparación celular. este es solo un diagnóstico " +
                                                  "\n predeterminado lógico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las         " +
                                                  "\n respuestas sean completamente correctas. se recomienda realizar más de un diagnóstico para mayor seguridad en el        " +
                                                  "\n tratamiento adecuado. además, por su salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda     " +
                                                  "\n consultar a su médico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");   
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Pérdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n EJERCICIO: Durante el tratamiento de la tuberculosis se recomienda realizar actividad física moderada como caminatas     " +
                                                  "\n suaves o ejercicios de respiración para mejorar la capacidad pulmonar y reducir la fatiga. Es importante evitar el       " +
                                                  "\n esfuerzo físico excesivo, especialmente en las primeras semanas de tratamiento. La fisioterapia respiratoria puede       " +
                                                  "\n ser de gran ayuda para mejorar la oxigenación y la función pulmonar. HIDRATACIÓN: Es crucial consumir al menos 2.5       " +
                                                  "\n litros de agua al día para mantener las mucosas hidratadas, facilitar la expectoración y apoyar la función renal         " +
                                                  "\n durante el tratamiento prolongado con antibióticos. También se recomienda el consumo de caldos naturales, infusiones     " +
                                                  "\n suaves y jugos naturales sin azúcar para aportar líquidos y micronutrientes esenciales. POSIBLE TRATAMIENTO: El          " +
                                                  "\n tratamiento estándar para la tuberculosis activa incluye una combinación de antibióticos como isoniazida, rifampicina,   " +
                                                  "\n pirazinamida y etambutol durante al menos 6 meses. Es fundamental seguir el esquema completo sin interrupciones para     " +
                                                  "\n evitar recaídas o resistencia bacteriana. En casos de tuberculosis resistente, se utilizan medicamentos de segunda       " +
                                                  "\n línea y el tratamiento puede extenderse hasta 18 meses. ALIMENTACIÓN: Se recomienda el consumo de alimentos ricos        " +
                                                  "\n en proteínas, vitaminas y minerales para fortalecer el sistema inmunológico y apoyar la regeneración pulmonar, tales     " +
                                                  "\n como carnes magras y legumbres, que aportan proteínas de alta calidad. Frutas como guayaba y papaya, que contienen       " +
                                                  "\n vitamina C en un 90% de la ingesta diaria recomendada, ayudando a combatir infecciones. Verduras como espinacas y        " +
                                                  "\n brócoli, que aportan hierro, vitamina A y ácido fólico, esenciales para la producción de glóbulos rojos y la reparación  " +
                                                  "\n celular. Frutos secos como nueces y semillas de girasol, que contienen vitamina E y selenio, contribuyendo con hasta     " +
                                                  "\n un 40% de la ingesta diaria recomendada de estos antioxidantes. este es solo un diagnóstico predeterminado lógico.       " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente   " +
                                                  "\n correctas. se recomienda realizar más de un diagnóstico para mayor seguridad en el tratamiento adecuado. además, por su  " +
                                                  "\n salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchazón en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de la artritis es fundamental mantener una hidratación adecuada con un consumo diario     " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para favorecer la lubricación de      " +
                                                  "\n las articulaciones y reducir la rigidez matutina. EJERCICIO: Se recomienda actividad física regular y de bajo impacto      " +
                                                  "\n como caminatas suaves natación o ejercicios de estiramiento para mantener la movilidad articular y fortalecer los          " +
                                                  "\n músculos que rodean las articulaciones. También se sugiere la práctica de ejercicios específicos de fisioterapia           " +
                                                  "\n articular y técnicas de relajación como el yoga adaptado. POSIBLE TRATAMIENTO: El tratamiento puede incluir medicamentos   " +
                                                  "\n antiinflamatorios no esteroideos como el ibuprofeno o el naproxeno para aliviar el dolor y la inflamación además de        " +
                                                  "\n fármacos modificadores de la enfermedad como el metotrexato o la sulfasalazina. En algunos casos se utilizan               " +
                                                  "\n corticosteroides o terapias biológicas como los inhibidores del TNF. Es fundamental seguir el tratamiento indicado         " +
                                                  "\n por el reumatólogo y realizar controles periódicos. ALIMENTOS RECOMENDADOS: Para reducir la inflamación y proteger         " +
                                                  "\n las articulaciones se recomienda el consumo de PESCADOS GRASOS: Como el salmón y la sardina ricos en ácidos grasos         " +
                                                  "\n Omega-3 que aportan aproximadamente el 50% de la ingesta diaria recomendada por cada 100 gramos. FRUTOS SECOS: Como        " +
                                                  "\n nueces y almendras que contienen vitamina E y grasas saludables con un aporte del 35% de la ingesta diaria recomendada     " +
                                                  "\n por cada 30 gramos. ESPINACAS Y BRÓCOLI: Ricos en antioxidantes vitamina A y vitamina K esenciales para la salud ósea      " +
                                                  "\n y articular con un aporte del 56% de la ingesta diaria recomendada por cada 100 gramos. CÚRCUMA: Contiene curcumina        " +
                                                  "\n con propiedades antiinflamatorias naturales. Este es solo un diagnóstico predeterminado lógico haberlo consultado no       " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello       " +
                                                  "\n se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su      " +
                                                  "\n paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar     " +
                                                  "\n a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
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
                                                  "\n de la enfermedad. También se pueden utilizar broncodilatadores y humidificadores para aliviar la tos. Es importante       " +
                                                  "\n evitar el uso de medicamentos para la tos sin prescripción médica. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema     " +
                                                  "\n respiratorio se recomienda el consumo de NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la duración de      " +
                                                  "\n los síntomas aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Con         " +
                                                  "\n propiedades antiinflamatorias que pueden aliviar la irritación de garganta. MIEL Y LIMÓN: Combinación efectiva para       " +
                                                  "\n calmar la tos y suavizar la garganta aportando flavonoides y vitamina C. ESPINACAS Y BRÓCOLI: Aportan antioxidantes       " +
                                                  "\n y vitamina A esenciales para la regeneración celular con un contenido de aproximadamente 56% de la ingesta diaria         " +
                                                  "\n recomendada por cada 100 gramos. Este es solo un diagnóstico predeterminado lógico haberlo consultado no garantiza al     " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda     " +
                                                  "\n hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente además   " +
                                                  "\n por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico        " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchazón de las glándulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACIÓN: Para el tratamiento de las paperas es fundamental mantener una hidratación adecuada con un consumo diario     " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tamaño regular para prevenir la deshidratación y     " +
                                                  "\n aliviar la inflamación de las glándulas salivales. EJERCICIO: Se recomienda reposo durante la fase aguda y posteriormente  " +
                                                  "\n actividad física ligera como estiramientos suaves y caminatas cortas para recuperar energía sin forzar el sistema          " +
                                                  "\n inmunológico. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral específico para las paperas. El manejo es            " +
                                                  "\n sintomático e incluye el uso de analgésicos como el paracetamol o el ibuprofeno para reducir el dolor y la fiebre          " +
                                                  "\n además de compresas frías en las glándulas inflamadas y aislamiento durante al menos cinco días desde el inicio de         " +
                                                  "\n los síntomas. ALIMENTOS RECOMENDADOS: Para aliviar los síntomas y fortalecer el sistema inmunológico se recomienda el      " +
                                                  "\n consumo de SOPAS Y CALDOS: Fáciles de tragar y nutritivos. NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a reducir    " +
                                                  "\n la duración de los síntomas aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos.         " +
                                                  "\n JENGIBRE: Con propiedades antiinflamatorias que pueden aliviar el malestar general. ESPINACAS Y BRÓCOLI: Aportan           " +
                                                  "\n antioxidantes y vitamina A esenciales para la regeneración celular con un contenido de aproximadamente 56% de la ingesta   " +
                                                  "\n diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probióticos que fortalecen el sistema inmunológico y       " +
                                                  "\n mejoran la salud digestiva aportando calcio y proteínas esenciales. Este es solo un diagnóstico predeterminado lógico      " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente     " +
                                                  "\n correctas para ello se recomienda hacer más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento " +
                                                  "\n adecuado de su paciente además por su salud si la respuesta del Diagnóstico no le satisface del todo se le recomienda      " +
                                                  "\n mucho consultar a su médico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupción cutánea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 a 3 litros de agua al día (diez a doce vasos de agua de tamaño regular) para      " +
                                                  "\n prevenir la deshidratación causada por fiebre, sudoración y pérdida de apetito. En mujeres adultas mayores, una hidratación    " +
                                                  "\n constante también ayuda a mantener la función renal y reducir el riesgo de complicaciones neurológicas. EJERCICIO: Durante     " +
                                                  "\n la fase aguda se recomienda reposo absoluto. Una vez superados los síntomas, se puede retomar actividad física ligera como     " +
                                                  "\n caminatas suaves o ejercicios de estiramiento para mejorar la circulación y el estado de ánimo. POSIBLE TRATAMIENTO: No        " +
                                                  "\n existe un antiviral específico para el virus del Zika. El tratamiento es sintomático e incluye Paracetamol para la fiebre      " +
                                                  "\n y el dolor, antihistamínicos para el prurito y reposo. Se debe evitar el uso de aspirina o AINEs hasta descartar dengue,       " +
                                                  "\n por riesgo de hemorragias. También se recomienda el uso de repelentes y mosquiteros para evitar nuevas picaduras. En mujeres      " +
                                                  "\n adultas mayores, es importante vigilar signos de complicaciones neurológicas como debilidad muscular o alteraciones sensoriales.  " +
                                                  "\n ALIMENTACIÓN: Se sugiere una dieta rica en antioxidantes y nutrientes inmunoestimulantes como: Naranjas (con vitamina C, 89%      " +
                                                  "\n por cada 100 g); Kiwi (con vitamina C y potasio, 92% y 7% respectivamente); Aguacate (con vitamina E, 14% por cada 100 g);        " +
                                                  "\n Zanahorias (con vitamina A, 93% por cada 100 g); y Jengibre (con compuestos antiinflamatorios y antivirales naturales).           " +
                                                  "\n Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente tenga esta             " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un Diagnóstico            " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta del diagnóstico      " +
                                                  "\n no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app (Mi Vida) y espera      " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, Vómitos, Deshidratación, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 3 litros de agua al día (doce vasos de agua de tamaño regular), incluyendo      " +
                                                  "\n soluciones de rehidratación oral para reponer electrolitos perdidos por diarrea y vómitos. En mujeres adultas mayores,   " +
                                                  "\n la deshidratación puede ser más severa, por lo que se debe vigilar la frecuencia urinaria y el estado de conciencia.     " +
                                                  "\n EJERCICIO: Durante la fase aguda se recomienda reposo absoluto. Una vez superados los síntomas, se puede retomar         " +
                                                  "\n actividad física ligera para recuperar energía y mejorar la digestión. POSIBLE TRATAMIENTO: No existe un tratamiento     " +
                                                  "\n antiviral específico. El manejo es sintomático y se enfoca en rehidratación intensiva, control de la fiebre con          " +
                                                  "\n Paracetamol y dieta astringente. No se recomiendan antidiarreicos como la loperamida. En casos graves, puede requerirse  " +
                                                  "\n hospitalización para administración de líquidos intravenosos. También se sugiere el uso de probióticos para restaurar la " +
                                                  "\n flora intestinal. ALIMENTACIÓN: Se recomienda una dieta suave y rica en nutrientes como: Plátanos (con potasio, 23% por  " +
                                                  "\n cada 100 g); Arroz blanco (fácil digestión y fuente de energía); Manzanas cocidas (con pectina, que regula el tránsito   " +
                                                  "\n intestinal); Zanahorias cocidas (con vitamina A, 93% por cada 100 g); y Yogur natural (con probióticos y calcio, 30% por " +
                                                  "\n cada 100 g). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que la paciente  " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar más de un    " +
                                                  "\n Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Además, por su salud, si la respuesta " +
                                                  "\n del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes agradece tu visita a la app" +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, Náuseas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACIÓN: Se recomienda el consumo de 2.5 a 3 litros de agua al día (diez a doce vasos de agua de tamaño regular)     " +
                                                  "\n para apoyar la función renal, facilitar la eliminación de toxinas y mantener el equilibrio electrolítico. En mujeres     " +
                                                  "\n adultas mayores, una hidratación adecuada también ayuda a prevenir la hipotensión y la fatiga asociadas a la infección.  " +
                                                  "\n EJERCICIO: Durante la fase aguda se recomienda reposo absoluto. Una vez estabilizada, se puede retomar actividad física  " +
                                                  "\n ligera como caminatas suaves para mejorar la circulación y reducir la rigidez muscular. POSIBLE TRATAMIENTO: El          " +
                                                  "\n tratamiento incluye antibióticos intravenosos como Ampicilina o Penicilina G, frecuentemente combinados con Gentamicina  " +
                                                  "\n en casos graves. En mujeres adultas mayores, se debe ajustar la dosis según la función renal y monitorear signos de      " +
                                                  "\n meningitis o septicemia. También se recomienda evitar alimentos de alto riesgo como quesos blandos no pasteurizados,     " +
                                                  "\n embutidos y pescados ahumados. ALIMENTACIÓN: Se sugiere una dieta rica en nutrientes inmunoestimulantes como: Espinacas  " +
                                                  "\n (con vitamina A y hierro, 56% y 15% por cada 100 g); Ajo (con propiedades antibacterianas naturales); Zanahorias (con    " +
                                                  "\n vitamina A, 93% por cada 100 g); Frutas cítricas (con vitamina C, 89% por cada 100 g); y Yogur natural (con probióticos  " +
                                                  "\n y calcio, 30% por cada 100 g). Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al     " +
                                                  "\n 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda  " +
                                                  "\n realizar más de un Diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Además, por su     " +
                                                  "\n salud, si la respuesta del diagnóstico no le satisface del todo, se recomienda consultar a su médico. Ángel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, Vómitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidratación     " +
                                                  "\n óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Durante la        " +
                                                  "\n fase aguda se recomienda reposo absoluto para evitar complicaciones gastrointestinales. Una vez superada esta etapa,        " +
                                                  "\n se pueden incorporar caminatas suaves de 15 a 20 minutos al día, ejercicios de movilidad articular y respiración            " +
                                                  "\n profunda para estimular la circulación y la recuperación intestinal. También es útil realizar estiramientos suaves          " +
                                                  "\n para reducir la rigidez muscular. HIDRATACIÓN. Se aconseja consumir entre 2.5 y 3 litros de agua al día para prevenir       " +
                                                  "\n la deshidratación causada por la diarrea. También se recomienda el uso de soluciones de rehidratación oral, caldos          " +
                                                  "\n naturales y jugos suaves sin azúcar añadida. Se deben evitar bebidas con cafeína, alcohol o alto contenido de azúcar,       " +
                                                  "\n ya que pueden empeorar los síntomas. POSIBLE TRATAMIENTO. El tratamiento para la shigelosis incluye reposo, rehidratación   " +
                                                  "\n y en casos severos, antibióticos como ciprofloxacino o azitromicina. Marcas reconocidas incluyen Ciproxin y Zitromax.       " +
                                                  "\n No se deben usar medicamentos antidiarreicos como loperamida, ya que pueden agravar la infección. ALIMENTACIÓN RECOMENDADA. " +
                                                  "\n Se recomienda una dieta blanda, baja en fibra y rica en nutrientes esenciales. Algunos alimentos clave incluyen arroz       " +
                                                  "\n blanco y puré de papa, que son fáciles de digerir y ayudan a estabilizar el sistema digestivo. Yogur natural, fuente        " +
                                                  "\n de probióticos que ayudan a restaurar la flora intestinal. Plátano, rico en potasio, que ayuda a reponer electrolitos       " +
                                                  "\n perdidos, aportando el 10% del requerimiento diario por cada 100 gramos. Zanahoria cocida, rica en vitamina A, que          " +
                                                  "\n fortalece las mucosas intestinales, con un aporte del 15% del requerimiento diario por cada 100 gramos. Este diagnóstico    " +
                                                  "\n es una referencia lógica basada en información médica, pero no garantiza al 100% que el paciente tenga shigelosis ni        " +
                                                  "\n que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico y consultar a un médico para mayor         " +
                                                  "\n seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos crónica, Producción excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva crónica (EPOC)." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidratación   " +
                                                  "\n óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda   " +
                                                  "\n actividad física moderada como caminatas diarias de 30 minutos, ejercicios de respiración profunda y yoga terapéutico     " +
                                                  "\n para fortalecer los pulmones y reducir la disnea. También es útil realizar ejercicios de fortalecimiento muscular con     " +
                                                  "\n bandas elásticas y técnicas de expansión torácica para mejorar la capacidad pulmonar. HIDRATACIÓN. Se aconseja consumir   " +
                                                  "\n entre 2.5 y 3 litros de agua al día para mantener las vías respiratorias hidratadas, facilitar la eliminación de          " +
                                                  "\n secreciones y apoyar la función renal. También se recomienda el consumo de infusiones tibias como manzanilla o jengibre   " +
                                                  "\n para aliviar la irritación bronquial. POSIBLE TRATAMIENTO. El tratamiento para la EPOC incluye broncodilatadores de       " +
                                                  "\n acción corta como salbutamol (Ventolin, Aerolin), corticosteroides inhalados como fluticasona o budesonida (Flixotide,    " +
                                                  "\n Pulmicort) y en algunos casos, anticolinérgicos de acción prolongada como tiotropio (Spiriva). También se recomienda      " +
                                                  "\n la rehabilitación pulmonar y el uso adecuado de inhaladores. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica       " +
                                                  "\n en antioxidantes, proteínas y grasas saludables. Algunos alimentos clave incluyen pescados grasos como salmón y atún,     " +
                                                  "\n ricos en omega-3, que reducen la inflamación pulmonar, aportando el 70% del requerimiento diario por cada 100 gramos.     " +
                                                  "\n Frutas como naranja, kiwi y papaya, ricas en vitamina C, que fortalecen el sistema inmune, con un aporte del 89% del      " +
                                                  "\n requerimiento diario por cada 100 gramos. Verduras como espinaca y brócoli, ricas en vitamina A y ácido fólico, que       " +
                                                  "\n protegen las mucosas respiratorias, con un aporte del 15% del requerimiento diario por cada 100 gramos. Frutos secos      " +
                                                  "\n como almendras y nueces, ricos en vitamina E y ácidos grasos esenciales, con un aporte del 37% del requerimiento          " +
                                                  "\n diario por cada 28 gramos. Este diagnóstico es una referencia lógica basada en información médica, pero no garantiza      " +
                                                  "\n al 100% que el paciente tenga EPOC ni que el tratamiento sea el adecuado. Se recomienda realizar más de un diagnóstico    " +
                                                  "\n y consultar a un médico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreción anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidratación      " +
                                                  "\n óptima, realizar actividad física adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda      " +
                                                  "\n actividad física moderada como caminatas suaves, yoga o ejercicios de movilidad durante 30 minutos al día para mejorar       " +
                                                  "\n la circulación, reducir el estrés y fortalecer el sistema inmunológico. También es útil realizar ejercicios de respiración   " +
                                                  "\n y relajación para apoyar el bienestar general. HIDRATACIÓN. Se aconseja consumir entre 2 y 2.5 litros de agua al día para    " +
                                                  "\n facilitar la eliminación de toxinas, apoyar la función renal y mantener las mucosas hidratadas. También se recomienda el     " +
                                                  "\n consumo de infusiones suaves como manzanilla o menta para aliviar molestias urinarias. POSIBLE TRATAMIENTO. El tratamiento   " +
                                                  "\n para la clamidia incluye antibióticos como azitromicina en dosis única o doxiciclina durante 7 días. Marcas reconocidas      " +
                                                  "\n incluyen Zitromax y Vibramycin. Es fundamental completar el tratamiento y tratar también a la pareja sexual para evitar      " +
                                                  "\n reinfección. ALIMENTACIÓN RECOMENDADA. Se recomienda una dieta rica en antioxidantes, lisina y vitaminas del complejo B.     " +
                                                  "\n Algunos alimentos clave incluyen yogur natural y leche, ricos en lisina, que inhibe la replicación bacteriana. Frutas        " +
                                                  "\n como naranja, kiwi y papaya, ricas en vitamina C, que fortalecen el sistema inmune, con un aporte del 89% del requerimiento  " +
                                                  "\n diario por cada 100 gramos. Verduras como espinaca y zanahoria, ricas en vitamina A y ácido fólico, que favorecen la         " +
                                                  "\n regeneración celular y fortalecen las mucosas, con un aporte del 15% del requerimiento diario por cada 100 gramos.           " +
                                                  "\n Frutos secos como almendras y nueces, ricos en vitamina E y ácidos grasos esenciales, que protegen las células inmunológicas," +
                                                  "\n con un aporte del 37% del requerimiento diario por cada 28 gramos. Este diagnóstico es una referencia lógica basada     " +
                                                  "\n en información médica, pero no garantiza al 100% que el paciente tenga clamidia ni que el tratamiento sea el adecuado.  " +
                                                  "\n Se recomienda realizar más de un diagnóstico y consultar a un médico para mayor seguridad. Angel L Montes agradece tu   " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Náuseas, Dolor de cabeza severo, Rigidez en el cuello, Confusión.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n La meningitis bacteriana es una infección grave que inflama las membranas que rodean el cerebro y la médula espinal.        " +
                                                  "\n En la adultez mayor, puede presentarse con síntomas atípicos como confusión, somnolencia o pérdida de apetito, lo que       " +
                                                  "\n dificulta su diagnóstico temprano. EJERCICIO. Se recomienda actividad física muy ligera durante la fase de recuperación,    " +
                                                  "\n como estiramientos suaves o caminatas cortas en ambientes tranquilos, evitando cualquier esfuerzo que pueda aumentar la     " +
                                                  "\n presión intracraneal o la fatiga. HIDRATACIÓN. Es fundamental consumir entre 2.5 y 3 litros de agua al día para mantener    " +
                                                  "\n el equilibrio de líquidos, apoyar la función renal y facilitar la eliminación de toxinas. También se recomienda el consumo  " +
                                                  "\n de caldos suaves o infusiones tibias para mantener la hidratación sin irritar el sistema digestivo. POSIBLE TRATAMIENTO.    " +
                                                  "\n El tratamiento incluye antibióticos intravenosos de amplio espectro como ceftriaxona o vancomicina, ajustados según el      " +
                                                  "\n agente causal identificado. En algunos casos se administra dexametasona como antiinflamatorio adyuvante para reducir el     " +
                                                  "\n riesgo de daño neurológico. Es crucial iniciar el tratamiento lo antes posible para evitar complicaciones graves.           " +
                                                  "\n ALIMENTACIÓN RECOMENDADA. Consumir alimentos ricos en vitaminas del complejo B, antioxidantes y proteínas para apoyar la    " +
                                                  "\n recuperación neurológica. Huevo cocido, fuente de vitamina B12 y colina, esenciales para la función cerebral. Espinaca,     " +
                                                  "\n rica en ácido fólico y hierro, que favorecen la oxigenación cerebral, aportando hasta el 20% del requerimiento diario de    " +
                                                  "\n hierro por cada 100 g. Frutas como plátano y manzana, que aportan potasio y fibra soluble, ayudando a mantener el           " +
                                                  "\n equilibrio electrolítico y la digestión. Yogur natural, fuente de probióticos que fortalecen la flora intestinal y el       " +
                                                  "\n sistema inmune. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no garantiza al 100% que el paciente  " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para ello se recomienda hacer más de    " +
                                                  "\n un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, además por su salud    " +
                                                  "\n si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a su médico, Ángel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, Pérdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, Pérdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Cáncer." +
                                                  "\n El cáncer es un conjunto de enfermedades caracterizadas por el crecimiento descontrolado de células anormales que pueden       " +
                                                  "\n invadir tejidos y órganos. En la adultez mayor, el tratamiento debe adaptarse a la condición física general, comorbilidades    " +
                                                  "\n y tipo de cáncer. EJERCICIO. Se recomienda actividad física moderada y personalizada, como caminatas, ejercicios de            " +
                                                  "\n resistencia con bandas elásticas o yoga suave, que ayudan a mantener la masa muscular, mejorar el estado de ánimo y reducir    " +
                                                  "\n la fatiga asociada al tratamiento. HIDRATACIÓN. Es fundamental consumir entre 2.5 y 3 litros de agua al día para apoyar la     " + 
                                                  "\n función renal, especialmente durante la quimioterapia o radioterapia, y facilitar la eliminación de toxinas. También se        " +
                                                  "\n recomienda el consumo de líquidos ricos en electrolitos si hay vómitos o diarrea. POSIBLE TRATAMIENTO. El tratamiento puede    " +
                                                  "\n incluir cirugía, quimioterapia, radioterapia, inmunoterapia o terapia hormonal, dependiendo del tipo y estadio del cáncer.     " +
                                                  "\n En adultos mayores, se prioriza un enfoque individualizado que equilibre eficacia y calidad de vida. Medicamentos como         " +
                                                  "\n letrozol, capecitabina o pembrolizumab pueden ser considerados según el caso. ALIMENTACIÓN RECOMENDADA. Consumir alimentos     " +
                                                  "\n ricos en antioxidantes, proteínas y vitaminas para fortalecer el sistema inmunológico y prevenir la pérdida de peso. Frutas    " +
                                                  "\n como papaya y guayaba, ricas en vitamina C, que fortalecen las defensas, aportando hasta el 200% del requerimiento diario por  " +
                                                  "\n cada 100 g. Carnes magras y huevos, fuentes de proteínas de alta calidad, esenciales para la regeneración celular. Verduras    " +
                                                  "\n como brócoli y zanahoria, ricas en vitamina A, ácido fólico y antioxidantes. Yogur natural, fuente de probióticos que mejoran  " +
                                                  "\n la flora intestinal y la absorción de nutrientes. Este es solo un diagnóstico predeterminado lógico, haberlo consultado no     " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas estén correctas, para     " +
                                                  "\n ello se recomienda hacer más de un diagnóstico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su     " +
                                                  "\n paciente, además por su salud si la respuesta del diagnóstico no le satisface del todo se le recomienda mucho consultar a su   " +
                                                  "\n médico, Ángel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                    }
                }
             if (EdadFemenino.equals("Adultez Mayor = 60 - 74 años")) {
            frame.setVisible(true);
        } else {
            frame.setVisible(false);
        }
            }
        public Estudio12() {
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
        Estudio12 ventanaEstudio12 = new Estudio12();
        ventanaEstudio12.crearInterfaz();
    }
}