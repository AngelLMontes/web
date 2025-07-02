import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Estudio4 implements ActionListener{
    
  
         private final JLabel label1;
         private JScrollPane scrollpane1;
         private JTextArea textarea1;
         private JFrame frame;
         private final String edadEsperada = "Juventud = 22-29 a�os";
         private String edadRecibida;
         
        public Estudio4(String nombrePaciente, String Sexo, String EdadMasculino,
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
                 if(EdadMasculino.equals("Juventud = 22-29 a�os")){
                        if(EstaturaMasculino.equals("0.90-1.35 m")){
                              if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza (gripe)." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos de tama�o regular,   " +
                                                  "\n para prevenir la deshidrataci�n causada por fiebre y sudoraci�n. Tambi�n se recomienda el consumo de infusiones calientes" +
                                                  "\n como t� de jengibre y agua con miel, que ayudan a aliviar la irritaci�n de la garganta y fortalecen el sistema inmunol�gico." +
                                                  "\n EJERCICIO: La actividad f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el descanso absoluto y evitando " +
                                                  "\n esfuerzos que puedan agravar la fatiga. POSIBLE TRATAMIENTO: Se recomienda el uso de antivirales como oseltamivir y baloxavir," +
                                                  "\n que pueden reducir la duraci�n y gravedad de la enfermedad si se administran en las primeras 48 horas. Marcas reconocidas     " +
                                                  "\n incluyen Tamiflu y Xofluza. En casos graves se pueden administrar antipir�ticos como paracetamol para controlar la fiebre     " +
                                                  "\n y mejorar el bienestar del paciente. ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico. Naranjas (por cada 100 gramos aproximadamente 53 mg de vitamina C, cubriendo" +
                                                  "\n el 59% de la ingesta diaria recomendada) y fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de " +
                                                  "\n la ingesta diaria recomendada). Tambi�n se sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y ayuda a    " +
                                                  "\n aliviar el malestar general. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el  " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda" +
                                                  "\n hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su " +
                                                  "\n salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu " +
                                                  "\n visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos de tama�o regular,   " +
                                                  "\n para prevenir la deshidrataci�n causada por fiebre intensa y dificultad respiratoria. Tambi�n se recomienda el consumo de    " +
                                                  "\n infusiones calientes como t� de eucalipto, que ayuda a despejar las v�as respiratorias y mejorar la oxigenaci�n.             " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el descanso absoluto y evitando  " +
                                                  "\n esfuerzos que puedan agravar la fatiga respiratoria. POSIBLE TRATAMIENTO: El tratamiento de la Neumon�a se basa en el uso de " +
                                                  "\n antibi�ticos, siendo la amoxicilina y la azitromicina opciones altamente eficaces para eliminar la infecci�n y reducir la    " +
                                                  "\n inflamaci�n pulmonar. Marcas reconocidas incluyen Amoxil y Zithromax. En casos graves se pueden administrar terapias de      " +
                                                  "\n ox�geno para mejorar la oxigenaci�n del paciente. ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes " +
                                                  "\n y vitamina C, esenciales para fortalecer el sistema inmunol�gico. Naranjas (por cada 100 gramos aproximadamente 53 mg de     " +
                                                  "\n vitamina C, cubriendo el 59% de la ingesta diaria recomendada) y fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C," +
                                                  "\n cubriendo el 65% de la ingesta diaria recomendada). Tambi�n se sugiere el consumo de jengibre, que posee propiedades         " +
                                                  "\n antiinflamatorias y ayuda a aliviar la congesti�n pulmonar. Este es solo un diagn�stico predeterminado l�gico, haberlo       " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean      " +
                                                  "\n completamente correctas. Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad      " +
                                                  "\n en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo,   " +
                                                  "\n se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos de tama�o regular,   " +
                                                  "\n para ayudar a mantener el equilibrio de glucosa en sangre y prevenir la deshidrataci�n causada por la micci�n frecuente.     " +
                                                  "\n Tambi�n se recomienda el consumo de infusiones sin az�car y agua con lim�n, que contribuyen a la regulaci�n metab�lica.      " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la capacidad del paciente, priorizando ejercicios aer�bicos    " +
                                                  "\n como caminatas, ciclismo y nataci�n durante al menos 30 a 60 minutos al d�a, lo que ayuda a mejorar la sensibilidad a la     " +
                                                  "\n insulina y controlar los niveles de glucosa. POSIBLE TRATAMIENTO: El tratamiento de la Diabetes var�a seg�n el tipo, pero    " +
                                                  "\n puede incluir insulina en el caso de diabetes tipo 1 y medicamentos orales como la metformina en el caso de diabetes tipo 2. " +
                                                  "\n Marcas reconocidas incluyen Humalog, Lantus y Glucophage. En algunos casos se pueden administrar inhibidores de SGLT2 para   " +
                                                  "\n mejorar la eliminaci�n de glucosa a trav�s de la orina. ALIMENTACION: Se recomienda el consumo de alimentos ricos en fibra   " +
                                                  "\n y prote�nas, esenciales para estabilizar los niveles de glucosa en sangre. Avena (por cada 100 gramos aproximadamente 10     " +
                                                  "\n gramos de fibra, cubriendo el 40% de la ingesta diaria recomendada) y almendras (por cada 100 gramos aproximadamente 25 mg   " +
                                                  "\n de vitamina E, cubriendo el 166% de la ingesta diaria recomendada). Tambi�n se sugiere el consumo de yogur natural, que      " +
                                                  "\n aporta probi�ticos beneficiosos para la salud intestinal y la regulaci�n metab�lica. Este es solo un diagn�stico predeterminado" +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus      " +
                                                  "\n respuestas sean completamente correctas. Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer      " +
                                                  "\n mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le       " +
                                                  "\n satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos de tama�o regular,      " +
                                                  "\n para ayudar a mantener la funci�n pulmonar y reducir la inflamaci�n. Tambi�n se recomienda el consumo de l�quidos con           " +
                                                  "\n propiedades antioxidantes como t� verde y agua con lim�n, que pueden mejorar la salud respiratoria. EJERCICIO: La actividad     " +
                                                  "\n f�sica debe ser moderada y adaptada a la capacidad pulmonar, priorizando ejercicios de bajo impacto como caminatas, nataci�n    " +
                                                  "\n y ejercicios de respiraci�n, que fortalecen los m�sculos respiratorios y mejoran la oxigenaci�n. POSIBLE TRATAMIENTO: El        " +
                                                  "\n tratamiento del Asma se basa en el uso de broncodilatadores y corticosteroides inhalados, siendo el salbutamol y la fluticasona " +
                                                  "\n opciones altamente eficaces para mejorar la respiraci�n y reducir la inflamaci�n. Marcas reconocidas incluyen Ventolin y        " +
                                                  "\n Flixotide. En casos avanzados se pueden administrar terapias de ox�geno para mejorar la calidad de vida del paciente.           " +
                                                  "\n ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes y �cidos grasos Omega-3, esenciales para reducir     " +
                                                  "\n la inflamaci�n pulmonar. Salm�n (por cada 100 gramos aproximadamente 2.2 gramos de Omega-3) y espinacas (por cada 100 gramos    " +
                                                  "\n aproximadamente 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada). Tambi�n se sugiere el consumo de c�rcuma," +
                                                  "\n que posee propiedades antiinflamatorias y ayuda a mejorar la funci�n pulmonar. Este es solo un diagn�stico predeterminado l�gico, " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean   " +
                                                  "\n completamente correctas. Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el     " +
                                                  "\n tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda" +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos de tama�o regular,   " +
                                                  "\n para ayudar a mantener la funci�n inmunol�gica y prevenir la deshidrataci�n causada por fiebre y efectos secundarios     " +
                                                  "\n del tratamiento. Tambi�n se recomienda el consumo de l�quidos con propiedades antioxidantes como t� verde y agua con     " +
                                                  "\n lim�n, que fortalecen el sistema inmunol�gico. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la capacidad" +
                                                  "\n del paciente, priorizando ejercicios de bajo impacto como caminatas, yoga y ejercicios de respiraci�n, que mejoran la    " +
                                                  "\n circulaci�n y reducen la fatiga. POSIBLE TRATAMIENTO: El tratamiento del VIH/SIDA se basa en el uso de antirretrovirales," +
                                                  "\n siendo el tenofovir, emtricitabina y dolutegravir opciones altamente eficaces para controlar la replicaci�n del virus y  " +
                                                  "\n mejorar la calidad de vida. Marcas reconocidas incluyen Truvada, Tivicay y Biktarvy. En algunos casos se pueden administrar" +
                                                  "\n terapias inmunomoduladoras para mejorar la respuesta del organismo. ALIMENTACION: Se recomienda el consumo de alimentos    " +
                                                  "\n ricos en antioxidantes y prote�nas, esenciales para fortalecer el sistema inmunol�gico y mantener la energ�a. Espinacas    " +
                                                  "\n (por cada 100 gramos aproximadamente 28 mg de vitamina C, cubriendo el 31% de la ingesta diaria recomendada) y zanahorias  " +
                                                  "\n (por cada 100 gramos aproximadamente 835 �g de vitamina A, cubriendo el 93% de la ingesta diaria recomendada). Tambi�n se  " +
                                                  "\n sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud intestinal y la recuperaci�n. Este  " +
                                                  "\n es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad " +
                                                  "\n y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer m�s de un diagn�stico" +
                                                  "\n de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta" +
                                                  "\n del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la      " +
                                                  "\n app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos de tama�o regular, " +
                                                  "\n para ayudar a la eliminaci�n de toxinas y prevenir molestias urinarias. Tambi�n se recomienda el consumo de l�quidos con " +
                                                  "\n propiedades antimicrobianas como agua con lim�n y infusiones de jengibre, que fortalecen el sistema inmunol�gico.        " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser moderada y adaptada a su estado de salud, priorizando ejercicios aer�bicos de bajo" +
                                                  "\n impacto como caminatas o yoga durante al menos 30 a 60 minutos al d�a, lo que ayuda a fortalecer el sistema inmunol�gico  " +
                                                  "\n sin generar estr�s excesivo en el cuerpo. POSIBLE TRATAMIENTO: El tratamiento de la Gonorrea se basa en el uso de antibi�ticos," +
                                                  "\n siendo la ceftriaxona y la azitromicina opciones altamente eficaces para eliminar la bacteria. La ceftriaxona se administra en " +
                                                  "\n una dosis �nica mientras que la azitromicina complementa el tratamiento para evitar resistencia bacteriana. Marcas reconocidas " +
                                                  "\n incluyen Rocephin y Zithromax. ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C,        " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico. Fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo " +
                                                  "\n el 65% de la ingesta diaria recomendada) y kiwis (por cada 100 gramos aproximadamente 92 mg de vitamina C, cubriendo el 102% de" +
                                                  "\n la ingesta diaria recomendada). Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud" +
                                                  "\n intestinal y la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el  " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda" +
                                                  "\n hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su " +
                                                  "\n salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu " +
                                                  "\n visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes Genital." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos de tama�o regular,    " +
                                                  "\n para ayudar a mantener la funci�n inmunol�gica y reducir la inflamaci�n. Tambi�n se recomienda el consumo de l�quidos con     " +
                                                  "\n propiedades antivirales como t� verde y agua con lim�n, que fortalecen el sistema inmunol�gico. EJERCICIO: La actividad       " +
                                                  "\n f�sica debe ser moderada y adaptada a la capacidad del paciente, priorizando ejercicios de bajo impacto como caminatas,       " +
                                                  "\n yoga y ejercicios de respiraci�n, que mejoran la circulaci�n y reducen el estr�s. POSIBLE TRATAMIENTO: El tratamiento         " +
                                                  "\n del Herpes Genital se basa en el uso de antivirales, siendo el aciclovir, valaciclovir y famciclovir opciones altamente       " +
                                                  "\n eficaces para reducir la duraci�n y gravedad de los brotes. Marcas reconocidas incluyen Zovirax, Valtrex y Famvir.            " +
                                                  "\n En algunos casos se pueden administrar terapias inmunomoduladoras para mejorar la respuesta del organismo. ALIMENTACION:      " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunol�gico." +
                                                  "\n Fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada) y kiwis   " +
                                                  "\n (por cada 100 gramos aproximadamente 92 mg de vitamina C, cubriendo el 102% de la ingesta diaria recomendada). Tambi�n se     " +
                                                  "\n sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud intestinal y la recuperaci�n.          " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa          " +
                                                  "\n enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer          " +
                                                  "\n m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Adem�s,           " +
                                                  "\n por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L          " +
                                                  "\n Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos de tama�o regular,    " +
                                                  "\n para ayudar a la eliminaci�n de toxinas y prevenir complicaciones derivadas de la infecci�n. Tambi�n se recomienda el       " +
                                                  "\n consumo de l�quidos con propiedades antimicrobianas como agua con lim�n y infusiones de jengibre, que fortalecen el         " +
                                                  "\n sistema inmunol�gico. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a su estado de salud, priorizando         " +
                                                  "\n ejercicios aer�bicos de bajo impacto como caminatas o yoga durante al menos 30 a 60 minutos al d�a, lo que ayuda a          " +
                                                  "\n fortalecer el sistema inmunol�gico sin generar estr�s excesivo en el cuerpo. POSIBLE TRATAMIENTO: El tratamiento de         " +
                                                  "\n la S�filis se basa en el uso de antibi�ticos, siendo la penicilina benzatina la opci�n m�s eficaz para eliminar la          " +
                                                  "\n bacteria. En casos de alergia a la penicilina se pueden utilizar alternativas como doxiciclina o azitromicina. Marcas       " +
                                                  "\n reconocidas incluyen Bicillin L-A y Doryx. ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes       " +
                                                  "\n y vitamina C, esenciales para fortalecer el sistema inmunol�gico. Fresas (por cada 100 gramos aproximadamente 59 mg de      " +
                                                  "\n vitamina C, cubriendo el 65% de la ingesta diaria recomendada) y kiwis (por cada 100 gramos aproximadamente 92 mg de        " +
                                                  "\n vitamina C, cubriendo el 102% de la ingesta diaria recomendada). Tambi�n se sugiere el consumo de yogur natural, que        " +
                                                  "\n aporta probi�ticos beneficiosos para la salud intestinal y la recuperaci�n. Este es solo un diagn�stico predeterminado      " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus     " +
                                                  "\n respuestas sean completamente correctas. Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer     " +
                                                  "\n mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le      " +
                                                  "\n satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos de tama�o regular,       " +
                                                  "\n para prevenir la deshidrataci�n causada por fiebre intensa y dificultad respiratoria. Tambi�n se recomienda el consumo de        " +
                                                  "\n infusiones calientes como t� de eucalipto, que ayuda a despejar las v�as respiratorias y mejorar la oxigenaci�n. EJERCICIO:      " +
                                                  "\n La actividad f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el descanso absoluto y evitando esfuerzos       " +
                                                  "\n que puedan agravar la fatiga respiratoria. POSIBLE TRATAMIENTO: El tratamiento de la Tuberculosis se basa en el uso de antibi�ticos" +
                                                  "\n de primera l�nea, siendo la isoniazida, rifampicina, pirazinamida y etambutol opciones altamente eficaces para eliminar la       " +
                                                  "\n infecci�n y reducir la inflamaci�n pulmonar. Marcas reconocidas incluyen Rifadin y Myambutol. En casos graves se pueden          " +
                                                  "\n administrar terapias de ox�geno para mejorar la oxigenaci�n del paciente. ALIMENTACION: Se recomienda el consumo de alimentos    " +
                                                  "\n ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunol�gico. Naranjas (por cada 100 gramos           " +
                                                  "\n aproximadamente 53 mg de vitamina C, cubriendo el 59% de la ingesta diaria recomendada) y fresas (por cada 100 gramos            " +
                                                  "\n aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta diaria recomendada). Tambi�n se sugiere el consumo           " +
                                                  "\n de jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar la congesti�n pulmonar. Este es solo un diagn�stico       " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la            " +
                                                  "\n enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida         " +
                                                  "\n para establecer mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del diagn�stico " +
                                                  "\n no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera       " +
                                                  "\n que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos de tama�o regular,   " +
                                                  "\n para ayudar a reducir la inflamaci�n y mantener la movilidad articular. Tambi�n se recomienda el consumo de l�quidos con     " +
                                                  "\n propiedades antiinflamatorias como t� verde y agua con c�rcuma, que fortalecen el sistema inmunol�gico. EJERCICIO: La        " +
                                                  "\n actividad f�sica debe ser moderada y adaptada a la capacidad del paciente, priorizando ejercicios de bajo impacto como       " +
                                                  "\n nataci�n, yoga y ejercicios de movilidad articular, que mejoran la flexibilidad y reducen el dolor. POSIBLE TRATAMIENTO:     " +
                                                  "\n El tratamiento de la Artritis se basa en el uso de antiinflamatorios no esteroides (AINEs) y f�rmacos modificadores de la    " +
                                                  "\n enfermedad (FAMEs), siendo el ibuprofeno, naproxeno, metotrexato y adalimumab opciones altamente eficaces para reducir la    " +
                                                  "\n inflamaci�n y mejorar la calidad de vida. Marcas reconocidas incluyen Advil, Naprosyn, Trexall y Humira. En algunos casos    " +
                                                  "\n se pueden administrar terapias biol�gicas para mejorar la respuesta del organismo. ALIMENTACION: Se recomienda el consumo    " +
                                                  "\n de alimentos ricos en antioxidantes y �cidos grasos Omega-3, esenciales para reducir la inflamaci�n articular. Salm�n (por   " +
                                                  "\n cada 100 gramos aproximadamente 2.2 gramos de Omega-3) y espinacas (por cada 100 gramos aproximadamente 28 mg de vitamina C, " +
                                                  "\n cubriendo el 31% de la ingesta diaria recomendada). Tambi�n se sugiere el consumo de c�rcuma, que posee propiedades          " +
                                                  "\n antiinflamatorias y ayuda a mejorar la funci�n articular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente     " +
                                                  "\n correctas. Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento    " +
                                                  "\n adecuado de su paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda         " +
                                                  "\n consultar a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos de tama�o regular,    " +
                                                  "\n para ayudar a mantener la funci�n pulmonar y reducir la inflamaci�n. Tambi�n se recomienda el consumo de l�quidos con     " +
                                                  "\n propiedades antimicrobianas como t� verde y agua con miel, que pueden aliviar la irritaci�n de la garganta y mejorar      " +
                                                  "\n la salud respiratoria. EJERCICIO: La actividad f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el     " +
                                                  "\n descanso absoluto y evitando esfuerzos que puedan agravar la tos y la fatiga respiratoria. POSIBLE TRATAMIENTO: El        " +
                                                  "\n tratamiento de la Tosferina se basa en el uso de antibi�ticos, siendo la azitromicina, claritromicina y eritromicina      " +
                                                  "\n opciones altamente eficaces para reducir la duraci�n y gravedad de la enfermedad. Marcas reconocidas incluyen Zithromax,  " +
                                                  "\n Biaxin y Erythrocin. En casos graves se pueden administrar terapias de ox�geno para mejorar la oxigenaci�n del paciente.  " +
                                                  "\n ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el    " +
                                                  "\n sistema inmunol�gico. Naranjas (por cada 100 gramos aproximadamente 53 mg de vitamina C, cubriendo el 59% de la ingesta   " +
                                                  "\n diaria recomendada) y fresas (por cada 100 gramos aproximadamente 59 mg de vitamina C, cubriendo el 65% de la ingesta     " +
                                                  "\n diaria recomendada). Tambi�n se sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar " +
                                                  "\n la congesti�n pulmonar. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el " +
                                                  "\n paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se    " +
                                                  "\n recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente." +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.      " +
                                                  "\n Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos de tama�o regular,    " +
                                                  "\n para ayudar a mantener la funci�n inmunol�gica y reducir la inflamaci�n. Tambi�n se recomienda el consumo de l�quidos con     " +
                                                  "\n propiedades antiinflamatorias como t� verde y agua con miel, que pueden aliviar la irritaci�n de la garganta y mejorar la     " +
                                                  "\n salud general. EJERCICIO: La actividad f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el descanso        " +
                                                  "\n absoluto y evitando esfuerzos que puedan agravar la fatiga y el malestar. POSIBLE TRATAMIENTO: El tratamiento de las Paperas  " +
                                                  "\n es principalmente sintom�tico, ya que no existe un antiviral espec�fico para la enfermedad. Se recomienda el uso de analg�sicos" +
                                                  "\n como paracetamol o ibuprofeno para reducir la fiebre y el dolor. Marcas reconocidas incluyen Tylenol y Advil. En casos de     " +
                                                  "\n inflamaci�n severa se pueden aplicar compresas fr�as o calientes en la zona afectada para aliviar el dolor. ALIMENTACION:     " +
                                                  "\n Se recomienda el consumo de alimentos suaves y ricos en antioxidantes, esenciales para fortalecer el sistema inmunol�gico.    " +
                                                  "\n Pl�tanos (por cada 100 gramos aproximadamente 358 mg de potasio, cubriendo el 10% de la ingesta diaria recomendada) y arroz   " +
                                                  "\n blanco, que es f�cil de digerir y ayuda a estabilizar el sistema digestivo. Tambi�n se sugiere el consumo de yogur natural,   " +
                                                  "\n que aporta probi�ticos beneficiosos para la salud intestinal y la recuperaci�n. Este es solo un diagn�stico predeterminado    " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus       " +
                                                  "\n respuestas sean completamente correctas. Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer       " +
                                                  "\n mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le        " +
                                                  "\n satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos de tama�o regular,     " +
                                                  "\n para prevenir la deshidrataci�n causada por fiebre y otros s�ntomas. Tambi�n se recomienda el consumo de l�quidos con      " +
                                                  "\n electrolitos naturales como agua de coco, que ayuda a mantener el equilibrio de minerales en el cuerpo. EJERCICIO: La      " +
                                                  "\n actividad f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el descanso absoluto y ejercicios de         " +
                                                  "\n respiraci�n para mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: No existe un antiviral espec�fico para el Zika, por lo       " +
                                                  "\n que el tratamiento se basa en el manejo de s�ntomas. Se recomienda el uso de analg�sicos como paracetamol para reducir     " +
                                                  "\n la fiebre y el dolor muscular. Es importante evitar el uso de aspirina y otros antiinflamatorios no esteroides hasta       " +
                                                  "\n descartar dengue para reducir el riesgo de sangrado. ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes" +
                                                  "\n y vitamina C, esenciales para fortalecer el sistema inmunol�gico. Naranjas y fresas son opciones recomendadas. Tambi�n se      " +
                                                  "\n sugiere el consumo de jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar el malestar general. Este es solo    " +
                                                  "\n un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por   " +
                                                  "\n ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida" +
                                                  "\n para establecer mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del diagn�stico" +
                                                  "\n no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos de tama�o regular,     " +
                                                  "\n para prevenir la deshidrataci�n causada por la diarrea y los v�mitos. Tambi�n se recomienda el consumo de soluciones de        " +
                                                  "\n rehidrataci�n oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos perdidos y mejorar la recuperaci�n.        " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el descanso absoluto y evitando    " +
                                                  "\n esfuerzos que puedan agravar la p�rdida de l�quidos. POSIBLE TRATAMIENTO: No existe un antiviral espec�fico para el Rotavirus, " +
                                                  "\n por lo que el tratamiento se basa en la rehidrataci�n constante. En casos graves puede requerirse administraci�n de l�quidos   " +
                                                  "\n intravenosos en un hospital para evitar complicaciones. Marcas reconocidas incluyen Pedialyte y Enfalyte, recomendadas para la " +
                                                  "\n rehidrataci�n efectiva. ALIMENTACION: Se recomienda el consumo de alimentos suaves y ricos en electrolitos, esenciales para    " +
                                                  "\n fortalecer el sistema digestivo y prevenir la deshidrataci�n. Pl�tanos y arroz blanco son opciones recomendadas. Tambi�n se    " +
                                                  "\n sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud intestinal y la recuperaci�n. Este es   " +
                                                  "\n solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que  " +
                                                  "\n por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer m�s de un diagn�stico de   " +
                                                  "\n Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del   " +
                                                  "\n diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida  " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos de tama�o regular,         " +
                                                  "\n para ayudar a la eliminaci�n de toxinas y prevenir complicaciones derivadas de la infecci�n. Tambi�n se recomienda el            " +
                                                  "\n consumo de l�quidos con propiedades antimicrobianas como agua con lim�n y infusiones de jengibre, que fortalecen el sistema      " +
                                                  "\n inmunol�gico. EJERCICIO: La actividad f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el descanso absoluto   " +
                                                  "\n y evitando esfuerzos que puedan debilitar el organismo. POSIBLE TRATAMIENTO: El tratamiento de la Listeriosis se basa en el uso  " +
                                                  "\n de antibi�ticos, siendo la ampicilina y la gentamicina opciones altamente eficaces para eliminar la bacteria. La ampicilina impide" +
                                                  "\n la replicaci�n de la bacteria mientras que la gentamicina bloquea la producci�n de prote�nas esenciales para su supervivencia.   " +
                                                  "\n Marcas reconocidas incluyen Ampex y Garamycin. En casos graves se pueden administrar corticoides para reducir la inflamaci�n y   " +
                                                  "\n mejorar la respuesta del organismo. ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C,     " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico. Espinacas y zanahorias son opciones recomendadas. Tambi�n se sugiere el      " +
                                                  "\n consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud intestinal y la recuperaci�n. Este es solo un        " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello   " +
                                                  "\n la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para " +
                                                  "\n establecer mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le" +
                                                  "\n satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos de tama�o regular,    " +
                                                  "\n para prevenir la deshidrataci�n causada por la diarrea y la fiebre. Tambi�n se recomienda el consumo de soluciones de         " +
                                                  "\n rehidrataci�n oral como Pedialyte o Enfalyte, que ayudan a reponer los electrolitos perdidos y mejorar la recuperaci�n.       " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el descanso absoluto y evitando   " +
                                                  "\n esfuerzos que puedan agravar la p�rdida de l�quidos. POSIBLE TRATAMIENTO: El tratamiento de la Shigelosis se basa en la       " +
                                                  "\n rehidrataci�n constante, y en casos graves puede requerirse administraci�n de l�quidos intravenosos en un hospital para       " +
                                                  "\n evitar complicaciones. En infecciones severas se pueden utilizar antibi�ticos como ciprofloxacino y azitromicina, que ayudan  " +
                                                  "\n a reducir la duraci�n de la enfermedad. Marcas reconocidas incluyen Cipro y Zithromax. ALIMENTACION: Se recomienda el consumo " +
                                                  "\n de alimentos suaves y ricos en electrolitos, esenciales para fortalecer el sistema digestivo y prevenir la deshidrataci�n.    " +
                                                  "\n Pl�tanos y arroz blanco son opciones recomendadas. Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos     " +
                                                  "\n beneficiosos para la salud intestinal y la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente    " +
                                                  "\n correctas. Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento   " +
                                                  "\n adecuado de su paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar" +
                                                  "\n a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad Pulmonar Obstructiva Cr�nica (EPOC). " +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos de tama�o regular,      " +
                                                  "\n para ayudar a mantener la funci�n pulmonar y reducir la inflamaci�n. Tambi�n se recomienda el consumo de l�quidos con         " +
                                                  "\n propiedades antioxidantes como t� verde y agua con lim�n, que pueden mejorar la salud respiratoria. EJERCICIO: La actividad   " +
                                                  "\n f�sica debe ser moderada y adaptada a la capacidad pulmonar, priorizando ejercicios de bajo impacto como caminatas, nataci�n  " +
                                                  "\n y ejercicios de respiraci�n, que fortalecen los m�sculos respiratorios y mejoran la oxigenaci�n. POSIBLE TRATAMIENTO:         " +
                                                  "\n El tratamiento de la EPOC se basa en el uso de broncodilatadores y corticosteroides inhalados, siendo el salbutamol y la      " +
                                                  "\n fluticasona opciones altamente eficaces para mejorar la respiraci�n y reducir la inflamaci�n. Marcas reconocidas incluyen     " +
                                                  "\n Ventolin y Flixotide. En casos avanzados se pueden administrar terapias de ox�geno para mejorar la calidad de vida del paciente." +
                                                  "\n ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes y �cidos grasos Omega-3, esenciales para reducir la  " +
                                                  "\n inflamaci�n pulmonar. Salm�n y espinacas son opciones recomendadas. Tambi�n se sugiere el consumo de c�rcuma, que posee propiedades" +
                                                  "\n antiinflamatorias y ayuda a mejorar la funci�n pulmonar. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas." +
                                                  "\n Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su " +
                                                  "\n paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico.  " +
                                                  "\n Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos de tama�o regular,           " +
                                                  "\n para ayudar a la eliminaci�n de toxinas y prevenir molestias urinarias. Tambi�n se recomienda el consumo de l�quidos con           " +
                                                  "\n propiedades antimicrobianas como agua con lim�n y infusiones de jengibre, que fortalecen el sistema inmunol�gico. EJERCICIO:       " +
                                                  "\n La actividad f�sica debe ser moderada y adaptada a su estado de salud, priorizando ejercicios aer�bicos de bajo impacto como       " +
                                                  "\n caminatas o yoga durante al menos 30 a 60 minutos al d�a, lo que ayuda a fortalecer el sistema inmunol�gico sin generar estr�s     " +
                                                  "\n excesivo en el cuerpo. POSIBLE TRATAMIENTO: El tratamiento de la Clamidia se basa en el uso de antibi�ticos, siendo la azitromicina" +
                                                  "\n y la doxiciclina opciones altamente eficaces para eliminar la bacteria. La azitromicina se administra en una dosis �nica mientras  " +
                                                  "\n que la doxiciclina se toma durante varios d�as. Marcas reconocidas incluyen Zithromax y Doryx. ALIMENTACION: Se recomienda el      " +
                                                  "\n consumo de alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunol�gico. Fresas y kiwis       " +
                                                  "\n son opciones recomendadas. Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud       " +
                                                  "\n intestinal y la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que       " +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se          " +
                                                  "\n recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente.       " +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L       " +
                                                  "\n Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis Bacteriana." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos de tama�o regular,     " +
                                                  "\n para prevenir la deshidrataci�n causada por fiebre intensa y la inflamaci�n de las meninges. Tambi�n se recomienda el consumo  " +
                                                  "\n de soluciones de rehidrataci�n oral como Pedialyte, que ayudan a reponer los electrolitos perdidos y mejorar la recuperaci�n.  " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el descanso absoluto y evitando    " +
                                                  "\n esfuerzos que puedan agravar la inflamaci�n cerebral. POSIBLE TRATAMIENTO: El tratamiento de la Meningitis Bacteriana se basa  " +
                                                  "\n en el uso de antibi�ticos intravenosos, siendo la ceftriaxona y la vancomicina opciones altamente eficaces para eliminar la    " +
                                                  "\n infecci�n y reducir la inflamaci�n. Marcas reconocidas incluyen Rocephin y Vancocin. En casos graves se pueden administrar     " +
                                                  "\n corticoides para reducir la inflamaci�n y mejorar la respuesta del organismo. ALIMENTACION: Se recomienda el consumo de        " +
                                                  "\n alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunol�gico. Espinacas y zanahorias      " +
                                                  "\n son opciones recomendadas. Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud   " +
                                                  "\n intestinal y la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que   " +
                                                  "\n el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se      " +
                                                  "\n recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente.   " +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L   " +
                                                  "\n Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos de tama�o regular,        " +
                                                  "\n para ayudar a mantener la funci�n celular y reducir los efectos secundarios del tratamiento. Tambi�n se recomienda el         " +
                                                  "\n consumo de l�quidos con propiedades antioxidantes como t� verde y agua con lim�n, que fortalecen el sistema inmunol�gico.     " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la capacidad del paciente, priorizando ejercicios de bajo       " +
                                                  "\n impacto como caminatas, yoga y ejercicios de respiraci�n, que mejoran la circulaci�n y reducen la fatiga.                     " +
                                                  "\n POSIBLE TRATAMIENTO: El tratamiento del C�ncer var�a seg�n el tipo y la etapa de la enfermedad, pero puede incluir quimioterapia," +
                                                  "\n radioterapia, cirug�a y terapias dirigidas. Marcas reconocidas incluyen Adriamycin y Taxol. En algunos casos se pueden administrar" +
                                                  "\n inmunoterapias para mejorar la respuesta del organismo. ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes" +
                                                  "\n y prote�nas, esenciales para fortalecer el sistema inmunol�gico y mantener la energ�a. Espinacas y zanahorias son opciones      " +
                                                  "\n recomendadas. Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud intestinal      " +
                                                  "\n y la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente   " +
                                                  "\n tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer  " +
                                                  "\n m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud," +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita" +
                                                  "\n a la app Mi Vida y espera que te mejores.");
                            }
                            
                        }
                        if(EstaturaMasculino.equals("1.45-1.70 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos de tama�o regular,       " +
                                                  "\n para prevenir la deshidrataci�n causada por fiebre y sudoraci�n. Tambi�n se recomienda el consumo de infusiones calientes    " +
                                                  "\n como t� de jengibre y agua con miel, que ayudan a aliviar la irritaci�n de la garganta y fortalecen el sistema inmunol�gico. " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el descanso absoluto y evitando  " +
                                                  "\n esfuerzos que puedan agravar la fatiga. POSIBLE TRATAMIENTO: Se recomienda el uso de antivirales como oseltamivir y baloxavir," +
                                                  "\n que pueden reducir la duraci�n y gravedad de la enfermedad si se administran en las primeras 48 horas. Marcas reconocidas     " +
                                                  "\n incluyen Tamiflu y Xofluza. En casos graves se pueden administrar antipir�ticos como paracetamol para controlar la fiebre y   " + 
                                                  "\n mejorar el bienestar del paciente. ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C,   " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico. Naranjas y fresas son opciones recomendadas. Tambi�n se sugiere el consumo" +
                                                  "\n de jengibre, que posee propiedades antiinflamatorias y ayuda a aliviar el malestar general. Este es solo un diagn�stico       " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad" +
                                                  "\n y sus respuestas sean completamente correctas. Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer " +
                                                  "\n mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface" +
                                                  "\n del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3.5 a 4.5 litros de agua, equivalentes a 12 a 18 vasos de tama�o regular,      " +
                                                  "\n para prevenir la deshidrataci�n causada por fiebre intensa y dificultad respiratoria. Tambi�n se recomienda el consumo de       " +
                                                  "\n infusiones calientes como t� de eucalipto, que ayuda a despejar las v�as respiratorias y mejorar la oxigenaci�n. EJERCICIO:     " +
                                                  "\n La actividad f�sica debe ser m�nima mientras persistan los s�ntomas, priorizando el descanso absoluto y evitando esfuerzos      " +
                                                  "\n que puedan agravar la fatiga respiratoria. POSIBLE TRATAMIENTO: El tratamiento de la Neumon�a se basa en el uso de antibi�ticos," +
                                                  "\n siendo la amoxicilina y la azitromicina opciones altamente eficaces para eliminar la infecci�n y reducir la inflamaci�n pulmonar." +
                                                  "\n Marcas reconocidas incluyen Amoxil y Zithromax. En casos graves se pueden administrar terapias de ox�geno para mejorar la       " +
                                                  "\n oxigenaci�n del paciente. ALIMENTACION: Se recomienda el consumo de alimentos ricos en antioxidantes y vitamina C, esenciales   " +
                                                  "\n para fortalecer el sistema inmunol�gico. Naranjas y fresas son opciones recomendadas. Tambi�n se sugiere el consumo de jengibre," +
                                                  "\n que posee propiedades antiinflamatorias y ayuda a aliviar la congesti�n pulmonar. Este es solo un diagn�stico predeterminado    " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas" +
                                                  "\n sean completamente correctas. Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad    " +
                                                  "\n en el tratamiento adecuado de su paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se   " +
                                                  "\n recomienda consultar a su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos de tama�o regular,     " +
                                                  "\n para ayudar a mantener el equilibrio de glucosa en sangre y prevenir la deshidrataci�n causada por la micci�n frecuente.       " +
                                                  "\n Tambi�n se recomienda el consumo de infusiones sin az�car y agua con lim�n, que contribuyen a la regulaci�n metab�lica.        " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la capacidad del paciente, priorizando ejercicios aer�bicos      " +
                                                  "\n como caminatas, ciclismo y nataci�n durante al menos 30 a 60 minutos al d�a, lo que ayuda a mejorar la sensibilidad a la       " +
                                                  "\n insulina y controlar los niveles de glucosa. POSIBLE TRATAMIENTO: El tratamiento de la Diabetes var�a seg�n el tipo, pero      " +
                                                  "\n puede incluir insulina en el caso de diabetes tipo 1 y medicamentos orales como la metformina en el caso de diabetes tipo 2.   " +
                                                  "\n Marcas reconocidas incluyen Humalog, Lantus y Glucophage. En algunos casos se pueden administrar inhibidores de SGLT2 para     " +
                                                  "\n mejorar la eliminaci�n de glucosa a trav�s de la orina. ALIMENTACION: Se recomienda el consumo de alimentos ricos en fibra     " +
                                                  "\n y prote�nas, esenciales para estabilizar los niveles de glucosa en sangre. Avena y almendras son opciones recomendadas.        " +
                                                  "\n Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud intestinal y la regulaci�n   " +
                                                  "\n metab�lica. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga   " +
                                                  "\n esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se recomienda hacer m�s   " +
                                                  "\n de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente. Adem�s, por su salud,  " +
                                                  "\n si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L Montes agradece tu visita" +
                                                  "\n a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3.5 litros de agua, equivalentes a 10 a 14 vasos de tama�o regular,       " +
                                                  "\n para ayudar a mantener la funci�n pulmonar y reducir la inflamaci�n. Tambi�n se recomienda el consumo de l�quidos con            " +
                                                  "\n propiedades antioxidantes como t� verde y agua con lim�n, que pueden mejorar la salud respiratoria. EJERCICIO: La actividad      " +
                                                  "\n f�sica debe ser moderada y adaptada a la capacidad pulmonar, priorizando ejercicios de bajo impacto como caminatas, nataci�n     " +
                                                  "\n y ejercicios de respiraci�n, que fortalecen los m�sculos respiratorios y mejoran la oxigenaci�n. POSIBLE TRATAMIENTO: El         " +
                                                  "\n tratamiento del Asma se basa en el uso de broncodilatadores y corticosteroides inhalados, siendo el salbutamol y la fluticasona  " +
                                                  "\n opciones altamente eficaces para mejorar la respiraci�n y reducir la inflamaci�n. Marcas reconocidas incluyen Ventolin y Flixotide." +
                                                  "\n En casos avanzados se pueden administrar terapias de ox�geno para mejorar la calidad de vida del paciente. ALIMENTACION: Se      " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y �cidos grasos Omega-3, esenciales para reducir la inflamaci�n pulmonar." +
                                                  "\n Salm�n y espinacas son opciones recomendadas. Tambi�n se sugiere el consumo de c�rcuma, que posee propiedades antiinflamatorias  " +
                                                  "\n y ayuda a mejorar la funci�n pulmonar. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%" +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello se    " +
                                                  "\n recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su paciente.     " +
                                                  "\n Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a su m�dico. Angel L     " +
                                                  "\n Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 3 a 4 litros de agua, equivalentes a 12 a 16 vasos de tama�o regular,     " +
                                                  "\n para ayudar a mantener la funci�n inmunol�gica y prevenir la deshidrataci�n causada por fiebre y efectos secundarios       " +
                                                  "\n del tratamiento. Tambi�n se recomienda el consumo de l�quidos con propiedades antioxidantes como t� verde y agua con       " +
                                                  "\n lim�n, que fortalecen el sistema inmunol�gico. EJERCICIO: La actividad f�sica debe ser moderada y adaptada a la capacidad  " +
                                                  "\n del paciente, priorizando ejercicios de bajo impacto como caminatas, yoga y ejercicios de respiraci�n, que mejoran la      " +
                                                  "\n circulaci�n y reducen la fatiga. POSIBLE TRATAMIENTO: El tratamiento del VIH/SIDA se basa en el uso de antirretrovirales,  " +
                                                  "\n siendo el tenofovir, emtricitabina y dolutegravir opciones altamente eficaces para controlar la replicaci�n del virus y    " +
                                                  "\n mejorar la calidad de vida. Marcas reconocidas incluyen Truvada, Tivicay y Biktarvy. En algunos casos se pueden administrar" +
                                                  "\n terapias inmunomoduladoras para mejorar la respuesta del organismo. ALIMENTACION: Se recomienda el consumo de alimentos    " +
                                                  "\n ricos en antioxidantes y prote�nas, esenciales para fortalecer el sistema inmunol�gico y mantener la energ�a. Espinacas    " +
                                                  "\n y zanahorias son opciones recomendadas. Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos" +
                                                  "\n para la salud intestinal y la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza" +
                                                  "\n al 100% que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas.   " +
                                                  "\n Para ello se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado  " +
                                                  "\n de su paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a  " +
                                                  "\n su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACION: Se recomienda una ingesta diaria de 2.5 a 3 litros de agua, equivalentes a 10 a 12 vasos de tama�o regular,  " +
                                                  "\n para ayudar a la eliminaci�n de toxinas y prevenir molestias urinarias. Tambi�n se recomienda el consumo de l�quidos con  " +
                                                  "\n propiedades antimicrobianas como agua con lim�n y infusiones de jengibre, que fortalecen el sistema inmunol�gico.         " +
                                                  "\n EJERCICIO: La actividad f�sica debe ser moderada y adaptada a su estado de salud, priorizando ejercicios aer�bicos        " +
                                                  "\n de bajo impacto como caminatas o yoga durante al menos 30 a 60 minutos al d�a, lo que ayuda a fortalecer el sistema       " +
                                                  "\n inmunol�gico sin generar estr�s excesivo en el cuerpo. POSIBLE TRATAMIENTO: El tratamiento de la Gonorrea se basa en      " +
                                                  "\n el uso de antibi�ticos, siendo la ceftriaxona y la azitromicina opciones altamente eficaces para eliminar la bacteria.    " +
                                                  "\n La ceftriaxona se administra en una dosis �nica mientras que la azitromicina complementa el tratamiento para evitar       " +
                                                  "\n resistencia bacteriana. Marcas reconocidas incluyen Rocephin y Zithromax. ALIMENTACION: Se recomienda el consumo de       " +
                                                  "\n alimentos ricos en antioxidantes y vitamina C, esenciales para fortalecer el sistema inmunol�gico. Fresas y kiwis son     " +
                                                  "\n opciones recomendadas. Tambi�n se sugiere el consumo de yogur natural, que aporta probi�ticos beneficiosos para la salud  " +
                                                  "\n intestinal y la recuperaci�n. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%  " +
                                                  "\n que el paciente tenga esa enfermedad y que por ello la enfermedad y sus respuestas sean completamente correctas. Para ello" +
                                                  "\n se recomienda hacer m�s de un diagn�stico de Mi Vida para establecer mayor seguridad en el tratamiento adecuado de su     " +
                                                  "\n paciente. Adem�s, por su salud, si la respuesta del diagn�stico no le satisface del todo, se recomienda consultar a       " +
                                                  "\n su m�dico. Angel L Montes agradece tu visita a la app Mi Vida y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer HERPES GENITAL." +
                                                  "\n HIDRATACI�N: Se recomienda consumir entre 2 y 2.5 litros de agua al d�a (aproximadamente ocho a diez vasos de agua de tama�o regular)" +
                                                  "\n para mantener el sistema inmunol�gico fuerte y favorecer la recuperaci�n. EJERCICIO: Se sugiere actividad f�sica moderada, evitando  " +
                                                  "\n el sobreesfuerzo y el estr�s, ya que estos pueden desencadenar brotes. Ejercicios de bajo impacto como caminatas, yoga y nataci�n    " +
                                                  "\n pueden ser beneficiosos. POSIBLE TRATAMIENTO: No existe una cura definitiva, pero los antivirales como aciclovir, valaciclovir y     " +
                                                  "\n famciclovir ayudan a reducir los s�ntomas y la frecuencia de los brotes. Algunas marcas comerciales incluyen Zovirax (aciclovir),    " +
                                                  "\n Valtrex (valaciclovir) y Famvir (famciclovir). Tambi�n pueden utilizarse cremas t�picas con antivirales para aliviar el malestar.    " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n,       " +
                                                  "\n tales como frutas c�tricas como naranjas, limones y toronjas, que contienen aproximadamente 60 mg de vitamina C por cada 100 gramos, " +
                                                  "\n cubriendo el 100% de la ingesta diaria recomendada para un adulto. El ajo, rico en alicina, posee propiedades antivirales y          " +
                                                  "\n antiinflamatorias. El jengibre tiene efectos antiinflamatorios que pueden ayudar a reducir el malestar. El yogur natural, fuente     " +
                                                  "\n de probi�ticos, contribuye a la salud intestinal y fortalece la respuesta inmune. Las verduras de hoja verde como espinacas,         " +
                                                  "\n acelgas y kale son ricas en antioxidantes y vitamina E, favoreciendo la regeneraci�n celular. Este es solo un diagn�stico            " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas           " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer        " +
                                                  "\n el tratamiento adecuado. Por tu salud, si la respuesta del diagn�stico no te satisface del todo, se recomienda mucho acudir a        " +
                                                  "\n un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�FILIS." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 litros de agua al d�a para favorecer la eliminaci�n de toxinas y fortalecer   " +
                                                  "\n el sistema inmunol�gico. EJERCICIO: Se sugiere actividad f�sica moderada, evitando el sobreesfuerzo y priorizando ejercicios   " +
                                                  "\n de bajo impacto como caminatas y nataci�n, ya que el estr�s f�sico puede afectar la recuperaci�n. POSIBLE TRATAMIENTO: La      " +
                                                  "\n s�filis se trata con antibi�ticos, siendo la penicilina G benzatina el medicamento de primera elecci�n. En casos de alergia    " +
                                                  "\n a la penicilina, se pueden utilizar alternativas como doxiciclina o ceftriaxona. Algunas marcas comerciales incluyen Benzetacil" +
                                                  "\n (penicilina G benzatina), Doxiclat (doxiciclina) y Rocephin (ceftriaxona). ALIMENTACI�N: Se recomienda el consumo de alimentos " +
                                                  "\n ricos en antioxidantes y nutrientes esenciales para la regeneraci�n celular y el fortalecimiento del sistema inmune, tales como" +
                                                  "\n frutas c�tricas como naranjas y limones, que contienen aproximadamente 60 mg de vitamina C por cada 100 gramos, cubriendo el   " +
                                                  "\n 100% de la ingesta diaria recomendada para un adulto. El ajo, rico en alicina, posee propiedades antimicrobianas. El jengibre  " +
                                                  "\n tiene efectos antiinflamatorios. El yogur natural, fuente de probi�ticos, contribuye a la salud intestinal y fortalece la      " +
                                                  "\n respuesta inmune. Las verduras de hoja verde como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo    " +
                                                  "\n la regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el     " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de    " +
                                                  "\n un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagn�stico  " +
                                                  "\n no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida)   " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer TUBERCULOSIS (TB)." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 3 litros de agua al d�a para mantener las v�as respiratorias hidratadas y     " +
                                                  "\n facilitar la eliminaci�n de secreciones. EJERCICIO: Se sugiere actividad f�sica ligera como caminatas y ejercicios de      " +
                                                  "\n respiraci�n para fortalecer los pulmones sin generar fatiga excesiva. POSIBLE TRATAMIENTO: La tuberculosis se trata con    " +
                                                  "\n una combinaci�n de antibi�ticos administrados por un per�odo prolongado. Los medicamentos m�s utilizados incluyen isoniacida," +
                                                  "\n rifampicina, etambutol y pirazinamida. Algunas marcas comerciales incluyen Rifadin (rifampicina), Myambutol (etambutol)    " +
                                                  "\n y Pyrazinamide (pirazinamida). ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en nutrientes esenciales para     " +
                                                  "\n fortalecer el sistema inmunol�gico y mejorar la funci�n pulmonar, tales como frutas c�tricas como toronjas y kiwis, que    " +
                                                  "\n contienen aproximadamente 70 mg de vitamina C por cada 100 gramos, cubriendo el 100% de la ingesta diaria recomendada para " +
                                                  "\n un adulto. El ajo, con propiedades antimicrobianas, puede ayudar a combatir infecciones. El jengibre tiene efectos         " +
                                                  "\n antiinflamatorios. El yogur natural, fuente de probi�ticos, contribuye a la salud intestinal y fortalece la respuesta inmune." +
                                                  "\n Las verduras de hoja verde como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo la regeneraci�n  " +
                                                  "\n celular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga  " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico" +
                                                  "\n y consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagn�stico no te satisface" + 
                                                  "\n del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer ARTRITIS. " +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2 litros de agua al d�a para mantener la lubricaci�n de las articulaciones      " +
                                                  "\n y reducir la inflamaci�n. EJERCICIO: Se sugiere actividad f�sica de bajo impacto como nataci�n, yoga y ejercicios de         " +
                                                  "\n movilidad articular para mejorar la flexibilidad y reducir el dolor. POSIBLE TRATAMIENTO: La artritis se trata con           " +
                                                  "\n medicamentos antiinflamatorios y analg�sicos. Los m�s utilizados incluyen ibuprofeno, naproxeno y celecoxib. Algunas         " +
                                                  "\n marcas comerciales incluyen Advil (ibuprofeno), Aleve (naproxeno) y Celebrex (celecoxib). ALIMENTACI�N: Se recomienda        " +
                                                  "\n el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para reducir la inflamaci�n y fortalecer las          " +
                                                  "\n articulaciones, tales como pescados grasos como salm�n y at�n, que contienen aproximadamente 1.8 g de �cidos grasos          " +
                                                  "\n Omega-3 por cada 100 gramos, ayudando a reducir la inflamaci�n. Frutas y verduras de colores vivos como fresas y espinacas,  " +
                                                  "\n ricas en antioxidantes y vitamina C. Jengibre y c�rcuma, con propiedades antiinflamatorias. Frutos secos como almendras y    " +
                                                  "\n nueces, ricos en vitamina E y �cidos grasos saludables. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se " +
                                                  "\n recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud, si  " +
                                                  "\n la respuesta del diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 litros de agua al d�a para mantener las v�as respiratorias hidratadas      " +
                                                  "\n y facilitar la eliminaci�n de secreciones. EJERCICIO: Se sugiere actividad f�sica ligera como caminatas y ejercicios de     " +
                                                  "\n respiraci�n para fortalecer los pulmones sin generar fatiga excesiva. POSIBLE TRATAMIENTO: La tosferina se trata con        " +
                                                  "\n antibi�ticos, siendo los m�s utilizados la azitromicina, claritromicina y eritromicina. Algunas marcas comerciales          " +
                                                  "\n incluyen Zithromax (azitromicina), Klacid (claritromicina) y Ilosone (eritromicina). ALIMENTACI�N: Se recomienda el         " +
                                                  "\n consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico y mejorar       " +
                                                  "\n la funci�n pulmonar, tales como frutas c�tricas como naranjas y toronjas, que contienen aproximadamente 60 mg de vitamina C " +
                                                  "\n por cada 100 gramos, cubriendo el 100% de la ingesta diaria recomendada para un adulto. El ajo, con propiedades antimicrobianas," +
                                                  "\n puede ayudar a combatir infecciones. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de probi�ticos,    " +
                                                  "\n contribuye a la salud intestinal y fortalece la respuesta inmune. Las verduras de hoja verde como espinacas y acelgas son   " +
                                                  "\n ricas en antioxidantes y vitamina E, favoreciendo la regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico," +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas." + 
                                                  "\n Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado.   " +
                                                  "\n Por tu salud, si la respuesta del diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista.      " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2 litros de agua al d�a para mantener la hidrataci�n y reducir la       " +
                                                  "\n inflamaci�n de las gl�ndulas salivales. EJERCICIO: Se sugiere reposo y evitar actividades f�sicas intensas hasta     " +
                                                  "\n la recuperaci�n completa. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para las paperas, pero los        " +
                                                  "\n s�ntomas pueden aliviarse con analg�sicos como ibuprofeno y paracetamol. Algunas marcas comerciales incluyen Advil   " +
                                                  "\n (ibuprofeno) y Tylenol (paracetamol). ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a reducir la    " +
                                                  "\n inflamaci�n y fortalezcan el sistema inmunol�gico, tales como frutas c�tricas como limones y kiwis, que contienen    " +
                                                  "\n aproximadamente 70 mg de vitamina C por cada 100 gramos, cubriendo el 100% de la ingesta diaria recomendada para     " +
                                                  "\n un adulto. El ajo, con propiedades antimicrobianas, puede ayudar a combatir infecciones. El jengibre tiene efectos   " +
                                                  "\n antiinflamatorios. El yogur natural, fuente de probi�ticos, contribuye a la salud intestinal y fortalece la respuesta" +
                                                  "\n inmune. Las verduras de hoja verde como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo    " +
                                                  "\n la regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%  " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda   " +
                                                  "\n realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la  " +
                                                  "\n respuesta del diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes     " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 litros de agua al d�a para prevenir la deshidrataci�n y ayudar a     " +
                                                  "\n la eliminaci�n de toxinas. EJERCICIO: Se sugiere reposo y evitar actividades f�sicas intensas hasta la recuperaci�n   " +
                                                  "\n completa. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para el Zika, pero los s�ntomas pueden aliviarse   " +
                                                  "\n con analg�sicos como paracetamol. Algunas marcas comerciales incluyen Tylenol (paracetamol). ALIMENTACI�N: Se recomienda" +
                                                  "\n el consumo de alimentos que ayuden a fortalecer el sistema inmunol�gico y reducir la inflamaci�n, tales como frutas     " +
                                                  "\n c�tricas como naranjas y toronjas, que contienen aproximadamente 60 mg de vitamina C por cada 100 gramos, cubriendo     " +
                                                  "\n el 100% de la ingesta diaria recomendada para un adulto. El ajo, con propiedades antimicrobianas, puede ayudar a combatir" +
                                                  "\n infecciones. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de probi�ticos, contribuye a la salud " +
                                                  "\n intestinal y fortalece la respuesta inmune. Las verduras de hoja verde como espinacas y acelgas son ricas en antioxidantes" +
                                                  "\n y vitamina E, favoreciendo la regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello," +
                                                  "\n se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud," +
                                                  "\n si la respuesta del diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes    " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 3 litros de agua al d�a para prevenir la deshidrataci�n causada por la diarrea    " +
                                                  "\n intensa, adem�s de soluciones de rehidrataci�n oral como Pedialyte o Enfalyte para reponer electrolitos perdidos. EJERCICIO:   " +
                                                  "\n Se sugiere reposo absoluto durante la fase aguda de la enfermedad, evitando cualquier actividad f�sica intensa hasta la        " +
                                                  "\n recuperaci�n completa. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para el rotavirus, pero los s�ntomas pueden    " +
                                                  "\n aliviarse con l�quidos de rehidrataci�n y una dieta adecuada. En casos graves, puede requerirse hidrataci�n intravenosa.       " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a reponer los electrolitos y fortalecer el sistema digestivo,   " +
                                                  "\n tales como pl�tanos, que contienen aproximadamente 358 mg de potasio por cada 100 gramos, ayudando a equilibrar los electrolitos" +
                                                  "\n perdidos. El arroz blanco, fuente de carbohidratos de f�cil digesti�n, contribuye a la recuperaci�n. El yogur natural, rico en " +
                                                  "\n probi�ticos, favorece la salud intestinal. Las zanahorias, con aproximadamente 8 mg de betacarotenos por cada 100 gramos,      " +
                                                  "\n ayudan a fortalecer el sistema inmunol�gico. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza" +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda     " +
                                                  "\n realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la respuesta  " +
                                                  "\n del diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita      " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 litros de agua al d�a para ayudar a eliminar toxinas y fortalecer el   " +
                                                  "\n sistema inmunol�gico. EJERCICIO: Se sugiere actividad f�sica moderada, evitando el sobreesfuerzo y priorizando          " +
                                                  "\n ejercicios de bajo impacto como caminatas y yoga. POSIBLE TRATAMIENTO: La listeriosis se trata con antibi�ticos,        " +
                                                  "\n siendo la ampicilina y la gentamicina los m�s utilizados. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos     " +
                                                  "\n en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, tales como espinacas, que contienen   " +
                                                  "\n aproximadamente 2.7 mg de hierro por cada 100 gramos, favoreciendo la producci�n de gl�bulos rojos. El ajo, rico en     " +
                                                  "\n alicina, posee propiedades antimicrobianas. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de    " +
                                                  "\n probi�ticos, contribuye a la salud intestinal y fortalece la respuesta inmune. Este es solo un diagn�stico predeterminado" +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean        " +
                                                  "\n completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer" +
                                                  "\n el tratamiento adecuado. Por tu salud, si la respuesta del diagn�stico no te satisface del todo, se recomienda mucho    " +
                                                  "\n acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 3 litros de agua al d�a para prevenir la deshidrataci�n causada por la " +
                                                  "\n diarrea intensa, adem�s de soluciones de rehidrataci�n oral para reponer electrolitos. EJERCICIO: Se sugiere reposo " +
                                                  "\n absoluto durante la fase aguda de la enfermedad, evitando cualquier actividad f�sica intensa hasta la recuperaci�n  " +
                                                  "\n completa. POSIBLE TRATAMIENTO: La shigelosis se trata con antibi�ticos en casos graves, siendo la ciprofloxacina y  " +
                                                  "\n la azitromicina los m�s utilizados. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el  " +
                                                  "\n sistema digestivo y reponer los electrolitos, tales como pl�tanos, que contienen aproximadamente 358 mg de potasio  " +
                                                  "\n por cada 100 gramos, ayudando a equilibrar los electrolitos perdidos. El arroz blanco, fuente de carbohidratos de   " +
                                                  "\n f�cil digesti�n, contribuye a la recuperaci�n. El yogur natural, rico en probi�ticos, favorece la salud intestinal. " +
                                                  "\n Las zanahorias, con aproximadamente 8 mg de betacarotenos por cada 100 gramos, ayudan a fortalecer el sistema       " +
                                                  "\n inmunol�gico. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el     " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar" +
                                                  "\n m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la respuesta" +
                                                  "\n del diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu  " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 a 3 litros de agua al d�a para mantener las v�as respiratorias        " +
                                                  "\n hidratadas y facilitar la eliminaci�n de secreciones. Tambi�n es beneficioso el consumo de infusiones calientes        " +
                                                  "\n para aliviar la irritaci�n pulmonar. EJERCICIO: Se sugiere actividad f�sica moderada, como caminatas y ejercicios      " +
                                                  "\n de respiraci�n, para fortalecer los pulmones sin generar fatiga excesiva. Evitar ambientes con humo o contaminaci�n    " +
                                                  "\n es clave para prevenir crisis respiratorias. POSIBLE TRATAMIENTO: La EPOC se trata con broncodilatadores y corticosteroides" + 
                                                  "\n inhalados para mejorar la funci�n pulmonar. Algunos medicamentos incluyen salbutamol, tiotropio y budesonida.          " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer     " +
                                                  "\n la funci�n pulmonar, tales como zanahorias, que contienen aproximadamente 8 mg de betacarotenos por cada 100 gramos,   " +
                                                  "\n ayudando a la salud respiratoria. El ajo, con propiedades antimicrobianas, puede ayudar a combatir infecciones.        " +
                                                  "\n El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de probi�ticos, contribuye a la salud intestinal " +
                                                  "\n y fortalece la respuesta inmune. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda" +
                                                  "\n realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la    " +
                                                  "\n respuesta del diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece" +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 litros de agua al d�a para favorecer la eliminaci�n de toxinas     " +
                                                  "\n y fortalecer el sistema inmunol�gico. EJERCICIO: Se sugiere actividad f�sica moderada, evitando el sobreesfuerzo    " +
                                                  "\n y priorizando ejercicios de bajo impacto como caminatas y yoga. POSIBLE TRATAMIENTO: La clamidia se trata con       " +
                                                  "\n antibi�ticos, siendo la azitromicina y la doxiciclina los m�s utilizados. Algunas marcas comerciales incluyen       " +
                                                  "\n Azitromicina y Doxiclat. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes    " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico, tales como espinacas, que contienen aproximadamente 2.7 mg de   " +
                                                  "\n hierro por cada 100 gramos, favoreciendo la producci�n de gl�bulos rojos. El ajo, rico en alicina, posee propiedades" +
                                                  "\n antimicrobianas. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de probi�ticos, contribuye a " +
                                                  "\n la salud intestinal y fortalece la respuesta inmune. Este es solo un diagn�stico predeterminado l�gico, haberlo     " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente      " +
                                                  "\n correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el       " +
                                                  "\n tratamiento adecuado. Por tu salud, si la respuesta del diagn�stico no te satisface del todo, se recomienda mucho   " +
                                                  "\n acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 3 litros de agua al d�a para mantener la hidrataci�n y ayudar       " +
                                                  "\n a la eliminaci�n de toxinas. EJERCICIO: Se sugiere reposo absoluto durante el tratamiento, evitando cualquier    " +
                                                  "\n actividad f�sica intensa hasta la recuperaci�n completa. POSIBLE TRATAMIENTO: La meningitis bacteriana se trata  " +
                                                  "\n con antibi�ticos administrados por v�a intravenosa. Algunos medicamentos incluyen ceftriaxona y vancomicina.     " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmunol�gico y reducir    " +
                                                  "\n la inflamaci�n, tales como frutas c�tricas como naranjas y toronjas, que contienen aproximadamente 60 mg de      " +
                                                  "\n vitamina C por cada 100 gramos, cubriendo el 100% de la ingesta diaria recomendada para un adulto. El ajo,       " +
                                                  "\n con propiedades antimicrobianas, puede ayudar a combatir infecciones. El jengibre tiene efectos antiinflamatorios." +
                                                  "\n El yogur natural, fuente de probi�ticos, contribuye a la salud intestinal y fortalece la respuesta inmune.       " +
                                                  "\n Las verduras de hoja verde como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo        " +
                                                  "\n la regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza      " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello,     " +
                                                  "\n se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado.    " +
                                                  "\n Por tu salud, si la respuesta del diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista." +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 a 3 litros de agua al d�a para mantener una adecuada       " +
                                                  "\n hidrataci�n celular y ayudar a la eliminaci�n de toxinas generadas por el tratamiento. Tambi�n es           " +
                                                  "\n beneficioso el consumo de infusiones antioxidantes como t� verde o agua con lim�n. EJERCICIO: Se            " +
                                                  "\n sugiere actividad f�sica moderada y adaptada a la condici�n del paciente, como caminatas suaves,            " +
                                                  "\n yoga o ejercicios de respiraci�n, evitando el sobreesfuerzo. El ejercicio puede ayudar a reducir            " +
                                                  "\n la fatiga y mejorar el bienestar general. POSIBLE TRATAMIENTO: El tratamiento del c�ncer var�a seg�n        " +
                                                  "\n el tipo y la etapa de la enfermedad, incluyendo opciones como cirug�a, quimioterapia, radioterapia,         " +
                                                  "\n inmunoterapia y terapia dirigida. Algunos medicamentos utilizados en la quimioterapia incluyen paclitaxel,  " +
                                                  "\n cisplatino y doxorrubicina. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y    " +
                                                  "\n nutrientes esenciales para fortalecer el sistema inmunol�gico y reducir la inflamaci�n, tales como frutas   " +
                                                  "\n c�tricas como naranjas y toronjas, que contienen aproximadamente 60 mg de vitamina C por cada 100 gramos,   " +
                                                  "\n cubriendo el 100% de la ingesta diaria recomendada para un adulto. El ajo, con propiedades antimicrobianas, " +
                                                  "\n puede ayudar a combatir infecciones. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente  " +
                                                  "\n de probi�ticos, contribuye a la salud intestinal y fortalece la respuesta inmune. Las verduras de hoja verde" +
                                                  "\n como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo la regeneraci�n celular.     " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente  " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar " +
                                                  "\n m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la  " +
                                                  "\n respuesta del diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L   " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        
                        if(EstaturaMasculino.equals("1.65-1.80 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 litros de agua al d�a para mantener la hidrataci�n y ayudar  " +
                                                  "\n a la eliminaci�n de toxinas generadas por la fiebre y la congesti�n. Tambi�n es beneficioso el consumo de     " +
                                                  "\n l�quidos calientes como t� de jengibre o caldos para aliviar la irritaci�n de garganta. En casos de fiebre    " +
                                                  "\n alta, se recomienda el consumo de sueros de rehidrataci�n oral para evitar la deshidrataci�n. EJERCICIO:      " +
                                                  "\n Durante la fase aguda de la enfermedad, se recomienda reposo absoluto para evitar el desgaste energ�tico      " +
                                                  "\n y permitir que el sistema inmunol�gico combata la infecci�n. Una vez superada la fase cr�tica, se pueden      " +
                                                  "\n realizar ejercicios de bajo impacto como caminatas suaves para mejorar la circulaci�n y la recuperaci�n.      " +
                                                  "\n POSIBLE TRATAMIENTO: La gripe se trata con antivirales como oseltamivir (Tamiflu) y zanamivir (Relenza),      " +
                                                  "\n que ayudan a reducir la duraci�n y gravedad de la enfermedad al inhibir la replicaci�n del virus. Tambi�n     " +
                                                  "\n se pueden utilizar analg�sicos y antipir�ticos como paracetamol (Tylenol) e ibuprofeno (Advil) para aliviar   " +
                                                  "\n la fiebre y el malestar general. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes   " +
                                                  "\n y nutrientes esenciales para fortalecer el sistema inmunol�gico, tales como frutas c�tricas como naranjas y   " +
                                                  "\n toronjas, que contienen aproximadamente 60 mg de vitamina C por cada 100 gramos, cubriendo el 100% de la      " +
                                                  "\n ingesta diaria recomendada para un adulto. El ajo, con propiedades antimicrobianas, puede ayudar a combatir   " +
                                                  "\n infecciones. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de probi�ticos, contribuye " +
                                                  "\n a la salud intestinal y fortalece la respuesta inmune. Las verduras de hoja verde como espinacas y acelgas son" +
                                                  "\n ricas en antioxidantes y vitamina E, favoreciendo la regeneraci�n celular. Este es solo un diagn�stico        " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las" +
                                                  "\n respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a" +
                                                  "\n un m�dico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagn�stico no te satisface" +
                                                  "\n del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) " +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 3 litros de agua al d�a para mantener las v�as respiratorias   " +
                                                  "\n hidratadas y facilitar la eliminaci�n de secreciones. Tambi�n es beneficioso el consumo de infusiones       " +
                                                  "\n calientes como t� de eucalipto o jengibre para aliviar la congesti�n pulmonar. En casos graves, puede       " +
                                                  "\n requerirse hidrataci�n intravenosa para evitar complicaciones. EJERCICIO: Durante la fase aguda de la       " +
                                                  "\n enfermedad, se recomienda reposo absoluto para evitar el esfuerzo respiratorio excesivo. Una vez superada   " +
                                                  "\n la fase cr�tica, se pueden realizar ejercicios de respiraci�n profunda y caminatas suaves para fortalecer   " +
                                                  "\n los pulmones y mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: La neumon�a se trata con antibi�ticos en caso   " +
                                                  "\n de origen bacteriano, siendo amoxicilina (Amoxil) y azitromicina (Zithromax) los m�s utilizados para combatir" +
                                                  "\n la infecci�n. Tambi�n pueden recetarse broncodilatadores como salbutamol (Ventolin) y antiinflamatorios como" +
                                                  "\n prednisona (Deltasone) para mejorar la funci�n pulmonar y reducir la inflamaci�n. ALIMENTACI�N: Se recomienda" +
                                                  "\n el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico" +
                                                  "\n y mejorar la funci�n pulmonar, tales como zanahorias, que contienen aproximadamente 8 mg de betacarotenos por " +
                                                  "\n cada 100 gramos, ayudando a la salud respiratoria. El ajo, con propiedades antimicrobianas, puede ayudar a    " +
                                                  "\n combatir infecciones. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de probi�ticos,   " +
                                                  "\n contribuye a la salud intestinal y fortalece la respuesta inmune. Este es solo un diagn�stico predeterminado  " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas   " +
                                                  "\n sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico " +
                                                  "\n para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagn�stico no te satisface del    " +
                                                  "\n todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y    " +
                                                  "\n espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 litros de agua al d�a para mantener una adecuada hidrataci�n      " +
                                                  "\n celular y ayudar a la regulaci�n de la glucosa en sangre. Tambi�n es beneficioso el consumo de infusiones sin      " +
                                                  "\n az�car como t� verde o agua con lim�n para mejorar la sensibilidad a la insulina. EJERCICIO: Se sugiere actividad  " +
                                                  "\n f�sica moderada y adaptada a la condici�n del paciente, como caminatas diarias de al menos 30 minutos, nataci�n o  " +
                                                  "\n ejercicios de resistencia para mejorar la sensibilidad a la insulina y controlar los niveles de glucosa.           " +
                                                  "\n POSIBLE TRATAMIENTO: La diabetes se trata con medicamentos como metformina (Glucophage), que ayuda a reducir la    " +
                                                  "\n producci�n de glucosa en el h�gado, insulina (Lantus, Humalog) para regular los niveles de az�car en sangre, y     " +
                                                  "\n empagliflozina (Jardiance), que favorece la eliminaci�n de glucosa a trav�s de la orina. ALIMENTACI�N: Se recomienda" +
                                                  "\n el consumo de alimentos ricos en fibra y nutrientes esenciales para estabilizar los niveles de glucosa, tales como " +
                                                  "\n avena, que contiene aproximadamente 4 g de fibra por cada 100 gramos, ayudando a la regulaci�n del az�car en sangre." +
                                                  "\n Frutas como fresas y manzanas, ricas en antioxidantes y fibra. Frutos secos como almendras y nueces, que contienen " +
                                                  "\n grasas saludables. Verduras de hoja verde como espinacas y acelgas, ricas en antioxidantes y vitamina E. Este es   " +
                                                  "\n solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta      " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico" +
                                                  "\n y consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagn�stico no te  " +
                                                  "\n satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida)" +
                                                  "\n y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 litros de agua al d�a para mantener las v�as respiratorias hidratadas     " +
                                                  "\n y reducir la viscosidad de las secreciones bronquiales, facilitando la respiraci�n. Tambi�n es beneficioso el consumo      " +
                                                  "\n de infusiones como t� de jengibre o manzanilla, que poseen propiedades antiinflamatorias. EJERCICIO: Se sugiere actividad  " +
                                                  "\n f�sica moderada y controlada, con calentamiento previo y enfriamiento posterior. Ejercicios como nataci�n, caminatas y     " +
                                                  "\n yoga pueden mejorar la capacidad pulmonar sin provocar crisis asm�ticas. Se recomienda evitar ambientes con humo,          " +
                                                  "\n contaminaci�n o temperaturas extremas. POSIBLE TRATAMIENTO: El asma se trata con broncodilatadores y corticosteroides      " +
                                                  "\n inhalados. Algunos medicamentos incluyen salbutamol (Ventolin, Aerolin), que act�a como broncodilatador de acci�n r�pida,  " +
                                                  "\n budesonida (Pulmicort), que reduce la inflamaci�n de las v�as respiratorias, y montelukast (Singulair), que ayuda a        " +
                                                  "\n prevenir crisis asm�ticas. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes         " +
                                                  "\n esenciales para fortalecer la funci�n pulmonar, tales como pescados grasos como salm�n y at�n, que contienen               " +
                                                  "\n aproximadamente 1.8 g de �cidos grasos Omega-3 por cada 100 gramos, ayudando a reducir la inflamaci�n. Frutas y verduras   " +
                                                  "\n de colores vivos como fresas y espinacas, ricas en antioxidantes y vitamina C. Jengibre y c�rcuma, con propiedades         " +
                                                  "\n antiinflamatorias. Frutos secos como almendras y nueces, ricos en vitamina E y �cidos grasos saludables. Este es solo      " +
                                                  "\n un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni     " +
                                                  "\n que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a     " +
                                                  "\n un m�dico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagn�stico no te satisface del todo, " +
                                                  "\n se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 3 litros de agua al d�a para mantener una adecuada hidrataci�n         " +
                                                  "\n celular y ayudar a la eliminaci�n de toxinas generadas por el tratamiento antirretroviral. Tambi�n es beneficioso   " +
                                                  "\n el consumo de infusiones antioxidantes como t� verde o agua con lim�n. EJERCICIO: Se sugiere actividad f�sica       " +
                                                  "\n moderada y adaptada a la condici�n del paciente, como caminatas suaves, yoga o ejercicios de resistencia, evitando  " +
                                                  "\n el sobreesfuerzo. El ejercicio puede ayudar a reducir la fatiga y mejorar el bienestar general.                     " +
                                                  "\n POSIBLE TRATAMIENTO: El VIH/SIDA se trata con terapia antirretroviral (TAR), que combina varios medicamentos para   " +
                                                  "\n reducir la carga viral y fortalecer el sistema inmunol�gico. Algunos medicamentos incluyen tenofovir (Viread), que  " +
                                                  "\n inhibe la replicaci�n del virus, efavirenz (Sustiva), que bloquea la acci�n del VIH en las c�lulas, dolutegravir    " +
                                                  "\n (Tivicay), que impide la integraci�n del virus en el ADN celular, y lamivudina (Epivir), que ayuda a reducir la     " +
                                                  "\n progresi�n de la enfermedad. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes" +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico, tales como frutas c�tricas como naranjas y toronjas, que contienen" +
                                                  "\n aproximadamente 60 mg de vitamina C por cada 100 gramos, cubriendo el 100% de la ingesta diaria recomendada para un " +
                                                  "\n adulto. El ajo, con propiedades antimicrobianas, puede ayudar a combatir infecciones. El jengibre tiene efectos     " +
                                                  "\n antiinflamatorios. El yogur natural, fuente de probi�ticos, contribuye a la salud intestinal y fortalece la respuesta" +
                                                  "\n inmune. Las verduras de hoja verde como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo la " +
                                                  "\n regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que " +
                                                  "\n el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar" +
                                                  "\n m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la respuesta " +
                                                  "\n del diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 litros de agua al d�a para favorecer la eliminaci�n de toxinas      " +
                                                  "\n y fortalecer el sistema inmunol�gico. Tambi�n es beneficioso el consumo de infusiones como t� de manzanilla o        " +
                                                  "\n jengibre, que poseen propiedades antimicrobianas. EJERCICIO: Se sugiere actividad f�sica moderada, evitando el       " +
                                                  "\n sobreesfuerzo y priorizando ejercicios de bajo impacto como caminatas y yoga. POSIBLE TRATAMIENTO: La gonorrea       " +
                                                  "\n se trata con antibi�ticos, siendo la ceftriaxona (Rocephin) y azitromicina (Zithromax) los m�s utilizados para       " +
                                                  "\n combatir la infecci�n. Tambi�n pueden recetarse doxiciclina (Doxiclat) en casos de coinfecci�n con clamidia.         " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer   " +
                                                  "\n el sistema inmunol�gico, tales como espinacas, que contienen aproximadamente 2.7 mg de hierro por cada 100 gramos,   " +
                                                  "\n favoreciendo la producci�n de gl�bulos rojos. El ajo, rico en alicina, posee propiedades antimicrobianas. El jengibre" +
                                                  "\n tiene efectos antiinflamatorios. El yogur natural, fuente de probi�ticos, contribuye a la salud intestinal y fortalece" +
                                                  "\n la respuesta inmune. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el" +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar" +
                                                  "\n m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la respuesta" +
                                                  "\n del diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu  " +
                                                  "\n visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 litros de agua al d�a para mantener la hidrataci�n celular y   " +
                                                  "\n fortalecer el sistema inmunol�gico, lo que ayuda a reducir la frecuencia de los brotes. Tambi�n es beneficioso  " +
                                                  "\n el consumo de infusiones antioxidantes como t� verde o agua con lim�n. EJERCICIO: Se sugiere actividad f�sica   " +
                                                  "\n moderada, evitando el sobreesfuerzo y el estr�s, ya que estos pueden desencadenar brotes. Actividades como      " +
                                                  "\n caminatas, yoga y ejercicios de bajo impacto pueden ser beneficiosos para la salud general y el sistema         " +
                                                  "\n inmunol�gico. POSIBLE TRATAMIENTO: El herpes genital no tiene cura definitiva, pero existen tratamientos        " +
                                                  "\n para reducir los s�ntomas y la frecuencia de los brotes. Los antivirales como aciclovir (Zovirax), valaciclovir " +
                                                  "\n (Valtrex) y famciclovir (Famvir) son com�nmente recetados para controlar la infecci�n, ayudando a reducir la    " +
                                                  "\n replicaci�n del virus y la duraci�n de los s�ntomas. ALIMENTACI�N: Se recomienda el consumo de alimentos que    " +
                                                  "\n fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como frutas c�tricas como naranjas " +
                                                  "\n y limones, que contienen aproximadamente 60 mg de vitamina C por cada 100 gramos, cubriendo el 100% de la ingesta" +
                                                  "\n diaria recomendada para un adulto. El ajo, rico en alicina, posee propiedades antivirales y antiinflamatorias.  " +
                                                  "\n El jengibre tiene efectos antiinflamatorios que pueden ayudar a reducir el malestar. El yogur natural, fuente   " +
                                                  "\n de probi�ticos, contribuye a la salud intestinal y fortalece la respuesta inmune. Las verduras de hoja verde    " +
                                                  "\n como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo la regeneraci�n celular. Este    " +
                                                  "\n es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga     " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de    " +
                                                  "\n un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la respuesta   " +
                                                  "\n del diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 litros de agua al d�a para favorecer la eliminaci�n de toxinas " +
                                                  "\n y fortalecer el sistema inmunol�gico. Tambi�n es beneficioso el consumo de infusiones como t� de manzanilla o   " +
                                                  "\n jengibre, que poseen propiedades antimicrobianas. EJERCICIO: Se sugiere actividad f�sica moderada, evitando el  " +
                                                  "\n sobreesfuerzo y priorizando ejercicios de bajo impacto como caminatas y yoga, ya que el estr�s f�sico puede     " +
                                                  "\n afectar la recuperaci�n. POSIBLE TRATAMIENTO: La s�filis se trata con antibi�ticos, siendo la penicilina G      " +
                                                  "\n benzatina (Benzetacil) el medicamento de primera elecci�n, que act�a eliminando la bacteria Treponema pallidum. " +
                                                  "\n En casos de alergia a la penicilina, se pueden utilizar alternativas como doxiciclina (Doxiclat) o ceftriaxona  " +
                                                  "\n (Rocephin), que tambi�n combaten la infecci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en     " +
                                                  "\n antioxidantes y nutrientes esenciales para la regeneraci�n celular y el fortalecimiento del sistema inmune,     " +
                                                  "\n tales como frutas c�tricas como naranjas y limones, que contienen aproximadamente 60 mg de vitamina C por cada  " +
                                                  "\n 100 gramos, cubriendo el 100% de la ingesta diaria recomendada para un adulto. El ajo, rico en alicina, posee   " +
                                                  "\n propiedades antimicrobianas. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de probi�ticos," +
                                                  "\n contribuye a la salud intestinal y fortalece la respuesta inmune. Las verduras de hoja verde como espinacas y   " +
                                                  "\n acelgas son ricas en antioxidantes y vitamina E, favoreciendo la regeneraci�n celular. Este es solo un diagn�stico" +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las " +
                                                  "\n respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a  " +
                                                  "\n un m�dico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagn�stico no te satisface" +
                                                  "\n del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y  " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 3 litros de agua al d�a para mantener las v�as respiratorias      " +
                                                  "\n hidratadas y facilitar la eliminaci�n de secreciones. Tambi�n es beneficioso el consumo de infusiones          " +
                                                  "\n calientes como t� de eucalipto o jengibre para aliviar la congesti�n pulmonar. EJERCICIO: Durante la           " +
                                                  "\n fase aguda de la enfermedad, se recomienda reposo absoluto para evitar el esfuerzo respiratorio excesivo.      " +
                                                  "\n Una vez superada la fase cr�tica, se pueden realizar ejercicios de respiraci�n profunda y caminatas suaves     " +
                                                  "\n para fortalecer los pulmones y mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: La tuberculosis se trata con una   " +
                                                  "\n combinaci�n de antibi�ticos administrados por un per�odo prolongado. Los medicamentos m�s utilizados incluyen  " +
                                                  "\n isoniacida (INH), que inhibe la s�ntesis de la pared celular de la bacteria, rifampicina (Rifadin), que bloquea" +
                                                  "\n la replicaci�n del bacilo, etambutol (Myambutol), que impide el crecimiento de la bacteria, y pirazinamida, que" +
                                                  "\n ayuda a eliminar la infecci�n en los pulmones. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en    " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico y mejorar la funci�n pulmonar,   " +
                                                  "\n tales como frutas c�tricas como toronjas y kiwis, que contienen aproximadamente 70 mg de vitamina C por cada   " +
                                                  "\n 100 gramos, cubriendo el 100% de la ingesta diaria recomendada para un adulto. El ajo, con propiedades antimicrobianas," +
                                                  "\n puede ayudar a combatir infecciones. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de   " +
                                                  "\n probi�ticos, contribuye a la salud intestinal y fortalece la respuesta inmune. Las verduras de hoja verde como  " +
                                                  "\n espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo la regeneraci�n celular. Este es solo " +
                                                  "\n un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad" +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar" +
                                                  "\n a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagn�stico no te satisface del" +
                                                  "\n todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 litros de agua al d�a para mantener la lubricaci�n de las     " +
                                                  "\n articulaciones y reducir la inflamaci�n. Tambi�n es beneficioso el consumo de infusiones como t� de c�rcuma    " +
                                                  "\n o jengibre, que poseen propiedades antiinflamatorias. EJERCICIO: Se sugiere actividad f�sica de bajo impacto   " +
                                                  "\n como nataci�n, yoga y ejercicios de movilidad articular para mejorar la flexibilidad y reducir el dolor. Se    " +
                                                  "\n recomienda evitar ejercicios de alto impacto que puedan generar mayor desgaste en las articulaciones.          " +
                                                  "\n POSIBLE TRATAMIENTO: La artritis se trata con medicamentos antiinflamatorios y analg�sicos. Los m�s utilizados " +
                                                  "\n incluyen ibuprofeno (Advil), que ayuda a reducir la inflamaci�n y el dolor, naproxeno (Aleve), que tiene efectos" +
                                                  "\n prolongados contra la inflamaci�n, celecoxib (Celebrex), que act�a como inhibidor selectivo de la inflamaci�n, y" +
                                                  "\n metotrexato, utilizado en casos de artritis reumatoide para reducir la respuesta autoinmune. ALIMENTACI�N: Se   " +
                                                  "\n recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para reducir la inflamaci�n y " +
                                                  "\n fortalecer las articulaciones, tales como pescados grasos como salm�n y at�n, que contienen aproximadamente 1.8 g" +
                                                  "\n de �cidos grasos Omega-3 por cada 100 gramos, ayudando a reducir la inflamaci�n. Frutas y verduras de colores vivos" +
                                                  "\n como fresas y espinacas, ricas en antioxidantes y vitamina C. Jengibre y c�rcuma, con propiedades antiinflamatorias." +
                                                  "\n Frutos secos como almendras y nueces, ricos en vitamina E y �cidos grasos saludables. Este es solo un diagn�stico   " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las     " +
                                                  "\n respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un   " +
                                                  "\n m�dico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagn�stico no te satisface del   " +
                                                  "\n todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 litros de agua al d�a para mantener las v�as respiratorias   " +
                                                  "\n hidratadas y facilitar la eliminaci�n de secreciones. Tambi�n es beneficioso el consumo de infusiones         " +
                                                  "\n calientes como t� de eucalipto o miel con lim�n para aliviar la irritaci�n de garganta. EJERCICIO: Durante    " +
                                                  "\n la fase aguda de la enfermedad, se recomienda reposo absoluto para evitar el esfuerzo respiratorio excesivo.  " +
                                                  "\n Una vez superada la fase cr�tica, se pueden realizar ejercicios de respiraci�n profunda y caminatas suaves    " +
                                                  "\n para fortalecer los pulmones y mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: La tosferina se trata con antibi�ticos," +
                                                  "\n siendo los m�s utilizados azitromicina (Zithromax), que ayuda a eliminar la bacteria Bordetella pertussis,    " +
                                                  "\n claritromicina (Klacid), que reduce la duraci�n de los s�ntomas, y eritromicina (Ilosone), que previene la    " +
                                                  "\n propagaci�n de la infecci�n. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y     " +
                                                  "\n nutrientes esenciales para fortalecer el sistema inmunol�gico y mejorar la funci�n pulmonar, tales como frutas" +
                                                  "\n c�tricas como naranjas y toronjas, que contienen aproximadamente 60 mg de vitamina C por cada 100 gramos,     " +
                                                  "\n cubriendo el 100% de la ingesta diaria recomendada para un adulto. El ajo, con propiedades antimicrobianas,   " +
                                                  "\n puede ayudar a combatir infecciones. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente    " +
                                                  "\n de probi�ticos, contribuye a la salud intestinal y fortalece la respuesta inmune. Las verduras de hoja verde  " +
                                                  "\n como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo la regeneraci�n celular. Este  " +
                                                  "\n es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga   " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de  " +
                                                  "\n un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la respuesta " +
                                                  "\n del diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece" +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2 litros de agua al d�a para mantener la hidrataci�n y reducir      " +
                                                  "\n la inflamaci�n de las gl�ndulas salivales. Tambi�n es beneficioso el consumo de l�quidos tibios como caldos      " +
                                                  "\n o infusiones de manzanilla para aliviar el malestar. EJERCICIO: Se sugiere reposo absoluto durante la fase       " +
                                                  "\n aguda de la enfermedad, evitando cualquier actividad f�sica intensa hasta la recuperaci�n completa.              " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para las paperas, pero los s�ntomas pueden aliviarse    " +
                                                  "\n con analg�sicos como ibuprofeno (Advil), que ayuda a reducir la fiebre y la inflamaci�n, y paracetamol (Tylenol)," +
                                                  "\n que alivia el dolor y el malestar general. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a reducir" +
                                                  "\n la inflamaci�n y fortalezcan el sistema inmunol�gico, tales como frutas c�tricas como limones y kiwis, que contienen" +
                                                  "\n aproximadamente 70 mg de vitamina C por cada 100 gramos, cubriendo el 100% de la ingesta diaria recomendada para un " +
                                                  "\n adulto. El ajo, con propiedades antimicrobianas, puede ayudar a combatir infecciones. El jengibre tiene efectos     " +
                                                  "\n antiinflamatorios. El yogur natural, fuente de probi�ticos, contribuye a la salud intestinal y fortalece la respuesta " +
                                                  "\n inmune. Las verduras de hoja verde como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo la  " +
                                                  "\n regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que  " +
                                                  "\n el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar  " +
                                                  "\n m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del " +
                                                  "\n diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a  " +
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 3 litros de agua al d�a para prevenir la deshidrataci�n causada    " +
                                                  "\n por la fiebre y el malestar general. Tambi�n es beneficioso el consumo de infusiones antioxidantes como t�      " +
                                                  "\n verde o agua con lim�n para ayudar a la eliminaci�n de toxinas. EJERCICIO: Se sugiere reposo absoluto durante   " +
                                                  "\n la fase aguda de la enfermedad, evitando cualquier actividad f�sica intensa hasta la recuperaci�n completa.     " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico para el Zika, pero los s�ntomas pueden aliviarse con   " +
                                                  "\n analg�sicos como paracetamol (Tylenol) para reducir la fiebre y el dolor. Se recomienda evitar el uso de aspirina " +
                                                  "\n y otros antiinflamatorios no esteroideos hasta descartar la posibilidad de dengue, para reducir el riesgo de      " +
                                                  "\n hemorragias. ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmunol�gico  " +
                                                  "\n y reducir la inflamaci�n, tales como frutas c�tricas como naranjas y toronjas, que contienen aproximadamente 60 mg" +
                                                  "\n de vitamina C por cada 100 gramos, cubriendo el 100% de la ingesta diaria recomendada para un adulto. El ajo, con " +
                                                  "\n propiedades antimicrobianas, puede ayudar a combatir infecciones. El jengibre tiene efectos antiinflamatorios.    " +
                                                  "\n El yogur natural, fuente de probi�ticos, contribuye a la salud intestinal y fortalece la respuesta inmune.        " +
                                                  "\n Las verduras de hoja verde como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo la      " +
                                                  "\n regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%  " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda" +
                                                  "\n realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la" +
                                                  "\n respuesta del diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 3 litros de agua al d�a para prevenir la deshidrataci�n causada     " +
                                                  "\n por la diarrea intensa, adem�s de soluciones de rehidrataci�n oral como Pedialyte o Enfalyte, que ayudan a       " +
                                                  "\n reponer los electrolitos perdidos. EJERCICIO: Se sugiere reposo absoluto durante la fase aguda de la enfermedad, " +
                                                  "\n evitando cualquier actividad f�sica intensa hasta la recuperaci�n completa. POSIBLE TRATAMIENTO: No existe un    " +
                                                  "\n tratamiento espec�fico para el rotavirus, pero los s�ntomas pueden aliviarse con l�quidos de rehidrataci�n y     " +
                                                  "\n una dieta adecuada. En casos graves, puede requerirse hidrataci�n intravenosa. ALIMENTACI�N: Se recomienda el    " +
                                                  "\n consumo de alimentos que ayuden a reponer los electrolitos y fortalecer el sistema digestivo, tales como pl�tanos," +
                                                  "\n que contienen aproximadamente 358 mg de potasio por cada 100 gramos, ayudando a equilibrar los electrolitos      " +
                                                  "\n perdidos. El arroz blanco, fuente de carbohidratos de f�cil digesti�n, contribuye a la recuperaci�n. El yogur    " +
                                                  "\n natural, rico en probi�ticos, favorece la salud intestinal. Las zanahorias, con aproximadamente 8 mg de          " +
                                                  "\n betacarotenos por cada 100 gramos, ayudan a fortalecer el sistema inmunol�gico. Este es solo un diagn�stico      " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que      " +
                                                  "\n las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar " +
                                                  "\n a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagn�stico no te         " +
                                                  "\n satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la         " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 litros de agua al d�a para ayudar a eliminar toxinas   " +
                                                  "\n y fortalecer el sistema inmunol�gico. Tambi�n es beneficioso el consumo de infusiones como t� de        " +
                                                  "\n manzanilla o jengibre, que poseen propiedades antimicrobianas. EJERCICIO: Se sugiere actividad f�sica   " +
                                                  "\n moderada, evitando el sobreesfuerzo y priorizando ejercicios de bajo impacto como caminatas y yoga.     " +
                                                  "\n POSIBLE TRATAMIENTO: La listeriosis se trata con antibi�ticos, siendo la ampicilina y la gentamicina    " +
                                                  "\n los m�s utilizados. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y        " +
                                                  "\n nutrientes esenciales para fortalecer el sistema inmunol�gico, tales como espinacas, que contienen      " +
                                                  "\n aproximadamente 2.7 mg de hierro por cada 100 gramos, favoreciendo la producci�n de gl�bulos rojos.     " +
                                                  "\n El ajo, rico en alicina, posee propiedades antimicrobianas. El jengibre tiene efectos antiinflamatorios.   " +
                                                  "\n El yogur natural, fuente de probi�ticos, contribuye a la salud intestinal y fortalece la respuesta inmune. " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar" +
                                                  "\n m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la " +
                                                  "\n respuesta del diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L  " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 3 litros de agua al d�a para prevenir la deshidrataci�n       " +
                                                  "\n causada por la diarrea intensa. Tambi�n es beneficioso el consumo de soluciones de rehidrataci�n oral      " +
                                                  "\n para reponer electrolitos perdidos. EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda       " +
                                                  "\n reposo absoluto para evitar el desgaste energ�tico. Una vez superada la fase cr�tica, se pueden realizar   " +
                                                  "\n caminatas suaves para mejorar la circulaci�n y la recuperaci�n. POSIBLE TRATAMIENTO: La shigelosis se      " +
                                                  "\n trata con antibi�ticos en casos graves, siendo ciprofloxacina y azitromicina los m�s utilizados para       " +
                                                  "\n combatir la infecci�n. Tambi�n pueden recetarse ceftriaxona, que act�a eliminando la bacteria Shigella.    " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema digestivo y reponer " +
                                                  "\n los electrolitos, tales como pl�tanos, que contienen aproximadamente 358 mg de potasio por cada 100 gramos," +    
                                                  "\n ayudando a equilibrar los electrolitos perdidos. El arroz blanco, fuente de carbohidratos de f�cil digesti�n,    " +
                                                  "\n contribuye a la recuperaci�n. El yogur natural, rico en probi�ticos, favorece la salud intestinal. Las zanahorias," +
                                                  "\n con aproximadamente 8 mg de betacarotenos por cada 100 gramos, ayudan a fortalecer el sistema inmunol�gico.   " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente    " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar   " +
                                                  "\n m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la    " +
                                                  "\n respuesta del diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L     " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 a 3 litros de agua al d�a para mantener las v�as         " +
                                                  "\n respiratorias hidratadas y facilitar la eliminaci�n de secreciones. Tambi�n es beneficioso el             " +
                                                  "\n consumo de infusiones calientes como t� de eucalipto o jengibre para aliviar la congesti�n pulmonar.      " +
                                                  "\n EJERCICIO: Se sugiere actividad f�sica moderada, como caminatas y ejercicios de respiraci�n, para         " +
                                                  "\n fortalecer los pulmones sin generar fatiga excesiva. Evitar ambientes con humo o contaminaci�n es         " +
                                                  "\n clave para prevenir crisis respiratorias. POSIBLE TRATAMIENTO: La EPOC se trata con broncodilatadores     " +
                                                  "\n y corticosteroides inhalados para mejorar la funci�n pulmonar. Algunos medicamentos incluyen salbutamol,  " +
                                                  "\n que act�a como broncodilatador de acci�n r�pida, tiotropio, que ayuda a reducir la obstrucci�n bronquial, " +
                                                  "\n budesonida, que disminuye la inflamaci�n de las v�as respiratorias, y roflumilast, que reduce la exacerbaci�n" +
                                                  "\n de los s�ntomas. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes     " +
                                                  "\n esenciales para fortalecer la funci�n pulmonar, tales como zanahorias, que contienen aproximadamente 8 mg    " +
                                                  "\n de betacarotenos por cada 100 gramos, ayudando a la salud respiratoria. El ajo, con propiedades antimicrobianas," +
                                                  "\n puede ayudar a combatir infecciones. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de   " +
                                                  "\n probi�ticos, contribuye a la salud intestinal y fortalece la respuesta inmune. Este es solo un diagn�stico      " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que     " +
                                                  "\n las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar" +
                                                  "\n a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagn�stico no te satisface" +
                                                  "\n del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y    " +
                                                  "\n espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 litros de agua al d�a para favorecer la eliminaci�n   " +
                                                  "\n de toxinas y fortalecer el sistema inmunol�gico. Tambi�n es beneficioso el consumo de infusiones como  " +
                                                  "\n t� de manzanilla o jengibre, que poseen propiedades antimicrobianas. EJERCICIO: Se sugiere actividad   " +
                                                  "\n f�sica moderada, evitando el sobreesfuerzo y priorizando ejercicios de bajo impacto como caminatas y   " +
                                                  "\n yoga. POSIBLE TRATAMIENTO: La clamidia se trata con antibi�ticos, siendo azitromicina, que elimina la  " +
                                                  "\n bacteria en una sola dosis, doxiciclina, que act�a inhibiendo la replicaci�n de la bacteria, levofloxacina," +
                                                  "\n que ayuda a combatir la infecci�n en casos m�s resistentes, y amoxicilina, utilizada en casos espec�ficos  " +
                                                  "\n como el embarazo. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes  " +
                                                  "\n esenciales para fortalecer el sistema inmunol�gico, tales como espinacas, que contienen aproximadamente    " +
                                                  "\n 2.7 mg de hierro por cada 100 gramos, favoreciendo la producci�n de gl�bulos rojos. El ajo, rico en alicina," +
                                                  "\n posee propiedades antimicrobianas. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente   " +
                                                  "\n de probi�ticos, contribuye a la salud intestinal y fortalece la respuesta inmune. Este es solo un diagn�stico" +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que  " +
                                                  "\n las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y       " +
                                                  "\n consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagn�stico " +
                                                  "\n no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita    " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 3 litros de agua al d�a para mantener la hidrataci�n         " +
                                                  "\n y ayudar a la eliminaci�n de toxinas generadas por la infecci�n. Tambi�n es beneficioso el consumo        " +
                                                  "\n de caldos y l�quidos tibios para aliviar el malestar general. EJERCICIO: Durante la fase aguda de         " +
                                                  "\n la enfermedad, se recomienda reposo absoluto para evitar el esfuerzo f�sico excesivo. Una vez superada    " +
                                                  "\n la fase cr�tica, se pueden realizar ejercicios de movilidad y respiraci�n para mejorar la recuperaci�n.   " +
                                                  "\n POSIBLE TRATAMIENTO: La meningitis bacteriana se trata con antibi�ticos administrados por v�a intravenosa." +
                                                  "\n Algunos medicamentos incluyen ceftriaxona, que act�a eliminando la bacteria causante de la infecci�n,     " +
                                                  "\n vancomicina, utilizada en casos de resistencia bacteriana, ampicilina, efectiva contra ciertas cepas      " +
                                                  "\n bacterianas, y meropenem, que combate infecciones graves del sistema nervioso central. ALIMENTACI�N:      " +
                                                  "\n Se recomienda el consumo de alimentos que ayuden a fortalecer el sistema inmunol�gico y reducir la        " +
                                                  "\n inflamaci�n, tales como frutas c�tricas como naranjas y toronjas, que contienen aproximadamente           " +
                                                  "\n 60 mg de vitamina C por cada 100 gramos, cubriendo el 100% de la ingesta diaria recomendada para un       " +
                                                  "\n adulto. El ajo, con propiedades antimicrobianas, puede ayudar a combatir infecciones. El jengibre         " +
                                                  "\n tiene efectos antiinflamatorios. El yogur natural, fuente de probi�ticos, contribuye a la salud           " +
                                                  "\n intestinal y fortalece la respuesta inmune. Las verduras de hoja verde como espinacas y acelgas           " +
                                                  "\n son ricas en antioxidantes y vitamina E, favoreciendo la regeneraci�n celular. Este es solo un            " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga          " +
                                                  "\n esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar     " +
                                                  "\n m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud,      " +
                                                  "\n si la respuesta del diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista.   " +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 a 3 litros de agua al d�a para mantener una adecuada hidrataci�n  " +
                                                  "\n celular y ayudar a la eliminaci�n de toxinas generadas por el tratamiento. Tambi�n es beneficioso el consumo de    " +
                                                  "\n infusiones antioxidantes como t� verde o agua con lim�n. EJERCICIO: Se sugiere actividad f�sica moderada y adaptada" +
                                                  "\n a la condici�n del paciente, como caminatas suaves, yoga o ejercicios de resistencia, evitando el sobreesfuerzo.   " +
                                                  "\n El ejercicio puede ayudar a reducir la fatiga y mejorar el bienestar general. POSIBLE TRATAMIENTO: El tratamiento  " +
                                                  "\n del c�ncer var�a seg�n el tipo y la etapa de la enfermedad, incluyendo opciones como cirug�a, quimioterapia,       " +
                                                  "\n radioterapia, inmunoterapia y terapia dirigida. Algunos medicamentos utilizados en la quimioterapia incluyen       " +
                                                  "\n paclitaxel, que inhibe la divisi�n celular del c�ncer, cisplatino, que interfiere con el ADN de las c�lulas        " +
                                                  "\n cancerosas, doxorrubicina, que bloquea la proliferaci�n celular, y nivolumab, un inmunoterap�utico que ayuda       " +
                                                  "\n al sistema inmunol�gico a combatir el c�ncer. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en         " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico y reducir la inflamaci�n, tales      " +
                                                  "\n como frutas c�tricas como naranjas y toronjas, que contienen aproximadamente 60 mg de vitamina C por cada 100      " +
                                                  "\n gramos, cubriendo el 100% de la ingesta diaria recomendada para un adulto. El ajo, con propiedades antimicrobianas," +
                                                  "\n puede ayudar a combatir infecciones. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de      " +
                                                  "\n probi�ticos, contribuye a la salud intestinal y fortalece la respuesta inmune. Las verduras de hoja verde como     " +
                                                  "\n espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo la regeneraci�n celular. Este es solo    " +
                                                  "\n un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad" +
                                                  "\n ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y      " +
                                                  "\n consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagn�stico no    " +
                                                  "\n te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app    " +
                                                  "\n (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        if(EstaturaMasculino.equals("1.55-1.70 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 litros de agua al d�a para mantener la hidrataci�n y ayudar " +
                                                  "\n a la eliminaci�n de toxinas generadas por la fiebre y la congesti�n. Tambi�n es beneficioso el consumo de    " +
                                                  "\n l�quidos calientes como t� de jengibre o caldos para aliviar la irritaci�n de garganta. En casos de fiebre   " +
                                                  "\n alta, se recomienda el consumo de sueros de rehidrataci�n oral para evitar la deshidrataci�n. EJERCICIO:     " +
                                                  "\n Durante la fase aguda de la enfermedad, se recomienda reposo absoluto para evitar el desgaste energ�tico     " +
                                                  "\n y permitir que el sistema inmunol�gico combata la infecci�n. Una vez superada la fase cr�tica, se pueden     " +
                                                  "\n realizar ejercicios de bajo impacto como caminatas suaves para mejorar la circulaci�n y la recuperaci�n.     " +
                                                  "\n POSIBLE TRATAMIENTO: La gripe se trata con antivirales como oseltamivir (Tamiflu) y zanamivir (Relenza),     " +
                                                  "\n que ayudan a reducir la duraci�n y gravedad de la enfermedad al inhibir la replicaci�n del virus. Tambi�n    " +
                                                  "\n se pueden utilizar analg�sicos y antipir�ticos como paracetamol (Tylenol) e ibuprofeno (Advil) para aliviar  " +
                                                  "\n la fiebre y el malestar general. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes  " +
                                                  "\n y nutrientes esenciales para fortalecer el sistema inmunol�gico, tales como frutas c�tricas como naranjas y  " +
                                                  "\n toronjas, que contienen aproximadamente 60 mg de vitamina C por cada 100 gramos, cubriendo el 100% de la     " +
                                                  "\n ingesta diaria recomendada para un adulto. El ajo, con propiedades antimicrobianas, puede ayudar a combatir  " +
                                                  "\n infecciones. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de probi�ticos, contribuye" +
                                                  "\n a la salud intestinal y fortalece la respuesta inmune. Las verduras de hoja verde como espinacas y acelgas son" +
                                                  "\n ricas en antioxidantes y vitamina E, favoreciendo la regeneraci�n celular. Este es solo un diagn�stico predeterminado" +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean" +
                                                  "\n completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para " +
                                                  "\n establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagn�stico no te satisface del todo, se" +
                                                  "\n recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 3 litros de agua al d�a para mantener las v�as respiratorias hidratadas   " +
                                                  "\n y facilitar la eliminaci�n de secreciones. Tambi�n es beneficioso el consumo de infusiones calientes como t� de        " +
                                                  "\n eucalipto o jengibre para aliviar la congesti�n pulmonar. En casos graves, puede requerirse hidrataci�n intravenosa    " +
                                                  "\n para evitar complicaciones. EJERCICIO: Durante la fase aguda de la enfermedad, se recomienda reposo absoluto para      " +
                                                  "\n evitar el esfuerzo respiratorio excesivo. Una vez superada la fase cr�tica, se pueden realizar ejercicios de respiraci�n" +
                                                  "\n profunda y caminatas suaves para fortalecer los pulmones y mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: La neumon�a se " +
                                                  "\n trata con antibi�ticos en caso de origen bacteriano, siendo amoxicilina (Amoxil) y azitromicina (Zithromax) los m�s    " +
                                                  "\n utilizados para combatir la infecci�n. Tambi�n pueden recetarse broncodilatadores como salbutamol (Ventolin) y         " +
                                                  "\n antiinflamatorios como prednisona (Deltasone) para mejorar la funci�n pulmonar y reducir la inflamaci�n. ALIMENTACI�N: " +
                                                  "\n Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema        " +
                                                  "\n inmunol�gico y mejorar la funci�n pulmonar, tales como zanahorias, que contienen aproximadamente 8 mg de betacarotenos " +
                                                  "\n por cada 100 gramos, ayudando a la salud respiratoria. El ajo, con propiedades antimicrobianas, puede ayudar a combatir" +
                                                  "\n infecciones. El jengibre tiene efectos antiinflamatorios. El yogur natural, fuente de probi�ticos, contribuye a la salud" +
                                                  "\n intestinal y fortalece la respuesta inmune. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no   " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, " +
                                                  "\n se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Por tu   " +
                                                  "\n salud, si la respuesta del diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel   " +
                                                  "\n L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 litros de agua al d�a para mantener una adecuada hidrataci�n    " +
                                                  "\n celular y ayudar a la regulaci�n de la glucosa en sangre. Tambi�n es beneficioso el consumo de infusiones sin    " +
                                                  "\n az�car como t� verde o agua con lim�n para mejorar la sensibilidad a la insulina. EJERCICIO: Se sugiere actividad" +
                                                  "\n f�sica moderada y adaptada a la condici�n del paciente, como caminatas diarias de al menos 30 minutos, nataci�n  " +
                                                  "\n o ejercicios de resistencia para mejorar la sensibilidad a la insulina y controlar los niveles de glucosa.       " +
                                                  "\n POSIBLE TRATAMIENTO: La diabetes se trata con medicamentos como metformina (Glucophage), que ayuda a reducir     " +
                                                  "\n la producci�n de glucosa en el h�gado, insulina (Lantus, Humalog) para regular los niveles de az�car en sangre,  " +
                                                  "\n y empagliflozina (Jardiance), que favorece la eliminaci�n de glucosa a trav�s de la orina. ALIMENTACI�N: Se      " +
                                                  "\n recomienda el consumo de alimentos ricos en fibra y nutrientes esenciales para estabilizar los niveles de glucosa," +
                                                  "\n tales como avena, que contiene aproximadamente 4 g de fibra por cada 100 gramos, ayudando a la regulaci�n del az�car" +
                                                  "\n en sangre. Frutas como fresas y manzanas, ricas en antioxidantes y fibra. Frutos secos como almendras y nueces,     " +
                                                  "\n que contienen grasas saludables. Verduras de hoja verde como espinacas y acelgas, ricas en antioxidantes y vitamina E." +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s de un diagn�stico" +
                                                  "\n y consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del diagn�stico no te  " +
                                                  "\n satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita a la    " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 litros de agua al d�a para mantener las v�as respiratorias     " +
                                                  "\n hidratadas y reducir la viscosidad de las secreciones bronquiales, facilitando la respiraci�n. Tambi�n es       " +
                                                  "\n beneficioso el consumo de infusiones como t� de jengibre o manzanilla, que poseen propiedades antiinflamatorias." +
                                                  "\n EJERCICIO: Se sugiere actividad f�sica moderada y controlada, con calentamiento previo y enfriamiento posterior." +
                                                  "\n Ejercicios como nataci�n, caminatas y yoga pueden mejorar la capacidad pulmonar sin provocar crisis asm�ticas.  " +
                                                  "\n Se recomienda evitar ambientes con humo, contaminaci�n o temperaturas extremas. POSIBLE TRATAMIENTO:            " +
                                                  "\n El asma se trata con broncodilatadores y corticosteroides inhalados. Algunos medicamentos incluyen salbutamol,  " +
                                                  "\n que act�a como broncodilatador de acci�n r�pida, budesonida, que reduce la inflamaci�n de las v�as respiratorias," +
                                                  "\n y montelukast, que ayuda a prevenir crisis asm�ticas. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en" +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer la funci�n pulmonar, tales como pescados grasos como salm�n " +
                                                  "\n y at�n, que contienen aproximadamente 1.8 g de �cidos grasos Omega-3 por cada 100 gramos, ayudando a reducir la   " +
                                                  "\n inflamaci�n. Frutas y verduras de colores vivos como fresas y espinacas, ricas en antioxidantes y vitamina C.     " +
                                                  "\n Jengibre y c�rcuma, con propiedades antiinflamatorias. Frutos secos como almendras y nueces, ricos en vitamina E  " +
                                                  "\n y �cidos grasos saludables. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se      " +
                                                  "\n recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado.        " +
                                                  "\n Por tu salud, si la respuesta del diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista." +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 3 litros de agua al d�a para mantener una adecuada hidrataci�n celular     " +
                                                  "\n y ayudar a la eliminaci�n de toxinas generadas por el tratamiento antirretroviral. Tambi�n es beneficioso el consumo    " +
                                                  "\n de infusiones antioxidantes como t� verde o agua con lim�n. EJERCICIO: Se sugiere actividad f�sica moderada y adaptada  " +
                                                  "\n a la condici�n del paciente, como caminatas suaves, yoga o ejercicios de resistencia, evitando el sobreesfuerzo.        " +
                                                  "\n El ejercicio puede ayudar a reducir la fatiga y mejorar el bienestar general. POSIBLE TRATAMIENTO: El VIH/SIDA se trata " +
                                                  "\n con terapia antirretroviral (TAR), que combina varios medicamentos para reducir la carga viral y fortalecer el sistema  " +
                                                  "\n inmunol�gico. Algunos medicamentos incluyen tenofovir, que inhibe la replicaci�n del virus, efavirenz, que bloquea la   " +
                                                  "\n acci�n del VIH en las c�lulas, dolutegravir, que impide la integraci�n del virus en el ADN celular, y lamivudina, que   " +
                                                  "\n ayuda a reducir la progresi�n de la enfermedad. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes" +
                                                  "\n y nutrientes esenciales para fortalecer el sistema inmunol�gico, tales como frutas c�tricas como naranjas y toronjas,   " +
                                                  "\n que contienen aproximadamente 60 mg de vitamina C por cada 100 gramos, cubriendo el 100% de la ingesta diaria recomendada" +
                                                  "\n para un adulto. El ajo, con propiedades antimicrobianas, puede ayudar a combatir infecciones. El jengibre tiene efectos " +
                                                  "\n antiinflamatorios. El yogur natural, fuente de probi�ticos, contribuye a la salud intestinal y fortalece la respuesta   " +
                                                  "\n inmune. Las verduras de hoja verde como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo la    " +
                                                  "\n regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar m�s" +
                                                  "\n de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la respuesta del    " +
                                                  "\n diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L Montes agradece tu visita   " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 litros de agua al d�a para favorecer la eliminaci�n de toxinas   " +
                                                  "\n y fortalecer el sistema inmunol�gico. Tambi�n es beneficioso el consumo de infusiones como t� de manzanilla o     " +
                                                  "\n jengibre, que poseen propiedades antimicrobianas. EJERCICIO: Se sugiere actividad f�sica moderada, evitando el    " +
                                                  "\n sobreesfuerzo y priorizando ejercicios de bajo impacto como caminatas y yoga. POSIBLE TRATAMIENTO: La gonorrea    " +
                                                  "\n se trata con antibi�ticos, siendo la ceftriaxona y azitromicina los m�s utilizados para combatir la infecci�n.    " +
                                                  "\n Tambi�n pueden recetarse doxiciclina en casos de coinfecci�n con clamidia. ALIMENTACI�N: Se recomienda el consumo " +
                                                  "\n de alimentos ricos en antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico, tales como   " +
                                                  "\n espinacas, que contienen aproximadamente 2.7 mg de hierro por cada 100 gramos, favoreciendo la producci�n de      " +
                                                  "\n gl�bulos rojos. El ajo, rico en alicina, posee propiedades antimicrobianas. El jengibre tiene efectos antiinflamatorios." +
                                                  "\n El yogur natural, fuente de probi�ticos, contribuye a la salud intestinal y fortalece la respuesta inmune.        " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente        " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello, se recomienda realizar       " +
                                                  "\n m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado. Por tu salud, si la        " +
                                                  "\n respuesta del diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista. Angel L         " +
                                                  "\n Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 litros de agua al d�a para mantener la hidrataci�n celular y fortalecer   " +
                                                  "\n el sistema inmunol�gico, lo que ayuda a reducir la frecuencia de los brotes. Tambi�n es beneficioso el consumo de          " +
                                                  "\n infusiones antioxidantes como t� verde o agua con lim�n. EJERCICIO: Se sugiere actividad f�sica moderada, evitando         " +
                                                  "\n el sobreesfuerzo y el estr�s, ya que estos pueden desencadenar brotes. Actividades como caminatas, yoga y ejercicios       " +
                                                  "\n de bajo impacto pueden ser beneficiosos para la salud general y el sistema inmunol�gico. POSIBLE TRATAMIENTO: El herpes    " +
                                                  "\n genital no tiene cura definitiva, pero existen tratamientos para reducir los s�ntomas y la frecuencia de los brotes.       " +
                                                  "\n Los antivirales como aciclovir, valaciclovir y famciclovir son com�nmente recetados para controlar la infecci�n,           " +
                                                  "\n ayudando a reducir la replicaci�n del virus y la duraci�n de los s�ntomas. ALIMENTACI�N: Se recomienda el consumo          " +
                                                  "\n de alimentos que fortalezcan el sistema inmunol�gico y ayuden a reducir la inflamaci�n, tales como frutas c�tricas         " +
                                                  "\n como naranjas y limones, que contienen aproximadamente 60 mg de vitamina C por cada 100 gramos, cubriendo el 100%          " +
                                                  "\n de la ingesta diaria recomendada para un adulto. El ajo, rico en alicina, posee propiedades antivirales y antiinflamatorias." +
                                                  "\n El jengibre tiene efectos antiinflamatorios que pueden ayudar a reducir el malestar. El yogur natural, fuente de probi�ticos," +
                                                  "\n contribuye a la salud intestinal y fortalece la respuesta inmune. Las verduras de hoja verde como espinacas y acelgas son  " +
                                                  "\n ricas en antioxidantes y vitamina E, favoreciendo la regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico," +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente     " +
                                                  "\n correctas. Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento  " +
                                                  "\n adecuado. Por tu salud, si la respuesta del diagn�stico no te satisface del todo, se recomienda mucho acudir a un especialista." +
                                                  "\n Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 2.5 litros de agua al d�a para favorecer la eliminaci�n de toxinas    " +
                                                  "\n y fortalecer el sistema inmunol�gico. Tambi�n es beneficioso el consumo de infusiones como t� de manzanilla o      " +
                                                  "\n jengibre, que poseen propiedades antimicrobianas. EJERCICIO: Se sugiere actividad f�sica moderada, evitando el     " +
                                                  "\n sobreesfuerzo y priorizando ejercicios de bajo impacto como caminatas y yoga, ya que el estr�s f�sico puede afectar" +
                                                  "\n la recuperaci�n. POSIBLE TRATAMIENTO: La s�filis se trata con antibi�ticos, siendo la penicilina G benzatina el    " +
                                                  "\n medicamento de primera elecci�n, que act�a eliminando la bacteria Treponema pallidum. En casos de alergia a la     " +
                                                  "\n penicilina, se pueden utilizar alternativas como doxiciclina o ceftriaxona, que tambi�n combaten la infecci�n.     " +
                                                  "\n ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en antioxidantes y nutrientes esenciales para la         " +
                                                  "\n regeneraci�n celular y el fortalecimiento del sistema inmune, tales como frutas c�tricas como naranjas y limones,  " +
                                                  "\n que contienen aproximadamente 60 mg de vitamina C por cada 100 gramos, cubriendo el 100% de la ingesta diaria      " +
                                                  "\n recomendada para un adulto. El ajo, rico en alicina, posee propiedades antimicrobianas. El jengibre tiene efectos  " +
                                                  "\n antiinflamatorios. El yogur natural, fuente de probi�ticos, contribuye a la salud intestinal y fortalece la        " +
                                                  "\n respuesta inmune. Las verduras de hoja verde como espinacas y acelgas son ricas en antioxidantes y vitamina E,     " +
                                                  "\n favoreciendo la regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no     " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas.        " +
                                                  "\n Para ello, se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento     " +
                                                  "\n adecuado. Por tu salud, si la respuesta del diagn�stico no te satisface del todo, se recomienda mucho acudir a     " +
                                                  "\n un especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB)." +
                                                  "\n HIDRATACI�N: Se recomienda consumir al menos 3 litros de agua al d�a para mantener las v�as respiratorias  " +
                                                  "\n hidratadas y facilitar la eliminaci�n de secreciones. Tambi�n es beneficioso el consumo de infusiones      " +
                                                  "\n calientes como t� de eucalipto o jengibre para aliviar la congesti�n pulmonar. EJERCICIO: Durante la       " +
                                                  "\n fase aguda de la enfermedad, se recomienda reposo absoluto para evitar el esfuerzo respiratorio excesivo.  " +
                                                  "\n Una vez superada la fase cr�tica, se pueden realizar ejercicios de respiraci�n profunda y caminatas suaves " +
                                                  "\n para fortalecer los pulmones y mejorar la oxigenaci�n. POSIBLE TRATAMIENTO: La tuberculosis se trata con   " +
                                                  "\n una combinaci�n de antibi�ticos administrados por un per�odo prolongado. Los medicamentos m�s utilizados   " +
                                                  "\n incluyen isoniazida, que inhibe la s�ntesis de la pared celular de la bacteria, rifampicina, que bloquea   " +
                                                  "\n la replicaci�n del bacilo, etambutol, que impide el crecimiento de la bacteria, y pirazinamida, que ayuda  " +
                                                  "\n a eliminar la infecci�n en los pulmones. ALIMENTACI�N: Se recomienda el consumo de alimentos ricos en      " +
                                                  "\n antioxidantes y nutrientes esenciales para fortalecer el sistema inmunol�gico y mejorar la funci�n pulmonar," +
                                                  "\n tales como frutas c�tricas como toronjas y kiwis, que contienen aproximadamente 70 mg de vitamina C por cada" +
                                                  "\n 100 gramos, cubriendo el 100% de la ingesta diaria recomendada para un adulto. El ajo, con propiedades      " +
                                                  "\n antimicrobianas, puede ayudar a combatir infecciones. El jengibre tiene efectos antiinflamatorios.          " +
                                                  "\n El yogur natural, fuente de probi�ticos, contribuye a la salud intestinal y fortalece la respuesta inmune.  " +
                                                  "\n Las verduras de hoja verde como espinacas y acelgas son ricas en antioxidantes y vitamina E, favoreciendo   " +
                                                  "\n la regeneraci�n celular. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas. Para ello," +
                                                  "\n se recomienda realizar m�s de un diagn�stico y consultar a un m�dico para establecer el tratamiento adecuado." +
                                                  "\n Por tu salud, si la respuesta del diagn�stico no te satisface del todo, se recomienda mucho acudir a un     " +
                                                  "\n especialista. Angel L Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer ARTRITIS." +
                                                  "\n Para un hombre joven de entre 22 y 29 a�os con artritis, es fundamental mantener un estilo de vida activo pero   " +
                                                  "\n adaptado a la condici�n. EJERCICIO: Se recomienda realizar actividades de bajo impacto como nataci�n, yoga o     " +
                                                  "\n caminatas moderadas para fortalecer las articulaciones sin sobrecargarlas, con al menos 30 minutos diarios de    " +
                                                  "\n actividad f�sica controlada para mejorar la movilidad y reducir la rigidez. HIDRATACI�N: Es crucial el consumo   " +
                                                  "\n diario de 2 a 2.5 litros de agua (ocho a diez vasos de tama�o regular) para mantener la lubricaci�n de las       " +
                                                  "\n articulaciones y reducir la inflamaci�n. POSIBLE TRATAMIENTO: Para la artritis en adultos j�venes, el tratamiento" +
                                                  "\n suele incluir f�rmacos antirreum�ticos modificadores de la enfermedad (FAMEs) como el metotrexato, que ayuda a   " +
                                                  "\n reducir la inflamaci�n y el da�o articular, adem�s de corticoesteroides en casos espec�ficos para controlar los  " +
                                                  "\n brotes de inflamaci�n. Tambi�n pueden recetarse antiinflamatorios no esteroideos (AINEs) como el ibuprofeno o el " +
                                                  "\n naproxeno, con marcas reconocidas como Tempra, Advil y Flanax. Es fundamental seguir las indicaciones m�dicas y  " +
                                                  "\n realizar controles peri�dicos para ajustar el tratamiento seg�n la evoluci�n de la enfermedad. ALIMENTACI�N: Se  " +
                                                  "\n recomienda consumir alimentos que ayuden a reducir la inflamaci�n y fortalecer las articulaciones, tales como    " +
                                                  "\n pescados grasos (salm�n, at�n, sardina) ricos en Omega-3 con propiedades antiinflamatorias, frutas c�tricas      " +
                                                  "\n (naranjas, limones, toronjas) ricas en vitamina C esencial para la producci�n de col�geno y la salud articular,  " +
                                                  "\n verduras de hoja verde (espinacas, kale, acelgas) que contienen antioxidantes y vitamina K para reducir la inflamaci�n," +
                                                  "\n jengibre y c�rcuma con efectos antiinflamatorios naturales, y frutos secos (almendras, nueces) ricos en magnesio que   " +
                                                  "\n contribuye a la relajaci�n muscular y la salud �sea. Por ejemplo, 100 gramos de naranja contienen aproximadamente 53 mg" +
                                                  "\n de vitamina C, lo que equivale al 88% de la ingesta diaria recomendada para un adulto. Este es solo un diagn�stico     " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas" +
                                                  "\n sean completamente correctas, para ello se recomienda realizar m�s de un diagn�stico en Mi Vida para establecer mayor     " +
                                                  "\n seguridad en el tratamiento adecuado del paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface    " +
                                                  "\n del todo se recomienda consultar a su m�dico, �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Es una infecci�n bacteriana altamente contagiosa que afecta las v�as respiratorias, causando ataques de tos intensos     " +
                                                  "\n y persistentes. EJERCICIO: Se recomienda actividad f�sica moderada sin sobreesfuerzo, evitando ambientes fr�os o         " +
                                                  "\n contaminados que puedan agravar los s�ntomas, con caminatas ligeras de 20 a 30 minutos diarios para mejorar la capacidad " +
                                                  "\n pulmonar y reducir la fatiga. HIDRATACI�N: Es fundamental consumir al menos 2.5 litros de agua al d�a (diez vasos de     " +
                                                  "\n tama�o regular) para mantener las v�as respiratorias hidratadas y reducir la irritaci�n de la garganta, adem�s de incluir" +
                                                  "\n infusiones tibias para aliviar la tos. POSIBLE TRATAMIENTO: Se utilizan antibi�ticos como la azitromicina y claritromicina" +
                                                  "\n para combatir la infecci�n y reducir el periodo de contagio. Marcas reconocidas que contienen estos medicamentos incluyen " +
                                                  "\n Zithromax y Klaricid. Tambi�n se pueden emplear medicamentos para aliviar la tos y la inflamaci�n, como el paracetamol,   " +
                                                  "\n con marcas como Tempra y Tylenol. Adem�s, se recomienda el uso de humidificadores para mantener el aire h�medo y evitar   " +
                                                  "\n irritaciones en la garganta. ALIMENTACI�N: Se recomienda consumir alimentos que ayuden a fortalecer el sistema inmunol�gico" +
                                                  "\n y reducir la inflamaci�n, tales como c�tricos (naranjas, limones, toronjas) ricos en vitamina C, que contribuyen a la     " +
                                                  "\n recuperaci�n, miel con propiedades antibacterianas y calmantes para la garganta, jengibre con efectos antiinflamatorios   " +
                                                  "\n naturales, y ajo con propiedades antimicrobianas. Por ejemplo, 100 gramos de lim�n contienen aproximadamente 53 mg de     " +
                                                  "\n vitamina C, lo que equivale al 88% de la ingesta diaria recomendada para un adulto. Este es solo un diagn�stico predeterminado" +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente" +
                                                  "\n correctas, para ello se recomienda realizar m�s de un diagn�stico en Mi Vida para establecer mayor seguridad en el tratamiento" +
                                                  "\n adecuado del paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar " +
                                                  "\n a su m�dico, �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Es una infecci�n viral que causa inflamaci�n de las gl�ndulas salivales y puede afectar otras partes del cuerpo." +
                                                  "\n EJERCICIO: Se recomienda reposo y evitar actividades f�sicas intensas durante la fase aguda de la enfermedad,   " +
                                                  "\n retomando ejercicios ligeros como estiramientos y caminatas suaves una vez que los s�ntomas disminuyan.         " +
                                                  "\n HIDRATACI�N: Es importante consumir al menos 2 litros de agua al d�a (ocho vasos de tama�o regular) para        " +
                                                  "\n mantener la hidrataci�n y aliviar la inflamaci�n de las gl�ndulas, adem�s de incluir caldos y jugos naturales   " +
                                                  "\n para facilitar la recuperaci�n. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico, pero se pueden utilizar" +
                                                  "\n analg�sicos como el ibuprofeno y paracetamol para reducir el dolor y la inflamaci�n. Marcas reconocidas que      " +
                                                  "\n contienen estos medicamentos incluyen Advil y Flanax para el ibuprofeno, y Tempra y Tylenol para el paracetamol. " +
                                                  "\n Tambi�n se recomienda el uso de compresas fr�as en la zona afectada para aliviar la inflamaci�n y el dolor.      " +
                                                  "\n ALIMENTACI�N: Se recomienda consumir alimentos suaves y f�ciles de masticar que ayuden a reducir la inflamaci�n  " +
                                                  "\n y fortalecer el sistema inmunol�gico, tales como yogur rico en probi�ticos para mejorar la salud digestiva,      " +
                                                  "\n papaya con enzimas que facilitan la digesti�n y reducen la inflamaci�n, y espinacas con antioxidantes y vitamina K." +
                                                  "\n Por ejemplo, 100 gramos de papaya contienen aproximadamente 60 mg de vitamina C, lo que equivale al 100% de la ingesta" +
                                                  "\n diaria recomendada para un adulto. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello se recomienda" +
                                                  "\n realizar m�s de un diagn�stico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente, adem�s" +
                                                  "\n por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico, �ngel L. Montes" +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n Es una infecci�n viral transmitida por mosquitos que puede causar fiebre, erupciones cut�neas y dolor muscular.   " +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica ligera como yoga o caminatas suaves para mejorar la circulaci�n y       " +
                                                  "\n reducir la fatiga, evitando esfuerzos excesivos que puedan agravar los s�ntomas. HIDRATACI�N: Es esencial         " +
                                                  "\n consumir al menos 2.5 litros de agua al d�a (diez vasos de tama�o regular) para prevenir la deshidrataci�n        " +
                                                  "\n y ayudar a la eliminaci�n de toxinas, adem�s de incluir agua de coco y jugos naturales para reponer electrolitos. " +
                                                  "\n POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico, pero se pueden utilizar analg�sicos como el paracetamol " +
                                                  "\n para aliviar la fiebre y el dolor. Marcas reconocidas que contienen este medicamento incluyen Tempra y Tylenol.   " +
                                                  "\n Tambi�n se recomienda reposo y una adecuada hidrataci�n para facilitar la recuperaci�n. ALIMENTACI�N: Se recomienda" +
                                                  "\n consumir alimentos ricos en antioxidantes y propiedades antiinflamatorias que ayuden a fortalecer el sistema       " +
                                                  "\n inmunol�gico, tales como frutos rojos (ar�ndanos, fresas) con antioxidantes que protegen las c�lulas, c�rcuma      " +
                                                  "\n con propiedades antiinflamatorias, y zanahorias con betacarotenos que fortalecen la respuesta inmune. Por ejemplo, " +
                                                  "\n 100 gramos de fresas contienen aproximadamente 59 mg de vitamina C, lo que equivale al 98% de la ingesta diaria    " +
                                                  "\n recomendada para un adulto. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza     " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello se     " +
                                                  "\n recomienda realizar m�s de un diagn�stico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado    " +
                                                  "\n del paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar " +
                                                  "\n a su m�dico, �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n Es una infecci�n viral que causa gastroenteritis severa, provocando diarrea, v�mitos y fiebre. EJERCICIO:       " +
                                                  "\n Se recomienda actividad f�sica ligera como caminatas suaves de 15 a 20 minutos diarios para evitar la fatiga    " +
                                                  "\n y mejorar la recuperaci�n, evitando esfuerzos intensos que puedan agravar la deshidrataci�n.                    " +
                                                  "\n HIDRATACI�N: Es esencial consumir al menos 3 litros de agua al d�a (doce vasos de tama�o regular) para reponer  " +
                                                  "\n l�quidos perdidos por la diarrea y los v�mitos, adem�s de incluir soluciones de rehidrataci�n oral como Pedialyte" +
                                                  "\n para equilibrar electrolitos. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico, pero se recomienda el uso" +
                                                  "\n de soluciones de rehidrataci�n oral para prevenir la deshidrataci�n. Tambi�n pueden utilizarse medicamentos para " +
                                                  "\n aliviar los s�ntomas, como el paracetamol para la fiebre y el dolor. Marcas reconocidas que contienen estos      " +
                                                  "\n medicamentos incluyen Tempra y Tylenol. ALIMENTACI�N: Se recomienda consumir alimentos f�ciles de digerir y      " +
                                                  "\n ricos en nutrientes esenciales para la recuperaci�n, tales como arroz blanco, pl�tanos ricos en potasio para     " +
                                                  "\n reponer electrolitos, zanahorias con betacarotenos que fortalecen el sistema digestivo, y yogur con probi�ticos  " +
                                                  "\n para restaurar la flora intestinal. Por ejemplo, 100 gramos de pl�tano contienen aproximadamente 358 mg de potasio," +
                                                  "\n lo que equivale al 8% de la ingesta diaria recomendada para un adulto. Este es solo un diagn�stico predeterminado  " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean   " +
                                                  "\n completamente correctas, para ello se recomienda realizar m�s de un diagn�stico en Mi Vida para establecer mayor   " +
                                                  "\n seguridad en el tratamiento adecuado del paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface" +
                                                  "\n del todo se recomienda consultar a su m�dico, �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n Es una infecci�n bacteriana causada por Listeria monocytogenes, que puede provocar fiebre, dolor muscular y s�ntomas     " +
                                                  "\n gastrointestinales. EJERCICIO: Se recomienda actividad f�sica moderada como caminatas de 30 minutos diarios para         " +
                                                  "\n mejorar la circulaci�n y fortalecer el sistema inmunol�gico, evitando esfuerzos excesivos que puedan agravar la fatiga.  " +
                                                  "\n HIDRATACI�N: Es fundamental consumir al menos 2.5 litros de agua al d�a (diez vasos de tama�o regular) para mantener la  " +
                                                  "\n hidrataci�n y ayudar a la eliminaci�n de toxinas, adem�s de incluir caldos y jugos naturales para facilitar la recuperaci�n." +
                                                  "\n POSIBLE TRATAMIENTO: Se utilizan antibi�ticos como la ampicilina y la gentamicina para combatir la infecci�n. Marcas        " +
                                                  "\n reconocidas que contienen estos medicamentos incluyen Ampicilina MK y Gentamicina Normon. Tambi�n se recomienda reposo      " +
                                                  "\n y una adecuada hidrataci�n para facilitar la recuperaci�n. ALIMENTACI�N: Se recomienda consumir alimentos ricos en          " +
                                                  "\n antioxidantes y propiedades antibacterianas que ayuden a fortalecer el sistema inmunol�gico, tales como ajo con propiedades " +
                                                  "\n antimicrobianas, jengibre con efectos antiinflamatorios naturales, espinacas con antioxidantes y vitamina K, y zanahorias   " +
                                                  "\n con betacarotenos que fortalecen la respuesta inmune. Por ejemplo, 100 gramos de zanahoria contienen aproximadamente 8.3 mg " +
                                                  "\n de betacarotenos, lo que equivale al 69% de la ingesta diaria recomendada para un adulto. Este es solo un diagn�stico       " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas  " +
                                                  "\n sean completamente correctas, para ello se recomienda realizar m�s de un diagn�stico en Mi Vida para establecer mayor       " +
                                                  "\n seguridad en el tratamiento adecuado del paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface      " +
                                                  "\n del todo se recomienda consultar a su m�dico, �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n Es una infecci�n bacteriana que afecta el sistema digestivo, causando diarrea, fiebre y dolor abdominal.    " +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica ligera como estiramientos y caminatas suaves de 15 a 20 minutos   " +
                                                  "\n diarios para mejorar la circulaci�n y reducir la fatiga, evitando esfuerzos intensos que puedan agravar los " +
                                                  "\n s�ntomas. HIDRATACI�N: Es esencial consumir al menos 3 litros de agua al d�a (doce vasos de tama�o regular) " +
                                                  "\n para prevenir la deshidrataci�n y ayudar a la eliminaci�n de toxinas, adem�s de incluir soluciones de rehidrataci�n         " +
                                                  "\n oral como Electrolit para equilibrar electrolitos. POSIBLE TRATAMIENTO: Se utilizan antibi�ticos como la ciprofloxacina     " +
                                                  "\n y la azitromicina para combatir la infecci�n. Marcas reconocidas que contienen estos medicamentos incluyen Ciproxina        " +
                                                  "\n y Zithromax. Tambi�n se recomienda reposo y una adecuada hidrataci�n para facilitar la recuperaci�n. ALIMENTACI�N:          " +
                                                  "\n Se recomienda consumir alimentos ricos en fibra y propiedades antibacterianas que ayuden a fortalecer el sistema            " +
                                                  "\n digestivo, tales como arroz integral con fibra para mejorar la digesti�n, pl�tanos ricos en potasio para reponer            " +
                                                  "\n electrolitos, yogur con probi�ticos para restaurar la flora intestinal, y c�rcuma con propiedades antiinflamatorias.        " +
                                                  "\n Por ejemplo, 100 gramos de yogur contienen aproximadamente 3.5 gramos de prote�na, lo que equivale al 7% de la ingesta      " +
                                                  "\n diaria recomendada para un adulto. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza       " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello se recomienda   " +
                                                  "\n realizar m�s de un diagn�stico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente, adem�s   " +
                                                  "\n por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico, �ngel L. Montes  " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n Es una afecci�n respiratoria cr�nica que causa dificultad para respirar debido a la obstrucci�n del flujo de aire en   " +
                                                  "\n los pulmones. EJERCICIO: Se recomienda actividad f�sica moderada como caminatas de 30 a 45 minutos diarios, nataci�n   " +
                                                  "\n o ejercicios de respiraci�n para fortalecer los m�sculos respiratorios y mejorar la capacidad pulmonar, evitando       " +
                                                  "\n ambientes con contaminaci�n o humo de tabaco. HIDRATACI�N: Es fundamental consumir al menos 2.5 litros de agua al      " +
                                                  "\n d�a (diez vasos de tama�o regular) para mantener la hidrataci�n de las v�as respiratorias y facilitar la eliminaci�n   " +
                                                  "\n de secreciones. POSIBLE TRATAMIENTO: Se utilizan broncodilatadores de acci�n prolongada como el salmeterol y el        " +
                                                  "\n formoterol para mejorar la respiraci�n, adem�s de corticosteroides inhalados como la fluticasona para reducir la       " +
                                                  "\n inflamaci�n pulmonar. Marcas reconocidas que contienen estos medicamentos incluyen Seretide y Symbicort. Tambi�n       " +
                                                  "\n pueden recetarse mucol�ticos como la acetilciste�na para facilitar la expulsi�n de flemas, con marcas como Fluimucil   " +
                                                  "\n y Bisolvon. ALIMENTACI�N: Se recomienda consumir alimentos ricos en antioxidantes y propiedades antiinflamatorias que  " +
                                                  "\n ayuden a fortalecer el sistema respiratorio, tales como frutos rojos (ar�ndanos, fresas) con antioxidantes que protegen" +
                                                  "\n las c�lulas, c�rcuma con propiedades antiinflamatorias, y zanahorias con betacarotenos que fortalecen la respuesta inmune." +
                                                  "\n Por ejemplo, 100 gramos de zanahoria contienen aproximadamente 8.3 mg de betacarotenos, lo que equivale al 69% de la   " +
                                                  "\n ingesta diaria recomendada para un adulto. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no    " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello  " +
                                                  "\n se recomienda realizar m�s de un diagn�stico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del " +
                                                  "\n paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico," +
                                                  "\n �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n Es una infecci�n de transmisi�n sexual causada por la bacteria Chlamydia trachomatis, que puede afectar el sistema urinario  " +
                                                  "\n y reproductivo. EJERCICIO: Se recomienda actividad f�sica moderada como caminatas de 30 minutos diarios para mejorar la      " +
                                                  "\n circulaci�n y fortalecer el sistema inmunol�gico, evitando esfuerzos excesivos que puedan agravar la fatiga.                 " +
                                                  "\n HIDRATACI�N: Es fundamental consumir al menos 2 litros de agua al d�a (ocho vasos de tama�o regular) para mantener la        " +
                                                  "\n hidrataci�n y ayudar a la eliminaci�n de toxinas, adem�s de incluir jugos naturales ricos en vitamina C para fortalecer el   " +
                                                  "\n sistema inmunol�gico. POSIBLE TRATAMIENTO: Se utilizan antibi�ticos como la azitromicina y la doxiciclina para eliminar la   " +
                                                  "\n infecci�n. Marcas reconocidas que contienen estos medicamentos incluyen Zithromax y Vibramycin. Tambi�n se recomienda evitar " +
                                                  "\n el contacto sexual hasta completar el tratamiento y realizar pruebas de seguimiento para confirmar la eliminaci�n de la      " +
                                                  "\n bacteria. ALIMENTACI�N: Se recomienda consumir alimentos ricos en antioxidantes y propiedades antibacterianas que ayuden     " +
                                                  "\n a fortalecer el sistema inmunol�gico, tales como ajo con propiedades antimicrobianas, jengibre con efectos antiinflamatorios " +
                                                  "\n naturales, espinacas con antioxidantes y vitamina K, y zanahorias con betacarotenos que fortalecen la respuesta inmune.      " +
                                                  "\n Por ejemplo, 100 gramos de espinaca contienen aproximadamente 482 mcg de vitamina K, lo que equivale al 402% de la ingesta   " +
                                                  "\n diaria recomendada para un adulto. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%" +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello se recomienda realizar m�s" +
                                                  "\n de un diagn�stico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente, adem�s por su salud si la" +
                                                  "\n respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico, �ngel L. Montes agradece tu visita a la" +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n Es una infecci�n grave que causa inflamaci�n de las membranas que rodean el cerebro y la m�dula espinal, pudiendo      " +
                                                  "\n provocar fiebre alta, rigidez en el cuello y alteraciones neurol�gicas. EJERCICIO: Se recomienda reposo absoluto       " +
                                                  "\n durante la fase aguda de la enfermedad, retomando actividad f�sica ligera como caminatas suaves de 15 a 20 minutos     " +
                                                  "\n diarios una vez que los s�ntomas disminuyan para mejorar la circulaci�n y la recuperaci�n. HIDRATACI�N: Es esencial    " +
                                                  "\n consumir al menos 3 litros de agua al d�a (doce vasos de tama�o regular) para prevenir la deshidrataci�n y ayudar a    " +
                                                  "\n la eliminaci�n de toxinas, adem�s de incluir caldos y jugos naturales para facilitar la recuperaci�n.                  " +
                                                  "\n POSIBLE TRATAMIENTO: Se utilizan antibi�ticos intravenosos como la ceftriaxona y la vancomicina para combatir la infecci�n." +
                                                  "\n Marcas reconocidas que contienen estos medicamentos incluyen Rocephin y Vancocin. Tambi�n pueden recetarse corticosteroides" +
                                                  "\n como la dexametasona para reducir la inflamaci�n cerebral, con marcas como Decadron y Maxidex. ALIMENTACI�N: Se recomienda " +
                                                  "\n consumir alimentos ricos en antioxidantes y propiedades antiinflamatorias que ayuden a fortalecer el sistema inmunol�gico, " +
                                                  "\n tales como frutos rojos (ar�ndanos, fresas) con antioxidantes que protegen las c�lulas, c�rcuma con propiedades antiinflamatorias," +
                                                  "\n y zanahorias con betacarotenos que fortalecen la respuesta inmune. Por ejemplo, 100 gramos de fresas contienen aproximadamente    " +
                                                  "\n 59 mg de vitamina C, lo que equivale al 98% de la ingesta diaria recomendada para un adulto. Este es solo un diagn�stico          " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas        " +
                                                  "\n sean completamente correctas, para ello se recomienda realizar m�s de un diagn�stico en Mi Vida para establecer mayor seguridad   " +
                                                  "\n en el tratamiento adecuado del paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se          " +
                                                  "\n recomienda consultar a su m�dico, �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n Es una enfermedad caracterizada por el crecimiento descontrolado de c�lulas anormales en el cuerpo, pudiendo afectar    " +
                                                  "\n distintos �rganos y sistemas. EJERCICIO: Se recomienda actividad f�sica moderada adaptada a la condici�n del paciente,  " +
                                                  "\n como caminatas de 30 minutos diarios, yoga o ejercicios de resistencia para mejorar la movilidad y reducir la fatiga,   " +
                                                  "\n evitando esfuerzos excesivos que puedan comprometer el sistema inmunol�gico. HIDRATACI�N: Es fundamental consumir al    " +
                                                  "\n menos 2.5 a 3 litros de agua al d�a (diez a doce vasos de tama�o regular) para mantener la hidrataci�n celular y facilitar " +
                                                  "\n la eliminaci�n de toxinas, adem�s de incluir infusiones antioxidantes como t� verde para fortalecer el organismo.          " +
                                                  "\n POSIBLE TRATAMIENTO: Dependiendo del tipo de c�ncer, el tratamiento puede incluir quimioterapia, radioterapia, inmunoterapia  " +
                                                  "\n o cirug�a. Se utilizan medicamentos como el paclitaxel y el cisplatino para combatir el crecimiento celular anormal. Marcas   " +
                                                  "\n reconocidas que contienen estos medicamentos incluyen Taxol y Platinol. Tambi�n pueden recetarse f�rmacos de soporte como el  " +
                                                  "\n ondansetr�n para controlar las n�useas, con marcas como Zofran y Emeset. ALIMENTACI�N: Se recomienda consumir alimentos ricos " +
                                                  "\n en antioxidantes y propiedades anticancer�genas que ayuden a fortalecer el sistema inmunol�gico, tales como frutos rojos      " +
                                                  "\n (ar�ndanos, fresas) con antioxidantes que protegen las c�lulas, c�rcuma con propiedades antiinflamatorias, br�coli con        " +
                                                  "\n sulforafano que ayuda a eliminar c�lulas da�adas, y zanahorias con betacarotenos que fortalecen la respuesta inmune.          " +
                                                  "\n Por ejemplo, 100 gramos de br�coli contienen aproximadamente 89 mg de vitamina C, lo que equivale al 99% de la ingesta        " +
                                                  "\n diaria recomendada para un adulto. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello se recomienda realizar m�s" +
                                                  "\n de un diagn�stico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente, adem�s por su salud si  " +
                                                  "\n la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico, �ngel L. Montes agradece tu visita " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            } 
                        }
                        if(EstaturaMasculino.equals("1.45-1.60 m")){
                           if(Enfermedad.equals("Fiebre alta, Fatiga, Tos seca, Dolor muscular, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Influenza(Gripe)." +
                                                  "\n Es una infecci�n viral que afecta el sistema respiratorio, causando fiebre, tos, dolor muscular y fatiga. EJERCICIO: Se recomienda    " +
                                                  "\n actividad f�sica moderada como caminatas de 20 a 30 minutos diarios para mejorar la circulaci�n y fortalecer el sistema inmunol�gico, " +
                                                  "\n evitando esfuerzos intensos que puedan agravar los s�ntomas. HIDRATACI�N: Es fundamental consumir al menos 2.5 litros de agua al d�a  " +
                                                  "\n (diez vasos de tama�o regular) para mantener la hidrataci�n y ayudar a la eliminaci�n de toxinas, adem�s de incluir infusiones tibias " +
                                                  "\n y caldos para aliviar la garganta. POSIBLE TRATAMIENTO: Se pueden utilizar antivirales como el oseltamivir y el zanamivir para        " +
                                                  "\n reducir la duraci�n y gravedad de la enfermedad. Marcas reconocidas que contienen estos medicamentos incluyen Tamiflu y Relenza.      " +
                                                  "\n Tambi�n pueden recetarse analg�sicos como el paracetamol para aliviar la fiebre y el malestar, con marcas como Tempra y Tylenol.      " +
                                                  "\n ALIMENTACI�N: Se recomienda consumir alimentos ricos en antioxidantes y propiedades antivirales que ayuden a fortalecer el sistema    " +
                                                  "\n inmunol�gico, tales como c�tricos (naranjas, limones, toronjas) con vitamina C, miel con propiedades antibacterianas, jengibre        " +
                                                  "\n con efectos antiinflamatorios naturales y ajo con propiedades antimicrobianas. Por ejemplo, 100 gramos de naranja contienen           " +
                                                  "\n aproximadamente 53 mg de vitamina C, lo que equivale al 88% de la ingesta diaria recomendada para un adulto. Este es solo un          " +
                                                  "\n diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las           " +
                                                  "\n respuestas sean completamente correctas, para ello se recomienda realizar m�s de un diagn�stico en Mi Vida para establecer            " +
                                                  "\n mayor seguridad en el tratamiento adecuado del paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface          " +
                                                  "\n del todo se recomienda consultar a su m�dico, �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, Fatiga, Tos con flema, Dolor en el pecho, Dificultad para respirar.")){
                               textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Neumon�a." +
                                                  "\n Es una infecci�n pulmonar que puede ser causada por bacterias, virus o hongos, provocando fiebre, tos con flema,     " +
                                                  "\n dificultad para respirar y dolor tor�cico. EJERCICIO: Se recomienda actividad f�sica ligera como caminatas suaves    " +
                                                  "\n de 15 a 20 minutos diarios para mejorar la capacidad pulmonar y reducir la fatiga, evitando esfuerzos intensos       " +
                                                  "\n que puedan comprometer la respiraci�n. HIDRATACI�N: Es esencial consumir al menos 3 litros de agua al d�a (doce      " +
                                                  "\n vasos de tama�o regular) para mantener la hidrataci�n de las v�as respiratorias y facilitar la eliminaci�n de        " +
                                                  "\n secreciones, adem�s de incluir caldos y jugos naturales para fortalecer el sistema inmunol�gico. POSIBLE TRATAMIENTO:" +
                                                  "\n Se utilizan antibi�ticos como la amoxicilina y la azitromicina para combatir la infecci�n bacteriana. Marcas         " +
                                                  "\n reconocidas que contienen estos medicamentos incluyen Amoxil y Zithromax. Tambi�n pueden recetarse broncodilatadores " +
                                                  "\n como el salbutamol para mejorar la respiraci�n, con marcas como Ventolin y Aerolin. ALIMENTACI�N: Se recomienda      " +
                                                  "\n consumir alimentos ricos en antioxidantes y propiedades antiinflamatorias que ayuden a fortalecer el sistema         " +
                                                  "\n respiratorio, tales como frutos rojos (ar�ndanos, fresas) con antioxidantes que protegen las c�lulas, c�rcuma        " +
                                                  "\n con propiedades antiinflamatorias, y zanahorias con betacarotenos que fortalecen la respuesta inmune. Por ejemplo,   " +
                                                  "\n 100 gramos de zanahoria contienen aproximadamente 8.3 mg de betacarotenos, lo que equivale al 69% de la ingesta      " +
                                                  "\n diaria recomendada para un adulto. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no          " +
                                                  "\n garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas,          " +
                                                  "\n para ello se recomienda realizar m�s de un diagn�stico en Mi Vida para establecer mayor seguridad en el              " +
                                                  "\n tratamiento adecuado del paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del           " +
                                                  "\n todo se recomienda consultar a su m�dico, �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores."); 
                            }
                            if(Enfermedad.equals("Fatiga, Aumento en la frecuencia de orinar, Sed excesiva, Visi�n borrosa, P�rdida de peso.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Diabetes." +
                                                  "\n Es una enfermedad cr�nica caracterizada por niveles elevados de glucosa en sangre debido a la resistencia a la   " +
                                                  "\n insulina o la falta de producci�n de esta hormona. EJERCICIO: Se recomienda actividad f�sica regular como        " +
                                                  "\n caminatas de 30 a 45 minutos diarios, nataci�n o ejercicios de resistencia para mejorar la sensibilidad a        " +
                                                  "\n la insulina y controlar los niveles de glucosa. HIDRATACI�N: Es fundamental consumir al menos 2.5 litros de      " +
                                                  "\n agua al d�a (diez vasos de tama�o regular) para mantener la hidrataci�n celular y facilitar la eliminaci�n       " +
                                                  "\n de toxinas, adem�s de incluir infusiones sin az�car para mejorar el metabolismo. POSIBLE TRATAMIENTO: Se         " +
                                                  "\n utilizan medicamentos como la metformina y la insulina para controlar los niveles de glucosa en sangre.          " +
                                                  "\n Marcas reconocidas que contienen estos medicamentos incluyen Glucophage y Lantus. Tambi�n pueden recetarse       " +
                                                  "\n inhibidores de SGLT2 como la empagliflozina para mejorar la eliminaci�n de glucosa, con marcas como Jardiance    " +
                                                  "\n y Invokana. ALIMENTACI�N: Se recomienda consumir alimentos ricos en fibra y propiedades reguladoras de la        " +
                                                  "\n glucosa que ayuden a mejorar el metabolismo, tales como avena con fibra soluble para estabilizar los niveles     " +
                                                  "\n de az�car, frutos secos con grasas saludables para mejorar la sensibilidad a la insulina, espinacas con          " +
                                                  "\n antioxidantes y vitamina K, y zanahorias con betacarotenos que fortalecen la respuesta inmune. Por ejemplo,      " +
                                                  "\n 100 gramos de avena contienen aproximadamente 10 gramos de fibra, lo que equivale al 40% de la ingesta diaria    " +
                                                  "\n recomendada para un adulto. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza   " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello se   " +
                                                  "\n recomienda realizar m�s de un diagn�stico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado  " +
                                                  "\n del paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar" +
                                                  "\n a su m�dico, �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos persistente, Sibilancias (silbidos al respirar), Opresi�n en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Asma." +
                                                  "\n Es una enfermedad inflamatoria cr�nica de las v�as respiratorias que provoca dificultad para respirar, tos y sibilancias.       " +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada como caminatas de 30 minutos diarios, nataci�n o ejercicios de respiraci�n   " +
                                                  "\n para fortalecer los m�sculos respiratorios y mejorar la capacidad pulmonar, evitando ambientes con contaminaci�n o humo de      " +
                                                  "\n tabaco. HIDRATACI�N: Es fundamental consumir al menos 2.5 litros de agua al d�a (diez vasos de tama�o regular) para mantener    " +
                                                  "\n la hidrataci�n de las v�as respiratorias y facilitar la eliminaci�n de secreciones. POSIBLE TRATAMIENTO: Se utilizan            " +
                                                  "\n broncodilatadores de acci�n r�pida como el salbutamol y de acci�n prolongada como el formoterol para mejorar la respiraci�n,    " +
                                                  "\n adem�s de corticosteroides inhalados como la fluticasona para reducir la inflamaci�n pulmonar. Marcas reconocidas que           " +
                                                  "\n contienen estos medicamentos incluyen Ventolin, Aerolin, Seretide y Symbicort. Tambi�n pueden recetarse antihistam�nicos        " +
                                                  "\n en casos de asma al�rgica. ALIMENTACI�N: Se recomienda consumir alimentos ricos en antioxidantes y propiedades antiinflamatorias" +
                                                  "\n que ayuden a fortalecer el sistema respiratorio, tales como frutos rojos (ar�ndanos, fresas) con antioxidantes que              " +
                                                  "\n las c�lulas, c�rcuma con propiedades antiinflamatorias, y zanahorias con betacarotenos que fortalecen la respuesta inmune.      " +
                                                  "\n Por ejemplo, 100 gramos de zanahoria contienen aproximadamente 8.3 mg de betacarotenos, lo que equivale al 69% de la ingesta    " +
                                                  "\n diaria recomendada para un adulto. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100%   " +
                                                  "\n que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello se recomienda realizar      " +
                                                  "\n m�s de un diagn�stico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente, adem�s por su         " +
                                                  "\n salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico, �ngel L. Montes agradece    " +
                                                  "\n tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga extrema, P�rdida de peso, Ganglios linf�ticos inflamados, Erupci�n cut�nea (Diarrea).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer VIH/SIDA." +
                                                  "\n Es una infecci�n viral que afecta el sistema inmunol�gico, debilitando la capacidad del cuerpo para combatir enfermedades.   " +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica moderada como caminatas de 30 minutos diarios, yoga o ejercicios de resistencia    " +
                                                  "\n para mejorar la movilidad y reducir la fatiga, evitando esfuerzos excesivos que puedan comprometer el sistema inmunol�gico.  " +
                                                  "\n HIDRATACI�N: Es fundamental consumir al menos 2.5 a 3 litros de agua al d�a (diez a doce vasos de tama�o regular) para       " +
                                                  "\n mantener la hidrataci�n celular y facilitar la eliminaci�n de toxinas, adem�s de incluir infusiones antioxidantes como       " +
                                                  "\n t� verde para fortalecer el organismo. POSIBLE TRATAMIENTO: Se utilizan medicamentos antirretrovirales como el tenofovir     " +
                                                  "\n y el dolutegravir para controlar la replicaci�n del virus y mejorar la calidad de vida del paciente. Marcas reconocidas      " +
                                                  "\n que contienen estos medicamentos incluyen Truvada y Tivicay. Tambi�n pueden recetarse f�rmacos de soporte como el ondansetr�n" +
                                                  "\n para controlar las n�useas, con marcas como Zofran y Emeset. ALIMENTACI�N: Se recomienda consumir alimentos ricos en         " +
                                                  "\n antioxidantes y propiedades inmunomoduladoras que ayuden a fortalecer el sistema inmunol�gico, tales como frutos rojos       " +
                                                  "\n (ar�ndanos, fresas) con antioxidantes que protegen las c�lulas, c�rcuma con propiedades antiinflamatorias, br�coli con       " +
                                                  "\n sulforafano que ayuda a eliminar c�lulas da�adas, y zanahorias con betacarotenos que fortalecen la respuesta inmune.         " +
                                                  "\n Por ejemplo, 100 gramos de br�coli contienen aproximadamente 89 mg de vitamina C, lo que equivale al 99% de la ingesta       " +
                                                  "\n diaria recomendada para un adulto. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza        " +
                                                  "\n al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello se recomienda    " +
                                                  "\n realizar m�s de un diagn�stico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente, adem�s    " +
                                                  "\n por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico, �ngel L. Montes   " +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Secreci�n anormal, Dolor al orinar, Dolor abdominal bajo, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Gonorrea." +
                                                  "\n Es una infecci�n de transmisi�n sexual causada por la bacteria Neisseria gonorrhoeae, que afecta el tracto urinario     " +
                                                  "\n y reproductivo. EJERCICIO: Se recomienda actividad f�sica moderada como caminatas de 30 minutos diarios para mejorar    " +
                                                  "\n la circulaci�n y fortalecer el sistema inmunol�gico, evitando esfuerzos excesivos que puedan agravar la fatiga.         " +
                                                  "\n HIDRATACI�N: Es fundamental consumir al menos 2 litros de agua al d�a (ocho vasos de tama�o regular) para mantener      " +
                                                  "\n la hidrataci�n y ayudar a la eliminaci�n de toxinas, adem�s de incluir jugos naturales ricos en vitamina C para         " +
                                                  "\n fortalecer el sistema inmunol�gico. POSIBLE TRATAMIENTO: Se utilizan antibi�ticos como la ceftriaxona y la azitromicina " +
                                                  "\n para eliminar la infecci�n. Marcas reconocidas que contienen estos medicamentos incluyen Rocephin y Zithromax. Tambi�n  " +
                                                  "\n se recomienda evitar el contacto sexual hasta completar el tratamiento y realizar pruebas de seguimiento para confirmar " +
                                                  "\n la eliminaci�n de la bacteria. ALIMENTACI�N: Se recomienda consumir alimentos ricos en antioxidantes y propiedades      " +
                                                  "\n antibacterianas que ayuden a fortalecer el sistema inmunol�gico, tales como ajo con propiedades antimicrobianas, jengibre" +
                                                  "\n con efectos antiinflamatorios naturales, espinacas con antioxidantes y vitamina K, y zanahorias con betacarotenos que    " +
                                                  "\n fortalecen la respuesta inmune. Por ejemplo, 100 gramos de espinaca contienen aproximadamente 482 mcg de vitamina K, lo  " +
                                                  "\n que equivale al 402% de la ingesta diaria recomendada para un adulto. Este es solo un diagn�stico predeterminado l�gico, " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente   " +
                                                  "\n correctas, para ello se recomienda realizar m�s de un diagn�stico en Mi Vida para establecer mayor seguridad en el       " +
                                                  "\n tratamiento adecuado del paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se       " +
                                                  "\n recomienda consultar a su m�dico, �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Ganglios linf�ticos inflamados, �lceras o llagas dolorosas, Picaz�n o ardor, Dolor al orinar.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Herpes genital." +
                                                  "\n Es una infecci�n de transmisi�n sexual causada por el virus del herpes simple, que provoca ampollas dolorosas en la zona        " +
                                                  "\n genital. EJERCICIO: Se recomienda actividad f�sica moderada como caminatas de 30 minutos diarios para mejorar la circulaci�n    " +
                                                  "\n y fortalecer el sistema inmunol�gico, evitando esfuerzos excesivos que puedan agravar la fatiga. HIDRATACI�N: Es fundamental    " +
                                                  "\n consumir al menos 2 litros de agua al d�a (ocho vasos de tama�o regular) para mantener la hidrataci�n y ayudar a la recuperaci�n" +
                                                  "\n de la piel, adem�s de incluir infusiones antioxidantes como t� verde. POSIBLE TRATAMIENTO: Se utilizan antivirales como el      " +
                                                  "\n aciclovir y el valaciclovir para reducir la duraci�n y gravedad de los brotes. Marcas reconocidas que contienen estos           " +
                                                  "\n medicamentos incluyen Zovirax y Valtrex. Tambi�n pueden recetarse analg�sicos como el ibuprofeno para aliviar el dolor,         " +
                                                  "\n con marcas como Advil y Flanax. ALIMENTACI�N: Se recomienda consumir alimentos ricos en antioxidantes y propiedades             " +
                                                  "\n antivirales que ayuden a fortalecer el sistema inmunol�gico, tales como frutos rojos (ar�ndanos, fresas) con antioxidantes      " +
                                                  "\n que protegen las c�lulas, c�rcuma con propiedades antiinflamatorias, y ajo con propiedades antimicrobianas. Por ejemplo,        " +
                                                  "\n 100 gramos de fresas contienen aproximadamente 59 mg de vitamina C, lo que equivale al 98% de la ingesta diaria recomendada     " +
                                                  "\n para un adulto. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente      " +
                                                  "\n tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello se recomienda realizar m�s de un diagn�stico" +
                                                  "\n en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente, adem�s por su salud si la respuesta         " +
                                                  "\n del diagn�stico no le satisface del todo se recomienda consultar a su m�dico, �ngel L. Montes agradece tu visita a la           " +
                                                  "\n app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, �lceras indoloras, Erupci�n cut�nea, Dolor de cabeza, Ganglios linf�ticos inflamados.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer S�filis." +
                                                  "\n Es una infecci�n de transmisi�n sexual causada por la bacteria Treponema pallidum, que puede afectar m�ltiples �rganos     " +
                                                  "\n si no se trata a tiempo. EJERCICIO: Se recomienda actividad f�sica moderada como caminatas de 30 minutos diarios para      " +
                                                  "\n mejorar la circulaci�n y fortalecer el sistema inmunol�gico, evitando esfuerzos excesivos que puedan comprometer la        " +
                                                  "\n recuperaci�n. HIDRATACI�N: Es fundamental consumir al menos 2.5 litros de agua al d�a (diez vasos de tama�o regular)       " +
                                                  "\n para mantener la hidrataci�n celular y facilitar la eliminaci�n de toxinas, adem�s de incluir jugos naturales ricos        " +
                                                  "\n en vitamina C. POSIBLE TRATAMIENTO: Se utilizan antibi�ticos como la penicilina y la doxiciclina para eliminar la          " +
                                                  "\n infecci�n. Marcas reconocidas que contienen estos medicamentos incluyen Benzetacil y Vibramycin. Tambi�n pueden recetarse  " +
                                                  "\n analg�sicos para aliviar s�ntomas secundarios, con marcas como Advil y Tempra. ALIMENTACI�N: Se recomienda consumir        " +
                                                  "\n alimentos ricos en antioxidantes y propiedades antibacterianas que ayuden a fortalecer el sistema inmunol�gico, tales      " +
                                                  "\n como ajo con propiedades antimicrobianas, jengibre con efectos antiinflamatorios naturales, espinacas con antioxidantes    " +
                                                  "\n y vitamina K, y zanahorias con betacarotenos que fortalecen la respuesta inmune. Por ejemplo, 100 gramos de espinaca       " +
                                                  "\n contienen aproximadamente 482 mcg de vitamina K, lo que equivale al 402% de la ingesta diaria recomendada para un adulto.  " +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta      " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas, para ello se recomienda realizar m�s de un diagn�stico      " +
                                                  "\n en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente, adem�s por su salud si la respuesta    " +
                                                  "\n del diagn�stico no le satisface del todo se recomienda consultar a su m�dico, �ngel L. Montes agradece tu visita           " +
                                                  "\n a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, P�rdida de peso, Tos persistente, Sudores nocturnos (Diaforesis).")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tuberculosis (TB). " +
                                                  "\n Es una infecci�n bacteriana causada por Mycobacterium tuberculosis, que afecta principalmente los pulmones y puede      " +
                                                  "\n provocar tos persistente, fiebre y p�rdida de peso. EJERCICIO: Se recomienda actividad f�sica ligera como caminatas     " +
                                                  "\n suaves de 15 a 20 minutos diarios para mejorar la capacidad pulmonar y reducir la fatiga, evitando esfuerzos intensos   " +
                                                  "\n que puedan comprometer la respiraci�n. HIDRATACI�N: Es esencial consumir al menos 3 litros de agua al d�a (doce vasos   " +
                                                  "\n de tama�o regular) para mantener la hidrataci�n de las v�as respiratorias y facilitar la eliminaci�n de secreciones,    " +
                                                  "\n adem�s de incluir caldos y jugos naturales para fortalecer el sistema inmunol�gico. POSIBLE TRATAMIENTO: Se utilizan    " +
                                                  "\n antibi�ticos como la isoniazida y la rifampicina para combatir la infecci�n. Marcas reconocidas que contienen estos     " +
                                                  "\n medicamentos incluyen Rimactane y Laniazid. Tambi�n pueden recetarse broncodilatadores para mejorar la respiraci�n,     " +
                                                  "\n con marcas como Ventolin y Aerolin. ALIMENTACI�N: Se recomienda consumir alimentos ricos en antioxidantes y propiedades " +
                                                  "\n antiinflamatorias que ayuden a fortalecer el sistema respiratorio, tales como frutos rojos (ar�ndanos, fresas) con      " +
                                                  "\n antioxidantes que protegen las c�lulas, c�rcuma con propiedades antiinflamatorias, y zanahorias con betacarotenos que   " +
                                                  "\n fortalecen la respuesta inmune. Por ejemplo, 100 gramos de zanahoria contienen aproximadamente 8.3 mg de betacarotenos, " +
                                                  "\n lo que equivale al 69% de la ingesta diaria recomendada para un adulto. Este es solo un diagn�stico predeterminado l�gico," +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente  " +
                                                  "\n correctas, para ello se recomienda realizar m�s de un diagn�stico en Mi Vida para establecer mayor seguridad en el      " +
                                                  "\n tratamiento adecuado del paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se      " +
                                                  "\n recomienda consultar a su m�dico, �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");     
                            }
                            if(Enfermedad.equals("Fatiga, Dolor en las articulaciones, Rigidez, Hinchaz�n en las articulaciones, Movilidad reducida.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Artritis." +
                                                  "\n Es una enfermedad inflamatoria que afecta las articulaciones, causando dolor, rigidez y dificultad de movimiento.    " +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica de bajo impacto como nataci�n, yoga o caminatas moderadas de 30 minutos    " +
                                                  "\n diarios para fortalecer las articulaciones sin sobrecargarlas y mejorar la movilidad. HIDRATACI�N: Es fundamental    " +
                                                  "\n consumir al menos 2.5 litros de agua al d�a (diez vasos de tama�o regular) para mantener la lubricaci�n de las       " +
                                                  "\n articulaciones y reducir la inflamaci�n. POSIBLE TRATAMIENTO: Se utilizan f�rmacos antirreum�ticos modificadores     " +
                                                  "\n de la enfermedad (FAMEs) como el metotrexato y la sulfasalazina para reducir la inflamaci�n y el da�o articular.     " +
                                                  "\n Marcas reconocidas que contienen estos medicamentos incluyen Metoject y Salazopyrin. Tambi�n pueden recetarse        " +
                                                  "\n antiinflamatorios no esteroideos (AINEs) como el ibuprofeno y el naproxeno para aliviar el dolor, con marcas         " +
                                                  "\n como Advil y Flanax. ALIMENTACI�N: Se recomienda consumir alimentos ricos en antioxidantes y propiedades             " +
                                                  "\n antiinflamatorias que ayuden a fortalecer las articulaciones, tales como pescados grasos (salm�n, at�n, sardina)     " +
                                                  "\n con Omega-3, c�tricos (naranjas, limones, toronjas) con vitamina C, verduras de hoja verde (espinacas, kale, acelgas)" +
                                                  "\n con vitamina K, jengibre y c�rcuma con efectos antiinflamatorios naturales, y frutos secos (almendras, nueces) con   " +
                                                  "\n magnesio. Por ejemplo, 100 gramos de naranja contienen aproximadamente 53 mg de vitamina C, lo que equivale al 88%   " +
                                                  "\n de la ingesta diaria recomendada para un adulto. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado" +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para  " +
                                                  "\n ello se recomienda realizar m�s de un diagn�stico en Mi Vida para establecer mayor seguridad en el tratamiento       " +
                                                  "\n adecuado del paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda    " +
                                                  "\n consultar a su m�dico, �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Fatiga, Tos severa, Dificultad para respirar, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Tosferina." +
                                                  "\n Es una infecci�n bacteriana altamente contagiosa que afecta las v�as respiratorias, causando ataques de tos intensos    " +
                                                  "\n y persistentes. EJERCICIO: Se recomienda actividad f�sica moderada sin sobreesfuerzo, evitando ambientes fr�os o        " +
                                                  "\n contaminados que puedan agravar los s�ntomas, con caminatas ligeras de 20 a 30 minutos diarios para mejorar la          " +
                                                  "\n capacidad pulmonar. HIDRATACI�N: Es fundamental consumir al menos 2.5 litros de agua al d�a (diez vasos de tama�o       " +
                                                  "\n regular) para mantener las v�as respiratorias hidratadas y reducir la irritaci�n de la garganta, adem�s de incluir      " +
                                                  "\n infusiones tibias para aliviar la tos. POSIBLE TRATAMIENTO: Se utilizan antibi�ticos como la azitromicina y             " +
                                                  "\n claritromicina para combatir la infecci�n y reducir el periodo de contagio. Marcas reconocidas que contienen estos      " +
                                                  "\n medicamentos incluyen Zithromax y Klaricid. Tambi�n se pueden emplear medicamentos para aliviar la tos y la inflamaci�n," +
                                                  "\n como el paracetamol, con marcas como Tempra y Tylenol. ALIMENTACI�N: Se recomienda consumir alimentos que ayuden a      " +
                                                  "\n fortalecer el sistema inmunol�gico y reducir la inflamaci�n, tales como c�tricos (naranjas, limones, toronjas) con      " +
                                                  "\n vitamina C, miel con propiedades antibacterianas, jengibre con efectos antiinflamatorios naturales y ajo con propiedades" +
                                                  "\n antimicrobianas. Por ejemplo, 100 gramos de lim�n contienen aproximadamente 53 mg de vitamina C, lo que equivale al 88% " +
                                                  "\n de la ingesta diaria recomendada para un adulto. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado  " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello" +
                                                  "\n se recomienda realizar m�s de un diagn�stico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del  " +
                                                  "\n paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su     " +
                                                  "\n m�dico, �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Hinchaz�n de las gl�ndulas salivales, Dolor al masticar o tragar, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Paperas." +
                                                  "\n Es una infecci�n viral que causa inflamaci�n de las gl�ndulas salivales y puede afectar otras partes del cuerpo.    " +
                                                  "\n EJERCICIO: Se recomienda reposo y evitar actividades f�sicas intensas durante la fase aguda de la enfermedad,       " +
                                                  "\n retomando ejercicios ligeros como estiramientos y caminatas suaves una vez que los s�ntomas disminuyan.             " +
                                                  "\n HIDRATACI�N: Es importante consumir al menos 2 litros de agua al d�a (ocho vasos de tama�o regular) para mantener   " +
                                                  "\n la hidrataci�n y aliviar la inflamaci�n de las gl�ndulas, adem�s de incluir caldos y jugos naturales para facilitar " +
                                                  "\n la recuperaci�n. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico, pero se pueden utilizar analg�sicos como " +
                                                  "\n el ibuprofeno y paracetamol para reducir el dolor y la inflamaci�n. Marcas reconocidas que contienen estos          " +
                                                  "\n medicamentos incluyen Advil y Flanax para el ibuprofeno, y Tempra y Tylenol para el paracetamol. Tambi�n se         " +
                                                  "\n recomienda el uso de compresas fr�as en la zona afectada para aliviar la inflamaci�n y el dolor. ALIMENTACI�N:      " +
                                                  "\n Se recomienda consumir alimentos suaves y f�ciles de masticar que ayuden a reducir la inflamaci�n y fortalecer      " +
                                                  "\n el sistema inmunol�gico, tales como yogur con probi�ticos para mejorar la salud digestiva, papaya con enzimas que   " +
                                                  "\n facilitan la digesti�n y reducen la inflamaci�n, y espinacas con antioxidantes y vitamina K. Por ejemplo, 100 gramos" +
                                                  "\n de papaya contienen aproximadamente 60 mg de vitamina C, lo que equivale al 100% de la ingesta diaria recomendada   " +
                                                  "\n para un adulto. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el   " +
                                                  "\n paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello se recomienda realizar " +
                                                  "\n m�s de un diagn�stico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente, adem�s por" +
                                                  "\n su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico, �ngel L. Montes" +
                                                  "\n agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre leve, Erupci�n cut�nea, Dolor en las articulaciones, Conjuntivitis (ojos rojos), Dolor muscular.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Zika." +
                                                  "\n Es una infecci�n viral transmitida por mosquitos que puede causar fiebre, erupciones cut�neas y dolor muscular.      " +
                                                  "\n EJERCICIO: Se recomienda actividad f�sica ligera como yoga o caminatas suaves de 15 a 20 minutos diarios para        " +
                                                  "\n mejorar la circulaci�n y reducir la fatiga, evitando esfuerzos excesivos que puedan agravar los s�ntomas.            " +
                                                  "\n HIDRATACI�N: Es esencial consumir al menos 2.5 litros de agua al d�a (diez vasos de tama�o regular) para prevenir    " +
                                                  "\n la deshidrataci�n y ayudar a la eliminaci�n de toxinas, adem�s de incluir agua de coco y jugos naturales para reponer" +
                                                  "\n electrolitos. POSIBLE TRATAMIENTO: No existe un tratamiento espec�fico, pero se pueden utilizar analg�sicos como el  " +
                                                  "\n paracetamol para aliviar la fiebre y el dolor. Marcas reconocidas que contienen este medicamento incluyen Tempra y   " +
                                                  "\n Tylenol. Tambi�n se recomienda reposo y una adecuada hidrataci�n para facilitar la recuperaci�n. ALIMENTACI�N: Se    " +
                                                  "\n recomienda consumir alimentos ricos en antioxidantes y propiedades antiinflamatorias que ayuden a fortalecer el      " +
                                                  "\n sistema inmunol�gico, tales como frutos rojos (ar�ndanos, fresas) con antioxidantes que protegen las c�lulas, c�rcuma" +
                                                  "\n con propiedades antiinflamatorias, y zanahorias con betacarotenos que fortalecen la respuesta inmune. Por ejemplo,   " +
                                                  "\n 100 gramos de fresas contienen aproximadamente 59 mg de vitamina C, lo que equivale al 98% de la ingesta diaria      " +
                                                  "\n recomendada para un adulto. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al    " +
                                                  "\n 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello se recomienda" +
                                                  "\n realizar m�s de un diagn�stico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente,   " +
                                                  "\n adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico,    " +
                                                  "\n �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Diarrea acuosa severa, V�mitos, Deshidrataci�n, Dolor abdominal.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Rotavirus." +
                                                  "\n Es una infecci�n viral que causa gastroenteritis severa, provocando diarrea, v�mitos y fiebre. EJERCICIO: Se recomienda       " +
                                                  "\n actividad f�sica ligera como caminatas suaves de 15 a 20 minutos diarios para evitar la fatiga y mejorar la recuperaci�n,     " +
                                                  "\n evitando esfuerzos intensos que puedan agravar la deshidrataci�n. HIDRATACI�N: Es esencial consumir al menos 3 litros de      " +
                                                  "\n agua al d�a (doce vasos de tama�o regular) para reponer l�quidos perdidos por la diarrea y los v�mitos, adem�s de incluir     " +
                                                  "\n soluciones de rehidrataci�n oral como Pedialyte para equilibrar electrolitos. POSIBLE TRATAMIENTO: No existe un tratamiento   " +
                                                  "\n espec�fico, pero se recomienda el uso de soluciones de rehidrataci�n oral para prevenir la deshidrataci�n. Tambi�n pueden     " +
                                                  "\n utilizarse medicamentos para aliviar los s�ntomas, como el paracetamol para la fiebre y el dolor. Marcas reconocidas que      " +
                                                  "\n contienen estos medicamentos incluyen Tempra y Tylenol. ALIMENTACI�N: Se recomienda consumir alimentos f�ciles de digerir     " +
                                                  "\n y ricos en nutrientes esenciales para la recuperaci�n, tales como arroz blanco, pl�tanos ricos en potasio para reponer        " +
                                                  "\n electrolitos, zanahorias con betacarotenos que fortalecen el sistema digestivo, y yogur con probi�ticos para restaurar        " +
                                                  "\n la flora intestinal. Por ejemplo, 100 gramos de pl�tano contienen aproximadamente 358 mg de potasio, lo que equivale al       " +
                                                  "\n 8% de la ingesta diaria recomendada para un adulto. Este es solo un diagn�stico predeterminado l�gico, haberlo consultado     " +
                                                  "\n no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas, para ello      " +
                                                  "\n se recomienda realizar m�s de un diagn�stico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del        " +
                                                  "\n paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su m�dico,   " +
                                                  "\n �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor muscular, N�useas, Diarrea, Dolor de cabeza.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Listeria (Listeriosis)." +
                                                  "\n Es una infecci�n bacteriana causada por Listeria monocytogenes, que puede provocar fiebre, dolor muscular y s�ntomas    " +
                                                  "\n gastrointestinales. EJERCICIO: Se recomienda actividad f�sica moderada como caminatas de 30 minutos diarios para        " +
                                                  "\n mejorar la circulaci�n y fortalecer el sistema inmunol�gico, evitando esfuerzos excesivos que puedan agravar la fatiga. " +
                                                  "\n HIDRATACI�N: Es fundamental consumir al menos 2.5 litros de agua al d�a (diez vasos de tama�o regular) para mantener    " +
                                                  "\n la hidrataci�n y ayudar a la eliminaci�n de toxinas, adem�s de incluir caldos y jugos naturales para facilitar la       " +
                                                  "\n recuperaci�n. POSIBLE TRATAMIENTO: Se utilizan antibi�ticos como la ampicilina y la gentamicina para combatir la        " +
                                                  "\n infecci�n. Marcas reconocidas que contienen estos medicamentos incluyen Ampicilina MK y Gentamicina Normon. Tambi�n     " +
                                                  "\n se recomienda reposo y una adecuada hidrataci�n para facilitar la recuperaci�n. ALIMENTACI�N: Se recomienda consumir    " +
                                                  "\n alimentos ricos en antioxidantes y propiedades antibacterianas que ayuden a fortalecer el sistema inmunol�gico, tales   " +
                                                  "\n como ajo con propiedades antimicrobianas, jengibre con efectos antiinflamatorios naturales, espinacas con antioxidantes " +
                                                  "\n y vitamina K, y zanahorias con betacarotenos que fortalecen la respuesta inmune. Por ejemplo, 100 gramos de zanahoria   " +
                                                  "\n contienen aproximadamente 8.3 mg de betacarotenos, lo que equivale al 69% de la ingesta diaria recomendada para un adulto." +
                                                  "\n Este es solo un diagn�stico predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta   " +
                                                  "\n enfermedad ni que las respuestas sean completamente correctas, para ello se recomienda realizar m�s de un diagn�stico   " +
                                                  "\n en Mi Vida para establecer mayor seguridad en el tratamiento adecuado del paciente, adem�s por su salud si la respuesta " +
                                                  "\n del diagn�stico no le satisface del todo se recomienda consultar a su m�dico, �ngel L. Montes agradece tu visita a      " +
                                                  "\n la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Fatiga, Diarrea con sangre, Dolor abdominal, V�mitos.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Shigelosis." +
                                                  "\n Es una infecci�n bacteriana causada por Shigella, que afecta el sistema digestivo y provoca diarrea, fiebre y dolor    " +
                                                  "\n abdominal. EJERCICIO: Se recomienda actividad f�sica ligera como estiramientos y caminatas suaves de 15 a 20 minutos   " +
                                                  "\n diarios para mejorar la circulaci�n y reducir la fatiga, evitando esfuerzos intensos que puedan agravar los s�ntomas.  " +
                                                  "\n HIDRATACI�N: Es esencial consumir al menos 3 litros de agua al d�a (doce vasos de tama�o regular) para prevenir la     " +
                                                  "\n deshidrataci�n y ayudar a la eliminaci�n de toxinas, adem�s de incluir soluciones de rehidrataci�n oral para equilibrar" +
                                                  "\n electrolitos. POSIBLE TRATAMIENTO: Se utilizan antibi�ticos como la ciprofloxacina y la azitromicina para combatir la  " +
                                                  "\n infecci�n. Marcas reconocidas que contienen estos medicamentos incluyen Ciproxina y Zithromax. Tambi�n se recomienda   " +
                                                  "\n reposo y una adecuada hidrataci�n para facilitar la recuperaci�n. ALIMENTACI�N: Se recomienda consumir alimentos ricos " +
                                                  "\n en fibra y propiedades antibacterianas que ayuden a fortalecer el sistema digestivo, tales como arroz integral con fibra" +
                                                  "\n para mejorar la digesti�n, pl�tanos ricos en potasio para reponer electrolitos, yogur con probi�ticos para restaurar        " +
                                                  "\n la flora intestinal, y c�rcuma con propiedades antiinflamatorias. Por ejemplo, 100 gramos de yogur contienen aproximadamente" +
                                                  "\n 3.5 gramos de prote�na, lo que equivale al 7% de la ingesta diaria recomendada para un adulto. Este es solo un diagn�stico  " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas  " +
                                                  "\n sean completamente correctas, para ello se recomienda realizar m�s de un diagn�stico en Mi Vida para establecer mayor       " +
                                                  "\n seguridad en el tratamiento adecuado del paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface      " +
                                                  "\n del todo se recomienda consultar a su m�dico, �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga, Dificultad para respirar, Tos cr�nica, Producci�n excesiva de mucosidad, Dolor en el pecho.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Enfermedad pulmonar obstructiva cr�nica (EPOC)." +
                                                  "\n Es una afecci�n respiratoria cr�nica que causa dificultad para respirar debido a la obstrucci�n del flujo de aire en los          " +
                                                  "\n pulmones. EJERCICIO: Se recomienda actividad f�sica moderada como caminatas de 30 a 45 minutos diarios, nataci�n o ejercicios     " +
                                                  "\n de respiraci�n para fortalecer los m�sculos respiratorios y mejorar la capacidad pulmonar, evitando ambientes con contaminaci�n   " +
                                                  "\n o humo de tabaco. HIDRATACI�N: Es fundamental consumir al menos 2.5 litros de agua al d�a (diez vasos de tama�o regular) para     " +
                                                  "\n mantener la hidrataci�n de las v�as respiratorias y facilitar la eliminaci�n de secreciones. POSIBLE TRATAMIENTO: Se utilizan     " +
                                                  "\n broncodilatadores de acci�n prolongada como el salmeterol y el formoterol para mejorar la respiraci�n, adem�s de corticosteroides " +
                                                  "\n inhalados como la fluticasona para reducir la inflamaci�n pulmonar. Marcas reconocidas que contienen estos medicamentos incluyen  " +
                                                  "\n Seretide y Symbicort. Tambi�n pueden recetarse mucol�ticos como la acetilciste�na para facilitar la expulsi�n de flemas, con      " +
                                                  "\n marcas como Fluimucil y Bisolvon. ALIMENTACI�N: Se recomienda consumir alimentos ricos en antioxidantes y propiedades             " +
                                                  "\n antiinflamatorias que ayuden a fortalecer el sistema respiratorio, tales como frutos rojos (ar�ndanos, fresas) con                " +
                                                  "\n antioxidantes que protegen las c�lulas, c�rcuma con propiedades antiinflamatorias, y zanahorias con betacarotenos que             " +
                                                  "\n fortalecen la respuesta inmune. Por ejemplo, 100 gramos de zanahoria contienen aproximadamente 8.3 mg de betacarotenos,           " +
                                                  "\n lo que equivale al 69% de la ingesta diaria recomendada para un adulto. Este es solo un diagn�stico predeterminado l�gico,        " +
                                                  "\n haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente            " +
                                                  "\n correctas, para ello se recomienda realizar m�s de un diagn�stico en Mi Vida para establecer mayor seguridad en el tratamiento    " +
                                                  "\n adecuado del paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar       " +
                                                  "\n a su m�dico, �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre, Dolor al orinar, Secreci�n anormal, Dolor durante las relaciones sexuales, Dolor abdominal bajo.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Clamidia." +
                                                  "\n Es una infecci�n de transmisi�n sexual causada por la bacteria Chlamydia trachomatis, que puede afectar el sistema urinario  " +
                                                  "\n y reproductivo. EJERCICIO: Se recomienda actividad f�sica moderada como caminatas de 30 minutos diarios para mejorar la      " +
                                                  "\n circulaci�n y fortalecer el sistema inmunol�gico, evitando esfuerzos excesivos que puedan agravar la fatiga.                 " +
                                                  "\n HIDRATACI�N: Es fundamental consumir al menos 2 litros de agua al d�a (ocho vasos de tama�o regular) para mantener la        " +
                                                  "\n hidrataci�n y ayudar a la eliminaci�n de toxinas, adem�s de incluir jugos naturales ricos en vitamina C para fortalecer      " +
                                                  "\n el sistema inmunol�gico. POSIBLE TRATAMIENTO: Se utilizan antibi�ticos como la azitromicina y la doxiciclina para eliminar   " +
                                                  "\n la infecci�n. Marcas reconocidas que contienen estos medicamentos incluyen Zithromax y Vibramycin. Tambi�n se recomienda     " +
                                                  "\n evitar el contacto sexual hasta completar el tratamiento y realizar pruebas de seguimiento para confirmar la eliminaci�n     " +
                                                  "\n de la bacteria. ALIMENTACI�N: Se recomienda consumir alimentos ricos en antioxidantes y propiedades antibacterianas que      " +
                                                  "\n ayuden a fortalecer el sistema inmunol�gico, tales como ajo con propiedades antimicrobianas, jengibre con efectos            " +
                                                  "\n antiinflamatorios naturales, espinacas con antioxidantes y vitamina K, y zanahorias con betacarotenos que fortalecen         " +
                                                  "\n la respuesta inmune. Por ejemplo, 100 gramos de espinaca contienen aproximadamente 482 mcg de vitamina K, lo que equivale    " +
                                                  "\n al 402% de la ingesta diaria recomendada para un adulto. Este es solo un diagn�stico predeterminado l�gico, haberlo          " +
                                                  "\n consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente correctas,    " +
                                                  "\n para ello se recomienda realizar m�s de un diagn�stico en Mi Vida para establecer mayor seguridad en el tratamiento adecuado " +
                                                  "\n del paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a su      " +
                                                  "\n m�dico, �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fiebre alta, N�useas, Dolor de cabeza severo, Rigidez en el cuello, Confusi�n.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer Meningitis bacteriana." +
                                                  "\n Es una infecci�n grave que causa inflamaci�n de las membranas que rodean el cerebro y la m�dula espinal, pudiendo provocar  " +
                                                  "\n fiebre alta, rigidez en el cuello y alteraciones neurol�gicas. EJERCICIO: Se recomienda reposo absoluto durante la fase     " +
                                                  "\n aguda de la enfermedad, retomando actividad f�sica ligera como caminatas suaves de 15 a 20 minutos diarios una vez que      " +
                                                  "\n los s�ntomas disminuyan para mejorar la circulaci�n y la recuperaci�n. HIDRATACI�N: Es esencial consumir al menos 3 litros  " +
                                                  "\n de agua al d�a (doce vasos de tama�o regular) para prevenir la deshidrataci�n y ayudar a la eliminaci�n de toxinas, adem�s  " +
                                                  "\n de incluir caldos y jugos naturales para facilitar la recuperaci�n. POSIBLE TRATAMIENTO: Se utilizan antibi�ticos           " +
                                                  "\n intravenosos como la ceftriaxona y la vancomicina para combatir la infecci�n. Marcas reconocidas que contienen estos        " +
                                                  "\n medicamentos incluyen Rocephin y Vancocin. Tambi�n pueden recetarse corticosteroides como la dexametasona para reducir      " +
                                                  "\n la inflamaci�n cerebral, con marcas como Decadron y Maxidex. ALIMENTACI�N: Se recomienda consumir alimentos ricos en        " +
                                                  "\n antioxidantes y propiedades antiinflamatorias que ayuden a fortalecer el sistema inmunol�gico, tales como frutos rojos      " +
                                                  "\n (ar�ndanos, fresas) con antioxidantes que protegen las c�lulas, c�rcuma con propiedades antiinflamatorias, y zanahorias     " +
                                                  "\n con betacarotenos que fortalecen la respuesta inmune. Por ejemplo, 100 gramos de fresas contienen aproximadamente 59 mg     " +
                                                  "\n de vitamina C, lo que equivale al 98% de la ingesta diaria recomendada para un adulto. Este es solo un diagn�stico          " +
                                                  "\n predeterminado l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas  " +
                                                  "\n sean completamente correctas, para ello se recomienda realizar m�s de un diagn�stico en Mi Vida para establecer mayor       " +
                                                  "\n seguridad en el tratamiento adecuado del paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface      " +
                                                  "\n del todo se recomienda consultar a su m�dico, �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                            if(Enfermedad.equals("Fatiga extrema, P�rdida de peso inexplicable, Dolor persistente, Cambios en la piel o lunares, P�rdida de apetito.")){
                                textarea1.setText("\n El paciente " + nombrePaciente + " de Sexo " + Sexo + " de edad entre " + EdadMasculino +
                                                  "\n con estatura entre " + EstaturaMasculino + ", que afirma padece los sintomas de " + Enfermedad +
                                                  "\n Tiene gran posibilidad de contraer C�ncer." +
                                                  "\n Es una enfermedad caracterizada por el crecimiento descontrolado de c�lulas anormales en el cuerpo, pudiendo afectar distintos   " +
                                                  "\n �rganos y sistemas. EJERCICIO: Se recomienda actividad f�sica moderada adaptada a la condici�n del paciente, como caminatas de   " +
                                                  "\n 30 minutos diarios, yoga o ejercicios de resistencia para mejorar la movilidad y reducir la fatiga, evitando esfuerzos excesivos " +
                                                  "\n que puedan comprometer el sistema inmunol�gico. HIDRATACI�N: Es fundamental consumir al menos 2.5 a 3 litros de agua al d�a      " +
                                                  "\n (diez a doce vasos de tama�o regular) para mantener la hidrataci�n celular y facilitar la eliminaci�n de toxinas, adem�s de      " +
                                                  "\n incluir infusiones antioxidantes como t� verde para fortalecer el organismo. POSIBLE TRATAMIENTO: Dependiendo del tipo de c�ncer," +
                                                  "\n el tratamiento puede incluir quimioterapia, radioterapia, inmunoterapia o cirug�a. Se utilizan medicamentos como el paclitaxel   " +
                                                  "\n y el cisplatino para combatir el crecimiento celular anormal. Marcas reconocidas que contienen estos medicamentos incluyen Taxol " +
                                                  "\n y Platinol. Tambi�n pueden recetarse f�rmacos de soporte como el ondansetr�n para controlar las n�useas, con marcas como Zofran  " +
                                                  "\n y Emeset. ALIMENTACI�N: Se recomienda consumir alimentos ricos en antioxidantes y propiedades anticancer�genas que ayuden a      " +
                                                  "\n fortalecer el sistema inmunol�gico, tales como frutos rojos (ar�ndanos, fresas) con antioxidantes que protegen las c�lulas,      " +
                                                  "\n c�rcuma con propiedades antiinflamatorias, br�coli con sulforafano que ayuda a eliminar c�lulas da�adas, y zanahorias con        " +
                                                  "\n betacarotenos que fortalecen la respuesta inmune. Por ejemplo, 100 gramos de br�coli contienen aproximadamente 89 mg de          " +
                                                  "\n vitamina C, lo que equivale al 99% de la ingesta diaria recomendada para un adulto. Este es solo un diagn�stico predeterminado   " +
                                                  "\n l�gico, haberlo consultado no garantiza al 100% que el paciente tenga esta enfermedad ni que las respuestas sean completamente   " +
                                                  "\n correctas, para ello se recomienda realizar m�s de un diagn�stico en Mi Vida para establecer mayor seguridad en el tratamiento   " +
                                                  "\n adecuado del paciente, adem�s por su salud si la respuesta del diagn�stico no le satisface del todo se recomienda consultar a    " +
                                                  "\n su m�dico, �ngel L. Montes agradece tu visita a la app (Mi Vida) y espera que te mejores.");
                            }
                        }
                    }
                }
        if (EdadMasculino.equals("Juventud = 22-29 a�os")) {
            frame.setVisible(true);
        } else {
            frame.setVisible(false);
        }
        }
        public Estudio4() {
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
        Estudio4 ventanaEstudio4 = new Estudio4();
        ventanaEstudio4.crearInterfaz();
    }
}