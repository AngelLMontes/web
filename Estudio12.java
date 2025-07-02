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
         private final String edadEsperada = "Adultez Mayor = 60 - 74 a�os";
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
                 if(EdadFemenino.equals("Adultez Mayor = 60 - 74 a�os")){
                        if(EstaturaFemenino.equals("0.80-1.35 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la influenza es fundamental mantener una hidrataci�n adecuada con un consumo            " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a fluidificar       " +
                                                  "\n las secreciones respiratorias y prevenir la deshidrataci�n causada por la fiebre. EJERCICIO: Se recomienda actividad        " +
                                                  "\n f�sica ligera como estiramientos suaves o caminatas cortas dentro del hogar evitando esfuerzos intensos mientras            " +
                                                  "\n persistan los s�ntomas. Una vez superada la fase aguda es recomendable realizar ejercicios de respiraci�n profunda          " +
                                                  "\n y movilidad articular para mejorar la oxigenaci�n y prevenir la p�rdida de masa muscular. POSIBLE TRATAMIENTO: El           " +
                                                  "\n tratamiento suele incluir medicamentos para reducir la fiebre y aliviar los s�ntomas como el paracetamol o el ibuprofeno.   " +
                                                  "\n En casos m�s severos los m�dicos pueden recetar antivirales espec�ficos contra la gripe como el oseltamivir. Es importante  " +
                                                  "\n seguir las indicaciones m�dicas y evitar el uso de aspirina ya que puede generar complicaciones. ALIMENTOS RECOMENDADOS:    " +
                                                  "\n Para fortalecer el sistema inmunol�gico y acelerar la recuperaci�n se recomienda el consumo de NARANJAS Y GUAYABAS:         " +
                                                  "\n Ricas en vitamina C que ayuda a reducir la duraci�n de los s�ntomas aportando aproximadamente el 89% de la ingesta          " +
                                                  "\n diaria recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos con propiedades antiinflamatorias y puede aliviar     " +
                                                  "\n la congesti�n. MIEL Y LIM�N: Combinaci�n efectiva para calmar la garganta y reducir la tos aportando flavonoides y          " +
                                                  "\n vitamina C. ESPINACAS Y BR�COLI: Aportan antioxidantes y vitamina A esenciales para la regeneraci�n celular con un          " +
                                                  "\n contenido de aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos  " +
                                                  "\n que pueden fortalecer el sistema inmunol�gico y mejorar la salud digestiva aportando calcio y prote�nas esenciales. Este    " +
                                                  "\n es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad  " +
                                                  "\n ni que las respuestas sean completamente correctas para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para      " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s por su salud si la respuesta del Diagn�stico    " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida)  " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la neumon�a es fundamental mantener una hidrataci�n adecuada con un consumo       " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a             " +
                                                  "\n fluidificar las secreciones pulmonares y facilitar su expulsi�n. EJERCICIO: Se recomienda actividad f�sica ligera     " +
                                                  "\n como caminatas cortas dentro del hogar y ejercicios de respiraci�n profunda evitando esfuerzos intensos mientras      " +
                                                  "\n persistan los s�ntomas. Una vez superada la fase aguda es recomendable realizar ejercicios de expansi�n pulmonar      " +
                                                  "\n y fisioterapia respiratoria para mejorar la capacidad pulmonar y reducir la sensaci�n de fatiga. POSIBLE TRATAMIENTO: " +
                                                  "\n El tratamiento suele incluir antibi�ticos como la amoxicilina la azitromicina o la ceftriaxona. En casos m�s severos  " +
                                                  "\n los m�dicos pueden recetar antivirales como el oseltamivir adem�s de medicamentos para reducir la fiebre como el      " +
                                                  "\n paracetamol o el ibuprofeno. Es importante seguir las indicaciones m�dicas y evitar la automedicaci�n. ALIMENTOS      " +
                                                  "\n RECOMENDADOS: Para fortalecer el sistema inmunol�gico y acelerar la recuperaci�n se recomienda el consumo de NARANJAS " +
                                                  "\n Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la duraci�n de los s�ntomas aportando aproximadamente el 89% de   " +
                                                  "\n la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos con propiedades antiinflamatorias y  " +
                                                  "\n puede aliviar la congesti�n. ESPINACAS Y BR�COLI: Aportan antioxidantes y vitamina A esenciales para la regeneraci�n  " +
                                                  "\n celular con un contenido de aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL:  " +
                                                  "\n Contiene probi�ticos que pueden fortalecer el sistema inmunol�gico y mejorar la salud digestiva aportando calcio y    " +
                                                  "\n prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100% que   " +
                                                  "\n el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer    " +
                                                  "\n m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s     " +
                                                  "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico    " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la diabetes es fundamental mantener una hidrataci�n adecuada con un consumo           " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a la              " +
                                                  "\n regulaci�n de la glucosa en sangre y prevenir la deshidrataci�n. EJERCICIO: Se recomienda actividad f�sica regular        " +
                                                  "\n como caminatas suaves ejercicios de bajo impacto o nataci�n para mejorar la sensibilidad a la insulina y controlar        " +
                                                  "\n los niveles de glucosa en sangre. Adem�s se recomienda la pr�ctica de ejercicios aer�bicos como bicicleta est�tica        " +
                                                  "\n o baile al menos 150 minutos por semana para mejorar la funci�n cardiovascular y reducir el riesgo de complicaciones.     " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento suele incluir medicamentos como la metformina para mejorar la sensibilidad a la       " +
                                                  "\n insulina. En casos m�s severos los m�dicos pueden recetar insulina de acci�n r�pida o prolongada adem�s de medicamentos     " +
                                                  "\n para controlar la presi�n arterial y el colesterol. Es importante seguir las indicaciones m�dicas y mantener un monitoreo   " +
                                                  "\n constante de los niveles de glucosa. ALIMENTOS RECOMENDADOS: Para fortalecer el metabolismo y mejorar el control de la      " +
                                                  "\n glucosa se recomienda el consumo de FRUTOS ROJOS: Ricos en antioxidantes y fibra que ayudan a regular la glucosa en sangre  " +
                                                  "\n aportando aproximadamente el 32% de la ingesta diaria recomendada por cada 100 gramos. FRUTOS SECOS: Contienen grasas       " +
                                                  "\n saludables y fibra que pueden mejorar la sensibilidad a la insulina aportando aproximadamente el 25% de la ingesta diaria   " +
                                                  "\n recomendada por cada 100 gramos. ESPINACAS Y BR�COLI: Aportan antioxidantes y vitamina A esenciales para la regeneraci�n    " +
                                                  "\n celular con un contenido de aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos. AVENA: Rica en fibra  " +
                                                  "\n soluble que ayuda a estabilizar los niveles de glucosa en sangre aportando aproximadamente el 40% de la ingesta diaria      " +
                                                  "\n recomendada por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100%  " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer m�s  " +
                                                  "\n de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s por su salud  " +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico Angel L Montes        " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2 a 2.5 litros de agua al d�a (aproximadamente ocho a diez vasos de agua      " +
                                                  "\n de tama�o regular) para mantener las v�as respiratorias hidratadas, facilitar la eliminaci�n de secreciones y          " +
                                                  "\n reducir la inflamaci�n bronquial. En personas adultas mayores, una hidrataci�n adecuada tambi�n ayuda a prevenir       " +
                                                  "\n la sequedad de mucosas y mejora la funci�n pulmonar general. EJERCICIO: Actividad f�sica moderada como caminatas       " +
                                                  "\n suaves, ejercicios de respiraci�n y estiramientos controlados pueden mejorar la capacidad pulmonar y reducir la        " +
                                                  "\n frecuencia de las crisis asm�ticas. Es importante evitar ambientes fr�os o contaminados y realizar calentamiento       " +
                                                  "\n previo para prevenir la broncoconstricci�n inducida por el ejercicio. POSIBLE TRATAMIENTO: El tratamiento incluye      " +
                                                  "\n broncodilatadores de acci�n r�pida como Salbutamol (Ventolin, Aerolin), corticosteroides inhalados como Fluticasona    " +
                                                  "\n o Budesonida (Flixotide, Pulmicort), y en algunos casos, modificadores de leucotrienos como Montelukast (Singulair).   " +
                                                  "\n En adultos mayores, es esencial revisar la t�cnica de inhalaci�n y ajustar las dosis para evitar efectos secundarios   " +
                                                  "\n como temblores o taquicardia. Tambi�n se recomienda el uso de espaciadores para mejorar la administraci�n del medicamento. " +
                                                  "\n ALIMENTACI�N: Se sugiere el consumo de alimentos antiinflamatorios y antioxidantes como: Pescados grasos (salm�n, at�n),   " +
                                                  "\n ricos en Omega-3, que ayudan a reducir la inflamaci�n de las v�as respiratorias (50% de la ingesta diaria recomendada      " +
                                                  "\n por cada 100 g); Frutas c�tricas (naranjas, toronjas), con vitamina C que fortalece el sistema inmune (89% por cada        " +
                                                  "\n 100 g); Espinacas (ricas en vitamina A y magnesio, esenciales para la funci�n pulmonar, con 56% y 20% respectivamente      " +
                                                  "\n por cada 100 g); Jengibre y c�rcuma, con propiedades antiinflamatorias naturales. Este es solo un diagn�stico predeterminado" +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean      " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor     " +
                                                  "\n seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, " +
                                                  "\n se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 litros de agua al d�a (diez vasos de agua de tama�o regular) para           " +
                                                  "\n apoyar la funci�n renal, facilitar la eliminaci�n de toxinas y mantener el equilibrio electrol�tico, especialmente       " +
                                                  "\n importante en pacientes que toman m�ltiples medicamentos. Tambi�n se sugiere incluir infusiones antioxidantes como       " +
                                                  "\n t� verde o rooibos. EJERCICIO: Actividad f�sica moderada como caminatas, yoga suave o ejercicios de bajo impacto         " +
                                                  "\n puede mejorar la masa muscular, reducir el estr�s y fortalecer el sistema inmunol�gico. Es importante adaptar la         " +
                                                  "\n rutina a la condici�n f�sica de la paciente y evitar el sobreesfuerzo. POSIBLE TRATAMIENTO: El tratamiento est�ndar      " +
                                                  "\n es la terapia antirretroviral (TAR), que combina medicamentos como Tenofovir, Emtricitabina, Efavirenz (Atripla),        " +
                                                  "\n Dolutegravir (Tivicay) y Lamivudina (Epivir). En mujeres adultas mayores, es crucial monitorear la funci�n hep�tica      " +
                                                  "\n y renal, as� como posibles interacciones con otros medicamentos para enfermedades cr�nicas. Tambi�n se recomienda el     " +
                                                  "\n seguimiento de la densidad �sea, ya que algunos antirretrovirales pueden afectar el metabolismo del calcio. ALIMENTACI�N:  " +
                                                  "\n Se recomienda una dieta rica en nutrientes inmunoestimulantes como: Frutas c�tricas (naranjas, limones), con vitamina C    " +
                                                  "\n (89% por cada 100 g); Aguacate, fuente de vitamina E y �cidos grasos monoinsaturados (14% por cada 100 g); Pescados grasos " +
                                                  "\n (salm�n, sardina), ricos en Omega-3 (50% por cada 100 g); Verduras de hoja verde (espinacas, acelgas), con vitamina A      " +
                                                  "\n y hierro (56% y 15% respectivamente por cada 100 g); Legumbres (lentejas, frijoles), con prote�nas vegetales y hierro      " +
                                                  "\n (37% por cada 100 g). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la    " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s   " +
                                                  "\n de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la       " +
                                                  "\n respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea. " +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2 a 2.5 litros de agua al d�a (ocho a diez vasos de agua de tama�o regular)    " +
                                                  "\n para facilitar la eliminaci�n de toxinas y mantener la funci�n renal, especialmente importante durante el tratamiento   " +
                                                  "\n antibi�tico. Tambi�n se sugiere el consumo de jugos naturales sin az�car para aportar antioxidantes. EJERCICIO:         " +
                                                  "\n Actividad f�sica ligera como caminatas o estiramientos suaves puede ayudar a mejorar la circulaci�n y fortalecer        " +
                                                  "\n el sistema inmune. Se debe evitar el ejercicio intenso durante el tratamiento para no comprometer la recuperaci�n.      " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento incluye antibi�ticos como Ceftriaxona (inyecci�n �nica) y Azitromicina (dosis       " +
                                                  "\n oral). En mujeres adultas mayores, es importante vigilar posibles efectos secundarios gastrointestinales y ajustar      " +
                                                  "\n la dosis en caso de insuficiencia renal. Tambi�n se recomienda realizar pruebas de seguimiento para confirmar la        " +
                                                  "\n erradicaci�n de la bacteria y evitar reinfecciones. En casos resistentes, puede ser necesario el uso de combinaciones   " +
                                                  "\n antibi�ticas o tratamientos prolongados. ALIMENTACI�N: Se recomienda una dieta que apoye la funci�n inmunol�gica y la   " +
                                                  "\n recuperaci�n, incluyendo: Naranjas (ricas en vitamina C, 89% por cada 100 g); Espinacas (fuente de hierro y �cido f�lico," +
                                                  "\n 56% y 49% respectivamente por cada 100 g); Yogur natural (rico en probi�ticos y calcio, 30% de la ingesta diaria      " +
                                                  "\n recomendada por cada 100 g); Ajo (con propiedades antibacterianas naturales); y Zanahorias (ricas en vitamina A,      " +
                                                  "\n 93% por cada 100 g), que ayudan a mantener la integridad de las mucosas. Este es solo un diagn�stico predeterminado   " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean      " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor     " +
                                                  "\n seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, " +
                                                  "\n se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidrataci�n    " +
                                                  "\n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda    " +
                                                  "\n actividad f�sica moderada como caminatas suaves, yoga o ejercicios de estiramiento de bajo impacto durante 30 minutos      " +
                                                  "\n al d�a, cinco veces por semana, para fortalecer el sistema inmunol�gico y reducir el estr�s, ya que el estr�s puede        " +
                                                  "\n desencadenar brotes. Tambi�n es �til incorporar ejercicios de respiraci�n profunda y meditaci�n para mejorar la respuesta  " +
                                                  "\n del cuerpo ante el virus. HIDRATACI�N. Se aconseja consumir al menos 2 litros de agua al d�a para mantener la piel y las   " +
                                                  "\n mucosas hidratadas, lo cual ayuda a reducir la irritaci�n y prevenir brotes. Adem�s, se recomienda evitar bebidas con      " +
                                                  "\n cafe�na o alcohol, ya que pueden favorecer la deshidrataci�n. Infusiones suaves como manzanilla o t� verde pueden ser      " +
                                                  "\n beneficiosas por sus propiedades antiinflamatorias y antioxidantes. POSIBLE TRATAMIENTO. El tratamiento para el herpes     " +
                                                  "\n genital incluye antivirales como aciclovir, famciclovir y valaciclovir, que ayudan a reducir la duraci�n y frecuencia      " +
                                                  "\n de los brotes. Marcas reconocidas incluyen Zovirax y Valtrex. En casos de recurrencias frecuentes, se puede considerar     " +
                                                  "\n terapia supresiva diaria. Tambi�n se recomienda el uso de cremas t�picas con lidoca�na o aloe vera para aliviar el         " + 
                                                  "\n malestar local. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica en lisina y antioxidantes para fortalecer el        " +
                                                  "\n sistema inmunol�gico. Algunos alimentos clave incluyen yogur natural y leche, ricos en lisina, que inhibe la replicaci�n   " +
                                                  "\n del virus. Frutas c�tricas como naranja y kiwi, ricas en vitamina C, que fortalecen el sistema inmune, aportando           " +
                                                  "\n aproximadamente el 89% del requerimiento diario por cada 100 gramos. Verduras como espinaca y zanahoria, ricas en          " +
                                                  "\n vitamina A, que contribuyen a la regeneraci�n celular y fortalecen las mucosas, con un aporte del 15% del requerimiento    " +
                                                  "\n diario por cada 100 gramos. Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al   " +
                                                  "\n 100% que el paciente tenga herpes genital ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un          " +
                                                  "\n diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera    " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una       " +
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales.        " +
                                                  "\n EJERCICIO. Se recomienda actividad f�sica moderada como caminatas diarias de 30 minutos, ejercicios de            " +
                                                  "\n movilidad articular y estiramientos suaves para mejorar la circulaci�n, mantener la masa muscular y fortalecer    " +
                                                  "\n el sistema inmunol�gico. Tambi�n es beneficioso incluir ejercicios de equilibrio y coordinaci�n para prevenir     " +
                                                  "\n ca�das. HIDRATACI�N. Se aconseja consumir entre 2 y 2.5 litros de agua al d�a para ayudar a eliminar toxinas      " +
                                                  "\n del cuerpo, mantener la funci�n renal y apoyar el metabolismo durante el tratamiento antibi�tico. Tambi�n se      " +
                                                  "\n recomienda el consumo de caldos naturales y jugos de frutas sin az�car a�adida para mantener el equilibrio de     " +
                                                  "\n electrolitos. POSIBLE TRATAMIENTO. El tratamiento est�ndar para la s�filis incluye antibi�ticos como penicilina   " +
                                                  "\n G benzatina, doxiciclina o ceftriaxona. Marcas reconocidas incluyen Benzetacil y Doxiciclina. En pacientes               " +
                                                  "\n al�rgicos a la penicilina, se utilizan alternativas como la doxiciclina por v�a oral durante 14 d�as. Es fundamental     " +
                                                  "\n completar el tratamiento para evitar complicaciones como neuros�filis o da�o cardiovascular. ALIMENTACI�N RECOMENDADA.   " +
                                                  "\n Se recomienda una dieta rica en prote�nas, vitaminas y minerales para fortalecer el sistema inmunol�gico. Algunos        " +
                                                  "\n alimentos clave incluyen carnes magras y pescado, fuentes de prote�nas esenciales. Frutas c�tricas como naranja y        " +
                                                  "\n lim�n, ricas en vitamina C, que ayudan a la recuperaci�n y fortalecimiento del sistema inmune, aportando el 89% del      " +
                                                  "\n requerimiento diario por cada 100 gramos. Verduras de hoja verde como espinaca y br�coli, que contienen hierro y         " +
                                                  "\n antioxidantes esenciales para la producci�n de gl�bulos rojos, con un aporte del 15% del requerimiento diario por        " +
                                                  "\n cada 100 gramos. Ajo y cebolla, con compuestos antimicrobianos naturales que pueden apoyar el tratamiento. Este          " +
                                                  "\n diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga       " +
                                                  "\n s�filis ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico      " +
                                                  "\n para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una         " +
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales.          " +
                                                  "\n EJERCICIO. Se recomienda actividad f�sica moderada como caminatas suaves, ejercicios de respiraci�n profunda        " + 
                                                  "\n y yoga terap�utico para fortalecer los pulmones, mejorar la oxigenaci�n y reducir la fatiga. Tambi�n es �til        " +
                                                  "\n realizar ejercicios de movilidad articular y estiramientos para mantener la flexibilidad y prevenir la p�rdida      " +
                                                  "\n de masa muscular. HIDRATACI�N. Se aconseja consumir entre 2.5 y 3 litros de agua al d�a para mantener las v�as      " +
                                                  "\n respiratorias hidratadas, facilitar la eliminaci�n de toxinas y apoyar la funci�n renal durante el tratamiento.     " +
                                                  "\n Tambi�n se recomienda el consumo de caldos ricos en minerales y jugos naturales con alto contenido de vitamina C.   " +
                                                  "\n POSIBLE TRATAMIENTO. El tratamiento est�ndar para la tuberculosis incluye una combinaci�n de antibi�ticos como      " +
                                                  "\n isoniazida, rifampicina, etambutol y pirazinamida durante un per�odo de al menos seis meses. Marcas reconocidas     " +
                                                  "\n incluyen Rifater y Rimactane. Es fundamental seguir el tratamiento completo y bajo supervisi�n m�dica para evitar   " +
                                                  "\n reca�das o resistencia bacteriana. En adultos mayores, se debe ajustar la dosis en caso de insuficiencia renal o    " +
                                                  "\n hep�tica y monitorear posibles efectos secundarios. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica en         " +
                                                  "\n prote�nas, vitaminas y minerales para fortalecer el sistema inmunol�gico y apoyar la recuperaci�n. Algunos alimentos  " +
                                                  "\n clave incluyen carnes magras y pescado, fuentes de prote�nas esenciales. Frutas c�tricas como naranja y kiwi, ricas   " +
                                                  "\n en vitamina C, que ayudan a la recuperaci�n y fortalecimiento del sistema inmune, aportando el 89% del requerimiento  " +
                                                  "\n diario por cada 100 gramos. Verduras de hoja verde como espinaca y br�coli, que contienen hierro y antioxidantes      " +
                                                  "\n esenciales para la producci�n de gl�bulos rojos, con un aporte del 15% del requerimiento diario por cada 100 gramos.  " +
                                                  "\n Frutos secos como almendras y nueces, ricos en vitamina E y �cidos grasos esenciales, que fortalecen el sistema       " +
                                                  "\n inmunol�gico y aportan el 37% del requerimiento diario por cada 28 gramos. Este diagn�stico es una referencia l�gica  " +
                                                  "\n basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga tuberculosis ni que el tratamiento sea  " +
                                                  "\n el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes" +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis. " +
                                                  "\n La artritis es una inflamaci�n de las articulaciones que puede causar dolor, rigidez y disminuci�n de la movilidad.            " +
                                                  "\n En la adultez mayor, es com�n que se presente osteoartritis, una forma degenerativa que afecta principalmente rodillas,        " +
                                                  "\n caderas y manos. EJERCICIO. Se recomienda actividad f�sica moderada y adaptada a la movilidad de la persona, como              " +
                                                  "\n caminatas suaves, ejercicios acu�ticos o estiramientos guiados, que ayudan a mantener la flexibilidad y reducir la             " +
                                                  "\n rigidez. Tambi�n es beneficioso realizar ejercicios de fortalecimiento muscular para mejorar el soporte articular y            " +
                                                  "\n prevenir ca�das. HIDRATACI�N. Es fundamental consumir entre 2 y 2.5 litros de agua al d�a para mantener la lubricaci�n         " +
                                                  "\n de las articulaciones, facilitar la eliminaci�n de toxinas y reducir la inflamaci�n. Se sugiere complementar con infusiones    " +
                                                  "\n de c�rcuma o jengibre, que poseen propiedades antiinflamatorias naturales. POSIBLE TRATAMIENTO. El tratamiento puede incluir   " +
                                                  "\n medicamentos antiinflamatorios no esteroides como ibuprofeno o naproxeno, corticosteroides en casos m�s severos, y f�rmacos    " +
                                                  "\n modificadores de la enfermedad como el metotrexato. Tambi�n se recomienda fisioterapia y en algunos casos el uso de            " +
                                                  "\n suplementos como glucosamina y condroitina. ALIMENTACI�N RECOMENDADA. Consumir alimentos ricos en antioxidantes y �cidos       " +
                                                  "\n grasos esenciales. Pescados grasos como salm�n y sardina, ricos en �cidos grasos Omega-3, que ayudan a reducir la inflamaci�n  " +
                                                  "\n articular, aportando hasta el 90% del requerimiento diario por cada 100 g. Frutas como ar�ndanos y fresas, ricas en vitamina C " +
                                                  "\n y antioxidantes, que fortalecen el sistema inmunol�gico y reducen el da�o celular, aportando cerca del 70% del requerimiento   " +
                                                  "\n diario por cada 100 g. Verduras de hoja verde como espinaca y kale, que contienen hierro, calcio y vitamina K, esenciales para " +
                                                  "\n la salud �sea y articular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el   " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s " +
                                                  "\n de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud si " +
                                                  "\n la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n La tosferina, o pertussis, es una infecci�n bacteriana que afecta las v�as respiratorias y puede causar tos intensa      " +
                                                  "\n y prolongada. En adultos mayores, puede ser m�s severa y provocar complicaciones respiratorias. EJERCICIO. Se            " +
                                                  "\n recomienda actividad f�sica ligera, como caminatas cortas o ejercicios de respiraci�n profunda, para mejorar la          " +
                                                  "\n oxigenaci�n sin agotar al paciente. Es importante evitar ambientes fr�os o contaminados que puedan agravar los           " +
                                                  "\n s�ntomas. HIDRATACI�N. Es fundamental consumir entre 2 y 2.5 litros de agua al d�a para mantener las v�as respiratorias  " +
                                                  "\n hidratadas y facilitar la eliminaci�n de mucosidad. Tambi�n se recomienda el consumo de l�quidos tibios como infusiones  " +
                                                  "\n de jengibre o t� de manzanilla para aliviar la garganta. POSIBLE TRATAMIENTO. El tratamiento incluye antibi�ticos como   " +
                                                  "\n azitromicina, claritromicina o eritromicina, que ayudan a eliminar la bacteria. En casos con dificultad respiratoria,    " +
                                                  "\n pueden utilizarse broncodilatadores. Se recomienda reposo y aislamiento durante los primeros d�as para evitar contagios. " +
                                                  "\n ALIMENTACI�N RECOMENDADA. Consumir alimentos que fortalezcan el sistema respiratorio. Frutas c�tricas como naranja y     " +
                                                  "\n toronja, ricas en vitamina C, que ayudan a reducir la duraci�n de los s�ntomas, aportando hasta el 89% del requerimiento " +
                                                  "\n diario por cada 100 g. Miel, con propiedades antimicrobianas y calmantes para la garganta. Jengibre, con efectos         " +
                                                  "\n antiinflamatorios que pueden aliviar la tos. Yogur natural, fuente de probi�ticos que fortalecen la flora intestinal y   " +
                                                  "\n el sistema inmune. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el     " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda     " +
                                                  "\n hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s " +
                                                  "\n por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico,      " +
                                                  "\n �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Las paperas son una infecci�n viral que afecta las gl�ndulas salivales, causando inflamaci�n y dolor en la zona             " +
                                                  "\n de la mand�bula. En adultos mayores, pueden presentarse s�ntomas m�s intensos y riesgo de complicaciones. EJERCICIO.        " +
                                                  "\n Se recomienda actividad f�sica ligera mientras persistan los s�ntomas, como estiramientos suaves o caminatas cortas,        " +
                                                  "\n evitando esfuerzos que puedan aumentar la inflamaci�n. HIDRATACI�N. Es fundamental consumir entre 2 y 2.5 litros de         " +
                                                  "\n agua al d�a para ayudar al cuerpo a combatir la infecci�n y mantenerse hidratado. Se sugiere complementar con l�quidos      " +
                                                  "\n suaves como caldos o infusiones de manzanilla. POSIBLE TRATAMIENTO. No existe un tratamiento antiviral espec�fico para      " +
                                                  "\n las paperas. Se recomienda el uso de paracetamol para aliviar la fiebre y el dolor, evitando el ibuprofeno y la aspirina.     " +
                                                  "\n Tambi�n se sugiere el uso de compresas fr�as en la zona inflamada y reposo absoluto durante los primeros d�as. ALIMENTACI�N   " +
                                                  "\n RECOMENDADA. Consumir alimentos blandos y ricos en nutrientes. Frutas c�tricas como naranja y mandarina, ricas en vitamina C, " +
                                                  "\n que fortalecen el sistema inmunol�gico, aportando hasta el 89% del requerimiento diario por cada 100 g. Yogur natural,        " +
                                                  "\n fuente de probi�ticos que ayudan a mantener la flora intestinal. Verduras de hoja verde como espinaca, que aportan hierro     " +
                                                  "\n y antioxidantes esenciales para la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no     " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para    " +
                                                  "\n ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su    " +
                                                  "\n paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a     " +
                                                  "\n su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n EJERCICIO: Durante la infecci�n por el virus del Zika se recomienda evitar cualquier esfuerzo f�sico intenso y            " +
                                                  "\n priorizar el descanso absoluto, ya que el sistema inmunol�gico necesita conservar energ�a para combatir el virus.         " +
                                                  "\n Una vez que los s�ntomas disminuyen, se pueden realizar ejercicios suaves como caminatas lentas o estiramientos           " +
                                                  "\n ligeros para mejorar la circulaci�n y reducir la rigidez muscular. Tambi�n es �til practicar ejercicios de                " +
                                                  "\n respiraci�n profunda para mejorar la oxigenaci�n celular y reducir la inflamaci�n. HIDRATACI�N: Es fundamental            " +
                                                  "\n consumir al menos 2.5 litros de agua al d�a para prevenir la deshidrataci�n, regular la temperatura corporal y            " +
                                                  "\n facilitar la eliminaci�n de toxinas. Tambi�n se recomienda el consumo de caldos naturales, infusiones como t� de          " +
                                                  "\n jengibre o manzanilla, y jugos naturales sin az�car a�adida, que adem�s de hidratar aportan antioxidantes y alivian       " +
                                                  "\n s�ntomas como el dolor muscular y la fiebre. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral espec�fico para      " + 
                                                  "\n el Zika, pero los s�ntomas pueden aliviarse con reposo, hidrataci�n constante y medicamentos como el acetaminof�n para    " +
                                                  "\n reducir la fiebre y el dolor. Es importante evitar el uso de aspirina y otros antiinflamatorios no esteroideos hasta      " +
                                                  "\n descartar la posibilidad de dengue, para reducir el riesgo de hemorragias. Tambi�n se recomienda evitar el consumo de     " +
                                                  "\n alcohol y tabaco durante la recuperaci�n, ya que pueden debilitar el sistema inmunol�gico. ALIMENTACI�N: Se recomienda    " +
                                                  "\n el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, tales     " +
                                                  "\n como frutas c�tricas como naranjas y toronjas, que aportan vitamina C en un 89% de la ingesta diaria recomendada,         " +
                                                  "\n ayudando a combatir infecciones. Verduras de hoja verde como espinacas y acelgas, que aportan hasta un 50% de la ingesta    " +
                                                  "\n diaria recomendada de vitamina A y K, esenciales para la regeneraci�n celular. Jengibre y c�rcuma, que poseen propiedades   " +
                                                  "\n antiinflamatorias y antioxidantes, contribuyendo con hasta un 40% de la ingesta diaria recomendada de compuestos bioactivos " +
                                                  "\n beneficiosos para la salud. este es solo un diagn�stico predeterminado l�gico. haberlo consultado no garantiza al 100% que  " +
                                                  "\n la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar m�s de un      " +
                                                  "\n diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico no le    " +
                                                  "\n satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera      " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n EJERCICIO: Durante la infecci�n por rotavirus se recomienda evitar cualquier tipo de esfuerzo f�sico y priorizar          " +
                                                  "\n el descanso absoluto, ya que la p�rdida de l�quidos y nutrientes puede provocar debilidad extrema. Una vez superada       " +
                                                  "\n la fase aguda, se pueden realizar ejercicios suaves como caminatas lentas o estiramientos para estimular la circulaci�n   " +
                                                  "\n y recuperar la energ�a. HIDRATACI�N: Es crucial el consumo de al menos 2.5 litros de agua al d�a para prevenir la         " +
                                                  "\n deshidrataci�n causada por la diarrea y los v�mitos. Tambi�n se recomienda el uso de soluciones de rehidrataci�n oral     " +
                                                  "\n que contienen electrolitos esenciales como sodio, potasio y glucosa, los cuales ayudan a restablecer el equilibrio        " +
                                                  "\n h�drico y energ�tico del cuerpo. El consumo de caldos naturales y jugos suaves sin az�car tambi�n puede ser beneficioso.  " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento antiviral espec�fico para el rotavirus, pero los s�ntomas pueden aliviarse  " +
                                                  "\n con hidrataci�n intensiva, reposo y una dieta adecuada. Se deben evitar los medicamentos antidiarreicos, ya que pueden    " +
                                                  "\n prolongar la infecci�n. En casos graves, puede ser necesaria la administraci�n de l�quidos por v�a intravenosa. Tambi�n   " +
                                                  "\n se recomienda el consumo de probi�ticos para restaurar la flora intestinal. ALIMENTACI�N: Se recomienda el consumo de     " +
                                                  "\n alimentos que favorezcan la recuperaci�n del sistema digestivo, tales como yogur natural, que contiene probi�ticos        " +
                                                  "\n beneficiosos para la flora intestinal. Frutas como pl�tanos y manzanas, que aportan fibra soluble y ayudan a regular      " +
                                                  "\n el tr�nsito intestinal. Verduras como zanahorias y calabacines, que contienen antioxidantes y vitaminas esenciales como   " +
                                                  "\n la vitamina A y el potasio, aportando hasta un 50% de la ingesta diaria recomendada, fundamentales para la regeneraci�n   " +
                                                  "\n de la mucosa intestinal. este es solo un diagn�stico predeterminado l�gico. haberlo consultado no garantiza al 100% que   " +
                                                  "\n la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar m�s de un    " +
                                                  "\n diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico no     " +
                                                  "\n le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n EJERCICIO: Durante la infecci�n por listeria se recomienda evitar esfuerzos f�sicos intensos y priorizar el descanso,   " +
                                                  "\n ya que el cuerpo necesita conservar energ�a para combatir la bacteria. Una vez que los s�ntomas disminuyen, se pueden   " +
                                                  "\n realizar ejercicios suaves como caminatas lentas o ejercicios de respiraci�n para mejorar la oxigenaci�n celular y      " +
                                                  "\n reducir la fatiga. HIDRATACI�N: Es fundamental consumir al menos 2.5 litros de agua al d�a para ayudar a eliminar       " +
                                                  "\n toxinas y mantener el equilibrio de los fluidos corporales. Tambi�n se recomienda el consumo de caldos naturales,       " +
                                                  "\n infusiones suaves y jugos sin az�car para aportar electrolitos esenciales. La hidrataci�n adecuada contribuye a la      " +
                                                  "\n eliminaci�n de bacterias a trav�s de la orina y mejora la funci�n renal, lo cual es clave durante una infecci�n         " +
                                                  "\n bacteriana. POSIBLE TRATAMIENTO: La infecci�n por listeria se trata con antibi�ticos como ampicilina o gentamicina,     " +
                                                  "\n especialmente en casos graves o en pacientes inmunocomprometidos. En adultos mayores, el tratamiento debe iniciarse     " +
                                                  "\n lo antes posible para evitar complicaciones como septicemia o meningitis. Tambi�n se recomienda evitar alimentos de     " +
                                                  "\n alto riesgo como productos l�cteos no pasteurizados, embutidos y pescados ahumados durante la recuperaci�n. ALIMENTACI�N: " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema       " +
                                                  "\n inmunol�gico, tales como frutas c�tricas como naranjas y toronjas, que aportan vitamina C en un 89% de la ingesta     " +
                                                  "\n diaria recomendada, ayudando a combatir infecciones. Verduras de hoja verde como espinacas y acelgas, que aportan     " +
                                                  "\n hasta un 50% de la ingesta diaria recomendada de vitamina A y K, esenciales para la regeneraci�n celular. Frutos      " +
                                                  "\n secos como almendras y nueces, que contienen vitamina E y magnesio, contribuyendo con hasta un 40% de la ingesta      " +
                                                  "\n diaria recomendada de estos nutrientes esenciales para la recuperaci�n neurol�gica. este es solo un diagn�stico       " +
                                                  "\n predeterminado l�gico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las       " +
                                                  "\n respuestas sean completamente correctas. se recomienda realizar m�s de un diagn�stico para mayor seguridad en el      " +
                                                  "\n tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda   " +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la shigelosis es fundamental mantener una hidrataci�n adecuada con un consumo    " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para reponer los         " +
                                                  "\n l�quidos perdidos por la diarrea y prevenir la deshidrataci�n. EJERCICIO: Se recomienda actividad f�sica ligera      " + 
                                                  "\n como caminatas suaves dentro del hogar o ejercicios de movilidad articular evitando esfuerzos intensos mientras      " +
                                                  "\n persistan los s�ntomas. Una vez superada la fase aguda es recomendable realizar ejercicios de fortalecimiento        " +
                                                  "\n progresivo para recuperar energ�a y mejorar la funci�n digestiva. POSIBLE TRATAMIENTO: El tratamiento suele incluir  " +
                                                  "\n antibi�ticos como la ciprofloxacina o la azitromicina y en casos m�s severos ceftriaxona. Es importante evitar       " +
                                                  "\n medicamentos antidiarreicos sin indicaci�n m�dica ya que pueden empeorar la eliminaci�n de la bacteria. ALIMENTOS    " +
                                                  "\n RECOMENDADOS: Para fortalecer el sistema digestivo y acelerar la recuperaci�n se recomienda el consumo de PL�TANOS:  " +
                                                  "\n Ricos en potasio que ayuda a reemplazar los electrolitos perdidos debido a la diarrea aportando aproximadamente el   " +
                                                  "\n 12% de la ingesta diaria recomendada por cada 100 gramos. ARROZ BLANCO: Fuente de carbohidratos de f�cil digesti�n   " +
                                                  "\n que ayuda a estabilizar el sistema digestivo. ZANAHORIAS: Ricas en vitamina A y antioxidantes que ayudan a la        " +
                                                  "\n regeneraci�n celular aportando aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR    " +
                                                  "\n NATURAL: Contiene probi�ticos que pueden fortalecer el sistema digestivo y mejorar la salud intestinal aportando     " +
                                                  "\n calcio y prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza     " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se        " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su   " +
                                                  "\n paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho         " +
                                                  "\n consultar a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la EPOC es fundamental mantener una hidrataci�n adecuada con un consumo diario            " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a mantener las v�as          " +
                                                  "\n respiratorias hidratadas y facilitar la expulsi�n de mucosidad. EJERCICIO: Se recomienda actividad f�sica ligera como         " +
                                                  "\n caminatas lentas ejercicios de respiraci�n profunda y estiramientos suaves para mejorar la oxigenaci�n y la capacidad         " +
                                                  "\n pulmonar. Adem�s se recomienda la pr�ctica de ejercicios de fortalecimiento muscular y fisioterapia respiratoria adaptada     " +
                                                  "\n a la capacidad del paciente para mantener la funcionalidad y prevenir la p�rdida de masa muscular. POSIBLE TRATAMIENTO:       " +
                                                  "\n El tratamiento suele incluir broncodilatadores de acci�n r�pida como el salbutamol corticosteroides inhalados como la         " +
                                                  "\n fluticasona y en algunos casos terapia con ox�geno. Es fundamental seguir estrictamente el plan de acci�n indicado por        " +
                                                  "\n el m�dico y evitar la exposici�n a contaminantes ambientales. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema respiratorio " + 
                                                  "\n y reducir la inflamaci�n se recomienda el consumo de PESCADOS GRASOS: Salm�n y at�n ricos en �cidos grasos Omega-3 que poseen " +
                                                  "\n propiedades antiinflamatorias que pueden ayudar a reducir la inflamaci�n de las v�as respiratorias aportando aproximadamente  " +
                                                  "\n el 50% de la ingesta diaria recomendada por cada 100 gramos. FRUTAS Y VERDURAS DE COLORES VIVOS: Ar�ndanos fresas espinacas   " +
                                                  "\n br�coli ricos en antioxidantes como la vitamina C y carotenoides que pueden proteger las c�lulas del da�o y fortalecer el     " +
                                                  "\n sistema inmunol�gico aportando aproximadamente el 70% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE:         " +
                                                  "\n Contiene compuestos con efectos antiinflamatorios que podr�an ser beneficiosos para las v�as respiratorias. C�RCUMA: Con su   " +
                                                  "\n componente activo la curcumina tambi�n tiene potentes propiedades antiinflamatorias y antioxidantes. Este es solo un          " +
                                                  "\n diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que        " +
                                                  "\n las respuestas sean completamente correctas para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer    " +
                                                  "\n mejor seguridad en el tratamiento adecuado de su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface " +
                                                  "\n del todo se le recomienda mucho consultar a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la clamidia es fundamental mantener una hidrataci�n adecuada con un consumo       " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a la          " +
                                                  "\n eliminaci�n de toxinas y fortalecer el sistema inmunol�gico. EJERCICIO: Se recomienda actividad f�sica moderada       " +
                                                  "\n como caminatas ejercicios de bajo impacto o nataci�n para mejorar la circulaci�n sangu�nea y fortalecer el sistema    " +
                                                  "\n inmunol�gico. Adem�s se recomienda la pr�ctica de ejercicios de relajaci�n como yoga o meditaci�n para reducir el     " +
                                                  "\n estr�s que puede afectar la respuesta inmunol�gica. POSIBLE TRATAMIENTO: El tratamiento suele incluir antibi�ticos    " +
                                                  "\n como la azitromicina en dosis �nica o la doxiciclina durante 7 d�as. En casos m�s severos los m�dicos pueden recetar  " +
                                                  "\n levofloxacina. Es fundamental seguir estrictamente el tratamiento indicado por el m�dico y evitar la automedicaci�n.  " +
                                                  "\n ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunol�gico y acelerar la recuperaci�n se recomienda el consumo   " +
                                                  "\n de FRUTOS ROJOS: Ricos en antioxidantes y vitamina C que ayudan a fortalecer el sistema inmunol�gico aportando        " +
                                                  "\n aproximadamente el 70% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos con        " +
                                                  "\n propiedades antiinflamatorias y puede ayudar a reducir la inflamaci�n. ESPINACAS Y BR�COLI: Aportan antioxidantes     " +
                                                  "\n y vitamina A esenciales para la regeneraci�n celular con un contenido de aproximadamente 56% de la ingesta diaria     " + 
                                                  "\n recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos que pueden fortalecer el sistema inmunol�gico       " +
                                                  "\n y mejorar la salud digestiva aportando calcio y prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico  " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente   " +
                                                  "\n correctas para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el           " +
                                                  "\n tratamiento adecuado de su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo         " +
                                                  "\n se le recomienda mucho consultar a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 a 3 litros de agua al d�a (diez a doce vasos de agua de tama�o regular)      " +
                                                  "\n para mantener la funci�n cerebral, facilitar la eliminaci�n de toxinas y apoyar el sistema inmunol�gico. En mujeres       " +
                                                  "\n adultas mayores, una hidrataci�n constante tambi�n ayuda a prevenir la deshidrataci�n, que puede agravar los s�ntomas     " +
                                                  "\n neurol�gicos. EJERCICIO: Actividad f�sica ligera como caminatas suaves, ejercicios de respiraci�n y estiramientos         " +
                                                  "\n controlados puede mejorar la circulaci�n cerebral y reducir la rigidez muscular. Es importante evitar el esfuerzo         " +
                                                  "\n excesivo y priorizar el descanso durante la fase aguda de la enfermedad. Una vez estabilizada, se recomienda incorporar   " +
                                                  "\n rutinas de movilidad para prevenir el deterioro funcional. POSIBLE TRATAMIENTO: El tratamiento inmediato incluye          " +
                                                  "\n antibi�ticos intravenosos de amplio espectro como Ceftriaxona, Cefotaxima o Ampicilina, ajustados seg�n el microorganismo " +
                                                  "\n identificado. Tambi�n se administran corticosteroides como la Dexametasona para reducir la inflamaci�n cerebral y         " +
                                                  "\n prevenir complicaciones como p�rdida auditiva o convulsiones. En casos graves, puede requerirse hospitalizaci�n           " +
                                                  "\n prolongada, monitoreo neurol�gico intensivo y el uso de anticonvulsivos si se presentan crisis. Es esencial iniciar el    " +
                                                  "\n tratamiento lo antes posible para reducir el riesgo de secuelas neurol�gicas permanentes. ALIMENTACI�N: Se recomienda     " +
                                                  "\n una dieta rica en nutrientes neuroprotectores como: Naranjas (ricas en vitamina C, fortalecen el sistema inmune, 89%      " +
                                                  "\n del requerimiento diario por cada 100 g); Aguacate (fuente de vitamina E y �cidos grasos saludables, 14% de la ingesta    " +
                                                  "\n diaria por cada 100 g); Pescados grasos (salm�n, at�n), ricos en Omega-3, que ayudan a reducir la inflamaci�n cerebral       " +
                                                  "\n (50% de la ingesta diaria por cada 100 g); Huevos (aportan colina, esencial para la funci�n cognitiva, 27% del requerimiento " +
                                                  "\n diario por unidad); y Nueces (ricas en �cido alfa-linol�nico, un tipo de Omega-3 vegetal, 91% por cada 30 g). Este es solo   " +
                                                  "\n un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que   " +
                                                  "\n las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para         " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface " +
                                                  "\n del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 a 3 litros de agua al d�a (diez a doce vasos de agua de tama�o regular)    " +
                                                  "\n para apoyar la funci�n renal, facilitar la eliminaci�n de toxinas derivadas del tratamiento y mantener la homeostasis   " +
                                                  "\n celular. En pacientes con c�ncer, una hidrataci�n adecuada tambi�n ayuda a reducir los efectos secundarios de la        " +
                                                  "\n quimioterapia como n�useas, fatiga y estre�imiento. EJERCICIO: Actividad f�sica moderada y adaptada como caminatas,     " +
                                                  "\n ejercicios de bajo impacto o yoga suave puede mejorar la calidad de vida, reducir la fatiga y fortalecer el sistema     " +
                                                  "\n inmunol�gico. Es importante realizar una evaluaci�n funcional previa para ajustar la intensidad del ejercicio seg�n     " +
                                                  "\n el estado f�sico de la paciente. POSIBLE TRATAMIENTO: El tratamiento depende del tipo y estadio del c�ncer, pero        " +
                                                  "\n puede incluir quimioterapia, radioterapia, inmunoterapia, cirug�a y terapias dirigidas. En mujeres adultas mayores,     " +
                                                  "\n se realiza una valoraci�n geri�trica integral para personalizar el tratamiento, considerando comorbilidades, estado     " +
                                                  "\n funcional y tolerancia a los f�rmacos. Tambi�n se emplean terapias hormonales en ciertos tipos de c�ncer como el de     " +
                                                  "\n mama, y se utilizan medicamentos de soporte como antiem�ticos, analg�sicos y suplementos nutricionales para mejorar     " +
                                                  "\n la tolerancia al tratamiento. El acompa�amiento psicol�gico y el seguimiento nutricional son claves para mantener la    " +
                                                  "\n adherencia terap�utica y la estabilidad emocional. ALIMENTACI�N: Se recomienda una dieta rica en antioxidantes,         " +
                                                  "\n prote�nas y grasas saludables como: Frutas c�tricas (naranjas, toronjas), con vitamina C (89% por cada 100 g); Aguacate," +
                                                  "\n fuente de vitamina E y �cidos grasos monoinsaturados (14% por cada 100 g); Pescados grasos (salm�n, sardina), ricos     " +
                                                  "\n en Omega-3 (50% por cada 100 g); Verduras de hoja verde (espinacas, acelgas), con vitamina A y hierro (56% y 15%        " +
                                                  "\n respectivamente por cada 100 g); Legumbres (lentejas, frijoles), con prote�nas vegetales y hierro (37% por cada 100 g); " +
                                                  "\n y Frutos secos (almendras, nueces), con selenio y zinc, que apoyan la funci�n inmune (45% y 30% respectivamente por     " +
                                                  "\n cada 30 g). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente  " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un    " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta " +
                                                  "\n del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la    " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.35-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la influenza es fundamental mantener una hidrataci�n adecuada con un consumo diario    " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a fluidificar las         " +
                                                  "\n secreciones respiratorias y prevenir la deshidrataci�n causada por la fiebre. EJERCICIO: Se recomienda actividad f�sica    " +
                                                  "\n ligera como caminatas suaves dentro del hogar estiramientos o ejercicios de movilidad evitando esfuerzos intensos mientras " +
                                                  "\n persistan los s�ntomas. Una vez superada la fase aguda es recomendable realizar ejercicios de respiraci�n profunda para    " +
                                                  "\n mejorar la oxigenaci�n y prevenir la p�rdida de masa muscular. POSIBLE TRATAMIENTO: El tratamiento suele incluir           " +
                                                  "\n medicamentos para reducir la fiebre y aliviar los s�ntomas como el paracetamol o el ibuprofeno y en casos m�s severos      " +
                                                  "\n los m�dicos pueden recetar antivirales espec�ficos como el oseltamivir. Es importante seguir las indicaciones m�dicas      " +
                                                  "\n y evitar el uso de aspirina ya que puede generar complicaciones. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema        " +
                                                  "\n inmunol�gico y acelerar la recuperaci�n se recomienda el consumo de NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda     " +
                                                  "\n a reducir la duraci�n de los s�ntomas aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100       " +
                                                  "\n gramos. JENGIBRE: Contiene compuestos con propiedades antiinflamatorias y puede aliviar la congesti�n. MIEL Y LIM�N:       " +
                                                  "\n Combinaci�n efectiva para calmar la garganta y reducir la tos aportando flavonoides y vitamina C. ESPINACAS Y BR�COLI:     " +
                                                  "\n Aportan antioxidantes y vitamina A esenciales para la regeneraci�n celular con un contenido de aproximadamente 56% de      " +
                                                  "\n la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos que pueden fortalecer el sistema    " +
                                                  "\n inmunol�gico y mejorar la salud digestiva aportando calcio y prote�nas esenciales. Este es solo un diagn�stico             " +
                                                  "\n predeterminado l�gico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas  " +
                                                  "\n sean completamente correctas para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad " +
                                                  "\n en el tratamiento adecuado de su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se   " +
                                                  "\n le recomienda mucho consultar a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la neumon�a es fundamental mantener una hidrataci�n adecuada con un consumo        " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a              " +
                                                  "\n fluidificar las secreciones pulmonares y facilitar su expulsi�n. EJERCICIO: Se recomienda actividad f�sica ligera      " +
                                                  "\n como caminatas lentas dentro del hogar ejercicios de respiraci�n profunda y estiramientos suaves evitando esfuerzos    " +
                                                  "\n intensos mientras persistan los s�ntomas. Una vez superada la fase aguda es recomendable realizar fisioterapia         " +
                                                  "\n respiratoria y ejercicios de expansi�n pulmonar para mejorar la capacidad pulmonar y reducir la sensaci�n de fatiga.   " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento suele incluir antibi�ticos como la amoxicilina la azitromicina o la ceftriaxona    " +
                                                  "\n y en casos m�s severos antivirales como el oseltamivir adem�s de medicamentos para reducir la fiebre como el           " +
                                                  "\n paracetamol o el ibuprofeno. Es importante seguir las indicaciones m�dicas y evitar la automedicaci�n. ALIMENTOS       " +
                                                  "\n RECOMENDADOS: Para fortalecer el sistema inmunol�gico y acelerar la recuperaci�n se recomienda el consumo de NARANJAS  " +
                                                  "\n Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la duraci�n de los s�ntomas aportando aproximadamente el 89% de    " +
                                                  "\n la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos con propiedades antiinflamatorias     " +
                                                  "\n y puede aliviar la congesti�n. ESPINACAS Y BR�COLI: Aportan antioxidantes y vitamina A esenciales para la regeneraci�n " +
                                                  "\n celular con un contenido de aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL:   " +
                                                  "\n Contiene probi�ticos que pueden fortalecer el sistema inmunol�gico y mejorar la salud digestiva aportando calcio y     " +
                                                  "\n prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100% que    " +
                                                  "\n el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer     " +
                                                  "\n m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s      " +
                                                  "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico     " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la diabetes es fundamental mantener una hidrataci�n adecuada con un consumo             " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a la                " +
                                                  "\n regulaci�n de la glucosa en sangre y prevenir la deshidrataci�n. EJERCICIO: Se recomienda actividad f�sica regular          " +
                                                  "\n como caminatas suaves ejercicios de bajo impacto o nataci�n para mejorar la sensibilidad a la insulina y controlar          " +
                                                  "\n los niveles de glucosa en sangre. Adem�s se recomienda la pr�ctica de ejercicios aer�bicos como bicicleta est�tica          " +
                                                  "\n o baile al menos 150 minutos por semana para mejorar la funci�n cardiovascular y reducir el riesgo de complicaciones.       " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento suele incluir medicamentos como la metformina para mejorar la sensibilidad a la         " +
                                                  "\n insulina y en casos m�s severos insulina de acci�n r�pida o prolongada adem�s de medicamentos para controlar la presi�n     " +
                                                  "\n arterial y el colesterol. Es importante seguir las indicaciones m�dicas y mantener un monitoreo constante de los niveles    " +
                                                  "\n de glucosa. ALIMENTOS RECOMENDADOS: Para fortalecer el metabolismo y mejorar el control de la glucosa se recomienda el      " +
                                                  "\n consumo de FRUTOS ROJOS: Ricos en antioxidantes y fibra que ayudan a regular la glucosa en sangre aportando aproximadamente " +
                                                  "\n el 32% de la ingesta diaria recomendada por cada 100 gramos. FRUTOS SECOS: Contienen grasas saludables y fibra que pueden   " +
                                                  "\n mejorar la sensibilidad a la insulina aportando aproximadamente el 25% de la ingesta diaria recomendada por cada 100 gramos." +
                                                  "\n ESPINACAS Y BR�COLI: Aportan antioxidantes y vitamina A esenciales para la regeneraci�n celular con un contenido de     " +
                                                  "\n aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos. AVENA: Rica en fibra soluble que ayuda a      " +
                                                  "\n estabilizar los niveles de glucosa en sangre aportando aproximadamente el 40% de la ingesta diaria recomendada por      " +
                                                  "\n cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100% que el       " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer m�s     " +
                                                  "\n de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s por su    " +
                                                  "\n salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico Angel L     " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2 a 2.5 litros de agua al d�a (ocho a diez vasos de agua de tama�o regular   " +
                                                  "\n para mantener las v�as respiratorias hidratadas, facilitar la eliminaci�n de secreciones y reducir la inflamaci�n     " +
                                                  "\n bronquial. En mujeres adultas mayores, una hidrataci�n constante tambi�n ayuda a prevenir la sequedad de mucosas y    " +
                                                  "\n mejora la funci�n pulmonar general. EJERCICIO: Actividad f�sica moderada como caminatas suaves, ejercicios de         " +
                                                  "\n respiraci�n y estiramientos controlados puede mejorar la capacidad pulmonar y reducir la frecuencia de las crisis     " +
                                                  "\n asm�ticas. Es importante evitar ambientes fr�os o contaminados y realizar calentamiento previo para prevenir la       " +
                                                  "\n broncoconstricci�n inducida por el ejercicio. POSIBLE TRATAMIENTO: El tratamiento incluye broncodilatadores de acci�n " +
                                                  "\n r�pida como Salbutamol (Ventolin, Aerolin), corticosteroides inhalados como Fluticasona o Budesonida (Flixotide,      " +
                                                  "\n Pulmicort), y en algunos casos, modificadores de leucotrienos como Montelukast (Singulair). En mujeres adultas mayores, " +
                                                  "\n es esencial revisar la t�cnica de inhalaci�n, ajustar las dosis para evitar efectos secundarios como temblores o      " +
                                                  "\n taquicardia, y considerar el uso de espaciadores para mejorar la administraci�n del medicamento. ALIMENTACI�N: Se     " +
                                                  "\n sugiere el consumo de alimentos antiinflamatorios y antioxidantes como: Pescados grasos (salm�n, at�n), ricos en      " +
                                                  "\n Omega-3, que ayudan a reducir la inflamaci�n de las v�as respiratorias (50% de la ingesta diaria recomendada por      " +
                                                  "\n cada 100 g); Frutas c�tricas (naranjas, toronjas), con vitamina C que fortalece el sistema inmune (89% por cada       " +
                                                  "\n 100 g); Espinacas (ricas en vitamina A y magnesio, esenciales para la funci�n pulmonar, con 56% y 20% respectivamente " +
                                                  "\n por cada 100 g); Jengibre y c�rcuma, con propiedades antiinflamatorias naturales. Este es solo un diagn�stico     " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las   " +
                                                  "\n respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para  " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no   " +
                                                  "\n le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida)  " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 litros de agua al d�a (diez vasos de agua de tama�o regular) para          " +
                                                  "\n apoyar la funci�n renal, facilitar la eliminaci�n de toxinas y mantener el equilibrio electrol�tico, especialmente      " +
                                                  "\n importante en pacientes que toman m�ltiples medicamentos. Tambi�n se sugiere incluir infusiones antioxidantes como      " +
                                                  "\n t� verde o rooibos. EJERCICIO: Actividad f�sica moderada como caminatas, yoga suave o ejercicios de bajo impacto        " +
                                                  "\n puede mejorar la masa muscular, reducir el estr�s y fortalecer el sistema inmunol�gico. Es importante adaptar la        " +
                                                  "\n rutina a la condici�n f�sica de la paciente y evitar el sobreesfuerzo. POSIBLE TRATAMIENTO: El tratamiento est�ndar     " +
                                                  "\n es la terapia antirretroviral (TAR), que combina medicamentos como Tenofovir, Emtricitabina, Efavirenz (Atripla),       " +
                                                  "\n Dolutegravir (Tivicay) y Lamivudina (Epivir). En mujeres adultas mayores, es crucial monitorear la funci�n hep�tica     " +
                                                  "\n y renal, as� como posibles interacciones con otros medicamentos para enfermedades cr�nicas. Tambi�n se recomienda el    " +
                                                  "\n seguimiento de la densidad �sea, ya que algunos antirretrovirales pueden afectar el metabolismo del calcio. El          " +
                                                  "\n acompa�amiento psicol�gico y el control nutricional son fundamentales para mantener la adherencia terap�utica y la      " +
                                                  "\n calidad de vida. ALIMENTACI�N: Se recomienda una dieta rica en nutrientes inmunoestimulantes como: Frutas c�tricas      " +
                                                  "\n (naranjas, limones), con vitamina C (89% por cada 100 g); Aguacate, fuente de vitamina E y �cidos grasos monoinsaturados" +
                                                  "\n (14% por cada 100 g); Pescados grasos (salm�n, sardina), ricos en Omega-3 (50% por cada 100 g); Verduras de hoja verde    " +
                                                  "\n (espinacas, acelgas), con vitamina A y hierro (56% y 15% respectivamente por cada 100 g); Legumbres (lentejas, frijoles), " +
                                                  "\n con prote�nas vegetales y hierro (37% por cada 100 g). Este es solo un diagn�stico predeterminado l�gico, haberlo         " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. " +
                                                  "\n Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento  " +
                                                  "\n adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a   " +
                                                  "\n su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2 a 2.5 litros de agua al d�a (ocho a diez vasos de agua de tama�o regular)     " +
                                                  "\n para facilitar la eliminaci�n de toxinas y mantener la funci�n renal, especialmente importante durante el tratamiento    " +
                                                  "\n antibi�tico. Tambi�n se sugiere el consumo de jugos naturales sin az�car para aportar antioxidantes. EJERCICIO:          " +
                                                  "\n Actividad f�sica ligera como caminatas o estiramientos suaves puede ayudar a mejorar la circulaci�n y fortalecer         " +
                                                  "\n el sistema inmune. Se debe evitar el ejercicio intenso durante el tratamiento para no comprometer la recuperaci�n.       " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento incluye antibi�ticos como Ceftriaxona (inyecci�n �nica) y Azitromicina (dosis oral). " +
                                                  "\n En mujeres adultas mayores, es importante vigilar posibles efectos secundarios gastrointestinales y ajustar la dosis en  " +
                                                  "\n caso de insuficiencia renal. Tambi�n se recomienda realizar pruebas de seguimiento para confirmar la erradicaci�n de la  " +
                                                  "\n bacteria y evitar reinfecciones. En casos resistentes, puede ser necesario el uso de combinaciones antibi�ticas o        " +
                                                  "\n tratamientos prolongados. ALIMENTACI�N: Se recomienda una dieta que apoye la funci�n inmunol�gica y la recuperaci�n,     " +
                                                  "\n incluyendo: Naranjas (ricas en vitamina C, 89% por cada 100 g); Espinacas (fuente de hierro y �cido f�lico, 56% y 49%    " +
                                                  "\n respectivamente por cada 100 g); Yogur natural (rico en probi�ticos y calcio, 30% de la ingesta diaria recomendada por   " +
                                                  "\n cada 100 g); Ajo (con propiedades antibacterianas naturales); y Zanahorias (ricas en vitamina A, 93% por cada 100 g),    " +
                                                  "\n que ayudan a mantener la integridad de las mucosas. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, " +
                                                  "\n se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado.       " +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.      " +
                                                  "\n �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una           " +
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales.            " +
                                                  "\n EJERCICIO. Se recomienda actividad f�sica moderada como caminatas suaves, yoga o ejercicios de estiramiento           " +
                                                  "\n de bajo impacto durante 30 minutos al d�a, cinco veces por semana, para fortalecer el sistema inmunol�gico y          " +
                                                  "\n reducir el estr�s, ya que el estr�s puede desencadenar brotes. Tambi�n es �til incorporar ejercicios de                  " +
                                                  "\n respiraci�n profunda y meditaci�n para mejorar la respuesta del cuerpo ante el virus. HIDRATACI�N. Se aconseja           " +
                                                  "\n consumir entre 2 y 2.5 litros de agua al d�a para mantener la piel y las mucosas hidratadas, lo cual ayuda a             " +
                                                  "\n reducir la irritaci�n y prevenir brotes. Adem�s, se recomienda evitar bebidas con cafe�na o alcohol, ya que pueden       " +
                                                  "\n favorecer la deshidrataci�n. Infusiones suaves como manzanilla o t� verde pueden ser beneficiosas por sus propiedades    " +
                                                  "\n antiinflamatorias y antioxidantes. POSIBLE TRATAMIENTO. El tratamiento para el herpes genital incluye antivirales        " +
                                                  "\n como aciclovir, famciclovir y valaciclovir, que ayudan a reducir la duraci�n y frecuencia de los brotes. Marcas          " +
                                                  "\n reconocidas incluyen Zovirax y Valtrex. En casos de recurrencias frecuentes, se puede considerar terapia supresiva       " +
                                                  "\n diaria. Tambi�n se recomienda el uso de cremas t�picas con lidoca�na o aloe vera para aliviar el malestar local.         " +
                                                  "\n ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica en lisina y antioxidantes para fortalecer el sistema inmunol�gico." +
                                                  "\n Algunos alimentos clave incluyen yogur natural y leche, ricos en lisina, que inhibe la replicaci�n del virus. Frutas     " +
                                                  "\n c�tricas como naranja y kiwi, ricas en vitamina C, que fortalecen el sistema inmune, aportando aproximadamente el 89%    " +
                                                  "\n del requerimiento diario por cada 100 gramos. Verduras como espinaca y zanahoria, ricas en vitamina A, que contribuyen   " +
                                                  "\n a la regeneraci�n celular y fortalecen las mucosas, con un aporte del 15% del requerimiento diario por cada 100 gramos.  " +
                                                  "\n Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga  " +
                                                  "\n herpes genital ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un      " +
                                                  "\n m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una          " +
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales.           " +
                                                  "\n EJERCICIO. Se recomienda actividad f�sica moderada como caminatas diarias de 30 minutos, ejercicios de movilidad     " +
                                                  "\n articular y estiramientos suaves para mejorar la circulaci�n, mantener la masa muscular y fortalecer el sistema      " +
                                                  "\n inmunol�gico. Tambi�n es beneficioso incluir ejercicios de equilibrio y coordinaci�n para prevenir ca�das.           " +
                                                  "\n HIDRATACI�N. Se aconseja consumir entre 2 y 2.5 litros de agua al d�a para ayudar a eliminar toxinas del cuerpo,     " +
                                                  "\n mantener la funci�n renal y apoyar el metabolismo durante el tratamiento antibi�tico. Tambi�n se recomienda el       " +
                                                  "\n consumo de caldos naturales y jugos de frutas sin az�car a�adida para mantener el equilibrio de electrolitos.        " +
                                                  "\n POSIBLE TRATAMIENTO. El tratamiento est�ndar para la s�filis incluye antibi�ticos como penicilina G benzatina,       " +
                                                  "\n doxiciclina o ceftriaxona. Marcas reconocidas incluyen Benzetacil y Doxiciclina. En pacientes al�rgicos a la         " +
                                                  "\n penicilina, se utilizan alternativas como la doxiciclina por v�a oral durante 14 d�as. Es fundamental completar el   " +
                                                  "\n tratamiento para evitar complicaciones como neuros�filis o da�o cardiovascular. ALIMENTACI�N RECOMENDADA. Se         " +
                                                  "\n recomienda una dieta rica en prote�nas, vitaminas y minerales para fortalecer el sistema inmunol�gico. Algunos       " +
                                                  "\n alimentos clave incluyen carnes magras y pescado, fuentes de prote�nas esenciales. Frutas c�tricas como naranja y    " +
                                                  "\n lim�n, ricas en vitamina C, que ayudan a la recuperaci�n y fortalecimiento del sistema inmune, aportando el 89% del  " +
                                                  "\n requerimiento diario por cada 100 gramos. Verduras de hoja verde como espinaca y br�coli, que contienen hierro y     " +
                                                  "\n antioxidantes esenciales para la producci�n de gl�bulos rojos, con un aporte del 15% del requerimiento diario por    " +
                                                  "\n cada 100 gramos. Ajo y cebolla, con compuestos antimicrobianos naturales que pueden apoyar el tratamiento. Este      " +
                                                  "\n diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga   " +
                                                  "\n s�filis ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico  " +
                                                  "\n para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidrataci�n     " +
                                                  "\n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda     " +
                                                  "\n actividad f�sica moderada como caminatas suaves, ejercicios de respiraci�n profunda y yoga terap�utico para fortalecer      " +
                                                  "\n los pulmones, mejorar la oxigenaci�n y reducir la fatiga. Tambi�n es �til realizar ejercicios de movilidad articular y      " +
                                                  "\n estiramientos para mantener la flexibilidad y prevenir la p�rdida de masa muscular. HIDRATACI�N. Se aconseja consumir       " +
                                                  "\n entre 2.5 y 3 litros de agua al d�a para mantener las v�as respiratorias hidratadas, facilitar la eliminaci�n de toxinas    " +
                                                  "\n y apoyar la funci�n renal durante el tratamiento. Tambi�n se recomienda el consumo de caldos ricos en minerales y jugos     " +
                                                  "\n naturales con alto contenido de vitamina C. POSIBLE TRATAMIENTO. El tratamiento est�ndar para la tuberculosis incluye       " +
                                                  "\n una combinaci�n de antibi�ticos como isoniazida, rifampicina, etambutol y pirazinamida durante un per�odo de al menos       " +
                                                  "\n seis meses. Marcas reconocidas incluyen Rifater y Rimactane. Es fundamental seguir el tratamiento completo y bajo           " +
                                                  "\n supervisi�n m�dica para evitar reca�das o resistencia bacteriana. En adultos mayores, se debe ajustar la dosis en caso      " +
                                                  "\n de insuficiencia renal o hep�tica y monitorear posibles efectos secundarios. ALIMENTACI�N RECOMENDADA. Se recomienda una    " +
                                                  "\n dieta rica en prote�nas, vitaminas y minerales para fortalecer el sistema inmunol�gico y apoyar la recuperaci�n. Algunos    " +
                                                  "\n alimentos clave incluyen carnes magras y pescado, fuentes de prote�nas esenciales. Frutas c�tricas como naranja y kiwi,     " +
                                                  "\n ricas en vitamina C, que ayudan a la recuperaci�n y fortalecimiento del sistema inmune, aportando el 89% del requerimiento  " +
                                                  "\n diario por cada 100 gramos. Verduras de hoja verde como espinaca y br�coli, que contienen hierro y antioxidantes esenciales " +
                                                  "\n para la producci�n de gl�bulos rojos, con un aporte del 15% del requerimiento diario por cada 100 gramos. Frutos secos como " +
                                                  "\n almendras y nueces, ricos en vitamina E y �cidos grasos esenciales, que fortalecen el sistema inmunol�gico y aportan el 37% " +
                                                  "\n del requerimiento diario por cada 28 gramos. Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero   " +
                                                  "\n no garantiza al 100% que el paciente tenga tuberculosis ni que el tratamiento sea el adecuado. Se recomienda realizar m�s   " +
                                                  "\n de un diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera" +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n La artritis es una inflamaci�n cr�nica de las articulaciones que puede provocar dolor, rigidez y p�rdida de       " +
                                                  "\n movilidad, siendo la osteoartritis la forma m�s com�n en la adultez mayor, especialmente en rodillas, caderas     " +
                                                  "\n y manos. EJERCICIO. Se recomienda actividad f�sica moderada y adaptada a las capacidades de la persona, como      " +
                                                  "\n caminatas suaves, ejercicios acu�ticos o yoga terap�utico, que ayudan a mantener la flexibilidad, reducir la      " +
                                                  "\n rigidez y fortalecer los m�sculos que rodean las articulaciones. Tambi�n es �til realizar ejercicios de bajo      " +
                                                  "\n impacto con apoyo, como bicicleta est�tica o estiramientos guiados. HIDRATACI�N. Es fundamental consumir entre    " +
                                                  "\n 2 y 2.5 litros de agua al d�a para mantener la lubricaci�n de las articulaciones, facilitar la eliminaci�n de     " +
                                                  "\n toxinas y reducir la inflamaci�n. Se sugiere complementar con infusiones de c�rcuma o jengibre, que poseen        " +
                                                  "\n propiedades antiinflamatorias naturales. POSIBLE TRATAMIENTO. El tratamiento puede incluir medicamentos           " +
                                                  "\n antiinflamatorios no esteroides como ibuprofeno o naproxeno, corticosteroides en casos m�s severos, y f�rmacos     " +
                                                  "\n modificadores de la enfermedad como el metotrexato. Tambi�n se recomienda fisioterapia, terapia ocupacional y en   " +
                                                  "\n algunos casos el uso de suplementos como glucosamina y condroitina para mejorar la salud articular. ALIMENTACI�N   " +
                                                  "\n RECOMENDADA. Consumir alimentos ricos en antioxidantes y �cidos grasos esenciales. Pescados grasos como salm�n y     " +
                                                  "\n sardina, ricos en �cidos grasos Omega-3, que ayudan a reducir la inflamaci�n articular, aportando hasta el 90% del   " +
                                                  "\n requerimiento diario por cada 100 g. Frutas como ar�ndanos y fresas, ricas en vitamina C y antioxidantes, que        " +
                                                  "\n fortalecen el sistema inmunol�gico y reducen el da�o celular, aportando cerca del 70% del requerimiento diario por   " +
                                                  "\n cada 100 g. Verduras de hoja verde como espinaca y kale, que contienen hierro, calcio y vitamina K, esenciales para  " +
                                                  "\n la salud �sea y articular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%" +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se        " +
                                                  "\n recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su      " +
                                                  "\n paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar " +
                                                  "\n a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n La tosferina, o pertussis, es una infecci�n bacteriana que afecta las v�as respiratorias y puede causar tos           " +
                                                  "\n intensa y prolongada. En adultos mayores, puede ser m�s severa y provocar complicaciones respiratorias.               " +
                                                  "\n EJERCICIO. Se recomienda actividad f�sica ligera, como caminatas cortas o ejercicios de respiraci�n profunda,         " +
                                                  "\n para mejorar la oxigenaci�n sin agotar al paciente. Es importante evitar ambientes fr�os o contaminados que           " +
                                                  "\n puedan agravar los s�ntomas. HIDRATACI�N. Es fundamental consumir entre 2 y 2.5 litros de agua al d�a para            " +
                                                  "\n mantener las v�as respiratorias hidratadas y facilitar la eliminaci�n de mucosidad. Tambi�n se recomienda el          " +
                                                  "\n consumo de l�quidos tibios como infusiones de jengibre o t� de manzanilla para aliviar la garganta. POSIBLE           " +
                                                  "\n TRATAMIENTO. El tratamiento incluye antibi�ticos como azitromicina, claritromicina o eritromicina, que ayudan         " +
                                                  "\n a eliminar la bacteria. En casos con dificultad respiratoria, pueden utilizarse broncodilatadores. Se recomienda      " +
                                                  "\n reposo y aislamiento durante los primeros d�as para evitar contagios. ALIMENTACI�N RECOMENDADA. Consumir              " +
                                                  "\n alimentos que fortalezcan el sistema respiratorio. Frutas c�tricas como naranja y toronja, ricas en vitamina C,       " +
                                                  "\n que ayudan a reducir la duraci�n de los s�ntomas, aportando hasta el 89% del requerimiento diario por cada 100 g.     " +
                                                  "\n Miel, con propiedades antimicrobianas y calmantes para la garganta. Jengibre, con efectos antiinflamatorios que       " +
                                                  "\n pueden aliviar la tos. Yogur natural, fuente de probi�ticos que fortalecen la flora intestinal y el sistema inmune.   " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga      " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de    " +
                                                  "\n un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su    " +
                                                  "\n salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, �ngel    " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Las paperas son una infecci�n viral que afecta las gl�ndulas salivales, causando inflamaci�n y dolor en la            " +
                                                  "\n zona de la mand�bula. En adultos mayores, pueden presentarse s�ntomas m�s intensos y riesgo de complicaciones.        " +
                                                  "\n EJERCICIO. Se recomienda actividad f�sica ligera mientras persistan los s�ntomas, como estiramientos suaves o         " +
                                                  "\n caminatas cortas, evitando esfuerzos que puedan aumentar la inflamaci�n. HIDRATACI�N. Es fundamental consumir         " +
                                                  "\n entre 2 y 2.5 litros de agua al d�a para ayudar al cuerpo a combatir la infecci�n y mantenerse hidratado. Se          " +
                                                  "\n sugiere complementar con l�quidos suaves como caldos o infusiones de manzanilla. POSIBLE TRATAMIENTO. No existe       " +
                                                  "\n un tratamiento antiviral espec�fico para las paperas. Se recomienda el uso de paracetamol para aliviar la fiebre      " +
                                                  "\n y el dolor, evitando el ibuprofeno y la aspirina. Tambi�n se sugiere el uso de compresas fr�as en la zona inflamada   " +
                                                  "\n y reposo absoluto durante los primeros d�as. ALIMENTACI�N RECOMENDADA. Consumir alimentos blandos y ricos en          " +
                                                  "\n nutrientes. Frutas c�tricas como naranja y mandarina, ricas en vitamina C, que fortalecen el sistema inmunol�gico,    " +
                                                  "\n aportando hasta el 89% del requerimiento diario por cada 100 g. Yogur natural, fuente de probi�ticos que ayudan a     " +
                                                  "\n mantener la flora intestinal. Verduras de hoja verde como espinaca, que aportan hierro y antioxidantes esenciales     " +
                                                  "\n para la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%      " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se      " +
                                                  "\n recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su    " +
                                                  "\n paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho         " +
                                                  "\n consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n EJERCICIO: Durante la infecci�n por el virus del Zika se recomienda evitar cualquier esfuerzo f�sico intenso     " +
                                                  "\n y priorizar el descanso absoluto, ya que el sistema inmunol�gico necesita conservar energ�a para combatir el     " +
                                                  "\n virus. Una vez que los s�ntomas disminuyen, se pueden realizar ejercicios suaves como caminatas lentas o         " +
                                                  "\n estiramientos ligeros para mejorar la circulaci�n y reducir la rigidez muscular. Tambi�n es �til practicar       " +
                                                  "\n ejercicios de respiraci�n profunda para mejorar la oxigenaci�n celular y reducir la inflamaci�n. HIDRATACI�N:    " +
                                                  "\n Es fundamental consumir al menos 2.5 litros de agua al d�a para prevenir la deshidrataci�n, regular la           " +
                                                  "\n temperatura corporal y facilitar la eliminaci�n de toxinas. Tambi�n se recomienda el consumo de caldos           " +
                                                  "\n naturales, infusiones como t� de jengibre o manzanilla, y jugos naturales sin az�car a�adida, que adem�s         " +
                                                  "\n de hidratar aportan antioxidantes y alivian s�ntomas como el dolor muscular y la fiebre. POSIBLE TRATAMIENTO:    " +
                                                  "\n No existe un tratamiento antiviral espec�fico para el Zika, pero los s�ntomas pueden aliviarse con reposo,       " +
                                                  "\n hidrataci�n constante y medicamentos como el acetaminof�n para reducir la fiebre y el dolor. Es importante       " +
                                                  "\n evitar el uso de aspirina y otros antiinflamatorios no esteroideos hasta descartar la posibilidad de dengue,     " +
                                                  "\n para reducir el riesgo de hemorragias. Tambi�n se recomienda evitar el consumo de alcohol y tabaco durante la    " +
                                                  "\n recuperaci�n, ya que pueden debilitar el sistema inmunol�gico. ALIMENTACI�N: Se recomienda el consumo de         " +
                                                  "\n alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, tales como     " +
                                                  "\n frutas c�tricas como naranjas y toronjas, que aportan vitamina C en un 89% de la ingesta diaria recomendada,     " +
                                                  "\n ayudando a combatir infecciones. Verduras de hoja verde como espinacas y acelgas, que aportan hasta un 50% de    " +
                                                  "\n la ingesta diaria recomendada de vitamina A y K, esenciales para la regeneraci�n celular. Jengibre y c�rcuma,    " +
                                                  "\n que poseen propiedades antiinflamatorias y antioxidantes, contribuyendo con hasta un 40% de la ingesta diaria    " +
                                                  "\n recomendada de compuestos bioactivos beneficiosos para la salud. este es solo un diagn�stico predeterminado      " +
                                                  "\n l�gico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas      " +
                                                  "\n sean completamente correctas. se recomienda realizar m�s de un diagn�stico para mayor seguridad en el            " +
                                                  "\n tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se         " +
                                                  "\n recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n EJERCICIO: Durante la infecci�n por rotavirus se recomienda evitar cualquier tipo de esfuerzo f�sico y priorizar      " +
                                                  "\n el descanso absoluto, ya que la p�rdida de l�quidos y nutrientes puede provocar debilidad extrema. Una vez superada   " +
                                                  "\n la fase aguda, se pueden realizar ejercicios suaves como caminatas lentas o estiramientos para estimular la           " +
                                                  "\n circulaci�n y recuperar la energ�a. Tambi�n es recomendable realizar ejercicios de respiraci�n para mejorar la        " +
                                                  "\n oxigenaci�n celular y reducir la fatiga. HIDRATACI�N: Es crucial el consumo de al menos 2.5 litros de agua al d�a     " +
                                                  "\n para prevenir la deshidrataci�n causada por la diarrea y los v�mitos. Tambi�n se recomienda el uso de soluciones de   " +
                                                  "\n rehidrataci�n oral que contienen electrolitos esenciales como sodio, potasio y glucosa, los cuales ayudan a           " +
                                                  "\n restablecer el equilibrio h�drico y energ�tico del cuerpo. El consumo de caldos naturales y jugos suaves sin          " +
                                                  "\n az�car tambi�n puede ser beneficioso. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral espec�fico para         " +
                                                  "\n el rotavirus, pero los s�ntomas pueden aliviarse con hidrataci�n intensiva, reposo y una dieta adecuada. Se deben     " +
                                                  "\n evitar los medicamentos antidiarreicos, ya que pueden prolongar la infecci�n. En casos graves, puede ser necesaria    " +
                                                  "\n la administraci�n de l�quidos por v�a intravenosa. Tambi�n se recomienda el consumo de probi�ticos para restaurar     " +
                                                  "\n la flora intestinal. ALIMENTACI�N: Se recomienda el consumo de alimentos que favorezcan la recuperaci�n del sistema   " +
                                                  "\n digestivo, tales como yogur natural, que contiene probi�ticos beneficiosos para la flora intestinal. Frutas como      " +
                                                  "\n pl�tanos y manzanas, que aportan fibra soluble y ayudan a regular el tr�nsito intestinal. Verduras como zanahorias    " +
                                                  "\n y calabacines, que contienen antioxidantes y vitaminas esenciales como la vitamina A y el potasio, aportando hasta    " +
                                                  "\n un 50% de la ingesta diaria recomendada, fundamentales para la regeneraci�n de la mucosa intestinal. este es solo     " +
                                                  "\n un diagn�stico predeterminado l�gico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad   " +
                                                  "\n ni que las respuestas sean completamente correctas. se recomienda realizar m�s de un diagn�stico para mayor seguridad " +
                                                  "\n en el tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se        " +
                                                  "\n recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n EJERCICIO: Durante la infecci�n por listeria se recomienda evitar esfuerzos f�sicos intensos y priorizar el descanso,    " +
                                                  "\n ya que el cuerpo necesita conservar energ�a para combatir la bacteria. Una vez que los s�ntomas disminuyen, se pueden    " +
                                                  "\n realizar ejercicios suaves como caminatas lentas o ejercicios de respiraci�n para mejorar la oxigenaci�n celular y       " +
                                                  "\n reducir la fatiga. Tambi�n es importante mantener una rutina de movilidad ligera para prevenir la rigidez muscular y     " +
                                                  "\n mejorar la circulaci�n. HIDRATACI�N: Es fundamental consumir al menos 2.5 litros de agua al d�a para ayudar a eliminar   " +
                                                  "\n toxinas y mantener el equilibrio de los fluidos corporales. Tambi�n se recomienda el consumo de caldos naturales,        " +
                                                  "\n infusiones suaves y jugos sin az�car para aportar electrolitos esenciales. La hidrataci�n adecuada contribuye a la       " +
                                                  "\n eliminaci�n de bacterias a trav�s de la orina y mejora la funci�n renal, lo cual es clave durante una infecci�n          " +
                                                  "\n bacteriana. POSIBLE TRATAMIENTO: La infecci�n por listeria se trata con antibi�ticos como ampicilina o gentamicina,      " +
                                                  "\n especialmente en casos graves o en pacientes inmunocomprometidos. En adultos mayores, el tratamiento debe iniciarse      " +
                                                  "\n lo antes posible para evitar complicaciones como septicemia o meningitis. Tambi�n se recomienda evitar alimentos de      " +
                                                  "\n alto riesgo como productos l�cteos no pasteurizados, embutidos y pescados ahumados durante la recuperaci�n. ALIMENTACI�N:" +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema        " +
                                                  "\n inmunol�gico, tales como frutas c�tricas como naranjas y toronjas, que aportan vitamina C en un 89% de la ingesta      " +
                                                  "\n diaria recomendada, ayudando a combatir infecciones. Verduras de hoja verde como espinacas y acelgas, que aportan      " +
                                                  "\n hasta un 50% de la ingesta diaria recomendada de vitamina A y K, esenciales para la regeneraci�n celular. Frutos       " +
                                                  "\n secos como almendras y nueces, que contienen vitamina E y magnesio, contribuyendo con hasta un 40% de la ingesta       " +
                                                  "\n diaria recomendada de estos nutrientes esenciales para la recuperaci�n neurol�gica. este es solo un diagn�stico        " +
                                                  "\n predeterminado l�gico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las        " +
                                                  "\n respuestas sean completamente correctas. se recomienda realizar m�s de un diagn�stico para mayor seguridad en el       " +
                                                  "\n tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda    " +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la shigelosis es fundamental mantener una hidrataci�n adecuada con un consumo    " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para reponer los         " +
                                                  "\n l�quidos perdidos por la diarrea y prevenir la deshidrataci�n. EJERCICIO: Se recomienda actividad f�sica ligera      " +
                                                  "\n como caminatas suaves dentro del hogar o ejercicios de movilidad articular evitando esfuerzos intensos mientras      " +
                                                  "\n persistan los s�ntomas. Una vez superada la fase aguda es recomendable realizar ejercicios de fortalecimiento        " +
                                                  "\n progresivo para recuperar energ�a y mejorar la funci�n digestiva. POSIBLE TRATAMIENTO: El tratamiento suele incluir  " +
                                                  "\n antibi�ticos como la ciprofloxacina o la azitromicina y en casos m�s severos ceftriaxona. Es importante evitar       " +
                                                  "\n medicamentos antidiarreicos sin indicaci�n m�dica ya que pueden empeorar la eliminaci�n de la bacteria. ALIMENTOS    " +
                                                  "\n RECOMENDADOS: Para fortalecer el sistema digestivo y acelerar la recuperaci�n se recomienda el consumo de PL�TANOS:  " +
                                                  "\n Ricos en potasio que ayuda a reemplazar los electrolitos perdidos debido a la diarrea aportando aproximadamente el   " +
                                                  "\n 12% de la ingesta diaria recomendada por cada 100 gramos. ARROZ BLANCO: Fuente de carbohidratos de f�cil digesti�n   " +
                                                  "\n que ayuda a estabilizar el sistema digestivo. ZANAHORIAS: Ricas en vitamina A y antioxidantes que ayudan a la        " +
                                                  "\n regeneraci�n celular aportando aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos. YOGUR  " +
                                                  "\n NATURAL: Contiene probi�ticos que pueden fortalecer el sistema digestivo y mejorar la salud intestinal aportando   " +
                                                  "\n calcio y prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza   " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se      " +
                                                  "\n recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de    " +
                                                  "\n su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho    " +
                                                  "\n consultar a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la EPOC es fundamental mantener una hidrataci�n adecuada con un consumo               " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a                 " +
                                                  "\n mantener las v�as respiratorias hidratadas y facilitar la expulsi�n de mucosidad. EJERCICIO: Se recomienda                " +
                                                  "\n actividad f�sica ligera como caminatas lentas ejercicios de respiraci�n profunda y estiramientos suaves para              " +
                                                  "\n mejorar la oxigenaci�n y la capacidad pulmonar. Adem�s se recomienda la pr�ctica de ejercicios de fortalecimiento         " +
                                                  "\n muscular y fisioterapia respiratoria adaptada a la capacidad del paciente para mantener la funcionalidad y prevenir       " +
                                                  "\n la p�rdida de masa muscular. POSIBLE TRATAMIENTO: El tratamiento suele incluir broncodilatadores de acci�n r�pida         " +
                                                  "\n como el salbutamol corticosteroides inhalados como la fluticasona y en algunos casos terapia con ox�geno. Es fundamental  " +
                                                  "\n seguir estrictamente el plan de acci�n indicado por el m�dico y evitar la exposici�n a contaminantes ambientales.         " +
                                                  "\n ALIMENTOS RECOMENDADOS: Para fortalecer el sistema respiratorio y reducir la inflamaci�n se recomienda el consumo         " +
                                                  "\n de PESCADOS GRASOS: Salm�n y at�n ricos en �cidos grasos Omega-3 que poseen propiedades antiinflamatorias que pueden      " +
                                                  "\n ayudar a reducir la inflamaci�n de las v�as respiratorias aportando aproximadamente el 50% de la ingesta diaria           " +
                                                  "\n recomendada por cada 100 gramos. FRUTAS Y VERDURAS DE COLORES VIVOS: Ar�ndanos fresas espinacas br�coli ricos en          " +
                                                  "\n antioxidantes como la vitamina C y carotenoides que pueden proteger las c�lulas del da�o y fortalecer el sistema          " +
                                                  "\n inmunol�gico aportando aproximadamente el 70% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene    " +
                                                  "\n compuestos con efectos antiinflamatorios que podr�an ser beneficiosos para las v�as respiratorias. C�RCUMA: Con su        " +
                                                  "\n componente activo la curcumina tambi�n tiene potentes propiedades antiinflamatorias y antioxidantes. Este es solo un      " +
                                                  "\n diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que    " +
                                                  "\n las respuestas sean completamente correctas para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para           " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s por su salud si la respuesta del Diagn�stico  " +
                                                  "\n no le satisface del todo se le recomienda mucho consultar a su m�dico Angel L Montes agradece tu visita a la app          " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la clamidia es fundamental mantener una hidrataci�n adecuada con un consumo        " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a la           " +
                                                  "\n eliminaci�n de toxinas y fortalecer el sistema inmunol�gico. EJERCICIO: Se recomienda actividad f�sica moderada        " +
                                                  "\n como caminatas ejercicios de bajo impacto o nataci�n para mejorar la circulaci�n sangu�nea y fortalecer el sistema     " +
                                                  "\n inmunol�gico. Adem�s se recomienda la pr�ctica de ejercicios de relajaci�n como yoga o meditaci�n para reducir el      " +
                                                  "\n estr�s que puede afectar la respuesta inmunol�gica. POSIBLE TRATAMIENTO: El tratamiento suele incluir antibi�ticos     " +
                                                  "\n como la azitromicina en dosis �nica o la doxiciclina durante 7 d�as y en casos m�s severos levofloxacina. Es           " +
                                                  "\n fundamental seguir estrictamente el tratamiento indicado por el m�dico y evitar la automedicaci�n. ALIMENTOS           " +
                                                  "\n RECOMENDADOS: Para fortalecer el sistema inmunol�gico y acelerar la recuperaci�n se recomienda el consumo de FRUTOS    " +
                                                  "\n ROJOS: Ricos en antioxidantes y vitamina C que ayudan a fortalecer el sistema inmunol�gico aportando aproximadamente   " +
                                                  "\n el 70% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos con propiedades             " +
                                                  "\n antiinflamatorias y puede ayudar a reducir la inflamaci�n. ESPINACAS Y BR�COLI: Aportan antioxidantes y vitamina A     " +
                                                  "\n esenciales para la regeneraci�n celular con un contenido de aproximadamente 56% de la ingesta diaria recomendada por     " +
                                                  "\n cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos que pueden fortalecer el sistema inmunol�gico y mejorar la salud    " +
                                                  "\n digestiva aportando calcio y prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello  " +
                                                  "\n se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su    " +
                                                  "\n paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar   " +
                                                  "\n a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 a 3 litros de agua al d�a (diez a doce vasos de agua de tama�o regular)          " +
                                                  "\n para mantener la funci�n cerebral, facilitar la eliminaci�n de toxinas y apoyar el sistema inmunol�gico. En mujeres           " +
                                                  "\n adultas mayores, una hidrataci�n constante tambi�n ayuda a prevenir la deshidrataci�n, que puede agravar los s�ntomas         " +
                                                  "\n neurol�gicos y aumentar el riesgo de complicaciones. EJERCICIO: Actividad f�sica ligera como caminatas suaves, ejercicios     " +
                                                  "\n de respiraci�n y estiramientos controlados puede mejorar la circulaci�n cerebral y reducir la rigidez muscular. Es            " +
                                                  "\n importante evitar el esfuerzo excesivo y priorizar el descanso durante la fase aguda de la enfermedad. Una vez estabilizada,  " +
                                                  "\n se recomienda incorporar rutinas de movilidad para prevenir el deterioro funcional y mantener la autonom�a. POSIBLE           " +
                                                  "\n TRATAMIENTO: El tratamiento inmediato incluye antibi�ticos intravenosos de amplio espectro como Ceftriaxona, Cefotaxima o     " +
                                                  "\n Ampicilina, ajustados seg�n el microorganismo identificado. Tambi�n se administran corticosteroides como la Dexametasona      " +
                                                  "\n para reducir la inflamaci�n cerebral y prevenir complicaciones como p�rdida auditiva o convulsiones. En casos graves,         " +
                                                  "\n puede requerirse hospitalizaci�n prolongada, monitoreo neurol�gico intensivo y el uso de anticonvulsivos si se presentan      " +
                                                  "\n crisis. Adem�s, se recomienda el seguimiento con evaluaciones cognitivas y apoyo neuropsicol�gico para detectar posibles      " +
                                                  "\n secuelas. ALIMENTACI�N: Se recomienda una dieta rica en nutrientes neuroprotectores como: Naranjas (ricas en vitamina C,      " +
                                                  "\n fortalecen el sistema inmune, 89% del requerimiento diario por cada 100 g); Aguacate (fuente de vitamina E y �cidos grasos    " +
                                                  "\n saludables, 14% de la ingesta diaria por cada 100 g); Pescados grasos (salm�n, at�n), ricos en Omega-3, que ayudan a          " +
                                                  "\n reducir la inflamaci�n cerebral (50% de la ingesta diaria por cada 100 g); Huevos (aportan colina, esencial para la           " +
                                                  "\n funci�n cognitiva, 27% del requerimiento diario por unidad); y Nueces (ricas en �cido alfa-linol�nico, un tipo de Omega-3     " +
                                                  "\n vegetal, 91% por cada 30 g). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%       " +
                                                  "\n que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda            " +
                                                  "\n realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Adem�s, por             " +
                                                  "\n su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L              " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 a 3 litros de agua al d�a (diez a doce vasos de agua de tama�o regular)        " +
                                                  "\n para apoyar la funci�n renal, facilitar la eliminaci�n de toxinas derivadas del tratamiento y mantener la homeostasis       " +
                                                  "\n celular. En pacientes con c�ncer, una hidrataci�n adecuada tambi�n ayuda a reducir los efectos secundarios de la            " +
                                                  "\n quimioterapia como n�useas, fatiga y estre�imiento. EJERCICIO: Actividad f�sica moderada y adaptada como caminatas,         " +
                                                  "\n ejercicios de bajo impacto o yoga suave puede mejorar la calidad de vida, reducir la fatiga y fortalecer el sistema         " +
                                                  "\n inmunol�gico. Es importante realizar una evaluaci�n funcional previa para ajustar la intensidad del ejercicio seg�n         " +
                                                  "\n el estado f�sico de la paciente. POSIBLE TRATAMIENTO: El tratamiento depende del tipo y estadio del c�ncer, pero puede      " +
                                                  "\n incluir quimioterapia, radioterapia, inmunoterapia, cirug�a y terapias dirigidas. En mujeres adultas mayores, se            " +  
                                                  "\n realiza una valoraci�n geri�trica integral para personalizar el tratamiento, considerando comorbilidades, estado            " +
                                                  "\n funcional y tolerancia a los f�rmacos. Tambi�n se emplean terapias hormonales en ciertos tipos de c�ncer como el            " +
                                                  "\n de mama, y se utilizan medicamentos de soporte como antiem�ticos, analg�sicos y suplementos nutricionales para mejorar      " +
                                                  "\n la tolerancia al tratamiento. El acompa�amiento psicol�gico y el seguimiento nutricional son claves para mantener la        " +
                                                  "\n adherencia terap�utica y la estabilidad emocional. ALIMENTACI�N: Se recomienda una dieta rica en antioxidantes, prote�nas   " +
                                                  "\n y grasas saludables como: Frutas c�tricas (naranjas, toronjas), con vitamina C (89% por cada 100 g); Aguacate, fuente de    " +
                                                  "\n vitamina E y �cidos grasos monoinsaturados (14% por cada 100 g); Pescados grasos (salm�n, sardina), ricos en Omega-3        " +
                                                  "\n (50% por cada 100 g); Verduras de hoja verde (espinacas, acelgas), con vitamina A y hierro (56% y 15% respectivamente       " +
                                                  "\n por cada 100 g); Legumbres (lentejas, frijoles), con prote�nas vegetales y hierro (37% por cada 100 g); y Frutos secos      " +
                                                  "\n (almendras, nueces), con selenio y zinc, que apoyan la funci�n inmune (45% y 30% respectivamente por cada 30 g). Este es    " +
                                                  "\n solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad    " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida      " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le     " +
                                                  "\n satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera      " +
                                                  "\n que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.50-1.75 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la influenza es fundamental mantener una hidrataci�n adecuada con un consumo    " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a           " +
                                                  "\n fluidificar las secreciones respiratorias y prevenir la deshidrataci�n causada por la fiebre. EJERCICIO: Se         " +
                                                  "\n recomienda actividad f�sica ligera como caminatas suaves dentro del hogar estiramientos o ejercicios de movilidad   " +
                                                  "\n evitando esfuerzos intensos mientras persistan los s�ntomas. Una vez superada la fase aguda es recomendable         " +
                                                  "\n realizar ejercicios de respiraci�n profunda para mejorar la oxigenaci�n y prevenir la p�rdida de masa muscular.     " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento suele incluir medicamentos para reducir la fiebre y aliviar los s�ntomas como   " +
                                                  "\n el paracetamol o el ibuprofeno y en casos m�s severos los m�dicos pueden recetar antivirales espec�ficos como el    " +
                                                  "\n oseltamivir. Es importante seguir las indicaciones m�dicas y evitar el uso de aspirina ya que puede generar         " +
                                                  "\n complicaciones. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunol�gico y acelerar la recuperaci�n se       " +
                                                  "\n recomienda el consumo de NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la duraci�n de los s�ntomas   " +
                                                  "\n aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene           " +
                                                  "\n compuestos con propiedades antiinflamatorias y puede aliviar la congesti�n. MIEL Y LIM�N: Combinaci�n efectiva      " +
                                                  "\n para calmar la garganta y reducir la tos aportando flavonoides y vitamina C. ESPINACAS Y BR�COLI: Aportan           " +
                                                  "\n antioxidantes y vitamina A esenciales para la regeneraci�n celular con un contenido de aproximadamente 56% de la    " +
                                                  "\n ingesta diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos que pueden fortalecer el        " +
                                                  "\n sistema inmunol�gico y mejorar la salud digestiva aportando calcio y prote�nas esenciales. Este es solo un          " +
                                                  "\n diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad     " +
                                                  "\n ni que las respuestas sean completamente correctas para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida   " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s por su salud si la respuesta del   " +
                                                  "\n Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico Angel L Montes agradece tu        " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la neumon�a es fundamental mantener una hidrataci�n adecuada con un consumo    " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a          " +
                                                  "\n fluidificar las secreciones pulmonares y facilitar su expulsi�n. EJERCICIO: Se recomienda actividad f�sica ligera  " +
                                                  "\n como caminatas lentas dentro del hogar ejercicios de respiraci�n profunda y estiramientos suaves evitando          " +
                                                  "\n esfuerzos intensos mientras persistan los s�ntomas. Una vez superada la fase aguda es recomendable realizar        " +
                                                  "\n fisioterapia respiratoria y ejercicios de expansi�n pulmonar para mejorar la capacidad pulmonar y reducir la       " +
                                                  "\n sensaci�n de fatiga. POSIBLE TRATAMIENTO: El tratamiento suele incluir antibi�ticos como la amoxicilina la         " +
                                                  "\n azitromicina o la ceftriaxona y en casos m�s severos antivirales como el oseltamivir adem�s de medicamentos para   " +
                                                  "\n reducir la fiebre como el paracetamol o el ibuprofeno. Es importante seguir las indicaciones m�dicas y evitar la   " +
                                                  "\n automedicaci�n. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunol�gico y acelerar la recuperaci�n se      " +
                                                  "\n recomienda el consumo de NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la duraci�n de los s�ntomas     " +
                                                  "\n aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos  " +
                                                  "\n con propiedades antiinflamatorias y puede aliviar la congesti�n. ESPINACAS Y BR�COLI: Aportan antioxidantes y         " +
                                                  "\n vitamina A esenciales para la regeneraci�n celular con un contenido de aproximadamente 56% de la ingesta diaria       " +
                                                  "\n recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos que pueden fortalecer el sistema inmunol�gico    " +
                                                  "\n y mejorar la salud digestiva aportando calcio y prote�nas esenciales. Este es solo un diagn�stico predeterminado      " +
                                                  "\n l�gico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean        " +
                                                  "\n completamente correctas para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad  " +
                                                  "\n en el tratamiento adecuado de su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo   " +
                                                  "\n se le recomienda mucho consultar a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la diabetes es fundamental mantener una hidrataci�n adecuada con un consumo            " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a la               " +
                                                  "\n regulaci�n de la glucosa en sangre y prevenir la deshidrataci�n. EJERCICIO: Se recomienda actividad f�sica regular         " +
                                                  "\n como caminatas suaves ejercicios de bajo impacto o nataci�n para mejorar la sensibilidad a la insulina y controlar         " +
                                                  "\n los niveles de glucosa en sangre. Adem�s se recomienda la pr�ctica de ejercicios aer�bicos como bicicleta est�tica         " +
                                                  "\n o baile al menos 150 minutos por semana para mejorar la funci�n cardiovascular y reducir el riesgo de complicaciones.      " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento suele incluir medicamentos como la metformina para mejorar la sensibilidad a la        " +
                                                  "\n insulina y en casos m�s severos insulina de acci�n r�pida o prolongada adem�s de medicamentos para controlar la presi�n    " +
                                                  "\n arterial y el colesterol. Es importante seguir las indicaciones m�dicas y mantener un monitoreo constante de los niveles   " +
                                                  "\n de glucosa. ALIMENTOS RECOMENDADOS: Para fortalecer el metabolismo y mejorar el control de la glucosa se recomienda el      " +
                                                  "\n consumo de FRUTOS ROJOS: Ricos en antioxidantes y fibra que ayudan a regular la glucosa en sangre aportando aproximadamente " +
                                                  "\n el 32% de la ingesta diaria recomendada por cada 100 gramos. FRUTOS SECOS: Contienen grasas saludables y fibra que         " +
                                                  "\n pueden mejorar la sensibilidad a la insulina aportando aproximadamente el 25% de la ingesta diaria recomendada por         " +
                                                  "\n cada 100 gramos. ESPINACAS Y BR�COLI: Aportan antioxidantes y vitamina A esenciales para la regeneraci�n celular con       " +
                                                  "\n un contenido de aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos. AVENA: Rica en fibra soluble     " +
                                                  "\n que ayuda a estabilizar los niveles de glucosa en sangre aportando aproximadamente el 40% de la ingesta diaria recomendada " +
                                                  "\n por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100% que el    " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer m�s de   " +
                                                  "\n un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s por su salud  " +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2 a 2.5 litros de agua al d�a (ocho a diez vasos de agua de tama�o regular)         " +
                                                  "\n para mantener las v�as respiratorias hidratadas, facilitar la eliminaci�n de secreciones y reducir la inflamaci�n            " +
                                                  "\n bronquial. En mujeres adultas mayores, una hidrataci�n constante tambi�n ayuda a prevenir la sequedad de mucosas y           " +
                                                  "\n mejora la funci�n pulmonar general. EJERCICIO: Actividad f�sica moderada como caminatas suaves, ejercicios de respiraci�n    " +
                                                  "\n y estiramientos controlados puede mejorar la capacidad pulmonar y reducir la frecuencia de las crisis asm�ticas. Es          " +
                                                  "\n importante evitar ambientes fr�os o contaminados y realizar calentamiento previo para prevenir la broncoconstricci�n         " +
                                                  "\n inducida por el ejercicio. POSIBLE TRATAMIENTO: El tratamiento incluye broncodilatadores de acci�n r�pida como Salbutamol    " +
                                                  "\n (Ventolin, Aerolin), corticosteroides inhalados como Fluticasona o Budesonida (Flixotide, Pulmicort), y en algunos casos,    " +
                                                  "\n modificadores de leucotrienos como Montelukast (Singulair). En mujeres adultas mayores, es esencial revisar la t�cnica de    " +
                                                  "\n inhalaci�n, ajustar las dosis para evitar efectos secundarios como temblores o taquicardia, y considerar el uso de              " +
                                                  "\n espaciadores para mejorar la administraci�n del medicamento. ALIMENTACI�N: Se sugiere el consumo de alimentos antiinflamatorios " +
                                                  "\n y antioxidantes como: Pescados grasos (salm�n, at�n), ricos en Omega-3, que ayudan a reducir la inflamaci�n de las v�as     " +
                                                  "\n respiratorias (50% de la ingesta diaria recomendada por cada 100 g); Frutas c�tricas (naranjas, toronjas), con vitamina C   " +
                                                  "\n que fortalece el sistema inmune (89% por cada 100 g); Espinacas (ricas en vitamina A y magnesio, esenciales para la funci�n " +
                                                  "\n pulmonar, con 56% y 20% respectivamente por cada 100 g); Jengibre y c�rcuma, con propiedades antiinflamatorias naturales.   " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta       " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico      " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico" +
                                                  "\n no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera" +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 litros de agua al d�a (diez vasos de agua de tama�o regular) para          " +
                                                  "\n apoyar la funci�n renal, facilitar la eliminaci�n de toxinas y mantener el equilibrio electrol�tico, especialmente      " +
                                                  "\n importante en pacientes que toman m�ltiples medicamentos. Tambi�n se sugiere incluir infusiones antioxidantes como      " +
                                                  "\n t� verde o rooibos. EJERCICIO: Actividad f�sica moderada como caminatas, yoga suave o ejercicios de bajo impacto        " +
                                                  "\n puede mejorar la masa muscular, reducir el estr�s y fortalecer el sistema inmunol�gico. Es importante adaptar la        " +
                                                  "\n rutina a la condici�n f�sica de la paciente y evitar el sobreesfuerzo. POSIBLE TRATAMIENTO: El tratamiento est�ndar     " +
                                                  "\n es la terapia antirretroviral (TAR), que combina medicamentos como Tenofovir, Emtricitabina, Efavirenz (Atripla),       " +
                                                  "\n Dolutegravir (Tivicay) y Lamivudina (Epivir). En mujeres adultas mayores, es crucial monitorear la funci�n hep�tica     " +
                                                  "\n y renal, as� como posibles interacciones con otros medicamentos para enfermedades cr�nicas. Tambi�n se recomienda el    " +
                                                  "\n seguimiento de la densidad �sea, ya que algunos antirretrovirales pueden afectar el metabolismo del calcio. El          " +
                                                  "\n acompa�amiento psicol�gico y el control nutricional son fundamentales para mantener la adherencia terap�utica y la      " +
                                                  "\n calidad de vida. ALIMENTACI�N: Se recomienda una dieta rica en nutrientes inmunoestimulantes como: Frutas c�tricas       " +
                                                  "\n (naranjas, limones), con vitamina C (89% por cada 100 g); Aguacate, fuente de vitamina E y �cidos grasos monoinsaturados " +
                                                  "\n (14% por cada 100 g); Pescados grasos (salm�n, sardina), ricos en Omega-3 (50% por cada 100 g); Verduras de hoja verde   " +
                                                  "\n (espinacas, acelgas), con vitamina A y hierro (56% y 15% respectivamente por cada 100 g); Legumbres (lentejas, frijoles)," +
                                                  "\n con prote�nas vegetales y hierro (37% por cada 100 g). Este es solo un diagn�stico predeterminado l�gico, haberlo        " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas." +
                                                  "\n Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento     " +
                                                  "\n adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su   " +
                                                  "\n m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2 a 2.5 litros de agua al d�a (ocho a diez vasos de agua de tama�o regular)       " +
                                                  "\n para facilitar la eliminaci�n de toxinas y mantener la funci�n renal, especialmente importante durante el tratamiento      " +
                                                  "\n antibi�tico. Tambi�n se sugiere el consumo de jugos naturales sin az�car para aportar antioxidantes. EJERCICIO:            " +
                                                  "\n Actividad f�sica ligera como caminatas o estiramientos suaves puede ayudar a mejorar la circulaci�n y fortalecer           " +
                                                  "\n el sistema inmune. Se debe evitar el ejercicio intenso durante el tratamiento para no comprometer la recuperaci�n.         " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento incluye antibi�ticos como Ceftriaxona (inyecci�n �nica) y Azitromicina (dosis oral).   " +
                                                  "\n En mujeres adultas mayores, es importante vigilar posibles efectos secundarios gastrointestinales y ajustar la dosis       " +
                                                  "\n en caso de insuficiencia renal. Tambi�n se recomienda realizar pruebas de seguimiento para confirmar la erradicaci�n       " +
                                                  "\n de la bacteria y evitar reinfecciones. En casos resistentes, puede ser necesario el uso de combinaciones antibi�ticas      " +
                                                  "\n o tratamientos prolongados. ALIMENTACI�N: Se recomienda una dieta que apoye la funci�n inmunol�gica y la recuperaci�n,     " +
                                                  "\n incluyendo: Naranjas (ricas en vitamina C, 89% por cada 100 g); Espinacas (fuente de hierro y �cido f�lico, 56% y 49%      " +
                                                  "\n respectivamente por cada 100 g); Yogur natural (rico en probi�ticos y calcio, 30% de la ingesta diaria recomendada por     " +
                                                  "\n cada 100 g); Ajo (con propiedades antibacterianas naturales); y Zanahorias (ricas en vitamina A, 93% por cada 100 g),      " +
                                                  "\n que ayudan a mantener la integridad de las mucosas. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado  " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello,  " +
                                                  "\n se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado.        " +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.       " +
                                                  "\n �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una    " +
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales.     " +
                                                  "\n EJERCICIO. Se recomienda actividad f�sica moderada como caminatas suaves, yoga o ejercicios de estiramiento    " +
                                                  "\n de bajo impacto durante 30 minutos al d�a, cinco veces por semana, para fortalecer el sistema inmunol�gico     " +
                                                  "\n y reducir el estr�s, ya que el estr�s puede desencadenar brotes. Tambi�n es �til incorporar ejercicios de      " +
                                                  "\n respiraci�n profunda y meditaci�n para mejorar la respuesta del cuerpo ante el virus. HIDRATACI�N. Se          " +
                                                  "\n aconseja consumir entre 2 y 2.5 litros de agua al d�a para mantener la piel y las mucosas hidratadas, lo       " +
                                                  "\n cual ayuda a reducir la irritaci�n y prevenir brotes. Adem�s, se recomienda evitar bebidas con cafe�na o       " +
                                                  "\n alcohol, ya que pueden favorecer la deshidrataci�n. Infusiones suaves como manzanilla o t� verde pueden ser    " +
                                                  "\n beneficiosas por sus propiedades antiinflamatorias y antioxidantes. POSIBLE TRATAMIENTO. El tratamiento para   " +
                                                  "\n el herpes genital incluye antivirales como aciclovir, famciclovir y valaciclovir, que ayudan a reducir la      " +
                                                  "\n duraci�n y frecuencia de los brotes. Marcas reconocidas incluyen Zovirax y Valtrex. En casos de recurrencias   " +
                                                  "\n frecuentes, se puede considerar terapia supresiva diaria. Tambi�n se recomienda el uso de cremas t�picas con   " +
                                                  "\n lidoca�na o aloe vera para aliviar el malestar local. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica   " +
                                                  "\n en lisina y antioxidantes para fortalecer el sistema inmunol�gico. Algunos alimentos clave incluyen yogur      " +
                                                  "\n natural y leche, ricos en lisina, que inhibe la replicaci�n del virus. Frutas c�tricas como naranja y kiwi,    " +
                                                  "\n ricas en vitamina C, que fortalecen el sistema inmune, aportando aproximadamente el 89% del requerimiento      " +
                                                  "\n diario por cada 100 gramos. Verduras como espinaca y zanahoria, ricas en vitamina A, que contribuyen a la      " +
                                                  "\n regeneraci�n celular y fortalecen las mucosas, con un aporte del 15% del requerimiento diario por cada 100     " +
                                                  "\n gramos. Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100%      " +
                                                  "\n que el paciente tenga herpes genital ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de      " +
                                                  "\n un diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app        " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una        " +
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales.         " +
                                                  "\n EJERCICIO. Se recomienda actividad f�sica moderada como caminatas diarias de 30 minutos, ejercicios de movilidad   " +
                                                  "\n articular y estiramientos suaves para mejorar la circulaci�n, mantener la masa muscular y fortalecer el sistema    " +
                                                  "\n inmunol�gico. Tambi�n es beneficioso incluir ejercicios de equilibrio y coordinaci�n para prevenir ca�das.         " +
                                                  "\n HIDRATACI�N. Se aconseja consumir entre 2 y 2.5 litros de agua al d�a para ayudar a eliminar toxinas del cuerpo,   " +
                                                  "\n mantener la funci�n renal y apoyar el metabolismo durante el tratamiento antibi�tico. Tambi�n se recomienda el     " +
                                                  "\n consumo de caldos naturales y jugos de frutas sin az�car a�adida para mantener el equilibrio de electrolitos.      " +
                                                  "\n POSIBLE TRATAMIENTO. El tratamiento est�ndar para la s�filis incluye antibi�ticos como penicilina G benzatina,     " +
                                                  "\n doxiciclina o ceftriaxona. Marcas reconocidas incluyen Benzetacil y Doxiciclina. En pacientes al�rgicos a la       " +
                                                  "\n penicilina, se utilizan alternativas como la doxiciclina por v�a oral durante 14 d�as. Es fundamental completar    " +
                                                  "\n el tratamiento para evitar complicaciones como neuros�filis o da�o cardiovascular. ALIMENTACI�N RECOMENDADA. Se    " +
                                                  "\n recomienda una dieta rica en prote�nas, vitaminas y minerales para fortalecer el sistema inmunol�gico. Algunos     " +
                                                  "\n alimentos clave incluyen carnes magras y pescado, fuentes de prote�nas esenciales. Frutas c�tricas como naranja       " +
                                                  "\n y lim�n, ricas en vitamina C, que ayudan a la recuperaci�n y fortalecimiento del sistema inmune, aportando el 89%     " +
                                                  "\n del requerimiento diario por cada 100 gramos. Verduras de hoja verde como espinaca y br�coli, que contienen hierro    " +
                                                  "\n y antioxidantes esenciales para la producci�n de gl�bulos rojos, con un aporte del 15% del requerimiento diario por   " +
                                                  "\n cada 100 gramos. Ajo y cebolla, con compuestos antimicrobianos naturales que pueden apoyar el tratamiento. Este       " +
                                                  "\n diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga    " +
                                                  "\n s�filis ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico   " +
                                                  "\n para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidrataci�n       " +
                                                  "\n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda       " +
                                                  "\n actividad f�sica moderada como caminatas suaves, ejercicios de respiraci�n profunda y yoga terap�utico para fortalecer        " +
                                                  "\n los pulmones, mejorar la oxigenaci�n y reducir la fatiga. Tambi�n es �til realizar ejercicios de movilidad articular y        " +
                                                  "\n estiramientos para mantener la flexibilidad y prevenir la p�rdida de masa muscular. HIDRATACI�N. Se aconseja consumir         " +
                                                  "\n entre 2.5 y 3 litros de agua al d�a para mantener las v�as respiratorias hidratadas, facilitar la eliminaci�n de toxinas      " +
                                                  "\n y apoyar la funci�n renal durante el tratamiento. Tambi�n se recomienda el consumo de caldos ricos en minerales y jugos       " +
                                                  "\n naturales con alto contenido de vitamina C. POSIBLE TRATAMIENTO. El tratamiento est�ndar para la tuberculosis incluye una     " +
                                                  "\n combinaci�n de antibi�ticos como isoniazida, rifampicina, etambutol y pirazinamida durante un per�odo de al menos seis meses. " +
                                                  "\n Marcas reconocidas incluyen Rifater y Rimactane. Es fundamental seguir el tratamiento completo y bajo supervisi�n m�dica      " +
                                                  "\n para evitar reca�das o resistencia bacteriana. En adultos mayores, se debe ajustar la dosis en caso de insuficiencia renal    " +
                                                  "\n o hep�tica y monitorear posibles efectos secundarios. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica en prote�nas,    " +
                                                  "\n vitaminas y minerales para fortalecer el sistema inmunol�gico y apoyar la recuperaci�n. Algunos alimentos clave incluyen      " +
                                                  "\n carnes magras y pescado, fuentes de prote�nas esenciales. Frutas c�tricas como naranja y kiwi, ricas en vitamina C, que       " +
                                                  "\n ayudan a la recuperaci�n y fortalecimiento del sistema inmune, aportando el 89% del requerimiento diario por cada 100 gramos. " +
                                                  "\n Verduras de hoja verde como espinaca y br�coli, que contienen hierro y antioxidantes esenciales para la producci�n de         " +
                                                  "\n gl�bulos rojos, con un aporte del 15% del requerimiento diario por cada 100 gramos. Frutos secos como almendras y nueces,     " +
                                                  "\n ricos en vitamina E y �cidos grasos esenciales, que fortalecen el sistema inmunol�gico y aportan el 37% del requerimiento     " +
                                                  "\n diario por cada 28 gramos. Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al       " +
                                                  "\n 100% que el paciente tenga tuberculosis ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico   " +
                                                  "\n y consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n La artritis es una inflamaci�n cr�nica de las articulaciones que puede provocar dolor, rigidez y p�rdida de movilidad,    " +
                                                  "\n siendo la osteoartritis la forma m�s com�n en la adultez mayor, especialmente en rodillas, caderas y manos. EJERCICIO.    " +
                                                  "\n Se recomienda actividad f�sica moderada y adaptada a las capacidades de la persona, como caminatas suaves, ejercicios     " +
                                                  "\n acu�ticos o yoga terap�utico, que ayudan a mantener la flexibilidad, reducir la rigidez y fortalecer los m�sculos que     " +
                                                  "\n rodean las articulaciones. Tambi�n es �til realizar ejercicios de bajo impacto con apoyo, como bicicleta est�tica o       " +
                                                  "\n estiramientos guiados. HIDRATACI�N. Es fundamental consumir entre 2 y 2.5 litros de agua al d�a para mantener la          " +
                                                  "\n lubricaci�n de las articulaciones, facilitar la eliminaci�n de toxinas y reducir la inflamaci�n. Se sugiere complementar  " +
                                                  "\n con infusiones de c�rcuma o jengibre, que poseen propiedades antiinflamatorias naturales. POSIBLE TRATAMIENTO. El         " + 
                                                  "\n tratamiento puede incluir medicamentos antiinflamatorios no esteroides como ibuprofeno o naproxeno, corticosteroides      " +
                                                  "\n en casos m�s severos, y f�rmacos modificadores de la enfermedad como el metotrexato. Tambi�n se recomienda fisioterapia,  " +
                                                  "\n terapia ocupacional y en algunos casos el uso de suplementos como glucosamina y condroitina para mejorar la salud         " +
                                                  "\n articular. ALIMENTACI�N RECOMENDADA. Consumir alimentos ricos en antioxidantes y �cidos grasos esenciales. Pescados       " +
                                                  "\n grasos como salm�n y sardina, ricos en �cidos grasos Omega-3, que ayudan a reducir la inflamaci�n articular, aportando    " +
                                                  "\n hasta el 90% del requerimiento diario por cada 100 g. Frutas como ar�ndanos y fresas, ricas en vitamina C y antioxidantes," +
                                                  "\n que fortalecen el sistema inmunol�gico y reducen el da�o celular, aportando cerca del 70% del requerimiento diario por    " +
                                                  "\n cada 100 g. Verduras de hoja verde como espinaca y kale, que contienen hierro, calcio y vitamina K, esenciales para la    " +
                                                  "\n salud �sea y articular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que    " +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda   " +
                                                  "\n hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s  " +
                                                  "\n por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, �ngel " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n La tosferina, o pertussis, es una infecci�n bacteriana que afecta las v�as respiratorias y puede causar tos intensa      " +
                                                  "\n y prolongada. En adultos mayores, puede ser m�s severa y provocar complicaciones respiratorias. EJERCICIO. Se            " +
                                                  "\n recomienda actividad f�sica ligera, como caminatas cortas o ejercicios de respiraci�n profunda, para mejorar la          " +
                                                  "\n oxigenaci�n sin agotar al paciente. Es importante evitar ambientes fr�os o contaminados que puedan agravar los           " +
                                                  "\n s�ntomas. HIDRATACI�N. Es fundamental consumir entre 2 y 2.5 litros de agua al d�a para mantener las v�as respiratorias  " +
                                                  "\n hidratadas y facilitar la eliminaci�n de mucosidad. Tambi�n se recomienda el consumo de l�quidos tibios como infusiones  " +
                                                  "\n de jengibre o t� de manzanilla para aliviar la garganta. POSIBLE TRATAMIENTO. El tratamiento incluye antibi�ticos como   " +
                                                  "\n azitromicina, claritromicina o eritromicina, que ayudan a eliminar la bacteria. En casos con dificultad respiratoria,    " + 
                                                  "\n pueden utilizarse broncodilatadores. Se recomienda reposo y aislamiento durante los primeros d�as para evitar contagios. " +
                                                  "\n ALIMENTACI�N RECOMENDADA. Consumir alimentos que fortalezcan el sistema respiratorio. Frutas c�tricas como naranja y     " +
                                                  "\n toronja, ricas en vitamina C, que ayudan a reducir la duraci�n de los s�ntomas, aportando hasta el 89% del requerimiento " +
                                                  "\n diario por cada 100 g. Miel, con propiedades antimicrobianas y calmantes para la garganta. Jengibre, con efectos         " +
                                                  "\n antiinflamatorios que pueden aliviar la tos. Yogur natural, fuente de probi�ticos que fortalecen la flora intestinal y   " +
                                                  "\n el sistema inmune. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el     " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda     " +
                                                  "\n hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s " +
                                                  "\n por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico,      " +
                                                  "\n �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Las paperas son una infecci�n viral que afecta las gl�ndulas salivales, causando inflamaci�n y dolor en la zona         " +
                                                  "\n de la mand�bula. En adultos mayores, pueden presentarse s�ntomas m�s intensos y riesgo de complicaciones. EJERCICIO.    " +
                                                  "\n Se recomienda actividad f�sica ligera mientras persistan los s�ntomas, como estiramientos suaves o caminatas cortas,    " +
                                                  "\n evitando esfuerzos que puedan aumentar la inflamaci�n. HIDRATACI�N. Es fundamental consumir entre 2 y 2.5 litros de     " +
                                                  "\n agua al d�a para ayudar al cuerpo a combatir la infecci�n y mantenerse hidratado. Se sugiere complementar con           " +
                                                  "\n l�quidos suaves como caldos o infusiones de manzanilla. POSIBLE TRATAMIENTO. No existe un tratamiento antiviral         " +
                                                  "\n espec�fico para las paperas. Se recomienda el uso de paracetamol para aliviar la fiebre y el dolor, evitando el         " +
                                                  "\n ibuprofeno y la aspirina. Tambi�n se sugiere el uso de compresas fr�as en la zona inflamada y reposo absoluto           " +
                                                  "\n durante los primeros d�as. ALIMENTACI�N RECOMENDADA. Consumir alimentos blandos y ricos en nutrientes. Frutas           " +
                                                  "\n c�tricas como naranja y mandarina, ricas en vitamina C, que fortalecen el sistema inmunol�gico, aportando hasta         " +
                                                  "\n el 89% del requerimiento diario por cada 100 g. Yogur natural, fuente de probi�ticos que ayudan a mantener la flora     " +
                                                  "\n intestinal. Verduras de hoja verde como espinaca, que aportan hierro y antioxidantes esenciales para la recuperaci�n.   " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa    " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de un       " +
                                                  "\n diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud   " +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, �ngel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n EJERCICIO: Durante la infecci�n por el virus del Zika se recomienda evitar cualquier esfuerzo f�sico intenso y priorizar   " +
                                                  "\n el descanso absoluto, ya que el sistema inmunol�gico necesita conservar energ�a para combatir el virus. Una vez que los    " +
                                                  "\n s�ntomas disminuyen, se pueden realizar ejercicios suaves como caminatas lentas o estiramientos ligeros para mejorar la    " +
                                                  "\n circulaci�n y reducir la rigidez muscular. Tambi�n es �til practicar ejercicios de respiraci�n profunda para mejorar la    " +
                                                  "\n oxigenaci�n celular y reducir la inflamaci�n. HIDRATACI�N: Es fundamental consumir al menos 2.5 litros de agua al d�a      " +
                                                  "\n para prevenir la deshidrataci�n, regular la temperatura corporal y facilitar la eliminaci�n de toxinas. Tambi�n se         " +
                                                  "\n recomienda el consumo de caldos naturales, infusiones como t� de jengibre o manzanilla, y jugos naturales sin az�car       " +
                                                  "\n a�adida, que adem�s de hidratar aportan antioxidantes y alivian s�ntomas como el dolor muscular y la fiebre. POSIBLE       " +
                                                  "\n TRATAMIENTO: No existe un tratamiento antiviral espec�fico para el Zika, pero los s�ntomas pueden aliviarse con reposo,    " +
                                                  "\n hidrataci�n constante y medicamentos como el acetaminof�n para reducir la fiebre y el dolor. Es importante evitar el uso   " +
                                                  "\n de aspirina y otros antiinflamatorios no esteroideos hasta descartar la posibilidad de dengue, para reducir el riesgo de   " +
                                                  "\n hemorragias. Tambi�n se recomienda evitar el consumo de alcohol y tabaco durante la recuperaci�n, ya que pueden debilitar   " +
                                                  "\n el sistema inmunol�gico. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales " +
                                                  "\n para fortalecer el sistema inmunol�gico, tales como frutas c�tricas como naranjas y toronjas, que aportan vitamina C en un  " +
                                                  "\n 89% de la ingesta diaria recomendada, ayudando a combatir infecciones. Verduras de hoja verde como espinacas y acelgas, que " +
                                                  "\n aportan hasta un 50% de la ingesta diaria recomendada de vitamina A y K, esenciales para la regeneraci�n celular. Jengibre  " +
                                                  "\n y c�rcuma, que poseen propiedades antiinflamatorias y antioxidantes, contribuyendo con hasta un 40% de la ingesta diaria    " +
                                                  "\n recomendada de compuestos bioactivos beneficiosos para la salud. este es solo un diagn�stico predeterminado l�gico. haberlo " +
                                                  "\n consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas.   " +
                                                  "\n se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la   " +
                                                  "\n respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita  " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n EJERCICIO: Durante la infecci�n por rotavirus se recomienda evitar cualquier tipo de esfuerzo f�sico y priorizar          " +
                                                  "\n el descanso absoluto, ya que la p�rdida de l�quidos y nutrientes puede provocar debilidad extrema. Una vez superada       " +
                                                  "\n la fase aguda, se pueden realizar ejercicios suaves como caminatas lentas o estiramientos para estimular la circulaci�n   " +
                                                  "\n y recuperar la energ�a. Tambi�n es recomendable realizar ejercicios de respiraci�n para mejorar la oxigenaci�n celular    " +
                                                  "\n y reducir la fatiga. HIDRATACI�N: Es crucial el consumo de al menos 2.5 litros de agua al d�a para prevenir la            " +
                                                  "\n deshidrataci�n causada por la diarrea y los v�mitos. Tambi�n se recomienda el uso de soluciones de rehidrataci�n oral     " +
                                                  "\n que contienen electrolitos esenciales como sodio, potasio y glucosa, los cuales ayudan a restablecer el equilibrio        " +
                                                  "\n h�drico y energ�tico del cuerpo. El consumo de caldos naturales y jugos suaves sin az�car tambi�n puede ser beneficioso.  " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento antiviral espec�fico para el rotavirus, pero los s�ntomas pueden aliviarse  " +
                                                  "\n con hidrataci�n intensiva, reposo y una dieta adecuada. Se deben evitar los medicamentos antidiarreicos, ya que pueden    " +
                                                  "\n prolongar la infecci�n. En casos graves, puede ser necesaria la administraci�n de l�quidos por v�a intravenosa. Tambi�n   " +
                                                  "\n se recomienda el consumo de probi�ticos para restaurar la flora intestinal. ALIMENTACI�N: Se recomienda el consumo de     " +
                                                  "\n alimentos que favorezcan la recuperaci�n del sistema digestivo, tales como yogur natural, que contiene probi�ticos        " +
                                                  "\n beneficiosos para la flora intestinal. Frutas como pl�tanos y manzanas, que aportan fibra soluble y ayudan a regular el   " +
                                                  "\n tr�nsito intestinal. Verduras como zanahorias y calabacines, que contienen antioxidantes y vitaminas esenciales como la   " +
                                                  "\n vitamina A y el potasio, aportando hasta un 50% de la ingesta diaria recomendada, fundamentales para la regeneraci�n de   " +
                                                  "\n la mucosa intestinal. este es solo un diagn�stico predeterminado l�gico. haberlo consultado no garantiza al 100% que la   " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar m�s de un       " +
                                                  "\n diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico no le  " +
                                                  "\n satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que" +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n EJERCICIO: Durante la infecci�n por listeria se recomienda evitar esfuerzos f�sicos intensos y priorizar el descanso,      " +
                                                  "\n ya que el cuerpo necesita conservar energ�a para combatir la bacteria. Una vez que los s�ntomas disminuyen, se pueden      " +
                                                  "\n realizar ejercicios suaves como caminatas lentas o ejercicios de respiraci�n para mejorar la oxigenaci�n celular y         " +
                                                  "\n reducir la fatiga. Tambi�n es importante mantener una rutina de movilidad ligera para prevenir la rigidez muscular y       " +
                                                  "\n mejorar la circulaci�n. HIDRATACI�N: Es fundamental consumir al menos 2.5 litros de agua al d�a para ayudar a eliminar     " +
                                                  "\n toxinas y mantener el equilibrio de los fluidos corporales. Tambi�n se recomienda el consumo de caldos naturales,          " +
                                                  "\n infusiones suaves y jugos sin az�car para aportar electrolitos esenciales. La hidrataci�n adecuada contribuye a la         " +
                                                  "\n eliminaci�n de bacterias a trav�s de la orina y mejora la funci�n renal, lo cual es clave durante una infecci�n bacteriana." +
                                                  "\n POSIBLE TRATAMIENTO: La infecci�n por listeria se trata con antibi�ticos como ampicilina o gentamicina, especialmente      " +
                                                  "\n en casos graves o en pacientes inmunocomprometidos. En adultos mayores, el tratamiento debe iniciarse lo antes posible     " +
                                                  "\n para evitar complicaciones como septicemia o meningitis. Tambi�n se recomienda evitar alimentos de alto riesgo como        " +
                                                  "\n productos l�cteos no pasteurizados, embutidos y pescados ahumados durante la recuperaci�n. ALIMENTACI�N: Se recomienda     " +
                                                  "\n el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, tales      " +
                                                  "\n como frutas c�tricas como naranjas y toronjas, que aportan vitamina C en un 89% de la ingesta diaria recomendada, ayudando " +
                                                  "\n a combatir infecciones. Verduras de hoja verde como espinacas y acelgas, que aportan hasta un 50% de la ingesta diaria     " +
                                                  "\n recomendada de vitamina A y K, esenciales para la regeneraci�n celular. Frutos secos como almendras y nueces, que contienen  " +
                                                  "\n vitamina E y magnesio, contribuyendo con hasta un 40% de la ingesta diaria recomendada de estos nutrientes esenciales para   " +
                                                  "\n la recuperaci�n neurol�gica. este es solo un diagn�stico predeterminado l�gico. haberlo consultado no garantiza al 100% que  " +
                                                  "\n la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar m�s de un       " +
                                                  "\n diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico no le     " +
                                                  "\n satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que   " +
                                                  "\n te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la shigelosis es fundamental mantener una hidrataci�n adecuada con un consumo      " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para reponer los           " +
                                                  "\n l�quidos perdidos por la diarrea y prevenir la deshidrataci�n. EJERCICIO: Se recomienda actividad f�sica ligera        " +
                                                  "\n como caminatas suaves dentro del hogar o ejercicios de movilidad articular evitando esfuerzos intensos mientras        " +
                                                  "\n persistan los s�ntomas. Una vez superada la fase aguda es recomendable realizar ejercicios de fortalecimiento          " +
                                                  "\n progresivo para recuperar energ�a y mejorar la funci�n digestiva. POSIBLE TRATAMIENTO: El tratamiento suele incluir    " +
                                                  "\n antibi�ticos como la ciprofloxacina o la azitromicina y en casos m�s severos ceftriaxona. Es importante evitar         " +
                                                  "\n medicamentos antidiarreicos sin indicaci�n m�dica ya que pueden empeorar la eliminaci�n de la bacteria. ALIMENTOS      " +
                                                  "\n RECOMENDADOS: Para fortalecer el sistema digestivo y acelerar la recuperaci�n se recomienda el consumo de PL�TANOS:    " +
                                                  "\n Ricos en potasio que ayuda a reemplazar los electrolitos perdidos debido a la diarrea aportando aproximadamente el     " +
                                                  "\n 12% de la ingesta diaria recomendada por cada 100 gramos. ARROZ BLANCO: Fuente de carbohidratos de f�cil digesti�n     " +
                                                  "\n que ayuda a estabilizar el sistema digestivo. ZANAHORIAS: Ricas en vitamina A y antioxidantes que ayudan a la          " +
                                                  "\n regeneraci�n celular aportando aproximadamente el 56% de la ingesta diaria recomendada por cada 100 gramos.             " +
                                                  "\n YOGUR NATURAL: Contiene probi�ticos que pueden fortalecer el sistema digestivo y mejorar la salud intestinal aportando  " +
                                                  "\n calcio y prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza al     " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda   " +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s " +
                                                  "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico      " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la EPOC es fundamental mantener una hidrataci�n adecuada con un consumo diario        " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a mantener las v�as      " +
                                                  "\n respiratorias hidratadas y facilitar la expulsi�n de mucosidad. EJERCICIO: Se recomienda actividad f�sica ligera como     " +
                                                  "\n caminatas lentas ejercicios de respiraci�n profunda y estiramientos suaves para mejorar la oxigenaci�n y la capacidad     " +
                                                  "\n pulmonar. Adem�s se recomienda la pr�ctica de ejercicios de fortalecimiento muscular y fisioterapia respiratoria          " +
                                                  "\n adaptada a la capacidad del paciente para mantener la funcionalidad y prevenir la p�rdida de masa muscular. POSIBLE       " +
                                                  "\n TRATAMIENTO: El tratamiento suele incluir broncodilatadores de acci�n r�pida como el salbutamol corticosteroides          " +
                                                  "\n inhalados como la fluticasona y en algunos casos terapia con ox�geno. Es fundamental seguir estrictamente el plan de      " +
                                                  "\n acci�n indicado por el m�dico y evitar la exposici�n a contaminantes ambientales. ALIMENTOS RECOMENDADOS: Para fortalecer " +
                                                  "\n el sistema respiratorio y reducir la inflamaci�n se recomienda el consumo de PESCADOS GRASOS: Salm�n y at�n ricos en      " +    
                                                  "\n �cidos grasos Omega-3 que poseen propiedades antiinflamatorias que pueden ayudar a reducir la inflamaci�n de las v�as     " +
                                                  "\n respiratorias aportando aproximadamente el 50% de la ingesta diaria recomendada por cada 100 gramos. FRUTAS Y VERDURAS    " +
                                                  "\n DE COLORES VIVOS: Ar�ndanos fresas espinacas br�coli ricos en antioxidantes como la vitamina C y carotenoides que pueden  " +
                                                  "\n proteger las c�lulas del da�o y fortalecer el sistema inmunol�gico aportando aproximadamente el 70% de la ingesta diaria  " +
                                                  "\n recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos con efectos antiinflamatorios que podr�an ser beneficiosos " +
                                                  "\n para las v�as respiratorias. C�RCUMA: Con su componente activo la curcumina tambi�n tiene potentes propiedades            " +
                                                  "\n antiinflamatorias y antioxidantes. Este es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza al   " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda     " +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s   " +
                                                  "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico Angel  " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la clamidia es fundamental mantener una hidrataci�n adecuada con un consumo      " +
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para ayudar a la         " +
                                                  "\n eliminaci�n de toxinas y fortalecer el sistema inmunol�gico. EJERCICIO: Se recomienda actividad f�sica moderada      " +
                                                  "\n como caminatas ejercicios de bajo impacto o nataci�n para mejorar la circulaci�n sangu�nea y fortalecer el sistema   " +
                                                  "\n inmunol�gico. Adem�s se recomienda la pr�ctica de ejercicios de relajaci�n como yoga o meditaci�n para reducir el    " +
                                                  "\n estr�s que puede afectar la respuesta inmunol�gica. POSIBLE TRATAMIENTO: El tratamiento suele incluir antibi�ticos   " +
                                                  "\n como la azitromicina en dosis �nica o la doxiciclina durante 7 d�as y en casos m�s severos levofloxacina. Es         " +
                                                  "\n fundamental seguir estrictamente el tratamiento indicado por el m�dico y evitar la automedicaci�n. ALIMENTOS         " +
                                                  "\n RECOMENDADOS: Para fortalecer el sistema inmunol�gico y acelerar la recuperaci�n se recomienda el consumo de         " +
                                                  "\n FRUTOS ROJOS: Ricos en antioxidantes y vitamina C que ayudan a fortalecer el sistema inmunol�gico aportando          " +
                                                  "\n aproximadamente el 70% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos con       " +
                                                  "\n propiedades antiinflamatorias y puede ayudar a reducir la inflamaci�n. ESPINACAS Y BR�COLI: Aportan antioxidantes    " +
                                                  "\n y vitamina A esenciales para la regeneraci�n celular con un contenido de aproximadamente 56% de la ingesta diaria    " +
                                                  "\n recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos que pueden fortalecer el sistema inmunol�gico   " +
                                                  "\n y mejorar la salud digestiva aportando calcio y prote�nas esenciales. Este es solo un diagn�stico predeterminado     " +
                                                  "\n l�gico haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean      " +
                                                  "\n completamente correctas para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor         " +
                                                  "\n seguridad en el tratamiento adecuado de su paciente adem�s por su salud si la respuesta del Diagn�stico no le        " +
                                                  "\n satisface del todo se le recomienda mucho consultar a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 a 3 litros de agua al d�a (diez a doce vasos de agua de tama�o regular)        " +
                                                  "\n para mantener la funci�n cerebral, facilitar la eliminaci�n de toxinas y apoyar el sistema inmunol�gico. En mujeres         " +
                                                  "\n adultas mayores, una hidrataci�n constante tambi�n ayuda a prevenir la deshidrataci�n, que puede agravar los s�ntomas       " +
                                                  "\n neurol�gicos y aumentar el riesgo de complicaciones como confusi�n o delirio. EJERCICIO: Actividad f�sica ligera como       " +
                                                  "\n caminatas suaves, ejercicios de respiraci�n y estiramientos controlados puede mejorar la circulaci�n cerebral y reducir     " + 
                                                  "\n la rigidez muscular. Es importante evitar el esfuerzo excesivo y priorizar el descanso durante la fase aguda de la          " +  
                                                  "\n enfermedad. Una vez estabilizada, se recomienda incorporar rutinas de movilidad para prevenir el deterioro funcional        " +
                                                  "\n y mantener la autonom�a. POSIBLE TRATAMIENTO: El tratamiento inmediato incluye antibi�ticos intravenosos de amplio          " +
                                                  "\n espectro como Ceftriaxona, Cefotaxima o Ampicilina, ajustados seg�n el microorganismo identificado. Tambi�n se administran  " +
                                                  "\n corticosteroides como la Dexametasona para reducir la inflamaci�n cerebral y prevenir complicaciones como p�rdida auditiva  " +
                                                  "\n o convulsiones. En casos graves, puede requerirse hospitalizaci�n prolongada, monitoreo neurol�gico intensivo y el uso de   " +
                                                  "\n anticonvulsivos si se presentan crisis. Adem�s, se recomienda el seguimiento con evaluaciones cognitivas y apoyo            " +
                                                  "\n neuropsicol�gico para detectar posibles secuelas. ALIMENTACI�N: Se recomienda una dieta rica en nutrientes neuroprotectores " +
                                                  "\n como: Naranjas (ricas en vitamina C, fortalecen el sistema inmune, 89% del requerimiento diario por cada 100 g); Aguacate   " +
                                                  "\n (fuente de vitamina E y �cidos grasos saludables, 14% de la ingesta diaria por cada 100 g); Pescados grasos (salm�n, at�n), " +
                                                  "\n ricos en Omega-3, que ayudan a reducir la inflamaci�n cerebral (50% de la ingesta diaria por cada 100 g); Huevos (aportan   " +
                                                  "\n colina, esencial para la funci�n cognitiva, 27% del requerimiento diario por unidad); y Nueces (ricas en �cido alfa-linol�nico, " +
                                                  "\n un tipo de Omega-3 vegetal, 91% por cada 30 g). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no    " +
                                                  "\n garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se   " +
                                                  "\n recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Adem�s,    " +
                                                  "\n por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 a 3 litros de agua al d�a (diez a doce vasos de agua de tama�o regular)     " +
                                                  "\n para apoyar la funci�n renal, facilitar la eliminaci�n de toxinas derivadas del tratamiento y mantener la homeostasis    " +
                                                  "\n celular. En pacientes con c�ncer, una hidrataci�n adecuada tambi�n ayuda a reducir los efectos secundarios de la         " +
                                                  "\n quimioterapia como n�useas, fatiga y estre�imiento. EJERCICIO: Actividad f�sica moderada y adaptada como caminatas,      " +
                                                  "\n ejercicios de bajo impacto o yoga suave puede mejorar la calidad de vida, reducir la fatiga y fortalecer el sistema      " +
                                                  "\n inmunol�gico. Es importante realizar una evaluaci�n funcional previa para ajustar la intensidad del ejercicio seg�n      " +
                                                  "\n el estado f�sico de la paciente. POSIBLE TRATAMIENTO: El tratamiento depende del tipo y estadio del c�ncer, pero puede   " +
                                                  "\n incluir quimioterapia, radioterapia, inmunoterapia, cirug�a y terapias dirigidas. En mujeres adultas mayores, se realiza    " +
                                                  "\n una valoraci�n geri�trica integral para personalizar el tratamiento, considerando comorbilidades, estado funcional y        " +
                                                  "\n tolerancia a los f�rmacos. Tambi�n se emplean terapias hormonales en ciertos tipos de c�ncer como el de mama, y se          " +
                                                  "\n utilizan medicamentos de soporte como antiem�ticos, analg�sicos y suplementos nutricionales para mejorar la tolerancia      " +
                                                  "\n al tratamiento. El acompa�amiento psicol�gico y el seguimiento nutricional son claves para mantener la adherencia           " +
                                                  "\n terap�utica y la estabilidad emocional. ALIMENTACI�N: Se recomienda una dieta rica en antioxidantes, prote�nas y grasas     " +
                                                  "\n saludables como: Frutas c�tricas (naranjas, toronjas), con vitamina C (89% por cada 100 g); Aguacate, fuente de vitamina E  " +
                                                  "\n y �cidos grasos monoinsaturados (14% por cada 100 g); Pescados grasos (salm�n, sardina), ricos en Omega-3 (50% por cada     " +
                                                  "\n 100 g); Verduras de hoja verde (espinacas, acelgas), con vitamina A y hierro (56% y 15% respectivamente por cada 100 g);    " +
                                                  "\n Legumbres (lentejas, frijoles), con prote�nas vegetales y hierro (37% por cada 100 g); y Frutos secos (almendras, nueces),  " +
                                                  "\n con selenio y zinc, que apoyan la funci�n inmune (45% y 30% respectivamente por cada 30 g). Este es solo un diagn�stico     " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas  " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor      " +
                                                  "\n seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se    " +
                                                  "\n recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                        
                        if(EstaturaFemenino.equals("1.40-1.65 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 litros de agua al d�a (diez vasos de agua de tama�o regular) para            " +
                                                  "\n mantener las mucosas respiratorias hidratadas, facilitar la eliminaci�n de secreciones y prevenir la deshidrataci�n       " +
                                                  "\n causada por fiebre. Tambi�n se sugiere el consumo de caldos calientes, infusiones con jengibre y miel, que ayudan a       " +
                                                  "\n aliviar la garganta y mejorar la expectoraci�n. EJERCICIO: Durante la fase aguda se recomienda reposo absoluto, ya        " +
                                                  "\n que el descanso permite al sistema inmunol�gico combatir la infecci�n. Una vez superada la fiebre y los s�ntomas          " + 
                                                  "\n intensos, se puede retomar actividad f�sica ligera como caminatas suaves o ejercicios de respiraci�n para recuperar       " +
                                                  "\n la capacidad pulmonar. POSIBLE TRATAMIENTO: El tratamiento incluye medidas sintom�ticas como paracetamol o ibuprofeno     " +
                                                  "\n para controlar la fiebre y el malestar general. En casos de alto riesgo o s�ntomas graves, se puede indicar un antiviral  " +
                                                  "\n como Oseltamivir (Tamiflu), especialmente si se administra en las primeras 48 horas. Se debe evitar el uso de aspirina    " +
                                                  "\n por riesgo de s�ndrome de Reye. Tambi�n se recomienda aislamiento domiciliario, buena ventilaci�n y monitoreo de signos   " +
                                                  "\n de alarma como dificultad respiratoria o desorientaci�n. ALIMENTACI�N: Se sugiere una dieta rica en alimentos que         " +
                                                  "\n fortalezcan el sistema inmunol�gico como: Naranjas (ricas en vitamina C, 89% del requerimiento diario por cada 100 g);    " +
                                                  "\n Kiwi (con vitamina C y potasio, 92% y 7% respectivamente); Zanahorias (aportan vitamina A, 93% por cada 100 g); Ajo       " +
                                                  "\n (con propiedades antivirales y antibacterianas); y Miel (con efectos antis�pticos y antiinflamatorios). Este es solo un   " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que   " +
                                                  "\n las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para      " +
                                                  "\n establecer mejor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le        " +
                                                  "\n satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera    " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 3 litros de agua al d�a (doce vasos de agua de tama�o regular) para mantener       " +
                                                  "\n la funci�n pulmonar, fluidificar las secreciones y facilitar su expulsi�n. Tambi�n se sugiere el uso de humidificadores     " +
                                                  "\n y vaporizaciones para mantener las v�as respiratorias h�medas. EJERCICIO: Durante la fase aguda se debe guardar reposo      " +
                                                  "\n absoluto. Una vez estabilizada la paciente, se recomienda movilizaci�n temprana, ejercicios de respiraci�n profunda y       " +
                                                  "\n caminatas cortas para prevenir complicaciones como trombosis o p�rdida de masa muscular. POSIBLE TRATAMIENTO: El            " +
                                                  "\n tratamiento incluye antibi�ticos de amplio espectro como Amoxicilina con �cido clavul�nico, Ceftriaxona o Levofloxacino,    " +
                                                  "\n dependiendo del agente causal. En casos graves, puede requerirse hospitalizaci�n, oxigenoterapia y tratamiento de soporte.  " +
                                                  "\n Tambi�n se pueden usar corticosteroides en pacientes con inflamaci�n severa o comorbilidades. Es fundamental iniciar el     " +
                                                  "\n tratamiento lo antes posible y completar el esquema indicado. ALIMENTACI�N: Se recomienda una dieta rica en nutrientes      " +
                                                  "\n que apoyen la funci�n pulmonar y la inmunidad como: Br�coli (con vitamina C y sulforafano, 135% y 20% respectivamente       " +
                                                  "\n por cada 100 g); Pescados grasos (ricos en Omega-3, 50% por cada 100 g); Huevos (aportan colina, 27% por unidad); Frutas    " +
                                                  "\n c�tricas (con vitamina C, 89% por cada 100 g); y Jengibre (con propiedades antiinflamatorias y expectorantes). Este es      " +
                                                  "\n solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad    " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida      " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le     " +
                                                  "\n satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera      " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 litros de agua al d�a (diez vasos de agua de tama�o regular) para    " +
                                                  "\n mantener el equilibrio gluc�mico, prevenir la deshidrataci�n y facilitar la funci�n renal. En mujeres adultas     " +
                                                  "\n mayores, una hidrataci�n adecuada tambi�n ayuda a reducir el riesgo de infecciones urinarias y complicaciones         " +
                                                  "\n metab�licas. EJERCICIO: Actividad f�sica regular como caminatas, ejercicios de bajo impacto o yoga puede mejorar      " +
                                                  "\n la sensibilidad a la insulina, controlar el peso y reducir el riesgo cardiovascular. Se recomienda al menos 150       " +
                                                  "\n minutos semanales de ejercicio moderado, adaptado a la condici�n f�sica de la paciente. POSIBLE TRATAMIENTO: El       " +
                                                  "\n tratamiento incluye modificaciones en el estilo de vida, control nutricional y medicamentos como Metformina,          " +
                                                  "\n Inhibidores de SGLT2 (como Dapagliflozina), Inhibidores de DPP-4 (como Sitagliptina) o Insulina en casos avanzados.   " +
                                                  "\n En mujeres adultas mayores, es esencial evitar hipoglucemias, ajustar las dosis seg�n la funci�n renal y monitorear   " +
                                                  "\n la presi�n arterial y l�pidos. Tambi�n se recomienda el uso de gluc�metros para el control diario y la educaci�n      " +
                                                  "\n continua sobre el manejo de la enfermedad. ALIMENTACI�N: Se sugiere una dieta con bajo �ndice gluc�mico, rica en      " +
                                                  "\n fibra, antioxidantes y grasas saludables como: Avena (con beta-glucanos, que ayudan a controlar la glucosa, 34% de    " +
                                                  "\n fibra por cada 100 g); Frutas con bajo �ndice gluc�mico como manzana o pera (con vitamina C, 10�12% por cada 100 g);  " +
                                                  "\n Verduras de hoja verde (ricas en magnesio y vitamina A, 20% y 56% respectivamente por cada 100 g); Legumbres (fuente  " +
                                                  "\n de prote�na vegetal y fibra, 37% de hierro por cada 100 g); y Frutos secos (almendras, nueces), con grasas              " +
                                                  "\n monoinsaturadas y magnesio, 45% y 20% respectivamente por cada 30 g. Este es solo un diagn�stico predeterminado l�gico, " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente  " +
                                                  "\n correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el     " +
                                                  "\n tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda     " +
                                                  "\n consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidrataci�n       " +
                                                  "\n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda       " +
                                                  "\n actividad f�sica moderada como caminatas diarias de 30 minutos, ejercicios de respiraci�n profunda y yoga suave, siempre      " +
                                                  "\n con calentamiento previo y enfriamiento posterior. Tambi�n es �til realizar ejercicios de fortalecimiento muscular con        " +
                                                  "\n bandas el�sticas o pesas ligeras para mejorar la capacidad pulmonar y reducir la fatiga. HIDRATACI�N. Se aconseja consumir    " +
                                                  "\n entre 2 y 2.5 litros de agua al d�a para mantener las v�as respiratorias hidratadas, facilitar la eliminaci�n de              " +
                                                  "\n secreciones y prevenir la sequedad de las mucosas. Tambi�n se recomienda el consumo de infusiones tibias como manzanilla      " +
                                                  "\n o jengibre para aliviar la irritaci�n bronquial. POSIBLE TRATAMIENTO. El tratamiento para el asma incluye broncodilatadores   " +
                                                  "\n de acci�n r�pida como el salbutamol (marcas reconocidas: Ventolin, Aerolin), corticosteroides inhalados como la fluticasona   " +
                                                  "\n o budesonida (marcas: Flixotide, Pulmicort), y en algunos casos, modificadores de leucotrienos como el montelukast (marca:    " +
                                                  "\n Singulair). Es fundamental seguir el plan de acci�n indicado por el m�dico y utilizar los inhaladores con t�cnica adecuada.   " +
                                                  "\n ALIMENTACI�N RECOMENDADA. Se recomienda una dieta antiinflamatoria rica en antioxidantes y �cidos grasos esenciales. Algunos  " +
                                                  "\n alimentos clave incluyen pescados grasos como salm�n y at�n, ricos en omega-3, que ayudan a reducir la inflamaci�n bronquial,  " +
                                                  "\n aportando el 70% del requerimiento diario por cada 100 gramos. Frutas como fresas, kiwi y naranja, ricas en vitamina C, que    " +
                                                  "\n fortalecen el sistema inmunol�gico, con un aporte del 89% del requerimiento diario por cada 100 gramos. Verduras como espinaca " +
                                                  "\n y br�coli, ricas en vitamina A y antioxidantes, que protegen las mucosas respiratorias, con un aporte del 15% del         " +
                                                  "\n requerimiento diario por cada 100 gramos. Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero    " +
                                                  "\n no garantiza al 100% que el paciente tenga asma ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un   " +
                                                  "\n diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera   " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una      " +
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales.       " +
                                                  "\n EJERCICIO. Se recomienda actividad f�sica regular como caminatas, ciclismo suave o ejercicios de resistencia     " +
                                                  "\n moderada durante al menos 150 minutos semanales, distribuidos en cinco d�as. Tambi�n se aconseja incluir         " +
                                                  "\n ejercicios de fuerza dos veces por semana para prevenir la p�rdida de masa muscular y �sea. La actividad         " +
                                                  "\n f�sica mejora el estado de �nimo, fortalece el sistema inmunol�gico y reduce el riesgo de enfermedades           " +
                                                  "\n cardiovasculares. HIDRATACI�N. Se aconseja consumir entre 2 y 2.5 litros de agua al d�a para apoyar la           " +
                                                  "\n funci�n renal, facilitar la absorci�n de medicamentos antirretrovirales y prevenir infecciones urinarias.        " +
                                                  "\n Tambi�n se recomienda el consumo de caldos naturales, jugos sin az�car y bebidas con electrolitos en caso        " +
                                                  "\n de diarrea o fiebre. POSIBLE TRATAMIENTO. El tratamiento para el VIH/SIDA se basa en la terapia antirretroviral  " +
                                                  "\n (TAR), que incluye combinaciones de medicamentos como tenofovir, emtricitabina, efavirenz, dolutegravir o           " +
                                                  "\n lamivudina. Marcas reconocidas incluyen Atripla, Biktarvy y Triumeq. Es esencial mantener la adherencia al          " +
                                                  "\n tratamiento para lograr la supresi�n viral y evitar la progresi�n de la enfermedad. ALIMENTACI�N RECOMENDADA.       " +
                                                  "\n Se recomienda una dieta equilibrada rica en prote�nas, vitaminas y minerales. Algunos alimentos clave incluyen      " +
                                                  "\n carnes magras y pescado, fuentes de prote�nas esenciales. Frutas como papaya, mango y naranja, ricas en vitamina C  " +
                                                  "\n y betacarotenos, que fortalecen el sistema inmune, aportando entre el 70% y 90% del requerimiento diario por cada   " +
                                                  "\n 100 gramos. Verduras como espinaca, zanahoria y br�coli, ricas en vitamina A, hierro y antioxidantes, que ayudan    " +
                                                  "\n a prevenir infecciones oportunistas. Frutos secos como almendras y nueces, ricos en vitamina E y �cidos grasos      " +
                                                  "\n esenciales, con un aporte del 37% del requerimiento diario por cada 28 gramos. Este diagn�stico es una referencia   " +
                                                  "\n l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga VIH/SIDA ni que el tratamiento " +
                                                  "\n sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para mayor seguridad. Angel L " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una              " +
                                                  "\n hidrataci�n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales.               " +
                                                  "\n EJERCICIO. Se recomienda actividad f�sica ligera como caminatas suaves, estiramientos y ejercicios de movilidad          " +
                                                  "\n durante 20 a 30 minutos diarios para mejorar la circulaci�n, reducir el estr�s y fortalecer el sistema inmunol�gico.     " +
                                                  "\n Se debe evitar el ejercicio intenso durante el tratamiento para prevenir complicaciones. HIDRATACI�N. Se aconseja        " +
                                                  "\n consumir entre 2 y 2.5 litros de agua al d�a para facilitar la eliminaci�n de toxinas, apoyar la funci�n renal y         " +
                                                  "\n reducir la inflamaci�n del tracto urinario. Tambi�n se recomienda el consumo de infusiones suaves como manzanilla        " +
                                                  "\n o menta para aliviar molestias urinarias. POSIBLE TRATAMIENTO. El tratamiento para la gonorrea incluye antibi�ticos      " +
                                                  "\n como ceftriaxona en dosis �nica intramuscular de 500 mg. En caso de coinfecci�n con clamidia, se a�ade doxiciclina       " +
                                                  "\n 100 mg dos veces al d�a por 7 d�as. Marcas reconocidas incluyen Rocephin y Vibramycin. Es importante tratar tambi�n      " +
                                                  "\n a la pareja sexual para evitar reinfecci�n. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta antiinflamatoria rica      " +
                                                  "\n en antioxidantes y nutrientes que fortalezcan el sistema inmunol�gico. Algunos alimentos clave incluyen frutas como      " +
                                                  "\n ar�ndanos, naranja y pi�a, ricas en vitamina C, que ayudan a combatir infecciones, aportando el 89% del requerimiento    " +
                                                  "\n diario por cada 100 gramos. Verduras como br�coli y espinaca, ricas en vitamina A y hierro, que favorecen la regeneraci�n" +
                                                  "\n celular y la oxigenaci�n, con un aporte del 15% del requerimiento diario por cada 100 gramos. Yogur natural, fuente      " +
                                                  "\n de probi�ticos que ayudan a mantener el equilibrio de la flora vaginal y digestiva. Este diagn�stico es una referencia   " +
                                                  "\n l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga gonorrea ni que el tratamiento sea  " +
                                                  "\n el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n El herpes genital es una infecci�n viral cr�nica causada por el virus del herpes simple (VHS), que puede provocar       " +
                                                  "\n llagas dolorosas, picaz�n y molestias en la zona genital. En la adultez mayor, los brotes pueden ser m�s frecuentes     " +
                                                  "\n y prolongados debido al debilitamiento del sistema inmunol�gico. EJERCICIO. Se recomienda actividad f�sica moderada     " +
                                                  "\n como caminatas suaves, yoga o ejercicios de respiraci�n, que ayudan a reducir el estr�s, uno de los principales         " +
                                                  "\n desencadenantes de los brotes. Tambi�n es �til mantener una rutina de ejercicio constante para fortalecer el sistema    " +
                                                  "\n inmune. HIDRATACI�N. Es fundamental consumir entre 2 y 2.5 litros de agua al d�a para mantener la piel y las mucosas    " +
                                                  "\n hidratadas, lo que puede ayudar a reducir la irritaci�n durante los brotes. Se sugiere complementar con infusiones de   " +
                                                  "\n manzanilla o t� verde por sus propiedades calmantes y antioxidantes. POSIBLE TRATAMIENTO. El tratamiento incluye        " +
                                                  "\n antivirales como aciclovir, valaciclovir o famciclovir, que ayudan a reducir la duraci�n y severidad de los brotes.     " +
                                                  "\n En casos recurrentes, puede indicarse tratamiento supresivo diario. Tambi�n se recomienda mantener una buena higiene    " +
                                                  "\n personal y evitar el contacto directo durante los brotes. ALIMENTACI�N RECOMENDADA. Consumir alimentos que fortalezcan  " +
                                                  "\n el sistema inmunol�gico y reduzcan la inflamaci�n. Yogur natural, fuente de probi�ticos que ayudan a mantener la flora  " +
                                                  "\n intestinal y mejorar la respuesta inmune. Frutas c�tricas como naranja y toronja, ricas en vitamina C, que fortalecen   " +
                                                  "\n el sistema inmunol�gico, aportando hasta el 89% del requerimiento diario por cada 100 g. Verduras de hoja verde como    " +
                                                  "\n espinaca, que contienen hierro y antioxidantes esenciales para la recuperaci�n. Pescados como salm�n, ricos en �cidos   " +
                                                  "\n grasos Omega-3, que poseen propiedades antiinflamatorias. Este es solo un diagn�stico predeterminado l�gico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas      " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el   " +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se    " +
                                                  "\n le recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n La s�filis es una infecci�n bacteriana de transmisi�n sexual causada por Treponema pallidum, que puede progresar      " +
                                                  "\n por etapas si no se trata, afectando la piel, �rganos internos y el sistema nervioso. EJERCICIO. Se recomienda        " +
                                                  "\n actividad f�sica moderada como caminatas o ejercicios de bajo impacto, que ayudan a mantener la circulaci�n y el      " +
                                                  "\n bienestar general. Es importante evitar el sobreesfuerzo durante las fases activas de la enfermedad. HIDRATACI�N.     " +
                                                  "\n Es fundamental consumir entre 2 y 2.5 litros de agua al d�a para favorecer la eliminaci�n de toxinas y apoyar el      " +
                                                  "\n funcionamiento del sistema inmunol�gico. POSIBLE TRATAMIENTO. El tratamiento de elecci�n es la penicilina benzatina,   " +
                                                  "\n administrada por v�a intramuscular. En personas al�rgicas, pueden utilizarse alternativas como doxiciclina o             " +
                                                  "\n azitromicina. Es esencial completar el tratamiento y realizar seguimiento m�dico para evitar reca�das o complicaciones.    " +
                                                  "\n ALIMENTACI�N RECOMENDADA. Consumir alimentos que fortalezcan el sistema inmunol�gico y favorezcan la regeneraci�n celular.   " +
                                                  "\n Frutas como kiwi y fresas, ricas en vitamina C, que ayudan a combatir infecciones, aportando hasta el 90% del requerimiento  " +
                                                  "\n diario por cada 100 g. H�gado de res, fuente de vitamina B12 y hierro, esenciales para la producci�n de gl�bulos rojos.   " +
                                                  "\n Verduras como br�coli y espinaca, ricas en �cido f�lico y antioxidantes. Yogur natural, fuente de probi�ticos que         " +
                                                  "\n fortalecen la flora intestinal. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza        " +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello     " +
                                                  "\n se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su     " +
                                                  "\n paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar   " +
                                                  "\n a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n La tuberculosis es una infecci�n bacteriana causada por Mycobacterium tuberculosis, que afecta principalmente               " +
                                                  "\n los pulmones y puede causar tos persistente, fiebre, sudoraci�n nocturna y p�rdida de peso. En adultos mayores,             " +
                                                  "\n el diagn�stico puede ser m�s complejo por s�ntomas at�picos. EJERCICIO. Se recomienda actividad f�sica moderada             " +
                                                  "\n como caminatas suaves o ejercicios respiratorios, que ayudan a mejorar la capacidad pulmonar y reducir la fatiga.           " +
                                                  "\n Es importante evitar el esfuerzo excesivo durante el tratamiento activo. HIDRATACI�N. Es fundamental consumir entre         " +
                                                  "\n 2.5 y 3 litros de agua al d�a para mantener las v�as respiratorias hidratadas y facilitar la eliminaci�n de toxinas.        " +
                                                  "\n Tambi�n se recomienda el consumo de l�quidos tibios como caldos o infusiones para aliviar la garganta. POSIBLE              " +
                                                  "\n TRATAMIENTO. El tratamiento est�ndar incluye una combinaci�n de antibi�ticos como isoniazida, rifampicina, pirazinamida     " +
                                                  "\n y etambutol durante al menos seis meses. Es crucial seguir el tratamiento completo para evitar reca�das o resistencia       " +
                                                  "\n bacteriana. ALIMENTACI�N RECOMENDADA. Consumir alimentos ricos en prote�nas, vitaminas y minerales para fortalecer el       " +
                                                  "\n sistema inmunol�gico. Huevos y carnes magras, fuentes de prote�nas de alta calidad. Frutas como guayaba y papaya, ricas     " +
                                                  "\n en vitamina C, que fortalecen el sistema inmune, aportando hasta el 200% del requerimiento diario por cada 100 g. L�cteos   " +
                                                  "\n como leche y yogur, ricos en calcio y vitamina D, esenciales para la recuperaci�n. Verduras como zanahoria y espinaca,      " +
                                                  "\n ricas en vitamina A y hierro, que favorecen la regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico,     " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas  " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el       " +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le     " +
                                                  "\n recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n EJERCICIO: La actividad f�sica regular es esencial para mantener la movilidad y reducir el dolor articular           " +
                                                  "\n en personas con artritis. Se recomienda realizar ejercicios de bajo impacto como caminatas suaves, nataci�n          " +
                                                  "\n o tai chi durante 30 minutos al d�a, cinco veces por semana. Tambi�n es beneficioso incluir ejercicios de            " +
                                                  "\n fortalecimiento muscular con bandas el�sticas o pesas ligeras, as� como estiramientos suaves para mejorar la         " +
                                                  "\n flexibilidad y prevenir la rigidez. HIDRATACI�N: Es fundamental consumir entre 2 y 2.5 litros de agua al d�a         " +
                                                  "\n para mantener la lubricaci�n de las articulaciones y facilitar la eliminaci�n de toxinas. La hidrataci�n             " +
                                                  "\n adecuada tambi�n ayuda a reducir la inflamaci�n y mejora la absorci�n de nutrientes esenciales para la salud         " +
                                                  "\n �sea y articular. POSIBLE TRATAMIENTO: El tratamiento de la artritis puede incluir medicamentos antiinflamatorios    " +
                                                  "\n no esteroideos como el ibuprofeno o el naproxeno, analg�sicos como el paracetamol, y f�rmacos modificadores          " +
                                                  "\n de la enfermedad como el metotrexato o la sulfasalazina. En casos m�s avanzados, se pueden utilizar terapias         " +
                                                  "\n biol�gicas como los inhibidores del TNF. Tambi�n se recomienda la fisioterapia y el uso de compresas calientes       " +
                                                  "\n o fr�as para aliviar el dolor. ALIMENTACI�N: Se recomienda el consumo de alimentos con propiedades antiinflamatorias " +
                                                  "\n y ricos en nutrientes esenciales, tales como pescados grasos como salm�n y sardinas, que aportan �cidos grasos       " +
                                                  "\n Omega-3 en un 70% de la ingesta diaria recomendada, ayudando a reducir la inflamaci�n articular. Frutas como         " +
                                                  "\n cerezas y fresas, que contienen antioxidantes y vitamina C en un 89% de la ingesta diaria recomendada, fortaleciendo " +
                                                  "\n el sistema inmunol�gico. Verduras como br�coli y espinacas, que aportan vitamina K y calcio en un 50% de la ingesta  " +
                                                  "\n diaria recomendada, esenciales para la salud �sea. Frutos secos como nueces y almendras, que contienen vitamina E y  " +
                                                  "\n magnesio, contribuyendo con hasta un 40% de la ingesta diaria recomendada de estos nutrientes beneficiosos para las  " +
                                                  "\n articulaciones. este es solo un diagn�stico predeterminado l�gico. haberlo consultado no garantiza al 100% que la    " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar m�s de un  " +
                                                  "\n diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico   " +
                                                  "\n no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida)  " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n EJERCICIO: Durante la infecci�n por tosferina se recomienda evitar esfuerzos f�sicos intensos y priorizar el descanso      " +
                                                  "\n absoluto, ya que los ataques de tos pueden ser debilitantes. Una vez que los s�ntomas disminuyen, se pueden realizar       " +
                                                  "\n ejercicios suaves como caminatas lentas o ejercicios de respiraci�n para mejorar la oxigenaci�n pulmonar y reducir la      " +
                                                  "\n fatiga. HIDRATACI�N: Es crucial consumir al menos 2.5 litros de agua al d�a para mantener las v�as respiratorias           " +
                                                  "\n hidratadas y facilitar la expulsi�n de mucosidades. Tambi�n se recomienda el consumo de infusiones tibias como             " +
                                                  "\n manzanilla o jengibre, que ayudan a calmar la garganta y reducir la tos. POSIBLE TRATAMIENTO: El tratamiento de la         " +
                                                  "\n tosferina incluye antibi�ticos como la azitromicina, claritromicina o eritromicina, especialmente si se administra         " +
                                                  "\n en las primeras etapas de la enfermedad. Tambi�n se pueden utilizar broncodilatadores y humidificadores de vapor fr�o      " +
                                                  "\n para aliviar los s�ntomas respiratorios. Es importante mantener el entorno libre de humo, polvo y vapores irritantes.      " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos suaves y ricos en nutrientes para fortalecer el sistema inmunol�gico,  " +
                                                  "\n tales como frutas c�tricas como naranjas y mandarinas, que aportan vitamina C en un 89% de la ingesta diaria recomendada,  " +
                                                  "\n ayudando a combatir infecciones. Caldos naturales y sopas de verduras, que aportan l�quidos, minerales y vitaminas         " +
                                                  "\n esenciales como el potasio y la vitamina A. Miel natural en peque�as cantidades, que posee propiedades antimicrobianas y   " +
                                                  "\n suaviza la garganta. Yogur natural, que contiene probi�ticos beneficiosos para la flora intestinal y el sistema inmune.    " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico. haberlo consultado no garantiza al 100% que la paciente tenga esta      " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. se recomienda realizar m�s de un diagn�stico para mayor     " +
                                                  "\n seguridad en el tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se   " +
                                                  "\n recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n EJERCICIO: Durante la infecci�n por paperas se recomienda reposo absoluto, ya que la inflamaci�n de las           " +
                                                  "\n gl�ndulas salivales puede causar dolor al moverse o hablar. Una vez que los s�ntomas disminuyen, se pueden        " +
                                                  "\n realizar ejercicios suaves como estiramientos o caminatas cortas para mejorar la circulaci�n y reducir la         " +
                                                  "\n rigidez muscular. HIDRATACI�N: Es fundamental consumir al menos 2.5 litros de agua al d�a para mantener la        " +
                                                  "\n hidrataci�n y facilitar la recuperaci�n. Tambi�n se recomienda el consumo de l�quidos tibios como caldos,         " +
                                                  "\n infusiones suaves y jugos naturales sin az�car, que ayudan a aliviar el dolor en las gl�ndulas salivales y        " +
                                                  "\n a mantener el equilibrio de electrolitos. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral espec�fico      " +
                                                  "\n para las paperas, pero los s�ntomas pueden aliviarse con analg�sicos como el paracetamol o el ibuprofeno,         " +
                                                  "\n compresas fr�as en las zonas inflamadas y reposo. Tambi�n se recomienda evitar alimentos �cidos o duros que       " +
                                                  "\n puedan irritar las gl�ndulas salivales. ALIMENTACI�N: Se recomienda el consumo de alimentos blandos y ricos       " +
                                                  "\n en nutrientes para facilitar la masticaci�n y fortalecer el sistema inmunol�gico, tales como frutas como mel�n    " +
                                                  "\n y pl�tano, que aportan potasio y vitamina C en un 70% de la ingesta diaria recomendada, ayudando a reducir la         " +
                                                  "\n inflamaci�n. Verduras cocidas como calabaza y zanahoria, que contienen vitamina A y antioxidantes esenciales para     " +
                                                  "\n la regeneraci�n celular. Yogur natural, que aporta probi�ticos y prote�nas de f�cil digesti�n. Sopas de verduras,     " +
                                                  "\n que hidratan y aportan minerales como el sodio y el magnesio. este es solo un diagn�stico predeterminado l�gico.      " +
                                                  "\n Haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente" +
                                                  "\n correctas. se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s,  " +
                                                  "\n por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.      " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N: Para el tratamiento del zika es fundamental mantener una hidrataci�n adecuada con un consumo diario        " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para prevenir la deshidrataci�n    " +
                                                  "\n causada por la fiebre y apoyar el sistema inmunol�gico. EJERCICIO: Se recomienda actividad f�sica ligera como           " +
                                                  "\n estiramientos suaves o caminatas cortas dentro del hogar evitando esfuerzos intensos mientras persistan los s�ntomas.   " +
                                                  "\n Una vez superada la fase aguda es recomendable realizar ejercicios de movilidad y respiraci�n para recuperar energ�a    " +
                                                  "\n y mejorar la circulaci�n. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral espec�fico para el zika. El manejo    " +
                                                  "\n es sintom�tico e incluye reposo abundante, hidrataci�n constante y medicamentos como el paracetamol para reducir la     " +
                                                  "\n fiebre y el dolor. No se recomienda el uso de aspirina ni antiinflamatorios no esteroideos hasta descartar dengue por   " +
                                                  "\n riesgo de hemorragias. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema inmunol�gico se recomienda el consumo de      " +
                                                  "\n NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la duraci�n de los s�ntomas aportando aproximadamente el   " +
                                                  "\n 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene compuestos con propiedades antiinflamatorias  " +
                                                  "\n que pueden aliviar el malestar general. ESPINACAS Y BR�COLI: Aportan antioxidantes y vitamina A esenciales para la         " +
                                                  "\n regeneraci�n celular con un contenido de aproximadamente 56% de la ingesta diaria recomendada por cada 100 gramos.         " +
                                                  "\n YOGUR NATURAL: Contiene probi�ticos que fortalecen el sistema inmunol�gico y mejoran la salud digestiva aportando calcio   " +
                                                  "\n y prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100% que el   " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer m�s de     " +
                                                  "\n un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s por su salud    " +
                                                  "\n si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico Angel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N: Para el tratamiento del rotavirus es fundamental mantener una hidrataci�n adecuada con un consumo        " +
                                                  "\n diario recomendado de 2.5 litros de agua aproximadamente 10 vasos de tama�o regular para reponer los l�quidos         " +  
                                                  "\n perdidos por la diarrea y prevenir la deshidrataci�n severa. EJERCICIO: Se recomienda reposo durante la fase          " +
                                                  "\n aguda de la enfermedad y posteriormente actividad f�sica ligera como caminatas suaves y ejercicios de movilidad       " +
                                                  "\n para recuperar energ�a y fortalecer el sistema digestivo. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral     " +
                                                  "\n espec�fico para el rotavirus. El manejo se basa en el control de los s�ntomas y la prevenci�n de la deshidrataci�n.   " +
                                                  "\n En casos graves puede requerirse rehidrataci�n oral con soluciones como Vida Suero Oral o incluso intravenosa. No     " +
                                                  "\n se recomiendan medicamentos antidiarreicos. ALIMENTOS RECOMENDADOS: Para estabilizar el sistema digestivo se          " +
                                                  "\n recomienda el consumo de PL�TANOS: Ricos en potasio que ayuda a reemplazar los electrolitos perdidos aportando        " +
                                                  "\n aproximadamente el 12% de la ingesta diaria recomendada por cada 100 gramos. ARROZ BLANCO: Fuente de carbohidratos    " +
                                                  "\n de f�cil digesti�n que ayuda a estabilizar el sistema digestivo. ZANAHORIAS: Ricas en vitamina A y antioxidantes         " + 
                                                  "\n que ayudan a la regeneraci�n celular aportando aproximadamente el 56% de la ingesta diaria recomendada por cada 100      " +
                                                  "\n gramos. YOGUR NATURAL: Contiene probi�ticos que fortalecen el sistema digestivo y mejoran la salud intestinal aportando  " +
                                                  "\n calcio y prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza al 100% " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda hacer   " +
                                                  "\n m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s por    " +
                                                  "\n su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico Angel     " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la listeriosis es fundamental mantener una hidrataci�n adecuada con un consumo            " + 
                                                  "\n diario recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para apoyar la eliminaci�n        " +
                                                  "\n de toxinas y mantener el equilibrio del sistema inmunol�gico. EJERCICIO: Se recomienda actividad f�sica ligera como           " +
                                                  "\n caminatas suaves ejercicios de estiramiento y respiraci�n profunda para mejorar la circulaci�n y fortalecer el sistema        " +
                                                  "\n inmunol�gico evitando esfuerzos intensos durante el tratamiento. POSIBLE TRATAMIENTO: El tratamiento suele incluir            " +
                                                  "\n antibi�ticos como la ampicilina o la penicilina G en combinaci�n con gentamicina en casos graves. Es fundamental iniciar      " +
                                                  "\n el tratamiento lo antes posible y seguir estrictamente las indicaciones m�dicas. ALIMENTOS RECOMENDADOS: Para fortalecer      " +
                                                  "\n el sistema inmunol�gico se recomienda el consumo de FRUTOS ROJOS: Ricos en antioxidantes y vitamina C que ayudan a combatir   " +
                                                  "\n infecciones aportando aproximadamente el 70% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Contiene         " +
                                                  "\n compuestos con propiedades antiinflamatorias que pueden ayudar a reducir la inflamaci�n. ESPINACAS Y BR�COLI: Aportan         " +
                                                  "\n antioxidantes y vitamina A esenciales para la regeneraci�n celular con un contenido de aproximadamente 56% de la ingesta      " +
                                                  "\n diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos que fortalecen el sistema inmunol�gico y mejoran  " +
                                                  "\n la salud digestiva aportando calcio y prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico haberlo         " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas      " +
                                                  "\n para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado     " +
                                                  "\n de su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar  " +
                                                  "\n a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 a 3 litros de agua al d�a (diez a doce vasos de agua de tama�o regular)     " +
                                                  "\n para prevenir la deshidrataci�n causada por la diarrea, mantener el equilibrio electrol�tico y apoyar la funci�n renal.  " +
                                                  "\n En mujeres adultas mayores, tambi�n se sugiere el uso de soluciones de rehidrataci�n oral en casos de p�rdida            " +
                                                  "\n significativa de l�quidos. EJERCICIO: Durante la fase aguda se recomienda reposo absoluto. Una vez superados             " +
                                                  "\n los s�ntomas, se puede retomar actividad f�sica ligera como caminatas suaves para estimular la digesti�n y mejorar       " +
                                                  "\n la circulaci�n. POSIBLE TRATAMIENTO: El tratamiento incluye antibi�ticos como Ciprofloxacino (500 mg dos veces al        " +
                                                  "\n d�a por 3 a 5 d�as) o Ceftriaxona (1 a 2 g diarios por v�a intramuscular en casos graves o si no es posible la v�a       " +
                                                  "\n oral). Tambi�n puede utilizarse Azitromicina (500 mg el primer d�a, luego 250 mg diarios por 4 d�as) si hay resistencia  " +
                                                  "\n o intolerancia a los anteriores. Es fundamental evitar medicamentos antidiarreicos como la loperamida, ya que pueden     " +
                                                  "\n empeorar la infecci�n. ALIMENTACI�N: Se recomienda una dieta suave, rica en nutrientes que favorezcan la recuperaci�n    " +
                                                  "\n intestinal como: Pl�tanos (aportan potasio, 23% del requerimiento diario por cada 100 g); Zanahorias cocidas (ricas en   " +
                                                  "\n vitamina A, 93% por cada 100 g); Arroz blanco (fuente de energ�a y f�cil digesti�n); Manzanas cocidas (con pectina, que  " +
                                                  "\n ayuda a regular el tr�nsito intestinal); y Yogur natural (rico en probi�ticos y calcio, 30% por cada 100 g). Este es     " +
                                                  "\n solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad " +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida   " +
                                                  "\n para establecer mejor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le  " +
                                                  "\n satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera   " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 litros de agua al d�a (diez vasos de agua de tama�o regular) para mantener    " +
                                                  "\n las v�as respiratorias hidratadas, facilitar la expectoraci�n y mejorar la oxigenaci�n. Tambi�n se sugiere el uso de       " +
                                                  "\n infusiones calientes con jengibre o eucalipto para aliviar la congesti�n bronquial. EJERCICIO: Actividad f�sica moderada   " +
                                                  "\n y controlada como caminatas, ejercicios de respiraci�n diafragm�tica y entrenamiento pulmonar puede mejorar la capacidad   " + 
                                                  "\n respiratoria y reducir la disnea. Se recomienda realizar rehabilitaci�n pulmonar supervisada, especialmente en mujeres     " +
                                                  "\n adultas mayores con limitaci�n funcional. POSIBLE TRATAMIENTO: El tratamiento incluye broncodilatadores inhalados como     " +
                                                  "\n Salbutamol o Tiotropio, corticosteroides inhalados como Budesonida o Fluticasona, y en casos avanzados, oxigenoterapia     " +
                                                  "\n domiciliaria. Tambi�n se pueden usar antibi�ticos en caso de exacerbaciones infecciosas y vacunas anuales contra la        " +
                                                  "\n influenza y el neumococo. Es fundamental el abandono del tabaco y el control de comorbilidades como hipertensi�n o         " +
                                                  "\n diabetes. ALIMENTACI�N: Se recomienda una dieta rica en antioxidantes y nutrientes antiinflamatorios como: Br�coli         " +
                                                  "\n (con vitamina C y sulforafano, 135% y 20% respectivamente por cada 100 g); Pescados grasos (ricos en Omega-3, 50% por      " +
                                                  "\n cada 100 g); Frutas c�tricas (con vitamina C, 89% por cada 100 g); Espinacas (con vitamina A y hierro, 56% y 15%           " +
                                                  "\n respectivamente por cada 100 g); y Nueces (con �cido alfa-linol�nico, 91% por cada 30 g). Este es solo un diagn�stico      " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor     " +
                                                  "\n seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se   " +
                                                  "\n recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2 a 2.5 litros de agua al d�a (ocho a diez vasos de agua de tama�o regular)    " +
                                                  "\n para apoyar la funci�n renal, facilitar la eliminaci�n de toxinas y mantener el equilibrio electrol�tico durante el     " +
                                                  "\n tratamiento antibi�tico. Tambi�n se sugiere el consumo de jugos naturales sin az�car y caldos suaves. EJERCICIO:        " +
                                                  "\n Actividad f�sica ligera como caminatas o estiramientos suaves puede ayudar a mejorar la circulaci�n y fortalecer el     " +
                                                  "\n sistema inmune. Se debe evitar el ejercicio intenso durante el tratamiento para no comprometer la recuperaci�n.         " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento incluye antibi�ticos como Azitromicina (1 g en dosis �nica) o Doxiciclina (100 mg   " +
                                                  "\n dos veces al d�a durante 7 d�as). En mujeres adultas mayores, es importante ajustar las dosis si hay insuficiencia      " +
                                                  "\n renal o hep�tica, y realizar seguimiento para confirmar la erradicaci�n de la bacteria. Tambi�n se recomienda tratar    " +
                                                  "\n a todas las parejas sexuales recientes y evitar relaciones sexuales durante al menos 7 d�as tras el inicio del          " +
                                                  "\n tratamiento. ALIMENTACI�N: Se recomienda una dieta que apoye la funci�n inmunol�gica y la recuperaci�n, incluyendo:     " +
                                                  "\n Naranjas (ricas en vitamina C, 89% por cada 100 g); Espinacas (fuente de hierro y �cido f�lico, 56% y 49% respectivamente " +
                                                  "\n por cada 100 g); Yogur natural (rico en probi�ticos y calcio, 30% de la ingesta diaria recomendada por cada 100 g);    " +
                                                  "\n Ajo (con propiedades antibacterianas naturales); y Zanahorias (ricas en vitamina A, 93% por cada 100 g), que ayudan    " +
                                                  "\n a mantener la integridad de las mucosas. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no      " +
                                                  "\n garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, " +
                                                  "\n se recomienda realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado.    " +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.   " +
                                                  "\n �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana. " +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidrataci�n   " +
                                                  "\n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda   " +
                                                  "\n reposo absoluto durante la fase aguda de la enfermedad para evitar complicaciones neurol�gicas. Una vez superada esta     " +
                                                  "\n etapa, se pueden incorporar caminatas suaves de 15 a 20 minutos al d�a, ejercicios de movilidad articular y respiraci�n   " +
                                                  "\n profunda para mejorar la oxigenaci�n cerebral y prevenir la rigidez muscular. Tambi�n es �til realizar ejercicios de      " +
                                                  "\n equilibrio y coordinaci�n para recuperar la funcionalidad neurol�gica. HIDRATACI�N. Se aconseja consumir entre 2.5 y 3    " +
                                                  "\n litros de agua al d�a para mantener el equilibrio de l�quidos, facilitar la eliminaci�n de toxinas y apoyar la funci�n    " +
                                                  "\n renal durante el tratamiento antibi�tico. Tambi�n se recomienda el consumo de caldos naturales, infusiones suaves y       " +
                                                  "\n jugos naturales ricos en vitamina C para fortalecer el sistema inmunol�gico. POSIBLE TRATAMIENTO. El tratamiento para     " +
                                                  "\n la meningitis bacteriana incluye la administraci�n inmediata de antibi�ticos por v�a intravenosa como ceftriaxona,        " +
                                                  "\n vancomicina o ampicilina, dependiendo del agente causal. En algunos casos se a�aden corticosteroides como la dexametasona   " +
                                                  "\n para reducir la inflamaci�n cerebral. Marcas reconocidas incluyen Rocephin, Vancocin y Ampicillin. Es fundamental iniciar   " +
                                                  "\n el tratamiento lo antes posible para evitar secuelas neurol�gicas. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica   " +
                                                  "\n en prote�nas, antioxidantes y vitaminas del complejo B para apoyar la recuperaci�n neurol�gica. Algunos alimentos clave     " +
                                                  "\n incluyen carnes magras y pescado, fuentes de prote�nas esenciales. Frutas c�tricas como naranja y kiwi, ricas en vitamina C," +
                                                  "\n que fortalecen el sistema inmune, aportando el 89% del requerimiento diario por cada 100 gramos. Verduras como espinaca  " +
                                                  "\n y br�coli, ricas en �cido f�lico y vitamina B9, esenciales para la regeneraci�n celular, con un aporte del 15% del       " +
                                                  "\n requerimiento diario por cada 100 gramos. Frutos secos como almendras y nueces, ricos en vitamina E y �cidos grasos      " +
                                                  "\n esenciales, que protegen las c�lulas nerviosas y aportan el 37% del requerimiento diario por cada 28 gramos. Este        " +
                                                  "\n diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga       " +
                                                  "\n meningitis bacteriana ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar    " +
                                                  "\n a un m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidrataci�n    " +
                                                  "\n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda    " +
                                                  "\n actividad f�sica regular como caminatas suaves, ejercicios de resistencia moderada y estiramientos durante al menos 150    " +
                                                  "\n minutos semanales, distribuidos en cinco d�as. Tambi�n se aconseja incluir ejercicios de fuerza dos veces por semana       " +
                                                  "\n para prevenir la p�rdida de masa muscular y �sea. La actividad f�sica mejora el estado de �nimo, fortalece el sistema      " +
                                                  "\n inmunol�gico y reduce la fatiga asociada al tratamiento. HIDRATACI�N. Se aconseja consumir entre 2 y 2.5 litros de agua    " +
                                                  "\n al d�a para apoyar la funci�n renal, facilitar la absorci�n de medicamentos y prevenir infecciones urinarias. Tambi�n      " +
                                                  "\n se recomienda el consumo de caldos naturales, jugos sin az�car y bebidas con electrolitos en caso de diarrea o fiebre.     " +
                                                  "\n POSIBLE TRATAMIENTO. El tratamiento para el c�ncer depende del tipo y estadio, pero puede incluir cirug�a, quimioterapia,  " +
                                                  "\n radioterapia, inmunoterapia o terapia hormonal. En mujeres adultas mayores, se realiza una valoraci�n geri�trica integral  " +
                                                  "\n para personalizar el tratamiento y minimizar efectos secundarios. Medicamentos comunes incluyen paclitaxel, letrozol,      " +
                                                  "\n tamoxifeno o capecitabina. Marcas reconocidas incluyen Taxol, Femara y Xeloda. ALIMENTACI�N RECOMENDADA. Se recomienda     " +
                                                  "\n una dieta equilibrada rica en prote�nas, antioxidantes y grasas saludables. Algunos alimentos clave incluyen pescados      " +
                                                  "\n grasos como salm�n y at�n, ricos en omega-3, que ayudan a reducir la inflamaci�n y fortalecen el sistema inmune, aportando " +
                                                  "\n el 70% del requerimiento diario por cada 100 gramos. Frutas como papaya, mango y naranja, ricas en vitamina C y            " +
                                                  "\n betacarotenos, que fortalecen el sistema inmune, con un aporte del 90% del requerimiento diario por cada 100 gramos.       " +
                                                  "\n Verduras como espinaca, zanahoria y br�coli, ricas en vitamina A, hierro y antioxidantes, que ayudan a prevenir infecciones" +
                                                  "\n oportunistas. Frutos secos como almendras y nueces, ricos en vitamina E y �cidos grasos esenciales, con un aporte del 37%  " +
                                                  "\n del requerimiento diario por cada 28 gramos. Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero  " +
                                                  "\n no garantiza al 100% que el paciente tenga c�ncer ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un  " +
                                                  "\n diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera    " +
                                                  "\n que te mejores.");
                            }
                        }
                        if(EstaturaFemenino.equals("1.30-1.60 m")){
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidrataci�n     " +
                                                  "\n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda     " +
                                                  "\n actividad f�sica moderada como caminatas suaves de 30 minutos al d�a, cinco veces por semana, acompa�adas de ejercicios     " +
                                                  "\n de respiraci�n profunda para mejorar la oxigenaci�n y reducir la congesti�n. Tambi�n es �til realizar estiramientos         " +
                                                  "\n suaves y ejercicios de movilidad para mantener la circulaci�n activa sin agotar al cuerpo. HIDRATACI�N. Se aconseja         " +
                                                  "\n consumir entre 2.5 y 3 litros de agua al d�a para compensar la p�rdida de l�quidos por fiebre y sudoraci�n, mantener        " +
                                                  "\n las mucosas hidratadas y facilitar la eliminaci�n de toxinas. Tambi�n se recomienda el consumo de caldos naturales,         " +
                                                  "\n infusiones tibias de jengibre o manzanilla y jugos c�tricos sin az�car a�adida para reforzar el sistema inmunol�gico.       " +
                                                  "\n POSIBLE TRATAMIENTO. El tratamiento para la influenza incluye antivirales como oseltamivir (marca reconocida: Tamiflu)      " +
                                                  "\n que deben administrarse en las primeras 48 horas de s�ntomas. Tambi�n se utilizan medicamentos para aliviar fiebre y        " +
                                                  "\n dolor como paracetamol (Tempra) o ibuprofeno (Advil). Es importante el reposo absoluto y evitar el contacto con otras       " +
                                                  "\n personas para prevenir contagios. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica en antioxidantes, vitamina C       " +
                                                  "\n y zinc. Algunos alimentos clave incluyen frutas c�tricas como naranja, toronja y kiwi, ricas en vitamina C, que fortalecen  " +
                                                  "\n el sistema inmune, aportando el 89% del requerimiento diario por cada 100 gramos. Verduras como espinaca y br�coli, ricas   " +
                                                  "\n en vitamina A y �cido f�lico, que ayudan a la regeneraci�n celular y fortalecen las mucosas, con un aporte del 15% del      " +
                                                  "\n requerimiento diario por cada 100 gramos. Frutos secos como almendras y nueces, ricos en vitamina E y �cidos grasos         " +
                                                  "\n esenciales, que protegen las c�lulas inmunol�gicas, con un aporte del 37% del requerimiento diario por cada 28 gramos.      " +
                                                  "\n Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga     " +
                                                  "\n influenza ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico       " +
                                                  "\n para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidrataci�n     " +
                                                  "\n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda     " +
                                                  "\n reposo durante la fase aguda de la enfermedad. Una vez superada esta etapa, se pueden incorporar caminatas suaves de 15     " +
                                                  "\n a 20 minutos al d�a, ejercicios de respiraci�n profunda y estiramientos para mejorar la oxigenaci�n y prevenir la rigidez   " +
                                                  "\n muscular. Tambi�n es �til realizar ejercicios de equilibrio y coordinaci�n para recuperar la funcionalidad neurol�gica.     " +
                                                  "\n HIDRATACI�N. Se aconseja consumir entre 2.5 y 3 litros de agua al d�a para mantener el equilibrio de l�quidos, facilitar    " +
                                                  "\n la eliminaci�n de toxinas y apoyar la funci�n renal durante el tratamiento antibi�tico. Tambi�n se recomienda el consumo    " +
                                                  "\n de caldos naturales, infusiones suaves y jugos naturales ricos en vitamina C. POSIBLE TRATAMIENTO. El tratamiento para la   " +
                                                  "\n neumon�a incluye antibi�ticos como amoxicilina con �cido clavul�nico, ceftriaxona o levofloxacino, dependiendo del agente   " +
                                                  "\n causal. Marcas reconocidas incluyen Clavulin, Rocephin y Tavanic. En algunos casos se a�aden corticosteroides como la       " +
                                                  "\n dexametasona para reducir la inflamaci�n pulmonar. Es fundamental iniciar el tratamiento lo antes posible para evitar       " +
                                                  "\n complicaciones. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica en prote�nas, antioxidantes y vitaminas del          " +
                                                  "\n complejo B. Algunos alimentos clave incluyen carnes magras y pescado, fuentes de prote�nas esenciales. Frutas c�tricas      " +
                                                  "\n como naranja y kiwi, ricas en vitamina C, que fortalecen el sistema inmune, aportando el 89% del requerimiento diario       " +
                                                  "\n por cada 100 gramos. Verduras como espinaca y br�coli, ricas en �cido f�lico y vitamina B9, esenciales para la regeneraci�n " +
                                                  "\n celular, con un aporte del 15% del requerimiento diario por cada 100 gramos. Frutos secos como almendras y nueces, ricos en " +
                                                  "\n vitamina E y �cidos grasos esenciales, que protegen las c�lulas inmunol�gicas y aportan el 37% del requerimiento diario por " +
                                                  "\n cada 28 gramos. Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el    " +
                                                  "\n paciente tenga neumon�a ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a   " +
                                                  "\n un m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes. " +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidrataci�n    " +
                                                  "\n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda    " +
                                                  "\n actividad f�sica regular como caminatas de 30 minutos al d�a, cinco veces por semana, ejercicios de resistencia moderada   " +
                                                  "\n y estiramientos. Tambi�n se aconseja incluir ejercicios de fuerza dos veces por semana para prevenir la p�rdida de masa    " +
                                                  "\n muscular y �sea. La actividad f�sica mejora la sensibilidad a la insulina, regula la glucosa y reduce el riesgo            " +
                                                  "\n cardiovascular. HIDRATACI�N. Se aconseja consumir entre 2 y 2.5 litros de agua al d�a para apoyar la funci�n renal,        " +
                                                  "\n facilitar la absorci�n de medicamentos y prevenir infecciones urinarias. Tambi�n se recomienda el consumo de caldos        " +
                                                  "\n naturales, infusiones sin az�car y bebidas con electrolitos en caso de diarrea o fiebre. POSIBLE TRATAMIENTO. El           " +
                                                  "\n tratamiento para la diabetes incluye medicamentos orales como metformina, glibenclamida o sitagliptina, y en algunos       " +
                                                  "\n casos insulina. Marcas reconocidas incluyen Glucophage, Diamicron y Januvia. Es fundamental mantener una adherencia        " + 
                                                  "\n estricta al tratamiento y realizar controles peri�dicos de glucosa. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta         " +
                                                  "\n equilibrada rica en fibra, prote�nas magras y carbohidratos complejos. Algunos alimentos clave incluyen cereales integrales   " +
                                                  "\n como avena y arroz integral, que ayudan a mantener niveles estables de glucosa. Frutas como manzana y pera, ricas en fibra    " +
                                                  "\n soluble, que ralentizan la absorci�n de az�car, con un aporte del 15% del requerimiento diario por cada 100 gramos. Verduras  " +
                                                  "\n como espinaca, br�coli y zanahoria, ricas en vitamina A, hierro y antioxidantes, que ayudan a prevenir complicaciones. Frutos " +
                                                  "\n secos como almendras y nueces, ricos en vitamina E y �cidos grasos esenciales, con un aporte del 37% del requerimiento diario " +
                                                  "\n por cada 28 gramos. Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el  " +
                                                  "\n paciente tenga diabetes ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un  " +
                                                  "\n m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n El asma es una enfermedad inflamatoria cr�nica de las v�as respiratorias que puede causar dificultad para respirar,         " +
                                                  "\n tos, opresi�n en el pecho y sibilancias. En la adultez mayor, los s�ntomas pueden confundirse con otras afecciones          " +
                                                  "\n respiratorias, por lo que es fundamental un diagn�stico y manejo adecuados. EJERCICIO. Se recomienda actividad f�sica       " +
                                                  "\n moderada y controlada, como caminatas suaves, ejercicios de respiraci�n y estiramientos, evitando ambientes fr�os o         " +
                                                  "\n contaminados. Es importante realizar calentamiento previo y enfriamiento posterior, as� como adaptar la intensidad          " +
                                                  "\n seg�n la capacidad respiratoria del paciente. HIDRATACI�N. Es fundamental consumir entre 2 y 2.5 litros de agua al          " +
                                                  "\n d�a para mantener las v�as respiratorias hidratadas, facilitar la eliminaci�n de secreciones y reducir la irritaci�n        " +
                                                  "\n bronquial. Tambi�n se recomienda el consumo de l�quidos tibios como infusiones de jengibre o manzanilla. POSIBLE            " +
                                                  "\n TRATAMIENTO. El tratamiento incluye broncodilatadores de acci�n r�pida como el salbutamol, corticosteroides inhalados       " +
                                                  "\n como la fluticasona o budesonida, y en algunos casos, modificadores de leucotrienos como el montelukast. Es esencial        " +
                                                  "\n seguir un plan de acci�n personalizado y utilizar los medicamentos preventivos de forma regular. ALIMENTACI�N RECOMENDADA.  " +
                                                  "\n Consumir alimentos que reduzcan la inflamaci�n y fortalezcan el sistema respiratorio. Pescados grasos como salm�n y at�n,   " +
                                                  "\n ricos en �cidos grasos Omega-3, que poseen propiedades antiinflamatorias, aportando hasta el 90% del requerimiento diario   " +
                                                  "\n por cada 100 g. Frutas como fresas y ar�ndanos, ricas en vitamina C y antioxidantes, que fortalecen el sistema inmune,      " +
                                                  "\n aportando cerca del 70% del requerimiento diario por cada 100 g. Verduras como espinaca y br�coli, ricas en hierro,         " +
                                                  "\n vitamina A y carotenoides, esenciales para la salud pulmonar. Este es solo un diagn�stico predeterminado l�gico, haberlo    " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n    " +
                                                  "\n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento " +
                                                  "\n adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda      " +
                                                  "\n mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n El VIH es un virus que debilita el sistema inmunol�gico, y si no se trata adecuadamente, puede progresar a SIDA,        " +
                                                  "\n una condici�n que deja al cuerpo vulnerable a infecciones y enfermedades graves. En la adultez mayor, el                " +
                                                  "\n diagn�stico puede retrasarse y el tratamiento debe considerar otras condiciones cr�nicas. EJERCICIO. Se recomienda      " +
                                                  "\n actividad f�sica moderada como caminatas, yoga o ejercicios de bajo impacto, que ayudan a fortalecer el sistema         " +
                                                  "\n inmune, mejorar el estado de �nimo y mantener la masa muscular. Es importante evitar el sobreesfuerzo y adaptar la      " +
                                                  "\n rutina a la condici�n f�sica del paciente. HIDRATACI�N. Es fundamental consumir entre 2 y 2.5 litros de agua al d�a     " +
                                                  "\n para apoyar la funci�n renal, facilitar la eliminaci�n de toxinas y mantener el equilibrio corporal. Tambi�n se         " +
                                                  "\n recomienda el consumo de l�quidos ricos en electrolitos en caso de fiebre o diarrea. POSIBLE TRATAMIENTO. El            " +
                                                  "\n tratamiento consiste en terapia antirretroviral (TAR), que incluye combinaciones de medicamentos como tenofovir,        " +
                                                  "\n emtricitabina, dolutegravir o efavirenz, que ayudan a mantener la carga viral indetectable y preservar la funci�n       " +
                                                  "\n inmunol�gica. Es esencial la adherencia estricta al tratamiento y el monitoreo m�dico constante. ALIMENTACI�N           " +
                                                  "\n RECOMENDADA. Consumir alimentos que fortalezcan el sistema inmunol�gico y prevengan la p�rdida de peso. Frutas como     " +
                                                  "\n papaya y guayaba, ricas en vitamina C, que fortalecen las defensas, aportando hasta el 200% del requerimiento diario    " +
                                                  "\n por cada 100 g. L�cteos como yogur natural, fuente de probi�ticos que mejoran la flora intestinal. Carnes magras y      " +
                                                  "\n huevos, ricos en prote�nas de alta calidad, esenciales para la regeneraci�n celular. Verduras como espinaca y           " +
                                                  "\n zanahoria, ricas en vitamina A, hierro y antioxidantes. Este es solo un diagn�stico predeterminado l�gico, haberlo      " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas      " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en      " +
                                                  "\n el tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo    " +
                                                  "\n se le recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n La gonorrea es una infecci�n bacteriana de transmisi�n sexual causada por Neisseria gonorrhoeae, que puede afectar          " +
                                                  "\n el tracto genital, rectal o far�ngeo. En mujeres mayores, puede pasar desapercibida o confundirse con otras afecciones.     " +
                                                  "\n EJERCICIO. Se recomienda actividad f�sica ligera como caminatas o estiramientos suaves, evitando esfuerzos intensos         " +
                                                  "\n durante el tratamiento para no comprometer el sistema inmunol�gico. HIDRATACI�N. Es fundamental consumir entre 2 y 2.5      " +
                                                  "\n litros de agua al d�a para facilitar la eliminaci�n de toxinas, mantener la funci�n renal y apoyar el proceso de            " +
                                                  "\n recuperaci�n. POSIBLE TRATAMIENTO. El tratamiento de primera l�nea consiste en una dosis �nica intramuscular de             " +
                                                  "\n ceftriaxona 500 mg. En caso de alergia o dificultad de acceso, puede utilizarse cefixima 800 mg v�a oral. Si no se          " +
                                                  "\n ha descartado coinfecci�n con clamidia, se a�ade doxiciclina 100 mg dos veces al d�a por 7 d�as. Es importante tratar       " +
                                                  "\n tambi�n a las parejas sexuales para evitar reinfecci�n. ALIMENTACI�N RECOMENDADA. Consumir alimentos que fortalezcan el     " +
                                                  "\n sistema inmunol�gico y favorezcan la recuperaci�n. Frutas como kiwi y naranja, ricas en vitamina C, que ayudan a combatir   " +
                                                  "\n infecciones, aportando hasta el 90% del requerimiento diario por cada 100 g. Verduras como br�coli y espinaca, ricas en     " +
                                                  "\n �cido f�lico, hierro y antioxidantes. Yogur natural, fuente de probi�ticos que fortalecen la flora intestinal. Carnes       " +
                                                  "\n magras, ricas en prote�nas necesarias para la regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico,      " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas  " +
                                                  "\n est�n correctas, para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el       " +
                                                  "\n tratamiento adecuado de su paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le     " +
                                                  "\n recomienda mucho consultar a su m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n EJERCICIO: Durante los brotes activos de herpes genital se recomienda evitar la actividad f�sica intensa y priorizar          " +
                                                  "\n el descanso, ya que el estr�s f�sico puede agravar los s�ntomas. Una vez que las lesiones hayan sanado, se pueden             " +
                                                  "\n retomar ejercicios suaves como caminatas lentas, yoga o estiramientos para mejorar la circulaci�n y reducir la tensi�n        " +
                                                  "\n muscular. Tambi�n es �til practicar ejercicios de respiraci�n para disminuir el estr�s, que puede ser un desencadenante       " +
                                                  "\n de nuevos brotes. HIDRATACI�N: Es fundamental consumir al menos 2.5 litros de agua al d�a para mantener la piel y las         " +
                                                  "\n mucosas hidratadas, lo que favorece la cicatrizaci�n de las lesiones. Tambi�n se recomienda el consumo de infusiones          " +
                                                  "\n con propiedades antivirales y calmantes como el t� de manzanilla o el t� verde. Una hidrataci�n adecuada ayuda a eliminar     " +
                                                  "\n toxinas y a mantener el sistema inmunol�gico en �ptimas condiciones. POSIBLE TRATAMIENTO: El tratamiento del herpes           " +
                                                  "\n genital incluye antivirales como aciclovir, valaciclovir o famciclovir, que pueden administrarse durante 7 a 10 d�as          " +
                                                  "\n en episodios iniciales o de forma continua en casos de recurrencias frecuentes. En situaciones graves o en pacientes          " +
                                                  "\n inmunocomprometidos, puede ser necesario el uso de antivirales por v�a intravenosa. Tambi�n se pueden utilizar cremas         " +
                                                  "\n anest�sicas con lidoca�na para aliviar el dolor local. ALIMENTACI�N: Se recomienda el consumo de alimentos que                " +
                                                  "\n fortalezcan el sistema inmunol�gico y favorezcan la regeneraci�n de tejidos, tales como frutas c�tricas como naranjas         " +
                                                  "\n y toronjas, que aportan vitamina C en un 89% de la ingesta diaria recomendada. Yogur natural, que contiene probi�ticos        " +
                                                  "\n que equilibran la flora vaginal y fortalecen las defensas. Verduras de hoja verde como espinacas y acelgas, que aportan       " +
                                                  "\n hasta un 50% de la ingesta diaria recomendada de vitamina A y K, esenciales para la regeneraci�n celular. Ajo y cebolla,      " +
                                                  "\n que contienen compuestos sulfurados con propiedades antivirales y antioxidantes, contribuyendo con hasta un 40% de la         " +
                                                  "\n ingesta diaria recomendada de estos nutrientes. este es solo un diagn�stico predeterminado l�gico. haberlo consultado         " +
                                                  "\n no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. se             " +
                                                  "\n recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su salud, si la        " +
                                                  "\n respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu           " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n EJERCICIO: Durante el tratamiento de la s�filis se recomienda evitar esfuerzos f�sicos intensos, especialmente si hay   " +
                                                  "\n s�ntomas como fiebre, fatiga o lesiones cut�neas. Una vez estabilizada la condici�n, se pueden realizar ejercicios      " +
                                                  "\n suaves como caminatas o estiramientos para mejorar la circulaci�n y apoyar el sistema inmunol�gico. HIDRATACI�N: Es     " +
                                                  "\n esencial consumir entre 2 y 2.5 litros de agua al d�a para facilitar la eliminaci�n de toxinas y apoyar la funci�n      " +
                                                  "\n renal durante el tratamiento antibi�tico. Tambi�n se recomienda el consumo de infusiones como t� de diente de le�n      " +
                                                  "\n o manzanilla, que ayudan a depurar el organismo y calmar el sistema digestivo. POSIBLE TRATAMIENTO: El tratamiento      " +
                                                  "\n est�ndar para la s�filis en etapas primaria, secundaria o latente precoz es una inyecci�n intramuscular �nica de        " +
                                                  "\n penicilina G benzatina (2.4 millones de unidades). En casos de s�filis latente tard�a o terciaria, se administran       " +
                                                  "\n tres dosis semanales consecutivas. Para personas al�rgicas a la penicilina, se pueden usar doxiciclina o ceftriaxona.   " +
                                                  "\n Es fundamental completar el tratamiento y realizar seguimiento serol�gico para confirmar la curaci�n. ALIMENTACI�N:     " +
                                                  "\n Se recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico y favorezcan la regeneraci�n celular,     " +
                                                  "\n tales como frutas como kiwi y fresas, que aportan vitamina C en un 90% de la ingesta diaria recomendada. Verduras       " +
                                                  "\n como br�coli y zanahorias, que contienen vitamina A y antioxidantes, aportando hasta un 50% de la ingesta diaria        " +
                                                  "\n recomendada. Frutos secos como almendras y nueces, que contienen vitamina E y zinc, contribuyendo con hasta un 40%      " +
                                                  "\n de la ingesta diaria recomendada de estos nutrientes esenciales para la reparaci�n celular. este es solo un diagn�stico " +
                                                  "\n predeterminado l�gico. haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las         " +
                                                  "\n respuestas sean completamente correctas. se recomienda realizar m�s de un diagn�stico para mayor seguridad en el        " +
                                                  "\n tratamiento adecuado. adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda     " +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");   
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n EJERCICIO: Durante el tratamiento de la tuberculosis se recomienda realizar actividad f�sica moderada como caminatas     " +
                                                  "\n suaves o ejercicios de respiraci�n para mejorar la capacidad pulmonar y reducir la fatiga. Es importante evitar el       " +
                                                  "\n esfuerzo f�sico excesivo, especialmente en las primeras semanas de tratamiento. La fisioterapia respiratoria puede       " +
                                                  "\n ser de gran ayuda para mejorar la oxigenaci�n y la funci�n pulmonar. HIDRATACI�N: Es crucial consumir al menos 2.5       " +
                                                  "\n litros de agua al d�a para mantener las mucosas hidratadas, facilitar la expectoraci�n y apoyar la funci�n renal         " +
                                                  "\n durante el tratamiento prolongado con antibi�ticos. Tambi�n se recomienda el consumo de caldos naturales, infusiones     " +
                                                  "\n suaves y jugos naturales sin az�car para aportar l�quidos y micronutrientes esenciales. POSIBLE TRATAMIENTO: El          " +
                                                  "\n tratamiento est�ndar para la tuberculosis activa incluye una combinaci�n de antibi�ticos como isoniazida, rifampicina,   " +
                                                  "\n pirazinamida y etambutol durante al menos 6 meses. Es fundamental seguir el esquema completo sin interrupciones para     " +
                                                  "\n evitar reca�das o resistencia bacteriana. En casos de tuberculosis resistente, se utilizan medicamentos de segunda       " +
                                                  "\n l�nea y el tratamiento puede extenderse hasta 18 meses. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos        " +
                                                  "\n en prote�nas, vitaminas y minerales para fortalecer el sistema inmunol�gico y apoyar la regeneraci�n pulmonar, tales     " +
                                                  "\n como carnes magras y legumbres, que aportan prote�nas de alta calidad. Frutas como guayaba y papaya, que contienen       " +
                                                  "\n vitamina C en un 90% de la ingesta diaria recomendada, ayudando a combatir infecciones. Verduras como espinacas y        " +
                                                  "\n br�coli, que aportan hierro, vitamina A y �cido f�lico, esenciales para la producci�n de gl�bulos rojos y la reparaci�n  " +
                                                  "\n celular. Frutos secos como nueces y semillas de girasol, que contienen vitamina E y selenio, contribuyendo con hasta     " +
                                                  "\n un 40% de la ingesta diaria recomendada de estos antioxidantes. este es solo un diagn�stico predeterminado l�gico.       " +
                                                  "\n haberlo consultado no garantiza al 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente   " +
                                                  "\n correctas. se recomienda realizar m�s de un diagn�stico para mayor seguridad en el tratamiento adecuado. adem�s, por su  " +
                                                  "\n salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N: Para el tratamiento de la artritis es fundamental mantener una hidrataci�n adecuada con un consumo diario     " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para favorecer la lubricaci�n de      " +
                                                  "\n las articulaciones y reducir la rigidez matutina. EJERCICIO: Se recomienda actividad f�sica regular y de bajo impacto      " +
                                                  "\n como caminatas suaves nataci�n o ejercicios de estiramiento para mantener la movilidad articular y fortalecer los          " +
                                                  "\n m�sculos que rodean las articulaciones. Tambi�n se sugiere la pr�ctica de ejercicios espec�ficos de fisioterapia           " +
                                                  "\n articular y t�cnicas de relajaci�n como el yoga adaptado. POSIBLE TRATAMIENTO: El tratamiento puede incluir medicamentos   " +
                                                  "\n antiinflamatorios no esteroideos como el ibuprofeno o el naproxeno para aliviar el dolor y la inflamaci�n adem�s de        " +
                                                  "\n f�rmacos modificadores de la enfermedad como el metotrexato o la sulfasalazina. En algunos casos se utilizan               " +
                                                  "\n corticosteroides o terapias biol�gicas como los inhibidores del TNF. Es fundamental seguir el tratamiento indicado         " +
                                                  "\n por el reumat�logo y realizar controles peri�dicos. ALIMENTOS RECOMENDADOS: Para reducir la inflamaci�n y proteger         " +
                                                  "\n las articulaciones se recomienda el consumo de PESCADOS GRASOS: Como el salm�n y la sardina ricos en �cidos grasos         " +
                                                  "\n Omega-3 que aportan aproximadamente el 50% de la ingesta diaria recomendada por cada 100 gramos. FRUTOS SECOS: Como        " +
                                                  "\n nueces y almendras que contienen vitamina E y grasas saludables con un aporte del 35% de la ingesta diaria recomendada     " +
                                                  "\n por cada 30 gramos. ESPINACAS Y BR�COLI: Ricos en antioxidantes vitamina A y vitamina K esenciales para la salud �sea      " +
                                                  "\n y articular con un aporte del 56% de la ingesta diaria recomendada por cada 100 gramos. C�RCUMA: Contiene curcumina        " +
                                                  "\n con propiedades antiinflamatorias naturales. Este es solo un diagn�stico predeterminado l�gico haberlo consultado no       " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello       " +
                                                  "\n se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su      " +
                                                  "\n paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar     " +
                                                  "\n a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
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
                                                  "\n de la enfermedad. Tambi�n se pueden utilizar broncodilatadores y humidificadores para aliviar la tos. Es importante       " +
                                                  "\n evitar el uso de medicamentos para la tos sin prescripci�n m�dica. ALIMENTOS RECOMENDADOS: Para fortalecer el sistema     " +
                                                  "\n respiratorio se recomienda el consumo de NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a reducir la duraci�n de      " +
                                                  "\n los s�ntomas aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos. JENGIBRE: Con         " +
                                                  "\n propiedades antiinflamatorias que pueden aliviar la irritaci�n de garganta. MIEL Y LIM�N: Combinaci�n efectiva para       " +
                                                  "\n calmar la tos y suavizar la garganta aportando flavonoides y vitamina C. ESPINACAS Y BR�COLI: Aportan antioxidantes       " +
                                                  "\n y vitamina A esenciales para la regeneraci�n celular con un contenido de aproximadamente 56% de la ingesta diaria         " +
                                                  "\n recomendada por cada 100 gramos. Este es solo un diagn�stico predeterminado l�gico haberlo consultado no garantiza al     " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas para ello se recomienda     " +
                                                  "\n hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente adem�s   " +
                                                  "\n por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico        " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: Para el tratamiento de las paperas es fundamental mantener una hidrataci�n adecuada con un consumo diario     " +
                                                  "\n recomendado de 2 a 2.5 litros de agua aproximadamente 8 a 10 vasos de tama�o regular para prevenir la deshidrataci�n y     " +
                                                  "\n aliviar la inflamaci�n de las gl�ndulas salivales. EJERCICIO: Se recomienda reposo durante la fase aguda y posteriormente  " +
                                                  "\n actividad f�sica ligera como estiramientos suaves y caminatas cortas para recuperar energ�a sin forzar el sistema          " +
                                                  "\n inmunol�gico. POSIBLE TRATAMIENTO: No existe un tratamiento antiviral espec�fico para las paperas. El manejo es            " +
                                                  "\n sintom�tico e incluye el uso de analg�sicos como el paracetamol o el ibuprofeno para reducir el dolor y la fiebre          " +
                                                  "\n adem�s de compresas fr�as en las gl�ndulas inflamadas y aislamiento durante al menos cinco d�as desde el inicio de         " +
                                                  "\n los s�ntomas. ALIMENTOS RECOMENDADOS: Para aliviar los s�ntomas y fortalecer el sistema inmunol�gico se recomienda el      " +
                                                  "\n consumo de SOPAS Y CALDOS: F�ciles de tragar y nutritivos. NARANJAS Y GUAYABAS: Ricas en vitamina C que ayuda a reducir    " +
                                                  "\n la duraci�n de los s�ntomas aportando aproximadamente el 89% de la ingesta diaria recomendada por cada 100 gramos.         " +
                                                  "\n JENGIBRE: Con propiedades antiinflamatorias que pueden aliviar el malestar general. ESPINACAS Y BR�COLI: Aportan           " +
                                                  "\n antioxidantes y vitamina A esenciales para la regeneraci�n celular con un contenido de aproximadamente 56% de la ingesta   " +
                                                  "\n diaria recomendada por cada 100 gramos. YOGUR NATURAL: Contiene probi�ticos que fortalecen el sistema inmunol�gico y       " +
                                                  "\n mejoran la salud digestiva aportando calcio y prote�nas esenciales. Este es solo un diagn�stico predeterminado l�gico      " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente     " +
                                                  "\n correctas para ello se recomienda hacer m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento " +
                                                  "\n adecuado de su paciente adem�s por su salud si la respuesta del Diagn�stico no le satisface del todo se le recomienda      " +
                                                  "\n mucho consultar a su m�dico Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 a 3 litros de agua al d�a (diez a doce vasos de agua de tama�o regular) para      " +
                                                  "\n prevenir la deshidrataci�n causada por fiebre, sudoraci�n y p�rdida de apetito. En mujeres adultas mayores, una hidrataci�n    " +
                                                  "\n constante tambi�n ayuda a mantener la funci�n renal y reducir el riesgo de complicaciones neurol�gicas. EJERCICIO: Durante     " +
                                                  "\n la fase aguda se recomienda reposo absoluto. Una vez superados los s�ntomas, se puede retomar actividad f�sica ligera como     " +
                                                  "\n caminatas suaves o ejercicios de estiramiento para mejorar la circulaci�n y el estado de �nimo. POSIBLE TRATAMIENTO: No        " +
                                                  "\n existe un antiviral espec�fico para el virus del Zika. El tratamiento es sintom�tico e incluye Paracetamol para la fiebre      " +
                                                  "\n y el dolor, antihistam�nicos para el prurito y reposo. Se debe evitar el uso de aspirina o AINEs hasta descartar dengue,       " +
                                                  "\n por riesgo de hemorragias. Tambi�n se recomienda el uso de repelentes y mosquiteros para evitar nuevas picaduras. En mujeres      " +
                                                  "\n adultas mayores, es importante vigilar signos de complicaciones neurol�gicas como debilidad muscular o alteraciones sensoriales.  " +
                                                  "\n ALIMENTACI�N: Se sugiere una dieta rica en antioxidantes y nutrientes inmunoestimulantes como: Naranjas (con vitamina C, 89%      " +
                                                  "\n por cada 100 g); Kiwi (con vitamina C y potasio, 92% y 7% respectivamente); Aguacate (con vitamina E, 14% por cada 100 g);        " +
                                                  "\n Zanahorias (con vitamina A, 93% por cada 100 g); y Jengibre (con compuestos antiinflamatorios y antivirales naturales).           " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente tenga esta             " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un Diagn�stico            " +
                                                  "\n de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta del diagn�stico      " +
                                                  "\n no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app (Mi Vida) y espera      " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 3 litros de agua al d�a (doce vasos de agua de tama�o regular), incluyendo      " +
                                                  "\n soluciones de rehidrataci�n oral para reponer electrolitos perdidos por diarrea y v�mitos. En mujeres adultas mayores,   " +
                                                  "\n la deshidrataci�n puede ser m�s severa, por lo que se debe vigilar la frecuencia urinaria y el estado de conciencia.     " +
                                                  "\n EJERCICIO: Durante la fase aguda se recomienda reposo absoluto. Una vez superados los s�ntomas, se puede retomar         " +
                                                  "\n actividad f�sica ligera para recuperar energ�a y mejorar la digesti�n. POSIBLE TRATAMIENTO: No existe un tratamiento     " +
                                                  "\n antiviral espec�fico. El manejo es sintom�tico y se enfoca en rehidrataci�n intensiva, control de la fiebre con          " +
                                                  "\n Paracetamol y dieta astringente. No se recomiendan antidiarreicos como la loperamida. En casos graves, puede requerirse  " +
                                                  "\n hospitalizaci�n para administraci�n de l�quidos intravenosos. Tambi�n se sugiere el uso de probi�ticos para restaurar la " +
                                                  "\n flora intestinal. ALIMENTACI�N: Se recomienda una dieta suave y rica en nutrientes como: Pl�tanos (con potasio, 23% por  " +
                                                  "\n cada 100 g); Arroz blanco (f�cil digesti�n y fuente de energ�a); Manzanas cocidas (con pectina, que regula el tr�nsito   " +
                                                  "\n intestinal); Zanahorias cocidas (con vitamina A, 93% por cada 100 g); y Yogur natural (con probi�ticos y calcio, 30% por " +
                                                  "\n cada 100 g). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que la paciente  " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un    " +
                                                  "\n Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Adem�s, por su salud, si la respuesta " +
                                                  "\n del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes agradece tu visita a la app" +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N: Se recomienda el consumo de 2.5 a 3 litros de agua al d�a (diez a doce vasos de agua de tama�o regular)     " +
                                                  "\n para apoyar la funci�n renal, facilitar la eliminaci�n de toxinas y mantener el equilibrio electrol�tico. En mujeres     " +
                                                  "\n adultas mayores, una hidrataci�n adecuada tambi�n ayuda a prevenir la hipotensi�n y la fatiga asociadas a la infecci�n.  " +
                                                  "\n EJERCICIO: Durante la fase aguda se recomienda reposo absoluto. Una vez estabilizada, se puede retomar actividad f�sica  " +
                                                  "\n ligera como caminatas suaves para mejorar la circulaci�n y reducir la rigidez muscular. POSIBLE TRATAMIENTO: El          " +
                                                  "\n tratamiento incluye antibi�ticos intravenosos como Ampicilina o Penicilina G, frecuentemente combinados con Gentamicina  " +
                                                  "\n en casos graves. En mujeres adultas mayores, se debe ajustar la dosis seg�n la funci�n renal y monitorear signos de      " +
                                                  "\n meningitis o septicemia. Tambi�n se recomienda evitar alimentos de alto riesgo como quesos blandos no pasteurizados,     " +
                                                  "\n embutidos y pescados ahumados. ALIMENTACI�N: Se sugiere una dieta rica en nutrientes inmunoestimulantes como: Espinacas  " +
                                                  "\n (con vitamina A y hierro, 56% y 15% por cada 100 g); Ajo (con propiedades antibacterianas naturales); Zanahorias (con    " +
                                                  "\n vitamina A, 93% por cada 100 g); Frutas c�tricas (con vitamina C, 89% por cada 100 g); y Yogur natural (con probi�ticos  " +
                                                  "\n y calcio, 30% por cada 100 g). Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al     " +
                                                  "\n 100% que la paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda  " +
                                                  "\n realizar m�s de un Diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado. Adem�s, por su     " +
                                                  "\n salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. �ngel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidrataci�n     " +
                                                  "\n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Durante la        " +
                                                  "\n fase aguda se recomienda reposo absoluto para evitar complicaciones gastrointestinales. Una vez superada esta etapa,        " +
                                                  "\n se pueden incorporar caminatas suaves de 15 a 20 minutos al d�a, ejercicios de movilidad articular y respiraci�n            " +
                                                  "\n profunda para estimular la circulaci�n y la recuperaci�n intestinal. Tambi�n es �til realizar estiramientos suaves          " +
                                                  "\n para reducir la rigidez muscular. HIDRATACI�N. Se aconseja consumir entre 2.5 y 3 litros de agua al d�a para prevenir       " +
                                                  "\n la deshidrataci�n causada por la diarrea. Tambi�n se recomienda el uso de soluciones de rehidrataci�n oral, caldos          " +
                                                  "\n naturales y jugos suaves sin az�car a�adida. Se deben evitar bebidas con cafe�na, alcohol o alto contenido de az�car,       " +
                                                  "\n ya que pueden empeorar los s�ntomas. POSIBLE TRATAMIENTO. El tratamiento para la shigelosis incluye reposo, rehidrataci�n   " +
                                                  "\n y en casos severos, antibi�ticos como ciprofloxacino o azitromicina. Marcas reconocidas incluyen Ciproxin y Zitromax.       " +
                                                  "\n No se deben usar medicamentos antidiarreicos como loperamida, ya que pueden agravar la infecci�n. ALIMENTACI�N RECOMENDADA. " +
                                                  "\n Se recomienda una dieta blanda, baja en fibra y rica en nutrientes esenciales. Algunos alimentos clave incluyen arroz       " +
                                                  "\n blanco y pur� de papa, que son f�ciles de digerir y ayudan a estabilizar el sistema digestivo. Yogur natural, fuente        " +
                                                  "\n de probi�ticos que ayudan a restaurar la flora intestinal. Pl�tano, rico en potasio, que ayuda a reponer electrolitos       " +
                                                  "\n perdidos, aportando el 10% del requerimiento diario por cada 100 gramos. Zanahoria cocida, rica en vitamina A, que          " +
                                                  "\n fortalece las mucosas intestinales, con un aporte del 15% del requerimiento diario por cada 100 gramos. Este diagn�stico    " +
                                                  "\n es una referencia l�gica basada en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga shigelosis ni        " +
                                                  "\n que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para mayor         " +
                                                  "\n seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidrataci�n   " +
                                                  "\n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda   " +
                                                  "\n actividad f�sica moderada como caminatas diarias de 30 minutos, ejercicios de respiraci�n profunda y yoga terap�utico     " +
                                                  "\n para fortalecer los pulmones y reducir la disnea. Tambi�n es �til realizar ejercicios de fortalecimiento muscular con     " +
                                                  "\n bandas el�sticas y t�cnicas de expansi�n tor�cica para mejorar la capacidad pulmonar. HIDRATACI�N. Se aconseja consumir   " +
                                                  "\n entre 2.5 y 3 litros de agua al d�a para mantener las v�as respiratorias hidratadas, facilitar la eliminaci�n de          " +
                                                  "\n secreciones y apoyar la funci�n renal. Tambi�n se recomienda el consumo de infusiones tibias como manzanilla o jengibre   " +
                                                  "\n para aliviar la irritaci�n bronquial. POSIBLE TRATAMIENTO. El tratamiento para la EPOC incluye broncodilatadores de       " +
                                                  "\n acci�n corta como salbutamol (Ventolin, Aerolin), corticosteroides inhalados como fluticasona o budesonida (Flixotide,    " +
                                                  "\n Pulmicort) y en algunos casos, anticolin�rgicos de acci�n prolongada como tiotropio (Spiriva). Tambi�n se recomienda      " +
                                                  "\n la rehabilitaci�n pulmonar y el uso adecuado de inhaladores. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica       " +
                                                  "\n en antioxidantes, prote�nas y grasas saludables. Algunos alimentos clave incluyen pescados grasos como salm�n y at�n,     " +
                                                  "\n ricos en omega-3, que reducen la inflamaci�n pulmonar, aportando el 70% del requerimiento diario por cada 100 gramos.     " +
                                                  "\n Frutas como naranja, kiwi y papaya, ricas en vitamina C, que fortalecen el sistema inmune, con un aporte del 89% del      " +
                                                  "\n requerimiento diario por cada 100 gramos. Verduras como espinaca y br�coli, ricas en vitamina A y �cido f�lico, que       " +
                                                  "\n protegen las mucosas respiratorias, con un aporte del 15% del requerimiento diario por cada 100 gramos. Frutos secos      " +
                                                  "\n como almendras y nueces, ricos en vitamina E y �cidos grasos esenciales, con un aporte del 37% del requerimiento          " +
                                                  "\n diario por cada 28 gramos. Este diagn�stico es una referencia l�gica basada en informaci�n m�dica, pero no garantiza      " +
                                                  "\n al 100% que el paciente tenga EPOC ni que el tratamiento sea el adecuado. Se recomienda realizar m�s de un diagn�stico    " +
                                                  "\n y consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n Para una mujer adulta mayor con esta enfermedad es fundamental seguir un tratamiento adecuado, mantener una hidrataci�n      " +
                                                  "\n �ptima, realizar actividad f�sica adaptada y consumir una dieta rica en nutrientes esenciales. EJERCICIO. Se recomienda      " +
                                                  "\n actividad f�sica moderada como caminatas suaves, yoga o ejercicios de movilidad durante 30 minutos al d�a para mejorar       " +
                                                  "\n la circulaci�n, reducir el estr�s y fortalecer el sistema inmunol�gico. Tambi�n es �til realizar ejercicios de respiraci�n   " +
                                                  "\n y relajaci�n para apoyar el bienestar general. HIDRATACI�N. Se aconseja consumir entre 2 y 2.5 litros de agua al d�a para    " +
                                                  "\n facilitar la eliminaci�n de toxinas, apoyar la funci�n renal y mantener las mucosas hidratadas. Tambi�n se recomienda el     " +
                                                  "\n consumo de infusiones suaves como manzanilla o menta para aliviar molestias urinarias. POSIBLE TRATAMIENTO. El tratamiento   " +
                                                  "\n para la clamidia incluye antibi�ticos como azitromicina en dosis �nica o doxiciclina durante 7 d�as. Marcas reconocidas      " +
                                                  "\n incluyen Zitromax y Vibramycin. Es fundamental completar el tratamiento y tratar tambi�n a la pareja sexual para evitar      " +
                                                  "\n reinfecci�n. ALIMENTACI�N RECOMENDADA. Se recomienda una dieta rica en antioxidantes, lisina y vitaminas del complejo B.     " +
                                                  "\n Algunos alimentos clave incluyen yogur natural y leche, ricos en lisina, que inhibe la replicaci�n bacteriana. Frutas        " +
                                                  "\n como naranja, kiwi y papaya, ricas en vitamina C, que fortalecen el sistema inmune, con un aporte del 89% del requerimiento  " +
                                                  "\n diario por cada 100 gramos. Verduras como espinaca y zanahoria, ricas en vitamina A y �cido f�lico, que favorecen la         " +
                                                  "\n regeneraci�n celular y fortalecen las mucosas, con un aporte del 15% del requerimiento diario por cada 100 gramos.           " +
                                                  "\n Frutos secos como almendras y nueces, ricos en vitamina E y �cidos grasos esenciales, que protegen las c�lulas inmunol�gicas," +
                                                  "\n con un aporte del 37% del requerimiento diario por cada 28 gramos. Este diagn�stico es una referencia l�gica basada     " +
                                                  "\n en informaci�n m�dica, pero no garantiza al 100% que el paciente tenga clamidia ni que el tratamiento sea el adecuado.  " +
                                                  "\n Se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para mayor seguridad. Angel L Montes agradece tu   " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n La meningitis bacteriana es una infecci�n grave que inflama las membranas que rodean el cerebro y la m�dula espinal.        " +
                                                  "\n En la adultez mayor, puede presentarse con s�ntomas at�picos como confusi�n, somnolencia o p�rdida de apetito, lo que       " +
                                                  "\n dificulta su diagn�stico temprano. EJERCICIO. Se recomienda actividad f�sica muy ligera durante la fase de recuperaci�n,    " +
                                                  "\n como estiramientos suaves o caminatas cortas en ambientes tranquilos, evitando cualquier esfuerzo que pueda aumentar la     " +
                                                  "\n presi�n intracraneal o la fatiga. HIDRATACI�N. Es fundamental consumir entre 2.5 y 3 litros de agua al d�a para mantener    " +
                                                  "\n el equilibrio de l�quidos, apoyar la funci�n renal y facilitar la eliminaci�n de toxinas. Tambi�n se recomienda el consumo  " +
                                                  "\n de caldos suaves o infusiones tibias para mantener la hidrataci�n sin irritar el sistema digestivo. POSIBLE TRATAMIENTO.    " +
                                                  "\n El tratamiento incluye antibi�ticos intravenosos de amplio espectro como ceftriaxona o vancomicina, ajustados seg�n el      " +
                                                  "\n agente causal identificado. En algunos casos se administra dexametasona como antiinflamatorio adyuvante para reducir el     " +
                                                  "\n riesgo de da�o neurol�gico. Es crucial iniciar el tratamiento lo antes posible para evitar complicaciones graves.           " +
                                                  "\n ALIMENTACI�N RECOMENDADA. Consumir alimentos ricos en vitaminas del complejo B, antioxidantes y prote�nas para apoyar la    " +
                                                  "\n recuperaci�n neurol�gica. Huevo cocido, fuente de vitamina B12 y colina, esenciales para la funci�n cerebral. Espinaca,     " +
                                                  "\n rica en �cido f�lico y hierro, que favorecen la oxigenaci�n cerebral, aportando hasta el 20% del requerimiento diario de    " +
                                                  "\n hierro por cada 100 g. Frutas como pl�tano y manzana, que aportan potasio y fibra soluble, ayudando a mantener el           " +
                                                  "\n equilibrio electrol�tico y la digesti�n. Yogur natural, fuente de probi�ticos que fortalecen la flora intestinal y el       " +
                                                  "\n sistema inmune. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente  " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para ello se recomienda hacer m�s de    " +
                                                  "\n un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su paciente, adem�s por su salud    " +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a su m�dico, �ngel L Montes       " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n La paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadFemenino +
                                                  "\n con estatura entre " + EstaturaFemenino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n El c�ncer es un conjunto de enfermedades caracterizadas por el crecimiento descontrolado de c�lulas anormales que pueden       " +
                                                  "\n invadir tejidos y �rganos. En la adultez mayor, el tratamiento debe adaptarse a la condici�n f�sica general, comorbilidades    " +
                                                  "\n y tipo de c�ncer. EJERCICIO. Se recomienda actividad f�sica moderada y personalizada, como caminatas, ejercicios de            " +
                                                  "\n resistencia con bandas el�sticas o yoga suave, que ayudan a mantener la masa muscular, mejorar el estado de �nimo y reducir    " +
                                                  "\n la fatiga asociada al tratamiento. HIDRATACI�N. Es fundamental consumir entre 2.5 y 3 litros de agua al d�a para apoyar la     " + 
                                                  "\n funci�n renal, especialmente durante la quimioterapia o radioterapia, y facilitar la eliminaci�n de toxinas. Tambi�n se        " +
                                                  "\n recomienda el consumo de l�quidos ricos en electrolitos si hay v�mitos o diarrea. POSIBLE TRATAMIENTO. El tratamiento puede    " +
                                                  "\n incluir cirug�a, quimioterapia, radioterapia, inmunoterapia o terapia hormonal, dependiendo del tipo y estadio del c�ncer.     " +
                                                  "\n En adultos mayores, se prioriza un enfoque individualizado que equilibre eficacia y calidad de vida. Medicamentos como         " +
                                                  "\n letrozol, capecitabina o pembrolizumab pueden ser considerados seg�n el caso. ALIMENTACI�N RECOMENDADA. Consumir alimentos     " +
                                                  "\n ricos en antioxidantes, prote�nas y vitaminas para fortalecer el sistema inmunol�gico y prevenir la p�rdida de peso. Frutas    " +
                                                  "\n como papaya y guayaba, ricas en vitamina C, que fortalecen las defensas, aportando hasta el 200% del requerimiento diario por  " +
                                                  "\n cada 100 g. Carnes magras y huevos, fuentes de prote�nas de alta calidad, esenciales para la regeneraci�n celular. Verduras    " +
                                                  "\n como br�coli y zanahoria, ricas en vitamina A, �cido f�lico y antioxidantes. Yogur natural, fuente de probi�ticos que mejoran  " +
                                                  "\n la flora intestinal y la absorci�n de nutrientes. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no     " +
                                                  "\n garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas est�n correctas, para     " +
                                                  "\n ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mejor seguridad en el tratamiento adecuado de su     " +
                                                  "\n paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se le recomienda mucho consultar a su   " +
                                                  "\n m�dico, �ngel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                    }
                }
             if (EdadFemenino.equals("Adultez Mayor = 60 - 74 a�os")) {
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